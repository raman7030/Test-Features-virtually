package l;

/* JADX INFO: renamed from: l.᩶۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V57G */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20180 implements InterfaceC1985 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 26;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(26, interfaceC10410.mo2302());
        return iCompare != 0 ? iCompare : getValue().mo15571(((InterfaceC1985) interfaceC10410).getValue());
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC1985) {
            return getValue().equals(((InterfaceC1985) obj).getValue());
        }
        return false;
    }
}
