package net.engio.mbassy.bus.publication;

import java.util.concurrent.TimeUnit;
import net.engio.mbassy.bus.IMessagePublication;

/* JADX INFO: loaded from: classes.dex */
public interface ISyncAsyncPublicationCommand extends IPublicationCommand {
    IMessagePublication asynchronously();

    IMessagePublication asynchronously(long j, TimeUnit timeUnit);
}
