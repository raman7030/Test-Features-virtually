package p067l;

/* JADX INFO: renamed from: l.ۙ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 14JS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6794 implements InterfaceC12973 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 22;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(22, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().mo10087(((InterfaceC12973) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC12973) {
            return getValue().equals(((InterfaceC12973) obj).getValue());
        }
        return false;
    }
}
