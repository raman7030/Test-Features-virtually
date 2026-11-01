package p067l;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.۟۟ */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC1205 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final int f25344 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ֫֫ */
    public Runnable f25345;

    /* JADX INFO: renamed from: ۗ */
    public int f25346;

    /* JADX INFO: renamed from: ۙ */
    public final AccelerateInterpolator f25347;

    /* JADX INFO: renamed from: ۛ */
    public float[] f25348;

    /* JADX INFO: renamed from: ۟ */
    public float[] f25349;

    /* JADX INFO: renamed from: ۤ */
    public float[] f25350;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C1975 f25351;

    /* JADX INFO: renamed from: ۨ */
    public boolean f25352;

    /* JADX INFO: renamed from: ۫ */
    public float[] f25353;

    /* JADX INFO: renamed from: ۬ */
    public boolean f25354;

    /* JADX INFO: renamed from: ܰ */
    public float[] f25355;

    /* JADX INFO: renamed from: ܽ֫ */
    public final View f25356;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25357;

    /* JADX INFO: renamed from: ᩸ */
    public int f25358;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f25359;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f25360;

    /* JADX INFO: renamed from: ֫ */
    public static float m21569(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo21572(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo21573(int i);

    public AbstractViewOnTouchListenerC1205(View view) {
        C1975 c1975 = new C1975();
        this.f25351 = c1975;
        this.f25347 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f25355 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f25353 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f25349 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f25348 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f25350 = fArr5;
        this.f25356 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f25346 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f25358 = f25344;
        c1975.m53341();
        c1975.m53348();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21571(boolean z) {
        if (this.f25354 && !z) {
            if (this.f25360) {
                this.f25357 = false;
            } else {
                this.f25351.m53343();
            }
        }
        this.f25354 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f25354) {
            int actionMasked = motionEvent.getActionMasked();
            C1975 c1975 = this.f25351;
            if (actionMasked == 0) {
                this.f25352 = true;
                this.f25359 = false;
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                if (this.f25360) {
                    this.f25357 = false;
                    return false;
                }
                c1975.m53343();
                return false;
            }
            float x = motionEvent.getX();
            float width = view.getWidth();
            View view2 = this.f25356;
            c1975.m53340(m21570(0, x, width, view2.getWidth()), m21570(1, motionEvent.getY(), view.getHeight(), view2.getHeight()));
            if (!this.f25357) {
                int iM53346 = c1975.m53346();
                c1975.m53344();
                if (iM53346 != 0 && mo21572(iM53346)) {
                    if (this.f25345 == null) {
                        this.f25345 = new RunnableC1520(this);
                    }
                    this.f25357 = true;
                    this.f25360 = true;
                    if (!this.f25359 && (i = this.f25358) > 0) {
                        Runnable runnable = this.f25345;
                        long j = i;
                        int i2 = C1717.f57146;
                        view2.postOnAnimationDelayed(runnable, j);
                    } else {
                        ((RunnableC1520) this.f25345).run();
                    }
                    this.f25359 = true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX INFO: renamed from: ֫ */
    private float m21570(int i, float f, float f2, float f3) {
        float fM21569;
        float interpolation;
        float f4;
        float f5;
        float f6;
        float fM215610 = m21569(this.f25355[i] * f2, 0.0f, this.f25353[i]);
        float fM21568 = m21568(f2 - f, fM215610) - m21568(f, fM215610);
        AccelerateInterpolator accelerateInterpolator = this.f25347;
        if (fM21568 >= 0.0f) {
            if (fM21568 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM21568);
            } else {
                fM21569 = 0.0f;
            }
            if (fM21569 == 0.0f) {
                return 0.0f;
            }
            float f7 = this.f25349[i];
            f4 = this.f25348[i];
            f5 = this.f25350[i];
            f6 = f7 * f3;
            if (fM21569 > 0.0f) {
                return m21569(fM21569 * f6, f4, f5);
            }
            return -m21569((-fM21569) * f6, f4, f5);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM21568);
        fM21569 = m21569(interpolation, -1.0f, 1.0f);
        if (fM21569 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f25349[i];
        f4 = this.f25348[i];
        f5 = this.f25350[i];
        f6 = f8 * f3;
        if (fM21569 > 0.0f) {
            return m21569(fM21569 * f6, f4, f5);
        }
        return -m21569((-fM21569) * f6, f4, f5);
    }

    /* JADX INFO: renamed from: ֫ */
    private float m21568(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f25346;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f25357 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }
}
