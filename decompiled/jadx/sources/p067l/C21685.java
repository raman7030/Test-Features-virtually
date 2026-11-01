package p067l;

/* JADX INFO: renamed from: l.᩶ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21685 implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public long[] f68305;

    public C21685(long[] jArr) {
        this.f68305 = jArr;
    }

    public C21685() {
        this.f68305 = new long[1];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48959(C21685 c21685) {
        if (c21685 == null) {
            return;
        }
        long[] jArr = c21685.f68305;
        int length = jArr.length;
        long[] jArr2 = this.f68305;
        if (length > jArr2.length) {
            int length2 = jArr.length;
            long[] jArr3 = new long[length2];
            System.arraycopy(this.f68305, 0, jArr3, 0, Math.min(length2, jArr2.length));
            this.f68305 = jArr3;
        }
        int iMin = Math.min(this.f68305.length, c21685.f68305.length);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            }
            long[] jArr4 = this.f68305;
            jArr4[iMin] = jArr4[iMin] | c21685.f68305[iMin];
        }
    }

    public final Object clone() {
        try {
            C21685 c21685 = (C21685) super.clone();
            long[] jArr = new long[this.f68305.length];
            c21685.f68305 = jArr;
            long[] jArr2 = this.f68305;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return c21685;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C21685)) {
            return false;
        }
        C21685 c21685 = (C21685) obj;
        int iMin = Math.min(this.f68305.length, c21685.f68305.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f68305[i] != c21685.f68305[i]) {
                return false;
            }
        }
        if (this.f68305.length > iMin) {
            int i2 = iMin + 1;
            while (true) {
                long[] jArr = this.f68305;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jArr[i2] != 0) {
                    return false;
                }
                i2++;
            }
        } else if (c21685.f68305.length > iMin) {
            int i3 = iMin + 1;
            while (true) {
                long[] jArr2 = c21685.f68305;
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

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48960(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = i >> 6;
        long[] jArr = this.f68305;
        return i2 < jArr.length && (jArr[i2] & (1 << (i & 63))) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48958() {
        long[] jArr = this.f68305;
        if (jArr.length > 0) {
            jArr[0] = jArr[0] & (-3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = false;
        for (int i = 0; i < (this.f68305.length << 6); i++) {
            if (m48960(i)) {
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
