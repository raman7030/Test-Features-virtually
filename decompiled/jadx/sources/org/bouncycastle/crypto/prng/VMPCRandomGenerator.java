package org.bouncycastle.crypto.prng;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: n */
    public byte f81295n = 0;

    /* JADX INFO: renamed from: P */
    public byte[] f81294P = {-69, 44, 98, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -75, -86, -44, C0698cb.f2569k, -127, -2, -78, C0684bo.f2503h, -53, -96, -95, 8, 24, KeyFactorySpi.Ed448_type, 86, -24, 73, 2, 16, -60, -34, 53, -91, -20, GCMSIVBlockCipher.MASK, 18, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, C0684bo.f2506k, -35, 5, 67, -112, -83, -56, GCMSIVBlockCipher.ADD, -81, 87, -101, 76, -40, 81, -82, UTF8.S_P4A, -123, 60, 10, -28, -13, -100, 38, 35, 83, -55, -125, -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, KeyFactorySpi.x448_type, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, 36, C0698cb.f2570l, -41, 64, -77, -49, 126, 6, 21, -102, 77, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -93, -37, 50, -110, 88, 17, 39, -12, 89, -48, 78, 106, 23, 91, -84, -1, 7, -64, 101, 121, -4, -57, -51, 118, 66, 93, -25, 58, 52, 122, UTF8.S_P3A, 40, 15, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, -65, 99, -6, C0684bo.f2505j, 51, UTF8.S_P4B, 71, -119, -16, -106, 26, 95, -109, Base32Encoder.DEFAULT_PADDING, 55, 75, -39, -88, -63, 27, -10, 57, -117, -73, 12, UTF8.S_CS3, -50, -120, KeyFactorySpi.x25519_type, -74, 116, -114, -115, 22, 41, -14, -121, -11, -21, KeyFactorySpi.Ed25519_type, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, 30, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, PublicSuffixDatabase.EXCEPTION_MARKER, -17, -22, -66, -54, 114, 79, 82, -104, 63, -62, 20, 123, 59, 84};

    /* JADX INFO: renamed from: s */
    public byte f81296s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.f81294P;
            byte b2 = this.f81296s;
            byte b3 = this.f81295n;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.f81296s = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.f81295n = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.f81294P) {
            int i3 = i2 + i;
            while (i != i3) {
                byte[] bArr2 = this.f81294P;
                byte b = this.f81296s;
                byte b2 = this.f81295n;
                byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
                this.f81296s = b3;
                bArr[i] = bArr2[(bArr2[bArr2[b3 & 255] & 255] + 1) & 255];
                byte b4 = bArr2[b2 & 255];
                bArr2[b2 & 255] = bArr2[b3 & 255];
                bArr2[b3 & 255] = b4;
                this.f81295n = (byte) ((b2 + 1) & 255);
                i++;
            }
        }
    }
}
