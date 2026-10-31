package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10456 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31388;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31389;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f31390;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31391;

    public C10456(int i, int i2, CharSequence charSequence) {
        this.f31390 = charSequence;
        this.f31388 = i;
        this.f31389 = i;
        this.f31387 = i;
        this.f31391 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26309(char c) {
        int iIndexOf = TextUtils.indexOf(this.f31390, c, this.f31387);
        if (iIndexOf == -1 || iIndexOf >= this.f31391) {
            return false;
        }
        this.f31387 = iIndexOf + 1;
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m26315() {
        return this.f31387 >= this.f31391;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final char m26313() {
        if (m26315()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f31387), Integer.valueOf(this.f31391)));
        }
        int i = this.f31387;
        this.f31387 = i + 1;
        return this.f31390.charAt(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m26318() {
        CharSequence charSequence;
        char cCharAt;
        char cCharAt2;
        if (m26315()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f31387), Integer.valueOf(this.f31391)));
        }
        int i = this.f31387;
        do {
            boolean zM26315 = m26315();
            charSequence = this.f31390;
            if (!zM26315) {
                int i2 = this.f31387;
                this.f31387 = i2 + 1;
                cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    break;
                }
            } else {
                break;
            }
        } while (cCharAt2 != '\r');
        int i3 = this.f31387;
        while (!m26315() && ((cCharAt = charSequence.charAt(this.f31387)) == '\n' || cCharAt == '\r')) {
            this.f31387++;
        }
        while (i < i3 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (i < i3 && charSequence.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        this.f31389 = i;
        this.f31388 = i3;
        return charSequence.subSequence(i, i3).toString();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m26310() {
        while (!m26315()) {
            char cM26313 = m26313();
            if (cM26313 != ' ' && cM26313 != '\t' && cM26313 != '\n' && cM26313 != '\r') {
                this.f31387--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m26311() {
        while (!m26315()) {
            char cM26313 = m26313();
            if (cM26313 == '\"') {
                return true;
            }
            if (cM26313 == '\\' && !m26315()) {
                this.f31387++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26317() {
        while (!m26315()) {
            char cM26313 = m26313();
            if (cM26313 == '\'') {
                return true;
            }
            if (cM26313 == '\\' && !m26315()) {
                this.f31387++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26308() {
        char cM26313 = m26313();
        if (cM26313 == '\"') {
            m26311();
        } else if (cM26313 != '\'') {
            int i = 1;
            if (cM26313 != '{') {
                while (!m26315()) {
                    char cM26314 = m26313();
                    if (cM26314 == ' ' || cM26314 == '\t' || cM26314 == '\n' || cM26314 == '\r') {
                        this.f31387--;
                        break;
                    }
                }
            } else {
                while (!m26315()) {
                    char cM26315 = m26313();
                    if (cM26315 != '\"') {
                        if (cM26315 != '\'') {
                            if (cM26315 == '{') {
                                i++;
                            } else if (cM26315 == '}' && (i = i - 1) == 0) {
                                break;
                            }
                        } else if (!m26317()) {
                            break;
                        }
                    } else if (!m26311()) {
                        break;
                    }
                }
            }
        } else {
            m26317();
        }
        return this.f31387;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26312() {
        return this.f31387;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26316() {
        return this.f31389;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26314() {
        return this.f31388;
    }
}
