package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۟ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9646 {

    /* JADX INFO: renamed from: ֫ */
    public final List f26557;

    public C9646(List list) {
        this.f26557 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9646.class != obj.getClass()) {
            return false;
        }
        return this.f26557.equals(((C9646) obj).f26557);
    }

    public final int hashCode() {
        return this.f26557.hashCode();
    }
}
