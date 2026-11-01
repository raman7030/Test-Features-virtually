package org.bouncycastle.crypto.engines;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import java.lang.reflect.Array;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;
import p067l.C21545;
import p067l.EnumC19222;

/* JADX INFO: loaded from: classes.dex */
public class AESLightEngine implements BlockCipher {
    public static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1 */
    public static final int f80970m1 = -2139062144;

    /* JADX INFO: renamed from: m2 */
    public static final int f80971m2 = 2139062143;

    /* JADX INFO: renamed from: m3 */
    public static final int f80972m3 = 27;

    /* JADX INFO: renamed from: m4 */
    public static final int f80973m4 = -1061109568;

    /* JADX INFO: renamed from: m5 */
    public static final int f80974m5 = 1061109567;
    public int ROUNDS;
    public int[][] WorkingKey = null;
    public boolean forEncryption;

    /* JADX INFO: renamed from: S */
    public static final byte[] f80968S = {99, 124, 119, 123, -14, 107, KeyFactorySpi.x448_type, -59, UTF8.S_P3A, 1, 103, 43, -2, -41, -85, 118, -54, C0684bo.f2503h, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, KeyFactorySpi.Ed448_type, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, GCMSIVBlockCipher.MASK, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, KeyFactorySpi.x25519_type, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, UTF8.S_CS3, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, UTF8.S_P4A, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, PublicSuffixDatabase.EXCEPTION_MARKER, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base32Encoder.DEFAULT_PADDING, 100, 93, 25, 115, UTF8.S_P4B, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, C0684bo.f2506k, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -90, -76, -58, -24, -35, 116, C0684bo.f2505j, 75, -67, -117, -118, KeyFactorySpi.Ed25519_type, 62, -75, 102, 72, 3, -10, C0698cb.f2570l, 97, 53, 87, -71, -122, -63, 29, -98, GCMSIVBlockCipher.ADD, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, C0698cb.f2569k, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* JADX INFO: renamed from: Si */
    public static final byte[] f80969Si = {82, 9, 106, -43, UTF8.S_P3A, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, C0684bo.f2503h, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base32Encoder.DEFAULT_PADDING, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, KeyFactorySpi.Ed25519_type, 72, UTF8.S_P4A, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 117, -33, KeyFactorySpi.x25519_type, 71, -15, 26, KeyFactorySpi.Ed448_type, 29, 41, -59, -119, KeyFactorySpi.x448_type, -73, 98, C0698cb.f2570l, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, UTF8.S_CS3, -102, -37, -64, -2, 120, -51, 90, -12, C0684bo.f2505j, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, GCMSIVBlockCipher.MASK, -20, 95, UTF8.S_P4B, 81, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -87, 25, -75, 74, C0698cb.f2569k, 45, -27, 122, -97, -109, -55, -100, -17, -96, C0684bo.f2506k, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, GCMSIVBlockCipher.ADD, 105, 20, 99, 85, PublicSuffixDatabase.EXCEPTION_MARKER, 12, 125};
    public static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, EnumC19222.f57460, 47, 94, 188, 99, 198, 151, 53, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 212, 179, C0254q.f1218h, 250, 239, 197, 145};

    public AESLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    public static int FFmulX(int i) {
        return (((i & (-2139062144)) >>> 7) * 27) ^ ((2139062143 & i) << 1);
    }

    public static int FFmulX2(int i) {
        int i2 = (1061109567 & i) << 2;
        int i3 = i & (-1061109568);
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private int bitsOfSecurity() {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            return 256;
        }
        return (iArr.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i3 = this.ROUNDS;
        int[] iArr2 = iArr[i3];
        char c = 0;
        int i4 = iLittleEndianToInt ^ iArr2[0];
        int i5 = iLittleEndianToInt2 ^ iArr2[1];
        int i6 = iLittleEndianToInt3 ^ iArr2[2];
        int i7 = i3 - 1;
        int iInv_mcol = iLittleEndianToInt4 ^ iArr2[3];
        for (int i8 = 1; i7 > i8; i8 = 1) {
            byte[] bArr3 = f80969Si;
            int iInv_mcol2 = iArr[i7][c] ^ inv_mcol((((bArr3[i4 & 255] & 255) ^ ((bArr3[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i6 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i5 >> 24) & 255] << 24));
            int iInv_mcol3 = inv_mcol((((bArr3[i5 & 255] & 255) ^ ((bArr3[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(i6 >> 24) & 255] << 24)) ^ iArr[i7][i8];
            int iInv_mcol4 = inv_mcol((((bArr3[i6 & 255] & 255) ^ ((bArr3[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i7][2];
            int iInv_mcol5 = inv_mcol((((bArr3[iInv_mcol & 255] & 255) ^ ((bArr3[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i4 >> 24) & 255] << 24));
            int i9 = i7 - 1;
            int i10 = iInv_mcol5 ^ iArr[i7][3];
            int iInv_mcol6 = inv_mcol((((bArr3[iInv_mcol2 & 255] & 255) ^ ((bArr3[(i10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol3 >> 24) & 255] << 24)) ^ iArr[i9][0];
            int iInv_mcol7 = inv_mcol((((bArr3[iInv_mcol3 & 255] & 255) ^ ((bArr3[(iInv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol4 >> 24) & 255] << 24)) ^ iArr[i9][i8];
            int iInv_mcol8 = inv_mcol((((bArr3[iInv_mcol4 & 255] & 255) ^ ((bArr3[(iInv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i10 >> 24) & 255] << 24)) ^ iArr[i9][2];
            i7 -= 2;
            iInv_mcol = inv_mcol((((bArr3[i10 & 255] & 255) ^ ((bArr3[(iInv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol2 >> 24) & 255] << 24)) ^ iArr[i9][3];
            c = 0;
            i4 = iInv_mcol6;
            i5 = iInv_mcol7;
            i6 = iInv_mcol8;
        }
        byte[] bArr4 = f80969Si;
        int iInv_mcol9 = inv_mcol((((bArr4[i4 & 255] & 255) ^ ((bArr4[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i6 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i5 >> 24) & 255] << 24)) ^ iArr[i7][0];
        int iInv_mcol10 = inv_mcol((((bArr4[i5 & 255] & 255) ^ ((bArr4[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr4[(i6 >> 24) & 255] << 24)) ^ iArr[i7][1];
        int iInv_mcol11 = inv_mcol(((((bArr4[(i5 >> 8) & 255] & 255) << 8) ^ (bArr4[i6 & 255] & 255)) ^ ((bArr4[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i7][2];
        int iInv_mcol12 = inv_mcol((((bArr4[iInv_mcol & 255] & 255) ^ ((bArr4[(i6 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i4 >> 24) & 255] << 24)) ^ iArr[i7][3];
        int i11 = (((bArr4[iInv_mcol9 & 255] & 255) ^ ((bArr4[(iInv_mcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol10 >> 24) & 255] << 24);
        int[] iArr3 = iArr[0];
        int i12 = i11 ^ iArr3[0];
        int i13 = ((((bArr4[iInv_mcol10 & 255] & 255) ^ ((bArr4[(iInv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol11 >> 24) & 255] << 24)) ^ iArr3[1];
        int i14 = ((((bArr4[iInv_mcol11 & 255] & 255) ^ ((bArr4[(iInv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol12 >> 24) & 255] << 24)) ^ iArr3[2];
        int i15 = ((((bArr4[iInv_mcol12 & 255] & 255) ^ ((bArr4[(iInv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol9 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i12, bArr2, i2);
        Pack.intToLittleEndian(i13, bArr2, i2 + 4);
        Pack.intToLittleEndian(i14, bArr2, i2 + 8);
        Pack.intToLittleEndian(i15, bArr2, i2 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c = 0;
        int[] iArr2 = iArr[0];
        int i3 = iLittleEndianToInt ^ iArr2[0];
        int i4 = iLittleEndianToInt2 ^ iArr2[1];
        int i5 = iLittleEndianToInt3 ^ iArr2[2];
        int iMcol = iLittleEndianToInt4 ^ iArr2[3];
        int i6 = 1;
        for (int i7 = 1; i6 < this.ROUNDS - i7; i7 = 1) {
            byte[] bArr3 = f80968S;
            int iMcol2 = iArr[i6][c] ^ mcol((((bArr3[i3 & 255] & 255) ^ ((bArr3[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol >> 24) & 255] << 24));
            int iMcol3 = mcol((((bArr3[i4 & 255] & 255) ^ ((bArr3[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(i3 >> 24) & 255] << 24)) ^ iArr[i6][i7];
            int iMcol4 = mcol((((bArr3[i5 & 255] & 255) ^ ((bArr3[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i4 >> 24) & 255] << 24)) ^ iArr[i6][2];
            int iMcol5 = mcol((((bArr3[iMcol & 255] & 255) ^ ((bArr3[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i5 >> 24) & 255] << 24));
            int i8 = i6 + 1;
            int i9 = iMcol5 ^ iArr[i6][3];
            int iMcol6 = mcol((((bArr3[iMcol2 & 255] & 255) ^ ((bArr3[(iMcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i9 >> 24) & 255] << 24)) ^ iArr[i8][0];
            int iMcol7 = mcol((((bArr3[iMcol3 & 255] & 255) ^ ((bArr3[(iMcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol2 >> 24) & 255] << 24)) ^ iArr[i8][i7];
            int iMcol8 = mcol((((bArr3[iMcol4 & 255] & 255) ^ ((bArr3[(i9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol3 >> 24) & 255] << 24)) ^ iArr[i8][2];
            i6 += 2;
            iMcol = mcol((((bArr3[i9 & 255] & 255) ^ ((bArr3[(iMcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol4 >> 24) & 255] << 24)) ^ iArr[i8][3];
            c = 0;
            i3 = iMcol6;
            i4 = iMcol7;
            i5 = iMcol8;
        }
        byte[] bArr4 = f80968S;
        int iMcol9 = mcol((((bArr4[i3 & 255] & 255) ^ ((bArr4[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol >> 24) & 255] << 24)) ^ iArr[i6][0];
        int iMcol10 = mcol((((bArr4[i4 & 255] & 255) ^ ((bArr4[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr4[(i3 >> 24) & 255] << 24)) ^ iArr[i6][1];
        int iMcol11 = mcol(((((bArr4[(iMcol >> 8) & 255] & 255) << 8) ^ (bArr4[i5 & 255] & 255)) ^ ((bArr4[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i4 >> 24) & 255] << 24)) ^ iArr[i6][2];
        int iMcol12 = mcol((((bArr4[iMcol & 255] & 255) ^ ((bArr4[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i5 >> 24) & 255] << 24)) ^ iArr[i6][3];
        int i10 = (((bArr4[iMcol9 & 255] & 255) ^ ((bArr4[(iMcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol12 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i6 + 1];
        int i11 = i10 ^ iArr3[0];
        int i12 = ((((bArr4[iMcol10 & 255] & 255) ^ ((bArr4[(iMcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol9 >> 24) & 255] << 24)) ^ iArr3[1];
        int i13 = ((((bArr4[iMcol11 & 255] & 255) ^ ((bArr4[(iMcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol10 >> 24) & 255] << 24)) ^ iArr3[2];
        int i14 = ((((bArr4[iMcol12 & 255] & 255) ^ ((bArr4[(iMcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol11 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i11, bArr2, i2);
        Pack.intToLittleEndian(i12, bArr2, i2 + 4);
        Pack.intToLittleEndian(i13, bArr2, i2 + 8);
        Pack.intToLittleEndian(i14, bArr2, i2 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.ROUNDS = i + 6;
        int i2 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i + 7, 4);
        int i3 = 8;
        char c = 3;
        if (i == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i4 = 1; i4 <= 10; i4++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i4 - 1];
                int[] iArr2 = iArr[i4];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i5 = 1;
            int i6 = 1;
            while (true) {
                int[] iArr3 = iArr[i5];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i6);
                int[] iArr4 = iArr[i5];
                iArr4[2] = iSubWord;
                int i7 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i7;
                int i8 = iLittleEndianToInt7 ^ i7;
                int[] iArr5 = iArr[i5 + 1];
                iArr5[0] = i8;
                int i9 = iLittleEndianToInt8 ^ i8;
                iArr5[1] = i9;
                int i10 = iLittleEndianToInt9 ^ i9;
                iArr5[2] = i10;
                int i11 = iLittleEndianToInt10 ^ i10;
                iArr5[3] = i11;
                int iSubWord2 = subWord(shift(i11, 8)) ^ (i6 << 1);
                i6 <<= 2;
                iLittleEndianToInt5 = iSubWord ^ iSubWord2;
                int[] iArr6 = iArr[i5 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i7 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i8 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i9 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i5 += 3;
                if (i5 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i10 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i11 ^ iLittleEndianToInt9;
            }
        } else {
            if (i != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i12 = 1;
            int i13 = 2;
            while (true) {
                int iSubWord3 = subWord(shift(iLittleEndianToInt18, i3)) ^ i12;
                i12 <<= i2;
                iLittleEndianToInt11 ^= iSubWord3;
                int[] iArr7 = iArr[i13];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[i2] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[c] = iLittleEndianToInt14;
                int i14 = i13 + 1;
                if (i14 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i14];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[3] = iLittleEndianToInt18;
                i13 += 2;
                i2 = 1;
                c = 3;
                i3 = 8;
            }
        }
        if (!z) {
            for (int i15 = 1; i15 < this.ROUNDS; i15++) {
                for (int i16 = 0; i16 < 4; i16++) {
                    int[] iArr9 = iArr[i15];
                    iArr9[i16] = inv_mcol(iArr9[i16]);
                }
            }
        }
        return iArr;
    }

    public static int inv_mcol(int i) {
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    public static int mcol(int i) {
        int iShift = shift(i, 8);
        int i2 = i ^ iShift;
        return FFmulX(i2) ^ (iShift ^ shift(i2, 16));
    }

    public static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static int subWord(int i) {
        byte[] bArr = f80968S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i2, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i2, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(C21545.m48728("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
        this.forEncryption = z;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z)));
    }
}
