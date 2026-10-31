package bin.mt.plus;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.o;
import l.AbstractC2021;
import l.ActivityC7747;
import l.C0050;
import l.C0237;
import l.C0483;
import l.C0630;
import l.C0714;
import l.C0798;
import l.C0964;
import l.C1005;
import l.C1047;
import l.C1128;
import l.C11340;
import l.C1420;
import l.C1916;
import l.C2105;
import l.C2126;
import l.C2167;
import l.C21923;
import l.C22470;
import l.C22628;
import l.C2272;
import l.C2958;
import l.C3019;
import l.C3245;
import l.C3432;
import l.C3663;
import l.C3683;
import l.C3746;
import l.C3911;
import l.C4075;
import l.C4117;
import l.C4159;
import l.C4263;
import l.C4616;
import l.C5242;
import l.C5695;
import l.C7106;
import l.RunnableC0588;
import l.RunnableC1937;
import l.ViewOnClickListenerC1958;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: loaded from: classes.dex */
public class WXPayEntryActivity extends ActivityC7747 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ܳܺۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f69 = {7013, 6036, 15459, 4267, 8228, 5521, 1374, -6238, -1708, 29339, 6036, 15459, -1520, 8557, 7987};
    public IWXAPI api;

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // l.ActivityC7747, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strM50420 = null;
        IWXAPI iwxapiCreateWXAPI = null;
        int i = 360783757;
        int i2 = C2167.f7158;
        int i3 = C3245.f10203;
        int iM2566 = C0630.m2566("᩵᩶") ^ i3;
        int i4 = ((iM2566 ^ i2) * 14883) ^ (-1511347354);
        int i5 = 400933612;
        while (true) {
            i = ((((i ^ i2) * 10091) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2061342614:
                case -2036566063:
                    if (C0798.m2998() != 0) {
                        iM2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM2566 = (C0630.m2566("ۛ᩻") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 1949) ^ 1356922652;
                        i5 = 2146181508;
                    }
                    break;
                case -2029521409:
                case 258431399:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM2566 = C0630.m2566("᩵ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-5809)) ^ 565042823;
                        i5 = -280113683;
                    }
                    break;
                case -1998926665:
                case -486953713:
                    C3683.m11222();
                    RunnableC1937.m6387();
                    break;
                case -1459569192:
                case 971198966:
                    C5695.m16023();
                    iM2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                    i4 = ((iM2566 ^ i2) * 9579) ^ (-1453284106);
                    i5 = 1831384131;
                    break;
                case -1295927898:
                case -715504820:
                    super.onCreate(bundle);
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM2566 = C0630.m2566("ܶۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27801) ^ (-914013403);
                        i5 = 524420464;
                    }
                    break;
                case -1199309378:
                case 951538898:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((iM2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        iM2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 20739) ^ (-265963991);
                        i5 = -560355155;
                    }
                    break;
                case -971739331:
                case 130922501:
                    C5242 c5242 = C22470.f72770;
                    strM50420 = C22470.m50420();
                    if (C0798.m2998() != 0) {
                        iM2566 = (C0630.m2566("ᩳۘ") + i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM2566 = C2105.m6981("۬ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7385)) ^ 89785452;
                        i5 = -716302792;
                    }
                    break;
                case -498717714:
                case 899666981:
                    if (C4075.m12263() <= 0) {
                        iM2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((iM2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩶ۖ")) * (-41);
                        i4 = ((iM2566 ^ i2) * (-32053)) ^ (-638383150);
                        i5 = -65881465;
                    }
                    break;
                case -464150483:
                case 874068376:
                    RunnableC1937.m6387();
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((iM2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    }
                    break;
                case -147352769:
                case 38547540:
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, strM50420);
                    this.api = iwxapiCreateWXAPI;
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM2566 = C2105.m6981("ۘܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18959) ^ 1821625873;
                        i5 = -1542596517;
                    }
                    break;
                case 131043882:
                case 405922766:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("ۗۡ") + i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    } else {
                        iM2566 = C0630.m2566("ۗܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23129)) ^ 579598348;
                        i5 = -1487148227;
                    }
                    break;
                case 907573934:
                case 1859474796:
                    if (C3911.m11924() <= 0) {
                        iM2566 = C0630.m2566("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM2566 = (C0630.m2566("۫ܽ") ^ i2) * 63;
                        i4 = ((iM2566 ^ i3) * (-24349)) ^ 910183318;
                        i5 = -780595560;
                    }
                    break;
                case 1139595930:
                case 2103152415:
                    iwxapiCreateWXAPI.handleIntent(C2126.m7034(this), this);
                    break;
                case 1515717138:
                case 1664959261:
                    C1128.m3851();
                    if (C0714.f2697 < 0) {
                        iM2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((iM2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((iM2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    }
                    break;
                case 1820013787:
                case 1910408019:
                    if (!C0798.f2919) {
                        iM2566 = (C0630.m2566("֨ۤ") ^ i3) * 71;
                        i4 = ((iM2566 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        iM2566 = (C0630.m2566("ۗۡ") + i2) * 41;
                        i4 = ((iM2566 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    }
                    break;
                default:
                    if (C2958.m9034() <= 0) {
                        iM2566 = (C0630.m2566("ܶܽ") + i3) * (-79);
                        i4 = ((iM2566 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM2566 = C0630.m2566("ۜۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9221) ^ 104478056;
                        i5 = -1694859604;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int i = 782484538;
        int i2 = AbstractC2021.f6743;
        int i3 = C0714.f2697;
        int iM2566 = (C0630.m2566("ۚ᩷") + i3) * 7;
        int i4 = ((iM2566 ^ i2) * (-8433)) ^ (-1245331077);
        int i5 = -1858427885;
        while (true) {
            i = ((((i ^ i2) * 32319) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1812627455:
                case 1129581192:
                    setIntent(intent);
                    this.api.handleIntent(intent, this);
                    break;
                case -1803014888:
                case 115531014:
                    super.onNewIntent(intent);
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("ۤ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        iM2566 = C2105.m6981("֫۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6813)) ^ 1699051220;
                        i5 = 368980906;
                    }
                    break;
                case -1797274719:
                case 1972731735:
                    if (C3432.m10477() <= 0) {
                        iM2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM2566 = (C2105.m6981("ۛ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 7953) ^ 1956743434;
                        i5 = -1680089214;
                    }
                    break;
                case -1764926128:
                case -1543688331:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((iM2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25851)) ^ 555992531;
                        i5 = -2001917780;
                    }
                    break;
                case -1530307954:
                case 1469687432:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((iM2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM2566 = (C2105.m6981("᩵ۤ") ^ i2) * 47;
                        i4 = ((iM2566 ^ i3) * (-13643)) ^ 1995574408;
                        i5 = 935767452;
                    }
                    break;
                case -1256766738:
                case 875439383:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((iM2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܰۧ")) * (-79);
                        i4 = ((iM2566 ^ i3) * 17151) ^ 869420569;
                        i5 = -713336403;
                    }
                    break;
                case -1210550516:
                case -875704990:
                    C3746.m11369();
                    iM2566 = C2105.m6981("ۨۧ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                    i5 = 813124556;
                    break;
                case -554792920:
                case -57747235:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        iM2566 = (C0630.m2566("ۨᩳ") ^ i3) * 3;
                        i4 = ((iM2566 ^ i2) * (-22345)) ^ 233193870;
                        i5 = 536411436;
                    }
                    break;
                case -270853463:
                case 1209879916:
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("᩵۠") ^ i2) * (-17);
                        i4 = ((iM2566 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    }
                    break;
                case -194205011:
                case 1475559019:
                    if (C2167.m7155()) {
                        iM2566 = C0630.m2566("ۤ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        iM2566 = C0630.m2566("֡ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * o.a.n) ^ 848242414;
                        i5 = 713487861;
                    }
                    break;
                case 120112729:
                case 2004679783:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM2566 = (C2105.m6981("᩶ۨ") + i3) * (-67);
                        i4 = ((iM2566 ^ i2) * (-6687)) ^ 227417366;
                        i5 = 874448638;
                    }
                    break;
                case 256304722:
                case 1725765808:
                    C3683.m11222();
                    break;
                case 586257173:
                case 1163332407:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((iM2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM2566 = C2105.m6981("ܺ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20267) ^ 152765110;
                        i5 = 411214570;
                    }
                    break;
                case 894038485:
                case 981372743:
                    C1005.m3501();
                    if (C4616.f14690 > 0) {
                        iM2566 = C0630.m2566("۬ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        iM2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    }
                    break;
                case 1190868293:
                case 1963629253:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM2566 = (C0630.m2566("ۤᩳ") + i2) * 19;
                        i4 = ((iM2566 ^ i3) * 27461) ^ 1197361801;
                        i5 = 432442289;
                    }
                    break;
                default:
                    if (C2958.m9034() > 0) {
                        iM2566 = (C0630.m2566("᩷֨") + i3) * 17;
                        i4 = ((iM2566 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM2566 = C2105.m6981("ۨۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02c7 A[PHI: r13 r14 r15 r18 r22 r25
      0x02c7: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v7 short[]) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v7 int) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v7 int) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r18v4 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r22v27 short[]) = (r22v6 short[]), (r22v25 short[]), (r22v32 short[]) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r25v21 java.lang.Runnable) = (r25v5 java.lang.Runnable), (r25v19 java.lang.Runnable), (r25v23 java.lang.Runnable) binds: [B:74:0x02c5, B:10:0x006b, B:6:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x033a A[PHI: r8 r9 r10 r11 r22 r24 r25
      0x033a: PHI (r8v5 int) = (r8v2 int), (r8v4 int), (r8v2 int) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r22v10 short[]) = (r22v5 short[]), (r22v9 short[]), (r22v11 short[]) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r24v5 short) = (r24v1 short), (r24v4 short), (r24v1 short) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]
      0x033a: PHI (r25v8 java.lang.Runnable) = (r25v4 java.lang.Runnable), (r25v7 java.lang.Runnable), (r25v9 java.lang.Runnable) binds: [B:83:0x0338, B:70:0x0296, B:65:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L14;
     */
    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResp(BaseResp baseResp) {
        int iM2566;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        int iM2567;
        int i5;
        int i6;
        int i7 = RunnableC0588.f2309;
        int i8 = C1420.f5096;
        int iM2568 = C0630.m2566("ۢ֨") ^ i8;
        int i9 = ((iM2568 ^ i7) * 2409) ^ 1303916295;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM2568 ^ 1230975294;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        char c = 0;
        int i20 = 1659244040;
        StringBuilder sb = null;
        short s = 0;
        Runnable runnable = null;
        int i21 = 0;
        while (true) {
            i20 = i10 ^ (i9 & (((i20 ^ i7) * (-28893)) >> 31));
            switch (i20) {
                case -2019188586:
                case -454092441:
                    sArr4 = sArr4;
                    runnable = runnable;
                    i14 = i13 * i13;
                    i15 = s * s;
                    i16 = 5890329;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ܽ᩶") ^ i7;
                        i = ((iM2566 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                    } else {
                        iM2566 = C2105.m6981("۫᩷") ^ i7;
                        i = ((iM2566 ^ i8) * (-14599)) ^ 155063222;
                        i2 = 1480737040;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1979291701:
                case -258215861:
                    sArr4 = sArr4;
                    runnable = runnable;
                    sArr2 = f69;
                    if (C0714.f2697 < 0) {
                        iM2566 = C0630.m2566("ۤ۫") ^ i7;
                        i = ((iM2566 ^ i8) * 25551) ^ (-577981061);
                        i2 = 1583462983;
                        i6 = iM2566 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        sArr4 = sArr4;
                        int iM2569 = C0630.m2566("۠ۨ") ^ i7;
                        i10 = iM2569 ^ (-1436815545);
                        i9 = ((iM2569 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    }
                    break;
                case -1888501786:
                case 370026871:
                    i17 = 29371;
                    iM2566 = (C2105.m6981("᩺᩷") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM2566 ^ i7) * (-19103)) ^ (-2033613644);
                    i2 = 1515700138;
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1816424404:
                case 1045463453:
                    C3911.m11924();
                    break;
                case -1781170531:
                case 183045908:
                    C3663.m11168();
                    if (RunnableC0588.f2309 < 0) {
                        sArr4 = sArr4;
                        runnable = runnable;
                        int iM25610 = C0630.m2566("۫᩸") ^ i8;
                        i = ((iM25610 ^ i7) * (-18809)) ^ 86667627;
                        i6 = iM25610 ^ 2107288292;
                        runnable = runnable;
                        sb = null;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    }
                    sArr4 = sArr4;
                    runnable = runnable;
                    iM2566 = (C2105.m6981("᩶᩸") + i7) * (-97);
                    i = ((iM2566 ^ i8) * (-15041)) ^ (-1172439489);
                    i2 = -1605255985;
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1703249550:
                case 528649185:
                    i17 = 18676;
                    iM2566 = (C2105.m6981("᩺᩷") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM2566 ^ i7) * (-19103)) ^ (-2033613644);
                    i2 = 1515700138;
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1272561174:
                case -1108180550:
                    sArr4 = sArr4;
                    runnable = runnable;
                    short s2 = sArr2[c];
                    i13 = s2 + 2427;
                    if (!C0714.m2805()) {
                        s = s2;
                        iM2566 = C0630.m2566("ܽ᩶") ^ i7;
                        i = ((iM2566 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                        i6 = iM2566 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        int iM6981 = (C2105.m6981("ۨܶ") + i8) * 55;
                        i3 = ((iM6981 ^ i7) * 20311) ^ (-935402810);
                        i4 = iM6981 ^ 392239128;
                        s = s2;
                        i9 = i3;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i4;
                        sArr4 = sArr;
                    }
                    break;
                case -1044820397:
                case 951587578:
                    sArr4 = sArr4;
                    runnable = runnable;
                    int i22 = i15 + i16;
                    if (i14 - (i22 + i22) <= 0) {
                        iM2566 = (C2105.m6981("۟ۤ") ^ i8) * 65;
                        i = ((iM2566 ^ i7) * 11307) ^ (-1936992101);
                        i2 = -1188715689;
                    } else {
                        iM2566 = C2105.m6981("ܳۖ") ^ i7;
                        i = ((iM2566 ^ i8) * (-1637)) ^ 975830395;
                        i2 = -2038853043;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -946169489:
                case -611387376:
                    sArr4 = sArr4;
                    runnable = runnable;
                    c = 0;
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("᩶᩸") + i7) * (-97);
                        i = ((iM2566 ^ i8) * (-15041)) ^ (-1172439489);
                        i2 = -1605255985;
                    } else {
                        iM2566 = (C2105.m6981("֨ۨ") ^ i7) * 17;
                        i = ((iM2566 ^ i8) * 24119) ^ 2101825357;
                        i2 = -2074252955;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -888878685:
                case 866176224:
                    C11340.m28031();
                    break;
                case -280927183:
                case 226253553:
                    sArr4 = sArr4;
                    runnable = runnable;
                    i21 = baseResp.errCode;
                    if (i21 == 0) {
                        iM2566 = C2105.m6981("ۤۧ") ^ i8;
                        i = ((iM2566 ^ i7) * 28765) ^ 1687801747;
                        i2 = 1225537569;
                    } else {
                        iM2566 = C2105.m6981("᩺ۛ") ^ i7;
                        i = ((iM2566 ^ i8) * (-7183)) ^ (-1473910802);
                        i2 = -1725393036;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -257186537:
                case -32576145:
                    sArr4 = sArr4;
                    RunnableC0588.m2440(C3245.m9934(sArr3, i18, i19, i17));
                    runnable = C22470.f72773;
                    if (runnable != null) {
                        iM2567 = (C0630.m2566("۫ۨ") + i8) * 99;
                        i = ((iM2567 ^ i7) * (-28509)) ^ 1890151178;
                        i5 = 898064391;
                    } else {
                        iM2567 = (C0630.m2566("۠ܿ") + i7) * (-25);
                        i = ((iM2567 ^ i8) * (-24639)) ^ (-264285196);
                        i5 = -1074148181;
                    }
                    i6 = iM2567 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -218289247:
                case 1468804270:
                    C2126.m7040();
                    runnable = runnable;
                    int iM25611 = C0630.m2566("۠ۨ") ^ i7;
                    i10 = iM25611 ^ (-1436815545);
                    i9 = ((iM25611 ^ i8) * 7583) ^ (-696062994);
                    runnable = runnable;
                    sb = null;
                    break;
                case 13652858:
                case 326039918:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (i21 == -2) {
                        iM2566 = (C0630.m2566("᩺ܳ") ^ i7) * (-127);
                        i = ((iM2566 ^ i8) * (-26223)) ^ (-284096256);
                        i2 = -1456670280;
                    } else {
                        iM2566 = C0630.m2566("ۛܽ") ^ i7;
                        i = ((iM2566 ^ i8) * 6125) ^ 1863206658;
                        i2 = -1990082252;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 31324894:
                case 278586713:
                    short[] sArr5 = f69;
                    sArr4 = sArr4;
                    if (!C0483.m2121()) {
                        runnable = runnable;
                        sArr4 = sArr4;
                        int iM25612 = C0630.m2566("۠ۨ") ^ i7;
                        i10 = iM25612 ^ (-1436815545);
                        i9 = ((iM25612 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    } else {
                        runnable = runnable;
                        String strM3502 = C1005.m3502(sArr5, 5, 5, i17);
                        if (C7106.m19120() > 0) {
                            StringBuilder sb2 = new StringBuilder(strM3502);
                            C0050.m945(sb2, baseResp.errCode);
                            if (C4159.f13567) {
                                int iM25613 = C0630.m2566("᩹ۗ") ^ i8;
                                i3 = ((iM25613 ^ i7) * 18095) ^ (-1596709243);
                                i4 = iM25613 ^ 993770121;
                                sb = sb2;
                                i9 = i3;
                                runnable = runnable;
                                sArr = sArr4;
                                i10 = i4;
                                sArr4 = sArr;
                            } else {
                                sb = sb2;
                                iM2566 = C0630.m2566("ܰۧ") ^ i8;
                                i = ((iM2566 ^ i7) * 11449) ^ (-1639323357);
                                i2 = 340136589;
                                i6 = iM2566 ^ i2;
                                runnable = runnable;
                            }
                        } else {
                            int iM25614 = C0630.m2566("۫᩸") ^ i8;
                            i = ((iM25614 ^ i7) * (-18809)) ^ 86667627;
                            i6 = iM25614 ^ 2107288292;
                            runnable = runnable;
                            sb = null;
                        }
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    }
                    break;
                case 38790452:
                case 398745450:
                    C0798.m3012(runnable);
                    sArr4 = sArr4;
                    iM2567 = (C0630.m2566("۠ܿ") + i7) * (-25);
                    i = ((iM2567 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM2567 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 83247821:
                case 2029148771:
                    C3683.m11220(C0050.m947(sb));
                    sArr4 = sArr4;
                    iM2567 = (C0630.m2566("۠ܿ") + i7) * (-25);
                    i = ((iM2567 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM2567 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 101907424:
                case 2041674970:
                    C4117.m12364();
                    if (C2958.f9394 < 0) {
                        sArr4 = sArr4;
                        runnable = runnable;
                        iM2566 = C0630.m2566("ܰۧ") ^ i8;
                        i = ((iM2566 ^ i7) * 11449) ^ (-1639323357);
                        i2 = 340136589;
                        i6 = iM2566 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        runnable = runnable;
                        int iM25615 = C0630.m2566("۠ۨ") ^ i7;
                        i10 = iM25615 ^ (-1436815545);
                        i9 = ((iM25615 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    }
                    break;
                case 123194286:
                case 177549740:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (C1916.m6308() >= 0) {
                        iM2566 = C0630.m2566("ܽ᩶") ^ i7;
                        i = ((iM2566 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                    } else {
                        iM2566 = C2105.m6981("ᩳ۫") ^ i8;
                        i = ((iM2566 ^ i7) * 14055) ^ 253777749;
                        i2 = -1286467321;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 147761164:
                case 884629742:
                    sArr4 = f69;
                    i11 = 10;
                    i12 = 5;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        runnable = runnable;
                        int iM25616 = C0630.m2566("۠ۨ") ^ i7;
                        i10 = iM25616 ^ (-1436815545);
                        i9 = ((iM25616 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    } else {
                        int iM6982 = (C2105.m6981("ܺۧ") + i8) * 17;
                        i10 = iM6982 ^ (-1066288517);
                        i9 = ((iM6982 ^ i7) * 27533) ^ (-2088967370);
                    }
                    break;
                case 192009803:
                case 1236749833:
                    C2272.m7505(this);
                    break;
                case 632434426:
                case 1089884394:
                    C3683.m11220(C21923.m49334(sArr4, i11, i12, i17));
                    sArr4 = sArr4;
                    iM2567 = (C0630.m2566("۠ܿ") + i7) * (-25);
                    i = ((iM2567 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM2567 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                default:
                    sArr4 = sArr4;
                    runnable = runnable;
                    sArr3 = f69;
                    i18 = 1;
                    i19 = 4;
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ۘ᩸") ^ i8) * 109;
                        i = ((iM2566 ^ i7) * 2121) ^ (-1321345061);
                        i2 = 588663371;
                    } else {
                        iM2566 = (C2105.m6981("᩶᩸") + i7) * (-97);
                        i = ((iM2566 ^ i8) * (-15041)) ^ (-1172439489);
                        i2 = -1605255985;
                    }
                    i6 = iM2566 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
            }
            return;
        }
    }
}
