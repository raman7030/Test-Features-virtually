package l;

/* JADX INFO: renamed from: l.᩵ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19224 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f60525;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f60526;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f60527;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public long f60528;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f60529;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f60530;

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

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    public C19224(InterfaceC1023 interfaceC1023, int i, long j, int i2) {
        super(interfaceC1023, (byte) 46, (AbstractC11422) null);
        this.f60527 = i;
        this.f60528 = j;
        this.f60530 = i2;
        this.f60529 = i2;
        this.f60526 = -1;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m44362(int i) {
        this.f60529 = i;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final void m44363() {
        this.f60530 = 1024;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m44361(int i) {
        this.f60526 = i;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m44360() {
        this.f60525 = 1024;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        C1480.m5122(this.f60527, i, bArr);
        long j = this.f60528;
        C1480.m5124(j, i + 2, bArr);
        C1480.m5122(this.f60529, i + 6, bArr);
        C1480.m5122(this.f60530, i + 8, bArr);
        C1480.m5124(this.f60526, i + 10, bArr);
        C1480.m5122(this.f60525, i + 14, bArr);
        C1480.m5124(j >> 32, i + 16, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f60527);
        sb.append(",offset=");
        long j = this.f60528;
        sb.append(j);
        sb.append(",maxCount=");
        sb.append(this.f60529);
        sb.append(",minCount=");
        sb.append(this.f60530);
        sb.append(",openTimeout=");
        sb.append(this.f60526);
        sb.append(",remaining=");
        sb.append(this.f60525);
        sb.append(",offset=");
        sb.append(j);
        sb.append("]");
        return new String(sb.toString());
    }
}
