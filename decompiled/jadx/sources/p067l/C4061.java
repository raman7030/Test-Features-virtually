package p067l;

/* JADX INFO: renamed from: l.֫ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4061 extends C3546 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C23663 f8932;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f8933;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061(C23663 c23663, AbstractC7783 abstractC7783, boolean z) {
        super(abstractC7783, c23663);
        this.f8932 = c23663;
        this.f8933 = z;
    }

    @Override // p067l.C3546, p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        String str;
        boolean z = this.f8933;
        AbstractC7783 abstractC7784 = this.f62394;
        if (z) {
            str = abstractC7784.mo17483() ? "bad.static.method.in.unbound.lookup" : "bad.instance.method.in.unbound.lookup";
        } else {
            str = "bad.static.method.in.bound.lookup";
        }
        String str2 = str;
        if (abstractC7784.f20405.m6625()) {
            return ((AbstractC7570) abstractC7784).mo6320(enumC14710, interfaceC5323, abstractC7783, abstractC6462, abstractC12224, c4848, c4849);
        }
        C23663 c23663 = this.f8932;
        return c23663.f75333.m18545(enumC14710, c23663.f75324.m9345(), interfaceC5323, str2, C23047.m51425(abstractC7784), abstractC7784);
    }
}
