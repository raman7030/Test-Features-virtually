package l;

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
public class C0452 extends ViewGroup {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C3981 f1968;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public ArrayList f1969;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f1970;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f1971;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f1972;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f1973;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f1974;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1975;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public Scroller f1976;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f1977;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1978;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f1979;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f1980;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f1981;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f1982;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f1983;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f1984;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1985;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f1986;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f1987;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f1988;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f1989;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Rect f1990;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1991;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C20915 f1992;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1993;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2570 f1994;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public Parcelable f1995;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f1996;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f1997;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f1998;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f1999;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f2000;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f2001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f2002;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f2003;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f2004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2005;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f2006;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC12014 f2007;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f2008;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f2009;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f2010;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final int[] f1967 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final Comparator f1965 = new C18092();

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final Interpolator f1966 = new InterpolatorC17386();

    public C0452(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1984 = new ArrayList();
        this.f1992 = new C20915();
        this.f1990 = new Rect();
        this.f2006 = -1;
        this.f1995 = null;
        this.f1981 = -3.4028235E38f;
        this.f1971 = Float.MAX_VALUE;
        this.f1977 = 1;
        this.f2005 = -1;
        this.f1993 = true;
        this.f1988 = new RunnableC14563(this);
        this.f2003 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1976 = new Scroller(context2, f1966);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f1986 = viewConfiguration.getScaledPagingTouchSlop();
        this.f2001 = (int) (400.0f * f);
        this.f2000 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1974 = new EdgeEffect(context2);
        this.f2008 = new EdgeEffect(context2);
        this.f1970 = (int) (25.0f * f);
        this.f1991 = (int) (2.0f * f);
        this.f1978 = (int) (f * 16.0f);
        C17648.m41309(this, new C8920(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C17648.m41310(this, new C23736(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1988);
        Scroller scroller = this.f1976;
        if (scroller != null && !scroller.isFinished()) {
            this.f1976.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2037(int i) {
        if (this.f2003 == i) {
            return;
        }
        this.f2003 = i;
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2570 interfaceC2570 = (InterfaceC2570) this.f1969.get(i2);
                if (interfaceC2570 != null) {
                    interfaceC2570.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC2570 interfaceC2571 = this.f1994;
        if (interfaceC2571 != null) {
            interfaceC2571.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2029(AbstractC12014 abstractC12014) {
        ArrayList arrayList;
        AbstractC12014 abstractC12015 = this.f2007;
        if (abstractC12015 != null) {
            abstractC12015.m29380(null);
            this.f2007.mo13216(this);
            int i = 0;
            while (true) {
                arrayList = this.f1984;
                if (i >= arrayList.size()) {
                    break;
                }
                C20915 c20915 = (C20915) arrayList.get(i);
                this.f2007.mo11914(this, c20915.f67634, c20915.f67632);
                i++;
            }
            this.f2007.mo13214();
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C9626) getChildAt(i2).getLayoutParams()).f29177) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f1989 = 0;
            scrollTo(0, 0);
        }
        AbstractC12014 abstractC12016 = this.f2007;
        this.f2007 = abstractC12014;
        this.f2009 = 0;
        if (abstractC12014 != null) {
            if (this.f1968 == null) {
                this.f1968 = new C3981(this);
            }
            this.f2007.m29380(this.f1968);
            this.f1982 = false;
            boolean z = this.f1993;
            this.f1993 = true;
            this.f2009 = this.f2007.mo11916();
            if (this.f2006 >= 0) {
                this.f2007.getClass();
                m2027(this.f2006, 0, false, true);
                this.f2006 = -1;
                this.f1995 = null;
            } else if (!z) {
                m2041();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f2002;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f2002.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC15974) this.f2002.get(i3)).onAdapterChanged(this, abstractC12016, abstractC12014);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12014 m2032() {
        return this.f2007;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2030(InterfaceC15974 interfaceC15974) {
        if (this.f2002 == null) {
            this.f2002 = new ArrayList();
        }
        this.f2002.add(interfaceC15974);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2035(InterfaceC15974 interfaceC15974) {
        ArrayList arrayList = this.f2002;
        if (arrayList != null) {
            arrayList.remove(interfaceC15974);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m2021() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2043(int i) {
        this.f1982 = false;
        m2027(i, 0, !this.f1993, false);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2042(int i) {
        this.f1982 = false;
        m2027(i, 0, true, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m2038() {
        return this.f1989;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2027(int i, int i2, boolean z, boolean z2) {
        AbstractC12014 abstractC12014 = this.f2007;
        if (abstractC12014 == null || abstractC12014.mo11916() <= 0) {
            m2019(false);
            return;
        }
        ArrayList arrayList = this.f1984;
        if (!z2 && this.f1989 == i && arrayList.size() != 0) {
            m2019(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f2007.mo11916()) {
            i = this.f2007.mo11916() - 1;
        }
        int i3 = this.f1977;
        int i4 = this.f1989;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((C20915) arrayList.get(i5)).f67636 = true;
            }
        }
        boolean z3 = this.f1989 != i;
        if (this.f1993) {
            this.f1989 = i;
            if (z3) {
                m2022(i);
            }
            requestLayout();
            return;
        }
        m2039(i);
        m2018(i, i2, z, z3);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m2018(int i, int i2, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        C20915 c20915M2033 = m2033(i);
        if (c20915M2033 != null) {
            iMax = (int) (Math.max(this.f1981, Math.min(c20915M2033.f67633, this.f1971)) * m2021());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                m2022(i);
            }
            m2013(false);
            scrollTo(iMax, 0);
            m2017(iMax);
            return;
        }
        if (getChildCount() == 0) {
            m2019(false);
        } else {
            Scroller scroller = this.f1976;
            if (scroller != null && !scroller.isFinished()) {
                scrollX = this.f1980 ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                m2019(false);
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                m2013(false);
                m2041();
                m2037(0);
            } else {
                m2019(true);
                m2037(2);
                int iM2021 = m2021();
                int i6 = iM2021 / 2;
                float f = iM2021;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f2007.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + 0)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f1980 = false;
                this.f1976.startScroll(i3, scrollY, i4, i5, iMin);
                int i7 = C17648.f53953;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            m2022(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2028(InterfaceC2570 interfaceC2570) {
        if (this.f1969 == null) {
            this.f1969 = new ArrayList();
        }
        this.f1969.add(interfaceC2570);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2034(InterfaceC2570 interfaceC2570) {
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            arrayList.remove(interfaceC2570);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2040(InterfaceC2570 interfaceC2570) {
        this.f1994 = interfaceC2570;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2036() {
        if (3 != this.f1977) {
            this.f1977 = 3;
            m2041();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20915 m2023(int i, int i2) {
        C20915 c20915 = new C20915();
        c20915.f67634 = i;
        c20915.f67632 = this.f2007.mo11913(this, i);
        this.f2007.getClass();
        c20915.f67635 = 1.0f;
        ArrayList arrayList = this.f1984;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(c20915);
            return c20915;
        }
        arrayList.add(i2, c20915);
        return c20915;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2025() {
        int iMo11916 = this.f2007.mo11916();
        this.f2009 = iMo11916;
        ArrayList arrayList = this.f1984;
        boolean z = arrayList.size() < (this.f1977 * 2) + 1 && arrayList.size() < iMo11916;
        int i = this.f1989;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C20915 c20915 = (C20915) arrayList.get(i2);
            AbstractC12014 abstractC12014 = this.f2007;
            Object obj = c20915.f67632;
            abstractC12014.getClass();
        }
        Collections.sort(arrayList, f1965);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C9626 c9626 = (C9626) getChildAt(i3).getLayoutParams();
                if (!c9626.f29177) {
                    c9626.f29179 = 0.0f;
                }
            }
            m2027(i, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2041() {
        m2039(this.f1989);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e9 A[PHI: r6 r9 r15
      0x00e9: PHI (r6v20 int) = (r6v19 int), (r6v8 int), (r6v23 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r9v6 int) = (r9v1 int), (r9v5 int), (r9v9 int) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v2 float) binds: [B:59:0x00e0, B:56:0x00cc, B:50:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0170 A[PHI: r4 r13
      0x0170: PHI (r4v11 float) = (r4v9 float), (r4v10 float), (r4v8 float) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r13v37 int) = (r13v35 int), (r13v36 int), (r13v34 int) binds: [B:94:0x0167, B:91:0x0151, B:85:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2039(int i) {
        C20915 c20915M2033;
        String hexString;
        ArrayList arrayList;
        C20915 c20915M2023;
        float f;
        C20915 c20915M2024;
        C20915 c20915M2025;
        float paddingLeft;
        int i2;
        int i3;
        C20915 c20915;
        C20915 c20916;
        C20915 c20917;
        int i4 = this.f1989;
        if (i4 != i) {
            c20915M2033 = m2033(i4);
            this.f1989 = i;
        } else {
            c20915M2033 = null;
        }
        if (this.f2007 == null || this.f1982 || getWindowToken() == null) {
            return;
        }
        this.f2007.mo13216(this);
        int i5 = this.f1977;
        int i6 = 0;
        int iMax = Math.max(0, this.f1989 - i5);
        int iMo11916 = this.f2007.mo11916();
        int iMin = Math.min(iMo11916 - 1, this.f1989 + i5);
        if (iMo11916 != this.f2009) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            C5834.m16344(sb, this.f2009, ", found: ", iMo11916, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.f2007.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.f1984;
            if (i7 < arrayList.size()) {
                c20915M2023 = (C20915) arrayList.get(i7);
                int i8 = c20915M2023.f67634;
                int i9 = this.f1989;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            c20915M2023 = null;
            break;
        }
        if (c20915M2023 == null && iMo11916 > 0) {
            c20915M2023 = m2023(this.f1989, i7);
        }
        if (c20915M2023 != null) {
            int i10 = i7 - 1;
            C20915 c20918 = i10 >= 0 ? (C20915) arrayList.get(i10) : null;
            int iM2021 = m2021();
            if (iM2021 <= 0) {
                f = 0.0f;
                paddingLeft = 0.0f;
            } else {
                paddingLeft = (getPaddingLeft() / iM2021) + (2.0f - c20915M2023.f67635);
                f = 0.0f;
            }
            float f2 = 0.0f;
            for (int i11 = this.f1989 - 1; i11 >= 0; i11--) {
                if (f2 < paddingLeft || i11 >= iMax) {
                    if (c20918 == null || i11 != c20918.f67634) {
                        f2 += m2023(i11, i10 + 1).f67635;
                        i7++;
                        if (i10 >= 0) {
                            c20917 = (C20915) arrayList.get(i10);
                        } else {
                            c20917 = null;
                        }
                    } else {
                        f2 += c20918.f67635;
                        i10--;
                        if (i10 >= 0) {
                            c20917 = (C20915) arrayList.get(i10);
                        } else {
                            c20917 = null;
                        }
                    }
                    c20918 = c20917;
                } else {
                    if (c20918 == null) {
                        break;
                    }
                    if (i11 == c20918.f67634 && !c20918.f67636) {
                        arrayList.remove(i10);
                        this.f2007.mo11914(this, i11, c20918.f67632);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            c20917 = (C20915) arrayList.get(i10);
                        } else {
                            c20917 = null;
                        }
                        c20918 = c20917;
                    }
                }
            }
            float f3 = c20915M2023.f67635;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                C20915 c20919 = i12 < arrayList.size() ? (C20915) arrayList.get(i12) : null;
                float paddingRight = iM2021 <= 0 ? 0.0f : 2.0f + (getPaddingRight() / iM2021);
                int i13 = i12;
                for (int i14 = this.f1989 + 1; i14 < iMo11916; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (c20919 == null) {
                            break;
                        }
                        if (i14 == c20919.f67634 && !c20919.f67636) {
                            arrayList.remove(i13);
                            this.f2007.mo11914(this, i14, c20919.f67632);
                            if (i13 < arrayList.size()) {
                                c20919 = (C20915) arrayList.get(i13);
                            } else {
                                c20919 = null;
                            }
                        }
                    } else if (c20919 == null || i14 != c20919.f67634) {
                        C20915 c20915M2026 = m2023(i14, i13);
                        i13++;
                        f3 += c20915M2026.f67635;
                        if (i13 < arrayList.size()) {
                            c20919 = (C20915) arrayList.get(i13);
                        } else {
                            c20919 = null;
                        }
                    } else {
                        f3 += c20919.f67635;
                        i13++;
                        if (i13 < arrayList.size()) {
                            c20919 = (C20915) arrayList.get(i13);
                        } else {
                            c20919 = null;
                        }
                    }
                }
            }
            int iMo11917 = this.f2007.mo11916();
            int iM2022 = m2021();
            i6 = 0;
            float f4 = iM2022 > 0 ? 0 / iM2022 : 0.0f;
            if (c20915M2033 != null) {
                int i15 = c20915M2033.f67634;
                int i16 = c20915M2023.f67634;
                if (i15 < i16) {
                    float f5 = c20915M2033.f67633 + c20915M2033.f67635 + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= c20915M2023.f67634 && i18 < arrayList.size()) {
                        Object obj = arrayList.get(i18);
                        while (true) {
                            c20916 = (C20915) obj;
                            if (i17 <= c20916.f67634 || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            obj = arrayList.get(i18);
                        }
                        while (i17 < c20916.f67634) {
                            this.f2007.getClass();
                            f5 += 1.0f + f4;
                            i17++;
                        }
                        c20916.f67633 = f5;
                        f5 += c20916.f67635 + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f6 = c20915M2033.f67633;
                    while (true) {
                        i15--;
                        if (i15 < c20915M2023.f67634 || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            c20915 = (C20915) obj2;
                            if (i15 >= c20915.f67634 || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i15 > c20915.f67634) {
                            this.f2007.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= c20915.f67635 + f4;
                        c20915.f67633 = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = c20915M2023.f67633;
            int i19 = c20915M2023.f67634;
            int i20 = i19 - 1;
            this.f1981 = i19 == 0 ? f7 : -3.4028235E38f;
            int i21 = iMo11917 - 1;
            this.f1971 = i19 == i21 ? (c20915M2023.f67635 + f7) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                C20915 c209110 = (C20915) arrayList.get(i22);
                while (true) {
                    i3 = c209110.f67634;
                    if (i20 <= i3) {
                        break;
                    }
                    i20--;
                    this.f2007.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c209110.f67635 + f4;
                c209110.f67633 = f7;
                if (i3 == 0) {
                    this.f1981 = f7;
                }
                i22--;
                i20--;
            }
            float f8 = c20915M2023.f67633 + c20915M2023.f67635 + f4;
            int i23 = c20915M2023.f67634;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                C20915 c209111 = (C20915) arrayList.get(i12);
                while (true) {
                    i2 = c209111.f67634;
                    if (i23 >= i2) {
                        break;
                    }
                    i23++;
                    this.f2007.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i21) {
                    this.f1971 = (c209111.f67635 + f8) - 1.0f;
                }
                c209111.f67633 = f8;
                f8 += c209111.f67635 + f4;
                i12++;
            }
            this.f2007.mo13215(c20915M2023.f67632);
        } else {
            f = 0.0f;
        }
        this.f2007.mo13214();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            C9626 c9626 = (C9626) childAt.getLayoutParams();
            c9626.getClass();
            if (!c9626.f29177 && c9626.f29179 == f && (c20915M2025 = m2024(childAt)) != null) {
                c9626.f29179 = c20915M2025.f67635;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                c20915M2024 = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    c20915M2024 = m2024(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        c20915M2024 = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (c20915M2024 == null || c20915M2024.f67634 != this.f1989) {
                while (i6 < getChildCount()) {
                    View childAt2 = getChildAt(i6);
                    C20915 c20915M2027 = m2024(childAt2);
                    if (c20915M2027 != null && c20915M2027.f67634 == this.f1989 && childAt2.requestFocus(2)) {
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
        C19504 c19504 = new C19504(super.onSaveInstanceState());
        c19504.f63035 = this.f1989;
        if (this.f2007 != null) {
            c19504.f63036 = null;
        }
        return c19504;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19504)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19504 c19504 = (C19504) parcelable;
        super.onRestoreInstanceState(c19504.getSuperState());
        if (this.f2007 != null) {
            m2027(c19504.f63035, 0, false, true);
        } else {
            this.f2006 = c19504.f63035;
            this.f1995 = c19504.f63036;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C9626();
        }
        C9626 c9626 = (C9626) layoutParams;
        boolean z = c9626.f29177 | (view.getClass().getAnnotation(InterfaceC6803.class) != null);
        c9626.f29177 = z;
        if (!this.f1997) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c9626.f29178 = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f1997) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20915 m2024(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i >= arrayList.size()) {
                return null;
            }
            C20915 c20915 = (C20915) arrayList.get(i);
            if (this.f2007.mo11915(view, c20915.f67632)) {
                return c20915;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20915 m2033(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C20915 c20915 = (C20915) arrayList.get(i2);
            if (c20915.f67634 == i) {
                return c20915;
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1993 = true;
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
        C9626 c9626;
        C9626 c9627;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1987 = Math.min(measuredWidth / 10, this.f1978);
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
            if (childAt.getVisibility() != 8 && (c9627 = (C9626) childAt.getLayoutParams()) != null && c9627.f29177) {
                int i8 = c9627.f29176;
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
                    i4 = ((ViewGroup.LayoutParams) c9627).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c9627).height;
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
                i4 = ((ViewGroup.LayoutParams) c9627).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c9627).height;
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
        this.f1972 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1997 = true;
        m2041();
        this.f1997 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c9626 = (C9626) childAt2.getLayoutParams()) == null || !c9626.f29177)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c9626.f29179), 1073741824), this.f1972);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.f1984.isEmpty()) {
                if (!this.f1976.isFinished()) {
                    this.f1976.setFinalX(this.f1989 * m2021());
                    return;
                } else {
                    scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                    return;
                }
            }
            C20915 c20915M2033 = m2033(this.f1989);
            int iMin = (int) ((c20915M2033 != null ? Math.min(c20915M2033.f67633, this.f1971) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m2013(false);
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
        C20915 c20915M2024;
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
                C9626 c9626 = (C9626) childAt.getLayoutParams();
                if (c9626.f29177) {
                    int i9 = c9626.f29176;
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
                C9626 c9627 = (C9626) childAt2.getLayoutParams();
                if (!c9627.f29177 && (c20915M2024 = m2024(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c20915M2024.f67633 * f)) + paddingLeft;
                    if (c9627.f29178) {
                        c9627.f29178 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c9627.f29179), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f1985 = i7;
        if (this.f1993) {
            z2 = false;
            m2018(this.f1989, 0, false, false);
        } else {
            z2 = false;
        }
        this.f1993 = z2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f1980 = true;
        Scroller scroller = this.f1976;
        if (!scroller.isFinished() && scroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m2017(currX)) {
                    scroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            int i = C17648.f53953;
            postInvalidateOnAnimation();
            return;
        }
        m2013(true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m2017(int i) {
        if (this.f1984.size() == 0) {
            if (!this.f1993) {
                this.f1975 = false;
                m2026(0, 0.0f, 0);
                if (!this.f1975) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C20915 c20915M2016 = m2016();
        float fM2021 = m2021();
        int i2 = c20915M2016.f67634;
        float f = ((i / fM2021) - c20915M2016.f67633) / (c20915M2016.f67635 + (0 / fM2021));
        this.f1975 = false;
        m2026(i2, f, (int) (fM2021 * f));
        if (this.f1975) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2026(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f1985 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C9626 c9626 = (C9626) childAt.getLayoutParams();
                if (c9626.f29177) {
                    int i4 = c9626.f29176 & 7;
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
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC2570 interfaceC2570 = (InterfaceC2570) this.f1969.get(i6);
                if (interfaceC2570 != null) {
                    interfaceC2570.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC2570 interfaceC2571 = this.f1994;
        if (interfaceC2571 != null) {
            interfaceC2571.onPageScrolled(i, f, i2);
        }
        this.f1975 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m2022(int i) {
        ArrayList arrayList = this.f1969;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC2570 interfaceC2570 = (InterfaceC2570) this.f1969.get(i2);
                if (interfaceC2570 != null) {
                    interfaceC2570.onPageSelected(i);
                }
            }
        }
        InterfaceC2570 interfaceC2571 = this.f1994;
        if (interfaceC2571 != null) {
            interfaceC2571.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2013(boolean z) {
        boolean z2 = this.f2003 == 2;
        if (z2) {
            m2019(false);
            Scroller scroller = this.f1976;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m2017(currX);
                    }
                }
            }
        }
        this.f1982 = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i >= arrayList.size()) {
                break;
            }
            C20915 c20915 = (C20915) arrayList.get(i);
            if (c20915.f67636) {
                c20915.f67636 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.f1988;
            if (z) {
                int i2 = C17648.f53953;
                postOnAnimation(runnable);
            } else {
                ((RunnableC14563) runnable).run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m2020();
            return false;
        }
        if (action != 0) {
            if (this.f2010) {
                return true;
            }
            if (this.f2004) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1999 = x;
            this.f1983 = x;
            float y = motionEvent.getY();
            this.f1998 = y;
            this.f1996 = y;
            this.f2005 = motionEvent.getPointerId(0);
            this.f2004 = false;
            this.f1980 = true;
            Scroller scroller = this.f1976;
            scroller.computeScrollOffset();
            if (this.f2003 == 2 && Math.abs(scroller.getFinalX() - scroller.getCurrX()) > this.f1991) {
                scroller.abortAnimation();
                this.f1982 = false;
                m2041();
                this.f2010 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m2037(1);
            } else {
                m2013(false);
                this.f2010 = false;
            }
        } else if (action == 2) {
            int i = this.f2005;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f1983;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f1998);
                if (f != 0.0f) {
                    float f2 = this.f1983;
                    if ((f2 >= this.f1987 || f <= 0.0f) && ((f2 <= getWidth() - this.f1987 || f >= 0.0f) && m2015((int) f, (int) x2, (int) y2, this, false))) {
                        this.f1983 = x2;
                        this.f1996 = y2;
                        this.f2004 = true;
                        return false;
                    }
                }
                int i2 = this.f1986;
                float f3 = i2;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.f2010 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m2037(1);
                    float f4 = this.f1999;
                    float f5 = i2;
                    this.f1983 = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.f1996 = y2;
                    m2019(true);
                } else if (fAbs2 > f3) {
                    this.f2004 = true;
                }
                if (this.f2010 && m2014(x2)) {
                    int i3 = C17648.f53953;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m2012(motionEvent);
        }
        if (this.f1979 == null) {
            this.f1979 = VelocityTracker.obtain();
        }
        this.f1979.addMovement(motionEvent);
        return this.f2010;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC12014 abstractC12014;
        boolean zM2020 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC12014 = this.f2007) == null || abstractC12014.mo11916() == 0) {
            return false;
        }
        if (this.f1979 == null) {
            this.f1979 = VelocityTracker.obtain();
        }
        this.f1979.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f1976.abortAnimation();
            this.f1982 = false;
            m2041();
            float x = motionEvent.getX();
            this.f1999 = x;
            this.f1983 = x;
            float y = motionEvent.getY();
            this.f1998 = y;
            this.f1996 = y;
            this.f2005 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1983 = motionEvent.getX(actionIndex);
                        this.f2005 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m2012(motionEvent);
                        this.f1983 = motionEvent.getX(motionEvent.findPointerIndex(this.f2005));
                    }
                } else if (this.f2010) {
                    m2018(this.f1989, 0, true, false);
                    zM2020 = m2020();
                }
            } else if (!this.f2010) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2005);
                if (iFindPointerIndex == -1) {
                    zM2020 = m2020();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.f1983);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.f1996);
                    int i = this.f1986;
                    if (fAbs > i && fAbs > fAbs2) {
                        this.f2010 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f = this.f1999;
                        this.f1983 = x2 - f > 0.0f ? f + i : f - i;
                        this.f1996 = y2;
                        m2037(1);
                        m2019(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f2010) {
                        zM2020 = m2014(motionEvent.getX(motionEvent.findPointerIndex(this.f2005)));
                    }
                }
            } else if (this.f2010) {
                zM2020 = m2014(motionEvent.getX(motionEvent.findPointerIndex(this.f2005)));
            }
        } else if (this.f2010) {
            VelocityTracker velocityTracker = this.f1979;
            velocityTracker.computeCurrentVelocity(1000, this.f2000);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f2005);
            this.f1982 = true;
            int iM2021 = m2021();
            int scrollX = getScrollX();
            C20915 c20915M2016 = m2016();
            float f2 = iM2021;
            int iMax = c20915M2016.f67634;
            float f3 = ((scrollX / f2) - c20915M2016.f67633) / (c20915M2016.f67635 + (0 / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f2005)) - this.f1999)) <= this.f1970 || Math.abs(xVelocity) <= this.f2001) {
                iMax += (int) (f3 + (iMax >= this.f1989 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f1984;
            if (arrayList.size() > 0) {
                iMax = Math.max(((C20915) arrayList.get(0)).f67634, Math.min(iMax, ((C20915) C18566.m43105(arrayList, 1)).f67634));
            }
            m2027(iMax, xVelocity, true, true);
            zM2020 = m2020();
        }
        if (zM2020) {
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m2020() {
        this.f2005 = -1;
        this.f2010 = false;
        this.f2004 = false;
        VelocityTracker velocityTracker = this.f1979;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1979 = null;
        }
        this.f1974.onRelease();
        this.f2008.onRelease();
        return this.f1974.isFinished() || this.f2008.isFinished();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2014(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1983 - f;
        this.f1983 = f;
        float scrollX = getScrollX() + f2;
        float fM2021 = m2021();
        float f3 = this.f1981 * fM2021;
        float f4 = this.f1971 * fM2021;
        ArrayList arrayList = this.f1984;
        boolean z3 = false;
        C20915 c20915 = (C20915) arrayList.get(0);
        C20915 c20916 = (C20915) C18566.m43105(arrayList, 1);
        if (c20915.f67634 != 0) {
            f3 = c20915.f67633 * fM2021;
            z = false;
        } else {
            z = true;
        }
        if (c20916.f67634 != this.f2007.mo11916() - 1) {
            f4 = c20916.f67633 * fM2021;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1974.onPull(Math.abs(f3 - scrollX) / fM2021);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f2008.onPull(Math.abs(scrollX - f4) / fM2021);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1983 = (scrollX - i) + this.f1983;
        scrollTo(i, getScrollY());
        m2017(i);
        return z3;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C20915 m2016() {
        C20915 c20915;
        int i;
        int iM2021 = m2021();
        float f = 0.0f;
        float scrollX = iM2021 > 0 ? getScrollX() / iM2021 : 0.0f;
        float f2 = iM2021 > 0 ? 0 / iM2021 : 0.0f;
        int i2 = -1;
        C20915 c20916 = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.f1984;
            if (i3 >= arrayList.size()) {
                break;
            }
            C20915 c20917 = (C20915) arrayList.get(i3);
            if (z || c20917.f67634 == (i = i2 + 1)) {
                c20915 = c20917;
            } else {
                float f4 = f + f3 + f2;
                c20915 = this.f1992;
                c20915.f67633 = f4;
                c20915.f67634 = i;
                this.f2007.getClass();
                c20915.f67635 = 1.0f;
                i3--;
            }
            f = c20915.f67633;
            float f5 = c20915.f67635 + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f5 || i3 == arrayList.size() - 1) {
                return c20915;
            }
            i2 = c20915.f67634;
            i3++;
            z = false;
            C20915 c20918 = c20915;
            f3 = c20915.f67635;
            c20916 = c20918;
        }
        return c20916;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC12014 abstractC12014;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        EdgeEffect edgeEffect = this.f2008;
        EdgeEffect edgeEffect2 = this.f1974;
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC12014 = this.f2007) != null && abstractC12014.mo11916() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1981 * width);
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
                canvas.translate(-getPaddingTop(), (-(this.f1971 + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2012(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2005) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1983 = motionEvent.getX(i);
            this.f2005 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1979;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m2019(boolean z) {
        if (this.f1973 != z) {
            this.f1973 = z;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.f2007 == null) {
            return false;
        }
        int iM2021 = m2021();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) iM2021) * this.f1981));
        }
        return i > 0 && scrollX < ((int) (((float) iM2021) * this.f1971));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2015(int i, int i2, int i3, View view, boolean z) {
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
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !m2015(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM2031;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zM2031 = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zM2031 = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zM2031 = m2031(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM2031 = m2031(1);
                        } else {
                            zM2031 = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zM2031 = m2044();
                    } else {
                        zM2031 = m2031(66);
                    }
                } else if (!keyEvent.hasModifiers(2)) {
                    zM2031 = m2031(17);
                } else {
                    int i = this.f1989;
                    if (i > 0) {
                        m2042(i - 1);
                        zM2031 = true;
                    } else {
                        zM2031 = false;
                    }
                }
            }
            if (!zM2031) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[PHI: r0
      0x0088: PHI (r0v5 int) = (r0v3 int), (r0v11 int) binds: [B:44:0x0086, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2031(int i) {
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
        boolean zM2044 = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f1990;
            if (i == 17) {
                int i3 = m2011(rect, viewFindNextFocus).left;
                int i4 = m2011(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    i2 = this.f1989;
                    if (i2 > 0) {
                        m2042(i2 - 1);
                    } else {
                        z = false;
                    }
                    zM2044 = z;
                }
            } else if (i == 66) {
                int i5 = m2011(rect, viewFindNextFocus).left;
                int i6 = m2011(rect, viewFindFocus).left;
                if (viewFindFocus != null && i5 <= i6) {
                    zRequestFocus = m2044();
                } else {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
            zM2044 = zRequestFocus;
        } else if (i == 17 || i == 1) {
            i2 = this.f1989;
            if (i2 > 0) {
                m2042(i2 - 1);
            } else {
                z = false;
            }
            zM2044 = z;
        } else if (i == 66 || i == 2) {
            zM2044 = m2044();
        }
        if (zM2044) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM2044;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Rect m2011(Rect rect, View view) {
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m2044() {
        AbstractC12014 abstractC12014 = this.f2007;
        if (abstractC12014 == null || this.f1989 >= abstractC12014.mo11916() - 1) {
            return false;
        }
        m2042(this.f1989 + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C20915 c20915M2024;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c20915M2024 = m2024(childAt)) != null && c20915M2024.f67634 == this.f1989) {
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
        C20915 c20915M2024;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c20915M2024 = m2024(childAt)) != null && c20915M2024.f67634 == this.f1989) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C20915 c20915M2024;
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
            if (childAt.getVisibility() == 0 && (c20915M2024 = m2024(childAt)) != null && c20915M2024.f67634 == this.f1989 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C20915 c20915M2024;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c20915M2024 = m2024(childAt)) != null && c20915M2024.f67634 == this.f1989 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C9626();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C9626();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C9626) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9626(getContext(), attributeSet);
    }
}
