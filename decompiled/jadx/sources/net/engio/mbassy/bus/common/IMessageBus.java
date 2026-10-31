package net.engio.mbassy.bus.common;

import net.engio.mbassy.bus.publication.ISyncAsyncPublicationCommand;

/* JADX INFO: loaded from: classes2.dex */
public interface IMessageBus extends GenericMessagePublicationSupport {
    boolean hasPendingMessages();

    @Override // net.engio.mbassy.bus.common.GenericMessagePublicationSupport
    ISyncAsyncPublicationCommand post(Object obj);

    void shutdown();
}
