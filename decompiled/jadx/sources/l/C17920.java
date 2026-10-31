package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17920 extends C14190 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17214 f54733;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f54734;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f54731 = C2609.m8239();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54732 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14169 f54730 = null;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        this.f54731 = this.f54731.m8246(c18257);
        m41915(c18257, c18257, c18257.f56778);
        m41917();
        super.mo1416(c18257);
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        this.f54731 = this.f54731.m8246(abstractC5144);
        try {
            super.mo10758(abstractC5144);
        } finally {
            m41917();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41917() {
        C2609 c2609 = this.f54731;
        this.f54731 = c2609.f8241;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        m41915(c14315, (AbstractC5144) this.f54731.f8241.f8240, c14315.f43168);
        super.mo1403(c14315);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41914(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C9953 c9953) {
        C17214 c17214;
        C2609 c2609Mo16068 = abstractC5698.mo16068();
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        C18837 c18839 = new C18837();
        Iterator it = c2609Mo16068.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c17214 = this.f54733;
            if (!zHasNext) {
                break;
            }
            C16384 c16384 = (C16384) it.next();
            EnumC1692 enumC1692M40508 = c17214.m40508(c16384, abstractC5698);
            C2609 c2609 = c16384.f50417;
            AbstractC4308 abstractC4309 = c16384.f26338;
            int iOrdinal = enumC1692M40508.ordinal();
            if (iOrdinal == 0) {
                c18837.m43511(c16384);
            } else if (iOrdinal == 1) {
                C6507 c6507 = new C6507(abstractC4309, c2609, c9953);
                c18838.m43511(c6507);
                c18839.m43511(c6507);
            } else if (iOrdinal == 3) {
                c18837.m43511(c16384);
                c18838.m43511(new C6507(abstractC4309, c2609, c9953));
            }
        }
        if (c18838.isEmpty()) {
            return;
        }
        abstractC5698.m16104();
        abstractC5698.m16086(c18837.m43517());
        C2609 c2609M43517 = c18838.m43517();
        if (abstractC4308 == null) {
            m41910(abstractC5144, abstractC5698.mo7176().f17560, c2609M43517, c2609M43517, c9953);
            abstractC5698.m16097(c2609M43517);
            return;
        }
        AbstractC4308 abstractC4308M41910 = m41910(abstractC5144, abstractC4308, c2609M43517, c18839.m43517(), c9953);
        if (abstractC5698.mo952() == EnumC23258.METHOD) {
            abstractC5698.f17560.mo12945().f32060 = abstractC4308M41910;
        } else if (abstractC5698.mo952() == EnumC23258.PARAMETER && this.f54730 == null) {
            abstractC5698.f17560 = abstractC4308M41910;
            if (abstractC5698.mo16076().equals(c17214.f52817.f18886)) {
                abstractC5698.f17561.f17560.mo12945().f32058 = abstractC4308M41910;
            } else {
                C10658 c10658Mo12945 = abstractC5698.f17561.f17560.mo12945();
                C2609 c26010 = c10658Mo12945.f32059;
                C18837 c188310 = new C18837();
                for (C2609 c26011 = ((C3581) abstractC5698.f17561).f11367; c26011.m8249(); c26011 = c26011.f8241) {
                    if (c26011.f8240 == abstractC5698) {
                        c188310.m43511(abstractC4308M41910);
                    } else {
                        c188310.m43511((AbstractC4308) c26010.f8240);
                    }
                    c26010 = c26010.f8241;
                }
                c10658Mo12945.f32059 = c188310.m43517();
            }
        } else {
            abstractC5698.f17560 = abstractC4308M41910;
        }
        abstractC5698.m16097(c2609M43517);
        if (abstractC5698.mo952() == EnumC23258.PARAMETER || abstractC5698.mo952() == EnumC23258.LOCAL_VARIABLE || abstractC5698.mo952() == EnumC23258.RESOURCE_VARIABLE || abstractC5698.mo952() == EnumC23258.EXCEPTION_PARAMETER || abstractC5698.mo952() == EnumC23258.BINDING_VARIABLE) {
            m41916(abstractC5698, c2609M43517);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41916(AbstractC5698 abstractC5698, C2609 c2609) {
        long jMo16084 = abstractC5698.f17561.mo16084();
        if ((1048576 & jMo16084) != 0) {
            C14163 c14163 = (C14163) abstractC5698.f17561.f17561;
            if ((jMo16084 & 8) != 0) {
                c14163.m16079(c2609);
                return;
            } else {
                c14163.m16092(c2609);
                return;
            }
        }
        abstractC5698.f17561.m16097(c2609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m41910(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, C9953 c9953) {
        C20743 c20743;
        AbstractC4308 abstractC4308Mo1357;
        C22364 c22364 = this.f54733.f52816;
        if (c2609.isEmpty()) {
            return abstractC4308;
        }
        Iterator it = c2609.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            if (((C6507) it.next()).f50415 == c9953) {
                z = true;
            }
            C12171.m29642(z);
        }
        if (abstractC4308.m12913(EnumC9454.ARRAY)) {
            C5138 c5138 = (C5138) abstractC4308;
            C5138 c5139 = new C5138(c5138);
            if (c5138 instanceof C0198) {
                c5139 = c5139.m14698();
            }
            C2609 c2609M8239 = C2609.m8239();
            AbstractC4308 abstractC4309 = c5138.f16077;
            C2609 c2609M8246 = c2609M8239.m8246(C12774.f38378);
            C5138 c51310 = c5139;
            while (true) {
                boolean zM12913 = abstractC4309.m12913(EnumC9454.ARRAY);
                c20743 = abstractC4309.f13889;
                if (!zM12913) {
                    break;
                }
                C5138 c51311 = (C5138) abstractC4309;
                C5138 c51312 = new C5138(c51311);
                c51310.f16077 = c51312;
                abstractC4309 = c51311.f16077;
                c2609M8246 = c2609M8246.m8246(C12774.f38378);
                c51310 = c51312;
            }
            if (c20743 != null) {
                if (!abstractC4309.m12931().isEmpty()) {
                    c2609 = abstractC4309.m12931().m8248(c2609);
                }
                abstractC4308Mo1357 = abstractC4309.mo1357(c20743.m47377(EnumC23564.ANNOTATIONS).m47376(new C14391(c2609)));
            } else {
                abstractC4308Mo1357 = abstractC4309.mo1357(new C20743(new C14391(c2609)));
            }
            c51310.f16077 = abstractC4308Mo1357;
            c9953.f30054 = c2609M8246;
            return c5139;
        }
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            return abstractC4308.mo12909(c26010);
        }
        if (abstractC4308.mo3256() == EnumC0701.UNION) {
            AbstractC12612 abstractC12612 = (AbstractC12612) ((C23488) abstractC5144).f75416.get(0);
            abstractC12612.f16086 = m41910(abstractC12612, abstractC12612.f16086, c2609, c26010, c9953);
            return abstractC4308;
        }
        InterfaceC11970 interfaceC11970Mo12943 = abstractC4308.mo12943();
        AbstractC5144 abstractC5145 = abstractC5144;
        AbstractC4308 abstractC4308Mo4958 = abstractC4308;
        while (interfaceC11970Mo12943 != null && interfaceC11970Mo12943.mo952() != EnumC23258.PACKAGE && abstractC4308Mo4958 != null && abstractC4308Mo4958.mo3256() != EnumC0701.NONE && abstractC4308Mo4958.mo3256() != EnumC0701.ERROR) {
            EnumC3329 enumC3329Mo987 = abstractC5145.mo987();
            EnumC3329 enumC3329 = EnumC3329.MEMBER_SELECT;
            if (enumC3329Mo987 != enumC3329 && abstractC5145.mo987() != EnumC3329.PARAMETERIZED_TYPE && abstractC5145.mo987() != EnumC3329.ANNOTATED_TYPE) {
                break;
            }
            if (abstractC5145.mo987() == enumC3329) {
                abstractC4308Mo4958 = abstractC4308Mo4958.mo4958();
                interfaceC11970Mo12943 = interfaceC11970Mo12943.mo7176();
                abstractC5145 = ((C6262) abstractC5145).f19397;
            } else {
                abstractC5145 = abstractC5145.mo987() == EnumC3329.PARAMETERIZED_TYPE ? ((C16432) abstractC5145).f50542 : ((C18257) abstractC5145).f56779;
            }
        }
        if (abstractC4308Mo4958 != null && abstractC4308Mo4958.m12913(EnumC9454.NONE)) {
            int iM8245 = c26010.m8245();
            if (iM8245 != 0) {
                if (iM8245 != 1) {
                    abstractC5144.getClass();
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC5144, new C12281("compiler", "cant.type.annotate.scoping", c26010));
                    return abstractC4308;
                }
                abstractC5144.getClass();
                C16384 c16384 = (C16384) c26010.f8240;
                C12281 c12282 = C6241.f19132;
                c22364.m7273(abstractC5144, new C12281("compiler", "cant.type.annotate.scoping.1", c16384));
            }
            return abstractC4308;
        }
        C18837 c18837 = new C18837();
        AbstractC4308 abstractC4308Mo4959 = abstractC4308Mo4958;
        while (interfaceC11970Mo12943 != null && interfaceC11970Mo12943.mo952() != EnumC23258.PACKAGE && abstractC4308Mo4959 != null) {
            EnumC0701 enumC0701Mo3256 = abstractC4308Mo4959.mo3256();
            EnumC0701 enumC0701 = EnumC0701.NONE;
            if (enumC0701Mo3256 == enumC0701 || abstractC4308Mo4959.mo3256() == EnumC0701.ERROR) {
                break;
            }
            abstractC4308Mo4959 = abstractC4308Mo4959.mo4958();
            interfaceC11970Mo12943 = interfaceC11970Mo12943.mo7176();
            if (abstractC4308Mo4959 != null && abstractC4308Mo4959.mo3256() != enumC0701) {
                c18837.m43511(C12774.f38380);
            }
        }
        if (c18837.m43518()) {
            C2609 c26011 = c9953.f30054;
            C2609 c2609M43517 = c18837.m43517();
            c26011.getClass();
            c9953.f30054 = c2609M43517.m8248(c26011);
        }
        AbstractC4308 abstractC43010 = (AbstractC4308) abstractC4308.mo2962(new C16508(abstractC4308Mo4958), c2609);
        abstractC5144.f16086 = abstractC43010;
        return abstractC43010;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9953 m41911(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, C2609 c2609, C14169 c14169, int i, C18837 c18837) {
        AbstractC4308 abstractC4308;
        int iIndexOf;
        int iIndexOf2;
        EnumC18550 enumC18550;
        int iIndexOf3;
        C2609 c26010 = c2609;
        switch (C7130.f21881[abstractC5145.mo987().ordinal()]) {
            case 1:
                return C9953.m25098(c18837.m43517(), c14169, i, abstractC5145.f16085);
            case 2:
                return C9953.m25095(c18837.m43517(), c14169, abstractC5145.f16085);
            case 3:
                C19110 c19110 = (C19110) abstractC5145;
                C2609 c26011 = c19110.f60198;
                C5557 c5557 = c19110.f60195;
                if (c5557 != null) {
                    if (c5557.f17183.contains(abstractC5144)) {
                        return C9953.m25080(c18837.m43517(), c14169, c5557.f17183.indexOf(abstractC5144), abstractC5145.f16085);
                    }
                    return C9953.m25080(c18837.m43517(), c14169, 65535, abstractC5145.f16085);
                }
                if (c26011.contains(abstractC5144)) {
                    return C9953.m25087(c18837.m43517(), c14169, c26011.indexOf(abstractC5144), abstractC5145.f16085);
                }
                return C9953.m25097(c18837.m43517(), c14169, abstractC5145.f16085);
            case 4:
                return C9953.m25097(c18837.m43517(), c14169, abstractC5145.f16085);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C5557 c5558 = (C5557) abstractC5145;
                if (c5558.f17184 != abstractC5144) {
                    if (c5558.f17183.contains(abstractC5144)) {
                        return C9953.m25080(c18837.m43517(), c14169, c5558.f17183.indexOf(abstractC5144), abstractC5145.f16085);
                    }
                    if (c5558.f17185.contains(abstractC5144)) {
                        return C9953.m25085(c18837.m43517(), c14169, c5558.f17185.indexOf(abstractC5144), abstractC5145.f16085);
                    }
                    throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC5145);
                }
                return C9953.m25080(c18837.m43517(), c14169, 65535, abstractC5145.f16085);
            case 10:
                C8526 c8526 = (C8526) abstractC5145;
                if (c8526.f26042.contains(abstractC5144)) {
                    return C9953.m25100(c18837.m43517(), c14169, c8526.f26042.indexOf(abstractC5144), abstractC5145.f16085);
                }
                if (c8526.f26051 == abstractC5144) {
                    return C9953.m25082(c18837.m43517(), c14169, abstractC5145.f16085);
                }
                if (c8526.f26047.contains(abstractC5144)) {
                    return C9953.m25083(c18837.m43517(), c14169, c8526.f26047.indexOf(abstractC5144), abstractC5145.f16085);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC5145);
            case 11:
                C2609 c26012 = c26010.f8241;
                C16432 c16432 = (C16432) abstractC5145;
                if (c16432.f50542 != abstractC5144) {
                    if (c16432.f50541.contains(abstractC5144)) {
                        c18837.m43515(new C12774(EnumC12069.TYPE_ARGUMENT, c16432.f50541.indexOf(abstractC5144)));
                        C2609 c26013 = c26012.f8241;
                        if (c26013 != null && ((AbstractC5144) c26013.f8240).m14709(EnumC18550.f57548)) {
                            abstractC4308 = ((AbstractC5144) c26012.f8241.f8240).f16086;
                        } else {
                            abstractC4308 = c16432.f16086;
                        }
                        m41912(abstractC4308, c18837);
                    } else {
                        throw new AssertionError("Could not determine type argument position of tree " + abstractC5144 + " within frame " + abstractC5145);
                    }
                }
                return m41911((AbstractC5144) c26012.f8240, (AbstractC5144) c26012.f8241.f8240, c26012, c14169, i, c18837);
            case 12:
                C9232 c9232 = (C9232) abstractC5145;
                C2609 c26014 = c9232.f27947;
                EnumC11091 enumC11091 = c9232.f27940;
                if (c9232.f27945 == abstractC5144) {
                    int i2 = C7130.f21880[enumC11091.ordinal()];
                    if (i2 == 1) {
                        return C9953.m25099(c18837.m43517(), c14169, abstractC5145.f16085);
                    }
                    if (i2 == 2) {
                        return C9953.m25079(c18837.m43517(), c14169, abstractC5145.f16085);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC11091 + " for tree " + abstractC5144 + " within frame " + abstractC5145);
                }
                if (c26014 != null && c26014.contains(abstractC5144)) {
                    int iIndexOf4 = c26014.indexOf(abstractC5144);
                    int i3 = C7130.f21880[enumC11091.ordinal()];
                    if (i3 == 1) {
                        return C9953.m25090(c18837.m43517(), c14169, iIndexOf4, abstractC5145.f16085);
                    }
                    if (i3 == 2) {
                        return C9953.m25092(c18837.m43517(), c14169, iIndexOf4, abstractC5145.f16085);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC11091 + " for tree " + abstractC5144 + " within frame " + abstractC5145);
                }
                throw new AssertionError("Could not determine type argument position of tree " + abstractC5144 + " within frame " + abstractC5145);
            case 13:
                c18837.m43515(C12774.f38378);
                C2609 c26015 = c26010.f8241;
                while (true) {
                    AbstractC5144 abstractC5146 = (AbstractC5144) c26015.f8241.f8240;
                    if (abstractC5146.m14709(EnumC18550.f57518)) {
                        c26015 = c26015.f8241;
                        c18837.m43515(C12774.f38378);
                    } else if (abstractC5146.m14709(EnumC18550.f57497)) {
                        c26015 = c26015.f8241;
                    } else {
                        return m41911((AbstractC5144) c26015.f8240, (AbstractC5144) c26015.f8241.f8240, c26015, c14169, i, c18837);
                    }
                }
                break;
            case 14:
                if (((AbstractC5144) c26010.f8241.f8241.f8240).m14709(EnumC18550.f57582)) {
                    C2609 c26016 = c26010.f8241;
                    int iIndexOf5 = ((C5557) c26016.f8241.f8240).f17185.indexOf(c26016.f8240);
                    C14315 c14315 = (C14315) abstractC5145;
                    if (((AbstractC12612) c14315.f43170.get(0)).f16086.mo12925()) {
                        iIndexOf2 = c14315.f43170.indexOf(abstractC5144) + 1;
                    } else {
                        iIndexOf2 = c14315.f43170.indexOf(abstractC5144);
                    }
                    return C9953.m25088(c18837.m43517(), c14169, iIndexOf5, iIndexOf2, abstractC5145.f16085);
                }
                if (((AbstractC5144) c26010.f8241.f8241.f8240).m14709(EnumC18550.f57511)) {
                    C2609 c26017 = c26010.f8241;
                    int iIndexOf6 = ((C8526) c26017.f8241.f8240).f26047.indexOf(c26017.f8240);
                    C14315 c14316 = (C14315) abstractC5145;
                    if (((AbstractC12612) c14316.f43170.get(0)).f16086.mo12925()) {
                        iIndexOf = c14316.f43170.indexOf(abstractC5144) + 1;
                    } else {
                        iIndexOf = c14316.f43170.indexOf(abstractC5144);
                    }
                    return C9953.m25081(c18837.m43517(), c14169, iIndexOf6, iIndexOf, abstractC5145.f16085);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC5145);
            case 15:
                C12048 c12048 = ((C9378) abstractC5145).f28489;
                if (c12048.mo952() != EnumC23258.FIELD) {
                    m41916(c12048, c12048.mo16081());
                }
                switch (C7130.f21882[c12048.mo952().ordinal()]) {
                    case 1:
                    case 2:
                        return C9953.m25093(c18837.m43517(), c14169, abstractC5145.f16085);
                    case 3:
                        return C9953.m25091(c18837.m43517(), c14169, abstractC5145.f16085);
                    case 4:
                        if (c12048.f17562.equals(this.f54733.f52817.f18886)) {
                            return C9953.m25089(c18837.m43517(), c14169, abstractC5145.f16085);
                        }
                        while (true) {
                            EnumC18550 enumC18550Mo989 = ((AbstractC5144) c26010.f8240).mo989();
                            enumC18550 = EnumC18550.f57511;
                            if (enumC18550Mo989 != enumC18550 && ((AbstractC5144) c26010.f8240).mo989() != EnumC18550.f57523) {
                                c26010 = c26010.f8241;
                            }
                        }
                        if (((AbstractC5144) c26010.f8240).mo989() == enumC18550) {
                            iIndexOf3 = ((C8526) c26010.f8240).f26048.indexOf(abstractC5145);
                        } else if (((AbstractC5144) c26010.f8240).mo989() == EnumC18550.f57523) {
                            iIndexOf3 = ((C14169) c26010.f8240).f42775.indexOf(abstractC5145);
                        } else {
                            C12171.m29640("methodParamIndex expected to find method or lambda for param: " + abstractC5145);
                            throw null;
                        }
                        return C9953.m25094(c18837.m43517(), c14169, iIndexOf3, abstractC5145.f16085);
                    case 5:
                        return C9953.m25086(c18837.m43517(), c14169, abstractC5145.f16085);
                    case 6:
                        return C9953.m25084(c18837.m43517(), c14169, abstractC5145.f16085);
                    default:
                        throw new AssertionError("Found unexpected type annotation for variable: " + c12048 + " with kind: " + c12048.mo952());
                }
            case 16:
                if (abstractC5145 == abstractC5144) {
                    AbstractC4308 abstractC4309 = ((C18257) abstractC5145).f56779.f16086;
                    C12171.m29637(abstractC4309);
                    if (!abstractC4309.f13890.mo952().equals(EnumC23258.TYPE_PARAMETER) && !abstractC4309.mo3256().equals(EnumC0701.WILDCARD) && !abstractC4309.mo3256().equals(EnumC0701.ARRAY)) {
                        m41912(abstractC4309, c18837);
                    }
                }
                C2609 c26018 = c26010.f8241;
                return m41911((AbstractC5144) c26018.f8240, (AbstractC5144) c26018.f8241.f8240, c26018, c14169, i, c18837);
            case 17:
                C2609 c26019 = c26010.f8241;
                return m41911((AbstractC5144) c26019.f8240, (AbstractC5144) c26019.f8241.f8240, c26019, c14169, i, c18837);
            case 18:
                C2609 c26020 = c26010.f8241;
                return m41911((AbstractC5144) c26020.f8240, (AbstractC5144) c26020.f8241.f8240, c26020, c14169, ((C17138) abstractC5145).f52525.indexOf(abstractC5144), c18837);
            case 19:
                C15580 c15580 = (C15580) abstractC5145;
                if (!c15580.f48010.contains(abstractC5144)) {
                    return C9953.f30043;
                }
                C3581 c3581 = (C3581) C7260.m19472(c15580.f48011);
                int iIndexOf7 = c15580.f48010.indexOf(abstractC5144);
                if (c3581 == null) {
                    throw new AssertionError("could not determine symbol for {" + c15580 + l.d);
                }
                if (c3581.m16075()) {
                    return C9953.m25087(c18837.m43517(), c14169, iIndexOf7, c15580.f16085);
                }
                return C9953.m25096(c18837.m43517(), c14169, iIndexOf7, c15580.f16085);
            case 20:
            case 21:
                C2609 c26021 = c26010.f8241;
                AbstractC5144 abstractC5147 = (AbstractC5144) c26021.f8240;
                AbstractC5144 abstractC5148 = (AbstractC5144) c26021.f8241.f8240;
                c18837.m43515(C12774.f38379);
                return m41911(abstractC5147, abstractC5148, c26021, c14169, i, c18837);
            case 22:
                C2609 c26022 = c26010.f8241;
                return m41911((AbstractC5144) c26022.f8240, (AbstractC5144) c26022.f8241.f8240, c26022, c14169, i, c18837);
            default:
                throw new AssertionError("Unresolved frame: " + abstractC5145 + " of kind: " + abstractC5145.mo987() + "\n    Looking for tree: " + abstractC5144);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18837 m41912(AbstractC4308 abstractC4308, C18837 c18837) {
        for (AbstractC4308 abstractC4308Mo4958 = abstractC4308.mo4958(); abstractC4308Mo4958 != null && abstractC4308Mo4958.mo3256() != EnumC0701.NONE && abstractC4308Mo4958.mo3256() != EnumC0701.ERROR; abstractC4308Mo4958 = abstractC4308Mo4958.mo4958()) {
            c18837.m43515(C12774.f38380);
        }
        return c18837;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (this.f54732) {
            return;
        }
        this.f54732 = true;
        if (this.f54734) {
            mo10758(c5557.f17181);
            m33860(c5557.f17185);
            mo10758(c5557.f17184);
            m33860(c5557.f17183);
        }
        m33860(c5557.f17179);
        if (c5557.f17186.m33810()) {
            C5378.stream(c5557.f17186.m33811()).forEach(new Consumer() { // from class: l.ۧ۠֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C17920 c17920 = this.f32639;
                    c17920.getClass();
                    c17920.mo10758(((C21221) obj).f68389);
                }
            });
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        if (c8526.f26045 == null) {
            C12171.m29640("Visiting tree node before memberEnter");
            throw null;
        }
        boolean z = this.f54734;
        if (z) {
            if (!c8526.f26046.f7168.isEmpty()) {
                if (c8526.f26045.m16075()) {
                    m41914(c8526, null, c8526.f26045, C9953.m25082(C9953.f30042, null, c8526.f16085));
                } else {
                    m41914(c8526.f26051, c8526.f26045.f17560.mo12923(), c8526.f26045, C9953.m25082(C9953.f30042, null, c8526.f26051.f16085));
                }
            }
            C9378 c9378 = c8526.f26052;
            if (c9378 != null && c9378.f28489 != null && !c9378.f28486.f7168.isEmpty()) {
                C9953 c9953M25089 = C9953.m25089(C9953.f30042, null, c8526.f26052.f28488.f16085);
                this.f54731 = this.f54731.m8246(c8526.f26052);
                try {
                    C9378 c9379 = c8526.f26052;
                    AbstractC12612 abstractC12612 = c9379.f28488;
                    C12048 c12048 = c9379.f28489;
                    m41914(abstractC12612, c12048.f17560, c12048, c9953M25089);
                    m41917();
                } catch (Throwable th) {
                    m41917();
                    throw th;
                }
            }
            int i = 0;
            for (C9378 c93710 : c8526.f26048) {
                if (!c93710.f28486.f7168.isEmpty()) {
                    C9953 c9953M25094 = C9953.m25094(C9953.f30042, null, i, c93710.f28488.f16085);
                    this.f54731 = this.f54731.m8246(c93710);
                    try {
                        AbstractC12612 abstractC12613 = c93710.f28488;
                        C12048 c12049 = c93710.f28489;
                        m41914(abstractC12613, c12049.f17560, c12049, c9953M25094);
                        m41917();
                    } catch (Throwable th2) {
                        m41917();
                        throw th2;
                    }
                }
                i++;
            }
        }
        if (z) {
            mo10758(c8526.f26046);
            mo10758(c8526.f26051);
            m33860(c8526.f26047);
            mo10758(c8526.f26052);
            m33860(c8526.f26048);
            m33860(c8526.f26042);
            return;
        }
        mo10758(c8526.f26049);
        mo10758(c8526.f26043);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C14169 c141610 = this.f54730;
        try {
            this.f54730 = c14169;
            int i = 0;
            for (C9378 c9378 : c14169.f42775) {
                if (!c9378.f28486.f7168.isEmpty()) {
                    C9953 c9953M25094 = C9953.m25094(C9953.f30042, c14169, i, c9378.f28488.f16085);
                    this.f54731 = this.f54731.m8246(c9378);
                    try {
                        if (!c9378.m24210()) {
                            AbstractC12612 abstractC12612 = c9378.f28488;
                            C12048 c12048 = c9378.f28489;
                            m41914(abstractC12612, c12048.f17560, c12048, c9953M25094);
                        }
                        m41917();
                    } catch (Throwable th) {
                        m41917();
                        throw th;
                    }
                }
                i++;
            }
            mo10758(c14169.f42776);
            m33860(c14169.f42775);
            this.f54730 = c141610;
        } catch (Throwable th2) {
            this.f54730 = c141610;
            throw th2;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048;
        boolean zIsEmpty = c9378.f28486.f7168.isEmpty();
        boolean z = this.f54734;
        if (!zIsEmpty) {
            C12048 c12049 = c9378.f28489;
            if (c12049 == null) {
                C12171.m29640("Visiting tree node before memberEnter");
                throw null;
            }
            if (c12049.mo952() != EnumC23258.PARAMETER) {
                if (c9378.f28489.mo952() == EnumC23258.FIELD) {
                    if (z) {
                        C9953 c9953M25091 = C9953.m25091(C9953.f30042, null, c9378.f16085);
                        AbstractC12612 abstractC12612 = c9378.f28488;
                        C12048 c120410 = c9378.f28489;
                        m41914(abstractC12612, c120410.f17560, c120410, c9953M25091);
                    }
                } else if (c9378.f28489.mo952() == EnumC23258.LOCAL_VARIABLE) {
                    C9953 c9953M25093 = C9953.m25093(C9953.f30042, this.f54730, c9378.f16085);
                    if (!c9378.m24210()) {
                        AbstractC12612 abstractC12613 = c9378.f28488;
                        C12048 c120411 = c9378.f28489;
                        m41914(abstractC12613, c120411.f17560, c120411, c9953M25093);
                    }
                } else if (c9378.f28489.mo952() == EnumC23258.BINDING_VARIABLE) {
                    C9953 c9953M25094 = C9953.m25093(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC12614 = c9378.f28488;
                    C12048 c120412 = c9378.f28489;
                    m41914(abstractC12614, c120412.f17560, c120412, c9953M25094);
                } else if (c9378.f28489.mo952() == EnumC23258.EXCEPTION_PARAMETER) {
                    C9953 c9953M25086 = C9953.m25086(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC12615 = c9378.f28488;
                    C12048 c120413 = c9378.f28489;
                    m41914(abstractC12615, c120413.f17560, c120413, c9953M25086);
                } else if (c9378.f28489.mo952() == EnumC23258.RESOURCE_VARIABLE) {
                    C9953 c9953M25084 = C9953.m25084(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC12616 = c9378.f28488;
                    C12048 c120414 = c9378.f28489;
                    m41914(abstractC12616, c120414.f17560, c120414, c9953M25084);
                } else if (c9378.f28489.mo952() != EnumC23258.ENUM_CONSTANT) {
                    C12171.m29640("Unhandled variable kind: " + c9378.f28489.mo952());
                    throw null;
                }
            }
        }
        mo10758(c9378.f28486);
        mo10758(c9378.f28488);
        if (!z) {
            mo10758(c9378.f28487);
        }
        if (z && (c12048 = c9378.f28489) != null && c12048.mo952() == EnumC23258.FIELD) {
            C12048 c120415 = c9378.f28489;
            if ((c120415.f17563 & 2305843009213693952L) != 0) {
                C21221 c21221M33803 = ((C14163) c120415.f17561).m33803(c120415);
                c21221M33803.m16074(c9378.f28489.mo16081());
                c21221M33803.f17560 = c9378.f28489.f17560;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        if (this.f54734) {
            return;
        }
        m33860(c2735.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C14163 c14163;
        C5557 c5557 = c19110.f60195;
        if (c5557 != null && (c14163 = c5557.f17186) != null) {
            AbstractC4308 abstractC4308 = c14163.f17561.m16071().f17560;
            C18837 c18837 = new C18837();
            m41912(abstractC4308, c18837);
            c18837.m43511(C12774.f38380);
            C9953 c9953M25097 = C9953.m25097(c18837.m43517(), null, c19110.f16085);
            C18837 c18838 = new C18837();
            AbstractC4308 abstractC4309 = c19110.f60196.f16086;
            C18837 c18839 = new C18837();
            m41912(abstractC4309, c18839);
            C2609 c2609M43517 = c18839.m43517();
            for (C6507 c6507 : c14163.mo16081()) {
                if (c6507.f50415.f30054.equals(c2609M43517)) {
                    c18838.m43511(new C6507(c6507.f26338, c6507.f50417, c9953M25097));
                }
            }
            c14163.f17561.m16097(c18838.m43517());
        }
        mo10758(c19110.f60199);
        m33860(c19110.f60198);
        if (c19110.f60195 == null) {
            mo10758(c19110.f60196);
        }
        m33860(c19110.f60197);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        m41915(c18404, c18404, c18404.f57137);
        int iM8245 = c18404.f57141.m8245();
        C18837 c18837 = new C18837();
        for (int i = 0; i < iM8245; i++) {
            C18837 c18838 = new C18837();
            if (i != 0) {
                c18837.m43511(C12774.f38378);
                c18838.m43512(c18837.m43517());
            }
            m41913((C2609) c18404.f57141.get(i), C9953.m25097(c18838.m43517(), this.f54730, c18404.f16085));
        }
        AbstractC12612 abstractC12612 = c18404.f57138;
        c18837.m43511(C12774.f38378);
        while (abstractC12612 != null) {
            if (abstractC12612.m14709(EnumC18550.f57497)) {
                C18257 c18257 = (C18257) abstractC12612;
                AbstractC4308 abstractC4308 = abstractC12612.f16086;
                C18837 c18839 = new C18837();
                m41912(abstractC4308, c18839);
                m41913(c18257.f56778, C9953.m25097(c18839.m43517().m8248(c18837.m43517()), this.f54730, c18404.f16085));
                abstractC12612 = c18257.f56779;
            } else if (abstractC12612.m14709(EnumC18550.f57518)) {
                c18837.m43511(C12774.f38378);
                abstractC12612 = ((C23901) abstractC12612).f77274;
            } else if (!abstractC12612.m14709(EnumC18550.f57581)) {
                break;
            } else {
                abstractC12612 = ((C6262) abstractC12612).f19397;
            }
        }
        m33860(c18404.f57139);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41915(AbstractC5144 abstractC5144, AbstractC5144 abstractC5145, C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        m41913(c2609, m41911(abstractC5144, abstractC5145, this.f54731, this.f54730, 0, new C18837()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41913(C2609 c2609, C9953 c9953) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16384 = ((C17551) it.next()).f53652;
            if (c16384 != null) {
                ((C6507) c16384).f50415 = c9953;
            }
        }
    }

    public final String toString() {
        return super.toString() + ": sigOnly: " + this.f54734;
    }

    public C17920(C17214 c17214, boolean z) {
        this.f54733 = c17214;
        this.f54734 = z;
    }
}
