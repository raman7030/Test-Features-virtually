package l;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩴ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18618 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57728;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2390 f57729;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2390 f57730;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Interpolator f57727 = new InterpolatorC3801();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f57726 = true;

    public C18618(Context context) {
        this.f57730 = new C2390(context);
        this.f57729 = new C2390(context);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m43167() {
        return this.f57730.f7635 && this.f57729.f7635;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43166() {
        return this.f57729.f7634;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43165() {
        if (m43167()) {
            return false;
        }
        int i = this.f57728;
        C2390 c2390 = this.f57729;
        C2390 c2391 = this.f57730;
        if (i != 0) {
            if (i == 1) {
                if (!c2391.f7635 && !c2391.m7753() && !c2391.m7751()) {
                    c2391.m7752();
                }
                if (!c2390.f7635 && !c2390.m7753() && !c2390.m7751()) {
                    c2390.m7752();
                }
            }
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - c2391.f7629;
        int i2 = c2391.f7639;
        if (jCurrentAnimationTimeMillis < i2) {
            float interpolation = ((InterpolatorC3801) this.f57727).getInterpolation(jCurrentAnimationTimeMillis / i2);
            c2391.m7748(interpolation);
            c2390.m7748(interpolation);
            return true;
        }
        m43162();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43163(long j, long j2) {
        this.f57728 = 0;
        this.f57730.m7749(0L, 0L);
        this.f57729.m7749(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43164(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        if (!this.f57726 || m43167()) {
            j5 = j2;
            j6 = 0;
            j7 = j5;
        } else {
            float f = this.f57730.f7628;
            float f2 = this.f57729.f7628;
            float f3 = 0L;
            if (Math.signum(f3) == Math.signum(f)) {
                j5 = j2;
                float f4 = j5;
                if (Math.signum(f4) == Math.signum(f2)) {
                    j6 = (long) (f3 + f);
                    j7 = (long) (f4 + f2);
                }
            } else {
                j5 = j2;
            }
            j6 = 0;
            j7 = j5;
        }
        this.f57728 = 1;
        this.f57730.m7750(0L, j6, 0L, 0L, 0L);
        this.f57729.m7750(j, j7, 0L, j3, j4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43162() {
        this.f57730.m7752();
        this.f57729.m7752();
    }
}
