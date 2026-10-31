package l;

import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۜܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: CCCZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6798 extends AbstractC14558 implements InterfaceC0109, InterfaceC1830 {
    public static final long serialVersionUID = -1773560792952436569L;

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return mo1099(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return mo1094(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return mo1096(((Character) obj).charValue());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return Character.valueOf(mo1095());
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return Character.valueOf(mo1098());
    }

    @Override // l.AbstractC14558, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return mo1097();
    }

    @Override // l.AbstractC14558, l.InterfaceC13668, java.util.Map
    public final InterfaceC18559 entrySet() {
        return mo1097();
    }

    /* JADX INFO: renamed from: ܳ */
    public /* bridge */ /* synthetic */ InterfaceC18559 mo1097() {
        return mo1097();
    }
}
