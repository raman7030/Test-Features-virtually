package net.engio.mbassy.listener;

import net.engio.mbassy.subscription.SubscriptionContext;

/* JADX INFO: loaded from: classes.dex */
public interface IMessageFilter {
    boolean accepts(Object obj, SubscriptionContext subscriptionContext);
}
