package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.ISubscriptionContextAware;

/* JADX INFO: loaded from: classes.dex */
public interface IHandlerInvocation extends ISubscriptionContextAware {
    void invoke(Object obj, Object obj2, MessagePublication messagePublication);
}
