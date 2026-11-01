package p067l;

/* JADX INFO: renamed from: l.ۧۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12546 extends C11046 implements InterfaceC24615 {

    /* JADX INFO: renamed from: ۜ */
    public final boolean f35263;

    /* JADX INFO: renamed from: ۡ */
    public final long f35264;

    /* JADX INFO: renamed from: ۢ */
    public final long f35265;

    /* JADX INFO: renamed from: ܺ */
    public final int f35266;

    /* JADX INFO: renamed from: ᩷ */
    public final int f35267;

    public C12546(int i, int i2, long j, long j2, boolean z) {
        super(i, i2, j, j2, z);
        this.f35264 = j2;
        this.f35267 = i;
        this.f35266 = i2;
        this.f35263 = z;
        this.f35265 = j == -1 ? -1L : j;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ۧ */
    public final long mo19816() {
        return this.f35264;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩳ */
    public final long mo19818() {
        return this.f35265;
    }

    @Override // p067l.InterfaceC24615
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19819() {
        return this.f35267;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C12546 m28929(long j) {
        return new C12546(this.f35267, this.f35266, j, this.f35264, this.f35263);
    }
}
