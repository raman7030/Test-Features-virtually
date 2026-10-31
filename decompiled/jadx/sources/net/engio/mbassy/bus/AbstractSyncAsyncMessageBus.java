package net.engio.mbassy.bus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import net.engio.mbassy.bus.common.IMessageBus;
import net.engio.mbassy.bus.config.ConfigurationError;
import net.engio.mbassy.bus.config.Feature;
import net.engio.mbassy.bus.config.IBusConfiguration;
import net.engio.mbassy.bus.error.InternalPublicationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSyncAsyncMessageBus extends AbstractPubSubSupport implements IMessageBus {
    public final List dispatchers;
    public final ExecutorService executor;
    public final BlockingQueue pendingMessages;

    public AbstractSyncAsyncMessageBus(IBusConfiguration iBusConfiguration) {
        super(iBusConfiguration);
        Feature.AsynchronousMessageDispatch asynchronousMessageDispatch = (Feature.AsynchronousMessageDispatch) iBusConfiguration.getFeature(Feature.AsynchronousMessageDispatch.class);
        if (asynchronousMessageDispatch == null) {
            throw ConfigurationError.MissingFeature(Feature.AsynchronousMessageDispatch.class);
        }
        this.pendingMessages = asynchronousMessageDispatch.getMessageQueue();
        this.dispatchers = new ArrayList(asynchronousMessageDispatch.getNumberOfMessageDispatchers());
        initDispatcherThreads(asynchronousMessageDispatch);
        Feature.AsynchronousHandlerInvocation asynchronousHandlerInvocation = (Feature.AsynchronousHandlerInvocation) iBusConfiguration.getFeature(Feature.AsynchronousHandlerInvocation.class);
        if (asynchronousHandlerInvocation == null) {
            throw ConfigurationError.MissingFeature(Feature.AsynchronousHandlerInvocation.class);
        }
        ExecutorService executor = asynchronousHandlerInvocation.getExecutor();
        this.executor = executor;
        getRuntime().add(IBusConfiguration.Properties.AsynchronousHandlerExecutor, executor);
    }

    private void initDispatcherThreads(Feature.AsynchronousMessageDispatch asynchronousMessageDispatch) {
        for (int i = 0; i < asynchronousMessageDispatch.getNumberOfMessageDispatchers(); i++) {
            Thread threadNewThread = asynchronousMessageDispatch.getDispatcherThreadFactory().newThread(new Runnable() { // from class: net.engio.mbassy.bus.AbstractSyncAsyncMessageBus.1
                @Override // java.lang.Runnable
                public void run() {
                    IMessagePublication iMessagePublication;
                    Throwable th;
                    while (true) {
                        try {
                            try {
                                iMessagePublication = (IMessagePublication) AbstractSyncAsyncMessageBus.this.pendingMessages.take();
                                try {
                                    iMessagePublication.execute();
                                } catch (Throwable th2) {
                                    th = th2;
                                    AbstractSyncAsyncMessageBus.this.handlePublicationError(new InternalPublicationError(th, "Error in asynchronous dispatch", iMessagePublication));
                                }
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        } catch (Throwable th3) {
                            iMessagePublication = null;
                            th = th3;
                        }
                    }
                }
            });
            threadNewThread.setName("MsgDispatcher-" + i);
            this.dispatchers.add(threadNewThread);
            threadNewThread.start();
        }
    }

    public IMessagePublication addAsynchronousPublication(MessagePublication messagePublication) {
        try {
            this.pendingMessages.put(messagePublication);
            return messagePublication.markScheduled();
        } catch (InterruptedException e) {
            handlePublicationError(new InternalPublicationError(e, "Error while adding an asynchronous message publication", messagePublication));
            return messagePublication;
        }
    }

    public IMessagePublication addAsynchronousPublication(MessagePublication messagePublication, long j, TimeUnit timeUnit) {
        try {
            return this.pendingMessages.offer(messagePublication, j, timeUnit) ? messagePublication.markScheduled() : messagePublication;
        } catch (InterruptedException e) {
            handlePublicationError(new InternalPublicationError(e, "Error while adding an asynchronous message publication", messagePublication));
            return messagePublication;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        shutdown();
    }

    @Override // net.engio.mbassy.bus.common.IMessageBus
    public void shutdown() {
        Iterator it = this.dispatchers.iterator();
        while (it.hasNext()) {
            ((Thread) it.next()).interrupt();
        }
        ExecutorService executorService = this.executor;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // net.engio.mbassy.bus.common.IMessageBus
    public boolean hasPendingMessages() {
        return this.pendingMessages.size() > 0;
    }
}
