package p067l;

/* JADX INFO: renamed from: l.۬ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14935 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f42648;

    /* JADX INFO: renamed from: ܽ */
    public int f42650;

    /* JADX INFO: renamed from: ܿ */
    public int f42651;

    /* JADX INFO: renamed from: ᩳ */
    public int f42652 = 0;

    /* JADX INFO: renamed from: ۧ */
    public C14935 f42649 = this;

    public C14935(byte[] bArr, int i) {
        this.f42648 = bArr;
        this.f42650 = i;
        this.f42651 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14935 m34164(int i) {
        C14935 c14935 = new C14935(this.f42648, this.f42651);
        c14935.f42650 = i;
        c14935.f42649 = this.f42649;
        return c14935;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34157(int i) {
        int i2 = this.f42650 + i;
        this.f42650 = i2;
        int i3 = this.f42651;
        int i4 = i2 - i3;
        C14935 c14935 = this.f42649;
        if (i4 > c14935.f42652) {
            c14935.f42652 = i2 - i3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34161(int i) {
        int i2 = i - 1;
        int i3 = this.f42650 - this.f42651;
        m34157(((~i2) & (i3 + i2)) - i3);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34162(int i) {
        this.f42648[this.f42650] = (byte) (i & 255);
        m34157(1);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34163() {
        int i = this.f42648[this.f42650] & 255;
        m34157(1);
        return i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m34165(int i) {
        m34161(2);
        short s = (short) i;
        int i2 = this.f42650;
        byte[] bArr = this.f42648;
        bArr[i2] = (byte) (s & 255);
        bArr[i2 + 1] = (byte) ((s >> 8) & 255);
        m34157(2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m34160() {
        m34161(2);
        short sM10970 = C5137.m10970(this.f42650, this.f42648);
        m34157(2);
        return sM10970;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34167(int i) {
        m34161(4);
        C5137.m10971(i, this.f42650, this.f42648);
        m34157(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34156() {
        m34161(4);
        int iM10974 = C5137.m10974(this.f42650, this.f42648);
        m34157(4);
        return iM10974;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34159(String str) {
        m34161(4);
        int i = this.f42650;
        int length = str.length();
        int i2 = length + 1;
        byte[] bArr = this.f42648;
        C5137.m10971(i2, i, bArr);
        C5137.m10971(0, i + 4, bArr);
        C5137.m10971(i2, i + 8, bArr);
        int i3 = i + 12;
        int i4 = length * 2;
        System.arraycopy(C11843.m27147(str), 0, bArr, i3, i4);
        int i5 = i3 + i4;
        bArr[i5] = 0;
        bArr[i5 + 1] = 0;
        m34157((i5 + 2) - this.f42650);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m34166() throws C14265 {
        String strM27148;
        m34161(4);
        int i = this.f42650;
        byte[] bArr = this.f42648;
        int iM10974 = C5137.m10974(i, bArr);
        int i2 = i + 12;
        if (iM10974 != 0) {
            int i3 = (iM10974 - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C14265("invalid array conformance");
            }
            strM27148 = C11843.m27148(i2, i3, bArr);
            i2 += i3 + 2;
        } else {
            strM27148 = null;
        }
        m34157(i2 - this.f42650);
        return strM27148;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34158(Object obj) {
        if (obj == null) {
            m34167(0);
        } else {
            m34167(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.f42651 + ",index=" + this.f42650 + ",length=" + this.f42649.f42652;
    }
}
