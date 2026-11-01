package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۨ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13703 {

    /* JADX INFO: renamed from: ֫ */
    public final int f38662;

    /* JADX INFO: renamed from: ۧ */
    public final int f38663;

    /* JADX INFO: renamed from: ܽ */
    public final String f38664;

    /* JADX INFO: renamed from: ᩳ */
    public final int f38665;

    /* JADX INFO: renamed from: ۖ */
    public static final C13703 f38653 = new C13703(0, 0, 1, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܿ */
    public static final C13703 f38659 = new C13703(1, 1, 2, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩻ */
    public static final C13703 f38661 = new C13703(2, 2, 3, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܳ */
    public static final C13703 f38657 = new C13703(3, 3, 4, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܺ */
    public static final C13703 f38658 = new C13703(4, 4, 5, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۢ */
    public static final C13703 f38656 = new C13703(5, 5, 6, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩷ */
    public static final C13703 f38660 = new C13703(6, 6, 7, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۡ */
    public static final C13703 f38655 = new C13703(7, 7, 8, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۜ */
    public static final C13703 f38654 = new C13703(8, 8, 9, "VZCBSIFJD");

    public C13703(int i, int i2, int i3, String str) {
        this.f38662 = i;
        this.f38664 = str;
        this.f38663 = i2;
        this.f38665 = i3;
    }

    /* JADX INFO: renamed from: ۜ */
    public static C13703 m31144(String str) {
        return m31143(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13703 m31154() {
        return m31143(this.f38663 + m31153(), this.f38665, this.f38664);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C13703 m31148(String str) {
        return new C13703(str.charAt(0) == '[' ? 9 : 12, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C13703 m31149(String str) {
        return new C13703(11, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13703[] m31145(String str) {
        C13703[] c13703Arr = new C13703[m31142(str)];
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            int iMax = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            c13703Arr[i] = m31143(i2, iMax, str);
            i2 = iMax;
            i++;
        }
        return c13703Arr;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C13703 m31146(String str) {
        return m31143(m31150(str), str.length(), str);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m31150(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C13703 m31143(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C13703(11, i, i2, str);
        }
        if (cCharAt == 'F') {
            return f38660;
        }
        if (cCharAt == 'L') {
            return new C13703(10, i + 1, i2 - 1, str);
        }
        if (cCharAt == 'S') {
            return f38658;
        }
        if (cCharAt == 'V') {
            return f38653;
        }
        if (cCharAt == 'I') {
            return f38656;
        }
        if (cCharAt == 'J') {
            return f38655;
        }
        if (cCharAt == 'Z') {
            return f38659;
        }
        if (cCharAt == '[') {
            return new C13703(9, i, i2, str);
        }
        switch (cCharAt) {
            case 'B':
                return f38657;
            case 'C':
                return f38661;
            case 'D':
                return f38654;
            default:
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m31156() {
        return this.f38664.substring(this.f38663, this.f38665);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m31152() {
        int i = this.f38665;
        int i2 = this.f38663;
        String str = this.f38664;
        int i3 = this.f38662;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        return i3 == 12 ? C6988.m16053("L", str.substring(i2, i), C0249l.f1196b) : str.substring(i2, i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m31155() {
        int i = this.f38662;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31153() {
        int i = 1;
        while (this.f38664.charAt(this.f38663 + i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31142(String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public static int m31147(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public final int m31151(int i) {
        int i2 = this.f38662;
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
        if (!(obj instanceof C13703)) {
            return false;
        }
        C13703 c13703 = (C13703) obj;
        int i = this.f38662;
        if (i == 12) {
            i = 10;
        }
        int i2 = c13703.f38662;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c13703.f38663;
        int i4 = c13703.f38665;
        int i5 = this.f38665;
        int i6 = this.f38663;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f38664.charAt(i6) != c13703.f38664.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f38662;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f38663; i2 < this.f38665; i2++) {
                iCharAt = (this.f38664.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m31152();
    }
}
