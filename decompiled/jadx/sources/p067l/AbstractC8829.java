package p067l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۜܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8829 extends AbstractC16204 implements InterfaceC2472, InterfaceC4108 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo3495(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo3490(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo3492(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Character.valueOf(mo3491());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Character.valueOf(mo3494());
    }

    @Override // p067l.AbstractC16204, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return mo3493();
    }

    @Override // p067l.AbstractC16204, p067l.InterfaceC15358, java.util.Map
    public final InterfaceC20007 entrySet() {
        return mo3493();
    }

    /* JADX INFO: renamed from: ܳ */
    public /* bridge */ /* synthetic */ InterfaceC20007 mo3493() {
        return mo3493();
    }
}
