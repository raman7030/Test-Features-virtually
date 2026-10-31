package l;

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
public final class C11008 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f33112;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33113;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33114;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33115;

    public C11008(C1109 c1109) {
        ArrayList arrayList;
        C22714 c22714;
        int i;
        int iMo3818 = c1109.mo3818();
        Collection collectionMo3817 = c1109.mo3817();
        List<C16631> listMo3811 = c1109.mo3811();
        this.f33112 = new ArrayList();
        this.f33114 = 0;
        this.f33113 = 0;
        this.f33115 = iMo3818;
        if (((AbstractCollection) collectionMo3817).isEmpty()) {
            throw new IllegalArgumentException();
        }
        C22714 c22715 = new C22714(this, "B0", iMo3818);
        Iterator it = ((AbstractList) collectionMo3817).iterator();
        int i2 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c22715.f73393;
            if (!zHasNext) {
                break;
            }
            AbstractC7479 abstractC7479 = (AbstractC7479) it.next();
            if (!((AbstractCollection) abstractC7479.m20099().m37705()).isEmpty()) {
                if (arrayList.isEmpty()) {
                    c22715.f73391 = true;
                } else if (!c22715.f73391 && arrayList.size() == 1 && ((AbstractC7479) arrayList.get(0)).mo3975() == EnumC0841.f3065) {
                    arrayList.clear();
                    c22715.f73391 = true;
                } else {
                    this.f33112.add(c22715);
                    C22714 c22716 = new C22714(this, "B" + i2, iMo3818);
                    c22716.f73391 = true;
                    c22715.m50748(c22716, false);
                    c22716.m50747(c22715);
                    c22715 = c22716;
                    i2++;
                }
            }
            c22715.f73393.add(abstractC7479);
            if (abstractC7479.mo3975().m3132()) {
                int i3 = C1835.f6280[abstractC7479.mo3975().f3316.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    c22715.f73381 = ((AbstractC1815) abstractC7479).m6037().m40668();
                    this.f33112.add(c22715);
                    StringBuilder sb = new StringBuilder("B");
                    i = i2 + 1;
                    sb.append(i2);
                    c22714 = new C22714(this, sb.toString(), iMo3818);
                    c22715.m50748(c22714, false);
                    c22714.m50747(c22715);
                    c22715 = c22714;
                    i2 = i;
                } else if (i3 == 3 && (abstractC7479.mo3975() == EnumC0841.f3293 || abstractC7479.mo3975() == EnumC0841.f3201)) {
                    c22715.f73395 = ((AbstractC1815) abstractC7479).m6037().m40668();
                    this.f33112.add(c22715);
                    StringBuilder sb2 = new StringBuilder("B");
                    i = i2 + 1;
                    sb2.append(i2);
                    c22714 = new C22714(this, sb2.toString(), iMo3818);
                    c22715.m50748(c22714, false);
                    c22714.m50747(c22715);
                    c22715 = c22714;
                    i2 = i;
                }
            } else {
                if (abstractC7479 instanceof InterfaceC7155) {
                    c22715.f73381 = ((AbstractC1815) abstractC7479).m6037().m40668();
                }
                this.f33112.add(c22715);
                c22715 = new C22714(this, "B" + i2, iMo3818);
                i2++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f33112.add(c22715);
        }
        HashMap map = new HashMap(this.f33112.size());
        for (C22714 c22717 : this.f33112) {
            map.put(Integer.valueOf(c22717.m50749().m20099().m37699()), c22717);
        }
        for (C22714 c22718 : this.f33112) {
            int i4 = c22718.f73381;
            ArrayList arrayList2 = c22718.f73393;
            if (i4 != -1) {
                C22714 c22719 = (C22714) map.get(Integer.valueOf(i4));
                c22719 = c22719 == null ? (C22714) map.get(Integer.valueOf(c22718.f73381 + 1)) : c22719;
                if (c22719 == null) {
                    throw new RuntimeException("Block not found: address " + Integer.toHexString(c22718.f73381) + ", " + Integer.toHexString(c22718.m50749().m20099().m37699()) + ", " + Integer.toHexString(((AbstractC7479) C18566.m43105(arrayList2, 1)).m20099().m37699()));
                }
                c22719.m50747(c22718);
                c22718.m50748(c22719, false);
            } else {
                int i5 = c22718.f73395;
                if (i5 == -1) {
                    continue;
                } else {
                    C22714 c227110 = (C22714) map.get(Integer.valueOf(i5));
                    if (c227110 == null) {
                        throw new RuntimeException("Block not found: address " + c22718.f73395);
                    }
                    if (!c227110.f73392.startsWith("Switch_")) {
                        c227110.f73392 = "Switch_" + c227110.f73392;
                    }
                    c227110.m50747(c22718);
                    c22718.m50748(c227110, false);
                    int iM37699 = ((AbstractC7479) C18566.m43105(arrayList2, 1)).m20099().m37699();
                    InterfaceC17301 interfaceC17301 = (InterfaceC17301) c227110.f73393.get(0);
                    C11003.requireNonNull(interfaceC17301);
                    Iterator it2 = interfaceC17301.mo8107().iterator();
                    while (it2.hasNext()) {
                        int iMo12019 = ((InterfaceC18007) it2.next()).mo12019() + iM37699;
                        C22714 c227111 = (C22714) map.get(Integer.valueOf(iMo12019));
                        if (c227111 == null) {
                            throw new RuntimeException(C19370.m44628(iMo12019, "Block not found: address "));
                        }
                        c227111.m50747(c227110);
                        c227110.m50748(c227111, false);
                    }
                }
            }
        }
        for (C16631 c16631 : listMo3811) {
            AbstractC13828 abstractC13828 = c16631.f51073;
            C22714 c227112 = (C22714) map.get(Integer.valueOf(abstractC13828.m33182().m40668()));
            c227112 = c227112 == null ? (C22714) map.get(Integer.valueOf(abstractC13828.m33182().m40668() + 1)) : c227112;
            if (c227112 == null) {
                throw new RuntimeException("Block not found: address " + abstractC13828.m33182().m40668());
            }
            if (!c227112.f73392.startsWith("Catch_")) {
                c227112.f73392 = "Catch_" + c227112.f73392;
            }
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                if (iIntValue >= c16631.f51074.m40668() && iIntValue < c16631.f51072.m40668()) {
                    C22714 c227113 = (C22714) entry.getValue();
                    c227113.m50748(c227112, true);
                    c227112.m50747(c227113);
                }
            }
        }
        map.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27346() {
        int i = this.f33115;
        boolean[] zArr = new boolean[i];
        Arrays.fill(zArr, true);
        C13541 c13541 = new C13541(this, zArr);
        ArrayList<C22714> arrayList = this.f33112;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C22714) it.next()).f73393.iterator();
            while (it2.hasNext()) {
                C12836.m31223((AbstractC7479) it2.next(), true, c13541);
            }
        }
        boolean z = arrayList.size() > 40;
        for (C22714 c22714 : arrayList) {
            c22714.getClass();
            HashSet hashSet = new HashSet();
            TreeSet treeSet = c22714.f73385;
            treeSet.clear();
            TreeSet treeSet2 = c22714.f73383;
            treeSet2.clear();
            c22714.f73390.clear();
            C10015 c10015 = new C10015(c22714, hashSet);
            Iterator it3 = c22714.f73393.iterator();
            while (it3.hasNext()) {
                C12836.m31223((AbstractC7479) it3.next(), false, c10015);
            }
            treeSet2.removeAll(treeSet);
        }
        if (!z && arrayList.size() > 10) {
            for (C22714 c22715 : arrayList) {
                if (c22715.f73394.isEmpty()) {
                    c22715.m50745();
                }
            }
        }
        boolean[] zArr2 = new boolean[i];
        for (C22714 c22716 : arrayList) {
            ArrayList arrayList2 = c22716.f73394;
            ArrayList arrayList3 = c22716.f73393;
            if (arrayList2.isEmpty()) {
                Arrays.fill(zArr2, true);
            } else if (z) {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            } else {
                Arrays.fill(zArr2, true);
                Iterator it4 = ((TreeSet) c22716.m50751()).iterator();
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
            Iterator it5 = c22716.f73382.iterator();
            while (it5.hasNext()) {
                hashSet2.addAll(((C22714) it5.next()).m50752());
            }
            C7192 c7192 = new C7192(this, zArr2, hashSet2);
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AbstractC7479 abstractC7479 = (AbstractC7479) arrayList3.get(size);
                C12836.m31223(abstractC7479, true, c7192);
                abstractC7479.m20099().m37701((boolean[]) zArr2.clone());
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27347() {
        return this.f33112;
    }
}
