package l;

/* JADX INFO: renamed from: l.۬ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K50I */
/* JADX INFO: loaded from: classes3.dex */
public final class C13090 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f39190 = new int[32];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39191;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39192;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31732() {
        this.f39191 = 0;
        this.f39192 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31729(int i) {
        int i2 = 0;
        if (this.f39191 != 0 && i >= 0) {
            int i3 = this.f39192;
            if (i > i3) {
                i = i3;
            }
            int iM51496 = 0;
            while (i != 0) {
                int i4 = this.f39190[iM51496];
                i2 += i4;
                iM51496 = C23202.m51496(i4, 2, 2, iM51496);
                i--;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31727(int i, int i2) {
        if (this.f39192 == 0) {
            m31731();
        }
        int[] iArr = this.f39190;
        int length = iArr.length;
        int i3 = this.f39191;
        int i4 = length - i3;
        if (i4 <= 2) {
            int[] iArr2 = new int[(iArr.length + i4) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f39190 = iArr2;
        }
        int i5 = this.f39191;
        int i6 = i5 - 1;
        int[] iArr3 = this.f39190;
        int i7 = iArr3[i6];
        int i8 = (i5 - 2) - (i7 * 2);
        int i9 = i7 + 1;
        iArr3[i8] = i9;
        iArr3[i6] = i;
        iArr3[i5] = i2;
        iArr3[i5 + 1] = i9;
        this.f39191 = i5 + 2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31734() {
        int[] iArr;
        int i;
        int i2 = this.f39191;
        if (i2 == 0 || (i = (iArr = this.f39190)[i2 - 1]) == 0) {
            return;
        }
        int i3 = i - 1;
        int i4 = i2 - 3;
        iArr[i4] = i3;
        iArr[i4 - ((i3 * 2) + 1)] = i3;
        this.f39191 = i2 - 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31730(int i) {
        return m31724(i, true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m31733(int i) {
        return m31724(i, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31728() {
        return this.f39192;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31726() {
        int i = this.f39191;
        if (i == 0) {
            return;
        }
        int i2 = this.f39190[i - 1] * 2;
        if ((i - 2) - i2 == 0) {
            return;
        }
        this.f39191 = i - (i2 + 2);
        this.f39192--;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31731() {
        int[] iArr = this.f39190;
        int length = iArr.length;
        int i = this.f39191;
        int i2 = length - i;
        if (i2 <= 2) {
            int[] iArr2 = new int[(iArr.length + i2) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f39190 = iArr2;
        }
        int i3 = this.f39191;
        int[] iArr3 = this.f39190;
        iArr3[i3] = 0;
        iArr3[i3 + 1] = 0;
        this.f39191 = i3 + 2;
        this.f39192++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31725(int i) {
        int i2 = this.f39191;
        if (i2 == 0) {
            return -1;
        }
        int i3 = i2 - 1;
        for (int i4 = this.f39192; i4 != 0; i4--) {
            i3 -= 2;
            for (int i5 = this.f39190[i3]; i5 != 0; i5--) {
                int[] iArr = this.f39190;
                if (iArr[i3 + 1] == i) {
                    return iArr[i3];
                }
                i3 -= 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final int m31724(int i, boolean z) {
        if (this.f39191 == 0 || i < 0) {
            return -1;
        }
        int iM51496 = 0;
        for (int i2 = this.f39192; i2 != 0; i2--) {
            int[] iArr = this.f39190;
            int i3 = iArr[iM51496];
            if (i < i3) {
                int iM51497 = C23202.m51496(i, 2, 1, iM51496);
                if (!z) {
                    iM51497++;
                }
                return iArr[iM51497];
            }
            i -= i3;
            iM51496 = C23202.m51496(i3, 2, 2, iM51496);
        }
        return -1;
    }
}
