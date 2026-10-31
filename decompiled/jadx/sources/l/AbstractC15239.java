package l;

/* JADX INFO: renamed from: l.ܶ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 75KT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15239 implements InterfaceC4765 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 31;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(31, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : Boolean.compare(getValue(), ((InterfaceC4765) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue() ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC4765) && getValue() == ((InterfaceC4765) obj).getValue();
    }
}
