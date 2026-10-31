package l;

/* JADX INFO: renamed from: l.ۚۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5112 extends AbstractC11422 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public String f16024;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f16025;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public String f16026;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    public C5112(InterfaceC1023 interfaceC1023, String str, String str2) {
        super(interfaceC1023, (byte) 7);
        this.f16026 = str;
        this.f16024 = str2;
        this.f16025 = 22;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f16025, i, bArr);
        return 2;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        int iM28197 = i2 + m28197(this.f16026, i2, bArr);
        int i3 = iM28197 + 1;
        bArr[iM28197] = 4;
        if (m28215()) {
            bArr[i3] = 0;
            i3 = iM28197 + 2;
        }
        return (i3 + m28197(this.f16024, i3, bArr)) - i;
    }

    @Override // l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComRename[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C19033.m43886(this.f16025, 4, ",oldFileName=", sb);
        sb.append(this.f16026);
        sb.append(",newFileName=");
        return new String(C9045.m23341(sb, this.f16024, "]"));
    }
}
