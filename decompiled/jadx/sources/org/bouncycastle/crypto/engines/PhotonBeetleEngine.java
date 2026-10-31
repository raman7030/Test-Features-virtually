package org.bouncycastle.crypto.engines;

import com.umeng.analytics.pro.cb;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.PhotonBeetleDigest;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes.dex */
public class PhotonBeetleEngine extends AEADBaseEngine {
    public static final int D = 8;
    public byte[] K;
    public final int LAST_THREE_BITS_OFFSET;
    public byte[] N;
    public final int RATE_INBYTES_HALF;
    public final int STATE_INBYTES;
    public boolean input_empty;
    public byte[] state;
    public static final byte[][] RC = {new byte[]{1, 3, 7, cb.f77931l, cb.k, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, cb.k, 8, 3, 4, 11}, new byte[]{2, 0, 4, cb.k, cb.f77931l, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, cb.f77931l, 5, 2, cb.k}, new byte[]{cb.f77931l, 12, 8, 1, 2, 4, 9, 3, 6, cb.k, 10, 5}, new byte[]{15, cb.k, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{cb.k, 15, 11, 2, 1, 7, 10, 0, 5, cb.f77931l, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, cb.f77931l, 4, 1, 10, cb.k, 2}};
    public static final byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, cb.k, 7, 7, 5, 2}, new byte[]{4, 4, cb.k, cb.k, 9, 4, cb.k, 9}, new byte[]{1, 6, 5, 1, 12, cb.k, 15, cb.f77931l}, new byte[]{15, 12, 9, cb.k, cb.f77931l, 5, cb.f77931l, cb.k}, new byte[]{9, cb.f77931l, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, cb.f77931l}, new byte[]{15, 1, cb.k, 10, 5, 10, 2, 3}};
    public static final byte[] sbox = {12, 5, 6, 11, 9, 0, 10, cb.k, 3, cb.f77931l, 15, 8, 4, 7, 1, 2};

    public enum PhotonBeetleParameters {
        pb32,
        pb128
    }

    public PhotonBeetleEngine(PhotonBeetleParameters photonBeetleParameters) {
        int i;
        int i2;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int iOrdinal = photonBeetleParameters.ordinal();
        if (iOrdinal == 0) {
            i = 32;
            i2 = BERTags.FLAGS;
        } else if (iOrdinal != 1) {
            i = 0;
            i2 = 0;
        } else {
            i = 128;
            i2 = 128;
        }
        int i3 = i + 7;
        int i4 = i3 >>> 3;
        this.BlockSize = i4;
        this.AADBufferSize = i4;
        this.RATE_INBYTES_HALF = i3 >>> 4;
        int i5 = i + i2;
        int i6 = (i5 + 7) >>> 3;
        this.STATE_INBYTES = i6;
        this.LAST_THREE_BITS_OFFSET = (i5 - ((i6 - 1) << 3)) - 3;
        this.algorithmName = "Photon-Beetle AEAD";
        this.state = new byte[i6];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Counter, AEADBaseEngine.DataOperatorType.Counter);
    }

    public static void photonPermutation(PhotonBeetleDigest.Friend friend, byte[] bArr) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by PhotonBeetleDigest");
        }
        photonPermutation(bArr);
    }

    public static void photonPermutation(byte[] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);
        for (int i = 0; i < 64; i++) {
            bArr2[i >>> 3][i & 7] = (byte) (((bArr[i >> 1] & 255) >>> ((i & 1) * 4)) & 15);
        }
        for (int i2 = 0; i2 < 12; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr3 = bArr2[i3];
                bArr3[0] = (byte) (bArr3[0] ^ RC[i3][i2]);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    byte[] bArr4 = bArr2[i4];
                    bArr4[i5] = sbox[bArr4[i5]];
                }
            }
            for (int i6 = 1; i6 < 8; i6++) {
                System.arraycopy(bArr2[i6], 0, bArr, 0, 8);
                int i7 = 8 - i6;
                System.arraycopy(bArr, i6, bArr2[i6], 0, i7);
                System.arraycopy(bArr, 0, bArr2[i6], i7, i6);
            }
            for (int i8 = 0; i8 < 8; i8++) {
                for (int i9 = 0; i9 < 8; i9++) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < 8; i11++) {
                        byte b = MixColMatrix[i9][i11];
                        byte b2 = bArr2[i11][i8];
                        i10 = (((i10 ^ ((b2 & 1) * b)) ^ ((b2 & 2) * b)) ^ ((b2 & 4) * b)) ^ (b * (b2 & 8));
                    }
                    int i12 = i10 >>> 4;
                    int i13 = (i12 << 1) ^ ((i10 & 15) ^ i12);
                    int i14 = i13 >>> 4;
                    bArr[i9] = (byte) (((i13 & 15) ^ i14) ^ (i14 << 1));
                }
                for (int i15 = 0; i15 < 8; i15++) {
                    bArr2[i15][i8] = bArr[i15];
                }
            }
        }
        for (int i16 = 0; i16 < 64; i16 += 2) {
            byte[] bArr5 = bArr2[i16 >>> 3];
            bArr[i16 >>> 1] = (byte) (((bArr5[(i16 + 1) & 7] & 15) << 4) | (bArr5[i16 & 7] & 15));
        }
    }

    private void rhoohr(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        photonPermutation(this.state);
        byte[] bArr3 = new byte[8];
        int iMin = Math.min(i3, this.RATE_INBYTES_HALF);
        int i4 = 0;
        while (true) {
            int i5 = this.RATE_INBYTES_HALF;
            if (i4 >= i5 - 1) {
                byte[] bArr4 = this.state;
                bArr3[i5 - 1] = (byte) (((bArr4[0] & 1) << 7) | ((bArr4[i4] & 255) >>> 1));
                Bytes.xor(iMin, bArr4, i5, bArr2, i2, bArr, i);
                Bytes.xor(i3 - iMin, bArr3, iMin - this.RATE_INBYTES_HALF, bArr2, i2 + iMin, bArr, i + iMin);
                return;
            }
            byte[] bArr5 = this.state;
            int i6 = i4 + 1;
            bArr3[i4] = (byte) (((bArr5[i6] & 1) << 7) | ((bArr5[i4] & 255) >>> 1));
            i4 = i6;
        }
    }

    private byte select(boolean z, boolean z2, byte b, byte b2) {
        if (z && z2) {
            return (byte) 1;
        }
        if (z) {
            return (byte) 2;
        }
        return z2 ? b : b2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD3(state, z);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
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
        this.K = bArr;
        this.N = bArr2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        photonPermutation(this.state);
        Bytes.xorTo(this.BlockSize, bArr, i, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        rhoohr(bArr2, i2, bArr, i, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr2, i2, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        rhoohr(bArr2, i2, bArr, i, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr, i, this.state);
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
        int len = this.aadOperator.getLen();
        if (len != 0) {
            if (this.m_aadPos != 0) {
                photonPermutation(this.state);
                Bytes.xorTo(this.m_aadPos, this.m_aad, this.state);
                int i = this.m_aadPos;
                if (i < this.BlockSize) {
                    byte[] bArr = this.state;
                    bArr[i] = (byte) (bArr[i] ^ 1);
                }
            }
            byte[] bArr2 = this.state;
            int i2 = this.STATE_INBYTES - 1;
            bArr2[i2] = (byte) ((select(this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE) > 0, len % this.BlockSize == 0, (byte) 3, (byte) 4) << this.LAST_THREE_BITS_OFFSET) ^ bArr2[i2]);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        int i2 = this.m_bufPos;
        int len2 = this.aadOperator.getLen();
        if (len2 != 0 || len != 0) {
            this.input_empty = false;
        }
        byte bSelect = select(len2 != 0, len % this.BlockSize == 0, (byte) 5, (byte) 6);
        if (len != 0) {
            if (i2 != 0) {
                rhoohr(bArr, i, this.m_buf, 0, i2);
                if (this.forEncryption) {
                    Bytes.xorTo(i2, this.m_buf, this.state);
                } else {
                    Bytes.xorTo(i2, bArr, i, this.state);
                }
                if (i2 < this.BlockSize) {
                    byte[] bArr2 = this.state;
                    bArr2[i2] = (byte) (bArr2[i2] ^ 1);
                }
            }
            byte[] bArr3 = this.state;
            int i3 = this.STATE_INBYTES - 1;
            bArr3[i3] = (byte) (bArr3[i3] ^ (bSelect << this.LAST_THREE_BITS_OFFSET));
        } else if (this.input_empty) {
            byte[] bArr4 = this.state;
            int i4 = this.STATE_INBYTES - 1;
            bArr4[i4] = (byte) (bArr4[i4] ^ (1 << this.LAST_THREE_BITS_OFFSET));
        }
        photonPermutation(this.state);
        System.arraycopy(this.state, 0, this.mac, 0, this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        this.input_empty = true;
        byte[] bArr = this.K;
        System.arraycopy(bArr, 0, this.state, 0, bArr.length);
        byte[] bArr2 = this.N;
        System.arraycopy(bArr2, 0, this.state, this.K.length, bArr2.length);
    }
}
