package l;

/* JADX INFO: renamed from: l.֫᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2166 implements InterfaceC22560 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4300 f7155;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11339 f7156;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1025 f7157;

    public C2166(C11339 c11339, InterfaceC1025 interfaceC1025, C4300 c4300) {
        this.f7156 = c11339;
        this.f7157 = interfaceC1025;
        this.f7155 = c4300;
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C11339 c11339 = this.f7156;
        c11339.f33924.m47708(j);
        C15249 c15249 = c11339.f33924;
        InterfaceC1025 interfaceC1025 = this.f7157;
        interfaceC1025.mo3550(c15249);
        interfaceC1025.mo3552(j4);
        interfaceC1025.setProgress(c11339.f33924.m47712());
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f7156.f33921.mo1526();
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ܺ֫ */
    public final C4300 mo5680() {
        return this.f7155;
    }

    @Override // l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷֫ */
    public final void mo1648() {
        String str = (String) this.f7156.f33918.get();
        if (str != null) {
            this.f7157.setName(str);
        }
    }
}
