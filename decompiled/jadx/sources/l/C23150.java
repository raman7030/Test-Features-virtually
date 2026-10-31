package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩺ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes.dex */
public final class C23150 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f74412;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74413;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC5491 f74414;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f74415;

    public C23150(CharSequence charSequence, EnumC5491 enumC5491) {
        int iHashCode;
        int iM27827;
        this.f74415 = charSequence;
        this.f74414 = enumC5491;
        int i = C11862.f35385[enumC5491.ordinal()];
        if (i == 1) {
            if ((charSequence instanceof String) || (charSequence instanceof C17673)) {
                iHashCode = charSequence.hashCode();
            } else {
                iHashCode = C11250.m27827(0, charSequence.length(), charSequence);
            }
            iM27827 = iHashCode;
        } else if (i == 2) {
            int iM10309 = C3374.m10309(0, charSequence.length(), charSequence);
            iM27827 = C11250.m27827(iM10309, C3374.m10305(iM10309, charSequence.length(), charSequence), charSequence);
        } else if (i == 3) {
            int length = charSequence.length();
            iM27827 = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (!C11250.m27828(cCharAt)) {
                    iM27827 = (iM27827 * 31) + cCharAt;
                }
            }
        } else {
            throw new IllegalArgumentException(enumC5491.name());
        }
        this.f74412 = iM27827;
        int length2 = charSequence.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!C11250.m27828(charSequence.charAt(i4))) {
                i3++;
            }
        }
        this.f74413 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m51330() {
        return this.f74415;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m51331() {
        return this.f74413;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23150.class != obj.getClass()) {
            return false;
        }
        C23150 c23150 = (C23150) obj;
        if (this.f74412 != c23150.f74412) {
            return false;
        }
        CharSequence charSequence = c23150.f74415;
        int[] iArr = C11862.f35385;
        EnumC5491 enumC5491 = this.f74414;
        int i = iArr[enumC5491.ordinal()];
        CharSequence charSequence2 = this.f74415;
        if (i == 1) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i == 2) {
            return C11250.m27835(charSequence2, charSequence);
        }
        if (i == 3) {
            return C11250.m27831(charSequence2, charSequence);
        }
        throw new IllegalArgumentException(enumC5491.toString());
    }

    public final int hashCode() {
        return this.f74412;
    }
}
