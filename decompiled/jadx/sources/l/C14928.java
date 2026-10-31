package l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܶ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14928 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۨۚ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f45507 = {7667, -16004, 13605, 8521, -8306, 5381, -9438, -10495, 3171, -13760, 15220, -10751, 6783, 13281, 16314, 3503, 6941, -27828, 30630, -26647, 2311, -6993, -7008, -6996, -7004, -6930, -6991, -6995, -6988, -7002, -7000, -6993, -6930, -7003, -7004, -6985, -6930, -6995, -7000, -6990, -6987, -6987, -6994, -6998, -7004, -6993, -6995, -7000, -6996, -7000, -6987, -6995, -7000, -6990, -6987, -6990, -7003, -6998, -6991, -6995, -6988, -7002, -7000, -6993, -7032, -7003, -7003, -7004, -6990, -7006, -6989, -7000, -6991, -6987, -7000, -6994, -6993, -6985, -7004, -6989, -6990, -7000, -6994, -6993, -7038, -6994, -7003, -7004, -6985, -7004, -6989, -6990, -7000, -6994, -6993, -7025, -7008, -6996, -7004, -7000, -7006, -6994, -6993, -6990, -6987, -7008, -6987, -7004, -6990, -6987, -7008, -6987, -7004, -7032, -6993, -7001, -6994, -6989, -7004, -6985, -7000, -7004, -6986, -7017, -7004, -6989, -6990, -7000, -6994, -6993, -6990, -7000, -6981, -7004};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45508;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f45509;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16608 f45510;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC16608 activityC16608 = null;
        TextView textView = null;
        C12346 c12346 = null;
        boolean z = false;
        int i = 1193463877;
        int i2 = C7811.f24123;
        int i3 = C3245.f10203;
        int iM6981 = C2105.m6981("᩹ۤ") ^ i2;
        int i4 = ((iM6981 ^ i3) * 21471) ^ (-824469494);
        int i5 = -1766954400;
        while (true) {
            i = ((((i ^ i3) * 13985) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1985554649:
                case 957930202:
                    C3746.m11369();
                    iM6981 = C2105.m6981("۠ۚ") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-8711)) ^ (-153230692);
                    i5 = -1415105722;
                    break;
                case -1981894444:
                case -992635803:
                    RunnableC1108.m3790();
                    C2272.m7503();
                    break;
                case -1874627168:
                case -534017659:
                    textView = activityC16608.f51011;
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("ܽ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14831)) ^ (-1962815412);
                        i5 = -561390104;
                    } else {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    }
                    break;
                case -1874306950:
                case 660444332:
                    activityC16608 = this.f45510;
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("۟᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM6981 = C0630.m2566("۠ۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 1749) ^ (-282179738);
                        i5 = -313849021;
                    }
                    break;
                case -1526984916:
                case 1387223630:
                    C1916.m6308();
                    if (C0050.m940() > 0) {
                        iM6981 = (i2 - C0630.m2566("۟ۛ")) * (-27);
                        i4 = ((iM6981 ^ i3) * (-20499)) ^ 594217358;
                        i5 = -1307265392;
                    } else {
                        iM6981 = C2105.m6981("۠ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    }
                    break;
                case -1486430850:
                case -143585732:
                    c12346 = activityC16608.f51010;
                    z = true;
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM6981 = C0630.m2566("᩷֫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 6617) ^ (-1929194118);
                        i5 = 1589931312;
                    }
                    break;
                case -1097310668:
                case 726210213:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM6981 = C2105.m6981("ۧܿ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-12579)) ^ (-1127019481);
                        i5 = 421784624;
                    }
                    break;
                case -1065909154:
                case 165679741:
                    C0483.m2121();
                    if (C4075.f12947 < 0) {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM6981 = C2105.m6981("۠ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    }
                    break;
                case -1038510586:
                case 296353822:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("᩹ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22737)) ^ 722883842;
                        i5 = 1904507545;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13103)) ^ (-1724586780);
                        i5 = 1694788885;
                    }
                    break;
                case 159297692:
                case 995780960:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i2 - C0630.m2566("۟ۛ")) * (-27);
                        i4 = ((iM6981 ^ i3) * (-20499)) ^ 594217358;
                        i5 = -1307265392;
                    } else {
                        iM6981 = C0630.m2566("ۡۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17117) ^ (-264909880);
                        i5 = -556711514;
                    }
                    break;
                case 549657138:
                case 813917768:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩹ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-22737)) ^ 722883842;
                        i5 = 1904507545;
                    } else {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    }
                    break;
                case 1111572796:
                case 1870266027:
                    C1128.m3853(textView, 8);
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("۟᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM6981 = (C0630.m2566("֫ᩴ") ^ i2) * (-111);
                        i4 = ((iM6981 ^ i3) * 23443) ^ 1222647696;
                        i5 = 798507378;
                    }
                    break;
                case 1199430591:
                case 1508032294:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩶ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM6981 = (C2105.m6981("ܿᩳ") ^ i3) * (-101);
                        i4 = ((iM6981 ^ i2) * 15423) ^ (-1665761464);
                        i5 = -2044130927;
                    }
                    break;
                case 1599611606:
                case 1864456442:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("۠ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    } else {
                        iM6981 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25991)) ^ (-1383244033);
                        i5 = 1944741937;
                    }
                    break;
                case 1801477685:
                case 2092830540:
                    c12346.m29958(z);
                    ActivityC16608.m39110(activityC16608);
                    break;
                default:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("۟᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM6981 = (C2105.m6981("ۛۡ") ^ i3) * (-115);
                        i4 = ((iM6981 ^ i2) * 15549) ^ 1066497660;
                        i5 = -1474087405;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010a A[PHI: r3 r6 r14
      0x010a: PHI (r3v4 android.widget.TextView) = (r3v3 android.widget.TextView), (r3v2 android.widget.TextView) binds: [B:37:0x0108, B:29:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:37:0x0108, B:29:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:37:0x0108, B:29:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x025d A[PHI: r8
      0x025d: PHI (r8v4 char) = (r8v3 char), (r8v2 char) binds: [B:64:0x025b, B:11:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        C14928 c14928 = this;
        int i3 = C1047.f3863;
        int i4 = RunnableC0588.f2309;
        int iM6981 = (i4 - C2105.m6981("ۛۜ")) * (-59);
        int i5 = ((iM6981 ^ i3) * 19809) ^ (-98488193);
        String strM8030 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6981 ^ 167267599;
        int iM2567 = 0;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 1363935582;
        TextView textView = null;
        TextView textView2 = null;
        ActivityC16608 activityC16608 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 13615) >> 31));
            switch (i10) {
                case -2110536086:
                case 386043518:
                    i8 = i7 + 1771561;
                    s2 = 2662;
                    if (!C2167.m7155()) {
                        iM2566 = C0630.m2566("ۤܽ") ^ i4;
                        i = ((iM2566 ^ i3) * (-11197)) ^ 1668251417;
                        i2 = 812239480;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM2568 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM2568 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM2568 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case -2098220794:
                case 1328008405:
                    C2105.m6978(textView2, 2104608675 ^ iM2567);
                    if (C4616.f14690 > 0) {
                        iM2566 = (C0630.m2566("ᩴۖ") + i4) * 75;
                        i = ((iM2566 ^ i3) * (-8215)) ^ 565488300;
                        i2 = -1951507175;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM2569 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM2569 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM2569 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case -1964577015:
                case 629541753:
                    sArr = f45507;
                    if (!C0630.m2564()) {
                        int iM25610 = (C0630.m2566("ᩳ֨") ^ i3) * (-33);
                        i = ((iM25610 ^ i4) * (-7889)) ^ (-304616979);
                        i6 = iM25610 ^ 1969149902;
                        c14928 = this;
                        sArr2 = sArr;
                        i5 = i;
                    } else {
                        int iM25611 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM25611 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM25611 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case -1902416724:
                case -1771539102:
                    textView = activityC16608.f51011;
                    if (RunnableC0588.f2309 < 0) {
                        iM2566 = C2105.m6981("֡ܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 17135) ^ (-390842908);
                        i2 = 1577744169;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM25612 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM25612 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM25612 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case -1872405764:
                case 1697616069:
                    s = sArr2[c];
                    i7 = s * s;
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("᩹۫") + i4) * (-39);
                        i = ((iM2566 ^ i3) * 4227) ^ (-1138279107);
                        i2 = 1735803601;
                    } else {
                        iM2566 = C0630.m2566("ۖܽ") ^ i3;
                        i = ((iM2566 ^ i4) * 11067) ^ 1440272847;
                        i2 = -1703260112;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1690466045:
                case 855953706:
                    strM8030 = C2520.m8030(sArr3, 17, 3, i9);
                    if (C1047.f3863 < 0) {
                        iM2566 = C2105.m6981("۬ۜ") ^ i3;
                        i = ((iM2566 ^ i4) * 12659) ^ (-1320691619);
                        i2 = -234217379;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM25613 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM25613 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM25613 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case -1615754021:
                case 2138241092:
                    iM2567 = C0630.m2566(strM8030);
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("۠ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * 15081) ^ 1675006902;
                        i2 = 1025567848;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩸") ^ i4;
                        i = ((iM2566 ^ i3) * 24599) ^ 847754235;
                        i2 = 454336631;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1449989874:
                case 423112714:
                    if (i8 - (s * s2) >= 0) {
                        iM2566 = (i4 - C0630.m2566("ۢ۠")) * (-109);
                        i = ((iM2566 ^ i3) * (-25871)) ^ (-311026081);
                        i2 = 553672078;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۖ֨")) * 29;
                        i = ((iM2566 ^ i4) * (-31171)) ^ 1762125775;
                        i2 = -1268190747;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1395306435:
                case -149043998:
                    C2167.m7155();
                    iM2566 = (C0630.m2566("᩵ۜ") + i4) * q.h;
                    i = ((iM2566 ^ i3) * (-25631)) ^ 2101830274;
                    i2 = 1329705397;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1336396535:
                case -1314497599:
                    if (!C0798.f2919) {
                        sArr = sArr2;
                        int iM25614 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM25614 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM25614 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    } else {
                        iM2566 = (C2105.m6981("᩹۫") + i4) * (-39);
                        i = ((iM2566 ^ i3) * 4227) ^ (-1138279107);
                        i2 = 1735803601;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1307113794:
                case -853460139:
                    i9 = 24625;
                    iM2566 = (i3 - C2105.m6981("ۚۘ")) * 51;
                    i = ((iM2566 ^ i4) * 28785) ^ (-1254024372);
                    i2 = 1850674345;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1237060534:
                case -533910718:
                    c = 16;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i3 - C2105.m6981("ᩳᩳ")) * (-29);
                        i = ((iM2566 ^ i4) * 24907) ^ (-1441490772);
                        i2 = -1864901908;
                    } else {
                        iM2566 = C0630.m2566("ܶۜ") ^ i4;
                        i = ((iM2566 ^ i3) * (-21467)) ^ 79980825;
                        i2 = -53180148;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -747452420:
                case 986862846:
                    C2126.m7039(textView, new ViewOnClickListenerC19163(0, c14928));
                    break;
                case -529266216:
                case 1360115053:
                    i9 = 3473;
                    iM2566 = (i3 - C2105.m6981("ۚۘ")) * 51;
                    i = ((iM2566 ^ i4) * 28785) ^ (-1254024372);
                    i2 = 1850674345;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -334769193:
                case 180786134:
                    textView2 = activityC16608.f51011;
                    sArr3 = f45507;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("۠ۨ") ^ i3;
                        i = ((iM2566 ^ i4) * 15081) ^ 1675006902;
                        i2 = 1025567848;
                    } else {
                        iM2566 = C2105.m6981("ܰ۬") ^ i3;
                        i = ((iM2566 ^ i4) * (-17335)) ^ (-1388394013);
                        i2 = 373647830;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -311706680:
                case 2042342309:
                    C2126.m7040();
                    if (C1711.f5919) {
                        iM2566 = (i3 - C2105.m6981("ᩳᩳ")) * (-29);
                        i = ((iM2566 ^ i4) * 24907) ^ (-1441490772);
                        i2 = -1864901908;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۜ") + i4) * q.h;
                        i = ((iM2566 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -165478105:
                case 1762695447:
                    C3663.m11168();
                    if (!C0798.f2919) {
                        iM2566 = (C0630.m2566("᩵ۜ") + i4) * q.h;
                        i = ((iM2566 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM25615 = C0630.m2566("᩻᩵") ^ i4;
                        i6 = iM25615 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM25615 ^ i3) * (-24697)) ^ 1355234715;
                        c14928 = this;
                    }
                    break;
                case 283416362:
                case 1585188541:
                    C1128.m3853(activityC16608.f51011, 0);
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C0630.m2566("᩵ۜ") + i4) * q.h;
                        i = ((iM2566 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                    } else {
                        iM2566 = (i4 - C0630.m2566("֡ۚ")) * 11;
                        i = ((iM2566 ^ i3) * (-11451)) ^ 898269190;
                        i2 = 1908925029;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 648361115:
                case 1559291382:
                    break;
                case 1015526698:
                case 1089628728:
                    activityC16608 = c14928.f45510;
                    if (c14928.f45508 != activityC16608.f51009) {
                        iM2566 = C2105.m6981("᩸۫") ^ i3;
                        i = ((iM2566 ^ i4) * 16961) ^ 485755288;
                        i2 = -1411511679;
                    } else {
                        iM2566 = (C2105.m6981("ۧᩴ") ^ i4) * 83;
                        i = ((iM2566 ^ i3) * (-5105)) ^ 418908150;
                        i2 = -1306913445;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1916.m6308();
                    C21923.m49329();
                    break;
            }
            return;
        }
    }

    public C14928(ActivityC16608 activityC16608, int i) {
        int i2 = -158136638;
        int i3 = C0050.f910;
        int i4 = RunnableC1937.f6483;
        this.f45510 = activityC16608;
        this.f45508 = i;
        int iM6981 = (C2105.m6981("ᩳۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM6981 ^ i3) * 693) ^ (-1366778951);
        int i6 = 1638741620;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * 18391) >> 31));
            switch (i2) {
                case -2047901401:
                case -1096237479:
                    C2167.m7155();
                    throw new RuntimeException();
                case -1832318234:
                case 1539451391:
                    C0798.m2998();
                    C2105.m6982();
                    iM6981 = C2105.m6981("ܿۛ") ^ i4;
                    i5 = ((iM6981 ^ i3) * 20775) ^ (-332731627);
                    i6 = 336378225;
                    break;
                case -1576082356:
                case -886297899:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("֨᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24797)) ^ (-1548335490);
                        i6 = -942145566;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩹") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5665) ^ (-1484264232);
                        i6 = -1844709548;
                    }
                    break;
                case -1505520566:
                case -766097878:
                    if (C21923.f70183 != 0) {
                        iM6981 = C2105.m6981("֨۟") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-25977)) ^ (-454042685);
                        i6 = 1588285232;
                    } else {
                        iM6981 = (C0630.m2566("ܶᩴ") + i3) * (-97);
                        i5 = ((iM6981 ^ i4) * 30171) ^ 1347688693;
                        i6 = -404676385;
                    }
                    break;
                case -1152635449:
                case 65589559:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("֨᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24797)) ^ (-1548335490);
                        i6 = -942145566;
                    } else {
                        iM6981 = (C0630.m2566("ۚ᩹") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i3) * (-13785)) ^ 856493327;
                        i6 = -1927632818;
                    }
                    break;
                case -18750156:
                case 997337977:
                    C11340.m28031();
                    if (!C1005.f3721) {
                        iM6981 = (C0630.m2566("ۚ᩹") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i3) * (-13785)) ^ 856493327;
                        i6 = -1927632818;
                    } else {
                        iM6981 = C2105.m6981("ܿۛ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 20775) ^ (-332731627);
                        i6 = 336378225;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        C14864 c14864;
        int iM6982;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        short[] sArr;
        short[] sArr2;
        int i9;
        int i10;
        JSONObject jSONObject;
        short[] sArr3;
        String str2;
        JSONArray jSONArray;
        int iM6983;
        int i11;
        int i12;
        short[] sArr4;
        int i13;
        JSONArray jSONArray2;
        String str3;
        short[] sArr5;
        int i14;
        int iM2567;
        int i15;
        int iM2568;
        int i16;
        int iM2569;
        int i17;
        int i18;
        int i19 = C5695.f17556;
        int i20 = RunnableC3474.f10992;
        int iM6984 = C2105.m6981("۟ۛ") ^ i19;
        int i21 = ((iM6984 ^ i20) * (-30309)) ^ 1969421686;
        JSONObject jSONObjectM35267 = null;
        String strM6573 = null;
        JSONArray jSONArray3 = null;
        ArrayList arrayList = null;
        String strM9934 = null;
        String strM11357 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i22 = iM6984 ^ (-1037985780);
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        short s2 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1217276351;
        C14864 c14865 = null;
        String strM10633 = null;
        String strM3005 = null;
        short[] sArr8 = null;
        int i30 = 0;
        int iM10558 = 0;
        C14864 c14864M41428 = null;
        C19099 c19099 = null;
        short[] sArr9 = null;
        String str4 = null;
        JSONObject jSONObject2 = null;
        int i31 = 0;
        while (true) {
            i29 = i22 ^ (i21 & (((i29 ^ i20) * 9019) >> 31));
            switch (i29) {
                case -2107425816:
                case -1264285119:
                    i23 = 58973;
                    iM6981 = (i19 - C2105.m6981("ᩴ᩷")) * (-29);
                    i3 = ((iM6981 ^ i20) * (-17727)) ^ (-803450274);
                    i4 = -1744330759;
                    i7 = iM6981 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c14865 = c14865;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -2101458809:
                case 1194722858:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14865 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (((s * s) + 385847449) - (s * s2) >= 0) {
                        iM6981 = C2105.m6981("ۙۢ") ^ i20;
                        i3 = ((iM6981 ^ i19) * (-29511)) ^ 417891848;
                        i4 = -944030024;
                    } else {
                        iM6981 = (C2105.m6981("ܳۨ") ^ i20) * 29;
                        i3 = ((iM6981 ^ i19) * 10783) ^ (-1090935304);
                        i4 = -1558021735;
                    }
                    i7 = iM6981 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c14865 = c14865;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -2018961989:
                case 594364479:
                    int i32 = i30;
                    strM11357 = strM11357;
                    str = str4;
                    i8 = i28;
                    sArr = sArr6;
                    i25 = i25;
                    sArr2 = sArr9;
                    short[] sArr10 = sArr8;
                    i9 = i24;
                    JSONArray jSONArray4 = jSONArray3;
                    sArr8 = sArr10;
                    jSONObjectM35267 = c14864M41428.m35267();
                    jSONArray3 = jSONArray4;
                    strM6573 = AbstractC2021.m6573(f45507, 51, 4, i23);
                    if (C0483.f2088 >= 0) {
                        i30 = i32;
                        int iM25610 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM25610 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM25610 ^ 40441380;
                    } else {
                        int iM25611 = (C0630.m2566("ۛۗ") + i19) * 123;
                        int i33 = ((iM25611 ^ i20) * 30665) ^ (-178192318);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM25611 ^ 1482009404;
                        i30 = i32;
                        i10 = i25;
                        str4 = str;
                        i21 = i33;
                    }
                    sArr9 = sArr2;
                    i25 = i10;
                    break;
                case -1878859285:
                case -1762632226:
                    throw new C1637(c14864M41428.m35265());
                case -1793561361:
                case 1435179637:
                    C4263.m12819();
                    C22628.m50615();
                    return;
                case -1690322241:
                case 1201982924:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14864 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    int i34 = C16275.f50041;
                    C17687 c17687M41422 = C17687.m41422(C1128.m3841(f45507, 25, 16, i23));
                    c17687M41422.m41430();
                    c14864M41428 = c17687M41422.m41428();
                    if (c14864M41428.m35269()) {
                        iM6982 = C2105.m6981("ܶ᩹") ^ i20;
                        i5 = ((iM6982 ^ i19) * 7791) ^ 1483263859;
                        i6 = -431807979;
                    } else {
                        iM6982 = (C0630.m2566("ܺۖ") ^ i19) * 115;
                        i5 = ((iM6982 ^ i20) * (-6987)) ^ (-36581191);
                        i6 = 117337519;
                    }
                    int i35 = iM6982 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i35;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    c14865 = c14864;
                    i30 = i30;
                    break;
                case -1602350524:
                case 1895920026:
                    c19099.m44012(C21923.m49332(jSONObject2, strM11357));
                    i30 = i30;
                    iM2568 = C0630.m2566("ۜۚ") ^ i20;
                    i3 = ((iM2568 ^ i19) * (-4279)) ^ (-438114847);
                    i16 = 1131310409;
                    i22 = iM2568 ^ i16;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -1582283715:
                case 970025331:
                    jSONObject = jSONObjectM35267;
                    sArr3 = sArr8;
                    str2 = strM6573;
                    jSONArray = jSONObject.getJSONArray(str2);
                    arrayList = new ArrayList(jSONArray.length());
                    i31 = 0;
                    int iM25612 = C0630.m2566("ܳܽ") ^ i20;
                    JSONObject jSONObject3 = jSONObject;
                    int i36 = ((iM25612 ^ i19) * (-22839)) ^ 1889784291;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = iM25612 ^ (-539949949);
                    jSONObjectM35267 = jSONObject3;
                    strM6573 = str2;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    i21 = i36;
                    i30 = i30;
                    short[] sArr11 = sArr3;
                    jSONArray3 = jSONArray;
                    i24 = i24;
                    sArr8 = sArr11;
                    break;
                case -1535756479:
                case 325534034:
                    C7106.m19120();
                    iM2569 = (C2105.m6981("ܽᩴ") ^ i19) * 37;
                    i17 = ((iM2569 ^ i20) * 26507) ^ (-366284555);
                    i18 = -603260817;
                    i22 = iM2569 ^ i18;
                    i21 = i17;
                    break;
                case -1504630724:
                case 834448463:
                    i23 = 58561;
                    iM6981 = (i19 - C2105.m6981("ᩴ᩷")) * (-29);
                    i3 = ((iM6981 ^ i20) * (-17727)) ^ (-803450274);
                    i4 = -1744330759;
                    i7 = iM6981 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c14865 = c14865;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -1447872661:
                case 1820946468:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m43990(C21923.m49332(jSONObject2, C4117.m12355(sArr7, i30, 11, i23)));
                    sArr9 = f45507;
                    i24 = 77;
                    if (C4263.f13799 > 0) {
                        iM2567 = (C0630.m2566("ۜܿ") ^ i19) * (-33);
                        i3 = ((iM2567 ^ i20) * (-8915)) ^ 1116334350;
                        i15 = 2109377400;
                        i7 = iM2567 ^ i15;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        c14865 = c14865;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM6573 = strM6573;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        jSONObjectM35267 = jSONObjectM35267;
                        str4 = str4;
                        i25 = i25;
                        int iM6985 = C2105.m6981("ᩳۤ") ^ i20;
                        i3 = ((iM6985 ^ i19) * 6677) ^ 777868250;
                        i7 = iM6985 ^ 849139634;
                        sArr8 = sArr8;
                        i25 = i25;
                        jSONArray3 = jSONArray3;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        sArr6 = sArr6;
                        c14865 = c14865;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    }
                    break;
                case -1286430937:
                case -128139203:
                    return;
                case -1188649723:
                case 2099231050:
                    i30 = i30;
                    strM11357 = strM11357;
                    C14864 c14866 = c14865;
                    i25 = i25;
                    i28 = i28;
                    sArr6 = sArr6;
                    sArr9 = sArr9;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    boolean zM42825 = C18393.m42825();
                    c14865 = c14866;
                    String strM4373 = C1294.m4373(f45507, 21, 4, i23);
                    if (zM42825) {
                        str4 = strM4373;
                        iM6981 = C0630.m2566("ۨۜ") ^ i19;
                        i3 = ((iM6981 ^ i20) * (-23997)) ^ 979123318;
                        i4 = 682818748;
                        i7 = iM6981 ^ i4;
                        sArr9 = sArr9;
                        i24 = i24;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        c14865 = c14865;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                    } else {
                        int iM6986 = C2105.m6981("᩹֨") ^ i20;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        i24 = i24;
                        c14865 = c14865;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = iM6986 ^ (-45820650);
                        i21 = ((iM6986 ^ i19) * (-12673)) ^ (-1444609788);
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = strM4373;
                    }
                    i30 = i30;
                    break;
                case -1122805281:
                case 579107738:
                    c19099.m43989(jSONObject2.getLong(C4616.m13542(f45507, 130, 4, i23)));
                    C1916.m6307(arrayList, c19099);
                    i31++;
                    jSONObject = jSONObjectM35267;
                    str2 = strM6573;
                    jSONArray = jSONArray3;
                    sArr3 = sArr8;
                    int iM25613 = C0630.m2566("ܳܽ") ^ i20;
                    JSONObject jSONObject4 = jSONObject;
                    int i37 = ((iM25613 ^ i19) * (-22839)) ^ 1889784291;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = iM25613 ^ (-539949949);
                    jSONObjectM35267 = jSONObject4;
                    strM6573 = str2;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    i21 = i37;
                    i30 = i30;
                    short[] sArr12 = sArr3;
                    jSONArray3 = jSONArray;
                    i24 = i24;
                    sArr8 = sArr12;
                    break;
                case -1103417532:
                case 770017975:
                    int i38 = i30;
                    String str5 = strM11357;
                    String str6 = str4;
                    int i39 = i28;
                    short[] sArr13 = sArr6;
                    int i40 = i25;
                    short[] sArr14 = sArr9;
                    short[] sArr15 = sArr8;
                    int i41 = i24;
                    JSONArray jSONArray5 = jSONArray3;
                    if (i31 < jSONArray5.length()) {
                        iM6983 = (i20 - C2105.m6981("ᩳ᩸")) * (-39);
                        i11 = ((iM6983 ^ i19) * 3905) ^ 148711975;
                        i12 = 1761610315;
                    } else {
                        iM6983 = (C2105.m6981("ۙ۬") ^ i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM6983 ^ i20) * 9823) ^ (-1733428017);
                        i12 = 615728203;
                    }
                    int i42 = iM6983 ^ i12;
                    sArr6 = sArr13;
                    i28 = i39;
                    strM11357 = str5;
                    i22 = i42;
                    i30 = i38;
                    str4 = str6;
                    i21 = i11;
                    sArr9 = sArr14;
                    i25 = i40;
                    jSONArray3 = jSONArray5;
                    i24 = i41;
                    sArr8 = sArr15;
                    break;
                case -981139425:
                case 1513721539:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14864 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (C18393.m42825()) {
                        iM6982 = (C0630.m2566("᩸ܳ") ^ i19) * 75;
                        i5 = ((iM6982 ^ i20) * 25129) ^ (-628648574);
                        i6 = -444885861;
                    } else {
                        iM6982 = (C2105.m6981("ۙۨ") ^ i20) * 79;
                        i5 = ((iM6982 ^ i19) * (-5525)) ^ 1439744409;
                        i6 = -2073137863;
                    }
                    int i310 = iM6982 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i310;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    c14865 = c14864;
                    i30 = i30;
                    break;
                case -704697578:
                case -147930804:
                    i30 = i30;
                    strM11357 = strM11357;
                    sArr5 = sArr8;
                    int i43 = i26;
                    str3 = str4;
                    i13 = i24;
                    int i44 = i25;
                    sArr4 = sArr9;
                    i14 = i44;
                    c19099.m44008(ServiceConnectionC3453.m10558(jSONObject2, C2105.m6988(sArr5, i43, i14, i23)));
                    sArr6 = f45507;
                    i27 = 58;
                    i28 = 8;
                    if (C4159.m12565() >= 0) {
                        i26 = i43;
                        jSONArray2 = jSONArray3;
                        int iM25614 = (i19 - C0630.m2566("ۖ۬")) * (-53);
                        short[] sArr16 = sArr5;
                        str4 = str3;
                        i21 = ((iM25614 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr17 = sArr4;
                        i25 = i14;
                        sArr9 = sArr17;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr16;
                        String str7 = strM11357;
                        i22 = iM25614 ^ 386168927;
                        strM11357 = str7;
                    } else {
                        int iM6987 = (C2105.m6981("۠ۚ") ^ i19) * (-3);
                        str4 = str3;
                        i21 = ((iM6987 ^ i20) * 24111) ^ (-699657345);
                        i30 = i30;
                        i25 = i14;
                        sArr9 = sArr4;
                        i22 = iM6987 ^ 490117541;
                        i24 = i13;
                        sArr8 = sArr5;
                        i26 = i43;
                        strM11357 = strM11357;
                    }
                    break;
                case -667560736:
                case -68632614:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14864 = c14865;
                    String str8 = str4;
                    i28 = i28;
                    sArr6 = sArr6;
                    jSONArray3 = jSONArray3;
                    i25 = i25;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    i24 = i24;
                    String str9 = strM6573;
                    jSONObjectM35267 = jSONObjectM35267;
                    C18393.m42824(c14864.m35268(str8));
                    str4 = str8;
                    strM6573 = str9;
                    c14864.m35264(C1128.m3841(f45507, 46, 5, i23));
                    c14865 = c14864;
                    iM6981 = C0630.m2566("ۨۜ") ^ i19;
                    i3 = ((iM6981 ^ i20) * (-23997)) ^ 979123318;
                    i4 = 682818748;
                    i7 = iM6981 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c14865 = c14865;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -370356145:
                case 628004188:
                    strM11357 = strM11357;
                    int i45 = i27;
                    i8 = i28;
                    short[] sArr18 = sArr6;
                    c19099.m44015(C22628.m50614(jSONObject2, C1773.m5917(sArr18, i45, i8, i23)));
                    String str10 = str4;
                    c19099.m44009(C21923.m49332(jSONObject2, str10));
                    short[] sArr19 = f45507;
                    if (C21923.f70183 != 0) {
                        sArr = sArr18;
                        i27 = i45;
                        str = str10;
                        sArr7 = sArr19;
                        i30 = 66;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM25615 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM25615 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM25615 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        int iM25616 = C0630.m2566("֫᩻") ^ i20;
                        i21 = ((iM25616 ^ i19) * (-12039)) ^ 1319081013;
                        str4 = str10;
                        sArr7 = sArr19;
                        sArr6 = sArr18;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM25616 ^ 224622521;
                        i27 = i45;
                        i30 = 66;
                    }
                    break;
                case -222123401:
                case 1311154431:
                    this.f45509 = arrayList;
                    return;
                case -201872877:
                case 893464147:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m43997(C21923.m49332(jSONObject2, strM10633));
                    strM9934 = C3245.m9934(f45507, 99, 4, i23);
                    if (!C3663.f11553) {
                        iM2567 = C0630.m2566("۬۠") ^ i20;
                        i3 = ((iM2567 ^ i19) * 27591) ^ 1182427699;
                        i15 = 767854109;
                        i7 = iM2567 ^ i15;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        sArr5 = sArr8;
                        str3 = str4;
                        i13 = i24;
                        jSONArray2 = jSONArray3;
                        int i46 = i25;
                        sArr4 = sArr9;
                        i14 = i46;
                        int iM25617 = (i19 - C0630.m2566("ۖ۬")) * (-53);
                        short[] sArr110 = sArr5;
                        str4 = str3;
                        i21 = ((iM25617 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr111 = sArr4;
                        i25 = i14;
                        sArr9 = sArr111;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr110;
                        String str11 = strM11357;
                        i22 = iM25617 ^ 386168927;
                        strM11357 = str11;
                    }
                    break;
                case -188226540:
                case 1584760982:
                    if (!RunnableC1108.f4040) {
                        strM11357 = strM11357;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM25618 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM25618 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM25618 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        i30 = i30;
                        strM11357 = strM11357;
                        c14864 = c14865;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM6573 = strM6573;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        i24 = i24;
                        jSONObjectM35267 = jSONObjectM35267;
                        str4 = str4;
                        i25 = i25;
                        sArr9 = sArr9;
                        iM6982 = C0630.m2566("᩹۬") ^ i19;
                        i5 = ((iM6982 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                        int i311 = iM6982 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i311;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        c14865 = c14864;
                        i30 = i30;
                    }
                    break;
                case -115885856:
                case 1504214106:
                    if (C2105.m6982() != 0) {
                        i30 = i30;
                        strM11357 = strM11357;
                        sArr5 = sArr8;
                        str3 = str4;
                        i13 = i24;
                        jSONArray2 = jSONArray3;
                        int i47 = i25;
                        sArr4 = sArr9;
                        i14 = i47;
                        int iM25619 = (i19 - C0630.m2566("ۖ۬")) * (-53);
                        short[] sArr112 = sArr5;
                        str4 = str3;
                        i21 = ((iM25619 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr113 = sArr4;
                        i25 = i14;
                        sArr9 = sArr113;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr112;
                        String str12 = strM11357;
                        i22 = iM25619 ^ 386168927;
                        strM11357 = str12;
                    } else {
                        iM2569 = (C2105.m6981("ܽᩴ") ^ i19) * 37;
                        i17 = ((iM2569 ^ i20) * 26507) ^ (-366284555);
                        i18 = -603260817;
                        i22 = iM2569 ^ i18;
                        i21 = i17;
                    }
                    break;
                case -110566251:
                case 1278121668:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m43992(jSONObject2.getBoolean(strM9934));
                    iM10558 = ServiceConnectionC3453.m10558(jSONObject2, C4616.m13542(f45507, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 5, i23));
                    if (C3019.f9544 >= 0) {
                        iM2567 = C0630.m2566("ᩴۙ") ^ i20;
                        i3 = ((iM2567 ^ i19) * (-10769)) ^ 578349426;
                        i15 = 786757357;
                    } else {
                        iM2567 = C2105.m6981("᩻ܽ") ^ i20;
                        i3 = ((iM2567 ^ i19) * 31351) ^ (-95576559);
                        i15 = 1811138628;
                    }
                    i7 = iM2567 ^ i15;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -108802822:
                case 724107093:
                    i30 = i30;
                    strM11357 = C3746.m11357(f45507, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 13, i23);
                    if (jSONObject2.has(strM11357)) {
                        iM2568 = (C0630.m2566("ܿ۬") ^ i20) * 3;
                        i3 = ((iM2568 ^ i19) * (-31393)) ^ (-1144329545);
                        i16 = -2050986972;
                    } else {
                        iM2568 = C0630.m2566("ۜۚ") ^ i20;
                        i3 = ((iM2568 ^ i19) * (-4279)) ^ (-438114847);
                        i16 = 1131310409;
                    }
                    i22 = iM2568 ^ i16;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 71918815:
                case 1640692324:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m44005(C21923.m49332(jSONObject2, strM3005));
                    iM2567 = (i19 - C2105.m6981("ۡ۫")) * 69;
                    i3 = ((iM2567 ^ i20) * (-10117)) ^ 1617474027;
                    i15 = -997679244;
                    i7 = iM2567 ^ i15;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 169490891:
                case 1539562674:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m44014(iM10558);
                    strM3005 = C0798.m3005(f45507, 108, 9, i23);
                    if (jSONObject2.has(strM3005)) {
                        iM2567 = C0630.m2566("᩶᩶") ^ i19;
                        i3 = ((iM2567 ^ i20) * (-27807)) ^ (-245385151);
                        i15 = -1929472781;
                    } else {
                        iM2567 = (i19 - C2105.m6981("ۡ۫")) * 69;
                        i3 = ((iM2567 ^ i20) * (-10117)) ^ 1617474027;
                        i15 = -997679244;
                    }
                    i7 = iM2567 ^ i15;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 278812512:
                case 369626333:
                    throw new Exception(c14865.m35265());
                case 376571572:
                case 1304682935:
                    i30 = i30;
                    strM11357 = strM11357;
                    c19099.m44011(C4075.m12255(jSONObject2, C3019.m9250(sArr9, i24, 11, i23)));
                    strM10633 = RunnableC3474.m10633(f45507, 88, 11, i23);
                    if (!C1504.f5354) {
                        iM2567 = C2105.m6981("ۗ᩶") ^ i19;
                        i3 = ((iM2567 ^ i20) * 9009) ^ (-344039627);
                        i15 = -663297925;
                        i7 = iM2567 ^ i15;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        i30 = i30;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM256110 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM256110 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM256110 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    }
                    break;
                case 629775181:
                case 898966531:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14864 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    C18393.m42822(true);
                    C18393.m42820(c14864.m35268(C7106.m19110(f45507, 41, 5, i23)));
                    if (C4117.m12364() != 0) {
                        iM6982 = C0630.m2566("᩹۬") ^ i19;
                        i5 = ((iM6982 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                    } else {
                        iM6982 = (i20 - C0630.m2566("ۢ֫")) * 27;
                        i5 = ((iM6982 ^ i19) * (-16643)) ^ 427005077;
                        i6 = -1952889940;
                    }
                    int i312 = iM6982 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i312;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    c14865 = c14864;
                    i30 = i30;
                    break;
                case 782489979:
                case 2092668483:
                    i30 = i30;
                    sArr4 = sArr9;
                    i13 = i24;
                    strM11357 = strM11357;
                    jSONArray2 = jSONArray3;
                    str3 = str4;
                    int i48 = i27;
                    int i49 = i28;
                    short[] sArr20 = sArr6;
                    jSONObject2 = jSONArray2.getJSONObject(i31);
                    c19099 = new C19099();
                    c19099.m44003(C18393.m42823());
                    short[] sArr21 = f45507;
                    i26 = 55;
                    if (!C3663.f11553) {
                        int iM25620 = C0630.m2566("ۘܰ") ^ i20;
                        i27 = i48;
                        i3 = ((iM25620 ^ i19) * 6527) ^ 1589773828;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr6 = sArr20;
                        sArr8 = sArr21;
                        i28 = i49;
                        sArr9 = sArr4;
                        strM11357 = strM11357;
                        i25 = 3;
                        i22 = iM25620 ^ (-1765484615);
                        str4 = str3;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        i27 = i48;
                        sArr5 = sArr21;
                        sArr6 = sArr20;
                        i14 = 3;
                        i28 = i49;
                        int iM256111 = (i19 - C0630.m2566("ۖ۬")) * (-53);
                        short[] sArr114 = sArr5;
                        str4 = str3;
                        i21 = ((iM256111 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr115 = sArr4;
                        i25 = i14;
                        sArr9 = sArr115;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr114;
                        String str13 = strM11357;
                        i22 = iM256111 ^ 386168927;
                        strM11357 = str13;
                    }
                    break;
                case 789996423:
                case 800096755:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14865 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    s = f45507[20];
                    s2 = 39286;
                    if (C7811.f24123 < 0) {
                        iM6981 = (C2105.m6981("ۘᩴ") ^ i19) * (-55);
                        i3 = ((iM6981 ^ i20) * 13577) ^ 159992467;
                        i4 = -1950557468;
                        i7 = iM6981 ^ i4;
                        sArr9 = sArr9;
                        i24 = i24;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        c14865 = c14865;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        sArr9 = sArr9;
                        i24 = i24;
                        int iM6988 = C2105.m6981("ᩳۤ") ^ i20;
                        i3 = ((iM6988 ^ i19) * 6677) ^ 777868250;
                        i7 = iM6988 ^ 849139634;
                        sArr8 = sArr8;
                        i25 = i25;
                        jSONArray3 = jSONArray3;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        sArr6 = sArr6;
                        c14865 = c14865;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    }
                    break;
                case 1077415079:
                case 1863796262:
                    if (C1128.f4106 <= 0) {
                        i30 = i30;
                        strM11357 = strM11357;
                        iM2567 = C0630.m2566("ᩴۙ") ^ i20;
                        i3 = ((iM2567 ^ i19) * (-10769)) ^ 578349426;
                        i15 = 786757357;
                        i7 = iM2567 ^ i15;
                        strM11357 = strM11357;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        strM11357 = strM11357;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM256112 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM256112 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM256112 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    }
                    break;
                case 1292531603:
                case 1400185038:
                    if (C4117.f13076 <= 0) {
                        iM2569 = C0630.m2566("ۘᩳ") ^ i20;
                        i17 = ((iM2569 ^ i19) * 23199) ^ (-1865746555);
                        i18 = -1728209962;
                        i22 = iM2569 ^ i18;
                        i21 = i17;
                    } else {
                        i30 = i30;
                        strM11357 = strM11357;
                        c14864 = c14865;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM6573 = strM6573;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        i24 = i24;
                        jSONObjectM35267 = jSONObjectM35267;
                        str4 = str4;
                        i25 = i25;
                        sArr9 = sArr9;
                        iM6982 = C0630.m2566("᩹۬") ^ i19;
                        i5 = ((iM6982 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                        int i313 = iM6982 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i313;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        c14865 = c14864;
                        i30 = i30;
                    }
                    break;
                case 1326252453:
                case 2023573542:
                    C3683.m11222();
                    if (C3245.m9925() == 0) {
                        strM11357 = strM11357;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM256113 = C0630.m2566("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM256113 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM11357 = strM11357;
                        i22 = iM256113 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        iM2569 = C0630.m2566("֨ۤ") ^ i19;
                        i17 = ((iM2569 ^ i20) * (-14707)) ^ (-667826659);
                        i18 = 1229037866;
                        i22 = iM2569 ^ i18;
                        i21 = i17;
                    }
                    break;
                case 1355448664:
                case 1669390714:
                    C0050.m940();
                    if (C0050.f910 >= 0) {
                        iM2569 = (C2105.m6981("ܽᩴ") ^ i19) * 37;
                        i17 = ((iM2569 ^ i20) * 26507) ^ (-366284555);
                        i18 = -603260817;
                    } else {
                        iM2569 = C0630.m2566("֨ۤ") ^ i19;
                        i17 = ((iM2569 ^ i20) * (-14707)) ^ (-667826659);
                        i18 = 1229037866;
                    }
                    i22 = iM2569 ^ i18;
                    i21 = i17;
                    break;
                case 1402348340:
                case 1653101031:
                    i30 = i30;
                    strM11357 = strM11357;
                    c14864 = c14865;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM6573 = strM6573;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM35267 = jSONObjectM35267;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (c14864.m35261() != 1000) {
                        iM6982 = C0630.m2566("᩹ۢ") ^ i19;
                        i5 = ((iM6982 ^ i20) * (-22231)) ^ (-765912874);
                        i6 = -79948029;
                        int i314 = iM6982 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM11357 = strM11357;
                        i22 = i314;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM35267 = jSONObjectM35267;
                        strM6573 = strM6573;
                        c14865 = c14864;
                        i30 = i30;
                    }
                    c14865 = c14864;
                    iM6981 = C0630.m2566("ۨۜ") ^ i19;
                    i3 = ((iM6981 ^ i20) * (-23997)) ^ 979123318;
                    i4 = 682818748;
                    i7 = iM6981 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM35267 = jSONObjectM35267;
                    strM6573 = strM6573;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c14865 = c14865;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM11357 = strM11357;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                default:
                    int i50 = i30;
                    String str14 = strM11357;
                    String str15 = strM6573;
                    int i51 = i28;
                    short[] sArr22 = sArr6;
                    JSONObject jSONObject5 = jSONObjectM35267;
                    JSONArray jSONArray6 = jSONArray3;
                    short[] sArr23 = sArr8;
                    String str16 = str4;
                    int i52 = i24;
                    int i53 = i25;
                    short[] sArr24 = sArr9;
                    C14864 c14864M38295 = C16275.m38295();
                    if (c14864M38295.m35269()) {
                        iM2566 = C0630.m2566("ܶۙ") ^ i19;
                        i = ((iM2566 ^ i20) * 8389) ^ 395424755;
                        i2 = -927048327;
                    } else {
                        iM2566 = (C0630.m2566("ܳ۠") ^ i20) * (-93);
                        i = ((iM2566 ^ i19) * 22843) ^ 340023806;
                        i2 = 1048053204;
                    }
                    int i54 = iM2566 ^ i2;
                    i24 = i52;
                    sArr8 = sArr23;
                    jSONArray3 = jSONArray6;
                    sArr6 = sArr22;
                    i28 = i51;
                    strM11357 = str14;
                    i22 = i54;
                    i30 = i50;
                    c14865 = c14864M38295;
                    i21 = i;
                    sArr9 = sArr24;
                    i25 = i53;
                    str4 = str16;
                    jSONObjectM35267 = jSONObject5;
                    strM6573 = str15;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0171 A[PHI: r4 r7 r9 r11 r14
      0x0171: PHI (r4v4 short[]) = (r4v3 short[]), (r4v2 short[]) binds: [B:39:0x016f, B:31:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r7v4 android.content.DialogInterface$OnClickListener) = (r7v3 android.content.DialogInterface$OnClickListener), (r7v2 android.content.DialogInterface$OnClickListener) binds: [B:39:0x016f, B:31:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r9v3 android.content.DialogInterface$OnClickListener) = (r9v2 android.content.DialogInterface$OnClickListener), (r9v4 android.content.DialogInterface$OnClickListener) binds: [B:39:0x016f, B:31:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:39:0x016f, B:31:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:39:0x016f, B:31:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM6981;
        int i;
        String strM1955;
        TextView textView;
        int iM6982;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM6983;
        int i7;
        int i8;
        int i9;
        int iM6984;
        int i10;
        int i11;
        short[] sArr;
        int iM2566;
        int i12;
        int i13;
        int iM2567;
        int i14;
        this = this;
        int i15 = C0483.f2088;
        int i16 = C4616.f14690;
        int iM2568 = C0630.m2566("ۢ֨") ^ i15;
        int i17 = ((iM2568 ^ i16) * (-10343)) ^ 1235784193;
        C19258 c19258 = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterface.OnClickListener onClickListener2 = null;
        String str = null;
        String strM3789 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i18 = iM2568 ^ 957456086;
        ActivityC16608 activityC16608 = null;
        int iM6985 = 0;
        int iM2569 = 0;
        int iM25610 = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1566216161;
        TextView textView2 = null;
        int i24 = 0;
        while (true) {
            i23 = i18 ^ (i17 & (((i23 ^ i16) * 30137) >> 31));
            switch (i23) {
                case -2006379592:
                case -433951300:
                    iM2569 = 2127295042 ^ C0630.m2566(C5695.m16034(sArr4, 10, 3, i19));
                    if (!C2167.m7155()) {
                        iM2567 = C0630.m2566("ۧۤ") ^ i15;
                        i12 = ((iM2567 ^ i16) * (-29895)) ^ (-949338054);
                        i14 = -1183769850;
                        i18 = iM2567 ^ i14;
                        i17 = i12;
                    }
                    i11 = i24;
                    sArr = sArr2;
                    iM2566 = C2105.m6981("᩹۟") ^ i16;
                    i12 = ((iM2566 ^ i15) * (-4657)) ^ 604634992;
                    i13 = 154134721;
                    int i25 = iM2566 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i25;
                    i17 = i12;
                    break;
                case -1994823673:
                case -606458706:
                    C3432.m10490(c19258, C2105.m6981(strM3789) ^ 2101917832);
                    sArr3 = f45507;
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2567 = C0630.m2566("۠᩷") ^ i16;
                        i12 = ((iM2567 ^ i15) * 29329) ^ (-5581843);
                        i14 = -1277280348;
                        i18 = iM2567 ^ i14;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM1955 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM6986 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM6986 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM6986 ^ (-986072977);
                        this = this;
                    }
                    break;
                case -1888791711:
                case -1495575940:
                    i6 = i24;
                    int i26 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(activityC16608);
                    sArr2 = f45507;
                    if (C0483.f2088 >= 0) {
                        iM6984 = C0630.m2566("֫֨") ^ i16;
                        i7 = ((iM6984 ^ i15) * (-27427)) ^ 206883318;
                        i10 = 1893453619;
                    } else {
                        iM6984 = C2105.m6981("۬۠") ^ i16;
                        i7 = ((iM6984 ^ i15) * (-3901)) ^ 1123147196;
                        i10 = -1330516238;
                    }
                    i9 = iM6984 ^ i10;
                    i5 = i6;
                    i18 = i9;
                    i17 = i7;
                    i24 = i5;
                    break;
                case -1816437610:
                case -1668924778:
                    i6 = i24;
                    short[] sArr6 = sArr2;
                    TextView textView3 = textView2;
                    C0630.m2570(textView3, C2105.m6981(str) ^ 2129535267);
                    if (C18393.m42825()) {
                        iM6983 = (C2105.m6981("ۘۤ") + i16) * (-83);
                        i7 = ((iM6983 ^ i15) * (-12617)) ^ (-1893349165);
                        i8 = -438290032;
                    } else {
                        iM6983 = C2105.m6981("ۘۖ") ^ i15;
                        i7 = ((iM6983 ^ i16) * (-15827)) ^ (-764694620);
                        i8 = 1346953116;
                    }
                    i9 = iM6983 ^ i8;
                    sArr2 = sArr6;
                    textView2 = textView3;
                    i5 = i6;
                    i18 = i9;
                    i17 = i7;
                    i24 = i5;
                    break;
                case -1802437208:
                case -1051371021:
                    i19 = 57779;
                    iM6981 = (C0630.m2566("ܽۘ") ^ i15) * (-97);
                    i17 = ((iM6981 ^ i16) * 12061) ^ 175522351;
                    i = -1188939259;
                    i4 = iM6981 ^ i;
                    sArr2 = sArr2;
                    i24 = i24;
                    i18 = i4;
                    textView2 = textView2;
                    this = this;
                    break;
                case -1792017588:
                case -1761546506:
                    ActivityC16608.m39108(activityC16608, i24, new RunnableC0111(this));
                    break;
                case -1788539149:
                case 1469723530:
                    iM6985 = 2100015503 ^ C2105.m6981(C3746.m11357(sArr3, 7, 3, i19));
                    if (C2520.f8000 >= 0) {
                        iM2567 = C2105.m6981("֨᩻") ^ i15;
                        i12 = ((iM2567 ^ i16) * 15425) ^ (-437656679);
                        i14 = -320934575;
                    } else {
                        iM2567 = (i15 - C0630.m2566("۟۠")) * (-23);
                        i12 = ((iM2567 ^ i16) * (-1981)) ^ 1663778978;
                        i14 = -1476092877;
                    }
                    i18 = iM2567 ^ i14;
                    i17 = i12;
                    break;
                case -1777668794:
                case 1297541791:
                    i11 = i24;
                    sArr = sArr2;
                    strM3789 = RunnableC1108.m3789(sArr, 4, 3, i19);
                    if (C0237.f1507 != 0) {
                        iM2566 = C2105.m6981("᩹۟") ^ i16;
                        i12 = ((iM2566 ^ i15) * (-4657)) ^ 604634992;
                        i13 = 154134721;
                    } else {
                        iM2566 = C0630.m2566("᩻᩶") ^ i15;
                        i12 = ((iM2566 ^ i16) * (-25719)) ^ 1281203441;
                        i13 = 83506678;
                    }
                    int i27 = iM2566 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i27;
                    i17 = i12;
                    break;
                case -1135175374:
                case -586081264:
                    C5695.m16035(c19258, iM25610, onClickListener2);
                    c19258.m44419(new DialogInterface.OnCancelListener() { // from class: l.۠֫᩷
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C14928 c14928 = null;
                            int i28 = -954854775;
                            int i29 = C3746.f11829;
                            int i30 = RunnableC1937.f6483;
                            int iM6987 = (C2105.m6981("ᩴۘ") ^ i30) * 85;
                            int i31 = ((iM6987 ^ i29) * (-4337)) ^ (-752898226);
                            int i32 = 350771844;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-30975)) >> 31) & i31) ^ (iM6987 ^ i32);
                                switch (i28) {
                                    case -2089669565:
                                    case -2001006239:
                                        C2272.m7505(c14928.f45510);
                                        break;
                                    case -1668988456:
                                    case 1238281516:
                                        c14928 = this.f24414;
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM6987 = (C2105.m6981("᩷᩺") + i29) * 127;
                                            i31 = ((iM6987 ^ i30) * 19963) ^ (-694867112);
                                            i32 = 636397604;
                                        } else {
                                            iM6987 = (C0630.m2566("۟ۖ") ^ i29) * (-23);
                                            i31 = ((iM6987 ^ i30) * (-13885)) ^ (-1165406246);
                                            i32 = 1254676451;
                                        }
                                        break;
                                    case -1628207510:
                                    case -1473289456:
                                        if (C3746.f11829 > 0) {
                                            iM6987 = C0630.m2566("ܳ۫") ^ i29;
                                            i31 = ((iM6987 ^ i30) * (-21495)) ^ 1299000164;
                                            i32 = 1591316051;
                                        } else {
                                            iM6987 = C2105.m6981("ۨ֡") ^ i29;
                                            i31 = ((iM6987 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        }
                                        break;
                                    case -1596511700:
                                    case 1521172189:
                                        C3746.m11369();
                                        break;
                                    case -1481472206:
                                    case -67165412:
                                        if (C0798.f2919) {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM6987 = C0630.m2566("֡֫") ^ i30;
                                            i31 = ((iM6987 ^ i29) * (-20977)) ^ 161688735;
                                            i32 = 224799448;
                                        }
                                        break;
                                    case -1445878394:
                                    case 2116788736:
                                        if (C3019.f9544 >= 0) {
                                            iM6987 = (C2105.m6981("᩷᩺") + i29) * 127;
                                            i31 = ((iM6987 ^ i30) * 19963) ^ (-694867112);
                                            i32 = 636397604;
                                        } else {
                                            iM6987 = C2105.m6981("ܳ᩷") ^ i29;
                                            i31 = ((iM6987 ^ i30) * 1799) ^ 1936020265;
                                            i32 = 1716106077;
                                        }
                                        break;
                                    case -1202420425:
                                    case 1756354867:
                                        if (C0382.f1805) {
                                            iM6987 = (i30 - C2105.m6981("۫ۛ")) * (-45);
                                            i31 = ((iM6987 ^ i29) * 10033) ^ 128564085;
                                            i32 = -1595437134;
                                        } else {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        }
                                        break;
                                    case -1147886746:
                                    case 1196627259:
                                        if (C1128.m3851() <= 0) {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM6987 = (i29 - C2105.m6981("ܳۛ")) * 73;
                                            i31 = ((iM6987 ^ i30) * (-31595)) ^ 1429569887;
                                            i32 = -337595342;
                                        }
                                        break;
                                    case -925000555:
                                    case 1829588627:
                                        if (ServiceConnectionC3453.m10564() <= 0) {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM6987 = C0630.m2566("֨ۡ") ^ i30;
                                            i31 = ((iM6987 ^ i29) * 28601) ^ (-767436550);
                                            i32 = -1794276878;
                                        }
                                        break;
                                    case -153190587:
                                    case 939532462:
                                        C0050.m940();
                                        if (!C3683.m11222()) {
                                            iM6987 = C2105.m6981("ۨ֡") ^ i29;
                                            i31 = ((iM6987 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        } else {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        }
                                        break;
                                    case 9437724:
                                    case 677945560:
                                        if (C1916.f6442) {
                                            iM6987 = C2105.m6981("ܶۛ") ^ i29;
                                            i31 = ((iM6987 ^ i30) * (-21053)) ^ 620584502;
                                            i32 = 130753755;
                                        } else {
                                            iM6987 = C0630.m2566("֡۫") ^ i30;
                                            i31 = ((iM6987 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        }
                                        break;
                                    case 268719074:
                                    case 578937884:
                                        if (!C0483.m2121()) {
                                            iM6987 = C2105.m6981("ۨ֡") ^ i29;
                                            i31 = ((iM6987 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        } else {
                                            iM6987 = C0630.m2566("֡۫") ^ i30;
                                            i31 = ((iM6987 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        }
                                        break;
                                    case 457548307:
                                    case 1628605019:
                                        if (C2272.f7362) {
                                            iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM6987 = (C0630.m2566("ܶۢ") ^ i30) * (-83);
                                            i31 = ((iM6987 ^ i29) * 32347) ^ (-1628217708);
                                            i32 = -200836235;
                                        }
                                        break;
                                    case 836590268:
                                    case 2024919571:
                                        C0382.m1848();
                                        iM6987 = (C0630.m2566("ۧܿ") + i30) * (-83);
                                        i31 = ((iM6987 ^ i29) * 7155) ^ 188813404;
                                        i32 = -394407193;
                                        break;
                                    case 1613113089:
                                    case 2068060130:
                                        if (C2958.f9394 >= 0) {
                                            iM6987 = C0630.m2566("֡۫") ^ i30;
                                            i31 = ((iM6987 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        } else {
                                            iM6987 = C0630.m2566("ܶܶ") ^ i29;
                                            i31 = ((iM6987 ^ i30) * 24611) ^ 313771787;
                                            i32 = 198500534;
                                        }
                                        break;
                                    default:
                                        if (C3537.f11231 >= 0) {
                                            iM6987 = C0630.m2566("ܳ۫") ^ i29;
                                            i31 = ((iM6987 ^ i30) * (-21495)) ^ 1299000164;
                                            i32 = 1591316051;
                                        } else {
                                            iM6987 = C2105.m6981("֨᩸") ^ i30;
                                            i31 = ((iM6987 ^ i29) * (-4741)) ^ (-1544229789);
                                            i32 = 942846844;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    RunnableC0588.m2438(c19258);
                    break;
                case -935075979:
                case 1541642945:
                    C1916.m6295(c19258, iM6985);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۚ֫᩷

                        /* JADX INFO: renamed from: ܺᩴ֨, reason: not valid java name and contains not printable characters */
                        private static final short[] f15882 = {5811, 14212, -7974, 13958, -1529, 2867, 13680};

                        /* JADX WARN: Code duplicated, block: B:28:0x00c2 A[PHI: r3
                          0x00c2: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:90:0x00c2, B:27:0x00c0, B:23:0x009c, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:42:0x0170 A[PHI: r10 r11 r12
                          0x0170: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]) binds: [B:41:0x016e, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
                          0x0170: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:41:0x016e, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
                          0x0170: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:41:0x016e, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:57:0x022c A[PHI: r2 r8 r13 r14
                          0x022c: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:56:0x022a, B:37:0x014c, B:33:0x0125] A[DONT_GENERATE, DONT_INLINE]
                          0x022c: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:56:0x022a, B:37:0x014c, B:33:0x0125] A[DONT_GENERATE, DONT_INLINE]
                          0x022c: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:56:0x022a, B:37:0x014c, B:33:0x0125] A[DONT_GENERATE, DONT_INLINE]
                          0x022c: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:56:0x022a, B:37:0x014c, B:33:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            int iM6987;
                            int i29;
                            int i30;
                            short[] sArr7;
                            int iM6988;
                            int i31;
                            int i32 = RunnableC3474.f10992;
                            int i33 = C4616.f14690;
                            int iM25611 = C0630.m2566("֡ۗ") ^ i33;
                            int i34 = ((iM25611 ^ i32) * 1619) ^ (-1061723711);
                            String strM51463 = null;
                            short[] sArr8 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            int i35 = iM25611 ^ (-486512305);
                            C21985 c21985 = null;
                            int iM6989 = 0;
                            int iM25612 = 0;
                            int i36 = 0;
                            short s2 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 1249214887;
                            while (true) {
                                i42 = i35 ^ (i34 & (((i42 ^ i32) * (-4377)) >> 31));
                                switch (i42) {
                                    case -1413025916:
                                    case 741038025:
                                        C2958.m9034();
                                        if (C2105.f7037 == 0) {
                                            iM6987 = (C2105.m6981("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM6987 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                            i35 = iM6987 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM6988 ^ i31;
                                        }
                                        break;
                                    case -1376718120:
                                    case 532506818:
                                        ServiceConnectionC3453.m10564();
                                        C3537.m10746();
                                        sArr7 = sArr8;
                                        iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                        sArr8 = sArr7;
                                        i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                        i31 = -1798210358;
                                        i35 = iM6988 ^ i31;
                                        break;
                                    case -1342450170:
                                    case 1194305636:
                                        c21985.m31258(iM6989);
                                        sArr10 = f15882;
                                        i41 = 4;
                                        if (RunnableC0588.f2309 >= 0) {
                                            iM6987 = C2105.m6981("᩵᩵") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM6987 = C0630.m2566("֨֡") ^ i32;
                                            i29 = ((iM6987 ^ i33) * (-10051)) ^ 1538290613;
                                            i30 = -1741076008;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -1198955331:
                                    case -557920953:
                                        c21985.m31256(iM25612 ^ i36);
                                        strM51463 = C23196.m51463();
                                        if (C2520.f8000 >= 0) {
                                            iM6987 = (C2105.m6981("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM6987 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM6987 = (C2105.m6981("֡᩵") + i32) * 49;
                                            i29 = ((iM6987 ^ i33) * (-29739)) ^ 641817789;
                                            i30 = -1689950214;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -1059144094:
                                    case 1429300350:
                                        ActivityC16608 activityC16609 = this.f15883.f45510;
                                        boolean z = ActivityC16608.f51007;
                                        C21985 c21986 = new C21985(activityC16609, activityC16609);
                                        if (C3019.m9255() <= 0) {
                                            sArr7 = sArr8;
                                            c21985 = c21986;
                                            iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM6988 ^ i31;
                                        } else {
                                            int iM25613 = (C0630.m2566("ܳ᩵") + i32) * 21;
                                            i34 = ((iM25613 ^ i33) * (-27701)) ^ 1851636395;
                                            i35 = iM25613 ^ 944403113;
                                            c21985 = c21986;
                                        }
                                        break;
                                    case -977599783:
                                    case 206709817:
                                        sArr7 = f15882;
                                        if (C3746.f11829 <= 0) {
                                            iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                        } else {
                                            iM6988 = C2105.m6981("ۡ֫") ^ i33;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i32) * 11359) ^ (-278728039);
                                            i31 = 1803480834;
                                        }
                                        i35 = iM6988 ^ i31;
                                        break;
                                    case -952651097:
                                    case 1053536941:
                                        C1711.m5736();
                                        if (C3746.m11369() < 0) {
                                            iM6987 = (C2105.m6981("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM6987 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM6987 = C0630.m2566("ܶ۠") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 9057) ^ (-1117752086);
                                            i30 = -1921132754;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -319720175:
                                    case -180843993:
                                        C1773.m5908();
                                        break;
                                    case -284393780:
                                    case 1705302226:
                                        i38 = 19488;
                                        iM6987 = C2105.m6981("֡ۧ") ^ i32;
                                        i29 = ((iM6987 ^ i33) * 25527) ^ 461121729;
                                        i30 = 886774965;
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 301595138:
                                    case 2108750056:
                                        iM6989 = 2119921790 ^ C2105.m6981(RunnableC1937.m6385(sArr9, i39, i40, i38));
                                        if (C0422.f1886 <= 0) {
                                            iM6987 = C2105.m6981("᩵᩵") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM6987 = C2105.m6981("۬ۢ") ^ i33;
                                            i29 = ((iM6987 ^ i32) * (-26951)) ^ 1108524513;
                                            i30 = -1992239696;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 368591362:
                                    case 1177340045:
                                        i37 = (s2 * s2) + 155077209;
                                        if (C1420.m4913()) {
                                            iM6987 = C2105.m6981("᩵᩵") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM6987 = C0630.m2566("ܽᩴ") ^ i33;
                                            i29 = ((iM6987 ^ i32) * (-30213)) ^ (-634555045);
                                            i30 = 1354264590;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 562402096:
                                    case 807218130:
                                        sArr9 = f15882;
                                        i39 = 1;
                                        i40 = 3;
                                        if (C3432.m10477() <= 0) {
                                            iM6987 = C0630.m2566("ܶ۠") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 9057) ^ (-1117752086);
                                            i30 = -1921132754;
                                        } else {
                                            iM6987 = (i33 - C2105.m6981("ᩳۡ")) * (-3);
                                            i29 = ((iM6987 ^ i32) * 5843) ^ 647095983;
                                            i30 = -161026878;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 626176811:
                                    case 1704555699:
                                        c21985.m31250((CharSequence) strM51463);
                                        c21985.m31244();
                                        c21985.m31279(6);
                                        if (C3746.m11369() >= 0) {
                                            iM6987 = (C2105.m6981("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM6987 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM6987 = C0630.m2566("᩵۠") ^ i33;
                                            i29 = ((iM6987 ^ i32) * (-30813)) ^ (-412249247);
                                            i30 = 341921166;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 660333736:
                                    case 1304816424:
                                        s2 = sArr8[0];
                                        if (C1420.f5096 > 0) {
                                            iM6987 = C2105.m6981("ۙ۫") ^ i32;
                                            i29 = ((iM6987 ^ i33) * 8995) ^ (-1119360142);
                                            i30 = 667344402;
                                            i35 = iM6987 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM6988 ^ i31;
                                        }
                                        break;
                                    case 764897875:
                                    case 1213375866:
                                        i38 = 25837;
                                        iM6987 = C2105.m6981("֡ۧ") ^ i32;
                                        i29 = ((iM6987 ^ i33) * 25527) ^ 461121729;
                                        i30 = 886774965;
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 853125189:
                                    case 1099151830:
                                        c21985.m31281();
                                        c21985.m31266(true);
                                        break;
                                    case 946503256:
                                    case 1691627557:
                                        C2105.m6982();
                                        if (C5695.m16023() >= 0) {
                                            iM6987 = C0630.m2566("ۢ֫") ^ i32;
                                            i29 = ((iM6987 ^ i33) * (-22881)) ^ 1923370518;
                                            i30 = -1495423997;
                                            i35 = iM6987 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM6988 = C2105.m6981("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM6988 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM6988 ^ i31;
                                        }
                                        break;
                                    case 1971622428:
                                    case 1979929625:
                                        if (i37 - (s2 * 24906) >= 0) {
                                            iM6987 = (C2105.m6981("ۧ᩺") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i29 = ((iM6987 ^ i33) * (-15847)) ^ 907449195;
                                            i30 = 762069288;
                                        } else {
                                            iM6987 = C0630.m2566("᩷ᩴ") ^ i33;
                                            i29 = ((iM6987 ^ i32) * 30357) ^ (-256442002);
                                            i30 = -910889263;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                    default:
                                        iM25612 = C0630.m2566(C0714.m2816(sArr10, i41, 3, i38));
                                        i36 = 2104519596;
                                        if (C2105.f7037 != 0) {
                                            iM6987 = C0630.m2566("ۢ֫") ^ i32;
                                            i29 = ((iM6987 ^ i33) * (-22881)) ^ 1923370518;
                                            i30 = -1495423997;
                                        } else {
                                            iM6987 = (i33 - C2105.m6981("᩹᩸")) * (-61);
                                            i29 = ((iM6987 ^ i32) * 7351) ^ 1461831416;
                                            i30 = 414911460;
                                        }
                                        i35 = iM6987 ^ i30;
                                        i34 = i29;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr4 = f45507;
                    if (C4075.f12947 >= 0) {
                        iM2567 = C0630.m2566("᩺ܺ") ^ i15;
                        i12 = ((iM2567 ^ i16) * (-9513)) ^ (-528077923);
                        i14 = -354301241;
                    } else {
                        iM2567 = (i16 - C0630.m2566("ۤۙ")) * 17;
                        i12 = ((iM2567 ^ i15) * 13995) ^ (-1988314196);
                        i14 = 436352323;
                    }
                    i18 = iM2567 ^ i14;
                    i17 = i12;
                    break;
                case -719375975:
                case 1908234062:
                    break;
                case -654519288:
                case 872247937:
                    C22628.m50615();
                    if (C3019.m9255() <= 0) {
                        i11 = i24;
                        sArr = sArr2;
                        iM2566 = C2105.m6981("᩹۟") ^ i16;
                        i12 = ((iM2566 ^ i15) * (-4657)) ^ 604634992;
                        i13 = 154134721;
                        int i28 = iM2566 ^ i13;
                        sArr2 = sArr;
                        i24 = i11;
                        i18 = i28;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM1955 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM6987 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM6987 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM6987 ^ (-986072977);
                        this = this;
                    }
                    break;
                case -627856725:
                case 463989689:
                    i19 = 16918;
                    iM6981 = (C0630.m2566("ܽۘ") ^ i15) * (-97);
                    i17 = ((iM6981 ^ i16) * 12061) ^ 175522351;
                    i = -1188939259;
                    i4 = iM6981 ^ i;
                    sArr2 = sArr2;
                    i24 = i24;
                    i18 = i4;
                    textView2 = textView2;
                    this = this;
                    break;
                case -432925741:
                case 1761935983:
                    i24 = i24;
                    textView2 = textView2;
                    sArr2 = sArr2;
                    s = f45507[0];
                    i21 = s * s;
                    i22 = 4511376;
                    if (C4117.f13076 > 0) {
                        iM6981 = (C2105.m6981("᩶ܶ") + i16) * (-55);
                        i17 = ((iM6981 ^ i15) * (-1385)) ^ (-91633253);
                        i = 1521235404;
                        i4 = iM6981 ^ i;
                        sArr2 = sArr2;
                        i24 = i24;
                        i18 = i4;
                        textView2 = textView2;
                        this = this;
                    } else {
                        strM1955 = str;
                        textView = textView2;
                        int iM6988 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM6988 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM6988 ^ (-986072977);
                        this = this;
                    }
                    break;
                case -161650292:
                case 1752357778:
                    i24 = i24;
                    textView2 = textView2;
                    sArr2 = sArr2;
                    int i29 = i21 + i22;
                    short s2 = s;
                    int i30 = s2 + 2124;
                    if ((i30 * i30) - (i29 + i29) > 0) {
                        iM6982 = C2105.m6981("۫ܶ") ^ i16;
                        i2 = ((iM6982 ^ i15) * (-17935)) ^ (-310564173);
                        i3 = -1305739581;
                    } else {
                        iM6982 = C2105.m6981("ۜ᩷") ^ i15;
                        i2 = ((iM6982 ^ i16) * (-497)) ^ (-1372969798);
                        i3 = -997961055;
                    }
                    i4 = iM6982 ^ i3;
                    s = s2;
                    i17 = i2;
                    sArr2 = sArr2;
                    i24 = i24;
                    i18 = i4;
                    textView2 = textView2;
                    this = this;
                    break;
                case 437934902:
                case 1445711106:
                    C2126.m7040();
                    ServiceConnectionC3453.m10564();
                    break;
                case 798428551:
                case 1292445500:
                    C0382.m1848();
                    C2520.m8026();
                    i24 = i24;
                    strM1955 = str;
                    textView = textView2;
                    sArr2 = sArr2;
                    int iM6989 = C2105.m6981("֡ۛ") ^ i15;
                    sArr2 = sArr2;
                    textView2 = textView;
                    str = strM1955;
                    i17 = ((iM6989 ^ i16) * (-16631)) ^ 1384630101;
                    i24 = i24;
                    i18 = iM6989 ^ (-986072977);
                    this = this;
                    break;
                case 901882052:
                case 1369986716:
                    if (C0630.f2410 > 0) {
                        i6 = i24;
                        iM6984 = C0630.m2566("֫֨") ^ i16;
                        i7 = ((iM6984 ^ i15) * (-27427)) ^ 206883318;
                        i10 = 1893453619;
                        i9 = iM6984 ^ i10;
                        i5 = i6;
                        i18 = i9;
                        i17 = i7;
                        i24 = i5;
                    } else {
                        i24 = i24;
                        strM1955 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM69810 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM69810 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM69810 ^ (-986072977);
                        this = this;
                    }
                    break;
                case 1342127300:
                case 1958378512:
                    iM25610 = 2125026970 ^ C0630.m2566(C0483.m2128(sArr5, i20, 3, i19));
                    if (C7106.f21815 == 0) {
                        iM2567 = (i16 - C2105.m6981("ۘ۠")) * 79;
                        i12 = ((iM2567 ^ i15) * 16203) ^ (-1241488293);
                        i14 = 1340128506;
                        i18 = iM2567 ^ i14;
                        i17 = i12;
                    }
                    i11 = i24;
                    sArr = sArr2;
                    iM2566 = C2105.m6981("᩹۟") ^ i16;
                    i12 = ((iM2566 ^ i15) * (-4657)) ^ 604634992;
                    i13 = 154134721;
                    int i210 = iM2566 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i210;
                    i17 = i12;
                    break;
                case 1390883559:
                case 1598746017:
                    i24 = i24;
                    sArr2 = sArr2;
                    textView = activityC16608.f51011;
                    strM1955 = C0422.m1955(f45507, 1, 3, i19);
                    if (!C4159.f13567) {
                        int iM69811 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM69811 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM69811 ^ (-986072977);
                        this = this;
                    } else {
                        int iM69812 = C2105.m6981("᩺ۗ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM69812 ^ i16) * (-31739)) ^ 2048237270;
                        i5 = i24;
                        i18 = iM69812 ^ 1134974728;
                        i24 = i5;
                    }
                    break;
                case 1430377804:
                case 1716687320:
                    ViewOnClickListenerC1958.m6441(c19258, iM2569, onClickListener);
                    onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.֨֫᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i31) {
                            int i32 = 885471661;
                            int i33 = C1128.f4106;
                            int i34 = C7811.f24123;
                            int iM69813 = C2105.m6981("۫᩺") ^ i33;
                            int i35 = ((iM69813 ^ i34) * 11165) ^ 1045868695;
                            int i36 = -1733848477;
                            while (true) {
                                i32 = ((((i32 ^ i34) * (-10721)) >> 31) & i35) ^ (iM69813 ^ i36);
                                switch (i32) {
                                    case -1876728508:
                                    case -288566989:
                                        if (C4263.f13799 <= 0) {
                                            iM69813 = C0630.m2566("ܺۗ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        } else {
                                            iM69813 = C2105.m6981("᩷ۡ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * 10173) ^ (-1880916119);
                                            i36 = 228806728;
                                        }
                                        break;
                                    case -1539630753:
                                    case -495485666:
                                        C11340.m28031();
                                        if (!C3663.f11553) {
                                            iM69813 = C2105.m6981("ܶۢ") ^ i33;
                                            i35 = ((iM69813 ^ i34) * (-15601)) ^ (-130124943);
                                            i36 = -488157233;
                                        } else {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        }
                                        break;
                                    case -1330178498:
                                    case -1049256536:
                                        if (C0714.m2805()) {
                                            iM69813 = (i34 - C2105.m6981("ۘۧ")) * (-115);
                                            i35 = ((iM69813 ^ i33) * (-19117)) ^ 997257849;
                                            i36 = 2006278795;
                                        } else {
                                            iM69813 = C0630.m2566("֡ۗ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-22227)) ^ 1123169892;
                                            i36 = 1401359631;
                                        }
                                        break;
                                    case -1273682907:
                                    case 917312621:
                                        C0714.m2805();
                                        RunnableC3474.m10630();
                                        break;
                                    case -1225857956:
                                    case 1612544951:
                                        if (C1504.f5354) {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM69813 = (i34 - C2105.m6981("ܰۗ")) * 75;
                                            i35 = ((iM69813 ^ i33) * 15053) ^ (-1065280417);
                                            i36 = 199827022;
                                        }
                                        break;
                                    case -1189269141:
                                    case 1131112865:
                                        if (C1128.m3851() <= 0) {
                                            iM69813 = C2105.m6981("ܶۢ") ^ i33;
                                            i35 = ((iM69813 ^ i34) * (-15601)) ^ (-130124943);
                                            i36 = -488157233;
                                        } else {
                                            iM69813 = C0630.m2566("ܺۗ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        }
                                        break;
                                    case -1135563195:
                                    case 118732893:
                                        if (C4075.f12947 >= 0) {
                                            iM69813 = (C0630.m2566("᩵᩶") + i33) * 59;
                                            i35 = ((iM69813 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        } else {
                                            iM69813 = C2105.m6981("ۢ֨") ^ i33;
                                            i35 = ((iM69813 ^ i34) * 24887) ^ (-230953460);
                                            i36 = -423319626;
                                        }
                                        break;
                                    case -907677669:
                                    case -297763976:
                                        if (C4616.m13552() != 0) {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM69813 = C0630.m2566("ۧ֫") ^ i33;
                                            i35 = ((iM69813 ^ i34) * 26755) ^ 1633735319;
                                            i36 = -1204565422;
                                        }
                                        break;
                                    case -749210122:
                                    case 1911512917:
                                        if (C21923.m49329()) {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM69813 = (i33 - C2105.m6981("ۤܽ")) * (-115);
                                            i35 = ((iM69813 ^ i34) * (-28331)) ^ 1680823021;
                                            i36 = 266506719;
                                        }
                                        break;
                                    case -613522385:
                                    case 1667841379:
                                        if (C3245.f10203 <= 0) {
                                            iM69813 = C0630.m2566("֡ۗ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-22227)) ^ 1123169892;
                                            i36 = 1401359631;
                                        } else {
                                            iM69813 = (i34 - C0630.m2566("ܶۘ")) * (-37);
                                            i35 = ((iM69813 ^ i33) * 13545) ^ 1940601461;
                                            i36 = 357160795;
                                        }
                                        break;
                                    case -516150758:
                                    case 1722591827:
                                        if (C1294.m4372() <= 0) {
                                            iM69813 = (C0630.m2566("᩵᩶") + i33) * 59;
                                            i35 = ((iM69813 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        } else {
                                            iM69813 = C0630.m2566("ۡ᩸") ^ i34;
                                            i35 = ((iM69813 ^ i33) * 4137) ^ 1423316827;
                                            i36 = 1655168774;
                                        }
                                        break;
                                    case -362566037:
                                    case 593088343:
                                        if (C1773.f6144 > 0) {
                                            iM69813 = C0630.m2566("ܺۗ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        } else {
                                            iM69813 = (C0630.m2566("᩵᩶") + i33) * 59;
                                            i35 = ((iM69813 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        }
                                        break;
                                    case 716152238:
                                    case 1754949113:
                                        if (C1420.m4913()) {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM69813 = (i33 - C0630.m2566("ۖۢ")) * q.h;
                                            i35 = ((iM69813 ^ i34) * (-25375)) ^ 1795538599;
                                            i36 = -211643613;
                                        }
                                        break;
                                    case 983134650:
                                    case 1846944453:
                                        C5695.m16023();
                                        C2272.m7503();
                                        iM69813 = (C0630.m2566("᩵᩶") + i33) * 59;
                                        i35 = ((iM69813 ^ i34) * (-15433)) ^ 1252751268;
                                        i36 = 1126551062;
                                        break;
                                    case 1184118798:
                                    case 1562189756:
                                        RunnableC1108.m3781(this.f2984.f45510);
                                        break;
                                    default:
                                        if (C4117.m12364() != 0) {
                                            iM69813 = C2105.m6981("ۖۙ") ^ i34;
                                            i35 = ((iM69813 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM69813 = C0630.m2566("ܶۗ") ^ i33;
                                            i35 = ((iM69813 ^ i34) * 9461) ^ 128667693;
                                            i36 = 1754896926;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr5 = f45507;
                    i20 = 13;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2567 = C0630.m2566("᩺ܺ") ^ i15;
                        i12 = ((iM2567 ^ i16) * (-9513)) ^ (-528077923);
                        i14 = -354301241;
                    } else {
                        iM2567 = (i15 - C2105.m6981("᩺ۖ")) * (-111);
                        i12 = ((iM2567 ^ i16) * 28929) ^ (-254690749);
                        i14 = 900657479;
                    }
                    i18 = iM2567 ^ i14;
                    i17 = i12;
                    break;
                case 1449174190:
                case 1683678270:
                    C1916.m6308();
                    if (C0798.m2998() == 0) {
                        iM2567 = C2105.m6981("֨᩻") ^ i15;
                        i12 = ((iM2567 ^ i16) * 15425) ^ (-437656679);
                        i14 = -320934575;
                        i18 = iM2567 ^ i14;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM1955 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM69813 = C2105.m6981("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM1955;
                        i17 = ((iM69813 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM69813 ^ (-986072977);
                        this = this;
                    }
                    break;
                default:
                    TextView textView4 = textView2;
                    sArr2 = sArr2;
                    activityC16608 = this.f45510;
                    int i31 = activityC16608.f51009;
                    i24 = this.f45508;
                    if (i24 != i31) {
                        int iM69814 = C2105.m6981("ۨܺ") ^ i16;
                        i18 = iM69814 ^ 1460032732;
                        i17 = ((iM69814 ^ i15) * 30175) ^ (-1368414056);
                    } else {
                        int iM69815 = C2105.m6981("ᩴۗ") ^ i16;
                        i17 = ((iM69815 ^ i15) * (-13295)) ^ (-24802458);
                        i18 = iM69815 ^ 2045905282;
                    }
                    textView2 = textView4;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35372(C14928 c14928) {
        ActivityC16608 activityC16608 = null;
        ArrayList arrayList = null;
        int i = -4142438;
        int i2 = C1128.f4106;
        int i3 = C0630.f2410;
        int iM6981 = (C2105.m6981("ܺۧ") + i2) * 83;
        int i4 = ((iM6981 ^ i3) * (-25991)) ^ (-1251439317);
        int i5 = -424244815;
        while (true) {
            i = ((((i ^ i3) * 16339) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2120872086:
                case 1234294618:
                    if (C3245.m9925() != 0) {
                        iM6981 = (C2105.m6981("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM6981 = C0630.m2566("ۙܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7777)) ^ (-1590301812);
                        i5 = 1953052523;
                    }
                    break;
                case -2086458604:
                case 632286494:
                    activityC16608 = c14928.f45510;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۡ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    } else {
                        iM6981 = C2105.m6981("ܽ᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30645)) ^ 488595994;
                        i5 = 1903673321;
                    }
                    break;
                case -2029920494:
                case 172733447:
                    C0382.m1848();
                    if (!C1504.m5179()) {
                        iM6981 = C2105.m6981("ۡ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    } else {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9255)) ^ 1525610505;
                        i5 = 340937538;
                    }
                    break;
                case -1952388205:
                case 1323409264:
                    if (!C3663.f11553) {
                        iM6981 = (C2105.m6981("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۗ֨")) * 25;
                        i4 = ((iM6981 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case -1828860176:
                case 23366911:
                    if (C1005.m3501()) {
                        iM6981 = C2105.m6981("ۘ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-157)) ^ 654083142;
                        i5 = 1199151796;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۗ֨")) * 25;
                        i4 = ((iM6981 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case -1703733989:
                case 734505585:
                    if (C1294.m4372() <= 0) {
                        iM6981 = (i2 - C2105.m6981("ۗ֨")) * 25;
                        i4 = ((iM6981 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    } else {
                        iM6981 = C0630.m2566("᩵۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3969) ^ (-2047923014);
                        i5 = 1298225923;
                    }
                    break;
                case -1553697782:
                case -1239395309:
                    C7811.m20844();
                    iM6981 = C2105.m6981("ۡ֡") ^ i3;
                    i4 = ((iM6981 ^ i2) * 12443) ^ 1167778485;
                    i5 = 1863103088;
                    break;
                case -1448806088:
                case 1356527798:
                    RunnableC1937.m6383(arrayList);
                    if (c14928.f45509 != null) {
                        iM6981 = (C2105.m6981("᩷ۘ") ^ i2) * 49;
                        i4 = ((iM6981 ^ i3) * (-3499)) ^ (-123170375);
                        i5 = -827420078;
                    } else {
                        iM6981 = (C2105.m6981("᩻᩷") + i3) * (-77);
                        i4 = ((iM6981 ^ i2) * 20033) ^ 510827304;
                        i5 = 478974310;
                    }
                    break;
                case -610808736:
                case 2071678103:
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C2105.m6981("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM6981 = (C2105.m6981("ܳ۫") + i2) * (-9);
                        i4 = ((iM6981 ^ i3) * 5599) ^ (-237328171);
                        i5 = -1305006113;
                    }
                    break;
                case -462236897:
                case 786821309:
                    C0798.m2998();
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۗ֨")) * 25;
                        i4 = ((iM6981 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    } else {
                        iM6981 = C2105.m6981("ۡ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    }
                    break;
                case -359335419:
                case 1616667054:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("᩸۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9255)) ^ 1525610505;
                        i5 = 340937538;
                    } else {
                        iM6981 = C0630.m2566("ۙܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-9467)) ^ (-947569521);
                        i5 = -618251439;
                    }
                    break;
                case -50486048:
                case 1341998708:
                    if (RunnableC3474.m10630()) {
                        iM6981 = (C0630.m2566("ۤۛ") + i3) * (-71);
                        i4 = ((iM6981 ^ i2) * (-12169)) ^ (-1705057112);
                        i5 = -917954842;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    }
                    break;
                case -14070279:
                case 901547990:
                    C1773.m5908();
                    break;
                case 301555827:
                case 2047180512:
                    if (C11340.m28031()) {
                        iM6981 = (C2105.m6981("۟᩹") + i2) * 41;
                        i4 = ((iM6981 ^ i3) * 9) ^ (-853559585);
                        i5 = -1210096745;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۗ֨")) * 25;
                        i4 = ((iM6981 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case 1172727745:
                case 1938758399:
                    if (C21923.m49329()) {
                        iM6981 = C2105.m6981("ۧ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23509)) ^ (-2036059412);
                        i5 = 1358661540;
                    } else {
                        iM6981 = (C2105.m6981("ۡܺ") ^ i3) * (-47);
                        i4 = ((iM6981 ^ i2) * 31211) ^ 1911896250;
                        i5 = 584965112;
                    }
                    break;
                case 1643716863:
                case 2095967188:
                    arrayList = activityC16608.f51012;
                    if (C11340.m28031()) {
                        iM6981 = (C2105.m6981("ۘۨ") + i3) * (-121);
                        i4 = ((iM6981 ^ i2) * (-13587)) ^ (-204600156);
                        i5 = 1898817004;
                    } else {
                        iM6981 = C2105.m6981("ۧ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23509)) ^ (-2036059412);
                        i5 = 1358661540;
                    }
                    break;
                case 1867252843:
                case 2019160313:
                    activityC16608.f51012.addAll(c14928.f45509);
                    iM6981 = (C2105.m6981("᩻᩷") + i3) * (-77);
                    i4 = ((iM6981 ^ i2) * 20033) ^ 510827304;
                    i5 = 478974310;
                    break;
                default:
                    C21923.m49340(activityC16608.f10584, C18393.m42823());
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC16608 activityC16608 = null;
        C12346 c12346 = null;
        boolean z = false;
        int i = 1502321792;
        int i2 = C2958.f9394;
        int i3 = ServiceConnectionC3453.f10921;
        int iM2566 = C0630.m2566("۫ۙ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 3619) ^ (-1070236225);
        int i5 = -1571696088;
        while (true) {
            i = ((((i ^ i2) * (-11247)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2027873898:
                case -841750339:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM2566 = C0630.m2566("ܿܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27825) ^ 1730593064;
                        i5 = -1575871731;
                    }
                    break;
                case -1925915405:
                case 1220898811:
                    AbstractC2021.m6574();
                    C0382.m1848();
                    break;
                case -1776541603:
                case -345288115:
                    C4616.m13552();
                    if (C3245.m9925() == 0) {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM2566 = C2105.m6981("ᩳܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    }
                    break;
                case -1761788628:
                case -1173068595:
                    C2167.m7155();
                    iM2566 = C2105.m6981("ᩳܿ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 4973) ^ 641751143;
                    i5 = 1639977647;
                    break;
                case -1378406337:
                case 1835104449:
                    if (this.f45508 != activityC16608.f51009) {
                        iM2566 = C0630.m2566("ܳܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15103)) ^ 1456570131;
                        i5 = 105652926;
                    } else {
                        iM2566 = (C2105.m6981("ۧ۫") ^ i3) * 3;
                        i4 = ((iM2566 ^ i2) * 29191) ^ 246450826;
                        i5 = -1340656060;
                    }
                    break;
                case -1256788814:
                case 1319565846:
                    activityC16608 = this.f45510;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM2566 = C0630.m2566("۬ۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31217) ^ 1165853520;
                        i5 = -2011512097;
                    }
                    break;
                case -1118734356:
                case -647513764:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۛ۫") ^ i3) * 109;
                        i4 = ((iM2566 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM2566 = C0630.m2566("ᩴۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1159) ^ 1927305879;
                        i5 = 704030734;
                    }
                    break;
                case -589870988:
                case 1443779237:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("۫ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30699) ^ 1778625161;
                        i5 = -395707582;
                    } else {
                        iM2566 = C2105.m6981("ܳ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15401)) ^ 2118055906;
                        i5 = -1740416011;
                    }
                    break;
                case -533230913:
                case 1240225614:
                    if (C3245.m9925() != 0) {
                        iM2566 = (C2105.m6981("ۛ۫") ^ i3) * 109;
                        i4 = ((iM2566 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM2566 = C0630.m2566("ۛܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 11809) ^ (-1449848979);
                        i5 = -539191130;
                    }
                    break;
                case -348749724:
                case 1711338081:
                    C4117.m12364();
                    if (!C0382.m1848()) {
                        iM2566 = (C2105.m6981("ۛ۫") ^ i3) * 109;
                        i4 = ((iM2566 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM2566 = C2105.m6981("ᩳܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    }
                    break;
                case -210887101:
                case 1910320093:
                    break;
                case -163324161:
                case 293496086:
                    c12346.m29958(z);
                    if (C18393.m42825()) {
                        iM2566 = (C2105.m6981("ᩳ֡") ^ i2) * (-17);
                        i4 = ((iM2566 ^ i3) * (-11495)) ^ (-1919943956);
                        i5 = -736660388;
                    } else {
                        iM2566 = C0630.m2566("ܳܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15103)) ^ 1456570131;
                        i5 = 105652926;
                    }
                    break;
                case 77517719:
                case 1168075144:
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("ܶ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12429) ^ (-539533441);
                        i5 = -1826434317;
                    } else {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    }
                    break;
                case 708211039:
                case 1995590392:
                    c12346 = activityC16608.f51010;
                    z = false;
                    z = false;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM2566 = (C2105.m6981("۫۠") + i3) * (-17);
                        i4 = ((iM2566 ^ i2) * 14375) ^ (-798371059);
                        i5 = -1254498796;
                    }
                    break;
                case 721328522:
                case 1159106875:
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ᩳܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    } else {
                        iM2566 = (C0630.m2566("᩶۫") ^ i3) * (-117);
                        i4 = ((iM2566 ^ i2) * (-27627)) ^ (-110969648);
                        i5 = 1836712747;
                    }
                    break;
                case 1029000789:
                case 1462773325:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ܶ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12429) ^ (-539533441);
                        i5 = -1826434317;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֡᩵")) * 47;
                        i4 = ((iM2566 ^ i2) * (-17619)) ^ (-1980693914);
                        i5 = 1633067131;
                    }
                    break;
                case 1086988701:
                case 1410870528:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("۫ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 30699) ^ 1778625161;
                        i5 = -395707582;
                    } else {
                        iM2566 = C2105.m6981("᩹᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12649) ^ (-343852620);
                        i5 = 556225261;
                    }
                    break;
                case 1401349928:
                case 1693313751:
                    if (C1128.m3851() <= 0) {
                        iM2566 = C2105.m6981("ܰۤ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM2566 = C0630.m2566("ۖۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4911) ^ (-1951691869);
                        i5 = -1243078193;
                    }
                    break;
                default:
                    C3746.m11360(activityC16608.f51011, z ? 1 : 0);
                    iM2566 = C0630.m2566("ܳܽ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-15103)) ^ 1456570131;
                    i5 = 105652926;
                    break;
            }
            return;
        }
    }
}
