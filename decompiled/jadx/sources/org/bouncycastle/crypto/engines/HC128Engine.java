package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;
import p067l.C21545;

/* JADX INFO: loaded from: classes.dex */
public class HC128Engine implements StreamCipher {
    public boolean initialised;

    /* JADX INFO: renamed from: iv */
    public byte[] f81028iv;
    public byte[] key;

    /* JADX INFO: renamed from: p */
    public int[] f81029p = new int[512];

    /* JADX INFO: renamed from: q */
    public int[] f81030q = new int[512];
    public int cnt = 0;
    public byte[] buf = new byte[4];
    public int idx = 0;

    public static int dim(int i, int i2) {
        return mod512(i - i2);
    }

    /* JADX INFO: renamed from: f1 */
    public static int m55378f1(int i) {
        return (i >>> 3) ^ (rotateRight(i, 7) ^ rotateRight(i, 18));
    }

    /* JADX INFO: renamed from: f2 */
    public static int m55379f2(int i) {
        return (i >>> 10) ^ (rotateRight(i, 17) ^ rotateRight(i, 19));
    }

    /* JADX INFO: renamed from: g1 */
    private int m55380g1(int i, int i2, int i3) {
        return (rotateRight(i, 10) ^ rotateRight(i3, 23)) + rotateRight(i2, 8);
    }

    /* JADX INFO: renamed from: g2 */
    private int m55381g2(int i, int i2, int i3) {
        return (rotateLeft(i, 10) ^ rotateLeft(i3, 23)) + rotateLeft(i2, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i = this.idx;
        byte b = bArr2[i];
        this.idx = 3 & (i + 1);
        return b;
    }

    /* JADX INFO: renamed from: h1 */
    private int m55382h1(int i) {
        int[] iArr = this.f81030q;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    /* JADX INFO: renamed from: h2 */
    private int m55383h2(int i) {
        int[] iArr = this.f81029p;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        if (this.f81028iv.length != 16) {
            throw new IllegalArgumentException("The IV must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.key[i] & 255) << ((i & 3) * 8));
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f81028iv;
            if (i3 >= bArr.length || i3 >= 16) {
                break;
            }
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
            i3++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            iArr[i5] = m55379f2(iArr[i5 - 2]) + iArr[i5 - 7] + m55378f1(iArr[i5 - 15]) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 256, this.f81029p, 0, 512);
        System.arraycopy(iArr, 768, this.f81030q, 0, 512);
        for (int i6 = 0; i6 < 512; i6++) {
            this.f81029p[i6] = step();
        }
        for (int i7 = 0; i7 < 512; i7++) {
            this.f81030q[i7] = step();
        }
        this.cnt = 0;
    }

    public static int mod1024(int i) {
        return i & 1023;
    }

    public static int mod512(int i) {
        return i & SecP521R1Field.P16;
    }

    public static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int step() {
        int iM55383h2;
        int i;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f81029p;
            iArr[iMod512] = iArr[iMod512] + m55380g1(iArr[dim(iMod512, 3)], this.f81029p[dim(iMod512, 10)], this.f81029p[dim(iMod512, SecP521R1Field.P16)]);
            iM55383h2 = m55382h1(this.f81029p[dim(iMod512, 12)]);
            i = this.f81029p[iMod512];
        } else {
            int[] iArr2 = this.f81030q;
            iArr2[iMod512] = iArr2[iMod512] + m55381g2(iArr2[dim(iMod512, 3)], this.f81030q[dim(iMod512, 10)], this.f81030q[dim(iMod512, SecP521R1Field.P16)]);
            iM55383h2 = m55383h2(this.f81030q[dim(iMod512, 12)]);
            i = this.f81030q[iMod512];
        }
        int i2 = i ^ iM55383h2;
        this.cnt = mod1024(this.cnt + 1);
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("no IV passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f81028iv = parametersWithIV.getIV();
        CipherParameters parameters = parametersWithIV.getParameters();
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(C21545.m48728("Invalid parameter passed to HC128 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getByte());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) (b ^ getByte());
    }
}
