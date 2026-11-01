package p067l;

/* JADX INFO: renamed from: l.ܶ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17075 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m38724(InterfaceC19897 interfaceC19897, String str) {
        String name = interfaceC19897.getName();
        int iIndexOf = str.indexOf(40);
        if (iIndexOf != name.length() || !str.startsWith(name)) {
            return false;
        }
        int length = iIndexOf + 1;
        for (CharSequence charSequence : interfaceC19897.mo5852()) {
            if (!m38723(str, charSequence, length)) {
                return false;
            }
            length += charSequence.length();
        }
        if (length >= str.length() || str.charAt(length) != ')') {
            return false;
        }
        int i = length + 1;
        String strMo5855 = interfaceC19897.mo5855();
        return m38723(str, strMo5855, i) && strMo5855.length() + i == str.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38723(String str, CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() + i > str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (str.charAt(i + i2) != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
