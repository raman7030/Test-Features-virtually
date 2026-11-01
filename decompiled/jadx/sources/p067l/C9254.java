package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9254 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܽ֡᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f82053 = {6132, 30329, -25838, -27133, -24727, -25303, -24200, 3447, 11322, -1139, 4923, 3409, -653, 10103, 7062, 6206, 5203, 4454, -20970, 17791, 27644, 9480, 9480, 9480};

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ int f25083;

    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ int f25084;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C13457 f25085;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ AbstractC17043 f25086;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ C13929 f25087;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ViewOnClickListenerC12568 f25088;

    /* JADX INFO: renamed from: ۠ */
    public final /* synthetic */ int f25089;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f25090;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f25091;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f25092;

    /* JADX INFO: renamed from: ܶ */
    public final /* synthetic */ AbstractC17043 f25093;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ boolean f25094;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean f25095;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ String f25096;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC17043 f25097;

    /* JADX INFO: renamed from: ᩻ */
    public C23380 f25098;

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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        Runnable runnable = null;
        String strM56144 = null;
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
        int i12 = C0877.f81843;
        int i13 = C1012.f81938;
        int iM559710 = (C0946.m55979("᩹ܽ") + i12) * 37;
        int i14 = ((iM559710 ^ i13) * (-22719)) ^ 286727715;
        int i15 = iM559710 ^ (-766405446);
        short[] sArr3 = null;
        C24164 c24164 = null;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-28649)) >> 31));
            switch (i11) {
                case -1966701778:
                case 588010636:
                    c24164.mo51878(runnable);
                    sArr = f82053;
                    i9 = 18;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("ܰ۫") ^ i12) * (-33);
                        i = ((iM55979 ^ i13) * 27031) ^ 702751383;
                        i2 = -1105945823;
                    } else {
                        iM55979 = (i12 - C0873.m55680("ᩴܽ")) * 21;
                        i = ((iM55979 ^ i13) * 27065) ^ 1336884755;
                        i2 = 1870679507;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -1928398532:
                case -272165183:
                    if (i5 - (i6 + i7) <= 0) {
                        iM55979 = (i12 - C0946.m55979("᩻ۡ")) * (-53);
                        i = ((iM55979 ^ i13) * 8021) ^ (-189262311);
                        i2 = -925592123;
                    } else {
                        iM55979 = C0946.m55979("ۧۗ") ^ i12;
                        i = ((iM55979 ^ i13) * (-28539)) ^ 997823955;
                        i2 = 1760539390;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -1917495687:
                case -975266852:
                    if (C0937.m55918() < 0) {
                        iM55979 = (C0873.m55680("ܰ۫") ^ i12) * (-33);
                        i = ((iM55979 ^ i13) * 27031) ^ 702751383;
                        i2 = -1105945823;
                    } else {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                        i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -1574758849:
                case 99632596:
                    C0930.m55885();
                    if (C1404.f82149 < 0) {
                        iM55680 = (C0873.m55680("֡֨") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM55680 ^ i12) * 24853) ^ (-1548650374);
                        i4 = -1502599862;
                        i15 = iM55680 ^ i4;
                        i14 = i3;
                        c24164 = null;
                    } else {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                        i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    }
                    break;
                case -1353393350:
                case 2142163421:
                    i5 = s * s2;
                    i6 = s * s;
                    i7 = 125037124;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i12 - C0946.m55979("᩵᩷")) * 25;
                        i = ((iM55979 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM55979 = (i13 - C0946.m55979("֡ۡ")) * 83;
                        i = ((iM55979 ^ i12) * (-30653)) ^ 1294198130;
                        i2 = 1520019737;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -1329197103:
                case -425084113:
                    c24164.m53440(C0873.m55680(strM56144) ^ 2097446774);
                    if (C0854.m55595() < 0) {
                        iM55979 = C0946.m55979("ᩴ᩶") ^ i12;
                        i = ((iM55979 ^ i13) * 26461) ^ (-1169289693);
                        i2 = -813227965;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i13;
                        i3 = ((iM55680 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM55680 ^ i4;
                        i14 = i3;
                        c24164 = null;
                    }
                    break;
                case -1255945333:
                case 290122391:
                    C18107 c18107 = this.f25088.f35311;
                    if (!C0937.f81884) {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i13;
                        i3 = ((iM55680 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM55680 ^ i4;
                        i14 = i3;
                        c24164 = null;
                    } else {
                        Main mainM56560 = C1929.m56560(c18107);
                        if (!C0937.f81884) {
                            iM55680 = (C0873.m55680("֡֨") + i13) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i3 = ((iM55680 ^ i12) * 24853) ^ (-1548650374);
                            i4 = -1502599862;
                            i15 = iM55680 ^ i4;
                            i14 = i3;
                            c24164 = null;
                        } else {
                            c24164 = new C24164(mainM56560);
                            runnable = null;
                            if (C1025.f81947 >= 0) {
                                iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                                i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                                i2 = -1906049996;
                            } else {
                                iM55979 = C0946.m55979("ۤۘ") ^ i13;
                                i = ((iM55979 ^ i12) * 20127) ^ 1847242493;
                                i2 = -1776757808;
                            }
                            i15 = iM55979 ^ i2;
                            i14 = i;
                        }
                    }
                    break;
                case -1052594103:
                case 832998554:
                    c24164.m53431(C1024.m56203(sArr2, i10, 3, i8));
                    c24164.mo51883();
                    this.f25092 = c24164;
                    break;
                case -1011283273:
                case 1042459208:
                    strM56144 = C1012.m56144(sArr, i9, 3, i8);
                    if (C0955.m56025()) {
                        iM55979 = (i12 - C0946.m55979("᩵᩷")) * 25;
                        i = ((iM55979 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM55979 = (i13 - C0946.m55979("ۢ᩺")) * 41;
                        i = ((iM55979 ^ i12) * 8435) ^ 702154089;
                        i2 = -1327882239;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -472686035:
                case 162332501:
                    if (C1025.f81947 < 0) {
                        iM55680 = C0873.m55680("ۧ᩷") ^ i13;
                        i3 = ((iM55680 ^ i12) * 29861) ^ (-2046342948);
                        i4 = 950140193;
                        i15 = iM55680 ^ i4;
                        i14 = i3;
                        c24164 = null;
                    } else {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                        i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                        i15 = iM55979 ^ i2;
                        i14 = i;
                    }
                    break;
                case -425692109:
                case 475870745:
                    i8 = 13859;
                    iM55979 = C0873.m55680("֨ۨ") ^ i13;
                    i = ((iM55979 ^ i12) * 17549) ^ (-1156874643);
                    i2 = -1537341441;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case -214987489:
                case 1008519544:
                    s = sArr3[c];
                    s2 = 22364;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                        i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    } else {
                        iM55979 = (i12 - C0873.m55680("᩵ᩳ")) * 75;
                        i = ((iM55979 ^ i13) * (-7715)) ^ (-1517179410);
                        i2 = 526402831;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case 114633860:
                case 1103852764:
                    sArr2 = f82053;
                    i10 = 21;
                    if (C0946.f81894 != 0) {
                        iM55979 = (i12 - C0946.m55979("᩵᩷")) * 25;
                        i = ((iM55979 ^ i13) * 24483) ^ 270880650;
                        i2 = -527000873;
                    } else {
                        iM55979 = C0873.m55680("֡ۖ") ^ i13;
                        i = ((iM55979 ^ i12) * 17329) ^ (-345167181);
                        i2 = 1951817268;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case 430215355:
                case 1413687506:
                    C1003.m56123();
                    C1044.m56286();
                    break;
                case 930830744:
                case 1117676088:
                    i8 = 9510;
                    iM55979 = C0873.m55680("֨ۨ") ^ i13;
                    i = ((iM55979 ^ i12) * 17549) ^ (-1156874643);
                    i2 = -1537341441;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                case 1136130719:
                case 2142050289:
                    sArr3 = f82053;
                    c = 17;
                    if (C1929.m56553()) {
                        iM55979 = C0873.m55680("ᩴۜ") ^ i12;
                        i = ((iM55979 ^ i13) * (-13661)) ^ 555827970;
                        i2 = -1906049996;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩵") ^ i13;
                        i = ((iM55979 ^ i12) * (-9655)) ^ (-1636210965);
                        i2 = 1178286382;
                    }
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
                default:
                    C0890.m55740();
                    iM55979 = (C0873.m55680("ܰ۫") ^ i12) * (-33);
                    i = ((iM55979 ^ i13) * 27031) ^ 702751383;
                    i2 = -1105945823;
                    i15 = iM55979 ^ i2;
                    i14 = i;
                    break;
            }
            return;
        }
    }

    public C9254(ViewOnClickListenerC12568 viewOnClickListenerC12568, AbstractC17043 abstractC17043, C13457 c13457, boolean z, int i, C13929 c13929, boolean z2, boolean z3, String str, int i2, int i3, AbstractC17043 abstractC17044, boolean z4) {
        C23380 c23380 = null;
        int i4 = 1663233151;
        int i5 = C0930.f81879;
        int i6 = C1046.f81962;
        this.f25088 = viewOnClickListenerC12568;
        this.f25093 = abstractC17043;
        this.f25085 = c13457;
        this.f25094 = z;
        this.f25084 = i;
        this.f25087 = c13929;
        this.f25095 = z2;
        this.f25091 = z3;
        this.f25096 = str;
        this.f25089 = i2;
        this.f25083 = i3;
        this.f25086 = abstractC17044;
        this.f25090 = z4;
        int iM55680 = (C0873.m55680("ᩳ᩸") + i5) * (-103);
        int i7 = ((iM55680 ^ i6) * (-32699)) ^ (-2112939840);
        int i8 = -2005739771;
        while (true) {
            i4 = ((((i4 ^ i6) * 22965) >> 31) & i7) ^ (iM55680 ^ i8);
            switch (i4) {
                case -1805034885:
                case -1511803808:
                    C1964.m56597();
                    iM55680 = C0946.m55979("᩵᩹") ^ i5;
                    i7 = ((iM55680 ^ i6) * (-29981)) ^ 1548053940;
                    i8 = -602700310;
                    break;
                case -1762571835:
                case 1456241972:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    } else {
                        iM55680 = (C0946.m55979("᩸֨") ^ i6) * 29;
                        i7 = ((iM55680 ^ i5) * 3059) ^ (-895971538);
                        i8 = -985672724;
                    }
                    break;
                case -1444986500:
                case 158220637:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM55680 = C0946.m55979("ۡ֫") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-11109)) ^ 1965880557;
                        i8 = -1679113765;
                    }
                    break;
                case -1207182234:
                case 1588694386:
                    c23380 = new C23380();
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM55680 = (C0946.m55979("ۜ۬") ^ i5) * 73;
                        i7 = ((iM55680 ^ i6) * (-6013)) ^ (-140852948);
                        i8 = 2040511496;
                    }
                    break;
                case -925148502:
                case -197815926:
                    if (C0898.f81858 > 0) {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    } else {
                        iM55680 = C0946.m55979("᩵᩹") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-29981)) ^ 1548053940;
                        i8 = -602700310;
                    }
                    break;
                case -470964008:
                case 306533160:
                    if (C0845.f81821 < 0) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    }
                    break;
                case -420294168:
                case 1607434059:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("᩹ܳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM55680 = (C0873.m55680("᩶۠") + i6) * (-123);
                        i7 = ((iM55680 ^ i5) * 11587) ^ 681914312;
                        i8 = -498465303;
                    }
                    break;
                case -223499592:
                case 179285299:
                    C1024.m56209();
                    ViewOnClickListenerC0939.m55941();
                    throw new RuntimeException();
                case -216179063:
                case 1732934669:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("᩹ܳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM55680 = C0946.m55979("۠ۖ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 32297) ^ 1365978728;
                        i8 = 1759903356;
                    }
                    break;
                case -31397830:
                case 1005930519:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM55680 = C0946.m55979("᩹ۜ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-26367)) ^ (-1981909469);
                        i8 = -1069815583;
                    }
                    break;
                case 49323572:
                case 561815203:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("֡۫") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-7129)) ^ (-1868326682);
                        i8 = -215311443;
                    } else {
                        iM55680 = C0946.m55979("᩵᩹") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-29981)) ^ 1548053940;
                        i8 = -602700310;
                    }
                    break;
                case 298574583:
                case 1631752750:
                    if (RunnableC1014.m56177()) {
                        iM55680 = C0873.m55680("᩸۬") ^ i5;
                        i7 = ((iM55680 ^ i6) * 2721) ^ (-907221018);
                        i8 = 1903240649;
                    } else {
                        iM55680 = C0873.m55680("۫ᩴ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-17121)) ^ 359678943;
                        i8 = 1413084282;
                    }
                    break;
                case 301177788:
                case 1533384363:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0873.m55680("֡۫") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-7129)) ^ (-1868326682);
                        i8 = -215311443;
                    } else {
                        iM55680 = C0873.m55680("᩻ܳ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 15043) ^ 599193270;
                        i8 = -794905132;
                    }
                    break;
                case 502070778:
                case 1043119917:
                    this.f25098 = c23380;
                    return;
                case 763730718:
                case 1116611489:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("۫ܶ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 28295) ^ 1360081654;
                        i8 = -628609577;
                    } else {
                        iM55680 = (C0873.m55680("֡ۗ") ^ i6) * 45;
                        i7 = ((iM55680 ^ i5) * 29127) ^ (-1772658950);
                        i8 = 439942134;
                    }
                    break;
                default:
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("᩹ܳ") ^ i6;
                        i7 = ((iM55680 ^ i5) * 29855) ^ (-466130523);
                        i8 = -1255732827;
                    } else {
                        iM55680 = C0946.m55979("ۨۘ") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-5713)) ^ 1937801867;
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        /*
            Method dump skipped, instruction units count: 2838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C9254.mo3405():void");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21296(C19561 c19561, C10844 c10844) throws C3850 {
        int iM55680;
        int i;
        int i2;
        C20689 c20689;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int iM55682;
        int i6;
        int i7;
        AbstractC17043 abstractC17043;
        C11996 c11996;
        int i8;
        C20689 c206810;
        C20689 c206811;
        C16820 c16820;
        C5738 c5738;
        int iM55683;
        int i9;
        int i10;
        int i11;
        C20689 c206812;
        C5738 c5739;
        C24164 c24164;
        C20689 c206813;
        AbstractC17043 abstractC17044;
        ArrayList arrayList;
        int iM55979;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        ArrayList arrayList2;
        int i15;
        C5738 c57310;
        C24164 c24165;
        C11996 c11997;
        String strM38152;
        C16820 c16821;
        int i16;
        int iM559710;
        int i17;
        int i18;
        c19561 = c19561;
        C10844 c10845 = c10844;
        C6763 c6763 = null;
        int i19 = C0873.f81841;
        int i20 = C1044.f81959;
        int iM559711 = (C0946.m55979("۟ۡ") ^ i20) * (-93);
        int i21 = ((iM559711 ^ i19) * 9611) ^ 1995657560;
        Iterator itM56593 = null;
        String strM56241 = null;
        C16820 c16822 = null;
        String str = null;
        String str2 = null;
        C11996 c11998 = null;
        C14281 c14281 = null;
        ArrayList arrayList3 = null;
        int i22 = 736569528;
        AbstractC17043 abstractC17045 = null;
        int i23 = 0;
        C20689 c206814 = null;
        C20689 c206815 = null;
        Iterator itM56090 = null;
        C24164 c24166 = null;
        InputStream inputStreamM56204 = null;
        int i24 = iM559711 ^ 1983818105;
        int i25 = 0;
        AbstractC17043 abstractC17046 = null;
        ArrayList arrayList4 = null;
        byte[] bArrM27464 = null;
        C5738 c57311 = null;
        C5738 c57312 = null;
        while (true) {
            int i26 = i24 ^ (i21 & (((i22 ^ i19) * 20507) >> 31));
            switch (i26) {
                case -2091358638:
                case 1102133605:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24164 = c24166;
                    c11998 = c11998;
                    i11 = i23;
                    c206813 = c206814;
                    c16822 = c16822;
                    c5739 = c57312;
                    c6763.m15448();
                    long jM56137 = C1012.m56137(arrayList3);
                    if (!C0917.m55854()) {
                        abstractC17044 = abstractC17046;
                        int iM559712 = (C0946.m55979("ۛ۠") + i20) * (-15);
                        i24 = iM559712 ^ (-1478117264);
                        c206814 = c206813;
                        c24166 = c24164;
                        i23 = i11;
                        abstractC17046 = abstractC17044;
                        i21 = ((iM559712 ^ i19) * 22475) ^ (-2051013048);
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = null;
                        c206815 = null;
                        c57312 = c5739;
                        i25 = i25;
                        c16822 = c16822;
                        c11998 = c11998;
                        str = str;
                    } else {
                        C20689 c206816 = new C20689(jM56137);
                        if (C1964.f83032 > 0) {
                            C1036.m56262(c206816, new InterfaceC4595() { // from class: l.᩺ۙܽ
                                @Override // p067l.InterfaceC4595
                                /* JADX INFO: renamed from: ֫ */
                                public final void mo8466(int i27) {
                                    C9254 c9254 = null;
                                    C24164 c24167 = null;
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    int i31 = 298443708;
                                    int i32 = C0866.f81837;
                                    int i33 = C0949.f81897;
                                    int iM559713 = C0946.m55979("֡ܺ") ^ i33;
                                    int i34 = ((iM559713 ^ i32) * 4779) ^ 2108206010;
                                    int i35 = -591770796;
                                    while (true) {
                                        i31 = ((((i31 ^ i32) * (-16203)) >> 31) & i34) ^ (iM559713 ^ i35);
                                        switch (i31) {
                                            case -2122878381:
                                            case 1046965073:
                                                if (C0947.m55997()) {
                                                    iM559713 = C0873.m55680("᩹ۤ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM559713 = (C0946.m55979("ۡۧ") ^ i32) * (-97);
                                                    i34 = ((iM559713 ^ i33) * 1123) ^ (-1937024103);
                                                    i35 = 1586479235;
                                                }
                                                break;
                                            case -2120569629:
                                            case 2031425132:
                                                if (C0906.f81862 >= 0) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = (C0873.m55680("ܶۘ") + i32) * 55;
                                                    i34 = ((iM559713 ^ i33) * 32437) ^ (-1618911904);
                                                    i35 = 234606414;
                                                }
                                                break;
                                            case -1892502539:
                                            case 1681833099:
                                                c24167.m53436(i29 + i30);
                                                break;
                                            case -1849940742:
                                            case 425924472:
                                                C0949.m56012();
                                                break;
                                            case -1776058060:
                                            case 1833357596:
                                                if (!C0863.m55643()) {
                                                    iM559713 = C0873.m55680("᩹ۤ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                }
                                                break;
                                            case -1600039584:
                                            case 900232235:
                                                if (C0917.f81868) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = C0946.m55979("᩺֨") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-7091)) ^ 1311333261;
                                                    i35 = 1478673435;
                                                }
                                                break;
                                            case -1464939577:
                                            case 1297406657:
                                                if (C0863.f81833 <= 0) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = C0873.m55680("᩷ܺ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-30083)) ^ 688299404;
                                                    i35 = 393235051;
                                                }
                                                break;
                                            case -1205428993:
                                            case -329489572:
                                                if (C1044.m56286() <= 0) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = C0873.m55680("ۜۙ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * 20845) ^ 1035063543;
                                                    i35 = 1489828792;
                                                }
                                                break;
                                            case -1153746420:
                                            case -836370962:
                                                C1024.m56209();
                                                C0873.m55678();
                                                iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                i35 = 1502831809;
                                                break;
                                            case -662170155:
                                            case 1546476178:
                                                C1964.m56597();
                                                if (!C0861.f81831) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = (i32 - C0873.m55680("ᩴ۠")) * (-91);
                                                    i34 = ((iM559713 ^ i33) * 19449) ^ 446752331;
                                                    i35 = 121148692;
                                                }
                                                break;
                                            case -494211316:
                                            case -470047821:
                                                c24167 = c9254.f25092;
                                                i28 = 2;
                                                if (C0873.m55678()) {
                                                    iM559713 = C0873.m55680("᩹᩹") ^ i32;
                                                    i34 = ((iM559713 ^ i33) * 2475) ^ (-2028476545);
                                                    i35 = 1224972311;
                                                } else {
                                                    iM559713 = C0873.m55680("ۡۙ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-18449)) ^ 1076420085;
                                                    i35 = 1468930183;
                                                }
                                                break;
                                            case -368157627:
                                            case 99381963:
                                                if (C0917.f81868) {
                                                    iM559713 = (i32 - C0873.m55680("ᩴ۠")) * (-91);
                                                    i34 = ((iM559713 ^ i33) * 19449) ^ 446752331;
                                                    i35 = 121148692;
                                                } else {
                                                    iM559713 = (C0873.m55680("֫᩶") ^ i32) * 51;
                                                    i34 = ((iM559713 ^ i33) * 19347) ^ 529932081;
                                                    i35 = -726053224;
                                                }
                                                break;
                                            case -46975235:
                                            case 140121028:
                                                if (C0912.f81867 <= 0) {
                                                    iM559713 = (C0946.m55979("᩺ۤ") ^ i32) * (-111);
                                                    i34 = ((iM559713 ^ i33) * 17161) ^ (-1826969067);
                                                    i35 = 1502831809;
                                                } else {
                                                    iM559713 = C0946.m55979("۠᩶") ^ i32;
                                                    i34 = ((iM559713 ^ i33) * (-23149)) ^ (-232466688);
                                                    i35 = 538178363;
                                                }
                                                break;
                                            case -13612370:
                                            case 103000423:
                                                c9254 = this.f76243;
                                                if (C1048.m56305() >= 0) {
                                                    iM559713 = C0873.m55680("᩹ۤ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM559713 = (C0946.m55979("ܿܶ") ^ i33) * (-5);
                                                    i34 = ((iM559713 ^ i32) * (-16083)) ^ (-1739927017);
                                                    i35 = 582240248;
                                                }
                                                break;
                                            case 755459960:
                                            case 756438678:
                                                if (RunnableC1014.m56177()) {
                                                    iM559713 = (C0946.m55979("֨᩸") ^ i33) * (-119);
                                                    i34 = ((iM559713 ^ i32) * 18235) ^ 1970598564;
                                                    i35 = 1086580313;
                                                } else {
                                                    iM559713 = C0873.m55680("᩹ۤ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                }
                                                break;
                                            default:
                                                i29 = i27 / i28;
                                                i30 = 50;
                                                if (C0947.m55997()) {
                                                    iM559713 = C0873.m55680("᩹ۤ") ^ i33;
                                                    i34 = ((iM559713 ^ i32) * (-15221)) ^ 553815613;
                                                    i35 = 31302264;
                                                } else {
                                                    iM559713 = (C0873.m55680("֡ᩳ") ^ i32) * 29;
                                                    i34 = ((iM559713 ^ i33) * (-23537)) ^ 466278971;
                                                    i35 = 590855622;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            c206815 = c206816;
                            arrayList4 = new ArrayList(i11);
                            itM56090 = C0989.m56090(arrayList3);
                            i25 = i11;
                            int iM559713 = (C0946.m55979("ۡ֫") + i20) * (-21);
                            i24 = iM559713 ^ 665384988;
                            c206814 = c206813;
                            c57312 = c5739;
                            i21 = ((iM559713 ^ i19) * (-3239)) ^ 103322131;
                            c24166 = c24164;
                            i23 = i11;
                            c16822 = c16822;
                            i22 = i26;
                            bArrM27464 = bArrM27464;
                            arrayList3 = arrayList3;
                            c11998 = c11998;
                            str = str;
                        } else {
                            c206815 = c206816;
                            c206814 = c206813;
                            abstractC17044 = abstractC17046;
                            arrayList = arrayList3;
                            int iM55684 = (C0873.m55680("᩵֨") + i19) * (-125);
                            i21 = 1937582279 ^ ((iM55684 ^ i20) * (-7149));
                            i24 = iM55684 ^ 525810989;
                            c19561 = c19561;
                            c10845 = c10844;
                            c24166 = c24164;
                            i23 = i11;
                            abstractC17046 = abstractC17044;
                            arrayList3 = arrayList;
                            i22 = i26;
                            bArrM27464 = bArrM27464;
                            c57312 = c5739;
                            i25 = i25;
                            c16822 = c16822;
                            c11998 = c11998;
                            str = str;
                        }
                    }
                    break;
                case -2081215596:
                case 2074993841:
                    bArrM27464 = null;
                    int iM55685 = (i19 - C0873.m55680("ܶܰ")) * 61;
                    i24 = iM55685 ^ 271085950;
                    c57312 = c57312;
                    i25 = i25;
                    c24166 = c24166;
                    i21 = ((iM55685 ^ i20) * (-15039)) ^ 820419246;
                    c16822 = c16822;
                    i22 = i26;
                    arrayList3 = arrayList3;
                    c11998 = c11998;
                    str = str;
                    break;
                case -2020533348:
                case 1847166838:
                    c10845.m24987(c57312);
                    C0898.m55804(c10845, bArrM27464);
                    iM55680 = C0946.m55979("ۛۜ") ^ i20;
                    i = ((iM55680 ^ i19) * 27337) ^ 616910105;
                    i2 = 498299897;
                    i24 = iM55680 ^ i2;
                    i21 = i;
                    c16822 = c16822;
                    i22 = i26;
                    c11998 = c11998;
                    break;
                case -2010223194:
                case 674180427:
                    i14 = i26;
                    C11996 c11999 = c11998;
                    c16821 = c16822;
                    bArr = bArrM27464;
                    arrayList2 = arrayList3;
                    c11997 = c11999;
                    c24165 = c24166;
                    String str3 = str;
                    String str4 = str;
                    i15 = i25;
                    c57310 = c57312;
                    C5738 c57313 = c57311;
                    String strM11398 = C5275.m11398(str3, this.f25096, this.f25087, this.f25095, false, this.f25098, arrayList4);
                    if (strM11398 == null) {
                        c57311 = c57313;
                        strM38152 = str4;
                        str2 = strM11398;
                        int iM559714 = C0946.m55979("ۢۢ") ^ i19;
                        i24 = iM559714 ^ (-649914222);
                        c57312 = c57310;
                        i25 = i15;
                        c24166 = c24165;
                        i21 = ((iM559714 ^ i20) * (-26035)) ^ 948684771;
                        c16822 = c16821;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c11998 = c11997;
                        str = strM38152;
                        bArrM27464 = bArr;
                    } else {
                        int iM559715 = (C0946.m55979("᩶ۜ") ^ i20) * 71;
                        i16 = ((iM559715 ^ i19) * 28353) ^ 376380952;
                        i24 = iM559715 ^ (-247155395);
                        c57312 = c57310;
                        i25 = i15;
                        c24166 = c24165;
                        c57311 = c57313;
                        c16822 = c16821;
                        i22 = i14;
                        bArrM27464 = bArr;
                        arrayList3 = arrayList2;
                        c11998 = c11997;
                        str = str4;
                        str2 = strM11398;
                        i21 = i16;
                    }
                    break;
                case -1981185095:
                case -1482926241:
                    i26 = i26;
                    try {
                        C4397 c4397 = new C4397(c14281);
                        c4397.m9151(c16822.f49797);
                        c4397.m9153(c16822.f49796.mo5710());
                        c4397.m9150(str2);
                        c11998 = c11998;
                        try {
                            c4397.m9152(c11998);
                            iM55680 = (C0873.m55680("ۢۘ") + i20) * (-77);
                            c16822 = c16822;
                            i = ((iM55680 ^ i19) * (-11837)) ^ 2013873980;
                            i2 = -2046727343;
                        } catch (C3870 unused) {
                            c16822 = c16822;
                            iM55680 = C0946.m55979("᩶֨") ^ i19;
                            i = ((iM55680 ^ i20) * (-18671)) ^ 1786173164;
                            i2 = 1776628972;
                        }
                    } catch (C3870 unused2) {
                        c11998 = c11998;
                    }
                    i24 = iM55680 ^ i2;
                    i21 = i;
                    c16822 = c16822;
                    i22 = i26;
                    c11998 = c11998;
                    break;
                case -1948616670:
                case -1099682040:
                    i26 = i26;
                    c11998 = c11998;
                    c16822 = c16822;
                    if (bArrM27464 != null) {
                        iM55680 = (C0946.m55979("᩵ۙ") ^ i20) * (-113);
                        i = ((iM55680 ^ i19) * (-28963)) ^ 1303677488;
                        i2 = -1089694830;
                    } else {
                        iM55680 = C0873.m55680("۫֫") ^ i19;
                        i = ((iM55680 ^ i20) * 13107) ^ 127104795;
                        i2 = -989654235;
                    }
                    i24 = iM55680 ^ i2;
                    i21 = i;
                    c16822 = c16822;
                    i22 = i26;
                    c11998 = c11998;
                    break;
                case -1948560716:
                case -103591446:
                    i26 = i26;
                    if (C0967.f81910 >= 0) {
                        iM559710 = (C0873.m55680("۫֨") + i19) * (-5);
                        i17 = ((iM559710 ^ i20) * 31379) ^ 1119065148;
                        i18 = 983842194;
                        i24 = iM559710 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    } else {
                        bArrM27464 = bArrM27464;
                        str = str;
                        i25 = i25;
                        c11998 = c11998;
                        i11 = i23;
                        c206812 = c206815;
                        c16822 = c16822;
                        c5739 = c57312;
                        int iM559716 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                        int i27 = ((iM559716 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM559716 ^ 1569087593;
                        c19561 = c19561;
                        c206815 = c206812;
                        c57312 = c5739;
                        i25 = i25;
                        i23 = i11;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        c11998 = c11998;
                        str = str;
                        c206814 = null;
                        i21 = i27;
                        c10845 = c10844;
                    }
                    break;
                case -1815726330:
                case 1543547693:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    C24164 c24167 = c24166;
                    c11998 = c11998;
                    i11 = i23;
                    C20689 c206817 = c206814;
                    c206812 = c206815;
                    c16822 = c16822;
                    c5739 = c57312;
                    AbstractC17043 abstractC17043M55691 = C0873.m55691(abstractC17045);
                    this.f25097 = abstractC17043M55691;
                    if (C0906.f81862 < 0) {
                        int iM55686 = (C0873.m55680("ܺۚ") ^ i19) * (-31);
                        int i28 = ((iM55686 ^ i20) * (-13979)) ^ (-1031340311);
                        i24 = iM55686 ^ 555661544;
                        c10845 = c10844;
                        abstractC17046 = abstractC17043M55691;
                        c206815 = c206812;
                        c206814 = c206817;
                        c57312 = c5739;
                        c24166 = c24167;
                        i23 = i11;
                        i21 = i28;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        c19561 = c19561;
                        i25 = i25;
                        str = str;
                    } else {
                        abstractC17046 = abstractC17043M55691;
                        c24166 = c24167;
                        arrayList3 = arrayList3;
                        int iM559717 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                        int i29 = ((iM559717 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM559717 ^ 1569087593;
                        c19561 = c19561;
                        c206815 = c206812;
                        c57312 = c5739;
                        i25 = i25;
                        i23 = i11;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        c11998 = c11998;
                        str = str;
                        c206814 = null;
                        i21 = i29;
                        c10845 = c10844;
                    }
                    break;
                case -1779910336:
                case 1232183150:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    c24164 = c24166;
                    c11998 = c11998;
                    i11 = i23;
                    c206813 = c206814;
                    i25 = 1;
                    c16822 = c16822;
                    c5739 = c57312;
                    int iM559718 = (C0946.m55979("ۡ֫") + i20) * (-21);
                    i24 = iM559718 ^ 665384988;
                    c206814 = c206813;
                    c57312 = c5739;
                    i21 = ((iM559718 ^ i19) * (-3239)) ^ 103322131;
                    c24166 = c24164;
                    i23 = i11;
                    c16822 = c16822;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    c11998 = c11998;
                    str = str;
                    break;
                case -1615650749:
                case 1155764866:
                    C1124.m56362(c10845, c57312, c19561);
                    iM55680 = C0946.m55979("ۛۜ") ^ i20;
                    i = ((iM55680 ^ i19) * 27337) ^ 616910105;
                    i2 = 498299897;
                    i24 = iM55680 ^ i2;
                    i21 = i;
                    c16822 = c16822;
                    i22 = i26;
                    c11998 = c11998;
                    break;
                case -1596655286:
                case 74554204:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = (C5738) RunnableC0897.m55785(itM56090);
                    if (!C1048.m56312(this.f25092)) {
                        int iM559719 = C0946.m55979("ۜᩴ") ^ i20;
                        i24 = iM559719 ^ 1444133401;
                        c206815 = c206815;
                        i21 = ((iM559719 ^ i19) * 777) ^ (-191252034);
                        i25 = i25;
                        c24166 = c24166;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        str = str;
                    } else {
                        i23 = i23;
                        c20689 = c206814;
                        int iM55687 = C0873.m55680("ۚۙ") ^ i20;
                        i12 = ((iM55687 ^ i19) * (-8815)) ^ (-911479505);
                        i24 = iM55687 ^ 645831923;
                        c206815 = c206815;
                        c206814 = c20689;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i12;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        i25 = i25;
                        str = str;
                    }
                    break;
                case -1543168736:
                case 1853785507:
                    i14 = i26;
                    bArr = bArrM27464;
                    arrayList2 = arrayList3;
                    i15 = i25;
                    c57310 = c57312;
                    c24165 = c24166;
                    c11997 = c11998;
                    C16820 c16820M55957 = AbstractC0942.m55957(inputStreamM56204);
                    c16820M55957.m38143(c14281, this.f25090, this.f25097);
                    strM38152 = c16820M55957.m38152();
                    if (strM38152 != null) {
                        int iM55688 = (i20 - C0873.m55680("᩶᩵")) * 27;
                        i24 = iM55688 ^ 1231994600;
                        c57312 = c57310;
                        c24166 = c24165;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c11998 = c11997;
                        c16822 = c16820M55957;
                        i21 = ((iM55688 ^ i19) * (-13713)) ^ (-1386374746);
                        i25 = i15;
                    } else {
                        c16821 = c16820M55957;
                        int iM5597110 = C0946.m55979("ۢۢ") ^ i19;
                        i24 = iM5597110 ^ (-649914222);
                        c57312 = c57310;
                        i25 = i15;
                        c24166 = c24165;
                        i21 = ((iM5597110 ^ i20) * (-26035)) ^ 948684771;
                        c16822 = c16821;
                        i22 = i14;
                        arrayList3 = arrayList2;
                        c11998 = c11997;
                    }
                    str = strM38152;
                    bArrM27464 = bArr;
                    break;
                case -1518821091:
                case -1415416244:
                    C0890.m55740();
                    i26 = i26;
                    if (C0894.m55769() < 0) {
                        bArrM27464 = bArrM27464;
                        str = str;
                        i25 = i25;
                        c24164 = c24166;
                        abstractC17044 = abstractC17046;
                        c11998 = c11998;
                        i11 = i23;
                        c206813 = c206814;
                        c206812 = c206815;
                        c16822 = c16822;
                        c5739 = c57312;
                        int iM559720 = C0946.m55979("۫ۗ") ^ i19;
                        i24 = iM559720 ^ 277737068;
                        c206815 = c206812;
                        c206814 = c206813;
                        c24166 = c24164;
                        i23 = i11;
                        abstractC17046 = abstractC17044;
                        i21 = ((iM559720 ^ i20) * 8899) ^ (-673052803);
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c14281 = null;
                        c57312 = c5739;
                        i25 = i25;
                        c16822 = c16822;
                        c11998 = c11998;
                        str = str;
                    } else {
                        iM559710 = (C0873.m55680("۫֨") + i19) * (-5);
                        i17 = ((iM559710 ^ i20) * 31379) ^ 1119065148;
                        i18 = 983842194;
                        i24 = iM559710 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    }
                    break;
                case -1474866183:
                case -268751559:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c16822 = c16822;
                    c57312 = c57312;
                    if (C1194.m56387(c57311) < 2097152) {
                        iM55682 = C0873.m55680("ۢᩴ") ^ i20;
                        i6 = ((iM55682 ^ i19) * (-6349)) ^ (-56142990);
                        i7 = -1364603230;
                        i24 = iM55682 ^ i7;
                        i21 = i6;
                        c57312 = c57312;
                        i25 = i25;
                        c24166 = c24166;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        str = str;
                    } else {
                        i23 = i23;
                        c20689 = c206814;
                        c206815 = c206815;
                        iM55681 = (C0873.m55680("᩸ۙ") + i20) * (-63);
                        i3 = ((iM55681 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                        i24 = iM55681 ^ i4;
                        c206815 = c206815;
                        c206814 = c20689;
                        i25 = i25;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        str = str;
                        c57312 = c57312;
                        c16822 = c16822;
                        c11998 = c11998;
                    }
                    break;
                case -1454320666:
                case -1355996856:
                    i26 = i26;
                    if (C0906.f81862 >= 0) {
                        bArrM27464 = bArrM27464;
                        str = str;
                        i25 = i25;
                        c11998 = c11998;
                        i11 = i23;
                        c206812 = c206815;
                        c16822 = c16822;
                        c5739 = c57312;
                        int iM5597111 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                        int i210 = ((iM5597111 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM5597111 ^ 1569087593;
                        c19561 = c19561;
                        c206815 = c206812;
                        c57312 = c5739;
                        i25 = i25;
                        i23 = i11;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        c11998 = c11998;
                        str = str;
                        c206814 = null;
                        i21 = i210;
                        c10845 = c10844;
                    } else {
                        iM559710 = C0873.m55680("᩹ۗ") ^ i20;
                        i17 = ((iM559710 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM559710 ^ i18;
                        i21 = i17;
                        i22 = i26;
                    }
                    break;
                case -1451643971:
                case -1319877544:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = c57312;
                    this.f25092.m53431(C1028.m56241(c57311));
                    i23 = i23;
                    c20689 = c206814;
                    RunnableC1014.m56171(c20689, i23);
                    if (RunnableC0897.m55788(c57311)) {
                        iM55681 = (C0873.m55680("᩸ۙ") + i20) * (-63);
                        i3 = ((iM55681 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                    } else {
                        iM55681 = C0873.m55680("ܳۢ") ^ i19;
                        i3 = ((iM55681 ^ i20) * 21439) ^ (-1102513929);
                        i4 = -1776968636;
                    }
                    i24 = iM55681 ^ i4;
                    c206815 = c206815;
                    c206814 = c20689;
                    i25 = i25;
                    c24166 = c24166;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    str = str;
                    c57312 = c57312;
                    c16822 = c16822;
                    c11998 = c11998;
                    break;
                case -1440776915:
                case -734896983:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c16822 = c16822;
                    c57312 = c57312;
                    c24166.m53431(strM56241);
                    inputStreamM56204 = C1024.m56204(c19561, c57312);
                    if (C1229.f82066 >= 0) {
                        iM55682 = C0946.m55979("ܶۘ") ^ i19;
                        i6 = ((iM55682 ^ i20) * (-4331)) ^ (-583754074);
                        i7 = 1455681861;
                    } else {
                        iM55682 = (C0873.m55680("᩵ᩳ") + i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM55682 ^ i19) * 11723) ^ (-980648665);
                        i7 = 1318409865;
                    }
                    i24 = iM55682 ^ i7;
                    i21 = i6;
                    c57312 = c57312;
                    i25 = i25;
                    c24166 = c24166;
                    c16822 = c16822;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    c11998 = c11998;
                    str = str;
                    break;
                case -1417022309:
                case -1267368323:
                    i26 = i26;
                    if (C1003.f81929 > 0) {
                        bArrM27464 = bArrM27464;
                        str = str;
                        i25 = i25;
                        abstractC17044 = abstractC17046;
                        c11998 = c11998;
                        i11 = i23;
                        c16822 = c16822;
                        c5739 = c57312;
                        arrayList = arrayList3;
                        c24164 = c24166;
                        int iM55689 = (C0873.m55680("᩵֨") + i19) * (-125);
                        i21 = 1937582279 ^ ((iM55689 ^ i20) * (-7149));
                        i24 = iM55689 ^ 525810989;
                        c19561 = c19561;
                        c10845 = c10844;
                        c24166 = c24164;
                        i23 = i11;
                        abstractC17046 = abstractC17044;
                        arrayList3 = arrayList;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        c57312 = c5739;
                        i25 = i25;
                        c16822 = c16822;
                        c11998 = c11998;
                        str = str;
                    } else {
                        iM559710 = C0873.m55680("᩹ۗ") ^ i20;
                        i17 = ((iM559710 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM559710 ^ i18;
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
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c20689 = c206814;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = c57312;
                    i23 = 1;
                    if (C0930.m55886(itM56593)) {
                        iM55979 = C0873.m55680("۠ۨ") ^ i19;
                        i12 = ((iM55979 ^ i20) * (-13005)) ^ (-1639934628);
                        i13 = 712323191;
                    } else {
                        iM55979 = C0946.m55979("ᩴۛ") ^ i20;
                        i12 = ((iM55979 ^ i19) * (-26273)) ^ 1606248144;
                        i13 = -907472294;
                    }
                    i24 = iM55979 ^ i13;
                    c206815 = c206815;
                    c206814 = c20689;
                    c57312 = c57312;
                    c24166 = c24166;
                    i21 = i12;
                    c16822 = c16822;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    c11998 = c11998;
                    i25 = i25;
                    str = str;
                    break;
                case -1047358173:
                case -81904482:
                    i26 = i26;
                    c11998 = c11998;
                    c20689 = c206814;
                    c16822 = c16822;
                    C1036.m56262(c20689, new InterfaceC4595() { // from class: l.ۨۙܽ
                        @Override // p067l.InterfaceC4595
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo8466(int i30) {
                            C9254 c9254 = null;
                            C24164 c24168 = null;
                            int i31 = -721792407;
                            int i32 = AbstractC0942.f81890;
                            int i33 = C0866.f81837;
                            int iM556810 = (C0873.m55680("ۖܺ") ^ i33) * (-51);
                            int i34 = ((iM556810 ^ i32) * 21585) ^ (-1262107764);
                            int i35 = -1251325270;
                            while (true) {
                                i31 = ((((i31 ^ i32) * (-14841)) >> 31) & i34) ^ (iM556810 ^ i35);
                                switch (i31) {
                                    case -2073446362:
                                    case 2114660746:
                                        c24168 = c9254.f25092;
                                        if (RunnableC0897.f81856) {
                                            iM556810 = (C0946.m55979("֡ۛ") + i32) * (-49);
                                            i34 = ((iM556810 ^ i33) * 16789) ^ (-600591449);
                                            i35 = 702215151;
                                        } else {
                                            iM556810 = (C0873.m55680("֨ᩴ") ^ i33) * (-51);
                                            i34 = ((iM556810 ^ i32) * 3561) ^ (-1767411246);
                                            i35 = 1460066142;
                                        }
                                        break;
                                    case -1979372998:
                                    case 78782394:
                                        AbstractC0942.m55971();
                                        if (C1003.f81929 <= 0) {
                                            iM556810 = C0873.m55680("ܶۖ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        } else {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        }
                                        break;
                                    case -1706518842:
                                    case 2077035421:
                                        if (C1194.m56396() <= 0) {
                                            iM556810 = (C0873.m55680("֨ᩴ") ^ i33) * (-51);
                                            i34 = ((iM556810 ^ i32) * 3561) ^ (-1767411246);
                                            i35 = 1460066142;
                                        } else {
                                            iM556810 = C0946.m55979("᩵ۗ") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 27517) ^ (-1018898669);
                                            i35 = -747104048;
                                        }
                                        break;
                                    case -1703821001:
                                    case -180042543:
                                        C0937.m55918();
                                        C0890.m55740();
                                        break;
                                    case -1611606404:
                                    case 328979420:
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM556810 = C0873.m55680("᩶᩺") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-26151)) ^ 840450559;
                                            i35 = -857647231;
                                        }
                                        break;
                                    case -1596027476:
                                    case -63400443:
                                        if (C0930.f81879 <= 0) {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM556810 = C0946.m55979("ۚۜ") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 16571) ^ 694300571;
                                            i35 = -153127979;
                                        }
                                        break;
                                    case -1382714484:
                                    case 1566216326:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM556810 = C0946.m55979("ۜ۬") ^ i33;
                                            i34 = ((iM556810 ^ i32) * (-19469)) ^ (-923177217);
                                            i35 = -1936957445;
                                        }
                                        break;
                                    case -1343094747:
                                    case 1048619921:
                                        if (RunnableC0897.m55784()) {
                                            iM556810 = C0873.m55680("ܶۖ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        } else {
                                            iM556810 = C0873.m55680("ܳᩳ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-23429)) ^ 1033440362;
                                            i35 = 200337061;
                                        }
                                        break;
                                    case -1218751815:
                                    case 704446100:
                                        if (C1194.f82045 != 0) {
                                            iM556810 = C0946.m55979("ᩳܶ") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM556810 = C0873.m55680("ᩴ۫") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 25557) ^ (-1427291485);
                                            i35 = -860111064;
                                        }
                                        break;
                                    case -868705881:
                                    case 1404031592:
                                        if (C0890.m55740()) {
                                            iM556810 = C0873.m55680("ۖܽ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-31025)) ^ (-1234987872);
                                            i35 = -160114424;
                                        } else {
                                            iM556810 = C0873.m55680("ܶۖ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * 16781) ^ (-395289948);
                                            i35 = 1842466669;
                                        }
                                        break;
                                    case -589168995:
                                    case 391847695:
                                        C0917.m55854();
                                        if (C0854.m55595() < 0) {
                                            iM556810 = C0946.m55979("ᩳܶ") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        }
                                        break;
                                    case -254512101:
                                    case 1818950004:
                                        C1053.m56327();
                                        iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                        i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                        i35 = -858025016;
                                        break;
                                    case -94351944:
                                    case 207123921:
                                        if (C0989.f81920 >= 0) {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM556810 = C0873.m55680("ܽ۬") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-30179)) ^ 1154248251;
                                            i35 = 1889523167;
                                        }
                                        break;
                                    case 641056019:
                                    case 862019675:
                                        c9254 = this.f37282;
                                        if (C0946.m55980() != 0) {
                                            iM556810 = C0946.m55979("ᩳܶ") ^ i33;
                                            i34 = ((iM556810 ^ i32) * 21115) ^ 484716497;
                                            i35 = 1428506394;
                                        } else {
                                            iM556810 = C0946.m55979("ۨ᩹") ^ i33;
                                            i34 = ((iM556810 ^ i32) * (-28775)) ^ 1572576133;
                                            i35 = 1531584180;
                                        }
                                        break;
                                    case 997959310:
                                    case 1255928394:
                                        if (C0882.m55710() != 0) {
                                            iM556810 = C0946.m55979("۬ۨ") ^ i32;
                                            i34 = ((iM556810 ^ i33) * (-13305)) ^ (-2104559870);
                                            i35 = -858025016;
                                        } else {
                                            iM556810 = C0946.m55979("ۙ֨") ^ i33;
                                            i34 = ((iM556810 ^ i32) * (-22355)) ^ 1171369580;
                                            i35 = 804781047;
                                        }
                                        break;
                                    default:
                                        c24168.m53436(i30 / 2);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    itM56593 = C1964.m56593(C1229.m56411(c19561));
                    iM55681 = C0946.m55979("֫ܳ") ^ i19;
                    i3 = ((iM55681 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM55681 ^ i4;
                    c206815 = c206815;
                    c206814 = c20689;
                    i25 = i25;
                    c24166 = c24166;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    str = str;
                    c57312 = c57312;
                    c16822 = c16822;
                    c11998 = c11998;
                    break;
                case -1032743033:
                case 1891959609:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    i23 = i23;
                    c20689 = c206814;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = c57312;
                    c57311 = (C5738) RunnableC0897.m55785(itM56593);
                    if (!C1048.m56312(this.f25092)) {
                        iM55681 = (i19 - C0873.m55680("ܰۘ")) * C0254q.f1218h;
                        i3 = ((iM55681 ^ i20) * (-463)) ^ 2038139003;
                        i4 = -292742757;
                        i24 = iM55681 ^ i4;
                        c206815 = c206815;
                        c206814 = c20689;
                        i25 = i25;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        str = str;
                        c57312 = c57312;
                        c16822 = c16822;
                        c11998 = c11998;
                    } else {
                        i23 = i23;
                        iM55979 = C0946.m55979("ᩴۛ") ^ i20;
                        i12 = ((iM55979 ^ i19) * (-26273)) ^ 1606248144;
                        i13 = -907472294;
                        i24 = iM55979 ^ i13;
                        c206815 = c206815;
                        c206814 = c20689;
                        c57312 = c57312;
                        c24166 = c24166;
                        i21 = i12;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        i25 = i25;
                        str = str;
                    }
                    break;
                case -963563319:
                case -136483830:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    i23 = i23;
                    c20689 = c206814;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = c57312;
                    if (!C0866.m55647(itM56090)) {
                        c57312 = c57312;
                        int iM556810 = C0873.m55680("ۚۙ") ^ i20;
                        i12 = ((iM556810 ^ i19) * (-8815)) ^ (-911479505);
                        i24 = iM556810 ^ 645831923;
                        c206815 = c206815;
                        c206814 = c20689;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i12;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        i25 = i25;
                        str = str;
                    } else {
                        iM55681 = C0946.m55979("ۡܺ") ^ i19;
                        i3 = ((iM55681 ^ i20) * 23167) ^ (-397482865);
                        i4 = 1589749859;
                        i24 = iM55681 ^ i4;
                        c206815 = c206815;
                        c206814 = c20689;
                        i25 = i25;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        str = str;
                        c57312 = c57312;
                        c16822 = c16822;
                        c11998 = c11998;
                    }
                    break;
                case -914576839:
                case 867714727:
                    i26 = i26;
                    C1025.m56230();
                    if (C1229.f82066 < 0) {
                        iM559710 = C0873.m55680("᩹ۗ") ^ i20;
                        i17 = ((iM559710 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                    } else {
                        iM559710 = (i20 - C0946.m55979("ۜ۟")) * (-77);
                        i17 = ((iM559710 ^ i19) * 15971) ^ (-863832003);
                        i18 = 1219024402;
                    }
                    i24 = iM559710 ^ i18;
                    i21 = i17;
                    i22 = i26;
                    break;
                case -898537986:
                case 653406376:
                    i26 = i26;
                    c11998 = c11998;
                    c16822 = c16822;
                    try {
                        c6763.m15449(RunnableC1014.m56167(C1024.m56204(c19561, c57311)).m38146(c14281));
                        C0937.m55917(arrayList3, c57311);
                        c11998 = c11998;
                        c20689 = c206814;
                        iM55681 = C0946.m55979("֫ܳ") ^ i19;
                        i3 = ((iM55681 ^ i20) * 15321) ^ (-655037554);
                        i4 = -462388325;
                        i24 = iM55681 ^ i4;
                        c206815 = c206815;
                        c206814 = c20689;
                        i25 = i25;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        str = str;
                        c57312 = c57312;
                        c16822 = c16822;
                        c11998 = c11998;
                    } catch (Throwable unused3) {
                        iM55680 = C0873.m55680("۫۟") ^ i19;
                        i = ((iM55680 ^ i20) * (-13721)) ^ 1351817127;
                        i2 = 1670007132;
                        i24 = iM55680 ^ i2;
                        i21 = i;
                        c16822 = c16822;
                        i22 = i26;
                        c11998 = c11998;
                    }
                    break;
                case -861563635:
                case -458016043:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    c11998 = c11998;
                    c206815 = c206815;
                    c16822 = c16822;
                    c57312 = c57312;
                    if (C0937.m55909(c57311) <= 10) {
                        i23 = i23;
                        c20689 = c206814;
                        iM55681 = (C0873.m55680("᩸ۙ") + i20) * (-63);
                        i3 = ((iM55681 ^ i19) * (-1605)) ^ 141394000;
                        i4 = 602601274;
                        i24 = iM55681 ^ i4;
                        c206815 = c206815;
                        c206814 = c20689;
                        i25 = i25;
                        c24166 = c24166;
                        i23 = i23;
                        i21 = i3;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        str = str;
                        c57312 = c57312;
                        c16822 = c16822;
                        c11998 = c11998;
                    } else {
                        int iM559721 = (C0946.m55979("ۙᩳ") ^ i19) * 71;
                        i5 = ((iM559721 ^ i20) * (-18519)) ^ 767086172;
                        i24 = iM559721 ^ (-919887395);
                        c206815 = c206815;
                        c57312 = c57312;
                        i25 = i25;
                        c24166 = c24166;
                        i21 = i5;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        str = str;
                    }
                    break;
                case -710118956:
                case 2308739:
                    i26 = i26;
                    AbstractC0942.m55971();
                    if (C1071.f81975 <= 0) {
                        bArrM27464 = bArrM27464;
                        str = str;
                        arrayList3 = arrayList3;
                        i25 = i25;
                        c24166 = c24166;
                        abstractC17043 = abstractC17046;
                        c11996 = c11998;
                        i8 = i23;
                        c206810 = c206814;
                        c206811 = c206815;
                        c16820 = c16822;
                        c5738 = c57312;
                        iM55683 = C0946.m55979("ܺۨ") ^ i20;
                        i9 = ((iM55683 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                        i24 = iM55683 ^ i10;
                        c206815 = c206811;
                        c206814 = c206810;
                        c57312 = c5738;
                        c24166 = c24166;
                        i23 = i8;
                        abstractC17046 = abstractC17043;
                        c16822 = c16820;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11996;
                        i21 = i9;
                        i25 = i25;
                        str = str;
                        c10845 = c10844;
                    }
                    bArrM27464 = bArrM27464;
                    str = str;
                    i25 = i25;
                    c11998 = c11998;
                    i11 = i23;
                    c206812 = c206815;
                    c16822 = c16822;
                    c5739 = c57312;
                    int iM5597112 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                    int i211 = ((iM5597112 ^ i20) * (-3705)) ^ 1347918432;
                    i24 = iM5597112 ^ 1569087593;
                    c19561 = c19561;
                    c206815 = c206812;
                    c57312 = c5739;
                    i25 = i25;
                    i23 = i11;
                    c16822 = c16822;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    c11998 = c11998;
                    str = str;
                    c206814 = null;
                    i21 = i211;
                    c10845 = c10844;
                    break;
                case -565689127:
                case 27906769:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c11998 = c11998;
                    c206812 = c206815;
                    c16822 = c16822;
                    c5739 = c57312;
                    AbstractC0942.m55961(c206812, i25);
                    C24164 c24168 = this.f25092;
                    strM56241 = C1028.m56241(c5739);
                    if (RunnableC0938.f81886 < 0) {
                        int iM559722 = (i19 - C0946.m55979("֨ܽ")) * (-13);
                        i5 = ((iM559722 ^ i20) * (-20907)) ^ 1123936563;
                        i24 = iM559722 ^ (-820878802);
                        c206815 = c206812;
                        c24166 = c24168;
                        c57312 = c5739;
                        i25 = i25;
                        i21 = i5;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        str = str;
                    } else {
                        c24166 = c24168;
                        i11 = i23;
                        arrayList3 = arrayList3;
                        int iM5597113 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                        int i212 = ((iM5597113 ^ i20) * (-3705)) ^ 1347918432;
                        i24 = iM5597113 ^ 1569087593;
                        c19561 = c19561;
                        c206815 = c206812;
                        c57312 = c5739;
                        i25 = i25;
                        i23 = i11;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        c11998 = c11998;
                        str = str;
                        c206814 = null;
                        i21 = i212;
                        c10845 = c10844;
                    }
                    break;
                case -105429352:
                case 861332056:
                    throw new C3850(C0898.m55791(c57312), str, str2);
                case 10035607:
                case 618324215:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    abstractC17043 = abstractC17046;
                    c11996 = c11998;
                    i8 = i23;
                    c206810 = c206814;
                    c206811 = c206815;
                    c16820 = c16822;
                    c5738 = c57312;
                    abstractC17045 = C17853.f53278;
                    if (C0949.f81897 >= 0) {
                        iM55683 = C0946.m55979("ܺۨ") ^ i20;
                        i9 = ((iM55683 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                    } else {
                        iM55683 = C0873.m55680("ܽ᩵") ^ i20;
                        i9 = ((iM55683 ^ i19) * 24909) ^ (-1299688667);
                        i10 = -732217299;
                    }
                    i24 = iM55683 ^ i10;
                    c206815 = c206811;
                    c206814 = c206810;
                    c57312 = c5738;
                    c24166 = c24166;
                    i23 = i8;
                    abstractC17046 = abstractC17043;
                    c16822 = c16820;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    c11998 = c11996;
                    i21 = i9;
                    i25 = i25;
                    str = str;
                    c10845 = c10844;
                    break;
                case 208926817:
                case 1642542699:
                    RunnableC1014.m56177();
                    if (C0946.f81894 == 0) {
                        i26 = i26;
                        iM559710 = C0873.m55680("᩹ۗ") ^ i20;
                        i17 = ((iM559710 ^ i19) * (-26419)) ^ 1457324912;
                        i18 = -2063757744;
                        i24 = iM559710 ^ i18;
                        i21 = i17;
                    } else {
                        int iM559723 = C0946.m55979("ۖ֨") ^ i20;
                        i26 = i26;
                        i21 = ((iM559723 ^ i19) * (-14355)) ^ (-1710655166);
                        i24 = iM559723 ^ 1904777632;
                    }
                    i22 = i26;
                    break;
                case 212182262:
                case 242996198:
                    C0863.m55643();
                    return;
                case 557275471:
                case 1597867363:
                    C16820 c16823 = c16822;
                    C11996 c119910 = new C11996();
                    int iM559724 = (C0946.m55979("᩸ܳ") ^ i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i16 = ((iM559724 ^ i20) * (-21573)) ^ 125585927;
                    i24 = iM559724 ^ (-139251086);
                    c16822 = c16823;
                    i22 = i26;
                    c11998 = c119910;
                    i21 = i16;
                    break;
                case 632318990:
                case 681635217:
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    i25 = i25;
                    c24164 = c24166;
                    c11998 = c11998;
                    i11 = i23;
                    c206813 = c206814;
                    c206812 = c206815;
                    c16822 = c16822;
                    c5739 = c57312;
                    abstractC17044 = abstractC17046;
                    c6763 = new C6763(abstractC17044);
                    if (C0845.f81821 < 0) {
                        c14281 = new C14281(c19561);
                        if (RunnableC1014.f81941 > 0) {
                            arrayList = new ArrayList();
                            int iM44466 = c19561.m44466();
                            if (C0894.f81854 < 0) {
                                C20689 c206818 = new C20689(iM44466);
                                if (!C0890.m55740()) {
                                    c206815 = c206812;
                                    c206814 = c206818;
                                    int iM556811 = (C0873.m55680("᩵֨") + i19) * (-125);
                                    i21 = 1937582279 ^ ((iM556811 ^ i20) * (-7149));
                                    i24 = iM556811 ^ 525810989;
                                    c19561 = c19561;
                                    c10845 = c10844;
                                    c24166 = c24164;
                                    i23 = i11;
                                    abstractC17046 = abstractC17044;
                                    arrayList3 = arrayList;
                                    i22 = i26;
                                    bArrM27464 = bArrM27464;
                                    c57312 = c5739;
                                    i25 = i25;
                                    c16822 = c16822;
                                    c11998 = c11998;
                                    str = str;
                                } else {
                                    int iM559725 = (i20 - C0946.m55979("ۛۛ")) * (-61);
                                    i24 = iM559725 ^ 2040478198;
                                    c206815 = c206812;
                                    c206814 = c206818;
                                    c24166 = c24164;
                                    i23 = i11;
                                    abstractC17046 = abstractC17044;
                                    arrayList3 = arrayList;
                                    i22 = i26;
                                    bArrM27464 = bArrM27464;
                                    i21 = ((iM559725 ^ i19) * 26825) ^ 1021257635;
                                    c57312 = c5739;
                                    i25 = i25;
                                    c16822 = c16822;
                                    c11998 = c11998;
                                    str = str;
                                    c10845 = c10844;
                                }
                            } else {
                                c24166 = c24164;
                                abstractC17046 = abstractC17044;
                                arrayList3 = arrayList;
                                int iM5597114 = (C0946.m55979("ۤ᩺") ^ i19) * (-87);
                                int i213 = ((iM5597114 ^ i20) * (-3705)) ^ 1347918432;
                                i24 = iM5597114 ^ 1569087593;
                                c19561 = c19561;
                                c206815 = c206812;
                                c57312 = c5739;
                                i25 = i25;
                                i23 = i11;
                                c16822 = c16822;
                                i22 = i26;
                                bArrM27464 = bArrM27464;
                                c11998 = c11998;
                                str = str;
                                c206814 = null;
                                i21 = i213;
                                c10845 = c10844;
                            }
                        } else {
                            int iM5597115 = (C0946.m55979("ۛ۠") + i20) * (-15);
                            i24 = iM5597115 ^ (-1478117264);
                            c206814 = c206813;
                            c24166 = c24164;
                            i23 = i11;
                            abstractC17046 = abstractC17044;
                            i21 = ((iM5597115 ^ i19) * 22475) ^ (-2051013048);
                            i22 = i26;
                            bArrM27464 = bArrM27464;
                            arrayList3 = null;
                            c206815 = null;
                            c57312 = c5739;
                            i25 = i25;
                            c16822 = c16822;
                            c11998 = c11998;
                            str = str;
                        }
                    } else {
                        int iM559726 = C0946.m55979("۫ۗ") ^ i19;
                        i24 = iM559726 ^ 277737068;
                        c206815 = c206812;
                        c206814 = c206813;
                        c24166 = c24164;
                        i23 = i11;
                        abstractC17046 = abstractC17044;
                        i21 = ((iM559726 ^ i20) * 8899) ^ (-673052803);
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c14281 = null;
                        c57312 = c5739;
                        i25 = i25;
                        c16822 = c16822;
                        c11998 = c11998;
                        str = str;
                    }
                    break;
                case 715630255:
                case 960133966:
                    i26 = i26;
                    C0967.m56073(c10845, c57311, c19561);
                    c11998 = c11998;
                    c20689 = c206814;
                    c16822 = c16822;
                    iM55681 = C0946.m55979("֫ܳ") ^ i19;
                    i3 = ((iM55681 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM55681 ^ i4;
                    c206815 = c206815;
                    c206814 = c20689;
                    i25 = i25;
                    c24166 = c24166;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    str = str;
                    c57312 = c57312;
                    c16822 = c16822;
                    c11998 = c11998;
                    break;
                case 1092984067:
                case 2052591259:
                    bArrM27464 = c11998.m27464();
                    int iM556812 = (i19 - C0873.m55680("ܶܰ")) * 61;
                    i24 = iM556812 ^ 271085950;
                    c57312 = c57312;
                    i25 = i25;
                    c24166 = c24166;
                    i21 = ((iM556812 ^ i20) * (-15039)) ^ 820419246;
                    c16822 = c16822;
                    i22 = i26;
                    arrayList3 = arrayList3;
                    c11998 = c11998;
                    str = str;
                    break;
                case 1169568737:
                case 1940077497:
                    i26 = i26;
                    C1071.m56343();
                    C0845.m55584();
                    iM559710 = C0873.m55680("᩹ۗ") ^ i20;
                    i17 = ((iM559710 ^ i19) * (-26419)) ^ 1457324912;
                    i18 = -2063757744;
                    i24 = iM559710 ^ i18;
                    i21 = i17;
                    i22 = i26;
                    break;
                case 1245568102:
                case 2114058221:
                    C0894.m55769();
                    i26 = i26;
                    bArrM27464 = bArrM27464;
                    str = str;
                    arrayList3 = arrayList3;
                    i25 = i25;
                    c24166 = c24166;
                    if (C0992.f81922 >= 0) {
                        c11998 = c11998;
                        c16822 = c16822;
                        c57312 = c57312;
                        iM55682 = C0946.m55979("ܶۘ") ^ i19;
                        i6 = ((iM55682 ^ i20) * (-4331)) ^ (-583754074);
                        i7 = 1455681861;
                        i24 = iM55682 ^ i7;
                        i21 = i6;
                        c57312 = c57312;
                        i25 = i25;
                        c24166 = c24166;
                        c16822 = c16822;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11998;
                        str = str;
                    } else {
                        abstractC17043 = abstractC17046;
                        c11996 = c11998;
                        i8 = i23;
                        c206810 = c206814;
                        c206811 = c206815;
                        c16820 = c16822;
                        c5738 = c57312;
                        iM55683 = C0946.m55979("ܺۨ") ^ i20;
                        i9 = ((iM55683 ^ i19) * (-10737)) ^ 855695886;
                        i10 = -1142705775;
                        i24 = iM55683 ^ i10;
                        c206815 = c206811;
                        c206814 = c206810;
                        c57312 = c5738;
                        c24166 = c24166;
                        i23 = i8;
                        abstractC17046 = abstractC17043;
                        c16822 = c16820;
                        i22 = i26;
                        bArrM27464 = bArrM27464;
                        arrayList3 = arrayList3;
                        c11998 = c11996;
                        i21 = i9;
                        i25 = i25;
                        str = str;
                        c10845 = c10844;
                    }
                    break;
                default:
                    i26 = i26;
                    c11998 = c11998;
                    c16822 = c16822;
                    C0967.m56073(c10845, c57311, c19561);
                    c20689 = c206814;
                    iM55681 = C0946.m55979("֫ܳ") ^ i19;
                    i3 = ((iM55681 ^ i20) * 15321) ^ (-655037554);
                    i4 = -462388325;
                    i24 = iM55681 ^ i4;
                    c206815 = c206815;
                    c206814 = c20689;
                    i25 = i25;
                    c24166 = c24166;
                    i23 = i23;
                    i21 = i3;
                    i22 = i26;
                    bArrM27464 = bArrM27464;
                    arrayList3 = arrayList3;
                    str = str;
                    c57312 = c57312;
                    c16822 = c16822;
                    c11998 = c11998;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0149 A[PHI: r8 r9 r11
      0x0149: PHI (r8v3 java.lang.Object[]) = (r8v2 java.lang.Object[]), (r8v1 java.lang.Object[]), (r8v1 java.lang.Object[]), (r8v1 java.lang.Object[]) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r9v3 boolean) = (r9v2 boolean), (r9v1 boolean), (r9v1 boolean), (r9v1 boolean) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v3 java.lang.String), (r11v1 java.lang.String), (r11v1 java.lang.String) binds: [B:38:0x0147, B:29:0x00dc, B:25:0x00b6, B:100:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        C23380 c23380;
        C9254 c9254 = this;
        Main mainM56594 = null;
        int i4 = 0;
        Integer numM55836 = null;
        Integer numM55837 = null;
        int i5 = 0;
        Object[] objArr = null;
        boolean z = false;
        String strM56122 = null;
        String strM55921 = null;
        int i6 = -125773939;
        int i7 = C0912.f81867;
        int i8 = C0873.f81841;
        int iM55682 = (C0873.m55680("ۧۙ") + i8) * 45;
        int i9 = ((iM55682 ^ i7) * (-19841)) ^ (-655148266);
        int i10 = iM55682 ^ (-354757322);
        C23380 c23381 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        ViewOnClickListenerC12568 viewOnClickListenerC12568 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-12989)) >> 31));
            switch (i6) {
                case -1710727480:
                case -734975883:
                    numM55836 = C0912.m55836(i4);
                    C23380 c23382 = c23381;
                    numM55837 = C0912.m55836(c23382.f74494);
                    if (RunnableC1014.f81941 <= 0) {
                        c23381 = c23382;
                        i5 = 2;
                        int iM55979 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM55979 ^ (-342244);
                        c9254 = this;
                    } else {
                        int iM55683 = (i8 - C0873.m55680("᩹ۘ")) * (-67);
                        i10 = iM55683 ^ (-1993721523);
                        c23381 = c23382;
                        i9 = ((iM55683 ^ i7) * (-18691)) ^ 1393429175;
                        i5 = 2;
                    }
                    break;
                case -1657801584:
                case 1381220235:
                    strM55921 = C0937.m55921(f82053, 4, 3, i11);
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0946.m55979("ܿܶ") + i7) * (-27);
                        i = ((iM55680 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM55680 = (C0946.m55979("ܽۘ") ^ i8) * 13;
                        i = ((iM55680 ^ i7) * 235) ^ (-1249774507);
                        i2 = 788998250;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1610902851:
                case -148486430:
                    if (AbstractC0942.f81890 > 0) {
                        int iM559710 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM559710 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM559710 ^ (-342244);
                    } else {
                        c23380 = c23381;
                        int iM55684 = C0873.m55680("᩸ۜ") ^ i7;
                        i10 = iM55684 ^ (-167342746);
                        i9 = ((iM55684 ^ i8) * 20017) ^ (-766021886);
                        c23381 = c23380;
                    }
                    c9254 = this;
                    break;
                case -1519552702:
                case -1244697194:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۘۖ") ^ i8;
                        i = ((iM55680 ^ i7) * 7429) ^ 722257268;
                        i2 = 482640251;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        int iM559711 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM559711 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM559711 ^ (-342244);
                        c9254 = this;
                    }
                    break;
                case -1242085837:
                case 1754419529:
                    mainM56594.m12254(C0873.m55680(strM55921) ^ 2121184182, strM56122, z);
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ܿܶ") + i7) * (-27);
                        i = ((iM55680 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM55680 = (i8 - C0873.m55680("֨᩺")) * (-11);
                        i = ((iM55680 ^ i7) * (-16323)) ^ (-794636796);
                        i2 = -532006585;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1223934900:
                case 463090958:
                    c23381 = c23381;
                    sArr = f82053;
                    c = 0;
                    if (C1404.f82149 >= 0) {
                        iM55681 = C0873.m55680("᩺᩹") ^ i8;
                        i9 = ((iM55681 ^ i7) * (-10557)) ^ 300505048;
                        i3 = -985124156;
                    } else {
                        iM55681 = C0873.m55680("ۜ֡") ^ i7;
                        i9 = ((iM55681 ^ i8) * (-23105)) ^ (-864934403);
                        i3 = -1391870568;
                    }
                    i10 = iM55681 ^ i3;
                    c9254 = this;
                    c23381 = c23381;
                    break;
                case -1137661420:
                case -670128832:
                    C0898.m55800();
                    break;
                case -1049378670:
                case -351068124:
                    i11 = 64863;
                    iM55681 = (i7 - C0873.m55680("ۖᩳ")) * 69;
                    i9 = ((iM55681 ^ i8) * 32483) ^ 1370505279;
                    i3 = -1208177152;
                    i10 = iM55681 ^ i3;
                    c9254 = this;
                    c23381 = c23381;
                    break;
                case -844903514:
                case 1573686674:
                    objArr = new Object[i5];
                    z = false;
                    objArr[0] = numM55836;
                    objArr[1] = numM55837;
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("ܿܶ") + i7) * (-27);
                        i = ((iM55680 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                    } else {
                        iM55680 = (i7 - C0873.m55680("֫ᩴ")) * (-75);
                        i = ((iM55680 ^ i8) * 8907) ^ (-1960729397);
                        i2 = -967520285;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -632299981:
                case 1606408122:
                    C23380 c23383 = c9254.f25098;
                    i4 = c23383.f74495;
                    if (C1194.m56396() <= 0) {
                        c23381 = c23383;
                        int iM559712 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM559712 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM559712 ^ (-342244);
                        c9254 = this;
                    } else {
                        int iM559713 = (C0946.m55979("ۛۚ") ^ i7) * (-3);
                        i9 = ((iM559713 ^ i8) * 9559) ^ (-1849708030);
                        c23381 = c23383;
                        i10 = iM559713 ^ (-1364614313);
                    }
                    break;
                case -483568869:
                case 1180152581:
                    ServiceConnectionC1013.m56157();
                    C0873.m55678();
                    int iM559714 = C0946.m55979("֫ۧ") ^ i7;
                    i9 = ((iM559714 ^ i8) * (-11607)) ^ (-1438118358);
                    i10 = iM559714 ^ (-342244);
                    c9254 = this;
                    break;
                case -424784393:
                case 329459894:
                    strM56122 = C1003.m56122(C0873.m55680(C0912.m55822(sArr2, i12, i13, i11)) ^ 2097490093, objArr);
                    if (!RunnableC0897.m55784()) {
                        iM55680 = (C0873.m55680("۠۫") ^ i7) * 33;
                        i = ((iM55680 ^ i8) * (-8935)) ^ (-15440502);
                        i2 = -279362316;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        c23380 = c23381;
                        int iM55685 = C0873.m55680("᩸ۜ") ^ i7;
                        i10 = iM55685 ^ (-167342746);
                        i9 = ((iM55685 ^ i8) * 20017) ^ (-766021886);
                        c23381 = c23380;
                        c9254 = this;
                    }
                    break;
                case -305554202:
                case 387033069:
                    c23381 = c23381;
                    if (((s * s) + 100841764) - (s * s2) >= 0) {
                        iM55681 = C0946.m55979("۫֨") ^ i8;
                        i9 = ((iM55681 ^ i7) * 5247) ^ 340347399;
                        i3 = -1681656887;
                    } else {
                        iM55681 = C0873.m55680("ۡ᩸") ^ i7;
                        i9 = ((iM55681 ^ i8) * (-25697)) ^ 1056315174;
                        i3 = 524655719;
                    }
                    i10 = iM55681 ^ i3;
                    c9254 = this;
                    c23381 = c23381;
                    break;
                case -289162167:
                case 1834601501:
                    c23381 = c23381;
                    s = sArr[c];
                    s2 = 20084;
                    if (!C0947.m55997()) {
                        iM55681 = (C0946.m55979("ۧۤ") ^ i8) * (-125);
                        i9 = ((iM55681 ^ i7) * 30301) ^ (-1769264998);
                        i3 = 1514099127;
                        i10 = iM55681 ^ i3;
                        c9254 = this;
                        c23381 = c23381;
                    } else {
                        c23381 = c23381;
                        int iM559715 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM559715 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM559715 ^ (-342244);
                        c9254 = this;
                    }
                    break;
                case -225426989:
                case 729668595:
                    c23380 = c23381;
                    ViewOnClickListenerC12568 viewOnClickListenerC12569 = c9254.f25088;
                    mainM56594 = C1964.m56594(viewOnClickListenerC12569.f35311);
                    if (C1404.f82149 >= 0) {
                        viewOnClickListenerC12568 = viewOnClickListenerC12569;
                        int iM55686 = C0873.m55680("᩸ۜ") ^ i7;
                        i10 = iM55686 ^ (-167342746);
                        i9 = ((iM55686 ^ i8) * 20017) ^ (-766021886);
                        c23381 = c23380;
                    } else {
                        int iM55687 = C0873.m55680("ۗۗ") ^ i8;
                        i9 = ((iM55687 ^ i7) * (-3811)) ^ 721945635;
                        c23381 = c23380;
                        viewOnClickListenerC12568 = viewOnClickListenerC12569;
                        i10 = iM55687 ^ (-2130711659);
                    }
                    c9254 = this;
                    break;
                case -98280125:
                case 115029527:
                    RunnableC0871.m55675(viewOnClickListenerC12568.f35311, C0892.m55744(c9254.f25086));
                    break;
                case 18469739:
                case 1182053571:
                    RunnableC0897.m55784();
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0946.m55979("ܿܶ") + i7) * (-27);
                        i = ((iM55680 ^ i8) * (-4467)) ^ 294932131;
                        i2 = 984559788;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        int iM559716 = C0946.m55979("֫ۧ") ^ i7;
                        i9 = ((iM559716 ^ i8) * (-11607)) ^ (-1438118358);
                        i10 = iM559716 ^ (-342244);
                        c9254 = this;
                    }
                    break;
                case 952554969:
                case 1552918596:
                    i11 = 49798;
                    iM55681 = (i7 - C0873.m55680("ۖᩳ")) * 69;
                    i9 = ((iM55681 ^ i8) * 32483) ^ 1370505279;
                    i3 = -1208177152;
                    i10 = iM55681 ^ i3;
                    c9254 = this;
                    c23381 = c23381;
                    break;
                default:
                    sArr2 = f82053;
                    i12 = 1;
                    i13 = 3;
                    if (C0877.f81843 < 0) {
                        iM55680 = (i8 - C0873.m55680("ۙ᩸")) * (-95);
                        i = ((iM55680 ^ i7) * (-701)) ^ 154985048;
                        i2 = -1107197936;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        c23381 = c23381;
                        iM55681 = C0873.m55680("᩺᩹") ^ i8;
                        i9 = ((iM55681 ^ i7) * (-10557)) ^ 300505048;
                        i3 = -985124156;
                        i10 = iM55681 ^ i3;
                        c9254 = this;
                        c23381 = c23381;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C24164 c24164 = null;
        AbstractC17043 abstractC17043 = null;
        AbstractC17043 abstractC17044 = null;
        int i = -791359389;
        int i2 = C1028.f81950;
        int i3 = C0863.f81833;
        int iM55680 = C0873.m55680("ᩴ֡") ^ i2;
        int i4 = ((iM55680 ^ i3) * 11307) ^ (-703166483);
        int i5 = -761479349;
        while (true) {
            i = ((((i ^ i3) * 26045) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2134571783:
                case 1062916202:
                    if (C1048.f81963) {
                        iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM55680 = (C0873.m55680("ۚۢ") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * 3483) ^ 1614927363;
                        i5 = 2138443834;
                    }
                    break;
                case -2122870834:
                case -804262877:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("᩶᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܽۜ")) * 89;
                        i4 = ((iM55680 ^ i3) * (-3813)) ^ (-1406304412);
                        i5 = 1594417673;
                    }
                    break;
                case -2054477513:
                case -1735377393:
                    C1028.m56247();
                    C1048.m56305();
                    iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                    i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                    i5 = 1461142882;
                    break;
                case -1831638378:
                case -1640951617:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0946.m55979("ۛۨ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM55680 = C0873.m55680("ܺۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17543)) ^ (-952975941);
                        i5 = 1291043960;
                    }
                    break;
                case -1761820546:
                case -842160923:
                    AbstractC0942.m55966(abstractC17043);
                    C0863.m55636();
                    abstractC17044 = this.f25097;
                    if (abstractC17044 != null) {
                        iM55680 = (C0873.m55680("᩵᩺") ^ i2) * (-65);
                        i4 = ((iM55680 ^ i3) * 29907) ^ (-1917433078);
                        i5 = 340020719;
                    } else {
                        iM55680 = C0873.m55680("᩵ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-7495)) ^ 1858444776;
                        i5 = 997502875;
                    }
                    break;
                case -1727661211:
                case 408982759:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("᩶᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM55680 = C0873.m55680("ۡۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-19705)) ^ 400351128;
                        i5 = -936158393;
                    }
                    break;
                case -1304471291:
                case -349826726:
                    C1194.m56396();
                    break;
                case -1270428157:
                case -994592851:
                    c24164 = this.f25092;
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0946.m55979("᩹֡") + i2) * 49;
                        i4 = ((iM55680 ^ i3) * (-17027)) ^ 1585145620;
                        i5 = 681911698;
                    } else {
                        iM55680 = C0946.m55979("ۡܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4587) ^ 1642566017;
                        i5 = 210909340;
                    }
                    break;
                case -791100313:
                case -277234020:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("᩶᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM55680 = C0946.m55979("ᩳܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2801)) ^ (-1413404083);
                        i5 = -1853954410;
                    }
                    break;
                case -743668349:
                case 955619011:
                    c24164.m53442();
                    if (C0882.f81846) {
                        iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM55680 = (C0873.m55680("۠ܰ") ^ i3) * (-59);
                        i4 = ((iM55680 ^ i2) * (-9427)) ^ (-1974576305);
                        i5 = -1582615351;
                    }
                    break;
                case -535200612:
                case 484608291:
                    abstractC17043 = this.f25093;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("᩶᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22529)) ^ 1694923402;
                        i5 = -1878603702;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤ۟")) * 83;
                        i4 = ((iM55680 ^ i3) * (-12545)) ^ (-1326903494);
                        i5 = -824711648;
                    }
                    break;
                case -153301394:
                case 30455359:
                    C0892.m55749();
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = (C0946.m55979("ۛۨ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    }
                    break;
                case -153082833:
                case 1439292982:
                    AbstractC0942.m55966(abstractC17044);
                    iM55680 = C0873.m55680("᩵ᩳ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-7495)) ^ 1858444776;
                    i5 = 997502875;
                    break;
                case -140208801:
                case 464321706:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0946.m55979("ۛۨ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM55680 = (C0946.m55979("۠ۗ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i2) * (-25935)) ^ 1235959280;
                        i5 = -686843413;
                    }
                    break;
                case 343517156:
                case 1298361466:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0946.m55979("ۛۨ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 29153) ^ 336639082;
                        i5 = 1580407446;
                    } else {
                        iM55680 = C0873.m55680("ۚ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28017)) ^ 693492276;
                        i5 = -2332274;
                    }
                    break;
                case 597467652:
                case 640669382:
                    break;
                case 789855900:
                case 1274576061:
                    if (!C0866.m55645()) {
                        iM55680 = (C0946.m55979("᩹֡") + i2) * 49;
                        i4 = ((iM55680 ^ i3) * (-17027)) ^ 1585145620;
                        i5 = 681911698;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    }
                    break;
                default:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۛ֫")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-10621)) ^ (-1246125351);
                        i5 = 1461142882;
                    } else {
                        iM55680 = (C0946.m55979("ۢۘ") ^ i2) * 73;
                        i4 = ((iM55680 ^ i3) * (-14109)) ^ (-188400258);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        int iM55979;
        int i;
        short s;
        int iM559710;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        C3850 c3850;
        int i6;
        int iM55681;
        final C9254 c9254 = this;
        Object obj = null;
        final C3850 c3851 = null;
        C20671 c20671M55654 = null;
        DialogInterfaceC2564 dialogInterfaceC2564M56221 = null;
        int iM559711 = 0;
        int i7 = 0;
        String strM55792 = null;
        int iM55682 = 0;
        int i8 = 1029540199;
        int i9 = C1036.f81953;
        int i10 = ServiceConnectionC1013.f81940;
        int iM559712 = C0946.m55979("֫ᩴ") ^ i9;
        int i11 = ((iM559712 ^ i10) * (-21473)) ^ (-2066984203);
        int i12 = iM559712 ^ 20206782;
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
        ViewOnClickListenerC12568 viewOnClickListenerC12568 = null;
        while (true) {
            i8 = i12 ^ ((((i8 ^ i10) * 20099) >> 31) & i11);
            switch (i8) {
                case -2108818428:
                case 921784939:
                    C0906.m55817(c20671M55654, C0946.m55979(strM55792) ^ 2127134156, obj);
                    sArr4 = f82053;
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ܰܿ") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                    } else {
                        iM55979 = C0873.m55680("֡᩹") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-23771)) ^ 505322167;
                        i = -551752905;
                    }
                    i12 = iM55979 ^ i;
                    break;
                case -2103830714:
                case -468709306:
                    strM55792 = C0898.m55792(sArr3, 11, 3, i13);
                    if (!C0967.m56074()) {
                        iM55979 = C0873.m55680("ۨ᩶") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-10315)) ^ 1388342344;
                        i = 1857747450;
                        i12 = iM55979 ^ i;
                    } else {
                        iM55681 = (C0873.m55680("۬ᩴ") + i10) * (-49);
                        c3850 = c3851;
                        i6 = ((iM55681 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C3850 c3852 = c3850;
                        i12 = iM55681 ^ i5;
                        i11 = i6;
                        c3851 = c3852;
                    }
                    break;
                case -1950297364:
                case -327724610:
                    int i17 = i15 + i16;
                    s = s2;
                    int i18 = s + 18990;
                    if ((i18 * i18) - (i17 + i17) <= 0) {
                        iM559710 = (C0873.m55680("ܰۢ") + i9) * (-81);
                        i2 = ((iM559710 ^ i10) * (-31949)) ^ 1987634743;
                        i3 = -1832981796;
                    } else {
                        iM559710 = C0946.m55979("۬ۙ") ^ i10;
                        i2 = ((iM559710 ^ i9) * (-24949)) ^ 1624610;
                        i3 = -54332241;
                    }
                    i12 = iM559710 ^ i3;
                    c9254 = this;
                    s2 = s;
                    i11 = i2;
                    break;
                case -1932291818:
                case 2115413605:
                    boolean z = exc instanceof C3850;
                    ViewOnClickListenerC12568 viewOnClickListenerC12569 = c9254.f25088;
                    if (z) {
                        int iM559713 = C0946.m55979("ۧܽ") ^ i10;
                        viewOnClickListenerC12568 = viewOnClickListenerC12569;
                        obj = null;
                        i12 = iM559713 ^ 1955444527;
                        i11 = ((iM559713 ^ i9) * (-385)) ^ (-759962300);
                    } else {
                        int iM55683 = C0873.m55680("ܿۜ") ^ i9;
                        i11 = ((iM55683 ^ i10) * (-2693)) ^ 743763886;
                        viewOnClickListenerC12568 = viewOnClickListenerC12569;
                        obj = null;
                        i12 = iM55683 ^ (-901043002);
                    }
                    c9254 = this;
                    break;
                case -1866406151:
                case 1667673301:
                    i13 = 30576;
                    int iM55684 = (C0873.m55680("ܽ᩶") ^ i10) * (-31);
                    i11 = ((iM55684 ^ i9) * (-29285)) ^ 1561962759;
                    i12 = iM55684 ^ 805551340;
                    c9254 = this;
                    break;
                case -1736794263:
                case -1658908928:
                    c3851 = (C3850) exc;
                    c20671M55654 = C0866.m55654(C1929.m56560(viewOnClickListenerC12568.f35311));
                    if (C1046.f81962 <= 0) {
                        iM55681 = (C0873.m55680("۬ᩴ") + i10) * (-49);
                        c3850 = c3851;
                        i6 = ((iM55681 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                    } else {
                        iM55681 = (i9 - C0946.m55979("᩻۬")) * 53;
                        c3850 = c3851;
                        i6 = ((iM55681 ^ i10) * (-19999)) ^ (-1910752368);
                        i5 = -863554993;
                    }
                    C3850 c3853 = c3850;
                    i12 = iM55681 ^ i5;
                    i11 = i6;
                    c3851 = c3853;
                    break;
                case -1558214366:
                case -59448009:
                    C1017.m56187();
                    C1404.m56468();
                    break;
                case -1340532152:
                case -226161928:
                    C1194.m56396();
                    iM55979 = C0873.m55680("ܰܿ") ^ i10;
                    i11 = ((iM55979 ^ i9) * (-27985)) ^ 1807194979;
                    i = 1340643933;
                    i12 = iM55979 ^ i;
                    break;
                case -1019622845:
                case -405292926:
                    s = s2;
                    sArr = f82053;
                    c = 7;
                    if (C1012.f81938 < 0) {
                        iM559710 = C0946.m55979("۠ۧ") ^ i10;
                        i2 = ((iM559710 ^ i9) * 481) ^ 816120347;
                        i3 = -426386200;
                        i12 = iM559710 ^ i3;
                        c9254 = this;
                        s2 = s;
                        i11 = i2;
                    } else {
                        s2 = s;
                        iM55680 = (i9 - C0873.m55680("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM55680 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM55680 ^ i4;
                        c9254 = this;
                    }
                    break;
                case -795233376:
                case -244034896:
                    iM559711 = C0946.m55979(C0894.m55773(sArr2, i14, 3, i13));
                    i7 = 2121934015;
                    if (C1012.m56134() > 0) {
                        iM55979 = C0946.m55979("ᩴۖ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 5891) ^ (-113612343);
                        i = 822282454;
                        i12 = iM55979 ^ i;
                    } else {
                        iM55681 = (C0873.m55680("۬ᩴ") + i10) * (-49);
                        c3850 = c3851;
                        i6 = ((iM55681 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C3850 c3854 = c3850;
                        i12 = iM55681 ^ i5;
                        i11 = i6;
                        c3851 = c3854;
                    }
                    break;
                case -713617242:
                case 174257567:
                    s2 = sArr[c];
                    i15 = s2 * s2;
                    i16 = 360620100;
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i9 - C0873.m55680("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM55680 ^ i10) * (-12273));
                        i4 = 157591648;
                    } else {
                        iM55680 = (C0873.m55680("ܺۚ") ^ i9) * 99;
                        i11 = 550451557 ^ ((iM55680 ^ i10) * 23833);
                        i4 = -1043116973;
                    }
                    i12 = iM55680 ^ i4;
                    c9254 = this;
                    break;
                case -609642296:
                case 271965362:
                    i13 = 457;
                    int iM55685 = (C0873.m55680("ܽ᩶") ^ i10) * (-31);
                    i11 = ((iM55685 ^ i9) * (-29285)) ^ 1561962759;
                    i12 = iM55685 ^ 805551340;
                    c9254 = this;
                    break;
                case -570964156:
                case 1620013848:
                    C0861.m55627(c20671M55654, iM559711 ^ i7);
                    C1017.m56182(c20671M55654, C1071.m56350(c3851));
                    sArr3 = f82053;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ܶ֨") + i10) * 91;
                        i11 = ((iM55979 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    } else {
                        iM55979 = (i9 - C0946.m55979("۫ܿ")) * (-115);
                        i11 = ((iM55979 ^ i10) * 4743) ^ 2065981259;
                        i = -893162709;
                    }
                    i12 = iM55979 ^ i;
                    break;
                case -474229189:
                case -432743536:
                    C0927.m55873();
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ܰܿ") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                    } else {
                        iM55979 = (C0946.m55979("ܶ֨") + i10) * 91;
                        i11 = ((iM55979 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    }
                    i12 = iM55979 ^ i;
                    break;
                case -371596327:
                case 885350381:
                    C1124.m56363(c20671M55654, 2125769356 ^ iM55682, obj);
                    dialogInterfaceC2564M56221 = C1025.m56221(c20671M55654);
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("ܶ֨") + i10) * 91;
                        i11 = ((iM55979 ^ i9) * (-27121)) ^ 1183500390;
                        i = 2109311229;
                    } else {
                        iM55979 = (C0946.m55979("۠ܶ") ^ i9) * 53;
                        i11 = ((iM55979 ^ i10) * 3693) ^ (-1407833137);
                        i = -855055523;
                    }
                    i12 = iM55979 ^ i;
                    break;
                case -241575633:
                case 14463579:
                    sArr2 = f82053;
                    i14 = 8;
                    if (C1964.f83032 > 0) {
                        iM55979 = C0946.m55979("᩷۫") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-32609)) ^ 1898796927;
                        i = 395595761;
                        i12 = iM55979 ^ i;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM55680 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM55680 ^ i4;
                        c9254 = this;
                    }
                    break;
                case -108266104:
                case 749268398:
                    C1044.m56272(C1964.m56594(viewOnClickListenerC12568.f35311), exc, obj);
                    break;
                case 187349177:
                case 871093951:
                    iM55682 = C0873.m55680(C1964.m56584(sArr4, 14, 3, i13));
                    if (C0930.f81879 > 0) {
                        iM55979 = C0873.m55680("ۙۜ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-27393)) ^ 1265240462;
                        i = 255467247;
                        i12 = iM55979 ^ i;
                    } else {
                        iM55681 = (C0873.m55680("۬ᩴ") + i10) * (-49);
                        c3850 = c3851;
                        i6 = ((iM55681 ^ i9) * (-10029)) ^ 2001269367;
                        i5 = -1301122220;
                        C3850 c3855 = c3850;
                        i12 = iM55681 ^ i5;
                        i11 = i6;
                        c3851 = c3855;
                    }
                    break;
                case 371822684:
                case 2115800268:
                    if (!C0937.f81884) {
                        iM55979 = (i9 - C0946.m55979("᩶ܽ")) * 43;
                        i11 = ((iM55979 ^ i10) * 7935) ^ (-560592643);
                        i = 564706890;
                        i12 = iM55979 ^ i;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM55680 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM55680 ^ i4;
                        c9254 = this;
                    }
                    break;
                case 1103904619:
                case 1909768096:
                    C0877.m55696();
                    if (C1003.f81929 <= 0) {
                        iM55680 = (i9 - C0873.m55680("۫ۘ")) * 13;
                        i11 = 1462091416 ^ ((iM55680 ^ i10) * (-12273));
                        i4 = 157591648;
                        i12 = iM55680 ^ i4;
                        c9254 = this;
                    } else {
                        iM55979 = C0873.m55680("ܰܿ") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-27985)) ^ 1807194979;
                        i = 1340643933;
                        i12 = iM55979 ^ i;
                    }
                    break;
                default:
                    C0947.m55996(C1229.m56405(dialogInterfaceC2564M56221), new View.OnClickListener(c9254) { // from class: l.ܰۙܽ

                        /* JADX INFO: renamed from: ᩹ۡۗ, reason: not valid java name and contains not printable characters */
                        private static final short[] f82199 = {9121, 14817, -8069, -3526, 12622, 8102, -5933, 26940, 26986, 27007, 27006, 15495, -1246, 4222};

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C9254 f43616;

                        {
                            int i19 = -280914545;
                            int i20 = C0906.f81862;
                            int i21 = ServiceConnectionC1013.f81940;
                            int iM559714 = (i20 - C0946.m55979("ۖۙ")) * (-19);
                            int i22 = ((iM559714 ^ i21) * (-10689)) ^ (-1154784136);
                            int i23 = -2005600929;
                            while (true) {
                                i19 = ((((i19 ^ i21) * (-22563)) >> 31) & i22) ^ (iM559714 ^ i23);
                                switch (i19) {
                                    case -2099138807:
                                    case 2048242774:
                                        C1036.m56257();
                                        C1229.m56410();
                                        iM559714 = C0873.m55680("ۤܶ") ^ i21;
                                        i22 = ((iM559714 ^ i20) * (-32025)) ^ (-523937507);
                                        i23 = -564137243;
                                        break;
                                    case -1995120421:
                                    case -1877008469:
                                        if (C0892.m55749()) {
                                            iM559714 = C0946.m55979("ۘۖ") ^ i21;
                                            i22 = ((iM559714 ^ i20) * 227) ^ (-642626598);
                                            i23 = -1640843976;
                                        } else {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        }
                                        break;
                                    case -1977728489:
                                    case -622641753:
                                        this.f43616 = c9254;
                                        if (C0947.f81895) {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM559714 = C0873.m55680("ۗᩴ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-30279)) ^ (-1657253995);
                                            i23 = -759226234;
                                        }
                                        break;
                                    case -1464206880:
                                    case -364854855:
                                        C0854.m55595();
                                        if (C1964.f83032 > 0) {
                                            iM559714 = (C0946.m55979("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM559714 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        }
                                        break;
                                    case -1429716685:
                                    case 2109176016:
                                        if (C0873.f81841 <= 0) {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM559714 = C0946.m55979("۟ܶ") ^ i21;
                                            i22 = ((iM559714 ^ i20) * (-18345)) ^ 1023975746;
                                            i23 = 1001709489;
                                        }
                                        break;
                                    case -1075541072:
                                    case 256207026:
                                        return;
                                    case -783264572:
                                    case 1491741804:
                                        if (C0992.f81922 >= 0) {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM559714 = C0946.m55979("᩵۟") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-7665)) ^ 1156558818;
                                            i23 = -1133578776;
                                        }
                                        break;
                                    case -683411722:
                                    case -582772224:
                                        if (C0955.f81898) {
                                            iM559714 = (C0946.m55979("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM559714 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM559714 = C0873.m55680("᩶ۨ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-32067)) ^ (-447397860);
                                            i23 = -464910348;
                                        }
                                        break;
                                    case -611162445:
                                    case -257678113:
                                        if (C0946.m55980() != 0) {
                                            iM559714 = C0873.m55680("۠ۡ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-19053)) ^ (-789759503);
                                            i23 = -719462788;
                                        } else {
                                            iM559714 = C0946.m55979("ܿۨ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-15921)) ^ 1357039823;
                                            i23 = -2138594881;
                                        }
                                        break;
                                    case -523047901:
                                    case 1925552822:
                                        if (C0917.m55854()) {
                                            iM559714 = C0946.m55979("ᩴۗ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-28201)) ^ 704186656;
                                            i23 = 2119948300;
                                        } else {
                                            iM559714 = C0946.m55979("ۖ᩶") ^ i20;
                                            i22 = ((iM559714 ^ i21) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ 1092767570;
                                            i23 = 1162385906;
                                        }
                                        break;
                                    case -31900115:
                                    case 703879113:
                                        if (C0894.f81854 >= 0) {
                                            iM559714 = C0873.m55680("۠ۡ") ^ i20;
                                            i22 = ((iM559714 ^ i21) * (-19053)) ^ (-789759503);
                                            i23 = -719462788;
                                        } else {
                                            iM559714 = C0873.m55680("ۤܶ") ^ i21;
                                            i22 = ((iM559714 ^ i20) * (-32025)) ^ (-523937507);
                                            i23 = -564137243;
                                        }
                                        break;
                                    case 797962269:
                                    case 1833676572:
                                        if (C1048.f81963) {
                                            iM559714 = C0946.m55979("֫ۚ") ^ i21;
                                            i22 = ((iM559714 ^ i20) * (-2327)) ^ 1425905398;
                                            i23 = -474862771;
                                        } else {
                                            iM559714 = C0946.m55979("ۖ᩶") ^ i20;
                                            i22 = ((iM559714 ^ i21) * UMErrorCode.E_UM_BE_RAW_OVERSIZE) ^ 1092767570;
                                            i23 = 1162385906;
                                        }
                                        break;
                                    case 834663946:
                                    case 1001660913:
                                        C0947.m55997();
                                        if (RunnableC0871.f81839 < 0) {
                                            iM559714 = (C0946.m55979("ۨ᩶") + i21) * (-59);
                                            i22 = ((iM559714 ^ i20) * 18451) ^ (-267325693);
                                            i23 = 1263970751;
                                        } else {
                                            iM559714 = C0873.m55680("ۤܶ") ^ i21;
                                            i22 = ((iM559714 ^ i20) * (-32025)) ^ (-523937507);
                                            i23 = -564137243;
                                        }
                                        break;
                                    case 849926983:
                                    case 1498285253:
                                        C0992.m56107();
                                        throw new RuntimeException();
                                    case 1077280116:
                                    case 1262586605:
                                        if (C0917.f81868) {
                                            iM559714 = (C0946.m55979("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM559714 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM559714 = (C0946.m55979("ۡۗ") ^ i21) * (-47);
                                            i22 = ((iM559714 ^ i20) * 19933) ^ (-2135668631);
                                            i23 = -141850979;
                                        }
                                        break;
                                    default:
                                        if (C1012.f81938 >= 0) {
                                            iM559714 = (C0946.m55979("ۗۚ") ^ i20) * 23;
                                            i22 = ((iM559714 ^ i21) * (-10217)) ^ 977456067;
                                            i23 = -2106203127;
                                        } else {
                                            iM559714 = (C0873.m55680("᩵ۚ") + i21) * 127;
                                            i22 = ((iM559714 ^ i20) * 6469) ^ (-376662324);
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
                            int iM559714;
                            int i19;
                            int i20;
                            C3850 c3856;
                            short[] sArr5;
                            C4345 c4345;
                            short s3;
                            int iM559715;
                            int i21;
                            int i22;
                            ViewOnClickListenerC15288 viewOnClickListenerC15288 = this;
                            int i23 = 332110052;
                            int i24 = C0992.f81922;
                            int i25 = C0930.f81879;
                            int iM559716 = C0946.m55979("ۗܰ") ^ i25;
                            int i26 = ((iM559716 ^ i24) * (-23959)) ^ (-725081857);
                            int i27 = iM559716 ^ (-1589800657);
                            String str = null;
                            String str2 = null;
                            String strM55750 = null;
                            short[] sArr6 = null;
                            short[] sArr7 = null;
                            short s4 = 0;
                            int iM559717 = 0;
                            int iM55686 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            short s5 = 0;
                            C3850 c3857 = null;
                            String str3 = null;
                            short[] sArr8 = null;
                            C4345 c4345M8965 = null;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                i23 = i27 ^ (i26 & (((i23 ^ i24) * (-17317)) >> 31));
                                switch (i23) {
                                    case -1887425568:
                                    case -252188216:
                                        c3856 = c3857;
                                        sArr5 = sArr8;
                                        str = str;
                                        c4345 = c4345M8965;
                                        s3 = f82199[0];
                                        s5 = 15564;
                                        if (RunnableC1014.f81941 <= 0) {
                                            int iM559718 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c3857 = c3856;
                                            i26 = ((iM559718 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM559718 ^ 1441235723;
                                            c4345M8965 = c4345;
                                            viewOnClickListenerC15288 = this;
                                            str = str;
                                        } else {
                                            int iM55687 = C0873.m55680("ۡ۠") ^ i24;
                                            s4 = s3;
                                            i26 = ((iM55687 ^ i25) * (-9265)) ^ (-782250219);
                                            sArr8 = sArr5;
                                            c4345M8965 = c4345;
                                            c3857 = c3856;
                                            i27 = iM55687 ^ (-1359236343);
                                            str = str;
                                            viewOnClickListenerC15288 = this;
                                        }
                                        break;
                                    case -1669513275:
                                    case 122658464:
                                        c4345M8965.m8971(C1964.m56594(viewOnClickListenerC15288.f43616.f25088.f35311));
                                        break;
                                    case -1577886588:
                                    case 179106934:
                                        str = str;
                                        c4345M8965.m8968(C0873.m55680(strM55750) ^ 2119376317, str);
                                        str3 = c3857.f8289;
                                        if (C1028.f81950 > 0) {
                                            int iM559719 = (C0946.m55979("ܰܽ") ^ i25) * (-5);
                                            c4345M8965 = c4345M8965;
                                            i21 = ((iM559719 ^ i24) * (-7439)) ^ (-2055116277);
                                            i27 = iM559719 ^ 1907267293;
                                            i26 = i21;
                                            c4345M8965 = c4345M8965;
                                            str = str;
                                        } else {
                                            s3 = s4;
                                            c4345 = c4345M8965;
                                            c3856 = c3857;
                                            sArr5 = sArr8;
                                            int iM5597110 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c3857 = c3856;
                                            i26 = ((iM5597110 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM5597110 ^ 1441235723;
                                            c4345M8965 = c4345;
                                            viewOnClickListenerC15288 = this;
                                            str = str;
                                        }
                                        break;
                                    case -1500998530:
                                    case 1364504253:
                                        iM559717 = 2118218726 ^ C0946.m55979(C0937.m55921(sArr7, i31, 3, i32));
                                        if (C0912.f81867 > 0) {
                                            iM559714 = (C0946.m55979("۫ۚ") ^ i25) * 63;
                                            i19 = ((iM559714 ^ i24) * 20367) ^ 488172469;
                                            i20 = 1972296988;
                                            i27 = iM559714 ^ i20;
                                            i26 = i19;
                                        } else {
                                            c3857 = c3857;
                                            sArr8 = sArr8;
                                            str = str;
                                            c4345M8965 = c4345M8965;
                                            iM559715 = (C0873.m55680("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM559715 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                            int i33 = iM559715 ^ i22;
                                            sArr8 = sArr8;
                                            c3857 = c3857;
                                            i27 = i33;
                                            i26 = i21;
                                            c4345M8965 = c4345M8965;
                                            str = str;
                                        }
                                        break;
                                    case -1408309005:
                                    case 881894215:
                                        c4345M8965 = C4345.m8965();
                                        c3857 = c3851;
                                        str = c3857.f8287;
                                        sArr8 = f82199;
                                        if (C1048.f81963) {
                                            iM559714 = (i25 - C0946.m55979("ܽܿ")) * (-27);
                                            i19 = ((iM559714 ^ i24) * 281) ^ (-974066333);
                                            i20 = 962355546;
                                        } else {
                                            iM559714 = C0873.m55680("ܳ᩵") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        }
                                        i27 = iM559714 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1372919146:
                                    case 1742917316:
                                        iM55686 = C0873.m55680(C0912.m55822(f82199, 4, 3, i32));
                                        i28 = 2118684741;
                                        if (C1071.m56343() == 0) {
                                            iM559714 = (C0946.m55979("᩺֨") + i24) * (-83);
                                            i19 = ((iM559714 ^ i25) * (-2595)) ^ (-800724071);
                                            i20 = -1720132930;
                                            i27 = iM559714 ^ i20;
                                            i26 = i19;
                                        } else {
                                            s3 = s4;
                                            c3856 = c3857;
                                            sArr5 = sArr8;
                                            str = str;
                                            c4345 = c4345M8965;
                                            int iM5597111 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c3857 = c3856;
                                            i26 = ((iM5597111 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM5597111 ^ 1441235723;
                                            c4345M8965 = c4345;
                                            viewOnClickListenerC15288 = this;
                                            str = str;
                                        }
                                        break;
                                    case -1305312855:
                                    case 1661043721:
                                        c4345M8965.m8973(str2);
                                        sArr7 = f82199;
                                        i31 = 11;
                                        if (C0955.f81898) {
                                            iM559714 = C0873.m55680("ܳ᩵") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        } else {
                                            iM559714 = (i24 - C0946.m55979("᩶ۡ")) * (-83);
                                            i19 = ((iM559714 ^ i25) * (-9687)) ^ 2079251884;
                                            i20 = -1527195492;
                                        }
                                        i27 = iM559714 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1237085757:
                                    case -962481801:
                                        C0854.m55595();
                                        if (C1964.f83032 > 0) {
                                            iM559714 = C0873.m55680("ܳ᩵") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                        } else {
                                            iM559714 = C0873.m55680("ܿ۬") ^ i25;
                                            i19 = ((iM559714 ^ i24) * 24353) ^ (-1668368693);
                                            i20 = 2064102453;
                                        }
                                        i27 = iM559714 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1056914345:
                                    case -180376421:
                                        c4345M8965.m8967(iM559717);
                                        c4345M8965.m8974(c3857.f8288);
                                        c4345M8965.m8969(C11419.m26414(c3857.f8288));
                                        if (C0930.f81879 <= 0) {
                                            iM559714 = C0946.m55979("᩷ܺ") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-24319)) ^ (-2089306095);
                                            i20 = 1541481360;
                                        } else {
                                            iM559714 = C0873.m55680("ܽ۫") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-6743)) ^ 1289478125;
                                            i20 = 1910264187;
                                        }
                                        i27 = iM559714 ^ i20;
                                        i26 = i19;
                                        break;
                                    case -1018201762:
                                    case 1678267906:
                                        C1012.m56134();
                                        C0937.m55918();
                                        s3 = s4;
                                        c3856 = c3857;
                                        sArr5 = sArr8;
                                        str = str;
                                        c4345 = c4345M8965;
                                        int iM5597112 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                        s4 = s3;
                                        sArr8 = sArr5;
                                        c3857 = c3856;
                                        i26 = ((iM5597112 ^ i24) * 32133) ^ (-1186530142);
                                        i27 = iM5597112 ^ 1441235723;
                                        c4345M8965 = c4345;
                                        viewOnClickListenerC15288 = this;
                                        str = str;
                                        break;
                                    case -439065425:
                                    case 1080085929:
                                        C0967.m56074();
                                        break;
                                    case 478925771:
                                    case 2107919287:
                                        i32 = 2355;
                                        iM559715 = (C0946.m55979("ܽ۬") ^ i24) * (-39);
                                        i21 = ((iM559715 ^ i25) * 22067) ^ 1288300503;
                                        i22 = 1617348628;
                                        int i34 = iM559715 ^ i22;
                                        sArr8 = sArr8;
                                        c3857 = c3857;
                                        i27 = i34;
                                        i26 = i21;
                                        c4345M8965 = c4345M8965;
                                        str = str;
                                        break;
                                    case 574859972:
                                    case 1130030822:
                                        c3857 = c3857;
                                        sArr8 = sArr8;
                                        str = str;
                                        c4345M8965 = c4345M8965;
                                        int i35 = s4 + s5;
                                        if ((i35 * i35) - (62256 * s4) >= 0) {
                                            iM559715 = C0873.m55680("᩻֨") ^ i25;
                                            i21 = ((iM559715 ^ i24) * 23587) ^ 1468392159;
                                            i22 = 124158850;
                                        } else {
                                            iM559715 = (C0946.m55979("ᩴ۫") + i25) * (-67);
                                            i21 = ((iM559715 ^ i24) * (-23619)) ^ (-1633546791);
                                            i22 = -1103976882;
                                        }
                                        int i36 = iM559715 ^ i22;
                                        sArr8 = sArr8;
                                        c3857 = c3857;
                                        i27 = i36;
                                        i26 = i21;
                                        c4345M8965 = c4345M8965;
                                        str = str;
                                        break;
                                    case 702077177:
                                    case 1667139367:
                                        i32 = 26898;
                                        iM559715 = (C0946.m55979("ܽ۬") ^ i24) * (-39);
                                        i21 = ((iM559715 ^ i25) * 22067) ^ 1288300503;
                                        i22 = 1617348628;
                                        int i37 = iM559715 ^ i22;
                                        sArr8 = sArr8;
                                        c3857 = c3857;
                                        i27 = i37;
                                        i26 = i21;
                                        c4345M8965 = c4345M8965;
                                        str = str;
                                        break;
                                    case 725842046:
                                    case 1453288873:
                                        str = str;
                                        c4345M8965 = c4345M8965;
                                        c3857 = c3857;
                                        sArr8 = sArr8;
                                        strM55750 = C0892.m55750(sArr8, 1, 3, i32);
                                        if (C1964.f83032 <= 0) {
                                            iM559715 = (C0873.m55680("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM559715 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                        } else {
                                            iM559715 = C0946.m55979("ۗۡ") ^ i24;
                                            i21 = ((iM559715 ^ i25) * (-22393)) ^ (-1727917434);
                                            i22 = -418535572;
                                        }
                                        int i38 = iM559715 ^ i22;
                                        sArr8 = sArr8;
                                        c3857 = c3857;
                                        i27 = i38;
                                        i26 = i21;
                                        c4345M8965 = c4345M8965;
                                        str = str;
                                        break;
                                    case 751929838:
                                    case 1266009707:
                                        c4345M8965.m8975(C1028.m56235(sArr6, i29, i30, i32));
                                        c4345M8965.m8966();
                                        str2 = c3857.f8288;
                                        if (C1046.m56302() != 0) {
                                            iM559714 = C0873.m55680("ܿ۬") ^ i25;
                                            i19 = ((iM559714 ^ i24) * 24353) ^ (-1668368693);
                                            i20 = 2064102453;
                                        } else {
                                            iM559714 = (C0946.m55979("᩶ܽ") ^ i24) * (-51);
                                            i19 = ((iM559714 ^ i25) * 8503) ^ (-1308647621);
                                            i20 = 447017954;
                                        }
                                        i27 = iM559714 ^ i20;
                                        i26 = i19;
                                        break;
                                    case 1034738213:
                                    case 1160129433:
                                        if (!C0861.f81831) {
                                            s3 = s4;
                                            c3856 = c3857;
                                            sArr5 = sArr8;
                                            str = str;
                                            c4345 = c4345M8965;
                                            int iM5597113 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c3857 = c3856;
                                            i26 = ((iM5597113 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM5597113 ^ 1441235723;
                                            c4345M8965 = c4345;
                                            viewOnClickListenerC15288 = this;
                                            str = str;
                                        } else {
                                            iM559714 = C0946.m55979("᩷ܺ") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-24319)) ^ (-2089306095);
                                            i20 = 1541481360;
                                            i27 = iM559714 ^ i20;
                                            i26 = i19;
                                        }
                                        break;
                                    case 1438265934:
                                    case 1498812782:
                                        if (C1036.m56257() <= 0) {
                                            iM559714 = C0873.m55680("ܳ᩵") ^ i24;
                                            i19 = ((iM559714 ^ i25) * (-1899)) ^ 160303912;
                                            i20 = -1985403312;
                                            i27 = iM559714 ^ i20;
                                            i26 = i19;
                                        } else {
                                            s3 = s4;
                                            c3856 = c3857;
                                            sArr5 = sArr8;
                                            str = str;
                                            c4345 = c4345M8965;
                                            int iM5597114 = (C0946.m55979("ۛܽ") ^ i25) * (-51);
                                            s4 = s3;
                                            sArr8 = sArr5;
                                            c3857 = c3856;
                                            i26 = ((iM5597114 ^ i24) * 32133) ^ (-1186530142);
                                            i27 = iM5597114 ^ 1441235723;
                                            c4345M8965 = c4345;
                                            viewOnClickListenerC15288 = this;
                                            str = str;
                                        }
                                        break;
                                    default:
                                        c4345M8965.m8972(iM55686 ^ i28, str3);
                                        sArr6 = f82199;
                                        i29 = 7;
                                        i30 = 4;
                                        if (ViewOnClickListenerC0939.m55941() < 0) {
                                            iM559714 = C0873.m55680("᩻᩵") ^ i25;
                                            i19 = ((iM559714 ^ i24) * (-12281)) ^ 30940161;
                                            i20 = 40871746;
                                            i27 = iM559714 ^ i20;
                                            i26 = i19;
                                        } else {
                                            c3857 = c3857;
                                            sArr8 = sArr8;
                                            str = str;
                                            c4345M8965 = c4345M8965;
                                            iM559715 = (C0873.m55680("ᩳ᩶") + i25) * 49;
                                            i21 = ((iM559715 ^ i24) * (-19513)) ^ (-1919998669);
                                            i22 = -817030356;
                                            int i39 = iM559715 ^ i22;
                                            sArr8 = sArr8;
                                            c3857 = c3857;
                                            i27 = i39;
                                            i26 = i21;
                                            c4345M8965 = c4345M8965;
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
