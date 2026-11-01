package p067l;

/* JADX INFO: renamed from: l.ۗ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D56J */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5453 implements InterfaceC18336 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 21;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(21, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().mo4623(((InterfaceC18336) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC18336) {
            return getValue().equals(((InterfaceC18336) obj).getValue());
        }
        return false;
    }
}
