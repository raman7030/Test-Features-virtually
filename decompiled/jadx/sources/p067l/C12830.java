package p067l;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۧ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C12830 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f36106;

    /* JADX INFO: renamed from: ۧ */
    public int f36107;

    /* JADX INFO: renamed from: ܽ */
    public int f36108;

    /* JADX INFO: renamed from: ᩳ */
    public final int f36109;

    public C12830(C3422 c3422) {
        ArrayList arrayList;
        C23955 c23955;
        int i;
        int iMo6075 = c3422.mo6075();
        Collection collectionMo6074 = c3422.mo6074();
        List<C18174> listMo6068 = c3422.mo6068();
        this.f36106 = new ArrayList();
        this.f36108 = 0;
        this.f36107 = 0;
        this.f36109 = iMo6075;
        if (((AbstractCollection) collectionMo6074).isEmpty()) {
            throw new IllegalArgumentException();
        }
        C23955 c23956 = new C23955(this, "B0", iMo6075);
        Iterator it = ((AbstractList) collectionMo6074).iterator();
        int i2 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c23956.f76116;
            if (!zHasNext) {
                break;
            }
            AbstractC9476 abstractC9476 = (AbstractC9476) it.next();
            if (!((AbstractCollection) abstractC9476.m22075().m39880()).isEmpty()) {
                if (arrayList.isEmpty()) {
                    c23956.f76114 = true;
                } else if (!c23956.f76114 && arrayList.size() == 1 && ((AbstractC9476) arrayList.get(0)).mo6217() == EnumC3167.f5839) {
                    arrayList.clear();
                    c23956.f76114 = true;
                } else {
                    this.f36106.add(c23956);
                    C23955 c23957 = new C23955(this, "B" + i2, iMo6075);
                    c23957.f76114 = true;
                    c23956.m53074(c23957, false);
                    c23957.m53073(c23956);
                    c23956 = c23957;
                    i2++;
                }
            }
            c23956.f76116.add(abstractC9476);
            if (abstractC9476.mo6217().m5446()) {
                int i3 = C4112.f9059[abstractC9476.mo6217().f6090.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    c23956.f76104 = ((AbstractC4093) abstractC9476).m8235().m42919();
                    this.f36106.add(c23956);
                    StringBuilder sb = new StringBuilder("B");
                    i = i2 + 1;
                    sb.append(i2);
                    c23955 = new C23955(this, sb.toString(), iMo6075);
                    c23956.m53074(c23955, false);
                    c23955.m53073(c23956);
                    c23956 = c23955;
                    i2 = i;
                } else if (i3 == 3 && (abstractC9476.mo6217() == EnumC3167.f6067 || abstractC9476.mo6217() == EnumC3167.f5975)) {
                    c23956.f76118 = ((AbstractC4093) abstractC9476).m8235().m42919();
                    this.f36106.add(c23956);
                    StringBuilder sb2 = new StringBuilder("B");
                    i = i2 + 1;
                    sb2.append(i2);
                    c23955 = new C23955(this, sb2.toString(), iMo6075);
                    c23956.m53074(c23955, false);
                    c23955.m53073(c23956);
                    c23956 = c23955;
                    i2 = i;
                }
            } else {
                if (abstractC9476 instanceof InterfaceC9168) {
                    c23956.f76104 = ((AbstractC4093) abstractC9476).m8235().m42919();
                }
                this.f36106.add(c23956);
                c23956 = new C23955(this, "B" + i2, iMo6075);
                i2++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f36106.add(c23956);
        }
        HashMap map = new HashMap(this.f36106.size());
        for (C23955 c23958 : this.f36106) {
            map.put(Integer.valueOf(c23958.m53075().m22075().m39874()), c23958);
        }
        for (C23955 c23959 : this.f36106) {
            int i4 = c23959.f76104;
            ArrayList arrayList2 = c23959.f76116;
            if (i4 != -1) {
                C23955 c239510 = (C23955) map.get(Integer.valueOf(i4));
                c239510 = c239510 == null ? (C23955) map.get(Integer.valueOf(c23959.f76104 + 1)) : c239510;
                if (c239510 == null) {
                    throw new RuntimeException("Block not found: address " + Integer.toHexString(c23959.f76104) + ", " + Integer.toHexString(c23959.m53075().m22075().m39874()) + ", " + Integer.toHexString(((AbstractC9476) C20013.m45383(arrayList2, 1)).m22075().m39874()));
                }
                c239510.m53073(c23959);
                c23959.m53074(c239510, false);
            } else {
                int i5 = c23959.f76118;
                if (i5 == -1) {
                    continue;
                } else {
                    C23955 c239511 = (C23955) map.get(Integer.valueOf(i5));
                    if (c239511 == null) {
                        throw new RuntimeException("Block not found: address " + c23959.f76118);
                    }
                    if (!c239511.f76115.startsWith("Switch_")) {
                        c239511.f76115 = "Switch_" + c239511.f76115;
                    }
                    c239511.m53073(c23959);
                    c23959.m53074(c239511, false);
                    int iM39874 = ((AbstractC9476) C20013.m45383(arrayList2, 1)).m22075().m39874();
                    InterfaceC18811 interfaceC18811 = (InterfaceC18811) c239511.f76116.get(0);
                    C12826.requireNonNull(interfaceC18811);
                    Iterator it2 = interfaceC18811.mo10139().iterator();
                    while (it2.hasNext()) {
                        int iMo13943 = ((InterfaceC19482) it2.next()).mo13943() + iM39874;
                        C23955 c239512 = (C23955) map.get(Integer.valueOf(iMo13943));
                        if (c239512 == null) {
                            throw new RuntimeException(C20778.m46922(iMo13943, "Block not found: address "));
                        }
                        c239512.m53073(c239511);
                        c239511.m53074(c239512, false);
                    }
                }
            }
        }
        for (C18174 c18174 : listMo6068) {
            AbstractC15510 abstractC15510 = c18174.f54253;
            C23955 c239513 = (C23955) map.get(Integer.valueOf(abstractC15510.m35300().m42919()));
            c239513 = c239513 == null ? (C23955) map.get(Integer.valueOf(abstractC15510.m35300().m42919() + 1)) : c239513;
            if (c239513 == null) {
                throw new RuntimeException("Block not found: address " + abstractC15510.m35300().m42919());
            }
            if (!c239513.f76115.startsWith("Catch_")) {
                c239513.f76115 = "Catch_" + c239513.f76115;
            }
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                if (iIntValue >= c18174.f54254.m42919() && iIntValue < c18174.f54252.m42919()) {
                    C23955 c239514 = (C23955) entry.getValue();
                    c239514.m53074(c239513, true);
                    c239513.m53073(c239514);
                }
            }
        }
        map.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29408() {
        int i = this.f36109;
        boolean[] zArr = new boolean[i];
        Arrays.fill(zArr, true);
        C15237 c15237 = new C15237(this, zArr);
        ArrayList<C23955> arrayList = this.f36106;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C23955) it.next()).f76116.iterator();
            while (it2.hasNext()) {
                C14567.m33309((AbstractC9476) it2.next(), true, c15237);
            }
        }
        boolean z = arrayList.size() > 40;
        for (C23955 c23955 : arrayList) {
            c23955.getClass();
            HashSet hashSet = new HashSet();
            TreeSet treeSet = c23955.f76108;
            treeSet.clear();
            TreeSet treeSet2 = c23955.f76106;
            treeSet2.clear();
            c23955.f76113.clear();
            C11886 c11886 = new C11886(c23955, hashSet);
            Iterator it3 = c23955.f76116.iterator();
            while (it3.hasNext()) {
                C14567.m33309((AbstractC9476) it3.next(), false, c11886);
            }
            treeSet2.removeAll(treeSet);
        }
        if (!z && arrayList.size() > 10) {
            for (C23955 c23956 : arrayList) {
                if (c23956.f76117.isEmpty()) {
                    c23956.m53071();
                }
            }
        }
        boolean[] zArr2 = new boolean[i];
        for (C23955 c23957 : arrayList) {
            ArrayList arrayList2 = c23957.f76117;
            ArrayList arrayList3 = c23957.f76116;
            if (arrayList2.isEmpty()) {
                Arrays.fill(zArr2, true);
            } else if (z) {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            } else {
                Arrays.fill(zArr2, true);
                Iterator it4 = ((TreeSet) c23957.m53077()).iterator();
                while (it4.hasNext()) {
                    zArr2[((Integer) it4.next()).intValue()] = false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (zArr[i2]) {
                        zArr2[i2] = true;
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it5 = c23957.f76105.iterator();
            while (it5.hasNext()) {
                hashSet2.addAll(((C23955) it5.next()).m53078());
            }
            C9203 c9203 = new C9203(this, zArr2, hashSet2);
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AbstractC9476 abstractC9476 = (AbstractC9476) arrayList3.get(size);
                C14567.m33309(abstractC9476, true, c9203);
                abstractC9476.m22075().m39876((boolean[]) zArr2.clone());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m29409() {
        return this.f36106;
    }
}
