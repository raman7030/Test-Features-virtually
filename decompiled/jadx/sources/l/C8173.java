package l;

/* JADX INFO: renamed from: l.۠۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8173 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21649(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC0464) {
        String text = interfaceC0463.getText();
        String text2 = interfaceC0464.getText();
        if (!text.isEmpty() && !text2.isEmpty()) {
            char cM19937 = C7416.m19937(1, text);
            char cCharAt = text2.charAt(0);
            boolean z = m21647(cCharAt) || interfaceC0464.getType() == 140 || interfaceC0464.getType() == 139;
            if (((m21647(cM19937) || interfaceC0463.getType() == 140 || interfaceC0463.getType() == 139) && z) || ((interfaceC0463.getType() == 5 && z) || ((interfaceC0463.getType() == 138 && (z || cCharAt == '.')) || ((cM19937 == '+' && cCharAt == '+') || ((cM19937 == '-' && cCharAt == '-') || ((cM19937 == '/' && (cCharAt == '/' || cCharAt == '*')) || ((cM19937 == '<' && cCharAt == '!') || ((cM19937 == '-' && cCharAt == '>') || ((cM19937 == '?' && cCharAt == '.') || ((cM19937 == '.' && cCharAt == '.') || ("+-*/%&|^!=<>?".indexOf(cM19937) >= 0 && "=&|*<>?".indexOf(cCharAt) >= 0))))))))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21647(char c) {
        return Character.isJavaIdentifierPart(c) || Character.isSurrogate(c) || c == '\\';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21648(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                return true;
            }
        }
        return false;
    }
}
