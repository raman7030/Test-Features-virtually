package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5795 {

    /* JADX INFO: renamed from: ֫ */
    public int f14235 = 0;

    /* JADX INFO: renamed from: ۧ */
    public String f14236;

    public C5795(String str) {
        C18515.m42065((Object) str);
        this.f14236 = str;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m13042() {
        return this.f14236.length() - this.f14235 == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13044(String str) {
        return this.f14236.regionMatches(true, this.f14235, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13041(String... strArr) {
        for (String str : strArr) {
            if (m13044(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13040(String str) {
        if (!m13044(str)) {
            return false;
        }
        this.f14235 = str.length() + this.f14235;
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m13045() {
        boolean z = false;
        while (!m13042() && C21869.m49326(this.f14236.charAt(this.f14235))) {
            this.f14235++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m13047() {
        return !m13042() && Character.isLetterOrDigit(this.f14236.charAt(this.f14235));
    }

    /* JADX INFO: renamed from: ۧ */
    public final char m13039() {
        int i = this.f14235;
        this.f14235 = i + 1;
        return this.f14236.charAt(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13037(String str) {
        if (!m13044(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f14236.length();
        int i = this.f14235;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f14235 = i + length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m13034() {
        String strM13038;
        int i = this.f14235;
        String str = this.f14236;
        int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END, i);
        if (iIndexOf != -1) {
            strM13038 = str.substring(this.f14235, iIndexOf);
            this.f14235 = strM13038.length() + this.f14235;
        } else {
            strM13038 = m13038();
        }
        m13040(MotionUtils.EASING_TYPE_FORMAT_END);
        return strM13038;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m13036(String... strArr) {
        int i = this.f14235;
        while (!m13042() && !m13041(strArr)) {
            this.f14235++;
        }
        return this.f14236.substring(i, this.f14235);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0008->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x0071], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final String m13035(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m13042()) {
            char cM13039 = m13039();
            if (c3 != '\\') {
                if (cM13039 == '\'' && cM13039 != c && !z) {
                    z2 = !z2;
                } else if (cM13039 == '\"' && cM13039 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM13039 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f14235;
                        }
                    } else if (cM13039 == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM13039;
            } else if (cM13039 == 'Q') {
                z3 = true;
            } else if (cM13039 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f14235;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM13039;
        }
        String strSubstring = i2 >= 0 ? this.f14236.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C15832(C6988.m16053("Did not find balanced marker at '", strSubstring, "'"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m13033(String str) {
        StringBuilder sbM49323 = C21869.m49323();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM49323.append(c2);
            } else if (c == '\\') {
                sbM49323.append(c2);
            }
            i++;
            c = c2;
        }
        return C21869.m49321(sbM49323);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m13046() {
        int i = this.f14235;
        while (!m13042() && (m13047() || m13041("*|", "|", "_", "-"))) {
            this.f14235++;
        }
        return this.f14236.substring(i, this.f14235);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m13043() {
        String str;
        int i = this.f14235;
        loop0: while (true) {
            boolean zM13042 = m13042();
            str = this.f14236;
            if (zM13042) {
                break;
            }
            if (!m13047()) {
                char[] cArr = {'-', '_'};
                if (!m13042()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.f14235) == cArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    break;
                }
            }
            this.f14235++;
        }
        return str.substring(i, this.f14235);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m13038() {
        int i = this.f14235;
        String str = this.f14236;
        String strSubstring = str.substring(i);
        this.f14235 = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f14236.substring(this.f14235);
    }
}
