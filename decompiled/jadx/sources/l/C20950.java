package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩷ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20950 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f67710;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5637 f67712;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18316 f67714;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f67715;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f67716;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23771[] f67718;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f67719;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashMap f67720 = new HashMap();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f67713 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f67711 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67717 = true;

    /* JADX WARN: Code duplicated, block: B:164:0x0470  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5637 m47765(boolean z, C7338 c7338, C18316 c18316) {
        HashMap map;
        this.f67714 = c18316;
        C5637 c5637 = new C5637();
        c5637.f17410 = c7338.m19704();
        c5637.f17419 = c7338.m19701();
        c5637.f17416 = c7338.m19702();
        c5637.f17417 = c7338.m19700();
        c5637.f17413 = z;
        this.f67712 = c5637;
        C16198 c16198 = c18316.f56945;
        if (c16198 != null) {
            for (AbstractC9144 abstractC9144 : c16198.f49887) {
                if (abstractC9144 instanceof C23960) {
                    C11572 c11572 = abstractC9144.f27685;
                    HashMap map2 = this.f67711;
                    if (!map2.containsKey(c11572)) {
                        C13334 c13334 = new C13334();
                        c13334.f39896 = ((C23960) abstractC9144).f77720;
                        map2.put(c11572, c13334);
                    }
                }
            }
        }
        this.f67715 = c18316.f56946;
        int i = 0;
        while (true) {
            int size = this.f67715.size();
            map = this.f67720;
            if (i >= size) {
                break;
            }
            AbstractC20433 abstractC20433 = (AbstractC20433) this.f67715.get(i);
            abstractC20433.f65929 = i;
            if (abstractC20433 instanceof C22549) {
                C22549 c22549 = (C22549) abstractC20433;
                map.put(c22549.f72941, c22549);
            }
            i++;
        }
        if (this.f67714.f56948 != null) {
            LinkedList linkedList = new LinkedList();
            TreeSet treeSet = new TreeSet();
            Iterator it = this.f67714.f56948.iterator();
            while (it.hasNext()) {
                for (C11572 c11573 : ((C0676) it.next()).f2603) {
                    int iM47770 = m47770(c11573);
                    linkedList.add(Integer.valueOf(iM47770 + 1));
                    treeSet.add(Integer.valueOf(iM47770));
                }
            }
            linkedList.add(0);
            HashMap map3 = new HashMap();
            BitSet bitSet = new BitSet(this.f67715.size());
            while (!linkedList.isEmpty()) {
                Integer num = (Integer) linkedList.poll();
                int iIntValue = num.intValue();
                if (!bitSet.get(iIntValue)) {
                    bitSet.set(iIntValue);
                    if (treeSet.contains(num)) {
                        map3.put(num, null);
                    }
                    AbstractC20433 abstractC20434 = (AbstractC20433) this.f67715.get(num.intValue());
                    EnumC2815 enumC2815 = abstractC20434.f65930;
                    if (enumC2815 == null) {
                        linkedList.add(Integer.valueOf(iIntValue + 1));
                    } else {
                        if (enumC2815.m8699()) {
                            linkedList.add(Integer.valueOf(iIntValue + 1));
                        }
                        if (enumC2815.m8698()) {
                            linkedList.add(Integer.valueOf(m47770(((C12671) abstractC20434).f38185)));
                        }
                        if (enumC2815.m8702()) {
                            for (C11572 c11574 : ((AbstractC15492) abstractC20434).f47378) {
                                linkedList.add(Integer.valueOf(m47770(c11574)));
                            }
                        }
                    }
                }
            }
            if (map3.size() > 0) {
                Iterator it2 = this.f67714.f56948.iterator();
                while (it2.hasNext()) {
                    C11572[] c11572Arr = ((C0676) it2.next()).f2603;
                    for (int i2 = 0; i2 < c11572Arr.length; i2++) {
                        C11572 c11575 = c11572Arr[i2];
                        int iM47771 = m47770(c11575);
                        if (map3.containsKey(Integer.valueOf(iM47771))) {
                            C11572 c11576 = (C11572) map3.get(Integer.valueOf(iM47771));
                            if (c11576 == null) {
                                c11576 = new C11572();
                                map3.put(Integer.valueOf(iM47771), c11576);
                                C22549 c225410 = new C22549(c11576);
                                c225410.f65929 = this.f67715.size();
                                this.f67715.add(c225410);
                                map.put(c11576, c225410);
                                C12671 c12671 = new C12671(EnumC2815.f8907, 0, 0, c11575);
                                c12671.f65929 = this.f67715.size();
                                this.f67715.add(c12671);
                            }
                            c11572Arr[i2] = c11576;
                        }
                    }
                }
            }
        }
        BitSet[] bitSetArr = new BitSet[this.f67715.size()];
        int size2 = this.f67715.size();
        int[] iArr = new int[size2];
        this.f67719 = iArr;
        int i3 = 1;
        iArr[0] = 1;
        for (AbstractC20433 abstractC20435 : this.f67715) {
            EnumC2815 enumC2816 = abstractC20435.f65930;
            if (enumC2816 == null) {
                int i4 = abstractC20435.f65929;
                if (i4 < size2 - 1) {
                    int i5 = i4 + 1;
                    iArr[i5] = iArr[i5] + 1;
                }
            } else {
                if (enumC2816.m8698()) {
                    int iM47772 = m47770(((C12671) abstractC20435).f38185);
                    iArr[iM47772] = iArr[iM47772] + 1;
                }
                if (enumC2816.m8702()) {
                    for (C11572 c11577 : ((AbstractC15492) abstractC20435).f47378) {
                        int iM47773 = m47770(c11577);
                        iArr[iM47773] = iArr[iM47773] + 1;
                    }
                }
                if (enumC2816.m8699()) {
                    int i6 = abstractC20435.f65929 + 1;
                    iArr[i6] = iArr[i6] + 1;
                }
            }
        }
        BitSet bitSet2 = new BitSet(this.f67715.size());
        ArrayList<C0676> arrayList = c18316.f56948;
        if (arrayList != null) {
            for (C0676 c0676 : arrayList) {
                C11572[] c11572Arr2 = c0676.f2603;
                C11572 c11578 = c0676.f2604;
                C11572 c11579 = c0676.f2602;
                for (C11572 c115710 : c11572Arr2) {
                    bitSet2.set(m47770(c115710));
                }
                int iM47774 = m47770(c11579);
                boolean z2 = false;
                for (int iM47775 = m47770(c11578) + i3; iM47775 < iM47774; iM47775++) {
                    EnumC2815 enumC2817 = ((AbstractC20433) this.f67715.get(iM47775)).f65930;
                    if (enumC2817 != null && enumC2817.m8701()) {
                        BitSet bitSet3 = bitSetArr[iM47775];
                        if (bitSet3 == null) {
                            bitSet3 = new BitSet(this.f67715.size());
                            bitSetArr[iM47775] = bitSet3;
                        }
                        for (C11572 c115711 : c11572Arr2) {
                            int iM47776 = m47770(c115711);
                            bitSet3.set(iM47776);
                            int[] iArr2 = this.f67719;
                            iArr2[iM47776] = iArr2[iM47776] + 1;
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    ArrayList arrayList2 = this.f67712.f17418;
                    C13334 c13334M47766 = m47766(c11578);
                    C13334 c13334M47767 = m47766(c11579);
                    C13334[] c13334Arr = new C13334[c11572Arr2.length];
                    for (int i7 = 0; i7 < c11572Arr2.length; i7++) {
                        c13334Arr[i7] = m47766(c11572Arr2[i7]);
                    }
                    arrayList2.add(new C4931(c13334M47766, c13334M47767, c13334Arr, c0676.f2605));
                }
                i3 = 1;
            }
        }
        C17421 c17421 = new C17421(this);
        this.f67718 = new C23771[this.f67715.size()];
        this.f67716 = new ArrayList[this.f67715.size()];
        BitSet bitSet4 = new BitSet(this.f67715.size());
        ArrayList arrayList3 = this.f67713;
        this.f67710 = arrayList3;
        C18316 c18317 = this.f67714;
        C5637 c5638 = this.f67712;
        C23771 c23771 = new C23771(c18317.f56947);
        int i8 = c18317.f56947;
        int i9 = 0;
        for (String str : c5638.f17410) {
            char cCharAt = str.charAt(0);
            i9 += (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        }
        int i10 = i8 - i9;
        if (!c5638.f17413) {
            C18274 c18274M47763 = m47763();
            m47768(new C21802(EnumC7690.IDENTITY, c18274M47763, new C21097(EnumC1340.THIS_REF, c5638.f17416, -1)));
            c23771.m4867(i10 - 1, new C6838(c18274M47763));
        }
        for (int i11 = 0; i11 < c5638.f17410.length; i11++) {
            C18274 c18274M47764 = m47763();
            m47768(new C21802(EnumC7690.IDENTITY, c18274M47764, new C21097(EnumC1340.PARAMETER_REF, c5638.f17410[i11], i11)));
            c23771.m4867(i10, new C6838(c18274M47764));
            char cCharAt2 = c5638.f17410[i11].charAt(0);
            i10 += (cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1;
        }
        if (this.f67717) {
            for (int i12 = 0; i12 < c23771.f5018.length; i12++) {
                if (c23771.m4866(i12) == null) {
                    C18274 c18274M47765 = m47763();
                    m47768(C17819.m41744(c18274M47765, C23275.m51589(0)));
                    c23771.m4867(i12, new C6838(c18274M47765));
                }
            }
        }
        if (this.f67719[0] > 1) {
            m47769(c23771, 0);
        } else {
            this.f67718[0] = c23771;
        }
        Stack stack = new Stack();
        stack.push((AbstractC20433) this.f67715.get(0));
        C23771 c23772 = new C23771(this.f67714.f56947);
        while (!stack.isEmpty()) {
            AbstractC20433 abstractC20436 = (AbstractC20433) stack.pop();
            int i13 = abstractC20436.f65929;
            EnumC2815 enumC2818 = abstractC20436.f65930;
            if (!bitSet4.get(i13)) {
                bitSet4.set(i13);
                C23771 c23773 = this.f67718[i13];
                ArrayList[] arrayListArr = this.f67716;
                ArrayList arrayList4 = arrayListArr[i13];
                this.f67710 = arrayList4;
                if (arrayList4 == null) {
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayListArr[i13] = arrayList5;
                    this.f67710 = arrayList5;
                }
                if (abstractC20436 instanceof C22549) {
                    m47768(m47766(((C22549) abstractC20436).f72941));
                    if (bitSet2.get(i13)) {
                        C18274 c18274M47766 = m47763();
                        m47768(new C21802(EnumC7690.IDENTITY, c18274M47766, new C21097(EnumC1340.EXCEPTION_REF, "Ljava/lang/Throwable;", -1)));
                        c23773.f5017 = new C6838(c18274M47766);
                    }
                }
                BitSet bitSet5 = bitSetArr[i13];
                if (bitSet5 != null) {
                    int i14 = 0;
                    while (true) {
                        int iNextSetBit = bitSet5.nextSetBit(i14);
                        if (iNextSetBit >= 0) {
                            m47769(c23773, iNextSetBit);
                            stack.push((AbstractC20433) this.f67715.get(iNextSetBit));
                            i14 = iNextSetBit + 1;
                        }
                    }
                }
                c23772.f5017 = c23773.f5017;
                Object[] objArr = c23773.f5018;
                Object[] objArr2 = c23772.f5018;
                System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
                if (enumC2818 != null) {
                    try {
                        switch (C14598.f44686[enumC2818.ordinal()]) {
                            case 1:
                                m47768(new C6279());
                                break;
                            case 2:
                            case 3:
                            case 4:
                                m47768(new C20391(m47766(((C12671) abstractC20436).f38185)));
                                break;
                            case 5:
                                m47768(new C10513());
                                break;
                            case 6:
                                m47768(C17819.m41745(C23275.m51588(new AbstractC8396[]{new C11987("bad dex opcode")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
                                break;
                            default:
                                c23772.m4868(abstractC20436, c17421);
                                break;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Fail on Op " + enumC2818 + " index " + i13, e);
                    }
                }
                if (enumC2818 != null) {
                    if (enumC2818.m8698()) {
                        int iM47777 = m47770(((C12671) abstractC20436).f38185);
                        stack.push((AbstractC20433) this.f67715.get(iM47777));
                        m47769(c23772, iM47777);
                    }
                    if (enumC2818.m8702()) {
                        for (C11572 c115712 : ((AbstractC15492) abstractC20436).f47378) {
                            int iM47778 = m47770(c115712);
                            stack.push((AbstractC20433) this.f67715.get(iM47778));
                            m47769(c23772, iM47778);
                        }
                    }
                    if (enumC2818.m8699()) {
                        int i15 = i13 + 1;
                        stack.push((AbstractC20433) this.f67715.get(i15));
                        m47769(c23772, i15);
                    }
                } else {
                    int i16 = i13 + 1;
                    stack.push((AbstractC20433) this.f67715.get(i16));
                    m47769(c23772, i16);
                }
                if (this.f67719[i13] <= 1) {
                    this.f67718[i13] = null;
                }
                bitSet2 = bitSet2;
            }
        }
        C16407 c16407 = this.f67712.f17411;
        c16407.getClass();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            c16407.m38665((AbstractC1591) it3.next());
        }
        for (int i17 = 0; i17 < this.f67715.size(); i17++) {
            AbstractC20433 abstractC20437 = (AbstractC20433) this.f67715.get(i17);
            if (bitSet4.get(i17)) {
                ArrayList arrayList6 = this.f67716[i17];
                if (arrayList6 != null) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        c16407.m38665((AbstractC1591) it4.next());
                    }
                }
            } else if (abstractC20437 instanceof C22549) {
                c16407.m38665(m47766(((C22549) abstractC20437).f72941));
            }
        }
        this.f67716 = null;
        C5784 c5784 = new C5784();
        int i18 = 0;
        while (true) {
            C23771[] c23771Arr = this.f67718;
            if (i18 < c23771Arr.length) {
                C23771 c23774 = c23771Arr[i18];
                if (this.f67719[i18] > 1 && c23774 != null && bitSet4.get(i18)) {
                    for (int i19 = 0; i19 < c23774.f5018.length; i19++) {
                        C6838 c6838 = (C6838) c23774.m4866(i19);
                        if (c6838 != null && c6838.f21169 != null) {
                            C6838 c6839 = c6838.f21171;
                            if (c6839 != null && c6839.f21169 == null) {
                                c5784.add(c6839);
                            }
                            HashSet<C6838> hashSet = c6838.f21170;
                            if (hashSet != null) {
                                for (C6838 c68310 : hashSet) {
                                    if (c68310.f21169 == null) {
                                        c5784.add(c68310);
                                    }
                                }
                            }
                        }
                    }
                }
                i18++;
            } else {
                while (!c5784.isEmpty()) {
                    C6838 c68311 = (C6838) c5784.poll();
                    m47767(c68311);
                    C6838 c68312 = c68311.f21171;
                    if (c68312 != null && c68312.f21169 == null) {
                        c5784.add(c68312);
                    }
                    HashSet<C6838> hashSet2 = c68311.f21170;
                    if (hashSet2 != null) {
                        for (C6838 c68313 : hashSet2) {
                            if (c68313.f21169 == null) {
                                c5784.add(c68313);
                            }
                        }
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                int i20 = 0;
                while (true) {
                    C23771[] c23771Arr2 = this.f67718;
                    if (i20 < c23771Arr2.length) {
                        C23771 c23775 = c23771Arr2[i20];
                        if (this.f67719[i20] > 1 && c23775 != null && bitSet4.get(i20)) {
                            C13334 c13334M47768 = m47766(((C22549) ((AbstractC20433) this.f67715.get(i20))).f72941);
                            ArrayList arrayList8 = new ArrayList();
                            for (int i21 = 0; i21 < c23775.f5018.length; i21++) {
                                C6838 c68314 = (C6838) c23775.m4866(i21);
                                if (c68314 != null && c68314.f21169 != null) {
                                    C6838 c68315 = c68314.f21171;
                                    if (c68315 != null) {
                                        C18274 c18274M47767 = c68315.f21169;
                                        if (c18274M47767 == null) {
                                            c18274M47767 = m47763();
                                            c68315.f21169 = c18274M47767;
                                        }
                                        hashSet3.add(c18274M47767);
                                    }
                                    HashSet hashSet4 = c68314.f21170;
                                    if (hashSet4 != null) {
                                        Iterator it5 = hashSet4.iterator();
                                        while (it5.hasNext()) {
                                            hashSet3.add(m47767((C6838) it5.next()));
                                        }
                                    }
                                    if (hashSet3.size() > 0) {
                                        arrayList8.add(C17819.m41744(c68314.f21169, new C23918((AbstractC8396[]) hashSet3.toArray(new AbstractC8396[hashSet3.size()]))));
                                        hashSet3.clear();
                                    }
                                }
                            }
                            c13334M47768.f39897 = arrayList8;
                            arrayList7.add(c13334M47768);
                        }
                        i20++;
                    } else {
                        if (arrayList7.size() > 0) {
                            this.f67712.f17414 = arrayList7;
                        }
                        return this.f67712;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18274 m47767(C6838 c6838) {
        C18274 c18274 = c6838.f21169;
        if (c18274 != null) {
            return c18274;
        }
        C18274 c18274M47763 = m47763();
        c6838.f21169 = c18274M47763;
        return c18274M47763;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47769(C23771 c23771, int i) {
        C23771[] c23771Arr = this.f67718;
        C23771 c23772 = c23771Arr[i];
        if (c23772 == null) {
            c23772 = new C23771(this.f67714.f56947);
            c23771Arr[i] = c23772;
        }
        if (this.f67719[i] <= 1) {
            c23772.f5017 = c23771.f5017;
            Object[] objArr = c23771.f5018;
            Object[] objArr2 = c23772.f5018;
            System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
            return;
        }
        for (int i2 = 0; i2 < c23771.f5018.length; i2++) {
            C6838 c6838 = (C6838) c23771.m4866(i2);
            C6838 c6839 = (C6838) c23772.m4866(i2);
            if (c6838 != null) {
                if (c6839 == null) {
                    c6839 = new C6838();
                    c23772.m4867(i2, c6839);
                }
                C6838 c68310 = c6839.f21171;
                if (c68310 == null) {
                    c6839.f21171 = c6838;
                } else if (c68310 != c6838) {
                    if (c6839.f21170 == null) {
                        c6839.f21170 = new HashSet(5);
                    }
                    c6839.f21170.add(c6838);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18274 m47763() {
        C18274 c18274 = new C18274(this.f67712.f17415.size());
        this.f67712.f17415.add(c18274);
        return c18274;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47768(AbstractC1591 abstractC1591) {
        this.f67710.add(abstractC1591);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13334 m47766(C11572 c11572) {
        HashMap map = this.f67711;
        C13334 c13334 = (C13334) map.get(c11572);
        if (c13334 != null) {
            return c13334;
        }
        C13334 c13335 = new C13334();
        map.put(c11572, c13335);
        return c13335;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47770(C11572 c11572) {
        return ((C22549) this.f67720.get(c11572)).f65929;
    }
}
