package net.engio.mbassy.dispatch;

import java.util.Iterator;
import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.AbstractSubscriptionContextAware;
import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes.dex */
public class MessageDispatcher extends AbstractSubscriptionContextAware implements IMessageDispatcher {
    public final IHandlerInvocation invocation;

    public MessageDispatcher(SubscriptionContext subscriptionContext, IHandlerInvocation iHandlerInvocation) {
        super(subscriptionContext);
        this.invocation = iHandlerInvocation;
    }

    @Override // net.engio.mbassy.dispatch.IMessageDispatcher
    public void dispatch(MessagePublication messagePublication, Object obj, Iterable iterable) {
        messagePublication.markDispatched();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            getInvocation().invoke(it.next(), obj, messagePublication);
        }
    }

    @Override // net.engio.mbassy.dispatch.IMessageDispatcher
    public IHandlerInvocation getInvocation() {
        return this.invocation;
    }
}
