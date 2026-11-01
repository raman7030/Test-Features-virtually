package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤᩴ */
/* JADX INFO: compiled from: 659W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1361 extends C1397 {

    /* JADX INFO: renamed from: ۗ */
    public final HashMap f34375 = new HashMap();

    @Override // p067l.C1397
    public final C1991 get(Object obj) {
        return (C1991) this.f34375.get(obj);
    }

    @Override // p067l.C1397
    /* JADX INFO: renamed from: ۧ */
    public final Object mo28379(Object obj, Object obj2) {
        C1991 c1991 = get(obj);
        if (c1991 != null) {
            return c1991.f77196;
        }
        this.f34375.put(obj, m29824(obj, obj2));
        return null;
    }

    @Override // p067l.C1397
    public final Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f34375.remove(obj);
        return objRemove;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map.Entry m28378(InterfaceC16066 interfaceC16066) {
        HashMap map = this.f34375;
        if (map.containsKey(interfaceC16066)) {
            return ((C1991) map.get(interfaceC16066)).f77197;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m28380(InterfaceC16066 interfaceC16066) {
        return this.f34375.containsKey(interfaceC16066);
    }
}
