package p067l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֡ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1DS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2793 extends AbstractC22241 implements Cloneable, InterfaceC13458, InterfaceC10814 {
    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
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
        if (set instanceof InterfaceC13458) {
            return mo30206((InterfaceC13458) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC17480 it = iterator();
        int iMo9752 = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo9752;
            }
            iMo9752 += it.mo9752();
            size = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo4381(char c) {
        return super.mo4382(c);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    @Deprecated
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4382(char c) {
        return mo4381(c);
    }
}
