package l;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: l.ۚۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5258 implements Runnable {

    /* JADX INFO: renamed from: ᩴ᩹ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f16449 = {833, -21580, -21587, -21525, -21626, -21591, -21576, -21587, -21583, -21514, -21590, -21571, -21574, -21576, -21589, -21571, -21514, -21612, -21619, -21525, -10092, -9553, 12131};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16450;

    public /* synthetic */ RunnableC5258(int i) {
        this.f16450 = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x015b A[PHI: r4 r5
      0x015b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:39:0x0159, B:23:0x00da, B:17:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:39:0x0159, B:23:0x00da, B:17:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0193 A[PHI: r3
      0x0193: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:43:0x0191, B:14:0x0081, B:12:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ff A[PHI: r7 r9 r19 r21 r25
      0x02ff: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:73:0x02fd, B:51:0x0203, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:73:0x02fd, B:51:0x0203, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:73:0x02fd, B:51:0x0203, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r21v4 short) = (r21v3 short), (r21v2 short), (r21v2 short) binds: [B:73:0x02fd, B:51:0x0203, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02ff: PHI (r25v35 int) = (r25v5 int), (r25v12 int), (r25v36 int) binds: [B:73:0x02fd, B:51:0x0203, B:7:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x035b A[PHI: r1 r10 r12 r13 r15 r16 r17 r18 r20 r26
      0x035b: PHI (r1v4 android.content.SharedPreferences) = 
      (r1v2 android.content.SharedPreferences)
      (r1v3 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
     binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r16v5 short[]) = (r16v4 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r17v5 char) = (r17v4 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r18v5 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r20v5 short) = (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x035b: PHI (r26v20 int) = (r26v6 int), (r26v17 int), (r26v3 int), (r26v3 int), (r26v3 int) binds: [B:78:0x0336, B:55:0x0225, B:33:0x012d, B:12:0x007d, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006c, code lost:
    
        if (l.RunnableC1108.f4040 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        if (l.C4117.f13076 <= 0) goto L83;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0247. Please report as an issue. */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int iM2567;
        int i4;
        int i5 = C3245.f10203;
        int i6 = C11340.f33930;
        int iM6982 = (C2105.m6981("ۡ۠") ^ i5) * (-95);
        int i7 = ((iM6982 ^ i6) * 9405) ^ (-1465025756);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i8 = iM6982 ^ 143692996;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        char c = 0;
        short s = 0;
        int i13 = 0;
        short s2 = 0;
        short s3 = 0;
        int i14 = -1814972691;
        int i15 = 0;
        String strM10633 = null;
        SharedPreferences.Editor editorPutString = null;
        String strM38319 = null;
        String strM3506 = null;
        String strM7036 = null;
        String strM9031 = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i6) * (-27739)) >> 31));
            switch (i14) {
                case -1823333799:
                case -24964256:
                    C0050.m940();
                    iM2566 = C2105.m6981("ۡۖ") ^ i6;
                    i = ((iM2566 ^ i5) * 9271) ^ 706034142;
                    i3 = 1331553974;
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -1686692449:
                case 529470134:
                    C3245.m9925();
                    break;
                case -1567947522:
                case -819667366:
                    strM3506 = C1005.m3506(sharedPreferences, strM9031, strM7036);
                    strM38319 = C16293.m38319(strM3506);
                    if (ViewOnClickListenerC1958.m6437(strM38319, strM3506)) {
                        iM2566 = C2105.m6981("۠֫") ^ i5;
                        i = ((iM2566 ^ i6) * (-107)) ^ 217693910;
                        i3 = 2017068551;
                    } else {
                        iM2566 = C0630.m2566("۠ܺ") ^ i6;
                        i = ((iM2566 ^ i5) * (-9547)) ^ (-774207896);
                        i3 = -561397276;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -1455278662:
                case 1212528211:
                    C10537.m26457();
                    break;
                case -1400383847:
                case 343665899:
                    i15 = i15;
                    switch (this.f16450) {
                        case 0:
                            iM6981 = C0630.m2566("ܽ۬") ^ i6;
                            i = ((iM6981 ^ i5) * 15727) ^ (-820522699);
                            i2 = 527611747;
                            int i16 = iM6981 ^ i2;
                            i15 = i15;
                            i8 = i16;
                            i7 = i;
                            break;
                        case 1:
                            iM2567 = (C0630.m2566("᩷ۙ") + i5) * (-107);
                            i7 = ((iM2567 ^ i6) * 16665) ^ (-1446624777);
                            i4 = 1017934408;
                            int i17 = iM2567 ^ i4;
                            i15 = i15;
                            i8 = i17;
                            break;
                        default:
                            iM6981 = (C2105.m6981("ܰ᩸") + i6) * (-55);
                            i = ((iM6981 ^ i5) * (-24843)) ^ (-2830125);
                            i2 = 834763060;
                            int i18 = iM6981 ^ i2;
                            i15 = i15;
                            i8 = i18;
                            i7 = i;
                            break;
                    }
                    break;
                case -1369879259:
                case 1817307377:
                    C3663.m11161(C2105.m6981(strM10633) ^ 2125272648);
                    break;
                case -1290442625:
                case 1534950032:
                    sArr4 = f16449;
                    i10 = 20;
                    i11 = 3;
                    if (C2272.m7503()) {
                        iM2566 = C2105.m6981("ۤ۠") ^ i6;
                        i = ((iM2566 ^ i5) * (-3829)) ^ (-1025926271);
                        i3 = 715778080;
                    } else {
                        iM2566 = (C2105.m6981("ܰܺ") + i5) * (-77);
                        i = ((iM2566 ^ i6) * (-941)) ^ 1757907252;
                        i3 = -2036901134;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -1247986079:
                case 1613120109:
                    i15 = i15;
                    s2 = sArr[c];
                    s = 6355;
                    if (RunnableC0588.f2309 < 0) {
                        iM6981 = C0630.m2566("ܽܺ") ^ i5;
                        i = ((iM6981 ^ i6) * (-14915)) ^ 1052317127;
                        i2 = -808613561;
                        int i19 = iM6981 ^ i2;
                        i15 = i15;
                        i8 = i19;
                        i7 = i;
                    }
                    i15 = i15;
                    iM2566 = C2105.m6981("ۤ۠") ^ i6;
                    i = ((iM2566 ^ i5) * (-3829)) ^ (-1025926271);
                    i3 = 715778080;
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -1120746352:
                case -883394800:
                    sharedPreferences = ApplicationC20075.f65010;
                    sArr2 = f16449;
                    i15 = 1;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ۤ۠") ^ i6;
                        i = ((iM2566 ^ i5) * (-3829)) ^ (-1025926271);
                        i3 = 715778080;
                    } else {
                        iM2566 = C0630.m2566("ۡܶ") ^ i5;
                        i = ((iM2566 ^ i6) * (-20845)) ^ 1239099336;
                        i3 = -836055590;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -1013327412:
                case -121803319:
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = C2105.m6981("ۡۖ") ^ i6;
                        i = ((iM2566 ^ i5) * 9271) ^ 706034142;
                        i3 = 1331553974;
                    } else {
                        iM2566 = C2105.m6981("ۤ۠") ^ i6;
                        i = ((iM2566 ^ i5) * (-3829)) ^ (-1025926271);
                        i3 = 715778080;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -903171557:
                case -500976543:
                    strM7036 = C2126.m7036(sArr3, 9, 11, i12);
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("ۡۖ") ^ i6;
                        i = ((iM2566 ^ i5) * 9271) ^ 706034142;
                        i3 = 1331553974;
                    } else {
                        iM2566 = C0630.m2566("ܶۧ") ^ i6;
                        i = ((iM2566 ^ i5) * 20667) ^ 1665381539;
                        i3 = 1990313395;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -876285068:
                case 569365974:
                    i12 = 43993;
                    iM6981 = C0630.m2566("ۨ᩵") ^ i6;
                    i = ((iM6981 ^ i5) * 19303) ^ 775899453;
                    i2 = -1068418214;
                    int i110 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i110;
                    i7 = i;
                    break;
                case -618681098:
                case 1227435129:
                    editorPutString = ApplicationC20075.f65010.edit().putString(strM9031, strM38319);
                    if (AbstractC2021.m6574()) {
                        iM2566 = C0630.m2566("ܺۖ") ^ i5;
                        i = ((iM2566 ^ i6) * (-3571)) ^ (-1816349478);
                        i3 = 1921755713;
                    } else {
                        iM2566 = (C2105.m6981("᩶ᩴ") + i6) * (-53);
                        i = ((iM2566 ^ i5) * (-27379)) ^ 602530759;
                        i3 = 1655368300;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case -381295241:
                case -53301415:
                    int i20 = i15;
                    strM9031 = C2958.m9031(sArr2, i20, i9, i12);
                    sArr3 = f16449;
                    if (C2958.f9394 < 0) {
                        i15 = i20;
                        iM6981 = (i6 - C0630.m2566("᩶ܿ")) * 127;
                        i = ((iM6981 ^ i5) * (-30711)) ^ (-1042740041);
                        i2 = -177971242;
                        int i111 = iM6981 ^ i2;
                        i15 = i15;
                        i8 = i111;
                        i7 = i;
                    } else {
                        iM2567 = C2105.m6981("ۘۤ") ^ i6;
                        i15 = i20;
                        i7 = ((iM2567 ^ i5) * 16277) ^ 612905918;
                        i4 = 349005369;
                        int i112 = iM2567 ^ i4;
                        i15 = i15;
                        i8 = i112;
                    }
                    break;
                case -330085945:
                case 38696956:
                    i15 = i15;
                    i9 = 8;
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩺֨") ^ i5;
                        i = ((iM6981 ^ i6) * (-5447)) ^ 556515055;
                        i2 = -624488497;
                    } else {
                        iM6981 = C0630.m2566("ۘܰ") ^ i5;
                        i = ((iM6981 ^ i6) * (-16507)) ^ (-1453693934);
                        i2 = -559207319;
                    }
                    int i113 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i113;
                    i7 = i;
                    break;
                case -306956622:
                case 1150048784:
                    i15 = i15;
                    int i21 = s2 + s;
                    i13 = i21 * i21;
                    s3 = 25420;
                    if (C7106.m19120() <= 0) {
                        iM6981 = C2105.m6981("᩺֨") ^ i5;
                        i = ((iM6981 ^ i6) * (-5447)) ^ 556515055;
                        i2 = -624488497;
                    } else {
                        iM6981 = (i6 - C2105.m6981("ۜۘ")) * (-125);
                        i = ((iM6981 ^ i5) * (-24809)) ^ (-132210211);
                        i2 = 1292781800;
                    }
                    int i114 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i114;
                    i7 = i;
                    break;
                case -13774642:
                case 665611588:
                    strM10633 = RunnableC3474.m10633(sArr4, i10, i11, i12);
                    if (C4616.f14690 > 0) {
                        iM2566 = (i5 - C2105.m6981("᩹᩷")) * 33;
                        i = ((iM2566 ^ i6) * (-4683)) ^ 1459319418;
                        i3 = -546406481;
                        i8 = iM2566 ^ i3;
                        i7 = i;
                    }
                    i15 = i15;
                    iM6981 = C2105.m6981("᩺֨") ^ i5;
                    i = ((iM6981 ^ i6) * (-5447)) ^ 556515055;
                    i2 = -624488497;
                    int i115 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i115;
                    i7 = i;
                    break;
                case 66183917:
                case 718818216:
                    i15 = i15;
                    if (i13 - (s2 * s3) < 0) {
                        iM6981 = C2105.m6981("۟ᩴ") ^ i5;
                        i = ((iM6981 ^ i6) * (-4807)) ^ (-1226218818);
                        i2 = 640241213;
                    } else {
                        iM6981 = C2105.m6981("ۙܰ") ^ i5;
                        i = ((iM6981 ^ i6) * (-24417)) ^ 1246689055;
                        i2 = 60184265;
                    }
                    int i116 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i116;
                    i7 = i;
                    break;
                case 72415520:
                case 374423495:
                    i12 = 39893;
                    iM6981 = C0630.m2566("ۨ᩵") ^ i6;
                    i = ((iM6981 ^ i5) * 19303) ^ 775899453;
                    i2 = -1068418214;
                    int i117 = iM6981 ^ i2;
                    i15 = i15;
                    i8 = i117;
                    i7 = i;
                    break;
                case 178469506:
                case 1704429580:
                    if (ViewOnClickListenerC1958.m6437(strM3506, C1005.m3506(ApplicationC20075.f65010, strM9031, strM7036))) {
                        iM2566 = (i5 - C0630.m2566("ۨۘ")) * 49;
                        i = ((iM2566 ^ i6) * (-12851)) ^ (-553296261);
                        i3 = -802779775;
                    } else {
                        iM2566 = C2105.m6981("۠֫") ^ i5;
                        i = ((iM2566 ^ i6) * (-107)) ^ 217693910;
                        i3 = 2017068551;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case 300284875:
                case 1883011410:
                    editorPutString.apply();
                    C16293.m38328(strM38319);
                    iM2566 = C2105.m6981("۠֫") ^ i5;
                    i = ((iM2566 ^ i6) * (-107)) ^ 217693910;
                    i3 = 2017068551;
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case 748157895:
                case 1358042357:
                    C2126.m7040();
                    break;
                case 1014448915:
                case 2033307976:
                    i15 = i15;
                    sArr = f16449;
                    c = 0;
                    if (C7106.m19120() > 0) {
                        iM6981 = C2105.m6981("ᩴ᩶") ^ i6;
                        i = ((iM6981 ^ i5) * (-6365)) ^ 228824654;
                        i2 = -1274074157;
                        int i118 = iM6981 ^ i2;
                        i15 = i15;
                        i8 = i118;
                        i7 = i;
                    }
                    i15 = i15;
                    iM2566 = C2105.m6981("ۤ۠") ^ i6;
                    i = ((iM2566 ^ i5) * (-3829)) ^ (-1025926271);
                    i3 = 715778080;
                    i8 = iM2566 ^ i3;
                    i7 = i;
                    break;
                case 1514374308:
                case 1572076793:
                    break;
                default:
                    C3663.m11168();
                    break;
            }
            return;
        }
    }
}
