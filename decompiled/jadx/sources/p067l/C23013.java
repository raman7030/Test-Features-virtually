package p067l;

/* JADX INFO: renamed from: l.᩸ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes.dex */
public final class C23013 extends C17401 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21672 f72389;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC22097 f72390;

    public C23013(C21672 c21672, InterfaceC22097 interfaceC22097) {
        this.f72389 = c21672;
        this.f72390 = interfaceC22097;
    }

    @Override // p067l.C17401, p067l.InterfaceC19414
    public final EnumC18072 preVisitDirectory(Object obj, InterfaceC16730 interfaceC16730) {
        InterfaceC22097 interfaceC22097 = (InterfaceC22097) obj;
        InterfaceC22097 fileName = interfaceC22097.getFileName();
        C21672 c21672 = this.f72389;
        if (C21672.m48876(c21672, fileName)) {
            c21672.f68256.put(new C12204(this.f72390.relativize(interfaceC22097).toString()), interfaceC22097);
            return EnumC18072.CONTINUE;
        }
        return EnumC18072.SKIP_SUBTREE;
    }
}
