package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4257 extends C24572 {

    /* JADX INFO: renamed from: ᩵ */
    public static final C6468 f9427 = new C6468();

    /* JADX INFO: renamed from: ۖ */
    public final C22004 f9428;

    /* JADX INFO: renamed from: ۘ */
    public final EnumC12720 f9429;

    /* JADX INFO: renamed from: ۜ */
    public C18537 f9430;

    /* JADX INFO: renamed from: ۡ */
    public final C24387 f9431;

    /* JADX INFO: renamed from: ۢ */
    public final C12004 f9432;

    /* JADX INFO: renamed from: ۧ */
    public final C11216 f9433;

    /* JADX INFO: renamed from: ܺ */
    public final C23663 f9435;

    /* JADX INFO: renamed from: ᩴ */
    public final C8374 f9439;

    /* JADX INFO: renamed from: ᩷ */
    public final C8200 f9440;

    /* JADX INFO: renamed from: ᩻ */
    public C4036 f9441;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC15615 f9436 = new C14275();

    /* JADX INFO: renamed from: ᩳ */
    public C15828 f9438 = null;

    /* JADX INFO: renamed from: ܿ */
    public C5771 f9437 = null;

    /* JADX INFO: renamed from: ܳ */
    public C13818 f9434 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC10057 m8644(C4257 c4257, AbstractC6462 abstractC6462, AbstractC21062 abstractC21062) {
        AbstractC6462 abstractC6463;
        C8374 c8374 = c4257.f9439;
        if (abstractC21062.mo32949()) {
            AbstractC6462 abstractC6462M19459 = c8374.m19459(C9268.m21423((AbstractC23212) abstractC21062).m27359());
            if (abstractC6462M19459.mo14805()) {
                abstractC6463 = abstractC6462M19459;
                abstractC6463 = c8374.m19436(abstractC6462M19459).f20406;
            }
            abstractC6463 = abstractC6462M19459;
            return c8374.m19486(abstractC6462, abstractC6463, true) ? (InterfaceC10057) abstractC6462 : (InterfaceC10057) abstractC6463;
        }
        if (!abstractC21062.mo32948() || C9268.m21395((AbstractC14355) abstractC21062)) {
            return null;
        }
        AbstractC6462 abstractC6464 = abstractC21062.f18925;
        if ((abstractC6464.f16705.f20409 & 16384) != 0) {
            return C7375.m17097(((C9661) abstractC21062).f26610.toString());
        }
        C1446.m31699(abstractC6464.mo14779());
        int i = C8240.f21834[abstractC21062.f18925.mo5577().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C7375.m17096(((Integer) abstractC21062.f18925.mo14779()).intValue());
        }
        if (i == 5) {
            return C7375.m17097((String) abstractC21062.f18925.mo14779());
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4257 m8642(C5127 c5127) {
        C4257 c4257 = (C4257) c5127.m10905(f9427);
        return c4257 == null ? new C4257(c5127) : c4257;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        AbstractC6462 abstractC6462;
        if (c17846.f53243 instanceof AbstractC23212) {
            boolean zM14777 = c17846.f53242.f18925.m14777(EnumC11353.BOT);
            C22004 c22004 = this.f9428;
            if (zM14777) {
                abstractC6462 = c22004.f69208;
            } else {
                abstractC6462 = c17846.f53242.f18925;
            }
            AbstractC6462 abstractC6463 = abstractC6462;
            C13818 c13818 = this.f9434;
            this.f9436 = new C24333(this);
            try {
                AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c17846.f53242);
                AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14355);
                if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == EnumC3600.f7339 && abstractC7783M21438.f20407.f20405.m6623(C17010.f50315)) {
                    this.f9434 = (C13818) abstractC7783M21438;
                } else {
                    this.f9434 = new C13818(4112L, this.f9440.f21738.m32717("patt" + c17846.f18924 + this.f9429.m29249() + "temp"), abstractC6463, this.f9437);
                }
                AbstractC23212 abstractC23212 = (AbstractC23212) c17846.f53243;
                C8374 c8374 = this.f9439;
                AbstractC6462 abstractC6462M19459 = c8374.m19459(C9268.m21423(abstractC23212).m27359());
                if (abstractC6462M19459.mo14805()) {
                    abstractC6462M19459 = c8374.m19436(abstractC6462M19459).f20406;
                }
                EnumC19998 enumC19998 = EnumC19998.f60789;
                C9661 c9661M42157 = this.f9430.m42157((AbstractC7783) this.f9434);
                AbstractC14355 abstractC14355M42208 = this.f9430.m42208(abstractC6462M19459);
                C18537 c18537 = this.f9430;
                c18537.getClass();
                C17846 c17847 = new C17846();
                c17847.f53242 = c9661M42157;
                c17847.f53243 = abstractC14355M42208;
                c17847.f18924 = c18537.f55352;
                c17847.f18925 = c22004.f69151;
                AbstractC14355 abstractC14356 = (AbstractC14355) mo25569(c17846.f53243);
                C11003 c11003M42162 = this.f9430.m42162(enumC19998, (AbstractC14355) c17847, abstractC14356);
                C3088 c3088M27496 = this.f9432.m27496(c11003M42162, enumC19998, c17847.f18925, abstractC14356.f18925);
                c11003M42162.f5602 = c3088M27496;
                c11003M42162.f18925 = c3088M27496.f20406.mo14787();
                C13818 c13819 = this.f9434;
                AbstractC14355 abstractC14357 = c11003M42162;
                if (c13819 != abstractC7783M21438) {
                    C18537 c18538 = this.f9430;
                    c18538.f55352 = c17846.f18924;
                    C5916 c5916M42148 = c18538.m42148(c18538.m42166(c13819, abstractC14355), (AbstractC14355) c11003M42162);
                    c5916M42148.f18925 = c22004.f69151;
                    c5916M42148.f14605 = true;
                    abstractC14357 = c5916M42148;
                }
                this.f77797 = this.f9436.mo32806(abstractC14357);
                return;
            } finally {
                this.f9434 = c13818;
                this.f9436.mo32807();
            }
        }
        super.mo3823(c17846);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        C18511 c18511 = (C18511) c17707.f52887.f31438;
        AbstractC6462 abstractC6462M27359 = C9268.m21423((AbstractC23212) c17707).m27359();
        C8374 c8374 = this.f9439;
        AbstractC6462 abstractC6462M19459 = c8374.m19459(abstractC6462M27359);
        if (abstractC6462M19459.mo14805()) {
            abstractC6462M19459 = c8374.m19436(abstractC6462M19459).f20406;
        }
        C13818 c13818Mo22319 = this.f9436.mo22319(c18511);
        if (c13818Mo22319 != null) {
            C18537 c18537 = this.f9430;
            c18537.f55352 = C9268.m21421(c17707);
            C9661 c9661M42157 = this.f9430.m42157((AbstractC7783) c13818Mo22319);
            C9661 c9661M42158 = this.f9430.m42157((AbstractC7783) this.f9434);
            C18537 c18538 = this.f9430;
            c18538.m42189((InterfaceC5323) c9661M42158);
            C19327 c19327M42179 = c18538.m42179((AbstractC7257) this.f9430.m42208(abstractC6462M19459), (AbstractC14355) c9661M42158);
            c19327M42179.f18925 = abstractC6462M19459;
            C22403 c22403M42184 = c18537.m42184((AbstractC14355) c9661M42157, (AbstractC14355) c19327M42179);
            c22403M42184.f18925 = c13818Mo22319.mo18010(c8374);
            C18537 c18539 = this.f9430;
            C5916 c5916M42205 = c18539.m42205((AbstractC14355) this.f9430.m42186(Boolean.TRUE), C4848.m10276of((Object) c18539.m42196(c22403M42184)));
            c5916M42205.f14605 = true;
            c5916M42205.f18925 = this.f9428.f69151;
            this.f77797 = c5916M42205;
            return;
        }
        this.f77797 = this.f9430.m42186(Boolean.TRUE);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3837(C22542 c22542) {
        this.f77797 = mo25569(c22542.f71103);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3815(C15695 c15695) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c15695.f45487);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo25569(c15695.f45486);
        EnumC19998 enumC19998 = EnumC19998.f60789;
        C11003 c11003M42162 = this.f9430.m42162(enumC19998, abstractC14355, abstractC14356);
        C3088 c3088M27496 = this.f9432.m27496(c11003M42162, enumC19998, abstractC14355.f18925, abstractC14356.f18925);
        c11003M42162.f5602 = c3088M27496;
        c11003M42162.f18925 = c3088M27496.f20406.mo14787();
        this.f77797 = c11003M42162;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        m8645(c23882, c23882.f75829, c23882.f75828, c23882.f75831, c23882.f75830);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        m8645(c15164, c15164.f43267, c15164.f43269, c15164.f43266, c15164.f43265);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0380  */
    /* JADX WARN: Code duplicated, block: B:60:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0401  */
    /* JADX WARN: Code duplicated, block: B:80:0x0405  */
    /* JADX INFO: renamed from: ֫ */
    private void m8645(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848, boolean z, boolean z2) {
        Iterator it;
        int i;
        C20271 c20271;
        C20391 c20391;
        int i2;
        if (!z2) {
            if (abstractC7257.m16617(EnumC19998.f60782)) {
                super.mo3839((C23882) abstractC7257);
                return;
            } else {
                super.mo3814((C15164) abstractC7257);
                return;
            }
        }
        boolean zM14777 = abstractC14355.f18925.m14777(EnumC11353.BOT);
        C22004 c22004 = this.f9428;
        final AbstractC6462 abstractC6462 = zM14777 ? c22004.f69208 : abstractC14355.f18925;
        C24387 c24387 = this.f9431;
        C1446.m31704(c24387.m53743());
        C1446.m31704(c24387.m53744(this.f9441.f8851.f7516));
        C20271 c20272 = new C20271();
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            if (((C20391) c4849.f11034).f63043.isEmpty() && c4849.f11035.m10293()) {
                C20391 c20392 = (C20391) c4849.f11035.f11034;
                c20392.f63044 = c20392.f63044.m10292(((C20391) c4849.f11034).f63044);
            } else {
                c20272.m45777((C20391) c4849.f11034);
            }
        }
        C4848 c4848M45783 = c20272.m45783();
        C20271 c20273 = new C20271();
        StringBuilder sb = new StringBuilder("selector");
        sb.append(abstractC7257.f18924);
        EnumC12720 enumC12720 = this.f9429;
        sb.append(enumC12720.m29249());
        sb.append("temp");
        String string = sb.toString();
        C8200 c8200 = this.f9440;
        C13818 c13818 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c8200.f21738.m32717(string), abstractC6462, this.f9437);
        boolean zAnyMatch = C7480.stream(c4848M45783).flatMap(new C4055(8)).anyMatch(new C5558());
        C20391 c20393 = (C20391) c4848M45783.last();
        if (z && !zAnyMatch && C7480.stream(c4848M45783).flatMap(new C6705(12)).noneMatch(new C5364(2))) {
            C4848 c48410 = c20393.f63044;
            AbstractC6462 abstractC6463 = c22004.f69204;
            C24552 c24552M42187 = this.f9430.m42187(abstractC6463.mo5577(), (Object) null);
            c24552M42187.f18925 = abstractC6463;
            c20393.f63044 = c48410.m10290(c24552M42187);
            zAnyMatch = true;
        }
        AbstractC14355 abstractC14355M25948 = (AbstractC14355) mo25569(abstractC14355);
        C18537 c18537 = this.f9430;
        c18537.f55352 = abstractC7257.f18924;
        if (!zAnyMatch) {
            abstractC14355M25948 = this.f9433.m25948(abstractC14355M25948);
        }
        c20273.m45777(c18537.m42166(c13818, abstractC14355M25948));
        AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717((enumC12720.m29249() + abstractC7257.f18924) + "index");
        C9262 c9262 = c22004.f69134;
        AbstractC6462 abstractC6464 = c22004.f69208;
        AbstractC6462 abstractC6465 = c22004.f69196;
        C9262 c9263 = c22004.f69134;
        C13818 c13819 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12224M32717, c9262, this.f9437);
        C18537 c18538 = this.f9430;
        c18538.f55352 = abstractC7257.f18924;
        C24552 c24552M42188 = this.f9430.m42187(c9263.mo5577(), (Object) 0);
        c24552M42188.f18925 = c9263.mo5576((Object) 0);
        c20273.m45777(c18538.m42166(c13819, c24552M42188));
        C20391 c20394 = c20393;
        C4848 c4848M10280 = C4848.m10280(c22004.f69160, c22004.f69215, c22004.f69137, this.f9439.m19418(new C21333(abstractC6465.f16705, abstractC6465.mo7201(), C4848.m10276of((Object) new C21215(abstractC6464, EnumC17268.UNBOUND, c22004.f69162)))));
        InterfaceC10057[] interfaceC10057Arr = (InterfaceC10057[]) C7480.stream(c4848M45783).flatMap(new C7970(6)).map(new Function() { // from class: l.۬ܽ۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C4257.m8644(this.f42676, abstractC6462, (AbstractC21062) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        }).filter(new C10957(1)).toArray(new C13257(1));
        boolean zM18009 = abstractC6462.f16705.m18009();
        AbstractC12224 abstractC12224 = zM18009 ? c8200.f21733 : c8200.f21645;
        C13818 c138110 = c13818;
        C20271 c20274 = c20273;
        C5771 c5771M52640 = this.f9435.m52640(abstractC7257, this.f9441, c22004.f69206, abstractC12224, c4848M10280, C4848.m10283());
        C11136 c11136 = new C11136(abstractC12224, c22004.f69157, c5771M52640.mo12943(), new C12497(C4848.m10277of((Object) (zM18009 ? abstractC6462 : abstractC6464), (Object) c9263), c9263, C4848.m10283(), c22004.f69163), interfaceC10057Arr);
        C18537 c18539 = this.f9430;
        C8320 c8320M42155 = c18539.m42155(c18539.m42197(c5771M52640.f20407), c11136.f20408);
        c8320M42155.f22260 = c11136;
        c8320M42155.f18925 = c9263;
        C17175 c17175M42172 = this.f9430.m42172(c8320M42155, C4848.m10283(), C4848.m10277of((Object) this.f9430.m42157((AbstractC7783) c138110), (Object) this.f9430.m42157((AbstractC7783) c13819)));
        c17175M42172.f18925 = c9263;
        Iterator it2 = c4848M45783.iterator();
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (it2.hasNext()) {
            C20391 c20395 = (C20391) it2.next();
            C4848 c48411 = c20395.f63044;
            if (c48411.m10289() > 1) {
                it = it2;
                if (C7480.stream(c20395.f63044).anyMatch(new C24665(3))) {
                    i = 1;
                    c48411 = (C4848) C7480.stream(c20395.f63044).filter(new C11149(i)).collect(C4848.m10284());
                }
                if (c48411.m10289() == i || !((AbstractC21062) c48411.f11034).mo32949() || z3) {
                    c20395.f63043 = m54183(c20395.f63043);
                } else {
                    AbstractC21062 abstractC21062 = (AbstractC21062) c48411.f11034;
                    this.f9436 = new C24333(this);
                    C13818 c138111 = this.f9434;
                    try {
                        this.f9434 = c138110;
                        AbstractC14355 abstractC14356 = (AbstractC14355) mo25569(abstractC21062);
                        c20395.f63043 = m54183(c20395.f63043);
                        C18537 c185310 = this.f9430;
                        AbstractC21062 abstractC21063 = (AbstractC21062) c48411.f11034;
                        abstractC21063.getClass();
                        c185310.m42189((InterfaceC5323) abstractC21063);
                        C17036 c17036 = new C17036();
                        c17036.f50376 = null;
                        c17036.f18924 = c185310.f55352;
                        c17036.f50377 = abstractC7257;
                        C4848 c48412 = c20395.f63043;
                        C18537 c185311 = this.f9430;
                        EnumC19998 enumC19998 = EnumC19998.f60712;
                        C8598 c8598M42156 = c185311.m42156(enumC19998, abstractC14356);
                        C3088 c3088M27497 = this.f9432.m27497(c8598M42156, enumC19998, abstractC14356.f18925);
                        c8598M42156.f5602 = c3088M27497;
                        c3088M27497.f20406.mo14787();
                        c8598M42156.f18925 = c22004.f69151;
                        C18537 c185312 = this.f9430;
                        C9661 c9661M42157 = c185312.m42157((AbstractC7783) c13819);
                        Integer numValueOf = Integer.valueOf(i3 + 1);
                        C24552 c24552M42189 = this.f9430.m42187(c9263.mo5577(), numValueOf);
                        c24552M42189.f18925 = c9263.mo5576(numValueOf);
                        C22403 c22403M42184 = c185312.m42184((AbstractC14355) c9661M42157, (AbstractC14355) c24552M42189);
                        c22403M42184.f18925 = c9263;
                        C4848 c4848M10290 = c48412.m10290(c185311.m42141(c8598M42156, c185312.m42145(0L, C4848.m10277of((Object) c185312.m42196(c22403M42184), (Object) c17036)), (AbstractC13154) null));
                        c20395.f63043 = c4848M10290;
                        c20395.f63043 = c4848M10290.m10292(this.f9436.mo32804(c20395.f18924));
                        this.f9434 = c138111;
                        this.f9436.mo32807();
                    } catch (Throwable th) {
                        this.f9434 = c138111;
                        this.f9436.mo32807();
                        throw th;
                    }
                }
                c20271 = new C20271();
                z4 = z4;
                i3 = i3;
                for (AbstractC21062 abstractC21064 : c20395.f63044) {
                    if (abstractC21064.m16617(EnumC19998.f60740)) {
                        c20271.m45777(abstractC21064);
                        z4 = true;
                        c20391 = c20394;
                    } else {
                        if (z || z4) {
                            c20391 = c20394;
                        } else {
                            c20391 = c20394;
                            if (c20395 == c20391 && abstractC21064.mo32949()) {
                                c20271.m45777(this.f9430.m42185());
                            }
                        }
                        if (abstractC21064.m47512()) {
                            i2 = i3;
                            i3 = -1;
                        } else {
                            i2 = i3 + 1;
                        }
                        c20271.m45777(this.f9430.m42186(Integer.valueOf(i3)));
                        i3 = i2;
                    }
                    c20394 = c20391;
                }
                C20391 c20396 = c20394;
                c20395.f63044 = c20271.m45783();
                if (c20395.f63046 == EnumC8690.STATEMENT) {
                    z3 = c20395.f63045;
                } else {
                    C18537 c185313 = this.f9430;
                    c185313.f55352 = C9268.m21433((AbstractC7257) c20395.f63043.last());
                    C6309 c6309M42149 = c185313.m42149((AbstractC12224) null);
                    c6309M42149.f16360 = abstractC7257;
                    c20395.f63043 = c20395.f63043.m10286(c6309M42149);
                    z3 = false;
                }
                it2 = it;
                c20394 = c20396;
                c138110 = c138110;
                c20274 = c20274;
                c22004 = c22004;
            } else {
                it = it2;
            }
            i = 1;
            if (c48411.m10289() == i) {
                c20395.f63043 = m54183(c20395.f63043);
            } else {
                c20395.f63043 = m54183(c20395.f63043);
            }
            c20271 = new C20271();
            z4 = z4;
            i3 = i3;
            while (r4.hasNext()) {
                if (abstractC21064.m16617(EnumC19998.f60740)) {
                    c20271.m45777(abstractC21064);
                    z4 = true;
                    c20391 = c20394;
                } else if (z) {
                    c20391 = c20394;
                    if (abstractC21064.m47512()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c20271.m45777(this.f9430.m42186(Integer.valueOf(i3)));
                    i3 = i2;
                } else {
                    c20391 = c20394;
                    if (abstractC21064.m47512()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c20271.m45777(this.f9430.m42186(Integer.valueOf(i3)));
                    i3 = i2;
                }
                c20394 = c20391;
            }
            C20391 c20397 = c20394;
            c20395.f63044 = c20271.m45783();
            if (c20395.f63046 == EnumC8690.STATEMENT) {
                z3 = c20395.f63045;
            } else {
                C18537 c185314 = this.f9430;
                c185314.f55352 = C9268.m21433((AbstractC7257) c20395.f63043.last());
                C6309 c6309M421410 = c185314.m42149((AbstractC12224) null);
                c6309M421410.f16360 = abstractC7257;
                c20395.f63043 = c20395.f63043.m10286(c6309M421410);
                z3 = false;
            }
            it2 = it;
            c20394 = c20397;
            c138110 = c138110;
            c20274 = c20274;
            c22004 = c22004;
        }
        C20271 c20275 = c20274;
        if (abstractC7257.m16617(EnumC19998.f60782)) {
            C23882 c23882 = (C23882) abstractC7257;
            c23882.f75829 = c17175M42172;
            c23882.f75828 = c4848M45783;
            c20275.m45777(c23882);
            this.f77797 = this.f9430.m42145(0L, c20275.m45783());
            return;
        }
        C15164 c15164 = (C15164) abstractC7257;
        c15164.f43267 = c17175M42172;
        c15164.f43269 = c4848M45783;
        C5916 c5916M42205 = this.f9430.m42205((AbstractC14355) c15164, c20275.m45783());
        c5916M42205.f18925 = abstractC7257.f18925;
        c5916M42205.f14605 = true;
        this.f77797 = c5916M42205;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        this.f9436 = new C24333(this);
        try {
            super.mo3803(c11003);
            this.f77797 = this.f9436.mo32806(c11003);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        this.f9436 = new C24333(this);
        try {
            super.mo3800(c10332);
            this.f77797 = this.f9436.mo32806(c10332);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        this.f9436 = new C24333(this);
        try {
            super.mo3781(c3765);
            this.f77797 = this.f9436.mo32805(c3765);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        this.f9436 = new C24333(this);
        try {
            super.mo3810(c13685);
            this.f77797 = this.f9436.mo32805(c13685);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        this.f9436 = new C24333(this);
        try {
            super.mo3802(c10610);
            this.f77797 = this.f9436.mo32805(c10610);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        this.f9436 = new C24333(this);
        try {
            super.mo3834(c21732);
            this.f77797 = this.f9436.mo32805(c21732);
        } finally {
            this.f9436.mo32807();
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C5771 c5771 = this.f9437;
        try {
            this.f9437 = c10471.f28960;
            super.mo3801(c10471);
        } finally {
            this.f9437 = c5771;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        C13818 c13818Mo32808 = (c9661.f26611.mo18003() & 576460752303423488L) != 0 ? this.f9436.mo32808((C18511) c9661.f26611) : null;
        if (c13818Mo32808 == null) {
            super.mo3798(c9661);
            return;
        }
        C18537 c18537 = this.f9430;
        c18537.f55352 = c9661.f18924;
        this.f77797 = c18537.m42157((AbstractC7783) c13818Mo32808);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        C20271 c20271 = new C20271();
        this.f9436 = new C12264(this, c20271);
        C5771 c5771 = this.f9437;
        if (c5771 == null) {
            try {
                this.f9437 = new C5771(c4968.f11317 | 1048576, this.f9440.f21725, null, this.f9438);
            } finally {
                this.f9437 = c5771;
                this.f9436.mo32807();
            }
        }
        for (C4848 c4848 = c4968.f11316; c4848.m10293(); c4848 = c4848.f11035) {
            c20271.m45777((AbstractC13154) mo25569((AbstractC13154) c4848.f11034));
        }
        c4968.f11316 = c20271.m45783();
        this.f77797 = c4968;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        AbstractC15615 abstractC15615 = this.f9436;
        try {
            this.f9436 = new C9581(this);
            super.mo3619(c15834);
        } finally {
            this.f9436 = abstractC15615;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C15828 c15828 = this.f9438;
        C5771 c5771 = this.f9437;
        try {
            this.f9438 = c7650.f20027;
            this.f9437 = null;
            super.mo3617(c7650);
        } finally {
            this.f9438 = c15828;
            this.f9437 = c5771;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C5771 c5771 = this.f9437;
        try {
            c11281.f31435 = (C4436) mo25569(c11281.f31435);
            c11281.f31437 = (AbstractC14355) mo25569(c11281.f31437);
            if (this.f9437 == null) {
                this.f9437 = new C5771((c11281.f31435.f9954 & 8) | 1048576, this.f9440.f21725, null, this.f9438);
            }
            AbstractC14355 abstractC14355 = c11281.f31436;
            if (abstractC14355 != null) {
                c11281.f31436 = (AbstractC14355) mo25569(abstractC14355);
            }
            this.f77797 = c11281;
        } finally {
            this.f9437 = c5771;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m8650(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        try {
            this.f9430 = c18537;
            this.f9441 = c4036;
            mo25569(abstractC7257);
            return abstractC7257;
        } finally {
            this.f9430 = null;
            this.f9441 = null;
        }
    }

    public C4257(C5127 c5127) {
        c5127.m10908(f9427, this);
        this.f9428 = C22004.m49577(c5127);
        this.f9433 = C11216.m25910(c5127);
        this.f9435 = C23663.m52629(c5127);
        this.f9430 = C18537.m42139(c5127);
        this.f9439 = C8374.m19396(c5127);
        this.f9432 = C12004.m27492(c5127);
        this.f9440 = C8200.m18988(c5127);
        this.f9429 = EnumC12720.m29246(c5127);
        this.f9431 = C24387.m53737(c5127);
        C13565.m30871(c5127).m30879("debug.patterns");
    }
}
