package p067l;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes.dex */
public class C23531 extends AbstractC21995 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public transient Set f74965;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractMap f74966;

    /* JADX WARN: Multi-variable type inference failed */
    public C23531(NavigableMap navigableMap) {
        this.f74966 = (AbstractMap) navigableMap;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo6048(Integer num) {
        return mo6045(num) != null;
    }

    public /* synthetic */ C23531(NavigableMap navigableMap, int i) {
        this(navigableMap);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23531 m52316() {
        return new C23531(new TreeMap());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // p067l.InterfaceC3928
    /* JADX INFO: renamed from: ֫ */
    public final Set mo7746() {
        Set set = this.f74965;
        if (set != null) {
            return set;
        }
        C20179 c20179 = new C20179(this.f74966.values());
        this.f74965 = c20179;
        return c20179;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // p067l.InterfaceC3928
    /* JADX INFO: renamed from: ֫ */
    public C15444 mo6045(Integer num) {
        Map.Entry entryFloorEntry = this.f74966.floorEntry(new C4520(num));
        if (entryFloorEntry == null || !((C15444) entryFloorEntry.getValue()).m35188(num)) {
            return null;
        }
        return (C15444) entryFloorEntry.getValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC3928 mo6047(C15444 c15444) {
        return c15444.equals(C15444.m35185()) ? this : new C3414(this, c15444);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.Map, java.util.NavigableMap] */
    /* JADX INFO: renamed from: ֫ */
    public void mo6046(C15444 c15444) {
        c15444.getClass();
        if (c15444.m35187()) {
            return;
        }
        AbstractC5861 abstractC5861 = c15444.f44130;
        AbstractC5861 abstractC5862 = c15444.f44131;
        ?? r1 = this.f74966;
        Map.Entry entryLowerEntry = r1.lowerEntry(abstractC5861);
        if (entryLowerEntry != null) {
            C15444 c15445 = (C15444) entryLowerEntry.getValue();
            AbstractC5861 abstractC5863 = c15445.f44131;
            if (abstractC5863.compareTo(abstractC5861) >= 0) {
                if (abstractC5863.compareTo(abstractC5862) >= 0) {
                    abstractC5862 = abstractC5863;
                }
                abstractC5861 = c15445.f44130;
            }
        }
        Map.Entry entryFloorEntry = r1.floorEntry(abstractC5862);
        if (entryFloorEntry != null) {
            C15444 c15446 = (C15444) entryFloorEntry.getValue();
            if (c15446.f44131.compareTo(abstractC5862) >= 0) {
                abstractC5862 = c15446.f44131;
            }
        }
        r1.subMap(abstractC5861, abstractC5862).clear();
        C15444 c15444M35179 = C15444.m35179(abstractC5861, abstractC5862);
        boolean zM35187 = c15444M35179.m35187();
        AbstractC5861 abstractC5864 = c15444M35179.f44130;
        if (zM35187) {
            r1.remove(abstractC5864);
        } else {
            r1.put(abstractC5864, c15444M35179);
        }
    }
}
