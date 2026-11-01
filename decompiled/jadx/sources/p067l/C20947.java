package p067l;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35QW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20947 implements InterfaceC20276, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final List f65827;

    public C20947(List list) {
        this.f65827 = list;
    }

    @Override // p067l.InterfaceC20276
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f65827;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC20276) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f65827.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20947) {
            return this.f65827.equals(((C20947) obj).f65827);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f65827) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
