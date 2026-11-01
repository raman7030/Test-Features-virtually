package p067l;

/* JADX INFO: renamed from: l.ۨܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13545 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final String f38099;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f38099.compareTo(((AbstractC13545) obj).f38099);
    }

    public AbstractC13545(String str) {
        this.f38099 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 m30833(InterfaceC22097 interfaceC22097) {
        return interfaceC22097.resolve(this.f38099.replace("/", interfaceC22097.getFileSystem().getSeparator()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC13545) && this.f38099.equals(((AbstractC13545) obj).f38099);
    }

    public final int hashCode() {
        return this.f38099.hashCode();
    }

    public String toString() {
        return C10965.m25286(new StringBuilder("RelPath["), this.f38099, "]");
    }
}
