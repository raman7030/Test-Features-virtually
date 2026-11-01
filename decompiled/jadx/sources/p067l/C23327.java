package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C64A */
/* JADX INFO: loaded from: classes.dex */
public final class C23327 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51951(C7726 c7726) {
        C16620.m37684(c7726);
        ArrayList arrayList = c7726.f20261;
        C16620.m37685(c7726, (InterfaceC20645) null);
        ArrayList arrayList2 = c7726.f20264;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C7055 c7055 = (C7055) it.next();
                AbstractC3880 abstractC3880M7669 = c7055.f18393;
                while (true) {
                    if (abstractC3880M7669 != c7055.f18391) {
                        if (!abstractC3880M7669.f8411 || !C16620.m37688(abstractC3880M7669)) {
                            abstractC3880M7669 = abstractC3880M7669.m7669();
                        } else {
                            boolean z = true;
                            boolean z2 = true;
                            for (C15041 c15041 : c7055.f18392) {
                                if (c15041.f8411) {
                                    z = false;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z) {
                                it.remove();
                                break;
                            }
                            c7055.f18393.f8411 = true;
                            c7055.f18391.f8411 = true;
                            if (!z2) {
                                ArrayList arrayList3 = new ArrayList(c7055.f18392.length);
                                ArrayList arrayList4 = new ArrayList(c7055.f18392.length);
                                int i = 0;
                                while (true) {
                                    C15041[] c15041Arr = c7055.f18392;
                                    if (i >= c15041Arr.length) {
                                        break;
                                    }
                                    arrayList4.add(c15041Arr[i]);
                                    arrayList3.add(c7055.f18394[i]);
                                    i++;
                                }
                                c7055.f18392 = (C15041[]) arrayList4.toArray(new C15041[arrayList4.size()]);
                                c7055.f18394 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
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
        Iterator it2 = c7726.f20257.iterator();
        while (it2.hasNext()) {
            AbstractC3880 abstractC3880 = (AbstractC3880) it2.next();
            if (!abstractC3880.f8411) {
                it2.remove();
            } else {
                EnumC9677 enumC9677 = abstractC3880.f8417;
                if (enumC9677 == EnumC9677.ASSIGN || enumC9677 == EnumC9677.IDENTITY) {
                    if (abstractC3880.mo7675().f28658 == EnumC3642.LOCAL) {
                        hashSet.add((C19736) abstractC3880.mo7675());
                    }
                }
            }
        }
        ArrayList arrayList5 = c7726.f20260;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                C15041 c15042 = (C15041) it3.next();
                if (!c15042.f8411) {
                    it3.remove();
                } else {
                    ArrayList arrayList6 = c15042.f42963;
                    if (arrayList6 != null) {
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            hashSet.add((C19736) ((C23089) it4.next()).f45527);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(hashSet);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList7 = c7726.f20260;
        if (arrayList7 != null) {
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList8 = ((C15041) it5.next()).f42963;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        C25100 c25100 = (C25100) ((C23089) it6.next()).f45528;
                        for (AbstractC10348 abstractC10348 : c25100.f20109) {
                            if (!hashSet.contains(abstractC10348)) {
                                for (AbstractC10348 abstractC10349 : c25100.f20109) {
                                    if (hashSet.contains(abstractC10349)) {
                                        hashSet2.add(abstractC10349);
                                    }
                                }
                                c25100.f20109 = (AbstractC10348[]) hashSet2.toArray(new AbstractC10348[hashSet2.size()]);
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
