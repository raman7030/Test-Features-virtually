package org.bouncycastle.pqc.crypto.frodo;

import java.security.SecureRandom;
import l.C23202;
import l.C23868;
import l.C4153;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class FrodoEngine {
    public static final int len_chi = 16;
    public static final int len_chi_bytes = 2;
    public static final int len_seedA = 128;
    public static final int len_seedA_bytes = 16;
    public static final int len_z = 128;
    public static final int len_z_bytes = 16;
    public static final int mbar = 8;
    public static final int nbar = 8;
    public final int B;
    public final int D;
    public final short[] T_chi;
    public final Xof digest;
    public final FrodoMatrixGenerator gen;
    public final int len_ct_bytes;
    public final int len_k;
    public final int len_k_bytes;
    public final int len_mu;
    public final int len_mu_bytes;
    public final int len_pk_bytes;
    public final int len_pkh;
    public final int len_pkh_bytes;
    public final int len_s;
    public final int len_s_bytes;
    public final int len_seedSE;
    public final int len_seedSE_bytes;
    public final int len_sk_bytes;
    public final int len_ss;
    public final int len_ss_bytes;
    public final int n;
    public final int q;

    public FrodoEngine(int i, int i2, int i3, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.n = i;
        this.D = i2;
        this.q = 1 << i2;
        this.B = i3;
        int i4 = i3 * 64;
        this.len_mu = i4;
        this.len_seedSE = i4;
        this.len_s = i4;
        this.len_k = i4;
        this.len_pkh = i4;
        this.len_ss = i4;
        this.len_mu_bytes = i4 / 8;
        this.len_seedSE_bytes = i4 / 8;
        int i5 = i4 / 8;
        this.len_s_bytes = i5;
        this.len_k_bytes = i4 / 8;
        int i6 = i4 / 8;
        this.len_pkh_bytes = i6;
        this.len_ss_bytes = i4 / 8;
        int i7 = ((i2 * i) * 8) / 8;
        this.len_ct_bytes = C23868.m52580(i2, 64, 8, i7);
        int i8 = i7 + 16;
        this.len_pk_bytes = i8;
        this.len_sk_bytes = C23202.m51496(i, 16, i6, i5 + i8);
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (((~s) & bArr[i] & 255) | (bArr2[i] & s & 255));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s = 0;
        for (short s2 = 0; s2 < sArr.length; s2 = (short) (s2 + 1)) {
            s = (short) (s | (sArr[s2] ^ sArr3[s2]));
        }
        for (short s3 = 0; s3 < sArr2.length; s3 = (short) (s3 + 1)) {
            s = (short) ((sArr2[s3] ^ sArr4[s3]) | s);
        }
        return s == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i = this.B;
        short s = (short) ((1 << i) - 1);
        short s2 = (short) ((1 << this.D) - 1);
        byte[] bArr = new byte[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            long j = 0;
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = sArr[i2] & s2;
                int i6 = this.D;
                int i7 = this.B;
                j |= ((long) (((short) ((i5 + (1 << ((i6 - i7) - 1))) >> (i6 - i7))) & s)) << (i7 * i4);
                i2++;
            }
            int i8 = 0;
            while (true) {
                int i9 = this.B;
                if (i8 < i9) {
                    bArr[(i9 * i3) + i8] = (byte) ((j >> (i8 * 8)) & 255);
                    i8++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i;
        short[] sArr = new short[64];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    i = this.B;
                    if (i6 < i) {
                        i7 += ((bArr[i2] >>> i3) & 1) << i6;
                        int i8 = i3 + 1;
                        i2 += i8 >>> 3;
                        i3 = i8 & 7;
                        i6++;
                    }
                }
                sArr[(i4 * 8) + i5] = (short) ((this.q / (1 << i)) * i7);
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i, int i2) {
        int i3 = this.q - 1;
        short[] sArr3 = new short[i * i2];
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = (i4 * i2) + i5;
                sArr3[i6] = (short) ((sArr[i6] + sArr2[i6]) & i3);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4) {
        int i5 = this.q - 1;
        short[] sArr3 = new short[i * i4];
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = 0;
                for (int i9 = 0; i9 < i2; i9++) {
                    i8 += sArr[(i6 * i2) + i9] * sArr2[(i9 * i4) + i7];
                }
                sArr3[(i6 * i4) + i7] = (short) (i8 & i5);
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i, int i2) {
        int i3 = this.q - 1;
        short[] sArr3 = new short[i * i2];
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = (i4 * i2) + i5;
                sArr3[i6] = (short) ((sArr[i6] - sArr2[i6]) & i3);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr2[(i3 * i) + i4] = sArr[(i4 * i2) + i3];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i = (this.D * length) / 8;
        byte[] bArr = new byte[i];
        short s = 0;
        short s2 = 0;
        byte b = 0;
        short s3 = 0;
        while (s < i && (s2 < length || (s2 == length && b > 0))) {
            byte b2 = 0;
            while (b2 < 8) {
                int i2 = 8 - b2;
                int iMin = Math.min(i2, (int) b);
                int i3 = b - iMin;
                bArr[s] = (byte) (bArr[s] + (((byte) (((short) ((1 << iMin) - 1)) & (s3 >> i3))) << (i2 - iMin)));
                b2 = (byte) (b2 + iMin);
                b = (byte) i3;
                if (b == 0) {
                    if (s2 >= length) {
                        break;
                    }
                    s3 = sArr[s2];
                    b = (byte) this.D;
                    s2 = (short) (s2 + 1);
                }
            }
            if (b2 == 8) {
                s = (short) (s + 1);
            }
        }
        return bArr;
    }

    private short sample(short s) {
        int i = s & HPKE.aead_EXPORT_ONLY;
        short s2 = (short) (i >>> 1);
        int i2 = 0;
        short s3 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i2 >= sArr.length) {
                break;
            }
            if (s2 > sArr[i2]) {
                s3 = (short) (s3 + 1);
            }
            i2++;
        }
        return i % 2 == 1 ? (short) ((s3 * (-1)) & 65535) : s3;
    }

    private short[] sample_matrix(short[] sArr, int i, int i2, int i3) {
        short[] sArr2 = new short[i2 * i3];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = (i4 * i3) + i5;
                sArr2[i6] = sample(sArr[i6 + i]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        short[] sArr = new short[i3];
        short s = 0;
        short s2 = 0;
        byte b = 0;
        byte b2 = 0;
        while (s < i3 && (s2 < bArr.length || (s2 == bArr.length && b > 0))) {
            byte b3 = 0;
            while (true) {
                int i4 = this.D;
                if (b3 >= i4) {
                    break;
                }
                int iMin = Math.min(i4 - b3, (int) b);
                short s3 = (short) (((1 << iMin) - 1) & 65535);
                sArr[s] = (short) (65535 & ((sArr[s] & HPKE.aead_EXPORT_ONLY) + ((((byte) ((((b2 & 255) >>> ((b & 255) - iMin)) & (s3 & HPKE.aead_EXPORT_ONLY)) & 255)) & 255) << ((this.D - (b3 & 255)) - iMin))));
                b3 = (byte) (b3 + iMin);
                b = (byte) (b - iMin);
                b2 = (byte) (b2 & (~(s3 << b)));
                if (b == 0) {
                    if (s2 >= bArr.length) {
                        break;
                    }
                    b2 = bArr[s2];
                    s2 = (short) (s2 + 1);
                    b = 8;
                }
            }
            if (b3 == this.D) {
                s = (short) (s + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = ((this.n * 8) * this.D) / 8;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i, C23868.m52580(this.D, 64, 8, i));
        int i2 = this.len_s_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, 0, i2);
        int i3 = i2 + 16;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr3, i2, i3);
        int i4 = (((this.D * this.n) * 8) / 8) + i3;
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr3, i3, i4);
        int iM52580 = C23868.m52580(this.n, 128, 8, i4);
        byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr3, i4, iM52580);
        short[] sArr = new short[this.n * 8];
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.n;
                if (i6 < i7) {
                    sArr[(i5 * i7) + i6] = Pack.littleEndianToShort(bArrCopyOfRange6, (i6 * 2) + (i7 * i5 * 2));
                    i6++;
                }
            }
        }
        short[] sArrMatrix_transpose = matrix_transpose(sArr, 8, this.n);
        byte[] bArrCopyOfRange7 = Arrays.copyOfRange(bArr3, iM52580, this.len_pkh_bytes + iM52580);
        short[] sArrUnpack = unpack(bArrCopyOfRange, 8, this.n);
        short[] sArrUnpack2 = unpack(bArrCopyOfRange2, 8, 8);
        int i8 = this.n;
        byte[] bArrDecode = decode(matrix_sub(sArrUnpack2, matrix_mul(sArrUnpack, 8, i8, sArrMatrix_transpose, i8, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(bArrCopyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(bArrDecode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i9 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange8 = Arrays.copyOfRange(bArr4, i9, this.len_k_bytes + i9);
        int iM12551 = C4153.m12551(this.n, 16, 64, 2);
        byte[] bArr5 = new byte[iM12551];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, iM12551);
        int i10 = (this.n * 16) + 64;
        short[] sArr2 = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr2[i11] = Pack.littleEndianToShort(bArr5, i11 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr2, 0, 8, this.n);
        int i12 = this.n;
        short[] sArrSample_matrix2 = sample_matrix(sArr2, i12 * 8, 8, i12);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange4);
        int i13 = this.n;
        short[] sArrMatrix_add = matrix_add(matrix_mul(sArrSample_matrix, 8, i13, sArrGenMatrix, i13, i13), sArrSample_matrix2, 8, this.n);
        short[] sArrSample_matrix3 = sample_matrix(sArr2, this.n * 16, 8, 8);
        short[] sArrUnpack3 = unpack(bArrCopyOfRange5, this.n, 8);
        int i14 = this.n;
        byte[] bArrCtselect = ctselect(bArrCopyOfRange8, bArrCopyOfRange3, ctverify(sArrUnpack, sArrUnpack2, sArrMatrix_add, matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i14, sArrUnpack3, i14, 8), sArrSample_matrix3, 8, 8), encode(bArrDecode), 8, 8)));
        this.digest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.update(bArrCtselect, 0, bArrCtselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr6, i, this.len_k_bytes + i);
        int iM12551 = C4153.m12551(this.n, 16, 64, 2);
        byte[] bArr7 = new byte[iM12551];
        this.digest.update((byte) -106);
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr7, 0, iM12551);
        int i2 = iM12551 / 2;
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = Pack.littleEndianToShort(bArr7, i3 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.n);
        int i4 = this.n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i4 * 8, 8, i4);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange);
        int i5 = this.n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrSample_matrix, 8, i5, sArrGenMatrix, i5, i5), sArrSample_matrix2, 8, this.n));
        short[] sArrSample_matrix3 = sample_matrix(sArr, this.n * 16, 8, 8);
        short[] sArrUnpack = unpack(bArrCopyOfRange2, this.n, 8);
        int i6 = this.n;
        byte[] bArrPack2 = pack(matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i6, sArrUnpack, i6, 8), sArrSample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(bArrPack, bArrPack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(bArrPack, 0, bArrPack.length);
        this.digest.update(bArrPack2, 0, bArrPack2.length);
        this.digest.update(bArrCopyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i = this.len_s_bytes;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, i, this.len_seedSE_bytes + i);
        int i2 = this.len_s_bytes;
        int i3 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i2 + i3, i2 + i3 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr4);
        int i4 = this.n * 32;
        byte[] bArr5 = new byte[i4];
        this.digest.update((byte) 95);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i4);
        int i5 = this.n * 16;
        short[] sArr = new short[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            sArr[i6] = Pack.littleEndianToShort(bArr5, i6 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.n);
        short[] sArrMatrix_transpose = matrix_transpose(sArrSample_matrix, 8, this.n);
        int i7 = this.n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i7 * 8, i7, 8);
        int i8 = this.n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(sArrGenMatrix, i8, i8, sArrMatrix_transpose, i8, 8), sArrSample_matrix2, this.n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i9 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i9];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i9);
        System.arraycopy(Arrays.concatenate(bArrCopyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = 0;
            while (true) {
                int i12 = this.n;
                if (i11 < i12) {
                    System.arraycopy(Pack.shortToLittleEndian(sArrSample_matrix[(i12 * i10) + i11]), 0, bArr2, (i11 * 2) + (this.n * i10 * 2) + this.len_s_bytes + this.len_pk_bytes, 2);
                    i11++;
                }
            }
        }
        int i13 = this.len_sk_bytes;
        int i14 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i13 - i14, i14);
    }
}
