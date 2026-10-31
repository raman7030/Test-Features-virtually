package l;

/* JADX INFO: renamed from: l.֨۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5Q5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1129 implements InterfaceC22404 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 29;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(29, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
        int iCompareTo = getType().compareTo(interfaceC22404.getType());
        return iCompareTo != 0 ? iCompareTo : C8377.m21972(getElements(), interfaceC22404.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + (getType().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC22404) {
            InterfaceC22404 interfaceC22404 = (InterfaceC22404) obj;
            if (getType().equals(interfaceC22404.getType()) && getElements().equals(interfaceC22404.getElements())) {
                return true;
            }
        }
        return false;
    }
}
