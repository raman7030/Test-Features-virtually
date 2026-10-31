package org.bouncycastle.crypto.threshold;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes.dex */
public class PolynomialTable extends Polynomial {
    public final byte[] EXP;
    public final byte[] LOG;
    public static final byte[] AES_LOG = {0, -1, 25, 1, 50, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, bo.k, cb.f77931l, 52, -115, -127, -17, 76, KeyFactorySpi.Ed448_type, 8, -56, -8, 105, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -63, 125, -62, 29, -75, -7, -71, 39, 106, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, PublicSuffixDatabase.EXCEPTION_MARKER, 15, GCMSIVBlockCipher.ADD, 36, 18, -16, bo.h, 69, 53, -109, -38, -114, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, -125, 56, 102, -35, -3, UTF8.S_P3A, -65, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, KeyFactorySpi.x25519_type, 72, -61, -93, -74, 30, 66, 58, 107, 40, 84, -6, -123, Base32Encoder.DEFAULT_PADDING, -70, 43, 121, 10, 21, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, UTF8.S_P4A, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, 95, -80, -100, -87, 81, -96, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 12, -10, KeyFactorySpi.x448_type, 23, -60, 73, -20, -40, 67, bo.j, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, UTF8.S_P4B, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, -78, -121, -112, 97, -66, -36, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, UTF8.S_CS3, 46, -119, -76, 124, -72, 38, 119, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, cb.k, 99, -116, GCMSIVBlockCipher.MASK, -64, -9, KeyFactorySpi.Ed25519_type, 7};
    public static final byte[] AES_EXP = {1, 3, 5, 15, 17, 51, 85, -1, 26, 46, 114, -106, -95, -8, 19, 53, 95, GCMSIVBlockCipher.ADD, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, 30, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, 38, 106, -66, -39, KeyFactorySpi.Ed25519_type, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, KeyFactorySpi.x25519_type, -78, -51, 76, -44, 103, -87, bo.k, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, -125, -98, -71, -48, 107, -67, -36, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -127, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, UTF8.S_P3A, UTF8.S_P4A, -16, 11, 29, 39, 105, -69, -42, 97, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, KeyFactorySpi.Ed448_type, -109, -82, -23, UTF8.S_CS3, UTF8.S_P4B, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, 21, 63, 65, -61, 94, -30, Base32Encoder.DEFAULT_PADDING, 71, -55, 64, -64, 91, -19, 44, 116, -100, -65, -38, 117, -97, -70, -43, 100, -84, -17, 42, 126, bo.h, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, -114, -119, GCMSIVBlockCipher.MASK, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, KeyFactorySpi.x448_type, -79, -56, 67, -59, 84, -4, bo.j, PublicSuffixDatabase.EXCEPTION_MARKER, 99, -91, -12, 7, 9, 27, 45, 119, -103, -80, -53, 70, -54, 69, -49, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, cb.f77931l, 18, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, cb.k, 23, 57, 75, -35, 124, -124, -105, -94, -3, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 36, 108, -76, -57, 82, -10, 1};
    public static final byte[] RSA_LOG = {-1, 0, 1, 25, 2, 50, 26, -58, 3, -33, 51, -18, 27, 104, -57, 75, 4, 100, bo.k, cb.f77931l, 52, -115, -17, -127, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -63, 105, -8, -56, 8, 76, KeyFactorySpi.Ed448_type, 5, -118, 101, 47, GCMSIVBlockCipher.ADD, 36, 15, PublicSuffixDatabase.EXCEPTION_MARKER, 53, -109, -114, -38, -16, 18, bo.h, 69, 29, -75, -62, 125, 106, 39, -7, -71, -55, -102, 9, 120, 77, -28, 114, -90, 6, -65, -117, 98, 102, -35, UTF8.S_P3A, -3, -30, -104, 37, -77, 16, -111, 34, -120, 54, -48, -108, -50, -113, -106, -37, -67, -15, -46, 19, 92, -125, 56, 70, 64, 30, 66, -74, -93, -61, 72, 126, KeyFactorySpi.x25519_type, 107, 58, 40, 84, -6, -123, -70, Base32Encoder.DEFAULT_PADDING, -54, 94, -101, -97, 10, 21, 121, 43, 78, -44, -27, -84, 115, -13, -89, 87, 7, KeyFactorySpi.Ed25519_type, -64, -9, -116, GCMSIVBlockCipher.MASK, 99, cb.k, 103, 74, -34, -19, 49, -59, -2, 24, -29, -91, -103, 119, 38, -72, -76, 124, 17, 68, -110, -39, 35, UTF8.S_CS3, -119, 46, 55, 63, -47, 91, -107, PSSSigner.TRAILER_IMPLICIT, -49, -51, -112, -121, -105, -78, -36, -4, -66, 97, -14, 86, -45, -85, 20, 42, 93, -98, -124, 60, 57, 83, 71, 109, 65, -94, bo.j, 45, 67, -40, -73, 123, -92, 118, -60, 23, 73, -20, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 12, KeyFactorySpi.x448_type, -10, 108, -95, 59, 82, 41, -99, 85, -86, -5, UTF8.S_P4B, -122, -79, -69, -52, 62, 90, -53, 89, 95, -80, -100, -87, -96, 81, 11, -11, 22, -21, 122, 117, 44, -41, 79, -82, -43, -23, -26, -25, -83, -24, 116, -42, -12, -22, -88, UTF8.S_P4A, 88, -81};
    public static final byte[] RSA_EXP = {1, 2, 4, 8, 16, UTF8.S_CS3, 64, GCMSIVBlockCipher.MASK, 29, 58, 116, -24, -51, -121, 19, 38, 76, -104, 45, 90, -76, 117, -22, -55, -113, 3, 6, 12, 24, UTF8.S_P3A, UTF8.S_P4B, -64, -99, 39, 78, -100, 37, 74, -108, 53, 106, -44, -75, 119, -18, -63, -97, 35, 70, -116, 5, 10, 20, 40, UTF8.S_P4A, -96, 93, -70, 105, -46, -71, KeyFactorySpi.x448_type, -34, -95, 95, -66, 97, -62, -103, 47, 94, PSSSigner.TRAILER_IMPLICIT, 101, -54, -119, 15, 30, 60, 120, -16, -3, -25, -45, -69, 107, -42, -79, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -2, GCMSIVBlockCipher.ADD, -33, -93, 91, -74, KeyFactorySpi.Ed448_type, -30, -39, -81, 67, -122, 17, 34, 68, -120, cb.k, 26, 52, 104, -48, -67, 103, -50, -127, bo.j, 62, 124, -8, -19, -57, -109, 59, 118, -20, -59, -105, 51, 102, -52, -123, 23, 46, 92, -72, 109, -38, -87, 79, -98, PublicSuffixDatabase.EXCEPTION_MARKER, 66, -124, 21, 42, 84, -88, 77, -102, 41, 82, -92, 85, -86, 73, -110, 57, 114, -28, -43, -73, 115, -26, -47, -65, 99, -58, -111, 63, 126, -4, -27, -41, -77, 123, -10, -15, -1, -29, -37, -85, 75, -106, 49, 98, -60, -107, 55, KeyFactorySpi.x25519_type, -36, -91, 87, -82, 65, bo.h, 25, 50, 100, -56, -115, 7, cb.f77931l, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 56, KeyFactorySpi.Ed25519_type, bo.k, -35, -89, 83, -90, 81, -94, 89, -78, 121, -14, -7, -17, -61, -101, 43, 86, -84, 69, -118, 9, 18, 36, 72, -112, Base32Encoder.DEFAULT_PADDING, 122, -12, -11, -9, -13, -5, -21, -53, -117, 11, 22, 44, 88, -80, 125, -6, -23, -49, -125, 27, 54, 108, -40, -83, 71, -114, 1};

    /* JADX INFO: renamed from: org.bouncycastle.crypto.threshold.PolynomialTable$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm;

        static {
            int[] iArr = new int[ShamirSecretSplitter.Algorithm.values().length];
            $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm = iArr;
            try {
                iArr[ShamirSecretSplitter.Algorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[ShamirSecretSplitter.Algorithm.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolynomialTable(ShamirSecretSplitter.Algorithm algorithm) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[algorithm.ordinal()];
        if (i == 1) {
            this.LOG = AES_LOG;
            this.EXP = AES_EXP;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("The algorithm is not correct");
            }
            this.LOG = RSA_LOG;
            this.EXP = RSA_EXP;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfDiv(int i, int i2) {
        if (i == 0) {
            return (byte) 0;
        }
        byte[] bArr = this.EXP;
        byte[] bArr2 = this.LOG;
        return bArr[(((bArr2[i] & 255) - (bArr2[i2] & 255)) + 255) % 255];
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfMul(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return (byte) 0;
        }
        byte[] bArr = this.EXP;
        byte[] bArr2 = this.LOG;
        return (byte) (bArr[((bArr2[i] & 255) + (bArr2[i2] & 255)) % 255] & 255);
    }
}
