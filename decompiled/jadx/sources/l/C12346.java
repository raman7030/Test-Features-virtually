package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;

/* JADX INFO: renamed from: l.۫ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public class C12346 extends ViewGroup implements InterfaceC1794, InterfaceC7273, InterfaceC22795 {

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f36945 = 0;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final int[] f36946 = {R.attr.enabled};

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f36947;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public float f36948;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f36949;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public Animation.AnimationListener f36950;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Animation f36951;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f36952;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Animation f36953;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public View f36954;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f36955;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f36956;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f36957;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f36958;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int[] f36959;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int[] f36960;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f36961;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC4585 f36962;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final DecelerateInterpolator f36963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15873 f36964;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f36965;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f36966;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C10967 f36967;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f36968;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C19403 f36969;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f36970;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C13622 f36971;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f36972;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public Animation f36973;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public Animation f36974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Animation f36975;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f36976;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f36977;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Animation f36978;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f36979;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int[] f36980;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29963() {
        this.f36964.clearAnimation();
        this.f36969.stop();
        this.f36964.setVisibility(8);
        this.f36964.getBackground().setAlpha(255);
        this.f36969.setAlpha(255);
        m29961(this.f36976 - this.f36955);
        this.f36955 = this.f36964.getTop();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m29963();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            m29950(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C13051(super.onSaveInstanceState(), this.f36952);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C13051 c13051 = (C13051) parcelable;
        super.onRestoreInstanceState(c13051.getSuperState());
        m29950(c13051.f39069, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m29963();
    }

    public C12346(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36952 = false;
        this.f36948 = -1.0f;
        this.f36959 = new int[2];
        this.f36960 = new int[2];
        this.f36980 = new int[2];
        this.f36977 = -1;
        this.f36961 = -1;
        this.f36950 = new AnimationAnimationListenerC5291(this);
        this.f36953 = new C22224(this);
        this.f36951 = new C20108(this);
        this.f36968 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f36970 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f36963 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.f36965 = i;
        this.f36964 = new C15873(getContext());
        C19403 c19403 = new C19403(getContext());
        this.f36969 = c19403;
        c19403.m44679();
        this.f36964.setImageDrawable(this.f36969);
        this.f36964.setVisibility(8);
        addView(this.f36964);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f36947 = i2;
        this.f36948 = i2;
        this.f36967 = new C10967();
        this.f36971 = new C13622(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.f36955 = i3;
        this.f36976 = i3;
        m29954(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36946);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f36961;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29957(InterfaceC4585 interfaceC4585) {
        this.f36962 = interfaceC4585;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29958(boolean z) {
        m29950(z, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29950(boolean z, boolean z2) {
        if (z && this.f36952 != z) {
            this.f36952 = z;
            m29961((this.f36947 + this.f36976) - this.f36955);
            this.f36956 = z2;
            this.f36964.setVisibility(0);
            this.f36969.setAlpha(255);
            C1057 c1057 = new C1057(this);
            this.f36973 = c1057;
            c1057.setDuration(this.f36970);
            Animation.AnimationListener animationListener = this.f36950;
            if (animationListener != null) {
                this.f36964.m37618(animationListener);
            }
            this.f36964.clearAnimation();
            this.f36964.startAnimation(this.f36973);
            return;
        }
        m29948(z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29948(boolean z, boolean z2) {
        if (this.f36952 != z) {
            this.f36956 = z2;
            m29952();
            this.f36952 = z;
            Animation.AnimationListener animationListener = this.f36950;
            if (!z) {
                m29956(animationListener);
                return;
            }
            this.f36979 = this.f36955;
            Animation animation = this.f36953;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f36963);
            if (animationListener != null) {
                this.f36964.m37618(animationListener);
            }
            this.f36964.clearAnimation();
            this.f36964.startAnimation(animation);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29956(Animation.AnimationListener animationListener) {
        C8113 c8113 = new C8113(this);
        this.f36974 = c8113;
        c8113.setDuration(150L);
        this.f36964.m37618(animationListener);
        this.f36964.clearAnimation();
        this.f36964.startAnimation(this.f36974);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29955(int i) {
        this.f36964.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29959(int... iArr) {
        m29952();
        this.f36969.m44683(iArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29962() {
        return this.f36952;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29952() {
        if (this.f36954 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f36964)) {
                    this.f36954 = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f36954 == null) {
            m29952();
        }
        View view = this.f36954;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f36964.getMeasuredWidth();
        int measuredHeight2 = this.f36964.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f36955;
        this.f36964.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f36954 == null) {
            m29952();
        }
        View view = this.f36954;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        int i3 = this.f36965;
        this.f36964.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.f36961 = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f36964) {
                this.f36961 = i4;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29960() {
        View view = this.f36954;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m29952();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m29960() && !this.f36952 && !this.f36972) {
            if (actionMasked == 0) {
                m29961(this.f36976 - this.f36964.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f36977 = pointerId;
                this.f36949 = false;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.f36966 = motionEvent.getY(iFindPointerIndex2);
                    return this.f36949;
                }
            } else {
                if (actionMasked == 1) {
                    this.f36949 = false;
                    this.f36977 = -1;
                } else if (actionMasked == 2) {
                    int i = this.f36977;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m29953(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f36949 = false;
                    this.f36977 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f36977) {
                        this.f36977 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f36949;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1794
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f36971.m32744(i, i2, i3, i4, this.f36960, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f36960[1] : i7;
        if (i8 >= 0 || m29960()) {
            return;
        }
        float fAbs = this.f36958 + Math.abs(i8);
        this.f36958 = fAbs;
        m29951(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // l.InterfaceC7273
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // l.InterfaceC7273
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // l.InterfaceC7273
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // l.InterfaceC7273
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f36980);
    }

    @Override // l.InterfaceC7273
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f36952 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f36967.m27276(i);
        startNestedScroll(i & 2);
        this.f36958 = 0.0f;
        this.f36972 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f36958;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f36958 = 0.0f;
                } else {
                    this.f36958 = f - f2;
                    iArr[1] = i2;
                }
                m29951(this.f36958);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f36959;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f36967.m27275();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f36967.m27278();
        this.f36972 = false;
        float f = this.f36958;
        if (f > 0.0f) {
            m29949(f);
            this.f36958 = 0.0f;
        } else {
            post(new Runnable() { // from class: l.֡ۤۧ
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C12346.f36945;
                    this.f1762.m29963();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f36980);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f36971.m32745(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f36971.m32746();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f36971.m32750(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f36971.m32754(0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f36971.m32749(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f36971.m32751(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f36971.m32753(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f36971.m32748(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f36971.m32748(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f36971.m32747(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f36971.m32747(f, f2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m29951(float f) {
        Animation animation;
        Animation animation2;
        this.f36969.m44682(true);
        float f2 = this.f36948;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        float f3 = this.f36947;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.f36976 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.f36964.getVisibility() != 0) {
            this.f36964.setVisibility(0);
        }
        this.f36964.setScaleX(1.0f);
        this.f36964.setScaleY(1.0f);
        if (f < f2) {
            if (this.f36969.getAlpha() > 76 && ((animation2 = this.f36975) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C15167 c15167 = new C15167(this, this.f36969.getAlpha(), 76);
                c15167.setDuration(300L);
                this.f36964.m37618(null);
                this.f36964.clearAnimation();
                this.f36964.startAnimation(c15167);
                this.f36975 = c15167;
            }
        } else if (this.f36969.getAlpha() < 255 && ((animation = this.f36978) == null || !animation.hasStarted() || animation.hasEnded())) {
            C15167 c15168 = new C15167(this, this.f36969.getAlpha(), 255);
            c15168.setDuration(300L);
            this.f36964.m37618(null);
            this.f36964.clearAnimation();
            this.f36964.startAnimation(c15168);
            this.f36978 = c15168;
        }
        this.f36969.m44685(Math.min(0.8f, fMax * 0.8f));
        this.f36969.m44680(Math.min(1.0f, fMax));
        this.f36969.m44684(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
        m29961(i - this.f36955);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29949(float f) {
        if (f > this.f36948) {
            m29948(true, true);
            return;
        }
        this.f36952 = false;
        this.f36969.m44685(0.0f);
        AnimationAnimationListenerC21519 animationAnimationListenerC21519 = new AnimationAnimationListenerC21519(this);
        this.f36979 = this.f36955;
        Animation animation = this.f36951;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f36963);
        this.f36964.m37618(animationAnimationListenerC21519);
        this.f36964.clearAnimation();
        this.f36964.startAnimation(animation);
        this.f36969.m44682(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m29960() && !this.f36952 && !this.f36972) {
            if (actionMasked == 0) {
                this.f36977 = motionEvent.getPointerId(0);
                this.f36949 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f36977);
                if (iFindPointerIndex >= 0) {
                    if (this.f36949) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f36957) * 0.5f;
                        this.f36949 = false;
                        m29949(y);
                    }
                    this.f36977 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f36977);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m29953(y2);
                    if (this.f36949) {
                        float f = (y2 - this.f36957) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m29951(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f36977) {
                            this.f36977 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f36977 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29953(float f) {
        float f2 = this.f36966;
        float f3 = f - f2;
        float f4 = this.f36968;
        if (f3 <= f4 || this.f36949) {
            return;
        }
        this.f36957 = f2 + f4;
        this.f36949 = true;
        this.f36969.setAlpha(76);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29954(float f) {
        int i = this.f36979;
        m29961((i + ((int) ((this.f36976 - i) * f))) - this.f36964.getTop());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29961(int i) {
        this.f36964.bringToFront();
        C17648.m41332(i, this.f36964);
        this.f36955 = this.f36964.getTop();
    }
}
