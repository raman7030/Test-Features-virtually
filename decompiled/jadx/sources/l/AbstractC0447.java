package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.֡ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1DS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0447 extends AbstractC20910 implements Cloneable, InterfaceC11668, InterfaceC8886 {
    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
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
        if (set instanceof InterfaceC11668) {
            return mo28162((InterfaceC11668) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int size = size();
        InterfaceC15900 it = iterator();
        int iMo7691 = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo7691;
            }
            iMo7691 += it.mo7691();
            size = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo2004(char c) {
        return super.mo2005(c);
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    @Deprecated
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo2005(char c) {
        return mo2004(c);
    }
}
