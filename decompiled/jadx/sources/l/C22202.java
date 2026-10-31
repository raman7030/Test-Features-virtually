package l;

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
import com.alipay.sdk.m.y.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩹ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5VL */
/* JADX INFO: loaded from: classes2.dex */
public class C22202 extends FloatingActionButton {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f72016;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f72017;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72018;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f72019;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f72020;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f72021;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public WindowManager f72022;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f72023;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72024;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f72025;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f72026;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f72027;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f72028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Point f72029;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72030;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f72031;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f72032;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final String f72033;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f72034;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public float f72035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f72037;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72038;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AnimatorSet f72039;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49870(float f, int i) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49873(C22202 c22202) {
        if (c22202.isPressed()) {
            return;
        }
        float width = (c22202.getWidth() / 5.0f) * 4.0f;
        if (c22202.f72019.x == 0) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c22202, "alpha", 0.8f, 0.35f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c22202, "translationX", 0.0f, width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        c22202.f72039 = animatorSet;
        animatorSet.start();
        c22202.f72030 = true;
    }

    public C22202(Service service, String str) {
        super(service);
        Point point = new Point();
        this.f72029 = point;
        this.f72027 = new HandlerC0912(this, new C23202(8));
        this.f72023 = VelocityTracker.obtain();
        this.f72025 = "fbpx:".concat(str);
        this.f72033 = "fbpy:".concat(str);
        WindowManager windowManager = (WindowManager) service.getApplicationContext().getSystemService("window");
        this.f72022 = windowManager;
        C11003.requireNonNull(windowManager);
        windowManager.getDefaultDisplay().getSize(point);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(service);
        float scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f72035 = scaledTouchSlop * scaledTouchSlop;
        this.f72024 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f72020 = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        setCompatElevation(0.0f);
        setAlpha(0.85f);
        setSize(1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49879() {
        return this.f72036 || getParent() != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22202 m49871(Service service, String str) {
        return new C22202(service, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49878() {
        if (this.f72019 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f72019 = layoutParams;
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
        Point point = this.f72029;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        this.f72016 = ApplicationC20075.f65008.getFloat(this.f72025, 1.0f);
        this.f72031 = ApplicationC20075.f65008.getFloat(this.f72033, Float.NaN);
        m49872(getMeasuredWidth(), getMeasuredHeight());
        this.f72022.addView(this, this.f72019);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49872(int i, int i2) {
        Point point = this.f72029;
        int iMax = Math.max(0, point.x - i);
        int iMax2 = Math.max(0, point.y - i2);
        this.f72019.x = m49870(Math.round(this.f72016 * iMax), iMax);
        this.f72019.y = m49870(Float.isNaN(this.f72031) ? point.y / 3 : Math.round(this.f72031 * iMax2), iMax2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49876() {
        if (!this.f72021 || this.f72019 == null) {
            return;
        }
        Point point = this.f72029;
        int iMax = Math.max(0, point.x - getWidth());
        int iMax2 = Math.max(0, point.y - getHeight());
        this.f72016 = iMax == 0 ? 0.0f : m49870(this.f72019.x, iMax) / iMax;
        this.f72031 = iMax2 != 0 ? m49870(this.f72019.y, iMax2) / iMax2 : 0.0f;
        ApplicationC20075.f65008.edit().putFloat(this.f72025, this.f72016).putFloat(this.f72033, this.f72031).apply();
        this.f72021 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49880() {
        if (getParent() != null) {
            this.f72022.removeView(this);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void hide() {
        setVisibility(8);
        this.f72027.removeMessages(0);
        m49877();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void show() {
        setVisibility(0);
        m49875();
        float alpha = getAlpha();
        setAlpha(0.0f);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, alpha).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49875() {
        AnimatorSet animatorSet = this.f72039;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f72039 = null;
        }
        if (this.f72030 || getTranslationX() != 0.0f) {
            this.f72030 = false;
            setAlpha(0.8f);
            setTranslationX(0.0f);
        }
        HandlerC0912 handlerC0912 = this.f72027;
        handlerC0912.removeMessages(0);
        if (ApplicationC20075.f65008.getBoolean("floating_button_stick_to_edge", true)) {
            handlerC0912.sendEmptyMessageDelayed(0, c.a);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m49877() {
        ValueAnimator valueAnimator = this.f72017;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f72017 = null;
        }
        m49876();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f72028) {
            this.f72028 = false;
            m49872(i3 - i, i4 - i2);
            this.f72022.updateViewLayout(this, this.f72019);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f72036 = true;
        this.f72028 = true;
        m49875();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f72036 = false;
        this.f72027.removeMessages(0);
        AnimatorSet animatorSet = this.f72039;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f72039 = null;
        }
        m49877();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m49877();
        WindowManager windowManager = this.f72022;
        windowManager.getDefaultDisplay().getSize(this.f72029);
        if (this.f72036) {
            m49872(getWidth(), getHeight());
            windowManager.updateViewLayout(this, this.f72019);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f72036) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        VelocityTracker velocityTracker = this.f72023;
        if (action == 0) {
            m49877();
            velocityTracker.clear();
        }
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        try {
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
            if (action != 0) {
                Point point = this.f72029;
                if (action == 1) {
                    boolean z = this.f72032;
                    this.f72032 = false;
                    m49875();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f72018) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = velocityTracker.getXVelocity();
                        float yVelocity = velocityTracker.getYVelocity();
                        m49877();
                        final int iMax = Math.max(0, point.x - getWidth());
                        final int iMax2 = Math.max(0, point.y - getHeight());
                        int i = this.f72024;
                        float f = -i;
                        float f2 = i;
                        final C21497 c21497 = new C21497(m49870(this.f72019.x, iMax), m49870(this.f72019.y, iMax2), Math.max(f, Math.min(xVelocity, f2)), Math.max(f, Math.min(yVelocity, f2)), iMax, this.f72020);
                        final long[] jArr = {0};
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܶۢۡ
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C22202.m49874(this.f46280, jArr, c21497, iMax, iMax2, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.setDuration(1000L);
                        this.f72017 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.start();
                        return true;
                    }
                    if (action == 1 && !z) {
                        performClick();
                    }
                } else if (action == 2) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f3 = this.f72037 - rawX2;
                    float f4 = this.f72034 - rawY2;
                    if (!this.f72018) {
                        float fAbs = Math.abs(f3);
                        float fAbs2 = Math.abs(f4);
                        if ((fAbs2 * fAbs2) + (fAbs * fAbs) > this.f72035) {
                            setPressed(false);
                            this.f72018 = true;
                        }
                    }
                    if (this.f72018) {
                        m49875();
                        this.f72019.x = m49870(this.f72026 - f3, point.x - getWidth());
                        this.f72019.y = m49870(this.f72038 - f4, point.y - getHeight());
                        this.f72021 = true;
                        this.f72022.updateViewLayout(this, this.f72019);
                        return true;
                    }
                } else if (action == 3) {
                    boolean z2 = this.f72032;
                    this.f72032 = false;
                    m49875();
                    if (isPressed()) {
                        setPressed(false);
                    }
                    if (this.f72018) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float xVelocity2 = velocityTracker.getXVelocity();
                        float yVelocity2 = velocityTracker.getYVelocity();
                        m49877();
                        final int iMax3 = Math.max(0, point.x - getWidth());
                        final int iMax4 = Math.max(0, point.y - getHeight());
                        int i2 = this.f72024;
                        float f5 = -i2;
                        float f6 = i2;
                        final C21497 c21498 = new C21497(m49870(this.f72019.x, iMax3), m49870(this.f72019.y, iMax4), Math.max(f5, Math.min(xVelocity2, f6)), Math.max(f5, Math.min(yVelocity2, f6)), iMax3, this.f72020);
                        final long[] jArr2 = {0};
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܶۢۡ
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                C22202.m49874(this.f46280, jArr2, c21498, iMax3, iMax4, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat2.setDuration(1000L);
                        this.f72017 = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.start();
                        return true;
                    }
                    if (action == 1) {
                        performClick();
                    }
                }
                return true;
            }
            boolean z3 = this.f72030 || getTranslationX() != 0.0f;
            this.f72032 = z3;
            setPressed(!z3);
            this.f72037 = motionEvent.getRawX();
            this.f72034 = motionEvent.getRawY();
            this.f72018 = false;
            WindowManager.LayoutParams layoutParams = this.f72019;
            this.f72026 = layoutParams.x;
            this.f72038 = layoutParams.y;
            return true;
        } catch (Throwable th) {
            motionEvent.offsetLocation(-rawX, -rawY);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49874(C22202 c22202, long[] jArr, C21497 c21497, int i, int i2, ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        boolean zM48665 = false;
        float f = (currentPlayTime - jArr[0]) / 1000.0f;
        jArr[0] = currentPlayTime;
        if (f <= 0.0f) {
            return;
        }
        while (f > 0.0f && !zM48665) {
            float fMin = Math.min(f, 0.032f);
            f -= fMin;
            zM48665 = c21497.m48665(i, fMin, i2);
        }
        if (currentPlayTime >= 1000 && !zM48665) {
            c21497.m48664(i);
            zM48665 = true;
        }
        c22202.f72019.x = Math.round(c21497.f69151);
        c22202.f72019.y = Math.round(c21497.f69149);
        c22202.f72021 = true;
        if (c22202.f72036) {
            c22202.f72022.updateViewLayout(c22202, c22202.f72019);
        }
        if (zM48665) {
            c22202.f72017 = null;
            valueAnimator.cancel();
            c22202.m49876();
            c22202.m49875();
        }
    }
}
