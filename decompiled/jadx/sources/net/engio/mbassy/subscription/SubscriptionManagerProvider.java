package net.engio.mbassy.subscription;

import net.engio.mbassy.bus.BusRuntime;
import net.engio.mbassy.listener.MetadataReader;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionManagerProvider implements ISubscriptionManagerProvider {
    @Override // net.engio.mbassy.subscription.ISubscriptionManagerProvider
    public SubscriptionManager createManager(MetadataReader metadataReader, SubscriptionFactory subscriptionFactory, BusRuntime busRuntime) {
        return new SubscriptionManager(metadataReader, subscriptionFactory, busRuntime);
    }
}
