package org.bouncycastle.crypto.engines;

import l.C20177;
import l.C3200;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    public static final long C_240 = 2004413935125273122L;
    public static final int MAX_ROUNDS = 80;
    public static int[] MOD17 = null;
    public static int[] MOD3 = null;
    public static int[] MOD5 = null;
    public static int[] MOD9 = null;
    public static final int ROUNDS_1024 = 80;
    public static final int ROUNDS_256 = 72;
    public static final int ROUNDS_512 = 72;
    public static final int TWEAK_SIZE_BYTES = 16;
    public static final int TWEAK_SIZE_WORDS = 2;
    public int blocksizeBytes;
    public int blocksizeWords;
    public ThreefishCipher cipher;
    public long[] currentBlock;
    public boolean forEncryption;
    public long[] kw;
    public long[] t;

    public final class Threefish1024Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 24;
        public static final int ROTATION_0_1 = 13;
        public static final int ROTATION_0_2 = 8;
        public static final int ROTATION_0_3 = 47;
        public static final int ROTATION_0_4 = 8;
        public static final int ROTATION_0_5 = 17;
        public static final int ROTATION_0_6 = 22;
        public static final int ROTATION_0_7 = 37;
        public static final int ROTATION_1_0 = 38;
        public static final int ROTATION_1_1 = 19;
        public static final int ROTATION_1_2 = 10;
        public static final int ROTATION_1_3 = 55;
        public static final int ROTATION_1_4 = 49;
        public static final int ROTATION_1_5 = 18;
        public static final int ROTATION_1_6 = 23;
        public static final int ROTATION_1_7 = 52;
        public static final int ROTATION_2_0 = 33;
        public static final int ROTATION_2_1 = 4;
        public static final int ROTATION_2_2 = 51;
        public static final int ROTATION_2_3 = 13;
        public static final int ROTATION_2_4 = 34;
        public static final int ROTATION_2_5 = 41;
        public static final int ROTATION_2_6 = 59;
        public static final int ROTATION_2_7 = 17;
        public static final int ROTATION_3_0 = 5;
        public static final int ROTATION_3_1 = 20;
        public static final int ROTATION_3_2 = 48;
        public static final int ROTATION_3_3 = 41;
        public static final int ROTATION_3_4 = 47;
        public static final int ROTATION_3_5 = 28;
        public static final int ROTATION_3_6 = 16;
        public static final int ROTATION_3_7 = 25;
        public static final int ROTATION_4_0 = 41;
        public static final int ROTATION_4_1 = 9;
        public static final int ROTATION_4_2 = 37;
        public static final int ROTATION_4_3 = 31;
        public static final int ROTATION_4_4 = 12;
        public static final int ROTATION_4_5 = 47;
        public static final int ROTATION_4_6 = 44;
        public static final int ROTATION_4_7 = 30;
        public static final int ROTATION_5_0 = 16;
        public static final int ROTATION_5_1 = 34;
        public static final int ROTATION_5_2 = 56;
        public static final int ROTATION_5_3 = 51;
        public static final int ROTATION_5_4 = 4;
        public static final int ROTATION_5_5 = 53;
        public static final int ROTATION_5_6 = 42;
        public static final int ROTATION_5_7 = 41;
        public static final int ROTATION_6_0 = 31;
        public static final int ROTATION_6_1 = 44;
        public static final int ROTATION_6_2 = 47;
        public static final int ROTATION_6_3 = 46;
        public static final int ROTATION_6_4 = 19;
        public static final int ROTATION_6_5 = 42;
        public static final int ROTATION_6_6 = 44;
        public static final int ROTATION_6_7 = 25;
        public static final int ROTATION_7_0 = 9;
        public static final int ROTATION_7_1 = 48;
        public static final int ROTATION_7_2 = 35;
        public static final int ROTATION_7_3 = 52;
        public static final int ROTATION_7_4 = 23;
        public static final int ROTATION_7_5 = 31;
        public static final int ROTATION_7_6 = 37;
        public static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long jXorRotr = jArr[3];
            long j4 = jArr[4];
            long j5 = jArr[5];
            long j6 = jArr[6];
            long j7 = jArr[7];
            long j8 = jArr[8];
            long j9 = jArr[9];
            long j10 = jArr[10];
            long j11 = jArr[11];
            long j12 = jArr[12];
            long jXorRotr2 = jArr[13];
            long j13 = jArr[14];
            long jXorRotr3 = jArr[15];
            int i2 = 9;
            int i3 = 19;
            while (i3 >= i) {
                int i4 = iArr[i3];
                int i5 = iArr2[i3];
                int i6 = i4 + 1;
                long j14 = j - jArr3[i6];
                int i7 = i4 + 2;
                long j15 = j2 - jArr3[i7];
                int i8 = i4 + 3;
                long j16 = j3 - jArr3[i8];
                int i9 = i4 + 4;
                long j17 = jXorRotr - jArr3[i9];
                int i10 = i4 + 5;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j18 = j4 - jArr3[i10];
                int i11 = i4 + 6;
                long j19 = j5 - jArr3[i11];
                int i12 = i4 + 7;
                long j20 = j6 - jArr3[i12];
                int i13 = i4 + 8;
                long j21 = j7 - jArr3[i13];
                int i14 = i4 + 9;
                long j22 = j8 - jArr3[i14];
                int i15 = i4 + 10;
                long j23 = j9 - jArr3[i15];
                int i16 = i4 + 11;
                long j24 = j10 - jArr3[i16];
                int i17 = i4 + 12;
                long j25 = j11 - jArr3[i17];
                int i18 = i4 + 13;
                long j26 = j12 - jArr3[i18];
                int i19 = i4 + 14;
                int i20 = i5 + 1;
                long j27 = jXorRotr2 - (jArr3[i19] + jArr4[i20]);
                int i21 = i4 + 15;
                long j28 = j13 - (jArr3[i21] + jArr4[i5 + 2]);
                long[] jArr5 = jArr3;
                long j29 = i3;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3 - ((jArr3[i4 + 16] + j29) + 1), i2, j14);
                long j30 = j14 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j25, 48, j16);
                long j31 = j16 - jXorRotr5;
                long[] jArr6 = jArr4;
                long jXorRotr6 = ThreefishEngine.xorRotr(j27, 35, j20);
                long j32 = j20 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j23, 52, j18);
                long j33 = j18 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j15, 23, j28);
                long j34 = j28 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j19, 31, j22);
                long j35 = j22 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(j17, 37, j24);
                long j36 = j24 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j21, 20, j26);
                long j37 = j26 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 31, j30);
                long j38 = j30 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr9, 44, j31);
                long j39 = j31 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 47, j33);
                long j40 = j33 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr8, 46, j32);
                long j41 = j32 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr4, 19, j37);
                long j42 = j37 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr6, 42, j34);
                long j43 = j34 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr5, 44, j35);
                long j44 = j35 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr7, 25, j36);
                long j45 = j36 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr19, 16, j38);
                long j46 = j38 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr17, 34, j39);
                long j47 = j39 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr18, 56, j41);
                long j48 = j41 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr16, 51, j40);
                long j49 = j40 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr12, 4, j45);
                long j50 = j45 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr14, 53, j42);
                long j51 = j42 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr13, 42, j43);
                long j52 = j43 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr15, 41, j44);
                long j53 = j44 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr27, 41, j46);
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr25, 9, j47);
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 37, j49);
                long j54 = j49 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr24, 31, j48);
                long j55 = j48 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr20, 12, j53);
                long j56 = j53 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr22, 47, j50);
                long j57 = j50 - jXorRotr33;
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr21, 44, j51);
                long j58 = j51 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(jXorRotr23, 30, j52);
                long j59 = j52 - jXorRotr35;
                long j60 = (j46 - jXorRotr28) - jArr5[i4];
                long j61 = jXorRotr28 - jArr5[i6];
                long j62 = (j47 - jXorRotr29) - jArr5[i7];
                long j63 = jXorRotr29 - jArr5[i8];
                long j64 = j54 - jArr5[i9];
                long j65 = jXorRotr30 - jArr5[i10];
                long j66 = j55 - jArr5[i11];
                long j67 = jXorRotr31 - jArr5[i12];
                long j68 = j56 - jArr5[i13];
                long j69 = jXorRotr32 - jArr5[i14];
                long j70 = j57 - jArr5[i15];
                long j71 = jXorRotr33 - jArr5[i16];
                long j72 = j58 - jArr5[i17];
                long j73 = jXorRotr34 - (jArr5[i18] + jArr6[i5]);
                long j74 = j59 - (jArr5[i19] + jArr6[i20]);
                long jXorRotr36 = ThreefishEngine.xorRotr(jXorRotr35 - (jArr5[i21] + j29), 5, j60);
                long j75 = j60 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j71, 20, j62);
                long j76 = j62 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j73, 48, j66);
                long j77 = j66 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j69, 41, j64);
                long j78 = j64 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j61, 47, j74);
                long j79 = j74 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j65, 28, j68);
                long j80 = j68 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(j63, 16, j70);
                long j81 = j70 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(j67, 25, j72);
                long j82 = j72 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr43, 33, j75);
                long j83 = j75 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr41, 4, j76);
                long j84 = j76 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr42, 51, j78);
                long j85 = j78 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr40, 13, j77);
                long j86 = j77 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr36, 34, j82);
                long j87 = j82 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr38, 41, j79);
                long j88 = j79 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr37, 59, j80);
                long j89 = j80 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr39, 17, j81);
                long j90 = j81 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr51, 38, j83);
                long j91 = j83 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr49, 19, j84);
                long j92 = j84 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr50, 10, j86);
                long j93 = j86 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr48, 55, j85);
                long j94 = j85 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr44, 49, j90);
                long j95 = j90 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr46, 18, j87);
                long j96 = j87 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr45, 23, j88);
                long j97 = j88 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr47, 52, j89);
                long j98 = j89 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr59, 24, j91);
                j = j91 - jXorRotr60;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr57, 13, j92);
                j3 = j92 - jXorRotr;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr58, 8, j94);
                long j99 = j94 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr56, 47, j93);
                long j100 = j93 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 8, j98);
                long j101 = j98 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr54, 17, j95);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr53, 22, j96);
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr55, 37, j97);
                i3 -= 2;
                i2 = 9;
                i = 1;
                j12 = j96 - jXorRotr2;
                iArr = iArr3;
                iArr2 = iArr4;
                jArr4 = jArr6;
                j13 = j97 - jXorRotr3;
                jArr3 = jArr5;
                j6 = j100;
                j11 = jXorRotr64;
                j7 = jXorRotr62;
                j4 = j99;
                j9 = jXorRotr63;
                j5 = jXorRotr61;
                j8 = j101;
                j2 = jXorRotr60;
                j10 = j95 - jXorRotr64;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j102 = j - jArr7[0];
            long j103 = j2 - jArr7[1];
            long j104 = j3 - jArr7[2];
            long j105 = jXorRotr - jArr7[3];
            long j106 = j4 - jArr7[4];
            long j107 = j5 - jArr7[5];
            long j108 = j6 - jArr7[6];
            long j109 = j7 - jArr7[7];
            long j110 = j8 - jArr7[8];
            long j111 = j9 - jArr7[9];
            long j112 = j10 - jArr7[10];
            long j113 = j11 - jArr7[11];
            long j114 = j12 - jArr7[12];
            long j115 = jXorRotr2 - (jArr7[13] + jArr8[0]);
            long j116 = j13 - (jArr7[14] + jArr8[1]);
            long j117 = jXorRotr3 - jArr7[15];
            jArr2[0] = j102;
            jArr2[1] = j103;
            jArr2[2] = j104;
            jArr2[3] = j105;
            jArr2[4] = j106;
            jArr2[5] = j107;
            jArr2[6] = j108;
            jArr2[7] = j109;
            jArr2[8] = j110;
            jArr2[9] = j111;
            jArr2[10] = j112;
            jArr2[11] = j113;
            jArr2[12] = j114;
            jArr2[13] = j115;
            jArr2[14] = j116;
            jArr2[15] = j117;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = j + jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = j4 + jArr3[3];
            long j21 = j5 + jArr3[4];
            long j22 = j6 + jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = j8 + jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = j10 + jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = j12 + jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = jArr3[13] + jArr4[0] + j14;
            long j31 = jArr3[14] + jArr4[1] + j15;
            int i = 1;
            long j32 = j22;
            long j33 = j24;
            long j34 = j26;
            long j35 = j28;
            long j36 = j16 + jArr3[15];
            long j37 = j30;
            int i2 = 13;
            while (i < 20) {
                int i3 = iArr[i];
                int i4 = iArr2[i];
                long j38 = j17 + j18;
                int[] iArr3 = iArr;
                long jRotlXor = ThreefishEngine.rotlXor(j18, 24, j38);
                long j39 = j19 + j20;
                long jRotlXor2 = ThreefishEngine.rotlXor(j20, i2, j39);
                int[] iArr4 = iArr2;
                long j40 = j21 + j32;
                long jRotlXor3 = ThreefishEngine.rotlXor(j32, 8, j40);
                int i5 = i;
                long j41 = j33;
                long j42 = j23 + j41;
                long jRotlXor4 = ThreefishEngine.rotlXor(j41, 47, j42);
                long j43 = j34;
                long j44 = j25 + j43;
                long jRotlXor5 = ThreefishEngine.rotlXor(j43, 8, j44);
                long j45 = j35;
                long j46 = j27 + j45;
                long jRotlXor6 = ThreefishEngine.rotlXor(j45, 17, j46);
                long j47 = j37;
                long j48 = j29 + j47;
                long jRotlXor7 = ThreefishEngine.rotlXor(j47, 22, j48);
                long j49 = j36;
                long j50 = j31 + j49;
                long jRotlXor8 = ThreefishEngine.rotlXor(j49, 37, j50);
                long j51 = j38 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j51);
                long j52 = j39 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j52);
                long j53 = j42 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j53);
                long j54 = j40 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j54);
                long j55 = j46 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j55);
                long j56 = j48 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j56);
                long j57 = j50 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j57);
                long j58 = j44 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j58);
                long j59 = j51 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j59);
                long j60 = j52 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j60);
                long j61 = j54 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j61);
                long j62 = j53 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j62);
                long j63 = j56 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j63);
                long j64 = j57 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j64);
                long j65 = j58 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j65);
                long j66 = j55 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j66);
                long j67 = j59 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j67);
                long j68 = j60 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j68);
                long j69 = j62 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j69);
                long j70 = j61 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j70);
                long j71 = j64 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j71);
                long j72 = j65 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j72);
                long j73 = j66 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j73);
                long j74 = j63 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j74);
                long j75 = j67 + jArr3[i3];
                int i6 = i3 + 1;
                long j76 = jRotlXor29 + jArr3[i6];
                int i7 = i3 + 2;
                long j77 = j68 + jArr3[i7];
                int i8 = i3 + 3;
                long j78 = jRotlXor31 + jArr3[i8];
                int i9 = i3 + 4;
                long j79 = j70 + jArr3[i9];
                int i10 = i3 + 5;
                long j80 = jRotlXor30 + jArr3[i10];
                int i11 = i3 + 6;
                long j81 = j69 + jArr3[i11];
                int i12 = i3 + 7;
                long j82 = jRotlXor32 + jArr3[i12];
                int i13 = i3 + 8;
                long j83 = j72 + jArr3[i13];
                int i14 = i3 + 9;
                long j84 = jRotlXor28 + jArr3[i14];
                int i15 = i3 + 10;
                long j85 = j73 + jArr3[i15];
                int i16 = i3 + 11;
                long j86 = jRotlXor26 + jArr3[i16];
                int i17 = i3 + 12;
                long j87 = j74 + jArr3[i17];
                int i18 = i3 + 13;
                long j88 = jArr3[i18] + jArr4[i4] + jRotlXor27;
                int i19 = i3 + 14;
                int i20 = i4 + 1;
                long j89 = jArr3[i19] + jArr4[i20] + j71;
                int i21 = i3 + 15;
                long j90 = i5;
                long j91 = jArr3[i21] + j90 + jRotlXor25;
                long j92 = j75 + j76;
                long jRotlXor33 = ThreefishEngine.rotlXor(j76, 41, j92);
                long j93 = j77 + j78;
                long jRotlXor34 = ThreefishEngine.rotlXor(j78, 9, j93);
                long j94 = j79 + j80;
                long jRotlXor35 = ThreefishEngine.rotlXor(j80, 37, j94);
                long j95 = j81 + j82;
                long jRotlXor36 = ThreefishEngine.rotlXor(j82, 31, j95);
                long j96 = j83 + j84;
                long jRotlXor37 = ThreefishEngine.rotlXor(j84, 12, j96);
                long j97 = j85 + j86;
                long jRotlXor38 = ThreefishEngine.rotlXor(j86, 47, j97);
                long j98 = j87 + j88;
                long jRotlXor39 = ThreefishEngine.rotlXor(j88, 44, j98);
                long j99 = j89 + j91;
                long jRotlXor40 = ThreefishEngine.rotlXor(j91, 30, j99);
                long j100 = j92 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j100);
                long j101 = j93 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j101);
                long j102 = j95 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j102);
                long j103 = j94 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j103);
                long j104 = j97 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j104);
                long j105 = j98 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j105);
                long j106 = j99 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j106);
                long j107 = j96 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j107);
                long j108 = j100 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j108);
                long j109 = j101 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j109);
                long j110 = j103 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j110);
                long j111 = j102 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j111);
                long j112 = j105 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j112);
                long j113 = j106 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j113);
                long j114 = j107 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j114);
                long j115 = j104 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j115);
                long j116 = j108 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j116);
                long j117 = j109 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j117);
                long j118 = j111 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j118);
                long j119 = j110 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j119);
                long j120 = j113 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j120);
                long j121 = j114 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j121);
                long j122 = j115 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j122);
                long j123 = j112 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j123);
                j17 = jArr3[i6] + j116;
                j18 = jRotlXor61 + jArr3[i7];
                j19 = j117 + jArr3[i8];
                long j124 = jRotlXor63 + jArr3[i9];
                long j125 = j119 + jArr3[i10];
                long j126 = jRotlXor62 + jArr3[i11];
                long j127 = j118 + jArr3[i12];
                long j128 = jRotlXor64 + jArr3[i13];
                long j129 = j121 + jArr3[i14];
                long j130 = jRotlXor60 + jArr3[i15];
                long j131 = j122 + jArr3[i16];
                j35 = jRotlXor58 + jArr3[i17];
                long j132 = j123 + jArr3[i18];
                j37 = jArr3[i19] + jArr4[i20] + jRotlXor59;
                j31 = jArr3[i21] + jArr4[i4 + 2] + j120;
                j36 = jArr3[i3 + 16] + j90 + 1 + jRotlXor57;
                i = i5 + 2;
                j21 = j125;
                j29 = j132;
                j33 = j128;
                iArr = iArr3;
                j34 = j130;
                j27 = j131;
                i2 = 13;
                iArr2 = iArr4;
                j20 = j124;
                j32 = j126;
                j23 = j127;
                j25 = j129;
            }
            jArr2[0] = j17;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j20;
            jArr2[4] = j21;
            jArr2[5] = j32;
            jArr2[6] = j23;
            jArr2[7] = j33;
            jArr2[8] = j25;
            jArr2[9] = j34;
            jArr2[10] = j27;
            jArr2[11] = j35;
            jArr2[12] = j29;
            jArr2[13] = j37;
            jArr2[14] = j31;
            jArr2[15] = j36;
        }
    }

    public final class Threefish256Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 14;
        public static final int ROTATION_0_1 = 16;
        public static final int ROTATION_1_0 = 52;
        public static final int ROTATION_1_1 = 57;
        public static final int ROTATION_2_0 = 23;
        public static final int ROTATION_2_1 = 40;
        public static final int ROTATION_3_0 = 5;
        public static final int ROTATION_3_1 = 37;
        public static final int ROTATION_4_0 = 25;
        public static final int ROTATION_4_1 = 33;
        public static final int ROTATION_5_0 = 46;
        public static final int ROTATION_5_1 = 12;
        public static final int ROTATION_6_0 = 58;
        public static final int ROTATION_6_1 = 22;
        public static final int ROTATION_7_0 = 32;
        public static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long jXorRotr = jArr[1];
            long j2 = jArr[2];
            long j3 = jArr[3];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j4 = j - jArr3[i5];
                int i6 = i3 + 2;
                int i7 = i4 + 1;
                long j5 = jXorRotr - (jArr3[i6] + jArr4[i7]);
                int i8 = i3 + 3;
                long j6 = j2 - (jArr3[i8] + jArr4[i4 + 2]);
                long j7 = i2;
                int[] iArr3 = iArr;
                long jXorRotr2 = ThreefishEngine.xorRotr(j3 - ((jArr3[i3 + 4] + j7) + 1), 32, j4);
                long j8 = j4 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j5, 32, j6);
                long j9 = j6 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, 58, j8);
                long j10 = j8 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j9);
                long j11 = j9 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, 46, j10);
                long j12 = j10 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j11);
                long j13 = j11 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j12);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j13);
                long j14 = (j12 - jXorRotr8) - jArr3[i3];
                long j15 = jXorRotr8 - (jArr3[i5] + jArr4[i4]);
                long j16 = (j13 - jXorRotr9) - (jArr3[i6] + jArr4[i7]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr3[i8] + j7), 5, j14);
                long j17 = j14 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j15, 37, j16);
                long j18 = j16 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j17);
                long j19 = j17 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j18);
                long j20 = j18 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, 52, j19);
                long j21 = j19 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j20);
                long j22 = j20 - jXorRotr15;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr15, 14, j21);
                j = j21 - jXorRotr;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr14, 16, j22);
                j2 = j22 - jXorRotr16;
                i2 -= 2;
                i = 1;
                iArr = iArr3;
                j3 = jXorRotr16;
                iArr2 = iArr2;
            }
            long j23 = j - jArr3[0];
            long j24 = jXorRotr - (jArr3[1] + jArr4[0]);
            long j25 = j2 - (jArr3[2] + jArr4[1]);
            long j26 = j3 - jArr3[3];
            jArr2[0] = j23;
            jArr2[1] = j24;
            jArr2[2] = j25;
            jArr2[3] = j26;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = jArr3[1] + jArr4[0] + j2;
            long j7 = jArr3[2] + jArr4[1] + j3;
            long j8 = j4 + jArr3[3];
            long j9 = j6;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j10 = j5 + j9;
                long jRotlXor = ThreefishEngine.rotlXor(j9, 14, j10);
                long j11 = j7 + j8;
                long jRotlXor2 = ThreefishEngine.rotlXor(j8, 16, j11);
                long j12 = j10 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j12);
                long j13 = j11 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j13);
                long j14 = j12 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j14);
                long j15 = j13 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j15);
                long j16 = j14 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j16);
                long j17 = j15 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j17);
                long j18 = j16 + jArr3[i2];
                int i4 = i2 + 1;
                long j19 = jArr3[i4] + jArr4[i3] + jRotlXor8;
                int i5 = i2 + 2;
                int i6 = i3 + 1;
                long j20 = jArr3[i5] + jArr4[i6] + j17;
                int i7 = i2 + 3;
                int[] iArr3 = iArr;
                long j21 = i;
                long j22 = jArr3[i7] + j21 + jRotlXor7;
                long j23 = j18 + j19;
                long jRotlXor9 = ThreefishEngine.rotlXor(j19, 25, j23);
                long j24 = j20 + j22;
                long jRotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                long j25 = j23 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j25);
                long j26 = j24 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j26);
                long j27 = j25 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j27);
                long j28 = j26 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j28);
                long j29 = j27 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j29);
                long j30 = j28 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j30);
                j5 = j29 + jArr3[i4];
                j9 = jArr3[i5] + jArr4[i6] + jRotlXor16;
                long j31 = j30 + jArr3[i7] + jArr4[i3 + 2];
                j8 = jArr3[i2 + 4] + j21 + 1 + jRotlXor15;
                i += 2;
                j7 = j31;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j5;
            jArr2[1] = j9;
            jArr2[2] = j7;
            jArr2[3] = j8;
        }
    }

    public final class Threefish512Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 46;
        public static final int ROTATION_0_1 = 36;
        public static final int ROTATION_0_2 = 19;
        public static final int ROTATION_0_3 = 37;
        public static final int ROTATION_1_0 = 33;
        public static final int ROTATION_1_1 = 27;
        public static final int ROTATION_1_2 = 14;
        public static final int ROTATION_1_3 = 42;
        public static final int ROTATION_2_0 = 17;
        public static final int ROTATION_2_1 = 49;
        public static final int ROTATION_2_2 = 36;
        public static final int ROTATION_2_3 = 39;
        public static final int ROTATION_3_0 = 44;
        public static final int ROTATION_3_1 = 9;
        public static final int ROTATION_3_2 = 54;
        public static final int ROTATION_3_3 = 56;
        public static final int ROTATION_4_0 = 39;
        public static final int ROTATION_4_1 = 30;
        public static final int ROTATION_4_2 = 34;
        public static final int ROTATION_4_3 = 24;
        public static final int ROTATION_5_0 = 13;
        public static final int ROTATION_5_1 = 50;
        public static final int ROTATION_5_2 = 10;
        public static final int ROTATION_5_3 = 17;
        public static final int ROTATION_6_0 = 25;
        public static final int ROTATION_6_1 = 29;
        public static final int ROTATION_6_2 = 39;
        public static final int ROTATION_6_3 = 43;
        public static final int ROTATION_7_0 = 8;
        public static final int ROTATION_7_1 = 35;
        public static final int ROTATION_7_2 = 56;
        public static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long jXorRotr = jArr[3];
            long j4 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j5 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j6 = j - jArr3[i5];
                int i6 = i3 + 2;
                long j7 = j2 - jArr3[i6];
                int i7 = i3 + 3;
                long j8 = j3 - jArr3[i7];
                int i8 = i3 + 4;
                long j9 = jXorRotr - jArr3[i8];
                int i9 = i3 + 5;
                long j10 = j4 - jArr3[i9];
                int i10 = i3 + 6;
                int i11 = i4 + 1;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j11 = jXorRotr2 - (jArr3[i10] + jArr4[i11]);
                int i12 = i3 + 7;
                long j12 = j5 - (jArr3[i12] + jArr4[i4 + 2]);
                long[] jArr5 = jArr3;
                long j13 = i2;
                long j14 = jXorRotr3 - ((jArr3[i3 + 8] + j13) + 1);
                int i13 = i2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j7, 8, j12);
                long j15 = j12 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j14, 35, j6);
                long j16 = j6 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j11, 56, j8);
                long j17 = j8 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j9, 22, j10);
                long j18 = j10 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j18);
                long j19 = j18 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j15);
                long j20 = j15 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j16);
                long j21 = j16 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j17);
                long j22 = j17 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j22);
                long j23 = j22 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j19);
                long j24 = j19 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j20);
                long j25 = j20 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j21);
                long j26 = j21 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j26);
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j23);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j24);
                long j27 = j24 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j25);
                long j28 = j25 - jXorRotr19;
                long j29 = (j26 - jXorRotr16) - jArr5[i3];
                long j30 = jXorRotr16 - jArr5[i5];
                long j31 = (j23 - jXorRotr17) - jArr5[i6];
                long j32 = jXorRotr17 - jArr5[i7];
                long j33 = j27 - jArr5[i8];
                long j34 = jXorRotr18 - (jArr5[i9] + jArr4[i4]);
                long j35 = j28 - (jArr5[i10] + jArr4[i11]);
                long j36 = jXorRotr19 - (jArr5[i12] + j13);
                long jXorRotr20 = ThreefishEngine.xorRotr(j30, 44, j35);
                long j37 = j35 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j36, 9, j29);
                long j38 = j29 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j34, 54, j31);
                long j39 = j31 - jXorRotr22;
                long[] jArr6 = jArr4;
                long jXorRotr23 = ThreefishEngine.xorRotr(j32, 56, j33);
                long j40 = j33 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j40);
                long j41 = j40 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, 49, j37);
                long j42 = j37 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j38);
                long j43 = j38 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j39);
                long j44 = j39 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j44);
                long j45 = j44 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j41);
                long j46 = j41 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j42);
                long j47 = j42 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j43);
                long j48 = j43 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j48);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j45);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j46);
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j47);
                j5 = j47 - jXorRotr3;
                i = 1;
                j4 = j46 - jXorRotr2;
                j3 = j45 - jXorRotr;
                jArr3 = jArr5;
                j2 = jXorRotr32;
                j = j48 - jXorRotr32;
                i2 = i13 - 2;
                jArr4 = jArr6;
                iArr = iArr3;
                iArr2 = iArr4;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j49 = j - jArr7[0];
            long j50 = j2 - jArr7[1];
            long j51 = j3 - jArr7[2];
            long j52 = jXorRotr - jArr7[3];
            long j53 = j4 - jArr7[4];
            long j54 = jXorRotr2 - (jArr7[5] + jArr8[0]);
            long j55 = j5 - (jArr7[6] + jArr8[1]);
            long j56 = jXorRotr3 - jArr7[7];
            jArr2[0] = j49;
            jArr2[1] = j50;
            jArr2[2] = j51;
            jArr2[3] = j52;
            jArr2[4] = j53;
            jArr2[5] = j54;
            jArr2[6] = j55;
            jArr2[7] = j56;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = j + jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = j3 + jArr3[2];
            long j12 = j4 + jArr3[3];
            long j13 = j5 + jArr3[4];
            long j14 = jArr3[5] + jArr4[0] + j6;
            long j15 = jArr3[6] + jArr4[1] + j7;
            int i = 1;
            long j16 = j12;
            long j17 = j8 + jArr3[7];
            long j18 = j14;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j19 = j9 + j10;
                long jRotlXor = ThreefishEngine.rotlXor(j10, 46, j19);
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j20 = j16;
                long j21 = j11 + j20;
                long jRotlXor2 = ThreefishEngine.rotlXor(j20, 36, j21);
                long[] jArr5 = jArr3;
                int i4 = i;
                long j22 = j18;
                long j23 = j13 + j22;
                long[] jArr6 = jArr4;
                long jRotlXor3 = ThreefishEngine.rotlXor(j22, 19, j23);
                long j24 = j17;
                long j25 = j15 + j24;
                long jRotlXor4 = ThreefishEngine.rotlXor(j24, 37, j25);
                long j26 = j21 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j26);
                long j27 = j23 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j27);
                long j28 = j25 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j28);
                long j29 = j19 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j29);
                long j30 = j27 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j30);
                long j31 = j28 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j31);
                long j32 = j29 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j32);
                long j33 = j26 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j33);
                long j34 = j31 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j34);
                long j35 = j32 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j35);
                long j36 = j33 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j36);
                long j37 = j30 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j37);
                long j38 = j35 + jArr5[i2];
                int i5 = i2 + 1;
                long j39 = jRotlXor13 + jArr5[i5];
                int i6 = i2 + 2;
                long j40 = j36 + jArr5[i6];
                int i7 = i2 + 3;
                long j41 = jRotlXor16 + jArr5[i7];
                int i8 = i2 + 4;
                long j42 = j37 + jArr5[i8];
                int i9 = i2 + 5;
                long j43 = jArr5[i9] + jArr6[i3] + jRotlXor15;
                int i10 = i2 + 6;
                int i11 = i3 + 1;
                long j44 = jArr5[i10] + jArr6[i11] + j34;
                int i12 = i2 + 7;
                long j45 = i4;
                long j46 = jArr5[i12] + j45 + jRotlXor14;
                long j47 = j38 + j39;
                long jRotlXor17 = ThreefishEngine.rotlXor(j39, 39, j47);
                long j48 = j40 + j41;
                long jRotlXor18 = ThreefishEngine.rotlXor(j41, 30, j48);
                long j49 = j42 + j43;
                long jRotlXor19 = ThreefishEngine.rotlXor(j43, 34, j49);
                long j50 = j44 + j46;
                long jRotlXor20 = ThreefishEngine.rotlXor(j46, 24, j50);
                long j51 = j48 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j51);
                long j52 = j49 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j52);
                long j53 = j50 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j53);
                long j54 = j47 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j54);
                long j55 = j52 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j55);
                long j56 = j53 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j56);
                long j57 = j54 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j57);
                long j58 = j51 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j58);
                long j59 = j56 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j59);
                long j60 = j57 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j60);
                long j61 = j58 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j61);
                long j62 = j55 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j62);
                j9 = j60 + jArr5[i5];
                long j63 = jRotlXor29 + jArr5[i6];
                j11 = j61 + jArr5[i7];
                j16 = jRotlXor32 + jArr5[i8];
                long j64 = j62 + jArr5[i9];
                long j65 = jArr5[i10] + jArr6[i11] + jRotlXor31;
                long j66 = j59 + jArr5[i12] + jArr6[i3 + 2];
                j17 = jArr5[i2 + 8] + j45 + 1 + jRotlXor30;
                i = i4 + 2;
                j13 = j64;
                j18 = j65;
                j10 = j63;
                iArr2 = iArr4;
                jArr3 = jArr5;
                j15 = j66;
                iArr = iArr3;
                jArr4 = jArr6;
            }
            jArr2[0] = j9;
            jArr2[1] = j10;
            jArr2[2] = j11;
            jArr2[3] = j16;
            jArr2[4] = j13;
            jArr2[5] = j18;
            jArr2[6] = j15;
            jArr2[7] = j17;
        }
    }

    public abstract class ThreefishCipher {
        public final long[] kw;
        public final long[] t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i >= iArr2.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr2[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.kw = jArr2;
        if (i == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    public static long rotlXor(long j, int i, long j2) {
        return ((j >>> (-i)) | (j << i)) ^ j2;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(C3200.m9831(this.blocksizeWords, " words)", new StringBuilder("Threefish key must be same size as block (")));
        }
        long j = C_240;
        int i = 0;
        while (true) {
            int i2 = this.blocksizeWords;
            if (i >= i2) {
                long[] jArr2 = this.kw;
                jArr2[i2] = j;
                System.arraycopy(jArr2, 0, jArr2, i2 + 1, i2);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j2 = jArr[i];
                jArr3[i] = j2;
                j ^= j2;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.t;
        long j = jArr[0];
        jArr2[0] = j;
        long j2 = jArr[1];
        jArr2[1] = j2;
        jArr2[2] = j ^ j2;
        jArr2[3] = j;
        jArr2[4] = j2;
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        Pack.longToLittleEndian(j, bArr, i);
    }

    public static long xorRotr(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(C20177.m46409("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(C3200.m9831(this.blocksizeBytes, " bytes)", new StringBuilder("Threefish key must be same size as block (")));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(tweak, 0, jArr2);
        }
        init(z, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z)));
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.blocksizeBytes;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i2);
        return this.blocksizeBytes;
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
