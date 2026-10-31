package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: IAR9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17586 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f53741 = new int[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f53742 = f53741;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53743;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41111(int i) {
        int[] iArr = this.f53742;
        int length = iArr.length;
        int i2 = this.f53743;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.f53742 = Arrays.copyOf(this.f53742, length2);
        }
        int[] iArr2 = this.f53742;
        int i4 = this.f53743;
        iArr2[i4] = i;
        this.f53743 = i4 + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41112(int i) {
        if (i < 0 || i >= this.f53743) {
            throw new IndexOutOfBoundsException();
        }
        return this.f53742[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41115(int i) {
        int iM41112 = m41112(i);
        int[] iArr = this.f53742;
        System.arraycopy(iArr, i + 1, iArr, i, (this.f53743 - i) - 1);
        int[] iArr2 = this.f53742;
        int i2 = this.f53743 - 1;
        iArr2[i2] = 0;
        this.f53743 = i2;
        return iM41112;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41113() {
        return this.f53743 == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41114() {
        return this.f53743;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41110() {
        Arrays.fill(this.f53742, 0, this.f53743, 0);
        this.f53743 = 0;
    }

    public final String toString() {
        int[] iArrCopyOf;
        int i = this.f53743;
        if (i == 0) {
            iArrCopyOf = f53741;
        } else {
            iArrCopyOf = Arrays.copyOf(this.f53742, i);
        }
        return Arrays.toString(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17586)) {
            return false;
        }
        C17586 c17586 = (C17586) obj;
        if (this.f53743 != c17586.f53743) {
            return false;
        }
        for (int i = 0; i < this.f53743; i++) {
            if (this.f53742[i] != c17586.f53742[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f53743; i2++) {
            i = (i * 31) + this.f53742[i2];
        }
        return i;
    }
}
