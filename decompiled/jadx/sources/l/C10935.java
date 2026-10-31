package l;

/* JADX INFO: renamed from: l.ۧۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10935 extends C1875 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f32955;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f32956;

    public C10935(C13111 c13111, int i) {
        super(c13111);
        this.f32956 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0463 mo6211(int i) {
        long j = this.f32955 + 1;
        this.f32955 = j;
        if ((j & 1023) == 0) {
            C20813.m47630();
            if (this.f32955 > this.f32956) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo6211(i);
    }
}
