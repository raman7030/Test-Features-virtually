package l;

import java.util.List;

/* JADX INFO: renamed from: l.۟ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C7657 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f23643;

    public C7657(List list) {
        this.f23643 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7657.class != obj.getClass()) {
            return false;
        }
        return this.f23643.equals(((C7657) obj).f23643);
    }

    public final int hashCode() {
        return this.f23643.hashCode();
    }
}
