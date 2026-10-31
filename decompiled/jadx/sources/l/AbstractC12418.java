package l;

/* JADX INFO: renamed from: l.۫۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12418 implements InterfaceC17507 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 23;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(23, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC17507) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC17507) {
            return getValue().equals(((InterfaceC17507) obj).getValue());
        }
        return false;
    }
}
