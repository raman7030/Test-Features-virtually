package p067l;

/* JADX INFO: renamed from: l.۟ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D94Y */
/* JADX INFO: loaded from: classes3.dex */
public class C9258 extends C24010 {
    /* JADX INFO: renamed from: ֫ */
    public static final int m21361(int i, CharSequence charSequence, String str, boolean z) {
        C13045.m29867(charSequence, "<this>");
        C13045.m29867(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m21364(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final int m21362(CharSequence charSequence) {
        C13045.m29867(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final int m21364(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C23773 c23773;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c23773 = new C7009(i, i2, 1);
        } else {
            int iM21362 = m21362(charSequence);
            if (i > iM21362) {
                i = iM21362;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c23773 = new C23773(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = c23773.getFirst();
            int last = c23773.getLast();
            int iM52837 = c23773.m52837();
            if ((iM52837 > 0 && first <= last) || (iM52837 < 0 && last <= first)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (C24010.m53191(0, first, str.length(), str, (String) charSequence, z)) {
                        return first;
                    }
                    if (first != last) {
                        first += iM52837;
                    }
                }
            }
        } else {
            int first2 = c23773.getFirst();
            int last2 = c23773.getLast();
            int iM52838 = c23773.m52837();
            if ((iM52838 > 0 && first2 <= last2) || (iM52838 < 0 && last2 <= first2)) {
                while (true) {
                    int length2 = charSequence2.length();
                    C13045.m29867(charSequence, "other");
                    if (first2 >= 0 && charSequence2.length() - length2 >= 0 && first2 <= charSequence.length() - length2) {
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (C3223.m5571(charSequence2.charAt(i3), charSequence.charAt(first2 + i3), z)) {
                            }
                        }
                        return first2;
                    }
                    if (first2 != last2) {
                        first2 += iM52838;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ int m21365(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m21361(0, charSequence, str, z);
    }
}
