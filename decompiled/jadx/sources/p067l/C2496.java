package p067l;

/* JADX INFO: renamed from: l.֡ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O60F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2496 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC4560 f4024;

    static {
        C14578 c14578 = new C14578();
        c14578.m33325((Integer) 0, "static-put");
        c14578.m33325((Integer) 1, "static-get");
        c14578.m33325((Integer) 2, "instance-put");
        c14578.m33325((Integer) 3, "instance-get");
        c14578.m33325((Integer) 4, "invoke-static");
        c14578.m33325((Integer) 5, "invoke-instance");
        c14578.m33325((Integer) 6, "invoke-constructor");
        c14578.m33325((Integer) 7, "invoke-direct");
        c14578.m33325((Integer) 8, "invoke-interface");
        f4024 = c14578.mo20378();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m3616(int i) {
        String str = (String) f4024.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        throw new C20603(null, "Invalid method handle type: %d", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m3615(String str) {
        Integer num = (Integer) f4024.mo9635().get(str);
        if (num == null) {
            throw new C17034(null, "Invalid method handle type: %s", str);
        }
        return num.intValue();
    }
}
