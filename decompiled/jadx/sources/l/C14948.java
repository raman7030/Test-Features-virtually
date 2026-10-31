package l;

/* JADX INFO: renamed from: l.ܶۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14948 implements InterfaceC23100, InterfaceC12832, InterfaceC8079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f45571;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f45572;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45573;

    @Override // l.InterfaceC23100
    /* JADX INFO: renamed from: ᩳ */
    public final long mo29550() {
        return this.f45572 * ((long) this.f45570) * ((long) this.f45573);
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f45572 = C1480.m5125(i, bArr);
        this.f45571 = C1480.m5125(i + 8, bArr);
        this.f45570 = C1480.m5123(i + 24, bArr);
        this.f45573 = C1480.m5123(i + 28, bArr);
        return (i + 32) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f45572);
        sb.append(",free=");
        sb.append(this.f45571);
        sb.append(",sectPerAlloc=");
        sb.append(this.f45570);
        sb.append(",bytesPerSect=");
        return new String(C3200.m9831(this.f45573, "]", sb));
    }
}
