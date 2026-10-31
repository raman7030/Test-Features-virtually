package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBFX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6477 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19998;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList[] f19999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet f20000;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17872(C20630 c20630) {
        ArrayList[] arrayListArr;
        C6477 c6477 = new C6477(c20630);
        HashSet hashSet = new HashSet();
        BitSet bitSetM47174 = c20630.m47174();
        ArrayList arrayListM47190 = c20630.m47190();
        int i = 0;
        while (true) {
            int iNextClearBit = bitSetM47174.nextClearBit(i);
            int size = arrayListM47190.size();
            arrayListArr = c6477.f19999;
            if (iNextClearBit >= size) {
                break;
            }
            C16395 c16395 = (C16395) arrayListM47190.get(iNextClearBit);
            i = iNextClearBit + 1;
            for (int i2 = 0; i2 < c16395.m38615().size(); i2++) {
                AbstractC14278 abstractC14278 = (AbstractC14278) c16395.m38615().get(i2);
                C20069 c20069Mo29535 = abstractC14278.mo29535();
                int size2 = c20069Mo29535.size();
                if (size2 != 0) {
                    hashSet.add(abstractC14278);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayListArr[c20069Mo29535.m41004get(i3).m48652()].remove(abstractC14278);
                }
                C21480 c21480M34042 = abstractC14278.m34042();
                if (c21480M34042 != null) {
                    for (AbstractC14278 abstractC14279 : arrayListArr[c21480M34042.m48652()]) {
                        if (abstractC14279 instanceof C13532) {
                            ((C13532) abstractC14279).m32572(c21480M34042);
                        }
                    }
                }
            }
        }
        c20630.m47175(hashSet);
        HashSet hashSet2 = new HashSet();
        C23410 c23410 = new C23410();
        BitSet bitSet = c6477.f20000;
        c23410.f75170 = bitSet;
        c20630.m47182(c23410);
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit >= 0) {
                bitSet.clear(iNextSetBit);
                if (arrayListArr[iNextSetBit].size() == 0 || c6477.m17873(null, iNextSetBit)) {
                    AbstractC14278 abstractC14278M47194 = c20630.m47194(iNextSetBit);
                    if (!hashSet2.contains(abstractC14278M47194)) {
                        C20069 c20069Mo29536 = abstractC14278M47194.mo29535();
                        int size3 = c20069Mo29536.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C21480 c21480M41004get = c20069Mo29536.m41004get(i4);
                            arrayListArr[c21480M41004get.m48652()].remove(abstractC14278M47194);
                            AbstractC14278 abstractC14278M47195 = c20630.m47194(c21480M41004get.m48652());
                            if (!(abstractC14278M47195 == null ? true : abstractC14278M47195.mo29544())) {
                                bitSet.set(c21480M41004get.m48652());
                            }
                        }
                        hashSet2.add(abstractC14278M47194);
                    }
                }
            } else {
                c20630.m47175(hashSet2);
                return;
            }
        }
    }

    public C6477(C20630 c20630) {
        int iM47186 = c20630.m47186();
        this.f19998 = iM47186;
        this.f20000 = new BitSet(iM47186);
        this.f19999 = c20630.m47201();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17873(BitSet bitSet, int i) {
        if (bitSet == null || !bitSet.get(i)) {
            ArrayList[] arrayListArr = this.f19999;
            for (AbstractC14278 abstractC14278 : arrayListArr[i]) {
                if (abstractC14278 == null ? true : abstractC14278.mo29544()) {
                    return false;
                }
            }
            if (bitSet == null) {
                bitSet = new BitSet(this.f19998);
            }
            bitSet.set(i);
            Iterator it = arrayListArr[i].iterator();
            while (it.hasNext()) {
                C21480 c21480M34042 = ((AbstractC14278) it.next()).m34042();
                if (c21480M34042 == null || !m17873(bitSet, c21480M34042.m48652())) {
                    return false;
                }
            }
        }
        return true;
    }
}
