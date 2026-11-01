package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    public SipHash128(int i, int i2) {
        super(i, i2);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        long j = this.f81154m;
        int i2 = this.wordPos;
        this.f81154m = ((j >>> ((7 - i2) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i2)) & 255) << 56);
        processMessageWord();
        this.f81157v2 ^= 238;
        applySipRounds(this.f81151d);
        long j2 = this.f81155v0;
        long j3 = this.f81156v1;
        long j4 = ((j2 ^ j3) ^ this.f81157v2) ^ this.f81158v3;
        this.f81156v1 = j3 ^ 221;
        applySipRounds(this.f81151d);
        long j5 = ((this.f81155v0 ^ this.f81156v1) ^ this.f81157v2) ^ this.f81158v3;
        reset();
        Pack.longToLittleEndian(j4, bArr, i);
        Pack.longToLittleEndian(j5, bArr, i + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f81150c + "-" + this.f81151d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f81156v1 ^= 238;
    }
}
