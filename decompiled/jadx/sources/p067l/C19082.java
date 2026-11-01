package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: IAR9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19082 {

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f56935 = new int[0];

    /* JADX INFO: renamed from: ֫ */
    public int[] f56936 = f56935;

    /* JADX INFO: renamed from: ۧ */
    public int f56937;

    /* JADX INFO: renamed from: ֫ */
    public final void m43357(int i) {
        int[] iArr = this.f56936;
        int length = iArr.length;
        int i2 = this.f56937;
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
            this.f56936 = Arrays.copyOf(this.f56936, length2);
        }
        int[] iArr2 = this.f56936;
        int i4 = this.f56937;
        iArr2[i4] = i;
        this.f56937 = i4 + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43358(int i) {
        if (i < 0 || i >= this.f56937) {
            throw new IndexOutOfBoundsException();
        }
        return this.f56936[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43361(int i) {
        int iM43358 = m43358(i);
        int[] iArr = this.f56936;
        System.arraycopy(iArr, i + 1, iArr, i, (this.f56937 - i) - 1);
        int[] iArr2 = this.f56936;
        int i2 = this.f56937 - 1;
        iArr2[i2] = 0;
        this.f56937 = i2;
        return iM43358;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43359() {
        return this.f56937 == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43360() {
        return this.f56937;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43356() {
        Arrays.fill(this.f56936, 0, this.f56937, 0);
        this.f56937 = 0;
    }

    public final String toString() {
        int[] iArrCopyOf;
        int i = this.f56937;
        if (i == 0) {
            iArrCopyOf = f56935;
        } else {
            iArrCopyOf = Arrays.copyOf(this.f56936, i);
        }
        return Arrays.toString(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19082)) {
            return false;
        }
        C19082 c19082 = (C19082) obj;
        if (this.f56937 != c19082.f56937) {
            return false;
        }
        for (int i = 0; i < this.f56937; i++) {
            if (this.f56936[i] != c19082.f56936[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56937; i2++) {
            i = (i * 31) + this.f56936[i2];
        }
        return i;
    }
}
