package l;

/* JADX INFO: renamed from: l.۟ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D94Y */
/* JADX INFO: loaded from: classes3.dex */
public class C7249 extends C22771 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m19395(int i, CharSequence charSequence, String str, boolean z) {
        C11233.m27805(charSequence, "<this>");
        C11233.m27805(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m19398(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m19396(CharSequence charSequence) {
        C11233.m27805(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m19398(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C22521 c22521;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c22521 = new C4882(i, i2, 1);
        } else {
            int iM19396 = m19396(charSequence);
            if (i > iM19396) {
                i = iM19396;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c22521 = new C22521(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = c22521.getFirst();
            int last = c22521.getLast();
            int iM50495 = c22521.m50495();
            if ((iM50495 > 0 && first <= last) || (iM50495 < 0 && last <= first)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (C22771.m50848(0, first, str.length(), str, (String) charSequence, z)) {
                        return first;
                    }
                    if (first != last) {
                        first += iM50495;
                    }
                }
            }
        } else {
            int first2 = c22521.getFirst();
            int last2 = c22521.getLast();
            int iM50496 = c22521.m50495();
            if ((iM50496 > 0 && first2 <= last2) || (iM50496 < 0 && last2 <= first2)) {
                while (true) {
                    int length2 = charSequence2.length();
                    C11233.m27805(charSequence, "other");
                    if (first2 >= 0 && charSequence2.length() - length2 >= 0 && first2 <= charSequence.length() - length2) {
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (C0899.m3252(charSequence2.charAt(i3), charSequence.charAt(first2 + i3), z)) {
                            }
                        }
                        return first2;
                    }
                    if (first2 != last2) {
                        first2 += iM50496;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m19399(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m19395(0, charSequence, str, z);
    }
}
