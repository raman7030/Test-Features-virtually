package p067l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܶ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16556 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۨۚ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f82225 = {7667, -16004, 13605, 8521, -8306, 5381, -9438, -10495, 3171, -13760, 15220, -10751, 6783, 13281, 16314, 3503, 6941, -27828, 30630, -26647, 2311, -6993, -7008, -6996, -7004, -6930, -6991, -6995, -6988, -7002, -7000, -6993, -6930, -7003, -7004, -6985, -6930, -6995, -7000, -6990, -6987, -6987, -6994, -6998, -7004, -6993, -6995, -7000, -6996, -7000, -6987, -6995, -7000, -6990, -6987, -6990, -7003, -6998, -6991, -6995, -6988, -7002, -7000, -6993, -7032, -7003, -7003, -7004, -6990, -7006, -6989, -7000, -6991, -6987, -7000, -6994, -6993, -6985, -7004, -6989, -6990, -7000, -6994, -6993, -7038, -6994, -7003, -7004, -6985, -7004, -6989, -6990, -7000, -6994, -6993, -7025, -7008, -6996, -7004, -7000, -7006, -6994, -6993, -6990, -6987, -7008, -6987, -7004, -6990, -6987, -7008, -6987, -7004, -7032, -6993, -7001, -6994, -6989, -7004, -6985, -7000, -7004, -6986, -7017, -7004, -6989, -6990, -7000, -6994, -6993, -6990, -7000, -6981, -7004};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f48623;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f48624;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC18153 f48625;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC18153 activityC18153 = null;
        TextView textView = null;
        C14102 c14102 = null;
        boolean z = false;
        int i = 1193463877;
        int i2 = C1229.f82066;
        int i3 = C1003.f81929;
        int iM55979 = C0946.m55979("᩹ۤ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 21471) ^ (-824469494);
        int i5 = -1766954400;
        while (true) {
            i = ((((i ^ i3) * 13985) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1985554649:
                case 957930202:
                    C1028.m56247();
                    iM55979 = C0946.m55979("۠ۚ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-8711)) ^ (-153230692);
                    i5 = -1415105722;
                    break;
                case -1981894444:
                case -992635803:
                    RunnableC0897.m55784();
                    C0955.m56025();
                    break;
                case -1874627168:
                case -534017659:
                    textView = activityC18153.f54188;
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("ܽ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14831)) ^ (-1962815412);
                        i5 = -561390104;
                    } else {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    }
                    break;
                case -1874306950:
                case 660444332:
                    activityC18153 = this.f48625;
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("۟᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM55979 = C0873.m55680("۠ۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 1749) ^ (-282179738);
                        i5 = -313849021;
                    }
                    break;
                case -1526984916:
                case 1387223630:
                    C0937.m55918();
                    if (C0845.m55584() > 0) {
                        iM55979 = (i2 - C0873.m55680("۟ۛ")) * (-27);
                        i4 = ((iM55979 ^ i3) * (-20499)) ^ 594217358;
                        i5 = -1307265392;
                    } else {
                        iM55979 = C0946.m55979("۠ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    }
                    break;
                case -1486430850:
                case -143585732:
                    c14102 = activityC18153.f54187;
                    z = true;
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM55979 = C0873.m55680("᩷֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 6617) ^ (-1929194118);
                        i5 = 1589931312;
                    }
                    break;
                case -1097310668:
                case 726210213:
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM55979 = C0946.m55979("ۧܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12579)) ^ (-1127019481);
                        i5 = 421784624;
                    }
                    break;
                case -1065909154:
                case 165679741:
                    C0866.m55645();
                    if (C1044.f81959 < 0) {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM55979 = C0946.m55979("۠ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    }
                    break;
                case -1038510586:
                case 296353822:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22737)) ^ 722883842;
                        i5 = 1904507545;
                    } else {
                        iM55979 = C0873.m55680("ۙ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13103)) ^ (-1724586780);
                        i5 = 1694788885;
                    }
                    break;
                case 159297692:
                case 995780960:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i2 - C0873.m55680("۟ۛ")) * (-27);
                        i4 = ((iM55979 ^ i3) * (-20499)) ^ 594217358;
                        i5 = -1307265392;
                    } else {
                        iM55979 = C0873.m55680("ۡۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17117) ^ (-264909880);
                        i5 = -556711514;
                    }
                    break;
                case 549657138:
                case 813917768:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22737)) ^ 722883842;
                        i5 = 1904507545;
                    } else {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    }
                    break;
                case 1111572796:
                case 1870266027:
                    C0898.m55802(textView, 8);
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("۟᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM55979 = (C0873.m55680("֫ᩴ") ^ i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 23443) ^ 1222647696;
                        i5 = 798507378;
                    }
                    break;
                case 1199430591:
                case 1508032294:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("᩶ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-31513)) ^ 266407383;
                        i5 = 1893021962;
                    } else {
                        iM55979 = (C0946.m55979("ܿᩳ") ^ i3) * (-101);
                        i4 = ((iM55979 ^ i2) * 15423) ^ (-1665761464);
                        i5 = -2044130927;
                    }
                    break;
                case 1599611606:
                case 1864456442:
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0946.m55979("۠ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-8711)) ^ (-153230692);
                        i5 = -1415105722;
                    } else {
                        iM55979 = C0946.m55979("᩸ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-25991)) ^ (-1383244033);
                        i5 = 1944741937;
                    }
                    break;
                case 1801477685:
                case 2092830540:
                    c14102.m32018(z);
                    ActivityC18153.m41337(activityC18153);
                    break;
                default:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("۟᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4707)) ^ 1468964350;
                        i5 = 45788449;
                    } else {
                        iM55979 = (C0946.m55979("ۛۡ") ^ i3) * (-115);
                        i4 = ((iM55979 ^ i2) * 15549) ^ 1066497660;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int iM55680;
        int i;
        int i2;
        short[] sArr;
        C16556 c16556 = this;
        int i3 = C0894.f81854;
        int i4 = RunnableC0871.f81839;
        int iM55979 = (i4 - C0946.m55979("ۛۜ")) * (-59);
        int i5 = ((iM55979 ^ i3) * 19809) ^ (-98488193);
        String strM56077 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55979 ^ 167267599;
        int iM55681 = 0;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 1363935582;
        TextView textView = null;
        TextView textView2 = null;
        ActivityC18153 activityC18153 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 13615) >> 31));
            switch (i10) {
                case -2110536086:
                case 386043518:
                    i8 = i7 + 1771561;
                    s2 = 2662;
                    if (!C0949.m56012()) {
                        iM55680 = C0873.m55680("ۤܽ") ^ i4;
                        i = ((iM55680 ^ i3) * (-11197)) ^ 1668251417;
                        i2 = 812239480;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM55682 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55682 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55682 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case -2098220794:
                case 1328008405:
                    C0946.m55976(textView2, 2104608675 ^ iM55681);
                    if (C1071.f81975 > 0) {
                        iM55680 = (C0873.m55680("ᩴۖ") + i4) * 75;
                        i = ((iM55680 ^ i3) * (-8215)) ^ 565488300;
                        i2 = -1951507175;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM55683 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55683 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55683 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case -1964577015:
                case 629541753:
                    sArr = f82225;
                    if (!C0873.m55678()) {
                        int iM55684 = (C0873.m55680("ᩳ֨") ^ i3) * (-33);
                        i = ((iM55684 ^ i4) * (-7889)) ^ (-304616979);
                        i6 = iM55684 ^ 1969149902;
                        c16556 = this;
                        sArr2 = sArr;
                        i5 = i;
                    } else {
                        int iM55685 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55685 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55685 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case -1902416724:
                case -1771539102:
                    textView = activityC18153.f54188;
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = C0946.m55979("֡ܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 17135) ^ (-390842908);
                        i2 = 1577744169;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM55686 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55686 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55686 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case -1872405764:
                case 1697616069:
                    s = sArr2[c];
                    i7 = s * s;
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("᩹۫") + i4) * (-39);
                        i = ((iM55680 ^ i3) * 4227) ^ (-1138279107);
                        i2 = 1735803601;
                    } else {
                        iM55680 = C0873.m55680("ۖܽ") ^ i3;
                        i = ((iM55680 ^ i4) * 11067) ^ 1440272847;
                        i2 = -1703260112;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1690466045:
                case 855953706:
                    strM56077 = C0967.m56077(sArr3, 17, 3, i9);
                    if (C0894.f81854 < 0) {
                        iM55680 = C0946.m55979("۬ۜ") ^ i3;
                        i = ((iM55680 ^ i4) * 12659) ^ (-1320691619);
                        i2 = -234217379;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM55687 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55687 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55687 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case -1615754021:
                case 2138241092:
                    iM55681 = C0873.m55680(strM56077);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("۠ۨ") ^ i3;
                        i = ((iM55680 ^ i4) * 15081) ^ 1675006902;
                        i2 = 1025567848;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩸") ^ i4;
                        i = ((iM55680 ^ i3) * 24599) ^ 847754235;
                        i2 = 454336631;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1449989874:
                case 423112714:
                    if (i8 - (s * s2) >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۢ۠")) * (-109);
                        i = ((iM55680 ^ i3) * (-25871)) ^ (-311026081);
                        i2 = 553672078;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۖ֨")) * 29;
                        i = ((iM55680 ^ i4) * (-31171)) ^ 1762125775;
                        i2 = -1268190747;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1395306435:
                case -149043998:
                    C0949.m56012();
                    iM55680 = (C0873.m55680("᩵ۜ") + i4) * C0254q.f1218h;
                    i = ((iM55680 ^ i3) * (-25631)) ^ 2101830274;
                    i2 = 1329705397;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1336396535:
                case -1314497599:
                    if (!C0882.f81846) {
                        sArr = sArr2;
                        int iM55688 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55688 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55688 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    } else {
                        iM55680 = (C0946.m55979("᩹۫") + i4) * (-39);
                        i = ((iM55680 ^ i3) * 4227) ^ (-1138279107);
                        i2 = 1735803601;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1307113794:
                case -853460139:
                    i9 = 24625;
                    iM55680 = (i3 - C0946.m55979("ۚۘ")) * 51;
                    i = ((iM55680 ^ i4) * 28785) ^ (-1254024372);
                    i2 = 1850674345;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1237060534:
                case -533910718:
                    c = 16;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (i3 - C0946.m55979("ᩳᩳ")) * (-29);
                        i = ((iM55680 ^ i4) * 24907) ^ (-1441490772);
                        i2 = -1864901908;
                    } else {
                        iM55680 = C0873.m55680("ܶۜ") ^ i4;
                        i = ((iM55680 ^ i3) * (-21467)) ^ 79980825;
                        i2 = -53180148;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -747452420:
                case 986862846:
                    C0947.m55996(textView, new ViewOnClickListenerC20581(0, c16556));
                    break;
                case -529266216:
                case 1360115053:
                    i9 = 3473;
                    iM55680 = (i3 - C0946.m55979("ۚۘ")) * 51;
                    i = ((iM55680 ^ i4) * 28785) ^ (-1254024372);
                    i2 = 1850674345;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -334769193:
                case 180786134:
                    textView2 = activityC18153.f54188;
                    sArr3 = f82225;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("۠ۨ") ^ i3;
                        i = ((iM55680 ^ i4) * 15081) ^ 1675006902;
                        i2 = 1025567848;
                    } else {
                        iM55680 = C0946.m55979("ܰ۬") ^ i3;
                        i = ((iM55680 ^ i4) * (-17335)) ^ (-1388394013);
                        i2 = 373647830;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -311706680:
                case 2042342309:
                    C0947.m55997();
                    if (C0927.f81875) {
                        iM55680 = (i3 - C0946.m55979("ᩳᩳ")) * (-29);
                        i = ((iM55680 ^ i4) * 24907) ^ (-1441490772);
                        i2 = -1864901908;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۜ") + i4) * C0254q.f1218h;
                        i = ((iM55680 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -165478105:
                case 1762695447:
                    C1024.m56209();
                    if (!C0882.f81846) {
                        iM55680 = (C0873.m55680("᩵ۜ") + i4) * C0254q.f1218h;
                        i = ((iM55680 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        sArr = sArr2;
                        int iM55689 = C0873.m55680("᩻᩵") ^ i4;
                        i6 = iM55689 ^ 1860531223;
                        sArr2 = sArr;
                        i5 = ((iM55689 ^ i3) * (-24697)) ^ 1355234715;
                        c16556 = this;
                    }
                    break;
                case 283416362:
                case 1585188541:
                    C0898.m55802(activityC18153.f54188, 0);
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("᩵ۜ") + i4) * C0254q.f1218h;
                        i = ((iM55680 ^ i3) * (-25631)) ^ 2101830274;
                        i2 = 1329705397;
                    } else {
                        iM55680 = (i4 - C0873.m55680("֡ۚ")) * 11;
                        i = ((iM55680 ^ i3) * (-11451)) ^ 898269190;
                        i2 = 1908925029;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 648361115:
                case 1559291382:
                    break;
                case 1015526698:
                case 1089628728:
                    activityC18153 = c16556.f48625;
                    if (c16556.f48623 != activityC18153.f54186) {
                        iM55680 = C0946.m55979("᩸۫") ^ i3;
                        i = ((iM55680 ^ i4) * 16961) ^ 485755288;
                        i2 = -1411511679;
                    } else {
                        iM55680 = (C0946.m55979("ۧᩴ") ^ i4) * 83;
                        i = ((iM55680 ^ i3) * (-5105)) ^ 418908150;
                        i2 = -1306913445;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0937.m55918();
                    C1929.m56553();
                    break;
            }
            return;
        }
    }

    public C16556(ActivityC18153 activityC18153, int i) {
        int i2 = -158136638;
        int i3 = C0845.f81821;
        int i4 = RunnableC0938.f81886;
        this.f48625 = activityC18153;
        this.f48623 = i;
        int iM55979 = (C0946.m55979("ᩳۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i5 = ((iM55979 ^ i3) * 693) ^ (-1366778951);
        int i6 = 1638741620;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * 18391) >> 31));
            switch (i2) {
                case -2047901401:
                case -1096237479:
                    C0949.m56012();
                    throw new RuntimeException();
                case -1832318234:
                case 1539451391:
                    C0882.m55710();
                    C0946.m55980();
                    iM55979 = C0946.m55979("ܿۛ") ^ i4;
                    i5 = ((iM55979 ^ i3) * 20775) ^ (-332731627);
                    i6 = 336378225;
                    break;
                case -1576082356:
                case -886297899:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("֨᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24797)) ^ (-1548335490);
                        i6 = -942145566;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩹") ^ i4;
                        i5 = ((iM55979 ^ i3) * 5665) ^ (-1484264232);
                        i6 = -1844709548;
                    }
                    break;
                case -1505520566:
                case -766097878:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("֨۟") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-25977)) ^ (-454042685);
                        i6 = 1588285232;
                    } else {
                        iM55979 = (C0873.m55680("ܶᩴ") + i3) * (-97);
                        i5 = ((iM55979 ^ i4) * 30171) ^ 1347688693;
                        i6 = -404676385;
                    }
                    break;
                case -1152635449:
                case 65589559:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("֨᩸") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-24797)) ^ (-1548335490);
                        i6 = -942145566;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩹") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i3) * (-13785)) ^ 856493327;
                        i6 = -1927632818;
                    }
                    break;
                case -18750156:
                case 997337977:
                    C1404.m56468();
                    if (!C0892.f81851) {
                        iM55979 = (C0873.m55680("ۚ᩹") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i3) * (-13785)) ^ 856493327;
                        i6 = -1927632818;
                    } else {
                        iM55979 = C0946.m55979("ܿۛ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 20775) ^ (-332731627);
                        i6 = 336378225;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        C16496 c16496;
        int iM559710;
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
        int iM559711;
        int i11;
        int i12;
        short[] sArr4;
        int i13;
        JSONArray jSONArray2;
        String str3;
        short[] sArr5;
        int i14;
        int iM55681;
        int i15;
        int iM55682;
        int i16;
        int iM55683;
        int i17;
        int i18;
        int i19 = C1124.f82007;
        int i20 = RunnableC1014.f81941;
        int iM559712 = C0946.m55979("۟ۛ") ^ i19;
        int i21 = ((iM559712 ^ i20) * (-30309)) ^ 1969421686;
        JSONObject jSONObjectM37420 = null;
        String strM55970 = null;
        JSONArray jSONArray3 = null;
        ArrayList arrayList = null;
        String strM56132 = null;
        String strM56235 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i22 = iM559712 ^ (-1037985780);
        int i23 = 0;
        int i24 = 0;
        short s = 0;
        short s2 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1217276351;
        C16496 c16497 = null;
        String strM56180 = null;
        String strM55717 = null;
        short[] sArr8 = null;
        int i30 = 0;
        int iM56152 = 0;
        C16496 c16496M43674 = null;
        C20521 c20521 = null;
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
                    iM55979 = (i19 - C0946.m55979("ᩴ᩷")) * (-29);
                    i3 = ((iM55979 ^ i20) * (-17727)) ^ (-803450274);
                    i4 = -1744330759;
                    i7 = iM55979 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c16497 = c16497;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -2101458809:
                case 1194722858:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16497 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (((s * s) + 385847449) - (s * s2) >= 0) {
                        iM55979 = C0946.m55979("ۙۢ") ^ i20;
                        i3 = ((iM55979 ^ i19) * (-29511)) ^ 417891848;
                        i4 = -944030024;
                    } else {
                        iM55979 = (C0946.m55979("ܳۨ") ^ i20) * 29;
                        i3 = ((iM55979 ^ i19) * 10783) ^ (-1090935304);
                        i4 = -1558021735;
                    }
                    i7 = iM55979 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c16497 = c16497;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -2018961989:
                case 594364479:
                    int i32 = i30;
                    strM56235 = strM56235;
                    str = str4;
                    i8 = i28;
                    sArr = sArr6;
                    i25 = i25;
                    sArr2 = sArr9;
                    short[] sArr10 = sArr8;
                    i9 = i24;
                    JSONArray jSONArray4 = jSONArray3;
                    sArr8 = sArr10;
                    jSONObjectM37420 = c16496M43674.m37420();
                    jSONArray3 = jSONArray4;
                    strM55970 = AbstractC0942.m55970(f82225, 51, 4, i23);
                    if (C0866.f81837 >= 0) {
                        i30 = i32;
                        int iM55684 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM55684 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM55684 ^ 40441380;
                    } else {
                        int iM55685 = (C0873.m55680("ۛۗ") + i19) * 123;
                        int i33 = ((iM55685 ^ i20) * 30665) ^ (-178192318);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM55685 ^ 1482009404;
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
                    throw new C3924(c16496M43674.m37418());
                case -1793561361:
                case 1435179637:
                    C1053.m56327();
                    C1964.m56597();
                    return;
                case -1690322241:
                case 1201982924:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16496 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    int i34 = C17837.f53209;
                    C19179 c19179M43668 = C19179.m43668(C0898.m55792(f82225, 25, 16, i23));
                    c19179M43668.m43676();
                    c16496M43674 = c19179M43668.m43674();
                    if (c16496M43674.m37422()) {
                        iM559710 = C0946.m55979("ܶ᩹") ^ i20;
                        i5 = ((iM559710 ^ i19) * 7791) ^ 1483263859;
                        i6 = -431807979;
                    } else {
                        iM559710 = (C0873.m55680("ܺۖ") ^ i19) * 115;
                        i5 = ((iM559710 ^ i20) * (-6987)) ^ (-36581191);
                        i6 = 117337519;
                    }
                    int i35 = iM559710 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i35;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    c16497 = c16496;
                    i30 = i30;
                    break;
                case -1602350524:
                case 1895920026:
                    c20521.m46306(C1929.m56556(jSONObject2, strM56235));
                    i30 = i30;
                    iM55682 = C0873.m55680("ۜۚ") ^ i20;
                    i3 = ((iM55682 ^ i19) * (-4279)) ^ (-438114847);
                    i16 = 1131310409;
                    i22 = iM55682 ^ i16;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -1582283715:
                case 970025331:
                    jSONObject = jSONObjectM37420;
                    sArr3 = sArr8;
                    str2 = strM55970;
                    jSONArray = jSONObject.getJSONArray(str2);
                    arrayList = new ArrayList(jSONArray.length());
                    i31 = 0;
                    int iM55686 = C0873.m55680("ܳܽ") ^ i20;
                    JSONObject jSONObject3 = jSONObject;
                    int i36 = ((iM55686 ^ i19) * (-22839)) ^ 1889784291;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = iM55686 ^ (-539949949);
                    jSONObjectM37420 = jSONObject3;
                    strM55970 = str2;
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
                    C1194.m56396();
                    iM55683 = (C0946.m55979("ܽᩴ") ^ i19) * 37;
                    i17 = ((iM55683 ^ i20) * 26507) ^ (-366284555);
                    i18 = -603260817;
                    i22 = iM55683 ^ i18;
                    i21 = i17;
                    break;
                case -1504630724:
                case 834448463:
                    i23 = 58561;
                    iM55979 = (i19 - C0946.m55979("ᩴ᩷")) * (-29);
                    i3 = ((iM55979 ^ i20) * (-17727)) ^ (-803450274);
                    i4 = -1744330759;
                    i7 = iM55979 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c16497 = c16497;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -1447872661:
                case 1820946468:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46284(C1929.m56556(jSONObject2, C1046.m56293(sArr7, i30, 11, i23)));
                    sArr9 = f82225;
                    i24 = 77;
                    if (C1053.f81965 > 0) {
                        iM55681 = (C0873.m55680("ۜܿ") ^ i19) * (-33);
                        i3 = ((iM55681 ^ i20) * (-8915)) ^ 1116334350;
                        i15 = 2109377400;
                        i7 = iM55681 ^ i15;
                        strM56235 = strM56235;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        c16497 = c16497;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM55970 = strM55970;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        jSONObjectM37420 = jSONObjectM37420;
                        str4 = str4;
                        i25 = i25;
                        int iM559713 = C0946.m55979("ᩳۤ") ^ i20;
                        i3 = ((iM559713 ^ i19) * 6677) ^ 777868250;
                        i7 = iM559713 ^ 849139634;
                        sArr8 = sArr8;
                        i25 = i25;
                        jSONArray3 = jSONArray3;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        sArr6 = sArr6;
                        c16497 = c16497;
                        i28 = i28;
                        strM56235 = strM56235;
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
                    strM56235 = strM56235;
                    C16496 c16498 = c16497;
                    i25 = i25;
                    i28 = i28;
                    sArr6 = sArr6;
                    sArr9 = sArr9;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    boolean zM45097 = C19850.m45097();
                    c16497 = c16498;
                    String strM55810 = C0906.m55810(f82225, 21, 4, i23);
                    if (zM45097) {
                        str4 = strM55810;
                        iM55979 = C0873.m55680("ۨۜ") ^ i19;
                        i3 = ((iM55979 ^ i20) * (-23997)) ^ 979123318;
                        i4 = 682818748;
                        i7 = iM55979 ^ i4;
                        sArr9 = sArr9;
                        i24 = i24;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        c16497 = c16497;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i7;
                        i21 = i3;
                    } else {
                        int iM559714 = C0946.m55979("᩹֨") ^ i20;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        i24 = i24;
                        c16497 = c16497;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = iM559714 ^ (-45820650);
                        i21 = ((iM559714 ^ i19) * (-12673)) ^ (-1444609788);
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = strM55810;
                    }
                    i30 = i30;
                    break;
                case -1122805281:
                case 579107738:
                    c20521.m46283(jSONObject2.getLong(C1071.m56336(f82225, 130, 4, i23)));
                    C0937.m55917(arrayList, c20521);
                    i31++;
                    jSONObject = jSONObjectM37420;
                    str2 = strM55970;
                    jSONArray = jSONArray3;
                    sArr3 = sArr8;
                    int iM55687 = C0873.m55680("ܳܽ") ^ i20;
                    JSONObject jSONObject4 = jSONObject;
                    int i37 = ((iM55687 ^ i19) * (-22839)) ^ 1889784291;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = iM55687 ^ (-539949949);
                    jSONObjectM37420 = jSONObject4;
                    strM55970 = str2;
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
                    String str5 = strM56235;
                    String str6 = str4;
                    int i39 = i28;
                    short[] sArr13 = sArr6;
                    int i40 = i25;
                    short[] sArr14 = sArr9;
                    short[] sArr15 = sArr8;
                    int i41 = i24;
                    JSONArray jSONArray5 = jSONArray3;
                    if (i31 < jSONArray5.length()) {
                        iM559711 = (i20 - C0946.m55979("ᩳ᩸")) * (-39);
                        i11 = ((iM559711 ^ i19) * 3905) ^ 148711975;
                        i12 = 1761610315;
                    } else {
                        iM559711 = (C0946.m55979("ۙ۬") ^ i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i11 = ((iM559711 ^ i20) * 9823) ^ (-1733428017);
                        i12 = 615728203;
                    }
                    int i42 = iM559711 ^ i12;
                    sArr6 = sArr13;
                    i28 = i39;
                    strM56235 = str5;
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
                    strM56235 = strM56235;
                    c16496 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (C19850.m45097()) {
                        iM559710 = (C0873.m55680("᩸ܳ") ^ i19) * 75;
                        i5 = ((iM559710 ^ i20) * 25129) ^ (-628648574);
                        i6 = -444885861;
                    } else {
                        iM559710 = (C0946.m55979("ۙۨ") ^ i20) * 79;
                        i5 = ((iM559710 ^ i19) * (-5525)) ^ 1439744409;
                        i6 = -2073137863;
                    }
                    int i310 = iM559710 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i310;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    c16497 = c16496;
                    i30 = i30;
                    break;
                case -704697578:
                case -147930804:
                    i30 = i30;
                    strM56235 = strM56235;
                    sArr5 = sArr8;
                    int i43 = i26;
                    str3 = str4;
                    i13 = i24;
                    int i44 = i25;
                    sArr4 = sArr9;
                    i14 = i44;
                    c20521.m46302(ServiceConnectionC1013.m56152(jSONObject2, C0946.m55986(sArr5, i43, i14, i23)));
                    sArr6 = f82225;
                    i27 = 58;
                    i28 = 8;
                    if (C1048.m56305() >= 0) {
                        i26 = i43;
                        jSONArray2 = jSONArray3;
                        int iM55688 = (i19 - C0873.m55680("ۖ۬")) * (-53);
                        short[] sArr16 = sArr5;
                        str4 = str3;
                        i21 = ((iM55688 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr17 = sArr4;
                        i25 = i14;
                        sArr9 = sArr17;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr16;
                        String str7 = strM56235;
                        i22 = iM55688 ^ 386168927;
                        strM56235 = str7;
                    } else {
                        int iM559715 = (C0946.m55979("۠ۚ") ^ i19) * (-3);
                        str4 = str3;
                        i21 = ((iM559715 ^ i20) * 24111) ^ (-699657345);
                        i30 = i30;
                        i25 = i14;
                        sArr9 = sArr4;
                        i22 = iM559715 ^ 490117541;
                        i24 = i13;
                        sArr8 = sArr5;
                        i26 = i43;
                        strM56235 = strM56235;
                    }
                    break;
                case -667560736:
                case -68632614:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16496 = c16497;
                    String str8 = str4;
                    i28 = i28;
                    sArr6 = sArr6;
                    jSONArray3 = jSONArray3;
                    i25 = i25;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    i24 = i24;
                    String str9 = strM55970;
                    jSONObjectM37420 = jSONObjectM37420;
                    C19850.m45096(c16496.m37421(str8));
                    str4 = str8;
                    strM55970 = str9;
                    c16496.m37417(C0898.m55792(f82225, 46, 5, i23));
                    c16497 = c16496;
                    iM55979 = C0873.m55680("ۨۜ") ^ i19;
                    i3 = ((iM55979 ^ i20) * (-23997)) ^ 979123318;
                    i4 = 682818748;
                    i7 = iM55979 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c16497 = c16497;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -370356145:
                case 628004188:
                    strM56235 = strM56235;
                    int i45 = i27;
                    i8 = i28;
                    short[] sArr18 = sArr6;
                    c20521.m46309(C1964.m56596(jSONObject2, C0930.m55893(sArr18, i45, i8, i23)));
                    String str10 = str4;
                    c20521.m46303(C1929.m56556(jSONObject2, str10));
                    short[] sArr19 = f82225;
                    if (C1929.f83011 != 0) {
                        sArr = sArr18;
                        i27 = i45;
                        str = str10;
                        sArr7 = sArr19;
                        i30 = 66;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM55689 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM55689 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM55689 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        int iM556810 = C0873.m55680("֫᩻") ^ i20;
                        i21 = ((iM556810 ^ i19) * (-12039)) ^ 1319081013;
                        str4 = str10;
                        sArr7 = sArr19;
                        sArr6 = sArr18;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM556810 ^ 224622521;
                        i27 = i45;
                        i30 = 66;
                    }
                    break;
                case -222123401:
                case 1311154431:
                    this.f48624 = arrayList;
                    return;
                case -201872877:
                case 893464147:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46291(C1929.m56556(jSONObject2, strM56180));
                    strM56132 = C1003.m56132(f82225, 99, 4, i23);
                    if (!C1024.f81946) {
                        iM55681 = C0873.m55680("۬۠") ^ i20;
                        i3 = ((iM55681 ^ i19) * 27591) ^ 1182427699;
                        i15 = 767854109;
                        i7 = iM55681 ^ i15;
                        strM56235 = strM56235;
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
                        int iM556811 = (i19 - C0873.m55680("ۖ۬")) * (-53);
                        short[] sArr110 = sArr5;
                        str4 = str3;
                        i21 = ((iM556811 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr111 = sArr4;
                        i25 = i14;
                        sArr9 = sArr111;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr110;
                        String str11 = strM56235;
                        i22 = iM556811 ^ 386168927;
                        strM56235 = str11;
                    }
                    break;
                case -188226540:
                case 1584760982:
                    if (!RunnableC0897.f81856) {
                        strM56235 = strM56235;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM556812 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM556812 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM556812 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        i30 = i30;
                        strM56235 = strM56235;
                        c16496 = c16497;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM55970 = strM55970;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        i24 = i24;
                        jSONObjectM37420 = jSONObjectM37420;
                        str4 = str4;
                        i25 = i25;
                        sArr9 = sArr9;
                        iM559710 = C0873.m55680("᩹۬") ^ i19;
                        i5 = ((iM559710 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                        int i311 = iM559710 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i311;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        c16497 = c16496;
                        i30 = i30;
                    }
                    break;
                case -115885856:
                case 1504214106:
                    if (C0946.m55980() != 0) {
                        i30 = i30;
                        strM56235 = strM56235;
                        sArr5 = sArr8;
                        str3 = str4;
                        i13 = i24;
                        jSONArray2 = jSONArray3;
                        int i47 = i25;
                        sArr4 = sArr9;
                        i14 = i47;
                        int iM556813 = (i19 - C0873.m55680("ۖ۬")) * (-53);
                        short[] sArr112 = sArr5;
                        str4 = str3;
                        i21 = ((iM556813 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr113 = sArr4;
                        i25 = i14;
                        sArr9 = sArr113;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr112;
                        String str12 = strM56235;
                        i22 = iM556813 ^ 386168927;
                        strM56235 = str12;
                    } else {
                        iM55683 = (C0946.m55979("ܽᩴ") ^ i19) * 37;
                        i17 = ((iM55683 ^ i20) * 26507) ^ (-366284555);
                        i18 = -603260817;
                        i22 = iM55683 ^ i18;
                        i21 = i17;
                    }
                    break;
                case -110566251:
                case 1278121668:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46286(jSONObject2.getBoolean(strM56132));
                    iM56152 = ServiceConnectionC1013.m56152(jSONObject2, C1071.m56336(f82225, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 5, i23));
                    if (C0992.f81922 >= 0) {
                        iM55681 = C0873.m55680("ᩴۙ") ^ i20;
                        i3 = ((iM55681 ^ i19) * (-10769)) ^ 578349426;
                        i15 = 786757357;
                    } else {
                        iM55681 = C0946.m55979("᩻ܽ") ^ i20;
                        i3 = ((iM55681 ^ i19) * 31351) ^ (-95576559);
                        i15 = 1811138628;
                    }
                    i7 = iM55681 ^ i15;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case -108802822:
                case 724107093:
                    i30 = i30;
                    strM56235 = C1028.m56235(f82225, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 13, i23);
                    if (jSONObject2.has(strM56235)) {
                        iM55682 = (C0873.m55680("ܿ۬") ^ i20) * 3;
                        i3 = ((iM55682 ^ i19) * (-31393)) ^ (-1144329545);
                        i16 = -2050986972;
                    } else {
                        iM55682 = C0873.m55680("ۜۚ") ^ i20;
                        i3 = ((iM55682 ^ i19) * (-4279)) ^ (-438114847);
                        i16 = 1131310409;
                    }
                    i22 = iM55682 ^ i16;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 71918815:
                case 1640692324:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46299(C1929.m56556(jSONObject2, strM55717));
                    iM55681 = (i19 - C0946.m55979("ۡ۫")) * 69;
                    i3 = ((iM55681 ^ i20) * (-10117)) ^ 1617474027;
                    i15 = -997679244;
                    i7 = iM55681 ^ i15;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 169490891:
                case 1539562674:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46308(iM56152);
                    strM55717 = C0882.m55717(f82225, 108, 9, i23);
                    if (jSONObject2.has(strM55717)) {
                        iM55681 = C0873.m55680("᩶᩶") ^ i19;
                        i3 = ((iM55681 ^ i20) * (-27807)) ^ (-245385151);
                        i15 = -1929472781;
                    } else {
                        iM55681 = (i19 - C0946.m55979("ۡ۫")) * 69;
                        i3 = ((iM55681 ^ i20) * (-10117)) ^ 1617474027;
                        i15 = -997679244;
                    }
                    i7 = iM55681 ^ i15;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                case 278812512:
                case 369626333:
                    throw new Exception(c16497.m37418());
                case 376571572:
                case 1304682935:
                    i30 = i30;
                    strM56235 = strM56235;
                    c20521.m46305(C1044.m56279(jSONObject2, C0992.m56102(sArr9, i24, 11, i23)));
                    strM56180 = RunnableC1014.m56180(f82225, 88, 11, i23);
                    if (!C0917.f81868) {
                        iM55681 = C0946.m55979("ۗ᩶") ^ i19;
                        i3 = ((iM55681 ^ i20) * 9009) ^ (-344039627);
                        i15 = -663297925;
                        i7 = iM55681 ^ i15;
                        strM56235 = strM56235;
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
                        int iM556814 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM556814 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM556814 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    }
                    break;
                case 629775181:
                case 898966531:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16496 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    C19850.m45094(true);
                    C19850.m45092(c16496.m37421(C1194.m56386(f82225, 41, 5, i23)));
                    if (C1046.m56302() != 0) {
                        iM559710 = C0873.m55680("᩹۬") ^ i19;
                        i5 = ((iM559710 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                    } else {
                        iM559710 = (i20 - C0873.m55680("ۢ֫")) * 27;
                        i5 = ((iM559710 ^ i19) * (-16643)) ^ 427005077;
                        i6 = -1952889940;
                    }
                    int i312 = iM559710 ^ i6;
                    i24 = i24;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i312;
                    i21 = i5;
                    sArr9 = sArr9;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    c16497 = c16496;
                    i30 = i30;
                    break;
                case 782489979:
                case 2092668483:
                    i30 = i30;
                    sArr4 = sArr9;
                    i13 = i24;
                    strM56235 = strM56235;
                    jSONArray2 = jSONArray3;
                    str3 = str4;
                    int i48 = i27;
                    int i49 = i28;
                    short[] sArr20 = sArr6;
                    jSONObject2 = jSONArray2.getJSONObject(i31);
                    c20521 = new C20521();
                    c20521.m46297(C19850.m45095());
                    short[] sArr21 = f82225;
                    i26 = 55;
                    if (!C1024.f81946) {
                        int iM556815 = C0873.m55680("ۘܰ") ^ i20;
                        i27 = i48;
                        i3 = ((iM556815 ^ i19) * 6527) ^ 1589773828;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr6 = sArr20;
                        sArr8 = sArr21;
                        i28 = i49;
                        sArr9 = sArr4;
                        strM56235 = strM56235;
                        i25 = 3;
                        i22 = iM556815 ^ (-1765484615);
                        str4 = str3;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        i27 = i48;
                        sArr5 = sArr21;
                        sArr6 = sArr20;
                        i14 = 3;
                        i28 = i49;
                        int iM556816 = (i19 - C0873.m55680("ۖ۬")) * (-53);
                        short[] sArr114 = sArr5;
                        str4 = str3;
                        i21 = ((iM556816 ^ i20) * 1113) ^ 1326939252;
                        i30 = i30;
                        short[] sArr115 = sArr4;
                        i25 = i14;
                        sArr9 = sArr115;
                        jSONArray3 = jSONArray2;
                        i24 = i13;
                        sArr8 = sArr114;
                        String str13 = strM56235;
                        i22 = iM556816 ^ 386168927;
                        strM56235 = str13;
                    }
                    break;
                case 789996423:
                case 800096755:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16497 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    s = f82225[20];
                    s2 = 39286;
                    if (C1229.f82066 < 0) {
                        iM55979 = (C0946.m55979("ۘᩴ") ^ i19) * (-55);
                        i3 = ((iM55979 ^ i20) * 13577) ^ 159992467;
                        i4 = -1950557468;
                        i7 = iM55979 ^ i4;
                        sArr9 = sArr9;
                        i24 = i24;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        c16497 = c16497;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        sArr9 = sArr9;
                        i24 = i24;
                        int iM559716 = C0946.m55979("ᩳۤ") ^ i20;
                        i3 = ((iM559716 ^ i19) * 6677) ^ 777868250;
                        i7 = iM559716 ^ 849139634;
                        sArr8 = sArr8;
                        i25 = i25;
                        jSONArray3 = jSONArray3;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        sArr6 = sArr6;
                        c16497 = c16497;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    }
                    break;
                case 1077415079:
                case 1863796262:
                    if (C0898.f81858 <= 0) {
                        i30 = i30;
                        strM56235 = strM56235;
                        iM55681 = C0873.m55680("ᩴۙ") ^ i20;
                        i3 = ((iM55681 ^ i19) * (-10769)) ^ 578349426;
                        i15 = 786757357;
                        i7 = iM55681 ^ i15;
                        strM56235 = strM56235;
                        i22 = i7;
                        i21 = i3;
                        i30 = i30;
                    } else {
                        strM56235 = strM56235;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM556817 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM556817 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM556817 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    }
                    break;
                case 1292531603:
                case 1400185038:
                    if (C1046.f81962 <= 0) {
                        iM55683 = C0873.m55680("ۘᩳ") ^ i20;
                        i17 = ((iM55683 ^ i19) * 23199) ^ (-1865746555);
                        i18 = -1728209962;
                        i22 = iM55683 ^ i18;
                        i21 = i17;
                    } else {
                        i30 = i30;
                        strM56235 = strM56235;
                        c16496 = c16497;
                        i28 = i28;
                        sArr6 = sArr6;
                        strM55970 = strM55970;
                        jSONArray3 = jSONArray3;
                        sArr8 = sArr8;
                        i24 = i24;
                        jSONObjectM37420 = jSONObjectM37420;
                        str4 = str4;
                        i25 = i25;
                        sArr9 = sArr9;
                        iM559710 = C0873.m55680("᩹۬") ^ i19;
                        i5 = ((iM559710 ^ i20) * 25639) ^ (-1365448834);
                        i6 = -1391716509;
                        int i313 = iM559710 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i313;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        c16497 = c16496;
                        i30 = i30;
                    }
                    break;
                case 1326252453:
                case 2023573542:
                    C1025.m56230();
                    if (C1003.m56123() == 0) {
                        strM56235 = strM56235;
                        str = str4;
                        i8 = i28;
                        sArr = sArr6;
                        sArr2 = sArr9;
                        i9 = i24;
                        int iM556818 = C0873.m55680("ᩴۧ") ^ i20;
                        i10 = i25;
                        str4 = str;
                        i21 = ((iM556818 ^ i19) * (-30545)) ^ (-457005307);
                        i24 = i9;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr;
                        i28 = i8;
                        strM56235 = strM56235;
                        i22 = iM556818 ^ 40441380;
                        sArr9 = sArr2;
                        i25 = i10;
                    } else {
                        iM55683 = C0873.m55680("֨ۤ") ^ i19;
                        i17 = ((iM55683 ^ i20) * (-14707)) ^ (-667826659);
                        i18 = 1229037866;
                        i22 = iM55683 ^ i18;
                        i21 = i17;
                    }
                    break;
                case 1355448664:
                case 1669390714:
                    C0845.m55584();
                    if (C0845.f81821 >= 0) {
                        iM55683 = (C0946.m55979("ܽᩴ") ^ i19) * 37;
                        i17 = ((iM55683 ^ i20) * 26507) ^ (-366284555);
                        i18 = -603260817;
                    } else {
                        iM55683 = C0873.m55680("֨ۤ") ^ i19;
                        i17 = ((iM55683 ^ i20) * (-14707)) ^ (-667826659);
                        i18 = 1229037866;
                    }
                    i22 = iM55683 ^ i18;
                    i21 = i17;
                    break;
                case 1402348340:
                case 1653101031:
                    i30 = i30;
                    strM56235 = strM56235;
                    c16496 = c16497;
                    i28 = i28;
                    sArr6 = sArr6;
                    strM55970 = strM55970;
                    jSONArray3 = jSONArray3;
                    sArr8 = sArr8;
                    i24 = i24;
                    jSONObjectM37420 = jSONObjectM37420;
                    str4 = str4;
                    i25 = i25;
                    sArr9 = sArr9;
                    if (c16496.m37414() != 1000) {
                        iM559710 = C0873.m55680("᩹ۢ") ^ i19;
                        i5 = ((iM559710 ^ i20) * (-22231)) ^ (-765912874);
                        i6 = -79948029;
                        int i314 = iM559710 ^ i6;
                        i24 = i24;
                        sArr8 = sArr8;
                        jSONArray3 = jSONArray3;
                        sArr6 = sArr6;
                        i28 = i28;
                        strM56235 = strM56235;
                        i22 = i314;
                        i21 = i5;
                        sArr9 = sArr9;
                        i25 = i25;
                        str4 = str4;
                        jSONObjectM37420 = jSONObjectM37420;
                        strM55970 = strM55970;
                        c16497 = c16496;
                        i30 = i30;
                    }
                    c16497 = c16496;
                    iM55979 = C0873.m55680("ۨۜ") ^ i19;
                    i3 = ((iM55979 ^ i20) * (-23997)) ^ 979123318;
                    i4 = 682818748;
                    i7 = iM55979 ^ i4;
                    sArr9 = sArr9;
                    i24 = i24;
                    i25 = i25;
                    str4 = str4;
                    jSONObjectM37420 = jSONObjectM37420;
                    strM55970 = strM55970;
                    sArr8 = sArr8;
                    jSONArray3 = jSONArray3;
                    c16497 = c16497;
                    sArr6 = sArr6;
                    i28 = i28;
                    strM56235 = strM56235;
                    i22 = i7;
                    i21 = i3;
                    i30 = i30;
                    break;
                default:
                    int i50 = i30;
                    String str14 = strM56235;
                    String str15 = strM55970;
                    int i51 = i28;
                    short[] sArr22 = sArr6;
                    JSONObject jSONObject5 = jSONObjectM37420;
                    JSONArray jSONArray6 = jSONArray3;
                    short[] sArr23 = sArr8;
                    String str16 = str4;
                    int i52 = i24;
                    int i53 = i25;
                    short[] sArr24 = sArr9;
                    C16496 c16496M40509 = C17837.m40509();
                    if (c16496M40509.m37422()) {
                        iM55680 = C0873.m55680("ܶۙ") ^ i19;
                        i = ((iM55680 ^ i20) * 8389) ^ 395424755;
                        i2 = -927048327;
                    } else {
                        iM55680 = (C0873.m55680("ܳ۠") ^ i20) * (-93);
                        i = ((iM55680 ^ i19) * 22843) ^ 340023806;
                        i2 = 1048053204;
                    }
                    int i54 = iM55680 ^ i2;
                    i24 = i52;
                    sArr8 = sArr23;
                    jSONArray3 = jSONArray6;
                    sArr6 = sArr22;
                    i28 = i51;
                    strM56235 = str14;
                    i22 = i54;
                    i30 = i50;
                    c16497 = c16496M40509;
                    i21 = i;
                    sArr9 = sArr24;
                    i25 = i53;
                    str4 = str16;
                    jSONObjectM37420 = jSONObject5;
                    strM55970 = str15;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55979;
        int i;
        String strM55635;
        TextView textView;
        int iM559710;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM559711;
        int i7;
        int i8;
        int i9;
        int iM559712;
        int i10;
        int i11;
        short[] sArr;
        int iM55680;
        int i12;
        int i13;
        int iM55681;
        int i14;
        this = this;
        int i15 = C0866.f81837;
        int i16 = C1071.f81975;
        int iM55682 = C0873.m55680("ۢ֨") ^ i15;
        int i17 = ((iM55682 ^ i16) * (-10343)) ^ 1235784193;
        C20671 c20671 = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterface.OnClickListener onClickListener2 = null;
        String str = null;
        String strM55783 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i18 = iM55682 ^ 957456086;
        ActivityC18153 activityC18153 = null;
        int iM559713 = 0;
        int iM55683 = 0;
        int iM55684 = 0;
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
                    iM55683 = 2127295042 ^ C0873.m55680(C1124.m56373(sArr4, 10, 3, i19));
                    if (!C0949.m56012()) {
                        iM55681 = C0873.m55680("ۧۤ") ^ i15;
                        i12 = ((iM55681 ^ i16) * (-29895)) ^ (-949338054);
                        i14 = -1183769850;
                        i18 = iM55681 ^ i14;
                        i17 = i12;
                    }
                    i11 = i24;
                    sArr = sArr2;
                    iM55680 = C0946.m55979("᩹۟") ^ i16;
                    i12 = ((iM55680 ^ i15) * (-4657)) ^ 604634992;
                    i13 = 154134721;
                    int i25 = iM55680 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i25;
                    i17 = i12;
                    break;
                case -1994823673:
                case -606458706:
                    C1012.m56146(c20671, C0946.m55979(strM55783) ^ 2101917832);
                    sArr3 = f82225;
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55681 = C0873.m55680("۠᩷") ^ i16;
                        i12 = ((iM55681 ^ i15) * 29329) ^ (-5581843);
                        i14 = -1277280348;
                        i18 = iM55681 ^ i14;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM55635 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM559714 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559714 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM559714 ^ (-986072977);
                        this = this;
                    }
                    break;
                case -1888791711:
                case -1495575940:
                    i6 = i24;
                    int i26 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(activityC18153);
                    sArr2 = f82225;
                    if (C0866.f81837 >= 0) {
                        iM559712 = C0873.m55680("֫֨") ^ i16;
                        i7 = ((iM559712 ^ i15) * (-27427)) ^ 206883318;
                        i10 = 1893453619;
                    } else {
                        iM559712 = C0946.m55979("۬۠") ^ i16;
                        i7 = ((iM559712 ^ i15) * (-3901)) ^ 1123147196;
                        i10 = -1330516238;
                    }
                    i9 = iM559712 ^ i10;
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
                    C0873.m55684(textView3, C0946.m55979(str) ^ 2129535267);
                    if (C19850.m45097()) {
                        iM559711 = (C0946.m55979("ۘۤ") + i16) * (-83);
                        i7 = ((iM559711 ^ i15) * (-12617)) ^ (-1893349165);
                        i8 = -438290032;
                    } else {
                        iM559711 = C0946.m55979("ۘۖ") ^ i15;
                        i7 = ((iM559711 ^ i16) * (-15827)) ^ (-764694620);
                        i8 = 1346953116;
                    }
                    i9 = iM559711 ^ i8;
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
                    iM55979 = (C0873.m55680("ܽۘ") ^ i15) * (-97);
                    i17 = ((iM55979 ^ i16) * 12061) ^ 175522351;
                    i = -1188939259;
                    i4 = iM55979 ^ i;
                    sArr2 = sArr2;
                    i24 = i24;
                    i18 = i4;
                    textView2 = textView2;
                    this = this;
                    break;
                case -1792017588:
                case -1761546506:
                    ActivityC18153.m41335(activityC18153, i24, new RunnableC2474(this));
                    break;
                case -1788539149:
                case 1469723530:
                    iM559713 = 2100015503 ^ C0946.m55979(C1028.m56235(sArr3, 7, 3, i19));
                    if (C0967.f81910 >= 0) {
                        iM55681 = C0946.m55979("֨᩻") ^ i15;
                        i12 = ((iM55681 ^ i16) * 15425) ^ (-437656679);
                        i14 = -320934575;
                    } else {
                        iM55681 = (i15 - C0873.m55680("۟۠")) * (-23);
                        i12 = ((iM55681 ^ i16) * (-1981)) ^ 1663778978;
                        i14 = -1476092877;
                    }
                    i18 = iM55681 ^ i14;
                    i17 = i12;
                    break;
                case -1777668794:
                case 1297541791:
                    i11 = i24;
                    sArr = sArr2;
                    strM55783 = RunnableC0897.m55783(sArr, 4, 3, i19);
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("᩹۟") ^ i16;
                        i12 = ((iM55680 ^ i15) * (-4657)) ^ 604634992;
                        i13 = 154134721;
                    } else {
                        iM55680 = C0873.m55680("᩻᩶") ^ i15;
                        i12 = ((iM55680 ^ i16) * (-25719)) ^ 1281203441;
                        i13 = 83506678;
                    }
                    int i27 = iM55680 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i27;
                    i17 = i12;
                    break;
                case -1135175374:
                case -586081264:
                    C1124.m56374(c20671, iM55684, onClickListener2);
                    c20671.m46713(new DialogInterface.OnCancelListener() { // from class: l.۠֫᩷
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C16556 c16556 = null;
                            int i28 = -954854775;
                            int i29 = C1028.f81950;
                            int i30 = RunnableC0938.f81886;
                            int iM559715 = (C0946.m55979("ᩴۘ") ^ i30) * 85;
                            int i31 = ((iM559715 ^ i29) * (-4337)) ^ (-752898226);
                            int i32 = 350771844;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-30975)) >> 31) & i31) ^ (iM559715 ^ i32);
                                switch (i28) {
                                    case -2089669565:
                                    case -2001006239:
                                        C0955.m56027(c16556.f48625);
                                        break;
                                    case -1668988456:
                                    case 1238281516:
                                        c16556 = this.f27330;
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559715 = (C0946.m55979("᩷᩺") + i29) * 127;
                                            i31 = ((iM559715 ^ i30) * 19963) ^ (-694867112);
                                            i32 = 636397604;
                                        } else {
                                            iM559715 = (C0873.m55680("۟ۖ") ^ i29) * (-23);
                                            i31 = ((iM559715 ^ i30) * (-13885)) ^ (-1165406246);
                                            i32 = 1254676451;
                                        }
                                        break;
                                    case -1628207510:
                                    case -1473289456:
                                        if (C1028.f81950 > 0) {
                                            iM559715 = C0873.m55680("ܳ۫") ^ i29;
                                            i31 = ((iM559715 ^ i30) * (-21495)) ^ 1299000164;
                                            i32 = 1591316051;
                                        } else {
                                            iM559715 = C0946.m55979("ۨ֡") ^ i29;
                                            i31 = ((iM559715 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        }
                                        break;
                                    case -1596511700:
                                    case 1521172189:
                                        C1028.m56247();
                                        break;
                                    case -1481472206:
                                    case -67165412:
                                        if (C0882.f81846) {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM559715 = C0873.m55680("֡֫") ^ i30;
                                            i31 = ((iM559715 ^ i29) * (-20977)) ^ 161688735;
                                            i32 = 224799448;
                                        }
                                        break;
                                    case -1445878394:
                                    case 2116788736:
                                        if (C0992.f81922 >= 0) {
                                            iM559715 = (C0946.m55979("᩷᩺") + i29) * 127;
                                            i31 = ((iM559715 ^ i30) * 19963) ^ (-694867112);
                                            i32 = 636397604;
                                        } else {
                                            iM559715 = C0946.m55979("ܳ᩷") ^ i29;
                                            i31 = ((iM559715 ^ i30) * 1799) ^ 1936020265;
                                            i32 = 1716106077;
                                        }
                                        break;
                                    case -1202420425:
                                    case 1756354867:
                                        if (C0861.f81831) {
                                            iM559715 = (i30 - C0946.m55979("۫ۛ")) * (-45);
                                            i31 = ((iM559715 ^ i29) * 10033) ^ 128564085;
                                            i32 = -1595437134;
                                        } else {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        }
                                        break;
                                    case -1147886746:
                                    case 1196627259:
                                        if (C0898.m55800() <= 0) {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM559715 = (i29 - C0946.m55979("ܳۛ")) * 73;
                                            i31 = ((iM559715 ^ i30) * (-31595)) ^ 1429569887;
                                            i32 = -337595342;
                                        }
                                        break;
                                    case -925000555:
                                    case 1829588627:
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM559715 = C0873.m55680("֨ۡ") ^ i30;
                                            i31 = ((iM559715 ^ i29) * 28601) ^ (-767436550);
                                            i32 = -1794276878;
                                        }
                                        break;
                                    case -153190587:
                                    case 939532462:
                                        C0845.m55584();
                                        if (!C1025.m56230()) {
                                            iM559715 = C0946.m55979("ۨ֡") ^ i29;
                                            i31 = ((iM559715 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        } else {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        }
                                        break;
                                    case 9437724:
                                    case 677945560:
                                        if (C0937.f81884) {
                                            iM559715 = C0946.m55979("ܶۛ") ^ i29;
                                            i31 = ((iM559715 ^ i30) * (-21053)) ^ 620584502;
                                            i32 = 130753755;
                                        } else {
                                            iM559715 = C0873.m55680("֡۫") ^ i30;
                                            i31 = ((iM559715 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        }
                                        break;
                                    case 268719074:
                                    case 578937884:
                                        if (!C0866.m55645()) {
                                            iM559715 = C0946.m55979("ۨ֡") ^ i29;
                                            i31 = ((iM559715 ^ i30) * 7697) ^ 1991798649;
                                            i32 = 1459931616;
                                        } else {
                                            iM559715 = C0873.m55680("֡۫") ^ i30;
                                            i31 = ((iM559715 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        }
                                        break;
                                    case 457548307:
                                    case 1628605019:
                                        if (C0955.f81898) {
                                            iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                            i32 = -394407193;
                                        } else {
                                            iM559715 = (C0873.m55680("ܶۢ") ^ i30) * (-83);
                                            i31 = ((iM559715 ^ i29) * 32347) ^ (-1628217708);
                                            i32 = -200836235;
                                        }
                                        break;
                                    case 836590268:
                                    case 2024919571:
                                        C0861.m55626();
                                        iM559715 = (C0873.m55680("ۧܿ") + i30) * (-83);
                                        i31 = ((iM559715 ^ i29) * 7155) ^ 188813404;
                                        i32 = -394407193;
                                        break;
                                    case 1613113089:
                                    case 2068060130:
                                        if (C0989.f81920 >= 0) {
                                            iM559715 = C0873.m55680("֡۫") ^ i30;
                                            i31 = ((iM559715 ^ i29) * 22237) ^ (-1039158517);
                                            i32 = 969673040;
                                        } else {
                                            iM559715 = C0873.m55680("ܶܶ") ^ i29;
                                            i31 = ((iM559715 ^ i30) * 24611) ^ 313771787;
                                            i32 = 198500534;
                                        }
                                        break;
                                    default:
                                        if (C1017.f81942 >= 0) {
                                            iM559715 = C0873.m55680("ܳ۫") ^ i29;
                                            i31 = ((iM559715 ^ i30) * (-21495)) ^ 1299000164;
                                            i32 = 1591316051;
                                        } else {
                                            iM559715 = C0946.m55979("֨᩸") ^ i30;
                                            i31 = ((iM559715 ^ i29) * (-4741)) ^ (-1544229789);
                                            i32 = 942846844;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    RunnableC0871.m55669(c20671);
                    break;
                case -935075979:
                case 1541642945:
                    C0937.m55908(c20671, iM559713);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۚ֫᩷

                        /* JADX INFO: renamed from: ܺᩴ֨, reason: not valid java name and contains not printable characters */
                        private static final short[] f81987 = {5811, 14212, -7974, 13958, -1529, 2867, 13680};

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
                            int iM559715;
                            int i29;
                            int i30;
                            short[] sArr7;
                            int iM559716;
                            int i31;
                            int i32 = RunnableC1014.f81941;
                            int i33 = C1071.f81975;
                            int iM55685 = C0873.m55680("֡ۗ") ^ i33;
                            int i34 = ((iM55685 ^ i32) * 1619) ^ (-1061723711);
                            String strM53859 = null;
                            short[] sArr8 = null;
                            short[] sArr9 = null;
                            short[] sArr10 = null;
                            int i35 = iM55685 ^ (-486512305);
                            C23263 c23263 = null;
                            int iM559717 = 0;
                            int iM55686 = 0;
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
                                        C0989.m56095();
                                        if (C0946.f81894 == 0) {
                                            iM559715 = (C0946.m55979("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM559715 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                            i35 = iM559715 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM559716 ^ i31;
                                        }
                                        break;
                                    case -1376718120:
                                    case 532506818:
                                        ServiceConnectionC1013.m56157();
                                        C1017.m56187();
                                        sArr7 = sArr8;
                                        iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                        sArr8 = sArr7;
                                        i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                        i31 = -1798210358;
                                        i35 = iM559716 ^ i31;
                                        break;
                                    case -1342450170:
                                    case 1194305636:
                                        c23263.m33344(iM559717);
                                        sArr10 = f81987;
                                        i41 = 4;
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM559715 = C0946.m55979("᩵᩵") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM559715 = C0873.m55680("֨֡") ^ i32;
                                            i29 = ((iM559715 ^ i33) * (-10051)) ^ 1538290613;
                                            i30 = -1741076008;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -1198955331:
                                    case -557920953:
                                        c23263.m33342(iM55686 ^ i36);
                                        strM53859 = C24414.m53859();
                                        if (C0967.f81910 >= 0) {
                                            iM559715 = (C0946.m55979("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM559715 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM559715 = (C0946.m55979("֡᩵") + i32) * 49;
                                            i29 = ((iM559715 ^ i33) * (-29739)) ^ 641817789;
                                            i30 = -1689950214;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -1059144094:
                                    case 1429300350:
                                        ActivityC18153 activityC18154 = this.f18719.f48625;
                                        boolean z = ActivityC18153.f54185;
                                        C23263 c23264 = new C23263(activityC18154, activityC18154);
                                        if (C0992.m56107() <= 0) {
                                            sArr7 = sArr8;
                                            c23263 = c23264;
                                            iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM559716 ^ i31;
                                        } else {
                                            int iM55687 = (C0873.m55680("ܳ᩵") + i32) * 21;
                                            i34 = ((iM55687 ^ i33) * (-27701)) ^ 1851636395;
                                            i35 = iM55687 ^ 944403113;
                                            c23263 = c23264;
                                        }
                                        break;
                                    case -977599783:
                                    case 206709817:
                                        sArr7 = f81987;
                                        if (C1028.f81950 <= 0) {
                                            iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                        } else {
                                            iM559716 = C0946.m55979("ۡ֫") ^ i33;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i32) * 11359) ^ (-278728039);
                                            i31 = 1803480834;
                                        }
                                        i35 = iM559716 ^ i31;
                                        break;
                                    case -952651097:
                                    case 1053536941:
                                        C0927.m55873();
                                        if (C1028.m56247() < 0) {
                                            iM559715 = (C0946.m55979("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM559715 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM559715 = C0873.m55680("ܶ۠") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 9057) ^ (-1117752086);
                                            i30 = -1921132754;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case -319720175:
                                    case -180843993:
                                        C0930.m55885();
                                        break;
                                    case -284393780:
                                    case 1705302226:
                                        i38 = 19488;
                                        iM559715 = C0946.m55979("֡ۧ") ^ i32;
                                        i29 = ((iM559715 ^ i33) * 25527) ^ 461121729;
                                        i30 = 886774965;
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 301595138:
                                    case 2108750056:
                                        iM559717 = 2119921790 ^ C0946.m55979(RunnableC0938.m55936(sArr9, i39, i40, i38));
                                        if (C0863.f81833 <= 0) {
                                            iM559715 = C0946.m55979("᩵᩵") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM559715 = C0946.m55979("۬ۢ") ^ i33;
                                            i29 = ((iM559715 ^ i32) * (-26951)) ^ 1108524513;
                                            i30 = -1992239696;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 368591362:
                                    case 1177340045:
                                        i37 = (s2 * s2) + 155077209;
                                        if (C0912.m55833()) {
                                            iM559715 = C0946.m55979("᩵᩵") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 25013) ^ (-25644916);
                                            i30 = 517140024;
                                        } else {
                                            iM559715 = C0873.m55680("ܽᩴ") ^ i33;
                                            i29 = ((iM559715 ^ i32) * (-30213)) ^ (-634555045);
                                            i30 = 1354264590;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 562402096:
                                    case 807218130:
                                        sArr9 = f81987;
                                        i39 = 1;
                                        i40 = 3;
                                        if (C1012.m56134() <= 0) {
                                            iM559715 = C0873.m55680("ܶ۠") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 9057) ^ (-1117752086);
                                            i30 = -1921132754;
                                        } else {
                                            iM559715 = (i33 - C0946.m55979("ᩳۡ")) * (-3);
                                            i29 = ((iM559715 ^ i32) * 5843) ^ 647095983;
                                            i30 = -161026878;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 626176811:
                                    case 1704555699:
                                        c23263.m33336((CharSequence) strM53859);
                                        c23263.m33330();
                                        c23263.m33365(6);
                                        if (C1028.m56247() >= 0) {
                                            iM559715 = (C0946.m55979("֫ۖ") ^ i32) * 15;
                                            i29 = ((iM559715 ^ i33) * 16219) ^ (-968610876);
                                            i30 = -1560256520;
                                        } else {
                                            iM559715 = C0873.m55680("᩵۠") ^ i33;
                                            i29 = ((iM559715 ^ i32) * (-30813)) ^ (-412249247);
                                            i30 = 341921166;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 660333736:
                                    case 1304816424:
                                        s2 = sArr8[0];
                                        if (C0912.f81867 > 0) {
                                            iM559715 = C0946.m55979("ۙ۫") ^ i32;
                                            i29 = ((iM559715 ^ i33) * 8995) ^ (-1119360142);
                                            i30 = 667344402;
                                            i35 = iM559715 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM559716 ^ i31;
                                        }
                                        break;
                                    case 764897875:
                                    case 1213375866:
                                        i38 = 25837;
                                        iM559715 = C0946.m55979("֡ۧ") ^ i32;
                                        i29 = ((iM559715 ^ i33) * 25527) ^ 461121729;
                                        i30 = 886774965;
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    case 853125189:
                                    case 1099151830:
                                        c23263.m33367();
                                        c23263.m33352(true);
                                        break;
                                    case 946503256:
                                    case 1691627557:
                                        C0946.m55980();
                                        if (C1124.m56367() >= 0) {
                                            iM559715 = C0873.m55680("ۢ֫") ^ i32;
                                            i29 = ((iM559715 ^ i33) * (-22881)) ^ 1923370518;
                                            i30 = -1495423997;
                                            i35 = iM559715 ^ i30;
                                            i34 = i29;
                                        } else {
                                            sArr7 = sArr8;
                                            iM559716 = C0946.m55979("᩷ۗ") ^ i32;
                                            sArr8 = sArr7;
                                            i34 = ((iM559716 ^ i33) * (-3321)) ^ (-553832691);
                                            i31 = -1798210358;
                                            i35 = iM559716 ^ i31;
                                        }
                                        break;
                                    case 1971622428:
                                    case 1979929625:
                                        if (i37 - (s2 * 24906) >= 0) {
                                            iM559715 = (C0946.m55979("ۧ᩺") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i29 = ((iM559715 ^ i33) * (-15847)) ^ 907449195;
                                            i30 = 762069288;
                                        } else {
                                            iM559715 = C0873.m55680("᩷ᩴ") ^ i33;
                                            i29 = ((iM559715 ^ i32) * 30357) ^ (-256442002);
                                            i30 = -910889263;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                    default:
                                        iM55686 = C0873.m55680(C0877.m55707(sArr10, i41, 3, i38));
                                        i36 = 2104519596;
                                        if (C0946.f81894 != 0) {
                                            iM559715 = C0873.m55680("ۢ֫") ^ i32;
                                            i29 = ((iM559715 ^ i33) * (-22881)) ^ 1923370518;
                                            i30 = -1495423997;
                                        } else {
                                            iM559715 = (i33 - C0946.m55979("᩹᩸")) * (-61);
                                            i29 = ((iM559715 ^ i32) * 7351) ^ 1461831416;
                                            i30 = 414911460;
                                        }
                                        i35 = iM559715 ^ i30;
                                        i34 = i29;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr4 = f82225;
                    if (C1044.f81959 >= 0) {
                        iM55681 = C0873.m55680("᩺ܺ") ^ i15;
                        i12 = ((iM55681 ^ i16) * (-9513)) ^ (-528077923);
                        i14 = -354301241;
                    } else {
                        iM55681 = (i16 - C0873.m55680("ۤۙ")) * 17;
                        i12 = ((iM55681 ^ i15) * 13995) ^ (-1988314196);
                        i14 = 436352323;
                    }
                    i18 = iM55681 ^ i14;
                    i17 = i12;
                    break;
                case -719375975:
                case 1908234062:
                    break;
                case -654519288:
                case 872247937:
                    C1964.m56597();
                    if (C0992.m56107() <= 0) {
                        i11 = i24;
                        sArr = sArr2;
                        iM55680 = C0946.m55979("᩹۟") ^ i16;
                        i12 = ((iM55680 ^ i15) * (-4657)) ^ 604634992;
                        i13 = 154134721;
                        int i28 = iM55680 ^ i13;
                        sArr2 = sArr;
                        i24 = i11;
                        i18 = i28;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM55635 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM559715 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559715 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM559715 ^ (-986072977);
                        this = this;
                    }
                    break;
                case -627856725:
                case 463989689:
                    i19 = 16918;
                    iM55979 = (C0873.m55680("ܽۘ") ^ i15) * (-97);
                    i17 = ((iM55979 ^ i16) * 12061) ^ 175522351;
                    i = -1188939259;
                    i4 = iM55979 ^ i;
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
                    s = f82225[0];
                    i21 = s * s;
                    i22 = 4511376;
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0946.m55979("᩶ܶ") + i16) * (-55);
                        i17 = ((iM55979 ^ i15) * (-1385)) ^ (-91633253);
                        i = 1521235404;
                        i4 = iM55979 ^ i;
                        sArr2 = sArr2;
                        i24 = i24;
                        i18 = i4;
                        textView2 = textView2;
                        this = this;
                    } else {
                        strM55635 = str;
                        textView = textView2;
                        int iM559716 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559716 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM559716 ^ (-986072977);
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
                        iM559710 = C0946.m55979("۫ܶ") ^ i16;
                        i2 = ((iM559710 ^ i15) * (-17935)) ^ (-310564173);
                        i3 = -1305739581;
                    } else {
                        iM559710 = C0946.m55979("ۜ᩷") ^ i15;
                        i2 = ((iM559710 ^ i16) * (-497)) ^ (-1372969798);
                        i3 = -997961055;
                    }
                    i4 = iM559710 ^ i3;
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
                    C0947.m55997();
                    ServiceConnectionC1013.m56157();
                    break;
                case 798428551:
                case 1292445500:
                    C0861.m55626();
                    C0967.m56074();
                    i24 = i24;
                    strM55635 = str;
                    textView = textView2;
                    sArr2 = sArr2;
                    int iM559717 = C0946.m55979("֡ۛ") ^ i15;
                    sArr2 = sArr2;
                    textView2 = textView;
                    str = strM55635;
                    i17 = ((iM559717 ^ i16) * (-16631)) ^ 1384630101;
                    i24 = i24;
                    i18 = iM559717 ^ (-986072977);
                    this = this;
                    break;
                case 901882052:
                case 1369986716:
                    if (C0873.f81841 > 0) {
                        i6 = i24;
                        iM559712 = C0873.m55680("֫֨") ^ i16;
                        i7 = ((iM559712 ^ i15) * (-27427)) ^ 206883318;
                        i10 = 1893453619;
                        i9 = iM559712 ^ i10;
                        i5 = i6;
                        i18 = i9;
                        i17 = i7;
                        i24 = i5;
                    } else {
                        i24 = i24;
                        strM55635 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM559718 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559718 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM559718 ^ (-986072977);
                        this = this;
                    }
                    break;
                case 1342127300:
                case 1958378512:
                    iM55684 = 2125026970 ^ C0873.m55680(C0866.m55652(sArr5, i20, 3, i19));
                    if (C1194.f82045 == 0) {
                        iM55681 = (i16 - C0946.m55979("ۘ۠")) * 79;
                        i12 = ((iM55681 ^ i15) * 16203) ^ (-1241488293);
                        i14 = 1340128506;
                        i18 = iM55681 ^ i14;
                        i17 = i12;
                    }
                    i11 = i24;
                    sArr = sArr2;
                    iM55680 = C0946.m55979("᩹۟") ^ i16;
                    i12 = ((iM55680 ^ i15) * (-4657)) ^ 604634992;
                    i13 = 154134721;
                    int i210 = iM55680 ^ i13;
                    sArr2 = sArr;
                    i24 = i11;
                    i18 = i210;
                    i17 = i12;
                    break;
                case 1390883559:
                case 1598746017:
                    i24 = i24;
                    sArr2 = sArr2;
                    textView = activityC18153.f54188;
                    strM55635 = C0863.m55635(f82225, 1, 3, i19);
                    if (!C1048.f81963) {
                        int iM559719 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559719 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM559719 ^ (-986072977);
                        this = this;
                    } else {
                        int iM559720 = C0946.m55979("᩺ۗ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM559720 ^ i16) * (-31739)) ^ 2048237270;
                        i5 = i24;
                        i18 = iM559720 ^ 1134974728;
                        i24 = i5;
                    }
                    break;
                case 1430377804:
                case 1716687320:
                    ViewOnClickListenerC0939.m55953(c20671, iM55683, onClickListener);
                    onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.֨֫᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i31) {
                            int i32 = 885471661;
                            int i33 = C0898.f81858;
                            int i34 = C1229.f82066;
                            int iM559721 = C0946.m55979("۫᩺") ^ i33;
                            int i35 = ((iM559721 ^ i34) * 11165) ^ 1045868695;
                            int i36 = -1733848477;
                            while (true) {
                                i32 = ((((i32 ^ i34) * (-10721)) >> 31) & i35) ^ (iM559721 ^ i36);
                                switch (i32) {
                                    case -1876728508:
                                    case -288566989:
                                        if (C1053.f81965 <= 0) {
                                            iM559721 = C0873.m55680("ܺۗ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        } else {
                                            iM559721 = C0946.m55979("᩷ۡ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * 10173) ^ (-1880916119);
                                            i36 = 228806728;
                                        }
                                        break;
                                    case -1539630753:
                                    case -495485666:
                                        C1404.m56468();
                                        if (!C1024.f81946) {
                                            iM559721 = C0946.m55979("ܶۢ") ^ i33;
                                            i35 = ((iM559721 ^ i34) * (-15601)) ^ (-130124943);
                                            i36 = -488157233;
                                        } else {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        }
                                        break;
                                    case -1330178498:
                                    case -1049256536:
                                        if (C0877.m55696()) {
                                            iM559721 = (i34 - C0946.m55979("ۘۧ")) * (-115);
                                            i35 = ((iM559721 ^ i33) * (-19117)) ^ 997257849;
                                            i36 = 2006278795;
                                        } else {
                                            iM559721 = C0873.m55680("֡ۗ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-22227)) ^ 1123169892;
                                            i36 = 1401359631;
                                        }
                                        break;
                                    case -1273682907:
                                    case 917312621:
                                        C0877.m55696();
                                        RunnableC1014.m56177();
                                        break;
                                    case -1225857956:
                                    case 1612544951:
                                        if (C0917.f81868) {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM559721 = (i34 - C0946.m55979("ܰۗ")) * 75;
                                            i35 = ((iM559721 ^ i33) * 15053) ^ (-1065280417);
                                            i36 = 199827022;
                                        }
                                        break;
                                    case -1189269141:
                                    case 1131112865:
                                        if (C0898.m55800() <= 0) {
                                            iM559721 = C0946.m55979("ܶۢ") ^ i33;
                                            i35 = ((iM559721 ^ i34) * (-15601)) ^ (-130124943);
                                            i36 = -488157233;
                                        } else {
                                            iM559721 = C0873.m55680("ܺۗ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        }
                                        break;
                                    case -1135563195:
                                    case 118732893:
                                        if (C1044.f81959 >= 0) {
                                            iM559721 = (C0873.m55680("᩵᩶") + i33) * 59;
                                            i35 = ((iM559721 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        } else {
                                            iM559721 = C0946.m55979("ۢ֨") ^ i33;
                                            i35 = ((iM559721 ^ i34) * 24887) ^ (-230953460);
                                            i36 = -423319626;
                                        }
                                        break;
                                    case -907677669:
                                    case -297763976:
                                        if (C1071.m56343() != 0) {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM559721 = C0873.m55680("ۧ֫") ^ i33;
                                            i35 = ((iM559721 ^ i34) * 26755) ^ 1633735319;
                                            i36 = -1204565422;
                                        }
                                        break;
                                    case -749210122:
                                    case 1911512917:
                                        if (C1929.m56553()) {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM559721 = (i33 - C0946.m55979("ۤܽ")) * (-115);
                                            i35 = ((iM559721 ^ i34) * (-28331)) ^ 1680823021;
                                            i36 = 266506719;
                                        }
                                        break;
                                    case -613522385:
                                    case 1667841379:
                                        if (C1003.f81929 <= 0) {
                                            iM559721 = C0873.m55680("֡ۗ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-22227)) ^ 1123169892;
                                            i36 = 1401359631;
                                        } else {
                                            iM559721 = (i34 - C0873.m55680("ܶۘ")) * (-37);
                                            i35 = ((iM559721 ^ i33) * 13545) ^ 1940601461;
                                            i36 = 357160795;
                                        }
                                        break;
                                    case -516150758:
                                    case 1722591827:
                                        if (C0906.m55809() <= 0) {
                                            iM559721 = (C0873.m55680("᩵᩶") + i33) * 59;
                                            i35 = ((iM559721 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        } else {
                                            iM559721 = C0873.m55680("ۡ᩸") ^ i34;
                                            i35 = ((iM559721 ^ i33) * 4137) ^ 1423316827;
                                            i36 = 1655168774;
                                        }
                                        break;
                                    case -362566037:
                                    case 593088343:
                                        if (C0930.f81879 > 0) {
                                            iM559721 = C0873.m55680("ܺۗ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * 19337) ^ 289679005;
                                            i36 = -1956031968;
                                        } else {
                                            iM559721 = (C0873.m55680("᩵᩶") + i33) * 59;
                                            i35 = ((iM559721 ^ i34) * (-15433)) ^ 1252751268;
                                            i36 = 1126551062;
                                        }
                                        break;
                                    case 716152238:
                                    case 1754949113:
                                        if (C0912.m55833()) {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM559721 = (i33 - C0873.m55680("ۖۢ")) * C0254q.f1218h;
                                            i35 = ((iM559721 ^ i34) * (-25375)) ^ 1795538599;
                                            i36 = -211643613;
                                        }
                                        break;
                                    case 983134650:
                                    case 1846944453:
                                        C1124.m56367();
                                        C0955.m56025();
                                        iM559721 = (C0873.m55680("᩵᩶") + i33) * 59;
                                        i35 = ((iM559721 ^ i34) * (-15433)) ^ 1252751268;
                                        i36 = 1126551062;
                                        break;
                                    case 1184118798:
                                    case 1562189756:
                                        RunnableC0897.m55775(this.f5758.f48625);
                                        break;
                                    default:
                                        if (C1046.m56302() != 0) {
                                            iM559721 = C0946.m55979("ۖۙ") ^ i34;
                                            i35 = ((iM559721 ^ i33) * (-10937)) ^ 359375326;
                                            i36 = -224692699;
                                        } else {
                                            iM559721 = C0873.m55680("ܶۗ") ^ i33;
                                            i35 = ((iM559721 ^ i34) * 9461) ^ 128667693;
                                            i36 = 1754896926;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr5 = f82225;
                    i20 = 13;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55681 = C0873.m55680("᩺ܺ") ^ i15;
                        i12 = ((iM55681 ^ i16) * (-9513)) ^ (-528077923);
                        i14 = -354301241;
                    } else {
                        iM55681 = (i15 - C0946.m55979("᩺ۖ")) * (-111);
                        i12 = ((iM55681 ^ i16) * 28929) ^ (-254690749);
                        i14 = 900657479;
                    }
                    i18 = iM55681 ^ i14;
                    i17 = i12;
                    break;
                case 1449174190:
                case 1683678270:
                    C0937.m55918();
                    if (C0882.m55710() == 0) {
                        iM55681 = C0946.m55979("֨᩻") ^ i15;
                        i12 = ((iM55681 ^ i16) * 15425) ^ (-437656679);
                        i14 = -320934575;
                        i18 = iM55681 ^ i14;
                        i17 = i12;
                    } else {
                        i24 = i24;
                        strM55635 = str;
                        textView = textView2;
                        sArr2 = sArr2;
                        int iM5597110 = C0946.m55979("֡ۛ") ^ i15;
                        sArr2 = sArr2;
                        textView2 = textView;
                        str = strM55635;
                        i17 = ((iM5597110 ^ i16) * (-16631)) ^ 1384630101;
                        i24 = i24;
                        i18 = iM5597110 ^ (-986072977);
                        this = this;
                    }
                    break;
                default:
                    TextView textView4 = textView2;
                    sArr2 = sArr2;
                    activityC18153 = this.f48625;
                    int i31 = activityC18153.f54186;
                    i24 = this.f48623;
                    if (i24 != i31) {
                        int iM559721 = C0946.m55979("ۨܺ") ^ i16;
                        i18 = iM559721 ^ 1460032732;
                        i17 = ((iM559721 ^ i15) * 30175) ^ (-1368414056);
                    } else {
                        int iM559722 = C0946.m55979("ᩴۗ") ^ i16;
                        i17 = ((iM559722 ^ i15) * (-13295)) ^ (-24802458);
                        i18 = iM559722 ^ 2045905282;
                    }
                    textView2 = textView4;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37524(C16556 c16556) {
        ActivityC18153 activityC18153 = null;
        ArrayList arrayList = null;
        int i = -4142438;
        int i2 = C0898.f81858;
        int i3 = C0873.f81841;
        int iM55979 = (C0946.m55979("ܺۧ") + i2) * 83;
        int i4 = ((iM55979 ^ i3) * (-25991)) ^ (-1251439317);
        int i5 = -424244815;
        while (true) {
            i = ((((i ^ i3) * 16339) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2120872086:
                case 1234294618:
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0946.m55979("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM55979 = C0873.m55680("ۙܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7777)) ^ (-1590301812);
                        i5 = 1953052523;
                    }
                    break;
                case -2086458604:
                case 632286494:
                    activityC18153 = c16556.f48625;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۡ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    } else {
                        iM55979 = C0946.m55979("ܽ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30645)) ^ 488595994;
                        i5 = 1903673321;
                    }
                    break;
                case -2029920494:
                case 172733447:
                    C0861.m55626();
                    if (!C0917.m55854()) {
                        iM55979 = C0946.m55979("ۡ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    } else {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9255)) ^ 1525610505;
                        i5 = 340937538;
                    }
                    break;
                case -1952388205:
                case 1323409264:
                    if (!C1024.f81946) {
                        iM55979 = (C0946.m55979("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۗ֨")) * 25;
                        i4 = ((iM55979 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case -1828860176:
                case 23366911:
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("ۘ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-157)) ^ 654083142;
                        i5 = 1199151796;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۗ֨")) * 25;
                        i4 = ((iM55979 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case -1703733989:
                case 734505585:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (i2 - C0946.m55979("ۗ֨")) * 25;
                        i4 = ((iM55979 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    } else {
                        iM55979 = C0873.m55680("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3969) ^ (-2047923014);
                        i5 = 1298225923;
                    }
                    break;
                case -1553697782:
                case -1239395309:
                    C1229.m56410();
                    iM55979 = C0946.m55979("ۡ֡") ^ i3;
                    i4 = ((iM55979 ^ i2) * 12443) ^ 1167778485;
                    i5 = 1863103088;
                    break;
                case -1448806088:
                case 1356527798:
                    RunnableC0938.m55934(arrayList);
                    if (c16556.f48624 != null) {
                        iM55979 = (C0946.m55979("᩷ۘ") ^ i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-3499)) ^ (-123170375);
                        i5 = -827420078;
                    } else {
                        iM55979 = (C0946.m55979("᩻᩷") + i3) * (-77);
                        i4 = ((iM55979 ^ i2) * 20033) ^ 510827304;
                        i5 = 478974310;
                    }
                    break;
                case -610808736:
                case 2071678103:
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0946.m55979("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    } else {
                        iM55979 = (C0946.m55979("ܳ۫") + i2) * (-9);
                        i4 = ((iM55979 ^ i3) * 5599) ^ (-237328171);
                        i5 = -1305006113;
                    }
                    break;
                case -462236897:
                case 786821309:
                    C0882.m55710();
                    if (C0949.f81897 >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۗ֨")) * 25;
                        i4 = ((iM55979 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    } else {
                        iM55979 = C0946.m55979("ۡ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12443) ^ 1167778485;
                        i5 = 1863103088;
                    }
                    break;
                case -359335419:
                case 1616667054:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("᩸۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9255)) ^ 1525610505;
                        i5 = 340937538;
                    } else {
                        iM55979 = C0873.m55680("ۙܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-9467)) ^ (-947569521);
                        i5 = -618251439;
                    }
                    break;
                case -50486048:
                case 1341998708:
                    if (RunnableC1014.m56177()) {
                        iM55979 = (C0873.m55680("ۤۛ") + i3) * (-71);
                        i4 = ((iM55979 ^ i2) * (-12169)) ^ (-1705057112);
                        i5 = -917954842;
                    } else {
                        iM55979 = (C0946.m55979("ܶ᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * 20455) ^ (-2089806048);
                        i5 = 12256119;
                    }
                    break;
                case -14070279:
                case 901547990:
                    C0930.m55885();
                    break;
                case 301555827:
                case 2047180512:
                    if (C1404.m56468()) {
                        iM55979 = (C0946.m55979("۟᩹") + i2) * 41;
                        i4 = ((iM55979 ^ i3) * 9) ^ (-853559585);
                        i5 = -1210096745;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۗ֨")) * 25;
                        i4 = ((iM55979 ^ i3) * (-981)) ^ (-454167222);
                        i5 = 2007757877;
                    }
                    break;
                case 1172727745:
                case 1938758399:
                    if (C1929.m56553()) {
                        iM55979 = C0946.m55979("ۧ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23509)) ^ (-2036059412);
                        i5 = 1358661540;
                    } else {
                        iM55979 = (C0946.m55979("ۡܺ") ^ i3) * (-47);
                        i4 = ((iM55979 ^ i2) * 31211) ^ 1911896250;
                        i5 = 584965112;
                    }
                    break;
                case 1643716863:
                case 2095967188:
                    arrayList = activityC18153.f54189;
                    if (C1404.m56468()) {
                        iM55979 = (C0946.m55979("ۘۨ") + i3) * (-121);
                        i4 = ((iM55979 ^ i2) * (-13587)) ^ (-204600156);
                        i5 = 1898817004;
                    } else {
                        iM55979 = C0946.m55979("ۧ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23509)) ^ (-2036059412);
                        i5 = 1358661540;
                    }
                    break;
                case 1867252843:
                case 2019160313:
                    activityC18153.f54189.addAll(c16556.f48624);
                    iM55979 = (C0946.m55979("᩻᩷") + i3) * (-77);
                    i4 = ((iM55979 ^ i2) * 20033) ^ 510827304;
                    i5 = 478974310;
                    break;
                default:
                    C1929.m56564(activityC18153.f13392, C19850.m45095());
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC18153 activityC18153 = null;
        C14102 c14102 = null;
        boolean z = false;
        int i = 1502321792;
        int i2 = C0989.f81920;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55680 = C0873.m55680("۫ۙ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 3619) ^ (-1070236225);
        int i5 = -1571696088;
        while (true) {
            i = ((((i ^ i2) * (-11247)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2027873898:
                case -841750339:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM55680 = C0873.m55680("ܿܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27825) ^ 1730593064;
                        i5 = -1575871731;
                    }
                    break;
                case -1925915405:
                case 1220898811:
                    AbstractC0942.m55971();
                    C0861.m55626();
                    break;
                case -1776541603:
                case -345288115:
                    C1071.m56343();
                    if (C1003.m56123() == 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM55680 = C0946.m55979("ᩳܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    }
                    break;
                case -1761788628:
                case -1173068595:
                    C0949.m56012();
                    iM55680 = C0946.m55979("ᩳܿ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 4973) ^ 641751143;
                    i5 = 1639977647;
                    break;
                case -1378406337:
                case 1835104449:
                    if (this.f48623 != activityC18153.f54186) {
                        iM55680 = C0873.m55680("ܳܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15103)) ^ 1456570131;
                        i5 = 105652926;
                    } else {
                        iM55680 = (C0946.m55979("ۧ۫") ^ i3) * 3;
                        i4 = ((iM55680 ^ i2) * 29191) ^ 246450826;
                        i5 = -1340656060;
                    }
                    break;
                case -1256788814:
                case 1319565846:
                    activityC18153 = this.f48625;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM55680 = C0873.m55680("۬ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31217) ^ 1165853520;
                        i5 = -2011512097;
                    }
                    break;
                case -1118734356:
                case -647513764:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۛ۫") ^ i3) * 109;
                        i4 = ((iM55680 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1159) ^ 1927305879;
                        i5 = 704030734;
                    }
                    break;
                case -589870988:
                case 1443779237:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("۫ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30699) ^ 1778625161;
                        i5 = -395707582;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15401)) ^ 2118055906;
                        i5 = -1740416011;
                    }
                    break;
                case -533230913:
                case 1240225614:
                    if (C1003.m56123() != 0) {
                        iM55680 = (C0946.m55979("ۛ۫") ^ i3) * 109;
                        i4 = ((iM55680 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM55680 = C0873.m55680("ۛܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11809) ^ (-1449848979);
                        i5 = -539191130;
                    }
                    break;
                case -348749724:
                case 1711338081:
                    C1046.m56302();
                    if (!C0861.m55626()) {
                        iM55680 = (C0946.m55979("ۛ۫") ^ i3) * 109;
                        i4 = ((iM55680 ^ i2) * (-19659)) ^ (-1348140461);
                        i5 = 1931654749;
                    } else {
                        iM55680 = C0946.m55979("ᩳܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    }
                    break;
                case -210887101:
                case 1910320093:
                    break;
                case -163324161:
                case 293496086:
                    c14102.m32018(z);
                    if (C19850.m45097()) {
                        iM55680 = (C0946.m55979("ᩳ֡") ^ i2) * (-17);
                        i4 = ((iM55680 ^ i3) * (-11495)) ^ (-1919943956);
                        i5 = -736660388;
                    } else {
                        iM55680 = C0873.m55680("ܳܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15103)) ^ 1456570131;
                        i5 = 105652926;
                    }
                    break;
                case 77517719:
                case 1168075144:
                    if (C1028.f81950 > 0) {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12429) ^ (-539533441);
                        i5 = -1826434317;
                    } else {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    }
                    break;
                case 708211039:
                case 1995590392:
                    c14102 = activityC18153.f54187;
                    z = false;
                    z = false;
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM55680 = (C0946.m55979("۫۠") + i3) * (-17);
                        i4 = ((iM55680 ^ i2) * 14375) ^ (-798371059);
                        i5 = -1254498796;
                    }
                    break;
                case 721328522:
                case 1159106875:
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ᩳܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4973) ^ 641751143;
                        i5 = 1639977647;
                    } else {
                        iM55680 = (C0873.m55680("᩶۫") ^ i3) * (-117);
                        i4 = ((iM55680 ^ i2) * (-27627)) ^ (-110969648);
                        i5 = 1836712747;
                    }
                    break;
                case 1029000789:
                case 1462773325:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ܶ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12429) ^ (-539533441);
                        i5 = -1826434317;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֡᩵")) * 47;
                        i4 = ((iM55680 ^ i2) * (-17619)) ^ (-1980693914);
                        i5 = 1633067131;
                    }
                    break;
                case 1086988701:
                case 1410870528:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("۫ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 30699) ^ 1778625161;
                        i5 = -395707582;
                    } else {
                        iM55680 = C0946.m55979("᩹᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12649) ^ (-343852620);
                        i5 = 556225261;
                    }
                    break;
                case 1401349928:
                case 1693313751:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25379) ^ 428972984;
                        i5 = 1328962542;
                    } else {
                        iM55680 = C0873.m55680("ۖۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 4911) ^ (-1951691869);
                        i5 = -1243078193;
                    }
                    break;
                default:
                    C1028.m56238(activityC18153.f54188, z ? 1 : 0);
                    iM55680 = C0873.m55680("ܳܽ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-15103)) ^ 1456570131;
                    i5 = 105652926;
                    break;
            }
            return;
        }
    }
}
