package p067l;

/* JADX INFO: renamed from: l.᩻ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes.dex */
public final class C24816 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f79277;

    /* JADX INFO: renamed from: ۧ */
    public int f79278;

    /* JADX INFO: renamed from: ܳ */
    public int f79279;

    /* JADX INFO: renamed from: ܽ */
    public int f79280;

    /* JADX INFO: renamed from: ܿ */
    public int f79281;

    /* JADX INFO: renamed from: ᩳ */
    public int f79282;

    /* JADX INFO: renamed from: ᩻ */
    public C8723 f79283;

    /* JADX INFO: renamed from: ֫ */
    public final void m54508(C8723 c8723, int i, int i2) {
        c8723.m20173(i, i2);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context cursor range");
        }
        this.f79283 = c8723;
        this.f79282 = i2;
        this.f79281 = c8723.f23643.m44257(i - c8723.f23647);
        m54506(i);
        this.f79277 = true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m54512() {
        if (!this.f79277 || this.f79278 >= this.f79282) {
            this.f79277 = false;
            return false;
        }
        this.f79281++;
        m54506(this.f79283.f23647 + this.f79283.f23643.m44258(this.f79281));
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m54511() {
        this.f79283 = null;
        this.f79277 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m54510() {
        return this.f79279;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54507() {
        return this.f79278;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m54509() {
        return this.f79280;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54506(int i) {
        this.f79279 = i;
        this.f79278 = Math.min(this.f79282, this.f79283.f23647 + this.f79283.f23643.m44266(this.f79281));
        this.f79280 = this.f79283.f23643.m44265(this.f79281);
    }
}
