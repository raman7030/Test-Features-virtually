package l;

/* JADX INFO: renamed from: l.ܶ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I770 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15474 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36565(InterfaceC18444 interfaceC18444, String str) {
        String name = interfaceC18444.getName();
        int iIndexOf = str.indexOf(40);
        if (iIndexOf != name.length() || !str.startsWith(name)) {
            return false;
        }
        int length = iIndexOf + 1;
        for (CharSequence charSequence : interfaceC18444.mo3565()) {
            if (!m36564(str, charSequence, length)) {
                return false;
            }
            length += charSequence.length();
        }
        if (length >= str.length() || str.charAt(length) != ')') {
            return false;
        }
        int i = length + 1;
        String strMo3568 = interfaceC18444.mo3568();
        return m36564(str, strMo3568, i) && strMo3568.length() + i == str.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36564(String str, CharSequence charSequence, int i) {
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
