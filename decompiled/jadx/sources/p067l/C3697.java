package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.֨᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3697 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۖ۫ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f81866 = {7432, -4667, -4645, -4657, -4659, -4646, -4646, -4665, -4646, 32653, -17638, -29718};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10403 f7807;

    public C3697(C10403 c10403) {
        this.f7807 = c10403;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x037e A[PHI: r8 r17
      0x037e: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:91:0x037c, B:82:0x0333] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r17v16 java.lang.String) = (r17v14 java.lang.String), (r17v17 java.lang.String) binds: [B:91:0x037c, B:82:0x0333] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        if (p067l.C0912.f81867 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (p067l.C0898.f81858 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (p067l.RunnableC1014.f81941 <= 0) goto L8;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        short[] sArr;
        int iM559710;
        int i5;
        String str;
        String strM56252;
        int i6 = C0992.f81922;
        int i7 = C0967.f81910;
        int iM55681 = (C0873.m55680("֡۟") ^ i7) * (-121);
        int i8 = ((iM55681 ^ i6) * (-26559)) ^ 1233606061;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = iM55681 ^ 1549050137;
        String action = null;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1239509531;
        String strM56102 = null;
        String strM56156 = null;
        String str2 = null;
        C10403 c10403 = null;
        int i15 = 0;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i6) * (-233)) >> 31));
            switch (i14) {
                case -2120536368:
                case -1812014765:
                    c10403.m24097(i15, strM56156);
                    break;
                case -2092199032:
                case -187424820:
                    break;
                case -2084518423:
                case -1155262122:
                    sArr3 = f81866;
                    i12 = 9;
                    i13 = 3;
                    if (C0877.f81843 < 0) {
                        iM55979 = C0946.m55979("ܶܶ") ^ i7;
                        i = ((iM55979 ^ i6) * 1501) ^ 206176270;
                        i2 = 1568560642;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        action = action;
                        iM559710 = (C0946.m55979("ۚᩴ") ^ i7) * 25;
                        sArr2 = sArr;
                        i8 = ((iM559710 ^ i6) * 15633) ^ (-163195592);
                        i5 = 1859154903;
                        str = action;
                        i9 = iM559710 ^ i5;
                        action = str;
                    }
                    break;
                case -2022191174:
                case 246343614:
                    action = action;
                    s = sArr2[0];
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (i7 - C0873.m55680("ۧ᩺")) * 31;
                        i3 = ((iM55680 ^ i6) * (-12073)) ^ 1046423929;
                        i4 = -1540971926;
                    } else {
                        iM55680 = C0873.m55680("ܳۤ") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-1217)) ^ (-1478684522);
                        i4 = -2043812078;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1766627044:
                case 501352192:
                    if (ViewOnClickListenerC0939.m55949(C10403.f28767[i15], action)) {
                        iM55979 = C0946.m55979("ۙ᩸") ^ i6;
                        i = ((iM55979 ^ i7) * (-13811)) ^ (-514672444);
                        i2 = -1144104953;
                    } else {
                        iM55979 = C0946.m55979("ܳܳ") ^ i7;
                        i = ((iM55979 ^ i6) * 24845) ^ 48993162;
                        i2 = 1894585707;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1760609237:
                case 1177671436:
                    break;
                case -1751004120:
                case -264600446:
                    action = action;
                    if (C1194.f82045 != 0) {
                        iM55680 = (i7 - C0873.m55680("ۧ᩺")) * 31;
                        i3 = ((iM55680 ^ i6) * (-12073)) ^ 1046423929;
                        i4 = -1540971926;
                    } else {
                        iM55680 = (C0946.m55979("ۨܰ") ^ i6) * (-5);
                        i3 = ((iM55680 ^ i7) * (-21491)) ^ 713360170;
                        i4 = -427291112;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1715457285:
                case 119560139:
                    i11 = 60840;
                    iM55680 = C0873.m55680("ۤ֫") ^ i6;
                    i3 = ((iM55680 ^ i7) * (-6527)) ^ (-873629318);
                    i4 = 1503493315;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1558952097:
                case -548896828:
                    action = action;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ۗ֫") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-26607)) ^ 1979531672;
                        i4 = -1151717706;
                    } else {
                        iM55680 = C0873.m55680("ܿܳ") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-30681)) ^ (-1673948717);
                        i4 = -1019747525;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1486443037:
                case -3582024:
                    action = action;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("᩶ܽ") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-30057)) ^ 1176134881;
                        i4 = 1860772351;
                    } else {
                        iM55680 = C0873.m55680("ۚܺ") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-4047)) ^ 1256813166;
                        i4 = 2073991030;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1486132297:
                case 1847655816:
                    action = action;
                    if (i10 - (41944 * s) < 0) {
                        iM55680 = (C0946.m55979("᩺ۘ") ^ i6) * (-51);
                        i3 = ((iM55680 ^ i7) * (-31029)) ^ (-1893779445);
                        i4 = 1982006555;
                    } else {
                        iM55680 = (C0946.m55979("ۤۜ") + i7) * (-79);
                        i3 = ((iM55680 ^ i6) * (-18763)) ^ 792204060;
                        i4 = 2116163575;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1418174431:
                case -79086753:
                    if (C0906.m55806(C10403.f28766[i15], action)) {
                        iM55979 = C0946.m55979("ۙ᩸") ^ i6;
                        i = ((iM55979 ^ i7) * (-13811)) ^ (-514672444);
                        i2 = -1144104953;
                    } else {
                        iM55979 = (i7 - C0873.m55680("۬᩷")) * (-3);
                        i = ((iM55979 ^ i6) * 21215) ^ 1269920807;
                        i2 = -512127963;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -1133644288:
                case -1052433748:
                    i15++;
                    iM55680 = C0946.m55979("۬ۚ") ^ i7;
                    action = action;
                    i3 = ((iM55680 ^ i6) * 24727) ^ (-2105127187);
                    i4 = -1388662848;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -1118742928:
                case -187107754:
                    action = action;
                    sArr = f81866;
                    if (C1194.m56396() <= 0) {
                        iM559710 = (C0946.m55979("ۚᩴ") ^ i7) * 25;
                        sArr2 = sArr;
                        i8 = ((iM559710 ^ i6) * 15633) ^ (-163195592);
                        i5 = 1859154903;
                    } else {
                        iM559710 = C0946.m55979("ܽ᩺") ^ i7;
                        sArr2 = sArr;
                        i8 = ((iM559710 ^ i6) * 2373) ^ 989585561;
                        i5 = 215219507;
                    }
                    str = action;
                    i9 = iM559710 ^ i5;
                    action = str;
                    break;
                case -979638306:
                case 821968726:
                    C0863.m55643();
                    break;
                case -930710302:
                case -230455909:
                    C0877.m55696();
                    break;
                case -841502711:
                case -484080065:
                    ServiceConnectionC1013.m56157();
                    action = action;
                    iM55680 = C0946.m55979("ۙۜ") ^ i6;
                    i3 = ((iM55680 ^ i7) * (-19793)) ^ 846887216;
                    i4 = 623324721;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -690325354:
                case -172618292:
                    strM56102 = C0992.m56102(sArr3, i12, i13, i11);
                    if (!C0917.f81868) {
                        iM55979 = (i6 - C0946.m55979("᩸ܺ")) * 81;
                        i = ((iM55979 ^ i7) * 32569) ^ 1041251275;
                        i2 = -1024080076;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        action = action;
                        iM559710 = (C0946.m55979("ۚᩴ") ^ i7) * 25;
                        sArr2 = sArr;
                        i8 = ((iM559710 ^ i6) * 15633) ^ (-163195592);
                        i5 = 1859154903;
                        str = action;
                        i9 = iM559710 ^ i5;
                        action = str;
                    }
                    break;
                case -558534387:
                case -366371504:
                    i11 = 51455;
                    iM55680 = C0873.m55680("ۤ֫") ^ i6;
                    i3 = ((iM55680 ^ i7) * (-6527)) ^ (-873629318);
                    i4 = 1503493315;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case -532190469:
                case -303858758:
                    strM56156 = ServiceConnectionC1013.m56156(C0946.m55979(strM56102) ^ 2101185376);
                    iM55979 = (i6 - C0946.m55979("ۡ֨")) * 39;
                    i = ((iM55979 ^ i7) * (-11075)) ^ 1362200988;
                    i2 = -1293843313;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case -335294671:
                case 647936762:
                    action = action;
                    if (i15 < 3) {
                        iM55680 = (i7 - C0946.m55979("ܿܿ")) * 3;
                        i3 = ((iM55680 ^ i6) * 17601) ^ 610839717;
                        i4 = -1071870597;
                    } else {
                        iM55680 = C0946.m55979("ۙ۫") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-26267)) ^ (-1276868937);
                        i4 = -2035714195;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case 79330297:
                case 614645860:
                    String strM55967 = AbstractC0942.m55967(intent, str2);
                    if (C1053.m56332(strM55967)) {
                        int iM55682 = (i7 - C0873.m55680("᩷᩸")) * (-37);
                        i8 = ((iM55682 ^ i6) * (-20053)) ^ 1824167524;
                        i9 = iM55682 ^ 1787652919;
                    } else {
                        strM56156 = strM55967;
                        iM55979 = (i6 - C0946.m55979("ۡ֨")) * 39;
                        i = ((iM55979 ^ i7) * (-11075)) ^ 1362200988;
                        i2 = -1293843313;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    }
                    break;
                case 309410724:
                case 1696729040:
                    strM56252 = C1025.m56233(f81866, 4, 5, i11);
                    str2 = strM56252;
                    iM55979 = (i6 - C0873.m55680("ܰ᩸")) * 41;
                    i = ((iM55979 ^ i7) * (-2423)) ^ 1355826433;
                    i2 = 706079372;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 469528486:
                case 1309059627:
                    action = action;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i7 - C0946.m55979("ۘ۫")) * (-91);
                        i3 = ((iM55680 ^ i6) * 4297) ^ 292776794;
                        i4 = 445349609;
                    } else {
                        iM55680 = (C0946.m55979("ۤۧ") ^ i6) * 35;
                        i3 = ((iM55680 ^ i7) * (-13363)) ^ 1737138322;
                        i4 = -2100823807;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case 616269813:
                case 1290896981:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("᩹֫") ^ i6;
                        i = ((iM55979 ^ i7) * (-5983)) ^ (-1427682663);
                        i2 = -1649324480;
                        i9 = iM55979 ^ i2;
                        i8 = i;
                    } else {
                        action = action;
                        iM55680 = C0946.m55979("ۙۜ") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-19793)) ^ 846887216;
                        i4 = 623324721;
                        str = action;
                        i9 = iM55680 ^ i4;
                        i8 = i3;
                        action = str;
                    }
                    break;
                case 649801251:
                case 1935753531:
                    if (i15 == 0) {
                        iM55979 = (C0946.m55979("᩻ۘ") + i7) * 43;
                        i = ((iM55979 ^ i6) * 12855) ^ (-975246263);
                        i2 = 270182667;
                    } else {
                        iM55979 = (C0873.m55680("ۡۜ") ^ i6) * 75;
                        i = ((iM55979 ^ i7) * (-15855)) ^ (-937213488);
                        i2 = -802259554;
                    }
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 669974582:
                case 1795696047:
                    break;
                case 813532792:
                case 1217645755:
                    action = action;
                    if (C0845.f81821 < 0) {
                        iM55680 = C0946.m55979("ᩳ֡") ^ i6;
                        i3 = ((iM55680 ^ i7) * 29357) ^ (-2045039121);
                        i4 = -161554472;
                        str = action;
                        i9 = iM55680 ^ i4;
                        i8 = i3;
                        action = str;
                    } else {
                        sArr = sArr2;
                        iM559710 = (C0946.m55979("ۚᩴ") ^ i7) * 25;
                        sArr2 = sArr;
                        i8 = ((iM559710 ^ i6) * 15633) ^ (-163195592);
                        i5 = 1859154903;
                        str = action;
                        i9 = iM559710 ^ i5;
                        action = str;
                    }
                    break;
                case 860628206:
                case 1804372211:
                    action = action;
                    int i16 = s + 10486;
                    i10 = i16 * i16;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("ۙۜ") ^ i6;
                        i3 = ((iM55680 ^ i7) * (-19793)) ^ 846887216;
                        i4 = 623324721;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩶") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-23475)) ^ 1837316282;
                        i4 = 751783262;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case 1059707182:
                case 1660365863:
                    boolean zM55949 = ViewOnClickListenerC0939.m55949(C10403.f28768[i15], action);
                    c10403 = this.f7807;
                    if (zM55949) {
                        iM55680 = (C0873.m55680("ۨܳ") ^ i6) * 115;
                        action = action;
                        i3 = ((iM55680 ^ i7) * (-5217)) ^ (-154137389);
                        i4 = -870821574;
                    } else {
                        action = action;
                        iM55680 = C0946.m55979("֫۬") ^ i7;
                        i3 = ((iM55680 ^ i6) * (-30999)) ^ (-1998315631);
                        i4 = -1773766155;
                    }
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case 1281865171:
                case 1450131272:
                    c10403.m24097(i15, (String) null);
                    action = action;
                    iM55680 = C0946.m55979("ۙ۫") ^ i6;
                    i3 = ((iM55680 ^ i7) * (-26267)) ^ (-1276868937);
                    i4 = -2035714195;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                case 1315591751:
                case 2057036234:
                    strM56252 = C1036.m56252(f81866, 1, 3, i11);
                    str2 = strM56252;
                    iM55979 = (i6 - C0873.m55680("ܰ᩸")) * 41;
                    i = ((iM55979 ^ i7) * (-2423)) ^ 1355826433;
                    i2 = 706079372;
                    i9 = iM55979 ^ i2;
                    i8 = i;
                    break;
                case 1417695949:
                case 1880358370:
                    if (C1044.f81959 < 0) {
                        action = action;
                        iM55680 = (i7 - C0946.m55979("ۘ۫")) * (-91);
                        i3 = ((iM55680 ^ i6) * 4297) ^ 292776794;
                        i4 = 445349609;
                        str = action;
                        i9 = iM55680 ^ i4;
                        i8 = i3;
                        action = str;
                    }
                    action = action;
                    iM55680 = C0946.m55979("ۗ֫") ^ i7;
                    i3 = ((iM55680 ^ i6) * (-26607)) ^ 1979531672;
                    i4 = -1151717706;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
                default:
                    action = intent.getAction();
                    i15 = 0;
                    iM55680 = C0946.m55979("۬ۚ") ^ i7;
                    action = action;
                    i3 = ((iM55680 ^ i6) * 24727) ^ (-2105127187);
                    i4 = -1388662848;
                    str = action;
                    i9 = iM55680 ^ i4;
                    i8 = i3;
                    action = str;
                    break;
            }
            return;
        }
    }
}
