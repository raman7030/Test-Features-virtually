package p067l;

/* JADX INFO: renamed from: l.֡᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2969 {

    /* JADX INFO: renamed from: ֫ */
    public int f5197;

    /* JADX INFO: renamed from: ۧ */
    public C16051 f5198;

    public C2969(C7664 c7664, AbstractC7257 abstractC7257) {
        this.f5197 = abstractC7257.f18924;
        this.f5198 = c7664.f20103.m9345();
    }

    public final int hashCode() {
        return this.f5197 << (this.f5198.hashCode() + 16);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2969)) {
            return false;
        }
        C2969 c2969 = (C2969) obj;
        return this.f5197 == c2969.f5197 && this.f5198 == c2969.f5198;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C16051 c16051 = this.f5198;
        sb.append(c16051.m36524().getName());
        sb.append(" @ ");
        sb.append(c16051.m36526(this.f5197));
        return sb.toString();
    }
}
