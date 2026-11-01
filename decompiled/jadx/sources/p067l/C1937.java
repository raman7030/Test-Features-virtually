package p067l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes.dex */
public final class C1937 {

    /* JADX INFO: renamed from: ۧ */
    public int f73437;

    /* JADX INFO: renamed from: ܳ */
    public int f73438;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C1342 f73442;

    /* JADX INFO: renamed from: ᩳ */
    public C1906 f73441 = new C1906();

    /* JADX INFO: renamed from: ܽ */
    public C1906 f73439 = new C1906();

    /* JADX INFO: renamed from: ܿ */
    public C1050 f73440 = null;

    /* JADX INFO: renamed from: ֫ */
    public C1050 f73436 = null;

    /* JADX INFO: renamed from: ֫ */
    public static void m51985(C1906 c1906, C1906 c1907) {
        C1591 c1591;
        ArrayList<C1591> arrayList = c1906.f21023;
        HashMap map = new HashMap();
        map.put(c1906, c1907);
        c1907.f21023.clear();
        c1907.mo9821(c1906, map);
        for (C1591 c1592 : arrayList) {
            if (c1592 instanceof C0961) {
                c1591 = new C0961();
            } else if (c1592 instanceof C0996) {
                c1591 = new C0996();
            } else if (c1592 instanceof C1836) {
                c1591 = new C1836();
            } else if (c1592 instanceof C1486) {
                c1591 = new C1486();
            } else {
                c1591 = new C1591();
            }
            c1907.f21023.add(c1591);
            C1591 c1593 = c1591.f49252;
            if (c1593 != null) {
                ((C1136) c1593).f21023.remove(c1591);
                c1591.mo18537();
            }
            c1591.f49252 = c1907;
            map.put(c1592, c1591);
        }
        for (C1591 c1594 : arrayList) {
            ((C1591) map.get(c1594)).mo9821(c1594, map);
        }
    }

    public C1937(C1342 c1342) {
        this.f73442 = c1342;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51987(C1050 c1050, C1050 c1051) {
        this.f73440 = c1050;
        this.f73436 = c1051;
        this.f73441 = new C1906();
        this.f73439 = new C1906();
        C1906 c1906 = this.f73441;
        C1342 c1342 = this.f73442;
        c1906.m50904(c1342.mLayoutWidget.m50908());
        this.f73439.m50904(c1342.mLayoutWidget.m50908());
        this.f73441.f21023.clear();
        this.f73439.f21023.clear();
        m51985(c1342.mLayoutWidget, this.f73441);
        m51985(c1342.mLayoutWidget, this.f73439);
        if (c1342.f33304 > 0.5d) {
            if (c1050 != null) {
                m51984(this.f73441, c1050);
            }
            m51984(this.f73439, c1051);
        } else {
            m51984(this.f73439, c1051);
            if (c1050 != null) {
                m51984(this.f73441, c1050);
            }
        }
        this.f73441.m50914(c1342.isRtl());
        this.f73441.m50907();
        this.f73439.m50914(c1342.isRtl());
        this.f73439.m50907();
        ViewGroup.LayoutParams layoutParams = c1342.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C1906 c1907 = this.f73441;
                EnumC1241 enumC1241 = EnumC1241.WRAP_CONTENT;
                c1907.m37875(enumC1241);
                this.f73439.m37875(enumC1241);
            }
            if (layoutParams.height == -2) {
                C1906 c1908 = this.f73441;
                EnumC1241 enumC1242 = EnumC1241.WRAP_CONTENT;
                c1908.m37904(enumC1242);
                this.f73439.m37904(enumC1242);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51984(C1906 c1906, C1050 c1050) {
        SparseArray sparseArray = new SparseArray();
        C1785 c1785 = new C1785();
        sparseArray.clear();
        sparseArray.put(0, c1906);
        C1342 c1342 = this.f73442;
        sparseArray.put(c1342.getId(), c1906);
        for (C1591 c1591 : c1906.f21023) {
            sparseArray.put(((View) c1591.m37918()).getId(), c1591);
        }
        for (C1591 c1592 : c1906.f21023) {
            View view = (View) c1592.m37918();
            c1050.m14546(view.getId(), c1785);
            c1592.m37928(c1050.m14559(view.getId()));
            c1592.m37891(c1050.m14555(view.getId()));
            if (view instanceof AbstractC1216) {
                c1050.m14550((AbstractC1216) view, c1592, c1785, sparseArray);
                if (view instanceof C1146) {
                    ((C1146) view).m22212();
                }
            }
            c1785.resolveLayoutDirection(c1342.getLayoutDirection());
            c1342.applyConstraintsFromLayoutParams(false, view, c1592, c1785, sparseArray);
            if (c1050.m14562(view.getId()) == 1) {
                c1592.m37926(view.getVisibility());
            } else {
                c1592.m37926(c1050.m14563(view.getId()));
            }
        }
        for (C1591 c1593 : c1906.f21023) {
            if (c1593 instanceof C1346) {
                AbstractC1216 abstractC1216 = (AbstractC1216) c1593.m37918();
                C1486 c1486 = (C1486) c1593;
                abstractC1216.m22207(c1486, sparseArray);
                C1346 c1346 = (C1346) c1486;
                for (int i = 0; i < c1346.f41927; i++) {
                    C1591 c1594 = c1346.f41928[i];
                    if (c1594 != null) {
                        c1594.m37924();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1591 m51983(C1906 c1906, View view) {
        if (c1906.m37918() == view) {
            return c1906;
        }
        ArrayList arrayList = c1906.f21023;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) arrayList.get(i);
            if (c1591.m37918() == view) {
                return c1591;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51988() {
        C1342 c1342 = this.f73442;
        int i = c1342.f33271;
        int i2 = c1342.f33313;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        c1342.f33314 = mode;
        c1342.f33282 = mode2;
        int optimizationLevel = c1342.getOptimizationLevel();
        if (c1342.f33275 == c1342.m27341()) {
            c1342.resolveSystem(this.f73439, optimizationLevel, i, i2);
            if (this.f73440 != null) {
                c1342.resolveSystem(this.f73441, optimizationLevel, i, i2);
            }
        } else {
            if (this.f73440 != null) {
                c1342.resolveSystem(this.f73441, optimizationLevel, i, i2);
            }
            c1342.resolveSystem(this.f73439, optimizationLevel, i, i2);
        }
        int i3 = 0;
        if (!(c1342.getParent() instanceof C1342) || mode != 1073741824 || mode2 != 1073741824) {
            c1342.f33314 = mode;
            c1342.f33282 = mode2;
            if (c1342.f33275 == c1342.m27341()) {
                c1342.resolveSystem(this.f73439, optimizationLevel, i, i2);
                if (this.f73440 != null) {
                    c1342.resolveSystem(this.f73441, optimizationLevel, i, i2);
                }
            } else {
                if (this.f73440 != null) {
                    c1342.resolveSystem(this.f73441, optimizationLevel, i, i2);
                }
                c1342.resolveSystem(this.f73439, optimizationLevel, i, i2);
            }
            c1342.f33288 = this.f73441.m37911();
            c1342.f33294 = this.f73441.m37890();
            c1342.f33291 = this.f73439.m37911();
            int iM37890 = this.f73439.m37890();
            c1342.f33278 = iM37890;
            c1342.f33310 = (c1342.f33288 == c1342.f33291 && c1342.f33294 == iM37890) ? false : true;
        }
        int i4 = c1342.f33288;
        int i5 = c1342.f33294;
        int i6 = c1342.f33314;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((c1342.f33301 * (c1342.f33291 - i4)) + i4);
        }
        int i7 = i4;
        int i8 = c1342.f33282;
        c1342.resolveMeasuredDimension(i, i2, i7, (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((c1342.f33301 * (c1342.f33278 - i5)) + i5) : i5, this.f73441.m50906() || this.f73439.m50906(), this.f73441.m50910() || this.f73439.m50910());
        HashMap map = c1342.f33319;
        int childCount = c1342.getChildCount();
        c1342.f33267.m51986();
        c1342.f33289 = true;
        int width = c1342.getWidth();
        int height = c1342.getHeight();
        C1517 c1517 = c1342.f33318.f25155;
        int i9 = c1517 != null ? c1517.f43648 : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C1797 c1797 = (C1797) map.get(c1342.getChildAt(i10));
                if (c1797 != null) {
                    c1797.m46706(i9);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            C1797 c1798 = (C1797) map.get(c1342.getChildAt(i11));
            if (c1798 != null) {
                c1342.f33318.m21381(c1798);
                c1798.m46698(width, height, System.nanoTime());
            }
        }
        C1517 c1518 = c1342.f33318.f25155;
        float f = c1518 != null ? c1518.f43649 : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                C1797 c1799 = (C1797) map.get(c1342.getChildAt(i12));
                if (!Float.isNaN(c1799.f63835)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C1797 c17910 = (C1797) map.get(c1342.getChildAt(i13));
                        if (!Float.isNaN(c17910.f63835)) {
                            fMin = Math.min(fMin, c17910.f63835);
                            fMax = Math.max(fMax, c17910.f63835);
                        }
                    }
                    while (i3 < childCount) {
                        C1797 c17911 = (C1797) map.get(c1342.getChildAt(i3));
                        if (!Float.isNaN(c17911.f63835)) {
                            c17911.f63824 = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c17911.f63816 = fAbs - (((fMax - c17911.f63835) / (fMax - fMin)) * fAbs);
                            } else {
                                c17911.f63816 = fAbs - (((c17911.f63835 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                float fM46705 = c1799.m46705();
                float fM46708 = c1799.m46708();
                float f2 = z ? fM46708 - fM46705 : fM46708 + fM46705;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i3 < childCount) {
                C1797 c17912 = (C1797) map.get(c1342.getChildAt(i3));
                float fM46706 = c17912.m46705();
                float fM46709 = c17912.m46708();
                float f3 = z ? fM46709 - fM46706 : fM46709 + fM46706;
                c17912.f63824 = 1.0f / (1.0f - fAbs);
                c17912.f63816 = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51986() {
        C1342 c1342 = this.f73442;
        int childCount = c1342.getChildCount();
        HashMap map = c1342.f33319;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1342.getChildAt(i);
            map.put(childAt, new C1797(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = c1342.getChildAt(i2);
            C1797 c1797 = (C1797) map.get(childAt2);
            if (c1797 != null) {
                if (this.f73440 != null) {
                    C1591 c1591M51983 = m51983(this.f73441, childAt2);
                    if (c1591M51983 != null) {
                        c1797.m46707(c1591M51983, this.f73440);
                    } else if (c1342.f33272 != 0) {
                        C0845.m3342();
                        C0845.m3343(childAt2);
                        childAt2.getClass();
                    }
                }
                if (this.f73436 != null) {
                    C1591 c1591M51984 = m51983(this.f73439, childAt2);
                    if (c1591M51984 != null) {
                        c1797.m46703(c1591M51984, this.f73436);
                    } else if (c1342.f33272 != 0) {
                        C0845.m3342();
                        C0845.m3343(childAt2);
                        childAt2.getClass();
                    }
                }
            }
        }
    }
}
