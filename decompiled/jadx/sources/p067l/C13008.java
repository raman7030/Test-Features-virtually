package p067l;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13008 implements InterfaceC7131 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21214 f36603;

    /* JADX INFO: renamed from: ۧ */
    public final C13167 f36604;

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ۧ */
    public final Set mo16408() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C15668.class}[0];
        C12826.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C21562.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
    }

    public C13008(InterfaceC21214 interfaceC21214) {
        this.f36603 = interfaceC21214;
        this.f36604 = interfaceC21214.mo27092();
    }

    @Override // p067l.InterfaceC7131
    /* JADX INFO: renamed from: ֫ */
    public final void mo16407(AbstractC2555 abstractC2555) {
        if (abstractC2555 instanceof C15668) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", "checkbox");
            linkedHashMap.put("disabled", "");
            if (((C15668) abstractC2555).m35595()) {
                linkedHashMap.put("checked", "");
            }
            InterfaceC21214 interfaceC21214 = this.f36603;
            LinkedHashMap linkedHashMapMo27091 = interfaceC21214.mo27091(abstractC2555, "input", linkedHashMap);
            C13167 c13167 = this.f36604;
            c13167.m30163("input", linkedHashMapMo27091, false);
            c13167.m30166(" ");
            AbstractC2555 abstractC2555M3754 = abstractC2555.m3754();
            while (abstractC2555M3754 != null) {
                AbstractC2555 abstractC2555M3765 = abstractC2555M3754.m3765();
                interfaceC21214.mo27093(abstractC2555M3754);
                abstractC2555M3754 = abstractC2555M3765;
            }
        }
    }
}
