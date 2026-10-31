package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes5.dex */
public class C18675 extends C11619 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Paint f59016;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f59017;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f59018;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f59019;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RunnableC3858 f59021;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59022;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f59023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f59024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14792 f59025;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f59026;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f59027;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float f59028;

    public C18675(ActivityC0921 activityC0921) {
        super(activityC0921);
        this.f59016 = new Paint();
        this.f59025 = new C14792(3);
        this.f59021 = new RunnableC3858(0, this);
        this.f59018 = -1L;
        float f = activityC0921.getResources().getDisplayMetrics().density;
        this.f59024 = 8.0f * f;
        this.f59028 = f * 48.0f;
        this.f59019 = ViewConfiguration.get(activityC0921).getScaledTouchSlop();
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f59018 = SystemClock.uptimeMillis();
        RunnableC3858 runnableC3858 = this.f59021;
        if (runnableC3858 == null) {
            return;
        }
        removeCallbacks(runnableC3858);
        postDelayed(runnableC3858, 1500L);
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int iComputeVerticalScrollRange = computeVerticalScrollRange();
        int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
        int i = iComputeVerticalScrollRange - iComputeVerticalScrollExtent;
        int width = getWidth();
        int height = getHeight();
        C14792 c14792 = this.f59025;
        if (width > 0 && height > 0 && i > 0 && iComputeVerticalScrollExtent > 0 && (this.f59022 || iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            float fM43293 = m43293(jUptimeMillis);
            if (fM43293 > 0.0f) {
                this.f59020 = true;
                float f = height;
                float fMin = Math.min(this.f59028, f);
                float fMax = i != 0 ? ((f - fMin) * Math.max(0, Math.min(computeVerticalScrollOffset(), i))) / i : 0.0f;
                float f2 = width;
                float f3 = this.f59024;
                c14792.m35175(f2 - f3, fMax, f2, fMax + fMin);
                float scrollX = getScrollX() + width;
                float scrollY = getScrollY();
                Paint paint = this.f59016;
                paint.setColor((((int) (57 * fM43293)) << 24) | 7829367);
                float f4 = scrollX - (f3 * fM43293);
                canvas.drawRect(f4, scrollY, scrollX, f + scrollY, paint);
                int i2 = this.f59022 ? C21943.f70257 : -579373193;
                paint.setColor((i2 & 16777215) | (((int) (((i2 >>> 24) & 255) * fM43293)) << 24));
                float f5 = scrollY + fMax;
                canvas.drawRect(f4, f5, scrollX, f5 + fMin, paint);
                if (this.f59022 || jUptimeMillis - this.f59018 < 1500) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
        }
        this.f59020 = false;
        c14792.m35174();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m43293(long j) {
        if (!this.f59022) {
            long j2 = this.f59018;
            if (j2 < 0) {
                return 0.0f;
            }
            long j3 = j - j2;
            if (j3 < 0 || j3 > 1800) {
                return 0.0f;
            }
            if (j3 > 1500) {
                return 1.0f - ((j3 - 1500) / 300.0f);
            }
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43294() {
        this.f59023 = false;
        this.f59022 = true;
        this.f59017 = this.f59025.f45166 - this.f59027;
        removeCallbacks(this.f59021);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43295(float f) {
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        float height = getHeight() - Math.min(this.f59028, getHeight());
        if (iComputeVerticalScrollRange <= 0 || height <= 0.0f) {
            return;
        }
        scrollTo(getScrollX(), Math.round(iComputeVerticalScrollRange * Math.max(0.0f, Math.min((f + this.f59017) / height, 1.0f))));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f59022) {
            if (actionMasked == 2) {
                m43295(motionEvent.getY());
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.f59022 = false;
                this.f59018 = SystemClock.uptimeMillis();
                RunnableC3858 runnableC3858 = this.f59021;
                if (runnableC3858 != null) {
                    removeCallbacks(runnableC3858);
                    postDelayed(runnableC3858, 1500L);
                    invalidate();
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        if (actionMasked == 0) {
            this.f59023 = false;
            int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
            int iComputeVerticalScrollRange = computeVerticalScrollRange();
            if (this.f59020 && m43293(SystemClock.uptimeMillis()) > 0.0f) {
                C14792 c14792 = this.f59025;
                if (c14792.f45167 > c14792.f45163 && c14792.f45162 > c14792.f45166 && iComputeVerticalScrollExtent > 0 && iComputeVerticalScrollRange > iComputeVerticalScrollExtent && iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f) {
                    this.f59026 = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f59027 = y;
                    if (c14792.m35178(this.f59026, y)) {
                        m43294();
                        return true;
                    }
                    this.f59023 = c14792.m35177(this.f59026, this.f59027);
                }
            }
        } else if (actionMasked == 1) {
            this.f59023 = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3 || actionMasked == 5) {
                this.f59023 = false;
            }
        } else if (this.f59023) {
            float x = motionEvent.getX() - this.f59026;
            float y2 = motionEvent.getY() - this.f59027;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                this.f59023 = false;
            } else {
                float fAbs = Math.abs(y2);
                float f = this.f59019;
                if (fAbs > f && Math.abs(y2) > Math.abs(x)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    m43294();
                    m43295(motionEvent.getY());
                    return true;
                }
                if (Math.abs(x) > f) {
                    this.f59023 = false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f59021);
        super.onDetachedFromWindow();
    }
}
