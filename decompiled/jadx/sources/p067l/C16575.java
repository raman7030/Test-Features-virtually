package p067l;

/* JADX INFO: renamed from: l.ܶۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9Y4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16575 implements InterfaceC24323, InterfaceC14564, InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ */
    public int f48683;

    /* JADX INFO: renamed from: ᩶ */
    public long f48684;

    /* JADX INFO: renamed from: ᩸ */
    public long f48685;

    /* JADX INFO: renamed from: ᩹ */
    public int f48686;

    @Override // p067l.InterfaceC24323
    /* JADX INFO: renamed from: ᩳ */
    public final long mo31614() {
        return this.f48685 * ((long) this.f48683) * ((long) this.f48686);
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f48685 = C3775.m7367(i, bArr);
        this.f48684 = C3775.m7367(i + 8, bArr);
        this.f48683 = C3775.m7365(i + 24, bArr);
        this.f48686 = C3775.m7365(i + 28, bArr);
        return (i + 32) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f48685);
        sb.append(",free=");
        sb.append(this.f48684);
        sb.append(",sectPerAlloc=");
        sb.append(this.f48683);
        sb.append(",bytesPerSect=");
        return new String(C5410.m11876(this.f48686, "]", sb));
    }
}
