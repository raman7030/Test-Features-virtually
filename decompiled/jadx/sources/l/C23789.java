package l;

/* JADX INFO: renamed from: l.᩻ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85KM */
/* JADX INFO: loaded from: classes.dex */
public final class C23789 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52464(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        int i3 = 0;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(true, i, (String) charSequence2, 0, i2);
        }
        int length = charSequence.length() - i;
        int length2 = charSequence2.length();
        if (i < 0 || i2 < 0 || length < i2 || length2 < i2) {
            return false;
        }
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return true;
            }
            int i5 = i + 1;
            char cCharAt = charSequence.charAt(i);
            int i6 = i3 + 1;
            char cCharAt2 = charSequence2.charAt(i3);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }
}
