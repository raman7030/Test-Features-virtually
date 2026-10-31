package l;

/* JADX INFO: renamed from: l.ܺۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15870 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2466 f49045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f49046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2466 f49047;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37613(C2466 c2466) {
        this.f49047 = c2466;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2466 m37614() {
        C2466 c2466 = this.f49047;
        this.f49047 = null;
        return c2466;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37615(C2466 c2466) {
        if (this.f49045 != null) {
            throw new IllegalStateException("HLS preview frame is already pending");
        }
        this.f49045 = c2466;
        this.f49046 = c2466.m7942();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37609(C2466 c2466) {
        C2466 c2467 = this.f49045;
        if (c2467 == null || c2467.m7942() != c2466.m7942()) {
            return false;
        }
        this.f49045 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37611(C2466 c2466) {
        C2466 c2467 = this.f49047;
        return c2467 != null && c2467.m7942() > c2466.m7942();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37610() {
        return this.f49045 != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m37612() {
        return this.f49046;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37608() {
        this.f49047 = null;
        this.f49045 = null;
        this.f49046 = 0L;
    }
}
