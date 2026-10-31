package l;

/* JADX INFO: renamed from: l.ۤܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10349 extends AbstractC11760 {
    @Override // l.AbstractC11760, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35100.compareTo(((AbstractC11760) obj).f35100);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10349(String str) {
        if (str.length() != 0 && !str.endsWith("/")) {
            str = str.concat("/");
        }
        super(str);
    }

    @Override // l.AbstractC11760
    public final String toString() {
        return C9045.m23341(new StringBuilder("RelativeDirectory["), this.f35100, "]");
    }
}
