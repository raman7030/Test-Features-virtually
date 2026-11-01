package p067l;

/* JADX INFO: renamed from: l.ۖᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 177I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4927 {
    /* JADX INFO: renamed from: ֫ */
    public static String m10471(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m10472(InterfaceC9116 interfaceC9116) {
        String strMo20692 = interfaceC9116.mo20692();
        return (strMo20692 == null || strMo20692.isEmpty()) ? "default" : strMo20692;
    }
}
