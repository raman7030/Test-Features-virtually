package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܳۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes3.dex */
public class C14462 extends ViewGroup {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static boolean f44313;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f44314;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6057 f44315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14486 f44316;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f44317;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f44318;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f44319;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public View f44320;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f44321;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f44322;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f44323;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f44324;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Rect f44325;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44326;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44327;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15886 f44328;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f44329;

    static {
        f44313 = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34550() {
        this.f44317 = 3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34542() {
        return this.f44317;
    }

    public C14462(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14462(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44318 = 1.0f;
        this.f44321 = new CopyOnWriteArrayList();
        this.f44326 = true;
        this.f44325 = new Rect();
        this.f44329 = new ArrayList();
        C11702 c11702 = new C11702(this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C17648.m41309(this, new C22990(this));
        setImportantForAccessibility(1);
        C15886 c15886M37622 = C15886.m37622(this, 0.5f, new C7468(this));
        this.f44328 = c15886M37622;
        c15886M37622.m37635(f * 400.0f);
        int i2 = C22953.f73940;
        InterfaceC7431.f22845.getClass();
        C6057 c6057 = new C6057(C13780.m33091(context), C0881.m3231(context));
        this.f44315 = c6057;
        c6057.m16896(c11702);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34540(InterfaceC10936 interfaceC10936) {
        this.f44321.add(interfaceC10936);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34543(View view) {
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27260(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34539(View view) {
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27261(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34548(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zM34545 = m34545();
        int width = zM34545 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM34545 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zM34545 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM34545 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM34545 = zM34545;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            C17285 c17285 = new C17285(view.getContext());
            c17285.addView(view);
            super.addView(c17285, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C17285) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f44326 = true;
        if (this.f44315 != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                this.f44315.m16895(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44326 = true;
        C6057 c6057 = this.f44315;
        if (c6057 != null) {
            c6057.m16894();
        }
        ArrayList arrayList = this.f44329;
        if (arrayList.size() > 0) {
            ((RunnableC13817) arrayList.get(0)).getClass();
            throw null;
        }
        arrayList.clear();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0304  */
    /* JADX WARN: Code duplicated, block: B:142:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[PHI: r12
      0x007e: PHI (r12v24 float) = (r12v1 float), (r12v25 float) binds: [B:15:0x0075, B:17:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int iMax;
        float f;
        int i5;
        int iMakeMeasureSpec2;
        ArrayList arrayList;
        int i6;
        int minimumWidth;
        int iMax2;
        int i7;
        int iMakeMeasureSpec3;
        int measuredHeight;
        boolean z;
        int i8;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f44320 = null;
        int i9 = 0;
        boolean z2 = false;
        float f2 = 0.0f;
        int i10 = iMax3;
        while (true) {
            i3 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            int i11 = size;
            C1763 c1763 = (C1763) childAt.getLayoutParams();
            int i12 = childCount;
            if (childAt.getVisibility() == 8) {
                c1763.f6114 = r7;
            } else {
                float f3 = c1763.f6116;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) c1763).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c1763).leftMargin + ((ViewGroup.MarginLayoutParams) c1763).rightMargin), (int) r7);
                        i7 = ((ViewGroup.MarginLayoutParams) c1763).width;
                        if (i7 == -2) {
                            if (mode == 0) {
                                i8 = mode;
                            } else {
                                i8 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                        } else if (i7 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c1763).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i10 -= measuredWidth;
                        if (i9 != 0) {
                            if (i10 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1763.f6115 = z;
                            boolean z3 = z2 | z;
                            if (z) {
                                this.f44320 = childAt;
                            }
                            z2 = z3;
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c1763).leftMargin + ((ViewGroup.MarginLayoutParams) c1763).rightMargin), (int) r7);
                    i7 = ((ViewGroup.MarginLayoutParams) c1763).width;
                    if (i7 == -2) {
                        if (mode == 0) {
                            i8 = mode;
                        } else {
                            i8 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                    } else if (i7 == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c1763).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i10 -= measuredWidth2;
                    if (i9 != 0) {
                        if (i10 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1763.f6115 = z;
                        boolean z4 = z2 | z;
                        if (z) {
                            this.f44320 = childAt;
                        }
                        z2 = z4;
                    }
                }
            }
            i9++;
            r7 = 0;
            childCount = i12;
            size = i11;
        }
        int i13 = size;
        int i14 = childCount;
        if (z2 || f2 > 0.0f) {
            int i15 = 0;
            i4 = i14;
            while (i15 < i4) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() == i3) {
                    f = f2;
                    i5 = i10;
                } else {
                    C1763 c1764 = (C1763) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) c1764).width != 0 || c1764.f6116 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) c1764).leftMargin + ((ViewGroup.MarginLayoutParams) c1764).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (c1764.f6116 > 0.0f) {
                        iMax = ((int) ((c1764.f6116 * Math.max(0, i10)) / f2)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMakeMeasureSpec = 0;
                        iMax = measuredWidth3;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    f = f2;
                    C1763 c1765 = (C1763) childAt2.getLayoutParams();
                    i5 = i10;
                    if (((ViewGroup.MarginLayoutParams) c1765).width == 0 && c1765.f6116 > 0.0f) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c1765).height);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                    }
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i15++;
                i3 = 8;
                i10 = i5;
                f2 = f;
            }
        } else {
            i4 = i14;
        }
        InterfaceC14486 interfaceC14486 = this.f44316;
        if (interfaceC14486 == null || !interfaceC14486.mo18304() || this.f44316.mo18303().left == 0 || this.f44316.mo18303().top != 0) {
            arrayList = null;
        } else {
            InterfaceC14486 interfaceC14487 = this.f44316;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i16 = iArr[0];
            Rect rect = new Rect(i16, iArr[1], getWidth() + i16, getWidth() + iArr[1]);
            Rect rect2 = new Rect(interfaceC14487.mo18303());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z2) {
            for (int i17 = 0; i17 < i4; i17++) {
                View childAt3 = getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i17);
                    C1763 c1766 = (C1763) childAt3.getLayoutParams();
                    int i18 = ((ViewGroup.MarginLayoutParams) c1766).leftMargin + ((ViewGroup.MarginLayoutParams) c1766).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                        if (i17 == 0) {
                            c1766.f6115 = true;
                            this.f44320 = childAt3;
                            z2 = true;
                        }
                    } else {
                        boolean z5 = childAt3 instanceof C17285;
                        if (z5) {
                            i6 = 0;
                            View childAt4 = ((C17285) childAt3).getChildAt(0);
                            int i19 = C17648.f53953;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i6 = 0;
                            int i20 = C17648.f53953;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z5 ? ((C17285) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                                if (i17 == 0) {
                                    c1766.f6115 = true;
                                    this.f44320 = childAt3;
                                    z2 = true;
                                }
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                }
            }
        }
        setMeasuredDimension(i13, getPaddingBottom() + getPaddingTop() + iMin);
        this.f44327 = z2;
        C15886 c15886 = this.f44328;
        if (c15886.m37651() == 0 || z2) {
            return;
        }
        c15886.m37634();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean zM34545 = m34545();
        int i8 = i3 - i;
        int paddingRight = zM34545 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM34545 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f44326) {
            this.f44318 = (this.f44327 && this.f44324) ? 0.0f : 1.0f;
        }
        int i9 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1763 c1763 = (C1763) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c1763.f6115) {
                    int i11 = i8 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i11) - i9) - (((ViewGroup.MarginLayoutParams) c1763).leftMargin + ((ViewGroup.MarginLayoutParams) c1763).rightMargin);
                    this.f44314 = iMin;
                    int i12 = zM34545 ? ((ViewGroup.MarginLayoutParams) c1763).rightMargin : ((ViewGroup.MarginLayoutParams) c1763).leftMargin;
                    c1763.f6114 = (measuredWidth / 2) + ((i9 + i12) + iMin) > i11;
                    float f = iMin;
                    int i13 = (int) (this.f44318 * f);
                    i5 = i12 + i13 + i9;
                    this.f44318 = i13 / f;
                } else {
                    i5 = paddingRight;
                }
                if (zM34545) {
                    i6 = i8 - i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i6 = i5 + measuredWidth;
                    i7 = i5;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC14486 interfaceC14486 = this.f44316;
                paddingRight = Math.abs((interfaceC14486 != null && interfaceC14486.mo18305() == C18015.f56184 && this.f44316.mo18304()) ? this.f44316.mo18303().width() : 0) + childAt.getWidth() + paddingRight;
                i9 = i5;
            }
        }
        if (this.f44326) {
            m34548(this.f44320);
        }
        this.f44326 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f44326 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f44327) {
            return;
        }
        this.f44324 = view == this.f44320;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f44327;
        C15886 c15886 = this.f44328;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c15886.getClass();
            this.f44324 = C15886.m37630(childAt, x, y);
        }
        if (!this.f44327 || (this.f44319 && actionMasked != 0)) {
            c15886.m37641();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c15886.m37641();
            return false;
        }
        if (actionMasked == 0) {
            this.f44319 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f44323 = x2;
            this.f44322 = y2;
            c15886.getClass();
            if (C15886.m37630(this.f44320, (int) x2, (int) y2) && m34546(this.f44320)) {
                z = true;
            }
            return !c15886.m37645(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f44323);
            float fAbs2 = Math.abs(y3 - this.f44322);
            if (fAbs > c15886.m37640() && fAbs2 > fAbs) {
                c15886.m37641();
                this.f44319 = true;
                return false;
            }
        }
        z = false;
        if (c15886.m37645(motionEvent)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44327) {
            return super.onTouchEvent(motionEvent);
        }
        C15886 c15886 = this.f44328;
        c15886.m37638(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f44323 = x;
            this.f44322 = y;
            return true;
        }
        if (actionMasked == 1 && m34546(this.f44320)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f44323;
            float f2 = y2 - this.f44322;
            int iM37640 = c15886.m37640();
            if ((f2 * f2) + (f * f) < iM37640 * iM37640 && C15886.m37630(this.f44320, (int) x2, (int) y2)) {
                m34536();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m34536() {
        if (!this.f44327) {
            this.f44324 = false;
        }
        if (!this.f44326 && !m34541(1.0f)) {
            return false;
        }
        this.f44324 = false;
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34544() {
        if (!this.f44327) {
            this.f44324 = true;
        }
        if (this.f44326 || m34541(0.0f)) {
            this.f44324 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34537() {
        m34536();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34549() {
        return !this.f44327 || this.f44318 == 0.0f;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34547() {
        return this.f44327;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34538(int i) {
        if (this.f44320 == null) {
            this.f44318 = 0.0f;
            return;
        }
        boolean zM34545 = m34545();
        C1763 c1763 = (C1763) this.f44320.getLayoutParams();
        int width = this.f44320.getWidth();
        if (zM34545) {
            i = (getWidth() - i) - width;
        }
        this.f44318 = (i - ((zM34545 ? getPaddingRight() : getPaddingLeft()) + (zM34545 ? ((ViewGroup.MarginLayoutParams) c1763).rightMargin : ((ViewGroup.MarginLayoutParams) c1763).leftMargin))) / this.f44314;
        View view = this.f44320;
        Iterator it = this.f44321.iterator();
        while (it.hasNext()) {
            ((InterfaceC10936) it.next()).mo27259(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C21610 c21610M41340;
        C21610 c21610M41341;
        boolean zM34545 = m34545() ^ m34549();
        boolean z = f44313;
        C11007 c11007M48829 = null;
        C15886 c15886 = this.f44328;
        if (zM34545) {
            c15886.m37647(1);
            if (z && (c21610M41341 = C17648.m41340(this)) != null) {
                c11007M48829 = c21610M41341.m48829();
            }
            if (c11007M48829 != null) {
                c15886.m37642(Math.max(c15886.m37646(), c11007M48829.f33109));
            }
        } else {
            c15886.m37647(2);
            if (z && (c21610M41340 = C17648.m41340(this)) != null) {
                c11007M48829 = c21610M41340.m48829();
            }
            if (c11007M48829 != null) {
                c15886.m37642(Math.max(c15886.m37646(), c11007M48829.f33110));
            }
        }
        C1763 c1763 = (C1763) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f44327 && !c1763.f6115 && this.f44320 != null) {
            Rect rect = this.f44325;
            canvas.getClipBounds(rect);
            if (m34545()) {
                rect.left = Math.max(rect.left, this.f44320.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f44320.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34541(float f) {
        int paddingLeft;
        if (this.f44327) {
            boolean zM34545 = m34545();
            C1763 c1763 = (C1763) this.f44320.getLayoutParams();
            if (zM34545) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c1763).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f44314) + paddingRight) + this.f44320.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f44314) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1763).leftMargin);
            }
            View view = this.f44320;
            if (this.f44328.m37639(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                int i2 = C17648.f53953;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C15886 c15886 = this.f44328;
        if (c15886.m37650()) {
            if (!this.f44327) {
                c15886.m37634();
            } else {
                int i = C17648.f53953;
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        m34545();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34546(View view) {
        if (view == null) {
            return false;
        }
        return this.f44327 && ((C1763) view.getLayoutParams()).f6114 && this.f44318 > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1763();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1763 c1763;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c1763 = new C1763(layoutParams);
        } else {
            c1763 = new C1763((ViewGroup.MarginLayoutParams) layoutParams);
        }
        c1763.f6116 = 0.0f;
        return c1763;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1763) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1763(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C17991 c17991 = new C17991(super.onSaveInstanceState());
        c17991.f56131 = this.f44327 ? m34549() : this.f44324;
        c17991.f56132 = this.f44317;
        return c17991;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C17991)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17991 c17991 = (C17991) parcelable;
        super.onRestoreInstanceState(c17991.getSuperState());
        if (!c17991.f56131) {
            m34536();
        } else {
            m34544();
        }
        this.f44324 = c17991.f56131;
        this.f44317 = c17991.f56132;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34545() {
        int i = C17648.f53953;
        return getLayoutDirection() == 1;
    }
}
