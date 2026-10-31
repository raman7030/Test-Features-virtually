package l;

import com.alipay.sdk.app.PayTask;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8359 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܺܰ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f25656 = {9156, -24803, -28718, 27950, 29656, -2045, -2041, -2041, -2041, -2046, -2041, -2041, -2041, -2047, -2041, -2041, -2042, -2047, -2041, -2041, -2043, -2047, -2041, -2041, -2045, -2033, -2041, -2041, -2041, -2034, -2041, -2041, -2041, -25320, -18705, -24314, 29970, 27130, -24262, 29632, -27531, -25320, -18705, 28828, -21535, -27201, -30874, -30997, 30697, -25710, -22067, 27950, -25320, -18705, -31004, -24661, -24803, -28718, -25320, -18705, -26073, -21848, 1176, -18678, -18661, -18685, -18637, -18668, -18660, -18667, -18680, -18657, -18679, -18673, -18666, -18674, -18647, -18674, -18661, -18674, -18673, -18679};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25657;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public RunnableC1303 f25658;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25659;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f25660;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f25661;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25662;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f25663;

    public C8359(AbstractActivityC3346 abstractActivityC3346, String str, long j, int i, String str2) {
        int i2 = -1846839186;
        int i3 = C4263.f13799;
        int i4 = C0422.f1886;
        this.f25660 = abstractActivityC3346;
        this.f25662 = str;
        this.f25663 = j;
        this.f25657 = i;
        this.f25659 = str2;
        int iM6981 = (C2105.m6981("ۛۘ") + i4) * 23;
        int i5 = ((iM6981 ^ i3) * 16399) ^ 173332521;
        int i6 = 1880847384;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-27547)) >> 31));
            switch (i2) {
                case -1896645222:
                case 46957086:
                    C7106.m19120();
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i5 = ((iM6981 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    } else {
                        iM6981 = C2105.m6981("ۤۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    }
                    break;
                case -1384849345:
                case 2128440412:
                    C0237.m1481();
                    if (C0422.f1886 > 0) {
                        iM6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i5 = ((iM6981 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    } else {
                        iM6981 = C0630.m2566("᩸ᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 8521) ^ 1948387897;
                        i6 = 438603747;
                    }
                    break;
                case 451430377:
                case 527768095:
                    if (C0964.f3626 == 0) {
                        iM6981 = C2105.m6981("ۤۗ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-22421)) ^ (-362824214);
                        i6 = 2034855688;
                    }
                    break;
                case 510600028:
                case 872057751:
                    return;
                case 1230045992:
                case 1637966477:
                    C3683.m11222();
                    C0798.m2998();
                    iM6981 = C2105.m6981("ۤۗ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-8457)) ^ (-2140690281);
                    i6 = -1826719233;
                    break;
                case 1294847594:
                case 1970025477:
                    if (C0630.f2410 <= 0) {
                        iM6981 = C2105.m6981("۬ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 10037) ^ (-384913691);
                        i6 = 1250014323;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ᩳۘ")) * (-99);
                        i5 = ((iM6981 ^ i3) * 19227) ^ (-1404203065);
                        i6 = 1841191771;
                    }
                    break;
                default:
                    C1504.m5179();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f25660);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x089e A[PHI: r3 r4 r5 r14 r16 r17 r18 r19 r20 r21 r22 r26 r27 r28 r29 r30 r31 r32 r33 r37
      0x089e: PHI (r3v10 int) = (r3v8 int), (r3v9 int), (r3v11 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r4v18 int) = (r4v16 int), (r4v17 int), (r4v19 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r5v13 int) = (r5v11 int), (r5v12 int), (r5v14 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r14v9 int) = (r14v7 int), (r14v8 int), (r14v10 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v4 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v4 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r22v3 int) = (r22v2 int), (r22v2 int), (r22v4 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r26v5 int) = (r26v3 int), (r26v4 int), (r26v6 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r27v5 int) = (r27v3 int), (r27v4 int), (r27v6 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r28v5 short[]) = (r28v3 short[]), (r28v4 short[]), (r28v6 short[]) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r29v10 int) = (r29v8 int), (r29v9 int), (r29v11 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r30v10 int) = (r30v8 int), (r30v9 int), (r30v11 int) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r31v7 short[]) = (r31v5 short[]), (r31v6 short[]), (r31v8 short[]) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r32v10 l.֨ᩴۡ) = (r32v8 l.֨ᩴۡ), (r32v9 l.֨ᩴۡ), (r32v11 l.֨ᩴۡ) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r33v10 short[]) = (r33v8 short[]), (r33v9 short[]), (r33v11 short[]) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]
      0x089e: PHI (r37v9 l.֨ᩴۡ) = (r37v7 l.֨ᩴۡ), (r37v8 l.֨ᩴۡ), (r37v10 l.֨ᩴۡ) binds: [B:150:0x089c, B:146:0x0860, B:142:0x0824] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ab A[PHI: r10 r11 r13
      0x01ab: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:196:0x01ab, B:46:0x01a9, B:217:0x01ab, B:26:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:196:0x01ab, B:46:0x01a9, B:217:0x01ab, B:26:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:196:0x01ab, B:46:0x01a9, B:217:0x01ab, B:26:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01fb A[PHI: r3 r4
      0x01fb: PHI (r3v62 l.֨ᩴۡ) = (r3v61 l.֨ᩴۡ), (r3v2 l.֨ᩴۡ), (r3v2 l.֨ᩴۡ) binds: [B:50:0x01e2, B:43:0x018a, B:41:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r4v85 l.֨ᩴۡ) = (r4v2 l.֨ᩴۡ), (r4v84 l.֨ᩴۡ), (r4v2 l.֨ᩴۡ) binds: [B:50:0x01e2, B:43:0x018a, B:41:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x05ac. Please report as an issue. */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        RunnableC1303 runnableC1303;
        short[] sArr;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr2;
        RunnableC1303 runnableC1304;
        int i5;
        int iM6981;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        short[] sArr3;
        int iM2566;
        int i11;
        int i12;
        RunnableC1303 runnableC1305;
        int i13;
        int i14;
        int i15;
        int i16;
        short[] sArr4;
        int i17;
        short[] sArr5;
        RunnableC1303 runnableC1306;
        short[] sArr6;
        int i18;
        RunnableC1303 runnableC1307;
        RunnableC1303 runnableC1308;
        short[] sArr7;
        int iM2567;
        int i19;
        int i20;
        int iM2568;
        int i21;
        int i22;
        int iM2569;
        int i23;
        int i24;
        C8359 c8359 = this;
        int i25 = C0630.f2410;
        int i26 = C3245.f10203;
        int iM25610 = (C0630.m2566("᩷ۖ") + i26) * (-39);
        int i27 = ((iM25610 ^ i25) * (-25815)) ^ 509679170;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        int i28 = iM25610 ^ 1868409831;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 2030749391;
        int i47 = 0;
        RunnableC1303 runnableC1309 = null;
        RunnableC1303 runnableC13010 = null;
        String str2 = null;
        while (true) {
            i46 = i28 ^ (i27 & (((i46 ^ i25) * 15845) >> 31));
            switch (i46) {
                case -2143600024:
                case 1026864451:
                    RunnableC0588.m2440(C2105.m6988(sArr9, i39, i40, i34));
                    break;
                case -2117829141:
                case -772772277:
                    C0964.m3413();
                    if (C2958.f9394 < 0) {
                        runnableC1307 = runnableC13010;
                        sArr7 = sArr12;
                        runnableC1308 = runnableC1309;
                        iM2567 = C2105.m6981("ۤۨ") ^ i25;
                        i19 = ((iM2567 ^ i26) * 16709) ^ (-417657814);
                        i20 = 234036754;
                        RunnableC1303 runnableC13011 = runnableC1308;
                        sArr12 = sArr7;
                        i27 = i19;
                        runnableC1309 = runnableC13011;
                        RunnableC1303 runnableC13012 = runnableC1307;
                        i28 = iM2567 ^ i20;
                        runnableC13010 = runnableC13012;
                    } else {
                        iM2569 = C2105.m6981("ܶۙ") ^ i26;
                        i23 = ((iM2569 ^ i25) * (-21777)) ^ (-1993792575);
                        i24 = -386040392;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -2047758088:
                case -950163286:
                    runnableC13010.run();
                    C8058 c8058 = C8058.f24861;
                    iM2569 = C0630.m2566("ܳۚ") ^ i26;
                    i23 = ((iM2569 ^ i25) * (-11347)) ^ 280902281;
                    i24 = -1933570164;
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case -2017675693:
                case -751875143:
                    C3683.m11220(C4263.m12817(f25656, 41, 5, i34));
                    break;
                case -1990167738:
                case 780839759:
                    i5 = i43;
                    i34 = 1621;
                    iM6981 = C2105.m6981("ܿۜ") ^ i26;
                    i27 = ((iM6981 ^ i25) * (-16323)) ^ (-1354841302);
                    i6 = -977382520;
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i48 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i48;
                    break;
                case -1960211396:
                case 1414201279:
                    runnableC1307 = runnableC13010;
                    runnableC1308 = runnableC1309;
                    sArr7 = f25656;
                    i45 = 13;
                    i47 = 4;
                    if (C21923.f70183 != 0) {
                        iM2567 = C2105.m6981("ۤۨ") ^ i25;
                        i19 = ((iM2567 ^ i26) * 16709) ^ (-417657814);
                        i20 = 234036754;
                    } else {
                        iM2567 = (i25 - C0630.m2566("ۛ᩷")) * 5;
                        i19 = ((iM2567 ^ i26) * 25711) ^ (-1239311541);
                        i20 = -471206006;
                    }
                    RunnableC1303 runnableC13013 = runnableC1308;
                    sArr12 = sArr7;
                    i27 = i19;
                    runnableC1309 = runnableC13013;
                    RunnableC1303 runnableC13014 = runnableC1307;
                    i28 = iM2567 ^ i20;
                    runnableC13010 = runnableC13014;
                    break;
                case -1936130299:
                case -422380534:
                    C3683.m11220(C1047.m3603(f25656, 37, 4, i34));
                    break;
                case -1866168444:
                case 531534383:
                    runnableC1305 = runnableC13010;
                    i13 = i43;
                    i14 = i44;
                    i15 = i47;
                    i16 = i29;
                    sArr4 = sArr11;
                    i17 = i45;
                    sArr5 = sArr12;
                    runnableC1306 = runnableC1309;
                    sArr6 = f25656;
                    i18 = 5;
                    i42 = 4;
                    if (C1504.f5354) {
                        int iM6982 = (i26 - C2105.m6981("۬᩷")) * 27;
                        i47 = i15;
                        int i49 = i14;
                        sArr10 = sArr6;
                        i27 = ((iM6982 ^ i25) * (-1355)) ^ (-801112673);
                        i29 = i16;
                        i43 = i13;
                        i41 = i18;
                        runnableC13010 = runnableC1305;
                        i28 = iM6982 ^ 1625573455;
                        runnableC1309 = runnableC1306;
                        sArr12 = sArr5;
                        i45 = i17;
                        sArr11 = sArr4;
                        i44 = i49;
                    } else {
                        int iM25611 = (i26 - C0630.m2566("ᩴ᩸")) * (-39);
                        int i50 = ((iM25611 ^ i25) * (-8613)) ^ 784365518;
                        i47 = i15;
                        runnableC13010 = runnableC1305;
                        i28 = iM25611 ^ 1902712676;
                        runnableC1309 = runnableC1306;
                        sArr12 = sArr5;
                        i45 = i17;
                        sArr11 = sArr4;
                        i44 = i14;
                        sArr10 = sArr6;
                        i27 = i50;
                        i29 = i16;
                        i43 = i13;
                        i41 = 5;
                    }
                    break;
                case -1847357478:
                case -1268211379:
                    sArr15 = f25656;
                    i33 = 58;
                    i35 = 4;
                    if (RunnableC1108.f4040) {
                        iM2569 = (i26 - C0630.m2566("֫᩺")) * 115;
                        i23 = ((iM2569 ^ i25) * (-23463)) ^ (-1677945077);
                        i24 = -276964772;
                    } else {
                        iM2569 = (C2105.m6981("ۨ֨") ^ i26) * 9;
                        i23 = ((iM2569 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                    }
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case -1836185848:
                case 1141822916:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    i39 = i39;
                    int i51 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i51;
                    s = sArr8[c];
                    s2 = 12880;
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM6981 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM6981 = C2105.m6981("ۛܽ") ^ i25;
                        i27 = ((iM6981 ^ i26) * 24061) ^ (-358359844);
                        i6 = -440742225;
                    }
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i410 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i410;
                    break;
                case -1822803513:
                case 692232729:
                    RunnableC0588.m2440(C11340.m28025(sArr15, i33, i35, i34));
                    runnableC1309 = c8359.f25658;
                    if (runnableC1309 != null) {
                        iM2569 = C0630.m2566("ۗ۬") ^ i25;
                        i23 = ((iM2569 ^ i26) * (-26135)) ^ (-608820607);
                        i24 = 911736399;
                    } else {
                        iM2569 = C0630.m2566("ܳۚ") ^ i26;
                        i23 = ((iM2569 ^ i25) * (-11347)) ^ 280902281;
                        i24 = -1933570164;
                    }
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case -1793508976:
                case -1298476535:
                    runnableC13010 = runnableC13010;
                    short[] sArr16 = sArr11;
                    int i52 = i44;
                    i45 = i45;
                    i9 = i47;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    int i53 = i43;
                    i29 = i29;
                    if (C1294.m4369(str2, C2272.m7507(sArr16, i53, i52, i34))) {
                        int iM25612 = (C0630.m2566("ۛᩴ") + i26) * 75;
                        i27 = ((iM25612 ^ i25) * (-12025)) ^ (-1295914188);
                        i47 = i9;
                        i44 = i52;
                        runnableC13010 = runnableC13010;
                        i28 = iM25612 ^ (-1790306706);
                        i29 = i29;
                        i43 = i53;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr16;
                    } else {
                        sArr11 = sArr16;
                        str = str2;
                        i8 = i40;
                        i41 = i41;
                        i5 = i53;
                        i10 = i39;
                        short[] sArr17 = sArr10;
                        i44 = i52;
                        i42 = i42;
                        sArr10 = sArr17;
                        int iM6983 = C2105.m6981("֫᩵") ^ i25;
                        String str3 = str;
                        i27 = ((iM6983 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM6983 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str3;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i411 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i411;
                    }
                    break;
                case -1761128787:
                case 1070069322:
                    C1711.m5736();
                    runnableC13010 = runnableC13010;
                    iM2568 = (C2105.m6981("ۨܺ") ^ i26) * (-65);
                    i21 = ((iM2568 ^ i25) * (-2335)) ^ (-8491421);
                    i22 = -1941865046;
                    RunnableC1303 runnableC13015 = runnableC13010;
                    i28 = iM2568 ^ i22;
                    i27 = i21;
                    runnableC13010 = runnableC13015;
                    break;
                case -1656727208:
                case -1318229728:
                    runnableC13010 = runnableC13010;
                    short[] sArr18 = sArr10;
                    i42 = i42;
                    i44 = i44;
                    i9 = i47;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    int i54 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i54;
                    if (!C1294.m4369(str2, C0798.m3005(sArr18, i41, i42, i34))) {
                        sArr10 = sArr18;
                        str = str2;
                        i10 = i39;
                        i8 = i40;
                        int iM6984 = C2105.m6981("֫᩵") ^ i25;
                        String str4 = str;
                        i27 = ((iM6984 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM6984 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str4;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i412 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i412;
                    } else {
                        int iM6985 = (C2105.m6981("ܳܽ") + i25) * 63;
                        i27 = ((iM6985 ^ i26) * 6365) ^ (-328314130);
                        i47 = i9;
                        sArr3 = sArr18;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = iM6985 ^ (-1214464981);
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr3;
                        int i55 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i55;
                    }
                    break;
                case -1615947485:
                case -1506578601:
                    sArr14 = f25656;
                    i31 = 52;
                    i32 = 6;
                    if (C3537.f11231 < 0) {
                        iM2569 = C0630.m2566("ܿ֨") ^ i26;
                        i23 = ((iM2569 ^ i25) * (-16805)) ^ 769571387;
                        i24 = 1772364169;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC13010 = runnableC13010;
                        iM2568 = (C2105.m6981("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM2568 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC1303 runnableC13016 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC13016;
                    }
                    break;
                case -1553854572:
                case 375591409:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    int i56 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i56;
                    switch (C0630.m2566(str2)) {
                        case 1596796:
                            iM2566 = C0630.m2566("ۗۚ") ^ i26;
                            i11 = ((iM2566 ^ i25) * (-16381)) ^ (-2122113844);
                            i12 = 1037504676;
                            int i57 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC13017 = runnableC13010;
                            i28 = i57;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC13017;
                            int i58 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i58;
                            break;
                        case 1626587:
                            iM2566 = (C0630.m2566("ۛܰ") ^ i25) * 69;
                            i11 = ((iM2566 ^ i26) * 24231) ^ (-1401345967);
                            i12 = -1100133802;
                            int i59 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC13018 = runnableC13010;
                            i28 = i59;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC13018;
                            int i510 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i510;
                            break;
                        case 1656379:
                            iM2566 = (C0630.m2566("ۧᩴ") + i26) * 81;
                            i11 = ((iM2566 ^ i25) * 12379) ^ 2115099634;
                            i12 = 1670940505;
                            int i511 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC13019 = runnableC13010;
                            i28 = i511;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC13019;
                            int i512 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i512;
                            break;
                        case 1656380:
                            iM2566 = (C0630.m2566("ۖ֡") ^ i26) * 17;
                            i11 = ((iM2566 ^ i25) * (-29531)) ^ (-1979674184);
                            i12 = 2093026661;
                            int i513 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC130110 = runnableC13010;
                            i28 = i513;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC130110;
                            int i514 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i514;
                            break;
                        case 1656382:
                            iM2566 = (i26 - C0630.m2566("᩵ۨ")) * 83;
                            i11 = ((iM2566 ^ i25) * 22871) ^ (-1661413591);
                            i12 = 570479596;
                            int i515 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC130111 = runnableC13010;
                            i28 = i515;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC130111;
                            int i516 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i516;
                            break;
                        case 1715960:
                            iM2566 = (i25 - C2105.m6981("ᩳۢ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i11 = ((iM2566 ^ i26) * (-13855)) ^ (-1878123372);
                            i12 = 715924861;
                            int i517 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC130112 = runnableC13010;
                            i28 = i517;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC130112;
                            int i518 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i518;
                            break;
                        case 1745751:
                            iM2566 = C0630.m2566("۠֨") ^ i26;
                            i11 = ((iM2566 ^ i25) * 21633) ^ 323032449;
                            i12 = -1017407098;
                            int i519 = iM2566 ^ i12;
                            i47 = i9;
                            RunnableC1303 runnableC130113 = runnableC13010;
                            i28 = i519;
                            i27 = i11;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC130113;
                            int i5110 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i5110;
                            break;
                        default:
                            str = str2;
                            i10 = i39;
                            i8 = i40;
                            int iM6986 = C2105.m6981("֫᩵") ^ i25;
                            String str5 = str;
                            i27 = ((iM6986 ^ i26) * (-13723)) ^ 1019745615;
                            i7 = iM6986 ^ 1208617128;
                            i40 = i8;
                            i47 = i9;
                            str2 = str5;
                            i39 = i10;
                            runnableC1309 = runnableC1309;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC13010 = runnableC13010;
                            i28 = i7;
                            c8359 = this;
                            int i413 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i413;
                            break;
                    }
                    break;
                case -1523037319:
                case -820834519:
                    runnableC1303 = runnableC13010;
                    i4 = i29;
                    i2 = i45;
                    i3 = i47;
                    sArr2 = sArr12;
                    runnableC1304 = runnableC1309;
                    sArr = f25656;
                    i = 9;
                    i44 = 4;
                    if (C1773.f6144 <= 0) {
                        int iM25613 = (C0630.m2566("ۢᩳ") ^ i26) * 27;
                        i47 = i3;
                        int i60 = i2;
                        sArr11 = sArr;
                        i27 = ((iM25613 ^ i25) * 24315) ^ (-632684615);
                        i29 = i4;
                        i43 = i;
                        runnableC13010 = runnableC1303;
                        i28 = iM25613 ^ 1634017602;
                        runnableC1309 = runnableC1304;
                        sArr12 = sArr2;
                        i45 = i60;
                    } else {
                        int iM25614 = (C0630.m2566("᩻֨") + i25) * (-45);
                        int i61 = ((iM25614 ^ i26) * (-21993)) ^ (-1552180466);
                        i47 = i3;
                        runnableC13010 = runnableC1303;
                        i28 = iM25614 ^ (-1689412487);
                        runnableC1309 = runnableC1304;
                        sArr12 = sArr2;
                        i45 = i2;
                        sArr11 = sArr;
                        i27 = i61;
                        i29 = i4;
                        i43 = 9;
                    }
                    break;
                case -1442894698:
                case 198277929:
                    runnableC13010 = runnableC13010;
                    if (!ViewOnClickListenerC1958.m6437(str2, C3663.m11162(sArr13, i29, i30, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        i10 = i39;
                        int i62 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i62;
                        int iM6987 = C2105.m6981("֫᩵") ^ i25;
                        String str6 = str;
                        i27 = ((iM6987 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM6987 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str6;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i414 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i414;
                    } else {
                        iM2568 = C0630.m2566("ۚܰ") ^ i26;
                        i21 = ((iM2568 ^ i25) * 11833) ^ 702248852;
                        i22 = 1163904238;
                        RunnableC1303 runnableC130114 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC130114;
                    }
                    break;
                case -1285271060:
                case 588799119:
                    C0714.m2805();
                    break;
                case -1089799637:
                case -569686069:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    i39 = i39;
                    int i63 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i63;
                    i36 = s * s2;
                    i37 = s * s;
                    i38 = 41473600;
                    if (C2958.m9034() <= 0) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM6981 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM6981 = C2105.m6981("ܽ۟") ^ i26;
                        i27 = ((iM6981 ^ i25) * (-8439)) ^ 1440136449;
                        i6 = 477432616;
                    }
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i415 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i415;
                    break;
                case -1034506624:
                case 1600050370:
                    if (C4616.m13552() == 0) {
                        runnableC13010 = runnableC13010;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        int i64 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i64;
                        iM2566 = (C2105.m6981("ۨܰ") + i25) * (-23);
                        i11 = ((iM2566 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                        int i5111 = iM2566 ^ i12;
                        i47 = i9;
                        RunnableC1303 runnableC130115 = runnableC13010;
                        i28 = i5111;
                        i27 = i11;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC130115;
                        int i5112 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i5112;
                    } else {
                        iM2569 = (i25 - C0630.m2566("ۜۚ")) * 59;
                        i23 = ((iM2569 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -1015928124:
                case 70598750:
                    C1916.m6308();
                    if (!RunnableC1108.f4040) {
                        runnableC1305 = runnableC13010;
                        sArr6 = sArr10;
                        i18 = i41;
                        i13 = i43;
                        i14 = i44;
                        i15 = i47;
                        i16 = i29;
                        sArr4 = sArr11;
                        i17 = i45;
                        sArr5 = sArr12;
                        runnableC1306 = runnableC1309;
                        int iM6988 = (i26 - C2105.m6981("۬᩷")) * 27;
                        i47 = i15;
                        int i416 = i14;
                        sArr10 = sArr6;
                        i27 = ((iM6988 ^ i25) * (-1355)) ^ (-801112673);
                        i29 = i16;
                        i43 = i13;
                        i41 = i18;
                        runnableC13010 = runnableC1305;
                        i28 = iM6988 ^ 1625573455;
                        runnableC1309 = runnableC1306;
                        sArr12 = sArr5;
                        i45 = i17;
                        sArr11 = sArr4;
                        i44 = i416;
                    } else {
                        runnableC13010 = runnableC13010;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        int i65 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i65;
                        iM2566 = (C2105.m6981("ۨܰ") + i25) * (-23);
                        i11 = ((iM2566 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                        int i5113 = iM2566 ^ i12;
                        i47 = i9;
                        RunnableC1303 runnableC130116 = runnableC13010;
                        i28 = i5113;
                        i27 = i11;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC130116;
                        int i5114 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i5114;
                    }
                    break;
                case -1011662399:
                case 748941919:
                    C3746.m11369();
                    if (C3245.m9925() != 0) {
                        iM2569 = (i25 - C0630.m2566("ۜۚ")) * 59;
                        i23 = ((iM2569 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                    } else {
                        iM2569 = (C0630.m2566("᩷᩷") + i25) * (-67);
                        i23 = ((iM2569 ^ i26) * (-18473)) ^ (-1289498320);
                        i24 = -2120116534;
                    }
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case -897268813:
                case 1628366993:
                    if (!C11340.m28031()) {
                        iM2569 = (C2105.m6981("ۨ֨") ^ i26) * 9;
                        i23 = ((iM2569 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC13010 = runnableC13010;
                        iM2568 = (C2105.m6981("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM2568 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC1303 runnableC130117 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC130117;
                    }
                    break;
                case -868857664:
                case 1729747297:
                    runnableC13010 = runnableC13010;
                    if (!ViewOnClickListenerC1958.m6437(str2, C2167.m7159(f25656, 25, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        i10 = i39;
                        int i66 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i66;
                        int iM6989 = C2105.m6981("֫᩵") ^ i25;
                        String str7 = str;
                        i27 = ((iM6989 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM6989 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str7;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i417 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i417;
                    } else {
                        iM2568 = C0630.m2566("ۚ᩹") ^ i25;
                        i21 = ((iM2568 ^ i26) * (-30989)) ^ (-1948355657);
                        i22 = -58495282;
                        RunnableC1303 runnableC130118 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC130118;
                    }
                    break;
                case -799528344:
                case -77574885:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    i39 = i39;
                    int i67 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i67;
                    sArr8 = f25656;
                    c = 0;
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C0630.m2566("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM6981 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩺") ^ i26;
                        i27 = ((iM6981 ^ i25) * (-25579)) ^ (-1802393284);
                        i6 = 1719100082;
                    }
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i418 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i418;
                    break;
                case -517858522:
                case 132961857:
                    runnableC13010 = runnableC13010;
                    if (!ViewOnClickListenerC1958.m6437(str2, RunnableC0588.m2436(f25656, 29, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        i10 = i39;
                        int i68 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i68;
                        int iM69810 = C2105.m6981("֫᩵") ^ i25;
                        String str8 = str;
                        i27 = ((iM69810 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM69810 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str8;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i419 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i419;
                    } else {
                        iM2568 = (C2105.m6981("ۙۨ") + i25) * (-51);
                        i21 = ((iM2568 ^ i26) * 10297) ^ (-345516858);
                        i22 = 2138514795;
                        RunnableC1303 runnableC130119 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC130119;
                    }
                    break;
                case -490197623:
                case 212954119:
                    if (C0964.f3626 == 0) {
                        runnableC1303 = runnableC13010;
                        sArr = sArr11;
                        i = i43;
                        i2 = i45;
                        i3 = i47;
                        i4 = i29;
                        sArr2 = sArr12;
                        runnableC1304 = runnableC1309;
                        int iM25615 = (C0630.m2566("ۢᩳ") ^ i26) * 27;
                        i47 = i3;
                        int i69 = i2;
                        sArr11 = sArr;
                        i27 = ((iM25615 ^ i25) * 24315) ^ (-632684615);
                        i29 = i4;
                        i43 = i;
                        runnableC13010 = runnableC1303;
                        i28 = iM25615 ^ 1634017602;
                        runnableC1309 = runnableC1304;
                        sArr12 = sArr2;
                        i45 = i69;
                    } else {
                        iM2569 = (C2105.m6981("ۨ֨") ^ i26) * 9;
                        i23 = ((iM2569 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -429970821:
                case 1638416077:
                    C3683.m11220(C1420.m4902(f25656, 33, 4, i34));
                    break;
                case -406328163:
                case 991579248:
                    runnableC13010 = runnableC13010;
                    i8 = i40;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    i10 = i39;
                    int i70 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i70;
                    str = c8359.f25661;
                    if (str == null) {
                        int iM69811 = C2105.m6981("֫᩵") ^ i25;
                        String str9 = str;
                        i27 = ((iM69811 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM69811 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str9;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i4110 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4110;
                    } else {
                        int iM25616 = (C0630.m2566("۟᩺") + i25) * (-69);
                        i40 = i8;
                        i47 = i9;
                        str2 = str;
                        i27 = ((iM25616 ^ i26) * (-13125)) ^ 422113284;
                        c8359 = this;
                        sArr3 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = iM25616 ^ 762116719;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr3;
                        int i5115 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i5115;
                    }
                    break;
                case 32978599:
                case 879228276:
                    if (!C2126.f7087) {
                        iM2569 = (i25 - C0630.m2566("ۜۚ")) * 59;
                        i23 = ((iM2569 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                        i28 = iM2569 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC13010 = runnableC13010;
                        iM2568 = (C2105.m6981("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM2568 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC1303 runnableC1301110 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC1301110;
                    }
                    break;
                case 49811240:
                case 1464020432:
                    C4117.m12364();
                    if (C0382.f1805) {
                        iM2569 = (C2105.m6981("ۨ֨") ^ i26) * 9;
                        i23 = ((iM2569 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                    } else {
                        iM2569 = C2105.m6981("ܶۙ") ^ i26;
                        i23 = ((iM2569 ^ i25) * (-21777)) ^ (-1993792575);
                        i24 = -386040392;
                    }
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case 158155295:
                case 314191300:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    int i71 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i71;
                    sArr9 = f25656;
                    i39 = 1;
                    i40 = 4;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("ۨܰ") + i25) * (-23);
                        i11 = ((iM2566 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                    } else {
                        iM2566 = (C0630.m2566("ܺܿ") + i26) * 101;
                        i11 = ((iM2566 ^ i25) * 7103) ^ (-675863278);
                        i12 = -1492145662;
                    }
                    int i5116 = iM2566 ^ i12;
                    i47 = i9;
                    RunnableC1303 runnableC1301111 = runnableC13010;
                    i28 = i5116;
                    i27 = i11;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC1301111;
                    int i5117 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i5117;
                    break;
                case 239817059:
                case 1244575237:
                    runnableC13010 = runnableC13010;
                    if (!C1294.m4369(str2, C0422.m1955(f25656, 21, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC1309 = runnableC1309;
                        i10 = i39;
                        int i610 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i610;
                        int iM69812 = C2105.m6981("֫᩵") ^ i25;
                        String str10 = str;
                        i27 = ((iM69812 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM69812 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str10;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i4111 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4111;
                    } else {
                        iM2568 = C0630.m2566("ۚ᩹") ^ i25;
                        i21 = ((iM2568 ^ i26) * (-30989)) ^ (-1948355657);
                        i22 = -58495282;
                        RunnableC1303 runnableC1301112 = runnableC13010;
                        i28 = iM2568 ^ i22;
                        i27 = i21;
                        runnableC13010 = runnableC1301112;
                    }
                    break;
                case 483762439:
                case 919645558:
                    runnableC13010 = runnableC13010;
                    sArr13 = f25656;
                    i29 = 17;
                    i30 = 4;
                    if (C0714.f2697 >= 0) {
                        iM2568 = (C2105.m6981("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM2568 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                    } else {
                        iM2568 = (i25 - C0630.m2566("ܺܽ")) * 25;
                        i21 = ((iM2568 ^ i26) * (-6751)) ^ (-1490967876);
                        i22 = 1926227165;
                    }
                    RunnableC1303 runnableC1301113 = runnableC13010;
                    i28 = iM2568 ^ i22;
                    i27 = i21;
                    runnableC13010 = runnableC1301113;
                    break;
                case 544206543:
                case 1041019906:
                    runnableC13010 = runnableC13010;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC1309 = runnableC1309;
                    i39 = i39;
                    int i72 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i72;
                    if ((i37 + i38) - i36 < 0) {
                        iM6981 = C0630.m2566("ۤᩴ") ^ i25;
                        i27 = ((iM6981 ^ i26) * 32625) ^ (-1931809705);
                        i6 = -741315568;
                    } else {
                        iM6981 = C0630.m2566("֫ۙ") ^ i25;
                        i27 = ((iM6981 ^ i26) * 11431) ^ 1866500684;
                        i6 = 239014811;
                    }
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i4112 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i4112;
                    break;
                case 647624440:
                case 1130604533:
                    runnableC13010 = runnableC13010;
                    short[] sArr19 = sArr12;
                    int i73 = i45;
                    i9 = i47;
                    runnableC1309 = runnableC1309;
                    if (ViewOnClickListenerC1958.m6437(str2, C5695.m16034(sArr19, i73, i9, i34))) {
                        int iM25617 = C0630.m2566("ۨ᩵") ^ i25;
                        i27 = ((iM25617 ^ i26) * 26187) ^ (-1055845589);
                        i47 = i9;
                        i45 = i73;
                        runnableC13010 = runnableC13010;
                        i28 = iM25617 ^ (-586372712);
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr19;
                    } else {
                        sArr12 = sArr19;
                        str = str2;
                        i10 = i39;
                        i8 = i40;
                        short[] sArr20 = sArr11;
                        i45 = i73;
                        i42 = i42;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr20;
                        int i74 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i74;
                        int iM69813 = C2105.m6981("֫᩵") ^ i25;
                        String str11 = str;
                        i27 = ((iM69813 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM69813 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str11;
                        i39 = i10;
                        runnableC1309 = runnableC1309;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC13010 = runnableC13010;
                        i28 = i7;
                        c8359 = this;
                        int i4113 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4113;
                    }
                    break;
                case 1272815528:
                case 1854948366:
                    C3683.m11220(C4159.m12578(sArr14, i31, i32, i34));
                    runnableC13010 = c8359.f25658;
                    if (runnableC13010 != null) {
                        iM2569 = (C2105.m6981("۟ۡ") ^ i25) * (-31);
                        i23 = ((iM2569 ^ i26) * (-1625)) ^ (-651428410);
                        i24 = -1007417202;
                    } else {
                        iM2569 = C0630.m2566("ܳۚ") ^ i26;
                        i23 = ((iM2569 ^ i25) * (-11347)) ^ 280902281;
                        i24 = -1933570164;
                    }
                    i28 = iM2569 ^ i24;
                    i27 = i23;
                    break;
                case 1399862830:
                case 1827130364:
                    runnableC1309.run();
                    C8058 c8059 = C8058.f24861;
                    break;
                case 1418676819:
                case 1822969727:
                    i5 = i43;
                    i34 = 63543;
                    iM6981 = C2105.m6981("ܿۜ") ^ i26;
                    i27 = ((iM6981 ^ i25) * (-16323)) ^ (-1354841302);
                    i6 = -977382520;
                    i7 = iM6981 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC1309 = runnableC1309;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC13010 = runnableC13010;
                    i28 = i7;
                    c8359 = this;
                    int i4114 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i4114;
                    break;
                case 1486845052:
                case 1730561808:
                    C3683.m11220(C4263.m12817(f25656, 46, 6, i34));
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i = -1991169445;
        int i2 = RunnableC0588.f2309;
        int i3 = RunnableC1937.f6483;
        int iM6981 = C2105.m6981("ܳܺ") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-3081)) ^ 1498344230;
        int i5 = 698463640;
        while (true) {
            i = ((((i ^ i3) * (-21921)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1866966203:
                case 1700238594:
                    if (C0237.f1507 != 0) {
                        iM6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((iM6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM6981 = (C2105.m6981("ۗ۬") + i3) * 69;
                        i4 = ((iM6981 ^ i2) * 11459) ^ 199394112;
                        i5 = -250575001;
                    }
                    break;
                case -1757754815:
                case -1235900110:
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM6981 = C2105.m6981("᩸ۚ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30175)) ^ (-1490227576);
                        i5 = -692542627;
                    }
                    break;
                case -1586772320:
                case -1548309188:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM6981 = C2105.m6981("᩺᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * 16737) ^ 1948202452;
                        i5 = -2082566535;
                    }
                    break;
                case -1345470103:
                case 1224262600:
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((iM6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    } else {
                        iM6981 = (C0630.m2566("֫۠") + i3) * 95;
                        i4 = ((iM6981 ^ i2) * 16385) ^ 1393729193;
                        i5 = 1238837480;
                    }
                    break;
                case -1336234928:
                case 1692020088:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM6981 = C0630.m2566("ۛ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15129)) ^ (-1796026382);
                        i5 = -788273577;
                    }
                    break;
                case -613619921:
                case 851005988:
                    C7106.m19120();
                    C0714.m2805();
                    break;
                case -428692797:
                case 441313355:
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۨᩳ")) * (-17);
                        i4 = ((iM6981 ^ i2) * 12131) ^ (-331341926);
                        i5 = 1994993043;
                    }
                    break;
                case -324154898:
                case 1778694409:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((iM6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM6981 = (C2105.m6981("ܽ᩷") ^ i2) * (-105);
                        i4 = ((iM6981 ^ i3) * 28401) ^ 1264774878;
                        i5 = -1117956607;
                    }
                    break;
                case -281575026:
                case 396438059:
                    C1916.m6308();
                    iM6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                    i4 = ((iM6981 ^ i2) * (-12623)) ^ (-1547614383);
                    i5 = 329695217;
                    break;
                case -207656923:
                case 409854314:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((iM6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    }
                    break;
                case 306060819:
                case 1877439842:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM6981 = (C2105.m6981("ܿܽ") ^ i2) * 39;
                        i4 = ((iM6981 ^ i3) * 14859) ^ (-112683444);
                        i5 = -495291530;
                    }
                    break;
                case 673447506:
                case 2077564516:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, exc, null);
                    break;
                case 933042954:
                case 1184027497:
                    C0483.m2121();
                    if (C4263.m12819() < 0) {
                        iM6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((iM6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((iM6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                case 1156888291:
                case 1445169577:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((iM6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((iM6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                case 1196967701:
                case 1826010970:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 16481) ^ 619084345;
                        i5 = -2085278416;
                    } else {
                        iM6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((iM6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                default:
                    abstractActivityC3346 = this.f25660;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ۙۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3099)) ^ 308487217;
                        i5 = -2120825370;
                    } else {
                        iM6981 = (C2105.m6981("֡ۤ") ^ i2) * (-41);
                        i4 = ((iM6981 ^ i3) * (-15079)) ^ 972729464;
                        i5 = 756292400;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011b A[PHI: r7 r9 r11 r15
      0x011b: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:37:0x0119, B:26:0x00c4, B:107:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r9v5 java.util.Map) = (r9v2 java.util.Map), (r9v4 java.util.Map), (r9v2 java.util.Map) binds: [B:37:0x0119, B:26:0x00c4, B:107:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:37:0x0119, B:26:0x00c4, B:107:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:37:0x0119, B:26:0x00c4, B:107:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0218 A[PHI: r2 r3 r6
      0x0218: PHI (r2v23 java.lang.String) = 
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v24 java.lang.String)
     binds: [B:58:0x0201, B:45:0x017a, B:41:0x014f, B:21:0x0097, B:54:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r3v2 long) = (r3v1 long), (r3v1 long), (r3v1 long), (r3v1 long), (r3v4 long) binds: [B:58:0x0201, B:45:0x017a, B:41:0x014f, B:21:0x0097, B:54:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r6v4 org.json.JSONObject) = 
      (r6v2 org.json.JSONObject)
      (r6v3 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
     binds: [B:58:0x0201, B:45:0x017a, B:41:0x014f, B:21:0x0097, B:54:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        int i4;
        int i5 = RunnableC0588.f2309;
        int i6 = C3746.f11829;
        int iM6983 = C2105.m6981("ۡ᩸") ^ i6;
        int i7 = ((iM6983 ^ i5) * (-27709)) ^ (-1428554608);
        Map mapPayV2 = null;
        short[] sArr = null;
        int i8 = iM6983 ^ 785564567;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -324756969;
        int i13 = 0;
        String strM50614 = null;
        String strM6385 = null;
        JSONObject jSONObjectM51353 = null;
        C18237 c18237M3787 = null;
        long j = 0;
        String str = null;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i5) * (-30985)) >> 31));
            switch (i12) {
                case -2078504178:
                case -486073216:
                    C2126.m7040();
                    if (C0237.f1507 != 0) {
                        iM6981 = C2105.m6981("ܺۗ") ^ i6;
                        i = ((iM6981 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM6982 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                        i3 = ((iM6982 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -1815875583:
                case -1058457435:
                    C2126.m7040();
                    str = str;
                    iM6982 = C0630.m2566("ܶᩳ") ^ i5;
                    i3 = ((iM6982 ^ i6) * 27449) ^ (-2035626848);
                    i4 = 1668784938;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1753706607:
                case -164204059:
                    i10 = 46970;
                    iM6982 = (C2105.m6981("᩶᩹") ^ i6) * (-23);
                    i3 = ((iM6982 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1562447858:
                case -605788688:
                    str = str;
                    i11 = s * 2;
                    if (C0630.m2564()) {
                        iM6982 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                        i3 = ((iM6982 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                    } else {
                        iM6982 = C2105.m6981("۬ᩴ") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-17057)) ^ (-1279170112);
                        i4 = 1024769776;
                    }
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1326206165:
                case -1140368398:
                    C21923.m49329();
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C2105.m6981("᩵ۛ") ^ i6) * (-47);
                        i = ((iM6981 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM6982 = C0630.m2566("ܶᩳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -1239577804:
                case -871308521:
                    strM6385 = RunnableC1937.m6385(f25656, 63, 7, i10);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("ܺۗ") ^ i6;
                        i = ((iM6981 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                    } else {
                        iM6981 = (C2105.m6981("֡ۧ") ^ i6) * 5;
                        i = ((iM6981 ^ i5) * (-17957)) ^ (-2074828);
                        i2 = 1430001809;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -933445856:
                case 1740587873:
                    C1773.m5907(c18237M3787, this.f25659);
                    jSONObjectM51353 = C23175.m51353(c18237M3787);
                    if (C11233.m27802((Object) str, (Object) RunnableC3474.m10627())) {
                        iM6981 = C2105.m6981("ۘۚ") ^ i5;
                        i = ((iM6981 ^ i6) * 18937) ^ 1148373164;
                        i2 = 2065325334;
                    } else {
                        iM6981 = C0630.m2566("᩷ۤ") ^ i5;
                        i = ((iM6981 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -865085956:
                case -196869526:
                    String strM10627 = RunnableC3474.m10627();
                    str = this.f25662;
                    if (C11233.m27802((Object) str, (Object) strM10627)) {
                        iM6981 = C2105.m6981("֡ܳ") ^ i6;
                        i = ((iM6981 ^ i5) * (-6451)) ^ (-317927936);
                        i2 = 2127133848;
                    } else {
                        iM6981 = C0630.m2566("᩷ۤ") ^ i5;
                        i = ((iM6981 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -807425557:
                case -733471834:
                    AbstractActivityC3346 abstractActivityC3346 = this.f25660;
                    if (C3537.m10746() > 0) {
                        mapPayV2 = new PayTask(abstractActivityC3346).payV2(strM50614, true);
                        sArr = f25656;
                        i9 = 70;
                        if (C2272.m7503()) {
                            iM6981 = C2105.m6981("ܺۗ") ^ i6;
                            i = ((iM6981 ^ i5) * 20399) ^ (-1372980532);
                            i2 = 260099255;
                        } else {
                            iM6981 = C2105.m6981("ᩴᩴ") ^ i6;
                            i = ((iM6981 ^ i5) * 7515) ^ 1010262433;
                            i2 = -2017226453;
                        }
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM6982 = C2105.m6981("֨۫") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -715067004:
                case 786870723:
                    str = str;
                    int i14 = s + s2;
                    if ((i14 * i14) - i13 < 0) {
                        iM6982 = (i5 - C0630.m2566("֫᩻")) * 11;
                        i3 = ((iM6982 ^ i6) * (-9587)) ^ (-1774653613);
                        i4 = -83441414;
                    } else {
                        iM6982 = C2105.m6981("ۡ᩵") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-2551)) ^ (-1040856422);
                        i4 = 1875730942;
                    }
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -518416562:
                case 1467046433:
                    this.f25661 = (String) mapPayV2.get(C2105.m6988(sArr, i9, 12, i10));
                    iM6981 = C0630.m2566("᩷ۤ") ^ i5;
                    i = ((iM6981 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -488539717:
                case 1606970143:
                    if (j != C22470.f72774) {
                        iM6981 = C0630.m2566("᩷ۤ") ^ i5;
                        i = ((iM6981 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    } else {
                        iM6981 = C2105.m6981("ܳ֫") ^ i5;
                        i = ((iM6981 ^ i6) * (-26673)) ^ 1115150637;
                        i2 = 803639363;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -91445896:
                case 1504471655:
                    C0422.m1963();
                    break;
                case 261657303:
                case 645012555:
                    break;
                case 403734991:
                case 754155351:
                    long j2 = C22470.f72774;
                    str = str;
                    long j3 = this.f25663;
                    if (j3 == j2) {
                        int iM6984 = (C2105.m6981("ܳ۠") ^ i6) * (-73);
                        i8 = iM6984 ^ (-2021816942);
                        i7 = ((iM6984 ^ i5) * 20289) ^ (-219683911);
                        j = j3;
                        str = str;
                    } else {
                        j = j3;
                        str = str;
                        iM6981 = C0630.m2566("᩷ۤ") ^ i5;
                        i = ((iM6981 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case 911655754:
                case 1467869982:
                    strM50614 = C22628.m50614(jSONObjectM51353, strM6385);
                    if (C3432.f10845 < 0) {
                        RunnableC1303 runnableC1303 = new RunnableC1303(jSONObjectM51353, str, j);
                        this.f25658 = runnableC1303;
                        C22470.f72773 = runnableC1303;
                        if (C2958.f9394 < 0) {
                            iM6981 = (C0630.m2566("᩺ܶ") ^ i5) * (-69);
                            i = ((iM6981 ^ i6) * 9045) ^ 1044836825;
                            i2 = -1339245494;
                            i8 = iM6981 ^ i2;
                            i7 = i;
                            break;
                        }
                    }
                    str = str;
                    iM6982 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                    i3 = ((iM6982 ^ i6) * 25053) ^ 1303450701;
                    i4 = 1553316970;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 953403258:
                case 1767465615:
                    if (C2105.f7037 != 0) {
                        str = str;
                        iM6982 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                        i3 = ((iM6982 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    } else {
                        iM6981 = (C2105.m6981("᩵ۛ") ^ i6) * (-47);
                        i = ((iM6981 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case 977865523:
                case 1348439343:
                    c18237M3787.m42483(0);
                    if (C0964.f3626 == 0) {
                        iM6981 = (i6 - C0630.m2566("᩷᩶")) * 65;
                        i = ((iM6981 ^ i5) * (-28079)) ^ 1314705080;
                        i2 = -737622874;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM6982 = C0630.m2566("ܶᩳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case 1208706245:
                case 1435801570:
                    str = str;
                    s = f25656[62];
                    if (RunnableC0588.f2309 >= 0) {
                        iM6982 = C0630.m2566("ܶᩳ") ^ i5;
                        i3 = ((iM6982 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                    } else {
                        iM6982 = C2105.m6981("᩶᩻") ^ i5;
                        i3 = ((iM6982 ^ i6) * (-28917)) ^ (-1904799781);
                        i4 = 1109185690;
                    }
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 1540163357:
                case 1566089891:
                    str = str;
                    i13 = i11 + 1;
                    s2 = 1;
                    if (RunnableC3474.m10630()) {
                        iM6982 = C0630.m2566("ܶܿ") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-15867)) ^ 1349230024;
                        i4 = -1279696984;
                    } else {
                        iM6982 = C2105.m6981("֨۫") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                    }
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 1724744847:
                case 1825196172:
                    i10 = 25241;
                    iM6982 = (C2105.m6981("᩶᩹") ^ i6) * (-23);
                    i3 = ((iM6982 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = iM6982 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                default:
                    c18237M3787 = RunnableC1108.m3787(4370);
                    c18237M3787.m42494(this.f25657);
                    if (C3537.f11231 < 0) {
                        iM6981 = C2105.m6981("ᩳ᩶") ^ i5;
                        i = ((iM6981 ^ i6) * (-6249)) ^ 1101164595;
                        i2 = -1548633345;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM6982 = C2105.m6981("֨۫") ^ i6;
                        i3 = ((iM6982 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = iM6982 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
            }
            return;
        }
    }
}
