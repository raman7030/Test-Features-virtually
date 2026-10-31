package l;

/* JADX INFO: renamed from: l.֡ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Z8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0172 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f1390;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f1391;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f1392;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f1393;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f1394;

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public C0172(int i, InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023);
        this.f1391 = bArr;
        this.f1390 = i;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m1307() {
        return this.f1391;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final int m1310() {
        return this.f1390;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m1305(int i) {
        this.f1390 += i;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int m1303() {
        return this.f1394;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m1304() {
        return this.f1392;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo1308(int i, byte[] bArr) {
        this.f1393 = C1480.m5121(i + 2, bArr);
        this.f1394 = C1480.m5121(i + 6, bArr);
        this.f1392 = C1480.m5121(i + 8, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndXResponse[");
        sb.append(super.toString());
        sb.append(",dataCompactionMode=");
        sb.append(this.f1393);
        sb.append(",dataLength=");
        sb.append(this.f1394);
        sb.append(",dataOffset=");
        return new String(C3200.m9831(this.f1392, "]", sb));
    }
}
