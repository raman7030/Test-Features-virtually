package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9572 extends C22811 implements Set, InterfaceC8886 {
    public static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.a.hashCode();
        }
        return iHashCode;
    }
}
