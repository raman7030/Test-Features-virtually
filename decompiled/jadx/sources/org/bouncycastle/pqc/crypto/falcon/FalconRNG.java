package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class FalconRNG {

    /* JADX INFO: renamed from: bd */
    public byte[] f81599bd = new byte[512];
    public int ptr = 0;

    /* JADX INFO: renamed from: sd */
    public byte[] f81600sd = new byte[256];

    private void QROUND(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        iArr[i4] = i6;
        int i7 = (i6 >>> 16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        iArr[i2] = i9;
        int i10 = (i9 >>> 20) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        iArr[i4] = i12;
        int i13 = (i12 >>> 24) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = i15;
        iArr[i2] = (i15 >>> 25) | (i15 << 7);
    }

    public long prng_get_u64() {
        int i = this.ptr;
        if (i >= this.f81599bd.length - 9) {
            prng_refill();
            i = 0;
        }
        this.ptr = i + 8;
        return Pack.littleEndianToLong(this.f81599bd, i);
    }

    public byte prng_get_u8() {
        byte[] bArr = this.f81599bd;
        int i = this.ptr;
        int i2 = i + 1;
        this.ptr = i2;
        byte b = bArr[i];
        if (i2 == bArr.length) {
            prng_refill();
        }
        return b;
    }

    public void prng_init(SHAKEDigest sHAKEDigest) {
        sHAKEDigest.doOutput(this.f81600sd, 0, 56);
        prng_refill();
    }

    public void prng_refill() {
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        int[] iArr2 = new int[16];
        int i = 0;
        long jLittleEndianToLong = Pack.littleEndianToLong(this.f81600sd, 48);
        FalconRNG falconRNG = this;
        int i2 = 0;
        while (i2 < 8) {
            System.arraycopy(iArr, i, iArr2, i, 4);
            Pack.littleEndianToInt(falconRNG.f81600sd, i, iArr2, 4, 12);
            int i3 = 14;
            int i4 = (int) jLittleEndianToLong;
            iArr2[14] = iArr2[14] ^ i4;
            int i5 = (int) (jLittleEndianToLong >>> 32);
            iArr2[15] = iArr2[15] ^ i5;
            int i6 = 0;
            while (i6 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                i3 = 14;
                QROUND(1, 5, 9, 13, iArr2);
                QROUND(2, 6, 10, 14, iArr2);
                QROUND(3, 7, 11, 15, iArr2);
                QROUND(0, 5, 10, 15, iArr2);
                QROUND(1, 6, 11, 12, iArr2);
                QROUND(2, 7, 8, 13, iArr2);
                QROUND(3, 4, 9, 14, iArr2);
                i2 = i2;
                i5 = i5;
                i4 = i4;
                jLittleEndianToLong = jLittleEndianToLong;
                i6++;
                falconRNG = this;
            }
            int i7 = i2;
            long j = jLittleEndianToLong;
            int[] iArr3 = iArr2;
            int i8 = i5;
            int i9 = i4;
            for (int i10 = 0; i10 < 4; i10++) {
                iArr3[i10] = iArr3[i10] + iArr[i10];
            }
            for (int i11 = 4; i11 < i3; i11++) {
                iArr3[i11] = Pack.littleEndianToInt(falconRNG.f81600sd, (i11 * 4) - 16) + iArr3[i11];
            }
            iArr3[i3] = iArr3[i3] + (Pack.littleEndianToInt(falconRNG.f81600sd, 40) ^ i9);
            iArr3[15] = iArr3[15] + (Pack.littleEndianToInt(falconRNG.f81600sd, 44) ^ i8);
            jLittleEndianToLong = j + 1;
            for (int i12 = 0; i12 < 16; i12++) {
                Pack.intToLittleEndian(iArr3[i12], falconRNG.f81599bd, (i7 << 2) + (i12 << 5));
            }
            i2 = i7 + 1;
            iArr2 = iArr3;
            i = 0;
        }
        Pack.longToLittleEndian(jLittleEndianToLong, falconRNG.f81600sd, 48);
        falconRNG.ptr = 0;
    }
}
