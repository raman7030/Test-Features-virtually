package l;

import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6983 extends AbstractC16860 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f21529;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C16646 f21530;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C16646 f21531;

    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612) {
        C14169 c14169 = (C14169) this.f51738;
        Map map = this.f51739;
        return new C6983(this.f21529, (C14169) abstractC12612, c1755, c14169, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6983(C5572 c5572, C14169 c14169, C1755 c1755, C14169 c141610, Map map) {
        super(c5572, c14169, c1755, c141610, map);
        this.f21529 = c5572;
        this.f21531 = C16646.empty();
        this.f21530 = C16646.empty();
    }

    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo18876(C23420 c23420) {
        try {
            C6487 c6487M23938 = this.f21529.f17262.m23938((AbstractC4293) this.f51738, c23420, (C2609) this.f21531.orElseGet(new Supplier() { // from class: l.ܿ᩶֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C6983 c6983 = this.f53684;
                    C2609 c2609M19434 = C7260.m19434(((C14169) c6983.f51738).f42775);
                    c6983.f21531 = C16646.of(c2609M19434);
                    return c2609M19434;
                }
            }));
            AbstractC4308 abstractC4308 = c6487M23938.f20020;
            AbstractC4308 abstractC4309 = c6487M23938.f20021;
            m18875(abstractC4308, c23420);
            return abstractC4309;
        } catch (C6130 e) {
            c23420.f75215.mo1084(null, e.m17050());
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18875(AbstractC4308 abstractC4308, C23420 c23420) {
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        C5572 c5572 = this.f21529;
        C9310 c9310 = c5572.f17262;
        C14169 c14169 = (C14169) this.f51738;
        C23420 c23420M23941 = c9310.m23941(c14169, abstractC4308, c23420);
        int i = C11217.f33656[c14169.m33819().ordinal()];
        if (i == 1) {
            AbstractC5144 abstractC5144 = c14169.f42776;
            C5572.m15818(abstractC5144, abstractC5144.f16086, c23420M23941);
        } else if (i == 2) {
            for (C9938 c9938 : (C2609) this.f21530.orElseGet(new Supplier() { // from class: l.ܳ᩶֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C18837 c18837 = new C18837();
                    C23916 c23916 = new C23916(c18837);
                    C6983 c6983 = this.f45023;
                    c23916.mo10758(((C14169) c6983.f51738).f42776);
                    C2609 c2609M43517 = c18837.m43517();
                    c6983.f21530 = C16646.of(c2609M43517);
                    return c2609M43517;
                }
            })) {
                AbstractC4308 abstractC4309 = c23420M23941.f75219;
                InterfaceC3953 interfaceC3954 = c23420M23941.f75215;
                EnumC9454 enumC9454 = EnumC9454.VOID;
                if (abstractC4309.m12913(enumC9454) && c9938.f30017 != null) {
                    c14169.getClass();
                    interfaceC3954.mo1084(c14169, c5572.f17266.m16622("unexpected.ret.val", new Object[0]));
                } else if (!c23420M23941.f75219.m12913(enumC9454)) {
                    if (c9938.f30017 == null) {
                        c14169.getClass();
                        interfaceC3954.mo1084(c14169, c5572.f17266.m16622("missing.ret.val", new Object[0]));
                    }
                    AbstractC12612 abstractC12612 = c9938.f30017;
                    C5572.m15818(abstractC12612, abstractC12612.f16086, c23420M23941);
                }
            }
        }
        c5572.f17262.m23949(c14169, abstractC4308, interfaceC3953);
    }
}
