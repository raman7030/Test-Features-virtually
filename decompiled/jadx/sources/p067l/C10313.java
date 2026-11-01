package p067l;

import com.alipay.sdk.app.PayTask;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۠ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10313 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܺܰ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f82085 = {9156, -24803, -28718, 27950, 29656, -2045, -2041, -2041, -2041, -2046, -2041, -2041, -2041, -2047, -2041, -2041, -2042, -2047, -2041, -2041, -2043, -2047, -2041, -2041, -2045, -2033, -2041, -2041, -2041, -2034, -2041, -2041, -2041, -25320, -18705, -24314, 29970, 27130, -24262, 29632, -27531, -25320, -18705, 28828, -21535, -27201, -30874, -30997, 30697, -25710, -22067, 27950, -25320, -18705, -31004, -24661, -24803, -28718, -25320, -18705, -26073, -21848, 1176, -18678, -18661, -18685, -18637, -18668, -18660, -18667, -18680, -18657, -18679, -18673, -18666, -18674, -18647, -18674, -18661, -18674, -18673, -18679};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f28570;

    /* JADX INFO: renamed from: ۡ */
    public RunnableC3607 f28571;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f28572;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f28573;

    /* JADX INFO: renamed from: ܺ */
    public String f28574;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f28575;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ long f28576;

    public C10313(AbstractActivityC5549 abstractActivityC5549, String str, long j, int i, String str2) {
        int i2 = -1846839186;
        int i3 = C1053.f81965;
        int i4 = C0863.f81833;
        this.f28573 = abstractActivityC5549;
        this.f28575 = str;
        this.f28576 = j;
        this.f28570 = i;
        this.f28572 = str2;
        int iM55979 = (C0946.m55979("ۛۘ") + i4) * 23;
        int i5 = ((iM55979 ^ i3) * 16399) ^ 173332521;
        int i6 = 1880847384;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * (-27547)) >> 31));
            switch (i2) {
                case -1896645222:
                case 46957086:
                    C1194.m56396();
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("ۤ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    } else {
                        iM55979 = C0946.m55979("ۤۗ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    }
                    break;
                case -1384849345:
                case 2128440412:
                    C0854.m55595();
                    if (C0863.f81833 > 0) {
                        iM55979 = C0946.m55979("ۤ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    } else {
                        iM55979 = C0873.m55680("᩸ᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 8521) ^ 1948387897;
                        i6 = 438603747;
                    }
                    break;
                case 451430377:
                case 527768095:
                    if (C0890.f81849 == 0) {
                        iM55979 = C0946.m55979("ۤۗ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    } else {
                        iM55979 = C0873.m55680("ᩴ᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-22421)) ^ (-362824214);
                        i6 = 2034855688;
                    }
                    break;
                case 510600028:
                case 872057751:
                    return;
                case 1230045992:
                case 1637966477:
                    C1025.m56230();
                    C0882.m55710();
                    iM55979 = C0946.m55979("ۤۗ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-8457)) ^ (-2140690281);
                    i6 = -1826719233;
                    break;
                case 1294847594:
                case 1970025477:
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("۬ᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 10037) ^ (-384913691);
                        i6 = 1250014323;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ᩳۘ")) * (-99);
                        i5 = ((iM55979 ^ i3) * 19227) ^ (-1404203065);
                        i6 = 1841191771;
                    }
                    break;
                default:
                    C0917.m55854();
                    throw new RuntimeException();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C1017.m56184(this, this.f28573);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        RunnableC3607 runnableC3607;
        short[] sArr;
        int i;
        int i2;
        int i3;
        int i4;
        short[] sArr2;
        RunnableC3607 runnableC3608;
        int i5;
        int iM55979;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        short[] sArr3;
        int iM55680;
        int i11;
        int i12;
        RunnableC3607 runnableC3609;
        int i13;
        int i14;
        int i15;
        int i16;
        short[] sArr4;
        int i17;
        short[] sArr5;
        RunnableC3607 runnableC36010;
        short[] sArr6;
        int i18;
        RunnableC3607 runnableC36011;
        RunnableC3607 runnableC36012;
        short[] sArr7;
        int iM55681;
        int i19;
        int i20;
        int iM55682;
        int i21;
        int i22;
        int iM55683;
        int i23;
        int i24;
        C10313 c10313 = this;
        int i25 = C0873.f81841;
        int i26 = C1003.f81929;
        int iM55684 = (C0873.m55680("᩷ۖ") + i26) * (-39);
        int i27 = ((iM55684 ^ i25) * (-25815)) ^ 509679170;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        int i28 = iM55684 ^ 1868409831;
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
        RunnableC3607 runnableC36013 = null;
        RunnableC3607 runnableC36014 = null;
        String str2 = null;
        while (true) {
            i46 = i28 ^ (i27 & (((i46 ^ i25) * 15845) >> 31));
            switch (i46) {
                case -2143600024:
                case 1026864451:
                    RunnableC0871.m55671(C0946.m55986(sArr9, i39, i40, i34));
                    break;
                case -2117829141:
                case -772772277:
                    C0890.m55740();
                    if (C0989.f81920 < 0) {
                        runnableC36011 = runnableC36014;
                        sArr7 = sArr12;
                        runnableC36012 = runnableC36013;
                        iM55681 = C0946.m55979("ۤۨ") ^ i25;
                        i19 = ((iM55681 ^ i26) * 16709) ^ (-417657814);
                        i20 = 234036754;
                        RunnableC3607 runnableC36015 = runnableC36012;
                        sArr12 = sArr7;
                        i27 = i19;
                        runnableC36013 = runnableC36015;
                        RunnableC3607 runnableC36016 = runnableC36011;
                        i28 = iM55681 ^ i20;
                        runnableC36014 = runnableC36016;
                    } else {
                        iM55683 = C0946.m55979("ܶۙ") ^ i26;
                        i23 = ((iM55683 ^ i25) * (-21777)) ^ (-1993792575);
                        i24 = -386040392;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -2047758088:
                case -950163286:
                    runnableC36014.run();
                    C10027 c10027 = C10027.f27775;
                    iM55683 = C0873.m55680("ܳۚ") ^ i26;
                    i23 = ((iM55683 ^ i25) * (-11347)) ^ 280902281;
                    i24 = -1933570164;
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case -2017675693:
                case -751875143:
                    C1025.m56228(C1053.m56325(f82085, 41, 5, i34));
                    break;
                case -1990167738:
                case 780839759:
                    i5 = i43;
                    i34 = 1621;
                    iM55979 = C0946.m55979("ܿۜ") ^ i26;
                    i27 = ((iM55979 ^ i25) * (-16323)) ^ (-1354841302);
                    i6 = -977382520;
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i48 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i48;
                    break;
                case -1960211396:
                case 1414201279:
                    runnableC36011 = runnableC36014;
                    runnableC36012 = runnableC36013;
                    sArr7 = f82085;
                    i45 = 13;
                    i47 = 4;
                    if (C1929.f83011 != 0) {
                        iM55681 = C0946.m55979("ۤۨ") ^ i25;
                        i19 = ((iM55681 ^ i26) * 16709) ^ (-417657814);
                        i20 = 234036754;
                    } else {
                        iM55681 = (i25 - C0873.m55680("ۛ᩷")) * 5;
                        i19 = ((iM55681 ^ i26) * 25711) ^ (-1239311541);
                        i20 = -471206006;
                    }
                    RunnableC3607 runnableC36017 = runnableC36012;
                    sArr12 = sArr7;
                    i27 = i19;
                    runnableC36013 = runnableC36017;
                    RunnableC3607 runnableC36018 = runnableC36011;
                    i28 = iM55681 ^ i20;
                    runnableC36014 = runnableC36018;
                    break;
                case -1936130299:
                case -422380534:
                    C1025.m56228(C0894.m55773(f82085, 37, 4, i34));
                    break;
                case -1866168444:
                case 531534383:
                    runnableC3609 = runnableC36014;
                    i13 = i43;
                    i14 = i44;
                    i15 = i47;
                    i16 = i29;
                    sArr4 = sArr11;
                    i17 = i45;
                    sArr5 = sArr12;
                    runnableC36010 = runnableC36013;
                    sArr6 = f82085;
                    i18 = 5;
                    i42 = 4;
                    if (C0917.f81868) {
                        int iM559710 = (i26 - C0946.m55979("۬᩷")) * 27;
                        i47 = i15;
                        int i49 = i14;
                        sArr10 = sArr6;
                        i27 = ((iM559710 ^ i25) * (-1355)) ^ (-801112673);
                        i29 = i16;
                        i43 = i13;
                        i41 = i18;
                        runnableC36014 = runnableC3609;
                        i28 = iM559710 ^ 1625573455;
                        runnableC36013 = runnableC36010;
                        sArr12 = sArr5;
                        i45 = i17;
                        sArr11 = sArr4;
                        i44 = i49;
                    } else {
                        int iM55685 = (i26 - C0873.m55680("ᩴ᩸")) * (-39);
                        int i50 = ((iM55685 ^ i25) * (-8613)) ^ 784365518;
                        i47 = i15;
                        runnableC36014 = runnableC3609;
                        i28 = iM55685 ^ 1902712676;
                        runnableC36013 = runnableC36010;
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
                    sArr15 = f82085;
                    i33 = 58;
                    i35 = 4;
                    if (RunnableC0897.f81856) {
                        iM55683 = (i26 - C0873.m55680("֫᩺")) * 115;
                        i23 = ((iM55683 ^ i25) * (-23463)) ^ (-1677945077);
                        i24 = -276964772;
                    } else {
                        iM55683 = (C0946.m55979("ۨ֨") ^ i26) * 9;
                        i23 = ((iM55683 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                    }
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case -1836185848:
                case 1141822916:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    i39 = i39;
                    int i51 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i51;
                    s = sArr8[c];
                    s2 = 12880;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM55979 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM55979 = C0946.m55979("ۛܽ") ^ i25;
                        i27 = ((iM55979 ^ i26) * 24061) ^ (-358359844);
                        i6 = -440742225;
                    }
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i410 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i410;
                    break;
                case -1822803513:
                case 692232729:
                    RunnableC0871.m55671(C1404.m56462(sArr15, i33, i35, i34));
                    runnableC36013 = c10313.f28571;
                    if (runnableC36013 != null) {
                        iM55683 = C0873.m55680("ۗ۬") ^ i25;
                        i23 = ((iM55683 ^ i26) * (-26135)) ^ (-608820607);
                        i24 = 911736399;
                    } else {
                        iM55683 = C0873.m55680("ܳۚ") ^ i26;
                        i23 = ((iM55683 ^ i25) * (-11347)) ^ 280902281;
                        i24 = -1933570164;
                    }
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case -1793508976:
                case -1298476535:
                    runnableC36014 = runnableC36014;
                    short[] sArr16 = sArr11;
                    int i52 = i44;
                    i45 = i45;
                    i9 = i47;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    int i53 = i43;
                    i29 = i29;
                    if (C0906.m55806(str2, C0955.m56029(sArr16, i53, i52, i34))) {
                        int iM55686 = (C0873.m55680("ۛᩴ") + i26) * 75;
                        i27 = ((iM55686 ^ i25) * (-12025)) ^ (-1295914188);
                        i47 = i9;
                        i44 = i52;
                        runnableC36014 = runnableC36014;
                        i28 = iM55686 ^ (-1790306706);
                        i29 = i29;
                        i43 = i53;
                        runnableC36013 = runnableC36013;
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
                        int iM559711 = C0946.m55979("֫᩵") ^ i25;
                        String str3 = str;
                        i27 = ((iM559711 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559711 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str3;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i411 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i411;
                    }
                    break;
                case -1761128787:
                case 1070069322:
                    C0927.m55873();
                    runnableC36014 = runnableC36014;
                    iM55682 = (C0946.m55979("ۨܺ") ^ i26) * (-65);
                    i21 = ((iM55682 ^ i25) * (-2335)) ^ (-8491421);
                    i22 = -1941865046;
                    RunnableC3607 runnableC36019 = runnableC36014;
                    i28 = iM55682 ^ i22;
                    i27 = i21;
                    runnableC36014 = runnableC36019;
                    break;
                case -1656727208:
                case -1318229728:
                    runnableC36014 = runnableC36014;
                    short[] sArr18 = sArr10;
                    i42 = i42;
                    i44 = i44;
                    i9 = i47;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    int i54 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i54;
                    if (!C0906.m55806(str2, C0882.m55717(sArr18, i41, i42, i34))) {
                        sArr10 = sArr18;
                        str = str2;
                        i10 = i39;
                        i8 = i40;
                        int iM559712 = C0946.m55979("֫᩵") ^ i25;
                        String str4 = str;
                        i27 = ((iM559712 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559712 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str4;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i412 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i412;
                    } else {
                        int iM559713 = (C0946.m55979("ܳܽ") + i25) * 63;
                        i27 = ((iM559713 ^ i26) * 6365) ^ (-328314130);
                        i47 = i9;
                        sArr3 = sArr18;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = iM559713 ^ (-1214464981);
                        runnableC36013 = runnableC36013;
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
                    sArr14 = f82085;
                    i31 = 52;
                    i32 = 6;
                    if (C1017.f81942 < 0) {
                        iM55683 = C0873.m55680("ܿ֨") ^ i26;
                        i23 = ((iM55683 ^ i25) * (-16805)) ^ 769571387;
                        i24 = 1772364169;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC36014 = runnableC36014;
                        iM55682 = (C0946.m55979("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM55682 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC3607 runnableC360110 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360110;
                    }
                    break;
                case -1553854572:
                case 375591409:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    int i56 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i56;
                    switch (C0873.m55680(str2)) {
                        case 1596796:
                            iM55680 = C0873.m55680("ۗۚ") ^ i26;
                            i11 = ((iM55680 ^ i25) * (-16381)) ^ (-2122113844);
                            i12 = 1037504676;
                            int i57 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36020 = runnableC36014;
                            i28 = i57;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36020;
                            int i58 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i58;
                            break;
                        case 1626587:
                            iM55680 = (C0873.m55680("ۛܰ") ^ i25) * 69;
                            i11 = ((iM55680 ^ i26) * 24231) ^ (-1401345967);
                            i12 = -1100133802;
                            int i59 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36021 = runnableC36014;
                            i28 = i59;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36021;
                            int i510 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i510;
                            break;
                        case 1656379:
                            iM55680 = (C0873.m55680("ۧᩴ") + i26) * 81;
                            i11 = ((iM55680 ^ i25) * 12379) ^ 2115099634;
                            i12 = 1670940505;
                            int i511 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36022 = runnableC36014;
                            i28 = i511;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36022;
                            int i512 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i512;
                            break;
                        case 1656380:
                            iM55680 = (C0873.m55680("ۖ֡") ^ i26) * 17;
                            i11 = ((iM55680 ^ i25) * (-29531)) ^ (-1979674184);
                            i12 = 2093026661;
                            int i513 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36023 = runnableC36014;
                            i28 = i513;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36023;
                            int i514 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i514;
                            break;
                        case 1656382:
                            iM55680 = (i26 - C0873.m55680("᩵ۨ")) * 83;
                            i11 = ((iM55680 ^ i25) * 22871) ^ (-1661413591);
                            i12 = 570479596;
                            int i515 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36024 = runnableC36014;
                            i28 = i515;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36024;
                            int i516 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i516;
                            break;
                        case 1715960:
                            iM55680 = (i25 - C0946.m55979("ᩳۢ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i11 = ((iM55680 ^ i26) * (-13855)) ^ (-1878123372);
                            i12 = 715924861;
                            int i517 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36025 = runnableC36014;
                            i28 = i517;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36025;
                            int i518 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i518;
                            break;
                        case 1745751:
                            iM55680 = C0873.m55680("۠֨") ^ i26;
                            i11 = ((iM55680 ^ i25) * 21633) ^ 323032449;
                            i12 = -1017407098;
                            int i519 = iM55680 ^ i12;
                            i47 = i9;
                            RunnableC3607 runnableC36026 = runnableC36014;
                            i28 = i519;
                            i27 = i11;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36026;
                            int i5110 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i5110;
                            break;
                        default:
                            str = str2;
                            i10 = i39;
                            i8 = i40;
                            int iM559714 = C0946.m55979("֫᩵") ^ i25;
                            String str5 = str;
                            i27 = ((iM559714 ^ i26) * (-13723)) ^ 1019745615;
                            i7 = iM559714 ^ 1208617128;
                            i40 = i8;
                            i47 = i9;
                            str2 = str5;
                            i39 = i10;
                            runnableC36013 = runnableC36013;
                            sArr12 = sArr12;
                            i45 = i45;
                            sArr11 = sArr11;
                            i44 = i44;
                            sArr10 = sArr10;
                            i42 = i42;
                            runnableC36014 = runnableC36014;
                            i28 = i7;
                            c10313 = this;
                            int i413 = i5;
                            i41 = i41;
                            i29 = i29;
                            i43 = i413;
                            break;
                    }
                    break;
                case -1523037319:
                case -820834519:
                    runnableC3607 = runnableC36014;
                    i4 = i29;
                    i2 = i45;
                    i3 = i47;
                    sArr2 = sArr12;
                    runnableC3608 = runnableC36013;
                    sArr = f82085;
                    i = 9;
                    i44 = 4;
                    if (C0930.f81879 <= 0) {
                        int iM55687 = (C0873.m55680("ۢᩳ") ^ i26) * 27;
                        i47 = i3;
                        int i60 = i2;
                        sArr11 = sArr;
                        i27 = ((iM55687 ^ i25) * 24315) ^ (-632684615);
                        i29 = i4;
                        i43 = i;
                        runnableC36014 = runnableC3607;
                        i28 = iM55687 ^ 1634017602;
                        runnableC36013 = runnableC3608;
                        sArr12 = sArr2;
                        i45 = i60;
                    } else {
                        int iM55688 = (C0873.m55680("᩻֨") + i25) * (-45);
                        int i61 = ((iM55688 ^ i26) * (-21993)) ^ (-1552180466);
                        i47 = i3;
                        runnableC36014 = runnableC3607;
                        i28 = iM55688 ^ (-1689412487);
                        runnableC36013 = runnableC3608;
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
                    runnableC36014 = runnableC36014;
                    if (!ViewOnClickListenerC0939.m55949(str2, C1024.m56203(sArr13, i29, i30, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        i10 = i39;
                        int i62 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i62;
                        int iM559715 = C0946.m55979("֫᩵") ^ i25;
                        String str6 = str;
                        i27 = ((iM559715 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559715 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str6;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i414 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i414;
                    } else {
                        iM55682 = C0873.m55680("ۚܰ") ^ i26;
                        i21 = ((iM55682 ^ i25) * 11833) ^ 702248852;
                        i22 = 1163904238;
                        RunnableC3607 runnableC360111 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360111;
                    }
                    break;
                case -1285271060:
                case 588799119:
                    C0877.m55696();
                    break;
                case -1089799637:
                case -569686069:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    i39 = i39;
                    int i63 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i63;
                    i36 = s * s2;
                    i37 = s * s;
                    i38 = 41473600;
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM55979 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM55979 = C0946.m55979("ܽ۟") ^ i26;
                        i27 = ((iM55979 ^ i25) * (-8439)) ^ 1440136449;
                        i6 = 477432616;
                    }
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i415 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i415;
                    break;
                case -1034506624:
                case 1600050370:
                    if (C1071.m56343() == 0) {
                        runnableC36014 = runnableC36014;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        int i64 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i64;
                        iM55680 = (C0946.m55979("ۨܰ") + i25) * (-23);
                        i11 = ((iM55680 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                        int i5111 = iM55680 ^ i12;
                        i47 = i9;
                        RunnableC3607 runnableC36027 = runnableC36014;
                        i28 = i5111;
                        i27 = i11;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36027;
                        int i5112 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i5112;
                    } else {
                        iM55683 = (i25 - C0873.m55680("ۜۚ")) * 59;
                        i23 = ((iM55683 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -1015928124:
                case 70598750:
                    C0937.m55918();
                    if (!RunnableC0897.f81856) {
                        runnableC3609 = runnableC36014;
                        sArr6 = sArr10;
                        i18 = i41;
                        i13 = i43;
                        i14 = i44;
                        i15 = i47;
                        i16 = i29;
                        sArr4 = sArr11;
                        i17 = i45;
                        sArr5 = sArr12;
                        runnableC36010 = runnableC36013;
                        int iM559716 = (i26 - C0946.m55979("۬᩷")) * 27;
                        i47 = i15;
                        int i416 = i14;
                        sArr10 = sArr6;
                        i27 = ((iM559716 ^ i25) * (-1355)) ^ (-801112673);
                        i29 = i16;
                        i43 = i13;
                        i41 = i18;
                        runnableC36014 = runnableC3609;
                        i28 = iM559716 ^ 1625573455;
                        runnableC36013 = runnableC36010;
                        sArr12 = sArr5;
                        i45 = i17;
                        sArr11 = sArr4;
                        i44 = i416;
                    } else {
                        runnableC36014 = runnableC36014;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        int i65 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i65;
                        iM55680 = (C0946.m55979("ۨܰ") + i25) * (-23);
                        i11 = ((iM55680 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                        int i5113 = iM55680 ^ i12;
                        i47 = i9;
                        RunnableC3607 runnableC36028 = runnableC36014;
                        i28 = i5113;
                        i27 = i11;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36028;
                        int i5114 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i5114;
                    }
                    break;
                case -1011662399:
                case 748941919:
                    C1028.m56247();
                    if (C1003.m56123() != 0) {
                        iM55683 = (i25 - C0873.m55680("ۜۚ")) * 59;
                        i23 = ((iM55683 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                    } else {
                        iM55683 = (C0873.m55680("᩷᩷") + i25) * (-67);
                        i23 = ((iM55683 ^ i26) * (-18473)) ^ (-1289498320);
                        i24 = -2120116534;
                    }
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case -897268813:
                case 1628366993:
                    if (!C1404.m56468()) {
                        iM55683 = (C0946.m55979("ۨ֨") ^ i26) * 9;
                        i23 = ((iM55683 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC36014 = runnableC36014;
                        iM55682 = (C0946.m55979("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM55682 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC3607 runnableC360112 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360112;
                    }
                    break;
                case -868857664:
                case 1729747297:
                    runnableC36014 = runnableC36014;
                    if (!ViewOnClickListenerC0939.m55949(str2, C0949.m56016(f82085, 25, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        i10 = i39;
                        int i66 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i66;
                        int iM559717 = C0946.m55979("֫᩵") ^ i25;
                        String str7 = str;
                        i27 = ((iM559717 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559717 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str7;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i417 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i417;
                    } else {
                        iM55682 = C0873.m55680("ۚ᩹") ^ i25;
                        i21 = ((iM55682 ^ i26) * (-30989)) ^ (-1948355657);
                        i22 = -58495282;
                        RunnableC3607 runnableC360113 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360113;
                    }
                    break;
                case -799528344:
                case -77574885:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    i39 = i39;
                    int i67 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i67;
                    sArr8 = f82085;
                    c = 0;
                    if (C0894.m55769() >= 0) {
                        iM55979 = (C0873.m55680("ۜ֡") ^ i26) * (-15);
                        i27 = ((iM55979 ^ i25) * (-6733)) ^ (-1779300241);
                        i6 = 405369556;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩺") ^ i26;
                        i27 = ((iM55979 ^ i25) * (-25579)) ^ (-1802393284);
                        i6 = 1719100082;
                    }
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i418 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i418;
                    break;
                case -517858522:
                case 132961857:
                    runnableC36014 = runnableC36014;
                    if (!ViewOnClickListenerC0939.m55949(str2, RunnableC0871.m55667(f82085, 29, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        i10 = i39;
                        int i68 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i68;
                        int iM559718 = C0946.m55979("֫᩵") ^ i25;
                        String str8 = str;
                        i27 = ((iM559718 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559718 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str8;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i419 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i419;
                    } else {
                        iM55682 = (C0946.m55979("ۙۨ") + i25) * (-51);
                        i21 = ((iM55682 ^ i26) * 10297) ^ (-345516858);
                        i22 = 2138514795;
                        RunnableC3607 runnableC360114 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360114;
                    }
                    break;
                case -490197623:
                case 212954119:
                    if (C0890.f81849 == 0) {
                        runnableC3607 = runnableC36014;
                        sArr = sArr11;
                        i = i43;
                        i2 = i45;
                        i3 = i47;
                        i4 = i29;
                        sArr2 = sArr12;
                        runnableC3608 = runnableC36013;
                        int iM55689 = (C0873.m55680("ۢᩳ") ^ i26) * 27;
                        i47 = i3;
                        int i69 = i2;
                        sArr11 = sArr;
                        i27 = ((iM55689 ^ i25) * 24315) ^ (-632684615);
                        i29 = i4;
                        i43 = i;
                        runnableC36014 = runnableC3607;
                        i28 = iM55689 ^ 1634017602;
                        runnableC36013 = runnableC3608;
                        sArr12 = sArr2;
                        i45 = i69;
                    } else {
                        iM55683 = (C0946.m55979("ۨ֨") ^ i26) * 9;
                        i23 = ((iM55683 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    }
                    break;
                case -429970821:
                case 1638416077:
                    C1025.m56228(C0912.m55822(f82085, 33, 4, i34));
                    break;
                case -406328163:
                case 991579248:
                    runnableC36014 = runnableC36014;
                    i8 = i40;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    i10 = i39;
                    int i70 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i70;
                    str = c10313.f28574;
                    if (str == null) {
                        int iM559719 = C0946.m55979("֫᩵") ^ i25;
                        String str9 = str;
                        i27 = ((iM559719 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM559719 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str9;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i4110 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4110;
                    } else {
                        int iM556810 = (C0873.m55680("۟᩺") + i25) * (-69);
                        i40 = i8;
                        i47 = i9;
                        str2 = str;
                        i27 = ((iM556810 ^ i26) * (-13125)) ^ 422113284;
                        c10313 = this;
                        sArr3 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = iM556810 ^ 762116719;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
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
                    if (!C0947.f81895) {
                        iM55683 = (i25 - C0873.m55680("ۜۚ")) * 59;
                        i23 = ((iM55683 ^ i26) * (-2291)) ^ 188856407;
                        i24 = -648840878;
                        i28 = iM55683 ^ i24;
                        i27 = i23;
                    } else {
                        runnableC36014 = runnableC36014;
                        iM55682 = (C0946.m55979("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM55682 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                        RunnableC3607 runnableC360115 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360115;
                    }
                    break;
                case 49811240:
                case 1464020432:
                    C1046.m56302();
                    if (C0861.f81831) {
                        iM55683 = (C0946.m55979("ۨ֨") ^ i26) * 9;
                        i23 = ((iM55683 ^ i25) * 24741) ^ 40720629;
                        i24 = 934450767;
                    } else {
                        iM55683 = C0946.m55979("ܶۙ") ^ i26;
                        i23 = ((iM55683 ^ i25) * (-21777)) ^ (-1993792575);
                        i24 = -386040392;
                    }
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case 158155295:
                case 314191300:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i9 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    int i71 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i71;
                    sArr9 = f82085;
                    i39 = 1;
                    i40 = 4;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("ۨܰ") + i25) * (-23);
                        i11 = ((iM55680 ^ i26) * (-6447)) ^ (-1238953322);
                        i12 = 200733045;
                    } else {
                        iM55680 = (C0873.m55680("ܺܿ") + i26) * 101;
                        i11 = ((iM55680 ^ i25) * 7103) ^ (-675863278);
                        i12 = -1492145662;
                    }
                    int i5116 = iM55680 ^ i12;
                    i47 = i9;
                    RunnableC3607 runnableC36029 = runnableC36014;
                    i28 = i5116;
                    i27 = i11;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36029;
                    int i5117 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i5117;
                    break;
                case 239817059:
                case 1244575237:
                    runnableC36014 = runnableC36014;
                    if (!C0906.m55806(str2, C0863.m55635(f82085, 21, 4, i34))) {
                        str = str2;
                        i8 = i40;
                        i42 = i42;
                        i9 = i47;
                        sArr10 = sArr10;
                        i44 = i44;
                        sArr11 = sArr11;
                        i45 = i45;
                        sArr12 = sArr12;
                        runnableC36013 = runnableC36013;
                        i10 = i39;
                        int i610 = i43;
                        i29 = i29;
                        i41 = i41;
                        i5 = i610;
                        int iM5597110 = C0946.m55979("֫᩵") ^ i25;
                        String str10 = str;
                        i27 = ((iM5597110 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM5597110 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str10;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i4111 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4111;
                    } else {
                        iM55682 = C0873.m55680("ۚ᩹") ^ i25;
                        i21 = ((iM55682 ^ i26) * (-30989)) ^ (-1948355657);
                        i22 = -58495282;
                        RunnableC3607 runnableC360116 = runnableC36014;
                        i28 = iM55682 ^ i22;
                        i27 = i21;
                        runnableC36014 = runnableC360116;
                    }
                    break;
                case 483762439:
                case 919645558:
                    runnableC36014 = runnableC36014;
                    sArr13 = f82085;
                    i29 = 17;
                    i30 = 4;
                    if (C0877.f81843 >= 0) {
                        iM55682 = (C0946.m55979("ۨܺ") ^ i26) * (-65);
                        i21 = ((iM55682 ^ i25) * (-2335)) ^ (-8491421);
                        i22 = -1941865046;
                    } else {
                        iM55682 = (i25 - C0873.m55680("ܺܽ")) * 25;
                        i21 = ((iM55682 ^ i26) * (-6751)) ^ (-1490967876);
                        i22 = 1926227165;
                    }
                    RunnableC3607 runnableC360117 = runnableC36014;
                    i28 = iM55682 ^ i22;
                    i27 = i21;
                    runnableC36014 = runnableC360117;
                    break;
                case 544206543:
                case 1041019906:
                    runnableC36014 = runnableC36014;
                    i42 = i42;
                    i47 = i47;
                    sArr10 = sArr10;
                    i44 = i44;
                    sArr11 = sArr11;
                    i45 = i45;
                    sArr12 = sArr12;
                    runnableC36013 = runnableC36013;
                    i39 = i39;
                    int i72 = i43;
                    i29 = i29;
                    i41 = i41;
                    i5 = i72;
                    if ((i37 + i38) - i36 < 0) {
                        iM55979 = C0873.m55680("ۤᩴ") ^ i25;
                        i27 = ((iM55979 ^ i26) * 32625) ^ (-1931809705);
                        i6 = -741315568;
                    } else {
                        iM55979 = C0873.m55680("֫ۙ") ^ i25;
                        i27 = ((iM55979 ^ i26) * 11431) ^ 1866500684;
                        i6 = 239014811;
                    }
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i4112 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i4112;
                    break;
                case 647624440:
                case 1130604533:
                    runnableC36014 = runnableC36014;
                    short[] sArr19 = sArr12;
                    int i73 = i45;
                    i9 = i47;
                    runnableC36013 = runnableC36013;
                    if (ViewOnClickListenerC0939.m55949(str2, C1124.m56373(sArr19, i73, i9, i34))) {
                        int iM556811 = C0873.m55680("ۨ᩵") ^ i25;
                        i27 = ((iM556811 ^ i26) * 26187) ^ (-1055845589);
                        i47 = i9;
                        i45 = i73;
                        runnableC36014 = runnableC36014;
                        i28 = iM556811 ^ (-586372712);
                        runnableC36013 = runnableC36013;
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
                        int iM5597111 = C0946.m55979("֫᩵") ^ i25;
                        String str11 = str;
                        i27 = ((iM5597111 ^ i26) * (-13723)) ^ 1019745615;
                        i7 = iM5597111 ^ 1208617128;
                        i40 = i8;
                        i47 = i9;
                        str2 = str11;
                        i39 = i10;
                        runnableC36013 = runnableC36013;
                        sArr12 = sArr12;
                        i45 = i45;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr10 = sArr10;
                        i42 = i42;
                        runnableC36014 = runnableC36014;
                        i28 = i7;
                        c10313 = this;
                        int i4113 = i5;
                        i41 = i41;
                        i29 = i29;
                        i43 = i4113;
                    }
                    break;
                case 1272815528:
                case 1854948366:
                    C1025.m56228(C1048.m56318(sArr14, i31, i32, i34));
                    runnableC36014 = c10313.f28571;
                    if (runnableC36014 != null) {
                        iM55683 = (C0946.m55979("۟ۡ") ^ i25) * (-31);
                        i23 = ((iM55683 ^ i26) * (-1625)) ^ (-651428410);
                        i24 = -1007417202;
                    } else {
                        iM55683 = C0873.m55680("ܳۚ") ^ i26;
                        i23 = ((iM55683 ^ i25) * (-11347)) ^ 280902281;
                        i24 = -1933570164;
                    }
                    i28 = iM55683 ^ i24;
                    i27 = i23;
                    break;
                case 1399862830:
                case 1827130364:
                    runnableC36013.run();
                    C10027 c10028 = C10027.f27775;
                    break;
                case 1418676819:
                case 1822969727:
                    i5 = i43;
                    i34 = 63543;
                    iM55979 = C0946.m55979("ܿۜ") ^ i26;
                    i27 = ((iM55979 ^ i25) * (-16323)) ^ (-1354841302);
                    i6 = -977382520;
                    i7 = iM55979 ^ i6;
                    i39 = i39;
                    i47 = i47;
                    runnableC36013 = runnableC36013;
                    sArr12 = sArr12;
                    i45 = i45;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr10 = sArr10;
                    i42 = i42;
                    runnableC36014 = runnableC36014;
                    i28 = i7;
                    c10313 = this;
                    int i4114 = i5;
                    i41 = i41;
                    i29 = i29;
                    i43 = i4114;
                    break;
                case 1486845052:
                case 1730561808:
                    C1025.m56228(C1053.m56325(f82085, 46, 6, i34));
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC5549 abstractActivityC5549 = null;
        int i = -1991169445;
        int i2 = RunnableC0871.f81839;
        int i3 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("ܳܺ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-3081)) ^ 1498344230;
        int i5 = 698463640;
        while (true) {
            i = ((((i ^ i3) * (-21921)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1866966203:
                case 1700238594:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("ܳܶ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۬") + i3) * 69;
                        i4 = ((iM55979 ^ i2) * 11459) ^ 199394112;
                        i5 = -250575001;
                    }
                    break;
                case -1757754815:
                case -1235900110:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0873.m55680("ᩳ֫") + i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM55979 = C0946.m55979("᩸ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30175)) ^ (-1490227576);
                        i5 = -692542627;
                    }
                    break;
                case -1586772320:
                case -1548309188:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("ᩳ֫") + i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM55979 = C0946.m55979("᩺᩺") ^ i3;
                        i4 = ((iM55979 ^ i2) * 16737) ^ 1948202452;
                        i5 = -2082566535;
                    }
                    break;
                case -1345470103:
                case 1224262600:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * 9;
                        i4 = ((iM55979 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    } else {
                        iM55979 = (C0873.m55680("֫۠") + i3) * 95;
                        i4 = ((iM55979 ^ i2) * 16385) ^ 1393729193;
                        i5 = 1238837480;
                    }
                    break;
                case -1336234928:
                case 1692020088:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ᩳ֫") + i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM55979 = C0873.m55680("ۛ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15129)) ^ (-1796026382);
                        i5 = -788273577;
                    }
                    break;
                case -613619921:
                case 851005988:
                    C1194.m56396();
                    C0877.m55696();
                    break;
                case -428692797:
                case 441313355:
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("᩹۬") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨᩳ")) * (-17);
                        i4 = ((iM55979 ^ i2) * 12131) ^ (-331341926);
                        i5 = 1994993043;
                    }
                    break;
                case -324154898:
                case 1778694409:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("ܳܶ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM55979 = (C0946.m55979("ܽ᩷") ^ i2) * (-105);
                        i4 = ((iM55979 ^ i3) * 28401) ^ 1264774878;
                        i5 = -1117956607;
                    }
                    break;
                case -281575026:
                case 396438059:
                    C0937.m55918();
                    iM55979 = (C0873.m55680("᩷ۚ") + i3) * 9;
                    i4 = ((iM55979 ^ i2) * (-12623)) ^ (-1547614383);
                    i5 = 329695217;
                    break;
                case -207656923:
                case 409854314:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("᩹۬") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM55979 = (C0873.m55680("ܳܶ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    }
                    break;
                case 306060819:
                case 1877439842:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("᩹۬") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        iM55979 = (C0946.m55979("ܿܽ") ^ i2) * 39;
                        i4 = ((iM55979 ^ i3) * 14859) ^ (-112683444);
                        i5 = -495291530;
                    }
                    break;
                case 673447506:
                case 2077564516:
                    ServiceConnectionC1013.m56155(abstractActivityC5549, exc, null);
                    break;
                case 933042954:
                case 1184027497:
                    C0866.m55645();
                    if (C1053.m56327() < 0) {
                        iM55979 = (C0873.m55680("ᩳ֫") + i2) * (-123);
                        i4 = ((iM55979 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * 9;
                        i4 = ((iM55979 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                case 1156888291:
                case 1445169577:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ܳܶ") ^ i2) * 37;
                        i4 = ((iM55979 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * 9;
                        i4 = ((iM55979 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                case 1196967701:
                case 1826010970:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ᩳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 16481) ^ 619084345;
                        i5 = -2085278416;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۚ") + i3) * 9;
                        i4 = ((iM55979 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                    break;
                default:
                    abstractActivityC5549 = this.f28573;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ۙۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3099)) ^ 308487217;
                        i5 = -2120825370;
                    } else {
                        iM55979 = (C0946.m55979("֡ۤ") ^ i2) * (-41);
                        i4 = ((iM55979 ^ i3) * (-15079)) ^ 972729464;
                        i5 = 756292400;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int i5 = RunnableC0871.f81839;
        int i6 = C1028.f81950;
        int iM559711 = C0946.m55979("ۡ᩸") ^ i6;
        int i7 = ((iM559711 ^ i5) * (-27709)) ^ (-1428554608);
        Map mapPayV2 = null;
        short[] sArr = null;
        int i8 = iM559711 ^ 785564567;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -324756969;
        int i13 = 0;
        String strM56596 = null;
        String strM55936 = null;
        JSONObject jSONObjectM53749 = null;
        C19701 c19701M55781 = null;
        long j = 0;
        String str = null;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i5) * (-30985)) >> 31));
            switch (i12) {
                case -2078504178:
                case -486073216:
                    C0947.m55997();
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ܺۗ") ^ i6;
                        i = ((iM55979 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM559710 = (i5 - C0873.m55680("ۤ᩸")) * 83;
                        i3 = ((iM559710 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -1815875583:
                case -1058457435:
                    C0947.m55997();
                    str = str;
                    iM559710 = C0873.m55680("ܶᩳ") ^ i5;
                    i3 = ((iM559710 ^ i6) * 27449) ^ (-2035626848);
                    i4 = 1668784938;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1753706607:
                case -164204059:
                    i10 = 46970;
                    iM559710 = (C0946.m55979("᩶᩹") ^ i6) * (-23);
                    i3 = ((iM559710 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1562447858:
                case -605788688:
                    str = str;
                    i11 = s * 2;
                    if (C0873.m55678()) {
                        iM559710 = (i5 - C0873.m55680("ۤ᩸")) * 83;
                        i3 = ((iM559710 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                    } else {
                        iM559710 = C0946.m55979("۬ᩴ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-17057)) ^ (-1279170112);
                        i4 = 1024769776;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -1326206165:
                case -1140368398:
                    C1929.m56553();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("᩵ۛ") ^ i6) * (-47);
                        i = ((iM55979 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM559710 = C0873.m55680("ܶᩳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -1239577804:
                case -871308521:
                    strM55936 = RunnableC0938.m55936(f82085, 63, 7, i10);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ܺۗ") ^ i6;
                        i = ((iM55979 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                    } else {
                        iM55979 = (C0946.m55979("֡ۧ") ^ i6) * 5;
                        i = ((iM55979 ^ i5) * (-17957)) ^ (-2074828);
                        i2 = 1430001809;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -933445856:
                case 1740587873:
                    C0930.m55884(c19701M55781, this.f28572);
                    jSONObjectM53749 = C24394.m53749(c19701M55781);
                    if (C13045.m29864((Object) str, (Object) RunnableC1014.m56174())) {
                        iM55979 = C0946.m55979("ۘۚ") ^ i5;
                        i = ((iM55979 ^ i6) * 18937) ^ 1148373164;
                        i2 = 2065325334;
                    } else {
                        iM55979 = C0873.m55680("᩷ۤ") ^ i5;
                        i = ((iM55979 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -865085956:
                case -196869526:
                    String strM56174 = RunnableC1014.m56174();
                    str = this.f28575;
                    if (C13045.m29864((Object) str, (Object) strM56174)) {
                        iM55979 = C0946.m55979("֡ܳ") ^ i6;
                        i = ((iM55979 ^ i5) * (-6451)) ^ (-317927936);
                        i2 = 2127133848;
                    } else {
                        iM55979 = C0873.m55680("᩷ۤ") ^ i5;
                        i = ((iM55979 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -807425557:
                case -733471834:
                    AbstractActivityC5549 abstractActivityC5549 = this.f28573;
                    if (C1017.m56187() > 0) {
                        mapPayV2 = new PayTask(abstractActivityC5549).payV2(strM56596, true);
                        sArr = f82085;
                        i9 = 70;
                        if (C0955.m56025()) {
                            iM55979 = C0946.m55979("ܺۗ") ^ i6;
                            i = ((iM55979 ^ i5) * 20399) ^ (-1372980532);
                            i2 = 260099255;
                        } else {
                            iM55979 = C0946.m55979("ᩴᩴ") ^ i6;
                            i = ((iM55979 ^ i5) * 7515) ^ 1010262433;
                            i2 = -2017226453;
                        }
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM559710 = C0946.m55979("֨۫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case -715067004:
                case 786870723:
                    str = str;
                    int i14 = s + s2;
                    if ((i14 * i14) - i13 < 0) {
                        iM559710 = (i5 - C0873.m55680("֫᩻")) * 11;
                        i3 = ((iM559710 ^ i6) * (-9587)) ^ (-1774653613);
                        i4 = -83441414;
                    } else {
                        iM559710 = C0946.m55979("ۡ᩵") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-2551)) ^ (-1040856422);
                        i4 = 1875730942;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case -518416562:
                case 1467046433:
                    this.f28574 = (String) mapPayV2.get(C0946.m55986(sArr, i9, 12, i10));
                    iM55979 = C0873.m55680("᩷ۤ") ^ i5;
                    i = ((iM55979 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -488539717:
                case 1606970143:
                    if (j != C23724.f75501) {
                        iM55979 = C0873.m55680("᩷ۤ") ^ i5;
                        i = ((iM55979 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                    } else {
                        iM55979 = C0946.m55979("ܳ֫") ^ i5;
                        i = ((iM55979 ^ i6) * (-26673)) ^ 1115150637;
                        i2 = 803639363;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -91445896:
                case 1504471655:
                    C0863.m55643();
                    break;
                case 261657303:
                case 645012555:
                    break;
                case 403734991:
                case 754155351:
                    long j2 = C23724.f75501;
                    str = str;
                    long j3 = this.f28576;
                    if (j3 == j2) {
                        int iM559712 = (C0946.m55979("ܳ۠") ^ i6) * (-73);
                        i8 = iM559712 ^ (-2021816942);
                        i7 = ((iM559712 ^ i5) * 20289) ^ (-219683911);
                        j = j3;
                        str = str;
                    } else {
                        j = j3;
                        str = str;
                        iM55979 = C0873.m55680("᩷ۤ") ^ i5;
                        i = ((iM55979 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 911655754:
                case 1467869982:
                    strM56596 = C1964.m56596(jSONObjectM53749, strM55936);
                    if (C1012.f81938 < 0) {
                        RunnableC3607 runnableC3607 = new RunnableC3607(jSONObjectM53749, str, j);
                        this.f28571 = runnableC3607;
                        C23724.f75500 = runnableC3607;
                        if (C0989.f81920 < 0) {
                            iM55979 = (C0873.m55680("᩺ܶ") ^ i5) * (-69);
                            i = ((iM55979 ^ i6) * 9045) ^ 1044836825;
                            i2 = -1339245494;
                            i8 = iM55979 ^ i2;
                            i7 = i;
                            break;
                        }
                    }
                    str = str;
                    iM559710 = (i5 - C0873.m55680("ۤ᩸")) * 83;
                    i3 = ((iM559710 ^ i6) * 25053) ^ 1303450701;
                    i4 = 1553316970;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 953403258:
                case 1767465615:
                    if (C0946.f81894 != 0) {
                        str = str;
                        iM559710 = (i5 - C0873.m55680("ۤ᩸")) * 83;
                        i3 = ((iM559710 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    } else {
                        iM55979 = (C0946.m55979("᩵ۛ") ^ i6) * (-47);
                        i = ((iM55979 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 977865523:
                case 1348439343:
                    c19701M55781.m44742(0);
                    if (C0890.f81849 == 0) {
                        iM55979 = (i6 - C0873.m55680("᩷᩶")) * 65;
                        i = ((iM55979 ^ i5) * (-28079)) ^ 1314705080;
                        i2 = -737622874;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM559710 = C0873.m55680("ܶᩳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
                case 1208706245:
                case 1435801570:
                    str = str;
                    s = f82085[62];
                    if (RunnableC0871.f81839 >= 0) {
                        iM559710 = C0873.m55680("ܶᩳ") ^ i5;
                        i3 = ((iM559710 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                    } else {
                        iM559710 = C0946.m55979("᩶᩻") ^ i5;
                        i3 = ((iM559710 ^ i6) * (-28917)) ^ (-1904799781);
                        i4 = 1109185690;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 1540163357:
                case 1566089891:
                    str = str;
                    i13 = i11 + 1;
                    s2 = 1;
                    if (RunnableC1014.m56177()) {
                        iM559710 = C0873.m55680("ܶܿ") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-15867)) ^ 1349230024;
                        i4 = -1279696984;
                    } else {
                        iM559710 = C0946.m55979("֨۫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                    }
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                case 1724744847:
                case 1825196172:
                    i10 = 25241;
                    iM559710 = (C0946.m55979("᩶᩹") ^ i6) * (-23);
                    i3 = ((iM559710 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = iM559710 ^ i4;
                    i7 = i3;
                    str = str;
                    break;
                default:
                    c19701M55781 = RunnableC0897.m55781(4370);
                    c19701M55781.m44753(this.f28570);
                    if (C1017.f81942 < 0) {
                        iM55979 = C0946.m55979("ᩳ᩶") ^ i5;
                        i = ((iM55979 ^ i6) * (-6249)) ^ 1101164595;
                        i2 = -1548633345;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        str = str;
                        iM559710 = C0946.m55979("֨۫") ^ i6;
                        i3 = ((iM559710 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = iM559710 ^ i4;
                        i7 = i3;
                        str = str;
                    }
                    break;
            }
            return;
        }
    }
}
