package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B73K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16627 implements InterfaceC9923 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f48871;

    public C16627(int[] iArr) {
        this.f48871 = iArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C16627 m37696(String str) {
        int i;
        if (str.isEmpty()) {
            return new C16627(new int[]{-1});
        }
        int[] iArr = new int[str.codePointCount(0, str.length()) + 1];
        int iCharCount = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (z) {
                iArr[i2] = iCodePointAt;
                i2++;
                z = false;
            } else if (iCodePointAt == 92) {
                z = true;
            } else {
                if (iCodePointAt == 42) {
                    if (i2 == 0 || iArr[i2 - 1] != -1) {
                        i = i2 + 1;
                        iArr[i2] = -1;
                    }
                    z2 = true;
                } else if (iCodePointAt == 63) {
                    i = i2 + 1;
                    iArr[i2] = -2;
                } else {
                    iArr[i2] = iCodePointAt;
                    i2++;
                }
                i2 = i;
                z2 = true;
            }
        }
        if (z) {
            iArr[i2] = 92;
            i2++;
        }
        if (!z2) {
            int[] iArr2 = new int[i2 + 2];
            iArr2[0] = -1;
            System.arraycopy(iArr, 0, iArr2, 1, i2);
            iArr2[i2 + 1] = -1;
            return new C16627(iArr2);
        }
        return new C16627(Arrays.copyOf(iArr, i2));
    }

    @Override // p067l.InterfaceC9923
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3740(String str) {
        int upperCase;
        int upperCase2;
        int iCharCount = 0;
        int i = 0;
        int i2 = -1;
        int iCharCount2 = -1;
        while (true) {
            int length = str.length();
            int[] iArr = this.f48871;
            if (iCharCount < length) {
                if (i < iArr.length) {
                    int i3 = iArr[i];
                    if (i3 == -1) {
                        iCharCount2 = iCharCount;
                        i2 = i;
                        i++;
                    } else {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (i3 == -2 || i3 == iCodePointAt || (upperCase = Character.toUpperCase(i3)) == (upperCase2 = Character.toUpperCase(iCodePointAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                            i++;
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                }
                if (i2 == -1 || iCharCount2 >= str.length()) {
                    break;
                }
                iCharCount2 += Character.charCount(str.codePointAt(iCharCount2));
                i = i2 + 1;
                iCharCount = iCharCount2;
            } else {
                while (i < iArr.length && iArr[i] == -1) {
                    i++;
                }
                if (i == iArr.length) {
                    return true;
                }
            }
        }
        return false;
    }
}
