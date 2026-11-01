package p067l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10767 extends C8755 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C23663 f29839;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10767(C23663 c23663, C14119 c14119) {
        super(c23663, EnumC3600.f7341, "inapplicable symbols", c14119);
        this.f29839 = c23663;
    }

    @Override // p067l.C8755, p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        Map mapM24801;
        EnumSet enumSetNoneOf;
        Map mapM24802 = m24801();
        C23663 c23663 = this.f29839;
        C8200 c8200 = c23663.f75320;
        if (c23663.f75303) {
            mapM24801 = m24799(mapM24802);
        } else {
            mapM24801 = m24801();
        }
        if (mapM24801.isEmpty()) {
            mapM24801 = mapM24802;
        }
        boolean z = ((HashMap) mapM24802).size() != mapM24801.size();
        if (mapM24801.size() > 1) {
            C8005 c8005 = c23663.f75333;
            if (z) {
                enumSetNoneOf = EnumSet.of(EnumC21417.COMPRESSED);
            } else {
                enumSetNoneOf = EnumSet.noneOf(EnumC21417.class);
            }
            C18258 c18258M18544 = c8005.m18544(enumC14710, enumSetNoneOf, c23663.f75324.m9345(), interfaceC5323, abstractC12224 == c8200.f21737 ? EnumC10306.CONSTRUCTOR : this.f20405.m6621(), abstractC12224 == c8200.f21737 ? abstractC6462.f16705.f20408 : abstractC12224, c23663.m52638(c4848));
            C4848 c4848M10283 = C4848.m10283();
            for (Map.Entry entry : mapM24801.entrySet()) {
                AbstractC7783 abstractC7784 = (AbstractC7783) entry.getKey();
                C8005 c8006 = c23663.f75333;
                C8374 c8374 = c23663.f75323;
                EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7784);
                AbstractC7783 abstractC7783M17997 = abstractC7784.m17997(abstractC6462, c8374);
                AbstractC7783 abstractC7783Mo12936 = abstractC7784.mo12936(abstractC6462, c8374);
                C18258 c18258 = (C18258) entry.getValue();
                C13370 c13370 = C13665.f38450;
                c4848M10283 = c4848M10283.m10290(c8006.m18543(new C13370("compiler", "inapplicable.method", enumC10306M51425, abstractC7783M17997, abstractC7783Mo12936, c18258)));
            }
            return new C24098(c18258M18544, c4848M10283);
        }
        if (mapM24801.size() == 1) {
            Map.Entry entry2 = (Map.Entry) mapM24801.entrySet().iterator().next();
            C18258 c18258Mo6320 = new C22167(this, this.f23735, new C24293((AbstractC7783) entry2.getKey(), (C18258) entry2.getValue())).mo6320(enumC14710, interfaceC5323, abstractC7783, abstractC6462, abstractC12224, c4848, c4849);
            if (z) {
                c18258Mo6320.m41587(EnumC21417.COMPRESSED);
            }
            return c18258Mo6320;
        }
        return new C10252(c23663, EnumC3600.f7346).mo6320(enumC14710, interfaceC5323, abstractC7783, abstractC6462, abstractC12224, c4848, c4849);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩶֫ */
    public Map m24801() {
        C11438 c11438 = new C11438(this);
        for (C14789 c14789 : this.f23735.f40074) {
            boolean zM33755 = c14789.m33755();
            AbstractC7783 abstractC7783 = c14789.f42190;
            if (!zM33755) {
                C23663 c23663 = c11438.f31891.f29839;
                C20271 c20271 = new C20271();
                Iterator it = c11438.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = c20271.iterator();
                        while (it2.hasNext()) {
                            c11438.remove((AbstractC7783) it2.next());
                        }
                        c11438.put(abstractC7783, c14789.f42187);
                        break;
                    }
                    AbstractC7783 abstractC7784 = (AbstractC7783) it.next();
                    if (abstractC7784 != abstractC7783) {
                        if (abstractC7783.mo12938(abstractC7784, (AbstractC21195) abstractC7784.f20407, c23663.f75323, false)) {
                            c20271.m45777(abstractC7784);
                        } else if (abstractC7784.mo12938(abstractC7783, (AbstractC21195) abstractC7783.f20407, c23663.f75323, false)) {
                            break;
                        }
                    }
                }
            }
        }
        return c11438;
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m24799(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C18258 c18258 = (C18258) entry.getValue();
            String strM51041 = EnumC22837.ARITY_MISMATCH.m51041();
            C9425[] c9425Arr = new C9425[0];
            Object[] objArrM41590 = c18258.m41590();
            if (c18258.mo31353().matches(strM51041) && c18258.m41590().length == 0) {
                for (int i = 0; i < objArrM41590.length; i++) {
                    if (c9425Arr[i].mo21932(objArrM41590[i])) {
                    }
                }
            }
            linkedHashMap.put((AbstractC7783) entry.getKey(), c18258);
        }
        return linkedHashMap;
    }

    @Override // p067l.C8755
    /* JADX INFO: renamed from: ᩹֫ */
    public final C24293 mo3723() {
        LinkedHashMap linkedHashMapM24799 = m24799(m24801());
        if (linkedHashMapM24799.size() == 1) {
            return new C24293((AbstractC7783) linkedHashMapM24799.keySet().iterator().next(), (C18258) linkedHashMapM24799.values().iterator().next());
        }
        return null;
    }
}
