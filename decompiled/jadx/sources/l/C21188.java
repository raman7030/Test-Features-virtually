package l;

/* JADX INFO: renamed from: l.᩷᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21188 implements InterfaceC22560 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9193 f68289;

    public C21188(C9193 c9193) {
        this.f68289 = c9193;
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C9193 c9193 = this.f68289;
        c9193.f27859.m47708(j);
        c9193.mo23260(c9193.f27859);
        c9193.mo23258(j4);
        c9193.mo11538(c9193.f27859.m47712());
    }

    @Override // l.InterfaceC22560
    /* JADX INFO: renamed from: ܺ֫ */
    public final C4300 mo5680() {
        return this.f68289.f27864;
    }

    @Override // l.InterfaceC5627
    /* JADX INFO: renamed from: ᩷֫ */
    public final void mo1648() {
        C9193 c9193 = this.f68289;
        String str = (String) c9193.f27852.get();
        if (str != null) {
            c9193.mo23259(str);
        }
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        C9193 c9193 = this.f68289;
        return c9193.mo1526() || c9193.f27854.get() != null;
    }
}
