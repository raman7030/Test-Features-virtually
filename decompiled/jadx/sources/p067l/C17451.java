package p067l;

/* JADX INFO: renamed from: l.ܺۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17451 {

    /* JADX INFO: renamed from: ֫ */
    public C4712 f52183;

    /* JADX INFO: renamed from: ۧ */
    public long f52184;

    /* JADX INFO: renamed from: ܽ */
    public C4712 f52185;

    /* JADX INFO: renamed from: ܽ */
    public final void m39785(C4712 c4712) {
        this.f52185 = c4712;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4712 m39786() {
        C4712 c4712 = this.f52185;
        this.f52185 = null;
        return c4712;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39787(C4712 c4712) {
        if (this.f52183 != null) {
            throw new IllegalStateException("HLS preview frame is already pending");
        }
        this.f52183 = c4712;
        this.f52184 = c4712.m9990();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39781(C4712 c4712) {
        C4712 c4713 = this.f52183;
        if (c4713 == null || c4713.m9990() != c4712.m9990()) {
            return false;
        }
        this.f52183 = null;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39783(C4712 c4712) {
        C4712 c4713 = this.f52185;
        return c4713 != null && c4713.m9990() > c4712.m9990();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39782() {
        return this.f52183 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m39784() {
        return this.f52184;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39780() {
        this.f52185 = null;
        this.f52183 = null;
        this.f52184 = 0L;
    }
}
