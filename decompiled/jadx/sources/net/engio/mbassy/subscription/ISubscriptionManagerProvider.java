package net.engio.mbassy.subscription;

import net.engio.mbassy.bus.BusRuntime;
import net.engio.mbassy.listener.MetadataReader;

/* JADX INFO: loaded from: classes.dex */
public interface ISubscriptionManagerProvider {
    SubscriptionManager createManager(MetadataReader metadataReader, SubscriptionFactory subscriptionFactory, BusRuntime busRuntime);
}
