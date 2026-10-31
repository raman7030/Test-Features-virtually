package l;

/* JADX INFO: renamed from: l.ۘۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes3.dex */
public final class C3887 implements InterfaceC18704 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12407 f12434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC16233 f12436 = C1064.f3912;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19763 f12435 = C5298.f16540;

    public C3887(C12407 c12407) {
        this.f12434 = c12407;
    }

    @Override // l.InterfaceC18704
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11750(InterfaceC19410 interfaceC19410, InterfaceC11791 interfaceC11791) {
        C23932 c23932 = new C23932();
        c23932.f77612 = C4592.f14651;
        Object objMo11750 = this.f12434.mo11750(new C2476(this, c23932, interfaceC19410), interfaceC11791);
        return objMo11750 == EnumC7041.COROUTINE_SUSPENDED ? objMo11750 : C8058.f24861;
    }
}
