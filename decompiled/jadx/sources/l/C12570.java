package l;

import java.util.Iterator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.۫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12570 extends AbstractC13980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C4809 f37881;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13275 f37882;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f37883;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3398 f37884;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1755 f37885;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۙᩳ۠] */
    public C12570(C11139 c11139) {
        super(c11139, EnumC12075.IMPORTS_PHASE, new C20332(c11139));
        this.f37883 = c11139;
        this.f37881 = new BiConsumer() { // from class: l.ۙᩳ۠
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C10643 c10643 = (C10643) obj;
                C15240 c15240 = this.f15219.f37883.f33426;
                c10643.getClass();
                c15240.m36110(c10643, (C20515) obj2);
            }
        };
    }

    @Override // l.AbstractC13980
    /* JADX INFO: renamed from: ֫ */
    public final void mo6476(C1755 c1755) {
        C14163 c14163 = c1755.f6079.f17186;
        if (c14163.f17561.f17559 == EnumC1296.f4579) {
            C1323 c1323 = c1755.f6075;
            EnumC18550 enumC18550 = EnumC18550.f57509;
            C1755 c1756 = c1755;
            while (c1756 != null && !c1756.f6074.m14709(enumC18550)) {
                c1756 = c1756.f6072;
            }
            m30811(c1323, c1756);
            this.f37883.f33439.add(c1755);
        }
        AbstractC5698 abstractC5698 = c14163.f17561;
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            abstractC5698.mo16101();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v0, types: [l.ۗᩳ۠] */
    /* JADX WARN: Type inference failed for: r10v1, types: [l.۬ᩳ۠] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30811(C1323 c1323, C1755 c1755) {
        if (c1323.f4740.m51436()) {
            return;
        }
        C3398 c3398 = this.f37884;
        C13275 c13275 = this.f37882;
        C11139 c11139 = this.f37883;
        InterfaceC3109 interfaceC3109M42470 = c11139.f33431.m42470();
        C4824 c4824M36112 = c11139.f33426.m36112(c11139.f33436);
        C1755 c1756 = this.f37885;
        try {
            this.f37885 = c1755;
            final C7814 c7814 = c1755.f6075.f4746;
            this.f37884 = new InterfaceC19663() { // from class: l.ۗᩳ۠
                @Override // l.InterfaceC19663
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final boolean mo10364(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
                    C11139 c111310 = this.f10760.f37883;
                    if (!abstractC5698.mo15572()) {
                        return false;
                    }
                    c111310.f33426.getClass();
                    return C15240.m36075(abstractC5698, c7814) && abstractC5698.m16067((AbstractC19810) abstractC7667.f23673, c111310.f33442);
                }
            };
            this.f37882 = new InterfaceC19663() { // from class: l.۬ᩳ۠
                @Override // l.InterfaceC19663
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo10364(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
                    if (abstractC5698.f17559 != EnumC1296.f4582) {
                        return false;
                    }
                    this.f39749.f37883.f33426.getClass();
                    return C15240.m36075(abstractC5698, c7814);
                }
            };
            C7814 c7814M47266 = c11139.f33440.m47266(c11139.f33440.f66509, c11139.f33438.f18824);
            c7814M47266.mo16101();
            if (c7814M47266.f24145.m20480() && !c7814M47266.mo15574()) {
                throw new C23570(c11139.f33433.m16617(C11886.f35499).toString());
            }
            C17013 c17013 = c11139.f33425;
            c17013.m39946((InterfaceC3109) c1323);
            AbstractC12612 abstractC12612M39954 = c11139.f33425.m39954(c7814M47266);
            C10643 c10643 = new C10643();
            c10643.f32021 = abstractC12612M39954;
            c10643.f32020 = false;
            c10643.f16085 = c17013.f52172;
            c1755.f6075.f4740.m51435(c11139.f33442, c7814M47266.mo16064(), this.f37882, c10643, this.f37881);
            C3587 c3587M4616 = c1323.m4616();
            if (c1323.m4619() != null && c3587M4616 == null) {
                m30812(c1323.m4619());
            }
            Iterator it = c1323.m4617().iterator();
            while (it.hasNext()) {
                m30813((C10643) it.next());
            }
            if (c3587M4616 != null) {
                C2176 c2176 = c3587M4616.f11379;
                c11139.m27652(c3587M4616.f11377, c2176.f7168, c1755);
                c11139.f33441.m32406(c2176.f7168, c1755, c1755.f6075.f4739, (InterfaceC3109) null);
            }
            this.f37885 = c1756;
            c11139.f33426.m36112(c4824M36112);
            c11139.f33431.m42471(interfaceC3109M42470);
            this.f37884 = c3398;
            this.f37882 = c13275;
        } catch (Throwable th) {
            this.f37885 = c1756;
            c11139.f33426.m36112(c4824M36112);
            c11139.f33431.m42471(interfaceC3109M42470);
            this.f37884 = c3398;
            this.f37882 = c13275;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30812(C7820 c7820) {
        AbstractC12612 abstractC12612 = c7820.f24199;
        C11139 c11139 = this.f37883;
        if (abstractC12612 != null) {
            for (AbstractC5698 abstractC5698 = this.f37885.f6075.f4746; abstractC5698.f17561 != c11139.f33440.f66473; abstractC5698 = abstractC5698.f17561) {
                abstractC5698.f17561.mo16101();
                if (c11139.f33440.m47270(c11139.f33440.m47272(this.f37885.f6075.f4739, abstractC5698.f17561.mo16076()).f24147, abstractC5698.mo16076()) != null) {
                    C22364 c22364 = c11139.f33430;
                    int i = c7820.f16085;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7269(i, new C12281("compiler", "pkg.clashes.with.class.of.same.name", abstractC5698));
                }
            }
        }
        C13395 c13395 = c11139.f33441;
        C2609 c2609 = c7820.f24198;
        C1755 c1755 = this.f37885;
        c13395.m32406(c2609, c1755, c1755.f6075.f4746, (InterfaceC3109) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30813(C10643 c10643) {
        C6262 c6262 = (C6262) c10643.f32021;
        AbstractC10370 abstractC10370M19462 = C7260.m19462(c6262);
        C1755 c1755 = this.f37885;
        C1755 c1755M5877 = c1755.m5877(c10643, c1755.f6073);
        C11139 c11139 = this.f37883;
        C9310 c9310 = c11139.f33427;
        c9310.getClass();
        AbstractC12612 abstractC12612 = ((C6262) c10643.f32021).f19397;
        boolean z = c10643.f32020;
        C15406 c15406 = z ? C15406.f47189 : C15406.f47182;
        C11488 c11488 = AbstractC4308.f13885;
        AbstractC19810 abstractC19810 = c9310.m23930(abstractC12612, c1755M5877, new C23420(c9310, c15406, c11488)).f13890;
        AbstractC10370 abstractC10370 = c11139.f33438.f18835;
        C4809 c4809 = this.f37881;
        if (abstractC10370M19462 == abstractC10370) {
            c11139.f33426.m36134(c6262.f19397);
            if (!z) {
                this.f37885.f6075.f4740.m51435(c11139.f33442, abstractC19810.mo16064(), this.f37882, c10643, this.f37881);
                return;
            } else {
                this.f37885.f6075.f4740.m51435(c11139.f33442, abstractC19810.mo16064(), this.f37884, c10643, c4809);
                return;
            }
        }
        if (!z) {
            C12171.m29642(c11139.f33434);
            C4824 c4824M36112 = c11139.f33426.m36112(c11139.f33443 ? c11139.f33436 : c11139.f33436.m14054(EnumC20347.DEPRECATION, EnumC20347.REMOVAL, EnumC20347.PREVIEW));
            try {
                c11139.f33434 = false;
                C9310 c9311 = c11139.f33427;
                c9311.getClass();
                AbstractC4308 abstractC4308M23954 = c9311.m23954(c6262, c1755M5877, c11488);
                c11139.f33434 = true;
                c11139.f33426.m36112(c4824M36112);
                AbstractC4308 abstractC4308Mo12947 = abstractC4308M23954.mo12947();
                AbstractC19810 abstractC19811 = abstractC4308Mo12947.m12913(EnumC9454.CLASS) ? abstractC4308Mo12947.f13890 : abstractC4308M23954.f13890;
                c11139.f33426.m36134(c6262);
                C1755 c1756 = this.f37885;
                if (abstractC19811.f17559 == EnumC1296.f4582) {
                    c10643.f32019 = c1756.f6075.f4742.m50431(abstractC19811.f17561.mo16064(), abstractC19811.f17561.mo16064(), abstractC19811);
                    return;
                }
                return;
            } catch (Throwable th) {
                c11139.f33434 = true;
                c11139.f33426.m36112(c4824M36112);
                throw th;
            }
        }
        if (abstractC19810.f17559 != EnumC1296.f4582) {
            c11139.f33430.m7280(EnumC20043.RECOVERABLE, c10643, C6241.f19126);
        } else {
            c10643.f32019 = c1755M5877.f6075.f4742.m50430(c11139.f33442, abstractC19810.mo16064(), abstractC10370M19462, this.f37884, c10643, c4809);
        }
        c11139.f33426.m36134(c6262.f19397);
    }
}
