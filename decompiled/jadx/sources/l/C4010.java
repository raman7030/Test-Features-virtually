package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4010 implements PluginPreference.PreferenceScreen {

    /* JADX INFO: renamed from: ۢܶ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f12730 = {1276, 21802, 21767, 21763, 21766, 21767, 21776, 21826, 21772, 21773, 21782, 21826, 21764, 21773, 21783, 21772, 21766, 21848, 21826, 7599, -19316, -19282, -19271, -19270, -19271, -19282, -19271, -19278, -19265, -19271, -19204, -19278, -19277, -19288, -19204, -19270, -19277, -19287, -19278, -19272, -19226, -19204};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18827 f12731;

    /* JADX WARN: Code duplicated, block: B:53:0x0177 A[PHI: r5 r8
      0x0177: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:52:0x0175, B:44:0x0135, B:29:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:52:0x0175, B:44:0x0135, B:29:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01aa A[PHI: r3 r4 r6 r7
      0x01aa: PHI (r3v5 short) = (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:56:0x01a8, B:48:0x0154, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r4v5 short) = (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:56:0x01a8, B:48:0x0154, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r6v5 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:56:0x01a8, B:48:0x0154, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r7v5 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:56:0x01a8, B:48:0x0154, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01fd A[PHI: r1 r2
      0x01fd: PHI (r1v4 short[]) = (r1v3 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:64:0x01fb, B:60:0x01dc, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x01fd: PHI (r2v4 char) = (r2v2 char), (r2v3 char), (r2v2 char) binds: [B:64:0x01fb, B:60:0x01dc, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (l.C1420.f5096 > 0) goto L15;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PluginPreference.PreferenceItem requirePreference(String str) {
        int iM6981;
        int i;
        int i2;
        PluginPreference.PreferenceItem preferenceItemFindPreference = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short s3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1995904429;
        int i8 = C3746.f11829;
        int i9 = RunnableC3474.f10992;
        int iM2566 = (i9 - C0630.m2566("ۡ۫")) * 21;
        int i10 = ((iM2566 ^ i8) * 29679) ^ 953765620;
        int i11 = -1025757522;
        while (true) {
            int i12 = iM2566 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * (-3489)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2115541789:
                    case -890445551:
                        if (C2272.m7503()) {
                            iM6981 = (C0630.m2566("֡֨") + i8) * (-103);
                            i = ((iM6981 ^ i9) * (-22567)) ^ (-440471862);
                            i2 = -220848153;
                        } else {
                            iM6981 = (C2105.m6981("ܳ᩺") ^ i8) * 45;
                            i = ((iM6981 ^ i9) * 21265) ^ 1632739838;
                            i2 = 344426542;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1820636699:
                    case -256638012:
                        i4 = i3 * i3;
                        s3 = 2;
                        if (C1916.f6442) {
                            iM6981 = (i9 - C2105.m6981("᩻ۤ")) * (-69);
                            i = ((iM6981 ^ i8) * 31561) ^ 23599272;
                            i2 = 1687820628;
                        } else {
                            iM6981 = C2105.m6981("᩹ܽ") ^ i9;
                            i = ((iM6981 ^ i8) * 1039) ^ 2003094469;
                            i2 = -722603230;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1421774463:
                    case -133188392:
                        i5 = s * s3;
                        if (C1916.f6442) {
                            iM6981 = C2105.m6981("ۡᩴ") ^ i8;
                            i = ((iM6981 ^ i9) * 12797) ^ 1994941426;
                            i2 = 1508525131;
                        } else {
                            iM6981 = C0630.m2566("ܿ᩹") ^ i8;
                            i = ((iM6981 ^ i9) * 843) ^ (-584982165);
                            i2 = 1312882980;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1371364617:
                    case -1225034612:
                        i6 = 46300;
                        iM6981 = (i8 - C0630.m2566("ۙܽ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i9) * 2729) ^ (-1294157863);
                        i2 = -458739146;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1258027669:
                    case -323677510:
                        C0714.m2805();
                        C2167.m7155();
                        iM6981 = (C0630.m2566("֡֨") + i8) * (-103);
                        i = ((iM6981 ^ i9) * (-22567)) ^ (-440471862);
                        i2 = -220848153;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -1131330080:
                    case 1060365085:
                        if ((i5 + 1) - i4 <= 0) {
                            iM6981 = (C0630.m2566("᩵۟") ^ i9) * (-39);
                            i = ((iM6981 ^ i8) * 3411) ^ 397600293;
                            i2 = -1549789181;
                        } else {
                            iM6981 = (i9 - C2105.m6981("֡۫")) * (-47);
                            i = ((iM6981 ^ i8) * 13335) ^ (-2114847335);
                            i2 = 736899566;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -893965550:
                    case 1828996979:
                        if (!C1504.f5354) {
                        }
                        iM6981 = (C0630.m2566("֡֨") + i8) * (-103);
                        i = ((iM6981 ^ i9) * (-22567)) ^ (-440471862);
                        i2 = -220848153;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -703739816:
                    case 1822240715:
                        C4263.m12819();
                        C1711.m5736();
                        return null;
                    case -444855059:
                    case 12820660:
                        sArr = f12730;
                        if (C3663.f11553) {
                            iM6981 = C2105.m6981("ܺܺ") ^ i8;
                            i = ((iM6981 ^ i9) * (-20731)) ^ 1179586121;
                            i2 = -1402043209;
                        } else {
                            iM6981 = (C0630.m2566("ۧܺ") ^ i9) * (-41);
                            i = ((iM6981 ^ i8) * 979) ^ 23678470;
                            i2 = 138416274;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -339233892:
                    case 236782532:
                        short[] sArr2 = f12730;
                        if (!C3663.f11553) {
                            if (C2105.m6982() == 0) {
                                if (C3537.m10746() > 0) {
                                    throw new IllegalArgumentException(C20094.m46315(C1711.m5726(sArr2, 20, 22, i6), str));
                                }
                                iM6981 = C0630.m2566("ܿ᩹") ^ i8;
                                i = ((iM6981 ^ i9) * 843) ^ (-584982165);
                                i2 = 1312882980;
                                i12 = iM6981 ^ i2;
                                i10 = i;
                            }
                            iM6981 = C2105.m6981("᩹ܽ") ^ i9;
                            i = ((iM6981 ^ i8) * 1039) ^ 2003094469;
                            i2 = -722603230;
                            i12 = iM6981 ^ i2;
                            i10 = i;
                        }
                        iM6981 = (C0630.m2566("֡֨") + i8) * (-103);
                        i = ((iM6981 ^ i9) * (-22567)) ^ (-440471862);
                        i2 = -220848153;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case -184021357:
                    case 1505969696:
                        c = 19;
                        if (C3663.f11553) {
                            iM6981 = C2105.m6981("ܺܺ") ^ i8;
                            i = ((iM6981 ^ i9) * (-20731)) ^ 1179586121;
                            i2 = -1402043209;
                        } else {
                            iM6981 = (C0630.m2566("ܶۙ") ^ i9) * 115;
                            i = ((iM6981 ^ i8) * 13155) ^ 1899584013;
                            i2 = -1865606599;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 326109221:
                    case 1064787318:
                        return preferenceItemFindPreference;
                    case 664486782:
                    case 770292317:
                        i6 = 34722;
                        iM6981 = (i8 - C0630.m2566("ۙܽ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i9) * 2729) ^ (-1294157863);
                        i2 = -458739146;
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 681095899:
                    case 1126804406:
                        if (C21923.f70183 == 0) {
                            iM6981 = C2105.m6981("ܺܺ") ^ i8;
                            i = ((iM6981 ^ i9) * (-20731)) ^ 1179586121;
                            i2 = -1402043209;
                            i12 = iM6981 ^ i2;
                            i10 = i;
                        }
                        break;
                    case 928429586:
                    case 1937727289:
                        preferenceItemFindPreference = findPreference(str);
                        if (preferenceItemFindPreference != null) {
                            iM6981 = (C2105.m6981("᩷۟") + i9) * (-45);
                            i = ((iM6981 ^ i8) * (-22027)) ^ 1116684993;
                            i2 = -631741238;
                        } else {
                            iM6981 = (i8 - C2105.m6981("۠۟")) * 95;
                            i = ((iM6981 ^ i9) * (-27333)) ^ (-1798670411);
                            i2 = -1047012666;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 1342192467:
                    case 1828501427:
                        s = sArr[c];
                        s2 = 1;
                        if (C1916.f6442) {
                            iM6981 = (C0630.m2566("ܿᩳ") ^ i8) * 3;
                            i = ((iM6981 ^ i9) * 645) ^ 1014271372;
                            i2 = 1517342036;
                        } else {
                            iM6981 = C2105.m6981("᩹ܽ") ^ i9;
                            i = ((iM6981 ^ i8) * 1039) ^ 2003094469;
                            i2 = -722603230;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    case 1862129287:
                    case 2081828989:
                        i3 = s + s2;
                        if (RunnableC1108.f4040) {
                            iM6981 = C2105.m6981("ۧۚ") ^ i8;
                            i = ((iM6981 ^ i9) * (-26579)) ^ 72385054;
                            i2 = -1771202574;
                        } else {
                            iM6981 = C0630.m2566("ܿ᩹") ^ i8;
                            i = ((iM6981 ^ i9) * 843) ^ (-584982165);
                            i2 = 1312882980;
                        }
                        i12 = iM6981 ^ i2;
                        i10 = i;
                        break;
                    default:
                        C2958.m9034();
                        break;
                }
            }
            iM2566 = (i9 - C2105.m6981("۟֫")) * (-117);
            i10 = ((iM2566 ^ i8) * (-30573)) ^ 1556219705;
            i11 = 652861639;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void setSubtitle(CharSequence charSequence) {
        ActivityC18827 activityC18827 = null;
        C9762 c9762 = null;
        PluginContext pluginContext = null;
        CharSequence charSequenceM2999 = null;
        String str = null;
        int i = -318991645;
        int i2 = RunnableC3474.f10992;
        int i3 = C4263.f13799;
        int iM6981 = C2105.m6981("᩷ܶ") ^ i3;
        int i4 = ((iM6981 ^ i2) * 27251) ^ 1095550944;
        int i5 = 159365907;
        while (true) {
            i = ((((i ^ i2) * (-7853)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1874371890:
                case -919450650:
                    if (C0237.f1507 != 0) {
                        iM6981 = (C0630.m2566("۬۟") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 1529) ^ 889686387;
                        i5 = 231432153;
                    } else {
                        iM6981 = (C2105.m6981("ۗ᩵") ^ i2) * (-45);
                        i4 = ((iM6981 ^ i3) * (-17725)) ^ 1436491412;
                        i5 = 1454083678;
                    }
                    break;
                case -1691037165:
                case 1835388822:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                        i5 = 1518173732;
                    } else {
                        iM6981 = (C0630.m2566("᩸ܽ") + i2) * (-117);
                        i4 = ((iM6981 ^ i3) * 10209) ^ (-764931026);
                        i5 = 1945850062;
                    }
                    break;
                case -1619247689:
                case 1071986720:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۛ֫") + i2) * (-7);
                        i4 = ((iM6981 ^ i3) * (-23397)) ^ (-512894410);
                        i5 = 1073770016;
                    } else {
                        iM6981 = C2105.m6981("ܽᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19531) ^ 326152554;
                        i5 = 1906608908;
                    }
                    break;
                case -1512680440:
                case 1305411112:
                    activityC18827 = this.f12731;
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("ۛ֫") + i2) * (-7);
                        i4 = ((iM6981 ^ i3) * (-23397)) ^ (-512894410);
                        i5 = 1073770016;
                    } else {
                        iM6981 = C2105.m6981("ۡ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-25499)) ^ (-1028451050);
                        i5 = 946123765;
                    }
                    break;
                case -1498214210:
                case -1296156165:
                    if (C11340.m28021(1, str) == '}') {
                        iM6981 = (C0630.m2566("᩹֨") ^ i3) * (-77);
                        i4 = ((iM6981 ^ i2) * 15057) ^ (-1657318220);
                        i5 = -1069827781;
                    } else {
                        charSequenceM2999 = charSequence;
                        iM6981 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4371) ^ (-1602586392);
                        i5 = -2034012499;
                    }
                    break;
                case -1438730434:
                case -520497243:
                    if (C0798.m3000(str, 0) == '{') {
                        iM6981 = (C0630.m2566("ܿ۫") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-19151)) ^ 1808908656;
                        i5 = -857234794;
                    } else {
                        charSequenceM2999 = charSequence;
                        iM6981 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4371) ^ (-1602586392);
                        i5 = -2034012499;
                    }
                    break;
                case -1298163021:
                case 1690224914:
                    C21923.m49340(c9762, charSequenceM2999);
                    break;
                case -1295105538:
                case 1649271065:
                    str = (String) charSequence;
                    if (C0798.m3007(str) >= 3) {
                        iM6981 = (C0630.m2566("ۧ۟") + i3) * 81;
                        i4 = ((iM6981 ^ i2) * (-6281)) ^ (-1343551248);
                        i5 = 995119422;
                    } else {
                        charSequenceM2999 = charSequence;
                        iM6981 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4371) ^ (-1602586392);
                        i5 = -2034012499;
                    }
                    break;
                case -1283484950:
                case 1025550756:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ۛ֫") + i2) * (-7);
                        i4 = ((iM6981 ^ i3) * (-23397)) ^ (-512894410);
                        i5 = 1073770016;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23607) ^ (-35866339);
                        i5 = -491744525;
                    }
                    break;
                case -1240706218:
                case -1103645300:
                    C0050.m940();
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                    i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                    i5 = 1518173732;
                    break;
                case -1115445023:
                case 1035116881:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C0630.m2566("۬۟") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 1529) ^ 889686387;
                        i5 = 231432153;
                    } else {
                        iM6981 = (C0630.m2566("ܶۛ") ^ i2) * 39;
                        i4 = ((iM6981 ^ i3) * 19167) ^ 539699670;
                        i5 = 577066045;
                    }
                    break;
                case -926286011:
                case 1372484899:
                    if (C2126.f7087) {
                        iM6981 = (i2 - C0630.m2566("ۨܿ")) * (-109);
                        i4 = ((iM6981 ^ i3) * 13971) ^ (-1529509212);
                        i5 = -110561228;
                    } else {
                        iM6981 = (C2105.m6981("ܺۜ") + i3) * 49;
                        i4 = ((iM6981 ^ i2) * (-14187)) ^ (-2143047466);
                        i5 = 1756749436;
                    }
                    break;
                case -689159536:
                case -135883569:
                    if (C3663.m11168() >= 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                        i5 = 1518173732;
                    } else {
                        iM6981 = C0630.m2566("֨۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6081)) ^ (-2034399030);
                        i5 = -1842184623;
                    }
                    break;
                case -352504633:
                case 1519044828:
                    if (C3683.f11629 < 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                        i5 = 1518173732;
                    } else {
                        iM6981 = (C0630.m2566("ۨۡ") + i3) * (-113);
                        i4 = ((iM6981 ^ i2) * 21895) ^ (-1384208675);
                        i5 = -1944891280;
                    }
                    break;
                case -203946549:
                case 1970808015:
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                        i5 = 1518173732;
                    } else {
                        iM6981 = C0630.m2566("֨ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14397) ^ 387026046;
                        i5 = -1541683859;
                    }
                    break;
                case -10710210:
                case 977139618:
                    charSequenceM2999 = C0798.m2999(pluginContext, str);
                    if (charSequenceM2999 == null) {
                        charSequenceM2999 = charSequence;
                    }
                    iM6981 = C0630.m2566("ۧܽ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 4371) ^ (-1602586392);
                    i5 = -2034012499;
                    break;
                case 205014775:
                case 1816875754:
                    c9762 = activityC18827.f10584;
                    pluginContext = activityC18827.f59393;
                    if (charSequence instanceof String) {
                        iM6981 = (C2105.m6981("֨ۧ") + i2) * (-99);
                        i4 = ((iM6981 ^ i3) * 8025) ^ 535527827;
                        i5 = -1826244030;
                    } else {
                        charSequenceM2999 = charSequence;
                        iM6981 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4371) ^ (-1602586392);
                        i5 = -2034012499;
                    }
                    break;
                case 311297749:
                case 1111599148:
                    RunnableC3474.m10630();
                    if (!C21923.m49329()) {
                        iM6981 = (i2 - C0630.m2566("ۨܿ")) * (-109);
                        i4 = ((iM6981 ^ i3) * 13971) ^ (-1529509212);
                        i5 = -110561228;
                    } else {
                        iM6981 = (C0630.m2566("۬۟") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 1529) ^ 889686387;
                        i5 = 231432153;
                    }
                    break;
                case 664182861:
                case 2029174231:
                    C3245.m9925();
                    break;
                case 841402252:
                case 1860377375:
                    C22628.m50615();
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۨܿ")) * (-109);
                        i4 = ((iM6981 ^ i3) * 13971) ^ (-1529509212);
                        i5 = -110561228;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۖ") + i2) * (-65);
                        i4 = ((iM6981 ^ i3) * 4155) ^ (-555692573);
                        i5 = 1518173732;
                    }
                    break;
                default:
                    if (C1420.m4913()) {
                        iM6981 = (i2 - C0630.m2566("ۨܿ")) * (-109);
                        i4 = ((iM6981 ^ i3) * 13971) ^ (-1529509212);
                        i5 = -110561228;
                    } else {
                        iM6981 = C2105.m6981("ᩴᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-16309)) ^ 830899911;
                        i5 = 1549476476;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceHeader findHeader(String str) {
        ActivityC18827 activityC18827 = null;
        Iterator itM9029 = null;
        AbstractC7809 abstractC7809 = null;
        C12043 c12043 = null;
        int i = 1807160022;
        int i2 = C22628.f73083;
        int i3 = C3537.f11231;
        int iM6981 = (C2105.m6981("ۜۚ") ^ i3) * (-29);
        int i4 = ((iM6981 ^ i2) * 1691) ^ (-1391438316);
        int i5 = -636711236;
        while (true) {
            i = ((((i ^ i2) * (-7779)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2115753678:
                case -1475343380:
                    C3911.m11924();
                    iM6981 = (C0630.m2566("᩷ۙ") ^ i3) * (-115);
                    i4 = ((iM6981 ^ i2) * 8155) ^ (-1678376016);
                    i5 = 1250429852;
                    break;
                case -2083435276:
                case -647845459:
                    C1420.m4913();
                    C3537.m10746();
                    return null;
                case -1900155330:
                case -45863050:
                    return (PluginPreference.PreferenceHeader) c12043.f24117;
                case -1728248041:
                case -795542994:
                    if (C0237.m1481() >= 0) {
                        iM6981 = (C2105.m6981("᩹ܳ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * 7499) ^ 219068824;
                        i5 = -2103213753;
                    } else {
                        iM6981 = (C2105.m6981("ܶܿ") + i3) * (-13);
                        i4 = ((iM6981 ^ i2) * (-25539)) ^ 250172585;
                        i5 = -440411604;
                    }
                    break;
                case -1577968428:
                case 579279989:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("᩹ܳ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * 7499) ^ 219068824;
                        i5 = -2103213753;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܺۖ")) * 95;
                        i4 = ((iM6981 ^ i3) * 28997) ^ 844266726;
                        i5 = 779950263;
                    }
                    break;
                case -1547114054:
                case -169474309:
                    return null;
                case -1386625557:
                case -1253222152:
                    if (C1773.m5910(itM9029)) {
                        iM6981 = (i2 - C2105.m6981("᩷۟")) * 39;
                        i4 = ((iM6981 ^ i3) * 13273) ^ (-1681966704);
                        i5 = 856563324;
                    } else {
                        iM6981 = C2105.m6981("۬ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29537) ^ 50334790;
                        i5 = -1775553897;
                    }
                    break;
                case -1137610203:
                case 1326932814:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹᩶")) * 47;
                        i4 = ((iM6981 ^ i2) * (-59)) ^ 1316506965;
                        i5 = -125716016;
                    } else {
                        iM6981 = C0630.m2566("ۗ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2593)) ^ 612285981;
                        i5 = -1364480600;
                    }
                    break;
                case -1042515037:
                case 1383767979:
                    if (C0798.m2998() != 0) {
                        iM6981 = (i3 - C0630.m2566("᩹᩶")) * 47;
                        i4 = ((iM6981 ^ i2) * (-59)) ^ 1316506965;
                        i5 = -125716016;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰ᩵")) * 85;
                        i4 = ((iM6981 ^ i2) * 4745) ^ (-1513004741);
                        i5 = 65817725;
                    }
                    break;
                case -935191468:
                case 1001125038:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("᩷ۙ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 8155) ^ (-1678376016);
                        i5 = 1250429852;
                    } else {
                        iM6981 = (C0630.m2566("ᩴ֡") ^ i2) * (-107);
                        i4 = ((iM6981 ^ i3) * (-3937)) ^ (-103648932);
                        i5 = -1164316219;
                    }
                    break;
                case -765130801:
                case -498693125:
                    c12043 = (C12043) abstractC7809;
                    if (ViewOnClickListenerC1958.m6437(str, c12043.f24119)) {
                        iM6981 = (C2105.m6981("ۚۙ") + i2) * 25;
                        i4 = ((iM6981 ^ i3) * 29863) ^ 498422699;
                        i5 = 1068028475;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۙ۠")) * 65;
                        i4 = ((iM6981 ^ i2) * (-15463)) ^ (-1337755117);
                        i5 = -1835156472;
                    }
                    break;
                case -551732158:
                case 1086232544:
                    itM9029 = C2958.m9029(activityC18827.f59390);
                    iM6981 = (i3 - C0630.m2566("ۙ۠")) * 65;
                    i4 = ((iM6981 ^ i2) * (-15463)) ^ (-1337755117);
                    i5 = -1835156472;
                    break;
                case -455202767:
                case 2084697366:
                    c12043.f24117 = new C16003(activityC18827, c12043);
                    iM6981 = C0630.m2566("ۤܽ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-4085)) ^ 1366947736;
                    i5 = 1594113709;
                    break;
                case -402779744:
                case 111833297:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("᩹ܳ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * 7499) ^ 219068824;
                        i5 = -2103213753;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩻۬")) * 65;
                        i4 = ((iM6981 ^ i3) * 24505) ^ (-740967460);
                        i5 = -1465237927;
                    }
                    break;
                case -394054204:
                case 896321646:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۙ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 8155) ^ (-1678376016);
                        i5 = 1250429852;
                    } else {
                        iM6981 = (C2105.m6981("۟ۧ") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * 12019) ^ (-466663310);
                        i5 = -112141044;
                    }
                    break;
                case -162634505:
                case 1932189775:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩹᩶")) * 47;
                        i4 = ((iM6981 ^ i2) * (-59)) ^ 1316506965;
                        i5 = -125716016;
                    } else {
                        iM6981 = (C0630.m2566("᩹֨") ^ i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-21415)) ^ (-527271424);
                        i5 = 1671285672;
                    }
                    break;
                case 91795915:
                case 422733071:
                    if (C2272.f7362) {
                        iM6981 = (i3 - C0630.m2566("᩹᩶")) * 47;
                        i4 = ((iM6981 ^ i2) * (-59)) ^ 1316506965;
                        i5 = -125716016;
                    } else {
                        iM6981 = C0630.m2566("ۖۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 1159) ^ 181033763;
                        i5 = 960160584;
                    }
                    break;
                case 102111969:
                case 2095738958:
                    abstractC7809 = (AbstractC7809) RunnableC1108.m3791(itM9029);
                    if (abstractC7809 instanceof C12043) {
                        iM6981 = (i3 - C2105.m6981("ۘ۠")) * 45;
                        i4 = ((iM6981 ^ i2) * (-19301)) ^ (-1613939849);
                        i5 = 252030805;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۙ۠")) * 65;
                        i4 = ((iM6981 ^ i2) * (-15463)) ^ (-1337755117);
                        i5 = -1835156472;
                    }
                    break;
                case 475142255:
                case 873996278:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("᩵֡") + i2) * (-71);
                        i4 = ((iM6981 ^ i3) * (-28037)) ^ 224976119;
                        i5 = -76911744;
                    } else {
                        iM6981 = (C2105.m6981("ܽܶ") + i3) * 41;
                        i4 = ((iM6981 ^ i2) * 15623) ^ 1150809330;
                        i5 = -1385956363;
                    }
                    break;
                case 711699050:
                case 2095695721:
                    if (c12043.f24117 == null) {
                        iM6981 = C2105.m6981("ۘۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 5823) ^ (-1252446672);
                        i5 = 1235364085;
                    } else {
                        iM6981 = C0630.m2566("ۤܽ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4085)) ^ 1366947736;
                        i5 = 1594113709;
                    }
                    break;
                case 1276318467:
                case 1481563510:
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("᩵֡") + i2) * (-71);
                        i4 = ((iM6981 ^ i3) * (-28037)) ^ 224976119;
                        i5 = -76911744;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۙ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 8155) ^ (-1678376016);
                        i5 = 1250429852;
                    }
                    break;
                case 1600593830:
                case 2131916883:
                    activityC18827 = this.f12731;
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("᩹ܳ") + i3) * 73;
                        i4 = ((iM6981 ^ i2) * 7499) ^ 219068824;
                        i5 = -2103213753;
                    } else {
                        iM6981 = C2105.m6981("ۜܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5395)) ^ 95691786;
                        i5 = 1969048290;
                    }
                    break;
                default:
                    if (!C2126.f7087) {
                        iM6981 = (C0630.m2566("᩷ۙ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 8155) ^ (-1678376016);
                        i5 = 1250429852;
                    } else {
                        iM6981 = (C0630.m2566("᩹֨") ^ i2) * (-77);
                        i4 = ((iM6981 ^ i3) * (-21415)) ^ (-527271424);
                        i5 = 1671285672;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceItem findPreference(String str) {
        ActivityC18827 activityC18827 = null;
        Iterator itM9029 = null;
        AbstractC7809 abstractC7809 = null;
        int i = -1358929097;
        int i2 = C4263.f13799;
        int i3 = C1420.f5096;
        int iM2566 = C0630.m2566("᩹֡") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-3551)) ^ 224603223;
        int i5 = -1632000347;
        while (true) {
            i = ((((i ^ i3) * 3047) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2020781389:
                case 1540944597:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (i2 - C0630.m2566("ۚۖ")) * (-103);
                        i4 = ((iM2566 ^ i3) * 22155) ^ (-1843782494);
                        i5 = 675412027;
                    } else {
                        iM2566 = (C0630.m2566("᩺ۤ") ^ i3) * (-11);
                        i4 = ((iM2566 ^ i2) * (-15039)) ^ 722001641;
                        i5 = 1228065011;
                    }
                    break;
                case -1950350563:
                case -956146121:
                    if (!C1916.f6442) {
                        iM2566 = C0630.m2566("ܿܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1907) ^ (-1325829578);
                        i5 = -1874591892;
                    } else {
                        iM2566 = C0630.m2566("ۨܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25041) ^ 1508081674;
                        i5 = 1234998521;
                    }
                    break;
                case -1941583755:
                case 1799786334:
                    if (C1773.m5908() <= 0) {
                        iM2566 = C0630.m2566("ܿܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1907) ^ (-1325829578);
                        i5 = -1874591892;
                    } else {
                        iM2566 = C0630.m2566("ۢᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27059) ^ (-1197714459);
                        i5 = 82390663;
                    }
                    break;
                case -1713350251:
                case 899212609:
                    if (abstractC7809.f24117 == null) {
                        iM2566 = C0630.m2566("ܺۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5033)) ^ 1008619437;
                        i5 = 647825020;
                    } else {
                        iM2566 = C0630.m2566("ۖۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-207)) ^ (-1801756585);
                        i5 = 1565598255;
                    }
                    break;
                case -1630267674:
                case -1427720763:
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ۨۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18341)) ^ (-1327530771);
                        i5 = 2075782613;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29335)) ^ 1683120734;
                        i5 = 495340156;
                    }
                    break;
                case -1617930158:
                case 1582065741:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ۨܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25041) ^ 1508081674;
                        i5 = 1234998521;
                    } else {
                        iM2566 = C0630.m2566("ۜ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12347) ^ (-366525149);
                        i5 = 1022214963;
                    }
                    break;
                case -1492893286:
                case 854624257:
                    itM9029 = C2958.m9029(activityC18827.f59390);
                    iM2566 = (C0630.m2566("֨֡") + i3) * 19;
                    i4 = ((iM2566 ^ i2) * (-5451)) ^ (-2065218257);
                    i5 = -399037147;
                    break;
                case -1365303613:
                case 625114493:
                    C4075.m12263();
                    return null;
                case -1341918340:
                case 1762513350:
                    return (PluginPreference.PreferenceItem) abstractC7809.f24117;
                case -1289700785:
                case 1700215567:
                    abstractC7809.f24117 = new C2599(activityC18827, abstractC7809);
                    iM2566 = C0630.m2566("ۖۗ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-207)) ^ (-1801756585);
                    i5 = 1565598255;
                    break;
                case -1205734484:
                case 817227902:
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ܿܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1907) ^ (-1325829578);
                        i5 = -1874591892;
                    } else {
                        iM2566 = (C2105.m6981("ۧܿ") + i2) * 119;
                        i4 = ((iM2566 ^ i3) * (-11689)) ^ (-1570953453);
                        i5 = 175518367;
                    }
                    break;
                case -1168047144:
                case 1340413971:
                    C0714.m2805();
                    iM2566 = C0630.m2566("۫ۗ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 23559) ^ (-1249317842);
                    i5 = -1698436441;
                    break;
                case -956685286:
                case -699009036:
                    abstractC7809 = (AbstractC7809) RunnableC1108.m3791(itM9029);
                    if (abstractC7809 instanceof C12043) {
                        iM2566 = (C0630.m2566("֨֡") + i3) * 19;
                        i4 = ((iM2566 ^ i2) * (-5451)) ^ (-2065218257);
                        i5 = -399037147;
                    } else {
                        iM2566 = (C0630.m2566("ۜ֡") + i3) * 21;
                        i4 = ((iM2566 ^ i2) * (-19345)) ^ 1186128903;
                        i5 = -869782571;
                    }
                    break;
                case -629363317:
                case 173445670:
                    C2126.m7040();
                    if (!RunnableC3474.m10630()) {
                        iM2566 = C0630.m2566("۫ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23559) ^ (-1249317842);
                        i5 = -1698436441;
                    } else {
                        iM2566 = C0630.m2566("ۨۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18341)) ^ (-1327530771);
                        i5 = 2075782613;
                    }
                    break;
                case -533948590:
                case 322624086:
                    if (C1773.m5910(itM9029)) {
                        iM2566 = (C0630.m2566("ۚ᩸") + i2) * 115;
                        i4 = ((iM2566 ^ i3) * (-30165)) ^ (-603222388);
                        i5 = 1126952616;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩶᩸")) * 87;
                        i4 = ((iM2566 ^ i3) * 5161) ^ (-401122941);
                        i5 = -751842840;
                    }
                    break;
                case -457199835:
                case 1868424099:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("۫ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23559) ^ (-1249317842);
                        i5 = -1698436441;
                    } else {
                        iM2566 = C2105.m6981("ۤᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21953) ^ 716095434;
                        i5 = -1278112885;
                    }
                    break;
                case 145830283:
                case 1439025548:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ܿܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1907) ^ (-1325829578);
                        i5 = -1874591892;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۫ܽ")) * (-37);
                        i4 = ((iM2566 ^ i2) * 1777) ^ 77737240;
                        i5 = 1553182197;
                    }
                    break;
                case 287101268:
                case 1134412056:
                    if (ViewOnClickListenerC1958.m6437(str, abstractC7809.f24119)) {
                        iM2566 = (C2105.m6981("ۖ۠") + i3) * (-107);
                        i4 = ((iM2566 ^ i2) * 17153) ^ 1111881034;
                        i5 = -1673387017;
                    } else {
                        iM2566 = (C0630.m2566("֨֡") + i3) * 19;
                        i4 = ((iM2566 ^ i2) * (-5451)) ^ (-2065218257);
                        i5 = -399037147;
                    }
                    break;
                case 421392706:
                case 2073531439:
                    return null;
                case 791237607:
                case 1787160678:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("۫ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23559) ^ (-1249317842);
                        i5 = -1698436441;
                    } else {
                        iM2566 = (C2105.m6981("ۖۡ") + i3) * (-71);
                        i4 = ((iM2566 ^ i2) * 22627) ^ (-1190288794);
                        i5 = 1506206969;
                    }
                    break;
                case 1257760640:
                case 1565246527:
                    activityC18827 = this.f12731;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ۚۖ")) * (-103);
                        i4 = ((iM2566 ^ i3) * 22155) ^ (-1843782494);
                        i5 = 675412027;
                    } else {
                        iM2566 = C0630.m2566("֨ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19657) ^ 346089299;
                        i5 = -456250310;
                    }
                    break;
                case 1600230821:
                case 1652212402:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ܿܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1907) ^ (-1325829578);
                        i5 = -1874591892;
                    } else {
                        iM2566 = C2105.m6981("ܽܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29737)) ^ (-1832272461);
                        i5 = 1591289580;
                    }
                    break;
                default:
                    ServiceConnectionC3453.m10564();
                    if (!C2520.m8026()) {
                        iM2566 = C0630.m2566("ۨܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25041) ^ 1508081674;
                        i5 = 1234998521;
                    } else {
                        iM2566 = C0630.m2566("۫ۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23559) ^ (-1249317842);
                        i5 = -1698436441;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01ca A[PHI: r2 r3 r4 r8
      0x01ca: PHI (r2v5 char) = (r2v3 char), (r2v2 char), (r2v2 char), (r2v2 char) binds: [B:60:0x01c8, B:56:0x01ab, B:44:0x0147, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r3v5 short) = (r3v2 short), (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:60:0x01c8, B:56:0x01ab, B:44:0x0147, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r4v5 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:60:0x01c8, B:56:0x01ab, B:44:0x0147, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:60:0x01c8, B:56:0x01ab, B:44:0x0147, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0219 A[PHI: r1 r5 r6 r7
      0x0219: PHI (r1v4 short[]) = (r1v2 short[]), (r1v3 short[]), (r1v2 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:68:0x0217, B:64:0x01fa, B:52:0x018b, B:48:0x0169, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:68:0x0217, B:64:0x01fa, B:52:0x018b, B:48:0x0169, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:68:0x0217, B:64:0x01fa, B:52:0x018b, B:48:0x0169, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:68:0x0217, B:64:0x01fa, B:52:0x018b, B:48:0x0169, B:29:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final PluginPreference.PreferenceHeader requireHeader(String str) {
        int iM2566;
        int i;
        int i2;
        PluginPreference.PreferenceHeader preferenceHeaderFindHeader = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short s3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1581031339;
        int i8 = C4263.f13799;
        int i9 = C7811.f24123;
        int iM6981 = (i9 - C2105.m6981("۬ۨ")) * 99;
        int i10 = ((iM6981 ^ i8) * (-1147)) ^ 1329378406;
        int i11 = -147150675;
        while (true) {
            int i12 = iM6981 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * (-19113)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1990618539:
                    case -1482674148:
                        i6 = 28719;
                        iM2566 = C0630.m2566("᩸ܳ") ^ i8;
                        i = ((iM2566 ^ i9) * (-275)) ^ 1121725050;
                        i2 = -2129599723;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1895790785:
                    case -36622639:
                        sArr = f12730;
                        if (C1047.f3863 >= 0) {
                            iM2566 = (i9 - C0630.m2566("ۛܺ")) * 81;
                            i = ((iM2566 ^ i8) * (-15107)) ^ (-207526440);
                            i2 = -131774358;
                        } else {
                            iM2566 = (C0630.m2566("ܳ᩸") + i9) * (-59);
                            i = ((iM2566 ^ i8) * (-28369)) ^ (-132867937);
                            i2 = 330857946;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1819738952:
                    case -1253052026:
                        preferenceHeaderFindHeader = findHeader(str);
                        if (preferenceHeaderFindHeader != null) {
                            iM2566 = C0630.m2566("ۧܶ") ^ i8;
                            i = ((iM2566 ^ i9) * 20819) ^ 382860288;
                            i2 = 516862953;
                        } else {
                            iM2566 = C2105.m6981("᩹۬") ^ i9;
                            i = ((iM2566 ^ i8) * (-23123)) ^ (-80898209);
                            i2 = -484038089;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1785446652:
                    case 41744445:
                        C22628.m50615();
                        if (C4616.f14690 > 0) {
                            iM6981 = (i8 - C2105.m6981("ۨ᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i10 = ((iM6981 ^ i9) * 1373) ^ 373356098;
                            i11 = -409938026;
                        }
                        iM6981 = C0630.m2566("ۘ֫") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-1381)) ^ (-1196562312);
                        i11 = -2049924205;
                        break;
                    case -1664598442:
                    case -1471350243:
                        i5 = s * s3;
                        if (C0483.f2088 >= 0) {
                            iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                            i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                            i2 = -929839773;
                        } else {
                            iM2566 = (C0630.m2566("ܰۤ") ^ i9) * 59;
                            i = ((iM2566 ^ i8) * (-10501)) ^ (-1569288335);
                            i2 = 1391580536;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1199512369:
                    case -36476040:
                        i6 = 21858;
                        iM2566 = C0630.m2566("᩸ܳ") ^ i8;
                        i = ((iM2566 ^ i9) * (-275)) ^ 1121725050;
                        i2 = -2129599723;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -1019823458:
                    case 304829130:
                        C3911.m11924();
                        if (!C3663.f11553) {
                            iM6981 = (i8 - C2105.m6981("ۨ᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i10 = ((iM6981 ^ i9) * 1373) ^ 373356098;
                            i11 = -409938026;
                        }
                        iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                        i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                        i2 = -929839773;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -984349817:
                    case 956042028:
                        if (C11340.f33930 >= 0) {
                            iM2566 = (i9 - C0630.m2566("ۛܺ")) * 81;
                            i = ((iM2566 ^ i8) * (-15107)) ^ (-207526440);
                            i2 = -131774358;
                        } else {
                            iM2566 = (C0630.m2566("ۚۘ") + i8) * (-93);
                            i = ((iM2566 ^ i9) * 23627) ^ 1265478633;
                            i2 = 1966465485;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -849050263:
                    case 248421466:
                        s = sArr[c];
                        s2 = 1;
                        if (C1916.f6442) {
                            iM2566 = C2105.m6981("ۙ᩸") ^ i8;
                            i = ((iM2566 ^ i9) * (-7619)) ^ 2077676308;
                            i2 = -939310976;
                        } else {
                            iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                            i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                            i2 = -929839773;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -524993733:
                    case 1353076089:
                        if ((i5 + 1) - i4 <= 0) {
                            iM2566 = (C2105.m6981("֡ۤ") + i8) * 13;
                            i = ((iM2566 ^ i9) * o.a.i) ^ 425444671;
                            i2 = 272083392;
                        } else {
                            iM2566 = C2105.m6981("᩷ۤ") ^ i9;
                            i = ((iM2566 ^ i8) * 31683) ^ 2142738095;
                            i2 = 950692959;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -299201490:
                    case 714229742:
                        return preferenceHeaderFindHeader;
                    case -286227898:
                    case -144751147:
                        c = 0;
                        if (RunnableC3474.f10992 <= 0) {
                            iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                            i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                            i2 = -929839773;
                        } else {
                            iM2566 = C0630.m2566("۬᩷") ^ i9;
                            i = ((iM2566 ^ i8) * 4073) ^ 2096465207;
                            i2 = 2090119461;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case -60848361:
                    case 908140435:
                        i3 = s + s2;
                        if (RunnableC1937.f6483 >= 0) {
                            iM2566 = (i9 - C0630.m2566("ۛܺ")) * 81;
                            i = ((iM2566 ^ i8) * (-15107)) ^ (-207526440);
                            i2 = -131774358;
                        } else {
                            iM2566 = C0630.m2566("ۤܳ") ^ i9;
                            i = ((iM2566 ^ i8) * 8447) ^ (-1917859824);
                            i2 = -548860662;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 407901067:
                    case 1411210403:
                        C2272.m7503();
                        C7106.m19120();
                        iM6981 = C0630.m2566("ۘ֫") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-1381)) ^ (-1196562312);
                        i11 = -2049924205;
                        break;
                        break;
                    case 874561287:
                    case 1787787179:
                        C0964.m3413();
                        return null;
                    case 1334752242:
                    case 1857623170:
                        i4 = i3 * i3;
                        s3 = 2;
                        if (C0630.f2410 <= 0) {
                            iM2566 = (i9 - C0630.m2566("ۛܺ")) * 81;
                            i = ((iM2566 ^ i8) * (-15107)) ^ (-207526440);
                            i2 = -131774358;
                        } else {
                            iM2566 = (i8 - C2105.m6981("ᩴܶ")) * 101;
                            i = ((iM2566 ^ i9) * (-32401)) ^ 1987977916;
                            i2 = 257499555;
                        }
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    case 1389745379:
                    case 2146837232:
                        short[] sArr2 = f12730;
                        if (RunnableC3474.f10992 > 0 && C4117.f13076 > 0) {
                            if (C11340.m28031()) {
                                throw new IllegalArgumentException(C20094.m46315(C7106.m19110(sArr2, 1, 18, i6), str));
                            }
                            iM2566 = (i9 - C0630.m2566("ۛܺ")) * 81;
                            i = ((iM2566 ^ i8) * (-15107)) ^ (-207526440);
                            i2 = -131774358;
                            i12 = iM2566 ^ i2;
                            i10 = i;
                        }
                        iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                        i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                        i2 = -929839773;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                    default:
                        RunnableC3474.m10630();
                        if (C0237.m1481() < 0) {
                            iM6981 = C0630.m2566("֨ܰ") ^ i8;
                            i10 = ((iM6981 ^ i9) * 4511) ^ (-1459084243);
                            i11 = 645385578;
                        }
                        iM2566 = (C2105.m6981("ᩳ᩸") ^ i9) * 63;
                        i = ((iM2566 ^ i8) * 19771) ^ 126218763;
                        i2 = -929839773;
                        i12 = iM2566 ^ i2;
                        i10 = i;
                        break;
                }
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void setTitle(CharSequence charSequence) {
        ActivityC18827 activityC18827 = null;
        PluginContext pluginContext = null;
        CharSequence charSequenceM5739 = null;
        String str = null;
        int i = 638806446;
        int i2 = C2520.f8000;
        int i3 = RunnableC3474.f10992;
        int iM2566 = C0630.m2566("᩵ܿ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-13171)) ^ 657104144;
        int i5 = -101702817;
        while (true) {
            i = ((((i ^ i3) * 15935) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2019678152:
                case -1038368366:
                    if (C1420.m4913()) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6529) ^ (-244528142);
                        i5 = 224018175;
                    } else {
                        iM2566 = (C2105.m6981("ۙۤ") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * 11069) ^ (-910923927);
                        i5 = -1744487236;
                    }
                    break;
                case -1880859653:
                case 1345141584:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31303)) ^ 1234707530;
                        i5 = -964525112;
                    } else {
                        iM2566 = C0630.m2566("ۘۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19127) ^ (-6891914);
                        i5 = -1923205116;
                    }
                    break;
                case -1708224694:
                case 791273228:
                    if (C11340.m28021(1, str) == '}') {
                        iM2566 = (C0630.m2566("ۙܶ") + i3) * (-9);
                        i4 = ((iM2566 ^ i2) * 23931) ^ 24844465;
                        i5 = -1199255289;
                    } else {
                        charSequenceM5739 = charSequence;
                        iM2566 = C2105.m6981("۠ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29211)) ^ (-1197675318);
                        i5 = 216688290;
                    }
                    break;
                case -1696011323:
                case 1881242448:
                    activityC18827 = this.f12731;
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6529) ^ (-244528142);
                        i5 = 224018175;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۗܺ")) * 13;
                        i4 = ((iM2566 ^ i2) * 24739) ^ (-1820787409);
                        i5 = -461626443;
                    }
                    break;
                case -1660118023:
                case 648125594:
                    if (C0798.m3000(str, 0) == '{') {
                        iM2566 = (C0630.m2566("᩷᩵") + i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 22797) ^ (-72430543);
                        i5 = -1925603212;
                    } else {
                        charSequenceM5739 = charSequence;
                        iM2566 = C2105.m6981("۠ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29211)) ^ (-1197675318);
                        i5 = 216688290;
                    }
                    break;
                case -1581692983:
                case 1171376153:
                    str = (String) charSequence;
                    if (C1711.m5741(str) >= 3) {
                        iM2566 = C0630.m2566("ۙۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-2453)) ^ 1643095677;
                        i5 = 1196132884;
                    } else {
                        charSequenceM5739 = charSequence;
                        iM2566 = C2105.m6981("۠ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29211)) ^ (-1197675318);
                        i5 = 216688290;
                    }
                    break;
                case -1474981418:
                case 909368449:
                    charSequenceM5739 = C1711.m5739(pluginContext, str);
                    if (charSequenceM5739 == null) {
                        charSequenceM5739 = charSequence;
                    }
                    iM2566 = C2105.m6981("۠ܽ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-29211)) ^ (-1197675318);
                    i5 = 216688290;
                    break;
                case -1333700132:
                case 1065011977:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i3 - C2105.m6981("ܿܿ")) * 127;
                        i4 = ((iM2566 ^ i2) * (-7639)) ^ 842206501;
                        i5 = 665172260;
                    } else {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31303)) ^ 1234707530;
                        i5 = -964525112;
                    }
                    break;
                case -1309337680:
                case -776415213:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27827)) ^ 1795284948;
                        i5 = -1260464095;
                    } else {
                        iM2566 = C0630.m2566("ۢܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7987) ^ 942912584;
                        i5 = -823859034;
                    }
                    break;
                case -1263748713:
                case 282439245:
                    C4075.m12263();
                    if (!C4159.f13567) {
                        iM2566 = (C0630.m2566("ۡۗ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-17049)) ^ 1454288925;
                        i5 = 1877336762;
                    } else {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31303)) ^ 1234707530;
                        i5 = -964525112;
                    }
                    break;
                case -600602629:
                case 377286741:
                    if (C0630.m2564()) {
                        iM2566 = (i3 - C2105.m6981("ܿܿ")) * 127;
                        i4 = ((iM2566 ^ i2) * (-7639)) ^ 842206501;
                        i5 = 665172260;
                    } else {
                        iM2566 = C2105.m6981("۫ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10511) ^ (-1315073748);
                        i5 = 290258655;
                    }
                    break;
                case -546464137:
                case 535800726:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("ۡۗ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-17049)) ^ 1454288925;
                        i5 = 1877336762;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۗᩳ")) * (-43);
                        i4 = ((iM2566 ^ i3) * 22195) ^ (-86658036);
                        i5 = 982482696;
                    }
                    break;
                case -323735904:
                case 1508918598:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6529) ^ (-244528142);
                        i5 = 224018175;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25883) ^ (-1315179549);
                        i5 = -1807854848;
                    }
                    break;
                case -132331878:
                case 480079063:
                    pluginContext = activityC18827.f59393;
                    if (charSequence instanceof String) {
                        iM2566 = (i2 - C2105.m6981("ۖܽ")) * (-109);
                        i4 = ((iM2566 ^ i3) * (-23093)) ^ (-283061394);
                        i5 = 713901086;
                    } else {
                        charSequenceM5739 = charSequence;
                        iM2566 = C2105.m6981("۠ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29211)) ^ (-1197675318);
                        i5 = 216688290;
                    }
                    break;
                case -111634388:
                case 1828747090:
                    activityC18827.setTitle(charSequenceM5739);
                    break;
                case 245946246:
                case 1918357601:
                    if (RunnableC1108.f4040) {
                        iM2566 = (C2105.m6981("ۜۗ") + i3) * (-21);
                        i4 = ((iM2566 ^ i2) * (-7471)) ^ (-1390171571);
                        i5 = -398150610;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܿܿ")) * 127;
                        i4 = ((iM2566 ^ i2) * (-7639)) ^ 842206501;
                        i5 = 665172260;
                    }
                    break;
                case 530216426:
                case 1998869876:
                    if (C0382.f1805) {
                        iM2566 = (C2105.m6981("ۙ۫") + i3) * 9;
                        i4 = ((iM2566 ^ i2) * 1205) ^ (-740651983);
                        i5 = -1384421332;
                    } else {
                        iM2566 = (C0630.m2566("ۡۗ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-17049)) ^ 1454288925;
                        i5 = 1877336762;
                    }
                    break;
                case 1161886825:
                case 1199269031:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ۧۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6529) ^ (-244528142);
                        i5 = 224018175;
                    } else {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8521)) ^ 1147994093;
                        i5 = -428600163;
                    }
                    break;
                case 1294372934:
                case 1794966087:
                    C0422.m1963();
                    C4075.m12263();
                    iM2566 = (C0630.m2566("ۡۗ") + i2) * (-115);
                    i4 = ((iM2566 ^ i3) * (-17049)) ^ 1454288925;
                    i5 = 1877336762;
                    break;
                case 1496517465:
                case 1823485839:
                    if (C21923.f70183 == 0) {
                        iM2566 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27827)) ^ 1795284948;
                        i5 = -1260464095;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܿܿ")) * 127;
                        i4 = ((iM2566 ^ i2) * (-7639)) ^ 842206501;
                        i5 = 665172260;
                    }
                    break;
                default:
                    AbstractC2021.m6574();
                    break;
            }
            return;
        }
    }

    public C4010(ActivityC18827 activityC18827) {
        this.f12731 = activityC18827;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final void recreate() {
        ActivityC18827.m43503(this.f12731);
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final CharSequence getTitle() {
        ActivityC18827 activityC18827 = null;
        CharSequence title = null;
        int i = -430774525;
        int i2 = C5695.f17556;
        int i3 = C2958.f9394;
        int iM2566 = (C0630.m2566("ۚ᩵") ^ i2) * (-19);
        int i4 = ((iM2566 ^ i3) * 20655) ^ 213655094;
        int i5 = -1892404227;
        while (true) {
            i = ((((i ^ i3) * 25227) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2046728096:
                case -2015638088:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9895) ^ (-1982350723);
                        i5 = -1226818719;
                    } else {
                        iM2566 = (C0630.m2566("ۗܿ") ^ i3) * 47;
                        i4 = ((iM2566 ^ i2) * (-26929)) ^ (-1272703704);
                        i5 = 2053646675;
                    }
                    break;
                case -2043917801:
                case -1603907832:
                    if (C21923.f70183 == 0) {
                        iM2566 = (i2 - C2105.m6981("֡ۗ")) * (-55);
                        i4 = ((iM2566 ^ i3) * 22847) ^ 1159356147;
                        i5 = -995723508;
                    } else {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    }
                    break;
                case -1996344665:
                case -1728714169:
                    C3019.m9255();
                    C3746.m11369();
                    iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-15005)) ^ (-1928603029);
                    i5 = -1399311044;
                    break;
                case -1846814080:
                case 912651765:
                    return "";
                case -961674860:
                case 1505350785:
                    C4117.m12364();
                    RunnableC0588.m2441();
                    return null;
                case -944519660:
                case -840337979:
                    if (C4616.m13552() == 0) {
                        iM2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9895) ^ (-1982350723);
                        i5 = -1226818719;
                    } else {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    }
                    break;
                case -472838422:
                case 2099843018:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15005)) ^ (-1928603029);
                        i5 = -1399311044;
                    } else {
                        iM2566 = C0630.m2566("ܺᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10123) ^ 1197023014;
                        i5 = 1793857429;
                    }
                    break;
                case -336992613:
                case 747308818:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("᩻۟") ^ i2) * 3;
                        i4 = ((iM2566 ^ i3) * 8917) ^ (-1596493991);
                        i5 = 1744444849;
                    } else {
                        iM2566 = (C2105.m6981("ۜܳ") ^ i2) * 3;
                        i4 = ((iM2566 ^ i3) * 11275) ^ (-1241788041);
                        i5 = -1296702466;
                    }
                    break;
                case -336619423:
                case 1535389906:
                    activityC18827 = this.f12731;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    } else {
                        iM2566 = C2105.m6981("ܿ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21995)) ^ (-1695337337);
                        i5 = -1665923540;
                    }
                    break;
                case 141804627:
                case 1340630517:
                    return title;
                case 156720660:
                case 1904459833:
                    if (C2126.m7040()) {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    } else {
                        iM2566 = C0630.m2566("۬ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25221) ^ (-2063542340);
                        i5 = -120509830;
                    }
                    break;
                case 162008102:
                case 1556355130:
                    if (C5695.m16023() >= 0) {
                        iM2566 = (i2 - C2105.m6981("֡ۗ")) * (-55);
                        i4 = ((iM2566 ^ i3) * 22847) ^ 1159356147;
                        i5 = -995723508;
                    } else {
                        iM2566 = C0630.m2566("ۤۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15715)) ^ (-1381893442);
                        i5 = -1495853074;
                    }
                    break;
                case 234040731:
                case 348305321:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15005)) ^ (-1928603029);
                        i5 = -1399311044;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۙܳ")) * 67;
                        i4 = ((iM2566 ^ i2) * (-12841)) ^ 1038813294;
                        i5 = 474732922;
                    }
                    break;
                case 329532397:
                case 1136802947:
                    C4075.m12263();
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    } else {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15005)) ^ (-1928603029);
                        i5 = -1399311044;
                    }
                    break;
                case 1001266669:
                case 1439615171:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("᩻۟") ^ i2) * 3;
                        i4 = ((iM2566 ^ i3) * 8917) ^ (-1596493991);
                        i5 = 1744444849;
                    } else {
                        iM2566 = (C2105.m6981("ۜ᩹") + i2) * 49;
                        i4 = ((iM2566 ^ i3) * (-7421)) ^ 789513205;
                        i5 = 1846737170;
                    }
                    break;
                case 1064265904:
                case 2069266082:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15101)) ^ 2023651357;
                        i5 = 1681246671;
                    } else {
                        iM2566 = (C0630.m2566("ܺ֡") + i3) * 41;
                        i4 = ((iM2566 ^ i2) * 17929) ^ (-125031416);
                        i5 = 1848823548;
                    }
                    break;
                case 1138258099:
                case 1273031626:
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ۙᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3331)) ^ 995004850;
                        i5 = 385039047;
                    } else {
                        iM2566 = (i2 - C2105.m6981("֡ۗ")) * (-55);
                        i4 = ((iM2566 ^ i3) * 22847) ^ 1159356147;
                        i5 = -995723508;
                    }
                    break;
                default:
                    title = activityC18827.getTitle();
                    if (title != null) {
                        iM2566 = (i3 - C2105.m6981("ۧܰ")) * (-23);
                        i4 = ((iM2566 ^ i2) * 893) ^ 873171971;
                        i5 = -243138739;
                    } else {
                        iM2566 = C2105.m6981("ۚ֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14003)) ^ 331602088;
                        i5 = 2094801094;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.PreferenceScreen
    public final CharSequence getSubtitle() {
        ActivityC18827 activityC18827 = null;
        CharSequence subtitle = null;
        int i = -625461329;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = RunnableC0588.f2309;
        int iM6981 = (i2 - C2105.m6981("᩶֨")) * 61;
        int i4 = ((iM6981 ^ i3) * (-3109)) ^ (-374014467);
        int i5 = 350287413;
        while (true) {
            i = ((((i ^ i3) * 3993) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2084767357:
                case 1791544103:
                    C0964.m3413();
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۤܽ")) * (-71);
                        i4 = ((iM6981 ^ i3) * 15157) ^ (-251417489);
                        i5 = 1994228212;
                    } else {
                        iM6981 = C0630.m2566("ۡۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22469) ^ 829357414;
                        i5 = 1781464362;
                    }
                    break;
                case -2038206877:
                case -2017643692:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("ۘܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23233) ^ (-1542938012);
                        i5 = -214700080;
                    } else {
                        iM6981 = C2105.m6981("ۧۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31013)) ^ 477260207;
                        i5 = -1446634043;
                    }
                    break;
                case -1953404377:
                case -121347655:
                    return "";
                case -1428976113:
                case -372269975:
                    subtitle = activityC18827.f10584.getSubtitle();
                    if (subtitle != null) {
                        iM6981 = C2105.m6981("ܳ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5419)) ^ (-1052015795);
                        i5 = 1425212324;
                    } else {
                        iM6981 = C2105.m6981("۟ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17061)) ^ (-251611456);
                        i5 = 1631536628;
                    }
                    break;
                case -1293285209:
                case 60979144:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("ۘܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23233) ^ (-1542938012);
                        i5 = -214700080;
                    } else {
                        iM6981 = C0630.m2566("᩸ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7161) ^ 45168220;
                        i5 = 1203989555;
                    }
                    break;
                case -1114506036:
                case 1411718481:
                    C0964.m3413();
                    C0630.m2564();
                    iM6981 = (i2 - C0630.m2566("ۤܽ")) * (-71);
                    i4 = ((iM6981 ^ i3) * 15157) ^ (-251417489);
                    i5 = 1994228212;
                    break;
                case -874287705:
                case 809320075:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("ۖۙ") ^ i3) * (-49);
                        i4 = ((iM6981 ^ i2) * 31689) ^ (-286284081);
                        i5 = -1061848731;
                    } else {
                        iM6981 = (C0630.m2566("ᩳۖ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * (-21327)) ^ (-927071501);
                        i5 = 690158213;
                    }
                    break;
                case -700366266:
                case -418550763:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ۘܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23233) ^ (-1542938012);
                        i5 = -214700080;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֫ۢ")) * 47;
                        i4 = ((iM6981 ^ i2) * 20731) ^ (-1469326145);
                        i5 = -1590483837;
                    }
                    break;
                case -595118822:
                case -247982592:
                    C7811.m20844();
                    return null;
                case -468627477:
                case 1911460209:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ۖۙ") ^ i3) * (-49);
                        i4 = ((iM6981 ^ i2) * 31689) ^ (-286284081);
                        i5 = -1061848731;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩺ۚ")) * (-43);
                        i4 = ((iM6981 ^ i3) * 20243) ^ (-1807602989);
                        i5 = 1477247168;
                    }
                    break;
                case -221058517:
                case 1041073419:
                    C1047.m3599();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ۡܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12211)) ^ (-1190095916);
                        i5 = 610983702;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۤܽ")) * (-71);
                        i4 = ((iM6981 ^ i3) * 15157) ^ (-251417489);
                        i5 = 1994228212;
                    }
                    break;
                case 13648715:
                case 1702649926:
                    return subtitle;
                case 333706088:
                case 1288293472:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۡܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12211)) ^ (-1190095916);
                        i5 = 610983702;
                    } else {
                        iM6981 = (C0630.m2566("ܰ֨") + i3) * 83;
                        i4 = ((iM6981 ^ i2) * (-23981)) ^ 1101102242;
                        i5 = -1820530207;
                    }
                    break;
                case 498755909:
                case 1180217137:
                    if (C0050.m940() <= 0) {
                        iM6981 = C0630.m2566("ۘܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23233) ^ (-1542938012);
                        i5 = -214700080;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۤܽ")) * (-71);
                        i4 = ((iM6981 ^ i3) * 15157) ^ (-251417489);
                        i5 = 1994228212;
                    }
                    break;
                case 525968452:
                case 1255878483:
                    activityC18827 = this.f12731;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C0630.m2566("ۘܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23233) ^ (-1542938012);
                        i5 = -214700080;
                    } else {
                        iM6981 = (C0630.m2566("۬ۡ") ^ i3) * 95;
                        i4 = ((iM6981 ^ i2) * (-23155)) ^ 909098738;
                        i5 = 1457590002;
                    }
                    break;
                case 617347494:
                case 697570103:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C0630.m2566("ۖۙ") ^ i3) * (-49);
                        i4 = ((iM6981 ^ i2) * 31689) ^ (-286284081);
                        i5 = -1061848731;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩹᩵")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i2) * (-9721)) ^ 1091017365;
                        i5 = 635036584;
                    }
                    break;
                case 1949960880:
                case 2139164996:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۤܽ")) * (-71);
                        i4 = ((iM6981 ^ i3) * 15157) ^ (-251417489);
                        i5 = 1994228212;
                    } else {
                        iM6981 = C2105.m6981("᩷ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-21709)) ^ 646784605;
                        i5 = 1894475277;
                    }
                    break;
                default:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C0630.m2566("ۖۙ") ^ i3) * (-49);
                        i4 = ((iM6981 ^ i2) * 31689) ^ (-286284081);
                        i5 = -1061848731;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܺܽ")) * (-77);
                        i4 = ((iM6981 ^ i3) * 27631) ^ (-1018878734);
                        i5 = -1305518764;
                    }
                    break;
            }
        }
    }
}
