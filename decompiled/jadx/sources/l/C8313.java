package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۠ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C8313 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21915(CharSequence charSequence, CharSequence charSequence2, EnumC5491 enumC5491) {
        boolean z;
        boolean z2;
        int i = C1257.f4450[enumC5491.ordinal()];
        if (i == 1) {
            return TextUtils.equals(charSequence, charSequence2);
        }
        if (i != 2) {
            if (i == 3) {
                return C11250.m27831(charSequence, charSequence2);
            }
            throw new IllegalArgumentException(enumC5491.name());
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
            if ((z2 ^ z) || !C11250.m27835(charSequence.subSequence(i2, iIndexOf), charSequence2.subSequence(i3, iIndexOf2))) {
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
