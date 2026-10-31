package l;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes.dex */
public class C22267 extends AbstractC20651 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Set f72241;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractMap f72242;

    /* JADX WARN: Multi-variable type inference failed */
    public C22267(NavigableMap navigableMap) {
        this.f72242 = (AbstractMap) navigableMap;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo3775(Integer num) {
        return mo3772(num) != null;
    }

    public /* synthetic */ C22267(NavigableMap navigableMap, int i) {
        this(navigableMap);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22267 m49988() {
        return new C22267(new TreeMap());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // l.InterfaceC1641
    /* JADX INFO: renamed from: ֫ */
    public final Set mo5516() {
        Set set = this.f72241;
        if (set != null) {
            return set;
        }
        C18740 c18740 = new C18740(this.f72242.values());
        this.f72241 = c18740;
        return c18740;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // l.InterfaceC1641
    /* JADX INFO: renamed from: ֫ */
    public C13758 mo3772(Integer num) {
        Map.Entry entryFloorEntry = this.f72242.floorEntry(new C2264(num));
        if (entryFloorEntry == null || !((C13758) entryFloorEntry.getValue()).m33073(num)) {
            return null;
        }
        return (C13758) entryFloorEntry.getValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC1641 mo3774(C13758 c13758) {
        return c13758.equals(C13758.m33070()) ? this : new C1100(this, c13758);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.Map, java.util.NavigableMap] */
    /* JADX INFO: renamed from: ֫ */
    public void mo3773(C13758 c13758) {
        c13758.getClass();
        if (c13758.m33072()) {
            return;
        }
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC3676 = c13758.f41053;
        ?? r1 = this.f72242;
        Map.Entry entryLowerEntry = r1.lowerEntry(abstractC3675);
        if (entryLowerEntry != null) {
            C13758 c13759 = (C13758) entryLowerEntry.getValue();
            AbstractC3675 abstractC3677 = c13759.f41053;
            if (abstractC3677.compareTo(abstractC3675) >= 0) {
                if (abstractC3677.compareTo(abstractC3676) >= 0) {
                    abstractC3676 = abstractC3677;
                }
                abstractC3675 = c13759.f41052;
            }
        }
        Map.Entry entryFloorEntry = r1.floorEntry(abstractC3676);
        if (entryFloorEntry != null) {
            C13758 c137510 = (C13758) entryFloorEntry.getValue();
            if (c137510.f41053.compareTo(abstractC3676) >= 0) {
                abstractC3676 = c137510.f41053;
            }
        }
        r1.subMap(abstractC3675, abstractC3676).clear();
        C13758 c13758M33064 = C13758.m33064(abstractC3675, abstractC3676);
        boolean zM33072 = c13758M33064.m33072();
        AbstractC3675 abstractC3678 = c13758M33064.f41052;
        if (zM33072) {
            r1.remove(abstractC3678);
        } else {
            r1.put(abstractC3678, c13758M33064);
        }
    }
}
