package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19265 extends AbstractC4302 implements InterfaceC18559, Serializable, Cloneable, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C5153.f16098;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C5153.f16098;
    }
}
