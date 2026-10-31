package l;

import com.alipay.sdk.m.y.l;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18373 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m42807(String str) {
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return str;
        }
        return "L" + str.replace('.', '/') + l.b;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42806(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str.substring(1, str.length() - 1).replace('/', '.') : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42804(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        if (str != null && str.indexOf(47) < 0 && str.startsWith("classes") && str.endsWith(".dex")) {
            String strM36561 = C15472.m36561(4, 7, str);
            if (!strM36561.isEmpty() && strM36561.charAt(0) != '0') {
                try {
                    int i = Integer.parseInt(strM36561);
                    if (i >= 2) {
                        return i;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m42805() {
        return C15254.thenComparing(C8200.comparingInt(new C2145()), new C14970());
    }
}
