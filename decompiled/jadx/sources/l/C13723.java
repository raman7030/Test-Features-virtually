package l;

import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A1FQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13723 implements InterfaceC2799 {

    /* JADX INFO: renamed from: ۚܿۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f40988 = {4451, -30055, -30018, -30048, -30049, -30076, -30067, -29955, -30052, -30018, -30043, -30045, -30018, -30043, -30024, -30027, -30055, -30018, -30048, -29983, -30024, -30035, -30018, -30037, -30039, -30024, -29954, -29964, -30052, -30018, -30043, -30045, -30018, -30043, -30024, -30027, -30055, -30018, -30048, -30056, -30035, -30018, -30037, -30039, -30024, -29954, -29964, -30055, -30018, -30048, -30056, -30035, -30018, -30037, -30039, -30024, -29954, -29964, -30049, -30076, -30067, -29955, -30056, -30035, -30018, -30037, -30039, -30024, -29954, -29964, -30079, -30056, -29982, -30035, -30020, -30041, -30020, -30018, -30043, -30045, -30018, -30043, -30024, -30027, -30055, -30018, -30048, -30023, -30018, -30048, -30038, -30043, -30048, -30039, -30017, -30044, -30035, -29955, -30022, -30039, -30018, -30017, -30043, -30045, -30046, -30075, -30046, -30038, -30045, -30022, -30039, -30018, -30017, -30043, -30045, -30046, -30078, -30035, -30047, -30039, 2165, 13698, 13745, 13734, 13735, 13757, 13755, 13754, 13719, 13755, 13744, 13745, 13735, 13729, 13730, 13751, 13698, 13745, 13734, 13735, 13757, 13755, 13754, 13722, 13749, 13753, 13745, 13703, 13759, 13757, 13732, 13812, 13729, 13732, 13744, 13749, 13728, 13745, 13698, 13745, 13734, 13735, 13757, 13755, 13754, 13725, 13754, 13746, 13755, -18507, -22589, 17234, 13697, 13734, 13752, 13721, 13745, 13728, 13756, 13755, 13744, 13744, 13755, 13731, 13754, 13752, 13755, 13749, 13744, 13703, 13756, 13755, 13731, 13703, 13759, 13757, 13732, 13728, 13734, 13729, 13745, 20443, 28018, 18087, 13754, 13749, 13751, 13729, 13750, -21252, -23379, -23956, 13812, 20778, -23716, 24137, 22120, 19847, -19217, 19757, 19532, 25184, 5864, 18957, 25889, -24009};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6874 f40989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40990;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f40991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f40992;

    public C13723(C6874 c6874, Runnable runnable, boolean z) {
        int i = 1933168735;
        int i2 = C3683.f11629;
        int i3 = RunnableC0588.f2309;
        int iM2566 = C0630.m2566("ۤۗ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-3339)) ^ (-180100770);
        int i5 = 1503000788;
        while (true) {
            i = ((((i ^ i3) * (-13147)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2126786030:
                case 888416030:
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C0630.m2566("֡ۗ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * 26651) ^ 166606896;
                        i5 = 1321181450;
                    } else {
                        iM2566 = (C2105.m6981("ܳᩳ") ^ i2) * 37;
                        i4 = ((iM2566 ^ i3) * (-25765)) ^ (-1347866492);
                        i5 = -1090495089;
                    }
                    break;
                case -1674039728:
                case -393511250:
                    if (C21923.m49329()) {
                        iM2566 = (C0630.m2566("֡ۗ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * 26651) ^ 166606896;
                        i5 = 1321181450;
                    } else {
                        iM2566 = C2105.m6981("۟ۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31583) ^ (-1746741936);
                        i5 = -1270505778;
                    }
                    break;
                case -1401630991:
                case -1391270582:
                    this.f40989 = c6874;
                    this.f40991 = runnable;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("֨᩻") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 19511) ^ 523491564;
                        i5 = -380555395;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-11079)) ^ (-1034778054);
                        i5 = -466719805;
                    }
                    break;
                case -1231757881:
                case -1188606303:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ۗۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11787) ^ 2045968969;
                        i5 = -1096575761;
                    } else {
                        iM2566 = (C2105.m6981("֨᩻") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 19511) ^ 523491564;
                        i5 = -380555395;
                    }
                    break;
                case -309975181:
                case -203652344:
                    this.f40990 = z;
                    return;
                case -252282351:
                case 972808028:
                    C21923.m49329();
                    throw new RuntimeException();
                case -249938072:
                case 198202087:
                    C4075.m12263();
                    iM2566 = C2105.m6981("᩹ܰ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-21863)) ^ 201846080;
                    i5 = 1762573929;
                    break;
                case -215348957:
                case 379218637:
                    if (C3911.f12484 >= 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20139)) ^ (-1289762730);
                        i5 = -905345504;
                    } else {
                        iM2566 = C0630.m2566("۟᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 12187) ^ 715532226;
                        i5 = 1780978654;
                    }
                    break;
                case -201168676:
                case 1904306158:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20139)) ^ (-1289762730);
                        i5 = -905345504;
                    } else {
                        iM2566 = C0630.m2566("֨ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24561) ^ (-49179539);
                        i5 = -1066184512;
                    }
                    break;
                case 279528623:
                case 2041222782:
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("۠ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20139)) ^ (-1289762730);
                        i5 = -905345504;
                    } else {
                        iM2566 = (C2105.m6981("ۡۧ") ^ i3) * (-31);
                        i4 = ((iM2566 ^ i2) * 637) ^ 298325628;
                        i5 = 512594846;
                    }
                    break;
                case 434903597:
                case 767474308:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("֡ۗ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * 26651) ^ 166606896;
                        i5 = 1321181450;
                    } else {
                        iM2566 = C0630.m2566("᩵ܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29379)) ^ (-498548670);
                        i5 = -501313410;
                    }
                    break;
                case 660124068:
                case 2077758671:
                    C0237.m1481();
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("֨᩻") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 19511) ^ 523491564;
                        i5 = -380555395;
                    } else {
                        iM2566 = C2105.m6981("᩹ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21863)) ^ 201846080;
                        i5 = 1762573929;
                    }
                    break;
                case 811515183:
                case 1408411100:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("֡ۗ") ^ i2) * 23;
                        i4 = ((iM2566 ^ i3) * 26651) ^ 166606896;
                        i5 = 1321181450;
                    } else {
                        iM2566 = C2105.m6981("᩹ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-21863)) ^ 201846080;
                        i5 = 1762573929;
                    }
                    break;
                case 889119747:
                case 2040358284:
                    if (C4263.m12819() >= 0) {
                        iM2566 = (C2105.m6981("֨᩻") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 19511) ^ 523491564;
                        i5 = -380555395;
                    } else {
                        iM2566 = C0630.m2566("֡۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 30821) ^ (-722719987);
                        i5 = 883844531;
                    }
                    break;
                case 1142628855:
                case 1958697215:
                    if (C1005.f3721) {
                        iM2566 = (i3 - C2105.m6981("ܳ۠")) * 59;
                        i4 = ((iM2566 ^ i2) * 23501) ^ (-1403493840);
                        i5 = 88313306;
                    } else {
                        iM2566 = (C2105.m6981("֨᩻") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 19511) ^ 523491564;
                        i5 = -380555395;
                    }
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۗۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11787) ^ 2045968969;
                        i5 = -1096575761;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩹۫")) * 7;
                        i4 = ((iM2566 ^ i2) * 12885) ^ 1173657260;
                        i5 = 1145846565;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC2799
    /* JADX INFO: renamed from: ֫ */
    public final void mo8645(byte[] bArr) throws Throwable {
        Runnable runnable = null;
        Throwable th = null;
        int i = 1435688992;
        int i2 = C1047.f3863;
        int i3 = C1773.f6144;
        int iM6981 = (C2105.m6981("ۤܺ") + i3) * 25;
        int i4 = ((iM6981 ^ i2) * 29513) ^ (-975156294);
        int i5 = 1552255976;
        while (true) {
            i = ((((i ^ i2) * 22975) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2093329615:
                case 1546052319:
                    RunnableC3474.m10630();
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ᩶")) * 27;
                        i4 = ((iM6981 ^ i2) * 1545) ^ 54833956;
                        i5 = 636604659;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                        i5 = -197923097;
                    }
                    break;
                case -1829267618:
                case 1218799639:
                    C1711.m5731(runnable);
                    iM6981 = C2105.m6981("۫ܶ") ^ i3;
                    i4 = ((iM6981 ^ i2) * 32379) ^ (-1344939930);
                    i5 = -1724402071;
                    break;
                case -1803076613:
                case -1649576767:
                    if (C22628.m50615() == 0) {
                        iM6981 = C0630.m2566("ܰۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ 1696026053;
                        i5 = 331186452;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۜ᩶")) * 27;
                        i4 = ((iM6981 ^ i2) * 1545) ^ 54833956;
                        i5 = 636604659;
                    }
                    break;
                case -1789933229:
                case -871257596:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                        i5 = -197923097;
                    } else {
                        iM6981 = C0630.m2566("ᩴۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-17375)) ^ 195513433;
                        i5 = 1309050046;
                    }
                    break;
                case -1674529238:
                case 2023204261:
                    C0798.m3012(runnable);
                    iM6981 = C0630.m2566("ܳ᩵") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-26853)) ^ (-633921219);
                    i5 = 666839980;
                    break;
                case -1631231535:
                case 1726518583:
                    C1294.m4372();
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("ܽܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29497) ^ (-271873553);
                        i5 = 239251918;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                        i5 = -197923097;
                    }
                    break;
                case -1549317967:
                case -1015170269:
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ܽܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29497) ^ (-271873553);
                        i5 = 239251918;
                    } else {
                        iM6981 = (C2105.m6981("᩵ܿ") ^ i3) * (-71);
                        i4 = ((iM6981 ^ i2) * 2807) ^ (-781857822);
                        i5 = 861748833;
                    }
                    break;
                case -1541293004:
                case -1452522135:
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("ܰۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ 1696026053;
                        i5 = 331186452;
                    } else {
                        iM6981 = C2105.m6981("۬ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-32047)) ^ 2067385699;
                        i5 = -771821421;
                    }
                    break;
                case -1416513657:
                case 1786286485:
                    if (this.f40992) {
                        iM6981 = C0630.m2566("ܳ᩵") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26853)) ^ (-633921219);
                        i5 = 666839980;
                    } else {
                        iM6981 = C0630.m2566("۫۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 27049) ^ (-763894495);
                        i5 = 289959458;
                    }
                    break;
                case -1295426642:
                case -663436933:
                    if (C0798.m2998() != 0) {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                        i5 = -197923097;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۚ᩸")) * (-57);
                        i4 = ((iM6981 ^ i2) * 19665) ^ (-86605722);
                        i5 = 1241960058;
                    }
                    break;
                case -1215690188:
                case 427311534:
                    return;
                case -1203510494:
                case 1640587559:
                    try {
                        m33019(bArr);
                        iM6981 = C2105.m6981("᩶ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-18857)) ^ (-1520492091);
                        i5 = -1156767725;
                    } catch (Throwable th2) {
                        th = th2;
                        iM6981 = C0630.m2566("ܺܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28657) ^ 284016481;
                        i5 = -419400768;
                    }
                    break;
                case -1010451690:
                case 913710846:
                    if (this.f40992) {
                        iM6981 = C2105.m6981("۫ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32379) ^ (-1344939930);
                        i5 = -1724402071;
                    } else {
                        iM6981 = C2105.m6981("᩹ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22883) ^ (-1766112013);
                        i5 = -975284577;
                    }
                    break;
                case -938357305:
                case 1052669862:
                    C2520.m8026();
                    C7106.m19120();
                    iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                    i5 = -197923097;
                    break;
                case -770928174:
                case 1570206245:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("ܰۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ 1696026053;
                        i5 = 331186452;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۟ۡ")) * (-59);
                        i4 = ((iM6981 ^ i3) * (-747)) ^ (-2106767388);
                        i5 = -1045900841;
                    }
                    break;
                case -748218787:
                case -10250761:
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C2105.m6981("ᩳۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM6981 ^ i2) * (-13271)) ^ 730920458;
                        i5 = 1542990626;
                    } else {
                        iM6981 = (C2105.m6981("᩻ܺ") + i2) * 3;
                        i4 = ((iM6981 ^ i3) * 30541) ^ (-960692793);
                        i5 = -388714045;
                    }
                    break;
                case -628195581:
                case 1892213471:
                    C1005.m3501();
                    return;
                case -345242966:
                case 151172088:
                    throw th;
                case -219792162:
                case 1810991812:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۜ᩶")) * 27;
                        i4 = ((iM6981 ^ i2) * 1545) ^ 54833956;
                        i5 = 636604659;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۘܰ")) * 89;
                        i4 = ((iM6981 ^ i2) * 20753) ^ (-648117726);
                        i5 = -1924950208;
                    }
                    break;
                case 65035199:
                case 1621161913:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("ܰۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ 1696026053;
                        i5 = 331186452;
                    } else {
                        iM6981 = C2105.m6981("֡ۘ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 7737) ^ (-1985632734);
                        i5 = -35994884;
                    }
                    break;
                case 711617674:
                case 1084585307:
                    runnable = this.f40991;
                    iM6981 = (C2105.m6981("ۜ֡") ^ i3) * (-121);
                    i4 = ((iM6981 ^ i2) * 32015) ^ 1284758961;
                    i5 = -1986320062;
                    break;
                case 980017373:
                case 1303529404:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("ܰۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-14255)) ^ 1696026053;
                        i5 = 331186452;
                    } else {
                        iM6981 = C2105.m6981("ܳܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6931) ^ 1701092476;
                        i5 = 2141118442;
                    }
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-8345)) ^ (-971109785);
                        i5 = -197923097;
                    } else {
                        iM6981 = (C2105.m6981("۬۫") ^ i3) * 29;
                        i4 = ((iM6981 ^ i2) * (-25897)) ^ (-1496900558);
                        i5 = 736013372;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m33019(byte[] r51) {
        /*
            Method dump skipped, instruction units count: 3880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13723.m33019(byte[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c4 A[PHI: r11 r12
      0x00c4: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:28:0x00c2, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:28:0x00c2, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01bf A[PHI: r9
      0x01bf: PHI (r9v6 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:49:0x01bd, B:18:0x006e, B:16:0x006a, B:105:0x01bf, B:104:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024c A[PHI: r2 r4 r5 r6 r7 r8 r13
      0x024c: PHI (r2v3 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v4 java.lang.String)
     binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:65:0x024a, B:61:0x022c, B:57:0x020e, B:53:0x01f3, B:24:0x00a1, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC2799
    /* JADX INFO: renamed from: ֫ */
    public final void mo8644(IOException iOException) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        short[] sArr;
        C13723 c13723 = this;
        int i4 = RunnableC3474.f10992;
        int i5 = C4616.f14690;
        int iM2566 = C0630.m2566("ۨ᩵") ^ i5;
        int i6 = ((iM2566 ^ i4) * (-3369)) ^ 1057859918;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2566 ^ (-701157424);
        String strM6311 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -44900306;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * (-23977)) >> 31));
            switch (i13) {
                case -2119138317:
                case 1554368243:
                    i9 = i8 + 1;
                    if (C1504.m5179()) {
                        iM6981 = C0630.m2566("ܰܺ") ^ i4;
                        i = ((iM6981 ^ i5) * 25567) ^ (-418146604);
                        i2 = -135805517;
                    } else {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -2064228335:
                case 1762672553:
                    C1294.m4372();
                    if (C0483.f2088 < 0) {
                        sArr = sArr2;
                        int iM2567 = (C0630.m2566("ᩳܳ") ^ i4) * (-21);
                        i7 = iM2567 ^ 1893120562;
                        sArr2 = sArr;
                        i6 = ((iM2567 ^ i5) * (-4865)) ^ (-75609347);
                        c13723 = this;
                    } else {
                        iM6981 = (C0630.m2566("᩻֨") + i5) * (-23);
                        i = ((iM6981 ^ i4) * 2447) ^ 1513390835;
                        i2 = -157224889;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -2047967050:
                case 1261407685:
                    i8 = s * s2;
                    if (C7106.f21815 != 0) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    } else {
                        iM6981 = (C2105.m6981("ۖ᩷") ^ i5) * 47;
                        i = ((iM6981 ^ i4) * (-24109)) ^ 1947704070;
                        i2 = 1090005884;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -2040918059:
                case 1785723732:
                    int i14 = s + s3;
                    if (i9 - (i14 * i14) <= 0) {
                        iM6981 = C0630.m2566("᩺ܿ") ^ i5;
                        i = ((iM6981 ^ i4) * 25047) ^ 2119915436;
                        i2 = -90939752;
                    } else {
                        iM6981 = (C0630.m2566("ۗۗ") ^ i4) * 13;
                        i = ((iM6981 ^ i5) * (-20411)) ^ (-1605083637);
                        i2 = -444316905;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -2028438435:
                case 30661873:
                    if (C4616.f14690 > 0) {
                        iM6981 = (C0630.m2566("᩻֨") + i5) * (-23);
                        i = ((iM6981 ^ i4) * 2447) ^ 1513390835;
                        i2 = -157224889;
                    } else {
                        iM6981 = C2105.m6981("ۨ۬") ^ i5;
                        i = ((iM6981 ^ i4) * 25381) ^ 339228468;
                        i2 = 1795893212;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1990952757:
                case 2074940813:
                    c = 222;
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    } else {
                        iM6981 = (i5 - C2105.m6981("᩷ۙ")) * (-27);
                        i = ((iM6981 ^ i4) * (-21897)) ^ 550273795;
                        i2 = 641311779;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1777471980:
                case -1554652807:
                    s3 = 1;
                    if (C0422.m1963()) {
                        iM6981 = (C2105.m6981("᩷֨") ^ i4) * (-53);
                        i = ((iM6981 ^ i5) * (-29713)) ^ 221318509;
                        i2 = 1020639681;
                    } else {
                        iM6981 = (C0630.m2566("᩻֨") + i5) * (-23);
                        i = ((iM6981 ^ i4) * 2447) ^ 1513390835;
                        i2 = -157224889;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1613178632:
                case 493317630:
                    i10 = 47825;
                    iM6981 = (C0630.m2566("ۨۗ") ^ i5) * 53;
                    i = ((iM6981 ^ i4) * (-26401)) ^ (-1276665360);
                    i2 = 912718495;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1543870192:
                case 662788494:
                    sArr = f40988;
                    if (!C2126.m7040()) {
                        int iM6983 = (C2105.m6981("۟۟") + i5) * 73;
                        i = ((iM6983 ^ i4) * 24847) ^ 29097605;
                        i7 = iM6983 ^ 1887183405;
                        c13723 = this;
                        sArr2 = sArr;
                        i6 = i;
                    } else {
                        int iM2568 = (C0630.m2566("ᩳܳ") ^ i4) * (-21);
                        i7 = iM2568 ^ 1893120562;
                        sArr2 = sArr;
                        i6 = ((iM2568 ^ i5) * (-4865)) ^ (-75609347);
                        c13723 = this;
                    }
                    break;
                case -1529640461:
                case -259128931:
                    if (C0422.f1886 <= 0) {
                        iM6982 = C0630.m2566("ۧۡ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-5107)) ^ (-687136781);
                        i3 = -451120794;
                    } else {
                        iM6982 = (i4 - C2105.m6981("ۜ۠")) * (-121);
                        i6 = ((iM6982 ^ i5) * (-11923)) ^ (-1656075283);
                        i3 = -1611803887;
                    }
                    i7 = iM6982 ^ i3;
                    c13723 = this;
                    break;
                case -1473420543:
                case 1303389208:
                    C7811.m20844();
                    iM6981 = (C0630.m2566("᩻֨") + i5) * (-23);
                    i = ((iM6981 ^ i4) * 2447) ^ 1513390835;
                    i2 = -157224889;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1416899671:
                case -601047971:
                    i10 = 15218;
                    iM6981 = (C0630.m2566("ۨۗ") ^ i5) * 53;
                    i = ((iM6981 ^ i4) * (-26401)) ^ (-1276665360);
                    i2 = 912718495;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1336913348:
                case 1163257335:
                    C1711.m5731(c13723.f40991);
                    iM6981 = (i4 - C0630.m2566("᩶᩻")) * (-107);
                    i = ((iM6981 ^ i5) * 7073) ^ (-632363586);
                    i2 = -642569608;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1235644930:
                case 852592932:
                    if (c13723.f40992) {
                        iM6981 = (i4 - C0630.m2566("᩶᩻")) * (-107);
                        i = ((iM6981 ^ i5) * 7073) ^ (-632363586);
                        i2 = -642569608;
                    } else {
                        iM6981 = (i5 - C2105.m6981("ۤ᩸")) * 83;
                        i = ((iM6981 ^ i4) * 30999) ^ (-927880796);
                        i2 = -875658189;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1119790843:
                case 1984896851:
                    AbstractC2021.m6574();
                    if (C3432.f10845 >= 0) {
                        iM6982 = C0630.m2566("ۧۡ") ^ i4;
                        i6 = ((iM6982 ^ i5) * (-5107)) ^ (-687136781);
                        i3 = -451120794;
                        i7 = iM6982 ^ i3;
                        c13723 = this;
                    } else {
                        iM6981 = (C0630.m2566("᩻֨") + i5) * (-23);
                        i = ((iM6981 ^ i4) * 2447) ^ 1513390835;
                        i2 = -157224889;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -935334821:
                case 242294538:
                    sArr3 = f40988;
                    i11 = 223;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C2105.m6981("ۨ۬") ^ i5;
                        i = ((iM6981 ^ i4) * 25381) ^ 339228468;
                        i2 = 1795893212;
                    } else {
                        iM6981 = (C0630.m2566("֫۟") ^ i5) * (-89);
                        i = ((iM6981 ^ i4) * (-23753)) ^ 1029909465;
                        i2 = -1376672324;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -859871851:
                case 1868261403:
                    s = sArr2[c];
                    s2 = 2;
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۜ֡")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM6981 ^ i5) * 26743) ^ (-667075301);
                        i2 = -241300818;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -846274704:
                case -79717882:
                    c13723.f40989.f21241 = false;
                    if (c13723.f40990) {
                        iM6981 = (C0630.m2566("ۧ۠") ^ i4) * 75;
                        i = ((iM6981 ^ i5) * (-25663)) ^ 2072272141;
                        i2 = 1444381460;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ᩹") ^ i5) * 35;
                        i = ((iM6981 ^ i4) * 8561) ^ 519705854;
                        i2 = -2096878871;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -786955815:
                case -108748824:
                    break;
                case -600613762:
                case 623452016:
                    i12 = 3;
                    if (C3663.m11168() >= 0) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۤ") + i4) * (-29);
                        i = ((iM6981 ^ i5) * 16277) ^ (-1276445722);
                        i2 = 136563521;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -235146935:
                case 1882153181:
                    C3663.m11161(C2105.m6981(strM6311) ^ 2124681974);
                    iM6981 = (C0630.m2566("ۧ۠") ^ i4) * 75;
                    i = ((iM6981 ^ i5) * (-25663)) ^ 2072272141;
                    i2 = 1444381460;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 1750769513:
                case 1920223826:
                    C2167.m7155();
                    break;
                default:
                    strM6311 = C1916.m6311(sArr3, i11, i12, i10);
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("֨ۘ") ^ i5;
                        i = ((iM6981 ^ i4) * 21057) ^ (-1984134965);
                        i2 = 1358198691;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۨܿ")) * (-17);
                        i = ((iM6981 ^ i5) * (-22523)) ^ (-702273754);
                        i2 = -1903363325;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33018(C13723 c13723, boolean z, String str, HashMap map, DialogInterfaceC0206 dialogInterfaceC0206, String str2, View view) {
        int iM2566;
        int i;
        int i2;
        String str3;
        short[] sArr;
        int i3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int iM6981;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        int i8;
        int iM2567;
        int i9;
        int i10;
        int i11;
        String str9;
        String str10;
        String strM9934;
        String strM6311;
        String str11;
        int i12;
        int i13;
        int iM2568;
        int i14;
        short[] sArr2;
        String str12;
        int iM2569;
        int i15;
        short[] sArr3;
        str = str;
        String strM7507 = null;
        AbstractC15440 abstractC15440 = null;
        boolean zM4917 = false;
        boolean zM4369 = false;
        short[] sArr4 = null;
        int i16 = -1044131423;
        int i17 = C1047.f3863;
        int i18 = C0422.f1886;
        int iM6983 = (i18 - C2105.m6981("᩷᩸")) * 73;
        int i19 = ((iM6983 ^ i17) * (-1343)) ^ 89916536;
        int i20 = iM6983 ^ (-1138985320);
        String str13 = null;
        AbstractC15440 abstractC15441 = null;
        StringBuilder sb = null;
        String str14 = null;
        String strM3502 = null;
        String str15 = null;
        C0994 c0994 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        C6874 c6874 = null;
        String strM2816 = null;
        String str16 = null;
        short[] sArr7 = null;
        int i27 = 0;
        String str17 = null;
        String str18 = null;
        int i28 = 0;
        String strM948 = null;
        String str19 = null;
        String strM12355 = null;
        short[] sArr8 = null;
        String str20 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 29879) >> 31));
            switch (i16) {
                case -2100263682:
                case -1143537621:
                    str20 = str20;
                    str15 = str15;
                    str17 = str17;
                    sArr6 = sArr6;
                    i21 = i21;
                    str19 = str19;
                    str13 = str13;
                    str18 = str18;
                    i25 = i25;
                    strM3502 = strM3502;
                    str16 = str16;
                    sb = sb;
                    i26 = i26;
                    strM7507 = strM7507;
                    C6874 c6875 = c13723.f40989;
                    strM948 = C0050.m948(f40988, 1, 3, i22);
                    if (z) {
                        iM6982 = (C2105.m6981("֫᩹") + i17) * 39;
                        i6 = ((iM6982 ^ i18) * 4023) ^ (-788232801);
                        i7 = 1826783682;
                    } else {
                        iM6982 = C2105.m6981("᩺ܶ") ^ i18;
                        i6 = ((iM6982 ^ i17) * (-20477)) ^ 34410078;
                        i7 = -854194111;
                    }
                    i8 = iM6982 ^ i7;
                    c6874 = c6875;
                    i19 = i6;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case -1956442422:
                case -1507044390:
                    zM4369 = C1294.m4369(str19, C20812.m47627(abstractC15440, strM7507));
                    iM2566 = (C0630.m2566("᩵ᩳ") ^ i17) * 57;
                    i = ((iM2566 ^ i18) * 5869) ^ 1792765409;
                    i2 = 927564166;
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    break;
                case -1845871730:
                case 1844339432:
                    sArr3 = sArr6;
                    C1047.m3594(c0994, C1128.m3841(sArr3, i23, i27, i22), C4117.m12359(abstractC15440));
                    sArr8 = f40988;
                    i24 = 4;
                    if (C1047.m3599() >= 0) {
                        i21 = 94;
                        int iM6984 = C2105.m6981("ܿۚ") ^ i17;
                        int i29 = i21;
                        int i30 = ((iM6984 ^ i18) * 12443) ^ 471865431;
                        i20 = iM6984 ^ (-248781654);
                        i19 = i30;
                        i21 = i29;
                        sArr6 = sArr3;
                    } else {
                        int iM25610 = C0630.m2566("᩺ۙ") ^ i18;
                        int i31 = ((iM25610 ^ i17) * 29161) ^ (-1207354202);
                        i20 = iM25610 ^ 454381388;
                        i19 = i31;
                        sArr6 = sArr3;
                        i21 = 94;
                    }
                    break;
                case -1843054368:
                case 774546008:
                    strM7507 = strM7507;
                    str8 = str16;
                    str20 = str20;
                    strM3502 = strM3502;
                    str5 = str15;
                    str7 = str17;
                    sArr = sArr6;
                    i3 = i21;
                    str6 = str19;
                    str13 = str13;
                    sb = sb;
                    C1420.m4905(sb, str);
                    str18 = str18;
                    C1420.m4905(sb, str18);
                    sArr5 = f40988;
                    i25 = 72;
                    if (C3432.f10845 < 0) {
                        int iM6985 = (C2105.m6981("ۜܰ") ^ i18) * (-125);
                        int i32 = ((iM6985 ^ i17) * (-20021)) ^ (-860354170);
                        i11 = iM6985 ^ (-798442033);
                        i19 = i32;
                        str18 = str18;
                        sb = sb;
                        strM3502 = strM3502;
                        str13 = str13;
                        i21 = i3;
                        str19 = str6;
                        str20 = str20;
                        i25 = 72;
                        str16 = str8;
                        sArr6 = sArr;
                        strM7507 = strM7507;
                        str17 = str7;
                        str15 = str5;
                        i26 = 4;
                        i20 = i11;
                        str = str;
                    } else {
                        i26 = 4;
                        int iM25611 = C0630.m2566("᩷۬") ^ i18;
                        i19 = ((iM25611 ^ i17) * (-11983)) ^ (-1174894936);
                        str16 = str8;
                        strM3502 = strM3502;
                        strM7507 = strM7507;
                        i25 = i25;
                        i26 = i26;
                        sb = sb;
                        str18 = str18;
                        i21 = i3;
                        str19 = str6;
                        sArr6 = sArr;
                        str17 = str7;
                        str15 = str5;
                        i20 = iM25611 ^ (-593863980);
                        str13 = str13;
                        str20 = str20;
                    }
                    break;
                case -1506219080:
                case 1381627593:
                    str20 = str20;
                    str15 = str15;
                    str17 = str17;
                    sArr6 = sArr6;
                    i21 = i21;
                    str19 = str19;
                    strM948 = strM948;
                    str13 = str13;
                    str18 = str18;
                    i25 = i25;
                    strM3502 = strM3502;
                    str16 = str16;
                    sb = sb;
                    i26 = i26;
                    strM7507 = strM7507;
                    sArr4 = f40988;
                    if (C4263.f13799 <= 0) {
                        iM6981 = (i17 - C0630.m2566("ۧۢ")) * 95;
                        i4 = ((iM6981 ^ i18) * (-27799)) ^ (-151669343);
                        i5 = 865360068;
                    } else {
                        iM6981 = (C2105.m6981("۫۟") ^ i18) * (-87);
                        i4 = ((iM6981 ^ i17) * 12923) ^ 668526134;
                        i5 = 1183866862;
                    }
                    i8 = iM6981 ^ i5;
                    i19 = i4;
                    strM948 = strM948;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case -1268324670:
                case -574579754:
                    i22 = 47713;
                    iM6981 = C2105.m6981("ۧۤ") ^ i18;
                    i4 = ((iM6981 ^ i17) * 11215) ^ (-2075001970);
                    i5 = -1707402462;
                    i8 = iM6981 ^ i5;
                    i19 = i4;
                    strM948 = strM948;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case -1247545816:
                case -528597532:
                    str15 = str15;
                    str17 = str17;
                    sArr2 = sArr6;
                    i21 = i21;
                    str12 = str19;
                    try {
                        zM4917 = C1420.m4917(abstractC15440);
                        iM2569 = (i17 - C0630.m2566("֡᩶")) * (-3);
                        i19 = ((iM2569 ^ i18) * 27913) ^ (-670088022);
                        i15 = -2076483296;
                    } catch (Exception unused) {
                        iM2569 = C0630.m2566("ۘᩴ") ^ i18;
                        i19 = ((iM2569 ^ i17) * (-14913)) ^ (-1539035574);
                        i15 = 1989662225;
                    }
                    i14 = iM2569 ^ i15;
                    str19 = str12;
                    sArr6 = sArr2;
                    String str21 = str15;
                    i20 = i14;
                    i21 = i21;
                    str17 = str17;
                    str15 = str21;
                    break;
                case -1220908935:
                case -1175903042:
                    if (!zM4369) {
                        str15 = str15;
                        str17 = str17;
                        sArr2 = sArr6;
                        i21 = i21;
                        str12 = str19;
                        iM2569 = C0630.m2566("ۘᩴ") ^ i18;
                        i19 = ((iM2569 ^ i17) * (-14913)) ^ (-1539035574);
                        i15 = 1989662225;
                        i14 = iM2569 ^ i15;
                        str19 = str12;
                        sArr6 = sArr2;
                        String str22 = str15;
                        i20 = i14;
                        i21 = i21;
                        str17 = str17;
                        str15 = str22;
                    } else {
                        iM2566 = (C0630.m2566("֡۟") + i17) * (-79);
                        i = ((iM2566 ^ i18) * (-10921)) ^ 244565138;
                        i2 = 687092569;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    }
                    break;
                case -1213931369:
                case -915074101:
                    break;
                case -1141069232:
                case 646866870:
                    i26 = i26;
                    str20 = str20;
                    str15 = str15;
                    str17 = str17;
                    sArr6 = sArr6;
                    i21 = i21;
                    str19 = str19;
                    strM7507 = strM7507;
                    String str23 = str18;
                    str13 = str13;
                    i25 = i25;
                    strM3502 = strM3502;
                    abstractC15441 = C16293.f50111;
                    str18 = str23;
                    str16 = str16;
                    StringBuilder sb2 = new StringBuilder(C1916.m6311(f40988, 70, 2, i22));
                    if (C7106.f21815 == 0) {
                        int iM6986 = C2105.m6981("᩺ۚ") ^ i17;
                        int i33 = ((iM6986 ^ i18) * 23787) ^ (-2066166752);
                        i14 = iM6986 ^ (-1554932591);
                        i19 = i33;
                        strM7507 = strM7507;
                        str16 = str16;
                        str19 = str19;
                        sArr6 = sArr6;
                        i26 = i26;
                        strM3502 = strM3502;
                        sb = sb2;
                        i25 = i25;
                        str18 = str18;
                        str13 = str13;
                        str20 = str20;
                        str = str;
                        String str24 = str15;
                        i20 = i14;
                        i21 = i21;
                        str17 = str17;
                        str15 = str24;
                    } else {
                        sb = sb2;
                        strM948 = strM948;
                        iM6981 = (i17 - C0630.m2566("ۧۢ")) * 95;
                        i4 = ((iM6981 ^ i18) * (-27799)) ^ (-151669343);
                        i5 = 865360068;
                        i8 = iM6981 ^ i5;
                        i19 = i4;
                        strM948 = strM948;
                        strM7507 = strM7507;
                        i21 = i21;
                        str19 = str19;
                        sArr6 = sArr6;
                        i26 = i26;
                        str17 = str17;
                        str15 = str15;
                        i20 = i8;
                        sb = sb;
                        str16 = str16;
                        strM3502 = strM3502;
                        i25 = i25;
                        str18 = str18;
                        str13 = str13;
                        str20 = str20;
                    }
                    break;
                case -1120519916:
                case 1347420989:
                    ViewOnClickListenerC1958.m6429();
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("᩶᩹") ^ i18;
                        i = ((iM2566 ^ i17) * (-1639)) ^ (-869979657);
                        i2 = 1608796534;
                    } else {
                        iM2566 = (C0630.m2566("ۖܶ") ^ i18) * (-53);
                        i = ((iM2566 ^ i17) * 17209) ^ (-873689648);
                        i2 = 347013382;
                    }
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    break;
                case -1048744205:
                case -548711559:
                    str20 = str20;
                    str15 = str15;
                    str17 = str17;
                    sArr6 = sArr6;
                    i21 = i21;
                    str19 = str19;
                    strM948 = strM948;
                    str13 = str13;
                    str18 = str18;
                    i25 = i25;
                    strM3502 = strM3502;
                    str16 = str16;
                    sb = sb;
                    i26 = i26;
                    strM7507 = strM7507;
                    short s = sArr4[0];
                    int i34 = 55576 * s;
                    int i35 = s + 13894;
                    if (i34 - (i35 * i35) > 0) {
                        iM6981 = C2105.m6981("ۤۘ") ^ i17;
                        i4 = ((iM6981 ^ i18) * 9275) ^ 1393953120;
                        i5 = 1354253003;
                    } else {
                        iM6981 = C0630.m2566("᩶᩺") ^ i17;
                        i4 = ((iM6981 ^ i18) * (-25403)) ^ 1501321521;
                        i5 = 1768028751;
                    }
                    i8 = iM6981 ^ i5;
                    i19 = i4;
                    strM948 = strM948;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case -1013546963:
                case 910800207:
                    if (!C1005.f3721) {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i17;
                        i = ((iM2566 ^ i18) * (-30931)) ^ 1917328816;
                        i2 = -1070877862;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    } else {
                        sArr3 = sArr6;
                        int iM6987 = C2105.m6981("ܿۚ") ^ i17;
                        int i210 = i21;
                        int i36 = ((iM6987 ^ i18) * 12443) ^ 471865431;
                        i20 = iM6987 ^ (-248781654);
                        i19 = i36;
                        i21 = i210;
                        sArr6 = sArr3;
                    }
                    break;
                case -999153024:
                case 1680040325:
                    C1128.m3851();
                    if (RunnableC3474.f10992 <= 0) {
                        str20 = str20;
                        str15 = str15;
                        str17 = str17;
                        sArr6 = sArr6;
                        i21 = i21;
                        str19 = str19;
                        strM948 = strM948;
                        str13 = str13;
                        str18 = str18;
                        i25 = i25;
                        strM3502 = strM3502;
                        str16 = str16;
                        sb = sb;
                        i26 = i26;
                        strM7507 = strM7507;
                        iM6981 = (i17 - C0630.m2566("ۧۢ")) * 95;
                        i4 = ((iM6981 ^ i18) * (-27799)) ^ (-151669343);
                        i5 = 865360068;
                        i8 = iM6981 ^ i5;
                        i19 = i4;
                        strM948 = strM948;
                        strM7507 = strM7507;
                        i21 = i21;
                        str19 = str19;
                        sArr6 = sArr6;
                        i26 = i26;
                        str17 = str17;
                        str15 = str15;
                        i20 = i8;
                        sb = sb;
                        str16 = str16;
                        strM3502 = strM3502;
                        i25 = i25;
                        str18 = str18;
                        str13 = str13;
                        str20 = str20;
                    } else {
                        iM2566 = C0630.m2566("᩶᩹") ^ i18;
                        i = ((iM2566 ^ i17) * (-1639)) ^ (-869979657);
                        i2 = 1608796534;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    }
                    break;
                case -744412284:
                case -407176989:
                    str15 = str15;
                    str17 = str17;
                    sArr2 = sArr6;
                    i21 = i21;
                    str12 = str19;
                    if (zM4917) {
                        iM2569 = C0630.m2566("ᩳۙ") ^ i18;
                        i19 = ((iM2569 ^ i17) * 24219) ^ (-1324598198);
                        i15 = -1819576563;
                    } else {
                        iM2569 = C0630.m2566("ۘᩴ") ^ i18;
                        i19 = ((iM2569 ^ i17) * (-14913)) ^ (-1539035574);
                        i15 = 1989662225;
                    }
                    i14 = iM2569 ^ i15;
                    str19 = str12;
                    sArr6 = sArr2;
                    String str25 = str15;
                    i20 = i14;
                    i21 = i21;
                    str17 = str17;
                    str15 = str25;
                    break;
                case -704745284:
                case 1317029470:
                    C1504.m5172(dialogInterfaceC0206);
                    C21923.m49335(c6874.f21240, (String) C0964.m3410(map, strM948));
                    break;
                case -666492250:
                case 2135584718:
                    try {
                        C20549.m47080(c6874.f21240, abstractC15440, C4925.m14337());
                        C22628.m50613(view, true);
                        iM2566 = C2105.m6981("ۖ᩹") ^ i18;
                        i = ((iM2566 ^ i17) * (-16369)) ^ (-1485444103);
                        i2 = -778125655;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    } catch (Exception unused2) {
                        str15 = str15;
                        str17 = str17;
                        sArr2 = sArr6;
                        i21 = i21;
                        str12 = str19;
                        iM2569 = C0630.m2566("ۘᩴ") ^ i18;
                        i19 = ((iM2569 ^ i17) * (-14913)) ^ (-1539035574);
                        i15 = 1989662225;
                        i14 = iM2569 ^ i15;
                        str19 = str12;
                        sArr6 = sArr2;
                        String str26 = str15;
                        i20 = i14;
                        i21 = i21;
                        str17 = str17;
                        str15 = str26;
                    }
                    break;
                case -573873852:
                case 77521456:
                    int i37 = i25;
                    str20 = str20;
                    strM3502 = strM3502;
                    str5 = str15;
                    str7 = str17;
                    sArr = sArr6;
                    i3 = i21;
                    str6 = str19;
                    int i38 = i26;
                    strM7507 = strM7507;
                    sb = sb;
                    C1420.m4905(sb, C0798.m3005(sArr5, i37, i38, i22));
                    i26 = i38;
                    AbstractC15440 abstractC15440M5171 = C1504.m5171(abstractC15441, C0050.m947(sb));
                    String str27 = str13;
                    str8 = str16;
                    str14 = (String) C13843.getOrDefault(map, str8, str27);
                    if (C4117.f13076 <= 0) {
                        str13 = str27;
                        str18 = str18;
                        i25 = i37;
                        abstractC15440 = abstractC15440M5171;
                        int iM25612 = C0630.m2566("᩷۬") ^ i18;
                        i19 = ((iM25612 ^ i17) * (-11983)) ^ (-1174894936);
                        str16 = str8;
                        strM3502 = strM3502;
                        strM7507 = strM7507;
                        i25 = i25;
                        i26 = i26;
                        sb = sb;
                        str18 = str18;
                        i21 = i3;
                        str19 = str6;
                        sArr6 = sArr;
                        str17 = str7;
                        str15 = str5;
                        i20 = iM25612 ^ (-593863980);
                        str13 = str13;
                        str20 = str20;
                    } else {
                        int iM25613 = (C0630.m2566("᩺֡") + i17) * (-113);
                        i19 = ((iM25613 ^ i18) * (-15659)) ^ (-730618084);
                        strM3502 = strM3502;
                        str19 = str6;
                        sArr6 = sArr;
                        i25 = i37;
                        abstractC15440 = abstractC15440M5171;
                        str13 = str27;
                        str20 = str20;
                        sb = sb;
                        i21 = i3;
                        str17 = str7;
                        str15 = str5;
                        i20 = iM25613 ^ (-1328659080);
                        str16 = str8;
                        strM7507 = strM7507;
                        i26 = i26;
                    }
                    break;
                case -511368765:
                case 428007772:
                    String str28 = str18;
                    int i39 = i25;
                    String str29 = str20;
                    String str30 = strM3502;
                    String str31 = str15;
                    String str32 = str17;
                    short[] sArr9 = sArr6;
                    int i40 = i21;
                    String str33 = str19;
                    String str34 = str16;
                    StringBuilder sb3 = sb;
                    int i41 = i26;
                    C22628.m50613(view, false);
                    int i42 = C4925.m14303().targetSdkVersion;
                    strM7507 = C2272.m7507(f40988, 4, 4, i22);
                    if (i42 == 28) {
                        iM2567 = C2105.m6981("۬۟") ^ i17;
                        i9 = ((iM2567 ^ i18) * 21143) ^ (-1778793448);
                        i10 = -869617883;
                    } else {
                        iM2567 = (C0630.m2566("ܽ᩸") ^ i18) * (-17);
                        i9 = ((iM2567 ^ i17) * (-29203)) ^ (-1542890948);
                        i10 = 93318857;
                    }
                    i11 = iM2567 ^ i10;
                    i19 = i9;
                    i26 = i41;
                    str19 = str33;
                    str20 = str29;
                    sArr6 = sArr9;
                    sb = sb3;
                    str16 = str34;
                    strM3502 = str30;
                    i25 = i39;
                    str18 = str28;
                    str13 = "";
                    i21 = i40;
                    str17 = str32;
                    str15 = str31;
                    i20 = i11;
                    str = str;
                    break;
                case -497345961:
                case 694230696:
                    C1047.m3594(c0994, C1294.m4373(sArr7, i28, 11, i22), str2);
                    RunnableC1937.m6379(c0994, C2126.m7036(f40988, 109, 11, i22), str);
                    c0994.m3469();
                    break;
                case -468012574:
                case 1763021967:
                    i22 = 35532;
                    iM6981 = C2105.m6981("ۧۤ") ^ i18;
                    i4 = ((iM6981 ^ i17) * 11215) ^ (-2075001970);
                    i5 = -1707402462;
                    i8 = iM6981 ^ i5;
                    i19 = i4;
                    strM948 = strM948;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case -134613447:
                case 350976416:
                    String str35 = str17;
                    String str36 = str14;
                    C1047.m3594(c0994, str35, str36);
                    i3 = i21;
                    str3 = str15;
                    RunnableC1937.m6379(c0994, C22628.m50602(f40988, 87, 3, i22), str3);
                    sArr6 = f40988;
                    i27 = 4;
                    if (C3432.f10845 >= 0) {
                        str14 = str36;
                        str4 = str35;
                        i23 = 90;
                        int iM25614 = (C0630.m2566("ۧ᩻") + i17) * 17;
                        i = ((iM25614 ^ i18) * (-21455)) ^ (-1893325635);
                        i20 = iM25614 ^ 1348199368;
                        c0994 = null;
                        i21 = i3;
                        str17 = str4;
                        str15 = str3;
                        i19 = i;
                    } else {
                        int iM25615 = C0630.m2566("ܿܶ") ^ i17;
                        int i43 = ((iM25615 ^ i18) * 14463) ^ (-2088018777);
                        i20 = iM25615 ^ 478337328;
                        str15 = str3;
                        str14 = str36;
                        i19 = i43;
                        i21 = i3;
                        str17 = str35;
                        i23 = 90;
                    }
                    break;
                case -101585808:
                case 1191986356:
                    C4159.m12565();
                    C4117.m12364();
                    sArr3 = sArr6;
                    int iM6988 = C2105.m6981("ܿۚ") ^ i17;
                    int i211 = i21;
                    int i310 = ((iM6988 ^ i18) * 12443) ^ 471865431;
                    i20 = iM6988 ^ (-248781654);
                    i19 = i310;
                    i21 = i211;
                    sArr6 = sArr3;
                    break;
                case 66926546:
                case 1407756219:
                    RunnableC1937.m6379(c0994, RunnableC0588.m2436(sArr8, i21, i24, i22), str19);
                    sArr7 = f40988;
                    if (C0798.f2919) {
                        sArr3 = sArr6;
                        i28 = 98;
                        int iM6989 = C2105.m6981("ܿۚ") ^ i17;
                        int i212 = i21;
                        int i311 = ((iM6989 ^ i18) * 12443) ^ 471865431;
                        i20 = iM6989 ^ (-248781654);
                        i19 = i311;
                        i21 = i212;
                        sArr6 = sArr3;
                    } else {
                        int iM25616 = (i17 - C0630.m2566("ۗܳ")) * 21;
                        i20 = iM25616 ^ (-1280873703);
                        i19 = ((iM25616 ^ i18) * (-10777)) ^ 363252783;
                        i28 = 98;
                    }
                    break;
                case 652581052:
                case 1286362230:
                    C5695.m16023();
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("᩺ܽ") ^ i17;
                        i = ((iM2566 ^ i18) * 4573) ^ 1488778102;
                        i2 = 810352766;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    } else {
                        sArr3 = sArr6;
                        int iM69810 = C2105.m6981("ܿۚ") ^ i17;
                        int i213 = i21;
                        int i312 = ((iM69810 ^ i18) * 12443) ^ 471865431;
                        i20 = iM69810 ^ (-248781654);
                        i19 = i312;
                        i21 = i213;
                        sArr6 = sArr3;
                    }
                    break;
                case 727483462:
                case 1512329404:
                    str9 = str13;
                    str10 = strM7507;
                    strM3502 = C1005.m3502(f40988, 47, 11, i22);
                    strM6311 = C1916.m6311(f40988, 58, 12, i22);
                    str11 = strM2816;
                    strM9934 = strM12355;
                    int iM25617 = C0630.m2566("֡ۚ") ^ i18;
                    i19 = ((iM25617 ^ i17) * (-11441)) ^ (-1147493639);
                    i25 = i25;
                    str18 = str11;
                    str13 = str9;
                    str = str;
                    str20 = strM6311;
                    str19 = str19;
                    sArr6 = sArr6;
                    str16 = strM9934;
                    i21 = i21;
                    str17 = str17;
                    str15 = str15;
                    i20 = iM25617 ^ (-1558750200);
                    strM7507 = str10;
                    i26 = i26;
                    sb = sb;
                    break;
                case 747131956:
                case 894677093:
                    C0050.m940();
                    if (C3746.f11829 > 0) {
                        str5 = str15;
                        str7 = str17;
                        sArr = sArr6;
                        i3 = i21;
                        str6 = str19;
                        str8 = str16;
                        int iM25618 = C0630.m2566("᩷۬") ^ i18;
                        i19 = ((iM25618 ^ i17) * (-11983)) ^ (-1174894936);
                        str16 = str8;
                        strM3502 = strM3502;
                        strM7507 = strM7507;
                        i25 = i25;
                        i26 = i26;
                        sb = sb;
                        str18 = str18;
                        i21 = i3;
                        str19 = str6;
                        sArr6 = sArr;
                        str17 = str7;
                        str15 = str5;
                        i20 = iM25618 ^ (-593863980);
                        str13 = str13;
                        str20 = str20;
                    } else {
                        iM2566 = C2105.m6981("᩺ܽ") ^ i17;
                        i = ((iM2566 ^ i18) * 4573) ^ 1488778102;
                        i2 = 810352766;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    }
                    break;
                case 1012305992:
                case 1843998609:
                    String str37 = strM3502;
                    String str38 = str17;
                    String str39 = (String) C0964.m3410(map, str37);
                    int i44 = i21;
                    String str40 = str20;
                    String str41 = (String) C4263.m12820(map, str40);
                    C21374.m48465();
                    int iM25619 = (C0630.m2566("ۙ᩸") + i18) * (-33);
                    str20 = str40;
                    int i45 = ((iM25619 ^ i17) * 6269) ^ (-462849847);
                    i20 = iM25619 ^ 703835044;
                    i19 = i45;
                    sArr6 = sArr6;
                    i21 = i44;
                    str17 = str38;
                    str15 = str39;
                    strM3502 = str37;
                    str19 = str41;
                    str20 = str20;
                    break;
                case 1095923519:
                case 1427411402:
                    str20 = str20;
                    str15 = str15;
                    str17 = str17;
                    sArr6 = sArr6;
                    i21 = i21;
                    str19 = str19;
                    str13 = str13;
                    str18 = str18;
                    i25 = i25;
                    strM3502 = strM3502;
                    str16 = str16;
                    sb = sb;
                    i26 = i26;
                    strM7507 = strM7507;
                    strM2816 = C0714.m2816(f40988, 19, 9, i22);
                    strM12355 = C4117.m12355(f40988, 28, 19, i22);
                    if (C1504.f5354) {
                        iM2568 = C0630.m2566("ۧ۠") ^ i18;
                        i13 = ((iM2568 ^ i17) * (-31547)) ^ (-1681152939);
                        i12 = 1292225956;
                    } else {
                        iM2568 = C0630.m2566("᩷ۤ") ^ i17;
                        i13 = ((iM2568 ^ i18) * (-17325)) ^ 1843554821;
                        i12 = -681611624;
                    }
                    i8 = iM2568 ^ i12;
                    i19 = i13;
                    strM7507 = strM7507;
                    i21 = i21;
                    str19 = str19;
                    sArr6 = sArr6;
                    i26 = i26;
                    str17 = str17;
                    str15 = str15;
                    i20 = i8;
                    sb = sb;
                    str16 = str16;
                    strM3502 = strM3502;
                    i25 = i25;
                    str18 = str18;
                    str13 = str13;
                    str20 = str20;
                    break;
                case 1179746667:
                case 1297303355:
                    C2126.m7040();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        str20 = str20;
                        str15 = str15;
                        str17 = str17;
                        sArr6 = sArr6;
                        i21 = i21;
                        str19 = str19;
                        str13 = str13;
                        str18 = str18;
                        i25 = i25;
                        strM3502 = strM3502;
                        str16 = str16;
                        sb = sb;
                        i26 = i26;
                        strM7507 = strM7507;
                        iM2568 = C0630.m2566("ۧ۠") ^ i18;
                        i13 = ((iM2568 ^ i17) * (-31547)) ^ (-1681152939);
                        i12 = 1292225956;
                        i8 = iM2568 ^ i12;
                        i19 = i13;
                        strM7507 = strM7507;
                        i21 = i21;
                        str19 = str19;
                        sArr6 = sArr6;
                        i26 = i26;
                        str17 = str17;
                        str15 = str15;
                        i20 = i8;
                        sb = sb;
                        str16 = str16;
                        strM3502 = strM3502;
                        i25 = i25;
                        str18 = str18;
                        str13 = str13;
                        str20 = str20;
                    } else {
                        iM2566 = C0630.m2566("᩶᩹") ^ i18;
                        i = ((iM2566 ^ i17) * (-1639)) ^ (-869979657);
                        i2 = 1608796534;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    }
                    break;
                case 1489024304:
                case 1574389327:
                    str9 = str13;
                    str10 = strM7507;
                    strM9934 = C3245.m9934(f40988, 8, 11, i22);
                    strM3502 = strM948;
                    strM6311 = str10;
                    str11 = str9;
                    int iM256110 = C0630.m2566("֡ۚ") ^ i18;
                    i19 = ((iM256110 ^ i17) * (-11441)) ^ (-1147493639);
                    i25 = i25;
                    str18 = str11;
                    str13 = str9;
                    str = str;
                    str20 = strM6311;
                    str19 = str19;
                    sArr6 = sArr6;
                    str16 = strM9934;
                    i21 = i21;
                    str17 = str17;
                    str15 = str15;
                    i20 = iM256110 ^ (-1558750200);
                    strM7507 = str10;
                    i26 = i26;
                    sb = sb;
                    break;
                case 1526892490:
                case 1853651852:
                    str3 = str15;
                    sArr = sArr6;
                    String str42 = str17;
                    i3 = i21;
                    str4 = str42;
                    C6874.f21239 = new WeakReference(dialogInterfaceC0206);
                    int i46 = C15104.f46193;
                    if (RunnableC1108.f4040) {
                        c0994 = new C0994(C23807.class);
                        str5 = str3;
                        str6 = str19;
                        String strM2817 = C0714.m2816(f40988, 76, 11, i22);
                        if (C3683.m11222()) {
                            str7 = strM2817;
                            str8 = str16;
                            int iM256111 = C0630.m2566("᩷۬") ^ i18;
                            i19 = ((iM256111 ^ i17) * (-11983)) ^ (-1174894936);
                            str16 = str8;
                            strM3502 = strM3502;
                            strM7507 = strM7507;
                            i25 = i25;
                            i26 = i26;
                            sb = sb;
                            str18 = str18;
                            i21 = i3;
                            str19 = str6;
                            sArr6 = sArr;
                            str17 = str7;
                            str15 = str5;
                            i20 = iM256111 ^ (-593863980);
                            str13 = str13;
                            str20 = str20;
                        } else {
                            int iM25620 = (C0630.m2566("ۚ᩺") ^ i18) * (-35);
                            str15 = str5;
                            i20 = iM25620 ^ 1614728196;
                            i19 = ((iM25620 ^ i17) * (-13203)) ^ 1770154333;
                            str19 = str6;
                            sArr6 = sArr;
                            str17 = strM2817;
                            i21 = i3;
                        }
                    } else {
                        sArr6 = sArr;
                        int iM256112 = (C0630.m2566("ۧ᩻") + i17) * 17;
                        i = ((iM256112 ^ i18) * (-21455)) ^ (-1893325635);
                        i20 = iM256112 ^ 1348199368;
                        c0994 = null;
                        i21 = i3;
                        str17 = str4;
                        str15 = str3;
                        i19 = i;
                    }
                    break;
                case 1592068206:
                case 2085815992:
                    RunnableC0588.m2441();
                    break;
                default:
                    if (C3683.f11629 < 0) {
                        iM2566 = C0630.m2566("᩶᩹") ^ i18;
                        i = ((iM2566 ^ i17) * (-1639)) ^ (-869979657);
                        i2 = 1608796534;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                    } else {
                        sArr3 = sArr6;
                        int iM69811 = C2105.m6981("ܿۚ") ^ i17;
                        int i214 = i21;
                        int i313 = ((iM69811 ^ i18) * 12443) ^ 471865431;
                        i20 = iM69811 ^ (-248781654);
                        i19 = i313;
                        i21 = i214;
                        sArr6 = sArr3;
                    }
                    break;
            }
            return;
        }
    }
}
