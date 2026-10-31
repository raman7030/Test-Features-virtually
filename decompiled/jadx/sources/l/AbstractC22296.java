package l;

/* JADX INFO: renamed from: l.᩹۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22296 implements InterfaceC11821 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 25;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(25, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : getValue().compareTo(((InterfaceC11821) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC11821) {
            return getValue().equals(((InterfaceC11821) obj).getValue());
        }
        return false;
    }
}
