package l;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC7314 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final int f22453 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Runnable f22454;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f22455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AccelerateInterpolator f22456;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float[] f22457;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float[] f22458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float[] f22459;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22836 f22460;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22461;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float[] f22462;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22463;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float[] f22464;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final View f22465;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22467;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22468;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f22469;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m19601(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19604(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo19605(int i);

    public AbstractViewOnTouchListenerC7314(View view) {
        C22836 c22836 = new C22836();
        this.f22460 = c22836;
        this.f22456 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f22464 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22462 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f22458 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f22457 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22459 = fArr5;
        this.f22465 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f22455 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f22467 = f22453;
        c22836.m50951();
        c22836.m50958();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19603(boolean z) {
        if (this.f22463 && !z) {
            if (this.f22469) {
                this.f22466 = false;
            } else {
                this.f22460.m50953();
            }
        }
        this.f22463 = z;
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
        if (this.f22463) {
            int actionMasked = motionEvent.getActionMasked();
            C22836 c22836 = this.f22460;
            if (actionMasked == 0) {
                this.f22461 = true;
                this.f22468 = false;
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                if (this.f22469) {
                    this.f22466 = false;
                    return false;
                }
                c22836.m50953();
                return false;
            }
            float x = motionEvent.getX();
            float width = view.getWidth();
            View view2 = this.f22465;
            c22836.m50950(m19602(0, x, width, view2.getWidth()), m19602(1, motionEvent.getY(), view.getHeight(), view2.getHeight()));
            if (!this.f22466) {
                int iM50956 = c22836.m50956();
                c22836.m50954();
                if (iM50956 != 0 && mo19604(iM50956)) {
                    if (this.f22454 == null) {
                        this.f22454 = new RunnableC13663(this);
                    }
                    this.f22466 = true;
                    this.f22469 = true;
                    if (!this.f22468 && (i = this.f22467) > 0) {
                        Runnable runnable = this.f22454;
                        long j = i;
                        int i2 = C17648.f53953;
                        view2.postOnAnimationDelayed(runnable, j);
                    } else {
                        ((RunnableC13663) this.f22454).run();
                    }
                    this.f22468 = true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19602(int i, float f, float f2, float f3) {
        float fM19601;
        float interpolation;
        float f4;
        float f5;
        float f6;
        float fM19602 = m19601(this.f22464[i] * f2, 0.0f, this.f22462[i]);
        float fM19600 = m19600(f2 - f, fM19602) - m19600(f, fM19602);
        AccelerateInterpolator accelerateInterpolator = this.f22456;
        if (fM19600 >= 0.0f) {
            if (fM19600 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM19600);
            } else {
                fM19601 = 0.0f;
            }
            if (fM19601 == 0.0f) {
                return 0.0f;
            }
            float f7 = this.f22458[i];
            f4 = this.f22457[i];
            f5 = this.f22459[i];
            f6 = f7 * f3;
            if (fM19601 > 0.0f) {
                return m19601(fM19601 * f6, f4, f5);
            }
            return -m19601((-fM19601) * f6, f4, f5);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM19600);
        fM19601 = m19601(interpolation, -1.0f, 1.0f);
        if (fM19601 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f22458[i];
        f4 = this.f22457[i];
        f5 = this.f22459[i];
        f6 = f8 * f3;
        if (fM19601 > 0.0f) {
            return m19601(fM19601 * f6, f4, f5);
        }
        return -m19601((-fM19601) * f6, f4, f5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19600(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f22455;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f22466 && i == 1) {
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
