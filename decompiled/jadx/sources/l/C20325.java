package l;

/* JADX INFO: renamed from: l.᩶ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20325 implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long[] f65631;

    public C20325(long[] jArr) {
        this.f65631 = jArr;
    }

    public C20325() {
        this.f65631 = new long[1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46636(C20325 c20325) {
        if (c20325 == null) {
            return;
        }
        long[] jArr = c20325.f65631;
        int length = jArr.length;
        long[] jArr2 = this.f65631;
        if (length > jArr2.length) {
            int length2 = jArr.length;
            long[] jArr3 = new long[length2];
            System.arraycopy(this.f65631, 0, jArr3, 0, Math.min(length2, jArr2.length));
            this.f65631 = jArr3;
        }
        int iMin = Math.min(this.f65631.length, c20325.f65631.length);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            }
            long[] jArr4 = this.f65631;
            jArr4[iMin] = jArr4[iMin] | c20325.f65631[iMin];
        }
    }

    public final Object clone() {
        try {
            C20325 c20325 = (C20325) super.clone();
            long[] jArr = new long[this.f65631.length];
            c20325.f65631 = jArr;
            long[] jArr2 = this.f65631;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return c20325;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20325)) {
            return false;
        }
        C20325 c20325 = (C20325) obj;
        int iMin = Math.min(this.f65631.length, c20325.f65631.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f65631[i] != c20325.f65631[i]) {
                return false;
            }
        }
        if (this.f65631.length > iMin) {
            int i2 = iMin + 1;
            while (true) {
                long[] jArr = this.f65631;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jArr[i2] != 0) {
                    return false;
                }
                i2++;
            }
        } else if (c20325.f65631.length > iMin) {
            int i3 = iMin + 1;
            while (true) {
                long[] jArr2 = c20325.f65631;
                if (i3 >= jArr2.length) {
                    break;
                }
                if (jArr2[i3] != 0) {
                    return false;
                }
                i3++;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46637(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = i >> 6;
        long[] jArr = this.f65631;
        return i2 < jArr.length && (jArr[i2] & (1 << (i & 63))) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46635() {
        long[] jArr = this.f65631;
        if (jArr.length > 0) {
            jArr[0] = jArr[0] & (-3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = false;
        for (int i = 0; i < (this.f65631.length << 6); i++) {
            if (m46637(i)) {
                if (i > 0 && z) {
                    sb.append(",");
                }
                sb.append(i);
                z = true;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
