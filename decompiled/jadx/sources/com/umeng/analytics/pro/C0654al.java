package com.umeng.analytics.pro;

/* JADX INFO: renamed from: com.umeng.analytics.pro.al */
/* JADX INFO: compiled from: A4OF */
/* JADX INFO: loaded from: classes.dex */
public class C0654al {

    /* JADX INFO: renamed from: a */
    public static final String f2244a = "OpenId";

    /* JADX INFO: renamed from: b */
    public static boolean f2245b;

    /* JADX INFO: renamed from: a */
    public static void m2142a(boolean z) {
        f2245b = z;
    }

    /* JADX INFO: renamed from: a */
    public static void m2141a(String str, Object... objArr) {
        if (f2245b) {
            m2146e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2143b(String str, Object... objArr) {
        if (f2245b) {
            m2146e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2144c(String str, Object... objArr) {
        if (f2245b) {
            m2146e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2145d(String str, Object... objArr) {
        if (f2245b) {
            m2146e(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m2146e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(m2140a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m2140a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }
}
