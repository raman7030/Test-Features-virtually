package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.text.DateFormat;
import java.util.Date;
import moe.shizuku.server.IShizukuService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12592 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܽ᩻ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f37974 = {4391, -1906, -9581, 4532, 382, -411, 3269, -8916, 1400, 1687, -6448, -3388, 2014, -30697, -30704, -30711, -30720, -30698, -30669, -30708, -30720, -30702, -30708, -30709, -30717, -30710, -30697, -30720, -30698, -30704, -30711, -30703, -30708, -30703, -30720, -30712, -30698, -30718, -30720, -30703, -30673, -30666, -30678, -30677, -30678, -30713, -30705, -30720, -30714, -30703, -30643, -30645, -30645, -30645, -30644, -30701, -30716, -30711, -30708, -30719, -30703, -30692, -30699, -30720, -30671, -30720, -30691, -30703, -30703, -30708, -30712, -30720, -6987, -9284, 3166, -12265, 4985, 1959, -2633, 56, -1779, -10886, -8176, -5424, -30697, -30720, -30716, -30698, -30710, -30709, -30671, -30720, -30691, -30703, -30708, -30709, -30701, -30716, -30711, -30708, -30719, -30671, -30708, -30712, -30720, -30651, -30510, -30651, -1714, 25, 7253, -30699, -30710, -30708, -30709, -30703, -30698, -30642, -7823, -3828, 1447, 9187, 19321, -19936, -19314, 22190, 25736, 23276, 4000, -17863, -17874, -17875, -17863, -17874, -17864, -17885, -17913, -17878, -17870, -17884, -17858, -17857};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public JSONObject f37975;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6242 f37976;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37977;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f37978;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f37979;

    public C12592(ActivityC6242 activityC6242, int i) {
        int i2 = 1753158234;
        int i3 = C3019.f9544;
        int i4 = C1294.f4556;
        this.f37976 = activityC6242;
        this.f37977 = i;
        int iM6981 = (C2105.m6981("ܺ۫") + i3) * 51;
        int i5 = ((iM6981 ^ i4) * 11213) ^ (-1543218301);
        int i6 = 1415973155;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i4) * 19335) >> 31));
            switch (i2) {
                case -1813657217:
                case 420706364:
                    C5695.m16023();
                    throw new RuntimeException();
                case -1094705429:
                case 54162928:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C2105.m6981("ۘ᩻") ^ i3;
                        i5 = ((iM6981 ^ i4) * 21675) ^ 1336240858;
                        i6 = -620121661;
                    } else {
                        iM6981 = C0630.m2566("ۙ᩸") ^ i3;
                        i5 = ((iM6981 ^ i4) * 27287) ^ (-217572093);
                        i6 = -1757879712;
                    }
                    break;
                case -945315487:
                case 1656851413:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("֨ۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-9053)) ^ 1132031531;
                        i6 = 1116901416;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖۡ")) * 5;
                        i5 = ((iM6981 ^ i4) * (-1127)) ^ (-1253666870);
                        i6 = -334445190;
                    }
                    break;
                case -308637651:
                case 879729913:
                    C3683.m11222();
                    if (C2105.f7037 == 0) {
                        iM6981 = (i3 - C0630.m2566("ۖۡ")) * 5;
                        i5 = ((iM6981 ^ i4) * (-1127)) ^ (-1253666870);
                        i6 = -334445190;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۗ۫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i3) * (-28679)) ^ 466475682;
                        i6 = -42240795;
                    }
                    break;
                case 748073803:
                case 1211346627:
                    RunnableC0588.m2441();
                    C4263.m12819();
                    iM6981 = (i4 - C0630.m2566("ۗ۫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i5 = ((iM6981 ^ i3) * (-28679)) ^ 466475682;
                    i6 = -42240795;
                    break;
                case 917034640:
                case 958920546:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (i4 - C0630.m2566("ۗ۫")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((iM6981 ^ i3) * (-28679)) ^ 466475682;
                        i6 = -42240795;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۠ܰ")) * 39;
                        i5 = ((iM6981 ^ i3) * 17169) ^ (-821972535);
                        i6 = -923550840;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[PHI: r12
      0x0089: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:27:0x0087, B:19:0x006d, B:17:0x006a, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0293 A[PHI: r5 r8 r16
      0x0293: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:72:0x0291, B:68:0x0276, B:56:0x01ff, B:51:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:72:0x0291, B:68:0x0276, B:56:0x01ff, B:51:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v8 l.۫ۤۧ) = (r16v3 l.۫ۤۧ), (r16v4 l.۫ۤۧ), (r16v7 l.۫ۤۧ), (r16v9 l.۫ۤۧ) binds: [B:72:0x0291, B:68:0x0276, B:56:0x01ff, B:51:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02c6 A[PHI: r2 r4 r6 r7 r16
      0x02c6: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:76:0x02c4, B:60:0x0220, B:15:0x0061, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short) binds: [B:76:0x02c4, B:60:0x0220, B:15:0x0061, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:76:0x02c4, B:60:0x0220, B:15:0x0061, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v4 short) binds: [B:76:0x02c4, B:60:0x0220, B:15:0x0061, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x02c6: PHI (r16v23 l.۫ۤۧ) = (r16v2 l.۫ۤۧ), (r16v6 l.۫ۤۧ), (r16v19 l.۫ۤۧ), (r16v24 l.۫ۤۧ) binds: [B:76:0x02c4, B:60:0x0220, B:15:0x0061, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        int iM6981;
        int i;
        int i2;
        int i3 = ServiceConnectionC3453.f10921;
        int i4 = C0630.f2410;
        int iM2566 = (i3 - C0630.m2566("᩷ۤ")) * (-41);
        int i5 = ((iM2566 ^ i4) * 2073) ^ (-481685088);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 196203931;
        C12346 c12346 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1011765141;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-6575)) >> 31));
            switch (i13) {
                case -2087745583:
                case -1917583135:
                    c12346 = c12346;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i4 - C0630.m2566("᩺ۚ")) * 49;
                        i = ((iM6981 ^ i3) * 29089) ^ 629366512;
                        i2 = -1038489428;
                    } else {
                        iM6981 = C2105.m6981("ᩳܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-9989)) ^ (-223112782);
                        i2 = 829782880;
                    }
                    C12346 c12347 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c12347;
                    break;
                case -1941250142:
                case 655358710:
                    c12346 = c12346;
                    sArr2 = f37974;
                    i11 = 129;
                    if (C1773.m5908() <= 0) {
                        iM6981 = C0630.m2566("֡ۚ") ^ i3;
                        i = ((iM6981 ^ i4) * (-16627)) ^ (-1491401937);
                        i2 = 448472749;
                    } else {
                        iM6981 = C0630.m2566("ۢۧ") ^ i4;
                        i = ((iM6981 ^ i3) * 10381) ^ (-1794250567);
                        i2 = -2145942237;
                    }
                    C12346 c12348 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c12348;
                    break;
                case -1922492875:
                case 125822462:
                    c12346 = c12346;
                    sArr = f37974;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۗۨ")) * (-115);
                        i = ((iM6981 ^ i3) * (-25359)) ^ 101604781;
                        i2 = 1018436260;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۤ۫")) * (-21);
                        i = ((iM6981 ^ i3) * 19439) ^ 2045166011;
                        i2 = 201453956;
                    }
                    C12346 c12349 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c12349;
                    break;
                case -1725527446:
                case -1665438740:
                    if (C3019.f9544 < 0) {
                        iM6981 = (i4 - C2105.m6981("ܶܺ")) * (-51);
                        c12346 = c12346;
                        i = ((iM6981 ^ i3) * (-10863)) ^ (-1770535689);
                        i2 = -531485988;
                    } else {
                        c12346 = c12346;
                        iM6981 = (i3 - C0630.m2566("֫᩸")) * (-15);
                        i = ((iM6981 ^ i4) * 4917) ^ 1084112854;
                        i2 = 1389776171;
                    }
                    C12346 c123410 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123410;
                    break;
                case -1426203273:
                case 1330788920:
                    if (C4075.f12947 >= 0) {
                        c12346 = c12346;
                        iM6981 = (i4 - C2105.m6981("ۗۨ")) * (-115);
                        i = ((iM6981 ^ i3) * (-25359)) ^ 101604781;
                        i2 = 1018436260;
                        C12346 c123411 = c12346;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        c12346 = c123411;
                    }
                    c12346 = c12346;
                    iM6981 = C0630.m2566("֡ۚ") ^ i3;
                    i = ((iM6981 ^ i4) * (-16627)) ^ (-1491401937);
                    i2 = 448472749;
                    C12346 c123412 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123412;
                    break;
                case -1353348396:
                case 139438683:
                    c12346 = c12346;
                    if (m30859()) {
                        iM6981 = (i4 - C2105.m6981("᩻֫")) * 63;
                        i = ((iM6981 ^ i3) * (-401)) ^ 1135210830;
                        i2 = 954250189;
                    } else {
                        iM6981 = (C2105.m6981("ܿۘ") ^ i4) * (-89);
                        i = ((iM6981 ^ i3) * 24161) ^ (-1226708950);
                        i2 = 734266156;
                    }
                    C12346 c123413 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123413;
                    break;
                case -1202537141:
                case 605474112:
                    c12346 = c12346;
                    i9 = s * s2;
                    if (RunnableC3474.m10630()) {
                        iM6981 = C2105.m6981("᩵ۛ") ^ i4;
                        i = ((iM6981 ^ i3) * 16221) ^ 1020111728;
                        i2 = -1494941480;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺ۚ")) * 49;
                        i = ((iM6981 ^ i3) * 29089) ^ 629366512;
                        i2 = -1038489428;
                    }
                    C12346 c123414 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123414;
                    break;
                case -1049797360:
                case 475429475:
                    c12346 = c12346;
                    i7 = s + 1;
                    if (C0964.f3626 != 0) {
                        iM6981 = (i4 - C0630.m2566("᩺ۚ")) * 49;
                        i = ((iM6981 ^ i3) * 29089) ^ 629366512;
                        i2 = -1038489428;
                    } else {
                        iM6981 = (C2105.m6981("ܿᩳ") + i4) * (-115);
                        i = ((iM6981 ^ i3) * (-4297)) ^ 980966144;
                        i2 = 389947064;
                    }
                    C12346 c123415 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123415;
                    break;
                case -808566235:
                case 2012052782:
                    c12346 = c12346;
                    s = sArr[c];
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۗۨ")) * (-115);
                        i = ((iM6981 ^ i3) * (-25359)) ^ 101604781;
                        i2 = 1018436260;
                    } else {
                        iM6981 = (C0630.m2566("۫᩺") ^ i3) * 21;
                        i = ((iM6981 ^ i4) * 29287) ^ 528339080;
                        i2 = -1322374373;
                    }
                    C12346 c123416 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123416;
                    break;
                case -752870450:
                case -626543072:
                    i12 = 13;
                    if (C0237.f1507 != 0) {
                        iM6981 = (i4 - C2105.m6981("ܶܺ")) * (-51);
                        c12346 = c12346;
                        i = ((iM6981 ^ i3) * (-10863)) ^ (-1770535689);
                        i2 = -531485988;
                    } else {
                        c12346 = c12346;
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i = ((iM6981 ^ i4) * (-21671)) ^ (-1020103841);
                        i2 = -2105792675;
                    }
                    C12346 c123417 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123417;
                    break;
                case -578702020:
                case 546455792:
                    c12346 = c12346;
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i4 - C0630.m2566("᩺ۚ")) * 49;
                        i = ((iM6981 ^ i3) * 29089) ^ 629366512;
                        i2 = -1038489428;
                    } else {
                        iM6981 = C2105.m6981("֨ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * 22851) ^ 308282178;
                        i2 = -1531467863;
                    }
                    C12346 c123418 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123418;
                    break;
                case -327412523:
                case 552174924:
                    c12346.m29958(false);
                    return;
                case -212744009:
                case -109456434:
                    i10 = 48963;
                    iM6981 = (C2105.m6981("᩺ۛ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM6981 ^ i4) * 32565) ^ 1236421026;
                    i2 = 1874840715;
                    C12346 c123419 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c123419;
                    break;
                case -162765180:
                case 1599069192:
                    C0798.m2998();
                    iM6981 = (i4 - C2105.m6981("ܶܺ")) * (-51);
                    c12346 = c12346;
                    i = ((iM6981 ^ i3) * (-10863)) ^ (-1770535689);
                    i2 = -531485988;
                    C12346 c1234110 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234110;
                    break;
                case -61418344:
                case 980525464:
                    c12346 = c12346;
                    if (i8 - (i9 + 1) >= 0) {
                        iM6981 = C0630.m2566("֡ᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * (-29299)) ^ 56240545;
                        i2 = 1068706602;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗ᩹")) * 45;
                        i = ((iM6981 ^ i4) * 26073) ^ 1535932777;
                        i2 = 1578492952;
                    }
                    C12346 c1234111 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234111;
                    break;
                case -33030534:
                case 1939940497:
                    c12346 = c12346;
                    c = 128;
                    if (C0382.f1805) {
                        iM6981 = (C0630.m2566("ܶܰ") ^ i3) * (-11);
                        i = ((iM6981 ^ i4) * (-16791)) ^ (-1178702273);
                        i2 = 514614391;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֫᩸")) * (-15);
                        i = ((iM6981 ^ i4) * 4917) ^ 1084112854;
                        i2 = 1389776171;
                    }
                    C12346 c1234112 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234112;
                    break;
                case 4131204:
                case 1854446867:
                    C22628.m50610(C2520.m8030(sArr2, i11, i12, i10));
                    throw null;
                case 247227590:
                case 1188297019:
                    C0483.m2121();
                    return;
                case 546104790:
                case 1393107253:
                    return;
                case 967820783:
                case 1751108359:
                    ActivityC6242 activityC6242 = this.f37976;
                    activityC6242.f19314 = false;
                    c12346 = activityC6242.f19312;
                    if (c12346 != null) {
                        int iM6982 = (i3 - C2105.m6981("ۢۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM6982 ^ i4) * (-22569)) ^ 988359403;
                        i6 = iM6982 ^ 1812399060;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩺") ^ i3;
                        c12346 = c12346;
                        i = ((iM6981 ^ i4) * (-19885)) ^ (-316870588);
                        i2 = 1623090260;
                        C12346 c1234113 = c12346;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        c12346 = c1234113;
                    }
                    break;
                case 1203352255:
                case 1694698655:
                    i10 = 47691;
                    iM6981 = (C2105.m6981("᩺ۛ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM6981 ^ i4) * 32565) ^ 1236421026;
                    i2 = 1874840715;
                    C12346 c1234114 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234114;
                    break;
                case 1377091913:
                case 2119354229:
                    C1047.m3599();
                    if (C0237.f1507 != 0) {
                        iM6981 = (i4 - C2105.m6981("ܶܺ")) * (-51);
                        c12346 = c12346;
                        i = ((iM6981 ^ i3) * (-10863)) ^ (-1770535689);
                        i2 = -531485988;
                    } else {
                        c12346 = c12346;
                        iM6981 = C0630.m2566("֡ۚ") ^ i3;
                        i = ((iM6981 ^ i4) * (-16627)) ^ (-1491401937);
                        i2 = 448472749;
                    }
                    C12346 c1234115 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234115;
                    break;
                default:
                    c12346 = c12346;
                    i8 = i7 * i7;
                    s2 = 2;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (i4 - C2105.m6981("ۗۨ")) * (-115);
                        i = ((iM6981 ^ i3) * (-25359)) ^ 101604781;
                        i2 = 1018436260;
                    } else {
                        iM6981 = C0630.m2566("ۚ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-24639)) ^ (-1484245832);
                        i2 = 1420137342;
                    }
                    C12346 c1234116 = c12346;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    c12346 = c1234116;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30858(C12592 c12592, ActivityC6242 activityC6242, ScrollView scrollView) {
        int i = -760790883;
        int i2 = C3911.f12484;
        int i3 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (i2 - C2105.m6981("ܿ֡")) * (-103);
        int i4 = ((iM6981 ^ i3) * (-6691)) ^ 558870765;
        int i5 = -1955963655;
        while (true) {
            i = ((((i ^ i3) * (-26287)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1941369410:
                case 1681487623:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6835)) ^ 1494052623;
                        i5 = 700755376;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۘۘ")) * (-15);
                        i4 = ((iM6981 ^ i2) * 26503) ^ (-772004174);
                        i5 = -187483721;
                    }
                    break;
                case -1852698910:
                case 1345413619:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("֨᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4631) ^ 522092314;
                        i5 = 1254526235;
                    } else {
                        iM6981 = (C2105.m6981("ᩴۗ") + i3) * (-27);
                        i4 = ((iM6981 ^ i2) * (-25951)) ^ (-514604233);
                        i5 = -1267443191;
                    }
                    break;
                case -1788446926:
                case 518381821:
                    C3683.m11222();
                    if (!C1005.f3721) {
                        iM6981 = (C2105.m6981("ᩳܿ") + i2) * 57;
                        i4 = ((iM6981 ^ i3) * (-10843)) ^ (-576089038);
                        i5 = 294771276;
                    } else {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    }
                    break;
                case -1585412955:
                case 1303975922:
                    scrollView.scrollTo(0, activityC6242.f19318);
                    activityC6242.f19318 = -1;
                    iM6981 = C0630.m2566("᩸ܳ") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-30193)) ^ (-976373620);
                    i5 = 379367622;
                    break;
                case -1448910321:
                case 544753882:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    } else {
                        iM6981 = C2105.m6981("֫ܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10669) ^ 2083060016;
                        i5 = 1789566276;
                    }
                    break;
                case -1416486325:
                case 839404491:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (C2105.m6981("ۨ᩷") ^ i2) * (-27);
                        i4 = ((iM6981 ^ i3) * (-4391)) ^ 64755344;
                        i5 = -155161227;
                    } else {
                        iM6981 = (C0630.m2566("ܿۧ") ^ i2) * (-121);
                        i4 = ((iM6981 ^ i3) * 27205) ^ (-1447548978);
                        i5 = -1390781636;
                    }
                    break;
                case -1106252223:
                case 2027584821:
                    C0237.m1481();
                    break;
                case -1105241141:
                case -468828031:
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("֨᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4631) ^ 522092314;
                        i5 = 1254526235;
                    } else {
                        iM6981 = (C2105.m6981("᩸ᩳ") ^ i3) * 73;
                        i4 = ((iM6981 ^ i2) * (-18867)) ^ 916253680;
                        i5 = -585450250;
                    }
                    break;
                case -870877376:
                case 1405741910:
                    if (C0964.f3626 != 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    } else {
                        iM6981 = C0630.m2566("֡۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1653)) ^ (-1765234914);
                        i5 = 49140682;
                    }
                    break;
                case -647375428:
                case 1506636930:
                    if (activityC6242.f19318 >= 0) {
                        iM6981 = C2105.m6981("ܽۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14559) ^ 663542975;
                        i5 = -173815896;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30193)) ^ (-976373620);
                        i5 = 379367622;
                    }
                    break;
                case -620265334:
                case 1396191415:
                    C2272.m7503();
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("֨᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4631) ^ 522092314;
                        i5 = 1254526235;
                    } else {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    }
                    break;
                case -498500079:
                case -35279588:
                    if (c12592.m30859()) {
                        iM6981 = (C2105.m6981("ܳᩳ") ^ i3) * (-13);
                        i4 = ((iM6981 ^ i2) * (-32411)) ^ 1811060606;
                        i5 = 1667099369;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30193)) ^ (-976373620);
                        i5 = 379367622;
                    }
                    break;
                case -450556816:
                case -204481668:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    } else {
                        iM6981 = C0630.m2566("֫۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19683)) ^ (-560153740);
                        i5 = -1497847428;
                    }
                    break;
                case -368061483:
                case 1933780983:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-2865)) ^ (-585336162);
                        i5 = -477413396;
                    } else {
                        iM6981 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 24221) ^ 672804406;
                        i5 = 625301321;
                    }
                    break;
                case -260264600:
                case 1952074771:
                    break;
                case -224674849:
                case 1139554869:
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6835)) ^ 1494052623;
                        i5 = 700755376;
                    } else {
                        iM6981 = (C0630.m2566("ܽۤ") + i2) * 33;
                        i4 = ((iM6981 ^ i3) * (-25223)) ^ 2102925598;
                        i5 = 1048581568;
                    }
                    break;
                case 90752270:
                case 1567493547:
                    C0630.m2564();
                    RunnableC1937.m6387();
                    iM6981 = (C2105.m6981("ᩳܿ") + i2) * 57;
                    i4 = ((iM6981 ^ i3) * (-10843)) ^ (-576089038);
                    i5 = 294771276;
                    break;
                case 512163330:
                case 1902517638:
                    if (C2105.m6982() != 0) {
                        iM6981 = C2105.m6981("ۙ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6835)) ^ 1494052623;
                        i5 = 700755376;
                    } else {
                        iM6981 = C0630.m2566("᩵ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-25903)) ^ 1776022819;
                        i5 = -1255541180;
                    }
                    break;
                default:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C2105.m6981("ۨ᩷") ^ i2) * (-27);
                        i4 = ((iM6981 ^ i3) * (-4391)) ^ 64755344;
                        i5 = -155161227;
                    } else {
                        iM6981 = C0630.m2566("֨᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 4631) ^ 522092314;
                        i5 = 1254526235;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f6 A[PHI: r6
      0x00f6: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:30:0x00f4, B:12:0x0074, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0166  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ab A[PHI: r5
      0x01ab: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:47:0x01a9, B:15:0x007f, B:12:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0250 A[PHI: r7 r8 r15 r24
      0x0250: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:59:0x024e, B:26:0x00cb, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:59:0x024e, B:26:0x00cb, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r15v4 short) = (r15v3 short), (r15v2 short), (r15v2 short) binds: [B:59:0x024e, B:26:0x00cb, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r24v5 int) = (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:59:0x024e, B:26:0x00cb, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02a3 A[PHI: r2 r3 r4 r10 r11 r12 r13 r18 r19
      0x02a3: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r3v4 l.ۛᩴۡ) = (r3v2 l.ۛᩴۡ), (r3v2 l.ۛᩴۡ), (r3v3 l.ۛᩴۡ), (r3v2 l.ۛᩴۡ), (r3v2 l.ۛᩴۡ) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r4v5 android.widget.ScrollView) = 
      (r4v2 android.widget.ScrollView)
      (r4v2 android.widget.ScrollView)
      (r4v2 android.widget.ScrollView)
      (r4v4 android.widget.ScrollView)
      (r4v2 android.widget.ScrollView)
     binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v5 short[]) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:67:0x02a1, B:63:0x0285, B:43:0x0185, B:22:0x00a4, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02d5 A[PHI: r16 r17
      0x02d5: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02d3, B:17:0x0083, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:71:0x02d3, B:17:0x0083, B:15:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int i3 = C0422.f1886;
        int i4 = AbstractC2021.f6743;
        int iM2566 = (C0630.m2566("ۤۢ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
        int i5 = ((iM2566 ^ i3) * 13289) ^ 610160183;
        ScrollView scrollView = null;
        String strM8030 = null;
        short[] sArr = null;
        int i6 = iM2566 ^ 982038269;
        int iM6982 = 0;
        int iM6983 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        char c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1444570176;
        int i13 = 0;
        ActivityC6242 activityC6242 = null;
        short[] sArr2 = null;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-3619)) >> 31));
            switch (i12) {
                case -2064144952:
                case -56110678:
                    C11340.m28031();
                    if (C21923.m49329()) {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 16527) ^ 1468992010;
                        i2 = -1657558530;
                    } else {
                        iM6981 = (C2105.m6981("ۘ᩺") + i4) * (-67);
                        i = ((iM6981 ^ i3) * (-20513)) ^ 1491580076;
                        i2 = 1053282584;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2049418127:
                case -952010033:
                    C3537.m10746();
                    iM6981 = (C2105.m6981("ۘ᩺") + i4) * (-67);
                    i = ((iM6981 ^ i3) * (-20513)) ^ 1491580076;
                    i2 = 1053282584;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1994410197:
                case 1352915987:
                    int i16 = i10 + i11;
                    i13 = i16 + i16;
                    s2 = 17672;
                    if (C0237.m1481() >= 0) {
                        iM6981 = C2105.m6981("᩹֨") ^ i4;
                        i = ((iM6981 ^ i3) * (-20779)) ^ (-125718923);
                        i2 = 503046875;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩷᩷")) * (-67);
                        i = ((iM6981 ^ i3) * 23917) ^ 1138819434;
                        i2 = -1764271667;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1951020762:
                case -878559790:
                    ViewTreeObserverOnPreDrawListenerC14493.m34591(scrollView, new RunnableC13297(this, activityC6242, scrollView));
                    iM6981 = C2105.m6981("᩸ۡ") ^ i3;
                    i = ((iM6981 ^ i4) * 19325) ^ (-777938081);
                    i2 = 1769736712;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1906547905:
                case 592215219:
                    if (C0964.m3409(activityC6242, i14).getVisibility() == 0) {
                        iM6981 = C2105.m6981("᩺֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-3267)) ^ 1331067482;
                        i2 = -1805800872;
                    } else {
                        iM6981 = C2105.m6981("᩸ۡ") ^ i3;
                        i = ((iM6981 ^ i4) * 19325) ^ (-777938081);
                        i2 = 1769736712;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1901344412:
                case 362812746:
                    i10 = s * s;
                    i11 = 312299584;
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("۟ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 8659) ^ (-1448592846);
                        i2 = 51978170;
                    } else {
                        iM6981 = C2105.m6981("᩸ܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 30859) ^ 1006523640;
                        i2 = -1846030360;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1820146022:
                case 1996025186:
                    i7 = 14799;
                    iM6981 = C2105.m6981("ܰܳ") ^ i4;
                    i = ((iM6981 ^ i3) * 18247) ^ 1550818159;
                    i2 = -610643782;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1481773731:
                case -748082239:
                    i14 = iM6982 ^ 2127173881;
                    activityC6242 = this.f37976;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("۟ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 8659) ^ (-1448592846);
                        i2 = 51978170;
                    } else {
                        iM6981 = C0630.m2566("ۢ۬") ^ i4;
                        i = ((iM6981 ^ i3) * (-23175)) ^ 1993984260;
                        i2 = -654954250;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1295457001:
                case -1024188502:
                    if (activityC6242.f19318 < 0) {
                        iM6981 = C2105.m6981("᩸ۡ") ^ i3;
                        i = ((iM6981 ^ i4) * 19325) ^ (-777938081);
                        i2 = 1769736712;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۠᩸")) * 3;
                        i = ((iM6981 ^ i3) * 25921) ^ (-1139716489);
                        i2 = 1880772278;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1228408172:
                case 1794771211:
                    sArr2 = f37974;
                    c = 'y';
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ۘ᩺") + i4) * (-67);
                        i = ((iM6981 ^ i3) * (-20513)) ^ 1491580076;
                        i2 = 1053282584;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩵") + i3) * (-3);
                        i = ((iM6981 ^ i4) * 16555) ^ 1570026201;
                        i2 = -8767942;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -991081318:
                case 1618169198:
                    int i17 = s + s2;
                    if (i13 - (i17 * i17) >= 0) {
                        iM6981 = (C2105.m6981("᩹ܰ") ^ i4) * (-119);
                        i = ((iM6981 ^ i3) * (-32305)) ^ (-473704477);
                        i2 = 614460014;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۨۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i4) * (-5425)) ^ 648037886;
                        i2 = -1308447874;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -753964909:
                case 599426921:
                    iM6983 = C2105.m6981(strM8030);
                    i15 = 2124926273;
                    if (C1294.m4372() <= 0) {
                        iM6981 = C2105.m6981("᩹֨") ^ i4;
                        i = ((iM6981 ^ i3) * (-20779)) ^ (-125718923);
                        i2 = 503046875;
                    } else {
                        iM6981 = (C2105.m6981("ܳܽ") + i4) * 99;
                        i = ((iM6981 ^ i3) * 14283) ^ (-1740241294);
                        i2 = -295411783;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -455833481:
                case 819862313:
                    iM6982 = C2105.m6981(C1047.m3603(sArr, i8, i9, i7));
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 16527) ^ 1468992010;
                        i2 = -1657558530;
                    } else {
                        iM6981 = C2105.m6981("ܳ۬") ^ i3;
                        i = ((iM6981 ^ i4) * 14869) ^ 1513839147;
                        i2 = -1085913019;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -31370304:
                case 1944490359:
                    strM8030 = C2520.m8030(f37974, q.h, 3, i7);
                    if (RunnableC0588.m2441() >= 0) {
                        iM6981 = (C2105.m6981("۠᩵") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-1775)) ^ 757508927;
                        i2 = 909806534;
                    } else {
                        iM6981 = (C0630.m2566("ۧ᩸") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i4) * (-1325)) ^ (-1436409389);
                        i2 = -707110269;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 427448307:
                case 1263687447:
                    if (C1005.f3721) {
                        iM6981 = (C2105.m6981("۠᩵") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-1775)) ^ 757508927;
                        i2 = 909806534;
                    } else {
                        iM6981 = C0630.m2566("֨ܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 16527) ^ 1468992010;
                        i2 = -1657558530;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 531841491:
                case 1437813742:
                    C0714.m2805();
                    if (C1504.f5354) {
                        iM6981 = (C2105.m6981("۠᩵") + i3) * (-75);
                        i = ((iM6981 ^ i4) * (-1775)) ^ 757508927;
                        i2 = 909806534;
                    } else {
                        iM6981 = C2105.m6981("᩹֨") ^ i4;
                        i = ((iM6981 ^ i3) * (-20779)) ^ (-125718923);
                        i2 = 503046875;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 724206542:
                case 1781187870:
                    scrollView = (ScrollView) C0964.m3409(activityC6242, iM6983 ^ i15);
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("۟ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 8659) ^ (-1448592846);
                        i2 = 51978170;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۫ۚ")) * 69;
                        i = ((iM6981 ^ i4) * (-17691)) ^ (-716108343);
                        i2 = 1016635868;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 993206317:
                case 1299555980:
                    i7 = 8349;
                    iM6981 = C2105.m6981("ܰܳ") ^ i4;
                    i = ((iM6981 ^ i3) * 18247) ^ 1550818159;
                    i2 = -610643782;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1245806394:
                case 1674941538:
                    s = sArr2[c];
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("۟ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 8659) ^ (-1448592846);
                        i2 = 51978170;
                    } else {
                        iM6981 = C2105.m6981("ᩳ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * 6135) ^ (-521862691);
                        i2 = 1124717742;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1817562965:
                case 1876569417:
                    C0630.m2564();
                    C22628.m50615();
                    break;
                case 1905554016:
                case 1969295232:
                    break;
                default:
                    sArr = f37974;
                    i8 = 122;
                    i9 = 3;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("۟ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 8659) ^ (-1448592846);
                        i2 = 51978170;
                    } else {
                        iM6981 = C2105.m6981("֨ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-14653)) ^ 304001736;
                        i2 = -62948026;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private final boolean m30859() {
        ActivityC6242 activityC6242 = null;
        int i = -415164322;
        int i2 = C2167.f7158;
        int i3 = C1773.f6144;
        int iM2566 = C0630.m2566("۬ܳ") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-25343)) ^ 760505481;
        int i5 = -1919098999;
        while (true) {
            i = ((((i ^ i2) * (-32061)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1992217007:
                case 567694300:
                    C1294.m4372();
                    C2272.m7503();
                    iM2566 = (i2 - C2105.m6981("ܰۨ")) * 37;
                    i4 = ((iM2566 ^ i3) * (-12167)) ^ (-199979650);
                    i5 = -743570478;
                    break;
                case -1977136090:
                case -1558092872:
                    activityC6242 = this.f37976;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("۟ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8655)) ^ (-1486359185);
                        i5 = 1742374188;
                    } else {
                        iM2566 = C0630.m2566("ۖ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3213)) ^ 841295337;
                        i5 = 443715508;
                    }
                    break;
                case -1934388229:
                case 1242984748:
                    if (activityC6242.isDestroyed()) {
                        iM2566 = (C2105.m6981("᩷ۢ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-27651)) ^ 1431250387;
                        i5 = 627518545;
                    } else {
                        iM2566 = C2105.m6981("ۤ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5041) ^ (-1835453561);
                        i5 = 742851043;
                    }
                    break;
                case -1851238084:
                case -759336530:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("۟ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8655)) ^ (-1486359185);
                        i5 = 1742374188;
                    } else {
                        iM2566 = C0630.m2566("ܿۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18989)) ^ (-1996867744);
                        i5 = 519962504;
                    }
                    break;
                case -1658976927:
                case 95432749:
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C2105.m6981("۟ۗ") + i3) * 71;
                        i4 = ((iM2566 ^ i2) * 14087) ^ 1332424710;
                        i5 = -1057904465;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31453) ^ (-826068816);
                        i5 = 4900609;
                    }
                    break;
                case -1646491767:
                case -1020995237:
                    if (RunnableC1108.f4040) {
                        iM2566 = (i3 - C0630.m2566("ۙ۬")) * 115;
                        i4 = ((iM2566 ^ i2) * (-28895)) ^ 2032285782;
                        i5 = 1112736554;
                    } else {
                        iM2566 = (C2105.m6981("۟ۗ") + i3) * 71;
                        i4 = ((iM2566 ^ i2) * 14087) ^ 1332424710;
                        i5 = -1057904465;
                    }
                    break;
                case -1443843388:
                case 1169721284:
                    if (C3019.m9255() <= 0) {
                        iM2566 = (C0630.m2566("ۛ۬") + i3) * 21;
                        i4 = ((iM2566 ^ i2) * (-11133)) ^ (-1831345166);
                        i5 = 1557800738;
                    } else {
                        iM2566 = C2105.m6981("ۧܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10149)) ^ (-128444620);
                        i5 = 1145590911;
                    }
                    break;
                case -1366494171:
                case 1078353283:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("۟ۗ") + i3) * 71;
                        i4 = ((iM2566 ^ i2) * 14087) ^ 1332424710;
                        i5 = -1057904465;
                    } else {
                        iM2566 = (C0630.m2566("ۛ۬") + i3) * 21;
                        i4 = ((iM2566 ^ i2) * (-11133)) ^ (-1831345166);
                        i5 = 1557800738;
                    }
                    break;
                case -1366271766:
                case 1922986084:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C2105.m6981("۟ۗ") + i3) * 71;
                        i4 = ((iM2566 ^ i2) * 14087) ^ 1332424710;
                        i5 = -1057904465;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩶ܿ")) * 71;
                        i4 = ((iM2566 ^ i2) * 3851) ^ (-1225165505);
                        i5 = 1548753663;
                    }
                    break;
                case -1197665716:
                case -580828755:
                    if (C1047.m3602()) {
                        iM2566 = (i2 - C2105.m6981("۬۫")) * (-51);
                        i4 = ((iM2566 ^ i3) * (-11137)) ^ 1605796056;
                        i5 = -1553422146;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۢ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-27651)) ^ 1431250387;
                        i5 = 627518545;
                    }
                    break;
                case -1178240558:
                case -183414343:
                    if (this.f37977 == activityC6242.f19316) {
                        iM2566 = C2105.m6981("᩹ۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14273)) ^ 1989913216;
                        i5 = -1776072651;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۢ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-27651)) ^ 1431250387;
                        i5 = 627518545;
                    }
                    break;
                case -1160835532:
                case -331902758:
                    C1916.m6308();
                    return false;
                case -1125938509:
                case 1507646586:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ܰۨ")) * 37;
                        i4 = ((iM2566 ^ i3) * (-12167)) ^ (-199979650);
                        i5 = -743570478;
                    } else {
                        iM2566 = C0630.m2566("᩺᩸") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4471) ^ (-320822736);
                        i5 = -66887834;
                    }
                    break;
                case -1098067247:
                case 792511909:
                    if (C0237.f1507 == 0) {
                        iM2566 = (C0630.m2566("ۛ۬") + i3) * 21;
                        i4 = ((iM2566 ^ i2) * (-11133)) ^ (-1831345166);
                        i5 = 1557800738;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܰۨ")) * 37;
                        i4 = ((iM2566 ^ i3) * (-12167)) ^ (-199979650);
                        i5 = -743570478;
                    }
                    break;
                case -945056724:
                case 904059098:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ۘ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1303) ^ (-1296758437);
                        i5 = -50335758;
                    } else {
                        iM2566 = C0630.m2566("۟ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8655)) ^ (-1486359185);
                        i5 = 1742374188;
                    }
                    break;
                case -799215002:
                case 83004394:
                    return true;
                case -443064049:
                case 787957897:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۚ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-21581)) ^ (-1081771855);
                        i5 = -1726988424;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۡۚ")) * 69;
                        i4 = ((iM2566 ^ i3) * 15607) ^ (-1446384797);
                        i5 = 590244689;
                    }
                    break;
                case -157414930:
                case 277257221:
                    if (C11233.m27802((Object) activityC6242.f19311, (Object) RunnableC3474.m10627())) {
                        iM2566 = C0630.m2566("᩹ᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21395) ^ 334705181;
                        i5 = -18686837;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۢ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-27651)) ^ 1431250387;
                        i5 = 627518545;
                    }
                    break;
                case 225036439:
                case 909282445:
                    if (C1047.f3863 < 0) {
                        iM2566 = C0630.m2566("۟ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8655)) ^ (-1486359185);
                        i5 = 1742374188;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܰۨ")) * 37;
                        i4 = ((iM2566 ^ i3) * (-12167)) ^ (-199979650);
                        i5 = -743570478;
                    }
                    break;
                case 631868790:
                case 1244794131:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("۟ۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8655)) ^ (-1486359185);
                        i5 = 1742374188;
                    } else {
                        iM2566 = (C2105.m6981("ۘۜ") + i3) * 33;
                        i4 = ((iM2566 ^ i2) * 2025) ^ (-1567980046);
                        i5 = -1474984752;
                    }
                    break;
                case 1897881376:
                case 2043429996:
                    return false;
                default:
                    if (C2958.m9033(activityC6242)) {
                        iM2566 = (C2105.m6981("᩷ۢ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * (-27651)) ^ 1431250387;
                        i5 = 627518545;
                    } else {
                        iM2566 = C0630.m2566("᩺ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-23355)) ^ (-544441685);
                        i5 = 1688742726;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x1093 A[PHI: r4 r5 r7 r8 r9 r14 r17 r19 r22 r23 r25 r26 r30 r33 r35 r36 r37 r38 r39 r40 r41 r44 r45 r47 r51 r52 r53 r56 r57
      0x1093: PHI (r4v75 int) = (r4v24 int), (r4v36 int), (r4v77 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r5v39 l.֫᩵ۡ) = (r5v7 l.֫᩵ۡ), (r5v14 l.֫᩵ۡ), (r5v40 l.֫᩵ۡ) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r7v48 boolean) = (r7v13 boolean), (r7v16 boolean), (r7v51 boolean) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r8v74 org.json.JSONObject) = (r8v25 org.json.JSONObject), (r8v32 org.json.JSONObject), (r8v76 org.json.JSONObject) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r9v24 int) = (r9v2 int), (r9v2 int), (r9v26 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r14v41 int) = (r14v21 int), (r14v24 int), (r14v42 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r17v26 int) = (r17v7 int), (r17v13 int), (r17v27 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r19v24 boolean) = (r19v7 boolean), (r19v11 boolean), (r19v25 boolean) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r22v27 org.json.JSONObject) = (r22v7 org.json.JSONObject), (r22v14 org.json.JSONObject), (r22v28 org.json.JSONObject) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r23v28 android.widget.LinearLayout) = (r23v7 android.widget.LinearLayout), (r23v12 android.widget.LinearLayout), (r23v29 android.widget.LinearLayout) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r25v31 org.json.JSONArray) = (r25v7 org.json.JSONArray), (r25v14 org.json.JSONArray), (r25v32 org.json.JSONArray) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r26v31 int) = (r26v7 int), (r26v14 int), (r26v32 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r30v29 int) = (r30v7 int), (r30v13 int), (r30v30 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r33v27 int) = (r33v9 int), (r33v12 int), (r33v28 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r35v28 int) = (r35v9 int), (r35v12 int), (r35v29 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r36v40 int) = (r36v17 int), (r36v20 int), (r36v41 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r37v35 android.widget.TextView) = (r37v12 android.widget.TextView), (r37v15 android.widget.TextView), (r37v36 android.widget.TextView) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r38v42 int) = (r38v12 int), (r38v15 int), (r38v43 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r39v35 int) = (r39v12 int), (r39v15 int), (r39v36 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r40v43 int) = (r40v12 int), (r40v17 int), (r40v44 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r41v37 int) = (r41v14 int), (r41v17 int), (r41v38 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r44v40 float) = (r44v17 float), (r44v20 float), (r44v41 float) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r45v46 boolean) = (r45v15 boolean), (r45v20 boolean), (r45v47 boolean) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r47v43 android.widget.ImageView) = (r47v16 android.widget.ImageView), (r47v19 android.widget.ImageView), (r47v44 android.widget.ImageView) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r51v57 android.widget.LinearLayout$LayoutParams) = 
      (r51v20 android.widget.LinearLayout$LayoutParams)
      (r51v27 android.widget.LinearLayout$LayoutParams)
      (r51v58 android.widget.LinearLayout$LayoutParams)
     binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r52v33 int) = (r52v11 int), (r52v14 int), (r52v34 int) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r53v52 short[]) = (r53v15 short[]), (r53v22 short[]), (r53v53 short[]) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r56v27 java.lang.String) = (r56v10 java.lang.String), (r56v13 java.lang.String), (r56v28 java.lang.String) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]
      0x1093: PHI (r57v30 boolean) = (r57v11 boolean), (r57v14 boolean), (r57v31 boolean) binds: [B:170:0x1091, B:154:0x0e60, B:97:0x07b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x020b  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws Throwable {
        String str;
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        int i;
        LinearLayout linearLayout;
        float f;
        boolean z2;
        short[] sArr;
        TextView textView;
        int i2;
        short[] sArr2;
        ImageView imageView;
        int i3;
        int i4;
        int i5;
        TextView textView2;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        TextView textView3;
        int i11;
        int i12;
        ImageView imageView2;
        int i13;
        boolean z3;
        short[] sArr3;
        int iM6981;
        int i14;
        String str2;
        boolean z4;
        LinearLayout linearLayout2;
        LinearLayout.LayoutParams layoutParams2;
        C2030 c2030;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i15;
        JSONArray jSONArray;
        int i16;
        boolean z5;
        ImageView imageView3;
        int i17;
        boolean z6;
        short[] sArr4;
        int iM2566;
        int i18;
        JSONObject jSONObject3;
        int iM2567;
        int i19;
        int i20;
        String str3;
        boolean z7;
        LinearLayout.LayoutParams layoutParams3;
        JSONArray jSONArray2;
        boolean z8;
        short[] sArr5;
        int iM6982;
        int i21;
        int i22;
        int iM6983;
        int i23;
        int i24;
        String str4;
        boolean z9;
        LinearLayout.LayoutParams layoutParams4;
        int i25;
        int i26;
        int i27;
        float f3;
        boolean z10;
        short[] sArr6;
        int i28;
        int i29;
        TextView textView4;
        int i30;
        int i31;
        int i32;
        ImageView imageView4;
        String strM4902;
        int iM2568;
        int i33;
        int i34;
        int iM2569;
        int i35;
        int i36;
        LinearLayout.LayoutParams layoutParams5;
        int i37;
        int iM6984;
        int i38;
        int i39;
        int iM25610;
        int i40;
        C12592 c12592 = this;
        int i41 = 2056176775;
        int i42 = C0483.f2088;
        int i43 = RunnableC3474.f10992;
        int iM25611 = (C0630.m2566("ۘᩴ") + i43) * (-31);
        int i44 = ((iM25611 ^ i42) * 23669) ^ 2035732175;
        int i45 = iM25611 ^ (-663534317);
        JSONObject jSONObject4 = null;
        JSONObject jSONObject5 = null;
        JSONArray jSONArray3 = null;
        DateFormat dateTimeInstance = null;
        LinearLayout linearLayout3 = null;
        LinearLayout linearLayout4 = null;
        ImageView imageView5 = null;
        TextView textViewM27769 = null;
        String str5 = null;
        short[] sArr7 = null;
        int i46 = 0;
        boolean z11 = false;
        int i47 = 0;
        int i48 = 0;
        int iM25612 = 0;
        boolean z12 = false;
        String str6 = null;
        int iM25613 = 0;
        int iM6985 = 0;
        int i49 = 0;
        boolean z13 = false;
        int i50 = 0;
        float f4 = 0.0f;
        int length = 0;
        boolean z14 = false;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int iM6431 = 0;
        int i55 = 0;
        int i56 = 0;
        float f5 = 0.0f;
        boolean z15 = false;
        Throwable th = null;
        C2030 c2031 = null;
        LinearLayout linearLayout5 = null;
        JSONObject jSONObject6 = null;
        TextView textView5 = null;
        String strM3841 = null;
        boolean z16 = false;
        int iM10558 = 0;
        String str7 = null;
        ActivityC6242 activityC6242 = null;
        LinearLayout linearLayout6 = null;
        LinearLayout.LayoutParams layoutParams6 = null;
        int i57 = 0;
        while (true) {
            i41 = i45 ^ (i44 & (((i41 ^ i42) * 24071) >> 31));
            switch (i41) {
                case -2093531633:
                case 1074533546:
                    ServiceConnectionC3453.m10564();
                    if (C3537.m10746() > 0) {
                        str4 = strM3841;
                        z9 = z11;
                        layoutParams4 = layoutParams6;
                        i25 = i48;
                        i31 = i54;
                        i26 = i57;
                        strM4902 = str5;
                        i30 = i56;
                        f3 = f5;
                        sArr6 = sArr7;
                        imageView4 = imageView5;
                        i27 = i55;
                        z10 = z15;
                        TextView textView6 = textView5;
                        i28 = i47;
                        i29 = iM6431;
                        i32 = i53;
                        textView4 = textView6;
                        iM2568 = (i42 - C0630.m2566("᩻ۚ")) * 109;
                        i33 = ((iM2568 ^ i43) * 13527) ^ (-995579755);
                        i34 = -1631154189;
                        int i58 = iM2568 ^ i34;
                        sArr7 = sArr6;
                        i56 = i30;
                        f5 = f3;
                        z15 = z10;
                        i48 = i25;
                        i54 = i31;
                        i57 = i26;
                        i55 = i27;
                        imageView5 = imageView4;
                        layoutParams6 = layoutParams4;
                        str5 = strM4902;
                        i45 = i58;
                        i44 = i33;
                        strM3841 = str4;
                        z11 = z9;
                        int i59 = i32;
                        iM6431 = i29;
                        i47 = i28;
                        textView5 = textView4;
                        i53 = i59;
                    } else {
                        iM25610 = C0630.m2566("֡᩹") ^ i42;
                        i2 = ((iM25610 ^ i43) * (-20479)) ^ 381411707;
                        i40 = 218532165;
                        i45 = iM25610 ^ i40;
                        i44 = i2;
                    }
                    break;
                case -1943307354:
                case -291932615:
                    c2031.m6606(str7);
                    ((LinearLayout) C4263.m12813(activityC6242, iM6985)).removeAllViews();
                    C1128.m3853(C4263.m12813(activityC6242, iM25613), i49);
                    TextView textView7 = (TextView) C4263.m12813(activityC6242, i50);
                    C1047.m3601(textView7, str6);
                    boolean z17 = z12;
                    C3746.m11360(textView7, z17 ? 1 : 0);
                    ((ScrollView) C0964.m3409(activityC6242, iM25612)).scrollTo(z17 ? 1 : 0, z17 ? 1 : 0);
                    return;
                case -1863538991:
                case 1493569973:
                    strM3841 = strM3841;
                    z11 = z11;
                    layoutParams6 = layoutParams6;
                    i49 = i49;
                    jSONObject4 = jSONObject4;
                    length = length;
                    i57 = i57;
                    f5 = f5;
                    linearLayout3 = linearLayout3;
                    c2031 = c2031;
                    jSONObject5 = jSONObject5;
                    i54 = i54;
                    i56 = i56;
                    iM25613 = iM25613;
                    imageView5 = imageView5;
                    i55 = i55;
                    z15 = z15;
                    sArr7 = sArr7;
                    z12 = z12;
                    i50 = i50;
                    jSONArray3 = jSONArray3;
                    TextView textView8 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView8;
                    if (c12592.f37978 == null) {
                        iM6981 = (i43 - C2105.m6981("ۚۧ")) * (-25);
                        i44 = ((iM6981 ^ i42) * (-11155)) ^ 1237106460;
                        i14 = -1956337229;
                        int i60 = iM6981 ^ i14;
                        jSONArray3 = jSONArray3;
                        length = length;
                        sArr7 = sArr7;
                        strM3841 = strM3841;
                        jSONObject4 = jSONObject4;
                        i50 = i50;
                        z12 = z12;
                        iM25613 = iM25613;
                        z15 = z15;
                        layoutParams6 = layoutParams6;
                        i45 = i60;
                        jSONObject5 = jSONObject5;
                        i55 = i55;
                        imageView5 = imageView5;
                        c12592 = this;
                    } else {
                        int iM6986 = C2105.m6981("ۧۖ") ^ i43;
                        jSONArray3 = jSONArray3;
                        length = length;
                        sArr7 = sArr7;
                        jSONObject4 = jSONObject4;
                        i50 = i50;
                        z12 = z12;
                        iM25613 = iM25613;
                        z15 = z15;
                        layoutParams6 = layoutParams6;
                        i45 = iM6986 ^ 635139881;
                        i44 = ((iM6986 ^ i42) * (-22979)) ^ (-480605328);
                        jSONObject5 = jSONObject5;
                        i55 = i55;
                        imageView5 = imageView5;
                        strM3841 = strM3841;
                    }
                    c2031 = c2031;
                    linearLayout3 = linearLayout3;
                    i56 = i56;
                    i54 = i54;
                    i49 = i49;
                    f5 = f5;
                    z11 = z11;
                    i57 = i57;
                    int i61 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i61;
                    break;
                case -1835733168:
                case 254216420:
                    String str8 = strM3841;
                    int i62 = iM25613;
                    int i63 = i49;
                    jSONObject4 = jSONObject4;
                    JSONObject jSONObject7 = jSONObject5;
                    length = length;
                    LinearLayout linearLayout7 = linearLayout3;
                    z12 = z12;
                    i50 = i50;
                    jSONArray3 = jSONArray3;
                    int i64 = i54;
                    int i65 = i56;
                    ImageView imageView6 = imageView5;
                    int i66 = i55;
                    textView2 = textView5;
                    activityC6242.f19318 = -1;
                    activityC6242.f19317 = "";
                    activityC6242.f19310 = "";
                    C2030 c2032 = activityC6242.f19315;
                    if (c2032 != null) {
                        int iM25614 = C0630.m2566("֨᩹") ^ i42;
                        i44 = ((iM25614 ^ i43) * 7733) ^ 1978334164;
                        iM25613 = i62;
                        i45 = iM25614 ^ 1393091700;
                    } else {
                        int iM6987 = (C2105.m6981("ܺ᩹") + i42) * (-93);
                        iM25613 = i62;
                        i45 = iM6987 ^ (-1415647940);
                        i44 = ((iM6987 ^ i43) * (-12919)) ^ 477599607;
                    }
                    jSONObject5 = jSONObject7;
                    linearLayout3 = linearLayout7;
                    i55 = i66;
                    imageView5 = imageView6;
                    c2031 = c2032;
                    i49 = i63;
                    i56 = i65;
                    i54 = i64;
                    strM3841 = str8;
                    z11 = z11;
                    f5 = f5;
                    i57 = i57;
                    int i67 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i67;
                    break;
                case -1813300579:
                case 820947429:
                    C22628.m50615();
                    if (!C1005.f3721) {
                        str = strM3841;
                        z = z11;
                        layoutParams = layoutParams6;
                        i = i48;
                        textView = textView5;
                        linearLayout = linearLayout4;
                        sArr = sArr7;
                        int iM6988 = C2105.m6981("᩸ۨ") ^ i42;
                        linearLayout4 = linearLayout;
                        textView5 = textView;
                        sArr7 = sArr;
                        layoutParams6 = layoutParams;
                        i48 = i;
                        strM3841 = str;
                        i45 = iM6988 ^ 1787477692;
                        i44 = ((iM6988 ^ i43) * (-233)) ^ 784300920;
                        z11 = z;
                    } else {
                        iM25610 = (i42 - C0630.m2566("֫֨")) * 51;
                        i2 = ((iM25610 ^ i43) * (-13831)) ^ (-855370300);
                        i40 = 1009310173;
                        i45 = iM25610 ^ i40;
                        i44 = i2;
                    }
                    break;
                case -1729815038:
                case -629374514:
                    strM3841 = strM3841;
                    z11 = z11;
                    layoutParams6 = layoutParams6;
                    int i68 = i48;
                    int i69 = i52;
                    int i70 = i54;
                    i57 = i57;
                    i56 = i56;
                    f5 = f5;
                    short[] sArr8 = sArr7;
                    imageView5 = imageView5;
                    i55 = i55;
                    z15 = z15;
                    TextView textView9 = textView5;
                    i47 = i47;
                    int i71 = iM6431;
                    i53 = i53;
                    textView2 = textView9;
                    iM6431 = i71;
                    C3746.m11360(C4263.m12813(activityC6242, C0630.m2566(C2105.m6988(f37974, 72, 3, i46)) ^ 2125013187), 0);
                    if (activityC6242.f19318 < 0) {
                        i54 = i70;
                        sArr7 = sArr8;
                        jSONObject4 = jSONObject4;
                        length = length;
                        z14 = z14;
                        i51 = i51;
                        i48 = i68;
                        i52 = i69;
                        i49 = i49;
                        linearLayout3 = linearLayout3;
                        c2031 = c2031;
                        jSONObject5 = jSONObject5;
                        iM25613 = iM25613;
                        z12 = z12;
                        i50 = i50;
                        jSONArray3 = jSONArray3;
                        iM6981 = (i43 - C2105.m6981("ۚۧ")) * (-25);
                        i44 = ((iM6981 ^ i42) * (-11155)) ^ 1237106460;
                        i14 = -1956337229;
                        int i610 = iM6981 ^ i14;
                        jSONArray3 = jSONArray3;
                        length = length;
                        sArr7 = sArr7;
                        strM3841 = strM3841;
                        jSONObject4 = jSONObject4;
                        i50 = i50;
                        z12 = z12;
                        iM25613 = iM25613;
                        z15 = z15;
                        layoutParams6 = layoutParams6;
                        i45 = i610;
                        jSONObject5 = jSONObject5;
                        i55 = i55;
                        imageView5 = imageView5;
                        c12592 = this;
                        c2031 = c2031;
                        linearLayout3 = linearLayout3;
                        i56 = i56;
                        i54 = i54;
                        i49 = i49;
                        f5 = f5;
                        z11 = z11;
                        i57 = i57;
                        int i611 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i611;
                    } else {
                        int iM6989 = (i43 - C2105.m6981("ܽ֨")) * (-83);
                        sArr7 = sArr8;
                        i47 = i47;
                        f5 = f5;
                        z15 = z15;
                        i48 = i68;
                        i57 = i57;
                        textView5 = textView2;
                        i53 = i53;
                        i55 = i55;
                        imageView5 = imageView5;
                        iM6431 = iM6431;
                        i56 = i56;
                        i52 = i69;
                        i54 = i70;
                        layoutParams6 = layoutParams6;
                        z11 = z11;
                        i45 = iM6989 ^ (-196446458);
                        i44 = ((iM6989 ^ i42) * (-30875)) ^ (-1870494806);
                        strM3841 = strM3841;
                    }
                    break;
                case -1720110196:
                case 635766351:
                    C3245.m9918(textViewM27769, C21943.f70257);
                    iM25610 = C0630.m2566("ܳ֡") ^ i42;
                    i2 = ((iM25610 ^ i43) * (-10495)) ^ 420362184;
                    i40 = 97128168;
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -1686523211:
                case 1770429671:
                    strM3841 = strM3841;
                    jSONObject4 = jSONObject4;
                    int i72 = i54;
                    int i73 = i56;
                    ImageView imageView7 = imageView5;
                    int i74 = i55;
                    textView2 = textView5;
                    ActivityC6242.m17197(activityC6242, jSONObject4);
                    i50 = i50;
                    jSONArray3 = jSONArray3;
                    length = length;
                    int i75 = i49;
                    C3746.m11360(C0964.m3409(activityC6242, i50), i75);
                    linearLayout5.removeAllViews();
                    jSONObject5 = c12592.f37978;
                    if (jSONObject5 != null) {
                        int iM69810 = C2105.m6981("ܺܽ") ^ i42;
                        i44 = ((iM69810 ^ i43) * 2083) ^ 421634164;
                        i45 = iM69810 ^ (-1081450322);
                    } else {
                        int iM25615 = C0630.m2566("᩹᩵") ^ i42;
                        i45 = iM25615 ^ 285748000;
                        i44 = ((iM25615 ^ i43) * 28603) ^ 1786761480;
                        linearLayout3 = linearLayout3;
                    }
                    i55 = i74;
                    imageView5 = imageView7;
                    i49 = i75;
                    i56 = i73;
                    i54 = i72;
                    z11 = z11;
                    f5 = f5;
                    i57 = i57;
                    int i612 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i612;
                    break;
                case -1683861274:
                case -1359858500:
                    C8058 c8058 = C8058.f24861;
                    C1504.m5169(linearLayout5, linearLayout3, layoutParams6);
                    i48++;
                    jSONObject3 = jSONObject5;
                    z16 = false;
                    textView2 = textView5;
                    int iM25616 = C0630.m2566("ۛۨ") ^ i43;
                    jSONObject5 = jSONObject3;
                    layoutParams6 = layoutParams6;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    i45 = iM25616 ^ 419339379;
                    i44 = ((iM25616 ^ i42) * (-24833)) ^ (-1568825342);
                    z15 = z15;
                    z11 = z11;
                    i55 = i55;
                    imageView5 = imageView5;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i613 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i613;
                    break;
                case -1636982521:
                case 1245776429:
                    RunnableC1937.m6387();
                    if (C2520.f8000 >= 0) {
                        str3 = strM3841;
                        z7 = z11;
                        layoutParams3 = layoutParams6;
                        jSONArray2 = jSONArray3;
                        i57 = i57;
                        f5 = f5;
                        i54 = i54;
                        i56 = i56;
                        imageView5 = imageView5;
                        i55 = i55;
                        z8 = z15;
                        sArr5 = sArr7;
                        TextView textView10 = textView5;
                        i47 = i47;
                        z14 = z14;
                        i51 = i51;
                        i52 = i52;
                        iM6431 = iM6431;
                        i53 = i53;
                        textView2 = textView10;
                        iM6982 = (C0630.m2566("ᩳۤ") ^ i42) * 55;
                        i21 = ((iM6982 ^ i43) * (-5319)) ^ (-1022742117);
                        i22 = 850408299;
                        int i76 = iM6982 ^ i22;
                        jSONArray3 = jSONArray2;
                        i44 = i21;
                        layoutParams6 = layoutParams3;
                        sArr7 = sArr5;
                        z11 = z7;
                        i45 = i76;
                        z15 = z8;
                        strM3841 = str3;
                        i55 = i55;
                        imageView5 = imageView5;
                        i56 = i56;
                        i54 = i54;
                        f5 = f5;
                        i57 = i57;
                        int i614 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i614;
                    }
                    str2 = strM3841;
                    z4 = z11;
                    layoutParams2 = layoutParams6;
                    i18 = i49;
                    iM2566 = i50;
                    jSONObject = jSONObject4;
                    i15 = length;
                    jSONArray = jSONArray3;
                    i57 = i57;
                    f5 = f5;
                    linearLayout2 = linearLayout3;
                    c2030 = c2031;
                    jSONObject2 = jSONObject5;
                    i54 = i54;
                    i56 = i56;
                    i16 = iM25613;
                    imageView3 = imageView5;
                    i17 = i55;
                    z6 = z15;
                    sArr4 = sArr7;
                    z5 = z12;
                    TextView textView11 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView11;
                    int iM69811 = C2105.m6981("᩶ۨ") ^ i43;
                    z12 = z5;
                    jSONArray3 = jSONArray;
                    length = i15;
                    iM25613 = i16;
                    sArr7 = sArr4;
                    i50 = iM2566;
                    jSONObject4 = jSONObject;
                    jSONObject5 = jSONObject2;
                    z15 = z6;
                    layoutParams6 = layoutParams2;
                    c12592 = this;
                    i45 = iM69811 ^ (-1680797296);
                    i44 = ((iM69811 ^ i42) * 15095) ^ 1778222423;
                    c2031 = c2030;
                    linearLayout3 = linearLayout2;
                    i55 = i17;
                    imageView5 = imageView3;
                    z11 = z4;
                    i49 = i18;
                    i56 = i56;
                    i54 = i54;
                    strM3841 = str2;
                    f5 = f5;
                    i57 = i57;
                    int i615 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i615;
                    break;
                case -1590081328:
                case 1530444355:
                    str3 = strM3841;
                    z7 = z11;
                    layoutParams3 = layoutParams6;
                    int i77 = i48;
                    float f6 = f5;
                    boolean z18 = z15;
                    TextView textViewM277610 = C11203.m27769(activityC6242, f6, z18);
                    C0630.m2570(textViewM277610, C0630.m2566(RunnableC1937.m6385(f37974, 81, 3, i46)) ^ 2121833938);
                    int i78 = i56;
                    textViewM277610.setGravity(i78);
                    i57 = i57;
                    f5 = f6;
                    int i79 = i55;
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(i79, i57);
                    z8 = z18;
                    layoutParams7.topMargin = ViewOnClickListenerC1958.m6431(6);
                    LinearLayout linearLayout8 = linearLayout4;
                    C3663.m11165(linearLayout8, textViewM277610, layoutParams7);
                    C3663.m11165(linearLayout5, linearLayout8, new LinearLayout.LayoutParams(i79, i57));
                    i54 = i54;
                    imageView5 = imageView5;
                    sArr5 = sArr7;
                    i48 = i77;
                    i55 = i79;
                    i56 = i78;
                    jSONArray2 = jSONArray3;
                    TextView textView12 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView12;
                    iM6982 = C2105.m6981("۬ۛ") ^ i43;
                    i21 = ((iM6982 ^ i42) * 15713) ^ 42357741;
                    i22 = -116453696;
                    int i710 = iM6982 ^ i22;
                    jSONArray3 = jSONArray2;
                    i44 = i21;
                    layoutParams6 = layoutParams3;
                    sArr7 = sArr5;
                    z11 = z7;
                    i45 = i710;
                    z15 = z8;
                    strM3841 = str3;
                    i55 = i55;
                    imageView5 = imageView5;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i616 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i616;
                    break;
                case -1554859112:
                case -1391811713:
                    C22628.m50610(C1005.m3502(f37974, 22, 4, i46));
                    throw th;
                case -1485518816:
                case 961873857:
                    RunnableC1937.m6387();
                    if (C4117.f13076 > 0) {
                        iM25610 = C0630.m2566("֡᩹") ^ i42;
                        i2 = ((iM25610 ^ i43) * (-20479)) ^ 381411707;
                        i40 = 218532165;
                    } else {
                        iM25610 = (i42 - C0630.m2566("֫֨")) * 51;
                        i2 = ((iM25610 ^ i43) * (-13831)) ^ (-855370300);
                        i40 = 1009310173;
                    }
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -1341945154:
                case 2145214116:
                    RunnableC1108.m3790();
                    if (C4263.f13799 <= 0) {
                        str = strM3841;
                        layoutParams = layoutParams6;
                        i = i48;
                        i3 = i57;
                        i5 = i56;
                        f = f5;
                        imageView = imageView5;
                        i4 = i55;
                        z2 = z15;
                        sArr2 = sArr7;
                        TextView textView13 = textView5;
                        i47 = i47;
                        z14 = z14;
                        i51 = i51;
                        i52 = i52;
                        iM6431 = iM6431;
                        i53 = i53;
                        textView2 = textView13;
                        int iM25617 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                        linearLayout6 = null;
                        f5 = f;
                        sArr7 = sArr2;
                        i48 = i;
                        i57 = i3;
                        z15 = z2;
                        i55 = i4;
                        imageView5 = imageView;
                        i56 = i5;
                        i44 = ((iM25617 ^ i42) * 5679) ^ (-203711777);
                        layoutParams6 = layoutParams;
                        i45 = iM25617 ^ 1530493610;
                        strM3841 = str;
                        int i617 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i617;
                    } else {
                        str4 = strM3841;
                        z9 = z11;
                        layoutParams4 = layoutParams6;
                        i25 = i48;
                        i31 = i54;
                        i26 = i57;
                        strM4902 = str5;
                        i30 = i56;
                        f3 = f5;
                        sArr6 = sArr7;
                        imageView4 = imageView5;
                        i27 = i55;
                        z10 = z15;
                        TextView textView14 = textView5;
                        i28 = i47;
                        i29 = iM6431;
                        i32 = i53;
                        textView4 = textView14;
                        iM2568 = (i42 - C0630.m2566("᩻ۚ")) * 109;
                        i33 = ((iM2568 ^ i43) * 13527) ^ (-995579755);
                        i34 = -1631154189;
                        int i510 = iM2568 ^ i34;
                        sArr7 = sArr6;
                        i56 = i30;
                        f5 = f3;
                        z15 = z10;
                        i48 = i25;
                        i54 = i31;
                        i57 = i26;
                        i55 = i27;
                        imageView5 = imageView4;
                        layoutParams6 = layoutParams4;
                        str5 = strM4902;
                        i45 = i510;
                        i44 = i33;
                        strM3841 = str4;
                        z11 = z9;
                        int i511 = i32;
                        iM6431 = i29;
                        i47 = i28;
                        textView5 = textView4;
                        i53 = i511;
                    }
                    break;
                case -1288628958:
                case 1414389918:
                    str3 = strM3841;
                    z7 = z11;
                    layoutParams3 = layoutParams6;
                    jSONArray2 = jSONArray3;
                    i57 = i57;
                    f5 = f5;
                    i54 = i54;
                    i56 = i56;
                    imageView5 = imageView5;
                    i55 = i55;
                    z8 = z15;
                    sArr5 = sArr7;
                    TextView textView15 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView15;
                    if (C1128.m3848(linearLayout5) == 0) {
                        iM6982 = C2105.m6981("᩸ᩴ") ^ i42;
                        i21 = ((iM6982 ^ i43) * 27517) ^ 2082113110;
                        i22 = -2127361736;
                    } else {
                        iM6982 = C2105.m6981("۬ۛ") ^ i43;
                        i21 = ((iM6982 ^ i42) * 15713) ^ 42357741;
                        i22 = -116453696;
                    }
                    int i711 = iM6982 ^ i22;
                    jSONArray3 = jSONArray2;
                    i44 = i21;
                    layoutParams6 = layoutParams3;
                    sArr7 = sArr5;
                    z11 = z7;
                    i45 = i711;
                    z15 = z8;
                    strM3841 = str3;
                    i55 = i55;
                    imageView5 = imageView5;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i618 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i618;
                    break;
                case -1267499242:
                case -379420207:
                    layoutParams = layoutParams6;
                    i = i48;
                    TextView textViewM277611 = C11203.m27769((Context) activityC6242, 12.0f, true);
                    String strM50614 = C22628.m50614(jSONObject6, C21923.m49334(f37974, 84, 10, i46));
                    str = strM3841;
                    z = z11;
                    long j = jSONObject6.getLong(C22628.m50602(f37974, 94, 11, i46));
                    if (C1773.m5908() > 0) {
                        String str9 = dateTimeInstance.format(new Date(j));
                        StringBuilder sb = new StringBuilder();
                        C1420.m4905(sb, strM50614);
                        C3245.m9923(sb, C1294.m4373(f37974, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i46));
                        C3245.m9923(sb, str9);
                        C1047.m3601(textViewM277611, C0422.m1959(sb));
                        C2126.m7042(linearLayout6, textViewM277611);
                        i6 = i52;
                        i7 = iM6431;
                        i8 = i57;
                        f2 = f5;
                        i9 = i53;
                        i10 = i54;
                        textView3 = textView5;
                        i11 = i56;
                        i12 = i47;
                        imageView2 = imageView5;
                        i13 = i55;
                        z3 = z15;
                        sArr3 = sArr7;
                        iM6983 = (C2105.m6981("֫᩵") + i43) * (-117);
                        i23 = ((iM6983 ^ i42) * 24187) ^ 371475357;
                        i24 = 1538966641;
                        int i80 = iM6983 ^ i24;
                        i47 = i12;
                        layoutParams6 = layoutParams;
                        sArr7 = sArr3;
                        i48 = i;
                        i45 = i80;
                        i44 = i23;
                        textView5 = textView3;
                        i53 = i9;
                        z15 = z3;
                        strM3841 = str;
                        iM6431 = i7;
                        i55 = i13;
                        imageView5 = imageView2;
                        i52 = i6;
                        i56 = i11;
                        i54 = i10;
                        z11 = z;
                        f5 = f2;
                        i57 = i8;
                    } else {
                        textView = textView5;
                        linearLayout = linearLayout4;
                        sArr = sArr7;
                        int iM69812 = C2105.m6981("᩸ۨ") ^ i42;
                        linearLayout4 = linearLayout;
                        textView5 = textView;
                        sArr7 = sArr;
                        layoutParams6 = layoutParams;
                        i48 = i;
                        strM3841 = str;
                        i45 = iM69812 ^ 1787477692;
                        i44 = ((iM69812 ^ i43) * (-233)) ^ 784300920;
                        z11 = z;
                    }
                    break;
                case -1251765892:
                case 1764719723:
                    ScrollView scrollView = (ScrollView) C0964.m3409(activityC6242, C2105.m6981(C3746.m11357(f37974, 108, 3, i46)) ^ 2125719811);
                    ViewTreeObserverOnPreDrawListenerC14493.m34591(scrollView, new RunnableC13297(c12592, activityC6242, scrollView));
                    return;
                case -1247095857:
                case -1031389883:
                    C1916.m6308();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM25610 = C2105.m6981("֡֫") ^ i43;
                        i2 = ((iM25610 ^ i42) * (-25957)) ^ (-1790969610);
                        i40 = 506930979;
                        i45 = iM25610 ^ i40;
                        i44 = i2;
                    } else {
                        str = strM3841;
                        layoutParams = layoutParams6;
                        i = i48;
                        i3 = i57;
                        i5 = i56;
                        f = f5;
                        imageView = imageView5;
                        i4 = i55;
                        z2 = z15;
                        sArr2 = sArr7;
                        TextView textView16 = textView5;
                        i47 = i47;
                        z14 = z14;
                        i51 = i51;
                        i52 = i52;
                        iM6431 = iM6431;
                        i53 = i53;
                        textView2 = textView16;
                        int iM25618 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                        linearLayout6 = null;
                        f5 = f;
                        sArr7 = sArr2;
                        i48 = i;
                        i57 = i3;
                        z15 = z2;
                        i55 = i4;
                        imageView5 = imageView;
                        i56 = i5;
                        i44 = ((iM25618 ^ i42) * 5679) ^ (-203711777);
                        layoutParams6 = layoutParams;
                        i45 = iM25618 ^ 1530493610;
                        strM3841 = str;
                        int i619 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i619;
                    }
                    break;
                case -1193185515:
                case 396617322:
                    if (iM10558 > 0) {
                        iM25610 = (i43 - C0630.m2566("ۘ᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM25610 ^ i42) * 27331) ^ 919137857;
                        i40 = 218724890;
                    } else {
                        iM25610 = C0630.m2566("ܳ֡") ^ i42;
                        i2 = ((iM25610 ^ i43) * (-10495)) ^ 420362184;
                        i40 = 97128168;
                    }
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -1165716339:
                case -622216155:
                    C4159.m12574(linearLayout3, textViewM27769);
                    layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                    if (C3746.m11358(linearLayout5) == 0) {
                        iM25610 = (i43 - C0630.m2566("ܳ۟")) * 55;
                        i2 = ((iM25610 ^ i42) * 27419) ^ 1594338385;
                        i40 = 180032479;
                    } else {
                        iM25610 = C0630.m2566("֨ܽ") ^ i42;
                        i2 = ((iM25610 ^ i43) * 12405) ^ (-549658707);
                        i40 = 1149350000;
                    }
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -1162254386:
                case 1146105338:
                    C22628.m50610(C2126.m7036(f37974, 13, 9, i46));
                    throw th;
                case -1087680719:
                case 525432008:
                    textViewM27769.setPaintFlags(textViewM27769.getPaintFlags() | 16);
                    iM25610 = C0630.m2566("ܳ֡") ^ i42;
                    i2 = ((iM25610 ^ i43) * (-10495)) ^ 420362184;
                    i40 = 97128168;
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -1038226233:
                case -66619846:
                    strM3841 = strM3841;
                    z11 = z11;
                    layoutParams6 = layoutParams6;
                    i49 = i49;
                    jSONObject4 = jSONObject4;
                    length = length;
                    i57 = i57;
                    f5 = f5;
                    linearLayout3 = linearLayout3;
                    c2031 = c2031;
                    jSONObject5 = jSONObject5;
                    i54 = i54;
                    i56 = i56;
                    iM25613 = iM25613;
                    imageView5 = imageView5;
                    i55 = i55;
                    z15 = z15;
                    sArr7 = sArr7;
                    z12 = z12;
                    i50 = i50;
                    jSONArray3 = jSONArray3;
                    TextView textView17 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView17;
                    short s = f37974[0];
                    if (((s * s) + 107972881) - (s * 20782) >= 0) {
                        iM6981 = C0630.m2566("ۛܺ") ^ i42;
                        i44 = ((iM6981 ^ i43) * (-21265)) ^ 1879808939;
                        i14 = -1561856617;
                    } else {
                        iM6981 = (C2105.m6981("ܽܺ") + i43) * 5;
                        i44 = ((iM6981 ^ i42) * (-709)) ^ (-1255637863);
                        i14 = 60598662;
                    }
                    int i6110 = iM6981 ^ i14;
                    jSONArray3 = jSONArray3;
                    length = length;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    jSONObject4 = jSONObject4;
                    i50 = i50;
                    z12 = z12;
                    iM25613 = iM25613;
                    z15 = z15;
                    layoutParams6 = layoutParams6;
                    i45 = i6110;
                    jSONObject5 = jSONObject5;
                    i55 = i55;
                    imageView5 = imageView5;
                    c12592 = this;
                    c2031 = c2031;
                    linearLayout3 = linearLayout3;
                    i56 = i56;
                    i54 = i54;
                    i49 = i49;
                    f5 = f5;
                    z11 = z11;
                    i57 = i57;
                    int i6111 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i6111;
                    break;
                case -997506772:
                case -777789835:
                    strM3841 = strM3841;
                    z11 = z11;
                    layoutParams6 = layoutParams6;
                    i49 = i49;
                    jSONObject4 = jSONObject4;
                    length = length;
                    i57 = i57;
                    f5 = f5;
                    linearLayout3 = linearLayout3;
                    c2031 = c2031;
                    jSONObject5 = jSONObject5;
                    i54 = i54;
                    i56 = i56;
                    iM25613 = iM25613;
                    imageView5 = imageView5;
                    i55 = i55;
                    z15 = z15;
                    sArr7 = sArr7;
                    z12 = z12;
                    i50 = i50;
                    jSONArray3 = jSONArray3;
                    TextView textView18 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView18;
                    if (m30859()) {
                        iM6981 = C0630.m2566("᩸۠") ^ i42;
                        i44 = ((iM6981 ^ i43) * 615) ^ 1194662016;
                        i14 = -641421474;
                    } else {
                        iM6981 = (i43 - C2105.m6981("ۚۧ")) * (-25);
                        i44 = ((iM6981 ^ i42) * (-11155)) ^ 1237106460;
                        i14 = -1956337229;
                    }
                    int i6112 = iM6981 ^ i14;
                    jSONArray3 = jSONArray3;
                    length = length;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    jSONObject4 = jSONObject4;
                    i50 = i50;
                    z12 = z12;
                    iM25613 = iM25613;
                    z15 = z15;
                    layoutParams6 = layoutParams6;
                    i45 = i6112;
                    jSONObject5 = jSONObject5;
                    i55 = i55;
                    imageView5 = imageView5;
                    c12592 = this;
                    c2031 = c2031;
                    linearLayout3 = linearLayout3;
                    i56 = i56;
                    i54 = i54;
                    i49 = i49;
                    f5 = f5;
                    z11 = z11;
                    i57 = i57;
                    int i6113 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i6113;
                    break;
                case -769321026:
                case 270566803:
                    C0630.m2564();
                    return;
                case -767887205:
                case 1578308039:
                    str = strM3841;
                    z = z11;
                    layoutParams = layoutParams6;
                    i = i48;
                    ImageView imageView8 = imageView5;
                    textView2 = textView5;
                    i3 = i57;
                    i4 = i55;
                    int i81 = i56;
                    f = f5;
                    z2 = z15;
                    short[] sArr9 = sArr7;
                    i47 = i47;
                    LinearLayout linearLayout9 = new LinearLayout(activityC6242);
                    linearLayout9.setOrientation(1);
                    linearLayout9.setGravity(1);
                    int i82 = i52;
                    float f7 = i82;
                    iM6431 = ViewOnClickListenerC1958.m6431(f7);
                    int iM4384 = C1294.m4384(52);
                    int iM4385 = C1294.m4384(f7);
                    if (C1773.f6144 > 0) {
                        int iM69813 = C2105.m6981("֫֡") ^ i43;
                        i44 = ((iM69813 ^ i42) * 17165) ^ 1282101182;
                        linearLayout4 = linearLayout9;
                        sArr7 = sArr9;
                        f5 = f;
                        z15 = z2;
                        i48 = i;
                        strM3841 = str;
                        i57 = i3;
                        i55 = i4;
                        imageView5 = imageView8;
                        i56 = i81;
                        i54 = iM4385;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = iM4384;
                        layoutParams6 = layoutParams;
                        i45 = iM69813 ^ 1131516152;
                        i52 = i82;
                        z11 = z;
                    } else {
                        imageView = imageView8;
                        linearLayout4 = linearLayout9;
                        sArr2 = sArr9;
                        i5 = i81;
                        iM6431 = iM6431;
                        i54 = iM4385;
                        i53 = iM4384;
                        z14 = z14;
                        i51 = i51;
                        i52 = i82;
                        z11 = z;
                        int iM25619 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                        linearLayout6 = null;
                        f5 = f;
                        sArr7 = sArr2;
                        i48 = i;
                        i57 = i3;
                        z15 = z2;
                        i55 = i4;
                        imageView5 = imageView;
                        i56 = i5;
                        i44 = ((iM25619 ^ i42) * 5679) ^ (-203711777);
                        layoutParams6 = layoutParams;
                        i45 = iM25619 ^ 1530493610;
                        strM3841 = str;
                        int i6114 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i6114;
                    }
                    break;
                case -606101714:
                case 1723019615:
                    String str10 = strM3841;
                    boolean z19 = z11;
                    layoutParams6 = layoutParams6;
                    int i83 = i49;
                    i50 = i50;
                    jSONObject4 = jSONObject4;
                    length = length;
                    jSONArray3 = jSONArray3;
                    i57 = i57;
                    f5 = f5;
                    linearLayout3 = linearLayout3;
                    c2031 = c2031;
                    jSONObject5 = jSONObject5;
                    i54 = i54;
                    i56 = i56;
                    ImageView imageView9 = imageView5;
                    int i84 = i55;
                    z15 = z15;
                    sArr7 = sArr7;
                    TextView textView19 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView19;
                    iM25613 = C0630.m2566(C4263.m12817(f37974, 7, 3, i46)) ^ 2119944431;
                    iM6985 = C2105.m6981(C3683.m11225(f37974, 10, 3, i46)) ^ 2124741174;
                    str7 = "";
                    activityC6242 = c12592.f37976;
                    if (str6 != null) {
                        int iM69814 = (C2105.m6981("ܳ᩶") + i42) * (-119);
                        i44 = ((iM69814 ^ i43) * (-32249)) ^ 2020279017;
                        z12 = false;
                        i45 = iM69814 ^ (-729147770);
                    } else {
                        int iM25620 = (i43 - C0630.m2566("ᩳ֡")) * 97;
                        z12 = false;
                        i45 = iM25620 ^ (-2007778962);
                        i44 = ((iM25620 ^ i42) * 19767) ^ 757847040;
                    }
                    i49 = i83;
                    i55 = i84;
                    imageView5 = imageView9;
                    strM3841 = str10;
                    z11 = z19;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i6115 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i6115;
                    break;
                case -582528395:
                case 725460789:
                    if (!C2272.f7362) {
                        iM25610 = (C0630.m2566("ܿۗ") ^ i43) * (-109);
                        i2 = ((iM25610 ^ i42) * 19577) ^ (-740233459);
                        i40 = -398521489;
                        i45 = iM25610 ^ i40;
                        i44 = i2;
                    } else {
                        str2 = strM3841;
                        z4 = z11;
                        layoutParams2 = layoutParams6;
                        i18 = i49;
                        iM2566 = i50;
                        jSONObject = jSONObject4;
                        i15 = length;
                        jSONArray = jSONArray3;
                        i57 = i57;
                        f5 = f5;
                        linearLayout2 = linearLayout3;
                        c2030 = c2031;
                        jSONObject2 = jSONObject5;
                        i54 = i54;
                        i56 = i56;
                        i16 = iM25613;
                        imageView3 = imageView5;
                        i17 = i55;
                        z6 = z15;
                        sArr4 = sArr7;
                        z5 = z12;
                        TextView textView110 = textView5;
                        i47 = i47;
                        z14 = z14;
                        i51 = i51;
                        i52 = i52;
                        iM6431 = iM6431;
                        i53 = i53;
                        textView2 = textView110;
                        int iM69815 = C2105.m6981("᩶ۨ") ^ i43;
                        z12 = z5;
                        jSONArray3 = jSONArray;
                        length = i15;
                        iM25613 = i16;
                        sArr7 = sArr4;
                        i50 = iM2566;
                        jSONObject4 = jSONObject;
                        jSONObject5 = jSONObject2;
                        z15 = z6;
                        layoutParams6 = layoutParams2;
                        c12592 = this;
                        i45 = iM69815 ^ (-1680797296);
                        i44 = ((iM69815 ^ i42) * 15095) ^ 1778222423;
                        c2031 = c2030;
                        linearLayout3 = linearLayout2;
                        i55 = i17;
                        imageView5 = imageView3;
                        z11 = z4;
                        i49 = i18;
                        i56 = i56;
                        i54 = i54;
                        strM3841 = str2;
                        f5 = f5;
                        i57 = i57;
                        int i6116 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i6116;
                    }
                    break;
                case -575200482:
                case 1444909694:
                    str = strM3841;
                    z = z11;
                    layoutParams = layoutParams6;
                    i = i48;
                    int i85 = i51;
                    int i86 = i52;
                    iM6431 = iM6431;
                    i3 = i57;
                    f = f5;
                    i53 = i53;
                    int i87 = i54;
                    textView2 = textView5;
                    int i88 = i56;
                    i47 = i47;
                    imageView = imageView5;
                    i4 = i55;
                    z2 = z15;
                    sArr2 = sArr7;
                    linearLayout3.setGravity(i85);
                    linearLayout3.setBaselineAligned(z16);
                    C19890.m45741(linearLayout3);
                    z14 = z14;
                    linearLayout3.setClickable(z14);
                    float f8 = i86;
                    float f9 = 12;
                    i51 = i85;
                    linearLayout3.setPadding(ViewOnClickListenerC1958.m6431(f8), C1294.m4384(f9), ViewOnClickListenerC1958.m6431(f8), C1294.m4384(f9));
                    if (C3432.m10477() <= 0) {
                        i52 = i86;
                        f4 = f9;
                        i5 = i88;
                        i54 = i87;
                        z11 = z;
                        int iM256110 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                        linearLayout6 = null;
                        f5 = f;
                        sArr7 = sArr2;
                        i48 = i;
                        i57 = i3;
                        z15 = z2;
                        i55 = i4;
                        imageView5 = imageView;
                        i56 = i5;
                        i44 = ((iM256110 ^ i42) * 5679) ^ (-203711777);
                        layoutParams6 = layoutParams;
                        i45 = iM256110 ^ 1530493610;
                        strM3841 = str;
                        int i6117 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i6117;
                    } else {
                        LinearLayout linearLayout10 = new LinearLayout(activityC6242);
                        linearLayout10.setOrientation(1);
                        boolean z20 = !z13;
                        TextView textViewM277612 = C11203.m27769(activityC6242, 14.0f, z20);
                        i52 = i86;
                        C1047.m3601(textViewM277612, C21923.m49332(jSONObject6, C1773.m5917(f37974, 60, 8, i46)));
                        C4159.m12574(linearLayout10, textViewM277612);
                        if (C4616.f14690 <= 0) {
                            z11 = z20;
                            i5 = i88;
                            i54 = i87;
                            f4 = f9;
                            int iM256111 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                            linearLayout6 = null;
                            f5 = f;
                            sArr7 = sArr2;
                            i48 = i;
                            i57 = i3;
                            z15 = z2;
                            i55 = i4;
                            imageView5 = imageView;
                            i56 = i5;
                            i44 = ((iM256111 ^ i42) * 5679) ^ (-203711777);
                            layoutParams6 = layoutParams;
                            i45 = iM256111 ^ 1530493610;
                            strM3841 = str;
                            int i6118 = i51;
                            z14 = z14;
                            i47 = i47;
                            textView5 = textView2;
                            i53 = i53;
                            iM6431 = iM6431;
                            i52 = i52;
                            i51 = i6118;
                        } else {
                            int iM25621 = (C0630.m2566("֫ᩴ") + i43) * 29;
                            int i89 = ((iM25621 ^ i42) * 19267) ^ 2147175083;
                            layoutParams6 = layoutParams;
                            sArr7 = sArr2;
                            i48 = i;
                            i45 = iM25621 ^ 1048843724;
                            z15 = z2;
                            strM3841 = str;
                            i55 = i4;
                            imageView5 = imageView;
                            i56 = i88;
                            i54 = i87;
                            f5 = f;
                            i57 = i3;
                            linearLayout6 = linearLayout10;
                            i44 = i89;
                            z11 = z20;
                            f4 = f9;
                            z14 = z14;
                            i47 = i47;
                            textView5 = textView2;
                            i53 = i53;
                            iM6431 = iM6431;
                            i52 = i52;
                            i51 = i51;
                        }
                    }
                    break;
                case -538974524:
                case 977410282:
                    str3 = strM3841;
                    z7 = z11;
                    layoutParams3 = layoutParams6;
                    jSONArray2 = jSONArray3;
                    i57 = i57;
                    f5 = f5;
                    i54 = i54;
                    i56 = i56;
                    imageView5 = imageView5;
                    i55 = i55;
                    z8 = z15;
                    sArr5 = sArr7;
                    TextView textView20 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView20;
                    jSONObject6 = jSONArray2.getJSONObject(i48);
                    C4159.m12575(jSONObject6, C1128.m3841(f37974, 37, 18, i46));
                    dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
                    z13 = jSONObject6.getBoolean(C1504.m5177(f37974, 55, 5, i46));
                    linearLayout3 = new LinearLayout(activityC6242);
                    if (C3537.m10746() <= 0) {
                        iM6982 = (C0630.m2566("ᩳۤ") ^ i42) * 55;
                        i21 = ((iM6982 ^ i43) * (-5319)) ^ (-1022742117);
                        i22 = 850408299;
                    } else {
                        iM6982 = (C2105.m6981("ۧܺ") + i42) * (-45);
                        i21 = ((iM6982 ^ i43) * 16343) ^ (-900528359);
                        i22 = 454417564;
                    }
                    int i712 = iM6982 ^ i22;
                    jSONArray3 = jSONArray2;
                    i44 = i21;
                    layoutParams6 = layoutParams3;
                    sArr7 = sArr5;
                    z11 = z7;
                    i45 = i712;
                    z15 = z8;
                    strM3841 = str3;
                    i55 = i55;
                    imageView5 = imageView5;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i6119 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i6119;
                    break;
                case -368696332:
                case 812524646:
                    textView2 = textView5;
                    i46 = 35758;
                    iM6981 = (i43 - C2105.m6981("ܶ۟")) * (-115);
                    i44 = ((iM6981 ^ i42) * (-16309)) ^ 150638468;
                    i14 = -949592744;
                    int i61110 = iM6981 ^ i14;
                    jSONArray3 = jSONArray3;
                    length = length;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    jSONObject4 = jSONObject4;
                    i50 = i50;
                    z12 = z12;
                    iM25613 = iM25613;
                    z15 = z15;
                    layoutParams6 = layoutParams6;
                    i45 = i61110;
                    jSONObject5 = jSONObject5;
                    i55 = i55;
                    imageView5 = imageView5;
                    c12592 = this;
                    c2031 = c2031;
                    linearLayout3 = linearLayout3;
                    i56 = i56;
                    i54 = i54;
                    i49 = i49;
                    f5 = f5;
                    z11 = z11;
                    i57 = i57;
                    int i61111 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i61111;
                    break;
                case -282672476:
                case 2126522202:
                    layoutParams5 = layoutParams6;
                    i37 = i48;
                    strM3841 = C1128.m3841(f37974, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 1, i46);
                    iM6984 = (C2105.m6981("۟֡") ^ i42) * 95;
                    i38 = ((iM6984 ^ i43) * (-12125)) ^ 404294823;
                    i39 = 965163476;
                    int i90 = iM6984 ^ i39;
                    i48 = i37;
                    LinearLayout.LayoutParams layoutParams8 = layoutParams5;
                    i45 = i90;
                    i44 = i38;
                    layoutParams6 = layoutParams8;
                    break;
                case -139061653:
                case 1362267066:
                    Object[] objArr = new Object[1];
                    objArr[i47] = C3245.m9931(iM10558);
                    layoutParams5 = layoutParams6;
                    i37 = i48;
                    String strM10566 = ServiceConnectionC3453.m10566(activityC6242, C2105.m6981(C0630.m2575(f37974, 118, 3, i46)) ^ 2123084411, objArr);
                    StringBuilder sb2 = new StringBuilder();
                    C1420.m4905(sb2, strM3841);
                    C3245.m9923(sb2, strM10566);
                    RunnableC1937.m6377(textViewM27769, C0050.m947(sb2));
                    textViewM27769.setPadding(C1294.m4384(f4), i47, i47, i47);
                    if (z13) {
                        iM6984 = (C2105.m6981("ܺ۬") ^ i43) * 75;
                        i38 = ((iM6984 ^ i42) * 15503) ^ 666719477;
                        i39 = -1204202817;
                    } else {
                        iM6984 = C0630.m2566("ܽۙ") ^ i43;
                        i38 = ((iM6984 ^ i42) * (-31117)) ^ 257907311;
                        i39 = -557750880;
                    }
                    int i91 = iM6984 ^ i39;
                    i48 = i37;
                    LinearLayout.LayoutParams layoutParams9 = layoutParams5;
                    i45 = i91;
                    i44 = i38;
                    layoutParams6 = layoutParams9;
                    break;
                case -96934129:
                case 1847667932:
                    if (C0382.f1805) {
                        iM25610 = (C0630.m2566("ܿۗ") ^ i43) * (-109);
                        i2 = ((iM25610 ^ i42) * 19577) ^ (-740233459);
                        i40 = -398521489;
                    } else {
                        iM25610 = (i42 - C0630.m2566("֫֨")) * 51;
                        i2 = ((iM25610 ^ i43) * (-13831)) ^ (-855370300);
                        i40 = 1009310173;
                    }
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case -90979749:
                case 1957778443:
                    str = strM3841;
                    z = z11;
                    layoutParams = layoutParams6;
                    i = i48;
                    linearLayout = linearLayout4;
                    int i92 = i55;
                    f = f5;
                    z2 = z15;
                    sArr = sArr7;
                    textView = textView5;
                    C2105.m6978(textView, C0630.m2566(C3245.m9934(sArr, 78, 3, i46)) ^ 2130395665);
                    textView.setGravity(17);
                    if (C0714.f2697 < 0) {
                        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams10.topMargin = ViewOnClickListenerC1958.m6431(16);
                        C8058 c8059 = C8058.f24861;
                        C3663.m11165(linearLayout, textView, layoutParams10);
                        f5 = 12.0f;
                        z15 = true;
                        if (!C3663.f11553) {
                            int iM25622 = (C0630.m2566("۬ܿ") ^ i43) * (-69);
                            i2 = ((iM25622 ^ i42) * (-31333)) ^ (-888829728);
                            linearLayout4 = linearLayout;
                            textView5 = textView;
                            sArr7 = sArr;
                            layoutParams6 = layoutParams;
                            i48 = i;
                            strM3841 = str;
                            z11 = z;
                            i57 = -2;
                            i55 = -1;
                            i56 = 17;
                            i45 = iM25622 ^ 986760922;
                            i44 = i2;
                        } else {
                            i57 = -2;
                            i55 = -1;
                            i56 = 17;
                            int iM69816 = C2105.m6981("᩸ۨ") ^ i42;
                            linearLayout4 = linearLayout;
                            textView5 = textView;
                            sArr7 = sArr;
                            layoutParams6 = layoutParams;
                            i48 = i;
                            strM3841 = str;
                            i45 = iM69816 ^ 1787477692;
                            i44 = ((iM69816 ^ i43) * (-233)) ^ 784300920;
                            z11 = z;
                        }
                    } else {
                        linearLayout4 = linearLayout;
                        i47 = i47;
                        sArr2 = sArr;
                        z14 = z14;
                        i51 = i51;
                        i52 = i52;
                        iM6431 = iM6431;
                        imageView = imageView5;
                        z11 = z;
                        i3 = -2;
                        i4 = i92;
                        i53 = i53;
                        i5 = 17;
                        textView2 = textView;
                        int iM256112 = (C0630.m2566("ܿܿ") ^ i43) * (-71);
                        linearLayout6 = null;
                        f5 = f;
                        sArr7 = sArr2;
                        i48 = i;
                        i57 = i3;
                        z15 = z2;
                        i55 = i4;
                        imageView5 = imageView;
                        i56 = i5;
                        i44 = ((iM256112 ^ i42) * 5679) ^ (-203711777);
                        layoutParams6 = layoutParams;
                        i45 = iM256112 ^ 1530493610;
                        strM3841 = str;
                        int i61112 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i61112;
                    }
                    break;
                case -79430381:
                case 1723750760:
                    return;
                case -67948114:
                case 691283698:
                    str = strM3841;
                    z = z11;
                    layoutParams = layoutParams6;
                    i = i48;
                    i6 = i52;
                    int i93 = i54;
                    i7 = iM6431;
                    i8 = i57;
                    i11 = i56;
                    f2 = f5;
                    i9 = i53;
                    imageView2 = imageView5;
                    textView3 = textView5;
                    i13 = i55;
                    z3 = z15;
                    i12 = i47;
                    TextView textViewM277613 = C11203.m27769((Context) activityC6242, 12.0f, true);
                    i10 = i93;
                    sArr3 = sArr7;
                    RunnableC1937.m6377(textViewM277613, dateTimeInstance.format(new Date(jSONObject6.getLong(C4075.m12252(f37974, 68, 4, i46)))));
                    C2126.m7042(linearLayout6, textViewM277613);
                    if (z13) {
                        iM6983 = (C2105.m6981("֫᩵") + i43) * (-117);
                        i23 = ((iM6983 ^ i42) * 24187) ^ 371475357;
                        i24 = 1538966641;
                    } else {
                        iM6983 = (i42 - C0630.m2566("᩸ۧ")) * (-99);
                        i23 = ((iM6983 ^ i43) * (-31823)) ^ (-1613097378);
                        i24 = 1610037525;
                    }
                    int i810 = iM6983 ^ i24;
                    i47 = i12;
                    layoutParams6 = layoutParams;
                    sArr7 = sArr3;
                    i48 = i;
                    i45 = i810;
                    i44 = i23;
                    textView5 = textView3;
                    i53 = i9;
                    z15 = z3;
                    strM3841 = str;
                    iM6431 = i7;
                    i55 = i13;
                    imageView5 = imageView2;
                    i52 = i6;
                    i56 = i11;
                    i54 = i10;
                    z11 = z;
                    f5 = f2;
                    i57 = i8;
                    break;
                case 8732376:
                case 1503889452:
                    String str11 = strM3841;
                    boolean z21 = z11;
                    LinearLayout.LayoutParams layoutParams11 = layoutParams6;
                    int i94 = i48;
                    LinearLayout linearLayout11 = linearLayout4;
                    int i95 = i57;
                    int i96 = i55;
                    int i97 = i56;
                    float f10 = f5;
                    boolean z22 = z15;
                    ImageView imageView10 = imageView5;
                    imageView10.setImageResource(C2105.m6981(str5) ^ 2119654880);
                    imageView10.setImageTintList(ColorStateList.valueOf(C21943.f70299));
                    imageView10.setImportantForAccessibility(2);
                    float f11 = 36;
                    int i98 = i47;
                    C3663.m11165(linearLayout11, imageView10, new LinearLayout.LayoutParams(C1294.m4384(f11), C1294.m4384(f11)));
                    TextView textViewM277614 = C11203.m27769((Context) activityC6242, 15.0f, false);
                    sArr7 = f37974;
                    if (C3019.f9544 >= 0) {
                        iM2569 = C2105.m6981("ۢۨ") ^ i43;
                        i35 = ((iM2569 ^ i42) * 11025) ^ (-646697712);
                        i36 = 1359263758;
                    } else {
                        iM2569 = (C0630.m2566("᩵ۛ") + i42) * (-101);
                        i35 = ((iM2569 ^ i43) * 31897) ^ (-1950445314);
                        i36 = 257623336;
                    }
                    int i99 = iM2569 ^ i36;
                    linearLayout4 = linearLayout11;
                    i56 = i97;
                    f5 = f10;
                    z15 = z22;
                    layoutParams6 = layoutParams11;
                    strM3841 = str11;
                    i45 = i99;
                    i57 = i95;
                    i55 = i96;
                    z11 = z21;
                    imageView5 = imageView10;
                    i48 = i94;
                    textView5 = textViewM277614;
                    i44 = i35;
                    i47 = i98;
                    break;
                case 66834504:
                case 1626988165:
                    layoutParams6.topMargin = ViewOnClickListenerC1958.m6431(6);
                    iM25610 = C0630.m2566("֨ܽ") ^ i42;
                    i2 = ((iM25610 ^ i43) * 12405) ^ (-549658707);
                    i40 = 1149350000;
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                case 115655221:
                case 421126431:
                    str2 = strM3841;
                    z4 = z11;
                    linearLayout2 = linearLayout3;
                    layoutParams2 = layoutParams6;
                    c2030 = c2031;
                    jSONObject = jSONObject4;
                    jSONObject2 = jSONObject5;
                    i15 = length;
                    jSONArray = jSONArray3;
                    i57 = i57;
                    f5 = f5;
                    i16 = iM25613;
                    i54 = i54;
                    i56 = i56;
                    z5 = z12;
                    imageView3 = imageView5;
                    i17 = i55;
                    z6 = z15;
                    sArr4 = sArr7;
                    TextView textView21 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView21;
                    String str12 = c12592.f37979;
                    iM25612 = C0630.m2566(C2520.m8030(f37974, 1, 3, i46)) ^ 2126021466;
                    th = null;
                    iM2566 = C0630.m2566(C7811.m20837(f37974, 4, 3, i46)) ^ 2098952297;
                    if (RunnableC1937.f6483 < 0) {
                        int iM69817 = (i42 - C2105.m6981("ۢ֨")) * (-75);
                        str6 = str12;
                        i44 = ((iM69817 ^ i43) * (-13379)) ^ (-599728019);
                        z12 = z5;
                        jSONArray3 = jSONArray;
                        length = i15;
                        iM25613 = i16;
                        sArr7 = sArr4;
                        strM3841 = str2;
                        i50 = iM2566;
                        jSONObject4 = jSONObject;
                        jSONObject5 = jSONObject2;
                        z15 = z6;
                        layoutParams6 = layoutParams2;
                        c12592 = this;
                        i45 = iM69817 ^ 2067425487;
                        c2031 = c2030;
                        linearLayout3 = linearLayout2;
                        i55 = i17;
                        imageView5 = imageView3;
                        z11 = z4;
                        i49 = 8;
                        i56 = i56;
                        i54 = i54;
                        f5 = f5;
                        i57 = i57;
                        int i61113 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i61113;
                    } else {
                        str6 = str12;
                        i18 = 8;
                        int iM69818 = C2105.m6981("᩶ۨ") ^ i43;
                        z12 = z5;
                        jSONArray3 = jSONArray;
                        length = i15;
                        iM25613 = i16;
                        sArr7 = sArr4;
                        i50 = iM2566;
                        jSONObject4 = jSONObject;
                        jSONObject5 = jSONObject2;
                        z15 = z6;
                        layoutParams6 = layoutParams2;
                        c12592 = this;
                        i45 = iM69818 ^ (-1680797296);
                        i44 = ((iM69818 ^ i42) * 15095) ^ 1778222423;
                        c2031 = c2030;
                        linearLayout3 = linearLayout2;
                        i55 = i17;
                        imageView5 = imageView3;
                        z11 = z4;
                        i49 = i18;
                        i56 = i56;
                        i54 = i54;
                        strM3841 = str2;
                        f5 = f5;
                        i57 = i57;
                        int i61114 = i51;
                        z14 = z14;
                        i47 = i47;
                        textView5 = textView2;
                        i53 = i53;
                        iM6431 = iM6431;
                        i52 = i52;
                        i51 = i61114;
                    }
                    break;
                case 364250406:
                case 1144088139:
                    String str13 = strM3841;
                    boolean z23 = z11;
                    LinearLayout.LayoutParams layoutParams12 = layoutParams6;
                    int i100 = iM25613;
                    int i101 = iM6985;
                    int i102 = i49;
                    JSONObject jSONObject8 = jSONObject5;
                    int i103 = length;
                    i57 = i57;
                    float f12 = f5;
                    LinearLayout linearLayout12 = linearLayout3;
                    boolean z24 = z12;
                    C2030 c2033 = c2031;
                    int i104 = i50;
                    JSONArray jSONArray4 = jSONArray3;
                    int i105 = i54;
                    int i106 = i56;
                    ImageView imageView11 = imageView5;
                    int i107 = i55;
                    boolean z25 = z15;
                    short[] sArr10 = sArr7;
                    TextView textView22 = textView5;
                    i47 = i47;
                    z14 = z14;
                    i51 = i51;
                    i52 = i52;
                    iM6431 = iM6431;
                    i53 = i53;
                    textView2 = textView22;
                    LinearLayout linearLayout13 = (LinearLayout) C4263.m12813(activityC6242, i101);
                    JSONObject jSONObject9 = c12592.f37975;
                    if (jSONObject9 != null) {
                        int iM69819 = C2105.m6981("᩷֫") ^ i43;
                        i44 = ((iM69819 ^ i42) * (-13281)) ^ 55632852;
                        jSONArray3 = jSONArray4;
                        length = i103;
                        jSONObject4 = jSONObject9;
                        sArr7 = sArr10;
                        jSONObject5 = jSONObject8;
                        i50 = i104;
                        z12 = z24;
                        z15 = z25;
                        strM3841 = str13;
                        iM25613 = i100;
                        linearLayout5 = linearLayout13;
                        i55 = i107;
                        imageView5 = imageView11;
                        iM6985 = i101;
                        i56 = i106;
                        layoutParams6 = layoutParams12;
                        i54 = i105;
                        i45 = iM69819 ^ 141519710;
                        f5 = f12;
                        c2031 = c2033;
                        i57 = i57;
                        linearLayout3 = linearLayout12;
                        i49 = i102;
                        z11 = z23;
                    } else {
                        int iM69820 = C2105.m6981("۫ۖ") ^ i43;
                        jSONArray3 = jSONArray4;
                        length = i103;
                        jSONObject4 = jSONObject9;
                        sArr7 = sArr10;
                        i50 = i104;
                        z12 = z24;
                        jSONObject5 = jSONObject8;
                        z15 = z25;
                        c2031 = c2033;
                        iM25613 = i100;
                        linearLayout5 = linearLayout13;
                        linearLayout3 = linearLayout12;
                        i55 = i107;
                        imageView5 = imageView11;
                        i49 = i102;
                        iM6985 = i101;
                        i56 = i106;
                        layoutParams6 = layoutParams12;
                        i54 = i105;
                        z11 = z23;
                        i45 = iM69820 ^ (-1028084866);
                        i44 = ((iM69820 ^ i42) * (-24179)) ^ 1842678214;
                        f5 = f12;
                        strM3841 = str13;
                        i57 = i57;
                    }
                    int i61115 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i61115;
                    break;
                case 419106301:
                case 1621742062:
                    textView2 = textView5;
                    jSONObject3 = jSONObject5;
                    JSONArray jSONArray5 = jSONObject3.getJSONArray(C4263.m12817(f37974, 32, 5, i46));
                    jSONArray3 = jSONArray5;
                    length = jSONArray5.length();
                    z16 = z12;
                    i48 = 0;
                    int iM256113 = C0630.m2566("ۛۨ") ^ i43;
                    jSONObject5 = jSONObject3;
                    layoutParams6 = layoutParams6;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    i45 = iM256113 ^ 419339379;
                    i44 = ((iM256113 ^ i42) * (-24833)) ^ (-1568825342);
                    z15 = z15;
                    z11 = z11;
                    i55 = i55;
                    imageView5 = imageView5;
                    i56 = i56;
                    i54 = i54;
                    f5 = f5;
                    i57 = i57;
                    int i61116 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i61116;
                    break;
                case 420665439:
                case 2110027819:
                    textView2 = textView5;
                    i46 = 34917;
                    iM6981 = (i43 - C2105.m6981("ܶ۟")) * (-115);
                    i44 = ((iM6981 ^ i42) * (-16309)) ^ 150638468;
                    i14 = -949592744;
                    int i61117 = iM6981 ^ i14;
                    jSONArray3 = jSONArray3;
                    length = length;
                    sArr7 = sArr7;
                    strM3841 = strM3841;
                    jSONObject4 = jSONObject4;
                    i50 = i50;
                    z12 = z12;
                    iM25613 = iM25613;
                    z15 = z15;
                    layoutParams6 = layoutParams6;
                    i45 = i61117;
                    jSONObject5 = jSONObject5;
                    i55 = i55;
                    imageView5 = imageView5;
                    c12592 = this;
                    c2031 = c2031;
                    linearLayout3 = linearLayout3;
                    i56 = i56;
                    i54 = i54;
                    i49 = i49;
                    f5 = f5;
                    z11 = z11;
                    i57 = i57;
                    int i61118 = i51;
                    z14 = z14;
                    i47 = i47;
                    textView5 = textView2;
                    i53 = i53;
                    iM6431 = iM6431;
                    i52 = i52;
                    i51 = i61118;
                    break;
                case 580642819:
                case 963833125:
                    str4 = strM3841;
                    z9 = z11;
                    layoutParams4 = layoutParams6;
                    i25 = i48;
                    TextView textView23 = textView5;
                    i26 = i57;
                    i27 = i55;
                    f3 = f5;
                    z10 = z15;
                    sArr6 = sArr7;
                    i28 = i47;
                    i29 = iM6431;
                    int i108 = i53;
                    textView4 = textView23;
                    int i109 = i54;
                    i30 = i56;
                    i31 = i109;
                    linearLayout4.setPadding(i29, i108, i31, C1294.m4384(60));
                    i32 = i108;
                    imageView4 = new ImageView(activityC6242);
                    strM4902 = C1420.m4902(f37974, 75, 3, i46);
                    if (C1128.m3851() <= 0) {
                        iM2568 = (i42 - C0630.m2566("᩻ۚ")) * 109;
                        i33 = ((iM2568 ^ i43) * 13527) ^ (-995579755);
                        i34 = -1631154189;
                    } else {
                        iM2568 = C0630.m2566("ᩳܽ") ^ i42;
                        i33 = ((iM2568 ^ i43) * (-11395)) ^ (-744514944);
                        i34 = -542813199;
                    }
                    int i512 = iM2568 ^ i34;
                    sArr7 = sArr6;
                    i56 = i30;
                    f5 = f3;
                    z15 = z10;
                    i48 = i25;
                    i54 = i31;
                    i57 = i26;
                    i55 = i27;
                    imageView5 = imageView4;
                    layoutParams6 = layoutParams4;
                    str5 = strM4902;
                    i45 = i512;
                    i44 = i33;
                    strM3841 = str4;
                    z11 = z9;
                    int i513 = i32;
                    iM6431 = i29;
                    i47 = i28;
                    textView5 = textView4;
                    i53 = i513;
                    break;
                case 616953484:
                case 2031389363:
                    String str14 = strM3841;
                    boolean z26 = z11;
                    LinearLayout.LayoutParams layoutParams13 = layoutParams6;
                    JSONArray jSONArray6 = jSONArray3;
                    int i110 = iM6431;
                    i8 = i57;
                    f2 = f5;
                    int i111 = i53;
                    int i112 = i54;
                    TextView textView24 = textView5;
                    int i113 = i56;
                    int i114 = i47;
                    ImageView imageView12 = imageView5;
                    int i115 = i55;
                    boolean z27 = z15;
                    short[] sArr11 = sArr7;
                    i51 = 16;
                    z14 = true;
                    int i116 = length;
                    if (i48 < i116) {
                        iM2567 = C2105.m6981("ۡۘ") ^ i42;
                        i19 = ((iM2567 ^ i43) * 3763) ^ (-1925924235);
                        i20 = 16542928;
                    } else {
                        iM2567 = C0630.m2566("ۜܳ") ^ i43;
                        i19 = ((iM2567 ^ i42) * 31507) ^ 1033182791;
                        i20 = -757398696;
                    }
                    int i117 = iM2567 ^ i20;
                    jSONArray3 = jSONArray6;
                    length = i116;
                    i44 = i19;
                    layoutParams6 = layoutParams13;
                    sArr7 = sArr11;
                    strM3841 = str14;
                    z11 = z26;
                    i45 = i117;
                    i47 = i114;
                    z15 = z27;
                    textView5 = textView24;
                    i53 = i111;
                    i55 = i115;
                    imageView5 = imageView12;
                    iM6431 = i110;
                    i56 = i113;
                    i54 = i112;
                    i52 = 20;
                    f5 = f2;
                    i57 = i8;
                    break;
                case 866991643:
                case 1693015756:
                    layoutParams5 = layoutParams6;
                    i37 = i48;
                    C3663.m11165(linearLayout3, linearLayout6, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    textViewM27769 = C11203.m27769(activityC6242, 14.0f, z11);
                    iM10558 = ServiceConnectionC3453.m10558(jSONObject6, C0483.m2128(f37974, UMErrorCode.E_UM_BE_CREATE_FAILED, 6, i46));
                    if (iM10558 > 0) {
                        int iM25623 = (C0630.m2566("ܰۗ") ^ i42) * (-83);
                        layoutParams6 = layoutParams5;
                        i48 = i37;
                        i45 = iM25623 ^ 1212810096;
                        i44 = ((iM25623 ^ i43) * 30087) ^ 1703216433;
                        i47 = 0;
                    } else {
                        strM3841 = str7;
                        i47 = 0;
                        iM6984 = (C2105.m6981("۟֡") ^ i42) * 95;
                        i38 = ((iM6984 ^ i43) * (-12125)) ^ 404294823;
                        i39 = 965163476;
                        int i910 = iM6984 ^ i39;
                        i48 = i37;
                        LinearLayout.LayoutParams layoutParams14 = layoutParams5;
                        i45 = i910;
                        i44 = i38;
                        layoutParams6 = layoutParams14;
                    }
                    break;
                case 1287442892:
                case 1338955983:
                    C4075.m12263();
                    iM25610 = C0630.m2566("֡᩹") ^ i42;
                    i2 = ((iM25610 ^ i43) * (-20479)) ^ 381411707;
                    i40 = 218532165;
                    i45 = iM25610 ^ i40;
                    i44 = i2;
                    break;
                default:
                    C22628.m50610(C4117.m12355(f37974, 26, 6, i46));
                    throw th;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC6242 activityC6242 = null;
        String str = null;
        int i = 0;
        C11887 e = null;
        String str2 = null;
        C18237 c18237M7511 = null;
        int i2 = 2089265183;
        int i3 = AbstractC2021.f6743;
        int i4 = C22628.f73083;
        int iM2566 = C0630.m2566("ܰܶ") ^ i4;
        int i5 = ((iM2566 ^ i3) * 21589) ^ (-1128653347);
        int i6 = 1850649755;
        while (true) {
            i2 = ((((i2 ^ i3) * (-5771)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -1890176303:
                case 228229851:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2566 = (C2105.m6981("۫᩹") + i4) * (-115);
                        i5 = ((iM2566 ^ i3) * 12955) ^ (-186665244);
                        i6 = -837852811;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵᩸")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-15185)) ^ (-1833426992);
                        i6 = 574775655;
                    }
                    break;
                case -1522778426:
                case 271342192:
                    break;
                case -1397742813:
                case 264466147:
                    str = activityC6242.f19311;
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ܽ᩹") + i3) * 23;
                        i5 = ((iM2566 ^ i4) * (-31683)) ^ (-1599391416);
                        i6 = -990647214;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۢۚ")) * 51;
                        i5 = ((iM2566 ^ i3) * 17189) ^ (-1312219268);
                        i6 = 87995356;
                    }
                    break;
                case -1391248684:
                case -49874476:
                    try {
                        this.f37975 = C23175.m51353(RunnableC1108.m3787(i));
                        iM2566 = (i4 - C2105.m6981("ܿ֡")) * (-63);
                        i5 = ((iM2566 ^ i3) * (-2195)) ^ (-245615012);
                        i6 = 1478860268;
                    } catch (C11887 e2) {
                        e = e2;
                        iM2566 = (C2105.m6981("֡ۚ") + i3) * 33;
                        i5 = ((iM2566 ^ i4) * 10563) ^ 1968745144;
                        i6 = 208303420;
                    }
                    break;
                case -1188023347:
                case -785360213:
                    if (C11233.m27802((Object) str, (Object) RunnableC3474.m10627())) {
                        iM2566 = C2105.m6981("ܶᩳ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-8125)) ^ (-307693071);
                        i6 = 177137136;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۙ") ^ i3) * (-115);
                        i5 = ((iM2566 ^ i4) * (-5863)) ^ 671016526;
                        i6 = 32488747;
                    }
                    break;
                case -1068135542:
                case -918682738:
                    C0798.m2998();
                    C1047.m3599();
                    iM2566 = (i4 - C2105.m6981("ܳ֫")) * (-3);
                    i5 = ((iM2566 ^ i3) * (-21659)) ^ (-1637457891);
                    i6 = 1227383302;
                    break;
                case -1065733080:
                case 1629341487:
                    if (C1005.m3501()) {
                        iM2566 = C0630.m2566("ۘۚ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-12507)) ^ (-1669679153);
                        i6 = 1983656842;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵᩸")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-15185)) ^ (-1833426992);
                        i6 = 574775655;
                    }
                    break;
                case -968044488:
                case 101748690:
                    if (C0798.f2919) {
                        iM2566 = (i3 - C0630.m2566("᩵᩸")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-15185)) ^ (-1833426992);
                        i6 = 574775655;
                    } else {
                        iM2566 = (C0630.m2566("۠ܰ") ^ i4) * (-25);
                        i5 = ((iM2566 ^ i3) * 26915) ^ 217651730;
                        i6 = -1283667354;
                    }
                    break;
                case -851235489:
                case 287234061:
                    this.f37979 = str2;
                    break;
                case -573905337:
                case 1650915802:
                    if (C1294.f4556 < 0) {
                        iM2566 = (C0630.m2566("ᩴۘ") + i4) * (-13);
                        i5 = ((iM2566 ^ i3) * 14453) ^ (-527443558);
                        i6 = -1972327573;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ܳ֫")) * (-3);
                        i5 = ((iM2566 ^ i3) * (-21659)) ^ (-1637457891);
                        i6 = 1227383302;
                    }
                    break;
                case -444832371:
                case -212645141:
                    c18237M7511 = C2272.m7511(4369);
                    if (C3663.m11168() >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩵᩸")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-15185)) ^ (-1833426992);
                        i6 = 574775655;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩵۟")) * 109;
                        i5 = ((iM2566 ^ i4) * 8645) ^ (-572259331);
                        i6 = -1095398429;
                    }
                    break;
                case -386390659:
                case 1538083966:
                    activityC6242 = this.f37976;
                    if (C0798.m2998() != 0) {
                        iM2566 = (i4 - C2105.m6981("ܳ֫")) * (-3);
                        i5 = ((iM2566 ^ i3) * (-21659)) ^ (-1637457891);
                        i6 = 1227383302;
                    } else {
                        iM2566 = C2105.m6981("ۤᩳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 5355) ^ (-1915669360);
                        i6 = 937378513;
                    }
                    break;
                case -344881538:
                case -142570099:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ܳ֫")) * (-3);
                        i5 = ((iM2566 ^ i3) * (-21659)) ^ (-1637457891);
                        i6 = 1227383302;
                    } else {
                        iM2566 = C0630.m2566("᩶ۨ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 7645) ^ (-302815968);
                        i6 = -1864014711;
                    }
                    break;
                case -331811090:
                case 546727691:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ᩴۘ") + i4) * (-13);
                        i5 = ((iM2566 ^ i3) * 14453) ^ (-527443558);
                        i6 = -1972327573;
                    } else {
                        iM2566 = C0630.m2566("᩵֡") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-29509)) ^ (-1160913313);
                        i6 = 1901411428;
                    }
                    break;
                case 37532733:
                case 1845666888:
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ܽ᩹") + i3) * 23;
                        i5 = ((iM2566 ^ i4) * (-31683)) ^ (-1599391416);
                        i6 = -990647214;
                    } else {
                        iM2566 = (C2105.m6981("ۗۖ") ^ i3) * (-27);
                        i5 = ((iM2566 ^ i4) * (-13345)) ^ 1220196214;
                        i6 = -1122682781;
                    }
                    break;
                case 77122664:
                case 2038541094:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩵᩸")) * (-65);
                        i5 = ((iM2566 ^ i4) * (-15185)) ^ (-1833426992);
                        i6 = 574775655;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۘ") + i4) * (-13);
                        i5 = ((iM2566 ^ i3) * 14453) ^ (-527443558);
                        i6 = -1972327573;
                    }
                    break;
                case 128245872:
                case 1496495947:
                    str2 = "";
                    iM2566 = (C0630.m2566("ᩴ֫") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i5 = ((iM2566 ^ i3) * 26399) ^ 1649785771;
                    i6 = -1906169495;
                    break;
                case 169985317:
                case 544839008:
                    String strM13559 = C4616.m13559(e);
                    if (strM13559 == null) {
                        iM2566 = (C0630.m2566("ᩳۨ") + i3) * (-121);
                        i5 = ((iM2566 ^ i4) * (-31693)) ^ (-339156342);
                        i6 = 8371224;
                    } else {
                        str2 = strM13559;
                        iM2566 = (C0630.m2566("ᩴ֫") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM2566 ^ i3) * 26399) ^ 1649785771;
                        i6 = -1906169495;
                    }
                    break;
                case 393346009:
                case 1483529608:
                    RunnableC3474.m10630();
                    break;
                case 933724765:
                case 1643537482:
                    if (C2126.f7087) {
                        iM2566 = (i4 - C2105.m6981("ܳ֫")) * (-3);
                        i5 = ((iM2566 ^ i3) * (-21659)) ^ (-1637457891);
                        i6 = 1227383302;
                    } else {
                        iM2566 = C0630.m2566("֫᩺") ^ i4;
                        i5 = ((iM2566 ^ i3) * 21033) ^ 1119493716;
                        i6 = -560837966;
                    }
                    break;
                case 1152713547:
                case 1375322288:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("۫᩹") + i4) * (-115);
                        i5 = ((iM2566 ^ i3) * 12955) ^ (-186665244);
                        i6 = -837852811;
                    } else {
                        iM2566 = C2105.m6981("᩶᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-16013)) ^ 1697100987;
                        i6 = 1628324634;
                    }
                    break;
                case 1545900942:
                case 2141762408:
                    i = 4368;
                    iM2566 = (C2105.m6981("ۘۤ") + i4) * (-37);
                    i5 = ((iM2566 ^ i3) * (-141)) ^ (-385692030);
                    i6 = -887709279;
                    break;
                default:
                    this.f37978 = C23175.m51353(c18237M7511);
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int i = -1535988323;
        int i2 = C3245.f10203;
        int i3 = RunnableC0588.f2309;
        int iM2566 = (C0630.m2566("ۧ۟") + i2) * (-105);
        int i4 = ((iM2566 ^ i3) * (-6831)) ^ (-1138034180);
        int i5 = -45568594;
        while (true) {
            i = ((((i ^ i3) * (-4643)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1966287325:
                case -774438121:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("֫ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29343) ^ (-1868158011);
                        i5 = 1866562456;
                    } else {
                        iM2566 = (C2105.m6981("ۛۙ") + i3) * 7;
                        i4 = ((iM2566 ^ i2) * (-6559)) ^ (-462714526);
                        i5 = 690177550;
                    }
                    break;
                case -1929062477:
                case -28070077:
                    C0714.m2805();
                    if (!C2520.m8026()) {
                        iM2566 = (C2105.m6981("᩶ܺ") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * 26395) ^ 1147762663;
                        i5 = -941488924;
                    } else {
                        iM2566 = C2105.m6981("֫ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29343) ^ (-1868158011);
                        i5 = 1866562456;
                    }
                    break;
                case -1819671466:
                case -1283438215:
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۡۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14907) ^ (-1267477774);
                        i5 = 352318525;
                    } else {
                        iM2566 = C0630.m2566("ۡ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * 25235) ^ 1745038337;
                        i5 = -510185881;
                    }
                    break;
                case -1785339356:
                case 701696028:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18951)) ^ 2126376732;
                        i5 = 1633650192;
                    } else {
                        iM2566 = C0630.m2566("֨ۘ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 475) ^ 614282962;
                        i5 = 1481153214;
                    }
                    break;
                case -1489726044:
                case 1326314994:
                    C4075.m12246(this.f37976, exc, null);
                    iM2566 = (C0630.m2566("ۧܺ") ^ i2) * (-33);
                    i4 = ((iM2566 ^ i3) * (-6067)) ^ (-373345192);
                    i5 = -353393208;
                    break;
                case -1170121108:
                case -519167953:
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("֫ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29343) ^ (-1868158011);
                        i5 = 1866562456;
                    } else {
                        iM2566 = C2105.m6981("᩷ۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14663) ^ (-54010885);
                        i5 = 175292594;
                    }
                    break;
                case -1125131668:
                case 1295553796:
                    if (C5695.m16023() < 0) {
                        iM2566 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18951)) ^ 2126376732;
                        i5 = 1633650192;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11571) ^ (-895137738);
                        i5 = 1347113334;
                    }
                    break;
                case -1032750495:
                case -314345351:
                    C3663.m11168();
                    if (C0964.f3626 == 0) {
                        iM2566 = C2105.m6981("֫ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29343) ^ (-1868158011);
                        i5 = 1866562456;
                    } else {
                        iM2566 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18951)) ^ 2126376732;
                        i5 = 1633650192;
                    }
                    break;
                case -1007773258:
                case 543320557:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("ۡۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14907) ^ (-1267477774);
                        i5 = 352318525;
                    } else {
                        iM2566 = C2105.m6981("ۙܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32385) ^ (-2089701612);
                        i5 = -767302242;
                    }
                    break;
                case -978954140:
                case 483048277:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("᩶ܺ") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * 26395) ^ 1147762663;
                        i5 = -941488924;
                    } else {
                        iM2566 = C2105.m6981("ۨ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22795)) ^ 686849964;
                        i5 = 195726711;
                    }
                    break;
                case -911196040:
                case 1120830748:
                    C3746.m11369();
                    break;
                case -640089448:
                case 440289210:
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("ۖ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32305) ^ 652944486;
                        i5 = -1218208991;
                    } else {
                        iM2566 = C0630.m2566("ۡۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14907) ^ (-1267477774);
                        i5 = 352318525;
                    }
                    break;
                case 262537835:
                case 1126575766:
                    C4263.m12819();
                    C3663.m11168();
                    iM2566 = C0630.m2566("ۘ᩹") ^ i3;
                    i4 = ((iM2566 ^ i2) * 11571) ^ (-895137738);
                    i5 = 1347113334;
                    break;
                case 374345199:
                case 781761797:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C2105.m6981("᩶ܺ") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * 26395) ^ 1147762663;
                        i5 = -941488924;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * 32145) ^ (-1987478638);
                        i5 = -1464508214;
                    }
                    break;
                case 648578414:
                case 1637091725:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18951)) ^ 2126376732;
                        i5 = 1633650192;
                    } else {
                        iM2566 = (C2105.m6981("ۧ᩶") ^ i2) * (-3);
                        i4 = ((iM2566 ^ i3) * (-22467)) ^ (-2092135146);
                        i5 = -2102575023;
                    }
                    break;
                case 1204525239:
                case 1689938573:
                    break;
                case 1270399408:
                case 2099412450:
                    if (m30859()) {
                        iM2566 = C2105.m6981("ܶ᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-8731)) ^ 16086018;
                        i5 = -688459682;
                    } else {
                        iM2566 = (C0630.m2566("ۧܺ") ^ i2) * (-33);
                        i4 = ((iM2566 ^ i3) * (-6067)) ^ (-373345192);
                        i5 = -353393208;
                    }
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("۫᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-18951)) ^ 2126376732;
                        i5 = 1633650192;
                    } else {
                        iM2566 = C0630.m2566("ۗܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19487) ^ 713826780;
                        i5 = -1741103806;
                    }
                    break;
            }
            return;
        }
    }
}
