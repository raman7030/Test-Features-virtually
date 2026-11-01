package p067l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۨܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBSP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13594 extends AbstractC23652 implements Cloneable, InterfaceC19967, InterfaceC10814 {
    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo30922(long j);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != size()) {
            return false;
        }
        if (set instanceof InterfaceC19967) {
            return mo52599((InterfaceC19967) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int size = size();
        InterfaceC24660 it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = it.nextLong();
            i += (int) (jNextLong ^ (jNextLong >>> 32));
            size = i2;
        }
    }

    @Override // p067l.InterfaceC13223
    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14952(long j) {
        return mo30922(j);
    }
}
