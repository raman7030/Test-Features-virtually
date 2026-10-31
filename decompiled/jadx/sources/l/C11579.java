package l;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11579 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC10168 f34521 = new C12989();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5934 f34522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f34524;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f34526;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f34525 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2727 f34523 = new C2727();

    public C11579(List list, ArrayList arrayList) {
        this.f34524 = list;
        this.f34526 = arrayList;
        int size = list.size();
        int iM16661 = Integer.MIN_VALUE;
        C5934 c5934 = null;
        for (int i = 0; i < size; i++) {
            C5934 c5935 = (C5934) list.get(i);
            if (c5935.m16661() > iM16661) {
                iM16661 = c5935.m16661();
                c5934 = c5935;
            }
        }
        this.f34522 = c5934;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5934 m28465(C22867 c22867) {
        return (C5934) this.f34523.getOrDefault(c22867, null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5934 m28468() {
        return this.f34522;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m28467() {
        C5934 c5934 = this.f34522;
        if (c5934 != null) {
            return c5934.m16662();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28466() {
        int i;
        List list = this.f34526;
        int size = list.size();
        int i2 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.f34525;
            if (i2 < size) {
                C22867 c22867 = (C22867) list.get(i2);
                float[] fArr = c22867.f73788;
                float[] fArr2 = c22867.f73787;
                float f = 0.0f;
                for (float f2 : fArr) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
                if (f != 0.0f) {
                    int length = fArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        float f3 = fArr[i3];
                        if (f3 > 0.0f) {
                            fArr[i3] = f3 / f;
                        }
                    }
                }
                List list2 = this.f34524;
                int size2 = list2.size();
                C5934 c5934 = null;
                int i4 = 0;
                float f4 = 0.0f;
                while (i4 < size2) {
                    C5934 c5935 = (C5934) list2.get(i4);
                    float[] fArrM16660 = c5935.m16660();
                    float f5 = fArrM16660[1];
                    List list3 = list;
                    float[] fArr3 = c22867.f73786;
                    if (f5 < fArr2[0] || f5 > fArr2[2]) {
                        i = size;
                    } else {
                        float f6 = fArrM16660[2];
                        if (f6 < fArr3[0] || f6 > fArr3[2] || sparseBooleanArray.get(c5935.m16662())) {
                            i = size;
                        } else {
                            float[] fArrM16661 = c5935.m16660();
                            C5934 c5936 = this.f34522;
                            int iM16661 = c5936 != null ? c5936.m16661() : 1;
                            i = size;
                            float[] fArr4 = c22867.f73788;
                            float f7 = fArr4[0];
                            float fAbs = f7 > 0.0f ? (1.0f - Math.abs(fArrM16661[1] - fArr2[1])) * f7 : 0.0f;
                            float f8 = fArr4[1];
                            float fAbs2 = f8 > 0.0f ? (1.0f - Math.abs(fArrM16661[2] - fArr3[1])) * f8 : 0.0f;
                            float f9 = fArr4[2];
                            float fM16661 = fAbs + fAbs2 + (f9 > 0.0f ? (c5935.m16661() / iM16661) * f9 : 0.0f);
                            if (c5934 == null || fM16661 > f4) {
                                c5934 = c5935;
                                f4 = fM16661;
                            }
                        }
                    }
                    i4++;
                    list = list3;
                    size = i;
                }
                List list4 = list;
                int i5 = size;
                if (c5934 != null) {
                    sparseBooleanArray.append(c5934.m16662(), true);
                }
                this.f34523.put(c22867, c5934);
                i2++;
                list = list4;
                size = i5;
            } else {
                sparseBooleanArray.clear();
                return;
            }
        }
    }
}
