package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5529 implements InterfaceC5012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19830 f17119;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11363 f17120;

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ۧ */
    public final Set mo14504() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C4118.class}[0];
        C11003.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C20195.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
    }

    public C5529(InterfaceC19830 interfaceC19830) {
        this.f17119 = interfaceC19830;
        this.f17120 = interfaceC19830.mo25075();
    }

    @Override // l.InterfaceC5012
    /* JADX INFO: renamed from: ֫ */
    public final void mo14503(AbstractC0197 abstractC0197) {
        Map map = Collections.EMPTY_MAP;
        InterfaceC19830 interfaceC19830 = this.f17119;
        LinkedHashMap linkedHashMapMo25074 = interfaceC19830.mo25074(abstractC0197, "del", map);
        C11363 c11363 = this.f17120;
        c11363.m28119("del", linkedHashMapMo25074, false);
        AbstractC0197 abstractC0197M1341 = abstractC0197.m1341();
        while (abstractC0197M1341 != null) {
            AbstractC0197 abstractC0197M1352 = abstractC0197M1341.m1352();
            interfaceC19830.mo25076(abstractC0197M1341);
            abstractC0197M1341 = abstractC0197M1352;
        }
        c11363.m28121("/del");
    }
}
