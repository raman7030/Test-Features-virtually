package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S708 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21918 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f68931 = C11189.f31067;

    /* JADX INFO: renamed from: ۧ */
    public int f68932;

    /* JADX INFO: renamed from: ֫ */
    public final C11189 m49454(int i) {
        int[] iArr = this.f68931;
        if (iArr == null) {
            throw new IllegalStateException("Search match builder is already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative search text length");
        }
        int i2 = this.f68932;
        if (i2 != 0 && iArr[((i2 - 1) << 1) + 1] > i) {
            throw new IllegalArgumentException("Search match is outside the text");
        }
        C11189 c11189 = new C11189(i2, i, iArr);
        this.f68931 = null;
        return c11189;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49455(int i, int i2) {
        int[] iArr = this.f68931;
        if (iArr == null) {
            throw new IllegalStateException("Search match builder is already built");
        }
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid search match range");
        }
        int i3 = this.f68932;
        if (i3 != 0 && i < iArr[((i3 - 1) << 1) + 1]) {
            throw new IllegalArgumentException("Search matches overlap or are out of order");
        }
        long j = ((long) i3) + ((long) 1);
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        long j3 = j2 * ((long) 2);
        int i4 = (int) j3;
        if (j3 != i4) {
            throw new ArithmeticException();
        }
        if (iArr.length < i4) {
            int length = iArr.length == 0 ? 16 : iArr.length;
            while (true) {
                if (length >= i4) {
                    i4 = length;
                    break;
                }
                int i5 = length << 1;
                if (i5 <= length) {
                    break;
                } else {
                    length = i5;
                }
            }
            this.f68931 = Arrays.copyOf(this.f68931, i4);
        }
        int[] iArr2 = this.f68931;
        int i6 = this.f68932;
        int i7 = i6 << 1;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        this.f68932 = i6 + 1;
    }
}
