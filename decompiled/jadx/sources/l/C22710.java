package l;

/* JADX INFO: renamed from: l.᩺ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VA0B */
/* JADX INFO: loaded from: classes.dex */
public final class C22710 implements InterfaceC22190, InterfaceC8079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73366;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f73367;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f73368;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f73369;

    public C22710(boolean z) {
        this.f73369 = z;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        if (this.f73369) {
            this.f73366 = C1480.m5121(i, bArr);
            this.f73368 = (C1480.m5123(i + 4, bArr) << 32) | C1480.m5123(i + 8, bArr);
            this.f73367 = C1480.m5123(i + 16, bArr) | (C1480.m5123(i + 12, bArr) << 32);
            return 20;
        }
        this.f73366 = C1480.m5121(i, bArr);
        this.f73368 = C1480.m5123(i + 2, bArr);
        this.f73367 = C1480.m5123(i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        if (this.f73369) {
            C1480.m5122(this.f73366, i, bArr);
            C1480.m5124(this.f73368 >> 32, i + 4, bArr);
            C1480.m5124(this.f73368, i + 8, bArr);
            C1480.m5124(this.f73367 >> 32, i + 12, bArr);
            C1480.m5124(this.f73367, i + 16, bArr);
            return 20;
        }
        C1480.m5122(this.f73366, i, bArr);
        C1480.m5124(this.f73368, i + 2, bArr);
        C1480.m5124(this.f73367, i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return this.f73369 ? 20 : 10;
    }
}
