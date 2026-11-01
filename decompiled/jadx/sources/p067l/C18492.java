package p067l;

/* JADX INFO: renamed from: l.ܽ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18492 implements InterfaceC1677 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ComponentCallbacksC11117 f55229;

    public C18492(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f55229 = componentCallbacksC11117;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC1677
    /* JADX INFO: renamed from: ֫ */
    public final Object mo41849(AbstractC17043 abstractC17043) {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f55229;
        Object obj = componentCallbacksC11117.mHost;
        if (obj instanceof InterfaceC0870) {
            return ((InterfaceC0870) obj).mo4693();
        }
        return componentCallbacksC11117.requireActivity().mo4693();
    }
}
