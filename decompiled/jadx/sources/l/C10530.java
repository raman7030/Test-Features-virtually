package l;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public class C10530 extends ViewGroup implements InterfaceC19556, InterfaceC7273, InterfaceC1794 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final C21610 f31561;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final Rect f31562;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final int[] f31563 = {R.attr.MT_Protector, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f31564;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final AnimatorListenerAdapter f31565;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f31566;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Drawable f31567;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f31568;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Rect f31569;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C12646 f31570;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f31571;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f31572;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C10967 f31573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18850 f31574;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f31575;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewPropertyAnimator f31576;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21610 f31577;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Rect f31578;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public OverScroller f31579;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C21610 f31580;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final Rect f31581;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C21610 f31582;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C21610 f31583;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final Rect f31584;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f31585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17668 f31586;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f31587;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31588;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15467 f31589;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC0504 f31590;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f31591;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // l.InterfaceC7273
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    static {
        C23726 c23726 = new C23726();
        c23726.m52376(C11007.m27341(0, 1, 0, 1));
        f31561 = c23726.m52373();
        f31562 = new Rect();
    }

    public C10530(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31585 = 0;
        this.f31578 = new Rect();
        this.f31584 = new Rect();
        this.f31569 = new Rect();
        this.f31581 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C21610 c21610 = C21610.f69386;
        this.f31577 = c21610;
        this.f31583 = c21610;
        this.f31582 = c21610;
        this.f31580 = c21610;
        this.f31565 = new C20408(this);
        this.f31572 = new RunnableC4885(this);
        this.f31568 = new RunnableC3474(this);
        m26429(context);
        this.f31573 = new C10967();
        C12646 c12646 = new C12646(context);
        c12646.setWillNotDraw(true);
        this.f31570 = c12646;
        addView(c12646);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26429(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f31563);
        this.f31588 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f31567 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f31579 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m26438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26435(C17668 c17668) {
        this.f31586 = c17668;
        if (getWindowToken() != null) {
            this.f31586.m41392(this.f31585);
            int i = this.f31591;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C17648.m41339(this);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26446() {
        return this.f31587;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26436(boolean z) {
        this.f31571 = z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26429(getContext());
        C17648.m41339(this);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m26439();
        int i2 = this.f31591 ^ i;
        this.f31591 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C17668 c17668 = this.f31586;
        if (c17668 != null) {
            c17668.m41393(!z2);
            if (z || !z2) {
                this.f31586.m41390();
            } else {
                this.f31586.m41395();
            }
        }
        if ((i2 & 256) == 0 || this.f31586 == null) {
            return;
        }
        C17648.m41339(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f31585 = i;
        C17668 c17668 = this.f31586;
        if (c17668 != null) {
            c17668.m41392(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26430(View view, Rect rect, boolean z) {
        boolean z2;
        C13351 c13351 = (C13351) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c13351).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c13351).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c13351).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c13351).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c13351).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c13351).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c13351).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c13351).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m26439();
        C21610 c21610M48814 = C21610.m48814(this, windowInsets);
        boolean zM26430 = m26430(this.f31589, new Rect(c21610M48814.m48824(), c21610M48814.m48826(), c21610M48814.m48834(), c21610M48814.m48835()), false);
        Rect rect = this.f31578;
        C17648.m41311(this, c21610M48814, rect);
        C21610 c21610M48817 = c21610M48814.m48817(rect.left, rect.top, rect.right, rect.bottom);
        this.f31577 = c21610M48817;
        boolean z = true;
        if (!this.f31583.equals(c21610M48817)) {
            this.f31583 = this.f31577;
            zM26430 = true;
        }
        Rect rect2 = this.f31584;
        if (rect2.equals(rect)) {
            z = zM26430;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c21610M48814.m48816().m48831().m48828().m48823();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C13351(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C13351(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C13351(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C13351;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m26439();
        measureChildWithMargins(this.f31589, i, 0, i2, 0);
        C13351 c13351 = (C13351) this.f31589.getLayoutParams();
        int iMax = Math.max(0, this.f31589.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c13351).leftMargin + ((ViewGroup.MarginLayoutParams) c13351).rightMargin);
        int iMax2 = Math.max(0, this.f31589.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c13351).topMargin + ((ViewGroup.MarginLayoutParams) c13351).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f31589.getMeasuredState());
        int i3 = C17648.f53953;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f31588;
            if (this.f31571) {
                this.f31589.getClass();
            }
        } else {
            measuredHeight = this.f31589.getVisibility() != 8 ? this.f31589.getMeasuredHeight() : 0;
        }
        Rect rect = this.f31578;
        Rect rect2 = this.f31569;
        rect2.set(rect);
        this.f31582 = this.f31577;
        if (!this.f31587 && !z) {
            C12646 c12646 = this.f31570;
            C21610 c21610 = f31561;
            Rect rect3 = this.f31581;
            C17648.m41311(c12646, c21610, rect3);
            if (!rect3.equals(f31562)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f31582 = this.f31582.m48817(0, measuredHeight, 0, 0);
            } else {
                C11007 c11007M27341 = C11007.m27341(this.f31582.m48824(), this.f31582.m48826() + measuredHeight, this.f31582.m48834(), this.f31582.m48835());
                C23726 c23726 = new C23726(this.f31582);
                c23726.m52376(c11007M27341);
                this.f31582 = c23726.m52373();
            }
        } else {
            C11007 c11007M27342 = C11007.m27341(this.f31582.m48824(), this.f31582.m48826() + measuredHeight, this.f31582.m48834(), this.f31582.m48835());
            C23726 c23727 = new C23726(this.f31582);
            c23727.m52376(c11007M27342);
            this.f31582 = c23727.m52373();
        }
        m26430(this.f31574, rect2, true);
        if (!this.f31580.equals(this.f31582)) {
            C21610 c21611 = this.f31582;
            this.f31580 = c21611;
            C17648.m41299(this.f31574, c21611);
        }
        measureChildWithMargins(this.f31574, i, 0, i2, 0);
        C13351 c13352 = (C13351) this.f31574.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f31574.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c13352).leftMargin + ((ViewGroup.MarginLayoutParams) c13352).rightMargin);
        int iMax4 = Math.max(iMax2, this.f31574.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c13352).topMargin + ((ViewGroup.MarginLayoutParams) c13352).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f31574.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C13351 c13351 = (C13351) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c13351).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c13351).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f31567 != null) {
            if (this.f31589.getVisibility() == 0) {
                translationY = (int) (this.f31589.getTranslationY() + this.f31589.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f31567.setBounds(0, translationY, getWidth(), this.f31567.getIntrinsicHeight() + translationY);
            this.f31567.draw(canvas);
        }
    }

    @Override // l.InterfaceC1794
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // l.InterfaceC7273
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
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
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f31589.getVisibility() != 0) {
            return false;
        }
        return this.f31564;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f31573.m27276(i);
        C15467 c15467 = this.f31589;
        this.f31575 = c15467 != null ? -((int) c15467.getTranslationY()) : 0;
        m26438();
        C17668 c17668 = this.f31586;
        if (c17668 != null) {
            c17668.m41391();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f31575 + i2;
        this.f31575 = i5;
        m26438();
        this.f31589.setTranslationY(-Math.max(0, Math.min(i5, this.f31589.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f31564 || this.f31566) {
            return;
        }
        if (this.f31575 <= this.f31589.getHeight()) {
            m26438();
            postDelayed(this.f31572, 600L);
        } else {
            m26438();
            postDelayed(this.f31568, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f31564 || !z) {
            return false;
        }
        this.f31579.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f31579.getFinalY() <= this.f31589.getHeight()) {
            m26438();
            ((RunnableC4885) this.f31572).run();
        } else {
            m26438();
            ((RunnableC3474) this.f31568).run();
        }
        this.f31566 = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f31573.m27275();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m26439() {
        InterfaceC0504 wrapper;
        if (this.f31574 == null) {
            this.f31574 = (C18850) findViewById(R.id.MT_Protector);
            this.f31589 = (C15467) findViewById(R.id.MT_Protector);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.MT_Protector);
            if (callbackFindViewById instanceof InterfaceC0504) {
                wrapper = (InterfaceC0504) callbackFindViewById;
            } else if (callbackFindViewById instanceof C9762) {
                wrapper = ((C9762) callbackFindViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
            }
            this.f31590 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26440(boolean z) {
        if (z != this.f31564) {
            this.f31564 = z;
            if (z) {
                return;
            }
            m26438();
            m26438();
            this.f31589.setTranslationY(-Math.max(0, Math.min(0, this.f31589.getHeight())));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m26438() {
        removeCallbacks(this.f31572);
        removeCallbacks(this.f31568);
        ViewPropertyAnimator viewPropertyAnimator = this.f31576;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26433(Window.Callback callback) {
        m26439();
        this.f31590.mo2179(callback);
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26434(CharSequence charSequence) {
        m26439();
        this.f31590.mo2180(charSequence);
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26431(int i) {
        m26439();
        if (i == 2) {
            this.f31590.getClass();
        } else if (i == 5) {
            this.f31590.getClass();
        } else {
            if (i != 109) {
                return;
            }
            this.f31587 = true;
        }
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo26437() {
        m26439();
        return this.f31590.mo2182();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo26445() {
        m26439();
        return this.f31590.mo2190();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo26442() {
        m26439();
        return this.f31590.mo2187();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo26443() {
        m26439();
        return this.f31590.mo2188();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo26441() {
        m26439();
        return this.f31590.mo2186();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo26444() {
        m26439();
        this.f31590.mo2189();
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26432(Menu menu, InterfaceC17585 interfaceC17585) {
        m26439();
        this.f31590.mo2178(menu, interfaceC17585);
    }

    @Override // l.InterfaceC19556
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo26447() {
        m26439();
        this.f31590.mo2183();
    }
}
