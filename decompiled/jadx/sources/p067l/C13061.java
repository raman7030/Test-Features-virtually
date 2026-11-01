package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۧ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC3T */
/* JADX INFO: loaded from: classes3.dex */
public final class C13061 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m29890(char c) {
        return c == '\n' || c == '\t' || c == ' ';
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29891(int i) {
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m29895(int i) {
        return i >= 100 && i < 200;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m29899(int i, byte[] bArr) {
        if (i >= 3) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            if (i2 == 239 && i3 == 187 && i4 == 191) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29892(int i, byte[] bArr) {
        if (i >= 2) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            if (i2 == 254 && i3 == 255) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29893(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) ^ (charSequence2 == null)) {
            return false;
        }
        if (charSequence == null) {
            return true;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < length2) {
            if (charSequence.charAt(i) == charSequence2.charAt(i2)) {
                i++;
                i2++;
            } else {
                boolean z = false;
                while (i != length && m29890(charSequence.charAt(i))) {
                    i++;
                    z = true;
                }
                while (i2 != length2 && m29890(charSequence2.charAt(i2))) {
                    i2++;
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
        }
        while (i != length) {
            if (!m29890(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        while (i2 != length2) {
            if (!m29890(charSequence2.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m29896(int i, byte[] bArr) {
        if (i >= 2) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            if (i2 == 255 && i3 == 254) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29894(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 'J' || cCharAt == 'D';
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m29898(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 0 && i3 == 0 && i4 == 254 && i5 == 255) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m29900(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && i4 == 0 && i5 == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m29897(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && m29890(charSequence.charAt(i2))) {
            i2++;
        }
        while (i2 < length && m29890(charSequence.charAt(length - 1))) {
            length--;
        }
        while (i < length2 && m29890(charSequence2.charAt(i))) {
            i++;
        }
        while (i < length2 && m29890(charSequence2.charAt(length2 - 1))) {
            length2--;
        }
        return TextUtils.equals(new C19165(i2, length, charSequence), new C19165(i, length2, charSequence2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m29889(int i, int i2, CharSequence charSequence) {
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 31) + charSequence.charAt(i);
            i++;
        }
        return iCharAt;
    }
}
