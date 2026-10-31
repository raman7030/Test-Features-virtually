package l;

/* JADX INFO: renamed from: l.᩻ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes.dex */
public final class C23412 extends AbstractC6479 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21834[] f75184;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f75185;

    /* JADX WARN: Illegal instructions before constructor call */
    public C23412(int[] iArr, C21834[] c21834Arr) {
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
        for (C21834 c21834 : c21834Arr) {
            if ((c21834.m49209() >>> 24) == 6 || (c21834.m49211() >>> 24) == 6) {
                z = true;
                break;
            }
        }
        super(i, length, 1, z);
        this.f75185 = iArr;
        this.f75184 = c21834Arr;
    }
}
