package p067l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ܶܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16985 extends AbstractC3575 implements InterfaceC4031, InterfaceC4108 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo8084(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo8082(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo8081(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Integer.valueOf(mo8080());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Integer.valueOf(mo8078());
    }

    @Override // p067l.AbstractC3575, java.util.Map
    public final Set entrySet() {
        return mo8079();
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC15350, java.util.Map
    public final InterfaceC20007 entrySet() {
        return mo8079();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX INFO: renamed from: ۜ */
    public /* bridge */ /* synthetic */ InterfaceC20007 mo8079() {
        return mo8079();
    }
}
