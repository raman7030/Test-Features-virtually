package l;

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
public final class C19554 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63216 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19554 f63217;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long f63218;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f63219;

    /* JADX INFO: renamed from: ᩵᩹ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f63220 = {2549, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6940, -6919, -6915, -6923, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6924, -6927, -6940, -6927, 6914, 11266, 11272, 11295, 11269, 11280, 11273, 11332, 11310, 11265, 11290, 11286, 11310, 11288, 11295, 11287, 11294, 11309, 11277, 11266, 11272, 11295, 11269, 11280, 11273, 11358, 11294, 11295, 11293, 11288, 11295, 11284, 11358, 11303, 11316, 11299, 11298, 11320, 11326, 11327, 4517, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18709, 18697, 18697, 18701, 18702, 18759, 18770, 18770, 18709, 18696, 18719, 18771, 18704, 18697, 18771, 18718, 18718, 18770, 18716, 18701, 18708, 18770, 18718, 18706, 18707, 18715, 18708, 18714, 18754, 18699, 18752, 18767, 18763, 18764, 18765, 18764, 18765, 18763, 18764, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18713, 18716, 18697, 18716, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18697, 18708, 18704, 18712, 9063, 21910, 21904, 21911, 21895};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f63221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m44966() {
        short s = f63220[77];
        int i = s + 1;
        int i2 = (i * i) - ((s * 2) + 1) < 0 ? 23752 : 18813;
        synchronized (C19554.class) {
            if (C4925.m14301() && C3019.m9262() - f63218 >= 10000) {
                if (ApplicationC20075.f65008.getInt(C7811.m20837(f63220, 78, 21, i2), 0) != 26101061 || Math.abs(((int) (ViewOnClickListenerC1958.m6432() / 1000)) - f63219) > 3600) {
                    f63218 = C3537.m10751();
                    try {
                        byte[] bArrM12701 = C4210.m12701(C3245.m9934(f63220, 99, 39, i2));
                        for (int i3 = 0; i3 < bArrM12701.length; i3++) {
                            bArrM12701[i3] = (byte) (bArrM12701[i3] ^ (i3 * 3));
                        }
                        String str = new String(bArrM12701, StandardCharsets.UTF_8);
                        C19554 c19554 = new C19554(C4210.m12702(str));
                        f63217 = c19554;
                        f63219 = (int) (C1294.m4371() / 1000);
                        C7106.m19107(C3683.m11223(C1294.m4377(ApplicationC20075.f65008), C1773.m5917(f63220, 138, 18, i2), str).mo25853(26101061, C7106.m19110(f63220, 156, 21, i2)).mo25853(f63219, C0630.m2575(f63220, 177, 18, i2)));
                        m44965(c19554);
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
        int iM2566;
        int i2;
        HashMap map;
        int i3;
        InterfaceC12344 interfaceC12344 = null;
        String strM3407 = null;
        C19554 c19554 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i4 = C1047.f3863;
        int i5 = C0714.f2697;
        int iM2567 = (C0630.m2566("ᩴ۠") + i5) * (-35);
        int i6 = ((iM2567 ^ i4) * 13583) ^ (-291122907);
        int i7 = iM2567 ^ 517319781;
        InterfaceC12344 interfaceC12345 = null;
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
                    int iM2568 = (C0630.m2566("᩷ᩳ") ^ i5) * (-7);
                    int i17 = ((iM2568 ^ i4) * 32501) ^ 229021325;
                    map2 = map2;
                    iM2566 = iM2568;
                    i2 = 1244015374;
                    i10 = i;
                    i6 = i17;
                    i7 = iM2566 ^ i2;
                    break;
                case -1939934547:
                case -1008713937:
                    f63217 = new C19554(map2);
                    return;
                case -1918211496:
                case -121683870:
                    i = 48712;
                    int iM2569 = (C0630.m2566("᩷ᩳ") ^ i5) * (-7);
                    int i18 = ((iM2569 ^ i4) * 32501) ^ 229021325;
                    map2 = map2;
                    iM2566 = iM2569;
                    i2 = 1244015374;
                    i10 = i;
                    i6 = i18;
                    i7 = iM2566 ^ i2;
                    break;
                case -1886136175:
                case -950416124:
                    if (i13 - (i16 + i16) <= 0) {
                        iM2566 = (C2105.m6981("۠֨") + i4) * 123;
                        i6 = ((iM2566 ^ i5) * (-21199)) ^ 1721615318;
                        i2 = -614994074;
                    } else {
                        iM2566 = C0630.m2566("᩺۠") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-18589)) ^ 733966604;
                        i2 = 65424355;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1804864608:
                case -5583215:
                    s2 = f63220[0];
                    if (RunnableC0588.f2309 >= 0) {
                        map = map2;
                        int iM6981 = (C2105.m6981("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM2566 = iM6981;
                        i6 = ((iM6981 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        iM2566 = C0630.m2566("ܽ֨") ^ i4;
                        i6 = ((iM2566 ^ i5) * 23731) ^ 1761532773;
                        i2 = 1970304426;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1786735041:
                case -603998589:
                    RunnableC1937.m6387();
                    if (C3746.f11829 > 0) {
                        iM2566 = (i4 - C2105.m6981("ۢ᩷")) * 11;
                        i6 = ((iM2566 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        map = map2;
                        int iM6982 = (C2105.m6981("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM2566 = iM6982;
                        i6 = ((iM6982 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1752113878:
                case 1372554679:
                    interfaceC12345 = ApplicationC20075.f65008;
                    sArr = f63220;
                    i11 = 1;
                    if (AbstractC2021.m6574()) {
                        iM2566 = (i4 - C2105.m6981("ۢ᩷")) * 11;
                        i6 = ((iM2566 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        iM2566 = (C2105.m6981("֫ۧ") ^ i4) * 83;
                        i6 = ((iM2566 ^ i5) * 5763) ^ 117311791;
                        i2 = -1640039096;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1582070216:
                case -930968119:
                    C1773.m5908();
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۢ᩷")) * 11;
                        i6 = ((iM2566 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    } else {
                        i3 = i16;
                        iM2566 = (i4 - C0630.m2566("᩶᩷")) * 93;
                        i6 = ((iM2566 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1525402880:
                case 166532802:
                    c19554 = new C19554(C4210.m12702(strM3407));
                    if (C3663.f11553) {
                        map = map2;
                        int iM6983 = (C2105.m6981("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM2566 = iM6983;
                        i6 = ((iM6983 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        iM2566 = (C2105.m6981("ۨ֨") ^ i5) * (-125);
                        i6 = ((iM2566 ^ i4) * (-22661)) ^ 600751848;
                        i2 = 1678761194;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1083467566:
                case 246453462:
                    C2105.m6982();
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("֡᩵") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-23993)) ^ 174772081;
                        i2 = 805065937;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۢ᩷")) * 11;
                        i6 = ((iM2566 ^ i5) * 30253) ^ (-217967211);
                        i2 = -667645917;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -1069561653:
                case 1154857711:
                    i3 = (s2 * s2) + 4826809;
                    if (C0237.m1481() >= 0) {
                        iM2566 = (i4 - C0630.m2566("᩶᩷")) * 93;
                        i6 = ((iM2566 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    } else {
                        iM2566 = C2105.m6981("֡ᩴ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 15387) ^ 632113832;
                        i16 = i3;
                        i2 = 1243676830;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -901301009:
                case 1388473934:
                    strM3407 = C0964.m3407(interfaceC12344, C0483.m2128(sArr2, i9, i8, i10), null);
                    if (i14 > 0) {
                        int iM25610 = (C0630.m2566("۬۫") + i5) * 57;
                        map2 = null;
                        iM2566 = iM25610;
                        i6 = ((iM25610 ^ i4) * 31435) ^ 608490615;
                        i2 = -1792201255;
                    } else {
                        map2 = null;
                        iM2566 = (C2105.m6981("ܳۧ") ^ i4) * 53;
                        i6 = ((iM2566 ^ i5) * (-18531)) ^ (-1729022706);
                        i2 = -967185844;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -869702273:
                case 1638276231:
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                case -851748256:
                case -133654840:
                    s = 2197;
                    if (C1294.f4556 >= 0) {
                        i3 = i16;
                        iM2566 = (i4 - C0630.m2566("᩶᩷")) * 93;
                        i6 = ((iM2566 ^ i5) * (-14319)) ^ (-134243623);
                        i16 = i3;
                        i2 = -1197871733;
                    } else {
                        iM2566 = C2105.m6981("ܶۧ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 627) ^ 318551842;
                        i2 = -1589946994;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -543229441:
                case 796174818:
                    int i19 = s2 + s;
                    i13 = i19 * i19;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C0630.m2566("֡᩵") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-23993)) ^ 174772081;
                        i2 = 805065937;
                    } else {
                        iM2566 = C2105.m6981("ۜ۫") ^ i5;
                        i6 = ((iM2566 ^ i4) * 18039) ^ 975388809;
                        i2 = 1315965273;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case -419329027:
                case 350544287:
                    f63217 = c19554;
                    f63219 = i14;
                    return;
                case -376398900:
                case 1199099365:
                    i14 = interfaceC12345.getInt(C21923.m49334(sArr, i11, i15, i10), 0);
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ܺۡ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩻ۛ")) * 123;
                        i6 = ((iM2566 ^ i5) * (-2879)) ^ (-1791227150);
                        i2 = -687850324;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case 17983650:
                case 1784982257:
                    C1916.m6308();
                    C2272.m7503();
                    iM2566 = (i4 - C2105.m6981("ۢ᩷")) * 11;
                    i6 = ((iM2566 ^ i5) * 30253) ^ (-217967211);
                    i2 = -667645917;
                    i7 = iM2566 ^ i2;
                    break;
                case 538761375:
                case 1028172483:
                    interfaceC12344 = ApplicationC20075.f65008;
                    sArr2 = f63220;
                    i9 = 19;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C0630.m2566("ܺۡ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM2566 = C2105.m6981("᩸ܳ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 16667) ^ (-1111642431);
                        i2 = -544794200;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case 987958373:
                case 1297837813:
                    if (strM3407 != null) {
                        iM2566 = C2105.m6981("۟᩷") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-4031)) ^ (-20310322);
                        i2 = 678222097;
                    } else {
                        iM2566 = (C2105.m6981("ܳۧ") ^ i4) * 53;
                        i6 = ((iM2566 ^ i5) * (-18531)) ^ (-1729022706);
                        i2 = -967185844;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                case 1392256890:
                case 2090465646:
                    i8 = 18;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = C0630.m2566("ܺۡ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2131) ^ 2066321069;
                        i2 = 824468520;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ᩴ᩹")) * (-21);
                        i6 = ((iM2566 ^ i4) * (-8395)) ^ (-126085068);
                        i2 = -1718652825;
                    }
                    i7 = iM2566 ^ i2;
                    break;
                default:
                    map = map2;
                    i15 = 18;
                    if (C0964.f3626 != 0) {
                        int iM6984 = (C2105.m6981("۟ܶ") + i5) * (-21);
                        map2 = map;
                        iM2566 = iM6984;
                        i6 = ((iM6984 ^ i4) * 27611) ^ (-190494908);
                        i2 = 957637101;
                    } else {
                        int iM25611 = (C0630.m2566("ۜᩳ") ^ i5) * 65;
                        map2 = map;
                        iM2566 = iM25611;
                        i6 = ((iM25611 ^ i4) * 12007) ^ 114156284;
                        i2 = -874664890;
                    }
                    i7 = iM2566 ^ i2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44964() {
        long j = 0;
        ExecutorService executorService = null;
        int i = 2014933277;
        int i2 = C2958.f9394;
        int i3 = C4075.f12947;
        int iM6981 = C2105.m6981("᩻۬") ^ i2;
        int i4 = ((iM6981 ^ i3) * (-11647)) ^ 1163650636;
        int i5 = -1582316049;
        while (true) {
            i = ((((i ^ i3) * (-7313)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2127468663:
                case 199718461:
                    if (!C0483.m2121()) {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    }
                    break;
                case -1978888479:
                case -937009419:
                    f63218 = j;
                    executorService = C1802.f6208;
                    if (C5695.f17556 >= 0) {
                        iM6981 = C2105.m6981("᩹ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4149) ^ (-886140703);
                        i5 = 579734968;
                    } else {
                        iM6981 = C0630.m2566("ۜᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-465)) ^ (-270385800);
                        i5 = 780324408;
                    }
                    break;
                case -1931771146:
                case 1797744755:
                    if (C11340.f33930 >= 0) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM6981 = (C2105.m6981("ۘۖ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * (-26575)) ^ 1462338538;
                        i5 = -1262886862;
                    }
                    break;
                case -1726453424:
                case -1287073147:
                    RunnableC1937.m6387();
                    if (C4075.m12263() > 0) {
                        iM6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((iM6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    }
                    break;
                case -1634913892:
                case 536453187:
                    C3663.m11168();
                    C7811.m20844();
                    break;
                case -1242057067:
                case -676336559:
                    C0237.m1481();
                    if (C4263.f13799 > 0) {
                        iM6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((iM6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ᩳ᩷")) * 61;
                        i4 = ((iM6981 ^ i2) * 6213) ^ 417302122;
                        i5 = -811515871;
                    }
                    break;
                case -1171678350:
                case 841258781:
                    C1047.m3599();
                    C2958.m9034();
                    iM6981 = C2105.m6981("ܽ֡") ^ i3;
                    i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                    break;
                case -610206793:
                case 582368054:
                    int i6 = 0;
                    if (!C2126.m7040()) {
                        C0630.m2560(executorService, new RunnableC18848(i6));
                    }
                    iM6981 = C2105.m6981("ܽ֡") ^ i3;
                    i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                    break;
                case -250396748:
                case 228677901:
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((iM6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۘܽ")) * 41;
                        i4 = ((iM6981 ^ i2) * (-23631)) ^ 2064914156;
                        i5 = -1548281379;
                    }
                    break;
                case -180710964:
                case 1847306896:
                    if (C1773.m5908() <= 0) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM6981 = C0630.m2566("ܿܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-16407)) ^ (-1995762639);
                        i5 = 75527413;
                    }
                    break;
                case 390494838:
                case 1355315766:
                    if (C2520.m8026()) {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ᩶") + i3) * (-91);
                        i4 = ((iM6981 ^ i2) * (-22749)) ^ (-1263744092);
                        i5 = -1360240125;
                    }
                    break;
                case 556153983:
                case 1405691840:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM6981 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-9747)) ^ 933603714;
                        i5 = -496526556;
                    }
                    break;
                case 845355387:
                case 1418601641:
                    f63219 = 0;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        iM6981 = (C0630.m2566("ᩴۘ") ^ i2) * (-75);
                        i4 = ((iM6981 ^ i3) * (-8625)) ^ (-1814717755);
                        i5 = 1091081439;
                    }
                    break;
                case 944722790:
                case 1975886262:
                    j = 0;
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM6981 = C0630.m2566("ۢ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26791)) ^ (-1389138392);
                        i5 = 1023699889;
                    }
                    break;
                default:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        iM6981 = C2105.m6981("ۚ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7113) ^ (-1213760627);
                        i5 = -125604543;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19554 m44967() {
        return f63217;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44968(String str, String str2) {
        String str3 = null;
        int i = 1334550467;
        int i2 = C0483.f2088;
        int i3 = C1047.f3863;
        int iM6981 = (i3 - C2105.m6981("᩷ۛ")) * (-97);
        int i4 = ((iM6981 ^ i2) * 27675) ^ 906618302;
        int i5 = 1947143202;
        while (true) {
            i = ((((i ^ i2) * 25563) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2079582643:
                case -1994509252:
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM6981 = C2105.m6981("ۢ֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 493) ^ 1470346728;
                        i5 = 110158901;
                    }
                    break;
                case -1833320950:
                case 258117633:
                    C2272.m7503();
                    return null;
                case -1721748199:
                case -1719657068:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM6981 = (C0630.m2566("֫ᩴ") + i3) * 43;
                        i4 = ((iM6981 ^ i2) * (-5155)) ^ 340819339;
                        i5 = 1781410111;
                    }
                    break;
                case -1679618923:
                case -59708520:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    } else {
                        iM6981 = C2105.m6981("ܺᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 8499) ^ 971901252;
                        i5 = 351855236;
                    }
                    break;
                case -1453001543:
                case 1671365091:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM6981 = C2105.m6981("ᩴܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 21707) ^ (-762713912);
                        i5 = 716322897;
                    }
                    break;
                case -1429921919:
                case -1063606738:
                    if (!C0714.m2805()) {
                        iM6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    }
                    break;
                case -1192080230:
                case 1793261531:
                    return str2;
                case -1070906816:
                case -760480658:
                    C1916.m6308();
                    C0237.m1481();
                    iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                    i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                    i5 = -1289980084;
                    break;
                case -949350150:
                case -628721912:
                    if (C4263.f13799 > 0) {
                        iM6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    }
                    break;
                case -642553537:
                case 341146224:
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM6981 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6871)) ^ (-608750045);
                        i5 = -140926569;
                    }
                    break;
                case -601008819:
                case -79213940:
                    return str3;
                case -174959344:
                case 1767639648:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        iM6981 = (C0630.m2566("᩶᩵") ^ i3) * 67;
                        i4 = ((iM6981 ^ i2) * (-21009)) ^ 2017660062;
                        i5 = -2092380337;
                    }
                    break;
                case 62474955:
                case 102788346:
                    if (C1916.f6442) {
                        iM6981 = (i2 - C2105.m6981("ۨۙ")) * 79;
                        i4 = ((iM6981 ^ i3) * 7963) ^ (-1026526929);
                        i5 = -2083111268;
                    } else {
                        iM6981 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    }
                    break;
                case 313551833:
                case 1546939215:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM6981 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22113) ^ (-2137652237);
                        i5 = 592480079;
                    }
                    break;
                case 360557144:
                case 1994145487:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM6981 = C0630.m2566("۠ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-6975)) ^ 199695752;
                        i5 = -1899913167;
                    }
                    break;
                case 597714784:
                case 1484087826:
                    str3 = (String) this.f63221.get(str);
                    if (str3 == null) {
                        iM6981 = C0630.m2566("ۜܰ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10703)) ^ 1829155615;
                        i5 = 1741799757;
                    } else {
                        iM6981 = (C0630.m2566("ܽۢ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i2) * 21477) ^ 1438407146;
                        i5 = 34583425;
                    }
                    break;
                case 1207499148:
                case 1309679160:
                    C1711.m5736();
                    if (C0483.f2088 < 0) {
                        iM6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        iM6981 = (C0630.m2566("ۜ᩶") + i2) * 115;
                        i4 = ((iM6981 ^ i3) * (-10245)) ^ (-2614923);
                        i5 = -1752296570;
                    }
                    break;
                default:
                    if (C2272.f7362) {
                        iM6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23503)) ^ (-1331441339);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44969(String str) {
        String str2;
        int i;
        int iM6981;
        int i2;
        int i3;
        int iM6982;
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
        int i11 = C1294.f4556;
        int i12 = C3245.f10203;
        int iM6983 = (i11 - C2105.m6981("ܶۙ")) * (-33);
        int i13 = ((iM6983 ^ i12) * (-4437)) ^ (-1331930192);
        int i14 = 1285345185;
        while (true) {
            int i15 = iM6983 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i12) * (-13673)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2060801251:
                    case -883975660:
                        str2 = str3;
                        i = i7;
                        s = sArr[c];
                        s2 = 818;
                        if (C2520.f8000 >= 0) {
                            iM6981 = (i12 - C2105.m6981("᩻ۨ")) * (-53);
                            i2 = ((iM6981 ^ i11) * (-3555)) ^ (-846817390);
                            i3 = -428108698;
                        } else {
                            iM6981 = (i11 - C0630.m2566("ۤ۬")) * (-87);
                            i2 = ((iM6981 ^ i12) * (-4749)) ^ (-1660116258);
                            i3 = 243471526;
                        }
                        i15 = iM6981 ^ i3;
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
                        if (C7811.f24123 >= 0) {
                            iM6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM6981 ^ i12) * 18421) ^ (-288905791);
                            i3 = -2068752750;
                        } else {
                            iM6981 = C2105.m6981("᩹ۜ") ^ i12;
                            i2 = ((iM6981 ^ i11) * 32325) ^ (-445296968);
                            i3 = 836927382;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1947627135:
                    case 1150230228:
                        str2 = str3;
                        i = i7;
                        if ((s * s3) - i6 <= 0) {
                            iM6981 = C0630.m2566("ܶۖ") ^ i11;
                            i2 = ((iM6981 ^ i12) * 20355) ^ (-900143219);
                            i3 = -451728334;
                        } else {
                            iM6981 = (C0630.m2566("᩷ܽ") ^ i12) * (-3);
                            i2 = ((iM6981 ^ i11) * 28553) ^ (-650132433);
                            i3 = -861836686;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1942590636:
                    case 446975111:
                        RunnableC3474.m10630();
                        C1711.m5736();
                        iM6983 = (C0630.m2566("᩶ۙ") ^ i11) * 5;
                        i13 = ((iM6983 ^ i12) * (-5685)) ^ 72363232;
                        i14 = 1410070552;
                        break;
                    case -1861744184:
                    case -1693061462:
                        str2 = str3;
                        i = i7;
                        if (C3019.f9544 >= 0) {
                            iM6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                            i2 = ((iM6981 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                        } else {
                            iM6981 = (i12 - C2105.m6981("ۡܽ")) * (-113);
                            i2 = ((iM6981 ^ i11) * (-267)) ^ 1360245520;
                            i3 = -402085394;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1564499360:
                    case 95024459:
                        if (C3746.f11829 > 0) {
                            iM6983 = (C0630.m2566("᩶ۙ") ^ i11) * 5;
                            i13 = ((iM6983 ^ i12) * (-5685)) ^ 72363232;
                            i14 = 1410070552;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        iM6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1509186939:
                    case 323710509:
                        str2 = str3;
                        i = i7;
                        if (C5695.f17556 >= 0) {
                            iM6981 = C2105.m6981("ᩴۘ") ^ i12;
                            i2 = ((iM6981 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM6981 = (i11 - C0630.m2566("᩹֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM6981 ^ i12) * (-8523)) ^ (-2110665033);
                            i3 = -629259165;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1403881938:
                    case -17793642:
                        return C2105.m6976(str3, C3746.m11357(sArr2, i8, i9, i7));
                    case -1351296005:
                    case -828454306:
                        sArr2 = f63220;
                        i8 = 196;
                        if (C3537.f11231 < 0) {
                            iM6983 = C2105.m6981("ܰ۠") ^ i11;
                            i13 = ((iM6983 ^ i12) * 26551) ^ (-2127198652);
                            i14 = 2021595248;
                        }
                        str2 = str3;
                        i = i7;
                        iM6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((iM6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = iM6981 ^ i3;
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
                        if (C1916.f6442) {
                            iM6983 = C2105.m6981("᩺۟") ^ i12;
                            i13 = ((iM6983 ^ i11) * 28953) ^ (-771530034);
                            i14 = -1909975581;
                        }
                        str2 = str3;
                        i = i7;
                        iM6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -1038455523:
                    case 1243315321:
                        i7 = 21986;
                        iM6982 = C2105.m6981("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((iM6982 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = iM6982 ^ i5;
                        str3 = str2;
                        break;
                    case -947357352:
                    case -626020205:
                        if (C4117.f13076 > 0) {
                            iM6983 = (C0630.m2566("᩶ۙ") ^ i11) * 5;
                            i13 = ((iM6983 ^ i12) * (-5685)) ^ 72363232;
                            i14 = 1410070552;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        iM6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((iM6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -799205031:
                    case 593688729:
                        str2 = str3;
                        i = i7;
                        if (C0422.f1886 <= 0) {
                            iM6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((iM6981 ^ i12) * 18421) ^ (-288905791);
                            i3 = -2068752750;
                        } else {
                            iM6981 = C2105.m6981("ۘۨ") ^ i12;
                            i2 = ((iM6981 ^ i11) * (-29671)) ^ 916739507;
                            i3 = -2072894979;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case -691655054:
                    case 1208676463:
                        String str4 = (String) this.f63221.get(str);
                        if (str4 != null) {
                            str2 = str4;
                            iM6981 = (C2105.m6981("ܺۗ") + i12) * 59;
                            i = i7;
                            i2 = ((iM6981 ^ i11) * 16547) ^ 928986689;
                            i3 = 1018322617;
                            i15 = iM6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        } else {
                            iM6982 = (i12 - C2105.m6981("۠᩵")) * 7;
                            str2 = str4;
                            i4 = ((iM6982 ^ i11) * (-26829)) ^ (-943876326);
                            i5 = 196149774;
                            i13 = i4;
                            i15 = iM6982 ^ i5;
                            str3 = str2;
                        }
                        break;
                    case -563253727:
                    case 551150906:
                        str2 = str3;
                        i = i7;
                        sArr = f63220;
                        if (C11340.f33930 >= 0) {
                            iM6981 = C2105.m6981("ᩴۘ") ^ i12;
                            i2 = ((iM6981 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM6981 = (C0630.m2566("᩹ۡ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i2 = ((iM6981 ^ i12) * 19505) ^ 1104433459;
                            i3 = 1457843626;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 328735869:
                    case 1405439493:
                        str2 = str3;
                        i = i7;
                        s3 = 3272;
                        if (C0964.f3626 != 0) {
                            iM6981 = C2105.m6981("ᩴۘ") ^ i12;
                            i2 = ((iM6981 ^ i11) * 12343) ^ 2098780210;
                            i3 = 954084875;
                        } else {
                            iM6981 = (i11 - C2105.m6981("ᩴ᩸")) * 73;
                            i2 = ((iM6981 ^ i12) * (-29229)) ^ 1913632704;
                            i3 = 1667440414;
                        }
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 1006077839:
                    case 1099381479:
                        AbstractC2021.m6574();
                        if (!C2520.m8026()) {
                            str2 = str3;
                            i = i7;
                            iM6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                            i2 = ((iM6981 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                            i15 = iM6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        str2 = str3;
                        i = i7;
                        iM6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = iM6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                        break;
                    case 1060256048:
                    case 1930874896:
                        C3432.m10477();
                        return false;
                    case 1412546276:
                    case 1582477550:
                        i7 = 42133;
                        iM6982 = C2105.m6981("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((iM6982 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = iM6982 ^ i5;
                        str3 = str2;
                        break;
                    default:
                        str2 = str3;
                        i = i7;
                        c = 195;
                        if (C7106.m19120() <= 0) {
                            iM6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                            i2 = ((iM6981 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                        } else {
                            iM6981 = C0630.m2566("ۜۢ") ^ i12;
                            i2 = ((iM6981 ^ i11) * 7831) ^ (-59311046);
                            i3 = -1487722253;
                        }
                        i15 = iM6981 ^ i3;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44965(C19554 c19554) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5;
        int i6;
        int iM6981;
        int i7;
        String[] strArr;
        String strM44968 = null;
        String[] strArrM4374 = null;
        int i8 = 0;
        int iM10632 = 0;
        C15587 c15587M36534 = null;
        boolean zM9926 = false;
        int iM8022 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 570689790;
        int i13 = C11340.f33930;
        int i14 = C4263.f13799;
        int iM6982 = C2105.m6981("ܳۚ") ^ i14;
        int i15 = ((iM6982 ^ i13) * (-9213)) ^ (-1342039197);
        int i16 = iM6982 ^ (-2101295017);
        RunnableC15758 runnableC15758 = null;
        int i17 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 21969) >> 31));
            switch (i12) {
                case -2089299836:
                case 936344666:
                    if (C1504.f5354) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM2567 = C2105.m6981("ۗ۬") ^ i14;
                        i3 = ((iM2567 ^ i13) * (-30583)) ^ 329482528;
                        i4 = -539050919;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    }
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    iM2567 = C2105.m6981("۠ۢ") ^ i13;
                    i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -2055735760:
                case -589466164:
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = C0630.m2566("ۤۚ") ^ i14;
                        i = ((iM2566 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                    } else {
                        iM2566 = C2105.m6981("֫۫") ^ i13;
                        i = ((iM2566 ^ i14) * 30205) ^ 550602314;
                        i2 = -333970897;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case -1959031783:
                case -328338485:
                    C1128.m3851();
                    if (C3245.m9925() == 0) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM2567 = C2105.m6981("᩹ۘ") ^ i14;
                        i3 = ((iM2567 ^ i13) * 23115) ^ (-1363884123);
                        i4 = -394106981;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    } else {
                        iM2566 = C2105.m6981("ۨ֡") ^ i14;
                        i = ((iM2566 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1934633058:
                case -1416134982:
                    if (C11340.f33930 < 0) {
                        iM2566 = C2105.m6981("ۨ֡") ^ i14;
                        i = ((iM2566 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM2567 = C2105.m6981("۠ۢ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    }
                    break;
                case -1896378385:
                case -15144658:
                    if (!zM9926) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM8022 = i17;
                        iM6981 = C0630.m2566("۠᩷") ^ i13;
                        i3 = ((iM6981 ^ i14) * (-29193)) ^ (-689790214);
                        i7 = -1243159260;
                        i5 = iM6981 ^ i7;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    } else {
                        iM2566 = C0630.m2566("᩻֨") ^ i14;
                        i = ((iM2566 ^ i13) * (-27673)) ^ 422349576;
                        i2 = -1620710817;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1813005619:
                case -343781500:
                    RunnableC3474.m10630();
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۤۚ") ^ i14;
                        i = ((iM2566 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } else {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM2567 = C2105.m6981("۠ۢ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    }
                    break;
                case -1790835447:
                case 1339518022:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    s2 = 2516;
                    if (C1128.f4106 <= 0) {
                        iM2567 = C2105.m6981("ۗ۬") ^ i14;
                        i3 = ((iM2567 ^ i13) * (-30583)) ^ 329482528;
                        i4 = -539050919;
                    } else {
                        iM2567 = C0630.m2566("ܳ᩷") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-2403)) ^ 24517666;
                        i4 = 366292576;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -1672793328:
                case 1640770959:
                    if (iM8022 >= iM10632) {
                        i8 = i8;
                        int iM6983 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM6983 ^ (-445613752);
                        i15 = ((iM6983 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    } else {
                        iM2566 = C2105.m6981("ܳۢ") ^ i13;
                        i = ((iM2566 ^ i14) * 12529) ^ 1497967914;
                        i2 = 366590948;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1632889163:
                case 295181970:
                    strArrM4374 = C1294.m4374(C4159.m12570(strM44968), C0964.m3396(f63220, 54, 2, i11));
                    i8 = 0;
                    try {
                        iM10632 = RunnableC3474.m10632(strArrM4374[0]);
                        iM2566 = (C2105.m6981("᩷۫") ^ i14) * (-73);
                        i = ((iM2566 ^ i13) * 891) ^ 178379361;
                        i2 = 954992688;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    } catch (Exception unused) {
                        i8 = 0;
                        int iM6984 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM6984 ^ (-445613752);
                        i15 = ((iM6984 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1600033648:
                case 775817861:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    int i18 = 1;
                    if (!C0798.f2919) {
                        RunnableC15758 runnableC15759 = new RunnableC15758(i18);
                        if (RunnableC0588.f2309 < 0) {
                            int iM2568 = (C0630.m2566("᩸ۘ") ^ i14) * (-33);
                            int i19 = ((iM2568 ^ i13) * (-15207)) ^ (-2116316517);
                            i6 = iM2568 ^ 637008391;
                            runnableC15758 = runnableC15759;
                            i15 = i19;
                            i8 = i8;
                            strArr = strArrM4374;
                            i16 = i6;
                            strArrM4374 = strArr;
                        } else {
                            runnableC15758 = runnableC15759;
                            iM2567 = C2105.m6981("۠ۢ") ^ i13;
                            i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                            i4 = -1836211981;
                            i5 = iM2567 ^ i4;
                            i8 = i8;
                        }
                    } else {
                        int iM2569 = (i13 - C0630.m2566("ۚ۬")) * (-43);
                        i3 = ((iM2569 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM2569 ^ (-775952340);
                        i8 = i8;
                        runnableC15758 = null;
                    }
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -1475273328:
                case -485437219:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if (strM44968 != null) {
                        iM6981 = C2105.m6981("᩺۟") ^ i14;
                        i3 = ((iM6981 ^ i13) * (-23425)) ^ (-1242689816);
                        i7 = 633801759;
                        i5 = iM6981 ^ i7;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    } else {
                        strArrM4374 = strArrM4374;
                        int iM6985 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM6985 ^ (-445613752);
                        i15 = ((iM6985 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1422198278:
                case 273359869:
                    try {
                        iM8022 = C2520.m8022(c15587M36534.m36528());
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                    } catch (Exception unused2) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM8022 = i17;
                    }
                    iM6981 = C0630.m2566("۠᩷") ^ i13;
                    i3 = ((iM6981 ^ i14) * (-29193)) ^ (-689790214);
                    i7 = -1243159260;
                    i5 = iM6981 ^ i7;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -1384881050:
                case 877586494:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    s = sArr[c];
                    i9 = s * s;
                    if (C3019.m9255() <= 0) {
                        iM2567 = C2105.m6981("᩺ۙ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-15999)) ^ 632601049;
                        i4 = 944041832;
                    } else {
                        iM2567 = (C2105.m6981("ۜܳ") ^ i14) * 11;
                        i3 = ((iM2567 ^ i13) * (-25829)) ^ (-1538965610);
                        i4 = -530570480;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -1340388053:
                case 793461587:
                    try {
                        try {
                            strArrM4374 = strArrM4374;
                            i8 = i8;
                            try {
                                c15587M36534 = C3663.m11176(C16293.f50117, C1128.m3841(f63220, 56, 21, i11)).m36534();
                                try {
                                    zM9926 = C3245.m9926(c15587M36534);
                                    iM6981 = C0630.m2566("᩹ۡ") ^ i14;
                                    i3 = ((iM6981 ^ i13) * 16321) ^ 1633790045;
                                    i7 = -884474994;
                                } catch (Exception unused3) {
                                    iM8022 = i17;
                                    iM6981 = C0630.m2566("۠᩷") ^ i13;
                                    i3 = ((iM6981 ^ i14) * (-29193)) ^ (-689790214);
                                    i7 = -1243159260;
                                }
                                i5 = iM6981 ^ i7;
                                i8 = i8;
                                strArr = strArrM4374;
                                i16 = i5;
                                i15 = i3;
                                strArrM4374 = strArr;
                            } catch (Exception unused4) {
                                strArrM4374 = strArrM4374;
                                int iM6986 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                                i16 = iM6986 ^ (-445613752);
                                i15 = ((iM6986 ^ i13) * 12211) ^ 1185305548;
                                i8 = i8;
                            }
                        } catch (Exception unused5) {
                            strArrM4374 = strArrM4374;
                            i8 = i8;
                        }
                    } catch (Exception unused6) {
                        i8 = i8;
                        int iM6987 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM6987 ^ (-445613752);
                        i15 = ((iM6987 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -1231288456:
                case -295956446:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    sArr = f63220;
                    if (C2126.f7087) {
                        iM2567 = C2105.m6981("ܳܰ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                    } else {
                        iM2567 = C0630.m2566("ܿ۬") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-4589)) ^ 1366916225;
                        i4 = -1094441841;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -1057697948:
                case 1185373133:
                    C0798.m2998();
                    break;
                case -1041007913:
                case 63948438:
                    try {
                        C2105.m6975(C1802.f6208, new RunnableC11542(iM10632, i8, strArrM4374));
                        break;
                    } catch (Exception unused7) {
                    }
                    i8 = i8;
                    int iM6988 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                    i16 = iM6988 ^ (-445613752);
                    i15 = ((iM6988 ^ i13) * 12211) ^ 1185305548;
                    i8 = i8;
                    break;
                case -1040191240:
                case -1010767318:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if ((s * s2) - i10 <= 0) {
                        iM2567 = (C0630.m2566("ۚ᩵") + i14) * 85;
                        i3 = ((iM2567 ^ i13) * (-23291)) ^ (-646936767);
                        i4 = 740823200;
                    } else {
                        iM2567 = (C2105.m6981("ᩴܽ") + i13) * 59;
                        i3 = ((iM2567 ^ i14) * (-9893)) ^ (-136337162);
                        i4 = 988089396;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -979120373:
                case 1560480177:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if (C2105.m6982() != 0) {
                        iM2567 = C2105.m6981("۠ۢ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                        i4 = -1836211981;
                    } else {
                        iM2567 = (C0630.m2566("᩻۫") ^ i14) * 75;
                        i3 = ((iM2567 ^ i13) * (-30415)) ^ (-94811861);
                        i4 = -1453953387;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -887494403:
                case 672117396:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if (iM10632 > 14) {
                        int iM6989 = C2105.m6981("ܳ۬") ^ i13;
                        int i20 = ((iM6989 ^ i14) * 20967) ^ (-1243115837);
                        i6 = iM6989 ^ (-77495690);
                        i15 = i20;
                        i8 = i8;
                        i17 = 14;
                        strArr = strArrM4374;
                        i16 = i6;
                        strArrM4374 = strArr;
                    } else {
                        i17 = 14;
                        strArrM4374 = strArrM4374;
                        int iM69810 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM69810 ^ (-445613752);
                        i15 = ((iM69810 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -667464745:
                case -36026879:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    try {
                        strM44968 = c19554.m44968(C3911.m11919(f63220, 38, 16, i11), null);
                        iM2567 = C0630.m2566("ۜ۟") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-16853)) ^ 1541750544;
                        i4 = 926559330;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    } catch (Exception unused8) {
                        strArrM4374 = strArrM4374;
                        int iM69811 = (i14 - C2105.m6981("ۨ۠")) * (-39);
                        i16 = iM69811 ^ (-445613752);
                        i15 = ((iM69811 ^ i13) * 12211) ^ 1185305548;
                        i8 = i8;
                    }
                    break;
                case -604740911:
                case 1321265247:
                    i11 = 11377;
                    iM2567 = C0630.m2566("ۡۤ") ^ i13;
                    i3 = ((iM2567 ^ i14) * 677) ^ 346459494;
                    i4 = -99290726;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -594495341:
                case 1988438192:
                    i11 = 6620;
                    iM2567 = C0630.m2566("ۡۤ") ^ i13;
                    i3 = ((iM2567 ^ i14) * 677) ^ 346459494;
                    i4 = -99290726;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -543271963:
                case 1662622016:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    i10 = i9 + 1582564;
                    if (RunnableC1108.f4040) {
                        iM2567 = (C0630.m2566("ۧ᩷") ^ i14) * 123;
                        i3 = ((iM2567 ^ i13) * (-22081)) ^ 1109477827;
                        i4 = -1109497791;
                    } else {
                        iM2567 = C2105.m6981("ܳܰ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case -479781384:
                case -436363056:
                    break;
                case -24321987:
                case 1726545986:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    c = '%';
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2567 = C2105.m6981("᩺ۙ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-15999)) ^ 632601049;
                        i4 = 944041832;
                    } else {
                        iM2567 = C0630.m2566("ۚᩳ") ^ i13;
                        i3 = ((iM2567 ^ i14) * (-10433)) ^ (-1434783445);
                        i4 = 2036247939;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case 257808413:
                case 942838707:
                    if (C3245.f10203 > 0) {
                        iM2566 = C2105.m6981("ۨ֡") ^ i14;
                        i = ((iM2566 ^ i13) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                    } else {
                        iM2566 = C0630.m2566("ۙܺ") ^ i14;
                        i = ((iM2566 ^ i13) * (-20435)) ^ 568256117;
                        i2 = 1766326406;
                    }
                    i16 = iM2566 ^ i2;
                    i15 = i;
                    break;
                case 441015999:
                case 1736271296:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    C0237.m1492(runnableC15758);
                    int i21 = C7017.f21654;
                    iM2567 = C2105.m6981("᩵᩺") ^ i13;
                    i3 = ((iM2567 ^ i14) * (-30809)) ^ 621053857;
                    i4 = 703803288;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case 787410795:
                case 1561653807:
                    RunnableC0588.m2441();
                    if (C0964.f3626 == 0) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        int iM25610 = (i13 - C0630.m2566("ۚ۬")) * (-43);
                        i3 = ((iM25610 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM25610 ^ (-775952340);
                        i8 = i8;
                        runnableC15758 = null;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    } else {
                        iM2566 = C0630.m2566("ۤۚ") ^ i14;
                        i = ((iM2566 ^ i13) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i16 = iM2566 ^ i2;
                        i15 = i;
                    }
                    break;
                case 1320376693:
                case 1445706091:
                    C4263.m12819();
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    iM2567 = C2105.m6981("۠ۢ") ^ i13;
                    i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case 1443993538:
                case 1571095605:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if (C0964.f3626 != 0) {
                        int iM25611 = (i13 - C0630.m2566("ۚ۬")) * (-43);
                        i3 = ((iM25611 ^ i14) * (-1441)) ^ 1837919746;
                        i5 = iM25611 ^ (-775952340);
                        i8 = i8;
                        runnableC15758 = null;
                    } else {
                        iM2567 = (i13 - C0630.m2566("۟ᩳ")) * 67;
                        i3 = ((iM2567 ^ i14) * 25127) ^ 452462506;
                        i4 = 1131042387;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                    }
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                case 1794040894:
                case 2012286180:
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    if (C0422.f1886 <= 0) {
                        iM2567 = C2105.m6981("᩹ۘ") ^ i14;
                        i3 = ((iM2567 ^ i13) * 23115) ^ (-1363884123);
                        i4 = -394106981;
                    } else {
                        iM2567 = (C0630.m2566("ۡܺ") + i14) * 5;
                        i3 = ((iM2567 ^ i13) * (-3713)) ^ 2023704976;
                        i4 = 1405127655;
                    }
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
                default:
                    C2105.m6982();
                    if (C4263.f13799 > 0) {
                        strArrM4374 = strArrM4374;
                        i8 = i8;
                        iM2567 = C2105.m6981("ܳܰ") ^ i13;
                        i3 = ((iM2567 ^ i14) * 14587) ^ (-1545790643);
                        i4 = -471483077;
                        i5 = iM2567 ^ i4;
                        i8 = i8;
                        strArr = strArrM4374;
                        i16 = i5;
                        i15 = i3;
                        strArrM4374 = strArr;
                    }
                    strArrM4374 = strArrM4374;
                    i8 = i8;
                    iM2567 = C2105.m6981("۠ۢ") ^ i13;
                    i3 = ((iM2567 ^ i14) * (-15547)) ^ (-1448807097);
                    i4 = -1836211981;
                    i5 = iM2567 ^ i4;
                    i8 = i8;
                    strArr = strArrM4374;
                    i16 = i5;
                    i15 = i3;
                    strArrM4374 = strArr;
                    break;
            }
            return;
        }
    }

    public C19554(HashMap map) {
        Map map2 = null;
        int i = 790995826;
        int i2 = C0050.f910;
        int i3 = C1294.f4556;
        int iM2566 = C0630.m2566("ۧۖ") ^ i3;
        int i4 = ((iM2566 ^ i2) * 16135) ^ 221880658;
        int i5 = 477471767;
        while (true) {
            i = ((((i ^ i2) * (-13799)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2117666067:
                case 127417656:
                    C1916.m6308();
                    if (C0964.f3626 == 0) {
                        iM2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((iM2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        iM2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    }
                    break;
                case -2033858766:
                case 136874980:
                    map2 = Collections.EMPTY_MAP;
                    iM2566 = (C0630.m2566("֨ۜ") + i2) * (-107);
                    i4 = ((iM2566 ^ i3) * 28745) ^ (-259112853);
                    i5 = -2005776329;
                    break;
                case -2018300055:
                case -1584037512:
                    if (C2167.m7155()) {
                        iM2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((iM2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        iM2566 = C0630.m2566("ۛܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-19011)) ^ 752169645;
                        i5 = -1867890802;
                    }
                    break;
                case -1985601131:
                case -330508438:
                    return;
                case -1588487102:
                case -156032329:
                    C1916.m6308();
                    iM2566 = C0630.m2566("ۢܿ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 32421) ^ 2050488923;
                    i5 = -1586342211;
                    break;
                case -1565008327:
                case 596640163:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((iM2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩻ۢ")) * (-3);
                        i4 = ((iM2566 ^ i2) * (-5355)) ^ 232571631;
                        i5 = 1106911909;
                    }
                    break;
                case -1530389447:
                case 1932050188:
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        iM2566 = (C0630.m2566("ۙܺ") + i3) * 91;
                        i4 = ((iM2566 ^ i2) * 11297) ^ 600521054;
                        i5 = -1712109220;
                    }
                    break;
                case -1330191467:
                case -1290423695:
                    if (C1916.m6308() >= 0) {
                        iM2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        iM2566 = C2105.m6981("ܽۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 24571) ^ 1501152944;
                        i5 = 231803711;
                    }
                    break;
                case -1283600653:
                case 1148598632:
                    if (map == null) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * 75;
                        i4 = ((iM2566 ^ i2) * (-14851)) ^ 1759547553;
                        i5 = -1047943430;
                    } else {
                        map2 = map;
                        iM2566 = (C0630.m2566("֨ۜ") + i2) * (-107);
                        i4 = ((iM2566 ^ i3) * 28745) ^ (-259112853);
                        i5 = -2005776329;
                    }
                    break;
                case -1210657096:
                case 1812986113:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        iM2566 = C2105.m6981("ۨۗ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 6847) ^ 1802921452;
                        i5 = -1126680720;
                    }
                    break;
                case -640534429:
                case -572010443:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۜ") + i2) * (-115);
                        i4 = ((iM2566 ^ i3) * 249) ^ 2033481325;
                        i5 = 163982364;
                    }
                    break;
                case -633262087:
                case 884304177:
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    }
                    break;
                case -344353817:
                case -240634531:
                    if (C5695.m16023() >= 0) {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((iM2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM2566 = C0630.m2566("ۚۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29355)) ^ (-620589149);
                        i5 = 557979199;
                    }
                    break;
                case -289222180:
                case 69536887:
                    this.f63221 = map2;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM2566 = (C0630.m2566("᩹۟") ^ i3) * (-83);
                        i4 = ((iM2566 ^ i2) * (-14939)) ^ 1698222175;
                        i5 = -1685517104;
                    }
                    break;
                case -243994291:
                case -231483970:
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("ۨۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6507) ^ (-251704503);
                        i5 = 1148320053;
                    } else {
                        iM2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    }
                    break;
                case 242891787:
                case 999365185:
                    C2167.m7155();
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case 664480393:
                case 1081997012:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        iM2566 = (C0630.m2566("ۢۢ") ^ i3) * (-27);
                        i4 = ((iM2566 ^ i2) * 503) ^ (-972495938);
                        i5 = -1450391788;
                    }
                    break;
                default:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((iM2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        iM2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((iM2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    }
                    break;
            }
        }
    }
}
