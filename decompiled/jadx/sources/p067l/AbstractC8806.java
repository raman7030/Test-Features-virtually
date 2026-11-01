package p067l;

/* JADX INFO: renamed from: l.ۜ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K593 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8806 implements InterfaceC4474 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC4474 interfaceC4474 = (InterfaceC4474) obj;
        String strMo9476 = mo9476();
        if (strMo9476 == null) {
            if (interfaceC4474.mo9476() != null) {
                return 1;
            }
        } else {
            if (interfaceC4474.mo9476() == null) {
                return -1;
            }
            int iCompareTo = strMo9476.compareTo(interfaceC4474.mo9476());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(mo9474(), interfaceC4474.mo9474());
    }

    @Override // p067l.InterfaceC4474
    /* JADX INFO: renamed from: ۫ۧ */
    public InterfaceC22991 mo9475() {
        String strMo9476 = mo9476();
        if (strMo9476 == null) {
            return null;
        }
        return new C24899(strMo9476);
    }

    public final int hashCode() {
        String strMo9476 = mo9476();
        return mo9474() + ((strMo9476 == null ? 0 : strMo9476.hashCode()) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC4474) {
            InterfaceC4474 interfaceC4474 = (InterfaceC4474) obj;
            if (C12826.equals(mo9476(), interfaceC4474.mo9476()) && mo9474() == interfaceC4474.mo9474()) {
                return true;
            }
        }
        return false;
    }
}
