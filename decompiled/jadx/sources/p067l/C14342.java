package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7HQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14342 extends IOException {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f41019;

    public C14342(AbstractC17043 abstractC17043, IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f41019 = abstractC17043;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32939(AbstractC17043 abstractC17043, IOException iOException) {
        String message;
        if (((abstractC17043 instanceof C13672) || (abstractC17043 instanceof C14717)) && (message = iOException.getMessage()) != null) {
            if (message.contains("Permission denied") || message.contains("EACCES")) {
                throw new C14342(abstractC17043, iOException);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m32940() {
        return this.f41019;
    }
}
