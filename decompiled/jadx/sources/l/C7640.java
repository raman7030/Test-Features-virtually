package l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97S */
/* JADX INFO: loaded from: classes4.dex */
public final class C7640 extends AbstractC16812 implements InterfaceC13989, Serializable, Cloneable, InterfaceC8886 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C1975.f6628;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C1975.f6628;
    }
}
