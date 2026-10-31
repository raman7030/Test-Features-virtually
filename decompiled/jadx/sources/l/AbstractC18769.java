package l;

/* JADX INFO: renamed from: l.ᩴ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18769 extends AbstractC19475 implements InterfaceC5471 {
    @Override // l.InterfaceC5471
    public final int hashCode() {
        return mo3565().hashCode() + ((mo3568().hashCode() + ((getName().hashCode() + (mo3566().hashCode() * 31)) * 31)) * 31);
    }

    @Override // l.InterfaceC5471
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC5471)) {
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) obj;
            if (mo3566().equals(interfaceC5471.mo3566()) && getName().equals(interfaceC5471.getName()) && mo3568().equals(interfaceC5471.mo3568()) && C1321.m4613(mo3565(), interfaceC5471.mo3565())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C14354.m34249((InterfaceC5471) this, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC5471 interfaceC5471) {
        int iCompareTo = mo3566().compareTo(interfaceC5471.mo3566());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC5471.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = mo3568().compareTo(interfaceC5471.mo3568());
        return iCompareTo3 != 0 ? iCompareTo3 : C8377.m21971(AbstractC10232.m25863(), mo3565(), interfaceC5471.mo3565());
    }
}
