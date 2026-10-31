package l;

/* JADX INFO: renamed from: l.ۜۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6670 implements InterfaceC22560 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20782 f20724;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20876 f20725;

    @Override // l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷֫ */
    public final /* synthetic */ void mo1648() {
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        C20782 c20782 = this.f20724;
        return c20782.f67304.m6160() || c20782.f67302.mo19832() == EnumC13728.DESTROYED;
    }

    public C6670(C20782 c20782, C20876 c20876) {
        this.f20724 = c20782;
        this.f20725 = c20876;
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C20876 c20876 = this.f20725;
        c20876.m47708(j);
        C20782 c20782 = this.f20724;
        c20782.f67304.m6149(c20876);
        c20782.f67304.m6145(j4);
        c20782.f67304.m6144(c20876.m47712());
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ܺ֫ */
    public final C4300 mo5680() {
        return this.f20724.f67301;
    }
}
