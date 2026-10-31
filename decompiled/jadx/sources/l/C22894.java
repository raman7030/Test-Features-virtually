package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6E */
/* JADX INFO: loaded from: classes2.dex */
public final class C22894 extends AbstractC8099 implements InterfaceC11606, Serializable, Cloneable, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C7372.f22644;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C7372.f22644;
    }
}
