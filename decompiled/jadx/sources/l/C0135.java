package l;

/* JADX INFO: renamed from: l.֡ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O60F */
/* JADX INFO: loaded from: classes2.dex */
public final class C0135 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2306 f1249;

    static {
        C12847 c12847 = new C12847();
        c12847.m31239((Integer) 0, "static-put");
        c12847.m31239((Integer) 1, "static-get");
        c12847.m31239((Integer) 2, "instance-put");
        c12847.m31239((Integer) 3, "instance-get");
        c12847.m31239((Integer) 4, "invoke-static");
        c12847.m31239((Integer) 5, "invoke-instance");
        c12847.m31239((Integer) 6, "invoke-constructor");
        c12847.m31239((Integer) 7, "invoke-direct");
        c12847.m31239((Integer) 8, "invoke-interface");
        f1249 = c12847.mo18430();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1214(int i) {
        String str = (String) f1249.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new C19187(null, "Invalid method handle type: %d", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m1213(String str) {
        Integer num = (Integer) f1249.mo7567().get(str);
        if (num == null) {
            throw new C15431(null, "Invalid method handle type: %s", str);
        }
        return num.intValue();
    }
}
