package p067l;

/* JADX INFO: renamed from: l.۫ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13894 implements InterfaceC24323 {

    /* JADX INFO: renamed from: ۙ */
    public int f39229;

    /* JADX INFO: renamed from: ᩶ */
    public long f39230;

    /* JADX INFO: renamed from: ᩸ */
    public long f39231;

    /* JADX INFO: renamed from: ᩹ */
    public int f39232;

    @Override // p067l.InterfaceC24323
    /* JADX INFO: renamed from: ᩳ */
    public final long mo31614() {
        return this.f39231 * ((long) this.f39229) * ((long) this.f39232);
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f39229 = C3775.m7365(i + 4, bArr);
        this.f39231 = C3775.m7365(i + 8, bArr);
        this.f39230 = C3775.m7365(i + 12, bArr);
        this.f39232 = C3775.m7363(i + 16, bArr);
        return (i + 20) - i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbInfoAllocation[alloc=");
        sb.append(this.f39231);
        sb.append(",free=");
        sb.append(this.f39230);
        sb.append(",sectPerAlloc=");
        sb.append(this.f39229);
        sb.append(",bytesPerSect=");
        return new String(C5410.m11876(this.f39232, "]", sb));
    }
}
