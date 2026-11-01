package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4949 {

    /* JADX INFO: renamed from: ᩺᩷᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f81914 = {301, 30605, 30592, 30692, 30633, 30641, 30647, 30640, 30692, 30630, 30625, 30640, 30643, 30625, 30625, 30634, 30692, 30708, 30652, 30708, 30708, 30692, 30640, 30635, 30692, 30708, 30652, 30594, 30594, 30605, 30592, 30692, 30692, 30634, 30635, 30640, 30692, 30626, 30635, 30641, 30634, 30624, 30692};

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f11268;

    /* JADX INFO: renamed from: ۧ */
    public final short[] f11269;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f11270;

    /* JADX INFO: renamed from: ᩳ */
    public int f11271;

    /* JADX INFO: renamed from: ۧ */
    public final long m10493(int i) {
        int iM10490 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int iM10491 = 0;
        long j4 = 0;
        int i2 = 320594178;
        int i3 = C1404.f82149;
        int i4 = AbstractC0942.f81890;
        int iM55680 = C0873.m55680("ᩳ۟") ^ i3;
        int i5 = ((iM55680 ^ i4) * 1183) ^ 1426646312;
        int i6 = -2065133216;
        while (true) {
            i2 = ((((i2 ^ i4) * (-7595)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1945961630:
                case -160978071:
                    if (C0947.f81895) {
                        iM55680 = (C0873.m55680("۟᩻") + i3) * 69;
                        i5 = ((iM55680 ^ i4) * (-29913)) ^ (-2040265523);
                        i6 = -623161376;
                    } else {
                        iM55680 = (C0946.m55979("ܽۤ") + i3) * (-89);
                        i5 = ((iM55680 ^ i4) * (-7765)) ^ (-1061641428);
                        i6 = -491263459;
                    }
                    break;
                case -1929566294:
                case 1294695314:
                    return (j4 << 32) | j3;
                case -1831906908:
                case -884247496:
                    j3 = j & j2;
                    iM10491 = m10490();
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("᩶֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1627) ^ 1381421127;
                        i6 = 288429253;
                    } else {
                        iM55680 = (C0873.m55680("᩷֫") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 24217) ^ 477539046;
                        i6 = 1592921552;
                    }
                    break;
                case -1753844999:
                case -1481533645:
                    RunnableC0871.m55672();
                    C1036.m56257();
                    iM55680 = (C0873.m55680("۟᩻") + i3) * 69;
                    i5 = ((iM55680 ^ i4) * (-29913)) ^ (-2040265523);
                    i6 = -623161376;
                    break;
                case -1302886240:
                case 2019713289:
                    if (C0906.m55809() <= 0) {
                        iM55680 = C0873.m55680("ۖܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16489) ^ (-1822471321);
                        i6 = -249838678;
                    } else {
                        iM55680 = C0873.m55680("ܺ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18211)) ^ 1659210624;
                        i6 = -551846646;
                    }
                    break;
                case -1071285388:
                case -689398348:
                    iM10490 = m10490();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("֨ۜ") + i3) * 27;
                        i5 = ((iM55680 ^ i4) * (-26313)) ^ 300200641;
                        i6 = 143948513;
                    } else {
                        iM55680 = (C0873.m55680("ܿ֫") ^ i4) * (-117);
                        i5 = ((iM55680 ^ i3) * (-20029)) ^ (-1160521841);
                        i6 = -1364786095;
                    }
                    break;
                case -988280302:
                case -312313207:
                    C0894.m55769();
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0873.m55680("֨ۜ") + i3) * 27;
                        i5 = ((iM55680 ^ i4) * (-26313)) ^ 300200641;
                        i6 = 143948513;
                    } else {
                        iM55680 = C0873.m55680("ۚۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 6887) ^ (-1030889052);
                        i6 = 907531515;
                    }
                    break;
                case -893738956:
                case 1755964016:
                    j = iM10490;
                    j2 = 4294967295L;
                    if (C0946.f81894 != 0) {
                        iM55680 = C0873.m55680("᩶֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1627) ^ 1381421127;
                        i6 = 288429253;
                    } else {
                        iM55680 = (C0873.m55680("֨ܰ") + i3) * (-3);
                        i5 = ((iM55680 ^ i4) * 18797) ^ 1376837367;
                        i6 = 1211372172;
                    }
                    break;
                case -667898712:
                case 197277773:
                    j4 = iM10491;
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("᩶֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1627) ^ 1381421127;
                        i6 = 288429253;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۡ᩶")) * (-25);
                        i5 = ((iM55680 ^ i3) * (-20021)) ^ 1412240178;
                        i6 = -1002168464;
                    }
                    break;
                case -542106008:
                case -170410474:
                    m10491(i);
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("ۖܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16489) ^ (-1822471321);
                        i6 = -249838678;
                    } else {
                        iM55680 = C0946.m55979("ۖ۟") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13823)) ^ 2090231990;
                        i6 = -1769001410;
                    }
                    break;
                case -179941256:
                case 1639500200:
                    C1025.m56230();
                    return 0L;
                case -128660815:
                case 187801675:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = C0873.m55680("ۖܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16489) ^ (-1822471321);
                        i6 = -249838678;
                    } else {
                        iM55680 = C0873.m55680("۬ۘ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-4563)) ^ 613016203;
                        i6 = 1466979705;
                    }
                    break;
                case 466135253:
                case 1354861712:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("֨ۜ") + i3) * 27;
                        i5 = ((iM55680 ^ i4) * (-26313)) ^ 300200641;
                        i6 = 143948513;
                    } else {
                        iM55680 = (C0873.m55680("ۢۢ") ^ i4) * 69;
                        i5 = ((iM55680 ^ i3) * (-21235)) ^ (-428290626);
                        i6 = 596308614;
                    }
                    break;
                case 478674213:
                case 1745952817:
                    C0947.m55997();
                    if (!C0947.f81895) {
                        iM55680 = (C0873.m55680("۟᩻") + i3) * 69;
                        i5 = ((iM55680 ^ i4) * (-29913)) ^ (-2040265523);
                        i6 = -623161376;
                    } else {
                        iM55680 = C0873.m55680("ۖܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16489) ^ (-1822471321);
                        i6 = -249838678;
                    }
                    break;
                case 1623031858:
                case 1872749957:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("֨ۜ") + i3) * 27;
                        i5 = ((iM55680 ^ i4) * (-26313)) ^ 300200641;
                        i6 = 143948513;
                    } else {
                        iM55680 = C0873.m55680("ۖܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16489) ^ (-1822471321);
                        i6 = -249838678;
                    }
                    break;
                default:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("᩶֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1627) ^ 1381421127;
                        i6 = 288429253;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܺ۠")) * 71;
                        i5 = ((iM55680 ^ i3) * 26023) ^ 2015835754;
                        i6 = -2062599959;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10492(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = -90794907;
        int i5 = C0949.f81897;
        int i6 = C1012.f81938;
        int iM55979 = (C0946.m55979("֫ܿ") + i6) * 17;
        int i7 = ((iM55979 ^ i5) * 18431) ^ 1146848622;
        int i8 = -1817779704;
        while (true) {
            i4 = ((((i4 ^ i5) * (-11421)) >> 31) & i7) ^ (iM55979 ^ i8);
            switch (i4) {
                case -2130254141:
                case -760475088:
                    RunnableC1014.m56177();
                    iM55979 = C0873.m55680("ۜۛ") ^ i6;
                    i7 = ((iM55979 ^ i5) * 5631) ^ 1138155388;
                    i8 = 975537513;
                    break;
                case -1994237086:
                case -822527823:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ᩳ᩵") ^ i6) * 41;
                        i7 = ((iM55979 ^ i5) * (-5455)) ^ 1295960914;
                        i8 = 68350462;
                    } else {
                        iM55979 = C0946.m55979("ۢۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4685) ^ 1728943830;
                        i8 = 200950305;
                    }
                    break;
                case -1982127871:
                case 2113866220:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۜۛ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 5631) ^ 1138155388;
                        i8 = 975537513;
                    } else {
                        iM55979 = (C0946.m55979("۟ۖ") + i5) * (-27);
                        i7 = ((iM55979 ^ i6) * 18367) ^ 1375932118;
                        i8 = 541181595;
                    }
                    break;
                case -1948926511:
                case 1289940350:
                    return false;
                case -1943505971:
                case -1892612802:
                    C0873.m55678();
                    ServiceConnectionC1013.m56157();
                    return false;
                case -1938993425:
                case -731656096:
                    i2 = this.f11271;
                    i3 = 1;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i5 - C0873.m55680("֡᩵")) * 83;
                        i7 = ((iM55979 ^ i6) * 11553) ^ (-527958809);
                        i8 = -699246404;
                    } else {
                        iM55979 = C0946.m55979("ۢۤ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 5815) ^ (-1114547542);
                        i8 = 497317973;
                    }
                    break;
                case -1928118566:
                case 650496880:
                    m10491(i);
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("۬ܽ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 2731) ^ (-1266189560);
                        i8 = 1321304378;
                    } else {
                        iM55979 = (i6 - C0873.m55680("᩷ܳ")) * 109;
                        i7 = ((iM55979 ^ i5) * 11497) ^ (-498283067);
                        i8 = -1809375117;
                    }
                    break;
                case -1694752696:
                case 960921629:
                    if (C0992.f81922 < 0) {
                        iM55979 = C0946.m55979("۬ܽ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 2731) ^ (-1266189560);
                        i8 = 1321304378;
                    } else {
                        iM55979 = C0946.m55979("ۢۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4685) ^ 1728943830;
                        i8 = 200950305;
                    }
                    break;
                case -1600384630:
                case -732924237:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i5 - C0873.m55680("ۚ᩶")) * (-71);
                        i7 = ((iM55979 ^ i6) * 4903) ^ (-1747337429);
                        i8 = 599605298;
                    } else {
                        iM55979 = C0873.m55680("ۜۛ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 5631) ^ 1138155388;
                        i8 = 975537513;
                    }
                    break;
                case -1464795329:
                case 84885185:
                    this.f11271 = i2 + i3;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("۬ܽ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 2731) ^ (-1266189560);
                        i8 = 1321304378;
                    } else {
                        iM55979 = C0873.m55680("᩶ۛ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-23731)) ^ 793579026;
                        i8 = -1364072174;
                    }
                    break;
                case -1411677122:
                case -69924925:
                    C0861.m55626();
                    if (!C0863.m55643()) {
                        iM55979 = C0873.m55680("ۜۛ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 5631) ^ 1138155388;
                        i8 = 975537513;
                    } else {
                        iM55979 = C0946.m55979("ۢۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4685) ^ 1728943830;
                        i8 = 200950305;
                    }
                    break;
                case -1354735922:
                case -1158163982:
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i5 - C0873.m55680("֡᩵")) * 83;
                        i7 = ((iM55979 ^ i6) * 11553) ^ (-527958809);
                        i8 = -699246404;
                    } else {
                        iM55979 = (i5 - C0873.m55680("ۘ᩶")) * (-21);
                        i7 = ((iM55979 ^ i6) * 10195) ^ (-500173168);
                        i8 = -118954764;
                    }
                    break;
                case -1307903926:
                case 77633828:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4685) ^ 1728943830;
                        i8 = 200950305;
                    } else {
                        iM55979 = C0946.m55979("ۗ۠") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-5647)) ^ 1362731229;
                        i8 = -7103041;
                    }
                    break;
                case -979289620:
                case 2011454993:
                    if (this.f11268[i2] != 0) {
                        iM55979 = (C0873.m55680("ܶ۫") + i5) * 127;
                        i7 = ((iM55979 ^ i6) * 4711) ^ (-1461692583);
                        i8 = -56467491;
                    } else {
                        iM55979 = C0873.m55680("ۛۧ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-22027)) ^ (-298329243);
                        i8 = -101290694;
                    }
                    break;
                case -753731796:
                case 2059381868:
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ۜۛ") ^ i6;
                        i7 = ((iM55979 ^ i5) * 5631) ^ 1138155388;
                        i8 = 975537513;
                    } else {
                        iM55979 = C0873.m55680("ۘܿ") ^ i5;
                        i7 = ((iM55979 ^ i6) * (-28043)) ^ 1593962030;
                        i8 = 397373424;
                    }
                    break;
                case -134080933:
                case 864669386:
                    if (C0890.f81849 != 0) {
                        iM55979 = (i5 - C0873.m55680("ۚ᩶")) * (-71);
                        i7 = ((iM55979 ^ i6) * 4903) ^ (-1747337429);
                        i8 = 599605298;
                    } else {
                        iM55979 = C0873.m55680("ۤۚ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-29597)) ^ (-437288876);
                        i8 = 441768336;
                    }
                    break;
                case 784565560:
                case 1698984218:
                    return true;
                default:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("ۢۙ") ^ i5;
                        i7 = ((iM55979 ^ i6) * 4685) ^ 1728943830;
                        i8 = 200950305;
                    } else {
                        iM55979 = C0946.m55979("ۜۧ") ^ i6;
                        i7 = ((iM55979 ^ i5) * (-1701)) ^ 1493629098;
                        i8 = -924087985;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4949(byte[] bArr) {
        this(new DataInputStream(new C20971(bArr, bArr.length)));
        int i = -343620889;
        int i2 = C0863.f81833;
        int i3 = C1053.f81965;
        int iM55979 = C0946.m55979("ۡܶ") ^ i2;
        int i4 = ((iM55979 ^ i3) * (-31691)) ^ 1179594166;
        int i5 = -1456494816;
        while (true) {
            i = ((((i ^ i3) * 19229) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2142500266:
                case -595871277:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("۟۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25297) ^ 50651194;
                        i5 = 2137655087;
                    }
                    break;
                case -1333766403:
                case 1736548291:
                    C0894.m55769();
                    if (C0873.f81841 > 0) {
                        iM55979 = C0946.m55979("᩺ۛ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-1513)) ^ 1020011695;
                        i5 = -61542558;
                    }
                    break;
                case -1312540588:
                case -1304484626:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("᩷ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30677) ^ 1609240538;
                        i5 = -400249935;
                    } else {
                        iM55979 = (C0873.m55680("᩹ܺ") ^ i2) * 35;
                        i4 = ((iM55979 ^ i3) * 20589) ^ 1669364060;
                        i5 = 19711234;
                        continue;
                    }
                    break;
                case -938738197:
                case 1049492092:
                    RunnableC1014.m56177();
                    if (!C0967.m56074()) {
                        iM55979 = (C0946.m55979("֫᩶") + i2) * 45;
                        i4 = ((iM55979 ^ i3) * (-12159)) ^ 2088531819;
                        i5 = 32204472;
                    }
                    break;
                case 139265558:
                case 1726235554:
                    return;
                case 1620391428:
                case 1937425147:
                    C1929.m56553();
                    break;
                default:
                    ServiceConnectionC1013.m56157();
                    throw new RuntimeException();
            }
            iM55979 = (i3 - C0873.m55680("ۙ᩹")) * (-83);
            i4 = ((iM55979 ^ i2) * 12307) ^ (-168699572);
            i5 = 296186904;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01cd A[PHI: r13 r18
      0x01cd: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:54:0x01cb, B:32:0x00eb, B:11:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r18v28 int) = (r18v10 int), (r18v17 int), (r18v31 int) binds: [B:54:0x01cb, B:32:0x00eb, B:11:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0205 A[PHI: r6 r8 r10 r11 r12 r18
      0x0205: PHI (r6v3 int[]) = (r6v2 int[]), (r6v1 int[]), (r6v1 int[]), (r6v1 int[]) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r18v32 int) = (r18v9 int), (r18v16 int), (r18v25 int), (r18v35 int) binds: [B:58:0x0203, B:36:0x0113, B:18:0x006b, B:6:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b0 A[PHI: r3 r9 r18 r19
      0x02b0: PHI (r3v3 byte) = (r3v2 byte), (r3v1 byte), (r3v1 byte) binds: [B:71:0x02ae, B:42:0x013b, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:71:0x02ae, B:42:0x013b, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r18v29 int) = (r18v6 int), (r18v15 int), (r18v30 int) binds: [B:71:0x02ae, B:42:0x013b, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02b0: PHI (r19v3 int) = (r19v2 int), (r19v1 int), (r19v1 int) binds: [B:71:0x02ae, B:42:0x013b, B:10:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (p067l.C1024.f81946 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4949(DataInputStream dataInputStream) throws IOException {
        int iM55979;
        int i;
        int i2;
        byte b = 0;
        int i3 = 0;
        int i4 = 0;
        int[] iArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 378573653;
        int i13 = C0912.f81867;
        int i14 = C1028.f81950;
        int iM55680 = (C0873.m55680("ۧ᩵") + i14) * (-43);
        int i15 = ((iM55680 ^ i13) * (-7409)) ^ 998211858;
        int i16 = iM55680 ^ (-1478097376);
        int iM55583 = 0;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * (-29985)) >> 31));
            switch (i17) {
                case -1957328070:
                case 1547982191:
                    if (C1036.f81953 < 0) {
                        i17 = i17;
                        iM55979 = (C0873.m55680("᩸ܶ") ^ i13) * (-97);
                        i = ((iM55979 ^ i14) * 25049) ^ 1142457679;
                        i2 = -1903192471;
                        int i18 = i17;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                        i12 = i18;
                    }
                    i17 = i17;
                    iM55979 = (C0873.m55680("ۘ֡") ^ i13) * 25;
                    i = ((iM55979 ^ i14) * 2157) ^ (-60599303);
                    i2 = 266592024;
                    int i19 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i19;
                    break;
                case -1916884881:
                case 289894802:
                    i17 = i17;
                    sArr[i5] = (short) i10;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܳ᩷") + i14) * (-63);
                        i = ((iM55979 ^ i13) * 1057) ^ (-1493977816);
                        i2 = 991701875;
                    } else {
                        iM55979 = C0873.m55680("ᩳ֡") ^ i13;
                        i = ((iM55979 ^ i14) * (-32309)) ^ 2117830718;
                        i2 = 1933724893;
                    }
                    int i110 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i110;
                    break;
                case -1856379891:
                case -1328715068:
                    C1964.m56597();
                    if (C1071.f81975 <= 0) {
                        i17 = i17;
                        iM55979 = (C0946.m55979("ܳۜ") + i14) * (-67);
                        i = ((iM55979 ^ i13) * 11935) ^ 1113782535;
                        i2 = -2060882031;
                        int i111 = i17;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                        i12 = i111;
                    }
                    i17 = i17;
                    iM55979 = C0873.m55680("᩻ۘ") ^ i14;
                    i = ((iM55979 ^ i13) * (-10669)) ^ 1888648772;
                    i2 = -1780018777;
                    int i112 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i112;
                    break;
                case -1848846297:
                case 2018272318:
                    ServiceConnectionC1013.m56157();
                    ViewOnClickListenerC0939.m55941();
                    i17 = i17;
                    iM55979 = C0873.m55680("᩻ۘ") ^ i14;
                    i = ((iM55979 ^ i13) * (-10669)) ^ 1888648772;
                    i2 = -1780018777;
                    int i113 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i113;
                    break;
                case -1470040803:
                case 1619714994:
                    this.f11269 = new short[i4];
                    i5 = 0;
                    iM55979 = C0946.m55979("᩹ᩴ") ^ i13;
                    i = ((iM55979 ^ i14) * (-16143)) ^ 451126095;
                    i2 = -1883554424;
                    int i114 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i114;
                    break;
                case -1174911303:
                case 1734190014:
                    i17 = i17;
                    sArr = this.f11269;
                    i8 = dataInputStream.read();
                    i9 = 255;
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ܳۜ") + i14) * (-67);
                        i = ((iM55979 ^ i13) * 11935) ^ 1113782535;
                        i2 = -2060882031;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩷") ^ i14;
                        i = ((iM55979 ^ i13) * (-29757)) ^ (-11406313);
                        i2 = 583763064;
                    }
                    int i115 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i115;
                    break;
                case -1027731977:
                case 1114777012:
                    i17 = i17;
                    this.f11270 = iArr;
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("᩸ܶ") ^ i13) * (-97);
                        i = ((iM55979 ^ i14) * 25049) ^ 1142457679;
                        i2 = -1903192471;
                    } else {
                        iM55979 = (i13 - C0873.m55680("ۨ֡")) * 9;
                        i = ((iM55979 ^ i14) * (-24883)) ^ (-1066467215);
                        i2 = -898036818;
                    }
                    int i116 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i116;
                    break;
                case -887464289:
                case -214080769:
                    C0863.m55643();
                    throw new RuntimeException();
                case -864900857:
                case 2069230978:
                    i17 = i17;
                    if (i5 < i4) {
                        iM55979 = C0946.m55979("ܰۖ") ^ i13;
                        i = ((iM55979 ^ i14) * (-177)) ^ (-2094059426);
                        i2 = 613916044;
                    } else {
                        iM55979 = (i14 - C0946.m55979("ۘۡ")) * 89;
                        i = ((iM55979 ^ i13) * 3975) ^ (-918569729);
                        i2 = 986656034;
                    }
                    int i117 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i117;
                    break;
                case -772578327:
                case 480842106:
                    i17 = i17;
                    iArr = new int[i4];
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("ܳۜ") + i14) * (-67);
                        i = ((iM55979 ^ i13) * 11935) ^ 1113782535;
                        i2 = -2060882031;
                    } else {
                        iM55979 = C0873.m55680("۬ۗ") ^ i14;
                        i = ((iM55979 ^ i13) * (-22917)) ^ (-2044900803);
                        i2 = -1536714631;
                    }
                    int i118 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i118;
                    break;
                case -710171647:
                case 1804524878:
                    i17 = i17;
                    dataInputStream.readShort();
                    i4 = dataInputStream.readByte();
                    if (C0947.m55997()) {
                        iM55979 = C0873.m55680("᩻ۘ") ^ i14;
                        i = ((iM55979 ^ i13) * (-10669)) ^ 1888648772;
                        i2 = -1780018777;
                    } else {
                        iM55979 = C0873.m55680("᩶᩵") ^ i13;
                        i = ((iM55979 ^ i14) * (-30841)) ^ 1582623537;
                        i2 = -1841629502;
                    }
                    int i119 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i119;
                    break;
                case -569538945:
                case 708279243:
                    C1024.m56209();
                    break;
                case -292368471:
                case 1142039339:
                    i17 = i17;
                    i10 = i8 & i9;
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("ᩴۙ") ^ i14) * (-75);
                        i = ((iM55979 ^ i13) * (-26013)) ^ (-202392127);
                        i2 = 1404973679;
                    } else {
                        iM55979 = (C0873.m55680("᩸ܶ") ^ i13) * (-97);
                        i = ((iM55979 ^ i14) * 25049) ^ 1142457679;
                        i2 = -1903192471;
                    }
                    int i1110 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1110;
                    break;
                case 82607718:
                case 1312049369:
                    i17 = i17;
                    i3 = 4;
                    if (b > 112) {
                        iM55979 = (C0946.m55979("ۖۘ") + i14) * (-123);
                        i = ((iM55979 ^ i13) * 12201) ^ (-1667884716);
                        i2 = -1492418868;
                    } else {
                        i11 = iM55583;
                        iM55979 = C0873.m55680("ܳ᩵") ^ i13;
                        i = ((iM55979 ^ i14) * (-8303)) ^ (-1054918708);
                        i2 = -1771993545;
                    }
                    int i1111 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1111;
                    break;
                case 288536310:
                case 886507850:
                    byte[] bArr = new byte[i7];
                    this.f11268 = bArr;
                    dataInputStream.readFully(bArr);
                    return;
                case 323622149:
                case 501342886:
                    i17 = i17;
                    i7 = i11 - i6;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("ۘ֡") ^ i13) * 25;
                        i = ((iM55979 ^ i14) * 2157) ^ (-60599303);
                        i2 = 266592024;
                    } else {
                        iM55979 = C0946.m55979("᩵ܳ") ^ i14;
                        i = ((iM55979 ^ i13) * (-21613)) ^ (-446871487);
                        i2 = 2011743565;
                    }
                    int i1112 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1112;
                    break;
                case 430043508:
                case 1127993932:
                    i5++;
                    iM55979 = C0946.m55979("᩹ᩴ") ^ i13;
                    i = ((iM55979 ^ i14) * (-16143)) ^ 451126095;
                    i2 = -1883554424;
                    int i1113 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1113;
                    break;
                case 515791151:
                case 810675752:
                    i17 = i17;
                    iM55583 = C0845.m55583(dataInputStream);
                    b = dataInputStream.readByte();
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("ۘ֡") ^ i13) * 25;
                        i = ((iM55979 ^ i14) * 2157) ^ (-60599303);
                        i2 = 266592024;
                    } else {
                        iM55979 = C0946.m55979("ۙۗ") ^ i14;
                        i = ((iM55979 ^ i13) * 15901) ^ (-1805508564);
                        i2 = 686676770;
                    }
                    int i1114 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1114;
                    break;
                case 814460615:
                case 1372795340:
                    this.f11270[i5] = C0845.m55583(dataInputStream);
                    if (C1964.f83032 <= 0) {
                        i17 = i17;
                        iM55979 = (C0873.m55680("ܳ᩷") + i14) * (-63);
                        i = ((iM55979 ^ i13) * 1057) ^ (-1493977816);
                        i2 = 991701875;
                    } else {
                        iM55979 = (C0873.m55680("ᩴۢ") ^ i13) * 65;
                        i17 = i17;
                        i = ((iM55979 ^ i14) * (-3565)) ^ 563873397;
                        i2 = 803458702;
                    }
                    int i1115 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1115;
                    break;
                case 842768399:
                case 2091238964:
                    i17 = i17;
                    dataInputStream.skipBytes(i3);
                    i11 = iM55583 - 4;
                    iM55979 = C0873.m55680("ܳ᩵") ^ i13;
                    i = ((iM55979 ^ i14) * (-8303)) ^ (-1054918708);
                    i2 = -1771993545;
                    int i1116 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1116;
                    break;
                default:
                    i17 = i17;
                    i6 = (i4 * 5) + i3;
                    if (C1024.f81946) {
                        iM55979 = (C0946.m55979("ܳۜ") + i14) * (-67);
                        i = ((iM55979 ^ i13) * 11935) ^ 1113782535;
                        i2 = -2060882031;
                    } else {
                        iM55979 = C0873.m55680("᩻۠") ^ i13;
                        i = ((iM55979 ^ i14) * (-19389)) ^ (-806534977);
                        i2 = 1350825300;
                    }
                    int i1117 = i17;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    i12 = i1117;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01ca A[PHI: r17 r18 r19
      0x01ca: PHI (r17v15 int) = (r17v11 int), (r17v16 int) binds: [B:61:0x01b2, B:53:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r18v9 short[]) = (r18v7 short[]), (r18v10 short[]) binds: [B:61:0x01b2, B:53:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r19v13 char) = (r19v9 char), (r19v14 char) binds: [B:61:0x01b2, B:53:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x028a A[PHI: r6 r7 r17 r18 r19
      0x028a: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short) binds: [B:14:0x004d, B:76:0x0288, B:38:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:14:0x004d, B:76:0x0288, B:38:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r17v19 int) = (r17v2 int), (r17v5 int), (r17v21 int) binds: [B:14:0x004d, B:76:0x0288, B:38:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r18v13 short[]) = (r18v0 short[]), (r18v1 short[]), (r18v16 short[]) binds: [B:14:0x004d, B:76:0x0288, B:38:0x00fc] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r19v17 char) = (r19v0 char), (r19v3 char), (r19v21 char) binds: [B:14:0x004d, B:76:0x0288, B:38:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    private void m10491(int i) {
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int iM559711;
        int i7;
        int i8;
        short[] sArr;
        int iM55680;
        int i9;
        int i10;
        int iM55681;
        int i11;
        int i12;
        int i13 = 0;
        short[] sArr2 = null;
        char c = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -66451800;
        int i20 = C0898.f81858;
        int i21 = C0866.f81837;
        int iM55682 = C0873.m55680("֨ܰ") ^ i21;
        int i22 = ((iM55682 ^ i20) * (-14683)) ^ (-99589032);
        int i23 = iM55682 ^ 1974713757;
        short[] sArr3 = null;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i20) * (-28941)) >> 31));
            switch (i19) {
                case -1929044719:
                case 1445679069:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    if (i <= 255) {
                        iM559710 = (i20 - C0946.m55979("᩶ۨ")) * (-41);
                        i5 = ((iM559710 ^ i21) * 14749) ^ 1869005673;
                        i6 = 1316102801;
                    } else {
                        iM559710 = C0946.m55979("ۛ֨") ^ i20;
                        i5 = ((iM559710 ^ i21) * (-23455)) ^ (-168608587);
                        i6 = -1641515875;
                    }
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -1904199497:
                case -315811477:
                    i13 = 0;
                    iM559710 = (C0873.m55680("ۨۚ") ^ i21) * (-127);
                    i5 = ((iM559710 ^ i20) * (-9487)) ^ 1380480181;
                    i6 = 2143663840;
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -1767069320:
                case -479539221:
                    short[] sArr4 = sArr2;
                    c = c;
                    i2 = i19;
                    short[] sArr5 = f81914;
                    if (RunnableC1014.f81941 > 0) {
                        throw new RuntimeException(C1017.m56189(sArr5, 1, 28, i18));
                    }
                    sArr2 = sArr4;
                    iM55979 = C0946.m55979("۠ۖ") ^ i21;
                    i3 = ((iM55979 ^ i20) * 29439) ^ (-291323407);
                    i4 = -248418418;
                    i23 = iM55979 ^ i4;
                    i22 = i3;
                    i19 = i2;
                    c = c;
                    break;
                    break;
                case -1538074271:
                case -1433379562:
                    c = c;
                    i2 = i19;
                    sArr2 = f81914;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("۠ۖ") ^ i21;
                        i3 = ((iM55979 ^ i20) * 29439) ^ (-291323407);
                        i4 = -248418418;
                    } else {
                        iM55979 = C0946.m55979("᩸᩸") ^ i20;
                        i3 = ((iM55979 ^ i21) * (-735)) ^ 1887594891;
                        i4 = -799226384;
                    }
                    i23 = iM55979 ^ i4;
                    i22 = i3;
                    i19 = i2;
                    c = c;
                    break;
                case -1413349559:
                case 772989563:
                    C0898.m55800();
                    if (C0890.f81849 != 0) {
                        sArr2 = sArr2;
                        c = c;
                        i19 = i19;
                        iM559710 = C0873.m55680("֫᩹") ^ i21;
                        i5 = ((iM559710 ^ i20) * 21533) ^ (-2098628398);
                        i6 = 1712023076;
                        i23 = iM559710 ^ i6;
                        i22 = i5;
                        i19 = i19;
                        sArr2 = sArr2;
                        c = c;
                    } else {
                        iM55681 = C0873.m55680("֫ۖ") ^ i20;
                        i11 = ((iM55681 ^ i21) * (-4683)) ^ (-1388116230);
                        i12 = -456919531;
                        int i24 = i11;
                        i23 = iM55681 ^ i12;
                        i22 = i24;
                    }
                    break;
                case -1391492112:
                case 921395144:
                    i18 = 30660;
                    iM559710 = C0946.m55979("۬ܺ") ^ i21;
                    i5 = ((iM559710 ^ i20) * 5755) ^ 1982503469;
                    i6 = 1731952936;
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -1305425908:
                case 1758117293:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    s = sArr2[c];
                    i14 = s + 13085;
                    if (C0890.f81849 != 0) {
                        iM559710 = C0873.m55680("֫᩹") ^ i21;
                        i5 = ((iM559710 ^ i20) * 21533) ^ (-2098628398);
                        i6 = 1712023076;
                    } else {
                        iM559710 = C0946.m55979("ۜ֫") ^ i21;
                        i5 = ((iM559710 ^ i20) * 11601) ^ (-1166906375);
                        i6 = -221671228;
                    }
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -1250317436:
                case 668313711:
                    short[] sArr6 = f81914;
                    i19 = i19;
                    if (AbstractC0942.f81890 > 0) {
                        if (!C0882.f81846) {
                            sArr2 = sArr2;
                            String strM55810 = C0906.m55810(sArr6, 29, 3, i18);
                            short[] sArr7 = f81914;
                            if (C0906.f81862 < 0) {
                                c = c;
                                StringBuilder sbM34408 = C15033.m34408(i, strM55810, C0937.m55921(sArr7, 32, 11, i18));
                                if (C0992.f81922 >= 0) {
                                    iM559710 = C0873.m55680("֫᩹") ^ i21;
                                    i5 = ((iM559710 ^ i20) * 21533) ^ (-2098628398);
                                    i6 = 1712023076;
                                } else {
                                    String string = Arrays.toString(sArr3);
                                    if (C0854.m55595() < 0) {
                                        C1003.m56121(sbM34408, string);
                                        throw new RuntimeException(C0845.m55591(sbM34408));
                                    }
                                }
                                i23 = iM559710 ^ i6;
                                i22 = i5;
                                i19 = i19;
                                sArr2 = sArr2;
                                c = c;
                                break;
                            }
                            iM559710 = (i20 - C0873.m55680("ۧܺ")) * (-105);
                            i5 = ((iM559710 ^ i21) * 16295) ^ 1751425095;
                            i6 = -711199837;
                            i23 = iM559710 ^ i6;
                            i22 = i5;
                            i19 = i19;
                            sArr2 = sArr2;
                            c = c;
                        } else {
                            sArr2 = sArr2;
                        }
                        c = c;
                        iM559710 = (i20 - C0873.m55680("ۧܺ")) * (-105);
                        i5 = ((iM559710 ^ i21) * 16295) ^ 1751425095;
                        i6 = -711199837;
                        i23 = iM559710 ^ i6;
                        i22 = i5;
                        i19 = i19;
                        sArr2 = sArr2;
                        c = c;
                    } else {
                        sArr = sArr2;
                        iM55680 = (C0946.m55979("۫ܽ") ^ i20) * 79;
                        i9 = ((iM55680 ^ i21) * 7727) ^ (-1060630949);
                        i10 = 1404462672;
                        i23 = iM55680 ^ i10;
                        i22 = i9;
                        i19 = i19;
                        sArr2 = sArr;
                    }
                    break;
                case -1206383899:
                case -843438929:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    if (i >= 0) {
                        iM559710 = (C0873.m55680("᩷ۚ") + i21) * (-85);
                        i5 = ((iM559710 ^ i20) * 47) ^ (-1703891174);
                        i6 = 1697963731;
                    } else {
                        iM559710 = C0946.m55979("ۛ֨") ^ i20;
                        i5 = ((iM559710 ^ i21) * (-23455)) ^ (-168608587);
                        i6 = -1641515875;
                    }
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -1205825730:
                case 247035232:
                    this.f11271 = this.f11270[i13];
                    return;
                case -1188496887:
                case 1457671722:
                    C0863.m55643();
                    if (!C0927.f81875) {
                        sArr = sArr2;
                        i19 = i19;
                        iM55680 = (C0946.m55979("۫ܽ") ^ i20) * 79;
                        i9 = ((iM55680 ^ i21) * 7727) ^ (-1060630949);
                        i10 = 1404462672;
                        i23 = iM55680 ^ i10;
                        i22 = i9;
                        i19 = i19;
                        sArr2 = sArr;
                    } else {
                        iM55681 = C0873.m55680("֫ۖ") ^ i20;
                        i11 = ((iM55681 ^ i21) * (-4683)) ^ (-1388116230);
                        i12 = -456919531;
                        int i25 = i11;
                        i23 = iM55681 ^ i12;
                        i22 = i25;
                    }
                    break;
                case -1077734271:
                case 1296559221:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    int i26 = i16 + i17;
                    if ((i26 + i26) - i15 < 0) {
                        iM559710 = C0946.m55979("᩶ۖ") ^ i20;
                        i5 = ((iM559710 ^ i21) * 1899) ^ (-1628579941);
                        i6 = 1493894015;
                    } else {
                        iM559710 = (C0946.m55979("۫ۢ") ^ i21) * 87;
                        i5 = ((iM559710 ^ i20) * 2409) ^ 1751372252;
                        i6 = 2015091324;
                    }
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case -656700104:
                case 2006086552:
                    sArr = sArr2;
                    i19 = i19;
                    c = 0;
                    if (C0873.m55678()) {
                        iM55680 = (C0946.m55979("۫ܽ") ^ i20) * 79;
                        i9 = ((iM55680 ^ i21) * 7727) ^ (-1060630949);
                        i10 = 1404462672;
                    } else {
                        iM55680 = (i21 - C0873.m55680("᩹᩷")) * (-107);
                        i9 = ((iM55680 ^ i20) * 14837) ^ 1028216020;
                        i10 = -715676700;
                    }
                    i23 = iM55680 ^ i10;
                    i22 = i9;
                    i19 = i19;
                    sArr2 = sArr;
                    break;
                case -485073113:
                case 1470659392:
                    if (!RunnableC0897.f81856) {
                        iM55681 = C0873.m55680("֫ۖ") ^ i20;
                        i11 = ((iM55681 ^ i21) * (-4683)) ^ (-1388116230);
                        i12 = -456919531;
                        int i27 = i11;
                        i23 = iM55681 ^ i12;
                        i22 = i27;
                    } else {
                        c = c;
                        i2 = i19;
                        iM55979 = C0946.m55979("۠ۖ") ^ i21;
                        i3 = ((iM55979 ^ i20) * 29439) ^ (-291323407);
                        i4 = -248418418;
                        i23 = iM55979 ^ i4;
                        i22 = i3;
                        i19 = i2;
                        c = c;
                    }
                    break;
                case -330873002:
                case 1116242412:
                    C0890.m55740();
                    C0930.m55885();
                    sArr = sArr2;
                    i19 = i19;
                    iM55680 = (C0946.m55979("۫ܽ") ^ i20) * 79;
                    i9 = ((iM55680 ^ i21) * 7727) ^ (-1060630949);
                    i10 = 1404462672;
                    i23 = iM55680 ^ i10;
                    i22 = i9;
                    i19 = i19;
                    sArr2 = sArr;
                    break;
                case -100627193:
                case 2014160218:
                    i13++;
                    iM559710 = (C0873.m55680("ۨۚ") ^ i21) * (-127);
                    i5 = ((iM559710 ^ i20) * (-9487)) ^ 1380480181;
                    i6 = 2143663840;
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case 63384845:
                case 849061009:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    short[] sArr8 = this.f11269;
                    if (i13 < sArr8.length) {
                        iM559711 = (C0946.m55979("ᩳۖ") + i20) * (-57);
                        i7 = ((iM559711 ^ i21) * 11141) ^ (-1459204445);
                        i8 = 296974348;
                    } else {
                        iM559711 = C0946.m55979("ᩳ֨") ^ i20;
                        i7 = ((iM559711 ^ i21) * 795) ^ 960239617;
                        i8 = -1107388967;
                    }
                    i23 = iM559711 ^ i8;
                    sArr3 = sArr8;
                    i22 = i7;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case 139548417:
                case 1619929060:
                    if (sArr3[i13] == i) {
                        iM55681 = C0873.m55680("ۨ֫") ^ i21;
                        i11 = ((iM55681 ^ i20) * 29287) ^ (-377887898);
                        i12 = 1728250622;
                    } else {
                        iM55681 = (C0873.m55680("᩷᩹") ^ i21) * (-115);
                        i11 = ((iM55681 ^ i20) * 4763) ^ 1059098426;
                        i12 = -1130793033;
                    }
                    int i28 = i11;
                    i23 = iM55681 ^ i12;
                    i22 = i28;
                    break;
                case 770317448:
                case 940650421:
                    sArr2 = sArr2;
                    c = c;
                    i19 = i19;
                    i15 = i14 * i14;
                    i16 = s * s;
                    i17 = 171217225;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM559710 = (i20 - C0873.m55680("ۧܺ")) * (-105);
                        i5 = ((iM559710 ^ i21) * 16295) ^ 1751425095;
                        i6 = -711199837;
                    } else {
                        iM559710 = (i20 - C0946.m55979("ܳۤ")) * 93;
                        i5 = ((iM559710 ^ i21) * 12169) ^ 311525836;
                        i6 = 1524945678;
                    }
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                case 1368145815:
                case 1875178805:
                    i18 = 51311;
                    iM559710 = C0946.m55979("۬ܺ") ^ i21;
                    i5 = ((iM559710 ^ i20) * 5755) ^ 1982503469;
                    i6 = 1731952936;
                    i23 = iM559710 ^ i6;
                    i22 = i5;
                    i19 = i19;
                    sArr2 = sArr2;
                    c = c;
                    break;
                default:
                    C1404.m56468();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m10494(int i) {
        int i2 = -2086168883;
        int i3 = C0967.f81910;
        int i4 = C0866.f81837;
        int iM55680 = (C0873.m55680("ۧ᩵") + i4) * 35;
        int i5 = ((iM55680 ^ i3) * (-28033)) ^ (-1598186737);
        int i6 = -846705042;
        while (true) {
            i2 = ((((i2 ^ i3) * (-26227)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1947276382:
                case -1875058031:
                    ServiceConnectionC1013.m56157();
                    return null;
                case -1116836582:
                case 2119190708:
                    int i7 = this.f11271;
                    if (ServiceConnectionC1013.m56157() > 0) {
                        int i8 = i7 + 1;
                        this.f11271 = i8;
                        if (C0946.f81894 == 0) {
                            byte[] bArr = this.f11268;
                            int i9 = bArr[i7];
                            if (C0890.m55740()) {
                                int i10 = i9 & 255;
                                if (C1053.f81965 > 0) {
                                    int i11 = i7 + 2;
                                    this.f11271 = i11;
                                    if (!C1024.f81946) {
                                        int i12 = bArr[i8] & 255;
                                        if (C0845.f81821 < 0) {
                                            if (!RunnableC0897.m55784()) {
                                                int i13 = (i12 << 8) | i10;
                                                byte[] bArr2 = new byte[i13];
                                                if (C1071.f81975 > 0) {
                                                    RunnableC1014.m56170(bArr, i11, bArr2, 0, i13);
                                                    int i14 = this.f11271 + i13;
                                                    if (C1964.f83032 > 0) {
                                                        this.f11271 = i14;
                                                        return new String(bArr2, StandardCharsets.UTF_8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                iM55680 = (i4 - C0873.m55680("ܰۘ")) * (-45);
                                i5 = ((iM55680 ^ i3) * (-3717)) ^ 222596324;
                                i6 = 1456382608;
                                break;
                            }
                            iM55680 = (C0946.m55979("ۡܽ") ^ i3) * (-43);
                            i5 = ((iM55680 ^ i4) * 20747) ^ 513666481;
                            i6 = 400059941;
                            break;
                        }
                        iM55680 = (C0873.m55680("᩺᩷") ^ i4) * 35;
                        i5 = ((iM55680 ^ i3) * (-24829)) ^ (-1108782296);
                        i6 = 1714117531;
                        break;
                    }
                    iM55680 = (i3 - C0946.m55979("ۙܳ")) * (-75);
                    i5 = ((iM55680 ^ i4) * (-26823)) ^ (-513215078);
                    i6 = 2104850215;
                    break;
                case -1104451898:
                case 1804397317:
                    C1229.m56410();
                    if (C1194.f82045 == 0) {
                        iM55680 = C0873.m55680("ᩳۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-6761)) ^ (-614499944);
                        i6 = 529530826;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܰۘ")) * (-45);
                        i5 = ((iM55680 ^ i3) * (-3717)) ^ 222596324;
                        i6 = 1456382608;
                    }
                    break;
                case -1062235382:
                case -955146786:
                    C1964.m56597();
                    iM55680 = (i4 - C0873.m55680("ܰۘ")) * (-45);
                    i5 = ((iM55680 ^ i3) * (-3717)) ^ 222596324;
                    i6 = 1456382608;
                    break;
                case -806085557:
                case 1283321629:
                    m10491(i);
                    if (C0927.f81875) {
                        iM55680 = (i3 - C0946.m55979("ۙܳ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-26823)) ^ (-513215078);
                        i6 = 2104850215;
                    } else {
                        iM55680 = (C0873.m55680("ܰܺ") + i3) * (-51);
                        i5 = ((iM55680 ^ i4) * 4691) ^ (-1978492175);
                        i6 = -1869599140;
                    }
                    break;
                case -414701343:
                case 684439619:
                    C0873.m55678();
                    if (C1124.f82007 < 0) {
                        iM55680 = (C0946.m55979("ۡܽ") ^ i3) * (-43);
                        i5 = ((iM55680 ^ i4) * 20747) ^ 513666481;
                        i6 = 400059941;
                    } else {
                        iM55680 = C0873.m55680("ᩳۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-6761)) ^ (-614499944);
                        i6 = 529530826;
                    }
                    break;
                default:
                    if (!C1025.m56230()) {
                        iM55680 = (i3 - C0946.m55979("ۙܳ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-26823)) ^ (-513215078);
                        i6 = 2104850215;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܰۘ")) * (-45);
                        i5 = ((iM55680 ^ i3) * (-3717)) ^ 222596324;
                        i6 = 1456382608;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[PHI: r10 r13
      0x00ed: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:35:0x00eb, B:27:0x00a9, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00ed: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:35:0x00eb, B:27:0x00a9, B:12:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0142 A[PHI: r8 r14 r15
      0x0142: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:43:0x0140, B:23:0x0085, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r14v3 byte) = (r14v1 byte), (r14v2 byte), (r14v1 byte) binds: [B:43:0x0140, B:23:0x0085, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r15v3 byte) = (r15v1 byte), (r15v2 byte), (r15v1 byte) binds: [B:43:0x0140, B:23:0x0085, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x017a A[PHI: r6 r7 r9
      0x017a: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:47:0x0178, B:39:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r7v3 byte) = (r7v2 byte), (r7v1 byte) binds: [B:47:0x0178, B:39:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:47:0x0178, B:39:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (p067l.C1124.f82007 < 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (p067l.C0877.m55696() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (p067l.C0906.f81862 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m10490() {
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55979;
        int i5;
        C4949 c4949 = this;
        byte[] bArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        byte b = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        byte b2 = 0;
        byte b3 = 0;
        int i12 = 0;
        byte b4 = 0;
        byte b5 = 0;
        int i13 = 571258996;
        int i14 = C1025.f81947;
        int i15 = C1964.f83032;
        int iM55681 = (C0873.m55680("۠ܺ") + i14) * (-11);
        int i16 = ((iM55681 ^ i15) * 18999) ^ (-1307680881);
        int i17 = iM55681 ^ 831411550;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 19887) >> 31));
            switch (i13) {
                case -2084378352:
                case -405596644:
                    break;
                case -1994570521:
                case -539910971:
                    c4949.f11271 = i18 + 4;
                    b4 = bArr[i11];
                    b5 = 255;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i15;
                        i3 = ((iM55979 ^ i14) * 29603) ^ 888806921;
                        i5 = -1103188114;
                    } else {
                        iM55979 = (C0873.m55680("ᩳᩳ") + i14) * 97;
                        i3 = ((iM55979 ^ i15) * (-22145)) ^ (-1936387610);
                        i5 = -2129671973;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -1948430607:
                case -1569419666:
                    C1929.m56553();
                    break;
                case -1833891602:
                case -691936912:
                    i10 = (i9 << 8) | i6;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ܳۨ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-11741)) ^ (-807738441);
                        i5 = 363302555;
                    } else {
                        iM55979 = (C0873.m55680("ۚ֡") + i15) * (-5);
                        i3 = ((iM55979 ^ i14) * (-11899)) ^ (-800074608);
                        i5 = 685264428;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -1805322414:
                case 1336895405:
                    int i20 = c4949.f11271;
                    i19 = i20 + 1;
                    if (C1025.f81947 >= 0) {
                        i18 = i20;
                        iM55979 = (C0873.m55680("ܳܺ") + i15) * (-121);
                        i3 = ((iM55979 ^ i14) * (-23117)) ^ 385737387;
                        i5 = 583656290;
                        i17 = iM55979 ^ i5;
                        i16 = i3;
                    } else {
                        int iM55682 = C0873.m55680("֨ۛ") ^ i15;
                        i17 = iM55682 ^ 325098007;
                        i18 = i20;
                        i16 = ((iM55682 ^ i14) * (-31209)) ^ 1467264817;
                        c4949 = this;
                    }
                    break;
                case -1517470876:
                case 608456606:
                    RunnableC0897.m55784();
                    C1194.m56396();
                    return 0;
                case -1144304350:
                case 700376566:
                    return ((b4 & b5) << 24) | i12;
                case -1012839841:
                case 403972193:
                    b2 = bArr[i8];
                    b3 = 255;
                    if (!C0947.m55997()) {
                        iM55979 = C0873.m55680("۟᩷") ^ i15;
                        i3 = ((iM55979 ^ i14) * (-6011)) ^ (-1874186112);
                        i5 = 1981721740;
                        i17 = iM55979 ^ i5;
                        i16 = i3;
                    }
                    i = i19;
                    iM55680 = C0873.m55680("᩶֫") ^ i14;
                    i2 = i;
                    i3 = ((iM55680 ^ i15) * (-14641)) ^ 28965317;
                    i4 = -895360831;
                    int i21 = iM55680 ^ i4;
                    i19 = i2;
                    i17 = i21;
                    i16 = i3;
                    break;
                case -964001575:
                case 1140671767:
                    i12 = i10 | ((b2 & b3) << 16);
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ۢ᩻") ^ i15;
                        i3 = ((iM55979 ^ i14) * 5821) ^ 884504729;
                        i5 = -365791745;
                    } else {
                        iM55979 = C0946.m55979("ۚܳ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-20357)) ^ (-969182335);
                        i5 = 2001072996;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -708060724:
                case 536268992:
                    i9 = b & 255;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i15;
                        i3 = ((iM55979 ^ i14) * 29603) ^ 888806921;
                        i5 = -1103188114;
                    } else {
                        iM55979 = (C0946.m55979("ۧ᩷") + i14) * (-113);
                        i3 = ((iM55979 ^ i15) * (-6451)) ^ 1722920782;
                        i5 = -647453309;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -631974590:
                case 73201885:
                    i11 = i18 + 3;
                    c4949.f11271 = i11;
                    if (C0861.m55626()) {
                        iM55979 = C0946.m55979("ۚܳ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-20357)) ^ (-969182335);
                        i5 = 2001072996;
                    } else {
                        iM55979 = (C0873.m55680("۬᩸") ^ i14) * (-115);
                        i3 = ((iM55979 ^ i15) * 29429) ^ 301117272;
                        i5 = 1062283916;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -517953181:
                case 1548215909:
                    C1053.m56327();
                    break;
                case -321998871:
                case 1042618585:
                    C0967.m56074();
                    RunnableC1014.m56177();
                    iM55979 = (C0873.m55680("ܳܺ") + i15) * (-121);
                    i3 = ((iM55979 ^ i14) * (-23117)) ^ 385737387;
                    i5 = 583656290;
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                case -201810035:
                case 646130375:
                    i = i19;
                    c4949.f11271 = i;
                    bArr = c4949.f11268;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("᩶֫") ^ i14;
                        i2 = i;
                        i3 = ((iM55680 ^ i15) * (-14641)) ^ 28965317;
                        i4 = -895360831;
                    } else {
                        i2 = i;
                        iM55680 = (C0873.m55680("ۨۙ") + i14) * (-75);
                        i3 = ((iM55680 ^ i15) * (-643)) ^ (-48737986);
                        i4 = 39560389;
                    }
                    int i22 = iM55680 ^ i4;
                    i19 = i2;
                    i17 = i22;
                    i16 = i3;
                    break;
                case 266798785:
                case 664028818:
                    i8 = i18 + i7;
                    c4949.f11271 = i8;
                    b = bArr[i19];
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0873.m55680("ܳۨ") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-11741)) ^ (-807738441);
                        i5 = 363302555;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ܽ᩶")) * 11;
                        i3 = ((iM55979 ^ i14) * (-31217)) ^ (-369119839);
                        i5 = -2055381598;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
                default:
                    i6 = bArr[i18] & 255;
                    i7 = 2;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("ܳܺ") + i15) * (-121);
                        i3 = ((iM55979 ^ i14) * (-23117)) ^ 385737387;
                        i5 = 583656290;
                    } else {
                        iM55979 = C0946.m55979("ۢ۠") ^ i14;
                        i3 = ((iM55979 ^ i15) * (-24365)) ^ (-215799613);
                        i5 = -753706175;
                    }
                    i17 = iM55979 ^ i5;
                    i16 = i3;
                    break;
            }
        }
    }
}
