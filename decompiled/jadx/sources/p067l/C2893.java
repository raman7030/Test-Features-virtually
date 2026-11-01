package p067l;

/* JADX INFO: renamed from: l.֡ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51A */
/* JADX INFO: loaded from: classes3.dex */
public class C2893 implements InterfaceC18987, InterfaceC19678 {

    /* JADX INFO: renamed from: ᩸ */
    public final short f5000;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 2;
    }

    public C2893(short s) {
        this.f5000 = s;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(2, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Short.compare(this.f5000, ((InterfaceC19678) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC19678) {
            return this.f5000 == ((InterfaceC19678) obj).getValue();
        }
        return false;
    }

    @Override // p067l.InterfaceC19678
    public final short getValue() {
        return this.f5000;
    }

    public final int hashCode() {
        return this.f5000;
    }
}
