package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19223 extends AbstractC22709 implements InterfaceC18517, Serializable, Cloneable, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC11421
    @Deprecated
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13088(long j) {
        return false;
    }

    public final Object clone() {
        return C0171.f1389;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C0171.f1389;
    }
}
