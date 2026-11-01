package p067l;

/* JADX INFO: renamed from: l.᩺᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24411 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f77300 = new int[10];

    /* JADX INFO: renamed from: ܽ */
    public int[] f77302 = new int[10];

    /* JADX INFO: renamed from: ۧ */
    public int f77301 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static int m53841(int i, int i2, int[] iArr) {
        int i3 = -1;
        int i4 = i;
        while (i4 - i3 > 1) {
            int i5 = (i4 + i3) / 2;
            if (iArr[i5] < i2) {
                i3 = i5;
            } else {
                i4 = i5;
            }
        }
        if (i4 == i) {
            return ~i;
        }
        return iArr[i4] == i2 ? i4 : ~i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53842(int i) {
        int iM53841 = m53841(this.f77301, i, this.f77300);
        if (iM53841 < 0) {
            return -1;
        }
        return this.f77302[iM53841];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53843() {
        this.f77301 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53844(int i, int i2) {
        int i3 = this.f77301;
        if (i3 != 0) {
            int[] iArr = this.f77300;
            if (i <= iArr[i3 - 1]) {
                int iM53841 = m53841(i3, i, iArr);
                if (iM53841 >= 0) {
                    this.f77302[iM53841] = i2;
                    return;
                }
                int i4 = ~iM53841;
                int i5 = this.f77301;
                int[] iArr2 = this.f77300;
                if (i5 >= iArr2.length) {
                    int iMax = Math.max(i5 + 1, iArr2.length * 2);
                    int[] iArr3 = new int[iMax];
                    int[] iArr4 = new int[iMax];
                    int[] iArr5 = this.f77300;
                    System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
                    int[] iArr6 = this.f77302;
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    this.f77300 = iArr3;
                    this.f77302 = iArr4;
                }
                int i6 = this.f77301 - i4;
                if (i6 != 0) {
                    int[] iArr7 = this.f77300;
                    int i7 = i4 + 1;
                    System.arraycopy(iArr7, i4, iArr7, i7, i6);
                    int[] iArr8 = this.f77302;
                    System.arraycopy(iArr8, i4, iArr8, i7, this.f77301 - i4);
                }
                this.f77300[i4] = i;
                this.f77302[i4] = i2;
                this.f77301++;
                return;
            }
        }
        int[] iArr9 = this.f77300;
        if (i3 >= iArr9.length) {
            int iMax2 = Math.max(i3 + 1, iArr9.length * 2);
            int[] iArr10 = new int[iMax2];
            int[] iArr11 = new int[iMax2];
            int[] iArr12 = this.f77300;
            System.arraycopy(iArr12, 0, iArr10, 0, iArr12.length);
            int[] iArr13 = this.f77302;
            System.arraycopy(iArr13, 0, iArr11, 0, iArr13.length);
            this.f77300 = iArr10;
            this.f77302 = iArr11;
        }
        this.f77300[i3] = i;
        this.f77302[i3] = i2;
        this.f77301 = i3 + 1;
    }
}
