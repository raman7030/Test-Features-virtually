package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import l.C19373;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class MayoSigner implements MessageSigner {
    public static final long EVEN_2BYTES = 281470681808895L;
    public static final long EVEN_BYTES = 71777214294589695L;
    public static final int F_TAIL_LEN = 4;
    public MayoParameters params;
    public MayoPrivateKeyParameters privKey;
    public MayoPublicKeyParameters pubKey;
    public SecureRandom random;

    public static long ctCompare64(int i, int i2) {
        return (-(i ^ i2)) >> 63;
    }

    public static void mVecMultiplyBins(int i, int i2, long[] jArr, long[] jArr2) {
        int i3 = i + i;
        int i4 = i3 + i;
        int i5 = i4 + i;
        int i6 = i5 + i;
        int i7 = i6 + i;
        int i8 = i7 + i;
        int i9 = i8 + i;
        int i10 = i9 + i;
        int i11 = i10 + i;
        int i12 = i11 + i;
        int i13 = i12 + i;
        int i14 = i13 + i;
        int i15 = i14 + i;
        int i16 = i15 + i;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i2) {
            int i19 = i18;
            int i20 = 0;
            while (i20 < i) {
                long j = jArr[i19 + i6];
                long j2 = j & GF16Utils.MASK_LSB;
                long j3 = (jArr[i19 + i11] ^ ((j & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j2 << 3) + j2);
                long j4 = jArr[i19 + i12];
                long j5 = (j4 & GF16Utils.MASK_MSB) >>> 3;
                long j6 = (jArr[i19 + i13] ^ ((j4 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j5 << 1) + j5);
                long j7 = j3 & GF16Utils.MASK_LSB;
                long j8 = (jArr[i19 + i8] ^ ((j3 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j7 << 3) + j7);
                long j9 = (j6 & GF16Utils.MASK_MSB) >>> 3;
                long j10 = (jArr[i19 + i7] ^ ((j6 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j9 << 1) + j9);
                long j11 = j8 & GF16Utils.MASK_LSB;
                long j12 = (jArr[i19 + i15] ^ ((j8 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j11 << 3) + j11);
                long j13 = (j10 & GF16Utils.MASK_MSB) >>> 3;
                long j14 = (jArr[i19 + i4] ^ ((j10 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j13 << 1) + j13);
                long j15 = j12 & GF16Utils.MASK_LSB;
                long j16 = (jArr[i19 + i16] ^ ((j12 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j15 << 3) + j15);
                long j17 = (j14 & GF16Utils.MASK_MSB) >>> 3;
                long j18 = (jArr[i19 + i9] ^ ((j14 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j17 << 1) + j17);
                long j19 = j16 & GF16Utils.MASK_LSB;
                long j20 = (jArr[i19 + i14] ^ ((j16 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j19 << 3) + j19);
                long j21 = (j18 & GF16Utils.MASK_MSB) >>> 3;
                long j22 = (jArr[i19 + i5] ^ ((j18 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j21 << 1) + j21);
                long j23 = j20 & GF16Utils.MASK_LSB;
                long j24 = (jArr[i19 + i10] ^ ((j20 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j23 << 3) + j23);
                long j25 = (j22 & GF16Utils.MASK_MSB) >>> 3;
                long j26 = (jArr[i19 + i3] ^ ((j22 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j25 << 1) + j25);
                long j27 = j24 & GF16Utils.MASK_LSB;
                long j28 = (jArr[i19 + i] ^ ((j24 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j27 << 3) + j27);
                long j29 = (j26 & GF16Utils.MASK_MSB) >>> 3;
                jArr2[(i18 >> 4) + i20] = (j28 ^ ((j26 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j29 << 1) + j29);
                i20++;
                i19++;
            }
            i17++;
            i18 += i << 4;
        }
    }

    public static void mayoGenericMCalculatePS(MayoParameters mayoParameters, long[] jArr, int i, int i2, byte[] bArr, int i3, int i4, int i5, long[] jArr2) {
        int i6 = i3;
        int i7 = i4;
        int i8 = i7 + i6;
        int mVecLimbs = mayoParameters.getMVecLimbs();
        long[] jArr3 = new long[((mayoParameters.getN() * (mayoParameters.getK() * mVecLimbs)) * mVecLimbs) << 4];
        int i9 = i7 * mVecLimbs;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < i6) {
            for (int i14 = i10; i14 < i6; i14++) {
                int i15 = 0;
                int i16 = 0;
                while (i15 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i12, jArr3, (((i13 + i15) << 4) + (bArr[i16 + i14] & 255)) * mVecLimbs);
                    i15++;
                    i16 += i8;
                    i9 = i9;
                }
                i12 += mVecLimbs;
            }
            int i17 = i9;
            int i18 = 0;
            int i19 = i11;
            while (i18 < i7) {
                int i20 = 0;
                int i21 = 0;
                while (i20 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i + i19, jArr3, (((i13 + i20) << 4) + (bArr[i21 + i18 + i6] & 255)) * mVecLimbs);
                    i20++;
                    i21 += i8;
                }
                i18++;
                i19 += mVecLimbs;
                i7 = i4;
            }
            i10++;
            i13 += i5;
            i11 += i17;
            i9 = i17;
            i7 = i4;
        }
        int i22 = i6 * i5;
        int i23 = 0;
        while (i6 < i8) {
            for (int i24 = i6; i24 < i8; i24++) {
                int i25 = 0;
                int i26 = 0;
                while (i25 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i2 + i23, jArr3, (((i22 + i25) << 4) + (bArr[i26 + i24] & 255)) * mVecLimbs);
                    i25++;
                    i26 += i8;
                }
                i23 += mVecLimbs;
            }
            i6++;
            i22 += i5;
        }
        mVecMultiplyBins(mVecLimbs, i8 * i5, jArr3, jArr2);
    }

    public static void mayoGenericMCalculateSPS(long[] jArr, byte[] bArr, int i, int i2, int i3, long[] jArr2) {
        int i4 = i2;
        int i5 = i4 * i4;
        long[] jArr3 = new long[(i * i5) << 4];
        int i6 = i4 * i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i4) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i3) {
                int i12 = ((bArr[i8 + i10] & 255) * i) + i9;
                int i13 = 0;
                int i14 = 0;
                while (i13 < i4) {
                    Longs.xorTo(i, jArr, i11 + i14, jArr3, (i14 << 4) + i12);
                    i13++;
                    i14 += i;
                    i4 = i2;
                }
                i10++;
                i11 += i6;
                i4 = i2;
            }
            i7++;
            i8 += i3;
            i9 += i6 << 4;
            i4 = i2;
        }
        mVecMultiplyBins(i, i5, jArr3, jArr2);
    }

    public static int mulTable(int i) {
        int i2 = i * 134480385;
        int i3 = (-252645136) & i2;
        return (i2 ^ (i3 >>> 4)) ^ (i3 >>> 3);
    }

    public static void transpose16x16Nibbles(long[] jArr, int i) {
        for (int i2 = 0; i2 < 16; i2 += 2) {
            int i3 = i + i2;
            int i4 = i3 + 1;
            long j = jArr[i3];
            long j2 = ((j >>> 4) ^ jArr[i4]) & 1085102592571150095L;
            jArr[i3] = j ^ (j2 << 4);
            jArr[i4] = jArr[i4] ^ j2;
        }
        int i5 = i;
        for (int i6 = 0; i6 < 16; i6 += 4) {
            long j3 = jArr[i5];
            long j4 = ((j3 >>> 8) ^ jArr[i5 + 2]) & EVEN_BYTES;
            int i7 = i5 + 1;
            long j5 = EVEN_BYTES & ((jArr[i7] >>> 8) ^ jArr[i5 + 3]);
            jArr[i5] = j3 ^ (j4 << 8);
            int i8 = i5 + 2;
            jArr[i7] = jArr[i7] ^ (j5 << 8);
            int i9 = i5 + 3;
            jArr[i8] = j4 ^ jArr[i8];
            i5 += 4;
            jArr[i9] = jArr[i9] ^ j5;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i + i10;
            long j6 = jArr[i11];
            int i12 = i11 + 4;
            long j7 = ((j6 >>> 16) ^ jArr[i12]) & EVEN_2BYTES;
            int i13 = i11 + 8;
            int i14 = i11 + 12;
            long j8 = EVEN_2BYTES & ((jArr[i13] >>> 16) ^ jArr[i14]);
            jArr[i11] = j6 ^ (j7 << 16);
            jArr[i13] = jArr[i13] ^ (j8 << 16);
            jArr[i12] = jArr[i12] ^ j7;
            jArr[i14] = jArr[i14] ^ j8;
        }
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i + i15;
            long j9 = jArr[i16];
            int i17 = i16 + 8;
            long j10 = ((j9 >>> 32) ^ jArr[i17]) & 4294967295L;
            jArr[i16] = j9 ^ (j10 << 32);
            jArr[i17] = jArr[i17] ^ j10;
        }
    }

    public static void vecMulAddU64(int i, long[] jArr, byte b, long[] jArr2) {
        int iMulTable = mulTable(b & 255);
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            jArr2[i2] = ((((j >>> 3) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j & GF16Utils.MASK_LSB) * ((long) (iMulTable & 255))) ^ (((j >>> 1) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j >>> 2) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i2];
        }
    }

    public static void vecMulAddU64(int i, long[] jArr, byte b, long[] jArr2, int i2) {
        int iMulTable = mulTable(b & 255);
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[i3];
            int i4 = i2 + i3;
            jArr2[i4] = ((((j >>> 3) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 24) & 15))) ^ ((((j & GF16Utils.MASK_LSB) * ((long) (iMulTable & 255))) ^ (((j >>> 1) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 8) & 15)))) ^ (((j >>> 2) & GF16Utils.MASK_LSB) * ((long) ((iMulTable >>> 16) & 15))))) ^ jArr2[i4];
        }
    }

    public void computeA(long[] jArr, byte[] bArr) {
        char c;
        int i;
        char c2;
        int k = this.params.getK();
        int o = this.params.getO();
        int m = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int aCols = this.params.getACols();
        int[] fTail = this.params.getFTail();
        int i2 = o * k;
        int i3 = o * mVecLimbs;
        int i4 = ((i2 + 15) >> 4) << 4;
        long[] jArr2 = new long[(((m + 7) >>> 3) * i4) << 4];
        int i5 = m & 15;
        if (i5 != 0) {
            long j = (1 << (i5 << 2)) - 1;
            int i6 = mVecLimbs - 1;
            int i7 = 0;
            c = 3;
            while (i7 < i2) {
                jArr[i6] = jArr[i6] & j;
                i7++;
                i6 += mVecLimbs;
            }
        } else {
            c = 3;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i8 < k) {
            int i13 = k - 1;
            int i14 = i13 * i3;
            int i15 = i13 * o;
            int i16 = i13;
            int i17 = aCols;
            int i18 = i15;
            while (i16 >= i8) {
                int i19 = 0;
                char c3 = c;
                int i20 = 0;
                while (i20 < o) {
                    int i21 = m;
                    int[] iArr = fTail;
                    int i22 = 0;
                    int i23 = 0;
                    while (i23 < mVecLimbs) {
                        long j2 = jArr[i14 + i23 + i19];
                        int iM44633 = C19373.m44633(i9, i20, i12, i22);
                        jArr2[iM44633] = jArr2[iM44633] ^ (j2 << i11);
                        if (i11 > 0) {
                            int i24 = iM44633 + i4;
                            jArr2[i24] = jArr2[i24] ^ (j2 >>> (64 - i11));
                        }
                        i23++;
                        i22 += i4;
                    }
                    i20++;
                    i19 += mVecLimbs;
                    m = i21;
                    fTail = iArr;
                }
                int i25 = m;
                int[] iArr2 = fTail;
                if (i8 != i16) {
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < o) {
                        int i28 = 0;
                        int i29 = k;
                        int i30 = 0;
                        while (i30 < mVecLimbs) {
                            long j3 = jArr[i10 + i30 + i27];
                            int iM44634 = C19373.m44633(i18, i26, i12, i28);
                            jArr2[iM44634] = jArr2[iM44634] ^ (j3 << i11);
                            if (i11 > 0) {
                                int i31 = iM44634 + i4;
                                jArr2[i31] = jArr2[i31] ^ (j3 >>> (64 - i11));
                            }
                            i30++;
                            i28 += i4;
                        }
                        i26++;
                        i27 += mVecLimbs;
                        k = i29;
                    }
                }
                int i32 = k;
                i11 += 4;
                if (i11 == 64) {
                    i12 += i4;
                    i11 = 0;
                }
                i16--;
                i14 -= i3;
                i18 -= o;
                m = i25;
                k = i32;
                c = c3;
                fTail = iArr2;
            }
            i8++;
            i9 += o;
            i10 += i3;
            aCols = i17;
        }
        int i33 = k;
        int i34 = m;
        int i35 = aCols;
        int[] iArr3 = fTail;
        char c4 = c;
        int i36 = 0;
        while (true) {
            i = (i33 + 1) * i33;
            if (i36 >= ((((i >> 1) + i34) + 15) >>> 4) * i4) {
                break;
            }
            transpose16x16Nibbles(jArr2, i36);
            i36 += 16;
        }
        byte[] bArr2 = new byte[16];
        int i37 = 0;
        int i38 = 0;
        while (true) {
            c2 = 1;
            if (i37 >= 4) {
                break;
            }
            int i39 = iArr3[i37];
            bArr2[i38] = (byte) GF16.mul(i39, 1);
            bArr2[i38 + 1] = (byte) GF16.mul(i39, 2);
            int i40 = i38 + 3;
            bArr2[i38 + 2] = (byte) GF16.mul(i39, 4);
            i38 += 4;
            bArr2[i40] = (byte) GF16.mul(i39, 8);
            i37++;
        }
        int i41 = 0;
        while (i41 < i4) {
            int i42 = i34;
            while (i42 < (i >>> 1) + i34) {
                long j4 = jArr2[((i42 >>> 4) * i4) + i41 + (i42 & 15)];
                long j5 = j4 & GF16Utils.MASK_LSB;
                long j6 = (j4 >>> c2) & GF16Utils.MASK_LSB;
                long j7 = (j4 >>> 2) & GF16Utils.MASK_LSB;
                long j8 = (j4 >>> c4) & GF16Utils.MASK_LSB;
                int i43 = 0;
                int i44 = 0;
                while (i43 < 4) {
                    int i45 = (i42 + i43) - i34;
                    int i46 = ((i45 >> 4) * i4) + i41 + (i45 & 15);
                    jArr2[i46] = jArr2[i46] ^ ((((((long) bArr2[i44]) * j5) ^ (((long) bArr2[i44 + 1]) * j6)) ^ (((long) bArr2[i44 + 2]) * j7)) ^ (((long) bArr2[i44 + 3]) * j8));
                    i43++;
                    i44 += 4;
                    i = i;
                    i4 = i4;
                    j5 = j5;
                }
                i42++;
                c2 = 1;
            }
            i41 += 16;
            c2 = 1;
        }
        int i47 = i4;
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr2);
        for (int i48 = 0; i48 < i34; i48 += 16) {
            int i49 = 0;
            while (true) {
                int i50 = i35 - 1;
                if (i49 < i50) {
                    int i51 = 0;
                    while (true) {
                        int i52 = i51 + i48;
                        if (i52 < i34) {
                            GF16.decode(bArrLongToLittleEndian, ((((i48 * i47) >> 4) + i49) + i51) << 3, bArr, (i52 * i35) + i49, Math.min(16, i50 - i49));
                            i51++;
                        }
                    }
                    i49 += 16;
                }
            }
        }
    }

    public void computeRHS(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i;
        int[] iArr;
        int m = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int k = this.params.getK();
        int[] fTail = this.params.getFTail();
        int i2 = ((m - 1) & 15) << 2;
        int i3 = m & 15;
        int i4 = 0;
        if (i3 != 0) {
            long j = (1 << (i3 << 2)) - 1;
            int i5 = k * k;
            int i6 = mVecLimbs - 1;
            int i7 = 0;
            while (i7 < i5) {
                jArr[i6] = jArr[i6] & j;
                i7++;
                i6 += mVecLimbs;
            }
        }
        long[] jArr2 = new long[mVecLimbs];
        byte[] bArr3 = new byte[mVecLimbs << 3];
        int i8 = k * mVecLimbs;
        int i9 = k - 1;
        int i10 = i9 * mVecLimbs;
        int i11 = i10 * k;
        while (i9 >= 0) {
            int i12 = i9;
            int i13 = i10;
            int i14 = i11;
            while (i12 < k) {
                int i15 = mVecLimbs - 1;
                long j2 = jArr2[i15];
                int i16 = m;
                int i17 = (int) ((j2 >>> i2) & 15);
                jArr2[i15] = j2 << 4;
                for (int i18 = mVecLimbs - 2; i18 >= 0; i18--) {
                    int i19 = i18 + 1;
                    jArr2[i19] = jArr2[i19] ^ (jArr2[i18] >>> 60);
                    jArr2[i18] = jArr2[i18] << 4;
                }
                Pack.longToLittleEndian(jArr2, bArr3, i4);
                int i20 = 0;
                while (i20 < 4) {
                    int i21 = fTail[i20];
                    if (i21 == 0) {
                        i = k;
                        iArr = fTail;
                    } else {
                        i = k;
                        iArr = fTail;
                        long jMul = GF16.mul(i17, i21);
                        if ((i20 & 1) == 0) {
                            int i22 = i20 >> 1;
                            bArr3[i22] = (byte) (bArr3[i22] ^ ((byte) (jMul & 15)));
                        } else {
                            int i23 = i20 >> 1;
                            bArr3[i23] = (byte) (bArr3[i23] ^ ((byte) ((jMul & 15) << 4)));
                        }
                    }
                    i20++;
                    k = i;
                    fTail = iArr;
                }
                int i24 = k;
                int[] iArr2 = fTail;
                Pack.littleEndianToLong(bArr3, 0, jArr2);
                int i25 = i11 + i13;
                int i26 = i14 + i10;
                boolean z = i9 == i12;
                for (int i27 = 0; i27 < mVecLimbs; i27++) {
                    long j3 = jArr[i25 + i27];
                    if (!z) {
                        j3 ^= jArr[i26 + i27];
                    }
                    jArr2[i27] = jArr2[i27] ^ j3;
                }
                i12++;
                i13 += mVecLimbs;
                i14 += i8;
                i4 = 0;
                k = i24;
                fTail = iArr2;
                m = i16;
            }
            i9--;
            i10 -= mVecLimbs;
            i11 -= i8;
            i4 = 0;
        }
        Pack.longToLittleEndian(jArr2, bArr3, 0);
        for (int i28 = 0; i28 < m; i28 += 2) {
            int i29 = i28 >> 1;
            bArr2[i28] = (byte) (bArr[i28] ^ (bArr3[i29] & 15));
            int i30 = i28 + 1;
            bArr2[i30] = (byte) (((bArr3[i29] >>> 4) & 15) ^ bArr[i30]);
        }
    }

    public void ef(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = (i4 + 15) >> 4;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        long[] jArr3 = new long[i3 * i5];
        int i6 = 16;
        int k = (this.params.getK() * this.params.getO()) + 16;
        byte[] bArr2 = new byte[k >> 1];
        int i7 = k >> 4;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < i3) {
            int i11 = 0;
            while (i11 < i5) {
                long j = 0;
                int i12 = 0;
                while (i12 < i6) {
                    int i13 = (i11 << 4) + i12;
                    if (i13 < i4) {
                        j |= (((long) bArr[i13 + i9]) & 15) << (i12 << 2);
                    }
                    i12++;
                    i6 = 16;
                    bArr = bArr;
                }
                jArr3[i11 + i10] = j;
                i11++;
                i6 = 16;
                bArr = bArr;
            }
            i8++;
            i9 += i4;
            i10 += i5;
            i6 = 16;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i4) {
            int iMax = Math.max(0, (i14 + i3) - i4);
            int i16 = i3 - 1;
            int iMin = Math.min(i16, i14);
            Arrays.clear(jArr);
            Arrays.clear(jArr2);
            int iMin2 = Math.min(i16, iMin + 32);
            int i17 = iMax * i5;
            long j2 = -1;
            int i18 = iMax;
            int i19 = 0;
            while (i18 <= iMin2) {
                int i20 = iMin2;
                long j3 = ~ctCompare64(i18, i15);
                int i21 = i7;
                byte[] bArr3 = bArr2;
                long j4 = (((long) i15) - ((long) i18)) >> 63;
                for (int i22 = 0; i22 < i5; i22++) {
                    jArr[i22] = jArr[i22] ^ ((j3 | (j4 & j2)) & jArr3[i17 + i22]);
                }
                i19 = (int) ((jArr[i14 >>> 4] >>> ((i14 & 15) << 2)) & 15);
                j2 = ~((-i19) >> 63);
                i18++;
                i17 += i5;
                iMin2 = i20;
                bArr2 = bArr3;
                i7 = i21;
            }
            int i23 = i7;
            byte[] bArr4 = bArr2;
            vecMulAddU64(i5, jArr, GF16.inv((byte) i19), jArr2);
            int i24 = i18;
            int i25 = i17;
            while (i24 <= iMin) {
                int i26 = iMin;
                long j5 = (~ctCompare64(i24, i15)) & (~j2);
                long j6 = ~j5;
                long j7 = j2;
                int i27 = i25;
                int i28 = 0;
                while (i28 < i5) {
                    jArr3[i27] = (j6 & jArr3[i27]) | (j5 & jArr2[i28]);
                    i28++;
                    i27++;
                }
                i24++;
                i25 += i5;
                iMin = i26;
                j2 = j7;
            }
            int i29 = i18;
            int i30 = i17;
            while (i29 < i) {
                vecMulAddU64(i5, jArr2, (byte) ((i29 > i15 ? -1 : 0) & ((int) ((jArr3[(i14 >>> 4) + i30] >>> ((i14 & 15) << 2)) & 15))), jArr3, i30);
                i29++;
                i30 += i5;
            }
            if (i19 != 0) {
                i15++;
            }
            i14++;
            i4 = i2;
            i3 = i;
            bArr2 = bArr4;
            i7 = i23;
        }
        int i31 = i3;
        int i32 = i7;
        byte[] bArr5 = bArr2;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (i35 < i31) {
            Pack.longToLittleEndian(jArr3, i33, i32, bArr5, 0);
            GF16.decode(bArr5, 0, bArr, i34, i2);
            i34 += i2;
            i35++;
            i33 += i5;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) throws Throwable {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i;
        byte[] bArr10;
        int i2;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        int i3;
        int i4;
        int i5;
        byte[] bArr15;
        byte[] bArr16;
        int i6;
        MayoSigner mayoSigner = this;
        int k = mayoSigner.params.getK();
        int v = mayoSigner.params.getV();
        int o = mayoSigner.params.getO();
        int n = mayoSigner.params.getN();
        int m = mayoSigner.params.getM();
        int vBytes = mayoSigner.params.getVBytes();
        int oBytes = mayoSigner.params.getOBytes();
        int saltBytes = mayoSigner.params.getSaltBytes();
        int mVecLimbs = mayoSigner.params.getMVecLimbs();
        int p1Limbs = mayoSigner.params.getP1Limbs();
        int pkSeedBytes = mayoSigner.params.getPkSeedBytes();
        int digestBytes = mayoSigner.params.getDigestBytes();
        int skSeedBytes = mayoSigner.params.getSkSeedBytes();
        byte[] bArr17 = new byte[mayoSigner.params.getMBytes()];
        byte[] bArr18 = new byte[m];
        byte[] bArr19 = new byte[m];
        byte[] bArr20 = new byte[saltBytes];
        int i7 = k * vBytes;
        int rBytes = mayoSigner.params.getRBytes() + i7;
        int i8 = i7;
        byte[] bArr21 = new byte[rBytes];
        int i9 = v * k;
        int i10 = rBytes;
        byte[] bArr22 = new byte[i9];
        int i11 = k * o;
        int i12 = k * n;
        int i13 = i11 + 1;
        byte[] bArr23 = new byte[((m + 7) / 8) * 8 * i13];
        byte[] bArr24 = new byte[i13];
        byte[] bArr25 = new byte[i12];
        int i14 = digestBytes + saltBytes;
        byte[] bArr26 = new byte[i12];
        int i15 = i14 + skSeedBytes;
        int i16 = i12;
        int i17 = i15 + 1;
        byte[] bArr27 = bArr17;
        byte[] bArr28 = new byte[i17];
        int i18 = i17;
        int sigBytes = mayoSigner.params.getSigBytes();
        byte[] bArr29 = new byte[sigBytes];
        int i19 = sigBytes;
        long[] jArr = new long[mayoSigner.params.getP2Limbs() + p1Limbs];
        int i20 = v * o;
        byte[] bArr30 = new byte[i20];
        long[] jArr2 = new long[i11 * mVecLimbs];
        int i21 = i11;
        long[] jArr3 = new long[k * k * mVecLimbs];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        try {
            byte[] seedSk = mayoSigner.privKey.getSeedSk();
            int i22 = oBytes + pkSeedBytes;
            int i23 = k;
            byte[] bArr31 = new byte[i22];
            try {
                sHAKEDigest.update(seedSk, 0, seedSk.length);
                sHAKEDigest.doFinal(bArr31, 0, i22);
                GF16.decode(bArr31, pkSeedBytes, bArr30, 0, i20);
                Utils.expandP1P2(mayoSigner.params, jArr, bArr31);
                int i24 = o * mVecLimbs;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i25 < v) {
                    byte[] bArr32 = seedSk;
                    int i29 = i26;
                    int i30 = i27;
                    int i31 = i25;
                    while (i31 < v) {
                        if (i31 == i25) {
                            i28 += mVecLimbs;
                        } else {
                            int i32 = p1Limbs;
                            int i33 = 0;
                            while (i33 < o) {
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr, i28, bArr30[i29 + i33], jArr, i27 + i32);
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr, i28, bArr30[i26 + i33], jArr, i30 + i32);
                                i33++;
                                i32 += mVecLimbs;
                            }
                            i28 += mVecLimbs;
                        }
                        i31++;
                        i29 += o;
                        i30 += i24;
                        v = v;
                    }
                    i25++;
                    i26 += o;
                    i27 += i24;
                    seedSk = bArr32;
                }
                byte[] bArr33 = seedSk;
                int i34 = v;
                Arrays.fill(bArr31, (byte) 0);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.doFinal(bArr28, 0, digestBytes);
                bArr20 = bArr20;
                mayoSigner.random.nextBytes(bArr20);
                int i35 = saltBytes;
                System.arraycopy(bArr20, 0, bArr28, digestBytes, i35);
                System.arraycopy(bArr33, 0, bArr28, i14, skSeedBytes);
                int i36 = i15;
                sHAKEDigest.update(bArr28, 0, i36);
                sHAKEDigest.doFinal(bArr20, 0, i35);
                System.arraycopy(bArr20, 0, bArr28, digestBytes, i35);
                sHAKEDigest.update(bArr28, 0, i14);
                bArr9 = bArr27;
                try {
                    sHAKEDigest.doFinal(bArr9, 0, mayoSigner.params.getMBytes());
                    bArr2 = bArr18;
                    try {
                        GF16.decode(bArr9, bArr2, m);
                        long[] jArr4 = new long[i9 * mVecLimbs];
                        int i37 = i34;
                        byte[] bArr34 = new byte[i37];
                        int i38 = 0;
                        while (true) {
                            if (i38 > 255) {
                                i = i35;
                                bArr10 = bArr34;
                                i2 = i37;
                                bArr20 = bArr20;
                                bArr11 = bArr28;
                                bArr9 = bArr9;
                                bArr2 = bArr2;
                                bArr19 = bArr19;
                                bArr3 = bArr21;
                                bArr4 = bArr22;
                                bArr12 = bArr23;
                                bArr13 = bArr24;
                                bArr14 = bArr25;
                                i3 = i16;
                                i4 = i19;
                                i5 = i23;
                                break;
                            }
                            try {
                                bArr28[i36] = (byte) i38;
                                int i39 = 0;
                                int i40 = i36;
                                int i41 = i18;
                                sHAKEDigest.update(bArr28, 0, i41);
                                byte[] bArr35 = bArr28;
                                bArr3 = bArr21;
                                int i42 = i10;
                                try {
                                    sHAKEDigest.doFinal(bArr3, 0, i42);
                                    i10 = i42;
                                    i5 = i23;
                                    while (true) {
                                        i6 = i38;
                                        if (i39 >= i5) {
                                            break;
                                        }
                                        byte[] bArr36 = bArr34;
                                        bArr27 = bArr9;
                                        bArr4 = bArr22;
                                        try {
                                            GF16.decode(bArr3, i39 * vBytes, bArr4, i39 * i37, i37);
                                            i39++;
                                            bArr22 = bArr4;
                                            i38 = i6;
                                            bArr34 = bArr36;
                                            bArr9 = bArr27;
                                        } catch (Throwable th) {
                                            th = th;
                                            bArr20 = bArr20;
                                            bArr2 = bArr2;
                                            bArr28 = bArr35;
                                            bArr19 = bArr19;
                                            bArr7 = bArr23;
                                            bArr6 = bArr24;
                                            bArr5 = bArr25;
                                            bArr8 = bArr26;
                                            bArr9 = bArr27;
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            Arrays.fill(bArr19, (byte) 0);
                                            Arrays.fill(bArr20, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr28, (byte) 0);
                                            throw th;
                                        }
                                    }
                                    bArr10 = bArr34;
                                    byte[] bArr37 = bArr9;
                                    bArr4 = bArr22;
                                    SHAKEDigest sHAKEDigest2 = sHAKEDigest;
                                    byte[] bArr38 = bArr2;
                                    bArr12 = bArr23;
                                    i2 = i37;
                                    long[] jArr5 = jArr4;
                                    long[] jArr6 = jArr2;
                                    i = i35;
                                    bArr20 = bArr20;
                                    bArr19 = bArr19;
                                    bArr25 = bArr25;
                                    int i43 = i8;
                                    i3 = i16;
                                    long[] jArr7 = jArr;
                                    i4 = i19;
                                    bArr11 = bArr35;
                                    bArr9 = bArr37;
                                    bArr2 = bArr38;
                                    try {
                                        GF16Utils.mulAddMatXMMat(mVecLimbs, bArr4, jArr, p1Limbs, jArr6, i5, i2, o);
                                        GF16Utils.mulAddMUpperTriangularMatXMatTrans(mVecLimbs, jArr7, bArr4, jArr5, i2, i5);
                                        GF16Utils.mulAddMatXMMat(mVecLimbs, bArr4, jArr5, jArr3, i5, i2);
                                        long[] jArr8 = jArr3;
                                        mayoSigner.computeRHS(jArr8, bArr2, bArr19);
                                        mayoSigner.computeA(jArr6, bArr12);
                                        bArr3 = bArr3;
                                        bArr13 = bArr24;
                                        int i44 = i21;
                                        try {
                                            GF16.decode(bArr3, i43, bArr13, 0, i44);
                                            bArr14 = bArr25;
                                            try {
                                                if (mayoSigner.sampleSolution(bArr12, bArr19, bArr13, bArr14)) {
                                                    break;
                                                }
                                                Arrays.fill(jArr6, 0L);
                                                Arrays.fill(jArr8, 0L);
                                                mayoSigner = this;
                                                jArr3 = jArr8;
                                                jArr2 = jArr6;
                                                i21 = i44;
                                                bArr25 = bArr14;
                                                bArr24 = bArr13;
                                                bArr21 = bArr3;
                                                i23 = i5;
                                                bArr23 = bArr12;
                                                i37 = i2;
                                                i18 = i41;
                                                i19 = i4;
                                                jArr = jArr7;
                                                jArr4 = jArr5;
                                                i36 = i40;
                                                bArr20 = bArr20;
                                                i16 = i3;
                                                bArr28 = bArr11;
                                                i38 = i6 + 1;
                                                bArr19 = bArr19;
                                                i8 = i43;
                                                bArr22 = bArr4;
                                                bArr2 = bArr2;
                                                bArr34 = bArr10;
                                                sHAKEDigest = sHAKEDigest2;
                                                i35 = i;
                                                bArr9 = bArr9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bArr6 = bArr13;
                                                bArr7 = bArr12;
                                                bArr8 = bArr26;
                                                bArr20 = bArr20;
                                                bArr9 = bArr9;
                                                bArr5 = bArr14;
                                                bArr28 = bArr11;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bArr14 = bArr25;
                                            bArr6 = bArr13;
                                            bArr7 = bArr12;
                                            bArr8 = bArr26;
                                            bArr20 = bArr20;
                                            bArr9 = bArr9;
                                            bArr5 = bArr14;
                                            bArr28 = bArr11;
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            Arrays.fill(bArr19, (byte) 0);
                                            Arrays.fill(bArr20, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr28, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bArr3 = bArr3;
                                        bArr13 = bArr24;
                                        bArr14 = bArr25;
                                        bArr6 = bArr13;
                                        bArr7 = bArr12;
                                        bArr8 = bArr26;
                                        bArr20 = bArr20;
                                        bArr9 = bArr9;
                                        bArr5 = bArr14;
                                        bArr28 = bArr11;
                                        Arrays.fill(bArr9, (byte) 0);
                                        Arrays.fill(bArr2, (byte) 0);
                                        Arrays.fill(bArr19, (byte) 0);
                                        Arrays.fill(bArr20, (byte) 0);
                                        Arrays.fill(bArr3, (byte) 0);
                                        Arrays.fill(bArr4, (byte) 0);
                                        Arrays.fill(bArr7, (byte) 0);
                                        Arrays.fill(bArr5, (byte) 0);
                                        Arrays.fill(bArr6, (byte) 0);
                                        Arrays.fill(bArr8, (byte) 0);
                                        Arrays.fill(bArr28, (byte) 0);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bArr11 = bArr35;
                                    bArr4 = bArr22;
                                    bArr12 = bArr23;
                                    bArr13 = bArr24;
                                    bArr14 = bArr25;
                                    bArr6 = bArr13;
                                    bArr7 = bArr12;
                                    bArr8 = bArr26;
                                    bArr20 = bArr20;
                                    bArr9 = bArr9;
                                    bArr5 = bArr14;
                                    bArr28 = bArr11;
                                    Arrays.fill(bArr9, (byte) 0);
                                    Arrays.fill(bArr2, (byte) 0);
                                    Arrays.fill(bArr19, (byte) 0);
                                    Arrays.fill(bArr20, (byte) 0);
                                    Arrays.fill(bArr3, (byte) 0);
                                    Arrays.fill(bArr4, (byte) 0);
                                    Arrays.fill(bArr7, (byte) 0);
                                    Arrays.fill(bArr5, (byte) 0);
                                    Arrays.fill(bArr6, (byte) 0);
                                    Arrays.fill(bArr8, (byte) 0);
                                    Arrays.fill(bArr28, (byte) 0);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bArr11 = bArr28;
                                bArr3 = bArr21;
                            }
                            Arrays.fill(bArr9, (byte) 0);
                            Arrays.fill(bArr2, (byte) 0);
                            Arrays.fill(bArr19, (byte) 0);
                            Arrays.fill(bArr20, (byte) 0);
                            Arrays.fill(bArr3, (byte) 0);
                            Arrays.fill(bArr4, (byte) 0);
                            Arrays.fill(bArr7, (byte) 0);
                            Arrays.fill(bArr5, (byte) 0);
                            Arrays.fill(bArr6, (byte) 0);
                            Arrays.fill(bArr8, (byte) 0);
                            Arrays.fill(bArr28, (byte) 0);
                            throw th;
                        }
                        int i45 = 0;
                        int i46 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        while (i47 < i5) {
                            int i49 = i5;
                            int i50 = i48;
                            bArr16 = bArr12;
                            bArr5 = bArr14;
                            bArr15 = bArr13;
                            try {
                                GF16Utils.matMul(bArr30, bArr14, i48, bArr10, o, i2);
                                Bytes.xor(i2, bArr4, i45, bArr10, bArr26, i46);
                                bArr8 = bArr26;
                                try {
                                    System.arraycopy(bArr5, i50, bArr8, i46 + i2, o);
                                    i47++;
                                    i48 = i50 + o;
                                    i46 += n;
                                    i45 += i2;
                                    bArr26 = bArr8;
                                    bArr14 = bArr5;
                                    bArr12 = bArr16;
                                    i5 = i49;
                                    bArr13 = bArr15;
                                } catch (Throwable th7) {
                                    th = th7;
                                    bArr7 = bArr16;
                                    bArr20 = bArr20;
                                    bArr9 = bArr9;
                                    bArr28 = bArr11;
                                    bArr6 = bArr15;
                                    Arrays.fill(bArr9, (byte) 0);
                                    Arrays.fill(bArr2, (byte) 0);
                                    Arrays.fill(bArr19, (byte) 0);
                                    Arrays.fill(bArr20, (byte) 0);
                                    Arrays.fill(bArr3, (byte) 0);
                                    Arrays.fill(bArr4, (byte) 0);
                                    Arrays.fill(bArr7, (byte) 0);
                                    Arrays.fill(bArr5, (byte) 0);
                                    Arrays.fill(bArr6, (byte) 0);
                                    Arrays.fill(bArr8, (byte) 0);
                                    Arrays.fill(bArr28, (byte) 0);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bArr8 = bArr26;
                                bArr7 = bArr16;
                                bArr20 = bArr20;
                                bArr9 = bArr9;
                                bArr28 = bArr11;
                                bArr6 = bArr15;
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                Arrays.fill(bArr19, (byte) 0);
                                Arrays.fill(bArr20, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr28, (byte) 0);
                                throw th;
                            }
                        }
                        bArr15 = bArr13;
                        bArr16 = bArr12;
                        bArr8 = bArr26;
                        bArr5 = bArr14;
                        GF16.encode(bArr8, bArr29, i3);
                        bArr20 = bArr20;
                        try {
                            System.arraycopy(bArr20, 0, bArr29, i4 - i, i);
                            byte[] bArrConcatenate = Arrays.concatenate(bArr29, bArr);
                            Arrays.fill(bArr9, (byte) 0);
                            Arrays.fill(bArr2, (byte) 0);
                            Arrays.fill(bArr19, (byte) 0);
                            Arrays.fill(bArr20, (byte) 0);
                            Arrays.fill(bArr3, (byte) 0);
                            Arrays.fill(bArr4, (byte) 0);
                            Arrays.fill(bArr16, (byte) 0);
                            Arrays.fill(bArr5, (byte) 0);
                            Arrays.fill(bArr15, (byte) 0);
                            Arrays.fill(bArr8, (byte) 0);
                            Arrays.fill(bArr11, (byte) 0);
                            return bArrConcatenate;
                        } catch (Throwable th9) {
                            th = th9;
                            bArr7 = bArr16;
                            bArr9 = bArr9;
                            bArr28 = bArr11;
                            bArr6 = bArr15;
                            Arrays.fill(bArr9, (byte) 0);
                            Arrays.fill(bArr2, (byte) 0);
                            Arrays.fill(bArr19, (byte) 0);
                            Arrays.fill(bArr20, (byte) 0);
                            Arrays.fill(bArr3, (byte) 0);
                            Arrays.fill(bArr4, (byte) 0);
                            Arrays.fill(bArr7, (byte) 0);
                            Arrays.fill(bArr5, (byte) 0);
                            Arrays.fill(bArr6, (byte) 0);
                            Arrays.fill(bArr8, (byte) 0);
                            Arrays.fill(bArr28, (byte) 0);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        bArr2 = bArr2;
                        bArr3 = bArr21;
                        bArr4 = bArr22;
                        bArr7 = bArr23;
                        bArr6 = bArr24;
                        bArr5 = bArr25;
                        bArr8 = bArr26;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bArr2 = bArr18;
                }
            } catch (Throwable th12) {
                th = th12;
                bArr28 = bArr28;
                bArr19 = bArr19;
                bArr2 = bArr18;
                bArr3 = bArr21;
                bArr4 = bArr22;
                bArr7 = bArr23;
                bArr6 = bArr24;
                bArr5 = bArr25;
                bArr8 = bArr26;
                bArr9 = bArr27;
                bArr20 = bArr20;
            }
        } catch (Throwable th13) {
            th = th13;
            bArr20 = bArr20;
            bArr28 = bArr28;
            bArr19 = bArr19;
            bArr2 = bArr18;
            bArr3 = bArr21;
            bArr4 = bArr22;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (!z) {
            MayoPublicKeyParameters mayoPublicKeyParameters = (MayoPublicKeyParameters) cipherParameters;
            this.pubKey = mayoPublicKeyParameters;
            this.params = mayoPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
            return;
        }
        this.pubKey = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (MayoPrivateKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.privKey = (MayoPrivateKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.params = this.privKey.getParameters();
    }

    public boolean sampleSolution(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i;
        int i2;
        byte[] bArr5 = bArr4;
        int k = this.params.getK();
        int o = this.params.getO();
        int m = this.params.getM();
        int aCols = this.params.getACols();
        int i3 = k * o;
        System.arraycopy(bArr3, 0, bArr5, 0, i3);
        byte[] bArr6 = new byte[m];
        int i4 = i3 + 1;
        GF16Utils.matMul(bArr, bArr3, 0, bArr6, i4, m);
        int i5 = 0;
        int i6 = i3;
        while (i5 < m) {
            bArr[i6] = (byte) (bArr2[i5] ^ bArr6[i5]);
            i5++;
            i6 += i4;
        }
        ef(bArr, m, aCols);
        int i7 = m - 1;
        int i8 = i7 * aCols;
        int i9 = 0;
        boolean z = false;
        int i10 = i8;
        while (true) {
            i = aCols - 1;
            boolean z2 = true;
            if (i9 >= i) {
                break;
            }
            if (bArr[i10] == 0) {
                z2 = false;
            }
            z |= z2;
            i9++;
            i10++;
        }
        if (!z) {
            return false;
        }
        while (i7 >= 0) {
            int iMin = Math.min((32 / (m - i7)) + i7, i3);
            byte b = 0;
            int i11 = i7;
            while (i11 <= iMin) {
                byte b2 = (byte) ((-(bArr[i8 + i11] & 255)) >> 31);
                byte b3 = (byte) ((~b) & b2 & bArr[(i8 + aCols) - 1]);
                bArr5[i11] = (byte) (bArr5[i11] ^ b3);
                int i12 = 0;
                int i13 = i11;
                int i14 = i;
                while (i12 < i7) {
                    int i15 = 0;
                    int i16 = iMin;
                    int i17 = m;
                    long j = 0;
                    int i18 = 0;
                    while (true) {
                        i2 = 8;
                        if (i18 >= 8) {
                            break;
                        }
                        j ^= ((long) (bArr[i13 + i15] & 255)) << (i18 << 3);
                        i18++;
                        i15 += aCols;
                        i8 = i8;
                    }
                    int i19 = i8;
                    long jMulFx8 = GF16Utils.mulFx8(b3, j);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i2) {
                        int i22 = i14 + i21;
                        bArr[i22] = (byte) (bArr[i22] ^ ((byte) ((jMulFx8 >> (i20 << 3)) & 15)));
                        i20++;
                        i21 += aCols;
                        i2 = 8;
                        jMulFx8 = jMulFx8;
                    }
                    i12 += 8;
                    int i23 = aCols << 3;
                    i13 += i23;
                    i14 += i23;
                    iMin = i16;
                    i8 = i19;
                    m = i17;
                }
                b = (byte) (b | b2);
                i11++;
                bArr5 = bArr4;
            }
            i7--;
            i8 -= aCols;
            bArr5 = bArr4;
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int m = this.params.getM();
        int n = this.params.getN();
        int k = this.params.getK();
        int i = k * n;
        int p1Limbs = this.params.getP1Limbs();
        int p2Limbs = this.params.getP2Limbs();
        int p3Limbs = this.params.getP3Limbs();
        int mBytes = this.params.getMBytes();
        int sigBytes = this.params.getSigBytes();
        int digestBytes = this.params.getDigestBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        byte[] bArr3 = new byte[mBytes];
        byte[] bArr4 = new byte[m];
        byte[] bArr5 = new byte[m << 1];
        byte[] bArr6 = new byte[i];
        int i2 = p1Limbs + p2Limbs;
        long[] jArr = new long[i2 + p3Limbs];
        byte[] bArr7 = new byte[digestBytes + saltBytes];
        byte[] encoded = this.pubKey.getEncoded();
        Utils.expandP1P2(this.params, jArr, encoded);
        Utils.unpackMVecs(encoded, this.params.getPkSeedBytes(), jArr, i2, p3Limbs / mVecLimbs, m);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr2, sigBytes - saltBytes, saltBytes);
        sHAKEDigest.doFinal(bArr3, 0, mBytes);
        GF16.decode(bArr3, bArr4, m);
        GF16.decode(bArr2, bArr6, i);
        long[] jArr2 = new long[k * k * mVecLimbs];
        long[] jArr3 = new long[i * mVecLimbs];
        MayoParameters mayoParameters = this.params;
        mayoGenericMCalculatePS(mayoParameters, jArr, p1Limbs, i2, bArr6, mayoParameters.getV(), this.params.getO(), k, jArr3);
        mayoGenericMCalculateSPS(jArr3, bArr6, mVecLimbs, k, n, jArr2);
        computeRHS(jArr2, new byte[m], bArr5);
        return Arrays.constantTimeAreEqual(m, bArr5, 0, bArr4, 0);
    }
}
