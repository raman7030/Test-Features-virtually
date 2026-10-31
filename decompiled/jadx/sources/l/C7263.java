package l;

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
public class C7263 extends View implements InterfaceC8051 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int f22282;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f22283;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Formatter f22284;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Rect f22285;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f22286;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final Point f22287;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int f22288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22289;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC21400 f22290;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int f22291;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f22292;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Paint f22293;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final StringBuilder f22294;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final Paint f22295;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Rect f22296;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public long f22297;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Paint f22298;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f22299;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f22300;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Rect f22301;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Paint f22302;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f22303;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int f22304;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f22305;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f22306;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f22307;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f22308;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f22309;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Rect f22310;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f22311;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final int f22312;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Drawable f22313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f22314;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final Rect f22315;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Paint f22316;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22317;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public ValueAnimator f22318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long[] f22319;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f22320;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f22321;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean[] f22322;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19483(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19495(InterfaceC0995 interfaceC0995) {
        interfaceC0995.getClass();
        this.f22306.add(interfaceC0995);
    }

    public C7263(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7263(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public C7263(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f22315 = new Rect();
        this.f22296 = new Rect();
        this.f22301 = new Rect();
        this.f22285 = new Rect();
        Paint paint = new Paint();
        this.f22316 = paint;
        Paint paint2 = new Paint();
        this.f22298 = paint2;
        Paint paint3 = new Paint();
        this.f22302 = paint3;
        Paint paint4 = new Paint();
        this.f22314 = paint4;
        Paint paint5 = new Paint();
        this.f22293 = paint5;
        Paint paint6 = new Paint();
        this.f22295 = paint6;
        paint6.setAntiAlias(true);
        this.f22306 = new CopyOnWriteArraySet();
        this.f22287 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f22300 = f;
        this.f22305 = m19483(f, -50);
        int iM19483 = m19483(f, 4);
        int iM19484 = m19483(f, 26);
        int iM19485 = m19483(f, 4);
        int iM19486 = m19483(f, 12);
        int iM19487 = m19483(f, 0);
        int iM19488 = m19483(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C22736.f73441, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f22313 = drawable;
                if (drawable != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    iM19484 = Math.max(drawable.getMinimumHeight(), iM19484);
                }
                this.f22303 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM19483);
                this.f22304 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM19484);
                this.f22286 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f22289 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM19485);
                this.f22282 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM19486);
                this.f22288 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM19487);
                this.f22312 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM19488);
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
            this.f22303 = iM19483;
            this.f22304 = iM19484;
            this.f22286 = 0;
            this.f22289 = iM19485;
            this.f22282 = iM19486;
            this.f22288 = iM19487;
            this.f22312 = iM19488;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f22313 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f22294 = sb;
        this.f22284 = new Formatter(sb, Locale.getDefault());
        this.f22290 = new RunnableC21400(1, this);
        Drawable drawable2 = this.f22313;
        if (drawable2 != null) {
            this.f22291 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f22291 = (Math.max(this.f22288, Math.max(this.f22282, this.f22312)) + 1) / 2;
        }
        this.f22307 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f22318 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܰۚۧ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C7263.m19485(this.f40611, valueAnimator2);
            }
        });
        this.f22321 = -9223372036854775807L;
        this.f22309 = -9223372036854775807L;
        this.f22299 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19485(C7263 c7263, ValueAnimator valueAnimator) {
        c7263.f22307 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7263.invalidate(c7263.f22315);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19500() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = false;
        this.f22307 = 1.0f;
        invalidate(this.f22315);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19502() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = false;
        valueAnimator.setFloatValues(this.f22307, 1.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19496(boolean z) {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        this.f22283 = z;
        this.f22307 = 0.0f;
        invalidate(this.f22315);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19498() {
        ValueAnimator valueAnimator = this.f22318;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(this.f22307, 0.0f);
        valueAnimator.setDuration(250L);
        valueAnimator.start();
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19494(long j) {
        if (this.f22297 == j) {
            return;
        }
        this.f22297 = j;
        setContentDescription(C3603.m11020(this.f22294, this.f22284, j));
        m19492();
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo19501(long j) {
        if (this.f22292 == j) {
            return;
        }
        this.f22292 = j;
        m19492();
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo19499(long j) {
        if (this.f22321 == j) {
            return;
        }
        this.f22321 = j;
        if (this.f22320 && j == -9223372036854775807L) {
            m19486(true);
        }
        m19492();
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo19493() {
        int iWidth = (int) (this.f22296.width() / this.f22300);
        if (iWidth == 0) {
            return C13132.FOREVER_NS;
        }
        long j = this.f22321;
        return (j == 0 || j == -9223372036854775807L) ? C13132.FOREVER_NS : j / ((long) iWidth);
    }

    @Override // l.InterfaceC8051
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19497(long[] jArr, boolean[] zArr, int i) {
        C22632.m50631(i == 0 || !(jArr == null || zArr == null));
        this.f22317 = i;
        this.f22319 = jArr;
        this.f22322 = zArr;
        m19492();
    }

    @Override // android.view.View, l.InterfaceC8051
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f22320 || z) {
            return;
        }
        m19486(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        Rect rect = this.f22296;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f22321;
        Paint paint = this.f22302;
        Rect rect2 = this.f22285;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f22301;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f22298);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f22316);
            }
            if (this.f22317 != 0) {
                long[] jArr = this.f22319;
                jArr.getClass();
                boolean[] zArr = this.f22322;
                zArr.getClass();
                int i6 = this.f22289;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f22317) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * C3603.m11016(jArr[i9], 0L, this.f22321)) / this.f22321)) - i7)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f22293 : this.f22314);
                    i9++;
                    i8 = 0;
                    i6 = i6;
                }
            }
        }
        if (this.f22321 > 0) {
            int iM11000 = C3603.m11000(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f22313;
            if (drawable == null) {
                if (this.f22320 || isFocused()) {
                    i = this.f22312;
                } else {
                    i = isEnabled() ? this.f22282 : this.f22288;
                }
                canvas.drawCircle(iM11000, iCenterY2, (int) ((i * this.f22307) / 2.0f), this.f22295);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f22307)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f22307)) / 2;
                drawable.setBounds(iM11000 - intrinsicWidth, iCenterY2 - intrinsicHeight, iM11000 + intrinsicWidth, iCenterY2 + intrinsicHeight);
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
        float fM19938;
        if (isEnabled() && this.f22321 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.f22287;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f22296;
            Rect rect2 = this.f22285;
            if (action == 0) {
                int i3 = i;
                if (this.f22315.contains(i3, i2)) {
                    rect2.right = C3603.m11000(i3, rect.left, rect.right);
                    m19490(m19487());
                    m19492();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f22320) {
                    m19486(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f22320) {
                        m19486(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f22320) {
                if (i2 < this.f22305) {
                    int i4 = this.f22311;
                    fM19938 = C7416.m19938(i, i4, 3, i4);
                } else {
                    this.f22311 = i;
                    fM19938 = i;
                }
                rect2.right = C3603.m11000((int) fM19938, rect.left, rect.right);
                m19488(m19487());
                m19492();
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
            long jM19489 = m19489();
            if (i != 66) {
                switch (i) {
                    case 21:
                        jM19489 = -jM19489;
                        if (m19491(jM19489)) {
                            RunnableC21400 runnableC21400 = this.f22290;
                            removeCallbacks(runnableC21400);
                            postDelayed(runnableC21400, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m19491(jM19489)) {
                            RunnableC21400 runnableC21401 = this.f22290;
                            removeCallbacks(runnableC21401);
                            postDelayed(runnableC21401, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f22320) {
                            m19486(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f22320) {
                m19486(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f22320 || z) {
            return;
        }
        m19486(false);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22313;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22313;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f22304;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f22313;
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
        int i7 = this.f22283 ? 0 : this.f22291;
        int i8 = this.f22286;
        int i9 = this.f22303;
        int i10 = this.f22304;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f22315;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f22296.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f22310) == null || rect.width() != i5 || this.f22310.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f22310 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m19492();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f22313;
        if (drawable == null || Build.VERSION.SDK_INT < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(C3603.m11020(this.f22294, this.f22284, this.f22297));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(C3603.m11020(this.f22294, this.f22284, this.f22297));
        if (this.f22321 <= 0) {
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
        if (this.f22321 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m19491(-m19489())) {
                m19486(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m19491(m19489())) {
                m19486(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m19490(long j) {
        this.f22308 = j;
        this.f22320 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3488(j);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m19488(long j) {
        if (this.f22308 == j) {
            return;
        }
        this.f22308 = j;
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3489(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m19486(boolean z) {
        removeCallbacks(this.f22290);
        this.f22320 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f22306.iterator();
        while (it.hasNext()) {
            ((InterfaceC0995) it.next()).mo3487(this.f22308, z);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m19491(long j) {
        long j2 = this.f22321;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f22320 ? this.f22308 : this.f22297;
        long jM11016 = C3603.m11016(j3 + j, 0L, j2);
        if (jM11016 == j3) {
            return false;
        }
        if (!this.f22320) {
            m19490(jM11016);
        } else {
            m19488(jM11016);
        }
        m19492();
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19492() {
        Rect rect = this.f22301;
        Rect rect2 = this.f22296;
        rect.set(rect2);
        Rect rect3 = this.f22285;
        rect3.set(rect2);
        long j = this.f22320 ? this.f22308 : this.f22297;
        if (this.f22321 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f22292) / this.f22321)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f22321)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f22315);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m19487() {
        Rect rect = this.f22296;
        if (rect.width() <= 0 || this.f22321 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f22285.width()) * this.f22321) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m19489() {
        long j = this.f22309;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f22321;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f22299);
    }
}
