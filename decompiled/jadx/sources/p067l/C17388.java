package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J244 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17388 implements Cloneable {

    /* JADX INFO: renamed from: ۙ */
    public int f51897;

    /* JADX INFO: renamed from: ᩶ */
    public int f51898;

    /* JADX INFO: renamed from: ᩸ */
    public int[] f51899;

    /* JADX INFO: renamed from: ᩹ */
    public int f51900;

    public C17388(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f51897 = i;
        this.f51900 = i2;
        int i3 = (i + 31) / 32;
        this.f51898 = i3;
        this.f51899 = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39615(int i, int i2) {
        return ((this.f51899[(i / 32) + (i2 * this.f51898)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39614(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f51900 || i5 > this.f51897) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f51898 * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f51899;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17388)) {
            return false;
        }
        C17388 c17388 = (C17388) obj;
        return this.f51897 == c17388.f51897 && this.f51900 == c17388.f51900 && this.f51898 == c17388.f51898 && Arrays.equals(this.f51899, c17388.f51899);
    }

    public final int hashCode() {
        int i = this.f51897;
        return Arrays.hashCode(this.f51899) + ((((C6316.m14441(i, 31, i, 31) + this.f51900) * 31) + this.f51898) * 31);
    }

    public final String toString() {
        int i = this.f51900;
        int i2 = this.f51897;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(m39615(i4, i3) ? "X " : EnumC2483.f3919);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Object clone() {
        int i = this.f51897;
        int i2 = this.f51900;
        int i3 = this.f51898;
        int[] iArr = (int[]) this.f51899.clone();
        C17388 c17388 = new C17388();
        c17388.f51897 = i;
        c17388.f51900 = i2;
        c17388.f51898 = i3;
        c17388.f51899 = iArr;
        return c17388;
    }
}
