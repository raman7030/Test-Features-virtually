package l;

/* JADX INFO: renamed from: l.ܶ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15475 extends AbstractC3482 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13359 f47350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1740 f47351;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f47352;

    @Override // l.AbstractC3482
    /* JADX INFO: renamed from: ۧ */
    public final void mo10662() {
        mo10663();
        Object obj = this.f47352.f6073;
        C12171.m29642(((C4893) obj).f15452.m43514() % 2 == 0);
        ((C4893) obj).f15452.m43511(Integer.valueOf(this.f47350.f39962.m4816()));
    }

    @Override // l.AbstractC3482
    /* JADX INFO: renamed from: ܽ */
    public final void mo10663() {
        C13359 c13359 = this.f47350;
        if (c13359.f39962.m4831()) {
            C1740 c1740 = this.f47351;
            c1740.mo5817();
            c13359.f39962.m4824(195);
            C5599 c5599 = c13359.f39962.f4970;
            int i = c1740.f6015;
            int i2 = c5599.f17316 - 1;
            c5599.f17316 = i2;
            C12171.m29642(c5599.f17318[i2] == i);
            c5599.f17318[c5599.f17316] = -1;
        }
    }

    public C15475(C13359 c13359, C1755 c1755, C1740 c1740) {
        this.f47350 = c13359;
        this.f47352 = c1755;
        this.f47351 = c1740;
    }
}
