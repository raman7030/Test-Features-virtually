package l;

/* JADX INFO: renamed from: l.ۜۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6714 {
    MODULE_INFO,
    PACKAGE_INFO,
    CLASS_UNIT;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC6714 m18268(String str, int i) {
        if (str.endsWith("module-info") || EnumC6073.m16939(i)) {
            return MODULE_INFO;
        }
        if (str.endsWith("package-info") && EnumC6073.m16948(i)) {
            return PACKAGE_INFO;
        }
        return CLASS_UNIT;
    }
}
