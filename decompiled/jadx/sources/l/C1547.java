package l;

/* JADX INFO: renamed from: l.֫ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5456 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5457 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f5458;

    public C1547(byte[] bArr) {
        this.f5458 = bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5300(int i) {
        int i2 = this.f5457;
        int i3 = i2 + 1;
        byte[] bArr = this.f5458;
        if (i3 > bArr.length) {
            m5294();
            throw null;
        }
        bArr[i2] = (byte) i;
        this.f5457 = i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5304(int i) {
        int i2 = this.f5457;
        int i3 = i2 + 2;
        byte[] bArr = this.f5458;
        if (i3 > bArr.length) {
            m5294();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f5457 = i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5302(int i) {
        int i2 = this.f5457;
        int i3 = i2 + 4;
        byte[] bArr = this.f5458;
        if (i3 > bArr.length) {
            m5294();
            throw null;
        }
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f5457 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5297(long j) {
        int i = this.f5457;
        int i2 = i + 8;
        byte[] bArr = this.f5458;
        if (i2 > bArr.length) {
            m5294();
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
        this.f5457 = i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m5301(int i) {
        long j = i;
        long j2 = (4294967295L & j) >> 7;
        int i2 = 0;
        while (true) {
            long j3 = j;
            j = j2;
            if (j != 0) {
                m5300(((int) (j3 & 127)) | 128);
                j2 = j >> 7;
                i2++;
            } else {
                m5300((int) (j3 & 127));
                return i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m5303(int i) {
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
            m5300((i6 & 127) | (z ? 128 : 0));
            i2 = i >> 7;
            i4++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5298(byte[] bArr, int i, int i2) {
        int i3 = this.f5457;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            StringBuilder sb = new StringBuilder("bytes.length ");
            C5834.m16344(sb, bArr.length, "; ", i, "..!");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        byte[] bArr2 = this.f5458;
        if (i4 > bArr2.length) {
            m5294();
            throw null;
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.f5457 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5296(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f5457 + i2) & (~i2);
        if (i3 > this.f5458.length) {
            m5294();
            throw null;
        }
        this.f5457 = i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5299() {
        this.f5456++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5295() {
        int i = this.f5456 - 1;
        this.f5456 = i;
        if (i < 0) {
            this.f5456 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5294() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }
}
