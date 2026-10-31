package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18538 implements InterfaceC14303 {
    public final InterfaceC14303 a;
    public final int b;
    public final char c;

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        boolean z = c3015.c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && c3015.a(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int iM = this.a.m(c3015, charSequence.subSequence(0, length), i2);
        return (iM == length || !z) ? iM : ~(i + i2);
    }

    public C18538(InterfaceC14303 interfaceC14303, int i, char c) {
        this.a = interfaceC14303;
        this.b = i;
        this.c = c;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.l(c10071, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new C16232("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = MotionUtils.EASING_TYPE_FORMAT_END;
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
