package l;

/* JADX INFO: renamed from: l.ۤ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G66I */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10302 implements InterfaceC14684 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 24;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(24, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC14684) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC14684) {
            return getValue().equals(((InterfaceC14684) obj).getValue());
        }
        return false;
    }
}
