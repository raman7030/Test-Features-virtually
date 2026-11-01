package p067l;

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
public final class C13658 extends AbstractC24386 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21214 f38427;

    /* JADX INFO: renamed from: ۧ */
    public final C13167 f38428;

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ۧ */
    public final Set mo16408() {
        Object[] objArr = {C3599.class, C23716.class, C10305.class, C21705.class, C23046.class};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        return C21562.unmodifiableSet(hashSet);
    }

    public C13658(InterfaceC21214 interfaceC21214) {
        this.f38428 = interfaceC21214.mo27092();
        this.f38427 = interfaceC21214;
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ֫ */
    public final void mo16407(AbstractC2555 abstractC2555) {
        LinkedHashMap linkedHashMapMo27091;
        String str;
        boolean z = abstractC2555 instanceof C3599;
        InterfaceC21214 interfaceC21214 = this.f38427;
        C13167 c13167 = this.f38428;
        if (z) {
            AbstractC2555 abstractC2556 = (C3599) abstractC2555;
            c13167.m30161();
            c13167.m30163("table", interfaceC21214.mo27091(abstractC2556, "table", Collections.EMPTY_MAP), false);
            m31059(abstractC2556);
            c13167.m30165("/table");
            c13167.m30161();
            return;
        }
        if (abstractC2555 instanceof C23716) {
            AbstractC2555 abstractC2557 = (C23716) abstractC2555;
            c13167.m30161();
            c13167.m30163("thead", interfaceC21214.mo27091(abstractC2557, "thead", Collections.EMPTY_MAP), false);
            m31059(abstractC2557);
            c13167.m30165("/thead");
            c13167.m30161();
            return;
        }
        if (abstractC2555 instanceof C10305) {
            AbstractC2555 abstractC2558 = (C10305) abstractC2555;
            c13167.m30161();
            c13167.m30163("tbody", interfaceC21214.mo27091(abstractC2558, "tbody", Collections.EMPTY_MAP), false);
            m31059(abstractC2558);
            c13167.m30165("/tbody");
            c13167.m30161();
            return;
        }
        if (abstractC2555 instanceof C21705) {
            AbstractC2555 abstractC2559 = (C21705) abstractC2555;
            c13167.m30161();
            c13167.m30163("tr", interfaceC21214.mo27091(abstractC2559, "tr", Collections.EMPTY_MAP), false);
            m31059(abstractC2559);
            c13167.m30165("/tr");
            c13167.m30161();
            return;
        }
        if (abstractC2555 instanceof C23046) {
            C23046 c23046 = (C23046) abstractC2555;
            String str2 = c23046.m51423() ? "th" : "td";
            c13167.m30161();
            if (c23046.m51424() != null) {
                EnumC17009 enumC17009M51424 = c23046.m51424();
                int i = C8293.f21953[enumC17009M51424.ordinal()];
                if (i == 1) {
                    str = "left";
                } else if (i == 2) {
                    str = "center";
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown alignment: " + enumC17009M51424);
                    }
                    str = "right";
                }
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("align", str)};
                HashMap map = new HashMap(1);
                Map.Entry entry = entryArr[0];
                Object key = entry.getKey();
                C12826.requireNonNull(key);
                Object value = entry.getValue();
                C12826.requireNonNull(value);
                if (map.put(key, value) != null) {
                    throw new IllegalArgumentException(C7470.m17246(key, "duplicate key: "));
                }
                linkedHashMapMo27091 = interfaceC21214.mo27091(c23046, str2, C21562.unmodifiableMap(map));
            } else {
                linkedHashMapMo27091 = interfaceC21214.mo27091(c23046, str2, Collections.EMPTY_MAP);
            }
            c13167.m30163(str2, linkedHashMapMo27091, false);
            m31059(c23046);
            c13167.m30165("/".concat(str2));
            c13167.m30161();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m31059(AbstractC2555 abstractC2555) {
        AbstractC2555 abstractC2555M3754 = abstractC2555.m3754();
        while (abstractC2555M3754 != null) {
            AbstractC2555 abstractC2555M3765 = abstractC2555M3754.m3765();
            this.f38427.mo27093(abstractC2555M3754);
            abstractC2555M3754 = abstractC2555M3765;
        }
    }
}
