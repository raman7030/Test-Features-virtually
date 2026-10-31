package l;

/* JADX INFO: renamed from: l.ۖᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 177I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2692 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8425(String str) {
        int length = str.length();
        while (length > 0) {
            char cCharAt = str.charAt(length - 1);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8426(InterfaceC7099 interfaceC7099) {
        String strMo18742 = interfaceC7099.mo18742();
        return (strMo18742 == null || strMo18742.isEmpty()) ? "default" : strMo18742;
    }
}
