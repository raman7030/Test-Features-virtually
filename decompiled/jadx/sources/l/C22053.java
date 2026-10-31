package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C64A */
/* JADX INFO: loaded from: classes.dex */
public final class C22053 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49615(C5637 c5637) {
        C14996.m35528(c5637);
        ArrayList arrayList = c5637.f17415;
        C14996.m35529(c5637, (InterfaceC19231) null);
        ArrayList arrayList2 = c5637.f17418;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C4931 c4931 = (C4931) it.next();
                AbstractC1591 abstractC1591M5439 = c4931.f15561;
                while (true) {
                    if (abstractC1591M5439 != c4931.f15559) {
                        if (!abstractC1591M5439.f5632 || !C14996.m35532(abstractC1591M5439)) {
                            abstractC1591M5439 = abstractC1591M5439.m5439();
                        } else {
                            boolean z = true;
                            boolean z2 = true;
                            for (C13334 c13334 : c4931.f15560) {
                                if (c13334.f5632) {
                                    z = false;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z) {
                                it.remove();
                                break;
                            }
                            c4931.f15561.f5632 = true;
                            c4931.f15559.f5632 = true;
                            if (!z2) {
                                ArrayList arrayList3 = new ArrayList(c4931.f15560.length);
                                ArrayList arrayList4 = new ArrayList(c4931.f15560.length);
                                int i = 0;
                                while (true) {
                                    C13334[] c13334Arr = c4931.f15560;
                                    if (i >= c13334Arr.length) {
                                        break;
                                    }
                                    arrayList4.add(c13334Arr[i]);
                                    arrayList3.add(c4931.f15562[i]);
                                    i++;
                                }
                                c4931.f15560 = (C13334[]) arrayList4.toArray(new C13334[arrayList4.size()]);
                                c4931.f15562 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
                                break;
                            }
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = c5637.f17411.iterator();
        while (it2.hasNext()) {
            AbstractC1591 abstractC1591 = (AbstractC1591) it2.next();
            if (!abstractC1591.f5632) {
                it2.remove();
            } else {
                EnumC7690 enumC7690 = abstractC1591.f5638;
                if (enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY) {
                    if (abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                        hashSet.add((C18274) abstractC1591.mo5445());
                    }
                }
            }
        }
        ArrayList arrayList5 = c5637.f17414;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                C13334 c13335 = (C13334) it3.next();
                if (!c13335.f5632) {
                    it3.remove();
                } else {
                    ArrayList arrayList6 = c13335.f39897;
                    if (arrayList6 != null) {
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            hashSet.add((C18274) ((C21802) it4.next()).f42444);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(hashSet);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList7 = c5637.f17414;
        if (arrayList7 != null) {
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList8 = ((C13334) it5.next()).f39897;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        C23918 c23918 = (C23918) ((C21802) it6.next()).f42445;
                        for (AbstractC8396 abstractC8396 : c23918.f17269) {
                            if (!hashSet.contains(abstractC8396)) {
                                for (AbstractC8396 abstractC8397 : c23918.f17269) {
                                    if (hashSet.contains(abstractC8397)) {
                                        hashSet2.add(abstractC8397);
                                    }
                                }
                                c23918.f17269 = (AbstractC8396[]) hashSet2.toArray(new AbstractC8396[hashSet2.size()]);
                                hashSet2.clear();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
