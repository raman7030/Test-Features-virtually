package p067l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAN */
/* JADX INFO: loaded from: classes2.dex */
public final class C24186 extends AbstractC13203 implements InterfaceC13458, Serializable, Cloneable, InterfaceC10814 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C9434.f25764;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C9434.f25764;
    }
}
