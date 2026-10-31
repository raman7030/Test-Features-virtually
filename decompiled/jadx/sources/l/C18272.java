package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18272 extends AbstractC16860 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f56809;

    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612) {
        C8379 c8379 = (C8379) this.f51738;
        Map map = this.f51739;
        return new C18272(this.f56809, (C8379) abstractC12612, c1755, c8379, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18272(C5572 c5572, C8379 c8379, C1755 c1755, C8379 c83710, Map map) {
        super(c5572, c8379, c1755, c83710, map);
        this.f56809 = c5572;
    }

    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC4308 mo18876(C23420 c23420) {
        C5572 c5572 = this.f56809;
        C9310 c9310 = c5572.f17262;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC4308 = c23420.f75219;
        c9310.getClass();
        C23420 c23420Mo38522 = c23420.mo38522(new C19935(c9310, interfaceC3953));
        AbstractC12612 abstractC12612 = this.f51738;
        C8379 c8379 = (C8379) abstractC12612;
        if (c8379.mo12874()) {
            return c23420Mo38522.mo13581(abstractC12612, c8379.f16086);
        }
        if (abstractC4308.m12913(EnumC9454.VOID)) {
            c23420.f75215.mo1084(this.f4048, c5572.f17262.f28210.m16617(C11886.f35443));
            return c5572.f17262.f28251.m17535(abstractC4308);
        }
        AbstractC12612 abstractC12613 = c8379.f25699;
        C5572.m15818(abstractC12613, abstractC12613.f16086, c23420Mo38522);
        AbstractC12612 abstractC12614 = c8379.f25700;
        C5572.m15818(abstractC12614, abstractC12614.f16086, c23420Mo38522);
        return c23420Mo38522.f75219;
    }
}
