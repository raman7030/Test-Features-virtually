package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class AsconEngine extends AsconBaseEngine {
    public long K2;
    public final AsconParameters asconParameters;

    /* JADX INFO: loaded from: classes.dex */
    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
    }

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        int iOrdinal = asconParameters.ordinal();
        if (iOrdinal == 0) {
            this.KEY_SIZE = 20;
            this.BlockSize = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (iOrdinal == 1) {
            this.KEY_SIZE = 16;
            this.BlockSize = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
            }
            this.KEY_SIZE = 16;
            this.BlockSize = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i = this.BlockSize;
        this.nr = i == 8 ? 6 : 8;
        this.AADBufferSize = i;
        this.dsep = 1L;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void ascon_aeadinit() {
        this.p.set(this.ASCON_IV, this.K1, this.K2, this.N0, this.N1);
        if (this.KEY_SIZE == 20) {
            this.p.x0 ^= this.K0;
        }
        this.p.p(12);
        if (this.KEY_SIZE == 20) {
            this.p.x2 ^= this.K0;
        }
        AsconPermutationFriend.AsconPermutation asconPermutation = this.p;
        asconPermutation.x3 ^= this.K1;
        asconPermutation.x4 ^= this.K2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    public void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation;
        long j;
        long j2;
        int iOrdinal = this.asconParameters.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                asconPermutation = this.p;
                asconPermutation.x2 ^= this.K1;
                j = asconPermutation.x3;
                j2 = this.K2;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException();
                }
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.p;
                asconPermutation2.x1 ^= this.K1;
                asconPermutation2.x2 ^= this.K2;
            }
            this.p.p(12);
            AsconPermutationFriend.AsconPermutation asconPermutation3 = this.p;
            asconPermutation3.x3 ^= this.K1;
            asconPermutation3.x4 ^= this.K2;
            this.m_state = state;
        }
        asconPermutation = this.p;
        long j3 = asconPermutation.x1;
        long j4 = this.K0 << 32;
        long j5 = this.K1;
        asconPermutation.x1 = j3 ^ (j4 | (j5 >> 32));
        long j6 = asconPermutation.x2;
        long j7 = j5 << 32;
        long j8 = this.K2;
        asconPermutation.x2 = j6 ^ (j7 | (j8 >> 32));
        j = asconPermutation.x3;
        j2 = j8 << 32;
        asconPermutation.x3 = j ^ j2;
        this.p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation4 = this.p;
        asconPermutation4.x3 ^= this.K1;
        asconPermutation4.x4 ^= this.K2;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.2";
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
        long jBigEndianToLong;
        this.N0 = Pack.bigEndianToLong(bArr2, 0);
        this.N1 = Pack.bigEndianToLong(bArr2, 8);
        int i = this.KEY_SIZE;
        if (i == 16) {
            this.K1 = Pack.bigEndianToLong(bArr, 0);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 8);
        } else {
            if (i != 20) {
                throw new IllegalStateException();
            }
            this.K0 = Pack.bigEndianToInt(bArr, 0);
            this.K1 = Pack.bigEndianToLong(bArr, 4);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 12);
        }
        this.K2 = jBigEndianToLong;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long loadBytes(byte[] bArr, int i) {
        return Pack.bigEndianToLong(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long pad(int i) {
        return 128 << (56 - (i << 3));
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
        byte[] bArr = this.m_aad;
        int i = this.m_aadPos;
        bArr[i] = GCMSIVBlockCipher.MASK;
        if (i < 8) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.p;
            asconPermutation.x0 = (((-1) << (56 - (this.m_aadPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ asconPermutation.x0;
            return;
        }
        this.p.x0 ^= Pack.bigEndianToLong(bArr, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.p;
        asconPermutation2.x1 = (((-1) << (56 - ((this.m_aadPos - 8) << 3))) & Pack.bigEndianToLong(this.m_aad, 8)) ^ asconPermutation2.x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.p;
            long j = asconPermutation.x0 ^ jBigEndianToLong;
            asconPermutation.x0 = j;
            Pack.longToBigEndian(j, bArr2, i2);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.p;
            asconPermutation2.x0 = jBigEndianToLong;
            int i3 = i2 + 8;
            int i4 = i - 8;
            asconPermutation2.x1 ^= pad(i4);
            if (i4 != 0) {
                long jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, 8, i4);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.p;
                long j2 = asconPermutation3.x1 ^ jLittleEndianToLong_High;
                asconPermutation3.x1 = j2;
                Pack.longToLittleEndian_High(j2, bArr2, i3, i4);
                AsconPermutationFriend.AsconPermutation asconPermutation4 = this.p;
                asconPermutation4.x1 = (asconPermutation4.x1 & ((-1) >>> (i4 << 3))) ^ jLittleEndianToLong_High;
            }
        } else {
            this.p.x0 ^= pad(i);
            if (i != 0) {
                long jLittleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, 0, i);
                AsconPermutationFriend.AsconPermutation asconPermutation5 = this.p;
                long j3 = asconPermutation5.x0 ^ jLittleEndianToLong_High2;
                asconPermutation5.x0 = j3;
                Pack.longToLittleEndian_High(j3, bArr2, i2, i);
                AsconPermutationFriend.AsconPermutation asconPermutation6 = this.p;
                asconPermutation6.x0 = (asconPermutation6.x0 & ((-1) >>> (i << 3))) ^ jLittleEndianToLong_High2;
            }
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        long j;
        if (i >= 8) {
            this.p.x0 ^= Pack.bigEndianToLong(bArr, 0);
            Pack.longToBigEndian(this.p.x0, bArr2, i2);
            i2 += 8;
            i -= 8;
            this.p.x1 ^= pad(i);
            if (i != 0) {
                this.p.x1 ^= Pack.littleEndianToLong_High(bArr, 8, i);
                j = this.p.x1;
                Pack.longToLittleEndian_High(j, bArr2, i2, i);
            }
        } else {
            this.p.x0 ^= pad(i);
            if (i != 0) {
                this.p.x0 ^= Pack.littleEndianToLong_High(bArr, 0, i);
                j = this.p.x0;
                Pack.longToLittleEndian_High(j, bArr2, i2, i);
            }
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void setBytes(long j, byte[] bArr, int i) {
        Pack.longToBigEndian(j, bArr, i);
    }
}
