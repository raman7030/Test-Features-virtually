package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12306 {

    /* JADX INFO: renamed from: ֫ */
    public int f34350;

    /* JADX INFO: renamed from: ۧ */
    public int f34351;

    /* JADX INFO: renamed from: ܽ */
    public int f34352;

    /* JADX INFO: renamed from: ܿ */
    public final CharSequence f34353;

    /* JADX INFO: renamed from: ᩳ */
    public int f34354;

    public C12306(int i, int i2, CharSequence charSequence) {
        this.f34353 = charSequence;
        this.f34351 = i;
        this.f34352 = i;
        this.f34350 = i;
        this.f34354 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28339(char c) {
        int iIndexOf = TextUtils.indexOf(this.f34353, c, this.f34350);
        if (iIndexOf == -1 || iIndexOf >= this.f34354) {
            return false;
        }
        this.f34350 = iIndexOf + 1;
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m28345() {
        return this.f34350 >= this.f34354;
    }

    /* JADX INFO: renamed from: ܳ */
    public final char m28343() {
        if (m28345()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f34350), Integer.valueOf(this.f34354)));
        }
        int i = this.f34350;
        this.f34350 = i + 1;
        return this.f34353.charAt(i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m28348() {
        CharSequence charSequence;
        char cCharAt;
        char cCharAt2;
        if (m28345()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f34350), Integer.valueOf(this.f34354)));
        }
        int i = this.f34350;
        do {
            boolean zM28345 = m28345();
            charSequence = this.f34353;
            if (!zM28345) {
                int i2 = this.f34350;
                this.f34350 = i2 + 1;
                cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    break;
                }
            } else {
                break;
            }
        } while (cCharAt2 != '\r');
        int i3 = this.f34350;
        while (!m28345() && ((cCharAt = charSequence.charAt(this.f34350)) == '\n' || cCharAt == '\r')) {
            this.f34350++;
        }
        while (i < i3 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (i < i3 && charSequence.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        this.f34352 = i;
        this.f34351 = i3;
        return charSequence.subSequence(i, i3).toString();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m28340() {
        while (!m28345()) {
            char cM28343 = m28343();
            if (cM28343 != ' ' && cM28343 != '\t' && cM28343 != '\n' && cM28343 != '\r') {
                this.f34350--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m28341() {
        while (!m28345()) {
            char cM28343 = m28343();
            if (cM28343 == '\"') {
                return true;
            }
            if (cM28343 == '\\' && !m28345()) {
                this.f34350++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m28347() {
        while (!m28345()) {
            char cM28343 = m28343();
            if (cM28343 == '\'') {
                return true;
            }
            if (cM28343 == '\\' && !m28345()) {
                this.f34350++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28338() {
        char cM28343 = m28343();
        if (cM28343 == '\"') {
            m28341();
        } else if (cM28343 != '\'') {
            int i = 1;
            if (cM28343 != '{') {
                while (!m28345()) {
                    char cM28344 = m28343();
                    if (cM28344 == ' ' || cM28344 == '\t' || cM28344 == '\n' || cM28344 == '\r') {
                        this.f34350--;
                        break;
                    }
                }
            } else {
                while (!m28345()) {
                    char cM28345 = m28343();
                    if (cM28345 != '\"') {
                        if (cM28345 != '\'') {
                            if (cM28345 == '{') {
                                i++;
                            } else if (cM28345 == '}' && (i = i - 1) == 0) {
                                break;
                            }
                        } else if (!m28347()) {
                            break;
                        }
                    } else if (!m28341()) {
                        break;
                    }
                }
            }
        } else {
            m28347();
        }
        return this.f34350;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28342() {
        return this.f34350;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28346() {
        return this.f34352;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28344() {
        return this.f34351;
    }
}
