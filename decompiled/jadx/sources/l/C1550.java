package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1550 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7236 f5463 = new C7236(null, true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5309(C5637 c5637) {
        C18274 c18274;
        HashMap map = new HashMap();
        for (AbstractC1591 abstractC1591 : c5637.f17411) {
            if (abstractC1591.f5638 == EnumC7690.ASSIGN && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL && abstractC1591.mo5444().f25745 == EnumC1340.NEW) {
                C18274 c18275 = (C18274) abstractC1591.mo5445();
                C13585 c13585 = new C13585();
                c13585.f40527 = c18275;
                map.put(c18275, c13585);
            }
        }
        if (map.size() > 0) {
            int iM35534 = C14996.m35534(c5637);
            C14996.m35528(c5637);
            C14996.m35531(c5637.f17411, new C22758(iM35534, map));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C13585 c13586 = (C13585) ((Map.Entry) it.next()).getValue();
                boolean z = !c13586.f40528;
                if (c13586.f40526 == null) {
                    z = false;
                }
                if (!z) {
                    it.remove();
                }
            }
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                C18274[] c18274Arr = new C18274[iM35534];
                for (C18274 c18276 : c5637.f17415) {
                    c18274Arr[c18276.f56817] = c18276;
                }
                for (C13585 c13587 : map.values()) {
                    C7236[] c7236Arr = (C7236[]) c13587.f40526.f5637;
                    for (int i = 0; i < c7236Arr.length; i++) {
                        C7236 c7236 = c7236Arr[i];
                        if (c7236 != null && c7236.f22187 == c13587) {
                            hashSet.add(c18274Arr[i]);
                        }
                    }
                }
                Iterator it2 = c5637.f17411.iterator();
                while (it2.hasNext()) {
                    AbstractC1591 abstractC1592 = (AbstractC1591) it2.next();
                    if (abstractC1592.f5638 == EnumC7690.ASSIGN && abstractC1592.mo5445().f25745 == EnumC1340.LOCAL && hashSet.contains((C18274) abstractC1592.mo5445())) {
                        it2.remove();
                    }
                }
                for (C13585 c13588 : map.values()) {
                    AbstractC1591 abstractC1593 = c13588.f40526;
                    C18274 c18277 = c13588.f40527;
                    C7236[] c7236Arr2 = (C7236[]) abstractC1593.f5637;
                    for (int i2 = 0; i2 < c7236Arr2.length; i2++) {
                        C7236 c7237 = c7236Arr2[i2];
                        if (c7237 != null && c7237.f22187 == c13588 && (c18274 = c18274Arr[i2]) != c18277) {
                            c5637.f17411.m38662(c13588.f40526, C17819.m41744(c18274, c18277));
                        }
                    }
                    C11219 c11219M5308 = m5308(c13588.f40526);
                    AbstractC8396[] abstractC8396Arr = c11219M5308.f17269;
                    C7338 c7338 = c11219M5308.f33657;
                    c5637.f17411.m38668(c13588.f40526, C17819.m41744(c18277, C23275.m51588((AbstractC8396[]) Arrays.copyOfRange(abstractC8396Arr, 1, abstractC8396Arr.length), c7338.m19704(), c7338.m19702())));
                }
            }
            Iterator it3 = c5637.f17411.iterator();
            while (it3.hasNext()) {
                ((AbstractC1591) it3.next()).f5637 = null;
            }
        }
        Iterator it4 = c5637.f17411.iterator();
        while (it4.hasNext()) {
            AbstractC1591 abstractC1594 = (AbstractC1591) it4.next();
            C11219 c11219M5309 = m5308(abstractC1594);
            if (c11219M5309 != null) {
                C7338 c7339 = c11219M5309.f33657;
                if ("<init>".equals(c7339.m19700()) && "V".equals(c7339.m19701())) {
                    AbstractC8396[] abstractC8396Arr2 = c11219M5309.f17269;
                    AbstractC8396 abstractC8396 = abstractC8396Arr2[0];
                    if (abstractC8396.f25745 == EnumC1340.NEW) {
                        c5637.f17411.m38666(abstractC1594, new C6530(C23275.m51588((AbstractC8396[]) Arrays.copyOfRange(abstractC8396Arr2, 1, abstractC8396Arr2.length), c7339.m19704(), c7339.m19702())));
                        it4.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11219 m5308(AbstractC1591 abstractC1591) {
        EnumC7690 enumC7690 = abstractC1591.f5638;
        if (enumC7690 == EnumC7690.ASSIGN) {
            if (abstractC1591.mo5444().f25745 == EnumC1340.INVOKE_SPECIAL) {
                return (C11219) abstractC1591.mo5444();
            }
            return null;
        }
        if (enumC7690 != EnumC7690.VOID_INVOKE) {
            return null;
        }
        AbstractC8396 abstractC8396Mo5442 = abstractC1591.mo5442();
        if (abstractC8396Mo5442 instanceof C11219) {
            return (C11219) abstractC8396Mo5442;
        }
        return null;
    }
}
