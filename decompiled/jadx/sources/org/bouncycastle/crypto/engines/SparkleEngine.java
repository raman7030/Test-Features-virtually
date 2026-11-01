package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class SparkleEngine extends AEADBaseEngine {
    public static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    public final int CAP_MASK;
    public final int KEY_WORDS;
    public final int RATE_WORDS;
    public final int SPARKLE_STEPS_BIG;
    public final int SPARKLE_STEPS_SLIM;
    public final int STATE_WORDS;
    public final int TAG_WORDS;
    public final int _A0;
    public final int _A1;
    public final int _M2;
    public final int _M3;
    public boolean encrypted;

    /* JADX INFO: renamed from: k */
    public final int[] f81081k;
    public final int[] npub;
    public final int[] state;

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i;
        int i2;
        int i3;
        int iOrdinal = sparkleParameters.ordinal();
        int i4 = 256;
        int i5 = 128;
        if (iOrdinal != 0) {
            i3 = MLKEMEngine.KyberPolyBytes;
            if (iOrdinal == 1) {
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM256-128";
                i = 256;
                i2 = 128;
                i4 = 128;
            } else if (iOrdinal == 2) {
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM192-192";
                i4 = 192;
                i = 192;
                i2 = 192;
                i5 = 192;
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                }
                this.SPARKLE_STEPS_SLIM = 8;
                this.SPARKLE_STEPS_BIG = 12;
                this.algorithmName = "SCHWAEMM256-256";
                i = 256;
                i2 = 256;
                i5 = 256;
                i3 = 512;
            }
        } else {
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 10;
            this.algorithmName = "SCHWAEMM128-128";
            i = 128;
            i2 = 128;
            i4 = 128;
            i3 = 256;
        }
        int i6 = i4 >>> 5;
        this.KEY_WORDS = i6;
        this.KEY_SIZE = i4 >>> 3;
        this.TAG_WORDS = i5 >>> 5;
        this.MAC_SIZE = i5 >>> 3;
        int i7 = i3 >>> 5;
        this.STATE_WORDS = i7;
        int i8 = i >>> 5;
        this.RATE_WORDS = i8;
        int i9 = i >>> 3;
        this.IV_SIZE = i9;
        int i10 = i2 >>> 6;
        int i11 = i2 >>> 5;
        this.CAP_MASK = i8 > i11 ? i11 - 1 : -1;
        int i12 = 1 << i10;
        this._A0 = i12 << 24;
        this._A1 = (i12 ^ 1) << 24;
        this._M2 = (i12 ^ 2) << 24;
        this._M3 = (i12 ^ 3) << 24;
        this.state = new int[i7];
        this.f81081k = new int[i6];
        this.npub = new int[i8];
        this.BlockSize = i9;
        this.AADBufferSize = i9;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    public static int ELL(int i) {
        return (i & 65535) ^ Integers.rotateRight(i, 16);
    }

    public static void sparkle_opt(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i);
        } else if (length == 12) {
            sparkle_opt12(iArr, i);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i);
    }

    public static void sparkle_opt12(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 0;
        while (i14 < i) {
            int[] iArr2 = RCON;
            int i15 = i3 ^ iArr2[i14 & 7];
            int i16 = i5 ^ i14;
            int i17 = iArr2[0];
            int iRotateRight = Integers.rotateRight(i15, 31) + i2;
            int iRotateRight2 = i15 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i18 = (iRotateRight3 ^ i17) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i18, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i18 ^ i17);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i19 = iRotateRight6 ^ i17;
            int i20 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i16, 31) + i4;
            int iRotateRight9 = i16 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i20);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i21 = (iRotateRight10 ^ i20) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i21, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i21 ^ i20);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i22 = iRotateRight13 ^ i20;
            int i23 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = i7 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i23);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i24 = (iRotateRight17 ^ i23) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i24, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i24 ^ i23);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i25 = iRotateRight20 ^ i23;
            int i26 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = i9 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i26);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i27 = (iRotateRight24 ^ i26) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i27, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i27 ^ i26);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i28 = iRotateRight27 ^ i26;
            int i29 = iArr2[4];
            int iRotateRight29 = Integers.rotateRight(i11, 31) + i10;
            int iRotateRight30 = i11 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i29);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i30 = (iRotateRight31 ^ i29) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i30, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i30 ^ i29);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i31 = i29 ^ iRotateRight34;
            int i32 = iArr2[5];
            int iRotateRight36 = Integers.rotateRight(i13, 31) + i12;
            int iRotateRight37 = Integers.rotateRight(iRotateRight36, 24) ^ i13;
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i32);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i33 = (iRotateRight38 ^ i32) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i33, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i33 ^ i32);
            int iRotateRight42 = Integers.rotateRight(iRotateRight41, 16) ^ iRotateRight40;
            int i34 = i32 ^ iRotateRight41;
            int iELL = ELL((i19 ^ i22) ^ i25);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i35 = (i31 ^ i22) ^ iELL2;
            int i36 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i37 = (i34 ^ i25) ^ iELL2;
            int i38 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i39 = (i28 ^ i19) ^ iELL2;
            int i40 = (iRotateRight28 ^ iRotateRight7) ^ iELL;
            i14++;
            i12 = i25;
            i13 = iRotateRight21;
            i6 = i39;
            i7 = i40;
            i8 = i19;
            i9 = iRotateRight7;
            i2 = i35;
            i3 = i36;
            i10 = i22;
            i4 = i37;
            i11 = iRotateRight14;
            i5 = i38;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
        iArr[8] = i10;
        iArr[9] = i11;
        iArr[10] = i12;
        iArr[11] = i13;
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i);
    }

    public static void sparkle_opt16(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = i15;
        int i18 = iArr[15];
        int i19 = 0;
        while (i19 < i) {
            int[] iArr2 = RCON;
            int i20 = i3 ^ iArr2[i19 & 7];
            int i21 = i5 ^ i19;
            int i22 = iArr2[0];
            int iRotateRight = Integers.rotateRight(i20, 31) + i2;
            int iRotateRight2 = i20 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i22);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i23 = (iRotateRight3 ^ i22) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i23, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i23 ^ i22);
            int iRotateRight7 = Integers.rotateRight(iRotateRight6, 16) ^ iRotateRight5;
            int i24 = iRotateRight6 ^ i22;
            int i25 = iArr2[1];
            int i26 = i19;
            int iRotateRight8 = Integers.rotateRight(i21, 31) + i4;
            int iRotateRight9 = i21 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i25);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i27 = (iRotateRight10 ^ i25) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i27, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i27 ^ i25);
            int iRotateRight14 = Integers.rotateRight(iRotateRight13, 16) ^ iRotateRight12;
            int i28 = iRotateRight13 ^ i25;
            int i29 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = Integers.rotateRight(iRotateRight15, 24) ^ i7;
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i29);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i30 = (iRotateRight17 ^ i29) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i30, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i30 ^ i29);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i31 = iRotateRight20 ^ i29;
            int i32 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = Integers.rotateRight(iRotateRight22, 24) ^ i9;
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i32);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i33 = (iRotateRight24 ^ i32) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i33, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i33 ^ i32);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i34 = i32 ^ iRotateRight27;
            int i35 = iArr2[4];
            int iRotateRight29 = Integers.rotateRight(i11, 31) + i10;
            int iRotateRight30 = Integers.rotateRight(iRotateRight29, 24) ^ i11;
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i35);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i36 = (iRotateRight31 ^ i35) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i36, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i36 ^ i35);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i37 = i35 ^ iRotateRight34;
            int i38 = iArr2[5];
            int iRotateRight36 = Integers.rotateRight(i13, 31) + i12;
            int iRotateRight37 = Integers.rotateRight(iRotateRight36, 24) ^ i13;
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i38);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i39 = (iRotateRight38 ^ i38) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i39, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i39 ^ i38);
            int iRotateRight42 = Integers.rotateRight(iRotateRight41, 16) ^ iRotateRight40;
            int i40 = i38 ^ iRotateRight41;
            int i41 = iArr2[6];
            int iRotateRight43 = Integers.rotateRight(i17, 31) + i14;
            int iRotateRight44 = Integers.rotateRight(iRotateRight43, 24) ^ i17;
            int iRotateRight45 = Integers.rotateRight(iRotateRight44, 17) + (iRotateRight43 ^ i41);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i42 = (iRotateRight45 ^ i41) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i42, 31);
            int iRotateRight48 = Integers.rotateRight(iRotateRight47, 24) + (i42 ^ i41);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i43 = i41 ^ iRotateRight48;
            int i44 = iArr2[7];
            int iRotateRight50 = Integers.rotateRight(i18, 31) + i16;
            int iRotateRight51 = Integers.rotateRight(iRotateRight50, 24) ^ i18;
            int iRotateRight52 = Integers.rotateRight(iRotateRight51, 17) + (iRotateRight50 ^ i44);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i45 = (iRotateRight52 ^ i44) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i45, 31);
            int iRotateRight55 = Integers.rotateRight(iRotateRight54, 24) + (i45 ^ i44);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i46 = iRotateRight55 ^ i44;
            int iELL = ELL(((i24 ^ i28) ^ i31) ^ i34);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i47 = (i40 ^ i28) ^ iELL2;
            int i48 = (iRotateRight14 ^ iRotateRight42) ^ iELL;
            int i49 = (i43 ^ i31) ^ iELL2;
            int i50 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i51 = (i46 ^ i34) ^ iELL2;
            int i52 = (i37 ^ i24) ^ iELL2;
            int i53 = (iRotateRight35 ^ iRotateRight7) ^ iELL;
            i13 = iRotateRight14;
            i4 = i49;
            i12 = i28;
            i5 = i50;
            i14 = i31;
            i7 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i11 = iRotateRight7;
            i2 = i47;
            i19 = i26 + 1;
            i17 = iRotateRight21;
            i6 = i51;
            i18 = iRotateRight28;
            i8 = i52;
            i10 = i24;
            i3 = i48;
            i16 = i34;
            i9 = i53;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
        iArr[8] = i10;
        iArr[9] = i11;
        iArr[10] = i12;
        iArr[11] = i13;
        iArr[12] = i14;
        iArr[13] = i17;
        iArr[14] = i16;
        iArr[15] = i18;
    }

    public static void sparkle_opt8(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = 0;
        char c = 0;
        char c2 = 1;
        while (i10 < i) {
            int[] iArr2 = RCON;
            int i11 = i3 ^ iArr2[i10 & 7];
            int i12 = i5 ^ i10;
            int i13 = iArr2[c];
            int iRotateRight = Integers.rotateRight(i11, 31) + i2;
            int iRotateRight2 = i11 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i13);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i14 = (iRotateRight3 ^ i13) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i14, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i14 ^ i13);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i15 = iRotateRight6 ^ i13;
            int i16 = iArr2[c2];
            int iRotateRight8 = Integers.rotateRight(i12, 31) + i4;
            int iRotateRight9 = i12 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i16);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i17 = (iRotateRight10 ^ i16) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i17, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i17 ^ i16);
            int iRotateRight14 = Integers.rotateRight(iRotateRight13, 16) ^ iRotateRight12;
            int i18 = iRotateRight13 ^ i16;
            int i19 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int iRotateRight16 = Integers.rotateRight(iRotateRight15, 24) ^ i7;
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i19);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i20 = (iRotateRight17 ^ i19) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i20, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i20 ^ i19);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i21 = iRotateRight20 ^ i19;
            int i22 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int iRotateRight23 = Integers.rotateRight(iRotateRight22, 24) ^ i9;
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i22);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i23 = (iRotateRight24 ^ i22) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i23, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i23 ^ i22);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int iELL = ELL(i15 ^ i18);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i24 = ((iRotateRight27 ^ i22) ^ i18) ^ iELL2;
            int i25 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i26 = (i21 ^ i15) ^ iELL2;
            int i27 = (iRotateRight21 ^ iRotateRight7) ^ iELL;
            i10++;
            i9 = iRotateRight14;
            i4 = i26;
            c = 0;
            c2 = 1;
            i7 = iRotateRight7;
            i3 = i25;
            i8 = i18;
            i5 = i27;
            i6 = i15;
            i2 = i24;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        Pack.littleEndianToInt(bArr, 0, this.f81081k);
        Pack.littleEndianToInt(bArr2, 0, this.npub);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.RATE_WORDS;
            if (i2 >= i3 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i4 = (i3 / 2) + i2;
            int[] iArr = this.state;
            int i5 = iArr[i2];
            int i6 = iArr[i4];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i2 * 4) + i);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i4 * 4) + i);
            int[] iArr2 = this.state;
            int i7 = this.RATE_WORDS;
            iArr2[i2] = (iLittleEndianToInt ^ i6) ^ iArr2[i7 + i2];
            iArr2[i4] = ((i6 ^ i5) ^ iLittleEndianToInt2) ^ iArr2[i7 + (this.CAP_MASK & i4)];
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = ((i6 ^ i7) ^ iLittleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = (i6 ^ iLittleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = (i7 ^ iLittleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = ((i6 ^ i7) ^ iLittleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b, byte[] bArr, int i) {
        return super.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        int i = this.m_aadPos;
        int i2 = this.BlockSize;
        int i3 = 0;
        if (i < i2) {
            int[] iArr = this.state;
            int i4 = this.STATE_WORDS - 1;
            iArr[i4] = iArr[i4] ^ this._A0;
            byte[] bArr = this.m_aad;
            int i5 = i + 1;
            this.m_aadPos = i5;
            bArr[i] = GCMSIVBlockCipher.MASK;
            Arrays.fill(bArr, i5, i2, (byte) 0);
        } else {
            int[] iArr2 = this.state;
            int i6 = this.STATE_WORDS - 1;
            iArr2[i6] = iArr2[i6] ^ this._A1;
        }
        while (true) {
            int i7 = this.RATE_WORDS;
            if (i3 >= i7 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i8 = (i7 / 2) + i3;
            int[] iArr3 = this.state;
            int i9 = iArr3[i3];
            int i10 = iArr3[i8];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_aad, i3 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_aad, i8 * 4);
            int[] iArr4 = this.state;
            int i11 = this.RATE_WORDS;
            iArr4[i3] = (iLittleEndianToInt ^ i10) ^ iArr4[i11 + i3];
            iArr4[i8] = ((i10 ^ i9) ^ iLittleEndianToInt2) ^ iArr4[i11 + (this.CAP_MASK & i8)];
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int i2;
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i3 = this.STATE_WORDS - 1;
            iArr[i3] = iArr[i3] ^ (this.m_bufPos < this.IV_SIZE ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i4 = 0;
            while (true) {
                i2 = this.m_bufPos;
                if (i4 >= i2) {
                    break;
                }
                int i5 = i4 >>> 2;
                iArr2[i5] = iArr2[i5] | ((this.m_buf[i4] & 255) << ((i4 & 3) << 3));
                i4++;
            }
            if (i2 < this.IV_SIZE) {
                if (!this.forEncryption) {
                    int i6 = (i2 & 3) << 3;
                    int i7 = i2 >>> 2;
                    int i8 = iArr2[i7];
                    int[] iArr3 = this.state;
                    iArr2[i7] = ((iArr3[i2 >>> 2] >>> i6) << i6) | i8;
                    int i9 = (i2 >>> 2) + 1;
                    System.arraycopy(iArr3, i9, iArr2, i9, this.RATE_WORDS - i9);
                }
                int i10 = this.m_bufPos;
                int i11 = i10 >>> 2;
                iArr2[i11] = (128 << ((i10 & 3) << 3)) ^ iArr2[i11];
            }
            int i12 = 0;
            while (true) {
                int i13 = this.RATE_WORDS;
                if (i12 >= i13 / 2) {
                    break;
                }
                int i14 = (i13 / 2) + i12;
                int[] iArr4 = this.state;
                int i15 = iArr4[i12];
                int i16 = iArr4[i14];
                if (this.forEncryption) {
                    iArr4[i12] = (iArr2[i12] ^ i16) ^ iArr4[i13 + i12];
                    iArr4[i14] = iArr4[i13 + (this.CAP_MASK & i14)] ^ ((i15 ^ i16) ^ iArr2[i14]);
                } else {
                    iArr4[i12] = ((i15 ^ i16) ^ iArr2[i12]) ^ iArr4[i13 + i12];
                    iArr4[i14] = iArr4[i13 + (this.CAP_MASK & i14)] ^ (iArr2[i14] ^ i15);
                }
                iArr2[i12] = iArr2[i12] ^ i15;
                iArr2[i14] = iArr2[i14] ^ i16;
                i12++;
            }
            int i17 = 0;
            while (i17 < this.m_bufPos) {
                bArr[i] = (byte) (iArr2[i17 >>> 2] >>> ((i17 & 3) << 3));
                i17++;
                i++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i18 = 0; i18 < this.KEY_WORDS; i18++) {
            int[] iArr5 = this.state;
            int i19 = this.RATE_WORDS + i18;
            iArr5[i19] = iArr5[i19] ^ this.f81081k[i18];
        }
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        this.encrypted = false;
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.f81081k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        super.reset(z);
    }
}
