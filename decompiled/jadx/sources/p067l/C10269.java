package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۠ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C10269 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m23885(CharSequence charSequence, CharSequence charSequence2, EnumC7587 enumC7587) {
        boolean z;
        boolean z2;
        int i = C3563.f7220[enumC7587.ordinal()];
        if (i == 1) {
            return TextUtils.equals(charSequence, charSequence2);
        }
        if (i != 2) {
            if (i == 3) {
                return C13061.m29893(charSequence, charSequence2);
            }
            throw new IllegalArgumentException(enumC7587.name());
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf = TextUtils.indexOf(charSequence, '\n', i2) + 1;
            int iIndexOf2 = TextUtils.indexOf(charSequence2, '\n', i3) + 1;
            if (iIndexOf == 0) {
                iIndexOf = charSequence.length();
                z = true;
            } else {
                z = false;
            }
            if (iIndexOf2 == 0) {
                iIndexOf2 = charSequence2.length();
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z2 ^ z) || !C13061.m29897(charSequence.subSequence(i2, iIndexOf), charSequence2.subSequence(i3, iIndexOf2))) {
                break;
            }
            if (z) {
                return true;
            }
            i3 = iIndexOf2;
            i2 = iIndexOf;
        }
        return false;
    }
}
