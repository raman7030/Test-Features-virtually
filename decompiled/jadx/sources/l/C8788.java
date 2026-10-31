package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: l.ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public class C8788 extends C1525 implements InterfaceC4471, InterfaceC7002 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3060 f26761;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26762;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Context f26763;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC9494 f26764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26765;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f26766;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC19994 f26767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f26768;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26769;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f26770;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f26771;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C17254 f26772;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C7560 generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // l.C1525, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C7560 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public C8788(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f26766 = (int) (56.0f * f);
        this.f26762 = (int) (f * 4.0f);
        this.f26763 = context;
        this.f26765 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22680(int i) {
        if (this.f26765 != i) {
            this.f26765 = i;
            if (i == 0) {
                this.f26763 = getContext();
            } else {
                this.f26763 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22681() {
        return this.f26765;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22672(C17254 c17254) {
        this.f26772 = c17254;
        c17254.m40546(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            c17254.updateMenuView(false);
            if (this.f26772.m40552()) {
                this.f26772.m40550();
                this.f26772.m40547();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // l.C1525, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        ?? r5;
        int i5;
        int i6;
        int i7;
        C3060 c3060;
        boolean z2 = this.f26771;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f26771 = z3;
        if (z2 != z3) {
            this.f26769 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f26771 && (c3060 = this.f26761) != null && size != this.f26769) {
            this.f26769 = size;
            c3060.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f26771 || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C6671 c6671 = (C6671) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c6671).rightMargin = 0;
                ((LinearLayout.LayoutParams) c6671).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f26766;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z4 = false;
        int i18 = 0;
        long j = 0;
        while (true) {
            i3 = this.f26762;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() == 8) {
                i5 = mode;
                i6 = paddingBottom;
            } else {
                boolean z5 = childAt instanceof ViewOnClickListenerC9411;
                int i21 = i15 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C6671 c6672 = (C6671) childAt.getLayoutParams();
                c6672.f20729 = false;
                c6672.f20731 = 0;
                c6672.f20726 = 0;
                c6672.f20727 = false;
                ((LinearLayout.LayoutParams) c6672).leftMargin = 0;
                ((LinearLayout.LayoutParams) c6672).rightMargin = 0;
                c6672.f20728 = z5 && !TextUtils.isEmpty(((ViewOnClickListenerC9411) childAt).getText());
                int i22 = c6672.f20730 ? 1 : i11;
                C6671 c6673 = (C6671) childAt.getLayoutParams();
                i5 = mode;
                i6 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ViewOnClickListenerC9411 viewOnClickListenerC9411 = z5 ? (ViewOnClickListenerC9411) childAt : null;
                boolean z6 = (viewOnClickListenerC9411 == null || TextUtils.isEmpty(viewOnClickListenerC9411.getText())) ? false : true;
                if (i22 <= 0 || (z6 && i22 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i13, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i7++;
                    }
                    if (z6 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c6673.f20727 = !c6673.f20730 && z6;
                c6673.f20726 = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                int iMax = Math.max(i16, i7);
                if (c6672.f20727) {
                    i18++;
                }
                if (c6672.f20730) {
                    z4 = true;
                }
                i11 -= i7;
                int iMax2 = Math.max(i14, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    i16 = iMax;
                    j |= (long) (1 << i17);
                    i15 = i21;
                    i14 = iMax2;
                } else {
                    i16 = iMax;
                    i14 = iMax2;
                    i15 = i21;
                }
            }
            i17++;
            size3 = i19;
            i9 = i20;
            paddingBottom = i6;
            mode = i5;
        }
        int i23 = mode;
        int i24 = i9;
        int i25 = size3;
        boolean z7 = z4 && i15 == 2;
        boolean z8 = false;
        while (true) {
            if (i18 <= 0 || i11 <= 0) {
                z = z8;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j2 = 0;
            while (i28 < childCount2) {
                C6671 c6674 = (C6671) getChildAt(i28).getLayoutParams();
                boolean z9 = z8;
                if (c6674.f20727) {
                    int i29 = c6674.f20726;
                    if (i29 < i26) {
                        j2 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z8 = z9;
            }
            z = z8;
            j |= j2;
            if (i27 > i11) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                C6671 c6675 = (C6671) childAt2.getLayoutParams();
                int i32 = childMeasureSpec;
                int i33 = i14;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (c6675.f20726 == i30) {
                        j |= j3;
                    }
                } else {
                    if (z7 && c6675.f20728) {
                        r5 = 1;
                        r5 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r5 = 1;
                    }
                    c6675.f20726 += r5;
                    c6675.f20729 = r5;
                    i11--;
                }
                i31++;
                childMeasureSpec = i32;
                i14 = i33;
            }
            z8 = true;
        }
        int i34 = childMeasureSpec;
        int i35 = i14;
        boolean z10 = !z4 && i15 == 1;
        if (i11 > 0 && j != 0 && (i11 < i15 - 1 || z10 || i16 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C6671) getChildAt(0).getLayoutParams()).f20728) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C6671) getChildAt(i36).getLayoutParams()).f20728) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C6671 c6676 = (C6671) childAt3.getLayoutParams();
                    if (childAt3 instanceof ViewOnClickListenerC9411) {
                        c6676.f20731 = i37;
                        c6676.f20729 = true;
                        if (i38 == 0 && !c6676.f20728) {
                            ((LinearLayout.LayoutParams) c6676).leftMargin = (-i37) / 2;
                        }
                    } else if (c6676.f20730) {
                        c6676.f20731 = i37;
                        c6676.f20729 = true;
                        ((LinearLayout.LayoutParams) c6676).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c6676).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c6676).rightMargin = i37 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt4 = getChildAt(i39);
                C6671 c6677 = (C6671) childAt4.getLayoutParams();
                if (c6677.f20729) {
                    i4 = i34;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c6677.f20726 * i13) + c6677.f20731, 1073741824), i4);
                } else {
                    i4 = i34;
                }
                i39++;
                i34 = i4;
            }
        }
        setMeasuredDimension(i24, i23 != 1073741824 ? i35 : i25);
    }

    @Override // l.C1525, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f26771) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        int i7 = C22461.f72738;
        boolean z2 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C6671 c6671 = (C6671) childAt.getLayoutParams();
                if (c6671.f20730) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m22675(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c6671).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c6671).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c6671).leftMargin) + ((LinearLayout.LayoutParams) c6671).rightMargin;
                    m22675(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i6 / 2) - (measuredWidth2 / 2);
            int i13 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C6671 c6672 = (C6671) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c6672.f20730) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c6672).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c6672).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C6671 c6673 = (C6671) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c6673.f20730) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c6673).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = C19373.m44633(measuredWidth4, ((LinearLayout.LayoutParams) c6673).rightMargin, iMax, i19);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m22683();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22671(Drawable drawable) {
        m22685();
        this.f26772.m40545(drawable);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable m22684() {
        m22685();
        return this.f26772.m40548();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m22679() {
        return this.f26768;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22674(boolean z) {
        this.f26768 = z;
    }

    public static C6671 generateDefaultLayoutParams() {
        C6671 c6671 = new C6671(-2, -2);
        c6671.f20730 = false;
        ((LinearLayout.LayoutParams) c6671).gravity = 16;
        return c6671;
    }

    @Override // l.C1525, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C6671(getContext(), attributeSet);
    }

    @Override // l.C1525, android.view.ViewGroup
    public final C7560 generateLayoutParams(AttributeSet attributeSet) {
        return new C6671(getContext(), attributeSet);
    }

    public static C6671 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C6671 c6671;
        if (layoutParams != null) {
            if (layoutParams instanceof C6671) {
                C6671 c6672 = (C6671) layoutParams;
                c6671 = new C6671(c6672);
                c6671.f20730 = c6672.f20730;
            } else {
                c6671 = new C6671(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c6671).gravity <= 0) {
                ((LinearLayout.LayoutParams) c6671).gravity = 16;
            }
            return c6671;
        }
        return generateDefaultLayoutParams();
    }

    @Override // l.C1525, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6671;
    }

    @Override // l.InterfaceC4471
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3362(C5882 c5882) {
        return this.f26761.performItemAction(c5882, 0);
    }

    @Override // l.InterfaceC7002
    public final void initialize(C3060 c3060) {
        this.f26761 = c3060;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Menu m22685() {
        if (this.f26761 == null) {
            Context context = getContext();
            C3060 c3060 = new C3060(context);
            this.f26761 = c3060;
            c3060.setCallback(new C20783(this));
            C17254 c17254 = new C17254(context);
            this.f26772 = c17254;
            c17254.m40553();
            C17254 c17255 = this.f26772;
            InterfaceC17585 c23604 = this.f26770;
            if (c23604 == null) {
                c23604 = new C23604();
            }
            c17255.setCallback(c23604);
            this.f26761.addMenuPresenter(this.f26772, this.f26763);
            this.f26772.m40546(this);
        }
        return this.f26761;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22673(InterfaceC17585 interfaceC17585, InterfaceC19994 interfaceC19994) {
        this.f26770 = interfaceC17585;
        this.f26767 = interfaceC19994;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C3060 m22678() {
        return this.f26761;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m22676() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40547();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m22687() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40550();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m22686() {
        C17254 c17254 = this.f26772;
        return c17254 != null && c17254.m40552();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m22677() {
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            return c17254.f52900 != null || c17254.m40552();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22683() {
        C17254 c17254 = this.f26772;
        if (c17254 != null) {
            c17254.m40550();
            C6296 c6296 = c17254.f52901;
            if (c6296 != null) {
                c6296.m42629();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22675(int i) {
        boolean zMo20623 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC14431)) {
            zMo20623 = ((InterfaceC14431) childAt).mo20623();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC14431)) ? zMo20623 : ((InterfaceC14431) childAt2).mo20624() | zMo20623;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22682() {
        this.f26772.m40549();
    }
}
