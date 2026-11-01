package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C19831 {
    /* JADX INFO: renamed from: ܽ */
    public static String m45079(String str) {
        if (str.startsWith("L") && str.endsWith(C0249l.f1196b)) {
            return str;
        }
        return "L" + str.replace('.', '/') + C0249l.f1196b;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45078(String str) {
        return (str.startsWith("L") && str.endsWith(C0249l.f1196b)) ? str.substring(1, str.length() - 1).replace('/', '.') : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m45076(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        if (str != null && str.indexOf(47) < 0 && str.startsWith("classes") && str.endsWith(".dex")) {
            String strM38720 = C17073.m38720(4, 7, str);
            if (!strM38720.isEmpty() && strM38720.charAt(0) != '0') {
                try {
                    int i = Integer.parseInt(strM38720);
                    if (i >= 2) {
                        return i;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Comparator m45077() {
        return C16866.thenComparing(C10162.comparingInt(new C4408()), new C16596());
    }
}
