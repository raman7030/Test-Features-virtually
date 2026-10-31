package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6LY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2030 {

    /* JADX INFO: renamed from: ۧۘᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f6762 = {5471, 21095, 21110, 21093, 21092, 21106, 21055, 21049, 21049, 21049, 21054, 21086, 21113, 21107, 21106, 21103, 21047, 21112, 21089, 21106, 21093, 21105, 21115, 21112, 21088, 21047, 21119, 21110, 21092, 21047, 21119, 21110, 21095, 21095, 21106, 21113, 21106, 21107, 21049, 29187, 9089, -6914, -6968, -7040, -7012, -7011, -7033, -6966, -6956, -6956, -6956, -6956, -6962, -6962, -6962, -7024, -7023, -7040, -7019, -7011, -7016, -7033, -6956, -6914, -7033, -7039, -7018, -7033, -7040, -7034, -7011, -7014, -7021, -6948, -6950, -6950, -6950, -6947, -26412, -25315, 32331, -6949, -6962, -6962, -6962, 6389, 9595, 9597, 9578, 9595, 9596, 9594, 9569, 9574, 9583, 9504, 9510, 9510, 9510, 9505};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActivityC6242 f6763;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f6764;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16157 f6765;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6766;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f6767;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6606(String str) {
        LinearLayout linearLayout = null;
        List listM9245 = null;
        int i = 2016780789;
        int i2 = C4616.f14690;
        int i3 = C4117.f13076;
        int iM2566 = (C0630.m2566("ۚۧ") ^ i2) * (-33);
        int i4 = ((iM2566 ^ i3) * 21869) ^ 1725783240;
        int i5 = 1256430734;
        while (true) {
            i = ((((i ^ i3) * (-413)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1964039554:
                case 350759709:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("᩷֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20931)) ^ (-1150231407);
                        i5 = 1664595420;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۢ") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * (-1769)) ^ 1271368613;
                        i5 = 570154691;
                    }
                    break;
                case -1910934198:
                case -1475488902:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30269) ^ (-1267848762);
                        i5 = 704552251;
                    } else {
                        iM2566 = C2105.m6981("۬᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19585)) ^ (-1794506862);
                        i5 = -1800988253;
                    }
                    break;
                case -1904883970:
                case 1167020296:
                    C22628.m50615();
                    iM2566 = (C0630.m2566("ᩴۢ") + i3) * 25;
                    i4 = ((iM2566 ^ i2) * (-1769)) ^ 1271368613;
                    i5 = 570154691;
                    break;
                case -1839823668:
                case 230247265:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30269) ^ (-1267848762);
                        i5 = 704552251;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܳᩴ")) * 99;
                        i4 = ((iM2566 ^ i2) * (-837)) ^ 1541692071;
                        i5 = 1471832422;
                    }
                    break;
                case -1790835110:
                case -313433964:
                    if (C11233.m27802((Object) this.f6766, (Object) str)) {
                        iM2566 = C2105.m6981("᩵᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26987)) ^ (-927240700);
                        i5 = 1521920645;
                    } else {
                        iM2566 = C2105.m6981("ۛ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6437) ^ (-1927794983);
                        i5 = -987956609;
                    }
                    break;
                case -1032949237:
                case 523254529:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("ۛ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8135) ^ (-708007320);
                        i5 = 844307239;
                    } else {
                        iM2566 = C2105.m6981("۫ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7759)) ^ (-1497562472);
                        i5 = -1147656350;
                    }
                    break;
                case -933255380:
                case 731615592:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("ᩴۢ") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * (-1769)) ^ 1271368613;
                        i5 = 570154691;
                    } else {
                        iM2566 = C0630.m2566("ۧᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-5287)) ^ (-1462872008);
                        i5 = 243591452;
                    }
                    break;
                case -668195788:
                case 1579820341:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30269) ^ (-1267848762);
                        i5 = 704552251;
                    } else {
                        iM2566 = C0630.m2566("ۢ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29365)) ^ (-1796052885);
                        i5 = 2102581125;
                    }
                    break;
                case -475542972:
                case 495190033:
                    if (this.f6766 != null) {
                        iM2566 = C2105.m6981("᩻᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7423) ^ (-1376616614);
                        i5 = -893603332;
                    } else {
                        iM2566 = C0630.m2566("᩺ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25803)) ^ (-1852827864);
                        i5 = 256560446;
                    }
                    break;
                case -335273892:
                case 473489663:
                    this.f6764.clear();
                    iM2566 = C0630.m2566("᩺ۢ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-25803)) ^ (-1852827864);
                    i5 = 256560446;
                    break;
                case -325043715:
                case 1729105166:
                    if (!C2272.m7503()) {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30269) ^ (-1267848762);
                        i5 = 704552251;
                    } else {
                        iM2566 = C0630.m2566("ۛ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8135) ^ (-708007320);
                        i5 = 844307239;
                    }
                    break;
                case -110165705:
                case 1072040466:
                    linearLayout.removeAllViews();
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("᩷֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20931)) ^ (-1150231407);
                        i5 = 1664595420;
                    } else {
                        iM2566 = (C2105.m6981("ۨ᩸") ^ i2) * (-111);
                        i4 = ((iM2566 ^ i3) * 18107) ^ (-537496335);
                        i5 = 1377353803;
                    }
                    break;
                case -15100281:
                case 1724787483:
                    listM9245 = C3016.m9245(str);
                    if (C2126.m7040()) {
                        iM2566 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 32483) ^ (-1756336024);
                        i5 = 1101729600;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۫۟")) * 33;
                        i4 = ((iM2566 ^ i2) * 10629) ^ (-1411520558);
                        i5 = 1759856681;
                    }
                    break;
                case 209485443:
                case 1737644473:
                    break;
                case 664064000:
                case 1543177550:
                    C0964.m3413();
                    break;
                case 675268528:
                case 803876699:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۛ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8135) ^ (-708007320);
                        i5 = 844307239;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۗۡ")) * (-105);
                        i4 = ((iM2566 ^ i3) * 10585) ^ 472161445;
                        i5 = -1253654976;
                    }
                    break;
                case 703735894:
                case 946927013:
                    this.f6766 = str;
                    linearLayout = this.f6767;
                    if (C1916.m6308() >= 0) {
                        iM2566 = C2105.m6981("᩷֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20931)) ^ (-1150231407);
                        i5 = 1664595420;
                    } else {
                        iM2566 = (C0630.m2566("ܳۡ") ^ i3) * 93;
                        i4 = ((iM2566 ^ i2) * (-1501)) ^ 449369770;
                        i5 = -1194048649;
                    }
                    break;
                case 1191522202:
                case 1635912695:
                    m6599(linearLayout, listM9245, "", 0);
                    break;
                case 1258804317:
                case 2025428977:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C0630.m2566("ᩴۢ") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * (-1769)) ^ 1271368613;
                        i5 = 570154691;
                    } else {
                        iM2566 = C2105.m6981("ܶܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26817)) ^ 948347086;
                        i5 = -1259488074;
                    }
                    break;
                default:
                    if (!C3663.f11553) {
                        iM2566 = C2105.m6981("᩷֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20931)) ^ (-1150231407);
                        i5 = 1664595420;
                    } else {
                        iM2566 = C0630.m2566("ۛ᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8135) ^ (-708007320);
                        i5 = 844307239;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6601(C2030 c2030, String str, LinearLayout linearLayout, C17939 c17939, LinearLayout linearLayout2) {
        LinkedHashSet linkedHashSet = null;
        int i = 267300337;
        int i2 = C1773.f6144;
        int i3 = AbstractC2021.f6743;
        int iM2566 = C0630.m2566("ܰ᩵") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-17977)) ^ (-2129157418);
        int i5 = 1187319414;
        while (true) {
            i = ((((i ^ i2) * 23953) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2077274347:
                case -1588628683:
                    C1047.m3599();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ۢۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24029) ^ (-2069224145);
                        i5 = 298594690;
                    } else {
                        iM2566 = C2105.m6981("ܿ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4621) ^ (-332373307);
                        i5 = 1144830751;
                    }
                    break;
                case -1839807673:
                case 1261186466:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    } else {
                        iM2566 = C0630.m2566("ܿ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1355) ^ 350452399;
                        i5 = 687176166;
                    }
                    break;
                case -1566812558:
                case 1064406080:
                    C0382.m1848();
                    C0237.m1481();
                    break;
                case -1561628084:
                case -727689866:
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28249) ^ (-1831429070);
                        i5 = -135978847;
                    } else {
                        iM2566 = (C0630.m2566("۟ۗ") + i2) * (-81);
                        i4 = ((iM2566 ^ i3) * (-17681)) ^ (-188372614);
                        i5 = 2128764016;
                    }
                    break;
                case -1513873512:
                case 664467308:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C2105.m6981("ᩳۢ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * 9195) ^ (-316909892);
                        i5 = 1094516165;
                    } else {
                        iM2566 = (C0630.m2566("ۡܺ") + i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-17249)) ^ (-858303563);
                        i5 = 1835335643;
                    }
                    break;
                case -884095689:
                case 2120159716:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۢ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * 9195) ^ (-316909892);
                        i5 = 1094516165;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26163)) ^ 1953880036;
                        i5 = 1787483545;
                    }
                    break;
                case -852350074:
                case 1605594833:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    } else {
                        iM2566 = (C2105.m6981("ܰ֫") ^ i2) * 69;
                        i4 = ((iM2566 ^ i3) * (-21843)) ^ (-1725964579);
                        i5 = -1522031028;
                    }
                    break;
                case -750661242:
                case -647075398:
                    m6604(c2030, str, linearLayout, c17939, linearLayout2);
                    break;
                case -647743814:
                case 1144478385:
                    linkedHashSet = c2030.f6764;
                    if (linkedHashSet.add(str)) {
                        iM2566 = C0630.m2566("ۧ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28201) ^ 546129430;
                        i5 = -2048151958;
                    } else {
                        iM2566 = (C2105.m6981("ۧܶ") + i2) * (-101);
                        i4 = ((iM2566 ^ i3) * 2039) ^ 1405782280;
                        i5 = 1666170225;
                    }
                    break;
                case -306271466:
                case -1927966:
                    linkedHashSet.remove(str);
                    iM2566 = C0630.m2566("ۧ᩶") ^ i3;
                    i4 = ((iM2566 ^ i2) * 28201) ^ 546129430;
                    i5 = -2048151958;
                    break;
                case -268055110:
                case 108573862:
                    if (C7106.f21815 == 0) {
                        iM2566 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 28249) ^ (-1831429070);
                        i5 = -135978847;
                    } else {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    }
                    break;
                case 248633811:
                case 1935280763:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    } else {
                        iM2566 = (C0630.m2566("ۚ֫") ^ i3) * (-79);
                        i4 = ((iM2566 ^ i2) * (-18621)) ^ (-1638803464);
                        i5 = -458520470;
                    }
                    break;
                case 275740848:
                case 1677487158:
                    if (C1504.m5179()) {
                        iM2566 = C0630.m2566("֨ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19309) ^ (-1099521661);
                        i5 = 1160985957;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۢ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * 9195) ^ (-316909892);
                        i5 = 1094516165;
                    }
                    break;
                case 328795336:
                case 1430053620:
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۢ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * 9195) ^ (-316909892);
                        i5 = 1094516165;
                    } else {
                        iM2566 = (C2105.m6981("᩺᩷") ^ i2) * (-87);
                        i4 = ((iM2566 ^ i3) * 24239) ^ (-956419544);
                        i5 = 1845760888;
                    }
                    break;
                case 434929889:
                case 466084116:
                    AbstractC2021.m6574();
                    C7811.m20844();
                    iM2566 = C0630.m2566("ۢۖ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 24029) ^ (-2069224145);
                    i5 = 298594690;
                    break;
                case 800612713:
                case 2132663069:
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۢ") + i2) * 7;
                        i4 = ((iM2566 ^ i3) * 9195) ^ (-316909892);
                        i5 = 1094516165;
                    } else {
                        iM2566 = C0630.m2566("᩷ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12119)) ^ 737046592;
                        i5 = -196950448;
                    }
                    break;
                case 823006885:
                case 1786854571:
                    RunnableC1108.m3790();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    } else {
                        iM2566 = C0630.m2566("ۢۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24029) ^ (-2069224145);
                        i5 = 298594690;
                    }
                    break;
                default:
                    if (C0483.m2121()) {
                        iM2566 = (C0630.m2566("ܽ֡") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i2) * 25851) ^ (-1987986745);
                        i5 = -1544858314;
                    } else {
                        iM2566 = (C0630.m2566("ۗ֫") ^ i3) * 37;
                        i4 = ((iM2566 ^ i2) * 13529) ^ (-1477993016);
                        i5 = -1655073561;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ed A[PHI: r3 r8
      0x01ed: PHI (r3v4 float) = (r3v2 float), (r3v3 float), (r3v2 float), (r3v2 float), (r3v2 float) binds: [B:61:0x01eb, B:48:0x0159, B:32:0x00ce, B:28:0x00a8, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r8v6 android.text.Spanned) = 
      (r8v2 android.text.Spanned)
      (r8v2 android.text.Spanned)
      (r8v5 android.text.Spanned)
      (r8v2 android.text.Spanned)
      (r8v2 android.text.Spanned)
     binds: [B:61:0x01eb, B:48:0x0159, B:32:0x00ce, B:28:0x00a8, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x021f A[PHI: r4 r5 r6 r7
      0x021f: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:65:0x021d, B:44:0x0139, B:40:0x0115, B:36:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r5v4 float) = (r5v2 float), (r5v2 float), (r5v3 float), (r5v2 float) binds: [B:65:0x021d, B:44:0x0139, B:40:0x0115, B:36:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r6v4 float) = (r6v2 float), (r6v2 float), (r6v3 float), (r6v2 float) binds: [B:65:0x021d, B:44:0x0139, B:40:0x0115, B:36:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r7v3 l.ܺ᩶ۘ) = (r7v2 l.ܺ᩶ۘ), (r7v2 l.ܺ᩶ۘ), (r7v2 l.ܺ᩶ۘ), (r7v4 l.ܺ᩶ۘ) binds: [B:65:0x021d, B:44:0x0139, B:40:0x0115, B:36:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m6602(C23932 c23932, C2030 c2030, LinearLayout linearLayout) {
        int iM2566;
        int i;
        int i2;
        TextView textView = null;
        float f = 0.0f;
        int i3 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        AbstractC16157 abstractC16157 = null;
        Spanned spannedMo38087 = null;
        int i4 = 354806395;
        int i5 = ServiceConnectionC3453.f10921;
        int i6 = C0714.f2697;
        int iM6981 = (C2105.m6981("۠ۗ") ^ i6) * 87;
        int i7 = ((iM6981 ^ i5) * 19429) ^ 1708281661;
        int i8 = 1774991823;
        while (true) {
            int i9 = iM6981 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i5) * (-26865)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2030140077:
                    case 809565618:
                        C0964.m3413();
                        C0714.m2805();
                        break;
                    case -1945477154:
                    case 864539713:
                        if (!C0964.m3413()) {
                            iM2566 = C0630.m2566("ᩳ۬") ^ i5;
                            i = ((iM2566 ^ i6) * (-1289)) ^ (-242544743);
                            i2 = 1570121152;
                            i9 = iM2566 ^ i2;
                            i7 = i;
                        }
                        iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                        i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                        i2 = 1571557694;
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -1778425677:
                    case 1232281697:
                        textView.setLineSpacing(f2, f3);
                        abstractC16157 = c2030.f6765;
                        if (C2126.f7087) {
                            iM2566 = C2105.m6981("ۧ֫") ^ i6;
                            i = ((iM2566 ^ i5) * (-31953)) ^ (-1853489032);
                            i2 = 38116967;
                        } else {
                            iM2566 = (i5 - C2105.m6981("ۤ᩻")) * 5;
                            i = ((iM2566 ^ i6) * (-25159)) ^ 38281105;
                            i2 = -208258868;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -1755643005:
                    case 745490441:
                        if (((C17837) c23932.f77612).m1341() == null) {
                            iM2566 = (i6 - C0630.m2566("֨ۛ")) * (-63);
                            i = ((iM2566 ^ i5) * (-23937)) ^ 980288030;
                            i2 = -694151548;
                        } else {
                            iM2566 = C0630.m2566("۬ۤ") ^ i6;
                            i = ((iM2566 ^ i5) * 23923) ^ (-1306018586);
                            i2 = 285528749;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -1664017060:
                    case -1318917527:
                        C3663.m11168();
                        if (C3019.m9255() > 0) {
                            iM2566 = C0630.m2566("۠֡") ^ i6;
                            i = ((iM2566 ^ i5) * 27555) ^ 1484663686;
                            i2 = 1109878912;
                            i9 = iM2566 ^ i2;
                            i7 = i;
                        }
                        break;
                    case -1634765369:
                    case -1450926346:
                        if (C7811.f24123 >= 0) {
                            iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                            i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                            i2 = 1571557694;
                        } else {
                            iM2566 = (i6 - C2105.m6981("ۢ۬")) * (-113);
                            i = ((iM2566 ^ i5) * (-28549)) ^ (-637917035);
                            i2 = 52035028;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -1622469176:
                    case 1872529729:
                        TextView textView2 = new TextView(c2030.f6763);
                        if (C2520.f8000 >= 0) {
                            textView = textView2;
                            iM2566 = C0630.m2566("۠֡") ^ i6;
                            i = ((iM2566 ^ i5) * 27555) ^ 1484663686;
                            i2 = 1109878912;
                            i9 = iM2566 ^ i2;
                            i7 = i;
                        } else {
                            int iM2567 = (C0630.m2566("ܿۜ") + i5) * (-81);
                            i7 = ((iM2567 ^ i6) * 915) ^ (-414702423);
                            i9 = iM2567 ^ (-1343065705);
                            textView = textView2;
                        }
                        break;
                    case -1431279468:
                    case -1300600825:
                        f = 13.0f;
                        if (C2167.m7155()) {
                            iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                            i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                            i2 = 1571557694;
                        } else {
                            iM2566 = (C2105.m6981("᩹ۢ") ^ i6) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((iM2566 ^ i5) * 22179) ^ 178661386;
                            i2 = 2017486674;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -887853553:
                    case 1109847154:
                        m6597(linearLayout, textView, 10);
                        if (C5695.f17556 < 0) {
                            c23932.f77612 = new C17837();
                        }
                        iM2566 = C0630.m2566("ᩳ۬") ^ i5;
                        i = ((iM2566 ^ i6) * (-1289)) ^ (-242544743);
                        i2 = 1570121152;
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -865556388:
                    case 1303352158:
                        C3746.m11369();
                        if (C21923.f70183 == 0) {
                        }
                        iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                        i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                        i2 = 1571557694;
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -856720006:
                    case 886497097:
                        if (C3911.f12484 >= 0) {
                            iM2566 = C2105.m6981("ۧ֫") ^ i6;
                            i = ((iM2566 ^ i5) * (-31953)) ^ (-1853489032);
                            i2 = 38116967;
                        } else {
                            iM2566 = C0630.m2566("᩶ܽ") ^ i5;
                            i = ((iM2566 ^ i6) * (-30523)) ^ (-642333917);
                            i2 = 1920711472;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -819269120:
                    case 1888174070:
                        textView.setTextSize(f);
                        i3 = C21943.f70269;
                        if (C2126.f7087) {
                            iM2566 = C2105.m6981("ۧ֫") ^ i6;
                            i = ((iM2566 ^ i5) * (-31953)) ^ (-1853489032);
                            i2 = 38116967;
                        } else {
                            iM2566 = C2105.m6981("ۚ᩵") ^ i5;
                            i = ((iM2566 ^ i6) * (-22767)) ^ 456313464;
                            i2 = -1260806516;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -696018871:
                    case 1479443751:
                        C1420.m4908(textView, i3);
                        f2 = 0.0f;
                        f3 = 1.2f;
                        if (C1005.f3721) {
                            iM2566 = (i6 - C2105.m6981("᩸᩹")) * (-63);
                            i = ((iM2566 ^ i5) * 5725) ^ 2143337710;
                            i2 = -1305860995;
                        } else {
                            iM2566 = C2105.m6981("ۧ֫") ^ i6;
                            i = ((iM2566 ^ i5) * (-31953)) ^ (-1853489032);
                            i2 = 38116967;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case -209422990:
                    case 493690673:
                        abstractC16157.mo38089(textView, (SpannableStringBuilder) spannedMo38087);
                        if (RunnableC0588.f2309 >= 0) {
                            iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                            i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                            i2 = 1571557694;
                        } else {
                            iM2566 = C0630.m2566("ܶܶ") ^ i6;
                            i = ((iM2566 ^ i5) * (-21393)) ^ (-475140994);
                            i2 = -865529681;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case 192130624:
                    case 1397039729:
                        spannedMo38087 = abstractC16157.mo38087(textView, (AbstractC0197) c23932.f77612);
                        if (C0050.m940() <= 0) {
                            iM2566 = (i5 - C2105.m6981("᩻᩵")) * (-111);
                            i = ((iM2566 ^ i6) * 22111) ^ 721657076;
                            i2 = 1571557694;
                        } else {
                            iM2566 = C0630.m2566("ܺ֫") ^ i5;
                            i = ((iM2566 ^ i6) * 16619) ^ 1329700279;
                            i2 = 527656371;
                        }
                        i9 = iM2566 ^ i2;
                        i7 = i;
                        break;
                    case 474475848:
                    case 1155334665:
                        C2105.m6982();
                        C3683.m11222();
                        break;
                }
                return;
            }
            iM6981 = (C2105.m6981("ۢۡ") ^ i5) * (-7);
            i7 = ((iM6981 ^ i6) * 6871) ^ (-203312825);
            i8 = 63134596;
        }
    }

    public C2030(ActivityC6242 activityC6242, LinearLayout linearLayout) {
        boolean z = false;
        AbstractC16157 abstractC16157M46962 = null;
        int i = -1880769480;
        int i2 = C2520.f8000;
        int i3 = C1773.f6144;
        int iM2566 = (i3 - C0630.m2566("᩵᩵")) * 63;
        int i4 = ((iM2566 ^ i2) * (-23557)) ^ 126151181;
        int i5 = -322286140;
        while (true) {
            i = ((((i ^ i2) * (-393)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2141087544:
                case -1421308539:
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("۫ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22623) ^ (-804709031);
                        i5 = 2130188044;
                    } else {
                        iM2566 = C2105.m6981("ܰᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24319)) ^ 1567770276;
                        i5 = -1571774054;
                    }
                    break;
                case -2009597000:
                case -1533137772:
                    if (C4159.m12565() >= 0) {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28695)) ^ 740881291;
                        i5 = 867250816;
                    } else {
                        iM2566 = C2105.m6981("᩶ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32493)) ^ (-606854736);
                        i5 = -2021002531;
                    }
                    break;
                case -1828679698:
                case 982574697:
                    this.f6763 = activityC6242;
                    this.f6767 = linearLayout;
                    if (C4263.m12819() >= 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26485) ^ (-76831289);
                        i5 = 957887440;
                    } else {
                        iM2566 = C0630.m2566("ۜᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-31397)) ^ (-1481966469);
                        i5 = -1977376139;
                    }
                    break;
                case -1667242563:
                case -1206574834:
                    if (!C0382.f1805) {
                        iM2566 = (C0630.m2566("ܳۡ") ^ i3) * 73;
                        i4 = ((iM2566 ^ i2) * 27129) ^ (-1388503363);
                        i5 = 322255148;
                    } else {
                        iM2566 = C0630.m2566("ܿ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7083) ^ 345768670;
                        i5 = -899970007;
                    }
                    break;
                case -1488535519:
                case -1356572707:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("ۧ᩹") + i2) * (-107);
                        i4 = ((iM2566 ^ i3) * (-12035)) ^ (-1776425540);
                        i5 = 1718379846;
                    } else {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26485) ^ (-76831289);
                        i5 = 957887440;
                    }
                    break;
                case -1208372059:
                case 1195310228:
                    RunnableC0588.m2441();
                    C2126.m7040();
                    throw new RuntimeException();
                case -978272119:
                case 204341674:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("۫ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22623) ^ (-804709031);
                        i5 = 2130188044;
                    } else {
                        iM2566 = (C2105.m6981("۫۟") + i3) * (-71);
                        i4 = ((iM2566 ^ i2) * (-13509)) ^ 1368291287;
                        i5 = -1569390593;
                    }
                    break;
                case -942169992:
                case 1264655468:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26485) ^ (-76831289);
                        i5 = 957887440;
                    } else {
                        iM2566 = (C2105.m6981("᩹۬") ^ i3) * 77;
                        i4 = ((iM2566 ^ i2) * (-16495)) ^ (-464714548);
                        i5 = 651432090;
                    }
                    break;
                case -890327101:
                case 396781860:
                    RunnableC3474.m10630();
                    if (C2958.f9394 < 0) {
                        iM2566 = C2105.m6981("۫ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 22623) ^ (-804709031);
                        i5 = 2130188044;
                    } else {
                        iM2566 = (C0630.m2566("ܳۡ") ^ i3) * 73;
                        i4 = ((iM2566 ^ i2) * 27129) ^ (-1388503363);
                        i5 = 322255148;
                    }
                    break;
                case -454686114:
                case 56552161:
                    C5695.m16023();
                    C2167.m7155();
                    iM2566 = (C0630.m2566("ܳۡ") ^ i3) * 73;
                    i4 = ((iM2566 ^ i2) * 27129) ^ (-1388503363);
                    i5 = 322255148;
                    break;
                case -178519530:
                case 569810139:
                    if (!C2520.m8026()) {
                        iM2566 = C0630.m2566("ܿ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7083) ^ 345768670;
                        i5 = -899970007;
                    } else {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28695)) ^ 740881291;
                        i5 = 867250816;
                    }
                    break;
                case 422652455:
                case 1400029928:
                    abstractC16157M46962 = C20500.m46962(activityC6242, z);
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("᩵ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26485) ^ (-76831289);
                        i5 = 957887440;
                    } else {
                        iM2566 = C2105.m6981("᩺ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10615) ^ 465338950;
                        i5 = 1150617927;
                    }
                    break;
                case 697639163:
                case 803472690:
                    z = true;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ۜܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28695)) ^ 740881291;
                        i5 = 867250816;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩺ۨ")) * (-117);
                        i4 = ((iM2566 ^ i3) * 30085) ^ 1882318827;
                        i5 = 907776517;
                    }
                    break;
                case 703893642:
                case 882188488:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("ܿ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7083) ^ 345768670;
                        i5 = -899970007;
                    } else {
                        iM2566 = C0630.m2566("۫ܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 8279) ^ 1112253574;
                        i5 = -2120619105;
                    }
                    break;
                default:
                    this.f6765 = abstractC16157M46962;
                    if (C3245.m9925() == 0) {
                        this.f6764 = new LinkedHashSet();
                        return;
                    }
                    iM2566 = C2105.m6981("ۜܶ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-28695)) ^ 740881291;
                    i5 = 867250816;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m6605() {
        return this.f6764;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m6604(C2030 c2030, String str, LinearLayout linearLayout, C17939 c17939, LinearLayout linearLayout2) {
        boolean zContains = false;
        int i = 0;
        float f = 0.0f;
        int i2 = -38125265;
        int i3 = RunnableC3474.f10992;
        int i4 = C1047.f3863;
        int iM2566 = C0630.m2566("ۚᩳ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-12845)) ^ 605302930;
        int i6 = -1040197150;
        while (true) {
            i2 = ((((i2 ^ i3) * 29511) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2103567744:
                case -228547323:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۜۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31493) ^ 1992347518;
                        i6 = 1907948653;
                    } else {
                        iM2566 = C0630.m2566("ۘܰ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31027) ^ (-559336199);
                        i6 = 1206464014;
                    }
                    break;
                case -1920047467:
                case 2024435492:
                    if (C0422.m1963()) {
                        iM2566 = (i4 - C2105.m6981("۠᩷")) * (-123);
                        i5 = ((iM2566 ^ i3) * (-12099)) ^ (-57587861);
                        i6 = -902131777;
                    } else {
                        iM2566 = C2105.m6981("ܺ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14185) ^ (-2135524128);
                        i6 = -1199654560;
                    }
                    break;
                case -1813872106:
                case -1361564339:
                    C4159.m12565();
                    if (!C2167.m7155()) {
                        iM2566 = C2105.m6981("ۡۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8347)) ^ 1153397439;
                        i6 = 2086005793;
                    } else {
                        iM2566 = C0630.m2566("᩹ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14889) ^ 1723306522;
                        i6 = -479294677;
                    }
                    break;
                case -1395789570:
                case -1276783590:
                    if (C3663.m11168() >= 0) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14185) ^ (-2135524128);
                        i6 = -1199654560;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩵ۤ")) * 115;
                        i5 = ((iM2566 ^ i3) * (-19521)) ^ (-461441332);
                        i6 = 116949243;
                    }
                    break;
                case -1236361177:
                case 1283928658:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("ۘܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12557)) ^ 1005463669;
                        i6 = -818791490;
                    } else {
                        iM2566 = C2105.m6981("ܶ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 15007) ^ 2125680697;
                        i6 = -478925523;
                    }
                    break;
                case -937602859:
                case -839775323:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۜۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31493) ^ 1992347518;
                        i6 = 1907948653;
                    } else {
                        iM2566 = (C2105.m6981("ܿۢ") ^ i3) * (-63);
                        i5 = ((iM2566 ^ i4) * (-14599)) ^ 177669206;
                        i6 = -820362213;
                    }
                    break;
                case -896405441:
                case 946233554:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ۜۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31493) ^ 1992347518;
                        i6 = 1907948653;
                    } else {
                        iM2566 = (C2105.m6981("ܰ֨") ^ i3) * (-35);
                        i5 = ((iM2566 ^ i4) * 28191) ^ (-323855716);
                        i6 = 790205435;
                    }
                    break;
                case -807797190:
                case 533965017:
                    zContains = c2030.f6764.contains(str);
                    if (zContains) {
                        iM2566 = (C0630.m2566("᩷᩻") + i4) * 19;
                        i5 = ((iM2566 ^ i3) * (-31473)) ^ (-627150270);
                        i6 = -1006651237;
                    } else {
                        iM2566 = (C0630.m2566("ܰ۠") ^ i3) * 3;
                        i5 = ((iM2566 ^ i4) * (-27255)) ^ (-635102246);
                        i6 = 2113322928;
                    }
                    break;
                case -784091785:
                case 318497284:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C2105.m6981("ۡۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8347)) ^ 1153397439;
                        i6 = 2086005793;
                    } else {
                        iM2566 = C2105.m6981("ۜᩴ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 14009) ^ (-781609101);
                        i6 = -1755575812;
                    }
                    break;
                case -739789203:
                case 1852732484:
                    C3746.m11360(linearLayout, i);
                    if (zContains) {
                        iM2566 = (C2105.m6981("ᩴܳ") + i4) * 5;
                        i5 = ((iM2566 ^ i3) * 15357) ^ 1550981805;
                        i6 = 1052110622;
                    } else {
                        iM2566 = C2105.m6981("ᩴ᩵") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-31957)) ^ (-454081948);
                        i6 = 979244550;
                    }
                    break;
                case -645021677:
                case 1481164775:
                    i = 8;
                    iM2566 = (C2105.m6981("ᩳ᩹") ^ i4) * (-103);
                    i5 = ((iM2566 ^ i3) * (-10509)) ^ (-853850553);
                    i6 = 2097854643;
                    break;
                case -638568885:
                case 499121581:
                    C0964.m3413();
                    C3683.m11222();
                    iM2566 = C0630.m2566("᩹ۗ") ^ i4;
                    i5 = ((iM2566 ^ i3) * 14889) ^ 1723306522;
                    i6 = -479294677;
                    break;
                case -503563032:
                case 1138293036:
                    i = 0;
                    iM2566 = (C2105.m6981("ᩳ᩹") ^ i4) * (-103);
                    i5 = ((iM2566 ^ i3) * (-10509)) ^ (-853850553);
                    i6 = 2097854643;
                    break;
                case -304576058:
                case -155833527:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("᩹ۗ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14889) ^ 1723306522;
                        i6 = -479294677;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩹") ^ i4;
                        i5 = ((iM2566 ^ i3) * 23487) ^ (-1633182719);
                        i6 = 2082324553;
                    }
                    break;
                case -245023639:
                case 393394011:
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ܺ֨") ^ i4;
                        i5 = ((iM2566 ^ i3) * 14185) ^ (-2135524128);
                        i6 = -1199654560;
                    } else {
                        iM2566 = (C2105.m6981("ܶܿ") ^ i3) * (-95);
                        i5 = ((iM2566 ^ i4) * 2281) ^ 924032694;
                        i6 = -1245033155;
                    }
                    break;
                case -63304724:
                case 1846916412:
                    C4117.m12364();
                    break;
                case -54517116:
                case 1142743470:
                    C3537.m10746();
                    if (C2105.f7037 == 0) {
                        iM2566 = C2105.m6981("ۘܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12557)) ^ 1005463669;
                        i6 = -818791490;
                    } else {
                        iM2566 = C2105.m6981("ۡۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8347)) ^ 1153397439;
                        i6 = 2086005793;
                    }
                    break;
                case -35804074:
                case 274352554:
                    f = 90.0f;
                    iM2566 = (C0630.m2566("֫ܰ") ^ i3) * (-111);
                    i5 = ((iM2566 ^ i4) * 22003) ^ (-283587630);
                    i6 = -986842081;
                    break;
                case 113732566:
                case 1316583383:
                    c17939.setRotation(f);
                    linearLayout2.setSelected(zContains);
                    break;
                case 314117081:
                case 1538757930:
                    f = 0.0f;
                    iM2566 = (C0630.m2566("֫ܰ") ^ i3) * (-111);
                    i5 = ((iM2566 ^ i4) * 22003) ^ (-283587630);
                    i6 = -986842081;
                    break;
                case 675666613:
                case 1709813868:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ۘܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12557)) ^ 1005463669;
                        i6 = -818791490;
                    } else {
                        iM2566 = C2105.m6981("֨ۘ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 6731) ^ (-327700977);
                        i6 = 1547372078;
                    }
                    break;
                default:
                    RunnableC1108.m3790();
                    if (!C1005.f3721) {
                        iM2566 = C2105.m6981("ۡۢ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8347)) ^ 1153397439;
                        i6 = 2086005793;
                    } else {
                        iM2566 = C2105.m6981("ۜۜ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 31493) ^ 1992347518;
                        i6 = 1907948653;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 67741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m6599(android.widget.LinearLayout r69, java.util.List r70, java.lang.String r71, int r72) {
        /*
            Method dump skipped, instruction units count: 6774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2030.m6599(android.widget.LinearLayout, java.util.List, java.lang.String, int):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m6596(AbstractC0197 abstractC0197) {
        int iM2566;
        int i;
        AbstractC0197 abstractC0197M1341 = null;
        int i2 = 1967384093;
        int i3 = C0050.f910;
        int i4 = C2167.f7158;
        int iM6981 = C2105.m6981("֡ۚ") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-26309)) ^ (-1389883889);
        int i6 = -438148020;
        while (true) {
            int i7 = iM6981 ^ i6;
            ArrayList arrayList = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 499) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2055260073:
                    case 800172510:
                        if (abstractC0197M1341 != null) {
                            iM2566 = (i4 - C0630.m2566("۟۠")) * (-79);
                            i5 = ((iM2566 ^ i3) * (-7979)) ^ 1921786706;
                            i = -1925216249;
                        } else {
                            iM2566 = C0630.m2566("ܽᩴ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-10533)) ^ 1546312229;
                            i = -1573368945;
                        }
                        i7 = iM2566 ^ i;
                        break;
                    case -1734655924:
                    case 1055416026:
                        C1005.m3501();
                        if (!C0798.f2919) {
                            iM6981 = (i4 - C0630.m2566("ۨᩳ")) * 89;
                            i5 = ((iM6981 ^ i3) * 20841) ^ (-1634816109);
                            i6 = -1682249094;
                        }
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-11385)) ^ 52617961;
                        i = 928805756;
                        i7 = iM2566 ^ i;
                        break;
                    case -1596701883:
                    case 2070822270:
                        return arrayList;
                    case -1202379550:
                    case 360313497:
                        C1711.m5736();
                        if (!C1420.m4913()) {
                            iM6981 = C0630.m2566("۟᩺") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-21407)) ^ 1723015558;
                            i6 = -177973206;
                        }
                        iM2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-11385)) ^ 52617961;
                        i = 928805756;
                        i7 = iM2566 ^ i;
                        break;
                    case -1140500554:
                    case 1672549042:
                        C1916.m6307(arrayList, abstractC0197M1341);
                        abstractC0197M1341 = abstractC0197M1341.m1352();
                        iM2566 = C0630.m2566("ܳܶ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 32237) ^ (-1454793601);
                        i = 2044380031;
                        i7 = iM2566 ^ i;
                        break;
                    case -732644242:
                    case -301333153:
                        if (!C0964.m3413()) {
                            iM6981 = (i3 - C0630.m2566("۟ۤ")) * (-127);
                            i5 = ((iM6981 ^ i4) * (-17299)) ^ (-1011373498);
                            i6 = 1093813895;
                        } else {
                            iM6981 = C0630.m2566("۟᩺") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-21407)) ^ 1723015558;
                            i6 = -177973206;
                        }
                        break;
                    case 163686938:
                    case 345048522:
                        C3683.m11222();
                        return null;
                    case 1018453299:
                    case 2061777088:
                        if (C1047.f3863 < 0) {
                            if (C3911.f12484 >= 0) {
                                iM6981 = (i4 - C0630.m2566("ۨᩳ")) * 89;
                                i5 = ((iM6981 ^ i3) * 20841) ^ (-1634816109);
                                i6 = -1682249094;
                            } else if (C1294.f4556 < 0) {
                                if (C0422.m1963()) {
                                    if (C1294.f4556 < 0) {
                                        if (!C0382.m1848() && C7106.f21815 == 0 && C0237.f1507 == 0) {
                                            if (!C1005.m3501()) {
                                                iM6981 = (i3 - C0630.m2566("۟ۤ")) * (-127);
                                                i5 = ((iM6981 ^ i4) * (-17299)) ^ (-1011373498);
                                                i6 = 1093813895;
                                            } else if (C2105.f7037 == 0) {
                                                arrayList = new ArrayList();
                                                abstractC0197M1341 = abstractC0197.m1341();
                                                iM2566 = C0630.m2566("ܳܶ") ^ i3;
                                                i5 = ((iM2566 ^ i4) * 32237) ^ (-1454793601);
                                                i = 2044380031;
                                                i7 = iM2566 ^ i;
                                                break;
                                            }
                                        }
                                    }
                                }
                                iM6981 = C0630.m2566("۫ܰ") ^ i3;
                                i5 = ((iM6981 ^ i4) * 24821) ^ 684746238;
                                i6 = 1681817762;
                            }
                            break;
                        }
                        iM6981 = C0630.m2566("۟᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-21407)) ^ 1723015558;
                        i6 = -177973206;
                        break;
                    default:
                        C0964.m3413();
                        iM6981 = C0630.m2566("۟᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-21407)) ^ 1723015558;
                        i6 = -177973206;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x017b A[PHI: r1 r7
      0x017b: PHI (r1v5 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v4 int), (r1v2 int) binds: [B:55:0x0179, B:43:0x0116, B:31:0x0099, B:27:0x007f, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r7v11 android.widget.LinearLayout$LayoutParams) = 
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
      (r7v7 android.widget.LinearLayout$LayoutParams)
      (r7v4 android.widget.LinearLayout$LayoutParams)
     binds: [B:55:0x0179, B:43:0x0116, B:31:0x0099, B:27:0x007f, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6597(LinearLayout linearLayout, View view, int i) {
        int iM6981;
        int i2;
        int iM4384 = 0;
        int i3 = -530023425;
        int i4 = C0050.f910;
        int i5 = AbstractC2021.f6743;
        int iM6982 = C2105.m6981("᩶ܽ") ^ i5;
        int i6 = ((iM6982 ^ i4) * 32323) ^ 1166251145;
        int i7 = 1787867079;
        while (true) {
            int i8 = iM6982 ^ i7;
            LinearLayout.LayoutParams layoutParams = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 9759) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2053055693:
                    case -1064553635:
                        layoutParams.topMargin = iM4384;
                        C8058 c8058 = C8058.f24861;
                        C3663.m11165(linearLayout, view, layoutParams);
                        break;
                    case -2047060305:
                    case 57573632:
                        if (C3911.m11924() <= 0) {
                            iM6981 = C0630.m2566("ᩳᩳ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-29495)) ^ 585008125;
                            i2 = -1313823275;
                        } else {
                            iM6981 = C0630.m2566("۠ܿ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-22869)) ^ 912860815;
                            i2 = 1735700335;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1714190527:
                    case -236716390:
                        C3663.m11168();
                        break;
                    case -1692393431:
                    case -1680773509:
                        if (C2126.f7087) {
                            iM6981 = C2105.m6981("۫ᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 3237) ^ (-59038316);
                            i2 = 406761488;
                        } else {
                            iM6981 = (C0630.m2566("ܽᩴ") ^ i4) * 85;
                            i6 = ((iM6981 ^ i5) * (-14255)) ^ 208504389;
                            i2 = -113776090;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1492338886:
                    case 215180515:
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM6981 = (i4 - C2105.m6981("᩺ܽ")) * (-65);
                            i6 = ((iM6981 ^ i5) * (-25841)) ^ 55266736;
                            i2 = 1951645145;
                            i8 = iM6981 ^ i2;
                        } else {
                            iM6982 = (C0630.m2566("᩻۬") + i5) * 59;
                            i6 = ((iM6982 ^ i4) * (-21315)) ^ (-1817949759);
                            i7 = -49689816;
                        }
                        break;
                    case -1363775135:
                    case 1591973284:
                        if (C3911.f12484 >= 0) {
                            iM6981 = C2105.m6981("۫ᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 3237) ^ (-59038316);
                            i2 = 406761488;
                        } else {
                            iM6981 = C0630.m2566("ܿ᩷") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-1559)) ^ (-576822877);
                            i2 = -1567210621;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -1261927600:
                    case 438439146:
                        if (C1420.f5096 <= 0) {
                            iM6982 = C2105.m6981("ۛۡ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 31039) ^ (-745039816);
                            i7 = -363648379;
                        } else if (C3746.f11829 > 0) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            iM4384 = C1294.m4384(i);
                            if (C3245.f10203 <= 0) {
                                iM6981 = C2105.m6981("۫ᩳ") ^ i5;
                                i6 = ((iM6981 ^ i4) * 3237) ^ (-59038316);
                                i2 = 406761488;
                            } else {
                                iM6981 = C0630.m2566("ᩳܽ") ^ i5;
                                i6 = ((iM6981 ^ i4) * (-1099)) ^ (-1097966940);
                                i2 = -754356326;
                            }
                            i8 = iM6981 ^ i2;
                        } else {
                            iM6982 = (C0630.m2566("᩻۬") + i5) * 59;
                            i6 = ((iM6982 ^ i4) * (-21315)) ^ (-1817949759);
                            i7 = -49689816;
                        }
                        break;
                    case -1124499872:
                    case 2096675210:
                        C3911.m11924();
                        C2958.m9034();
                        iM6981 = (i4 - C0630.m2566("ܶۜ")) * 81;
                        i6 = ((iM6981 ^ i5) * 15131) ^ (-900813015);
                        i2 = 1982257460;
                        i8 = iM6981 ^ i2;
                        break;
                    case -987775257:
                    case 1010375619:
                        if (C7106.f21815 != 0) {
                            iM6981 = C2105.m6981("۫ᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 3237) ^ (-59038316);
                            i2 = 406761488;
                        } else {
                            iM6981 = (C2105.m6981("ۡ֨") ^ i4) * 95;
                            i6 = ((iM6981 ^ i5) * 26931) ^ (-1269182405);
                            i2 = -711494789;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case -539661589:
                    case 1293350654:
                        C1711.m5736();
                        if (C22628.m50615() == 0) {
                            iM6982 = C2105.m6981("ۛۡ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 31039) ^ (-745039816);
                            i7 = -363648379;
                        }
                        iM6981 = C2105.m6981("۫ᩳ") ^ i5;
                        i6 = ((iM6981 ^ i4) * 3237) ^ (-59038316);
                        i2 = 406761488;
                        i8 = iM6981 ^ i2;
                        break;
                    case -429108145:
                    case 1318375291:
                        if (C22628.f73083 <= 0) {
                            iM6982 = C2105.m6981("ۛۡ") ^ i5;
                            i6 = ((iM6982 ^ i4) * 31039) ^ (-745039816);
                            i7 = -363648379;
                        }
                        iM6981 = (i4 - C0630.m2566("ܶۜ")) * 81;
                        i6 = ((iM6981 ^ i5) * 15131) ^ (-900813015);
                        i2 = 1982257460;
                        i8 = iM6981 ^ i2;
                        break;
                    case -197380328:
                    case 1971374315:
                        if (C1005.m3501()) {
                            iM6981 = (C2105.m6981("ۤ᩺") ^ i5) * 57;
                            i6 = ((iM6981 ^ i4) * 7649) ^ 305425161;
                            i2 = -838189438;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ܶۜ")) * 81;
                            i6 = ((iM6981 ^ i5) * 15131) ^ (-900813015);
                            i2 = 1982257460;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                    case 63336129:
                    case 336751535:
                        if (C2105.f7037 == 0) {
                            iM6981 = (C0630.m2566("᩻֨") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM6981 ^ i4) * 15825) ^ (-1659474980);
                            i2 = -2025314723;
                            i8 = iM6981 ^ i2;
                        } else {
                            iM6982 = (C0630.m2566("᩻۬") + i5) * 59;
                            i6 = ((iM6982 ^ i4) * (-21315)) ^ (-1817949759);
                            i7 = -49689816;
                        }
                        break;
                    default:
                        ServiceConnectionC3453.m10564();
                        if (C0798.f2919) {
                            iM6981 = C0630.m2566("ᩳᩳ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-29495)) ^ 585008125;
                            i2 = -1313823275;
                        } else {
                            iM6981 = (i4 - C0630.m2566("ܶۜ")) * 81;
                            i6 = ((iM6981 ^ i5) * 15131) ^ (-900813015);
                            i2 = 1982257460;
                        }
                        i8 = iM6981 ^ i2;
                        break;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 98021. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m6598(android.widget.LinearLayout r79, java.lang.String r80) {
        /*
            Method dump skipped, instruction units count: 9802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2030.m6598(android.widget.LinearLayout, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014c A[PHI: r8 r15
      0x014c: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:41:0x014a, B:18:0x0079, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r15v4 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:41:0x014a, B:18:0x0079, B:15:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c3 A[PHI: r2
      0x01c3: PHI (r2v4 int) = (r2v3 int), (r2v2 int) binds: [B:52:0x01ab, B:47:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e1 A[PHI: r7
      0x01e1: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:56:0x01df, B:47:0x0184, B:29:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02e3 A[PHI: r10 r11
      0x02e3: PHI (r10v3 short) = (r10v2 short), (r10v5 short) binds: [B:80:0x02e1, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02e3: PHI (r11v3 short) = (r11v2 short), (r11v5 short) binds: [B:80:0x02e1, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0315  */
    /* JADX WARN: Code duplicated, block: B:93:0x0363 A[PHI: r13 r21
      0x0363: PHI (r13v4 short) = (r13v2 short), (r13v2 short), (r13v2 short), (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:92:0x0361, B:88:0x0345, B:76:0x02c1, B:67:0x0269, B:15:0x0073, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0363: PHI (r21v5 char) = (r21v3 char), (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:92:0x0361, B:88:0x0345, B:76:0x02c1, B:67:0x0269, B:15:0x0073, B:12:0x0068, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0395 A[PHI: r12 r16
      0x0395: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:96:0x0393, B:71:0x028b, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0395: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:96:0x0393, B:71:0x028b, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m6603(String str) {
        int iM2566;
        int i;
        int i2;
        int i3 = C3245.f10203;
        int i4 = C3746.f11829;
        int iM6981 = C2105.m6981("ۖۡ") ^ i3;
        int i5 = ((iM6981 ^ i4) * 5101) ^ (-1045993941);
        String strM10633 = null;
        String str2 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1224407360;
        int i7 = 0;
        int iM5741 = 0;
        int i8 = 0;
        int iM3007 = 0;
        int i9 = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        short s3 = 0;
        int i11 = 0;
        int i12 = -2045526740;
        char c = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-8863)) >> 31));
            switch (i12) {
                case -2129524149:
                case -1857528417:
                    sArr2 = f6762;
                    i9 = 86;
                    if (C1005.f3721) {
                        iM2566 = (i4 - C0630.m2566("᩷ܶ")) * (-33);
                        i = ((iM2566 ^ i3) * 6591) ^ 1113873590;
                        i2 = -1856132154;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܽ᩷")) * (-41);
                        i = ((iM2566 ^ i3) * (-25251)) ^ 112750096;
                        i2 = 2045239879;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1807911058:
                case -92656734:
                    C3911.m11924();
                    C1047.m3599();
                    return null;
                case -1663323563:
                case 1183679786:
                    if (i10 - (s * s3) >= 0) {
                        iM2566 = C2105.m6981("ۤۗ") ^ i3;
                        i = ((iM2566 ^ i4) * 1293) ^ 876594343;
                        i2 = 1958883170;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֡᩺")) * 59;
                        i = ((iM2566 ^ i3) * 15107) ^ 814410197;
                        i2 = -1941231095;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1614095944:
                case -1553333311:
                    iM5741 = C1711.m5741(str);
                    i8 = 0;
                    iM2566 = C2105.m6981("᩸᩸") ^ i3;
                    i = ((iM2566 ^ i4) * 5073) ^ 958541513;
                    i2 = -1288549641;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1415945981:
                case 1186416242:
                    if (C2105.m6982() == 0) {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܰ᩹")) * (-103);
                        i = ((iM2566 ^ i4) * (-18019)) ^ (-1784137853);
                        i2 = -605369133;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1361124904:
                case 24897846:
                    C0050.m940();
                    if (C4263.m12819() < 0) {
                        iM2566 = (i4 - C0630.m2566("ܽ᩷")) * (-41);
                        i = ((iM2566 ^ i3) * (-25251)) ^ 112750096;
                        i2 = 2045239879;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1296785486:
                case -24589762:
                    if (RunnableC3474.m10630()) {
                        iM2566 = C0630.m2566("ۨۡ") ^ i3;
                        i = ((iM2566 ^ i4) * (-3419)) ^ (-451042998);
                        i2 = 2111590386;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1206774220:
                case 1953877774:
                    iM3007 = C0798.m3007(str2);
                    if (iM3007 >= 3) {
                        iM2566 = (i4 - C0630.m2566("ۤܳ")) * (-63);
                        i = ((iM2566 ^ i3) * (-31685)) ^ 2001826371;
                        i2 = -328036131;
                    } else {
                        iM2566 = C2105.m6981("۬ܽ") ^ i4;
                        i = ((iM2566 ^ i3) * (-2757)) ^ (-146638141);
                        i2 = 712010273;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1199493234:
                case 1718966537:
                    if (C0798.m3000(str, i7) != '~') {
                        iM2566 = C2105.m6981("۬ܽ") ^ i4;
                        i = ((iM2566 ^ i3) * (-2757)) ^ (-146638141);
                        i2 = 712010273;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۘ") ^ i4) * (-39);
                        i = ((iM2566 ^ i3) * 21625) ^ (-1252766508);
                        i2 = -881672443;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1077111396:
                case 1068388717:
                    i11 = 63894;
                    iM2566 = C0630.m2566("ᩴۛ") ^ i3;
                    i = ((iM2566 ^ i4) * 8703) ^ (-724019865);
                    i2 = -932438653;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1028705992:
                case 1455139705:
                    i11 = 9480;
                    iM2566 = C0630.m2566("ᩴۛ") ^ i3;
                    i = ((iM2566 ^ i4) * 8703) ^ (-724019865);
                    i2 = -932438653;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1019633542:
                case -575247532:
                    String strM28015 = C11340.m28015(str, i7, i8);
                    C4159.m12575(strM28015, strM10633);
                    str2 = strM28015;
                    iM2566 = (i3 - C0630.m2566("᩻֫")) * (-29);
                    i = ((iM2566 ^ i4) * 5551) ^ (-69903175);
                    i2 = 1827361158;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1012050337:
                case -276846124:
                    if (C1711.m5733(str, i8) == C1711.m5733(str, i7)) {
                        iM2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 18021) ^ (-2052746468);
                        i2 = 506803053;
                    } else {
                        iM2566 = C0630.m2566("ۙᩳ") ^ i4;
                        i = ((iM2566 ^ i3) * 24491) ^ (-1955595117);
                        i2 = -1512045019;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -899172959:
                case 1748748533:
                    if (C1916.m6308() >= 0) {
                        iM2566 = (i3 - C0630.m2566("֡᩻")) * (-109);
                        i = ((iM2566 ^ i4) * 16649) ^ (-666481866);
                        i2 = 337487960;
                    } else {
                        iM2566 = C2105.m6981("ۜᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12121)) ^ 285421313;
                        i2 = -116875660;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -892533523:
                case 1604701027:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    } else {
                        iM2566 = C0630.m2566("᩷ۖ") ^ i4;
                        i = ((iM2566 ^ i3) * 8083) ^ 912484335;
                        i2 = -1685740890;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -613340917:
                case 1600904060:
                    c = 'U';
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    } else {
                        iM2566 = (C2105.m6981("ۜۖ") ^ i4) * (-87);
                        i = ((iM2566 ^ i3) * 6611) ^ (-1534493475);
                        i2 = -196821221;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -587568890:
                case 1787001827:
                    sArr = f6762;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("᩺᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 28995) ^ (-1146812873);
                        i2 = 1738665709;
                    } else {
                        iM2566 = C0630.m2566("ۛ֡") ^ i4;
                        i = ((iM2566 ^ i3) * (-22775)) ^ (-821167985);
                        i2 = -1739499267;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -524282971:
                case -44052100:
                    if (C0964.f3626 != 0) {
                        iM2566 = (i3 - C2105.m6981("ܰ᩹")) * (-103);
                        i = ((iM2566 ^ i4) * (-18019)) ^ (-1784137853);
                        i2 = -605369133;
                    } else {
                        iM2566 = C0630.m2566("ۙۢ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1515)) ^ 2117509408;
                        i2 = 1245858740;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -398189490:
                case -386687974:
                    int i13 = s + s2;
                    i10 = i13 * i13;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C2105.m6981("᩺᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 28995) ^ (-1146812873);
                        i2 = 1738665709;
                    } else {
                        iM2566 = C2105.m6981("ܰۡ") ^ i3;
                        i = ((iM2566 ^ i4) * (-10431)) ^ (-1344343094);
                        i2 = -580780259;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -397527920:
                case -389778499:
                    i7 = 0;
                    if (C1711.m5733(str, 0) != '`') {
                        iM2566 = C2105.m6981("ܿܳ") ^ i3;
                        i = ((iM2566 ^ i4) * 10881) ^ 591743838;
                        i2 = -1694986190;
                    } else {
                        iM2566 = (C2105.m6981("᩸ۘ") ^ i4) * (-39);
                        i = ((iM2566 ^ i3) * 21625) ^ (-1252766508);
                        i2 = -881672443;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -367624436:
                case 1479590909:
                    if (C0798.m3007(str) == 0) {
                        iM2566 = C2105.m6981("۬ܽ") ^ i4;
                        i = ((iM2566 ^ i3) * (-2757)) ^ (-146638141);
                        i2 = 712010273;
                    } else {
                        iM2566 = (C0630.m2566("ۙܽ") ^ i3) * (-21);
                        i = ((iM2566 ^ i4) * 353) ^ 708237708;
                        i2 = -993239527;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -282462078:
                case 1557132875:
                    String strM28016 = C11340.m28015(str, i7, iM3007);
                    C2126.m7031(strM28016, strM10633);
                    return strM28016;
                case -179234510:
                case -15187260:
                    s3 = 56704;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    } else {
                        iM2566 = (C2105.m6981("᩶ܶ") + i4) * (-41);
                        i = ((iM2566 ^ i3) * (-5293)) ^ 412137950;
                        i2 = -1071427847;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -92572076:
                case 324024781:
                    C7811.m20844();
                    if (C1294.f4556 < 0) {
                        iM2566 = (C2105.m6981("᩻ۛ") + i3) * (-81);
                        i = ((iM2566 ^ i4) * (-22173)) ^ (-1595434116);
                        i2 = 831456137;
                    } else {
                        iM2566 = C2105.m6981("᩺᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 28995) ^ (-1146812873);
                        i2 = 1738665709;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -62311238:
                case 656022737:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C2105.m6981("᩺ۛ") + i3) * 59;
                        i = ((iM2566 ^ i4) * 27969) ^ 1980534458;
                        i2 = 1720412541;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܽ᩷")) * (-41);
                        i = ((iM2566 ^ i3) * (-25251)) ^ 112750096;
                        i2 = 2045239879;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -21208454:
                case 2080095115:
                    RunnableC1937.m6387();
                    C0483.m2121();
                    iM2566 = (C2105.m6981("᩺ۛ") + i3) * 59;
                    i = ((iM2566 ^ i4) * 27969) ^ 1980534458;
                    i2 = 1720412541;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 195371472:
                case 1011830831:
                    i8++;
                    iM2566 = C2105.m6981("᩸᩸") ^ i3;
                    i = ((iM2566 ^ i4) * 5073) ^ 958541513;
                    i2 = -1288549641;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 792060476:
                case 1981997924:
                    strM10633 = RunnableC3474.m10633(sArr2, i9, 14, i11);
                    if (i8 < iM5741) {
                        iM2566 = C2105.m6981("ܿ᩺") ^ i4;
                        i = ((iM2566 ^ i3) * (-29941)) ^ 1273786105;
                        i2 = -1519065695;
                    } else {
                        str2 = str;
                        iM2566 = (i3 - C0630.m2566("᩻֫")) * (-29);
                        i = ((iM2566 ^ i4) * 5551) ^ (-69903175);
                        i2 = 1827361158;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1286209301:
                case 1406658018:
                    return null;
                default:
                    s = sArr[c];
                    s2 = 14176;
                    if (C4616.m13552() != 0) {
                        iM2566 = (i3 - C0630.m2566("֡᩻")) * (-109);
                        i = ((iM2566 ^ i4) * 16649) ^ (-666481866);
                        i2 = 337487960;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩻ܽ")) * (-109);
                        i = ((iM2566 ^ i3) * 23033) ^ (-1219625379);
                        i2 = -567341853;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea A[PHI: r3
      0x01ea: PHI (r3v4 l.ܺ᩶ۘ) = (r3v2 l.ܺ᩶ۘ), (r3v3 l.ܺ᩶ۘ), (r3v2 l.ܺ᩶ۘ), (r3v2 l.ܺ᩶ۘ), (r3v2 l.ܺ᩶ۘ), (r3v2 l.ܺ᩶ۘ) binds: [B:51:0x016e, B:26:0x007b, B:19:0x0059, B:17:0x0055, B:13:0x0039, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m6600(TextView textView, AbstractC0197 abstractC0197) {
        int iM6981;
        int i;
        Iterator itM9029 = null;
        C17837 c17837 = null;
        AbstractC16157 abstractC16157 = null;
        int i2 = -1616083453;
        int i3 = RunnableC3474.f10992;
        int i4 = C7811.f24123;
        int iM2566 = C0630.m2566("ۗۜ") ^ i4;
        int i5 = ((iM2566 ^ i3) * 27199) ^ 11059186;
        int i6 = -382552175;
        while (true) {
            int i7 = iM2566 ^ i6;
            C21365 c21365 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-11759)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2143892639:
                    case -997523827:
                        if (C1916.f6442) {
                            iM6981 = (C2105.m6981("ܽۛ") ^ i3) * 23;
                            i5 = ((iM6981 ^ i4) * 24795) ^ (-336268428);
                            i = -551746803;
                        } else {
                            iM6981 = C0630.m2566("᩸ۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-10839)) ^ (-698499789);
                            i = 772384659;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1934433634:
                    case 1591113718:
                        if (C1711.f5919) {
                            iM6981 = (C2105.m6981("᩸᩵") ^ i4) * (-41);
                            i5 = ((iM6981 ^ i3) * (-13313)) ^ 1084345862;
                            i = 1707683352;
                        } else {
                            iM6981 = C0630.m2566("۬ۘ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 1145) ^ (-1934020166);
                            i = 1970988710;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1767421745:
                    case -1117721970:
                        if (C2105.f7037 == 0) {
                            iM6981 = (C0630.m2566("ۢۙ") + i4) * 29;
                            i5 = ((iM6981 ^ i3) * (-10101)) ^ (-1875829480);
                            i = -255975971;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -1682813363:
                    case 439857454:
                        C4075.m12263();
                        iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                        i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                        i = 821628049;
                        i7 = iM6981 ^ i;
                        break;
                    case -1671835046:
                    case 2023557369:
                        c21365.m1343((AbstractC0197) C2272.m7513(itM9029));
                        iM6981 = (C2105.m6981("ۨۢ") + i4) * 9;
                        i5 = ((iM6981 ^ i3) * (-10907)) ^ 1645436329;
                        i = 370750485;
                        i7 = iM6981 ^ i;
                        break;
                    case -1257487586:
                    case 775370224:
                        if (C7811.f24123 < 0) {
                            iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                            i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                            i = 821628049;
                        } else {
                            iM6981 = (C2105.m6981("᩸᩵") ^ i4) * (-41);
                            i5 = ((iM6981 ^ i3) * (-13313)) ^ 1084345862;
                            i = 1707683352;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1135206255:
                    case 1516615213:
                        c17837 = new C17837();
                        c17837.m1343(c21365);
                        if (RunnableC1937.m6387() == 0) {
                            iM6981 = C0630.m2566("ۨ۟") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-30207)) ^ 2101202758;
                            i = -1647863826;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -1119458025:
                    case 1340100946:
                        if (C22628.f73083 > 0) {
                            iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                            i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                            i = 821628049;
                        } else {
                            iM6981 = (C2105.m6981("ۜۘ") + i4) * 75;
                            i5 = ((iM6981 ^ i3) * (-13421)) ^ (-1646106998);
                            i = 268250321;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1118473198:
                    case 1806831275:
                        if (C2958.m9034() <= 0) {
                            iM6981 = (C2105.m6981("᩸᩵") ^ i4) * (-41);
                            i5 = ((iM6981 ^ i3) * (-13313)) ^ 1084345862;
                            i = 1707683352;
                        } else {
                            iM6981 = C0630.m2566("᩸ۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-10839)) ^ (-698499789);
                            i = 772384659;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1019608412:
                    case -91602756:
                        if (!RunnableC1108.m3790()) {
                            iM6981 = C2105.m6981("ܺۛ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-27115)) ^ (-1067230554);
                            i = -145923197;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -795443172:
                    case 1651725724:
                        if (C2167.f7158 >= 0) {
                            iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                            i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                            i = 821628049;
                        } else {
                            iM6981 = C0630.m2566("᩸ۚ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 12997) ^ (-586046784);
                            i = -312798127;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -731852598:
                    case 320131128:
                        if (C2520.f8000 < 0) {
                            c21365 = new C21365();
                            itM9029 = C2958.m9029(m6596(abstractC0197));
                            iM6981 = (C2105.m6981("ۨۢ") + i4) * 9;
                            i5 = ((iM6981 ^ i3) * (-10907)) ^ 1645436329;
                            i = 370750485;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -656320869:
                    case -525614566:
                        if (C7106.f21815 == 0) {
                            iM6981 = (C0630.m2566("᩸ܰ") ^ i3) * (-109);
                            i5 = ((iM6981 ^ i4) * (-8637)) ^ (-1475108008);
                            i = -1611351789;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -546433279:
                    case 1466400860:
                        if (C0483.m2123(itM9029)) {
                            iM6981 = (C2105.m6981("᩹ۢ") ^ i3) * (-105);
                            i5 = ((iM6981 ^ i4) * (-20629)) ^ 1270593738;
                            i = -1349057595;
                        } else {
                            iM6981 = C2105.m6981("۠֫") ^ i4;
                            i5 = ((iM6981 ^ i3) * 18391) ^ (-788646389);
                            i = -342513247;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -213565457:
                    case -64125260:
                        abstractC16157 = this.f6765;
                        if (C2105.f7037 != 0) {
                            iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                            i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                            i = 821628049;
                        } else {
                            iM6981 = C0630.m2566("᩻۟") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-11267)) ^ 296353552;
                            i = -1934997472;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 370685893:
                    case 1029289635:
                        abstractC16157.mo38089(textView, (SpannableStringBuilder) abstractC16157.mo38087(textView, c17837));
                        break;
                    case 1681208930:
                    case 1966188509:
                        C21923.m49329();
                        break;
                    default:
                        if (C4117.f13076 <= 0) {
                            iM6981 = (C0630.m2566("ܽ۟") ^ i3) * 61;
                            i5 = ((iM6981 ^ i4) * (-3239)) ^ (-2009313237);
                            i = 821628049;
                        } else {
                            iM6981 = (i4 - C2105.m6981("ۖ۟")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM6981 ^ i3) * (-4235)) ^ 1620990515;
                            i = 1421695510;
                        }
                        i7 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM2566 = (C2105.m6981("ۢۜ") ^ i4) * (-31);
            i5 = ((iM2566 ^ i3) * 13591) ^ 855575721;
            i6 = 408872822;
        }
    }
}
