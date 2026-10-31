package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7HQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12598 extends IOException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f37992;

    public C12598(AbstractC15440 abstractC15440, IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f37992 = abstractC15440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30862(AbstractC15440 abstractC15440, IOException iOException) {
        String message;
        if (((abstractC15440 instanceof C11893) || (abstractC15440 instanceof C12993)) && (message = iOException.getMessage()) != null) {
            if (message.contains("Permission denied") || message.contains("EACCES")) {
                throw new C12598(abstractC15440, iOException);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m30863() {
        return this.f37992;
    }
}
