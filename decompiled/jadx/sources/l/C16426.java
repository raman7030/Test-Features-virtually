package l;

/* JADX INFO: renamed from: l.ܽۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16426 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f50516;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20661 f50517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6403 f50518;

    public C16426(C20661 c20661, InterfaceC6403 interfaceC6403, AbstractC4308 abstractC4308) {
        this.f50517 = c20661;
        this.f50518 = interfaceC6403;
        this.f50516 = abstractC4308;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C20661 c20661 = this.f50517;
        C14163 c14163 = c20661.f66481;
        try {
            this.f50518.mo7076(abstractC5698);
        } catch (C20515 unused) {
            abstractC5698.f17563 |= 1;
            ((C19955) abstractC5698.f17560).f64618 = c20661.f66526;
            AbstractC10370 abstractC10370 = c20661.f66518.f18896;
            AbstractC4308 abstractC4308 = this.f50516;
            abstractC5698.mo16064().mo26382(new C3581(9L, abstractC10370, new C10658(C2609.of((Object) abstractC4308), abstractC5698.f17560, C2609.m8239(), c14163), abstractC5698));
            abstractC5698.mo16064().mo26382(new C3581(1L, abstractC4308.f13890.f17562.m26173(c20661.f66518.f18823), new C10658(C2609.m8239(), abstractC4308, C2609.m8239(), c14163), abstractC5698));
        }
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7078() {
        return this.f50518.mo7078();
    }
}
