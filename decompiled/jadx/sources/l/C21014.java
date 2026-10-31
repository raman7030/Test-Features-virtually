package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C21014 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3290 m47826(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C4701 c4701) {
        InterfaceC6818 interfaceC6818M30808 = C12567.m30808(charSequence, new C14850(charSequence2, charSequence3), c4701);
        int length = charSequence2.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C22340 c22340 : interfaceC6818M30808.mo6219()) {
            int i = c22340.f72396;
            int i2 = c22340.f72398;
            int i3 = c22340.f72395;
            int i4 = c22340.f72397;
            if (i <= length) {
                arrayList.add(new C22340(i4, i3, i2, i));
            } else if (i2 >= length) {
                arrayList2.add(new C22340(i4, i3, i2 - length, i - length));
            } else {
                int i5 = (length - i2) + i4;
                arrayList.add(new C22340(i4, i5, i2, length));
                arrayList2.add(new C22340(i5, i3, 0, c22340.f72396 - length));
            }
        }
        return new C3290(C23751.m52403(C23751.m52399(charSequence.length(), charSequence2.length(), arrayList)), C23751.m52403(C23751.m52399(charSequence.length(), charSequence3.length(), arrayList2)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47827(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= 0 && i != charSequence.length() && C11250.m27828(charSequence.charAt(i))) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    return true;
                }
                if (C11250.m27828(cCharAt2)) {
                }
            }
            return true;
        }
        if (i < 0 || i == charSequence.length() || !C11250.m27828(charSequence.charAt(i))) {
            return false;
        }
        while (i < charSequence.length() && (cCharAt = charSequence.charAt(i)) != '\n') {
            if (!C11250.m27828(cCharAt)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47825(CharSequence charSequence) {
        EnumC7536 enumC7536M20220;
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            boolean z = (iCodePointAt >= 128 || !C11250.m27828((char) iCodePointAt)) ? !C3374.m10308(iCodePointAt) : false;
            if (z) {
                if (iCodePointAt >= 128 && !Character.isDigit(iCodePointAt)) {
                    int i4 = C2164.f7153;
                    if ((iCodePointAt >>> 16) != 0 || Character.isIdeographic(iCodePointAt) || !Character.isAlphabetic(iCodePointAt) || (enumC7536M20220 = EnumC7536.m20220(iCodePointAt)) == EnumC7536.HIRAGANA || enumC7536M20220 == EnumC7536.KATAKANA || enumC7536M20220 == EnumC7536.THAI || enumC7536M20220 == EnumC7536.JAVANESE) {
                        if (i2 != -1) {
                            arrayList.add(new C6902(i2, i, i3, charSequence));
                            i2 = -1;
                        }
                        if (z) {
                            arrayList.add(new C6902(i, i + iCharCount, iCodePointAt, charSequence));
                        } else if (iCodePointAt == 10) {
                            arrayList.add(new C14662(i));
                        }
                    }
                }
                if (i2 == -1) {
                    i3 = 0;
                    i2 = i;
                }
                i3 = (i3 * 31) + iCodePointAt;
            } else {
                if (i2 != -1) {
                    arrayList.add(new C6902(i2, i, i3, charSequence));
                    i2 = -1;
                }
                if (z) {
                    arrayList.add(new C6902(i, i + iCharCount, iCodePointAt, charSequence));
                } else if (iCodePointAt == 10) {
                    arrayList.add(new C14662(i));
                }
            }
            i += iCharCount;
        }
        if (i2 != -1) {
            arrayList.add(new C6902(i2, length, i3, charSequence));
        }
        return arrayList;
    }
}
