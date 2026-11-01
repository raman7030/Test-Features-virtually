package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۢܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBDF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11539 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f32182;

    static {
        HashMap map = new HashMap(400);
        f32182 = map;
        map.put(C14065.f39814, C14300.f40751);
        C5348 c5348 = C14065.f39714;
        C14970 c14970 = C14300.f40799;
        map.put(c5348, c14970);
        C5348 c5349 = C14065.f39836;
        C14970 c14971 = C14300.f40840;
        map.put(c5349, c14971);
        map.put(C14065.f39860, c14970);
        map.put(C14065.f39781, c14971);
        C5348 c53410 = C14065.f39738;
        C14970 c14972 = C14300.f40874;
        map.put(c53410, c14972);
        map.put(C14065.f39678, c14970);
        map.put(C14065.f39690, c14971);
        map.put(C14065.f39793, c14970);
        map.put(C14065.f39732, c14971);
        map.put(C14065.f39818, c14972);
        C5348 c53411 = C14065.f39779;
        C14970 c14973 = C14300.f40753;
        map.put(c53411, c14973);
        C5348 c53412 = C14065.f39858;
        C14970 c14974 = C14300.f40724;
        map.put(c53412, c14974);
        map.put(C14065.f39804, c14973);
        map.put(C14065.f39810, c14974);
        map.put(C14065.f39834, c14973);
        map.put(C14065.f39817, C14300.f40848);
        C5348 c53413 = C14065.f39823;
        C14970 c14975 = C14300.f40749;
        map.put(c53413, c14975);
        C5348 c53414 = C14065.f39762;
        C14970 c14976 = C14300.f40798;
        map.put(c53414, c14976);
        map.put(C14065.f39683, C14300.f40734);
        map.put(C14065.f39725, C14300.f40768);
        map.put(C14065.f39829, C14300.f40853);
        map.put(C14065.f39841, C14300.f40863);
        map.put(C14065.f39658, c14975);
        map.put(C14065.f39743, c14976);
        C5348 c53415 = C14065.f39701;
        C14970 c14977 = C14300.f40714;
        map.put(c53415, c14977);
        C5348 c53416 = C14065.f39707;
        C14970 c14978 = C14300.f40803;
        map.put(c53416, c14978);
        map.put(C14065.f39768, C14300.f40744);
        map.put(C14065.f39786, C14300.f40719);
        map.put(C14065.f39695, C14300.f40868);
        map.put(C14065.f39847, C14300.f40818);
        map.put(C14065.f39664, c14977);
        map.put(C14065.f39756, c14978);
        map.put(C14065.f39697, C14300.f40742);
        map.put(C14065.f39857, C14300.f40827);
        map.put(C14065.f39711, C14300.f40832);
        map.put(C14065.f39778, C14300.f40787);
        map.put(C14065.f39803, C14300.f40723);
        map.put(C14065.f39849, C14300.f40747);
        map.put(C14065.f39831, C14300.f40737);
        map.put(C14065.f39843, C14300.f40856);
        map.put(C14065.f39788, C14300.f40871);
        map.put(C14065.f39848, C14300.f40860);
        map.put(C14065.f39830, C14300.f40775);
        map.put(C14065.f39842, C14300.f40761);
        map.put(C14065.f39787, C14300.f40880);
        map.put(C14065.f39761, C14300.f40838);
        map.put(C14065.f39742, C14300.f40813);
        map.put(C14065.f39767, C14300.f40828);
        map.put(C14065.f39682, C14300.f40788);
        map.put(C14065.f39673, C14300.f40805);
        map.put(C14065.f39752, C14300.f40785);
        map.put(C14065.f39722, C14300.f40736);
        map.put(C14065.f39777, C14300.f40746);
        map.put(C14065.f39769, C14300.f40741);
        map.put(C14065.f39763, C14300.f40845);
        map.put(C14065.f39684, C14300.f40731);
        map.put(C14065.f39696, C14300.f40825);
        map.put(C14065.f39723, C14300.f40728);
        map.put(C14065.f39784, C14300.f40842);
        map.put(C14065.f39838, C14300.f40820);
        map.put(C14065.f39740, C14300.f40870);
        map.put(C14065.f39750, C14300.f40796);
        map.put(C14065.f39799, C14300.f40811);
        map.put(C14065.f39733, C14300.f40762);
        map.put(C14065.f39794, C14300.f40781);
        map.put(C14065.f39819, C14300.f40776);
        map.put(C14065.f39825, C14300.f40732);
        map.put(C14065.f39855, C14300.f40801);
        map.put(C14065.f39776, C14300.f40757);
        map.put(C14065.f39808, C14300.f40721);
        map.put(C14065.f39783, C14300.f40770);
        map.put(C14065.f39796, C14300.f40837);
        map.put(C14065.f39666, C14300.f40766);
        map.put(C14065.f39665, C14300.f40780);
        map.put(C14065.f39828, C14300.f40833);
        map.put(C14065.f39759, C14300.f40800);
        map.put(C14065.f39699, C14300.f40738);
        map.put(C14065.f39862, C14300.f40865);
        map.put(C14065.f39721, C14300.f40876);
        map.put(C14065.f39837, C14300.f40861);
        map.put(C14065.f39679, C14300.f40826);
        map.put(C14065.f39709, C14300.f40786);
        map.put(C14065.f39797, C14300.f40782);
        map.put(C14065.f39748, C14300.f40797);
        map.put(C14065.f39669, C14300.f40802);
        map.put(C14065.f39717, C14300.f40733);
        map.put(C14065.f39772, C14300.f40743);
        map.put(C14065.f39785, C14300.f40745);
        map.put(C14065.f39688, C14300.f40739);
        map.put(C14065.f39730, C14300.f40858);
        map.put(C14065.f39700, C14300.f40879);
        map.put(C14065.f39816, C14300.f40843);
        map.put(C14065.f39791, C14300.f40778);
        map.put(C14065.f39657, C14300.f40814);
        map.put(C14065.f39724, C14300.f40854);
        map.put(C14065.f39736, C14300.f40759);
        map.put(C14065.f39822, C14300.f40834);
        map.put(C14065.f39663, C14300.f40869);
        map.put(C14065.f39676, C14300.f40729);
        map.put(C14065.f39770, C14300.f40829);
        map.put(C14065.f39764, C14300.f40839);
        map.put(C14065.f39745, C14300.f40760);
        map.put(C14065.f39715, C14300.f40875);
        C5348 c53417 = C14065.f39807;
        C14970 c14979 = C14300.f40756;
        map.put(c53417, c14979);
        C5348 c53418 = C14065.f39782;
        C14970 c149710 = C14300.f40810;
        map.put(c53418, c149710);
        map.put(C14065.f39813, c14979);
        map.put(C14065.f39801, c149710);
        map.put(C14065.f39861, C14300.f40795);
        map.put(C14065.f39754, C14300.f40867);
        map.put(C14065.f39685, C14300.f40806);
        map.put(C14065.f39812, C14300.f40735);
        map.put(C14065.f39806, C14300.f40804);
        C5348 c53419 = C14065.f39687;
        C14970 c149711 = C14300.f40812;
        map.put(c53419, c149711);
        C5348 c53420 = C14065.f39815;
        C14970 c149712 = C14300.f40822;
        map.put(c53420, c149712);
        map.put(C14065.f39675, c149711);
        map.put(C14065.f39790, c149712);
        map.put(C14065.f39821, C14300.f40777);
        map.put(C14065.f39833, C14300.f40877);
        map.put(C14065.f39735, C14300.f40758);
        map.put(C14065.f39729, C14300.f40857);
        map.put(C14065.f39656, C14300.f40772);
        C5348 c53421 = C14065.f39766;
        C14970 c149713 = C14300.f40847;
        map.put(c53421, c149713);
        C5348 c53422 = C14065.f39760;
        C14970 c149714 = C14300.f40862;
        map.put(c53422, c149714);
        map.put(C14065.f39681, c149713);
        map.put(C14065.f39693, c149714);
        map.put(C14065.f39741, C14300.f40767);
        map.put(C14065.f39839, C14300.f40713);
        map.put(C14065.f39845, C14300.f40748);
        map.put(C14065.f39827, C14300.f40718);
        map.put(C14065.f39705, C14300.f40817);
        map.put(C14065.f39802, C14300.f40716);
        map.put(C14065.f39851, C14300.f40852);
        map.put(C14065.f39853, C14300.f40789);
        C5348 c53423 = C14065.f39798;
        C14970 c149715 = C14300.f40725;
        map.put(c53423, c149715);
        map.put(C14065.f39670, C14300.f40783);
        map.put(C14065.f39718, c149715);
        map.put(C14065.f39811, C14300.f40808);
        C5348 c53424 = C14065.f39792;
        C14970 c149716 = C14300.f40881;
        map.put(c53424, c149716);
        map.put(C14065.f39737, C14300.f40727);
        map.put(C14065.f39835, c149716);
        map.put(C14065.f39677, C14300.f40836);
        C5348 c53425 = C14065.f39661;
        C14970 c149717 = C14300.f40864;
        map.put(c53425, c149717);
        map.put(C14065.f39820, C14300.f40849);
        map.put(C14065.f39692, c149717);
        map.put(C14065.f39704, C14300.f40769);
        C5348 c53426 = C14065.f39686;
        C14970 c149718 = C14300.f40866;
        map.put(c53426, c149718);
        map.put(C14065.f39832, C14300.f40851);
        map.put(C14065.f39850, c149718);
        map.put(C14065.f39771, C14300.f40771);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14970 m26598(AbstractC17417 abstractC17417) {
        C5348 c5348M39656 = abstractC17417.m39656();
        C14970 c14970 = (C14970) f32182.get(c5348M39656);
        if (c14970 != null) {
            return c14970;
        }
        int iM11605 = c5348M39656.m11605();
        if (iM11605 == 4) {
            return C14300.f40755;
        }
        if (iM11605 == 5) {
            AbstractC15405 abstractC15405M36587 = ((C13395) abstractC17417).m36587();
            if (abstractC15405M36587 instanceof C14260) {
                return C14300.f40792;
            }
            if (abstractC15405M36587 instanceof C14930) {
                return C14300.f40763;
            }
            if (abstractC15405M36587 instanceof C22978) {
                return C14300.f40872;
            }
            if (abstractC15405M36587 instanceof C6884) {
                return C14300.f40807;
            }
            throw new RuntimeException("Unexpected constant type");
        }
        if (iM11605 == 41) {
            return C14300.f40850;
        }
        if (iM11605 == 42) {
            return C14300.f40773;
        }
        if (iM11605 == 55) {
            C22783 c22783M39655 = abstractC17417.m39655();
            if (c22783M39655 == null) {
                return C14300.f40751;
            }
            switch (c22783M39655.mo7484()) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                    return C14300.f40726;
                case 4:
                case 7:
                    return C14300.f40830;
                case 9:
                    return C14300.f40790;
                default:
                    throw new RuntimeException("Unexpected basic type");
            }
        }
        switch (iM11605) {
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                int iMo7484 = ((C10908) ((C13395) abstractC17417).m36587()).mo7484();
                if (iMo7484 == 1) {
                    return C14300.f40754;
                }
                if (iMo7484 == 2) {
                    return C14300.f40793;
                }
                if (iMo7484 == 3) {
                    return C14300.f40873;
                }
                if (iMo7484 == 6) {
                    return C14300.f40783;
                }
                if (iMo7484 == 8) {
                    return C14300.f40764;
                }
                break;
            case 46:
                int iMo7485 = ((C10908) ((C13395) abstractC17417).m36587()).mo7484();
                if (iMo7485 == 1) {
                    return C14300.f40791;
                }
                if (iMo7485 == 2) {
                    return C14300.f40831;
                }
                if (iMo7485 == 3) {
                    return C14300.f40841;
                }
                if (iMo7485 == 6) {
                    return C14300.f40727;
                }
                if (iMo7485 == 8) {
                    return C14300.f40816;
                }
                break;
            case 47:
                int iMo7486 = ((C10908) ((C13395) abstractC17417).m36587()).mo7484();
                if (iMo7486 == 1) {
                    return C14300.f40715;
                }
                if (iMo7486 == 2) {
                    return C14300.f40750;
                }
                if (iMo7486 == 3) {
                    return C14300.f40720;
                }
                if (iMo7486 == 6) {
                    return C14300.f40849;
                }
                if (iMo7486 == 8) {
                    return C14300.f40819;
                }
                break;
            case 48:
                int iMo7487 = ((C10908) ((C13395) abstractC17417).m36587()).mo7484();
                if (iMo7487 == 1) {
                    return C14300.f40717;
                }
                if (iMo7487 == 2) {
                    return C14300.f40752;
                }
                if (iMo7487 == 3) {
                    return C14300.f40722;
                }
                if (iMo7487 == 6) {
                    return C14300.f40851;
                }
                if (iMo7487 == 8) {
                    return C14300.f40821;
                }
                break;
            case 49:
                return C14300.f40730;
            case 50:
                return C14300.f40844;
            case 51:
                return C14300.f40740;
            case 52:
                return C14300.f40779;
            case 53:
                return C14300.f40774;
            default:
                switch (iM11605) {
                    case 57:
                        return C14300.f40823;
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                        return C14300.f40824;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                        return C14300.f40859;
                }
        }
        throw new RuntimeException("unknown rop: " + c5348M39656);
    }
}
