package p067l;

/* JADX INFO: renamed from: l.᩸ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA1R */
/* JADX INFO: loaded from: classes5.dex */
public final class C22612 implements InterfaceC24323 {

    /* JADX INFO: renamed from: ۙ */
    public int f71356;

    /* JADX INFO: renamed from: ᩶ */
    public long f71357;

    /* JADX INFO: renamed from: ᩸ */
    public long f71358;

    /* JADX INFO: renamed from: ᩹ */
    public int f71359;

    @Override // p067l.InterfaceC24323
    /* JADX INFO: renamed from: ᩳ */
    public final long mo31614() {
        return this.f71358 * ((long) this.f71356) * ((long) this.f71359);
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f71358 = C3775.m7367(i, bArr);
        this.f71357 = C3775.m7367(i + 8, bArr);
        this.f71356 = C3775.m7365(i + 16, bArr);
        this.f71359 = C3775.m7365(i + 20, bArr);
        return (i + 24) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f71358);
        sb.append(",free=");
        sb.append(this.f71357);
        sb.append(",sectPerAlloc=");
        sb.append(this.f71356);
        sb.append(",bytesPerSect=");
        return new String(C5410.m11876(this.f71359, "]", sb));
    }
}
