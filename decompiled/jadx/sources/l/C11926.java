package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35653;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f35654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35655;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f35656;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35644 = new C11926(0, 0, 1, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35650 = new C11926(1, 1, 2, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C11926 f35652 = new C11926(2, 2, 3, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35648 = new C11926(3, 3, 4, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35649 = new C11926(4, 4, 5, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35647 = new C11926(5, 5, 6, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C11926 f35651 = new C11926(6, 6, 7, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35646 = new C11926(7, 7, 8, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C11926 f35645 = new C11926(8, 8, 9, "VZCBSIFJD");

    public C11926(int i, int i2, int i3, String str) {
        this.f35653 = i;
        this.f35655 = str;
        this.f35654 = i2;
        this.f35656 = i3;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C11926 m29091(String str) {
        return m29090(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11926 m29101() {
        return m29090(this.f35654 + m29100(), this.f35656, this.f35655);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11926 m29095(String str) {
        return new C11926(str.charAt(0) == '[' ? 9 : 12, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11926 m29096(String str) {
        return new C11926(11, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11926[] m29092(String str) {
        C11926[] c11926Arr = new C11926[m29089(str)];
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            int iMax = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            c11926Arr[i] = m29090(i2, iMax, str);
            i2 = iMax;
            i++;
        }
        return c11926Arr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C11926 m29093(String str) {
        return m29090(m29097(str), str.length(), str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m29097(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i, str.indexOf(59, i) + 1) : i;
        }
        return iMax + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11926 m29090(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C11926(11, i, i2, str);
        }
        if (cCharAt == 'F') {
            return f35651;
        }
        if (cCharAt == 'L') {
            return new C11926(10, i + 1, i2 - 1, str);
        }
        if (cCharAt == 'S') {
            return f35649;
        }
        if (cCharAt == 'V') {
            return f35644;
        }
        if (cCharAt == 'I') {
            return f35647;
        }
        if (cCharAt == 'J') {
            return f35646;
        }
        if (cCharAt == 'Z') {
            return f35650;
        }
        if (cCharAt == '[') {
            return new C11926(9, i, i2, str);
        }
        switch (cCharAt) {
            case 'B':
                return f35648;
            case 'C':
                return f35652;
            case 'D':
                return f35645;
            default:
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m29103() {
        return this.f35655.substring(this.f35654, this.f35656);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m29099() {
        int i = this.f35656;
        int i2 = this.f35654;
        String str = this.f35655;
        int i3 = this.f35653;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        return i3 == 12 ? C4860.m14172("L", str.substring(i2, i), l.b) : str.substring(i2, i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m29102() {
        int i = this.f35653;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29100() {
        int i = 1;
        while (this.f35655.charAt(this.f35654 + i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29089(String str) {
        int i = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i2 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m29094(String str) {
        char cCharAt = str.charAt(1);
        int i = 1;
        int i2 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i++;
                i2 += 2;
            } else {
                while (str.charAt(i) == '[') {
                    i++;
                }
                int iMax = i + 1;
                if (str.charAt(i) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i2++;
                i = iMax;
            }
            cCharAt = str.charAt(i);
        }
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt2 == 'V') {
            return i2 << 2;
        }
        return (i2 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29098(int i) {
        int i2 = this.f35653;
        if (i == 46 || i == 79) {
            switch (i2) {
                case 0:
                case 11:
                    throw new UnsupportedOperationException();
                case 1:
                case 3:
                    return i + 5;
                case 2:
                    return i + 6;
                case 4:
                    return i + 7;
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                case 9:
                case 10:
                case 12:
                    return i + 4;
                default:
                    throw new AssertionError();
            }
        }
        switch (i2) {
            case 0:
                if (i == 172) {
                    return 177;
                }
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            case 6:
                return i + 2;
            case 7:
                return i + 1;
            case 8:
                return i + 3;
            case 9:
            case 10:
            case 12:
                if (i == 21 || i == 54 || i == 172) {
                    return i + 4;
                }
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            default:
                throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11926)) {
            return false;
        }
        C11926 c11926 = (C11926) obj;
        int i = this.f35653;
        if (i == 12) {
            i = 10;
        }
        int i2 = c11926.f35653;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c11926.f35654;
        int i4 = c11926.f35656;
        int i5 = this.f35656;
        int i6 = this.f35654;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f35655.charAt(i6) != c11926.f35655.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f35653;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f35654; i2 < this.f35656; i2++) {
                iCharAt = (this.f35655.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m29099();
    }
}
