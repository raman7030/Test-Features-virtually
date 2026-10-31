package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ܶܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TPA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15379 extends AbstractC1269 implements InterfaceC1749, InterfaceC1830 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo5874(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo5872(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo5871(((Integer) obj).intValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Integer.valueOf(mo5870());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Integer.valueOf(mo5868());
    }

    @Override // l.AbstractC1269, java.util.Map
    public final Set entrySet() {
        return mo5869();
    }

    @Override // l.AbstractC1269, l.InterfaceC13659, java.util.Map
    public final InterfaceC18559 entrySet() {
        return mo5869();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX INFO: renamed from: ۜ */
    public /* bridge */ /* synthetic */ InterfaceC18559 mo5869() {
        return mo5869();
    }
}
