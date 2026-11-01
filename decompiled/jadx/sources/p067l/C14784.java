package p067l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public class C14784 extends ViewGroup {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final boolean f42153;

    /* JADX INFO: renamed from: ۠֫ */
    public static boolean f42154;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final boolean f42155;

    /* JADX INFO: renamed from: ֫֫ */
    public final C5397 f42156;

    /* JADX INFO: renamed from: ۖ֫ */
    public float f42157;

    /* JADX INFO: renamed from: ۗ */
    public boolean f42158;

    /* JADX INFO: renamed from: ۘ֫ */
    public Paint f42159;

    /* JADX INFO: renamed from: ۙ */
    public Matrix f42160;

    /* JADX INFO: renamed from: ۛ */
    public boolean f42161;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f42162;

    /* JADX INFO: renamed from: ۟ */
    public Object f42163;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C17466 f42164;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C5397 f42165;

    /* JADX INFO: renamed from: ۤ */
    public int f42166;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C17466 f42167;

    /* JADX INFO: renamed from: ۨ */
    public boolean f42168;

    /* JADX INFO: renamed from: ۫ */
    public float f42169;

    /* JADX INFO: renamed from: ۬ */
    public boolean f42170;

    /* JADX INFO: renamed from: ܰ */
    public float f42171;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f42172;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f42173;

    /* JADX INFO: renamed from: ܽ֫ */
    public ArrayList f42174;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f42175;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f42176;

    /* JADX INFO: renamed from: ᩴ֫ */
    public Drawable f42177;

    /* JADX INFO: renamed from: ᩶ */
    public Rect f42178;

    /* JADX INFO: renamed from: ᩷֫ */
    public final ArrayList f42179;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC1100 f42180;

    /* JADX INFO: renamed from: ᩹ */
    public final C3385 f42181;

    /* JADX INFO: renamed from: ᩺ */
    public float f42182;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f42183;

    /* JADX INFO: renamed from: ֨֫ */
    public static final int[] f42152 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: ֡֫ */
    public static final int[] f42151 = {R.attr.layout_gravity};

    static {
        int i = Build.VERSION.SDK_INT;
        f42155 = true;
        f42153 = true;
        f42154 = i >= 29;
    }

    public C14784(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.p000mt.plus.R.attr.MT_Protector);
    }

    public C14784(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42181 = new C3385();
        this.f42173 = DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
        this.f42159 = new Paint();
        this.f42161 = true;
        this.f42175 = 3;
        this.f42172 = 3;
        this.f42183 = 3;
        this.f42176 = 3;
        this.f42180 = new C20821(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f42162 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C5397 c5397 = new C5397(this, 3);
        this.f42156 = c5397;
        C5397 c5398 = new C5397(this, 5);
        this.f42165 = c5398;
        C17466 c17466M39794 = C17466.m39794(this, 1.0f, c5397);
        this.f42167 = c17466M39794;
        c17466M39794.m39819(1);
        c17466M39794.m39807(f2);
        c5397.m11848(c17466M39794);
        C17466 c17466M39795 = C17466.m39794(this, 1.0f, c5398);
        this.f42164 = c17466M39795;
        c17466M39795.m39819(2);
        c17466M39795.m39807(f2);
        c5398.m11848(c17466M39795);
        setFocusableInTouchMode(true);
        int i2 = C1717.f57146;
        setImportantForAccessibility(1);
        C1717.m43555(this, new C7409(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2714());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f42152);
            try {
                this.f42177 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C20150.f62373, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f42169 = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f42169 = getResources().getDimension(bin.p000mt.plus.R.dimen.MT_Protector);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f42179 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33737(WindowInsets windowInsets, boolean z) {
        this.f42163 = windowInsets;
        this.f42170 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m33747(int i) {
        this.f42173 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33738(InterfaceC10091 interfaceC10091) {
        if (interfaceC10091 == null) {
            return;
        }
        if (this.f42174 == null) {
            this.f42174 = new ArrayList();
        }
        this.f42174.add(interfaceC10091);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33746(InterfaceC10091 interfaceC10091) {
        ArrayList arrayList;
        if (interfaceC10091 == null || (arrayList = this.f42174) == null) {
            return;
        }
        arrayList.remove(interfaceC10091);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33735(int i, int i2) {
        View viewM33743;
        int i3 = C1717.f57146;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f42175 = i;
        } else if (i2 == 5) {
            this.f42172 = i;
        } else if (i2 == 8388611) {
            this.f42183 = i;
        } else if (i2 == 8388613) {
            this.f42176 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f42167 : this.f42164).m39813();
        }
        if (i != 1) {
            if (i == 2 && (viewM33743 = m33743(absoluteGravity)) != null) {
                m33750(viewM33743);
                return;
            }
            return;
        }
        View viewM33744 = m33743(absoluteGravity);
        if (viewM33744 != null) {
            m33736(viewM33744, true);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33745(int i, View view) {
        if (!m33730(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        m33735(i, ((C16795) view.getLayoutParams()).f49496);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33748(int i) {
        int i2 = C1717.f57146;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f42175;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f42183 : this.f42176;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i == 5) {
            int i5 = this.f42172;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f42176 : this.f42183;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 8388611) {
            int i7 = this.f42183;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f42175 : this.f42172;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i9 = this.f42176;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f42172 : this.f42175;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33731(View view) {
        if (!m33730(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m33748(((C16795) view.getLayoutParams()).f49496);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33749(int i, View view) {
        int i2;
        View rootView;
        int iM39823 = this.f42167.m39823();
        int iM39824 = this.f42164.m39823();
        if (iM39823 == 1 || iM39824 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM39823 != 2 && iM39824 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C16795) view.getLayoutParams()).f49498;
            if (f == 0.0f) {
                C16795 c16795 = (C16795) view.getLayoutParams();
                if ((c16795.f49499 & 1) == 1) {
                    c16795.f49499 = 0;
                    ArrayList arrayList = this.f42174;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC10091) this.f42174.get(size)).onDrawerClosed(view);
                        }
                    }
                    m33724(view, false);
                    m33728(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C16795 c16796 = (C16795) view.getLayoutParams();
                if ((c16796.f49499 & 1) == 0) {
                    c16796.f49499 = 1;
                    ArrayList arrayList2 = this.f42174;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC10091) this.f42174.get(size2)).onDrawerOpened(view);
                        }
                    }
                    m33724(view, true);
                    m33728(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f42166) {
            this.f42166 = i2;
            ArrayList arrayList3 = this.f42174;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC10091) this.f42174.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33724(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !m33730(childAt)) || (z && childAt == view)) {
                int i3 = C1717.f57146;
                i = 1;
            } else {
                int i4 = C1717.f57146;
                i = 4;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m33728(View view) {
        C1529 c1529 = C1529.f44377;
        C1717.m43583(c1529.m35322(), view);
        if (!m33725(view) || m33731(view) == 2) {
            return;
        }
        C1717.m43554(view, c1529, null, this.f42180);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33744(float f, View view) {
        C16795 c16795 = (C16795) view.getLayoutParams();
        if (f == c16795.f49498) {
            return;
        }
        c16795.f49498 = f;
        ArrayList arrayList = this.f42174;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC10091) this.f42174.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33733(float f, View view) {
        float f2 = ((C16795) view.getLayoutParams()).f49498;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m33740(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m33744(f, view);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33741(View view) {
        int i = ((C16795) view.getLayoutParams()).f49496;
        int i2 = C1717.f57146;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33740(int i, View view) {
        return (m33741(view) & i) == i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m33743(int i) {
        int i2 = C1717.f57146;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m33741(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m33729(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42161 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42161 = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f42163 != null) {
            int i3 = C1717.f57146;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i4 = C1717.f57146;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C16795 c16795 = (C16795) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c16795.f49496, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f42163;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f42163;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c16795).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c16795).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c16795).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c16795).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m33726(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c16795).leftMargin) - ((ViewGroup.MarginLayoutParams) c16795).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c16795).topMargin) - ((ViewGroup.MarginLayoutParams) c16795).bottomMargin, 1073741824));
                } else {
                    if (!m33730(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f42153) {
                        float fM43566 = C1717.m43566(childAt);
                        float f = this.f42169;
                        if (fM43566 != f) {
                            C1717.m43547(childAt, f);
                        }
                    }
                    int iM33741 = m33741(childAt) & 7;
                    boolean z4 = iM33741 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(C10965.m25286(new StringBuilder("Child drawer has absolute gravity "), m33729(iM33741), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f42162 + ((ViewGroup.MarginLayoutParams) c16795).leftMargin + ((ViewGroup.MarginLayoutParams) c16795).rightMargin, ((ViewGroup.MarginLayoutParams) c16795).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c16795).topMargin + ((ViewGroup.MarginLayoutParams) c16795).bottomMargin, ((ViewGroup.MarginLayoutParams) c16795).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f42153) {
            return;
        }
        int i2 = C1717.f57146;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f42168 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C16795 c16795 = (C16795) childAt.getLayoutParams();
                if (m33726(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c16795).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c16795).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c16795).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m33740(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c16795.f49498 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (c16795.f49498 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != c16795.f49498;
                    int i10 = c16795.f49496 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c16795).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c16795).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c16795).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) c16795).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) c16795).bottomMargin);
                    }
                    if (z2) {
                        m33744(f, childAt);
                    }
                    int i18 = c16795.f49498 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f42154 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C1388 c1388M51177 = C1914.m51162(null, rootWindowInsets).m51177();
            C17466 c17466 = this.f42167;
            c17466.m39814(Math.max(c17466.m39818(), c1388M51177.f36103));
            C17466 c17467 = this.f42164;
            c17467.m39814(Math.max(c17467.m39818(), c1388M51177.f36104));
        }
        this.f42168 = false;
        this.f42161 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f42168) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C16795) getChildAt(i).getLayoutParams()).f49498);
        }
        this.f42157 = fMax;
        boolean zM39822 = this.f42167.m39822();
        boolean zM39823 = this.f42164.m39822();
        if (zM39822 || zM39823) {
            int i2 = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f42170 || (drawable = this.f42177) == null) {
            return;
        }
        Object obj = this.f42163;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zM33726 = m33726(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM33726) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m33730(childAt) && childAt.getHeight() >= height) {
                    if (m33740(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f42157;
        if (f > 0.0f && zM33726) {
            int i4 = this.f42173;
            Paint paint = this.f42159;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m33726(View view) {
        return ((C16795) view.getLayoutParams()).f49496 == 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m33730(View view) {
        int i = ((C16795) view.getLayoutParams()).f49496;
        int i2 = C1717.f57146;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM39805;
        int actionMasked = motionEvent.getActionMasked();
        C17466 c17466 = this.f42167;
        boolean zM39817 = c17466.m39817(motionEvent) | this.f42164.m39817(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m33739(true);
                this.f42158 = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m33739(true);
                    this.f42158 = false;
                }
            } else if (c17466.m39820()) {
                this.f42156.m11849();
                this.f42165.m11849();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f42182 = x;
            this.f42171 = y;
            z = this.f42157 > 0.0f && (viewM39805 = c17466.m39805((int) x, (int) y)) != null && m33726(viewM39805);
            this.f42158 = false;
        }
        if (!zM39817 && !z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!((C16795) getChildAt(i).getLayoutParams()).f49497) {
                }
            }
            if (!this.f42158) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f42157 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f42178 == null) {
                this.f42178 = new Rect();
            }
            childAt.getHitRect(this.f42178);
            if (this.f42178.contains((int) x, (int) y) && !m33726(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f42160 == null) {
                            this.f42160 = new Matrix();
                        }
                        matrix.invert(this.f42160);
                        motionEventObtain.transform(this.f42160);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        C17466 c17466 = this.f42167;
        c17466.m39810(motionEvent);
        this.f42164.m39810(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f42182 = x;
            this.f42171 = y;
            this.f42158 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            m33739(true);
            this.f42158 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewM39805 = c17466.m39805((int) x2, (int) y2);
        if (viewM39805 != null && m33726(viewM39805)) {
            float f = x2 - this.f42182;
            float f2 = y2 - this.f42171;
            int iM39812 = c17466.m39812();
            if ((f2 * f2) + (f * f) < iM39812 * iM39812) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i);
                    if ((((C16795) childAt.getLayoutParams()).f49499 & 1) == 1) {
                        break;
                    }
                    i++;
                }
                z = childAt == null || m33731(childAt) == 2;
            }
        }
        m33739(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m33739(true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33739(boolean z) {
        boolean zM39811;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C16795 c16795 = (C16795) childAt.getLayoutParams();
            if (m33730(childAt) && (!z || c16795.f49497)) {
                int width = childAt.getWidth();
                if (m33740(3, childAt)) {
                    int top = childAt.getTop();
                    zM39811 = this.f42167.m39811(childAt, -width, top);
                } else {
                    zM39811 = this.f42164.m39811(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zM39811;
                c16795.f49497 = false;
            }
        }
        this.f42156.m11849();
        this.f42165.m11849();
        if (z2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33750(View view) {
        if (!m33730(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C16795 c16795 = (C16795) view.getLayoutParams();
        if (this.f42161) {
            c16795.f49498 = 1.0f;
            c16795.f49499 = 1;
            m33724(view, true);
            m33728(view);
        } else {
            c16795.f49499 |= 2;
            if (m33740(3, view)) {
                this.f42167.m39811(view, 0, view.getTop());
            } else {
                this.f42164.m39811(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m33752(int i) {
        View viewM33743 = m33743(i);
        if (viewM33743 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m33729(i));
        }
        m33750(viewM33743);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33736(View view, boolean z) {
        if (!m33730(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C16795 c16795 = (C16795) view.getLayoutParams();
        if (this.f42161) {
            c16795.f49498 = 0.0f;
            c16795.f49499 = 0;
        } else if (z) {
            c16795.f49499 |= 4;
            if (m33740(3, view)) {
                this.f42167.m39811(view, -view.getWidth(), view.getTop());
            } else {
                this.f42164.m39811(view, getWidth(), view.getTop());
            }
        } else {
            m33733(0.0f, view);
            m33749(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33734(int i) {
        View viewM33743 = m33743(i);
        if (viewM33743 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m33729(i));
        }
        m33736(viewM33743, true);
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m33725(View view) {
        if (m33730(view)) {
            return (((C16795) view.getLayoutParams()).f49499 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m33753(int i) {
        View viewM33743 = m33743(i);
        if (viewM33743 != null) {
            return m33725(viewM33743);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m33723(View view) {
        if (m33730(view)) {
            return ((C16795) view.getLayoutParams()).f49498 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m33751() {
        View viewM33743 = m33743(8388611);
        if (viewM33743 != null) {
            return m33723(viewM33743);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C16795 c16795 = new C16795(-1, -1);
        c16795.f49496 = 0;
        return c16795;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C16795)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                C16795 c16795 = new C16795(layoutParams);
                c16795.f49496 = 0;
                return c16795;
            }
            C16795 c16796 = new C16795((ViewGroup.MarginLayoutParams) layoutParams);
            c16796.f49496 = 0;
            return c16796;
        }
        C16795 c16797 = (C16795) layoutParams;
        C16795 c16798 = new C16795(c16797);
        c16798.f49496 = 0;
        c16798.f49496 = c16797.f49496;
        return c16798;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C16795) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16795(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.f42179;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (m33730(childAt)) {
                if (m33725(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m33742() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m33742() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m33730(childAt) && m33723(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33732() {
        if (this.f42158) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f42158 = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewM33742 = m33742();
            if (viewM33742 != null && m33731(viewM33742) == 0) {
                m33739(false);
            }
            return viewM33742 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM33743;
        if (!(parcelable instanceof C23502)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C23502 c23502 = (C23502) parcelable;
        super.onRestoreInstanceState(c23502.getSuperState());
        int i = c23502.f74890;
        if (i != 0 && (viewM33743 = m33743(i)) != null) {
            m33750(viewM33743);
        }
        int i2 = c23502.f74894;
        if (i2 != 3) {
            m33735(i2, 3);
        }
        int i3 = c23502.f74892;
        if (i3 != 3) {
            m33735(i3, 5);
        }
        int i4 = c23502.f74891;
        if (i4 != 3) {
            m33735(i4, 8388611);
        }
        int i5 = c23502.f74893;
        if (i5 != 3) {
            m33735(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C23502 c23502 = new C23502(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C16795 c16795 = (C16795) getChildAt(i).getLayoutParams();
            int i2 = c16795.f49499;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c23502.f74890 = c16795.f49496;
                break;
            }
        }
        c23502.f74894 = this.f42175;
        c23502.f74892 = this.f42172;
        c23502.f74891 = this.f42183;
        c23502.f74893 = this.f42176;
        return c23502;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((C16795) childAt.getLayoutParams()).f49499 & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m33730(view)) {
            int i3 = C1717.f57146;
            view.setImportantForAccessibility(4);
        } else {
            int i4 = C1717.f57146;
            view.setImportantForAccessibility(1);
        }
        if (f42155) {
            return;
        }
        C1717.m43555(view, this.f42181);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m33727(View view) {
        int i = C1717.f57146;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }
}
