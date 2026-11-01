package p067l;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۘۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6097 implements InterfaceC9410 {

    /* JADX INFO: renamed from: ᩸ */
    public final TreeMap f15316 = new TreeMap();

    /* JADX INFO: renamed from: ܽ */
    public static C6097 m13879() {
        return new C6097();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13882(C15444 c15444, String str) {
        boolean zM35187 = c15444.m35187();
        AbstractC5861 abstractC5861 = c15444.f44130;
        if (zM35187) {
            return;
        }
        str.getClass();
        boolean zM35188 = c15444.m35187();
        AbstractC5861 abstractC5862 = c15444.f44131;
        TreeMap treeMap = this.f15316;
        if (!zM35188) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(abstractC5861);
            if (entryLowerEntry != null) {
                C4756 c4756 = (C4756) entryLowerEntry.getValue();
                if (((C15444) c4756.getKey()).f44131.compareTo(abstractC5861) > 0) {
                    if (((C15444) c4756.getKey()).f44131.compareTo(abstractC5862) > 0) {
                        AbstractC5861 abstractC5863 = ((C15444) c4756.getKey()).f44131;
                        treeMap.put(abstractC5862, new C4756(C15444.m35179(abstractC5862, abstractC5863), ((C4756) entryLowerEntry.getValue()).getValue()));
                    }
                    AbstractC5861 abstractC5864 = ((C15444) c4756.getKey()).f44130;
                    treeMap.put(abstractC5864, new C4756(C15444.m35179(abstractC5864, abstractC5861), ((C4756) entryLowerEntry.getValue()).getValue()));
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(abstractC5862);
            if (entryLowerEntry2 != null) {
                C4756 c4757 = (C4756) entryLowerEntry2.getValue();
                if (((C15444) c4757.getKey()).f44131.compareTo(abstractC5862) > 0) {
                    AbstractC5861 abstractC5865 = ((C15444) c4757.getKey()).f44131;
                    treeMap.put(abstractC5862, new C4756(C15444.m35179(abstractC5862, abstractC5865), ((C4756) entryLowerEntry2.getValue()).getValue()));
                }
            }
            treeMap.subMap(abstractC5861, abstractC5862).clear();
        }
        treeMap.put(abstractC5861, new C4756(c15444, str));
    }

    @Override // p067l.InterfaceC9410
    /* JADX INFO: renamed from: ֫ */
    public final Map mo13881() {
        return new C17495(this, this.f15316.values());
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map m13883() {
        return new C17495(this, this.f15316.descendingMap().values());
    }

    @Override // p067l.InterfaceC9410
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13880(Integer num) {
        Map.Entry entryFloorEntry = this.f15316.floorEntry(new C4520(num));
        Map.Entry entry = (entryFloorEntry == null || !((C15444) ((C4756) entryFloorEntry.getValue()).getKey()).m35188(num)) ? null : (Map.Entry) entryFloorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC9410)) {
            return false;
        }
        return ((AbstractMap) mo13881()).equals(((InterfaceC9410) obj).mo13881());
    }

    public final int hashCode() {
        return ((AbstractMap) mo13881()).hashCode();
    }

    public final String toString() {
        return this.f15316.values().toString();
    }
}
