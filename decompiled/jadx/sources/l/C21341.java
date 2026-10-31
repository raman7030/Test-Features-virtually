package l;

/* JADX INFO: renamed from: l.᩸ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21341 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f68771;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f68772;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public String f68773;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f68774;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public String f68775;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C21341(InterfaceC1023 interfaceC1023, AbstractC11422 abstractC11422) {
        super(interfaceC1023, abstractC11422);
        this.f68773 = "";
        this.f68775 = "";
        this.f68771 = "";
        this.f68772 = null;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48375() {
        return this.f68774;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48376() {
        return this.f68772;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f68774 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m28221()) {
            int iM5121 = C1480.m5121(i2, bArr);
            i2 = i + 4;
            this.f68772 = new byte[iM5121];
        }
        return i2 - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        int length;
        if (m28221()) {
            byte[] bArr2 = this.f68772;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            length = this.f68772.length + i;
        } else {
            length = i;
        }
        String strM28226 = m28226(length, bArr);
        this.f68773 = strM28226;
        int iM28196 = m28196(length, strM28226) + length;
        String strM28200 = m28200(bArr, iM28196, m28215());
        this.f68775 = strM28200;
        int iM28197 = m28196(iM28196, strM28200) + iM28196;
        if (!m28221()) {
            String strM28201 = m28200(bArr, iM28197, m28215());
            this.f68771 = strM28201;
            iM28197 += m28196(iM28197, strM28201);
        }
        return iM28197 - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndXResponse[");
        sb.append(super.toString());
        sb.append(",isLoggedInAsGuest=");
        sb.append(this.f68774);
        sb.append(",nativeOs=");
        sb.append(this.f68773);
        sb.append(",nativeLanMan=");
        sb.append(this.f68775);
        sb.append(",primaryDomain=");
        return new String(C9045.m23341(sb, this.f68771, "]"));
    }
}
