package p067l;

/* JADX INFO: renamed from: l.ۜۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8532 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f22891;

    /* JADX INFO: renamed from: ۧ */
    public int f22892;

    /* JADX INFO: renamed from: ܽ */
    public int[] f22893;

    public C8532() {
        this(10);
    }

    public C8532(int i) {
        this.f22891 = new int[i];
        this.f22893 = new int[i];
        this.f22892 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19827(int i, int i2) {
        int[] iArr = this.f22891;
        int i3 = this.f22892;
        int i4 = -1;
        int i5 = i3;
        while (i5 - i4 > 1) {
            int i6 = (i5 + i4) / 2;
            if (iArr[i6] < i) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        if (i5 == i3) {
            i5 = ~i3;
        } else if (iArr[i5] != i) {
            i5 = ~i5;
        }
        if (i5 >= 0) {
            this.f22893[i5] = i2;
            return;
        }
        int i7 = ~i5;
        int i8 = this.f22892;
        int[] iArr2 = this.f22891;
        if (i8 >= iArr2.length) {
            int iMax = Math.max(i8 + 1, iArr2.length * 2);
            int[] iArr3 = new int[iMax];
            int[] iArr4 = new int[iMax];
            int[] iArr5 = this.f22891;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            int[] iArr6 = this.f22893;
            System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
            this.f22891 = iArr3;
            this.f22893 = iArr4;
        }
        int i9 = this.f22892;
        if (i9 - i7 != 0) {
            int[] iArr7 = this.f22891;
            int i10 = i7 + 1;
            System.arraycopy(iArr7, i7, iArr7, i10, i9 - i7);
            int[] iArr8 = this.f22893;
            System.arraycopy(iArr8, i7, iArr8, i10, this.f22892 - i7);
        }
        this.f22891[i7] = i;
        this.f22893[i7] = i2;
        this.f22892++;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int[] m19828() {
        int i = this.f22892;
        int[] iArr = new int[i];
        System.arraycopy(this.f22891, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int[] m19830() {
        int i = this.f22892;
        int[] iArr = new int[i];
        System.arraycopy(this.f22893, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m19829() {
        return this.f22892;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19826() {
        return this.f22891[0];
    }
}
