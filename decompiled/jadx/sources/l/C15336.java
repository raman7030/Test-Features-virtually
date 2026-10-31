package l;

import com.umeng.analytics.pro.am;
import java.lang.reflect.Method;
import org.lsposed.lsplant.Hooker;

/* JADX INFO: renamed from: l.ܶܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAK5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15336 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f47000 = "";

    /* JADX INFO: renamed from: ۘܶۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f47001 = {3210, 1370, 1368, 1353, 1406, 1361, 1372, 1358, 1358, 1395, 1372, 1360, 1368, 1370, 1368, 1353, 1392, 1368, 1353, 1365, 1362, 1369, 1395, 1372, 1360, 1368};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f47002 = "";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f47003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static synchronized void m36369() {
        m36370();
        m36366("aa", "bb");
        StackTraceElement stackTraceElement = new StackTraceElement(am.av, "b", am.aF, 0);
        if (!"aa".equals(stackTraceElement.getClassName()) || !"bb".equals(stackTraceElement.getMethodName())) {
            throw new IllegalStateException("JavaHook probe failed");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m36370() {
        if (f47003) {
            return;
        }
        m36368();
        f47003 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m36368() throws NoSuchMethodException {
        int iM2566;
        int i;
        int i2;
        short s;
        Class<StackTraceElement> cls;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        Class<StackTraceElement> cls2;
        int i7 = C22628.f73083;
        int i8 = C0630.f2410;
        int iM6982 = C2105.m6981("ۚ֫") ^ i7;
        int i9 = ((iM6982 ^ i8) * (-28371)) ^ (-2025436593);
        String strM3396 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM6982 ^ (-89355115);
        int i11 = 0;
        C1226 c1226 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1605933868;
        int i18 = 0;
        short s2 = 0;
        Method declaredMethod = null;
        Class<?>[] clsArr = null;
        String strM5726 = null;
        Class<StackTraceElement> cls3 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-30261)) >> 31));
            switch (i17) {
                case -1980073608:
                case -100839167:
                    if (!C2272.f7362) {
                        cls = cls3;
                        iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    } else {
                        iM2566 = C0630.m2566("ۤۛ") ^ i8;
                        i = ((iM2566 ^ i7) * (-30879)) ^ 2133009621;
                        i2 = 1594808581;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1660289585:
                case 1788081526:
                    i13 = i12 + i12;
                    s = s2;
                    i14 = s + 1211;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        cls = cls3;
                        iM6981 = C0630.m2566("᩹֡") ^ i8;
                        i5 = ((iM6981 ^ i7) * 32435) ^ 1139481870;
                        i6 = -1921166670;
                        int i19 = iM6981 ^ i6;
                        s2 = s;
                        i9 = i5;
                        cls2 = cls;
                        i10 = i19;
                        cls3 = cls2;
                    } else {
                        int iM6983 = (C2105.m6981("ܿۤ") ^ i7) * (-69);
                        s2 = s;
                        i9 = ((iM6983 ^ i8) * (-30263)) ^ 182183325;
                        cls3 = cls3;
                        i10 = iM6983 ^ (-261208326);
                    }
                    break;
                case -1601508237:
                case 96397876:
                    C2272.m7503();
                    C4117.m12364();
                    cls = cls3;
                    iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                    i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                    i4 = -608643653;
                    cls2 = cls;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    cls3 = cls2;
                    break;
                case -1505652833:
                case -840077253:
                    strM5726 = C1711.m5726(sArr, i16, 12, i15);
                    if (!C1005.f3721) {
                        int iM6984 = (C2105.m6981("ۛ֫") + i8) * (-95);
                        i10 = iM6984 ^ (-1274767845);
                        i9 = ((iM6984 ^ i7) * (-275)) ^ 1915381195;
                        c1226 = null;
                    } else {
                        iM2566 = C2105.m6981("ܺ۫") ^ i7;
                        i = ((iM2566 ^ i8) * 17621) ^ (-1362744353);
                        i2 = 1838348653;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1451129511:
                case 1030848839:
                    if (!C3683.m11222()) {
                        int iM6985 = (C2105.m6981("ۛ֫") + i8) * (-95);
                        i10 = iM6985 ^ (-1274767845);
                        i9 = ((iM6985 ^ i7) * (-275)) ^ 1915381195;
                        c1226 = null;
                    } else {
                        cls = cls3;
                        iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -1400365776:
                case -213231099:
                    i15 = 1341;
                    iM2566 = C2105.m6981("ۘܶ") ^ i8;
                    i = ((iM2566 ^ i7) * (-3975)) ^ (-1854055022);
                    i2 = -1152066602;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -1393712057:
                case 764163734:
                    Hooker.m52897(declaredMethod, c1226);
                    sArr2 = f47001;
                    i11 = 13;
                    if (C2520.f8000 < 0) {
                        iM2566 = (C2105.m6981("ۜۘ") + i8) * (-51);
                        i = ((iM2566 ^ i7) * 705) ^ 1555066967;
                        i2 = 445393733;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        cls = cls3;
                        iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -1135642653:
                case 1792833734:
                    cls = cls3;
                    s = s2;
                    i12 = i18 + 1466521;
                    if (C2105.f7037 == 0) {
                        iM6981 = (C2105.m6981("᩸ۡ") + i7) * (-109);
                        i5 = ((iM6981 ^ i8) * 18827) ^ 1733472783;
                        i6 = 1717973202;
                        int i110 = iM6981 ^ i6;
                        s2 = s;
                        i9 = i5;
                        cls2 = cls;
                        i10 = i110;
                        cls3 = cls2;
                    } else {
                        cls3 = cls;
                        int iM6986 = (C2105.m6981("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM6986 ^ i7) * 1601) ^ 791877400;
                        i10 = iM6986 ^ 749473340;
                    }
                    break;
                case -859727311:
                case -199708641:
                    strM3396 = C0964.m3396(sArr2, i11, 13, i15);
                    if (C0483.f2088 < 0) {
                        iM2566 = C2105.m6981("۟ܿ") ^ i7;
                        i = ((iM2566 ^ i8) * 6123) ^ (-165825598);
                        i2 = 1949070570;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        cls = cls3;
                        iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -836236652:
                case 43467645:
                    i15 = 25277;
                    iM2566 = C2105.m6981("ۘܶ") ^ i8;
                    i = ((iM2566 ^ i7) * (-3975)) ^ (-1854055022);
                    i2 = -1152066602;
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -816885657:
                case 909906060:
                    cls = cls3;
                    s2 = f47001[0];
                    if (C7811.m20844() != 0) {
                        iM2567 = C0630.m2566("֡ᩳ") ^ i7;
                        i3 = ((iM2567 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                    } else {
                        iM2567 = (C0630.m2566("᩺֫") + i8) * 21;
                        i3 = ((iM2567 ^ i7) * (-20111)) ^ 1494702437;
                        i4 = 347082472;
                    }
                    cls2 = cls;
                    i10 = iM2567 ^ i4;
                    i9 = i3;
                    cls3 = cls2;
                    break;
                case -674330692:
                case 167202309:
                    if ((i14 * i14) - i13 > 0) {
                        iM2566 = (C2105.m6981("ۖ֫") ^ i8) * 15;
                        i = ((iM2566 ^ i7) * 32431) ^ (-137257973);
                        i2 = 1388606752;
                    } else {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i7;
                        i = ((iM2566 ^ i8) * 13973) ^ (-1831550018);
                        i2 = -1721215767;
                    }
                    i10 = iM2566 ^ i2;
                    i9 = i;
                    break;
                case -335369427:
                case 1827173591:
                    ServiceConnectionC3453.m10564();
                    if (C0630.f2410 <= 0) {
                        s = s2;
                        int iM6987 = (C2105.m6981("ܿۤ") ^ i7) * (-69);
                        s2 = s;
                        i9 = ((iM6987 ^ i8) * (-30263)) ^ 182183325;
                        cls3 = cls3;
                        i10 = iM6987 ^ (-261208326);
                    } else {
                        iM2566 = C0630.m2566("ۤۛ") ^ i8;
                        i = ((iM2566 ^ i7) * (-30879)) ^ 2133009621;
                        i2 = 1594808581;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    }
                    break;
                case -296019030:
                case 674281215:
                    C3537.m10746();
                    C0630.m2564();
                    break;
                case 484970940:
                case 1104129609:
                    Hooker.m52897(cls3.getDeclaredMethod(strM3396, clsArr), new C8282());
                    break;
                case 1184440900:
                case 1483807103:
                    clsArr = null;
                    declaredMethod = cls3.getDeclaredMethod(strM5726, null);
                    if (C1294.f4556 < 0) {
                        c1226 = new C1226();
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                            iM2566 = C0630.m2566("ۖۨ") ^ i8;
                            i = ((iM2566 ^ i7) * 12441) ^ (-1560182578);
                            i2 = -161639981;
                            i10 = iM2566 ^ i2;
                            i9 = i;
                        } else {
                            s = s2;
                            int iM6988 = (C2105.m6981("֨ܳ") ^ i8) * (-7);
                            s2 = s;
                            i9 = ((iM6988 ^ i7) * 1601) ^ 791877400;
                            i10 = iM6988 ^ 749473340;
                        }
                    } else {
                        int iM6989 = (C2105.m6981("ۛ֫") + i8) * (-95);
                        i10 = iM6989 ^ (-1274767845);
                        i9 = ((iM6989 ^ i7) * (-275)) ^ 1915381195;
                        c1226 = null;
                    }
                    break;
                case 1685545707:
                case 1970812782:
                    cls = cls3;
                    s = s2;
                    i18 = s * s;
                    if (!C1504.f5354) {
                        s2 = s;
                        iM2567 = (C0630.m2566("᩵ۘ") ^ i7) * (-31);
                        i3 = ((iM2567 ^ i8) * (-623)) ^ 38384931;
                        i4 = -979896829;
                        cls2 = cls;
                        i10 = iM2567 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    } else {
                        cls3 = cls;
                        int iM69810 = (C2105.m6981("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM69810 ^ i7) * 1601) ^ 791877400;
                        i10 = iM69810 ^ 749473340;
                    }
                    break;
                default:
                    cls3 = StackTraceElement.class;
                    sArr = f47001;
                    i16 = 1;
                    if (!C2126.f7087) {
                        iM2566 = C0630.m2566("ܿܶ") ^ i7;
                        i = ((iM2566 ^ i8) * 20055) ^ 1208769306;
                        i2 = -133263089;
                        i10 = iM2566 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        int iM69811 = (C2105.m6981("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM69811 ^ i7) * 1601) ^ 791877400;
                        i10 = iM69811 ^ 749473340;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36366(String str, String str2) {
        if (f47003) {
            f47000 = str;
            f47002 = str2;
        }
    }
}
