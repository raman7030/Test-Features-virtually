package l;

/* JADX INFO: renamed from: l.ܺܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5S5 */
/* JADX INFO: loaded from: classes5.dex */
public class C16074 implements InterfaceC17486, InterfaceC7587 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f49548;

    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 6;
    }

    public C16074(long j) {
        this.f49548 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(6, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        return Long.compare(this.f49548, ((InterfaceC7587) interfaceC10410).getValue());
    }

    public final int hashCode() {
        long j = this.f49548;
        return (((int) j) * 31) + ((int) (j >>> 32));
    }

    @Override // l.InterfaceC7587
    public final long getValue() {
        return this.f49548;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC7587) {
            return this.f49548 == ((InterfaceC7587) obj).getValue();
        }
        return false;
    }
}
