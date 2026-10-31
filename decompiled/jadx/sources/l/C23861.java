package l;

/* JADX INFO: renamed from: l.᩻ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes.dex */
public final class C23861 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f77183;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77184;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52572(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    public C23861(CharSequence charSequence) {
        this.f77184 = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (m52573(r9, "END") == false) goto L31;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m52574(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        CharSequence charSequence = this.f77184;
        char cCharAt = charSequence.charAt(i);
        int length = charSequence.length();
        if (cCharAt != '\"' && cCharAt != '\'') {
            if (cCharAt == '/' && (i3 = i + 1) < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 == '/') {
                    if (z && m52573(i, "// MARK_")) {
                        int i5 = i + 8;
                        if (m52573(i5, "CLASS_") || m52573(i5, "FIELD_")) {
                            i4 = i + 14;
                        } else if (m52573(i5, "METHOD_")) {
                            i4 = i + 15;
                        }
                        if (!m52573(i4, "START")) {
                        }
                    }
                    int i6 = i + 2;
                    while (i6 < length && !m52572(charSequence.charAt(i6))) {
                        i6++;
                    }
                    return i6;
                }
                if (cCharAt2 == '*' && !this.f77183) {
                    int i7 = i + 2;
                    while (true) {
                        int i8 = i7 + 1;
                        if (i8 < length) {
                            if (charSequence.charAt(i7) == '*' && charSequence.charAt(i8) == '/') {
                                return i7 + 2;
                            }
                            i7 = i8;
                        } else {
                            this.f77183 = true;
                            break;
                        }
                    }
                }
            }
            return i;
        }
        while (true) {
            i++;
            if (i >= length) {
                return length;
            }
            char cCharAt3 = charSequence.charAt(i);
            if (cCharAt3 == cCharAt) {
                return i + 1;
            }
            if (m52572(cCharAt3)) {
                return i;
            }
            if (cCharAt3 == '\\' && (i2 = i + 1) < length && !m52572(charSequence.charAt(i2))) {
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52573(int i, String str) {
        int length = str.length() + i;
        CharSequence charSequence = this.f77184;
        if (length <= charSequence.length()) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (charSequence.charAt(i + i2) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
