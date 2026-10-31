package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes2.dex */
public class Shake256RandomGenerator {
    public final SHAKEDigest digest;

    public Shake256RandomGenerator(byte[] bArr, byte b) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.digest = sHAKEDigest;
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.update(b);
    }

    public Shake256RandomGenerator(byte[] bArr, int i, int i2, byte b) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.digest = sHAKEDigest;
        sHAKEDigest.update(bArr, i, i2);
        sHAKEDigest.update(b);
    }

    public void init(byte[] bArr, int i, int i2, byte b) {
        this.digest.reset();
        this.digest.update(bArr, i, i2);
        this.digest.update(b);
    }

    public void nextBytes(byte[] bArr) {
        this.digest.doOutput(bArr, 0, bArr.length);
    }

    public void nextBytes(byte[] bArr, int i, int i2) {
        this.digest.doOutput(bArr, i, i2);
    }

    public void xofGetBytes(byte[] bArr, int i) {
        int i2 = i & 7;
        int i3 = i - i2;
        this.digest.doOutput(bArr, 0, i3);
        if (i2 != 0) {
            byte[] bArr2 = new byte[8];
            this.digest.doOutput(bArr2, 0, 8);
            System.arraycopy(bArr2, 0, bArr, i3, i2);
        }
    }
}
