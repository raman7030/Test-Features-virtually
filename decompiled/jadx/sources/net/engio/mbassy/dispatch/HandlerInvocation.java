package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.subscription.AbstractSubscriptionContextAware;
import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class HandlerInvocation extends AbstractSubscriptionContextAware implements IHandlerInvocation {
    public HandlerInvocation(SubscriptionContext subscriptionContext) {
        super(subscriptionContext);
    }

    public final void handlePublicationError(MessagePublication messagePublication, PublicationError publicationError) {
        messagePublication.markError(publicationError);
        getContext().handleError(publicationError);
    }
}
