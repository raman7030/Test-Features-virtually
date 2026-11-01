package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20953 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f65836 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static C20953 f65837;

    /* JADX INFO: renamed from: ܿ */
    public static long f65838;

    /* JADX INFO: renamed from: ᩳ */
    public static int f65839;

    /* JADX INFO: renamed from: ᩵᩹ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f82952 = {2549, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6940, -6919, -6915, -6923, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6924, -6927, -6940, -6927, 6914, 11266, 11272, 11295, 11269, 11280, 11273, 11332, 11310, 11265, 11290, 11286, 11310, 11288, 11295, 11287, 11294, 11309, 11277, 11266, 11272, 11295, 11269, 11280, 11273, 11358, 11294, 11295, 11293, 11288, 11295, 11284, 11358, 11303, 11316, 11299, 11298, 11320, 11326, 11327, 4517, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18709, 18697, 18697, 18701, 18702, 18759, 18770, 18770, 18709, 18696, 18719, 18771, 18704, 18697, 18771, 18718, 18718, 18770, 18716, 18701, 18708, 18770, 18718, 18706, 18707, 18715, 18708, 18714, 18754, 18699, 18752, 18767, 18763, 18764, 18765, 18764, 18765, 18763, 18764, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18713, 18716, 18697, 18716, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18697, 18708, 18704, 18712, 9063, 21910, 21904, 21911, 21895};

    /* JADX INFO: renamed from: ֫ */
    public Map f65840;

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m47266() {
        short s = f82952[77];
        int i = s + 1;
        int i2 = (i * i) - ((s * 2) + 1) < 0 ? 23752 : 18813;
        synchronized (C20953.class) {
            if (C7050.m16198() && C0992.m56114() - f65838 >= 10000) {
                if (ApplicationC21448.f67649.getInt(C1229.m56403(f82952, 78, 21, i2), 0) != 26101061 || Math.abs(((int) (ViewOnClickListenerC0939.m55944() / 1000)) - f65839) > 3600) {
                    f65838 = C1017.m56192();
                    try {
                        byte[] bArrM14577 = C6370.m14577(C1003.m56132(f82952, 99, 39, i2));
                        for (int i3 = 0; i3 < bArrM14577.length; i3++) {
                            bArrM14577[i3] = (byte) (bArrM14577[i3] ^ (i3 * 3));
                        }
                        String str = new String(bArrM14577, StandardCharsets.UTF_8);
                        C20953 c20953 = new C20953(C6370.m14578(str));
                        f65837 = c20953;
                        f65839 = (int) (C0906.m55808() / 1000);
                        C1194.m56383(C1025.m56231(C0906.m55814(ApplicationC21448.f67649), C0930.m55893(f82952, 138, 18, i2), str).mo27875(26101061, C1194.m56386(f82952, 156, 21, i2)).mo27875(f65839, C0873.m55689(f82952, 177, 18, i2)));
                        m47265(c20953);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c0 A[PHI: r0 r5 r11 r12 r21
      0x00c0: PHI (r0v7 l.۫ۤۡ) = (r0v3 l.۫ۤۡ), (r0v6 l.۫ۤۡ), (r0v3 l.۫ۤۡ) binds: [B:20:0x00be, B:15:0x0094, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r5v3 short[]) = (r5v1 short[]), (r5v2 short[]), (r5v1 short[]) binds: [B:20:0x00be, B:15:0x0094, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:20:0x00be, B:15:0x0094, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:20:0x00be, B:15:0x0094, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r21v3 int) = (r21v2 int), (r21v1 int), (r21v1 int) binds: [B:20:0x00be, B:15:0x0094, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01a5 A[PHI: r20
      0x01a5: PHI (r20v2 int) = (r20v1 int), (r20v3 int) binds: [B:45:0x01a1, B:26:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e6 A[PHI: r17
      0x01e6: PHI (r17v3 short) = (r17v1 short), (r17v4 short) binds: [B:53:0x01e3, B:30:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022e A[PHI: r4 r10 r15
      0x022e: PHI (r4v3 short[]) = (r4v1 short[]), (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:62:0x022c, B:58:0x020e, B:53:0x01e3, B:45:0x01a1, B:18:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r10v5 l.۫ۤۡ) = (r10v3 l.۫ۤۡ), (r10v4 l.۫ۤۡ), (r10v3 l.۫ۤۡ), (r10v3 l.۫ۤۡ), (r10v3 l.۫ۤۡ) binds: [B:62:0x022c, B:58:0x020e, B:53:0x01e3, B:45:0x01a1, B:18:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:62:0x022c, B:58:0x020e, B:53:0x01e3, B:45:0x01a1, B:18:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024e A[PHI: r3 r18
      0x024e: PHI (r3v2 l.᩵ܶ᩷) = (r3v1 l.᩵ܶ᩷), (r3v1 l.᩵ܶ᩷), (r3v3 l.᩵ܶ᩷) binds: [B:65:0x024c, B:62:0x022c, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v3 short) = (r18v2 short), (r18v1 short), (r18v1 short) binds: [B:65:0x024c, B:62:0x022c, B:49:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        int iM55680;
        int i2;
        HashMap map;
        int i3;
        InterfaceC14100 interfaceC14100 = null;
        String strM55734 = null;
        C20953 c20953 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i4 = C0894.f81854;
        int i5 = C0877.f81843;
        int iM55681 = (C0873.m55680("ᩴ۠") + i5) * (-35);
        int i6 = ((iM55681 ^ i4) * 13583) ^ (-291122907);
        int i7 = iM55681 ^ 517319781;
        InterfaceC14100 interfaceC14101 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = -344661398;
        int i13 = 0;
        int i14 = 0;
        HashMap map2 = null;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i4) * 11585) >> 31));
            switch (i12) {
                case -2001990515:
                case 574904557:
                    i = 58512;
                    int iM55682 = (C0873.m55680("᩷ᩳ") ^ i5) * (-7);
                    int i17 = ((iM55682 ^ i4) * 32501) ^ 229021325;
                    map2 = map2;
                    iM55680 = iM55682;
                    i2 = 1244015374;
                    i10 = i;
                    i6 = i17;
                    i7 = iM55680 ^ i2;
                    break;
                case -1939934547:
                case -1008713937:
                    f65837 = new C20953(map2);
                    return;
                case -1918211496:
                case -121683870:
                    i = 48712;
                    int iM55683 = (C0873.m55680("᩷ᩳ") ^ i5) * (-7);
                    int i18 = ((iM55683 ^ i4) * 32501) ^ 229021325;
                    map2 = map2;
                    iM55680 = iM55683;
                    i2 = 1244015374;
                    i10 = i;
                    i6 = i18;
                    i7 = iM55680 ^ i2;
                    break;
                case -1886136175:
                case -950416124:
                    if (i13 - (i16 + i16) <= 0) {
                        iM55680 = (C0946.m55979("۠֨") + i4) * 123;
                        i6 = ((iM55680 ^ i5) * (-21199)) ^ 1721615318;
                        i2 = -614994074;
                    } else {
                        iM55680 = C0873.m55680("᩺۠") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-18589)) ^ 733966604;
                        i2 = 65424355;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1804864608:
                case -5583215:
                    s2 = f82952[0];
                    if (RunnableC0871.f81839 >= 0) {
                        map = map2;
                        int iM55979 = (C0946.m55979("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM55680 = iM55979;
                        i6 = ((iM55979 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        iM55680 = C0873.m55680("ܽ֨") ^ i4;
                        i6 = ((iM55680 ^ i5) * 23731) ^ 1761532773;
                        i2 = 1970304426;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1786735041:
                case -603998589:
                    RunnableC0938.m55938();
                    if (C1028.f81950 > 0) {
                        iM55680 = (i4 - C0946.m55979("ۢ᩷")) * 11;
                        i6 = ((iM55680 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        map = map2;
                        int iM559710 = (C0946.m55979("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM55680 = iM559710;
                        i6 = ((iM559710 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1752113878:
                case 1372554679:
                    interfaceC14101 = ApplicationC21448.f67649;
                    sArr = f82952;
                    i11 = 1;
                    if (AbstractC0942.m55971()) {
                        iM55680 = (i4 - C0946.m55979("ۢ᩷")) * 11;
                        i6 = ((iM55680 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        iM55680 = (C0946.m55979("֫ۧ") ^ i4) * 83;
                        i6 = ((iM55680 ^ i5) * 5763) ^ 117311791;
                        i2 = -1640039096;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1582070216:
                case -930968119:
                    C0930.m55885();
                    if (C0873.f81841 <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۢ᩷")) * 11;
                        i6 = ((iM55680 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        i3 = i16;
                        iM55680 = (i4 - C0873.m55680("᩶᩷")) * 93;
                        i6 = ((iM55680 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1525402880:
                case 166532802:
                    c20953 = new C20953(C6370.m14578(strM55734));
                    if (C1024.f81946) {
                        map = map2;
                        int iM559711 = (C0946.m55979("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM55680 = iM559711;
                        i6 = ((iM559711 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        iM55680 = (C0946.m55979("ۨ֨") ^ i5) * (-125);
                        i6 = ((iM55680 ^ i4) * (-22661)) ^ 600751848;
                        i2 = 1678761194;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1083467566:
                case 246453462:
                    C0946.m55980();
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("֡᩵") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23993)) ^ 174772081;
                        i2 = 805065937;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۢ᩷")) * 11;
                        i6 = ((iM55680 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -1069561653:
                case 1154857711:
                    i3 = (s2 * s2) + 4826809;
                    if (C0854.m55595() >= 0) {
                        iM55680 = (i4 - C0873.m55680("᩶᩷")) * 93;
                        i6 = ((iM55680 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    } else {
                        iM55680 = C0946.m55979("֡ᩴ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 15387) ^ 632113832;
                        i16 = i3;
                        i2 = 1243676830;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -901301009:
                case 1388473934:
                    strM55734 = C0890.m55734(interfaceC14100, C0866.m55652(sArr2, i9, i8, i10), null);
                    if (i14 > 0) {
                        int iM55684 = (C0873.m55680("۬۫") + i5) * 57;
                        map2 = null;
                        iM55680 = iM55684;
                        i6 = ((iM55684 ^ i4) * 31435) ^ 608490615;
                        i2 = -1792201255;
                    } else {
                        map2 = null;
                        iM55680 = (C0946.m55979("ܳۧ") ^ i4) * 53;
                        i6 = ((iM55680 ^ i5) * (-18531)) ^ (-1729022706);
                        i2 = -967185844;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -869702273:
                case 1638276231:
                    ViewOnClickListenerC0939.m55941();
                    throw new RuntimeException();
                case -851748256:
                case -133654840:
                    s = 2197;
                    if (C0906.f81862 >= 0) {
                        i3 = i16;
                        iM55680 = (i4 - C0873.m55680("᩶᩷")) * 93;
                        i6 = ((iM55680 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    } else {
                        iM55680 = C0946.m55979("ܶۧ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 627) ^ 318551842;
                        i2 = -1589946994;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -543229441:
                case 796174818:
                    int i19 = s2 + s;
                    i13 = i19 * i19;
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("֡᩵") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23993)) ^ 174772081;
                        i2 = 805065937;
                    } else {
                        iM55680 = C0946.m55979("ۜ۫") ^ i5;
                        i6 = ((iM55680 ^ i4) * 18039) ^ 975388809;
                        i2 = 1315965273;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case -419329027:
                case 350544287:
                    f65837 = c20953;
                    f65839 = i14;
                    return;
                case -376398900:
                case 1199099365:
                    i14 = interfaceC14101.getInt(C1929.m56558(sArr, i11, i15, i10), 0);
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ܺۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩻ۛ")) * 123;
                        i6 = ((iM55680 ^ i5) * (-2879)) ^ (-1791227150);
                        i2 = -687850324;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case 17983650:
                case 1784982257:
                    C0937.m55918();
                    C0955.m56025();
                    iM55680 = (i4 - C0946.m55979("ۢ᩷")) * 11;
                    i6 = ((iM55680 ^ i5) * 30253) ^ (-217967211);
                    i2 = -667645917;
                    i7 = iM55680 ^ i2;
                    break;
                case 538761375:
                case 1028172483:
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr2 = f82952;
                    i9 = 19;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0873.m55680("ܺۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM55680 = C0946.m55979("᩸ܳ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 16667) ^ (-1111642431);
                        i2 = -544794200;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case 987958373:
                case 1297837813:
                    if (strM55734 != null) {
                        iM55680 = C0946.m55979("۟᩷") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-4031)) ^ (-20310322);
                        i2 = 678222097;
                    } else {
                        iM55680 = (C0946.m55979("ܳۧ") ^ i4) * 53;
                        i6 = ((iM55680 ^ i5) * (-18531)) ^ (-1729022706);
                        i2 = -967185844;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                case 1392256890:
                case 2090465646:
                    i8 = 18;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = C0873.m55680("ܺۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ᩴ᩹")) * (-21);
                        i6 = ((iM55680 ^ i4) * (-8395)) ^ (-126085068);
                        i2 = -1718652825;
                    }
                    i7 = iM55680 ^ i2;
                    break;
                default:
                    map = map2;
                    i15 = 18;
                    if (C0890.f81849 != 0) {
                        int iM559712 = (C0946.m55979("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM55680 = iM559712;
                        i6 = ((iM559712 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        int iM55685 = (C0873.m55680("ۜᩳ") ^ i5) * 65;
                        map2 = map;
                        iM55680 = iM55685;
                        i6 = ((iM55685 ^ i4) * 12007) ^ 114156284;
                        i2 = -874664890;
                    }
                    i7 = iM55680 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47264() {
        long j = 0;
        ExecutorService executorService = null;
        int i = 2014933277;
        int i2 = C0989.f81920;
        int i3 = C1044.f81959;
        int iM55979 = C0946.m55979("᩻۬") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-11647)) ^ 1163650636;
        int i5 = -1582316049;
        while (true) {
            i = ((((i ^ i3) * (-7313)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2127468663:
                case 199718461:
                    if (!C0866.m55645()) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    }
                    break;
                case -1978888479:
                case -937009419:
                    f65838 = j;
                    executorService = C4081.f8987;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("᩹ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4149) ^ (-886140703);
                        i5 = 579734968;
                    } else {
                        iM55979 = C0873.m55680("ۜᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-465)) ^ (-270385800);
                        i5 = 780324408;
                    }
                    break;
                case -1931771146:
                case 1797744755:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM55979 = (C0946.m55979("ۘۖ") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-26575)) ^ 1462338538;
                        i5 = -1262886862;
                    }
                    break;
                case -1726453424:
                case -1287073147:
                    RunnableC0938.m55938();
                    if (C1044.m56286() > 0) {
                        iM55979 = (i2 - C0873.m55680("֨ܿ")) * 81;
                        i4 = ((iM55979 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    }
                    break;
                case -1634913892:
                case 536453187:
                    C1024.m56209();
                    C1229.m56410();
                    break;
                case -1242057067:
                case -676336559:
                    C0854.m55595();
                    if (C1053.f81965 > 0) {
                        iM55979 = (i2 - C0873.m55680("֨ܿ")) * 81;
                        i4 = ((iM55979 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ᩳ᩷")) * 61;
                        i4 = ((iM55979 ^ i2) * 6213) ^ 417302122;
                        i5 = -811515871;
                    }
                    break;
                case -1171678350:
                case 841258781:
                    C0894.m55769();
                    C0989.m56095();
                    iM55979 = C0946.m55979("ܽ֡") ^ i3;
                    i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                    break;
                case -610206793:
                case 582368054:
                    int i6 = 0;
                    if (!C0947.m55997()) {
                        C0873.m55676(executorService, new RunnableC20282(i6));
                    }
                    iM55979 = C0946.m55979("ܽ֡") ^ i3;
                    i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                    break;
                case -250396748:
                case 228677901:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (i2 - C0873.m55680("֨ܿ")) * 81;
                        i4 = ((iM55979 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۘܽ")) * 41;
                        i4 = ((iM55979 ^ i2) * (-23631)) ^ 2064914156;
                        i5 = -1548281379;
                    }
                    break;
                case -180710964:
                case 1847306896:
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM55979 = C0873.m55680("ܿܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-16407)) ^ (-1995762639);
                        i5 = 75527413;
                    }
                    break;
                case 390494838:
                case 1355315766:
                    if (C0967.m56074()) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ᩶") + i3) * (-91);
                        i4 = ((iM55979 ^ i2) * (-22749)) ^ (-1263744092);
                        i5 = -1360240125;
                    }
                    break;
                case 556153983:
                case 1405691840:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM55979 = C0946.m55979("᩸ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-9747)) ^ 933603714;
                        i5 = -496526556;
                    }
                    break;
                case 845355387:
                case 1418601641:
                    f65839 = 0;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ܽ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۘ") ^ i2) * (-75);
                        i4 = ((iM55979 ^ i3) * (-8625)) ^ (-1814717755);
                        i5 = 1091081439;
                    }
                    break;
                case 944722790:
                case 1975886262:
                    j = 0;
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26791)) ^ (-1389138392);
                        i5 = 1023699889;
                    }
                    break;
                default:
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM55979 = C0946.m55979("ۚ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 7113) ^ (-1213760627);
                        i5 = -125604543;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C20953 m47267() {
        return f65837;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m47268(String str, String str2) {
        String str3 = null;
        int i = 1334550467;
        int i2 = C0866.f81837;
        int i3 = C0894.f81854;
        int iM55979 = (i3 - C0946.m55979("᩷ۛ")) * (-97);
        int i4 = ((iM55979 ^ i2) * 27675) ^ 906618302;
        int i5 = 1947143202;
        while (true) {
            i = ((((i ^ i2) * 25563) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2079582643:
                case -1994509252:
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM55979 = C0946.m55979("ۢ֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 493) ^ 1470346728;
                        i5 = 110158901;
                    }
                    break;
                case -1833320950:
                case 258117633:
                    C0955.m56025();
                    return null;
                case -1721748199:
                case -1719657068:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM55979 = (C0873.m55680("֫ᩴ") + i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-5155)) ^ 340819339;
                        i5 = 1781410111;
                    }
                    break;
                case -1679618923:
                case -59708520:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۖᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    } else {
                        iM55979 = C0946.m55979("ܺᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 8499) ^ 971901252;
                        i5 = 351855236;
                    }
                    break;
                case -1453001543:
                case 1671365091:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM55979 = C0946.m55979("ᩴܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 21707) ^ (-762713912);
                        i5 = 716322897;
                    }
                    break;
                case -1429921919:
                case -1063606738:
                    if (!C0877.m55696()) {
                        iM55979 = (C0946.m55979("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM55979 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    }
                    break;
                case -1192080230:
                case 1793261531:
                    return str2;
                case -1070906816:
                case -760480658:
                    C0937.m55918();
                    C0854.m55595();
                    iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                    i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                    i5 = -1289980084;
                    break;
                case -949350150:
                case -628721912:
                    if (C1053.f81965 > 0) {
                        iM55979 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    }
                    break;
                case -642553537:
                case 341146224:
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM55979 = C0873.m55680("۠۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6871)) ^ (-608750045);
                        i5 = -140926569;
                    }
                    break;
                case -601008819:
                case -79213940:
                    return str3;
                case -174959344:
                case 1767639648:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩵") ^ i3) * 67;
                        i4 = ((iM55979 ^ i2) * (-21009)) ^ 2017660062;
                        i5 = -2092380337;
                    }
                    break;
                case 62474955:
                case 102788346:
                    if (C0937.f81884) {
                        iM55979 = (i2 - C0946.m55979("ۨۙ")) * 79;
                        i4 = ((iM55979 ^ i3) * 7963) ^ (-1026526929);
                        i5 = -2083111268;
                    } else {
                        iM55979 = C0873.m55680("ۖᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    }
                    break;
                case 313551833:
                case 1546939215:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM55979 = C0946.m55979("ᩳۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22113) ^ (-2137652237);
                        i5 = 592480079;
                    }
                    break;
                case 360557144:
                case 1994145487:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM55979 = C0873.m55680("۠ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6975)) ^ 199695752;
                        i5 = -1899913167;
                    }
                    break;
                case 597714784:
                case 1484087826:
                    str3 = (String) this.f65840.get(str);
                    if (str3 == null) {
                        iM55979 = C0873.m55680("ۜܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10703)) ^ 1829155615;
                        i5 = 1741799757;
                    } else {
                        iM55979 = (C0873.m55680("ܽۢ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * 21477) ^ 1438407146;
                        i5 = 34583425;
                    }
                    break;
                case 1207499148:
                case 1309679160:
                    C0927.m55873();
                    if (C0866.f81837 < 0) {
                        iM55979 = C0946.m55979("ۙۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM55979 = (C0873.m55680("ۜ᩶") + i2) * 115;
                        i4 = ((iM55979 ^ i3) * (-10245)) ^ (-2614923);
                        i5 = -1752296570;
                    }
                    break;
                default:
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM55979 = C0873.m55680("ܿ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23503)) ^ (-1331441339);
                        i5 = -1744481239;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0258 A[PHI: r2 r16 r17
      0x0258: PHI (r2v3 char) = (r2v2 char), (r2v2 char), (r2v6 char) binds: [B:66:0x0256, B:12:0x0059, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v33 int) = (r16v5 int), (r16v32 int), (r16v35 int) binds: [B:66:0x0256, B:12:0x0059, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r17v17 java.lang.String) = (r17v2 java.lang.String), (r17v16 java.lang.String), (r17v20 java.lang.String) binds: [B:66:0x0256, B:12:0x0059, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0293 A[PHI: r1 r6 r8 r9 r16 r17
      0x0293: PHI (r1v5 short[]) = (r1v2 short[]), (r1v4 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v5 short[]) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v5 int) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v25 int) = (r16v4 int), (r16v6 int), (r16v9 int), (r16v26 int) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r17v12 java.lang.String) = (r17v1 java.lang.String), (r17v3 java.lang.String), (r17v6 java.lang.String), (r17v13 java.lang.String) binds: [B:70:0x0291, B:62:0x0232, B:49:0x018e, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02ca A[PHI: r5 r10 r16 r17
      0x02ca: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:74:0x02c8, B:53:0x01b8, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:74:0x02c8, B:53:0x01b8, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r16v30 int) = (r16v3 int), (r16v8 int), (r16v31 int) binds: [B:74:0x02c8, B:53:0x01b8, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r17v14 java.lang.String) = (r17v0 java.lang.String), (r17v5 java.lang.String), (r17v15 java.lang.String) binds: [B:74:0x02c8, B:53:0x01b8, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m47269(String str) {
        String str2;
        int i;
        int iM55979;
        int i2;
        int i3;
        int iM559710;
        int i4;
        int i5;
        String str3 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 237599609;
        int i11 = C0906.f81862;
        int i12 = C1003.f81929;
        int iM559711 = (i11 - C0946.m55979("ܶۙ")) * (-33);
        int i13 = ((iM559711 ^ i12) * (-4437)) ^ (-1331930192);
        int i14 = 1285345185;
        while (true) {
            int i15 = iM559711 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i12) * (-13673)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2060801251:
                    case -883975660:
                        str2 = str3;
                        i = i7;
                        s = sArr[c];
                        s2 = 818;
                        if (C0967.f81910 >= 0) {
                            iM55979 = (i12 - C0946.m55979("᩻ۨ")) * (-53);
                            i2 = ((iM55979 ^ i11) * (-3555)) ^ (-846817390);
                            i3 = -428108698;
                        } else {
                            iM55979 = (i11 - C0873.m55680("ۤ۬")) * (-87);
                            i2 = ((iM55979 ^ i12) * (-4749)) ^ (-1660116258);
                            i3 = 243471526;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1965679299:
                    case 1275689162:
                        str2 = str3;
                        i = i7;
                        int i16 = s + s2;
                        i6 = i16 * i16;
                        if (C1229.f82066 >= 0) {
                            iM55979 = (C0873.m55680("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM55979 ^ i12) * 18421) ^ (-288905791);
                            i3 = -2068752750;
                        } else {
                            iM55979 = C0946.m55979("᩹ۜ") ^ i12;
                            i2 = ((iM55979 ^ i11) * 32325) ^ (-445296968);
                            i3 = 836927382;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1947627135:
                    case 1150230228:
                        str2 = str3;
                        i = i7;
                        if ((s * s3) - i6 <= 0) {
                            iM55979 = C0873.m55680("ܶۖ") ^ i11;
                            i2 = ((iM55979 ^ i12) * 20355) ^ (-900143219);
                            i3 = -451728334;
                        } else {
                            iM55979 = (C0873.m55680("᩷ܽ") ^ i12) * (-3);
                            i2 = ((iM55979 ^ i11) * 28553) ^ (-650132433);
                            i3 = -861836686;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1942590636:
                    case 446975111:
                        RunnableC1014.m56177();
                        C0927.m55873();
                        iM559711 = (C0873.m55680("᩶ۙ") ^ i11) * 5;
                        i13 = ((iM559711 ^ i12) * (-5685)) ^ 72363232;
                        i14 = 1410070552;
                        break;
                    case -1861744184:
                    case -1693061462:
                        str2 = str3;
                        i = i7;
                        if (C0992.f81922 >= 0) {
                            iM55979 = (i11 - C0873.m55680("֫ܶ")) * 115;
                            i2 = ((iM55979 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                        } else {
                            iM55979 = (i12 - C0946.m55979("ۡܽ")) * (-113);
                            i2 = ((iM55979 ^ i11) * (-267)) ^ 1360245520;
                            i3 = -402085394;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1564499360:
                    case 95024459:
                        if (C1028.f81950 > 0) {
                            iM559711 = (C0873.m55680("᩶ۙ") ^ i11) * 5;
                            i13 = ((iM559711 ^ i12) * (-5685)) ^ 72363232;
                            i14 = 1410070552;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        iM55979 = (C0873.m55680("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM55979 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1509186939:
                    case 323710509:
                        str2 = str3;
                        i = i7;
                        if (C1124.f82007 >= 0) {
                            iM55979 = C0946.m55979("ᩴۘ") ^ i12;
                            i2 = ((iM55979 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM55979 = (i11 - C0873.m55680("᩹֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM55979 ^ i12) * (-8523)) ^ (-2110665033);
                            i3 = -629259165;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1403881938:
                    case -17793642:
                        return C0946.m55974(str3, C1028.m56235(sArr2, i8, i9, i7));
                    case -1351296005:
                    case -828454306:
                        sArr2 = f82952;
                        i8 = 196;
                        if (C1017.f81942 < 0) {
                            iM559711 = C0946.m55979("ܰ۠") ^ i11;
                            i13 = ((iM559711 ^ i12) * 26551) ^ (-2127198652);
                            i14 = 2021595248;
                        }
                        str2 = str3;
                        i = i7;
                        iM55979 = C0946.m55979("ᩴۘ") ^ i12;
                        i2 = ((iM55979 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1246713157:
                    case -84156469:
                        return false;
                    case -1042513382:
                    case -680047637:
                        i9 = 4;
                        if (C0937.f81884) {
                            iM559711 = C0946.m55979("᩺۟") ^ i12;
                            i13 = ((iM559711 ^ i11) * 28953) ^ (-771530034);
                            i14 = -1909975581;
                        }
                        str2 = str3;
                        i = i7;
                        iM55979 = (C0873.m55680("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM55979 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1038455523:
                    case 1243315321:
                        i7 = 21986;
                        iM559710 = C0946.m55979("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((iM559710 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = iM559710 ^ i5;
                        str3 = str2;
                        break;
                    case -947357352:
                    case -626020205:
                        if (C1046.f81962 > 0) {
                            iM559711 = (C0873.m55680("᩶ۙ") ^ i11) * 5;
                            i13 = ((iM559711 ^ i12) * (-5685)) ^ 72363232;
                            i14 = 1410070552;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        iM55979 = C0946.m55979("ᩴۘ") ^ i12;
                        i2 = ((iM55979 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -799205031:
                    case 593688729:
                        str2 = str3;
                        i = i7;
                        if (C0863.f81833 <= 0) {
                            iM55979 = (C0873.m55680("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM55979 ^ i12) * 18421) ^ (-288905791);
                            i3 = -2068752750;
                        } else {
                            iM55979 = C0946.m55979("ۘۨ") ^ i12;
                            i2 = ((iM55979 ^ i11) * (-29671)) ^ 916739507;
                            i3 = -2072894979;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -691655054:
                    case 1208676463:
                        String str4 = (String) this.f65840.get(str);
                        if (str4 != null) {
                            str2 = str4;
                            iM55979 = (C0946.m55979("ܺۗ") + i12) * 59;
                            i = i7;
                            i2 = ((iM55979 ^ i11) * 16547) ^ 928986689;
                            i3 = 1018322617;
                            i15 = iM55979 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        } else {
                            iM559710 = (i12 - C0946.m55979("۠᩵")) * 7;
                            str2 = str4;
                            i4 = ((iM559710 ^ i11) * (-26829)) ^ (-943876326);
                            i5 = 196149774;
                            i13 = i4;
                            i15 = iM559710 ^ i5;
                            str3 = str2;
                        }
                        break;
                    case -563253727:
                    case 551150906:
                        str2 = str3;
                        i = i7;
                        sArr = f82952;
                        if (C1404.f82149 >= 0) {
                            iM55979 = C0946.m55979("ᩴۘ") ^ i12;
                            i2 = ((iM55979 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM55979 = (C0873.m55680("᩹ۡ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i2 = ((iM55979 ^ i12) * 19505) ^ 1104433459;
                            i3 = 1457843626;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 328735869:
                    case 1405439493:
                        str2 = str3;
                        i = i7;
                        s3 = 3272;
                        if (C0890.f81849 != 0) {
                            iM55979 = C0946.m55979("ᩴۘ") ^ i12;
                            i2 = ((iM55979 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM55979 = (i11 - C0946.m55979("ᩴ᩸")) * 73;
                            i2 = ((iM55979 ^ i12) * (-29229)) ^ 1913632704;
                            i3 = 1667440414;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 1006077839:
                    case 1099381479:
                        AbstractC0942.m55971();
                        if (!C0967.m56074()) {
                            str2 = str3;
                            i = i7;
                            iM55979 = (i11 - C0873.m55680("֫ܶ")) * 115;
                            i2 = ((iM55979 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                            i15 = iM55979 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        str2 = str3;
                        i = i7;
                        iM55979 = (C0873.m55680("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM55979 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 1060256048:
                    case 1930874896:
                        C1012.m56134();
                        return false;
                    case 1412546276:
                    case 1582477550:
                        i7 = 42133;
                        iM559710 = C0946.m55979("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((iM559710 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = iM559710 ^ i5;
                        str3 = str2;
                        break;
                    default:
                        str2 = str3;
                        i = i7;
                        c = 195;
                        if (C1194.m56396() <= 0) {
                            iM55979 = (i11 - C0873.m55680("֫ܶ")) * 115;
                            i2 = ((iM55979 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                        } else {
                            iM55979 = C0873.m55680("ۜۢ") ^ i12;
                            i2 = ((iM55979 ^ i11) * 7831) ^ (-59311046);
                            i3 = -1487722253;
                        }
                        i15 = iM55979 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03b9 A[PHI: r10 r11 r12 r19 r22
      0x03b9: PHI (r10v3 char) = (r10v2 char), (r10v1 char) binds: [B:114:0x03b7, B:110:0x0393] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r11v2 short) = (r11v1 short), (r11v3 short) binds: [B:114:0x03b7, B:110:0x0393] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:114:0x03b7, B:110:0x0393] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r19v15 java.lang.String[]) = (r19v14 java.lang.String[]), (r19v16 java.lang.String[]) binds: [B:114:0x03b7, B:110:0x0393] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r22v8 int) = (r22v7 int), (r22v9 int) binds: [B:114:0x03b7, B:110:0x0393] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0425 A[PHI: r19 r22
      0x0425: PHI (r19v23 java.lang.String[]) = (r19v7 java.lang.String[]), (r19v12 java.lang.String[]), (r19v24 java.lang.String[]) binds: [B:23:0x0095, B:122:0x0423, B:87:0x0292] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r22v16 int) = (r22v0 int), (r22v5 int), (r22v17 int) binds: [B:23:0x0095, B:122:0x0423, B:87:0x0292] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0497 A[PHI: r9 r13 r19 r22
      0x0497: PHI (r9v4 short[]) = (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:130:0x0495, B:106:0x036a, B:28:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r13v4 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:130:0x0495, B:106:0x036a, B:28:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r19v36 java.lang.String[]) = (r19v9 java.lang.String[]), (r19v17 java.lang.String[]), (r19v37 java.lang.String[]) binds: [B:130:0x0495, B:106:0x036a, B:28:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r22v27 int) = (r22v2 int), (r22v10 int), (r22v28 int) binds: [B:130:0x0495, B:106:0x036a, B:28:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m47265(C20953 c20953) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM55979;
        int i7;
        String[] strArr;
        String strM47268 = null;
        String[] strArrM55811 = null;
        int i8 = 0;
        int iM56179 = 0;
        C17182 c17182M38692 = null;
        boolean zM56124 = false;
        int iM56070 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 570689790;
        int i13 = C1404.f82149;
        int i14 = C1053.f81965;
        int iM559710 = C0946.m55979("ܳۚ") ^ i14;
        int i15 = ((iM559710 ^ i13) * (-9213)) ^ (-1342039197);
        int i16 = iM559710 ^ (-2101295017);
        RunnableC17345 runnableC17345 = null;
        int i17 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 21969) >> 31));
            switch (i12) {
                case -2089299836:
                case 936344666:
                    if (C0917.f81868) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM55681 = C0946.m55979("ۗ۬") ^ i14;
                        i3 = ((iM55681 ^ i13) * (-30583)) ^ 329482528;
                        i4 = -539050919;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    }
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    iM55681 = C0946.m55979("۠ۢ") ^ i13;
                    i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -2055735760:
                case -589466164:
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0873.m55680("ۤۚ") ^ i14;
                        i = ((iM55680 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                    } else {
                        iM55680 = C0946.m55979("֫۫") ^ i13;
                        i = ((iM55680 ^ i14) * 30205) ^ 550602314;
                        i2 = -333970897;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case -1959031783:
                case -328338485:
                    C0898.m55800();
                    if (C1003.m56123() == 0) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM55681 = C0946.m55979("᩹ۘ") ^ i14;
                        i3 = ((iM55681 ^ i13) * 23115) ^ (-1363884123);
                        i4 = -394106981;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    } else {
                        iM55680 = C0946.m55979("ۨ֡") ^ i14;
                        i = ((iM55680 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1934633058:
                case -1416134982:
                    if (C1404.f82149 < 0) {
                        iM55680 = C0946.m55979("ۨ֡") ^ i14;
                        i = ((iM55680 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM55681 = C0946.m55979("۠ۢ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    }
                    break;
                case -1896378385:
                case -15144658:
                    if (!zM56124) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM56070 = i17;
                        iM55979 = C0873.m55680("۠᩷") ^ i13;
                        i3 = ((iM55979 ^ i14) * (-29193)) ^ (-689790214);
                        i7 = -1243159260;
                        i5 = iM55979 ^ i7;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    } else {
                        iM55680 = C0873.m55680("᩻֨") ^ i14;
                        i = ((iM55680 ^ i13) * (-27673)) ^ 422349576;
                        i2 = -1620710817;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1813005619:
                case -343781500:
                    RunnableC1014.m56177();
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۤۚ") ^ i14;
                        i = ((iM55680 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } else {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM55681 = C0946.m55979("۠ۢ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    }
                    break;
                case -1790835447:
                case 1339518022:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    s2 = 2516;
                    if (C0898.f81858 <= 0) {
                        iM55681 = C0946.m55979("ۗ۬") ^ i14;
                        i3 = ((iM55681 ^ i13) * (-30583)) ^ 329482528;
                        i4 = -539050919;
                    } else {
                        iM55681 = C0873.m55680("ܳ᩷") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-2403)) ^ 24517666;
                        i4 = 366292576;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -1672793328:
                case 1640770959:
                    if (iM56070 >= iM56179) {
                        i8 = i8;
                        int iM559711 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559711 ^ (-445613752);
                        i15 = ((iM559711 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    } else {
                        iM55680 = C0946.m55979("ܳۢ") ^ i13;
                        i = ((iM55680 ^ i14) * 12529) ^ 1497967914;
                        i2 = 366590948;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1632889163:
                case 295181970:
                    strArrM55811 = C0906.m55811(C1048.m56310(strM47268), C0890.m55726(f82952, 54, 2, i11));
                    i8 = 0;
                    try {
                        iM56179 = RunnableC1014.m56179(strArrM55811[0]);
                        iM55680 = (C0946.m55979("᩷۫") ^ i14) * (-73);
                        i = ((iM55680 ^ i13) * 891) ^ 178379361;
                        i2 = 954992688;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    } catch (Exception unused) {
                        i8 = 0;
                        int iM559712 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559712 ^ (-445613752);
                        i15 = ((iM559712 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1600033648:
                case 775817861:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    int i18 = 1;
                    if (!C0882.f81846) {
                        RunnableC17345 runnableC17346 = new RunnableC17345(i18);
                        if (RunnableC0871.f81839 < 0) {
                            int iM55682 = (C0873.m55680("᩸ۘ") ^ i14) * (-33);
                            int i19 = ((iM55682 ^ i13) * (-15207)) ^ (-2116316517);
                            i6 = iM55682 ^ 637008391;
                            runnableC17345 = runnableC17346;
                            i15 = i19;
                            i8 = i8;
                            strArr = strArrM55811;
                            i16 = i6;
                            strArrM55811 = strArr;
                        } else {
                            runnableC17345 = runnableC17346;
                            iM55681 = C0946.m55979("۠ۢ") ^ i13;
                            i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                            i4 = -1836211981;
                            i5 = iM55681 ^ i4;
                            i8 = i8;
                        }
                    } else {
                        int iM55683 = (i13 - C0873.m55680("ۚ۬")) * (-43);
                        i3 = ((iM55683 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM55683 ^ (-775952340);
                        i8 = i8;
                        runnableC17345 = null;
                    }
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -1475273328:
                case -485437219:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if (strM47268 != null) {
                        iM55979 = C0946.m55979("᩺۟") ^ i14;
                        i3 = ((iM55979 ^ i13) * (-23425)) ^ (-1242689816);
                        i7 = 633801759;
                        i5 = iM55979 ^ i7;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    } else {
                        strArrM55811 = strArrM55811;
                        int iM559713 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559713 ^ (-445613752);
                        i15 = ((iM559713 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1422198278:
                case 273359869:
                    try {
                        iM56070 = C0967.m56070(c17182M38692.m38686());
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                    } catch (Exception unused2) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM56070 = i17;
                    }
                    iM55979 = C0873.m55680("۠᩷") ^ i13;
                    i3 = ((iM55979 ^ i14) * (-29193)) ^ (-689790214);
                    i7 = -1243159260;
                    i5 = iM55979 ^ i7;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -1384881050:
                case 877586494:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    s = sArr[c];
                    i9 = s * s;
                    if (C0992.m56107() <= 0) {
                        iM55681 = C0946.m55979("᩺ۙ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-15999)) ^ 632601049;
                        i4 = 944041832;
                    } else {
                        iM55681 = (C0946.m55979("ۜܳ") ^ i14) * 11;
                        i3 = ((iM55681 ^ i13) * (-25829)) ^ (-1538965610);
                        i4 = -530570480;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -1340388053:
                case 793461587:
                    try {
                        try {
                            strArrM55811 = strArrM55811;
                            i8 = i8;
                            try {
                                c17182M38692 = C1024.m56217(C17853.f53284, C0898.m55792(f82952, 56, 21, i11)).m38692();
                                try {
                                    zM56124 = C1003.m56124(c17182M38692);
                                    iM55979 = C0873.m55680("᩹ۡ") ^ i14;
                                    i3 = ((iM55979 ^ i13) * 16321) ^ 1633790045;
                                    i7 = -884474994;
                                } catch (Exception unused3) {
                                    iM56070 = i17;
                                    iM55979 = C0873.m55680("۠᩷") ^ i13;
                                    i3 = ((iM55979 ^ i14) * (-29193)) ^ (-689790214);
                                    i7 = -1243159260;
                                }
                                i5 = iM55979 ^ i7;
                                i8 = i8;
                                strArr = strArrM55811;
                                i16 = i5;
                                i15 = i3;
                                strArrM55811 = strArr;
                            } catch (Exception unused4) {
                                strArrM55811 = strArrM55811;
                                int iM559714 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                                i16 = iM559714 ^ (-445613752);
                                i15 = ((iM559714 ^ i13) * 12211) ^ 1185305548;
                                i8 = i8;
                            }
                        } catch (Exception unused5) {
                            strArrM55811 = strArrM55811;
                            i8 = i8;
                        }
                    } catch (Exception unused6) {
                        i8 = i8;
                        int iM559715 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559715 ^ (-445613752);
                        i15 = ((iM559715 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1231288456:
                case -295956446:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    sArr = f82952;
                    if (C0947.f81895) {
                        iM55681 = C0946.m55979("ܳܰ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                    } else {
                        iM55681 = C0873.m55680("ܿ۬") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-4589)) ^ 1366916225;
                        i4 = -1094441841;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -1057697948:
                case 1185373133:
                    C0882.m55710();
                    break;
                case -1041007913:
                case 63948438:
                    try {
                        C0946.m55973(C4081.f8987, new RunnableC13338(iM56179, i8, strArrM55811));
                        break;
                    } catch (Exception unused7) {
                    }
                    i8 = i8;
                    int iM559716 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                    i16 = iM559716 ^ (-445613752);
                    i15 = ((iM559716 ^ i13) * 12211) ^ 1185305548;
                    i8 = i8;
                    break;
                case -1040191240:
                case -1010767318:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if ((s * s2) - i10 <= 0) {
                        iM55681 = (C0873.m55680("ۚ᩵") + i14) * 85;
                        i3 = ((iM55681 ^ i13) * (-23291)) ^ (-646936767);
                        i4 = 740823200;
                    } else {
                        iM55681 = (C0946.m55979("ᩴܽ") + i13) * 59;
                        i3 = ((iM55681 ^ i14) * (-9893)) ^ (-136337162);
                        i4 = 988089396;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -979120373:
                case 1560480177:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if (C0946.m55980() != 0) {
                        iM55681 = C0946.m55979("۠ۢ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                    } else {
                        iM55681 = (C0873.m55680("᩻۫") ^ i14) * 75;
                        i3 = ((iM55681 ^ i13) * (-30415)) ^ (-94811861);
                        i4 = -1453953387;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -887494403:
                case 672117396:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if (iM56179 > 14) {
                        int iM559717 = C0946.m55979("ܳ۬") ^ i13;
                        int i20 = ((iM559717 ^ i14) * 20967) ^ (-1243115837);
                        i6 = iM559717 ^ (-77495690);
                        i15 = i20;
                        i8 = i8;
                        i17 = 14;
                        strArr = strArrM55811;
                        i16 = i6;
                        strArrM55811 = strArr;
                    } else {
                        i17 = 14;
                        strArrM55811 = strArrM55811;
                        int iM559718 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559718 ^ (-445613752);
                        i15 = ((iM559718 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -667464745:
                case -36026879:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    try {
                        strM47268 = c20953.m47268(C1036.m56252(f82952, 38, 16, i11), null);
                        iM55681 = C0873.m55680("ۜ۟") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-16853)) ^ 1541750544;
                        i4 = 926559330;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    } catch (Exception unused8) {
                        strArrM55811 = strArrM55811;
                        int iM559719 = (i14 - C0946.m55979("ۨ۠")) * (-39);
                        i16 = iM559719 ^ (-445613752);
                        i15 = ((iM559719 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -604740911:
                case 1321265247:
                    i11 = 11377;
                    iM55681 = C0873.m55680("ۡۤ") ^ i13;
                    i3 = ((iM55681 ^ i14) * 677) ^ 346459494;
                    i4 = -99290726;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -594495341:
                case 1988438192:
                    i11 = 6620;
                    iM55681 = C0873.m55680("ۡۤ") ^ i13;
                    i3 = ((iM55681 ^ i14) * 677) ^ 346459494;
                    i4 = -99290726;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -543271963:
                case 1662622016:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    i10 = i9 + 1582564;
                    if (RunnableC0897.f81856) {
                        iM55681 = (C0873.m55680("ۧ᩷") ^ i14) * 123;
                        i3 = ((iM55681 ^ i13) * (-22081)) ^ 1109477827;
                        i4 = -1109497791;
                    } else {
                        iM55681 = C0946.m55979("ܳܰ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case -479781384:
                case -436363056:
                    break;
                case -24321987:
                case 1726545986:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    c = '%';
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55681 = C0946.m55979("᩺ۙ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-15999)) ^ 632601049;
                        i4 = 944041832;
                    } else {
                        iM55681 = C0873.m55680("ۚᩳ") ^ i13;
                        i3 = ((iM55681 ^ i14) * (-10433)) ^ (-1434783445);
                        i4 = 2036247939;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case 257808413:
                case 942838707:
                    if (C1003.f81929 > 0) {
                        iM55680 = C0946.m55979("ۨ֡") ^ i14;
                        i = ((iM55680 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                    } else {
                        iM55680 = C0873.m55680("ۙܺ") ^ i14;
                        i = ((iM55680 ^ i13) * (-20435)) ^ 568256117;
                        i2 = 1766326406;
                    }
                    i16 = iM55680 ^ i2;
                    i15 = i;
                    break;
                case 441015999:
                case 1736271296:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    C0854.m55606(runnableC17345);
                    int i21 = C9038.f24535;
                    iM55681 = C0946.m55979("᩵᩺") ^ i13;
                    i3 = ((iM55681 ^ i14) * (-30809)) ^ 621053857;
                    i4 = 703803288;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case 787410795:
                case 1561653807:
                    RunnableC0871.m55672();
                    if (C0890.f81849 == 0) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        int iM55684 = (i13 - C0873.m55680("ۚ۬")) * (-43);
                        i3 = ((iM55684 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM55684 ^ (-775952340);
                        i8 = i8;
                        runnableC17345 = null;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    } else {
                        iM55680 = C0873.m55680("ۤۚ") ^ i14;
                        i = ((iM55680 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i16 = iM55680 ^ i2;
                        i15 = i;
                    }
                    break;
                case 1320376693:
                case 1445706091:
                    C1053.m56327();
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    iM55681 = C0946.m55979("۠ۢ") ^ i13;
                    i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case 1443993538:
                case 1571095605:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if (C0890.f81849 != 0) {
                        int iM55685 = (i13 - C0873.m55680("ۚ۬")) * (-43);
                        i3 = ((iM55685 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM55685 ^ (-775952340);
                        i8 = i8;
                        runnableC17345 = null;
                    } else {
                        iM55681 = (i13 - C0873.m55680("۟ᩳ")) * 67;
                        i3 = ((iM55681 ^ i14) * 25127) ^ 452462506;
                        i4 = 1131042387;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                    }
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                case 1794040894:
                case 2012286180:
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    if (C0863.f81833 <= 0) {
                        iM55681 = C0946.m55979("᩹ۘ") ^ i14;
                        i3 = ((iM55681 ^ i13) * 23115) ^ (-1363884123);
                        i4 = -394106981;
                    } else {
                        iM55681 = (C0873.m55680("ۡܺ") + i14) * 5;
                        i3 = ((iM55681 ^ i13) * (-3713)) ^ 2023704976;
                        i4 = 1405127655;
                    }
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
                default:
                    C0946.m55980();
                    if (C1053.f81965 > 0) {
                        strArrM55811 = strArrM55811;
                        i8 = i8;
                        iM55681 = C0946.m55979("ܳܰ") ^ i13;
                        i3 = ((iM55681 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                        i5 = iM55681 ^ i4;
                        i8 = i8;
                        strArr = strArrM55811;
                        i16 = i5;
                        i15 = i3;
                        strArrM55811 = strArr;
                    }
                    strArrM55811 = strArrM55811;
                    i8 = i8;
                    iM55681 = C0946.m55979("۠ۢ") ^ i13;
                    i3 = ((iM55681 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM55681 ^ i4;
                    i8 = i8;
                    strArr = strArrM55811;
                    i16 = i5;
                    i15 = i3;
                    strArrM55811 = strArr;
                    break;
            }
            return;
        }
    }

    public C20953(HashMap map) {
        Map map2 = null;
        int i = 790995826;
        int i2 = C0845.f81821;
        int i3 = C0906.f81862;
        int iM55680 = C0873.m55680("ۧۖ") ^ i3;
        int i4 = ((iM55680 ^ i2) * 16135) ^ 221880658;
        int i5 = 477471767;
        while (true) {
            i = ((((i ^ i2) * (-13799)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2117666067:
                case 127417656:
                    C0937.m55918();
                    if (C0890.f81849 == 0) {
                        iM55680 = (C0946.m55979("۬᩻") + i2) * 85;
                        i4 = ((iM55680 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        iM55680 = C0873.m55680("ۢܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    }
                    break;
                case -2033858766:
                case 136874980:
                    map2 = Collections.EMPTY_MAP;
                    iM55680 = (C0873.m55680("֨ۜ") + i2) * (-107);
                    i4 = ((iM55680 ^ i3) * 28745) ^ (-259112853);
                    i5 = -2005776329;
                    break;
                case -2018300055:
                case -1584037512:
                    if (C0949.m56012()) {
                        iM55680 = (C0946.m55979("۬᩻") + i2) * 85;
                        i4 = ((iM55680 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        iM55680 = C0873.m55680("ۛܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-19011)) ^ 752169645;
                        i5 = -1867890802;
                    }
                    break;
                case -1985601131:
                case -330508438:
                    return;
                case -1588487102:
                case -156032329:
                    C0937.m55918();
                    iM55680 = C0873.m55680("ۢܿ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 32421) ^ 2050488923;
                    i5 = -1586342211;
                    break;
                case -1565008327:
                case 596640163:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴᩳ")) * (-27);
                        i4 = ((iM55680 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩻ۢ")) * (-3);
                        i4 = ((iM55680 ^ i2) * (-5355)) ^ 232571631;
                        i5 = 1106911909;
                    }
                    break;
                case -1530389447:
                case 1932050188:
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ۢܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        iM55680 = (C0873.m55680("ۙܺ") + i3) * 91;
                        i4 = ((iM55680 ^ i2) * 11297) ^ 600521054;
                        i5 = -1712109220;
                    }
                    break;
                case -1330191467:
                case -1290423695:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("ۢܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        iM55680 = C0946.m55979("ܽۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24571) ^ 1501152944;
                        i5 = 231803711;
                    }
                    break;
                case -1283600653:
                case 1148598632:
                    if (map == null) {
                        iM55680 = (i3 - C0873.m55680("۬ܿ")) * 75;
                        i4 = ((iM55680 ^ i2) * (-14851)) ^ 1759547553;
                        i5 = -1047943430;
                    } else {
                        map2 = map;
                        iM55680 = (C0873.m55680("֨ۜ") + i2) * (-107);
                        i4 = ((iM55680 ^ i3) * 28745) ^ (-259112853);
                        i5 = -2005776329;
                    }
                    break;
                case -1210657096:
                case 1812986113:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ܽۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        iM55680 = C0946.m55979("ۨۗ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6847) ^ 1802921452;
                        i5 = -1126680720;
                    }
                    break;
                case -640534429:
                case -572010443:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ܽۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۜ") + i2) * (-115);
                        i4 = ((iM55680 ^ i3) * 249) ^ 2033481325;
                        i5 = 163982364;
                    }
                    break;
                case -633262087:
                case 884304177:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ܺܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM55680 = C0873.m55680("ۢܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    }
                    break;
                case -344353817:
                case -240634531:
                    if (C1124.m56367() >= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴᩳ")) * (-27);
                        i4 = ((iM55680 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM55680 = C0873.m55680("ۚۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29355)) ^ (-620589149);
                        i5 = 557979199;
                    }
                    break;
                case -289222180:
                case 69536887:
                    this.f65840 = map2;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("ܺܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM55680 = (C0873.m55680("᩹۟") ^ i3) * (-83);
                        i4 = ((iM55680 ^ i2) * (-14939)) ^ 1698222175;
                        i5 = -1685517104;
                    }
                    break;
                case -243994291:
                case -231483970:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("ۨۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6507) ^ (-251704503);
                        i5 = 1148320053;
                    } else {
                        iM55680 = C0873.m55680("ܽۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    }
                    break;
                case 242891787:
                case 999365185:
                    C0949.m56012();
                    RunnableC1014.m56177();
                    throw new RuntimeException();
                case 664480393:
                case 1081997012:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("ܺܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM55680 = (C0873.m55680("ۢۢ") ^ i3) * (-27);
                        i4 = ((iM55680 ^ i2) * 503) ^ (-972495938);
                        i5 = -1450391788;
                    }
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴᩳ")) * (-27);
                        i4 = ((iM55680 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM55680 = (C0946.m55979("۬᩻") + i2) * 85;
                        i4 = ((iM55680 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    }
                    break;
            }
        }
    }
}
