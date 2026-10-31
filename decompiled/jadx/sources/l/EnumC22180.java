package l;

/* JADX INFO: renamed from: l.᩹ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22180 {
    SIMPLE,
    BY_FILE,
    BY_TODO;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22180 m49823(String str) {
        if (str == null) {
            return C4541.f14425;
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
        return C4541.f14425;
    }
}
