package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RX */
/* JADX INFO: loaded from: classes3.dex */
public class C8091 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f24904;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24905;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24906;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f24907;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC5269 f24908;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f24909;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1035 f24910;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24911;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f24912;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f24913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PointF f24914;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public WindowManager f24915;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f24916;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f24917;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Point f24918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC0329 f24919;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public RunnableC19381 f24921;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f24922;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21461(float f, int i) {
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = i;
            if (f > f2) {
                f = f2;
            }
        }
        return (int) f;
    }

    public C8091(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24918 = new Point();
        VelocityTracker.obtain();
        this.f24914 = new PointF();
        m21462(context);
    }

    public C8091(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24918 = new Point();
        VelocityTracker.obtain();
        this.f24914 = new PointF();
        m21462(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21462(Context context) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24917 = scaledTouchSlop * scaledTouchSlop;
        this.f24920 = false;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f24915 = windowManager;
        windowManager.getDefaultDisplay().getSize(this.f24918);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f24916 = layoutParams;
        if (i >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 40;
        layoutParams.width = -2;
        layoutParams.height = -2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RunnableC19381 runnableC19381;
        if (!this.f24920) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            setPressed(true);
            this.f24909 = motionEvent.getX();
            this.f24907 = motionEvent.getY();
            this.f24913 = motionEvent.getRawX();
            this.f24912 = motionEvent.getRawY();
            this.f24922 = false;
            WindowManager.LayoutParams layoutParams = this.f24916;
            this.f24906 = layoutParams.x;
            this.f24905 = layoutParams.y;
            this.f24904 = false;
            if (isLongClickable()) {
                if (this.f24921 == null) {
                    this.f24921 = new RunnableC19381(this);
                }
                this.f24921.m44644();
                this.f24921.m44645();
                postDelayed(this.f24921, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 1) {
            runnableC19381 = this.f24921;
            if (runnableC19381 != null) {
                removeCallbacks(runnableC19381);
            }
            setPressed(false);
            if (this.f24922) {
                this.f24922 = false;
                return true;
            }
            if (!this.f24904 && isClickable() && action == 1) {
                performClick();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                runnableC19381 = this.f24921;
                if (runnableC19381 != null) {
                    removeCallbacks(runnableC19381);
                }
                setPressed(false);
                if (this.f24922) {
                    this.f24922 = false;
                    return true;
                }
                if (!this.f24904) {
                    performClick();
                    return true;
                }
            }
        } else if (!this.f24904) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = this.f24913 - rawX;
            float f2 = this.f24912 - rawY;
            if (!this.f24922) {
                float fAbs = Math.abs(f);
                float fAbs2 = Math.abs(f2);
                if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f24917) {
                    this.f24922 = true;
                    if (this.f24911) {
                        this.f24913 = rawX;
                        this.f24912 = rawY;
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    RunnableC19381 runnableC19382 = this.f24921;
                    if (runnableC19382 != null) {
                        removeCallbacks(runnableC19382);
                    }
                    InterfaceC5269 interfaceC5269 = this.f24908;
                    if (interfaceC5269 != null) {
                        interfaceC5269.mo13578();
                    }
                }
            }
            if (this.f24922) {
                WindowManager.LayoutParams layoutParams2 = this.f24916;
                float f3 = layoutParams2.x;
                PointF pointF = this.f24914;
                pointF.x = f3;
                pointF.y = layoutParams2.y;
                int i = this.f24906;
                int i2 = this.f24905;
                float f4 = -f;
                float f5 = -f2;
                InterfaceC0329 interfaceC0329 = this.f24919;
                if (interfaceC0329 != null) {
                    interfaceC0329.mo1749(pointF, i, i2, f4, f5);
                    return true;
                }
                float f6 = i + f4;
                pointF.x = f6;
                pointF.y = i2 + f5;
                Point point = this.f24918;
                layoutParams2.x = m21461(f6, point.x - getWidth());
                this.f24916.y = m21461(pointF.y, point.y - getHeight());
                this.f24915.updateViewLayout(this, this.f24916);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21474() {
        this.f24911 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m21472() {
        return this.f24909;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m21473() {
        return this.f24907;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21471(int[] iArr) {
        WindowManager.LayoutParams layoutParams = this.f24916;
        iArr[0] = layoutParams.x;
        iArr[1] = layoutParams.y;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21468(InterfaceC0329 interfaceC0329) {
        this.f24919 = interfaceC0329;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21470(InterfaceC5269 interfaceC5269) {
        this.f24908 = interfaceC5269;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        WindowManager.LayoutParams layoutParams;
        Display defaultDisplay = this.f24915.getDefaultDisplay();
        Point point = this.f24918;
        defaultDisplay.getSize(point);
        if (!this.f24920 || (layoutParams = this.f24916) == null) {
            return;
        }
        if (layoutParams.x > 0) {
            layoutParams.x = point.x - getWidth();
        }
        if (this.f24916.y > point.y - getHeight()) {
            this.f24916.y = point.y - getHeight();
        }
        this.f24915.updateViewLayout(this, this.f24916);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21466() {
        if (this.f24920 || !C9255.m23764(getContext()) || this.f24920) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f24916;
        float f = layoutParams.x;
        Point point = this.f24918;
        layoutParams.x = m21461(f, point.x - getWidth());
        WindowManager.LayoutParams layoutParams2 = this.f24916;
        layoutParams2.y = m21461(layoutParams2.y, point.y - getHeight());
        this.f24915.addView(this, this.f24916);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m21475() {
        boolean z = this.f24920;
        if (z && z) {
            this.f24915.removeView(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21467(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f24916;
        if (layoutParams.x == i && layoutParams.y == i2) {
            return;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        if (this.f24920) {
            this.f24915.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24920 = true;
        InterfaceC1035 interfaceC1035 = this.f24910;
        if (interfaceC1035 != null) {
            ((C0396) interfaceC1035).m1891();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24920 = false;
        RunnableC19381 runnableC19381 = this.f24921;
        if (runnableC19381 != null) {
            removeCallbacks(runnableC19381);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21469(C0396 c0396) {
        this.f24910 = c0396;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f24920;
    }
}
