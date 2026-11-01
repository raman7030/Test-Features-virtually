package p067l;

/* JADX INFO: renamed from: l.۠֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99EG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9837 implements InterfaceC7487 {

    /* JADX INFO: renamed from: ֫ */
    public C2460 f27275;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC7155 f27276;

    public AbstractC9837(InterfaceC7155 interfaceC7155, byte[] bArr) {
        this(interfaceC7155, new C2460(bArr));
    }

    public AbstractC9837(InterfaceC7155 interfaceC7155, C2460 c2460) {
        this.f27276 = interfaceC7155;
        this.f27275 = c2460;
        interfaceC7155.mo16457(c2460);
    }

    public AbstractC9837(InterfaceC7155 interfaceC7155) {
        this.f27276 = interfaceC7155;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7155 m23026() {
        return this.f27276;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2460 m23025() {
        return this.f27275;
    }
}
