package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 659W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10467 extends C11194 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final HashMap f31410 = new HashMap();

    @Override // l.C11194
    public final C23166 get(Object obj) {
        return (C23166) this.f31410.get(obj);
    }

    @Override // l.C11194
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo26347(Object obj, Object obj2) {
        C23166 c23166 = get(obj);
        if (c23166 != null) {
            return c23166.f74451;
        }
        this.f31410.put(obj, m27762(obj, obj2));
        return null;
    }

    @Override // l.C11194
    public final Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f31410.remove(obj);
        return objRemove;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map.Entry m26346(InterfaceC14413 interfaceC14413) {
        HashMap map = this.f31410;
        if (map.containsKey(interfaceC14413)) {
            return ((C23166) map.get(interfaceC14413)).f74452;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26348(InterfaceC14413 interfaceC14413) {
        return this.f31410.containsKey(interfaceC14413);
    }
}
