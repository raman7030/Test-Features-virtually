package l;

/* JADX INFO: renamed from: l.ۙ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4291 {
    ascii,
    utf,
    fallback;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4291 m12872(String str) {
        if (str.equals("US-ASCII")) {
            return ascii;
        }
        if (str.startsWith("UTF-")) {
            return utf;
        }
        return fallback;
    }
}
