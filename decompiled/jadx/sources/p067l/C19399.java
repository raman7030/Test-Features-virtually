package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19399 extends C15854 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C18728 f57930;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f57931;

    /* JADX INFO: renamed from: ۧ */
    public C4848 f57928 = C4848.m10283();

    /* JADX INFO: renamed from: ܽ */
    public boolean f57929 = false;

    /* JADX INFO: renamed from: ֫ */
    public C15834 f57927 = null;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        this.f57928 = this.f57928.m10290(c19720);
        m44164(c19720, c19720, c19720.f59995);
        m44166();
        super.mo3829(c19720);
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        this.f57928 = this.f57928.m10290(abstractC7257);
        try {
            super.mo12739(abstractC7257);
        } finally {
            m44166();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m44166() {
        C4848 c4848 = this.f57928;
        this.f57928 = c4848.f11035;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        m44164(c15973, (AbstractC7257) this.f57928.f11035.f11034, c15973.f46260);
        super.mo3816(c15973);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44163(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C11827 c11827) {
        C18728 c18728;
        C4848 c4848Mo17987 = abstractC7783.mo17987();
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        C20271 c20273 = new C20271();
        Iterator it = c4848Mo17987.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c18728 = this.f57930;
            if (!zHasNext) {
                break;
            }
            C17939 c17939 = (C17939) it.next();
            EnumC3976 enumC3976M42755 = c18728.m42755(c17939, abstractC7783);
            C4848 c4848 = c17939.f53589;
            AbstractC6462 abstractC6463 = c17939.f29256;
            int iOrdinal = enumC3976M42755.ordinal();
            if (iOrdinal == 0) {
                c20271.m45777(c17939);
            } else if (iOrdinal == 1) {
                C8552 c8552 = new C8552(abstractC6463, c4848, c11827);
                c20272.m45777(c8552);
                c20273.m45777(c8552);
            } else if (iOrdinal == 3) {
                c20271.m45777(c17939);
                c20272.m45777(new C8552(abstractC6463, c4848, c11827));
            }
        }
        if (c20272.isEmpty()) {
            return;
        }
        abstractC7783.m18023();
        abstractC7783.m18005(c20271.m45783());
        C4848 c4848M45783 = c20272.m45783();
        if (abstractC6462 == null) {
            m44159(abstractC7257, abstractC7783.mo9255().f20406, c4848M45783, c4848M45783, c11827);
            abstractC7783.m18016(c4848M45783);
            return;
        }
        AbstractC6462 abstractC6462M44159 = m44159(abstractC7257, abstractC6462, c4848M45783, c20273.m45783(), c11827);
        if (abstractC7783.mo3347() == EnumC24473.METHOD) {
            abstractC7783.f20406.mo14809().f35031 = abstractC6462M44159;
        } else if (abstractC7783.mo3347() == EnumC24473.PARAMETER && this.f57927 == null) {
            abstractC7783.f20406 = abstractC6462M44159;
            if (abstractC7783.mo17995().equals(c18728.f55999.f21744)) {
                abstractC7783.f20407.f20406.mo14809().f35029 = abstractC6462M44159;
            } else {
                C12497 c12497Mo14809 = abstractC7783.f20407.f20406.mo14809();
                C4848 c4849 = c12497Mo14809.f35030;
                C20271 c20274 = new C20271();
                for (C4848 c48410 = ((C5771) abstractC7783.f20407).f14172; c48410.m10293(); c48410 = c48410.f11035) {
                    if (c48410.f11034 == abstractC7783) {
                        c20274.m45777(abstractC6462M44159);
                    } else {
                        c20274.m45777((AbstractC6462) c4849.f11034);
                    }
                    c4849 = c4849.f11035;
                }
                c12497Mo14809.f35030 = c20274.m45783();
            }
        } else {
            abstractC7783.f20406 = abstractC6462M44159;
        }
        abstractC7783.m18016(c4848M45783);
        if (abstractC7783.mo3347() == EnumC24473.PARAMETER || abstractC7783.mo3347() == EnumC24473.LOCAL_VARIABLE || abstractC7783.mo3347() == EnumC24473.RESOURCE_VARIABLE || abstractC7783.mo3347() == EnumC24473.EXCEPTION_PARAMETER || abstractC7783.mo3347() == EnumC24473.BINDING_VARIABLE) {
            m44165(abstractC7783, c4848M45783);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44165(AbstractC7783 abstractC7783, C4848 c4848) {
        long jMo18003 = abstractC7783.f20407.mo18003();
        if ((1048576 & jMo18003) != 0) {
            C15828 c15828 = (C15828) abstractC7783.f20407.f20407;
            if ((jMo18003 & 8) != 0) {
                c15828.m17998(c4848);
                return;
            } else {
                c15828.m18011(c4848);
                return;
            }
        }
        abstractC7783.f20407.m18016(c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6462 m44159(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, C11827 c11827) {
        C22082 c22082;
        AbstractC6462 abstractC6462Mo3770;
        C23623 c23623 = this.f57930.f55998;
        if (c4848.isEmpty()) {
            return abstractC6462;
        }
        Iterator it = c4848.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            if (((C8552) it.next()).f53587 == c11827) {
                z = true;
            }
            C1446.m31704(z);
        }
        if (abstractC6462.m14777(EnumC11353.ARRAY)) {
            C7251 c7251 = (C7251) abstractC6462;
            C7251 c7252 = new C7251(c7251);
            if (c7251 instanceof C2556) {
                c7252 = c7252.m16606();
            }
            C4848 c4848M10283 = C4848.m10283();
            AbstractC6462 abstractC6463 = c7251.f18916;
            C4848 c4848M10290 = c4848M10283.m10290(C14508.f41418);
            C7251 c7253 = c7252;
            while (true) {
                boolean zM14777 = abstractC6463.m14777(EnumC11353.ARRAY);
                c22082 = abstractC6463.f16704;
                if (!zM14777) {
                    break;
                }
                C7251 c7254 = (C7251) abstractC6463;
                C7251 c7255 = new C7251(c7254);
                c7253.f18916 = c7255;
                abstractC6463 = c7254.f18916;
                c4848M10290 = c4848M10290.m10290(C14508.f41418);
                c7253 = c7255;
            }
            if (c22082 != null) {
                if (!abstractC6463.m14795().isEmpty()) {
                    c4848 = abstractC6463.m14795().m10292(c4848);
                }
                abstractC6462Mo3770 = abstractC6463.mo3770(c22082.m49704(EnumC24763.ANNOTATIONS).m49703(new C16045(c4848)));
            } else {
                abstractC6462Mo3770 = abstractC6463.mo3770(new C22082(new C16045(c4848)));
            }
            c7253.f18916 = abstractC6462Mo3770;
            c11827.f33011 = c4848M10290;
            return c7252;
        }
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            return abstractC6462.mo14773(c4849);
        }
        if (abstractC6462.mo5575() == EnumC3035.UNION) {
            AbstractC14355 abstractC14355 = (AbstractC14355) ((C24691) abstractC7257).f78164.get(0);
            abstractC14355.f18925 = m44159(abstractC14355, abstractC14355.f18925, c4848, c4849, c11827);
            return abstractC6462;
        }
        InterfaceC13745 interfaceC13745Mo14807 = abstractC6462.mo14807();
        AbstractC7257 abstractC7258 = abstractC7257;
        AbstractC6462 abstractC6462Mo7201 = abstractC6462;
        while (interfaceC13745Mo14807 != null && interfaceC13745Mo14807.mo3347() != EnumC24473.PACKAGE && abstractC6462Mo7201 != null && abstractC6462Mo7201.mo5575() != EnumC3035.NONE && abstractC6462Mo7201.mo5575() != EnumC3035.ERROR) {
            EnumC5532 enumC5532Mo3381 = abstractC7258.mo3381();
            EnumC5532 enumC5532 = EnumC5532.MEMBER_SELECT;
            if (enumC5532Mo3381 != enumC5532 && abstractC7258.mo3381() != EnumC5532.PARAMETERIZED_TYPE && abstractC7258.mo3381() != EnumC5532.ANNOTATED_TYPE) {
                break;
            }
            if (abstractC7258.mo3381() == enumC5532) {
                abstractC6462Mo7201 = abstractC6462Mo7201.mo7201();
                interfaceC13745Mo14807 = interfaceC13745Mo14807.mo9255();
                abstractC7258 = ((C8320) abstractC7258).f22261;
            } else {
                abstractC7258 = abstractC7258.mo3381() == EnumC5532.PARAMETERIZED_TYPE ? ((C17985) abstractC7258).f53722 : ((C19720) abstractC7258).f59996;
            }
        }
        if (abstractC6462Mo7201 != null && abstractC6462Mo7201.m14777(EnumC11353.NONE)) {
            int iM10289 = c4849.m10289();
            if (iM10289 != 0) {
                if (iM10289 != 1) {
                    abstractC7257.getClass();
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(abstractC7257, new C14040("compiler", "cant.type.annotate.scoping", c4849));
                    return abstractC6462;
                }
                abstractC7257.getClass();
                C17939 c17939 = (C17939) c4849.f11034;
                C14040 c14041 = C8300.f21997;
                c23623.m9352(abstractC7257, new C14040("compiler", "cant.type.annotate.scoping.1", c17939));
            }
            return abstractC6462;
        }
        C20271 c20271 = new C20271();
        AbstractC6462 abstractC6462Mo7202 = abstractC6462Mo7201;
        while (interfaceC13745Mo14807 != null && interfaceC13745Mo14807.mo3347() != EnumC24473.PACKAGE && abstractC6462Mo7202 != null) {
            EnumC3035 enumC3035Mo5575 = abstractC6462Mo7202.mo5575();
            EnumC3035 enumC3035 = EnumC3035.NONE;
            if (enumC3035Mo5575 == enumC3035 || abstractC6462Mo7202.mo5575() == EnumC3035.ERROR) {
                break;
            }
            abstractC6462Mo7202 = abstractC6462Mo7202.mo7201();
            interfaceC13745Mo14807 = interfaceC13745Mo14807.mo9255();
            if (abstractC6462Mo7202 != null && abstractC6462Mo7202.mo5575() != enumC3035) {
                c20271.m45777(C14508.f41420);
            }
        }
        if (c20271.m45784()) {
            C4848 c48410 = c11827.f33011;
            C4848 c4848M45783 = c20271.m45783();
            c48410.getClass();
            c11827.f33011 = c4848M45783.m10292(c48410);
        }
        AbstractC6462 abstractC6464 = (AbstractC6462) abstractC6462.mo5291(new C18057(abstractC6462Mo7201), c4848);
        abstractC7257.f18925 = abstractC6464;
        return abstractC6464;
    }

    /* JADX INFO: renamed from: ֫ */
    private C11827 m44160(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, C4848 c4848, C15834 c15834, int i, C20271 c20271) {
        AbstractC6462 abstractC6462;
        int iIndexOf;
        int iIndexOf2;
        EnumC19998 enumC19998;
        int iIndexOf3;
        C4848 c4849 = c4848;
        switch (C9144.f24760[abstractC7258.mo3381().ordinal()]) {
            case 1:
                return C11827.m27115(c20271.m45783(), c15834, i, abstractC7258.f18924);
            case 2:
                return C11827.m27112(c20271.m45783(), c15834, abstractC7258.f18924);
            case 3:
                C20530 c20530 = (C20530) abstractC7258;
                C4848 c48410 = c20530.f63431;
                C7650 c7650 = c20530.f63428;
                if (c7650 != null) {
                    if (c7650.f20024.contains(abstractC7257)) {
                        return C11827.m27097(c20271.m45783(), c15834, c7650.f20024.indexOf(abstractC7257), abstractC7258.f18924);
                    }
                    return C11827.m27097(c20271.m45783(), c15834, 65535, abstractC7258.f18924);
                }
                if (c48410.contains(abstractC7257)) {
                    return C11827.m27104(c20271.m45783(), c15834, c48410.indexOf(abstractC7257), abstractC7258.f18924);
                }
                return C11827.m27114(c20271.m45783(), c15834, abstractC7258.f18924);
            case 4:
                return C11827.m27114(c20271.m45783(), c15834, abstractC7258.f18924);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C7650 c7651 = (C7650) abstractC7258;
                if (c7651.f20025 != abstractC7257) {
                    if (c7651.f20024.contains(abstractC7257)) {
                        return C11827.m27097(c20271.m45783(), c15834, c7651.f20024.indexOf(abstractC7257), abstractC7258.f18924);
                    }
                    if (c7651.f20026.contains(abstractC7257)) {
                        return C11827.m27102(c20271.m45783(), c15834, c7651.f20026.indexOf(abstractC7257), abstractC7258.f18924);
                    }
                    throw new AssertionError("Could not determine position of tree " + abstractC7257 + " within frame " + abstractC7258);
                }
                return C11827.m27097(c20271.m45783(), c15834, 65535, abstractC7258.f18924);
            case 10:
                C10471 c10471 = (C10471) abstractC7258;
                if (c10471.f28957.contains(abstractC7257)) {
                    return C11827.m27117(c20271.m45783(), c15834, c10471.f28957.indexOf(abstractC7257), abstractC7258.f18924);
                }
                if (c10471.f28966 == abstractC7257) {
                    return C11827.m27099(c20271.m45783(), c15834, abstractC7258.f18924);
                }
                if (c10471.f28962.contains(abstractC7257)) {
                    return C11827.m27100(c20271.m45783(), c15834, c10471.f28962.indexOf(abstractC7257), abstractC7258.f18924);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC7257 + " within frame " + abstractC7258);
            case 11:
                C4848 c48411 = c4849.f11035;
                C17985 c17985 = (C17985) abstractC7258;
                if (c17985.f53722 != abstractC7257) {
                    if (c17985.f53721.contains(abstractC7257)) {
                        c20271.m45781(new C14508(EnumC13838.TYPE_ARGUMENT, c17985.f53721.indexOf(abstractC7257)));
                        C4848 c48412 = c48411.f11035;
                        if (c48412 != null && ((AbstractC7257) c48412.f11034).m16617(EnumC19998.f60772)) {
                            abstractC6462 = ((AbstractC7257) c48411.f11035.f11034).f18925;
                        } else {
                            abstractC6462 = c17985.f18925;
                        }
                        m44161(abstractC6462, c20271);
                    } else {
                        throw new AssertionError("Could not determine type argument position of tree " + abstractC7257 + " within frame " + abstractC7258);
                    }
                }
                return m44160((AbstractC7257) c48411.f11034, (AbstractC7257) c48411.f11035.f11034, c48411, c15834, i, c20271);
            case 12:
                C11142 c11142 = (C11142) abstractC7258;
                C4848 c48413 = c11142.f30893;
                EnumC12909 enumC12909 = c11142.f30886;
                if (c11142.f30891 == abstractC7257) {
                    int i2 = C9144.f24759[enumC12909.ordinal()];
                    if (i2 == 1) {
                        return C11827.m27116(c20271.m45783(), c15834, abstractC7258.f18924);
                    }
                    if (i2 == 2) {
                        return C11827.m27096(c20271.m45783(), c15834, abstractC7258.f18924);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC12909 + " for tree " + abstractC7257 + " within frame " + abstractC7258);
                }
                if (c48413 != null && c48413.contains(abstractC7257)) {
                    int iIndexOf4 = c48413.indexOf(abstractC7257);
                    int i3 = C9144.f24759[enumC12909.ordinal()];
                    if (i3 == 1) {
                        return C11827.m27107(c20271.m45783(), c15834, iIndexOf4, abstractC7258.f18924);
                    }
                    if (i3 == 2) {
                        return C11827.m27109(c20271.m45783(), c15834, iIndexOf4, abstractC7258.f18924);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC12909 + " for tree " + abstractC7257 + " within frame " + abstractC7258);
                }
                throw new AssertionError("Could not determine type argument position of tree " + abstractC7257 + " within frame " + abstractC7258);
            case 13:
                c20271.m45781(C14508.f41418);
                C4848 c48414 = c4849.f11035;
                while (true) {
                    AbstractC7257 abstractC7259 = (AbstractC7257) c48414.f11035.f11034;
                    if (abstractC7259.m16617(EnumC19998.f60742)) {
                        c48414 = c48414.f11035;
                        c20271.m45781(C14508.f41418);
                    } else if (abstractC7259.m16617(EnumC19998.f60721)) {
                        c48414 = c48414.f11035;
                    } else {
                        return m44160((AbstractC7257) c48414.f11034, (AbstractC7257) c48414.f11035.f11034, c48414, c15834, i, c20271);
                    }
                }
                break;
            case 14:
                if (((AbstractC7257) c4849.f11035.f11035.f11034).m16617(EnumC19998.f60806)) {
                    C4848 c48415 = c4849.f11035;
                    int iIndexOf5 = ((C7650) c48415.f11035.f11034).f20026.indexOf(c48415.f11034);
                    C15973 c15973 = (C15973) abstractC7258;
                    if (((AbstractC14355) c15973.f46262.get(0)).f18925.mo14789()) {
                        iIndexOf2 = c15973.f46262.indexOf(abstractC7257) + 1;
                    } else {
                        iIndexOf2 = c15973.f46262.indexOf(abstractC7257);
                    }
                    return C11827.m27105(c20271.m45783(), c15834, iIndexOf5, iIndexOf2, abstractC7258.f18924);
                }
                if (((AbstractC7257) c4849.f11035.f11035.f11034).m16617(EnumC19998.f60735)) {
                    C4848 c48416 = c4849.f11035;
                    int iIndexOf6 = ((C10471) c48416.f11035.f11034).f28962.indexOf(c48416.f11034);
                    C15973 c15974 = (C15973) abstractC7258;
                    if (((AbstractC14355) c15974.f46262.get(0)).f18925.mo14789()) {
                        iIndexOf = c15974.f46262.indexOf(abstractC7257) + 1;
                    } else {
                        iIndexOf = c15974.f46262.indexOf(abstractC7257);
                    }
                    return C11827.m27098(c20271.m45783(), c15834, iIndexOf6, iIndexOf, abstractC7258.f18924);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC7257 + " within frame " + abstractC7258);
            case 15:
                C13818 c13818 = ((C11281) abstractC7258).f31438;
                if (c13818.mo3347() != EnumC24473.FIELD) {
                    m44165(c13818, c13818.mo18000());
                }
                switch (C9144.f24761[c13818.mo3347().ordinal()]) {
                    case 1:
                    case 2:
                        return C11827.m27110(c20271.m45783(), c15834, abstractC7258.f18924);
                    case 3:
                        return C11827.m27108(c20271.m45783(), c15834, abstractC7258.f18924);
                    case 4:
                        if (c13818.f20408.equals(this.f57930.f55999.f21744)) {
                            return C11827.m27106(c20271.m45783(), c15834, abstractC7258.f18924);
                        }
                        while (true) {
                            EnumC19998 enumC19998Mo3383 = ((AbstractC7257) c4849.f11034).mo3383();
                            enumC19998 = EnumC19998.f60735;
                            if (enumC19998Mo3383 != enumC19998 && ((AbstractC7257) c4849.f11034).mo3383() != EnumC19998.f60747) {
                                c4849 = c4849.f11035;
                            }
                        }
                        if (((AbstractC7257) c4849.f11034).mo3383() == enumC19998) {
                            iIndexOf3 = ((C10471) c4849.f11034).f28963.indexOf(abstractC7258);
                        } else if (((AbstractC7257) c4849.f11034).mo3383() == EnumC19998.f60747) {
                            iIndexOf3 = ((C15834) c4849.f11034).f45863.indexOf(abstractC7258);
                        } else {
                            C1446.m31702("methodParamIndex expected to find method or lambda for param: " + abstractC7258);
                            throw null;
                        }
                        return C11827.m27111(c20271.m45783(), c15834, iIndexOf3, abstractC7258.f18924);
                    case 5:
                        return C11827.m27103(c20271.m45783(), c15834, abstractC7258.f18924);
                    case 6:
                        return C11827.m27101(c20271.m45783(), c15834, abstractC7258.f18924);
                    default:
                        throw new AssertionError("Found unexpected type annotation for variable: " + c13818 + " with kind: " + c13818.mo3347());
                }
            case 16:
                if (abstractC7258 == abstractC7257) {
                    AbstractC6462 abstractC6463 = ((C19720) abstractC7258).f59996.f18925;
                    C1446.m31699(abstractC6463);
                    if (!abstractC6463.f16705.mo3347().equals(EnumC24473.TYPE_PARAMETER) && !abstractC6463.mo5575().equals(EnumC3035.WILDCARD) && !abstractC6463.mo5575().equals(EnumC3035.ARRAY)) {
                        m44161(abstractC6463, c20271);
                    }
                }
                C4848 c48417 = c4849.f11035;
                return m44160((AbstractC7257) c48417.f11034, (AbstractC7257) c48417.f11035.f11034, c48417, c15834, i, c20271);
            case 17:
                C4848 c48418 = c4849.f11035;
                return m44160((AbstractC7257) c48418.f11034, (AbstractC7257) c48418.f11035.f11034, c48418, c15834, i, c20271);
            case 18:
                C4848 c48419 = c4849.f11035;
                return m44160((AbstractC7257) c48419.f11034, (AbstractC7257) c48419.f11035.f11034, c48419, c15834, ((C18656) abstractC7258).f55708.indexOf(abstractC7257), c20271);
            case 19:
                C17175 c17175 = (C17175) abstractC7258;
                if (!c17175.f51142.contains(abstractC7257)) {
                    return C11827.f33000;
                }
                C5771 c5771 = (C5771) C9268.m21438(c17175.f51143);
                int iIndexOf7 = c17175.f51142.indexOf(abstractC7257);
                if (c5771 == null) {
                    throw new AssertionError("could not determine symbol for {" + c17175 + C0249l.f1198d);
                }
                if (c5771.m17994()) {
                    return C11827.m27104(c20271.m45783(), c15834, iIndexOf7, c17175.f18924);
                }
                return C11827.m27113(c20271.m45783(), c15834, iIndexOf7, c17175.f18924);
            case 20:
            case 21:
                C4848 c48420 = c4849.f11035;
                AbstractC7257 abstractC72510 = (AbstractC7257) c48420.f11034;
                AbstractC7257 abstractC72511 = (AbstractC7257) c48420.f11035.f11034;
                c20271.m45781(C14508.f41419);
                return m44160(abstractC72510, abstractC72511, c48420, c15834, i, c20271);
            case 22:
                C4848 c48421 = c4849.f11035;
                return m44160((AbstractC7257) c48421.f11034, (AbstractC7257) c48421.f11035.f11034, c48421, c15834, i, c20271);
            default:
                throw new AssertionError("Unresolved frame: " + abstractC7258 + " of kind: " + abstractC7258.mo3381() + "\n    Looking for tree: " + abstractC7257);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20271 m44161(AbstractC6462 abstractC6462, C20271 c20271) {
        for (AbstractC6462 abstractC6462Mo7201 = abstractC6462.mo7201(); abstractC6462Mo7201 != null && abstractC6462Mo7201.mo5575() != EnumC3035.NONE && abstractC6462Mo7201.mo5575() != EnumC3035.ERROR; abstractC6462Mo7201 = abstractC6462Mo7201.mo7201()) {
            c20271.m45781(C14508.f41420);
        }
        return c20271;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        if (this.f57929) {
            return;
        }
        this.f57929 = true;
        if (this.f57931) {
            mo12739(c7650.f20022);
            m35992(c7650.f20026);
            mo12739(c7650.f20025);
            m35992(c7650.f20024);
        }
        m35992(c7650.f20020);
        if (c7650.f20027.m35942()) {
            C7480.stream(c7650.f20027.m35943()).forEach(new Consumer() { // from class: l.ۧ۠֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    C19399 c19399 = this.f35616;
                    c19399.getClass();
                    c19399.mo12739(((C22536) obj).f71072);
                }
            });
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        if (c10471.f28960 == null) {
            C1446.m31702("Visiting tree node before memberEnter");
            throw null;
        }
        boolean z = this.f57931;
        if (z) {
            if (!c10471.f28961.f9953.isEmpty()) {
                if (c10471.f28960.m17994()) {
                    m44163(c10471, null, c10471.f28960, C11827.m27099(C11827.f32999, null, c10471.f18924));
                } else {
                    m44163(c10471.f28966, c10471.f28960.f20406.mo14787(), c10471.f28960, C11827.m27099(C11827.f32999, null, c10471.f28966.f18924));
                }
            }
            C11281 c11281 = c10471.f28967;
            if (c11281 != null && c11281.f31438 != null && !c11281.f31435.f9953.isEmpty()) {
                C11827 c11827M27106 = C11827.m27106(C11827.f32999, null, c10471.f28967.f31437.f18924);
                this.f57928 = this.f57928.m10290(c10471.f28967);
                try {
                    C11281 c11282 = c10471.f28967;
                    AbstractC14355 abstractC14355 = c11282.f31437;
                    C13818 c13818 = c11282.f31438;
                    m44163(abstractC14355, c13818.f20406, c13818, c11827M27106);
                    m44166();
                } catch (Throwable th) {
                    m44166();
                    throw th;
                }
            }
            int i = 0;
            for (C11281 c11283 : c10471.f28963) {
                if (!c11283.f31435.f9953.isEmpty()) {
                    C11827 c11827M27111 = C11827.m27111(C11827.f32999, null, i, c11283.f31437.f18924);
                    this.f57928 = this.f57928.m10290(c11283);
                    try {
                        AbstractC14355 abstractC14356 = c11283.f31437;
                        C13818 c13819 = c11283.f31438;
                        m44163(abstractC14356, c13819.f20406, c13819, c11827M27111);
                        m44166();
                    } catch (Throwable th2) {
                        m44166();
                        throw th2;
                    }
                }
                i++;
            }
        }
        if (z) {
            mo12739(c10471.f28961);
            mo12739(c10471.f28966);
            m35992(c10471.f28962);
            mo12739(c10471.f28967);
            m35992(c10471.f28963);
            m35992(c10471.f28957);
            return;
        }
        mo12739(c10471.f28964);
        mo12739(c10471.f28958);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        C15834 c15835 = this.f57927;
        try {
            this.f57927 = c15834;
            int i = 0;
            for (C11281 c11281 : c15834.f45863) {
                if (!c11281.f31435.f9953.isEmpty()) {
                    C11827 c11827M27111 = C11827.m27111(C11827.f32999, c15834, i, c11281.f31437.f18924);
                    this.f57928 = this.f57928.m10290(c11281);
                    try {
                        if (!c11281.m26220()) {
                            AbstractC14355 abstractC14355 = c11281.f31437;
                            C13818 c13818 = c11281.f31438;
                            m44163(abstractC14355, c13818.f20406, c13818, c11827M27111);
                        }
                        m44166();
                    } catch (Throwable th) {
                        m44166();
                        throw th;
                    }
                }
                i++;
            }
            mo12739(c15834.f45864);
            m35992(c15834.f45863);
            this.f57927 = c15835;
        } catch (Throwable th2) {
            this.f57927 = c15835;
            throw th2;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C13818 c13818;
        boolean zIsEmpty = c11281.f31435.f9953.isEmpty();
        boolean z = this.f57931;
        if (!zIsEmpty) {
            C13818 c13819 = c11281.f31438;
            if (c13819 == null) {
                C1446.m31702("Visiting tree node before memberEnter");
                throw null;
            }
            if (c13819.mo3347() != EnumC24473.PARAMETER) {
                if (c11281.f31438.mo3347() == EnumC24473.FIELD) {
                    if (z) {
                        C11827 c11827M27108 = C11827.m27108(C11827.f32999, null, c11281.f18924);
                        AbstractC14355 abstractC14355 = c11281.f31437;
                        C13818 c138110 = c11281.f31438;
                        m44163(abstractC14355, c138110.f20406, c138110, c11827M27108);
                    }
                } else if (c11281.f31438.mo3347() == EnumC24473.LOCAL_VARIABLE) {
                    C11827 c11827M27110 = C11827.m27110(C11827.f32999, this.f57927, c11281.f18924);
                    if (!c11281.m26220()) {
                        AbstractC14355 abstractC14356 = c11281.f31437;
                        C13818 c138111 = c11281.f31438;
                        m44163(abstractC14356, c138111.f20406, c138111, c11827M27110);
                    }
                } else if (c11281.f31438.mo3347() == EnumC24473.BINDING_VARIABLE) {
                    C11827 c11827M27111 = C11827.m27110(C11827.f32999, this.f57927, c11281.f18924);
                    AbstractC14355 abstractC14357 = c11281.f31437;
                    C13818 c138112 = c11281.f31438;
                    m44163(abstractC14357, c138112.f20406, c138112, c11827M27111);
                } else if (c11281.f31438.mo3347() == EnumC24473.EXCEPTION_PARAMETER) {
                    C11827 c11827M27103 = C11827.m27103(C11827.f32999, this.f57927, c11281.f18924);
                    AbstractC14355 abstractC14358 = c11281.f31437;
                    C13818 c138113 = c11281.f31438;
                    m44163(abstractC14358, c138113.f20406, c138113, c11827M27103);
                } else if (c11281.f31438.mo3347() == EnumC24473.RESOURCE_VARIABLE) {
                    C11827 c11827M27101 = C11827.m27101(C11827.f32999, this.f57927, c11281.f18924);
                    AbstractC14355 abstractC14359 = c11281.f31437;
                    C13818 c138114 = c11281.f31438;
                    m44163(abstractC14359, c138114.f20406, c138114, c11827M27101);
                } else if (c11281.f31438.mo3347() != EnumC24473.ENUM_CONSTANT) {
                    C1446.m31702("Unhandled variable kind: " + c11281.f31438.mo3347());
                    throw null;
                }
            }
        }
        mo12739(c11281.f31435);
        mo12739(c11281.f31437);
        if (!z) {
            mo12739(c11281.f31436);
        }
        if (z && (c13818 = c11281.f31438) != null && c13818.mo3347() == EnumC24473.FIELD) {
            C13818 c138115 = c11281.f31438;
            if ((c138115.f20409 & 2305843009213693952L) != 0) {
                C22536 c22536M35935 = ((C15828) c138115.f20407).m35935(c138115);
                c22536M35935.m17993(c11281.f31438.mo18000());
                c22536M35935.f20406 = c11281.f31438.f20406;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        if (this.f57931) {
            return;
        }
        m35992(c4968.f11316);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        C15828 c15828;
        C7650 c7650 = c20530.f63428;
        if (c7650 != null && (c15828 = c7650.f20027) != null) {
            AbstractC6462 abstractC6462 = c15828.f20407.m17990().f20406;
            C20271 c20271 = new C20271();
            m44161(abstractC6462, c20271);
            c20271.m45777(C14508.f41420);
            C11827 c11827M27114 = C11827.m27114(c20271.m45783(), null, c20530.f18924);
            C20271 c20272 = new C20271();
            AbstractC6462 abstractC6463 = c20530.f63429.f18925;
            C20271 c20273 = new C20271();
            m44161(abstractC6463, c20273);
            C4848 c4848M45783 = c20273.m45783();
            for (C8552 c8552 : c15828.mo18000()) {
                if (c8552.f53587.f33011.equals(c4848M45783)) {
                    c20272.m45777(new C8552(c8552.f29256, c8552.f53589, c11827M27114));
                }
            }
            c15828.f20407.m18016(c20272.m45783());
        }
        mo12739(c20530.f63432);
        m35992(c20530.f63431);
        if (c20530.f63428 == null) {
            mo12739(c20530.f63429);
        }
        m35992(c20530.f63430);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        m44164(c19859, c19859, c19859.f60357);
        int iM10289 = c19859.f60361.m10289();
        C20271 c20271 = new C20271();
        for (int i = 0; i < iM10289; i++) {
            C20271 c20272 = new C20271();
            if (i != 0) {
                c20271.m45777(C14508.f41418);
                c20272.m45778(c20271.m45783());
            }
            m44162((C4848) c19859.f60361.get(i), C11827.m27114(c20272.m45783(), this.f57927, c19859.f18924));
        }
        AbstractC14355 abstractC14355 = c19859.f60358;
        c20271.m45777(C14508.f41418);
        while (abstractC14355 != null) {
            if (abstractC14355.m16617(EnumC19998.f60721)) {
                C19720 c19720 = (C19720) abstractC14355;
                AbstractC6462 abstractC6462 = abstractC14355.f18925;
                C20271 c20273 = new C20271();
                m44161(abstractC6462, c20273);
                m44162(c19720.f59995, C11827.m27114(c20273.m45783().m10292(c20271.m45783()), this.f57927, c19859.f18924));
                abstractC14355 = c19720.f59996;
            } else if (abstractC14355.m16617(EnumC19998.f60742)) {
                c20271.m45777(C14508.f41418);
                abstractC14355 = ((C25084) abstractC14355).f80025;
            } else if (!abstractC14355.m16617(EnumC19998.f60805)) {
                break;
            } else {
                abstractC14355 = ((C8320) abstractC14355).f22261;
            }
        }
        m35992(c19859.f60359);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44164(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, C4848 c4848) {
        if (c4848.isEmpty()) {
            return;
        }
        m44162(c4848, m44160(abstractC7257, abstractC7258, this.f57928, this.f57927, 0, new C20271()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44162(C4848 c4848, C11827 c11827) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C17939 c17939 = ((C19049) it.next()).f56842;
            if (c17939 != null) {
                ((C8552) c17939).f53587 = c11827;
            }
        }
    }

    public final String toString() {
        return super.toString() + ": sigOnly: " + this.f57931;
    }

    public C19399(C18728 c18728, boolean z) {
        this.f57930 = c18728;
        this.f57931 = z;
    }
}
