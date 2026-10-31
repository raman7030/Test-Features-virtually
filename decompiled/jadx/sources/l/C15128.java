package l;

/* JADX INFO: renamed from: l.ܶۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15128 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18658 f46247;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f46248;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC1538 f46249;

    public /* synthetic */ C15128(int i) {
        this();
    }

    public C15128() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35834(int i, InterfaceC1538 interfaceC1538, C18658 c18658) {
        this.f46248 = i;
        this.f46249 = interfaceC1538;
        this.f46247 = c18658;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m35833() {
        return new C21480(this.f46248, this.f46249, this.f46247);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21480) {
            return ((C21480) obj).m48633(this.f46248, this.f46249, this.f46247);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f46248;
        InterfaceC1538 interfaceC1538 = this.f46249;
        C18658 c18658 = this.f46247;
        int i2 = C21480.f69111;
        return ((interfaceC1538.hashCode() + ((c18658 != null ? c18658.hashCode() : 0) * 31)) * 31) + i;
    }
}
