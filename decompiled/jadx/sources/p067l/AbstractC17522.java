package p067l;

/* JADX INFO: renamed from: l.ܺ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 862H */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17522 extends AbstractC20877 implements InterfaceC20309 {
    @Override // p067l.InterfaceC20309
    public final int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (mo10231().hashCode() * 31)) * 31);
    }

    @Override // p067l.InterfaceC20309
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC20309)) {
            return false;
        }
        InterfaceC20309 interfaceC20309 = (InterfaceC20309) obj;
        return mo10231().equals(interfaceC20309.mo10231()) && getName().equals(interfaceC20309.getName()) && getType().equals(interfaceC20309.getType());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC20309 interfaceC20309) {
        int iCompareTo = mo10231().compareTo(interfaceC20309.mo10231());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC20309.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(interfaceC20309.getType());
    }

    public final String toString() {
        return C16010.m36384((InterfaceC20309) this, false);
    }
}
