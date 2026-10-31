package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.AbstractSubscriptionContextAware;

/* JADX INFO: loaded from: classes.dex */
public class SynchronizedHandlerInvocation extends AbstractSubscriptionContextAware implements IHandlerInvocation {
    public IHandlerInvocation delegate;

    public SynchronizedHandlerInvocation(IHandlerInvocation iHandlerInvocation) {
        super(iHandlerInvocation.getContext());
        this.delegate = iHandlerInvocation;
    }

    @Override // net.engio.mbassy.dispatch.IHandlerInvocation
    public void invoke(Object obj, Object obj2, MessagePublication messagePublication) {
        synchronized (obj) {
            this.delegate.invoke(obj, obj2, messagePublication);
        }
    }
}
