package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩷ */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public class C1364 extends ViewGroup implements InterfaceC1812, InterfaceC1203, InterfaceC0931 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final C1914 f34525;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final Rect f34526;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final int[] f34527 = {R.attr.MT_Protector, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f34528;

    /* JADX INFO: renamed from: ۖ֫ */
    public final AnimatorListenerAdapter f34529;

    /* JADX INFO: renamed from: ۗ */
    public boolean f34530;

    /* JADX INFO: renamed from: ۘ֫ */
    public Drawable f34531;

    /* JADX INFO: renamed from: ۙ */
    public final Runnable f34532;

    /* JADX INFO: renamed from: ۛ */
    public final Rect f34533;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C1469 f34534;

    /* JADX INFO: renamed from: ۟ */
    public boolean f34535;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Runnable f34536;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C1386 f34537;

    /* JADX INFO: renamed from: ۤ */
    public C1777 f34538;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f34539;

    /* JADX INFO: renamed from: ۨ */
    public ViewPropertyAnimator f34540;

    /* JADX INFO: renamed from: ۫ */
    public C1914 f34541;

    /* JADX INFO: renamed from: ۬ */
    public final Rect f34542;

    /* JADX INFO: renamed from: ܰ */
    public OverScroller f34543;

    /* JADX INFO: renamed from: ܳ֫ */
    public C1914 f34544;

    /* JADX INFO: renamed from: ܺ֫ */
    public final Rect f34545;

    /* JADX INFO: renamed from: ܽ֫ */
    public C1914 f34546;

    /* JADX INFO: renamed from: ܿ֫ */
    public C1914 f34547;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final Rect f34548;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f34549;

    /* JADX INFO: renamed from: ᩶ */
    public C1718 f34550;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f34551;

    /* JADX INFO: renamed from: ᩸ */
    public int f34552;

    /* JADX INFO: renamed from: ᩹ */
    public C1609 f34553;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC0867 f34554;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f34555;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    static {
        C2019 c2019 = new C2019();
        c2019.m54783(C1388.m29403(0, 1, 0, 1));
        f34525 = c2019.m54780();
        f34526 = new Rect();
    }

    public C1364(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34549 = 0;
        this.f34542 = new Rect();
        this.f34548 = new Rect();
        this.f34533 = new Rect();
        this.f34545 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1914 c1914 = C1914.f72089;
        this.f34541 = c1914;
        this.f34547 = c1914;
        this.f34546 = c1914;
        this.f34544 = c1914;
        this.f34529 = new C1854(this);
        this.f34536 = new RunnableC1084(this);
        this.f34532 = new RunnableC1014(this);
        m28462(context);
        this.f34537 = new C1386();
        C1469 c1469 = new C1469(context);
        c1469.setWillNotDraw(true);
        this.f34534 = c1469;
        addView(c1469);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28462(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f34527);
        this.f34552 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f34531 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f34543 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m28471();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28468(C1718 c1718) {
        this.f34550 = c1718;
        if (getWindowToken() != null) {
            this.f34550.m43638(this.f34549);
            int i = this.f34555;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1717.m43585(this);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m28479() {
        return this.f34551;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28469(boolean z) {
        this.f34535 = z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m28462(getContext());
        C1717.m43585(this);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m28472();
        int i2 = this.f34555 ^ i;
        this.f34555 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C1718 c1718 = this.f34550;
        if (c1718 != null) {
            c1718.m43639(!z2);
            if (z || !z2) {
                this.f34550.m43636();
            } else {
                this.f34550.m43641();
            }
        }
        if ((i2 & 256) == 0 || this.f34550 == null) {
            return;
        }
        C1717.m43585(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f34549 = i;
        C1718 c1718 = this.f34550;
        if (c1718 != null) {
            c1718.m43638(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28463(View view, Rect rect, boolean z) {
        boolean z2;
        C1504 c1504 = (C1504) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1504).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1504).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1504).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1504).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1504).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1504).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1504).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1504).bottomMargin = i8;
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
        m28472();
        C1914 c1914M51162 = C1914.m51162(this, windowInsets);
        boolean zM28463 = m28463(this.f34553, new Rect(c1914M51162.m51172(), c1914M51162.m51174(), c1914M51162.m51182(), c1914M51162.m51183()), false);
        Rect rect = this.f34542;
        C1717.m43557(this, c1914M51162, rect);
        C1914 c1914M51165 = c1914M51162.m51165(rect.left, rect.top, rect.right, rect.bottom);
        this.f34541 = c1914M51165;
        boolean z = true;
        if (!this.f34547.equals(c1914M51165)) {
            this.f34547 = this.f34541;
            zM28463 = true;
        }
        Rect rect2 = this.f34548;
        if (rect2.equals(rect)) {
            z = zM28463;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c1914M51162.m51164().m51179().m51176().m51171();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1504(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1504(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1504(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1504;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m28472();
        measureChildWithMargins(this.f34553, i, 0, i2, 0);
        C1504 c1504 = (C1504) this.f34553.getLayoutParams();
        int iMax = Math.max(0, this.f34553.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1504).leftMargin + ((ViewGroup.MarginLayoutParams) c1504).rightMargin);
        int iMax2 = Math.max(0, this.f34553.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1504).topMargin + ((ViewGroup.MarginLayoutParams) c1504).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f34553.getMeasuredState());
        int i3 = C1717.f57146;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f34552;
            if (this.f34535) {
                this.f34553.getClass();
            }
        } else {
            measuredHeight = this.f34553.getVisibility() != 8 ? this.f34553.getMeasuredHeight() : 0;
        }
        Rect rect = this.f34542;
        Rect rect2 = this.f34533;
        rect2.set(rect);
        this.f34546 = this.f34541;
        if (!this.f34551 && !z) {
            C1469 c1469 = this.f34534;
            C1914 c1914 = f34525;
            Rect rect3 = this.f34545;
            C1717.m43557(c1469, c1914, rect3);
            if (!rect3.equals(f34526)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f34546 = this.f34546.m51165(0, measuredHeight, 0, 0);
            } else {
                C1388 c1388M29403 = C1388.m29403(this.f34546.m51172(), this.f34546.m51174() + measuredHeight, this.f34546.m51182(), this.f34546.m51183());
                C2019 c2019 = new C2019(this.f34546);
                c2019.m54783(c1388M29403);
                this.f34546 = c2019.m54780();
            }
        } else {
            C1388 c1388M29404 = C1388.m29403(this.f34546.m51172(), this.f34546.m51174() + measuredHeight, this.f34546.m51182(), this.f34546.m51183());
            C2019 c20110 = new C2019(this.f34546);
            c20110.m54783(c1388M29404);
            this.f34546 = c20110.m54780();
        }
        m28463(this.f34538, rect2, true);
        if (!this.f34544.equals(this.f34546)) {
            C1914 c1915 = this.f34546;
            this.f34544 = c1915;
            C1717.m43545(this.f34538, c1915);
        }
        measureChildWithMargins(this.f34538, i, 0, i2, 0);
        C1504 c1505 = (C1504) this.f34538.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f34538.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1505).leftMargin + ((ViewGroup.MarginLayoutParams) c1505).rightMargin);
        int iMax4 = Math.max(iMax2, this.f34538.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1505).topMargin + ((ViewGroup.MarginLayoutParams) c1505).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f34538.getMeasuredState());
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
                C1504 c1504 = (C1504) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1504).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1504).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f34531 != null) {
            if (this.f34553.getVisibility() == 0) {
                translationY = (int) (this.f34553.getTranslationY() + this.f34553.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f34531.setBounds(0, translationY, getWidth(), this.f34531.getIntrinsicHeight() + translationY);
            this.f34531.draw(canvas);
        }
    }

    @Override // p067l.InterfaceC0931
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // p067l.InterfaceC1203
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
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
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f34553.getVisibility() != 0) {
            return false;
        }
        return this.f34528;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f34537.m29338(i);
        C1609 c1609 = this.f34553;
        this.f34539 = c1609 != null ? -((int) c1609.getTranslationY()) : 0;
        m28471();
        C1718 c1718 = this.f34550;
        if (c1718 != null) {
            c1718.m43637();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f34539 + i2;
        this.f34539 = i5;
        m28471();
        this.f34553.setTranslationY(-Math.max(0, Math.min(i5, this.f34553.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f34528 || this.f34530) {
            return;
        }
        if (this.f34539 <= this.f34553.getHeight()) {
            m28471();
            postDelayed(this.f34536, 600L);
        } else {
            m28471();
            postDelayed(this.f34532, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f34528 || !z) {
            return false;
        }
        this.f34543.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f34543.getFinalY() <= this.f34553.getHeight()) {
            m28471();
            ((RunnableC1084) this.f34536).run();
        } else {
            m28471();
            ((RunnableC1014) this.f34532).run();
        }
        this.f34530 = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f34537.m29337();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m28472() {
        InterfaceC0867 wrapper;
        if (this.f34538 == null) {
            this.f34538 = (C1777) findViewById(R.id.MT_Protector);
            this.f34553 = (C1609) findViewById(R.id.MT_Protector);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.MT_Protector);
            if (callbackFindViewById instanceof InterfaceC0867) {
                wrapper = (InterfaceC0867) callbackFindViewById;
            } else if (callbackFindViewById instanceof C1326) {
                wrapper = ((C1326) callbackFindViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
            }
            this.f34554 = wrapper;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28473(boolean z) {
        if (z != this.f34528) {
            this.f34528 = z;
            if (z) {
                return;
            }
            m28471();
            m28471();
            this.f34553.setTranslationY(-Math.max(0, Math.min(0, this.f34553.getHeight())));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m28471() {
        removeCallbacks(this.f34536);
        removeCallbacks(this.f34532);
        ViewPropertyAnimator viewPropertyAnimator = this.f34540;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ֫ */
    public final void mo28466(Window.Callback callback) {
        m28472();
        this.f34554.mo4546(callback);
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ֫ */
    public final void mo28467(CharSequence charSequence) {
        m28472();
        this.f34554.mo4547(charSequence);
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ֫ */
    public final void mo28464(int i) {
        m28472();
        if (i == 2) {
            this.f34554.getClass();
        } else if (i == 5) {
            this.f34554.getClass();
        } else {
            if (i != 109) {
                return;
            }
            this.f34551 = true;
        }
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28470() {
        m28472();
        return this.f34554.mo4549();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo28478() {
        m28472();
        return this.f34554.mo4557();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo28475() {
        m28472();
        return this.f34554.mo4554();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo28476() {
        m28472();
        return this.f34554.mo4555();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28474() {
        m28472();
        return this.f34554.mo4553();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ܿ */
    public final void mo28477() {
        m28472();
        this.f34554.mo4556();
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ֫ */
    public final void mo28465(Menu menu, InterfaceC1714 interfaceC1714) {
        m28472();
        this.f34554.mo4545(menu, interfaceC1714);
    }

    @Override // p067l.InterfaceC1812
    /* JADX INFO: renamed from: ᩻ */
    public final void mo28480() {
        m28472();
        this.f34554.mo4550();
    }
}
