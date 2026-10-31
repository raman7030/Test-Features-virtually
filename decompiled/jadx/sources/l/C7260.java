package l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes2.dex */
public final class C7260 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m19435(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 1) {
            return ((C15580) abstractC5144).f48012;
        }
        if (i != 2) {
            return null;
        }
        return ((C19110) abstractC5144).f60197;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m19463(AbstractC5144 abstractC5144) {
        if (abstractC5144.m14709(EnumC18550.f57511)) {
            AbstractC10370 abstractC10370 = ((C8526) abstractC5144).f26044;
            if (abstractC10370 == abstractC10370.f31203.f37517.f18879) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m19454(AbstractC5144 abstractC5144) {
        return (!m19463(abstractC5144) || (((C8526) abstractC5144).f26045.f17563 & 2305843009213693952L) == 0 || (((C8526) abstractC5144).f26045.f17563 & 2251799813685248L) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m19440(C2609 c2609, C6136 c6136) {
        AbstractC10370 abstractC10370M19462;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            if (abstractC5144.m14709(EnumC18550.f57478)) {
                C10496 c10496 = (C10496) abstractC5144;
                if (c10496.f31483.m14709(EnumC18550.f57534) && ((abstractC10370M19462 = m19462(((C15580) c10496.f31483).f48011)) == c6136.f18886 || abstractC10370M19462 == c6136.f18898)) {
                    return abstractC10370M19462;
                }
            }
        }
        return c6136.f18867;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m19430(AbstractC5144 abstractC5144) {
        C6262 c6262;
        AbstractC5698 abstractC5698;
        AbstractC10370 abstractC10370M19462;
        if (!abstractC5144.m14709(EnumC18550.f57478)) {
            return false;
        }
        C10496 c10496 = (C10496) abstractC5144;
        if (!c10496.f31483.m14709(EnumC18550.f57522)) {
            return false;
        }
        C21080 c21080 = (C21080) c10496.f31483;
        return (!c21080.f67987.m14709(EnumC18550.f57581) || (abstractC5698 = (c6262 = (C6262) c21080.f67987).f19396) == null || (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || (abstractC10370M19462 = m19462(c6262.f19397)) == null || abstractC10370M19462 != abstractC10370M19462.f31203.f37517.f18886) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m19451(AbstractC5144 abstractC5144) {
        AbstractC10370 abstractC10370M19462;
        if (abstractC5144.m14709(EnumC18550.f57478)) {
            C10496 c10496 = (C10496) abstractC5144;
            if (c10496.f31483.m14709(EnumC18550.f57534)) {
                abstractC10370M19462 = m19462(((C15580) c10496.f31483).f48011);
            } else {
                abstractC10370M19462 = null;
            }
        } else {
            abstractC10370M19462 = null;
        }
        return abstractC10370M19462 != null && abstractC10370M19462 == abstractC10370M19462.f31203.f37517.f18898;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m19453(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 3) {
            return m19453(m19471(abstractC5144));
        }
        if (i != 4) {
            return false;
        }
        AbstractC10370 abstractC10370 = ((C7673) abstractC5144).f23696;
        return abstractC10370 == abstractC10370.f31203.f37517.f18886;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m19468(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 3) {
            return m19468(m19471(abstractC5144));
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        return m19453(((C6262) abstractC5144).f19397);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m19436(C5557 c5557) {
        return (C2609) C5378.stream(c5557.f17179).filter(new C15690(4)).map(new C2286(11)).filter(new C12543(2)).collect(C2609.m8240());
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m19469(AbstractC5144 abstractC5144) {
        C15580 c15580M19466 = m19466(abstractC5144);
        if (c15580M19466 == null) {
            return false;
        }
        AbstractC10370 abstractC10370M19462 = m19462(c15580M19466.f48011);
        return abstractC10370M19462 == null || abstractC10370M19462 != abstractC10370M19462.f31203.f37517.f18886;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C15580 m19466(AbstractC5144 abstractC5144) {
        C2735 c2735;
        if (!abstractC5144.m14709(EnumC18550.f57511)) {
            return null;
        }
        C8526 c8526 = (C8526) abstractC5144;
        AbstractC10370 abstractC10370 = c8526.f26044;
        if (abstractC10370 != abstractC10370.f31203.f37517.f18879 || (c2735 = c8526.f26043) == null) {
            return null;
        }
        C2609 c2609 = c2735.f8521;
        while (c2609.m8249() && m19430((AbstractC5144) c2609.f8240)) {
            c2609 = c2609.f8241;
        }
        if (c2609.isEmpty() || !((AbstractC11349) c2609.f8240).m14709(EnumC18550.f57478)) {
            return null;
        }
        C10496 c10496 = (C10496) c2609.f8240;
        if (c10496.f31483.m14709(EnumC18550.f57534)) {
            return (C15580) c10496.f31483;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m19449(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 2) {
            return m19449(((C19110) abstractC5144).f60196);
        }
        if (i == 6) {
            return ((C16432) abstractC5144).f50541.isEmpty();
        }
        if (i != 7) {
            return false;
        }
        return m19449(((C18257) abstractC5144).f56779);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m19450(AbstractC5144 abstractC5144) {
        return C12904.f38715[abstractC5144.mo989().ordinal()] == 8 && (((C9378) abstractC5144).f28486.f7169 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19445(AbstractC5144 abstractC5144, EnumC19816 enumC19816) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 1) {
            ((C15580) abstractC5144).f13845 = enumC19816;
            return;
        }
        if (i == 2) {
            ((C19110) abstractC5144).f13845 = enumC19816;
        } else if (i == 9) {
            ((C9232) abstractC5144).f27941 = enumC19816;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC5144);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19444(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 1) {
            ((C15580) abstractC5144).f48009 = abstractC4308;
            return;
        }
        if (i == 2) {
            ((C19110) abstractC5144).f60193 = abstractC4308;
        } else if (i == 9) {
            ((C9232) abstractC5144).f27948 = abstractC4308;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC5144);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19447(AbstractC12612 abstractC12612) {
        int i = C12904.f38715[abstractC12612.mo989().ordinal()];
        if (i != 1 && i != 2) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19446(AbstractC5144 abstractC5144, C6136 c6136) {
        if (abstractC5144 != null) {
            int i = C12904.f38715[abstractC5144.mo989().ordinal()];
            if (i == 4) {
                AbstractC10370 abstractC10370 = ((C7673) abstractC5144).f23696;
                if (abstractC10370 != c6136.f18886 && abstractC10370 != c6136.f18898) {
                    EnumC1296 enumC1296 = m19472(abstractC5144).f17559;
                    return enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4579;
                }
            } else {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return m19446(((C18257) abstractC5144).f56779, c6136);
                        }
                        if (i != 27) {
                        }
                    }
                    return true;
                }
                EnumC1296 enumC1297 = m19472(abstractC5144).f17559;
                if ((enumC1297 == EnumC1296.f4582 || enumC1297 == EnumC1296.f4579) && m19446(((C6262) abstractC5144).f19397, c6136)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m19429(AbstractC5144 abstractC5144) {
        return abstractC5144.m14709(EnumC18550.f57580) && ((C23342) abstractC5144).f74996 == EnumC9454.BOT;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m19461(AbstractC5144 abstractC5144) {
        if (abstractC5144.m14709(EnumC18550.f57550)) {
            C2735 c2735 = (C2735) abstractC5144;
            if (c2735.f8521.m8249()) {
                return ((AbstractC11349) c2735.f8521.f8240).f16085;
            }
        }
        return abstractC5144.f16085;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m19467(AbstractC5144 abstractC5144) {
        int i;
        int i2;
        int i3;
        if (abstractC5144.m14709(EnumC18550.f57550) && (i3 = ((C2735) abstractC5144).f8520) != -1) {
            return i3;
        }
        if (abstractC5144.m14709(EnumC18550.f57543)) {
            return m19467(((C7115) abstractC5144).f21830);
        }
        if (abstractC5144.m14709(EnumC18550.f57571)) {
            C10789 c10789 = (C10789) abstractC5144;
            C2735 c2735 = c10789.f32448;
            if (c2735 == null) {
                c2735 = c10789.f32449.m8249() ? ((C0617) c10789.f32449.last()).f2372 : c10789.f32445;
            }
            return m19467(c2735);
        }
        if (!abstractC5144.m14709(EnumC18550.f57558) || (i2 = ((C22637) abstractC5144).f73106) == -1) {
            return (!abstractC5144.m14709(EnumC18550.f57555) || (i = ((C13464) abstractC5144).f40198) == -1) ? abstractC5144.f16085 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int m19455(AbstractC5144 abstractC5144) {
        if (abstractC5144 == null) {
            return -1;
        }
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 1) {
            return m19455(((C15580) abstractC5144).f48011);
        }
        if (i == 2) {
            AbstractC12612 abstractC12612 = ((C19110) abstractC5144).f60199;
            if (abstractC12612 != null) {
                return m19455(abstractC12612);
            }
        } else {
            if (i == 5) {
                return m19455(((C6262) abstractC5144).f19397);
            }
            if (i == 6) {
                return m19455(((C16432) abstractC5144).f50542);
            }
            if (i == 7) {
                C18257 c18257 = (C18257) abstractC5144;
                if (c18257.f56778.m8249()) {
                    if (c18257.f56779.m14709(EnumC18550.f57518) || c18257.f56779.m14709(EnumC18550.f57581)) {
                        return m19455(c18257.f56779);
                    }
                    return m19455((AbstractC5144) c18257.f56778.f8240);
                }
                return m19455(c18257.f56779);
            }
            if (i != 8) {
                switch (i) {
                    case 12:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                        return m19455(((AbstractC0764) abstractC5144).mo2919(EnumC4998.LEFT));
                    case 14:
                        return m19455(((C21080) abstractC5144).f67987);
                    case 26:
                        C2609 c2609 = ((C3440) abstractC5144).f10874;
                        if (c2609 != null && c2609.m8249()) {
                            return m19455((AbstractC5144) c2609.f8240);
                        }
                        break;
                    case 27:
                        return m19455(((C23901) abstractC5144).f77274);
                    case 28:
                        C3587 c3587 = (C3587) abstractC5144;
                        C2176 c2176 = c3587.f11379;
                        return c2176.f7168.isEmpty() ? c3587.f16085 : ((C17551) c2176.f7168.f8240).f16085;
                    case 29:
                        C7820 c7820 = (C7820) abstractC5144;
                        return c7820.f24198.isEmpty() ? c7820.f16085 : ((C17551) c7820.f24198.f8240).f16085;
                    case 49:
                        int i2 = ((C5557) abstractC5144).f17181.f16085;
                        if (i2 != -1) {
                            return i2;
                        }
                        break;
                    case 50:
                        return m19455(((C8379) abstractC5144).f25701);
                    case 51:
                        return m19455(((C10496) abstractC5144).f31483);
                    case 52:
                        return m19455(((C14728) abstractC5144).f44980);
                    case 53:
                        C8526 c8526 = (C8526) abstractC5144;
                        int i3 = c8526.f26046.f16085;
                        if (i3 != -1) {
                            return i3;
                        }
                        if (c8526.f26047.m8249()) {
                            return m19455((AbstractC5144) c8526.f26047.f8240);
                        }
                        AbstractC12612 abstractC12613 = c8526.f26051;
                        return abstractC12613 == null ? c8526.f16085 : m19455(abstractC12613);
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        return m19455(((C16286) abstractC5144).f50075);
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        return m19455(((C16139) abstractC5144).f49721);
                    case 56:
                        return m19455(((C14022) abstractC5144).f42404);
                }
            } else {
                C9378 c9378 = (C9378) abstractC5144;
                int i4 = c9378.f28485;
                if (i4 != -1) {
                    return i4;
                }
                int i5 = c9378.f28486.f16085;
                if (i5 != -1) {
                    return i5;
                }
                AbstractC12612 abstractC12614 = c9378.f28488;
                if (abstractC12614 == null || abstractC12614.f16085 == -1) {
                    return c9378.f16085;
                }
                return m19455(abstractC12614);
            }
        }
        return abstractC5144.f16085;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19431(AbstractC5144 abstractC5144, InterfaceC2029 interfaceC2029) {
        if (abstractC5144 != null) {
            if (interfaceC2029 == null) {
                return m19467(abstractC5144);
            }
            int iMo6593 = interfaceC2029.mo6593(abstractC5144);
            if (iMo6593 != -1) {
                return iMo6593;
            }
            int i = C12904.f38715[abstractC5144.mo989().ordinal()];
            if (i == 7) {
                return m19431(((C18257) abstractC5144).f56779, interfaceC2029);
            }
            if (i == 50) {
                return m19431(((C8379) abstractC5144).f25700, interfaceC2029);
            }
            if (i != 54) {
                if (i != 10 && i != 11) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        case 26:
                            C2609 c2609 = ((C3440) abstractC5144).f10874;
                            if (c2609 != null && c2609.m8249()) {
                                return m19431((AbstractC5144) c2609.last(), interfaceC2029);
                            }
                            break;
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 56:
                                            return m19431(((C14022) abstractC5144).f42403, interfaceC2029);
                                        case 61:
                                            return m19431((AbstractC5144) ((C18963) abstractC5144).f59814.last(), interfaceC2029);
                                        case 62:
                                            return m19431(((C0617) abstractC5144).f2372, interfaceC2029);
                                        case 63:
                                            return m19431(((C11907) abstractC5144).f35585, interfaceC2029);
                                        case 64:
                                            return m19431(((C4851) abstractC5144).f15324, interfaceC2029);
                                        case 65:
                                            C1470 c1470 = (C1470) abstractC5144;
                                            AbstractC11349 abstractC11349 = c1470.f5227;
                                            if (abstractC11349 == null) {
                                                return m19431(c1470.f5226, interfaceC2029);
                                            }
                                            return m19431(abstractC11349, interfaceC2029);
                                        case 66:
                                            return m19431(((C17698) abstractC5144).f54159, interfaceC2029);
                                        case 67:
                                            return m19431((AbstractC5144) ((C2176) abstractC5144).f7168.last(), interfaceC2029);
                                        case 68:
                                            return m19431(((C7115) abstractC5144).f21830, interfaceC2029);
                                        case 69:
                                            return m19431((AbstractC5144) ((C1323) abstractC5144).f4738.last(), interfaceC2029);
                                        case 70:
                                            C10789 c10789 = (C10789) abstractC5144;
                                            C2735 c2735 = c10789.f32448;
                                            if (c2735 != null) {
                                                return m19431(c2735, interfaceC2029);
                                            }
                                            if (!c10789.f32449.isEmpty()) {
                                                return m19431((AbstractC5144) c10789.f32449.last(), interfaceC2029);
                                            }
                                            return m19431(c10789.f32445, interfaceC2029);
                                        case 71:
                                            return m19431(((C15726) abstractC5144).f48501, interfaceC2029);
                                        case 72:
                                            return m19431(((C17844) abstractC5144).f54512, interfaceC2029);
                                        case 73:
                                            return m19431(((C8672) abstractC5144).f26444, interfaceC2029);
                                        case 74:
                                            return m19431(((C21227) abstractC5144).f68420, interfaceC2029);
                                    }
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                case 46:
                                case 47:
                                case 48:
                                    return m19431(((AbstractC0764) abstractC5144).mo2919(EnumC4998.RIGHT), interfaceC2029);
                            }
                    }
                }
                return m19431(((AbstractC0764) abstractC5144).mo2919(EnumC4998.RIGHT), interfaceC2029);
            }
            return m19431(((C16286) abstractC5144).f50076, interfaceC2029);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3109 m19464(AbstractC5144 abstractC5144) {
        return new C4438(abstractC5144, m19467(abstractC5144));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19432(AbstractC5144 abstractC5144, EnumC22782 enumC22782) {
        if (abstractC5144.m14709(EnumC18550.f57571)) {
            C10789 c10789 = (C10789) abstractC5144;
            C12171.m29637(c10789.f32448);
            return enumC22782.m50863(c10789.f32448);
        }
        if (abstractC5144.m14709(EnumC18550.f57543)) {
            return m19467(((C7115) abstractC5144).f21830);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5144 m19439(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144, boolean z) {
        C3027 c3027 = new C3027(abstractC5698);
        abstractC5144.mo988(c3027);
        AbstractC5144 abstractC5145 = c3027.f36411;
        if (abstractC5145 == null && z) {
            return null;
        }
        return abstractC5145 != null ? abstractC5145 : abstractC5144;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5144 m19438(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        C12199 c12199 = new C12199(abstractC5698);
        abstractC5144.mo988(c12199);
        return c12199.f36411;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11349 m19441(C17698 c17698) {
        AbstractC11349 abstractC11349 = c17698;
        do {
            abstractC11349 = ((C17698) abstractC11349).f54159;
        } while (abstractC11349.m14709(EnumC18550.f57532));
        int i = C12904.f38715[abstractC11349.mo989().ordinal()];
        return (i == 63 || i == 64 || i == 73 || i == 75 || i == 76) ? abstractC11349 : c17698;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC12612 m19458(AbstractC12612 abstractC12612) {
        while (abstractC12612.m14709(EnumC18550.f57482)) {
            abstractC12612 = ((C14875) abstractC12612).f45392;
        }
        return abstractC12612;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC5144 m19471(AbstractC5144 abstractC5144) {
        return abstractC5144.m14709(EnumC18550.f57482) ? m19458((AbstractC12612) abstractC5144) : abstractC5144;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m19434(C2609 c2609) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(((AbstractC5144) c2609.f8240).f16086);
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m19462(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 4) {
            return ((C7673) abstractC5144).f23696;
        }
        if (i == 5) {
            return ((C6262) abstractC5144).f19395;
        }
        if (i != 6) {
            return null;
        }
        return m19462(((C16432) abstractC5144).f50542);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m19452(AbstractC5144 abstractC5144) {
        AbstractC10370 abstractC10370M19452;
        AbstractC5144 abstractC5144M19471 = m19471(abstractC5144);
        int i = C12904.f38715[abstractC5144M19471.mo989().ordinal()];
        if (i == 4) {
            return ((C7673) abstractC5144M19471).f23696;
        }
        if (i == 5 && (abstractC10370M19452 = m19452(((C6262) abstractC5144M19471).f19397)) != null) {
            return abstractC10370M19452.m26171('.', m19462(abstractC5144M19471));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m19472(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5144M19471 = m19471(abstractC5144);
        int i = C12904.f38715[abstractC5144M19471.mo989().ordinal()];
        if (i == 4) {
            return ((C7673) abstractC5144M19471).f23697;
        }
        if (i == 5) {
            return ((C6262) abstractC5144M19471).f19396;
        }
        if (i == 6) {
            return m19472(((C16432) abstractC5144M19471).f50542);
        }
        if (i == 7) {
            return m19472(((C18257) abstractC5144M19471).f56779);
        }
        if (i != 9) {
            return null;
        }
        return ((C9232) abstractC5144M19471).f27943;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2176 m19470(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5144M19471 = m19471(abstractC5144);
        int i = C12904.f38715[abstractC5144M19471.mo989().ordinal()];
        if (i == 8) {
            return ((C9378) abstractC5144M19471).f28486;
        }
        if (i == 28) {
            return ((C3587) abstractC5144M19471).f11379;
        }
        if (i == 49) {
            return ((C5557) abstractC5144M19471).f17181;
        }
        if (i != 53) {
            return null;
        }
        return ((C8526) abstractC5144M19471).f26046;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19459(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5144M19471 = m19471(abstractC5144);
        int i = C12904.f38715[abstractC5144M19471.mo989().ordinal()];
        if (i == 4) {
            ((C7673) abstractC5144M19471).f23697 = abstractC5698;
        } else {
            if (i != 5) {
                return;
            }
            ((C6262) abstractC5144M19471).f19396 = abstractC5698;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long m19473(AbstractC5144 abstractC5144) {
        int i = C12904.f38715[abstractC5144.mo989().ordinal()];
        if (i == 8) {
            return ((C9378) abstractC5144).f28486.f7169;
        }
        if (i == 49) {
            return ((C5557) abstractC5144).f17181.f7169;
        }
        if (i == 53) {
            return ((C8526) abstractC5144).f26046.f7169;
        }
        if (i != 80) {
            return 0L;
        }
        return ((C2735) abstractC5144).f8522;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19433(EnumC18550 enumC18550) {
        int i = C12904.f38715[enumC18550.ordinal()];
        if (i == 54) {
            return 10;
        }
        if (i == 81) {
            return 15;
        }
        switch (i) {
            case 10:
            case 11:
                return 14;
            case 12:
            case 13:
                return 15;
            case 14:
                return 1;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return 2;
            default:
                switch (i) {
                    case 30:
                        return 4;
                    case 31:
                        return 5;
                    case 32:
                        return 6;
                    case 33:
                        return 7;
                    case 34:
                        return 8;
                    case 35:
                    case 36:
                        return 9;
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        return 10;
                    case 41:
                    case 42:
                    case 43:
                        return 11;
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        return 12;
                    case 46:
                    case 47:
                    case 48:
                        return 13;
                    default:
                        switch (i) {
                            case 57:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case 60:
                                return 14;
                            default:
                                throw new AssertionError();
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC3329 m19456(EnumC18550 enumC18550) {
        int i = C12904.f38715[enumC18550.ordinal()];
        if (i == 77) {
            return EnumC3329.ANNOTATION;
        }
        if (i != 78) {
            switch (i) {
                case 10:
                    return EnumC3329.PREFIX_INCREMENT;
                case 11:
                    return EnumC3329.PREFIX_DECREMENT;
                case 12:
                    return EnumC3329.POSTFIX_INCREMENT;
                case 13:
                    return EnumC3329.POSTFIX_DECREMENT;
                default:
                    switch (i) {
                        case 15:
                            return EnumC3329.OR_ASSIGNMENT;
                        case 16:
                            return EnumC3329.XOR_ASSIGNMENT;
                        case 17:
                            return EnumC3329.AND_ASSIGNMENT;
                        case 18:
                            return EnumC3329.LEFT_SHIFT_ASSIGNMENT;
                        case 19:
                            return EnumC3329.RIGHT_SHIFT_ASSIGNMENT;
                        case 20:
                            return EnumC3329.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT;
                        case 21:
                            return EnumC3329.PLUS_ASSIGNMENT;
                        case 22:
                            return EnumC3329.MINUS_ASSIGNMENT;
                        case 23:
                            return EnumC3329.MULTIPLY_ASSIGNMENT;
                        case 24:
                            return EnumC3329.DIVIDE_ASSIGNMENT;
                        case 25:
                            return EnumC3329.REMAINDER_ASSIGNMENT;
                        default:
                            switch (i) {
                                case 30:
                                    return EnumC3329.CONDITIONAL_OR;
                                case 31:
                                    return EnumC3329.CONDITIONAL_AND;
                                case 32:
                                    return EnumC3329.OR;
                                case 33:
                                    return EnumC3329.XOR;
                                case 34:
                                    return EnumC3329.AND;
                                case 35:
                                    return EnumC3329.EQUAL_TO;
                                case 36:
                                    return EnumC3329.NOT_EQUAL_TO;
                                case 37:
                                    return EnumC3329.LESS_THAN;
                                case 38:
                                    return EnumC3329.GREATER_THAN;
                                case 39:
                                    return EnumC3329.LESS_THAN_EQUAL;
                                case 40:
                                    return EnumC3329.GREATER_THAN_EQUAL;
                                case 41:
                                    return EnumC3329.LEFT_SHIFT;
                                case 42:
                                    return EnumC3329.RIGHT_SHIFT;
                                case 43:
                                    return EnumC3329.UNSIGNED_RIGHT_SHIFT;
                                case 44:
                                    return EnumC3329.PLUS;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    return EnumC3329.MINUS;
                                case 46:
                                    return EnumC3329.MULTIPLY;
                                case 47:
                                    return EnumC3329.DIVIDE;
                                case 48:
                                    return EnumC3329.REMAINDER;
                                default:
                                    switch (i) {
                                        case 57:
                                            return EnumC3329.UNARY_PLUS;
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            return EnumC3329.UNARY_MINUS;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            return EnumC3329.LOGICAL_COMPLEMENT;
                                        case 60:
                                            return EnumC3329.BITWISE_COMPLEMENT;
                                        default:
                                            switch (i) {
                                                case 81:
                                                    return EnumC3329.OTHER;
                                                case 82:
                                                    return EnumC3329.EXPORTS;
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                    return EnumC3329.OPENS;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
        return EnumC3329.TYPE_ANNOTATION;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC12612 m19465(AbstractC12612 abstractC12612) {
        int i = C12904.f38715[abstractC12612.mo989().ordinal()];
        if (i == 4 || i == 5 || i == 6) {
            return abstractC12612;
        }
        if (i == 7) {
            return ((C18257) abstractC12612).f56779;
        }
        if (i == 26 || i == 27 || i == 71 || i == 79 || i == 84) {
            return abstractC12612;
        }
        throw new AssertionError("Unexpected type tree: " + abstractC12612);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5144 m19437(AbstractC5144 abstractC5144, boolean z) {
        AbstractC5144 abstractC5145;
        int i;
        while (true) {
            abstractC5145 = null;
            while (true) {
                i = C12904.f38715[abstractC5144.mo989().ordinal()];
                if (i != 7) {
                    break;
                }
                abstractC5145 = abstractC5144;
                abstractC5144 = ((C18257) abstractC5144).f56779;
            }
            if (i == 27) {
                abstractC5144 = ((C23901) abstractC5144).f77274;
            } else {
                if (i != 71) {
                    break;
                }
                abstractC5144 = ((C15726) abstractC5144).f48501;
            }
        }
        return (z || abstractC5145 == null) ? abstractC5144 : abstractC5145;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m19460(AbstractC5144 abstractC5144) {
        C13609 c13609 = new C13609();
        c13609.f40603 = false;
        c13609.mo10758(abstractC5144);
        return c13609.f40603;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19448(AbstractC12612 abstractC12612, C2609 c2609) {
        return abstractC12612.f16086.f13890.f17559 == EnumC1296.f4581 && C5378.stream(c2609).flatMap(new C1981(7)).allMatch(new C23159(2));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10083 m19457(AbstractC21932 abstractC21932) {
        int i = C12904.f38715[abstractC21932.mo989().ordinal()];
        boolean z = true;
        if (i == 55) {
            return new C10083(((C16139) abstractC21932).f16086, true);
        }
        if (i != 56) {
            if (i == 74) {
                return m19457(((C21227) abstractC21932).f68420);
            }
            throw new AssertionError();
        }
        C14022 c14022 = (C14022) abstractC21932;
        C10083 c10083M19457 = m19457(c14022.f42404);
        boolean zM25341 = c10083M19457.m25341();
        if (c14022.f42403.f16086.m12913(EnumC9454.BOOLEAN) && zM25341) {
            Object objMo12915 = c14022.f42403.f16086.mo12915();
            if (objMo12915 == null || ((Integer) objMo12915).intValue() != 1) {
                z = false;
            }
        } else {
            z = zM25341;
        }
        return new C10083(c10083M19457.m25340(), z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16139 m19442(AbstractC21932 abstractC21932) {
        int i = C12904.f38715[abstractC21932.mo989().ordinal()];
        if (i == 55) {
            return (C16139) abstractC21932;
        }
        if (i == 56) {
            return m19442(((C14022) abstractC21932).f42404);
        }
        if (i == 74) {
            return m19442(((C21227) abstractC21932).f68420);
        }
        throw new AssertionError();
    }
}
