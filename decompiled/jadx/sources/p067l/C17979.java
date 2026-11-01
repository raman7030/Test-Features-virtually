package p067l;

/* JADX INFO: renamed from: l.ܽۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C17979 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC6462 f53696;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22004 f53697;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC8453 f53698;

    public C17979(C22004 c22004, InterfaceC8453 interfaceC8453, AbstractC6462 abstractC6462) {
        this.f53697 = c22004;
        this.f53698 = interfaceC8453;
        this.f53696 = abstractC6462;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C22004 c22004 = this.f53697;
        C15828 c15828 = c22004.f69163;
        try {
            this.f53698.mo9171(abstractC7783);
        } catch (C21865 unused) {
            abstractC7783.f20409 |= 1;
            ((C21333) abstractC7783.f20406).f67259 = c22004.f69208;
            AbstractC12224 abstractC12224 = c22004.f69200.f21754;
            AbstractC6462 abstractC6462 = this.f53696;
            abstractC7783.mo17983().mo28415(new C5771(9L, abstractC12224, new C12497(C4848.m10276of((Object) abstractC6462), abstractC7783.f20406, C4848.m10283(), c15828), abstractC7783));
            abstractC7783.mo17983().mo28415(new C5771(1L, abstractC6462.f16705.f20408.m28202(c22004.f69200.f21681), new C12497(C4848.m10283(), abstractC6462, C4848.m10283(), c15828), abstractC7783));
        }
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9173() {
        return this.f53698.mo9173();
    }
}
