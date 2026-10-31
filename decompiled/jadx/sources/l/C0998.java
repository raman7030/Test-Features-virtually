package l;

/* JADX INFO: renamed from: l.֨۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0998 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3491(int[] iArr, int i, C8054 c8054, CharSequence charSequence, int i2) {
        int i3 = 0;
        if (i == 1 || i == 2) {
            boolean z = i == 2;
            int i4 = c8054.f24844 - i2;
            while (i3 < iArr.length) {
                if (i3 >= i4) {
                    c8054.f24842 = true;
                    return -1;
                }
                char cCharAt = charSequence.charAt(i2 + i3);
                int i5 = iArr[i3];
                if (i5 != cCharAt) {
                    if (i5 != (z ? C3395.m10356(cCharAt) : C22165.m49804(cCharAt))) {
                    }
                }
                if (c8054.m21407()) {
                    return -2;
                }
                i3++;
            }
            return i2 + iArr.length;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unknown regex literal type: "));
        }
        int i6 = c8054.f24844;
        while (i3 < iArr.length) {
            if (i2 >= i6) {
                c8054.f24842 = true;
                return -1;
            }
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i7 = iArr[i3];
            if (i7 != iCodePointAt) {
                if (i != 3) {
                    if (i7 != (i == 5 ? C3395.m10356(iCodePointAt) : C22165.m49804(iCodePointAt))) {
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
            if (i2 > i6) {
                c8054.f24842 = true;
                return -1;
            }
            if (c8054.m21407()) {
                return -2;
            }
            i3++;
        }
        return i2;
        return -1;
    }
}
