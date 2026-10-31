package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18312 implements InterfaceC13683 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17606 f56930;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17606 f56931;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56932;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f56933;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56934;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56935;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56936;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f56937;

    public C18312(C17606 c17606, C17606 c17607) {
        this.f56931 = c17606;
        this.f56930 = c17607;
    }

    @Override // l.InterfaceC13683
    /* JADX INFO: renamed from: ֫ */
    public final void mo32930(C15094 c15094, C22856 c22856) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int measuredHeight;
        int baseline;
        int i;
        int i2;
        if (c15094 == null) {
            return;
        }
        C5218 c5218 = c15094.f46159;
        C5218 c5219 = c15094.f46141;
        if (c15094.m35735() != 8 || c15094.m35726()) {
            if (c15094.f46132 == null) {
                return;
            }
            EnumC8040 enumC8040 = c22856.f73745;
            EnumC8040 enumC8041 = c22856.f73753;
            int i3 = c22856.f73748;
            int i4 = c22856.f73747;
            int i5 = this.f56933 + this.f56936;
            int i6 = this.f56937;
            View view = (View) c15094.m35760();
            int[] iArr = C2084.f6954;
            int i7 = iArr[enumC8040.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f56934, i6, -2);
            } else if (i7 == 3) {
                int i8 = this.f56934;
                int i9 = c5219 != null ? c5219.f16343 : 0;
                if (c5218 != null) {
                    i9 += c5218.f16343;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i6 + i9, -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f56934, i6, -2);
                boolean z = c15094.f46145 == 1;
                int i10 = c22856.f73750;
                if (i10 == 1 || i10 == 2) {
                    boolean z2 = view.getMeasuredHeight() == c15094.m35732();
                    if (c22856.f73750 == 2 || !z || ((z && z2) || (view instanceof C8434) || c15094.mo7762())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c15094.m35753(), 1073741824);
                    }
                }
            }
            int i11 = iArr[enumC8041.ordinal()];
            if (i11 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i11 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f56932, i5, -2);
            } else if (i11 == 3) {
                int i12 = this.f56932;
                int i13 = c5219 != null ? c15094.f46161.f16343 : 0;
                if (c5218 != null) {
                    i13 += c15094.f46133.f16343;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i5 + i13, -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f56932, i5, -2);
                boolean z3 = c15094.f46170 == 1;
                int i14 = c22856.f73750;
                if (i14 == 1 || i14 == 2) {
                    boolean z4 = view.getMeasuredWidth() == c15094.m35753();
                    if (c22856.f73750 == 2 || !z3 || ((z3 && z4) || (view instanceof C8434) || c15094.mo7768())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c15094.m35732(), 1073741824);
                    }
                }
            }
            C21446 c21446 = (C21446) c15094.f46132;
            C17606 c17606 = this.f56931;
            if (c21446 != null && C12273.m29806(c17606.mOptimizationLevel, 256) && view.getMeasuredWidth() == c15094.m35753() && view.getMeasuredWidth() < c21446.m35753() && view.getMeasuredHeight() == c15094.m35732() && view.getMeasuredHeight() < c21446.m35732() && view.getBaseline() == c15094.m35756() && !c15094.m35740() && m42666(c15094.m35736(), iMakeMeasureSpec, c15094.m35753()) && m42666(c15094.m35754(), iMakeMeasureSpec2, c15094.m35732())) {
                c22856.f73746 = c15094.m35753();
                c22856.f73749 = c15094.m35732();
                c22856.f73752 = c15094.m35756();
                return;
            }
            EnumC8040 enumC8042 = EnumC8040.MATCH_CONSTRAINT;
            boolean z5 = enumC8040 == enumC8042;
            boolean z6 = enumC8041 == enumC8042;
            EnumC8040 enumC8043 = EnumC8040.MATCH_PARENT;
            boolean z7 = enumC8041 == enumC8043 || enumC8041 == EnumC8040.FIXED;
            boolean z8 = enumC8040 == enumC8043 || enumC8040 == EnumC8040.FIXED;
            boolean z9 = z5 && c15094.f46108 > 0.0f;
            boolean z10 = z6 && c15094.f46108 > 0.0f;
            if (view == null) {
                return;
            }
            C16900 c16900 = (C16900) view.getLayoutParams();
            int i15 = c22856.f73750;
            if (i15 != 1 && i15 != 2 && z5 && c15094.f46145 == 0 && z6 && c15094.f46170 == 0) {
                i2 = -1;
                baseline = 0;
                i = 0;
                measuredHeight = 0;
            } else {
                if ((view instanceof AbstractC3495) && (c15094 instanceof C10157)) {
                    ((AbstractC3495) view).mo10676((C10157) c15094, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c15094.m35758(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i16 = c15094.f46153;
                int iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                int i17 = c15094.f46113;
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                int i18 = c15094.f46138;
                int iMax2 = i18 > 0 ? Math.max(i18, measuredHeight2) : measuredHeight2;
                int i19 = iMakeMeasureSpec2;
                int i20 = c15094.f46128;
                if (i20 > 0) {
                    iMax2 = Math.min(i20, iMax2);
                }
                if (!C12273.m29806(c17606.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((iMax2 * c15094.f46108) + 0.5f);
                    } else if (z10 && z8) {
                        iMax2 = (int) ((iMax / c15094.f46108) + 0.5f);
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
                    c15094.m35758(iMakeMeasureSpec, iMakeMeasureSpec3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i = measuredWidth2;
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            c22856.f73754 = (i == c22856.f73748 && measuredHeight == c22856.f73747) ? false : true;
            if (c16900.f51904) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c15094.m35756() != baseline) {
                c22856.f73754 = true;
            }
            c22856.f73746 = i;
            c22856.f73749 = measuredHeight;
            c22856.f73751 = z11;
            c22856.f73752 = baseline;
            return;
        }
        c22856.f73746 = 0;
        c22856.f73749 = 0;
        c22856.f73752 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42666(int i, int i2, int i3) {
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

    @Override // l.InterfaceC13683
    /* JADX INFO: renamed from: ֫ */
    public final void mo32929() {
        C17606 c17606 = this.f56930;
        int childCount = c17606.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c17606.getChildAt(i);
            if (childAt instanceof C8434) {
                ((C8434) childAt).m22117();
            }
        }
        int size = c17606.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC7539) c17606.mConstraintHelpers.get(i2)).getClass();
            }
        }
    }
}
