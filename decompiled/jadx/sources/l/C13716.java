package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.io.IOException;
import java.io.InputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13716 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۤܶܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f40932 = {14, -13606, 14568, -16264, -11605, 11064, -14239};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f40933;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f40934;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f40935;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f40936;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40937;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM2566;
        int i;
        C22933 c22933 = null;
        AbstractC15440 abstractC15440 = null;
        int i2 = 1630892948;
        int i3 = C22628.f73083;
        int i4 = C1128.f4106;
        int iM6981 = C2105.m6981("ܰ᩸") ^ i4;
        int i5 = ((iM6981 ^ i3) * 25433) ^ (-1551283888);
        int i6 = 1992081396;
        while (true) {
            int i7 = iM6981 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 7723) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1954572623:
                    case 279170758:
                        C3019.m9255();
                        if (C21923.f70183 != 0) {
                            iM6981 = C2105.m6981("֨ܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 25683) ^ (-1060953421);
                            i6 = 1444083157;
                        } else {
                            iM6981 = (C0630.m2566("ᩳܺ") + i4) * (-121);
                            i5 = ((iM6981 ^ i3) * 665) ^ (-2026913487);
                            i6 = -583151683;
                        }
                        break;
                    case -1775202322:
                    case 430657935:
                        if (C1128.f4106 > 0) {
                            iM6981 = (C2105.m6981("ᩳ᩵") ^ i3) * 89;
                            i5 = ((iM6981 ^ i4) * (-31565)) ^ (-130902011);
                            i6 = -847386557;
                        } else {
                            iM6981 = C0630.m2566("ܳۧ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-4207)) ^ (-1763350340);
                            i6 = -2009042202;
                        }
                        break;
                    case -1692237382:
                    case 2060659591:
                        if (C4117.f13076 > 0) {
                            iM6981 = C0630.m2566("ۡᩴ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 15899) ^ 569103640;
                            i6 = 2018290580;
                        } else {
                            iM6981 = C0630.m2566("᩺᩸") ^ i4;
                            i5 = ((iM6981 ^ i3) * 18425) ^ 334208282;
                            i6 = 405046832;
                        }
                        break;
                    case -1485292420:
                    case 2005195930:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM6981 = C2105.m6981("ܽ۬") ^ i4;
                            i5 = ((iM6981 ^ i3) * 5957) ^ (-1841601370);
                            i6 = 1827487896;
                        } else {
                            iM6981 = C2105.m6981("᩸֡") ^ i3;
                            i5 = ((iM6981 ^ i4) * 8309) ^ 447818275;
                            i6 = -1631310808;
                        }
                        break;
                    case -1423699742:
                    case 666504491:
                        C7811.m20844();
                        ServiceConnectionC3453.m10564();
                        break;
                    case -1170602324:
                    case 19748222:
                        RunnableC3474.m10626(abstractC15440);
                        break;
                    case -1113353711:
                    case -902287102:
                        C3911.m11924();
                        if (C4117.f13076 <= 0) {
                            iM6981 = (C0630.m2566("ᩳܺ") + i4) * (-121);
                            i5 = ((iM6981 ^ i3) * 665) ^ (-2026913487);
                            i6 = -583151683;
                            break;
                        }
                        iM6981 = C2105.m6981("᩸֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 8309) ^ 447818275;
                        i6 = -1631310808;
                        break;
                    case -354695930:
                    case 41384919:
                        RunnableC0588.m2444(this.f40934, C11340.m28023(abstractC15440));
                        break;
                    case -231494495:
                    case 1586906248:
                        if (C4616.f14690 <= 0) {
                            iM6981 = C0630.m2566("ܳۧ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-4207)) ^ (-1763350340);
                            i6 = -2009042202;
                            break;
                        }
                        iM6981 = C2105.m6981("᩸֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 8309) ^ 447818275;
                        i6 = -1631310808;
                        break;
                    case -191009537:
                    case 1892172783:
                        boolean zM12572 = C4159.m12572(c22933);
                        AbstractC15440 abstractC15441 = this.f40936;
                        if (zM12572) {
                            iM2566 = (i4 - C0630.m2566("᩵ܺ")) * (-113);
                            i5 = ((iM2566 ^ i3) * 3675) ^ 149923848;
                            i = 1040751923;
                        } else {
                            iM2566 = (C0630.m2566("ۛ᩺") ^ i3) * (-35);
                            i5 = ((iM2566 ^ i4) * 8623) ^ (-1828228595);
                            i = 1259110698;
                        }
                        i7 = iM2566 ^ i;
                        abstractC15440 = abstractC15441;
                        break;
                    case -133162982:
                    case 1306365585:
                        if (!C4159.f13567) {
                            iM6981 = C0630.m2566("ܳۧ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-4207)) ^ (-1763350340);
                            i6 = -2009042202;
                            break;
                        }
                        iM6981 = C0630.m2566("ۗۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 26545) ^ 280663384;
                        i6 = 945576553;
                        break;
                    case 350670925:
                    case 1684643871:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM6981 = (C2105.m6981("ۙᩴ") + i3) * (-103);
                            i5 = ((iM6981 ^ i4) * (-14737)) ^ 1278036935;
                            i6 = -898978604;
                        } else {
                            iM6981 = C0630.m2566("ܳۧ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-4207)) ^ (-1763350340);
                            i6 = -2009042202;
                        }
                        break;
                    case 509554354:
                    case 819496768:
                        if (!C11340.m28031()) {
                            iM6981 = C2105.m6981("֨ܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 25683) ^ (-1060953421);
                            i6 = 1444083157;
                            break;
                        }
                        iM6981 = C2105.m6981("֡ۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-29863)) ^ 2139198850;
                        i6 = -2061203082;
                        break;
                    case 623678132:
                    case 1486066015:
                        RunnableC1937.m6387();
                        iM6981 = C2105.m6981("᩸֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 8309) ^ 447818275;
                        i6 = -1631310808;
                        break;
                    case 1074048344:
                    case 1769700769:
                        if (!C0798.f2919) {
                            iM6981 = C0630.m2566("᩷᩶") ^ i3;
                            i5 = ((iM6981 ^ i4) * 18057) ^ (-45738209);
                            i6 = 2017314477;
                        } else {
                            iM6981 = C0630.m2566("᩺᩸") ^ i4;
                            i5 = ((iM6981 ^ i3) * 18425) ^ 334208282;
                            i6 = 405046832;
                        }
                        break;
                    case 1114194440:
                    case 1868169611:
                        if (C4616.m13552() == 0) {
                            iM6981 = C0630.m2566("ۗܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-19825)) ^ (-2114977760);
                            i6 = 1553506430;
                        } else {
                            iM6981 = (C0630.m2566("ᩳܺ") + i4) * (-121);
                            i5 = ((iM6981 ^ i3) * 665) ^ (-2026913487);
                            i6 = -583151683;
                        }
                        break;
                    case 1401072463:
                    case 2117615988:
                        c22933 = this.f40935;
                        if (!C2272.f7362) {
                            iM6981 = C0630.m2566("᩷ۙ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 4773) ^ (-1333378002);
                            i6 = 1742552321;
                        } else {
                            iM6981 = C2105.m6981("᩸֡") ^ i3;
                            i5 = ((iM6981 ^ i4) * 8309) ^ 447818275;
                            i6 = -1631310808;
                        }
                        break;
                    default:
                        if (!C1005.f3721) {
                            iM6981 = (C0630.m2566("ᩳܺ") + i4) * (-121);
                            i5 = ((iM6981 ^ i3) * 665) ^ (-2026913487);
                            i6 = -583151683;
                            break;
                        }
                        iM6981 = (C2105.m6981("ۚۘ") ^ i3) * (-81);
                        i5 = ((iM6981 ^ i4) * (-24533)) ^ (-1927402328);
                        i6 = 1691763453;
                        break;
                }
                return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC15440 abstractC15440 = null;
        Main mainM49336 = null;
        int i = 217986875;
        int i2 = C0630.f2410;
        int i3 = ServiceConnectionC3453.f10921;
        int iM2566 = (C0630.m2566("۟ܺ") + i3) * 47;
        int i4 = ((iM2566 ^ i2) * (-17951)) ^ 662323853;
        int i5 = 1965470817;
        while (true) {
            i = ((((i ^ i2) * 17471) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2079733372:
                case -2003064395:
                    mainM49336 = C21923.m49336(this.f40934);
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31841) ^ (-1235269524);
                        i5 = -992032890;
                    } else {
                        iM2566 = C0630.m2566("ۡܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17713)) ^ (-1023918918);
                        i5 = -687530676;
                    }
                    break;
                case -1961242157:
                case 830952791:
                    abstractC15440 = this.f40936;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ۙۢ") ^ i2) * (-7);
                        i4 = ((iM2566 ^ i3) * (-20539)) ^ (-39649505);
                        i5 = -243669515;
                    } else {
                        iM2566 = C0630.m2566("֫ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 26329) ^ 195874175;
                        i5 = 1216419964;
                    }
                    break;
                case -1935930598:
                case -1917505930:
                    C4075.m12246(mainM49336, exc, null);
                    break;
                case -1882837991:
                case -1383584324:
                    if (!RunnableC1108.m3790()) {
                        iM2566 = C0630.m2566("֨֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13995) ^ (-2053849132);
                        i5 = -1709720522;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31841) ^ (-1235269524);
                        i5 = -992032890;
                    }
                    break;
                case -1636907357:
                case -1012052230:
                    ViewOnClickListenerC1958.m6429();
                    C4263.m12819();
                    iM2566 = C0630.m2566("֨֡") ^ i3;
                    i4 = ((iM2566 ^ i2) * 13995) ^ (-2053849132);
                    i5 = -1709720522;
                    break;
                case -1423812560:
                case 896215603:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ܳۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20937) ^ (-954417571);
                        i5 = 1098858178;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۛ") + i2) * 35;
                        i4 = ((iM2566 ^ i3) * (-30617)) ^ 18978393;
                        i5 = 1551634685;
                    }
                    break;
                case -1150474626:
                case 1947418999:
                    if (C2272.m7503()) {
                        iM2566 = C0630.m2566("֨֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13995) ^ (-2053849132);
                        i5 = -1709720522;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֫֨")) * 73;
                        i4 = ((iM2566 ^ i2) * (-14153)) ^ (-2066199889);
                        i5 = 429429944;
                    }
                    break;
                case -1131507099:
                case 185811564:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("ܳۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20937) ^ (-954417571);
                        i5 = 1098858178;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31841) ^ (-1235269524);
                        i5 = -992032890;
                    }
                    break;
                case -932294070:
                case -192361980:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("֨֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 13995) ^ (-2053849132);
                        i5 = -1709720522;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۤۜ")) * (-71);
                        i4 = ((iM2566 ^ i2) * 29217) ^ (-921576899);
                        i5 = 1913862411;
                    }
                    break;
                case -842719967:
                case 1047876302:
                    if (C3911.m11924() <= 0) {
                        iM2566 = (i2 - C2105.m6981("ܺᩳ")) * 47;
                        i4 = ((iM2566 ^ i3) * 6973) ^ (-615991474);
                        i5 = -1386302513;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۨ۫")) * 89;
                        i4 = ((iM2566 ^ i3) * 25713) ^ (-780023680);
                        i5 = -189880397;
                    }
                    break;
                case -42977285:
                case 1504653354:
                    if (C0422.m1963()) {
                        iM2566 = C0630.m2566("۬ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30163) ^ (-990367380);
                        i5 = -1729861162;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31841) ^ (-1235269524);
                        i5 = -992032890;
                    }
                    break;
                case 107675922:
                case 987618396:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ܺᩳ")) * 47;
                        i4 = ((iM2566 ^ i3) * 6973) ^ (-615991474);
                        i5 = -1386302513;
                    } else {
                        iM2566 = C2105.m6981("ᩳۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28177)) ^ 1826815999;
                        i5 = 556913303;
                    }
                    break;
                case 138178691:
                case 305218002:
                    AbstractC2021.m6569(abstractC15440);
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("ۙۢ") ^ i2) * (-7);
                        i4 = ((iM2566 ^ i3) * (-20539)) ^ (-39649505);
                        i5 = -243669515;
                    } else {
                        iM2566 = C0630.m2566("ۨ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19469)) ^ 1672112711;
                        i5 = 1761534448;
                    }
                    break;
                case 330640430:
                case 1994456511:
                    C3432.m10477();
                    break;
                case 585032702:
                case 1951888642:
                    if (C1128.f4106 > 0) {
                        iM2566 = (i2 - C2105.m6981("ܺᩳ")) * 47;
                        i4 = ((iM2566 ^ i3) * 6973) ^ (-615991474);
                        i5 = -1386302513;
                    } else {
                        iM2566 = C2105.m6981("ܳۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20937) ^ (-954417571);
                        i5 = 1098858178;
                    }
                    break;
                default:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ܳۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20937) ^ (-954417571);
                        i5 = 1098858178;
                    } else {
                        iM2566 = C2105.m6981("۬ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4895) ^ (-1034446631);
                        i5 = -1480587917;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fe A[PHI: r3 r6
      0x00fe: PHI (r3v3 java.lang.Runnable) = (r3v2 java.lang.Runnable), (r3v2 java.lang.Runnable), (r3v4 java.lang.Runnable) binds: [B:35:0x00fc, B:31:0x00dc, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:35:0x00fc, B:31:0x00dc, B:23:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x013b A[PHI: r4 r5
      0x013b: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:39:0x0139, B:15:0x0071, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:39:0x0139, B:15:0x0071, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x016f A[PHI: r10 r11 r15
      0x016f: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:43:0x016d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:43:0x016d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:43:0x016d, B:17:0x0075, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x022b A[PHI: r13 r22
      0x022b: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short) binds: [B:58:0x0229, B:12:0x0069, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r22v5 int) = (r22v4 int), (r22v3 int), (r22v3 int) binds: [B:58:0x0229, B:12:0x0069, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x027a A[PHI: r2 r7 r8 r9 r16 r17
      0x027a: PHI (r2v4 l.᩺ۤܿ) = (r2v2 l.᩺ۤܿ), (r2v3 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v6 short) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:62:0x0260, B:47:0x01aa, B:27:0x00b6, B:9:0x0060, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int i3 = C22628.f73083;
        int i4 = RunnableC3474.f10992;
        int iM2566 = C0630.m2566("ܺ᩺") ^ i3;
        int i5 = ((iM2566 ^ i4) * 13375) ^ (-2099092431);
        Runnable runnable = null;
        String strM6311 = null;
        short[] sArr = null;
        int i6 = iM2566 ^ (-734092042);
        C22933 c22933 = null;
        int iM2567 = 0;
        int i7 = 0;
        int iM6982 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -369000557;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 11649) >> 31));
            switch (i14) {
                case -1998286336:
                case -350042216:
                    iM2567 = C0630.m2566(C1711.m5726(sArr, i9, i10, i11));
                    i7 = 2124913613;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩵۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-16763)) ^ (-1939098636);
                        i2 = -2040514410;
                    } else {
                        iM6981 = C0630.m2566("ܽۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 6249) ^ 2027165493;
                        i2 = -1774213512;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1997780888:
                case -1545844770:
                    c22933.m51049(iM2567 ^ i7);
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ۢ᩺") + i3) * (-37);
                        i = ((iM6981 ^ i4) * 11589) ^ (-1922887178);
                        i2 = -1954439441;
                    } else {
                        iM6981 = C0630.m2566("۬᩸") ^ i4;
                        i = ((iM6981 ^ i3) * 8311) ^ 53854053;
                        i2 = 1419331986;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1979323025:
                case -761606193:
                    int i16 = i12 + i13;
                    i15 = i16 + i16;
                    s2 = 7681;
                    if (C2105.f7037 != 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ֡")) * 67;
                        i = ((iM6981 ^ i4) * 30745) ^ (-844805080);
                        i2 = -1004853839;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۨ") ^ i4) * q.h;
                        i = ((iM6981 ^ i3) * (-23569)) ^ (-1516460168);
                        i2 = -510329010;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1718932527:
                case -703240605:
                    i12 = s * s;
                    i13 = 58997761;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("۫᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 3639) ^ 2028329215;
                        i2 = 880348293;
                    } else {
                        iM6981 = (C2105.m6981("۠ᩳ") ^ i4) * 65;
                        i = ((iM6981 ^ i3) * 11791) ^ (-2031921453);
                        i2 = 1450663121;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1593878170:
                case 1542837283:
                    c22933.mo49542(runnable);
                    c22933.mo49547();
                    this.f40935 = c22933;
                    break;
                case -1573465867:
                case 1435709912:
                    C22628.m50615();
                    if (C11340.f33930 < 0) {
                        iM6981 = C2105.m6981("᩵۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-16763)) ^ (-1939098636);
                        i2 = -2040514410;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۜ֡")) * 67;
                        i = ((iM6981 ^ i4) * 30745) ^ (-844805080);
                        i2 = -1004853839;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1443917219:
                case 755845249:
                    c22933 = new C22933(C22628.m50612(this.f40934));
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("۫᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 3639) ^ 2028329215;
                        i2 = 880348293;
                    } else {
                        iM6981 = (C2105.m6981("ۙᩴ") ^ i4) * (-11);
                        i = ((iM6981 ^ i3) * 3807) ^ 1963503360;
                        i2 = -1607413462;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1185906382:
                case -462889376:
                    C11340.m28031();
                    break;
                case -1134610799:
                case -410399183:
                    C3019.m9255();
                    C2272.m7503();
                    iM6981 = (i3 - C2105.m6981("۬ᩳ")) * (-125);
                    i = ((iM6981 ^ i4) * 14601) ^ (-201253293);
                    i2 = 164352678;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1114847210:
                case 1465219140:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ֡")) * 67;
                        i = ((iM6981 ^ i4) * 30745) ^ (-844805080);
                        i2 = -1004853839;
                    } else {
                        iM6981 = C0630.m2566("۫᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 3639) ^ 2028329215;
                        i2 = 880348293;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -750036498:
                case 727856363:
                    c22933.m51038(iM6982 ^ i8);
                    runnable = null;
                    if (C11340.m28031()) {
                        iM6981 = C2105.m6981("ۚ᩸") ^ i4;
                        i = ((iM6981 ^ i3) * (-27863)) ^ 1802647893;
                        i2 = 975173456;
                    } else {
                        iM6981 = (C2105.m6981("ۢ᩺") + i3) * (-37);
                        i = ((iM6981 ^ i4) * 11589) ^ (-1922887178);
                        i2 = -1954439441;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -567637781:
                case -26245924:
                    if (C4616.m13552() == 0) {
                        iM6981 = (i3 - C2105.m6981("۬ᩳ")) * (-125);
                        i = ((iM6981 ^ i4) * 14601) ^ (-201253293);
                        i2 = 164352678;
                    } else {
                        iM6981 = C2105.m6981("᩵۟") ^ i4;
                        i = ((iM6981 ^ i3) * (-16763)) ^ (-1939098636);
                        i2 = -2040514410;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -413152643:
                case 1460922285:
                    i11 = 42430;
                    iM6981 = (i3 - C2105.m6981("᩸ᩳ")) * 91;
                    i = ((iM6981 ^ i4) * (-21795)) ^ (-1417287363);
                    i2 = 193665017;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -322794155:
                case 782865645:
                    int i17 = s + s2;
                    if ((i17 * i17) - i15 > 0) {
                        iM6981 = (i4 - C2105.m6981("۟ۢ")) * 81;
                        i = ((iM6981 ^ i3) * (-9109)) ^ 2123581013;
                        i2 = -1743462041;
                    } else {
                        iM6981 = (C2105.m6981("ۢۚ") + i3) * (-51);
                        i = ((iM6981 ^ i4) * 29489) ^ (-164370878);
                        i2 = -1530524702;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 24614119:
                case 235694663:
                    iM6982 = C2105.m6981(strM6311);
                    i8 = 2126688454;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("۫᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 3639) ^ 2028329215;
                        i2 = 880348293;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ᩴ᩺")) * (-119);
                        i = ((iM6981 ^ i3) * 7435) ^ 1325656465;
                        i2 = 1442959412;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 30711544:
                case 896759091:
                    strM6311 = C1916.m6311(f40932, 4, 3, i11);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("ۢ᩺") + i3) * (-37);
                        i = ((iM6981 ^ i4) * 11589) ^ (-1922887178);
                        i2 = -1954439441;
                    } else {
                        iM6981 = C2105.m6981("֫᩺") ^ i3;
                        i = ((iM6981 ^ i4) * (-8759)) ^ (-1332073335);
                        i2 = 1005561483;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 302179867:
                case 1662083469:
                    i11 = 19307;
                    iM6981 = (i3 - C2105.m6981("᩸ᩳ")) * 91;
                    i = ((iM6981 ^ i4) * (-21795)) ^ (-1417287363);
                    i2 = 193665017;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1566264407:
                case 1791012644:
                    sArr = f40932;
                    i9 = 1;
                    i10 = 3;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۬ᩳ")) * (-125);
                        i = ((iM6981 ^ i4) * 14601) ^ (-201253293);
                        i2 = 164352678;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-15229)) ^ (-1153604470);
                        i2 = -1123586645;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = f40932[0];
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("۫᩻") ^ i4;
                        i = ((iM6981 ^ i3) * 3639) ^ 2028329215;
                        i2 = 880348293;
                    } else {
                        iM6981 = (C0630.m2566("ᩳᩴ") ^ i3) * (-123);
                        i = ((iM6981 ^ i4) * 16053) ^ (-1032090591);
                        i2 = -886550551;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C13716(C16560 c16560, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        boolean z = false;
        int i = -841406580;
        int i2 = AbstractC2021.f6743;
        int i3 = C0630.f2410;
        this.f40934 = c16560;
        this.f40933 = abstractC15440;
        this.f40936 = abstractC15441;
        int iM6981 = (C2105.m6981("ܺۗ") ^ i2) * 97;
        int i4 = ((iM6981 ^ i3) * (-18569)) ^ (-1100197176);
        int i5 = -480020583;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i3) * (-591)) >> 31));
            switch (i) {
                case -2142421655:
                case 1280071678:
                    if (C1504.m5179()) {
                        iM6981 = C2105.m6981("ۡۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 9737) ^ (-389981039);
                        i5 = -514240434;
                    } else {
                        iM6981 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30869)) ^ 186166584;
                        i5 = -365053690;
                    }
                    break;
                case -1851516602:
                case -1385313832:
                    C0483.m2121();
                    C22628.m50615();
                    iM6981 = (C0630.m2566("᩶۟") + i2) * 69;
                    i4 = ((iM6981 ^ i3) * (-10617)) ^ 1201758229;
                    i5 = 1971915905;
                    break;
                case -1487527162:
                case 1482680570:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C0630.m2566("᩶۟") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * (-10617)) ^ 1201758229;
                        i5 = 1971915905;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۛۨ")) * (-63);
                        i4 = ((iM6981 ^ i3) * 10305) ^ 1486429326;
                        i5 = -1928387796;
                    }
                    break;
                case -1386522983:
                case -911223527:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("᩶᩷") ^ i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 5019) ^ (-8907852);
                        i5 = -372714554;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽ۠")) * 81;
                        i4 = ((iM6981 ^ i3) * (-23895)) ^ (-673419167);
                        i5 = 669150142;
                    }
                    break;
                case -1342117237:
                case 367195695:
                    if (C3019.f9544 >= 0) {
                        iM6981 = (C0630.m2566("᩶᩷") ^ i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 5019) ^ (-8907852);
                        i5 = -372714554;
                    } else {
                        iM6981 = C0630.m2566("ܰᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32005) ^ 954957822;
                        i5 = 2081751930;
                    }
                    break;
                case -1292581686:
                case -832331840:
                    if (C0630.m2564()) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7519) ^ (-1113758689);
                        i5 = -136455100;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21429) ^ 1219659074;
                        i5 = 1728356467;
                    }
                    break;
                case -1142332643:
                case 937409756:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30869)) ^ 186166584;
                        i5 = -365053690;
                    } else {
                        iM6981 = C2105.m6981("֨ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 319) ^ (-1332478686);
                        i5 = -425012425;
                    }
                    break;
                case -1130894837:
                case -610138262:
                    if (!C0483.m2121()) {
                        iM6981 = (C0630.m2566("᩶۟") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * (-10617)) ^ 1201758229;
                        i5 = 1971915905;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7519) ^ (-1113758689);
                        i5 = -136455100;
                    }
                    break;
                case -209658635:
                case 1346909649:
                    C1504.m5179();
                    if (C0714.f2697 < 0) {
                        iM6981 = (C0630.m2566("᩷᩻") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 19423) ^ 1636519392;
                        i5 = 205340163;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7519) ^ (-1113758689);
                        i5 = -136455100;
                    }
                    break;
                case -95443740:
                case 557026746:
                    if (C0237.f1507 != 0) {
                        iM6981 = (C0630.m2566("᩷᩻") ^ i3) * (-105);
                        i4 = ((iM6981 ^ i2) * 19423) ^ 1636519392;
                        i5 = 205340163;
                    } else {
                        iM6981 = C2105.m6981("֡ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 6771) ^ 1297054197;
                        i5 = -135590803;
                    }
                    break;
                case 58703486:
                case 694070493:
                    ViewOnClickListenerC1958.m6429();
                    C2272.m7503();
                    throw new RuntimeException();
                case 89159477:
                case 1692430737:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30869)) ^ 186166584;
                        i5 = -365053690;
                    } else {
                        iM6981 = (C0630.m2566("֫֫") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * (-13453)) ^ (-1679698421);
                        i5 = -533158168;
                    }
                    break;
                case 648353151:
                case 657786655:
                    this.f40937 = z;
                    return;
                case 853473447:
                case 905091847:
                    z = true;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("᩶᩷") ^ i3) * (-11);
                        i4 = ((iM6981 ^ i2) * 5019) ^ (-8907852);
                        i5 = -372714554;
                    } else {
                        iM6981 = (C0630.m2566("ᩳܳ") + i2) * (-47);
                        i4 = ((iM6981 ^ i3) * (-2831)) ^ 791092239;
                        i5 = -1528624935;
                    }
                    break;
                case 1035248079:
                case 1608702726:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7519) ^ (-1113758689);
                        i5 = -136455100;
                    } else {
                        iM6981 = (i2 - C2105.m6981("֫᩻")) * (-127);
                        i4 = ((iM6981 ^ i3) * (-32683)) ^ 87667677;
                        i5 = 1697081922;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        iM6981 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30869)) ^ 186166584;
                        i5 = -365053690;
                    } else {
                        iM6981 = (C0630.m2566("᩶۟") + i2) * 69;
                        i4 = ((iM6981 ^ i3) * (-10617)) ^ 1201758229;
                        i5 = 1971915905;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        AbstractC15440 abstractC15440 = null;
        InputStream inputStreamM9930 = null;
        C3310 c3310M10118 = null;
        C22889 c22889 = null;
        AbstractC15440 abstractC15441 = null;
        boolean z = false;
        int i = 546483448;
        int i2 = RunnableC3474.f10992;
        int i3 = C3537.f11231;
        int iM2566 = (C0630.m2566("᩷ᩴ") ^ i3) * 55;
        int i4 = ((iM2566 ^ i2) * 24997) ^ 1775159269;
        int i5 = -1796594555;
        while (true) {
            i = ((((i ^ i2) * 28733) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2139685921:
                case 1145652975:
                    inputStreamM9930 = C3245.m9930(abstractC15440);
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i3 - C0630.m2566("۠ۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i2) * 26471) ^ 1976958117;
                        i5 = 343418341;
                    } else {
                        iM2566 = C0630.m2566("۫ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6073) ^ 751449425;
                        i5 = 222742156;
                    }
                    break;
                case -2081069079:
                case 876728268:
                    z = false;
                    if (C3663.m11168() >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    } else {
                        iM2566 = C0630.m2566("ۢܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1075) ^ (-1646878988);
                        i5 = -721015956;
                    }
                    break;
                case -2010862132:
                case 859363830:
                    C0714.m2805();
                    C3019.m9255();
                    iM2566 = (i3 - C0630.m2566("۠ۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM2566 ^ i2) * 26471) ^ 1976958117;
                    i5 = 343418341;
                    break;
                case -1983826651:
                case -402217827:
                    c22889 = new C22889(this);
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ۚܰ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * (-18183)) ^ 1900848530;
                        i5 = 715792452;
                    } else {
                        iM2566 = C2105.m6981("֫ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28667) ^ 848187706;
                        i5 = -1236609854;
                    }
                    break;
                case -1877703759:
                case 1431925498:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    } else {
                        iM2566 = C2105.m6981("᩹ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14029)) ^ (-1681638413);
                        i5 = 1632939809;
                    }
                    break;
                case -1857346337:
                case -1326540612:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    } else {
                        iM2566 = C0630.m2566("ܿ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 22131) ^ (-1474178296);
                        i5 = 572600917;
                    }
                    break;
                case -1678873868:
                case 764540381:
                    abstractC15440 = this.f40933;
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("۫ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3883) ^ 1058317370;
                        i5 = 1668922825;
                    } else {
                        iM2566 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 11501) ^ 1087784695;
                        i5 = -234973993;
                    }
                    break;
                case -1283188908:
                case 901055413:
                    C3432.m10477();
                    break;
                case -1259586980:
                case 1144939494:
                    c3310M10118.m10120(abstractC15441.mo23555(z));
                    break;
                case -213547064:
                case -178007997:
                    C2520.m8026();
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = (i3 - C0630.m2566("۠ۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i2) * 26471) ^ 1976958117;
                        i5 = 343418341;
                    } else {
                        iM2566 = C2105.m6981("ᩳ֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12821) ^ 732952934;
                        i5 = -1263698158;
                    }
                    break;
                case -208091898:
                case 1888338452:
                    if (C1005.m3501()) {
                        iM2566 = C2105.m6981("ܽۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3945) ^ 537432758;
                        i5 = 1007250351;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    }
                    break;
                case 43232705:
                case 1092261101:
                    if (!C3663.f11553) {
                        iM2566 = (i3 - C0630.m2566("۠ۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i2) * 26471) ^ 1976958117;
                        i5 = 343418341;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    }
                    break;
                case 160793549:
                case 1696025280:
                    if (C0714.f2697 < 0) {
                        iM2566 = C0630.m2566("۫ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3883) ^ 1058317370;
                        i5 = 1668922825;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۙۢ")) * 109;
                        i4 = ((iM2566 ^ i3) * (-4627)) ^ (-1851120484);
                        i5 = 951644152;
                    }
                    break;
                case 1205970383:
                case 1744006662:
                    c3310M10118.m10121(c22889);
                    abstractC15441 = this.f40936;
                    if (C1128.m3851() <= 0) {
                        iM2566 = C0630.m2566("۫ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3883) ^ 1058317370;
                        i5 = 1668922825;
                    } else {
                        iM2566 = (C0630.m2566("ۧ֨") ^ i3) * 27;
                        i4 = ((iM2566 ^ i2) * (-13425)) ^ (-684698631);
                        i5 = -1653824992;
                    }
                    break;
                case 1286939507:
                case 1575174473:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (i3 - C0630.m2566("۠ۗ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i2) * 26471) ^ 1976958117;
                        i5 = 343418341;
                    } else {
                        iM2566 = (C0630.m2566("֫᩵") + i3) * 59;
                        i4 = ((iM2566 ^ i2) * (-1851)) ^ (-82389211);
                        i5 = -710764701;
                    }
                    break;
                default:
                    c3310M10118 = C3310.m10118(inputStreamM9930);
                    if (C7811.m20844() != 0) {
                        iM2566 = (C0630.m2566("ۚܰ") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * (-18183)) ^ 1900848530;
                        i5 = 715792452;
                    } else {
                        iM2566 = (C2105.m6981("۬ۤ") ^ i2) * q.h;
                        i4 = ((iM2566 ^ i3) * 4229) ^ 643386191;
                        i5 = 1183517988;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f40935.m51051();
        C0422.m1956();
    }
}
