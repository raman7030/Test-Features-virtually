package p067l;

/* JADX INFO: renamed from: l.ܶ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 75KT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16851 implements InterfaceC6897 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 31;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(31, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : Boolean.compare(getValue(), ((InterfaceC6897) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue() ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC6897) && getValue() == ((InterfaceC6897) obj).getValue();
    }
}
