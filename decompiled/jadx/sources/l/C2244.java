package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f7314;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8594[] f7315;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7316;

    public C2244(C20630 c20630, C20589[] c20589Arr) {
        ArrayList arrayListM47190 = c20630.m47190();
        this.f7314 = arrayListM47190;
        this.f7315 = new C8594[arrayListM47190.size() + 2];
        this.f7316 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7433(C20630 c20630, C20589[] c20589Arr) {
        int i;
        C8594[] c8594Arr;
        int i2;
        C2244 c2244 = new C2244(c20630, c20589Arr);
        C16395 c16395M47195 = c20630.m47195();
        ArrayList arrayList = c2244.f7316;
        if (c16395M47195 != null) {
            arrayList.add(c16395M47195);
            c20589Arr[c16395M47195.m38609()].f66282 = c16395M47195.m38609();
        }
        c20630.m47176(new C15648(c2244));
        int size = arrayList.size() - 1;
        int i3 = size;
        while (true) {
            c8594Arr = c2244.f7315;
            if (i3 < 2) {
                break;
            }
            C16395 c16395 = (C16395) arrayList.get(i3);
            C8594 c8594 = c8594Arr[c16395.m38609()];
            BitSet bitSetM38624 = c16395.m38624();
            for (int iNextSetBit = bitSetM38624.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM38624.nextSetBit(iNextSetBit + 1)) {
                C16395 c16396 = (C16395) c2244.f7314.get(iNextSetBit);
                if (c8594Arr[c16396.m38609()] != null && (i2 = c8594Arr[c2244.m7432(c16396).m38609()].f26243) < c8594.f26243) {
                    c8594.f26243 = i2;
                }
            }
            c8594Arr[((C16395) arrayList.get(c8594.f26243)).m38609()].f26241.add(c16395);
            C16395 c16397 = c8594.f26242;
            c8594.f26240 = c16397;
            ArrayList arrayList2 = c8594Arr[c16397.m38609()].f26241;
            while (!arrayList2.isEmpty()) {
                C16395 c16398 = (C16395) C4248.m12790(arrayList2, 1);
                C16395 c16395M7432 = c2244.m7432(c16398);
                if (c8594Arr[c16395M7432.m38609()].f26243 < c8594Arr[c16398.m38609()].f26243) {
                    c20589Arr[c16398.m38609()].f66282 = c16395M7432.m38609();
                } else {
                    c20589Arr[c16398.m38609()].f66282 = c8594.f26242.m38609();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            C16395 c16399 = (C16395) arrayList.get(i);
            if (c20589Arr[c16399.m38609()].f66282 != ((C16395) arrayList.get(c8594Arr[c16399.m38609()].f26243)).m38609()) {
                c20589Arr[c16399.m38609()].f66282 = c20589Arr[c20589Arr[c16399.m38609()].f66282].f66282;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16395 m7432(C16395 c16395) {
        int iM38609 = c16395.m38609();
        C8594[] c8594Arr = this.f7315;
        C8594 c8594 = c8594Arr[iM38609];
        if (c8594.f26240 == null) {
            return c16395;
        }
        if (c8594Arr[c8594Arr[c16395.m38609()].f26240.m38609()].f26240 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(c16395);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                C8594 c8595 = c8594Arr[((C16395) arrayList.get(size)).m38609()];
                C16395 c16396 = c8595.f26240;
                C8594 c8596 = c8594Arr[c16396.m38609()];
                if (hashSet.add(c16396) && c8596.f26240 != null) {
                    arrayList.add(c16396);
                } else {
                    arrayList.remove(size);
                    if (c8596.f26240 != null) {
                        C16395 c16397 = c8596.f26244;
                        if (c8594Arr[c16397.m38609()].f26243 < c8594Arr[c8595.f26244.m38609()].f26243) {
                            c8595.f26244 = c16397;
                        }
                        c8595.f26240 = c8596.f26240;
                    }
                }
            }
        }
        return c8594.f26244;
    }
}
