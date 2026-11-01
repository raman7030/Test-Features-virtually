package p067l;

/* JADX INFO: renamed from: l.ܶ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17032 implements InterfaceC21867 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC21867[] f50367;

    public C17032(InterfaceC21867... interfaceC21867Arr) {
        this.f50367 = interfaceC21867Arr;
    }

    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6844(Class cls) {
        for (InterfaceC21867 interfaceC21867 : this.f50367) {
            if (interfaceC21867.mo6844(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8455 mo6843(Class cls) {
        for (InterfaceC21867 interfaceC21867 : this.f50367) {
            if (interfaceC21867.mo6844(cls)) {
                return interfaceC21867.mo6843(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
