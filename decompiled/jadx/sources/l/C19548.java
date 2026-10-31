package l;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35QW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19548 implements InterfaceC18842, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f63207;

    public C19548(List list) {
        this.f63207 = list;
    }

    @Override // l.InterfaceC18842
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f63207;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC18842) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.f63207.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19548) {
            return this.f63207.equals(((C19548) obj).f63207);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f63207) {
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
