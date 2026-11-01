package p067l;

/* JADX INFO: renamed from: l.᩻ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes.dex */
public final class C24619 extends AbstractC8526 {

    /* JADX INFO: renamed from: ܳ */
    public final C23120[] f77930;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f77931;

    /* JADX WARN: Illegal instructions before constructor call */
    public C24619(int[] iArr, C23120[] c23120Arr) {
        boolean z = false;
        int i = 0;
        for (int i2 : iArr) {
            long j = ((long) i) + ((long) (i2 & Integer.MAX_VALUE));
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        int length = iArr.length;
        for (C23120 c23120 : c23120Arr) {
            if ((c23120.m51560() >>> 24) == 6 || (c23120.m51562() >>> 24) == 6) {
                z = true;
                break;
            }
        }
        super(i, length, 1, z);
        this.f77931 = iArr;
        this.f77930 = c23120Arr;
    }
}
