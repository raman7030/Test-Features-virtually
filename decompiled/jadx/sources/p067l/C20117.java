package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes5.dex */
public class C20117 extends C13411 {

    /* JADX INFO: renamed from: ۗ */
    public final Paint f62239;

    /* JADX INFO: renamed from: ۙ */
    public float f62240;

    /* JADX INFO: renamed from: ۛ */
    public long f62241;

    /* JADX INFO: renamed from: ۟ */
    public final int f62242;

    /* JADX INFO: renamed from: ۤ */
    public boolean f62243;

    /* JADX INFO: renamed from: ۨ */
    public final RunnableC6035 f62244;

    /* JADX INFO: renamed from: ۫ */
    public boolean f62245;

    /* JADX INFO: renamed from: ۬ */
    public boolean f62246;

    /* JADX INFO: renamed from: ܰ */
    public final float f62247;

    /* JADX INFO: renamed from: ᩶ */
    public final C16427 f62248;

    /* JADX INFO: renamed from: ᩸ */
    public float f62249;

    /* JADX INFO: renamed from: ᩹ */
    public float f62250;

    /* JADX INFO: renamed from: ᩺ */
    public final float f62251;

    public C20117(ActivityC3244 activityC3244) {
        super(activityC3244);
        this.f62239 = new Paint();
        this.f62248 = new C16427(3);
        this.f62244 = new RunnableC6035(0, this);
        this.f62241 = -1L;
        float f = activityC3244.getResources().getDisplayMetrics().density;
        this.f62247 = 8.0f * f;
        this.f62251 = f * 48.0f;
        this.f62242 = ViewConfiguration.get(activityC3244).getScaledTouchSlop();
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f62241 = SystemClock.uptimeMillis();
        RunnableC6035 runnableC6035 = this.f62244;
        if (runnableC6035 == null) {
            return;
        }
        removeCallbacks(runnableC6035);
        postDelayed(runnableC6035, 1500L);
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
        C16427 c16427 = this.f62248;
        if (width > 0 && height > 0 && i > 0 && iComputeVerticalScrollExtent > 0 && (this.f62245 || iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            float fM45559 = m45559(jUptimeMillis);
            if (fM45559 > 0.0f) {
                this.f62243 = true;
                float f = height;
                float fMin = Math.min(this.f62251, f);
                float fMax = i != 0 ? ((f - fMin) * Math.max(0, Math.min(computeVerticalScrollOffset(), i))) / i : 0.0f;
                float f2 = width;
                float f3 = this.f62247;
                c16427.m37322(f2 - f3, fMax, f2, fMax + fMin);
                float scrollX = getScrollX() + width;
                float scrollY = getScrollY();
                Paint paint = this.f62239;
                paint.setColor((((int) (57 * fM45559)) << 24) | 7829367);
                float f4 = scrollX - (f3 * fM45559);
                canvas.drawRect(f4, scrollY, scrollX, f + scrollY, paint);
                int i2 = this.f62245 ? C23223.f72969 : -579373193;
                paint.setColor((i2 & 16777215) | (((int) (((i2 >>> 24) & 255) * fM45559)) << 24));
                float f5 = scrollY + fMax;
                canvas.drawRect(f4, f5, scrollX, f5 + fMin, paint);
                if (this.f62245 || jUptimeMillis - this.f62241 < 1500) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
        }
        this.f62243 = false;
        c16427.m37321();
    }

    /* JADX INFO: renamed from: ֫ */
    private float m45559(long j) {
        if (!this.f62245) {
            long j2 = this.f62241;
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

    /* JADX INFO: renamed from: ֫ */
    private void m45560() {
        this.f62246 = false;
        this.f62245 = true;
        this.f62240 = this.f62248.f48280 - this.f62250;
        removeCallbacks(this.f62244);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45561(float f) {
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        float height = getHeight() - Math.min(this.f62251, getHeight());
        if (iComputeVerticalScrollRange <= 0 || height <= 0.0f) {
            return;
        }
        scrollTo(getScrollX(), Math.round(iComputeVerticalScrollRange * Math.max(0.0f, Math.min((f + this.f62240) / height, 1.0f))));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f62245) {
            if (actionMasked == 2) {
                m45561(motionEvent.getY());
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.f62245 = false;
                this.f62241 = SystemClock.uptimeMillis();
                RunnableC6035 runnableC6035 = this.f62244;
                if (runnableC6035 != null) {
                    removeCallbacks(runnableC6035);
                    postDelayed(runnableC6035, 1500L);
                    invalidate();
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        if (actionMasked == 0) {
            this.f62246 = false;
            int iComputeVerticalScrollExtent = computeVerticalScrollExtent();
            int iComputeVerticalScrollRange = computeVerticalScrollRange();
            if (this.f62243 && m45559(SystemClock.uptimeMillis()) > 0.0f) {
                C16427 c16427 = this.f62248;
                if (c16427.f48281 > c16427.f48277 && c16427.f48276 > c16427.f48280 && iComputeVerticalScrollExtent > 0 && iComputeVerticalScrollRange > iComputeVerticalScrollExtent && iComputeVerticalScrollRange / iComputeVerticalScrollExtent > 3.5f) {
                    this.f62249 = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f62250 = y;
                    if (c16427.m37325(this.f62249, y)) {
                        m45560();
                        return true;
                    }
                    this.f62246 = c16427.m37324(this.f62249, this.f62250);
                }
            }
        } else if (actionMasked == 1) {
            this.f62246 = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3 || actionMasked == 5) {
                this.f62246 = false;
            }
        } else if (this.f62246) {
            float x = motionEvent.getX() - this.f62249;
            float y2 = motionEvent.getY() - this.f62250;
            if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                this.f62246 = false;
            } else {
                float fAbs = Math.abs(y2);
                float f = this.f62242;
                if (fAbs > f && Math.abs(y2) > Math.abs(x)) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    m45560();
                    m45561(motionEvent.getY());
                    return true;
                }
                if (Math.abs(x) > f) {
                    this.f62246 = false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f62244);
        super.onDetachedFromWindow();
    }
}
