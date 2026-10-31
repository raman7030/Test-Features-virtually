package l;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.internal.a;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N5YQ */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC12313 extends AbstractActivityC3346 implements View.OnClickListener, View.OnKeyListener, ServiceConnection {

    /* JADX INFO: renamed from: ᩸۠ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f36857 = {4582, -6341, 7567, -4387, -288, -2190, -5645, -979, -22, 2463, 1619, -439, 8250, -3001, -1496, 10256, -13438, 14297, 8717, -9596, -13115, -274, 8700, -10176, -2563, -15440, -11415, 12654, 9843, -3298, -11445, -11084, 10718, 9318, -11029, -13326, 15487, -9658, -11407, 13264, -3804, 4570, -46, -8918, -9283, 15879, -15540, -14887, 6478, -7946, 1856, -13183, 1106, -13810, -13763, -13764, -13780, -13794, -13766, -13782, -13763, -13770, -13810, -13780, -13765, -13786, -13767, -13786, -13765, -13770};

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public long f36858;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC8597 f36859;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public BinderC3141 f36860;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C15651 f36861;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36862 = false;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ֫ */
    public final void mo117(C20986 c20986) {
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1401237881;
        int i7 = C4075.f12947;
        int i8 = AbstractC2021.f6743;
        int iM2566 = C0630.m2566("ۖۚ") ^ i7;
        int i9 = ((iM2566 ^ i8) * 10347) ^ (-1460862334);
        int i10 = 696659341;
        while (true) {
            i6 = ((((i6 ^ i8) * (-19417)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1597874132:
                case 606446169:
                    C1773.m5908();
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܳ֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17121) ^ (-1257431642);
                        i10 = -631976160;
                    } else {
                        iM2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    }
                    break;
                case -1579293039:
                case -392142234:
                    sArr = f36857;
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("֫ܽ") ^ i8) * 5;
                        i9 = ((iM2566 ^ i7) * (-4699)) ^ (-2114327288);
                        i10 = -1262239925;
                    } else {
                        iM2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    }
                    break;
                case -1384166729:
                case 93364350:
                    if (C4117.m12364() != 0) {
                        iM2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۖ᩺")) * (-57);
                        i9 = ((iM2566 ^ i8) * 32121) ^ 1247518420;
                        i10 = -138185906;
                    }
                    break;
                case -1199740296:
                case 761108642:
                    int i11 = i + i2;
                    i3 = i11 + i11;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۗ֡")) * 41;
                        i9 = ((iM2566 ^ i7) * 7663) ^ 1904294571;
                        i10 = -1656585470;
                    }
                    break;
                case -1156753345:
                case 2087492803:
                    s2 = 11709;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        iM2566 = C0630.m2566("֫ۧ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 8341) ^ (-1556929766);
                        i10 = 23718865;
                    }
                    break;
                case -724237979:
                case 1376729654:
                    C3537.m10746();
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    } else {
                        iM2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    }
                    break;
                case -618704725:
                case -42192540:
                    i4 = 51791;
                    iM2566 = C2105.m6981("֨ܽ") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-13213)) ^ 1795742028;
                    i10 = 2091045421;
                    break;
                case -374367250:
                case 792964995:
                    C1128.m3851();
                    return null;
                case -368391827:
                case 1074908103:
                    if (!C1005.f3721) {
                        iM2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    } else {
                        iM2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    }
                    break;
                case 13607232:
                case 122104181:
                    i4 = 58093;
                    iM2566 = C2105.m6981("֨ܽ") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-13213)) ^ 1795742028;
                    i10 = 2091045421;
                    break;
                case 96533523:
                case 1271660039:
                    C0237.m1481();
                    C1128.m3851();
                    iM2566 = C2105.m6981("᩸۬") ^ i8;
                    i9 = ((iM2566 ^ i7) * (-8927)) ^ 1448995426;
                    i10 = 2045385588;
                    break;
                case 308662064:
                case 328680902:
                    i = s * s;
                    i2 = 137100681;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        iM2566 = C2105.m6981("ܰۨ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 1859) ^ 1723225011;
                        i10 = 807837208;
                    }
                    break;
                case 327510535:
                case 1472451278:
                    int i12 = s + s2;
                    if (i3 - (i12 * i12) < 0) {
                        iM2566 = C2105.m6981("ۛۛ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-4963)) ^ (-419016422);
                        i10 = -2003538952;
                    } else {
                        iM2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1223)) ^ (-1061507522);
                        i10 = 1965300894;
                    }
                    break;
                case 585873765:
                case 2055013932:
                    return RunnableC1937.m6385(sArr2, i5, 17, i4);
                case 599937711:
                case 1131339294:
                    c = '4';
                    if (C1711.m5736() <= 0) {
                        iM2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-3343)) ^ 90543459;
                        i10 = -1130325268;
                    } else {
                        iM2566 = (i7 - C0630.m2566("᩵᩷")) * (-57);
                        i9 = ((iM2566 ^ i8) * (-14137)) ^ 467759755;
                        i10 = -2111426375;
                    }
                    break;
                case 643020867:
                case 1007590855:
                    s = sArr[c];
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("ܳ֡") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17121) ^ (-1257431642);
                        i10 = -631976160;
                    } else {
                        iM2566 = C2105.m6981("᩵ᩴ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-1103)) ^ 1715210610;
                        i10 = 1161725146;
                    }
                    break;
                case 705227579:
                case 2079907293:
                    sArr2 = f36857;
                    i5 = 53;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩸۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-8927)) ^ 1448995426;
                        i10 = 2045385588;
                    } else {
                        iM2566 = (C2105.m6981("۬֡") ^ i7) * (-3);
                        i9 = ((iM2566 ^ i8) * (-31821)) ^ (-555576249);
                        i10 = 479301653;
                    }
                    break;
                case 1412261986:
                case 1953844993:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("۫ۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26305)) ^ (-2056685576);
                        i10 = 492940491;
                    } else {
                        iM2566 = C2105.m6981("ۛۢ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 15765) ^ (-379296523);
                        i10 = 1651267760;
                    }
                    break;
                default:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("۬ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 13701) ^ 1118183932;
                        i10 = 681159834;
                    } else {
                        iM2566 = C2105.m6981("᩷ۧ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-26247)) ^ (-1595663998);
                        i10 = 365390541;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01fb A[PHI: r1 r4 r9 r15
      0x01fb: PHI (r1v36 int) = (r1v15 int), (r1v28 int), (r1v2 int) binds: [B:54:0x01f9, B:33:0x011b, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:54:0x01f9, B:33:0x011b, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:54:0x01f9, B:33:0x011b, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:54:0x01f9, B:33:0x011b, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0237 A[PHI: r2 r7 r8 r10 r19
      0x0237: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:58:0x0235, B:49:0x01d2, B:37:0x0147, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:58:0x0235, B:49:0x01d2, B:37:0x0147, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v5 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:58:0x0235, B:49:0x01d2, B:37:0x0147, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r10v5 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:58:0x0235, B:49:0x01d2, B:37:0x0147, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r19v23 int) = (r19v4 int), (r19v6 int), (r19v11 int), (r19v24 int) binds: [B:58:0x0235, B:49:0x01d2, B:37:0x0147, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02a8 A[PHI: r3 r12 r13 r14 r19 r20
      0x02a8: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r19v18 int) = (r19v2 int), (r19v10 int), (r19v13 int), (r19v19 int) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:66:0x02a6, B:41:0x016c, B:29:0x00f6, B:14:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (l.C2105.f7037 == 0) goto L14;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        int iM6981;
        int i;
        int i2;
        int i3 = RunnableC0588.f2309;
        int i4 = RunnableC1937.f6483;
        int iM2566 = (C0630.m2566("ܰ᩹") ^ i3) * (-97);
        int i5 = ((iM2566 ^ i4) * 12479) ^ 2051473953;
        String strM2128 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ 320614670;
        int i7 = 0;
        int iM2567 = 0;
        int iM2568 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1849896148;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-31469)) >> 31));
            switch (i12) {
                case -2094299866:
                case -1088529411:
                    i9 = 42310;
                    iM6981 = C2105.m6981("۠۠") ^ i3;
                    i = ((iM6981 ^ i4) * 15455) ^ (-739791090);
                    i2 = -1033068893;
                    int i13 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i13;
                    break;
                case -2028059115:
                case 128054305:
                    i9 = 60441;
                    iM6981 = C2105.m6981("۠۠") ^ i3;
                    i = ((iM6981 ^ i4) * 15455) ^ (-739791090);
                    i2 = -1033068893;
                    int i14 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i14;
                    break;
                case -1744345018:
                case 752760457:
                    iM2568 = C0630.m2566(strM2128);
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("᩻ܽ") ^ i4;
                        i7 = i7;
                        i = ((iM6981 ^ i3) * 23797) ^ 1126558272;
                        i2 = -1305980875;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩻") ^ i4;
                        i7 = i7;
                        i = ((iM6981 ^ i3) * (-21933)) ^ (-981964395);
                        i2 = -1414932005;
                    }
                    int i15 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i15;
                    break;
                case -1595861409:
                case 329995504:
                    i7 = i7;
                    iM2567 = C0630.m2566(RunnableC0588.m2436(sArr2, i10, i11, i9));
                    if (C0237.f1507 != 0) {
                        iM6981 = (C2105.m6981("֫ᩴ") + i4) * (-81);
                        i = ((iM6981 ^ i3) * (-19469)) ^ 656646786;
                        i2 = -570154742;
                    } else {
                        iM6981 = C0630.m2566("֨۫") ^ i4;
                        i = ((iM6981 ^ i3) * (-3805)) ^ 1486493372;
                        i2 = 963331871;
                    }
                    int i16 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i16;
                    break;
                case -1467470218:
                case 1519729624:
                    i7 = iM2567 ^ 2120358333;
                    sArr3 = f36857;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("᩻ܽ") ^ i4;
                        i7 = i7;
                        i = ((iM6981 ^ i3) * 23797) ^ 1126558272;
                        i2 = -1305980875;
                    } else {
                        iM6981 = (C0630.m2566("ۤܺ") ^ i3) * (-111);
                        i7 = i7;
                        i = ((iM6981 ^ i4) * 13635) ^ 1936288937;
                        i2 = -736790742;
                    }
                    int i17 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i17;
                    break;
                case -1466572021:
                case 2044631119:
                    C5695.m16023();
                    break;
                case -1258400812:
                case 1347479525:
                    i7 = i7;
                    sArr = f36857;
                    if (AbstractC2021.m6574()) {
                        iM6981 = (i3 - C0630.m2566("᩶᩸")) * 65;
                        i = ((iM6981 ^ i4) * 14649) ^ (-30759597);
                        i2 = -762102767;
                    } else {
                        iM6981 = C2105.m6981("᩶ۨ") ^ i4;
                        i = ((iM6981 ^ i3) * (-22795)) ^ (-124622694);
                        i2 = -1485104196;
                    }
                    int i18 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i18;
                    break;
                case -1228403675:
                case 977991398:
                    overridePendingTransition(i7, 2102561526 ^ iM2568);
                    super.onPause();
                    break;
                case -893923268:
                case 858496736:
                    ServiceConnectionC3453.m10564();
                    break;
                case -729431995:
                case 1082140174:
                    i7 = i7;
                    s3 = 43120;
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("֫ᩴ") + i4) * (-81);
                        i = ((iM6981 ^ i3) * (-19469)) ^ 656646786;
                        i2 = -570154742;
                    } else {
                        iM6981 = (C0630.m2566("۫᩷") + i4) * 53;
                        i = ((iM6981 ^ i3) * 8345) ^ 2016470462;
                        i2 = -1075795269;
                    }
                    int i19 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i19;
                    break;
                case -523028818:
                case 600355645:
                    C0630.m2564();
                    if (C0050.f910 >= 0) {
                        i7 = i7;
                        iM6981 = (C2105.m6981("֫ᩴ") + i4) * (-81);
                        i = ((iM6981 ^ i3) * (-19469)) ^ 656646786;
                        i2 = -570154742;
                        int i110 = i7;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        i7 = i110;
                    } else {
                        int iM2569 = C0630.m2566("ܿ۬") ^ i3;
                        i6 = iM2569 ^ (-534413203);
                        i5 = ((iM2569 ^ i4) * 20405) ^ (-1883550740);
                    }
                    break;
                case -401675869:
                case 1994942883:
                    i7 = i7;
                    strM2128 = C0483.m2128(sArr3, 45, 3, i9);
                    if (C11340.f33930 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩶᩸")) * 65;
                        i = ((iM6981 ^ i4) * 14649) ^ (-30759597);
                        i2 = -762102767;
                    } else {
                        iM6981 = C0630.m2566("ۖᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * (-27991)) ^ 463940188;
                        i2 = 165959986;
                    }
                    int i111 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i111;
                    break;
                case -197482723:
                case 916193188:
                    i7 = i7;
                    c = ')';
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("۬᩸") ^ i3;
                        i = ((iM6981 ^ i4) * 28641) ^ (-1488748673);
                        i2 = -240223579;
                    } else {
                        iM6981 = C0630.m2566("۟᩸") ^ i3;
                        i = ((iM6981 ^ i4) * 7379) ^ 1383107156;
                        i2 = -1214652918;
                    }
                    int i112 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i112;
                    break;
                case -54154674:
                case 865309752:
                    i7 = i7;
                    int i20 = s + s2;
                    i8 = i20 * i20;
                    if (C2126.f7087) {
                        i7 = i7;
                        iM6981 = C2105.m6981("᩻ܽ") ^ i4;
                        i7 = i7;
                        i = ((iM6981 ^ i3) * 23797) ^ 1126558272;
                        i2 = -1305980875;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩶") ^ i4) * 57;
                        i = ((iM6981 ^ i3) * 7061) ^ (-177093035);
                        i2 = 991310215;
                    }
                    int i113 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i113;
                    break;
                case 144854455:
                case 521658147:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        i7 = i7;
                        iM6981 = C2105.m6981("۬᩸") ^ i3;
                        i = ((iM6981 ^ i4) * 28641) ^ (-1488748673);
                        i2 = -240223579;
                        int i114 = i7;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                        i7 = i114;
                    }
                    i7 = i7;
                    iM6981 = (i3 - C0630.m2566("᩶᩸")) * 65;
                    i = ((iM6981 ^ i4) * 14649) ^ (-30759597);
                    i2 = -762102767;
                    int i115 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i115;
                    break;
                case 522238012:
                case 778227420:
                    i7 = i7;
                    s = sArr[c];
                    s2 = 10780;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (C2105.m6981("֫ᩴ") + i4) * (-81);
                        i = ((iM6981 ^ i3) * (-19469)) ^ 656646786;
                        i2 = -570154742;
                    } else {
                        iM6981 = (C0630.m2566("۟ܶ") + i3) * (-101);
                        i = ((iM6981 ^ i4) * (-27169)) ^ (-457580562);
                        i2 = -1007119348;
                    }
                    int i116 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i116;
                    break;
                case 800889616:
                case 1750430726:
                    C5695.m16023();
                    C0714.m2805();
                    i7 = i7;
                    iM6981 = (i3 - C0630.m2566("᩶᩸")) * 65;
                    i = ((iM6981 ^ i4) * 14649) ^ (-30759597);
                    i2 = -762102767;
                    int i117 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i117;
                    break;
                case 1409610585:
                case 1536670988:
                    i7 = i7;
                    sArr2 = f36857;
                    i10 = 42;
                    i11 = 3;
                    if (C3019.f9544 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩶᩸")) * 65;
                        i = ((iM6981 ^ i4) * 14649) ^ (-30759597);
                        i2 = -762102767;
                    } else {
                        iM6981 = (C0630.m2566("۫۫") + i3) * (-47);
                        i = ((iM6981 ^ i4) * (-597)) ^ 23327912;
                        i2 = -1455931697;
                    }
                    int i118 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i118;
                    break;
                default:
                    i7 = i7;
                    if (i8 - (s * s3) >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩵ۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i4) * (-3011)) ^ 658104173;
                        i2 = 1275674937;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩸") ^ i4;
                        i = ((iM6981 ^ i3) * 16839) ^ 386614652;
                        i2 = -1774008842;
                    }
                    int i119 = i7;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    i7 = i119;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        BinderC3141 binderC3141 = null;
        int i = 1306984090;
        int i2 = C2958.f9394;
        int i3 = RunnableC3474.f10992;
        int iM2566 = C0630.m2566("۟᩶") ^ i3;
        int i4 = ((iM2566 ^ i2) * 25949) ^ 1106286063;
        int i5 = 517812242;
        while (true) {
            i = ((((i ^ i2) * (-11535)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2106169549:
                case -1141369307:
                    if (C2958.m9033(this)) {
                        iM2566 = C2105.m6981("֡ۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27447) ^ (-1436419346);
                        i5 = 1643252850;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩷") ^ i3) * (-67);
                        i4 = ((iM2566 ^ i2) * (-13527)) ^ (-1588064984);
                        i5 = 285926504;
                    }
                    break;
                case -2065858506:
                case 1383889094:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    } else {
                        iM2566 = (C2105.m6981("ᩳܽ") + i2) * 49;
                        i4 = ((iM2566 ^ i3) * 13231) ^ (-1875779992);
                        i5 = -1912793340;
                    }
                    break;
                case -2019615386:
                case -425565620:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        iM2566 = C0630.m2566("ۜ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 7797) ^ (-1122868249);
                        i5 = -2017704866;
                    }
                    break;
                case -1840466920:
                case 555974662:
                    if (C2126.f7087) {
                        iM2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((iM2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    } else {
                        iM2566 = (C2105.m6981("ۧܳ") + i2) * q.h;
                        i4 = ((iM2566 ^ i3) * 27855) ^ (-1874082741);
                        i5 = -1176999567;
                    }
                    break;
                case -761797723:
                case 202217886:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((iM2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    } else {
                        iM2566 = (C2105.m6981("ۙۘ") ^ i2) * (-123);
                        i4 = ((iM2566 ^ i3) * (-20413)) ^ 1461534885;
                        i5 = -831236609;
                    }
                    break;
                case -718375826:
                case -105224321:
                    binderC3141.m9569();
                    iM2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                    i4 = ((iM2566 ^ i3) * (-15913)) ^ 996209475;
                    i5 = 1715106875;
                    break;
                case -551947330:
                case 871511393:
                    if (C0382.f1805) {
                        stopService(new Intent(this, (Class<?>) ServiceC13018.class));
                        iM2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                        i4 = ((iM2566 ^ i3) * (-15913)) ^ 996209475;
                        i5 = 1715106875;
                    } else {
                        iM2566 = C0630.m2566("᩺ۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25091) ^ 989118465;
                        i5 = 721849355;
                    }
                    break;
                case -541541749:
                case 195613510:
                    if (this.f36862) {
                        iM2566 = C0630.m2566("ۖۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11487)) ^ 222788608;
                        i5 = -1091312426;
                    } else {
                        iM2566 = C0630.m2566("᩺۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14439) ^ (-985394330);
                        i5 = 128643041;
                    }
                    break;
                case -535421153:
                case 1321124522:
                    C2272.m7505(this);
                    iM2566 = C2105.m6981("֡ۖ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 27447) ^ (-1436419346);
                    i5 = 1643252850;
                    break;
                case -510865987:
                case -153282985:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((iM2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    } else {
                        iM2566 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15723)) ^ (-640192365);
                        i5 = -109875986;
                    }
                    break;
                case -326717066:
                case 1715673577:
                    binderC3141 = this.f36860;
                    if (binderC3141 != null) {
                        iM2566 = (C2105.m6981("ۙۚ") ^ i2) * 67;
                        i4 = ((iM2566 ^ i3) * 4111) ^ (-903597328);
                        i5 = -221772084;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩷ۨ")) * (-91);
                        i4 = ((iM2566 ^ i3) * (-15913)) ^ 996209475;
                        i5 = 1715106875;
                    }
                    break;
                case -177224759:
                case 1257208326:
                    C5695.m16023();
                    if (!C0382.m1848()) {
                        iM2566 = (i2 - C0630.m2566("᩸᩺")) * 37;
                        i4 = ((iM2566 ^ i3) * 21507) ^ (-1679474832);
                        i5 = 1469548531;
                    } else {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    }
                    break;
                case 1602698:
                case 2022098109:
                    break;
                case 206662812:
                case 579194052:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        iM2566 = (C0630.m2566("ۚۢ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * (-14723)) ^ (-1250162482);
                        i5 = -1806446779;
                    }
                    break;
                case 271777303:
                case 411072830:
                    C3683.m11222();
                    iM2566 = C0630.m2566("᩺ܰ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-8115)) ^ 1942812486;
                    i5 = -2075293533;
                    break;
                case 805080697:
                case 1639399157:
                    if (C0382.f1805) {
                        iM2566 = (C0630.m2566("ۚ֫") ^ i3) * 17;
                        i4 = ((iM2566 ^ i2) * 19323) ^ (-1819186953);
                        i5 = -1582820486;
                    } else {
                        iM2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((iM2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    }
                    break;
                case 854386534:
                case 974695290:
                    RunnableC1108.m3790();
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C0630.m2566("ۨۗ") ^ i2) * 61;
                        i4 = ((iM2566 ^ i3) * (-4043)) ^ 1396721283;
                        i5 = 260239796;
                    } else {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    }
                    break;
                case 1213027084:
                case 1922975065:
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        iM2566 = C0630.m2566("ᩴۨ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 17755) ^ 1898985162;
                        i5 = -449546385;
                    }
                    break;
                case 1495427032:
                case 1902930370:
                    C3537.m10746();
                    break;
                case 1748964318:
                case 2134315720:
                    super.onStop();
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    } else {
                        iM2566 = (C2105.m6981("ۜۗ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i2) * (-30279)) ^ (-251243572);
                        i5 = 1072189469;
                    }
                    break;
                default:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("ۚܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10417) ^ 914125722;
                        i5 = 2037018378;
                    } else {
                        iM2566 = C0630.m2566("᩺ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-8115)) ^ 1942812486;
                        i5 = -2075293533;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C15651 c15651 = null;
        int i = -433401978;
        int i2 = C3537.f11231;
        int i3 = C3683.f11629;
        int iM2566 = (i2 - C0630.m2566("ۢۘ")) * 63;
        int i4 = ((iM2566 ^ i3) * 28967) ^ (-641088238);
        int i5 = 1898374973;
        while (true) {
            i = ((((i ^ i3) * (-22301)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1961790354:
                case -954575475:
                    C4159.m12565();
                    if (C0964.f3626 != 0) {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        iM2566 = (C2105.m6981("᩸ܺ") + i2) * 83;
                        i4 = ((iM2566 ^ i3) * 4057) ^ 1253447170;
                        i5 = 710133800;
                    }
                    break;
                case -1591192860:
                case -311086127:
                    super.onDestroy();
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    } else {
                        iM2566 = C2105.m6981("ۚۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3285)) ^ (-727457383);
                        i5 = 996676425;
                    }
                    break;
                case -1583987663:
                case 1528907592:
                    if (C1420.f5096 <= 0) {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        iM2566 = C2105.m6981("ۗۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ 1455849789;
                        i5 = -436417033;
                    }
                    break;
                case -1402442737:
                case -857002963:
                    C1711.m5736();
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i3 - C2105.m6981("᩻ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * (-24243)) ^ 1868599039;
                        i5 = -2112556425;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    }
                    break;
                case -1353181803:
                case 919198409:
                    if (C2105.f7037 != 0) {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        iM2566 = (C0630.m2566("۫᩻") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2566 ^ i3) * (-14413)) ^ (-10058410);
                        i5 = 1101529358;
                    }
                    break;
                case -957567130:
                case 624518758:
                    ServiceC13018.f38962 = C0050.m947(C2958.m9028(c15651));
                    break;
                case -947310383:
                case -637927541:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۜۢ")) * 27;
                        i4 = ((iM2566 ^ i2) * 6433) ^ (-995369685);
                        i5 = 1700944200;
                    }
                    break;
                case -897671951:
                case -340084457:
                    if (RunnableC3474.m10630()) {
                        iM2566 = (i3 - C2105.m6981("ᩳᩳ")) * 123;
                        i4 = ((iM2566 ^ i2) * 27727) ^ 1430297826;
                        i5 = -634011506;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    }
                    break;
                case -597942508:
                case 2122895320:
                    C21923.m49329();
                    C4117.m12364();
                    iM2566 = (C2105.m6981("᩸ܺ") + i2) * 83;
                    i4 = ((iM2566 ^ i3) * 4057) ^ 1253447170;
                    i5 = 710133800;
                    break;
                case -482008664:
                case 1194810246:
                    if (C22628.f73083 > 0) {
                        iM2566 = C2105.m6981("۟ۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-24131)) ^ 949613586;
                        i5 = 379814437;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    }
                    break;
                case -388260497:
                case 710448076:
                    C1773.m5908();
                    break;
                case -384510416:
                case 1128901103:
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۢ᩻")) * 67;
                        i4 = ((iM2566 ^ i2) * 8003) ^ (-65656194);
                        i5 = -2035995908;
                    }
                    break;
                case -355351492:
                case 607794733:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i3 - C0630.m2566("᩵ۤ")) * (-7);
                        i4 = ((iM2566 ^ i2) * (-32573)) ^ (-461875936);
                        i5 = 786989110;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۡ֨")) * (-19);
                        i4 = ((iM2566 ^ i2) * (-16531)) ^ (-336557934);
                        i5 = 327304831;
                    }
                    break;
                case 330364508:
                case 2045628864:
                    unbindService(this);
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = (i3 - C2105.m6981("᩻ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * (-24243)) ^ 1868599039;
                        i5 = -2112556425;
                    } else {
                        iM2566 = (C0630.m2566("ۡۗ") + i2) * (-13);
                        i4 = ((iM2566 ^ i3) * 6485) ^ 1031793959;
                        i5 = 579414045;
                    }
                    break;
                case 366433547:
                case 2063997757:
                    c15651 = this.f36861;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 123;
                        i4 = ((iM2566 ^ i2) * 15295) ^ 2032973322;
                        i5 = -1218735169;
                    } else {
                        iM2566 = (C2105.m6981("ۙ۟") ^ i3) * (-17);
                        i4 = ((iM2566 ^ i2) * (-32065)) ^ (-1103213199);
                        i5 = 99325923;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 123;
                        i4 = ((iM2566 ^ i2) * 15295) ^ 2032973322;
                        i5 = -1218735169;
                    } else {
                        iM2566 = (C0630.m2566("ۗ֨") ^ i2) * 127;
                        i4 = ((iM2566 ^ i3) * (-5321)) ^ (-250333438);
                        i5 = -758589426;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0269 A[PHI: r8 r9 r13
      0x0269: PHI (r8v4 android.content.res.Resources) = (r8v3 android.content.res.Resources), (r8v2 android.content.res.Resources) binds: [B:40:0x0267, B:26:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r9v3 android.view.View) = (r9v2 android.view.View), (r9v5 android.view.View) binds: [B:40:0x0267, B:26:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r13v5 int) = (r13v4 int), (r13v2 int) binds: [B:40:0x0267, B:26:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ad, code lost:
    
        if (l.C1711.f5919 == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, android.content.ServiceConnection, android.view.View$OnKeyListener, java.lang.Object, l.۫ۡ᩷] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r1v154, types: [android.view.View, l.ܺۖᩳ] */
    /* JADX WARN: Type inference failed for: r42v1, types: [l.۫ۡ᩷] */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM2566;
        int i;
        int i2;
        short[] sArr;
        int iM6981;
        int i3;
        int i4;
        int iM2567;
        int i5;
        short[] sArr2;
        int iM2568;
        int i6;
        short[] sArr3;
        int i7;
        Window window;
        int iM2569;
        int i8;
        ?? r0;
        ViewOnClickListenerC12313 viewOnClickListenerC12313 = this;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1243290515;
        int i12 = C3245.f10203;
        int i13 = C1047.f3863;
        int iM6982 = (C2105.m6981("ۢ᩺") ^ i12) * (-51);
        int i14 = ((iM6982 ^ i13) * 24199) ^ 722504287;
        int i15 = iM6982 ^ 1960905058;
        ImageView imageView = null;
        View viewM3409 = null;
        String strM9031 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i16 = 0;
        int i17 = 0;
        int iM25610 = 0;
        int i18 = 0;
        Window windowM19115 = null;
        int iM6983 = 0;
        int i19 = 0;
        int iM6984 = 0;
        short s = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        View viewM12813 = null;
        Resources resources = null;
        Resources resources2 = null;
        String strM4373 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int iM25611 = 0;
        ImageView imageView2 = null;
        int i23 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-14599)) >> 31));
            switch (i11) {
                case -2068007966:
                case 2018412851:
                    ?? r1 = (C15651) C4263.m12813(viewOnClickListenerC12313, C0630.m2566(strM9031) ^ 2126542111);
                    viewOnClickListenerC12313.f36861 = r1;
                    r1.setOnKeyListener(viewOnClickListenerC12313);
                    iM2566 = C0630.m2566("ۨۜ") ^ i12;
                    i = ((iM2566 ^ i13) * 17051) ^ 1028116285;
                    i2 = 818242247;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -2024251348:
                case -1610965677:
                    C2126.m7039(viewM3409, viewOnClickListenerC12313);
                    iM25610 = 2124741701 ^ C0630.m2566(C3245.m9934(f36857, 35, 3, i16));
                    iM2566 = (C0630.m2566("۬᩻") ^ i12) * 53;
                    i = ((iM2566 ^ i13) * 25001) ^ (-2112994378);
                    i2 = 71378640;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -1963986151:
                case -120568337:
                    imageView2.setImageDrawable(C22597.m50571(resources2, 2126688082 ^ iM25611, getTheme()));
                    iM2566 = C0630.m2566("᩷᩺") ^ i13;
                    i = ((iM2566 ^ i12) * (-25485)) ^ 2031387991;
                    i2 = 499248742;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -1866816020:
                case 662996541:
                    C2126.m7039(C4263.m12813(viewOnClickListenerC12313, R.id.button2), viewOnClickListenerC12313);
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("֡᩸") ^ i13;
                        i = ((iM2566 ^ i12) * (-1353)) ^ 715597246;
                        i2 = -990304475;
                    } else {
                        iM2566 = (C2105.m6981("᩻۫") + i12) * 57;
                        i = ((iM2566 ^ i13) * (-22813)) ^ (-1803218766);
                        i2 = 232009122;
                    }
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -1722288842:
                case 1683595056:
                    i17 = i17;
                    int i24 = iM6983;
                    resources = resources;
                    sArr7 = sArr7;
                    C4263.m12813(viewOnClickListenerC12313, i24);
                    short[] sArr9 = f36857;
                    i19 = 17;
                    if (C1294.m4372() <= 0) {
                        iM6983 = i24;
                        sArr = sArr9;
                        window = windowM19115;
                        sArr4 = sArr4;
                        i7 = i20;
                        i21 = i21;
                        i19 = 17;
                        iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                        windowM19115 = window;
                        i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                        i8 = -701234045;
                        i15 = iM2569 ^ i8;
                        i20 = i7;
                        sArr7 = sArr7;
                        i21 = i21;
                        sArr4 = sArr4;
                        this = this;
                        resources = resources;
                        short[] sArr10 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr10;
                    } else {
                        int iM25612 = (C0630.m2566("᩸ܿ") ^ i12) * 51;
                        int i25 = ((iM25612 ^ i13) * 28209) ^ 1815749539;
                        i15 = iM25612 ^ 1650066965;
                        iM6983 = i24;
                        i17 = i17;
                        i14 = i25;
                        sArr6 = sArr9;
                        sArr7 = sArr7;
                        viewOnClickListenerC12313 = this;
                        resources = resources;
                    }
                    break;
                case -1656470751:
                case 1911388160:
                    resources = resources;
                    ImageView imageView3 = imageView;
                    imageView3.setImageDrawable(C22597.m50571(resources, iM6984 ^ i18, getTheme()));
                    sArr3 = f36857;
                    if (C2272.f7362) {
                        imageView = imageView3;
                        i19 = i19;
                        sArr2 = sArr5;
                        sArr = sArr6;
                        i17 = 23;
                        iM2568 = (i12 - C0630.m2566("ܽ᩺")) * 93;
                        sArr7 = sArr3;
                        i14 = ((iM2568 ^ i13) * (-23563)) ^ (-1068804519);
                        i6 = -1871162292;
                        i15 = iM2568 ^ i6;
                        r0 = this;
                        sArr5 = sArr2;
                        sArr7 = sArr7;
                        viewOnClickListenerC12313 = r0;
                        resources = resources;
                        short[] sArr11 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr11;
                    } else {
                        int iM6985 = C2105.m6981("۫ᩳ") ^ i13;
                        int i26 = ((iM6985 ^ i12) * (-18013)) ^ 444529777;
                        i15 = iM6985 ^ 879871361;
                        imageView = imageView3;
                        resources = resources;
                        sArr7 = sArr3;
                        i14 = i26;
                        i17 = 23;
                    }
                    break;
                case -1621763924:
                case 365265050:
                    C4075.m12263();
                    break;
                case -1603719718:
                case -33048197:
                    C4159.m12564(C0964.m3409(viewOnClickListenerC12313, R.id.button3), viewOnClickListenerC12313);
                    strM4373 = C1294.m4373(f36857, 29, 3, i16);
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("֨ۚ") ^ i13) * (-31);
                        i = ((iM2566 ^ i12) * 9791) ^ 1228169369;
                        i2 = -736722580;
                    } else {
                        iM2566 = C0630.m2566("᩺ۢ") ^ i13;
                        i = ((iM2566 ^ i12) * 8671) ^ 1220767233;
                        i2 = 305063533;
                    }
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -1520988226:
                case -936227687:
                    C3746.m11369();
                    C21923.m49329();
                    break;
                case -1501697476:
                case 1327802735:
                    resources = resources;
                    sArr4 = sArr4;
                    i21 = i21;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    short[] sArr12 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    sArr = sArr12;
                    super.onCreate(bundle);
                    C7106.m19115(this).setBackgroundDrawableResource(R.color.transparent);
                    windowM19115 = C7106.m19115(this);
                    iM2567 = (C0630.m2566("ۙۧ") ^ i13) * 63;
                    i14 = ((iM2567 ^ i12) * 3375) ^ (-1463388474);
                    i5 = 2110532974;
                    i15 = iM2567 ^ i5;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    i21 = i21;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr13 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr13;
                    break;
                case -1384997353:
                case -1139741234:
                    resources = resources;
                    sArr7 = sArr7;
                    sArr2 = sArr5;
                    short[] sArr14 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    sArr = sArr14;
                    sArr4 = f36857;
                    i20 = 11;
                    i21 = 3;
                    if (C7106.f21815 != 0) {
                        sArr3 = sArr7;
                        iM2568 = (i12 - C0630.m2566("ܽ᩺")) * 93;
                        sArr7 = sArr3;
                        i14 = ((iM2568 ^ i13) * (-23563)) ^ (-1068804519);
                        i6 = -1871162292;
                    } else {
                        iM2568 = C0630.m2566("۠ۖ") ^ i12;
                        i14 = ((iM2568 ^ i13) * 31553) ^ (-53887466);
                        i6 = -122655113;
                    }
                    i15 = iM2568 ^ i6;
                    r0 = this;
                    sArr5 = sArr2;
                    sArr7 = sArr7;
                    viewOnClickListenerC12313 = r0;
                    resources = resources;
                    short[] sArr15 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr15;
                    break;
                case -1220425630:
                case 1428254354:
                    sArr = sArr6;
                    s = f36857[10];
                    i9 = s * s;
                    i10 = 213568996;
                    int iM6986 = (i12 - C2105.m6981("۟ۖ")) * 97;
                    i14 = ((iM6986 ^ i13) * 19093) ^ (-958582833);
                    i15 = iM6986 ^ 1450644801;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    i21 = i21;
                    i16 = i16;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr16 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr16;
                    break;
                case -1190580224:
                case 1436667946:
                    imageView2 = (ImageView) C0964.m3409(viewOnClickListenerC12313, C2105.m6981(C1504.m5177(sArr7, i17, 3, i16)) ^ 2129241022);
                    iM2566 = C2105.m6981("ۨ᩺") ^ i12;
                    i = ((iM2566 ^ i13) * (-5137)) ^ 1921570592;
                    i2 = 1888169365;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -1136927288:
                case -710605281:
                    resources = resources;
                    sArr7 = sArr7;
                    short[] sArr17 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    viewM12813 = C4263.m12813(viewOnClickListenerC12313, C0630.m2566(C2958.m9031(sArr17, i19, 3, i16)) ^ 2100896174);
                    if (!C0798.f2919) {
                        int iM25613 = C0630.m2566("ܳܽ") ^ i13;
                        sArr = sArr17;
                        i15 = iM25613 ^ 2066602735;
                        i14 = ((iM25613 ^ i12) * (-24547)) ^ (-1228181863);
                        r0 = viewOnClickListenerC12313;
                        sArr7 = sArr7;
                        viewOnClickListenerC12313 = r0;
                        resources = resources;
                        short[] sArr18 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr18;
                    } else {
                        sArr = sArr17;
                        window = windowM19115;
                        sArr4 = sArr4;
                        i7 = i20;
                        i21 = i21;
                        iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                        windowM19115 = window;
                        i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                        i8 = -701234045;
                        i15 = iM2569 ^ i8;
                        i20 = i7;
                        sArr7 = sArr7;
                        i21 = i21;
                        sArr4 = sArr4;
                        this = this;
                        resources = resources;
                        short[] sArr19 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr19;
                    }
                    break;
                case -1106764766:
                case 237472231:
                    if (C3663.m11168() < 0) {
                        iM2566 = C0630.m2566("᩺ۢ") ^ i13;
                        i = ((iM2566 ^ i12) * 8671) ^ 1220767233;
                        i2 = 305063533;
                        i15 = iM2566 ^ i2;
                        i14 = i;
                    } else {
                        sArr3 = sArr7;
                        resources = resources;
                        sArr2 = sArr5;
                        short[] sArr20 = sArr6;
                        i17 = i17;
                        i19 = i19;
                        sArr = sArr20;
                        iM2568 = (i12 - C0630.m2566("ܽ᩺")) * 93;
                        sArr7 = sArr3;
                        i14 = ((iM2568 ^ i13) * (-23563)) ^ (-1068804519);
                        i6 = -1871162292;
                        i15 = iM2568 ^ i6;
                        r0 = this;
                        sArr5 = sArr2;
                        sArr7 = sArr7;
                        viewOnClickListenerC12313 = r0;
                        resources = resources;
                        short[] sArr110 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr110;
                    }
                    break;
                case -1038260582:
                case 1446876338:
                    viewM3409 = C0964.m3409(viewOnClickListenerC12313, C2105.m6981(C1773.m5917(sArr8, i23, 3, i16)) ^ 2099332879);
                    if (C0050.f910 >= 0) {
                        iM2566 = (i12 - C0630.m2566("۬ᩴ")) * 79;
                        i = ((iM2566 ^ i13) * 17059) ^ (-1880600770);
                        i2 = 489683586;
                    } else {
                        iM2566 = C0630.m2566("۬֫") ^ i13;
                        i = ((iM2566 ^ i12) * (-24265)) ^ 318652205;
                        i2 = 310526981;
                    }
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -624300567:
                case 222011976:
                    resources = resources;
                    short[] sArr21 = sArr4;
                    int i27 = i21;
                    sArr7 = sArr7;
                    i7 = i20;
                    short[] sArr22 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    sArr = sArr22;
                    sArr4 = sArr21;
                    int iM25614 = C0630.m2566(AbstractC2021.m6573(sArr21, i7, i27, i16)) ^ 2118657943;
                    i21 = i27;
                    window = windowM19115;
                    window.setWindowAnimations(iM25614);
                    sArr5 = f36857;
                    i22 = 14;
                    if (C1916.f6442) {
                        windowM19115 = window;
                        iM2569 = C0630.m2566("ۢ᩶") ^ i12;
                        i14 = ((iM2569 ^ i13) * (-4439)) ^ 2127923923;
                        i8 = 1746867429;
                    } else {
                        iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                        windowM19115 = window;
                        i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                        i8 = -701234045;
                    }
                    i15 = iM2569 ^ i8;
                    i20 = i7;
                    sArr7 = sArr7;
                    i21 = i21;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr111 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr111;
                    break;
                case -605206783:
                case 1612155002:
                    sArr = sArr6;
                    i16 = 29833;
                    iM2567 = (C0630.m2566("ᩴ֫") + i13) * (-39);
                    i14 = ((iM2567 ^ i12) * (-5371)) ^ (-1524598725);
                    i5 = -733706212;
                    i15 = iM2567 ^ i5;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    i21 = i21;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr112 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr112;
                    break;
                case -173102567:
                case 1203439260:
                    sArr = sArr6;
                    i16 = 42567;
                    iM2567 = (C0630.m2566("ᩴ֫") + i13) * (-39);
                    i14 = ((iM2567 ^ i12) * (-5371)) ^ (-1524598725);
                    i5 = -733706212;
                    i15 = iM2567 ^ i5;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    i21 = i21;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr113 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr113;
                    break;
                case -162186772:
                case 1819561066:
                    imageView = (ImageView) viewM12813;
                    resources = getResources();
                    iM6984 = C2105.m6981(C0483.m2128(f36857, 20, 3, i16));
                    i18 = 2123568824;
                    iM2566 = (i12 - C2105.m6981("᩻ܰ")) * (-29);
                    i = ((iM2566 ^ i13) * 31921) ^ (-1645789231);
                    i2 = 1769190041;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case -82102145:
                case 661730435:
                    C2126.m7039(C0964.m3409(viewOnClickListenerC12313, iM25610), viewOnClickListenerC12313);
                    strM9031 = C2958.m9031(f36857, 38, 3, i16);
                    if (C3019.f9544 < 0) {
                        iM2566 = C0630.m2566("ᩴܰ") ^ i13;
                        i = ((iM2566 ^ i12) * 10173) ^ 1856699608;
                        i2 = -181029018;
                        i15 = iM2566 ^ i2;
                        i14 = i;
                    } else {
                        window = windowM19115;
                        resources = resources;
                        sArr4 = sArr4;
                        i21 = i21;
                        sArr7 = sArr7;
                        i7 = i20;
                        short[] sArr23 = sArr6;
                        i17 = i17;
                        i19 = i19;
                        sArr = sArr23;
                        iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                        windowM19115 = window;
                        i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                        i8 = -701234045;
                        i15 = iM2569 ^ i8;
                        i20 = i7;
                        sArr7 = sArr7;
                        i21 = i21;
                        sArr4 = sArr4;
                        this = this;
                        resources = resources;
                        short[] sArr114 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr114;
                    }
                    break;
                case 175425175:
                case 1377579299:
                    C4159.m12564(C4263.m12813(viewOnClickListenerC12313, C2105.m6981(strM4373) ^ 2118453229), viewOnClickListenerC12313);
                    sArr8 = f36857;
                    i23 = 32;
                    iM2566 = C2105.m6981("۠۬") ^ i12;
                    i = ((iM2566 ^ i13) * (-30981)) ^ 1255778199;
                    i2 = -530259202;
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case 365014835:
                case 1037096036:
                    if (C0630.f2410 > 0) {
                        iM2566 = C2105.m6981("֡᩸") ^ i13;
                        i = ((iM2566 ^ i12) * (-1353)) ^ 715597246;
                        i2 = -990304475;
                        i15 = iM2566 ^ i2;
                        i14 = i;
                    } else {
                        window = windowM19115;
                        resources = resources;
                        sArr4 = sArr4;
                        i21 = i21;
                        sArr7 = sArr7;
                        i7 = i20;
                        short[] sArr24 = sArr6;
                        i17 = i17;
                        i19 = i19;
                        sArr = sArr24;
                        iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                        windowM19115 = window;
                        i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                        i8 = -701234045;
                        i15 = iM2569 ^ i8;
                        i20 = i7;
                        sArr7 = sArr7;
                        i21 = i21;
                        sArr4 = sArr4;
                        this = this;
                        resources = resources;
                        short[] sArr115 = sArr;
                        i19 = i19;
                        i17 = i17;
                        sArr6 = sArr115;
                    }
                    break;
                case 522825586:
                case 1391625583:
                    resources2 = getResources();
                    iM25611 = C0630.m2566(C7811.m20837(f36857, 26, 3, i16));
                    if (C2105.f7037 != 0) {
                        iM2566 = (i12 - C0630.m2566("۬ᩴ")) * 79;
                        i = ((iM2566 ^ i13) * 17059) ^ (-1880600770);
                        i2 = 489683586;
                    } else {
                        iM2566 = (C2105.m6981("ۧ۟") + i13) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2566 ^ i12) * 19783) ^ (-49473535);
                        i2 = 1422721952;
                    }
                    i15 = iM2566 ^ i2;
                    i14 = i;
                    break;
                case 787497735:
                case 1506813872:
                    sArr = sArr6;
                    short s2 = s;
                    if ((s2 * 29228) - (i9 + i10) <= 0) {
                        iM6981 = C2105.m6981("֫ܳ") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-22481)) ^ (-900228286);
                        i4 = 2027297176;
                    } else {
                        iM6981 = (C2105.m6981("۟ۗ") + i12) * (-29);
                        i3 = ((iM6981 ^ i13) * (-4299)) ^ 597533062;
                        i4 = -1010478143;
                    }
                    i15 = iM6981 ^ i4;
                    s = s2;
                    i14 = i3;
                    sArr5 = sArr5;
                    sArr7 = sArr7;
                    i21 = i21;
                    i16 = i16;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr116 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr116;
                    break;
                case 1233251003:
                case 1941479903:
                    C7106.m19120();
                    C1005.m3501();
                    window = windowM19115;
                    resources = resources;
                    sArr4 = sArr4;
                    i21 = i21;
                    sArr7 = sArr7;
                    i7 = i20;
                    short[] sArr25 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    sArr = sArr25;
                    iM2569 = (C0630.m2566("᩷᩸") + i12) * 85;
                    windowM19115 = window;
                    i14 = ((iM2569 ^ i13) * 24749) ^ 1620798947;
                    i8 = -701234045;
                    i15 = iM2569 ^ i8;
                    i20 = i7;
                    sArr7 = sArr7;
                    i21 = i21;
                    sArr4 = sArr4;
                    this = this;
                    resources = resources;
                    short[] sArr117 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr117;
                    break;
                case 1248240473:
                case 1564425495:
                    resources = resources;
                    short[] sArr26 = sArr7;
                    short[] sArr27 = sArr6;
                    i17 = i17;
                    i19 = i19;
                    sArr = sArr27;
                    short[] sArr28 = sArr5;
                    int i28 = i22;
                    iM6983 = C2105.m6981(C1294.m4373(sArr28, i28, 3, i16)) ^ 2120328928;
                    int iM25615 = C0630.m2566("ۖۖ") ^ i13;
                    i14 = ((iM25615 ^ i12) * 31655) ^ 456598497;
                    i15 = iM25615 ^ (-383696743);
                    viewOnClickListenerC12313 = this;
                    sArr5 = sArr28;
                    sArr7 = sArr26;
                    i22 = i28;
                    resources = resources;
                    short[] sArr118 = sArr;
                    i19 = i19;
                    i17 = i17;
                    sArr6 = sArr118;
                    break;
                default:
                    C4925.m14329(viewOnClickListenerC12313.f36861);
                    viewOnClickListenerC12313.bindService(new Intent((Context) viewOnClickListenerC12313, (Class<?>) ServiceC13018.class), viewOnClickListenerC12313, 0);
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ViewOnClickListenerC8597 viewOnClickListenerC8597 = null;
        int i2 = -977946489;
        int i3 = RunnableC3474.f10992;
        int i4 = C3911.f12484;
        int iM6981 = C2105.m6981("ᩳۤ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-21817)) ^ 2089937046;
        int i6 = 999046065;
        while (true) {
            i2 = ((((i2 ^ i4) * 23809) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2070732268:
                case -1358536120:
                    if (i == 66) {
                        iM6981 = (C2105.m6981("ܶۖ") + i3) * 115;
                        i5 = ((iM6981 ^ i4) * (-32333)) ^ (-352262702);
                        i6 = 1785328248;
                    } else {
                        iM6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                    break;
                case -1769466961:
                case -1286563621:
                    viewOnClickListenerC8597 = this.f36859;
                    if (viewOnClickListenerC8597 != null) {
                        iM6981 = C2105.m6981("֡ᩳ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 27311) ^ 1348894376;
                        i6 = -1698891100;
                    } else {
                        iM6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                    break;
                case -1750256743:
                case -893326558:
                    RunnableC1108.m3781(this);
                    return true;
                case -1620213022:
                case -1529992074:
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((iM6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        iM6981 = C0630.m2566("ܶۚ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 19335) ^ 96834468;
                        i6 = 1230175154;
                    }
                    break;
                case -1586256867:
                case 571730278:
                    if (C0798.m2998() != 0) {
                        iM6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        iM6981 = (C0630.m2566("֫ۜ") + i3) * (-47);
                        i5 = ((iM6981 ^ i4) * 24509) ^ (-1857438934);
                        i6 = 102015021;
                    }
                    break;
                case -1474095682:
                case 1577003749:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((iM6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        iM6981 = (C0630.m2566("ۢ۬") + i4) * 53;
                        i5 = ((iM6981 ^ i3) * 9745) ^ 1913389382;
                        i6 = 846845151;
                    }
                    break;
                case -1462243781:
                case 47422166:
                    if (i == 4) {
                        iM6981 = (C2105.m6981("ۖۖ") + i3) * (-37);
                        i5 = ((iM6981 ^ i4) * 11085) ^ (-1448146919);
                        i6 = 305152797;
                    } else {
                        iM6981 = C0630.m2566("ۧ۠") ^ i4;
                        i5 = ((iM6981 ^ i3) * 20381) ^ (-497211564);
                        i6 = -550303101;
                    }
                    break;
                case -1432003077:
                case 1388597736:
                    C3663.m11168();
                    C3432.m10477();
                    return false;
                case -1303477497:
                case 2079656444:
                    return false;
                case -1153957370:
                case 64362675:
                    if (C0964.f3626 != 0) {
                        iM6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        iM6981 = (C2105.m6981("ۘ۫") + i3) * (-9);
                        i5 = ((iM6981 ^ i4) * (-323)) ^ (-1469968230);
                        i6 = 647234814;
                    }
                    break;
                case -1008368010:
                case 1879289139:
                    C1504.m5179();
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("ܿᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 933) ^ 1689359183;
                        i6 = -475728073;
                    } else {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    }
                    break;
                case -784197167:
                case 1699490016:
                    if (C4263.m12819() >= 0) {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        iM6981 = (C2105.m6981("ᩴۜ") ^ i3) * 123;
                        i5 = ((iM6981 ^ i4) * (-19819)) ^ (-725989490);
                        i6 = -1811657531;
                    }
                    break;
                case -781103237:
                case 280790813:
                    C21923.m49329();
                    C0237.m1481();
                    iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                    i6 = 858680642;
                    break;
                case -563540435:
                case -180078370:
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C0630.m2566("ۗ᩹") ^ i4) * (-5);
                        i5 = ((iM6981 ^ i3) * (-11643)) ^ 1170620265;
                        i6 = 224649174;
                    } else {
                        iM6981 = (C2105.m6981("۫ۖ") + i3) * 43;
                        i5 = ((iM6981 ^ i4) * 6407) ^ 159188422;
                        i6 = -633185901;
                    }
                    break;
                case -240615205:
                case 683200635:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩺") ^ i4) * 79;
                        i5 = ((iM6981 ^ i3) * (-27603)) ^ (-1971993652);
                        i6 = 975727858;
                    }
                    break;
                case 88549943:
                case 1174372345:
                    if (RunnableC1937.f6483 < 0) {
                        iM6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    }
                    break;
                case 741228178:
                case 1894697691:
                    C0483.m2121();
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܰ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i4) * (-18989)) ^ (-1393294930);
                        i6 = 1492321455;
                    } else {
                        iM6981 = C0630.m2566("ܿᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 933) ^ 1689359183;
                        i6 = -475728073;
                    }
                    break;
                case 969994319:
                case 1932538470:
                    if (keyEvent.getAction() == 0) {
                        iM6981 = C2105.m6981("ᩴ᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-2203)) ^ (-856599312);
                        i6 = 1651722885;
                    } else {
                        iM6981 = C0630.m2566("۠֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4845) ^ 1632054859;
                        i6 = 438247065;
                    }
                    break;
                case 1004710269:
                case 2086605891:
                    viewOnClickListenerC8597.onClick(null);
                    iM6981 = C0630.m2566("۠֨") ^ i3;
                    i5 = ((iM6981 ^ i4) * 4845) ^ 1632054859;
                    i6 = 438247065;
                    break;
                case 1449340215:
                case 2054769994:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C0630.m2566("᩺۫") + i4) * 93;
                        i5 = ((iM6981 ^ i3) * 30385) ^ 321863989;
                        i6 = -250805261;
                    } else {
                        iM6981 = (C0630.m2566("᩷ܺ") + i4) * (-75);
                        i5 = ((iM6981 ^ i3) * (-23673)) ^ 1782819456;
                        i6 = -1346017338;
                    }
                    break;
                case 1516621005:
                case 1912317636:
                    if (C1916.f6442) {
                        iM6981 = (i4 - C2105.m6981("ۨۙ")) * (-61);
                        i5 = ((iM6981 ^ i3) * (-32759)) ^ (-579825486);
                        i6 = 1567045233;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܰ֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM6981 ^ i4) * (-18989)) ^ (-1393294930);
                        i6 = 1492321455;
                    }
                    break;
                default:
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-30421)) ^ (-1954957050);
                        i6 = 858680642;
                    } else {
                        iM6981 = (i4 - C0630.m2566("۠ܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM6981 ^ i3) * (-2665)) ^ 1438703826;
                        i6 = 950047721;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x041a A[PHI: r1 r8 r10 r13 r16 r18
      0x041a: PHI (r1v14 short) = (r1v13 short), (r1v15 short) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]
      0x041a: PHI (r8v3 short) = (r8v2 short), (r8v4 short) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]
      0x041a: PHI (r10v47 short[]) = (r10v46 short[]), (r10v48 short[]) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]
      0x041a: PHI (r13v24 int) = (r13v23 int), (r13v25 int) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]
      0x041a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]
      0x041a: PHI (r18v3 int) = (r18v2 int), (r18v4 int) binds: [B:104:0x0418, B:95:0x03be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if (l.C2105.f7037 == 0) goto L10;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int iM6981;
        int i4;
        int i5;
        int iM2568;
        int i6;
        int i7 = C4117.f13076;
        int i8 = C3019.f9544;
        int iM2569 = (C0630.m2566("ۙۨ") + i8) * 53;
        int i9 = ((iM2569 ^ i7) * (-32127)) ^ (-1931744749);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM2569 ^ (-822715004);
        int i11 = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        int i17 = -1934281540;
        int i18 = 0;
        String strM2816 = null;
        String strM2817 = null;
        String strM5917 = null;
        int iM3006 = 0;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i7) * 15461) >> 31));
            switch (i17) {
                case -1978340160:
                case 197703303:
                    C4159.m12565();
                    C1128.m3851();
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    iM6981 = C0630.m2566("۟ۨ") ^ i8;
                    i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                    i5 = 439184413;
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -1935938431:
                case -1605373285:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if ((s * s2) - i18 <= 0) {
                        iM6981 = C2105.m6981("ۢ᩷") ^ i8;
                        i4 = ((iM6981 ^ i7) * 31347) ^ (-1343674016);
                        i5 = 305792266;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩸") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-18347)) ^ (-291325077);
                        i5 = 972421298;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -1717747048:
                case 203296979:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    strM5917 = C1773.m5917(sArr2, i14, i15, i13);
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("۟ۨ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                        i5 = 439184413;
                    } else {
                        iM6981 = C2105.m6981("֫ۗ") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-6661)) ^ (-825565149);
                        i5 = 1915271182;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -1716130530:
                case -1136594890:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    strM2816 = C0714.m2816(f36857, 7, 3, i13);
                    if (C2105.f7037 == 0) {
                        iM2567 = (C2105.m6981("ۘ۠") + i8) * 47;
                        i = ((iM2567 ^ i7) * 31139) ^ 1293697666;
                        i3 = 239145245;
                        int i19 = iM2567 ^ i3;
                        sArr2 = sArr2;
                        i14 = i14;
                        i10 = i19;
                        int i20 = i;
                        s2 = s2;
                        i9 = i20;
                    } else {
                        sArr2 = sArr2;
                        i14 = i14;
                        iM6981 = C0630.m2566("۟ۨ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                        i5 = 439184413;
                        i10 = iM6981 ^ i5;
                        s2 = s2;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    }
                    break;
                case -1694112203:
                case 4062942:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if (ViewOnClickListenerC1958.m6432() - this.f36858 < 300) {
                        iM2567 = C0630.m2566("֡ۖ") ^ i8;
                        i = ((iM2567 ^ i7) * 9573) ^ (-1150328211);
                        i3 = -1340820220;
                    } else {
                        iM2567 = (C2105.m6981("ᩴ᩺") ^ i7) * 35;
                        i = ((iM2567 ^ i8) * (-21239)) ^ 191298300;
                        i3 = -1801257280;
                    }
                    int i110 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i110;
                    int i21 = i;
                    s2 = s2;
                    i9 = i21;
                    break;
                case -1435521664:
                case 962724248:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    strM2817 = C0714.m2816(sArr3, i11, i12, i13);
                    if (C3432.f10845 < 0) {
                        iM2567 = (C0630.m2566("ܰۡ") + i7) * (-45);
                        i = ((iM2567 ^ i8) * 5255) ^ 1567965906;
                        i3 = 1555857827;
                        int i111 = iM2567 ^ i3;
                        sArr2 = sArr2;
                        i14 = i14;
                        i10 = i111;
                        int i22 = i;
                        s2 = s2;
                        i9 = i22;
                    } else {
                        sArr2 = sArr2;
                        i14 = i14;
                        iM6981 = C0630.m2566("۟ۨ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                        i5 = 439184413;
                        i10 = iM6981 ^ i5;
                        s2 = s2;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    }
                    break;
                case -1366189931:
                case 1871034362:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if (iM3006 == (C0630.m2566(strM2816) ^ 2129375962)) {
                        iM2567 = C2105.m6981("۫᩻") ^ i7;
                        i = ((iM2567 ^ i8) * 20867) ^ (-1920184930);
                        i3 = -842232734;
                    } else {
                        iM2567 = C0630.m2566("᩷ܰ") ^ i8;
                        i = ((iM2567 ^ i7) * (-9933)) ^ 1114637106;
                        i3 = 1431539197;
                    }
                    int i112 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i112;
                    int i23 = i;
                    s2 = s2;
                    i9 = i23;
                    break;
                case -1192149100:
                case -106921044:
                    break;
                case -1054457317:
                case 317507657:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    s = sArr[c];
                    i16 = s * s;
                    if (RunnableC1108.f4040) {
                        iM6981 = (C2105.m6981("ۧۡ") + i7) * (-95);
                        i4 = ((iM6981 ^ i8) * 22219) ^ (-1971979905);
                        i5 = 371421117;
                    } else {
                        iM6981 = C0630.m2566("᩺֨") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-4483)) ^ 692680856;
                        i5 = -1110860770;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -968054687:
                case 449217701:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    sArr3 = f36857;
                    i11 = 4;
                    i12 = 3;
                    if (C1047.f3863 < 0) {
                        iM2567 = C2105.m6981("ܳ᩺") ^ i8;
                        i = ((iM2567 ^ i7) * 5963) ^ (-942290872);
                        i3 = -725388849;
                        int i113 = iM2567 ^ i3;
                        sArr2 = sArr2;
                        i14 = i14;
                        i10 = i113;
                        int i24 = i;
                        s2 = s2;
                        i9 = i24;
                    } else {
                        sArr2 = sArr2;
                        i14 = i14;
                        iM6981 = C0630.m2566("۟ۨ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                        i5 = 439184413;
                        i10 = iM6981 ^ i5;
                        s2 = s2;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    }
                    break;
                case -833992063:
                case 1823963754:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    iM3006 = C0798.m3006(view);
                    if (iM3006 == 16908314) {
                        iM6981 = (C2105.m6981("ܳۗ") + i7) * 17;
                        i4 = ((iM6981 ^ i8) * 16051) ^ (-1773024450);
                        i5 = -652785866;
                    } else {
                        iM6981 = (i7 - C2105.m6981("᩹۫")) * 97;
                        i4 = ((iM6981 ^ i8) * 28665) ^ 2089394666;
                        i5 = -18185285;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -712482183:
                case 532710734:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if (iM3006 == 16908315) {
                        iM6981 = (i8 - C0630.m2566("֨۟")) * (-37);
                        i4 = ((iM6981 ^ i7) * (-5703)) ^ (-1338354264);
                        i5 = 1124025021;
                    } else {
                        iM6981 = C0630.m2566("ܶᩴ") ^ i8;
                        i4 = ((iM6981 ^ i7) * (-31695)) ^ 912935483;
                        i5 = -1824844667;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -587282276:
                case 1371038808:
                    sArr2 = sArr2;
                    i14 = i14;
                    i18 = i16 + 13542400;
                    s2 = 7360;
                    if (AbstractC2021.m6574()) {
                        iM2568 = C0630.m2566("ۤܶ") ^ i7;
                        i4 = ((iM2568 ^ i8) * (-527)) ^ (-1293904014);
                        i6 = -589452619;
                    } else {
                        iM2568 = (C0630.m2566("ۡۤ") ^ i8) * (-25);
                        i4 = ((iM2568 ^ i7) * (-6955)) ^ 1188406128;
                        i6 = 1802595582;
                    }
                    i10 = iM2568 ^ i6;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -488902357:
                case 113532337:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if (iM3006 == (C0630.m2566(strM2817) ^ 2128655311)) {
                        iM2567 = C2105.m6981("ܰ۠") ^ i7;
                        i = ((iM2567 ^ i8) * 23645) ^ (-2139324184);
                        i3 = 439649796;
                    } else {
                        iM2567 = (C0630.m2566("᩹ᩴ") ^ i7) * (-89);
                        i = ((iM2567 ^ i8) * (-23991)) ^ (-293721380);
                        i3 = 1866154386;
                    }
                    int i114 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i114;
                    int i25 = i;
                    s2 = s2;
                    i9 = i25;
                    break;
                case -448912130:
                case 901920146:
                    this.f36859.m22325();
                    break;
                case -352109353:
                case 942103194:
                    if (!C1005.f3721) {
                        s2 = s2;
                        sArr2 = sArr2;
                        i14 = i14;
                        iM6981 = C0630.m2566("۟ۨ") ^ i8;
                        i4 = ((iM6981 ^ i7) * 24545) ^ 1921972420;
                        i5 = 439184413;
                        i10 = iM6981 ^ i5;
                        s2 = s2;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    } else {
                        s2 = s2;
                        iM2566 = C2105.m6981("ۧۘ") ^ i8;
                        i = ((iM2566 ^ i7) * (-9665)) ^ (-1450963064);
                        i2 = -1303241038;
                        i10 = iM2566 ^ i2;
                        int i26 = i;
                        s2 = s2;
                        i9 = i26;
                    }
                    break;
                case -190534864:
                case -60247313:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    sArr = f36857;
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("᩺֨") ^ i7;
                        i4 = ((iM6981 ^ i8) * (-4483)) ^ 692680856;
                        i5 = -1110860770;
                    } else {
                        iM6981 = C2105.m6981("᩺᩻") ^ i8;
                        i4 = ((iM6981 ^ i7) * 4443) ^ 834292242;
                        i5 = -348904880;
                    }
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case -157474042:
                case 1572178337:
                    C2272.m7505(this);
                    break;
                case -143941855:
                case 110552289:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    c = 0;
                    if (C3245.f10203 > 0) {
                        iM6981 = (C2105.m6981("᩻᩷") + i7) * (-91);
                        i4 = ((iM6981 ^ i8) * (-9281)) ^ 391285107;
                        i5 = -468806924;
                        i10 = iM6981 ^ i5;
                        s2 = s2;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    } else {
                        i14 = i14;
                        sArr2 = sArr2;
                        iM2566 = C2105.m6981("ۧۘ") ^ i8;
                        i = ((iM2566 ^ i7) * (-9665)) ^ (-1450963064);
                        i2 = -1303241038;
                        i10 = iM2566 ^ i2;
                        int i27 = i;
                        s2 = s2;
                        i9 = i27;
                    }
                    break;
                case -141804028:
                case 479475262:
                    C0798.m2998();
                    C2958.m9034();
                    break;
                case -6593745:
                case 1745692713:
                    i13 = a.E;
                    iM6981 = (C2105.m6981("۟ܿ") + i8) * (-19);
                    i4 = ((iM6981 ^ i7) * 19599) ^ 537292018;
                    i5 = 809832474;
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case 22924304:
                case 1291712787:
                    this.f36862 = true;
                    C2272.m7505(this);
                    break;
                case 28284129:
                case 1514096445:
                    C7106.m19120();
                    break;
                case 442879085:
                case 1409564866:
                    C2272.m7505(this);
                    break;
                case 618763301:
                case 1547169983:
                    s2 = s2;
                    sArr2 = sArr2;
                    i14 = i14;
                    if (iM3006 == (C0630.m2566(strM5917) ^ 2124186337)) {
                        iM2567 = (C0630.m2566("ۢܳ") ^ i8) * (-85);
                        i = ((iM2567 ^ i7) * 7721) ^ (-296022437);
                        i3 = -1275634752;
                    } else {
                        iM2567 = C0630.m2566("֨ۖ") ^ i7;
                        i = ((iM2567 ^ i8) * 30673) ^ 2043705869;
                        i3 = -1870297880;
                    }
                    int i115 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i115;
                    int i28 = i;
                    s2 = s2;
                    i9 = i28;
                    break;
                case 863541893:
                case 1866239241:
                    i13 = 488;
                    iM6981 = (C2105.m6981("۟ܿ") + i8) * (-19);
                    i4 = ((iM6981 ^ i7) * 19599) ^ 537292018;
                    i5 = 809832474;
                    i10 = iM6981 ^ i5;
                    s2 = s2;
                    i9 = i4;
                    i14 = i14;
                    sArr2 = sArr2;
                    break;
                case 1167794409:
                case 2124047499:
                    s2 = s2;
                    sArr2 = f36857;
                    i14 = 1;
                    i15 = 3;
                    if (C0964.f3626 != 0) {
                        iM2566 = C2105.m6981("ۧۘ") ^ i8;
                        i = ((iM2566 ^ i7) * (-9665)) ^ (-1450963064);
                        i2 = -1303241038;
                    } else {
                        iM2566 = (i8 - C0630.m2566("᩸ۢ")) * 51;
                        i = ((iM2566 ^ i7) * (-8747)) ^ (-109733326);
                        i2 = -820713942;
                    }
                    i10 = iM2566 ^ i2;
                    int i29 = i;
                    s2 = s2;
                    i9 = i29;
                    break;
                case 1226440259:
                case 1411483828:
                    s2 = s2;
                    this.f36858 = C1294.m4371();
                    sArr2 = sArr2;
                    i14 = i14;
                    iM2567 = C0630.m2566("᩷ܰ") ^ i8;
                    i = ((iM2567 ^ i7) * (-9933)) ^ 1114637106;
                    i3 = 1431539197;
                    int i116 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i116;
                    int i210 = i;
                    s2 = s2;
                    i9 = i210;
                    break;
                case 1609780115:
                case 2039114209:
                    RunnableC1108.m3790();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2567 = C2105.m6981("᩸ۙ") ^ i7;
                        i = ((iM2567 ^ i8) * 2515) ^ 1714215262;
                        i3 = 1466250535;
                        int i117 = iM2567 ^ i3;
                        sArr2 = sArr2;
                        i14 = i14;
                        i10 = i117;
                        int i211 = i;
                        s2 = s2;
                        i9 = i211;
                    } else {
                        sArr2 = sArr2;
                        i14 = i14;
                        iM2568 = C0630.m2566("ۤܶ") ^ i7;
                        i4 = ((iM2568 ^ i8) * (-527)) ^ (-1293904014);
                        i6 = -589452619;
                        i10 = iM2568 ^ i6;
                        i9 = i4;
                        i14 = i14;
                        sArr2 = sArr2;
                    }
                    break;
                default:
                    RunnableC1108.m3781(this);
                    if (C4075.m12263() > 0) {
                        C4075.m12261(this, new Intent(this, (Class<?>) ServiceConnectionC10197.class));
                    }
                    iM2567 = C2105.m6981("᩸ۙ") ^ i7;
                    i = ((iM2567 ^ i8) * 2515) ^ 1714215262;
                    i3 = 1466250535;
                    int i118 = iM2567 ^ i3;
                    sArr2 = sArr2;
                    i14 = i14;
                    i10 = i118;
                    int i212 = i;
                    s2 = s2;
                    i9 = i212;
                    break;
            }
            return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        short[] sArr = null;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = -690190052;
        int i4 = RunnableC3474.f10992;
        int i5 = C1773.f6144;
        int iM2566 = (C0630.m2566("ۨᩴ") + i5) * 41;
        int i6 = ((iM2566 ^ i4) * 23669) ^ 1171340574;
        int i7 = -836420703;
        while (true) {
            i3 = ((((i3 ^ i4) * 1827) >> 31) & i6) ^ (iM2566 ^ i7);
            switch (i3) {
                case -1938301887:
                case -62089909:
                    C2520.m8026();
                    iM2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                    i6 = ((iM2566 ^ i4) * 22005) ^ (-2077672137);
                    i7 = -1897999531;
                    break;
                case -1751173887:
                case -1745424971:
                    i2 = 39137;
                    iM2566 = (C2105.m6981("۟ۡ") ^ i4) * 41;
                    i6 = ((iM2566 ^ i5) * 271) ^ 1210073510;
                    i7 = -1589924385;
                    break;
                case -1706257700:
                case -1308637859:
                    short[] sArr2 = f36857;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    } else {
                        String strM6311 = C1916.m6311(sArr2, 49, 3, i2);
                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                            iM2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                            i6 = ((iM2566 ^ i4) * (-4947)) ^ 1255736872;
                            i7 = -650478129;
                        } else {
                            int iM2567 = C0630.m2566(strM6311);
                            if (RunnableC1937.f6483 < 0) {
                                View viewM12813 = C4263.m12813(this, iM2567 ^ 2128377421);
                                if (C4159.m12565() < 0) {
                                    C12534 c12534M9567 = this.f36860.m9567();
                                    if (C11340.m28031()) {
                                        ViewOnClickListenerC8597 viewOnClickListenerC8597 = new ViewOnClickListenerC8597(this, viewM12813, c12534M9567);
                                        this.f36859 = viewOnClickListenerC8597;
                                        viewOnClickListenerC8597.m22326(ServiceC13018.f38962);
                                    }
                                    iM2566 = C2105.m6981("۟ۨ") ^ i4;
                                    i6 = ((iM2566 ^ i5) * (-3397)) ^ (-1953964010);
                                    i7 = -994926453;
                                    break;
                                }
                            }
                            iM2566 = (i5 - C2105.m6981("ۢ۫")) * 75;
                            i6 = ((iM2566 ^ i4) * 7433) ^ (-949730809);
                            i7 = 4114029;
                        }
                    }
                    break;
                case -1679480866:
                case 1404895029:
                    i = (s * s) + 197964900;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((iM2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        iM2566 = C0630.m2566("ܳۛ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 9227) ^ (-800921592);
                        i7 = -522855510;
                    }
                    break;
                case -1520912689:
                case 42526175:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                        i6 = ((iM2566 ^ i4) * (-4947)) ^ 1255736872;
                        i7 = -650478129;
                    } else {
                        iM2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    }
                    break;
                case -1434516576:
                case 325256585:
                    i2 = 5298;
                    iM2566 = (C2105.m6981("۟ۡ") ^ i4) * 41;
                    i6 = ((iM2566 ^ i5) * 271) ^ 1210073510;
                    i7 = -1589924385;
                    break;
                case -1360203352:
                case -346222196:
                    sArr = f36857;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ۚۡ") + i5) * 5;
                        i6 = ((iM2566 ^ i4) * (-4947)) ^ 1255736872;
                        i7 = -650478129;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩶") ^ i4) * 89;
                        i6 = ((iM2566 ^ i5) * (-32679)) ^ (-484157114);
                        i7 = 1883915330;
                    }
                    break;
                case -1325011006:
                case 1750373335:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-3397)) ^ (-1953964010);
                        i7 = -994926453;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((iM2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    }
                    break;
                case -1323734579:
                case -832021420:
                    if ((s * 28140) - i > 0) {
                        iM2566 = C0630.m2566("ۛۛ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-29481)) ^ (-1183686492);
                        i7 = -2067613386;
                    } else {
                        iM2566 = C0630.m2566("۫ܰ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 21639) ^ (-1997689786);
                        i7 = -160094967;
                    }
                    break;
                case -1302459021:
                case 227976550:
                    if (C1005.m3501()) {
                        iM2566 = (C0630.m2566("ۧ᩶") ^ i5) * (-107);
                        i6 = ((iM2566 ^ i4) * 20413) ^ (-757400060);
                        i7 = -1650903935;
                    } else {
                        iM2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    }
                    break;
                case -1292043361:
                case 1912187996:
                    C3683.m11222();
                    C1005.m3501();
                    break;
                case 187165793:
                case 256262008:
                    BinderC3141 binderC3141 = (BinderC3141) iBinder;
                    this.f36860 = binderC3141;
                    binderC3141.m9568();
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("۟ۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-3397)) ^ (-1953964010);
                        i7 = -994926453;
                    } else {
                        iM2566 = (C0630.m2566("֡ۧ") ^ i5) * (-57);
                        i6 = ((iM2566 ^ i4) * 22203) ^ 1852462190;
                        i7 = 234305836;
                    }
                    break;
                case 1155895474:
                case 2053412572:
                    s = sArr[48];
                    if (C0237.m1481() >= 0) {
                        iM2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((iM2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    } else {
                        iM2566 = (C2105.m6981("ۤᩳ") + i4) * 127;
                        i6 = ((iM2566 ^ i5) * 16829) ^ 1764584065;
                        i7 = 135661466;
                    }
                    break;
                default:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ۤۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 6923) ^ (-778954849);
                        i7 = -1650031518;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩻") ^ i5) * 115;
                        i6 = ((iM2566 ^ i4) * 22005) ^ (-2077672137);
                        i7 = -1897999531;
                    }
                    break;
            }
            return;
        }
    }
}
