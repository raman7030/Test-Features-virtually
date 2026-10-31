package com.alipay.sdk.m.e;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String a = "OpenId";
    public static boolean b;

    public static void b(String str, Object... objArr) {
        if (b) {
            a(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        if (b) {
            a(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            a(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        if (b) {
            a(str, objArr);
        }
    }

    public static void a(boolean z) {
        b = z;
    }

    public static String a(String str, Object... objArr) {
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
                sb.append(a(objArr[i], objArr[i2]));
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

    public static String a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }
}
