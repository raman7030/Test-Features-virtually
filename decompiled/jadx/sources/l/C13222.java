package l;

/* JADX INFO: renamed from: l.۬ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f39584;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39586;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f39587;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f39588 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13222 f39585 = this;

    public C13222(byte[] bArr, int i) {
        this.f39584 = bArr;
        this.f39586 = i;
        this.f39587 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13222 m32066(int i) {
        C13222 c13222 = new C13222(this.f39584, this.f39587);
        c13222.f39586 = i;
        c13222.f39585 = this.f39585;
        return c13222;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32059(int i) {
        int i2 = this.f39586 + i;
        this.f39586 = i2;
        int i3 = this.f39587;
        int i4 = i2 - i3;
        C13222 c13222 = this.f39585;
        if (i4 > c13222.f39588) {
            c13222.f39588 = i2 - i3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32063(int i) {
        int i2 = i - 1;
        int i3 = this.f39586 - this.f39587;
        m32059(((~i2) & (i3 + i2)) - i3);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32064(int i) {
        this.f39584[this.f39586] = (byte) (i & 255);
        m32059(1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32065() {
        int i = this.f39584[this.f39586] & 255;
        m32059(1);
        return i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32067(int i) {
        m32063(2);
        short s = (short) i;
        int i2 = this.f39586;
        byte[] bArr = this.f39584;
        bArr[i2] = (byte) (s & 255);
        bArr[i2 + 1] = (byte) ((s >> 8) & 255);
        m32059(2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m32062() {
        m32063(2);
        short sM8902 = C2913.m8902(this.f39586, this.f39584);
        m32059(2);
        return sM8902;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32069(int i) {
        m32063(4);
        C2913.m8903(i, this.f39586, this.f39584);
        m32059(4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32058() {
        m32063(4);
        int iM8906 = C2913.m8906(this.f39586, this.f39584);
        m32059(4);
        return iM8906;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32061(String str) {
        m32063(4);
        int i = this.f39586;
        int length = str.length();
        int i2 = length + 1;
        byte[] bArr = this.f39584;
        C2913.m8903(i2, i, bArr);
        C2913.m8903(0, i + 4, bArr);
        C2913.m8903(i2, i + 8, bArr);
        int i3 = i + 12;
        int i4 = length * 2;
        System.arraycopy(C9969.m25130(str), 0, bArr, i3, i4);
        int i5 = i3 + i4;
        bArr[i5] = 0;
        bArr[i5 + 1] = 0;
        m32059((i5 + 2) - this.f39586);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m32068() throws C12517 {
        String strM25131;
        m32063(4);
        int i = this.f39586;
        byte[] bArr = this.f39584;
        int iM8906 = C2913.m8906(i, bArr);
        int i2 = i + 12;
        if (iM8906 != 0) {
            int i3 = (iM8906 - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C12517("invalid array conformance");
            }
            strM25131 = C9969.m25131(i2, i3, bArr);
            i2 += i3 + 2;
        } else {
            strM25131 = null;
        }
        m32059(i2 - this.f39586);
        return strM25131;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32060(Object obj) {
        if (obj == null) {
            m32069(0);
        } else {
            m32069(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.f39587 + ",index=" + this.f39586 + ",length=" + this.f39585.f39588;
    }
}
