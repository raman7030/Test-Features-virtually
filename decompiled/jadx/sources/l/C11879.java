package l;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S6LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11879 extends AbstractC23167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19830 f35417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11363 f35418;

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ۧ */
    public final Set mo14504() {
        Object[] objArr = {C1295.class, C22462.class, C8351.class, C20346.class, C21757.class};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        return C20195.unmodifiableSet(hashSet);
    }

    public C11879(InterfaceC19830 interfaceC19830) {
        this.f35418 = interfaceC19830.mo25075();
        this.f35417 = interfaceC19830;
    }

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ֫ */
    public final void mo14503(AbstractC0197 abstractC0197) {
        LinkedHashMap linkedHashMapMo25074;
        String str;
        boolean z = abstractC0197 instanceof C1295;
        InterfaceC19830 interfaceC19830 = this.f35417;
        C11363 c11363 = this.f35418;
        if (z) {
            AbstractC0197 abstractC0198 = (C1295) abstractC0197;
            c11363.m28117();
            c11363.m28119("table", interfaceC19830.mo25074(abstractC0198, "table", Collections.EMPTY_MAP), false);
            m29007(abstractC0198);
            c11363.m28121("/table");
            c11363.m28117();
            return;
        }
        if (abstractC0197 instanceof C22462) {
            AbstractC0197 abstractC0199 = (C22462) abstractC0197;
            c11363.m28117();
            c11363.m28119("thead", interfaceC19830.mo25074(abstractC0199, "thead", Collections.EMPTY_MAP), false);
            m29007(abstractC0199);
            c11363.m28121("/thead");
            c11363.m28117();
            return;
        }
        if (abstractC0197 instanceof C8351) {
            AbstractC0197 abstractC01910 = (C8351) abstractC0197;
            c11363.m28117();
            c11363.m28119("tbody", interfaceC19830.mo25074(abstractC01910, "tbody", Collections.EMPTY_MAP), false);
            m29007(abstractC01910);
            c11363.m28121("/tbody");
            c11363.m28117();
            return;
        }
        if (abstractC0197 instanceof C20346) {
            AbstractC0197 abstractC01911 = (C20346) abstractC0197;
            c11363.m28117();
            c11363.m28119("tr", interfaceC19830.mo25074(abstractC01911, "tr", Collections.EMPTY_MAP), false);
            m29007(abstractC01911);
            c11363.m28121("/tr");
            c11363.m28117();
            return;
        }
        if (abstractC0197 instanceof C21757) {
            C21757 c21757 = (C21757) abstractC0197;
            String str2 = c21757.m49074() ? "th" : "td";
            c11363.m28117();
            if (c21757.m49075() != null) {
                EnumC15405 enumC15405M49075 = c21757.m49075();
                int i = C6234.f19088[enumC15405M49075.ordinal()];
                if (i == 1) {
                    str = "left";
                } else if (i == 2) {
                    str = "center";
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown alignment: " + enumC15405M49075);
                    }
                    str = "right";
                }
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("align", str)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                C11003.requireNonNull(key);
                Object value = entry.getValue();
                C11003.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C5368.m15337(key, "duplicate key: "));
                }
                linkedHashMapMo25074 = interfaceC19830.mo25074(c21757, str2, C20195.unmodifiableMap(map));
            } else {
                linkedHashMapMo25074 = interfaceC19830.mo25074(c21757, str2, Collections.EMPTY_MAP);
            }
            c11363.m28119(str2, linkedHashMapMo25074, false);
            m29007(c21757);
            c11363.m28121("/".concat(str2));
            c11363.m28117();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29007(AbstractC0197 abstractC0197) {
        AbstractC0197 abstractC0197M1341 = abstractC0197.m1341();
        while (abstractC0197M1341 != null) {
            AbstractC0197 abstractC0197M1352 = abstractC0197M1341.m1352();
            this.f35417.mo25076(abstractC0197M1341);
            abstractC0197M1341 = abstractC0197M1352;
        }
    }
}
