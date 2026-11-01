package p067l;

/* JADX INFO: renamed from: l.ۖۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4509 {

    /* JADX INFO: renamed from: ֫ */
    public static String[] f10114 = {"build", "runtime", "system"};

    /* JADX INFO: renamed from: ֫ */
    public static String m9542(int i) {
        if (i < 0 || i >= 3) {
            throw new C17034(null, "Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return f10114[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m9541(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("build")) {
            return 0;
        }
        if (lowerCase.equals("runtime")) {
            return 1;
        }
        if (lowerCase.equals("system")) {
            return 2;
        }
        throw new C17034(null, "Invalid annotation visibility: %s", lowerCase);
    }
}
