package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41PX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6208 extends AbstractC21731 implements Cloneable, InterfaceC11606, InterfaceC8886 {
    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 1);
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
        if (set instanceof InterfaceC11606) {
            return mo21524((InterfaceC11606) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC6667 it = iterator();
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
        return super.mo3585(i);
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    @Deprecated
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3585(int i) {
        return remove(i);
    }
}
