package p067l;

/* JADX INFO: renamed from: l.᩸۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C22764 {
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m50944(int i, boolean z, C10023 c10023, int i2, CharSequence charSequence) {
        int i3;
        switch (i) {
            case 0:
                if (i2 == (c10023.f27756 ? c10023.f27741 : 0)) {
                    return true;
                }
                return false;
            case 1:
                if (i2 == (c10023.f27756 ? c10023.f27757 : c10023.f27749.length())) {
                    c10023.f27755 = true;
                    return true;
                }
                return false;
            case 2:
            case 3:
                int i4 = c10023.f27741;
                int length = c10023.f27757;
                if (!c10023.f27756) {
                    length = c10023.f27749.length();
                    i4 = 0;
                }
                if (i2 == length) {
                    c10023.f27755 = true;
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
                int length2 = c10023.f27756 ? c10023.f27757 : c10023.f27749.length();
                if (z || (i2 >= (i3 = length2 - 2) && (i2 != i3 || (charSequence.charAt(i2) == '\r' && charSequence.charAt(i2 + 1) == '\n')))) {
                    if (i2 < length2) {
                        char cCharAt2 = charSequence.charAt(i2);
                        if (cCharAt2 == '\n') {
                            if (i2 <= 0 || charSequence.charAt(i2 - 1) != '\r') {
                            }
                        } else if (cCharAt2 == '\r' || cCharAt2 == 133 || (cCharAt2 | 1) == 8233) {
                        }
                    }
                    c10023.f27755 = true;
                    c10023.f27746 = true;
                    return true;
                }
                return false;
            case 5:
                int length3 = c10023.f27756 ? c10023.f27757 : c10023.f27749.length();
                if (i2 < length3) {
                    if (charSequence.charAt(i2) == '\n' && (z || i2 == length3 - 1)) {
                    }
                    return false;
                }
                c10023.f27755 = true;
                c10023.f27746 = true;
                return true;
            case 6:
                if (i2 == c10023.m23352()) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException(C20778.m46922(i, "Unknown zero-width anchor: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50946(C5644 c5644, C10023 c10023, int i, CharSequence charSequence) {
        boolean zM50945;
        int i2;
        int i3 = c10023.f27741;
        int length = c10023.f27757;
        if (c10023.f27760) {
            length = c10023.f27749.length();
            i3 = 0;
        }
        boolean zM50946 = i > i3 ? m50945(c5644, c10023, Character.codePointBefore(charSequence, i), i - 1, charSequence) : false;
        if (i < length) {
            zM50945 = m50945(c5644, c10023, Character.codePointAt(charSequence, i), i, charSequence);
        } else {
            c10023.f27755 = true;
            c10023.f27746 = true;
            zM50945 = false;
        }
        if (zM50946 ^ zM50945) {
            i2 = zM50945 ? 1 : 2;
        } else {
            i2 = 4;
        }
        return (c5644.f13693 & i2) > 0;
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
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50945(C5644 c5644, C10023 c10023, int i, int i2, CharSequence charSequence) {
        boolean zIsLetterOrDigit;
        int i3;
        boolean z;
        int iCodePointAt;
        boolean zIsLetterOrDigit2;
        if (i < 128) {
            return (i >= 97 && i <= 122) || (i >= 65 && i <= 90) || ((i >= 48 && i <= 57) || i == 95);
        }
        if (!c5644.f13695) {
            int i4 = C4426.f9939;
            if (i > 127) {
                zIsLetterOrDigit = Character.isLetterOrDigit(i);
            } else {
                zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
            }
            if (!zIsLetterOrDigit) {
                if (C4426.m9241(i) == 6) {
                    if (c10023.f27760) {
                        i3 = 0;
                    } else {
                        i3 = c10023.f27741;
                    }
                    while (i2 >= i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                        int i5 = C4426.f9939;
                        if (iCodePointAt > 127) {
                            zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                        } else if (97 > iCodePointAt) {
                        }
                        if (zIsLetterOrDigit2) {
                            if (C4426.m9241(iCodePointAt) == 6) {
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
        } else if (!c5644.f13694.mo4821(i)) {
            if (C4426.m9241(i) == 6) {
                if (c10023.f27760) {
                    i3 = 0;
                } else {
                    i3 = c10023.f27741;
                }
                while (i2 >= i3) {
                    iCodePointAt = Character.codePointAt(charSequence, i2);
                    int i6 = C4426.f9939;
                    if (iCodePointAt > 127) {
                        zIsLetterOrDigit2 = Character.isLetterOrDigit(iCodePointAt);
                    } else {
                        zIsLetterOrDigit2 = (97 > iCodePointAt && iCodePointAt <= 122) || (65 <= iCodePointAt && iCodePointAt <= 90) || (48 <= iCodePointAt && iCodePointAt <= 57);
                    }
                    if (zIsLetterOrDigit2) {
                        if (C4426.m9241(iCodePointAt) == 6) {
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
