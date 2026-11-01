package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class AsconAEAD128 extends AsconBaseEngine {
    public AsconAEAD128() {
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.ASCON_IV = 17594342703105L;
        this.algorithmName = "Ascon-AEAD128";
        this.f80980nr = 8;
        this.dsep = Long.MIN_VALUE;
        this.macSizeLowerBound = 4;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.DataLimit, AEADBaseEngine.DataOperatorType.DataLimit);
        this.dataLimitCounter.init(54);
        this.decryptionFailureCounter = new AEADBaseEngine.DecryptionFailureCounter();
    }

    private void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
        asconPermutation.f80985x2 ^= this.f80976K0;
        asconPermutation.f80986x3 ^= this.f80977K1;
        asconPermutation.m55366p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f80981p;
        asconPermutation2.f80986x3 ^= this.f80976K0;
        asconPermutation2.f80987x4 ^= this.f80977K1;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void ascon_aeadinit() {
        this.f80981p.set(this.ASCON_IV, this.f80976K0, this.f80977K1, this.f80978N0, this.f80979N1);
        this.f80981p.m55366p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
        asconPermutation.f80986x3 ^= this.f80976K0;
        asconPermutation.f80987x4 ^= this.f80977K1;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.3";
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        int i = (this.MAC_SIZE << 3) - 32;
        long jLittleEndianToLong = Pack.littleEndianToLong(bArr, 0);
        long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, 8);
        this.decryptionFailureCounter.init(i);
        if (this.f80976K0 != jLittleEndianToLong || this.f80977K1 != jLittleEndianToLong2) {
            this.dataLimitCounter.reset();
            this.decryptionFailureCounter.reset();
            this.f80976K0 = jLittleEndianToLong;
            this.f80977K1 = jLittleEndianToLong2;
        }
        this.f80978N0 = Pack.littleEndianToLong(bArr2, 0);
        this.f80979N1 = Pack.littleEndianToLong(bArr2, 8);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long loadBytes(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long pad(int i) {
        return 1 << (i << 3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b, byte[] bArr, int i) {
        return super.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        if (this.m_aadPos == this.BlockSize) {
            this.f80981p.f80983x0 ^= loadBytes(this.m_aad, 0);
            this.f80981p.f80984x1 ^= loadBytes(this.m_aad, 8);
            this.m_aadPos -= this.BlockSize;
            this.f80981p.m55366p(this.f80980nr);
        }
        Arrays.fill(this.m_aad, this.m_aadPos, this.AADBufferSize, (byte) 0);
        if (this.m_aadPos < 8) {
            this.f80981p.f80983x0 ^= Pack.littleEndianToLong(this.m_aad, 0) ^ pad(this.m_aadPos);
            return;
        }
        this.f80981p.f80983x0 ^= Pack.littleEndianToLong(this.m_aad, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
        asconPermutation.f80984x1 = (Pack.littleEndianToLong(this.m_aad, 8) ^ pad(this.m_aadPos)) ^ asconPermutation.f80984x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i >= 8) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, 0);
            int i3 = i - 8;
            long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, 8, i3);
            Pack.longToLittleEndian(this.f80981p.f80983x0 ^ jLittleEndianToLong, bArr2, i2);
            Pack.longToLittleEndian(this.f80981p.f80984x1 ^ jLittleEndianToLong2, bArr2, i2 + 8, i3);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f80981p;
            asconPermutation.f80983x0 = jLittleEndianToLong;
            long j = (asconPermutation.f80984x1 & (-(1 << (i3 << 3)))) | jLittleEndianToLong2;
            asconPermutation.f80984x1 = j;
            asconPermutation.f80984x1 = j ^ pad(i3);
        } else {
            if (i != 0) {
                long jLittleEndianToLong3 = Pack.littleEndianToLong(bArr, 0, i);
                Pack.longToLittleEndian(this.f80981p.f80983x0 ^ jLittleEndianToLong3, bArr2, i2, i);
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f80981p;
                asconPermutation2.f80983x0 = (asconPermutation2.f80983x0 & (-(1 << (i << 3)))) | jLittleEndianToLong3;
            }
            this.f80981p.f80983x0 ^= pad(i);
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i >= 8) {
            this.f80981p.f80983x0 ^= Pack.littleEndianToLong(bArr, 0);
            int i3 = i - 8;
            this.f80981p.f80984x1 ^= Pack.littleEndianToLong(bArr, 8, i3);
            Pack.longToLittleEndian(this.f80981p.f80983x0, bArr2, i2);
            Pack.longToLittleEndian(this.f80981p.f80984x1, bArr2, i2 + 8);
            this.f80981p.f80984x1 ^= pad(i3);
        } else {
            if (i != 0) {
                this.f80981p.f80983x0 ^= Pack.littleEndianToLong(bArr, 0, i);
                Pack.longToLittleEndian(this.f80981p.f80983x0, bArr2, i2, i);
            }
            this.f80981p.f80983x0 ^= pad(i);
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void setBytes(long j, byte[] bArr, int i) {
        Pack.longToLittleEndian(j, bArr, i);
    }
}
