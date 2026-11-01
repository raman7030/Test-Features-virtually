package p067l;

/* JADX INFO: renamed from: l.᩺ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VA0B */
/* JADX INFO: loaded from: classes.dex */
public final class C23952 implements InterfaceC23458, InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ */
    public int f76090;

    /* JADX INFO: renamed from: ᩶ */
    public long f76091;

    /* JADX INFO: renamed from: ᩸ */
    public long f76092;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76093;

    public C23952(boolean z) {
        this.f76093 = z;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        if (this.f76093) {
            this.f76090 = C3775.m7363(i, bArr);
            this.f76092 = (C3775.m7365(i + 4, bArr) << 32) | C3775.m7365(i + 8, bArr);
            this.f76091 = C3775.m7365(i + 16, bArr) | (C3775.m7365(i + 12, bArr) << 32);
            return 20;
        }
        this.f76090 = C3775.m7363(i, bArr);
        this.f76092 = C3775.m7365(i + 2, bArr);
        this.f76091 = C3775.m7365(i + 6, bArr);
        return 10;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        if (this.f76093) {
            C3775.m7364(this.f76090, i, bArr);
            C3775.m7366(this.f76092 >> 32, i + 4, bArr);
            C3775.m7366(this.f76092, i + 8, bArr);
            C3775.m7366(this.f76091 >> 32, i + 12, bArr);
            C3775.m7366(this.f76091, i + 16, bArr);
            return 20;
        }
        C3775.m7364(this.f76090, i, bArr);
        C3775.m7366(this.f76092, i + 2, bArr);
        C3775.m7366(this.f76091, i + 6, bArr);
        return 10;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return this.f76093 ? 20 : 10;
    }
}
