package org.bouncycastle.crypto.digests;

import l.C18307;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class SHA3Digest extends KeccakDigest implements SavableDigest {
    public SHA3Digest() {
        this(256, CryptoServicePurpose.ANY);
    }

    public SHA3Digest(int i) {
        super(checkBitLength(i), CryptoServicePurpose.ANY);
    }

    public SHA3Digest(int i, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i), cryptoServicePurpose);
    }

    public SHA3Digest(CryptoServicePurpose cryptoServicePurpose) {
        this(256, cryptoServicePurpose);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    public SHA3Digest(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i3 = (b & ((1 << i2) - 1)) | (2 << i2);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            absorb((byte) i3);
            i4 = i2 - 6;
            i3 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i3, i4);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.state.length * 8) + this.dataQueue.length + 14];
        super.getEncodedState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA3Digest) memoable);
    }

    public static int checkBitLength(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException(C18307.m42645(i, "'bitLength' ", " not supported for SHA-3"));
    }
}
