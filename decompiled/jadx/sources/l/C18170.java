package l;

import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;

/* JADX INFO: renamed from: l.ᩳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18170 implements IPublicationErrorHandler {
    @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
    public final void handleError(PublicationError publicationError) {
        if (publicationError.getCause() != null) {
            C17464.f53375.mo7091(publicationError.toString(), publicationError.getCause());
        } else {
            C17464.f53375.mo7080(publicationError.toString());
        }
    }
}
