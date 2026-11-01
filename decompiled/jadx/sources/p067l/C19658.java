package p067l;

/* JADX INFO: renamed from: l.ᩳܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55CR */
/* JADX INFO: loaded from: classes5.dex */
public class C19658 implements InterfaceC18987, InterfaceC14273 {

    /* JADX INFO: renamed from: ᩸ */
    public final double f59781;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 17;
    }

    public C19658(double d) {
        this.f59781 = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(17, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Double.compare(this.f59781, ((InterfaceC14273) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC14273) && Double.doubleToRawLongBits(this.f59781) == Double.doubleToRawLongBits(((InterfaceC14273) obj).getValue());
    }

    @Override // p067l.InterfaceC14273
    public final double getValue() {
        return this.f59781;
    }

    public final int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.f59781);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }
}
