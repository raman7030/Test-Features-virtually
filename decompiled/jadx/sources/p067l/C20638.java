package p067l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20638 extends AbstractC23951 implements InterfaceC19967, Serializable, Cloneable, InterfaceC10814 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.InterfaceC13223
    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14952(long j) {
        return false;
    }

    public final Object clone() {
        return C2531.f4163;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C2531.f4163;
    }
}
