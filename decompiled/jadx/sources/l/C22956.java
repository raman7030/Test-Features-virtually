package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAN */
/* JADX INFO: loaded from: classes2.dex */
public final class C22956 extends AbstractC11400 implements InterfaceC11668, Serializable, Cloneable, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C7434.f22851;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C7434.f22851;
    }
}
