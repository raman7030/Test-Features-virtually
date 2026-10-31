package l;

import android.view.View;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7245 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܽ֡᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f22200 = {6132, 30329, -25838, -27133, -24727, -25303, -24200, 3447, 11322, -1139, 4923, 3409, -653, 10103, 7062, 6206, 5203, 4454, -20970, 17791, 27644, 9480, 9480, 9480};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22201;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22202;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f22203;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f22204;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12164 f22205;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC10732 f22206;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22207;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f22208;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f22209;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f22210;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f22211;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f22212;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f22213;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f22214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f22215;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22108 f22216;

    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[PHI: r12 r13
      0x00ea: PHI (r12v3 short[]) = (r12v2 short[]), (r12v1 short[]), (r12v1 short[]) binds: [B:32:0x00e8, B:13:0x0058, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r13v3 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:32:0x00e8, B:13:0x0058, B:5:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01db A[PHI: r3 r8 r9 r10 r14 r15
      0x01db: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v2 java.lang.String), (r3v1 java.lang.String) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r14v2 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v3 short[]) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:54:0x01d9, B:28:0x00c3, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0233 A[PHI: r2 r4 r6 r7 r20 r21
      0x0233: PHI (r2v4 java.lang.Runnable) = 
      (r2v1 java.lang.Runnable)
      (r2v1 java.lang.Runnable)
      (r2v1 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v1 java.lang.Runnable)
      (r2v1 java.lang.Runnable)
     binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r4v8 l.᩺ۤܿ) = (r4v2 l.᩺ۤܿ), (r4v2 l.᩺ۤܿ), (r4v2 l.᩺ۤܿ), (r4v3 l.᩺ۤܿ), (r4v2 l.᩺ۤܿ), (r4v2 l.᩺ۤܿ) binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v4 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short), (r6v1 short), (r6v1 short) binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r7v4 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short), (r7v1 short), (r7v1 short) binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r20v6 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r21v4 char) = (r21v2 char), (r21v1 char), (r21v1 char), (r21v1 char), (r21v1 char), (r21v1 char) binds: [B:62:0x0231, B:58:0x020f, B:13:0x0058, B:43:0x0163, B:86:0x0233, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        Runnable runnable = null;
        String strM10488 = null;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 0;
        short[] sArr2 = null;
        int i10 = 0;
        int i11 = 1258549755;
        int i12 = C0714.f2697;
        int i13 = C3432.f10845;
        int iM6982 = (C2105.m6981("᩹ܽ") + i12) * 37;
        int i14 = ((iM6982 ^ i13) * (-22719)) ^ 286727715;
        int i15 = iM6982 ^ (-766405446);
        short[] sArr3 = null;
        C22933 c22933 = null;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-28649)) >> 31));
            switch (i11) {
                case -1966701778:
                case 588010636:
                    c22933.mo49542(runnable);
                    sArr = f22200;
                    i9 = 18;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("ܰ۫") ^ i12) * (-33);
                        i = ((iM6981 ^ i13) * 27031) ^ 702751383;
                        i2 = -1105945823;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ᩴܽ")) * 21;
                        i = ((iM6981 ^ i13) * 27065) ^ 1336884755;
                        i2 = 1870679507;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -1928398532:
                case -272165183:
                    if (i5 - (i6 + i7) <= 0) {
                        iM6981 = (i12 - C2105.m6981("᩻ۡ")) * (-53);
                        i = ((iM6981 ^ i13) * 8021) ^ (-189262311);
                        i2 = -925592123;
                    } else {
                        iM6981 = C2105.m6981("ۧۗ") ^ i12;
                        i = ((iM6981 ^ i13) * (-28539)) ^ 997823955;
                        i2 = 1760539390;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -1917495687:
                case -975266852:
                    if (C1916.m6308() < 0) {
                        iM6981 = (C0630.m2566("ܰ۫") ^ i12) * (-33);
                        i = ((iM6981 ^ i13) * 27031) ^ 702751383;
                        i2 = -1105945823;
                    } else {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                        i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -1574758849:
                case 99632596:
                    C1773.m5908();
                    if (C11340.f33930 < 0) {
                        iM2566 = (C0630.m2566("֡֨") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2566 ^ i12) * 24853) ^ (-1548650374);
                        i4 = -1502599862;
                        i15 = iM2566 ^ i4;
                        i14 = i3;
                        c22933 = null;
                    } else {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                        i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1353393350:
                case 2142163421:
                    i5 = s * s2;
                    i6 = s * s;
                    i7 = 125037124;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (i12 - C2105.m6981("᩵᩷")) * 25;
                        i = ((iM6981 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM6981 = (i13 - C2105.m6981("֡ۡ")) * 83;
                        i = ((iM6981 ^ i12) * (-30653)) ^ 1294198130;
                        i2 = 1520019737;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -1329197103:
                case -425084113:
                    c22933.m51049(C0630.m2566(strM10488) ^ 2097446774);
                    if (C0237.m1481() < 0) {
                        iM6981 = C2105.m6981("ᩴ᩶") ^ i12;
                        i = ((iM6981 ^ i13) * 26461) ^ (-1169289693);
                        i2 = -813227965;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    } else {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i13;
                        i3 = ((iM2566 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM2566 ^ i4;
                        i14 = i3;
                        c22933 = null;
                    }
                    break;
                case -1255945333:
                case 290122391:
                    C16560 c16560 = this.f22206.f32338;
                    if (!C1916.f6442) {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i13;
                        i3 = ((iM2566 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM2566 ^ i4;
                        i14 = i3;
                        c22933 = null;
                    } else {
                        Main mainM49336 = C21923.m49336(c16560);
                        if (!C1916.f6442) {
                            iM2566 = (C0630.m2566("֡֨") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM2566 ^ i12) * 24853) ^ (-1548650374);
                            i4 = -1502599862;
                            i15 = iM2566 ^ i4;
                            i14 = i3;
                            c22933 = null;
                        } else {
                            c22933 = new C22933(mainM49336);
                            runnable = null;
                            if (C3683.f11629 >= 0) {
                                iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                                i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                                i2 = -1906049996;
                            } else {
                                iM6981 = C2105.m6981("ۤۘ") ^ i13;
                                i = ((iM6981 ^ i12) * 20127) ^ 1847242493;
                                i2 = -1776757808;
                            }
                            i15 = iM6981 ^ i2;
                            i14 = i;
                        }
                    }
                    break;
                case -1052594103:
                case 832998554:
                    c22933.m51040(C3663.m11162(sArr2, i10, 3, i8));
                    c22933.mo49547();
                    this.f22210 = c22933;
                    break;
                case -1011283273:
                case 1042459208:
                    strM10488 = C3432.m10488(sArr, i9, 3, i8);
                    if (C2272.m7503()) {
                        iM6981 = (i12 - C2105.m6981("᩵᩷")) * 25;
                        i = ((iM6981 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM6981 = (i13 - C2105.m6981("ۢ᩺")) * 41;
                        i = ((iM6981 ^ i12) * 8435) ^ 702154089;
                        i2 = -1327882239;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -472686035:
                case 162332501:
                    if (C3683.f11629 < 0) {
                        iM2566 = C0630.m2566("ۧ᩷") ^ i13;
                        i3 = ((iM2566 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM2566 ^ i4;
                        i14 = i3;
                        c22933 = null;
                    } else {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                        i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                        i15 = iM6981 ^ i2;
                        i14 = i;
                    }
                    break;
                case -425692109:
                case 475870745:
                    i8 = 13859;
                    iM6981 = C0630.m2566("֨ۨ") ^ i13;
                    i = ((iM6981 ^ i12) * 17549) ^ (-1156874643);
                    i2 = -1537341441;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case -214987489:
                case 1008519544:
                    s = sArr3[c];
                    s2 = 22364;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                        i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    } else {
                        iM6981 = (i12 - C0630.m2566("᩵ᩳ")) * 75;
                        i = ((iM6981 ^ i13) * (-7715)) ^ (-1517179410);
                        i2 = 526402831;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case 114633860:
                case 1103852764:
                    sArr2 = f22200;
                    i10 = 21;
                    if (C2105.f7037 != 0) {
                        iM6981 = (i12 - C2105.m6981("᩵᩷")) * 25;
                        i = ((iM6981 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM6981 = C0630.m2566("֡ۖ") ^ i13;
                        i = ((iM6981 ^ i12) * 17329) ^ (-345167181);
                        i2 = 1951817268;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case 430215355:
                case 1413687506:
                    C3245.m9925();
                    C4075.m12263();
                    break;
                case 930830744:
                case 1117676088:
                    i8 = 9510;
                    iM6981 = C0630.m2566("֨ۨ") ^ i13;
                    i = ((iM6981 ^ i12) * 17549) ^ (-1156874643);
                    i2 = -1537341441;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                case 1136130719:
                case 2142050289:
                    sArr3 = f22200;
                    c = 17;
                    if (C21923.m49329()) {
                        iM6981 = C0630.m2566("ᩴۜ") ^ i12;
                        i = ((iM6981 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩵") ^ i13;
                        i = ((iM6981 ^ i12) * (-9655)) ^ (-1636210965);
                        i2 = 1178286382;
                    }
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
                default:
                    C0964.m3413();
                    iM6981 = (C0630.m2566("ܰ۫") ^ i12) * (-33);
                    i = ((iM6981 ^ i13) * 27031) ^ 702751383;
                    i2 = -1105945823;
                    i15 = iM6981 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    public C7245(ViewOnClickListenerC10732 viewOnClickListenerC10732, AbstractC15440 abstractC15440, C11667 c11667, boolean z, int i, C12164 c12164, boolean z2, boolean z3, String str, int i2, int i3, AbstractC15440 abstractC15441, boolean z4) {
        C22108 c22108 = null;
        int i4 = 1663233151;
        int i5 = C1773.f6144;
        int i6 = C4117.f13076;
        this.f22206 = viewOnClickListenerC10732;
        this.f22211 = abstractC15440;
        this.f22203 = c11667;
        this.f22212 = z;
        this.f22202 = i;
        this.f22205 = c12164;
        this.f22213 = z2;
        this.f22209 = z3;
        this.f22214 = str;
        this.f22207 = i2;
        this.f22201 = i3;
        this.f22204 = abstractC15441;
        this.f22208 = z4;
        int iM2566 = (C0630.m2566("ᩳ᩸") + i5) * (-103);
        int i7 = ((iM2566 ^ i6) * (-32699)) ^ (-2112939840);
        int i8 = -2005739771;
        while (true) {
            i4 = ((((i4 ^ i6) * 22965) >> 31) & i7) ^ (iM2566 ^ i8);
            switch (i4) {
                case -1805034885:
                case -1511803808:
                    C22628.m50615();
                    iM2566 = C2105.m6981("᩵᩹") ^ i5;
                    i7 = ((iM2566 ^ i6) * (-29981)) ^ 1548053940;
                    i8 = -602700310;
                    break;
                case -1762571835:
                case 1456241972:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("۫ᩴ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    } else {
                        iM2566 = (C2105.m6981("᩸֨") ^ i6) * 29;
                        i7 = ((iM2566 ^ i5) * 3059) ^ (-895971538);
                        i8 = -985672724;
                    }
                    break;
                case -1444986500:
                case 158220637:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM2566 = C2105.m6981("ۡ֫") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-11109)) ^ 1965880557;
                        i8 = -1679113765;
                    }
                    break;
                case -1207182234:
                case 1588694386:
                    c22108 = new C22108();
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM2566 = (C2105.m6981("ۜ۬") ^ i5) * 73;
                        i7 = ((iM2566 ^ i6) * (-6013)) ^ (-140852948);
                        i8 = 2040511496;
                    }
                    break;
                case -925148502:
                case -197815926:
                    if (C1128.f4106 > 0) {
                        iM2566 = C0630.m2566("۫ᩴ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    } else {
                        iM2566 = C2105.m6981("᩵᩹") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-29981)) ^ 1548053940;
                        i8 = -602700310;
                    }
                    break;
                case -470964008:
                case 306533160:
                    if (C0050.f910 < 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM2566 = C0630.m2566("۫ᩴ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    }
                    break;
                case -420294168:
                case 1607434059:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C0630.m2566("᩹ܳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM2566 = (C0630.m2566("᩶۠") + i6) * (-123);
                        i7 = ((iM2566 ^ i5) * 11587) ^ 681914312;
                        i8 = -498465303;
                    }
                    break;
                case -223499592:
                case 179285299:
                    C3663.m11168();
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                case -216179063:
                case 1732934669:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("᩹ܳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM2566 = C2105.m6981("۠ۖ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 32297) ^ 1365978728;
                        i8 = 1759903356;
                    }
                    break;
                case -31397830:
                case 1005930519:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM2566 = C2105.m6981("᩹ۜ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-26367)) ^ (-1981909469);
                        i8 = -1069815583;
                    }
                    break;
                case 49323572:
                case 561815203:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("֡۫") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-7129)) ^ (-1868326682);
                        i8 = -215311443;
                    } else {
                        iM2566 = C2105.m6981("᩵᩹") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-29981)) ^ 1548053940;
                        i8 = -602700310;
                    }
                    break;
                case 298574583:
                case 1631752750:
                    if (RunnableC3474.m10630()) {
                        iM2566 = C0630.m2566("᩸۬") ^ i5;
                        i7 = ((iM2566 ^ i6) * 2721) ^ (-907221018);
                        i8 = 1903240649;
                    } else {
                        iM2566 = C0630.m2566("۫ᩴ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    }
                    break;
                case 301177788:
                case 1533384363:
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("֡۫") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-7129)) ^ (-1868326682);
                        i8 = -215311443;
                    } else {
                        iM2566 = C0630.m2566("᩻ܳ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 15043) ^ 599193270;
                        i8 = -794905132;
                    }
                    break;
                case 502070778:
                case 1043119917:
                    this.f22216 = c22108;
                    return;
                case 763730718:
                case 1116611489:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۫ܶ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM2566 = (C0630.m2566("֡ۗ") ^ i6) * 45;
                        i7 = ((iM2566 ^ i5) * 29127) ^ (-1772658950);
                        i8 = 439942134;
                    }
                    break;
                default:
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("᩹ܳ") ^ i6;
                        i7 = ((iM2566 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM2566 = C2105.m6981("ۨۘ") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-5713)) ^ 1937801867;
                        i8 = 1240973579;
                    }
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        /*
            Method dump skipped, instruction units count: 2838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7245.mo1009():void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19347(C18090 c18090, C8918 c8918) throws C1559 {
        int iM2566;
        int i;
        int i2;
        C19277 c19277;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int iM2568;
        int i6;
        int i7;
        AbstractC15440 abstractC15440;
        C10130 c10130;
        int i8;
        C19277 c19278;
        C19277 c19279;
        C15206 c15206;
        C3545 c3545;
        int iM2569;
        int i9;
        int i10;
        int i11;
        C19277 c192710;
        C3545 c3546;
        C22933 c22933;
        C19277 c192711;
        AbstractC15440 abstractC15441;
        ArrayList arrayList;
        int iM6981;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        ArrayList arrayList2;
        int i15;
        C3545 c3547;
        C22933 c22934;
        C10130 c10131;
        String strM35992;
        C15206 c15207;
        int i16;
        int iM6982;
        int i17;
        int i18;
        c18090 = c18090;
        C8918 c8919 = c8918;
        C4624 c4624 = null;
        int i19 = C0630.f2410;
        int i20 = C4075.f12947;
        int iM6983 = (C2105.m6981("۟ۡ") ^ i20) * (-93);
        int i21 = ((iM6983 ^ i19) * 9611) ^ 1995657560;
        Iterator itM50611 = null;
        String strM11363 = null;
        C15206 c15208 = null;
        String str = null;
        String str2 = null;
        C10130 c10132 = null;
        C12534 c12534 = null;
        ArrayList arrayList3 = null;
        int i22 = 736569528;
        AbstractC15440 abstractC15442 = null;
        int i23 = 0;
        C19277 c192712 = null;
        C19277 c192713 = null;
        Iterator itM9029 = null;
        C22933 c22935 = null;
        InputStream inputStreamM11163 = null;
        int i24 = iM6983 ^ 1983818105;
        int i25 = 0;
        AbstractC15440 abstractC15443 = null;
        ArrayList arrayList4 = null;
        byte[] bArrM25444 = null;
        C3545 c3548 = null;
        C3545 c3549 = null;
        while (true) {
            int i26 = i24 ^ (i21 & (((i22 ^ i19) * 20507) >> 31));
            switch (i26) {
                case -2091358638:
                case 1102133605:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22933 = c22935;
                    c10132 = c10132;
                    i11 = i23;
                    c192711 = c192712;
                    c15208 = c15208;
                    c3546 = c3549;
                    c4624.m13573();
                    long jM10481 = C3432.m10481(arrayList3);
                    if (!C1504.m5179()) {
                        abstractC15441 = abstractC15443;
                        int iM6984 = (C2105.m6981("ۛ۠") + i20) * (-15);
                        i24 = iM6984 ^ (-1478117264);
                        c192712 = c192711;
                        c22935 = c22933;
                        i23 = i11;
                        abstractC15443 = abstractC15441;
                        i21 = ((iM6984 ^ i19) * 22475) ^ (-2051013048);
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = null;
                        c192713 = null;
                        c3549 = c3546;
                        i25 = i25;
                        c15208 = c15208;
                        c10132 = c10132;
                        str = str;
                    } else {
                        C19277 c192714 = new C19277(jM10481);
                        if (C22628.f73083 > 0) {
                            C3911.m11929(c192714, new InterfaceC2343() { // from class: l.᩺ۙܽ
                                @Override // l.InterfaceC2343
                                /* JADX INFO: renamed from: ֫ */
                                public final void mo6264(int i27) {
                                    C7245 c7245 = null;
                                    C22933 c22936 = null;
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    int i31 = 298443708;
                                    int i32 = C0483.f2088;
                                    int i33 = C2167.f7158;
                                    int iM6985 = C2105.m6981("֡ܺ") ^ i33;
                                    int i34 = ((iM6985 ^ i32) * 4779) ^ 2108206010;
                                    int i35 = -591770796;
                                    while (true) {
                                        i31 = ((((i31 ^ i32) * (-16203)) >> 31) & i34) ^ (iM6985 ^ i35);
                                        switch (i31) {
                                            case -2122878381:
                                            case 1046965073:
                                                if (C2126.m7040()) {
                                                    iM6985 = C0630.m2566("᩹ۤ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM6985 = (C2105.m6981("ۡۧ") ^ i32) * (-97);
                                                    i34 = ((iM6985 ^ i33) * 1123) ^ (-1937024103);
                                                    i35 = 1586479235;
                                                }
                                                break;
                                            case -2120569629:
                                            case 2031425132:
                                                if (C1294.f4556 >= 0) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = (C0630.m2566("ܶۘ") + i32) * 55;
                                                    i34 = ((iM6985 ^ i33) * 32437) ^ (-1618911904);
                                                    i35 = 234606414;
                                                }
                                                break;
                                            case -1892502539:
                                            case 1681833099:
                                                c22936.m51045(i29 + i30);
                                                break;
                                            case -1849940742:
                                            case 425924472:
                                                C2167.m7155();
                                                break;
                                            case -1776058060:
                                            case 1833357596:
                                                if (!C0422.m1963()) {
                                                    iM6985 = C0630.m2566("᩹ۤ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                }
                                                break;
                                            case -1600039584:
                                            case 900232235:
                                                if (C1504.f5354) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = C2105.m6981("᩺֨") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-7091)) ^ 1311333261;
                                                    i35 = 1478673435;
                                                }
                                                break;
                                            case -1464939577:
                                            case 1297406657:
                                                if (C0422.f1886 <= 0) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = C0630.m2566("᩷ܺ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-30083)) ^ 688299404;
                                                    i35 = 393235051;
                                                }
                                                break;
                                            case -1205428993:
                                            case -329489572:
                                                if (C4075.m12263() <= 0) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = C0630.m2566("ۜۙ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * 20845) ^ 1035063543;
                                                    i35 = 1489828792;
                                                }
                                                break;
                                            case -1153746420:
                                            case -836370962:
                                                C3663.m11168();
                                                C0630.m2564();
                                                iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                i35 = 1502831809;
                                                break;
                                            case -662170155:
                                            case 1546476178:
                                                C22628.m50615();
                                                if (!C0382.f1805) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = (i32 - C0630.m2566("ᩴ۠")) * (-91);
                                                    i34 = ((iM6985 ^ i33) * 19449) ^ 446752331;
                                                    i35 = 121148692;
                                                }
                                                break;
                                            case -494211316:
                                            case -470047821:
                                                c22936 = c7245.f22210;
                                                i28 = 2;
                                                if (C0630.m2564()) {
                                                    iM6985 = C0630.m2566("᩹᩹") ^ i32;
                                                    i34 = ((iM6985 ^ i33) * 2475) ^ (-2028476545);
                                                    i35 = 1224972311;
                                                } else {
                                                    iM6985 = C0630.m2566("ۡۙ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-18449)) ^ 1076420085;
                                                    i35 = 1468930183;
                                                }
                                                break;
                                            case -368157627:
                                            case 99381963:
                                                if (C1504.f5354) {
                                                    iM6985 = (i32 - C0630.m2566("ᩴ۠")) * (-91);
                                                    i34 = ((iM6985 ^ i33) * 19449) ^ 446752331;
                                                    i35 = 121148692;
                                                } else {
                                                    iM6985 = (C0630.m2566("֫᩶") ^ i32) * 51;
                                                    i34 = ((iM6985 ^ i33) * 19347) ^ 529932081;
                                                    i35 = -726053224;
                                                }
                                                break;
                                            case -46975235:
                                            case 140121028:
                                                if (C1420.f5096 <= 0) {
                                                    iM6985 = (C2105.m6981("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM6985 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM6985 = C2105.m6981("۠᩶") ^ i32;
                                                    i34 = ((iM6985 ^ i33) * (-23149)) ^ (-232466688);
                                                    i35 = 538178363;
                                                }
                                                break;
                                            case -13612370:
                                            case 103000423:
                                                c7245 = this.f73517;
                                                if (C4159.m12565() >= 0) {
                                                    iM6985 = C0630.m2566("᩹ۤ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM6985 = (C2105.m6981("ܿܶ") ^ i33) * (-5);
                                                    i34 = ((iM6985 ^ i32) * (-16083)) ^ (-1739927017);
                                                    i35 = 582240248;
                                                }
                                                break;
                                            case 755459960:
                                            case 756438678:
                                                if (RunnableC3474.m10630()) {
                                                    iM6985 = (C2105.m6981("֨᩸") ^ i33) * (-119);
                                                    i34 = ((iM6985 ^ i32) * 18235) ^ 1970598564;
                                                    i35 = 1086580313;
                                                } else {
                                                    iM6985 = C0630.m2566("᩹ۤ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                }
                                                break;
                                            default:
                                                i29 = i27 / i28;
                                                i30 = 50;
                                                if (C2126.m7040()) {
                                                    iM6985 = C0630.m2566("᩹ۤ") ^ i33;
                                                    i34 = ((iM6985 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM6985 = (C0630.m2566("֡ᩳ") ^ i32) * 29;
                                                    i34 = ((iM6985 ^ i33) * (-23537)) ^ 466278971;
                                                    i35 = 590855622;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            c192713 = c192714;
                            arrayList4 = new ArrayList(i11);
                            itM9029 = C2958.m9029(arrayList3);
                            i25 = i11;
                            int iM6985 = (C2105.m6981("ۡ֫") + i20) * (-21);
                            i24 = iM6985 ^ 665384988;
                            c192712 = c192711;
                            c3549 = c3546;
                            i21 = ((iM6985 ^ i19) * (-3239)) ^ 103322131;
                            c22935 = c22933;
                            i23 = i11;
                            c15208 = c15208;
                            i22 = i26;
                            bArrM25444 = bArrM25444;
                            arrayList3 = arrayList3;
                            c10132 = c10132;
                            str = str;
                        } else {
                            c192713 = c192714;
                            c192712 = c192711;
                            abstractC15441 = abstractC15443;
                            arrayList = arrayList3;
                            int iM25610 = (C0630.m2566("᩵֨") + i19) * (-125);
                            i21 = 1937582279 ^ ((iM25610 ^ i20) * (-7149));
                            i24 = iM25610 ^ 525810989;
                            c18090 = c18090;
                            c8919 = c8918;
                            c22935 = c22933;
                            i23 = i11;
                            abstractC15443 = abstractC15441;
                            arrayList3 = arrayList;
                            i22 = i26;
                            bArrM25444 = bArrM25444;
                            c3549 = c3546;
                            i25 = i25;
                            c15208 = c15208;
                            c10132 = c10132;
                            str = str;
                        }
                    }
                    break;
                case -2081215596:
                case 2074993841:
                    bArrM25444 = null;
                    int iM25611 = (i19 - C0630.m2566("ܶܰ")) * 61;
                    i24 = iM25611 ^ 271085950;
                    c3549 = c3549;
                    i25 = i25;
                    c22935 = c22935;
                    i21 = ((iM25611 ^ i20) * (-15039)) ^ 820419246;
                    c15208 = c15208;
                    i22 = i26;
                    arrayList3 = arrayList3;
                    c10132 = c10132;
                    str = str;
                    break;
                case -2020533348:
                case 1847166838:
                    c8919.m23013(c3549);
                    C1128.m3855(c8919, bArrM25444);
                    iM2566 = C2105.m6981("ۛۜ") ^ i20;
                    i = ((iM2566 ^ i19) * 27337) ^ 616910105;
                    i2 = 498299897;
                    i24 = iM2566 ^ i2;
                    i21 = i;
                    c15208 = c15208;
                    i22 = i26;
                    c10132 = c10132;
                    break;
                case -2010223194:
                case 674180427:
                    i14 = i26;
                    C10130 c10133 = c10132;
                    c15207 = c15208;
                    bArr = bArrM25444;
                    arrayList2 = arrayList3;
                    c10131 = c10133;
                    c22934 = c22935;
                    String str3 = str;
                    String str4 = str;
                    i15 = i25;
                    c3547 = c3549;
                    C3545 c35410 = c3548;
                    String strM9356 = C3058.m9356(str3, this.f22214, this.f22205, this.f22213, false, this.f22216, arrayList4);
                    if (strM9356 == null) {
                        c3548 = c35410;
                        strM35992 = str4;
                        str2 = strM9356;
                        int iM6986 = C2105.m6981("ۢۢ") ^ i19;
                        i24 = iM6986 ^ (-649914222);
                        c3549 = c3547;
                        i25 = i15;
                        c22935 = c22934;
                        i21 = ((iM6986 ^ i20) * (-26035)) ^ 948684771;
                        c15208 = c15207;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c10132 = c10131;
                        str = strM35992;
                        bArrM25444 = bArr;
                    } else {
                        int iM6987 = (C2105.m6981("᩶ۜ") ^ i20) * 71;
                        i16 = ((iM6987 ^ i19) * 28353) ^ 376380952;
                        i24 = iM6987 ^ (-247155395);
                        c3549 = c3547;
                        i25 = i15;
                        c22935 = c22934;
                        c3548 = c35410;
                        c15208 = c15207;
                        i22 = i14;
                        bArrM25444 = bArr;
                        arrayList3 = arrayList2;
                        c10132 = c10131;
                        str = str4;
                        str2 = strM9356;
                        i21 = i16;
                    }
                    break;
                case -1981185095:
                case -1482926241:
                    i26 = i26;
                    try {
                        C2134 c2134 = new C2134(c12534);
                        c2134.m7056(c15208.f46673);
                        c2134.m7058(c15208.f46672.mo3391());
                        c2134.m7055(str2);
                        c10132 = c10132;
                        try {
                            c2134.m7057(c10132);
                            iM2566 = (C0630.m2566("ۢۘ") + i20) * (-77);
                            c15208 = c15208;
                            i = ((iM2566 ^ i19) * (-11837)) ^ 2013873980;
                            i2 = -2046727343;
                        } catch (C1580 unused) {
                            c15208 = c15208;
                            iM2566 = C2105.m6981("᩶֨") ^ i19;
                            i = ((iM2566 ^ i20) * (-18671)) ^ 1786173164;
                            i2 = 1776628972;
                        }
                    } catch (C1580 unused2) {
                        c10132 = c10132;
                    }
                    i24 = iM2566 ^ i2;
                    i21 = i;
                    c15208 = c15208;
                    i22 = i26;
                    c10132 = c10132;
                    break;
                case -1948616670:
                case -1099682040:
                    i26 = i26;
                    c10132 = c10132;
                    c15208 = c15208;
                    if (bArrM25444 != null) {
                        iM2566 = (C2105.m6981("᩵ۙ") ^ i20) * (-113);
                        i = ((iM2566 ^ i19) * (-28963)) ^ 1303677488;
                        i2 = -1089694830;
                    } else {
                        iM2566 = C0630.m2566("۫֫") ^ i19;
                        i = ((iM2566 ^ i20) * 13107) ^ 127104795;
                        i2 = -989654235;
                    }
                    i24 = iM2566 ^ i2;
                    i21 = i;
                    c15208 = c15208;
                    i22 = i26;
                    c10132 = c10132;
                    break;
                case -1948560716:
                case -103591446:
                    i26 = i26;
                    if (C2520.f8000 >= 0) {
                        iM6982 = (C0630.m2566("۫֨") + i19) * (-5);
                        i17 = ((iM6982 ^ i20) * 31379) ^ 1119065148;
                        i18 = 983842194;
                        i24 = iM6982 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    } else {
                        bArrM25444 = bArrM25444;
                        str = str;
                        i25 = i25;
                        c10132 = c10132;
                        i11 = i23;
                        c192710 = c192713;
                        c15208 = c15208;
                        c3546 = c3549;
                        int iM6988 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                        int i27 = ((iM6988 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM6988 ^ 1569087593;
                        c18090 = c18090;
                        c192713 = c192710;
                        c3549 = c3546;
                        i25 = i25;
                        i23 = i11;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        c10132 = c10132;
                        str = str;
                        c192712 = null;
                        i21 = i27;
                        c8919 = c8918;
                    }
                    break;
                case -1815726330:
                case 1543547693:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    C22933 c22936 = c22935;
                    c10132 = c10132;
                    i11 = i23;
                    C19277 c192715 = c192712;
                    c192710 = c192713;
                    c15208 = c15208;
                    c3546 = c3549;
                    AbstractC15440 abstractC15440M2577 = C0630.m2577(abstractC15442);
                    this.f22215 = abstractC15440M2577;
                    if (C1294.f4556 < 0) {
                        int iM25612 = (C0630.m2566("ܺۚ") ^ i19) * (-31);
                        int i28 = ((iM25612 ^ i20) * (-13979)) ^ (-1031340311);
                        i24 = iM25612 ^ 555661544;
                        c8919 = c8918;
                        abstractC15443 = abstractC15440M2577;
                        c192713 = c192710;
                        c192712 = c192715;
                        c3549 = c3546;
                        c22935 = c22936;
                        i23 = i11;
                        i21 = i28;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        c18090 = c18090;
                        i25 = i25;
                        str = str;
                    } else {
                        abstractC15443 = abstractC15440M2577;
                        c22935 = c22936;
                        arrayList3 = arrayList3;
                        int iM6989 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                        int i29 = ((iM6989 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM6989 ^ 1569087593;
                        c18090 = c18090;
                        c192713 = c192710;
                        c3549 = c3546;
                        i25 = i25;
                        i23 = i11;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        c10132 = c10132;
                        str = str;
                        c192712 = null;
                        i21 = i29;
                        c8919 = c8918;
                    }
                    break;
                case -1779910336:
                case 1232183150:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    c22933 = c22935;
                    c10132 = c10132;
                    i11 = i23;
                    c192711 = c192712;
                    i25 = 1;
                    c15208 = c15208;
                    c3546 = c3549;
                    int iM69810 = (C2105.m6981("ۡ֫") + i20) * (-21);
                    i24 = iM69810 ^ 665384988;
                    c192712 = c192711;
                    c3549 = c3546;
                    i21 = ((iM69810 ^ i19) * (-3239)) ^ 103322131;
                    c22935 = c22933;
                    i23 = i11;
                    c15208 = c15208;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    c10132 = c10132;
                    str = str;
                    break;
                case -1615650749:
                case 1155764866:
                    C5695.m16016(c8919, c3549, c18090);
                    iM2566 = C2105.m6981("ۛۜ") ^ i20;
                    i = ((iM2566 ^ i19) * 27337) ^ 616910105;
                    i2 = 498299897;
                    i24 = iM2566 ^ i2;
                    i21 = i;
                    c15208 = c15208;
                    i22 = i26;
                    c10132 = c10132;
                    break;
                case -1596655286:
                case 74554204:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = (C3545) RunnableC1108.m3791(itM9029);
                    if (!C4159.m12572(this.f22210)) {
                        int iM69811 = C2105.m6981("ۜᩴ") ^ i20;
                        i24 = iM69811 ^ 1444133401;
                        c192713 = c192713;
                        i21 = ((iM69811 ^ i19) * 777) ^ (-191252034);
                        i25 = i25;
                        c22935 = c22935;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        str = str;
                    } else {
                        i23 = i23;
                        c19277 = c192712;
                        int iM25613 = C0630.m2566("ۚۙ") ^ i20;
                        i12 = ((iM25613 ^ i19) * (-8815)) ^ (-911479505);
                        i24 = iM25613 ^ 645831923;
                        c192713 = c192713;
                        c192712 = c19277;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i12;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        i25 = i25;
                        str = str;
                    }
                    break;
                case -1543168736:
                case 1853785507:
                    i14 = i26;
                    bArr = bArrM25444;
                    arrayList2 = arrayList3;
                    i15 = i25;
                    c3547 = c3549;
                    c22934 = c22935;
                    c10131 = c10132;
                    C15206 c15206M6560 = AbstractC2021.m6560(inputStreamM11163);
                    c15206M6560.m35983(c12534, this.f22208, this.f22215);
                    strM35992 = c15206M6560.m35992();
                    if (strM35992 != null) {
                        int iM25614 = (i20 - C0630.m2566("᩶᩵")) * 27;
                        i24 = iM25614 ^ 1231994600;
                        c3549 = c3547;
                        c22935 = c22934;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c10132 = c10131;
                        c15208 = c15206M6560;
                        i21 = ((iM25614 ^ i19) * (-13713)) ^ (-1386374746);
                        i25 = i15;
                    } else {
                        c15207 = c15206M6560;
                        int iM69812 = C2105.m6981("ۢۢ") ^ i19;
                        i24 = iM69812 ^ (-649914222);
                        c3549 = c3547;
                        i25 = i15;
                        c22935 = c22934;
                        i21 = ((iM69812 ^ i20) * (-26035)) ^ 948684771;
                        c15208 = c15207;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c10132 = c10131;
                    }
                    str = strM35992;
                    bArrM25444 = bArr;
                    break;
                case -1518821091:
                case -1415416244:
                    C0964.m3413();
                    i26 = i26;
                    if (C1047.m3599() < 0) {
                        bArrM25444 = bArrM25444;
                        str = str;
                        i25 = i25;
                        c22933 = c22935;
                        abstractC15441 = abstractC15443;
                        c10132 = c10132;
                        i11 = i23;
                        c192711 = c192712;
                        c192710 = c192713;
                        c15208 = c15208;
                        c3546 = c3549;
                        int iM69813 = C2105.m6981("۫ۗ") ^ i19;
                        i24 = iM69813 ^ 277737068;
                        c192713 = c192710;
                        c192712 = c192711;
                        c22935 = c22933;
                        i23 = i11;
                        abstractC15443 = abstractC15441;
                        i21 = ((iM69813 ^ i20) * 8899) ^ (-673052803);
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c12534 = null;
                        c3549 = c3546;
                        i25 = i25;
                        c15208 = c15208;
                        c10132 = c10132;
                        str = str;
                    } else {
                        iM6982 = (C0630.m2566("۫֨") + i19) * (-5);
                        i17 = ((iM6982 ^ i20) * 31379) ^ 1119065148;
                        i18 = 983842194;
                        i24 = iM6982 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    }
                    break;
                case -1474866183:
                case -268751559:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c15208 = c15208;
                    c3549 = c3549;
                    if (C7106.m19111(c3548) < 2097152) {
                        iM2568 = C0630.m2566("ۢᩴ") ^ i20;
                        i6 = ((iM2568 ^ i19) * (-6349)) ^ (-56142990);
                        i7 = -1364603230;
                        i24 = iM2568 ^ i7;
                        i21 = i6;
                        c3549 = c3549;
                        i25 = i25;
                        c22935 = c22935;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        str = str;
                    } else {
                        i23 = i23;
                        c19277 = c192712;
                        c192713 = c192713;
                        iM2567 = (C0630.m2566("᩸ۙ") + i20) * (-63);
                        i3 = ((iM2567 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                        i24 = iM2567 ^ i4;
                        c192713 = c192713;
                        c192712 = c19277;
                        i25 = i25;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        str = str;
                        c3549 = c3549;
                        c15208 = c15208;
                        c10132 = c10132;
                    }
                    break;
                case -1454320666:
                case -1355996856:
                    i26 = i26;
                    if (C1294.f4556 >= 0) {
                        bArrM25444 = bArrM25444;
                        str = str;
                        i25 = i25;
                        c10132 = c10132;
                        i11 = i23;
                        c192710 = c192713;
                        c15208 = c15208;
                        c3546 = c3549;
                        int iM69814 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                        int i210 = ((iM69814 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM69814 ^ 1569087593;
                        c18090 = c18090;
                        c192713 = c192710;
                        c3549 = c3546;
                        i25 = i25;
                        i23 = i11;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        c10132 = c10132;
                        str = str;
                        c192712 = null;
                        i21 = i210;
                        c8919 = c8918;
                    } else {
                        iM6982 = C0630.m2566("᩹ۗ") ^ i20;
                        i17 = ((iM6982 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM6982 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    }
                    break;
                case -1451643971:
                case -1319877544:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = c3549;
                    this.f22210.m51040(C3746.m11363(c3548));
                    i23 = i23;
                    c19277 = c192712;
                    RunnableC3474.m10624(c19277, i23);
                    if (RunnableC1108.m3794(c3548)) {
                        iM2567 = (C0630.m2566("᩸ۙ") + i20) * (-63);
                        i3 = ((iM2567 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                    } else {
                        iM2567 = C0630.m2566("ܳۢ") ^ i19;
                        i3 = ((iM2567 ^ i20) * 21439) ^ (-1102513929);
                        i4 = -1776968636;
                    }
                    i24 = iM2567 ^ i4;
                    c192713 = c192713;
                    c192712 = c19277;
                    i25 = i25;
                    c22935 = c22935;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    str = str;
                    c3549 = c3549;
                    c15208 = c15208;
                    c10132 = c10132;
                    break;
                case -1440776915:
                case -734896983:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c15208 = c15208;
                    c3549 = c3549;
                    c22935.m51040(strM11363);
                    inputStreamM11163 = C3663.m11163(c18090, c3549);
                    if (C7811.f24123 >= 0) {
                        iM2568 = C2105.m6981("ܶۘ") ^ i19;
                        i6 = ((iM2568 ^ i20) * (-4331)) ^ (-583754074);
                        i7 = 1455681861;
                    } else {
                        iM2568 = (C0630.m2566("᩵ᩳ") + i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM2568 ^ i19) * 11723) ^ (-980648665);
                        i7 = 1318409865;
                    }
                    i24 = iM2568 ^ i7;
                    i21 = i6;
                    c3549 = c3549;
                    i25 = i25;
                    c22935 = c22935;
                    c15208 = c15208;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    c10132 = c10132;
                    str = str;
                    break;
                case -1417022309:
                case -1267368323:
                    i26 = i26;
                    if (C3245.f10203 > 0) {
                        bArrM25444 = bArrM25444;
                        str = str;
                        i25 = i25;
                        abstractC15441 = abstractC15443;
                        c10132 = c10132;
                        i11 = i23;
                        c15208 = c15208;
                        c3546 = c3549;
                        arrayList = arrayList3;
                        c22933 = c22935;
                        int iM25615 = (C0630.m2566("᩵֨") + i19) * (-125);
                        i21 = 1937582279 ^ ((iM25615 ^ i20) * (-7149));
                        i24 = iM25615 ^ 525810989;
                        c18090 = c18090;
                        c8919 = c8918;
                        c22935 = c22933;
                        i23 = i11;
                        abstractC15443 = abstractC15441;
                        arrayList3 = arrayList;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        c3549 = c3546;
                        i25 = i25;
                        c15208 = c15208;
                        c10132 = c10132;
                        str = str;
                    } else {
                        iM6982 = C0630.m2566("᩹ۗ") ^ i20;
                        i17 = ((iM6982 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM6982 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    }
                    break;
                case -1373284844:
                case 914748938:
                    return;
                case -1094657483:
                case 1696051133:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c19277 = c192712;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = c3549;
                    i23 = 1;
                    if (C1773.m5910(itM50611)) {
                        iM6981 = C0630.m2566("۠ۨ") ^ i19;
                        i12 = ((iM6981 ^ i20) * (-13005)) ^ (-1639934628);
                        i13 = 712323191;
                    } else {
                        iM6981 = C2105.m6981("ᩴۛ") ^ i20;
                        i12 = ((iM6981 ^ i19) * (-26273)) ^ 1606248144;
                        i13 = -907472294;
                    }
                    i24 = iM6981 ^ i13;
                    c192713 = c192713;
                    c192712 = c19277;
                    c3549 = c3549;
                    c22935 = c22935;
                    i21 = i12;
                    c15208 = c15208;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    c10132 = c10132;
                    i25 = i25;
                    str = str;
                    break;
                case -1047358173:
                case -81904482:
                    i26 = i26;
                    c10132 = c10132;
                    c19277 = c192712;
                    c15208 = c15208;
                    C3911.m11929(c19277, new InterfaceC2343() { // from class: l.ۨۙܽ
                        @Override // l.InterfaceC2343
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6264(int i30) {
                            C7245 c7245 = null;
                            C22933 c22937 = null;
                            int i31 = -721792407;
                            int i32 = AbstractC2021.f6743;
                            int i33 = C0483.f2088;
                            int iM25616 = (C0630.m2566("ۖܺ") ^ i33) * (-51);
                            int i34 = ((iM25616 ^ i32) * 21585) ^ (-1262107764);
                            int i35 = -1251325270;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-14841)) >> 31) & i34) ^ (iM25616 ^ i35);
                                switch (i31) {
                                    case -2073446362:
                                    case 2114660746:
                                        c22937 = c7245.f22210;
                                        if (RunnableC1108.f4040) {
                                            iM25616 = (C2105.m6981("֡ۛ") + i32) * (-49);
                                            i34 = ((iM25616 ^ i33) * 16789) ^ (-600591449);
                                            i35 = 702215151;
                                        } else {
                                            iM25616 = (C0630.m2566("֨ᩴ") ^ i33) * (-51);
                                            i34 = ((iM25616 ^ i32) * 3561) ^ (-1767411246);
                                            i35 = 1460066142;
                                        }
                                        break;
                                    case -1979372998:
                                    case 78782394:
                                        AbstractC2021.m6574();
                                        if (C3245.f10203 <= 0) {
                                            iM25616 = C0630.m2566("ܶۖ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        } else {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        }
                                        break;
                                    case -1706518842:
                                    case 2077035421:
                                        if (C7106.m19120() <= 0) {
                                            iM25616 = (C0630.m2566("֨ᩴ") ^ i33) * (-51);
                                            i34 = ((iM25616 ^ i32) * 3561) ^ (-1767411246);
                                            i35 = 1460066142;
                                        } else {
                                            iM25616 = C2105.m6981("᩵ۗ") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 27517) ^ (-1018898669);
                                            i35 = -747104048;
                                        }
                                        break;
                                    case -1703821001:
                                    case -180042543:
                                        C1916.m6308();
                                        C0964.m3413();
                                        break;
                                    case -1611606404:
                                    case 328979420:
                                        if (ServiceConnectionC3453.m10564() <= 0) {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM25616 = C0630.m2566("᩶᩺") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-26151)) ^ 840450559;
                                            i35 = -857647231;
                                        }
                                        break;
                                    case -1596027476:
                                    case -63400443:
                                        if (C1773.f6144 <= 0) {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM25616 = C2105.m6981("ۚۜ") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 16571) ^ 694300571;
                                            i35 = -153127979;
                                        }
                                        break;
                                    case -1382714484:
                                    case 1566216326:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM25616 = C2105.m6981("ۜ۬") ^ i33;
                                            i34 = ((iM25616 ^ i32) * (-19469)) ^ (-923177217);
                                            i35 = -1936957445;
                                        }
                                        break;
                                    case -1343094747:
                                    case 1048619921:
                                        if (RunnableC1108.m3790()) {
                                            iM25616 = C0630.m2566("ܶۖ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        } else {
                                            iM25616 = C0630.m2566("ܳᩳ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-23429)) ^ 1033440362;
                                            i35 = 200337061;
                                        }
                                        break;
                                    case -1218751815:
                                    case 704446100:
                                        if (C7106.f21815 != 0) {
                                            iM25616 = C2105.m6981("ᩳܶ") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM25616 = C0630.m2566("ᩴ۫") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 25557) ^ (-1427291485);
                                            i35 = -860111064;
                                        }
                                        break;
                                    case -868705881:
                                    case 1404031592:
                                        if (C0964.m3413()) {
                                            iM25616 = C0630.m2566("ۖܽ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-31025)) ^ (-1234987872);
                                            i35 = -160114424;
                                        } else {
                                            iM25616 = C0630.m2566("ܶۖ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        }
                                        break;
                                    case -589168995:
                                    case 391847695:
                                        C1504.m5179();
                                        if (C0237.m1481() < 0) {
                                            iM25616 = C2105.m6981("ᩳܶ") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        }
                                        break;
                                    case -254512101:
                                    case 1818950004:
                                        C4263.m12819();
                                        iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                        i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                        i35 = -858025016;
                                        break;
                                    case -94351944:
                                    case 207123921:
                                        if (C2958.f9394 >= 0) {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM25616 = C0630.m2566("ܽ۬") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-30179)) ^ 1154248251;
                                            i35 = 1889523167;
                                        }
                                        break;
                                    case 641056019:
                                    case 862019675:
                                        c7245 = this.f34286;
                                        if (C2105.m6982() != 0) {
                                            iM25616 = C2105.m6981("ᩳܶ") ^ i33;
                                            i34 = ((iM25616 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM25616 = C2105.m6981("ۨ᩹") ^ i33;
                                            i34 = ((iM25616 ^ i32) * (-28775)) ^ 1572576133;
                                            i35 = 1531584180;
                                        }
                                        break;
                                    case 997959310:
                                    case 1255928394:
                                        if (C0798.m2998() != 0) {
                                            iM25616 = C2105.m6981("۬ۨ") ^ i32;
                                            i34 = ((iM25616 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM25616 = C2105.m6981("ۙ֨") ^ i33;
                                            i34 = ((iM25616 ^ i32) * (-22355)) ^ 1171369580;
                                            i35 = 804781047;
                                        }
                                        break;
                                    default:
                                        c22937.m51045(i30 / 2);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    itM50611 = C22628.m50611(C7811.m20845(c18090));
                    iM2567 = C2105.m6981("֫ܳ") ^ i19;
                    i3 = ((iM2567 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM2567 ^ i4;
                    c192713 = c192713;
                    c192712 = c19277;
                    i25 = i25;
                    c22935 = c22935;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    str = str;
                    c3549 = c3549;
                    c15208 = c15208;
                    c10132 = c10132;
                    break;
                case -1032743033:
                case 1891959609:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    i23 = i23;
                    c19277 = c192712;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = c3549;
                    c3548 = (C3545) RunnableC1108.m3791(itM50611);
                    if (!C4159.m12572(this.f22210)) {
                        iM2567 = (i19 - C0630.m2566("ܰۘ")) * q.h;
                        i3 = ((iM2567 ^ i20) * (-463)) ^ 2038139003;
                        i4 = -292742757;
                        i24 = iM2567 ^ i4;
                        c192713 = c192713;
                        c192712 = c19277;
                        i25 = i25;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        str = str;
                        c3549 = c3549;
                        c15208 = c15208;
                        c10132 = c10132;
                    } else {
                        i23 = i23;
                        iM6981 = C2105.m6981("ᩴۛ") ^ i20;
                        i12 = ((iM6981 ^ i19) * (-26273)) ^ 1606248144;
                        i13 = -907472294;
                        i24 = iM6981 ^ i13;
                        c192713 = c192713;
                        c192712 = c19277;
                        c3549 = c3549;
                        c22935 = c22935;
                        i21 = i12;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        i25 = i25;
                        str = str;
                    }
                    break;
                case -963563319:
                case -136483830:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    i23 = i23;
                    c19277 = c192712;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = c3549;
                    if (!C0483.m2123(itM9029)) {
                        c3549 = c3549;
                        int iM25616 = C0630.m2566("ۚۙ") ^ i20;
                        i12 = ((iM25616 ^ i19) * (-8815)) ^ (-911479505);
                        i24 = iM25616 ^ 645831923;
                        c192713 = c192713;
                        c192712 = c19277;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i12;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        i25 = i25;
                        str = str;
                    } else {
                        iM2567 = C2105.m6981("ۡܺ") ^ i19;
                        i3 = ((iM2567 ^ i20) * 23167) ^ (-397482865);
                        i4 = 1589749859;
                        i24 = iM2567 ^ i4;
                        c192713 = c192713;
                        c192712 = c19277;
                        i25 = i25;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        str = str;
                        c3549 = c3549;
                        c15208 = c15208;
                        c10132 = c10132;
                    }
                    break;
                case -914576839:
                case 867714727:
                    i26 = i26;
                    C3683.m11222();
                    if (C7811.f24123 < 0) {
                        iM6982 = C0630.m2566("᩹ۗ") ^ i20;
                        i17 = ((iM6982 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                    } else {
                        iM6982 = (i20 - C2105.m6981("ۜ۟")) * (-77);
                        i17 = ((iM6982 ^ i19) * 15971) ^ (-863832003);
                        i18 = 1219024402;
                    }
                    i24 = iM6982 ^ i18;
                    i21 = i17;
                    i22 = i26;
                    break;
                case -898537986:
                case 653406376:
                    i26 = i26;
                    c10132 = c10132;
                    c15208 = c15208;
                    try {
                        c4624.m13574(RunnableC3474.m10620(C3663.m11163(c18090, c3548)).m35986(c12534));
                        C1916.m6307(arrayList3, c3548);
                        c10132 = c10132;
                        c19277 = c192712;
                        iM2567 = C2105.m6981("֫ܳ") ^ i19;
                        i3 = ((iM2567 ^ i20) * 15321) ^ (-655037554);
                        i4 = -462388325;
                        i24 = iM2567 ^ i4;
                        c192713 = c192713;
                        c192712 = c19277;
                        i25 = i25;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        str = str;
                        c3549 = c3549;
                        c15208 = c15208;
                        c10132 = c10132;
                    } catch (Throwable unused3) {
                        iM2566 = C0630.m2566("۫۟") ^ i19;
                        i = ((iM2566 ^ i20) * (-13721)) ^ 1351817127;
                        i2 = 1670007132;
                        i24 = iM2566 ^ i2;
                        i21 = i;
                        c15208 = c15208;
                        i22 = i26;
                        c10132 = c10132;
                    }
                    break;
                case -861563635:
                case -458016043:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    c10132 = c10132;
                    c192713 = c192713;
                    c15208 = c15208;
                    c3549 = c3549;
                    if (C1916.m6296(c3548) <= 10) {
                        i23 = i23;
                        c19277 = c192712;
                        iM2567 = (C0630.m2566("᩸ۙ") + i20) * (-63);
                        i3 = ((iM2567 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                        i24 = iM2567 ^ i4;
                        c192713 = c192713;
                        c192712 = c19277;
                        i25 = i25;
                        c22935 = c22935;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        str = str;
                        c3549 = c3549;
                        c15208 = c15208;
                        c10132 = c10132;
                    } else {
                        int iM69815 = (C2105.m6981("ۙᩳ") ^ i19) * 71;
                        i5 = ((iM69815 ^ i20) * (-18519)) ^ 767086172;
                        i24 = iM69815 ^ (-919887395);
                        c192713 = c192713;
                        c3549 = c3549;
                        i25 = i25;
                        c22935 = c22935;
                        i21 = i5;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        str = str;
                    }
                    break;
                case -710118956:
                case 2308739:
                    i26 = i26;
                    AbstractC2021.m6574();
                    if (C4616.f14690 <= 0) {
                        bArrM25444 = bArrM25444;
                        str = str;
                        arrayList3 = arrayList3;
                        i25 = i25;
                        c22935 = c22935;
                        abstractC15440 = abstractC15443;
                        c10130 = c10132;
                        i8 = i23;
                        c19278 = c192712;
                        c19279 = c192713;
                        c15206 = c15208;
                        c3545 = c3549;
                        iM2569 = C2105.m6981("ܺۨ") ^ i20;
                        i9 = ((iM2569 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                        i24 = iM2569 ^ i10;
                        c192713 = c19279;
                        c192712 = c19278;
                        c3549 = c3545;
                        c22935 = c22935;
                        i23 = i8;
                        abstractC15443 = abstractC15440;
                        c15208 = c15206;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10130;
                        i21 = i9;
                        i25 = i25;
                        str = str;
                        c8919 = c8918;
                    }
                    bArrM25444 = bArrM25444;
                    str = str;
                    i25 = i25;
                    c10132 = c10132;
                    i11 = i23;
                    c192710 = c192713;
                    c15208 = c15208;
                    c3546 = c3549;
                    int iM69816 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                    int i211 = ((iM69816 ^ i20) * (-3705)) ^ 1347918432;
                    i24 = iM69816 ^ 1569087593;
                    c18090 = c18090;
                    c192713 = c192710;
                    c3549 = c3546;
                    i25 = i25;
                    i23 = i11;
                    c15208 = c15208;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    c10132 = c10132;
                    str = str;
                    c192712 = null;
                    i21 = i211;
                    c8919 = c8918;
                    break;
                case -565689127:
                case 27906769:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c10132 = c10132;
                    c192710 = c192713;
                    c15208 = c15208;
                    c3546 = c3549;
                    AbstractC2021.m6564(c192710, i25);
                    C22933 c22937 = this.f22210;
                    strM11363 = C3746.m11363(c3546);
                    if (RunnableC1937.f6483 < 0) {
                        int iM69817 = (i19 - C2105.m6981("֨ܽ")) * (-13);
                        i5 = ((iM69817 ^ i20) * (-20907)) ^ 1123936563;
                        i24 = iM69817 ^ (-820878802);
                        c192713 = c192710;
                        c22935 = c22937;
                        c3549 = c3546;
                        i25 = i25;
                        i21 = i5;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        str = str;
                    } else {
                        c22935 = c22937;
                        i11 = i23;
                        arrayList3 = arrayList3;
                        int iM69818 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                        int i212 = ((iM69818 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM69818 ^ 1569087593;
                        c18090 = c18090;
                        c192713 = c192710;
                        c3549 = c3546;
                        i25 = i25;
                        i23 = i11;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        c10132 = c10132;
                        str = str;
                        c192712 = null;
                        i21 = i212;
                        c8919 = c8918;
                    }
                    break;
                case -105429352:
                case 861332056:
                    throw new C1559(C1128.m3840(c3549), str, str2);
                case 10035607:
                case 618324215:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    abstractC15440 = abstractC15443;
                    c10130 = c10132;
                    i8 = i23;
                    c19278 = c192712;
                    c19279 = c192713;
                    c15206 = c15208;
                    c3545 = c3549;
                    abstractC15442 = C16293.f50111;
                    if (C2167.f7158 >= 0) {
                        iM2569 = C2105.m6981("ܺۨ") ^ i20;
                        i9 = ((iM2569 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                    } else {
                        iM2569 = C0630.m2566("ܽ᩵") ^ i20;
                        i9 = ((iM2569 ^ i19) * 24909) ^ (-1299688667);
                        i10 = -732217299;
                    }
                    i24 = iM2569 ^ i10;
                    c192713 = c19279;
                    c192712 = c19278;
                    c3549 = c3545;
                    c22935 = c22935;
                    i23 = i8;
                    abstractC15443 = abstractC15440;
                    c15208 = c15206;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    c10132 = c10130;
                    i21 = i9;
                    i25 = i25;
                    str = str;
                    c8919 = c8918;
                    break;
                case 208926817:
                case 1642542699:
                    RunnableC3474.m10630();
                    if (C2105.f7037 == 0) {
                        i26 = i26;
                        iM6982 = C0630.m2566("᩹ۗ") ^ i20;
                        i17 = ((iM6982 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM6982 ^ i18;
                        i21 = i17;
                    } else {
                        int iM69819 = C2105.m6981("ۖ֨") ^ i20;
                        i26 = i26;
                        i21 = ((iM69819 ^ i19) * (-14355)) ^ (-1710655166);
                        i24 = iM69819 ^ 1904777632;
                    }
                    i22 = i26;
                    break;
                case 212182262:
                case 242996198:
                    C0422.m1963();
                    return;
                case 557275471:
                case 1597867363:
                    C15206 c15209 = c15208;
                    C10130 c10134 = new C10130();
                    int iM69820 = (C2105.m6981("᩸ܳ") ^ i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i16 = ((iM69820 ^ i20) * (-21573)) ^ 125585927;
                    i24 = iM69820 ^ (-139251086);
                    c15208 = c15209;
                    i22 = i26;
                    c10132 = c10134;
                    i21 = i16;
                    break;
                case 632318990:
                case 681635217:
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    i25 = i25;
                    c22933 = c22935;
                    c10132 = c10132;
                    i11 = i23;
                    c192711 = c192712;
                    c192710 = c192713;
                    c15208 = c15208;
                    c3546 = c3549;
                    abstractC15441 = abstractC15443;
                    c4624 = new C4624(abstractC15441);
                    if (C0050.f910 < 0) {
                        c12534 = new C12534(c18090);
                        if (RunnableC3474.f10992 > 0) {
                            arrayList = new ArrayList();
                            int iM42207 = c18090.m42207();
                            if (C1047.f3863 < 0) {
                                C19277 c192716 = new C19277(iM42207);
                                if (!C0964.m3413()) {
                                    c192713 = c192710;
                                    c192712 = c192716;
                                    int iM25617 = (C0630.m2566("᩵֨") + i19) * (-125);
                                    i21 = 1937582279 ^ ((iM25617 ^ i20) * (-7149));
                                    i24 = iM25617 ^ 525810989;
                                    c18090 = c18090;
                                    c8919 = c8918;
                                    c22935 = c22933;
                                    i23 = i11;
                                    abstractC15443 = abstractC15441;
                                    arrayList3 = arrayList;
                                    i22 = i26;
                                    bArrM25444 = bArrM25444;
                                    c3549 = c3546;
                                    i25 = i25;
                                    c15208 = c15208;
                                    c10132 = c10132;
                                    str = str;
                                } else {
                                    int iM69821 = (i20 - C2105.m6981("ۛۛ")) * (-61);
                                    i24 = iM69821 ^ 2040478198;
                                    c192713 = c192710;
                                    c192712 = c192716;
                                    c22935 = c22933;
                                    i23 = i11;
                                    abstractC15443 = abstractC15441;
                                    arrayList3 = arrayList;
                                    i22 = i26;
                                    bArrM25444 = bArrM25444;
                                    i21 = ((iM69821 ^ i19) * 26825) ^ 1021257635;
                                    c3549 = c3546;
                                    i25 = i25;
                                    c15208 = c15208;
                                    c10132 = c10132;
                                    str = str;
                                    c8919 = c8918;
                                }
                            } else {
                                c22935 = c22933;
                                abstractC15443 = abstractC15441;
                                arrayList3 = arrayList;
                                int iM698110 = (C2105.m6981("ۤ᩺") ^ i19) * (-87);
                                int i213 = ((iM698110 ^ i20) * (-3705)) ^ 1347918432;
                                i24 = iM698110 ^ 1569087593;
                                c18090 = c18090;
                                c192713 = c192710;
                                c3549 = c3546;
                                i25 = i25;
                                i23 = i11;
                                c15208 = c15208;
                                i22 = i26;
                                bArrM25444 = bArrM25444;
                                c10132 = c10132;
                                str = str;
                                c192712 = null;
                                i21 = i213;
                                c8919 = c8918;
                            }
                        } else {
                            int iM69822 = (C2105.m6981("ۛ۠") + i20) * (-15);
                            i24 = iM69822 ^ (-1478117264);
                            c192712 = c192711;
                            c22935 = c22933;
                            i23 = i11;
                            abstractC15443 = abstractC15441;
                            i21 = ((iM69822 ^ i19) * 22475) ^ (-2051013048);
                            i22 = i26;
                            bArrM25444 = bArrM25444;
                            arrayList3 = null;
                            c192713 = null;
                            c3549 = c3546;
                            i25 = i25;
                            c15208 = c15208;
                            c10132 = c10132;
                            str = str;
                        }
                    } else {
                        int iM698111 = C2105.m6981("۫ۗ") ^ i19;
                        i24 = iM698111 ^ 277737068;
                        c192713 = c192710;
                        c192712 = c192711;
                        c22935 = c22933;
                        i23 = i11;
                        abstractC15443 = abstractC15441;
                        i21 = ((iM698111 ^ i20) * 8899) ^ (-673052803);
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c12534 = null;
                        c3549 = c3546;
                        i25 = i25;
                        c15208 = c15208;
                        c10132 = c10132;
                        str = str;
                    }
                    break;
                case 715630255:
                case 960133966:
                    i26 = i26;
                    C2520.m8025(c8919, c3548, c18090);
                    c10132 = c10132;
                    c19277 = c192712;
                    c15208 = c15208;
                    iM2567 = C2105.m6981("֫ܳ") ^ i19;
                    i3 = ((iM2567 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM2567 ^ i4;
                    c192713 = c192713;
                    c192712 = c19277;
                    i25 = i25;
                    c22935 = c22935;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    str = str;
                    c3549 = c3549;
                    c15208 = c15208;
                    c10132 = c10132;
                    break;
                case 1092984067:
                case 2052591259:
                    bArrM25444 = c10132.m25444();
                    int iM25618 = (i19 - C0630.m2566("ܶܰ")) * 61;
                    i24 = iM25618 ^ 271085950;
                    c3549 = c3549;
                    i25 = i25;
                    c22935 = c22935;
                    i21 = ((iM25618 ^ i20) * (-15039)) ^ 820419246;
                    c15208 = c15208;
                    i22 = i26;
                    arrayList3 = arrayList3;
                    c10132 = c10132;
                    str = str;
                    break;
                case 1169568737:
                case 1940077497:
                    i26 = i26;
                    C4616.m13552();
                    C0050.m940();
                    iM6982 = C0630.m2566("᩹ۗ") ^ i20;
                    i17 = ((iM6982 ^ i19) * (-26419)) ^ 1457324912;
                    i18 = -2063757744;
                    i24 = iM6982 ^ i18;
                    i21 = i17;
                    i22 = i26;
                    break;
                case 1245568102:
                case 2114058221:
                    C1047.m3599();
                    i26 = i26;
                    bArrM25444 = bArrM25444;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c22935 = c22935;
                    if (C3019.f9544 >= 0) {
                        c10132 = c10132;
                        c15208 = c15208;
                        c3549 = c3549;
                        iM2568 = C2105.m6981("ܶۘ") ^ i19;
                        i6 = ((iM2568 ^ i20) * (-4331)) ^ (-583754074);
                        i7 = 1455681861;
                        i24 = iM2568 ^ i7;
                        i21 = i6;
                        c3549 = c3549;
                        i25 = i25;
                        c22935 = c22935;
                        c15208 = c15208;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10132;
                        str = str;
                    } else {
                        abstractC15440 = abstractC15443;
                        c10130 = c10132;
                        i8 = i23;
                        c19278 = c192712;
                        c19279 = c192713;
                        c15206 = c15208;
                        c3545 = c3549;
                        iM2569 = C2105.m6981("ܺۨ") ^ i20;
                        i9 = ((iM2569 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                        i24 = iM2569 ^ i10;
                        c192713 = c19279;
                        c192712 = c19278;
                        c3549 = c3545;
                        c22935 = c22935;
                        i23 = i8;
                        abstractC15443 = abstractC15440;
                        c15208 = c15206;
                        i22 = i26;
                        bArrM25444 = bArrM25444;
                        arrayList3 = arrayList3;
                        c10132 = c10130;
                        i21 = i9;
                        i25 = i25;
                        str = str;
                        c8919 = c8918;
                    }
                    break;
                default:
                    i26 = i26;
                    c10132 = c10132;
                    c15208 = c15208;
                    C2520.m8025(c8919, c3548, c18090);
                    c19277 = c192712;
                    iM2567 = C2105.m6981("֫ܳ") ^ i19;
                    i3 = ((iM2567 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM2567 ^ i4;
                    c192713 = c192713;
                    c192712 = c19277;
                    i25 = i25;
                    c22935 = c22935;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM25444 = bArrM25444;
                    arrayList3 = arrayList3;
                    str = str;
                    c3549 = c3549;
                    c15208 = c15208;
                    c10132 = c10132;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0149 A[PHI: r8 r9 r11
      0x0149: PHI (r8v3 java.lang.Object[]) = (r8v2 java.lang.Object[]), (r8v1 java.lang.Object[]), (r8v1 java.lang.Object[]), (r8v1 java.lang.Object[]) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r9v3 boolean) = (r9v2 boolean), (r9v1 boolean), (r9v1 boolean), (r9v1 boolean) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v3 java.lang.String), (r11v1 java.lang.String), (r11v1 java.lang.String) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        C22108 c22108;
        C7245 c7245 = this;
        Main mainM50612 = null;
        int i4 = 0;
        Integer numM4916 = null;
        Integer numM4917 = null;
        int i5 = 0;
        Object[] objArr = null;
        boolean z = false;
        String strM9924 = null;
        String strM6311 = null;
        int i6 = -125773939;
        int i7 = C1420.f5096;
        int i8 = C0630.f2410;
        int iM2568 = (C0630.m2566("ۧۙ") + i8) * 45;
        int i9 = ((iM2568 ^ i7) * (-19841)) ^ (-655148266);
        int i10 = iM2568 ^ (-354757322);
        C22108 c22109 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        ViewOnClickListenerC10732 viewOnClickListenerC10732 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-12989)) >> 31));
            switch (i6) {
                case -1710727480:
                case -734975883:
                    numM4916 = C1420.m4916(i4);
                    C22108 c221010 = c22109;
                    numM4917 = C1420.m4916(c221010.f71772);
                    if (RunnableC3474.f10992 <= 0) {
                        c22109 = c221010;
                        i5 = 2;
                        int iM6981 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6981 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6981 ^ (-342244);
                        c7245 = this;
                    } else {
                        int iM2569 = (i8 - C0630.m2566("᩹ۘ")) * (-67);
                        i10 = iM2569 ^ (-1993721523);
                        c22109 = c221010;
                        i9 = ((iM2569 ^ i7) * (-18691)) ^ 1393429175;
                        i5 = 2;
                    }
                    break;
                case -1657801584:
                case 1381220235:
                    strM6311 = C1916.m6311(f22200, 4, 3, i11);
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ܿܶ") + i7) * (-27);
                        i = ((iM2566 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM2566 = (C2105.m6981("ܽۘ") ^ i8) * 13;
                        i = ((iM2566 ^ i7) * 235) ^ (-1249774507);
                        i2 = 788998250;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1610902851:
                case -148486430:
                    if (AbstractC2021.f6743 > 0) {
                        int iM6982 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6982 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6982 ^ (-342244);
                    } else {
                        c22108 = c22109;
                        int iM25610 = C0630.m2566("᩸ۜ") ^ i7;
                        i10 = iM25610 ^ (-167342746);
                        i9 = ((iM25610 ^ i8) * 20017) ^ (-766021886);
                        c22109 = c22108;
                    }
                    c7245 = this;
                    break;
                case -1519552702:
                case -1244697194:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۘۖ") ^ i8;
                        i = ((iM2566 ^ i7) * 7429) ^ 722257268;
                        i2 = 482640251;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int iM6983 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6983 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6983 ^ (-342244);
                        c7245 = this;
                    }
                    break;
                case -1242085837:
                case 1754419529:
                    mainM50612.m10218(C0630.m2566(strM6311) ^ 2121184182, strM9924, z);
                    if (C1294.f4556 >= 0) {
                        iM2566 = (C2105.m6981("ܿܶ") + i7) * (-27);
                        i = ((iM2566 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM2566 = (i8 - C0630.m2566("֨᩺")) * (-11);
                        i = ((iM2566 ^ i7) * (-16323)) ^ (-794636796);
                        i2 = -532006585;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1223934900:
                case 463090958:
                    c22109 = c22109;
                    sArr = f22200;
                    c = 0;
                    if (C11340.f33930 >= 0) {
                        iM2567 = C0630.m2566("᩺᩹") ^ i8;
                        i9 = ((iM2567 ^ i7) * (-10557)) ^ 300505048;
                        i3 = -985124156;
                    } else {
                        iM2567 = C0630.m2566("ۜ֡") ^ i7;
                        i9 = ((iM2567 ^ i8) * (-23105)) ^ (-864934403);
                        i3 = -1391870568;
                    }
                    i10 = iM2567 ^ i3;
                    c7245 = this;
                    c22109 = c22109;
                    break;
                case -1137661420:
                case -670128832:
                    C1128.m3851();
                    break;
                case -1049378670:
                case -351068124:
                    i11 = 64863;
                    iM2567 = (i7 - C0630.m2566("ۖᩳ")) * 69;
                    i9 = ((iM2567 ^ i8) * 32483) ^ 1370505279;
                    i3 = -1208177152;
                    i10 = iM2567 ^ i3;
                    c7245 = this;
                    c22109 = c22109;
                    break;
                case -844903514:
                case 1573686674:
                    objArr = new Object[i5];
                    z = false;
                    objArr[0] = numM4916;
                    objArr[1] = numM4917;
                    if (C7106.f21815 != 0) {
                        iM2566 = (C2105.m6981("ܿܶ") + i7) * (-27);
                        i = ((iM2566 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM2566 = (i7 - C0630.m2566("֫ᩴ")) * (-75);
                        i = ((iM2566 ^ i8) * 8907) ^ (-1960729397);
                        i2 = -967520285;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -632299981:
                case 1606408122:
                    C22108 c221011 = c7245.f22216;
                    i4 = c221011.f71773;
                    if (C7106.m19120() <= 0) {
                        c22109 = c221011;
                        int iM6984 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6984 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6984 ^ (-342244);
                        c7245 = this;
                    } else {
                        int iM6985 = (C2105.m6981("ۛۚ") ^ i7) * (-3);
                        i9 = ((iM6985 ^ i8) * 9559) ^ (-1849708030);
                        c22109 = c221011;
                        i10 = iM6985 ^ (-1364614313);
                    }
                    break;
                case -483568869:
                case 1180152581:
                    ServiceConnectionC3453.m10564();
                    C0630.m2564();
                    int iM6986 = C2105.m6981("֫ۧ") ^ i7;
                    i9 = ((iM6986 ^ i8) * (-11607)) ^ (-1438118358);
                    i10 = iM6986 ^ (-342244);
                    c7245 = this;
                    break;
                case -424784393:
                case 329459894:
                    strM9924 = C3245.m9924(C0630.m2566(C1420.m4902(sArr2, i12, i13, i11)) ^ 2097490093, objArr);
                    if (!RunnableC1108.m3790()) {
                        iM2566 = (C0630.m2566("۠۫") ^ i7) * 33;
                        i = ((iM2566 ^ i8) * (-8935)) ^ (-15440502);
                        i2 = -279362316;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        c22108 = c22109;
                        int iM25611 = C0630.m2566("᩸ۜ") ^ i7;
                        i10 = iM25611 ^ (-167342746);
                        i9 = ((iM25611 ^ i8) * 20017) ^ (-766021886);
                        c22109 = c22108;
                        c7245 = this;
                    }
                    break;
                case -305554202:
                case 387033069:
                    c22109 = c22109;
                    if (((s * s) + 100841764) - (s * s2) >= 0) {
                        iM2567 = C2105.m6981("۫֨") ^ i8;
                        i9 = ((iM2567 ^ i7) * 5247) ^ 340347399;
                        i3 = -1681656887;
                    } else {
                        iM2567 = C0630.m2566("ۡ᩸") ^ i7;
                        i9 = ((iM2567 ^ i8) * (-25697)) ^ 1056315174;
                        i3 = 524655719;
                    }
                    i10 = iM2567 ^ i3;
                    c7245 = this;
                    c22109 = c22109;
                    break;
                case -289162167:
                case 1834601501:
                    c22109 = c22109;
                    s = sArr[c];
                    s2 = 20084;
                    if (!C2126.m7040()) {
                        iM2567 = (C2105.m6981("ۧۤ") ^ i8) * (-125);
                        i9 = ((iM2567 ^ i7) * 30301) ^ (-1769264998);
                        i3 = 1514099127;
                        i10 = iM2567 ^ i3;
                        c7245 = this;
                        c22109 = c22109;
                    } else {
                        c22109 = c22109;
                        int iM6987 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6987 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6987 ^ (-342244);
                        c7245 = this;
                    }
                    break;
                case -225426989:
                case 729668595:
                    c22108 = c22109;
                    ViewOnClickListenerC10732 viewOnClickListenerC10733 = c7245.f22206;
                    mainM50612 = C22628.m50612(viewOnClickListenerC10733.f32338);
                    if (C11340.f33930 >= 0) {
                        viewOnClickListenerC10732 = viewOnClickListenerC10733;
                        int iM25612 = C0630.m2566("᩸ۜ") ^ i7;
                        i10 = iM25612 ^ (-167342746);
                        i9 = ((iM25612 ^ i8) * 20017) ^ (-766021886);
                        c22109 = c22108;
                    } else {
                        int iM25613 = C0630.m2566("ۗۗ") ^ i8;
                        i9 = ((iM25613 ^ i7) * (-3811)) ^ 721945635;
                        c22109 = c22108;
                        viewOnClickListenerC10732 = viewOnClickListenerC10733;
                        i10 = iM25613 ^ (-2130711659);
                    }
                    c7245 = this;
                    break;
                case -98280125:
                case 115029527:
                    RunnableC0588.m2444(viewOnClickListenerC10732.f32338, C1005.m3496(c7245.f22204));
                    break;
                case 18469739:
                case 1182053571:
                    RunnableC1108.m3790();
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ܿܶ") + i7) * (-27);
                        i = ((iM2566 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        int iM6988 = C2105.m6981("֫ۧ") ^ i7;
                        i9 = ((iM6988 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM6988 ^ (-342244);
                        c7245 = this;
                    }
                    break;
                case 952554969:
                case 1552918596:
                    i11 = 49798;
                    iM2567 = (i7 - C0630.m2566("ۖᩳ")) * 69;
                    i9 = ((iM2567 ^ i8) * 32483) ^ 1370505279;
                    i3 = -1208177152;
                    i10 = iM2567 ^ i3;
                    c7245 = this;
                    c22109 = c22109;
                    break;
                default:
                    sArr2 = f22200;
                    i12 = 1;
                    i13 = 3;
                    if (C0714.f2697 < 0) {
                        iM2566 = (i8 - C0630.m2566("ۙ᩸")) * (-95);
                        i = ((iM2566 ^ i7) * (-701)) ^ 154985048;
                        i2 = -1107197936;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        c22109 = c22109;
                        iM2567 = C0630.m2566("᩺᩹") ^ i8;
                        i9 = ((iM2567 ^ i7) * (-10557)) ^ 300505048;
                        i3 = -985124156;
                        i10 = iM2567 ^ i3;
                        c7245 = this;
                        c22109 = c22109;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C22933 c22933 = null;
        AbstractC15440 abstractC15440 = null;
        AbstractC15440 abstractC15441 = null;
        int i = -791359389;
        int i2 = C3746.f11829;
        int i3 = C0422.f1886;
        int iM2566 = C0630.m2566("ᩴ֡") ^ i2;
        int i4 = ((iM2566 ^ i3) * 11307) ^ (-703166483);
        int i5 = -761479349;
        while (true) {
            i = ((((i ^ i3) * 26045) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2134571783:
                case 1062916202:
                    if (C4159.f13567) {
                        iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                        i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM2566 = (C0630.m2566("ۚۢ") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * 3483) ^ 1614927363;
                        i5 = 2138443834;
                    }
                    break;
                case -2122870834:
                case -804262877:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("᩶᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ܽۜ")) * 89;
                        i4 = ((iM2566 ^ i3) * (-3813)) ^ (-1406304412);
                        i5 = 1594417673;
                    }
                    break;
                case -2054477513:
                case -1735377393:
                    C3746.m11369();
                    C4159.m12565();
                    iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                    i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                    i5 = 1461142882;
                    break;
                case -1831638378:
                case -1640951617:
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C2105.m6981("ۛۨ") ^ i3) * 45;
                        i4 = ((iM2566 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM2566 = C0630.m2566("ܺۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17543)) ^ (-952975941);
                        i5 = 1291043960;
                    }
                    break;
                case -1761820546:
                case -842160923:
                    AbstractC2021.m6569(abstractC15440);
                    C0422.m1956();
                    abstractC15441 = this.f22215;
                    if (abstractC15441 != null) {
                        iM2566 = (C0630.m2566("᩵᩺") ^ i2) * (-65);
                        i4 = ((iM2566 ^ i3) * 29907) ^ (-1917433078);
                        i5 = 340020719;
                    } else {
                        iM2566 = C0630.m2566("᩵ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-7495)) ^ 1858444776;
                        i5 = 997502875;
                    }
                    break;
                case -1727661211:
                case 408982759:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("᩶᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM2566 = C0630.m2566("ۡۢ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-19705)) ^ 400351128;
                        i5 = -936158393;
                    }
                    break;
                case -1304471291:
                case -349826726:
                    C7106.m19120();
                    break;
                case -1270428157:
                case -994592851:
                    c22933 = this.f22210;
                    if (C2105.f7037 != 0) {
                        iM2566 = (C2105.m6981("᩹֡") + i2) * 49;
                        i4 = ((iM2566 ^ i3) * (-17027)) ^ 1585145620;
                        i5 = 681911698;
                    } else {
                        iM2566 = C2105.m6981("ۡܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 4587) ^ 1642566017;
                        i5 = 210909340;
                    }
                    break;
                case -791100313:
                case -277234020:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("᩶᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM2566 = C2105.m6981("ᩳܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-2801)) ^ (-1413404083);
                        i5 = -1853954410;
                    }
                    break;
                case -743668349:
                case 955619011:
                    c22933.m51051();
                    if (C0798.f2919) {
                        iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                        i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM2566 = (C0630.m2566("۠ܰ") ^ i3) * (-59);
                        i4 = ((iM2566 ^ i2) * (-9427)) ^ (-1974576305);
                        i5 = -1582615351;
                    }
                    break;
                case -535200612:
                case 484608291:
                    abstractC15440 = this.f22211;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("᩶᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۤ۟")) * 83;
                        i4 = ((iM2566 ^ i3) * (-12545)) ^ (-1326903494);
                        i5 = -824711648;
                    }
                    break;
                case -153301394:
                case 30455359:
                    C1005.m3501();
                    if (AbstractC2021.f6743 > 0) {
                        iM2566 = (C2105.m6981("ۛۨ") ^ i3) * 45;
                        i4 = ((iM2566 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                        i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    }
                    break;
                case -153082833:
                case 1439292982:
                    AbstractC2021.m6569(abstractC15441);
                    iM2566 = C0630.m2566("᩵ᩳ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-7495)) ^ 1858444776;
                    i5 = 997502875;
                    break;
                case -140208801:
                case 464321706:
                    if (C0964.f3626 != 0) {
                        iM2566 = (C2105.m6981("ۛۨ") ^ i3) * 45;
                        i4 = ((iM2566 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM2566 = (C2105.m6981("۠ۗ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i2) * (-25935)) ^ 1235959280;
                        i5 = -686843413;
                    }
                    break;
                case 343517156:
                case 1298361466:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (C2105.m6981("ۛۨ") ^ i3) * 45;
                        i4 = ((iM2566 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM2566 = C0630.m2566("ۚ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28017)) ^ 693492276;
                        i5 = -2332274;
                    }
                    break;
                case 597467652:
                case 640669382:
                    break;
                case 789855900:
                case 1274576061:
                    if (!C0483.m2121()) {
                        iM2566 = (C2105.m6981("᩹֡") + i2) * 49;
                        i4 = ((iM2566 ^ i3) * (-17027)) ^ 1585145620;
                        i5 = 681911698;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                        i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۛ֫")) * (-73);
                        i4 = ((iM2566 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i2) * 73;
                        i4 = ((iM2566 ^ i3) * (-14109)) ^ (-188400258);
                        i5 = 1828644584;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ff A[PHI: r15
      0x00ff: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:105:0x00ff, B:29:0x00fd, B:17:0x0094, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0164 A[PHI: r6 r14
      0x0164: PHI (r6v4 l.֡ۚۢ) = (r6v1 l.֡ۚۢ), (r6v2 l.֡ۚۢ), (r6v1 l.֡ۚۢ) binds: [B:37:0x0162, B:21:0x00ac, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r14v5 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:37:0x0162, B:21:0x00ac, B:12:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM6981;
        int i;
        short s;
        int iM6982;
        int i2;
        int i3;
        int iM2566;
        int i4;
        int i5;
        C1559 c1559;
        int i6;
        int iM2567;
        final C7245 c7245 = this;
        Object obj = null;
        final C1559 c15510 = null;
        C19258 c19258M2130 = null;
        DialogInterfaceC0206 dialogInterfaceC0206M11213 = null;
        int iM6983 = 0;
        int i7 = 0;
        String strM3841 = null;
        int iM2568 = 0;
        int i8 = 1029540199;
        int i9 = C3911.f12484;
        int i10 = ServiceConnectionC3453.f10921;
        int iM6984 = C2105.m6981("֫ᩴ") ^ i9;
        int i11 = ((iM6984 ^ i10) * (-21473)) ^ (-2066984203);
        int i12 = iM6984 ^ 20206782;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 0;
        ViewOnClickListenerC10732 viewOnClickListenerC10732 = null;
        while (true) {
            i8 = i12 ^ ((((i8 ^ i10) * 20099) >> 31) & i11);
            switch (i8) {
                case -2108818428:
                case 921784939:
                    C1294.m4380(c19258M2130, C2105.m6981(strM3841) ^ 2127134156, obj);
                    sArr4 = f22200;
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ܰܿ") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                    } else {
                        iM6981 = C0630.m2566("֡᩹") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-23771)) ^ 505322167;
                        i = -551752905;
                    }
                    i12 = iM6981 ^ i;
                    break;
                case -2103830714:
                case -468709306:
                    strM3841 = C1128.m3841(sArr3, 11, 3, i13);
                    if (!C2520.m8026()) {
                        iM6981 = C0630.m2566("ۨ᩶") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-10315)) ^ 1388342344;
                        i = 1857747450;
                        i12 = iM6981 ^ i;
                    } else {
                        iM2567 = (C0630.m2566("۬ᩴ") + i10) * (-49);
                        c1559 = c15510;
                        i6 = ((iM2567 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C1559 c15511 = c1559;
                        i12 = iM2567 ^ i5;
                        i11 = i6;
                        c15510 = c15511;
                    }
                    break;
                case -1950297364:
                case -327724610:
                    int i17 = i15 + i16;
                    s = s2;
                    int i18 = s + 18990;
                    if ((i18 * i18) - (i17 + i17) <= 0) {
                        iM6982 = (C0630.m2566("ܰۢ") + i9) * (-81);
                        i2 = ((iM6982 ^ i10) * (-31949)) ^ 1987634743;
                        i3 = -1832981796;
                    } else {
                        iM6982 = C2105.m6981("۬ۙ") ^ i10;
                        i2 = ((iM6982 ^ i9) * (-24949)) ^ 1624610;
                        i3 = -54332241;
                    }
                    i12 = iM6982 ^ i3;
                    c7245 = this;
                    s2 = s;
                    i11 = i2;
                    break;
                case -1932291818:
                case 2115413605:
                    boolean z = exc instanceof C1559;
                    ViewOnClickListenerC10732 viewOnClickListenerC10733 = c7245.f22206;
                    if (z) {
                        int iM6985 = C2105.m6981("ۧܽ") ^ i10;
                        viewOnClickListenerC10732 = viewOnClickListenerC10733;
                        obj = null;
                        i12 = iM6985 ^ 1955444527;
                        i11 = ((iM6985 ^ i9) * (-385)) ^ (-759962300);
                    } else {
                        int iM2569 = C0630.m2566("ܿۜ") ^ i9;
                        i11 = ((iM2569 ^ i10) * (-2693)) ^ 743763886;
                        viewOnClickListenerC10732 = viewOnClickListenerC10733;
                        obj = null;
                        i12 = iM2569 ^ (-901043002);
                    }
                    c7245 = this;
                    break;
                case -1866406151:
                case 1667673301:
                    i13 = 30576;
                    int iM25610 = (C0630.m2566("ܽ᩶") ^ i10) * (-31);
                    i11 = ((iM25610 ^ i9) * (-29285)) ^ 1561962759;
                    i12 = iM25610 ^ 805551340;
                    c7245 = this;
                    break;
                case -1736794263:
                case -1658908928:
                    c15510 = (C1559) exc;
                    c19258M2130 = C0483.m2130(C21923.m49336(viewOnClickListenerC10732.f32338));
                    if (C4117.f13076 <= 0) {
                        iM2567 = (C0630.m2566("۬ᩴ") + i10) * (-49);
                        c1559 = c15510;
                        i6 = ((iM2567 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                    } else {
                        iM2567 = (i9 - C2105.m6981("᩻۬")) * 53;
                        c1559 = c15510;
                        i6 = ((iM2567 ^ i10) * (-19999)) ^ (-1910752368);
                        i5 = -863554993;
                    }
                    C1559 c15512 = c1559;
                    i12 = iM2567 ^ i5;
                    i11 = i6;
                    c15510 = c15512;
                    break;
                case -1558214366:
                case -59448009:
                    C3537.m10746();
                    C11340.m28031();
                    break;
                case -1340532152:
                case -226161928:
                    C7106.m19120();
                    iM6981 = C0630.m2566("ܰܿ") ^ i10;
                    i11 = ((iM6981 ^ i9) * (-27985)) ^ 1807194979;
                    i = 1340643933;
                    i12 = iM6981 ^ i;
                    break;
                case -1019622845:
                case -405292926:
                    s = s2;
                    sArr = f22200;
                    c = 7;
                    if (C3432.f10845 < 0) {
                        iM6982 = C2105.m6981("۠ۧ") ^ i10;
                        i2 = ((iM6982 ^ i9) * 481) ^ 816120347;
                        i3 = -426386200;
                        i12 = iM6982 ^ i3;
                        c7245 = this;
                        s2 = s;
                        i11 = i2;
                    } else {
                        s2 = s;
                        iM2566 = (i9 - C0630.m2566("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM2566 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM2566 ^ i4;
                        c7245 = this;
                    }
                    break;
                case -795233376:
                case -244034896:
                    iM6983 = C2105.m6981(C1047.m3603(sArr2, i14, 3, i13));
                    i7 = 2121934015;
                    if (C3432.m10477() > 0) {
                        iM6981 = C2105.m6981("ᩴۖ") ^ i10;
                        i11 = ((iM6981 ^ i9) * 5891) ^ (-113612343);
                        i = 822282454;
                        i12 = iM6981 ^ i;
                    } else {
                        iM2567 = (C0630.m2566("۬ᩴ") + i10) * (-49);
                        c1559 = c15510;
                        i6 = ((iM2567 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C1559 c15513 = c1559;
                        i12 = iM2567 ^ i5;
                        i11 = i6;
                        c15510 = c15513;
                    }
                    break;
                case -713617242:
                case 174257567:
                    s2 = sArr[c];
                    i15 = s2 * s2;
                    i16 = 360620100;
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i9 - C0630.m2566("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM2566 ^ i10) * (-12273));
                        i4 = 157591648;
                    } else {
                        iM2566 = (C0630.m2566("ܺۚ") ^ i9) * 99;
                        i11 = 550451557 ^ ((iM2566 ^ i10) * 23833);
                        i4 = -1043116973;
                    }
                    i12 = iM2566 ^ i4;
                    c7245 = this;
                    break;
                case -609642296:
                case 271965362:
                    i13 = 457;
                    int iM25611 = (C0630.m2566("ܽ᩶") ^ i10) * (-31);
                    i11 = ((iM25611 ^ i9) * (-29285)) ^ 1561962759;
                    i12 = iM25611 ^ 805551340;
                    c7245 = this;
                    break;
                case -570964156:
                case 1620013848:
                    C0382.m1849(c19258M2130, iM6983 ^ i7);
                    C3537.m10741(c19258M2130, C4616.m13559(c15510));
                    sArr3 = f22200;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ܶ֨") + i10) * 91;
                        i11 = ((iM6981 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    } else {
                        iM6981 = (i9 - C2105.m6981("۫ܿ")) * (-115);
                        i11 = ((iM6981 ^ i10) * 4743) ^ 2065981259;
                        i = -893162709;
                    }
                    i12 = iM6981 ^ i;
                    break;
                case -474229189:
                case -432743536:
                    C1711.m5736();
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("ܰܿ") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                    } else {
                        iM6981 = (C2105.m6981("ܶ֨") + i10) * 91;
                        i11 = ((iM6981 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    }
                    i12 = iM6981 ^ i;
                    break;
                case -371596327:
                case 885350381:
                    C5695.m16017(c19258M2130, 2125769356 ^ iM2568, obj);
                    dialogInterfaceC0206M11213 = C3683.m11213(c19258M2130);
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C2105.m6981("ܶ֨") + i10) * 91;
                        i11 = ((iM6981 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    } else {
                        iM6981 = (C2105.m6981("۠ܶ") ^ i9) * 53;
                        i11 = ((iM6981 ^ i10) * 3693) ^ (-1407833137);
                        i = -855055523;
                    }
                    i12 = iM6981 ^ i;
                    break;
                case -241575633:
                case 14463579:
                    sArr2 = f22200;
                    i14 = 8;
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("᩷۫") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-32609)) ^ 1898796927;
                        i = 395595761;
                        i12 = iM6981 ^ i;
                    } else {
                        iM2566 = (i9 - C0630.m2566("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM2566 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM2566 ^ i4;
                        c7245 = this;
                    }
                    break;
                case -108266104:
                case 749268398:
                    C4075.m12246(C22628.m50612(viewOnClickListenerC10732.f32338), exc, obj);
                    break;
                case 187349177:
                case 871093951:
                    iM2568 = C0630.m2566(C22628.m50602(sArr4, 14, 3, i13));
                    if (C1773.f6144 > 0) {
                        iM6981 = C0630.m2566("ۙۜ") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-27393)) ^ 1265240462;
                        i = 255467247;
                        i12 = iM6981 ^ i;
                    } else {
                        iM2567 = (C0630.m2566("۬ᩴ") + i10) * (-49);
                        c1559 = c15510;
                        i6 = ((iM2567 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C1559 c15514 = c1559;
                        i12 = iM2567 ^ i5;
                        i11 = i6;
                        c15510 = c15514;
                    }
                    break;
                case 371822684:
                case 2115800268:
                    if (!C1916.f6442) {
                        iM6981 = (i9 - C2105.m6981("᩶ܽ")) * 43;
                        i11 = ((iM6981 ^ i10) * 7935) ^ (-560592643);
                        i = 564706890;
                        i12 = iM6981 ^ i;
                    } else {
                        iM2566 = (i9 - C0630.m2566("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM2566 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM2566 ^ i4;
                        c7245 = this;
                    }
                    break;
                case 1103904619:
                case 1909768096:
                    C0714.m2805();
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i9 - C0630.m2566("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM2566 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM2566 ^ i4;
                        c7245 = this;
                    } else {
                        iM6981 = C0630.m2566("ܰܿ") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                        i12 = iM6981 ^ i;
                    }
                    break;
                default:
                    C2126.m7039(C7811.m20839(dialogInterfaceC0206M11213), new View.OnClickListener(c7245) { // from class: l.ܰۙܽ

                        /* JADX INFO: renamed from: ᩹ۡۗ, reason: not valid java name and contains not printable characters */
                        private static final short[] f40539 = {9121, 14817, -8069, -3526, 12622, 8102, -5933, 26940, 26986, 27007, 27006, 15495, -1246, 4222};

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C7245 f40540;

                        {
                            int i19 = -280914545;
                            int i20 = C1294.f4556;
                            int i21 = ServiceConnectionC3453.f10921;
                            int iM6986 = (i20 - C2105.m6981("ۖۙ")) * (-19);
                            int i22 = ((iM6986 ^ i21) * (-10689)) ^ (-1154784136);
                            int i23 = -2005600929;
                            while (true) {
                                i19 = ((((i19 ^ i21) * (-22563)) >> 31) & i22) ^ (iM6986 ^ i23);
                                switch (i19) {
                                    case -2099138807:
                                    case 2048242774:
                                        C3911.m11924();
                                        C7811.m20844();
                                        iM6986 = C0630.m2566("ۤܶ") ^ i21;
                                        i22 = ((iM6986 ^ i20) * (-32025)) ^ (-523937507);
                                        i23 = -564137243;
                                        break;
                                    case -1995120421:
                                    case -1877008469:
                                        if (C1005.m3501()) {
                                            iM6986 = C2105.m6981("ۘۖ") ^ i21;
                                            i22 = ((iM6986 ^ i20) * 227) ^ (-642626598);
                                            i23 = -1640843976;
                                        } else {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        }
                                        break;
                                    case -1977728489:
                                    case -622641753:
                                        this.f40540 = c7245;
                                        if (C2126.f7087) {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM6986 = C0630.m2566("ۗᩴ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-30279)) ^ (-1657253995);
                                            i23 = -759226234;
                                        }
                                        break;
                                    case -1464206880:
                                    case -364854855:
                                        C0237.m1481();
                                        if (C22628.f73083 > 0) {
                                            iM6986 = (C2105.m6981("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM6986 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        }
                                        break;
                                    case -1429716685:
                                    case 2109176016:
                                        if (C0630.f2410 <= 0) {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM6986 = C2105.m6981("۟ܶ") ^ i21;
                                            i22 = ((iM6986 ^ i20) * (-18345)) ^ 1023975746;
                                            i23 = 1001709489;
                                        }
                                        break;
                                    case -1075541072:
                                    case 256207026:
                                        return;
                                    case -783264572:
                                    case 1491741804:
                                        if (C3019.f9544 >= 0) {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM6986 = C2105.m6981("᩵۟") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-7665)) ^ 1156558818;
                                            i23 = -1133578776;
                                        }
                                        break;
                                    case -683411722:
                                    case -582772224:
                                        if (C2272.f7362) {
                                            iM6986 = (C2105.m6981("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM6986 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM6986 = C0630.m2566("᩶ۨ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-32067)) ^ (-447397860);
                                            i23 = -464910348;
                                        }
                                        break;
                                    case -611162445:
                                    case -257678113:
                                        if (C2105.m6982() != 0) {
                                            iM6986 = C0630.m2566("۠ۡ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-19053)) ^ (-789759503);
                                            i23 = -719462788;
                                        } else {
                                            iM6986 = C2105.m6981("ܿۨ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-15921)) ^ 1357039823;
                                            i23 = -2138594881;
                                        }
                                        break;
                                    case -523047901:
                                    case 1925552822:
                                        if (C1504.m5179()) {
                                            iM6986 = C2105.m6981("ᩴۗ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-28201)) ^ 704186656;
                                            i23 = 2119948300;
                                        } else {
                                            iM6986 = C2105.m6981("ۖ᩶") ^ i20;
                                            i22 = ((iM6986 ^ i21) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ 1092767570;
                                            i23 = 1162385906;
                                        }
                                        break;
                                    case -31900115:
                                    case 703879113:
                                        if (C1047.f3863 >= 0) {
                                            iM6986 = C0630.m2566("۠ۡ") ^ i20;
                                            i22 = ((iM6986 ^ i21) * (-19053)) ^ (-789759503);
                                            i23 = -719462788;
                                        } else {
                                            iM6986 = C0630.m2566("ۤܶ") ^ i21;
                                            i22 = ((iM6986 ^ i20) * (-32025)) ^ (-523937507);
                                            i23 = -564137243;
                                        }
                                        break;
                                    case 797962269:
                                    case 1833676572:
                                        if (C4159.f13567) {
                                            iM6986 = C2105.m6981("֫ۚ") ^ i21;
                                            i22 = ((iM6986 ^ i20) * (-2327)) ^ 1425905398;
                                            i23 = -474862771;
                                        } else {
                                            iM6986 = C2105.m6981("ۖ᩶") ^ i20;
                                            i22 = ((iM6986 ^ i21) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ 1092767570;
                                            i23 = 1162385906;
                                        }
                                        break;
                                    case 834663946:
                                    case 1001660913:
                                        C2126.m7040();
                                        if (RunnableC0588.f2309 < 0) {
                                            iM6986 = (C2105.m6981("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM6986 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM6986 = C0630.m2566("ۤܶ") ^ i21;
                                            i22 = ((iM6986 ^ i20) * (-32025)) ^ (-523937507);
                                            i23 = -564137243;
                                        }
                                        break;
                                    case 849926983:
                                    case 1498285253:
                                        C3019.m9255();
                                        throw new RuntimeException();
                                    case 1077280116:
                                    case 1262586605:
                                        if (C1504.f5354) {
                                            iM6986 = (C2105.m6981("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM6986 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM6986 = (C2105.m6981("ۡۗ") ^ i21) * (-47);
                                            i22 = ((iM6986 ^ i20) * 19933) ^ (-2135668631);
                                            i23 = -141850979;
                                        }
                                        break;
                                    default:
                                        if (C3432.f10845 >= 0) {
                                            iM6986 = (C2105.m6981("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM6986 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM6986 = (C0630.m2566("᩵ۚ") + i21) * 127;
                                            i22 = ((iM6986 ^ i20) * 6469) ^ (-376662324);
                                            i23 = 1259302072;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:36:0x0154 A[PHI: r6
                          0x0154: PHI (r6v6 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:35:0x0152, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:53:0x0252 A[PHI: r2 r3 r4 r14 r17 r18
                          0x0252: PHI (r2v41 l.֫᩷ᩳ) = (r2v2 l.֫᩷ᩳ), (r2v40 l.֫᩷ᩳ), (r2v2 l.֫᩷ᩳ), (r2v2 l.֫᩷ᩳ) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]
                          0x0252: PHI (r3v21 l.֫ۗܽ) = (r3v2 l.֫ۗܽ), (r3v20 l.֫ۗܽ), (r3v2 l.֫ۗܽ), (r3v2 l.֫ۗܽ) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]
                          0x0252: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]
                          0x0252: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]
                          0x0252: PHI (r17v24 short[]) = (r17v2 short[]), (r17v23 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]
                          0x0252: PHI (r18v20 java.lang.String) = (r18v2 java.lang.String), (r18v19 java.lang.String), (r18v2 java.lang.String), (r18v2 java.lang.String) binds: [B:80:0x0252, B:52:0x0250, B:31:0x0124, B:12:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int iM6986;
                            int i19;
                            int i20;
                            C1559 c15515;
                            short[] sArr5;
                            C2079 c2079;
                            short s3;
                            int iM6987;
                            int i21;
                            int i22;
                            ViewOnClickListenerC13594 viewOnClickListenerC13594 = this;
                            int i23 = 332110052;
                            int i24 = C3019.f9544;
                            int i25 = C1773.f6144;
                            int iM6988 = C2105.m6981("ۗܰ") ^ i25;
                            int i26 = ((iM6988 ^ i24) * (-23959)) ^ (-725081857);
                            int i27 = iM6988 ^ (-1589800657);
                            String str = null;
                            String str2 = null;
                            String strM3502 = null;
                            short[] sArr6 = null;
                            short[] sArr7 = null;
                            short s4 = 0;
                            int iM6989 = 0;
                            int iM25612 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            short s5 = 0;
                            C1559 c15516 = null;
                            String str3 = null;
                            short[] sArr8 = null;
                            C2079 c2079M6839 = null;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                i23 = i27 ^ (i26 & (((i23 ^ i24) * (-17317)) >> 31));
                                switch (i23) {
                                    case -1887425568:
                                    case -252188216:
                                        c15515 = c15516;
                                        sArr5 = sArr8;
                                        str = str;
                                        c2079 = c2079M6839;
                                        s3 = f40539[0];
                                        s5 = 15564;
                                        if (RunnableC3474.f10992 <= 0) {
                                            int iM69810 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c15516 = c15515;
                                            i26 = ((iM69810 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM69810 ^ 1441235723;
                                            c2079M6839 = c2079;
                                            viewOnClickListenerC13594 = this;
                                            str = str;
                                        } else {
                                            int iM25613 = C0630.m2566("ۡ۠") ^ i24;
                                            s4 = s3;
                                            i26 = ((iM25613 ^ i25) * (-9265)) ^ (-782250219);
                                            sArr8 = sArr5;
                                            c2079M6839 = c2079;
                                            c15516 = c15515;
                                            i27 = iM25613 ^ (-1359236343);
                                            str = str;
                                            viewOnClickListenerC13594 = this;
                                        }
                                        break;
                                    case -1669513275:
                                    case 122658464:
                                        c2079M6839.m6845(C22628.m50612(viewOnClickListenerC13594.f40540.f22206.f32338));
                                        break;
                                    case -1577886588:
                                    case 179106934:
                                        str = str;
                                        c2079M6839.m6842(C0630.m2566(strM3502) ^ 2119376317, str);
                                        str3 = c15516.f5509;
                                        if (C3746.f11829 > 0) {
                                            int iM69811 = (C2105.m6981("ܰܽ") ^ i25) * (-5);
                                            c2079M6839 = c2079M6839;
                                            i21 = ((iM69811 ^ i24) * (-7439)) ^ (-2055116277);
                                            i27 = iM69811 ^ 1907267293;
                                            i26 = i21;
                                            c2079M6839 = c2079M6839;
                                            str = str;
                                        } else {
                                            s3 = s4;
                                            c2079 = c2079M6839;
                                            c15515 = c15516;
                                            sArr5 = sArr8;
                                            int iM69812 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c15516 = c15515;
                                            i26 = ((iM69812 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM69812 ^ 1441235723;
                                            c2079M6839 = c2079;
                                            viewOnClickListenerC13594 = this;
                                            str = str;
                                        }
                                        break;
                                    case -1500998530:
                                    case 1364504253:
                                        iM6989 = 2118218726 ^ C2105.m6981(C1916.m6311(sArr7, i31, 3, i32));
                                        if (C1420.f5096 > 0) {
                                            iM6986 = (C2105.m6981("۫ۚ") ^ i25) * 63;
                                            i19 = ((iM6986 ^ i24) * 20367) ^ 488172469;
                                            i20 = 1972296988;
                                            i27 = iM6986 ^ i20;
                                            i26 = i19;
                                        } else {
                                            c15516 = c15516;
                                            sArr8 = sArr8;
                                            str = str;
                                            c2079M6839 = c2079M6839;
                                            iM6987 = (C0630.m2566("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM6987 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                            int i33 = iM6987 ^ i22;
                                            sArr8 = sArr8;
                                            c15516 = c15516;
                                            i27 = i33;
                                            i26 = i21;
                                            c2079M6839 = c2079M6839;
                                            str = str;
                                        }
                                        break;
                                    case -1408309005:
                                    case 881894215:
                                        c2079M6839 = C2079.m6839();
                                        c15516 = c15510;
                                        str = c15516.f5507;
                                        sArr8 = f40539;
                                        if (C4159.f13567) {
                                            iM6986 = (i25 - C2105.m6981("ܽܿ")) * (-27);
                                            i19 = ((iM6986 ^ i24) * 281) ^ (-974066333);
                                            i20 = 962355546;
                                        } else {
                                            iM6986 = C0630.m2566("ܳ᩵") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        }
                                        i27 = iM6986 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1372919146:
                                    case 1742917316:
                                        iM25612 = C0630.m2566(C1420.m4902(f40539, 4, 3, i32));
                                        i28 = 2118684741;
                                        if (C4616.m13552() == 0) {
                                            iM6986 = (C2105.m6981("᩺֨") + i24) * (-83);
                                            i19 = ((iM6986 ^ i25) * (-2595)) ^ (-800724071);
                                            i20 = -1720132930;
                                            i27 = iM6986 ^ i20;
                                            i26 = i19;
                                        } else {
                                            s3 = s4;
                                            c15515 = c15516;
                                            sArr5 = sArr8;
                                            str = str;
                                            c2079 = c2079M6839;
                                            int iM69813 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c15516 = c15515;
                                            i26 = ((iM69813 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM69813 ^ 1441235723;
                                            c2079M6839 = c2079;
                                            viewOnClickListenerC13594 = this;
                                            str = str;
                                        }
                                        break;
                                    case -1305312855:
                                    case 1661043721:
                                        c2079M6839.m6847(str2);
                                        sArr7 = f40539;
                                        i31 = 11;
                                        if (C2272.f7362) {
                                            iM6986 = C0630.m2566("ܳ᩵") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        } else {
                                            iM6986 = (i24 - C2105.m6981("᩶ۡ")) * (-83);
                                            i19 = ((iM6986 ^ i25) * (-9687)) ^ 2079251884;
                                            i20 = -1527195492;
                                        }
                                        i27 = iM6986 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1237085757:
                                    case -962481801:
                                        C0237.m1481();
                                        if (C22628.f73083 > 0) {
                                            iM6986 = C0630.m2566("ܳ᩵") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        } else {
                                            iM6986 = C0630.m2566("ܿ۬") ^ i25;
                                            i19 = ((iM6986 ^ i24) * 24353) ^ (-1668368693);
                                            i20 = 2064102453;
                                        }
                                        i27 = iM6986 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1056914345:
                                    case -180376421:
                                        c2079M6839.m6841(iM6989);
                                        c2079M6839.m6848(c15516.f5508);
                                        c2079M6839.m6843(C9523.m24404(c15516.f5508));
                                        if (C1773.f6144 <= 0) {
                                            iM6986 = C2105.m6981("᩷ܺ") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-24319)) ^ (-2089306095);
                                            i20 = 1541481360;
                                        } else {
                                            iM6986 = C0630.m2566("ܽ۫") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-6743)) ^ 1289478125;
                                            i20 = 1910264187;
                                        }
                                        i27 = iM6986 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1018201762:
                                    case 1678267906:
                                        C3432.m10477();
                                        C1916.m6308();
                                        s3 = s4;
                                        c15515 = c15516;
                                        sArr5 = sArr8;
                                        str = str;
                                        c2079 = c2079M6839;
                                        int iM69814 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                        s4 = s3;
                                        sArr8 = sArr5;
                                        c15516 = c15515;
                                        i26 = ((iM69814 ^ i24) * 32133) ^ (-1186530142);
                                        i27 = iM69814 ^ 1441235723;
                                        c2079M6839 = c2079;
                                        viewOnClickListenerC13594 = this;
                                        str = str;
                                        break;
                                    case -439065425:
                                    case 1080085929:
                                        C2520.m8026();
                                        break;
                                    case 478925771:
                                    case 2107919287:
                                        i32 = 2355;
                                        iM6987 = (C2105.m6981("ܽ۬") ^ i24) * (-39);
                                        i21 = ((iM6987 ^ i25) * 22067) ^ 1288300503;
                                        i22 = 1617348628;
                                        int i34 = iM6987 ^ i22;
                                        sArr8 = sArr8;
                                        c15516 = c15516;
                                        i27 = i34;
                                        i26 = i21;
                                        c2079M6839 = c2079M6839;
                                        str = str;
                                        break;
                                    case 574859972:
                                    case 1130030822:
                                        c15516 = c15516;
                                        sArr8 = sArr8;
                                        str = str;
                                        c2079M6839 = c2079M6839;
                                        int i35 = s4 + s5;
                                        if ((i35 * i35) - (62256 * s4) >= 0) {
                                            iM6987 = C0630.m2566("᩻֨") ^ i25;
                                            i21 = ((iM6987 ^ i24) * 23587) ^ 1468392159;
                                            i22 = 124158850;
                                        } else {
                                            iM6987 = (C2105.m6981("ᩴ۫") + i25) * (-67);
                                            i21 = ((iM6987 ^ i24) * (-23619)) ^ (-1633546791);
                                            i22 = -1103976882;
                                        }
                                        int i36 = iM6987 ^ i22;
                                        sArr8 = sArr8;
                                        c15516 = c15516;
                                        i27 = i36;
                                        i26 = i21;
                                        c2079M6839 = c2079M6839;
                                        str = str;
                                        break;
                                    case 702077177:
                                    case 1667139367:
                                        i32 = 26898;
                                        iM6987 = (C2105.m6981("ܽ۬") ^ i24) * (-39);
                                        i21 = ((iM6987 ^ i25) * 22067) ^ 1288300503;
                                        i22 = 1617348628;
                                        int i37 = iM6987 ^ i22;
                                        sArr8 = sArr8;
                                        c15516 = c15516;
                                        i27 = i37;
                                        i26 = i21;
                                        c2079M6839 = c2079M6839;
                                        str = str;
                                        break;
                                    case 725842046:
                                    case 1453288873:
                                        str = str;
                                        c2079M6839 = c2079M6839;
                                        c15516 = c15516;
                                        sArr8 = sArr8;
                                        strM3502 = C1005.m3502(sArr8, 1, 3, i32);
                                        if (C22628.f73083 <= 0) {
                                            iM6987 = (C0630.m2566("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM6987 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                        } else {
                                            iM6987 = C2105.m6981("ۗۡ") ^ i24;
                                            i21 = ((iM6987 ^ i25) * (-22393)) ^ (-1727917434);
                                            i22 = -418535572;
                                        }
                                        int i38 = iM6987 ^ i22;
                                        sArr8 = sArr8;
                                        c15516 = c15516;
                                        i27 = i38;
                                        i26 = i21;
                                        c2079M6839 = c2079M6839;
                                        str = str;
                                        break;
                                    case 751929838:
                                    case 1266009707:
                                        c2079M6839.m6849(C3746.m11357(sArr6, i29, i30, i32));
                                        c2079M6839.m6840();
                                        str2 = c15516.f5508;
                                        if (C4117.m12364() != 0) {
                                            iM6986 = C0630.m2566("ܿ۬") ^ i25;
                                            i19 = ((iM6986 ^ i24) * 24353) ^ (-1668368693);
                                            i20 = 2064102453;
                                        } else {
                                            iM6986 = (C2105.m6981("᩶ܽ") ^ i24) * (-51);
                                            i19 = ((iM6986 ^ i25) * 8503) ^ (-1308647621);
                                            i20 = 447017954;
                                        }
                                        i27 = iM6986 ^ i20;
                                        i26 = i19;
                                        break;
                                    case 1034738213:
                                    case 1160129433:
                                        if (!C0382.f1805) {
                                            s3 = s4;
                                            c15515 = c15516;
                                            sArr5 = sArr8;
                                            str = str;
                                            c2079 = c2079M6839;
                                            int iM69815 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c15516 = c15515;
                                            i26 = ((iM69815 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM69815 ^ 1441235723;
                                            c2079M6839 = c2079;
                                            viewOnClickListenerC13594 = this;
                                            str = str;
                                        } else {
                                            iM6986 = C2105.m6981("᩷ܺ") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-24319)) ^ (-2089306095);
                                            i20 = 1541481360;
                                            i27 = iM6986 ^ i20;
                                            i26 = i19;
                                        }
                                        break;
                                    case 1438265934:
                                    case 1498812782:
                                        if (C3911.m11924() <= 0) {
                                            iM6986 = C0630.m2566("ܳ᩵") ^ i24;
                                            i19 = ((iM6986 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                            i27 = iM6986 ^ i20;
                                            i26 = i19;
                                        } else {
                                            s3 = s4;
                                            c15515 = c15516;
                                            sArr5 = sArr8;
                                            str = str;
                                            c2079 = c2079M6839;
                                            int iM69816 = (C2105.m6981("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c15516 = c15515;
                                            i26 = ((iM69816 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM69816 ^ 1441235723;
                                            c2079M6839 = c2079;
                                            viewOnClickListenerC13594 = this;
                                            str = str;
                                        }
                                        break;
                                    default:
                                        c2079M6839.m6846(iM25612 ^ i28, str3);
                                        sArr6 = f40539;
                                        i29 = 7;
                                        i30 = 4;
                                        if (ViewOnClickListenerC1958.m6429() < 0) {
                                            iM6986 = C0630.m2566("᩻᩵") ^ i25;
                                            i19 = ((iM6986 ^ i24) * (-12281)) ^ 30940161;
                                            i20 = 40871746;
                                            i27 = iM6986 ^ i20;
                                            i26 = i19;
                                        } else {
                                            c15516 = c15516;
                                            sArr8 = sArr8;
                                            str = str;
                                            c2079M6839 = c2079M6839;
                                            iM6987 = (C0630.m2566("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM6987 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                            int i39 = iM6987 ^ i22;
                                            sArr8 = sArr8;
                                            c15516 = c15516;
                                            i27 = i39;
                                            i26 = i21;
                                            c2079M6839 = c2079M6839;
                                            str = str;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
            }
            return;
        }
    }
}
