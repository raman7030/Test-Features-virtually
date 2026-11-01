package p067l;

/* JADX INFO: renamed from: l.֨۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3317 {
    /* JADX INFO: renamed from: ֫ */
    public static int m5794(int[] iArr, int i, C10023 c10023, CharSequence charSequence, int i2) {
        int i3 = 0;
        if (i == 1 || i == 2) {
            boolean z = i == 2;
            int i4 = c10023.f27757 - i2;
            while (i3 < iArr.length) {
                if (i3 >= i4) {
                    c10023.f27755 = true;
                    return -1;
                }
                char cCharAt = charSequence.charAt(i2 + i3);
                int i5 = iArr[i3];
                if (i5 != cCharAt) {
                    if (i5 != (z ? C5595.m12395(cCharAt) : C23434.m52142(cCharAt))) {
                    }
                }
                if (c10023.m23374()) {
                    return -2;
                }
                i3++;
            }
            return i2 + iArr.length;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unknown regex literal type: "));
        }
        int i6 = c10023.f27757;
        while (i3 < iArr.length) {
            if (i2 >= i6) {
                c10023.f27755 = true;
                return -1;
            }
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i7 = iArr[i3];
            if (i7 != iCodePointAt) {
                if (i != 3) {
                    if (i7 != (i == 5 ? C5595.m12395(iCodePointAt) : C23434.m52142(iCodePointAt))) {
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
            if (i2 > i6) {
                c10023.f27755 = true;
                return -1;
            }
            if (c10023.m23374()) {
                return -2;
            }
            i3++;
        }
        return i2;
        return -1;
    }
}
