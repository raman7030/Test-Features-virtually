package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAJU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19292 {
    /* JADX INFO: renamed from: ֫ */
    public static C21975 m43983(C14735 c14735, int i) {
        C21975 c21975M49495 = C21975.m49495(c14735, i);
        ArrayList arrayListM49517 = c21975M49495.m49517();
        for (int size = arrayListM49517.size() - 1; size >= 0; size--) {
            C17950 c17950 = (C17950) arrayListM49517.get(size);
            int iCardinality = c17950.m40841().cardinality();
            int iCardinality2 = c17950.m40821().cardinality();
            if (iCardinality > 1 && iCardinality2 > 1) {
                c17950.m40838();
            }
        }
        ArrayList arrayListM49518 = c21975M49495.m49517();
        for (int size2 = arrayListM49518.size() - 1; size2 >= 0; size2--) {
            C17950 c17951 = (C17950) arrayListM49518.get(size2);
            if (!c17951.m40839() && c17951.m40841().cardinality() > 1 && ((AbstractC15938) c17951.m40832().get(0)).mo31595()) {
                BitSet bitSet = (BitSet) c17951.m40841().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((C17950) arrayListM49518.get(iNextSetBit)).m40833(c17951).m40832().add(0, ((AbstractC15938) c17951.m40832().get(0)).clone());
                }
                c17951.m40832().remove(0);
            }
        }
        ArrayList arrayListM49519 = c21975M49495.m49517();
        for (int size3 = arrayListM49519.size() - 1; size3 >= 0; size3--) {
            C17950 c17952 = (C17950) arrayListM49519.get(size3);
            BitSet bitSet2 = (BitSet) c17952.m40821().clone();
            for (int iNextSetBit2 = bitSet2.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1)) {
                C17950 c17953 = (C17950) arrayListM49519.get(iNextSetBit2);
                AbstractC15938 abstractC15938 = (AbstractC15938) C20013.m45383(c17952.m40832(), 1);
                if ((c17952.m40821().cardinality() > 1 && c17953.m40841().cardinality() > 1) || ((abstractC15938.m36175() != null || abstractC15938.mo31600().size() > 0) && c17953.m40841().cardinality() > 1)) {
                    c17952.m40833(c17953);
                }
            }
        }
        m43985(c21975M49495, C23277.m51830(c21975M49495), 0);
        new RunnableC5881(c21975M49495).run();
        c21975M49495.m49515();
        return c21975M49495;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43984(int i, C21975 c21975) {
        m43985(c21975, C23277.m51830(c21975), i);
        new RunnableC5881(i, c21975).run();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43985(C21975 c21975, C21266 c21266, int i) {
        ArrayList arrayListM49517 = c21975.m49517();
        int size = arrayListM49517.size();
        int iM49513 = c21975.m49513() - i;
        C21936[] c21936ArrM25873 = new C11207(c21975).m25873();
        BitSet[] bitSetArr = new BitSet[iM49513];
        BitSet[] bitSetArr2 = new BitSet[iM49513];
        for (int i2 = 0; i2 < iM49513; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM49517.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C17950) arrayListM49517.get(i3)).m40832().iterator();
            while (it.hasNext()) {
                C22783 c22783M36175 = ((AbstractC15938) it.next()).m36175();
                if (c22783M36175 != null && c22783M36175.m50989() - i >= 0) {
                    bitSetArr[c22783M36175.m50989() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM49513; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    InterfaceC8976 it2 = c21936ArrM25873[iNextSetBit].f68962.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            C22783 c22783 = c21266.m48023(next).get(i5);
                            if (c22783 == null) {
                                ((C17950) arrayListM49517.get(next)).m40834(i5);
                            } else {
                                ((C17950) arrayListM49517.get(next)).m40817(c22783);
                            }
                            if (!bitSetArr[i4].get(next)) {
                                bitSet.set(next);
                            }
                        }
                    }
                }
            }
        }
    }
}
