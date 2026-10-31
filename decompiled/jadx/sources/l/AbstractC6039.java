package l;

/* JADX INFO: renamed from: l.ۛۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2PE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6039 extends AbstractC13094 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo16874(int i, int i2, String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract char[] mo16876(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m16875(int i, String str) {
        int codePoint;
        int length = str.length();
        char[] cArrM26025 = C10273.m26025();
        int i2 = 0;
        int length2 = 0;
        int iMo16874 = i;
        while (iMo16874 < length) {
            if (iMo16874 < length) {
                int i3 = iMo16874 + 1;
                char cCharAt = str.charAt(iMo16874);
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        codePoint = cCharAt;
                        codePoint = cCharAt;
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + iMo16874 + " in '" + ((Object) str) + "'");
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
                char[] cArrMo16876 = mo16876(codePoint);
                int i4 = (Character.isSupplementaryCodePoint(codePoint) ? 2 : 1) + iMo16874;
                if (cArrMo16876 != null) {
                    int i5 = iMo16874 - i2;
                    int i6 = length2 + i5;
                    int length3 = cArrMo16876.length + i6;
                    if (cArrM26025.length < length3) {
                        int i7 = (length - iMo16874) + length3 + 32;
                        if (i7 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr = new char[i7];
                        if (length2 > 0) {
                            System.arraycopy(cArrM26025, 0, cArr, 0, length2);
                        }
                        cArrM26025 = cArr;
                    }
                    if (i5 > 0) {
                        str.getChars(i2, iMo16874, cArrM26025, length2);
                        length2 = i6;
                    }
                    if (cArrMo16876.length > 0) {
                        System.arraycopy(cArrMo16876, 0, cArrM26025, length2, cArrMo16876.length);
                        length2 += cArrMo16876.length;
                    }
                    i2 = i4;
                }
                iMo16874 = mo16874(i4, length, str);
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + length2;
            if (cArrM26025.length < i9) {
                if (i9 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i9];
                if (length2 > 0) {
                    System.arraycopy(cArrM26025, 0, cArr2, 0, length2);
                }
                cArrM26025 = cArr2;
            }
            str.getChars(i2, length, cArrM26025, length2);
            length2 = i9;
        }
        return new String(cArrM26025, 0, length2);
    }
}
