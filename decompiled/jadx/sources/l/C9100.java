package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9100 extends AbstractC16154 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f27577;

    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612) {
        C19110 c19110 = (C19110) this.f51738;
        Map map = this.f51739;
        return new C9100(this.f27577, (C19110) abstractC12612, c1755, c19110, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9100(C5572 c5572, C19110 c19110, C1755 c1755, C19110 c19111, Map map) {
        super(c5572, c19110, c1755, c19111, map);
        this.f27577 = c5572;
    }

    @Override // l.AbstractC16154
    /* JADX INFO: renamed from: ܽ */
    public final C23420 mo8504(C23420 c23420) {
        C9310 c9310 = this.f27577.f17262;
        C19110 c19110 = (C19110) this.f51738;
        AbstractC19810 abstractC19810 = c19110.f60196.f16086.f13890;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        c9310.getClass();
        return c23420.mo38522(new C3001(c9310, interfaceC3953, c19110, abstractC19810));
    }

    @Override // l.AbstractC16154
    /* JADX INFO: renamed from: ۫֫ */
    public final AbstractC4308 mo8503() {
        AbstractC4308 abstractC4308 = ((C19110) this.f51738).f60192;
        return abstractC4308 != null ? abstractC4308.mo2973() : this.f27577.f17261.f66457;
    }
}
