package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S8 */
/* JADX INFO: loaded from: classes4.dex */
public class C21458 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫ */
    public int f67677;

    /* JADX INFO: renamed from: ۗ */
    public boolean f67678;

    /* JADX INFO: renamed from: ۙ */
    public boolean f67679;

    /* JADX INFO: renamed from: ۛ */
    public int f67680;

    /* JADX INFO: renamed from: ۟ */
    public final Rect f67681;

    /* JADX INFO: renamed from: ۤ */
    public long f67682;

    /* JADX INFO: renamed from: ۧ֫ */
    public VelocityTracker f67683;

    /* JADX INFO: renamed from: ۨ */
    public int f67684;

    /* JADX INFO: renamed from: ۫ */
    public float f67685;

    /* JADX INFO: renamed from: ۬ */
    public float f67686;

    /* JADX INFO: renamed from: ܰ */
    public boolean f67687;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f67688;

    /* JADX INFO: renamed from: ᩸ */
    public int f67689;

    /* JADX INFO: renamed from: ᩹ */
    public View f67690;

    /* JADX INFO: renamed from: ᩺ */
    public OverScroller f67691;

    /* JADX INFO: renamed from: ֫ */
    public static int m48605(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public C21458(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67681 = new Rect();
        this.f67678 = true;
        this.f67690 = null;
        this.f67679 = false;
        this.f67687 = true;
        this.f67689 = -1;
        this.f67688 = true;
        this.f67691 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f67677 = viewConfiguration.getScaledTouchSlop();
        this.f67684 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67680 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (getScrollY() < verticalFadingEdgeLength) {
            return getScrollY() / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (getScrollX() < horizontalFadingEdgeLength) {
            return getScrollX() / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
        if (right < horizontalFadingEdgeLength) {
            return right / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
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

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM48618;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f67681.setEmpty();
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    View childAt = getChildAt(0);
                    if (childAt == null) {
                        zM48618 = false;
                    } else {
                        if (getHeight() >= getPaddingBottom() + getPaddingTop() + childAt.getHeight()) {
                            zM48618 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM48618 = m48616(33);
                        } else {
                            zM48618 = m48618(33);
                        }
                    }
                    break;
                case 20:
                    View childAt2 = getChildAt(0);
                    if (childAt2 == null) {
                        zM48618 = false;
                    } else {
                        if (getHeight() >= getPaddingBottom() + getPaddingTop() + childAt2.getHeight()) {
                            zM48618 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM48618 = m48616(130);
                        } else {
                            zM48618 = m48618(130);
                        }
                    }
                    break;
                case 21:
                    View childAt3 = getChildAt(0);
                    if (childAt3 == null) {
                        zM48618 = false;
                    } else {
                        if (getWidth() >= getPaddingRight() + getPaddingLeft() + childAt3.getWidth()) {
                            zM48618 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM48618 = m48614(17);
                        } else {
                            zM48618 = m48617(17);
                        }
                    }
                    break;
                case 22:
                    View childAt4 = getChildAt(0);
                    if (childAt4 == null) {
                        zM48618 = false;
                    } else {
                        if (getWidth() >= getPaddingRight() + getPaddingLeft() + childAt4.getWidth()) {
                            zM48618 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM48618 = m48614(66);
                        } else {
                            zM48618 = m48617(66);
                        }
                    }
                    break;
                default:
                    zM48618 = false;
                    break;
            }
        } else {
            zM48618 = false;
        }
        return zM48618;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f67679) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            float x = motionEvent.getX();
            this.f67685 = motionEvent.getY();
            this.f67686 = x;
            this.f67689 = motionEvent.getPointerId(0);
            this.f67679 = !this.f67691.isFinished();
        } else if (i == 1) {
            this.f67679 = false;
            this.f67689 = -1;
        } else if (i == 2) {
            int i2 = this.f67689;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float y = motionEvent.getY(iFindPointerIndex);
                if (((int) Math.abs(y - this.f67685)) > this.f67677) {
                    this.f67679 = true;
                    this.f67685 = y;
                }
                float x2 = motionEvent.getX(iFindPointerIndex);
                if (((int) Math.abs(x2 - this.f67686)) > this.f67677) {
                    this.f67679 = true;
                    this.f67686 = x2;
                }
            }
        } else if (i == 3) {
            this.f67679 = false;
            this.f67689 = -1;
        } else if (i == 6) {
            m48606(motionEvent);
        }
        return this.f67679;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f67683 == null) {
            this.f67683 = VelocityTracker.obtain();
        }
        this.f67683.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f67679 = true;
            if (!this.f67691.isFinished()) {
                this.f67691.abortAnimation();
            }
            this.f67685 = y;
            this.f67686 = x;
            this.f67689 = motionEvent.getPointerId(0);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 6) {
                        m48606(motionEvent);
                        return true;
                    }
                } else if (this.f67679 && getChildCount() > 0) {
                    this.f67689 = -1;
                    this.f67679 = false;
                    VelocityTracker velocityTracker = this.f67683;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f67683 = null;
                        return true;
                    }
                }
            } else if (this.f67679) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f67689);
                float y2 = motionEvent.getY(iFindPointerIndex);
                int i = (int) (this.f67685 - y2);
                this.f67685 = y2;
                float x2 = motionEvent.getX(iFindPointerIndex);
                int i2 = (int) (this.f67686 - x2);
                this.f67686 = x2;
                scrollBy(i2, i);
                return true;
            }
        } else if (this.f67679) {
            if (this.f67688) {
                VelocityTracker velocityTracker2 = this.f67683;
                velocityTracker2.computeCurrentVelocity(1000, this.f67680);
                int xVelocity = (int) velocityTracker2.getXVelocity();
                int yVelocity = (int) velocityTracker2.getYVelocity();
                if (getChildCount() > 0 && (Math.abs(xVelocity) > xVelocity || Math.abs(yVelocity) > this.f67684)) {
                    int i3 = -xVelocity;
                    int i4 = -yVelocity;
                    if (getChildCount() > 0) {
                        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
                        int width2 = getChildAt(0).getWidth();
                        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                        this.f67691.fling(getScrollX(), getScrollY(), i3, i4, 0, Math.max(0, width2 - width), 0, Math.max(0, getChildAt(0).getHeight() - height));
                        invalidate();
                    }
                }
            }
            this.f67689 = -1;
            this.f67679 = false;
            VelocityTracker velocityTracker3 = this.f67683;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f67683 = null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48606(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f67689) {
            int i = action == 0 ? 1 : 0;
            this.f67686 = motionEvent.getX(i);
            this.f67685 = motionEvent.getY(i);
            this.f67689 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f67683;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX INFO: renamed from: ᩳ */
    public final boolean m48618(int i) {
        boolean z;
        ArrayList<View> arrayList;
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f67681;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            int bottom = getChildAt(childCount - 1).getBottom();
            rect.bottom = bottom;
            rect.top = bottom - height;
        }
        int i2 = rect.top;
        int i3 = rect.bottom;
        int height2 = getHeight();
        int scrollY = getScrollY();
        int i4 = height2 + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < size) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom2 = view2.getBottom();
            if (i2 >= bottom2 || top >= i3) {
                arrayList = focusables;
            } else {
                boolean z5 = i2 < top && bottom2 < i3;
                arrayList = focusables;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom2 > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
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
            m48610(z3 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX INFO: renamed from: ܽ */
    public final boolean m48617(int i) {
        boolean z;
        ArrayList<View> arrayList;
        boolean z2 = i == 66;
        int width = getWidth();
        Rect rect = this.f67681;
        rect.left = 0;
        rect.right = width;
        if (z2 && getChildCount() > 0) {
            int right = getChildAt(0).getRight();
            rect.right = right;
            rect.left = right - width;
        }
        int i2 = rect.left;
        int i3 = rect.right;
        int width2 = getWidth();
        int scrollX = getScrollX();
        int i4 = width2 + scrollX;
        boolean z3 = i == 17;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < size) {
            View view2 = focusables.get(i5);
            int left = view2.getLeft();
            int right2 = view2.getRight();
            if (i2 >= right2 || left >= i3) {
                arrayList = focusables;
            } else {
                boolean z5 = i2 < left && right2 < i3;
                arrayList = focusables;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && left < view.getLeft()) || (!z3 && right2 > view.getRight());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
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
        if (i2 < scrollX || i3 > i4) {
            m48611(z3 ? i2 - scrollX : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m48616(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int bottom = (int) ((getBottom() - getTop()) * 0.5f);
        if (viewFindNextFocus != null && m48608(viewFindNextFocus, bottom, getHeight())) {
            Rect rect = this.f67681;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m48610(m48615(rect));
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < bottom) {
                bottom = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom2 = getChildAt(0).getBottom() - (getHeight() + getScrollY());
                if (bottom2 < bottom) {
                    bottom = bottom2;
                }
            }
            if (bottom == 0) {
                return false;
            }
            if (i != 130) {
                bottom = -bottom;
            }
            m48610(bottom);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || m48608(viewFindFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48614(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int right = (int) ((getRight() - getLeft()) * 0.5f);
        if (viewFindNextFocus != null && m48607(right, viewFindNextFocus)) {
            Rect rect = this.f67681;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m48611(m48612(rect));
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 17 && getScrollX() < right) {
                right = getScrollX();
            } else if (i == 66 && getChildCount() > 0) {
                int right2 = getChildAt(0).getRight() - (getWidth() + getScrollX());
                if (right2 < right) {
                    right = right2;
                }
            }
            if (right == 0) {
                return false;
            }
            if (i != 66) {
                right = -right;
            }
            m48611(right);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || m48607(0, viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m48608(View view, int i, int i2) {
        Rect rect = this.f67681;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m48607(int i, View view) {
        Rect rect = this.f67681;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.right + i >= getScrollX()) {
            return rect.left - i <= getWidth() + getScrollX();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m48610(int i) {
        if (i != 0) {
            if (this.f67687) {
                m48613(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m48611(int i) {
        if (i != 0) {
            if (this.f67687) {
                m48613(i, 0);
            } else {
                scrollBy(i, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48613(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f67682 > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            int iMax2 = Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY;
            int iMax3 = Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()));
            int scrollX = getScrollX();
            this.f67691.startScroll(scrollX, scrollY, Math.max(0, Math.min(i + scrollX, iMax3)) - scrollX, iMax2);
            invalidate();
        } else {
            if (!this.f67691.isFinished()) {
                this.f67691.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f67682 = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return getChildCount() == 0 ? (getHeight() - getPaddingBottom()) - getPaddingTop() : getChildAt(0).getBottom();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return getChildCount() == 0 ? (getWidth() - getPaddingLeft()) - getPaddingRight() : getChildAt(0).getRight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return Math.max(0, super.computeHorizontalScrollOffset());
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f67691.computeScrollOffset()) {
            int currX = this.f67691.getCurrX();
            int currY = this.f67691.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                super.scrollTo(m48605(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth()), m48605(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight()));
            }
            awakenScrollBars();
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48615(Rect rect) {
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
        if (rect.bottom < getChildAt(0).getHeight()) {
            i3 -= verticalFadingEdgeLength;
        }
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i3;
            }
            return Math.min(i2, getChildAt(0).getBottom() - i3);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i3 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48612(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i3 = scrollX + width;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (rect.left > 0) {
            scrollX += horizontalFadingEdgeLength;
        }
        if (rect.right < getChildAt(0).getWidth()) {
            i3 -= horizontalFadingEdgeLength;
        }
        int i4 = rect.right;
        if (i4 > i3 && rect.left > scrollX) {
            if (rect.width() > width) {
                i2 = rect.left - scrollX;
            } else {
                i2 = rect.right - i3;
            }
            return Math.min(i2, getChildAt(0).getRight() - i3);
        }
        if (rect.left >= scrollX || i4 >= i3) {
            return 0;
        }
        if (rect.width() > width) {
            i = 0 - (i3 - rect.right);
        } else {
            i = 0 - (scrollX - rect.left);
        }
        return Math.max(i, -getScrollX());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f67678) {
            Rect rect = this.f67681;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM48615 = m48615(rect);
            int iM48612 = m48612(rect);
            if (iM48612 != 0 || iM48615 != 0) {
                scrollBy(iM48612, iM48615);
            }
        } else {
            this.f67690 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i != 33 && i != 130 && i != 17 && i != 66) {
            return false;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect == null) {
            return false;
        }
        return viewFindNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM48615 = m48615(rect);
        int iM48612 = m48612(rect);
        boolean z2 = (iM48612 == 0 && iM48615 == 0) ? false : true;
        if (z2) {
            if (z) {
                scrollBy(iM48612, iM48615);
                return z2;
            }
            m48613(iM48612, iM48615);
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f67678 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f67678 = false;
        View view = this.f67690;
        if (view != null && m48609(view, this)) {
            View view2 = this.f67690;
            Rect rect = this.f67681;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM48615 = m48615(rect);
            int iM48612 = m48612(rect);
            if (iM48612 != 0 || iM48615 != 0) {
                scrollBy(iM48612, iM48615);
            }
        }
        this.f67690 = null;
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus) {
            return;
        }
        boolean zM48608 = m48608(viewFindFocus, 0, i4);
        Rect rect = this.f67681;
        if (zM48608) {
            viewFindFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindFocus, rect);
            m48610(m48615(rect));
        }
        if (m48607(getRight() - getLeft(), viewFindFocus)) {
            viewFindFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindFocus, rect);
            m48611(m48612(rect));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48609(View view, C21458 c21458) {
        if (view == c21458) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m48609((View) parent, c21458);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iM48605 = m48605(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iM48606 = m48605(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iM48605 == getScrollX() && iM48606 == getScrollY()) {
                return;
            }
            super.scrollTo(iM48605, iM48606);
        }
    }
}
