package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C1987 extends C23363 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C4314 f6647 = new C4314();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20661 f6648;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC10892 f6649;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C17013 f6650;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23168 f6651;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10139 f6652;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f6653;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22406 f6655;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6319 f6659;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6136 f6660;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1755 f6661;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC13938 f6656 = new C12528();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14163 f6658 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3581 f6657 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12048 f6654 = null;

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC8090 m6502(C1987 c1987, AbstractC4308 abstractC4308, AbstractC19669 abstractC19669) {
        AbstractC4308 abstractC4309;
        C6319 c6319 = c1987.f6659;
        if (abstractC19669.mo30872()) {
            AbstractC4308 abstractC4308M17519 = c6319.m17519(C7260.m19457((AbstractC21932) abstractC19669).m25340());
            if (abstractC4308M17519.mo12941()) {
                abstractC4309 = abstractC4308M17519;
                abstractC4309 = c6319.m17496(abstractC4308M17519).f17560;
            }
            abstractC4309 = abstractC4308M17519;
            return c6319.m17546(abstractC4308, abstractC4309, true) ? (InterfaceC8090) abstractC4308 : (InterfaceC8090) abstractC4309;
        }
        if (!abstractC19669.mo30871() || C7260.m19429((AbstractC12612) abstractC19669)) {
            return null;
        }
        AbstractC4308 abstractC43010 = abstractC19669.f16086;
        if ((abstractC43010.f13890.f17563 & 16384) != 0) {
            return C5268.m15194(((C7673) abstractC19669).f23696.toString());
        }
        C12171.m29637(abstractC43010.mo12915());
        int i = C6178.f18975[abstractC19669.f16086.mo3258().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C5268.m15193(((Integer) abstractC19669.f16086.mo12915()).intValue());
        }
        if (i == 5) {
            return C5268.m15194((String) abstractC19669.f16086.mo12915());
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1987 m6500(C2903 c2903) {
        C1987 c1987 = (C1987) c2903.m8838(f6647);
        return c1987 == null ? new C1987(c2903) : c1987;
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
    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC4308 abstractC4308;
        if (c16286.f50076 instanceof AbstractC21932) {
            boolean zM12913 = c16286.f50075.f16086.m12913(EnumC9454.BOT);
            C20661 c20661 = this.f6648;
            if (zM12913) {
                abstractC4308 = c20661.f66526;
            } else {
                abstractC4308 = c16286.f50075.f16086;
            }
            AbstractC4308 abstractC4309 = abstractC4308;
            C12048 c12048 = this.f6654;
            this.f6656 = new C23111(this);
            try {
                AbstractC12612 abstractC12612 = (AbstractC12612) mo23617(c16286.f50075);
                AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC12612);
                if (abstractC5698M19472 != null && abstractC5698M19472.f17559 == EnumC1296.f4567 && abstractC5698M19472.f17561.f17559.m4391(C15406.f47185)) {
                    this.f6654 = (C12048) abstractC5698M19472;
                } else {
                    this.f6654 = new C12048(4112L, this.f6660.f18880.m30652("patt" + c16286.f16085 + this.f6649.m27204() + "temp"), abstractC4309, this.f6657);
                }
                AbstractC21932 abstractC21932 = (AbstractC21932) c16286.f50076;
                C6319 c6319 = this.f6659;
                AbstractC4308 abstractC4308M17519 = c6319.m17519(C7260.m19457(abstractC21932).m25340());
                if (abstractC4308M17519.mo12941()) {
                    abstractC4308M17519 = c6319.m17496(abstractC4308M17519).f17560;
                }
                EnumC18550 enumC18550 = EnumC18550.f57565;
                C7673 c7673M39914 = this.f6650.m39914((AbstractC5698) this.f6654);
                AbstractC12612 abstractC12612M39965 = this.f6650.m39965(abstractC4308M17519);
                C17013 c17013 = this.f6650;
                c17013.getClass();
                C16286 c16287 = new C16286();
                c16287.f50075 = c7673M39914;
                c16287.f50076 = abstractC12612M39965;
                c16287.f16085 = c17013.f52172;
                c16287.f16086 = c20661.f66469;
                AbstractC12612 abstractC12613 = (AbstractC12612) mo23617(c16286.f50076);
                C9085 c9085M39919 = this.f6650.m39919(enumC18550, (AbstractC12612) c16287, abstractC12613);
                C0758 c0758M25477 = this.f6652.m25477(c9085M39919, enumC18550, c16287.f16086, abstractC12613.f16086);
                c9085M39919.f2830 = c0758M25477;
                c9085M39919.f16086 = c0758M25477.f17560.mo12923();
                C12048 c12049 = this.f6654;
                AbstractC12612 abstractC12614 = c9085M39919;
                if (c12049 != abstractC5698M19472) {
                    C17013 c17014 = this.f6650;
                    c17014.f52172 = c16286.f16085;
                    C3733 c3733M39905 = c17014.m39905(c17014.m39923(c12049, abstractC12612), (AbstractC12612) c9085M39919);
                    c3733M39905.f16086 = c20661.f66469;
                    c3733M39905.f11798 = true;
                    abstractC12614 = c3733M39905;
                }
                this.f75051 = this.f6656.mo30734(abstractC12614);
                return;
            } finally {
                this.f6654 = c12048;
                this.f6656.mo30735();
            }
        }
        super.mo1410(c16286);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        C16986 c16986 = (C16986) c16139.f49721.f28489;
        AbstractC4308 abstractC4308M25340 = C7260.m19457((AbstractC21932) c16139).m25340();
        C6319 c6319 = this.f6659;
        AbstractC4308 abstractC4308M17519 = c6319.m17519(abstractC4308M25340);
        if (abstractC4308M17519.mo12941()) {
            abstractC4308M17519 = c6319.m17496(abstractC4308M17519).f17560;
        }
        C12048 c12048Mo20342 = this.f6656.mo20342(c16986);
        if (c12048Mo20342 != null) {
            C17013 c17013 = this.f6650;
            c17013.f52172 = C7260.m19455(c16139);
            C7673 c7673M39914 = this.f6650.m39914((AbstractC5698) c12048Mo20342);
            C7673 c7673M39915 = this.f6650.m39914((AbstractC5698) this.f6654);
            C17013 c17014 = this.f6650;
            c17014.m39946((InterfaceC3109) c7673M39915);
            C17844 c17844M39936 = c17014.m39936((AbstractC5144) this.f6650.m39965(abstractC4308M17519), (AbstractC12612) c7673M39915);
            c17844M39936.f16086 = abstractC4308M17519;
            C21080 c21080M39941 = c17013.m39941((AbstractC12612) c7673M39914, (AbstractC12612) c17844M39936);
            c21080M39941.f16086 = c12048Mo20342.mo16091(c6319);
            C17013 c17015 = this.f6650;
            C3733 c3733M39962 = c17015.m39962((AbstractC12612) this.f6650.m39943(Boolean.TRUE), C2609.of((Object) c17015.m39953(c21080M39941)));
            c3733M39962.f11798 = true;
            c3733M39962.f16086 = this.f6648.f66469;
            this.f75051 = c3733M39962;
            return;
        }
        this.f75051 = this.f6650.m39943(Boolean.TRUE);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1424(C21227 c21227) {
        this.f75051 = mo23617(c21227.f68420);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo23617(c14022.f42404);
        AbstractC12612 abstractC12613 = (AbstractC12612) mo23617(c14022.f42403);
        EnumC18550 enumC18550 = EnumC18550.f57565;
        C9085 c9085M39919 = this.f6650.m39919(enumC18550, abstractC12612, abstractC12613);
        C0758 c0758M25477 = this.f6652.m25477(c9085M39919, enumC18550, abstractC12612.f16086, abstractC12613.f16086);
        c9085M39919.f2830 = c0758M25477;
        c9085M39919.f16086 = c0758M25477.f17560.mo12923();
        this.f75051 = c9085M39919;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m6503(c22637, c22637.f73103, c22637.f73102, c22637.f73105, c22637.f73104);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m6503(c13464, c13464.f40197, c13464.f40199, c13464.f40196, c13464.f40195);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6503(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, boolean z, boolean z2) {
        Iterator it;
        int i;
        C18837 c18837;
        C18963 c18963;
        int i2;
        if (!z2) {
            if (abstractC5144.m14709(EnumC18550.f57558)) {
                super.mo1426((C22637) abstractC5144);
                return;
            } else {
                super.mo1401((C13464) abstractC5144);
                return;
            }
        }
        boolean zM12913 = abstractC12612.f16086.m12913(EnumC9454.BOT);
        C20661 c20661 = this.f6648;
        final AbstractC4308 abstractC4308 = zM12913 ? c20661.f66526 : abstractC12612.f16086;
        C23168 c23168 = this.f6651;
        C12171.m29642(c23168.m51347());
        C12171.m29642(c23168.m51348(this.f6661.f6075.f4745));
        C18837 c18838 = new C18837();
        for (C2609 c26010 = c2609; c26010.m8249(); c26010 = c26010.f8241) {
            if (((C18963) c26010.f8240).f59814.isEmpty() && c26010.f8241.m8249()) {
                C18963 c18964 = (C18963) c26010.f8241.f8240;
                c18964.f59815 = c18964.f59815.m8248(((C18963) c26010.f8240).f59815);
            } else {
                c18838.m43511((C18963) c26010.f8240);
            }
        }
        C2609 c2609M43517 = c18838.m43517();
        C18837 c18839 = new C18837();
        StringBuilder sb = new StringBuilder("selector");
        sb.append(abstractC5144.f16085);
        EnumC10892 enumC10892 = this.f6649;
        sb.append(enumC10892.m27204());
        sb.append("temp");
        String string = sb.toString();
        C6136 c6136 = this.f6660;
        C12048 c12048 = new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c6136.f18880.m30652(string), abstractC4308, this.f6657);
        boolean zAnyMatch = C5378.stream(c2609M43517).flatMap(new C1775(8)).anyMatch(new C3356());
        C18963 c18965 = (C18963) c2609M43517.last();
        if (z && !zAnyMatch && C5378.stream(c2609M43517).flatMap(new C4563(12)).noneMatch(new C3152(2))) {
            C2609 c26011 = c18965.f59815;
            AbstractC4308 abstractC4309 = c20661.f66522;
            C23342 c23342M39944 = this.f6650.m39944(abstractC4309.mo3258(), (Object) null);
            c23342M39944.f16086 = abstractC4309;
            c18965.f59815 = c26011.m8246(c23342M39944);
            zAnyMatch = true;
        }
        AbstractC12612 abstractC12612M23939 = (AbstractC12612) mo23617(abstractC12612);
        C17013 c17013 = this.f6650;
        c17013.f52172 = abstractC5144.f16085;
        if (!zAnyMatch) {
            abstractC12612M23939 = this.f6653.m23939(abstractC12612M23939);
        }
        c18839.m43511(c17013.m39923(c12048, abstractC12612M23939));
        AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652((enumC10892.m27204() + abstractC5144.f16085) + "index");
        C7254 c7254 = c20661.f66452;
        AbstractC4308 abstractC43010 = c20661.f66526;
        AbstractC4308 abstractC43011 = c20661.f66514;
        C7254 c7255 = c20661.f66452;
        C12048 c12049 = new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC10370M30652, c7254, this.f6657);
        C17013 c17014 = this.f6650;
        c17014.f52172 = abstractC5144.f16085;
        C23342 c23342M39945 = this.f6650.m39944(c7255.mo3258(), (Object) 0);
        c23342M39945.f16086 = c7255.mo3257((Object) 0);
        c18839.m43511(c17014.m39923(c12049, c23342M39945));
        C18963 c18966 = c18965;
        C2609 c2609M8236 = C2609.m8236(c20661.f66478, c20661.f66533, c20661.f66455, this.f6659.m17478(new C19955(abstractC43011.f13890, abstractC43011.mo4958(), C2609.of((Object) new C19831(abstractC43010, EnumC15678.UNBOUND, c20661.f66480)))));
        InterfaceC8090[] interfaceC8090Arr = (InterfaceC8090[]) C5378.stream(c2609M43517).flatMap(new C5894(6)).map(new Function() { // from class: l.۬ܽ۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C1987.m6502(this.f39612, abstractC4308, (AbstractC19669) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).filter(new C9037(1)).toArray(new C11457(1));
        boolean zM16090 = abstractC4308.f13890.m16090();
        AbstractC10370 abstractC10370 = zM16090 ? c6136.f18875 : c6136.f18787;
        C12048 c120410 = c12048;
        C18837 c188310 = c18839;
        C3581 c3581M50300 = this.f6655.m50300(abstractC5144, this.f6661, c20661.f66524, abstractC10370, c2609M8236, C2609.m8239());
        C9226 c9226 = new C9226(abstractC10370, c20661.f66475, c3581M50300.mo10967(), new C10658(C2609.of((Object) (zM16090 ? abstractC4308 : abstractC43010), (Object) c7255), c7255, C2609.m8239(), c20661.f66481), interfaceC8090Arr);
        C17013 c17015 = this.f6650;
        C6262 c6262M39912 = c17015.m39912(c17015.m39954(c3581M50300.f17561), c9226.f17562);
        c6262M39912.f19396 = c9226;
        c6262M39912.f16086 = c7255;
        C15580 c15580M39929 = this.f6650.m39929(c6262M39912, C2609.m8239(), C2609.of((Object) this.f6650.m39914((AbstractC5698) c120410), (Object) this.f6650.m39914((AbstractC5698) c12049)));
        c15580M39929.f16086 = c7255;
        Iterator it2 = c2609M43517.iterator();
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (it2.hasNext()) {
            C18963 c18967 = (C18963) it2.next();
            C2609 c26012 = c18967.f59815;
            if (c26012.m8245() > 1) {
                it = it2;
                if (C5378.stream(c18967.f59815).anyMatch(new C23461(3))) {
                    i = 1;
                    c26012 = (C2609) C5378.stream(c18967.f59815).filter(new C9239(i)).collect(C2609.m8240());
                }
                if (c26012.m8245() == i || !((AbstractC19669) c26012.f8240).mo30872() || z3) {
                    c18967.f59814 = m51786(c18967.f59814);
                } else {
                    AbstractC19669 abstractC19669 = (AbstractC19669) c26012.f8240;
                    this.f6656 = new C23111(this);
                    C12048 c120411 = this.f6654;
                    try {
                        this.f6654 = c120410;
                        AbstractC12612 abstractC12613 = (AbstractC12612) mo23617(abstractC19669);
                        c18967.f59814 = m51786(c18967.f59814);
                        C17013 c17016 = this.f6650;
                        AbstractC19669 abstractC196610 = (AbstractC19669) c26012.f8240;
                        abstractC196610.getClass();
                        c17016.m39946((InterfaceC3109) abstractC196610);
                        C15433 c15433 = new C15433();
                        c15433.f47247 = null;
                        c15433.f16085 = c17016.f52172;
                        c15433.f47248 = abstractC5144;
                        C2609 c26013 = c18967.f59814;
                        C17013 c17017 = this.f6650;
                        EnumC18550 enumC18550 = EnumC18550.f57488;
                        C6555 c6555M39913 = c17017.m39913(enumC18550, abstractC12613);
                        C0758 c0758M25478 = this.f6652.m25478(c6555M39913, enumC18550, abstractC12613.f16086);
                        c6555M39913.f2830 = c0758M25478;
                        c0758M25478.f17560.mo12923();
                        c6555M39913.f16086 = c20661.f66469;
                        C17013 c17018 = this.f6650;
                        C7673 c7673M39914 = c17018.m39914((AbstractC5698) c12049);
                        Integer numValueOf = Integer.valueOf(i3 + 1);
                        C23342 c23342M39946 = this.f6650.m39944(c7255.mo3258(), numValueOf);
                        c23342M39946.f16086 = c7255.mo3257(numValueOf);
                        C21080 c21080M39941 = c17018.m39941((AbstractC12612) c7673M39914, (AbstractC12612) c23342M39946);
                        c21080M39941.f16086 = c7255;
                        C2609 c2609M8246 = c26013.m8246(c17017.m39898(c6555M39913, c17018.m39902(0L, C2609.of((Object) c17018.m39953(c21080M39941), (Object) c15433)), (AbstractC11349) null));
                        c18967.f59814 = c2609M8246;
                        c18967.f59814 = c2609M8246.m8248(this.f6656.mo30732(c18967.f16085));
                        this.f6654 = c120411;
                        this.f6656.mo30735();
                    } catch (Throwable th) {
                        this.f6654 = c120411;
                        this.f6656.mo30735();
                        throw th;
                    }
                }
                c18837 = new C18837();
                z4 = z4;
                i3 = i3;
                for (AbstractC19669 abstractC196611 : c18967.f59815) {
                    if (abstractC196611.m14709(EnumC18550.f57516)) {
                        c18837.m43511(abstractC196611);
                        z4 = true;
                        c18963 = c18966;
                    } else {
                        if (z || z4) {
                            c18963 = c18966;
                        } else {
                            c18963 = c18966;
                            if (c18967 == c18963 && abstractC196611.mo30872()) {
                                c18837.m43511(this.f6650.m39942());
                            }
                        }
                        if (abstractC196611.m45215()) {
                            i2 = i3;
                            i3 = -1;
                        } else {
                            i2 = i3 + 1;
                        }
                        c18837.m43511(this.f6650.m39943(Integer.valueOf(i3)));
                        i3 = i2;
                    }
                    c18966 = c18963;
                }
                C18963 c18968 = c18966;
                c18967.f59815 = c18837.m43517();
                if (c18967.f59817 == EnumC6652.STATEMENT) {
                    z3 = c18967.f59816;
                } else {
                    C17013 c17019 = this.f6650;
                    c17019.f52172 = C7260.m19467((AbstractC5144) c18967.f59814.last());
                    C4146 c4146M39906 = c17019.m39906((AbstractC10370) null);
                    c4146M39906.f13546 = abstractC5144;
                    c18967.f59814 = c18967.f59814.m8242(c4146M39906);
                    z3 = false;
                }
                it2 = it;
                c18966 = c18968;
                c120410 = c120410;
                c188310 = c188310;
                c20661 = c20661;
            } else {
                it = it2;
            }
            i = 1;
            if (c26012.m8245() == i) {
                c18967.f59814 = m51786(c18967.f59814);
            } else {
                c18967.f59814 = m51786(c18967.f59814);
            }
            c18837 = new C18837();
            z4 = z4;
            i3 = i3;
            while (r4.hasNext()) {
                if (abstractC196611.m14709(EnumC18550.f57516)) {
                    c18837.m43511(abstractC196611);
                    z4 = true;
                    c18963 = c18966;
                } else if (z) {
                    c18963 = c18966;
                    if (abstractC196611.m45215()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c18837.m43511(this.f6650.m39943(Integer.valueOf(i3)));
                    i3 = i2;
                } else {
                    c18963 = c18966;
                    if (abstractC196611.m45215()) {
                        i2 = i3;
                        i3 = -1;
                    } else {
                        i2 = i3 + 1;
                    }
                    c18837.m43511(this.f6650.m39943(Integer.valueOf(i3)));
                    i3 = i2;
                }
                c18966 = c18963;
            }
            C18963 c18969 = c18966;
            c18967.f59815 = c18837.m43517();
            if (c18967.f59817 == EnumC6652.STATEMENT) {
                z3 = c18967.f59816;
            } else {
                C17013 c170110 = this.f6650;
                c170110.f52172 = C7260.m19467((AbstractC5144) c18967.f59814.last());
                C4146 c4146M39907 = c170110.m39906((AbstractC10370) null);
                c4146M39907.f13546 = abstractC5144;
                c18967.f59814 = c18967.f59814.m8242(c4146M39907);
                z3 = false;
            }
            it2 = it;
            c18966 = c18969;
            c120410 = c120410;
            c188310 = c188310;
            c20661 = c20661;
        }
        C18837 c188311 = c188310;
        if (abstractC5144.m14709(EnumC18550.f57558)) {
            C22637 c22637 = (C22637) abstractC5144;
            c22637.f73103 = c15580M39929;
            c22637.f73102 = c2609M43517;
            c188311.m43511(c22637);
            this.f75051 = this.f6650.m39902(0L, c188311.m43517());
            return;
        }
        C13464 c13464 = (C13464) abstractC5144;
        c13464.f40197 = c15580M39929;
        c13464.f40199 = c2609M43517;
        C3733 c3733M39962 = this.f6650.m39962((AbstractC12612) c13464, c188311.m43517());
        c3733M39962.f16086 = abstractC5144.f16086;
        c3733M39962.f11798 = true;
        this.f75051 = c3733M39962;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        this.f6656 = new C23111(this);
        try {
            super.mo1390(c9085);
            this.f75051 = this.f6656.mo30734(c9085);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        this.f6656 = new C23111(this);
        try {
            super.mo1387(c8379);
            this.f75051 = this.f6656.mo30734(c8379);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        this.f6656 = new C23111(this);
        try {
            super.mo1368(c1470);
            this.f75051 = this.f6656.mo30733(c1470);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        this.f6656 = new C23111(this);
        try {
            super.mo1397(c11907);
            this.f75051 = this.f6656.mo30733(c11907);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        this.f6656 = new C23111(this);
        try {
            super.mo1389(c8672);
            this.f75051 = this.f6656.mo30733(c8672);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        this.f6656 = new C23111(this);
        try {
            super.mo1421(c20374);
            this.f75051 = this.f6656.mo30733(c20374);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C3581 c3581 = this.f6657;
        try {
            this.f6657 = c8526.f26045;
            super.mo1388(c8526);
        } finally {
            this.f6657 = c3581;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        C12048 c12048Mo30736 = (c7673.f23697.mo16084() & 576460752303423488L) != 0 ? this.f6656.mo30736((C16986) c7673.f23697) : null;
        if (c12048Mo30736 == null) {
            super.mo1385(c7673);
            return;
        }
        C17013 c17013 = this.f6650;
        c17013.f52172 = c7673.f16085;
        this.f75051 = c17013.m39914((AbstractC5698) c12048Mo30736);
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C18837 c18837 = new C18837();
        this.f6656 = new C10412(this, c18837);
        C3581 c3581 = this.f6657;
        if (c3581 == null) {
            try {
                this.f6657 = new C3581(c2735.f8522 | 1048576, this.f6660.f18867, null, this.f6658);
            } finally {
                this.f6657 = c3581;
                this.f6656.mo30735();
            }
        }
        for (C2609 c2609 = c2735.f8521; c2609.m8249(); c2609 = c2609.f8241) {
            c18837.m43511((AbstractC11349) mo23617((AbstractC11349) c2609.f8240));
        }
        c2735.f8521 = c18837.m43517();
        this.f75051 = c2735;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        AbstractC13938 abstractC13938 = this.f6656;
        try {
            this.f6656 = new C7589(this);
            super.mo1217(c14169);
        } finally {
            this.f6656 = abstractC13938;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C14163 c14163 = this.f6658;
        C3581 c3581 = this.f6657;
        try {
            this.f6658 = c5557.f17186;
            this.f6657 = null;
            super.mo1215(c5557);
        } finally {
            this.f6658 = c14163;
            this.f6657 = c3581;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C3581 c3581 = this.f6657;
        try {
            c9378.f28486 = (C2176) mo23617(c9378.f28486);
            c9378.f28488 = (AbstractC12612) mo23617(c9378.f28488);
            if (this.f6657 == null) {
                this.f6657 = new C3581((c9378.f28486.f7169 & 8) | 1048576, this.f6660.f18867, null, this.f6658);
            }
            AbstractC12612 abstractC12612 = c9378.f28487;
            if (abstractC12612 != null) {
                c9378.f28487 = (AbstractC12612) mo23617(abstractC12612);
            }
            this.f75051 = c9378;
        } finally {
            this.f6657 = c3581;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m6508(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        try {
            this.f6650 = c17013;
            this.f6661 = c1755;
            mo23617(abstractC5144);
            return abstractC5144;
        } finally {
            this.f6650 = null;
            this.f6661 = null;
        }
    }

    public C1987(C2903 c2903) {
        c2903.m8841(f6647, this);
        this.f6648 = C20661.m47250(c2903);
        this.f6653 = C9310.m23901(c2903);
        this.f6655 = C22406.m50289(c2903);
        this.f6650 = C17013.m39896(c2903);
        this.f6659 = C6319.m17456(c2903);
        this.f6652 = C10139.m25473(c2903);
        this.f6660 = C6136.m17057(c2903);
        this.f6649 = EnumC10892.m27201(c2903);
        this.f6651 = C23168.m51341(c2903);
        C11781.m28823(c2903).m28831("debug.patterns");
    }
}
