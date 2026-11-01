package p067l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.ܳ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16427 {

    /* JADX INFO: renamed from: ֫ */
    public float f48276;

    /* JADX INFO: renamed from: ۧ */
    public float f48277;

    /* JADX INFO: renamed from: ܳ */
    public final RectF f48278 = new RectF();

    /* JADX INFO: renamed from: ܽ */
    public final int f48279;

    /* JADX INFO: renamed from: ܿ */
    public float f48280;

    /* JADX INFO: renamed from: ᩳ */
    public float f48281;

    public C16427(int i) {
        this.f48279 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37322(float f, float f2, float f3, float f4) {
        m37323(this.f48279, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37323(int i, float f, float f2, float f3, float f4) {
        this.f48277 = f;
        this.f48280 = f2;
        this.f48281 = f3;
        this.f48276 = f4;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (i == -1) {
            throw new IllegalStateException();
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    f3 += f5 * 2.5f;
                } else if (i == 3) {
                    f -= f5 * 2.5f;
                }
                float f7 = f6 / 2.0f;
                f2 -= f7;
                f4 += f7;
            } else {
                f2 -= f6 * 2.5f;
            }
            this.f48278.set(f, f2, f3, f4);
        }
        f4 += f6 * 2.5f;
        float f8 = f5 / 2.0f;
        f -= f8;
        f3 += f8;
        this.f48278.set(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37321() {
        this.f48276 = 0.0f;
        this.f48280 = 0.0f;
        this.f48281 = 0.0f;
        this.f48277 = 0.0f;
        this.f48278.setEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37324(float f, float f2) {
        return this.f48278.contains(f, f2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m37325(float f, float f2) {
        return f >= this.f48277 && f <= this.f48281 && f2 >= this.f48280 && f2 <= this.f48276;
    }
}
