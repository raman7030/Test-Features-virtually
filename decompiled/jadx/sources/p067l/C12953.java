package p067l;

/* JADX INFO: renamed from: l.ۧܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5N8 */
/* JADX INFO: loaded from: classes4.dex */
public class C12953 implements InterfaceC18987, InterfaceC5556 {

    /* JADX INFO: renamed from: ᩸ */
    public final byte f36421;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 0;
    }

    public C12953(byte b) {
        this.f36421 = b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(0, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f36421, ((InterfaceC5556) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC5556) {
            return this.f36421 == ((InterfaceC5556) obj).getValue();
        }
        return false;
    }

    @Override // p067l.InterfaceC5556
    public final byte getValue() {
        return this.f36421;
    }

    public final int hashCode() {
        return this.f36421;
    }
}
