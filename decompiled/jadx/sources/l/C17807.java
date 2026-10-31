package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAJU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17807 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20630 m41737(C13012 c13012, int i) {
        C20630 c20630M47168 = C20630.m47168(c13012, i);
        ArrayList arrayListM47190 = c20630M47168.m47190();
        for (int size = arrayListM47190.size() - 1; size >= 0; size--) {
            C16395 c16395 = (C16395) arrayListM47190.get(size);
            int iCardinality = c16395.m38624().cardinality();
            int iCardinality2 = c16395.m38604().cardinality();
            if (iCardinality > 1 && iCardinality2 > 1) {
                c16395.m38621();
            }
        }
        ArrayList arrayListM47191 = c20630M47168.m47190();
        for (int size2 = arrayListM47191.size() - 1; size2 >= 0; size2--) {
            C16395 c16396 = (C16395) arrayListM47191.get(size2);
            if (!c16396.m38622() && c16396.m38624().cardinality() > 1 && ((AbstractC14278) c16396.m38615().get(0)).mo29530()) {
                BitSet bitSet = (BitSet) c16396.m38624().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((C16395) arrayListM47191.get(iNextSetBit)).m38616(c16396).m38615().add(0, ((AbstractC14278) c16396.m38615().get(0)).clone());
                }
                c16396.m38615().remove(0);
            }
        }
        ArrayList arrayListM47192 = c20630M47168.m47190();
        for (int size3 = arrayListM47192.size() - 1; size3 >= 0; size3--) {
            C16395 c16397 = (C16395) arrayListM47192.get(size3);
            BitSet bitSet2 = (BitSet) c16397.m38604().clone();
            for (int iNextSetBit2 = bitSet2.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1)) {
                C16395 c16398 = (C16395) arrayListM47192.get(iNextSetBit2);
                AbstractC14278 abstractC14278 = (AbstractC14278) C18566.m43105(c16397.m38615(), 1);
                if ((c16397.m38604().cardinality() > 1 && c16398.m38624().cardinality() > 1) || ((abstractC14278.m34042() != null || abstractC14278.mo29535().size() > 0) && c16398.m38624().cardinality() > 1)) {
                    c16397.m38616(c16398);
                }
            }
        }
        m41739(c20630M47168, C22000.m49495(c20630M47168), 0);
        new RunnableC3696(c20630M47168).run();
        c20630M47168.m47188();
        return c20630M47168;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41738(int i, C20630 c20630) {
        m41739(c20630, C22000.m49495(c20630), i);
        new RunnableC3696(i, c20630).run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41739(C20630 c20630, C19884 c19884, int i) {
        ArrayList arrayListM47190 = c20630.m47190();
        int size = arrayListM47190.size();
        int iM47186 = c20630.m47186() - i;
        C20589[] c20589ArrM23864 = new C9300(c20630).m23864();
        BitSet[] bitSetArr = new BitSet[iM47186];
        BitSet[] bitSetArr2 = new BitSet[iM47186];
        for (int i2 = 0; i2 < iM47186; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListM47190.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C16395) arrayListM47190.get(i3)).m38615().iterator();
            while (it.hasNext()) {
                C21480 c21480M34042 = ((AbstractC14278) it.next()).m34042();
                if (c21480M34042 != null && c21480M34042.m48652() - i >= 0) {
                    bitSetArr[c21480M34042.m48652() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iM47186; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    InterfaceC6952 it2 = c20589ArrM23864[iNextSetBit].f66281.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            C21480 c21480 = c19884.m45712(next).get(i5);
                            if (c21480 == null) {
                                ((C16395) arrayListM47190.get(next)).m38617(i5);
                            } else {
                                ((C16395) arrayListM47190.get(next)).m38600(c21480);
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
