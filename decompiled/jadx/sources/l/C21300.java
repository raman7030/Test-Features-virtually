package l;

/* JADX INFO: renamed from: l.᩸ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA1R */
/* JADX INFO: loaded from: classes5.dex */
public final class C21300 implements InterfaceC23100 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f68665;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f68666;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f68667;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f68668;

    @Override // l.InterfaceC23100
    /* JADX INFO: renamed from: ᩳ */
    public final long mo29550() {
        return this.f68667 * ((long) this.f68665) * ((long) this.f68668);
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f68667 = C1480.m5125(i, bArr);
        this.f68666 = C1480.m5125(i + 8, bArr);
        this.f68665 = C1480.m5123(i + 16, bArr);
        this.f68668 = C1480.m5123(i + 20, bArr);
        return (i + 24) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f68667);
        sb.append(",free=");
        sb.append(this.f68666);
        sb.append(",sectPerAlloc=");
        sb.append(this.f68665);
        sb.append(",bytesPerSect=");
        return new String(C3200.m9831(this.f68668, "]", sb));
    }
}
