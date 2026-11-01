package p067l;

/* JADX INFO: renamed from: l.֫ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3838 {

    /* JADX INFO: renamed from: ֫ */
    public int f8237 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f8238 = 0;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f8239;

    public C3838(byte[] bArr) {
        this.f8239 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7529(int i) {
        int i2 = this.f8238;
        int i3 = i2 + 1;
        byte[] bArr = this.f8239;
        if (i3 > bArr.length) {
            m7523();
            throw null;
        }
        bArr[i2] = (byte) i;
        this.f8238 = i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7533(int i) {
        int i2 = this.f8238;
        int i3 = i2 + 2;
        byte[] bArr = this.f8239;
        if (i3 > bArr.length) {
            m7523();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f8238 = i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7531(int i) {
        int i2 = this.f8238;
        int i3 = i2 + 4;
        byte[] bArr = this.f8239;
        if (i3 > bArr.length) {
            m7523();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f8238 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7526(long j) {
        int i = this.f8238;
        int i2 = i + 8;
        byte[] bArr = this.f8239;
        if (i2 > bArr.length) {
            m7523();
            throw null;
        }
        int i3 = (int) j;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.f8238 = i2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m7530(int i) {
        long j = i;
        long j2 = (4294967295L & j) >> 7;
        int i2 = 0;
        while (true) {
            long j3 = j;
            j = j2;
            if (j != 0) {
                m7529(((int) (j3 & 127)) | 128);
                j2 = j >> 7;
                i2++;
            } else {
                m7529((int) (j3 & 127));
                return i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m7532(int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int i5 = i2;
            int i6 = i;
            i = i5;
            if (!z) {
                return i4;
            }
            z = (i == i3 && (i & 1) == ((i6 >> 6) & 1)) ? false : true;
            m7529((i6 & 127) | (z ? 128 : 0));
            i2 = i >> 7;
            i4++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7527(byte[] bArr, int i, int i2) {
        int i3 = this.f8238;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            StringBuilder sb = new StringBuilder("bytes.length ");
            C7913.m18269(sb, bArr.length, "; ", i, "..!");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        byte[] bArr2 = this.f8239;
        if (i4 > bArr2.length) {
            m7523();
            throw null;
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.f8238 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7525(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f8238 + i2) & (~i2);
        if (i3 > this.f8239.length) {
            m7523();
            throw null;
        }
        this.f8238 = i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7528() {
        this.f8237++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7524() {
        int i = this.f8237 - 1;
        this.f8237 = i;
        if (i < 0) {
            this.f8237 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m7523() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }
}
