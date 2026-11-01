package p067l;

/* JADX INFO: renamed from: l.ۧۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12550 extends AbstractC8526 {

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC8526 f35269;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC8526 f35270;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12550(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527) {
        long j = ((long) abstractC8526.f22881) + ((long) abstractC8527.f22881);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = ((long) abstractC8526.f22882) + ((long) abstractC8527.f22882);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        boolean z = true;
        int iMax = Math.max(abstractC8526.f22880, abstractC8527.f22880) + 1;
        if (!abstractC8526.f22879 && !abstractC8527.f22879) {
            z = false;
        }
        super(i, i2, iMax, z);
        this.f35270 = abstractC8526;
        this.f35269 = abstractC8527;
    }
}
