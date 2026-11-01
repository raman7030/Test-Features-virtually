package p067l;

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
public final class C8535 extends AbstractC12342 {

    /* JADX INFO: renamed from: ۧ */
    public final C2582 f22915 = new C2582();

    /* JADX INFO: renamed from: ֫ */
    public final C2582 f22914 = new C2582();

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19867(C7726 c7726) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C2582 c2582 = this.f22914;
        List arrayList2 = (List) c2582.m3892();
        C2582 c2583 = this.f22915;
        Map map = (Map) c2583.m3892();
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (map == null) {
            map = new HashMap();
        }
        for (AbstractC3880 first = c7726.f20257.getFirst(); first != null; first = first.m7669()) {
            if (first.f8417 == EnumC9677.ASSIGN) {
                C23089 c23089 = (C23089) first;
                AbstractC10348 abstractC10348 = c23089.f45527;
                EnumC3642 enumC3642 = abstractC10348.f28658;
                EnumC3642 enumC3643 = EnumC3642.LOCAL;
                if (enumC3642 == enumC3643) {
                    AbstractC10348 abstractC10349 = c23089.f45528;
                    EnumC3642 enumC3644 = abstractC10349.f28658;
                    if (enumC3644 == EnumC3642.CONSTANT) {
                        arrayList2.add(c23089);
                        map.put((C19736) c23089.f45527, ((C13761) c23089.f45528).f38899);
                    } else if (enumC3644 == enumC3643) {
                        map.put((C19736) abstractC10348, abstractC10349);
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            arrayList2.clear();
            map.clear();
            c2582.m3890(arrayList2);
            c2583.m3890(map);
            return false;
        }
        C17251.m39037(map);
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = c7726.f20260;
        if (arrayList3 != null) {
            z = false;
            for (boolean z3 = true; z3; z3 = z2) {
                hashSet.clear();
                Iterator it = arrayList3.iterator();
                z2 = false;
                while (it.hasNext()) {
                    C15041 c15041 = (C15041) it.next();
                    ArrayList arrayList4 = c15041.f42963;
                    if (arrayList4 != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C23089 c230810 = (C23089) it2.next();
                            AbstractC10348[] abstractC10348ArrMo17753 = c230810.f45528.mo17753();
                            int length = abstractC10348ArrMo17753.length;
                            ArrayList arrayList5 = arrayList3;
                            Object obj = null;
                            boolean z4 = z;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    map.put((C19736) c230810.f45527, obj);
                                    if (obj instanceof C19736) {
                                        c230810.f45528 = (AbstractC10348) obj;
                                    } else {
                                        c230810.f45528 = new C13761(obj);
                                        arrayList2.add(c230810);
                                    }
                                    it2.remove();
                                    c7726.f20257.m40878(c15041, c230810);
                                    z2 = true;
                                    z = true;
                                    break;
                                }
                                int i2 = length;
                                Object obj2 = map.get(abstractC10348ArrMo17753[i]);
                                if (obj2 != null) {
                                    if (obj == null) {
                                        obj = obj2;
                                    } else if (!obj.equals(obj2)) {
                                    }
                                    i++;
                                    length = i2;
                                }
                                hashSet.addAll(Arrays.asList(c230810.f45528.mo17753()));
                                z = z4;
                                break;
                            }
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        boolean z5 = z;
                        if (c15041.f42963.size() == 0) {
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
            C23089 c230811 = (C23089) it3.next();
            if (!hashSet.contains(c230811.f45527)) {
                it3.remove();
                c7726.f20257.m40883(c230811);
                c7726.f20261.remove(c230811.f45527);
                z = true;
            }
            map2.put((C19736) c230811.f45527, c230811.f45528);
        }
        C17961 c17961 = c7726.f20257;
        C24628 c24628 = new C24628(map2);
        for (AbstractC3880 first2 = c17961.getFirst(); first2 != null; first2 = first2.m7669()) {
            C16620.m37692(first2, c24628, false);
        }
        arrayList2.clear();
        map.clear();
        c2582.m3890(arrayList2);
        c2583.m3890(map);
        return z;
    }
}
