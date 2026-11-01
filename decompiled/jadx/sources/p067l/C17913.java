package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17913 {

    /* JADX INFO: renamed from: ֫ */
    public int f53509;

    /* JADX INFO: renamed from: ܳ */
    public int f53511;

    /* JADX INFO: renamed from: ܽ */
    public int f53512;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f53514 = new int[128];

    /* JADX INFO: renamed from: ܿ */
    public final C23120[] f53513 = new C23120[128];

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8526[] f53510 = new AbstractC8526[32];

    /* JADX INFO: renamed from: ֫ */
    public final void m40720(int i, C23120 c23120, boolean z) {
        int i2;
        AbstractC8526[] abstractC8526Arr;
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C12826.requireNonNull(c23120, "style");
        long j = ((long) this.f53512) + ((long) i);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        int i4 = this.f53509;
        int[] iArr = this.f53514;
        C23120[] c23120Arr = this.f53513;
        if (i4 == 0 || z || !c23120Arr[i4 - 1].equals(c23120)) {
            int i5 = this.f53509;
            if (i5 == 128) {
                AbstractC8526 c24619 = new C24619(Arrays.copyOf(iArr, i5), (C23120[]) Arrays.copyOf(c23120Arr, this.f53509));
                while (true) {
                    i2 = this.f53511;
                    abstractC8526Arr = this.f53510;
                    if (i2 == 0) {
                        break;
                    }
                    int i6 = i2 - 1;
                    AbstractC8526 abstractC8526 = abstractC8526Arr[i6];
                    if (abstractC8526.f22880 != c24619.f22880) {
                        break;
                    }
                    this.f53511 = i6;
                    C12550 c12550 = new C12550(abstractC8526, c24619);
                    abstractC8526Arr[this.f53511] = null;
                    c24619 = c12550;
                }
                this.f53511 = i2 + 1;
                abstractC8526Arr[i2] = c24619;
                Arrays.fill(c23120Arr, (Object) null);
                this.f53509 = 0;
            }
            int i7 = this.f53509;
            iArr[i7] = i | (z ? Integer.MIN_VALUE : 0);
            this.f53509 = i7 + 1;
            c23120Arr[i7] = c23120;
        } else {
            int i8 = this.f53509 - 1;
            int i9 = iArr[i8];
            iArr[i8] = (Integer.MIN_VALUE & i9) | ((i9 & Integer.MAX_VALUE) + i);
        }
        this.f53512 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11209 m40719() {
        int i = this.f53509;
        AbstractC8526 c24619 = i == 0 ? null : new C24619(Arrays.copyOf(this.f53514, i), (C23120[]) Arrays.copyOf(this.f53513, this.f53509));
        int i2 = this.f53511;
        while (true) {
            i2--;
            if (i2 < 0) {
                return C11209.m25878(c24619);
            }
            c24619 = C11209.m25888(this.f53510[i2], c24619);
        }
    }
}
