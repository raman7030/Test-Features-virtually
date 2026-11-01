package p067l;

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
public class C14102 extends ViewGroup implements InterfaceC0931, InterfaceC1203, InterfaceC1973 {

    /* JADX INFO: renamed from: ᩸֫ */
    public static final /* synthetic */ int f39958 = 0;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final int[] f39959 = {R.attr.enabled};

    /* JADX INFO: renamed from: ֡֫ */
    public int f39960;

    /* JADX INFO: renamed from: ֨֫ */
    public float f39961;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f39962;

    /* JADX INFO: renamed from: ۖ֫ */
    public Animation.AnimationListener f39963;

    /* JADX INFO: renamed from: ۗ */
    public final Animation f39964;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f39965;

    /* JADX INFO: renamed from: ۙ */
    public final Animation f39966;

    /* JADX INFO: renamed from: ۚ֫ */
    public View f39967;

    /* JADX INFO: renamed from: ۛ */
    public int f39968;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f39969;

    /* JADX INFO: renamed from: ۟ */
    public float f39970;

    /* JADX INFO: renamed from: ۠֫ */
    public float f39971;

    /* JADX INFO: renamed from: ۡ֫ */
    public final int[] f39972;

    /* JADX INFO: renamed from: ۢ֫ */
    public final int[] f39973;

    /* JADX INFO: renamed from: ۤ */
    public int f39974;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC6726 f39975;

    /* JADX INFO: renamed from: ۨ */
    public final DecelerateInterpolator f39976;

    /* JADX INFO: renamed from: ۫ */
    public C17454 f39977;

    /* JADX INFO: renamed from: ۬ */
    public int f39978;

    /* JADX INFO: renamed from: ܰ */
    public float f39979;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C1386 f39980;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f39981;

    /* JADX INFO: renamed from: ܺ֫ */
    public C20809 f39982;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f39983;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C1518 f39984;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f39985;

    /* JADX INFO: renamed from: ᩴ֫ */
    public Animation f39986;

    /* JADX INFO: renamed from: ᩵֫ */
    public Animation f39987;

    /* JADX INFO: renamed from: ᩶ */
    public Animation f39988;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f39989;

    /* JADX INFO: renamed from: ᩸ */
    public int f39990;

    /* JADX INFO: renamed from: ᩹ */
    public Animation f39991;

    /* JADX INFO: renamed from: ᩺ */
    public int f39992;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int[] f39993;

    /* JADX INFO: renamed from: ܽ */
    public final void m32023() {
        this.f39977.clearAnimation();
        this.f39982.stop();
        this.f39977.setVisibility(8);
        this.f39977.getBackground().setAlpha(255);
        this.f39982.setAlpha(255);
        m32021(this.f39989 - this.f39968);
        this.f39968 = this.f39977.getTop();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m32023();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            m32010(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C14772(super.onSaveInstanceState(), this.f39965);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C14772 c14772 = (C14772) parcelable;
        super.onRestoreInstanceState(c14772.getSuperState());
        m32010(c14772.f42114, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m32023();
    }

    public C14102(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39965 = false;
        this.f39961 = -1.0f;
        this.f39972 = new int[2];
        this.f39973 = new int[2];
        this.f39993 = new int[2];
        this.f39990 = -1;
        this.f39974 = -1;
        this.f39963 = new AnimationAnimationListenerC7397(this);
        this.f39966 = new C23490(this);
        this.f39964 = new C21479(this);
        this.f39981 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f39983 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f39976 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.f39978 = i;
        this.f39977 = new C17454(getContext());
        C20809 c20809 = new C20809(getContext());
        this.f39982 = c20809;
        c20809.m46973();
        this.f39977.setImageDrawable(this.f39982);
        this.f39977.setVisibility(8);
        addView(this.f39977);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f39960 = i2;
        this.f39961 = i2;
        this.f39980 = new C1386();
        this.f39984 = new C1518(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.f39968 = i3;
        this.f39989 = i3;
        m32014(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f39959);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f39974;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32017(InterfaceC6726 interfaceC6726) {
        this.f39975 = interfaceC6726;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32018(boolean z) {
        m32010(z, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32010(boolean z, boolean z2) {
        if (z && this.f39965 != z) {
            this.f39965 = z;
            m32021((this.f39960 + this.f39989) - this.f39968);
            this.f39969 = z2;
            this.f39977.setVisibility(0);
            this.f39982.setAlpha(255);
            C3373 c3373 = new C3373(this);
            this.f39986 = c3373;
            c3373.setDuration(this.f39983);
            Animation.AnimationListener animationListener = this.f39963;
            if (animationListener != null) {
                this.f39977.m39790(animationListener);
            }
            this.f39977.clearAnimation();
            this.f39977.startAnimation(this.f39986);
            return;
        }
        m32008(z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32008(boolean z, boolean z2) {
        if (this.f39965 != z) {
            this.f39969 = z2;
            m32012();
            this.f39965 = z;
            Animation.AnimationListener animationListener = this.f39963;
            if (!z) {
                m32016(animationListener);
                return;
            }
            this.f39992 = this.f39968;
            Animation animation = this.f39966;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f39976);
            if (animationListener != null) {
                this.f39977.m39790(animationListener);
            }
            this.f39977.clearAnimation();
            this.f39977.startAnimation(animation);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32016(Animation.AnimationListener animationListener) {
        C10079 c10079 = new C10079(this);
        this.f39987 = c10079;
        c10079.setDuration(150L);
        this.f39977.m39790(animationListener);
        this.f39977.clearAnimation();
        this.f39977.startAnimation(this.f39987);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32015(int i) {
        this.f39977.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32019(int... iArr) {
        m32012();
        this.f39982.m46977(iArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32022() {
        return this.f39965;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m32012() {
        if (this.f39967 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f39977)) {
                    this.f39967 = childAt;
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
        if (this.f39967 == null) {
            m32012();
        }
        View view = this.f39967;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f39977.getMeasuredWidth();
        int measuredHeight2 = this.f39977.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f39968;
        this.f39977.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f39967 == null) {
            m32012();
        }
        View view = this.f39967;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        int i3 = this.f39978;
        this.f39977.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.f39974 = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f39977) {
                this.f39974 = i4;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32020() {
        View view = this.f39967;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m32012();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m32020() && !this.f39965 && !this.f39985) {
            if (actionMasked == 0) {
                m32021(this.f39989 - this.f39977.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.f39990 = pointerId;
                this.f39962 = false;
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex2 >= 0) {
                    this.f39979 = motionEvent.getY(iFindPointerIndex2);
                    return this.f39962;
                }
            } else {
                if (actionMasked == 1) {
                    this.f39962 = false;
                    this.f39990 = -1;
                } else if (actionMasked == 2) {
                    int i = this.f39990;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m32013(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.f39962 = false;
                    this.f39990 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f39990) {
                        this.f39990 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.f39962;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC0931
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f39984.m34858(i, i2, i3, i4, this.f39973, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.f39973[1] : i7;
        if (i8 >= 0 || m32020()) {
            return;
        }
        float fAbs = this.f39971 + Math.abs(i8);
        this.f39971 = fAbs;
        m32011(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p067l.InterfaceC1203
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p067l.InterfaceC1203
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f39993);
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f39965 || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f39980.m29338(i);
        startNestedScroll(i & 2);
        this.f39971 = 0.0f;
        this.f39985 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f39971;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f39971 = 0.0f;
                } else {
                    this.f39971 = f - f2;
                    iArr[1] = i2;
                }
                m32011(this.f39971);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f39972;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f39980.m29337();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f39980.m29340();
        this.f39985 = false;
        float f = this.f39971;
        if (f > 0.0f) {
            m32009(f);
            this.f39971 = 0.0f;
        } else {
            post(new Runnable() { // from class: l.֡ۤۧ
                @Override // java.lang.Runnable
                public final void run() {
                    int i = C14102.f39958;
                    this.f4538.m32023();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f39993);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f39984.m34859(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f39984.m34860();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f39984.m34864(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f39984.m34868(0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f39984.m34863(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f39984.m34865(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f39984.m34867(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f39984.m34862(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f39984.m34862(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f39984.m34861(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f39984.m34861(f, f2);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m32011(float f) {
        Animation animation;
        Animation animation2;
        this.f39982.m46976(true);
        float f2 = this.f39961;
        float fMin = Math.min(1.0f, Math.abs(f / f2));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - f2;
        float f3 = this.f39960;
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i = this.f39989 + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        if (this.f39977.getVisibility() != 0) {
            this.f39977.setVisibility(0);
        }
        this.f39977.setScaleX(1.0f);
        this.f39977.setScaleY(1.0f);
        if (f < f2) {
            if (this.f39982.getAlpha() > 76 && ((animation2 = this.f39988) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                C16783 c16783 = new C16783(this, this.f39982.getAlpha(), 76);
                c16783.setDuration(300L);
                this.f39977.m39790(null);
                this.f39977.clearAnimation();
                this.f39977.startAnimation(c16783);
                this.f39988 = c16783;
            }
        } else if (this.f39982.getAlpha() < 255 && ((animation = this.f39991) == null || !animation.hasStarted() || animation.hasEnded())) {
            C16783 c16784 = new C16783(this, this.f39982.getAlpha(), 255);
            c16784.setDuration(300L);
            this.f39977.m39790(null);
            this.f39977.clearAnimation();
            this.f39977.startAnimation(c16784);
            this.f39991 = c16784;
        }
        this.f39982.m46979(Math.min(0.8f, fMax * 0.8f));
        this.f39982.m46974(Math.min(1.0f, fMax));
        this.f39982.m46978(((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f);
        m32021(i - this.f39968);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32009(float f) {
        if (f > this.f39961) {
            m32008(true, true);
            return;
        }
        this.f39965 = false;
        this.f39982.m46979(0.0f);
        AnimationAnimationListenerC22820 animationAnimationListenerC22820 = new AnimationAnimationListenerC22820(this);
        this.f39992 = this.f39968;
        Animation animation = this.f39964;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f39976);
        this.f39977.m39790(animationAnimationListenerC22820);
        this.f39977.clearAnimation();
        this.f39977.startAnimation(animation);
        this.f39982.m46976(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m32020() && !this.f39965 && !this.f39985) {
            if (actionMasked == 0) {
                this.f39990 = motionEvent.getPointerId(0);
                this.f39962 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f39990);
                if (iFindPointerIndex >= 0) {
                    if (this.f39962) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f39970) * 0.5f;
                        this.f39962 = false;
                        m32009(y);
                    }
                    this.f39990 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f39990);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m32013(y2);
                    if (this.f39962) {
                        float f = (y2 - this.f39970) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m32011(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f39990) {
                            this.f39990 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f39990 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m32013(float f) {
        float f2 = this.f39979;
        float f3 = f - f2;
        float f4 = this.f39981;
        if (f3 <= f4 || this.f39962) {
            return;
        }
        this.f39970 = f2 + f4;
        this.f39962 = true;
        this.f39982.setAlpha(76);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32014(float f) {
        int i = this.f39992;
        m32021((i + ((int) ((this.f39989 - i) * f))) - this.f39977.getTop());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32021(int i) {
        this.f39977.bringToFront();
        C1717.m43578(i, this.f39977);
        this.f39968 = this.f39977.getTop();
    }
}
