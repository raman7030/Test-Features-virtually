package l;

/* JADX INFO: renamed from: l.᩺᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23193 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f74557 = new int[10];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f74559 = new int[10];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f74558 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51445(int i, int i2, int[] iArr) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51446(int i) {
        int iM51445 = m51445(this.f74558, i, this.f74557);
        if (iM51445 < 0) {
            return -1;
        }
        return this.f74559[iM51445];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51447() {
        this.f74558 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51448(int i, int i2) {
        int i3 = this.f74558;
        if (i3 != 0) {
            int[] iArr = this.f74557;
            if (i <= iArr[i3 - 1]) {
                int iM51445 = m51445(i3, i, iArr);
                if (iM51445 >= 0) {
                    this.f74559[iM51445] = i2;
                    return;
                }
                int i4 = ~iM51445;
                int i5 = this.f74558;
                int[] iArr2 = this.f74557;
                if (i5 >= iArr2.length) {
                    int iMax = Math.max(i5 + 1, iArr2.length * 2);
                    int[] iArr3 = new int[iMax];
                    int[] iArr4 = new int[iMax];
                    int[] iArr5 = this.f74557;
                    System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
                    int[] iArr6 = this.f74559;
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    this.f74557 = iArr3;
                    this.f74559 = iArr4;
                }
                int i6 = this.f74558 - i4;
                if (i6 != 0) {
                    int[] iArr7 = this.f74557;
                    int i7 = i4 + 1;
                    System.arraycopy(iArr7, i4, iArr7, i7, i6);
                    int[] iArr8 = this.f74559;
                    System.arraycopy(iArr8, i4, iArr8, i7, this.f74558 - i4);
                }
                this.f74557[i4] = i;
                this.f74559[i4] = i2;
                this.f74558++;
                return;
            }
        }
        int[] iArr9 = this.f74557;
        if (i3 >= iArr9.length) {
            int iMax2 = Math.max(i3 + 1, iArr9.length * 2);
            int[] iArr10 = new int[iMax2];
            int[] iArr11 = new int[iMax2];
            int[] iArr12 = this.f74557;
            System.arraycopy(iArr12, 0, iArr10, 0, iArr12.length);
            int[] iArr13 = this.f74559;
            System.arraycopy(iArr13, 0, iArr11, 0, iArr13.length);
            this.f74557 = iArr10;
            this.f74559 = iArr11;
        }
        this.f74557[i3] = i;
        this.f74559[i3] = i2;
        this.f74558 = i3 + 1;
    }
}
