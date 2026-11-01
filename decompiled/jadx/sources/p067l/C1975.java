package p067l;

import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.᩺۟ */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1975 {

    /* JADX INFO: renamed from: ۜ */
    public float f76443;

    /* JADX INFO: renamed from: ۢ */
    public float f76444;

    /* JADX INFO: renamed from: ܽ */
    public int f76447;

    /* JADX INFO: renamed from: ܿ */
    public int f76448;

    /* JADX INFO: renamed from: ᩳ */
    public int f76449;

    /* JADX INFO: renamed from: ᩷ */
    public float f76450;

    /* JADX INFO: renamed from: ܳ */
    public long f76446 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩻ */
    public long f76451 = -1;

    /* JADX INFO: renamed from: ֫ */
    public long f76442 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f76445 = 0;

    /* JADX INFO: renamed from: ۜ */
    public final void m53341() {
        this.f76448 = 500;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m53348() {
        this.f76449 = 500;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m53347() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f76446 = jCurrentAnimationTimeMillis;
        this.f76451 = -1L;
        this.f76442 = jCurrentAnimationTimeMillis;
        this.f76443 = 0.5f;
        this.f76445 = 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m53343() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (jCurrentAnimationTimeMillis - this.f76446);
        int i2 = this.f76449;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f76447 = i;
        this.f76443 = m53338(jCurrentAnimationTimeMillis);
        this.f76451 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m53345() {
        return this.f76451 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f76451 + ((long) this.f76447);
    }

    /* JADX INFO: renamed from: ֫ */
    private float m53338(long j) {
        long j2 = this.f76446;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f76451;
        if (j3 < 0 || j < j3) {
            return AbstractViewOnTouchListenerC1205.m21569((j - j2) / this.f76448, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f76443;
        return (f * AbstractViewOnTouchListenerC1205.m21569((j - j3) / this.f76447, 0.0f, 1.0f)) + (1.0f - f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53339() {
        if (this.f76442 == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float fM53338 = m53338(jCurrentAnimationTimeMillis);
        long j = jCurrentAnimationTimeMillis - this.f76442;
        this.f76442 = jCurrentAnimationTimeMillis;
        this.f76445 = (int) (j * ((fM53338 * 4.0f) + ((-4.0f) * fM53338 * fM53338)) * this.f76444);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53340(float f, float f2) {
        this.f76450 = f;
        this.f76444 = f2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53344() {
        Math.abs(this.f76450);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m53346() {
        float f = this.f76444;
        return (int) (f / Math.abs(f));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m53342() {
        return this.f76445;
    }
}
