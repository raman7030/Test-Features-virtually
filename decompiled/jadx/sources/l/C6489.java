package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6489 extends AbstractC10494 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0225 f20041 = new C0225();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f20040 = new C0225();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17919(C5637 c5637) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C0225 c0225 = this.f20040;
        List arrayList2 = (List) c0225.m1479();
        C0225 c0226 = this.f20041;
        Map map = (Map) c0226.m1479();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (map == null) {
            map = new HashMap();
        }
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first.f5638 == EnumC7690.ASSIGN) {
                C21802 c21802 = (C21802) first;
                AbstractC8396 abstractC8396 = c21802.f42444;
                EnumC1340 enumC1340 = abstractC8396.f25745;
                EnumC1340 enumC1341 = EnumC1340.LOCAL;
                if (enumC1340 == enumC1341) {
                    AbstractC8396 abstractC8397 = c21802.f42445;
                    EnumC1340 enumC1342 = abstractC8397.f25745;
                    if (enumC1342 == EnumC1340.CONSTANT) {
                        arrayList2.add(c21802);
                        map.put((C18274) c21802.f42444, ((C11987) c21802.f42445).f35889);
                    } else if (enumC1342 == enumC1341) {
                        map.put((C18274) abstractC8396, abstractC8397);
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            arrayList2.clear();
            map.clear();
            c0225.m1477(arrayList2);
            c0226.m1477(map);
            return false;
        }
        C15660.m36871(map);
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = c5637.f17414;
        if (arrayList3 != null) {
            z = false;
            for (boolean z3 = true; z3; z3 = z2) {
                hashSet.clear();
                Iterator it = arrayList3.iterator();
                z2 = false;
                while (it.hasNext()) {
                    C13334 c13334 = (C13334) it.next();
                    ArrayList arrayList4 = c13334.f39897;
                    if (arrayList4 != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C21802 c21803 = (C21802) it2.next();
                            AbstractC8396[] abstractC8396ArrMo15838 = c21803.f42445.mo15838();
                            int length = abstractC8396ArrMo15838.length;
                            ArrayList arrayList5 = arrayList3;
                            Object obj = null;
                            boolean z4 = z;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    map.put((C18274) c21803.f42444, obj);
                                    if (obj instanceof C18274) {
                                        c21803.f42445 = (AbstractC8396) obj;
                                    } else {
                                        c21803.f42445 = new C11987(obj);
                                        arrayList2.add(c21803);
                                    }
                                    it2.remove();
                                    c5637.f17411.m38662(c13334, c21803);
                                    z2 = true;
                                    z = true;
                                    break;
                                }
                                int i2 = length;
                                Object obj2 = map.get(abstractC8396ArrMo15838[i]);
                                if (obj2 != null) {
                                    if (obj == null) {
                                        obj = obj2;
                                    } else if (!obj.equals(obj2)) {
                                    }
                                    i++;
                                    length = i2;
                                }
                                hashSet.addAll(Arrays.asList(c21803.f42445.mo15838()));
                                z = z4;
                                break;
                            }
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        boolean z5 = z;
                        if (c13334.f39897.size() == 0) {
                            it.remove();
                        }
                        z = z5;
                    } else {
                        arrayList = arrayList3;
                    }
                    arrayList3 = arrayList;
                }
            }
        } else {
            z = false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C21802 c21804 = (C21802) it3.next();
            if (!hashSet.contains(c21804.f42444)) {
                it3.remove();
                c5637.f17411.m38667(c21804);
                c5637.f17415.remove(c21804.f42444);
                z = true;
            }
            map2.put((C18274) c21804.f42444, c21804.f42445);
        }
        C16407 c16407 = c5637.f17411;
        C23422 c23422 = new C23422(map2);
        for (AbstractC1591 first2 = c16407.getFirst(); first2 != null; first2 = first2.m5439()) {
            C14996.m35536(first2, c23422, false);
        }
        arrayList2.clear();
        map.clear();
        c0225.m1477(arrayList2);
        c0226.m1477(map);
        return z;
    }
}
