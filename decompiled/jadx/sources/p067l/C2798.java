package p067l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.֡ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes2.dex */
public class C2798 extends ViewGroup {

    /* JADX INFO: renamed from: ֡֫ */
    public C6152 f4744;

    /* JADX INFO: renamed from: ֨֫ */
    public ArrayList f4745;

    /* JADX INFO: renamed from: ֫֫ */
    public int f4746;

    /* JADX INFO: renamed from: ۖ֫ */
    public float f4747;

    /* JADX INFO: renamed from: ۗ */
    public int f4748;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f4749;

    /* JADX INFO: renamed from: ۘ֫ */
    public EdgeEffect f4750;

    /* JADX INFO: renamed from: ۙ */
    public boolean f4751;

    /* JADX INFO: renamed from: ۙ֫ */
    public Scroller f4752;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f4753;

    /* JADX INFO: renamed from: ۛ */
    public int f4754;

    /* JADX INFO: renamed from: ۛ֫ */
    public VelocityTracker f4755;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f4756;

    /* JADX INFO: renamed from: ۟ */
    public float f4757;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f4758;

    /* JADX INFO: renamed from: ۡ֫ */
    public float f4759;

    /* JADX INFO: renamed from: ۢ֫ */
    public final ArrayList f4760;

    /* JADX INFO: renamed from: ۤ */
    public int f4761;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f4762;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f4763;

    /* JADX INFO: renamed from: ۨ */
    public final Runnable f4764;

    /* JADX INFO: renamed from: ۫ */
    public int f4765;

    /* JADX INFO: renamed from: ۫֫ */
    public final Rect f4766;

    /* JADX INFO: renamed from: ۬ */
    public int f4767;

    /* JADX INFO: renamed from: ۬֫ */
    public final C22246 f4768;

    /* JADX INFO: renamed from: ܰ */
    public boolean f4769;

    /* JADX INFO: renamed from: ܳ֫ */
    public InterfaceC4811 f4770;

    /* JADX INFO: renamed from: ܶ֫ */
    public Parcelable f4771;

    /* JADX INFO: renamed from: ܺ֫ */
    public float f4772;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f4773;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f4774;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f4775;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f4776;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f4777;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f4778;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f4779;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f4780;

    /* JADX INFO: renamed from: ᩸ */
    public int f4781;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f4782;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC13787 f4783;

    /* JADX INFO: renamed from: ᩹֫ */
    public EdgeEffect f4784;

    /* JADX INFO: renamed from: ᩺ */
    public int f4785;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f4786;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final int[] f4743 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ۨ֫ */
    public static final Comparator f4741 = new C19563();

    /* JADX INFO: renamed from: ܰ֫ */
    public static final Interpolator f4742 = new InterpolatorC18892();

    public C2798(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4760 = new ArrayList();
        this.f4768 = new C22246();
        this.f4766 = new Rect();
        this.f4782 = -1;
        this.f4771 = null;
        this.f4757 = -3.4028235E38f;
        this.f4747 = Float.MAX_VALUE;
        this.f4753 = 1;
        this.f4781 = -1;
        this.f4769 = true;
        this.f4764 = new RunnableC16209(this);
        this.f4779 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f4752 = new Scroller(context2, f4742);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f4762 = viewConfiguration.getScaledPagingTouchSlop();
        this.f4777 = (int) (400.0f * f);
        this.f4776 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4750 = new EdgeEffect(context2);
        this.f4784 = new EdgeEffect(context2);
        this.f4746 = (int) (25.0f * f);
        this.f4767 = (int) (2.0f * f);
        this.f4754 = (int) (f * 16.0f);
        C1717.m43555(this, new C10846(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C1717.m43556(this, new C24927(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4764);
        Scroller scroller = this.f4752;
        if (scroller != null && !scroller.isFinished()) {
            this.f4752.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m4414(int i) {
        if (this.f4779 == i) {
            return;
        }
        this.f4779 = i;
        ArrayList arrayList = this.f4745;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4811 interfaceC4811 = (InterfaceC4811) this.f4745.get(i2);
                if (interfaceC4811 != null) {
                    interfaceC4811.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC4811 interfaceC4812 = this.f4770;
        if (interfaceC4812 != null) {
            interfaceC4812.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4406(AbstractC13787 abstractC13787) {
        ArrayList arrayList;
        AbstractC13787 abstractC13788 = this.f4783;
        if (abstractC13788 != null) {
            abstractC13788.m31440(null);
            this.f4783.mo15098(this);
            int i = 0;
            while (true) {
                arrayList = this.f4760;
                if (i >= arrayList.size()) {
                    break;
                }
                C22246 c22246 = (C22246) arrayList.get(i);
                this.f4783.mo13850(this, c22246.f70319, c22246.f70317);
                i++;
            }
            this.f4783.mo15096();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C11517) getChildAt(i2).getLayoutParams()).f32125) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f4765 = 0;
            scrollTo(0, 0);
        }
        AbstractC13787 abstractC13789 = this.f4783;
        this.f4783 = abstractC13787;
        this.f4785 = 0;
        if (abstractC13787 != null) {
            if (this.f4744 == null) {
                this.f4744 = new C6152(this);
            }
            this.f4783.m31440(this.f4744);
            this.f4758 = false;
            boolean z = this.f4769;
            this.f4769 = true;
            this.f4785 = this.f4783.mo13852();
            if (this.f4782 >= 0) {
                this.f4783.getClass();
                m4404(this.f4782, 0, false, true);
                this.f4782 = -1;
                this.f4771 = null;
            } else if (!z) {
                m4418();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f4778;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f4778.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC17550) this.f4778.get(i3)).onAdapterChanged(this, abstractC13789, abstractC13787);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13787 m4409() {
        return this.f4783;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4407(InterfaceC17550 interfaceC17550) {
        if (this.f4778 == null) {
            this.f4778 = new ArrayList();
        }
        this.f4778.add(interfaceC17550);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4412(InterfaceC17550 interfaceC17550) {
        ArrayList arrayList = this.f4778;
        if (arrayList != null) {
            arrayList.remove(interfaceC17550);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m4398() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4420(int i) {
        this.f4758 = false;
        m4404(i, 0, !this.f4769, false);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m4419(int i) {
        this.f4758 = false;
        m4404(i, 0, true, false);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m4415() {
        return this.f4765;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4404(int i, int i2, boolean z, boolean z2) {
        AbstractC13787 abstractC13787 = this.f4783;
        if (abstractC13787 == null || abstractC13787.mo13852() <= 0) {
            m4396(false);
            return;
        }
        ArrayList arrayList = this.f4760;
        if (!z2 && this.f4765 == i && arrayList.size() != 0) {
            m4396(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f4783.mo13852()) {
            i = this.f4783.mo13852() - 1;
        }
        int i3 = this.f4753;
        int i4 = this.f4765;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C22246) arrayList.get(i5)).f70321 = true;
            }
        }
        boolean z3 = this.f4765 != i;
        if (this.f4769) {
            this.f4765 = i;
            if (z3) {
                m4399(i);
            }
            requestLayout();
            return;
        }
        m4416(i);
        m4395(i, i2, z, z3);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m4395(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C22246 c22246M4410 = m4410(i);
        if (c22246M4410 != null) {
            iMax = (int) (Math.max(this.f4757, Math.min(c22246M4410.f70318, this.f4747)) * m4398());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m4399(i);
            }
            m4390(false);
            scrollTo(iMax, 0);
            m4394(iMax);
            return;
        }
        if (getChildCount() == 0) {
            m4396(false);
        } else {
            Scroller scroller = this.f4752;
            if (scroller != null && !scroller.isFinished()) {
                scrollX = this.f4756 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                m4396(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m4390(false);
                m4418();
                m4414(0);
            } else {
                m4396(true);
                m4414(2);
                int iM4398 = m4398();
                int i6 = iM4398 / 2;
                float f = iM4398;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f4783.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f4756 = false;
                this.f4752.startScroll(i3, scrollY, i4, i5, iMin);
                int i7 = C1717.f57146;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m4399(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4405(InterfaceC4811 interfaceC4811) {
        if (this.f4745 == null) {
            this.f4745 = new ArrayList();
        }
        this.f4745.add(interfaceC4811);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4411(InterfaceC4811 interfaceC4811) {
        ArrayList arrayList = this.f4745;
        if (arrayList != null) {
            arrayList.remove(interfaceC4811);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4417(InterfaceC4811 interfaceC4811) {
        this.f4770 = interfaceC4811;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m4413() {
        if (3 != this.f4753) {
            this.f4753 = 3;
            m4418();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22246 m4400(int i, int i2) {
        C22246 c22246 = new C22246();
        c22246.f70319 = i;
        c22246.f70317 = this.f4783.mo13849(this, i);
        this.f4783.getClass();
        c22246.f70320 = 1.0f;
        ArrayList arrayList = this.f4760;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c22246);
            return c22246;
        }
        arrayList.add(i2, c22246);
        return c22246;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4402() {
        int iMo13852 = this.f4783.mo13852();
        this.f4785 = iMo13852;
        ArrayList arrayList = this.f4760;
        boolean z = arrayList.size() < (this.f4753 * 2) + 1 && arrayList.size() < iMo13852;
        int i = this.f4765;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C22246 c22246 = (C22246) arrayList.get(i2);
            AbstractC13787 abstractC13787 = this.f4783;
            Object obj = c22246.f70317;
            abstractC13787.getClass();
        }
        Collections.sort(arrayList, f4741);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C11517 c11517 = (C11517) getChildAt(i3).getLayoutParams();
                if (!c11517.f32125) {
                    c11517.f32127 = 0.0f;
                }
            }
            m4404(i, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m4418() {
        m4416(this.f4765);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e9 A[PHI: r6 r9 r15
      0x00e9: PHI (r6v20 int) = (r6v19 int), (r6v8 int), (r6v23 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r9v6 int) = (r9v1 int), (r9v5 int), (r9v9 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v2 float) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0170 A[PHI: r4 r13
      0x0170: PHI (r4v11 float) = (r4v9 float), (r4v10 float), (r4v8 float) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v37 int) = (r13v35 int), (r13v36 int), (r13v34 int) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public final void m4416(int i) {
        C22246 c22246M4410;
        String hexString;
        ArrayList arrayList;
        C22246 c22246M4400;
        float f;
        C22246 c22246M4401;
        C22246 c22246M4402;
        float paddingLeft;
        int i2;
        int i3;
        C22246 c22246;
        C22246 c22247;
        C22246 c22248;
        int i4 = this.f4765;
        if (i4 != i) {
            c22246M4410 = m4410(i4);
            this.f4765 = i;
        } else {
            c22246M4410 = null;
        }
        if (this.f4783 == null || this.f4758 || getWindowToken() == null) {
            return;
        }
        this.f4783.mo15098(this);
        int i5 = this.f4753;
        int i6 = 0;
        int iMax = Math.max(0, this.f4765 - i5);
        int iMo13852 = this.f4783.mo13852();
        int iMin = Math.min(iMo13852 - 1, this.f4765 + i5);
        if (iMo13852 != this.f4785) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            C7913.m18269(sb, this.f4785, ", found: ", iMo13852, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.f4783.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.f4760;
            if (i7 < arrayList.size()) {
                c22246M4400 = (C22246) arrayList.get(i7);
                int i8 = c22246M4400.f70319;
                int i9 = this.f4765;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            c22246M4400 = null;
            break;
        }
        if (c22246M4400 == null && iMo13852 > 0) {
            c22246M4400 = m4400(this.f4765, i7);
        }
        if (c22246M4400 != null) {
            int i10 = i7 - 1;
            C22246 c22249 = i10 >= 0 ? (C22246) arrayList.get(i10) : null;
            int iM4398 = m4398();
            if (iM4398 <= 0) {
                f = 0.0f;
                paddingLeft = 0.0f;
            } else {
                paddingLeft = (getPaddingLeft() / iM4398) + (2.0f - c22246M4400.f70320);
                f = 0.0f;
            }
            float f2 = 0.0f;
            for (int i11 = this.f4765 - 1; i11 >= 0; i11--) {
                if (f2 < paddingLeft || i11 >= iMax) {
                    if (c22249 == null || i11 != c22249.f70319) {
                        f2 += m4400(i11, i10 + 1).f70320;
                        i7++;
                        if (i10 >= 0) {
                            c22248 = (C22246) arrayList.get(i10);
                        } else {
                            c22248 = null;
                        }
                    } else {
                        f2 += c22249.f70320;
                        i10--;
                        if (i10 >= 0) {
                            c22248 = (C22246) arrayList.get(i10);
                        } else {
                            c22248 = null;
                        }
                    }
                    c22249 = c22248;
                } else {
                    if (c22249 == null) {
                        break;
                    }
                    if (i11 == c22249.f70319 && !c22249.f70321) {
                        arrayList.remove(i10);
                        this.f4783.mo13850(this, i11, c22249.f70317);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            c22248 = (C22246) arrayList.get(i10);
                        } else {
                            c22248 = null;
                        }
                        c22249 = c22248;
                    }
                }
            }
            float f3 = c22246M4400.f70320;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                C22246 c222410 = i12 < arrayList.size() ? (C22246) arrayList.get(i12) : null;
                float paddingRight = iM4398 <= 0 ? 0.0f : 2.0f + (getPaddingRight() / iM4398);
                int i13 = i12;
                for (int i14 = this.f4765 + 1; i14 < iMo13852; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (c222410 == null) {
                            break;
                        }
                        if (i14 == c222410.f70319 && !c222410.f70321) {
                            arrayList.remove(i13);
                            this.f4783.mo13850(this, i14, c222410.f70317);
                            if (i13 < arrayList.size()) {
                                c222410 = (C22246) arrayList.get(i13);
                            } else {
                                c222410 = null;
                            }
                        }
                    } else if (c222410 == null || i14 != c222410.f70319) {
                        C22246 c22246M4403 = m4400(i14, i13);
                        i13++;
                        f3 += c22246M4403.f70320;
                        if (i13 < arrayList.size()) {
                            c222410 = (C22246) arrayList.get(i13);
                        } else {
                            c222410 = null;
                        }
                    } else {
                        f3 += c222410.f70320;
                        i13++;
                        if (i13 < arrayList.size()) {
                            c222410 = (C22246) arrayList.get(i13);
                        } else {
                            c222410 = null;
                        }
                    }
                }
            }
            int iMo13853 = this.f4783.mo13852();
            int iM4399 = m4398();
            i6 = 0;
            float f4 = iM4399 > 0 ? 0 / iM4399 : 0.0f;
            if (c22246M4410 != null) {
                int i15 = c22246M4410.f70319;
                int i16 = c22246M4400.f70319;
                if (i15 < i16) {
                    float f5 = c22246M4410.f70318 + c22246M4410.f70320 + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= c22246M4400.f70319 && i18 < arrayList.size()) {
                        Object obj = arrayList.get(i18);
                        while (true) {
                            c22247 = (C22246) obj;
                            if (i17 <= c22247.f70319 || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            obj = arrayList.get(i18);
                        }
                        while (i17 < c22247.f70319) {
                            this.f4783.getClass();
                            f5 += 1.0f + f4;
                            i17++;
                        }
                        c22247.f70318 = f5;
                        f5 += c22247.f70320 + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f6 = c22246M4410.f70318;
                    while (true) {
                        i15--;
                        if (i15 < c22246M4400.f70319 || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            c22246 = (C22246) obj2;
                            if (i15 >= c22246.f70319 || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i15 > c22246.f70319) {
                            this.f4783.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= c22246.f70320 + f4;
                        c22246.f70318 = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = c22246M4400.f70318;
            int i19 = c22246M4400.f70319;
            int i20 = i19 - 1;
            this.f4757 = i19 == 0 ? f7 : -3.4028235E38f;
            int i21 = iMo13853 - 1;
            this.f4747 = i19 == i21 ? (c22246M4400.f70320 + f7) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                C22246 c222411 = (C22246) arrayList.get(i22);
                while (true) {
                    i3 = c222411.f70319;
                    if (i20 <= i3) {
                        break;
                    }
                    i20--;
                    this.f4783.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c222411.f70320 + f4;
                c222411.f70318 = f7;
                if (i3 == 0) {
                    this.f4757 = f7;
                }
                i22--;
                i20--;
            }
            float f8 = c22246M4400.f70318 + c22246M4400.f70320 + f4;
            int i23 = c22246M4400.f70319;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                C22246 c222412 = (C22246) arrayList.get(i12);
                while (true) {
                    i2 = c222412.f70319;
                    if (i23 >= i2) {
                        break;
                    }
                    i23++;
                    this.f4783.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i21) {
                    this.f4747 = (c222412.f70320 + f8) - 1.0f;
                }
                c222412.f70318 = f8;
                f8 += c222412.f70320 + f4;
                i12++;
            }
            this.f4783.mo15097(c22246M4400.f70317);
        } else {
            f = 0.0f;
        }
        this.f4783.mo15096();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            C11517 c11517 = (C11517) childAt.getLayoutParams();
            c11517.getClass();
            if (!c11517.f32125 && c11517.f32127 == f && (c22246M4402 = m4401(childAt)) != null) {
                c11517.f32127 = c22246M4402.f70320;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c22246M4401 = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c22246M4401 = m4401(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c22246M4401 = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c22246M4401 == null || c22246M4401.f70319 != this.f4765) {
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    C22246 c22246M4404 = m4401(childAt2);
                    if (c22246M4404 != null && c22246M4404.f70319 == this.f4765 && childAt2.requestFocus(2)) {
                        return;
                    } else {
                        i6++;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C20905 c20905 = new C20905(super.onSaveInstanceState());
        c20905.f65652 = this.f4765;
        if (this.f4783 != null) {
            c20905.f65653 = null;
        }
        return c20905;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C20905)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C20905 c20905 = (C20905) parcelable;
        super.onRestoreInstanceState(c20905.getSuperState());
        if (this.f4783 != null) {
            m4404(c20905.f65652, 0, false, true);
        } else {
            this.f4782 = c20905.f65652;
            this.f4771 = c20905.f65653;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C11517();
        }
        C11517 c11517 = (C11517) layoutParams;
        boolean z = c11517.f32125 | (view.getClass().getAnnotation(InterfaceC8834.class) != null);
        c11517.f32125 = z;
        if (!this.f4773) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c11517.f32126 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4773) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22246 m4401(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4760;
            if (i >= arrayList.size()) {
                return null;
            }
            C22246 c22246 = (C22246) arrayList.get(i);
            if (this.f4783.mo13851(view, c22246.f70317)) {
                return c22246;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22246 m4410(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4760;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C22246 c22246 = (C22246) arrayList.get(i2);
            if (c22246.f70319 == i) {
                return c22246;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4769 = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af A[SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C11517 c11517;
        C11517 c11518;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f4763 = Math.min(measuredWidth / 10, this.f4754);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c11518 = (C11517) childAt.getLayoutParams()) != null && c11518.f32125) {
                int i8 = c11518.f32124;
                int i9 = i8 & 7;
                int i10 = i8 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                    i4 = ((ViewGroup.LayoutParams) c11518).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c11518).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = ((ViewGroup.LayoutParams) c11518).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c11518).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f4748 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4773 = true;
        m4418();
        this.f4773 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c11517 = (C11517) childAt2.getLayoutParams()) == null || !c11517.f32125)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c11517.f32127), 1073741824), this.f4748);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.f4760.isEmpty()) {
                if (!this.f4752.isFinished()) {
                    this.f4752.setFinalX(this.f4765 * m4398());
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                    return;
                }
            }
            C22246 c22246M4410 = m4410(this.f4765);
            int iMin = (int) ((c22246M4410 != null ? Math.min(c22246M4410.f70318, this.f4747) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m4390(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C22246 c22246M4401;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C11517 c11517 = (C11517) childAt.getLayoutParams();
                if (c11517.f32125) {
                    int i9 = c11517.f32124;
                    int i10 = i9 & 7;
                    int i11 = i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 == 1) {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        } else {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C11517 c11518 = (C11517) childAt2.getLayoutParams();
                if (!c11518.f32125 && (c22246M4401 = m4401(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c22246M4401.f70318 * f)) + paddingLeft;
                    if (c11518.f32126) {
                        c11518.f32126 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c11518.f32127), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f4761 = i7;
        if (this.f4769) {
            z2 = false;
            m4395(this.f4765, 0, false, false);
        } else {
            z2 = false;
        }
        this.f4769 = z2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f4756 = true;
        Scroller scroller = this.f4752;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m4394(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            int i = C1717.f57146;
            postInvalidateOnAnimation();
            return;
        }
        m4390(true);
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m4394(int i) {
        if (this.f4760.size() == 0) {
            if (!this.f4769) {
                this.f4751 = false;
                m4403(0, 0.0f, 0);
                if (!this.f4751) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C22246 c22246M4393 = m4393();
        float fM4398 = m4398();
        int i2 = c22246M4393.f70319;
        float f = ((i / fM4398) - c22246M4393.f70318) / (c22246M4393.f70320 + (0 / fM4398));
        this.f4751 = false;
        m4403(i2, f, (int) (fM4398 * f));
        if (this.f4751) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: ֫ */
    public final void m4403(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f4761 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C11517 c11517 = (C11517) childAt.getLayoutParams();
                if (c11517.f32125) {
                    int i4 = c11517.f32124 & 7;
                    if (i4 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        ArrayList arrayList = this.f4745;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC4811 interfaceC4811 = (InterfaceC4811) this.f4745.get(i6);
                if (interfaceC4811 != null) {
                    interfaceC4811.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC4811 interfaceC4812 = this.f4770;
        if (interfaceC4812 != null) {
            interfaceC4812.onPageScrolled(i, f, i2);
        }
        this.f4751 = true;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m4399(int i) {
        ArrayList arrayList = this.f4745;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4811 interfaceC4811 = (InterfaceC4811) this.f4745.get(i2);
                if (interfaceC4811 != null) {
                    interfaceC4811.onPageSelected(i);
                }
            }
        }
        InterfaceC4811 interfaceC4812 = this.f4770;
        if (interfaceC4812 != null) {
            interfaceC4812.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4390(boolean z) {
        boolean z2 = this.f4779 == 2;
        if (z2) {
            m4396(false);
            Scroller scroller = this.f4752;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4394(currX);
                    }
                }
            }
        }
        this.f4758 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4760;
            if (i >= arrayList.size()) {
                break;
            }
            C22246 c22246 = (C22246) arrayList.get(i);
            if (c22246.f70321) {
                c22246.f70321 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.f4764;
            if (z) {
                int i2 = C1717.f57146;
                postOnAnimation(runnable);
            } else {
                ((RunnableC16209) runnable).run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m4397();
            return false;
        }
        if (action != 0) {
            if (this.f4786) {
                return true;
            }
            if (this.f4780) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f4775 = x;
            this.f4759 = x;
            float y = motionEvent.getY();
            this.f4774 = y;
            this.f4772 = y;
            this.f4781 = motionEvent.getPointerId(0);
            this.f4780 = false;
            this.f4756 = true;
            Scroller scroller = this.f4752;
            scroller.computeScrollOffset();
            if (this.f4779 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f4767) {
                scroller.abortAnimation();
                this.f4758 = false;
                m4418();
                this.f4786 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m4414(1);
            } else {
                m4390(false);
                this.f4786 = false;
            }
        } else if (action == 2) {
            int i = this.f4781;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f4759;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f4774);
                if (f != 0.0f) {
                    float f2 = this.f4759;
                    if ((f2 >= this.f4763 || f <= 0.0f) && ((f2 <= getWidth() - this.f4763 || f >= 0.0f) && m4392((int) f, (int) x2, (int) y2, this, false))) {
                        this.f4759 = x2;
                        this.f4772 = y2;
                        this.f4780 = true;
                        return false;
                    }
                }
                int i2 = this.f4762;
                float f3 = i2;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f4786 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m4414(1);
                    float f4 = this.f4775;
                    float f5 = i2;
                    this.f4759 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f4772 = y2;
                    m4396(true);
                } else if (fAbs2 > f3) {
                    this.f4780 = true;
                }
                if (this.f4786 && m4391(x2)) {
                    int i3 = C1717.f57146;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m4389(motionEvent);
        }
        if (this.f4755 == null) {
            this.f4755 = VelocityTracker.obtain();
        }
        this.f4755.addMovement(motionEvent);
        return this.f4786;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC13787 abstractC13787;
        boolean zM4397 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC13787 = this.f4783) == null || abstractC13787.mo13852() == 0) {
            return false;
        }
        if (this.f4755 == null) {
            this.f4755 = VelocityTracker.obtain();
        }
        this.f4755.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f4752.abortAnimation();
            this.f4758 = false;
            m4418();
            float x = motionEvent.getX();
            this.f4775 = x;
            this.f4759 = x;
            float y = motionEvent.getY();
            this.f4774 = y;
            this.f4772 = y;
            this.f4781 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f4759 = motionEvent.getX(actionIndex);
                        this.f4781 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m4389(motionEvent);
                        this.f4759 = motionEvent.getX(motionEvent.findPointerIndex(this.f4781));
                    }
                } else if (this.f4786) {
                    m4395(this.f4765, 0, true, false);
                    zM4397 = m4397();
                }
            } else if (!this.f4786) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4781);
                if (iFindPointerIndex == -1) {
                    zM4397 = m4397();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f4759);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f4772);
                    int i = this.f4762;
                    if (fAbs > i && fAbs > fAbs2) {
                        this.f4786 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f4775;
                        this.f4759 = x2 - f > 0.0f ? f + i : f - i;
                        this.f4772 = y2;
                        m4414(1);
                        m4396(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f4786) {
                        zM4397 = m4391(motionEvent.getX(motionEvent.findPointerIndex(this.f4781)));
                    }
                }
            } else if (this.f4786) {
                zM4397 = m4391(motionEvent.getX(motionEvent.findPointerIndex(this.f4781)));
            }
        } else if (this.f4786) {
            VelocityTracker velocityTracker = this.f4755;
            velocityTracker.computeCurrentVelocity(1000, this.f4776);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f4781);
            this.f4758 = true;
            int iM4398 = m4398();
            int scrollX = getScrollX();
            C22246 c22246M4393 = m4393();
            float f2 = iM4398;
            int iMax = c22246M4393.f70319;
            float f3 = ((scrollX / f2) - c22246M4393.f70318) / (c22246M4393.f70320 + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4781)) - this.f4775)) <= this.f4746 || Math.abs(xVelocity) <= this.f4777) {
                iMax += (int) (f3 + (iMax >= this.f4765 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f4760;
            if (arrayList.size() > 0) {
                iMax = Math.max(((C22246) arrayList.get(0)).f70319, Math.min(iMax, ((C22246) C20013.m45383(arrayList, 1)).f70319));
            }
            m4404(iMax, xVelocity, true, true);
            zM4397 = m4397();
        }
        if (zM4397) {
            int i2 = C1717.f57146;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m4397() {
        this.f4781 = -1;
        this.f4786 = false;
        this.f4780 = false;
        VelocityTracker velocityTracker = this.f4755;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4755 = null;
        }
        this.f4750.onRelease();
        this.f4784.onRelease();
        return this.f4750.isFinished() || this.f4784.isFinished();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m4391(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f4759 - f;
        this.f4759 = f;
        float scrollX = getScrollX() + f2;
        float fM4398 = m4398();
        float f3 = this.f4757 * fM4398;
        float f4 = this.f4747 * fM4398;
        ArrayList arrayList = this.f4760;
        boolean z3 = false;
        C22246 c22246 = (C22246) arrayList.get(0);
        C22246 c22247 = (C22246) C20013.m45383(arrayList, 1);
        if (c22246.f70319 != 0) {
            f3 = c22246.f70318 * fM4398;
            z = false;
        } else {
            z = true;
        }
        if (c22247.f70319 != this.f4783.mo13852() - 1) {
            f4 = c22247.f70318 * fM4398;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f4750.onPull(Math.abs(f3 - scrollX) / fM4398);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f4784.onPull(Math.abs(scrollX - f4) / fM4398);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f4759 = (scrollX - i) + this.f4759;
        scrollTo(i, getScrollY());
        m4394(i);
        return z3;
    }

    /* JADX INFO: renamed from: ۜ */
    private C22246 m4393() {
        C22246 c22246;
        int i;
        int iM4398 = m4398();
        float f = 0.0f;
        float scrollX = iM4398 > 0 ? getScrollX() / iM4398 : 0.0f;
        float f2 = iM4398 > 0 ? 0 / iM4398 : 0.0f;
        int i2 = -1;
        C22246 c22247 = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.f4760;
            if (i3 >= arrayList.size()) {
                break;
            }
            C22246 c22248 = (C22246) arrayList.get(i3);
            if (z || c22248.f70319 == (i = i2 + 1)) {
                c22246 = c22248;
            } else {
                float f4 = f + f3 + f2;
                c22246 = this.f4768;
                c22246.f70318 = f4;
                c22246.f70319 = i;
                this.f4783.getClass();
                c22246.f70320 = 1.0f;
                i3--;
            }
            f = c22246.f70318;
            float f5 = c22246.f70320 + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i3 == arrayList.size() - 1) {
                return c22246;
            }
            i2 = c22246.f70319;
            i3++;
            z = false;
            C22246 c22249 = c22246;
            f3 = c22246.f70320;
            c22247 = c22249;
        }
        return c22247;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC13787 abstractC13787;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f4784;
        EdgeEffect edgeEffect2 = this.f4750;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC13787 = this.f4783) != null && abstractC13787.mo13852() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f4757 * width);
                edgeEffect2.setSize(height, width);
                boolean zDraw2 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
                zDraw = zDraw2;
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4747 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4389(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4781) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4759 = motionEvent.getX(i);
            this.f4781 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4755;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m4396(boolean z) {
        if (this.f4749 != z) {
            this.f4749 = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f4783 == null) {
            return false;
        }
        int iM4398 = m4398();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) iM4398) * this.f4757));
        }
        return i > 0 && scrollX < ((int) (((float) iM4398) * this.f4747));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4392(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !m4392(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM4408;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM4408 = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zM4408 = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zM4408 = m4408(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM4408 = m4408(1);
                        } else {
                            zM4408 = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zM4408 = m4421();
                    } else {
                        zM4408 = m4408(66);
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    zM4408 = m4408(17);
                } else {
                    int i = this.f4765;
                    if (i > 0) {
                        m4419(i - 1);
                        zM4408 = true;
                    } else {
                        zM4408 = false;
                    }
                }
            }
            if (!zM4408) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[PHI: r0
      0x0088: PHI (r0v5 int) = (r0v3 int), (r0v11 int) binds: [B:44:0x0086, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m4408(int i) {
        int i2;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean z = true;
        boolean zM4421 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f4766;
            if (i == 17) {
                int i3 = m4388(rect, viewFindNextFocus).left;
                int i4 = m4388(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    i2 = this.f4765;
                    if (i2 > 0) {
                        m4419(i2 - 1);
                    } else {
                        z = false;
                    }
                    zM4421 = z;
                }
            } else if (i == 66) {
                int i5 = m4388(rect, viewFindNextFocus).left;
                int i6 = m4388(rect, viewFindFocus).left;
                if (viewFindFocus != null && i5 <= i6) {
                    zRequestFocus = m4421();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
            zM4421 = zRequestFocus;
        } else if (i == 17 || i == 1) {
            i2 = this.f4765;
            if (i2 > 0) {
                m4419(i2 - 1);
            } else {
                z = false;
            }
            zM4421 = z;
        } else if (i == 66 || i == 2) {
            zM4421 = m4421();
        }
        if (zM4421) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM4421;
    }

    /* JADX INFO: renamed from: ֫ */
    private Rect m4388(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m4421() {
        AbstractC13787 abstractC13787 = this.f4783;
        if (abstractC13787 == null || this.f4765 >= abstractC13787.mo13852() - 1) {
            return false;
        }
        m4419(this.f4765 + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C22246 c22246M4401;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c22246M4401 = m4401(childAt)) != null && c22246M4401.f70319 == this.f4765) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C22246 c22246M4401;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c22246M4401 = m4401(childAt)) != null && c22246M4401.f70319 == this.f4765) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C22246 c22246M4401;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c22246M4401 = m4401(childAt)) != null && c22246M4401.f70319 == this.f4765 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C22246 c22246M4401;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c22246M4401 = m4401(childAt)) != null && c22246M4401.f70319 == this.f4765 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C11517();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C11517();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C11517) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C11517(getContext(), attributeSet);
    }
}
