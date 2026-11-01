package p067l;

/* JADX INFO: renamed from: l.֨۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5Q5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3441 implements InterfaceC23661 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 29;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(29, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
        int iCompareTo = getType().compareTo(interfaceC23661.getType());
        return iCompareTo != 0 ? iCompareTo : C10330.m23943(getElements(), interfaceC23661.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + (getType().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC23661) {
            InterfaceC23661 interfaceC23661 = (InterfaceC23661) obj;
            if (getType().equals(interfaceC23661.getType()) && getElements().equals(interfaceC23661.getElements())) {
                return true;
            }
        }
        return false;
    }
}
