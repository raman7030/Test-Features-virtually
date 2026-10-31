package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17419 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f53278 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f53279;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        boolean z = true;
        switch (C11070.f33247[abstractC4308.mo3258().ordinal()]) {
            case 3:
                return Boolean.valueOf(!abstractC4309.m12913(EnumC9454.CHAR) && abstractC4308.mo3258().m24299(abstractC4309.mo3258()));
            case 4:
                return Boolean.valueOf(!abstractC4309.m12913(EnumC9454.SHORT) && abstractC4308.mo3258().m24299(abstractC4309.mo3258()));
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC4308.mo3258().m24299(abstractC4309.mo3258()));
            case 10:
            case 11:
                return Boolean.valueOf(abstractC4308.m12913(abstractC4309.mo3258()));
            case 12:
                return Boolean.valueOf(this.f53279.m17546(abstractC4308.mo12939(), abstractC4309, false));
            case 13:
                if (!abstractC4309.m12913(EnumC9454.BOT) && !abstractC4309.m12913(EnumC9454.CLASS) && !abstractC4309.m12913(EnumC9454.ARRAY) && !abstractC4309.m12913(EnumC9454.TYPEVAR)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
            case 15:
                return Boolean.FALSE;
            default:
                throw new AssertionError("isSubtype " + abstractC4308.mo3258());
        }
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (c0779 == abstractC4308 || c0779.f14167 == abstractC4308 || abstractC4308.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.UNKNOWN)) {
            return Boolean.TRUE;
        }
        if (abstractC4308.m12913(EnumC9454.BOT)) {
            return Boolean.FALSE;
        }
        c0779.m2967(EnumC19125.f60272, abstractC4308, this.f53279);
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        boolean zM12913 = abstractC4308.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f53279;
        if (zM12913) {
            if (c5138.f16077.mo12941()) {
                return Boolean.valueOf(c6319.m17550(c5138.f16077, c6319.m17515(abstractC4308)));
            }
            return Boolean.valueOf(c6319.m17546(c5138.f16077, c6319.m17515(abstractC4308), false));
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            AbstractC10370 abstractC10370Mo16076 = abstractC4308.f13890.mo16076();
            C6136 c6136 = c6319.f19600;
            return Boolean.valueOf(abstractC10370Mo16076 == c6136.f18887 || abstractC10370Mo16076 == c6136.f18895 || abstractC10370Mo16076 == c6136.f18786);
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        boolean zM17502;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        C6319 c6319 = this.f53279;
        AbstractC4308 abstractC4308M17527 = c6319.m17527(abstractC19810, c19955);
        if (abstractC4308M17527 == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (!abstractC4308M17527.m12913(EnumC9454.CLASS)) {
            return Boolean.valueOf(c6319.m17546(abstractC4308M17527, abstractC4308, false));
        }
        if (abstractC4308M17527.f13890 == abstractC4308.f13890) {
            if (!abstractC4308.mo12917()) {
                if (c6319.m17546(abstractC4308M17527.mo4958(), abstractC4308.mo4958(), false)) {
                    z = true;
                }
            } else {
                C8436 c8436 = new C8436(abstractC4308, abstractC4308M17527, c6319);
                HashSet hashSet = this.f53278;
                if (hashSet.add(c8436)) {
                    try {
                        zM17502 = c6319.m17502(abstractC4308.mo12938(), abstractC4308M17527.mo12938());
                        hashSet.remove(c8436);
                    } catch (Throwable th) {
                        hashSet.remove(c8436);
                        throw th;
                    }
                } else {
                    zM17502 = c6319.m17502(abstractC4308.mo12938(), m40764(abstractC4308M17527).mo12938());
                }
                if (zM17502) {
                    if (c6319.m17546(abstractC4308M17527.mo4958(), abstractC4308.mo4958(), false)) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m40764(AbstractC4308 abstractC4308) {
        C19831 c19831;
        C6319 c6319 = this.f53279;
        C20661 c20661 = c6319.f19609;
        if (!abstractC4308.mo12917()) {
            return abstractC4308;
        }
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        try {
            c6319.m17500(abstractC4308.f13890.f17560, abstractC4308, c18837, c18838);
            if (c18837.isEmpty()) {
                return abstractC4308;
            }
            C18837 c18839 = new C18837();
            boolean z = false;
            for (AbstractC4308 abstractC4309 : c18838.m43517()) {
                AbstractC4308 abstractC4308M40764 = m40764(abstractC4309);
                if (abstractC4308M40764.mo12924() && !abstractC4308M40764.mo12922()) {
                    c19831 = new C19831(c20661.f66526, EnumC15678.UNBOUND, c20661.f66480, null, abstractC4308M40764.f13889);
                } else {
                    if (abstractC4308M40764 != abstractC4309) {
                        c19831 = new C19831(c6319.m17511(abstractC4308M40764), EnumC15678.EXTENDS, c20661.f66480, null, abstractC4308M40764.f13889);
                    }
                    c18839.m43511(abstractC4308M40764);
                }
                abstractC4308M40764 = c19831;
                z = true;
                c18839.m43511(abstractC4308M40764);
            }
            return z ? c6319.m17488(abstractC4308.f13890.f17560, c18837.m43517(), c18839.m43517()) : abstractC4308;
        } catch (C8953 e) {
            throw new AssertionError(e);
        }
    }

    public C17419(C6319 c6319) {
        this.f53279 = c6319;
    }
}
