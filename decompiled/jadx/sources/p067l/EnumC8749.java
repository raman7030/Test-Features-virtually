package p067l;

/* JADX INFO: renamed from: l.ۜۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8749 {
    MODULE_INFO,
    PACKAGE_INFO,
    CLASS_UNIT;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8749 m20216(String str, int i) {
        if (str.endsWith("module-info") || EnumC8140.m18868(i)) {
            return MODULE_INFO;
        }
        if (str.endsWith("package-info") && EnumC8140.m18877(i)) {
            return PACKAGE_INFO;
        }
        return CLASS_UNIT;
    }
}
