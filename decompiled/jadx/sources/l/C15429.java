package l;

/* JADX INFO: renamed from: l.ܶ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15429 implements InterfaceC20517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20517[] f47238;

    public C15429(InterfaceC20517... interfaceC20517Arr) {
        this.f47238 = interfaceC20517Arr;
    }

    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4612(Class cls) {
        for (InterfaceC20517 interfaceC20517 : this.f47238) {
            if (interfaceC20517.mo4612(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6405 mo4611(Class cls) {
        for (InterfaceC20517 interfaceC20517 : this.f47238) {
            if (interfaceC20517.mo4612(cls)) {
                return interfaceC20517.mo4611(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
