package p067l;

import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes2.dex */
public final class C9268 {
    /* JADX INFO: renamed from: ֫ */
    public static C4848 m21401(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 1) {
            return ((C17175) abstractC7257).f51144;
        }
        if (i != 2) {
            return null;
        }
        return ((C20530) abstractC7257).f63430;
    }

    /* JADX INFO: renamed from: ܺ */
    public static boolean m21429(AbstractC7257 abstractC7257) {
        if (abstractC7257.m16617(EnumC19998.f60735)) {
            AbstractC12224 abstractC12224 = ((C10471) abstractC7257).f28959;
            if (abstractC12224 == abstractC12224.f34165.f40540.f21737) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m21420(AbstractC7257 abstractC7257) {
        return (!m21429(abstractC7257) || (((C10471) abstractC7257).f28960.f20409 & 2305843009213693952L) == 0 || (((C10471) abstractC7257).f28960.f20409 & 2251799813685248L) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC12224 m21406(C4848 c4848, C8200 c8200) {
        AbstractC12224 abstractC12224M21428;
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
            if (abstractC7257.m16617(EnumC19998.f60702)) {
                C12344 c12344 = (C12344) abstractC7257;
                if (c12344.f34446.m16617(EnumC19998.f60758) && ((abstractC12224M21428 = m21428(((C17175) c12344.f34446).f51143)) == c8200.f21744 || abstractC12224M21428 == c8200.f21756)) {
                    return abstractC12224M21428;
                }
            }
        }
        return c8200.f21725;
    }

    /* JADX INFO: renamed from: ֨ */
    public static boolean m21396(AbstractC7257 abstractC7257) {
        C8320 c8320;
        AbstractC7783 abstractC7783;
        AbstractC12224 abstractC12224M21428;
        if (!abstractC7257.m16617(EnumC19998.f60702)) {
            return false;
        }
        C12344 c12344 = (C12344) abstractC7257;
        if (!c12344.f34446.m16617(EnumC19998.f60746)) {
            return false;
        }
        C22403 c22403 = (C22403) c12344.f34446;
        return (!c22403.f70670.m16617(EnumC19998.f60805) || (abstractC7783 = (c8320 = (C8320) c22403.f70670).f22260) == null || (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || (abstractC12224M21428 = m21428(c8320.f22261)) == null || abstractC12224M21428 != abstractC12224M21428.f34165.f40540.f21744) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ۚ */
    public static boolean m21417(AbstractC7257 abstractC7257) {
        AbstractC12224 abstractC12224M21428;
        if (abstractC7257.m16617(EnumC19998.f60702)) {
            C12344 c12344 = (C12344) abstractC7257;
            if (c12344.f34446.m16617(EnumC19998.f60758)) {
                abstractC12224M21428 = m21428(((C17175) c12344.f34446).f51143);
            } else {
                abstractC12224M21428 = null;
            }
        } else {
            abstractC12224M21428 = null;
        }
        return abstractC12224M21428 != null && abstractC12224M21428 == abstractC12224M21428.f34165.f40540.f21756;
    }

    /* JADX INFO: renamed from: ۠ */
    public static boolean m21419(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 3) {
            return m21419(m21437(abstractC7257));
        }
        if (i != 4) {
            return false;
        }
        AbstractC12224 abstractC12224 = ((C9661) abstractC7257).f26610;
        return abstractC12224 == abstractC12224.f34165.f40540.f21744;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static boolean m21434(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 3) {
            return m21434(m21437(abstractC7257));
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        return m21419(((C8320) abstractC7257).f22261);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m21402(C7650 c7650) {
        return (C4848) C7480.stream(c7650.f20020).filter(new C17280(4)).map(new C4541(11)).filter(new C14289(2)).collect(C4848.m10284());
    }

    /* JADX INFO: renamed from: ᩵ */
    public static boolean m21435(AbstractC7257 abstractC7257) {
        C17175 c17175M21432 = m21432(abstractC7257);
        if (c17175M21432 == null) {
            return false;
        }
        AbstractC12224 abstractC12224M21428 = m21428(c17175M21432.f51143);
        return abstractC12224M21428 == null || abstractC12224M21428 != abstractC12224M21428.f34165.f40540.f21744;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C17175 m21432(AbstractC7257 abstractC7257) {
        C4968 c4968;
        if (!abstractC7257.m16617(EnumC19998.f60735)) {
            return null;
        }
        C10471 c10471 = (C10471) abstractC7257;
        AbstractC12224 abstractC12224 = c10471.f28959;
        if (abstractC12224 != abstractC12224.f34165.f40540.f21737 || (c4968 = c10471.f28958) == null) {
            return null;
        }
        C4848 c4848 = c4968.f11316;
        while (c4848.m10293() && m21396((AbstractC7257) c4848.f11034)) {
            c4848 = c4848.f11035;
        }
        if (c4848.isEmpty() || !((AbstractC13154) c4848.f11034).m16617(EnumC19998.f60702)) {
            return null;
        }
        C12344 c12344 = (C12344) c4848.f11034;
        if (c12344.f34446.m16617(EnumC19998.f60758)) {
            return (C17175) c12344.f34446;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ */
    public static boolean m21415(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 2) {
            return m21415(((C20530) abstractC7257).f63429);
        }
        if (i == 6) {
            return ((C17985) abstractC7257).f53721.isEmpty();
        }
        if (i != 7) {
            return false;
        }
        return m21415(((C19720) abstractC7257).f59996);
    }

    /* JADX INFO: renamed from: ۘ */
    public static boolean m21416(AbstractC7257 abstractC7257) {
        return C14632.f41758[abstractC7257.mo3383().ordinal()] == 8 && (((C11281) abstractC7257).f31435.f9954 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21411(AbstractC7257 abstractC7257, EnumC21201 enumC21201) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 1) {
            ((C17175) abstractC7257).f16661 = enumC21201;
            return;
        }
        if (i == 2) {
            ((C20530) abstractC7257).f16661 = enumC21201;
        } else if (i == 9) {
            ((C11142) abstractC7257).f30887 = enumC21201;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC7257);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21410(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 1) {
            ((C17175) abstractC7257).f51141 = abstractC6462;
            return;
        }
        if (i == 2) {
            ((C20530) abstractC7257).f63426 = abstractC6462;
        } else if (i == 9) {
            ((C11142) abstractC7257).f30894 = abstractC6462;
        } else {
            throw new AssertionError("Unexpected tree: " + abstractC7257);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21413(AbstractC14355 abstractC14355) {
        int i = C14632.f41758[abstractC14355.mo3383().ordinal()];
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21412(AbstractC7257 abstractC7257, C8200 c8200) {
        if (abstractC7257 != null) {
            int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
            if (i == 4) {
                AbstractC12224 abstractC12224 = ((C9661) abstractC7257).f26610;
                if (abstractC12224 != c8200.f21744 && abstractC12224 != c8200.f21756) {
                    EnumC3600 enumC3600 = m21438(abstractC7257).f20405;
                    return enumC3600 == EnumC3600.f7354 || enumC3600 == EnumC3600.f7351;
                }
            } else {
                if (i != 5) {
                    if (i != 6) {
                        if (i == 7) {
                            return m21412(((C19720) abstractC7257).f59996, c8200);
                        }
                        if (i != 27) {
                        }
                    }
                    return true;
                }
                EnumC3600 enumC3601 = m21438(abstractC7257).f20405;
                if ((enumC3601 == EnumC3600.f7354 || enumC3601 == EnumC3600.f7351) && m21412(((C8320) abstractC7257).f22261, c8200)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ */
    public static boolean m21395(AbstractC7257 abstractC7257) {
        return abstractC7257.m16617(EnumC19998.f60804) && ((C24552) abstractC7257).f77743 == EnumC11353.BOT;
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m21427(AbstractC7257 abstractC7257) {
        if (abstractC7257.m16617(EnumC19998.f60774)) {
            C4968 c4968 = (C4968) abstractC7257;
            if (c4968.f11316.m10293()) {
                return ((AbstractC13154) c4968.f11316.f11034).f18924;
            }
        }
        return abstractC7257.f18924;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m21433(AbstractC7257 abstractC7257) {
        int i;
        int i2;
        int i3;
        if (abstractC7257.m16617(EnumC19998.f60774) && (i3 = ((C4968) abstractC7257).f11315) != -1) {
            return i3;
        }
        if (abstractC7257.m16617(EnumC19998.f60767)) {
            return m21433(((C9130) abstractC7257).f24710);
        }
        if (abstractC7257.m16617(EnumC19998.f60795)) {
            C12622 c12622 = (C12622) abstractC7257;
            C4968 c4968 = c12622.f35424;
            if (c4968 == null) {
                c4968 = c12622.f35425.m10293() ? ((C2955) c12622.f35425.last()).f5146 : c12622.f35421;
            }
            return m21433(c4968);
        }
        if (!abstractC7257.m16617(EnumC19998.f60782) || (i2 = ((C23882) abstractC7257).f75832) == -1) {
            return (!abstractC7257.m16617(EnumC19998.f60779) || (i = ((C15164) abstractC7257).f43268) == -1) ? abstractC7257.f18924 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۢ */
    public static int m21421(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null) {
            return -1;
        }
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 1) {
            return m21421(((C17175) abstractC7257).f51143);
        }
        if (i == 2) {
            AbstractC14355 abstractC14355 = ((C20530) abstractC7257).f63432;
            if (abstractC14355 != null) {
                return m21421(abstractC14355);
            }
        } else {
            if (i == 5) {
                return m21421(((C8320) abstractC7257).f22261);
            }
            if (i == 6) {
                return m21421(((C17985) abstractC7257).f53722);
            }
            if (i == 7) {
                C19720 c19720 = (C19720) abstractC7257;
                if (c19720.f59995.m10293()) {
                    if (c19720.f59996.m16617(EnumC19998.f60742) || c19720.f59996.m16617(EnumC19998.f60805)) {
                        return m21421(c19720.f59996);
                    }
                    return m21421((AbstractC7257) c19720.f59995.f11034);
                }
                return m21421(c19720.f59996);
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
                        return m21421(((AbstractC3094) abstractC7257).mo5247(EnumC7118.LEFT));
                    case 14:
                        return m21421(((C22403) abstractC7257).f70670);
                    case 26:
                        C4848 c4848 = ((C5638) abstractC7257).f13677;
                        if (c4848 != null && c4848.m10293()) {
                            return m21421((AbstractC7257) c4848.f11034);
                        }
                        break;
                    case 27:
                        return m21421(((C25084) abstractC7257).f80025);
                    case 28:
                        C5777 c5777 = (C5777) abstractC7257;
                        C4436 c4436 = c5777.f14184;
                        return c4436.f9953.isEmpty() ? c5777.f18924 : ((C19049) c4436.f9953.f11034).f18924;
                    case 29:
                        C9800 c9800 = (C9800) abstractC7257;
                        return c9800.f27114.isEmpty() ? c9800.f18924 : ((C19049) c9800.f27114.f11034).f18924;
                    case 49:
                        int i2 = ((C7650) abstractC7257).f20022.f18924;
                        if (i2 != -1) {
                            return i2;
                        }
                        break;
                    case 50:
                        return m21421(((C10332) abstractC7257).f28614);
                    case 51:
                        return m21421(((C12344) abstractC7257).f34446);
                    case 52:
                        return m21421(((C16366) abstractC7257).f48093);
                    case 53:
                        C10471 c10471 = (C10471) abstractC7257;
                        int i3 = c10471.f28961.f18924;
                        if (i3 != -1) {
                            return i3;
                        }
                        if (c10471.f28962.m10293()) {
                            return m21421((AbstractC7257) c10471.f28962.f11034);
                        }
                        AbstractC14355 abstractC14356 = c10471.f28966;
                        return abstractC14356 == null ? c10471.f18924 : m21421(abstractC14356);
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        return m21421(((C17846) abstractC7257).f53242);
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        return m21421(((C17707) abstractC7257).f52887);
                    case 56:
                        return m21421(((C15695) abstractC7257).f45487);
                }
            } else {
                C11281 c11281 = (C11281) abstractC7257;
                int i4 = c11281.f31434;
                if (i4 != -1) {
                    return i4;
                }
                int i5 = c11281.f31435.f18924;
                if (i5 != -1) {
                    return i5;
                }
                AbstractC14355 abstractC14357 = c11281.f31437;
                if (abstractC14357 == null || abstractC14357.f18924 == -1) {
                    return c11281.f18924;
                }
                return m21421(abstractC14357);
            }
        }
        return abstractC7257.f18924;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public static int m21397(AbstractC7257 abstractC7257, InterfaceC4297 interfaceC4297) {
        if (abstractC7257 != null) {
            if (interfaceC4297 == null) {
                return m21433(abstractC7257);
            }
            int iMo8719 = interfaceC4297.mo8719(abstractC7257);
            if (iMo8719 != -1) {
                return iMo8719;
            }
            int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
            if (i == 7) {
                return m21397(((C19720) abstractC7257).f59996, interfaceC4297);
            }
            if (i == 50) {
                return m21397(((C10332) abstractC7257).f28613, interfaceC4297);
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
                            C4848 c4848 = ((C5638) abstractC7257).f13677;
                            if (c4848 != null && c4848.m10293()) {
                                return m21397((AbstractC7257) c4848.last(), interfaceC4297);
                            }
                            break;
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 56:
                                            return m21397(((C15695) abstractC7257).f45486, interfaceC4297);
                                        case 61:
                                            return m21397((AbstractC7257) ((C20391) abstractC7257).f63043.last(), interfaceC4297);
                                        case 62:
                                            return m21397(((C2955) abstractC7257).f5146, interfaceC4297);
                                        case 63:
                                            return m21397(((C13685) abstractC7257).f38595, interfaceC4297);
                                        case 64:
                                            return m21397(((C6979) abstractC7257).f18156, interfaceC4297);
                                        case 65:
                                            C3765 c3765 = (C3765) abstractC7257;
                                            AbstractC13154 abstractC13154 = c3765.f8000;
                                            if (abstractC13154 == null) {
                                                return m21397(c3765.f7999, interfaceC4297);
                                            }
                                            return m21397(abstractC13154, interfaceC4297);
                                        case 66:
                                            return m21397(((C19188) abstractC7257).f57351, interfaceC4297);
                                        case 67:
                                            return m21397((AbstractC7257) ((C4436) abstractC7257).f9953.last(), interfaceC4297);
                                        case 68:
                                            return m21397(((C9130) abstractC7257).f24710, interfaceC4297);
                                        case 69:
                                            return m21397((AbstractC7257) ((C3626) abstractC7257).f7509.last(), interfaceC4297);
                                        case 70:
                                            C12622 c12622 = (C12622) abstractC7257;
                                            C4968 c4968 = c12622.f35424;
                                            if (c4968 != null) {
                                                return m21397(c4968, interfaceC4297);
                                            }
                                            if (!c12622.f35425.isEmpty()) {
                                                return m21397((AbstractC7257) c12622.f35425.last(), interfaceC4297);
                                            }
                                            return m21397(c12622.f35421, interfaceC4297);
                                        case 71:
                                            return m21397(((C17314) abstractC7257).f51641, interfaceC4297);
                                        case 72:
                                            return m21397(((C19327) abstractC7257).f57710, interfaceC4297);
                                        case 73:
                                            return m21397(((C10610) abstractC7257).f29369, interfaceC4297);
                                        case 74:
                                            return m21397(((C22542) abstractC7257).f71103, interfaceC4297);
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
                                    return m21397(((AbstractC3094) abstractC7257).mo5247(EnumC7118.RIGHT), interfaceC4297);
                            }
                    }
                }
                return m21397(((AbstractC3094) abstractC7257).mo5247(EnumC7118.RIGHT), interfaceC4297);
            }
            return m21397(((C17846) abstractC7257).f53243, interfaceC4297);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC5323 m21430(AbstractC7257 abstractC7257) {
        return new C6586(abstractC7257, m21433(abstractC7257));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21398(AbstractC7257 abstractC7257, EnumC24020 enumC24020) {
        if (abstractC7257.m16617(EnumC19998.f60795)) {
            C12622 c12622 = (C12622) abstractC7257;
            C1446.m31699(c12622.f35424);
            return enumC24020.m53206(c12622.f35424);
        }
        if (abstractC7257.m16617(EnumC19998.f60767)) {
            return m21433(((C9130) abstractC7257).f24710);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7257 m21405(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257, boolean z) {
        C5245 c5245 = new C5245(abstractC7783);
        abstractC7257.mo3382(c5245);
        AbstractC7257 abstractC7258 = c5245.f39426;
        if (abstractC7258 == null && z) {
            return null;
        }
        return abstractC7258 != null ? abstractC7258 : abstractC7257;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7257 m21404(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        C13962 c13962 = new C13962(abstractC7783);
        abstractC7257.mo3382(c13962);
        return c13962.f39426;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC13154 m21407(C19188 c19188) {
        AbstractC13154 abstractC13154 = c19188;
        do {
            abstractC13154 = ((C19188) abstractC13154).f57351;
        } while (abstractC13154.m16617(EnumC19998.f60756));
        int i = C14632.f41758[abstractC13154.mo3383().ordinal()];
        return (i == 63 || i == 64 || i == 73 || i == 75 || i == 76) ? abstractC13154 : c19188;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC14355 m21424(AbstractC14355 abstractC14355) {
        while (abstractC14355.m16617(EnumC19998.f60706)) {
            abstractC14355 = ((C16505) abstractC14355).f48507;
        }
        return abstractC14355;
    }

    /* JADX INFO: renamed from: ᩸ */
    public static AbstractC7257 m21437(AbstractC7257 abstractC7257) {
        return abstractC7257.m16617(EnumC19998.f60706) ? m21424((AbstractC14355) abstractC7257) : abstractC7257;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m21400(C4848 c4848) {
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            c20271.m45777(((AbstractC7257) c4848.f11034).f18925);
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ܶ */
    public static AbstractC12224 m21428(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 4) {
            return ((C9661) abstractC7257).f26610;
        }
        if (i == 5) {
            return ((C8320) abstractC7257).f22259;
        }
        if (i != 6) {
            return null;
        }
        return m21428(((C17985) abstractC7257).f53722);
    }

    /* JADX INFO: renamed from: ۜ */
    public static AbstractC12224 m21418(AbstractC7257 abstractC7257) {
        AbstractC12224 abstractC12224M21418;
        AbstractC7257 abstractC7257M21437 = m21437(abstractC7257);
        int i = C14632.f41758[abstractC7257M21437.mo3383().ordinal()];
        if (i == 4) {
            return ((C9661) abstractC7257M21437).f26610;
        }
        if (i == 5 && (abstractC12224M21418 = m21418(((C8320) abstractC7257M21437).f22261)) != null) {
            return abstractC12224M21418.m28200('.', m21428(abstractC7257M21437));
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹ */
    public static AbstractC7783 m21438(AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7257M21437 = m21437(abstractC7257);
        int i = C14632.f41758[abstractC7257M21437.mo3383().ordinal()];
        if (i == 4) {
            return ((C9661) abstractC7257M21437).f26611;
        }
        if (i == 5) {
            return ((C8320) abstractC7257M21437).f22260;
        }
        if (i == 6) {
            return m21438(((C17985) abstractC7257M21437).f53722);
        }
        if (i == 7) {
            return m21438(((C19720) abstractC7257M21437).f59996);
        }
        if (i != 9) {
            return null;
        }
        return ((C11142) abstractC7257M21437).f30889;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C4436 m21436(AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7257M21437 = m21437(abstractC7257);
        int i = C14632.f41758[abstractC7257M21437.mo3383().ordinal()];
        if (i == 8) {
            return ((C11281) abstractC7257M21437).f31435;
        }
        if (i == 28) {
            return ((C5777) abstractC7257M21437).f14184;
        }
        if (i == 49) {
            return ((C7650) abstractC7257M21437).f20022;
        }
        if (i != 53) {
            return null;
        }
        return ((C10471) abstractC7257M21437).f28961;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m21425(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7257M21437 = m21437(abstractC7257);
        int i = C14632.f41758[abstractC7257M21437.mo3383().ordinal()];
        if (i == 4) {
            ((C9661) abstractC7257M21437).f26611 = abstractC7783;
        } else {
            if (i != 5) {
                return;
            }
            ((C8320) abstractC7257M21437).f22260 = abstractC7783;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static long m21439(AbstractC7257 abstractC7257) {
        int i = C14632.f41758[abstractC7257.mo3383().ordinal()];
        if (i == 8) {
            return ((C11281) abstractC7257).f31435.f9954;
        }
        if (i == 49) {
            return ((C7650) abstractC7257).f20022.f9954;
        }
        if (i == 53) {
            return ((C10471) abstractC7257).f28961.f9954;
        }
        if (i != 80) {
            return 0L;
        }
        return ((C4968) abstractC7257).f11317;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21399(EnumC19998 enumC19998) {
        int i = C14632.f41758[enumC19998.ordinal()];
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

    /* JADX INFO: renamed from: ۧ */
    public static EnumC5532 m21422(EnumC19998 enumC19998) {
        int i = C14632.f41758[enumC19998.ordinal()];
        if (i == 77) {
            return EnumC5532.ANNOTATION;
        }
        if (i != 78) {
            switch (i) {
                case 10:
                    return EnumC5532.PREFIX_INCREMENT;
                case 11:
                    return EnumC5532.PREFIX_DECREMENT;
                case 12:
                    return EnumC5532.POSTFIX_INCREMENT;
                case 13:
                    return EnumC5532.POSTFIX_DECREMENT;
                default:
                    switch (i) {
                        case 15:
                            return EnumC5532.OR_ASSIGNMENT;
                        case 16:
                            return EnumC5532.XOR_ASSIGNMENT;
                        case 17:
                            return EnumC5532.AND_ASSIGNMENT;
                        case 18:
                            return EnumC5532.LEFT_SHIFT_ASSIGNMENT;
                        case 19:
                            return EnumC5532.RIGHT_SHIFT_ASSIGNMENT;
                        case 20:
                            return EnumC5532.UNSIGNED_RIGHT_SHIFT_ASSIGNMENT;
                        case 21:
                            return EnumC5532.PLUS_ASSIGNMENT;
                        case 22:
                            return EnumC5532.MINUS_ASSIGNMENT;
                        case 23:
                            return EnumC5532.MULTIPLY_ASSIGNMENT;
                        case 24:
                            return EnumC5532.DIVIDE_ASSIGNMENT;
                        case 25:
                            return EnumC5532.REMAINDER_ASSIGNMENT;
                        default:
                            switch (i) {
                                case 30:
                                    return EnumC5532.CONDITIONAL_OR;
                                case 31:
                                    return EnumC5532.CONDITIONAL_AND;
                                case 32:
                                    return EnumC5532.OR;
                                case 33:
                                    return EnumC5532.XOR;
                                case 34:
                                    return EnumC5532.AND;
                                case 35:
                                    return EnumC5532.EQUAL_TO;
                                case 36:
                                    return EnumC5532.NOT_EQUAL_TO;
                                case 37:
                                    return EnumC5532.LESS_THAN;
                                case 38:
                                    return EnumC5532.GREATER_THAN;
                                case 39:
                                    return EnumC5532.LESS_THAN_EQUAL;
                                case 40:
                                    return EnumC5532.GREATER_THAN_EQUAL;
                                case 41:
                                    return EnumC5532.LEFT_SHIFT;
                                case 42:
                                    return EnumC5532.RIGHT_SHIFT;
                                case 43:
                                    return EnumC5532.UNSIGNED_RIGHT_SHIFT;
                                case 44:
                                    return EnumC5532.PLUS;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    return EnumC5532.MINUS;
                                case 46:
                                    return EnumC5532.MULTIPLY;
                                case 47:
                                    return EnumC5532.DIVIDE;
                                case 48:
                                    return EnumC5532.REMAINDER;
                                default:
                                    switch (i) {
                                        case 57:
                                            return EnumC5532.UNARY_PLUS;
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                            return EnumC5532.UNARY_MINUS;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            return EnumC5532.LOGICAL_COMPLEMENT;
                                        case 60:
                                            return EnumC5532.BITWISE_COMPLEMENT;
                                        default:
                                            switch (i) {
                                                case 81:
                                                    return EnumC5532.OTHER;
                                                case 82:
                                                    return EnumC5532.EXPORTS;
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                    return EnumC5532.OPENS;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
        return EnumC5532.TYPE_ANNOTATION;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC14355 m21431(AbstractC14355 abstractC14355) {
        int i = C14632.f41758[abstractC14355.mo3383().ordinal()];
        if (i == 4 || i == 5 || i == 6) {
            return abstractC14355;
        }
        if (i == 7) {
            return ((C19720) abstractC14355).f59996;
        }
        if (i == 26 || i == 27 || i == 71 || i == 79 || i == 84) {
            return abstractC14355;
        }
        throw new AssertionError("Unexpected type tree: " + abstractC14355);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7257 m21403(AbstractC7257 abstractC7257, boolean z) {
        AbstractC7257 abstractC7258;
        int i;
        while (true) {
            abstractC7258 = null;
            while (true) {
                i = C14632.f41758[abstractC7257.mo3383().ordinal()];
                if (i != 7) {
                    break;
                }
                abstractC7258 = abstractC7257;
                abstractC7257 = ((C19720) abstractC7257).f59996;
            }
            if (i == 27) {
                abstractC7257 = ((C25084) abstractC7257).f80025;
            } else {
                if (i != 71) {
                    break;
                }
                abstractC7257 = ((C17314) abstractC7257).f51641;
            }
        }
        return (z || abstractC7258 == null) ? abstractC7257 : abstractC7258;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m21426(AbstractC7257 abstractC7257) {
        C15302 c15302 = new C15302();
        c15302.f43681 = false;
        c15302.mo12739(abstractC7257);
        return c15302.f43681;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21414(AbstractC14355 abstractC14355, C4848 c4848) {
        return abstractC14355.f18925.f16705.f20405 == EnumC3600.f7353 && C7480.stream(c4848).flatMap(new C4251(7)).allMatch(new C24379(2));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11951 m21423(AbstractC23212 abstractC23212) {
        int i = C14632.f41758[abstractC23212.mo3383().ordinal()];
        boolean z = true;
        if (i == 55) {
            return new C11951(((C17707) abstractC23212).f18925, true);
        }
        if (i != 56) {
            if (i == 74) {
                return m21423(((C22542) abstractC23212).f71103);
            }
            throw new AssertionError();
        }
        C15695 c15695 = (C15695) abstractC23212;
        C11951 c11951M21423 = m21423(c15695.f45487);
        boolean zM27360 = c11951M21423.m27360();
        if (c15695.f45486.f18925.m14777(EnumC11353.BOOLEAN) && zM27360) {
            Object objMo14779 = c15695.f45486.f18925.mo14779();
            if (objMo14779 == null || ((Integer) objMo14779).intValue() != 1) {
                z = false;
            }
        } else {
            z = zM27360;
        }
        return new C11951(c11951M21423.m27359(), z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17707 m21408(AbstractC23212 abstractC23212) {
        int i = C14632.f41758[abstractC23212.mo3383().ordinal()];
        if (i == 55) {
            return (C17707) abstractC23212;
        }
        if (i == 56) {
            return m21408(((C15695) abstractC23212).f45487);
        }
        if (i == 74) {
            return m21408(((C22542) abstractC23212).f71103);
        }
        throw new AssertionError();
    }
}
