package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6398 implements PluginPreference.Builder {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Class f19798;

    /* JADX INFO: renamed from: ۜ֨ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f19799 = {264, -13976, -13985, -13998, -14005, -13989, -14050, -13999, -13992, -14050, -14050, -13987, -13985, -14000, -14050, -14000, -13999, -14006, -14050, -13988, -13989, -14050, -14000, -14005, -13998, -13998, 4040, -20975, -20980, -20975, -20983, -20992, 2167, -17184, -17155, -17184, -17160, -17167, -17153, -17167, -17171, 1233, 18006, 17995, 18006, 17998, 17991, 17993, 17991, 18011, 500, -29382, -29401, -29382, -29406, -29397, -29403, -29397, -29385, 2407, -8102, -8121, -8102, -8126, -8117, -8123, -8117, -8105, 6639, 15365, 15384, 15365, 15389, 15380, 9659, 1433, 1412, 1433, 1409, 1416, 1414, 1416, 1428};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PluginContext f19800;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f19801;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f19802;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LocalString f19803;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceChangeListener f19804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceScreenCreatedListener f19805;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f19806;

    /* JADX WARN: Code duplicated, block: B:39:0x0134 A[PHI: r2 r11 r12 r16
      0x0134: PHI (r2v5 l.ۨ᩻᩷) = (r2v3 l.ۨ᩻᩷), (r2v2 l.ۨ᩻᩷), (r2v2 l.ۨ᩻᩷), (r2v2 l.ۨ᩻᩷) binds: [B:38:0x0132, B:30:0x00eb, B:91:0x0134, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:38:0x0132, B:30:0x00eb, B:91:0x0134, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:38:0x0132, B:30:0x00eb, B:91:0x0134, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r16v25 int) = (r16v11 int), (r16v14 int), (r16v19 int), (r16v26 int) binds: [B:38:0x0132, B:30:0x00eb, B:91:0x0134, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0208 A[PHI: r5 r6 r7 r10 r16
      0x0208: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:54:0x0206, B:50:0x01e0, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x0206, B:50:0x01e0, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:54:0x0206, B:50:0x01e0, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:54:0x0206, B:50:0x01e0, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r16v12 int) = (r16v5 int), (r16v6 int), (r16v13 int) binds: [B:54:0x0206, B:50:0x01e0, B:34:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x025f A[PHI: r3 r4 r8 r16
      0x025f: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:62:0x025d, B:58:0x023c, B:19:0x0097, B:6:0x004e, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:62:0x025d, B:58:0x023c, B:19:0x0097, B:6:0x004e, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r8v4 short) = (r8v2 short), (r8v2 short), (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:62:0x025d, B:58:0x023c, B:19:0x0097, B:6:0x004e, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r16v21 int) = (r16v3 int), (r16v4 int), (r16v15 int), (r16v18 int), (r16v22 int) binds: [B:62:0x025d, B:58:0x023c, B:19:0x0097, B:6:0x004e, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Header addHeader(CharSequence charSequence) {
        int iM2566;
        int i;
        int i2;
        int i3;
        CharSequence charSequence2 = charSequence;
        int i4 = C2520.f8000;
        int i5 = C3019.f9544;
        int iM6981 = C2105.m6981("ۙۜ") ^ i4;
        int i6 = ((iM6981 ^ i5) * 29077) ^ 784894581;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6981 ^ (-1314510166);
        C12043 c12043 = null;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1313440928;
        while (true) {
            int i14 = i7 ^ (i6 & (((i13 ^ i5) * 21465) >> 31));
            switch (i14) {
                case -1996468698:
                case -558321212:
                    i14 = i14;
                    sArr = f19799;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i4 - C0630.m2566("ܿ۠")) * 81;
                        i = ((iM2566 ^ i5) * 19749) ^ 97456474;
                        i2 = 1516435267;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i4;
                        i = ((iM2566 ^ i5) * (-19333)) ^ (-341462534);
                        i2 = -1809468093;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -1979223312:
                case 1670859295:
                    i14 = i14;
                    i9 = i8 + 395492769;
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("᩺۬") ^ i5;
                        i = ((iM2566 ^ i4) * (-26059)) ^ (-305006578);
                        i2 = -1608797462;
                    } else {
                        iM2566 = (C2105.m6981("ۜۡ") ^ i5) * 115;
                        i = ((iM2566 ^ i4) * (-22635)) ^ (-1591598518);
                        i2 = 1430097562;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -1956689359:
                case 2137793895:
                    C4616.m13552();
                    if (C3683.f11629 >= 0) {
                        i14 = i14;
                        iM2566 = (i5 - C2105.m6981("ۤۤ")) * (-65);
                        i = ((iM2566 ^ i4) * 8527) ^ (-535347648);
                        i2 = -1139152323;
                        i6 = i;
                        i13 = i14;
                        i7 = iM2566 ^ i2;
                        charSequence2 = charSequence;
                    } else {
                        int iM2567 = C0630.m2566("ܳۚ") ^ i4;
                        i3 = i14;
                        i7 = iM2567 ^ 752915061;
                        i6 = ((iM2567 ^ i5) * 14375) ^ 890913641;
                        i13 = i3;
                    }
                    break;
                case -1488667610:
                case 1440140954:
                    i14 = i14;
                    C1005.m3501();
                    iM2566 = (i4 - C0630.m2566("ܿ۠")) * 81;
                    i = ((iM2566 ^ i5) * 19749) ^ 97456474;
                    i2 = 1516435267;
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -1359603039:
                case 528590391:
                    i14 = i14;
                    c = 26;
                    if (C2105.m6982() != 0) {
                        iM2566 = (i4 - C0630.m2566("ܿ۠")) * 81;
                        i = ((iM2566 ^ i5) * 19749) ^ 97456474;
                        i2 = 1516435267;
                    } else {
                        iM2566 = C0630.m2566("ܽۤ") ^ i4;
                        i = ((iM2566 ^ i5) * (-27777)) ^ 862074743;
                        i2 = -548434009;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -960301656:
                case -495060932:
                    C1916.m6307(this.f19801, c12043);
                    return c12043;
                case -841458139:
                case 315727557:
                    i14 = i14;
                    i11 = 27;
                    i12 = 5;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i5 - C2105.m6981("ۤۤ")) * (-65);
                        i = ((iM2566 ^ i4) * 8527) ^ (-535347648);
                        i2 = -1139152323;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩻ۧ")) * 35;
                        i = ((iM2566 ^ i5) * 27581) ^ (-249131986);
                        i2 = 1320149468;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -827182021:
                case 973224413:
                    i14 = i14;
                    if (C2126.f7087) {
                        iM2566 = (i4 - C2105.m6981("۠ᩴ")) * (-111);
                        i = ((iM2566 ^ i5) * 12633) ^ (-833082650);
                        i2 = 211362215;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩵") ^ i5;
                        i = ((iM2566 ^ i4) * 7085) ^ (-588606617);
                        i2 = 1688283467;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -657536560:
                case 1489567221:
                    i14 = i14;
                    c12043 = new C12043();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (i5 - C2105.m6981("ۤۤ")) * (-65);
                        i = ((iM2566 ^ i4) * 8527) ^ (-535347648);
                        i2 = -1139152323;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩷") ^ i4;
                        i = ((iM2566 ^ i5) * 23625) ^ 2037760848;
                        i2 = -1474602939;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case -191457255:
                case 1547761826:
                    i10 = 29090;
                    iM2566 = (C2105.m6981("᩵᩻") ^ i5) * (-69);
                    i = ((iM2566 ^ i4) * (-31093)) ^ (-998191129);
                    i2 = 737053698;
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case 36295045:
                case 1958270336:
                    C0798.m2998();
                    return null;
                case 242458080:
                case 1070076949:
                    i14 = i14;
                    if ((s * s2) - i9 <= 0) {
                        iM2566 = C2105.m6981("ܳܰ") ^ i4;
                        i = ((iM2566 ^ i5) * (-3327)) ^ 1701925040;
                        i2 = -817723210;
                    } else {
                        iM2566 = C2105.m6981("ۛܿ") ^ i5;
                        i = ((iM2566 ^ i4) * 14305) ^ 2009149147;
                        i2 = 423086637;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case 371858605:
                case 721322129:
                    C3683.m11222();
                    if (!C0382.f1805) {
                        int iM2568 = C0630.m2566("ܳۚ") ^ i4;
                        i3 = i14;
                        i7 = iM2568 ^ 752915061;
                        i6 = ((iM2568 ^ i5) * 14375) ^ 890913641;
                        i13 = i3;
                    } else {
                        i14 = i14;
                        iM2566 = (i4 - C0630.m2566("ܿ۠")) * 81;
                        i = ((iM2566 ^ i5) * 19749) ^ 97456474;
                        i2 = 1516435267;
                        i6 = i;
                        i13 = i14;
                        i7 = iM2566 ^ i2;
                        charSequence2 = charSequence;
                    }
                    break;
                case 599752396:
                case 2019833885:
                    i14 = i14;
                    sArr2 = f19799;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("᩺۬") ^ i5;
                        i = ((iM2566 ^ i4) * (-26059)) ^ (-305006578);
                        i2 = -1608797462;
                    } else {
                        iM2566 = C2105.m6981("֨ܰ") ^ i5;
                        i = ((iM2566 ^ i4) * 7817) ^ (-1826509204);
                        i2 = -9395779;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case 718961192:
                case 1303969960:
                    C0483.m2121();
                    if (C0964.f3626 != 0) {
                        i14 = i14;
                        iM2566 = (i4 - C2105.m6981("۠ᩴ")) * (-111);
                        i = ((iM2566 ^ i5) * 12633) ^ (-833082650);
                        i2 = 211362215;
                        i6 = i;
                        i13 = i14;
                        i7 = iM2566 ^ i2;
                        charSequence2 = charSequence;
                    }
                    i14 = i14;
                    iM2566 = (i5 - C2105.m6981("ۤۤ")) * (-65);
                    i = ((iM2566 ^ i4) * 8527) ^ (-535347648);
                    i2 = -1139152323;
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case 1038742774:
                case 1155966655:
                    i10 = 44645;
                    iM2566 = (C2105.m6981("᩵᩻") ^ i5) * (-69);
                    i = ((iM2566 ^ i4) * (-31093)) ^ (-998191129);
                    i2 = 737053698;
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                case 1312267426:
                case 1505351492:
                    i14 = i14;
                    m17725(charSequence2, C21923.m49334(sArr2, i11, i12, i10));
                    c12043.f24118 = charSequence2;
                    if (C2105.f7037 == 0) {
                        int iM2569 = (C0630.m2566("ۜ᩵") + i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2569 ^ i4) * (-8501)) ^ 1938810931;
                        charSequence2 = charSequence;
                        i3 = i14;
                        i7 = iM2569 ^ (-1760968471);
                        i13 = i3;
                    } else {
                        iM2566 = (i5 - C2105.m6981("ۤۤ")) * (-65);
                        i = ((iM2566 ^ i4) * 8527) ^ (-535347648);
                        i2 = -1139152323;
                        i6 = i;
                        i13 = i14;
                        i7 = iM2566 ^ i2;
                        charSequence2 = charSequence;
                    }
                    break;
                case 1396094046:
                case 1424728244:
                    i14 = i14;
                    s = sArr[c];
                    i8 = s * s;
                    if (C5695.m16023() >= 0) {
                        iM2566 = C2105.m6981("᩺۬") ^ i5;
                        i = ((iM2566 ^ i4) * (-26059)) ^ (-305006578);
                        i2 = -1608797462;
                    } else {
                        iM2566 = C2105.m6981("۫᩻") ^ i5;
                        i = ((iM2566 ^ i4) * (-28863)) ^ (-1917072709);
                        i2 = -1909050593;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
                default:
                    i14 = i14;
                    s2 = 39774;
                    if (C1047.m3599() >= 0) {
                        iM2566 = (i4 - C0630.m2566("ܿ۠")) * 81;
                        i = ((iM2566 ^ i5) * 19749) ^ 97456474;
                        i2 = 1516435267;
                    } else {
                        iM2566 = C2105.m6981("ܳ᩸") ^ i4;
                        i = ((iM2566 ^ i5) * (-16111)) ^ 1872982244;
                        i2 = -1267980828;
                    }
                    i6 = i;
                    i13 = i14;
                    i7 = iM2566 ^ i2;
                    charSequence2 = charSequence;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01e5 A[PHI: r4 r7 r16
      0x01e5: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:51:0x01e3, B:28:0x00e5, B:19:0x0094, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v5 int) = (r7v4 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:51:0x01e3, B:28:0x00e5, B:19:0x0094, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r16v21 int) = (r16v6 int), (r16v15 int), (r16v16 int), (r16v22 int) binds: [B:51:0x01e3, B:28:0x00e5, B:19:0x0094, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0275 A[PHI: r10 r11 r16
      0x0275: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:63:0x0273, B:36:0x0134, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:63:0x0273, B:36:0x0134, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r16v25 int) = (r16v3 int), (r16v12 int), (r16v30 int) binds: [B:63:0x0273, B:36:0x0134, B:10:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02a5 A[PHI: r3 r5 r9 r12 r16
      0x02a5: PHI (r3v4 l.ᩳۜ᩷) = (r3v2 l.ᩳۜ᩷), (r3v2 l.ᩳۜ᩷), (r3v3 l.ᩳۜ᩷), (r3v2 l.ᩳۜ᩷) binds: [B:67:0x02a3, B:59:0x0254, B:40:0x015c, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:67:0x02a3, B:59:0x0254, B:40:0x015c, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:67:0x02a3, B:59:0x0254, B:40:0x015c, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:67:0x02a3, B:59:0x0254, B:40:0x015c, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r16v13 int) = (r16v2 int), (r16v4 int), (r16v11 int), (r16v14 int) binds: [B:67:0x02a3, B:59:0x0254, B:40:0x015c, B:32:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Text addText(CharSequence charSequence, String str) {
        int iM2566;
        int i;
        int i2;
        int i3;
        String str2 = str;
        int i4 = C0050.f910;
        int i5 = C2958.f9394;
        int iM2567 = (C0630.m2566("᩵᩶") ^ i4) * (-7);
        int i6 = ((iM2567 ^ i5) * 15129) ^ (-1185104418);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2567 ^ 1992834566;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 994168362;
        String strM9250 = null;
        C17896 c17896 = null;
        while (true) {
            int i13 = i7 ^ (i6 & (((i12 ^ i5) * (-19215)) >> 31));
            switch (i13) {
                case -2067621447:
                case 1100183742:
                    i9 = 1517;
                    iM2566 = (C0630.m2566("᩺ܺ") + i4) * 11;
                    i = ((iM2566 ^ i5) * 17567) ^ 28772775;
                    i2 = 2118254480;
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -2007684699:
                case 197478476:
                    i13 = i13;
                    strM9250 = C3019.m9250(sArr3, 80, 3, i9);
                    if (C0050.m940() <= 0) {
                        iM2566 = (i5 - C2105.m6981("ۚܽ")) * 7;
                        i = ((iM2566 ^ i4) * 11711) ^ (-1424087848);
                        i2 = 952162402;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۜ᩵")) * 15;
                        i = ((iM2566 ^ i5) * 13407) ^ 2118465010;
                        i2 = 1566151800;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1865998186:
                case -1159755901:
                    i13 = i13;
                    m17725(str2, strM9250);
                    if (C2167.f7158 < 0) {
                        int iM2568 = C0630.m2566("ܶۜ") ^ i4;
                        i6 = ((iM2568 ^ i5) * 11507) ^ 1092825511;
                        str2 = str;
                        i3 = i13;
                        i7 = iM2568 ^ 708865180;
                        i12 = i3;
                    } else {
                        iM2566 = C0630.m2566("ܳ۟") ^ i4;
                        i = ((iM2566 ^ i5) * 29443) ^ (-1808595203);
                        i2 = -1912222811;
                        i6 = i;
                        i12 = i13;
                        i7 = iM2566 ^ i2;
                        str2 = str;
                    }
                    break;
                case -1562410295:
                case 2007737174:
                    i13 = i13;
                    C1047.m3599();
                    iM2566 = (i5 - C2105.m6981("ۚܽ")) * 7;
                    i = ((iM2566 ^ i4) * 11711) ^ (-1424087848);
                    i2 = 952162402;
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1518720599:
                case -333432804:
                    i13 = i13;
                    c17896 = new C17896();
                    sArr2 = f19799;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۡ᩸") ^ i5;
                        i = ((iM2566 ^ i4) * (-8851)) ^ (-1085216349);
                        i2 = -1123214895;
                    } else {
                        iM2566 = C2105.m6981("ۚ֨") ^ i5;
                        i = ((iM2566 ^ i4) * (-14529)) ^ (-1888127471);
                        i2 = -508291277;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1300487515:
                case 804985320:
                    i13 = i13;
                    if (i8 - (s * 3094) >= 0) {
                        iM2566 = (C2105.m6981("ۢۚ") + i4) * (-117);
                        i = ((iM2566 ^ i5) * 29899) ^ 902649429;
                        i2 = -910717025;
                    } else {
                        iM2566 = (C2105.m6981("۬᩵") + i5) * 75;
                        i = ((iM2566 ^ i4) * 5661) ^ 1854440176;
                        i2 = -1158017205;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1276592171:
                case -510103663:
                    C22628.m50615();
                    if (C3537.m10746() <= 0) {
                        i13 = i13;
                        iM2566 = C0630.m2566("ܳ۟") ^ i4;
                        i = ((iM2566 ^ i5) * 29443) ^ (-1808595203);
                        i2 = -1912222811;
                        i6 = i;
                        i12 = i13;
                        i7 = iM2566 ^ i2;
                        str2 = str;
                    }
                    i13 = i13;
                    iM2566 = (i5 - C2105.m6981("ۚܽ")) * 7;
                    i = ((iM2566 ^ i4) * 11711) ^ (-1424087848);
                    i2 = 952162402;
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1138290923:
                case 1987695830:
                    i13 = i13;
                    s = sArr[74];
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("ܳ۟") ^ i4;
                        i = ((iM2566 ^ i5) * 29443) ^ (-1808595203);
                        i2 = -1912222811;
                    } else {
                        iM2566 = C2105.m6981("ۨۖ") ^ i4;
                        i = ((iM2566 ^ i5) * 10179) ^ 776259576;
                        i2 = -1050815752;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -1112312056:
                case 1957003690:
                    i13 = i13;
                    m17725(charSequence, ServiceConnectionC3453.m10568(sArr2, i10, i11, i9));
                    sArr3 = f19799;
                    if (C4117.f13076 <= 0) {
                        iM2566 = C2105.m6981("ۡ᩸") ^ i5;
                        i = ((iM2566 ^ i4) * (-8851)) ^ (-1085216349);
                        i2 = -1123214895;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩶") + i5) * (-51);
                        i = ((iM2566 ^ i4) * (-12309)) ^ 656379791;
                        i2 = -1584798884;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -994934349:
                case 1039668061:
                    i13 = i13;
                    i8 = 2393209 + (s * s);
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i5 - C2105.m6981("ۚܽ")) * 7;
                        i = ((iM2566 ^ i4) * 11711) ^ (-1424087848);
                        i2 = 952162402;
                    } else {
                        iM2566 = (C0630.m2566("ܽܳ") + i5) * (-109);
                        i = ((iM2566 ^ i4) * (-17333)) ^ 561371641;
                        i2 = 767193202;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -757703272:
                case -689596495:
                    c17896.f24118 = charSequence;
                    c17896.f24119 = str2;
                    C7106.m19117(this.f19801, c17896);
                    return c17896;
                case -645925611:
                case 345380778:
                    i13 = i13;
                    i10 = 75;
                    i11 = 5;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * 16775) ^ 155932729;
                        i2 = 490570717;
                    } else {
                        iM2566 = (C2105.m6981("᩸᩸") + i4) * (-45);
                        i = ((iM2566 ^ i5) * 9541) ^ 793180796;
                        i2 = -490637445;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case -491062012:
                case 1803987115:
                    i9 = 60709;
                    iM2566 = (C0630.m2566("᩺ܺ") + i4) * 11;
                    i = ((iM2566 ^ i5) * 17567) ^ 28772775;
                    i2 = 2118254480;
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case 112691463:
                case 1639680668:
                    i13 = i13;
                    if (C1916.f6442) {
                        iM2566 = (i4 - C0630.m2566("᩵֫")) * (-61);
                        i = ((iM2566 ^ i5) * (-2211)) ^ (-456905138);
                        i2 = -1836573880;
                    } else {
                        iM2566 = C2105.m6981("ۡ᩸") ^ i5;
                        i = ((iM2566 ^ i4) * (-8851)) ^ (-1085216349);
                        i2 = -1123214895;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case 246037617:
                case 1608832599:
                    i13 = i13;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * 16775) ^ 155932729;
                        i2 = 490570717;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩹") ^ i5;
                        i = ((iM2566 ^ i4) * (-18943)) ^ (-1787557492);
                        i2 = -1942925061;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case 454204988:
                case 2031313935:
                    i13 = i13;
                    sArr = f19799;
                    if (C4075.m12263() <= 0) {
                        iM2566 = C2105.m6981("ۡ᩸") ^ i5;
                        i = ((iM2566 ^ i4) * (-8851)) ^ (-1085216349);
                        i2 = -1123214895;
                    } else {
                        iM2566 = (C2105.m6981("ۚܿ") ^ i5) * 81;
                        i = ((iM2566 ^ i4) * (-6879)) ^ 1011275386;
                        i2 = 870674375;
                    }
                    i6 = i;
                    i12 = i13;
                    i7 = iM2566 ^ i2;
                    str2 = str;
                    break;
                case 911663983:
                case 1923100898:
                    if (C3663.m11168() >= 0) {
                        int iM6981 = (i5 - C2105.m6981("᩻ۜ")) * 71;
                        i3 = i13;
                        i7 = iM6981 ^ (-1938903540);
                        i6 = ((iM6981 ^ i4) * (-23395)) ^ (-715677710);
                        i12 = i3;
                    } else {
                        i13 = i13;
                        iM2566 = (i5 - C2105.m6981("ۚܽ")) * 7;
                        i = ((iM2566 ^ i4) * 11711) ^ (-1424087848);
                        i2 = 952162402;
                        i6 = i;
                        i12 = i13;
                        i7 = iM2566 ^ i2;
                        str2 = str;
                    }
                    break;
                case 1211051249:
                case 1668960733:
                    if (RunnableC3474.f10992 > 0) {
                        i13 = i13;
                        iM2566 = C2105.m6981("۬ᩳ") ^ i4;
                        i = ((iM2566 ^ i5) * 16775) ^ 155932729;
                        i2 = 490570717;
                        i6 = i;
                        i12 = i13;
                        i7 = iM2566 ^ i2;
                        str2 = str;
                    } else {
                        int iM6982 = (i5 - C2105.m6981("᩻ۜ")) * 71;
                        i3 = i13;
                        i7 = iM6982 ^ (-1938903540);
                        i6 = ((iM6982 ^ i4) * (-23395)) ^ (-715677710);
                        i12 = i3;
                    }
                    break;
                default:
                    C3537.m10746();
                    C1128.m3851();
                    return null;
            }
        }
    }

    static {
        ClassNotFoundException e = null;
        int i = 2079977780;
        int i2 = C0483.f2088;
        int i3 = C4263.f13799;
        int iM6981 = (C2105.m6981("ܰ᩸") ^ i3) * (-49);
        int i4 = ((iM6981 ^ i2) * (-899)) ^ (-448849055);
        int i5 = -1259346215;
        while (true) {
            i = ((((i ^ i2) * 6777) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1716969524:
                case -1631984178:
                    ServiceConnectionC3453.m10564();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ۢᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-5571)) ^ (-1251692624);
                        i5 = 9416779;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    }
                    break;
                case -1637226979:
                case -671792581:
                    if (C1294.f4556 < 0) {
                        if (C0237.f1507 == 0) {
                            if (!C2272.m7503()) {
                                if (RunnableC0588.f2309 < 0) {
                                    if (C1916.f6442) {
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            if (C1711.f5919) {
                                                iM6981 = C0630.m2566("ۢᩴ") ^ i2;
                                                i4 = ((iM6981 ^ i3) * (-5571)) ^ (-1251692624);
                                                i5 = 9416779;
                                                break;
                                            } else if (!C2167.m7155()) {
                                                if (C2958.f9394 < 0) {
                                                    if (C7811.f24123 < 0) {
                                                        throw new RuntimeException(e);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                iM6981 = (i2 - C2105.m6981("ۧ᩵")) * 5;
                                i4 = ((iM6981 ^ i3) * 15523) ^ 1403582579;
                                i5 = -1104353482;
                                break;
                            }
                        }
                        iM6981 = (i2 - C0630.m2566("ᩳ᩺")) * 37;
                        i4 = ((iM6981 ^ i3) * (-21541)) ^ 526551597;
                        i5 = 1515696917;
                        break;
                    }
                    iM6981 = (i3 - C0630.m2566("ۚܶ")) * (-107);
                    i4 = ((iM6981 ^ i2) * (-24483)) ^ (-1408781279);
                    i5 = -2089847886;
                    break;
                case -702576561:
                case -444130081:
                    C3911.m11924();
                    if (C0237.f1507 != 0) {
                        iM6981 = (i3 - C0630.m2566("ۚܶ")) * (-107);
                        i4 = ((iM6981 ^ i2) * (-24483)) ^ (-1408781279);
                        i5 = -2089847886;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    }
                    break;
                case 106514094:
                case 607625986:
                    C1916.m6308();
                    throw new RuntimeException();
                case 150307471:
                case 1322515321:
                    try {
                        int i6 = ActivityC18827.f59388;
                        f19798 = ActivityC18827.class;
                        iM6981 = (C2105.m6981("۟᩶") ^ i3) * (-69);
                        i4 = ((iM6981 ^ i2) * 2651) ^ (-809099864);
                        i5 = -1556292279;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        iM6981 = (C0630.m2566("ۙᩳ") + i2) * 83;
                        i4 = ((iM6981 ^ i3) * (-2277)) ^ (-1429413741);
                        i5 = -1892217988;
                    }
                    break;
                case 646595270:
                case 1103254828:
                    return;
                case 1256589560:
                case 1710664345:
                    C0714.m2805();
                    if (!C1504.f5354) {
                        iM6981 = (i2 - C2105.m6981("ۧ᩵")) * 5;
                        i4 = ((iM6981 ^ i3) * 15523) ^ 1403582579;
                        i5 = -1104353482;
                    } else {
                        iM6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((iM6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    }
                    break;
                default:
                    C1294.m4372();
                    iM6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                    i4 = ((iM6981 ^ i2) * (-5945)) ^ 487375899;
                    i5 = -1201431920;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0208 A[PHI: r4 r8 r9
      0x0208: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:55:0x0206, B:28:0x00d4, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x0206, B:28:0x00d4, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:55:0x0206, B:28:0x00d4, B:11:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0260 A[PHI: r6 r7 r13 r14 r20
      0x0260: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:63:0x025e, B:59:0x0240, B:36:0x0120, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:63:0x025e, B:59:0x0240, B:36:0x0120, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:63:0x025e, B:59:0x0240, B:36:0x0120, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:63:0x025e, B:59:0x0240, B:36:0x0120, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x025e, B:59:0x0240, B:36:0x0120, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0292 A[PHI: r3 r12 r15
      0x0292: PHI (r3v4 l.ܽۜ᩷) = (r3v2 l.ܽۜ᩷), (r3v3 l.ܽۜ᩷), (r3v2 l.ܽۜ᩷) binds: [B:67:0x0290, B:40:0x0149, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:67:0x0290, B:40:0x0149, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:67:0x0290, B:40:0x0149, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Switch addSwitch(CharSequence charSequence, String str) {
        int iM6981;
        int i;
        int i2;
        str = str;
        int i3 = C1047.f3863;
        int i4 = RunnableC0588.f2309;
        int iM2566 = C0630.m2566("ᩴ᩷") ^ i3;
        int i5 = ((iM2566 ^ i4) * 439) ^ (-1174941371);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ 1272527452;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1446166714;
        String strM1483 = null;
        C16484 c16484 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 6809) >> 31));
            switch (i13) {
                case -2132626361:
                case 634038513:
                    C1420.m4913();
                    int iM2567 = C0630.m2566("᩻᩷") ^ i3;
                    i6 = iM2567 ^ 1455680470;
                    i5 = ((iM2567 ^ i4) * (-25727)) ^ 2092003098;
                    break;
                case -1982056881:
                case 763492071:
                    c16484 = new C16484();
                    sArr2 = f19799;
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                        i = ((iM6981 ^ i4) * (-7411)) ^ 1811616337;
                        i2 = -556092610;
                    } else {
                        iM6981 = C2105.m6981("ᩴ֡") ^ i3;
                        i = ((iM6981 ^ i4) * 599) ^ (-358577009);
                        i2 = -976987529;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1717000612:
                case -279760588:
                    i10 = 17413;
                    iM6981 = C0630.m2566("᩷᩶") ^ i4;
                    i = ((iM6981 ^ i3) * 26079) ^ 125271663;
                    i2 = -1267120233;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1494891240:
                case 1326431016:
                    sArr = f19799;
                    if (C3663.f11553) {
                        iM6981 = C2105.m6981("᩺֡") ^ i3;
                        i = ((iM6981 ^ i4) * 23105) ^ 1410330028;
                        i2 = 1276481475;
                    } else {
                        iM6981 = C2105.m6981("ۘܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-20959)) ^ (-942737769);
                        i2 = -1838880496;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1404560469:
                case -1027288568:
                    if (C2167.f7158 < 0) {
                        iM6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                        i = ((iM6981 ^ i3) * 24569) ^ (-763279449);
                        i2 = 1986101617;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2568 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = iM2568 ^ 1455680470;
                        i5 = ((iM2568 ^ i4) * (-25727)) ^ 2092003098;
                    }
                    break;
                case -1261933407:
                case -233358990:
                    i10 = 57390;
                    iM6981 = C0630.m2566("᩷᩶") ^ i4;
                    i = ((iM6981 ^ i3) * 26079) ^ 125271663;
                    i2 = -1267120233;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1049710387:
                case -318185600:
                    C2126.m7040();
                    if (C4075.m12263() <= 0) {
                        iM6981 = (i4 - C0630.m2566("ۜ֫")) * (-23);
                        i = ((iM6981 ^ i3) * (-16829)) ^ 109236205;
                        i2 = 262474897;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2569 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = iM2569 ^ 1455680470;
                        i5 = ((iM2569 ^ i4) * (-25727)) ^ 2092003098;
                    }
                    break;
                case -975902761:
                case 1660387418:
                    strM1483 = C0237.m1483(sArr3, 65, 3, i10);
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                        i = ((iM6981 ^ i3) * 24569) ^ (-763279449);
                        i2 = 1986101617;
                    } else {
                        iM6981 = C0630.m2566("ܺۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-19115)) ^ (-1198403098);
                        i2 = 34735488;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -962432586:
                case 1474331296:
                    if (C4159.m12565() >= 0) {
                        iM6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                        i = ((iM6981 ^ i4) * (-7411)) ^ 1811616337;
                        i2 = -556092610;
                    } else {
                        iM6981 = C2105.m6981("ۛܳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-24923)) ^ (-329767930);
                        i2 = 1058988303;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -923944816:
                case -55726263:
                    i9 = 760384;
                    if (C3432.m10477() <= 0) {
                        iM6981 = (i4 - C0630.m2566("ۜ֫")) * (-23);
                        i = ((iM6981 ^ i3) * (-16829)) ^ 109236205;
                        i2 = 262474897;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܽۨ")) * 83;
                        i = ((iM6981 ^ i4) * 26683) ^ 541275629;
                        i2 = 835263627;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -743946306:
                case 2110498396:
                    int i14 = s + s2;
                    i7 = i14 * i14;
                    i8 = s * s;
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                        i = ((iM6981 ^ i3) * 24569) ^ (-763279449);
                        i2 = 1986101617;
                    } else {
                        iM6981 = C0630.m2566("᩺۫") ^ i3;
                        i = ((iM6981 ^ i4) * 3903) ^ (-1555725680);
                        i2 = 1909887377;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -608656925:
                case 708578915:
                    C4616.m13552();
                    C21923.m49329();
                    return null;
                case -552026561:
                case 1952444791:
                    C2105.m6982();
                    if (C2958.m9034() > 0) {
                        iM6981 = C2105.m6981("᩺֡") ^ i3;
                        i = ((iM6981 ^ i4) * 23105) ^ 1410330028;
                        i2 = 1276481475;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM25610 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = iM25610 ^ 1455680470;
                        i5 = ((iM25610 ^ i4) * (-25727)) ^ 2092003098;
                    }
                    break;
                case -329785551:
                case 799640075:
                    int i15 = i8 + i9;
                    if (i7 - (i15 + i15) > 0) {
                        iM6981 = (C0630.m2566("ܶܽ") + i3) * (-15);
                        i = ((iM6981 ^ i4) * 8861) ^ 327822059;
                        i2 = 742559596;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۨܺ")) * (-119);
                        i = ((iM6981 ^ i3) * (-16747)) ^ (-1497784625);
                        i2 = -661951900;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 113859612:
                case 1988693582:
                    c16484.f24118 = charSequence;
                    c16484.f24119 = str;
                    C1916.m6307(this.f19801, c16484);
                    return c16484;
                case 521942811:
                case 2096238504:
                    s = sArr[59];
                    s2 = 872;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("᩺֡") ^ i3;
                        i = ((iM6981 ^ i4) * 23105) ^ 1410330028;
                        i2 = 1276481475;
                    } else {
                        iM6981 = C2105.m6981("۠᩻") ^ i4;
                        i = ((iM6981 ^ i3) * (-6443)) ^ 1854322051;
                        i2 = 1246975882;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 581994936:
                case 1595935987:
                    m17725(charSequence, C4263.m12817(sArr2, i11, i12, i10));
                    sArr3 = f19799;
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                        i = ((iM6981 ^ i4) * (-7411)) ^ 1811616337;
                        i2 = -556092610;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܺ۠")) * 67;
                        i = ((iM6981 ^ i3) * 21769) ^ 350995471;
                        i2 = 776010945;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1220503219:
                case 1532417377:
                    i11 = 60;
                    i12 = 5;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = C2105.m6981("᩺֡") ^ i3;
                        i = ((iM6981 ^ i4) * 23105) ^ 1410330028;
                        i2 = 1276481475;
                    } else {
                        iM6981 = (i4 - C0630.m2566("᩺ۚ")) * (-3);
                        i = ((iM6981 ^ i3) * (-25043)) ^ (-607817735);
                        i2 = 1832238880;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    m17725(str, strM1483);
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = (C0630.m2566("ۡᩳ") ^ i4) * 69;
                        i = ((iM6981 ^ i3) * (-12801)) ^ (-599462118);
                        i2 = -165520993;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM25611 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = iM25611 ^ 1455680470;
                        i5 = ((iM25611 ^ i4) * (-25727)) ^ 2092003098;
                    }
                    break;
            }
        }
    }

    public C6398(PluginContext pluginContext) {
        ArrayList arrayList = null;
        int i = -1721892258;
        int i2 = C22628.f73083;
        int i3 = C1294.f4556;
        int iM6981 = (C2105.m6981("ܽۢ") + i2) * (-103);
        int i4 = ((iM6981 ^ i3) * (-11917)) ^ 2037657984;
        int i5 = 18398808;
        while (true) {
            i = ((((i ^ i3) * 527) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2093430323:
                case -447531497:
                    if (C5695.f17556 < 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        iM6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    }
                    break;
                case -2026669003:
                case -973302111:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ۗ᩻") + i3) * (-113);
                        i4 = ((iM6981 ^ i2) * (-21599)) ^ 215805112;
                        i5 = 1508735190;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ܰ᩺")) * (-117);
                        i4 = ((iM6981 ^ i3) * (-31413)) ^ (-2120991065);
                        i5 = -855154868;
                    }
                    break;
                case -1834445217:
                case 365884816:
                    this.f19801 = arrayList;
                    this.f19800 = pluginContext;
                    return;
                case -1349616925:
                case -1335583698:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        iM6981 = C2105.m6981("֫ۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19903) ^ (-908057578);
                        i5 = -952073059;
                    }
                    break;
                case -1304560487:
                case -434751628:
                    C1420.m4913();
                    iM6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                    i4 = ((iM6981 ^ i2) * (-30461)) ^ (-133314563);
                    i5 = 1432499859;
                    break;
                case -1193467152:
                case 1703336618:
                    if (!C3663.f11553) {
                        iM6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                        i4 = ((iM6981 ^ i2) * (-30461)) ^ (-133314563);
                        i5 = 1432499859;
                    } else {
                        iM6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    }
                    break;
                case -908747149:
                case 1187668355:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("۟ܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26641) ^ 2040745881;
                        i5 = 2057238231;
                    } else {
                        iM6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    }
                    break;
                case -811368868:
                case 1745005616:
                    if (C3663.m11168() >= 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        iM6981 = C2105.m6981("ۚۛ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 25151) ^ 2111177251;
                        i5 = 1794440139;
                    }
                    break;
                case -711549753:
                case 1104226173:
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܶۖ")) * (-5);
                        i4 = ((iM6981 ^ i2) * 11557) ^ (-581356672);
                        i5 = 2146209722;
                    }
                    break;
                case -404649559:
                case 1347654576:
                    arrayList = new ArrayList();
                    if (C1916.m6308() >= 0) {
                        iM6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        iM6981 = C2105.m6981("֨ܺ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 26763) ^ (-2015632365);
                        i5 = 527211671;
                    }
                    break;
                case -348881229:
                case -296502303:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۚ") + i2) * 73;
                        i4 = ((iM6981 ^ i3) * 3111) ^ (-185150714);
                        i5 = 917129629;
                    }
                    break;
                case -224185102:
                case 2105487448:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    } else {
                        iM6981 = (C0630.m2566("֫ܰ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM6981 ^ i3) * 30833) ^ 1163888645;
                        i5 = 21332342;
                    }
                    break;
                case -6235071:
                case 523757103:
                    C4117.m12364();
                    C3019.m9255();
                    throw new RuntimeException();
                case 175028333:
                case 737429952:
                    C7106.m19120();
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    } else {
                        iM6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                        i4 = ((iM6981 ^ i2) * (-30461)) ^ (-133314563);
                        i5 = 1432499859;
                    }
                    break;
                case 455521024:
                case 620248584:
                    if (RunnableC1937.f6483 >= 0) {
                        iM6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ᩴܰ")) * (-65);
                        i4 = ((iM6981 ^ i2) * (-22159)) ^ 246657618;
                        i5 = 1865019908;
                    }
                    break;
                default:
                    if (C11340.m28031()) {
                        iM6981 = (C0630.m2566("ܿۤ") ^ i2) * (-15);
                        i4 = ((iM6981 ^ i3) * 28529) ^ (-221955027);
                        i5 = -1854952827;
                    } else {
                        iM6981 = (C2105.m6981("ۗ᩻") + i3) * (-113);
                        i4 = ((iM6981 ^ i2) * (-21599)) ^ 215805112;
                        i5 = 1508735190;
                    }
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final void setLocalString(LocalString localString) {
        this.f19803 = localString;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder title(CharSequence charSequence) {
        this.f19806 = charSequence;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01e8 A[PHI: r6 r7 r8 r13
      0x01e8: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:55:0x01e6, B:51:0x01c2, B:32:0x00eb, B:88:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:55:0x01e6, B:51:0x01c2, B:32:0x00eb, B:88:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:55:0x01e6, B:51:0x01c2, B:32:0x00eb, B:88:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:55:0x01e6, B:51:0x01c2, B:32:0x00eb, B:88:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x024a A[PHI: r4 r11 r12
      0x024a: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:36:0x010d, B:28:0x00c3, B:17:0x0076, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:36:0x010d, B:28:0x00c3, B:17:0x0076, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:36:0x010d, B:28:0x00c3, B:17:0x0076, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (l.C1504.f5354 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (l.C0714.m2805() != false) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PluginPreference.Header addHeader(CharSequence charSequence, String str) {
        int iM2566;
        int i;
        int i2;
        str = str;
        int i3 = C3683.f11629;
        int i4 = C3245.f10203;
        int iM6981 = (i3 - C2105.m6981("ܽۧ")) * (-103);
        int i5 = ((iM6981 ^ i4) * (-23313)) ^ (-1636752019);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM6981 ^ 1707289614;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2044287985;
        String strM49334 = null;
        C12043 c12043 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-26521)) >> 31));
            switch (i12) {
                case -2115487500:
                case -432916179:
                    C1294.m4372();
                    C2272.m7503();
                    return null;
                case -2086061604:
                case 1471293212:
                    s = sArr[32];
                    if (C5695.m16023() >= 0) {
                        iM2566 = (C2105.m6981("᩶ۗ") + i4) * (-123);
                        i = ((iM2566 ^ i3) * 31821) ^ (-944665044);
                        i2 = -381087991;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܺۗ")) * 57;
                        i = ((iM2566 ^ i4) * (-6669)) ^ 1970534313;
                        i2 = -1335811086;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2022960604:
                case 624228808:
                    if (C1047.m3599() < 0) {
                        iM2566 = (i3 - C0630.m2566("ۗۚ")) * (-115);
                        i = ((iM2566 ^ i4) * 10223) ^ (-1613330874);
                        i2 = -50151073;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    }
                    iM2566 = (C0630.m2566("ܺ۟") + i4) * 73;
                    i = ((iM2566 ^ i3) * 27229) ^ 426487724;
                    i2 = -1278665820;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1700344028:
                case -1153679951:
                    c12043 = new C12043();
                    sArr2 = f19799;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("֨֨") ^ i3;
                        i = ((iM2566 ^ i4) * (-31539)) ^ (-1143041040);
                        i2 = 1510933421;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩸۟")) * 35;
                        i = ((iM2566 ^ i4) * (-7871)) ^ (-829494295);
                        i2 = 179962914;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1537722991:
                case -817508440:
                    i9 = 48276;
                    iM2566 = C0630.m2566("ܳ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * (-22491)) ^ (-2144563402);
                    i2 = 1337656830;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1366788288:
                case 514842161:
                    C1047.m3599();
                    iM2566 = C2105.m6981("᩷ᩴ") ^ i4;
                    i = ((iM2566 ^ i3) * 18533) ^ 1366078561;
                    i2 = -1550700991;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1170486971:
                case 1729435473:
                    C7811.m20844();
                    break;
                case -1161628168:
                case 376963043:
                    i9 = 18819;
                    iM2566 = C0630.m2566("ܳ᩵") ^ i3;
                    i = ((iM2566 ^ i4) * (-22491)) ^ (-2144563402);
                    i2 = 1337656830;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1033378462:
                case 1145810851:
                    i7 = s * 29498;
                    i8 = s * s;
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("᩶ۗ") + i4) * (-123);
                        i = ((iM2566 ^ i3) * 31821) ^ (-944665044);
                        i2 = -381087991;
                    } else {
                        iM2566 = (C2105.m6981("۬֫") ^ i4) * (-55);
                        i = ((iM2566 ^ i3) * 10887) ^ 695665876;
                        i2 = 1667859692;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1028291801:
                case -557691806:
                    m17725(charSequence, C1420.m4902(sArr2, i10, i11, i9));
                    sArr3 = f19799;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("᩶ۗ") + i4) * (-123);
                        i = ((iM2566 ^ i3) * 31821) ^ (-944665044);
                        i2 = -381087991;
                    } else {
                        iM2566 = (C2105.m6981("᩺᩶") + i4) * 71;
                        i = ((iM2566 ^ i3) * 2877) ^ (-650463070);
                        i2 = 1649664164;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -756657104:
                case -342195047:
                    m17725(str, strM49334);
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("᩶ۗ") + i4) * (-123);
                        i = ((iM2566 ^ i3) * 31821) ^ (-944665044);
                        i2 = -381087991;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = C2105.m6981("᩶᩵") ^ i3;
                        i6 = iM6982 ^ (-1001575661);
                        i5 = ((iM6982 ^ i4) * (-9419)) ^ (-1455312547);
                    }
                    break;
                case -678673427:
                case -630917155:
                    C2126.m7040();
                    break;
                case -476920073:
                case -222191912:
                    strM49334 = C21923.m49334(sArr3, 38, 3, i9);
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 18533) ^ 1366078561;
                        i2 = -1550700991;
                    } else {
                        iM2566 = (C0630.m2566("ܺۙ") ^ i3) * 85;
                        i = ((iM2566 ^ i4) * (-9165)) ^ 451123615;
                        i2 = -612727037;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -192080477:
                case 1767901209:
                    if ((217533001 + i8) - i7 >= 0) {
                        iM2566 = C2105.m6981("ۜ۟") ^ i3;
                        i = ((iM2566 ^ i4) * 28849) ^ (-1984709601);
                        i2 = 1002624454;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩹ᩳ")) * (-103);
                        i = ((iM2566 ^ i3) * (-3549)) ^ 1494175650;
                        i2 = 888520317;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -126016411:
                case 207527877:
                    if (C2520.m8026()) {
                        iM2566 = (C0630.m2566("ܺ۟") + i4) * 73;
                        i = ((iM2566 ^ i3) * 27229) ^ 426487724;
                        i2 = -1278665820;
                    } else {
                        iM2566 = C0630.m2566("ۙۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 20217) ^ 60030810;
                        i2 = -361069059;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 497287778:
                case 1416964648:
                    sArr = f19799;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۗۚ")) * (-115);
                        i = ((iM2566 ^ i4) * 10223) ^ (-1613330874);
                        i2 = -50151073;
                    } else {
                        iM2566 = C2105.m6981("ۢۧ") ^ i4;
                        i = ((iM2566 ^ i3) * (-14931)) ^ 2077948928;
                        i2 = 1976279857;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 818521153:
                case 1274689566:
                    c12043.f24118 = charSequence;
                    c12043.f24119 = str;
                    C1916.m6307(this.f19801, c12043);
                    return c12043;
                case 1338101539:
                case 1688494192:
                    i10 = 33;
                    i11 = 5;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 18533) ^ 1366078561;
                        i2 = -1550700991;
                    } else {
                        iM2566 = C0630.m2566("᩷᩷") ^ i4;
                        i = ((iM2566 ^ i3) * (-7287)) ^ 1342577480;
                        i2 = -55026966;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C4159.m12565() >= 0) {
                        iM2566 = C2105.m6981("᩷ᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 18533) ^ 1366078561;
                        i2 = -1550700991;
                    } else {
                        iM2566 = C2105.m6981("ܽᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 32075) ^ 2060913484;
                        i2 = -383567528;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e8 A[PHI: r2 r5 r6 r12
      0x01e8: PHI (r2v6 l.ᩳۜ᩷) = (r2v2 l.ᩳۜ᩷), (r2v3 l.ᩳۜ᩷), (r2v2 l.ᩳۜ᩷), (r2v2 l.ᩳۜ᩷) binds: [B:54:0x01e6, B:34:0x0124, B:11:0x0074, B:90:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r5v6 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:54:0x01e6, B:34:0x0124, B:11:0x0074, B:90:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v6 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:54:0x01e6, B:34:0x0124, B:11:0x0074, B:90:0x01e8] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r12v6 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:54:0x01e6, B:34:0x0124, B:11:0x0074, B:90:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x023c A[PHI: r8 r9 r19
      0x023c: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:62:0x023a, B:46:0x01a1, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:62:0x023a, B:46:0x01a1, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:62:0x023a, B:46:0x01a1, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026a A[PHI: r4 r7 r10
      0x026a: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:66:0x0268, B:58:0x021a, B:50:0x01c1, B:42:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:66:0x0268, B:58:0x021a, B:50:0x01c1, B:42:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:66:0x0268, B:58:0x021a, B:50:0x01c1, B:42:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Text addText(CharSequence charSequence) {
        int iM6981;
        int i;
        int i2;
        CharSequence charSequence2 = charSequence;
        int i3 = C5695.f17556;
        int i4 = C3537.f11231;
        int iM2566 = C0630.m2566("᩺ۗ") ^ i4;
        int i5 = ((iM2566 ^ i3) * (-10043)) ^ 682981395;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 1383370982;
        C17896 c17896 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 822159978;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 12533) >> 31));
            switch (i14) {
                case -2090772390:
                case 1460164808:
                    if (C0964.f3626 == 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i = ((iM6981 ^ i4) * 3887) ^ 914711563;
                        i2 = -744583829;
                        i6 = iM6981 ^ i2;
                        charSequence2 = charSequence;
                    } else {
                        int iM2567 = C0630.m2566("֡᩺") ^ i4;
                        i = ((iM2567 ^ i3) * 29455) ^ 2087721219;
                        i6 = iM2567 ^ 1378046160;
                    }
                    i5 = i;
                    break;
                case -2087021469:
                case 1121671228:
                    C4616.m13552();
                    C3746.m11369();
                    iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                    i = ((iM6981 ^ i4) * 3887) ^ 914711563;
                    i2 = -744583829;
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -2083608783:
                case 664586914:
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ܶ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 27043) ^ (-1114218017);
                        i2 = -1084904784;
                    } else {
                        iM6981 = C2105.m6981("᩺ۙ") ^ i4;
                        i = ((iM6981 ^ i3) * (-20217)) ^ (-601810777);
                        i2 = 860649278;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -1965936292:
                case -548787637:
                    m17725(charSequence2, C3432.m10488(sArr2, i12, i13, i11));
                    c17896.f24118 = charSequence2;
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ۖۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-6087)) ^ 1930160227;
                        i2 = 1019205717;
                        i6 = iM6981 ^ i2;
                        charSequence2 = charSequence;
                        i5 = i;
                    } else {
                        int iM2568 = (C0630.m2566("ܽ᩶") + i4) * 119;
                        i6 = iM2568 ^ 1414311819;
                        i5 = ((iM2568 ^ i3) * 22293) ^ (-939704058);
                        charSequence2 = charSequence;
                    }
                    break;
                case -1877681230:
                case 691404494:
                    C7106.m19117(this.f19801, c17896);
                    return c17896;
                case -1397180610:
                case -428889075:
                    i10 = 157201444;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("ܶ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 27043) ^ (-1114218017);
                        i2 = -1084904784;
                    } else {
                        iM6981 = C2105.m6981("ܽ᩺") ^ i3;
                        i = ((iM6981 ^ i4) * (-8011)) ^ (-1035702030);
                        i2 = -821183628;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -1355304997:
                case 1602061754:
                    i7 = s + s2;
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("ܶ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 27043) ^ (-1114218017);
                        i2 = -1084904784;
                    } else {
                        iM6981 = (C2105.m6981("ܶ᩸") + i3) * (-119);
                        i = ((iM6981 ^ i4) * 3481) ^ (-443305613);
                        i2 = -1192876205;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -1273936759:
                case -1107385055:
                    i11 = 15473;
                    iM6981 = C0630.m2566("ᩴ᩹") ^ i4;
                    i = ((iM6981 ^ i3) * (-8889)) ^ (-230325463);
                    i2 = -1489132642;
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -1262312986:
                case -1240475297:
                    i11 = 3792;
                    iM6981 = C0630.m2566("ᩴ᩹") ^ i4;
                    i = ((iM6981 ^ i3) * (-8889)) ^ (-230325463);
                    i2 = -1489132642;
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -1238121212:
                case -779607360:
                    if (C22628.f73083 > 0) {
                        int iM2569 = C0630.m2566("֡᩺") ^ i4;
                        i = ((iM2569 ^ i3) * 29455) ^ 2087721219;
                        i6 = iM2569 ^ 1378046160;
                    } else {
                        iM6981 = (C2105.m6981("ܰۛ") ^ i3) * 27;
                        i = ((iM6981 ^ i4) * 18191) ^ (-28867952);
                        i2 = 1407826268;
                        i6 = iM6981 ^ i2;
                        charSequence2 = charSequence;
                    }
                    i5 = i;
                    break;
                case -1082510862:
                case 34465778:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i = ((iM6981 ^ i4) * 3887) ^ 914711563;
                        i2 = -744583829;
                    } else {
                        iM6981 = C2105.m6981("ۘ᩶") ^ i4;
                        i = ((iM6981 ^ i3) * (-14079)) ^ (-636254544);
                        i2 = 2097239530;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -863312782:
                case 1860976780:
                    C0798.m2998();
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("ۖۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-6087)) ^ 1930160227;
                        i2 = 1019205717;
                        i6 = iM6981 ^ i2;
                        charSequence2 = charSequence;
                        i5 = i;
                    }
                    iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                    i = ((iM6981 ^ i4) * 3887) ^ 914711563;
                    i2 = -744583829;
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -800102159:
                case 883926694:
                    i12 = 69;
                    i13 = 5;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ܰۛ") ^ i3) * 27;
                        i = ((iM6981 ^ i4) * 18191) ^ (-28867952);
                        i2 = 1407826268;
                    } else {
                        iM6981 = C0630.m2566("᩵ܿ") ^ i3;
                        i = ((iM6981 ^ i4) * (-21469)) ^ (-1374735790);
                        i2 = 847130998;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -487178005:
                case 592305858:
                    sArr = f19799;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i = ((iM6981 ^ i4) * 3887) ^ 914711563;
                        i2 = -744583829;
                    } else {
                        iM6981 = C2105.m6981("ۢ۬") ^ i3;
                        i = ((iM6981 ^ i4) * 931) ^ 1450995312;
                        i2 = -2022964091;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case -226889136:
                case 1988616529:
                    c17896 = new C17896();
                    sArr2 = f19799;
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("ۖۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-6087)) ^ 1930160227;
                        i2 = 1019205717;
                    } else {
                        iM6981 = C0630.m2566("֨ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-17405)) ^ 612308949;
                        i2 = -451517657;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case 133405325:
                case 1784412312:
                    c = 'D';
                    if (C1294.m4372() <= 0) {
                        iM6981 = C0630.m2566("ܶ۬") ^ i4;
                        i = ((iM6981 ^ i3) * 27043) ^ (-1114218017);
                        i2 = -1084904784;
                    } else {
                        iM6981 = (C0630.m2566("᩵ܽ") ^ i4) * (-121);
                        i = ((iM6981 ^ i3) * 4885) ^ 515288858;
                        i2 = -2040211734;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case 895701811:
                case 1486824964:
                    s = sArr[c];
                    s2 = 12538;
                    if (C22628.m50615() != 0) {
                        iM6981 = C2105.m6981("ۖۘ") ^ i3;
                        i = ((iM6981 ^ i4) * (-6087)) ^ 1930160227;
                        i2 = 1019205717;
                    } else {
                        iM6981 = C2105.m6981("ۘܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 4689) ^ (-957802674);
                        i2 = -1303740785;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
                case 1051386814:
                case 1855187844:
                    C0798.m2998();
                    C0964.m3413();
                    return null;
                default:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 < 0) {
                        iM6981 = (C2105.m6981("᩹۠") ^ i3) * (-61);
                        i = ((iM6981 ^ i4) * (-23731)) ^ 1624608459;
                        i2 = -862288337;
                    } else {
                        iM6981 = (C0630.m2566("ۛܽ") ^ i4) * (-79);
                        i = ((iM6981 ^ i3) * 28991) ^ 705890505;
                        i2 = -94840791;
                    }
                    i6 = iM6981 ^ i2;
                    charSequence2 = charSequence;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder subtitle(CharSequence charSequence) {
        this.f19802 = charSequence;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x037e A[PHI: r6 r18
      0x037e: PHI (r6v35 bin.mt.plugin.api.LocalString) = (r6v34 bin.mt.plugin.api.LocalString), (r6v36 bin.mt.plugin.api.LocalString) binds: [B:99:0x0366, B:96:0x0344] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r18v14 java.lang.String) = (r18v13 java.lang.String), (r18v15 java.lang.String) binds: [B:99:0x0366, B:96:0x0344] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0430 A[PHI: r6 r10 r18
      0x0430: PHI (r6v55 bin.mt.plugin.api.LocalString) = (r6v39 bin.mt.plugin.api.LocalString), (r6v58 bin.mt.plugin.api.LocalString) binds: [B:84:0x02bc, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0430: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:84:0x02bc, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0430: PHI (r18v31 java.lang.String) = (r18v18 java.lang.String), (r18v35 java.lang.String) binds: [B:84:0x02bc, B:6:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x04a7 A[PHI: r6 r18
      0x04a7: PHI (r6v49 bin.mt.plugin.api.LocalString) = 
      (r6v27 bin.mt.plugin.api.LocalString)
      (r6v28 bin.mt.plugin.api.LocalString)
      (r6v29 bin.mt.plugin.api.LocalString)
      (r6v30 bin.mt.plugin.api.LocalString)
      (r6v50 bin.mt.plugin.api.LocalString)
     binds: [B:125:0x04a5, B:121:0x0483, B:117:0x0464, B:111:0x0414, B:22:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x04a7: PHI (r18v25 java.lang.String) = 
      (r18v6 java.lang.String)
      (r18v7 java.lang.String)
      (r18v8 java.lang.String)
      (r18v9 java.lang.String)
      (r18v26 java.lang.String)
     binds: [B:125:0x04a5, B:121:0x0483, B:117:0x0464, B:111:0x0414, B:22:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x023a A[PHI: r2 r15
      0x023a: PHI (r2v77 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v76 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:70:0x0221, B:61:0x01dd, B:55:0x01a2, B:49:0x016a, B:43:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r15v4 java.lang.CharSequence) = 
      (r15v3 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
      (r15v2 java.lang.CharSequence)
     binds: [B:70:0x0221, B:61:0x01dd, B:55:0x01a2, B:49:0x016a, B:43:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
    
        if (l.C4159.f13567 == false) goto L22;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m17726() {
        int i;
        int iM2566;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int i5 = C3019.f9544;
        int i6 = C2520.f8000;
        int iM6981 = (C2105.m6981("᩺ܺ") + i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i7 = ((iM6981 ^ i5) * (-8243)) ^ 2061370805;
        Iterator itM12354 = null;
        CharSequence charSequence = null;
        String str = null;
        CharSequence charSequence2 = null;
        int i8 = iM6981 ^ (-433627557);
        char c = 0;
        int i9 = 0;
        char c2 = 0;
        int i10 = 0;
        boolean z = false;
        LocalString localString = null;
        int i11 = 855587902;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i12 = 0;
        PluginContext pluginContext = null;
        String str2 = null;
        Iterator itM9029 = null;
        ArrayList arrayList = null;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i5) * 30275) >> 31));
            switch (i11) {
                case -1946556138:
                case -232305168:
                    C1420.m4913();
                    if (!C1005.f3721) {
                        iM2566 = (C0630.m2566("֡ۙ") ^ i5) * 25;
                        i = ((iM2566 ^ i6) * (-31055)) ^ (-213666077);
                        i2 = 1820521958;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        localString = localString;
                        str2 = str2;
                        iM2567 = C2105.m6981("ۚܿ") ^ i6;
                        i3 = ((iM2567 ^ i5) * 3545) ^ (-1987032464);
                        i4 = -505578367;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    break;
                case -1834910308:
                case -1105404192:
                    if (C11340.m28021(i9, str2) == c) {
                        iM2566 = C0630.m2566("֫᩷") ^ i5;
                        i = ((iM2566 ^ i6) * 23937) ^ 450703736;
                        i2 = 663466337;
                    } else {
                        charSequence2 = charSequence3;
                        iM2566 = (C2105.m6981("ۨ֨") ^ i6) * (-13);
                        i = ((iM2566 ^ i5) * (-25157)) ^ (-1609645308);
                        i2 = -854446808;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1769890374:
                case 243570917:
                    localString = localString;
                    ((AbstractC7809) RunnableC1108.m3791(itM12354)).mo5658(localString);
                    iM2567 = C2105.m6981("ܶۘ") ^ i6;
                    i3 = ((iM2567 ^ i5) * (-24395)) ^ 1213259267;
                    i4 = 1868263552;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1755783381:
                case -932518098:
                    localString = localString;
                    str2 = str2;
                    c = '}';
                    if (C21923.f70183 != 0) {
                        iM2567 = C2105.m6981("ۚܿ") ^ i6;
                        i3 = ((iM2567 ^ i5) * 3545) ^ (-1987032464);
                        i4 = -505578367;
                    } else {
                        iM2567 = (C2105.m6981("ۘᩴ") ^ i5) * 41;
                        i3 = ((iM2567 ^ i6) * 13967) ^ 399238346;
                        i4 = -203523273;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1735119880:
                case -1056780550:
                    this.f19806 = charSequence4;
                    charSequence3 = this.f19802;
                    if (charSequence3 instanceof String) {
                        iM2566 = (C2105.m6981("ܳܿ") + i6) * 33;
                        i = ((iM2566 ^ i5) * 10073) ^ 1689300520;
                        i2 = -630475754;
                    } else {
                        charSequence2 = charSequence3;
                        iM2566 = (C2105.m6981("ۨ֨") ^ i6) * (-13);
                        i = ((iM2566 ^ i5) * (-25157)) ^ (-1609645308);
                        i2 = -854446808;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1718287991:
                case 2059380555:
                    localString = localString;
                    itM12354 = C4117.m12354(arrayList);
                    iM2567 = C2105.m6981("ܶۘ") ^ i6;
                    i3 = ((iM2567 ^ i5) * (-24395)) ^ 1213259267;
                    i4 = 1868263552;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1650874518:
                case -545985356:
                    localString = localString;
                    i10 = 0;
                    i12 = 3;
                    if (z) {
                        int iM6982 = C2105.m6981("᩵۫") ^ i5;
                        i8 = iM6982 ^ (-749834367);
                        localString = localString;
                        i7 = ((iM6982 ^ i6) * 30463) ^ (-2735552);
                        c2 = '{';
                    } else {
                        c2 = '{';
                        charSequence4 = charSequence;
                        iM2567 = (C2105.m6981("ۜۢ") + i6) * (-31);
                        str2 = str2;
                        i3 = ((iM2567 ^ i5) * 8395) ^ 76274188;
                        i4 = -1905982622;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    break;
                case -1592997362:
                case -1189179065:
                    str2 = str2;
                    LocalString localString2 = this.f19803;
                    if (!C1916.f6442) {
                        localString = localString2;
                        iM2567 = C0630.m2566("ۜ᩹") ^ i5;
                        i3 = ((iM2567 ^ i6) * 17979) ^ (-1768595299);
                        i4 = -1653400267;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    } else {
                        int iM6983 = C2105.m6981("۫ۧ") ^ i6;
                        i = ((iM6983 ^ i5) * 19827) ^ 1190153166;
                        i8 = iM6983 ^ (-427651318);
                        str2 = str2;
                        localString = localString2;
                        i7 = i;
                    }
                    break;
                case -1571618137:
                case 328507768:
                    C2167.m7155();
                    break;
                case -1478094622:
                case 809070652:
                    ((AbstractC7809) C2272.m7513(itM9029)).mo5659(pluginContext);
                    iM2567 = C0630.m2566("ۙ֫") ^ i5;
                    i3 = ((iM2567 ^ i6) * (-14247)) ^ (-1912217091);
                    i4 = 639961811;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1351955804:
                case 1831246338:
                    localString = localString;
                    str2 = str2;
                    if (C3019.f9544 >= 0) {
                        iM2567 = C0630.m2566("ۜ᩹") ^ i5;
                        i3 = ((iM2567 ^ i6) * 17979) ^ (-1768595299);
                        i4 = -1653400267;
                    } else {
                        iM2567 = (C0630.m2566("ۛܺ") ^ i5) * 87;
                        i3 = ((iM2567 ^ i6) * (-13791)) ^ 1096788298;
                        i4 = -1839269884;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1346707893:
                case -453026122:
                    localString = localString;
                    str2 = str2;
                    if (C0483.m2123(itM12354)) {
                        iM2567 = (i5 - C2105.m6981("ۖ᩸")) * (-25);
                        i3 = ((iM2567 ^ i6) * 11233) ^ (-1950456343);
                        i4 = -975939641;
                    } else {
                        iM2567 = (C0630.m2566("ۢܺ") + i5) * (-87);
                        i3 = ((iM2567 ^ i6) * 11051) ^ 468953709;
                        i4 = -1052352801;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1274334136:
                case -618486836:
                    if (C1005.m3500(i9, str) != c) {
                        localString = localString;
                        charSequence4 = charSequence;
                        iM2567 = (C2105.m6981("ۜۢ") + i6) * (-31);
                        str2 = str2;
                        i3 = ((iM2567 ^ i5) * 8395) ^ 76274188;
                        i4 = -1905982622;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    } else {
                        iM2566 = C0630.m2566("ܳۜ") ^ i5;
                        i = ((iM2566 ^ i6) * (-29129)) ^ 2090311176;
                        i2 = -452189574;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1204998726:
                case 1401684189:
                    localString = localString;
                    str2 = str2;
                    if (AbstractC2021.m6574()) {
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                    } else {
                        iM2567 = (i6 - C0630.m2566("ܺ᩵")) * (-87);
                        i3 = ((iM2567 ^ i5) * 10533) ^ (-1765764172);
                        i4 = -1052721598;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -1131645875:
                case -903155011:
                    String strM5739 = C1711.m5739(pluginContext, str2);
                    if (strM5739 != null) {
                        charSequence2 = strM5739;
                    } else {
                        charSequence2 = charSequence3;
                    }
                    iM2566 = (C2105.m6981("ۨ֨") ^ i6) * (-13);
                    i = ((iM2566 ^ i5) * (-25157)) ^ (-1609645308);
                    i2 = -854446808;
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -1124483942:
                case 1063443914:
                    localString = localString;
                    str2 = str2;
                    if (C1420.m4913()) {
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                    } else {
                        iM2567 = (C2105.m6981("ۨۙ") ^ i5) * (-31);
                        i3 = ((iM2567 ^ i6) * (-28553)) ^ (-122722964);
                        i4 = 400191634;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -928431772:
                case 979806889:
                    C3432.m10477();
                    if (!C1005.f3721) {
                        iM2566 = (i5 - C2105.m6981("᩷֫")) * 13;
                        i = ((iM2566 ^ i6) * (-10749)) ^ (-1833238345);
                        i2 = 43954004;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        localString = localString;
                        str2 = str2;
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    break;
                case -884834431:
                case 1551558392:
                    if (C0798.m3000(str, i10) != c2) {
                        localString = localString;
                        charSequence4 = charSequence;
                        iM2567 = (C2105.m6981("ۜۢ") + i6) * (-31);
                        str2 = str2;
                        i3 = ((iM2567 ^ i5) * 8395) ^ 76274188;
                        i4 = -1905982622;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    } else {
                        iM2566 = C2105.m6981("ۛۤ") ^ i6;
                        i = ((iM2566 ^ i5) * 26755) ^ 350808419;
                        i2 = 1351004401;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case -880518447:
                case 2065604298:
                    localString = localString;
                    str2 = str2;
                    if (C1773.m5910(itM9029)) {
                        iM2567 = C0630.m2566("ۗ᩹") ^ i5;
                        i3 = ((iM2567 ^ i6) * 25643) ^ (-864017476);
                        i4 = 1246197648;
                    } else {
                        iM2567 = (C0630.m2566("ۢܺ") + i5) * (-87);
                        i3 = ((iM2567 ^ i6) * 11051) ^ 468953709;
                        i4 = -1052352801;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -878407266:
                case 830886808:
                    if (C0050.m940() <= 0) {
                        localString = localString;
                        str2 = str2;
                        iM2567 = C0630.m2566("ۜ᩹") ^ i5;
                        i3 = ((iM2567 ^ i6) * 17979) ^ (-1768595299);
                        i4 = -1653400267;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    localString = localString;
                    str2 = str2;
                    iM2567 = C2105.m6981("ۚܿ") ^ i6;
                    i3 = ((iM2567 ^ i5) * 3545) ^ (-1987032464);
                    i4 = -505578367;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -695199198:
                case 1242936579:
                    localString = localString;
                    str2 = str2;
                    if (C1420.f5096 <= 0) {
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                    } else {
                        iM2567 = (i5 - C2105.m6981("ۖۙ")) * (-11);
                        i3 = ((iM2567 ^ i6) * (-4787)) ^ 1340322205;
                        i4 = -1747575198;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -692788177:
                case 1573807987:
                    localString = localString;
                    str2 = str2;
                    if (C0050.f910 >= 0) {
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                    } else {
                        iM2567 = C2105.m6981("ܳᩴ") ^ i5;
                        i3 = ((iM2567 ^ i6) * 8033) ^ 1792687773;
                        i4 = -1204828233;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -634375466:
                case 1790905166:
                    str2 = (String) charSequence3;
                    if (C0798.m3007(str2) >= i12) {
                        iM2566 = (C0630.m2566("ܺܶ") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i6) * 31401) ^ 1956592594;
                        i2 = 15358680;
                    } else {
                        charSequence2 = charSequence3;
                        iM2566 = (C2105.m6981("ۨ֨") ^ i6) * (-13);
                        i = ((iM2566 ^ i5) * (-25157)) ^ (-1609645308);
                        i2 = -854446808;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case -571093455:
                case 1998937199:
                    C2958.m9034();
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("᩸ܽ") ^ i5;
                        i = ((iM2566 ^ i6) * 1077) ^ (-1016981485);
                        i2 = -601562707;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        localString = localString;
                        str2 = str2;
                        iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                        i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                        i4 = -2008184772;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    break;
                case -548705988:
                case 783074419:
                    localString = localString;
                    str2 = str2;
                    pluginContext = this.f19800;
                    arrayList = this.f19801;
                    if (localString != null) {
                        iM2567 = C0630.m2566("ۨ᩵") ^ i6;
                        i3 = ((iM2567 ^ i5) * (-27713)) ^ 1392123477;
                        i4 = -249847918;
                    } else {
                        iM2567 = C0630.m2566("ۘᩳ") ^ i6;
                        i3 = ((iM2567 ^ i5) * (-1615)) ^ 2068200660;
                        i4 = -218570509;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -346731815:
                case -49812613:
                    localString = localString;
                    str2 = str2;
                    i9 = 1;
                    if (C2105.m6982() != 0) {
                        iM2567 = C0630.m2566("֡ۢ") ^ i5;
                        i3 = ((iM2567 ^ i6) * (-16665)) ^ (-6572251);
                        i4 = 528904545;
                    } else {
                        iM2567 = (i6 - C0630.m2566("ᩳ᩹")) * (-111);
                        i3 = ((iM2567 ^ i5) * (-2799)) ^ 1779485120;
                        i4 = -379222364;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case -193124722:
                case 836827332:
                    C0964.m3413();
                    C3746.m11369();
                    return null;
                case -145571354:
                case 1892842456:
                    C21923.m49329();
                    if (C4117.f13076 <= 0) {
                        iM2566 = C0630.m2566("ᩴۙ") ^ i6;
                        i = ((iM2566 ^ i5) * (-26171)) ^ 363485640;
                        i2 = 1125037013;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    } else {
                        localString = localString;
                        str2 = str2;
                        iM2567 = C2105.m6981("ۚܿ") ^ i6;
                        i3 = ((iM2567 ^ i5) * 3545) ^ (-1987032464);
                        i4 = -505578367;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    }
                    break;
                case -58099433:
                case 572170318:
                    localString = localString;
                    str2 = str2;
                    charSequence = this.f19806;
                    boolean z2 = charSequence instanceof String;
                    if (C2167.f7158 >= 0) {
                        z = z2;
                        iM2567 = C0630.m2566("ۜ᩹") ^ i5;
                        i3 = ((iM2567 ^ i6) * 17979) ^ (-1768595299);
                        i4 = -1653400267;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                    } else {
                        int iM2568 = (C0630.m2566("ۙ᩸") + i6) * (-105);
                        z = z2;
                        i7 = ((iM2568 ^ i5) * 28311) ^ 881164854;
                        i8 = iM2568 ^ 1902972443;
                    }
                    str2 = str2;
                    localString = localString;
                    break;
                case 11655697:
                case 1480333710:
                    C3432.m10477();
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("۫֫") ^ i6;
                        i = ((iM2566 ^ i5) * (-23279)) ^ 1840323482;
                        i2 = 1448204869;
                    } else {
                        iM2566 = C2105.m6981("۟ܿ") ^ i6;
                        i = ((iM2566 ^ i5) * (-10203)) ^ (-361499982);
                        i2 = -1757756345;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 135614636:
                case 245107806:
                    if (C0798.m3000(str2, i10) == c2) {
                        iM2566 = C2105.m6981("ۢ᩺") ^ i6;
                        i = ((iM2566 ^ i5) * (-15841)) ^ (-690767240);
                        i2 = 419781136;
                    } else {
                        charSequence2 = charSequence3;
                        iM2566 = (C2105.m6981("ۨ֨") ^ i6) * (-13);
                        i = ((iM2566 ^ i5) * (-25157)) ^ (-1609645308);
                        i2 = -854446808;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 145575299:
                case 313601952:
                    String strM2999 = C0798.m2999(pluginContext, str);
                    if (strM2999 != null) {
                        charSequence4 = strM2999;
                        localString = localString;
                    } else {
                        localString = localString;
                        charSequence4 = charSequence;
                    }
                    iM2567 = (C2105.m6981("ۜۢ") + i6) * (-31);
                    str2 = str2;
                    i3 = ((iM2567 ^ i5) * 8395) ^ 76274188;
                    i4 = -1905982622;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case 480170067:
                case 684266261:
                    C3245.m9925();
                    if (C5695.m16023() < 0) {
                        iM2566 = (i5 - C2105.m6981("᩷֫")) * 13;
                        i = ((iM2566 ^ i6) * (-10749)) ^ (-1833238345);
                        i2 = 43954004;
                    } else {
                        iM2566 = C0630.m2566("۫֫") ^ i6;
                        i = ((iM2566 ^ i5) * (-23279)) ^ 1840323482;
                        i2 = 1448204869;
                    }
                    i8 = iM2566 ^ i2;
                    i7 = i;
                    break;
                case 508851476:
                case 632892500:
                    this.f19802 = charSequence2;
                    return arrayList;
                case 544781017:
                case 1786343280:
                    RunnableC0588.m2441();
                    localString = localString;
                    str2 = str2;
                    iM2567 = (i6 - C2105.m6981("ۛۗ")) * (-127);
                    i3 = ((iM2567 ^ i5) * 30961) ^ (-244322622);
                    i4 = -2008184772;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                case 1055710567:
                case 1547230313:
                    str = (String) charSequence;
                    if (C1711.m5741(str) < i12) {
                        localString = localString;
                        charSequence4 = charSequence;
                        iM2567 = (C2105.m6981("ۜۢ") + i6) * (-31);
                        str2 = str2;
                        i3 = ((iM2567 ^ i5) * 8395) ^ 76274188;
                        i4 = -1905982622;
                        i8 = iM2567 ^ i4;
                        i7 = i3;
                        str2 = str2;
                        localString = localString;
                    } else {
                        iM2566 = C0630.m2566("ۖۨ") ^ i5;
                        i = ((iM2566 ^ i6) * 19481) ^ 931901439;
                        i2 = 652422307;
                        i8 = iM2566 ^ i2;
                        i7 = i;
                    }
                    break;
                case 1614383975:
                case 2036123196:
                    itM9029 = C2958.m9029(arrayList);
                    iM2567 = C0630.m2566("ۙ֫") ^ i5;
                    i3 = ((iM2567 ^ i6) * (-14247)) ^ (-1912217091);
                    i4 = 639961811;
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
                default:
                    localString = localString;
                    str2 = str2;
                    if (C2520.m8026()) {
                        iM2567 = C0630.m2566("֡ۢ") ^ i5;
                        i3 = ((iM2567 ^ i6) * (-16665)) ^ (-6572251);
                        i4 = 528904545;
                    } else {
                        iM2567 = (C0630.m2566("ۛۡ") ^ i6) * 49;
                        i3 = ((iM2567 ^ i5) * (-7231)) ^ 968717746;
                        i4 = 111022088;
                    }
                    i8 = iM2567 ^ i4;
                    i7 = i3;
                    str2 = str2;
                    localString = localString;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ed A[PHI: r0 r2 r3 r5 r6 r7 r16
      0x01ed: PHI (r0v5 short[]) = (r0v3 short[]), (r0v2 short[]), (r0v2 short[]), (r0v2 short[]) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r2v4 short) = (r2v2 short), (r2v3 short), (r2v2 short), (r2v2 short) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r3v4 short) = (r3v2 short), (r3v3 short), (r3v2 short), (r3v2 short) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r16v13 int) = (r16v1 int), (r16v3 int), (r16v5 int), (r16v14 int) binds: [B:61:0x01eb, B:53:0x0198, B:45:0x0140, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (l.C0382.f1805 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (l.C2520.f8000 >= 0) goto L8;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17725(Object obj, String str) {
        int iM6981;
        int i;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -203564568;
        int i8 = C1773.f6144;
        int i9 = C0422.f1886;
        int iM6982 = (C2105.m6981("֡᩶") + i9) * (-105);
        int i10 = ((iM6982 ^ i8) * 9157) ^ 1712326658;
        int i11 = -1572069272;
        while (true) {
            int i12 = iM6982 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i8) * 17263) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2082581439:
                    case -794177322:
                        short[] sArr2 = f19799;
                        if (!C4159.f13567 || RunnableC1937.f6483 >= 0) {
                        }
                        String strM10568 = ServiceConnectionC3453.m10568(sArr2, 1, 9, i6);
                        short[] sArr3 = f19799;
                        if (C1294.f4556 < 0) {
                            i7 = i7;
                            String strM9031 = C2958.m9031(sArr3, 10, 16, i6);
                            if (C1916.f6442) {
                                throw new NullPointerException(C4860.m14172(strM10568, str, strM9031));
                            }
                            iM6981 = (C2105.m6981("֨۬") ^ i8) * 109;
                            i10 = 50890768 ^ ((iM6981 ^ i9) * (-24253));
                            i = 766200141;
                            i12 = i ^ iM6981;
                            i7 = i7;
                        }
                        i7 = i7;
                        iM6981 = C2105.m6981("ۛᩴ") ^ i8;
                        i10 = (-266407389) ^ ((iM6981 ^ i9) * (-475));
                        i = 680967292;
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                        break;
                    case -1893381742:
                    case -1207915853:
                        i7 = i7;
                        int i13 = i4 + i5;
                        if (i3 - (i13 + i13) <= 0) {
                            iM6981 = (C0630.m2566("᩻ᩴ") + i9) * 11;
                            i10 = (-1264006176) ^ ((iM6981 ^ i8) * (-20267));
                            i = -197468291;
                        } else {
                            iM6981 = (C0630.m2566("֫᩻") ^ i8) * 81;
                            i10 = 2098928509 ^ ((iM6981 ^ i9) * (-21931));
                            i = -1717013080;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -1622087335:
                    case -366027324:
                        return;
                    case -1541956413:
                    case 1426785489:
                        i7 = i7;
                        s = sArr[c];
                        s2 = 7585;
                        if (C2105.m6982() != 0) {
                            iM6981 = C2105.m6981("֨ۚ") ^ i9;
                            i10 = 812112587 ^ ((iM6981 ^ i8) * 26007);
                            i = 1165631001;
                        } else {
                            iM6981 = C2105.m6981("۫ܿ") ^ i8;
                            i10 = (-103564223) ^ ((iM6981 ^ i9) * 19249);
                            i = 293314040;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -955242772:
                    case 1701001330:
                        i7 = i7;
                        if (RunnableC1108.m3790()) {
                            iM6981 = C2105.m6981("ۛᩴ") ^ i8;
                            i10 = (-266407389) ^ ((iM6981 ^ i9) * (-475));
                            i = 680967292;
                        } else {
                            iM6981 = C2105.m6981("᩶ᩳ") ^ i8;
                            i10 = (-1722952478) ^ ((iM6981 ^ i9) * (-5295));
                            i = -774020564;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -880828537:
                    case 981125302:
                        C1773.m5908();
                        C1128.m3851();
                        i7 = i7;
                        iM6981 = C2105.m6981("֨ۚ") ^ i9;
                        i10 = 812112587 ^ ((iM6981 ^ i8) * 26007);
                        i = 1165631001;
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -864572400:
                    case 1123934678:
                        i7 = i7;
                        c = 0;
                        if (C1711.m5736() <= 0) {
                            iM6981 = (C2105.m6981("֨۬") ^ i8) * 109;
                            i10 = 50890768 ^ ((iM6981 ^ i9) * (-24253));
                            i = 766200141;
                        } else {
                            iM6981 = C0630.m2566("֨ۤ") ^ i9;
                            i10 = (-681338119) ^ ((iM6981 ^ i8) * (-22943));
                            i = -1124308482;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -624516266:
                    case 103494515:
                        if (C7106.f21815 != 0) {
                        }
                        i7 = i7;
                        iM6981 = (C2105.m6981("֨۬") ^ i8) * 109;
                        i10 = 50890768 ^ ((iM6981 ^ i9) * (-24253));
                        i = 766200141;
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -595544643:
                    case 2030617139:
                        i7 = i7;
                        i3 = i2 * i2;
                        i4 = s * s;
                        i5 = 57532225;
                        if (C1916.f6442) {
                            iM6981 = (C2105.m6981("ۨܽ") + i9) * (-107);
                            i10 = 656172201 ^ ((iM6981 ^ i8) * (-10417));
                            i = 760141501;
                        } else {
                            iM6981 = C2105.m6981("֨ۚ") ^ i9;
                            i10 = 812112587 ^ ((iM6981 ^ i8) * 26007);
                            i = 1165631001;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -428173661:
                    case -255347701:
                        i6 = 51518;
                        iM6981 = C2105.m6981("ۡܶ") ^ i9;
                        i10 = (-2010508420) ^ ((iM6981 ^ i8) * (-167));
                        i = -366747723;
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -221757247:
                    case -136467825:
                        i7 = i7;
                        if (obj != null) {
                            iM6981 = C2105.m6981("֨ܶ") ^ i8;
                            i10 = (-2146916480) ^ ((iM6981 ^ i9) * 25285);
                            i = -996996420;
                        } else {
                            iM6981 = C0630.m2566("ܶۢ") ^ i8;
                            i10 = (-1348939868) ^ ((iM6981 ^ i9) * (-7863));
                            i = -1385966629;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case -10269337:
                    case 1225500911:
                        i7 = i7;
                        sArr = f19799;
                        if (RunnableC1937.f6483 >= 0) {
                            iM6981 = C2105.m6981("֨ۚ") ^ i9;
                            i10 = 812112587 ^ ((iM6981 ^ i8) * 26007);
                            i = 1165631001;
                        } else {
                            iM6981 = C2105.m6981("۫ܺ") ^ i9;
                            i10 = (-1339183026) ^ ((iM6981 ^ i8) * 5075);
                            i = -727960898;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case 215234715:
                    case 1893359749:
                        C7106.m19120();
                        break;
                    case 548177920:
                    case 1403726862:
                        i6 = 59498;
                        iM6981 = C2105.m6981("ۡܶ") ^ i9;
                        i10 = (-2010508420) ^ ((iM6981 ^ i8) * (-167));
                        i = -366747723;
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case 628810024:
                    case 1069949370:
                        i7 = i7;
                        i2 = s + s2;
                        if (RunnableC3474.f10992 <= 0) {
                            iM6981 = C2105.m6981("ۖ᩺") ^ i9;
                            i10 = (-1343762436) ^ ((iM6981 ^ i8) * 23421);
                            i = 1360656519;
                        } else {
                            iM6981 = C0630.m2566("ۙܶ") ^ i8;
                            i10 = (-711135900) ^ ((iM6981 ^ i9) * (-1807));
                            i = -230879434;
                        }
                        i12 = i ^ iM6981;
                        i7 = i7;
                        break;
                    case 1479887058:
                    case 1569844010:
                        C4117.m12364();
                        C11340.m28031();
                        return;
                    default:
                        break;
                }
            }
            iM6982 = (C2105.m6981("᩵ܺ") + i9) * (-15);
            i10 = ((iM6982 ^ i8) * (-12295)) ^ 1139896942;
            i11 = -2033016675;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x014a A[PHI: r3 r4 r11
      0x014a: PHI (r3v3 l.᩺᩻᩷) = (r3v2 l.᩺᩻᩷), (r3v2 l.᩺᩻᩷), (r3v4 l.᩺᩻᩷) binds: [B:37:0x0130, B:33:0x010e, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:37:0x0130, B:33:0x010e, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:37:0x0130, B:33:0x010e, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01fe A[PHI: r8 r9 r12 r13 r14
      0x01fe: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:54:0x01fc, B:50:0x01d9, B:29:0x00e4, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:54:0x01fc, B:50:0x01d9, B:29:0x00e4, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:54:0x01fc, B:50:0x01d9, B:29:0x00e4, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:54:0x01fc, B:50:0x01d9, B:29:0x00e4, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:54:0x01fc, B:50:0x01d9, B:29:0x00e4, B:15:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0256 A[PHI: r6 r7 r19
      0x0256: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:62:0x0254, B:58:0x0236, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:62:0x0254, B:58:0x0236, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:62:0x0254, B:58:0x0236, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L14;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PluginPreference.Input addInput(CharSequence charSequence, String str) {
        int iM6981;
        int i;
        int i2;
        String str2 = str;
        int i3 = C0714.f2697;
        int i4 = C3911.f12484;
        int iM2566 = C0630.m2566("᩶֡") ^ i3;
        int i5 = ((iM2566 ^ i4) * 1467) ^ (-596233780);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 1808012371;
        C23331 c23331 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -79030530;
        short[] sArr3 = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 603) >> 31));
            switch (i12) {
                case -2026681868:
                case -512637405:
                    int i14 = 228614400 + i8;
                    i9 = i14 + i14;
                    if (C1294.f4556 >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") + i3) * (-123);
                        i = ((iM6981 ^ i4) * 31953) ^ 1957244659;
                        i2 = -1712643420;
                    } else {
                        iM6981 = (C2105.m6981("ۚܳ") + i3) * (-99);
                        i = ((iM6981 ^ i4) * (-19893)) ^ (-906338233);
                        i2 = 948123762;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1886285615:
                case 975393378:
                    C3663.m11168();
                    if (C0964.f3626 == 0) {
                        iM6981 = C0630.m2566("֡۬") ^ i4;
                        i = ((iM6981 ^ i3) * 11815) ^ 2048948682;
                        i2 = -1712054791;
                        i6 = iM6981 ^ i2;
                        str2 = str;
                    } else {
                        int iM2567 = (C0630.m2566("ۡۤ") ^ i3) * (-79);
                        i = ((iM2567 ^ i4) * (-19943)) ^ 1800836345;
                        i6 = iM2567 ^ 1637821708;
                    }
                    i5 = i;
                    break;
                case -1751435684:
                case 1863770709:
                    c23331.f24118 = charSequence;
                    c23331.f24119 = str2;
                    C1916.m6307(this.f19801, c23331);
                    return c23331;
                case -1539826129:
                case -1302787703:
                    sArr = f19799;
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("֡۬") ^ i4;
                        i = ((iM6981 ^ i3) * 11815) ^ 2048948682;
                        i2 = -1712054791;
                    } else {
                        iM6981 = (C2105.m6981("ۘᩳ") ^ i4) * (-113);
                        i = ((iM6981 ^ i3) * 1883) ^ 88141549;
                        i2 = 52935799;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1521080314:
                case 353702811:
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) < 0) {
                        iM6981 = (C2105.m6981("᩻۠") + i3) * (-81);
                        i = ((iM6981 ^ i4) * (-5891)) ^ (-338241260);
                        i2 = -231411122;
                    } else {
                        iM6981 = C0630.m2566("ۘ᩹") ^ i3;
                        i = ((iM6981 ^ i4) * 27253) ^ (-864580996);
                        i2 = 735654049;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1516846051:
                case 265752412:
                    i13 = 17954;
                    iM6981 = C2105.m6981("ۢܶ") ^ i4;
                    i = ((iM6981 ^ i3) * 6703) ^ (-1020787720);
                    i2 = 1142861789;
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1489529556:
                case 1259342387:
                    c23331.f74988 = i7;
                    sArr3 = f19799;
                    if (C4616.m13552() != 0) {
                        iM6981 = (C0630.m2566("ܰܿ") ^ i4) * 37;
                        i = ((iM6981 ^ i3) * (-18999)) ^ (-1898874460);
                        i2 = -780446957;
                    } else {
                        iM6981 = (C2105.m6981("ۚ۫") ^ i3) * (-65);
                        i = ((iM6981 ^ i4) * 12769) ^ 1557516073;
                        i2 = 350493324;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -1156339070:
                case 106995573:
                    C7811.m20844();
                    break;
                case -1045595493:
                case 96870704:
                    i13 = 57714;
                    iM6981 = C2105.m6981("ۢܶ") ^ i4;
                    i = ((iM6981 ^ i3) * 6703) ^ (-1020787720);
                    i2 = 1142861789;
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -916721352:
                case 2053289360:
                    m17725(charSequence, RunnableC1937.m6385(sArr3, 42, 5, i13));
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ܰܿ") ^ i4) * 37;
                        i = ((iM6981 ^ i3) * (-18999)) ^ (-1898874460);
                        i2 = -780446957;
                    } else {
                        iM6981 = C2105.m6981("ܰܳ") ^ i3;
                        i = ((iM6981 ^ i4) * 31491) ^ 1887145901;
                        i2 = 1975391486;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -851201940:
                case -68032288:
                    sArr2 = f19799;
                    i10 = 47;
                    i11 = 3;
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") + i3) * (-123);
                        i = ((iM6981 ^ i4) * 31953) ^ 1957244659;
                        i2 = -1712643420;
                    } else {
                        iM6981 = (C2105.m6981("۟᩷") ^ i4) * (-51);
                        i = ((iM6981 ^ i3) * 17935) ^ 318120850;
                        i2 = 1999066629;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -845067499:
                case 1158380887:
                    C2167.m7155();
                    C1294.m4372();
                    return null;
                case -812596500:
                case -667623406:
                    s2 = 15120;
                    if (C3683.f11629 >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") + i3) * (-123);
                        i = ((iM6981 ^ i4) * 31953) ^ 1957244659;
                        i2 = -1712643420;
                    } else {
                        iM6981 = C0630.m2566("ۚۗ") ^ i4;
                        i = ((iM6981 ^ i3) * 24397) ^ 361565804;
                        i2 = 1135990062;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -620184136:
                case -444057691:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C2105.m6981("֨۫") ^ i3;
                        i = ((iM6981 ^ i4) * 28473) ^ (-1765049871);
                        i2 = -884682487;
                    } else {
                        iM6981 = C2105.m6981("ۖ֨") ^ i3;
                        i = ((iM6981 ^ i4) * (-20189)) ^ (-492189272);
                        i2 = 1008126470;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -557818403:
                case 374588709:
                    s = sArr[41];
                    i8 = s * s;
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("᩺۠") ^ i4;
                        i = ((iM6981 ^ i3) * 26397) ^ 564686689;
                        i2 = 126999440;
                    } else {
                        iM6981 = C0630.m2566("֡۬") ^ i4;
                        i = ((iM6981 ^ i3) * 11815) ^ 2048948682;
                        i2 = -1712054791;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -546296526:
                case 2008648012:
                    m17725(str2, C3019.m9250(sArr2, i10, i11, i13));
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("֨۫") ^ i3;
                        i = ((iM6981 ^ i4) * 28473) ^ (-1765049871);
                        i2 = -884682487;
                        i6 = iM6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    } else {
                        int iM2568 = C0630.m2566("ۘۤ") ^ i4;
                        i6 = iM2568 ^ (-1980424372);
                        i5 = ((iM2568 ^ i3) * 4057) ^ 613735021;
                        str2 = str;
                    }
                    break;
                case -137408680:
                case 2132250247:
                    C0630.m2564();
                    ViewOnClickListenerC1958.m6429();
                    iM6981 = C2105.m6981("֨۫") ^ i3;
                    i = ((iM6981 ^ i4) * 28473) ^ (-1765049871);
                    i2 = -884682487;
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                case -23304456:
                case 1962868690:
                    if (C5695.m16023() >= 0) {
                        iM6981 = (C2105.m6981("ۙ᩹") + i3) * (-123);
                        i = ((iM6981 ^ i4) * 31953) ^ 1957244659;
                        i2 = -1712643420;
                        i6 = iM6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    iM6981 = C2105.m6981("֨۫") ^ i3;
                    i = ((iM6981 ^ i4) * 28473) ^ (-1765049871);
                    i2 = -884682487;
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
                default:
                    c23331 = new C23331();
                    i7 = 1;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        iM6981 = (C0630.m2566("ܰܿ") ^ i4) * 37;
                        i = ((iM6981 ^ i3) * (-18999)) ^ (-1898874460);
                        i2 = -780446957;
                    } else {
                        iM6981 = C2105.m6981("ۧۚ") ^ i4;
                        i = ((iM6981 ^ i3) * 4341) ^ 396852872;
                        i2 = -1376521995;
                    }
                    i6 = iM6981 ^ i2;
                    str2 = str;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x020a A[PHI: r3 r4 r6
      0x020a: PHI (r3v7 java.util.ArrayList) = (r3v1 java.util.ArrayList), (r3v2 java.util.ArrayList), (r3v1 java.util.ArrayList) binds: [B:58:0x0208, B:43:0x0151, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r4v5 l.֫ۜ᩷) = (r4v2 l.֫ۜ᩷), (r4v3 l.֫ۜ᩷), (r4v2 l.֫ۜ᩷) binds: [B:58:0x0208, B:43:0x0151, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:58:0x0208, B:43:0x0151, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0267 A[PHI: r10 r11 r12 r13
      0x0267: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:64:0x0265, B:36:0x0105, B:28:0x00bb, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:64:0x0265, B:36:0x0105, B:28:0x00bb, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:64:0x0265, B:36:0x0105, B:28:0x00bb, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:64:0x0265, B:36:0x0105, B:28:0x00bb, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (l.C1711.f5919 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (l.C0237.f1507 != 0) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PluginPreference.List addList(CharSequence charSequence, String str) {
        int iM6981;
        int i;
        int i2;
        str = str;
        int i3 = C4075.f12947;
        int i4 = C3019.f9544;
        int iM6982 = C2105.m6981("ܿ֨") ^ i4;
        int i5 = ((iM6982 ^ i3) * 18867) ^ (-1604528390);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-2058142524);
        ArrayList arrayList = null;
        C1668 c1668 = null;
        short s = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 417796656;
        short[] sArr3 = null;
        int i11 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 28855) >> 31));
            switch (i10) {
                case -2142862892:
                case 105367322:
                    s = sArr[50];
                    if (C5695.f17556 >= 0) {
                        iM6981 = (C0630.m2566("ۢܶ") + i4) * (-31);
                        i = ((iM6981 ^ i3) * 27577) ^ (-745582397);
                        i2 = -423574141;
                    } else {
                        iM6981 = C0630.m2566("ܿۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 15485) ^ 1527181307;
                        i2 = 686292497;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2128918662:
                case 618517096:
                    i11 = 36174;
                    iM6981 = (C0630.m2566("᩶ᩴ") ^ i3) * (-31);
                    i = ((iM6981 ^ i4) * (-7729)) ^ 694206791;
                    i2 = -219695268;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2094117245:
                case 1267449393:
                    C1420.m4913();
                    break;
                case -1884568070:
                case -130689993:
                    c1668 = new C1668();
                    if (C2105.m6982() == 0) {
                        arrayList = new ArrayList();
                        if (C1916.f6442) {
                            iM6981 = (C0630.m2566("᩶᩶") + i4) * 95;
                            i = ((iM6981 ^ i3) * 28921) ^ (-725978436);
                            i2 = 1863559564;
                        } else {
                            iM6981 = (C0630.m2566("ۢܶ") + i4) * (-31);
                            i = ((iM6981 ^ i3) * 27577) ^ (-745582397);
                            i2 = -423574141;
                        }
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6983 = (C2105.m6981("᩵֡") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = iM6983 ^ (-1206877333);
                        i5 = ((iM6983 ^ i4) * 26405) ^ (-1499706125);
                        arrayList = null;
                    }
                    break;
                case -1881637458:
                case -1149086546:
                    int i12 = s + s2;
                    if ((i12 * i12) - i7 < 0) {
                        iM6981 = C2105.m6981("ۜ᩷") ^ i4;
                        i = ((iM6981 ^ i3) * (-29871)) ^ (-655846688);
                        i2 = -1291713477;
                    } else {
                        iM6981 = C0630.m2566("֨ۚ") ^ i3;
                        i = ((iM6981 ^ i4) * 10575) ^ 743502100;
                        i2 = -1400474238;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1825841011:
                case 1115365992:
                    break;
                case -1762053185:
                case 2013839736:
                    if (C1047.m3599() >= 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 16063) ^ 1667798980;
                        i2 = 2123019594;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    }
                    iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-121);
                    i = ((iM6981 ^ i4) * 24847) ^ 1590481451;
                    i2 = 240105124;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1313398861:
                case 597211711:
                    c1668.f24118 = charSequence;
                    c1668.f24119 = str;
                    C7106.m19117(this.f19801, c1668);
                    return c1668;
                case -1087322311:
                case -780250914:
                    m17725(charSequence, C1420.m4902(sArr3, 51, 5, i11));
                    if (C0422.f1886 > 0) {
                        iM6981 = C0630.m2566("᩺ۘ") ^ i3;
                        i = ((iM6981 ^ i4) * 10293) ^ 1245440273;
                        i2 = -1864150161;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6984 = (C2105.m6981("᩵֡") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = iM6984 ^ (-1206877333);
                        i5 = ((iM6984 ^ i4) * 26405) ^ (-1499706125);
                        arrayList = null;
                    }
                    break;
                case -985231204:
                case 526936038:
                    i7 = s * 54608;
                    s2 = 13652;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM6981 = (C2105.m6981("ܶᩳ") + i3) * (-79);
                        i = ((iM6981 ^ i4) * (-30817)) ^ (-2102277864);
                        i2 = -728339411;
                    } else {
                        iM6981 = C2105.m6981("ۚۖ") ^ i3;
                        i = ((iM6981 ^ i4) * 8487) ^ (-6298356);
                        i2 = 869899850;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -543861881:
                case 173220536:
                    C21923.m49329();
                    C2167.m7155();
                    return null;
                case 69038806:
                case 149179077:
                    m17725(str, C3019.m9250(sArr2, i8, i9, i11));
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-121);
                        i = ((iM6981 ^ i4) * 24847) ^ 1590481451;
                        i2 = 240105124;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2566 = C0630.m2566("ۢ۟") ^ i4;
                        i6 = iM2566 ^ (-835063822);
                        i5 = ((iM2566 ^ i3) * (-2687)) ^ 805356057;
                    }
                    break;
                case 414939433:
                case 1287898262:
                    sArr2 = f19799;
                    i8 = 56;
                    i9 = 3;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 16063) ^ 1667798980;
                        i2 = 2123019594;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ᩳ۬")) * (-3);
                        i = ((iM6981 ^ i4) * 18577) ^ 918539184;
                        i2 = 1847341510;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 939323163:
                case 1057895784:
                    C2105.m6982();
                    iM6981 = (C0630.m2566("ۢܶ") + i4) * (-31);
                    i = ((iM6981 ^ i3) * 27577) ^ (-745582397);
                    i2 = -423574141;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 996806184:
                case 1598013660:
                    c1668.f5839 = arrayList;
                    sArr3 = f19799;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 16063) ^ 1667798980;
                        i2 = 2123019594;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۫ۙ")) * (-25);
                        i = ((iM6981 ^ i3) * 27151) ^ 583635597;
                        i2 = 1954538263;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1301190675:
                case 1587765968:
                    i11 = 27572;
                    iM6981 = (C0630.m2566("᩶ᩴ") ^ i3) * (-31);
                    i = ((iM6981 ^ i4) * (-7729)) ^ 694206791;
                    i2 = -219695268;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1760711549:
                case 1956545364:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۢۙ") ^ i4;
                        i = ((iM6981 ^ i3) * 16063) ^ 1667798980;
                        i2 = 2123019594;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵۟")) * (-29);
                        i = ((iM6981 ^ i4) * 18531) ^ 702681022;
                        i2 = -430813192;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f19799;
                    if (C1711.f5919) {
                        iM6981 = (i3 - C0630.m2566("ܿۖ")) * (-121);
                        i = ((iM6981 ^ i4) * 24847) ^ 1590481451;
                        i2 = 240105124;
                    } else {
                        iM6981 = (C2105.m6981("ۗۤ") + i4) * (-87);
                        i = ((iM6981 ^ i3) * (-2653)) ^ (-1134336999);
                        i2 = -1115080399;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onPreferenceChange(PluginPreference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f19804 = onPreferenceChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onCreated(PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener) {
        this.f19805 = onPreferenceScreenCreatedListener;
        return this;
    }
}
