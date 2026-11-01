package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBFX */
/* JADX INFO: loaded from: classes2.dex */
public final class C8524 {

    /* JADX INFO: renamed from: ֫ */
    public final int f22873;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList[] f22874;

    /* JADX INFO: renamed from: ܽ */
    public final BitSet f22875;

    /* JADX INFO: renamed from: ֫ */
    public static void m19820(C21975 c21975) {
        ArrayList[] arrayListArr;
        C8524 c8524 = new C8524(c21975);
        HashSet hashSet = new HashSet();
        BitSet bitSetM49501 = c21975.m49501();
        ArrayList arrayListM49517 = c21975.m49517();
        int i = 0;
        while (true) {
            int iNextClearBit = bitSetM49501.nextClearBit(i);
            int size = arrayListM49517.size();
            arrayListArr = c8524.f22874;
            if (iNextClearBit >= size) {
                break;
            }
            C17950 c17950 = (C17950) arrayListM49517.get(iNextClearBit);
            i = iNextClearBit + 1;
            for (int i2 = 0; i2 < c17950.m40832().size(); i2++) {
                AbstractC15938 abstractC15938 = (AbstractC15938) c17950.m40832().get(i2);
                C21442 c21442Mo31600 = abstractC15938.mo31600();
                int size2 = c21442Mo31600.size();
                if (size2 != 0) {
                    hashSet.add(abstractC15938);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayListArr[c21442Mo31600.m56524get(i3).m50989()].remove(abstractC15938);
                }
                C22783 c22783M36175 = abstractC15938.m36175();
                if (c22783M36175 != null) {
                    for (AbstractC15938 abstractC15939 : arrayListArr[c22783M36175.m50989()]) {
                        if (abstractC15939 instanceof C15229) {
                            ((C15229) abstractC15939).m34675(c22783M36175);
                        }
                    }
                }
            }
        }
        c21975.m49502(hashSet);
        HashSet hashSet2 = new HashSet();
        C24617 c24617 = new C24617();
        BitSet bitSet = c8524.f22875;
        c24617.f77916 = bitSet;
        c21975.m49509(c24617);
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                if (arrayListArr[iNextSetBit].size() == 0 || c8524.m19821(null, iNextSetBit)) {
                    AbstractC15938 abstractC15938M49521 = c21975.m49521(iNextSetBit);
                    if (!hashSet2.contains(abstractC15938M49521)) {
                        C21442 c21442Mo31601 = abstractC15938M49521.mo31600();
                        int size3 = c21442Mo31601.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C22783 c22783M56524get = c21442Mo31601.m56524get(i4);
                            arrayListArr[c22783M56524get.m50989()].remove(abstractC15938M49521);
                            AbstractC15938 abstractC15938M49522 = c21975.m49521(c22783M56524get.m50989());
                            if (!(abstractC15938M49522 == null ? true : abstractC15938M49522.mo31609())) {
                                bitSet.set(c22783M56524get.m50989());
                            }
                        }
                        hashSet2.add(abstractC15938M49521);
                    }
                }
            } else {
                c21975.m49502(hashSet2);
                return;
            }
        }
    }

    public C8524(C21975 c21975) {
        int iM49513 = c21975.m49513();
        this.f22873 = iM49513;
        this.f22875 = new BitSet(iM49513);
        this.f22874 = c21975.m49528();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19821(BitSet bitSet, int i) {
        if (bitSet == null || !bitSet.get(i)) {
            ArrayList[] arrayListArr = this.f22874;
            for (AbstractC15938 abstractC15938 : arrayListArr[i]) {
                if (abstractC15938 == null ? true : abstractC15938.mo31609()) {
                    return false;
                }
            }
            if (bitSet == null) {
                bitSet = new BitSet(this.f22873);
            }
            bitSet.set(i);
            Iterator it = arrayListArr[i].iterator();
            while (it.hasNext()) {
                C22783 c22783M36175 = ((AbstractC15938) it.next()).m36175();
                if (c22783M36175 == null || !m19821(bitSet, c22783M36175.m50989())) {
                    return false;
                }
            }
        }
        return true;
    }
}
