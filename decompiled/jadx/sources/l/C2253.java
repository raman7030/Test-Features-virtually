package l;

/* JADX INFO: renamed from: l.ۖۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2253 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] f7326 = {"build", "runtime", "system"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7460(int i) {
        if (i < 0 || i >= 3) {
            throw new C15431(null, "Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return f7326[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m7459(String str) {
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
        throw new C15431(null, "Invalid annotation visibility: %s", lowerCase);
    }
}
