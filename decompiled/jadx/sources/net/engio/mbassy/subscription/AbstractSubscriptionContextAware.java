package net.engio.mbassy.subscription;

/* JADX INFO: loaded from: classes.dex */
public class AbstractSubscriptionContextAware implements ISubscriptionContextAware {
    public final SubscriptionContext context;

    public AbstractSubscriptionContextAware(SubscriptionContext subscriptionContext) {
        this.context = subscriptionContext;
    }

    @Override // net.engio.mbassy.subscription.ISubscriptionContextAware
    public final SubscriptionContext getContext() {
        return this.context;
    }
}
