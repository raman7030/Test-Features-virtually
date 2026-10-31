package l;

/* JADX INFO: renamed from: l.ۖۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2290 extends AbstractC10011 implements InterfaceC14242 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f7397;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f7398;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f7399;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public long f7400;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f7401;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f7402;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f7403;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f7404;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f7405;

    @Override // l.InterfaceC14242
    public final long getSize() {
        throw null;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

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

    public C2290(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final int m7547() {
        return this.f7405;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int m7550() {
        return this.f7398;
    }

    @Override // l.InterfaceC14242
    public final int getAttributes() {
        return this.f7403;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m7548() {
        return this.f7397;
    }

    @Override // l.InterfaceC14242
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long mo7549() {
        return this.f7400;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        this.f7405 = C1480.m5121(i, bArr);
        this.f7403 = C1480.m5121(i + 2, bArr);
        this.f7400 = (((long) C1480.m5123(i + 4, bArr)) & 4294967295L) * 1000;
        this.f7398 = C1480.m5123(i + 8, bArr);
        this.f7401 = C1480.m5121(i + 12, bArr);
        this.f7397 = C1480.m5121(i + 14, bArr);
        this.f7404 = C1480.m5121(i + 16, bArr);
        this.f7402 = C1480.m5121(i + 18, bArr);
        this.f7399 = C1480.m5123(i + 20, bArr);
        return (i + 26) - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndXResponse[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f7405);
        sb.append(",fileAttributes=");
        sb.append(this.f7403);
        sb.append(",lastWriteTime=");
        sb.append(this.f7400);
        sb.append(",dataSize=");
        sb.append(this.f7398);
        sb.append(",grantedAccess=");
        sb.append(this.f7401);
        sb.append(",fileType=");
        sb.append(this.f7397);
        sb.append(",deviceState=");
        sb.append(this.f7404);
        sb.append(",action=");
        sb.append(this.f7402);
        sb.append(",serverFid=");
        return new String(C3200.m9831(this.f7399, "]", sb));
    }
}
