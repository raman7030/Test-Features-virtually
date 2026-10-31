package l;

/* JADX INFO: renamed from: l.֡ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51A */
/* JADX INFO: loaded from: classes3.dex */
public class C0552 implements InterfaceC17486, InterfaceC18213 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short f2226;

    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo2302() {
        return 2;
    }

    public C0552(short s) {
        this.f2226 = s;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(2, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        return Short.compare(this.f2226, ((InterfaceC18213) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC18213) {
            return this.f2226 == ((InterfaceC18213) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC18213
    public final short getValue() {
        return this.f2226;
    }

    public final int hashCode() {
        return this.f2226;
    }
}
