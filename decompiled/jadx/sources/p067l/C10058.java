package p067l;

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
public class C10058 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f27815;

    /* JADX INFO: renamed from: ۗ */
    public int f27816;

    /* JADX INFO: renamed from: ۙ */
    public int f27817;

    /* JADX INFO: renamed from: ۛ */
    public float f27818;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC7376 f27819;

    /* JADX INFO: renamed from: ۤ */
    public float f27820;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC3352 f27821;

    /* JADX INFO: renamed from: ۨ */
    public boolean f27822;

    /* JADX INFO: renamed from: ۫ */
    public float f27823;

    /* JADX INFO: renamed from: ۬ */
    public float f27824;

    /* JADX INFO: renamed from: ܰ */
    public final PointF f27825;

    /* JADX INFO: renamed from: ܳ֫ */
    public WindowManager f27826;

    /* JADX INFO: renamed from: ܽ֫ */
    public WindowManager.LayoutParams f27827;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f27828;

    /* JADX INFO: renamed from: ᩳ֫ */
    public Point f27829;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC2681 f27830;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f27831;

    /* JADX INFO: renamed from: ᩹ */
    public RunnableC20788 f27832;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f27833;

    /* JADX INFO: renamed from: ֫ */
    public static int m23429(float f, int i) {
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

    public C10058(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27829 = new Point();
        VelocityTracker.obtain();
        this.f27825 = new PointF();
        m23430(context);
    }

    public C10058(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27829 = new Point();
        VelocityTracker.obtain();
        this.f27825 = new PointF();
        m23430(context);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23430(Context context) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f27828 = scaledTouchSlop * scaledTouchSlop;
        this.f27831 = false;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f27826 = windowManager;
        windowManager.getDefaultDisplay().getSize(this.f27829);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f27827 = layoutParams;
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
        RunnableC20788 runnableC20788;
        if (!this.f27831) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            setPressed(true);
            this.f27820 = motionEvent.getX();
            this.f27818 = motionEvent.getY();
            this.f27824 = motionEvent.getRawX();
            this.f27823 = motionEvent.getRawY();
            this.f27833 = false;
            WindowManager.LayoutParams layoutParams = this.f27827;
            this.f27817 = layoutParams.x;
            this.f27816 = layoutParams.y;
            this.f27815 = false;
            if (isLongClickable()) {
                if (this.f27832 == null) {
                    this.f27832 = new RunnableC20788(this);
                }
                this.f27832.m46938();
                this.f27832.m46939();
                postDelayed(this.f27832, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 1) {
            runnableC20788 = this.f27832;
            if (runnableC20788 != null) {
                removeCallbacks(runnableC20788);
            }
            setPressed(false);
            if (this.f27833) {
                this.f27833 = false;
                return true;
            }
            if (!this.f27815 && isClickable() && action == 1) {
                performClick();
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                runnableC20788 = this.f27832;
                if (runnableC20788 != null) {
                    removeCallbacks(runnableC20788);
                }
                setPressed(false);
                if (this.f27833) {
                    this.f27833 = false;
                    return true;
                }
                if (!this.f27815) {
                    performClick();
                    return true;
                }
            }
        } else if (!this.f27815) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = this.f27824 - rawX;
            float f2 = this.f27823 - rawY;
            if (!this.f27833) {
                float fAbs = Math.abs(f);
                float fAbs2 = Math.abs(f2);
                if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f27828) {
                    this.f27833 = true;
                    if (this.f27822) {
                        this.f27824 = rawX;
                        this.f27823 = rawY;
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    RunnableC20788 runnableC20789 = this.f27832;
                    if (runnableC20789 != null) {
                        removeCallbacks(runnableC20789);
                    }
                    InterfaceC7376 interfaceC7376 = this.f27819;
                    if (interfaceC7376 != null) {
                        interfaceC7376.mo15453();
                    }
                }
            }
            if (this.f27833) {
                WindowManager.LayoutParams layoutParams2 = this.f27827;
                float f3 = layoutParams2.x;
                PointF pointF = this.f27825;
                pointF.x = f3;
                pointF.y = layoutParams2.y;
                int i = this.f27817;
                int i2 = this.f27816;
                float f4 = -f;
                float f5 = -f2;
                InterfaceC2681 interfaceC2681 = this.f27830;
                if (interfaceC2681 != null) {
                    interfaceC2681.mo4147(pointF, i, i2, f4, f5);
                    return true;
                }
                float f6 = i + f4;
                pointF.x = f6;
                pointF.y = i2 + f5;
                Point point = this.f27829;
                layoutParams2.x = m23429(f6, point.x - getWidth());
                this.f27827.y = m23429(pointF.y, point.y - getHeight());
                this.f27826.updateViewLayout(this, this.f27827);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m23442() {
        this.f27822 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m23440() {
        return this.f27820;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m23441() {
        return this.f27818;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23439(int[] iArr) {
        WindowManager.LayoutParams layoutParams = this.f27827;
        iArr[0] = layoutParams.x;
        iArr[1] = layoutParams.y;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23436(InterfaceC2681 interfaceC2681) {
        this.f27830 = interfaceC2681;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23438(InterfaceC7376 interfaceC7376) {
        this.f27819 = interfaceC7376;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        WindowManager.LayoutParams layoutParams;
        Display defaultDisplay = this.f27826.getDefaultDisplay();
        Point point = this.f27829;
        defaultDisplay.getSize(point);
        if (!this.f27831 || (layoutParams = this.f27827) == null) {
            return;
        }
        if (layoutParams.x > 0) {
            layoutParams.x = point.x - getWidth();
        }
        if (this.f27827.y > point.y - getHeight()) {
            this.f27827.y = point.y - getHeight();
        }
        this.f27826.updateViewLayout(this, this.f27827);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23434() {
        if (this.f27831 || !C11164.m25765(getContext()) || this.f27831) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f27827;
        float f = layoutParams.x;
        Point point = this.f27829;
        layoutParams.x = m23429(f, point.x - getWidth());
        WindowManager.LayoutParams layoutParams2 = this.f27827;
        layoutParams2.y = m23429(layoutParams2.y, point.y - getHeight());
        this.f27826.addView(this, this.f27827);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m23443() {
        boolean z = this.f27831;
        if (z && z) {
            this.f27826.removeView(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23435(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f27827;
        if (layoutParams.x == i && layoutParams.y == i2) {
            return;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        if (this.f27831) {
            this.f27826.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27831 = true;
        InterfaceC3352 interfaceC3352 = this.f27821;
        if (interfaceC3352 != null) {
            ((C2745) interfaceC3352).m4283();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27831 = false;
        RunnableC20788 runnableC20788 = this.f27832;
        if (runnableC20788 != null) {
            removeCallbacks(runnableC20788);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23437(C2745 c2745) {
        this.f27821 = c2745;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f27831;
    }
}
