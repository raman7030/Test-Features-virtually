package p067l;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩴ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20063 {

    /* JADX INFO: renamed from: ܽ */
    public int f60950;

    /* JADX INFO: renamed from: ܿ */
    public final C4640 f60951;

    /* JADX INFO: renamed from: ᩳ */
    public final C4640 f60952;

    /* JADX INFO: renamed from: ۧ */
    public Interpolator f60949 = new InterpolatorC5981();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f60948 = true;

    public C20063(Context context) {
        this.f60952 = new C4640(context);
        this.f60951 = new C4640(context);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m45432() {
        return this.f60952.f10426 && this.f60951.f10426;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m45431() {
        return this.f60951.f10425;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45430() {
        if (m45432()) {
            return false;
        }
        int i = this.f60950;
        C4640 c4640 = this.f60951;
        C4640 c4641 = this.f60952;
        if (i != 0) {
            if (i == 1) {
                if (!c4641.f10426 && !c4641.m9814() && !c4641.m9812()) {
                    c4641.m9813();
                }
                if (!c4640.f10426 && !c4640.m9814() && !c4640.m9812()) {
                    c4640.m9813();
                }
            }
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - c4641.f10420;
        int i2 = c4641.f10430;
        if (jCurrentAnimationTimeMillis < i2) {
            float interpolation = ((InterpolatorC5981) this.f60949).getInterpolation(jCurrentAnimationTimeMillis / i2);
            c4641.m9809(interpolation);
            c4640.m9809(interpolation);
            return true;
        }
        m45427();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45428(long j, long j2) {
        this.f60950 = 0;
        this.f60952.m9810(0L, 0L);
        this.f60951.m9810(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX INFO: renamed from: ֫ */
    public final void m45429(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        if (!this.f60948 || m45432()) {
            j5 = j2;
            j6 = 0;
            j7 = j5;
        } else {
            float f = this.f60952.f10419;
            float f2 = this.f60951.f10419;
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
        this.f60950 = 1;
        this.f60952.m9811(0L, j6, 0L, 0L, 0L);
        this.f60951.m9811(j, j7, 0L, j3, j4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45427() {
        this.f60952.m9813();
        this.f60951.m9813();
    }
}
