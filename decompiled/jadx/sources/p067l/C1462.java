package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫ܺ */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes4.dex */
public class C1462 extends C11400 {

    /* JADX INFO: renamed from: ֡֫ */
    public boolean f40559;

    /* JADX INFO: renamed from: ֨֫ */
    public int f40560;

    /* JADX INFO: renamed from: ۗ֫ */
    public C1077 f40561;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f40562;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f40563;

    /* JADX INFO: renamed from: ۠֫ */
    public RunnableC1497 f40564;

    /* JADX INFO: renamed from: ۬֫ */
    public final Rect f40565;

    /* JADX INFO: renamed from: ܶ֫ */
    public C11177 f40566;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f40567;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f40568;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f40569;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f40570;

    public C1462(Context context, boolean z) {
        super(context, null, R.attr.MT_Protector);
        this.f40565 = new Rect();
        this.f40570 = 0;
        this.f40562 = 0;
        this.f40568 = 0;
        this.f40569 = 0;
        this.f40559 = z;
        setCacheColorHint(0);
        setFastScrollEnabled(true);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f40559 && this.f40563) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f40559 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f40559 || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f40559 || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1077 c1077 = drawable != null ? new C1077(drawable) : null;
        this.f40561 = c1077;
        super.setSelector(c1077);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f40570 = rect.left;
        this.f40562 = rect.top;
        this.f40568 = rect.right;
        this.f40569 = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f40564 != null) {
            return;
        }
        super.drawableStateChanged();
        C1077 c1077 = this.f40561;
        if (c1077 != null) {
            c1077.m15732(true);
        }
        Drawable selector = getSelector();
        if (selector != null && this.f40567 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // p067l.C11400, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40560 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1497 runnableC1497 = this.f40564;
        if (runnableC1497 != null) {
            C1462 c1462 = runnableC1497.f42538;
            c1462.f40564 = null;
            c1462.removeCallbacks(runnableC1497);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo24264(int i, int i2) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            if (i5 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, iMakeMeasureSpec);
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f40564 == null) {
            RunnableC1497 runnableC1497 = new RunnableC1497(this);
            this.f40564 = runnableC1497;
            post(runnableC1497);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C1952.m52581()) {
                        C1952.m52580(this, iPointToPosition, childAt);
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f40567 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
            return zOnHoverEvent;
        }
        setSelection(-1);
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f40564 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX INFO: renamed from: ֫ */
    public boolean m32746(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM12214;
        View childAt;
        View childAt2;
        C11177 c11177;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || z2) {
                    this.f40567 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f40560 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f40566 == null) {
                        this.f40566 = new C11177(this);
                    }
                    this.f40566.m21571(true);
                    this.f40566.onTouch(this, motionEvent);
                    return z;
                }
                c11177 = this.f40566;
                if (c11177 != null) {
                    c11177.m21571(false);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f40567 = true;
                int i2 = Build.VERSION.SDK_INT;
                C1917.m51289(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f40560;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f40560 = iPointToPosition;
                C1917.m51289(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f40565;
                rect.set(left, top, right, bottom);
                rect.left -= this.f40570;
                rect.top -= this.f40562;
                rect.right += this.f40568;
                rect.bottom += this.f40569;
                if (i2 >= 33) {
                    zM12214 = C1847.m48849(this);
                } else {
                    zM12214 = C1007.m12214(this);
                }
                if (childAt3.isEnabled() != zM12214) {
                    boolean z4 = !zM12214;
                    if (i2 >= 33) {
                        C1847.m48848(this, z4);
                    } else {
                        C1007.m12213(this, z4);
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    C1248.m23643(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C1248.m23643(selector2, f, f2);
                }
                C1077 c1077 = this.f40561;
                if (c1077 != null) {
                    c1077.m15732(false);
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f40567 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f40560 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f40567 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f40560 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f40566 == null) {
                this.f40566 = new C11177(this);
            }
            this.f40566.m21571(true);
            this.f40566.onTouch(this, motionEvent);
            return z;
        }
        c11177 = this.f40566;
        if (c11177 != null) {
            c11177.m21571(false);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32745(boolean z) {
        this.f40563 = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f40565;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
