package l;

/* JADX INFO: renamed from: l.ۗ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3088 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9662 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4499 f9663 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9664 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f9665;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f9666;

    public C3088(float f, int i) {
        this.f9666 = f;
        this.f9665 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9441(C4499 c4499, float f) {
        float f2 = c4499.f14318;
        float f3 = this.f9666;
        float fAbs = Math.abs((f2 * f3) - f);
        float fAbs2 = Math.abs((c4499.f14317 * f3) - f);
        int i = this.f9665 * 2;
        if (fAbs <= fAbs2) {
            return fAbs <= ((float) i) ? -1 : 0;
        }
        return fAbs2 <= ((float) i) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4499 m9439() {
        if (this.f9662) {
            return this.f9663;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9440(C4499 c4499, float f) {
        int iMin;
        float f2 = c4499.f14318;
        float f3 = this.f9666;
        int iAbs = (int) Math.abs((f2 * f3) - f);
        int iAbs2 = (int) Math.abs((c4499.f14317 * f3) - f);
        float f4 = c4499.f14318 * f3;
        int i = this.f9665;
        float f5 = i;
        if (f4 - f5 < f && f < (c4499.f14317 * f3) + f5) {
            iMin = Math.min(iAbs, iAbs2);
        } else {
            iMin = -Math.min(iAbs, iAbs2);
        }
        if (iMin >= 0) {
            this.f9662 = true;
        } else {
            iMin = -iMin;
            if (iMin > i * 4) {
                return;
            }
        }
        if (iMin < this.f9664) {
            this.f9663 = c4499;
            this.f9664 = iMin;
        }
    }
}
