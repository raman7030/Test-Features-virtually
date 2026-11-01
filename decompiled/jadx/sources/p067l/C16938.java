package p067l;

/* JADX INFO: renamed from: l.ܶܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H76N */
/* JADX INFO: loaded from: classes4.dex */
public final class C16938 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f50113 = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38518(String str) {
        for (int i = 0; i < 9; i++) {
            if (f50113[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38519(String str) {
        if (str == null) {
            throw new NullPointerException("itemKind is null");
        }
        if (!m38518(str)) {
            throw new IllegalArgumentException("Invalid itemKind");
        }
    }
}
