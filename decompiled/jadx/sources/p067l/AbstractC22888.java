package p067l;

/* JADX INFO: renamed from: l.᩸۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5K1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22888 implements InterfaceC8238 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 27;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(27, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC8238) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC8238) {
            return getValue().equals(((InterfaceC8238) obj).getValue());
        }
        return false;
    }
}
