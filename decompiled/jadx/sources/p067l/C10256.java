package p067l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public final class C10256 extends AbstractC12979 {

    /* JADX INFO: renamed from: ֫ */
    public final int f28402;

    /* JADX INFO: renamed from: ۧ */
    public final int f28403;

    /* JADX INFO: renamed from: ܽ */
    public final long[] f28404;

    public C10256(int i, int i2, long[] jArr) {
        this.f28402 = i;
        this.f28404 = jArr;
        this.f28403 = i2;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23868() {
        return this.f28403;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ܽ */
    public final int mo23869(int i) {
        if (i < 0 || i >= this.f28403) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Start ordinal "));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.f28404;
            if (i2 >= jArr.length) {
                throw new AssertionError("Bitmap ordinal missing");
            }
            int iBitCount = Long.bitCount(jArr[i2]);
            if (i >= iBitCount) {
                i -= iBitCount;
                i2++;
            } else {
                long j = jArr[i2];
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        return Long.numberOfTrailingZeros(j) + this.f28402 + (i2 << 6);
                    }
                    j &= j - 1;
                    i = i3;
                }
            }
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final int mo23866(int i) {
        long j = i;
        int i2 = this.f28402;
        long j2 = (j - ((long) i2)) + 1;
        if (j2 < 0) {
            j2 = 0;
        }
        long[] jArr = this.f28404;
        if (j2 >= (((long) jArr.length) << 6)) {
            throw new IndexOutOfBoundsException("No next start");
        }
        int i3 = (int) j2;
        int i4 = i3 >>> 6;
        long j3 = jArr[i4] & ((-1) << (i3 & 63));
        while (j3 == 0) {
            i4++;
            if (i4 == jArr.length) {
                throw new IndexOutOfBoundsException("No next start");
            }
            j3 = jArr[i4];
        }
        return Long.numberOfTrailingZeros(j3) + i2 + (i4 << 6);
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23864(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        boolean z = true;
        while (true) {
            long[] jArr = this.f28404;
            if (i3 >= jArr.length) {
                return true;
            }
            long j = jArr[i3];
            while (j != 0) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + this.f28402 + (i3 << 6);
                if (!z && ((long) i2) + ((long) i) > iNumberOfTrailingZeros) {
                    return false;
                }
                j &= j - 1;
                z = false;
                i2 = iNumberOfTrailingZeros;
            }
            i3++;
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23865(AbstractC12979 abstractC12979) {
        if (!(abstractC12979 instanceof C10256)) {
            return false;
        }
        C10256 c10256 = (C10256) abstractC12979;
        return this.f28402 == c10256.f28402 && this.f28403 == c10256.f28403 && Arrays.equals(this.f28404, c10256.f28404);
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23863(byte[] bArr, int i, int i2, byte b, int i3) {
        int i4 = this.f28402;
        long jMax = Math.max(0L, ((long) i) - ((long) i4));
        long[] jArr = this.f28404;
        long jMin = Math.min(((long) jArr.length) << 6, ((long) i2) - ((long) i4));
        if (jMax >= jMin) {
            return;
        }
        int i5 = (((int) jMin) - 1) >>> 6;
        for (int i6 = ((int) jMax) >>> 6; i6 <= i5; i6++) {
            for (long j = jArr[i6]; j != 0; j &= j - 1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + (i6 << 6) + i4;
                if (iNumberOfTrailingZeros >= i && iNumberOfTrailingZeros < i2) {
                    bArr[(i3 + iNumberOfTrailingZeros) - i] = b;
                }
            }
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23861(int i, int i2, InterfaceC22997 interfaceC22997) {
        long j = i;
        int i3 = this.f28402;
        long j2 = i3;
        long jMax = Math.max(0L, j - j2);
        long[] jArr = this.f28404;
        long jMin = Math.min(((long) jArr.length) << 6, ((long) i2) - j2);
        if (jMax >= jMin) {
            return;
        }
        int i4 = (int) jMax;
        int i5 = (int) jMin;
        int i6 = i4 >>> 6;
        int iBitCount = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iBitCount += Long.bitCount(jArr[i7]);
        }
        int i8 = (i5 - 1) >>> 6;
        while (i6 <= i8) {
            int i9 = iBitCount;
            for (long j3 = jArr[i6]; j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = (i6 << 6) + Long.numberOfTrailingZeros(j3);
                if (iNumberOfTrailingZeros >= i4 && iNumberOfTrailingZeros < i5) {
                    interfaceC22997.mo6328(i9, iNumberOfTrailingZeros + i3);
                }
                i9++;
            }
            iBitCount += Long.bitCount(jArr[i6]);
            i6++;
        }
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final int mo23859(int i, int i2) {
        final int[] iArr = {0};
        mo23861(i, i2, new InterfaceC22997() { // from class: l.֨ܽܳ
            @Override // p067l.InterfaceC22997
            /* JADX INFO: renamed from: ֫ */
            public final void mo6328(int i3, int i4) {
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
            }
        });
        return iArr[0];
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ۧ */
    public final long mo23867() {
        return ((long) this.f28404.length) * 8;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final long mo23860() {
        return (((long) this.f28404.length) * 8) + 64;
    }

    @Override // p067l.AbstractC12979
    /* JADX INFO: renamed from: ֫ */
    public final void mo23862(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(2);
        long j = ((long) this.f28402) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        long[] jArr = this.f28404;
        dataOutputStream.writeInt(jArr.length);
        dataOutputStream.writeInt(this.f28403);
        for (long j2 : jArr) {
            dataOutputStream.writeLong(j2);
        }
    }
}
