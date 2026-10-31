package l;

import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D60A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5395 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩸۬᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f16754 = {208, -235, 7339, 13952};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16755;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20212 f16756;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC20212 activityC20212 = null;
        int i = 1165209958;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C3019.f9544;
        int iM6981 = C2105.m6981("ۜܺ") ^ i2;
        int i4 = ((iM6981 ^ i3) * 4139) ^ (-903795473);
        int i5 = -808581744;
        while (true) {
            i = ((((i ^ i3) * (-14425)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1946039476:
                case 2091910451:
                    activityC20212.m10224((Throwable) exc, true);
                    break;
                case -1798506086:
                case -156782943:
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("ۡۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3173) ^ 279389274;
                        i5 = -1239962910;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۫᩻")) * 27;
                        i4 = ((iM6981 ^ i2) * (-23385)) ^ (-67523478);
                        i5 = -1083445601;
                    }
                    break;
                case -1520683742:
                case 2111285852:
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = C2105.m6981("ۡۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3173) ^ 279389274;
                        i5 = -1239962910;
                    }
                    break;
                case -1377075717:
                case 1831278251:
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32033) ^ 950674230;
                        i5 = -1516192780;
                    }
                    break;
                case -1133494686:
                case 498220182:
                    if (C0050.m940() <= 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ᩴܶ")) * 47;
                        i4 = ((iM6981 ^ i2) * 12511) ^ (-1576639561);
                        i5 = -1515064249;
                    }
                    break;
                case -1054659780:
                case 94471605:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C2105.m6981("ۛܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29977) ^ 662634916;
                        i5 = 471884495;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩷") + i2) * 87;
                        i4 = ((iM6981 ^ i3) * (-22187)) ^ (-1499009877);
                        i5 = -1067098025;
                    }
                    break;
                case -588082676:
                case 1524663221:
                    ViewOnClickListenerC1958.m6429();
                    C0382.m1848();
                    iM6981 = (i3 - C2105.m6981("۫᩻")) * 27;
                    i4 = ((iM6981 ^ i2) * (-23385)) ^ (-67523478);
                    i5 = -1083445601;
                    break;
                case -290390303:
                case 2020569190:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = C0630.m2566("ۡۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 20429) ^ (-1986015127);
                        i5 = -988493970;
                    }
                    break;
                case -243191680:
                case 1830293763:
                    C3663.m11168();
                    if (C22628.f73083 > 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = (C2105.m6981("ܿۗ") ^ i2) * (-11);
                        i4 = ((iM6981 ^ i3) * 15599) ^ 1083039062;
                        i5 = 1950223498;
                    }
                    break;
                case 8285842:
                case 1230479399:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C2105.m6981("ۡۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3173) ^ 279389274;
                        i5 = -1239962910;
                    } else {
                        iM6981 = C0630.m2566("ۖ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8251) ^ 1820299387;
                        i5 = -43394057;
                    }
                    break;
                case 281590883:
                case 1575450260:
                    if (C11340.m28031()) {
                        iM6981 = (C2105.m6981("ۢܶ") + i2) * 19;
                        i4 = ((iM6981 ^ i3) * (-6019)) ^ (-984490952);
                        i5 = 705144878;
                    } else {
                        iM6981 = C2105.m6981("ۡۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 3173) ^ 279389274;
                        i5 = -1239962910;
                    }
                    break;
                case 590949182:
                case 1293679387:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (i3 - C2105.m6981("۫᩻")) * 27;
                        i4 = ((iM6981 ^ i2) * (-23385)) ^ (-67523478);
                        i5 = -1083445601;
                    } else {
                        iM6981 = C2105.m6981("ۙۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16681)) ^ 138620263;
                        i5 = -2138684294;
                    }
                    break;
                case 702803517:
                case 1837945299:
                    activityC20212 = this.f16756;
                    if (C0483.m2121()) {
                        iM6981 = (i3 - C2105.m6981("֨᩷")) * (-57);
                        i4 = ((iM6981 ^ i2) * 21013) ^ (-61337892);
                        i5 = 1803894164;
                    } else {
                        iM6981 = C2105.m6981("ۛܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29977) ^ 662634916;
                        i5 = 471884495;
                    }
                    break;
                case 1223903742:
                case 1571576792:
                    if (AbstractC2021.m6574()) {
                        iM6981 = (i3 - C2105.m6981("۫᩻")) * 27;
                        i4 = ((iM6981 ^ i2) * (-23385)) ^ (-67523478);
                        i5 = -1083445601;
                    } else {
                        iM6981 = C2105.m6981("ۧ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26565)) ^ 58360742;
                        i5 = -2069109586;
                    }
                    break;
                case 1762308487:
                case 2007170722:
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C2105.m6981("ۡܿ") ^ i3) * 23;
                        i4 = ((iM6981 ^ i2) * 8331) ^ (-561960547);
                        i5 = -843950504;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 8883) ^ (-75003610);
                        i5 = -1801945139;
                    }
                    break;
                default:
                    C4263.m12819();
                    break;
            }
            return;
        }
    }

    public C5395(ActivityC20212 activityC20212) {
        ArrayList arrayList = null;
        int i = -1472814055;
        int i2 = C0422.f1886;
        int i3 = AbstractC2021.f6743;
        this.f16756 = activityC20212;
        int iM6981 = (i2 - C2105.m6981("᩸᩵")) * (-29);
        int i4 = ((iM6981 ^ i3) * (-9675)) ^ (-300754952);
        int i5 = 173017635;
        while (true) {
            i = ((((i ^ i3) * 13467) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2001147131:
                case -1068889117:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27769)) ^ (-1562424466);
                        i5 = 762037599;
                    } else {
                        iM6981 = C2105.m6981("۬ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14441)) ^ 1228648811;
                        i5 = 1738520163;
                    }
                    break;
                case -1892391018:
                case -1411025387:
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("ܶܰ") + i3) * 77;
                        i4 = ((iM6981 ^ i2) * (-5449)) ^ 85877518;
                        i5 = -1725269156;
                    } else {
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-121);
                        i4 = ((iM6981 ^ i2) * (-663)) ^ 331252011;
                        i5 = 909661149;
                    }
                    break;
                case -1442795637:
                case 1875134988:
                    this.f16755 = arrayList;
                    return;
                case -1326829896:
                case 324753328:
                    if (C4159.m12565() >= 0) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27769)) ^ (-1562424466);
                        i5 = 762037599;
                    } else {
                        iM6981 = (C0630.m2566("۠ᩳ") + i2) * (-89);
                        i4 = ((iM6981 ^ i3) * (-20239)) ^ 179610680;
                        i5 = 374093208;
                    }
                    break;
                case -990643091:
                case 1796058575:
                    C22628.m50615();
                    C1420.m4913();
                    iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                    i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                    i5 = -941000492;
                    break;
                case -792642840:
                case 97005296:
                    if (C4075.m12263() <= 0) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27769)) ^ (-1562424466);
                        i5 = 762037599;
                    } else {
                        iM6981 = C2105.m6981("ۡܳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29451) ^ (-1636660040);
                        i5 = -220508153;
                    }
                    break;
                case -641280513:
                case 825608423:
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C0630.m2566("ۛۨ") ^ i3) * 87;
                        i4 = ((iM6981 ^ i2) * (-9873)) ^ 1580134351;
                        i5 = 418345261;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܽۢ")) * 73;
                        i4 = ((iM6981 ^ i3) * (-20645)) ^ (-1114251251);
                        i5 = -1438775772;
                    }
                    break;
                case -557798033:
                case 632946036:
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-27769)) ^ (-1562424466);
                        i5 = 762037599;
                    } else {
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-121);
                        i4 = ((iM6981 ^ i2) * (-663)) ^ 331252011;
                        i5 = 909661149;
                    }
                    break;
                case -484062820:
                case -365899916:
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("֨ۙ") ^ i3) * (-7);
                        i4 = ((iM6981 ^ i2) * (-4711)) ^ 1783854956;
                        i5 = -828627410;
                    } else {
                        iM6981 = C0630.m2566("֨ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10097) ^ 2145498189;
                        i5 = -970237862;
                    }
                    break;
                case 105318952:
                case 1579964979:
                    if (C1005.m3501()) {
                        iM6981 = C0630.m2566("ۨۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26103) ^ 1923172672;
                        i5 = 1812884252;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                        i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                        i5 = -941000492;
                    }
                    break;
                case 436933652:
                case 897605031:
                    C0798.m2998();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-121);
                        i4 = ((iM6981 ^ i2) * (-663)) ^ 331252011;
                        i5 = 909661149;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                        i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                        i5 = -941000492;
                    }
                    break;
                case 669602223:
                case 1079716684:
                    arrayList = new ArrayList();
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                        i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                        i5 = -941000492;
                    } else {
                        iM6981 = C0630.m2566("᩵ۨ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-30107)) ^ 648005558;
                        i5 = -1290990073;
                    }
                    break;
                case 705438259:
                case 1961227489:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                        i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                        i5 = -941000492;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܶ᩹")) * 19;
                        i4 = ((iM6981 ^ i2) * 6193) ^ (-1147433047);
                        i5 = 1801336432;
                    }
                    break;
                case 1045759006:
                case 2067729033:
                    AbstractC2021.m6574();
                    C1005.m3501();
                    throw new RuntimeException();
                case 1052928973:
                case 1338420255:
                    C0483.m2121();
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ۛۨ") ^ i3) * 87;
                        i4 = ((iM6981 ^ i2) * (-9873)) ^ 1580134351;
                        i5 = 418345261;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܳ᩺")) * (-103);
                        i4 = ((iM6981 ^ i3) * (-3907)) ^ (-1848180110);
                        i5 = -941000492;
                    }
                    break;
                default:
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("۟۬") + i3) * (-121);
                        i4 = ((iM6981 ^ i2) * (-663)) ^ 331252011;
                        i5 = 909661149;
                    } else {
                        iM6981 = (C0630.m2566("ۢ֡") ^ i3) * 75;
                        i4 = ((iM6981 ^ i2) * 22329) ^ (-902058506);
                        i5 = 1704984956;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e9 A[PHI: r2 r14
      0x00e9: PHI (r2v3 l.᩶ܰܽ) = (r2v2 l.᩶ܰܽ), (r2v2 l.᩶ܰܽ), (r2v2 l.᩶ܰܽ), (r2v5 l.᩶ܰܽ) binds: [B:17:0x0072, B:15:0x006e, B:12:0x0068, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v5 short[]) binds: [B:17:0x0072, B:15:0x006e, B:12:0x0068, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0174 A[PHI: r12 r15
      0x0174: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:44:0x0172, B:31:0x00cf, B:15:0x006e, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:44:0x0172, B:31:0x00cf, B:15:0x006e, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e7 A[PHI: r3 r8
      0x01e7: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:56:0x01e5, B:27:0x00b2, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01e5, B:27:0x00b2, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021b A[PHI: r7 r10 r11
      0x021b: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:60:0x0219, B:48:0x01aa, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:60:0x0219, B:48:0x01aa, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:60:0x0219, B:48:0x01aa, B:9:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024d A[PHI: r4 r5 r9 r20
      0x024d: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:64:0x024b, B:52:0x01c7, B:23:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:64:0x024b, B:52:0x01c7, B:23:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x024b, B:52:0x01c7, B:23:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x024b, B:52:0x01c7, B:23:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int i3 = C3911.f12484;
        int i4 = C0050.f910;
        int iM6982 = (C2105.m6981("ۚ۬") ^ i4) * 101;
        int i5 = ((iM6982 ^ i3) * 10415) ^ 1738579313;
        String strM12578 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ 1477343552;
        ActivityC20212 activityC20212 = null;
        int iM6983 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 40204592;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-653)) >> 31));
            switch (i14) {
                case -2101754601:
                case -1232535190:
                    i11 = 282307204;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C2105.m6981("ܽ۠") + i4) * (-33);
                        i = ((iM6981 ^ i3) * (-23335)) ^ (-898336342);
                        i2 = -14537265;
                    } else {
                        iM6981 = C0630.m2566("ۢܰ") ^ i4;
                        i = ((iM6981 ^ i3) * (-22545)) ^ (-2114618955);
                        i2 = 1388203658;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1849998211:
                case -524108456:
                    C3019.m9255();
                    C1773.m5908();
                    iM6981 = C0630.m2566("᩸ۜ") ^ i4;
                    i = ((iM6981 ^ i3) * 15437) ^ 1573855580;
                    i2 = 551979246;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1824446737:
                case -599740735:
                    ServiceConnectionC3453.m10564();
                    C1504.m5179();
                    break;
                case -1746186150:
                case -1648471591:
                    if (C0630.f2410 > 0) {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 15437) ^ 1573855580;
                        i2 = 551979246;
                    } else {
                        iM6981 = (C2105.m6981("ܽ۠") + i4) * (-33);
                        i = ((iM6981 ^ i3) * (-23335)) ^ (-898336342);
                        i2 = -14537265;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1674153234:
                case 1075235928:
                    m20267(activityC20212, iM6983 ^ i7);
                    break;
                case -1534291850:
                case 856091641:
                    c = 0;
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * (-27787)) ^ 458724572;
                        i2 = 253951951;
                    } else {
                        iM6981 = (C0630.m2566("ܺۖ") + i3) * (-7);
                        i = ((iM6981 ^ i4) * 21375) ^ 198288667;
                        i2 = -1109623628;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1387416492:
                case -177643875:
                    sArr = f16754;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("֡ۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 21721) ^ (-1115508346);
                        i2 = -809214724;
                    } else {
                        iM6981 = (C2105.m6981("ۢۢ") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i3) * 19439) ^ (-2045989667);
                        i2 = -1238573534;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1373925553:
                case -831132214:
                    int i15 = i10 + i11;
                    if (i9 - (i15 + i15) > 0) {
                        iM6981 = C0630.m2566("ᩳ֫") ^ i3;
                        i = ((iM6981 ^ i4) * (-9481)) ^ 1120150772;
                        i2 = -1089091928;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩻۫")) * (-17);
                        i = ((iM6981 ^ i3) * 16149) ^ (-1022113127);
                        i2 = -352123989;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1268375016:
                case 304077277:
                    s = sArr[c];
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("ۛۗ") ^ i3) * (-25);
                        i = ((iM6981 ^ i4) * 23467) ^ (-1866086049);
                        i2 = -464055419;
                    } else {
                        iM6981 = (i3 - C0630.m2566("֡ۙ")) * (-27);
                        i = ((iM6981 ^ i4) * (-15689)) ^ (-1486987554);
                        i2 = 1977005282;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1223740385:
                case -562397039:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C1005.m3501()) {
                        iM6981 = C0630.m2566("۬ۧ") ^ i3;
                        i = ((iM6981 ^ i4) * (-503)) ^ 1786841392;
                        i2 = 1683635833;
                    } else {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * (-27787)) ^ 458724572;
                        i2 = 253951951;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -921006165:
                case 1612817547:
                    iM6983 = C2105.m6981(strM12578);
                    i7 = 2099393744;
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("֡ۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 21721) ^ (-1115508346);
                        i2 = -809214724;
                    } else {
                        iM6981 = C2105.m6981("᩺ۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 10381) ^ (-1673591700);
                        i2 = 2060873575;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -767359618:
                case 1814044711:
                    i12 = 28282;
                    iM6981 = C2105.m6981("᩵֨") ^ i3;
                    i = ((iM6981 ^ i4) * (-8735)) ^ (-287994631);
                    i2 = 1021819226;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -741824269:
                case -439558789:
                    i8 = s + 16802;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("֡ۢ") ^ i3;
                        i = ((iM6981 ^ i4) * 21721) ^ (-1115508346);
                        i2 = -809214724;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * 8693) ^ 774479119;
                        i2 = 1269483479;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -232610513:
                case 1772610452:
                    i13 = 1;
                    if (C0050.f910 >= 0) {
                        iM6981 = (C2105.m6981("ܽ۠") + i4) * (-33);
                        i = ((iM6981 ^ i3) * (-23335)) ^ (-898336342);
                        i2 = -14537265;
                    } else {
                        iM6981 = C2105.m6981("ܰܳ") ^ i4;
                        i = ((iM6981 ^ i3) * 20283) ^ (-1379790368);
                        i2 = -398392410;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -209397441:
                case 1223993930:
                    C4159.m12565();
                    if (C1047.f3863 < 0) {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 15437) ^ 1573855580;
                        i2 = 551979246;
                    } else {
                        iM6981 = (C2105.m6981("ۛۗ") ^ i3) * (-25);
                        i = ((iM6981 ^ i4) * 23467) ^ (-1866086049);
                        i2 = -464055419;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -119651991:
                case 690474888:
                    C1005.m3501();
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (C2105.m6981("ܽ۠") + i4) * (-33);
                        i = ((iM6981 ^ i3) * (-23335)) ^ (-898336342);
                        i2 = -14537265;
                    } else {
                        iM6981 = C0630.m2566("᩻ۖ") ^ i4;
                        i = ((iM6981 ^ i3) * (-27787)) ^ 458724572;
                        i2 = 253951951;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 18724059:
                case 1509284133:
                    i12 = 55112;
                    iM6981 = C2105.m6981("᩵֨") ^ i3;
                    i = ((iM6981 ^ i4) * (-8735)) ^ (-287994631);
                    i2 = 1021819226;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 350550254:
                case 1434607201:
                    strM12578 = C4159.m12578(sArr2, i13, 3, i12);
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("ۛۗ") ^ i3) * (-25);
                        i = ((iM6981 ^ i4) * 23467) ^ (-1866086049);
                        i2 = -464055419;
                    } else {
                        iM6981 = C2105.m6981("۬ܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 19991) ^ 1604641900;
                        i2 = 804877428;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    activityC20212 = this.f16756;
                    sArr2 = f16754;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 15437) ^ 1573855580;
                        i2 = 551979246;
                    } else {
                        iM6981 = (C0630.m2566("ܽ۫") + i4) * 75;
                        i = ((iM6981 ^ i3) * 21355) ^ (-511022983);
                        i2 = -159252996;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (l.C0050.f910 >= 0) goto L20;
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1009() throws Throwable {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6 = C0050.f910;
        int i7 = C2520.f8000;
        int iM6982 = C2105.m6981("ܶۙ") ^ i7;
        int i8 = ((iM6982 ^ i6) * (-9445)) ^ (-488335212);
        ActivityC20212 activityC20212 = null;
        Object obj = null;
        Iterator it = null;
        int i9 = iM6982 ^ 28493680;
        ArrayList arrayList = null;
        final AtomicInteger atomicInteger = null;
        HashMap map = null;
        int iM1847 = 0;
        int i10 = 0;
        boolean zM5910 = false;
        int i11 = 739497844;
        C8918 c8918 = null;
        Throwable th = null;
        int i12 = 0;
        while (true) {
            i11 = i9 ^ (i8 & (((i11 ^ i6) * 739) >> 31));
            switch (i11) {
                case -2129046249:
                case -1419565099:
                    i10++;
                    iM6981 = C2105.m6981("᩷۬") ^ i6;
                    i = ((iM6981 ^ i7) * 27175) ^ 1998431048;
                    i5 = -939352917;
                    int i13 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i13;
                    i8 = i;
                    break;
                case -2103212888:
                case -278050575:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    C0714.m2815(th, obj);
                    iM6981 = (C0630.m2566("ۡ᩹") ^ i6) * 115;
                    i = ((iM6981 ^ i7) * (-14217)) ^ 562065019;
                    i5 = 484041461;
                    int i14 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i14;
                    i8 = i;
                    break;
                case -2023787189:
                case -762420206:
                    if (zM5910) {
                        iM2566 = (C2105.m6981("ܺۢ") ^ i6) * (-59);
                        i = ((iM2566 ^ i7) * 2203) ^ (-35655232);
                        i2 = -557949930;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ᩳۜ")) * (-73);
                        i = ((iM2566 ^ i6) * 783) ^ 533731208;
                        i2 = -2054323064;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -2022860000:
                case -1287587267:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (C5695.f17556 >= 0) {
                        iM2567 = (C0630.m2566("᩷֫") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2567 ^ i7) * 23965) ^ 760684329;
                        i4 = 2024718085;
                    } else {
                        iM2567 = C0630.m2566("ܳۨ") ^ i6;
                        i3 = ((iM2567 ^ i7) * 17219) ^ 264530161;
                        i4 = 1320782411;
                    }
                    AtomicInteger atomicInteger2 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger2;
                    break;
                case -1978209977:
                case 140374983:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = this.f16755;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ܰ᩶") ^ i6;
                        i = ((iM6981 ^ i7) * (-26837)) ^ (-1929095808);
                        i5 = 1073027891;
                    } else {
                        iM6981 = C2105.m6981("ܶ᩺") ^ i6;
                        i = ((iM6981 ^ i7) * (-15389)) ^ 1078552215;
                        i5 = -2071030969;
                    }
                    int i15 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i15;
                    i8 = i;
                    break;
                case -1961055445:
                case 1391548384:
                    if (C1773.f6144 <= 0) {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        iM6981 = C2105.m6981("ܰ᩶") ^ i6;
                        i = ((iM6981 ^ i7) * (-26837)) ^ (-1929095808);
                        i5 = 1073027891;
                        int i16 = iM6981 ^ i5;
                        c8918 = c8918;
                        atomicInteger = atomicInteger;
                        i9 = i16;
                        i8 = i;
                    } else {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = C0630.m2566("ۗۢ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 22961) ^ (-78784680);
                        i4 = 1737639626;
                        AtomicInteger atomicInteger3 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger3;
                    }
                    break;
                case -1929201222:
                case 1866560003:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (RunnableC1937.f6483 < 0) {
                        iM2567 = C2105.m6981("ۙ᩷") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-3341)) ^ (-2130531267);
                        i4 = -1640566554;
                        AtomicInteger atomicInteger4 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger4;
                    } else {
                        int iM6983 = (C2105.m6981("۠ܽ") ^ i6) * 33;
                        atomicInteger = atomicInteger;
                        i9 = iM6983 ^ (-1794912231);
                        i8 = ((iM6983 ^ i7) * 15777) ^ (-1879198996);
                        arrayList = arrayList;
                        c8918 = null;
                    }
                    break;
                case -1786172063:
                case 1789004934:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    activityC20212 = this.f16756;
                    if (C1711.f5919) {
                        iM2567 = C2105.m6981("᩹۟") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-1543)) ^ 1958616858;
                        i4 = -1370001107;
                    } else {
                        iM2567 = (C0630.m2566("ۧ֫") + i6) * 75;
                        i3 = ((iM2567 ^ i7) * 26827) ^ (-689913199);
                        i4 = 996245983;
                    }
                    AtomicInteger atomicInteger5 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger5;
                    break;
                case -1776911591:
                case 542754849:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    try {
                        C0050.m944(c8918, i12);
                        try {
                            AtomicInteger atomicInteger6 = new AtomicInteger();
                            try {
                                map = new HashMap();
                                try {
                                    iM1847 = C0382.m1847(activityC20212.f65390);
                                    int iM6984 = C2105.m6981("᩸۬") ^ i7;
                                    i9 = iM6984 ^ 1157047293;
                                    i8 = ((iM6984 ^ i6) * 32351) ^ 1900009338;
                                    arrayList = arrayList;
                                    c8918 = c8918;
                                    atomicInteger = atomicInteger6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicInteger = atomicInteger6;
                                    iM2567 = C2105.m6981("ۙۢ") ^ i7;
                                    i3 = ((iM2567 ^ i6) * (-7061)) ^ (-344394910);
                                    i4 = -396740717;
                                    AtomicInteger atomicInteger7 = atomicInteger;
                                    i9 = iM2567 ^ i4;
                                    i8 = i3;
                                    arrayList = arrayList;
                                    c8918 = c8918;
                                    atomicInteger = atomicInteger7;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                atomicInteger = atomicInteger6;
                                map = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            atomicInteger = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    break;
                case -1334469002:
                case 1139036378:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (C3683.f11629 >= 0) {
                        iM2567 = (C2105.m6981("֨᩷") + i7) * (-73);
                        i3 = ((iM2567 ^ i6) * 30713) ^ 87216572;
                        i4 = -512987592;
                    } else {
                        iM2567 = C0630.m2566("ܰᩴ") ^ i6;
                        i3 = ((iM2567 ^ i7) * 18985) ^ (-1725347468);
                        i4 = -1777866615;
                    }
                    AtomicInteger atomicInteger8 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger8;
                    break;
                case -1321445223:
                case -331983755:
                    C3663.m11168();
                    C3663.m11168();
                    return;
                case -1306758891:
                case -931929990:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (RunnableC1108.f4040) {
                        iM2567 = C2105.m6981("ۧۢ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 26799) ^ 909935184;
                        i4 = 1003588345;
                    } else {
                        iM2567 = C0630.m2566("ۗۢ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 22961) ^ (-78784680);
                        i4 = 1737639626;
                    }
                    AtomicInteger atomicInteger9 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger9;
                    break;
                case -1211804241:
                case -849563854:
                    C0964.m3413();
                    if (C0798.f2919) {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = (C0630.m2566("᩷֫") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM2567 ^ i7) * 23965) ^ 760684329;
                        i4 = 2024718085;
                        AtomicInteger atomicInteger10 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger10;
                    }
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    iM2567 = C2105.m6981("᩹۟") ^ i6;
                    i3 = ((iM2567 ^ i7) * (-1543)) ^ 1958616858;
                    i4 = -1370001107;
                    AtomicInteger atomicInteger11 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger11;
                    break;
                case -1203276043:
                case -969284840:
                    zM5910 = C1773.m5910(it);
                    iM2566 = C2105.m6981("ۙۚ") ^ i6;
                    i = ((iM2566 ^ i7) * (-11099)) ^ (-789932881);
                    i2 = 774611576;
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -1041144481:
                case -861586883:
                    if (!C0382.f1805) {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = C0630.m2566("۠ۧ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-19571)) ^ 1095512229;
                        i4 = 1190706017;
                        AtomicInteger atomicInteger12 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger12;
                    } else {
                        iM2566 = (i7 - C0630.m2566("۫᩻")) * 51;
                        i = ((iM2566 ^ i6) * 12841) ^ (-1465025087);
                        i2 = 980905891;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1024526482:
                case 1826286404:
                    C1773.m5908();
                    if (C4075.f12947 < 0) {
                        iM2566 = C2105.m6981("ۧ᩻") ^ i7;
                        i = ((iM2566 ^ i6) * 31283) ^ 1064339693;
                        i2 = -295616590;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = C2105.m6981("᩹۟") ^ i6;
                        i3 = ((iM2567 ^ i7) * (-1543)) ^ 1958616858;
                        i4 = -1370001107;
                        AtomicInteger atomicInteger13 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger13;
                    }
                    break;
                case -1018101954:
                case -866821299:
                    RunnableC1108.m3790();
                    C1504.m5179();
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    iM2567 = C0630.m2566("ۗۢ") ^ i7;
                    i3 = ((iM2567 ^ i6) * 22961) ^ (-78784680);
                    i4 = 1737639626;
                    AtomicInteger atomicInteger14 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger14;
                    break;
                case -816787235:
                case 620766226:
                    i10 = 0;
                    iM6981 = C2105.m6981("᩷۬") ^ i6;
                    i = ((iM6981 ^ i7) * 27175) ^ 1998431048;
                    i5 = -939352917;
                    int i17 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i17;
                    i8 = i;
                    break;
                case -809369088:
                case 453074297:
                    try {
                        final String str = (String) RunnableC1108.m3791(it);
                        ((C15859) ((C8739) C13843.computeIfAbsent(map, str, new Function() { // from class: l.֡ܰܽ

                            /* JADX INFO: renamed from: ۗۘ֫, reason: not valid java name and contains not printable characters */
                            private static final short[] f2012 = {6778, 8257, 8294, 8288, 8315, 8316, 8309, 8242};

                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo22274andThen(Function function) {
                                return C20696.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C20696.$default$compose(this, function);
                            }

                            {
                                int i18 = 1487189767;
                                int i19 = AbstractC2021.f6743;
                                int i20 = C1773.f6144;
                                int iM2568 = (C0630.m2566("ܽ۬") ^ i19) * 55;
                                int i21 = ((iM2568 ^ i20) * (-11111)) ^ 250618246;
                                int i22 = 1015572986;
                                while (true) {
                                    i18 = ((((i18 ^ i20) * 18151) >> 31) & i21) ^ (iM2568 ^ i22);
                                    switch (i18) {
                                        case -2090238146:
                                        case -1850944698:
                                            AbstractC2021.m6574();
                                            C4075.m12263();
                                            iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                            i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                            i22 = 1301338123;
                                            break;
                                        case -1986928573:
                                        case 1084004667:
                                            return;
                                        case -1809797687:
                                        case 1663918879:
                                            C3019.m9255();
                                            ViewOnClickListenerC1958.m6429();
                                            throw new RuntimeException();
                                        case -1676533804:
                                        case 902409837:
                                            if (C4263.f13799 <= 0) {
                                                iM2568 = (C0630.m2566("ۧܺ") ^ i19) * 47;
                                                i21 = ((iM2568 ^ i20) * (-12467)) ^ (-1934327146);
                                                i22 = 2028600598;
                                            } else {
                                                iM2568 = (i20 - C0630.m2566("۬ۧ")) * (-49);
                                                i21 = ((iM2568 ^ i19) * 28929) ^ 631088895;
                                                i22 = 2013163500;
                                            }
                                            break;
                                        case -1624342925:
                                        case 1467781881:
                                            if (C3683.f11629 < 0) {
                                                iM2568 = C2105.m6981("ۘۘ") ^ i19;
                                                i21 = ((iM2568 ^ i20) * (-3969)) ^ (-1696941950);
                                                i22 = -1106626776;
                                            } else {
                                                iM2568 = (C0630.m2566("ۧܺ") ^ i19) * 47;
                                                i21 = ((iM2568 ^ i20) * (-12467)) ^ (-1934327146);
                                                i22 = 2028600598;
                                            }
                                            break;
                                        case -1311078953:
                                        case 1703374853:
                                            if (RunnableC1937.f6483 >= 0) {
                                                iM2568 = (C0630.m2566("۟ۘ") + i20) * 53;
                                                i21 = ((iM2568 ^ i19) * 17693) ^ 95949639;
                                                i22 = 1351311401;
                                            } else {
                                                iM2568 = (C2105.m6981("֡۠") ^ i20) * (-23);
                                                i21 = ((iM2568 ^ i19) * (-18529)) ^ 1693906007;
                                                i22 = -113751364;
                                            }
                                            break;
                                        case -778071204:
                                        case -297057410:
                                            if (C2167.f7158 >= 0) {
                                                iM2568 = (C0630.m2566("۟ۘ") + i20) * 53;
                                                i21 = ((iM2568 ^ i19) * 17693) ^ 95949639;
                                                i22 = 1351311401;
                                            } else {
                                                iM2568 = (i19 - C2105.m6981("᩵ۢ")) * (-21);
                                                i21 = ((iM2568 ^ i20) * 1527) ^ 148094532;
                                                i22 = -1529181335;
                                            }
                                            break;
                                        case -565879677:
                                        case 1595410346:
                                            if (C5695.f17556 >= 0) {
                                                iM2568 = (C0630.m2566("᩶ۧ") + i20) * (-35);
                                                i21 = ((iM2568 ^ i19) * (-3595)) ^ (-133716286);
                                                i22 = 75824600;
                                            } else {
                                                iM2568 = C2105.m6981("᩺ܽ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 29449) ^ (-1497315205);
                                                i22 = 1119717697;
                                            }
                                            break;
                                        case -392141909:
                                        case 1381428770:
                                            RunnableC0588.m2441();
                                            if (C3746.f11829 <= 0) {
                                                iM2568 = (C0630.m2566("ۧܺ") ^ i19) * 47;
                                                i21 = ((iM2568 ^ i20) * (-12467)) ^ (-1934327146);
                                                i22 = 2028600598;
                                            } else {
                                                iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                                i22 = 1301338123;
                                            }
                                            break;
                                        case -248599408:
                                        case 2048183193:
                                            if (C3746.f11829 <= 0) {
                                                iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                                i22 = 1301338123;
                                            } else {
                                                iM2568 = C0630.m2566("᩶ۜ") ^ i19;
                                                i21 = ((iM2568 ^ i20) * 23087) ^ 1897161357;
                                                i22 = 1421001386;
                                            }
                                            break;
                                        case -230288858:
                                        case 193094658:
                                            if (C0630.m2564()) {
                                                iM2568 = (C0630.m2566("᩶ۧ") + i20) * (-35);
                                                i21 = ((iM2568 ^ i19) * (-3595)) ^ (-133716286);
                                                i22 = 75824600;
                                            } else {
                                                iM2568 = (i19 - C0630.m2566("ᩳۛ")) * 81;
                                                i21 = ((iM2568 ^ i20) * 27095) ^ (-585766852);
                                                i22 = -1672285780;
                                            }
                                            break;
                                        case -157073785:
                                        case -72788448:
                                            if (C7106.f21815 != 0) {
                                                iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                                i22 = 1301338123;
                                            } else {
                                                iM2568 = (C0630.m2566("᩻֨") + i19) * (-89);
                                                i21 = ((iM2568 ^ i20) * (-24303)) ^ 865051855;
                                                i22 = -2104703014;
                                            }
                                            break;
                                        case -35017742:
                                        case 2018168141:
                                            C0382.m1848();
                                            if (C0237.f1507 != 0) {
                                                iM2568 = (C0630.m2566("᩶ۧ") + i20) * (-35);
                                                i21 = ((iM2568 ^ i19) * (-3595)) ^ (-133716286);
                                                i22 = 75824600;
                                            } else {
                                                iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                                i22 = 1301338123;
                                            }
                                            break;
                                        case 35354127:
                                        case 769477823:
                                            if (C5695.m16023() >= 0) {
                                                iM2568 = C2105.m6981("ۗۙ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 27319) ^ (-2091855065);
                                                i22 = 1301338123;
                                            } else {
                                                iM2568 = C0630.m2566("ۜܶ") ^ i20;
                                                i21 = ((iM2568 ^ i19) * 17299) ^ (-240855463);
                                                i22 = 624942638;
                                            }
                                            break;
                                        case 1501918441:
                                        case 1812190388:
                                            if (C0798.f2919) {
                                                iM2568 = C2105.m6981("ۘۘ") ^ i19;
                                                i21 = ((iM2568 ^ i20) * (-3969)) ^ (-1696941950);
                                                i22 = -1106626776;
                                            } else {
                                                iM2568 = C0630.m2566("۬֫") ^ i20;
                                                i21 = ((iM2568 ^ i19) * (-8961)) ^ 1675394964;
                                                i22 = -1057554761;
                                            }
                                            break;
                                        default:
                                            if (C0050.f910 >= 0) {
                                                iM2568 = (C0630.m2566("۟ۘ") + i20) * 53;
                                                i21 = ((iM2568 ^ i19) * 17693) ^ 95949639;
                                                i22 = 1351311401;
                                            } else {
                                                iM2568 = C0630.m2566("ۙۤ") ^ i19;
                                                i21 = ((iM2568 ^ i20) * (-19765)) ^ (-59156392);
                                                i22 = -412036737;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:18:0x009e  */
                            /* JADX WARN: Code duplicated, block: B:65:0x0245 A[PHI: r2 r3 r7 r8 r13 r14 r20
                              0x0245: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r3v4 l.ۡ۟ܽ) = 
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                              (r3v2 l.ۡ۟ܽ)
                              (r3v1 l.ۡ۟ܽ)
                             binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r7v5 short) = 
                              (r7v2 short)
                              (r7v2 short)
                              (r7v3 short)
                              (r7v2 short)
                              (r7v2 short)
                              (r7v2 short)
                              (r7v2 short)
                              (r7v2 short)
                              (r7v2 short)
                             binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r13v5 short[]) = 
                              (r13v2 short[])
                              (r13v2 short[])
                              (r13v2 short[])
                              (r13v2 short[])
                              (r13v3 short[])
                              (r13v2 short[])
                              (r13v2 short[])
                              (r13v2 short[])
                              (r13v2 short[])
                             binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r14v5 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]
                              0x0245: PHI (r20v4 short[]) = 
                              (r20v1 short[])
                              (r20v2 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                              (r20v1 short[])
                             binds: [B:64:0x0243, B:60:0x022a, B:52:0x01d1, B:37:0x0138, B:33:0x0112, B:19:0x00b6, B:16:0x009a, B:28:0x00dc, B:86:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                int iM6985;
                                int i18;
                                int i19;
                                int i20 = AbstractC2021.f6743;
                                int i21 = C3683.f11629;
                                int iM2568 = C0630.m2566("᩻ۧ") ^ i21;
                                int i22 = ((iM2568 ^ i20) * 29347) ^ (-1094710046);
                                short[] sArr = null;
                                short[] sArr2 = null;
                                int i23 = iM2568 ^ (-8439770);
                                C8739 c8739 = null;
                                char c = 0;
                                short s = 0;
                                int i24 = 0;
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 1722091998;
                                String strM4909 = null;
                                int iM6310 = 0;
                                while (true) {
                                    i30 = i23 ^ (i22 & (((i30 ^ i20) * (-2265)) >> 31));
                                    switch (i30) {
                                        case -2140749551:
                                        case -1883766797:
                                            if (C5695.f17556 >= 0) {
                                                iM6985 = (C0630.m2566("᩶ۖ") ^ i21) * 5;
                                                i18 = ((iM6985 ^ i20) * (-6517)) ^ 1484786510;
                                                i19 = -1122708310;
                                            } else {
                                                iM6985 = (C0630.m2566("ۤ᩷") + i20) * (-39);
                                                i18 = ((iM6985 ^ i21) * 22475) ^ 846038600;
                                                i19 = 1861471557;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -2036324859:
                                        case 390278748:
                                            sArr2 = f2012;
                                            i29 = 1;
                                            if (C2126.f7087) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = C2105.m6981("ܽ᩵") ^ i21;
                                                i18 = ((iM6985 ^ i20) * (-8295)) ^ 1175350961;
                                                i19 = 1878023759;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -2005589908:
                                        case -1457043800:
                                            int i31 = i26 + i27;
                                            if (i25 - (i31 + i31) <= 0) {
                                                iM6985 = (i21 - C2105.m6981("᩵ۘ")) * 109;
                                                i18 = ((iM6985 ^ i20) * (-31785)) ^ (-1890734593);
                                                i19 = -1528609979;
                                            } else {
                                                iM6985 = (i21 - C2105.m6981("ܶܶ")) * 97;
                                                i18 = ((iM6985 ^ i20) * 327) ^ (-1677376540);
                                                i19 = -660085769;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -1638223492:
                                        case -767090016:
                                            s = sArr[c];
                                            i24 = s + 5672;
                                            if (C3663.f11553) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = (i20 - C2105.m6981("ۗ᩻")) * (-43);
                                                i18 = ((iM6985 ^ i21) * 9241) ^ (-1957841399);
                                                i19 = 737898157;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -1523819165:
                                        case -1449851950:
                                            C22628.m50615();
                                            if (C1711.m5736() > 0) {
                                                int iM6986 = (i21 - C2105.m6981("ۚܿ")) * 61;
                                                i23 = iM6986 ^ 1808992154;
                                                i22 = ((iM6986 ^ i20) * 16781) ^ (-597329332);
                                                c8739 = null;
                                            } else {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                                i23 = iM6985 ^ i19;
                                                i22 = i18;
                                            }
                                            break;
                                        case -1493423156:
                                        case -143083369:
                                            C3683.m11222();
                                            C1711.m5736();
                                            return null;
                                        case -1456340948:
                                        case 1483589112:
                                            c8739.m22595(new C15859());
                                            return c8739;
                                        case -1454408751:
                                        case 804772018:
                                            C22628.m50615();
                                            if (C4117.f13076 <= 0) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = (C0630.m2566("᩶ۖ") ^ i21) * 5;
                                                i18 = ((iM6985 ^ i20) * (-6517)) ^ 1484786510;
                                                i19 = -1122708310;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -1198640409:
                                        case 287559599:
                                            i28 = o.a.A;
                                            iM6985 = C2105.m6981("۠ܶ") ^ i20;
                                            i18 = ((iM6985 ^ i21) * 8029) ^ (-958956462);
                                            i19 = -1156509779;
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case -1069126332:
                                        case 111929870:
                                            c = 0;
                                            if (C7811.f24123 < 0) {
                                                iM6985 = (C2105.m6981("۟۫") ^ i21) * (-125);
                                                i18 = ((iM6985 ^ i20) * 23997) ^ 2025761244;
                                                i19 = 1213165347;
                                                i23 = iM6985 ^ i19;
                                                i22 = i18;
                                            } else {
                                                int iM6987 = (i21 - C2105.m6981("ۚܿ")) * 61;
                                                i23 = iM6987 ^ 1808992154;
                                                i22 = ((iM6987 ^ i20) * 16781) ^ (-597329332);
                                                c8739 = null;
                                            }
                                            break;
                                        case -306488200:
                                        case 1143916146:
                                            iM6310 = C1916.m6310(atomicInteger);
                                            if (C0714.f2697 >= 0) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = (C2105.m6981("ۛ᩻") ^ i20) * 75;
                                                i18 = ((iM6985 ^ i21) * (-6193)) ^ 783345261;
                                                i19 = 1957259325;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case 201048583:
                                        case 1187824835:
                                            if (C2167.f7158 >= 0) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = (i21 - C2105.m6981("ۚᩳ")) * (-15);
                                                i18 = ((iM6985 ^ i20) * (-9561)) ^ (-1056899175);
                                                i19 = -338242624;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case 204591833:
                                        case 1517984646:
                                            i25 = i24 * i24;
                                            i26 = s * s;
                                            i27 = 32171584;
                                            if (!C1504.f5354) {
                                                iM6985 = C2105.m6981("᩹֫") ^ i20;
                                                i18 = ((iM6985 ^ i21) * (-4981)) ^ 1333135952;
                                                i19 = -555969091;
                                                i23 = iM6985 ^ i19;
                                                i22 = i18;
                                            } else {
                                                int iM6988 = (i21 - C2105.m6981("ۚܿ")) * 61;
                                                i23 = iM6988 ^ 1808992154;
                                                i22 = ((iM6988 ^ i20) * 16781) ^ (-597329332);
                                                c8739 = null;
                                            }
                                            break;
                                        case 262417523:
                                        case 2072785579:
                                            RunnableC1108.m3790();
                                            iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                            i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                            i19 = -1392455344;
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case 1204777492:
                                        case 1959648588:
                                            sArr = f2012;
                                            if (C1773.m5908() <= 0) {
                                                iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                i19 = -1392455344;
                                            } else {
                                                iM6985 = C0630.m2566("ۖۚ") ^ i20;
                                                i18 = ((iM6985 ^ i21) * 18389) ^ 1388990520;
                                                i19 = 1342291785;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case 1609999996:
                                        case 2143219706:
                                            i28 = 52222;
                                            iM6985 = C2105.m6981("۠ܶ") ^ i20;
                                            i18 = ((iM6985 ^ i21) * 8029) ^ (-958956462);
                                            i19 = -1156509779;
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                        case 1731126197:
                                        case 1759027324:
                                            String str2 = str;
                                            if (C0050.f910 < 0) {
                                                c8739 = new C8739(str2, iM6310, strM4909, false);
                                                if (C4075.f12947 >= 0) {
                                                    iM6985 = (C0630.m2566("ۗܶ") ^ i20) * 9;
                                                    i18 = ((iM6985 ^ i21) * (-29383)) ^ (-684135822);
                                                    i19 = -1392455344;
                                                } else {
                                                    iM6985 = (i21 - C2105.m6981("֫ۜ")) * 83;
                                                    i18 = ((iM6985 ^ i20) * (-23357)) ^ 144434321;
                                                    i19 = -285561096;
                                                }
                                                i23 = iM6985 ^ i19;
                                                i22 = i18;
                                            } else {
                                                int iM6989 = (i21 - C2105.m6981("ۚܿ")) * 61;
                                                i23 = iM6989 ^ 1808992154;
                                                i22 = ((iM6989 ^ i20) * 16781) ^ (-597329332);
                                                c8739 = null;
                                            }
                                            break;
                                        default:
                                            strM4909 = C1420.m4909(iM6310, C4263.m12817(sArr2, i29, 7, i28));
                                            if (C21923.f70183 != 0) {
                                                iM6985 = (C0630.m2566("֫ۤ") + i21) * 45;
                                                i18 = ((iM6985 ^ i20) * 14713) ^ 2128393671;
                                                i19 = 1951060093;
                                            } else {
                                                iM6985 = C2105.m6981("᩶᩷") ^ i20;
                                                i18 = ((iM6985 ^ i21) * 24217) ^ (-565647010);
                                                i19 = 830939895;
                                            }
                                            i23 = iM6985 ^ i19;
                                            i22 = i18;
                                            break;
                                    }
                                }
                            }
                        })).m22592()).add(i10);
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        iM6981 = (i7 - C2105.m6981("ۚ֫")) * (-23);
                        i = ((iM6981 ^ i6) * 25103) ^ (-2076109379);
                        i5 = -1300466461;
                        int i18 = iM6981 ^ i5;
                        c8918 = c8918;
                        atomicInteger = atomicInteger;
                        i9 = i18;
                        i8 = i;
                    } catch (Throwable th6) {
                        th = th6;
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        iM2567 = C2105.m6981("ۙۢ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-7061)) ^ (-344394910);
                        i4 = -396740717;
                        AtomicInteger atomicInteger15 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger15;
                    }
                    break;
                case -781316303:
                case -338393265:
                    C1005.m3501();
                    if (C2105.m6982() != 0) {
                        iM2566 = C2105.m6981("ۧ᩻") ^ i7;
                        i = ((iM2566 ^ i6) * 31283) ^ 1064339693;
                        i2 = -295616590;
                    } else {
                        iM2566 = (C0630.m2566("֡ۜ") ^ i6) * (-51);
                        i = ((iM2566 ^ i7) * (-607)) ^ 1186041646;
                        i2 = -970625132;
                    }
                    i9 = iM2566 ^ i2;
                    i8 = i;
                    break;
                case -575547423:
                case 73282511:
                    if (C7106.f21815 != 0) {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = (C2105.m6981("֨᩷") + i7) * (-73);
                        i3 = ((iM2567 ^ i6) * 30713) ^ 87216572;
                        i4 = -512987592;
                        AtomicInteger atomicInteger16 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger16;
                    }
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    iM2567 = C0630.m2566("۠ۧ") ^ i7;
                    i3 = ((iM2567 ^ i6) * (-19571)) ^ 1095512229;
                    i4 = 1190706017;
                    AtomicInteger atomicInteger17 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger17;
                    break;
                case -487441488:
                case -158218652:
                    if (C2958.m9034() <= 0) {
                        iM2566 = (i7 - C0630.m2566("۫᩻")) * 51;
                        i = ((iM2566 ^ i6) * 12841) ^ (-1465025087);
                        i2 = 980905891;
                        i9 = iM2566 ^ i2;
                        i8 = i;
                    } else {
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        arrayList = arrayList;
                        iM2567 = C0630.m2566("ۗۢ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 22961) ^ (-78784680);
                        i4 = 1737639626;
                        AtomicInteger atomicInteger18 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger18;
                    }
                    break;
                case -342385192:
                case 1381152900:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList.addAll(map.values());
                    Collections.sort(arrayList, C8200.comparing(new C19694(1)));
                    iM6981 = C0630.m2566("ᩳ᩷") ^ i7;
                    i = ((iM6981 ^ i6) * 10511) ^ 766511418;
                    i5 = -622639201;
                    int i19 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i19;
                    i8 = i;
                    break;
                case 95504238:
                case 2016113672:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (C21923.f70183 == 0) {
                        iM2567 = C0630.m2566("᩵ۛ") ^ i7;
                        i3 = ((iM2567 ^ i6) * 745) ^ (-1245368968);
                        i4 = -454655663;
                        AtomicInteger atomicInteger19 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger19;
                    } else {
                        int iM6985 = (C2105.m6981("۠ܽ") ^ i6) * 33;
                        atomicInteger = atomicInteger;
                        i9 = iM6985 ^ (-1794912231);
                        i8 = ((iM6985 ^ i7) * 15777) ^ (-1879198996);
                        arrayList = arrayList;
                        c8918 = null;
                    }
                    break;
                case 125396221:
                case 1653801747:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (C1005.f3721) {
                        iM2567 = (i7 - C2105.m6981("ۖۤ")) * (-117);
                        i3 = ((iM2567 ^ i6) * (-28489)) ^ (-564639727);
                        i4 = 299101779;
                    } else {
                        iM2567 = C0630.m2566("۠ۧ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-19571)) ^ 1095512229;
                        i4 = 1190706017;
                    }
                    AtomicInteger atomicInteger110 = atomicInteger;
                    i9 = iM2567 ^ i4;
                    i8 = i3;
                    arrayList = arrayList;
                    c8918 = c8918;
                    atomicInteger = atomicInteger110;
                    break;
                case 392552222:
                case 1677599982:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    try {
                        AbstractC2021.m6561(c8918);
                        iM6981 = (C0630.m2566("ۡ᩹") ^ i6) * 115;
                        i = ((iM6981 ^ i7) * (-14217)) ^ 562065019;
                        i5 = 484041461;
                        int i110 = iM6981 ^ i5;
                        c8918 = c8918;
                        atomicInteger = atomicInteger;
                        i9 = i110;
                        i8 = i;
                    } catch (Throwable th7) {
                        int iM2568 = C0630.m2566("֫ܶ") ^ i6;
                        c8918 = c8918;
                        atomicInteger = atomicInteger;
                        i9 = iM2568 ^ 331932497;
                        obj = th7;
                        i8 = ((iM2568 ^ i7) * (-28731)) ^ (-1690436963);
                    }
                    break;
                case 418973600:
                case 1363460527:
                    RunnableC3474.m10629(c8918);
                    return;
                case 463857851:
                case 883210933:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    if (i10 < iM1847) {
                        iM6981 = C0630.m2566("ۖ᩵") ^ i6;
                        i = ((iM6981 ^ i7) * (-22225)) ^ (-1462716047);
                        i5 = -204174507;
                    } else {
                        iM6981 = (C2105.m6981("᩸ܰ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i6) * 27153) ^ 256461011;
                        i5 = 1657477200;
                    }
                    int i111 = iM6981 ^ i5;
                    c8918 = c8918;
                    atomicInteger = atomicInteger;
                    i9 = i111;
                    i8 = i;
                    break;
                case 465239342:
                case 1707411346:
                    break;
                case 482833007:
                case 1070047121:
                    atomicInteger = atomicInteger;
                    c8918 = c8918;
                    arrayList = arrayList;
                    if (C2105.m6982() == 0) {
                        iM2567 = C0630.m2566("ܺܶ") ^ i7;
                        i3 = ((iM2567 ^ i6) * (-15001)) ^ (-1363117560);
                        i4 = 214545480;
                        AtomicInteger atomicInteger111 = atomicInteger;
                        i9 = iM2567 ^ i4;
                        i8 = i3;
                        arrayList = arrayList;
                        c8918 = c8918;
                        atomicInteger = atomicInteger111;
                    } else {
                        int iM6986 = (C2105.m6981("۠ܽ") ^ i6) * 33;
                        atomicInteger = atomicInteger;
                        i9 = iM6986 ^ (-1794912231);
                        i8 = ((iM6986 ^ i7) * 15777) ^ (-1879198996);
                        arrayList = arrayList;
                        c8918 = null;
                    }
                    break;
                case 1073639386:
                case 1919346544:
                    arrayList = arrayList;
                    atomicInteger = atomicInteger;
                    if (C2958.f9394 >= 0) {
                        int iM6987 = (C2105.m6981("۠ܽ") ^ i6) * 33;
                        atomicInteger = atomicInteger;
                        i9 = iM6987 ^ (-1794912231);
                        i8 = ((iM6987 ^ i7) * 15777) ^ (-1879198996);
                        arrayList = arrayList;
                        c8918 = null;
                    } else {
                        C8918 c8919 = new C8918(ActivityC20212.f65387);
                        i12 = 36;
                        int iM2569 = (i7 - C0630.m2566("ۗ᩻")) * 13;
                        c8918 = c8919;
                        i8 = ((iM2569 ^ i6) * (-24607)) ^ 1884103747;
                        atomicInteger = atomicInteger;
                        i9 = iM2569 ^ 923518897;
                        arrayList = arrayList;
                    }
                    break;
                case 1096265916:
                case 1649787356:
                    throw th;
                default:
                    try {
                        AbstractC15440 abstractC15440 = (AbstractC15440) C3019.m9263(activityC20212.f65390, i10);
                        byte[] bArrM36523 = abstractC15440.m36523();
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                        try {
                            C0422.m1961(c8918, C11340.m28023(abstractC15440));
                            C3746.m11359(c8918, bArrM36523);
                            it = ActivityC20212.m46444(activityC20212, C3911.m11917(bArrM36523)).iterator();
                            iM6981 = (i7 - C2105.m6981("ۚ֫")) * (-23);
                            i = ((iM6981 ^ i6) * 25103) ^ (-2076109379);
                            i5 = -1300466461;
                            int i112 = iM6981 ^ i5;
                            c8918 = c8918;
                            atomicInteger = atomicInteger;
                            i9 = i112;
                            i8 = i;
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            iM2567 = C2105.m6981("ۙۢ") ^ i7;
                            i3 = ((iM2567 ^ i6) * (-7061)) ^ (-344394910);
                            i4 = -396740717;
                            AtomicInteger atomicInteger112 = atomicInteger;
                            i9 = iM2567 ^ i4;
                            i8 = i3;
                            arrayList = arrayList;
                            c8918 = c8918;
                            atomicInteger = atomicInteger112;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        atomicInteger = atomicInteger;
                        c8918 = c8918;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f16756.m29791(this.f16755);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C3911.m11927(this);
    }
}
