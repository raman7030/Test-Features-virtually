package bin.p000mt.plus;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p062mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.C0719o;
import moe.shizuku.server.IShizukuService;
import p067l.AbstractC0942;
import p067l.ActivityC9732;
import p067l.C0845;
import p067l.C0854;
import p067l.C0866;
import p067l.C0873;
import p067l.C0877;
import p067l.C0882;
import p067l.C0890;
import p067l.C0892;
import p067l.C0894;
import p067l.C0898;
import p067l.C0912;
import p067l.C0937;
import p067l.C0946;
import p067l.C0947;
import p067l.C0949;
import p067l.C0955;
import p067l.C0989;
import p067l.C0992;
import p067l.C1003;
import p067l.C1012;
import p067l.C1024;
import p067l.C1025;
import p067l.C1028;
import p067l.C1036;
import p067l.C1044;
import p067l.C1046;
import p067l.C1048;
import p067l.C1053;
import p067l.C1071;
import p067l.C1124;
import p067l.C1194;
import p067l.C1404;
import p067l.C1929;
import p067l.C1964;
import p067l.C23724;
import p067l.C7350;
import p067l.RunnableC0871;
import p067l.RunnableC0938;
import p067l.ViewOnClickListenerC0939;

/* JADX INFO: loaded from: classes.dex */
public class WXPayEntryActivity extends ActivityC9732 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ܳܺۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f81820 = {7013, 6036, 15459, 4267, 8228, 5521, 1374, -6238, -1708, 29339, 6036, 15459, -1520, 8557, 7987};
    public IWXAPI api;

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
    }

    @Override // p067l.ActivityC9732, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strM52761 = null;
        IWXAPI iwxapiCreateWXAPI = null;
        int i = 360783757;
        int i2 = C0949.f81897;
        int i3 = C1003.f81929;
        int iM55680 = C0873.m55680("᩵᩶") ^ i3;
        int i4 = ((iM55680 ^ i2) * 14883) ^ (-1511347354);
        int i5 = 400933612;
        while (true) {
            i = ((((i ^ i2) * 10091) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2061342614:
                case -2036566063:
                    if (C0882.m55710() != 0) {
                        iM55680 = C0873.m55680("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM55680 = (C0873.m55680("ۛ᩻") + i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 1949) ^ 1356922652;
                        i5 = 2146181508;
                    }
                    break;
                case -2029521409:
                case 258431399:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("ᩳۘ") + i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM55680 = C0873.m55680("᩵ܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-5809)) ^ 565042823;
                        i5 = -280113683;
                    }
                    break;
                case -1998926665:
                case -486953713:
                    C1025.m56230();
                    RunnableC0938.m55938();
                    break;
                case -1459569192:
                case 971198966:
                    C1124.m56367();
                    iM55680 = (C0873.m55680("֨ۤ") ^ i3) * 71;
                    i4 = ((iM55680 ^ i2) * 9579) ^ (-1453284106);
                    i5 = 1831384131;
                    break;
                case -1295927898:
                case -715504820:
                    super.onCreate(bundle);
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ᩳۘ") + i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM55680 = C0873.m55680("ܶۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27801) ^ (-914013403);
                        i5 = 524420464;
                    }
                    break;
                case -1199309378:
                case 951538898:
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i3) * 71;
                        i4 = ((iM55680 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        iM55680 = C0946.m55979("֫۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20739) ^ (-265963991);
                        i5 = -560355155;
                    }
                    break;
                case -971739331:
                case 130922501:
                    C7350 c7350 = C23724.f75498;
                    strM52761 = C23724.m52761();
                    if (C0882.m55710() != 0) {
                        iM55680 = (C0873.m55680("ᩳۘ") + i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 8877) ^ (-237959908);
                        i5 = -208988277;
                    } else {
                        iM55680 = C0946.m55979("۬ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7385)) ^ 89785452;
                        i5 = -716302792;
                    }
                    break;
                case -498717714:
                case 899666981:
                    if (C1044.m56286() <= 0) {
                        iM55680 = (C0873.m55680("ܶܽ") + i3) * (-79);
                        i4 = ((iM55680 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩶ۖ")) * (-41);
                        i4 = ((iM55680 ^ i2) * (-32053)) ^ (-638383150);
                        i5 = -65881465;
                    }
                    break;
                case -464150483:
                case 874068376:
                    RunnableC0938.m55938();
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i3) * 71;
                        i4 = ((iM55680 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    }
                    break;
                case -147352769:
                case 38547540:
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, strM52761);
                    this.api = iwxapiCreateWXAPI;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM55680 = C0946.m55979("ۘܺ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18959) ^ 1821625873;
                        i5 = -1542596517;
                    }
                    break;
                case 131043882:
                case 405922766:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("ۗۡ") + i2) * 41;
                        i4 = ((iM55680 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    } else {
                        iM55680 = C0873.m55680("ۗܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23129)) ^ 579598348;
                        i5 = -1487148227;
                    }
                    break;
                case 907573934:
                case 1859474796:
                    if (C1036.m56257() <= 0) {
                        iM55680 = C0873.m55680("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16601)) ^ (-961207706);
                        i5 = -1255242799;
                    } else {
                        iM55680 = (C0873.m55680("۫ܽ") ^ i2) * 63;
                        i4 = ((iM55680 ^ i3) * (-24349)) ^ 910183318;
                        i5 = -780595560;
                    }
                    break;
                case 1139595930:
                case 2103152415:
                    iwxapiCreateWXAPI.handleIntent(C0947.m55991(this), this);
                    break;
                case 1515717138:
                case 1664959261:
                    C0898.m55800();
                    if (C0877.f81843 < 0) {
                        iM55680 = (C0873.m55680("ܶܽ") + i3) * (-79);
                        i4 = ((iM55680 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i3) * 71;
                        i4 = ((iM55680 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    }
                    break;
                case 1820013787:
                case 1910408019:
                    if (!C0882.f81846) {
                        iM55680 = (C0873.m55680("֨ۤ") ^ i3) * 71;
                        i4 = ((iM55680 ^ i2) * 9579) ^ (-1453284106);
                        i5 = 1831384131;
                    } else {
                        iM55680 = (C0873.m55680("ۗۡ") + i2) * 41;
                        i4 = ((iM55680 ^ i3) * (-20383)) ^ (-367461674);
                        i5 = 1744780360;
                    }
                    break;
                default:
                    if (C0989.m56095() <= 0) {
                        iM55680 = (C0873.m55680("ܶܽ") + i3) * (-79);
                        i4 = ((iM55680 ^ i2) * 20323) ^ (-1186421538);
                        i5 = -1206706094;
                    } else {
                        iM55680 = C0873.m55680("ۜۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9221) ^ 104478056;
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
        int i2 = AbstractC0942.f81890;
        int i3 = C0877.f81843;
        int iM55680 = (C0873.m55680("ۚ᩷") + i3) * 7;
        int i4 = ((iM55680 ^ i2) * (-8433)) ^ (-1245331077);
        int i5 = -1858427885;
        while (true) {
            i = ((((i ^ i2) * 32319) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1812627455:
                case 1129581192:
                    setIntent(intent);
                    this.api.handleIntent(intent, this);
                    break;
                case -1803014888:
                case 115531014:
                    super.onNewIntent(intent);
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("ۤ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        iM55680 = C0946.m55979("֫۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6813)) ^ 1699051220;
                        i5 = 368980906;
                    }
                    break;
                case -1797274719:
                case 1972731735:
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0946.m55979("ۨۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM55680 = (C0946.m55979("ۛ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 7953) ^ 1956743434;
                        i5 = -1680089214;
                    }
                    break;
                case -1764926128:
                case -1543688331:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("᩷֨") + i3) * 17;
                        i4 = ((iM55680 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM55680 = C0873.m55680("ۡ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25851)) ^ 555992531;
                        i5 = -2001917780;
                    }
                    break;
                case -1530307954:
                case 1469687432:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0946.m55979("᩵۠") ^ i2) * (-17);
                        i4 = ((iM55680 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۤ") ^ i2) * 47;
                        i4 = ((iM55680 ^ i3) * (-13643)) ^ 1995574408;
                        i5 = 935767452;
                    }
                    break;
                case -1256766738:
                case 875439383:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0946.m55979("᩵۠") ^ i2) * (-17);
                        i4 = ((iM55680 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܰۧ")) * (-79);
                        i4 = ((iM55680 ^ i3) * 17151) ^ 869420569;
                        i5 = -713336403;
                    }
                    break;
                case -1210550516:
                case -875704990:
                    C1028.m56247();
                    iM55680 = C0946.m55979("ۨۧ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
                    i5 = 813124556;
                    break;
                case -554792920:
                case -57747235:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        iM55680 = (C0873.m55680("ۨᩳ") ^ i3) * 3;
                        i4 = ((iM55680 ^ i2) * (-22345)) ^ 233193870;
                        i5 = 536411436;
                    }
                    break;
                case -270853463:
                case 1209879916:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("᩵۠") ^ i2) * (-17);
                        i4 = ((iM55680 ^ i3) * 30821) ^ 885937355;
                        i5 = 80055743;
                    } else {
                        iM55680 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    }
                    break;
                case -194205011:
                case 1475559019:
                    if (C0949.m56012()) {
                        iM55680 = C0873.m55680("ۤ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * 18369) ^ (-1142463405);
                        i5 = -967668743;
                    } else {
                        iM55680 = C0873.m55680("֡ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * C0719o.a.f2908n) ^ 848242414;
                        i5 = 713487861;
                    }
                    break;
                case 120112729:
                case 2004679783:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("ۨۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۨ") + i3) * (-67);
                        i4 = ((iM55680 ^ i2) * (-6687)) ^ 227417366;
                        i5 = 874448638;
                    }
                    break;
                case 256304722:
                case 1725765808:
                    C1025.m56230();
                    break;
                case 586257173:
                case 1163332407:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("᩷֨") + i3) * 17;
                        i4 = ((iM55680 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM55680 = C0946.m55979("ܺ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20267) ^ 152765110;
                        i5 = 411214570;
                    }
                    break;
                case 894038485:
                case 981372743:
                    C0892.m55749();
                    if (C1071.f81975 > 0) {
                        iM55680 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23089)) ^ 382231754;
                        i5 = -933419069;
                    } else {
                        iM55680 = C0946.m55979("ۨۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    }
                    break;
                case 1190868293:
                case 1963629253:
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("ۨۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
                        i5 = 813124556;
                    } else {
                        iM55680 = (C0873.m55680("ۤᩳ") + i2) * 19;
                        i4 = ((iM55680 ^ i3) * 27461) ^ 1197361801;
                        i5 = 432442289;
                    }
                    break;
                default:
                    if (C0989.m56095() > 0) {
                        iM55680 = (C0873.m55680("᩷֨") + i3) * 17;
                        i4 = ((iM55680 ^ i2) * 14227) ^ 1110366617;
                        i5 = -1195746708;
                    } else {
                        iM55680 = C0946.m55979("ۨۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-15735)) ^ (-478857205);
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
    
        if (p067l.ServiceConnectionC1013.f81940 >= 0) goto L14;
     */
    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResp(BaseResp baseResp) {
        int iM55680;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr;
        int iM55681;
        int i5;
        int i6;
        int i7 = RunnableC0871.f81839;
        int i8 = C0912.f81867;
        int iM55682 = C0873.m55680("ۢ֨") ^ i8;
        int i9 = ((iM55682 ^ i7) * 2409) ^ 1303916295;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM55682 ^ 1230975294;
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
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ܽ᩶") ^ i7;
                        i = ((iM55680 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                    } else {
                        iM55680 = C0946.m55979("۫᩷") ^ i7;
                        i = ((iM55680 ^ i8) * (-14599)) ^ 155063222;
                        i2 = 1480737040;
                    }
                    i6 = iM55680 ^ i2;
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
                    sArr2 = f81820;
                    if (C0877.f81843 < 0) {
                        iM55680 = C0873.m55680("ۤ۫") ^ i7;
                        i = ((iM55680 ^ i8) * 25551) ^ (-577981061);
                        i2 = 1583462983;
                        i6 = iM55680 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        sArr4 = sArr4;
                        int iM55683 = C0873.m55680("۠ۨ") ^ i7;
                        i10 = iM55683 ^ (-1436815545);
                        i9 = ((iM55683 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    }
                    break;
                case -1888501786:
                case 370026871:
                    i17 = 29371;
                    iM55680 = (C0946.m55979("᩺᩷") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM55680 ^ i7) * (-19103)) ^ (-2033613644);
                    i2 = 1515700138;
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1816424404:
                case 1045463453:
                    C1036.m56257();
                    break;
                case -1781170531:
                case 183045908:
                    C1024.m56209();
                    if (RunnableC0871.f81839 < 0) {
                        sArr4 = sArr4;
                        runnable = runnable;
                        int iM55684 = C0873.m55680("۫᩸") ^ i8;
                        i = ((iM55684 ^ i7) * (-18809)) ^ 86667627;
                        i6 = iM55684 ^ 2107288292;
                        runnable = runnable;
                        sb = null;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    }
                    sArr4 = sArr4;
                    runnable = runnable;
                    iM55680 = (C0946.m55979("᩶᩸") + i7) * (-97);
                    i = ((iM55680 ^ i8) * (-15041)) ^ (-1172439489);
                    i2 = -1605255985;
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -1703249550:
                case 528649185:
                    i17 = 18676;
                    iM55680 = (C0946.m55979("᩺᩷") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM55680 ^ i7) * (-19103)) ^ (-2033613644);
                    i2 = 1515700138;
                    i6 = iM55680 ^ i2;
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
                    if (!C0877.m55696()) {
                        s = s2;
                        iM55680 = C0873.m55680("ܽ᩶") ^ i7;
                        i = ((iM55680 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                        i6 = iM55680 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        int iM55979 = (C0946.m55979("ۨܶ") + i8) * 55;
                        i3 = ((iM55979 ^ i7) * 20311) ^ (-935402810);
                        i4 = iM55979 ^ 392239128;
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
                        iM55680 = (C0946.m55979("۟ۤ") ^ i8) * 65;
                        i = ((iM55680 ^ i7) * 11307) ^ (-1936992101);
                        i2 = -1188715689;
                    } else {
                        iM55680 = C0946.m55979("ܳۖ") ^ i7;
                        i = ((iM55680 ^ i8) * (-1637)) ^ 975830395;
                        i2 = -2038853043;
                    }
                    i6 = iM55680 ^ i2;
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
                    if (C1024.m56209() >= 0) {
                        iM55680 = (C0946.m55979("᩶᩸") + i7) * (-97);
                        i = ((iM55680 ^ i8) * (-15041)) ^ (-1172439489);
                        i2 = -1605255985;
                    } else {
                        iM55680 = (C0946.m55979("֨ۨ") ^ i7) * 17;
                        i = ((iM55680 ^ i8) * 24119) ^ 2101825357;
                        i2 = -2074252955;
                    }
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -888878685:
                case 866176224:
                    C1404.m56468();
                    break;
                case -280927183:
                case 226253553:
                    sArr4 = sArr4;
                    runnable = runnable;
                    i21 = baseResp.errCode;
                    if (i21 == 0) {
                        iM55680 = C0946.m55979("ۤۧ") ^ i8;
                        i = ((iM55680 ^ i7) * 28765) ^ 1687801747;
                        i2 = 1225537569;
                    } else {
                        iM55680 = C0946.m55979("᩺ۛ") ^ i7;
                        i = ((iM55680 ^ i8) * (-7183)) ^ (-1473910802);
                        i2 = -1725393036;
                    }
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -257186537:
                case -32576145:
                    sArr4 = sArr4;
                    RunnableC0871.m55671(C1003.m56132(sArr3, i18, i19, i17));
                    runnable = C23724.f75500;
                    if (runnable != null) {
                        iM55681 = (C0873.m55680("۫ۨ") + i8) * 99;
                        i = ((iM55681 ^ i7) * (-28509)) ^ 1890151178;
                        i5 = 898064391;
                    } else {
                        iM55681 = (C0873.m55680("۠ܿ") + i7) * (-25);
                        i = ((iM55681 ^ i8) * (-24639)) ^ (-264285196);
                        i5 = -1074148181;
                    }
                    i6 = iM55681 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case -218289247:
                case 1468804270:
                    C0947.m55997();
                    runnable = runnable;
                    int iM55685 = C0873.m55680("۠ۨ") ^ i7;
                    i10 = iM55685 ^ (-1436815545);
                    i9 = ((iM55685 ^ i8) * 7583) ^ (-696062994);
                    runnable = runnable;
                    sb = null;
                    break;
                case 13652858:
                case 326039918:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (i21 == -2) {
                        iM55680 = (C0873.m55680("᩺ܳ") ^ i7) * (-127);
                        i = ((iM55680 ^ i8) * (-26223)) ^ (-284096256);
                        i2 = -1456670280;
                    } else {
                        iM55680 = C0873.m55680("ۛܽ") ^ i7;
                        i = ((iM55680 ^ i8) * 6125) ^ 1863206658;
                        i2 = -1990082252;
                    }
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 31324894:
                case 278586713:
                    short[] sArr5 = f81820;
                    sArr4 = sArr4;
                    if (!C0866.m55645()) {
                        runnable = runnable;
                        sArr4 = sArr4;
                        int iM55686 = C0873.m55680("۠ۨ") ^ i7;
                        i10 = iM55686 ^ (-1436815545);
                        i9 = ((iM55686 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    } else {
                        runnable = runnable;
                        String strM55750 = C0892.m55750(sArr5, 5, 5, i17);
                        if (C1194.m56396() > 0) {
                            StringBuilder sb2 = new StringBuilder(strM55750);
                            C0845.m55589(sb2, baseResp.errCode);
                            if (C1048.f81963) {
                                int iM55687 = C0873.m55680("᩹ۗ") ^ i8;
                                i3 = ((iM55687 ^ i7) * 18095) ^ (-1596709243);
                                i4 = iM55687 ^ 993770121;
                                sb = sb2;
                                i9 = i3;
                                runnable = runnable;
                                sArr = sArr4;
                                i10 = i4;
                                sArr4 = sArr;
                            } else {
                                sb = sb2;
                                iM55680 = C0873.m55680("ܰۧ") ^ i8;
                                i = ((iM55680 ^ i7) * 11449) ^ (-1639323357);
                                i2 = 340136589;
                                i6 = iM55680 ^ i2;
                                runnable = runnable;
                            }
                        } else {
                            int iM55688 = C0873.m55680("۫᩸") ^ i8;
                            i = ((iM55688 ^ i7) * (-18809)) ^ 86667627;
                            i6 = iM55688 ^ 2107288292;
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
                    C0882.m55724(runnable);
                    sArr4 = sArr4;
                    iM55681 = (C0873.m55680("۠ܿ") + i7) * (-25);
                    i = ((iM55681 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM55681 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 83247821:
                case 2029148771:
                    C1025.m56228(C0845.m55591(sb));
                    sArr4 = sArr4;
                    iM55681 = (C0873.m55680("۠ܿ") + i7) * (-25);
                    i = ((iM55681 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM55681 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 101907424:
                case 2041674970:
                    C1046.m56302();
                    if (C0989.f81920 < 0) {
                        sArr4 = sArr4;
                        runnable = runnable;
                        iM55680 = C0873.m55680("ܰۧ") ^ i8;
                        i = ((iM55680 ^ i7) * 11449) ^ (-1639323357);
                        i2 = 340136589;
                        i6 = iM55680 ^ i2;
                        runnable = runnable;
                        sArr = sArr4;
                        i10 = i6;
                        i9 = i;
                        sArr4 = sArr;
                    } else {
                        runnable = runnable;
                        int iM55689 = C0873.m55680("۠ۨ") ^ i7;
                        i10 = iM55689 ^ (-1436815545);
                        i9 = ((iM55689 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    }
                    break;
                case 123194286:
                case 177549740:
                    sArr4 = sArr4;
                    runnable = runnable;
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("ܽ᩶") ^ i7;
                        i = ((iM55680 ^ i8) * 32573) ^ 608716883;
                        i2 = -1827534238;
                    } else {
                        iM55680 = C0946.m55979("ᩳ۫") ^ i8;
                        i = ((iM55680 ^ i7) * 14055) ^ 253777749;
                        i2 = -1286467321;
                    }
                    i6 = iM55680 ^ i2;
                    runnable = runnable;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                case 147761164:
                case 884629742:
                    sArr4 = f81820;
                    i11 = 10;
                    i12 = 5;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        runnable = runnable;
                        int iM556810 = C0873.m55680("۠ۨ") ^ i7;
                        i10 = iM556810 ^ (-1436815545);
                        i9 = ((iM556810 ^ i8) * 7583) ^ (-696062994);
                        runnable = runnable;
                        sb = null;
                    } else {
                        int iM559710 = (C0946.m55979("ܺۧ") + i8) * 17;
                        i10 = iM559710 ^ (-1066288517);
                        i9 = ((iM559710 ^ i7) * 27533) ^ (-2088967370);
                    }
                    break;
                case 192009803:
                case 1236749833:
                    C0955.m56027(this);
                    break;
                case 632434426:
                case 1089884394:
                    C1025.m56228(C1929.m56558(sArr4, i11, i12, i17));
                    sArr4 = sArr4;
                    iM55681 = (C0873.m55680("۠ܿ") + i7) * (-25);
                    i = ((iM55681 ^ i8) * (-24639)) ^ (-264285196);
                    i5 = -1074148181;
                    i6 = iM55681 ^ i5;
                    sArr = sArr4;
                    i10 = i6;
                    i9 = i;
                    sArr4 = sArr;
                    break;
                default:
                    sArr4 = sArr4;
                    runnable = runnable;
                    sArr3 = f81820;
                    i18 = 1;
                    i19 = 4;
                    if (C1048.f81963) {
                        iM55680 = (C0873.m55680("ۘ᩸") ^ i8) * 109;
                        i = ((iM55680 ^ i7) * 2121) ^ (-1321345061);
                        i2 = 588663371;
                    } else {
                        iM55680 = (C0946.m55979("᩶᩸") + i7) * (-97);
                        i = ((iM55680 ^ i8) * (-15041)) ^ (-1172439489);
                        i2 = -1605255985;
                    }
                    i6 = iM55680 ^ i2;
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
