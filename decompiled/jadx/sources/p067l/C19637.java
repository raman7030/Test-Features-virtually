package p067l;

import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;

/* JADX INFO: renamed from: l.ᩳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19637 implements IPublicationErrorHandler {
    @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
    public final void handleError(PublicationError publicationError) {
        if (publicationError.getCause() != null) {
            C18966.f56562.mo9186(publicationError.toString(), publicationError.getCause());
        } else {
            C18966.f56562.mo9175(publicationError.toString());
        }
    }
}
