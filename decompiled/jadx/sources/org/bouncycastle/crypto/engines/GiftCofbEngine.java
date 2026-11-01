package org.bouncycastle.crypto.engines;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: loaded from: classes.dex */
public class GiftCofbEngine extends AEADBaseEngine {
    public static final byte[] GIFT_RC = {1, 3, 7, 15, C0684bo.f2505j, 62, Base32Encoder.DEFAULT_PADDING, 59, 55, 47, 30, 60, 57, 51, 39, C0698cb.f2570l, 29, 58, 53, 43, 22, 44, 24, UTF8.S_P3A, PublicSuffixDatabase.EXCEPTION_MARKER, 2, 5, 11, 23, 46, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 56, 49, 35, 6, C0698cb.f2569k, 27, 54, 45, 26};

    /* JADX INFO: renamed from: Y */
    public byte[] f81026Y;
    public byte[] input;

    /* JADX INFO: renamed from: k */
    public byte[] f81027k;
    public byte[] npub;
    public byte[] offset;

    public GiftCofbEngine() {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 16;
        this.MAC_SIZE = 16;
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.algorithmName = "GIFT-COFB AEAD";
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void double_half_block(byte[] bArr) {
        int i = 0;
        int i2 = ((bArr[0] & 255) >>> 7) * 27;
        while (i < 7) {
            int i3 = i + 1;
            bArr[i] = (byte) (((bArr[i] & 255) << 1) | ((bArr[i3] & 255) >>> 7));
            i = i3;
        }
        bArr[7] = (byte) (((bArr[7] & 255) << 1) ^ i2);
    }

    private void giftb128(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = {((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255), ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255), ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8) | (bArr[11] & 255), ((bArr[13] & 255) << 16) | ((bArr[12] & 255) << 24) | ((bArr[14] & 255) << 8) | (bArr[15] & 255)};
        short[] sArr = {(short) (((bArr2[0] & 255) << 8) | (bArr2[1] & 255)), (short) (((bArr2[2] & 255) << 8) | (bArr2[3] & 255)), (short) (((bArr2[4] & 255) << 8) | (bArr2[5] & 255)), (short) (((bArr2[6] & 255) << 8) | (bArr2[7] & 255)), (short) (((bArr2[8] & 255) << 8) | (bArr2[9] & 255)), (short) (((bArr2[10] & 255) << 8) | (bArr2[11] & 255)), (short) (((bArr2[12] & 255) << 8) | (bArr2[13] & 255)), (short) (((bArr2[14] & 255) << 8) | (bArr2[15] & 255))};
        int i = 0;
        char c = 0;
        while (i < 40) {
            int i2 = iArr[1];
            int i3 = iArr[c];
            int i4 = iArr[2];
            int i5 = i2 ^ (i3 & i4);
            iArr[1] = i5;
            int i6 = iArr[3];
            int i7 = i3 ^ (i5 & i6);
            iArr[c] = i7;
            int i8 = i4 ^ (i7 | i5);
            iArr[2] = i8;
            int i9 = i6 ^ i8;
            iArr[3] = i9;
            int i10 = i5 ^ i9;
            iArr[1] = i10;
            int i11 = ~i9;
            iArr[3] = i11;
            iArr[2] = i8 ^ (i7 & i10);
            iArr[0] = i11;
            iArr[3] = i7;
            iArr[0] = rowperm(i11, 0, 3, 2, 1);
            iArr[1] = rowperm(iArr[1], 1, 0, 3, 2);
            iArr[2] = rowperm(iArr[2], 2, 1, 0, 3);
            int iRowperm = rowperm(iArr[3], 3, 2, 1, 0);
            iArr[3] = iRowperm;
            int i12 = iArr[2];
            short s = sArr[2];
            int i13 = (s & HPKE.aead_EXPORT_ONLY) << 16;
            short s2 = sArr[3];
            iArr[2] = i12 ^ (i13 | (s2 & HPKE.aead_EXPORT_ONLY));
            int i14 = iArr[1];
            short s3 = sArr[6];
            int i15 = (s3 & HPKE.aead_EXPORT_ONLY) << 16;
            short s4 = sArr[7];
            iArr[1] = i14 ^ (i15 | (s4 & HPKE.aead_EXPORT_ONLY));
            iArr[3] = iRowperm ^ ((GIFT_RC[i] & 255) ^ Integer.MIN_VALUE);
            short s5 = (short) (((s3 & HPKE.aead_EXPORT_ONLY) >>> 2) | ((s3 & HPKE.aead_EXPORT_ONLY) << 14));
            short s6 = (short) (((s4 & HPKE.aead_EXPORT_ONLY) >>> 12) | ((s4 & HPKE.aead_EXPORT_ONLY) << 4));
            sArr[7] = sArr[5];
            sArr[6] = sArr[4];
            sArr[5] = s2;
            sArr[4] = s;
            sArr[3] = sArr[1];
            sArr[2] = sArr[0];
            sArr[1] = s6;
            sArr[0] = s5;
            i++;
            c = 0;
        }
        int i16 = iArr[0];
        bArr3[0] = (byte) (i16 >>> 24);
        bArr3[1] = (byte) (i16 >>> 16);
        bArr3[2] = (byte) (i16 >>> 8);
        bArr3[3] = (byte) i16;
        int i17 = iArr[1];
        bArr3[4] = (byte) (i17 >>> 24);
        bArr3[5] = (byte) (i17 >>> 16);
        bArr3[6] = (byte) (i17 >>> 8);
        bArr3[7] = (byte) i17;
        int i18 = iArr[2];
        bArr3[8] = (byte) (i18 >>> 24);
        bArr3[9] = (byte) (i18 >>> 16);
        bArr3[10] = (byte) (i18 >>> 8);
        bArr3[11] = (byte) i18;
        int i19 = iArr[3];
        bArr3[12] = (byte) (i19 >>> 24);
        bArr3[13] = (byte) (i19 >>> 16);
        bArr3[14] = (byte) (i19 >>> 8);
        bArr3[15] = (byte) i19;
    }

    private void pho1(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        if (i2 == 0) {
            bArr4[0] = GCMSIVBlockCipher.MASK;
        } else {
            System.arraycopy(bArr3, i, bArr4, 0, i2);
            if (i2 < 16) {
                bArr4[i2] = GCMSIVBlockCipher.MASK;
            }
        }
        System.arraycopy(bArr2, 8, bArr5, 0, 8);
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i3 + 8;
            int i5 = (bArr2[i3] & 255) << 1;
            i3++;
            bArr5[i4] = (byte) (i5 | ((bArr2[i3] & 255) >>> 7));
        }
        bArr5[15] = (byte) (((bArr2[7] & 255) << 1) | ((bArr2[0] & 255) >>> 7));
        System.arraycopy(bArr5, 0, bArr2, 0, 16);
        Bytes.xor(16, bArr2, bArr4, bArr);
    }

    private int rowperm(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int i8 = i7 * 4;
            i6 = i6 | (((i >>> i8) & 1) << ((i2 * 8) + i7)) | (((i >>> (i8 + 1)) & 1) << ((i3 * 8) + i7)) | (((i >>> (i8 + 2)) & 1) << ((i4 * 8) + i7)) | (((i >>> (i8 + 3)) & 1) << ((i5 * 8) + i7));
        }
        return i6;
    }

    private void triple_half_block(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i = 0;
        while (i < 7) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] & 255) << 1) | ((bArr[i2] & 255) >>> 7));
            i = i2;
        }
        bArr2[7] = (byte) ((((bArr[0] & 255) >>> 7) * 27) ^ ((bArr[7] & 255) << 1));
        Bytes.xorTo(8, bArr2, bArr);
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
        this.npub = bArr2;
        this.f81027k = bArr;
        this.f81026Y = new byte[this.BlockSize];
        this.input = new byte[16];
        this.offset = new byte[8];
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
        pho1(this.input, this.f81026Y, bArr, i, 16);
        double_half_block(this.offset);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f81027k, this.f81026Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.f81026Y, bArr, i, bArr2, i2);
        pho1(this.input, this.f81026Y, bArr2, i2, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f81027k, this.f81026Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.f81026Y, bArr, i, bArr2, i2);
        pho1(this.input, this.f81026Y, bArr, i, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f81027k, this.f81026Y);
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
        AEADBaseEngine.State state;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        triple_half_block(this.offset);
        if ((this.m_aadPos & 15) != 0 || (state = this.m_state) == AEADBaseEngine.State.DecInit || state == AEADBaseEngine.State.EncInit) {
            triple_half_block(this.offset);
        }
        if (len == 0) {
            triple_half_block(this.offset);
            triple_half_block(this.offset);
        }
        pho1(this.input, this.f81026Y, this.m_aad, 0, this.m_aadPos);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f81027k, this.f81026Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        if (len != 0) {
            triple_half_block(this.offset);
            if ((len & 15) != 0) {
                triple_half_block(this.offset);
            }
            Bytes.xor(this.m_bufPos, this.f81026Y, this.m_buf, 0, bArr, i);
            boolean z = this.forEncryption;
            byte[] bArr2 = this.input;
            byte[] bArr3 = this.f81026Y;
            if (z) {
                pho1(bArr2, bArr3, this.m_buf, 0, this.m_bufPos);
            } else {
                pho1(bArr2, bArr3, bArr, i, this.m_bufPos);
            }
            Bytes.xorTo(8, this.offset, this.input);
            giftb128(this.input, this.f81027k, this.f81026Y);
        }
        System.arraycopy(this.f81026Y, 0, this.mac, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        System.arraycopy(this.npub, 0, this.input, 0, this.IV_SIZE);
        giftb128(this.input, this.f81027k, this.f81026Y);
        System.arraycopy(this.f81026Y, 0, this.offset, 0, 8);
    }
}
