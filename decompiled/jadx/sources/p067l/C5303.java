package p067l;

/* JADX INFO: renamed from: l.ۗ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5303 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f12465 = false;

    /* JADX INFO: renamed from: ۧ */
    public C6644 f12466 = null;

    /* JADX INFO: renamed from: ܽ */
    public int f12467 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ܿ */
    public final int f12468;

    /* JADX INFO: renamed from: ᩳ */
    public final float f12469;

    public C5303(float f, int i) {
        this.f12469 = f;
        this.f12468 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m11484(C6644 c6644, float f) {
        float f2 = c6644.f17145;
        float f3 = this.f12469;
        float fAbs = Math.abs((f2 * f3) - f);
        float fAbs2 = Math.abs((c6644.f17144 * f3) - f);
        int i = this.f12468 * 2;
        if (fAbs <= fAbs2) {
            return fAbs <= ((float) i) ? -1 : 0;
        }
        return fAbs2 <= ((float) i) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6644 m11482() {
        if (this.f12465) {
            return this.f12466;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11483(C6644 c6644, float f) {
        int iMin;
        float f2 = c6644.f17145;
        float f3 = this.f12469;
        int iAbs = (int) Math.abs((f2 * f3) - f);
        int iAbs2 = (int) Math.abs((c6644.f17144 * f3) - f);
        float f4 = c6644.f17145 * f3;
        int i = this.f12468;
        float f5 = i;
        if (f4 - f5 < f && f < (c6644.f17144 * f3) + f5) {
            iMin = Math.min(iAbs, iAbs2);
        } else {
            iMin = -Math.min(iAbs, iAbs2);
        }
        if (iMin >= 0) {
            this.f12465 = true;
        } else {
            iMin = -iMin;
            if (iMin > i * 4) {
                return;
            }
        }
        if (iMin < this.f12467) {
            this.f12466 = c6644;
            this.f12467 = iMin;
        }
    }
}
