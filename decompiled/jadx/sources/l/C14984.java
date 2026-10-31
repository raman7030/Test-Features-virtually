package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14984 extends AbstractC2991 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45678;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final BitSet f45679;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final BitSet f45680;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45681;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45682;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7888 f45683;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f45684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f45685;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f45686;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35484(int i) {
        return (i & 1) == 0;
    }

    public C14984(C20630 c20630, C22041 c22041) {
        super(c20630, c22041);
        this.f45680 = new BitSet(c20630.m47186());
        this.f45683 = new C7888(c22041, c20630.m47186());
        int iM47202 = c20630.m47202();
        this.f45686 = iM47202;
        int i = iM47202 * 2;
        BitSet bitSet = new BitSet(i);
        this.f45685 = bitSet;
        bitSet.set(0, iM47202);
        this.f45679 = new BitSet(i);
        this.f45684 = new TreeMap();
        this.f45681 = new ArrayList();
        this.f45682 = new ArrayList();
        this.f45678 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m35487(int i) {
        C3135 c3135Mo29537;
        AbstractC14278 abstractC14278M47194 = this.f9435.m47194(i);
        if (abstractC14278M47194 == null || (c3135Mo29537 = abstractC14278M47194.mo29537()) == null || c3135Mo29537.m9562() != 3) {
            return -1;
        }
        return ((C2635) ((AbstractC14423) abstractC14278M47194.mo29542()).m34454()).mo2231();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35485(int i, int i2, ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C21480 c21480 = (C21480) it.next();
            if (!this.f45680.get(c21480.m48652())) {
                boolean zM35486 = m35486(c21480, i, i2);
                z2 = !zM35486 || z2;
                if (zM35486 && z) {
                    this.f45685.set(i, c21480.m48645() + i, true);
                }
            }
        }
        return !z2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35486(C21480 c21480, int i, int i2) {
        if (c21480.m48645() > i2 || this.f45680.get(c21480.m48652()) || !m35489(i, c21480)) {
            return false;
        }
        m35483(i, c21480);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35479(int i, int i2) {
        EnumC0873 enumC0873 = EnumC0873.f3433;
        if (i2 == 2) {
            if ((this.f45686 & 1) == 0) {
                enumC0873 = EnumC0873.f3436;
            } else {
                enumC0873 = EnumC0873.f3434;
            }
        }
        return m35480(i, i2, enumC0873);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35480(int i, int i2, EnumC0873 enumC0873) {
        BitSet bitSet = this.f45685;
        int iMo1286 = enumC0873.mo1286(bitSet, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !bitSet.get(iMo1286 + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo1286;
            }
            iMo1286 = enumC0873.mo1286(bitSet, iMo1286 + i3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m35489(int i, C21480 c21480) {
        int iM48645 = c21480.m48645();
        int i2 = this.f45686;
        if (i < i2 && iM48645 + i > i2) {
            return false;
        }
        C7888 c7888 = this.f45683;
        c7888.getClass();
        return !c7888.m21171(c21480.m48652(), i, c21480.m48645());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7888 m35492() {
        BitSet bitSet;
        C7888 c7888;
        int i;
        Iterator it;
        BitSet bitSet2;
        C18658 c18658;
        EnumC0873 enumC0873;
        int iM38501;
        int i2;
        int i3;
        int iM48645;
        C18513 c18513 = new C18513(this);
        C20630 c20630 = this.f9435;
        c20630.m47182(c18513);
        TreeMap treeMap = this.f45684;
        for (ArrayList arrayList : treeMap.values()) {
            int size = arrayList.size();
            int i4 = -1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    iM48645 = 0;
                    break;
                }
                C21480 c21480 = (C21480) arrayList.get(i5);
                int iM35487 = m35487(c21480.m48652());
                if (iM35487 >= 0) {
                    iM48645 = c21480.m48645();
                    m35483(iM35487, c21480);
                    i4 = iM35487;
                    break;
                }
                i5++;
                i4 = iM35487;
            }
            if (i4 >= 0) {
                m35485(i4, iM48645, arrayList, true);
            }
        }
        int iM47186 = c20630.m47186();
        int i6 = 0;
        while (true) {
            bitSet = this.f45680;
            if (i6 >= iM47186) {
                break;
            }
            if (!bitSet.get(i6)) {
                int iM35488 = m35487(i6);
                AbstractC14278 abstractC14278M47194 = c20630.m47194(i6);
                C21480 c21480M34042 = abstractC14278M47194 == null ? null : abstractC14278M47194.m34042();
                if (iM35488 >= 0) {
                    m35483(iM35488, c21480M34042);
                }
            }
            i6++;
        }
        Iterator it2 = this.f45682.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c7888 = this.f45683;
            i = this.f45686;
            if (!zHasNext) {
                break;
            }
            C12122 c12122 = (C12122) it2.next();
            C20069 c20069Mo29535 = c12122.mo29535();
            int size2 = c20069Mo29535.size();
            int[] iArr = new int[size2];
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                int iM48646 = c20069Mo29535.m41004get(i8).m48645();
                iArr[i8] = iM48646;
                i7 += iM48646;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            int iM35480 = -1;
            BitSet bitSet3 = null;
            while (true) {
                if (i10 >= size2) {
                    it = it2;
                    break;
                }
                it = it2;
                int iM48652 = c20069Mo29535.m41004get(i10).m48652();
                if (i10 != 0) {
                    i11 -= iArr[i10 - 1];
                }
                if (bitSet.get(iM48652) && (iM38501 = c7888.m38501(iM48652) + i11) >= 0) {
                    i2 = i11;
                    if (iM38501 >= i || iM38501 + i7 <= i) {
                        BitSet bitSet4 = new BitSet(size2);
                        i3 = iM35480;
                        int iM35481 = m35481(iM38501, c12122, iArr, bitSet4);
                        if (iM35481 >= 0) {
                            int iCardinality = iM35481 - bitSet4.cardinality();
                            if (iCardinality > i9) {
                                i9 = iCardinality;
                                bitSet3 = bitSet4;
                                i3 = iM38501;
                            }
                            if (iM35481 == i7) {
                                iM35480 = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    iM35480 = i3;
                    i10++;
                    i11 = i2;
                    it2 = it;
                } else {
                    i2 = i11;
                }
                i3 = iM35480;
                iM35480 = i3;
                i10++;
                i11 = i2;
                it2 = it;
            }
            if (iM35480 == -1) {
                bitSet2 = new BitSet(size2);
                EnumC0873 enumC0874 = EnumC0873.f3433;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i12 < size2) {
                    EnumC0873 enumC0875 = enumC0874;
                    int i16 = size2;
                    if (iArr[i12] == 2) {
                        if ((i15 & 1) == 0) {
                            i14++;
                        } else {
                            i13++;
                        }
                        i15 += 2;
                    } else {
                        i15++;
                    }
                    i12++;
                    enumC0874 = enumC0875;
                    size2 = i16;
                }
                EnumC0873 enumC0876 = enumC0874;
                if (i13 > i14) {
                    enumC0873 = (i & 1) == 0 ? EnumC0873.f3434 : EnumC0873.f3436;
                } else if (i14 > 0) {
                    enumC0873 = (i & 1) == 0 ? EnumC0873.f3436 : EnumC0873.f3434;
                } else {
                    enumC0873 = enumC0876;
                }
                while (true) {
                    iM35480 = m35480(i, i7, enumC0873);
                    if (m35481(iM35480, c12122, iArr, bitSet2) >= 0) {
                        break;
                    }
                    i = iM35480 + 1;
                    bitSet2.clear();
                }
            } else {
                bitSet2 = bitSet3;
            }
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                c12122.m29532(iNextSetBit, m9125(c12122, c20069Mo29535.m41004get(iNextSetBit)));
            }
            C20069 c20069Mo29536 = c12122.mo29535();
            int size3 = c20069Mo29536.size();
            int i17 = 0;
            while (i17 < size3) {
                C21480 c21480M41004get = c20069Mo29536.m41004get(i17);
                int iM48653 = c21480M41004get.m48652();
                int iM48647 = c21480M41004get.m48645();
                int i18 = iM35480 + iM48647;
                if (!bitSet.get(iM48653)) {
                    Iterator it3 = treeMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c18658 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = ((ArrayList) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            if (((C21480) it4.next()).m48652() == iM48653) {
                                c18658 = (C18658) entry.getKey();
                                break;
                            }
                        }
                    }
                    m35483(iM35480, c21480M41004get);
                    if (c18658 != null) {
                        this.f45685.set(iM35480, i18, true);
                        ArrayList arrayList2 = (ArrayList) treeMap.get(c18658);
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            C21480 c21481 = (C21480) arrayList2.get(i19);
                            if (-1 == c20069Mo29536.m46260(c21481.m48652())) {
                                m35486(c21481, iM35480, iM48647);
                            }
                        }
                    }
                }
                i17++;
                iM35480 = i18;
            }
            it2 = it;
        }
        for (ArrayList arrayList3 : treeMap.values()) {
            boolean zM35485 = false;
            int i20 = i;
            do {
                int size5 = arrayList3.size();
                int i21 = 1;
                for (int i22 = 0; i22 < size5; i22++) {
                    C21480 c21482 = (C21480) arrayList3.get(i22);
                    int iM48648 = c21482.m48645();
                    if (!bitSet.get(c21482.m48652()) && iM48648 > i21) {
                        i21 = iM48648;
                    }
                }
                EnumC0873 enumC0877 = EnumC0873.f3433;
                if (i21 == 2) {
                    enumC0877 = (i & 1) == 0 ? EnumC0873.f3436 : EnumC0873.f3434;
                }
                BitSet bitSet5 = this.f45679;
                int iMo1286 = enumC0877.mo1286(bitSet5, i20);
                while (true) {
                    int i23 = 1;
                    while (i23 < i21 && !bitSet5.get(iMo1286 + i23)) {
                        i23++;
                    }
                    if (i23 == i21) {
                        break;
                    }
                    iMo1286 = enumC0877.mo1286(bitSet5, iMo1286 + i23);
                }
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        zM35485 = m35485(iMo1286, i21, arrayList3, true);
                        break;
                    }
                    C21480 c21483 = (C21480) it5.next();
                    if (!bitSet.get(c21483.m48652()) && !m35489(iMo1286, c21483)) {
                        break;
                    }
                }
                i20 = iMo1286 + 1;
            } while (!zM35485);
        }
        for (C12122 c12123 : this.f45681) {
            C21480 c21480M34043 = c12123.m34042();
            int iM48654 = c21480M34043.m48652();
            BitSet bitSetM38624 = c12123.m34044().m38624();
            if (bitSetM38624.cardinality() == 1) {
                AbstractC14278 abstractC14278 = (AbstractC14278) C18566.m43105(((C16395) c20630.m47190().get(bitSetM38624.nextSetBit(0))).m38615(), 1);
                if (abstractC14278.mo29537().m9562() == 43) {
                    C21480 c21480M41004get2 = abstractC14278.mo29535().m41004get(0);
                    int iM48655 = c21480M41004get2.m48652();
                    int iM48649 = c21480M41004get2.m48645();
                    boolean zM35486 = bitSet.get(iM48654);
                    boolean zM35487 = bitSet.get(iM48655);
                    if ((!zM35487) & zM35486) {
                        zM35487 = m35486(c21480M41004get2, c7888.m38501(iM48654), iM48649);
                    }
                    if ((!zM35486) & zM35487) {
                        zM35486 = m35486(c21480M34043, c7888.m38501(iM48655), iM48649);
                    }
                    if (!zM35486 || !zM35487) {
                        int iM35479 = m35479(i, iM48649);
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(c21480M34043);
                        arrayList4.add(c21480M41004get2);
                        while (!m35485(iM35479, iM48649, arrayList4, false)) {
                            iM35479 = m35479(iM35479 + 1, iM48649);
                        }
                    }
                    boolean z = abstractC14278.mo29542().mo3533().size() != 0;
                    int iM38502 = c7888.m38501(iM48654);
                    if (iM38502 != c7888.m38501(iM48655) && !z) {
                        ((C12122) abstractC14278).m29532(0, m9125(abstractC14278, c21480M41004get2));
                        m35483(iM38502, abstractC14278.mo29535().m41004get(0));
                    }
                }
            }
        }
        for (C13532 c13532 : this.f45678) {
            C21480 c21480M34044 = c13532.m34042();
            int iM48656 = c21480M34044.m48652();
            int iM486410 = c21480M34044.m48645();
            C20069 c20069Mo29537 = c13532.mo29535();
            int size6 = c20069Mo29537.size();
            ArrayList arrayList5 = new ArrayList();
            C7929 c7929 = new C7929(size6 + 1);
            if (bitSet.get(iM48656)) {
                c7929.m21234(c7888.m38501(iM48656));
            } else {
                arrayList5.add(c21480M34044);
            }
            for (int i24 = 0; i24 < size6; i24++) {
                C21480 c21480M34045 = c20630.m47194(c20069Mo29537.m41004get(i24).m48652()).m34042();
                int iM48657 = c21480M34045.m48652();
                if (bitSet.get(iM48657)) {
                    c7929.m21234(c7888.m38501(iM48657));
                } else {
                    arrayList5.add(c21480M34045);
                }
            }
            for (int i25 = 0; i25 < c7929.m21235(); i25++) {
                m35485(c7929.m21233(), iM486410, arrayList5, false);
            }
            int iM354710 = m35479(i, iM486410);
            while (!m35485(iM354710, iM486410, arrayList5, false)) {
                iM354710 = m35479(iM354710 + 1, iM486410);
            }
        }
        int iM47187 = c20630.m47186();
        for (int i26 = 0; i26 < iM47187; i26++) {
            if (!bitSet.get(i26)) {
                AbstractC14278 abstractC14278M47195 = c20630.m47194(i26);
                C21480 c21480M34046 = abstractC14278M47195 == null ? null : abstractC14278M47195.m34042();
                if (c21480M34046 != null) {
                    int iM486411 = c21480M34046.m48645();
                    int iM354711 = m35479(i, iM486411);
                    while (!m35489(iM354711, c21480M34046)) {
                        iM354711 = m35479(iM354711 + 1, iM486411);
                    }
                    m35483(iM354711, c21480M34046);
                }
            }
        }
        return c7888;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35483(int i, C21480 c21480) {
        int iM48652 = c21480.m48652();
        BitSet bitSet = this.f45680;
        if (bitSet.get(iM48652) || !m35489(i, c21480)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM48645 = c21480.m48645();
        this.f45683.mo21169(c21480.m48652(), i, iM48645);
        bitSet.set(iM48652);
        this.f45679.set(i, iM48645 + i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35481(int i, C12122 c12122, int[] iArr, BitSet bitSet) {
        C20630 c20630;
        C20069 c20069Mo29535 = c12122.mo29535();
        int size = c20069Mo29535.size();
        InterfaceC9775 interfaceC9775M38619 = c12122.m34044().m38619();
        C20069 c20069 = new C20069(interfaceC9775M38619.elements());
        InterfaceC6952 it = interfaceC9775M38619.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c20630 = this.f9435;
            if (!zHasNext) {
                break;
            }
            int i3 = i2 + 1;
            AbstractC14278 abstractC14278M47194 = c20630.m47194(it.next());
            c20069.m40988(i2, abstractC14278M47194 == null ? null : abstractC14278M47194.m34042());
            i2 = i3;
        }
        BitSet bitSet2 = new BitSet(c20630.m47186());
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C21480 c21480M41004get = c20069Mo29535.m41004get(i6);
            int iM48652 = c21480M41004get.m48652();
            int i7 = iArr[i6];
            if (i6 != 0) {
                i4 += iArr[i6 - 1];
            }
            BitSet bitSet3 = this.f45680;
            boolean z = bitSet3.get(iM48652);
            C7888 c7888 = this.f45683;
            if (z && c7888.m38501(iM48652) == i4) {
                i5 += i7;
            } else {
                for (int i8 = i4; i8 < i4 + i7; i8++) {
                    if (this.f45685.get(i8)) {
                        return -1;
                    }
                }
                if (bitSet3.get(iM48652) || !m35489(i4, c21480M41004get) || bitSet2.get(iM48652)) {
                    if (c7888.m21170(c20069, i4, i7) || c7888.m21170(c20069Mo29535, i4, i7)) {
                        return -1;
                    }
                    bitSet.set(i6);
                } else {
                    i5 += i7;
                }
            }
            bitSet2.set(iM48652);
        }
        return i5;
    }
}
