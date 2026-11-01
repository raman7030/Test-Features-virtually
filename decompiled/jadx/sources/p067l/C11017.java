package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11017 extends AbstractC17721 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C7664 f30514;

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18392 mo10549(C4036 c4036, AbstractC14355 abstractC14355) {
        C20530 c20530 = (C20530) this.f54918;
        Map map = this.f54919;
        return new C11017(this.f30514, (C20530) abstractC14355, c4036, c20530, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11017(C7664 c7664, C20530 c20530, C4036 c4036, C20530 c20531, Map map) {
        super(c7664, c20530, c4036, c20531, map);
        this.f30514 = c7664;
    }

    @Override // p067l.AbstractC17721
    /* JADX INFO: renamed from: ܽ */
    public final C24626 mo10551(C24626 c24626) {
        C11216 c11216 = this.f30514.f20102;
        C20530 c20530 = (C20530) this.f54918;
        AbstractC21195 abstractC21195 = c20530.f63429.f18925.f16705;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        c11216.getClass();
        return c24626.mo40739(new C5220(c11216, interfaceC6125, c20530, abstractC21195));
    }

    @Override // p067l.AbstractC17721
    /* JADX INFO: renamed from: ۫֫ */
    public final AbstractC6462 mo10550() {
        AbstractC6462 abstractC6462 = ((C20530) this.f54918).f63425;
        return abstractC6462 != null ? abstractC6462.mo5302() : this.f30514.f20101.f69139;
    }
}
