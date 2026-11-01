package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩳ᩸ */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes5.dex */
public final class C1750 implements InterfaceC1521 {

    /* JADX INFO: renamed from: ֫ */
    public C1715 f60148;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C1715 f60149;

    /* JADX INFO: renamed from: ۧ */
    public int f60150;

    /* JADX INFO: renamed from: ܳ */
    public int f60151;

    /* JADX INFO: renamed from: ܽ */
    public int f60152;

    /* JADX INFO: renamed from: ܿ */
    public int f60153;

    /* JADX INFO: renamed from: ᩳ */
    public int f60154;

    /* JADX INFO: renamed from: ᩻ */
    public int f60155;

    public C1750(C1715 c1715, C1715 c1716) {
        this.f60149 = c1715;
        this.f60148 = c1716;
    }

    @Override // p067l.InterfaceC1521
    /* JADX INFO: renamed from: ֫ */
    public final void mo35045(C1591 c1591, C1976 c1976) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int measuredHeight;
        int baseline;
        int i;
        int i2;
        if (c1591 == null) {
            return;
        }
        C1101 c1101 = c1591.f49279;
        C1101 c1102 = c1591.f49261;
        if (c1591.m37893() != 8 || c1591.m37884()) {
            if (c1591.f49252 == null) {
                return;
            }
            EnumC1241 enumC1241 = c1976.f76476;
            EnumC1241 enumC1242 = c1976.f76484;
            int i3 = c1976.f76479;
            int i4 = c1976.f76478;
            int i5 = this.f60151 + this.f60154;
            int i6 = this.f60155;
            View view = (View) c1591.m37918();
            int[] iArr = C0945.f9738;
            int i7 = iArr[enumC1241.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f60152, i6, -2);
            } else if (i7 == 3) {
                int i8 = this.f60152;
                int i9 = c1102 != null ? c1102.f19183 : 0;
                if (c1101 != null) {
                    i9 += c1101.f19183;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f60152, i6, -2);
                boolean z = c1591.f49265 == 1;
                int i10 = c1976.f76481;
                if (i10 == 1 || i10 == 2) {
                    boolean z2 = view.getMeasuredHeight() == c1591.m37890();
                    if (c1976.f76481 == 2 || !z || ((z && z2) || (view instanceof C1260) || c1591.mo9825())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1591.m37911(), 1073741824);
                    }
                }
            }
            int i11 = iArr[enumC1242.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i11 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f60150, i5, -2);
            } else if (i11 == 3) {
                int i12 = this.f60150;
                int i13 = c1102 != null ? c1591.f49281.f19183 : 0;
                if (c1101 != null) {
                    i13 += c1591.f49253.f19183;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i5 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f60150, i5, -2);
                boolean z3 = c1591.f49290 == 1;
                int i14 = c1976.f76481;
                if (i14 == 1 || i14 == 2) {
                    boolean z4 = view.getMeasuredWidth() == c1591.m37911();
                    if (c1976.f76481 == 2 || !z3 || ((z3 && z4) || (view instanceof C1260) || c1591.mo9831())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1591.m37890(), 1073741824);
                    }
                }
            }
            C1906 c1906 = (C1906) c1591.f49252;
            C1715 c1715 = this.f60149;
            if (c1906 != null && C1451.m31868(c1715.mOptimizationLevel, 256) && view.getMeasuredWidth() == c1591.m37911() && view.getMeasuredWidth() < c1906.m37911() && view.getMeasuredHeight() == c1591.m37890() && view.getMeasuredHeight() < c1906.m37890() && view.getBaseline() == c1591.m37914() && !c1591.m37898() && m44927(c1591.m37894(), iMakeMeasureSpec, c1591.m37911()) && m44927(c1591.m37912(), iMakeMeasureSpec2, c1591.m37890())) {
                c1976.f76477 = c1591.m37911();
                c1976.f76480 = c1591.m37890();
                c1976.f76483 = c1591.m37914();
                return;
            }
            EnumC1241 enumC1243 = EnumC1241.MATCH_CONSTRAINT;
            boolean z5 = enumC1241 == enumC1243;
            boolean z6 = enumC1242 == enumC1243;
            EnumC1241 enumC1244 = EnumC1241.MATCH_PARENT;
            boolean z7 = enumC1242 == enumC1244 || enumC1242 == EnumC1241.FIXED;
            boolean z8 = enumC1241 == enumC1244 || enumC1241 == EnumC1241.FIXED;
            boolean z9 = z5 && c1591.f49228 > 0.0f;
            boolean z10 = z6 && c1591.f49228 > 0.0f;
            if (view == null) {
                return;
            }
            C1680 c1680 = (C1680) view.getLayoutParams();
            int i15 = c1976.f76481;
            if (i15 != 1 && i15 != 2 && z5 && c1591.f49265 == 0 && z6 && c1591.f49290 == 0) {
                i2 = -1;
                baseline = 0;
                i = 0;
                measuredHeight = 0;
            } else {
                if ((view instanceof AbstractC1015) && (c1591 instanceof C1346)) {
                    ((AbstractC1015) view).mo12671((C1346) c1591, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c1591.m37916(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i16 = c1591.f49273;
                int iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                int i17 = c1591.f49233;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                int i18 = c1591.f49258;
                int iMax2 = i18 > 0 ? Math.max(i18, measuredHeight2) : measuredHeight2;
                int i19 = iMakeMeasureSpec2;
                int i20 = c1591.f49248;
                if (i20 > 0) {
                    iMax2 = Math.min(i20, iMax2);
                }
                if (!C1451.m31868(c1715.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((iMax2 * c1591.f49228) + 0.5f);
                    } else if (z10 && z8) {
                        iMax2 = (int) ((iMax / c1591.f49228) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight2 == iMax2) {
                    baseline = baseline2;
                    i = iMax;
                    measuredHeight = iMax2;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight2 != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i19;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    c1591.m37916(iMakeMeasureSpec, iMakeMeasureSpec3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i = measuredWidth2;
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            c1976.f76485 = (i == c1976.f76479 && measuredHeight == c1976.f76478) ? false : true;
            if (c1680.f55084) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c1591.m37914() != baseline) {
                c1976.f76485 = true;
            }
            c1976.f76477 = i;
            c1976.f76480 = measuredHeight;
            c1976.f76482 = z11;
            c1976.f76483 = baseline;
            return;
        }
        c1976.f76477 = 0;
        c1976.f76480 = 0;
        c1976.f76483 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44927(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // p067l.InterfaceC1521
    /* JADX INFO: renamed from: ֫ */
    public final void mo35044() {
        C1715 c1715 = this.f60148;
        int childCount = c1715.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c1715.getChildAt(i);
            if (childAt instanceof C1260) {
                ((C1260) childAt).m24086();
            }
        }
        int size = c1715.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1216) c1715.mConstraintHelpers.get(i2)).getClass();
            }
        }
    }
}
