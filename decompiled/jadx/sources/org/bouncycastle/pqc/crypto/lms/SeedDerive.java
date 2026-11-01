package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class SeedDerive {

    /* JADX INFO: renamed from: I */
    public final byte[] f81657I;
    public final Digest digest;

    /* JADX INFO: renamed from: j */
    public int f81658j;
    public final byte[] masterSeed;

    /* JADX INFO: renamed from: q */
    public int f81659q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f81657I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z) {
        deriveSeed(bArr, z, 0);
    }

    public void deriveSeed(byte[] bArr, boolean z, int i) {
        deriveSeed(bArr, i);
        if (z) {
            this.f81658j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length - i < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f81657I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f81659q >>> 24));
        this.digest.update((byte) (this.f81659q >>> 16));
        this.digest.update((byte) (this.f81659q >>> 8));
        this.digest.update((byte) this.f81659q);
        this.digest.update((byte) (this.f81658j >>> 8));
        this.digest.update((byte) this.f81658j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i);
        return bArr;
    }

    public byte[] getI() {
        return this.f81657I;
    }

    public int getJ() {
        return this.f81658j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f81659q;
    }

    public void setJ(int i) {
        this.f81658j = i;
    }

    public void setQ(int i) {
        this.f81659q = i;
    }
}
