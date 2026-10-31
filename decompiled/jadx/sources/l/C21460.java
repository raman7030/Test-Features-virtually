package l;

/* JADX INFO: renamed from: l.᩸۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C21460 {
    /* JADX WARN: Code duplicated, block: B:91:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x00eb A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (r9 != false) goto L91;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m48607(int i, boolean z, C8054 c8054, int i2, CharSequence charSequence) {
        int i3;
        switch (i) {
            case 0:
                if (i2 == (c8054.f24843 ? c8054.f24828 : 0)) {
                    return true;
                }
                return false;
            case 1:
                if (i2 == (c8054.f24843 ? c8054.f24844 : c8054.f24836.length())) {
                    c8054.f24842 = true;
                    return true;
                }
                return false;
            case 2:
            case 3:
                int i4 = c8054.f24828;
                int length = c8054.f24844;
                if (!c8054.f24843) {
                    length = c8054.f24836.length();
                    i4 = 0;
                }
                if (i2 == length) {
                    c8054.f24842 = true;
                    return false;
                }
                if (i2 > i4) {
                    char cCharAt = charSequence.charAt(i2 - 1);
                    if (i != 3 ? !((cCharAt == '\n' || cCharAt == '\r' || (cCharAt | 1) == 8233 || cCharAt == 133) && (cCharAt != '\r' || charSequence.charAt(i2) != '\n')) : cCharAt != '\n') {
                        return false;
                    }
                }
                return true;
            case 4:
                int length2 = c8054.f24843 ? c8054.f24844 : c8054.f24836.length();
                if (z || (i2 >= (i3 = length2 - 2) && (i2 != i3 || (charSequence.charAt(i2) == '\r' && charSequence.charAt(i2 + 1) == '\n')))) {
                    if (i2 < length2) {
                        char cCharAt2 = charSequence.charAt(i2);
                        if (cCharAt2 == '\n') {
                            if (i2 <= 0 || charSequence.charAt(i2 - 1) != '\r') {
                            }
                        } else if (cCharAt2 == '\r' || cCharAt2 == 133 || (cCharAt2 | 1) == 8233) {
                        }
                    }
                    c8054.f24842 = true;
                    c8054.f24833 = true;
                    return true;
                }
                return false;
            case 5:
                int length3 = c8054.f24843 ? c8054.f24844 : c8054.f24836.length();
                if (i2 < length3) {
                    if (charSequence.charAt(i2) == '\n' && (z || i2 == length3 - 1)) {
                    }
                    return false;
                }
                c8054.f24842 = true;
                c8054.f24833 = true;
                return true;
            case 6:
                if (i2 == c8054.m21385()) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException(C19370.m44628(i, "Unknown zero-width anchor: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48609(C3446 c3446, C8054 c8054, int i, CharSequence charSequence) {
        boolean zM48608;
        int i2;
        int i3 = c8054.f24828;
        int length = c8054.f24844;
        if (c8054.f24847) {
            length = c8054.f24836.length();
            i3 = 0;
        }
        boolean zM48609 = i > i3 ? m48608(c3446, c8054, Character.codePointBefore(charSequence, i), i - 1, charSequence) : false;
        if (i < length) {
            zM48608 = m48608(c3446, c8054, Character.codePointAt(charSequence, i), i, charSequence);
        } else {
            c8054.f24842 = true;
            c8054.f24833 = true;
            zM48608 = false;
        }
        if (zM48609 ^ zM48608) {
            i2 = zM48608 ? 1 : 2;
        } else {
            i2 = 4;
        }
        return (c3446.f10891 & i2) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086 A[LOOP:0: B:37:0x005e->B:53:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0089 A[EDGE_INSN: B:60:0x0089->B:54:0x0089 BREAK  A[LOOP:0: B:37:0x005e->B:53:0x0086], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48608(C3446 c3446, C8054 c8054, int i, int i2, CharSequence charSequence) {
        boolean zIsLetterOrDigit;
        int i3;
        boolean z;
        int iCodePointAt;
        boolean zIsLetterOrDigit2;
        if (i < 128) {
            return (i >= 97 && i <= 122) || (i >= 65 && i <= 90) || ((i >= 48 && i <= 57) || i == 95);
        }
        if (!c3446.f10893) {
            int i4 = C2164.f7153;
            if (i > 127) {
                zIsLetterOrDigit = Character.isLetterOrDigit(i);
            } else {
                zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
            }
            if (!zIsLetterOrDigit) {
                if (C2164.m7146(i) == 6) {
                    if (c8054.f24847) {
                        i3 = 0;
                    } else {
                        i3 = c8054.f24828;
                    }
                    while (i2 >= i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                        int i5 = C2164.f7153;
                        if (iCodePointAt > 127) {
                            zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                        } else if (97 > iCodePointAt) {
                        }
                        if (zIsLetterOrDigit2) {
                            if (C2164.m7146(iCodePointAt) == 6) {
                                break;
                                break;
                            }
                            i2--;
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
        } else if (!c3446.f10892.mo2465(i)) {
            if (C2164.m7146(i) == 6) {
                if (c8054.f24847) {
                    i3 = 0;
                } else {
                    i3 = c8054.f24828;
                }
                while (i2 >= i3) {
                    iCodePointAt = Character.codePointAt(charSequence, i2);
                    int i6 = C2164.f7153;
                    if (iCodePointAt > 127) {
                        zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                    } else {
                        zIsLetterOrDigit2 = (97 > iCodePointAt && iCodePointAt <= 122) || (65 <= iCodePointAt && iCodePointAt <= 90) || (48 <= iCodePointAt && iCodePointAt <= 57);
                    }
                    if (zIsLetterOrDigit2) {
                        if (C2164.m7146(iCodePointAt) == 6) {
                            break;
                        }
                        i2--;
                    } else {
                        z = true;
                    }
                    if (z) {
                    }
                }
                z = false;
                if (z) {
                }
            }
        }
    }
}
