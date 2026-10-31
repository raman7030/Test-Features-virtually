package l;

/* JADX INFO: renamed from: l.ۧۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10709 extends C9130 implements InterfaceC23408 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f32288;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f32289;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f32290;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f32291;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f32292;

    public C10709(int i, int i2, long j, long j2, boolean z) {
        super(i, i2, j, j2, z);
        this.f32289 = j2;
        this.f32292 = i;
        this.f32291 = i2;
        this.f32288 = z;
        this.f32290 = j == -1 ? -1L : j;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ۧ */
    public final long mo17868() {
        return this.f32289;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩳ */
    public final long mo17870() {
        return this.f32290;
    }

    @Override // l.InterfaceC23408
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17871() {
        return this.f32292;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10709 m26889(long j) {
        return new C10709(this.f32292, this.f32291, j, this.f32289, this.f32288);
    }
}
