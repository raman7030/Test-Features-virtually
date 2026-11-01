package p067l;

import bin.p000mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7346 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܺۘ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f81992 = {5203, -22981, 18311, -19046, 262, 31660, -21658, 27380};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f19257;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C11245 f19258;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f19259;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f19260;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Main f19261;

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8 A[PHI: r5
      0x00e8: PHI (r5v4 int) = (r5v3 int), (r5v2 int) binds: [B:30:0x00e6, B:22:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0144 A[PHI: r3 r14 r15
      0x0144: PHI (r3v4 l.ܶ᩵ܿ) = (r3v2 l.ܶ᩵ܿ), (r3v3 l.ܶ᩵ܿ), (r3v2 l.ܶ᩵ܿ) binds: [B:38:0x0142, B:26:0x00c5, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:38:0x0142, B:26:0x00c5, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:38:0x0142, B:26:0x00c5, B:10:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01f5 A[PHI: r2 r4 r10 r11 r12
      0x01f5: PHI (r2v4 l.᩺ۤܿ) = (r2v2 l.᩺ۤܿ), (r2v3 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ), (r2v2 l.᩺ۤܿ) binds: [B:52:0x01f3, B:42:0x017d, B:34:0x0121, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:52:0x01f3, B:42:0x017d, B:34:0x0121, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01f3, B:42:0x017d, B:34:0x0121, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:52:0x01f3, B:42:0x017d, B:34:0x0121, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:52:0x01f3, B:42:0x017d, B:34:0x0121, B:7:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0263 A[PHI: r7 r8 r9 r20
      0x0263: PHI (r7v4 char) = (r7v2 char), (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:64:0x0261, B:60:0x0243, B:56:0x0228, B:16:0x007f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:64:0x0261, B:60:0x0243, B:56:0x0228, B:16:0x007f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:64:0x0261, B:60:0x0243, B:56:0x0228, B:16:0x007f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x0261, B:60:0x0243, B:56:0x0228, B:16:0x007f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0845.f81821;
        int i4 = C0992.f81922;
        int iM55680 = C0873.m55680("ۨ᩻") ^ i4;
        int i5 = ((iM55680 ^ i3) * 31075) ^ (-553828573);
        AbstractC17043 abstractC17043 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 2022872086;
        C24164 c24164 = null;
        int iM559710 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1033774914;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 16307) >> 31));
            switch (i13) {
                case -2113921014:
                case -1188683853:
                    i11 = 61701;
                    iM55979 = C0946.m55979("ۛۙ") ^ i3;
                    i = ((iM55979 ^ i4) * 24865) ^ (-148624098);
                    i2 = -208608796;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2112701080:
                case -321633292:
                    if (C0967.f81910 < 0) {
                        iM55979 = (i3 - C0873.m55680("۟ۘ")) * 71;
                        i = ((iM55979 ^ i4) * (-25547)) ^ (-1378972057);
                        i2 = 1673318655;
                    } else {
                        iM55979 = (C0873.m55680("ۗۙ") + i4) * 17;
                        i = ((iM55979 ^ i3) * 9985) ^ 1186341119;
                        i2 = -1621932772;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1923846129:
                case -569558130:
                    i7 = 2097549399;
                    if (C0927.f81875) {
                        iM55979 = (i4 - C0873.m55680("᩷֡")) * 15;
                        i = ((iM55979 ^ i3) * (-19153)) ^ (-713986584);
                        i2 = -2037188159;
                    } else {
                        iM55979 = C0946.m55979("᩷۬") ^ i3;
                        i = ((iM55979 ^ i4) * 1021) ^ 386586442;
                        i2 = 1130600252;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1791758987:
                case -473468626:
                    sArr = f81992;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("ۜۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28119)) ^ 662104557;
                        i2 = 431974827;
                    } else {
                        iM55979 = C0946.m55979("۫ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * 28331) ^ 1396946677;
                        i2 = -736804418;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1493903570:
                case 1177264130:
                    iM559710 = C0946.m55979(C0927.m55863(sArr2, i12, 3, i11));
                    if (C0955.f81898) {
                        iM55979 = (i3 - C0873.m55680("ܿۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i4) * (-4935)) ^ (-1599906258);
                        i2 = -342895142;
                    } else {
                        iM55979 = C0946.m55979("ܺᩴ") ^ i3;
                        i = ((iM55979 ^ i4) * 2847) ^ 320012254;
                        i2 = 1911658302;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1330733717:
                case 1334107625:
                    s = sArr[c];
                    s2 = 18148;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("ۜۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28119)) ^ 662104557;
                        i2 = 431974827;
                    } else {
                        iM55979 = C0873.m55680("᩻ۤ") ^ i4;
                        i = ((iM55979 ^ i3) * 21837) ^ (-1120604503);
                        i2 = -1929293591;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1295428247:
                case -57418771:
                    c24164.mo51878((Runnable) null);
                    c24164.mo51883();
                    this.f19259 = c24164;
                    break;
                case -1077563102:
                case 1130876510:
                    c24164.m53440(iM559710 ^ i7);
                    abstractC17043 = this.f19257;
                    if (C0947.m55997()) {
                        iM55979 = (C0873.m55680("ۗۙ") + i4) * 17;
                        i = ((iM55979 ^ i3) * 9985) ^ 1186341119;
                        i2 = -1621932772;
                    } else {
                        iM55979 = (C0946.m55979("᩵ᩳ") + i4) * 99;
                        i = ((iM55979 ^ i3) * (-23733)) ^ (-61757986);
                        i2 = -104115213;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -605310804:
                case 1792300987:
                    C0927.m55873();
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i3 - C0873.m55680("۟ۘ")) * 71;
                        i = ((iM55979 ^ i4) * (-25547)) ^ (-1378972057);
                        i2 = 1673318655;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܿۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i4) * (-4935)) ^ (-1599906258);
                        i2 = -342895142;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -292548696:
                case 1486615790:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("ۜۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28119)) ^ 662104557;
                        i2 = 431974827;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۟ۘ")) * 71;
                        i = ((iM55979 ^ i4) * (-25547)) ^ (-1378972057);
                        i2 = 1673318655;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -199345189:
                case 214795333:
                    C0890.m55740();
                    C1046.m56302();
                    break;
                case 242922300:
                case 1627872826:
                    if (i8 - (i9 + i10) <= 0) {
                        iM55979 = (C0946.m55979("ۗۢ") ^ i3) * (-77);
                        i = ((iM55979 ^ i4) * 12879) ^ (-1557755831);
                        i2 = -2145200918;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۤ᩷")) * 87;
                        i = ((iM55979 ^ i3) * (-14225)) ^ 1185454617;
                        i2 = -705151860;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 244980082:
                case 736698798:
                    sArr2 = f81992;
                    i12 = 5;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55979 = (C0873.m55680("ۗۙ") + i4) * 17;
                        i = ((iM55979 ^ i3) * 9985) ^ 1186341119;
                        i2 = -1621932772;
                    } else {
                        iM55979 = (C0946.m55979("ۖܰ") + i4) * 51;
                        i = ((iM55979 ^ i3) * (-28143)) ^ 1605379113;
                        i2 = 292651260;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 255141873:
                case 734337898:
                    c24164 = new C24164(this.f19261);
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("֨ۨ") ^ i4) * (-49);
                        i = ((iM55979 ^ i3) * 18657) ^ 117733735;
                        i2 = -1345589506;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܿۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i4) * (-4935)) ^ (-1599906258);
                        i2 = -342895142;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 460930028:
                case 527756569:
                    c24164.m53431(C1404.m56460(abstractC17043));
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i4 - C0873.m55680("᩷֡")) * 15;
                        i = ((iM55979 ^ i3) * (-19153)) ^ (-713986584);
                        i2 = -2037188159;
                    } else {
                        iM55979 = C0946.m55979("ۡܰ") ^ i3;
                        i = ((iM55979 ^ i4) * 29099) ^ 207140632;
                        i2 = 3545801;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 968103403:
                case 1605376020:
                    c = 4;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("ۜۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-28119)) ^ 662104557;
                        i2 = 431974827;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩶ۛ")) * 33;
                        i = ((iM55979 ^ i4) * 32591) ^ (-311905976);
                        i2 = -547685617;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1252270528:
                case 1915942497:
                    C1048.m56305();
                    C1071.m56343();
                    iM55979 = C0873.m55680("ۜۜ") ^ i4;
                    i = ((iM55979 ^ i3) * (-28119)) ^ 662104557;
                    i2 = 431974827;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1621353168:
                case 1896321843:
                    i8 = s * s2;
                    i9 = s * s;
                    i10 = 82337476;
                    if (C1024.f81946) {
                        iM55979 = (i3 - C0873.m55680("ܿۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i4) * (-4935)) ^ (-1599906258);
                        i2 = -342895142;
                    } else {
                        iM55979 = C0946.m55979("ᩳۡ") ^ i3;
                        i = ((iM55979 ^ i4) * 23415) ^ (-890748315);
                        i2 = -220425031;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 45053;
                    iM55979 = C0946.m55979("ۛۙ") ^ i3;
                    i = ((iM55979 ^ i4) * 24865) ^ (-148624098);
                    i2 = -208608796;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C7346(Main main, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, C11245 c11245) {
        int i = 565373591;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = RunnableC0938.f81886;
        this.f19261 = main;
        this.f19257 = abstractC17043;
        this.f19260 = abstractC17044;
        this.f19258 = c11245;
        int iM55979 = C0946.m55979("۬֡") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-12143)) ^ 827497366;
        int i5 = 172039720;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i3) * (-17893)) >> 31));
            switch (i) {
                case -1484412218:
                case 6545732:
                    C1404.m56468();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۚ᩶")) * 47;
                        i4 = ((iM55979 ^ i2) * (-23647)) ^ (-1789875241);
                        i5 = -587577598;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۤۜ")) * 15;
                        i4 = ((iM55979 ^ i3) * (-15759)) ^ 1262892286;
                        i5 = -635485336;
                    }
                    break;
                case -1130519140:
                case 946157024:
                    C1046.m56302();
                    C0955.m56025();
                    throw new RuntimeException();
                case -1114249584:
                case 1299370867:
                    if (C1124.f82007 < 0) {
                        iM55979 = (i3 - C0873.m55680("ۚ᩶")) * 47;
                        i4 = ((iM55979 ^ i2) * (-23647)) ^ (-1789875241);
                        i5 = -587577598;
                    } else {
                        iM55979 = C0946.m55979("ܺۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9375) ^ 995244110;
                        i5 = 912691970;
                    }
                    break;
                case -1019697402:
                case -662162510:
                    C1964.m56597();
                    iM55979 = (i2 - C0946.m55979("ۤۜ")) * 15;
                    i4 = ((iM55979 ^ i3) * (-15759)) ^ 1262892286;
                    i5 = -635485336;
                    break;
                case -424265875:
                case 1028548644:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10767) ^ (-303775632);
                        i5 = -1585046428;
                    } else {
                        iM55979 = (C0946.m55979("᩻ᩴ") ^ i3) * (-57);
                        i4 = ((iM55979 ^ i2) * 14911) ^ (-153100467);
                        i5 = 1355145099;
                    }
                    break;
                case 340810064:
                case 1101362405:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ۢۖ") + i2) * (-67);
                        i4 = ((iM55979 ^ i3) * (-28413)) ^ (-292847346);
                        i5 = 970556690;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۤۜ")) * 15;
                        i4 = ((iM55979 ^ i3) * (-15759)) ^ 1262892286;
                        i5 = -635485336;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x02e1 A[PHI: r4 r5 r15 r16 r18
      0x02e1: PHI (r4v4 l.ܶ᩵ܿ) = (r4v3 l.ܶ᩵ܿ), (r4v2 l.ܶ᩵ܿ) binds: [B:97:0x02c9, B:92:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r5v3 l.۬ۚ᩷) = (r5v2 l.۬ۚ᩷), (r5v4 l.۬ۚ᩷) binds: [B:97:0x02c9, B:92:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r15v32 java.lang.Throwable) = (r15v31 java.lang.Throwable), (r15v33 java.lang.Throwable) binds: [B:97:0x02c9, B:92:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r16v20 int) = (r16v19 int), (r16v21 int) binds: [B:97:0x02c9, B:92:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r18v18 java.lang.Throwable) = (r18v17 java.lang.Throwable), (r18v19 java.lang.Throwable) binds: [B:97:0x02c9, B:92:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        if (p067l.AbstractC0942.f81890 <= 0) goto L39;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws Throwable {
        Throwable th;
        int i;
        Throwable th2;
        int iM55680;
        int i2;
        int i3;
        int iM55681;
        int i4;
        int i5;
        int iM55682;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = C1036.f81953;
        int i13 = C1003.f81929;
        int iM55979 = (C0946.m55979("ܶ֫") + i13) * 47;
        int i14 = ((iM55979 ^ i12) * 10725) ^ (-1681216392);
        InputStream inputStreamM33464 = null;
        Object obj = null;
        int i15 = iM55979 ^ 2029970220;
        C2651 c2651 = null;
        int i16 = -1353018278;
        C14643 c14643M31757 = null;
        Object obj2 = null;
        AbstractC17043 abstractC17043 = null;
        Throwable th3 = null;
        AbstractC17043 abstractC17044 = null;
        Throwable th4 = null;
        OutputStream outputStreamMo25506 = null;
        boolean z = false;
        while (true) {
            int i17 = i15 ^ (i14 & (((i16 ^ i12) * (-24673)) >> 31));
            switch (i17) {
                case -2083064973:
                case -88969346:
                    th = th3;
                    i = i17;
                    th2 = th4;
                    abstractC17044.mo37342();
                    abstractC17043 = this.f19257;
                    if (abstractC17043.m38665()) {
                        iM55680 = (C0946.m55979("ܳ᩸") + i13) * 93;
                        i2 = ((iM55680 ^ i12) * 11651) ^ (-54318221);
                        i3 = -185057446;
                    } else {
                        iM55680 = C0873.m55680("᩷᩵") ^ i12;
                        i2 = ((iM55680 ^ i13) * (-24589)) ^ 1138319262;
                        i3 = 946370788;
                    }
                    i8 = iM55680 ^ i3;
                    th3 = th;
                    i11 = i;
                    i15 = i8;
                    i14 = i2;
                    th4 = th2;
                    i16 = i11;
                    break;
                case -1842361948:
                case 277591887:
                    i = i17;
                    try {
                        C0877.m55706(th3, obj);
                        iM55681 = (C0946.m55979("ۘ۠") + i12) * (-13);
                        i4 = ((iM55681 ^ i13) * 26365) ^ 1509602061;
                        i5 = -587267223;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    } catch (Throwable th5) {
                        th4 = th5;
                        int iM559710 = C0946.m55979("᩵᩶") ^ i13;
                        i16 = i;
                        i15 = iM559710 ^ (-1141767941);
                        i14 = ((iM559710 ^ i12) * 16855) ^ (-62132745);
                        th3 = th3;
                    }
                    break;
                case -1790350640:
                case -1701514514:
                    i = i17;
                    throw th3;
                case -1747784548:
                case 1344062393:
                    RunnableC0897.m55779(inputStreamM33464);
                    return;
                case -1719134670:
                case 1741430529:
                    i = i17;
                    if (inputStreamM33464 != null) {
                        iM55681 = C0946.m55979("֫ۙ") ^ i12;
                        i4 = ((iM55681 ^ i13) * 8941) ^ (-270549746);
                        i5 = -1008257649;
                    } else {
                        iM55681 = C0873.m55680("ܶۡ") ^ i12;
                        i4 = ((iM55681 ^ i13) * 14237) ^ 1905897068;
                        i5 = 53992689;
                    }
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -1663989245:
                case -280174135:
                    i = i17;
                    try {
                        C0992.m56103(outputStreamMo25506);
                        iM55681 = (C0946.m55979("ۘ۠") + i12) * (-13);
                        i4 = ((iM55681 ^ i13) * 26365) ^ 1509602061;
                        i5 = -587267223;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    } catch (Throwable th6) {
                        int iM559711 = C0946.m55979("ۘۖ") ^ i12;
                        i9 = ((iM559711 ^ i13) * 19255) ^ 164612046;
                        i10 = iM559711 ^ 1959540047;
                        obj = th6;
                        i14 = i9;
                        i16 = i;
                        i15 = i10;
                    }
                    break;
                case -1651719614:
                case 1539811369:
                    i = i17;
                    try {
                        outputStreamMo25506 = abstractC17044.mo25506(z);
                        th2 = th4;
                        th = th3;
                        try {
                            C15841.m35957(inputStreamM33464, outputStreamMo25506, c14643M31757.length(), c2651);
                            iM55680 = (i13 - C0873.m55680("ۡۢ")) * 23;
                            i2 = ((iM55680 ^ i12) * (-1587)) ^ (-1459442316);
                            i3 = -897583013;
                            i8 = iM55680 ^ i3;
                            th3 = th;
                        } catch (Throwable th7) {
                            th3 = th7;
                            int iM55683 = C0873.m55680("۟᩹") ^ i13;
                            i2 = ((iM55683 ^ i12) * 32675) ^ 1448885;
                            i8 = iM55683 ^ (-1732895210);
                        }
                        i11 = i;
                        i15 = i8;
                        i14 = i2;
                        th4 = th2;
                        i16 = i11;
                    } catch (Throwable th8) {
                        th4 = th8;
                        int iM559712 = C0946.m55979("᩵᩶") ^ i13;
                        i16 = i;
                        i15 = iM559712 ^ (-1141767941);
                        i14 = ((iM559712 ^ i12) * 16855) ^ (-62132745);
                        th3 = th3;
                    }
                    break;
                case -1554671980:
                case 1922560483:
                    th = th3;
                    i = i17;
                    th2 = th4;
                    c14643M31757 = ActivityC13973.m31757(abstractC17043.mo33652());
                    if (c14643M31757 != null) {
                        iM55680 = C0946.m55979("ܶۚ") ^ i12;
                        i2 = ((iM55680 ^ i13) * (-9567)) ^ (-990615576);
                        i3 = -448575886;
                    } else {
                        iM55680 = C0873.m55680("᩷᩵") ^ i12;
                        i2 = ((iM55680 ^ i13) * (-24589)) ^ 1138319262;
                        i3 = 946370788;
                    }
                    i8 = iM55680 ^ i3;
                    th3 = th;
                    i11 = i;
                    i15 = i8;
                    i14 = i2;
                    th4 = th2;
                    i16 = i11;
                    break;
                case -1435581245:
                case 1923279136:
                    i = i17;
                    C0949.m56011(th4, obj2);
                    iM55681 = C0873.m55680("ܶۡ") ^ i12;
                    i4 = ((iM55681 ^ i13) * 14237) ^ 1905897068;
                    i5 = 53992689;
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -1395962835:
                case 1602984178:
                    i = i17;
                    break;
                case -1165707536:
                case 1699572640:
                    i = i17;
                    C1017.m56193(outputStreamMo25506);
                    iM55681 = (i13 - C0946.m55979("ۙ᩻")) * 89;
                    i4 = ((iM55681 ^ i12) * (-13555)) ^ (-1761404318);
                    i5 = -1413449457;
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -1160795900:
                case 1720017604:
                    i = i17;
                    if (outputStreamMo25506 != null) {
                        iM55681 = C0946.m55979("ۧܺ") ^ i12;
                        i4 = ((iM55681 ^ i13) * 9851) ^ 420962736;
                        i5 = 162470639;
                    } else {
                        iM55681 = (C0946.m55979("ۘ۠") + i12) * (-13);
                        i4 = ((iM55681 ^ i13) * 26365) ^ 1509602061;
                        i5 = -587267223;
                    }
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -808176930:
                case 325004448:
                    C0912.m55833();
                    return;
                case -794633453:
                case 1475411786:
                    i = i17;
                    if (C0877.f81843 < 0) {
                        iM55681 = C0873.m55680("ۢܳ") ^ i13;
                        i4 = ((iM55681 ^ i12) * (-31789)) ^ 375817491;
                        i5 = -868424365;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    } else {
                        th2 = th4;
                        th = th3;
                        iM55682 = (C0873.m55680("ۙۢ") ^ i13) * (-39);
                        i6 = ((iM55682 ^ i12) * 24853) ^ (-1249613021);
                        i7 = 330714420;
                        int i18 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i18;
                        i14 = i6;
                        c2651 = null;
                    }
                    break;
                case -760425926:
                case 1200403370:
                    i = i17;
                    if (outputStreamMo25506 != null) {
                        iM55681 = (i13 - C0946.m55979("᩶֨")) * (-61);
                        i4 = ((iM55681 ^ i12) * (-10089)) ^ 89504737;
                        i5 = -1399335358;
                    } else {
                        iM55681 = (i13 - C0946.m55979("ۙ᩻")) * 89;
                        i4 = ((iM55681 ^ i12) * (-13555)) ^ (-1761404318);
                        i5 = -1413449457;
                    }
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -561508305:
                case 212477960:
                    abstractC17043.m38658(abstractC17044, (C19056) null, c2651);
                    return;
                case -439083889:
                case 1563839901:
                    throw th4;
                case -364505893:
                case 957364931:
                    i = i17;
                    C0894.m55769();
                    C0890.m55740();
                    iM55681 = C0873.m55680("ۡ۫") ^ i13;
                    i4 = ((iM55681 ^ i12) * 10359) ^ 1370755087;
                    i5 = 824617186;
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                case -297442902:
                case 1908729917:
                    i = i17;
                    C1124.m56367();
                    if (C1194.f82045 == 0) {
                        th2 = th4;
                        th = th3;
                        iM55682 = (i12 - C0873.m55680("ܶܺ")) * (-21);
                        i6 = ((iM55682 ^ i13) * 21451) ^ (-705232264);
                        i7 = 2088274042;
                        int i19 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i19;
                        i14 = i6;
                        c2651 = null;
                    } else {
                        iM55681 = (C0873.m55680("᩹֡") + i13) * 75;
                        i4 = ((iM55681 ^ i12) * (-18757)) ^ (-111940149);
                        i5 = 656831597;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    }
                    break;
                case 60851715:
                case 1978732626:
                    th = th3;
                    i = i17;
                    th2 = th4;
                    inputStreamM33464 = c14643M31757.m33464();
                    z = false;
                    iM55680 = C0946.m55979("֫۫") ^ i13;
                    i2 = ((iM55680 ^ i12) * (-30753)) ^ (-542119448);
                    i3 = 2042513121;
                    i8 = iM55680 ^ i3;
                    th3 = th;
                    i11 = i;
                    i15 = i8;
                    i14 = i2;
                    th4 = th2;
                    i16 = i11;
                    break;
                case 202774697:
                case 1580116380:
                    RunnableC1014.m56177();
                    if (C0989.m56095() <= 0) {
                        iM55681 = C0946.m55979("۠ۢ") ^ i13;
                        i = i17;
                        i4 = ((iM55681 ^ i12) * (-8107)) ^ (-1303461786);
                        i5 = 1008436467;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    } else {
                        th = th3;
                        i = i17;
                        th2 = th4;
                        iM55682 = C0946.m55979("۟ۨ") ^ i12;
                        i6 = ((iM55682 ^ i13) * (-5407)) ^ 115534669;
                        i7 = -1324154186;
                        int i110 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i110;
                        i14 = i6;
                        c2651 = null;
                    }
                    break;
                case 410344139:
                case 2003925360:
                    th = th3;
                    i = i17;
                    th2 = th4;
                    abstractC17044 = this.f19260;
                    if (!C0892.f81851) {
                        iM55682 = C0873.m55680("֫ۖ") ^ i13;
                        i6 = ((iM55682 ^ i12) * (-19125)) ^ 306216743;
                        i7 = 779089482;
                        int i111 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i111;
                        i14 = i6;
                        c2651 = null;
                    } else {
                        iM55680 = C0873.m55680("֨ۚ") ^ i12;
                        i2 = ((iM55680 ^ i13) * 18119) ^ 1584649060;
                        i3 = 1697997652;
                        i8 = iM55680 ^ i3;
                        th3 = th;
                        i11 = i;
                        i15 = i8;
                        i14 = i2;
                        th4 = th2;
                        i16 = i11;
                    }
                    break;
                case 509739161:
                case 1596249300:
                    i = i17;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        th2 = th4;
                        th = th3;
                        iM55682 = C0946.m55979("۟ۨ") ^ i12;
                        i6 = ((iM55682 ^ i13) * (-5407)) ^ 115534669;
                        i7 = -1324154186;
                        int i112 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i112;
                        i14 = i6;
                        c2651 = null;
                    } else {
                        iM55681 = C0873.m55680("ۡ۫") ^ i13;
                        i4 = ((iM55681 ^ i12) * 10359) ^ 1370755087;
                        i5 = 824617186;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    }
                    break;
                case 549368849:
                case 1029213693:
                    i = i17;
                    if (C1964.m56597() == 0) {
                        th2 = th4;
                        th = th3;
                        iM55682 = C0873.m55680("ۘ۬") ^ i12;
                        i6 = ((iM55682 ^ i13) * 3397) ^ (-482912540);
                        i7 = -1607338074;
                        int i113 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i113;
                        i14 = i6;
                        c2651 = null;
                    }
                    th2 = th4;
                    th = th3;
                    iM55682 = (C0873.m55680("ۙۢ") ^ i13) * (-39);
                    i6 = ((iM55682 ^ i12) * 24853) ^ (-1249613021);
                    i7 = 330714420;
                    int i114 = iM55682 ^ i7;
                    th4 = th2;
                    i16 = i;
                    th3 = th;
                    i15 = i114;
                    i14 = i6;
                    c2651 = null;
                    break;
                case 621061396:
                case 1529304813:
                    i = i17;
                    try {
                        RunnableC0897.m55779(inputStreamM33464);
                        iM55681 = C0873.m55680("ܶۡ") ^ i12;
                        i4 = ((iM55681 ^ i13) * 14237) ^ 1905897068;
                        i5 = 53992689;
                        i11 = i;
                        i15 = iM55681 ^ i5;
                        i14 = i4;
                        i16 = i11;
                    } catch (Throwable th9) {
                        int iM559713 = C0946.m55979("ۗ᩶") ^ i12;
                        i9 = ((iM559713 ^ i13) * (-16353)) ^ (-226828835);
                        i10 = iM559713 ^ 1284312233;
                        obj2 = th9;
                        i14 = i9;
                        i16 = i;
                        i15 = i10;
                    }
                    break;
                case 1188170407:
                case 2112992782:
                    i = i17;
                    if (C1044.f81959 >= 0) {
                        th2 = th4;
                        th = th3;
                        iM55682 = (C0873.m55680("ۙۢ") ^ i13) * (-39);
                        i6 = ((iM55682 ^ i12) * 24853) ^ (-1249613021);
                        i7 = 330714420;
                        int i115 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i115;
                        i14 = i6;
                        c2651 = null;
                    } else {
                        th2 = th4;
                        th = th3;
                        iM55680 = C0873.m55680("۟ܰ") ^ i12;
                        i2 = ((iM55680 ^ i13) * (-5663)) ^ 872808148;
                        i3 = 212201215;
                        i8 = iM55680 ^ i3;
                        th3 = th;
                        i11 = i;
                        i15 = i8;
                        i14 = i2;
                        th4 = th2;
                        i16 = i11;
                    }
                    break;
                case 1929922081:
                case 1957947176:
                    i = i17;
                    if (C1053.f81965 > 0) {
                        iM55681 = C0873.m55680("ۡ۫") ^ i13;
                        i4 = ((iM55681 ^ i12) * 10359) ^ 1370755087;
                        i5 = 824617186;
                    } else {
                        iM55681 = (C0873.m55680("᩹֡") + i13) * 75;
                        i4 = ((iM55681 ^ i12) * (-18757)) ^ (-111940149);
                        i5 = 656831597;
                    }
                    i11 = i;
                    i15 = iM55681 ^ i5;
                    i14 = i4;
                    i16 = i11;
                    break;
                default:
                    th = th3;
                    i = i17;
                    th2 = th4;
                    if (!C0863.m55643()) {
                        iM55682 = (C0873.m55680("ۙۢ") ^ i13) * (-39);
                        i6 = ((iM55682 ^ i12) * 24853) ^ (-1249613021);
                        i7 = 330714420;
                        int i116 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i116;
                        i14 = i6;
                        c2651 = null;
                    } else {
                        if (C0906.f81862 < 0) {
                            if (C0861.f81831) {
                                if (RunnableC0897.f81856) {
                                    if (C1044.f81959 < 0) {
                                        if (C0967.f81910 < 0) {
                                            if (C1229.f82066 >= 0) {
                                                iM55682 = (i12 - C0873.m55680("ܶܺ")) * (-21);
                                                i6 = ((iM55682 ^ i13) * 21451) ^ (-705232264);
                                                i7 = 2088274042;
                                                int i117 = iM55682 ^ i7;
                                                th4 = th2;
                                                i16 = i;
                                                th3 = th;
                                                i15 = i117;
                                                i14 = i6;
                                                c2651 = null;
                                                break;
                                            } else if (C1124.f82007 < 0) {
                                                c2651 = new C2651(this);
                                                if (C0917.m55854()) {
                                                    iM55680 = C0946.m55979("᩺ܿ") ^ i13;
                                                    i2 = ((iM55680 ^ i12) * 14989) ^ 1853681571;
                                                    i3 = 1426791709;
                                                } else {
                                                    iM55680 = C0873.m55680("۟ܰ") ^ i12;
                                                    i2 = ((iM55680 ^ i13) * (-5663)) ^ 872808148;
                                                    i3 = 212201215;
                                                }
                                                i8 = iM55680 ^ i3;
                                                th3 = th;
                                                i11 = i;
                                                i15 = i8;
                                                i14 = i2;
                                                th4 = th2;
                                                i16 = i11;
                                                break;
                                            }
                                        }
                                    }
                                }
                                iM55682 = C0946.m55979("۟ۨ") ^ i12;
                                i6 = ((iM55682 ^ i13) * (-5407)) ^ 115534669;
                                i7 = -1324154186;
                                int i118 = iM55682 ^ i7;
                                th4 = th2;
                                i16 = i;
                                th3 = th;
                                i15 = i118;
                                i14 = i6;
                                c2651 = null;
                                break;
                            }
                            iM55682 = C0873.m55680("֫ۖ") ^ i13;
                            i6 = ((iM55682 ^ i12) * (-19125)) ^ 306216743;
                            i7 = 779089482;
                            int i119 = iM55682 ^ i7;
                            th4 = th2;
                            i16 = i;
                            th3 = th;
                            i15 = i119;
                            i14 = i6;
                            c2651 = null;
                            break;
                        }
                        iM55682 = C0873.m55680("ۘ۬") ^ i12;
                        i6 = ((iM55682 ^ i13) * 3397) ^ (-482912540);
                        i7 = -1607338074;
                        int i1110 = iM55682 ^ i7;
                        th4 = th2;
                        i16 = i;
                        th3 = th;
                        i15 = i1110;
                        i14 = i6;
                        c2651 = null;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0198 A[PHI: r10 r13 r14
      0x0198: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:49:0x0196, B:26:0x00a6, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:49:0x0196, B:26:0x00a6, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:49:0x0196, B:26:0x00a6, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01cd A[PHI: r9
      0x01cd: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:53:0x01cb, B:15:0x0075, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[PHI: r3 r4 r6 r7 r12
      0x0254: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:65:0x0252, B:61:0x0238, B:30:0x00c5, B:12:0x006d, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v5 int) binds: [B:65:0x0252, B:61:0x0238, B:30:0x00c5, B:12:0x006d, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:65:0x0252, B:61:0x0238, B:30:0x00c5, B:12:0x006d, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:65:0x0252, B:61:0x0238, B:30:0x00c5, B:12:0x006d, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x0252, B:61:0x0238, B:30:0x00c5, B:12:0x006d, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0284 A[PHI: r19
      0x0284: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:69:0x0282, B:34:0x00ec, B:17:0x0079, B:15:0x0075, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1036.f81953;
        int i4 = C0906.f81862;
        int iM55979 = (C0946.m55979("۬ᩴ") + i3) * (-61);
        int i5 = ((iM55979 ^ i4) * 30143) ^ (-1678808897);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1288593005;
        AbstractC17043 abstractC17043 = null;
        int iM559710 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1768168540;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-2135)) >> 31));
            switch (i13) {
                case -2140624226:
                case 206305310:
                    c = 0;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * 91;
                        i = ((iM55680 ^ i4) * 26411) ^ 262506667;
                        i2 = 268247629;
                    } else {
                        iM55680 = C0946.m55979("۟᩶") ^ i3;
                        i = ((iM55680 ^ i4) * (-2659)) ^ 692602004;
                        i2 = -71033867;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2132411794:
                case 1119561324:
                    i10 = 22033;
                    iM55680 = C0873.m55680("᩷ۨ") ^ i4;
                    i = ((iM55680 ^ i3) * (-1607)) ^ (-301401464);
                    i2 = 83454022;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2076783892:
                case -1943376220:
                    RunnableC0938.m55938();
                    if (C0861.m55626()) {
                        iM55680 = C0946.m55979("ۜ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-17361)) ^ (-1135273155);
                        i2 = 91676485;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۖۘ")) * (-87);
                        i = ((iM55680 ^ i3) * (-1359)) ^ 313991496;
                        i2 = 1493341568;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2025625453:
                case -1277814301:
                    C1012.m56134();
                    iM55680 = C0946.m55979("ۜ֡") ^ i4;
                    i = ((iM55680 ^ i3) * (-17361)) ^ (-1135273155);
                    i2 = 91676485;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1877734624:
                case -232191558:
                    i9 = i8 + 1;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("۟ۗ") ^ i4) * 57;
                        i = ((iM55680 ^ i3) * 22725) ^ 1946557110;
                        i2 = 2141393800;
                    } else {
                        iM55680 = (C0873.m55680("ۤ۬") + i4) * 87;
                        i = ((iM55680 ^ i3) * 15717) ^ 1755976658;
                        i2 = 1213661734;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1541483354:
                case 1862214443:
                    AbstractC0942.m55966(abstractC17043);
                    break;
                case -1434537173:
                case 71411843:
                    C0845.m55584();
                    break;
                case -1410144964:
                case 1233765763:
                    boolean zM56001 = C0947.m56001(this.f19259);
                    abstractC17043 = this.f19260;
                    if (zM56001) {
                        iM55680 = C0946.m55979("᩺ۗ") ^ i3;
                        i = ((iM55680 ^ i4) * (-11261)) ^ 718801252;
                        i2 = -2011218269;
                    } else {
                        iM55680 = (C0873.m55680("ۨ᩻") + i3) * 63;
                        i = ((iM55680 ^ i4) * 21997) ^ 1194649222;
                        i2 = -539679522;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1330892565:
                case -841970548:
                    i10 = 53297;
                    iM55680 = C0873.m55680("᩷ۨ") ^ i4;
                    i = ((iM55680 ^ i3) * (-1607)) ^ (-301401464);
                    i2 = 83454022;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1217912710:
                case 594384897:
                    sArr = f81992;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ۜ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-17361)) ^ (-1135273155);
                        i2 = 91676485;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩺") ^ i4;
                        i = ((iM55680 ^ i3) * 21043) ^ (-1383171940);
                        i2 = 794879487;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1035564169:
                case 234141574:
                    Main.m90(this.f19258.m26079(), abstractC17043);
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("ۜ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-17361)) ^ (-1135273155);
                        i2 = 91676485;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۨۢ")) * (-45);
                        i = ((iM55680 ^ i4) * (-22289)) ^ (-1258235429);
                        i2 = 958482330;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -925721634:
                case 315610322:
                    int i14 = s + s2;
                    if ((i14 * i14) - i9 >= 0) {
                        iM55680 = C0873.m55680("᩵ᩴ") ^ i4;
                        i = ((iM55680 ^ i3) * (-31265)) ^ 60698456;
                        i2 = 531089503;
                    } else {
                        iM55680 = (C0946.m55979("ۢ۟") ^ i3) * (-23);
                        i = ((iM55680 ^ i4) * 30975) ^ (-1776441665);
                        i2 = -1050575866;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -615845233:
                case 1844646569:
                    i8 = s * 2;
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0873.m55680("֡֫") + i3) * (-9);
                        i = ((iM55680 ^ i4) * (-9)) ^ 826691398;
                        i2 = 1842822509;
                    } else {
                        iM55680 = (C0873.m55680("᩺᩺") ^ i4) * 49;
                        i = ((iM55680 ^ i3) * (-21697)) ^ 1344059528;
                        i2 = 291419739;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -581502255:
                case 988007325:
                    C1071.m56343();
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("۟ۗ") ^ i4) * 57;
                        i = ((iM55680 ^ i3) * 22725) ^ 1946557110;
                        i2 = 2141393800;
                    } else {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * 91;
                        i = ((iM55680 ^ i4) * 26411) ^ 262506667;
                        i2 = 268247629;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -550781593:
                case 485496513:
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0946.m55979("ۜ֡") ^ i4;
                        i = ((iM55680 ^ i3) * (-17361)) ^ (-1135273155);
                        i2 = 91676485;
                    } else {
                        iM55680 = (C0946.m55979("۟ۗ") ^ i4) * 57;
                        i = ((iM55680 ^ i3) * 22725) ^ 1946557110;
                        i2 = 2141393800;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -434251994:
                case 826105264:
                    i11 = 1;
                    i12 = 3;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۖۘ")) * (-87);
                        i = ((iM55680 ^ i3) * (-1359)) ^ 313991496;
                        i2 = 1493341568;
                    } else {
                        iM55680 = (C0873.m55680("᩷ۚ") ^ i3) * (-33);
                        i = ((iM55680 ^ i4) * (-20351)) ^ 590562558;
                        i2 = 2136304354;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -373695754:
                case 1394106843:
                    sArr2 = f81992;
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * 91;
                        i = ((iM55680 ^ i4) * 26411) ^ 262506667;
                        i2 = 268247629;
                    } else {
                        iM55680 = (C0873.m55680("֫ᩳ") ^ i4) * (-109);
                        i = ((iM55680 ^ i3) * (-25711)) ^ 407065594;
                        i2 = 1214148361;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 43743942:
                case 489149079:
                    s = sArr[c];
                    if (AbstractC0942.m55971()) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * 91;
                        i = ((iM55680 ^ i4) * 26411) ^ 262506667;
                        i2 = 268247629;
                    } else {
                        iM55680 = C0873.m55680("۠ۨ") ^ i3;
                        i = ((iM55680 ^ i4) * (-8013)) ^ (-213489180);
                        i2 = 1034487954;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 873978099:
                case 1230093537:
                    s2 = 1;
                    if (C0890.f81849 != 0) {
                        iM55680 = (i4 - C0873.m55680("ۖۘ")) * (-87);
                        i = ((iM55680 ^ i3) * (-1359)) ^ 313991496;
                        i2 = 1493341568;
                    } else {
                        iM55680 = (C0946.m55979("۠ۗ") + i3) * (-35);
                        i = ((iM55680 ^ i4) * (-31951)) ^ (-20912437);
                        i2 = -1509874814;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1149063119:
                case 1342544967:
                    C0882.m55716(iM559710 ^ i7);
                    break;
                default:
                    iM559710 = C0946.m55979(C1046.m56293(sArr2, i11, i12, i10));
                    i7 = 2128603799;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("۫ۚ") + i3) * 91;
                        i = ((iM55680 ^ i4) * 26411) ^ 262506667;
                        i2 = 268247629;
                    } else {
                        iM55680 = C0873.m55680("ᩳۜ") ^ i4;
                        i = ((iM55680 ^ i3) * 9563) ^ (-233657531);
                        i2 = -344538323;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f19259.m53442();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        Main main = null;
        Object obj = null;
        int i = 870008766;
        int i2 = C1036.f81953;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55979 = (i2 - C0946.m55979("ܺۛ")) * 123;
        int i4 = ((iM55979 ^ i3) * (-20175)) ^ (-1438618066);
        int i5 = -1681616468;
        while (true) {
            i = ((((i ^ i3) * (-22389)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1852176409:
                case -1285622415:
                    if (C1124.f82007 < 0) {
                        iM55979 = C0873.m55680("᩷ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7641) ^ 1508394945;
                        i5 = -854836404;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩸") + i3) * 87;
                        i4 = ((iM55979 ^ i2) * 17983) ^ (-387669383);
                        i5 = -264733266;
                    }
                    break;
                case -1529905692:
                case 818516618:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("ۘ᩸") + i3) * 87;
                        i4 = ((iM55979 ^ i2) * 17983) ^ (-387669383);
                        i5 = -264733266;
                    } else {
                        iM55979 = C0873.m55680("۬۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-25869)) ^ 1391458007;
                        i5 = 860991419;
                    }
                    break;
                case -1454895151:
                case 333113167:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    } else {
                        iM55979 = (C0873.m55680("ۜۜ") + i2) * (-21);
                        i4 = ((iM55979 ^ i3) * (-8705)) ^ 941550712;
                        i5 = 1554803064;
                    }
                    break;
                case -838719173:
                case 1733864421:
                    C0882.m55710();
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ۤۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8955) ^ (-1452294345);
                        i5 = 1604967543;
                    } else {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    }
                    break;
                case -765552547:
                case 1546358321:
                    C1012.m56134();
                    RunnableC0871.m55672();
                    iM55979 = (C0946.m55979("ۘ᩸") + i3) * 87;
                    i4 = ((iM55979 ^ i2) * 17983) ^ (-387669383);
                    i5 = -264733266;
                    break;
                case -542734401:
                case 505931083:
                    if (C0927.m55873() <= 0) {
                        iM55979 = C0873.m55680("᩷ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5777)) ^ (-1814549103);
                        i5 = 685913194;
                    } else {
                        iM55979 = (C0946.m55979("ۧۨ") + i2) * 79;
                        i4 = ((iM55979 ^ i3) * 1169) ^ (-1009814620);
                        i5 = 1401294501;
                    }
                    break;
                case 107511044:
                case 570205030:
                    obj = null;
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("᩷ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5777)) ^ (-1814549103);
                        i5 = 685913194;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۬") ^ i2) * 63;
                        i4 = ((iM55979 ^ i3) * 24413) ^ (-958377097);
                        i5 = 2081216033;
                    }
                    break;
                case 423880934:
                case 1476545746:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0946.m55979("ۤۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8955) ^ (-1452294345);
                        i5 = 1604967543;
                    } else {
                        iM55979 = (C0873.m55680("᩹֨") + i3) * (-127);
                        i4 = ((iM55979 ^ i2) * (-31345)) ^ (-2114110440);
                        i5 = -877908517;
                    }
                    break;
                case 728924046:
                case 1417344650:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("᩷ܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7641) ^ 1508394945;
                        i5 = -854836404;
                    } else {
                        iM55979 = C0873.m55680("᩻᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 25883) ^ 1508090188;
                        i5 = -1327811996;
                    }
                    break;
                case 736896704:
                case 833448093:
                    if (C1017.f81942 < 0) {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    } else {
                        iM55979 = (C0946.m55979("ۘ᩸") + i3) * 87;
                        i4 = ((iM55979 ^ i2) * 17983) ^ (-387669383);
                        i5 = -264733266;
                    }
                    break;
                case 816943484:
                case 2024668382:
                    C0946.m55980();
                    break;
                case 850781971:
                case 1690888887:
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0873.m55680("᩷ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5777)) ^ (-1814549103);
                        i5 = 685913194;
                    } else {
                        iM55979 = C0946.m55979("۟֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) ^ 1563462261;
                        i5 = -1298593229;
                    }
                    break;
                case 1388358834:
                case 1970326608:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    } else {
                        iM55979 = C0946.m55979("ܳۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-21703)) ^ (-914157455);
                        i5 = -6280965;
                    }
                    break;
                case 1407694783:
                case 1972166030:
                    if (C1025.f81947 >= 0) {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    } else {
                        iM55979 = C0873.m55680("᩶ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13267) ^ 1115754478;
                        i5 = -2009324308;
                    }
                    break;
                case 1546618953:
                case 1691597037:
                    main = this.f19261;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("᩵۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * 30109) ^ (-1819192961);
                        i5 = -1161063634;
                    } else {
                        iM55979 = (C0873.m55680("ۚ۠") + i3) * (-43);
                        i4 = ((iM55979 ^ i2) * (-21179)) ^ 1153756485;
                        i5 = 878480490;
                    }
                    break;
                default:
                    C1044.m56272(main, exc, obj);
                    RunnableC1014.m56173(this.f19260);
                    break;
            }
            return;
        }
    }
}
