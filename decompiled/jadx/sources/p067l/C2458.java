package p067l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0719o;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes3.dex */
public class C2458 extends FrameLayout implements InterfaceC0931, InterfaceC1973 {

    /* JADX INFO: renamed from: ֫֫ */
    public int f3804;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f3805;

    /* JADX INFO: renamed from: ۗ */
    public EdgeEffect f3806;

    /* JADX INFO: renamed from: ۘ֫ */
    public VelocityTracker f3807;

    /* JADX INFO: renamed from: ۙ */
    public C1763 f3808;

    /* JADX INFO: renamed from: ۛ */
    public boolean f3809;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int[] f3810;

    /* JADX INFO: renamed from: ۟ */
    public int f3811;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f3812;

    /* JADX INFO: renamed from: ۢ֫ */
    public OverScroller f3813;

    /* JADX INFO: renamed from: ۤ */
    public boolean f3814;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f3815;

    /* JADX INFO: renamed from: ۨ */
    public boolean f3816;

    /* JADX INFO: renamed from: ۫ */
    public boolean f3817;

    /* JADX INFO: renamed from: ۬ */
    public EdgeEffect f3818;

    /* JADX INFO: renamed from: ܰ */
    public long f3819;

    /* JADX INFO: renamed from: ܳ֫ */
    public final float f3820;

    /* JADX INFO: renamed from: ܺ֫ */
    public final Rect f3821;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f3822;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C1386 f3823;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC5812 f3824;

    /* JADX INFO: renamed from: ᩴ֫ */
    public float f3825;

    /* JADX INFO: renamed from: ᩶ */
    public View f3826;

    /* JADX INFO: renamed from: ᩷֫ */
    public final int[] f3827;

    /* JADX INFO: renamed from: ᩸ */
    public int f3828;

    /* JADX INFO: renamed from: ᩹ */
    public final C1518 f3829;

    /* JADX INFO: renamed from: ᩺ */
    public int f3830;

    /* JADX INFO: renamed from: ᩻֫ */
    public C20565 f3831;

    /* JADX INFO: renamed from: ֡֫ */
    public static final float f3801 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ᩵֫ */
    public static final C10506 f3803 = new C10506();

    /* JADX INFO: renamed from: ۚ֫ */
    public static final int[] f3802 = {R.attr.fillViewport};

    @Override // p067l.InterfaceC1203
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public C2458(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    public C2458(Context context, AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.f3821 = new Rect();
        this.f3816 = true;
        this.f3809 = false;
        this.f3826 = null;
        this.f3814 = false;
        this.f3812 = true;
        this.f3828 = -1;
        this.f3827 = new int[2];
        this.f3810 = new int[2];
        this.f3808 = new C1763(getContext(), new C4471(this));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C15869.m36004(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f3818 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C15869.m36004(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f3806 = edgeEffect2;
        this.f3820 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f3813 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3805 = viewConfiguration.getScaledTouchSlop();
        this.f3815 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3804 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3802, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.f3817) {
            this.f3817 = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f3823 = new C1386();
        this.f3829 = new C1518(this);
        setNestedScrollingEnabled(true);
        C1717.m43555(this, f3803);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f3829.m34864(i, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3464(int i, int i2) {
        return this.f3829.m34864(2, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m3470(int i) {
        this.f3829.m34868(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3829.m34863(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3829.m34867(i, i2, iArr, iArr2, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3466(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3829.m34867(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.f3829.m34859(z);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3829.m34860();
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m3470(0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3829.m34865(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3829.m34862(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3829.m34861(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f3829.m34861(f, f2);
    }

    @Override // p067l.InterfaceC0931
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3453(i4, i5, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m3453(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3829.m34858(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f3823.m29339(i, i2);
        m3464(2, i2);
    }

    @Override // p067l.InterfaceC1203
    public final void onStopNestedScroll(View view, int i) {
        this.f3823.m29341(i);
        m3470(i);
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m3453(i4, i5, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m3466(i, i2, iArr, null, 0);
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m3466(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3453(i4, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m3469((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f3823.m29337();
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3462(InterfaceC5812 interfaceC5812) {
        this.f3824 = interfaceC5812;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC5812 interfaceC5812 = this.f3824;
        if (interfaceC5812 != null) {
            interfaceC5812.mo13079(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3817 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3467(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m3467(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f3821.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (isFocused() && keyEvent.getKeyCode() != 4) {
                    viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                        return true;
                    }
                }
            } else if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    if (keyEvent.isAltPressed()) {
                        return m3471(33);
                    }
                    return m3463(33);
                }
                if (keyCode == 20) {
                    if (keyEvent.isAltPressed()) {
                        return m3471(130);
                    }
                    return m3463(130);
                }
                if (keyCode == 62) {
                    m3473(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m3471(33);
                }
                if (keyCode == 93) {
                    return m3471(130);
                }
                if (keyCode == 122) {
                    m3473(33);
                    return false;
                }
                if (keyCode == 123) {
                    m3473(130);
                    return false;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad A[PHI: r1
      0x01ad: PHI (r1v11 android.view.VelocityTracker) = (r1v7 android.view.VelocityTracker), (r1v16 android.view.VelocityTracker) binds: [B:84:0x01ab, B:30:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        VelocityTracker velocityTracker;
        float fM54229;
        int iRound;
        int i;
        ViewParent parent2;
        if (this.f3807 == null) {
            this.f3807 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3822 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f3822);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f3818;
            EdgeEffect edgeEffect2 = this.f3806;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker2 = this.f3807;
                velocityTracker2.computeCurrentVelocity(1000, this.f3804);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f3828);
                if (Math.abs(yVelocity) >= this.f3815) {
                    if (C24587.m54227(edgeEffect) != 0.0f) {
                        if (m3458(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m3469(-yVelocity);
                        }
                    } else if (C24587.m54227(edgeEffect2) == 0.0f) {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!this.f3829.m34861(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m3469(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        if (m3458(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            m3469(i3);
                        }
                    }
                } else if (this.f3813.springBack(getScrollX(), getScrollY(), 0, 0, 0, m3460())) {
                    postInvalidateOnAnimation();
                }
                this.f3828 = -1;
                this.f3814 = false;
                velocityTracker = this.f3807;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3807 = null;
                }
                m3470(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3828);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f3830 - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (C24587.m54227(edgeEffect) != 0.0f) {
                        fM54229 = -C24587.m54229(edgeEffect, -height, x);
                        if (C24587.m54227(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (C24587.m54227(edgeEffect2) != 0.0f) {
                        fM54229 = C24587.m54229(edgeEffect2, height, 1.0f - x);
                        if (C24587.m54227(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i4 - iRound;
                        if (!this.f3814 && Math.abs(i) > this.f3805) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f3814 = true;
                            if (i > 0) {
                                i -= this.f3805;
                            } else {
                                i += this.f3805;
                            }
                        }
                        if (this.f3814) {
                            int iM3450 = m3450(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f3830 = y - iM3450;
                            this.f3822 += iM3450;
                        }
                    }
                    f = fM54229;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i4 - iRound;
                    if (!this.f3814) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3814 = true;
                        if (i > 0) {
                            i -= this.f3805;
                        } else {
                            i += this.f3805;
                        }
                    }
                    if (this.f3814) {
                        int iM3451 = m3450(i, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f3830 = y - iM3451;
                        this.f3822 += iM3451;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3814 && getChildCount() > 0) {
                    if (this.f3813.springBack(getScrollX(), getScrollY(), 0, 0, 0, m3460())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f3828 = -1;
                this.f3814 = false;
                velocityTracker = this.f3807;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3807 = null;
                }
                m3470(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3830 = (int) motionEvent.getY(actionIndex);
                this.f3828 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3454(motionEvent);
                this.f3830 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3828));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3814 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3813.isFinished()) {
                this.f3813.abortAnimation();
                m3470(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f3830 = y2;
            this.f3828 = pointerId;
            m3464(2, 0);
        }
        VelocityTracker velocityTracker3 = this.f3807;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f3807) != null) {
            velocityTracker.recycle();
            this.f3807 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3814) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m3459(motionEvent) && this.f3813.isFinished()) {
                        z = false;
                    }
                    this.f3814 = z;
                    velocityTracker = this.f3807;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f3807 = null;
                    }
                } else {
                    this.f3830 = y;
                    this.f3828 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f3807;
                    if (velocityTracker3 == null) {
                        this.f3807 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f3807.addMovement(motionEvent);
                    this.f3813.computeScrollOffset();
                    if (!m3459(motionEvent) && this.f3813.isFinished()) {
                        z = false;
                    }
                    this.f3814 = z;
                    m3464(2, 0);
                }
            } else {
                if (!m3459(motionEvent)) {
                    z = false;
                }
                this.f3814 = z;
                velocityTracker = this.f3807;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3807 = null;
                }
            }
        } else if (i == 1) {
            this.f3814 = false;
            this.f3828 = -1;
            velocityTracker2 = this.f3807;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f3807 = null;
            }
            if (this.f3813.springBack(getScrollX(), getScrollY(), 0, 0, 0, m3460())) {
                postInvalidateOnAnimation();
            }
            m3470(0);
        } else if (i == 2) {
            int i2 = this.f3828;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f3830) > this.f3805 && (2 & this.f3823.m29337()) == 0) {
                    this.f3814 = true;
                    this.f3830 = y2;
                    if (this.f3807 == null) {
                        this.f3807 = VelocityTracker.obtain();
                    }
                    this.f3807.addMovement(motionEvent);
                    this.f3822 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i == 3) {
            this.f3814 = false;
            this.f3828 = -1;
            velocityTracker2 = this.f3807;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f3807 = null;
            }
            if (this.f3813.springBack(getScrollX(), getScrollY(), 0, 0, 0, m3460())) {
                postInvalidateOnAnimation();
            }
            m3470(0);
        } else if (i == 6) {
            m3454(motionEvent);
        }
        return this.f3814;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m3450(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m3464(2, i3);
        }
        boolean zM34867 = this.f3829.m34867(0, i, this.f3810, this.f3827, i3);
        int[] iArr = this.f3827;
        int[] iArr2 = this.f3810;
        if (zM34867) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int iM3460 = m3460();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && m3460() > 0)) && !z;
        boolean z3 = m3465(i4, 0, scrollY, iM3460) && !this.f3829.m34863(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f3829.m34858(0, scrollY2, 0, i4 - scrollY2, this.f3827, i3, iArr2);
        int i6 = i5 + iArr[1];
        int i7 = i4 - iArr2[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f3806;
        EdgeEffect edgeEffect2 = this.f3818;
        if (i8 < 0) {
            if (z2) {
                C24587.m54229(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > iM3460 && z2) {
            C24587.m54229(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f3807) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m3470(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m3458(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM54227 = C24587.m54227(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f3820 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f3801;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM54227;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m3459(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f3818;
        if (C24587.m54227(edgeEffect) != 0.0f) {
            C24587.m54229(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3806;
        if (C24587.m54227(edgeEffect2) == 0.0f) {
            return z;
        }
        C24587.m54229(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m3454(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3828) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3830 = (int) motionEvent.getY(i);
            this.f3828 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3807;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float axisValue;
        int width;
        if (motionEvent.getAction() == 8 && !this.f3814) {
            if ((motionEvent.getSource() & 2) != 2) {
                if ((motionEvent.getSource() & 4194304) == 4194304) {
                    i = 26;
                    axisValue = motionEvent.getAxisValue(26);
                    width = getWidth() / 2;
                } else {
                    i = 0;
                    axisValue = 0.0f;
                    width = 0;
                }
            } else {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            }
            if (axisValue != 0.0f) {
                m3450(-((int) (axisValue * m3468())), width, 1, (motionEvent.getSource() & C0719o.a.f2912r) == 8194);
                if (i != 0) {
                    this.f3808.m45381(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m3468() {
        if (this.f3825 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3825 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3825;
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3465(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.f3829.m34863(1)) {
            this.f3813.springBack(i2, i4, 0, 0, 0, m3460());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m3460() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m3473(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3821;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m3455(i, i2, i3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m3471(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3821;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m3455(i, rect.top, rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m3455(int i, int i2, int i3) {
        boolean z;
        ArrayList<View> arrayList;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < size) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 >= bottom || top >= i3) {
                arrayList = focusables;
            } else {
                boolean z4 = i2 < top && bottom < i3;
                arrayList = focusables;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
            i5++;
            focusables = arrayList;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3450(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3463(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (viewFindNextFocus != null && m3456(viewFindNextFocus, height, getHeight())) {
            Rect rect = this.f3821;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m3450(m3461(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m3450(height, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m3456(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m3456(View view, int i, int i2) {
        Rect rect = this.f3821;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m3452(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3819 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f3813.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                m3464(2, 1);
            } else {
                m3470(1);
            }
            this.f3811 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f3813.isFinished()) {
                this.f3813.abortAnimation();
                m3470(1);
            }
            scrollBy(i, i2);
        }
        this.f3819 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m3472(int i) {
        m3452(0 - getScrollX(), i - getScrollY(), true);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int iM3460;
        int i2;
        int overScrollMode;
        if (this.f3813.isFinished()) {
            return;
        }
        this.f3813.computeScrollOffset();
        int currY = this.f3813.getCurrY();
        int i3 = currY - this.f3811;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f3818;
        EdgeEffect edgeEffect2 = this.f3806;
        if (i3 > 0 && C24587.m54227(edgeEffect) != 0.0f) {
            iRound = Math.round(C24587.m54229(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (iRound != i3) {
                edgeEffect.finish();
            }
        } else {
            if (i3 < 0 && C24587.m54227(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(C24587.m54229(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f3811 = currY;
            iArr = this.f3810;
            iArr[1] = 0;
            m3466(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            iM3460 = m3460();
            if (i != 0) {
                int scrollY = getScrollY();
                m3465(i, getScrollX(), scrollY, iM3460);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f3829.m34858(0, scrollY2, 0, i4, this.f3827, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && iM3460 > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f3813.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f3813.getCurrVelocity());
                    }
                }
                this.f3813.abortAnimation();
                m3470(i2);
            }
            if (!this.f3813.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                m3470(i2);
            }
        }
        i3 -= iRound;
        this.f3811 = currY;
        iArr = this.f3810;
        iArr[1] = 0;
        m3466(0, i3, iArr, null, 1);
        i = i3 - iArr[1];
        iM3460 = m3460();
        if (i != 0) {
            int scrollY3 = getScrollY();
            m3465(i, getScrollX(), scrollY3, iM3460);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f3829.m34858(0, scrollY4, 0, i5, this.f3827, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f3813.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f3813.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f3813.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f3813.getCurrVelocity());
            }
            this.f3813.abortAnimation();
            m3470(i2);
        }
        if (!this.f3813.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            m3470(i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m3461(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f3816) {
            Rect rect = this.f3821;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM3461 = m3461(rect);
            if (iM3461 != 0) {
                scrollBy(0, iM3461);
            }
        } else {
            this.f3826 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect != null && m3456(viewFindNextFocusFromRect, 0, getHeight())) {
            return viewFindNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM3461 = m3461(rect);
        boolean z2 = iM3461 != 0;
        if (z2) {
            if (!z) {
                m3452(0, iM3461, false);
            } else {
                scrollBy(0, iM3461);
                return z2;
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3816 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3816 = false;
        View view = this.f3826;
        if (view != null && m3457(view, this)) {
            View view2 = this.f3826;
            Rect rect = this.f3821;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM3461 = m3461(rect);
            if (iM3461 != 0) {
                scrollBy(0, iM3461);
            }
        }
        this.f3826 = null;
        if (!this.f3809) {
            if (this.f3831 != null) {
                scrollTo(getScrollX(), this.f3831.f63575);
                this.f3831 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3809 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3809 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m3456(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f3821;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM3461 = m3461(rect);
        if (iM3461 != 0) {
            if (!this.f3812) {
                scrollBy(0, iM3461);
            } else {
                m3452(0, iM3461, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m3457(View view, C2458 c2458) {
        if (view == c2458) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m3457((View) parent, c2458);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3469(int i) {
        if (getChildCount() > 0) {
            this.f3813.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3464(2, 1);
            this.f3811 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f3818;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C17210.m38981(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C17210.m38981(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f3806;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(m3460(), scrollY) + height2;
        if (C17210.m38981(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (C17210.m38981(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C20565)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C20565 c20565 = (C20565) parcelable;
        super.onRestoreInstanceState(c20565.getSuperState());
        this.f3831 = c20565;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C20565 c20565 = new C20565(super.onSaveInstanceState());
        c20565.f63575 = getScrollY();
        return c20565;
    }
}
