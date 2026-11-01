package com.alipay.sdk.p010m.p019e;

/* JADX INFO: renamed from: com.alipay.sdk.m.e.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0108a {

    /* JADX INFO: renamed from: a */
    public static final String f454a = "OpenId";

    /* JADX INFO: renamed from: b */
    public static boolean f455b;

    /* JADX INFO: renamed from: b */
    public static void m577b(String str, Object... objArr) {
        if (f455b) {
            m575a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m578c(String str, Object... objArr) {
        if (f455b) {
            m575a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m579d(String str, Object... objArr) {
        if (f455b) {
            m575a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m580e(String str, Object... objArr) {
        if (f455b) {
            m575a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m576a(boolean z) {
        f455b = z;
    }

    /* JADX INFO: renamed from: a */
    public static String m575a(String str, Object... objArr) {
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
                sb.append(m574a(objArr[i], objArr[i2]));
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
    public static String m574a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }
}
