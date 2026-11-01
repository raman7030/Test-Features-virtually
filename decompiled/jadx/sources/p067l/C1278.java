package p067l;

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

/* JADX INFO: renamed from: l.ۡۢ */
/* JADX INFO: compiled from: M5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1278 extends C0918 implements InterfaceC1064, InterfaceC1189 {

    /* JADX INFO: renamed from: ۗ */
    public C0994 f29686;

    /* JADX INFO: renamed from: ۙ */
    public int f29687;

    /* JADX INFO: renamed from: ۛ */
    public Context f29688;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC1313 f29689;

    /* JADX INFO: renamed from: ۨ */
    public int f29690;

    /* JADX INFO: renamed from: ۫ */
    public int f29691;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC1834 f29692;

    /* JADX INFO: renamed from: ܰ */
    public boolean f29693;

    /* JADX INFO: renamed from: ᩶ */
    public int f29694;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC1714 f29695;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f29696;

    /* JADX INFO: renamed from: ᩺ */
    public C1698 f29697;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C1217 generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ C1217 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public C1278(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f29691 = (int) (56.0f * f);
        this.f29687 = (int) (f * 4.0f);
        this.f29688 = context;
        this.f29690 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24650(int i) {
        if (this.f29690 != i) {
            this.f29690 = i;
            if (i == 0) {
                this.f29688 = getContext();
            } else {
                this.f29688 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24651() {
        return this.f29690;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24642(C1698 c1698) {
        this.f29697 = c1698;
        c1698.m42795(this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1698 c1698 = this.f29697;
        if (c1698 != null) {
            c1698.updateMenuView(false);
            if (this.f29697.m42801()) {
                this.f29697.m42799();
                this.f29697.m42796();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27 */
    @Override // p067l.C0918, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        ?? r5;
        int i5;
        int i6;
        int i7;
        C0994 c0994;
        boolean z2 = this.f29696;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f29696 = z3;
        if (z2 != z3) {
            this.f29694 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f29696 && (c0994 = this.f29686) != null && size != this.f29694) {
            this.f29694 = size;
            c0994.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f29696 || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C1173 c1173 = (C1173) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c1173).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1173).leftMargin = 0;
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
        int i10 = this.f29691;
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
            i3 = this.f29687;
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
                boolean z5 = childAt instanceof ViewOnClickListenerC1309;
                int i21 = i15 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C1173 c1174 = (C1173) childAt.getLayoutParams();
                c1174.f23604 = false;
                c1174.f23606 = 0;
                c1174.f23601 = 0;
                c1174.f23602 = false;
                ((LinearLayout.LayoutParams) c1174).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1174).rightMargin = 0;
                c1174.f23603 = z5 && !TextUtils.isEmpty(((ViewOnClickListenerC1309) childAt).getText());
                int i22 = c1174.f23605 ? 1 : i11;
                C1173 c1175 = (C1173) childAt.getLayoutParams();
                i5 = mode;
                i6 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ViewOnClickListenerC1309 viewOnClickListenerC1309 = z5 ? (ViewOnClickListenerC1309) childAt : null;
                boolean z6 = (viewOnClickListenerC1309 == null || TextUtils.isEmpty(viewOnClickListenerC1309.getText())) ? false : true;
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
                c1175.f23602 = !c1175.f23605 && z6;
                c1175.f23601 = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                int iMax = Math.max(i16, i7);
                if (c1174.f23602) {
                    i18++;
                }
                if (c1174.f23605) {
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
                C1173 c1176 = (C1173) getChildAt(i28).getLayoutParams();
                boolean z9 = z8;
                if (c1176.f23602) {
                    int i29 = c1176.f23601;
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
                C1173 c1177 = (C1173) childAt2.getLayoutParams();
                int i32 = childMeasureSpec;
                int i33 = i14;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (c1177.f23601 == i30) {
                        j |= j3;
                    }
                } else {
                    if (z7 && c1177.f23603) {
                        r5 = 1;
                        r5 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r5 = 1;
                    }
                    c1177.f23601 += r5;
                    c1177.f23604 = r5;
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
                if ((j & 1) != 0 && !((C1173) getChildAt(0).getLayoutParams()).f23603) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C1173) getChildAt(i36).getLayoutParams()).f23603) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C1173 c1178 = (C1173) childAt3.getLayoutParams();
                    if (childAt3 instanceof ViewOnClickListenerC1309) {
                        c1178.f23606 = i37;
                        c1178.f23604 = true;
                        if (i38 == 0 && !c1178.f23603) {
                            ((LinearLayout.LayoutParams) c1178).leftMargin = (-i37) / 2;
                        }
                    } else if (c1178.f23605) {
                        c1178.f23606 = i37;
                        c1178.f23604 = true;
                        ((LinearLayout.LayoutParams) c1178).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c1178).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1178).rightMargin = i37 / 2;
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
                C1173 c1179 = (C1173) childAt4.getLayoutParams();
                if (c1179.f23604) {
                    i4 = i34;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1179.f23601 * i13) + c1179.f23606, 1073741824), i4);
                } else {
                    i4 = i34;
                }
                i39++;
                i34 = i4;
            }
        }
        setMeasuredDimension(i24, i23 != 1073741824 ? i35 : i25);
    }

    @Override // p067l.C0918, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f29696) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        int i7 = C1956.f75466;
        boolean z2 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1173 c1173 = (C1173) childAt.getLayoutParams();
                if (c1173.f23605) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m24645(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1173).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1173).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1173).leftMargin) + ((LinearLayout.LayoutParams) c1173).rightMargin;
                    m24645(i10);
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
                C1173 c1174 = (C1173) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1174.f23605) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c1174).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1174).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C1173 c1175 = (C1173) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1175.f23605) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c1175).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = C20780.m46927(measuredWidth4, ((LinearLayout.LayoutParams) c1175).rightMargin, iMax, i19);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24653();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24641(Drawable drawable) {
        m24655();
        this.f29697.m42794(drawable);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Drawable m24654() {
        m24655();
        return this.f29697.m42797();
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m24649() {
        return this.f29693;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24644(boolean z) {
        this.f29693 = z;
    }

    public static C1173 generateDefaultLayoutParams() {
        C1173 c1173 = new C1173(-2, -2);
        c1173.f23605 = false;
        ((LinearLayout.LayoutParams) c1173).gravity = 16;
        return c1173;
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1173(getContext(), attributeSet);
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final C1217 generateLayoutParams(AttributeSet attributeSet) {
        return new C1173(getContext(), attributeSet);
    }

    public static C1173 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1173 c1173;
        if (layoutParams != null) {
            if (layoutParams instanceof C1173) {
                C1173 c1174 = (C1173) layoutParams;
                c1173 = new C1173(c1174);
                c1173.f23605 = c1174.f23605;
            } else {
                c1173 = new C1173(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c1173).gravity <= 0) {
                ((LinearLayout.LayoutParams) c1173).gravity = 16;
            }
            return c1173;
        }
        return generateDefaultLayoutParams();
    }

    @Override // p067l.C0918, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1173;
    }

    @Override // p067l.InterfaceC1064
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5681(C1134 c1134) {
        return this.f29686.performItemAction(c1134, 0);
    }

    @Override // p067l.InterfaceC1189
    public final void initialize(C0994 c0994) {
        this.f29686 = c0994;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Menu m24655() {
        if (this.f29686 == null) {
            Context context = getContext();
            C0994 c0994 = new C0994(context);
            this.f29686 = c0994;
            c0994.setCallback(new C1873(this));
            C1698 c1698 = new C1698(context);
            this.f29697 = c1698;
            c1698.m42802();
            C1698 c1699 = this.f29697;
            InterfaceC1714 c2013 = this.f29695;
            if (c2013 == null) {
                c2013 = new C2013();
            }
            c1699.setCallback(c2013);
            this.f29686.addMenuPresenter(this.f29697, this.f29688);
            this.f29697.m42795(this);
        }
        return this.f29686;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24643(InterfaceC1714 interfaceC1714, InterfaceC1834 interfaceC1834) {
        this.f29695 = interfaceC1714;
        this.f29692 = interfaceC1834;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C0994 m24648() {
        return this.f29686;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m24646() {
        C1698 c1698 = this.f29697;
        return c1698 != null && c1698.m42796();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m24657() {
        C1698 c1698 = this.f29697;
        return c1698 != null && c1698.m42799();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m24656() {
        C1698 c1698 = this.f29697;
        return c1698 != null && c1698.m42801();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m24647() {
        C1698 c1698 = this.f29697;
        if (c1698 != null) {
            return c1698.f56082 != null || c1698.m42801();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24653() {
        C1698 c1698 = this.f29697;
        if (c1698 != null) {
            c1698.m42799();
            C1154 c1154 = c1698.f56083;
            if (c1154 != null) {
                c1154.m44889();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24645(int i) {
        boolean zMo22603 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1558)) {
            zMo22603 = ((InterfaceC1558) childAt).mo22603();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1558)) ? zMo22603 : ((InterfaceC1558) childAt2).mo22604() | zMo22603;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m24652() {
        this.f29697.m42798();
    }
}
