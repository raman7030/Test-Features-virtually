package p067l;

/* JADX INFO: renamed from: l.ۖ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 069J */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4783 extends AbstractC20877 implements InterfaceC20980 {
    @Override // p067l.InterfaceC20980
    public final int hashCode() {
        return mo5179().hashCode() + (mo5178() * 31);
    }

    @Override // p067l.InterfaceC20980
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC20980)) {
            return false;
        }
        InterfaceC20980 interfaceC20980 = (InterfaceC20980) obj;
        return mo5178() == interfaceC20980.mo5178() && mo5179().equals(interfaceC20980.mo5179());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC20980 interfaceC20980) {
        int iCompare = Integer.compare(mo5178(), interfaceC20980.mo5178());
        if (iCompare != 0) {
            return iCompare;
        }
        InterfaceC10250 interfaceC10250Mo5179 = mo5179();
        if (interfaceC10250Mo5179 instanceof InterfaceC20309) {
            if (interfaceC20980.mo5179() instanceof InterfaceC20309) {
                return ((InterfaceC20309) interfaceC10250Mo5179).compareTo((InterfaceC20309) interfaceC20980.mo5179());
            }
            return -1;
        }
        if (interfaceC20980.mo5179() instanceof InterfaceC7568) {
            return ((InterfaceC7568) interfaceC10250Mo5179).compareTo((InterfaceC7568) interfaceC20980.mo5179());
        }
        return 1;
    }
}
