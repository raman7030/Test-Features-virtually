package l;

/* JADX INFO: renamed from: l.ۨܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11760 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35100;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f35100.compareTo(((AbstractC11760) obj).f35100);
    }

    public AbstractC11760(String str) {
        this.f35100 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m28786(InterfaceC20758 interfaceC20758) {
        return interfaceC20758.resolve(this.f35100.replace("/", interfaceC20758.getFileSystem().getSeparator()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11760) && this.f35100.equals(((AbstractC11760) obj).f35100);
    }

    public final int hashCode() {
        return this.f35100.hashCode();
    }

    public String toString() {
        return C9045.m23341(new StringBuilder("RelPath["), this.f35100, "]");
    }
}
