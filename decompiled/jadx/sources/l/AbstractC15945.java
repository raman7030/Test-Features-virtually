package l;

/* JADX INFO: renamed from: l.ܺ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 862H */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15945 extends AbstractC19475 implements InterfaceC18877 {
    @Override // l.InterfaceC18877
    public final int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (mo8192().hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC18877
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC18877)) {
            return false;
        }
        InterfaceC18877 interfaceC18877 = (InterfaceC18877) obj;
        return mo8192().equals(interfaceC18877.mo8192()) && getName().equals(interfaceC18877.getName()) && getType().equals(interfaceC18877.getType());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC18877 interfaceC18877) {
        int iCompareTo = mo8192().compareTo(interfaceC18877.mo8192());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC18877.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(interfaceC18877.getType());
    }

    public final String toString() {
        return C14354.m34251((InterfaceC18877) this, false);
    }
}
