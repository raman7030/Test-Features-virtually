package net.engio.mbassy.dispatch;

import net.engio.mbassy.subscription.AbstractSubscriptionContextAware;

/* JADX INFO: loaded from: classes.dex */
public abstract class DelegatingMessageDispatcher extends AbstractSubscriptionContextAware implements IMessageDispatcher {
    public final IMessageDispatcher delegate;

    public DelegatingMessageDispatcher(IMessageDispatcher iMessageDispatcher) {
        super(iMessageDispatcher.getContext());
        this.delegate = iMessageDispatcher;
    }

    public IMessageDispatcher getDelegate() {
        return this.delegate;
    }

    @Override // net.engio.mbassy.dispatch.IMessageDispatcher
    public IHandlerInvocation getInvocation() {
        return this.delegate.getInvocation();
    }
}
