package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11466 extends C24048 implements Set, InterfaceC10814 {
    public static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f76380b) {
            zEquals = this.f76379a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f76380b) {
            iHashCode = this.f76379a.hashCode();
        }
        return iHashCode;
    }
}
