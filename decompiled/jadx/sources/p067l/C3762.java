package p067l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3762 extends C19185 {

    /* JADX INFO: renamed from: ۜ */
    public float f7993;

    /* JADX INFO: renamed from: ܳ */
    public boolean f7994;

    /* JADX INFO: renamed from: ܿ */
    public float f7995;

    /* JADX INFO: renamed from: ᩻ */
    public float f7996;

    public C3762(C12480... c12480Arr) {
        int length = c12480Arr.length;
        this.f57349 = length;
        ArrayList arrayList = new ArrayList();
        this.f57348 = arrayList;
        arrayList.addAll(Arrays.asList(c12480Arr));
        this.f57347 = ((AbstractC17843) arrayList.get(length - 1)).m40520();
        this.f7994 = true;
    }

    public final C3762 clone() {
        ArrayList arrayList = this.f57348;
        int size = arrayList.size();
        C12480[] c12480Arr = new C12480[size];
        for (int i = 0; i < size; i++) {
            c12480Arr[i] = (C12480) ((AbstractC17843) arrayList.get(i)).clone();
        }
        return new C3762(c12480Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m7262(float f) {
        ArrayList arrayList = this.f57348;
        int i = this.f57349;
        if (i == 2) {
            if (this.f7994) {
                this.f7994 = false;
                this.f7996 = ((C12480) arrayList.get(0)).f34989;
                float f2 = ((C12480) arrayList.get(1)).f34989;
                this.f7993 = f2;
                this.f7995 = f2 - this.f7996;
            }
            Interpolator interpolator = this.f57347;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC23209 interfaceC23209 = this.f57346;
            if (interfaceC23209 == null) {
                return (f * this.f7995) + this.f7996;
            }
            return ((Number) interfaceC23209.mo20014(f, Float.valueOf(this.f7996), Float.valueOf(this.f7993))).floatValue();
        }
        if (f <= 0.0f) {
            C12480 c12480 = (C12480) arrayList.get(0);
            C12480 c12481 = (C12480) arrayList.get(1);
            float f3 = c12480.f34989;
            float f4 = c12481.f34989;
            float f5 = c12480.f53240;
            float f6 = c12481.f53240;
            Interpolator interpolatorM40520 = c12481.m40520();
            if (interpolatorM40520 != null) {
                f = interpolatorM40520.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC23209 interfaceC232010 = this.f57346;
            return interfaceC232010 == null ? C21740.m49018(f4, f3, f7, f3) : ((Number) interfaceC232010.mo20014(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            C12480 c12482 = (C12480) arrayList.get(i - 2);
            C12480 c12483 = (C12480) arrayList.get(i - 1);
            float f8 = c12482.f34989;
            float f9 = c12483.f34989;
            float f10 = c12482.f53240;
            float f11 = c12483.f53240;
            Interpolator interpolatorM40521 = c12483.m40520();
            if (interpolatorM40521 != null) {
                f = interpolatorM40521.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC23209 interfaceC232011 = this.f57346;
            return interfaceC232011 == null ? C21740.m49018(f9, f8, f12, f8) : ((Number) interfaceC232011.mo20014(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        C12480 c12484 = (C12480) arrayList.get(0);
        int i2 = 1;
        while (i2 < i) {
            C12480 c12485 = (C12480) arrayList.get(i2);
            if (f < c12485.f53240) {
                Interpolator interpolatorM40522 = c12485.m40520();
                if (interpolatorM40522 != null) {
                    f = interpolatorM40522.getInterpolation(f);
                }
                float f13 = c12484.f53240;
                float f14 = (f - f13) / (c12485.f53240 - f13);
                float f15 = c12484.f34989;
                float f16 = c12485.f34989;
                InterfaceC23209 interfaceC232012 = this.f57346;
                return interfaceC232012 == null ? C21740.m49018(f16, f15, f14, f15) : ((Number) interfaceC232012.mo20014(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c12484 = c12485;
        }
        return ((AbstractC17843) arrayList.get(i - 1)).mo28738().floatValue();
    }
}
