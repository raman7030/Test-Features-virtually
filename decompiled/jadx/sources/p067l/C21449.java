package p067l;

/* JADX INFO: renamed from: l.᩶ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21449 implements InterfaceC23810, InterfaceC15905 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6696 f67653;

    public C21449(C6696 c6696) {
        this.f67653 = c6696;
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ֫ */
    public final void mo7909(long j, long j2, long j3, long j4) {
        C6696 c6696 = this.f67653;
        c6696.f17359.m50038(j);
        c6696.f17353.mo5837(c6696.f17359);
        c6696.f17353.mo5839(j4);
        c6696.f17353.setProgress(c6696.f17359.m50042());
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        C6696 c6696 = this.f67653;
        return c6696.f17353.mo3924() || c6696.f17362.get() != null;
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ܺ֫ */
    public final C6455 mo7910() {
        return this.f67653.f17355;
    }

    @Override // p067l.InterfaceC7717
    /* JADX INFO: renamed from: ᩷֫ */
    public final void mo4048() {
        C6696 c6696 = this.f67653;
        String str = (String) c6696.f17368.get();
        if (str != null) {
            c6696.f17353.setName(str);
        }
    }

    @Override // p067l.InterfaceC15905
    public final void cancel() {
        this.f67653.f17353.mo5836();
    }
}
