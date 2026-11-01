package p067l;

/* JADX INFO: renamed from: l.ܽܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18266 implements InterfaceC4739 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19608 f54543;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f54544;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15271 f54545;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C13693 f54546;

    public C18266(C19608 c19608, C15271 c15271, int i, C13693 c13693) {
        this.f54543 = c19608;
        this.f54545 = c15271;
        this.f54544 = i;
        this.f54546 = c13693;
    }

    @Override // p067l.InterfaceC4739
    /* JADX INFO: renamed from: ֫ */
    public final int mo10038() {
        return this.f54545.m34768();
    }

    @Override // p067l.InterfaceC4739
    /* JADX INFO: renamed from: ۧ */
    public final int mo10041() {
        return this.f54544;
    }

    @Override // p067l.InterfaceC4739
    /* JADX INFO: renamed from: ֫ */
    public final C9729 mo10039(int i) {
        return this.f54545.m34758(i, this.f54546.f38631.f79987);
    }

    @Override // p067l.InterfaceC4739
    /* JADX INFO: renamed from: ֫ */
    public final void mo10040(int i, RunnableC10774 runnableC10774) {
        C23631 c23631 = this.f54543.f59644;
        if (c23631.f75231 == this.f54546) {
            c23631.m52478(i, runnableC10774);
        }
    }
}
