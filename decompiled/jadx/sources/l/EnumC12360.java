package l;

/* JADX INFO: renamed from: l.۫ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12360 {
    UPPERCASE,
    LOWERCASE,
    UPPER_CAMEL,
    LOWER_CAMEL;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC12360 m29991(String str) {
        if (str.isEmpty()) {
            throw new C17619();
        }
        boolean zIsUpperCase = false;
        boolean zIsUpperCase2 = false;
        boolean zIsLowerCase = false;
        boolean z = true;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isAlphabetic(cCharAt)) {
                if (z) {
                    zIsUpperCase = Character.isUpperCase(cCharAt);
                    z = false;
                }
                zIsUpperCase2 |= Character.isUpperCase(cCharAt);
                zIsLowerCase |= Character.isLowerCase(cCharAt);
            }
        }
        if (zIsUpperCase) {
            return (zIsLowerCase || str.length() == 1) ? UPPER_CAMEL : UPPERCASE;
        }
        return zIsUpperCase2 ? LOWER_CAMEL : LOWERCASE;
    }
}
