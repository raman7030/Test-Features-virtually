package p067l;

/* JADX INFO: renamed from: l.۫۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14170 implements InterfaceC19007 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 23;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(23, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC19007) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC19007) {
            return getValue().equals(((InterfaceC19007) obj).getValue());
        }
        return false;
    }
}
