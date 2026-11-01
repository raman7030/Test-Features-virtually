package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16609 extends AbstractC5211 {

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f48791;

    /* JADX INFO: renamed from: ۡ */
    public final BitSet f48792;

    /* JADX INFO: renamed from: ۢ */
    public final BitSet f48793;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f48794;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f48795;

    /* JADX INFO: renamed from: ܿ */
    public final C9865 f48796;

    /* JADX INFO: renamed from: ᩳ */
    public final TreeMap f48797;

    /* JADX INFO: renamed from: ᩷ */
    public final BitSet f48798;

    /* JADX INFO: renamed from: ᩻ */
    public final int f48799;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37640(int i) {
        return (i & 1) == 0;
    }

    public C16609(C21975 c21975, C23316 c23316) {
        super(c21975, c23316);
        this.f48793 = new BitSet(c21975.m49513());
        this.f48796 = new C9865(c23316, c21975.m49513());
        int iM49529 = c21975.m49529();
        this.f48799 = iM49529;
        int i = iM49529 * 2;
        BitSet bitSet = new BitSet(i);
        this.f48798 = bitSet;
        bitSet.set(0, iM49529);
        this.f48792 = new BitSet(i);
        this.f48797 = new TreeMap();
        this.f48794 = new ArrayList();
        this.f48795 = new ArrayList();
        this.f48791 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ */
    private int m37643(int i) {
        C5348 c5348Mo31602;
        AbstractC15938 abstractC15938M49521 = this.f12234.m49521(i);
        if (abstractC15938M49521 == null || (c5348Mo31602 = abstractC15938M49521.mo31602()) == null || c5348Mo31602.m11605() != 3) {
            return -1;
        }
        return ((C4873) ((AbstractC16076) abstractC15938M49521.mo31607()).m36587()).mo4598();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37641(int i, int i2, ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C22783 c22783 = (C22783) it.next();
            if (!this.f48793.get(c22783.m50989())) {
                boolean zM37642 = m37642(c22783, i, i2);
                z2 = !zM37642 || z2;
                if (zM37642 && z) {
                    this.f48798.set(i, c22783.m50982() + i, true);
                }
            }
        }
        return !z2;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37642(C22783 c22783, int i, int i2) {
        if (c22783.m50982() > i2 || this.f48793.get(c22783.m50989()) || !m37645(i, c22783)) {
            return false;
        }
        m37639(i, c22783);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m37635(int i, int i2) {
        EnumC3198 enumC3198 = EnumC3198.f6206;
        if (i2 == 2) {
            if ((this.f48799 & 1) == 0) {
                enumC3198 = EnumC3198.f6209;
            } else {
                enumC3198 = EnumC3198.f6207;
            }
        }
        return m37636(i, i2, enumC3198);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m37636(int i, int i2, EnumC3198 enumC3198) {
        BitSet bitSet = this.f48798;
        int iMo3694 = enumC3198.mo3694(bitSet, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !bitSet.get(iMo3694 + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iMo3694;
            }
            iMo3694 = enumC3198.mo3694(bitSet, iMo3694 + i3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m37645(int i, C22783 c22783) {
        int iM50982 = c22783.m50982();
        int i2 = this.f48799;
        if (i < i2 && iM50982 + i > i2) {
            return false;
        }
        C9865 c9865 = this.f48796;
        c9865.getClass();
        return !c9865.m23136(c22783.m50989(), i, c22783.m50982());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9865 m37648() {
        BitSet bitSet;
        C9865 c9865;
        int i;
        Iterator it;
        BitSet bitSet2;
        C20101 c20101;
        EnumC3198 enumC3198;
        int iM40718;
        int i2;
        int i3;
        int iM50982;
        C19963 c19963 = new C19963(this);
        C21975 c21975 = this.f12234;
        c21975.m49509(c19963);
        TreeMap treeMap = this.f48797;
        for (ArrayList arrayList : treeMap.values()) {
            int size = arrayList.size();
            int i4 = -1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    iM50982 = 0;
                    break;
                }
                C22783 c22783 = (C22783) arrayList.get(i5);
                int iM37643 = m37643(c22783.m50989());
                if (iM37643 >= 0) {
                    iM50982 = c22783.m50982();
                    m37639(iM37643, c22783);
                    i4 = iM37643;
                    break;
                }
                i5++;
                i4 = iM37643;
            }
            if (i4 >= 0) {
                m37641(i4, iM50982, arrayList, true);
            }
        }
        int iM49513 = c21975.m49513();
        int i6 = 0;
        while (true) {
            bitSet = this.f48793;
            if (i6 >= iM49513) {
                break;
            }
            if (!bitSet.get(i6)) {
                int iM37644 = m37643(i6);
                AbstractC15938 abstractC15938M49521 = c21975.m49521(i6);
                C22783 c22783M36175 = abstractC15938M49521 == null ? null : abstractC15938M49521.m36175();
                if (iM37644 >= 0) {
                    m37639(iM37644, c22783M36175);
                }
            }
            i6++;
        }
        Iterator it2 = this.f48795.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            c9865 = this.f48796;
            i = this.f48799;
            if (!zHasNext) {
                break;
            }
            C13889 c13889 = (C13889) it2.next();
            C21442 c21442Mo31600 = c13889.mo31600();
            int size2 = c21442Mo31600.size();
            int[] iArr = new int[size2];
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                int iM50983 = c21442Mo31600.m56524get(i8).m50982();
                iArr[i8] = iM50983;
                i7 += iM50983;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            int iM37636 = -1;
            BitSet bitSet3 = null;
            while (true) {
                if (i10 >= size2) {
                    it = it2;
                    break;
                }
                it = it2;
                int iM50989 = c21442Mo31600.m56524get(i10).m50989();
                if (i10 != 0) {
                    i11 -= iArr[i10 - 1];
                }
                if (bitSet.get(iM50989) && (iM40718 = c9865.m40718(iM50989) + i11) >= 0) {
                    i2 = i11;
                    if (iM40718 >= i || iM40718 + i7 <= i) {
                        BitSet bitSet4 = new BitSet(size2);
                        i3 = iM37636;
                        int iM37637 = m37637(iM40718, c13889, iArr, bitSet4);
                        if (iM37637 >= 0) {
                            int iCardinality = iM37637 - bitSet4.cardinality();
                            if (iCardinality > i9) {
                                i9 = iCardinality;
                                bitSet3 = bitSet4;
                                i3 = iM40718;
                            }
                            if (iM37637 == i7) {
                                iM37636 = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    iM37636 = i3;
                    i10++;
                    i11 = i2;
                    it2 = it;
                } else {
                    i2 = i11;
                }
                i3 = iM37636;
                iM37636 = i3;
                i10++;
                i11 = i2;
                it2 = it;
            }
            if (iM37636 == -1) {
                bitSet2 = new BitSet(size2);
                EnumC3198 enumC3199 = EnumC3198.f6206;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i12 < size2) {
                    EnumC3198 enumC31910 = enumC3199;
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
                    enumC3199 = enumC31910;
                    size2 = i16;
                }
                EnumC3198 enumC31911 = enumC3199;
                if (i13 > i14) {
                    enumC3198 = (i & 1) == 0 ? EnumC3198.f6207 : EnumC3198.f6209;
                } else if (i14 > 0) {
                    enumC3198 = (i & 1) == 0 ? EnumC3198.f6209 : EnumC3198.f6207;
                } else {
                    enumC3198 = enumC31911;
                }
                while (true) {
                    iM37636 = m37636(i, i7, enumC3198);
                    if (m37637(iM37636, c13889, iArr, bitSet2) >= 0) {
                        break;
                    }
                    i = iM37636 + 1;
                    bitSet2.clear();
                }
            } else {
                bitSet2 = bitSet3;
            }
            for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
                c13889.m31597(iNextSetBit, m11176(c13889, c21442Mo31600.m56524get(iNextSetBit)));
            }
            C21442 c21442Mo31601 = c13889.mo31600();
            int size3 = c21442Mo31601.size();
            int i17 = 0;
            while (i17 < size3) {
                C22783 c22783M56524get = c21442Mo31601.m56524get(i17);
                int iM509810 = c22783M56524get.m50989();
                int iM50984 = c22783M56524get.m50982();
                int i18 = iM37636 + iM50984;
                if (!bitSet.get(iM509810)) {
                    Iterator it3 = treeMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c20101 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = ((ArrayList) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            if (((C22783) it4.next()).m50989() == iM509810) {
                                c20101 = (C20101) entry.getKey();
                                break;
                            }
                        }
                    }
                    m37639(iM37636, c22783M56524get);
                    if (c20101 != null) {
                        this.f48798.set(iM37636, i18, true);
                        ArrayList arrayList2 = (ArrayList) treeMap.get(c20101);
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            C22783 c22784 = (C22783) arrayList2.get(i19);
                            if (-1 == c21442Mo31601.m48576(c22784.m50989())) {
                                m37642(c22784, iM37636, iM50984);
                            }
                        }
                    }
                }
                i17++;
                iM37636 = i18;
            }
            it2 = it;
        }
        for (ArrayList arrayList3 : treeMap.values()) {
            boolean zM37641 = false;
            int i20 = i;
            do {
                int size5 = arrayList3.size();
                int i21 = 1;
                for (int i22 = 0; i22 < size5; i22++) {
                    C22783 c22785 = (C22783) arrayList3.get(i22);
                    int iM50985 = c22785.m50982();
                    if (!bitSet.get(c22785.m50989()) && iM50985 > i21) {
                        i21 = iM50985;
                    }
                }
                EnumC3198 enumC31912 = EnumC3198.f6206;
                if (i21 == 2) {
                    enumC31912 = (i & 1) == 0 ? EnumC3198.f6209 : EnumC3198.f6207;
                }
                BitSet bitSet5 = this.f48792;
                int iMo3694 = enumC31912.mo3694(bitSet5, i20);
                while (true) {
                    int i23 = 1;
                    while (i23 < i21 && !bitSet5.get(iMo3694 + i23)) {
                        i23++;
                    }
                    if (i23 == i21) {
                        break;
                    }
                    iMo3694 = enumC31912.mo3694(bitSet5, iMo3694 + i23);
                }
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        zM37641 = m37641(iMo3694, i21, arrayList3, true);
                        break;
                    }
                    C22783 c22786 = (C22783) it5.next();
                    if (!bitSet.get(c22786.m50989()) && !m37645(iMo3694, c22786)) {
                        break;
                    }
                }
                i20 = iMo3694 + 1;
            } while (!zM37641);
        }
        for (C13889 c138810 : this.f48794) {
            C22783 c22783M36176 = c138810.m36175();
            int iM509811 = c22783M36176.m50989();
            BitSet bitSetM40841 = c138810.m36177().m40841();
            if (bitSetM40841.cardinality() == 1) {
                AbstractC15938 abstractC15938 = (AbstractC15938) C20013.m45383(((C17950) c21975.m49517().get(bitSetM40841.nextSetBit(0))).m40832(), 1);
                if (abstractC15938.mo31602().m11605() == 43) {
                    C22783 c22783M56524get2 = abstractC15938.mo31600().m56524get(0);
                    int iM509812 = c22783M56524get2.m50989();
                    int iM50986 = c22783M56524get2.m50982();
                    boolean zM37642 = bitSet.get(iM509811);
                    boolean zM37643 = bitSet.get(iM509812);
                    if ((!zM37643) & zM37642) {
                        zM37643 = m37642(c22783M56524get2, c9865.m40718(iM509811), iM50986);
                    }
                    if ((!zM37642) & zM37643) {
                        zM37642 = m37642(c22783M36176, c9865.m40718(iM509812), iM50986);
                    }
                    if (!zM37642 || !zM37643) {
                        int iM37635 = m37635(i, iM50986);
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(c22783M36176);
                        arrayList4.add(c22783M56524get2);
                        while (!m37641(iM37635, iM50986, arrayList4, false)) {
                            iM37635 = m37635(iM37635 + 1, iM50986);
                        }
                    }
                    boolean z = abstractC15938.mo31607().mo5820().size() != 0;
                    int iM40719 = c9865.m40718(iM509811);
                    if (iM40719 != c9865.m40718(iM509812) && !z) {
                        ((C13889) abstractC15938).m31597(0, m11176(abstractC15938, c22783M56524get2));
                        m37639(iM40719, abstractC15938.mo31600().m56524get(0));
                    }
                }
            }
        }
        for (C15229 c15229 : this.f48791) {
            C22783 c22783M36177 = c15229.m36175();
            int iM509813 = c22783M36177.m50989();
            int iM50987 = c22783M36177.m50982();
            C21442 c21442Mo31602 = c15229.mo31600();
            int size6 = c21442Mo31602.size();
            ArrayList arrayList5 = new ArrayList();
            C9904 c9904 = new C9904(size6 + 1);
            if (bitSet.get(iM509813)) {
                c9904.m23200(c9865.m40718(iM509813));
            } else {
                arrayList5.add(c22783M36177);
            }
            for (int i24 = 0; i24 < size6; i24++) {
                C22783 c22783M36178 = c21975.m49521(c21442Mo31602.m56524get(i24).m50989()).m36175();
                int iM509814 = c22783M36178.m50989();
                if (bitSet.get(iM509814)) {
                    c9904.m23200(c9865.m40718(iM509814));
                } else {
                    arrayList5.add(c22783M36178);
                }
            }
            for (int i25 = 0; i25 < c9904.m23201(); i25++) {
                m37641(c9904.m23199(), iM50987, arrayList5, false);
            }
            int iM37638 = m37635(i, iM50987);
            while (!m37641(iM37638, iM50987, arrayList5, false)) {
                iM37638 = m37635(iM37638 + 1, iM50987);
            }
        }
        int iM49514 = c21975.m49513();
        for (int i26 = 0; i26 < iM49514; i26++) {
            if (!bitSet.get(i26)) {
                AbstractC15938 abstractC15938M49522 = c21975.m49521(i26);
                C22783 c22783M36179 = abstractC15938M49522 == null ? null : abstractC15938M49522.m36175();
                if (c22783M36179 != null) {
                    int iM50988 = c22783M36179.m50982();
                    int iM37639 = m37635(i, iM50988);
                    while (!m37645(iM37639, c22783M36179)) {
                        iM37639 = m37635(iM37639 + 1, iM50988);
                    }
                    m37639(iM37639, c22783M36179);
                }
            }
        }
        return c9865;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37639(int i, C22783 c22783) {
        int iM50989 = c22783.m50989();
        BitSet bitSet = this.f48793;
        if (bitSet.get(iM50989) || !m37645(i, c22783)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iM50982 = c22783.m50982();
        this.f48796.mo23134(c22783.m50989(), i, iM50982);
        bitSet.set(iM50989);
        this.f48792.set(i, iM50982 + i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX INFO: renamed from: ֫ */
    private int m37637(int i, C13889 c13889, int[] iArr, BitSet bitSet) {
        C21975 c21975;
        C21442 c21442Mo31600 = c13889.mo31600();
        int size = c21442Mo31600.size();
        InterfaceC11659 interfaceC11659M40836 = c13889.m36177().m40836();
        C21442 c21442 = new C21442(interfaceC11659M40836.elements());
        InterfaceC8976 it = interfaceC11659M40836.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c21975 = this.f12234;
            if (!zHasNext) {
                break;
            }
            int i3 = i2 + 1;
            AbstractC15938 abstractC15938M49521 = c21975.m49521(it.next());
            c21442.m43248(i2, abstractC15938M49521 == null ? null : abstractC15938M49521.m36175());
            i2 = i3;
        }
        BitSet bitSet2 = new BitSet(c21975.m49513());
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C22783 c22783M56524get = c21442Mo31600.m56524get(i6);
            int iM50989 = c22783M56524get.m50989();
            int i7 = iArr[i6];
            if (i6 != 0) {
                i4 += iArr[i6 - 1];
            }
            BitSet bitSet3 = this.f48793;
            boolean z = bitSet3.get(iM50989);
            C9865 c9865 = this.f48796;
            if (z && c9865.m40718(iM50989) == i4) {
                i5 += i7;
            } else {
                for (int i8 = i4; i8 < i4 + i7; i8++) {
                    if (this.f48798.get(i8)) {
                        return -1;
                    }
                }
                if (bitSet3.get(iM50989) || !m37645(i4, c22783M56524get) || bitSet2.get(iM50989)) {
                    if (c9865.m23135(c21442, i4, i7) || c9865.m23135(c21442Mo31600, i4, i7)) {
                        return -1;
                    }
                    bitSet.set(i6);
                } else {
                    i5 += i7;
                }
            }
            bitSet2.set(iM50989);
        }
        return i5;
    }
}
