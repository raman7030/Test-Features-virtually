package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes.dex */
public final class C22069 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70716;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70717;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10075 f70721;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21446 f70720 = new C21446();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21446 f70718 = new C21446();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4201 f70719 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4201 f70715 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49647(C21446 c21446, C21446 c21447) {
        C15094 c15094;
        ArrayList<C15094> arrayList = c21446.f18169;
        HashMap map = new HashMap();
        map.put(c21446, c21447);
        c21447.f18169.clear();
        c21447.mo7758(c21446, map);
        for (C15094 c15095 : arrayList) {
            if (c15095 instanceof C2396) {
                c15094 = new C2396();
            } else if (c15095 instanceof C3101) {
                c15094 = new C3101();
            } else if (c15095 instanceof C20035) {
                c15094 = new C20035();
            } else if (c15095 instanceof C12978) {
                c15094 = new C12978();
            } else {
                c15094 = new C15094();
            }
            c21447.f18169.add(c15094);
            C15094 c15096 = c15094.f46132;
            if (c15096 != null) {
                ((C5923) c15096).f18169.remove(c15094);
                c15094.mo16611();
            }
            c15094.f46132 = c21447;
            map.put(c15095, c15094);
        }
        for (C15094 c15097 : arrayList) {
            ((C15094) map.get(c15097)).mo7758(c15097, map);
        }
    }

    public C22069(C10075 c10075) {
        this.f70721 = c10075;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49649(C4201 c4201, C4201 c4202) {
        this.f70719 = c4201;
        this.f70715 = c4202;
        this.f70720 = new C21446();
        this.f70718 = new C21446();
        C21446 c21446 = this.f70720;
        C10075 c10075 = this.f70721;
        c21446.m48567(c10075.mLayoutWidget.m48571());
        this.f70718.m48567(c10075.mLayoutWidget.m48571());
        this.f70720.f18169.clear();
        this.f70718.f18169.clear();
        m49647(c10075.mLayoutWidget, this.f70720);
        m49647(c10075.mLayoutWidget, this.f70718);
        if (c10075.f30343 > 0.5d) {
            if (c4201 != null) {
                m49646(this.f70720, c4201);
            }
            m49646(this.f70718, c4202);
        } else {
            m49646(this.f70718, c4202);
            if (c4201 != null) {
                m49646(this.f70720, c4201);
            }
        }
        this.f70720.m48577(c10075.isRtl());
        this.f70720.m48570();
        this.f70718.m48577(c10075.isRtl());
        this.f70718.m48570();
        ViewGroup.LayoutParams layoutParams = c10075.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C21446 c21447 = this.f70720;
                EnumC8040 enumC8040 = EnumC8040.WRAP_CONTENT;
                c21447.m35717(enumC8040);
                this.f70718.m35717(enumC8040);
            }
            if (layoutParams.height == -2) {
                C21446 c21448 = this.f70720;
                EnumC8040 enumC8041 = EnumC8040.WRAP_CONTENT;
                c21448.m35746(enumC8041);
                this.f70718.m35746(enumC8041);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49646(C21446 c21446, C4201 c4201) {
        SparseArray sparseArray = new SparseArray();
        C19018 c19018 = new C19018();
        sparseArray.clear();
        sparseArray.put(0, c21446);
        C10075 c10075 = this.f70721;
        sparseArray.put(c10075.getId(), c21446);
        for (C15094 c15094 : c21446.f18169) {
            sparseArray.put(((View) c15094.m35760()).getId(), c15094);
        }
        for (C15094 c15095 : c21446.f18169) {
            View view = (View) c15095.m35760();
            c4201.m12670(view.getId(), c19018);
            c15095.m35770(c4201.m12683(view.getId()));
            c15095.m35733(c4201.m12679(view.getId()));
            if (view instanceof AbstractC7539) {
                c4201.m12674((AbstractC7539) view, c15095, c19018, sparseArray);
                if (view instanceof C6128) {
                    ((C6128) view).m20236();
                }
            }
            c19018.resolveLayoutDirection(c10075.getLayoutDirection());
            c10075.applyConstraintsFromLayoutParams(false, view, c15095, c19018, sparseArray);
            if (c4201.m12686(view.getId()) == 1) {
                c15095.m35768(view.getVisibility());
            } else {
                c15095.m35768(c4201.m12687(view.getId()));
            }
        }
        for (C15094 c15096 : c21446.f18169) {
            if (c15096 instanceof C10157) {
                AbstractC7539 abstractC7539 = (AbstractC7539) c15096.m35760();
                C12978 c12978 = (C12978) c15096;
                abstractC7539.m20231(c12978, sparseArray);
                C10157 c10157 = (C10157) c12978;
                for (int i = 0; i < c10157.f38881; i++) {
                    C15094 c15097 = c10157.f38882[i];
                    if (c15097 != null) {
                        c15097.m35766();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15094 m49645(C21446 c21446, View view) {
        if (c21446.m35760() == view) {
            return c21446;
        }
        ArrayList arrayList = c21446.f18169;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) arrayList.get(i);
            if (c15094.m35760() == view) {
                return c15094;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49650() {
        C10075 c10075 = this.f70721;
        int i = c10075.f30310;
        int i2 = c10075.f30352;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        c10075.f30353 = mode;
        c10075.f30321 = mode2;
        int optimizationLevel = c10075.getOptimizationLevel();
        if (c10075.f30314 == c10075.m25322()) {
            c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
            if (this.f70719 != null) {
                c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
            }
        } else {
            if (this.f70719 != null) {
                c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
            }
            c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
        }
        int i3 = 0;
        if (!(c10075.getParent() instanceof C10075) || mode != 1073741824 || mode2 != 1073741824) {
            c10075.f30353 = mode;
            c10075.f30321 = mode2;
            if (c10075.f30314 == c10075.m25322()) {
                c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
                if (this.f70719 != null) {
                    c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
                }
            } else {
                if (this.f70719 != null) {
                    c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
                }
                c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
            }
            c10075.f30327 = this.f70720.m35753();
            c10075.f30333 = this.f70720.m35732();
            c10075.f30330 = this.f70718.m35753();
            int iM35732 = this.f70718.m35732();
            c10075.f30317 = iM35732;
            c10075.f30349 = (c10075.f30327 == c10075.f30330 && c10075.f30333 == iM35732) ? false : true;
        }
        int i4 = c10075.f30327;
        int i5 = c10075.f30333;
        int i6 = c10075.f30353;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((c10075.f30340 * (c10075.f30330 - i4)) + i4);
        }
        int i7 = i4;
        int i8 = c10075.f30321;
        c10075.resolveMeasuredDimension(i, i2, i7, (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((c10075.f30340 * (c10075.f30317 - i5)) + i5) : i5, this.f70720.m48569() || this.f70718.m48569(), this.f70720.m48573() || this.f70718.m48573());
        HashMap map = c10075.f30358;
        int childCount = c10075.getChildCount();
        c10075.f30306.m49648();
        c10075.f30328 = true;
        int width = c10075.getWidth();
        int height = c10075.getHeight();
        C13601 c13601 = c10075.f30357.f22265;
        int i9 = c13601 != null ? c13601.f40570 : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C19248 c19248 = (C19248) map.get(c10075.getChildAt(i10));
                if (c19248 != null) {
                    c19248.m44412(i9);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            C19248 c19249 = (C19248) map.get(c10075.getChildAt(i11));
            if (c19249 != null) {
                c10075.f30357.m19415(c19249);
                c19249.m44404(width, height, System.nanoTime());
            }
        }
        C13601 c13602 = c10075.f30357.f22265;
        float f = c13602 != null ? c13602.f40571 : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                C19248 c192410 = (C19248) map.get(c10075.getChildAt(i12));
                if (!Float.isNaN(c192410.f60604)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C19248 c192411 = (C19248) map.get(c10075.getChildAt(i13));
                        if (!Float.isNaN(c192411.f60604)) {
                            fMin = Math.min(fMin, c192411.f60604);
                            fMax = Math.max(fMax, c192411.f60604);
                        }
                    }
                    while (i3 < childCount) {
                        C19248 c192412 = (C19248) map.get(c10075.getChildAt(i3));
                        if (!Float.isNaN(c192412.f60604)) {
                            c192412.f60593 = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c192412.f60585 = fAbs - (((fMax - c192412.f60604) / (fMax - fMin)) * fAbs);
                            } else {
                                c192412.f60585 = fAbs - (((c192412.f60604 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                float fM44411 = c192410.m44411();
                float fM44414 = c192410.m44414();
                float f2 = z ? fM44414 - fM44411 : fM44414 + fM44411;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
            }
            while (i3 < childCount) {
                C19248 c192413 = (C19248) map.get(c10075.getChildAt(i3));
                float fM44412 = c192413.m44411();
                float fM44415 = c192413.m44414();
                float f3 = z ? fM44415 - fM44412 : fM44415 + fM44412;
                c192413.f60593 = 1.0f / (1.0f - fAbs);
                c192413.f60585 = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49648() {
        C10075 c10075 = this.f70721;
        int childCount = c10075.getChildCount();
        HashMap map = c10075.f30358;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10075.getChildAt(i);
            map.put(childAt, new C19248(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = c10075.getChildAt(i2);
            C19248 c19248 = (C19248) map.get(childAt2);
            if (c19248 != null) {
                if (this.f70719 != null) {
                    C15094 c15094M49645 = m49645(this.f70720, childAt2);
                    if (c15094M49645 != null) {
                        c19248.m44413(c15094M49645, this.f70719);
                    } else if (c10075.f30311 != 0) {
                        C0050.m932();
                        C0050.m933(childAt2);
                        childAt2.getClass();
                    }
                }
                if (this.f70715 != null) {
                    C15094 c15094M49646 = m49645(this.f70718, childAt2);
                    if (c15094M49646 != null) {
                        c19248.m44409(c15094M49646, this.f70715);
                    } else if (c10075.f30311 != 0) {
                        C0050.m932();
                        C0050.m933(childAt2);
                        childAt2.getClass();
                    }
                }
            }
        }
    }
}
