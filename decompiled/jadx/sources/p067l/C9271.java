package p067l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.۟ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18GG */
/* JADX INFO: loaded from: classes3.dex */
public class C9271 extends View implements InterfaceC10020 {

    /* JADX INFO: renamed from: ֡֫ */
    public final int f25171;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f25172;

    /* JADX INFO: renamed from: ֫֫ */
    public final Formatter f25173;

    /* JADX INFO: renamed from: ۖ֫ */
    public final Rect f25174;

    /* JADX INFO: renamed from: ۗ */
    public final int f25175;

    /* JADX INFO: renamed from: ۗ֫ */
    public final Point f25176;

    /* JADX INFO: renamed from: ۘ֫ */
    public final int f25177;

    /* JADX INFO: renamed from: ۙ */
    public final int f25178;

    /* JADX INFO: renamed from: ۙ֫ */
    public final RunnableC22707 f25179;

    /* JADX INFO: renamed from: ۚ֫ */
    public final int f25180;

    /* JADX INFO: renamed from: ۛ */
    public long f25181;

    /* JADX INFO: renamed from: ۜ֫ */
    public final Paint f25182;

    /* JADX INFO: renamed from: ۟ */
    public final StringBuilder f25183;

    /* JADX INFO: renamed from: ۠֫ */
    public final Paint f25184;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Rect f25185;

    /* JADX INFO: renamed from: ۢ֫ */
    public long f25186;

    /* JADX INFO: renamed from: ۤ */
    public final Paint f25187;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f25188;

    /* JADX INFO: renamed from: ۨ */
    public final float f25189;

    /* JADX INFO: renamed from: ۫ */
    public final Rect f25190;

    /* JADX INFO: renamed from: ۫֫ */
    public final Paint f25191;

    /* JADX INFO: renamed from: ۬ */
    public final int f25192;

    /* JADX INFO: renamed from: ۬֫ */
    public final int f25193;

    /* JADX INFO: renamed from: ܰ */
    public final int f25194;

    /* JADX INFO: renamed from: ܳ֫ */
    public final CopyOnWriteArraySet f25195;

    /* JADX INFO: renamed from: ܶ֫ */
    public float f25196;

    /* JADX INFO: renamed from: ܺ֫ */
    public long f25197;

    /* JADX INFO: renamed from: ܽ֫ */
    public long f25198;

    /* JADX INFO: renamed from: ܿ֫ */
    public Rect f25199;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f25200;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final int f25201;

    /* JADX INFO: renamed from: ᩵֫ */
    public final Drawable f25202;

    /* JADX INFO: renamed from: ᩶ */
    public final Paint f25203;

    /* JADX INFO: renamed from: ᩶֫ */
    public final Rect f25204;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Paint f25205;

    /* JADX INFO: renamed from: ᩸ */
    public int f25206;

    /* JADX INFO: renamed from: ᩸֫ */
    public ValueAnimator f25207;

    /* JADX INFO: renamed from: ᩹ */
    public long[] f25208;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f25209;

    /* JADX INFO: renamed from: ᩺ */
    public long f25210;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean[] f25211;

    /* JADX INFO: renamed from: ֫ */
    public static int m21449(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ֫ */
    public final void mo21461(InterfaceC3314 interfaceC3314) {
        interfaceC3314.getClass();
        this.f25195.add(interfaceC3314);
    }

    public C9271(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9271(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public C9271(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f25204 = new Rect();
        this.f25185 = new Rect();
        this.f25190 = new Rect();
        this.f25174 = new Rect();
        Paint paint = new Paint();
        this.f25205 = paint;
        Paint paint2 = new Paint();
        this.f25187 = paint2;
        Paint paint3 = new Paint();
        this.f25191 = paint3;
        Paint paint4 = new Paint();
        this.f25203 = paint4;
        Paint paint5 = new Paint();
        this.f25182 = paint5;
        Paint paint6 = new Paint();
        this.f25184 = paint6;
        paint6.setAntiAlias(true);
        this.f25195 = new CopyOnWriteArraySet();
        this.f25176 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f25189 = f;
        this.f25194 = m21449(f, -50);
        int iM21449 = m21449(f, 4);
        int iM214410 = m21449(f, 26);
        int iM214411 = m21449(f, 4);
        int iM214412 = m21449(f, 12);
        int iM214413 = m21449(f, 0);
        int iM214414 = m21449(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C23976.f76168, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f25202 = drawable;
                if (drawable != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iM214410 = Math.max(drawable.getMinimumHeight(), iM214410);
                }
                this.f25192 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM21449);
                this.f25193 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM214410);
                this.f25175 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f25178 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM214411);
                this.f25171 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM214412);
                this.f25177 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM214413);
                this.f25201 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM214414);
                int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i7 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i8 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i9 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f25192 = iM21449;
            this.f25193 = iM214410;
            this.f25175 = 0;
            this.f25178 = iM214411;
            this.f25171 = iM214412;
            this.f25177 = iM214413;
            this.f25201 = iM214414;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f25202 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f25183 = sb;
        this.f25173 = new Formatter(sb, Locale.getDefault());
        this.f25179 = new RunnableC22707(1, this);
        Drawable drawable2 = this.f25202;
        if (drawable2 != null) {
            this.f25180 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f25180 = (Math.max(this.f25177, Math.max(this.f25171, this.f25201)) + 1) / 2;
        }
        this.f25196 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f25207 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܰۚۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C9271.m21451(this.f43688, valueAnimator2);
            }
        });
        this.f25210 = -9223372036854775807L;
        this.f25198 = -9223372036854775807L;
        this.f25188 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m21451(C9271 c9271, ValueAnimator valueAnimator) {
        c9271.f25196 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c9271.invalidate(c9271.f25204);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m21466() {
        ValueAnimator valueAnimator = this.f25207;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f25172 = false;
        this.f25196 = 1.0f;
        invalidate(this.f25204);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m21468() {
        ValueAnimator valueAnimator = this.f25207;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f25172 = false;
        valueAnimator.setFloatValues(this.f25196, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21462(boolean z) {
        ValueAnimator valueAnimator = this.f25207;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f25172 = z;
        this.f25196 = 0.0f;
        invalidate(this.f25204);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21464() {
        ValueAnimator valueAnimator = this.f25207;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f25196, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ֫ */
    public final void mo21460(long j) {
        if (this.f25186 == j) {
            return;
        }
        this.f25186 = j;
        setContentDescription(C5792.m12996(this.f25183, this.f25173, j));
        m21458();
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ܽ */
    public final void mo21467(long j) {
        if (this.f25181 == j) {
            return;
        }
        this.f25181 = j;
        m21458();
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ۧ */
    public final void mo21465(long j) {
        if (this.f25210 == j) {
            return;
        }
        this.f25210 = j;
        if (this.f25209 && j == -9223372036854775807L) {
            m21452(true);
        }
        m21458();
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ֫ */
    public final long mo21459() {
        int iWidth = (int) (this.f25185.width() / this.f25189);
        if (iWidth == 0) {
            return C14849.FOREVER_NS;
        }
        long j = this.f25210;
        return (j == 0 || j == -9223372036854775807L) ? C14849.FOREVER_NS : j / ((long) iWidth);
    }

    @Override // p067l.InterfaceC10020
    /* JADX INFO: renamed from: ֫ */
    public final void mo21463(long[] jArr, boolean[] zArr, int i) {
        C23877.m52957(i == 0 || !(jArr == null || zArr == null));
        this.f25206 = i;
        this.f25208 = jArr;
        this.f25211 = zArr;
        m21458();
    }

    @Override // android.view.View, p067l.InterfaceC10020
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f25209 || z) {
            return;
        }
        m21452(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f25185;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f25210;
        Paint paint = this.f25191;
        Rect rect2 = this.f25174;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f25190;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f25187);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f25205);
            }
            if (this.f25206 != 0) {
                long[] jArr = this.f25208;
                jArr.getClass();
                boolean[] zArr = this.f25211;
                zArr.getClass();
                int i6 = this.f25178;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f25206) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * C5792.m12992(jArr[i9], 0L, this.f25210)) / this.f25210)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f25182 : this.f25203);
                    i9++;
                    i8 = 0;
                    i6 = i6;
                }
            }
        }
        if (this.f25210 > 0) {
            int iM12976 = C5792.m12976(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f25202;
            if (drawable == null) {
                if (this.f25209 || isFocused()) {
                    i = this.f25201;
                } else {
                    i = isEnabled() ? this.f25171 : this.f25177;
                }
                canvas.drawCircle(iM12976, iCenterY2, (int) ((i * this.f25196) / 2.0f), this.f25184);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f25196)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f25196)) / 2;
                drawable.setBounds(iM12976 - intrinsicWidth, iCenterY2 - intrinsicHeight, iM12976 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fM21912;
        if (isEnabled() && this.f25210 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.f25176;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f25185;
            Rect rect2 = this.f25174;
            if (action == 0) {
                int i3 = i;
                if (this.f25204.contains(i3, i2)) {
                    rect2.right = C5792.m12976(i3, rect.left, rect.right);
                    m21456(m21453());
                    m21458();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f25209) {
                    m21452(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f25209) {
                        m21452(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f25209) {
                if (i2 < this.f25194) {
                    int i4 = this.f25200;
                    fM21912 = C9417.m21912(i, i4, 3, i4);
                } else {
                    this.f25200 = i;
                    fM21912 = i;
                }
                rect2.right = C5792.m12976((int) fM21912, rect.left, rect.right);
                m21454(m21453());
                m21458();
                invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long jM21455 = m21455();
            if (i != 66) {
                switch (i) {
                    case 21:
                        jM21455 = -jM21455;
                        if (m21457(jM21455)) {
                            RunnableC22707 runnableC22707 = this.f25179;
                            removeCallbacks(runnableC22707);
                            postDelayed(runnableC22707, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m21457(jM21455)) {
                            RunnableC22707 runnableC22708 = this.f25179;
                            removeCallbacks(runnableC22708);
                            postDelayed(runnableC22708, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f25209) {
                            m21452(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f25209) {
                m21452(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f25209 || z) {
            return;
        }
        m21452(false);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f25202;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f25202;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f25193;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f25202;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f25172 ? 0 : this.f25180;
        int i8 = this.f25175;
        int i9 = this.f25192;
        int i10 = this.f25193;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f25204;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f25185.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f25199) == null || rect.width() != i5 || this.f25199.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f25199 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m21458();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f25202;
        if (drawable == null || Build.VERSION.SDK_INT < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(C5792.m12996(this.f25183, this.f25173, this.f25186));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(C5792.m12996(this.f25183, this.f25173, this.f25186));
        if (this.f25210 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f25210 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m21457(-m21455())) {
                m21452(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m21457(m21455())) {
                m21452(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m21456(long j) {
        this.f25197 = j;
        this.f25209 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f25195.iterator();
        while (it.hasNext()) {
            ((InterfaceC3314) it.next()).mo5791(j);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m21454(long j) {
        if (this.f25197 == j) {
            return;
        }
        this.f25197 = j;
        Iterator it = this.f25195.iterator();
        while (it.hasNext()) {
            ((InterfaceC3314) it.next()).mo5792(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m21452(boolean z) {
        removeCallbacks(this.f25179);
        this.f25209 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f25195.iterator();
        while (it.hasNext()) {
            ((InterfaceC3314) it.next()).mo5790(this.f25197, z);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m21457(long j) {
        long j2 = this.f25210;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f25209 ? this.f25197 : this.f25186;
        long jM12992 = C5792.m12992(j3 + j, 0L, j2);
        if (jM12992 == j3) {
            return false;
        }
        if (!this.f25209) {
            m21456(jM12992);
        } else {
            m21454(jM12992);
        }
        m21458();
        return true;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m21458() {
        Rect rect = this.f25190;
        Rect rect2 = this.f25185;
        rect.set(rect2);
        Rect rect3 = this.f25174;
        rect3.set(rect2);
        long j = this.f25209 ? this.f25197 : this.f25186;
        if (this.f25210 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f25181) / this.f25210)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f25210)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f25204);
    }

    /* JADX INFO: renamed from: ܳ */
    private long m21453() {
        Rect rect = this.f25185;
        if (rect.width() <= 0 || this.f25210 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f25174.width()) * this.f25210) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: ܿ */
    private long m21455() {
        long j = this.f25198;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f25210;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f25188);
    }
}
