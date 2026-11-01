package p067l;

/* JADX INFO: renamed from: l.ۡܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5YB */
/* JADX INFO: loaded from: classes4.dex */
public class C10941 implements InterfaceC18987, InterfaceC15613 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f30319;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 4;
    }

    public C10941(int i) {
        this.f30319 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(4, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f30319, ((InterfaceC15613) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC15613) {
            return this.f30319 == ((InterfaceC15613) obj).getValue();
        }
        return false;
    }

    @Override // p067l.InterfaceC15613
    public final int getValue() {
        return this.f30319;
    }

    public final int hashCode() {
        return this.f30319;
    }
}
