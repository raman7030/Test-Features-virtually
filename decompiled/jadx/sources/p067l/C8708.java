package p067l;

/* JADX INFO: renamed from: l.ۜۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8708 implements InterfaceC23810 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22120 f23599;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22209 f23600;

    @Override // p067l.InterfaceC7717
    /* JADX INFO: renamed from: ᩷֫ */
    public final /* synthetic */ void mo4048() {
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        C22120 c22120 = this.f23599;
        return c22120.f69987.m8358() || c22120.f69985.mo21805() == EnumC15415.DESTROYED;
    }

    public C8708(C22120 c22120, C22209 c22209) {
        this.f23599 = c22120;
        this.f23600 = c22209;
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ֫ */
    public final void mo7909(long j, long j2, long j3, long j4) {
        C22209 c22209 = this.f23600;
        c22209.m50038(j);
        C22120 c22120 = this.f23599;
        c22120.f69987.m8347(c22209);
        c22120.f69987.m8343(j4);
        c22120.f69987.m8342(c22209.m50042());
    }

    @Override // p067l.InterfaceC23810
    /* JADX INFO: renamed from: ܺ֫ */
    public final C6455 mo7910() {
        return this.f23599.f69984;
    }
}
