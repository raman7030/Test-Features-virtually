package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ᩳᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56692;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f56693;

    public C18242(String str, int i) {
        this.f56693 = str;
        this.f56692 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42521(int i) {
        if ((this.f56692 & 4) == 0) {
            return i;
        }
        String str = this.f56693;
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!C22165.m49801(cCharAt, 2048)) {
                if (cCharAt != '#') {
                    break;
                }
                do {
                    i++;
                    if (i >= length || str.charAt(i) == 0) {
                        break;
                    }
                } while (!C21065.m47948(str.charAt(i), this.f56692));
            } else {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42522(int i, BitSet bitSet, int[] iArr) {
        int iM42521;
        String str = this.f56693;
        int length = str.length();
        int i2 = i + 1;
        if (i2 == length) {
            return i2;
        }
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        if (iCodePointAt == 99) {
            int iM42522 = m42521(iCharCount);
            if (iM42522 >= length) {
                return iM42522;
            }
            bitSet.set(iArr[iM42522]);
            return Character.charCount(str.codePointAt(iM42522)) + iM42522;
        }
        if (iCodePointAt == 117) {
            for (int i3 = 0; i3 < 4 && iCharCount < length; i3++) {
                int iM42523 = m42521(iCharCount);
                if (iM42523 < length) {
                    iM42523++;
                }
                iCharCount = iM42523;
            }
            return iCharCount;
        }
        int i4 = 2;
        if (iCodePointAt != 120 && iCodePointAt != 112 && iCodePointAt != 80 && iCodePointAt != 78) {
            if (iCodePointAt == 48) {
                int iM42524 = m42521(iCharCount);
                if (iM42524 < length && str.charAt(iM42524) <= '3') {
                    i4 = 3;
                }
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || (iM42521 = m42521(iCharCount)) == length || str.charAt(iM42521) < '0' || str.charAt(iM42521) > '7') {
                        break;
                    }
                    iCharCount = iM42521 + 1;
                    i4 = i5;
                }
            }
            return iCharCount;
        }
        int iM42525 = m42521(iCharCount);
        if (iM42525 < length && str.charAt(iM42525) == '{') {
            do {
                iM42525 = m42521(iM42525 + 1);
                if (iM42525 >= length) {
                    break;
                }
            } while (str.charAt(iM42525) != '}');
            return iM42525 < length ? iM42525 + 1 : iM42525;
        }
        int i6 = iCodePointAt == 120 ? 2 : 1;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0 || iM42525 >= length) {
                break;
            }
            iM42525 = m42521(iM42525);
            if (iM42525 < length) {
                iM42525 += Character.charCount(str.codePointAt(iM42525));
            }
            i6 = i7;
        }
        return iM42525;
    }
}
