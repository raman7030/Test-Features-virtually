package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3841 {

    /* JADX INFO: renamed from: ֫ */
    public static C9245 f8244 = new C9245(null, true);

    /* JADX INFO: renamed from: ֫ */
    public static void m7538(C7726 c7726) {
        C19736 c19736;
        HashMap map = new HashMap();
        for (AbstractC3880 abstractC3880 : c7726.f20257) {
            if (abstractC3880.f8417 == EnumC9677.ASSIGN && abstractC3880.mo7675().f28658 == EnumC3642.LOCAL && abstractC3880.mo7674().f28658 == EnumC3642.NEW) {
                C19736 c19737 = (C19736) abstractC3880.mo7675();
                C15279 c15279 = new C15279();
                c15279.f43604 = c19737;
                map.put(c19737, c15279);
            }
        }
        if (map.size() > 0) {
            int iM37690 = C16620.m37690(c7726);
            C16620.m37684(c7726);
            C16620.m37687(c7726.f20257, new C23997(iM37690, map));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                C15279 c152710 = (C15279) ((Map.Entry) it.next()).getValue();
                boolean z = !c152710.f43605;
                if (c152710.f43603 == null) {
                    z = false;
                }
                if (!z) {
                    it.remove();
                }
            }
            if (map.size() > 0) {
                HashSet hashSet = new HashSet();
                C19736[] c19736Arr = new C19736[iM37690];
                for (C19736 c19738 : c7726.f20261) {
                    c19736Arr[c19738.f60034] = c19738;
                }
                for (C15279 c152711 : map.values()) {
                    C9245[] c9245Arr = (C9245[]) c152711.f43603.f8416;
                    for (int i = 0; i < c9245Arr.length; i++) {
                        C9245 c9245 = c9245Arr[i];
                        if (c9245 != null && c9245.f25070 == c152711) {
                            hashSet.add(c19736Arr[i]);
                        }
                    }
                }
                Iterator it2 = c7726.f20257.iterator();
                while (it2.hasNext()) {
                    AbstractC3880 abstractC3881 = (AbstractC3880) it2.next();
                    if (abstractC3881.f8417 == EnumC9677.ASSIGN && abstractC3881.mo7675().f28658 == EnumC3642.LOCAL && hashSet.contains((C19736) abstractC3881.mo7675())) {
                        it2.remove();
                    }
                }
                for (C15279 c152712 : map.values()) {
                    AbstractC3880 abstractC3882 = c152712.f43603;
                    C19736 c19739 = c152712.f43604;
                    C9245[] c9245Arr2 = (C9245[]) abstractC3882.f8416;
                    for (int i2 = 0; i2 < c9245Arr2.length; i2++) {
                        C9245 c9246 = c9245Arr2[i2];
                        if (c9246 != null && c9246.f25070 == c152712 && (c19736 = c19736Arr[i2]) != c19739) {
                            c7726.f20257.m40878(c152712.f43603, C19303.m43990(c19736, c19739));
                        }
                    }
                    C13031 c13031M7537 = m7537(c152712.f43603);
                    AbstractC10348[] abstractC10348Arr = c13031M7537.f20109;
                    C9342 c9342 = c13031M7537.f36656;
                    c7726.f20257.m40884(c152712.f43603, C19303.m43990(c19739, C24489.m53984((AbstractC10348[]) Arrays.copyOfRange(abstractC10348Arr, 1, abstractC10348Arr.length), c9342.m21677(), c9342.m21675())));
                }
            }
            Iterator it3 = c7726.f20257.iterator();
            while (it3.hasNext()) {
                ((AbstractC3880) it3.next()).f8416 = null;
            }
        }
        Iterator it4 = c7726.f20257.iterator();
        while (it4.hasNext()) {
            AbstractC3880 abstractC3883 = (AbstractC3880) it4.next();
            C13031 c13031M7538 = m7537(abstractC3883);
            if (c13031M7538 != null) {
                C9342 c9343 = c13031M7538.f36656;
                if ("<init>".equals(c9343.m21673()) && "V".equals(c9343.m21674())) {
                    AbstractC10348[] abstractC10348Arr2 = c13031M7538.f20109;
                    AbstractC10348 abstractC10348 = abstractC10348Arr2[0];
                    if (abstractC10348.f28658 == EnumC3642.NEW) {
                        c7726.f20257.m40882(abstractC3883, new C8574(C24489.m53984((AbstractC10348[]) Arrays.copyOfRange(abstractC10348Arr2, 1, abstractC10348Arr2.length), c9343.m21677(), c9343.m21675())));
                        it4.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13031 m7537(AbstractC3880 abstractC3880) {
        EnumC9677 enumC9677 = abstractC3880.f8417;
        if (enumC9677 == EnumC9677.ASSIGN) {
            if (abstractC3880.mo7674().f28658 == EnumC3642.INVOKE_SPECIAL) {
                return (C13031) abstractC3880.mo7674();
            }
            return null;
        }
        if (enumC9677 != EnumC9677.VOID_INVOKE) {
            return null;
        }
        AbstractC10348 abstractC10348Mo7672 = abstractC3880.mo7672();
        if (abstractC10348Mo7672 instanceof C13031) {
            return (C13031) abstractC10348Mo7672;
        }
        return null;
    }
}
