package org.bouncycastle.crypto.digests;

import l.C18307;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class SHAKEDigest extends KeccakDigest implements Xof, SavableDigest {
    public SHAKEDigest() {
        this(128);
    }

    public SHAKEDigest(int i) {
        super(checkBitLength(i), CryptoServicePurpose.ANY);
    }

    public SHAKEDigest(int i, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i), cryptoServicePurpose);
    }

    public SHAKEDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(128, cryptoServicePurpose);
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    public SHAKEDigest(byte[] bArr) {
        super(bArr);
    }

    public Memoable copy() {
        return new SHAKEDigest(this);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, this.purpose);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b, int i2) {
        return doFinal(bArr, i, getDigestSize(), b, i2);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        int iDoOutput = doOutput(bArr, i, i2);
        reset();
        return iDoOutput;
    }

    public int doFinal(byte[] bArr, int i, int i2, byte b, int i3) {
        if (i3 < 0 || i3 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i4 = (b & ((1 << i3) - 1)) | (15 << i3);
        int i5 = i3 + 4;
        if (i5 >= 8) {
            absorb((byte) i4);
            i5 = i3 - 4;
            i4 >>>= 8;
        }
        if (i5 > 0) {
            absorbBits(i4, i5);
        }
        squeeze(bArr, i, ((long) i2) * 8);
        reset();
        return i2;
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i, ((long) i2) * 8);
        return i2;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.state.length * 8) + this.dataQueue.length + 14];
        super.getEncodedState(bArr);
        return bArr;
    }

    public void reset(Memoable memoable) {
        copyIn((SHAKEDigest) memoable);
    }

    public static int checkBitLength(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException(C18307.m42645(i, "'bitStrength' ", " not supported for SHAKE"));
    }
}
