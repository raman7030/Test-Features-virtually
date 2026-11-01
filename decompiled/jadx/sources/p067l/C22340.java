package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C22340 {
    /* JADX INFO: renamed from: ֫ */
    public static C5495 m50156(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C6836 c6836) {
        InterfaceC8848 interfaceC8848M32883 = C14312.m32883(charSequence, new C16482(charSequence2, charSequence3), c6836);
        int length = charSequence2.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C23600 c23600 : interfaceC8848M32883.mo8421()) {
            int i = c23600.f75122;
            int i2 = c23600.f75124;
            int i3 = c23600.f75121;
            int i4 = c23600.f75123;
            if (i <= length) {
                arrayList.add(new C23600(i4, i3, i2, i));
            } else if (i2 >= length) {
                arrayList2.add(new C23600(i4, i3, i2 - length, i - length));
            } else {
                int i5 = (length - i2) + i4;
                arrayList.add(new C23600(i4, i5, i2, length));
                arrayList2.add(new C23600(i5, i3, 0, c23600.f75122 - length));
            }
        }
        return new C5495(C24941.m54812(C24941.m54808(charSequence.length(), charSequence2.length(), arrayList)), C24941.m54812(C24941.m54808(charSequence.length(), charSequence3.length(), arrayList2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50157(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= 0 && i != charSequence.length() && C13061.m29890(charSequence.charAt(i))) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    return true;
                }
                if (C13061.m29890(cCharAt2)) {
                }
            }
            return true;
        }
        if (i < 0 || i == charSequence.length() || !C13061.m29890(charSequence.charAt(i))) {
            return false;
        }
        while (i < charSequence.length() && (cCharAt = charSequence.charAt(i)) != '\n') {
            if (!C13061.m29890(cCharAt)) {
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
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m50155(CharSequence charSequence) {
        EnumC9531 enumC9531M22196;
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            boolean z = (iCodePointAt >= 128 || !C13061.m29890((char) iCodePointAt)) ? !C5575.m12345(iCodePointAt) : false;
            if (z) {
                if (iCodePointAt >= 128 && !Character.isDigit(iCodePointAt)) {
                    int i4 = C4426.f9939;
                    if ((iCodePointAt >>> 16) != 0 || Character.isIdeographic(iCodePointAt) || !Character.isAlphabetic(iCodePointAt) || (enumC9531M22196 = EnumC9531.m22196(iCodePointAt)) == EnumC9531.HIRAGANA || enumC9531M22196 == EnumC9531.KATAKANA || enumC9531M22196 == EnumC9531.THAI || enumC9531M22196 == EnumC9531.JAVANESE) {
                        if (i2 != -1) {
                            arrayList.add(new C8928(i2, i, i3, charSequence));
                            i2 = -1;
                        }
                        if (z) {
                            arrayList.add(new C8928(i, i + iCharCount, iCodePointAt, charSequence));
                        } else if (iCodePointAt == 10) {
                            arrayList.add(new C16303(i));
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
                    arrayList.add(new C8928(i2, i, i3, charSequence));
                    i2 = -1;
                }
                if (z) {
                    arrayList.add(new C8928(i, i + iCharCount, iCodePointAt, charSequence));
                } else if (iCodePointAt == 10) {
                    arrayList.add(new C16303(i));
                }
            }
            i += iCharCount;
        }
        if (i2 != -1) {
            arrayList.add(new C8928(i2, length, i3, charSequence));
        }
        return arrayList;
    }
}
