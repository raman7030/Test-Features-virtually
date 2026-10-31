package l;

/* JADX INFO: renamed from: l.᩶۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20029 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f64855 = new byte[1048576];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f64856;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10151 f64857;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64858;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f64859;

    public C20029(C10151 c10151, InterfaceC17066 interfaceC17066) {
        this.f64857 = c10151;
        this.f64856 = interfaceC17066;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46163(int i) {
        int i2 = this.f64859;
        int i3 = i2 + 1;
        this.f64859 = i3;
        byte[] bArr = this.f64855;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m46161();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46164(int i, byte[] bArr) throws C23821 {
        int i2 = 0;
        while (i > 0) {
            byte[] bArr2 = this.f64855;
            int iMin = Math.min(i, bArr2.length - this.f64859);
            System.arraycopy(bArr, i2, bArr2, this.f64859, iMin);
            int i3 = this.f64859 + iMin;
            this.f64859 = i3;
            i2 += iMin;
            i -= iMin;
            if (i3 == bArr2.length) {
                m46161();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46162() throws C23821 {
        m46161();
        C5917.m16589(this.f64856);
        return this.f64858;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46161() throws C23821 {
        if (this.f64859 == 0) {
            return;
        }
        C5917.m16589(this.f64856);
        int i = this.f64858;
        int i2 = this.f64859;
        if (i > Integer.MAX_VALUE - i2) {
            throw new C7161();
        }
        this.f64857.m25490(i2, this.f64855);
        this.f64858 += this.f64859;
        this.f64859 = 0;
    }
}
