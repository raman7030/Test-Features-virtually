package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import p067l.C14849;

/* JADX INFO: loaded from: classes2.dex */
public class CMCEEngine {
    public int COND_BYTES;
    public int GFBITS;
    public int GFMASK;
    public int IRR_BYTES;
    public int PK_NCOLS;
    public int PK_NROWS;
    public int PK_ROW_BYTES;
    public int SYND_BYTES;
    public int SYS_N;
    public int SYS_T;
    public BENES benes;
    public boolean countErrorIndices;
    public final int defaultKeySize;

    /* JADX INFO: renamed from: gf */
    public AbstractC2364GF f81580gf;
    public int[] poly;
    public boolean usePadding;
    public boolean usePivots;

    public CMCEEngine(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        BENES benes13;
        this.usePivots = z;
        this.SYS_N = i2;
        this.SYS_T = i3;
        this.GFBITS = i;
        this.poly = iArr;
        this.defaultKeySize = i4;
        this.IRR_BYTES = i3 * 2;
        this.COND_BYTES = ((i * 2) - 1) * (1 << (i - 4));
        int i5 = i3 * i;
        this.PK_NROWS = i5;
        int i6 = i2 - i5;
        this.PK_NCOLS = i6;
        this.PK_ROW_BYTES = (i6 + 7) / 8;
        this.SYND_BYTES = (i5 + 7) / 8;
        this.GFMASK = (1 << i) - 1;
        if (i == 12) {
            this.f81580gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f81580gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    /* JADX INFO: renamed from: bm */
    private void m55419bm(short[] sArr, short[] sArr2) {
        int i;
        int i2 = this.SYS_T;
        short[] sArr3 = new short[i2 + 1];
        short[] sArr4 = new short[i2 + 1];
        short s = 1;
        short[] sArr5 = new short[i2 + 1];
        int i3 = 0;
        for (int i4 = 0; i4 < this.SYS_T + 1; i4++) {
            sArr5[i4] = 0;
            sArr4[i4] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s2 = 0;
        short s3 = 0;
        short s4 = 1;
        while (s2 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i5 = 0; i5 <= min(s2, this.SYS_T); i5++) {
                iGf_mul_ext ^= this.f81580gf.gf_mul_ext(sArr4[i5], sArr2[s2 - i5]);
            }
            short sGf_reduce = this.f81580gf.gf_reduce(iGf_mul_ext);
            short s5 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s)) - s);
            short s6 = (short) (((short) (((short) (((short) (((short) (s2 - (s3 * 2))) >> 15)) & s)) - s)) & s5);
            for (int i6 = 0; i6 <= this.SYS_T; i6++) {
                sArr3[i6] = sArr4[i6];
            }
            short sGf_frac = this.f81580gf.gf_frac(s4, sGf_reduce);
            int i7 = 0;
            while (true) {
                i = this.SYS_T;
                if (i7 > i) {
                    break;
                }
                sArr4[i7] = (short) (sArr4[i7] ^ (this.f81580gf.gf_mul(sGf_frac, sArr5[i7]) & s5));
                i7++;
            }
            int i8 = ~s6;
            int i9 = s2 + 1;
            s3 = (short) (((i9 - s3) & s6) | (s3 & i8));
            while (true) {
                i--;
                if (i >= 0) {
                    sArr5[i + 1] = (short) ((sArr5[i] & i8) | (sArr3[i] & s6));
                }
            }
            sArr5[0] = 0;
            s4 = (short) ((s6 & sGf_reduce) | (s4 & i8));
            s2 = (short) i9;
            s = 1;
        }
        while (true) {
            int i10 = this.SYS_T;
            if (i3 > i10) {
                return;
            }
            sArr[i3] = sArr4[i10 - i3];
            i3++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j, long j2, short[] sArr, int i, long j3, long j4, int[] iArr) {
        int i2;
        long j5;
        long j6;
        long j7 = j4;
        if (j3 == 1) {
            int i3 = (int) (j >> 3);
            bArr[i3] = (byte) ((get_q_short(iArr, i) << ((int) (j & 7))) ^ bArr[i3]);
            return;
        }
        long j8 = 0;
        if (sArr != null) {
            while (j8 < j7) {
                int i4 = (int) j8;
                iArr[i4] = ((sArr[i4] ^ 1) << 16) | sArr[(int) (j8 ^ 1)];
                j8++;
            }
        } else {
            while (j8 < j7) {
                long j9 = i;
                iArr[(int) j8] = get_q_short(iArr, (int) (j9 + (j8 ^ 1))) | ((get_q_short(iArr, (int) (j9 + j8)) ^ 1) << 16);
                j8++;
            }
        }
        int i5 = (int) j7;
        sort32(iArr, 0, i5);
        for (long j10 = 0; j10 < j7; j10++) {
            int i6 = (int) j10;
            int i7 = 65535 & iArr[i6];
            if (j10 >= i7) {
                i6 = i7;
            }
            iArr[(int) (j7 + j10)] = (i7 << 16) | i6;
        }
        for (long j11 = 0; j11 < j7; j11++) {
            int i8 = (int) j11;
            iArr[i8] = (int) (((long) (iArr[i8] << 16)) | j11);
        }
        sort32(iArr, 0, i5);
        for (long j12 = 0; j12 < j7; j12++) {
            int i9 = (int) j12;
            iArr[i9] = (iArr[i9] << 16) + (iArr[(int) (j7 + j12)] >> 16);
        }
        int i10 = 65535;
        sort32(iArr, 0, i5);
        if (j3 <= 10) {
            long j13 = 0;
            while (j13 < j7) {
                int i11 = (int) (j7 + j13);
                iArr[i11] = ((i10 & iArr[(int) j13]) << 10) | (iArr[i11] & 1023);
                j13++;
                i10 = 65535;
            }
            long j14 = 1;
            while (j14 < j3 - 1) {
                for (long j15 = 0; j15 < j7; j15++) {
                    iArr[(int) j15] = (int) (((long) ((iArr[(int) (j7 + j15)] & (-1024)) << 6)) | j15);
                }
                sort32(iArr, 0, i5);
                long j16 = 0;
                while (j16 < j7) {
                    int i12 = (int) j16;
                    iArr[i12] = iArr[(int) (j7 + j16)] | (iArr[i12] << 20);
                    j16++;
                    j14 = j14;
                }
                long j17 = j14;
                sort32(iArr, 0, i5);
                for (long j18 = 0; j18 < j7; j18++) {
                    int i13 = iArr[(int) j18];
                    int i14 = 1048575 & i13;
                    int i15 = (int) (j7 + j18);
                    int i16 = (i13 & 1047552) | (iArr[i15] & 1023);
                    if (i14 >= i16) {
                        i14 = i16;
                    }
                    iArr[i15] = i14;
                }
                j14 = j17 + 1;
            }
            for (long j19 = 0; j19 < j7; j19++) {
                int i17 = (int) (j7 + j19);
                iArr[i17] = iArr[i17] & 1023;
            }
            j5 = 2;
            i2 = 65535;
        } else {
            for (long j20 = 0; j20 < j7; j20++) {
                int i18 = (int) (j7 + j20);
                iArr[i18] = (iArr[(int) j20] << 16) | (iArr[i18] & 65535);
            }
            long j21 = 1;
            while (j21 < j3 - 1) {
                long j22 = 0;
                while (j22 < j7) {
                    iArr[(int) j22] = (int) (((long) (iArr[(int) (j7 + j22)] & (-65536))) | j22);
                    j22++;
                    j21 = j21;
                }
                long j23 = j21;
                sort32(iArr, 0, i5);
                for (long j24 = 0; j24 < j7; j24++) {
                    int i19 = (int) j24;
                    iArr[i19] = (iArr[i19] << 16) | (iArr[(int) (j7 + j24)] & 65535);
                }
                if (j23 < j3 - 2) {
                    for (long j25 = 0; j25 < j7; j25++) {
                        int i20 = (int) (j7 + j25);
                        iArr[i20] = (iArr[(int) j25] & (-65536)) | (iArr[i20] >> 16);
                    }
                    sort32(iArr, i5, (int) (j7 * 2));
                    for (long j26 = 0; j26 < j7; j26++) {
                        int i21 = (int) (j7 + j26);
                        iArr[i21] = (iArr[i21] << 16) | (iArr[(int) j26] & 65535);
                    }
                }
                sort32(iArr, 0, i5);
                for (long j27 = 0; j27 < j7; j27++) {
                    int i22 = (int) (j7 + j27);
                    int i23 = iArr[i22];
                    int i24 = (i23 & (-65536)) | (iArr[(int) j27] & 65535);
                    if (i24 < i23) {
                        iArr[i22] = i24;
                    }
                }
                j21 = j23 + 1;
            }
            for (long j28 = 0; j28 < j7; j28++) {
                int i25 = (int) (j7 + j28);
                iArr[i25] = iArr[i25] & 65535;
            }
            i2 = 65535;
            j5 = 2;
        }
        long j29 = 0;
        if (sArr != null) {
            while (j29 < j7) {
                int i26 = (int) j29;
                iArr[i26] = (int) (((long) (sArr[i26] << 16)) + j29);
                j29++;
            }
        } else {
            while (j29 < j7) {
                iArr[(int) j29] = (int) (((long) (get_q_short(iArr, (int) (((long) i) + j29)) << 16)) + j29);
                j29++;
            }
        }
        sort32(iArr, 0, i5);
        long j30 = 0;
        long j31 = j;
        while (true) {
            j6 = j7 / j5;
            if (j30 >= j6) {
                break;
            }
            long j32 = j30 * j5;
            long j33 = j7 + j32;
            int i27 = (int) j33;
            int i28 = iArr[i27] & 1;
            int i29 = (int) (((long) i28) + j32);
            long j34 = j30;
            int i30 = (int) (j31 >> 3);
            bArr[i30] = (byte) ((i28 << ((int) (j31 & 7))) ^ bArr[i30]);
            j31 += j2;
            iArr[i27] = i29 | (iArr[(int) j32] << 16);
            iArr[(int) (j33 + 1)] = (i29 ^ 1) | (iArr[(int) (j32 + 1)] << 16);
            i5 = i5;
            i2 = i2;
            j30 = j34 + 1;
            j7 = j4;
        }
        int i31 = i5;
        int i32 = i2;
        long j35 = j4 * j5;
        sort32(iArr, i31, (int) j35);
        long j36 = j3 * j5;
        long j37 = ((j36 - 3) * j2 * j6) + j31;
        long j38 = 0;
        while (j38 < j6) {
            long j39 = j38 * j5;
            long j40 = j4 + j39;
            int i33 = iArr[(int) j40];
            int i34 = i33 & 1;
            int i35 = (int) (((long) i34) + j39);
            int i36 = (int) (j37 >> 3);
            bArr[i36] = (byte) ((i34 << ((int) (j37 & 7))) ^ bArr[i36]);
            j37 += j2;
            iArr[(int) j39] = (i35 << 16) | (i33 & i32);
            iArr[(int) (j39 + 1)] = ((i35 ^ 1) << 16) | (iArr[(int) (j40 + 1)] & i32);
            j35 = j35;
            j38++;
            j6 = j6;
            j36 = j36;
        }
        long j41 = j35;
        long j42 = j6;
        sort32(iArr, 0, i31);
        long j43 = j37 - (((j36 - j5) * j2) * j42);
        short[] sArr2 = new short[i31 * 4];
        for (long j44 = 0; j44 < j41; j44++) {
            long j45 = j44 * j5;
            int i37 = iArr[(int) j44];
            sArr2[(int) j45] = (short) i37;
            sArr2[(int) (j45 + 1)] = (short) ((i37 & (-65536)) >> 16);
        }
        for (long j46 = 0; j46 < j42; j46++) {
            long j47 = j46 * j5;
            sArr2[(int) j46] = (short) ((iArr[(int) j47] & i32) >>> 1);
            sArr2[(int) (j46 + j42)] = (short) ((iArr[(int) (j47 + 1)] & i32) >>> 1);
        }
        for (long j48 = 0; j48 < j42; j48++) {
            long j49 = j48 * j5;
            iArr[(int) ((j4 / 4) + j4 + j48)] = (sArr2[(int) (j49 + 1)] << 16) | sArr2[(int) j49];
        }
        long j50 = j2 * j5;
        long j51 = (j4 / 4) + j4;
        long j52 = j3 - 1;
        cbrecursion(bArr, j43, j50, null, ((int) j51) * 2, j52, j42, iArr);
        cbrecursion(bArr, j43 + j2, j50, null, (int) ((j51 * j5) + j42), j52, j42, iArr);
    }

    public static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j, long j2) {
        long j3 = 2;
        int[] iArr = new int[(int) (j2 * 2)];
        int i = (int) j2;
        short[] sArr2 = new short[i];
        while (true) {
            short s = 0;
            for (int i2 = 0; i2 < (((((j * j3) - 1) * j2) / j3) + 7) / 8; i2++) {
                bArr[i2] = 0;
            }
            int i3 = i;
            short[] sArr3 = sArr2;
            int[] iArr2 = iArr;
            cbrecursion(bArr, 0L, 1L, sArr, 0, j, j2, iArr);
            for (int i4 = 0; i4 < j2; i4++) {
                sArr3[i4] = (short) i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < j; i6++) {
                layer(sArr3, bArr, i5, i6, i3);
                i5 = (int) (((long) i5) + (j2 >> 4));
            }
            for (int i7 = (int) (j - 2); i7 >= 0; i7--) {
                layer(sArr3, bArr, i5, i7, i3);
                i5 = (int) (((long) i5) + (j2 >> 4));
            }
            int i8 = 0;
            while (i8 < j2) {
                short s2 = (short) (s | (sArr[i8] ^ sArr3[i8]));
                i8++;
                s = s2;
            }
            if (s == 0) {
                return;
            }
            sArr2 = sArr3;
            i = i3;
            iArr = iArr2;
            j3 = 2;
        }
    }

    public static int ctz(long j) {
        long j2 = ~j;
        long j3 = 72340172838076673L;
        long j4 = 0;
        for (int i = 0; i < 8; i++) {
            j3 &= j2 >>> i;
            j4 += j3;
        }
        long j5 = 578721382704613384L & j4;
        long j6 = j5 | (j5 >>> 1);
        long j7 = j6 | (j6 >>> 2);
        long j8 = j4 >>> 8;
        long j9 = j4 + (j8 & j7);
        for (int i2 = 2; i2 < 8; i2++) {
            j7 &= j7 >>> 8;
            j8 >>>= 8;
            j9 += j8 & j7;
        }
        return ((int) j9) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        int i3 = this.SYS_T;
        short[] sArr = new short[i3 + 1];
        int i4 = this.SYS_N;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i3 * 2];
        short[] sArr4 = new short[i3 * 2];
        short[] sArr5 = new short[i3 + 1];
        short[] sArr6 = new short[i4];
        byte[] bArr4 = new byte[i4 / 8];
        int i5 = 0;
        while (true) {
            i = this.SYND_BYTES;
            if (i5 >= i) {
                break;
            }
            bArr4[i5] = bArr3[i5];
            i5++;
        }
        while (i < this.SYS_N / 8) {
            bArr4[i] = 0;
            i++;
        }
        int i6 = 0;
        while (true) {
            i2 = this.SYS_T;
            if (i6 >= i2) {
                break;
            }
            sArr[i6] = Utils.load_gf(bArr2, (i6 * 2) + 40, this.GFMASK);
            i6++;
        }
        sArr[i2] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        m55419bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i7 = 0; i7 < this.SYS_N / 8; i7++) {
            bArr[i7] = 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.SYS_N; i9++) {
            short sGf_iszero = (short) (this.f81580gf.gf_iszero(sArr6[i9]) & 1);
            int i10 = i9 / 8;
            bArr[i10] = (byte) (bArr[i10] | (sGf_iszero << (i9 % 8)));
            i8 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i11 = this.SYS_T ^ i8;
        for (int i12 = 0; i12 < this.SYS_T * 2; i12++) {
            i11 |= sArr3[i12] ^ sArr4[i12];
        }
        return (((i11 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s) {
        int i = this.SYS_T;
        short sGf_mul = sArr[i];
        while (true) {
            i--;
            if (i < 0) {
                return sGf_mul;
            }
            sGf_mul = (short) (this.f81580gf.gf_mul(sGf_mul, s) ^ sArr[i]);
        }
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i;
        int i2 = this.SYS_T;
        short[] sArr = new short[i2 * 2];
        short[] sArr2 = new short[i2];
        byte[] bArr2 = new byte[i2];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i3 = 0; i3 < this.SYS_T * 2; i3++) {
                    sArr[i3] = Utils.load_gf(bArr3, i3 * 2, this.GFMASK);
                }
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = this.SYS_T;
                    if (i4 >= i * 2 || i5 >= i) {
                        break;
                    }
                    short s = sArr[i4];
                    if (s < this.SYS_N) {
                        sArr2[i5] = s;
                        i5++;
                    }
                    i4++;
                }
                if (i5 < i) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i6 = 0; i6 < this.SYS_T; i6++) {
                    sArr2[i6] = Utils.load_gf(bArr4, i6 * 2, this.GFMASK);
                }
            }
            boolean z = false;
            for (int i7 = 1; i7 < this.SYS_T && !z; i7++) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (sArr2[i7] == sArr2[i8]) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                break;
            }
        }
        for (int i9 = 0; i9 < this.SYS_T; i9++) {
            bArr2[i9] = (byte) (1 << (sArr2[i9] & 7));
        }
        for (short s2 = 0; s2 < this.SYS_N / 8; s2 = (short) (s2 + 1)) {
            bArr[s2] = 0;
            for (int i10 = 0; i10 < this.SYS_T; i10++) {
                bArr[s2] = (byte) ((((short) (same_mask32(s2, (short) (sArr2[i10] >> 3)) & 255)) & bArr2[i10]) | bArr[s2]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i;
        int i2 = this.SYS_T;
        int i3 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i2 + 1, i2);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i = this.SYS_T;
            if (i3 >= i) {
                break;
            }
            this.f81580gf.gf_sqr_poly(i, this.poly, sArr2[i3], sArr2[i3 >>> 1], iArr);
            this.f81580gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i3 + 1], sArr2[i3], sArr, iArr);
            i3 += 2;
        }
        if (i3 == i) {
            this.f81580gf.gf_sqr_poly(i, this.poly, sArr2[i3], sArr2[i3 >>> 1], iArr);
        }
        int i4 = 0;
        while (true) {
            int i5 = this.SYS_T;
            if (i4 >= i5) {
                System.arraycopy(sArr2[i5], 0, sArr, 0, i5);
                return 0;
            }
            int i6 = i4 + 1;
            for (int i7 = i6; i7 < this.SYS_T; i7++) {
                short sGf_iszero = this.f81580gf.gf_iszero(sArr2[i4][i4]);
                for (int i8 = i4; i8 < this.SYS_T + 1; i8++) {
                    short[] sArr3 = sArr2[i8];
                    sArr3[i4] = (short) (sArr3[i4] ^ ((short) (sArr3[i7] & sGf_iszero)));
                }
            }
            short s = sArr2[i4][i4];
            if (s == 0) {
                return -1;
            }
            short sGf_inv = this.f81580gf.gf_inv(s);
            for (int i9 = i4; i9 < this.SYS_T + 1; i9++) {
                short[] sArr4 = sArr2[i9];
                sArr4[i4] = this.f81580gf.gf_mul(sArr4[i4], sGf_inv);
            }
            for (int i10 = 0; i10 < this.SYS_T; i10++) {
                if (i10 != i4) {
                    short s2 = sArr2[i4][i10];
                    for (int i11 = i4; i11 <= this.SYS_T; i11++) {
                        short[] sArr5 = sArr2[i11];
                        sArr5[i10] = (short) (sArr5[i10] ^ this.f81580gf.gf_mul(sArr5[i4], s2));
                    }
                }
            }
            i4 = i6;
        }
    }

    public static short get_q_short(int[] iArr, int i) {
        int i2 = i / 2;
        return (short) (i % 2 == 0 ? iArr[i2] : (iArr[i2] & (-65536)) >> 16);
    }

    public static void layer(short[] sArr, byte[] bArr, int i, int i2, int i3) {
        int i4 = 1 << i2;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6 += i4 * 2) {
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = i6 + i7;
                short s = sArr[i8];
                int i9 = i8 + i4;
                int i10 = (sArr[i9] ^ s) & (-((bArr[(i5 >> 3) + i] >> (i5 & 7)) & 1));
                sArr[i8] = (short) (s ^ i10);
                sArr[i9] = (short) (sArr[i9] ^ i10);
                i5++;
            }
        }
    }

    public static int min(short s, int i) {
        return s < i ? s : i;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        long[] jArr2 = new long[64];
        int i = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i2 = this.PK_NROWS - 32;
        int i3 = i2 / 8;
        int i4 = i2 % 8;
        if (this.usePadding) {
            for (int i5 = 0; i5 < 32; i5++) {
                for (int i6 = 0; i6 < 9; i6++) {
                    bArr2[i6] = bArr[i2 + i5][i3 + i6];
                }
                int i7 = 0;
                while (i7 < 8) {
                    int i8 = i7 + 1;
                    bArr2[i7] = (byte) (((bArr2[i7] & 255) >> i4) | (bArr2[i8] << (8 - i4)));
                    i7 = i8;
                }
                jArr2[i5] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i9 = 0; i9 < 32; i9++) {
                jArr2[i9] = Utils.load8(bArr[i2 + i9], i3);
            }
        }
        long j = 0;
        jArr[0] = 0;
        int i10 = 0;
        while (i10 < i) {
            long j2 = jArr2[i10];
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < i; i12++) {
                j2 |= jArr2[i12];
            }
            if (j2 == j) {
                return -1;
            }
            int iCtz = ctz(j2);
            long j3 = iCtz;
            jArr3[i10] = j3;
            jArr[0] = jArr[0] | (1 << ((int) j3));
            for (int i13 = i11; i13 < i; i13++) {
                long j4 = jArr2[i10];
                jArr2[i10] = j4 ^ (jArr2[i13] & (((j4 >> iCtz) & 1) - 1));
            }
            int i14 = i11;
            while (i14 < i) {
                long j5 = jArr2[i14];
                jArr2[i14] = (jArr2[i10] & (-((j5 >> iCtz) & 1))) ^ j5;
                i14++;
                jArr3 = jArr3;
                i = 32;
            }
            i10 = i11;
            j = 0;
        }
        long[] jArr4 = jArr3;
        int i15 = 0;
        int i16 = 0;
        int i17 = 32;
        int i18 = 64;
        while (i16 < i17) {
            int i19 = i16 + 1;
            int i20 = i19;
            int i21 = i18;
            while (i20 < i21) {
                int i22 = i2 + i16;
                int i23 = i2 + i20;
                long jSame_mask64 = ((long) (sArr[i22] ^ sArr[i23])) & same_mask64((short) i20, (short) jArr4[i16]);
                sArr[i22] = (short) (((long) sArr[i22]) ^ jSame_mask64);
                sArr[i23] = (short) (jSame_mask64 ^ ((long) sArr[i23]));
                i20++;
                i21 = 64;
                i19 = i19;
                i17 = 32;
            }
            i16 = i19;
            i18 = i21;
        }
        int i24 = 0;
        int i25 = 32;
        while (i24 < this.PK_NROWS) {
            if (this.usePadding) {
                for (int i26 = 0; i26 < 9; i26++) {
                    bArr2[i26] = bArr[i24][i3 + i26];
                }
                int i27 = 0;
                while (i27 < 8) {
                    int i28 = i27 + 1;
                    bArr2[i27] = (byte) (((bArr2[i27] & 255) >> i4) | (bArr2[i28] << (8 - i4)));
                    i27 = i28;
                }
                jLoad8 = Utils.load8(bArr2, i15);
            } else {
                jLoad8 = Utils.load8(bArr[i24], i3);
            }
            int i29 = 0;
            while (i29 < i25) {
                long j6 = jArr4[i29];
                long j7 = ((jLoad8 >> i29) ^ (jLoad8 >> ((int) j6))) & 1;
                jLoad8 = ((j7 << ((int) j6)) ^ jLoad8) ^ (j7 << i29);
                i29++;
                i25 = 32;
            }
            if (this.usePadding) {
                Utils.store8(bArr2, 0, jLoad8);
                byte[] bArr3 = bArr[i24];
                int i30 = i3 + 8;
                int i31 = 8 - i4;
                bArr3[i30] = (byte) ((((bArr3[i30] & 255) >>> i4) << i4) | ((bArr2[7] & 255) >>> i31));
                bArr3[i3] = (byte) (((bArr2[0] & 255) << i4) | (((bArr3[i3] & 255) << i31) >>> i31));
                for (int i32 = 7; i32 >= 1; i32--) {
                    bArr[i24][i3 + i32] = (byte) (((bArr2[i32] & 255) << i4) | ((bArr2[i32 - 1] & 255) >>> i31));
                }
            } else {
                Utils.store8(bArr[i24], i3, jLoad8);
            }
            i24++;
            i25 = 32;
            i15 = 0;
        }
        return i15;
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i;
        int i2;
        int i3 = this.SYS_T;
        short[] sArr2 = new short[i3 + 1];
        byte b = 1;
        sArr2[i3] = 1;
        for (int i4 = 0; i4 < this.SYS_T; i4++) {
            sArr2[i4] = Utils.load_gf(bArr2, (i4 * 2) + 40, this.GFMASK);
        }
        int i5 = 1 << this.GFBITS;
        long[] jArr2 = new long[i5];
        for (int i6 = 0; i6 < (1 << this.GFBITS); i6++) {
            long j = iArr[i6];
            jArr2[i6] = j;
            long j2 = j << 31;
            jArr2[i6] = j2;
            long j3 = j2 | ((long) i6);
            jArr2[i6] = j3;
            jArr2[i6] = j3 & C14849.FOREVER_NS;
        }
        sort64(jArr2, 0, i5);
        for (int i7 = 1; i7 < (1 << this.GFBITS); i7++) {
            if ((jArr2[i7 - 1] >> 31) == (jArr2[i7] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i8 = 0; i8 < (1 << this.GFBITS); i8++) {
            sArr[i8] = (short) (jArr2[i8] & ((long) this.GFMASK));
        }
        int i9 = 0;
        while (true) {
            i = this.SYS_N;
            if (i9 >= i) {
                break;
            }
            sArr3[i9] = Utils.bitrev(sArr[i9], this.GFBITS);
            i9++;
        }
        short[] sArr4 = new short[i];
        root(sArr4, sArr2, sArr3);
        int i10 = 0;
        while (true) {
            i2 = this.SYS_N;
            if (i10 >= i2) {
                break;
            }
            sArr4[i10] = this.f81580gf.gf_inv(sArr4[i10]);
            i10++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i2 / 8);
        for (int i11 = 0; i11 < this.PK_NROWS; i11++) {
            for (int i12 = 0; i12 < this.SYS_N / 8; i12++) {
                bArr3[i11][i12] = 0;
            }
        }
        int i13 = 0;
        while (i13 < this.SYS_T) {
            for (int i14 = 0; i14 < this.SYS_N; i14 += 8) {
                int i15 = 0;
                while (true) {
                    int i16 = this.GFBITS;
                    if (i15 < i16) {
                        bArr3[(i16 * i13) + i15][i14 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i14 + 7] >>> i15) & 1)) << 1)) | ((sArr4[i14 + 6] >>> i15) & 1))) << 1)) | ((sArr4[i14 + 5] >>> i15) & 1))) << 1)) | ((sArr4[i14 + 4] >>> i15) & 1))) << 1)) | ((sArr4[i14 + 3] >>> i15) & 1))) << 1)) | ((sArr4[i14 + 2] >>> i15) & 1))) << 1)) | ((sArr4[i14 + 1] >>> i15) & 1))) << 1)) | ((sArr4[i14] >>> i15) & 1));
                        i15++;
                    }
                }
            }
            for (int i17 = 0; i17 < this.SYS_N; i17++) {
                sArr4[i17] = this.f81580gf.gf_mul(sArr4[i17], sArr3[i17]);
            }
            i13++;
        }
        int i18 = 0;
        while (true) {
            int i19 = this.PK_NROWS;
            if (i18 >= i19) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i20 = ((this.SYS_N - i19) + 7) / 8;
                        int i21 = 0;
                        while (true) {
                            int i22 = this.PK_NROWS;
                            if (i21 >= i22) {
                                break;
                            }
                            System.arraycopy(bArr3[i21], i22 / 8, bArr, i20 * i21, i20);
                            i21++;
                        }
                    } else {
                        int i23 = i19 % 8;
                        if (i23 != 0) {
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                int i26 = this.PK_NROWS;
                                if (i24 >= i26) {
                                    break;
                                }
                                int i27 = (i26 - 1) / 8;
                                while (i27 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i24];
                                    int i28 = (bArr4[i27] & 255) >>> i23;
                                    i27++;
                                    bArr[i25] = (byte) ((bArr4[i27] << (8 - i23)) | i28);
                                    i25++;
                                }
                                bArr[i25] = (byte) ((bArr3[i24][i27] & 255) >>> i23);
                                i24++;
                                i25++;
                            }
                        } else {
                            System.arraycopy(bArr3[i13], (i19 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i13 = i18 >>> 3;
            int i29 = i18 & 7;
            if (this.usePivots && i18 == i19 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i30 = i18 + 1;
            int i31 = i30;
            while (i31 < this.PK_NROWS) {
                byte b2 = (byte) (-((byte) (b & ((byte) (((byte) (bArr3[i18][i13] ^ bArr3[i31][i13])) >> i29)))));
                for (int i32 = 0; i32 < this.SYS_N / 8; i32++) {
                    byte[] bArr5 = bArr3[i18];
                    bArr5[i32] = (byte) (bArr5[i32] ^ (bArr3[i31][i32] & b2));
                }
                i31++;
                b = 1;
            }
            if (((bArr3[i18][i13] >> i29) & 1) == 0) {
                return -1;
            }
            for (int i33 = 0; i33 < this.PK_NROWS; i33++) {
                if (i33 != i18) {
                    byte b3 = (byte) (-((byte) (((byte) (bArr3[i33][i13] >> i29)) & 1)));
                    for (int i34 = 0; i34 < this.SYS_N / 8; i34++) {
                        byte[] bArr6 = bArr3[i33];
                        bArr6[i34] = (byte) (bArr6[i34] ^ (bArr3[i18][i34] & b3));
                    }
                }
            }
            b = 1;
            i18 = i30;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SYS_N; i++) {
            sArr[i] = eval(sArr2, sArr3[i]);
        }
    }

    public static byte same_mask32(short s, short s2) {
        return (byte) ((-(((s ^ s2) - 1) >>> 31)) & 255);
    }

    public static long same_mask64(short s, short s2) {
        return -((((long) (s ^ s2)) - 1) >>> 63);
    }

    public static void sort32(int[] iArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        int i4 = 1;
        while (i4 < i3 - i4) {
            i4 += i4;
        }
        for (int i5 = i4; i5 > 0; i5 >>>= 1) {
            int i6 = 0;
            for (int i7 = 0; i7 < i3 - i5; i7++) {
                if ((i7 & i5) == 0) {
                    int i8 = i + i7;
                    int i9 = i8 + i5;
                    int i10 = iArr[i9];
                    int i11 = iArr[i8];
                    int i12 = i10 ^ i11;
                    int i13 = i10 - i11;
                    int i14 = ((((i10 ^ i13) & i12) ^ i13) >> 31) & i12;
                    iArr[i8] = i11 ^ i14;
                    iArr[i9] = iArr[i9] ^ i14;
                }
            }
            for (int i15 = i4; i15 > i5; i15 >>>= 1) {
                while (i6 < i3 - i15) {
                    if ((i6 & i5) == 0) {
                        int i16 = i + i6;
                        int i17 = i16 + i5;
                        int i18 = iArr[i17];
                        for (int i19 = i15; i19 > i5; i19 >>>= 1) {
                            int i20 = i16 + i19;
                            int i21 = iArr[i20];
                            int i22 = i21 ^ i18;
                            int i23 = i21 - i18;
                            int i24 = i22 & ((i23 ^ ((i23 ^ i21) & i22)) >> 31);
                            i18 ^= i24;
                            iArr[i20] = i21 ^ i24;
                        }
                        iArr[i17] = i18;
                    }
                    i6++;
                }
            }
        }
    }

    public static void sort64(long[] jArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 2) {
            return;
        }
        int i4 = 1;
        while (i4 < i3 - i4) {
            i4 += i4;
        }
        for (int i5 = i4; i5 > 0; i5 >>>= 1) {
            int i6 = 0;
            for (int i7 = 0; i7 < i3 - i5; i7++) {
                if ((i7 & i5) == 0) {
                    int i8 = i + i7;
                    int i9 = i8 + i5;
                    long j = jArr[i9];
                    long j2 = jArr[i8];
                    long j3 = (j ^ j2) & (-((j - j2) >>> 63));
                    jArr[i8] = j2 ^ j3;
                    jArr[i9] = jArr[i9] ^ j3;
                }
            }
            for (int i10 = i4; i10 > i5; i10 >>>= 1) {
                while (i6 < i3 - i10) {
                    if ((i6 & i5) == 0) {
                        int i11 = i + i6;
                        int i12 = i11 + i5;
                        long j4 = jArr[i12];
                        for (int i13 = i10; i13 > i5; i13 >>>= 1) {
                            int i14 = i11 + i13;
                            long j5 = jArr[i14];
                            long j6 = (-((j5 - j4) >>> 63)) & (j4 ^ j5);
                            j4 ^= j6;
                            jArr[i14] = j5 ^ j6;
                        }
                        jArr[i12] = j4;
                    }
                    i6++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s = (short) (bArr[0] & 1);
        short s2 = sArr3[0];
        short sEval = eval(sArr2, s2);
        AbstractC2364GF abstractC2364GF = this.f81580gf;
        short sGf_inv = (short) ((-s) & abstractC2364GF.gf_inv(abstractC2364GF.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i = 1; i < this.SYS_T * 2; i++) {
            sGf_inv = this.f81580gf.gf_mul(sGf_inv, s2);
            sArr[i] = sGf_inv;
        }
        for (int i2 = 1; i2 < this.SYS_N; i2++) {
            short s3 = (short) ((bArr[i2 / 8] >> (i2 % 8)) & 1);
            short s4 = sArr3[i2];
            short sEval2 = eval(sArr2, s4);
            AbstractC2364GF abstractC2364GF2 = this.f81580gf;
            short sGf_mul = this.f81580gf.gf_mul(abstractC2364GF2.gf_inv(abstractC2364GF2.gf_sq(sEval2)), s3);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i3 = 1; i3 < this.SYS_T * 2; i3++) {
                sGf_mul = this.f81580gf.gf_mul(sGf_mul, s4);
                sArr[i3] = (short) (sArr[i3] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i = this.PK_NROWS % 8;
        for (int i2 = 0; i2 < this.SYND_BYTES; i2++) {
            bArr[i2] = 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.PK_NROWS; i4++) {
            for (int i5 = 0; i5 < this.SYS_N / 8; i5++) {
                sArr[i5] = 0;
            }
            int i6 = 0;
            while (true) {
                int i7 = this.PK_ROW_BYTES;
                if (i6 >= i7) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i7) + i6] = bArr2[i3 + i6];
                i6++;
            }
            if (this.usePadding) {
                for (int i8 = (this.SYS_N / 8) - 1; i8 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i8--) {
                    sArr[i8] = (short) ((((sArr[i8] & 255) << i) | ((sArr[i8 - 1] & 255) >>> (8 - i))) & 255);
                }
            }
            int i9 = i4 / 8;
            int i10 = i4 % 8;
            sArr[i9] = (short) (sArr[i9] | (1 << i10));
            byte b = 0;
            for (int i11 = 0; i11 < this.SYS_N / 8; i11++) {
                b = (byte) (b ^ (sArr[i11] & bArr3[i11]));
            }
            byte b2 = (byte) ((b >>> 4) ^ b);
            byte b3 = (byte) (b2 ^ (b2 >>> 2));
            bArr[i9] = (byte) ((((byte) (1 & ((byte) (b3 ^ (b3 >>> 1))))) << i10) | bArr[i9]);
            i3 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b = 0;
        for (int i = 0; i < this.PK_NROWS; i++) {
            int i2 = this.PK_ROW_BYTES;
            b = (byte) (b | bArr[((i * i2) + i2) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i2 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i3 = i2 + 32;
        byte[] bArr3 = new byte[i3];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i3);
        if (bArr.length <= 40) {
            short[] sArr = new short[this.SYS_T];
            int i4 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i4];
            int i5 = i2 - i4;
            for (int i6 = 0; i6 < this.SYS_T; i6++) {
                sArr[i6] = Utils.load_gf(bArr3, (i6 * 2) + i5, this.GFMASK);
            }
            generate_irr_poly(sArr);
            for (int i7 = 0; i7 < this.SYS_T; i7++) {
                Utils.store_gf(bArr4, i7 * 2, sArr[i7]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i8 = this.IRR_BYTES;
        if (length <= i8 + 40) {
            int i9 = this.GFBITS;
            int[] iArr = new int[1 << i9];
            short[] sArr2 = new short[1 << i9];
            int i10 = (i2 - i8) - ((1 << i9) * 4);
            int i11 = 0;
            while (true) {
                i = this.GFBITS;
                if (i11 >= (1 << i)) {
                    break;
                }
                iArr[i11] = Utils.load4(bArr3, (i11 * 4) + i10);
                i11++;
            }
            if (this.usePivots) {
                pk_gen(null, bArr2, iArr, sArr2, new long[]{0});
            } else {
                int i12 = 1 << i;
                long[] jArr = new long[i12];
                for (int i13 = 0; i13 < (1 << this.GFBITS); i13++) {
                    long j = iArr[i13];
                    jArr[i13] = j;
                    long j2 = j << 31;
                    jArr[i13] = j2;
                    long j3 = j2 | ((long) i13);
                    jArr[i13] = j3;
                    jArr[i13] = j3 & C14849.FOREVER_NS;
                }
                sort64(jArr, 0, i12);
                for (int i14 = 0; i14 < (1 << this.GFBITS); i14++) {
                    sArr2[i14] = (short) (jArr[i14] & ((long) this.GFMASK));
                }
            }
            int i15 = this.COND_BYTES;
            byte[] bArr5 = new byte[i15];
            int i16 = this.GFBITS;
            controlbitsfrompermutation(bArr5, sArr2, i16, 1 << i16);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i15);
        }
        int privateKeySize = getPrivateKeySize();
        int i17 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i17 / 8), i17 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i = this.GFBITS;
        short[] sArr = new short[1 << i];
        long[] jArr = {0};
        int[] iArr = new int[1 << i];
        int i2 = ((1 << i) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i2];
        int i3 = ((i2 - 32) - this.IRR_BYTES) - ((1 << i) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i2);
        for (int i4 = 0; i4 < (1 << this.GFBITS); i4++) {
            iArr[i4] = Utils.load4(bArr3, (i4 * 4) + i3);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i - 1) / 8)) * i;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.SYS_N;
        byte[] bArr4 = new byte[i / 8];
        int i2 = (i / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i2];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i3 = 0;
        while (i3 < this.SYS_N / 8) {
            int i4 = i3 + 1;
            bArr5[i4] = (byte) ((bArr4[i3] & sDecrypt) | ((~sDecrypt) & bArr3[i3 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i3 = i4;
        }
        for (int i5 = 0; i5 < this.SYND_BYTES; i5++) {
            bArr5[(this.SYS_N / 8) + 1 + i5] = bArr2[i5];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i2);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b = (byte) iCheck_c_padding;
        for (int i6 = 0; i6 < bArr.length; i6++) {
            bArr[i6] = (byte) (bArr[i6] | b);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i = this.SYS_N / 8;
        byte[] bArr4 = new byte[i];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i2 = 0; i2 < this.SYND_BYTES; i2++) {
            bArr[i2] = (byte) (bArr[i2] & b);
        }
        for (int i3 = 0; i3 < 32; i3++) {
            bArr2[i3] = (byte) (bArr2[i3] & b);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i;
        int i2;
        short[] sArr;
        int i3;
        long j;
        int i4 = 32;
        byte[] bArr3 = new byte[32];
        int i5 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i6 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i7 = i6 + 32;
        byte[] bArr5 = new byte[i7];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        int i8 = 1;
        while (true) {
            sHAKEDigest.update(bArr4, i5, i8);
            sHAKEDigest.update(bArr3, i5, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i5, i7);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i6, i6 + 32);
            System.arraycopy(bArr6, i5, bArr2, i5, i4);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i5, i4);
            int i9 = this.SYS_T;
            short[] sArr2 = new short[i9];
            int i10 = i6 - (i9 * 2);
            for (int i11 = 0; i11 < this.SYS_T; i11++) {
                sArr2[i11] = Utils.load_gf(bArr5, (i11 * 2) + i10, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i12 = 0; i12 < this.SYS_T; i12++) {
                    Utils.store_gf(bArr2, (i12 * 2) + 40, sArr2[i12]);
                }
                int i13 = this.GFBITS;
                int[] iArr = new int[1 << i13];
                i = i10 - ((1 << i13) * 4);
                int i14 = 0;
                while (true) {
                    i2 = this.GFBITS;
                    if (i14 >= (1 << i2)) {
                        break;
                    }
                    iArr[i14] = Utils.load4(bArr5, (i14 * 4) + i);
                    i14++;
                }
                sArr = new short[1 << i2];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            i4 = 32;
            i8 = 1;
            i5 = 0;
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            bArr4 = bArr4;
        }
        int i15 = this.COND_BYTES;
        byte[] bArr7 = new byte[i15];
        int i16 = this.GFBITS;
        controlbitsfrompermutation(bArr7, sArr, i16, 1 << i16);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i15);
        int i17 = this.SYS_N;
        System.arraycopy(bArr5, i - (i17 / 8), bArr2, bArr2.length - (i17 / 8), i17 / 8);
        if (this.usePivots) {
            i3 = 32;
            j = jArr[0];
        } else {
            j = 4294967295L;
            i3 = 32;
        }
        Utils.store8(bArr2, i3, j);
    }
}
