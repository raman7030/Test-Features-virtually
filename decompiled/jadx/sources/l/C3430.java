package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3430 {

    /* JADX INFO: renamed from: ۨۢۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f10836 = {6110, 4306, 2854, 558, 2530, 7210, 4467, 7240, -14427, -2584, 245};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20364 f10837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10838;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f10839;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12346 f10840;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2040 f10841;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13132 f10842;

    /* JADX WARN: Code duplicated, block: B:102:0x034d  */
    /* JADX WARN: Code duplicated, block: B:114:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x040e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf A[PHI: r3 r4 r11
      0x01cf: PHI (r3v4 l.ۧۚᩴ) = (r3v3 l.ۧۚᩴ), (r3v2 l.ۧۚᩴ), (r3v2 l.ۧۚᩴ), (r3v2 l.ۧۚᩴ), (r3v2 l.ۧۚᩴ), (r3v2 l.ۧۚᩴ) binds: [B:63:0x01c8, B:52:0x015d, B:46:0x0119, B:40:0x00dc, B:38:0x00c4, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r4v5 l.ۙᩴ᩷) = (r4v2 l.ۙᩴ᩷), (r4v4 l.ۙᩴ᩷), (r4v2 l.ۙᩴ᩷), (r4v2 l.ۙᩴ᩷), (r4v2 l.ۙᩴ᩷), (r4v2 l.ۙᩴ᩷) binds: [B:63:0x01c8, B:52:0x015d, B:46:0x0119, B:40:0x00dc, B:38:0x00c4, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r11v6 l.᩵֡ᩴ) = (r11v5 l.᩵֡ᩴ), (r11v4 l.᩵֡ᩴ), (r11v4 l.᩵֡ᩴ), (r11v4 l.᩵֡ᩴ), (r11v4 l.᩵֡ᩴ), (r11v4 l.᩵֡ᩴ) binds: [B:63:0x01c8, B:52:0x015d, B:46:0x0119, B:40:0x00dc, B:38:0x00c4, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0282  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x031d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19119 m10471(C19119 c19119, String str) {
        int iM6981;
        int i;
        int i2 = 0;
        String strM6378 = null;
        InterfaceC10798 interfaceC10798ListIterator = null;
        C4841 c4841 = null;
        int iM10632 = 0;
        int i3 = 1574647497;
        int i4 = C3019.f9544;
        int i5 = C0483.f2088;
        int iM6982 = C2105.m6981("᩻ۧ") ^ i4;
        int i6 = ((iM6982 ^ i5) * 29907) ^ 1232514155;
        int i7 = -1345483285;
        while (true) {
            int i8 = iM6982 ^ i7;
            C19119 c191110 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 23401) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2094888225:
                    case 1285296100:
                        RunnableC3474.m10630();
                        if (C5695.f17556 < 0) {
                        }
                        iM6981 = (C2105.m6981("ܰᩳ") ^ i5) * 39;
                        i6 = ((iM6981 ^ i4) * (-15659)) ^ (-560969609);
                        i = -1826458229;
                        i8 = iM6981 ^ i;
                        break;
                    case -2069245302:
                    case 1174978972:
                        int size = c19119.size();
                        if (!RunnableC1108.f4040) {
                        }
                        c191110 = new C19119(size);
                        interfaceC10798ListIterator = c19119.listIterator(i2);
                        iM6981 = C2105.m6981("ܽ۫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                        i = -1243564754;
                        i8 = iM6981 ^ i;
                        break;
                        break;
                    case -2057420533:
                    case 652169948:
                        if (c19119.get(i2) == null) {
                            iM6981 = C2105.m6981("֨ۖ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-941)) ^ 1308286565;
                            i = -1925045832;
                        } else {
                            iM6981 = (C2105.m6981("᩵ۜ") + i5) * (-111);
                            i6 = ((iM6981 ^ i4) * 25863) ^ (-634387004);
                            i = -150306716;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -2012910805:
                    case 170222006:
                        if (C0964.f3626 != 0) {
                            iM6981 = (C0630.m2566("᩹ۡ") ^ i5) * (-49);
                            i6 = ((iM6981 ^ i4) * (-7267)) ^ 1411191386;
                            i = 106366849;
                        } else {
                            iM6981 = C2105.m6981("ۖ᩷") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-26559)) ^ 1672548675;
                            i = -2128669181;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -2011871420:
                    case 1743110479:
                        if (C0050.m938(RunnableC1937.m6378(c4841.m14084()), strM6378)) {
                            iM6981 = C2105.m6981("ۧܳ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 15747) ^ (-760124149);
                            i = 2023177852;
                        } else {
                            iM6981 = (i5 - C2105.m6981("ۧ۬")) * 57;
                            i6 = ((iM6981 ^ i4) * (-11745)) ^ (-958195696);
                            i = 343776722;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1823458282:
                    case -1208052397:
                        if (C2105.m6982() == 0) {
                            iM6981 = (C2105.m6981("ܰᩳ") ^ i5) * 39;
                            i6 = ((iM6981 ^ i4) * (-15659)) ^ (-560969609);
                            i = -1826458229;
                        } else {
                            iM6981 = (C0630.m2566("ۙ֫") ^ i5) * (-29);
                            i6 = ((iM6981 ^ i4) * 30385) ^ (-901006524);
                            i = 2036786104;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1800299338:
                    case -1791595872:
                        c191110.add(c4841);
                        iM6981 = C2105.m6981("ܽ۫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                        i = -1243564754;
                        i8 = iM6981 ^ i;
                        break;
                    case -1746761068:
                    case -897349409:
                        if (C22628.f73083 <= 0) {
                            iM6981 = (C0630.m2566("ۙ֫") ^ i5) * (-29);
                            i6 = ((iM6981 ^ i4) * 30385) ^ (-901006524);
                            i = 2036786104;
                        } else {
                            iM6981 = C0630.m2566("ᩳܰ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 17461) ^ (-570771633);
                            i = -739442495;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1699203923:
                    case 614415380:
                        c191110.add(c4841);
                        iM6981 = C2105.m6981("ܽ۫") ^ i4;
                        i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                        i = -1243564754;
                        i8 = iM6981 ^ i;
                        break;
                    case -1499098080:
                    case -328559575:
                        return c19119;
                    case -1476672721:
                    case 645034286:
                        if (c19119.isEmpty()) {
                            i2 = 0;
                            iM6981 = (C2105.m6981("᩵ۜ") + i5) * (-111);
                            i6 = ((iM6981 ^ i4) * 25863) ^ (-634387004);
                            i = -150306716;
                            i8 = iM6981 ^ i;
                        } else {
                            int iM2566 = C0630.m2566("ۨ᩻") ^ i4;
                            i6 = ((iM2566 ^ i5) * (-6157)) ^ (-1720480777);
                            i8 = iM2566 ^ (-880923713);
                            i2 = 0;
                        }
                        break;
                    case -1447978885:
                    case -822351067:
                        iM10632 = -1;
                        iM6981 = (i4 - C2105.m6981("ۤۢ")) * (-83);
                        i6 = ((iM6981 ^ i5) * 12423) ^ 850108841;
                        i = 1884165760;
                        i8 = iM6981 ^ i;
                        break;
                    case -1392804915:
                    case 805026007:
                        if (C7811.m20844() != 0) {
                            iM6981 = (C2105.m6981("ܰᩳ") ^ i5) * 39;
                            i6 = ((iM6981 ^ i4) * (-15659)) ^ (-560969609);
                            i = -1826458229;
                        } else {
                            iM6981 = C0630.m2566("ۤۙ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 4397) ^ (-562592059);
                            i = 1220608226;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1160680836:
                    case -841016562:
                        if (C0422.m1945(C1047.m3595(c4841.f15292), strM6378)) {
                            iM6981 = C2105.m6981("ۧܳ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 15747) ^ (-760124149);
                            i = 2023177852;
                        } else {
                            iM6981 = (i5 - C2105.m6981("᩺֫")) * 7;
                            i6 = ((iM6981 ^ i4) * 1249) ^ (-1007131828);
                            i = 1634708420;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1046588917:
                    case 692789532:
                        C1047.m3599();
                        iM6981 = (C2105.m6981("ܰᩳ") ^ i5) * 39;
                        i6 = ((iM6981 ^ i4) * (-15659)) ^ (-560969609);
                        i = -1826458229;
                        i8 = iM6981 ^ i;
                        break;
                    case -1040460041:
                    case 2096768883:
                        c4841 = (C4841) C2272.m7513(interfaceC10798ListIterator);
                        if (c4841 == null) {
                            iM6981 = C2105.m6981("ܽ۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                            i = -1243564754;
                        } else {
                            iM6981 = (C0630.m2566("ܽۚ") ^ i5) * (-117);
                            i6 = ((iM6981 ^ i4) * (-5725)) ^ (-125014459);
                            i = -1933919762;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -917660466:
                    case -683209092:
                        if (str != null) {
                            iM6981 = C2105.m6981("ܺܳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-2005)) ^ 857261012;
                            i = -1984022673;
                        } else {
                            iM6981 = (C0630.m2566("ۖ֫") + i5) * 39;
                            i6 = ((iM6981 ^ i4) * 4535) ^ (-1215651487);
                            i = 1478939656;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -761678992:
                    case 1457103767:
                        if (C3019.m9255() <= 0) {
                            iM6981 = (i4 - C2105.m6981("ۙۢ")) * (-115);
                            i6 = ((iM6981 ^ i5) * (-23523)) ^ (-300000158);
                            i = 1730204081;
                        } else {
                            iM6981 = C2105.m6981("᩵᩻") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-2289)) ^ (-461683231);
                            i = -254041998;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -748226256:
                    case 1581035105:
                        if (C2520.f8000 >= 0) {
                            iM6981 = (C0630.m2566("᩹ۡ") ^ i5) * (-49);
                            i6 = ((iM6981 ^ i4) * (-7267)) ^ 1411191386;
                            i = 106366849;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ۧܿ")) * (-5);
                            i6 = ((iM6981 ^ i5) * 3181) ^ 617152360;
                            i = 218432511;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -711815077:
                    case 768629769:
                        if (C2167.m7155()) {
                            iM6981 = (C0630.m2566("᩹ۡ") ^ i5) * (-49);
                            i6 = ((iM6981 ^ i4) * (-7267)) ^ 1411191386;
                            i = 106366849;
                        } else {
                            iM6981 = (i4 - C2105.m6981("᩵֨")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i6 = ((iM6981 ^ i5) * 13351) ^ (-907276071);
                            i = 1527651753;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -556809616:
                    case 670149930:
                        C7106.m19120();
                        if (C0714.f2697 < 0) {
                            iM6981 = (C0630.m2566("᩷ۖ") ^ i4) * (-97);
                            i6 = ((iM6981 ^ i5) * 30051) ^ (-828562381);
                            i = 1711932295;
                        } else {
                            iM6981 = C0630.m2566("֫᩶") ^ i4;
                            i6 = ((iM6981 ^ i5) * 19623) ^ (-463965408);
                            i = -1259059776;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -480858088:
                    case 1403719510:
                        if (C1773.m5908() <= 0) {
                            iM6981 = C2105.m6981("᩻᩺") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-29873)) ^ 489759407;
                            i = -67086986;
                        } else {
                            iM6981 = C0630.m2566("۫ۘ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-803)) ^ 1785965140;
                            i = 942916838;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -472552296:
                    case 37763092:
                        C0964.m3413();
                        if (C0237.f1507 != 0) {
                            iM6981 = (C0630.m2566("ۙ֫") ^ i5) * (-29);
                            i6 = ((iM6981 ^ i4) * 30385) ^ (-901006524);
                            i = 2036786104;
                        } else {
                            iM6981 = (C0630.m2566("ۚ᩻") + i5) * (-115);
                            i6 = ((iM6981 ^ i4) * (-30429)) ^ (-146646581);
                            i = -902124922;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -399464256:
                    case 271397920:
                        try {
                            iM10632 = RunnableC3474.m10632(strM6378);
                            iM6981 = (i4 - C2105.m6981("ۤۢ")) * (-83);
                            i6 = ((iM6981 ^ i5) * 12423) ^ 850108841;
                            i = 1884165760;
                        } catch (Exception unused) {
                            iM6981 = C2105.m6981("ܿܺ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-21189)) ^ 210209382;
                            i = 1989290403;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -355093317:
                    case 1306097453:
                        RunnableC3474.m10630();
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM6981 = C2105.m6981("ۡۛ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-2665)) ^ (-720363549);
                            i = 242497906;
                        } else {
                            iM6981 = (i4 - C2105.m6981("ۙۢ")) * (-115);
                            i6 = ((iM6981 ^ i5) * (-23523)) ^ (-300000158);
                            i = 1730204081;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -211109092:
                    case 878739679:
                        strM6378 = RunnableC1937.m6378(str);
                        iM6981 = (C0630.m2566("ۖۜ") ^ i5) * 27;
                        i6 = ((iM6981 ^ i4) * 30371) ^ (-1549759259);
                        i = -1735201561;
                        i8 = iM6981 ^ i;
                        break;
                    case -115294519:
                    case 652384949:
                        return c191110;
                    case 34455579:
                    case 1480711056:
                        if (C0483.m2123(interfaceC10798ListIterator)) {
                            iM6981 = (i4 - C2105.m6981("֡ۨ")) * 123;
                            i6 = ((iM6981 ^ i5) * (-23161)) ^ (-444990668);
                            i = -306328796;
                        } else {
                            iM6981 = (C2105.m6981("ۗۚ") ^ i5) * (-9);
                            i6 = ((iM6981 ^ i4) * 459) ^ 51957644;
                            i = 19043989;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 166880568:
                    case 2022665018:
                        if (iM10632 > 0) {
                            iM6981 = (i4 - C2105.m6981("ۨᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM6981 ^ i5) * (-13123)) ^ 1696054059;
                            i = -1803807783;
                        } else {
                            iM6981 = C2105.m6981("ܽ۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                            i = -1243564754;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 236587373:
                    case 2073675101:
                        if (c4841.f15288.applicationInfo.uid == iM10632) {
                            iM6981 = (C0630.m2566("ۖᩳ") + i4) * 47;
                            i6 = ((iM6981 ^ i5) * 11757) ^ 1343026457;
                            i = 980165262;
                        } else {
                            iM6981 = C2105.m6981("ܽ۫") ^ i4;
                            i6 = ((iM6981 ^ i5) * 8917) ^ 195974346;
                            i = -1243564754;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 261913711:
                    case 1453164117:
                        if (C1916.m6313(str)) {
                            iM6981 = (C0630.m2566("ۖ֫") + i5) * 39;
                            i6 = ((iM6981 ^ i4) * 4535) ^ (-1215651487);
                            i = 1478939656;
                        } else {
                            iM6981 = (C2105.m6981("ۤܿ") + i4) * (-71);
                            i6 = ((iM6981 ^ i5) * 14889) ^ 2000217331;
                            i = -459290961;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 369530917:
                    case 1045410348:
                        if (C2126.f7087) {
                            iM6981 = (C0630.m2566("᩹ۡ") ^ i5) * (-49);
                            i6 = ((iM6981 ^ i4) * (-7267)) ^ 1411191386;
                            i = 106366849;
                        } else {
                            iM6981 = (C2105.m6981("᩵ۢ") + i4) * 45;
                            i6 = ((iM6981 ^ i5) * (-16999)) ^ (-1948790037);
                            i = -477834921;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 589319210:
                    case 1624008593:
                        if (C0798.m2998() != 0) {
                            iM6981 = (C0630.m2566("ۙ֫") ^ i5) * (-29);
                            i6 = ((iM6981 ^ i4) * 30385) ^ (-901006524);
                            i = 2036786104;
                        } else {
                            iM6981 = C2105.m6981("ۡۛ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-2665)) ^ (-720363549);
                            i = 242497906;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 743779027:
                    case 1498744347:
                        if (C1504.m5179()) {
                            iM6981 = C2105.m6981("ۡۛ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-2665)) ^ (-720363549);
                            i = 242497906;
                        } else {
                            iM6981 = C2105.m6981("᩻᩺") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-29873)) ^ 489759407;
                            i = -67086986;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 1000083916:
                    case 1833813835:
                        C0483.m2121();
                        return null;
                    case 1114587095:
                    case 2002925649:
                        if (C3746.f11829 <= 0) {
                            iM6981 = C2105.m6981("ۡۛ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-2665)) ^ (-720363549);
                            i = 242497906;
                        } else {
                            iM6981 = C2105.m6981("ۚۨ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 25013) ^ 1229277679;
                            i = -1937210853;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 1625497190:
                    case 2075729572:
                        return new C19119();
                    default:
                        C1916.m6308();
                        if (C2126.f7087) {
                            iM6981 = (C0630.m2566("᩷ۖ") ^ i4) * (-97);
                            i6 = ((iM6981 ^ i5) * 30051) ^ (-828562381);
                            i = 1711932295;
                        } else {
                            iM6981 = (C2105.m6981("ܰᩳ") ^ i5) * 39;
                            i6 = ((iM6981 ^ i4) * (-15659)) ^ (-560969609);
                            i = -1826458229;
                        }
                        i8 = iM6981 ^ i;
                        break;
                }
            }
            iM6982 = C2105.m6981("ۖ۫") ^ i5;
            i6 = ((iM6982 ^ i4) * (-16767)) ^ 1228672944;
            i7 = -1829045253;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x021f  */
    /* JADX WARN: Code duplicated, block: B:75:0x024e A[PHI: r2 r3 r4
      0x024e: PHI (r2v5 l.ۙᩴ᩷) = (r2v2 l.ۙᩴ᩷), (r2v4 l.ۙᩴ᩷), (r2v2 l.ۙᩴ᩷), (r2v2 l.ۙᩴ᩷) binds: [B:74:0x024c, B:39:0x0116, B:35:0x00f6, B:31:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r3v4 android.content.pm.PackageInfo) = 
      (r3v2 android.content.pm.PackageInfo)
      (r3v2 android.content.pm.PackageInfo)
      (r3v3 android.content.pm.PackageInfo)
      (r3v2 android.content.pm.PackageInfo)
     binds: [B:74:0x024c, B:39:0x0116, B:35:0x00f6, B:31:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r4v3 android.content.pm.ApplicationInfo) = 
      (r4v2 android.content.pm.ApplicationInfo)
      (r4v2 android.content.pm.ApplicationInfo)
      (r4v2 android.content.pm.ApplicationInfo)
      (r4v4 android.content.pm.ApplicationInfo)
     binds: [B:74:0x024c, B:39:0x0116, B:35:0x00f6, B:31:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19119 m10472(ArrayList arrayList) {
        int iM2566;
        int i;
        Iterator itM9029 = null;
        C4841 c4841 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        boolean z = false;
        int i2 = 2078522089;
        int i3 = ViewOnClickListenerC1958.f6529;
        int i4 = RunnableC0588.f2309;
        int iM2567 = (i3 - C0630.m2566("᩹֨")) * (-105);
        int i5 = ((iM2567 ^ i4) * 17305) ^ 1893027409;
        int i6 = 1700276897;
        while (true) {
            int i7 = iM2567 ^ i6;
            C19119 c19119 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-5015)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1982553838:
                    case 1544155168:
                        applicationInfo = packageInfo.applicationInfo;
                        if (C2126.f7087) {
                            iM2566 = (C0630.m2566("۬ܳ") + i4) * (-103);
                            i5 = ((iM2566 ^ i3) * (-4909)) ^ (-1696700632);
                            i = 1257567591;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ܶۤ")) * 61;
                            i5 = ((iM2566 ^ i3) * 8375) ^ (-1567656815);
                            i = -1903631980;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1978851901:
                    case -808665373:
                        if (C0483.m2123(itM9029)) {
                            iM2566 = C0630.m2566("᩸ۛ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 31841) ^ 935693213;
                            i = -2072053998;
                        } else {
                            iM2566 = C0630.m2566("֫ۤ") ^ i4;
                            i5 = ((iM2566 ^ i3) * 26399) ^ (-1828439541);
                            i = 878732060;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1912189875:
                    case -12348581:
                        c19119.add(c4841);
                        c4841.f15290 = this;
                        iM2566 = (i3 - C0630.m2566("ܶ۬")) * 101;
                        i5 = ((iM2566 ^ i4) * 7411) ^ 790971358;
                        i = -1145454362;
                        i7 = iM2566 ^ i;
                        break;
                    case -1763581597:
                    case -369701440:
                        if (C2958.f9394 < 0) {
                        }
                        iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                        i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                        i = -1852540311;
                        i7 = iM2566 ^ i;
                        break;
                    case -1652169031:
                    case 722703831:
                        z = true;
                        iM2566 = (C2105.m6981("ۖۡ") + i4) * (-21);
                        i5 = ((iM2566 ^ i3) * 4837) ^ (-1782090215);
                        i = -1820844658;
                        i7 = iM2566 ^ i;
                        break;
                    case -1416080017:
                    case -496754310:
                        if (C2272.f7362) {
                            iM2566 = (i4 - C0630.m2566("ۖܺ")) * 3;
                            i5 = ((iM2566 ^ i3) * 3701) ^ (-1421117139);
                            i = 1527811266;
                        } else {
                            iM2566 = (C0630.m2566("ܿۢ") ^ i3) * 37;
                            i5 = ((iM2566 ^ i4) * (-15801)) ^ (-1671004186);
                            i = 1798953096;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1382340054:
                    case 171903550:
                        ViewOnClickListenerC2040.m6662(c19119);
                        return c19119;
                    case -966122399:
                    case -100077467:
                        C4263.m12819();
                        C3663.m11168();
                        iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                        i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                        i = -1852540311;
                        i7 = iM2566 ^ i;
                        break;
                    case -914366949:
                    case 1284427016:
                        if (C0964.f3626 != 0) {
                            iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                            i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                            i = -1852540311;
                        } else {
                            iM2566 = C0630.m2566("ۖ֨") ^ i4;
                            i5 = ((iM2566 ^ i3) * 1595) ^ (-905035685);
                            i = 845378386;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -878738013:
                    case -52608332:
                        if (C3432.f10845 < 0) {
                            c19119 = new C19119();
                            itM9029 = C2958.m9029(arrayList);
                            iM2566 = (i3 - C0630.m2566("ܶ۬")) * 101;
                            i5 = ((iM2566 ^ i4) * 7411) ^ 790971358;
                            i = -1145454362;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case -866325353:
                    case -766370095:
                        packageInfo = c4841.f15288;
                        if (C4159.f13567) {
                            iM2566 = C2105.m6981("ۨ᩹") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-25579)) ^ (-366226801);
                            i = -570952268;
                        } else {
                            iM2566 = (C0630.m2566("۬ܳ") + i4) * (-103);
                            i5 = ((iM2566 ^ i3) * (-4909)) ^ (-1696700632);
                            i = 1257567591;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -851833232:
                    case 1890119844:
                        if (z == this.f10839) {
                            iM2566 = (C2105.m6981("֡۟") ^ i3) * (-97);
                            i5 = ((iM2566 ^ i4) * 17459) ^ (-508028578);
                            i = -1867502726;
                        } else {
                            iM2566 = (i3 - C0630.m2566("ܶ۬")) * 101;
                            i5 = ((iM2566 ^ i4) * 7411) ^ 790971358;
                            i = -1145454362;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -823080476:
                    case 988883804:
                        if (C3683.f11629 >= 0) {
                            iM2566 = (i4 - C0630.m2566("ۖܺ")) * 3;
                            i5 = ((iM2566 ^ i3) * 3701) ^ (-1421117139);
                            i = 1527811266;
                        } else {
                            iM2566 = (C0630.m2566("ܶۘ") ^ i3) * (-53);
                            i5 = ((iM2566 ^ i4) * (-32445)) ^ (-33729101);
                            i = 1777464826;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -645803769:
                    case 1109463436:
                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                            iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                            i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                            i = -1852540311;
                        } else {
                            iM2566 = (i4 - C0630.m2566("֨ܽ")) * 41;
                            i5 = ((iM2566 ^ i3) * 30539) ^ (-1657095832);
                            i = 1441003422;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -546363606:
                    case 1102450913:
                        C11340.m28031();
                        if (C1128.f4106 <= 0) {
                            iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                            i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                            i = -1852540311;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۖܺ")) * 3;
                            i5 = ((iM2566 ^ i3) * 3701) ^ (-1421117139);
                            i = 1527811266;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -342812776:
                    case 873018896:
                        if (C0630.m2564()) {
                            iM2566 = (C2105.m6981("۠ᩴ") ^ i4) * 15;
                            i5 = ((iM2566 ^ i3) * (-10965)) ^ 1341802002;
                            i = -1008740588;
                        } else {
                            iM2566 = (C0630.m2566("ۘ᩺") + i3) * 33;
                            i5 = ((iM2566 ^ i4) * (-16993)) ^ 45403613;
                            i = -1852540311;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -45960803:
                    case 1683949942:
                        if (!C1504.f5354) {
                            iM2566 = (C2105.m6981("ܰۚ") ^ i3) * (-43);
                            i5 = ((iM2566 ^ i4) * 17709) ^ (-1462453659);
                            i = 392963258;
                            i7 = iM2566 ^ i;
                        }
                        break;
                    case 468493689:
                    case 1674622775:
                        if (C3746.f11829 <= 0) {
                            iM2566 = (C0630.m2566("۬ܳ") + i4) * (-103);
                            i5 = ((iM2566 ^ i3) * (-4909)) ^ (-1696700632);
                            i = 1257567591;
                        } else {
                            iM2566 = C0630.m2566("ܿ᩺") ^ i4;
                            i5 = ((iM2566 ^ i3) * 18333) ^ (-1503713297);
                            i = -1559613464;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 478627230:
                    case 1046341097:
                        if ((applicationInfo.flags & 129) == 0) {
                            iM2566 = C0630.m2566("ᩳ᩹") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-11045)) ^ (-1003332828);
                            i = 2134081414;
                        } else {
                            iM2566 = C2105.m6981("۟ܿ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-26123)) ^ (-358376858);
                            i = -883279417;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 495334366:
                    case 1767566168:
                        c4841 = (C4841) RunnableC1108.m3791(itM9029);
                        if (C4263.f13799 <= 0) {
                            iM2566 = (C0630.m2566("۬ܳ") + i4) * (-103);
                            i5 = ((iM2566 ^ i3) * (-4909)) ^ (-1696700632);
                            i = 1257567591;
                        } else {
                            iM2566 = C2105.m6981("᩹ۡ") ^ i3;
                            i5 = ((iM2566 ^ i4) * (-12971)) ^ (-1145223402);
                            i = -2039316114;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case 1386289704:
                    case 1502648822:
                        z = false;
                        iM2566 = (C2105.m6981("ۖۡ") + i4) * (-21);
                        i5 = ((iM2566 ^ i3) * 4837) ^ (-1782090215);
                        i = -1820844658;
                        i7 = iM2566 ^ i;
                        break;
                    default:
                        C0382.m1848();
                        C4075.m12263();
                        return null;
                }
            }
            iM2567 = (C0630.m2566("᩸֨") ^ i3) * (-125);
            i5 = ((iM2567 ^ i4) * 23167) ^ (-1464732082);
            i6 = 126075149;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[PHI: r5 r13
      0x00f9: PHI (r5v6 android.view.View) = (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View) binds: [B:35:0x00f7, B:27:0x00b5, B:94:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r13v6 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:35:0x00f7, B:27:0x00b5, B:94:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    public C3430(ViewOnClickListenerC2040 viewOnClickListenerC2040, boolean z) {
        short[] sArr;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        short[] sArr2;
        short[] sArr3;
        int i6;
        C3430 c3430 = this;
        ViewOnClickListenerC2040 viewOnClickListenerC2041 = viewOnClickListenerC2040;
        int i7 = C11340.f33930;
        int i8 = C2520.f8000;
        short s = f10836[0];
        int i9 = ((s * s) + 69022864) - (s * 16616) >= 0 ? 25642 : 20300;
        int iM6982 = C2105.m6981("᩻ۢ") ^ i7;
        int i10 = ((iM6982 ^ i8) * (-14845)) ^ (-345411971);
        View viewM3507 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i11 = iM6982 ^ 920554191;
        int iM6983 = 0;
        int i12 = 0;
        int iM2566 = 0;
        C20364 c20364 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 92057340;
        int i16 = 0;
        int i17 = i10;
        C12346 c12346 = null;
        while (true) {
            i15 = i11 ^ (i17 & (((i15 ^ i8) * 24749) >> 31));
            switch (i15) {
                case -2095643676:
                case 1800757494:
                    viewM3507 = C1005.m3507(c12346, 2124488103 ^ iM2566);
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("۟֨") ^ i7;
                        i2 = ((iM6981 ^ i8) * 16621) ^ (-2082632086);
                        i3 = 9920828;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۘ") + i7) * (-11);
                        i2 = ((iM6981 ^ i8) * 15139) ^ 204967668;
                        i3 = 1320612279;
                    }
                    i11 = iM6981 ^ i3;
                    i17 = i2;
                    break;
                case -1919710829:
                case -1397083071:
                    C13132 c13132 = (C13132) viewM3507;
                    c3430.f10842 = c13132;
                    C1294.m4381(c13132, c20364);
                    return;
                case -1884746822:
                case -1382064161:
                    sArr = sArr4;
                    i = i9;
                    i16 = 1;
                    i13 = 3;
                    if (C0483.f2088 < 0) {
                        int iM6984 = (C2105.m6981("ܺ᩸") + i8) * 91;
                        i2 = ((iM6984 ^ i7) * 24111) ^ (-905078275);
                        i11 = iM6984 ^ 1709565645;
                        i9 = i;
                        sArr4 = sArr;
                        i17 = i2;
                    } else {
                        int iM2567 = C0630.m2566("ۖܳ") ^ i8;
                        int i18 = ((iM2567 ^ i7) * 31215) ^ (-1772950445);
                        i11 = iM2567 ^ 1874406582;
                        i9 = i;
                        sArr4 = sArr;
                        i17 = i18;
                        c20364 = null;
                    }
                    break;
                case -1402544080:
                case 1856794377:
                    i14 = 4;
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("۟֨") ^ i7;
                        i2 = ((iM6981 ^ i8) * 16621) ^ (-2082632086);
                        i3 = 9920828;
                    } else {
                        iM6981 = (C2105.m6981("ۜܳ") ^ i7) * (-67);
                        i2 = ((iM6981 ^ i8) * (-22711)) ^ 899648330;
                        i3 = 1763990681;
                    }
                    i11 = iM6981 ^ i3;
                    i17 = i2;
                    break;
                case -990757531:
                case -517257060:
                    C3432.m10477();
                    C3432.m10477();
                    throw new RuntimeException();
                case -972446101:
                case -613175600:
                    sArr3 = sArr4;
                    i6 = i16;
                    iM6983 = C2105.m6981(C0964.m3396(sArr3, i6, i13, i9));
                    if (C5695.f17556 >= 0) {
                        i12 = 2127163027;
                        int iM2568 = C0630.m2566("᩷ܺ") ^ i7;
                        int i19 = i9;
                        int i20 = ((iM2568 ^ i8) * 7029) ^ 1556746543;
                        i11 = iM2568 ^ 668670160;
                        i16 = i6;
                        short[] sArr6 = sArr3;
                        i17 = i20;
                        i9 = i19;
                        sArr4 = sArr6;
                    } else {
                        int i21 = i9;
                        int iM2569 = C0630.m2566("ۘۨ") ^ i7;
                        int i22 = ((iM2569 ^ i8) * (-30695)) ^ (-1822510029);
                        i11 = iM2569 ^ (-169720494);
                        i16 = i6;
                        i9 = i21;
                        sArr4 = sArr3;
                        i17 = i22;
                        i12 = 2127163027;
                    }
                    break;
                case -913582353:
                case 295408358:
                    iM2566 = C0630.m2566(C3019.m9250(sArr5, i14, 3, i9));
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (C2105.m6981("۠۟") + i8) * 85;
                        i2 = ((iM6981 ^ i7) * (-27691)) ^ 1572030205;
                        i3 = 917172089;
                        i11 = iM6981 ^ i3;
                        i17 = i2;
                    } else {
                        sArr3 = sArr4;
                        i6 = i16;
                        int iM25610 = C0630.m2566("᩷ܺ") ^ i7;
                        int i110 = i9;
                        int i23 = ((iM25610 ^ i8) * 7029) ^ 1556746543;
                        i11 = iM25610 ^ 668670160;
                        i16 = i6;
                        short[] sArr7 = sArr3;
                        i17 = i23;
                        i9 = i110;
                        sArr4 = sArr7;
                    }
                    break;
                case -725771095:
                case 1400377710:
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("֨֨") ^ i8;
                        i2 = ((iM6981 ^ i7) * 10655) ^ (-2104325784);
                        i3 = -1038444005;
                        i11 = iM6981 ^ i3;
                        i17 = i2;
                    } else {
                        sArr3 = sArr4;
                        i6 = i16;
                        int iM25611 = C0630.m2566("᩷ܺ") ^ i7;
                        int i111 = i9;
                        int i24 = ((iM25611 ^ i8) * 7029) ^ 1556746543;
                        i11 = iM25611 ^ 668670160;
                        i16 = i6;
                        short[] sArr8 = sArr3;
                        i17 = i24;
                        i9 = i111;
                        sArr4 = sArr8;
                    }
                    break;
                case -487090636:
                case -169402300:
                    i4 = i9;
                    i5 = i16;
                    c3430.f10841 = viewOnClickListenerC2041;
                    c3430.f10839 = z;
                    sArr2 = f10836;
                    if (C4616.f14690 <= 0) {
                        int iM25612 = C0630.m2566("ۙ֨") ^ i8;
                        int i25 = ((iM25612 ^ i7) * (-3621)) ^ 1286588804;
                        i11 = iM25612 ^ 1331047646;
                        i16 = i5;
                        i9 = i4;
                        sArr4 = sArr2;
                        i17 = i25;
                        c3430 = this;
                    } else {
                        int iM6985 = C2105.m6981("ۢܽ") ^ i7;
                        int i26 = ((iM6985 ^ i8) * 28847) ^ (-1428584584);
                        i11 = iM6985 ^ 1535373341;
                        c3430 = this;
                        i16 = i5;
                        i9 = i4;
                        sArr4 = sArr2;
                        i17 = i26;
                        viewOnClickListenerC2041 = viewOnClickListenerC2040;
                    }
                    break;
                case -467845121:
                case 516003223:
                    C1773.m5908();
                    if (!C21923.m49329()) {
                        iM6981 = C0630.m2566("۟֨") ^ i7;
                        i2 = ((iM6981 ^ i8) * 16621) ^ (-2082632086);
                        i3 = 9920828;
                        i11 = iM6981 ^ i3;
                        i17 = i2;
                    } else {
                        sArr2 = sArr4;
                        i5 = i16;
                        i4 = i9;
                        int iM25613 = C0630.m2566("ۙ֨") ^ i8;
                        int i27 = ((iM25613 ^ i7) * (-3621)) ^ 1286588804;
                        i11 = iM25613 ^ 1331047646;
                        i16 = i5;
                        i9 = i4;
                        sArr4 = sArr2;
                        i17 = i27;
                        c3430 = this;
                    }
                    break;
                case -288841537:
                case 1237247823:
                    if (C4117.f13076 <= 0) {
                        sArr3 = sArr4;
                        i6 = i16;
                        int iM25614 = C0630.m2566("᩷ܺ") ^ i7;
                        int i112 = i9;
                        int i28 = ((iM25614 ^ i8) * 7029) ^ 1556746543;
                        i11 = iM25614 ^ 668670160;
                        i16 = i6;
                        short[] sArr9 = sArr3;
                        i17 = i28;
                        i9 = i112;
                        sArr4 = sArr9;
                    } else {
                        sArr2 = sArr4;
                        i5 = i16;
                        i4 = i9;
                        int iM25615 = C0630.m2566("ۙ֨") ^ i8;
                        int i29 = ((iM25615 ^ i7) * (-3621)) ^ 1286588804;
                        i11 = iM25615 ^ 1331047646;
                        i16 = i5;
                        i9 = i4;
                        sArr4 = sArr2;
                        i17 = i29;
                        c3430 = this;
                    }
                    break;
                case -202242993:
                case 242990247:
                    C0050.m940();
                    C0964.m3413();
                    sArr2 = sArr4;
                    i5 = i16;
                    i4 = i9;
                    int iM25616 = C0630.m2566("ۙ֨") ^ i8;
                    int i210 = ((iM25616 ^ i7) * (-3621)) ^ 1286588804;
                    i11 = iM25616 ^ 1331047646;
                    i16 = i5;
                    i9 = i4;
                    sArr4 = sArr2;
                    i17 = i210;
                    c3430 = this;
                    break;
                case 114715379:
                case 1058321242:
                    c12346.m29957(viewOnClickListenerC2041);
                    if (C0050.f910 < 0) {
                        c20364 = new C20364(viewOnClickListenerC2041, c3430);
                        c3430.f10837 = c20364;
                        sArr5 = f10836;
                        if (C3746.f11829 > 0) {
                            iM6981 = C2105.m6981("֨ܺ") ^ i8;
                            i2 = ((iM6981 ^ i7) * 11583) ^ 1259575743;
                            i3 = -452455985;
                            i11 = iM6981 ^ i3;
                            i17 = i2;
                            break;
                        }
                    }
                    sArr = sArr4;
                    i = i9;
                    int iM25617 = C0630.m2566("ۖܳ") ^ i8;
                    int i113 = ((iM25617 ^ i7) * 31215) ^ (-1772950445);
                    i11 = iM25617 ^ 1874406582;
                    i9 = i;
                    sArr4 = sArr;
                    i17 = i113;
                    c20364 = null;
                    break;
                case 517788405:
                case 566802814:
                    c12346 = (C12346) C3019.m9259(viewOnClickListenerC2041, iM6983 ^ i12);
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("֨֨") ^ i8;
                        i2 = ((iM6981 ^ i7) * 10655) ^ (-2104325784);
                        i3 = -1038444005;
                    } else {
                        iM6981 = C0630.m2566("ܳܺ") ^ i8;
                        i2 = ((iM6981 ^ i7) * 3235) ^ (-1223610058);
                        i3 = -778980314;
                    }
                    i11 = iM6981 ^ i3;
                    i17 = i2;
                    break;
                default:
                    c3430.f10840 = c12346;
                    if (RunnableC1937.m6387() == 0) {
                        iM6981 = (C0630.m2566("۬᩺") ^ i7) * 83;
                        i2 = ((iM6981 ^ i8) * 29437) ^ 1210060659;
                        i3 = -151535252;
                        i11 = iM6981 ^ i3;
                        i17 = i2;
                    } else {
                        sArr = sArr4;
                        i = i9;
                        int iM25618 = C0630.m2566("ۖܳ") ^ i8;
                        int i114 = ((iM25618 ^ i7) * 31215) ^ (-1772950445);
                        i11 = iM25618 ^ 1874406582;
                        i9 = i;
                        sArr4 = sArr;
                        i17 = i114;
                        c20364 = null;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13307 m10470(C19119 c19119, String str) {
        C19119 c19119M10471 = null;
        InterfaceC10798 interfaceC10798ListIterator = null;
        int i = 0;
        C4841 c4841 = null;
        int i2 = 295817250;
        int i3 = C4263.f13799;
        int i4 = C0714.f2697;
        int iM2566 = C0630.m2566("ܺ֡") ^ i3;
        int i5 = ((iM2566 ^ i4) * 28279) ^ 1915249703;
        int i6 = -2146959098;
        while (true) {
            i2 = ((((i2 ^ i4) * (-32631)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2007973589:
                case -355401324:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i4 - C2105.m6981("ܰ᩶")) * 13;
                        i5 = ((iM2566 ^ i3) * (-15595)) ^ (-1081353592);
                        i6 = -216078363;
                    } else {
                        iM2566 = C2105.m6981("ۗܰ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27087) ^ (-190362300);
                        i6 = -1371129096;
                    }
                    break;
                case -1966984978:
                case 2071682389:
                    if (C1128.f4106 > 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i3) * 41;
                        i5 = ((iM2566 ^ i4) * 18335) ^ 2131188445;
                        i6 = -37086415;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩵ۙ")) * (-33);
                        i5 = ((iM2566 ^ i3) * 2709) ^ (-1013920001);
                        i6 = 847313987;
                    }
                    break;
                case -1709520663:
                case -822605799:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i3) * 41;
                        i5 = ((iM2566 ^ i4) * 18335) ^ 2131188445;
                        i6 = -37086415;
                    } else {
                        iM2566 = C0630.m2566("ۨۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 27241) ^ (-1354105716);
                        i6 = 1358126823;
                    }
                    break;
                case -1699167868:
                case -1237743008:
                    ViewOnClickListenerC1958.m6429();
                    RunnableC1108.m3790();
                    iM2566 = (i4 - C2105.m6981("ܰ᩶")) * 13;
                    i5 = ((iM2566 ^ i3) * (-15595)) ^ (-1081353592);
                    i6 = -216078363;
                    break;
                case -1672981299:
                case -1625868590:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (i4 - C0630.m2566("᩵ۙ")) * (-33);
                        i5 = ((iM2566 ^ i3) * 2709) ^ (-1013920001);
                        i6 = 847313987;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ۨ")) * 13;
                        i5 = ((iM2566 ^ i4) * 4617) ^ 1648325715;
                        i6 = 930886843;
                    }
                    break;
                case -1651641468:
                case -598912694:
                    if (c4841.f15294) {
                        iM2566 = (i3 - C2105.m6981("۟ᩴ")) * (-109);
                        i5 = ((iM2566 ^ i4) * (-12843)) ^ 499245610;
                        i6 = 461796636;
                    } else {
                        iM2566 = C0630.m2566("ܿ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20461) ^ 648499320;
                        i6 = 1658121253;
                    }
                    break;
                case -1613179786:
                case 134861173:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i4 - C0630.m2566("᩵ۙ")) * (-33);
                        i5 = ((iM2566 ^ i3) * 2709) ^ (-1013920001);
                        i6 = 847313987;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܰ᩶")) * 13;
                        i5 = ((iM2566 ^ i3) * (-15595)) ^ (-1081353592);
                        i6 = -216078363;
                    }
                    break;
                case -1433498576:
                case -1109564707:
                    c4841 = (C4841) RunnableC1108.m3791(interfaceC10798ListIterator);
                    if (c4841 != null) {
                        iM2566 = C0630.m2566("۟ᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 3555) ^ 1074477165;
                        i6 = 1375904803;
                    } else {
                        iM2566 = C0630.m2566("ܿ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * 20461) ^ 648499320;
                        i6 = 1658121253;
                    }
                    break;
                case -1405084902:
                case -1004108245:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29221)) ^ 904461537;
                        i6 = 76441064;
                    } else {
                        iM2566 = (C2105.m6981("ۧۚ") + i4) * 51;
                        i5 = ((iM2566 ^ i3) * (-22699)) ^ (-470428953);
                        i6 = -1287704508;
                    }
                    break;
                case -1364321323:
                case 1671561627:
                    i++;
                    iM2566 = C0630.m2566("ܿ۬") ^ i3;
                    i5 = ((iM2566 ^ i4) * 20461) ^ 648499320;
                    i6 = 1658121253;
                    break;
                case -1269510775:
                case -1021849488:
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("᩻ܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-12399)) ^ 2058262626;
                        i6 = 1077881713;
                    } else {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i3) * 41;
                        i5 = ((iM2566 ^ i4) * 18335) ^ 2131188445;
                        i6 = -37086415;
                    }
                    break;
                case -981754428:
                case 190128406:
                    interfaceC10798ListIterator = c19119.listIterator(0);
                    i = 0;
                    iM2566 = C0630.m2566("ܿ۬") ^ i3;
                    i5 = ((iM2566 ^ i4) * 20461) ^ 648499320;
                    i6 = 1658121253;
                    break;
                case -890680050:
                case 902742137:
                    C5695.m16023();
                    C7811.m20844();
                    return null;
                case -878835609:
                case 256271112:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i3) * 41;
                        i5 = ((iM2566 ^ i4) * 18335) ^ 2131188445;
                        i6 = -37086415;
                    } else {
                        iM2566 = (C0630.m2566("۠ۚ") + i3) * (-113);
                        i5 = ((iM2566 ^ i4) * 7547) ^ 342633647;
                        i6 = -80142574;
                    }
                    break;
                case -831320716:
                case -454201749:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ۜۖ") + i3) * (-53);
                        i5 = ((iM2566 ^ i4) * (-6415)) ^ 1771961812;
                        i6 = 670591358;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩵ۙ")) * (-33);
                        i5 = ((iM2566 ^ i3) * 2709) ^ (-1013920001);
                        i6 = 847313987;
                    }
                    break;
                case -233541370:
                case 1114041099:
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("ܳۖ") ^ i3) * 41;
                        i5 = ((iM2566 ^ i4) * 18335) ^ 2131188445;
                        i6 = -37086415;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩺") ^ i4;
                        i5 = ((iM2566 ^ i3) * 18773) ^ 449972692;
                        i6 = 571469667;
                    }
                    break;
                case -120785070:
                case 432645356:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (i4 - C2105.m6981("ܰ᩶")) * 13;
                        i5 = ((iM2566 ^ i3) * (-15595)) ^ (-1081353592);
                        i6 = -216078363;
                    } else {
                        iM2566 = (C2105.m6981("ۤ֨") ^ i4) * 27;
                        i5 = ((iM2566 ^ i3) * (-28995)) ^ 384176505;
                        i6 = 506190769;
                    }
                    break;
                case 321897632:
                case 1451762304:
                    if (C0483.m2123(interfaceC10798ListIterator)) {
                        iM2566 = C0630.m2566("ܶۤ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-6745)) ^ 1547467696;
                        i6 = -1630387338;
                    } else {
                        iM2566 = (i4 - C0630.m2566("۬᩺")) * (-93);
                        i5 = ((iM2566 ^ i3) * 10901) ^ (-1863070268);
                        i6 = -1553403310;
                    }
                    break;
                case 474136530:
                case 1112147188:
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29221)) ^ 904461537;
                        i6 = 76441064;
                    } else {
                        iM2566 = C0630.m2566("᩻᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-24753)) ^ (-1685967361);
                        i6 = 1983483256;
                    }
                    break;
                case 1486088494:
                case 1689234237:
                    c19119M10471 = m10471(c19119, str);
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29221)) ^ 904461537;
                        i6 = 76441064;
                    } else {
                        iM2566 = C0630.m2566("ܶۖ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-28051)) ^ 2062152675;
                        i6 = -2061836949;
                    }
                    break;
                default:
                    return new C13307(c19119, c19119M10471, str, i);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:0x0184 A[PHI: r2 r3
      0x0184: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:44:0x0182, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0184: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:44:0x0182, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ac A[PHI: r7 r8 r9 r10 r11 r13 r14 r15 r20
      0x02ac: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:73:0x02aa, B:69:0x028d, B:65:0x026b, B:61:0x024a, B:28:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e1 A[PHI: r5
      0x02e1: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:77:0x02df, B:24:0x00b4, B:20:0x008e, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x030f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10474(boolean z, ViewOnClickListenerC23185 viewOnClickListenerC23185) {
        int iM2566;
        int i;
        int i2;
        int i3 = AbstractC2021.f6743;
        int i4 = RunnableC0588.f2309;
        int iM2567 = C0630.m2566("۬ۜ") ^ i3;
        int i5 = ((iM2567 ^ i4) * (-30471)) ^ (-355060344);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-1556247634);
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        int bindingAdapterPosition = 0;
        int i7 = 0;
        int i8 = 0;
        int iM2568 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 874372008;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * (-1145)) >> 31));
            switch (i15) {
                case -1992073498:
                case -164829429:
                    viewOnClickListenerC2040.f6824 += i8;
                    iM2566 = (C2105.m6981("֫ᩴ") ^ i4) * (-11);
                    i = ((iM2566 ^ i3) * 15381) ^ (-14873595);
                    i2 = 1534047098;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1962887596:
                case -1661326302:
                    i12 = 35009;
                    iM2566 = (C0630.m2566("ܶ֡") + i4) * (-31);
                    i = ((iM2566 ^ i3) * 27797) ^ (-1721414411);
                    i2 = 1485328194;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1944585997:
                case 833938197:
                    C0798.m3004(2120330287 ^ iM2568);
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ܺۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 27729) ^ 747904927;
                        i2 = -1151160324;
                    } else {
                        iM2566 = (C0630.m2566("᩶ܿ") + i4) * (-113);
                        i = ((iM2566 ^ i3) * (-10965)) ^ 115161315;
                        i2 = -337624285;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1926934849:
                case 2136357177:
                    s = sArr[7];
                    s2 = 2190;
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ᩴ᩸") + i3) * (-35);
                        i = ((iM2566 ^ i4) * (-26575)) ^ 171437390;
                        i2 = 640827245;
                    } else {
                        iM2566 = C0630.m2566("ۛۖ") ^ i4;
                        i = ((iM2566 ^ i3) * 31739) ^ (-1531437929);
                        i2 = 1661029211;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1676723370:
                case 2064629004:
                    if (C4117.f13076 > 0) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i = ((iM2566 ^ i4) * 27481) ^ (-1069468298);
                        i2 = -910761821;
                    } else {
                        iM2566 = C2105.m6981("ܺۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 27729) ^ 747904927;
                        i2 = -1151160324;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1640644758:
                case 985106929:
                    i11 = 4796100;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("ᩴ᩸") + i3) * (-35);
                        i = ((iM2566 ^ i4) * (-26575)) ^ 171437390;
                        i2 = 640827245;
                    } else {
                        iM2566 = C0630.m2566("ۤۙ") ^ i4;
                        i = ((iM2566 ^ i3) * 4201) ^ (-2100655314);
                        i2 = -458767038;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1625336371:
                case 663013538:
                    C0422.m1963();
                    break;
                case -1586410560:
                case 962265156:
                    if (viewOnClickListenerC2040.f6824 == 5) {
                        iM2566 = (C2105.m6981("ۛᩳ") + i3) * 11;
                        i = ((iM2566 ^ i4) * (-507)) ^ 1981391842;
                        i2 = -789761294;
                    } else {
                        iM2566 = C2105.m6981("᩷֫") ^ i3;
                        i = ((iM2566 ^ i4) * 9193) ^ (-423188018);
                        i2 = -1760272650;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1581341612:
                case 500996130:
                    viewOnClickListenerC2040.f6824 = i8;
                    iM2566 = (C2105.m6981("֫ᩴ") ^ i4) * (-11);
                    i = ((iM2566 ^ i3) * 15381) ^ (-14873595);
                    i2 = 1534047098;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1476499167:
                case 1237258145:
                    bindingAdapterPosition = viewOnClickListenerC23185.getBindingAdapterPosition();
                    i7 = bindingAdapterPosition - viewOnClickListenerC2040.f6829;
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܳۤ") ^ i4;
                        i = ((iM2566 ^ i3) * 14829) ^ 1502365826;
                        i2 = 1042863081;
                    } else {
                        iM2566 = (C2105.m6981("۟ۧ") ^ i3) * 39;
                        i = ((iM2566 ^ i4) * 9493) ^ (-726128557);
                        i2 = 503784592;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1113437436:
                case 771094749:
                    int iAbs = Math.abs(i7);
                    viewOnClickListenerC2040.f6829 = bindingAdapterPosition;
                    i8 = 1;
                    if (iAbs == 1) {
                        iM2566 = C2105.m6981("ܿ᩶") ^ i3;
                        i = ((iM2566 ^ i4) * (-15175)) ^ (-903581618);
                        i2 = -1601793121;
                    } else {
                        iM2566 = C2105.m6981("ۢᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 24607) ^ 176399284;
                        i2 = 944092201;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1044518047:
                case -714049961:
                    break;
                case -752525935:
                case -306798741:
                    viewOnClickListenerC2040.f6824 = 0;
                    iM2566 = C2105.m6981("᩷֫") ^ i3;
                    i = ((iM2566 ^ i4) * 9193) ^ (-423188018);
                    i2 = -1760272650;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -693129327:
                case 734415724:
                    i12 = 39158;
                    iM2566 = (C0630.m2566("ܶ֡") + i4) * (-31);
                    i = ((iM2566 ^ i3) * 27797) ^ (-1721414411);
                    i2 = 1485328194;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -600360555:
                case -84250705:
                    int i16 = s + s2;
                    i9 = i16 * i16;
                    i10 = s * s;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ᩴ᩸") + i3) * (-35);
                        i = ((iM2566 ^ i4) * (-26575)) ^ 171437390;
                        i2 = 640827245;
                    } else {
                        iM2566 = (C2105.m6981("ܶ۬") + i3) * (-5);
                        i = ((iM2566 ^ i4) * 1629) ^ (-936098489);
                        i2 = -795669175;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -590140105:
                case 2103240344:
                    int i17 = i10 + i11;
                    if ((i17 + i17) - i9 >= 0) {
                        iM2566 = C0630.m2566("ۗ֨") ^ i4;
                        i = ((iM2566 ^ i3) * (-6319)) ^ 1647292752;
                        i2 = -1304597134;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܶܶ")) * 25;
                        i = ((iM2566 ^ i4) * 11563) ^ (-405831174);
                        i2 = -40776353;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -174597795:
                case 1114608297:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("ۛܳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-25383)) ^ 842278446;
                        i2 = 765847863;
                    } else {
                        iM2566 = (C0630.m2566("ᩳ۫") + i3) * 51;
                        i = ((iM2566 ^ i4) * 857) ^ 1088217451;
                        i2 = 1201020229;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 563814:
                case 756076108:
                    C0964.m3413();
                    if (C3537.m10746() <= 0) {
                        iM2566 = C2105.m6981("ۛܳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-25383)) ^ 842278446;
                        i2 = 765847863;
                    } else {
                        iM2566 = C0630.m2566("ܳۤ") ^ i4;
                        i = ((iM2566 ^ i3) * 14829) ^ 1502365826;
                        i2 = 1042863081;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 48760536:
                case 1713017504:
                    viewOnClickListenerC2040 = this.f10841;
                    if (z) {
                        int iM6981 = (i4 - C2105.m6981("ۡܰ")) * (-113);
                        i5 = ((iM6981 ^ i3) * (-7215)) ^ 233154611;
                        i6 = iM6981 ^ (-1344595487);
                    } else {
                        iM2566 = C2105.m6981("֡᩵") ^ i3;
                        i = ((iM2566 ^ i4) * (-24589)) ^ (-1720778751);
                        i2 = 1322338478;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                case 50941284:
                case 1708793425:
                    if (C3537.m10746() <= 0) {
                        iM2566 = C2105.m6981("ܺۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 27729) ^ 747904927;
                        i2 = -1151160324;
                    } else {
                        iM2566 = C0630.m2566("ᩴۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-30277)) ^ 1661991101;
                        i2 = -696597754;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 175338368:
                case 580499085:
                    C3019.m9255();
                    iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                    i = ((iM2566 ^ i4) * 27481) ^ (-1069468298);
                    i2 = -910761821;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 410718169:
                case 1385992912:
                    viewOnClickListenerC2040.f6829 = -2;
                    break;
                case 482539778:
                case 1333921370:
                    sArr = f10836;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("ᩴ᩸") + i3) * (-35);
                        i = ((iM2566 ^ i4) * (-26575)) ^ 171437390;
                        i2 = 640827245;
                    } else {
                        iM2566 = (C2105.m6981("ܺ᩻") + i3) * 87;
                        i = ((iM2566 ^ i4) * (-3275)) ^ (-1237080887);
                        i2 = -110188061;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1094474845:
                case 1749601443:
                    iM2568 = C0630.m2566(RunnableC1937.m6385(sArr2, i13, i14, i12));
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ܺۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 27729) ^ 747904927;
                        i2 = -1151160324;
                    } else {
                        iM2566 = C2105.m6981("ܰ۠") ^ i3;
                        i = ((iM2566 ^ i4) * 13823) ^ (-610383486);
                        i2 = -625110336;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1202779687:
                case 1773362619:
                    sArr2 = f10836;
                    i13 = 8;
                    i14 = 3;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("ᩴ᩸") + i3) * (-35);
                        i = ((iM2566 ^ i4) * (-26575)) ^ 171437390;
                        i2 = 640827245;
                    } else {
                        iM2566 = C0630.m2566("᩻ۜ") ^ i4;
                        i = ((iM2566 ^ i3) * (-29519)) ^ 604736035;
                        i2 = -658204621;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C3746.m11369() < 0) {
                        iM2566 = C2105.m6981("ᩴۡ") ^ i3;
                        i = ((iM2566 ^ i4) * 27481) ^ (-1069468298);
                        i2 = -910761821;
                    } else {
                        iM2566 = C2105.m6981("ۛܳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-25383)) ^ 842278446;
                        i2 = 765847863;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10473(String str) {
        C20364 c20364 = null;
        C3430 c3430 = null;
        C19119 c19119 = null;
        C19119 c19119M10471 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        int i4 = 1793340135;
        int i5 = C0050.f910;
        int i6 = C11340.f33930;
        int iM6981 = (i5 - C2105.m6981("᩸ܰ")) * (-33);
        int i7 = ((iM6981 ^ i6) * (-31297)) ^ (-190463437);
        int i8 = 1686289270;
        while (true) {
            i4 = ((((i4 ^ i6) * (-5031)) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i4) {
                case -1914944817:
                case 2143068469:
                    C1047.m3599();
                    C3245.m9925();
                    break;
                case -1794449143:
                case -715685996:
                    C11340.m28031();
                    iM6981 = C0630.m2566("ܰۘ") ^ i5;
                    i7 = ((iM6981 ^ i6) * (-2493)) ^ 210240167;
                    i8 = -2095490602;
                    break;
                case -1697160070:
                case 669149097:
                    C1294.m4376(c20364);
                    viewOnClickListenerC2040 = c20364.f65735;
                    if (C3683.m11222()) {
                        iM6981 = C0630.m2566("᩹ܶ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-7539)) ^ (-1397268417);
                        i8 = 1092877800;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩹") ^ i5;
                        i7 = ((iM6981 ^ i6) * 31567) ^ 1979394175;
                        i8 = -1580898429;
                    }
                    break;
                case -1596504041:
                case -1098345332:
                    c20364.f65738 = str;
                    c3430 = c20364.f65734;
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ۛ᩶") ^ i6;
                        i7 = ((iM6981 ^ i5) * 7889) ^ 272736882;
                        i8 = 1717011539;
                    } else {
                        iM6981 = (C0630.m2566("ܶۨ") ^ i6) * 29;
                        i7 = ((iM6981 ^ i5) * (-11481)) ^ (-1062191817);
                        i8 = -286784110;
                    }
                    break;
                case -1432271561:
                case 1322783034:
                    c20364 = this.f10837;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۛ᩶") ^ i6;
                        i7 = ((iM6981 ^ i5) * 7889) ^ 272736882;
                        i8 = 1717011539;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩺") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-14299)) ^ 1951269706;
                        i8 = 1789020922;
                    }
                    break;
                case -1300410988:
                case 1516765610:
                    if (C1005.f3721) {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۜۚ")) * 39;
                        i7 = ((iM6981 ^ i6) * (-30335)) ^ (-547450714);
                        i8 = 2030165864;
                    }
                    break;
                case -1115393556:
                case 1921088252:
                    if (C1916.m6308() < 0) {
                        iM6981 = C0630.m2566("᩹ܶ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-7539)) ^ (-1397268417);
                        i8 = 1092877800;
                    } else {
                        iM6981 = C0630.m2566("ܰۘ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-2493)) ^ 210240167;
                        i8 = -2095490602;
                    }
                    break;
                case -611591743:
                case 769831667:
                    c19119M10471 = m10471(c19119, str);
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    } else {
                        iM6981 = C2105.m6981("᩷۫") ^ i6;
                        i7 = ((iM6981 ^ i5) * 3169) ^ 1126168689;
                        i8 = -1731346137;
                    }
                    break;
                case -488556675:
                case 1290067279:
                    c20364.f65733 = c19119M10471;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ۛ᩶") ^ i6;
                        i7 = ((iM6981 ^ i5) * 7889) ^ 272736882;
                        i8 = 1717011539;
                    } else {
                        iM6981 = C0630.m2566("֡᩵") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-16993)) ^ 211434053;
                        i8 = -1818182941;
                    }
                    break;
                case -432021436:
                case 559913880:
                    c19119 = c20364.f65737;
                    AbstractC2021.m6565(c3430);
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    } else {
                        iM6981 = C2105.m6981("ܽܽ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-10311)) ^ (-1291416979);
                        i8 = 657335082;
                    }
                    break;
                case -412089532:
                case 1862627164:
                    i = c20364.f65736;
                    i2 = 1;
                    if (C0382.f1805) {
                        iM6981 = (C2105.m6981("᩺ܺ") + i6) * 19;
                        i7 = ((iM6981 ^ i5) * 27755) ^ 1054481554;
                        i8 = -944670669;
                    } else {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    }
                    break;
                case -400066024:
                case 883803741:
                    c20364.f65736 = i3;
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("ܰۘ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-2493)) ^ 210240167;
                        i8 = -2095490602;
                    } else {
                        iM6981 = C2105.m6981("ۤۨ") ^ i6;
                        i7 = ((iM6981 ^ i5) * 9897) ^ (-1636660296);
                        i8 = 1325244354;
                    }
                    break;
                case 67623251:
                case 1622878834:
                    if (C1294.f4556 < 0) {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    } else {
                        iM6981 = C0630.m2566("ܰۘ") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-2493)) ^ 210240167;
                        i8 = -2095490602;
                    }
                    break;
                case 195254139:
                case 472554439:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("ܳ᩻") + i6) * 49;
                        i7 = ((iM6981 ^ i5) * 18679) ^ 2076578697;
                        i8 = -289394344;
                    } else {
                        iM6981 = C2105.m6981("۠᩻") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-2275)) ^ 1841085361;
                        i8 = -1300372502;
                    }
                    break;
                case 791369600:
                case 2028938567:
                    i3 = i + i2;
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("᩹ܶ") ^ i6;
                        i7 = ((iM6981 ^ i5) * (-7539)) ^ (-1397268417);
                        i8 = 1092877800;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩸") ^ i5;
                        i7 = ((iM6981 ^ i6) * (-21029)) ^ (-903600736);
                        i8 = 344104475;
                    }
                    break;
                default:
                    viewOnClickListenerC2040.f6835 = -1;
                    break;
            }
            return;
        }
    }
}
