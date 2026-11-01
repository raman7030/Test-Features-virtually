package p067l;

import android.R;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩷᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 650G */
/* JADX INFO: loaded from: classes4.dex */
public final class C22494 {

    /* JADX INFO: renamed from: ᩳ */
    public static WeakReference f70926;

    /* JADX INFO: renamed from: ᩺ۗۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f82997 = {1671, -26945, -26951, -26964, -26949, -26949, -26957, -26949, -26960, -26966, -26896, -26966, -26970, -26966, -26897, -26897, -26897, -26924, -22834, -15468, 2268, 27654, -30755, 24301, 32617, 28997, 22927, 22582, 32256, -28498, -26959, 31200, 25886, 31607, 6633, 30252, 22294, 23443, 24817, 28942, 26005, -31868, -29880, 28417};

    /* JADX INFO: renamed from: ֫ */
    public SpannableStringBuilder f70927;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractActivityC5549 f70928;

    /* JADX INFO: renamed from: ܽ */
    public boolean f70929;

    public C22494(AbstractActivityC5549 abstractActivityC5549) {
        String str;
        int iM55979;
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        int iM559710;
        int i3;
        int i4 = RunnableC0871.f81839;
        int i5 = C0992.f81922;
        short s = f82997[0];
        int i6 = (s * 29786) - ((s * s) + 221801449) > 0 ? 30403 : 38622;
        int iM559711 = (i4 - C0946.m55979("᩵֨")) * (-111);
        BufferedReader bufferedReader = null;
        String strM56310 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean zM56397 = false;
        int iM55762 = 0;
        int i7 = 0;
        int i8 = 0;
        int iM55933 = 0;
        int iM55763 = 0;
        boolean zM56404 = false;
        BufferedReader bufferedReader2 = null;
        int i9 = -1711832198;
        BufferedReader bufferedReader3 = null;
        int i10 = ((iM559711 ^ i5) * 14201) ^ 1339323136;
        String line = null;
        int i11 = iM559711 ^ (-1664904415);
        int i12 = 0;
        while (true) {
            i9 = i11 ^ (i10 & (((i9 ^ i5) * 18725) >> 31));
            switch (i9) {
                case -2138496983:
                case 844567289:
                    C0898.m55801(bufferedReader);
                    break;
                case -2133456860:
                case 1197915689:
                    if (iM55762 > 0) {
                        iM55979 = C0873.m55680("ۧ᩺") ^ i4;
                        i10 = ((iM55979 ^ i5) * 3517) ^ 1517042876;
                        i = 1280399573;
                    } else {
                        iM55979 = (C0873.m55680("ۢۚ") + i5) * (-29);
                        i10 = ((iM55979 ^ i4) * (-20417)) ^ (-912544935);
                        i = 594296949;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case -1967899136:
                case -501278220:
                    this.f70927 = spannableStringBuilder2;
                    iM55979 = C0873.m55680("᩵ܰ") ^ i4;
                    i10 = ((iM55979 ^ i5) * 4713) ^ (-1259831116);
                    i = -1197670283;
                    i11 = iM55979 ^ i;
                    break;
                case -1786275183:
                case 560317569:
                    break;
                case -1579047235:
                case 898274993:
                    str = line;
                    i12 = 1;
                    this.f70929 = true;
                    this.f70928 = abstractActivityC5549;
                    bufferedReader2 = null;
                    int iM55680 = C0873.m55680("ܳۗ") ^ i4;
                    i11 = iM55680 ^ 1995870006;
                    i10 = ((iM55680 ^ i5) * (-30875)) ^ 1086974773;
                    line = str;
                    break;
                case -1319506654:
                case 525434167:
                    if (!zM56397) {
                        iM55979 = C0946.m55979("᩷ۗ") ^ i5;
                        i10 = ((iM55979 ^ i4) * 21803) ^ 475965204;
                        i = -55860969;
                        i11 = iM55979 ^ i;
                    } else {
                        i2 = i12;
                        str = line;
                        iM559710 = C0946.m55979("ۜܺ") ^ i5;
                        i10 = (-98915938) ^ ((iM559710 ^ i4) * (-21257));
                        i3 = 812986370;
                        i11 = i3 ^ iM559710;
                        i12 = i2;
                        line = str;
                    }
                    break;
                case -1284344643:
                case 938880269:
                    C0854.m55604(spannableStringBuilder2, ServiceConnectionC1013.m56161(f82997, 14, 3, i6));
                    i7 = 0;
                    i8 = 17;
                    C0946.m55983(spannableStringBuilder2, new ForegroundColorSpan(0), RunnableC0938.m55933(spannableStringBuilder2) - 3, C0894.m55762(spannableStringBuilder2), 17);
                    iM55933 = RunnableC0938.m55933(spannableStringBuilder2);
                    C1036.m56254(spannableStringBuilder2, strM56310);
                    iM55763 = C0894.m55762(spannableStringBuilder2);
                    zM56404 = C1229.m56404(strM56310, C0877.m55707(f82997, 18, 1, i6));
                    iM55979 = C0946.m55979("۬ᩳ") ^ i5;
                    i10 = ((iM55979 ^ i4) * 1603) ^ (-1546634071);
                    i = -1342638796;
                    i11 = iM55979 ^ i;
                    break;
                case -1229222577:
                case -284322147:
                    try {
                        spannableStringBuilder2 = new SpannableStringBuilder();
                        try {
                            i2 = i12;
                            try {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = line;
                                try {
                                    bufferedReader3 = new BufferedReader(new InputStreamReader(abstractActivityC5549.getAssets().open(C0917.m55852(f82997, 1, 13, i6)), StandardCharsets.UTF_8));
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    iM559710 = C0946.m55979("ۜܺ") ^ i5;
                                    i10 = (-98915938) ^ ((iM559710 ^ i4) * (-21257));
                                    i3 = 812986370;
                                } catch (IOException unused) {
                                    spannableStringBuilder2 = spannableStringBuilder;
                                    bufferedReader3 = null;
                                    bufferedReader = bufferedReader2;
                                    iM559710 = C0946.m55979("۬ۙ") ^ i5;
                                    i10 = (-882359890) ^ ((iM559710 ^ i4) * 28951);
                                    i3 = 1831367860;
                                }
                            } catch (IOException unused2) {
                                spannableStringBuilder = spannableStringBuilder2;
                                str = line;
                            }
                        } catch (IOException unused3) {
                            i2 = i12;
                            str = line;
                        }
                    } catch (IOException unused4) {
                        i2 = i12;
                        str = line;
                        spannableStringBuilder2 = null;
                    }
                    i11 = i3 ^ iM559710;
                    i12 = i2;
                    line = str;
                    break;
                case -804964133:
                case -346646548:
                    C0873.m55690(spannableStringBuilder2, new RelativeSizeSpan(1.1f), iM55933, iM55763, i8);
                    C0873.m55690(spannableStringBuilder2, new StyleSpan(i12), iM55933, iM55763, i8);
                    C0854.m55604(spannableStringBuilder2, C1124.m56373(f82997, 19, 1, i6));
                    int i13 = iM55763 + 1;
                    C0946.m55983(spannableStringBuilder2, new ForegroundColorSpan(i7), iM55763, i13, i8);
                    C0946.m55983(spannableStringBuilder2, new RelativeSizeSpan(1.5f), iM55763, i13, i8);
                    C0946.m55983(spannableStringBuilder2, new StyleSpan(i12), iM55763, i13, i8);
                    i2 = i12;
                    str = line;
                    iM559710 = C0946.m55979("ۜܺ") ^ i5;
                    i10 = (-98915938) ^ ((iM559710 ^ i4) * (-21257));
                    i3 = 812986370;
                    i11 = i3 ^ iM559710;
                    i12 = i2;
                    line = str;
                    break;
                case -710256887:
                case -261938743:
                    C1036.m56254(spannableStringBuilder2, RunnableC0897.m55783(f82997, 17, 1, i6));
                    iM55979 = (C0873.m55680("ۢۚ") + i5) * (-29);
                    i10 = ((iM55979 ^ i4) * (-20417)) ^ (-912544935);
                    i = 594296949;
                    i11 = iM55979 ^ i;
                    break;
                case 285807527:
                case 1020038022:
                    iM55762 = C0894.m55762(spannableStringBuilder2);
                    iM55979 = C0946.m55979("ܺ۫") ^ i4;
                    i10 = ((iM55979 ^ i5) * 10889) ^ (-410824941);
                    i = 422383994;
                    i11 = iM55979 ^ i;
                    break;
                case 333050044:
                case 1059341595:
                    strM56310 = C1048.m56310(line);
                    zM56397 = C1194.m56397(strM56310);
                    iM55979 = (C0946.m55979("ܳۡ") + i5) * (-121);
                    i10 = ((iM55979 ^ i4) * 23137) ^ 118223912;
                    i = -1318556219;
                    i11 = iM55979 ^ i;
                    break;
                case 391338496:
                case 1567384086:
                    if (line != null) {
                        iM55979 = C0873.m55680("ܽܺ") ^ i5;
                        i10 = ((iM55979 ^ i4) * 22351) ^ (-2088346247);
                        i = -763024522;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۬ۨ")) * (-113);
                        i10 = ((iM55979 ^ i5) * (-25709)) ^ (-473498109);
                        i = -365232503;
                    }
                    i11 = iM55979 ^ i;
                    break;
                case 1113165251:
                case 1934937442:
                    if (!zM56404) {
                        i2 = i12;
                        str = line;
                        iM559710 = C0946.m55979("ۜܺ") ^ i5;
                        i10 = (-98915938) ^ ((iM559710 ^ i4) * (-21257));
                        i3 = 812986370;
                        i11 = i3 ^ iM559710;
                        i12 = i2;
                        line = str;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩸") ^ i4;
                        i10 = ((iM55979 ^ i5) * (-10357)) ^ (-1762178930);
                        i = 1923979351;
                        i11 = iM55979 ^ i;
                    }
                    break;
                default:
                    try {
                        line = bufferedReader3.readLine();
                        iM55979 = (i4 - C0873.m55680("᩻ܿ")) * 23;
                        i10 = ((iM55979 ^ i5) * (-7319)) ^ 147136707;
                        i = -2009730197;
                        i11 = iM55979 ^ i;
                    } catch (IOException unused5) {
                        i2 = i12;
                        str = line;
                        bufferedReader = bufferedReader3;
                        iM559710 = C0946.m55979("۬ۙ") ^ i5;
                        i10 = (-882359890) ^ ((iM559710 ^ i4) * 28951);
                        i3 = 1831367860;
                        i11 = i3 ^ iM559710;
                        i12 = i2;
                        line = str;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50450() {
        int i = -1657610372;
        int i2 = C1003.f81929;
        int i3 = C1044.f81959;
        int iM55979 = C0946.m55979("֨ܽ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-23231)) ^ (-945246348);
        int i5 = -1596442381;
        while (true) {
            i = ((((i ^ i3) * (-747)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2103323122:
                case -2026252257:
                    if (this.f70929) {
                        iM55979 = (C0873.m55680("֨ۘ") ^ i3) * 29;
                        i4 = ((iM55979 ^ i2) * 32515) ^ 2000469206;
                        i5 = 1751859244;
                    } else {
                        iM55979 = C0873.m55680("ۙ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5649)) ^ (-742143211);
                        i5 = -577340014;
                    }
                    break;
                case -1758382447:
                case -1048887:
                    throw new IllegalStateException();
                case -1743345448:
                case -458857194:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ۧᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17433) ^ (-1931576888);
                        i5 = -600908240;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩸֫")) * (-109);
                        i4 = ((iM55979 ^ i2) * 7997) ^ (-1754083653);
                        i5 = 265113647;
                    }
                    break;
                case -1715017200:
                case -44794224:
                    if (C0937.f81884) {
                        iM55979 = (i2 - C0946.m55979("ۡ۠")) * (-45);
                        i4 = ((iM55979 ^ i3) * (-20401)) ^ (-110922736);
                        i5 = -1463771590;
                    } else {
                        iM55979 = C0873.m55680("۠᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    }
                    break;
                case -1291015700:
                case 1432326203:
                    C1071.m56343();
                    RunnableC0871.m55672();
                    return;
                case -1229242110:
                case 1309179029:
                    C1012.m56134();
                    C1229.m56410();
                    iM55979 = (C0873.m55680("᩺ۜ") + i3) * 15;
                    i4 = ((iM55979 ^ i2) * (-21275)) ^ (-2004435439);
                    i5 = -1462167011;
                    break;
                case -886568698:
                case 95029691:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        iM55979 = C0873.m55680("ۤۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15519) ^ (-865368258);
                        i5 = 1419012025;
                    }
                    break;
                case -799109810:
                case 394405538:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        iM55979 = (C0946.m55979("ܺᩴ") ^ i2) * (-55);
                        i4 = ((iM55979 ^ i3) * (-6085)) ^ (-1190755504);
                        i5 = 1937263412;
                    }
                    break;
                case -787226708:
                case 919088391:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۧᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 17433) ^ (-1931576888);
                        i5 = -600908240;
                    } else {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25429)) ^ (-599491556);
                        i5 = -1613113062;
                    }
                    break;
                case -719063321:
                case 1658377393:
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0873.m55680("۠᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    } else {
                        iM55979 = C0873.m55680("۠ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 713) ^ 335722438;
                        i5 = 668188224;
                    }
                    break;
                case -595879381:
                case 1420516126:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۜ") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * (-21275)) ^ (-2004435439);
                        i5 = -1462167011;
                    }
                    break;
                case -290386222:
                case 436815204:
                    this.f70929 = false;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        iM55979 = (C0946.m55979("ܿۙ") + i3) * (-37);
                        i4 = ((iM55979 ^ i2) * 17863) ^ 1608018420;
                        i5 = 678175639;
                    }
                    break;
                case -262288900:
                case 1477622033:
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("᩺ۜ") + i3) * 15;
                        i4 = ((iM55979 ^ i2) * (-21275)) ^ (-2004435439);
                        i5 = -1462167011;
                    } else {
                        iM55979 = (C0873.m55680("֡ܶ") + i2) * (-51);
                        i4 = ((iM55979 ^ i3) * 20361) ^ 814233798;
                        i5 = 2080420251;
                    }
                    break;
                case 658319629:
                case 1571783074:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        C1036.m56259(new RunnableC18469(0, this));
                        return;
                    }
                    iM55979 = C0946.m55979("ۧᩳ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 17433) ^ (-1931576888);
                    i5 = -600908240;
                    break;
                case 1051551815:
                case 1512218728:
                    if (C0894.f81854 < 0) {
                        iM55979 = C0873.m55680("۠᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    } else {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    }
                    break;
                case 1995301713:
                case 2096598207:
                    if (C0866.m55645()) {
                        iM55979 = C0946.m55979("᩺ۘ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-10513)) ^ (-1079640487);
                        i5 = 1498150378;
                    } else {
                        iM55979 = C0873.m55680("۠᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21697) ^ 712363167;
                        i5 = -588208804;
                    }
                    break;
                default:
                    if (C1194.m56396() > 0) {
                        iM55979 = C0946.m55979("֡ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24385) ^ (-690329378);
                        i5 = -1799181101;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11553)) ^ (-1662764443);
                        i5 = 2019230022;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50449(C22494 c22494) {
        AbstractActivityC5549 abstractActivityC5549 = null;
        String strM55233 = null;
        int i = -1974190046;
        int i2 = C0967.f81910;
        int i3 = C0894.f81854;
        int iM55979 = C0946.m55979("֡ۘ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 18039) ^ (-2104166117);
        int i5 = 1186752476;
        while (true) {
            i = ((((i ^ i3) * (-9811)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1914459721:
                case 801454742:
                    if (C0946.m55980() != 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        iM55979 = C0873.m55680("ܽᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-3039)) ^ (-497274324);
                        i5 = 1016368329;
                    }
                    break;
                case -1913695081:
                case 799288200:
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0873.m55680("᩷ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    } else {
                        iM55979 = (C0873.m55680("᩸ۚ") + i2) * (-57);
                        i4 = ((iM55979 ^ i3) * 21099) ^ 868394222;
                        i5 = 650789994;
                    }
                    break;
                case -1895800946:
                case 357936124:
                    strM55233 = C25165.m55233();
                    if (C1044.m56286() <= 0) {
                        iM55979 = (C0873.m55680("ܰ۠") ^ i3) * (-7);
                        i4 = ((iM55979 ^ i2) * 29045) ^ 1234444251;
                        i5 = 1666031919;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩻") ^ i2) * 9;
                        i4 = ((iM55979 ^ i3) * (-21973)) ^ (-1284926740);
                        i5 = 521149290;
                    }
                    break;
                case -1832322804:
                case -1002271109:
                    C0949.m56012();
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    }
                    break;
                case -1643402652:
                case 1609180156:
                    if (C0863.f81833 > 0) {
                        iM55979 = C0873.m55680("᩷ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    } else {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    }
                    break;
                case -1615502317:
                case 1385218889:
                    if (C0946.m55980() != 0) {
                        iM55979 = C0873.m55680("᩷ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    } else {
                        iM55979 = C0946.m55979("ۤۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10399) ^ (-1277425184);
                        i5 = 2117174424;
                    }
                    break;
                case -1309904010:
                case -596348911:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ᩳۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26093) ^ 1795935697;
                        i5 = 1518997316;
                    } else {
                        iM55979 = C0873.m55680("֨ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31895) ^ 1972772260;
                        i5 = -1543481956;
                    }
                    break;
                case -1082029041:
                case -1050843120:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        iM55979 = C0873.m55680("ܰᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27009)) ^ 564182155;
                        i5 = -233496714;
                    }
                    break;
                case -854058273:
                case 920917634:
                    abstractActivityC5549 = c22494.f70928;
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        iM55979 = (C0946.m55979("֡ܳ") ^ i3) * (-47);
                        i4 = ((iM55979 ^ i2) * 13065) ^ 1436326985;
                        i5 = -659672196;
                    }
                    break;
                case -785515041:
                case 865540:
                    C0949.m56012();
                    C0955.m56025();
                    break;
                case -483840111:
                case -174747471:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("۠᩷") + i3) * 39;
                        i4 = ((iM55979 ^ i2) * (-6019)) ^ (-1476300388);
                        i5 = 325515620;
                    } else {
                        iM55979 = (C0946.m55979("֡ۤ") + i3) * (-75);
                        i4 = ((iM55979 ^ i2) * (-12835)) ^ (-1925659718);
                        i5 = -1728778816;
                    }
                    break;
                case -137017545:
                case 1047156327:
                    ActivityC12554.m28933((Context) abstractActivityC5549, strM55233, true);
                    break;
                case 64596588:
                case 1123842878:
                    ServiceConnectionC1013.m56157();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("۠᩷") + i3) * 39;
                        i4 = ((iM55979 ^ i2) * (-6019)) ^ (-1476300388);
                        i5 = 325515620;
                    } else {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    }
                    break;
                case 963428936:
                case 1646854412:
                    C1003.m56123();
                    C0917.m55854();
                    iM55979 = C0873.m55680("ᩳۢ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 26093) ^ 1795935697;
                    i5 = 1518997316;
                    break;
                case 1733210583:
                case 2137908059:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("۟ۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12155) ^ 2127998045;
                        i5 = 315472546;
                    } else {
                        iM55979 = C0873.m55680("᩷ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26193)) ^ (-1065750796);
                        i5 = 1340439935;
                    }
                    break;
                default:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ۗ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23583)) ^ 1233998449;
                        i5 = -279847283;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳۙ")) * (-81);
                        i4 = ((iM55979 ^ i3) * (-14767)) ^ (-16320310);
                        i5 = 1543610277;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50446(C22494 c22494) {
        AbstractActivityC5549 abstractActivityC5549 = null;
        String strM55233 = null;
        int i = 872934349;
        int i2 = C0930.f81879;
        int i3 = C1044.f81959;
        int iM55979 = (i3 - C0946.m55979("᩵ܶ")) * (-49);
        int i4 = ((iM55979 ^ i2) * 6413) ^ (-1329900562);
        int i5 = -1801898123;
        while (true) {
            i = ((((i ^ i2) * 18623) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2090931755:
                case 2117227848:
                    if (C0912.m55833()) {
                        iM55979 = (C0946.m55979("۫ۗ") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        iM55979 = C0946.m55979("᩷ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25573)) ^ (-2122066668);
                        i5 = 367583119;
                    }
                    break;
                case -1718843139:
                case -800264009:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("۫ۗ") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        iM55979 = (C0946.m55979("ۘ֨") + i3) * 21;
                        i4 = ((iM55979 ^ i2) * (-32337)) ^ 1743085426;
                        i5 = 1916607195;
                    }
                    break;
                case -1649347308:
                case 344670335:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۤܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30127)) ^ (-970838000);
                        i5 = -824617851;
                    } else {
                        iM55979 = (C0946.m55979("ۖᩴ") ^ i3) * 77;
                        i4 = ((iM55979 ^ i2) * 32291) ^ (-2040454493);
                        i5 = 730751844;
                    }
                    break;
                case -1570452259:
                case -1287559088:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("᩸ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-2825)) ^ (-1160202282);
                        i5 = 1351356381;
                    } else {
                        iM55979 = C0873.m55680("ܳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                    break;
                case -1480368203:
                case -1134237917:
                    C1124.m56367();
                    iM55979 = (C0873.m55680("ۘۤ") + i3) * 83;
                    i4 = ((iM55979 ^ i2) * (-28563)) ^ (-1387815973);
                    i5 = -2082264899;
                    break;
                case -1238440623:
                case 2026150296:
                    C0992.m56107();
                    C1017.m56187();
                    break;
                case -1191135583:
                case -724193865:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ܽ۠") + i3) * 79;
                        i4 = ((iM55979 ^ i2) * 32345) ^ 1431501025;
                        i5 = -1913825368;
                    } else {
                        iM55979 = C0873.m55680("ܳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                    break;
                case -972928784:
                case -661000093:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("ۢۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4145) ^ (-1485270980);
                        i5 = 1935397904;
                    } else {
                        iM55979 = C0873.m55680("ܳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    }
                    break;
                case -530257496:
                case 1560613437:
                    if (C1194.f82045 == 0) {
                        iM55979 = C0873.m55680("ܳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    } else {
                        iM55979 = (C0873.m55680("ۘۤ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    }
                    break;
                case -196702815:
                case 673560618:
                    strM55233 = C25165.m55233();
                    if (C1194.f82045 != 0) {
                        iM55979 = (C0946.m55979("۫ۗ") ^ i2) * 53;
                        i4 = ((iM55979 ^ i3) * (-9963)) ^ 999762161;
                        i5 = 1976689377;
                    } else {
                        iM55979 = C0873.m55680("᩺֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12899)) ^ (-997458099);
                        i5 = 462068014;
                    }
                    break;
                case -83879439:
                case 9497002:
                    C0949.m56012();
                    if (RunnableC0938.m55938() == 0) {
                        iM55979 = C0946.m55979("ۤܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30127)) ^ (-970838000);
                        i5 = -824617851;
                    } else {
                        iM55979 = (C0873.m55680("ۘۤ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    }
                    break;
                case 290286007:
                case 1751748678:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("ܳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5651)) ^ (-799120092);
                        i5 = -1988175785;
                    } else {
                        iM55979 = (C0946.m55979("ܿۤ") ^ i2) * 49;
                        i4 = ((iM55979 ^ i3) * 11967) ^ 481758067;
                        i5 = 1262881442;
                    }
                    break;
                case 892650153:
                case 1567789735:
                    ActivityC12554.m28933((Context) abstractActivityC5549, strM55233, true);
                    break;
                case 1258402307:
                case 1572294163:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ۘۤ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        iM55979 = (C0946.m55979("۟ۧ") ^ i2) * (-109);
                        i4 = ((iM55979 ^ i3) * (-20507)) ^ (-1189413721);
                        i5 = -1152184857;
                    }
                    break;
                case 1338653729:
                case 1941357644:
                    abstractActivityC5549 = c22494.f70928;
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ۘۤ") + i3) * 83;
                        i4 = ((iM55979 ^ i2) * (-28563)) ^ (-1387815973);
                        i5 = -2082264899;
                    } else {
                        iM55979 = C0946.m55979("ۗۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6435) ^ 2110611044;
                        i5 = 961743599;
                    }
                    break;
                default:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("ۢۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4145) ^ (-1485270980);
                        i5 = 1935397904;
                    } else {
                        iM55979 = (C0946.m55979("֡֫") ^ i3) * (-113);
                        i4 = ((iM55979 ^ i2) * 14819) ^ (-1537318023);
                        i5 = -557405799;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50451(RunnableC14525 runnableC14525) {
        int i = -736716015;
        int i2 = C1028.f81950;
        int i3 = C1044.f81959;
        int iM55680 = (C0873.m55680("ۧ֨") ^ i3) * (-63);
        int i4 = ((iM55680 ^ i2) * 25867) ^ (-2057622712);
        int i5 = -1427835675;
        while (true) {
            i = ((((i ^ i2) * 15089) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2065516964:
                case 2058792697:
                    this.f70929 = false;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        iM55680 = C0873.m55680("᩹ۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17281)) ^ 1509916064;
                        i5 = 1637974416;
                    }
                    break;
                case -2058190958:
                case -957976363:
                    if (C1044.m56286() <= 0) {
                        iM55680 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܳ") + i2) * 5;
                        i4 = ((iM55680 ^ i3) * 923) ^ (-1384256854);
                        i5 = 90171045;
                    }
                    break;
                case -1862388167:
                case -1351016456:
                    throw new IllegalStateException();
                case -1423087417:
                case 185186264:
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ᩴ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    } else {
                        iM55680 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    }
                    break;
                case -1397366900:
                case 63020751:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("᩻۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    } else {
                        iM55680 = (C0946.m55979("۠ۤ") + i3) * 39;
                        i4 = ((iM55680 ^ i2) * (-29299)) ^ 1717933117;
                        i5 = 244004282;
                    }
                    break;
                case -1095882278:
                case 827493317:
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۜۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7911) ^ (-340346009);
                        i5 = 229846593;
                    } else {
                        iM55680 = C0873.m55680("ۗܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19313) ^ (-1067340276);
                        i5 = -477369295;
                    }
                    break;
                case -1031154976:
                case -611460900:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ۖ۠") ^ i3) * 123;
                        i4 = ((iM55680 ^ i2) * (-4353)) ^ (-1808658014);
                        i5 = 984922236;
                    } else {
                        iM55680 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    }
                    break;
                case -1004120770:
                case 1965976272:
                    C1028.m56247();
                    if (!C0927.f81875) {
                        iM55680 = C0873.m55680("᩻۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    } else {
                        iM55680 = C0946.m55979("ۢۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31685) ^ (-175618193);
                        i5 = -375499872;
                    }
                    break;
                case -737020014:
                case 1640341071:
                    C1964.m56597();
                    if (!C0892.f81851) {
                        iM55680 = C0873.m55680("᩻۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20259) ^ 1858407127;
                        i5 = -2073633939;
                    } else {
                        iM55680 = C0873.m55680("ۜۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 7911) ^ (-340346009);
                        i5 = 229846593;
                    }
                    break;
                case -449067918:
                case 1223669084:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ᩴ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    } else {
                        iM55680 = (C0946.m55979("ۜ۬") ^ i2) * 5;
                        i4 = ((iM55680 ^ i3) * (-31897)) ^ (-137092506);
                        i5 = -31690296;
                    }
                    break;
                case -369513674:
                case 1142105515:
                    if (!C0892.m55749()) {
                        iM55680 = C0873.m55680("ᩴ᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * 22951) ^ (-964761526);
                        i5 = 334785716;
                    } else {
                        int i6 = 0;
                        if (C1964.f83032 > 0) {
                            ViewOnClickListenerC0939.m55955(new RunnableC19811(i6, this, runnableC14525), 1000L);
                            return;
                        }
                        iM55680 = C0873.m55680("ܺ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    }
                    break;
                case -338910729:
                case 205451620:
                    C0892.m55749();
                    return;
                case -64778111:
                case 1859276720:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ܺ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    } else {
                        iM55680 = C0946.m55979("᩸᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-31489)) ^ (-1531255422);
                        i5 = -1952858091;
                    }
                    break;
                case 63483384:
                case 1802157352:
                    C0892.m55749();
                    iM55680 = C0873.m55680("᩻۬") ^ i3;
                    i4 = ((iM55680 ^ i2) * 20259) ^ 1858407127;
                    i5 = -2073633939;
                    break;
                case 118583685:
                case 1911634695:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ܺ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-1789)) ^ (-1736761135);
                        i5 = -2091760729;
                    } else {
                        iM55680 = (C0873.m55680("ܿ֫") + i3) * 17;
                        i4 = ((iM55680 ^ i2) * (-13203)) ^ (-2051457597);
                        i5 = 1190448952;
                    }
                    break;
                default:
                    if (this.f70929) {
                        iM55680 = (C0873.m55680("ܿۛ") ^ i2) * (-47);
                        i4 = ((iM55680 ^ i3) * (-27505)) ^ 1710118138;
                        i5 = -1695910731;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۢۡ")) * 39;
                        i4 = ((iM55680 ^ i3) * (-16667)) ^ (-226868389);
                        i5 = 92377778;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    /* JADX INFO: renamed from: ֫ */
    public static void m50447(p067l.C22494 r33, p067l.RunnableC14525 r34) {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C22494.m50447(l.᩷᩹᩷, l.۬֨᩷):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a2 A[PHI: r5 r6 r7 r13 r14 r15
      0x01a2: PHI (r5v4 l.֡ۚۢ) = (r5v2 l.֡ۚۢ), (r5v3 l.֡ۚۢ), (r5v2 l.֡ۚۢ), (r5v2 l.֡ۚۢ), (r5v2 l.֡ۚۢ), (r5v2 l.֡ۚۢ) binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r6v4 android.widget.Button) = 
      (r6v2 android.widget.Button)
      (r6v3 android.widget.Button)
      (r6v2 android.widget.Button)
      (r6v2 android.widget.Button)
      (r6v2 android.widget.Button)
      (r6v2 android.widget.Button)
     binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v4 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:45:0x01a0, B:25:0x00c0, B:21:0x0091, B:17:0x007a, B:92:0x01a2, B:91:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01db A[PHI: r2 r3 r4 r8
      0x01db: PHI (r2v5 l.᩵ۚۢ) = (r2v4 l.᩵ۚۢ), (r2v2 l.᩵ۚۢ), (r2v2 l.᩵ۚۢ), (r2v2 l.᩵ۚۢ) binds: [B:49:0x01d9, B:41:0x017e, B:37:0x0153, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:49:0x01d9, B:41:0x017e, B:37:0x0153, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v2 java.lang.Object), (r4v2 java.lang.Object), (r4v4 java.lang.Object) binds: [B:49:0x01d9, B:41:0x017e, B:37:0x0153, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v4 java.lang.String), (r8v2 java.lang.String) binds: [B:49:0x01d9, B:41:0x017e, B:37:0x0153, B:33:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static void m50448(C22494 c22494) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        short s;
        C22494 c22495 = c22494;
        int i4 = C0863.f81833;
        int i5 = RunnableC0871.f81839;
        int iM55680 = (C0873.m55680("᩵᩵") + i5) * 109;
        int i6 = ((iM55680 ^ i4) * (-17687)) ^ 1581870995;
        Button buttonM56405 = null;
        String strM56336 = null;
        short[] sArr = null;
        int i7 = iM55680 ^ (-1501210911);
        C20671 c20671 = null;
        int i8 = 0;
        int iM559711 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1435854139;
        short s2 = 0;
        DialogInterfaceC2564 dialogInterfaceC2564M56221 = null;
        Object obj = null;
        int iM55681 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * (-17383)) >> 31));
            switch (i13) {
                case -2084243387:
                case 120978367:
                    C0861.m55627(c20671, C0873.m55680(C1017.m56189(sArr, i11, i12, i10)) ^ 2126724932);
                    if (C0947.f81895) {
                        iM55979 = (i5 - C0873.m55680("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i4) * 16059) ^ (-717808709);
                        i2 = 721535902;
                    } else {
                        iM55979 = (i5 - C0946.m55979("᩸۟")) * 7;
                        i = ((iM55979 ^ i4) * 17399) ^ 1856540775;
                        i2 = 1952873378;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1984619637:
                case -1524070584:
                    if (C1194.f82045 != 0) {
                        iM559710 = (i5 - C0946.m55979("ۢ᩻")) * 43;
                        i6 = ((iM559710 ^ i4) * (-15479)) ^ (-1653571187);
                        i3 = 840169744;
                        i7 = iM559710 ^ i3;
                        c22495 = c22494;
                    } else {
                        iM55979 = C0873.m55680("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1712115542:
                case -1034380708:
                    C1024.m56209();
                    iM55979 = C0873.m55680("ۛ֡") ^ i5;
                    i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                    i2 = -588464380;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1637892884:
                case 2102890703:
                    i10 = 43350;
                    iM55979 = C0946.m55979("֨ۡ") ^ i4;
                    i = ((iM55979 ^ i5) * (-2945)) ^ 1421999372;
                    i2 = 546330958;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1495221502:
                case 1101735514:
                    C0992.m56104(c20671, c22495.f70927);
                    strM56336 = C1071.m56336(f82997, 38, 3, i10);
                    if (C0863.f81833 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i4) * 16059) ^ (-717808709);
                        i2 = 721535902;
                    } else {
                        iM55979 = C0946.m55979("᩷ۖ") ^ i5;
                        i = ((iM55979 ^ i4) * 19291) ^ (-634796654);
                        i2 = 1917282731;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1421950174:
                case -339759813:
                    iM55681 = 2126477448 ^ C0873.m55680(strM56336);
                    obj = null;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i4) * 16059) ^ (-717808709);
                        i2 = 721535902;
                    } else {
                        iM55979 = (C0873.m55680("ۧ۟") ^ i4) * 43;
                        i = ((iM55979 ^ i5) * 13679) ^ 497676802;
                        i2 = 1737261879;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1370648988:
                case -281521694:
                    C1404.m56468();
                    if (C1024.m56209() < 0) {
                        s = s2;
                        int iM55682 = (C0873.m55680("ۚܶ") + i4) * 71;
                        i7 = iM55682 ^ 723838935;
                        s2 = s;
                        i6 = ((iM55682 ^ i5) * 5613) ^ 277595554;
                        c22495 = c22494;
                    } else {
                        iM55979 = C0873.m55680("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1219686855:
                case 1190587602:
                    C1124.m56363(c20671, 2100374950 ^ iM559711, obj);
                    dialogInterfaceC2564M56221 = C1025.m56221(c20671);
                    buttonM56405 = C1229.m56405(dialogInterfaceC2564M56221);
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0873.m55680("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                    } else {
                        iM55979 = (C0946.m55979("֡ܳ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i4) * (-10487)) ^ (-662340866);
                        i2 = -1882727582;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -922703948:
                case 1359094917:
                    int i14 = (s2 * s2) + 231952900;
                    if ((i9 * i9) - (i14 + i14) > 0) {
                        iM55979 = (C0873.m55680("ۤۖ") ^ i5) * (-25);
                        i = ((iM55979 ^ i4) * (-3113)) ^ 213350181;
                        i2 = -1959858268;
                    } else {
                        iM55979 = C0946.m55979("ܶܶ") ^ i4;
                        i = ((iM55979 ^ i5) * (-1035)) ^ (-1968008535);
                        i2 = 1901259039;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -773211343:
                case 1773751518:
                    i10 = 3805;
                    iM55979 = C0946.m55979("֨ۡ") ^ i4;
                    i = ((iM55979 ^ i5) * (-2945)) ^ 1421999372;
                    i2 = 546330958;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -226308830:
                case 1210014276:
                    C0906.m55817(c20671, iM55681, obj);
                    iM559711 = C0946.m55979(C0894.m55773(f82997, 41, 3, i10));
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۗۤ") ^ i4;
                        i = ((iM55979 ^ i5) * (-28813)) ^ (-1851276838);
                        i2 = -1111286108;
                    } else {
                        iM55979 = C0873.m55680("֫᩶") ^ i4;
                        i = ((iM55979 ^ i5) * (-1511)) ^ (-965765610);
                        i2 = 1578984952;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 40868566:
                case 201940722:
                    C1003.m56123();
                    if (!C0947.f81895) {
                        iM55979 = C0873.m55680("ۗۤ") ^ i4;
                        i = ((iM55979 ^ i5) * (-28813)) ^ (-1851276838);
                        i2 = -1111286108;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                    } else {
                        iM559710 = (i5 - C0946.m55979("ۢ᩻")) * 43;
                        i6 = ((iM559710 ^ i4) * (-15479)) ^ (-1653571187);
                        i3 = 840169744;
                        i7 = iM559710 ^ i3;
                        c22495 = c22494;
                    }
                    break;
                case 718044563:
                case 947629174:
                    AbstractActivityC5549 abstractActivityC5549 = c22495.f70928;
                    int i15 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(abstractActivityC5549);
                    if (C1053.f81965 <= 0) {
                        iM55979 = (i5 - C0873.m55680("᩶ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i4) * 16059) ^ (-717808709);
                        i2 = 721535902;
                    } else {
                        iM55979 = (C0873.m55680("ܰܺ") + i5) * (-97);
                        i = ((iM55979 ^ i4) * 1737) ^ 873285772;
                        i2 = -1742038935;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 721944363:
                case 2072599308:
                    s = s2;
                    i9 = s + 15230;
                    if (RunnableC0871.f81839 < 0) {
                        int iM55683 = C0873.m55680("ۡ᩷") ^ i4;
                        i = ((iM55683 ^ i5) * 5131) ^ 1244918073;
                        i7 = iM55683 ^ 1240041522;
                        c22495 = c22494;
                        s2 = s;
                        i6 = i;
                    } else {
                        int iM55684 = (C0873.m55680("ۚܶ") + i4) * 71;
                        i7 = iM55684 ^ 723838935;
                        s2 = s;
                        i6 = ((iM55684 ^ i5) * 5613) ^ 277595554;
                        c22495 = c22494;
                    }
                    break;
                case 925958466:
                case 1855788451:
                    s2 = f82997[34];
                    if (RunnableC0897.f81856) {
                        iM559710 = (i5 - C0946.m55979("ۙ۟")) * (-43);
                        i6 = ((iM559710 ^ i4) * 3549) ^ 471223467;
                        i3 = 1499039729;
                    } else {
                        iM559710 = (i5 - C0946.m55979("ۢ᩻")) * 43;
                        i6 = ((iM559710 ^ i4) * (-15479)) ^ (-1653571187);
                        i3 = 840169744;
                    }
                    i7 = iM559710 ^ i3;
                    c22495 = c22494;
                    break;
                case 1057385614:
                case 1226171284:
                    sArr = f82997;
                    i11 = 35;
                    i12 = 3;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                    } else {
                        iM55979 = C0873.m55680("۫۫") ^ i4;
                        i = ((iM55979 ^ i5) * (-19497)) ^ (-207213064);
                        i2 = -1691392476;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case 1159174797:
                case 1881839043:
                    C0992.m56107();
                    break;
                case 1913508013:
                case 2070618469:
                    C1048.m56304(buttonM56405, new ViewOnClickListenerC3105(3, c22495));
                    i8 = R.id.message;
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ۛ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-2641)) ^ (-1326239306);
                        i2 = -588464380;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩺") ^ i4) * 61;
                        i = ((iM55979 ^ i5) * 21109) ^ (-1641796893);
                        i2 = -1652391266;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                default:
                    ((TextView) dialogInterfaceC2564M56221.m3846(i8)).setLineSpacing(0.0f, 1.3f);
                    break;
            }
            return;
        }
    }
}
