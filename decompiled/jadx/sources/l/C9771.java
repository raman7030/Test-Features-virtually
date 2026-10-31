package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9771 {

    /* JADX INFO: renamed from: ܺ᩷ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f29553 = {8101, 21572, 21571, 21585, 21590, 21629, 21591, 21584, 21582, 21585, 21572, 21571, 21585, 21590, 21629, 21591, 21584, 21582, 21585, 21629, 21575, 21594, 21586, 21579, 21584, 21575, 21574, 21630, 21598, 8218, -22984, -22977, -22995, -22998, -23039, -22997, -22996, -22990, -22995, -23006};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedList f29554;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f29555;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f29556;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m24779(boolean z) {
        if (C4925.m14301()) {
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicInteger atomicInteger2 = new AtomicInteger();
            AbstractC18132[] abstractC18132Arr = new AbstractC18132[C9065.f27488];
            Iterator itM9029 = C2958.m9029(this.f29555);
            while (C0483.m2123(itM9029)) {
                C1802.f6209.submit(new C21060(this, (AbstractC18132) C2272.m7513(itM9029), atomicInteger2, atomicInteger, abstractC18132Arr));
            }
            if (z) {
                do {
                    try {
                        Thread.sleep(10L);
                        if (C2167.m7147(atomicInteger) >= 1) {
                            break;
                        }
                    } catch (InterruptedException unused) {
                    }
                } while (C0714.m2817(atomicInteger2) != C3432.m10481(this.f29555));
            }
        }
    }

    public C9771() {
        HashMap map = null;
        ArrayList arrayList = null;
        int i = -738176339;
        int i2 = C1294.f4556;
        int i3 = RunnableC1937.f6483;
        int iM2566 = C0630.m2566("᩸ܳ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-15807)) ^ 758760299;
        int i5 = 775724294;
        while (true) {
            i = ((((i ^ i2) * (-2765)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2099436889:
                case -1131928166:
                    if (C4159.m12565() >= 0) {
                        iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                        i5 = -1276401141;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܳܽ")) * (-125);
                        i4 = ((iM2566 ^ i3) * 16125) ^ 56952885;
                        i5 = -726500207;
                    }
                    break;
                case -1602721537:
                case 793907701:
                    if (C2520.m8026()) {
                        iM2566 = C0630.m2566("֨۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6611)) ^ (-285065382);
                        i5 = -1533456748;
                    } else {
                        iM2566 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24109)) ^ (-1593472227);
                        i5 = 1270937576;
                    }
                    break;
                case -1556374750:
                case 1570632274:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14847) ^ 1311971576;
                        i5 = 1872187550;
                    } else {
                        iM2566 = C2105.m6981("᩷ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-15089)) ^ (-1416777787);
                        i5 = -1095567969;
                    }
                    break;
                case -1076069993:
                case 638996422:
                    map = new HashMap();
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ܰᩳ")) * (-3);
                        i4 = ((iM2566 ^ i3) * (-17745)) ^ 438903760;
                        i5 = 376390200;
                    } else {
                        iM2566 = C0630.m2566("ܰܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11523)) ^ 1726207529;
                        i5 = 1352656146;
                    }
                    break;
                case -1063461605:
                case -310602062:
                    C0630.m2564();
                    if (C4616.f14690 > 0) {
                        iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                        i5 = -1276401141;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6611)) ^ (-285065382);
                        i5 = -1533456748;
                    }
                    break;
                case -1024862857:
                case -936435508:
                    arrayList = new ArrayList();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("᩵۬") + i3) * (-69);
                        i4 = ((iM2566 ^ i2) * 24443) ^ 462757092;
                        i5 = -411366643;
                    } else {
                        iM2566 = C2105.m6981("ܽ۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14783)) ^ (-1617173698);
                        i5 = -2007879424;
                    }
                    break;
                case -460878992:
                case 1390094430:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("᩺ۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14847) ^ 1311971576;
                        i5 = 1872187550;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6611)) ^ (-285065382);
                        i5 = -1533456748;
                    }
                    break;
                case -456615357:
                case 550195213:
                    this.f29556 = map;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                        i5 = -1276401141;
                    } else {
                        iM2566 = C2105.m6981("ۧ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7713)) ^ 1298353046;
                        i5 = 1506545556;
                    }
                    break;
                case -105030845:
                case 384232686:
                    C1420.m4913();
                    C0630.m2564();
                    iM2566 = C0630.m2566("֨۠") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-6611)) ^ (-285065382);
                    i5 = -1533456748;
                    break;
                case -27721000:
                case 194072199:
                    C7106.m19120();
                    C4117.m12364();
                    throw new RuntimeException();
                case -6834890:
                case 1113833417:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                        i5 = -1276401141;
                    } else {
                        iM2566 = C0630.m2566("᩶ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 29339) ^ 1597480285;
                        i5 = -1416438375;
                    }
                    break;
                case 431032676:
                case 498849365:
                    this.f29555 = arrayList;
                    if (RunnableC0588.m2441() < 0) {
                        this.f29554 = new LinkedList();
                        return;
                    }
                    iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                    i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                    i5 = -1276401141;
                    break;
                case 490409705:
                case 1337061749:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("ۛܽ") ^ i3) * (-3);
                        i4 = ((iM2566 ^ i2) * (-8589)) ^ 1820679380;
                        i5 = -1276401141;
                    } else {
                        iM2566 = C0630.m2566("۫֫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14189)) ^ (-1343435058);
                        i5 = 768952492;
                    }
                    break;
                case 1076228066:
                case 1271850870:
                    C1420.m4913();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ܰᩳ")) * (-3);
                        i4 = ((iM2566 ^ i3) * (-17745)) ^ 438903760;
                        i5 = 376390200;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6611)) ^ (-285065382);
                        i5 = -1533456748;
                    }
                    break;
                default:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ܰᩳ")) * (-3);
                        i4 = ((iM2566 ^ i3) * (-17745)) ^ 438903760;
                        i5 = 376390200;
                    } else {
                        iM2566 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26515)) ^ 1514264002;
                        i5 = -564989368;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m24782() {
        return C0382.m1847(this.f29555);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24778(AbstractC18132 abstractC18132) {
        String strM1959 = null;
        HashMap map = null;
        int i = -425581292;
        int i2 = C3746.f11829;
        int i3 = C3019.f9544;
        int iM2566 = C0630.m2566("᩷ۜ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 26477) ^ 1458925221;
        int i5 = 1495357106;
        while (true) {
            i = ((((i ^ i3) * 17639) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1957305075:
                case -662815571:
                    if (C7106.f21815 == 0) {
                        iM2566 = C0630.m2566("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12519) ^ (-1889198310);
                        i5 = 1023948626;
                    } else {
                        iM2566 = (C2105.m6981("ۧۨ") + i2) * (-83);
                        i4 = ((iM2566 ^ i3) * 5551) ^ 1568174575;
                        i5 = -1078782468;
                    }
                    break;
                case -1449229377:
                case 418829618:
                    C7811.m20844();
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۜۤ")) * 59;
                        i4 = ((iM2566 ^ i3) * 19759) ^ 533499384;
                        i5 = -1822602669;
                    } else {
                        iM2566 = (C2105.m6981("ۙۛ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 22183) ^ 1803220037;
                        i5 = -297548332;
                    }
                    break;
                case -1419556769:
                case -1308825596:
                    if (C0237.f1507 != 0) {
                        iM2566 = (i2 - C2105.m6981("ۜۤ")) * 59;
                        i4 = ((iM2566 ^ i3) * 19759) ^ 533499384;
                        i5 = -1822602669;
                    } else {
                        iM2566 = (C2105.m6981("۠ۛ") + i2) * 17;
                        i4 = ((iM2566 ^ i3) * 30551) ^ 2059816878;
                        i5 = 408231267;
                    }
                    break;
                case -1248606414:
                case -755832822:
                    C4263.m12819();
                    break;
                case -1069591899:
                case -540561017:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۜۤ")) * 59;
                        i4 = ((iM2566 ^ i3) * 19759) ^ 533499384;
                        i5 = -1822602669;
                    } else {
                        iM2566 = C0630.m2566("᩹ܶ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15919)) ^ 2106259502;
                        i5 = 1485354637;
                    }
                    break;
                case -869699709:
                case 1825301085:
                    if (C4075.m12263() <= 0) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i3) * (-109);
                        i4 = ((iM2566 ^ i2) * 18607) ^ 1916662201;
                        i5 = 1494945887;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1369) ^ (-904019726);
                        i5 = 845594930;
                    }
                    break;
                case -794131064:
                case 1141179467:
                    C1773.m5908();
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ۧۨ") + i2) * (-83);
                        i4 = ((iM2566 ^ i3) * 5551) ^ 1568174575;
                        i5 = -1078782468;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۜۤ")) * 59;
                        i4 = ((iM2566 ^ i3) * 19759) ^ 533499384;
                        i5 = -1822602669;
                    }
                    break;
                case -690288374:
                case -664408559:
                    C7106.m19117(this.f29555, abstractC18132);
                    iM2566 = (C0630.m2566("ۡܶ") ^ i3) * (-17);
                    i4 = ((iM2566 ^ i2) * (-27243)) ^ (-1645905844);
                    i5 = -488738351;
                    break;
                case -370502528:
                case 1250681878:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۙۛ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 22183) ^ 1803220037;
                        i5 = -297548332;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۙۙ")) * (-99);
                        i4 = ((iM2566 ^ i2) * (-10379)) ^ (-1064720094);
                        i5 = -1312870961;
                    }
                    break;
                case -219096888:
                case 1918539947:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ᩳܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12519) ^ (-1889198310);
                        i5 = 1023948626;
                    } else {
                        iM2566 = C2105.m6981("֫ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 1403) ^ 1033930478;
                        i5 = -664482829;
                    }
                    break;
                case -107261707:
                case 549223996:
                    C4117.m12364();
                    C3746.m11369();
                    iM2566 = (C2105.m6981("ۙۛ") + i3) * (-73);
                    i4 = ((iM2566 ^ i2) * 22183) ^ 1803220037;
                    i5 = -297548332;
                    break;
                case -56098768:
                case 278587011:
                    if (C0483.m2121()) {
                        iM2566 = (C2105.m6981("᩸ܺ") ^ i3) * 97;
                        i4 = ((iM2566 ^ i2) * 543) ^ (-1076521889);
                        i5 = 1076781284;
                    } else {
                        iM2566 = (C2105.m6981("ۙۛ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 22183) ^ 1803220037;
                        i5 = -297548332;
                    }
                    break;
                case 299802363:
                case 1759063725:
                    map = this.f29556;
                    if (C1128.m3842(map, strM1959)) {
                        iM2566 = (C0630.m2566("ۡܶ") ^ i3) * (-17);
                        i4 = ((iM2566 ^ i2) * (-27243)) ^ (-1645905844);
                        i5 = -488738351;
                    } else {
                        iM2566 = C2105.m6981("ܰ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 5633) ^ (-1450822013);
                        i5 = -916498739;
                    }
                    break;
                case 509130963:
                case 1045611957:
                    if (C2272.m7503()) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i3) * (-109);
                        i4 = ((iM2566 ^ i2) * 18607) ^ 1916662201;
                        i5 = 1494945887;
                    } else {
                        iM2566 = C0630.m2566("֡ᩳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25601)) ^ 268696186;
                        i5 = 344135868;
                    }
                    break;
                case 620635766:
                case 1831361707:
                    C1128.m3856(map, C0050.m947(abstractC18132), abstractC18132);
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("ۧۨ") + i2) * (-83);
                        i4 = ((iM2566 ^ i3) * 5551) ^ 1568174575;
                        i5 = -1078782468;
                    } else {
                        iM2566 = (C0630.m2566("ۖ᩷") + i2) * 49;
                        i4 = ((iM2566 ^ i3) * 10231) ^ 2041545377;
                        i5 = 2032115052;
                    }
                    break;
                case 745639847:
                case 1073423634:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۜۤ")) * 59;
                        i4 = ((iM2566 ^ i3) * 19759) ^ 533499384;
                        i5 = -1822602669;
                    } else {
                        iM2566 = (C0630.m2566("֡᩹") ^ i2) * (-53);
                        i4 = ((iM2566 ^ i3) * (-27803)) ^ 427275352;
                        i5 = 1213233615;
                    }
                    break;
                case 902137899:
                case 1384159626:
                    strM1959 = C0422.m1959(abstractC18132);
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("۫ۡ") ^ i3) * (-109);
                        i4 = ((iM2566 ^ i2) * 18607) ^ 1916662201;
                        i5 = 1494945887;
                    } else {
                        iM2566 = (C0630.m2566("ۨۗ") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 8575) ^ (-1752496412);
                        i5 = 612723013;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC18132 m24780() {
        LinkedList linkedList = null;
        int i = -1664523526;
        int i2 = C0422.f1886;
        int i3 = C2520.f8000;
        int iM2566 = C0630.m2566("ۚ᩸") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-13051)) ^ (-788062145);
        int i5 = 856882449;
        while (true) {
            i = ((((i ^ i3) * 15871) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1982304364:
                case -631298168:
                    C0483.m2121();
                    if (C1005.f3721) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                        i5 = -1462359309;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۨۖ")) * (-91);
                        i4 = ((iM2566 ^ i2) * 30855) ^ 103094571;
                        i5 = 1276288663;
                    }
                    break;
                case -1954806405:
                case 1088940974:
                    return (AbstractC18132) this.f29554.getFirst();
                case -1950043727:
                case 167044310:
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                        i5 = -1462359309;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۘ᩷")) * (-23);
                        i4 = ((iM2566 ^ i2) * (-11485)) ^ 1547990753;
                        i5 = -1744179504;
                    }
                    break;
                case -1877729061:
                case -936915898:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ۜ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14371)) ^ 766749091;
                        i5 = -1028355177;
                    } else {
                        iM2566 = C2105.m6981("ۖۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3703)) ^ 261509367;
                        i5 = -1268829794;
                    }
                    break;
                case -1744423237:
                case 279563305:
                    C2958.m9034();
                    if (!C3663.f11553) {
                        iM2566 = C2105.m6981("᩻ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 13381) ^ (-1738570269);
                        i5 = -828931834;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۤۛ")) * 23;
                        i4 = ((iM2566 ^ i3) * 9427) ^ (-1472287533);
                        i5 = 164265598;
                    }
                    break;
                case -933039534:
                case 722031505:
                    m24779(true);
                    m24777();
                    iM2566 = (C0630.m2566("֨᩷") ^ i2) * (-9);
                    i4 = ((iM2566 ^ i3) * 21823) ^ (-842829249);
                    i5 = -1799087175;
                    break;
                case -696256072:
                case 163269449:
                    C3537.m10746();
                    iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                    i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                    i5 = -1462359309;
                    break;
                case -506245901:
                case 81225187:
                    if (C1504.m5179()) {
                        iM2566 = C0630.m2566("֨᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * 20561) ^ (-351712058);
                        i5 = 1671751186;
                    } else {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                        i5 = -1462359309;
                    }
                    break;
                case -257576448:
                case 2068802782:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (i2 - C2105.m6981("֫ܿ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i3) * 32059) ^ (-1081192146);
                        i5 = 1871966566;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۤۛ")) * 23;
                        i4 = ((iM2566 ^ i3) * 9427) ^ (-1472287533);
                        i5 = 164265598;
                    }
                    break;
                case -173262266:
                case 737759438:
                    linkedList = this.f29554;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۤۛ")) * 23;
                        i4 = ((iM2566 ^ i3) * 9427) ^ (-1472287533);
                        i5 = 164265598;
                    } else {
                        iM2566 = (C0630.m2566("ۙ᩺") + i3) * 73;
                        i4 = ((iM2566 ^ i2) * 29773) ^ (-694128676);
                        i5 = -694791906;
                    }
                    break;
                case -26142649:
                case 946881881:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C2105.m6981("᩻ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 13381) ^ (-1738570269);
                        i5 = -828931834;
                    } else {
                        iM2566 = C0630.m2566("۠ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-927)) ^ (-525976281);
                        i5 = 1717193111;
                    }
                    break;
                case 232590692:
                case 2125582703:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                        i5 = -1462359309;
                    } else {
                        iM2566 = (C0630.m2566("ۢۤ") + i2) * (-79);
                        i4 = ((iM2566 ^ i3) * 31673) ^ (-763653517);
                        i5 = 1412567885;
                    }
                    break;
                case 454052126:
                case 1677934434:
                    if (C0714.m2805()) {
                        iM2566 = C0630.m2566("ۢ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29627)) ^ 954988450;
                        i5 = 6329905;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۤۛ")) * 23;
                        i4 = ((iM2566 ^ i3) * 9427) ^ (-1472287533);
                        i5 = 164265598;
                    }
                    break;
                case 533175872:
                case 1073423114:
                    if (C0714.m2805()) {
                        iM2566 = C2105.m6981("ܰۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29797)) ^ 627130077;
                        i5 = 1976907199;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۤۛ")) * 23;
                        i4 = ((iM2566 ^ i3) * 9427) ^ (-1472287533);
                        i5 = 164265598;
                    }
                    break;
                case 594677106:
                case 866061267:
                    C1773.m5908();
                    return null;
                case 595226621:
                case 885344280:
                    C1047.m3599();
                    if (!C1916.f6442) {
                        iM2566 = C2105.m6981("ۢ᩷") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2499) ^ 284101409;
                        i5 = -1462359309;
                    } else {
                        iM2566 = C2105.m6981("᩻ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 13381) ^ (-1738570269);
                        i5 = -828931834;
                    }
                    break;
                case 1351109777:
                case 1949497239:
                    if (C3746.m11364(linkedList)) {
                        iM2566 = C0630.m2566("ۛ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6539) ^ 1502586447;
                        i5 = 1137107319;
                    } else {
                        iM2566 = (C0630.m2566("֨᩷") ^ i2) * (-9);
                        i4 = ((iM2566 ^ i3) * 21823) ^ (-842829249);
                        i5 = -1799087175;
                    }
                    break;
                default:
                    if (C2520.m8026()) {
                        iM2566 = C2105.m6981("ۜ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14371)) ^ 766749091;
                        i5 = -1028355177;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩻") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21121)) ^ 1925827567;
                        i5 = 1214505298;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24783() {
        short s = f29553[29];
        int i = (s * s) + 82029249;
        int i2 = s + 9057;
        int i3 = (i + i) - (i2 * i2) < 0 ? 21482 : 42590;
        LinkedList linkedList = this.f29554;
        synchronized (linkedList) {
            if (!C1128.m3846(linkedList)) {
                linkedList.removeFirst();
                C9065.f27487.edit().putString(C1005.m3502(f29553, 30, 9, i3), C9679.m24609(linkedList, ServiceConnectionC3453.m10568(f29553, 39, 1, i3))).apply();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24781() {
        short s = f29553[0];
        int i = (s * s) + 62410000;
        int i2 = s + 7900;
        int i3 = (i2 * i2) - (i + i) <= 0 ? 21538 : 46398;
        String strM3506 = C1005.m3506(C9065.f27487, C2520.m8030(f29553, 1, 9, i3), null);
        boolean z = C9065.f27487.getLong(C5695.m16034(f29553, 10, 17, i3), 0L) < C1294.m4371();
        if (strM3506 != null) {
            for (String str : C1294.m4374(strM3506, C1005.m3502(f29553, 27, 2, i3))) {
                AbstractC18132 abstractC18132 = (AbstractC18132) C4263.m12820(this.f29556, str);
                if (abstractC18132 != null) {
                    synchronized (this.f29554) {
                        this.f29554.add(abstractC18132);
                    }
                }
            }
        }
        boolean z2 = C3746.m11364(this.f29554) ? true : z;
        m24777();
        if (z2) {
            m24779(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24777() {
        LinkedList linkedList = this.f29554;
        synchronized (linkedList) {
            Iterator itM12354 = C4117.m12354(this.f29555);
            while (C0483.m2123(itM12354)) {
                AbstractC18132 abstractC18132 = (AbstractC18132) C2272.m7513(itM12354);
                if (linkedList.size() >= C9065.f27488) {
                    return;
                }
                if (!linkedList.contains(abstractC18132)) {
                    linkedList.add(abstractC18132);
                }
            }
        }
    }
}
