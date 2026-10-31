package l;

/* JADX INFO: renamed from: l.ܶܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H76N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15330 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f46987 = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36360(String str) {
        for (int i = 0; i < 9; i++) {
            if (f46987[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36361(String str) {
        if (str == null) {
            throw new NullPointerException("itemKind is null");
        }
        if (!m36360(str)) {
            throw new IllegalArgumentException("Invalid itemKind");
        }
    }
}
