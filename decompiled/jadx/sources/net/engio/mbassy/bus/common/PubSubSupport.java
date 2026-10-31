package net.engio.mbassy.bus.common;

import net.engio.mbassy.bus.IMessagePublication;

/* JADX INFO: loaded from: classes.dex */
public interface PubSubSupport extends RuntimeProvider {
    IMessagePublication publish(Object obj);

    void subscribe(Object obj);

    boolean unsubscribe(Object obj);
}
