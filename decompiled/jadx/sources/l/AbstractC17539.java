package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܿᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71M8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17539 extends AbstractC11462 implements Cloneable, InterfaceC18559, InterfaceC8886 {
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
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC12063 it = iterator();
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            Object next = it.next();
            iHashCode += next == null ? 0 : next.hashCode();
            size = i;
        }
    }
}
