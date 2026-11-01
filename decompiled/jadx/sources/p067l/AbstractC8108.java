package p067l;

/* JADX INFO: renamed from: l.ۛۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2PE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8108 extends AbstractC14813 {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo18802(int i, int i2, String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract char[] mo18804(int i);

    /* JADX INFO: renamed from: ֫ */
    public final String m18803(int i, String str) {
        int codePoint;
        int length = str.length();
        char[] cArrM28047 = C12132.m28047();
        int i2 = 0;
        int length2 = 0;
        int iMo18802 = i;
        while (iMo18802 < length) {
            if (iMo18802 < length) {
                int i3 = iMo18802 + 1;
                char cCharAt = str.charAt(iMo18802);
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        codePoint = cCharAt;
                        codePoint = cCharAt;
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + iMo18802 + " in '" + ((Object) str) + "'");
                    }
                    if (i3 == length) {
                        codePoint = -cCharAt;
                    } else {
                        char cCharAt2 = str.charAt(i3);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i3 + " in '" + ((Object) str) + "'");
                        }
                    }
                }
                if (codePoint < 0) {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
                char[] cArrMo18804 = mo18804(codePoint);
                int i4 = (Character.isSupplementaryCodePoint(codePoint) ? 2 : 1) + iMo18802;
                if (cArrMo18804 != null) {
                    int i5 = iMo18802 - i2;
                    int i6 = length2 + i5;
                    int length3 = cArrMo18804.length + i6;
                    if (cArrM28047.length < length3) {
                        int i7 = (length - iMo18802) + length3 + 32;
                        if (i7 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr = new char[i7];
                        if (length2 > 0) {
                            System.arraycopy(cArrM28047, 0, cArr, 0, length2);
                        }
                        cArrM28047 = cArr;
                    }
                    if (i5 > 0) {
                        str.getChars(i2, iMo18802, cArrM28047, length2);
                        length2 = i6;
                    }
                    if (cArrMo18804.length > 0) {
                        System.arraycopy(cArrMo18804, 0, cArrM28047, length2, cArrMo18804.length);
                        length2 += cArrMo18804.length;
                    }
                    i2 = i4;
                }
                iMo18802 = mo18802(i4, length, str);
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + length2;
            if (cArrM28047.length < i9) {
                if (i9 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i9];
                if (length2 > 0) {
                    System.arraycopy(cArrM28047, 0, cArr2, 0, length2);
                }
                cArrM28047 = cArr2;
            }
            str.getChars(i2, length, cArrM28047, length2);
            length2 = i9;
        }
        return new String(cArrM28047, 0, length2);
    }
}
