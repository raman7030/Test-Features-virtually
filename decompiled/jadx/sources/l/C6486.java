package l;

/* JADX INFO: renamed from: l.ۜۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f20017;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20018;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f20019;

    public C6486() {
        this(10);
    }

    public C6486(int i) {
        this.f20017 = new int[i];
        this.f20019 = new int[i];
        this.f20018 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17879(int i, int i2) {
        int[] iArr = this.f20017;
        int i3 = this.f20018;
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
            this.f20019[i5] = i2;
            return;
        }
        int i7 = ~i5;
        int i8 = this.f20018;
        int[] iArr2 = this.f20017;
        if (i8 >= iArr2.length) {
            int iMax = Math.max(i8 + 1, iArr2.length * 2);
            int[] iArr3 = new int[iMax];
            int[] iArr4 = new int[iMax];
            int[] iArr5 = this.f20017;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            int[] iArr6 = this.f20019;
            System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
            this.f20017 = iArr3;
            this.f20019 = iArr4;
        }
        int i9 = this.f20018;
        if (i9 - i7 != 0) {
            int[] iArr7 = this.f20017;
            int i10 = i7 + 1;
            System.arraycopy(iArr7, i7, iArr7, i10, i9 - i7);
            int[] iArr8 = this.f20019;
            System.arraycopy(iArr8, i7, iArr8, i10, this.f20018 - i7);
        }
        this.f20017[i7] = i;
        this.f20019[i7] = i2;
        this.f20018++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m17880() {
        int i = this.f20018;
        int[] iArr = new int[i];
        System.arraycopy(this.f20017, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] m17882() {
        int i = this.f20018;
        int[] iArr = new int[i];
        System.arraycopy(this.f20019, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m17881() {
        return this.f20018;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17878() {
        return this.f20017[0];
    }
}
