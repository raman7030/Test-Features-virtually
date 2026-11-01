package p067l;

/* JADX INFO: renamed from: l.ۤܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12204 extends AbstractC13545 {
    @Override // p067l.AbstractC13545, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38099.compareTo(((AbstractC13545) obj).f38099);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12204(String str) {
        if (str.length() != 0 && !str.endsWith("/")) {
            str = str.concat("/");
        }
        super(str);
    }

    @Override // p067l.AbstractC13545
    public final String toString() {
        return C10965.m25286(new StringBuilder("RelativeDirectory["), this.f38099, "]");
    }
}
