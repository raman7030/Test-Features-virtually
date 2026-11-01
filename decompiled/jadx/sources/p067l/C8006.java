package p067l;

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
public final class C8006 {

    /* JADX INFO: renamed from: ֡ */
    public long f21030;

    /* JADX INFO: renamed from: ֨ */
    public float f21031;

    /* JADX INFO: renamed from: ֫ */
    public boolean f21032;

    /* JADX INFO: renamed from: ۖ */
    public boolean f21033;

    /* JADX INFO: renamed from: ۗ */
    public final GestureDetector f21034;

    /* JADX INFO: renamed from: ۙ */
    public final float[] f21036;

    /* JADX INFO: renamed from: ۚ */
    public float f21037;

    /* JADX INFO: renamed from: ۛ */
    public boolean f21038;

    /* JADX INFO: renamed from: ۜ */
    public final RunnableC9941 f21039;

    /* JADX INFO: renamed from: ۠ */
    public float f21040;

    /* JADX INFO: renamed from: ۡ */
    public final float f21041;

    /* JADX INFO: renamed from: ۤ */
    public final float f21043;

    /* JADX INFO: renamed from: ۧ */
    public long f21044;

    /* JADX INFO: renamed from: ۬ */
    public final TextureView f21046;

    /* JADX INFO: renamed from: ܶ */
    public float[] f21048;

    /* JADX INFO: renamed from: ܺ */
    public boolean f21049;

    /* JADX INFO: renamed from: ܿ */
    public boolean f21051;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f21052;

    /* JADX INFO: renamed from: ᩶ */
    public ValueAnimator f21055;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f21056;

    /* JADX INFO: renamed from: ᩸ */
    public long f21057;

    /* JADX INFO: renamed from: ᩻ */
    public long f21059;

    /* JADX INFO: renamed from: ۢ */
    public final float[] f21042 = new float[16];

    /* JADX INFO: renamed from: ۫ */
    public final float[] f21045 = new float[16];

    /* JADX INFO: renamed from: ܳ */
    public final float[] f21047 = new float[16];

    /* JADX INFO: renamed from: ᩴ */
    public final C4178 f21053 = new C4178();

    /* JADX INFO: renamed from: ᩹ */
    public int f21058 = -1;

    /* JADX INFO: renamed from: ۘ */
    public final RunnableC6665 f21035 = new Runnable() { // from class: l.ۙ۠ۡ
        @Override // java.lang.Runnable
        public final void run() {
            this.f17194.m18575();
        }
    };

    /* JADX INFO: renamed from: ܽ */
    public final Runnable f21050 = new RunnableC5324(this);

    /* JADX INFO: renamed from: ᩵ */
    public final Runnable f21054 = new RunnableC14711(this);

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۙ۠ۡ] */
    public C8006(TextureView textureView, RunnableC9941 runnableC9941) {
        float[] fArr = new float[16];
        this.f21036 = fArr;
        this.f21046 = textureView;
        this.f21039 = runnableC9941;
        this.f21041 = textureView.getResources().getDisplayMetrics().density;
        this.f21043 = ViewConfiguration.get(textureView.getContext()).getScaledTouchSlop();
        Matrix.setIdentityM(fArr, 0);
        GestureDetector gestureDetector = new GestureDetector(textureView.getContext(), new C14041(this));
        this.f21034 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18584(boolean z) {
        if (this.f21033 == z) {
            return;
        }
        this.f21033 = z;
        if (!z) {
            boolean z2 = this.f21051;
            m18574();
            this.f21052 = z2;
            m18569();
            m18566();
            this.f21058 = -1;
            this.f21049 = false;
            this.f21038 = false;
            TextureView textureView = this.f21046;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            this.f21034.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        float[] fArr = this.f21048;
        if (fArr != null) {
            m18557(fArr, this.f21057, this.f21040);
        } else if (this.f21052) {
            m18575();
        } else {
            m18571();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18583(MotionEvent motionEvent) {
        if (!this.f21033) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        TextureView textureView = this.f21046;
        if (actionMasked == 0) {
            this.f21038 = true;
            this.f21032 = false;
            m18574();
            m18569();
            m18566();
            this.f21058 = -1;
            this.f21049 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f21034.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            if (actionMasked == 3) {
                m18569();
                m18566();
            }
            if (actionMasked == 1 && !this.f21049) {
                textureView.performClick();
            }
            this.f21058 = -1;
            this.f21049 = false;
            this.f21038 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            m18571();
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            this.f21058 = -1;
            this.f21049 = false;
            m18569();
            m18566();
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int pointerId = motionEvent.getPointerId(0);
        if (actionMasked == 2 && this.f21058 == pointerId) {
            float f = x - this.f21037;
            float f2 = y - this.f21031;
            if (!this.f21049 && Math.hypot(f, f2) <= this.f21043) {
                return true;
            }
            this.f21049 = true;
            m18566();
            float f3 = this.f21041;
            float f4 = (f2 / f3) * 0.75f;
            float f5 = (f / f3) * 0.75f;
            m18552(f4, f5);
            this.f21053.m8458(f4, f5);
            if (!this.f21056) {
                this.f21056 = true;
                this.f21030 = 0L;
                textureView.postOnAnimation(this.f21054);
            }
        }
        this.f21058 = pointerId;
        this.f21037 = x;
        this.f21031 = y;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18581(long j, boolean z) {
        float[] fArr = new float[16];
        if (z) {
            Matrix.setRotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
        m18557(fArr, j, 0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18582(boolean z) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        m18557(fArr, 600L, z ? -45.0f : 45.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m18557(final float[] fArr, long j, final float f) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative rotation duration");
        }
        this.f21032 = false;
        m18574();
        m18569();
        m18566();
        this.f21046.removeCallbacks(this.f21035);
        if (!this.f21033) {
            this.f21048 = fArr;
            this.f21057 = j;
            this.f21040 = f;
            return;
        }
        this.f21048 = null;
        this.f21040 = 0.0f;
        float[] fArr2 = new float[16];
        final float[] fArr3 = new float[16];
        Matrix.transposeM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, this.f21036, 0);
        final C9347 c9347 = new C9347(fArr3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f21055 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f21055.setInterpolator(new LinearInterpolator());
        this.f21055.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩶۠ۡ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8006.m18556(this.f67593, fArr, fArr3, c9347, f, valueAnimator);
            }
        });
        this.f21055.addListener(new C12030(this));
        this.f21055.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18556(C8006 c8006, float[] fArr, float[] fArr2, C9347 c9347, float f, ValueAnimator valueAnimator) {
        float[] fArr3 = c8006.f21045;
        float[] fArr4 = c8006.f21042;
        float[] fArr5 = c8006.f21036;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 1.0f) {
            float fMax = Math.max(0.0f, Math.min(1.0f, fFloatValue));
            Matrix.setRotateM(fArr2, 0, (1.0f - ((3.0f - (fMax * 2.0f)) * (fMax * fMax))) * c9347.f25473, c9347.f25474, c9347.f25475, c9347.f25476);
            Matrix.multiplyMM(fArr5, 0, fArr, 0, fArr2, 0);
            if (f != 0.0f) {
                Matrix.setRotateM(fArr4, 0, f * ((float) ((1.0d - Math.cos(((double) fFloatValue) * 6.283185307179586d)) / 2.0d)), -0.819152f, 0.573576f, 0.0f);
                Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
                System.arraycopy(fArr3, 0, fArr5, 0, 16);
            }
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 16);
        }
        c8006.f21039.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m18552(float f, float f2) {
        float fHypot = (float) Math.hypot(f, f2);
        if (fHypot == 0.0f) {
            return;
        }
        float[] fArr = this.f21042;
        Matrix.setRotateM(fArr, 0, fHypot, f, f2, 0.0f);
        float[] fArr2 = this.f21045;
        float[] fArr3 = this.f21036;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr3, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
        this.f21039.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m18569() {
        this.f21056 = false;
        this.f21046.removeCallbacks(this.f21054);
        this.f21053.m8460();
        this.f21030 = 0L;
        m18571();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m18566() {
        ValueAnimator valueAnimator = this.f21055;
        if (valueAnimator != null) {
            this.f21055 = null;
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m18558() {
        return (!this.f21033 || this.f21038 || this.f21056 || this.f21055 != null || this.f21051 || this.f21032) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m18571() {
        TextureView textureView = this.f21046;
        RunnableC6665 runnableC6665 = this.f21035;
        textureView.removeCallbacks(runnableC6665);
        if (m18558()) {
            textureView.postDelayed(runnableC6665, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m18575() {
        if (m18558()) {
            if (!this.f21052) {
                System.arraycopy(this.f21036, 0, this.f21047, 0, 16);
                this.f21044 = 0L;
            }
            this.f21052 = false;
            this.f21059 = System.nanoTime() - this.f21044;
            this.f21051 = true;
            this.f21046.postOnAnimation(this.f21050);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public void m18574() {
        this.f21051 = false;
        this.f21052 = false;
        RunnableC6665 runnableC6665 = this.f21035;
        TextureView textureView = this.f21046;
        textureView.removeCallbacks(runnableC6665);
        textureView.removeCallbacks(this.f21050);
    }
}
