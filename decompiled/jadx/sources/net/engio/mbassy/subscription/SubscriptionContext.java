package net.engio.mbassy.subscription;

import java.util.Collection;
import java.util.Iterator;
import net.engio.mbassy.bus.BusRuntime;
import net.engio.mbassy.bus.common.RuntimeProvider;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionContext implements RuntimeProvider {
    public final Collection errorHandlers;
    public final MessageHandler handler;
    public final BusRuntime runtime;

    public SubscriptionContext(BusRuntime busRuntime, MessageHandler messageHandler, Collection collection) {
        this.runtime = busRuntime;
        this.handler = messageHandler;
        this.errorHandlers = collection;
    }

    public MessageHandler getHandler() {
        return this.handler;
    }

    public Collection getErrorHandlers() {
        return this.errorHandlers;
    }

    @Override // net.engio.mbassy.bus.common.RuntimeProvider
    public BusRuntime getRuntime() {
        return this.runtime;
    }

    public final void handleError(PublicationError publicationError) {
        Iterator it = this.errorHandlers.iterator();
        while (it.hasNext()) {
            ((IPublicationErrorHandler) it.next()).handleError(publicationError);
        }
    }
}
