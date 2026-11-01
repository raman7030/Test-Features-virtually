package p067l;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13373 {

    /* JADX INFO: renamed from: ܳ */
    public static final InterfaceC12032 f37520 = new C14713();

    /* JADX INFO: renamed from: ֫ */
    public final C8008 f37521;

    /* JADX INFO: renamed from: ܽ */
    public final List f37523;

    /* JADX INFO: renamed from: ᩳ */
    public final List f37525;

    /* JADX INFO: renamed from: ܿ */
    public final SparseBooleanArray f37524 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۧ */
    public final C0977 f37522 = new C0977();

    public C13373(List list, ArrayList arrayList) {
        this.f37523 = list;
        this.f37525 = arrayList;
        int size = list.size();
        int iM18587 = Integer.MIN_VALUE;
        C8008 c8008 = null;
        for (int i = 0; i < size; i++) {
            C8008 c8009 = (C8008) list.get(i);
            if (c8009.m18587() > iM18587) {
                iM18587 = c8009.m18587();
                c8008 = c8009;
            }
        }
        this.f37521 = c8008;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8008 m30511(C24101 c24101) {
        return (C8008) this.f37522.getOrDefault(c24101, null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C8008 m30514() {
        return this.f37521;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m30513() {
        C8008 c8008 = this.f37521;
        if (c8008 != null) {
            return c8008.m18588();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX INFO: renamed from: ֫ */
    public final void m30512() {
        int i;
        List list = this.f37525;
        int size = list.size();
        int i2 = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = this.f37524;
            if (i2 < size) {
                C24101 c24101 = (C24101) list.get(i2);
                float[] fArr = c24101.f76519;
                float[] fArr2 = c24101.f76518;
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
                List list2 = this.f37523;
                int size2 = list2.size();
                C8008 c8008 = null;
                int i4 = 0;
                float f4 = 0.0f;
                while (i4 < size2) {
                    C8008 c8009 = (C8008) list2.get(i4);
                    float[] fArrM18586 = c8009.m18586();
                    float f5 = fArrM18586[1];
                    List list3 = list;
                    float[] fArr3 = c24101.f76517;
                    if (f5 < fArr2[0] || f5 > fArr2[2]) {
                        i = size;
                    } else {
                        float f6 = fArrM18586[2];
                        if (f6 < fArr3[0] || f6 > fArr3[2] || sparseBooleanArray.get(c8009.m18588())) {
                            i = size;
                        } else {
                            float[] fArrM18587 = c8009.m18586();
                            C8008 c80010 = this.f37521;
                            int iM18587 = c80010 != null ? c80010.m18587() : 1;
                            i = size;
                            float[] fArr4 = c24101.f76519;
                            float f7 = fArr4[0];
                            float fAbs = f7 > 0.0f ? (1.0f - Math.abs(fArrM18587[1] - fArr2[1])) * f7 : 0.0f;
                            float f8 = fArr4[1];
                            float fAbs2 = f8 > 0.0f ? (1.0f - Math.abs(fArrM18587[2] - fArr3[1])) * f8 : 0.0f;
                            float f9 = fArr4[2];
                            float fM18587 = fAbs + fAbs2 + (f9 > 0.0f ? (c8009.m18587() / iM18587) * f9 : 0.0f);
                            if (c8008 == null || fM18587 > f4) {
                                c8008 = c8009;
                                f4 = fM18587;
                            }
                        }
                    }
                    i4++;
                    list = list3;
                    size = i;
                }
                List list4 = list;
                int i5 = size;
                if (c8008 != null) {
                    sparseBooleanArray.append(c8008.m18588(), true);
                }
                this.f37522.put(c24101, c8008);
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
