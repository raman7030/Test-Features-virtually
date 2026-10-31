package net.engio.mbassy.bus.error;

import net.engio.mbassy.bus.IMessagePublication;

/* JADX INFO: loaded from: classes.dex */
public class InternalPublicationError extends PublicationError {
    public InternalPublicationError(Throwable th, String str, IMessagePublication iMessagePublication) {
        super(th, str, iMessagePublication);
    }

    public InternalPublicationError(Throwable th, String str) {
        super(th, str);
    }
}
