package p067l;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p062mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܺ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RQ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC17798 extends ActivityC9732 implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: ᩷۫ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f82252 = {3111, 539, 537, 534, 537, 522, ColorResourcesTableCreator.HEADER_TYPE_TYPE, 527, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, 541, 589, 589, 585, 586, 587, 577, 586, 539, 590, 540, 576, 584, 586, 589, 577, 527, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, 541, 538, 539, 587, 542, 538, 538, 591, 591, 588, 585, 539, 585, 590, 539, 541};

    /* JADX INFO: renamed from: ᩹ */
    public static WeakReference f53144;

    /* JADX INFO: renamed from: ᩸ */
    public IWXAPI f53145;

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        int i = 662362755;
        int i2 = RunnableC0938.f81886;
        int i3 = C1017.f81942;
        int iM55979 = (C0946.m55979("᩹ܶ") ^ i3) * (-9);
        int i4 = ((iM55979 ^ i2) * 31431) ^ 1844090249;
        int i5 = -693412719;
        while (true) {
            i = ((((i ^ i2) * 11049) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2001217407:
                case 1555941529:
                    setIntent(intent);
                    this.f53145.handleIntent(intent, this);
                    break;
                case -1583835266:
                case -1499269978:
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0946.m55979("᩶ۖ") + i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۚ֡")) * 51;
                        i4 = ((iM55979 ^ i2) * 17819) ^ (-222137768);
                        i5 = -2035847343;
                    }
                    break;
                case -1539106649:
                case 400071440:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0946.m55979("ۛܶ") + i2) * (-121);
                        i4 = ((iM55979 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        iM55979 = C0873.m55680("᩺᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26399) ^ 1012534684;
                        i5 = 1846217625;
                    }
                    break;
                case -1297540694:
                case -468198315:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("᩶ۖ") + i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14935) ^ (-1536878881);
                        i5 = -1027080412;
                    }
                    break;
                case -1165179405:
                case 2042209636:
                    super.onNewIntent(intent);
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ۛܶ") + i2) * (-121);
                        i4 = ((iM55979 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        iM55979 = C0873.m55680("ۛ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26961)) ^ 1648257415;
                        i5 = 1494093754;
                    }
                    break;
                case -1162180769:
                case -774662748:
                    C0854.m55595();
                    iM55979 = (C0946.m55979("᩶ۖ") + i2) * (-111);
                    i4 = ((iM55979 ^ i3) * 14999) ^ 1986634121;
                    i5 = 1878365208;
                    break;
                case -1096578525:
                case -58603970:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("ۛܶ") + i2) * (-121);
                        i4 = ((iM55979 ^ i3) * 11807) ^ (-561853873);
                        i5 = -1405002395;
                    } else {
                        iM55979 = C0946.m55979("ۗۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25569) ^ 598848292;
                        i5 = 143460428;
                    }
                    break;
                case -1078900590:
                case 1530948593:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        iM55979 = C0946.m55979("ۡ۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22541)) ^ (-1868094619);
                        i5 = 592059038;
                    }
                    break;
                case -1068018379:
                case 606122913:
                    C1025.m56230();
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("᩶ۖ") + i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    }
                    break;
                case -750907918:
                case 556477723:
                    RunnableC1014.m56177();
                    break;
                case -533960975:
                case 1091922952:
                    C0873.m55678();
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-765)) ^ 1444958612;
                        i5 = 1370776703;
                    } else {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    }
                    break;
                case -210902828:
                case 1994348320:
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۗۜ")) * 53;
                        i4 = ((iM55979 ^ i3) * 4783) ^ (-692229015);
                        i5 = 791394341;
                    }
                    break;
                case -42593353:
                case 327025257:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        iM55979 = C0946.m55979("֨ܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-16811)) ^ 1786003426;
                        i5 = -2014035852;
                    }
                    break;
                case 370616780:
                case 1943561076:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("۬ᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28517)) ^ (-320059901);
                        i5 = 1795389981;
                    } else {
                        iM55979 = C0873.m55680("᩺᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-22431)) ^ 1459748427;
                        i5 = 728520165;
                    }
                    break;
                case 483678828:
                case 1632754696:
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("᩶ۖ") + i2) * (-111);
                        i4 = ((iM55979 ^ i3) * 14999) ^ 1986634121;
                        i5 = 1878365208;
                    } else {
                        iM55979 = (C0946.m55979("ۗۖ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * 26397) ^ 2017083406;
                        i5 = 1871081979;
                    }
                    break;
                default:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-765)) ^ 1444958612;
                        i5 = 1370776703;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۤ᩺")) * (-125);
                        i4 = ((iM55979 ^ i3) * 17441) ^ 1211504001;
                        i5 = -739649492;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0199 A[PHI: r11
      0x0199: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:46:0x0197, B:12:0x0067, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d0 A[PHI: r2 r9 r10 r14
      0x01d0: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:50:0x01ce, B:30:0x00f0, B:9:0x005e, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01ce, B:30:0x00f0, B:9:0x005e, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:50:0x01ce, B:30:0x00f0, B:9:0x005e, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:50:0x01ce, B:30:0x00f0, B:9:0x005e, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0225 A[PHI: r6 r7 r8
      0x0225: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:58:0x0223, B:54:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:58:0x0223, B:54:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:58:0x0223, B:54:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025b A[PHI: r5 r13
      0x025b: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:62:0x0259, B:34:0x010d, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:62:0x0259, B:34:0x010d, B:17:0x0071, B:15:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02ab A[PHI: r19
      0x02ab: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:70:0x02a9, B:66:0x028c, B:15:0x006d, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.ActivityC9732, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        String strM56102;
        int i3 = C1124.f82007;
        int i4 = C0967.f81910;
        int iM559710 = C0946.m55979("ۤ֨") ^ i3;
        int i5 = ((iM559710 ^ i4) * 18675) ^ (-1601752667);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ 951813049;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 849842033;
        String str = null;
        String packageName = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-1167)) >> 31));
            switch (i13) {
                case -1817352348:
                case -895800734:
                    int i14 = i9 + i10;
                    if (i8 - (i14 + i14) <= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜᩳ")) * (-67);
                        i = ((iM55979 ^ i4) * (-19269)) ^ (-779316542);
                        i2 = 409830583;
                    } else {
                        iM55979 = C0946.m55979("᩺᩸") ^ i3;
                        i = ((iM55979 ^ i4) * (-10373)) ^ 998397791;
                        i2 = -1079993142;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1743469716:
                case -1612984908:
                    sArr = f82252;
                    if (C1036.m56257() <= 0) {
                        iM55979 = (C0946.m55979("ۧ᩶") + i3) * 127;
                        i = ((iM55979 ^ i4) * 25463) ^ 788214699;
                        i2 = -1564585556;
                    } else {
                        iM55979 = (C0946.m55979("᩷۟") + i3) * 123;
                        i = ((iM55979 ^ i4) * (-25005)) ^ 114535913;
                        i2 = 1107038639;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1602272930:
                case -331697419:
                    strM56102 = C0992.m56102(f82252, 7, 18, i11);
                    str = strM56102;
                    iM55979 = C0946.m55979("᩶۬") ^ i4;
                    i = ((iM55979 ^ i3) * (-25465)) ^ (-1017160743);
                    i2 = 966786102;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1597900204:
                case 593851968:
                    s = sArr[c];
                    s2 = 122;
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 15;
                        i = ((iM55979 ^ i4) * (-5431)) ^ 528216223;
                        i2 = 352312942;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܶ᩷")) * (-117);
                        i = ((iM55979 ^ i3) * 26673) ^ (-861796571);
                        i2 = 460777658;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1569103073:
                case 208536470:
                    C1044.m56286();
                    iM55979 = (i4 - C0946.m55979("ܰۡ")) * 79;
                    i = ((iM55979 ^ i3) * (-8447)) ^ 1946467073;
                    i2 = 284098538;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1459333434:
                case 218030096:
                    strM56102 = C0866.m55652(f82252, 25, 18, i11);
                    str = strM56102;
                    iM55979 = C0946.m55979("᩶۬") ^ i4;
                    i = ((iM55979 ^ i3) * (-25465)) ^ (-1017160743);
                    i2 = 966786102;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1322324630:
                case -712214358:
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0946.m55979("ۧ᩶") + i3) * 127;
                        i = ((iM55979 ^ i4) * 25463) ^ 788214699;
                        i2 = -1564585556;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩸") ^ i4;
                        i = ((iM55979 ^ i3) * 5457) ^ (-2108978017);
                        i2 = 343930356;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1304948908:
                case -222693250:
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this, str);
                    this.f53145 = iwxapiCreateWXAPI;
                    iwxapiCreateWXAPI.handleIntent(C0947.m55991(this), this);
                    break;
                case -1195794842:
                case 2026675787:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55979 = (i4 - C0946.m55979("ܰۡ")) * 79;
                        i = ((iM55979 ^ i3) * (-8447)) ^ 1946467073;
                        i2 = 284098538;
                    } else {
                        iM55979 = (C0946.m55979("ۧ᩶") + i3) * 127;
                        i = ((iM55979 ^ i4) * 25463) ^ 788214699;
                        i2 = -1564585556;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1158277942:
                case 574258624:
                    c = 0;
                    if (AbstractC0942.m55971()) {
                        iM55979 = (i4 - C0946.m55979("ܰۡ")) * 79;
                        i = ((iM55979 ^ i3) * (-8447)) ^ 1946467073;
                        i2 = 284098538;
                    } else {
                        iM55979 = C0873.m55680("ۛܺ") ^ i3;
                        i = ((iM55979 ^ i4) * 11819) ^ 765588608;
                        i2 = 1307967932;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -960165890:
                case -60648581:
                    C0877.m55696();
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-2791)) ^ 1902147666;
                        i2 = 1435394917;
                    } else {
                        iM55979 = (C0946.m55979("ۧ᩶") + i3) * 127;
                        i = ((iM55979 ^ i4) * 25463) ^ 788214699;
                        i2 = -1564585556;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -800262475:
                case 1630526688:
                    if (C0845.m55582(packageName, C0898.m55792(sArr2, i12, 6, i11))) {
                        iM55979 = C0946.m55979("۫᩺") ^ i3;
                        i = ((iM55979 ^ i4) * (-16937)) ^ 67017954;
                        i2 = 1144227454;
                    } else {
                        iM55979 = (C0873.m55680("ۛܰ") + i4) * 45;
                        i = ((iM55979 ^ i3) * 24973) ^ (-2021511567);
                        i2 = 1613195104;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -492074264:
                case 894721195:
                    i7 = s + s2;
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("ۛۗ") + i3) * 15;
                        i = ((iM55979 ^ i4) * (-5431)) ^ 528216223;
                        i2 = 352312942;
                    } else {
                        iM55979 = C0873.m55680("۠ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 18881) ^ 1903619695;
                        i2 = -1727513471;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -374684996:
                case 125570983:
                    RunnableC1014.m56177();
                    break;
                case -364990852:
                case 974797982:
                    sArr2 = f82252;
                    if (C1024.f81946) {
                        iM55979 = (i4 - C0946.m55979("ܰۡ")) * 79;
                        i = ((iM55979 ^ i3) * (-8447)) ^ 1946467073;
                        i2 = 284098538;
                    } else {
                        iM55979 = (i4 - C0946.m55979("᩸᩵")) * (-85);
                        i = ((iM55979 ^ i3) * (-4985)) ^ 709080368;
                        i2 = -512464078;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -222797549:
                case 1452841149:
                    C0873.m55678();
                    if (C1053.m56327() < 0) {
                        iM55979 = C0946.m55979("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-2791)) ^ 1902147666;
                        i2 = 1435394917;
                    } else {
                        iM55979 = (C0873.m55680("᩻᩺") + i4) * (-103);
                        i = ((iM55979 ^ i3) * 7677) ^ (-901007495);
                        i2 = 161181957;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -222521097:
                case 355201193:
                    i11 = 632;
                    iM55979 = (C0946.m55979("ۢܽ") + i4) * 3;
                    i = ((iM55979 ^ i3) * 29605) ^ (-1975045228);
                    i2 = 897033245;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -147779303:
                case 1108794671:
                    i12 = 1;
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("᩻᩶") ^ i3;
                        i = ((iM55979 ^ i4) * 19655) ^ 490938173;
                        i2 = 1031313849;
                    } else {
                        iM55979 = (C0873.m55680("᩻᩺") + i4) * (-103);
                        i = ((iM55979 ^ i3) * 7677) ^ (-901007495);
                        i2 = 161181957;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 313269057:
                case 567816953:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C1071.m56343() != 0) {
                        iM55979 = (C0873.m55680("᩻᩺") + i4) * (-103);
                        i = ((iM55979 ^ i3) * 7677) ^ (-901007495);
                        i2 = 161181957;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩴ۬")) * (-127);
                        i = ((iM55979 ^ i4) * 15491) ^ (-365024855);
                        i2 = 1806846236;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 936380235:
                case 955481283:
                    i10 = 14884;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-2791)) ^ 1902147666;
                        i2 = 1435394917;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۖۛ")) * 51;
                        i = ((iM55979 ^ i3) * (-4611)) ^ 1295974276;
                        i2 = 1107637273;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1385493411:
                case 1973498291:
                    i11 = 26299;
                    iM55979 = (C0946.m55979("ۢܽ") + i4) * 3;
                    i = ((iM55979 ^ i3) * 29605) ^ (-1975045228);
                    i2 = 897033245;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    super.onCreate(bundle);
                    packageName = getPackageName();
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("᩻᩺") + i4) * (-103);
                        i = ((iM55979 ^ i3) * 7677) ^ (-901007495);
                        i2 = 161181957;
                    } else {
                        iM55979 = C0873.m55680("ۙܺ") ^ i3;
                        i = ((iM55979 ^ i4) * 27577) ^ 1992498192;
                        i2 = 118052266;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        WeakReference weakReference = null;
        InterfaceC11094 interfaceC11094 = null;
        int i = 402481512;
        int i2 = C1036.f81953;
        int i3 = C0898.f81858;
        int iM55979 = C0946.m55979("ܿۛ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 14483) ^ (-1152524461);
        int i5 = 2001777770;
        while (true) {
            i = ((((i ^ i2) * (-28271)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1982750175:
                case 1321828530:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0873.m55680("᩺ۡ") ^ i2) * (-63);
                        i4 = ((iM55979 ^ i3) * (-9897)) ^ 1672120387;
                        i5 = -552099835;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩷ۗ")) * 87;
                        i4 = ((iM55979 ^ i2) * (-21143)) ^ 1278037581;
                        i5 = -1752242783;
                    }
                    break;
                case -1751948118:
                case -587171136:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("ۜ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        iM55979 = C0946.m55979("۠ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 26123) ^ (-2019459198);
                        i5 = 953390963;
                    }
                    break;
                case -1376217439:
                case 1951098777:
                    weakReference = f53144;
                    if (weakReference != null) {
                        iM55979 = C0946.m55979("᩻ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13871)) ^ (-922927836);
                        i5 = -1631190988;
                    } else {
                        iM55979 = C0946.m55979("ۗۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32165)) ^ (-1116718623);
                        i5 = 75800145;
                    }
                    break;
                case -1362741656:
                case 2015763937:
                    interfaceC11094 = (InterfaceC11094) weakReference.get();
                    if (interfaceC11094 != null) {
                        iM55979 = C0873.m55680("ܶۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-17153)) ^ (-2036055940);
                        i5 = 694951609;
                    } else {
                        iM55979 = C0946.m55979("֫ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21657) ^ (-545045959);
                        i5 = -877708366;
                    }
                    break;
                case -1204937468:
                case 70036380:
                    if (C0882.m55710() != 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        iM55979 = (C0946.m55979("ܽ᩸") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * 29323) ^ (-1676358148);
                        i5 = -1182423766;
                    }
                    break;
                case -1020556556:
                case 1698194518:
                    f53144 = null;
                    iM55979 = C0946.m55979("ۗۨ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-32165)) ^ (-1116718623);
                    i5 = 75800145;
                    break;
                case -820027015:
                case 2006168950:
                    C0946.m55980();
                    C1071.m56343();
                    iM55979 = C0873.m55680("ܿ᩹") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-17607)) ^ 1758097277;
                    i5 = 185126907;
                    break;
                case -238087881:
                case 2076672386:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        iM55979 = (C0946.m55979("᩹ۗ") ^ i2) * 65;
                        i4 = ((iM55979 ^ i3) * (-4781)) ^ 142588130;
                        i5 = -1910593582;
                    }
                    break;
                case -212465088:
                case 1504754906:
                    ViewOnClickListenerC0939.m55941();
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        iM55979 = C0873.m55680("ܿ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    }
                    break;
                case -100747678:
                case 1383695057:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        iM55979 = C0873.m55680("ᩳܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 2643) ^ (-191215994);
                        i5 = 1865531166;
                    }
                    break;
                case 59519785:
                case 2087603995:
                    C1046.m56302();
                    C0937.m55918();
                    break;
                case 189525346:
                case 868769331:
                    if (C0845.m55584() <= 0) {
                        iM55979 = C0873.m55680("ۜ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        iM55979 = C0946.m55979("᩹᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7567)) ^ (-555912830);
                        i5 = -1264981032;
                    }
                    break;
                case 201343848:
                case 539417133:
                    C0955.m56027(this);
                    break;
                case 284811257:
                case 1195571842:
                    C0906.m55809();
                    if (!C0861.f81831) {
                        iM55979 = C0873.m55680("ۜ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    }
                    break;
                case 466887500:
                case 811027266:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۜ֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13015)) ^ (-821766313);
                        i5 = 704421161;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֨֡")) * 127;
                        i4 = ((iM55979 ^ i3) * 26169) ^ (-1154494447);
                        i5 = -561291567;
                    }
                    break;
                case 579670658:
                case 1552466420:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("ܿ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    } else {
                        iM55979 = (C0946.m55979("ۚ֨") ^ i3) * 19;
                        i4 = ((iM55979 ^ i2) * (-27027)) ^ 634440522;
                        i5 = -1844171903;
                    }
                    break;
                case 946407144:
                case 1423786549:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ܿ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17607)) ^ 1758097277;
                        i5 = 185126907;
                    } else {
                        iM55979 = (C0873.m55680("ۙܰ") + i3) * (-83);
                        i4 = ((iM55979 ^ i2) * 3609) ^ (-1320262048);
                        i5 = 1617072999;
                    }
                    break;
                case 1005650330:
                case 1049755214:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("᩺ۡ") ^ i2) * (-63);
                        i4 = ((iM55979 ^ i3) * (-9897)) ^ 1672120387;
                        i5 = -552099835;
                    } else {
                        iM55979 = C0873.m55680("ۜۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23129) ^ 987219045;
                        i5 = 1004767151;
                    }
                    break;
                case 1569967614:
                case 2144621790:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("ۜ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9533) ^ 1702385076;
                        i5 = -70065517;
                    } else {
                        iM55979 = C0946.m55979("ۨ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-20649)) ^ (-1878211302);
                        i5 = 212360391;
                    }
                    break;
                default:
                    interfaceC11094.onResp(baseResp);
                    iM55979 = C0946.m55979("֫ۙ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 21657) ^ (-545045959);
                    i5 = -877708366;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40409(InterfaceC11094 interfaceC11094) {
        f53144 = new WeakReference(interfaceC11094);
    }
}
