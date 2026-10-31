package l;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11195 implements InterfaceC5012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19830 f33604;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11363 f33605;

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ۧ */
    public final Set mo14504() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C13994.class}[0];
        C11003.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C20195.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
    }

    public C11195(InterfaceC19830 interfaceC19830) {
        this.f33604 = interfaceC19830;
        this.f33605 = interfaceC19830.mo25075();
    }

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ֫ */
    public final void mo14503(AbstractC0197 abstractC0197) {
        if (abstractC0197 instanceof C13994) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", "checkbox");
            linkedHashMap.put("disabled", "");
            if (((C13994) abstractC0197).m33475()) {
                linkedHashMap.put("checked", "");
            }
            InterfaceC19830 interfaceC19830 = this.f33604;
            LinkedHashMap linkedHashMapMo25074 = interfaceC19830.mo25074(abstractC0197, "input", linkedHashMap);
            C11363 c11363 = this.f33605;
            c11363.m28119("input", linkedHashMapMo25074, false);
            c11363.m28122(" ");
            AbstractC0197 abstractC0197M1341 = abstractC0197.m1341();
            while (abstractC0197M1341 != null) {
                AbstractC0197 abstractC0197M1352 = abstractC0197M1341.m1352();
                interfaceC19830.mo25076(abstractC0197M1341);
                abstractC0197M1341 = abstractC0197M1352;
            }
        }
    }
}
