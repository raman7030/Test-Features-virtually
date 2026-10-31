package l;

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
public class C13064 extends ViewGroup {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f39105;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static boolean f39106;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final boolean f39107;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C3187 f39108;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f39109;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f39110;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Paint f39111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Matrix f39112;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f39113;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f39114;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f39115;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C15886 f39116;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C3187 f39117;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39118;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C15886 f39119;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39120;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f39121;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f39122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f39123;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f39124;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f39125;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f39126;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f39127;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f39128;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public Drawable f39129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Rect f39130;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f39131;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5198 f39132;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1070 f39133;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f39134;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f39135;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39104 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39103 = {R.attr.layout_gravity};

    static {
        int i = Build.VERSION.SDK_INT;
        f39107 = true;
        f39105 = true;
        f39106 = i >= 29;
    }

    public C13064(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public C13064(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39133 = new C1070();
        this.f39125 = DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
        this.f39111 = new Paint();
        this.f39113 = true;
        this.f39127 = 3;
        this.f39124 = 3;
        this.f39135 = 3;
        this.f39128 = 3;
        this.f39132 = new C19416(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f39114 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C3187 c3187 = new C3187(this, 3);
        this.f39108 = c3187;
        C3187 c3188 = new C3187(this, 5);
        this.f39117 = c3188;
        C15886 c15886M37622 = C15886.m37622(this, 1.0f, c3187);
        this.f39119 = c15886M37622;
        c15886M37622.m37647(1);
        c15886M37622.m37635(f2);
        c3187.m9803(c15886M37622);
        C15886 c15886M37623 = C15886.m37622(this, 1.0f, c3188);
        this.f39116 = c15886M37623;
        c15886M37623.m37647(2);
        c15886M37623.m37635(f2);
        c3188.m9803(c15886M37623);
        setFocusableInTouchMode(true);
        int i2 = C17648.f53953;
        setImportantForAccessibility(1);
        C17648.m41309(this, new C5304(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0364());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f39104);
            try {
                this.f39129 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C18710.f59149, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f39121 = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f39121 = getResources().getDimension(bin.mt.plus.R.dimen.MT_Protector);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f39131 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31650(WindowInsets windowInsets, boolean z) {
        this.f39115 = windowInsets;
        this.f39122 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31660(int i) {
        this.f39125 = i;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31651(InterfaceC8126 interfaceC8126) {
        if (interfaceC8126 == null) {
            return;
        }
        if (this.f39126 == null) {
            this.f39126 = new ArrayList();
        }
        this.f39126.add(interfaceC8126);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31659(InterfaceC8126 interfaceC8126) {
        ArrayList arrayList;
        if (interfaceC8126 == null || (arrayList = this.f39126) == null) {
            return;
        }
        arrayList.remove(interfaceC8126);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31648(int i, int i2) {
        View viewM31656;
        int i3 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f39127 = i;
        } else if (i2 == 5) {
            this.f39124 = i;
        } else if (i2 == 8388611) {
            this.f39135 = i;
        } else if (i2 == 8388613) {
            this.f39128 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f39119 : this.f39116).m37641();
        }
        if (i != 1) {
            if (i == 2 && (viewM31656 = m31656(absoluteGravity)) != null) {
                m31663(viewM31656);
                return;
            }
            return;
        }
        View viewM31657 = m31656(absoluteGravity);
        if (viewM31657 != null) {
            m31649(viewM31657, true);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31658(int i, View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
        }
        m31648(i, ((C15180) view.getLayoutParams()).f46371);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31661(int i) {
        int i2 = C17648.f53953;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i3 = this.f39127;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.f39135 : this.f39128;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i == 5) {
            int i5 = this.f39124;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f39128 : this.f39135;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 8388611) {
            int i7 = this.f39135;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f39127 : this.f39124;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i9 = this.f39128;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.f39124 : this.f39127;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31644(View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return m31661(((C15180) view.getLayoutParams()).f46371);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31662(int i, View view) {
        int i2;
        View rootView;
        int iM37651 = this.f39119.m37651();
        int iM37652 = this.f39116.m37651();
        if (iM37651 == 1 || iM37652 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM37651 != 2 && iM37652 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C15180) view.getLayoutParams()).f46373;
            if (f == 0.0f) {
                C15180 c15180 = (C15180) view.getLayoutParams();
                if ((c15180.f46374 & 1) == 1) {
                    c15180.f46374 = 0;
                    ArrayList arrayList = this.f39126;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC8126) this.f39126.get(size)).onDrawerClosed(view);
                        }
                    }
                    m31637(view, false);
                    m31641(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C15180 c15181 = (C15180) view.getLayoutParams();
                if ((c15181.f46374 & 1) == 0) {
                    c15181.f46374 = 1;
                    ArrayList arrayList2 = this.f39126;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC8126) this.f39126.get(size2)).onDrawerOpened(view);
                        }
                    }
                    m31637(view, true);
                    m31641(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f39118) {
            this.f39118 = i2;
            ArrayList arrayList3 = this.f39126;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC8126) this.f39126.get(size3)).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31637(View view, boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z && !m31643(childAt)) || (z && childAt == view)) {
                int i3 = C17648.f53953;
                i = 1;
            } else {
                int i4 = C17648.f53953;
                i = 4;
            }
            childAt.setImportantForAccessibility(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31641(View view) {
        C13847 c13847 = C13847.f41298;
        C17648.m41337(c13847.m33204(), view);
        if (!m31638(view) || m31644(view) == 2) {
            return;
        }
        C17648.m41308(view, c13847, null, this.f39132);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31657(float f, View view) {
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (f == c15180.f46373) {
            return;
        }
        c15180.f46373 = f;
        ArrayList arrayList = this.f39126;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC8126) this.f39126.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31646(float f, View view) {
        float f2 = ((C15180) view.getLayoutParams()).f46373;
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!m31653(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m31657(f, view);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31654(View view) {
        int i = ((C15180) view.getLayoutParams()).f46371;
        int i2 = C17648.f53953;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31653(int i, View view) {
        return (m31654(view) & i) == i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m31656(int i) {
        int i2 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((m31654(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m31642(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39113 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39113 = true;
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
        if (this.f39115 != null) {
            int i3 = C17648.f53953;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i4 = C17648.f53953;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C15180 c15180 = (C15180) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c15180.f46371, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f39115;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f39115;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c15180).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c15180).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c15180).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c15180).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m31639(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c15180).leftMargin) - ((ViewGroup.MarginLayoutParams) c15180).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c15180).topMargin) - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin, 1073741824));
                } else {
                    if (!m31643(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f39105) {
                        float fM41320 = C17648.m41320(childAt);
                        float f = this.f39121;
                        if (fM41320 != f) {
                            C17648.m41301(childAt, f);
                        }
                    }
                    int iM31654 = m31654(childAt) & 7;
                    boolean z4 = iM31654 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(C9045.m23341(new StringBuilder("Child drawer has absolute gravity "), m31642(iM31654), " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f39114 + ((ViewGroup.MarginLayoutParams) c15180).leftMargin + ((ViewGroup.MarginLayoutParams) c15180).rightMargin, ((ViewGroup.MarginLayoutParams) c15180).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c15180).topMargin + ((ViewGroup.MarginLayoutParams) c15180).bottomMargin, ((ViewGroup.MarginLayoutParams) c15180).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f39105) {
            return;
        }
        int i2 = C17648.f53953;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.f39120 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C15180 c15180 = (C15180) childAt.getLayoutParams();
                if (m31639(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c15180).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c15180).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c15180).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m31653(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c15180.f46373 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (c15180.f46373 * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != c15180.f46373;
                    int i10 = c15180.f46371 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) c15180).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) c15180).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) c15180).bottomMargin);
                    }
                    if (z2) {
                        m31657(f, childAt);
                    }
                    int i18 = c15180.f46373 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (f39106 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C11007 c11007M48829 = C21610.m48814(null, rootWindowInsets).m48829();
            C15886 c15886 = this.f39119;
            c15886.m37642(Math.max(c15886.m37646(), c11007M48829.f33109));
            C15886 c15887 = this.f39116;
            c15887.m37642(Math.max(c15887.m37646(), c11007M48829.f33110));
        }
        this.f39120 = false;
        this.f39113 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f39120) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C15180) getChildAt(i).getLayoutParams()).f46373);
        }
        this.f39109 = fMax;
        boolean zM37650 = this.f39119.m37650();
        boolean zM37651 = this.f39116.m37650();
        if (zM37650 || zM37651) {
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f39122 || (drawable = this.f39129) == null) {
            return;
        }
        Object obj = this.f39115;
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
        boolean zM31639 = m31639(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM31639) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m31643(childAt) && childAt.getHeight() >= height) {
                    if (m31653(3, childAt)) {
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
        float f = this.f39109;
        if (f > 0.0f && zM31639) {
            int i4 = this.f39125;
            Paint paint = this.f39111;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m31639(View view) {
        return ((C15180) view.getLayoutParams()).f46371 == 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m31643(View view) {
        int i = ((C15180) view.getLayoutParams()).f46371;
        int i2 = C17648.f53953;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM37633;
        int actionMasked = motionEvent.getActionMasked();
        C15886 c15886 = this.f39119;
        boolean zM37645 = c15886.m37645(motionEvent) | this.f39116.m37645(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m31652(true);
                this.f39110 = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m31652(true);
                    this.f39110 = false;
                }
            } else if (c15886.m37648()) {
                this.f39108.m9804();
                this.f39117.m9804();
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f39134 = x;
            this.f39123 = y;
            z = this.f39109 > 0.0f && (viewM37633 = c15886.m37633((int) x, (int) y)) != null && m31639(viewM37633);
            this.f39110 = false;
        }
        if (!zM37645 && !z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!((C15180) getChildAt(i).getLayoutParams()).f46372) {
                }
            }
            if (!this.f39110) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f39109 <= 0.0f) {
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
            if (this.f39130 == null) {
                this.f39130 = new Rect();
            }
            childAt.getHitRect(this.f39130);
            if (this.f39130.contains((int) x, (int) y) && !m31639(childAt)) {
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
                        if (this.f39112 == null) {
                            this.f39112 = new Matrix();
                        }
                        matrix.invert(this.f39112);
                        motionEventObtain.transform(this.f39112);
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
        C15886 c15886 = this.f39119;
        c15886.m37638(motionEvent);
        this.f39116.m37638(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f39134 = x;
            this.f39123 = y;
            this.f39110 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            m31652(true);
            this.f39110 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewM37633 = c15886.m37633((int) x2, (int) y2);
        if (viewM37633 != null && m31639(viewM37633)) {
            float f = x2 - this.f39134;
            float f2 = y2 - this.f39123;
            int iM37640 = c15886.m37640();
            if ((f2 * f2) + (f * f) < iM37640 * iM37640) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i);
                    if ((((C15180) childAt.getLayoutParams()).f46374 & 1) == 1) {
                        break;
                    }
                    i++;
                }
                z = childAt == null || m31644(childAt) == 2;
            }
        }
        m31652(z);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m31652(true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31652(boolean z) {
        boolean zM37639;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C15180 c15180 = (C15180) childAt.getLayoutParams();
            if (m31643(childAt) && (!z || c15180.f46372)) {
                int width = childAt.getWidth();
                if (m31653(3, childAt)) {
                    int top = childAt.getTop();
                    zM37639 = this.f39119.m37639(childAt, -width, top);
                } else {
                    zM37639 = this.f39116.m37639(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zM37639;
                c15180.f46372 = false;
            }
        }
        this.f39108.m9804();
        this.f39117.m9804();
        if (z2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31663(View view) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (this.f39113) {
            c15180.f46373 = 1.0f;
            c15180.f46374 = 1;
            m31637(view, true);
            m31641(view);
        } else {
            c15180.f46374 |= 2;
            if (m31653(3, view)) {
                this.f39119.m37639(view, 0, view.getTop());
            } else {
                this.f39116.m37639(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31665(int i) {
        View viewM31656 = m31656(i);
        if (viewM31656 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m31642(i));
        }
        m31663(viewM31656);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31649(View view, boolean z) {
        if (!m31643(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C15180 c15180 = (C15180) view.getLayoutParams();
        if (this.f39113) {
            c15180.f46373 = 0.0f;
            c15180.f46374 = 0;
        } else if (z) {
            c15180.f46374 |= 4;
            if (m31653(3, view)) {
                this.f39119.m37639(view, -view.getWidth(), view.getTop());
            } else {
                this.f39116.m37639(view, getWidth(), view.getTop());
            }
        } else {
            m31646(0.0f, view);
            m31662(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31647(int i) {
        View viewM31656 = m31656(i);
        if (viewM31656 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m31642(i));
        }
        m31649(viewM31656, true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m31638(View view) {
        if (m31643(view)) {
            return (((C15180) view.getLayoutParams()).f46374 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m31666(int i) {
        View viewM31656 = m31656(i);
        if (viewM31656 != null) {
            return m31638(viewM31656);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m31636(View view) {
        if (m31643(view)) {
            return ((C15180) view.getLayoutParams()).f46373 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m31664() {
        View viewM31656 = m31656(8388611);
        if (viewM31656 != null) {
            return m31636(viewM31656);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C15180 c15180 = new C15180(-1, -1);
        c15180.f46371 = 0;
        return c15180;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C15180)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                C15180 c15180 = new C15180(layoutParams);
                c15180.f46371 = 0;
                return c15180;
            }
            C15180 c15181 = new C15180((ViewGroup.MarginLayoutParams) layoutParams);
            c15181.f46371 = 0;
            return c15181;
        }
        C15180 c15182 = (C15180) layoutParams;
        C15180 c15183 = new C15180(c15182);
        c15183.f46371 = 0;
        c15183.f46371 = c15182.f46371;
        return c15183;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C15180) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C15180(getContext(), attributeSet);
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
            arrayList2 = this.f39131;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (m31643(childAt)) {
                if (m31638(childAt)) {
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
        if (i == 4 && m31655() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m31655() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m31643(childAt) && m31636(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31645() {
        if (this.f39110) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f39110 = true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View viewM31655 = m31655();
            if (viewM31655 != null && m31644(viewM31655) == 0) {
                m31652(false);
            }
            return viewM31655 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM31656;
        if (!(parcelable instanceof C22237)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22237 c22237 = (C22237) parcelable;
        super.onRestoreInstanceState(c22237.getSuperState());
        int i = c22237.f72165;
        if (i != 0 && (viewM31656 = m31656(i)) != null) {
            m31663(viewM31656);
        }
        int i2 = c22237.f72169;
        if (i2 != 3) {
            m31648(i2, 3);
        }
        int i3 = c22237.f72167;
        if (i3 != 3) {
            m31648(i3, 5);
        }
        int i4 = c22237.f72166;
        if (i4 != 3) {
            m31648(i4, 8388611);
        }
        int i5 = c22237.f72168;
        if (i5 != 3) {
            m31648(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C22237 c22237 = new C22237(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C15180 c15180 = (C15180) getChildAt(i).getLayoutParams();
            int i2 = c15180.f46374;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c22237.f72165 = c15180.f46371;
                break;
            }
        }
        c22237.f72169 = this.f39127;
        c22237.f72167 = this.f39124;
        c22237.f72166 = this.f39135;
        c22237.f72168 = this.f39128;
        return c22237;
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
            if ((((C15180) childAt.getLayoutParams()).f46374 & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m31643(view)) {
            int i3 = C17648.f53953;
            view.setImportantForAccessibility(4);
        } else {
            int i4 = C17648.f53953;
            view.setImportantForAccessibility(1);
        }
        if (f39107) {
            return;
        }
        C17648.m41309(view, this.f39133);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m31640(View view) {
        int i = C17648.f53953;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }
}
