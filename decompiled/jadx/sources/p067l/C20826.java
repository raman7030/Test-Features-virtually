package p067l;

/* JADX INFO: renamed from: l.᩵ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20826 extends AbstractC20155 {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f65437;

    /* JADX INFO: renamed from: ۟ */
    public final C4036 f65438;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C23663 f65439;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20826(C23663 c23663, C4036 c4036, boolean z, AbstractC7783 abstractC7783) {
        super(c23663, EnumC3600.f7347, abstractC7783, "invisible class error");
        this.f65439 = c23663;
        this.f65438 = c4036;
        this.f65437 = z;
        this.f20408 = abstractC7783.f20408;
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        EnumC3600 enumC3600;
        C23663 c23663 = this.f65439;
        C23623 c23623 = c23663.f75324;
        if (this.f65437) {
            return null;
        }
        AbstractC7783 abstractC7784 = this.f62394;
        EnumC3600 enumC3601 = abstractC7784.f20405;
        EnumC3600 enumC3602 = EnumC3600.f7351;
        C4036 c4036 = this.f65438;
        if (enumC3601 == enumC3602) {
            return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "package.not.visible", abstractC7784, c23663.m52664(c4036, abstractC7784.m18008()));
        }
        C18258 c18258M52664 = c23663.m52664(c4036, abstractC7784.m18008());
        if (interfaceC5323.mo11525() != null) {
            AbstractC7257 abstractC7257Mo11525 = interfaceC5323.mo11525();
            AbstractC7783 abstractC7785 = abstractC7784;
            while (true) {
                EnumC3600 enumC3603 = abstractC7785.f20405;
                enumC3600 = EnumC3600.f7351;
                if (enumC3603 == enumC3600 || !abstractC7257Mo11525.m16617(EnumC19998.f60805)) {
                    break;
                }
                abstractC7785 = abstractC7785.f20407;
                abstractC7257Mo11525 = ((C8320) abstractC7257Mo11525).f22261;
            }
            if (abstractC7785.f20405 == enumC3600) {
                abstractC7257Mo11525.getClass();
                return c23663.f75333.m18545(enumC14710, c23623.m9345(), abstractC7257Mo11525, "package.not.visible", abstractC7785, c18258M52664);
            }
        }
        return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "not.def.access.package.cant.access", abstractC7784, abstractC7784.m18008(), c18258M52664);
    }
}
