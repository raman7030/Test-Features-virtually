package p067l;

/* JADX INFO: renamed from: l.ᩳ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8FN */
/* JADX INFO: loaded from: classes4.dex */
public final class C19400 {

    /* JADX INFO: renamed from: ֫ */
    public int f57932;

    /* JADX INFO: renamed from: ۧ */
    public int f57933;

    /* JADX INFO: renamed from: ܽ */
    public int f57934;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f57935;

    public C19400(byte[] bArr, int i, int i2) {
        m44170(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44170(int i, int i2, byte[] bArr) {
        this.f57935 = bArr;
        this.f57934 = i;
        this.f57933 = i2;
        this.f57932 = 0;
        m44168();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m44174() {
        int i = this.f57932 + 1;
        this.f57932 = i;
        if (i == 8) {
            this.f57932 = 0;
            int i2 = this.f57934;
            this.f57934 = i2 + (m44167(i2 + 1) ? 2 : 1);
        }
        m44168();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m44175(int i) {
        int i2 = this.f57934;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f57934 = i4;
        int i5 = (i - (i3 * 8)) + this.f57932;
        this.f57932 = i5;
        if (i5 > 7) {
            this.f57934 = i4 + 1;
            this.f57932 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f57934) {
                if (m44167(i2)) {
                    this.f57934++;
                    i2 += 2;
                }
            } else {
                m44168();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44169() {
        int i = this.f57932;
        if (i > 0) {
            m44175(8 - i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44171(int i) {
        int i2 = this.f57934;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f57932 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f57933) {
                break;
            }
            if (m44167(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f57933;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44176() {
        boolean z = (this.f57935[this.f57934] & (128 >> this.f57932)) != 0;
        m44174();
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m44172(int i) {
        int i2;
        this.f57932 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f57932;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f57932 = i5;
            byte[] bArr = this.f57935;
            int i6 = this.f57934;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m44167(i6 + 1)) {
                i4 = 1;
            }
            this.f57934 = i6 + i4;
        }
        byte[] bArr2 = this.f57935;
        int i7 = this.f57934;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f57932 = 0;
            this.f57934 = i7 + (m44167(i7 + 1) ? 2 : 1);
        }
        m44168();
        return i8;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44173() {
        int i = this.f57934;
        int i2 = this.f57932;
        int i3 = 0;
        while (this.f57934 < this.f57933 && !m44176()) {
            i3++;
        }
        boolean z = this.f57934 == this.f57933;
        this.f57934 = i;
        this.f57932 = i2;
        return !z && m44171((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m44177() {
        int i = 0;
        while (!m44176()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m44172(i) : 0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44178() {
        int i = 0;
        while (!m44176()) {
            i++;
        }
        int iM44172 = ((1 << i) - 1) + (i > 0 ? m44172(i) : 0);
        return ((iM44172 + 1) / 2) * (iM44172 % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m44167(int i) {
        if (2 > i || i >= this.f57933) {
            return false;
        }
        byte[] bArr = this.f57935;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m44168() {
        int i;
        int i2 = this.f57934;
        C23877.m52960(i2 >= 0 && (i2 < (i = this.f57933) || (i2 == i && this.f57932 == 0)));
    }
}
