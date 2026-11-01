package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4571 extends C22676 {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m50761((Comparable) obj, obj2);
    }

    @Override // p067l.C22676
    /* JADX INFO: renamed from: ᩻ */
    public final void mo9645() {
        if (!m50766()) {
            for (int i = 0; i < m50763(); i++) {
                Map.Entry entryM50764 = m50764(i);
                if (((InterfaceC19954) entryM50764.getKey()).mo3530()) {
                    entryM50764.setValue(C21562.unmodifiableList((List) entryM50764.getValue()));
                }
            }
            for (Map.Entry entry : m50765()) {
                if (((InterfaceC19954) entry.getKey()).mo3530()) {
                    entry.setValue(C21562.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo9645();
    }
}
