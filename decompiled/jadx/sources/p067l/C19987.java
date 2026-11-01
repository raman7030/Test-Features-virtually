package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19987 implements InterfaceC15962 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15962 f60673a;

    /* JADX INFO: renamed from: b */
    public final int f60674b;

    /* JADX INFO: renamed from: c */
    public final char f60675c;

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        boolean z = c5234.f12336c;
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.f60674b + i;
        if (length > charSequence.length()) {
            if (z) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && c5234.m11287a(charSequence.charAt(i2), this.f60675c)) {
            i2++;
        }
        int iMo9637m = this.f60673a.mo9637m(c5234, charSequence.subSequence(0, length), i2);
        return (iMo9637m == length || !z) ? iMo9637m : ~(i + i2);
    }

    public C19987(InterfaceC15962 interfaceC15962, int i, char c) {
        this.f60673a = interfaceC15962;
        this.f60674b = i;
        this.f60675c = c;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        int length = sb.length();
        if (!this.f60673a.mo9636l(c11940, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f60674b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f60675c);
            }
            return true;
        }
        throw new C17796("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.f60675c;
        if (c == ' ') {
            str = MotionUtils.EASING_TYPE_FORMAT_END;
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.f60673a + "," + this.f60674b + str;
    }
}
