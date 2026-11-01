package p067l;

/* JADX INFO: renamed from: l.᩶۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V57G */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21547 implements InterfaceC4255 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 26;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(26, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().mo17482(((InterfaceC4255) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC4255) {
            return getValue().equals(((InterfaceC4255) obj).getValue());
        }
        return false;
    }
}
