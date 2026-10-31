package l;

/* JADX INFO: renamed from: l.᩷ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20995 implements InterfaceC3355 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15348 f67791;

    public /* synthetic */ C20995(C15348 c15348) {
        this.f67791 = c15348;
    }

    @Override // l.InterfaceC3355
    /* JADX INFO: renamed from: ֫ */
    public final void mo10253(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
        C15348 c15348 = this.f67791;
        String str = c15348.f47037;
        if (interfaceC21211.mo47884() != c15348.f47043) {
            return;
        }
        if (c15348.f47039 == null) {
            InterfaceC4277 interfaceC4277Mo29407 = interfaceC21211.mo29407();
            InterfaceC0748 type = interfaceC21211.getType();
            int i = c15348.f47043;
            interfaceC4277Mo29407.getClass();
            int iMo12858 = interfaceC4277Mo29407.mo12858();
            c15348.f47039 = new C13232(type.getTypeName(), i, iMo12858, type.mo2870(), interfaceC21211.mo47883(), interfaceC21211.mo29406());
        }
        String strM8426 = C2692.m8426(interfaceC7099);
        c15348.f47032.add(strM8426);
        if ("*".equals(str) || str.equals(strM8426)) {
            c15348.f47030.add(new C5472(interfaceC7099, interfaceC21211));
        }
    }
}
