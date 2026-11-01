package p067l;

/* JADX INFO: renamed from: l.֫᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4428 implements InterfaceC23810 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C6455 f9941;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13146 f9942;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC3343 f9943;

    public C4428(C13146 c13146, InterfaceC3343 interfaceC3343, C6455 c6455) {
        this.f9942 = c13146;
        this.f9943 = interfaceC3343;
        this.f9941 = c6455;
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ֫ */
    public final void mo7909(long j, long j2, long j3, long j4) {
        C13146 c13146 = this.f9942;
        c13146.f36923.m50038(j);
        C16861 c16861 = c13146.f36923;
        InterfaceC3343 interfaceC3343 = this.f9943;
        interfaceC3343.mo5837(c16861);
        interfaceC3343.mo5839(j4);
        interfaceC3343.setProgress(c13146.f36923.m50042());
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f9942.f36920.mo3924();
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ܺ֫ */
    public final C6455 mo7910() {
        return this.f9941;
    }

    @Override // p067l.InterfaceC7717
    /* JADX INFO: renamed from: ᩷֫ */
    public final void mo4048() {
        String str = (String) this.f9942.f36917.get();
        if (str != null) {
            this.f9943.setName(str);
        }
    }
}
