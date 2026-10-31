package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5NH */
/* JADX INFO: loaded from: classes4.dex */
public class C12499 extends C9503 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f37535;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f37536;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4738 f37537;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f37538;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f37539;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public RunnableC13204 f37540;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final Rect f37541;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C9269 f37542;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f37543;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f37544;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f37545;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f37546;

    public C12499(Context context, boolean z) {
        super(context, null, R.attr.MT_Protector);
        this.f37541 = new Rect();
        this.f37546 = 0;
        this.f37538 = 0;
        this.f37544 = 0;
        this.f37545 = 0;
        this.f37535 = z;
        setCacheColorHint(0);
        setFastScrollEnabled(true);
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f37535 && this.f37539) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f37535 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f37535 || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f37535 || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4738 c4738 = drawable != null ? new C4738(drawable) : null;
        this.f37537 = c4738;
        super.setSelector(c4738);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f37546 = rect.left;
        this.f37538 = rect.top;
        this.f37544 = rect.right;
        this.f37545 = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f37540 != null) {
            return;
        }
        super.drawableStateChanged();
        C4738 c4738 = this.f37537;
        if (c4738 != null) {
            c4738.m13852(true);
        }
        Drawable selector = getSelector();
        if (selector != null && this.f37543 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // l.C9503, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f37536 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC13204 runnableC13204 = this.f37540;
        if (runnableC13204 != null) {
            C12499 c12499 = runnableC13204.f39473;
            c12499.f37540 = null;
            c12499.removeCallbacks(runnableC13204);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo22295(int i, int i2) {
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
        if (actionMasked == 10 && this.f37540 == null) {
            RunnableC13204 runnableC13204 = new RunnableC13204(this);
            this.f37540 = runnableC13204;
            post(runnableC13204);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C22377.m50241()) {
                        C22377.m50240(this, iPointToPosition, childAt);
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f37543 && isPressed()) {
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
        this.f37540 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m30671(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM10178;
        View childAt;
        View childAt2;
        C9269 c9269;
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
                    this.f37543 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f37536 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f37542 == null) {
                        this.f37542 = new C9269(this);
                    }
                    this.f37542.m19603(true);
                    this.f37542.onTouch(this, motionEvent);
                    return z;
                }
                c9269 = this.f37542;
                if (c9269 != null) {
                    c9269.m19603(false);
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
                this.f37543 = true;
                int i2 = Build.VERSION.SDK_INT;
                C21672.m48940(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f37536;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f37536 = iPointToPosition;
                C21672.m48940(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
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
                Rect rect = this.f37541;
                rect.set(left, top, right, bottom);
                rect.left -= this.f37546;
                rect.top -= this.f37538;
                rect.right += this.f37544;
                rect.bottom += this.f37545;
                if (i2 >= 33) {
                    zM10178 = C20261.m46527(this);
                } else {
                    zM10178 = C3327.m10178(this);
                }
                if (childAt3.isEnabled() != zM10178) {
                    boolean z4 = !zM10178;
                    if (i2 >= 33) {
                        C20261.m46526(this, z4);
                    } else {
                        C3327.m10177(this, z4);
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    C8184.m21674(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C8184.m21674(selector2, f, f2);
                }
                C4738 c4738 = this.f37537;
                if (c4738 != null) {
                    c4738.m13852(false);
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
            this.f37543 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f37536 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f37543 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f37536 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f37542 == null) {
                this.f37542 = new C9269(this);
            }
            this.f37542.m19603(true);
            this.f37542.onTouch(this, motionEvent);
            return z;
        }
        c9269 = this.f37542;
        if (c9269 != null) {
            c9269.m19603(false);
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30670(boolean z) {
        this.f37539 = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f37541;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
