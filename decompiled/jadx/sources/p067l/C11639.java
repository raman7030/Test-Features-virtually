package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11639 {

    /* JADX INFO: renamed from: ֫ */
    public final C8956 f32475;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f32476;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C10968 f32477;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f32478 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public int f32479;

    /* JADX INFO: renamed from: ᩳ */
    public int f32480;

    /* JADX INFO: renamed from: ᩻ */
    public final BitSet f32481;

    public C11639(C10968 c10968, C8956 c8956, ArrayList arrayList) {
        this.f32477 = c10968;
        this.f32481 = new BitSet(c10968.f30376);
        this.f32475 = c8956;
        this.f32476 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26748(C18088 c18088) {
        C22388 c22388M50240;
        int i = 0;
        this.f32479 = c18088.m41137().get(0);
        int i2 = 1;
        int i3 = c18088.m41137().get(1);
        this.f32480 = i3;
        int iM26747 = m26747(i3);
        BitSet bitSet = this.f32481;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f32476;
            C10968 c10968 = this.f32477;
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                int iIntValue = ((Integer) this.f32478.get(Integer.valueOf(iNextSetBit))).intValue();
                C18088 c18088M25303 = c10968.m25303(iNextSetBit);
                C22388 c22388M41137 = c18088M25303.m41137();
                int i4 = -1;
                if (C10968.m25301(c10968, c18088M25303)) {
                    int iM26748 = m26747(c22388M41137.get(i));
                    int i5 = c22388M41137.get(i2);
                    c22388M50240 = new C22388(2);
                    c22388M50240.add(iM26748);
                    c22388M50240.add(i5);
                    c22388M50240.mo22326();
                } else {
                    C22368 c22368M25304 = C10968.m25304(c10968, iNextSetBit);
                    if (c22368M25304 != null) {
                        if (c22368M25304.f70585 != this.f32480) {
                            throw new RuntimeException("ret instruction returns to label " + C16351.m37153(c22368M25304.f70585) + " expected: " + C16351.m37153(this.f32480));
                        }
                        c22388M50240 = C22388.m50240(this.f32479);
                        i4 = this.f32479;
                    } else {
                        int iM41139 = c18088M25303.m41139();
                        int size = c22388M41137.size();
                        C22388 c22388 = new C22388(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            int i7 = c22388M41137.get(i6);
                            int iM26749 = m26747(i7);
                            c22388.add(iM26749);
                            if (iM41139 == i7) {
                                i4 = iM26749;
                            }
                        }
                        c22388.mo22326();
                        c22388M50240 = c22388;
                    }
                }
                C4678 c4678M41142 = c18088M25303.m41142();
                int size2 = c4678M41142.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    if (c4678M41142.m56521get(i9).m39656() != C14065.f39824) {
                        i8++;
                    }
                }
                if (i8 != size2) {
                    C4678 c4678 = new C4678(i8);
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size2) {
                        AbstractC17417 abstractC17417M56521get = c4678M41142.m56521get(i10);
                        C4678 c4679 = c4678M41142;
                        int i12 = size2;
                        if (abstractC17417M56521get.m39656() != C14065.f39824) {
                            c4678.m43246(i11, abstractC17417M56521get);
                            i11++;
                        }
                        i10++;
                        c4678M41142 = c4679;
                        size2 = i12;
                    }
                    c4678.mo22326();
                    c4678M41142 = c4678;
                }
                c10968.m25300(new C18088(iIntValue, c4678M41142, c22388M50240, i4), (C22388) arrayList.get(iIntValue));
                if (C10968.m25301(c10968, c10968.m25303(iNextSetBit))) {
                    new C11639(c10968, this.f32475, arrayList).m26748(c10968.m25303(iIntValue));
                }
                i = 0;
                iNextSetBit = bitSet.nextSetBit(0);
                i2 = 1;
            } else {
                C10968.m25306(c10968, new C18088(c18088.mo4636(), c18088.m41142(), C22388.m50240(iM26747), iM26747), (C22388) arrayList.get(c18088.mo4636()));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26747(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f32478;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i2 = this.f32480;
        ArrayList arrayList = this.f32476;
        C22388 c22388 = (C22388) arrayList.get(i);
        if (c22388 == null || c22388.size() <= 0 || c22388.m50247() != i2) {
            return i;
        }
        int iMo20691 = this.f32475.mo20691();
        this.f32481.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo20691));
        while (arrayList.size() <= iMo20691) {
            arrayList.add(null);
        }
        arrayList.set(iMo20691, (C22388) arrayList.get(i));
        return iMo20691;
    }
}
