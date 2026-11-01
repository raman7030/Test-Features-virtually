package p067l;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;

/* JADX INFO: renamed from: l.᩶ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D63W */
/* JADX INFO: loaded from: classes4.dex */
public final class C21272 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f66912;

    /* JADX INFO: renamed from: ۜ */
    public static int f66913;

    /* JADX INFO: renamed from: ۡ */
    public static boolean f66914;

    /* JADX INFO: renamed from: ۢ */
    public static int f66915;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f66916;

    /* JADX INFO: renamed from: ܳ */
    public static boolean f66917;

    /* JADX INFO: renamed from: ܺ */
    public static final HashMap f66918;

    /* JADX INFO: renamed from: ܽ */
    public static int f66919;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f66920;

    /* JADX INFO: renamed from: ᩳ */
    public static int f66921;

    /* JADX INFO: renamed from: ᩶ܳ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f82962 = {3524, 26140, -32152, 20376, 2027, 32580, 26607, 30475, 9762, 1792, 1807, 1802, 1795, 1849, 1802, 1807, 1813, 1810, 1849, 1813, 1807, 1820, 1795, 1879, 1792, 1807, 1802, 1795, 1849, 1800, 1799, 1803, 1795, 1849, 1803, 1799, 1822, 1849, 1802, 1807, 1800, 1795, 1876, 1794, 1799, 1810, 1795, 1849, 1810, 1807, 1803, 1795, 1849, 1792, 1801, 1812, 1803, 1799, 1810, 1878, 1792, 1807, 1802, 1795, 1849, 1797, 1803, 1814, 1849, 1813, 1801, 1812, 1810, 1849, 1802, 1795, 1792, 1810, 1792, 1807, 1802, 1795, 1849, 1797, 1803, 1814, 1849, 1812, 1795, 1808, 1795, 1812, 1813, 1795, 1849, 1802, 1795, 1792, 1810, 1792, 1807, 1802, 1795, 1849, 1797, 1803, 1814, 1849, 1813, 1801, 1812, 1810, 1849, 1812, 1807, 1793, 1806, 1810, 1792, 1807, 1802, 1795, 1849, 1797, 1803, 1814, 1849, 1812, 1795, 1808, 1795, 1812, 1813, 1795, 1849, 1812, 1807, 1793, 1806, 1810, 1794, 1807, 1813, 1799, 1796, 1802, 1795, 1849, 1814, 1795, 1812, 1803, 1807, 1813, 1813, 1807, 1801, 1800, 1849, 1807, 1800, 1849, 1802, 1807, 1813, 1810, 1813, 1806, 1801, 1809, 1849, 1796, 1801, 1801, 1805, 1803, 1799, 1812, 1805, 1813, 1849, 1807, 1800, 1849, 1813, 1807, 1794, 1795, 1796, 1799, 1812, 1793, 1795, 1800, 1795, 1812, 1799, 1810, 1795, 1849, 1796, 1799, 1797, 1805, 1811, 1814, 1849, 1792, 1807, 1802, 1795, 1813, 1801, 1812, 1810, 1849, 1801, 1800, 1802, 1823, 1849, 1807, 1800, 1849, 1814, 1799, 1810, 1806, 1849, 1802, 1807, 1813, 1810, 1812, 1796, 1813, 1792, 1802, 1810, 1814, 1850, 1850, 7206, -31732, -31728, -31731, -31733, -31712, -31728, -31727, -31725, -31738, -31712, -31722, -31727, -31712, -31729, -31714, -31733, -31721, -31712, -31725, -31722, -31732, -31733};

    /* JADX INFO: renamed from: ᩷ */
    public static int f66922;

    /* JADX INFO: renamed from: ᩻ */
    public static int f66923;

    static {
        HashMap map = null;
        int i = -919672348;
        int i2 = C0894.f81854;
        int i3 = C0906.f81862;
        int iM55979 = C0946.m55979("ܺᩳ") ^ i3;
        int i4 = ((iM55979 ^ i2) * 5379) ^ (-282201145);
        int i5 = 1159100550;
        while (true) {
            i = ((((i ^ i2) * 8543) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1835063799:
                case -1573189799:
                    f66918 = map;
                    if (C0892.f81851) {
                        iM55979 = C0873.m55680("ܶܰ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19667) ^ (-1133014654);
                        i5 = -2079344250;
                    } else {
                        iM55979 = C0946.m55979("ܰۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11969) ^ (-592286444);
                        i5 = 1311130783;
                    }
                    break;
                case -1738443358:
                case -367119148:
                    map = new HashMap();
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    } else {
                        iM55979 = C0946.m55979("۫ܽ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29475) ^ 1985994584;
                        i5 = 1962736860;
                    }
                    break;
                case -1731372738:
                case -1189601860:
                    if (C0955.f81898) {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    } else {
                        iM55979 = (C0946.m55979("֫ۚ") ^ i3) * 41;
                        i4 = ((iM55979 ^ i2) * (-18173)) ^ 105825239;
                        i5 = -1435296483;
                    }
                    break;
                case -1673768637:
                case 941613442:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ܰ᩸") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * (-5373)) ^ (-2069146824);
                        i5 = 1907547058;
                    } else {
                        iM55979 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28977) ^ 162401662;
                        i5 = 878764331;
                    }
                    break;
                case -1192296049:
                case -108780537:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("ۗۙ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * 30647) ^ (-1113239761);
                        i5 = 688395771;
                    } else {
                        iM55979 = (C0946.m55979("ۛۗ") ^ i3) * 51;
                        i4 = ((iM55979 ^ i2) * 32365) ^ 276344783;
                        i5 = 963142194;
                    }
                    break;
                case -1188267989:
                case 23420007:
                    C0906.m55809();
                    iM55979 = (C0946.m55979("ܰ᩸") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM55979 ^ i2) * (-5373)) ^ (-2069146824);
                    i5 = 1907547058;
                    break;
                case -1089275918:
                case 826507663:
                    if (C0854.f81826 != 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    } else {
                        iM55979 = C0946.m55979("ۢܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-17519)) ^ 563998652;
                        i5 = -1068157458;
                    }
                    break;
                case -1020754590:
                case -963903074:
                    C0937.m55918();
                    if (C1012.f81938 < 0) {
                        iM55979 = (C0873.m55680("ۗۙ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * 30647) ^ (-1113239761);
                        i5 = 688395771;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    }
                    break;
                case -1017207714:
                case 967007008:
                    C1053.m56327();
                    if (!C0947.f81895) {
                        iM55979 = (C0873.m55680("۬᩺") + i3) * (-119);
                        i4 = ((iM55979 ^ i2) * (-21767)) ^ 1184607828;
                        i5 = 1678722335;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    }
                    break;
                case -751880985:
                case 364529308:
                    C0894.m55769();
                    if (C1044.f81959 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۛ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * (-20381)) ^ (-931102907);
                        i5 = 1473146607;
                    } else {
                        iM55979 = (C0946.m55979("ܰ᩸") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * (-5373)) ^ (-2069146824);
                        i5 = 1907547058;
                    }
                    break;
                case -406475641:
                case 467867620:
                    if (RunnableC1014.m56177()) {
                        iM55979 = (C0946.m55979("۟ۡ") ^ i2) * 109;
                        i4 = ((iM55979 ^ i3) * (-29545)) ^ 1073419553;
                        i5 = 221593760;
                    } else {
                        iM55979 = (C0873.m55680("۬᩺") + i3) * (-119);
                        i4 = ((iM55979 ^ i2) * (-21767)) ^ 1184607828;
                        i5 = 1678722335;
                    }
                    break;
                case 152875199:
                case 158816853:
                    f66912 = true;
                    return;
                case 403225737:
                case 1834856719:
                    if (C1028.m56247() >= 0) {
                        iM55979 = (C0946.m55979("ܰ᩸") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * (-5373)) ^ (-2069146824);
                        i5 = 1907547058;
                    } else {
                        iM55979 = C0946.m55979("ܺܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28091)) ^ (-1609726332);
                        i5 = 859045931;
                    }
                    break;
                case 1648568921:
                case 1993692618:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ۗۙ") + i2) * (-43);
                        i4 = ((iM55979 ^ i3) * 30647) ^ (-1113239761);
                        i5 = 688395771;
                    } else {
                        iM55979 = C0873.m55680("ۚۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18355)) ^ (-874584550);
                        i5 = -1034560406;
                    }
                    break;
                case 1868390232:
                case 2101932715:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("۬᩺") + i3) * (-119);
                        i4 = ((iM55979 ^ i2) * (-21767)) ^ 1184607828;
                        i5 = 1678722335;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۗ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 28625) ^ (-1540710529);
                        i5 = 887211358;
                    }
                    break;
                default:
                    C1036.m56257();
                    C1194.m56396();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x023f A[PHI: r9 r10
      0x023f: PHI (r9v98 java.lang.String) = (r9v97 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:65:0x0226, B:55:0x019f, B:43:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r10v52 java.util.HashMap) = (r10v51 java.util.HashMap), (r10v2 java.util.HashMap), (r10v2 java.util.HashMap) binds: [B:65:0x0226, B:55:0x019f, B:43:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (p067l.C0863.f81833 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (p067l.C1017.f81942 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (p067l.C0873.f81841 <= 0) goto L21;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m48054() {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int length;
        int i7 = 0;
        int i8 = C0992.f81922;
        int i9 = C1012.f81938;
        int iM559711 = C0946.m55979("᩶᩸") ^ i9;
        int i10 = ((iM559711 ^ i8) * 2393) ^ (-1511249430);
        String strM56293 = null;
        String[] strArrM55948 = null;
        int i11 = iM559711 ^ (-1726121512);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1978121774;
        short s = 0;
        InterfaceC14100 interfaceC14100 = null;
        HashMap map = null;
        boolean z = false;
        String strM56333 = null;
        InterfaceC14100 interfaceC14101 = null;
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = null;
        InterfaceC14100 interfaceC14102 = null;
        boolean z2 = false;
        while (true) {
            i15 = i11 ^ (i10 & (((i15 ^ i8) * 22839) >> 31));
            switch (i15) {
                case -2000871783:
                case -883028583:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    f66913 = z ? 1 : 0;
                    iM559710 = (i8 - C0873.m55680("᩻ܽ")) * 15;
                    i5 = ((iM559710 ^ i9) * 1515) ^ 1138243104;
                    i6 = 2025098947;
                    int i16 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i16;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -1920494332:
                case 606269658:
                    strM56333 = strM56333;
                    map = map;
                    f66921 = ApplicationC21448.f67649.getInt(C1024.m56203(f82962, 99, 19, i7), z2 ? 1 : 0);
                    interfaceC14102 = ApplicationC21448.f67649;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("ܽܽ") ^ i9;
                        i3 = ((iM55979 ^ i8) * (-30291)) ^ (-604515792);
                        i4 = 1714907130;
                    } else {
                        iM55979 = C0946.m55979("᩵ۡ") ^ i9;
                        i3 = ((iM55979 ^ i8) * 21733) ^ 1899287418;
                        i4 = -1489485629;
                    }
                    int i17 = iM55979 ^ i4;
                    map = map;
                    String str = strM56333;
                    i11 = i17;
                    i10 = i3;
                    strM56333 = str;
                    break;
                case -1796079151:
                case 1242023119:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    try {
                        f66922 = AbstractC0942.m55969(C1404.m56466(ApplicationC21448.f67650, C1124.m56373(f82962, 24, 18, i7), C1003.m56132(f82962, 42, 1, i7)));
                        iM559710 = (C0873.m55680("᩻᩹") + i9) * (-57);
                        i5 = ((iM559710 ^ i8) * 19387) ^ 1112716898;
                        i6 = 2127614847;
                    } catch (NumberFormatException unused) {
                        iM559710 = C0946.m55979("ܳ᩷") ^ i9;
                        i5 = ((iM559710 ^ i8) * (-31539)) ^ 1907468837;
                        i6 = -889434117;
                    }
                    int i18 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i18;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -1773174532:
                case 972794779:
                    length = strArrM55948.length;
                    i13 = length;
                    iM55680 = C0946.m55979("ۖܰ") ^ i9;
                    i = ((iM55680 ^ i8) * 13065) ^ 1984469231;
                    i2 = -170114971;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1764571974:
                case 1563993531:
                    RunnableC0897.m55784();
                    break;
                case -1713001100:
                case -435291551:
                    strM56333 = strM56333;
                    map = map;
                    f66914 = C1124.m56371(sharedPreferences2, C1929.m56558(f82962, 166, 25, i7), z2);
                    sharedPreferences = ApplicationC21448.f67650;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0946.m55979("ܿۗ") ^ i9) * (-119);
                        i3 = ((iM55979 ^ i8) * 20977) ^ 1122204562;
                        i4 = -1629124397;
                    } else {
                        iM55979 = (C0946.m55979("ۗ᩶") + i8) * (-37);
                        i3 = ((iM55979 ^ i9) * (-12089)) ^ (-268842683);
                        i4 = -1129549767;
                    }
                    int i19 = iM55979 ^ i4;
                    map = map;
                    String str2 = strM56333;
                    i11 = i19;
                    i10 = i3;
                    strM56333 = str2;
                    break;
                case -1673414920:
                case -690895078:
                    strM56333 = strM56333;
                    map = map;
                    interfaceC14100 = ApplicationC21448.f67649;
                    strM56293 = C1046.m56293(f82962, 60, 18, i7);
                    if (C0845.f81821 >= 0) {
                        iM55979 = (i8 - C0946.m55979("ܺۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM55979 ^ i9) * 19903) ^ (-1018871860);
                        i4 = 629570955;
                    } else {
                        iM55979 = (C0946.m55979("֨ۢ") ^ i8) * 41;
                        i3 = ((iM55979 ^ i9) * 243) ^ 1603962966;
                        i4 = 316094931;
                    }
                    int i110 = iM55979 ^ i4;
                    map = map;
                    String str3 = strM56333;
                    i11 = i110;
                    i10 = i3;
                    strM56333 = str3;
                    break;
                case -1517500239:
                case 1304034819:
                    C0955.m56025();
                    break;
                case -1352388568:
                case -756811815:
                    i7 = 1894;
                    iM559710 = C0946.m55979("᩷ۤ") ^ i9;
                    i5 = ((iM559710 ^ i8) * 831) ^ 1299648054;
                    i6 = 1540032458;
                    int i111 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i111;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -1289977215:
                case -1185325108:
                    if (i12 < i13) {
                        iM55680 = (i8 - C0946.m55979("ᩳܺ")) * (-121);
                        i = ((iM55680 ^ i9) * (-17851)) ^ 1523609272;
                        i2 = 236952187;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩻") ^ i8;
                        i = ((iM55680 ^ i9) * 26013) ^ (-707700441);
                        i2 = -1659191698;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1208688368:
                case 1306445228:
                    if (C0882.m55719(strM56333) == 0) {
                        iM55680 = C0873.m55680("ۜ᩻") ^ i8;
                        i = ((iM55680 ^ i9) * 26013) ^ (-707700441);
                        i2 = -1659191698;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩷") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i9) * 18863) ^ 1451213790;
                        i2 = 250342041;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -1182001887:
                case 694013232:
                    f66923 = ApplicationC21448.f67650.getInt(ViewOnClickListenerC0939.m55947(f82962, 236, 4, i7), z2 ? 1 : 0);
                    break;
                case -1124802238:
                case 455665612:
                    strM56333 = strM56333;
                    map = map;
                    f66912 = C0967.m56071(sharedPreferences, C1404.m56462(f82962, 191, 20, i7), z);
                    interfaceC14101 = ApplicationC21448.f67649;
                    if (C0992.f81922 < 0) {
                        iM55979 = (C0946.m55979("᩶᩺") + i9) * (-33);
                        i3 = ((iM55979 ^ i8) * 14383) ^ (-2135669805);
                        i4 = -1831212563;
                        int i112 = iM55979 ^ i4;
                        map = map;
                        String str4 = strM56333;
                        i11 = i112;
                        i10 = i3;
                        strM56333 = str4;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        iM559710 = C0946.m55979("ۚܰ") ^ i8;
                        i5 = ((iM559710 ^ i9) * 24197) ^ 1922564548;
                        i6 = -979914816;
                        int i113 = iM559710 ^ i6;
                        strM56333 = strM56333;
                        map = map;
                        i11 = i113;
                        i10 = i5;
                        interfaceC14100 = interfaceC14100;
                    }
                    break;
                case -1104682706:
                case -70806063:
                    C0877.m55696();
                    C1194.m56396();
                    strM56333 = strM56333;
                    map = map;
                    iM55979 = (C0873.m55680("۟۠") ^ i9) * 75;
                    i3 = ((iM55979 ^ i8) * 22743) ^ 404742943;
                    i4 = -871231453;
                    int i114 = iM55979 ^ i4;
                    map = map;
                    String str5 = strM56333;
                    i11 = i114;
                    i10 = i3;
                    strM56333 = str5;
                    break;
                case -1102163110:
                case -752624782:
                    C1071.m56343();
                    if (C1194.m56396() <= 0) {
                        strM56333 = strM56333;
                        map = map;
                        iM55979 = (C0873.m55680("ܿۛ") + i8) * (-31);
                        i3 = ((iM55979 ^ i9) * 12215) ^ (-513288749);
                        i4 = 864498586;
                        int i115 = iM55979 ^ i4;
                        map = map;
                        String str6 = strM56333;
                        i11 = i115;
                        i10 = i3;
                        strM56333 = str6;
                    }
                    strM56333 = strM56333;
                    map = map;
                    iM55979 = (i8 - C0946.m55979("ۡۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i3 = ((iM55979 ^ i9) * 9345) ^ (-1124892090);
                    i4 = -588538256;
                    int i116 = iM55979 ^ i4;
                    map = map;
                    String str7 = strM56333;
                    i11 = i116;
                    i10 = i3;
                    strM56333 = str7;
                    break;
                case -1080034770:
                case 551980995:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("۫۫") ^ i9;
                        i = ((iM55680 ^ i8) * 13471) ^ (-1062783008);
                        i2 = 1854622388;
                        i11 = iM55680 ^ i2;
                        i10 = i;
                    } else {
                        strM56333 = strM56333;
                        map = map;
                        iM55979 = (i8 - C0946.m55979("ܺۗ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM55979 ^ i9) * 19903) ^ (-1018871860);
                        i4 = 629570955;
                        int i117 = iM55979 ^ i4;
                        map = map;
                        String str8 = strM56333;
                        i11 = i117;
                        i10 = i3;
                        strM56333 = str8;
                    }
                    break;
                case -1055675712:
                case 1628775722:
                    C1964.m56597();
                    break;
                case -996222892:
                case -610284292:
                    C0845.m55584();
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ܿܳ") ^ i9;
                        i = ((iM55680 ^ i8) * (-1429)) ^ 529827077;
                        i2 = 600209478;
                        i11 = iM55680 ^ i2;
                        i10 = i;
                    } else {
                        strM56333 = strM56333;
                        map = map;
                        iM55979 = (i8 - C0946.m55979("ۡۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM55979 ^ i9) * 9345) ^ (-1124892090);
                        i4 = -588538256;
                        int i118 = iM55979 ^ i4;
                        map = map;
                        String str9 = strM56333;
                        i11 = i118;
                        i10 = i3;
                        strM56333 = str9;
                    }
                    break;
                case -887133486:
                case 738880562:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    s = f82962[8];
                    int i20 = s + 1;
                    i14 = i20 * i20;
                    if (C1404.f82149 >= 0) {
                        iM559710 = C0946.m55979("ۚܰ") ^ i8;
                        i5 = ((iM559710 ^ i9) * 24197) ^ 1922564548;
                        i6 = -979914816;
                    } else {
                        iM559710 = (C0873.m55680("֡᩶") ^ i9) * 17;
                        i5 = ((iM559710 ^ i8) * 25891) ^ (-2017353383);
                        i6 = 447878008;
                    }
                    int i119 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i119;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -747906219:
                case 106878217:
                    strM56333 = strM56333;
                    map = map;
                    try {
                        interfaceC14100 = interfaceC14100;
                        try {
                            C18794.m42825(RunnableC1014.m56179(C1404.m56466(ApplicationC21448.f67650, C1929.m56558(f82962, 43, 16, i7), C0882.m55717(f82962, 59, 1, i7))));
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                    } catch (NumberFormatException unused3) {
                        interfaceC14100 = interfaceC14100;
                    }
                    iM559710 = C0873.m55680("᩹ۗ") ^ i8;
                    i5 = ((iM559710 ^ i9) * 21789) ^ (-2099452884);
                    i6 = 997422484;
                    int i1110 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i1110;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -733937674:
                case -382831586:
                    break;
                case -707361308:
                case 674692518:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        strM56333 = strM56333;
                        map = map;
                        iM55979 = C0873.m55680("ܽܽ") ^ i9;
                        i3 = ((iM55979 ^ i8) * (-30291)) ^ (-604515792);
                        i4 = 1714907130;
                        int i1111 = iM55979 ^ i4;
                        map = map;
                        String str10 = strM56333;
                        i11 = i1111;
                        i10 = i3;
                        strM56333 = str10;
                    } else {
                        iM55680 = C0873.m55680("۫۫") ^ i9;
                        i = ((iM55680 ^ i8) * 13471) ^ (-1062783008);
                        i2 = 1854622388;
                        i11 = iM55680 ^ i2;
                        i10 = i;
                    }
                    break;
                case -630449369:
                case 1361880773:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    try {
                        f66913 = AbstractC0942.m55969(C1404.m56466(ApplicationC21448.f67650, RunnableC0871.m55667(f82962, 9, 14, i7), C1404.m56462(f82962, 23, 1, i7)));
                        iM559710 = (i8 - C0873.m55680("᩻ܽ")) * 15;
                        i5 = ((iM559710 ^ i9) * 1515) ^ 1138243104;
                        i6 = 2025098947;
                    } catch (NumberFormatException unused4) {
                        iM559710 = (i8 - C0873.m55680("ۛܽ")) * (-31);
                        i5 = ((iM559710 ^ i9) * 16039) ^ 1762850218;
                        i6 = -220928521;
                    }
                    int i1112 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i1112;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -368072032:
                case -353698518:
                    strM56333 = strM56333;
                    map = map;
                    f66916 = C0967.m56071(ApplicationC21448.f67650, ServiceConnectionC1013.m56161(f82962, 140, 26, i7), z2);
                    sharedPreferences2 = ApplicationC21448.f67650;
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩸᩶") ^ i9;
                        i3 = ((iM55979 ^ i8) * (-31111)) ^ (-1743919389);
                        i4 = 754104482;
                    } else {
                        iM55979 = (C0873.m55680("ܿۛ") + i8) * (-31);
                        i3 = ((iM55979 ^ i9) * 12215) ^ (-513288749);
                        i4 = 864498586;
                    }
                    int i1113 = iM55979 ^ i4;
                    map = map;
                    String str11 = strM56333;
                    i11 = i1113;
                    i10 = i3;
                    strM56333 = str11;
                    break;
                case -303491655:
                case 181629046:
                    if (C0967.f81910 < 0) {
                        strM56333 = strM56333;
                        map = map;
                        iM55979 = (C0946.m55979("ܿۗ") ^ i9) * (-119);
                        i3 = ((iM55979 ^ i8) * 20977) ^ 1122204562;
                        i4 = -1629124397;
                        int i1114 = iM55979 ^ i4;
                        map = map;
                        String str12 = strM56333;
                        i11 = i1114;
                        i10 = i3;
                        strM56333 = str12;
                    }
                    strM56333 = strM56333;
                    map = map;
                    iM55979 = (C0873.m55680("᩹᩸") + i8) * (-45);
                    i3 = ((iM55979 ^ i9) * (-2055)) ^ 353421856;
                    i4 = -2053496205;
                    int i1115 = iM55979 ^ i4;
                    map = map;
                    String str13 = strM56333;
                    i11 = i1115;
                    i10 = i3;
                    strM56333 = str13;
                    break;
                case -289774719:
                case 1005303938:
                    length = strArrM55948.length - 1;
                    i13 = length;
                    iM55680 = C0946.m55979("ۖܰ") ^ i9;
                    i = ((iM55680 ^ i8) * 13065) ^ 1984469231;
                    i2 = -170114971;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case -287545425:
                case 1516983090:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    z = true;
                    iM559710 = (i9 - C0873.m55680("ᩳ᩹")) * (-61);
                    i5 = ((iM559710 ^ i8) * (-5957)) ^ (-2115037552);
                    i6 = 8646369;
                    int i1116 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i1116;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case -237932560:
                case 785160686:
                    strM56333 = strM56333;
                    map = map;
                    f66920 = C1053.m56326(ApplicationC21448.f67649, C0894.m55773(f82962, 78, 21, i7), z2);
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("۟۠") ^ i9) * 75;
                        i3 = ((iM55979 ^ i8) * 22743) ^ 404742943;
                        i4 = -871231453;
                    } else {
                        iM55979 = (C0873.m55680("ۗ᩸") + i8) * 75;
                        i3 = ((iM55979 ^ i9) * (-28307)) ^ (-913717399);
                        i4 = 320789535;
                    }
                    int i1117 = iM55979 ^ i4;
                    map = map;
                    String str14 = strM56333;
                    i11 = i1117;
                    i10 = i3;
                    strM56333 = str14;
                    break;
                case -23562167:
                case 1997127266:
                    i12 += 2;
                    iM55680 = (C0946.m55979("ܽۖ") + i8) * 9;
                    i = ((iM55680 ^ i9) * 20317) ^ (-456668904);
                    i2 = -471030339;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case 23602166:
                case 892006777:
                    strM56333 = C1053.m56333(interfaceC14101, C0992.m56102(f82962, Primes.SMALL_FACTOR_LIMIT, 22, i7), null);
                    map = f66918;
                    if (strM56333 != null) {
                        iM55680 = (C0946.m55979("֫᩹") + i9) * (-51);
                        i = ((iM55680 ^ i8) * (-1115)) ^ 633811226;
                        i2 = -1592309134;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩻") ^ i8;
                        i = ((iM55680 ^ i9) * 26013) ^ (-707700441);
                        i2 = -1659191698;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case 54741305:
                case 305078503:
                    strM56333 = strM56333;
                    map = map;
                    f66917 = C1053.m56326(interfaceC14102, C1071.m56336(f82962, 118, 22, i7), z2);
                    if (C1025.f81947 < 0) {
                        iM55979 = C0873.m55680("۫ܶ") ^ i8;
                        i3 = ((iM55979 ^ i9) * 30155) ^ 390568123;
                        i4 = 122399089;
                        int i1118 = iM55979 ^ i4;
                        map = map;
                        String str15 = strM56333;
                        i11 = i1118;
                        i10 = i3;
                        strM56333 = str15;
                    } else {
                        interfaceC14100 = interfaceC14100;
                        iM559710 = C0946.m55979("ۚܰ") ^ i8;
                        i5 = ((iM559710 ^ i9) * 24197) ^ 1922564548;
                        i6 = -979914816;
                        int i1119 = iM559710 ^ i6;
                        strM56333 = strM56333;
                        map = map;
                        i11 = i1119;
                        i10 = i5;
                        interfaceC14100 = interfaceC14100;
                    }
                    break;
                case 125800516:
                case 877019361:
                    strArrM55948 = ViewOnClickListenerC0939.m55948(strM56333, C0955.m56029(f82962, 240, 2, i7));
                    if (strArrM55948.length % 2 == 0) {
                        iM55680 = (i8 - C0873.m55680("᩺ۛ")) * 27;
                        i = ((iM55680 ^ i9) * 21123) ^ 412958608;
                        i2 = -1711422807;
                    } else {
                        iM55680 = (i9 - C0946.m55979("۫᩻")) * (-109);
                        i = ((iM55680 ^ i8) * 19601) ^ (-859143589);
                        i2 = 134325673;
                    }
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case 432973162:
                case 1086898263:
                    i12 = 0;
                    iM55680 = (C0946.m55979("ܽۖ") + i8) * 9;
                    i = ((iM55680 ^ i9) * 20317) ^ (-456668904);
                    i2 = -471030339;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
                case 470027913:
                case 2111141609:
                    strM56333 = strM56333;
                    map = map;
                    z2 = false;
                    z2 = false;
                    f66919 = interfaceC14100.getInt(strM56293, 0);
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i8 - C0946.m55979("ۡۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i3 = ((iM55979 ^ i9) * 9345) ^ (-1124892090);
                        i4 = -588538256;
                    } else {
                        iM55979 = C0946.m55979("ܳۚ") ^ i9;
                        i3 = ((iM55979 ^ i8) * (-127)) ^ 554120001;
                        i4 = 1153815263;
                    }
                    int i11110 = iM55979 ^ i4;
                    map = map;
                    String str16 = strM56333;
                    i11 = i11110;
                    i10 = i3;
                    strM56333 = str16;
                    break;
                case 485475029:
                case 1232250427:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    if (((s * 2) + 1) - i14 > 0) {
                        iM559710 = (i8 - C0946.m55979("ᩳ᩷")) * (-127);
                        i5 = ((iM559710 ^ i9) * (-28281)) ^ 1746051580;
                        i6 = 1657536709;
                    } else {
                        iM559710 = C0946.m55979("۟ۡ") ^ i8;
                        i5 = ((iM559710 ^ i9) * 4423) ^ (-497701145);
                        i6 = 1061332427;
                    }
                    int i11111 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i11111;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case 783657161:
                case 2085385545:
                    i7 = 11270;
                    iM559710 = C0946.m55979("᩷ۤ") ^ i9;
                    i5 = ((iM559710 ^ i8) * 831) ^ 1299648054;
                    i6 = 1540032458;
                    int i11112 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i11112;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case 1180337438:
                case 2145971575:
                    interfaceC14100 = interfaceC14100;
                    strM56333 = strM56333;
                    map = map;
                    f66922 = z ? 1 : 0;
                    iM559710 = (C0873.m55680("᩻᩹") + i9) * (-57);
                    i5 = ((iM559710 ^ i8) * 19387) ^ 1112716898;
                    i6 = 2127614847;
                    int i11113 = iM559710 ^ i6;
                    strM56333 = strM56333;
                    map = map;
                    i11 = i11113;
                    i10 = i5;
                    interfaceC14100 = interfaceC14100;
                    break;
                case 1307371437:
                case 1891358849:
                    strM56333 = strM56333;
                    map = map;
                    f66915 = ApplicationC21448.f67649.mo20199((byte) 5, C1964.m56584(f82962, 233, 3, i7));
                    if (C0861.f81831) {
                        iM55979 = (i9 - C0946.m55979("᩺ۖ")) * (-103);
                        i3 = ((iM55979 ^ i8) * (-5815)) ^ (-1662694099);
                        i4 = -1617929331;
                    } else {
                        iM55979 = (C0873.m55680("᩹᩸") + i8) * (-45);
                        i3 = ((iM55979 ^ i9) * (-2055)) ^ 353421856;
                        i4 = -2053496205;
                    }
                    int i11114 = iM55979 ^ i4;
                    map = map;
                    String str17 = strM56333;
                    i11 = i11114;
                    i10 = i3;
                    strM56333 = str17;
                    break;
                default:
                    try {
                        C0898.m55805(map, strArrM55948[i12], Integer.valueOf(strArrM55948[i12 + 1]));
                        break;
                    } catch (NumberFormatException unused5) {
                    }
                    iM55680 = C0873.m55680("ۤ᩶") ^ i9;
                    i = ((iM55680 ^ i8) * (-14049)) ^ 1524897373;
                    i2 = 1267520371;
                    i11 = iM55680 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee A[PHI: r7 r8 r9 r10 r11 r14 r15
      0x01ee: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r11v4 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x01ee: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:57:0x01ec, B:53:0x01cf, B:49:0x01ab, B:27:0x00d1, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0221 A[PHI: r2 r4
      0x0221: PHI (r2v4 java.util.HashMap) = (r2v2 java.util.HashMap), (r2v3 java.util.HashMap), (r2v2 java.util.HashMap), (r2v2 java.util.HashMap) binds: [B:61:0x021f, B:35:0x0115, B:23:0x00af, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:61:0x021f, B:35:0x0115, B:23:0x00af, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0257 A[PHI: r1 r3 r6 r13 r20
      0x0257: PHI (r1v4 l.۬ۤۡ) = (r1v2 l.۬ۤۡ), (r1v3 l.۬ۤۡ), (r1v2 l.۬ۤۡ) binds: [B:65:0x0255, B:39:0x0137, B:31:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:65:0x0255, B:39:0x0137, B:31:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:65:0x0255, B:39:0x0137, B:31:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r13v3 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v4 short[]) binds: [B:65:0x0255, B:39:0x0137, B:31:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x0255, B:39:0x0137, B:31:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public static void m48056() {
        int iM55979;
        int i;
        int i2;
        int i3 = C0989.f81920;
        int i4 = C1003.f81929;
        int iM559710 = (C0946.m55979("ᩳ֨") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i5 = ((iM559710 ^ i4) * (-28301)) ^ 1283534408;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ 1494616750;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 961266848;
        String strM56203 = null;
        String strM48051 = null;
        HashMap map = null;
        InterfaceC14770 interfaceC14770M55814 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-793)) >> 31));
            switch (i13) {
                case -2120750098:
                case -1589519917:
                    i7 = s * s;
                    i8 = 7562500;
                    if (C0873.m55678()) {
                        iM55979 = (i4 - C0873.m55680("۟ۡ")) * (-113);
                        i = ((iM55979 ^ i3) * (-6967)) ^ (-136528211);
                        i2 = 1896404644;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩵") ^ i3;
                        i = ((iM55979 ^ i4) * (-19721)) ^ 1990346318;
                        i2 = 415379336;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2109490585:
                case 1654926257:
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("ۚۨ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-9333)) ^ (-550819588);
                        i2 = -1033803212;
                    } else {
                        iM55979 = (C0946.m55979("ۚ۫") + i3) * 67;
                        i = ((iM55979 ^ i4) * (-14139)) ^ 836677212;
                        i2 = 1154532086;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2065399779:
                case 859177934:
                    if (C1048.f81963) {
                        iM55979 = (i3 - C0946.m55979("ܽۘ")) * (-7);
                        i = ((iM55979 ^ i4) * (-14999)) ^ (-1968274233);
                        i2 = 2137629130;
                    } else {
                        iM55979 = (C0946.m55979("ۧ۟") + i3) * 5;
                        i = ((iM55979 ^ i4) * (-2907)) ^ 1767508228;
                        i2 = 834685493;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1695286670:
                case 77659751:
                    if (i9 - (s * s2) >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۢ᩵")) * (-115);
                        i = ((iM55979 ^ i4) * 615) ^ 1380621264;
                        i2 = 877747699;
                    } else {
                        iM55979 = (C0946.m55979("ܶۛ") ^ i4) * 23;
                        i = ((iM55979 ^ i3) * (-11445)) ^ 124738868;
                        i2 = 537329623;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1596801060:
                case 955706620:
                    i10 = 50767;
                    iM55979 = C0946.m55979("֡ᩴ") ^ i3;
                    i = ((iM55979 ^ i4) * 6581) ^ (-388010628);
                    i2 = 826416763;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1494205674:
                case -920653479:
                    i11 = 243;
                    i12 = 22;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i4 - C0873.m55680("۟ۡ")) * (-113);
                        i = ((iM55979 ^ i3) * (-6967)) ^ (-136528211);
                        i2 = 1896404644;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ᩳۢ")) * (-29);
                        i = ((iM55979 ^ i4) * (-13767)) ^ 1171818525;
                        i2 = 1401776451;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1217736026:
                case -1176904066:
                    C0992.m56107();
                    iM55979 = (C0946.m55979("ۧ۟") + i3) * 5;
                    i = ((iM55979 ^ i4) * (-2907)) ^ 1767508228;
                    i2 = 834685493;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1000338401:
                case 24766239:
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * 5421) ^ 1139810876;
                        i2 = -973102979;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨ᩺")) * 99;
                        i = ((iM55979 ^ i4) * 24373) ^ 1955071992;
                        i2 = 455229994;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -947879942:
                case 279406448:
                    sArr = f82962;
                    c = 242;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * 5421) ^ 1139810876;
                        i2 = -973102979;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۟᩹")) * (-47);
                        i = ((iM55979 ^ i3) * (-12739)) ^ 903319139;
                        i2 = -918513665;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -683721275:
                case 651197902:
                    map = f66918;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0946.m55979("ۚۨ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-9333)) ^ (-550819588);
                        i2 = -1033803212;
                    } else {
                        iM55979 = C0946.m55979("᩸۠") ^ i4;
                        i = ((iM55979 ^ i3) * 11997) ^ 809212118;
                        i2 = 891732454;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -304083779:
                case 1928329800:
                    i9 = i7 + i8;
                    s2 = 5500;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (i4 - C0873.m55680("۟ۡ")) * (-113);
                        i = ((iM55979 ^ i3) * (-6967)) ^ (-136528211);
                        i2 = 1896404644;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۖۙ")) * (-57);
                        i = ((iM55979 ^ i3) * (-16335)) ^ (-1880080255);
                        i2 = 1468856356;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -126689506:
                case -40567243:
                    C1036.m56257();
                    break;
                case -28022453:
                case 688203782:
                    C0937.m55912(C1025.m56231(interfaceC14770M55814, strM56203, strM48051));
                    break;
                case -6921365:
                case 391946982:
                    strM48051 = m48051(map);
                    sArr2 = f82962;
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("֡֨") ^ i3;
                        i = ((iM55979 ^ i4) * 5421) ^ 1139810876;
                        i2 = -973102979;
                    } else {
                        iM55979 = (C0873.m55680("ۛۡ") ^ i4) * (-123);
                        i = ((iM55979 ^ i3) * (-27669)) ^ (-897760620);
                        i2 = -915524784;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 420155717:
                case 863762870:
                    C0845.m55584();
                    if (C1044.m56286() <= 0) {
                        iM55979 = (C0946.m55979("ۧ۟") + i3) * 5;
                        i = ((iM55979 ^ i4) * (-2907)) ^ 1767508228;
                        i2 = 834685493;
                    } else {
                        iM55979 = (i4 - C0873.m55680("۟ۡ")) * (-113);
                        i = ((iM55979 ^ i3) * (-6967)) ^ (-136528211);
                        i2 = 1896404644;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 631617289:
                case 819842765:
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0946.m55979("ۧ۟") + i3) * 5;
                        i = ((iM55979 ^ i4) * (-2907)) ^ 1767508228;
                        i2 = 834685493;
                    } else {
                        iM55979 = (C0946.m55979("ۚۨ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-9333)) ^ (-550819588);
                        i2 = -1033803212;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 879810562:
                case 1820875086:
                    s = sArr[c];
                    if (C1964.f83032 <= 0) {
                        iM55979 = (i4 - C0873.m55680("۟ۡ")) * (-113);
                        i = ((iM55979 ^ i3) * (-6967)) ^ (-136528211);
                        i2 = 1896404644;
                    } else {
                        iM55979 = (C0873.m55680("᩹֨") + i4) * 47;
                        i = ((iM55979 ^ i3) * 20141) ^ 1867263051;
                        i2 = -174115254;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1182285750:
                case 1760005915:
                    strM56203 = C1024.m56203(sArr2, i11, i12, i10);
                    if (C0906.f81862 >= 0) {
                        iM55979 = (C0946.m55979("ۚۨ") + i4) * 7;
                        i = ((iM55979 ^ i3) * (-9333)) ^ (-550819588);
                        i2 = -1033803212;
                    } else {
                        iM55979 = (C0946.m55979("ܰܺ") + i4) * 87;
                        i = ((iM55979 ^ i3) * 18655) ^ 247908602;
                        i2 = -1634856776;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 33919;
                    iM55979 = C0946.m55979("֡ᩴ") ^ i3;
                    i = ((iM55979 ^ i4) * 6581) ^ (-388010628);
                    i2 = 826416763;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0164 A[PHI: r11
      0x0164: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:46:0x0162, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5 A[PHI: r1 r2 r7 r9 r10 r13 r14
      0x01e5: PHI (r1v4 android.content.res.Resources) = 
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v3 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
     binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r2v4 android.content.res.Resources$Theme) = 
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v3 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
     binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:58:0x01e3, B:50:0x0197, B:35:0x00ee, B:31:0x00c8, B:12:0x005f, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0215 A[PHI: r3 r4 r6
      0x0215: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:62:0x0213, B:27:0x00aa, B:23:0x0089, B:17:0x0069, B:15:0x0065, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:62:0x0213, B:27:0x00aa, B:23:0x0089, B:17:0x0069, B:15:0x0065, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:62:0x0213, B:27:0x00aa, B:23:0x0089, B:17:0x0069, B:15:0x0065, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0241 A[PHI: r19
      0x0241: PHI (r19v4 short[]) = (r19v3 short[]), (r19v6 short[]) binds: [B:15:0x0065, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static Drawable m48053(Context context) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0863.f81833;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55680 = (C0873.m55680("֫ۤ") + i3) * (-5);
        int i5 = ((iM55680 ^ i4) * 22169) ^ (-1242710145);
        Resources.Theme theme = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 1307987343;
        Resources resources = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -2091444644;
        String strM55592 = null;
        int iM559710 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 14991) >> 31));
            switch (i12) {
                case -2090474099:
                case 2040640544:
                    iM559710 = 2121512578 ^ C0946.m55979(strM55592);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                        i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                        i2 = 254470701;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * 22393) ^ 663254967;
                        i2 = -360080261;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1995441149:
                case 1080089125:
                    resources = context.getResources();
                    theme = context.getTheme();
                    sArr2 = f82962;
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    } else {
                        iM55979 = C0873.m55680("֫ᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 5405) ^ 48477650;
                        i2 = 880492981;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1816078838:
                case -739952354:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0873.m55680("ܿ᩵") + i4) * (-95);
                        i = ((iM55979 ^ i3) * 8779) ^ 109497731;
                        i2 = 1642211792;
                    } else {
                        iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                        i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                        i2 = 254470701;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1563532406:
                case 1296474989:
                    C0882.m55710();
                    return null;
                case -1419127729:
                case 1796788236:
                    i8 = i7 * i7;
                    s2 = 2;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    } else {
                        iM55979 = C0873.m55680("ۛܶ") ^ i3;
                        i = ((iM55979 ^ i4) * (-12521)) ^ 404294611;
                        i2 = 1006372204;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1391658685:
                case 1684480344:
                    strM55592 = C0845.m55592(sArr2, i11, 3, i10);
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                        i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                        i2 = 254470701;
                    } else {
                        iM55979 = C0946.m55979("ܳۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 31495) ^ (-1113397138);
                        i2 = 1632244021;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1244834372:
                case 606051834:
                    s = sArr[c];
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    } else {
                        iM55979 = C0873.m55680("ۢ᩻") ^ i4;
                        i = ((iM55979 ^ i3) * 12033) ^ 28286099;
                        i2 = -1129370494;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1167038270:
                case 1528634194:
                    i10 = 8016;
                    iM55979 = (C0946.m55979("۬ۨ") + i3) * (-47);
                    i = ((iM55979 ^ i4) * 19043) ^ (-1679826831);
                    i2 = 751227688;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -812996143:
                case -643800123:
                    if (C1964.f83032 > 0) {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۤۜ")) * 37;
                        i = ((iM55979 ^ i3) * 13737) ^ 809273432;
                        i2 = 1581919931;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -768139947:
                case -337651147:
                    c = 4;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                        i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                        i2 = 254470701;
                    } else {
                        iM55979 = (C0946.m55979("᩺ۢ") + i3) * 51;
                        i = ((iM55979 ^ i4) * 20121) ^ 1845793445;
                        i2 = 1112436247;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -661881108:
                case 654476998:
                    i11 = 5;
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("ܰ᩶") ^ i4;
                        i = ((iM55979 ^ i3) * (-3163)) ^ 793942888;
                        i2 = 1107031413;
                    } else {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -472974376:
                case 1853659030:
                    C0917.m55854();
                    RunnableC1014.m56177();
                    iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                    i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                    i2 = 254470701;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -191619292:
                case 733693764:
                    i10 = 59496;
                    iM55979 = (C0946.m55979("۬ۨ") + i3) * (-47);
                    i = ((iM55979 ^ i4) * 19043) ^ (-1679826831);
                    i2 = 751227688;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 108955499:
                case 581277653:
                    return C1059.m14961(resources, C22553.m50542(theme, iM559710), theme);
                case 588750294:
                case 1183098147:
                    i9 = s * s2;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (i4 - C0873.m55680("ۤۜ")) * 37;
                        i = ((iM55979 ^ i3) * 13737) ^ 809273432;
                        i2 = 1581919931;
                    } else {
                        iM55979 = C0946.m55979("ۘ֨") ^ i4;
                        i = ((iM55979 ^ i3) * 25915) ^ 175241621;
                        i2 = -913765436;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 629024612:
                case 1436017130:
                    if ((i9 + 1) - i8 > 0) {
                        iM55979 = (C0946.m55979("᩶֨") + i3) * (-75);
                        i = ((iM55979 ^ i4) * 25471) ^ (-639602015);
                        i2 = -1717951605;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۨۤ")) * (-51);
                        i = ((iM55979 ^ i3) * 5237) ^ 2078406713;
                        i2 = 1890994214;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 991504762:
                case 1643951459:
                    C0927.m55873();
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("᩷ۘ") ^ i3) * (-59);
                        i = ((iM55979 ^ i4) * 28559) ^ (-534893001);
                        i2 = 254470701;
                    } else {
                        iM55979 = C0946.m55979("ᩳ۬") ^ i3;
                        i = ((iM55979 ^ i4) * 7069) ^ 1259017244;
                        i2 = -888323898;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1347958315:
                case 2036701968:
                    i7 = s + 1;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۘۜ") ^ i3;
                        i = ((iM55979 ^ i4) * (-1235)) ^ 1290878597;
                        i2 = -1051984960;
                    } else {
                        iM55979 = C0946.m55979("֨ۢ") ^ i3;
                        i = ((iM55979 ^ i4) * 21473) ^ 1623561896;
                        i2 = 1945314615;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f82962;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("ܿ᩵") + i4) * (-95);
                        i = ((iM55979 ^ i3) * 8779) ^ 109497731;
                        i2 = 1642211792;
                    } else {
                        iM55979 = C0946.m55979("۠ܰ") ^ i4;
                        i = ((iM55979 ^ i3) * 10437) ^ 1939477509;
                        i2 = 1052783733;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[PHI: r3 r4
      0x0119: PHI (r3v4 java.lang.Object) = (r3v3 java.lang.Object), (r3v2 java.lang.Object), (r3v2 java.lang.Object), (r3v2 java.lang.Object) binds: [B:41:0x0117, B:33:0x00d5, B:19:0x0075, B:16:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:41:0x0117, B:33:0x00d5, B:19:0x0075, B:16:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static String m48051(HashMap map) {
        int iM55680;
        int i;
        Iterator itM56139 = null;
        Map.Entry entry = null;
        Object key = null;
        char c = 0;
        Object value = null;
        int iM56261 = 0;
        int i2 = 0;
        int i3 = -127806248;
        int i4 = C0894.f81854;
        int i5 = C1028.f81950;
        int iM55979 = (i5 - C0946.m55979("ۧᩴ")) * 17;
        int i6 = ((iM55979 ^ i4) * 22051) ^ (-1727816720);
        int i7 = 967522866;
        while (true) {
            int i8 = iM55979 ^ i7;
            StringBuilder sb = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-1747)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2002564781:
                    case 1680569957:
                        value = entry.getValue();
                        if (RunnableC1014.f81941 > 0) {
                            iM55680 = C0946.m55979("᩹ᩴ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-305)) ^ 1706414910;
                            i = 1071802247;
                            i8 = iM55680 ^ i;
                        } else {
                            iM55979 = C0946.m55979("ۢᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-27653)) ^ 179340147;
                            i7 = -465389061;
                        }
                        break;
                    case -1821578775:
                    case -302586422:
                        if (C1017.f81942 < 0) {
                            if (C0866.f81837 < 0) {
                                if (RunnableC0938.f81886 < 0) {
                                    sb = new StringBuilder();
                                    if (!C0955.m56025()) {
                                        iM55680 = C0873.m55680("ۚ۬") ^ i4;
                                        i6 = ((iM55680 ^ i5) * 931) ^ 705964375;
                                        i = -1507373637;
                                        i8 = iM55680 ^ i;
                                        break;
                                    }
                                }
                            }
                            iM55979 = C0946.m55979("ۢᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-27653)) ^ 179340147;
                            i7 = -465389061;
                            break;
                        }
                        iM55979 = C0946.m55979("᩶ᩳ") ^ i4;
                        i6 = ((iM55979 ^ i5) * (-12381)) ^ (-698613396);
                        i7 = -1252977213;
                        break;
                    case -1797909294:
                    case -1298584075:
                        C0898.m55794(sb, value);
                        C0946.m55977(sb, c);
                        iM55680 = C0946.m55979("᩶ۖ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 13287) ^ (-224300821);
                        i = -939138038;
                        i8 = iM55680 ^ i;
                        break;
                    case -1676826965:
                    case -906689404:
                        C0912.m55825(sb, (String) key);
                        if (C1028.m56247() < 0) {
                            iM55680 = (i5 - C0873.m55680("ۜܰ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM55680 ^ i4) * (-21181)) ^ (-157456316);
                            i = 1590989642;
                            i8 = iM55680 ^ i;
                        } else {
                            iM55979 = C0946.m55979("᩶ᩳ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-12381)) ^ (-698613396);
                            i7 = -1252977213;
                        }
                        break;
                    case -1589395952:
                    case -1361078321:
                        if (C0930.m55886(itM56139)) {
                            iM55680 = C0873.m55680("ۚۘ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 10875) ^ (-1777941028);
                            i = -1282184489;
                        } else {
                            iM55680 = C0946.m55979("۟᩹") ^ i5;
                            i6 = ((iM55680 ^ i4) * 2141) ^ (-1708590875);
                            i = -1605038226;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1552242068:
                    case 547972710:
                        C0866.m55645();
                        iM55680 = (i5 - C0946.m55979("֡۬")) * (-113);
                        i6 = ((iM55680 ^ i4) * 9) ^ 1538975119;
                        i = -1200245548;
                        i8 = iM55680 ^ i;
                        break;
                    case -1447279942:
                    case 571692018:
                        C1028.m56247();
                        C0854.m55595();
                        return null;
                    case -1407909168:
                    case 1565583078:
                        sb.setLength(iM56261 + i2);
                        iM55680 = (C0873.m55680("ۡۜ") + i5) * (-5);
                        i6 = ((iM55680 ^ i4) * (-22445)) ^ 2115443398;
                        i = -1549259359;
                        i8 = iM55680 ^ i;
                        break;
                    case -963860239:
                    case -93605046:
                        if (C0854.m55607(sb) > 0) {
                            iM55680 = C0946.m55979("᩻᩸") ^ i5;
                            i6 = ((iM55680 ^ i4) * 26999) ^ 1794426618;
                            i = 141688587;
                        } else {
                            iM55680 = (C0873.m55680("ۡۜ") + i5) * (-5);
                            i6 = ((iM55680 ^ i4) * (-22445)) ^ 2115443398;
                            i = -1549259359;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -335677368:
                    case 942300695:
                        if (C1012.f81938 < 0) {
                            iM55979 = C0946.m55979("ۢᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-27653)) ^ 179340147;
                            i7 = -465389061;
                        }
                        iM55680 = C0946.m55979("᩸᩸") ^ i4;
                        i6 = ((iM55680 ^ i5) * 2305) ^ 510337670;
                        i = -1378735089;
                        i8 = iM55680 ^ i;
                        break;
                    case -303295603:
                    case 727683968:
                        itM56139 = C1012.m56139(map.entrySet());
                        iM55680 = C0946.m55979("᩶ۖ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 13287) ^ (-224300821);
                        i = -939138038;
                        i8 = iM55680 ^ i;
                        break;
                    case -14141842:
                    case 1856764083:
                        iM56261 = C1036.m56261(sb);
                        i2 = -1;
                        if (RunnableC0938.f81886 < 0) {
                            iM55680 = C0946.m55979("᩹֡") ^ i4;
                            i6 = ((iM55680 ^ i5) * 23207) ^ 609414378;
                            i = 560872945;
                            i8 = iM55680 ^ i;
                        } else {
                            iM55979 = C0946.m55979("᩶ᩳ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-12381)) ^ (-698613396);
                            i7 = -1252977213;
                        }
                        break;
                    case 296872666:
                    case 1055634560:
                        entry = (Map.Entry) C0955.m56035(itM56139);
                        if (!C1048.f81963) {
                            iM55979 = C0946.m55979("ۢᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-27653)) ^ 179340147;
                            i7 = -465389061;
                        } else {
                            iM55680 = C0873.m55680("۟ܺ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-8259)) ^ 1813461527;
                            i = 515628442;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case 906661448:
                    case 2019707204:
                        key = entry.getKey();
                        if (C0906.f81862 >= 0) {
                            iM55680 = (i5 - C0946.m55979("֡۬")) * (-113);
                            i6 = ((iM55680 ^ i4) * 9) ^ 1538975119;
                            i = -1200245548;
                        } else {
                            iM55680 = C0873.m55680("ۜ᩸") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-9747)) ^ (-785961601);
                            i = 292900062;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 989535789:
                    case 1207568046:
                        RunnableC0897.m55784();
                        if (C1024.f81946) {
                            iM55680 = (i5 - C0946.m55979("֡۬")) * (-113);
                            i6 = ((iM55680 ^ i4) * 9) ^ 1538975119;
                            i = -1200245548;
                        } else {
                            iM55680 = C0946.m55979("᩸᩸") ^ i4;
                            i6 = ((iM55680 ^ i5) * 2305) ^ 510337670;
                            i = -1378735089;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 1456667673:
                    case 1765430080:
                        C0873.m55678();
                        if (C1046.f81962 > 0) {
                            iM55680 = C0946.m55979("᩸᩸") ^ i4;
                            i6 = ((iM55680 ^ i5) * 2305) ^ 510337670;
                            i = -1378735089;
                        } else {
                            iM55680 = (C0946.m55979("֫ۤ") ^ i5) * 53;
                            i6 = ((iM55680 ^ i4) * 5085) ^ (-1642851438);
                            i = 1910157697;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case 1581075343:
                    case 1794008015:
                        c = '\\';
                        C0873.m55681(sb, '\\');
                        if (C0992.f81922 >= 0) {
                            iM55680 = (i5 - C0946.m55979("֡۬")) * (-113);
                            i6 = ((iM55680 ^ i4) * 9) ^ 1538975119;
                            i = -1200245548;
                        } else {
                            iM55680 = C0946.m55979("ܺ᩸") ^ i4;
                            i6 = ((iM55680 ^ i5) * 7741) ^ (-174125156);
                            i = -380401294;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    default:
                        return C0863.m55639(sb);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48052(View view) {
        view.setBackground(m48049(RunnableC1014.m56169(view)));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48055(View view) {
        AbstractC0942.m55963(view);
        view.setBackground(m48050());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d A[PHI: r1 r2 r3 r4
      0x011d: PHI (r1v4 android.content.res.Resources) = (r1v3 android.content.res.Resources), (r1v2 android.content.res.Resources), (r1v2 android.content.res.Resources) binds: [B:37:0x011b, B:24:0x00a7, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r2v4 android.content.res.Resources$Theme) = 
      (r2v3 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
     binds: [B:37:0x011b, B:24:0x00a7, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r3v5 int) = (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:37:0x011b, B:24:0x00a7, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:37:0x011b, B:24:0x00a7, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0 A[PHI: r10 r12
      0x01a0: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:48:0x019e, B:33:0x00f8, B:18:0x0084, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:48:0x019e, B:33:0x00f8, B:18:0x0084, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f4 A[PHI: r7 r8
      0x01f4: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:56:0x01f2, B:12:0x0062, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01f2, B:12:0x0062, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0240 A[PHI: r6 r9 r13 r18
      0x0240: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:64:0x023e, B:60:0x0223, B:52:0x01d2, B:29:0x00d9, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:64:0x023e, B:60:0x0223, B:52:0x01d2, B:29:0x00d9, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:64:0x023e, B:60:0x0223, B:52:0x01d2, B:29:0x00d9, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x023e, B:60:0x0223, B:52:0x01d2, B:29:0x00d9, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static Drawable m48049(Context context) {
        int iM55979;
        int i;
        int i2;
        int i3 = C0930.f81879;
        int i4 = C1071.f81975;
        int iM559710 = (i4 - C0946.m55979("ܽۗ")) * 43;
        int i5 = ((iM559710 ^ i3) * 8843) ^ (-1488316044);
        Resources.Theme theme = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ (-772616865);
        Resources resources = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -648037738;
        String strM56336 = null;
        int iM559711 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * (-13695)) >> 31));
            switch (i10) {
                case -2140113689:
                case 246194079:
                    i8 = 6414;
                    iM55979 = C0873.m55680("ܽ᩵") ^ i4;
                    i = ((iM55979 ^ i3) * (-11055)) ^ (-713899047);
                    i2 = 247360871;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2117385983:
                case 1145394201:
                    int i11 = s + s2;
                    i7 = i11 * i11;
                    if (C0890.m55740()) {
                        iM55979 = (C0873.m55680("֫᩵") + i4) * (-43);
                        i = ((iM55979 ^ i3) * (-4813)) ^ 1577695051;
                        i2 = -1527185565;
                    } else {
                        iM55979 = C0873.m55680("ܿۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 2611) ^ 1466616847;
                        i2 = -641831295;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2073188888:
                case 671435135:
                    resources = context.getResources();
                    theme = context.getTheme();
                    if (RunnableC0897.f81856) {
                        iM55979 = (i4 - C0873.m55680("ܰܽ")) * C0254q.f1218h;
                        i = ((iM55979 ^ i3) * 20459) ^ 955981732;
                        i2 = -1654350707;
                    } else {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 31983) ^ 1255219432;
                        i2 = 974450618;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2034510363:
                case 1922417245:
                    i8 = 23206;
                    iM55979 = C0873.m55680("ܽ᩵") ^ i4;
                    i = ((iM55979 ^ i3) * (-11055)) ^ (-713899047);
                    i2 = 247360871;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1822592964:
                case -425344245:
                    iM559711 = 2129931923 ^ C0946.m55979(strM56336);
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 31983) ^ 1255219432;
                        i2 = 974450618;
                    } else {
                        iM55979 = C0946.m55979("ᩳܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 22989) ^ 1375762259;
                        i2 = -150316401;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1732600810:
                case -625516591:
                    s3 = 72296;
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ܶۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-21561)) ^ 1189477384;
                        i2 = 2134656211;
                    } else {
                        iM55979 = C0946.m55979("ܰ۠") ^ i3;
                        i = ((iM55979 ^ i4) * 30631) ^ 888065083;
                        i2 = 423725051;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1322025403:
                case 721696408:
                    if (C0917.m55854()) {
                        iM55979 = C0946.m55979("ܶۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-21561)) ^ 1189477384;
                        i2 = 2134656211;
                    } else {
                        iM55979 = (C0873.m55680("֡᩷") ^ i3) * (-121);
                        i = ((iM55979 ^ i4) * 20729) ^ 748840115;
                        i2 = -376865960;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -915824063:
                case 1206387448:
                    s = sArr[c];
                    s2 = 18074;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0873.m55680("ۖ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * 11321) ^ (-1723538274);
                        i2 = 1105562600;
                    } else {
                        iM55979 = (C0946.m55979("᩹ᩳ") ^ i3) * 93;
                        i = ((iM55979 ^ i4) * (-24607)) ^ (-1651658524);
                        i2 = 2061257405;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -873059881:
                case 1257887660:
                    i9 = 1;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ܿۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 2611) ^ 1466616847;
                        i2 = -641831295;
                    } else {
                        iM55979 = (C0946.m55979("ܿ֡") ^ i4) * (-13);
                        i = ((iM55979 ^ i3) * (-2581)) ^ 651539819;
                        i2 = 1988047363;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -700708620:
                case -560364797:
                    c = 0;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ܿۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 2611) ^ 1466616847;
                        i2 = -641831295;
                    } else {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i4;
                        i = ((iM55979 ^ i3) * (-9745)) ^ 725599899;
                        i2 = 1632691952;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -642514854:
                case -589142312:
                    return C1059.m14961(resources, C22553.m50542(theme, iM559711), theme);
                case -150738689:
                case 2027044138:
                    C0989.m56095();
                    if (C0930.f81879 <= 0) {
                        iM55979 = (C0873.m55680("֡᩷") ^ i3) * (-121);
                        i = ((iM55979 ^ i4) * 20729) ^ 748840115;
                        i2 = -376865960;
                    } else {
                        iM55979 = (C0873.m55680("ۖ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * 11321) ^ (-1723538274);
                        i2 = 1105562600;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 30565464:
                case 1482191659:
                    C0946.m55980();
                    C0861.m55626();
                    iM55979 = C0946.m55979("ܶۨ") ^ i4;
                    i = ((iM55979 ^ i3) * (-21561)) ^ 1189477384;
                    i2 = 2134656211;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 481036881:
                case 2136557994:
                    if (C1194.f82045 == 0) {
                        iM55979 = (C0873.m55680("ۖ֫") + i4) * (-7);
                        i = ((iM55979 ^ i3) * 11321) ^ (-1723538274);
                        i2 = 1105562600;
                    } else {
                        iM55979 = C0873.m55680("ܿۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 2611) ^ 1466616847;
                        i2 = -641831295;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 831189589:
                case 1949299690:
                    sArr2 = f82962;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ܶۨ") ^ i4;
                        i = ((iM55979 ^ i3) * (-21561)) ^ 1189477384;
                        i2 = 2134656211;
                    } else {
                        iM55979 = C0873.m55680("۟ۘ") ^ i3;
                        i = ((iM55979 ^ i4) * (-23753)) ^ (-407166430);
                        i2 = 1682206083;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 858495212:
                case 939262909:
                    if ((s * s3) - i7 <= 0) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i4;
                        i = ((iM55979 ^ i3) * (-3205)) ^ 473384758;
                        i2 = 672430819;
                    } else {
                        iM55979 = (C0946.m55979("֨ۛ") + i3) * (-107);
                        i = ((iM55979 ^ i4) * (-30567)) ^ (-1498552595);
                        i2 = -265276616;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1042894773:
                case 1502051425:
                    C1012.m56134();
                    C0861.m55626();
                    return null;
                case 1351966429:
                case 1741310805:
                    sArr = f82962;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ܿۧ") ^ i3;
                        i = ((iM55979 ^ i4) * 2611) ^ 1466616847;
                        i2 = -641831295;
                    } else {
                        iM55979 = (C0946.m55979("ܶۖ") ^ i3) * 9;
                        i = ((iM55979 ^ i4) * (-15825)) ^ 1984160109;
                        i2 = 1922419890;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM56336 = C1071.m56336(sArr2, i9, 3, i8);
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0946.m55979("᩶ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * 31983) ^ 1255219432;
                        i2 = 974450618;
                    } else {
                        iM55979 = (C0946.m55979("ۙۖ") ^ i3) * 31;
                        i = ((iM55979 ^ i4) * (-25913)) ^ 1644585348;
                        i2 = 1314677118;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[PHI: r9
      0x0094: PHI (r9v7 int[]) = (r9v5 int[]), (r9v2 int[]), (r9v2 int[]), (r9v2 int[]) binds: [B:24:0x0092, B:15:0x0049, B:10:0x003b, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9 A[PHI: r7 r8
      0x00c9: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:28:0x00c7, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r8v4 int[]) = (r8v3 int[]), (r8v2 int[]) binds: [B:28:0x00c7, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static StateListDrawable m48050() {
        int iM55680;
        int i;
        int iM55681;
        int i2;
        StateListDrawable stateListDrawable = null;
        ColorDrawable colorDrawable = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = null;
        int[] iArr2 = null;
        int i7 = -29515376;
        int i8 = RunnableC0938.f81886;
        int i9 = C1044.f81959;
        int iM55979 = C0946.m55979("۠᩺") ^ i9;
        int i10 = ((iM55979 ^ i8) * 1299) ^ (-1302888368);
        int i11 = iM55979 ^ 243660316;
        TransitionDrawable transitionDrawable = null;
        while (true) {
            ColorDrawable colorDrawable2 = null;
            while (true) {
                i7 = ((((i7 ^ i8) * 32545) >> 31) & i10) ^ i11;
                switch (i7) {
                    case -2032269218:
                    case -1244132682:
                        stateListDrawable = new StateListDrawable();
                        int i12 = C23223.f72995;
                        if (!C0912.m55833()) {
                            colorDrawable2 = new ColorDrawable(i12 & 553648127);
                            if (C1929.f83011 == 0) {
                                iM55680 = C0873.m55680("ܿ֫") ^ i9;
                                i10 = ((iM55680 ^ i8) * 31769) ^ (-1020486218);
                                i = -922895738;
                                i11 = iM55680 ^ i;
                            } else {
                                iM55681 = C0873.m55680("ܺ᩵") ^ i8;
                                i10 = 1964974488 ^ ((iM55681 ^ i9) * (-3487));
                                i2 = -1085295372;
                                i11 = i2 ^ iM55681;
                                transitionDrawable = null;
                            }
                        }
                        break;
                    case -1836555248:
                    case 511145959:
                        stateListDrawable.addState(iArr, new ColorDrawable(i3));
                        int[] iArr3 = {i4, i5};
                        if (!C0861.f81831) {
                            iM55681 = C0873.m55680("ܺ᩵") ^ i8;
                            i10 = 1964974488 ^ ((iM55681 ^ i9) * (-3487));
                            i2 = -1085295372;
                            i11 = i2 ^ iM55681;
                            transitionDrawable = null;
                        } else {
                            stateListDrawable.addState(iArr3, new ColorDrawable(i3));
                            stateListDrawable.addState(new int[]{i4, i6}, transitionDrawable);
                            iArr2 = new int[]{-16842908, i6};
                            if (C1017.f81942 >= 0) {
                                iM55680 = C0873.m55680("֨֫") ^ i9;
                                i10 = ((iM55680 ^ i8) * (-15623)) ^ (-1478952573);
                                i = 1099620304;
                            } else {
                                iM55680 = C0873.m55680("ᩳۧ") ^ i8;
                                i10 = ((iM55680 ^ i9) * (-26251)) ^ (-255492646);
                                i = 2113282852;
                            }
                            i11 = iM55680 ^ i;
                        }
                        break;
                    case -1284701778:
                    case -882820145:
                        C1404.m56468();
                        if (RunnableC0871.m55672() >= 0) {
                        }
                        iM55681 = C0873.m55680("ܺ᩵") ^ i8;
                        i10 = 1964974488 ^ ((iM55681 ^ i9) * (-3487));
                        i2 = -1085295372;
                        i11 = i2 ^ iM55681;
                        transitionDrawable = null;
                        break;
                    case -909018357:
                    case 946187745:
                        C1028.m56247();
                        C0937.m55918();
                        return null;
                    case -334051622:
                    case 1064890462:
                        stateListDrawable.addState(iArr2, transitionDrawable);
                        stateListDrawable.addState(new int[]{i4}, transitionDrawable);
                        stateListDrawable.setExitFadeDuration(300);
                        return stateListDrawable;
                    case -9001706:
                    case 1212756011:
                        C0894.m55769();
                        C0854.m55595();
                        iM55680 = C0873.m55680("֨֫") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-15623)) ^ (-1478952573);
                        i = 1099620304;
                        i11 = iM55680 ^ i;
                        break;
                    case 776805192:
                    case 1090813213:
                        C0927.m55873();
                        if (C0989.f81920 < 0) {
                            iM55680 = C0873.m55680("֨֫") ^ i9;
                            i10 = ((iM55680 ^ i8) * (-15623)) ^ (-1478952573);
                            i = 1099620304;
                        } else {
                            iM55680 = (C0873.m55680("ۙۖ") ^ i8) * 95;
                            i10 = ((iM55680 ^ i9) * (-20633)) ^ (-1346234538);
                            i = -396383322;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case 853745977:
                    case 1386316545:
                        i6 = R.attr.state_pressed;
                        iArr = new int[]{i4, i5, R.attr.state_pressed};
                        if (C1046.f81962 <= 0) {
                            iM55680 = (C0873.m55680("ۙۖ") ^ i8) * 95;
                            i10 = ((iM55680 ^ i9) * (-20633)) ^ (-1346234538);
                            i = -396383322;
                        } else {
                            iM55680 = (C0873.m55680("ᩴ᩺") ^ i8) * (-117);
                            i10 = ((iM55680 ^ i9) * 15733) ^ (-1777184485);
                            i = 1244273539;
                        }
                        i11 = iM55680 ^ i;
                        break;
                    case 892523050:
                    case 1084640530:
                        colorDrawable = new ColorDrawable(C23223.f72995 & 989855743);
                        if (RunnableC0871.m55672() < 0) {
                            iM55680 = C0873.m55680("ۘ᩷") ^ i8;
                            i10 = ((iM55680 ^ i9) * 25993) ^ 1306566340;
                            i = -721628894;
                            i11 = iM55680 ^ i;
                        } else {
                            iM55681 = (C0873.m55680("֡ᩳ") + i9) * 3;
                            i10 = (-1288740703) ^ ((iM55681 ^ i8) * (-18591));
                            i2 = -1218540778;
                            i11 = i2 ^ iM55681;
                            transitionDrawable = null;
                        }
                        break;
                    case 1159717015:
                    case 1621828870:
                        Drawable[] drawableArr = new Drawable[2];
                        if (ServiceConnectionC1013.f81940 < 0) {
                            drawableArr[0] = colorDrawable2;
                            if (ViewOnClickListenerC0939.m55941() < 0) {
                                drawableArr[1] = colorDrawable;
                                transitionDrawable = new TransitionDrawable(drawableArr);
                                int[] iArr4 = {-16842909};
                                if (C1024.m56209() < 0) {
                                    stateListDrawable.addState(iArr4, new ColorDrawable(0));
                                    i4 = R.attr.state_focused;
                                    i5 = -16842910;
                                    if (C1229.f82066 < 0) {
                                        int iM559710 = C0946.m55979("᩹ۖ") ^ i9;
                                        i10 = ((iM559710 ^ i8) * (-19503)) ^ 433443975;
                                        i11 = iM559710 ^ (-1162146916);
                                        i3 = 0;
                                    }
                                }
                                break;
                            }
                            i3 = 0;
                            iM55681 = (C0873.m55680("֡ᩳ") + i9) * 3;
                            i10 = (-1288740703) ^ ((iM55681 ^ i8) * (-18591));
                            i2 = -1218540778;
                            i11 = i2 ^ iM55681;
                            transitionDrawable = null;
                            break;
                        }
                        i3 = 0;
                        iM55681 = C0873.m55680("ܺ᩵") ^ i8;
                        i10 = 1964974488 ^ ((iM55681 ^ i9) * (-3487));
                        i2 = -1085295372;
                        i11 = i2 ^ iM55681;
                        transitionDrawable = null;
                        break;
                    default:
                        if (C0912.m55833()) {
                        }
                        iM55680 = C0873.m55680("֨֫") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-15623)) ^ (-1478952573);
                        i = 1099620304;
                        i11 = iM55680 ^ i;
                        break;
                }
            }
            int iM559711 = (C0946.m55979("᩵۟") + i9) * (-87);
            i10 = ((iM559711 ^ i8) * 19393) ^ (-987197659);
            i11 = iM559711 ^ (-272961767);
        }
    }
}
