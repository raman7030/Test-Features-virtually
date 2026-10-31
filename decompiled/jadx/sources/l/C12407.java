package l;

/* JADX INFO: renamed from: l.۫۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12407 implements InterfaceC18704 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18704 f37369;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6057 f37370;

    public C12407(InterfaceC18704 interfaceC18704, C6057 c6057) {
        this.f37369 = interfaceC18704;
        this.f37370 = c6057;
    }

    @Override // l.InterfaceC18704
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11750(InterfaceC19410 interfaceC19410, InterfaceC11791 interfaceC11791) {
        Object objMo11750 = this.f37369.mo11750(new C13112(interfaceC19410, this.f37370), interfaceC11791);
        return objMo11750 == EnumC7041.COROUTINE_SUSPENDED ? objMo11750 : C8058.f24861;
    }
}
