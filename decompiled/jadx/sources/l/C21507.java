package l;

import android.content.res.Resources;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Field;

/* JADX INFO: renamed from: l.᩸ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 440G */
/* JADX INFO: loaded from: classes4.dex */
public final class C21507 {

    /* JADX INFO: renamed from: ᩳ֡ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f69167 = {7075, -2418, -2368, -2350, -2350, -2364, -2347, -2350, -2418, -2366, -2354, -2356, -2351, -2360, -2355, -2364, -2306, -2363, -2364, -2343, 9485, 27801, 27760, 20547, 9775, -10158, -10167, -10173, 8816, 259, -11485, 15383, 1925, -8892, 9286, -13154, 11663, 12316, 942, 10370, 3849, 8103, 20305, 31899, -25812, 19945, -31564, -26191, 29099, -26349, 27635, 31215, 18477, -26770, -25285, 25624, -32628, 26043, 27844, -26385, 28611, 24798, 17904, 18068, 27456, 17689, 31203, -31685, 32645, 3310, 11151, 11226, 11229, 11226, 11207, 11149};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f69168;

    /* JADX WARN: Code duplicated, block: B:76:0x026d A[PHI: r6 r7 r19 r26
      0x026d: PHI (r6v3 java.util.Locale) = (r6v2 java.util.Locale), (r6v2 java.util.Locale), (r6v4 java.util.Locale) binds: [B:73:0x024c, B:61:0x01e6, B:52:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v4 java.lang.String) binds: [B:73:0x024c, B:61:0x01e6, B:52:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v2 java.lang.String), (r19v2 java.lang.String) binds: [B:73:0x024c, B:61:0x01e6, B:52:0x0170] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r26v46 java.lang.String) = (r26v41 java.lang.String), (r26v42 java.lang.String), (r26v49 java.lang.String) binds: [B:73:0x024c, B:61:0x01e6, B:52:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (l.C1773.f6144 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        r26 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (l.RunnableC1937.f6483 < 0) goto L25;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m48671(C8353 c8353) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int iM2567;
        int i4;
        int i5;
        C8353 c8354 = c8353;
        int i6 = C4616.f14690;
        int i7 = C3245.f10203;
        int iM6982 = (C2105.m6981("ᩳ᩶") ^ i7) * (-29);
        int i8 = ((iM6982 ^ i6) * (-31775)) ^ 1532533576;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM6982 ^ 803094883;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        char c = 0;
        short s3 = 0;
        int i16 = -2115456144;
        int i17 = 0;
        String str2 = null;
        String displayName = null;
        String str3 = null;
        Locale localeM11022 = null;
        String str4 = null;
        String strM947 = null;
        int i18 = 0;
        while (true) {
            i16 = i9 ^ (i8 & (((i16 ^ i6) * 20779) >> 31));
            switch (i16) {
                case -1979175942:
                case -1904230111:
                    Locale localeForLanguageTag = Locale.forLanguageTag(str4);
                    localeM11022 = C3603.m11022();
                    displayName = localeForLanguageTag.getDisplayName(localeM11022);
                    if (!C4263.m12824(displayName)) {
                        iM2566 = (i6 - C2105.m6981("ۜ᩺")) * (-19);
                        i = ((iM2566 ^ i7) * 30109) ^ (-1919869594);
                        i2 = -2001384610;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        str3 = str3;
                        strM947 = str2;
                        iM2567 = (i6 - C0630.m2566("ۜܿ")) * 31;
                        i4 = ((iM2567 ^ i7) * (-6369)) ^ (-52616251);
                        i5 = -1589659759;
                        String str5 = str3;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                        str3 = str5;
                    }
                    break;
                case -1899606943:
                case 647924916:
                    break;
                case -1829600030:
                case -1018664361:
                    str3 = str3;
                    s = sArr[c];
                    s3 = 1;
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("᩹᩺") ^ i7;
                        i8 = ((iM6981 ^ i6) * 17791) ^ (-2038375410);
                        i3 = 93706082;
                    } else {
                        iM6981 = (C2105.m6981("ܺۡ") ^ i6) * 29;
                        i8 = ((iM6981 ^ i7) * (-4057)) ^ (-33718625);
                        i3 = -299076675;
                    }
                    int i19 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i19;
                    c8354 = c8353;
                    break;
                case -1643296510:
                case 1398796105:
                    str3 = str3;
                    i13 = 3;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2567 = C2105.m6981("ۗܺ") ^ i7;
                        i4 = ((iM2567 ^ i6) * (-30891)) ^ 354210123;
                        i5 = 529428768;
                        String str6 = str3;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                        str3 = str6;
                    } else {
                        iM6981 = (C2105.m6981("ܺ֫") ^ i6) * (-63);
                        i8 = ((iM6981 ^ i7) * 27847) ^ 2102992111;
                        i3 = -1750002602;
                        int i110 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i110;
                        c8354 = c8353;
                    }
                    break;
                case -1630650553:
                case 1039659531:
                    str3 = str3;
                    if (C1294.m4369(ViewOnClickListenerC1958.m6435(sArr2, i12, i13, i18), str4)) {
                        strM947 = str2;
                        iM2567 = (i6 - C0630.m2566("ۜܿ")) * 31;
                        i4 = ((iM2567 ^ i7) * (-6369)) ^ (-52616251);
                        i5 = -1589659759;
                    } else {
                        iM2567 = C0630.m2566("ۤ۬") ^ i7;
                        i4 = ((iM2567 ^ i6) * (-2383)) ^ (-1230177541);
                        i5 = -1408875071;
                    }
                    String str7 = str3;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    str3 = str7;
                    break;
                case -1579897566:
                case 295366482:
                    String strM48669 = m48669(strM947, m48672(c8353));
                    if (C4263.m12824(strM48669)) {
                        iM2567 = (C0630.m2566("ᩳ᩵") ^ i6) * (-125);
                        str3 = str3;
                        i4 = ((iM2567 ^ i7) * 16415) ^ (-1587960789);
                        i5 = 1326977196;
                    } else {
                        str = strM48669;
                        iM2567 = (C2105.m6981("ܰۗ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2567 ^ i6) * 29779) ^ (-282449453);
                        i5 = 575541983;
                    }
                    String str8 = str3;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    str3 = str8;
                    break;
                case -1466597980:
                case 1969613128:
                    i10 = 1;
                    i11 = 0;
                    iM2566 = C0630.m2566("᩶ܳ") ^ i7;
                    i = ((iM2566 ^ i6) * 785) ^ (-951080126);
                    i2 = 2030892583;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1425102643:
                case 1980064652:
                    if (C3911.m11924() > 0) {
                        str3 = str3;
                        iM6981 = (i7 - C2105.m6981("᩻ᩳ")) * (-105);
                        i8 = ((iM6981 ^ i6) * 3759) ^ (-750275712);
                        i3 = 963483517;
                        int i111 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i111;
                        c8354 = c8353;
                    } else {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * 26301) ^ (-1447975586);
                        i2 = 1210147405;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1226177954:
                case -1120070760:
                    i18 = 55335;
                    iM6981 = C0630.m2566("ۚۨ") ^ i6;
                    i8 = ((iM6981 ^ i7) * (-22835)) ^ (-1416478104);
                    i3 = 541477167;
                    int i112 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i112;
                    c8354 = c8353;
                    break;
                case -995815544:
                case 362897588:
                    str3 = str3;
                    sArr = f69167;
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("۬ۘ") ^ i7) * (-91);
                        i8 = ((iM6981 ^ i6) * (-6119)) ^ (-719419517);
                        i3 = 2001968477;
                    } else {
                        iM6981 = C2105.m6981("᩸᩸") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-24727)) ^ 1949750316;
                        i3 = 918514812;
                    }
                    int i113 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i113;
                    c8354 = c8353;
                    break;
                case -912381239:
                case -718224258:
                    break;
                case -674407449:
                case 117263521:
                    str4 = c8354.f25603;
                    str3 = c8354.f25635;
                    if (C1005.f3721) {
                        int iM6983 = (C2105.m6981("۠ܳ") + i6) * (-43);
                        i8 = ((iM6983 ^ i7) * 7473) ^ (-527583510);
                        i9 = iM6983 ^ 1849471405;
                    } else {
                        int iM6984 = C2105.m6981("֡۫") ^ i6;
                        i9 = iM6984 ^ 1354631206;
                        i8 = ((iM6984 ^ i7) * 13817) ^ 143674099;
                    }
                    c8354 = c8353;
                    break;
                case -530756761:
                case -118090329:
                    if (C4263.m12819() < 0) {
                        str3 = str3;
                        iM6981 = C2105.m6981("۟ܿ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 29235) ^ (-920673207);
                        i3 = -982591381;
                        int i114 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i114;
                        c8354 = c8353;
                    }
                    int iM6985 = C2105.m6981("֡۫") ^ i6;
                    i9 = iM6985 ^ 1354631206;
                    i8 = ((iM6985 ^ i7) * 13817) ^ 143674099;
                    c8354 = c8353;
                    break;
                case -453255411:
                case 98291421:
                    if (C1773.f6144 > 0) {
                        iM2566 = C0630.m2566("ܳ᩵") ^ i7;
                        i = ((iM2566 ^ i6) * (-14717)) ^ 1144549055;
                        i2 = 333687316;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        str3 = str3;
                        iM6981 = (C0630.m2566("۬ۘ") ^ i7) * (-91);
                        i8 = ((iM6981 ^ i6) * (-6119)) ^ (-719419517);
                        i3 = 2001968477;
                        int i115 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i115;
                        c8354 = c8353;
                    }
                    break;
                case -421485872:
                case 348486420:
                    str3 = str3;
                    c = 24;
                    if (C3746.m11369() >= 0) {
                        iM6981 = C2105.m6981("۟ܿ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 29235) ^ (-920673207);
                        i3 = -982591381;
                    } else {
                        iM6981 = (C0630.m2566("᩺ᩳ") ^ i7) * (-105);
                        i8 = ((iM6981 ^ i6) * (-15817)) ^ 1632483380;
                        i3 = 1226763045;
                    }
                    int i116 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i116;
                    c8354 = c8353;
                    break;
                case -417899453:
                case 1362859058:
                    break;
                case -261493252:
                case 1585948402:
                    str3 = str3;
                    i15 = s * s2;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i7 - C2105.m6981("᩻ᩳ")) * (-105);
                        i8 = ((iM6981 ^ i6) * 3759) ^ (-750275712);
                        i3 = 963483517;
                    } else {
                        iM6981 = (i6 - C2105.m6981("᩵۠")) * 95;
                        i8 = ((iM6981 ^ i7) * 20451) ^ (-1459800637);
                        i3 = -1596268188;
                    }
                    int i117 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i117;
                    c8354 = c8353;
                    break;
                case -27385521:
                case 1081713893:
                    str3 = str3;
                    if ((i15 + 1) - i14 > 0) {
                        iM6981 = (C2105.m6981("۠ܰ") ^ i7) * (-59);
                        i8 = ((iM6981 ^ i6) * 8295) ^ 1094887467;
                        i3 = 1079151393;
                    } else {
                        iM6981 = C2105.m6981("ᩴܶ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 11443) ^ (-1412754600);
                        i3 = -1622708046;
                    }
                    int i118 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i118;
                    c8354 = c8353;
                    break;
                case 170796117:
                case 1534498098:
                    try {
                        int iOffsetByCodePoints = displayName.offsetByCodePoints(i11, i10);
                        StringBuilder sb = new StringBuilder();
                        C1420.m4905(sb, C11340.m28015(displayName, i11, iOffsetByCodePoints).toUpperCase(localeM11022));
                        C3245.m9923(sb, C3432.m10478(displayName, iOffsetByCodePoints));
                        strM947 = C0050.m947(sb);
                        str3 = str3;
                    } catch (IndexOutOfBoundsException unused) {
                        str3 = str3;
                        strM947 = displayName;
                    }
                    iM2567 = (i6 - C0630.m2566("ۜܿ")) * 31;
                    i4 = ((iM2567 ^ i7) * (-6369)) ^ (-52616251);
                    i5 = -1589659759;
                    String str9 = str3;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    str3 = str9;
                    break;
                case 275784290:
                case 1319137663:
                    str3 = str3;
                    str2 = "";
                    if (C4263.m12824(str4)) {
                        strM947 = str2;
                        iM2567 = (i6 - C0630.m2566("ۜܿ")) * 31;
                        i4 = ((iM2567 ^ i7) * (-6369)) ^ (-52616251);
                        i5 = -1589659759;
                    } else {
                        iM2567 = C0630.m2566("ۤ۠") ^ i7;
                        i4 = ((iM2567 ^ i6) * 4413) ^ 2040413043;
                        i5 = 2075961685;
                    }
                    String str10 = str3;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    str3 = str10;
                    break;
                case 288846472:
                case 727906255:
                    C4263.m12819();
                    C3683.m11222();
                    str3 = str3;
                    iM6981 = C2105.m6981("᩹᩺") ^ i7;
                    i8 = ((iM6981 ^ i6) * 17791) ^ (-2038375410);
                    i3 = 93706082;
                    int i119 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i119;
                    c8354 = c8353;
                    break;
                case 307329803:
                case 938852770:
                    str3 = str3;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩶ۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-7535)) ^ 1440638003;
                        i3 = 2517338;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۡۡ")) * (-85);
                        i8 = ((iM6981 ^ i7) * 18369) ^ 1444805044;
                        i3 = 910770260;
                    }
                    int i1110 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i1110;
                    c8354 = c8353;
                    break;
                case 416055802:
                case 1303120953:
                    i18 = 19670;
                    iM6981 = C0630.m2566("ۚۨ") ^ i6;
                    i8 = ((iM6981 ^ i7) * (-22835)) ^ (-1416478104);
                    i3 = 541477167;
                    int i1111 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i1111;
                    c8354 = c8353;
                    break;
                case 621933945:
                case 1453513807:
                    str3 = str3;
                    i14 = i17 * i17;
                    s2 = 2;
                    if (C4117.f13076 <= 0) {
                        iM6981 = (i6 - C0630.m2566("ܿܿ")) * (-45);
                        i8 = ((iM6981 ^ i7) * 16753) ^ (-308263153);
                        i3 = 440429935;
                    } else {
                        iM6981 = (C2105.m6981("ܿᩳ") ^ i7) * 87;
                        i8 = ((iM6981 ^ i6) * 19521) ^ 796865002;
                        i3 = -372168234;
                    }
                    int i1112 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i1112;
                    c8354 = c8353;
                    break;
                case 670023723:
                case 907803602:
                    C2126.m7040();
                    C1504.m5179();
                    return null;
                case 705474230:
                case 1506094401:
                    str3 = str3;
                    sArr2 = f69167;
                    i12 = 25;
                    if (C1420.f5096 > 0) {
                        iM2567 = C0630.m2566("ܳۨ") ^ i6;
                        i4 = ((iM2567 ^ i7) * 3267) ^ 1909075388;
                        i5 = 1977931676;
                        String str11 = str3;
                        i9 = iM2567 ^ i5;
                        i8 = i4;
                        str3 = str11;
                    } else {
                        iM6981 = C2105.m6981("᩹᩺") ^ i7;
                        i8 = ((iM6981 ^ i6) * 17791) ^ (-2038375410);
                        i3 = 93706082;
                        int i1113 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i1113;
                        c8354 = c8353;
                    }
                    break;
                case 723311487:
                case 832179166:
                    C5695.m16023();
                    if (C1128.m3851() <= 0) {
                        iM2566 = C0630.m2566("ۢۤ") ^ i6;
                        i = ((iM2566 ^ i7) * 26301) ^ (-1447975586);
                        i2 = 1210147405;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        str3 = str3;
                        iM6981 = C2105.m6981("᩹᩺") ^ i7;
                        i8 = ((iM6981 ^ i6) * 17791) ^ (-2038375410);
                        i3 = 93706082;
                        int i1114 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i1114;
                        c8354 = c8353;
                    }
                    break;
                case 882745171:
                case 1855611087:
                    C1294.m4372();
                    if (C11340.f33930 < 0) {
                        str3 = str3;
                        iM6981 = C2105.m6981("᩶ۤ") ^ i6;
                        i8 = ((iM6981 ^ i7) * (-7535)) ^ 1440638003;
                        i3 = 2517338;
                        int i1115 = iM6981 ^ i3;
                        str3 = str3;
                        i9 = i1115;
                        c8354 = c8353;
                    }
                    str3 = str3;
                    iM6981 = C2105.m6981("᩹᩺") ^ i7;
                    i8 = ((iM6981 ^ i6) * 17791) ^ (-2038375410);
                    i3 = 93706082;
                    int i1116 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i1116;
                    c8354 = c8353;
                    break;
                case 1252804442:
                case 1604650454:
                    return str;
                case 1492742218:
                case 1915915603:
                    str = C0964.m3403(str3) ? str2 : str3;
                    iM2567 = (C2105.m6981("ܰۗ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM2567 ^ i6) * 29779) ^ (-282449453);
                    i5 = 575541983;
                    String str12 = str3;
                    i9 = iM2567 ^ i5;
                    i8 = i4;
                    str3 = str12;
                    break;
                default:
                    str3 = str3;
                    i17 = s + s3;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ܺ֫") ^ i6) * (-63);
                        i8 = ((iM6981 ^ i7) * 27847) ^ 2102992111;
                        i3 = -1750002602;
                    } else {
                        iM6981 = C0630.m2566("ܺ۫") ^ i6;
                        i8 = ((iM6981 ^ i7) * 13437) ^ (-1110952381);
                        i3 = 61525320;
                    }
                    int i1117 = iM6981 ^ i3;
                    str3 = str3;
                    i9 = i1117;
                    c8354 = c8353;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48674(InterfaceC8566 interfaceC8566) {
        Object obj = null;
        int i = 1035299593;
        int i2 = RunnableC1937.f6483;
        int i3 = C2520.f8000;
        int iM2566 = C0630.m2566("ۖᩴ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-9469)) ^ 1591197718;
        int i5 = 1484795798;
        while (true) {
            i = ((((i ^ i2) * 28921) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2105563273:
                case 1633332840:
                    obj = this.f69168;
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ᩳ᩺") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * 9753) ^ (-1818442952);
                        i5 = 581848705;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩻֨")) * (-125);
                        i4 = ((iM2566 ^ i2) * (-22887)) ^ (-1526275026);
                        i5 = 1121426085;
                    }
                    break;
                case -1946472016:
                case 791899572:
                    C2958.m9034();
                    break;
                case -1918098696:
                case 2130428235:
                    if (C1711.m5736() <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۢ᩵")) * (-69);
                        i4 = ((iM2566 ^ i2) * (-5347)) ^ 691723513;
                        i5 = -1165209607;
                    } else {
                        iM2566 = C0630.m2566("ۗۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25407) ^ (-599811092);
                        i5 = 741420409;
                    }
                    break;
                case -1865785488:
                case 2024589113:
                    C3746.m11368((HashMap) obj, C1504.m5165(interfaceC8566), interfaceC8566);
                    break;
                case -1483391040:
                case 1199690753:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("֨ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6123) ^ (-1430349166);
                        i5 = -1245450357;
                    } else {
                        iM2566 = C0630.m2566("ܽܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5555) ^ (-1395524831);
                        i5 = -1213890842;
                    }
                    break;
                case -932449536:
                case -696954053:
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("ᩳ᩺") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * 9753) ^ (-1818442952);
                        i5 = 581848705;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩻ܰ")) * 13;
                        i4 = ((iM2566 ^ i3) * (-18685)) ^ 84658007;
                        i5 = 1050960949;
                    }
                    break;
                case -752612964:
                case 1780843242:
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("֨ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6123) ^ (-1430349166);
                        i5 = -1245450357;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۟᩶")) * 95;
                        i4 = ((iM2566 ^ i3) * (-22421)) ^ (-1013658784);
                        i5 = -1365585515;
                    }
                    break;
                case -430249278:
                case 325802198:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("֨ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6123) ^ (-1430349166);
                        i5 = -1245450357;
                    } else {
                        iM2566 = C2105.m6981("ۘܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16577)) ^ (-1743733469);
                        i5 = -1093637639;
                    }
                    break;
                case 152451260:
                case 1456221220:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32193)) ^ (-826157527);
                        i5 = -400594177;
                    } else {
                        iM2566 = C2105.m6981("ۢۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16179)) ^ (-74713312);
                        i5 = 329032728;
                    }
                    break;
                case 223787407:
                case 577213901:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32193)) ^ (-826157527);
                        i5 = -400594177;
                    } else {
                        iM2566 = (C0630.m2566("ᩳܿ") ^ i3) * (-59);
                        i4 = ((iM2566 ^ i2) * SecP192K1Field.PInv33) ^ (-1005138041);
                        i5 = -1231145413;
                    }
                    break;
                case 376578436:
                case 510705237:
                    if (C1294.m4372() <= 0) {
                        iM2566 = C2105.m6981("ᩳᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-32193)) ^ (-826157527);
                        i5 = -400594177;
                    } else {
                        iM2566 = C2105.m6981("ۘܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16577)) ^ (-1743733469);
                        i5 = -1093637639;
                    }
                    break;
                case 468135451:
                case 1046974949:
                    C0483.m2121();
                    C3683.m11222();
                    iM2566 = C2105.m6981("ۘܿ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-16577)) ^ (-1743733469);
                    i5 = -1093637639;
                    break;
                case 1006083896:
                case 1646078264:
                    if (C1128.m3851() <= 0) {
                        iM2566 = (C2105.m6981("ᩳ᩺") + i2) * 53;
                        i4 = ((iM2566 ^ i3) * 9753) ^ (-1818442952);
                        i5 = 581848705;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ܽۗ")) * (-41);
                        i4 = ((iM2566 ^ i2) * (-14759)) ^ (-791591769);
                        i5 = 1958060525;
                    }
                    break;
                case 1707770172:
                case 2046819252:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۢ᩵")) * (-69);
                        i4 = ((iM2566 ^ i2) * (-5347)) ^ 691723513;
                        i5 = -1165209607;
                    } else {
                        iM2566 = C2105.m6981("ۘܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16577)) ^ (-1743733469);
                        i5 = -1093637639;
                    }
                    break;
                case 1725224291:
                case 1747328358:
                    if (C3245.m9925() != 0) {
                        iM2566 = (i3 - C0630.m2566("ۢ᩵")) * (-69);
                        i4 = ((iM2566 ^ i2) * (-5347)) ^ 691723513;
                        i5 = -1165209607;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܳۖ")) * 59;
                        i4 = ((iM2566 ^ i3) * 21475) ^ (-1427415077);
                        i5 = -44940603;
                    }
                    break;
                default:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("֨ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6123) ^ (-1430349166);
                        i5 = -1245450357;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 7265) ^ (-38462227);
                        i5 = -2030927446;
                    }
                    break;
            }
            return;
        }
    }

    public C21507() {
        HashMap map = null;
        Iterator itM7037 = null;
        boolean zM2123 = false;
        int i = 1464209606;
        int i2 = AbstractC2021.f6743;
        int i3 = C1128.f4106;
        short s = f69167[0];
        int i4 = (s * s) + 54081316;
        int i5 = s + 7354;
        int i6 = (i4 + i4) - (i5 * i5) < 0 ? 25141 : 63137;
        int iM6981 = (i2 - C2105.m6981("ۨ᩸")) * 5;
        int i7 = ((iM6981 ^ i3) * 25109) ^ 1758641337;
        int i8 = -948191116;
        while (true) {
            i = ((((i ^ i3) * 30427) >> 31) & i7) ^ (iM6981 ^ i8);
            switch (i) {
                case -2080652499:
                case -1744442625:
                    C2105.m6982();
                    C1128.m3851();
                    iM6981 = (C0630.m2566("ܶ᩺") + i2) * 39;
                    i7 = ((iM6981 ^ i3) * 30661) ^ (-609529916);
                    i8 = -703205553;
                    break;
                case -2015574056:
                case -705244910:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i3) * (-91);
                        i7 = ((iM6981 ^ i2) * (-22619)) ^ 228713925;
                        i8 = 1877925239;
                    } else {
                        iM6981 = (C2105.m6981("ܳ᩵") + i2) * 3;
                        i7 = ((iM6981 ^ i3) * 28189) ^ (-1704687105);
                        i8 = 445041786;
                    }
                    break;
                case -2006181689:
                case 63463019:
                    if (C0714.f2697 < 0) {
                        iM6981 = (i2 - C0630.m2566("ܽ᩺")) * 23;
                        i7 = ((iM6981 ^ i3) * 3319) ^ (-18809060);
                        i8 = -267301991;
                    } else {
                        iM6981 = C0630.m2566("ܿ֡") ^ i2;
                        i7 = ((iM6981 ^ i3) * (-12733)) ^ 1257496973;
                        i8 = -2031362010;
                    }
                    break;
                case -1815860801:
                case 2051841775:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C2105.m6981("۬ۧ") ^ i2) * (-121);
                        i7 = ((iM6981 ^ i3) * 29703) ^ (-781508224);
                        i8 = -503664239;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۧ") + i3) * 91;
                        i7 = ((iM6981 ^ i2) * (-27409)) ^ (-2113263682);
                        i8 = -1865042161;
                    }
                    break;
                case -1747553684:
                case -527165885:
                    RunnableC3474.m10630();
                    if (C0483.f2088 < 0) {
                        iM6981 = (i3 - C2105.m6981("֨۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM6981 ^ i2) * 2529) ^ (-578078118);
                        i8 = 745054249;
                    } else {
                        iM6981 = (C2105.m6981("᩶ۖ") + i3) * (-91);
                        i7 = ((iM6981 ^ i2) * (-22619)) ^ 228713925;
                        i8 = 1877925239;
                    }
                    break;
                case -1732152207:
                case 837056508:
                    this.f69168 = map;
                    iM6981 = C2105.m6981("ۚ۟") ^ i3;
                    i7 = ((iM6981 ^ i2) * (-13415)) ^ 563253703;
                    i8 = -865951565;
                    break;
                case -1645805340:
                case -1404611193:
                    if (C2105.f7037 != 0) {
                        iM6981 = C2105.m6981("ᩴ᩸") ^ i3;
                        i7 = ((iM6981 ^ i2) * (-8047)) ^ (-991344820);
                        i8 = -1372736194;
                    } else {
                        iM6981 = C0630.m2566("ܺܿ") ^ i3;
                        i7 = ((iM6981 ^ i2) * 25673) ^ 1042346887;
                        i8 = -1108548113;
                    }
                    break;
                case -1567901927:
                case -804451056:
                    if (C1128.f4106 > 0) {
                        iM6981 = (C0630.m2566("ܶ᩺") + i2) * 39;
                        i7 = ((iM6981 ^ i3) * 30661) ^ (-609529916);
                        i8 = -703205553;
                    } else {
                        iM6981 = (C0630.m2566("֡ܿ") + i3) * (-73);
                        i7 = ((iM6981 ^ i2) * (-23567)) ^ 1626197013;
                        i8 = 441052173;
                    }
                    break;
                case -1498743694:
                case -45088767:
                    AbstractC2021.m6574();
                    if (!C0798.f2919) {
                        iM6981 = (i2 - C0630.m2566("ܽ᩺")) * 23;
                        i7 = ((iM6981 ^ i3) * 3319) ^ (-18809060);
                        i8 = -267301991;
                    } else {
                        iM6981 = C2105.m6981("ۖۢ") ^ i2;
                        i7 = ((iM6981 ^ i3) * 26137) ^ 1503987751;
                        i8 = -292279103;
                    }
                    break;
                case -1397800238:
                case -794658858:
                    zM2123 = C0483.m2123(itM7037);
                    iM6981 = C2105.m6981("ܰ֡") ^ i2;
                    i7 = ((iM6981 ^ i3) * 29217) ^ (-629192240);
                    i8 = 1309192699;
                    break;
                case -1251474078:
                case 1977078811:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i3) * (-91);
                        i7 = ((iM6981 ^ i2) * (-22619)) ^ 228713925;
                        i8 = 1877925239;
                    } else {
                        iM6981 = C2105.m6981("ۖۧ") ^ i2;
                        i7 = ((iM6981 ^ i3) * (-32507)) ^ (-1983438392);
                        i8 = -780758390;
                    }
                    break;
                case -1203865202:
                case 1190963334:
                    if (C2958.f9394 < 0) {
                        iM6981 = (C2105.m6981("۫᩶") + i2) * 19;
                        i7 = ((iM6981 ^ i3) * 26067) ^ (-2095667863);
                        i8 = -110298554;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܽ᩺")) * 23;
                        i7 = ((iM6981 ^ i3) * 3319) ^ (-18809060);
                        i8 = -267301991;
                    }
                    break;
                case -1018137154:
                case 1602106223:
                    if (C4117.m12364() != 0) {
                        iM6981 = C2105.m6981("ۖۢ") ^ i2;
                        i7 = ((iM6981 ^ i3) * 26137) ^ 1503987751;
                        i8 = -292279103;
                    } else {
                        iM6981 = C0630.m2566("֫ۖ") ^ i3;
                        i7 = ((iM6981 ^ i2) * 28983) ^ (-1811780061);
                        i8 = -1788628569;
                    }
                    break;
                case -991527874:
                case 1460228263:
                    itM7037 = C2126.m7037((AbstractC18605) C0382.m1836(C0237.m1494(C8172.m21646(C0714.m2816(f69167, 1, 19, i6)))));
                    iM6981 = C0630.m2566("۠ۚ") ^ i3;
                    i7 = ((iM6981 ^ i2) * 23889) ^ (-587006715);
                    i8 = -668554268;
                    break;
                case -965779967:
                case 511989525:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i3) * (-91);
                        i7 = ((iM6981 ^ i2) * (-22619)) ^ 228713925;
                        i8 = 1877925239;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۧ᩻")) * 29;
                        i7 = ((iM6981 ^ i2) * (-12121)) ^ 1003602577;
                        i8 = -1135840185;
                    }
                    break;
                case -924452081:
                case -761087174:
                    if (C3663.f11553) {
                        iM6981 = (C2105.m6981("۫᩶") + i2) * 19;
                        i7 = ((iM6981 ^ i3) * 26067) ^ (-2095667863);
                        i8 = -110298554;
                    } else {
                        iM6981 = C0630.m2566("᩵᩸") ^ i2;
                        i7 = ((iM6981 ^ i3) * 22349) ^ 198515864;
                        i8 = -982652769;
                    }
                    break;
                case -914450241:
                case 768652628:
                    return;
                case -801011225:
                case 236675633:
                    C3663.m11168();
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (i2 - C0630.m2566("ܽ᩺")) * 23;
                        i7 = ((iM6981 ^ i3) * 3319) ^ (-18809060);
                        i8 = -267301991;
                    } else {
                        iM6981 = (C0630.m2566("ܶ᩺") + i2) * 39;
                        i7 = ((iM6981 ^ i3) * 30661) ^ (-609529916);
                        i8 = -703205553;
                    }
                    break;
                case -499901218:
                case -371903385:
                    C1047.m3599();
                    ServiceConnectionC3453.m10564();
                    throw new RuntimeException();
                case -327140459:
                case 1492423309:
                    if (RunnableC1108.m3790()) {
                        iM6981 = C2105.m6981("ᩴ᩸") ^ i3;
                        i7 = ((iM6981 ^ i2) * (-8047)) ^ (-991344820);
                        i8 = -1372736194;
                    } else {
                        iM6981 = C0630.m2566("۫᩷") ^ i2;
                        i7 = ((iM6981 ^ i3) * (-21869)) ^ 1650486736;
                        i8 = -2079800235;
                    }
                    break;
                case 317740195:
                case 413325833:
                    if (zM2123) {
                        iM6981 = (i3 - C2105.m6981("᩺۬")) * (-105);
                        i7 = ((iM6981 ^ i2) * (-29563)) ^ (-1429553766);
                        i8 = -1486935405;
                    } else {
                        iM6981 = C2105.m6981("ܶܺ") ^ i2;
                        i7 = ((iM6981 ^ i3) * 30923) ^ (-1777688946);
                        i8 = -1613434376;
                    }
                    break;
                case 611541097:
                case 1395662382:
                    try {
                        m48674((C7980) RunnableC1108.m3791(itM7037));
                        iM6981 = C0630.m2566("۠ۚ") ^ i3;
                        i7 = ((iM6981 ^ i2) * 23889) ^ (-587006715);
                        i8 = -668554268;
                    } catch (Exception unused) {
                        iM6981 = C2105.m6981("ܶܺ") ^ i2;
                        i7 = ((iM6981 ^ i3) * 30923) ^ (-1777688946);
                        i8 = -1613434376;
                    }
                    break;
                case 959254899:
                case 1257414049:
                    C2167.m7155();
                    if (C22628.f73083 > 0) {
                        iM6981 = (C2105.m6981("᩶ۖ") + i3) * (-91);
                        i7 = ((iM6981 ^ i2) * (-22619)) ^ 228713925;
                        i8 = 1877925239;
                    } else {
                        iM6981 = (C0630.m2566("ܶ᩺") + i2) * 39;
                        i7 = ((iM6981 ^ i3) * 30661) ^ (-609529916);
                        i8 = -703205553;
                    }
                    break;
                case 1251332291:
                case 1649136579:
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C0630.m2566("ܶ᩺") + i2) * 39;
                        i7 = ((iM6981 ^ i3) * 30661) ^ (-609529916);
                        i8 = -703205553;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۤۨ")) * 95;
                        i7 = ((iM6981 ^ i2) * 14139) ^ 485382429;
                        i8 = -1003670103;
                    }
                    break;
                case 1867816625:
                case 1982585547:
                    map = new HashMap();
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("ۤۙ") ^ i2;
                        i7 = ((iM6981 ^ i3) * (-27395)) ^ 336682903;
                        i8 = -1778768312;
                    } else {
                        iM6981 = (C2105.m6981("۫᩶") + i2) * 19;
                        i7 = ((iM6981 ^ i3) * 26067) ^ (-2095667863);
                        i8 = -110298554;
                    }
                    break;
                default:
                    if (!RunnableC3474.m10630()) {
                        iM6981 = (i3 - C2105.m6981("֨۠")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM6981 ^ i2) * 2529) ^ (-578078118);
                        i8 = 745054249;
                    } else {
                        iM6981 = C2105.m6981("ᩴ᩸") ^ i3;
                        i7 = ((iM6981 ^ i2) * (-8047)) ^ (-991344820);
                        i8 = -1372736194;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m48677(String str) {
        Object obj = null;
        int i = -1350481678;
        int i2 = C2520.f8000;
        int i3 = C1773.f6144;
        int iM2566 = (C0630.m2566("᩵ۘ") ^ i3) * (-5);
        int i4 = ((iM2566 ^ i2) * 4689) ^ 2090564893;
        int i5 = 347821525;
        while (true) {
            i = ((((i ^ i2) * 11441) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2105999244:
                case -184706664:
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۚۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-24215)) ^ 1324728810;
                        i5 = 690707433;
                    } else {
                        iM2566 = C2105.m6981("ܶۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3971) ^ 1633960716;
                        i5 = 1477390087;
                    }
                    break;
                case -1972405088:
                case -431427381:
                    C2958.m9034();
                    return false;
                case -1952862122:
                case -1141620790:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ܶۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3971) ^ 1633960716;
                        i5 = 1477390087;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۘ֨")) * (-9);
                        i4 = ((iM2566 ^ i2) * 25179) ^ (-2015135834);
                        i5 = 2004994492;
                    }
                    break;
                case -1691726300:
                case -869454505:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("ܶۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3971) ^ 1633960716;
                        i5 = 1477390087;
                    } else {
                        iM2566 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18409) ^ (-936215539);
                        i5 = 1844380235;
                    }
                    break;
                case -1315854704:
                case -1229247170:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("۠ܽ") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * (-6673)) ^ (-1045276209);
                        i5 = 819415009;
                    } else {
                        iM2566 = (C0630.m2566("ۛۧ") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * (-25031)) ^ (-758859915);
                        i5 = -1932837916;
                    }
                    break;
                case -1236017457:
                case 510638055:
                    C1420.m4913();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C0630.m2566("֫ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31213) ^ 1300499933;
                        i5 = -317182565;
                    } else {
                        iM2566 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18409) ^ (-936215539);
                        i5 = 1844380235;
                    }
                    break;
                case -1012532483:
                case 908162154:
                    C0714.m2805();
                    iM2566 = C2105.m6981("ᩳۧ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 18409) ^ (-936215539);
                    i5 = 1844380235;
                    break;
                case -743767753:
                case 1164914281:
                    if (!C0798.f2919) {
                        iM2566 = C0630.m2566("֫ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31213) ^ 1300499933;
                        i5 = -317182565;
                    } else {
                        iM2566 = C0630.m2566("ᩴ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27013)) ^ (-1744142187);
                        i5 = -1729236548;
                    }
                    break;
                case -560379988:
                case 49507554:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("֫ۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31213) ^ 1300499933;
                        i5 = -317182565;
                    } else {
                        iM2566 = (C2105.m6981("۫ۖ") + i3) * 97;
                        i4 = ((iM2566 ^ i2) * (-30039)) ^ 1324766810;
                        i5 = -1891890810;
                    }
                    break;
                case -193610032:
                case 643383673:
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18409) ^ (-936215539);
                        i5 = 1844380235;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21741)) ^ (-1429782581);
                        i5 = 165488287;
                    }
                    break;
                case 127328600:
                case 212730975:
                    if (C1005.m3501()) {
                        iM2566 = C0630.m2566("ۚ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16445) ^ (-2027622024);
                        i5 = -70386175;
                    } else {
                        iM2566 = C0630.m2566("ᩴ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27013)) ^ (-1744142187);
                        i5 = -1729236548;
                    }
                    break;
                case 714959759:
                case 2032294982:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18409) ^ (-936215539);
                        i5 = 1844380235;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܿܽ")) * 97;
                        i4 = ((iM2566 ^ i2) * (-25417)) ^ 806447354;
                        i5 = 64056870;
                    }
                    break;
                case 752811798:
                case 1779263738:
                    obj = this.f69168;
                    if (C1005.f3721) {
                        iM2566 = (i2 - C0630.m2566("᩸ۤ")) * (-89);
                        i4 = ((iM2566 ^ i3) * 22747) ^ (-728119507);
                        i5 = 1878326362;
                    } else {
                        iM2566 = (C0630.m2566("ۛۧ") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * (-25031)) ^ (-758859915);
                        i5 = -1932837916;
                    }
                    break;
                case 959053351:
                case 1901585088:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C0630.m2566("ۛۧ") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * (-25031)) ^ (-758859915);
                        i5 = -1932837916;
                    } else {
                        iM2566 = C2105.m6981("ۚܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31173) ^ (-1050948500);
                        i5 = 2144447783;
                    }
                    break;
                case 1149533247:
                case 1885990163:
                    if (C1005.f3721) {
                        iM2566 = (i3 - C2105.m6981("ܰ۬")) * (-85);
                        i4 = ((iM2566 ^ i2) * 8477) ^ (-2050876597);
                        i5 = 38313208;
                    } else {
                        iM2566 = (C0630.m2566("ۛۧ") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * (-25031)) ^ (-758859915);
                        i5 = -1932837916;
                    }
                    break;
                default:
                    return C1128.m3842((HashMap) obj, str);
            }
        }
    }

    public C21507(Resources resources) {
        int i = 339468304;
        int i2 = C0483.f2088;
        int i3 = AbstractC2021.f6743;
        int iM6981 = (C2105.m6981("ۚ᩺") ^ i2) * (-111);
        int i4 = ((iM6981 ^ i3) * (-15111)) ^ (-1777279870);
        int i5 = 1288908213;
        while (true) {
            i = ((((i ^ i3) * (-2789)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1679870270:
                case 1817512675:
                    this.f69168 = resources;
                    return;
                case -1349931503:
                case 1677329996:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C2105.m6981("ۘۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30119)) ^ 1018500900;
                        i5 = 811598411;
                    } else {
                        iM6981 = C0630.m2566("ۗܿ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11773)) ^ (-18490065);
                        i5 = -977331355;
                    }
                    break;
                case -1022719755:
                case 340843801:
                    C5695.m16023();
                    C5695.m16023();
                    throw new RuntimeException();
                case -970506093:
                case 1554107544:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("᩻ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13707)) ^ (-1403993876);
                        i5 = -1772827999;
                    } else {
                        iM6981 = C0630.m2566("ᩴܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12909) ^ 1811550824;
                        i5 = -454683347;
                    }
                    break;
                case -913675706:
                case 1037510821:
                    if (!C1711.f5919) {
                        iM6981 = C2105.m6981("ۘۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30119)) ^ 1018500900;
                        i5 = 811598411;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16991)) ^ 1119666924;
                        i5 = -1784616458;
                    }
                    break;
                case -864700916:
                case -147369339:
                    if (C2272.f7362) {
                        iM6981 = (C0630.m2566("᩵ۤ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-24003)) ^ (-1856905172);
                        i5 = -2045857373;
                    } else {
                        iM6981 = (C0630.m2566("ۖܿ") ^ i2) * (-91);
                        i4 = ((iM6981 ^ i3) * 28171) ^ (-333359102);
                        i5 = -541439003;
                    }
                    break;
                case -849178893:
                case 368958606:
                    if (C4075.m12263() <= 0) {
                        iM6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9257) ^ (-1360352927);
                        i5 = -487274348;
                    } else {
                        iM6981 = (C0630.m2566("ۤᩴ") + i3) * 79;
                        i4 = ((iM6981 ^ i2) * 8697) ^ 503376179;
                        i5 = 291893324;
                    }
                    break;
                case -531541938:
                case 1002862696:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("᩵ۤ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-24003)) ^ (-1856905172);
                        i5 = -2045857373;
                    } else {
                        iM6981 = (C0630.m2566("ܰۢ") ^ i2) * 9;
                        i4 = ((iM6981 ^ i3) * (-18689)) ^ 367523037;
                        i5 = -745623698;
                    }
                    break;
                case -210148644:
                case 1724536630:
                    C3537.m10746();
                    if (RunnableC3474.f10992 > 0) {
                        iM6981 = (C0630.m2566("᩵ۤ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-24003)) ^ (-1856905172);
                        i5 = -2045857373;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16991)) ^ 1119666924;
                        i5 = -1784616458;
                    }
                    break;
                case 198180439:
                case 817438156:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("᩻ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13707)) ^ (-1403993876);
                        i5 = -1772827999;
                    } else {
                        iM6981 = C2105.m6981("ۢ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16735)) ^ (-601559736);
                        i5 = -847944440;
                    }
                    break;
                case 224372937:
                case 528953184:
                    C0964.m3413();
                    iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-16991)) ^ 1119666924;
                    i5 = -1784616458;
                    break;
                case 319656654:
                case 1910938103:
                    if (C0714.m2805()) {
                        iM6981 = C2105.m6981("֨ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 2975) ^ (-1934129809);
                        i5 = -1681344674;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۤ") + i2) * (-51);
                        i4 = ((iM6981 ^ i3) * (-24003)) ^ (-1856905172);
                        i5 = -2045857373;
                    }
                    break;
                case 442651481:
                case 446469678:
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16991)) ^ 1119666924;
                        i5 = -1784616458;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܺ᩻")) * (-93);
                        i4 = ((iM6981 ^ i2) * 6949) ^ 640906482;
                        i5 = 1111727829;
                    }
                    break;
                case 912457012:
                case 1934751782:
                    RunnableC3474.m10618(resources);
                    if (C3245.m9925() != 0) {
                        iM6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9257) ^ (-1360352927);
                        i5 = -487274348;
                    } else {
                        iM6981 = C2105.m6981("᩹ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5309)) ^ (-430617763);
                        i5 = 352130316;
                    }
                    break;
                case 1053786368:
                case 1112842502:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("᩻ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13707)) ^ (-1403993876);
                        i5 = -1772827999;
                    } else {
                        iM6981 = (C0630.m2566("ۤۚ") + i2) * (-55);
                        i4 = ((iM6981 ^ i3) * 2785) ^ 1142139339;
                        i5 = -1018388979;
                    }
                    break;
                default:
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 9257) ^ (-1360352927);
                        i5 = -487274348;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16991)) ^ 1119666924;
                        i5 = -1784616458;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0399 A[PHI: r19
      0x0399: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]) binds: [B:99:0x0397, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x03c8 A[PHI: r5
      0x03c8: PHI (r5v5 l.ᩴ֫ۚ) = (r5v2 l.ᩴ֫ۚ), (r5v4 l.ᩴ֫ۚ), (r5v2 l.ᩴ֫ۚ) binds: [B:103:0x03c6, B:48:0x015d, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d A[PHI: r4
      0x019d: PHI (r4v4 java.util.Iterator) = (r4v3 java.util.Iterator), (r4v2 java.util.Iterator), (r4v2 java.util.Iterator) binds: [B:54:0x0194, B:37:0x00fc, B:34:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02e0 A[PHI: r12 r14
      0x02e0: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:83:0x02de, B:40:0x0119, B:25:0x009c, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x02e0: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:83:0x02de, B:40:0x0119, B:25:0x009c, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0315 A[PHI: r6 r11
      0x0315: PHI (r6v4 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v3 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:87:0x0313, B:44:0x0138, B:23:0x0098, B:19:0x0078, B:9:0x0058, B:141:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:87:0x0313, B:44:0x0138, B:23:0x0098, B:19:0x0078, B:9:0x0058, B:141:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0366 A[PHI: r8 r9 r10
      0x0366: PHI (r8v4 char) = (r8v3 char), (r8v2 char) binds: [B:95:0x0364, B:91:0x0348] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r9v3 short) = (r9v2 short), (r9v4 short) binds: [B:95:0x0364, B:91:0x0348] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:95:0x0364, B:91:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48675(String str) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4 = C4075.f12947;
        int i5 = ServiceConnectionC3453.f10921;
        int iM2567 = (C0630.m2566("ۙ᩻") ^ i4) * (-115);
        int i6 = ((iM2567 ^ i5) * (-31007)) ^ 1862590500;
        InterfaceC8566 interfaceC8566 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2567 ^ (-1700152750);
        HashMap map = null;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -1059766658;
        String strM5918 = null;
        InterfaceC18444 interfaceC18444 = null;
        Iterator itM20833 = null;
        int iMo2700 = 0;
        while (true) {
            i11 = i7 ^ (i6 & (((i11 ^ i5) * (-14493)) >> 31));
            switch (i11) {
                case -2124570762:
                case 50243387:
                    C4075.m12263();
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                    } else {
                        iM6981 = C2105.m6981("۫ۗ") ^ i4;
                        i = ((iM6981 ^ i5) * 19083) ^ 9798993;
                        i2 = 438777802;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -2114210679:
                case -1952371303:
                    return true;
                case -2054322869:
                case 1142396442:
                    if (C0714.m2813(interfaceC18444.mo3565())) {
                        iM6981 = (i5 - C2105.m6981("ᩴۜ")) * (-93);
                        i = ((iM6981 ^ i4) * (-21389)) ^ (-128793348);
                        i2 = 1140125058;
                    } else {
                        iM6981 = (C2105.m6981("ۡۡ") + i5) * (-39);
                        i = ((iM6981 ^ i4) * (-5477)) ^ (-1458939594);
                        i2 = 1476244530;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1916514478:
                case -1037458368:
                    return false;
                case -1905779377:
                case -698718810:
                    i10 = 49499;
                    iM6981 = C2105.m6981("۫᩵") ^ i4;
                    i = ((iM6981 ^ i5) * 23557) ^ 1081215810;
                    i2 = 1016532522;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1890915125:
                case -1753426039:
                    if (i9 - (s * s2) >= 0) {
                        iM6981 = C2105.m6981("ۖ۟") ^ i4;
                        i = ((iM6981 ^ i5) * 9303) ^ (-1707981042);
                        i2 = -330904882;
                    } else {
                        iM6981 = (i5 - C0630.m2566("᩻۬")) * 97;
                        i = ((iM6981 ^ i4) * 2711) ^ 1235407528;
                        i2 = 518008985;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1855877082:
                case 1679622623:
                    i10 = 11187;
                    iM6981 = C2105.m6981("۫᩵") ^ i4;
                    i = ((iM6981 ^ i5) * 23557) ^ 1081215810;
                    i2 = 1016532522;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1837302946:
                case -522835773:
                    C1047.m3599();
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("ۙۛ") ^ i5;
                        i = ((iM6981 ^ i4) * (-24857)) ^ 1115961839;
                        i2 = 644009997;
                    } else {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1786267535:
                case 889203260:
                    s = sArr[c];
                    i8 = s * s;
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C2105.m6981("ۡ۟") + i5) * 71;
                        i = ((iM6981 ^ i4) * (-15123)) ^ (-915424776);
                        i2 = -661167232;
                    } else {
                        iM6981 = C0630.m2566("ܶۘ") ^ i4;
                        i = ((iM6981 ^ i5) * (-22143)) ^ (-1404168109);
                        i2 = -1188306031;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1611255960:
                case 1857669137:
                    iMo2700 = interfaceC8566.mo2700();
                    if (!EnumC15657.PUBLIC.m36866(iMo2700)) {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    } else {
                        iM6981 = (C0630.m2566("ܰ۫") + i5) * (-35);
                        i = ((iM6981 ^ i4) * 5095) ^ 291225435;
                        i2 = 1635895987;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1571111619:
                case 35159077:
                    C4117.m12364();
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = (C0630.m2566("ܿ᩹") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2566 ^ i5) * (-29827)) ^ (-1973118193);
                        i3 = 1357860257;
                        i7 = iM2566 ^ i3;
                    } else {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1460874982:
                case -588626394:
                    if (!EnumC15657.PUBLIC.m36866(interfaceC18444.mo3567())) {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    } else {
                        iM6981 = C2105.m6981("۫ۢ") ^ i4;
                        i = ((iM6981 ^ i5) * 11193) ^ (-1536612521);
                        i2 = 161511430;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1445293866:
                case -591499868:
                    s2 = 11252;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C0630.m2566("ۙۛ") ^ i5;
                        i = ((iM6981 ^ i4) * (-24857)) ^ 1115961839;
                        i2 = 644009997;
                    } else {
                        iM6981 = C0630.m2566("᩶᩹") ^ i5;
                        i = ((iM6981 ^ i4) * (-31359)) ^ 1301630377;
                        i2 = 2072538170;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1428188396:
                case 2084421013:
                    c = 'E';
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("ۡ۟") + i5) * 71;
                        i = ((iM6981 ^ i4) * (-15123)) ^ (-915424776);
                        i2 = -661167232;
                    } else {
                        iM6981 = C0630.m2566("֫ۤ") ^ i5;
                        i = ((iM6981 ^ i4) * 19565) ^ (-1522394992);
                        i2 = 2037447576;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1414214308:
                case 895042304:
                    if (C1294.m4369(strM5918, C1916.m6311(sArr2, 70, 6, i10))) {
                        iM6981 = C2105.m6981("֡ܿ") ^ i4;
                        i = ((iM6981 ^ i5) * 8027) ^ 1720217475;
                        i2 = 232137005;
                    } else {
                        iM6981 = (C2105.m6981("ۡۡ") + i5) * (-39);
                        i = ((iM6981 ^ i4) * (-5477)) ^ (-1458939594);
                        i2 = 1476244530;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1369088913:
                case 2051602948:
                    interfaceC8566 = (InterfaceC8566) C0964.m3410(map, str);
                    if (interfaceC8566 != null) {
                        iM6981 = C0630.m2566("֫᩷") ^ i5;
                        i = ((iM6981 ^ i4) * 32291) ^ 1931522933;
                        i2 = -2108754099;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    }
                    break;
                case -1310349534:
                case 414875916:
                    if (!C1773.m5910(itM20833)) {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    } else {
                        iM6981 = (C2105.m6981("֫ܰ") ^ i4) * (-41);
                        i = ((iM6981 ^ i5) * (-22085)) ^ (-688778287);
                        i2 = 416157702;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1261637864:
                case 974846224:
                    map = (HashMap) this.f69168;
                    if (!RunnableC3474.m10630()) {
                        iM2566 = (C0630.m2566("ܿ᩹") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2566 ^ i5) * (-29827)) ^ (-1973118193);
                        i3 = 1357860257;
                        i7 = iM2566 ^ i3;
                    } else {
                        iM6981 = (i5 - C0630.m2566("ܽۚ")) * 17;
                        i = ((iM6981 ^ i4) * (-10373)) ^ (-1922064206);
                        i2 = -969995417;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1173493873:
                case 1053321969:
                    RunnableC3474.m10630();
                    C3746.m11369();
                    iM6981 = C0630.m2566("ۙۛ") ^ i5;
                    i = ((iM6981 ^ i4) * (-24857)) ^ 1115961839;
                    i2 = 644009997;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -964493105:
                case -456414552:
                    strM5918 = C1773.m5918(interfaceC18444);
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                    } else {
                        iM6981 = (C0630.m2566("ۢ֫") + i5) * (-95);
                        i = ((iM6981 ^ i4) * 14109) ^ (-1778972596);
                        i2 = -970195052;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -914269043:
                case 264167964:
                    sArr2 = f69167;
                    if (C1128.m3851() <= 0) {
                        iM6981 = C0630.m2566("ۙۛ") ^ i5;
                        i = ((iM6981 ^ i4) * (-24857)) ^ 1115961839;
                        i2 = 644009997;
                    } else {
                        iM6981 = C0630.m2566("֡ۖ") ^ i4;
                        i = ((iM6981 ^ i5) * (-24593)) ^ 790765679;
                        i2 = 602892753;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -896139681:
                case 1863009846:
                    C0798.m2998();
                    RunnableC3474.m10630();
                    return false;
                case -755552436:
                case 1696639558:
                    sArr = f69167;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("᩺ۚ") + i4) * 75;
                        i = ((iM6981 ^ i5) * (-27593)) ^ (-1706954733);
                        i2 = -1273870940;
                    } else {
                        iM6981 = C2105.m6981("֫ۢ") ^ i5;
                        i = ((iM6981 ^ i4) * (-3431)) ^ 1755290406;
                        i2 = -1865744782;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -662385230:
                case 829428779:
                    i9 = i8 + 31651876;
                    if (C1005.f3721) {
                        iM6981 = C0630.m2566("᩵ܺ") ^ i4;
                        i = ((iM6981 ^ i5) * 12009) ^ 1261271783;
                        i2 = 1424377625;
                    } else {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -329032923:
                case 832317245:
                    interfaceC18444 = (InterfaceC18444) C2272.m7513(itM20833);
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("᩶ۙ") + i5) * 37;
                        i = ((iM6981 ^ i4) * (-6905)) ^ (-1625426871);
                        i2 = 1112963354;
                    } else {
                        iM6981 = C2105.m6981("ۧ۬") ^ i5;
                        i = ((iM6981 ^ i4) * 23249) ^ (-1641176390);
                        i2 = 712255834;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -170522938:
                case 604364032:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("᩶ۙ") + i5) * 37;
                        i = ((iM6981 ^ i4) * (-6905)) ^ (-1625426871);
                        i2 = 1112963354;
                    } else {
                        iM6981 = (C2105.m6981("᩸᩶") ^ i4) * 63;
                        i = ((iM6981 ^ i5) * (-12645)) ^ 3518308;
                        i2 = 1598571798;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -126106708:
                case 873749606:
                    if (!EnumC15657.ABSTRACT.m36866(iMo2700)) {
                        iM6981 = (C0630.m2566("ۤۗ") + i4) * 83;
                        i = ((iM6981 ^ i5) * 19439) ^ 127670374;
                        i2 = -1323358390;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    }
                    break;
                case 877933687:
                case 1202911116:
                    C2958.m9034();
                    if (C3683.m11222()) {
                        iM6981 = (C2105.m6981("᩶ۙ") + i5) * 37;
                        i = ((iM6981 ^ i4) * (-6905)) ^ (-1625426871);
                        i2 = 1112963354;
                    } else {
                        iM6981 = C2105.m6981("۫ۗ") ^ i4;
                        i = ((iM6981 ^ i5) * 19083) ^ 9798993;
                        i2 = 438777802;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 1443675933:
                case 1849630891:
                    itM20833 = C7811.m20833(interfaceC8566.getMethods());
                    iM6981 = (C2105.m6981("ۡۡ") + i5) * (-39);
                    i = ((iM6981 ^ i4) * (-5477)) ^ (-1458939594);
                    i2 = 1476244530;
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case 1637187042:
                case 1731801896:
                    if (C3432.f10845 < 0) {
                        iM6981 = C0630.m2566("ܺ᩶") ^ i5;
                        i = ((iM6981 ^ i4) * (-30913)) ^ (-284364974);
                        i2 = -767597059;
                    } else {
                        iM6981 = (C2105.m6981("᩺ۚ") + i4) * 75;
                        i = ((iM6981 ^ i5) * (-27593)) ^ (-1706954733);
                        i2 = -1273870940;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                default:
                    if (!EnumC15657.INTERFACE.m36866(iMo2700)) {
                        iM6981 = (C0630.m2566("ᩴ᩷") + i4) * 7;
                        i = ((iM6981 ^ i5) * 10699) ^ 1367639033;
                        i2 = -325575328;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩹") ^ i4) * (-13);
                        i6 = ((iM2566 ^ i5) * (-26643)) ^ 1286091908;
                        i3 = -780390882;
                        i7 = iM2566 ^ i3;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0228 A[PHI: r39
      0x0228: PHI (r39v115 java.lang.String) = (r39v102 java.lang.String), (r39v103 java.lang.String), (r39v117 java.lang.String) binds: [B:39:0x0225, B:35:0x0208, B:10:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0311 A[PHI: r39
      0x0311: PHI (r39v89 java.lang.String) = (r39v87 java.lang.String), (r39v90 java.lang.String) binds: [B:57:0x02fa, B:53:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m48673(C8353 c8353) {
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int iM2566;
        int i6;
        String str2;
        String str3;
        int i7;
        int i8;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        String str4;
        short[] sArr;
        int i12;
        short[] sArr2;
        int i13;
        String str5;
        int i14;
        String str6;
        int i15;
        int i16;
        int i17;
        String str7;
        String str8;
        int i18;
        int i19;
        int i20;
        int i21;
        String str9;
        short[] sArr3;
        int i22;
        short[] sArr4;
        int i23;
        int i24;
        int i25;
        String str10;
        String str11;
        Object[] objArr2;
        int i26;
        Resources resources;
        int iM24807;
        int i27;
        int i28;
        int i29;
        int i30;
        int iM6982;
        int i31;
        int i32;
        int i33;
        int iM2567;
        int i34;
        int i35;
        String strM48672;
        int i36;
        int i37;
        int iM6983;
        int i38;
        int iM2568;
        int i39;
        String string;
        int iM2569;
        int i40;
        String string2;
        String string3;
        int iM6984;
        int i41;
        int i42;
        String str12;
        String str13;
        Object[] objArr3;
        int iM6985;
        int i43;
        int iM6986;
        int i44;
        String str14;
        int i45;
        int i46;
        int iM25610;
        int i47;
        int iM6987;
        int i48;
        int i49;
        String str15;
        int iM6988;
        int i50;
        String string4;
        C21507 c21507 = this;
        Resources resources2 = null;
        int i51 = 0;
        int i52 = 0;
        char c = 0;
        String strM48671 = null;
        Integer numM9931 = null;
        String str16 = null;
        String strM10488 = null;
        String strM12578 = null;
        String strM7036 = null;
        short[] sArr5 = null;
        char c2 = 0;
        short s = 0;
        int i53 = 0;
        int i54 = 704117894;
        int i55 = C0483.f2088;
        int i56 = C4117.f13076;
        int iM6989 = (C2105.m6981("ۡۡ") + i55) * q.h;
        int i57 = ((iM6989 ^ i56) * 19) ^ 665347745;
        int i58 = iM6989 ^ (-1384502955);
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        Object[] objArr4 = null;
        String str21 = null;
        String string5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        float f = 0.0f;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        String str22 = null;
        Object[] objArr5 = null;
        int i71 = 0;
        String str23 = null;
        String str24 = null;
        while (true) {
            i54 = i58 ^ ((((i54 ^ i56) * 12451) >> 31) & i57);
            switch (i54) {
                case -2078076092:
                case 1363963937:
                    if (C4616.f14690 <= 0) {
                        str19 = str19;
                        i42 = i60;
                        str18 = str18;
                        i59 = i59;
                        i51 = i51;
                        i64 = i64;
                        i65 = i65;
                        i66 = i66;
                        str12 = str20;
                        str13 = str24;
                        objArr3 = objArr5;
                        int i72 = i67;
                        str21 = str21;
                        i67 = i72;
                        iM6985 = (i56 - C0630.m2566("ܺۤ")) * (-81);
                        i57 = ((iM6985 ^ i55) * 32067) ^ 2001828220;
                        i43 = -543712182;
                        i58 = iM6985 ^ i43;
                        objArr5 = objArr3;
                        str20 = str12;
                        str24 = str13;
                        i60 = i42;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str25 = str21;
                        i67 = i67;
                        str21 = str25;
                    }
                    str14 = str19;
                    i59 = i59;
                    i45 = i51;
                    int i73 = i67;
                    str21 = str21;
                    i67 = i73;
                    iM6987 = C0630.m2566("ᩴ֨") ^ i56;
                    i57 = ((iM6987 ^ i55) * 10969) ^ (-667978173);
                    i48 = -444947030;
                    i58 = iM6987 ^ i48;
                    i51 = i45;
                    str20 = str20;
                    str24 = str24;
                    str19 = str14;
                    i65 = i65;
                    i66 = i66;
                    i59 = i59;
                    str18 = str18;
                    String str26 = str21;
                    i67 = i67;
                    str21 = str26;
                    break;
                case -2064594986:
                case -1126683950:
                    str8 = str19;
                    i18 = i60;
                    str9 = str18;
                    sArr4 = sArr7;
                    i23 = i70;
                    i24 = i59;
                    int i74 = i51;
                    int i75 = i64;
                    i20 = i65;
                    str10 = str20;
                    int i76 = i67;
                    str7 = str21;
                    Object[] objArr6 = objArr5;
                    resources = resources2;
                    int i77 = i62;
                    i21 = i66;
                    str11 = str24;
                    objArr2 = objArr6;
                    i19 = i77;
                    i25 = i74;
                    sArr3 = sArr6;
                    i22 = i68;
                    i26 = i69;
                    i28 = i76;
                    i27 = i75;
                    iM24807 = 1;
                    int iM69810 = (i56 - C2105.m6981("ۖܽ")) * (-11);
                    int i78 = i27;
                    int i79 = ((iM69810 ^ i55) * (-13895)) ^ 2088578755;
                    i58 = iM69810 ^ 1280070652;
                    sArr6 = sArr3;
                    i69 = i26;
                    i68 = i22;
                    i70 = i23;
                    str20 = str10;
                    i59 = i24;
                    str18 = str9;
                    str19 = str8;
                    i60 = i18;
                    sArr7 = sArr4;
                    i65 = i20;
                    i64 = i78;
                    i57 = i79;
                    str21 = str7;
                    i67 = i28;
                    resources2 = resources;
                    objArr5 = objArr2;
                    str24 = str11;
                    i66 = i21;
                    i62 = i19;
                    int i80 = i25;
                    i71 = iM24807;
                    i51 = i80;
                    break;
                case -2021826927:
                case -1453542738:
                    str15 = str19;
                    i49 = i51;
                    strM7036 = C2126.m7036(f69167, 57, 3, i61);
                    if (!C1711.f5919) {
                        iM6988 = (C2105.m6981("ۤܳ") + i56) * 25;
                        i57 = ((iM6988 ^ i55) * (-15097)) ^ 89146338;
                        i50 = 39445042;
                        i58 = iM6988 ^ i50;
                        str19 = str15;
                        i51 = i49;
                    } else {
                        i51 = i49;
                        str19 = str15;
                        int i81 = i67;
                        str21 = str21;
                        i67 = i81;
                        int iM25611 = (i55 - C0630.m2566("ܰ᩺")) * (-103);
                        i57 = ((iM25611 ^ i56) * 20199) ^ (-50473480);
                        i58 = iM25611 ^ (-1448517717);
                        i70 = i70;
                        str20 = str20;
                        str24 = str24;
                        i60 = i60;
                        sArr7 = sArr7;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str27 = str21;
                        i67 = i67;
                        str21 = str27;
                    }
                    break;
                case -1985712711:
                case -1338199393:
                    string4 = resources2.getString(C2105.m6981(C0483.m2128(f69167, 63, 3, i61)) ^ 2121800390);
                    string2 = string4;
                    str19 = str19;
                    Object[] objArr7 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr7;
                    iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                    str21 = string2;
                    i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                    i39 = 516771710;
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str28 = str21;
                    i67 = i67;
                    str21 = str28;
                    int i82 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i82;
                    break;
                case -1950471940:
                case 264613225:
                    i61 = 6688;
                    iM6981 = (i56 - C2105.m6981("ۙ᩸")) * 13;
                    i = ((iM6981 ^ i55) * (-28001)) ^ 1123649077;
                    i2 = -1307674570;
                    i3 = iM6981 ^ i2;
                    sArr6 = sArr6;
                    i69 = i69;
                    i68 = i68;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i64 = i64;
                    i51 = i51;
                    i66 = i66;
                    i62 = i62;
                    i71 = i71;
                    i58 = i3;
                    c21507 = this;
                    int i83 = i67;
                    i57 = i;
                    str21 = str21;
                    i67 = i83;
                    break;
                case -1940703418:
                case 261897928:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    str20 = str20;
                    int i84 = i67;
                    str21 = str21;
                    i67 = i84;
                    Object[] objArr8 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr8;
                    if (i62 == i64) {
                        iM6983 = C2105.m6981("ۖܶ") ^ i55;
                        i57 = ((iM6983 ^ i56) * (-1583)) ^ 849773310;
                        i38 = -57630001;
                        i58 = iM6983 ^ i38;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str29 = str21;
                        i67 = i67;
                        str21 = str29;
                        int i85 = i66;
                        i62 = i62;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i85;
                    } else {
                        i67 = i67;
                        i62 = i62;
                        i71 = i71;
                        sArr6 = sArr6;
                        i30 = i69;
                        i51 = i51;
                        i29 = i68;
                        iM6982 = (C2105.m6981("ܳ᩻") ^ i56) * 95;
                        i4 = ((iM6982 ^ i55) * (-16977)) ^ 854099595;
                        i31 = -1516214723;
                        i5 = iM6982 ^ i31;
                        sArr6 = sArr6;
                        i69 = i30;
                        i68 = i29;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    }
                    break;
                case -1895473257:
                case 1858496731:
                    str8 = str19;
                    int i86 = i65;
                    str9 = str18;
                    i24 = i59;
                    int i87 = i51;
                    str10 = str20;
                    int i88 = i66;
                    str11 = str24;
                    int i89 = i67;
                    str7 = str21;
                    iM24807 = -1;
                    i25 = i87;
                    i18 = i60;
                    i19 = i62;
                    objArr2 = objArr5;
                    i22 = i68;
                    sArr4 = sArr7;
                    i23 = i70;
                    resources = resources2;
                    i21 = i88;
                    i26 = i69;
                    i28 = i89;
                    i27 = i64;
                    i20 = i86;
                    sArr3 = sArr6;
                    int iM69811 = (i56 - C2105.m6981("ۖܽ")) * (-11);
                    int i710 = i27;
                    int i711 = ((iM69811 ^ i55) * (-13895)) ^ 2088578755;
                    i58 = iM69811 ^ 1280070652;
                    sArr6 = sArr3;
                    i69 = i26;
                    i68 = i22;
                    i70 = i23;
                    str20 = str10;
                    i59 = i24;
                    str18 = str9;
                    str19 = str8;
                    i60 = i18;
                    sArr7 = sArr4;
                    i65 = i20;
                    i64 = i710;
                    i57 = i711;
                    str21 = str7;
                    i67 = i28;
                    resources2 = resources;
                    objArr5 = objArr2;
                    str24 = str11;
                    i66 = i21;
                    i62 = i19;
                    int i810 = i25;
                    i71 = iM24807;
                    i51 = i810;
                    break;
                case -1880205873:
                case -1476261454:
                    String str30 = str18;
                    int i90 = i67;
                    String str31 = str21;
                    String str32 = str19;
                    int i91 = i51;
                    if (i91 != i90) {
                        int iM69812 = C2105.m6981("ۙܿ") ^ i55;
                        i57 = ((iM69812 ^ i56) * 27027) ^ (-1966760447);
                        i58 = iM69812 ^ (-840917546);
                    } else {
                        int iM25612 = (i55 - C0630.m2566("֨ۤ")) * (-23);
                        i57 = ((iM25612 ^ i56) * 20533) ^ 1267293479;
                        i58 = iM25612 ^ 1956576142;
                        i59 = i59;
                    }
                    str18 = str30;
                    i67 = i90;
                    str21 = str31;
                    str19 = str32;
                    i51 = i91;
                    break;
                case -1870270918:
                case -1500755336:
                    if (!C0422.m1963()) {
                        str14 = str19;
                        i59 = i59;
                        i45 = i51;
                        int i712 = i67;
                        str21 = str21;
                        i67 = i712;
                        iM6987 = C0630.m2566("ᩴ֨") ^ i56;
                        i57 = ((iM6987 ^ i55) * 10969) ^ (-667978173);
                        i48 = -444947030;
                        i58 = iM6987 ^ i48;
                        i51 = i45;
                        str20 = str20;
                        str24 = str24;
                        str19 = str14;
                        i65 = i65;
                        i66 = i66;
                        i59 = i59;
                        str18 = str18;
                        String str210 = str21;
                        i67 = i67;
                        str21 = str210;
                    } else {
                        str19 = str19;
                        iM6981 = C2105.m6981("۠֡") ^ i56;
                        i = ((iM6981 ^ i55) * (-8983)) ^ 2020731992;
                        i2 = -1982425636;
                        i3 = iM6981 ^ i2;
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i811 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i811;
                    }
                    break;
                case -1860459348:
                case -1114080279:
                    i25 = i51;
                    str8 = str19;
                    i18 = i60;
                    i19 = i62;
                    int i92 = i64;
                    i20 = i65;
                    i21 = i66;
                    str9 = str18;
                    sArr4 = sArr7;
                    i23 = i70;
                    i24 = i59;
                    str10 = str20;
                    str11 = str24;
                    objArr2 = objArr5;
                    resources = resources2;
                    int i93 = i67;
                    str7 = str21;
                    i28 = i93;
                    i27 = i92;
                    sArr3 = sArr6;
                    i22 = i68;
                    i26 = i69;
                    iM24807 = 2;
                    int iM69813 = (i56 - C2105.m6981("ۖܽ")) * (-11);
                    int i713 = i27;
                    int i714 = ((iM69813 ^ i55) * (-13895)) ^ 2088578755;
                    i58 = iM69813 ^ 1280070652;
                    sArr6 = sArr3;
                    i69 = i26;
                    i68 = i22;
                    i70 = i23;
                    str20 = str10;
                    i59 = i24;
                    str18 = str9;
                    str19 = str8;
                    i60 = i18;
                    sArr7 = sArr4;
                    i65 = i20;
                    i64 = i713;
                    i57 = i714;
                    str21 = str7;
                    i67 = i28;
                    resources2 = resources;
                    objArr5 = objArr2;
                    str24 = str11;
                    i66 = i21;
                    i62 = i19;
                    int i812 = i25;
                    i71 = iM24807;
                    i51 = i812;
                    break;
                case -1858073255:
                case -363919358:
                    str19 = str19;
                    int i94 = i65;
                    str18 = str18;
                    i59 = i59;
                    i51 = i51;
                    i66 = i66;
                    str24 = str24;
                    int i95 = i67;
                    str21 = str21;
                    i67 = i95;
                    Object[] objArr9 = new Object[i52];
                    objArr9[c] = Float.valueOf(i66 / f);
                    i60 = i60;
                    objArr5 = objArr5;
                    sArr7 = sArr7;
                    i70 = i70;
                    resources2 = resources2;
                    string3 = resources2.getString(i94, objArr9);
                    i64 = i64;
                    i65 = i94;
                    iM6984 = C0630.m2566("ۨ᩵") ^ i55;
                    str20 = string3;
                    i57 = ((iM6984 ^ i56) * 25579) ^ (-444386047);
                    i41 = -1225169588;
                    i58 = iM6984 ^ i41;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i66 = i66;
                    i64 = i64;
                    i51 = i51;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    String str211 = str21;
                    i67 = i67;
                    str21 = str211;
                    break;
                case -1791243244:
                case 152278652:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    resources2 = resources2;
                    str20 = str20;
                    c = 0;
                    f = 1000000.0f;
                    sArr6 = f69167;
                    i68 = 42;
                    i69 = 3;
                    if (C1711.m5736() > 0) {
                        int iM25613 = (C0630.m2566("ܰۧ") + i55) * (-101);
                        i4 = ((iM25613 ^ i56) * 12895) ^ (-980212207);
                        i5 = iM25613 ^ (-907717504);
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    } else {
                        int iM69814 = (i55 - C2105.m6981("ۗ֫")) * 7;
                        i = ((iM69814 ^ i56) * 18039) ^ (-310754591);
                        i3 = iM69814 ^ 857552981;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i813 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i813;
                    }
                    break;
                case -1785821460:
                case -963663257:
                    str14 = str19;
                    i65 = i65;
                    str18 = str18;
                    i59 = i59;
                    i45 = i51;
                    str20 = str20;
                    i46 = i64;
                    i66 = i66;
                    str24 = str24;
                    int i96 = i67;
                    str21 = str21;
                    i67 = i96;
                    if (i66 == i46) {
                        string5 = str17;
                        iM25610 = C0630.m2566("ᩳۙ") ^ i56;
                        i57 = ((iM25610 ^ i55) * (-1751)) ^ (-54393489);
                        i47 = 1702300211;
                    } else {
                        iM25610 = (C0630.m2566("ۜ۬") ^ i56) * 27;
                        i57 = ((iM25610 ^ i55) * 22975) ^ 1955953980;
                        i47 = 16432445;
                    }
                    i58 = iM25610 ^ i47;
                    i64 = i46;
                    i51 = i45;
                    str20 = str20;
                    str24 = str24;
                    str19 = str14;
                    i65 = i65;
                    i66 = i66;
                    i59 = i59;
                    str18 = str18;
                    String str212 = str21;
                    i67 = i67;
                    str21 = str212;
                    break;
                case -1746260062:
                case -442501607:
                    str19 = str19;
                    str18 = str18;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    int i97 = i67;
                    str21 = str21;
                    i67 = i97;
                    if (c8353.f25624 == i64) {
                        iM6986 = C2105.m6981("۟ۢ") ^ i55;
                        i57 = ((iM6986 ^ i56) * 20517) ^ (-136791537);
                        i44 = 1344721527;
                        i58 = iM6986 ^ i44;
                        str20 = str20;
                        str24 = str24;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str213 = str21;
                        i67 = i67;
                        str21 = str213;
                    } else {
                        i67 = i67;
                        i60 = i60;
                        objArr5 = objArr5;
                        sArr7 = sArr7;
                        i70 = i70;
                        resources2 = resources2;
                        i66 = i66;
                        i51 = i51;
                        i29 = i68;
                        i30 = i69;
                        iM6982 = (C0630.m2566("֡۫") ^ i56) * 97;
                        i4 = ((iM6982 ^ i55) * 9007) ^ (-1316777226);
                        i31 = 1724636027;
                        i5 = iM6982 ^ i31;
                        sArr6 = sArr6;
                        i69 = i30;
                        i68 = i29;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    }
                    break;
                case -1559174560:
                case 1775944642:
                    int i98 = i51;
                    String str33 = str19;
                    String str34 = str18;
                    str18 = str34;
                    strM48671 = c21507.m48669(str34, str33, str20);
                    i51 = i98;
                    str19 = str33;
                    i67 = i67;
                    objArr5 = objArr5;
                    iM6983 = C0630.m2566("֨᩵") ^ i55;
                    i57 = ((iM6983 ^ i56) * UMWorkDispatch.MSG_CHECKER_TIMER) ^ 16563511;
                    i38 = -1540272771;
                    i58 = iM6983 ^ i38;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str214 = str21;
                    i67 = i67;
                    str21 = str214;
                    int i814 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i814;
                    break;
                case -1457043838:
                case 1325422822:
                    i61 = 27659;
                    iM6981 = (i56 - C2105.m6981("ۙ᩸")) * 13;
                    i = ((iM6981 ^ i55) * (-28001)) ^ 1123649077;
                    i2 = -1307674570;
                    i3 = iM6981 ^ i2;
                    sArr6 = sArr6;
                    i69 = i69;
                    i68 = i68;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i64 = i64;
                    i51 = i51;
                    i66 = i66;
                    i62 = i62;
                    i71 = i71;
                    i58 = i3;
                    c21507 = this;
                    int i815 = i67;
                    i57 = i;
                    str21 = str21;
                    i67 = i815;
                    break;
                case -1438744801:
                case -92272204:
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    str18 = str18;
                    i59 = i59;
                    str20 = str20;
                    int i99 = i66;
                    str24 = str24;
                    int i100 = i67;
                    str21 = str21;
                    i67 = i100;
                    i60 = i60;
                    short[] sArr9 = sArr7;
                    i70 = i70;
                    int iM25614 = C0630.m2566(RunnableC0588.m2436(sArr9, i70, 3, i61)) ^ 2119123526;
                    sArr7 = sArr9;
                    objArr5 = objArr5;
                    string = resources2.getString(iM25614, objArr5);
                    resources2 = resources2;
                    i37 = i62;
                    i35 = i99;
                    i36 = i63;
                    int iM69815 = C2105.m6981("ۗ᩷") ^ i56;
                    i57 = ((iM69815 ^ i55) * (-2055)) ^ 683688760;
                    i58 = iM69815 ^ 1758487092;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i64 = i64;
                    i51 = i51;
                    i66 = i35;
                    str19 = string;
                    i62 = i37;
                    i63 = i36;
                    i59 = i59;
                    str18 = str18;
                    String str215 = str21;
                    i67 = i67;
                    str21 = str215;
                    break;
                case -1418165610:
                case 1840359584:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr6 = sArr6;
                    i29 = i68;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    i30 = i69;
                    resources2 = resources2;
                    str20 = str20;
                    if (C9786.m24804(str23) != null) {
                        iM6982 = (C2105.m6981("ܳ᩻") ^ i56) * 95;
                        i4 = ((iM6982 ^ i55) * (-16977)) ^ 854099595;
                        i31 = -1516214723;
                    } else {
                        iM6982 = (C2105.m6981("ۙ᩻") + i56) * 23;
                        i4 = ((iM6982 ^ i55) * (-25777)) ^ (-458054767);
                        i31 = 167588319;
                    }
                    i5 = iM6982 ^ i31;
                    sArr6 = sArr6;
                    i69 = i30;
                    i68 = i29;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    i71 = i71;
                    i58 = i5;
                    str21 = str21;
                    i67 = i67;
                    i57 = i4;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i66;
                    i62 = i62;
                    break;
                case -1393642284:
                case 314773587:
                    str = str19;
                    if (i51 != 6) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i55;
                        i57 = ((iM2566 ^ i56) * (-22773)) ^ 833035042;
                        i6 = 439781995;
                    } else {
                        iM2566 = C2105.m6981("ۡ۬") ^ i56;
                        i57 = ((iM2566 ^ i55) * (-23431)) ^ (-154311202);
                        i6 = -1686832279;
                    }
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -1357240673:
                case 720133756:
                    if (C0422.f1886 <= 0) {
                        str2 = str19;
                        i7 = i60;
                        i8 = i71;
                        i17 = i66;
                        i11 = i67;
                        str4 = str18;
                        sArr = sArr6;
                        i12 = i68;
                        sArr2 = sArr7;
                        i13 = i70;
                        str5 = str21;
                        i14 = i59;
                        i16 = i51;
                        str3 = str24;
                        objArr = objArr5;
                        i9 = i64;
                        i10 = i65;
                        i15 = i69;
                        str6 = str20;
                        int iM25615 = C0630.m2566("᩸ܺ") ^ i56;
                        int i101 = i17;
                        int i102 = ((iM25615 ^ i55) * 31695) ^ 996306463;
                        sArr6 = sArr;
                        i69 = i15;
                        i68 = i12;
                        i70 = i13;
                        str20 = str6;
                        i59 = i14;
                        str18 = str4;
                        str19 = str2;
                        i60 = i7;
                        sArr7 = sArr2;
                        i65 = i10;
                        i64 = i9;
                        i51 = i16;
                        i71 = i8;
                        i58 = iM25615 ^ (-756436447);
                        str21 = str5;
                        i67 = i11;
                        i57 = i102;
                        c21507 = this;
                        objArr5 = objArr;
                        str24 = str3;
                        i66 = i101;
                    } else {
                        str = str19;
                        iM2566 = C0630.m2566("۫᩺") ^ i56;
                        i57 = ((iM2566 ^ i55) * 14831) ^ (-394355232);
                        i6 = -1576536805;
                        i58 = iM2566 ^ i6;
                        str19 = str;
                    }
                    break;
                case -1329295645:
                case 1395742801:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr6 = sArr6;
                    i68 = i68;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    i69 = i69;
                    resources2 = resources2;
                    str20 = str20;
                    if ((i53 * i53) - ((s * 2) + 1) >= 0) {
                        iM6981 = (C2105.m6981("۫᩶") + i55) * 47;
                        i = ((iM6981 ^ i56) * 4025) ^ (-866208584);
                        i2 = -127096613;
                    } else {
                        iM6981 = (C0630.m2566("ۧۢ") ^ i56) * (-123);
                        i = ((iM6981 ^ i55) * 5409) ^ (-1759313109);
                        i2 = 38501002;
                    }
                    i3 = iM6981 ^ i2;
                    sArr6 = sArr6;
                    i69 = i69;
                    i68 = i68;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i64 = i64;
                    i51 = i51;
                    i66 = i66;
                    i62 = i62;
                    i71 = i71;
                    i58 = i3;
                    c21507 = this;
                    int i816 = i67;
                    i57 = i;
                    str21 = str21;
                    i67 = i816;
                    break;
                case -1280309575:
                case 572140138:
                    if (C3911.f12484 < 0) {
                        iM2566 = (C0630.m2566("ܿۗ") ^ i55) * 83;
                        str = str19;
                        i57 = ((iM2566 ^ i56) * (-16939)) ^ 1992943001;
                        i6 = 2037451339;
                        i58 = iM2566 ^ i6;
                        str19 = str;
                    } else {
                        str19 = str19;
                        iM6981 = C2105.m6981("۠֡") ^ i56;
                        i = ((iM6981 ^ i55) * (-8983)) ^ 2020731992;
                        i2 = -1982425636;
                        i3 = iM6981 ^ i2;
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i817 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i817;
                    }
                    break;
                case -1162393473:
                case 394878585:
                    string2 = resources2.getString(C0630.m2566(strM12578) ^ 2123574223);
                    str19 = str19;
                    Object[] objArr10 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr10;
                    iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                    str21 = string2;
                    i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                    i39 = 516771710;
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str216 = str21;
                    i67 = i67;
                    str21 = str216;
                    int i818 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i818;
                    break;
                case -1117283106:
                case -633421058:
                    str2 = str19;
                    str3 = str24;
                    i7 = i60;
                    i8 = i71;
                    objArr = objArr5;
                    i9 = i64;
                    i10 = i65;
                    i11 = i67;
                    str4 = str18;
                    sArr = sArr6;
                    i12 = i68;
                    sArr2 = sArr7;
                    i13 = i70;
                    str5 = str21;
                    i14 = i59;
                    str6 = str20;
                    i15 = i69;
                    resources2 = (Resources) c21507.f69168;
                    String str35 = c8353.f25614;
                    int i103 = c8353.f25627;
                    i16 = c8353.f25625;
                    int i104 = c8353.f25609;
                    if (C7106.f21815 != 0) {
                        i62 = i104;
                        i17 = i103;
                        str22 = str35;
                        int iM25616 = C0630.m2566("᩸ܺ") ^ i56;
                        int i105 = i17;
                        int i106 = ((iM25616 ^ i55) * 31695) ^ 996306463;
                        sArr6 = sArr;
                        i69 = i15;
                        i68 = i12;
                        i70 = i13;
                        str20 = str6;
                        i59 = i14;
                        str18 = str4;
                        str19 = str2;
                        i60 = i7;
                        sArr7 = sArr2;
                        i65 = i10;
                        i64 = i9;
                        i51 = i16;
                        i71 = i8;
                        i58 = iM25616 ^ (-756436447);
                        str21 = str5;
                        i67 = i11;
                        i57 = i106;
                        c21507 = this;
                        objArr5 = objArr;
                        str24 = str3;
                        i66 = i105;
                    } else {
                        int iM69816 = (C2105.m6981("ۛۚ") ^ i55) * (-85);
                        int i107 = ((iM69816 ^ i56) * (-1333)) ^ (-1794925175);
                        sArr6 = sArr;
                        i69 = i15;
                        i68 = i12;
                        i70 = i13;
                        str20 = str6;
                        i59 = i14;
                        str18 = str4;
                        str19 = str2;
                        i60 = i7;
                        sArr7 = sArr2;
                        i65 = i10;
                        i64 = i9;
                        i51 = i16;
                        i71 = i8;
                        i58 = iM69816 ^ 636875001;
                        i62 = i104;
                        objArr5 = objArr;
                        str24 = str3;
                        i66 = i103;
                        str22 = str35;
                        str21 = str5;
                        i67 = i11;
                        i57 = i107;
                        c21507 = this;
                    }
                    break;
                case -1075254056:
                case 552855948:
                    string4 = resources2.getString(C2105.m6981(C3911.m11919(f69167, 66, 3, i61)) ^ 2123893412);
                    string2 = string4;
                    str19 = str19;
                    Object[] objArr11 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr11;
                    iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                    str21 = string2;
                    i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                    i39 = 516771710;
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str217 = str21;
                    i67 = i67;
                    str21 = str217;
                    int i819 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i819;
                    break;
                case -1054555509:
                case 1713044463:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    int i108 = i67;
                    str21 = str21;
                    i67 = i108;
                    Integer numM9932 = C3245.m9931(i63);
                    numM9931 = C3245.m9931(i62);
                    objArr5 = new Object[i67];
                    objArr5[c] = numM9932;
                    if (C22628.f73083 > 0) {
                        iM6984 = C2105.m6981("᩶᩶") ^ i56;
                        resources2 = resources2;
                        i57 = ((iM6984 ^ i55) * (-1855)) ^ 1297537629;
                        i41 = -1109351171;
                        i58 = iM6984 ^ i41;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i66 = i66;
                        i64 = i64;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str218 = str21;
                        i67 = i67;
                        str21 = str218;
                    } else {
                        objArr5 = objArr5;
                        int iM25617 = (i55 - C0630.m2566("ܰ᩺")) * (-103);
                        i57 = ((iM25617 ^ i56) * 20199) ^ (-50473480);
                        i58 = iM25617 ^ (-1448517717);
                        i70 = i70;
                        str20 = str20;
                        str24 = str24;
                        i60 = i60;
                        sArr7 = sArr7;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str219 = str21;
                        i67 = i67;
                        str21 = str219;
                    }
                    break;
                case -988479037:
                case 2039651908:
                    str = str19;
                    if (i51 != 7) {
                        iM2566 = C2105.m6981("ۚᩴ") ^ i56;
                        i57 = ((iM2566 ^ i55) * (-14435)) ^ (-140245471);
                        i6 = 231800186;
                    } else {
                        iM2566 = C2105.m6981("ۡ۬") ^ i56;
                        i57 = ((iM2566 ^ i55) * (-23431)) ^ (-154311202);
                        i6 = -1686832279;
                    }
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -976262736:
                case 116333941:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr6 = sArr6;
                    i29 = i68;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    i30 = i69;
                    resources2 = resources2;
                    str20 = str20;
                    if (C9786.m24797(str23) != null) {
                        iM6982 = (C0630.m2566("֡۫") ^ i56) * 97;
                        i4 = ((iM6982 ^ i55) * 9007) ^ (-1316777226);
                        i31 = 1724636027;
                    } else {
                        iM6982 = C0630.m2566("᩻᩷") ^ i55;
                        i4 = ((iM6982 ^ i56) * 10911) ^ (-1005948548);
                        i31 = -1118419184;
                    }
                    i5 = iM6982 ^ i31;
                    sArr6 = sArr6;
                    i69 = i30;
                    i68 = i29;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    i71 = i71;
                    i58 = i5;
                    str21 = str21;
                    i67 = i67;
                    i57 = i4;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i66;
                    i62 = i62;
                    break;
                case -859316083:
                case 250764885:
                    str7 = str21;
                    str8 = str19;
                    i18 = i60;
                    int i109 = i71;
                    i19 = i62;
                    i20 = i65;
                    i21 = i66;
                    str9 = str18;
                    sArr3 = sArr6;
                    i22 = i68;
                    sArr4 = sArr7;
                    i23 = i70;
                    i24 = i59;
                    i25 = i51;
                    str10 = str20;
                    str11 = str24;
                    objArr2 = objArr5;
                    i26 = i69;
                    resources = resources2;
                    int i110 = c8353.f25633;
                    String str36 = c8353.f25619;
                    iM24807 = C9786.m24807(str22);
                    if (iM24807 != -1) {
                        i63 = i110;
                        str23 = str36;
                        i27 = -1;
                        i28 = 2;
                        i52 = 1;
                        int iM69817 = (i56 - C2105.m6981("ۖܽ")) * (-11);
                        int i715 = i27;
                        int i716 = ((iM69817 ^ i55) * (-13895)) ^ 2088578755;
                        i58 = iM69817 ^ 1280070652;
                        sArr6 = sArr3;
                        i69 = i26;
                        i68 = i22;
                        i70 = i23;
                        str20 = str10;
                        i59 = i24;
                        str18 = str9;
                        str19 = str8;
                        i60 = i18;
                        sArr7 = sArr4;
                        i65 = i20;
                        i64 = i715;
                        i57 = i716;
                        str21 = str7;
                        i67 = i28;
                        resources2 = resources;
                        objArr5 = objArr2;
                        str24 = str11;
                        i66 = i21;
                        i62 = i19;
                        int i8110 = i25;
                        i71 = iM24807;
                        i51 = i8110;
                    } else {
                        int iM69818 = C2105.m6981("ܳ֡") ^ i55;
                        i63 = i110;
                        str23 = str36;
                        sArr6 = sArr3;
                        i69 = i26;
                        i68 = i22;
                        i57 = ((iM69818 ^ i56) * (-10147)) ^ 1158231220;
                        i70 = i23;
                        resources2 = resources;
                        str20 = str10;
                        str21 = str7;
                        i59 = i24;
                        str18 = str9;
                        str19 = str8;
                        i60 = i18;
                        sArr7 = sArr4;
                        i52 = 1;
                        i67 = 2;
                        objArr5 = objArr2;
                        i65 = i20;
                        str24 = str11;
                        i64 = -1;
                        i66 = i21;
                        i62 = i19;
                        i58 = iM69818 ^ (-1299047827);
                        i51 = i25;
                        i71 = i109;
                    }
                    break;
                case -843203099:
                case 719239084:
                    string4 = resources2.getString(C2105.m6981(C2126.m7036(f69167, 60, 3, i61)) ^ 2128334591);
                    string2 = string4;
                    str19 = str19;
                    Object[] objArr12 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr12;
                    iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                    str21 = string2;
                    i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                    i39 = 516771710;
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str2110 = str21;
                    i67 = i67;
                    str21 = str2110;
                    int i8111 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i8111;
                    break;
                case -824024113:
                case 1759839978:
                    i59 = i59;
                    String str37 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    i70 = i70;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    str20 = str20;
                    int i111 = i67;
                    str21 = str21;
                    i67 = i111;
                    Object[] objArr13 = objArr5;
                    resources2 = resources2;
                    int i112 = i62;
                    i35 = i66;
                    str24 = str24;
                    objArr5 = objArr13;
                    strM48672 = m48672(c8353);
                    i36 = i63;
                    if (i36 == i64) {
                        i37 = i112;
                        str18 = strM48672;
                        string = str17;
                        int iM69819 = C2105.m6981("ۗ᩷") ^ i56;
                        i57 = ((iM69819 ^ i55) * (-2055)) ^ 683688760;
                        i58 = iM69819 ^ 1758487092;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i35;
                        str19 = string;
                        i62 = i37;
                        i63 = i36;
                        i59 = i59;
                        str18 = str18;
                        String str2111 = str21;
                        i67 = i67;
                        str21 = str2111;
                    } else {
                        int iM69820 = (C2105.m6981("᩷᩶") ^ i56) * (-61);
                        i62 = i112;
                        i57 = ((iM69820 ^ i55) * (-20047)) ^ 490889168;
                        i58 = iM69820 ^ (-1605965870);
                        i63 = i36;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        i60 = i60;
                        sArr7 = sArr7;
                        str18 = strM48672;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i35;
                        str19 = str37;
                        i62 = i62;
                        String str2112 = str21;
                        i67 = i67;
                        str21 = str2112;
                    }
                    break;
                case -765378776:
                case 1062288158:
                    String str38 = str19;
                    String str39 = str20;
                    int i113 = i60;
                    i62 = i62;
                    i66 = i66;
                    String str40 = str18;
                    short[] sArr10 = sArr6;
                    int i114 = i68;
                    short[] sArr11 = sArr7;
                    int i115 = i70;
                    int i116 = i59;
                    str24 = str24;
                    objArr5 = objArr5;
                    int i117 = i69;
                    resources2 = resources2;
                    int i118 = i71;
                    i51 = i51;
                    i64 = i64;
                    int i119 = i67;
                    str21 = str21;
                    int iM25618 = C0630.m2566(ServiceConnectionC3453.m10568(sArr10, i114, i117, i61)) ^ 2120199644;
                    if (i118 != i119) {
                        i67 = i119;
                        int iM69821 = C2105.m6981("ۢۛ") ^ i56;
                        i71 = i118;
                        i4 = ((iM69821 ^ i55) * (-3717)) ^ (-299262427);
                        i5 = iM69821 ^ 811765572;
                        sArr6 = sArr10;
                        i69 = i117;
                        i68 = i114;
                        i70 = i115;
                        str20 = str39;
                        i59 = i116;
                        str18 = str40;
                        str19 = str38;
                        i60 = i113;
                        sArr7 = sArr11;
                        i65 = iM25618;
                        str17 = "";
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    } else {
                        int iM69822 = C2105.m6981("ܶ۬") ^ i55;
                        i67 = i119;
                        i = ((iM69822 ^ i56) * 23445) ^ 612693791;
                        i58 = iM69822 ^ (-1211713889);
                        sArr6 = sArr10;
                        i69 = i117;
                        i68 = i114;
                        i70 = i115;
                        str20 = str39;
                        i59 = i116;
                        str18 = str40;
                        str19 = str38;
                        i60 = i113;
                        sArr7 = sArr11;
                        i65 = iM25618;
                        str17 = "";
                        i64 = i64;
                        i51 = i51;
                        i71 = i118;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                        int i8112 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i8112;
                    }
                    break;
                case -739626004:
                case 735488770:
                    return resources2.getString(C2105.m6981(strM10488) ^ 2125859463);
                case -702669590:
                case -323449415:
                    str = str19;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i55 - C2105.m6981("۫ۘ")) * 71;
                        i57 = ((iM2566 ^ i56) * 3879) ^ 1660454238;
                        i6 = 883537688;
                    } else {
                        iM2566 = C0630.m2566("۫᩺") ^ i56;
                        i57 = ((iM2566 ^ i55) * 14831) ^ (-394355232);
                        i6 = -1576536805;
                    }
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -702100126:
                case 690453655:
                    C3245.m9925();
                    return null;
                case -672205636:
                case 1289445736:
                    return resources2.getString(C0630.m2566(C3019.m9250(sArr8, i59, i60, i61)) ^ 2098793602, objArr4);
                case -568787665:
                case 413657422:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    str20 = str20;
                    i67 = i67;
                    objArr5 = objArr5;
                    strM48671 = m48671(c8353);
                    iM6983 = C0630.m2566("֨᩵") ^ i55;
                    i57 = ((iM6983 ^ i56) * UMWorkDispatch.MSG_CHECKER_TIMER) ^ 16563511;
                    i38 = -1540272771;
                    i58 = iM6983 ^ i38;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str2113 = str21;
                    i67 = i67;
                    str21 = str2113;
                    int i8113 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i8113;
                    break;
                case -564881824:
                case 1528400135:
                    str = str19;
                    if (i51 != 8) {
                        iM2566 = (C2105.m6981("֨֡") ^ i55) * (-35);
                        i57 = ((iM2566 ^ i56) * 32271) ^ 1107098255;
                        i6 = 1592008286;
                    } else {
                        iM2566 = C0630.m2566("ܽۧ") ^ i56;
                        i57 = ((iM2566 ^ i55) * (-20773)) ^ (-1059485764);
                        i6 = -546500524;
                    }
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -551561798:
                case 1032197135:
                    str = str19;
                    C2958.m9034();
                    if (C2167.f7158 < 0) {
                        iM2566 = C0630.m2566("۫᩺") ^ i56;
                        i57 = ((iM2566 ^ i55) * 14831) ^ (-394355232);
                        i6 = -1576536805;
                    } else {
                        iM2566 = C0630.m2566("ۤ֡") ^ i55;
                        i57 = ((iM2566 ^ i56) * (-25475)) ^ (-592228122);
                        i6 = 865796231;
                    }
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -447480905:
                case 1491202047:
                    str14 = str19;
                    i65 = i65;
                    str18 = str18;
                    i59 = i59;
                    i45 = i51;
                    str20 = str20;
                    i66 = i66;
                    str24 = str24;
                    int i120 = i67;
                    str21 = str21;
                    i67 = i120;
                    if (i45 != i52) {
                        iM6987 = (C2105.m6981("ᩳ᩶") + i56) * (-37);
                        i57 = ((iM6987 ^ i55) * (-1269)) ^ 826920562;
                        i48 = -74709951;
                    } else {
                        iM6987 = C2105.m6981("۟ܰ") ^ i55;
                        i57 = ((iM6987 ^ i56) * (-17685)) ^ (-1758917290);
                        i48 = -1071332687;
                    }
                    i58 = iM6987 ^ i48;
                    i51 = i45;
                    str20 = str20;
                    str24 = str24;
                    str19 = str14;
                    i65 = i65;
                    i66 = i66;
                    i59 = i59;
                    str18 = str18;
                    String str2114 = str21;
                    i67 = i67;
                    str21 = str2114;
                    break;
                case -410557134:
                case 1874678260:
                    str19 = str19;
                    int i121 = i65;
                    str18 = str18;
                    i59 = i59;
                    i51 = i51;
                    str20 = str20;
                    i64 = i64;
                    i66 = i66;
                    str24 = str24;
                    int i122 = i67;
                    str21 = str21;
                    i67 = i122;
                    String str41 = c8353.f25603;
                    if (str41 != null) {
                        int iM69823 = C2105.m6981("᩶֫") ^ i55;
                        i65 = i121;
                        i57 = ((iM69823 ^ i56) * (-6537)) ^ 1932165745;
                        i58 = iM69823 ^ (-1900028687);
                        str16 = str41;
                    } else {
                        i65 = i121;
                        str16 = str41;
                        iM6986 = (C2105.m6981("᩸۫") + i56) * 73;
                        i57 = ((iM6986 ^ i55) * 5681) ^ (-1190159014);
                        i44 = 836018979;
                        i58 = iM6986 ^ i44;
                    }
                    str20 = str20;
                    str24 = str24;
                    i66 = i66;
                    i65 = i65;
                    i59 = i59;
                    str18 = str18;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str2115 = str21;
                    i67 = i67;
                    str21 = str2115;
                    break;
                case -361951845:
                case 1194073258:
                    return strM48671;
                case -349540198:
                case 176457635:
                    str19 = str19;
                    i42 = i60;
                    str18 = str18;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str12 = str20;
                    str13 = str24;
                    objArr3 = objArr5;
                    int i123 = i67;
                    str21 = str21;
                    i67 = i123;
                    objArr3[i52] = numM9931;
                    sArr7 = f69167;
                    i70 = 45;
                    if (C1047.m3599() >= 0) {
                        iM6985 = (i56 - C0630.m2566("ܺۤ")) * (-81);
                        i57 = ((iM6985 ^ i55) * 32067) ^ 2001828220;
                        i43 = -543712182;
                    } else {
                        iM6985 = (C2105.m6981("ۙ֡") ^ i55) * (-53);
                        i57 = ((iM6985 ^ i56) * (-21595)) ^ (-283769571);
                        i43 = 1738361670;
                    }
                    i58 = iM6985 ^ i43;
                    objArr5 = objArr3;
                    str20 = str12;
                    str24 = str13;
                    i60 = i42;
                    i66 = i66;
                    i65 = i65;
                    i59 = i59;
                    str18 = str18;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str2116 = str21;
                    i67 = i67;
                    str21 = str2116;
                    break;
                case -239227319:
                case 698660362:
                    str14 = str19;
                    i65 = i65;
                    str18 = str18;
                    i59 = i59;
                    i45 = i51;
                    str20 = str20;
                    i66 = i66;
                    int i124 = i67;
                    str21 = str21;
                    i67 = i124;
                    str24 = str24;
                    strM10488 = C3432.m10488(f69167, 48, 3, i61);
                    if (C1047.f3863 >= 0) {
                        iM6987 = C0630.m2566("ᩴ֨") ^ i56;
                        i57 = ((iM6987 ^ i55) * 10969) ^ (-667978173);
                        i48 = -444947030;
                    } else {
                        iM6987 = (i56 - C0630.m2566("ۨۡ")) * (-103);
                        i57 = ((iM6987 ^ i55) * 15965) ^ (-1889328889);
                        i48 = -959341294;
                    }
                    i58 = iM6987 ^ i48;
                    i51 = i45;
                    str20 = str20;
                    str24 = str24;
                    str19 = str14;
                    i65 = i65;
                    i66 = i66;
                    i59 = i59;
                    str18 = str18;
                    String str2117 = str21;
                    i67 = i67;
                    str21 = str2117;
                    break;
                case -236078918:
                case 2106170001:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    int i125 = i66;
                    str20 = str20;
                    str24 = str24;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    int i126 = i67;
                    str21 = str21;
                    i67 = i126;
                    if (i62 != i64) {
                        iM6983 = (i55 - C2105.m6981("ۛ֨")) * (-69);
                        i66 = i125;
                        i57 = ((iM6983 ^ i56) * (-16229)) ^ (-838114765);
                        i38 = 445668825;
                        i58 = iM6983 ^ i38;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str2118 = str21;
                        i67 = i67;
                        str21 = str2118;
                        int i8114 = i66;
                        i62 = i62;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i8114;
                    } else {
                        i37 = i62;
                        i35 = i125;
                        i36 = i63;
                        strM48672 = str18;
                        str18 = strM48672;
                        string = str17;
                        int iM698110 = C2105.m6981("ۗ᩷") ^ i56;
                        i57 = ((iM698110 ^ i55) * (-2055)) ^ 683688760;
                        i58 = iM698110 ^ 1758487092;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i35;
                        str19 = string;
                        i62 = i37;
                        i63 = i36;
                        i59 = i59;
                        str18 = str18;
                        String str2119 = str21;
                        i67 = i67;
                        str21 = str2119;
                    }
                    break;
                case -187785389:
                case -173342794:
                    str = str19;
                    C2520.m8026();
                    iM2566 = (i55 - C2105.m6981("۫ۘ")) * 71;
                    i57 = ((iM2566 ^ i56) * 3879) ^ 1660454238;
                    i6 = 883537688;
                    i58 = iM2566 ^ i6;
                    str19 = str;
                    break;
                case -10574801:
                case 1041831443:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    int i127 = i67;
                    str21 = str21;
                    i67 = i127;
                    if (i66 != i64) {
                        iM2569 = (i56 - C2105.m6981("֨֨")) * (-65);
                        i57 = ((iM2569 ^ i55) * (-27659)) ^ 1361844793;
                        i40 = 481474715;
                        i58 = iM2569 ^ i40;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i66 = i66;
                        i64 = i64;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str21110 = str21;
                        i67 = i67;
                        str21 = str21110;
                    } else {
                        string3 = str17;
                        iM6984 = C0630.m2566("ۨ᩵") ^ i55;
                        str20 = string3;
                        i57 = ((iM6984 ^ i56) * 25579) ^ (-444386047);
                        i41 = -1225169588;
                        i58 = iM6984 ^ i41;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i66 = i66;
                        i64 = i64;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str21111 = str21;
                        i67 = i67;
                        str21 = str21111;
                    }
                    break;
                case 83795856:
                case 1722534362:
                    str19 = str19;
                    i60 = i60;
                    i62 = i62;
                    i66 = i66;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    int i128 = i51;
                    str24 = str24;
                    i32 = i63;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    resources2 = resources2;
                    str20 = str20;
                    i33 = i71;
                    int i129 = i67;
                    str21 = str21;
                    i67 = i129;
                    if (i33 == i52) {
                        iM2567 = C2105.m6981("᩻ܿ") ^ i55;
                        i51 = i128;
                        i57 = ((iM2567 ^ i56) * (-4437)) ^ (-65046721);
                        i34 = -923199070;
                    } else {
                        i51 = i128;
                        iM2567 = (i56 - C0630.m2566("ᩴۢ")) * (-75);
                        i57 = ((iM2567 ^ i55) * (-2633)) ^ 1151111971;
                        i34 = -1958339197;
                    }
                    i58 = iM2567 ^ i34;
                    i63 = i32;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    i71 = i33;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i66;
                    i62 = i62;
                    String str21112 = str21;
                    i67 = i67;
                    str21 = str21112;
                    break;
                case 293224210:
                case 520571011:
                    str18 = str18;
                    i59 = i59;
                    int i130 = i67;
                    str21 = str21;
                    i67 = i130;
                    String str42 = str19;
                    i51 = i51;
                    str19 = str42;
                    strM12578 = C4159.m12578(f69167, 51, 3, i61);
                    if (!C0382.f1805) {
                        i60 = i60;
                        i64 = i64;
                        i65 = i65;
                        i66 = i66;
                        sArr7 = sArr7;
                        i70 = i70;
                        str20 = str20;
                        str24 = str24;
                        int iM25619 = (i55 - C0630.m2566("ܰ᩺")) * (-103);
                        i57 = ((iM25619 ^ i56) * 20199) ^ (-50473480);
                        i58 = iM25619 ^ (-1448517717);
                        i70 = i70;
                        str20 = str20;
                        str24 = str24;
                        i60 = i60;
                        sArr7 = sArr7;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str21113 = str21;
                        i67 = i67;
                        str21 = str21113;
                    } else {
                        int iM69824 = C2105.m6981("᩹ᩴ") ^ i55;
                        i57 = ((iM69824 ^ i56) * (-10509)) ^ 875867723;
                        i58 = iM69824 ^ 1704415591;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str21114 = str21;
                        i67 = i67;
                        str21 = str21114;
                    }
                    break;
                case 400126853:
                case 1201447226:
                    str19 = str19;
                    i60 = i60;
                    objArr5 = objArr5;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    resources2 = resources2;
                    i59 = i59;
                    i51 = i51;
                    i62 = i62;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    int i131 = i67;
                    str21 = str21;
                    i67 = i131;
                    String strM48673 = m48671(c8353);
                    if (i51 != i64) {
                        iM2568 = C0630.m2566("ۨۛ") ^ i56;
                        str24 = strM48673;
                        i57 = ((iM2568 ^ i55) * (-6443)) ^ (-996209054);
                        i39 = 769392672;
                    } else {
                        str24 = strM48673;
                        string2 = str17;
                        iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                        str21 = string2;
                        i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                        i39 = 516771710;
                    }
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str21115 = str21;
                    i67 = i67;
                    str21 = str21115;
                    int i8115 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i8115;
                    break;
                case 538977471:
                case 2064831155:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    int i132 = i67;
                    str21 = str21;
                    i67 = i132;
                    if (C1916.m6313(strM48671)) {
                        iM2569 = C0630.m2566("᩶ۚ") ^ i56;
                        i57 = ((iM2569 ^ i55) * (-11621)) ^ (-32117178);
                        i40 = 964161655;
                    } else {
                        iM2569 = C2105.m6981("ۘ֫") ^ i56;
                        i57 = ((iM2569 ^ i55) * (-22145)) ^ 1888756792;
                        i40 = -1130082577;
                    }
                    i58 = iM2569 ^ i40;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i66 = i66;
                    i64 = i64;
                    i51 = i51;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    String str21116 = str21;
                    i67 = i67;
                    str21 = str21116;
                    break;
                case 544029654:
                case 598945772:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    int i133 = i67;
                    str21 = str21;
                    i67 = i133;
                    if (i51 != i64) {
                        i67 = i67;
                        i66 = i66;
                        i51 = i51;
                        i29 = i68;
                        i30 = i69;
                        iM6982 = (C0630.m2566("֡۫") ^ i56) * 97;
                        i4 = ((iM6982 ^ i55) * 9007) ^ (-1316777226);
                        i31 = 1724636027;
                        i5 = iM6982 ^ i31;
                        sArr6 = sArr6;
                        i69 = i30;
                        i68 = i29;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    } else {
                        iM2569 = (C0630.m2566("ۗܿ") ^ i55) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i57 = ((iM2569 ^ i56) * (-16419)) ^ 365327551;
                        i40 = -1840103830;
                        i58 = iM2569 ^ i40;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i66 = i66;
                        i64 = i64;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str21117 = str21;
                        i67 = i67;
                        str21 = str21117;
                    }
                    break;
                case 564636040:
                case 963610737:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr6 = sArr6;
                    i68 = i68;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    i69 = i69;
                    resources2 = resources2;
                    str20 = str20;
                    s = sArr5[c2];
                    i53 = s + 1;
                    if (!RunnableC1108.m3790()) {
                        iM6981 = (C2105.m6981("ۖ۟") + i56) * 11;
                        i = ((iM6981 ^ i55) * (-24895)) ^ (-1373757279);
                        i2 = 175605043;
                        i3 = iM6981 ^ i2;
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i8116 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i8116;
                    } else {
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        int iM698111 = (i55 - C2105.m6981("ۗ֫")) * 7;
                        i = ((iM698111 ^ i56) * 18039) ^ (-310754591);
                        i3 = iM698111 ^ 857552981;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i8117 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i8117;
                    }
                    break;
                case 568557738:
                case 1269325069:
                    str = str19;
                    C3537.m10746();
                    if (C3432.f10845 < 0) {
                        str19 = str;
                        iM6981 = C2105.m6981("۠֡") ^ i56;
                        i = ((iM6981 ^ i55) * (-8983)) ^ 2020731992;
                        i2 = -1982425636;
                        i3 = iM6981 ^ i2;
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i8118 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i8118;
                    } else {
                        iM2566 = (i55 - C2105.m6981("۫ۘ")) * 71;
                        i57 = ((iM2566 ^ i56) * 3879) ^ 1660454238;
                        i6 = 883537688;
                        i58 = iM2566 ^ i6;
                        str19 = str;
                    }
                    break;
                case 667114992:
                case 908730750:
                    str14 = str19;
                    str18 = str18;
                    i59 = i59;
                    i45 = i51;
                    i66 = i66;
                    int i134 = i67;
                    str21 = str21;
                    i67 = i134;
                    Object[] objArr14 = new Object[i52];
                    objArr14[c] = Float.valueOf(i66 / f);
                    i65 = i65;
                    string5 = resources2.getString(i65, objArr14);
                    str20 = str20;
                    str24 = str24;
                    i46 = i64;
                    iM25610 = C0630.m2566("ᩳۙ") ^ i56;
                    i57 = ((iM25610 ^ i55) * (-1751)) ^ (-54393489);
                    i47 = 1702300211;
                    i58 = iM25610 ^ i47;
                    i64 = i46;
                    i51 = i45;
                    str20 = str20;
                    str24 = str24;
                    str19 = str14;
                    i65 = i65;
                    i66 = i66;
                    i59 = i59;
                    str18 = str18;
                    String str21118 = str21;
                    i67 = i67;
                    str21 = str21118;
                    break;
                case 718425077:
                case 2073839796:
                    string4 = resources2.getString(C0630.m2566(strM7036) ^ 2130701838);
                    string2 = string4;
                    str19 = str19;
                    Object[] objArr15 = objArr5;
                    resources2 = resources2;
                    i62 = i62;
                    i66 = i66;
                    str24 = str24;
                    objArr5 = objArr15;
                    iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                    str21 = string2;
                    i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                    i39 = 516771710;
                    i58 = iM2568 ^ i39;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str21119 = str21;
                    i67 = i67;
                    str21 = str21119;
                    int i8119 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i8119;
                    break;
                case 868067922:
                case 2143578255:
                    String str43 = str19;
                    strM48671 = c21507.m48669(str24, str21, string5);
                    i51 = i51;
                    str19 = str43;
                    str18 = str18;
                    i67 = i67;
                    objArr5 = objArr5;
                    iM6983 = C0630.m2566("֨᩵") ^ i55;
                    i57 = ((iM6983 ^ i56) * UMWorkDispatch.MSG_CHECKER_TIMER) ^ 16563511;
                    i38 = -1540272771;
                    i58 = iM6983 ^ i38;
                    i70 = i70;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    i60 = i60;
                    sArr7 = sArr7;
                    i65 = i65;
                    i64 = i64;
                    i51 = i51;
                    str19 = str19;
                    String str211110 = str21;
                    i67 = i67;
                    str21 = str211110;
                    int i81110 = i66;
                    i62 = i62;
                    resources2 = resources2;
                    objArr5 = objArr5;
                    str24 = str24;
                    i66 = i81110;
                    break;
                case 1167886965:
                case 2064991860:
                    str19 = str19;
                    i60 = i60;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    i66 = i66;
                    str20 = str20;
                    str24 = str24;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    int i135 = i67;
                    str21 = str21;
                    i67 = i135;
                    if (i51 >= i52) {
                        iM2569 = (C2105.m6981("ۙۧ") ^ i55) * 37;
                        i57 = ((iM2569 ^ i56) * (-1387)) ^ 1768187734;
                        i40 = -1519346634;
                        i58 = iM2569 ^ i40;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i66 = i66;
                        i64 = i64;
                        i51 = i51;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        String str211111 = str21;
                        i67 = i67;
                        str21 = str211111;
                    } else {
                        i62 = i62;
                        i66 = i66;
                        string2 = str17;
                        iM2568 = (C0630.m2566("֨ܺ") ^ i55) * 9;
                        str21 = string2;
                        i57 = ((iM2568 ^ i56) * (-9431)) ^ (-102640667);
                        i39 = 516771710;
                        i58 = iM2568 ^ i39;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str211112 = str21;
                        i67 = i67;
                        str21 = str211112;
                        int i81111 = i66;
                        i62 = i62;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i81111;
                    }
                    break;
                case 1369420551:
                case 2053373905:
                    str19 = str19;
                    int i136 = i65;
                    str18 = str18;
                    i59 = i59;
                    i51 = i51;
                    i66 = i66;
                    int i137 = i67;
                    str21 = str21;
                    i67 = i137;
                    if (C1916.m6313(C2126.m7038(str16))) {
                        str20 = str20;
                        str24 = str24;
                        i64 = i64;
                        i65 = i136;
                        iM6986 = (C2105.m6981("᩸۫") + i56) * 73;
                        i57 = ((iM6986 ^ i55) * 5681) ^ (-1190159014);
                        i44 = 836018979;
                        i58 = iM6986 ^ i44;
                        str20 = str20;
                        str24 = str24;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                    } else {
                        int iM25620 = (C0630.m2566("ۨ۠") + i56) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i57 = ((iM25620 ^ i55) * 9029) ^ 1875143168;
                        i58 = iM25620 ^ (-4413073);
                        i66 = i66;
                        i51 = i51;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i65 = i136;
                    }
                    String str211113 = str21;
                    i67 = i67;
                    str21 = str211113;
                    break;
                case 1372817467:
                case 1651924559:
                    str19 = str19;
                    i60 = i60;
                    i62 = i62;
                    i66 = i66;
                    str18 = str18;
                    sArr7 = sArr7;
                    i70 = i70;
                    i59 = i59;
                    str24 = str24;
                    i32 = i63;
                    objArr5 = objArr5;
                    resources2 = resources2;
                    i33 = i71;
                    i51 = i51;
                    i64 = i64;
                    i65 = i65;
                    str20 = str20;
                    int i138 = i67;
                    str21 = str21;
                    i67 = i138;
                    if (i32 != i64) {
                        i67 = i67;
                        i71 = i33;
                        i63 = i32;
                        sArr6 = sArr6;
                        i29 = i68;
                        i30 = i69;
                        iM6982 = (C2105.m6981("ܳ᩻") ^ i56) * 95;
                        i4 = ((iM6982 ^ i55) * (-16977)) ^ 854099595;
                        i31 = -1516214723;
                        i5 = iM6982 ^ i31;
                        sArr6 = sArr6;
                        i69 = i30;
                        i68 = i29;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i71;
                        i58 = i5;
                        str21 = str21;
                        i67 = i67;
                        i57 = i4;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                    } else {
                        iM2567 = C0630.m2566("ܺ֡") ^ i55;
                        i57 = ((iM2567 ^ i56) * (-17971)) ^ (-51639319);
                        i34 = -792752788;
                        i58 = iM2567 ^ i34;
                        i63 = i32;
                        i70 = i70;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        i65 = i65;
                        i64 = i64;
                        i51 = i51;
                        i71 = i33;
                        resources2 = resources2;
                        objArr5 = objArr5;
                        str24 = str24;
                        i66 = i66;
                        i62 = i62;
                        String str211114 = str21;
                        i67 = i67;
                        str21 = str211114;
                    }
                    break;
                case 1441316217:
                case 1608279445:
                    if (!C2126.f7087) {
                        str19 = str19;
                        iM6981 = C2105.m6981("۠֡") ^ i56;
                        i = ((iM6981 ^ i55) * (-8983)) ^ 2020731992;
                        i2 = -1982425636;
                        i3 = iM6981 ^ i2;
                        sArr6 = sArr6;
                        i69 = i69;
                        i68 = i68;
                        i70 = i70;
                        resources2 = resources2;
                        str20 = str20;
                        i59 = i59;
                        str18 = str18;
                        str19 = str19;
                        i60 = i60;
                        sArr7 = sArr7;
                        objArr5 = objArr5;
                        i65 = i65;
                        str24 = str24;
                        i64 = i64;
                        i51 = i51;
                        i66 = i66;
                        i62 = i62;
                        i71 = i71;
                        i58 = i3;
                        c21507 = this;
                        int i81112 = i67;
                        i57 = i;
                        str21 = str21;
                        i67 = i81112;
                    } else {
                        str19 = str19;
                        i51 = i51;
                        int i820 = i67;
                        str21 = str21;
                        i67 = i820;
                        int iM256110 = (i55 - C0630.m2566("ܰ᩺")) * (-103);
                        i57 = ((iM256110 ^ i56) * 20199) ^ (-50473480);
                        i58 = iM256110 ^ (-1448517717);
                        i70 = i70;
                        str20 = str20;
                        str24 = str24;
                        i60 = i60;
                        sArr7 = sArr7;
                        i66 = i66;
                        i65 = i65;
                        i59 = i59;
                        str18 = str18;
                        i64 = i64;
                        i51 = i51;
                        str19 = str19;
                        String str211115 = str21;
                        i67 = i67;
                        str21 = str211115;
                    }
                    break;
                case 1584755870:
                case 2011746468:
                    i49 = i51;
                    str15 = str19;
                    objArr4 = new Object[i52];
                    objArr4[c] = str16;
                    sArr8 = f69167;
                    i59 = 54;
                    i60 = 3;
                    if (C5695.m16023() < 0) {
                        iM6988 = C2105.m6981("ۜ֨") ^ i55;
                        i57 = ((iM6988 ^ i56) * (-30997)) ^ (-1848777940);
                        i50 = 147683571;
                        i58 = iM6988 ^ i50;
                        str19 = str15;
                        i51 = i49;
                    } else {
                        i45 = i49;
                        str14 = str15;
                        i59 = 54;
                        int i717 = i67;
                        str21 = str21;
                        i67 = i717;
                        iM6987 = C0630.m2566("ᩴ֨") ^ i56;
                        i57 = ((iM6987 ^ i55) * 10969) ^ (-667978173);
                        i48 = -444947030;
                        i58 = iM6987 ^ i48;
                        i51 = i45;
                        str20 = str20;
                        str24 = str24;
                        str19 = str14;
                        i65 = i65;
                        i66 = i66;
                        i59 = i59;
                        str18 = str18;
                        String str211116 = str21;
                        i67 = i67;
                        str21 = str211116;
                    }
                    break;
                default:
                    str19 = str19;
                    i60 = i60;
                    i71 = i71;
                    i62 = i62;
                    i66 = i66;
                    i67 = i67;
                    str18 = str18;
                    sArr6 = sArr6;
                    i68 = i68;
                    sArr7 = sArr7;
                    i70 = i70;
                    str21 = str21;
                    i59 = i59;
                    i51 = i51;
                    str24 = str24;
                    objArr5 = objArr5;
                    i64 = i64;
                    i65 = i65;
                    i69 = i69;
                    resources2 = resources2;
                    str20 = str20;
                    sArr5 = f69167;
                    c2 = ')';
                    if (C0050.m940() <= 0) {
                        iM6981 = C2105.m6981("۠֡") ^ i56;
                        i = ((iM6981 ^ i55) * (-8983)) ^ 2020731992;
                        i2 = -1982425636;
                    } else {
                        iM6981 = C0630.m2566("ۢۢ") ^ i55;
                        i = ((iM6981 ^ i56) * (-2255)) ^ 872224349;
                        i2 = -24894517;
                    }
                    i3 = iM6981 ^ i2;
                    sArr6 = sArr6;
                    i69 = i69;
                    i68 = i68;
                    i70 = i70;
                    resources2 = resources2;
                    str20 = str20;
                    i59 = i59;
                    str18 = str18;
                    str19 = str19;
                    i60 = i60;
                    sArr7 = sArr7;
                    objArr5 = objArr5;
                    i65 = i65;
                    str24 = str24;
                    i64 = i64;
                    i51 = i51;
                    i66 = i66;
                    i62 = i62;
                    i71 = i71;
                    i58 = i3;
                    c21507 = this;
                    int i81113 = i67;
                    i57 = i;
                    str21 = str21;
                    i67 = i81113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48676(String str, String str2) {
        int i = -1583432839;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = RunnableC1937.f6483;
        int iM6981 = (i2 - C2105.m6981("ᩳۙ")) * 83;
        int i4 = ((iM6981 ^ i3) * (-4525)) ^ 1197437732;
        int i5 = -622997615;
        while (true) {
            i = ((((i ^ i3) * 16723) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2097886779:
                case 1109583331:
                    C3019.m9255();
                    C3245.m9925();
                    return false;
                case -2092419933:
                case -1520612609:
                    C1504.m5179();
                    if (C0798.m2998() != 0) {
                        iM6981 = (i2 - C2105.m6981("ۧܰ")) * 79;
                        i4 = ((iM6981 ^ i3) * 31955) ^ 716342616;
                        i5 = 543711246;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۜܳ")) * 57;
                        i4 = ((iM6981 ^ i3) * (-20025)) ^ (-1972957467);
                        i5 = 2117735859;
                    }
                    break;
                case -1833863670:
                case 672531803:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ۧܰ")) * 79;
                        i4 = ((iM6981 ^ i3) * 31955) ^ 716342616;
                        i5 = 543711246;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܶ᩻")) * 63;
                        i4 = ((iM6981 ^ i3) * 23345) ^ (-1253603071);
                        i5 = -1363180571;
                    }
                    break;
                case -1671438286:
                case 718784893:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C2105.m6981("֡ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3275)) ^ (-960750877);
                        i5 = 1478629191;
                    } else {
                        iM6981 = (C2105.m6981("ۘۨ") ^ i2) * 89;
                        i4 = ((iM6981 ^ i3) * (-3453)) ^ (-1034637478);
                        i5 = -1309236613;
                    }
                    break;
                case -1358378011:
                case -778912196:
                    if (C3537.m10746() <= 0) {
                        iM6981 = C0630.m2566("ۛۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20503) ^ (-797886442);
                        i5 = 884887182;
                    } else {
                        iM6981 = (C2105.m6981("᩻᩵") + i2) * 11;
                        i4 = ((iM6981 ^ i3) * 1987) ^ (-1749453309);
                        i5 = -1123316655;
                    }
                    break;
                case -1337872336:
                case 749158520:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("֡ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3275)) ^ (-960750877);
                        i5 = 1478629191;
                    } else {
                        iM6981 = C2105.m6981("ۡܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23051)) ^ (-539557096);
                        i5 = -381684310;
                    }
                    break;
                case -981169965:
                case 1760180144:
                    C4263.m12819();
                    iM6981 = (i3 - C2105.m6981("ۚ᩶")) * (-81);
                    i4 = ((iM6981 ^ i2) * 12949) ^ 488796143;
                    i5 = -1793912143;
                    break;
                case -936090012:
                case 895610128:
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("ܿ۟") ^ i3) * 13;
                        i4 = ((iM6981 ^ i2) * (-29775)) ^ (-1698291372);
                        i5 = -96954712;
                    } else {
                        iM6981 = C2105.m6981("֡ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3275)) ^ (-960750877);
                        i5 = 1478629191;
                    }
                    break;
                case -690811556:
                case -655576852:
                    if (C4117.f13076 > 0) {
                        iM6981 = (i2 - C2105.m6981("ۜܳ")) * 57;
                        i4 = ((iM6981 ^ i3) * (-20025)) ^ (-1972957467);
                        i5 = 2117735859;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۚ᩶")) * (-81);
                        i4 = ((iM6981 ^ i2) * 12949) ^ 488796143;
                        i5 = -1793912143;
                    }
                    break;
                case -377262456:
                case 1832262119:
                    if (RunnableC1108.f4040) {
                        iM6981 = (i3 - C2105.m6981("ۢۤ")) * (-125);
                        i4 = ((iM6981 ^ i2) * 21301) ^ (-1334142253);
                        i5 = -394210112;
                    } else {
                        iM6981 = C2105.m6981("֡ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3275)) ^ (-960750877);
                        i5 = 1478629191;
                    }
                    break;
                case -322048106:
                case 201393703:
                    C1711.m5736();
                    if (C3537.f11231 < 0) {
                        iM6981 = C0630.m2566("ۛۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20503) ^ (-797886442);
                        i5 = 884887182;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ۧܰ")) * 79;
                        i4 = ((iM6981 ^ i3) * 31955) ^ 716342616;
                        i5 = 543711246;
                    }
                    break;
                case -311617575:
                case 1358528127:
                    if (C21923.f70183 != 0) {
                        iM6981 = (i2 - C2105.m6981("ۧܰ")) * 79;
                        i4 = ((iM6981 ^ i3) * 31955) ^ 716342616;
                        i5 = 543711246;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩳۛ")) * (-87);
                        i4 = ((iM6981 ^ i3) * (-10403)) ^ (-423419402);
                        i5 = 97137312;
                    }
                    break;
                case -241068300:
                case 1497675457:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("֡ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3275)) ^ (-960750877);
                        i5 = 1478629191;
                    } else {
                        iM6981 = C0630.m2566("ۢۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-31181)) ^ 1760882172;
                        i5 = -1534923137;
                    }
                    break;
                case 439902635:
                case 1702732942:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ۛۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20503) ^ (-797886442);
                        i5 = 884887182;
                    } else {
                        iM6981 = (C0630.m2566("᩶ۤ") ^ i3) * 53;
                        i4 = ((iM6981 ^ i2) * 9395) ^ (-1131196576);
                        i5 = -501380376;
                    }
                    break;
                case 547879786:
                case 962328218:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (i3 - C2105.m6981("ۚ᩶")) * (-81);
                        i4 = ((iM6981 ^ i2) * 12949) ^ 488796143;
                        i5 = -1793912143;
                    } else {
                        iM6981 = C2105.m6981("ܳ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22283) ^ 1228097046;
                        i5 = 2089692926;
                    }
                    break;
                default:
                    return m48670(str, str2, new HashSet());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m48670(String str, String str2, HashSet hashSet) {
        InterfaceC8566 interfaceC8566 = null;
        Iterator itM6374 = null;
        int i = -1178573138;
        int i2 = C3746.f11829;
        int i3 = C3019.f9544;
        int iM6981 = C2105.m6981("ۛ᩹") ^ i2;
        int i4 = ((iM6981 ^ i3) * 17419) ^ 488093959;
        int i5 = 316839889;
        while (true) {
            i = ((((i ^ i3) * (-25709)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2083982380:
                case 1950036426:
                    if (C1420.m4913()) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = C2105.m6981("۟᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-17289)) ^ (-519854003);
                        i5 = 1019514213;
                    }
                    break;
                case -2082689367:
                case -1930413031:
                    if (!C1916.f6442) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = (i2 - C2105.m6981("᩺ۚ")) * (-101);
                        i4 = ((iM6981 ^ i3) * 8729) ^ (-844754424);
                        i5 = -650959749;
                    }
                    break;
                case -2055645051:
                case 316789481:
                    C1773.m5908();
                    return false;
                case -1973130622:
                case -1717595425:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") + i2) * 31;
                        i4 = ((iM6981 ^ i3) * 413) ^ 917083867;
                        i5 = -1636561703;
                    } else {
                        iM6981 = C0630.m2566("ܳۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-12021)) ^ 655219389;
                        i5 = 1949337549;
                    }
                    break;
                case -1932975973:
                case 1216652460:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") + i2) * 31;
                        i4 = ((iM6981 ^ i3) * 413) ^ 917083867;
                        i5 = -1636561703;
                    } else {
                        iM6981 = (C2105.m6981("ۖ֡") + i3) * (-123);
                        i4 = ((iM6981 ^ i2) * (-27569)) ^ (-1930041917);
                        i5 = 1486772581;
                    }
                    break;
                case -1531459397:
                case 885072223:
                    if (str == null) {
                        iM6981 = C2105.m6981("᩸֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16809) ^ 623290787;
                        i5 = -808564807;
                    } else {
                        iM6981 = C2105.m6981("ۢܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22669)) ^ 159383878;
                        i5 = -1187489825;
                    }
                    break;
                case -1502908137:
                case 88891145:
                    if (C0964.f3626 != 0) {
                        iM6981 = (i2 - C2105.m6981("᩺ۚ")) * (-101);
                        i4 = ((iM6981 ^ i3) * 8729) ^ (-844754424);
                        i5 = -650959749;
                    } else {
                        iM6981 = C2105.m6981("ۘۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4169)) ^ (-647691828);
                        i5 = -575395749;
                    }
                    break;
                case -1458293393:
                case 61861594:
                    return false;
                case -1267439686:
                case -694610152:
                    if (C0237.f1507 != 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") + i2) * 31;
                        i4 = ((iM6981 ^ i3) * 413) ^ 917083867;
                        i5 = -1636561703;
                    } else {
                        iM6981 = C0630.m2566("ۖ֨") ^ i2;
                        i4 = ((iM6981 ^ i3) * 2869) ^ (-1734604521);
                        i5 = -1032955444;
                    }
                    break;
                case -1262491716:
                case -245466901:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = (C2105.m6981("ܰܿ") ^ i3) * (-99);
                        i4 = ((iM6981 ^ i2) * 14119) ^ (-2061025208);
                        i5 = 1693996675;
                    }
                    break;
                case -1170966503:
                case 398627423:
                    if (C1773.m5910(itM6374)) {
                        iM6981 = C0630.m2566("᩺᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32739)) ^ 433625746;
                        i5 = -1450738069;
                    } else {
                        iM6981 = C0630.m2566("۫᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-13547)) ^ 1557186569;
                        i5 = 1744443446;
                    }
                    break;
                case -781849623:
                case -655364757:
                    if (C0237.f1507 != 0) {
                        iM6981 = (i2 - C2105.m6981("᩺ۚ")) * (-101);
                        i4 = ((iM6981 ^ i3) * 8729) ^ (-844754424);
                        i5 = -650959749;
                    } else {
                        iM6981 = (C2105.m6981("ۨܽ") + i2) * (-19);
                        i4 = ((iM6981 ^ i3) * 3139) ^ 1344324495;
                        i5 = 995767486;
                    }
                    break;
                case -747591313:
                case 19111998:
                    return m48670(interfaceC8566.mo2695(), str2, hashSet);
                case -619163548:
                case 317270315:
                    if (C4075.m12263() <= 0) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = C2105.m6981("᩸ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21591) ^ (-606217273);
                        i5 = 142386019;
                    }
                    break;
                case -438431233:
                case 726800679:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") + i2) * 31;
                        i4 = ((iM6981 ^ i3) * 413) ^ 917083867;
                        i5 = -1636561703;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۬᩷")) * 71;
                        i4 = ((iM6981 ^ i2) * 91) ^ (-1703106080);
                        i5 = 1409155129;
                    }
                    break;
                case -356513978:
                case 735771790:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = C2105.m6981("᩵᩻") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4987)) ^ (-1059374769);
                        i5 = 1632828239;
                    }
                    break;
                case 63430231:
                case 1122066007:
                    interfaceC8566 = (InterfaceC8566) C4263.m12820((HashMap) this.f69168, str);
                    if (interfaceC8566 == null) {
                        iM6981 = C2105.m6981("᩸֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16809) ^ 623290787;
                        i5 = -808564807;
                    } else {
                        iM6981 = (C0630.m2566("֡ۧ") + i3) * (-105);
                        i4 = ((iM6981 ^ i2) * (-13391)) ^ 905853440;
                        i5 = -978551382;
                    }
                    break;
                case 178670368:
                case 330420093:
                    if (ServiceConnectionC3453.m10557(hashSet, str)) {
                        iM6981 = (C2105.m6981("ۙ۫") ^ i3) * (-109);
                        i4 = ((iM6981 ^ i2) * (-26273)) ^ 815435933;
                        i5 = -1867604687;
                    } else {
                        iM6981 = C2105.m6981("᩸֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16809) ^ 623290787;
                        i5 = -808564807;
                    }
                    break;
                case 387607148:
                case 1879338230:
                    return true;
                case 806714018:
                case 1349432682:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i2 - C2105.m6981("᩺ۚ")) * (-101);
                        i4 = ((iM6981 ^ i3) * 8729) ^ (-844754424);
                        i5 = -650959749;
                    } else {
                        iM6981 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12525) ^ 1721091995;
                        i5 = -368004681;
                    }
                    break;
                case 1143322790:
                case 1477851324:
                    if (!m48670((String) C2272.m7513(itM6374), str2, hashSet)) {
                        iM6981 = (C0630.m2566("۬۬") ^ i3) * (-51);
                        i4 = ((iM6981 ^ i2) * 5461) ^ 1961653375;
                        i5 = 317216169;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * (-13);
                        i4 = ((iM6981 ^ i3) * (-23325)) ^ (-1899561755);
                        i5 = -803733207;
                    }
                    break;
                case 1306032144:
                case 1558942143:
                    itM6374 = RunnableC1937.m6374(interfaceC8566.mo2699());
                    iM6981 = (C0630.m2566("۬۬") ^ i3) * (-51);
                    i4 = ((iM6981 ^ i2) * 5461) ^ 1961653375;
                    i5 = 317216169;
                    break;
                case 1721048332:
                case 1791154117:
                    if (C2272.m7503()) {
                        iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                        i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                        i5 = -1442356244;
                    } else {
                        iM6981 = (C2105.m6981("᩸۟") ^ i2) * 91;
                        i4 = ((iM6981 ^ i3) * (-5691)) ^ 2077147712;
                        i5 = -1964289985;
                    }
                    break;
                case 1741422786:
                case 2120869600:
                    C1773.m5908();
                    iM6981 = (C2105.m6981("᩺ܶ") + i2) * (-119);
                    i4 = ((iM6981 ^ i3) * (-32651)) ^ (-1586981503);
                    i5 = -1442356244;
                    break;
                default:
                    if (ViewOnClickListenerC1958.m6437(str, str2)) {
                        iM6981 = (i2 - C0630.m2566("ۘۖ")) * (-13);
                        i4 = ((iM6981 ^ i3) * (-23325)) ^ (-1899561755);
                        i5 = -803733207;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۛ") + i2) * 51;
                        i4 = ((iM6981 ^ i3) * (-12929)) ^ (-1254816170);
                        i5 = 1851764728;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0216 A[PHI: r1 r4 r9 r12 r15 r25 r30
      0x0216: PHI (r1v105 short[]) = (r1v69 short[]), (r1v82 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r4v6 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r9v6 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r12v7 int) = (r12v2 int), (r12v2 int), (r12v4 int), (r12v2 int) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r15v7 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r25v45 int) = (r25v27 int), (r25v2 int), (r25v2 int), (r25v2 int) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r30v47 short[]) = (r30v31 short[]), (r30v1 short[]), (r30v1 short[]), (r30v1 short[]) binds: [B:49:0x0214, B:34:0x0157, B:24:0x00f6, B:135:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x04a1 A[PHI: r14 r16 r17 r20 r21 r22 r25 r29 r30
      0x04a1: PHI (r14v11 int) = (r14v10 int), (r14v12 int) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r16v3 int) = (r16v2 int), (r16v4 int) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r17v3 int) = (r17v2 int), (r17v4 int) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r20v4 short[]) = (r20v3 short[]), (r20v2 short[]) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r21v4 char) = (r21v3 char), (r21v2 char) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r22v3 short) = (r22v2 short), (r22v4 short) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r25v12 short[]) = (r25v11 short[]), (r25v13 short[]) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r29v15 short[]) = (r29v14 short[]), (r29v16 short[]) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r30v12 android.content.res.Resources) = (r30v11 android.content.res.Resources), (r30v13 android.content.res.Resources) binds: [B:97:0x049f, B:93:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m48672(C8353 c8353) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM2568;
        int i5;
        short[] sArr;
        int iM2569;
        int i6;
        int i7;
        C21507 c21507 = this;
        int i8 = 1024478822;
        int i9 = C4616.f14690;
        int i10 = C3683.f11629;
        int iM6981 = (C2105.m6981("ۖۖ") ^ i9) * 57;
        int i11 = ((iM6981 ^ i10) * (-12999)) ^ (-1127697267);
        int i12 = iM6981 ^ 747219990;
        String strM12252 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        Resources resources = null;
        int i13 = 0;
        int i14 = 0;
        int iM25610 = 0;
        int iM25611 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        char c = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 0;
        String strM48669 = null;
        short[] sArr4 = null;
        int iM25612 = 0;
        String strM486610 = null;
        String string = null;
        int i22 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-25795)) >> 31));
            switch (i8) {
                case -2079454565:
                case 1424794630:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    strM12252 = C4075.m12252(f69167, 29, 3, i15);
                    if (C4616.f14690 > 0) {
                        iM2567 = (i9 - C0630.m2566("᩻᩵")) * (-119);
                        i11 = ((iM2567 ^ i10) * 25909) ^ 246084114;
                        i3 = 1016063701;
                        i4 = iM2567 ^ i3;
                        resources = resources;
                        sArr2 = sArr2;
                        i21 = i21;
                        short[] sArr5 = sArr3;
                        i12 = i4;
                        sArr3 = sArr5;
                    } else {
                        resources = resources;
                        int iM25613 = C0630.m2566("ۘۚ") ^ i10;
                        i11 = ((iM25613 ^ i9) * 18731) ^ (-1881330170);
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        i12 = iM25613 ^ 750239527;
                        i21 = i21;
                        c21507 = this;
                    }
                    break;
                case -2054999288:
                case 1866771245:
                    string = "";
                    iM2567 = (C2105.m6981("ۙᩴ") + i10) * (-11);
                    i11 = ((iM2567 ^ i9) * 25983) ^ (-776536839);
                    i3 = 330271028;
                    i4 = iM2567 ^ i3;
                    resources = resources;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr6 = sArr3;
                    i12 = i4;
                    sArr3 = sArr6;
                    break;
                case -1965222147:
                case -1125929554:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    s2 = sArr4[c];
                    i17 = s2 * s2;
                    i18 = 339628041;
                    if (C3683.m11222()) {
                        iM2566 = (C0630.m2566("ܰۤ") ^ i9) * 89;
                        i = ((iM2566 ^ i10) * (-10165)) ^ (-453138209);
                        i2 = 1951564069;
                    } else {
                        iM2566 = C0630.m2566("֫ܽ") ^ i9;
                        i = ((iM2566 ^ i10) * (-9437)) ^ (-862682902);
                        i2 = 1873946087;
                    }
                    int i23 = iM2566 ^ i2;
                    i11 = i;
                    sArr3 = sArr3;
                    resources = resources;
                    i12 = i23;
                    sArr2 = sArr2;
                    c21507 = this;
                    i21 = i21;
                    break;
                case -1888018747:
                case -1018339353:
                    sArr3 = sArr3;
                    strM486610 = c21507.m48669(string, resources.getString(2119069980 ^ iM25610));
                    i21 = i21;
                    sArr2 = sArr2;
                    iM2568 = (i9 - C0630.m2566("ۢ᩹")) * 59;
                    i11 = ((iM2568 ^ i10) * (-27959)) ^ (-1701413333);
                    i5 = 2118865324;
                    i4 = iM2568 ^ i5;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr7 = sArr3;
                    i12 = i4;
                    sArr3 = sArr7;
                    break;
                case -1822532065:
                case -161512454:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    if ((i22 & 8) != 0) {
                        iM2568 = C0630.m2566("ۘ֡") ^ i10;
                        i11 = ((iM2568 ^ i9) * 31887) ^ (-719887774);
                        i5 = -974437151;
                    } else {
                        strM48669 = strM486610;
                        iM2568 = (i10 - C0630.m2566("᩶ܺ")) * (-67);
                        i11 = ((iM2568 ^ i9) * 17003) ^ 1658237077;
                        i5 = 489214491;
                    }
                    i4 = iM2568 ^ i5;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr8 = sArr3;
                    i12 = i4;
                    sArr3 = sArr8;
                    break;
                case -1814362857:
                case 1882662084:
                    C22628.m50615();
                    if (C4117.f13076 <= 0) {
                        iM2569 = (C0630.m2566("᩸ܽ") + i9) * (-105);
                        i6 = ((iM2569 ^ i10) * 23877) ^ (-1637251135);
                        i7 = -1565520074;
                        i12 = iM2569 ^ i7;
                        i11 = i6;
                    } else {
                        sArr3 = sArr3;
                        i21 = i21;
                        sArr2 = sArr2;
                        int iM25614 = C0630.m2566("ۘۚ") ^ i10;
                        i11 = ((iM25614 ^ i9) * 18731) ^ (-1881330170);
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        i12 = iM25614 ^ 750239527;
                        i21 = i21;
                        c21507 = this;
                    }
                    break;
                case -1715858284:
                case 1717513014:
                    sArr3 = sArr3;
                    strM48669 = c21507.m48669(strM486610, resources.getString(2099612119 ^ iM25611));
                    i21 = i21;
                    sArr2 = sArr2;
                    iM2568 = (i10 - C0630.m2566("᩶ܺ")) * (-67);
                    i11 = ((iM2568 ^ i9) * 17003) ^ 1658237077;
                    i5 = 489214491;
                    i4 = iM2568 ^ i5;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr9 = sArr3;
                    i12 = i4;
                    sArr3 = sArr9;
                    break;
                case -1705548417:
                case 2060153043:
                    sArr3 = sArr3;
                    sArr2 = f69167;
                    i16 = 32;
                    i21 = 3;
                    if (C0422.f1886 > 0) {
                        int iM25615 = (i9 - C0630.m2566("᩷۠")) * 23;
                        i11 = ((iM25615 ^ i10) * (-20191)) ^ 934434106;
                        i4 = iM25615 ^ 304968560;
                        short[] sArr10 = sArr3;
                        i12 = i4;
                        sArr3 = sArr10;
                    } else {
                        sArr3 = sArr3;
                        iM2569 = C0630.m2566("᩷ۡ") ^ i10;
                        i6 = ((iM2569 ^ i9) * 27757) ^ (-1907663127);
                        i7 = 223949801;
                        i12 = iM2569 ^ i7;
                        i11 = i6;
                    }
                    break;
                case -1617113546:
                case -1270563036:
                    iM25611 = C0630.m2566(C2520.m8030(sArr3, i14, i13, i15));
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2569 = (C2105.m6981("۬ۡ") + i10) * (-99);
                        i6 = ((iM2569 ^ i9) * (-4077)) ^ (-1570105716);
                        i7 = 158692908;
                        i12 = iM2569 ^ i7;
                        i11 = i6;
                    } else {
                        i21 = i21;
                        sArr = sArr2;
                        int iM25616 = C0630.m2566("᩵ۤ") ^ i9;
                        sArr2 = sArr;
                        i11 = ((iM25616 ^ i10) * (-12063)) ^ 290734129;
                        sArr3 = sArr3;
                        i12 = iM25616 ^ 1452261643;
                        i21 = i21;
                    }
                    break;
                case -1466120610:
                case -1289074666:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    sArr4 = f69167;
                    c = 28;
                    if (C1711.f5919) {
                        iM2566 = (C0630.m2566("ܰۤ") ^ i9) * 89;
                        i = ((iM2566 ^ i10) * (-10165)) ^ (-453138209);
                        i2 = 1951564069;
                    } else {
                        iM2566 = C2105.m6981("ۗܳ") ^ i10;
                        i = ((iM2566 ^ i9) * 19921) ^ (-592734798);
                        i2 = 2119830572;
                    }
                    int i24 = iM2566 ^ i2;
                    i11 = i;
                    sArr3 = sArr3;
                    resources = resources;
                    i12 = i24;
                    sArr2 = sArr2;
                    c21507 = this;
                    i21 = i21;
                    break;
                case -1338418137:
                case 1757142209:
                    i21 = i21;
                    sArr = sArr2;
                    iM25610 = C0630.m2566(C2272.m7507(sArr, i16, i21, i15));
                    if (RunnableC1937.m6387() == 0) {
                        sArr3 = sArr3;
                        iM2568 = C2105.m6981("ۧᩳ") ^ i9;
                        sArr2 = sArr;
                        i11 = ((iM2568 ^ i10) * 14435) ^ (-304283903);
                        i5 = -1446236055;
                        i4 = iM2568 ^ i5;
                        sArr2 = sArr2;
                        i21 = i21;
                        short[] sArr11 = sArr3;
                        i12 = i4;
                        sArr3 = sArr11;
                    } else {
                        int iM25617 = C0630.m2566("᩵ۤ") ^ i9;
                        sArr2 = sArr;
                        i11 = ((iM25617 ^ i10) * (-12063)) ^ 290734129;
                        sArr3 = sArr3;
                        i12 = iM25617 ^ 1452261643;
                        i21 = i21;
                    }
                    break;
                case -1188163515:
                case -257953518:
                    C1773.m5908();
                    ServiceConnectionC3453.m10564();
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    int iM25618 = C0630.m2566("ۘۚ") ^ i10;
                    i11 = ((iM25618 ^ i9) * 18731) ^ (-1881330170);
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    i12 = iM25618 ^ 750239527;
                    i21 = i21;
                    c21507 = this;
                    break;
                case -1031839295:
                case 1182437730:
                    return strM48669;
                case -858369890:
                case 158147547:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    int i25 = s2 + s;
                    if ((i25 * i25) - i19 > 0) {
                        iM2566 = C0630.m2566("᩷᩹") ^ i10;
                        i = ((iM2566 ^ i9) * (-10729)) ^ (-979004961);
                        i2 = -2011342986;
                    } else {
                        iM2566 = (C2105.m6981("᩹֡") + i9) * 99;
                        i = ((iM2566 ^ i10) * 12729) ^ (-309054509);
                        i2 = -926699039;
                    }
                    int i26 = iM2566 ^ i2;
                    i11 = i;
                    sArr3 = sArr3;
                    resources = resources;
                    i12 = i26;
                    sArr2 = sArr2;
                    c21507 = this;
                    i21 = i21;
                    break;
                case -668374787:
                case 1838146044:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    if ((i22 & 4) != 0) {
                        iM2568 = (i10 - C0630.m2566("ܳۚ")) * 69;
                        i11 = ((iM2568 ^ i9) * 7165) ^ (-1129648918);
                        i5 = -1835912147;
                    } else {
                        strM486610 = string;
                        iM2568 = (i9 - C0630.m2566("ۢ᩹")) * 59;
                        i11 = ((iM2568 ^ i10) * (-27959)) ^ (-1701413333);
                        i5 = 2118865324;
                    }
                    i4 = iM2568 ^ i5;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr12 = sArr3;
                    i12 = i4;
                    sArr3 = sArr12;
                    break;
                case -667900472:
                case -204746453:
                    C22628.m50615();
                    C11340.m28031();
                    return null;
                case -345584180:
                case 1831339372:
                    return c21507.m48669(strM48669, resources.getString(2122012264 ^ iM25612));
                case -102905522:
                case 1605067900:
                    if (!RunnableC3474.m10630()) {
                        iM2569 = (C0630.m2566("᩸ܽ") + i9) * (-105);
                        i6 = ((iM2569 ^ i10) * 23877) ^ (-1637251135);
                        i7 = -1565520074;
                        i12 = iM2569 ^ i7;
                        i11 = i6;
                    } else {
                        i21 = i21;
                        sArr = sArr2;
                        int iM25619 = C0630.m2566("᩵ۤ") ^ i9;
                        sArr2 = sArr;
                        i11 = ((iM25619 ^ i10) * (-12063)) ^ 290734129;
                        sArr3 = sArr3;
                        i12 = iM25619 ^ 1452261643;
                        i21 = i21;
                    }
                    break;
                case 54864497:
                case 488300189:
                    if (C1916.m6308() >= 0) {
                        iM2569 = C0630.m2566("᩷ۡ") ^ i10;
                        i6 = ((iM2569 ^ i9) * 27757) ^ (-1907663127);
                        i7 = 223949801;
                        i12 = iM2569 ^ i7;
                        i11 = i6;
                    } else {
                        i21 = i21;
                        sArr = sArr2;
                        int iM256110 = C0630.m2566("᩵ۤ") ^ i9;
                        sArr2 = sArr;
                        i11 = ((iM256110 ^ i10) * (-12063)) ^ 290734129;
                        sArr3 = sArr3;
                        i12 = iM256110 ^ 1452261643;
                        i21 = i21;
                    }
                    break;
                case 62650687:
                case 1893894498:
                    iM25612 = C0630.m2566(RunnableC0588.m2436(f69167, 38, 3, i15));
                    if (C4616.f14690 <= 0) {
                        iM2569 = C0630.m2566("᩷ۡ") ^ i10;
                        i6 = ((iM2569 ^ i9) * 27757) ^ (-1907663127);
                        i7 = 223949801;
                    } else {
                        iM2569 = (i9 - C2105.m6981("ۖۨ")) * (-7);
                        i6 = ((iM2569 ^ i10) * 30851) ^ 789703321;
                        i7 = 461646258;
                    }
                    i12 = iM2569 ^ i7;
                    i11 = i6;
                    break;
                case 70432763:
                case 829185221:
                    sArr3 = f69167;
                    i14 = 35;
                    i13 = 3;
                    if (C0630.f2410 <= 0) {
                        iM2569 = C0630.m2566("᩷ۡ") ^ i10;
                        i6 = ((iM2569 ^ i9) * 27757) ^ (-1907663127);
                        i7 = 223949801;
                    } else {
                        iM2569 = C0630.m2566("ᩴ᩶") ^ i9;
                        i6 = ((iM2569 ^ i10) * 27743) ^ (-1876077853);
                        i7 = -1828966554;
                    }
                    i12 = iM2569 ^ i7;
                    i11 = i6;
                    break;
                case 477626526:
                case 919165660:
                    if ((i22 & 1088) != 0) {
                        iM2569 = C0630.m2566("ᩴۨ") ^ i10;
                        i6 = ((iM2569 ^ i9) * (-20995)) ^ 1014660136;
                        i7 = -146865626;
                    } else {
                        iM2569 = C0630.m2566("ۧ֨") ^ i9;
                        i6 = ((iM2569 ^ i10) * (-23529)) ^ (-1999198153);
                        i7 = -456891232;
                    }
                    i12 = iM2569 ^ i7;
                    i11 = i6;
                    break;
                case 493281575:
                case 858071033:
                    i15 = 24575;
                    iM2566 = C0630.m2566("ۜ۫") ^ i9;
                    i = ((iM2566 ^ i10) * (-27597)) ^ 188868786;
                    i2 = 368100457;
                    int i27 = iM2566 ^ i2;
                    i11 = i;
                    sArr3 = sArr3;
                    resources = resources;
                    i12 = i27;
                    sArr2 = sArr2;
                    c21507 = this;
                    i21 = i21;
                    break;
                case 645889459:
                case 684470098:
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    i22 = c8353.f25608;
                    if ((i20 & 2) == 0) {
                        sArr3 = sArr3;
                        int iM25620 = (i10 - C0630.m2566("۫֡")) * 25;
                        int i28 = ((iM25620 ^ i9) * (-28529)) ^ (-876033004);
                        i4 = iM25620 ^ (-1905730862);
                        i11 = i28;
                        resources = resources;
                        sArr2 = sArr2;
                        i21 = i21;
                        short[] sArr13 = sArr3;
                        i12 = i4;
                        sArr3 = sArr13;
                    } else {
                        int iM6982 = C2105.m6981("֫᩹") ^ i10;
                        i11 = ((iM6982 ^ i9) * 6749) ^ 1566121610;
                        sArr3 = sArr3;
                        i12 = iM6982 ^ (-1603555387);
                        resources = resources;
                        sArr2 = sArr2;
                        i21 = i21;
                    }
                    break;
                case 742911270:
                case 1018868035:
                    string = resources.getString(C2105.m6981(strM12252) ^ 2120483273);
                    iM2567 = (C2105.m6981("ۙᩴ") + i10) * (-11);
                    i11 = ((iM2567 ^ i9) * 25983) ^ (-776536839);
                    i3 = 330271028;
                    i4 = iM2567 ^ i3;
                    resources = resources;
                    sArr2 = sArr2;
                    i21 = i21;
                    short[] sArr14 = sArr3;
                    i12 = i4;
                    sArr3 = sArr14;
                    break;
                case 964176447:
                case 2090457209:
                    i15 = 56424;
                    iM2566 = C0630.m2566("ۜ۫") ^ i9;
                    i = ((iM2566 ^ i10) * (-27597)) ^ 188868786;
                    i2 = 368100457;
                    int i29 = iM2566 ^ i2;
                    i11 = i;
                    sArr3 = sArr3;
                    resources = resources;
                    i12 = i29;
                    sArr2 = sArr2;
                    c21507 = this;
                    i21 = i21;
                    break;
                case 1225346517:
                case 2082485058:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = resources;
                    int i30 = i17 + i18;
                    i19 = i30 + i30;
                    s = 18429;
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = (i10 - C0630.m2566("ۚ᩺")) * 69;
                        i = ((iM2566 ^ i9) * 10903) ^ 1013597970;
                        i2 = -516177574;
                        int i210 = iM2566 ^ i2;
                        i11 = i;
                        sArr3 = sArr3;
                        resources = resources;
                        i12 = i210;
                        sArr2 = sArr2;
                        c21507 = this;
                        i21 = i21;
                    } else {
                        resources = resources;
                        int iM256111 = C0630.m2566("ۘۚ") ^ i10;
                        i11 = ((iM256111 ^ i9) * 18731) ^ (-1881330170);
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        i12 = iM256111 ^ 750239527;
                        i21 = i21;
                        c21507 = this;
                    }
                    break;
                default:
                    sArr3 = sArr3;
                    i21 = i21;
                    sArr2 = sArr2;
                    resources = (Resources) c21507.f69168;
                    int i31 = c8353.f25608;
                    if (C5695.f17556 >= 0) {
                        i20 = i31;
                        int iM256112 = C0630.m2566("ۘۚ") ^ i10;
                        i11 = ((iM256112 ^ i9) * 18731) ^ (-1881330170);
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        i12 = iM256112 ^ 750239527;
                        i21 = i21;
                        c21507 = this;
                    } else {
                        int iM6983 = C2105.m6981("۟ۤ") ^ i9;
                        int i32 = ((iM6983 ^ i10) * (-12463)) ^ (-314791511);
                        int i33 = iM6983 ^ 12875926;
                        i11 = i32;
                        sArr2 = sArr2;
                        c21507 = this;
                        i21 = i21;
                        i20 = i31;
                        sArr3 = sArr3;
                        i12 = i33;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x025f A[PHI: r10 r17 r18 r19
      0x025f: PHI (r10v4 java.lang.Object[]) = (r10v2 java.lang.Object[]), (r10v2 java.lang.Object[]), (r10v3 java.lang.Object[]), (r10v2 java.lang.Object[]) binds: [B:112:0x025f, B:63:0x025d, B:32:0x0110, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:112:0x025f, B:63:0x025d, B:32:0x0110, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:112:0x025f, B:63:0x025d, B:32:0x0110, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:112:0x025f, B:63:0x025d, B:32:0x0110, B:16:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02bf A[PHI: r11 r15 r16 r26
      0x02bf: PHI (r11v9 java.lang.String) = 
      (r11v4 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
      (r11v2 java.lang.String)
     binds: [B:96:0x02bf, B:93:0x02bf, B:72:0x02bd, B:69:0x0297, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r15v7 short) = (r15v2 short), (r15v2 short), (r15v2 short), (r15v3 short), (r15v2 short) binds: [B:96:0x02bf, B:93:0x02bf, B:72:0x02bd, B:69:0x0297, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r16v10 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v6 int), (r16v2 int) binds: [B:96:0x02bf, B:93:0x02bf, B:72:0x02bd, B:69:0x0297, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r26v8 char) = (r26v3 char), (r26v3 char), (r26v4 char), (r26v3 char), (r26v3 char) binds: [B:96:0x02bf, B:93:0x02bf, B:72:0x02bd, B:69:0x0297, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f0 A[PHI: r8 r9 r21
      0x02f0: PHI (r8v5 android.content.res.Resources) = 
      (r8v2 android.content.res.Resources)
      (r8v2 android.content.res.Resources)
      (r8v4 android.content.res.Resources)
      (r8v2 android.content.res.Resources)
     binds: [B:94:0x02f0, B:76:0x02ee, B:37:0x0136, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r9v8 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:94:0x02f0, B:76:0x02ee, B:37:0x0136, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r21v4 short[]) = (r21v2 short[]), (r21v3 short[]), (r21v2 short[]), (r21v2 short[]) binds: [B:94:0x02f0, B:76:0x02ee, B:37:0x0136, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m48669(String... strArr) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        String[] strArr2 = strArr;
        int i4 = C22628.f73083;
        int i5 = RunnableC3474.f10992;
        int iM2568 = C0630.m2566("֨᩶") ^ i4;
        int i6 = ((iM2568 ^ i5) * (-13309)) ^ 1435383492;
        Resources resources = null;
        String strM11357 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2568 ^ 1645664338;
        int length = 0;
        char c = 0;
        int i8 = 0;
        int iM6981 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -825333515;
        char c2 = 0;
        String string = null;
        Object[] objArr = null;
        int i14 = 0;
        String str = null;
        String str2 = null;
        int i15 = 0;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * 13611) >> 31));
            switch (i13) {
                case -2143892947:
                case -1357547360:
                    sArr = f69167;
                    if (C1128.f4106 <= 0) {
                        iM2567 = (i5 - C2105.m6981("ܺ᩵")) * (-43);
                        i6 = ((iM2567 ^ i4) * (-21227)) ^ (-1136276280);
                        i3 = -218749270;
                    } else {
                        iM2567 = (C2105.m6981("ܰۖ") ^ i5) * 43;
                        i6 = ((iM2567 ^ i4) * (-12043)) ^ (-437248704);
                        i3 = -1538049089;
                    }
                    i7 = iM2567 ^ i3;
                    strArr2 = strArr;
                    break;
                case -1891739716:
                case 994175464:
                    objArr[1] = str;
                    sArr2 = f69167;
                    if (!RunnableC3474.m10630()) {
                        iM2567 = (C0630.m2566("᩺᩷") ^ i5) * (-37);
                        i6 = ((iM2567 ^ i4) * (-9875)) ^ (-1868909916);
                        i3 = 1198213129;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    } else {
                        iM2566 = C0630.m2566("ܶܺ") ^ i4;
                        i = ((iM2566 ^ i5) * 26563) ^ (-57207528);
                        i2 = 1138909745;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1734681210:
                case -900809056:
                    C3683.m11222();
                    return null;
                case -1651884972:
                case -1450214265:
                    return str2;
                case -1641322183:
                case -388557750:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("۟ۛ") + i4) * (-57);
                        i = ((iM2566 ^ i5) * 25019) ^ 1748416814;
                        i2 = -639988700;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (i4 - C0630.m2566("ۗۡ")) * (-47);
                        i6 = ((iM2567 ^ i5) * (-29697)) ^ 327463832;
                        i3 = 1732044039;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    }
                    break;
                case -1490982219:
                case 1388580229:
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 25210441;
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C0630.m2566("۬᩶") + i5) * 9;
                        i = ((iM2566 ^ i4) * 18861) ^ 1183905722;
                        i2 = -1157166385;
                    } else {
                        iM2566 = C2105.m6981("ۢ᩹") ^ i5;
                        i = ((iM2566 ^ i4) * 9017) ^ (-767815173);
                        i2 = 957801381;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1436459345:
                case -644346019:
                    if (C5695.f17556 >= 0) {
                        iM2567 = (i5 - C2105.m6981("ܺ᩵")) * (-43);
                        i6 = ((iM2567 ^ i4) * (-21227)) ^ (-1136276280);
                        i3 = -218749270;
                    } else {
                        iM2567 = (i4 - C0630.m2566("ۗۡ")) * (-47);
                        i6 = ((iM2567 ^ i5) * (-29697)) ^ 327463832;
                        i3 = 1732044039;
                    }
                    i7 = iM2567 ^ i3;
                    strArr2 = strArr;
                    break;
                case -1397902814:
                case -510895995:
                    i15++;
                    str2 = string;
                    iM2566 = C2105.m6981("ۡܿ") ^ i4;
                    i = ((iM2566 ^ i5) * 1031) ^ 44026069;
                    i2 = 2080047540;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1253821238:
                case 2084898894:
                    if (!RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۬᩶") + i5) * 9;
                        i = ((iM2566 ^ i4) * 18861) ^ 1183905722;
                        i2 = -1157166385;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (i5 - C2105.m6981("ܺ᩵")) * (-43);
                        i6 = ((iM2567 ^ i4) * (-21227)) ^ (-1136276280);
                        i3 = -218749270;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    }
                    break;
                case -1251074768:
                case -525670108:
                    s = sArr[c2];
                    int i16 = s + 5021;
                    if (C4159.f13567) {
                        int iM2569 = (i4 - C0630.m2566("᩻᩶")) * (-99);
                        i7 = iM2569 ^ 2025327597;
                        i9 = i16;
                        i6 = ((iM2569 ^ i5) * 12571) ^ 537744887;
                    } else {
                        i9 = i16;
                        iM2567 = (i4 - C0630.m2566("ۗۡ")) * (-47);
                        i6 = ((iM2567 ^ i5) * (-29697)) ^ 327463832;
                        i3 = 1732044039;
                        i7 = iM2567 ^ i3;
                    }
                    strArr2 = strArr;
                    break;
                case -1100943980:
                case 1931362876:
                    i8 = 9026;
                    iM2566 = C2105.m6981("֨ۨ") ^ i4;
                    i = ((iM2566 ^ i5) * 27679) ^ (-1509706835);
                    i2 = -943873947;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -744341344:
                case 1493017211:
                    str = strArr2[i15];
                    if (C1916.m6313(str)) {
                        string = str2;
                        iM2566 = C2105.m6981("ܳ᩶") ^ i5;
                        i = ((iM2566 ^ i4) * 21421) ^ (-2003063922);
                        i2 = -850950612;
                    } else {
                        iM2566 = C2105.m6981("᩶۟") ^ i5;
                        i = ((iM2566 ^ i4) * 1145) ^ (-2082092103);
                        i2 = 107958595;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -704150938:
                case 487112100:
                    c2 = 20;
                    if (C3911.m11924() <= 0) {
                        iM2567 = (i4 - C0630.m2566("ۗۡ")) * (-47);
                        i6 = ((iM2567 ^ i5) * (-29697)) ^ 327463832;
                        i3 = 1732044039;
                    } else {
                        iM2567 = C0630.m2566("ۢ᩶") ^ i5;
                        i6 = ((iM2567 ^ i4) * (-25911)) ^ 56399102;
                        i3 = -729530551;
                    }
                    i7 = iM2567 ^ i3;
                    strArr2 = strArr;
                    break;
                case -597250060:
                case 1864584347:
                    objArr = new Object[i14];
                    objArr[c] = str2;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C0630.m2566("۬᩶") + i5) * 9;
                        i = ((iM2566 ^ i4) * 18861) ^ 1183905722;
                        i2 = -1157166385;
                    } else {
                        iM2566 = (i5 - C2105.m6981("۬ۨ")) * (-51);
                        i = ((iM2566 ^ i4) * 19099) ^ (-875975618);
                        i2 = -245665407;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -376812710:
                case -26800267:
                    iM6981 = C2105.m6981(strM11357);
                    if (C11340.f33930 < 0) {
                        iM2566 = C0630.m2566("ۨܳ") ^ i4;
                        i = ((iM2566 ^ i5) * (-20233)) ^ 140587872;
                        i2 = 1845625649;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (C0630.m2566("᩺᩷") ^ i5) * (-37);
                        i6 = ((iM2567 ^ i4) * (-9875)) ^ (-1868909916);
                        i3 = 1198213129;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    }
                    break;
                case -228716346:
                case 2041950169:
                    c = 0;
                    i15 = 0;
                    str2 = "";
                    length = strArr2.length;
                    iM2566 = C2105.m6981("ۡܿ") ^ i4;
                    i = ((iM2566 ^ i5) * 1031) ^ 44026069;
                    i2 = 2080047540;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 6992403:
                case 1689715249:
                    resources = (Resources) this.f69168;
                    if (C2958.f9394 >= 0) {
                        i14 = 2;
                        iM2567 = (i5 - C2105.m6981("ܺ᩵")) * (-43);
                        i6 = ((iM2567 ^ i4) * (-21227)) ^ (-1136276280);
                        i3 = -218749270;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    } else {
                        int iM6982 = (C2105.m6981("ۖۖ") ^ i4) * (-123);
                        i6 = ((iM6982 ^ i5) * 25841) ^ 1291074317;
                        i7 = iM6982 ^ (-941386533);
                        i14 = 2;
                    }
                    break;
                case 9326801:
                case 1736878023:
                    if (C4263.m12824(str2)) {
                        string = str;
                        iM2566 = C2105.m6981("ܳ᩶") ^ i5;
                        i = ((iM2566 ^ i4) * 21421) ^ (-2003063922);
                        i2 = -850950612;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        int iM6983 = C2105.m6981("᩷᩻") ^ i4;
                        i6 = ((iM6983 ^ i5) * 32077) ^ 246646272;
                        i7 = iM6983 ^ 898300436;
                    }
                    break;
                case 80683541:
                case 2135924784:
                    C4263.m12819();
                    iM2566 = (C0630.m2566("۬᩶") + i5) * 9;
                    i = ((iM2566 ^ i4) * 18861) ^ 1183905722;
                    i2 = -1157166385;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 635577915:
                case 1475680127:
                    if (C3663.f11553) {
                        iM2567 = (C0630.m2566("᩺᩷") ^ i5) * (-37);
                        i6 = ((iM2567 ^ i4) * (-9875)) ^ (-1868909916);
                        i3 = 1198213129;
                    } else {
                        iM2567 = (C2105.m6981("ۜܳ") + i4) * 45;
                        i6 = ((iM2567 ^ i5) * 23389) ^ 808966606;
                        i3 = -702832110;
                    }
                    i7 = iM2567 ^ i3;
                    strArr2 = strArr;
                    break;
                case 917483483:
                case 1267852263:
                    i8 = 23266;
                    iM2566 = C2105.m6981("֨ۨ") ^ i4;
                    i = ((iM2566 ^ i5) * 27679) ^ (-1509706835);
                    i2 = -943873947;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1008431532:
                case 1310251817:
                    if (i15 < length) {
                        iM2566 = (C2105.m6981("ᩳ۟") + i4) * 57;
                        i = ((iM2566 ^ i5) * (-10125)) ^ 791612597;
                        i2 = -739844265;
                    } else {
                        iM2566 = C0630.m2566("᩺ۡ") ^ i5;
                        i = ((iM2566 ^ i4) * (-32211)) ^ 1465707046;
                        i2 = -60568994;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 1053204752:
                case 1979810326:
                    strM11357 = C3746.m11357(sArr2, 21, 3, i8);
                    if (C2167.f7158 < 0) {
                        iM2566 = C0630.m2566("ᩴ᩻") ^ i5;
                        i = ((iM2566 ^ i4) * 12655) ^ 1673936648;
                        i2 = -1618047905;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM2567 = (i4 - C0630.m2566("ۗۡ")) * (-47);
                        i6 = ((iM2567 ^ i5) * (-29697)) ^ 327463832;
                        i3 = 1732044039;
                        i7 = iM2567 ^ i3;
                        strArr2 = strArr;
                    }
                    break;
                case 1492959711:
                case 2093662517:
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) > 0) {
                        iM2566 = C0630.m2566("ۜ᩻") ^ i5;
                        i = ((iM2566 ^ i4) * (-26387)) ^ 1754004161;
                        i2 = 712753493;
                    } else {
                        iM2566 = C2105.m6981("ۖۘ") ^ i4;
                        i = ((iM2566 ^ i5) * 13639) ^ (-497322372);
                        i2 = 1191026205;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    string = resources.getString(2116537367 ^ iM6981, objArr);
                    iM2566 = C2105.m6981("ܳ᩶") ^ i5;
                    i = ((iM2566 ^ i4) * 21421) ^ (-2003063922);
                    i2 = -850950612;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }
}
