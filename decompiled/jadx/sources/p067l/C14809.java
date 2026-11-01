package p067l;

/* JADX INFO: renamed from: l.۬ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class C14809 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f42238 = new int[32];

    /* JADX INFO: renamed from: ۧ */
    public int f42239;

    /* JADX INFO: renamed from: ܽ */
    public int f42240;

    /* JADX INFO: renamed from: ܿ */
    public final void m33822() {
        this.f42239 = 0;
        this.f42240 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33819(int i) {
        int i2 = 0;
        if (this.f42239 != 0 && i >= 0) {
            int i3 = this.f42240;
            if (i > i3) {
                i = i3;
            }
            int iM53892 = 0;
            while (i != 0) {
                int i4 = this.f42238[iM53892];
                i2 += i4;
                iM53892 = C24420.m53892(i4, 2, 2, iM53892);
                i--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33817(int i, int i2) {
        if (this.f42240 == 0) {
            m33821();
        }
        int[] iArr = this.f42238;
        int length = iArr.length;
        int i3 = this.f42239;
        int i4 = length - i3;
        if (i4 <= 2) {
            int[] iArr2 = new int[(iArr.length + i4) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f42238 = iArr2;
        }
        int i5 = this.f42239;
        int i6 = i5 - 1;
        int[] iArr3 = this.f42238;
        int i7 = iArr3[i6];
        int i8 = (i5 - 2) - (i7 * 2);
        int i9 = i7 + 1;
        iArr3[i8] = i9;
        iArr3[i6] = i;
        iArr3[i5] = i2;
        iArr3[i5 + 1] = i9;
        this.f42239 = i5 + 2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m33824() {
        int[] iArr;
        int i;
        int i2 = this.f42239;
        if (i2 == 0 || (i = (iArr = this.f42238)[i2 - 1]) == 0) {
            return;
        }
        int i3 = i - 1;
        int i4 = i2 - 3;
        iArr[i4] = i3;
        iArr[i4 - ((i3 * 2) + 1)] = i3;
        this.f42239 = i2 - 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33820(int i) {
        return m33814(i, true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m33823(int i) {
        return m33814(i, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33818() {
        return this.f42240;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33816() {
        int i = this.f42239;
        if (i == 0) {
            return;
        }
        int i2 = this.f42238[i - 1] * 2;
        if ((i - 2) - i2 == 0) {
            return;
        }
        this.f42239 = i - (i2 + 2);
        this.f42240--;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33821() {
        int[] iArr = this.f42238;
        int length = iArr.length;
        int i = this.f42239;
        int i2 = length - i;
        if (i2 <= 2) {
            int[] iArr2 = new int[(iArr.length + i2) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f42238 = iArr2;
        }
        int i3 = this.f42239;
        int[] iArr3 = this.f42238;
        iArr3[i3] = 0;
        iArr3[i3 + 1] = 0;
        this.f42239 = i3 + 2;
        this.f42240++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33815(int i) {
        int i2 = this.f42239;
        if (i2 == 0) {
            return -1;
        }
        int i3 = i2 - 1;
        for (int i4 = this.f42240; i4 != 0; i4--) {
            i3 -= 2;
            for (int i5 = this.f42238[i3]; i5 != 0; i5--) {
                int[] iArr = this.f42238;
                if (iArr[i3 + 1] == i) {
                    return iArr[i3];
                }
                i3 -= 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private final int m33814(int i, boolean z) {
        if (this.f42239 == 0 || i < 0) {
            return -1;
        }
        int iM53892 = 0;
        for (int i2 = this.f42240; i2 != 0; i2--) {
            int[] iArr = this.f42238;
            int i3 = iArr[iM53892];
            if (i < i3) {
                int iM53893 = C24420.m53892(i, 2, 1, iM53892);
                if (!z) {
                    iM53893++;
                }
                return iArr[iM53893];
            }
            i -= i3;
            iM53892 = C24420.m53892(i3, 2, 2, iM53892);
        }
        return -1;
    }
}
