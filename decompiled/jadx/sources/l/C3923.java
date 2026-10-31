package l;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۘۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3923 implements InterfaceC7409 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TreeMap f12508 = new TreeMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3923 m11959() {
        return new C3923();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11962(C13758 c13758, String str) {
        boolean zM33072 = c13758.m33072();
        AbstractC3675 abstractC3675 = c13758.f41052;
        if (zM33072) {
            return;
        }
        str.getClass();
        boolean zM33073 = c13758.m33072();
        AbstractC3675 abstractC3676 = c13758.f41053;
        TreeMap treeMap = this.f12508;
        if (!zM33073) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(abstractC3675);
            if (entryLowerEntry != null) {
                C2512 c2512 = (C2512) entryLowerEntry.getValue();
                if (((C13758) c2512.getKey()).f41053.compareTo(abstractC3675) > 0) {
                    if (((C13758) c2512.getKey()).f41053.compareTo(abstractC3676) > 0) {
                        AbstractC3675 abstractC3677 = ((C13758) c2512.getKey()).f41053;
                        treeMap.put(abstractC3676, new C2512(C13758.m33064(abstractC3676, abstractC3677), ((C2512) entryLowerEntry.getValue()).getValue()));
                    }
                    AbstractC3675 abstractC3678 = ((C13758) c2512.getKey()).f41052;
                    treeMap.put(abstractC3678, new C2512(C13758.m33064(abstractC3678, abstractC3675), ((C2512) entryLowerEntry.getValue()).getValue()));
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(abstractC3676);
            if (entryLowerEntry2 != null) {
                C2512 c2513 = (C2512) entryLowerEntry2.getValue();
                if (((C13758) c2513.getKey()).f41053.compareTo(abstractC3676) > 0) {
                    AbstractC3675 abstractC3679 = ((C13758) c2513.getKey()).f41053;
                    treeMap.put(abstractC3676, new C2512(C13758.m33064(abstractC3676, abstractC3679), ((C2512) entryLowerEntry2.getValue()).getValue()));
                }
            }
            treeMap.subMap(abstractC3675, abstractC3676).clear();
        }
        treeMap.put(abstractC3675, new C2512(c13758, str));
    }

    @Override // l.InterfaceC7409
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map mo11961() {
        return new C15916(this, this.f12508.values());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m11963() {
        return new C15916(this, this.f12508.descendingMap().values());
    }

    @Override // l.InterfaceC7409
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11960(Integer num) {
        Map.Entry entryFloorEntry = this.f12508.floorEntry(new C2264(num));
        Map.Entry entry = (entryFloorEntry == null || !((C13758) ((C2512) entryFloorEntry.getValue()).getKey()).m33073(num)) ? null : (Map.Entry) entryFloorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC7409)) {
            return false;
        }
        return ((AbstractMap) mo11961()).equals(((InterfaceC7409) obj).mo11961());
    }

    public final int hashCode() {
        return ((AbstractMap) mo11961()).hashCode();
    }

    public final String toString() {
        return this.f12508.values().toString();
    }
}
