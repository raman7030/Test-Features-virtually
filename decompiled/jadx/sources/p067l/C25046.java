package p067l;

/* JADX INFO: renamed from: l.᩻ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes.dex */
public final class C25046 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f79933;

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence f79934;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54981(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    public C25046(CharSequence charSequence) {
        this.f79934 = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (m54982(r9, "END") == false) goto L31;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m54983(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        CharSequence charSequence = this.f79934;
        char cCharAt = charSequence.charAt(i);
        int length = charSequence.length();
        if (cCharAt != '\"' && cCharAt != '\'') {
            if (cCharAt == '/' && (i3 = i + 1) < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 == '/') {
                    if (z && m54982(i, "// MARK_")) {
                        int i5 = i + 8;
                        if (m54982(i5, "CLASS_") || m54982(i5, "FIELD_")) {
                            i4 = i + 14;
                        } else if (m54982(i5, "METHOD_")) {
                            i4 = i + 15;
                        }
                        if (!m54982(i4, "START")) {
                        }
                    }
                    int i6 = i + 2;
                    while (i6 < length && !m54981(charSequence.charAt(i6))) {
                        i6++;
                    }
                    return i6;
                }
                if (cCharAt2 == '*' && !this.f79933) {
                    int i7 = i + 2;
                    while (true) {
                        int i8 = i7 + 1;
                        if (i8 < length) {
                            if (charSequence.charAt(i7) == '*' && charSequence.charAt(i8) == '/') {
                                return i7 + 2;
                            }
                            i7 = i8;
                        } else {
                            this.f79933 = true;
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
            if (m54981(cCharAt3)) {
                return i;
            }
            if (cCharAt3 == '\\' && (i2 = i + 1) < length && !m54981(charSequence.charAt(i2))) {
                i = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54982(int i, String str) {
        int length = str.length() + i;
        CharSequence charSequence = this.f79934;
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
