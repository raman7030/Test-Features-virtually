package org.bouncycastle.crypto.engines;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;
import p067l.C21545;

/* JADX INFO: loaded from: classes.dex */
public class GOST3412_2015Engine implements BlockCipher {
    public static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: PI */
    public static final byte[] f81025PI = {-4, -18, -35, 17, -49, KeyFactorySpi.x25519_type, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, -30, 92, -17, PublicSuffixDatabase.EXCEPTION_MARKER, -127, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 60, 66, -117, 1, -114, 79, 5, -124, 2, -82, -29, 106, -113, -96, 6, 11, -19, -104, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -44, -45, C0684bo.f2505j, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, KeyFactorySpi.Ed25519_type, C0698cb.f2570l, 86, 8, 12, 118, 18, -65, 114, 19, 71, -100, -73, 93, -121, 21, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, KeyFactorySpi.x448_type, -99, -98, -78, -79, 50, 117, 25, Base32Encoder.DEFAULT_PADDING, -1, 53, -118, 126, 109, 84, -58, GCMSIVBlockCipher.MASK, -61, -67, C0698cb.f2569k, 87, -33, -11, 36, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, C0684bo.f2506k, 15, -20, -34, 122, -108, -80, PSSSigner.TRAILER_IMPLICIT, -36, -24, 40, UTF8.S_P4A, 78, 51, 10, 74, -89, -105, UTF8.S_P4B, 115, 30, 0, 98, 68, 26, -72, 56, C0684bo.f2503h, 100, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, UTF8.S_P3A, 55, 107, -28, -120, -39, -25, -119, GCMSIVBlockCipher.ADD, 27, -125, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, 97, UTF8.S_CS3, KeyFactorySpi.Ed448_type, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, -64, -47, 102, -81, -62, 57, 75, 99, -74};
    public static final byte[] inversePI = {-91, 45, 50, -113, C0698cb.f2570l, UTF8.S_P3A, 56, -64, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, UTF8.S_P4B, 7, 24, PublicSuffixDatabase.EXCEPTION_MARKER, 114, -88, -47, 41, -58, -92, 63, C0684bo.f2506k, 39, -115, 12, C0684bo.f2503h, -22, -82, -76, -102, 99, 73, -27, 66, -28, 21, -73, -56, 6, KeyFactorySpi.Ed25519_type, -99, 65, 117, 25, -55, -86, -4, 77, -65, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, -78, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, -17, -39, 121, -74, 83, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -63, -16, 35, -25, 37, 94, -75, 30, -94, -33, -90, -2, -84, 34, -7, -30, 74, PSSSigner.TRAILER_IMPLICIT, 53, -54, -18, 120, 5, 107, 81, GCMSIVBlockCipher.ADD, 89, -93, -14, KeyFactorySpi.Ed448_type, 86, 17, 106, -119, -108, 101, -116, -69, 119, 60, 123, 40, -85, -46, 49, -34, -60, 95, -52, -49, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, -96, -123, -125, -38, 71, -59, -80, 51, -6, -106, KeyFactorySpi.x448_type, KeyFactorySpi.x25519_type, -62, -10, UTF8.S_P4A, -1, 93, -87, -114, 23, 27, -105, 125, -20, 88, -9, C0684bo.f2505j, -5, 124, 9, C0698cb.f2569k, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, Base32Encoder.DEFAULT_PADDING, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, GCMSIVBlockCipher.MASK, -112, -48, 36, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, -127, -117, -57, -42, UTF8.S_CS3, 10, 8, 0, 76, -41, 116};
    public boolean forEncryption;
    public final byte[] lFactors = {-108, UTF8.S_CS3, -123, 16, -62, -64, 1, -5, 1, -64, -62, 16, -123, UTF8.S_CS3, -108, 1};
    public int KEY_LENGTH = 32;
    public int SUB_LENGTH = 32 / 2;
    public byte[][] subKeys = null;
    public byte[][] _gf_mul = init_gf256_mul_table();

    /* JADX INFO: renamed from: C */
    private void m55371C(byte[] bArr, int i) {
        Arrays.clear(bArr);
        bArr[15] = (byte) i;
        m55373L(bArr);
    }

    /* JADX INFO: renamed from: F */
    private void m55372F(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrLSX = LSX(bArr, bArr2);
        m55376X(bArrLSX, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 0, this.SUB_LENGTH);
        System.arraycopy(bArrLSX, 0, bArr2, 0, this.SUB_LENGTH);
    }

    private void GOST3412_2015Func(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[][] bArr3;
        byte[] bArrCopyOf = new byte[16];
        System.arraycopy(bArr, i, bArrCopyOf, 0, 16);
        int i3 = 9;
        if (this.forEncryption) {
            for (int i4 = 0; i4 < 9; i4++) {
                bArrCopyOf = Arrays.copyOf(LSX(this.subKeys[i4], bArrCopyOf), 16);
            }
            m55376X(bArrCopyOf, this.subKeys[9]);
        } else {
            while (true) {
                bArr3 = this.subKeys;
                if (i3 <= 0) {
                    break;
                }
                bArrCopyOf = Arrays.copyOf(XSL(bArr3[i3], bArrCopyOf), 16);
                i3--;
            }
            m55376X(bArrCopyOf, bArr3[0]);
        }
        System.arraycopy(bArrCopyOf, 0, bArr2, i2, 16);
    }

    /* JADX INFO: renamed from: L */
    private void m55373L(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            m55374R(bArr);
        }
    }

    private byte[] LSX(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m55376X(bArrCopyOf, bArr2);
        m55375S(bArrCopyOf);
        m55373L(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: R */
    private void m55374R(byte[] bArr) {
        byte bM55377l = m55377l(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = bM55377l;
    }

    /* JADX INFO: renamed from: S */
    private void m55375S(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = f81025PI[unsignedByte(bArr[i])];
        }
    }

    /* JADX INFO: renamed from: X */
    private void m55376X(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private byte[] XSL(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m55376X(bArrCopyOf, bArr2);
        inverseL(bArrCopyOf);
        inverseS(bArrCopyOf);
        return bArrCopyOf;
    }

    private void generateSubKeys(byte[] bArr) {
        int i;
        if (bArr.length != this.KEY_LENGTH) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.subKeys = new byte[10][];
        for (int i2 = 0; i2 < 10; i2++) {
            this.subKeys[i2] = new byte[this.SUB_LENGTH];
        }
        int i3 = this.SUB_LENGTH;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        int i4 = 0;
        while (true) {
            i = this.SUB_LENGTH;
            if (i4 >= i) {
                break;
            }
            byte[][] bArr4 = this.subKeys;
            byte[] bArr5 = bArr4[0];
            byte b = bArr[i4];
            bArr2[i4] = b;
            bArr5[i4] = b;
            byte[] bArr6 = bArr4[1];
            byte b2 = bArr[i + i4];
            bArr3[i4] = b2;
            bArr6[i4] = b2;
            i4++;
        }
        byte[] bArr7 = new byte[i];
        for (int i5 = 1; i5 < 5; i5++) {
            for (int i6 = 1; i6 <= 8; i6++) {
                m55371C(bArr7, ((i5 - 1) * 8) + i6);
                m55372F(bArr7, bArr2, bArr3);
            }
            int i7 = i5 * 2;
            System.arraycopy(bArr2, 0, this.subKeys[i7], 0, this.SUB_LENGTH);
            System.arraycopy(bArr3, 0, this.subKeys[i7 + 1], 0, this.SUB_LENGTH);
        }
    }

    public static byte[][] init_gf256_mul_table() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i2 = 0; i2 < 256; i2++) {
                bArr[i][i2] = kuz_mul_gf256_slow((byte) i, (byte) i2);
            }
        }
        return bArr;
    }

    private void inverseL(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            inverseR(bArr);
        }
    }

    private void inverseR(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 1, bArr2, 0, 15);
        bArr2[15] = bArr[0];
        byte bM55377l = m55377l(bArr2);
        System.arraycopy(bArr, 1, bArr, 0, 15);
        bArr[15] = bM55377l;
    }

    private void inverseS(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = inversePI[unsignedByte(bArr[i])];
        }
    }

    public static byte kuz_mul_gf256_slow(byte b, byte b2) {
        byte b3 = 0;
        for (byte b4 = 0; b4 < 8 && b != 0 && b2 != 0; b4 = (byte) (b4 + 1)) {
            if ((b2 & 1) != 0) {
                b3 = (byte) (b3 ^ b);
            }
            byte b5 = (byte) (b & GCMSIVBlockCipher.MASK);
            b = (byte) (b << 1);
            if (b5 != 0) {
                b = (byte) (b ^ 195);
            }
            b2 = (byte) (b2 >> 1);
        }
        return b3;
    }

    /* JADX INFO: renamed from: l */
    private byte m55377l(byte[] bArr) {
        byte b = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b = (byte) (b ^ this._gf_mul[unsignedByte(bArr[i])][unsignedByte(this.lFactors[i])]);
        }
        return b;
    }

    private int unsignedByte(byte b) {
        return b & 255;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.subKeys == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        GOST3412_2015Func(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z;
            generateSubKeys(((KeyParameter) cipherParameters).getKey());
        } else if (cipherParameters != null) {
            throw new IllegalArgumentException(C21545.m48728("invalid parameter passed to GOST3412_2015 init - ", cipherParameters));
        }
    }
}
