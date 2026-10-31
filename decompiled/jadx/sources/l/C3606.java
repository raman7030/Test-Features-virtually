package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11431 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f11432;

    public C3606(String str) {
        C16990.m39822((Object) str);
        this.f11432 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m11066() {
        return this.f11432.length() - this.f11431 == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11068(String str) {
        return this.f11432.regionMatches(true, this.f11431, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11065(String... strArr) {
        for (String str : strArr) {
            if (m11068(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11064(String str) {
        if (!m11068(str)) {
            return false;
        }
        this.f11431 = str.length() + this.f11431;
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m11069() {
        boolean z = false;
        while (!m11066() && C20519.m47003(this.f11432.charAt(this.f11431))) {
            this.f11431++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m11071() {
        return !m11066() && Character.isLetterOrDigit(this.f11432.charAt(this.f11431));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m11063() {
        int i = this.f11431;
        this.f11431 = i + 1;
        return this.f11432.charAt(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11061(String str) {
        if (!m11068(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f11432.length();
        int i = this.f11431;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f11431 = i + length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11058() {
        String strM11062;
        int i = this.f11431;
        String str = this.f11432;
        int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END, i);
        if (iIndexOf != -1) {
            strM11062 = str.substring(this.f11431, iIndexOf);
            this.f11431 = strM11062.length() + this.f11431;
        } else {
            strM11062 = m11062();
        }
        m11064(MotionUtils.EASING_TYPE_FORMAT_END);
        return strM11062;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11060(String... strArr) {
        int i = this.f11431;
        while (!m11066() && !m11065(strArr)) {
            this.f11431++;
        }
        return this.f11432.substring(i, this.f11431);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0008->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x0071], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11059(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m11066()) {
            char cM11063 = m11063();
            if (c3 != '\\') {
                if (cM11063 == '\'' && cM11063 != c && !z) {
                    z2 = !z2;
                } else if (cM11063 == '\"' && cM11063 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM11063 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f11431;
                        }
                    } else if (cM11063 == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM11063;
            } else if (cM11063 == 'Q') {
                z3 = true;
            } else if (cM11063 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f11431;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM11063;
        }
        String strSubstring = i2 >= 0 ? this.f11432.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C14167(C4860.m14172("Did not find balanced marker at '", strSubstring, "'"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m11057(String str) {
        StringBuilder sbM47000 = C20519.m47000();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM47000.append(c2);
            } else if (c == '\\') {
                sbM47000.append(c2);
            }
            i++;
            c = c2;
        }
        return C20519.m46998(sbM47000);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m11070() {
        int i = this.f11431;
        while (!m11066() && (m11071() || m11065("*|", "|", "_", "-"))) {
            this.f11431++;
        }
        return this.f11432.substring(i, this.f11431);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m11067() {
        String str;
        int i = this.f11431;
        loop0: while (true) {
            boolean zM11066 = m11066();
            str = this.f11432;
            if (zM11066) {
                break;
            }
            if (!m11071()) {
                char[] cArr = {'-', '_'};
                if (!m11066()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.f11431) == cArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    break;
                }
            }
            this.f11431++;
        }
        return str.substring(i, this.f11431);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m11062() {
        int i = this.f11431;
        String str = this.f11432;
        String strSubstring = str.substring(i);
        this.f11431 = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f11432.substring(this.f11431);
    }
}
