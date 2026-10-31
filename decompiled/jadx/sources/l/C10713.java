package l;

/* JADX INFO: renamed from: l.ۧۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10713 extends AbstractC6479 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f32294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f32295;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10713(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710) {
        long j = ((long) abstractC6479.f20006) + ((long) abstractC64710.f20006);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = ((long) abstractC6479.f20007) + ((long) abstractC64710.f20007);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        boolean z = true;
        int iMax = Math.max(abstractC6479.f20005, abstractC64710.f20005) + 1;
        if (!abstractC6479.f20004 && !abstractC64710.f20004) {
            z = false;
        }
        super(i, i2, iMax, z);
        this.f32295 = abstractC6479;
        this.f32294 = abstractC64710;
    }
}
