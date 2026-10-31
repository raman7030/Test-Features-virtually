package net.engio.mbassy.listener;

import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes.dex */
public class Filters {

    public final class RejectSubtypes implements IMessageFilter {
        @Override // net.engio.mbassy.listener.IMessageFilter
        public boolean accepts(Object obj, SubscriptionContext subscriptionContext) {
            for (Class cls : subscriptionContext.getHandler().getHandledMessages()) {
                if (cls.equals(obj.getClass())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class SubtypesOnly implements IMessageFilter {
        @Override // net.engio.mbassy.listener.IMessageFilter
        public boolean accepts(Object obj, SubscriptionContext subscriptionContext) {
            for (Class cls : subscriptionContext.getHandler().getHandledMessages()) {
                if (cls.isAssignableFrom(obj.getClass()) && !cls.equals(obj.getClass())) {
                    return true;
                }
            }
            return false;
        }
    }
}
