package l;

/* JADX INFO: renamed from: l.ۢܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5UB */
/* JADX INFO: loaded from: classes4.dex */
public class C9726 implements InterfaceC17486, InterfaceC23109 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f29475;

    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 16;
    }

    public C9726(float f) {
        this.f29475 = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(16, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        return Float.compare(this.f29475, ((InterfaceC23109) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof InterfaceC23109) && Float.floatToRawIntBits(this.f29475) == Float.floatToRawIntBits(((InterfaceC23109) obj).getValue());
    }

    @Override // l.InterfaceC23109
    public final float getValue() {
        return this.f29475;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f29475);
    }
}
