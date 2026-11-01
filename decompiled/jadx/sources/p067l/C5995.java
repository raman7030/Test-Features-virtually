package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAZ0 */
/* JADX INFO: loaded from: classes2.dex */
public class C5995 {

    /* JADX INFO: renamed from: ֫ */
    public static String f14831;

    /* JADX INFO: renamed from: ۜ */
    public static Object f14832;

    /* JADX INFO: renamed from: ۧ */
    public static Method f14833;

    /* JADX INFO: renamed from: ܳ */
    public static Class f14834;

    /* JADX INFO: renamed from: ܽ */
    public static Field f14835;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f14836;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f14837;

    /* JADX INFO: renamed from: ᩵ۢ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f81951 = {3660, 8284, 8280, 8260, 8280, 8223, 8274, 8286, 8287, 8261, 8276, 8287, 8261, 8223, 8259, 8276, 8258, 8223, 8312, 8274, 8286, 8287, 8306, 8260, 8258, 8261, 8286, 8284, 8280, 8267, 8276, 8259, 8272, 8287, 8277, 8259, 8286, 8280, 8277, 8223, 8272, 8257, 8257, 8223, 8304, 8257, 8257, 8285, 8280, 8274, 8272, 8261, 8280, 8286, 8287, 8289, 8272, 8274, 8282, 8272, 8278, 8276, 8316, 8272, 8287, 8272, 8278, 8276, 8259, 8274, 8285, 8276, 8272, 8259, 8306, 8272, 8274, 8281, 8276, 8291, 8276, 8258, 8286, 8260, 8259, 8274, 8276, 8319, 8272, 8284, 8276, 8291, 8276, 8258, 8286, 8260, 8259, 8274, 8276, 8319, 8272, 8284, 8276, 8209, 8274, 8285, 8272, 8258, 8258, 8209, 8287, 8286, 8261, 8209, 8279, 8286, 8260, 8287, 8277, 8258, 8290, 8264, 8287, 8274, 8258, 8312, 8274, 8286, 8287, 8306, 8272, 8274, 8281, 8276};

    /* JADX INFO: renamed from: ᩷ */
    public static byte[] f14838;

    /* JADX INFO: renamed from: ᩻ */
    public static Constructor f14839;

    /* JADX INFO: renamed from: ֫ */
    public void mo13439(int i, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13440(int i, C13366 c13366) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13442(C13366 c13366) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo13443(int i, C13366 c13366) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo13444(C13366 c13366) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo13445(int i, C13366 c13366) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized boolean m13437() {
        short s = f81951[0];
        int i = s + 18294;
        int i2 = (s * s) + 334670436;
        int i3 = (i2 + i2) - (i * i) < 0 ? 58233 : 8241;
        synchronized (C5995.class) {
            if (f14836) {
                return true;
            }
            if (f14837) {
                return false;
            }
            try {
                Method declaredMethod = Class.forName(C0930.m55893(f81951, 1, 31, i3)).getDeclaredMethod(RunnableC0871.m55667(f81951, 69, 10, i3), String.class);
                declaredMethod.setAccessible(true);
                f14833 = declaredMethod;
            } catch (Exception unused) {
            }
            try {
                Class<?> cls = Class.forName(C0912.m55822(f81951, 32, 37, i3));
                for (Class<?> cls2 : cls.getDeclaredClasses()) {
                    if (C0906.m55806(cls2.getSimpleName(), C0873.m55689(f81951, 79, 12, i3))) {
                        f14834 = cls2;
                        break;
                    }
                }
                Class cls3 = f14834;
                if (cls3 == null) {
                    throw new NoSuchFieldException(C0949.m56016(f81951, 91, 28, i3));
                }
                Constructor declaredConstructor = cls3.getDeclaredConstructor(String.class, Integer.TYPE);
                f14839 = declaredConstructor;
                declaredConstructor.setAccessible(true);
                Field declaredField = cls.getDeclaredField(C1036.m56252(f81951, 119, 5, i3));
                declaredField.setAccessible(true);
                f14832 = declaredField.get(null);
                Field declaredField2 = cls.getDeclaredField(C0877.m55707(f81951, 124, 10, i3));
                f14835 = declaredField2;
                declaredField2.setAccessible(true);
                f14836 = true;
                return true;
            } catch (Exception unused2) {
                f14837 = true;
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13441(int i, C13366 c13366, String str, String str2, String str3) {
        int i2 = -1935911811;
        int i3 = C1229.f82066;
        int i4 = C0949.f81897;
        int iM55680 = C0873.m55680("۟᩺") ^ i4;
        int i5 = ((iM55680 ^ i3) * 23041) ^ 463062378;
        int i6 = -813675576;
        while (true) {
            i2 = ((((i2 ^ i3) * (-28663)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2070431199:
                case -377986301:
                    if (C0863.m55643()) {
                        iM55680 = C0873.m55680("۬ۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 28635) ^ (-2082337454);
                        i6 = 1918209937;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۡ") + i3) * (-45);
                        i5 = ((iM55680 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    }
                    break;
                case -1912985319:
                case 621440114:
                    C0947.m55997();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0946.m55979("᩺ۡ") + i3) * (-45);
                        i5 = ((iM55680 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    } else {
                        iM55680 = (C0946.m55979("᩸᩺") ^ i3) * 101;
                        i5 = ((iM55680 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    }
                    break;
                case -1810345161:
                case 1676813311:
                    C0854.m55595();
                    return;
                case -1771143772:
                case -633708896:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0946.m55979("᩸᩺") ^ i3) * 101;
                        i5 = ((iM55680 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    } else {
                        iM55680 = C0873.m55680("۟᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-9745)) ^ (-570045756);
                        i6 = -404277045;
                    }
                    break;
                case -1657714535:
                case -440164991:
                    C1017.m56187();
                    RunnableC0897.m55784();
                    iM55680 = C0873.m55680("᩵ۖ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 21291) ^ (-1070258456);
                    i6 = -1163422504;
                    break;
                case -1425809713:
                case -396993538:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("᩺ۡ") + i3) * (-45);
                        i5 = ((iM55680 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    } else {
                        iM55680 = C0946.m55979("ۛ۠") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-32271)) ^ 974819544;
                        i6 = -1540860986;
                    }
                    break;
                case -1330178415:
                case 775403182:
                    if (C0947.m55997()) {
                        iM55680 = C0873.m55680("᩵ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    } else {
                        iM55680 = C0873.m55680("۫۫") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-2113)) ^ 372728960;
                        i6 = 2087015152;
                    }
                    break;
                case -1326302394:
                case 1051810705:
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ۢۡ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM55680 ^ i4) * 13963) ^ (-1980999212);
                        i6 = -968260988;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۡ") + i3) * (-45);
                        i5 = ((iM55680 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    }
                    break;
                case -1171146819:
                case -802123696:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    } else {
                        iM55680 = C0873.m55680("᩵ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    }
                    break;
                case -1152619314:
                case -930386085:
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("ܽ᩻") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-29359)) ^ 1475332941;
                        i6 = 808326651;
                    } else {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    }
                    break;
                case -845853993:
                case -491368984:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-25719)) ^ 1279256691;
                        i6 = -1795561972;
                    } else {
                        iM55680 = C0873.m55680("ۗᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 5329) ^ 961057193;
                        i6 = 664688287;
                    }
                    break;
                case -845306632:
                case 366497252:
                    if (C0955.f81898) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    } else {
                        iM55680 = C0873.m55680("ۨܿ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 12343) ^ 689133477;
                        i6 = 1776371680;
                    }
                    break;
                case -741600342:
                case 215535874:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0946.m55979("᩸᩺") ^ i3) * 101;
                        i5 = ((iM55680 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    } else {
                        iM55680 = C0873.m55680("᩵ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    }
                    break;
                case -230414363:
                case 383133845:
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0946.m55979("ܰۤ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    } else {
                        iM55680 = (C0873.m55680("֨᩷") + i3) * 45;
                        i5 = ((iM55680 ^ i4) * 29597) ^ (-720289395);
                        i6 = -63288816;
                    }
                    break;
                case 148887414:
                case 1306644130:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-25719)) ^ 1279256691;
                        i6 = -1795561972;
                    } else {
                        iM55680 = (C0946.m55979("֫ۧ") ^ i4) * (-119);
                        i5 = ((iM55680 ^ i3) * 22531) ^ (-1874888065);
                        i6 = 152629102;
                    }
                    break;
                default:
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m13438(int i, String str) {
        if (str == null || C0937.m55923(str) || !m13437()) {
            return;
        }
        Method method = f14833;
        if (method != null) {
            try {
                method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        try {
            Object objNewInstance = f14839.newInstance(str, C0912.m55836(i));
            synchronized (f14832) {
                try {
                    Map map = (Map) f14835.get(null);
                    if (map != null) {
                        map.remove(objNewInstance);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }
}
