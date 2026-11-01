package p067l;

/* JADX INFO: renamed from: l.ۙ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6446 {
    ascii,
    utf,
    fallback;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6446 m14736(String str) {
        if (str.equals("US-ASCII")) {
            return ascii;
        }
        if (str.startsWith("UTF-")) {
            return utf;
        }
        return fallback;
    }
}
