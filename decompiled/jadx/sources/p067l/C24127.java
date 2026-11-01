package p067l;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6E */
/* JADX INFO: loaded from: classes2.dex */
public final class C24127 extends AbstractC10066 implements InterfaceC13399, Serializable, Cloneable, InterfaceC10814 {
    public static final long serialVersionUID = -7046029254386353129L;

    public final Object clone() {
        return C9375.f25556;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    private Object readResolve() {
        return C9375.f25556;
    }
}
