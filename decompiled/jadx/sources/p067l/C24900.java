package p067l;

/* JADX INFO: renamed from: l.᩻۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes.dex */
public final class C24900 implements InterfaceC6125 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16852 f79523;

    public final String toString() {
        return "CheckContext: basicHandler";
    }

    public C24900(C16852 c16852) {
        this.f79523 = c16852;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final void mo3480(InterfaceC5323 interfaceC5323, C18258 c18258) {
        C23623 c23623 = this.f79523.f49881;
        C14040 c14040 = C8300.f21997;
        c23623.m9352(interfaceC5323, new C14040("compiler", "prob.found.req", c18258));
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        return this.f79523.f49912.m19471(abstractC6462, abstractC6463, c3686);
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final C2733 mo6098() {
        return this.f79523.f49906.f23805;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ۧ */
    public final C8788 mo6101() {
        return this.f79523.f49913.f40370;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final C3686 mo6099(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return new C20878(this.f79523, interfaceC5323, "unchecked.assign", abstractC6462, abstractC6463);
    }
}
