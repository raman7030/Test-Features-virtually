package net.engio.mbassy.bus.config;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.listener.MetadataReader;
import net.engio.mbassy.subscription.ISubscriptionManagerProvider;
import net.engio.mbassy.subscription.SubscriptionFactory;
import net.engio.mbassy.subscription.SubscriptionManagerProvider;

/* JADX INFO: loaded from: classes.dex */
public interface Feature {

    public class SyncPubSub implements Feature {
        public MetadataReader metadataReader;
        public MessagePublication.Factory publicationFactory;
        public SubscriptionFactory subscriptionFactory;
        public ISubscriptionManagerProvider subscriptionManagerProvider;

        public static final SyncPubSub Default() {
            return new SyncPubSub().setMetadataReader(new MetadataReader()).setPublicationFactory(new MessagePublication.Factory()).setSubscriptionFactory(new SubscriptionFactory()).setSubscriptionManagerProvider(new SubscriptionManagerProvider());
        }

        public ISubscriptionManagerProvider getSubscriptionManagerProvider() {
            return this.subscriptionManagerProvider;
        }

        public SyncPubSub setSubscriptionManagerProvider(ISubscriptionManagerProvider iSubscriptionManagerProvider) {
            this.subscriptionManagerProvider = iSubscriptionManagerProvider;
            return this;
        }

        public SubscriptionFactory getSubscriptionFactory() {
            return this.subscriptionFactory;
        }

        public SyncPubSub setSubscriptionFactory(SubscriptionFactory subscriptionFactory) {
            this.subscriptionFactory = subscriptionFactory;
            return this;
        }

        public MetadataReader getMetadataReader() {
            return this.metadataReader;
        }

        public SyncPubSub setMetadataReader(MetadataReader metadataReader) {
            this.metadataReader = metadataReader;
            return this;
        }

        public MessagePublication.Factory getPublicationFactory() {
            return this.publicationFactory;
        }

        public SyncPubSub setPublicationFactory(MessagePublication.Factory factory) {
            this.publicationFactory = factory;
            return this;
        }
    }

    public class AsynchronousHandlerInvocation implements Feature {
        public static final ThreadFactory MessageHandlerThreadFactory = new ThreadFactory() { // from class: net.engio.mbassy.bus.config.Feature.AsynchronousHandlerInvocation.1
            public final AtomicInteger threadID = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("AsyncHandler-" + this.threadID.getAndIncrement());
                threadNewThread.setDaemon(true);
                return threadNewThread;
            }
        };
        public ExecutorService executor;

        public static final AsynchronousHandlerInvocation Default() {
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            return Default(iAvailableProcessors, iAvailableProcessors * 2);
        }

        public static final AsynchronousHandlerInvocation Default(int i, int i2) {
            return new AsynchronousHandlerInvocation().setExecutor(new ThreadPoolExecutor(i, i2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), MessageHandlerThreadFactory));
        }

        public ExecutorService getExecutor() {
            return this.executor;
        }

        public AsynchronousHandlerInvocation setExecutor(ExecutorService executorService) {
            this.executor = executorService;
            return this;
        }
    }

    public class AsynchronousMessageDispatch implements Feature {
        public static final ThreadFactory MessageDispatchThreadFactory = new ThreadFactory() { // from class: net.engio.mbassy.bus.config.Feature.AsynchronousMessageDispatch.1
            public final AtomicInteger threadID = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setDaemon(true);
                threadNewThread.setName("Dispatcher-" + this.threadID.getAndIncrement());
                return threadNewThread;
            }
        };
        public ThreadFactory dispatcherThreadFactory;
        public BlockingQueue messageQueue;
        public int numberOfMessageDispatchers;

        public static final AsynchronousMessageDispatch Default() {
            return new AsynchronousMessageDispatch().setNumberOfMessageDispatchers(2).setDispatcherThreadFactory(MessageDispatchThreadFactory).setMessageQueue(new LinkedBlockingQueue(Integer.MAX_VALUE));
        }

        public int getNumberOfMessageDispatchers() {
            return this.numberOfMessageDispatchers;
        }

        public AsynchronousMessageDispatch setNumberOfMessageDispatchers(int i) {
            this.numberOfMessageDispatchers = i;
            return this;
        }

        public BlockingQueue getMessageQueue() {
            return this.messageQueue;
        }

        public AsynchronousMessageDispatch setMessageQueue(BlockingQueue blockingQueue) {
            this.messageQueue = blockingQueue;
            return this;
        }

        public ThreadFactory getDispatcherThreadFactory() {
            return this.dispatcherThreadFactory;
        }

        public AsynchronousMessageDispatch setDispatcherThreadFactory(ThreadFactory threadFactory) {
            this.dispatcherThreadFactory = threadFactory;
            return this;
        }
    }
}
