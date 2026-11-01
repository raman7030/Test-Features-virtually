package p067l;

/* JADX INFO: renamed from: l.᩹ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23448 {
    SIMPLE,
    BY_FILE,
    BY_TODO;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23448 m52150(String str) {
        if (str == null) {
            return C6684.f17256;
        }
        if (str.equals("simple")) {
            return SIMPLE;
        }
        if (str.equals("byfile")) {
            return BY_FILE;
        }
        if (str.equals("bytodo")) {
            return BY_TODO;
        }
        return C6684.f17256;
    }
}
