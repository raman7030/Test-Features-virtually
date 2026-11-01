package p067l;

/* JADX INFO: renamed from: l.ۧۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C12616 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22004 f35410;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC8453 f35411;

    public C12616(C22004 c22004, InterfaceC8453 interfaceC8453) {
        this.f35410 = c22004;
        this.f35411 = interfaceC8453;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        try {
            this.f35411.mo9171(abstractC7783);
        } catch (C21865 unused) {
            abstractC7783.f20409 |= 513;
            ((C21333) abstractC7783.f20406).f67259 = this.f35410.f69208;
        }
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9173() {
        return this.f35411.mo9173();
    }
}
