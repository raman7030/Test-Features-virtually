package l;

/* JADX INFO: renamed from: l.ᩳ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8FN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17921 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54737;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f54738;

    public C17921(byte[] bArr, int i, int i2) {
        m41921(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41921(int i, int i2, byte[] bArr) {
        this.f54738 = bArr;
        this.f54737 = i;
        this.f54736 = i2;
        this.f54735 = 0;
        m41919();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41925() {
        int i = this.f54735 + 1;
        this.f54735 = i;
        if (i == 8) {
            this.f54735 = 0;
            int i2 = this.f54737;
            this.f54737 = i2 + (m41918(i2 + 1) ? 2 : 1);
        }
        m41919();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41926(int i) {
        int i2 = this.f54737;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f54737 = i4;
        int i5 = (i - (i3 * 8)) + this.f54735;
        this.f54735 = i5;
        if (i5 > 7) {
            this.f54737 = i4 + 1;
            this.f54735 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f54737) {
                if (m41918(i2)) {
                    this.f54737++;
                    i2 += 2;
                }
            } else {
                m41919();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41920() {
        int i = this.f54735;
        if (i > 0) {
            m41926(8 - i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41922(int i) {
        int i2 = this.f54737;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f54735 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f54736) {
                break;
            }
            if (m41918(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f54736;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41927() {
        boolean z = (this.f54738[this.f54737] & (128 >> this.f54735)) != 0;
        m41925();
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41923(int i) {
        int i2;
        this.f54735 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f54735;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f54735 = i5;
            byte[] bArr = this.f54738;
            int i6 = this.f54737;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m41918(i6 + 1)) {
                i4 = 1;
            }
            this.f54737 = i6 + i4;
        }
        byte[] bArr2 = this.f54738;
        int i7 = this.f54737;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f54735 = 0;
            this.f54737 = i7 + (m41918(i7 + 1) ? 2 : 1);
        }
        m41919();
        return i8;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41924() {
        int i = this.f54737;
        int i2 = this.f54735;
        int i3 = 0;
        while (this.f54737 < this.f54736 && !m41927()) {
            i3++;
        }
        boolean z = this.f54737 == this.f54736;
        this.f54737 = i;
        this.f54735 = i2;
        return !z && m41922((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m41928() {
        int i = 0;
        while (!m41927()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m41923(i) : 0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41929() {
        int i = 0;
        while (!m41927()) {
            i++;
        }
        int iM41923 = ((1 << i) - 1) + (i > 0 ? m41923(i) : 0);
        return ((iM41923 + 1) / 2) * (iM41923 % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m41918(int i) {
        if (2 > i || i >= this.f54736) {
            return false;
        }
        byte[] bArr = this.f54738;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41919() {
        int i;
        int i2 = this.f54737;
        C22632.m50634(i2 >= 0 && (i2 < (i = this.f54736) || (i2 == i && this.f54735 == 0)));
    }
}
