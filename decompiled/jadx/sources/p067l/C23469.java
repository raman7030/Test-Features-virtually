package p067l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩹ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes2.dex */
public class C23469 extends FloatingActionButton {

    /* JADX INFO: renamed from: ֫֫ */
    public float f74737;

    /* JADX INFO: renamed from: ۗ */
    public ValueAnimator f74738;

    /* JADX INFO: renamed from: ۙ */
    public boolean f74739;

    /* JADX INFO: renamed from: ۛ */
    public WindowManager.LayoutParams f74740;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f74741;

    /* JADX INFO: renamed from: ۟ */
    public boolean f74742;

    /* JADX INFO: renamed from: ۡ֫ */
    public WindowManager f74743;

    /* JADX INFO: renamed from: ۢ֫ */
    public VelocityTracker f74744;

    /* JADX INFO: renamed from: ۤ */
    public int f74745;

    /* JADX INFO: renamed from: ۧ֫ */
    public final String f74746;

    /* JADX INFO: renamed from: ۨ */
    public int f74747;

    /* JADX INFO: renamed from: ۫ */
    public HandlerC3235 f74748;

    /* JADX INFO: renamed from: ۬ */
    public boolean f74749;

    /* JADX INFO: renamed from: ܰ */
    public Point f74750;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f74751;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f74752;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f74753;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final String f74754;

    /* JADX INFO: renamed from: ᩶ */
    public float f74755;

    /* JADX INFO: renamed from: ᩷֫ */
    public float f74756;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f74757;

    /* JADX INFO: renamed from: ᩹ */
    public float f74758;

    /* JADX INFO: renamed from: ᩺ */
    public int f74759;

    /* JADX INFO: renamed from: ᩻֫ */
    public AnimatorSet f74760;

    /* JADX INFO: renamed from: ֫ */
    public static int m52197(float f, int i) {
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

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52200(C23469 c23469) {
        if (c23469.isPressed()) {
            return;
        }
        float width = (c23469.getWidth() / 5.0f) * 4.0f;
        if (c23469.f74740.x == 0) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c23469, "alpha", 0.8f, 0.35f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c23469, "translationX", 0.0f, width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        c23469.f74760 = animatorSet;
        animatorSet.start();
        c23469.f74751 = true;
    }

    public C23469(Service service, String str) {
        super(service);
        Point point = new Point();
        this.f74750 = point;
        this.f74748 = new HandlerC3235(this, new C24420(8));
        this.f74744 = VelocityTracker.obtain();
        this.f74746 = "fbpx:".concat(str);
        this.f74754 = "fbpy:".concat(str);
        WindowManager windowManager = (WindowManager) service.getApplicationContext().getSystemService("window");
        this.f74743 = windowManager;
        C12826.requireNonNull(windowManager);
        windowManager.getDefaultDisplay().getSize(point);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(service);
        float scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f74756 = scaledTouchSlop * scaledTouchSlop;
        this.f74745 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f74741 = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        setCompatElevation(0.0f);
        setAlpha(0.85f);
        setSize(1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m52206() {
        return this.f74757 || getParent() != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23469 m52198(Service service, String str) {
        return new C23469(service, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52205() {
        if (this.f74740 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f74740 = layoutParams;
            if (Build.VERSION.SDK_INT >= 26) {
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
        Point point = this.f74750;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        this.f74737 = ApplicationC21448.f67649.getFloat(this.f74746, 1.0f);
        this.f74752 = ApplicationC21448.f67649.getFloat(this.f74754, Float.NaN);
        m52199(getMeasuredWidth(), getMeasuredHeight());
        this.f74743.addView(this, this.f74740);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52199(int i, int i2) {
        Point point = this.f74750;
        int iMax = Math.max(0, point.x - i);
        int iMax2 = Math.max(0, point.y - i2);
        this.f74740.x = m52197(Math.round(this.f74737 * iMax), iMax);
        this.f74740.y = m52197(Float.isNaN(this.f74752) ? point.y / 3 : Math.round(this.f74752 * iMax2), iMax2);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m52203() {
        if (!this.f74742 || this.f74740 == null) {
            return;
        }
        Point point = this.f74750;
        int iMax = Math.max(0, point.x - getWidth());
        int iMax2 = Math.max(0, point.y - getHeight());
        this.f74737 = iMax == 0 ? 0.0f : m52197(this.f74740.x, iMax) / iMax;
        this.f74752 = iMax2 != 0 ? m52197(this.f74740.y, iMax2) / iMax2 : 0.0f;
        ApplicationC21448.f67649.edit().putFloat(this.f74746, this.f74737).putFloat(this.f74754, this.f74752).apply();
        this.f74742 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52207() {
        if (getParent() != null) {
            this.f74743.removeView(this);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void hide() {
        setVisibility(8);
        this.f74748.removeMessages(0);
        m52204();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void show() {
        setVisibility(0);
        m52202();
        float alpha = getAlpha();
        setAlpha(0.0f);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, alpha).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m52202() {
        AnimatorSet animatorSet = this.f74760;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f74760 = null;
        }
        if (this.f74751 || getTranslationX() != 0.0f) {
            this.f74751 = false;
            setAlpha(0.8f);
            setTranslationX(0.0f);
        }
        HandlerC3235 handlerC3235 = this.f74748;
        handlerC3235.removeMessages(0);
        if (ApplicationC21448.f67649.getBoolean("floating_button_stick_to_edge", true)) {
            handlerC3235.sendEmptyMessageDelayed(0, C0240c.f1145a);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m52204() {
        ValueAnimator valueAnimator = this.f74738;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f74738 = null;
        }
        m52203();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f74749) {
            this.f74749 = false;
            m52199(i3 - i, i4 - i2);
            this.f74743.updateViewLayout(this, this.f74740);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f74757 = true;
        this.f74749 = true;
        m52202();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f74757 = false;
        this.f74748.removeMessages(0);
        AnimatorSet animatorSet = this.f74760;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f74760 = null;
        }
        m52204();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m52204();
        WindowManager windowManager = this.f74743;
        windowManager.getDefaultDisplay().getSize(this.f74750);
        if (this.f74757) {
            m52199(getWidth(), getHeight());
            windowManager.updateViewLayout(this, this.f74740);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f74757) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        VelocityTracker velocityTracker = this.f74744;
        if (action == 0) {
            m52204();
            velocityTracker.clear();
        }
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        try {
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
            if (action != 0) {
                Point point = this.f74750;
                if (action == 1) {
                    boolean z = this.f74753;
                    this.f74753 = false;
                    m52202();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f74739) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        float yVelocity = velocityTracker.getYVelocity();
                        m52204();
                        final int iMax = Math.max(0, point.x - getWidth());
                        final int iMax2 = Math.max(0, point.y - getHeight());
                        int i = this.f74745;
                        float f = -i;
                        float f2 = i;
                        final C22799 c22799 = new C22799(m52197(this.f74740.x, iMax), m52197(this.f74740.y, iMax2), Math.max(f, Math.min(xVelocity, f2)), Math.max(f, Math.min(yVelocity, f2)), iMax, this.f74741);
                        final long[] jArr = {0};
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܶۢۡ
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C23469.m52201(this.f49399, jArr, c22799, iMax, iMax2, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.setDuration(1000L);
                        this.f74738 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    if (action == 1 && !z) {
                        performClick();
                    }
                } else if (action == 2) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f3 = this.f74758 - rawX2;
                    float f4 = this.f74755 - rawY2;
                    if (!this.f74739) {
                        float fAbs = Math.abs(f3);
                        float fAbs2 = Math.abs(f4);
                        if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f74756) {
                            setPressed(false);
                            this.f74739 = true;
                        }
                    }
                    if (this.f74739) {
                        m52202();
                        this.f74740.x = m52197(this.f74747 - f3, point.x - getWidth());
                        this.f74740.y = m52197(this.f74759 - f4, point.y - getHeight());
                        this.f74742 = true;
                        this.f74743.updateViewLayout(this, this.f74740);
                        return true;
                    }
                } else if (action == 3) {
                    boolean z2 = this.f74753;
                    this.f74753 = false;
                    m52202();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f74739) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity2 = velocityTracker.getXVelocity();
                        float yVelocity2 = velocityTracker.getYVelocity();
                        m52204();
                        final int iMax3 = Math.max(0, point.x - getWidth());
                        final int iMax4 = Math.max(0, point.y - getHeight());
                        int i2 = this.f74745;
                        float f5 = -i2;
                        float f6 = i2;
                        final C22799 c227910 = new C22799(m52197(this.f74740.x, iMax3), m52197(this.f74740.y, iMax4), Math.max(f5, Math.min(xVelocity2, f6)), Math.max(f5, Math.min(yVelocity2, f6)), iMax3, this.f74741);
                        final long[] jArr2 = {0};
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܶۢۡ
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C23469.m52201(this.f49399, jArr2, c227910, iMax3, iMax4, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat2.setDuration(1000L);
                        this.f74738 = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.start();
                        return true;
                    }
                    if (action == 1) {
                        performClick();
                    }
                }
                return true;
            }
            boolean z3 = this.f74751 || getTranslationX() != 0.0f;
            this.f74753 = z3;
            setPressed(!z3);
            this.f74758 = motionEvent.getRawX();
            this.f74755 = motionEvent.getRawY();
            this.f74739 = false;
            WindowManager.LayoutParams layoutParams = this.f74740;
            this.f74747 = layoutParams.x;
            this.f74759 = layoutParams.y;
            return true;
        } catch (Throwable th) {
            motionEvent.offsetLocation(-rawX, -rawY);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52201(C23469 c23469, long[] jArr, C22799 c22799, int i, int i2, ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        boolean zM51002 = false;
        float f = (currentPlayTime - jArr[0]) / 1000.0f;
        jArr[0] = currentPlayTime;
        if (f <= 0.0f) {
            return;
        }
        while (f > 0.0f && !zM51002) {
            float fMin = Math.min(f, 0.032f);
            f -= fMin;
            zM51002 = c22799.m51002(i, fMin, i2);
        }
        if (currentPlayTime >= 1000 && !zM51002) {
            c22799.m51001(i);
            zM51002 = true;
        }
        c23469.f74740.x = Math.round(c22799.f71848);
        c23469.f74740.y = Math.round(c22799.f71846);
        c23469.f74742 = true;
        if (c23469.f74757) {
            c23469.f74743.updateViewLayout(c23469, c23469.f74740);
        }
        if (zM51002) {
            c23469.f74738 = null;
            valueAnimator.cancel();
            c23469.m52203();
            c23469.m52202();
        }
    }
}
