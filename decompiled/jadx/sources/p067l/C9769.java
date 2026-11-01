package p067l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.۟᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9769 extends AbstractC14874 {

    /* JADX INFO: renamed from: h */
    public final AbstractC11111 f26976h;

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC14874 abstractC14874 = this.f42404d;
        if (abstractC14874 != null) {
            InterfaceC19670 interfaceC19670 = (InterfaceC19670) ((C9769) abstractC14874).f42406f;
            interfaceC19670.mo5379i((InterfaceC19670) ((C9769) this.f42405e).f42406f);
            this.f42406f = interfaceC19670;
        }
        super.onCompletion(countedCompleter);
    }

    public C9769(AbstractC11111 abstractC11111, AbstractC11111 abstractC11112, InterfaceC16847 interfaceC16847) {
        super(abstractC11112, interfaceC16847);
        this.f26976h = abstractC11111;
    }

    public C9769(C9769 c9769, InterfaceC16847 interfaceC16847) {
        super(c9769, interfaceC16847);
        this.f26976h = c9769.f26976h;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C9769(this, interfaceC16847);
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        AbstractC11111 abstractC11111 = this.f42401a;
        InterfaceC19670 interfaceC19670Mo4649e0 = this.f26976h.mo4649e0();
        abstractC11111.mo25629f0(this.f42402b, interfaceC19670Mo4649e0);
        return interfaceC19670Mo4649e0;
    }
}
