package l;

/* JADX INFO: renamed from: l.ᩳܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55CR */
/* JADX INFO: loaded from: classes5.dex */
public class C18192 implements InterfaceC17486, InterfaceC12526 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final double f56568;

    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 17;
    }

    public C18192(double d) {
        this.f56568 = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(17, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(this.f56568, ((InterfaceC12526) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC12526) && Double.doubleToRawLongBits(this.f56568) == Double.doubleToRawLongBits(((InterfaceC12526) obj).getValue());
    }

    @Override // l.InterfaceC12526
    public final double getValue() {
        return this.f56568;
    }

    public final int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.f56568);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }
}
