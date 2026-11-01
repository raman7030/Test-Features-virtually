package p067l;

/* JADX INFO: renamed from: l.ܶܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16871 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5473 f49957;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3626 f49958;

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    public C16871(C5473 c5473, C3626 c3626) {
        this.f49957 = c5473;
        this.f49958 = c3626;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C2417 c2417 = (C2417) abstractC7783;
        c2417.f20409 |= 268435456;
        C5473 c5473 = this.f49957;
        C21567 c21567 = new C21567(c5473);
        C23623 c23623 = c5473.f13091;
        C3626 c3626 = this.f49958;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c3626.f7516);
        C5777 c5777M6848 = c3626.m6848();
        C19694 c19694 = c5473.f13083;
        c5777M6848.getClass();
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c5777M6848);
        try {
            c21567.mo3788(c5777M6848);
            c5473.m12081(c2417);
            C5473.m12064(c5473, c5777M6848);
        } finally {
            c5473.f13091.m9363(interfaceC19740M9363);
            c5473.f13083.m44730(interfaceC5323M44730);
            c2417.f20409 &= -268435457;
        }
    }

    public final String toString() {
        return "SourceCompleter: " + this.f49958.f7516.getName();
    }
}
