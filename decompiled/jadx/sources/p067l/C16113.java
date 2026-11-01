package p067l;

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
public class C16113 extends ViewGroup {

    /* JADX INFO: renamed from: ᩳ֫ */
    public static boolean f47407;

    /* JADX INFO: renamed from: ֫֫ */
    public int f47408;

    /* JADX INFO: renamed from: ۗ */
    public C8125 f47409;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC16136 f47410;

    /* JADX INFO: renamed from: ۛ */
    public int f47411;

    /* JADX INFO: renamed from: ۟ */
    public float f47412;

    /* JADX INFO: renamed from: ۤ */
    public boolean f47413;

    /* JADX INFO: renamed from: ۧ֫ */
    public View f47414;

    /* JADX INFO: renamed from: ۨ */
    public final CopyOnWriteArrayList f47415;

    /* JADX INFO: renamed from: ۫ */
    public float f47416;

    /* JADX INFO: renamed from: ۬ */
    public float f47417;

    /* JADX INFO: renamed from: ܰ */
    public boolean f47418;

    /* JADX INFO: renamed from: ܽ֫ */
    public final Rect f47419;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f47420;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f47421;

    /* JADX INFO: renamed from: ᩹ */
    public final C17466 f47422;

    /* JADX INFO: renamed from: ᩺ */
    public final ArrayList f47423;

    static {
        f47407 = Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m36684() {
        this.f47411 = 3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36676() {
        return this.f47411;
    }

    public C16113(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16113(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47412 = 1.0f;
        this.f47415 = new CopyOnWriteArrayList();
        this.f47420 = true;
        this.f47419 = new Rect();
        this.f47423 = new ArrayList();
        C13490 c13490 = new C13490(this);
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        C1717.m43555(this, new C24218(this));
        setImportantForAccessibility(1);
        C17466 c17466M39794 = C17466.m39794(this, 0.5f, new C9466(this));
        this.f47422 = c17466M39794;
        c17466M39794.m39807(f * 400.0f);
        int i2 = C24183.f76670;
        InterfaceC9431.f25758.getClass();
        C8125 c8125 = new C8125(C15465.m35207(context), C0886.m5545(context));
        this.f47409 = c8125;
        c8125.m18825(c13490);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36674(InterfaceC12762 interfaceC12762) {
        this.f47415.add(interfaceC12762);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36677(View view) {
        Iterator it = this.f47415.iterator();
        while (it.hasNext()) {
            ((InterfaceC12762) it.next()).mo29304(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36673(View view) {
        Iterator it = this.f47415.iterator();
        while (it.hasNext()) {
            ((InterfaceC12762) it.next()).mo29305(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36682(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zM36679 = m36679();
        int width = zM36679 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM36679 ? getPaddingLeft() : getWidth() - getPaddingRight();
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
                childAt.setVisibility((Math.max(zM36679 ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zM36679 ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zM36679 = zM36679;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            C18796 c18796 = new C18796(view.getContext());
            c18796.addView(view);
            super.addView(c18796, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof C18796) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f47420 = true;
        if (this.f47409 != null) {
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
                this.f47409.m18824(activity);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47420 = true;
        C8125 c8125 = this.f47409;
        if (c8125 != null) {
            c8125.m18823();
        }
        ArrayList arrayList = this.f47423;
        if (arrayList.size() > 0) {
            ((RunnableC15500) arrayList.get(0)).getClass();
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
        this.f47414 = null;
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
            C4044 c4044 = (C4044) childAt.getLayoutParams();
            int i12 = childCount;
            if (childAt.getVisibility() == 8) {
                c4044.f8890 = r7;
            } else {
                float f3 = c4044.f8892;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) c4044).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c4044).leftMargin + ((ViewGroup.MarginLayoutParams) c4044).rightMargin), (int) r7);
                        i7 = ((ViewGroup.MarginLayoutParams) c4044).width;
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
                        childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c4044).height));
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
                            c4044.f8891 = z;
                            boolean z3 = z2 | z;
                            if (z) {
                                this.f47414 = childAt;
                            }
                            z2 = z3;
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) c4044).leftMargin + ((ViewGroup.MarginLayoutParams) c4044).rightMargin), (int) r7);
                    i7 = ((ViewGroup.MarginLayoutParams) c4044).width;
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
                    childAt.measure(iMakeMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) c4044).height));
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
                        c4044.f8891 = z;
                        boolean z4 = z2 | z;
                        if (z) {
                            this.f47414 = childAt;
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
                    C4044 c4045 = (C4044) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) c4045).width != 0 || c4045.f8892 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) c4045).leftMargin + ((ViewGroup.MarginLayoutParams) c4045).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (c4045.f8892 > 0.0f) {
                        iMax = ((int) ((c4045.f8892 * Math.max(0, i10)) / f2)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMakeMeasureSpec = 0;
                        iMax = measuredWidth3;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    f = f2;
                    C4044 c4046 = (C4044) childAt2.getLayoutParams();
                    i5 = i10;
                    if (((ViewGroup.MarginLayoutParams) c4046).width == 0 && c4046.f8892 > 0.0f) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) c4046).height);
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
        InterfaceC16136 interfaceC16136 = this.f47410;
        if (interfaceC16136 == null || !interfaceC16136.mo20252() || this.f47410.mo20251().left == 0 || this.f47410.mo20251().top != 0) {
            arrayList = null;
        } else {
            InterfaceC16136 interfaceC16137 = this.f47410;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i16 = iArr[0];
            Rect rect = new Rect(i16, iArr[1], getWidth() + i16, getWidth() + iArr[1]);
            Rect rect2 = new Rect(interfaceC16137.mo20251());
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
                    C4044 c4047 = (C4044) childAt3.getLayoutParams();
                    int i18 = ((ViewGroup.MarginLayoutParams) c4047).leftMargin + ((ViewGroup.MarginLayoutParams) c4047).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                        if (i17 == 0) {
                            c4047.f8891 = true;
                            this.f47414 = childAt3;
                            z2 = true;
                        }
                    } else {
                        boolean z5 = childAt3 instanceof C18796;
                        if (z5) {
                            i6 = 0;
                            View childAt4 = ((C18796) childAt3).getChildAt(0);
                            int i19 = C1717.f57146;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i6 = 0;
                            int i20 = C1717.f57146;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z5 ? ((C18796) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i18, 1073741824), iMakeMeasureSpec4);
                                if (i17 == 0) {
                                    c4047.f8891 = true;
                                    this.f47414 = childAt3;
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
        this.f47421 = z2;
        C17466 c17466 = this.f47422;
        if (c17466.m39823() == 0 || z2) {
            return;
        }
        c17466.m39806();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean zM36679 = m36679();
        int i8 = i3 - i;
        int paddingRight = zM36679 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zM36679 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f47420) {
            this.f47412 = (this.f47421 && this.f47418) ? 0.0f : 1.0f;
        }
        int i9 = paddingRight;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C4044 c4044 = (C4044) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (c4044.f8891) {
                    int i11 = i8 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i11) - i9) - (((ViewGroup.MarginLayoutParams) c4044).leftMargin + ((ViewGroup.MarginLayoutParams) c4044).rightMargin);
                    this.f47408 = iMin;
                    int i12 = zM36679 ? ((ViewGroup.MarginLayoutParams) c4044).rightMargin : ((ViewGroup.MarginLayoutParams) c4044).leftMargin;
                    c4044.f8890 = (measuredWidth / 2) + ((i9 + i12) + iMin) > i11;
                    float f = iMin;
                    int i13 = (int) (this.f47412 * f);
                    i5 = i12 + i13 + i9;
                    this.f47412 = i13 / f;
                } else {
                    i5 = paddingRight;
                }
                if (zM36679) {
                    i6 = i8 - i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i6 = i5 + measuredWidth;
                    i7 = i5;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                InterfaceC16136 interfaceC16136 = this.f47410;
                paddingRight = Math.abs((interfaceC16136 != null && interfaceC16136.mo20253() == C19490.f59381 && this.f47410.mo20252()) ? this.f47410.mo20251().width() : 0) + childAt.getWidth() + paddingRight;
                i9 = i5;
            }
        }
        if (this.f47420) {
            m36682(this.f47414);
        }
        this.f47420 = false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f47420 = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f47421) {
            return;
        }
        this.f47418 = view == this.f47414;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.f47421;
        C17466 c17466 = this.f47422;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            c17466.getClass();
            this.f47418 = C17466.m39802(childAt, x, y);
        }
        if (!this.f47421 || (this.f47413 && actionMasked != 0)) {
            c17466.m39813();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c17466.m39813();
            return false;
        }
        if (actionMasked == 0) {
            this.f47413 = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f47417 = x2;
            this.f47416 = y2;
            c17466.getClass();
            if (C17466.m39802(this.f47414, (int) x2, (int) y2) && m36680(this.f47414)) {
                z = true;
            }
            return !c17466.m39817(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.f47417);
            float fAbs2 = Math.abs(y3 - this.f47416);
            if (fAbs > c17466.m39812() && fAbs2 > fAbs) {
                c17466.m39813();
                this.f47413 = true;
                return false;
            }
        }
        z = false;
        if (c17466.m39817(motionEvent)) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f47421) {
            return super.onTouchEvent(motionEvent);
        }
        C17466 c17466 = this.f47422;
        c17466.m39810(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f47417 = x;
            this.f47416 = y;
            return true;
        }
        if (actionMasked == 1 && m36680(this.f47414)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f47417;
            float f2 = y2 - this.f47416;
            int iM39812 = c17466.m39812();
            if ((f2 * f2) + (f * f) < iM39812 * iM39812 && C17466.m39802(this.f47414, (int) x2, (int) y2)) {
                m36670();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m36670() {
        if (!this.f47421) {
            this.f47418 = false;
        }
        if (!this.f47420 && !m36675(1.0f)) {
            return false;
        }
        this.f47418 = false;
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36678() {
        if (!this.f47421) {
            this.f47418 = true;
        }
        if (this.f47420 || m36675(0.0f)) {
            this.f47418 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36671() {
        m36670();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m36683() {
        return !this.f47421 || this.f47412 == 0.0f;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m36681() {
        return this.f47421;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36672(int i) {
        if (this.f47414 == null) {
            this.f47412 = 0.0f;
            return;
        }
        boolean zM36679 = m36679();
        C4044 c4044 = (C4044) this.f47414.getLayoutParams();
        int width = this.f47414.getWidth();
        if (zM36679) {
            i = (getWidth() - i) - width;
        }
        this.f47412 = (i - ((zM36679 ? getPaddingRight() : getPaddingLeft()) + (zM36679 ? ((ViewGroup.MarginLayoutParams) c4044).rightMargin : ((ViewGroup.MarginLayoutParams) c4044).leftMargin))) / this.f47408;
        View view = this.f47414;
        Iterator it = this.f47415.iterator();
        while (it.hasNext()) {
            ((InterfaceC12762) it.next()).mo29303(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1914 c1914M43586;
        C1914 c1914M43587;
        boolean zM36679 = m36679() ^ m36683();
        boolean z = f47407;
        C1388 c1388M51177 = null;
        C17466 c17466 = this.f47422;
        if (zM36679) {
            c17466.m39819(1);
            if (z && (c1914M43587 = C1717.m43586(this)) != null) {
                c1388M51177 = c1914M43587.m51177();
            }
            if (c1388M51177 != null) {
                c17466.m39814(Math.max(c17466.m39818(), c1388M51177.f36103));
            }
        } else {
            c17466.m39819(2);
            if (z && (c1914M43586 = C1717.m43586(this)) != null) {
                c1388M51177 = c1914M43586.m51177();
            }
            if (c1388M51177 != null) {
                c17466.m39814(Math.max(c17466.m39818(), c1388M51177.f36104));
            }
        }
        C4044 c4044 = (C4044) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f47421 && !c4044.f8891 && this.f47414 != null) {
            Rect rect = this.f47419;
            canvas.getClipBounds(rect);
            if (m36679()) {
                rect.left = Math.max(rect.left, this.f47414.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f47414.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36675(float f) {
        int paddingLeft;
        if (this.f47421) {
            boolean zM36679 = m36679();
            C4044 c4044 = (C4044) this.f47414.getLayoutParams();
            if (zM36679) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) c4044).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.f47408) + paddingRight) + this.f47414.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.f47408) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4044).leftMargin);
            }
            View view = this.f47414;
            if (this.f47422.m39811(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                int i2 = C1717.f57146;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C17466 c17466 = this.f47422;
        if (c17466.m39822()) {
            if (!this.f47421) {
                c17466.m39806();
            } else {
                int i = C1717.f57146;
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        m36679();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36680(View view) {
        if (view == null) {
            return false;
        }
        return this.f47421 && ((C4044) view.getLayoutParams()).f8890 && this.f47412 > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4044();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4044 c4044;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            c4044 = new C4044(layoutParams);
        } else {
            c4044 = new C4044((ViewGroup.MarginLayoutParams) layoutParams);
        }
        c4044.f8892 = 0.0f;
        return c4044;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4044) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4044(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C19467 c19467 = new C19467(super.onSaveInstanceState());
        c19467.f59328 = this.f47421 ? m36683() : this.f47418;
        c19467.f59329 = this.f47411;
        return c19467;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19467)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19467 c19467 = (C19467) parcelable;
        super.onRestoreInstanceState(c19467.getSuperState());
        if (!c19467.f59328) {
            m36670();
        } else {
            m36678();
        }
        this.f47418 = c19467.f59328;
        this.f47411 = c19467.f59329;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36679() {
        int i = C1717.f57146;
        return getLayoutDirection() == 1;
    }
}
