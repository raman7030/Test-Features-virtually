package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J244 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15804 implements Cloneable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48759;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f48761;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48762;

    public C15804(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f48759 = i;
        this.f48762 = i2;
        int i3 = (i + 31) / 32;
        this.f48760 = i3;
        this.f48761 = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37443(int i, int i2) {
        return ((this.f48761[(i / 32) + (i2 * this.f48760)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37442(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f48762 || i5 > this.f48759) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f48760 * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f48761;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15804)) {
            return false;
        }
        C15804 c15804 = (C15804) obj;
        return this.f48759 == c15804.f48759 && this.f48762 == c15804.f48762 && this.f48760 == c15804.f48760 && Arrays.equals(this.f48761, c15804.f48761);
    }

    public final int hashCode() {
        int i = this.f48759;
        return Arrays.hashCode(this.f48761) + ((((C4153.m12551(i, 31, i, 31) + this.f48762) * 31) + this.f48760) * 31);
    }

    public final String toString() {
        int i = this.f48762;
        int i2 = this.f48759;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(m37443(i4, i3) ? "X " : EnumC0121.f1143);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Object clone() {
        int i = this.f48759;
        int i2 = this.f48762;
        int i3 = this.f48760;
        int[] iArr = (int[]) this.f48761.clone();
        C15804 c15804 = new C15804();
        c15804.f48759 = i;
        c15804.f48762 = i2;
        c15804.f48760 = i3;
        c15804.f48761 = iArr;
        return c15804;
    }
}
