package p067l;

/* JADX INFO: renamed from: l.ܺܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S5 */
/* JADX INFO: loaded from: classes5.dex */
public class C17645 implements InterfaceC18987, InterfaceC9579 {

    /* JADX INFO: renamed from: ᩸ */
    public final long f52711;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 6;
    }

    public C17645(long j) {
        this.f52711 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(6, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Long.compare(this.f52711, ((InterfaceC9579) interfaceC12262).getValue());
    }

    public final int hashCode() {
        long j = this.f52711;
        return (((int) j) * 31) + ((int) (j >>> 32));
    }

    @Override // p067l.InterfaceC9579
    public final long getValue() {
        return this.f52711;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC9579) {
            return this.f52711 == ((InterfaceC9579) obj).getValue();
        }
        return false;
    }
}
