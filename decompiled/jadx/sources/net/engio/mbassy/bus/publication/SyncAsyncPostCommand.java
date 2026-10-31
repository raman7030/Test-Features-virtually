package net.engio.mbassy.bus.publication;

import java.util.concurrent.TimeUnit;
import net.engio.mbassy.bus.IMessagePublication;
import net.engio.mbassy.bus.MBassador;

/* JADX INFO: loaded from: classes.dex */
public class SyncAsyncPostCommand implements ISyncAsyncPublicationCommand {
    public MBassador mBassador;
    public Object message;

    public SyncAsyncPostCommand(MBassador mBassador, Object obj) {
        this.mBassador = mBassador;
        this.message = obj;
    }

    @Override // net.engio.mbassy.bus.publication.IPublicationCommand
    public IMessagePublication now() {
        return this.mBassador.publish(this.message);
    }

    @Override // net.engio.mbassy.bus.publication.ISyncAsyncPublicationCommand
    public IMessagePublication asynchronously() {
        return this.mBassador.publishAsync(this.message);
    }

    @Override // net.engio.mbassy.bus.publication.ISyncAsyncPublicationCommand
    public IMessagePublication asynchronously(long j, TimeUnit timeUnit) {
        return this.mBassador.publishAsync(this.message, j, timeUnit);
    }
}
