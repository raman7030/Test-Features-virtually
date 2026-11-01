package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19706 {

    /* JADX INFO: renamed from: ֫ */
    public int f59910;

    /* JADX INFO: renamed from: ۧ */
    public final String f59911;

    public C19706(String str, int i) {
        this.f59911 = str;
        this.f59910 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44780(int i) {
        if ((this.f59910 & 4) == 0) {
            return i;
        }
        String str = this.f59911;
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!C23434.m52139(cCharAt, 2048)) {
                if (cCharAt != '#') {
                    break;
                }
                do {
                    i++;
                    if (i >= length || str.charAt(i) == 0) {
                        break;
                    }
                } while (!C22389.m50278(str.charAt(i), this.f59910));
            } else {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44781(int i, BitSet bitSet, int[] iArr) {
        int iM44780;
        String str = this.f59911;
        int length = str.length();
        int i2 = i + 1;
        if (i2 == length) {
            return i2;
        }
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        if (iCodePointAt == 99) {
            int iM44781 = m44780(iCharCount);
            if (iM44781 >= length) {
                return iM44781;
            }
            bitSet.set(iArr[iM44781]);
            return Character.charCount(str.codePointAt(iM44781)) + iM44781;
        }
        if (iCodePointAt == 117) {
            for (int i3 = 0; i3 < 4 && iCharCount < length; i3++) {
                int iM44782 = m44780(iCharCount);
                if (iM44782 < length) {
                    iM44782++;
                }
                iCharCount = iM44782;
            }
            return iCharCount;
        }
        int i4 = 2;
        if (iCodePointAt != 120 && iCodePointAt != 112 && iCodePointAt != 80 && iCodePointAt != 78) {
            if (iCodePointAt == 48) {
                int iM44783 = m44780(iCharCount);
                if (iM44783 < length && str.charAt(iM44783) <= '3') {
                    i4 = 3;
                }
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || (iM44780 = m44780(iCharCount)) == length || str.charAt(iM44780) < '0' || str.charAt(iM44780) > '7') {
                        break;
                    }
                    iCharCount = iM44780 + 1;
                    i4 = i5;
                }
            }
            return iCharCount;
        }
        int iM44784 = m44780(iCharCount);
        if (iM44784 < length && str.charAt(iM44784) == '{') {
            do {
                iM44784 = m44780(iM44784 + 1);
                if (iM44784 >= length) {
                    break;
                }
            } while (str.charAt(iM44784) != '}');
            return iM44784 < length ? iM44784 + 1 : iM44784;
        }
        int i6 = iCodePointAt == 120 ? 2 : 1;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0 || iM44784 >= length) {
                break;
            }
            iM44784 = m44780(iM44784);
            if (iM44784 < length) {
                iM44784 += Character.charCount(str.codePointAt(iM44784));
            }
            i6 = i7;
        }
        return iM44784;
    }
}
