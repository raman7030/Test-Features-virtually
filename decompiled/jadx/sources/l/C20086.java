package l;

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
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S8 */
/* JADX INFO: loaded from: classes4.dex */
public class C20086 extends FrameLayout {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f65037;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f65038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65039;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f65040;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Rect f65041;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f65042;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f65043;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f65044;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f65045;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f65046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f65047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65048;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65049;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f65050;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public OverScroller f65051;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46289(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    public C20086(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65041 = new Rect();
        this.f65038 = true;
        this.f65050 = null;
        this.f65039 = false;
        this.f65047 = true;
        this.f65049 = -1;
        this.f65048 = true;
        this.f65051 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f65037 = viewConfiguration.getScaledTouchSlop();
        this.f65044 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f65040 = viewConfiguration.getScaledMaximumFlingVelocity();
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
        boolean zM46302;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f65041.setEmpty();
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    View childAt = getChildAt(0);
                    if (childAt == null) {
                        zM46302 = false;
                    } else {
                        if (getHeight() >= getPaddingBottom() + getPaddingTop() + childAt.getHeight()) {
                            zM46302 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM46302 = m46300(33);
                        } else {
                            zM46302 = m46302(33);
                        }
                    }
                    break;
                case 20:
                    View childAt2 = getChildAt(0);
                    if (childAt2 == null) {
                        zM46302 = false;
                    } else {
                        if (getHeight() >= getPaddingBottom() + getPaddingTop() + childAt2.getHeight()) {
                            zM46302 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM46302 = m46300(130);
                        } else {
                            zM46302 = m46302(130);
                        }
                    }
                    break;
                case 21:
                    View childAt3 = getChildAt(0);
                    if (childAt3 == null) {
                        zM46302 = false;
                    } else {
                        if (getWidth() >= getPaddingRight() + getPaddingLeft() + childAt3.getWidth()) {
                            zM46302 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM46302 = m46298(17);
                        } else {
                            zM46302 = m46301(17);
                        }
                    }
                    break;
                case 22:
                    View childAt4 = getChildAt(0);
                    if (childAt4 == null) {
                        zM46302 = false;
                    } else {
                        if (getWidth() >= getPaddingRight() + getPaddingLeft() + childAt4.getWidth()) {
                            zM46302 = false;
                        } else if (!keyEvent.isAltPressed()) {
                            zM46302 = m46298(66);
                        } else {
                            zM46302 = m46301(66);
                        }
                    }
                    break;
                default:
                    zM46302 = false;
                    break;
            }
        } else {
            zM46302 = false;
        }
        return zM46302;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f65039) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            float x = motionEvent.getX();
            this.f65045 = motionEvent.getY();
            this.f65046 = x;
            this.f65049 = motionEvent.getPointerId(0);
            this.f65039 = !this.f65051.isFinished();
        } else if (i == 1) {
            this.f65039 = false;
            this.f65049 = -1;
        } else if (i == 2) {
            int i2 = this.f65049;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float y = motionEvent.getY(iFindPointerIndex);
                if (((int) Math.abs(y - this.f65045)) > this.f65037) {
                    this.f65039 = true;
                    this.f65045 = y;
                }
                float x2 = motionEvent.getX(iFindPointerIndex);
                if (((int) Math.abs(x2 - this.f65046)) > this.f65037) {
                    this.f65039 = true;
                    this.f65046 = x2;
                }
            }
        } else if (i == 3) {
            this.f65039 = false;
            this.f65049 = -1;
        } else if (i == 6) {
            m46290(motionEvent);
        }
        return this.f65039;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f65043 == null) {
            this.f65043 = VelocityTracker.obtain();
        }
        this.f65043.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f65039 = true;
            if (!this.f65051.isFinished()) {
                this.f65051.abortAnimation();
            }
            this.f65045 = y;
            this.f65046 = x;
            this.f65049 = motionEvent.getPointerId(0);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 6) {
                        m46290(motionEvent);
                        return true;
                    }
                } else if (this.f65039 && getChildCount() > 0) {
                    this.f65049 = -1;
                    this.f65039 = false;
                    VelocityTracker velocityTracker = this.f65043;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f65043 = null;
                        return true;
                    }
                }
            } else if (this.f65039) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f65049);
                float y2 = motionEvent.getY(iFindPointerIndex);
                int i = (int) (this.f65045 - y2);
                this.f65045 = y2;
                float x2 = motionEvent.getX(iFindPointerIndex);
                int i2 = (int) (this.f65046 - x2);
                this.f65046 = x2;
                scrollBy(i2, i);
                return true;
            }
        } else if (this.f65039) {
            if (this.f65048) {
                VelocityTracker velocityTracker2 = this.f65043;
                velocityTracker2.computeCurrentVelocity(1000, this.f65040);
                int xVelocity = (int) velocityTracker2.getXVelocity();
                int yVelocity = (int) velocityTracker2.getYVelocity();
                if (getChildCount() > 0 && (Math.abs(xVelocity) > xVelocity || Math.abs(yVelocity) > this.f65044)) {
                    int i3 = -xVelocity;
                    int i4 = -yVelocity;
                    if (getChildCount() > 0) {
                        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
                        int width2 = getChildAt(0).getWidth();
                        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                        this.f65051.fling(getScrollX(), getScrollY(), i3, i4, 0, Math.max(0, width2 - width), 0, Math.max(0, getChildAt(0).getHeight() - height));
                        invalidate();
                    }
                }
            }
            this.f65049 = -1;
            this.f65039 = false;
            VelocityTracker velocityTracker3 = this.f65043;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f65043 = null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46290(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f65049) {
            int i = action == 0 ? 1 : 0;
            this.f65046 = motionEvent.getX(i);
            this.f65045 = motionEvent.getY(i);
            this.f65049 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f65043;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m46302(int i) {
        boolean z;
        ArrayList<View> arrayList;
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f65041;
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
            m46294(z3 ? i2 - scrollY : i3 - i4);
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m46301(int i) {
        boolean z;
        ArrayList<View> arrayList;
        boolean z2 = i == 66;
        int width = getWidth();
        Rect rect = this.f65041;
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
            m46295(z3 ? i2 - scrollX : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m46300(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int bottom = (int) ((getBottom() - getTop()) * 0.5f);
        if (viewFindNextFocus != null && m46292(viewFindNextFocus, bottom, getHeight())) {
            Rect rect = this.f65041;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m46294(m46299(rect));
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
            m46294(bottom);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || m46292(viewFindFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46298(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int right = (int) ((getRight() - getLeft()) * 0.5f);
        if (viewFindNextFocus != null && m46291(right, viewFindNextFocus)) {
            Rect rect = this.f65041;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m46295(m46296(rect));
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
            m46295(right);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || m46291(0, viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46292(View view, int i, int i2) {
        Rect rect = this.f65041;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46291(int i, View view) {
        Rect rect = this.f65041;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.right + i >= getScrollX()) {
            return rect.left - i <= getWidth() + getScrollX();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m46294(int i) {
        if (i != 0) {
            if (this.f65047) {
                m46297(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m46295(int i) {
        if (i != 0) {
            if (this.f65047) {
                m46297(i, 0);
            } else {
                scrollBy(i, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46297(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f65042 > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            int iMax2 = Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY;
            int iMax3 = Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()));
            int scrollX = getScrollX();
            this.f65051.startScroll(scrollX, scrollY, Math.max(0, Math.min(i + scrollX, iMax3)) - scrollX, iMax2);
            invalidate();
        } else {
            if (!this.f65051.isFinished()) {
                this.f65051.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f65042 = AnimationUtils.currentAnimationTimeMillis();
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
        if (this.f65051.computeScrollOffset()) {
            int currX = this.f65051.getCurrX();
            int currY = this.f65051.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                super.scrollTo(m46289(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth()), m46289(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight()));
            }
            awakenScrollBars();
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46299(Rect rect) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46296(Rect rect) {
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
        if (!this.f65038) {
            Rect rect = this.f65041;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM46299 = m46299(rect);
            int iM46296 = m46296(rect);
            if (iM46296 != 0 || iM46299 != 0) {
                scrollBy(iM46296, iM46299);
            }
        } else {
            this.f65050 = view2;
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
        int iM46299 = m46299(rect);
        int iM46296 = m46296(rect);
        boolean z2 = (iM46296 == 0 && iM46299 == 0) ? false : true;
        if (z2) {
            if (z) {
                scrollBy(iM46296, iM46299);
                return z2;
            }
            m46297(iM46296, iM46299);
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f65038 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f65038 = false;
        View view = this.f65050;
        if (view != null && m46293(view, this)) {
            View view2 = this.f65050;
            Rect rect = this.f65041;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM46299 = m46299(rect);
            int iM46296 = m46296(rect);
            if (iM46296 != 0 || iM46299 != 0) {
                scrollBy(iM46296, iM46299);
            }
        }
        this.f65050 = null;
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus) {
            return;
        }
        boolean zM46292 = m46292(viewFindFocus, 0, i4);
        Rect rect = this.f65041;
        if (zM46292) {
            viewFindFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindFocus, rect);
            m46294(m46299(rect));
        }
        if (m46291(getRight() - getLeft(), viewFindFocus)) {
            viewFindFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindFocus, rect);
            m46295(m46296(rect));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46293(View view, C20086 c20086) {
        if (view == c20086) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m46293((View) parent, c20086);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iM46289 = m46289(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iM462810 = m46289(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iM46289 == getScrollX() && iM462810 == getScrollY()) {
                return;
            }
            super.scrollTo(iM46289, iM462810);
        }
    }
}
