package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1467 extends C17695 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f5220;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5221;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f5222;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f5223;

    public C1467(C10640... c10640Arr) {
        int length = c10640Arr.length;
        this.f54157 = length;
        ArrayList arrayList = new ArrayList();
        this.f54156 = arrayList;
        arrayList.addAll(Arrays.asList(c10640Arr));
        this.f54155 = ((AbstractC16283) arrayList.get(length - 1)).m38306();
        this.f5221 = true;
    }

    public final C1467 clone() {
        ArrayList arrayList = this.f54156;
        int size = arrayList.size();
        C10640[] c10640Arr = new C10640[size];
        for (int i = 0; i < size; i++) {
            c10640Arr[i] = (C10640) ((AbstractC16283) arrayList.get(i)).clone();
        }
        return new C1467(c10640Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m5019(float f) {
        ArrayList arrayList = this.f54156;
        int i = this.f54157;
        if (i == 2) {
            if (this.f5221) {
                this.f5221 = false;
                this.f5223 = ((C10640) arrayList.get(0)).f32018;
                float f2 = ((C10640) arrayList.get(1)).f32018;
                this.f5220 = f2;
                this.f5222 = f2 - this.f5223;
            }
            Interpolator interpolator = this.f54155;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC21929 interfaceC21929 = this.f54154;
            if (interfaceC21929 == null) {
                return (f * this.f5222) + this.f5223;
            }
            return ((Number) interfaceC21929.mo18064(f, Float.valueOf(this.f5223), Float.valueOf(this.f5220))).floatValue();
        }
        if (f <= 0.0f) {
            C10640 c10640 = (C10640) arrayList.get(0);
            C10640 c10641 = (C10640) arrayList.get(1);
            float f3 = c10640.f32018;
            float f4 = c10641.f32018;
            float f5 = c10640.f50073;
            float f6 = c10641.f50073;
            Interpolator interpolatorM38306 = c10641.m38306();
            if (interpolatorM38306 != null) {
                f = interpolatorM38306.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC21929 interfaceC219210 = this.f54154;
            return interfaceC219210 == null ? C20382.m46695(f4, f3, f7, f3) : ((Number) interfaceC219210.mo18064(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            C10640 c10642 = (C10640) arrayList.get(i - 2);
            C10640 c10643 = (C10640) arrayList.get(i - 1);
            float f8 = c10642.f32018;
            float f9 = c10643.f32018;
            float f10 = c10642.f50073;
            float f11 = c10643.f50073;
            Interpolator interpolatorM38307 = c10643.m38306();
            if (interpolatorM38307 != null) {
                f = interpolatorM38307.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC21929 interfaceC219211 = this.f54154;
            return interfaceC219211 == null ? C20382.m46695(f9, f8, f12, f8) : ((Number) interfaceC219211.mo18064(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        C10640 c10644 = (C10640) arrayList.get(0);
        int i2 = 1;
        while (i2 < i) {
            C10640 c10645 = (C10640) arrayList.get(i2);
            if (f < c10645.f50073) {
                Interpolator interpolatorM38308 = c10645.m38306();
                if (interpolatorM38308 != null) {
                    f = interpolatorM38308.getInterpolation(f);
                }
                float f13 = c10644.f50073;
                float f14 = (f - f13) / (c10645.f50073 - f13);
                float f15 = c10644.f32018;
                float f16 = c10645.f32018;
                InterfaceC21929 interfaceC219212 = this.f54154;
                return interfaceC219212 == null ? C20382.m46695(f16, f15, f14, f15) : ((Number) interfaceC219212.mo18064(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c10644 = c10645;
        }
        return ((AbstractC16283) arrayList.get(i - 1)).mo26698().floatValue();
    }
}
