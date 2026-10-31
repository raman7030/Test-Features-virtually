package l;

/* JADX INFO: renamed from: l.֡᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0632 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2425;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14397 f2426;

    public C0632(C5572 c5572, AbstractC5144 abstractC5144) {
        this.f2425 = abstractC5144.f16085;
        this.f2426 = c5572.f17263.m7266();
    }

    public final int hashCode() {
        return this.f2425 << (this.f2426.hashCode() + 16);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0632)) {
            return false;
        }
        C0632 c0632 = (C0632) obj;
        return this.f2425 == c0632.f2425 && this.f2426 == c0632.f2426;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C14397 c14397 = this.f2426;
        sb.append(c14397.m34390().getName());
        sb.append(" @ ");
        sb.append(c14397.m34392(this.f2425));
        return sb.toString();
    }
}
