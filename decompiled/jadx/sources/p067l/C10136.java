package p067l;

/* JADX INFO: renamed from: l.۠۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10136 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m23618(InterfaceC2808 interfaceC2808, InterfaceC2808 interfaceC2809) {
        String text = interfaceC2808.getText();
        String text2 = interfaceC2809.getText();
        if (!text.isEmpty() && !text2.isEmpty()) {
            char cM21911 = C9417.m21911(1, text);
            char cCharAt = text2.charAt(0);
            boolean z = m23616(cCharAt) || interfaceC2809.getType() == 140 || interfaceC2809.getType() == 139;
            if (((m23616(cM21911) || interfaceC2808.getType() == 140 || interfaceC2808.getType() == 139) && z) || ((interfaceC2808.getType() == 5 && z) || ((interfaceC2808.getType() == 138 && (z || cCharAt == '.')) || ((cM21911 == '+' && cCharAt == '+') || ((cM21911 == '-' && cCharAt == '-') || ((cM21911 == '/' && (cCharAt == '/' || cCharAt == '*')) || ((cM21911 == '<' && cCharAt == '!') || ((cM21911 == '-' && cCharAt == '>') || ((cM21911 == '?' && cCharAt == '.') || ((cM21911 == '.' && cCharAt == '.') || ("+-*/%&|^!=<>?".indexOf(cM21911) >= 0 && "=&|*<>?".indexOf(cCharAt) >= 0))))))))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23616(char c) {
        return Character.isJavaIdentifierPart(c) || Character.isSurrogate(c) || c == '\\';
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23617(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                return true;
            }
        }
        return false;
    }
}
