package p067l;

import com.umeng.analytics.pro.C0655am;
import java.lang.reflect.Method;
import org.lsposed.lsplant.Hooker;

/* JADX INFO: renamed from: l.ܶܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAK5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16944 {

    /* JADX INFO: renamed from: ֫ */
    public static String f50126 = "";

    /* JADX INFO: renamed from: ۘܶۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f82241 = {3210, 1370, 1368, 1353, 1406, 1361, 1372, 1358, 1358, 1395, 1372, 1360, 1368, 1370, 1368, 1353, 1392, 1368, 1353, 1365, 1362, 1369, 1395, 1372, 1360, 1368};

    /* JADX INFO: renamed from: ۧ */
    public static String f50127 = "";

    /* JADX INFO: renamed from: ܽ */
    public static volatile boolean f50128;

    /* JADX INFO: renamed from: ܿ */
    public static synchronized void m38527() {
        m38528();
        m38524("aa", "bb");
        StackTraceElement stackTraceElement = new StackTraceElement(C0655am.f2320av, "b", C0655am.f2278aF, 0);
        if (!"aa".equals(stackTraceElement.getClassName()) || !"bb".equals(stackTraceElement.getMethodName())) {
            throw new IllegalStateException("JavaHook probe failed");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static synchronized void m38528() {
        if (f50128) {
            return;
        }
        m38526();
        f50128 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m38526() throws NoSuchMethodException {
        int iM55680;
        int i;
        int i2;
        short s;
        Class<StackTraceElement> cls;
        int iM55681;
        int i3;
        int i4;
        int iM55979;
        int i5;
        int i6;
        Class<StackTraceElement> cls2;
        int i7 = C1964.f83032;
        int i8 = C0873.f81841;
        int iM559710 = C0946.m55979("ۚ֫") ^ i7;
        int i9 = ((iM559710 ^ i8) * (-28371)) ^ (-2025436593);
        String strM55726 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM559710 ^ (-89355115);
        int i11 = 0;
        C3534 c3534 = null;
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
        String strM55863 = null;
        Class<StackTraceElement> cls3 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-30261)) >> 31));
            switch (i17) {
                case -1980073608:
                case -100839167:
                    if (!C0955.f81898) {
                        cls = cls3;
                        iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    } else {
                        iM55680 = C0873.m55680("ۤۛ") ^ i8;
                        i = ((iM55680 ^ i7) * (-30879)) ^ 2133009621;
                        i2 = 1594808581;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1660289585:
                case 1788081526:
                    i13 = i12 + i12;
                    s = s2;
                    i14 = s + 1211;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        cls = cls3;
                        iM55979 = C0873.m55680("᩹֡") ^ i8;
                        i5 = ((iM55979 ^ i7) * 32435) ^ 1139481870;
                        i6 = -1921166670;
                        int i19 = iM55979 ^ i6;
                        s2 = s;
                        i9 = i5;
                        cls2 = cls;
                        i10 = i19;
                        cls3 = cls2;
                    } else {
                        int iM559711 = (C0946.m55979("ܿۤ") ^ i7) * (-69);
                        s2 = s;
                        i9 = ((iM559711 ^ i8) * (-30263)) ^ 182183325;
                        cls3 = cls3;
                        i10 = iM559711 ^ (-261208326);
                    }
                    break;
                case -1601508237:
                case 96397876:
                    C0955.m56025();
                    C1046.m56302();
                    cls = cls3;
                    iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                    i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                    i4 = -608643653;
                    cls2 = cls;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    cls3 = cls2;
                    break;
                case -1505652833:
                case -840077253:
                    strM55863 = C0927.m55863(sArr, i16, 12, i15);
                    if (!C0892.f81851) {
                        int iM559712 = (C0946.m55979("ۛ֫") + i8) * (-95);
                        i10 = iM559712 ^ (-1274767845);
                        i9 = ((iM559712 ^ i7) * (-275)) ^ 1915381195;
                        c3534 = null;
                    } else {
                        iM55680 = C0946.m55979("ܺ۫") ^ i7;
                        i = ((iM55680 ^ i8) * 17621) ^ (-1362744353);
                        i2 = 1838348653;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1451129511:
                case 1030848839:
                    if (!C1025.m56230()) {
                        int iM559713 = (C0946.m55979("ۛ֫") + i8) * (-95);
                        i10 = iM559713 ^ (-1274767845);
                        i9 = ((iM559713 ^ i7) * (-275)) ^ 1915381195;
                        c3534 = null;
                    } else {
                        cls = cls3;
                        iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -1400365776:
                case -213231099:
                    i15 = 1341;
                    iM55680 = C0946.m55979("ۘܶ") ^ i8;
                    i = ((iM55680 ^ i7) * (-3975)) ^ (-1854055022);
                    i2 = -1152066602;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -1393712057:
                case 764163734:
                    Hooker.m55461(declaredMethod, c3534);
                    sArr2 = f82241;
                    i11 = 13;
                    if (C0967.f81910 < 0) {
                        iM55680 = (C0946.m55979("ۜۘ") + i8) * (-51);
                        i = ((iM55680 ^ i7) * 705) ^ 1555066967;
                        i2 = 445393733;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        cls = cls3;
                        iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -1135642653:
                case 1792833734:
                    cls = cls3;
                    s = s2;
                    i12 = i18 + 1466521;
                    if (C0946.f81894 == 0) {
                        iM55979 = (C0946.m55979("᩸ۡ") + i7) * (-109);
                        i5 = ((iM55979 ^ i8) * 18827) ^ 1733472783;
                        i6 = 1717973202;
                        int i110 = iM55979 ^ i6;
                        s2 = s;
                        i9 = i5;
                        cls2 = cls;
                        i10 = i110;
                        cls3 = cls2;
                    } else {
                        cls3 = cls;
                        int iM559714 = (C0946.m55979("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM559714 ^ i7) * 1601) ^ 791877400;
                        i10 = iM559714 ^ 749473340;
                    }
                    break;
                case -859727311:
                case -199708641:
                    strM55726 = C0890.m55726(sArr2, i11, 13, i15);
                    if (C0866.f81837 < 0) {
                        iM55680 = C0946.m55979("۟ܿ") ^ i7;
                        i = ((iM55680 ^ i8) * 6123) ^ (-165825598);
                        i2 = 1949070570;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        cls = cls3;
                        iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                        cls2 = cls;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    }
                    break;
                case -836236652:
                case 43467645:
                    i15 = 25277;
                    iM55680 = C0946.m55979("ۘܶ") ^ i8;
                    i = ((iM55680 ^ i7) * (-3975)) ^ (-1854055022);
                    i2 = -1152066602;
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -816885657:
                case 909906060:
                    cls = cls3;
                    s2 = f82241[0];
                    if (C1229.m56410() != 0) {
                        iM55681 = C0873.m55680("֡ᩳ") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-22371)) ^ 1961764622;
                        i4 = -608643653;
                    } else {
                        iM55681 = (C0873.m55680("᩺֫") + i8) * 21;
                        i3 = ((iM55681 ^ i7) * (-20111)) ^ 1494702437;
                        i4 = 347082472;
                    }
                    cls2 = cls;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    cls3 = cls2;
                    break;
                case -674330692:
                case 167202309:
                    if ((i14 * i14) - i13 > 0) {
                        iM55680 = (C0946.m55979("ۖ֫") ^ i8) * 15;
                        i = ((iM55680 ^ i7) * 32431) ^ (-137257973);
                        i2 = 1388606752;
                    } else {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i7;
                        i = ((iM55680 ^ i8) * 13973) ^ (-1831550018);
                        i2 = -1721215767;
                    }
                    i10 = iM55680 ^ i2;
                    i9 = i;
                    break;
                case -335369427:
                case 1827173591:
                    ServiceConnectionC1013.m56157();
                    if (C0873.f81841 <= 0) {
                        s = s2;
                        int iM559715 = (C0946.m55979("ܿۤ") ^ i7) * (-69);
                        s2 = s;
                        i9 = ((iM559715 ^ i8) * (-30263)) ^ 182183325;
                        cls3 = cls3;
                        i10 = iM559715 ^ (-261208326);
                    } else {
                        iM55680 = C0873.m55680("ۤۛ") ^ i8;
                        i = ((iM55680 ^ i7) * (-30879)) ^ 2133009621;
                        i2 = 1594808581;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    }
                    break;
                case -296019030:
                case 674281215:
                    C1017.m56187();
                    C0873.m55678();
                    break;
                case 484970940:
                case 1104129609:
                    Hooker.m55461(cls3.getDeclaredMethod(strM55726, clsArr), new C10240());
                    break;
                case 1184440900:
                case 1483807103:
                    clsArr = null;
                    declaredMethod = cls3.getDeclaredMethod(strM55863, null);
                    if (C0906.f81862 < 0) {
                        c3534 = new C3534();
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55680 = C0873.m55680("ۖۨ") ^ i8;
                            i = ((iM55680 ^ i7) * 12441) ^ (-1560182578);
                            i2 = -161639981;
                            i10 = iM55680 ^ i2;
                            i9 = i;
                        } else {
                            s = s2;
                            int iM559716 = (C0946.m55979("֨ܳ") ^ i8) * (-7);
                            s2 = s;
                            i9 = ((iM559716 ^ i7) * 1601) ^ 791877400;
                            i10 = iM559716 ^ 749473340;
                        }
                    } else {
                        int iM559717 = (C0946.m55979("ۛ֫") + i8) * (-95);
                        i10 = iM559717 ^ (-1274767845);
                        i9 = ((iM559717 ^ i7) * (-275)) ^ 1915381195;
                        c3534 = null;
                    }
                    break;
                case 1685545707:
                case 1970812782:
                    cls = cls3;
                    s = s2;
                    i18 = s * s;
                    if (!C0917.f81868) {
                        s2 = s;
                        iM55681 = (C0873.m55680("᩵ۘ") ^ i7) * (-31);
                        i3 = ((iM55681 ^ i8) * (-623)) ^ 38384931;
                        i4 = -979896829;
                        cls2 = cls;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        cls3 = cls2;
                    } else {
                        cls3 = cls;
                        int iM559718 = (C0946.m55979("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM559718 ^ i7) * 1601) ^ 791877400;
                        i10 = iM559718 ^ 749473340;
                    }
                    break;
                default:
                    cls3 = StackTraceElement.class;
                    sArr = f82241;
                    i16 = 1;
                    if (!C0947.f81895) {
                        iM55680 = C0873.m55680("ܿܶ") ^ i7;
                        i = ((iM55680 ^ i8) * 20055) ^ 1208769306;
                        i2 = -133263089;
                        i10 = iM55680 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        int iM559719 = (C0946.m55979("֨ܳ") ^ i8) * (-7);
                        s2 = s;
                        i9 = ((iM559719 ^ i7) * 1601) ^ 791877400;
                        i10 = iM559719 ^ 749473340;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38524(String str, String str2) {
        if (f50128) {
            f50126 = str;
            f50127 = str2;
        }
    }
}
