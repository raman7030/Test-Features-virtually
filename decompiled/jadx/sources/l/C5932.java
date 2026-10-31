package l;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.ۛ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5932 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f18176;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f18177;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f18178;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18179;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f18180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f18182;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f18183;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f18184;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC7968 f18185;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f18186;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float f18187;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f18189;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f18190;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextureView f18192;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float[] f18194;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f18195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f18197;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f18198;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ValueAnimator f18201;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f18202;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f18203;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f18205;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float[] f18188 = new float[16];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f18191 = new float[16];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float[] f18193 = new float[16];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1904 f18199 = new C1904();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18204 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC4521 f18181 = new Runnable() { // from class: l.ۙ۠ۡ
        @Override // java.lang.Runnable
        public final void run() {
            this.f14367.m16649();
        }
    };

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f18196 = new RunnableC3110(this);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Runnable f18200 = new RunnableC12987(this);

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۙ۠ۡ] */
    public C5932(TextureView textureView, RunnableC7968 runnableC7968) {
        float[] fArr = new float[16];
        this.f18182 = fArr;
        this.f18192 = textureView;
        this.f18185 = runnableC7968;
        this.f18187 = textureView.getResources().getDisplayMetrics().density;
        this.f18189 = ViewConfiguration.get(textureView.getContext()).getScaledTouchSlop();
        Matrix.setIdentityM(fArr, 0);
        GestureDetector gestureDetector = new GestureDetector(textureView.getContext(), new C12282(this));
        this.f18180 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16658(boolean z) {
        if (this.f18179 == z) {
            return;
        }
        this.f18179 = z;
        if (!z) {
            boolean z2 = this.f18197;
            m16648();
            this.f18198 = z2;
            m16643();
            m16640();
            this.f18204 = -1;
            this.f18195 = false;
            this.f18184 = false;
            TextureView textureView = this.f18192;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            this.f18180.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        float[] fArr = this.f18194;
        if (fArr != null) {
            m16631(fArr, this.f18203, this.f18186);
        } else if (this.f18198) {
            m16649();
        } else {
            m16645();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16657(MotionEvent motionEvent) {
        if (!this.f18179) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        TextureView textureView = this.f18192;
        if (actionMasked == 0) {
            this.f18184 = true;
            this.f18178 = false;
            m16648();
            m16643();
            m16640();
            this.f18204 = -1;
            this.f18195 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f18180.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            if (actionMasked == 3) {
                m16643();
                m16640();
            }
            if (actionMasked == 1 && !this.f18195) {
                textureView.performClick();
            }
            this.f18204 = -1;
            this.f18195 = false;
            this.f18184 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            m16645();
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            this.f18204 = -1;
            this.f18195 = false;
            m16643();
            m16640();
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int pointerId = motionEvent.getPointerId(0);
        if (actionMasked == 2 && this.f18204 == pointerId) {
            float f = x - this.f18183;
            float f2 = y - this.f18177;
            if (!this.f18195 && Math.hypot(f, f2) <= this.f18189) {
                return true;
            }
            this.f18195 = true;
            m16640();
            float f3 = this.f18187;
            float f4 = (f2 / f3) * 0.75f;
            float f5 = (f / f3) * 0.75f;
            m16626(f4, f5);
            this.f18199.m6256(f4, f5);
            if (!this.f18202) {
                this.f18202 = true;
                this.f18176 = 0L;
                textureView.postOnAnimation(this.f18200);
            }
        }
        this.f18204 = pointerId;
        this.f18183 = x;
        this.f18177 = y;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16655(long j, boolean z) {
        float[] fArr = new float[16];
        if (z) {
            Matrix.setRotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
        m16631(fArr, j, 0.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16656(boolean z) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        m16631(fArr, 600L, z ? -45.0f : 45.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16631(final float[] fArr, long j, final float f) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative rotation duration");
        }
        this.f18178 = false;
        m16648();
        m16643();
        m16640();
        this.f18192.removeCallbacks(this.f18181);
        if (!this.f18179) {
            this.f18194 = fArr;
            this.f18203 = j;
            this.f18186 = f;
            return;
        }
        this.f18194 = null;
        this.f18186 = 0.0f;
        float[] fArr2 = new float[16];
        final float[] fArr3 = new float[16];
        Matrix.transposeM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, this.f18182, 0);
        final C7343 c7343 = new C7343(fArr3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18201 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f18201.setInterpolator(new LinearInterpolator());
        this.f18201.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩶۠ۡ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5932.m16630(this.f64951, fArr, fArr3, c7343, f, valueAnimator);
            }
        });
        this.f18201.addListener(new C10166(this));
        this.f18201.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16630(C5932 c5932, float[] fArr, float[] fArr2, C7343 c7343, float f, ValueAnimator valueAnimator) {
        float[] fArr3 = c5932.f18191;
        float[] fArr4 = c5932.f18188;
        float[] fArr5 = c5932.f18182;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 1.0f) {
            float fMax = Math.max(0.0f, Math.min(1.0f, fFloatValue));
            Matrix.setRotateM(fArr2, 0, (1.0f - ((3.0f - (fMax * 2.0f)) * (fMax * fMax))) * c7343.f22560, c7343.f22561, c7343.f22562, c7343.f22563);
            Matrix.multiplyMM(fArr5, 0, fArr, 0, fArr2, 0);
            if (f != 0.0f) {
                Matrix.setRotateM(fArr4, 0, f * ((float) ((1.0d - Math.cos(((double) fFloatValue) * 6.283185307179586d)) / 2.0d)), -0.819152f, 0.573576f, 0.0f);
                Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
                System.arraycopy(fArr3, 0, fArr5, 0, 16);
            }
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 16);
        }
        c5932.f18185.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m16626(float f, float f2) {
        float fHypot = (float) Math.hypot(f, f2);
        if (fHypot == 0.0f) {
            return;
        }
        float[] fArr = this.f18188;
        Matrix.setRotateM(fArr, 0, fHypot, f, f2, 0.0f);
        float[] fArr2 = this.f18191;
        float[] fArr3 = this.f18182;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr3, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
        this.f18185.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m16643() {
        this.f18202 = false;
        this.f18192.removeCallbacks(this.f18200);
        this.f18199.m6258();
        this.f18176 = 0L;
        m16645();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m16640() {
        ValueAnimator valueAnimator = this.f18201;
        if (valueAnimator != null) {
            this.f18201 = null;
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m16632() {
        return (!this.f18179 || this.f18184 || this.f18202 || this.f18201 != null || this.f18197 || this.f18178) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m16645() {
        TextureView textureView = this.f18192;
        RunnableC4521 runnableC4521 = this.f18181;
        textureView.removeCallbacks(runnableC4521);
        if (m16632()) {
            textureView.postDelayed(runnableC4521, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m16649() {
        if (m16632()) {
            if (!this.f18198) {
                System.arraycopy(this.f18182, 0, this.f18193, 0, 16);
                this.f18190 = 0L;
            }
            this.f18198 = false;
            this.f18205 = System.nanoTime() - this.f18190;
            this.f18197 = true;
            this.f18192.postOnAnimation(this.f18196);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m16648() {
        this.f18197 = false;
        this.f18198 = false;
        RunnableC4521 runnableC4521 = this.f18181;
        TextureView textureView = this.f18192;
        textureView.removeCallbacks(runnableC4521);
        textureView.removeCallbacks(this.f18196);
    }
}
