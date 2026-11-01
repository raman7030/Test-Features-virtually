package p067l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7623 implements InterfaceC7131 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21214 f19961;

    /* JADX INFO: renamed from: ۧ */
    public final C13167 f19962;

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ۧ */
    public final Set mo16408() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C6282.class}[0];
        C12826.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C21562.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
    }

    public C7623(InterfaceC21214 interfaceC21214) {
        this.f19961 = interfaceC21214;
        this.f19962 = interfaceC21214.mo27092();
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ֫ */
    public final void mo16407(AbstractC2555 abstractC2555) {
        Map map = Collections.EMPTY_MAP;
        InterfaceC21214 interfaceC21214 = this.f19961;
        LinkedHashMap linkedHashMapMo27091 = interfaceC21214.mo27091(abstractC2555, "del", map);
        C13167 c13167 = this.f19962;
        c13167.m30163("del", linkedHashMapMo27091, false);
        AbstractC2555 abstractC2555M3754 = abstractC2555.m3754();
        while (abstractC2555M3754 != null) {
            AbstractC2555 abstractC2555M3765 = abstractC2555M3754.m3765();
            interfaceC21214.mo27093(abstractC2555M3754);
            abstractC2555M3754 = abstractC2555M3765;
        }
        c13167.m30165("/del");
    }
}
