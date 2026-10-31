package l;

/* JADX INFO: renamed from: l.ܽ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16965 implements InterfaceC16837 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f52049;

    public C16965(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f52049 = componentCallbacksC9205;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC16837
    /* JADX INFO: renamed from: ֫ */
    public final Object mo39613(AbstractC15440 abstractC15440) {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f52049;
        Object obj = componentCallbacksC9205.mHost;
        if (obj instanceof InterfaceC0567) {
            return ((InterfaceC0567) obj).mo2322();
        }
        return componentCallbacksC9205.requireActivity().mo2322();
    }
}
