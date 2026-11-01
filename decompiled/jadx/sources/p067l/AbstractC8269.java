package p067l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41PX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8269 extends AbstractC23022 implements Cloneable, InterfaceC13399, InterfaceC10814 {
    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 1);
    }

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
        if (set instanceof InterfaceC13399) {
            return mo23492((InterfaceC13399) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC8705 it = iterator();
        int iNextInt = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iNextInt;
            }
            iNextInt += it.nextInt();
            size = i;
        }
    }

    public boolean remove(int i) {
        return super.mo5872(i);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    @Deprecated
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5872(int i) {
        return remove(i);
    }
}
