package p067l;

/* JADX INFO: renamed from: l.᩹۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23558 implements InterfaceC13603 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 25;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(25, interfaceC12262.mo4670());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC13603) interfaceC12262).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13603) {
            return getValue().equals(((InterfaceC13603) obj).getValue());
        }
        return false;
    }
}
