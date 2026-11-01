package p067l;

/* JADX INFO: renamed from: l.ܶۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16746 {

    /* JADX INFO: renamed from: ֫ */
    public C20101 f49367;

    /* JADX INFO: renamed from: ۧ */
    public int f49368;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC3830 f49369;

    public /* synthetic */ C16746(int i) {
        this();
    }

    public C16746() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37992(int i, InterfaceC3830 interfaceC3830, C20101 c20101) {
        this.f49368 = i;
        this.f49369 = interfaceC3830;
        this.f49367 = c20101;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m37991() {
        return new C22783(this.f49368, this.f49369, this.f49367);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22783) {
            return ((C22783) obj).m50970(this.f49368, this.f49369, this.f49367);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f49368;
        InterfaceC3830 interfaceC3830 = this.f49369;
        C20101 c20101 = this.f49367;
        int i2 = C22783.f71809;
        return ((interfaceC3830.hashCode() + ((c20101 != null ? c20101.hashCode() : 0) * 31)) * 31) + i;
    }
}
