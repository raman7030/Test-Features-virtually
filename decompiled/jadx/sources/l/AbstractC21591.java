package l;

/* JADX INFO: renamed from: l.᩸۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5K1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21591 implements InterfaceC6176 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 27;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(27, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC6176) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC6176) {
            return getValue().equals(((InterfaceC6176) obj).getValue());
        }
        return false;
    }
}
