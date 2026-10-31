package l;

/* JADX INFO: renamed from: l.۠֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99EG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7859 implements InterfaceC5386 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0097 f24359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5037 f24360;

    public AbstractC7859(InterfaceC5037 interfaceC5037, byte[] bArr) {
        this(interfaceC5037, new C0097(bArr));
    }

    public AbstractC7859(InterfaceC5037 interfaceC5037, C0097 c0097) {
        this.f24360 = interfaceC5037;
        this.f24359 = c0097;
        interfaceC5037.mo14553(c0097);
    }

    public AbstractC7859(InterfaceC5037 interfaceC5037) {
        this.f24360 = interfaceC5037;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5037 m21061() {
        return this.f24360;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0097 m21060() {
        return this.f24359;
    }
}
