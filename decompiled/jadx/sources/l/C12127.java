package l;

/* JADX INFO: renamed from: l.۫ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12127 implements InterfaceC23100 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36217;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f36218;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f36219;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36220;

    @Override // l.InterfaceC23100
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo29550() {
        return this.f36219 * ((long) this.f36217) * ((long) this.f36220);
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f36217 = C1480.m5123(i + 4, bArr);
        this.f36219 = C1480.m5123(i + 8, bArr);
        this.f36218 = C1480.m5123(i + 12, bArr);
        this.f36220 = C1480.m5121(i + 16, bArr);
        return (i + 20) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f36219);
        sb.append(",free=");
        sb.append(this.f36218);
        sb.append(",sectPerAlloc=");
        sb.append(this.f36217);
        sb.append(",bytesPerSect=");
        return new String(C3200.m9831(this.f36220, "]", sb));
    }
}
