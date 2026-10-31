package l;

/* JADX INFO: renamed from: l.᩶ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20076 implements InterfaceC22560, InterfaceC14243 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4553 f65013;

    public C20076(C4553 c4553) {
        this.f65013 = c4553;
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C4553 c4553 = this.f65013;
        c4553.f14530.m47708(j);
        c4553.f14524.mo3550(c4553.f14530);
        c4553.f14524.mo3552(j4);
        c4553.f14524.setProgress(c4553.f14530.m47712());
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        C4553 c4553 = this.f65013;
        return c4553.f14524.mo1526() || c4553.f14533.get() != null;
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ܺ֫ */
    public final C4300 mo5680() {
        return this.f65013.f14526;
    }

    @Override // l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷֫ */
    public final void mo1648() {
        C4553 c4553 = this.f65013;
        String str = (String) c4553.f14539.get();
        if (str != null) {
            c4553.f14524.setName(str);
        }
    }

    @Override // l.InterfaceC14243
    public final void cancel() {
        this.f65013.f14524.mo3549();
    }
}
