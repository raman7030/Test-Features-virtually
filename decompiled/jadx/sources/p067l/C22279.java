package p067l;

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
public final class C22279 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f70395;

    /* JADX INFO: renamed from: ۡ */
    public C7726 f70397;

    /* JADX INFO: renamed from: ۧ */
    public C19776 f70399;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f70400;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList[] f70401;

    /* JADX INFO: renamed from: ᩳ */
    public C24960[] f70403;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f70404;

    /* JADX INFO: renamed from: ᩻ */
    public HashMap f70405 = new HashMap();

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f70398 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public HashMap f70396 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public boolean f70402 = true;

    /* JADX WARN: Code duplicated, block: B:164:0x0470  */
    /* JADX INFO: renamed from: ֫ */
    public final C7726 m50095(boolean z, C9342 c9342, C19776 c19776) {
        HashMap map;
        this.f70399 = c19776;
        C7726 c7726 = new C7726();
        c7726.f20256 = c9342.m21677();
        c7726.f20265 = c9342.m21674();
        c7726.f20262 = c9342.m21675();
        c7726.f20263 = c9342.m21673();
        c7726.f20259 = z;
        this.f70397 = c7726;
        C17763 c17763 = c19776.f60163;
        if (c17763 != null) {
            for (AbstractC11059 abstractC11059 : c17763.f53053) {
                if (abstractC11059 instanceof C25140) {
                    C13366 c13366 = abstractC11059.f30625;
                    HashMap map2 = this.f70396;
                    if (!map2.containsKey(c13366)) {
                        C15041 c15041 = new C15041();
                        c15041.f42962 = ((C25140) abstractC11059).f80472;
                        map2.put(c13366, c15041);
                    }
                }
            }
        }
        this.f70400 = c19776.f60164;
        int i = 0;
        while (true) {
            int size = this.f70400.size();
            map = this.f70405;
            if (i >= size) {
                break;
            }
            AbstractC21788 abstractC21788 = (AbstractC21788) this.f70400.get(i);
            abstractC21788.f68604 = i;
            if (abstractC21788 instanceof C23799) {
                C23799 c23799 = (C23799) abstractC21788;
                map.put(c23799.f75668, c23799);
            }
            i++;
        }
        if (this.f70399.f60166 != null) {
            LinkedList linkedList = new LinkedList();
            TreeSet treeSet = new TreeSet();
            Iterator it = this.f70399.f60166.iterator();
            while (it.hasNext()) {
                for (C13366 c13367 : ((C3011) it.next()).f5376) {
                    int iM50100 = m50100(c13367);
                    linkedList.add(Integer.valueOf(iM50100 + 1));
                    treeSet.add(Integer.valueOf(iM50100));
                }
            }
            linkedList.add(0);
            HashMap map3 = new HashMap();
            BitSet bitSet = new BitSet(this.f70400.size());
            while (!linkedList.isEmpty()) {
                Integer num = (Integer) linkedList.poll();
                int iIntValue = num.intValue();
                if (!bitSet.get(iIntValue)) {
                    bitSet.set(iIntValue);
                    if (treeSet.contains(num)) {
                        map3.put(num, null);
                    }
                    AbstractC21788 abstractC21789 = (AbstractC21788) this.f70400.get(num.intValue());
                    EnumC5044 enumC5044 = abstractC21789.f68605;
                    if (enumC5044 == null) {
                        linkedList.add(Integer.valueOf(iIntValue + 1));
                    } else {
                        if (enumC5044.m10760()) {
                            linkedList.add(Integer.valueOf(iIntValue + 1));
                        }
                        if (enumC5044.m10759()) {
                            linkedList.add(Integer.valueOf(m50100(((C14411) abstractC21789).f41212)));
                        }
                        if (enumC5044.m10763()) {
                            for (C13366 c13368 : ((AbstractC17092) abstractC21789).f50509) {
                                linkedList.add(Integer.valueOf(m50100(c13368)));
                            }
                        }
                    }
                }
            }
            if (map3.size() > 0) {
                Iterator it2 = this.f70399.f60166.iterator();
                while (it2.hasNext()) {
                    C13366[] c13366Arr = ((C3011) it2.next()).f5376;
                    for (int i2 = 0; i2 < c13366Arr.length; i2++) {
                        C13366 c13369 = c13366Arr[i2];
                        int iM50101 = m50100(c13369);
                        if (map3.containsKey(Integer.valueOf(iM50101))) {
                            C13366 c133610 = (C13366) map3.get(Integer.valueOf(iM50101));
                            if (c133610 == null) {
                                c133610 = new C13366();
                                map3.put(Integer.valueOf(iM50101), c133610);
                                C23799 c237910 = new C23799(c133610);
                                c237910.f68604 = this.f70400.size();
                                this.f70400.add(c237910);
                                map.put(c133610, c237910);
                                C14411 c14411 = new C14411(EnumC5044.f11701, 0, 0, c13369);
                                c14411.f68604 = this.f70400.size();
                                this.f70400.add(c14411);
                            }
                            c13366Arr[i2] = c133610;
                        }
                    }
                }
            }
        }
        BitSet[] bitSetArr = new BitSet[this.f70400.size()];
        int size2 = this.f70400.size();
        int[] iArr = new int[size2];
        this.f70404 = iArr;
        int i3 = 1;
        iArr[0] = 1;
        for (AbstractC21788 abstractC217810 : this.f70400) {
            EnumC5044 enumC5045 = abstractC217810.f68605;
            if (enumC5045 == null) {
                int i4 = abstractC217810.f68604;
                if (i4 < size2 - 1) {
                    int i5 = i4 + 1;
                    iArr[i5] = iArr[i5] + 1;
                }
            } else {
                if (enumC5045.m10759()) {
                    int iM50102 = m50100(((C14411) abstractC217810).f41212);
                    iArr[iM50102] = iArr[iM50102] + 1;
                }
                if (enumC5045.m10763()) {
                    for (C13366 c133611 : ((AbstractC17092) abstractC217810).f50509) {
                        int iM50103 = m50100(c133611);
                        iArr[iM50103] = iArr[iM50103] + 1;
                    }
                }
                if (enumC5045.m10760()) {
                    int i6 = abstractC217810.f68604 + 1;
                    iArr[i6] = iArr[i6] + 1;
                }
            }
        }
        BitSet bitSet2 = new BitSet(this.f70400.size());
        ArrayList<C3011> arrayList = c19776.f60166;
        if (arrayList != null) {
            for (C3011 c3011 : arrayList) {
                C13366[] c13366Arr2 = c3011.f5376;
                C13366 c133612 = c3011.f5377;
                C13366 c133613 = c3011.f5375;
                for (C13366 c133614 : c13366Arr2) {
                    bitSet2.set(m50100(c133614));
                }
                int iM50104 = m50100(c133613);
                boolean z2 = false;
                for (int iM50105 = m50100(c133612) + i3; iM50105 < iM50104; iM50105++) {
                    EnumC5044 enumC5046 = ((AbstractC21788) this.f70400.get(iM50105)).f68605;
                    if (enumC5046 != null && enumC5046.m10762()) {
                        BitSet bitSet3 = bitSetArr[iM50105];
                        if (bitSet3 == null) {
                            bitSet3 = new BitSet(this.f70400.size());
                            bitSetArr[iM50105] = bitSet3;
                        }
                        for (C13366 c133615 : c13366Arr2) {
                            int iM50106 = m50100(c133615);
                            bitSet3.set(iM50106);
                            int[] iArr2 = this.f70404;
                            iArr2[iM50106] = iArr2[iM50106] + 1;
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    ArrayList arrayList2 = this.f70397.f20264;
                    C15041 c15041M50096 = m50096(c133612);
                    C15041 c15041M50097 = m50096(c133613);
                    C15041[] c15041Arr = new C15041[c13366Arr2.length];
                    for (int i7 = 0; i7 < c13366Arr2.length; i7++) {
                        c15041Arr[i7] = m50096(c13366Arr2[i7]);
                    }
                    arrayList2.add(new C7055(c15041M50096, c15041M50097, c15041Arr, c3011.f5378));
                }
                i3 = 1;
            }
        }
        C18925 c18925 = new C18925(this);
        this.f70403 = new C24960[this.f70400.size()];
        this.f70401 = new ArrayList[this.f70400.size()];
        BitSet bitSet4 = new BitSet(this.f70400.size());
        ArrayList arrayList3 = this.f70398;
        this.f70395 = arrayList3;
        C19776 c19777 = this.f70399;
        C7726 c7727 = this.f70397;
        C24960 c24960 = new C24960(c19777.f60165);
        int i8 = c19777.f60165;
        int i9 = 0;
        for (String str : c7727.f20256) {
            char cCharAt = str.charAt(0);
            i9 += (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        }
        int i10 = i8 - i9;
        if (!c7727.f20259) {
            C19736 c19736M50093 = m50093();
            m50098(new C23089(EnumC9677.IDENTITY, c19736M50093, new C22419(EnumC3642.THIS_REF, c7727.f20262, -1)));
            c24960.m7105(i10 - 1, new C8867(c19736M50093));
        }
        for (int i11 = 0; i11 < c7727.f20256.length; i11++) {
            C19736 c19736M50094 = m50093();
            m50098(new C23089(EnumC9677.IDENTITY, c19736M50094, new C22419(EnumC3642.PARAMETER_REF, c7727.f20256[i11], i11)));
            c24960.m7105(i10, new C8867(c19736M50094));
            char cCharAt2 = c7727.f20256[i11].charAt(0);
            i10 += (cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1;
        }
        if (this.f70402) {
            for (int i12 = 0; i12 < c24960.f7790.length; i12++) {
                if (c24960.m7104(i12) == null) {
                    C19736 c19736M50095 = m50093();
                    m50098(C19303.m43990(c19736M50095, C24489.m53985(0)));
                    c24960.m7105(i12, new C8867(c19736M50095));
                }
            }
        }
        if (this.f70404[0] > 1) {
            m50099(c24960, 0);
        } else {
            this.f70403[0] = c24960;
        }
        Stack stack = new Stack();
        stack.push((AbstractC21788) this.f70400.get(0));
        C24960 c24961 = new C24960(this.f70399.f60165);
        while (!stack.isEmpty()) {
            AbstractC21788 abstractC217811 = (AbstractC21788) stack.pop();
            int i13 = abstractC217811.f68604;
            EnumC5044 enumC5047 = abstractC217811.f68605;
            if (!bitSet4.get(i13)) {
                bitSet4.set(i13);
                C24960 c24962 = this.f70403[i13];
                ArrayList[] arrayListArr = this.f70401;
                ArrayList arrayList4 = arrayListArr[i13];
                this.f70395 = arrayList4;
                if (arrayList4 == null) {
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayListArr[i13] = arrayList5;
                    this.f70395 = arrayList5;
                }
                if (abstractC217811 instanceof C23799) {
                    m50098(m50096(((C23799) abstractC217811).f75668));
                    if (bitSet2.get(i13)) {
                        C19736 c19736M50096 = m50093();
                        m50098(new C23089(EnumC9677.IDENTITY, c19736M50096, new C22419(EnumC3642.EXCEPTION_REF, "Ljava/lang/Throwable;", -1)));
                        c24962.f7789 = new C8867(c19736M50096);
                    }
                }
                BitSet bitSet5 = bitSetArr[i13];
                if (bitSet5 != null) {
                    int i14 = 0;
                    while (true) {
                        int iNextSetBit = bitSet5.nextSetBit(i14);
                        if (iNextSetBit >= 0) {
                            m50099(c24962, iNextSetBit);
                            stack.push((AbstractC21788) this.f70400.get(iNextSetBit));
                            i14 = iNextSetBit + 1;
                        }
                    }
                }
                c24961.f7789 = c24962.f7789;
                Object[] objArr = c24962.f7790;
                Object[] objArr2 = c24961.f7790;
                System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
                if (enumC5047 != null) {
                    try {
                        switch (C16242.f47793[enumC5047.ordinal()]) {
                            case 1:
                                m50098(new C8336());
                                break;
                            case 2:
                            case 3:
                            case 4:
                                m50098(new C21748(m50096(((C14411) abstractC217811).f41212)));
                                break;
                            case 5:
                                m50098(new C12360());
                                break;
                            case 6:
                                m50098(C19303.m43991(C24489.m53984(new AbstractC10348[]{new C13761("bad dex opcode")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
                                break;
                            default:
                                c24961.m7106(abstractC217811, c18925);
                                break;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Fail on Op " + enumC5047 + " index " + i13, e);
                    }
                }
                if (enumC5047 != null) {
                    if (enumC5047.m10759()) {
                        int iM50107 = m50100(((C14411) abstractC217811).f41212);
                        stack.push((AbstractC21788) this.f70400.get(iM50107));
                        m50099(c24961, iM50107);
                    }
                    if (enumC5047.m10763()) {
                        for (C13366 c133616 : ((AbstractC17092) abstractC217811).f50509) {
                            int iM50108 = m50100(c133616);
                            stack.push((AbstractC21788) this.f70400.get(iM50108));
                            m50099(c24961, iM50108);
                        }
                    }
                    if (enumC5047.m10760()) {
                        int i15 = i13 + 1;
                        stack.push((AbstractC21788) this.f70400.get(i15));
                        m50099(c24961, i15);
                    }
                } else {
                    int i16 = i13 + 1;
                    stack.push((AbstractC21788) this.f70400.get(i16));
                    m50099(c24961, i16);
                }
                if (this.f70404[i13] <= 1) {
                    this.f70403[i13] = null;
                }
                bitSet2 = bitSet2;
            }
        }
        C17961 c17961 = this.f70397.f20257;
        c17961.getClass();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            c17961.m40881((AbstractC3880) it3.next());
        }
        for (int i17 = 0; i17 < this.f70400.size(); i17++) {
            AbstractC21788 abstractC217812 = (AbstractC21788) this.f70400.get(i17);
            if (bitSet4.get(i17)) {
                ArrayList arrayList6 = this.f70401[i17];
                if (arrayList6 != null) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        c17961.m40881((AbstractC3880) it4.next());
                    }
                }
            } else if (abstractC217812 instanceof C23799) {
                c17961.m40881(m50096(((C23799) abstractC217812).f75668));
            }
        }
        this.f70401 = null;
        C7865 c7865 = new C7865();
        int i18 = 0;
        while (true) {
            C24960[] c24960Arr = this.f70403;
            if (i18 < c24960Arr.length) {
                C24960 c24963 = c24960Arr[i18];
                if (this.f70404[i18] > 1 && c24963 != null && bitSet4.get(i18)) {
                    for (int i19 = 0; i19 < c24963.f7790.length; i19++) {
                        C8867 c8867 = (C8867) c24963.m7104(i19);
                        if (c8867 != null && c8867.f24048 != null) {
                            C8867 c8868 = c8867.f24050;
                            if (c8868 != null && c8868.f24048 == null) {
                                c7865.add(c8868);
                            }
                            HashSet<C8867> hashSet = c8867.f24049;
                            if (hashSet != null) {
                                for (C8867 c8869 : hashSet) {
                                    if (c8869.f24048 == null) {
                                        c7865.add(c8869);
                                    }
                                }
                            }
                        }
                    }
                }
                i18++;
            } else {
                while (!c7865.isEmpty()) {
                    C8867 c88610 = (C8867) c7865.poll();
                    m50097(c88610);
                    C8867 c88611 = c88610.f24050;
                    if (c88611 != null && c88611.f24048 == null) {
                        c7865.add(c88611);
                    }
                    HashSet<C8867> hashSet2 = c88610.f24049;
                    if (hashSet2 != null) {
                        for (C8867 c88612 : hashSet2) {
                            if (c88612.f24048 == null) {
                                c7865.add(c88612);
                            }
                        }
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                int i20 = 0;
                while (true) {
                    C24960[] c24960Arr2 = this.f70403;
                    if (i20 < c24960Arr2.length) {
                        C24960 c24964 = c24960Arr2[i20];
                        if (this.f70404[i20] > 1 && c24964 != null && bitSet4.get(i20)) {
                            C15041 c15041M50098 = m50096(((C23799) ((AbstractC21788) this.f70400.get(i20))).f75668);
                            ArrayList arrayList8 = new ArrayList();
                            for (int i21 = 0; i21 < c24964.f7790.length; i21++) {
                                C8867 c88613 = (C8867) c24964.m7104(i21);
                                if (c88613 != null && c88613.f24048 != null) {
                                    C8867 c88614 = c88613.f24050;
                                    if (c88614 != null) {
                                        C19736 c19736M50097 = c88614.f24048;
                                        if (c19736M50097 == null) {
                                            c19736M50097 = m50093();
                                            c88614.f24048 = c19736M50097;
                                        }
                                        hashSet3.add(c19736M50097);
                                    }
                                    HashSet hashSet4 = c88613.f24049;
                                    if (hashSet4 != null) {
                                        Iterator it5 = hashSet4.iterator();
                                        while (it5.hasNext()) {
                                            hashSet3.add(m50097((C8867) it5.next()));
                                        }
                                    }
                                    if (hashSet3.size() > 0) {
                                        arrayList8.add(C19303.m43990(c88613.f24048, new C25100((AbstractC10348[]) hashSet3.toArray(new AbstractC10348[hashSet3.size()]))));
                                        hashSet3.clear();
                                    }
                                }
                            }
                            c15041M50098.f42963 = arrayList8;
                            arrayList7.add(c15041M50098);
                        }
                        i20++;
                    } else {
                        if (arrayList7.size() > 0) {
                            this.f70397.f20260 = arrayList7;
                        }
                        return this.f70397;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19736 m50097(C8867 c8867) {
        C19736 c19736 = c8867.f24048;
        if (c19736 != null) {
            return c19736;
        }
        C19736 c19736M50093 = m50093();
        c8867.f24048 = c19736M50093;
        return c19736M50093;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50099(C24960 c24960, int i) {
        C24960[] c24960Arr = this.f70403;
        C24960 c24961 = c24960Arr[i];
        if (c24961 == null) {
            c24961 = new C24960(this.f70399.f60165);
            c24960Arr[i] = c24961;
        }
        if (this.f70404[i] <= 1) {
            c24961.f7789 = c24960.f7789;
            Object[] objArr = c24960.f7790;
            Object[] objArr2 = c24961.f7790;
            System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
            return;
        }
        for (int i2 = 0; i2 < c24960.f7790.length; i2++) {
            C8867 c8867 = (C8867) c24960.m7104(i2);
            C8867 c8868 = (C8867) c24961.m7104(i2);
            if (c8867 != null) {
                if (c8868 == null) {
                    c8868 = new C8867();
                    c24961.m7105(i2, c8868);
                }
                C8867 c8869 = c8868.f24050;
                if (c8869 == null) {
                    c8868.f24050 = c8867;
                } else if (c8869 != c8867) {
                    if (c8868.f24049 == null) {
                        c8868.f24049 = new HashSet(5);
                    }
                    c8868.f24049.add(c8867);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C19736 m50093() {
        C19736 c19736 = new C19736(this.f70397.f20261.size());
        this.f70397.f20261.add(c19736);
        return c19736;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50098(AbstractC3880 abstractC3880) {
        this.f70395.add(abstractC3880);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15041 m50096(C13366 c13366) {
        HashMap map = this.f70396;
        C15041 c15041 = (C15041) map.get(c13366);
        if (c15041 != null) {
            return c15041;
        }
        C15041 c15042 = new C15041();
        map.put(c13366, c15042);
        return c15042;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50100(C13366 c13366) {
        return ((C23799) this.f70405.get(c13366)).f68604;
    }
}
