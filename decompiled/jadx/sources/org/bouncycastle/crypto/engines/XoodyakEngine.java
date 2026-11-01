package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.XoodyakDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class XoodyakEngine extends AEADBaseEngine {
    public static final int ModeHash = 1;
    public static final int ModeKeyed = 0;
    public static final int PhaseDown = 1;
    public static final int PhaseUp = 2;

    /* JADX INFO: renamed from: RC */
    public static final int[] f81095RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 416, 18};
    public static final int f_bPrime_1 = 47;

    /* JADX INFO: renamed from: K */
    public byte[] f81096K;
    public byte aadcd;
    public boolean encrypted;

    /* JADX INFO: renamed from: iv */
    public byte[] f81097iv;
    public int mode;
    public int phase;
    public final byte[] state;

    public XoodyakEngine() {
        this.algorithmName = "Xoodyak AEAD";
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.BlockSize = 24;
        this.AADBufferSize = 44;
        this.state = new byte[48];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void AbsorbAny(byte[] bArr, int i, int i2, int i3) {
        if (this.phase != 2) {
            m55399up(this.mode, this.state, 0);
        }
        int i4 = i3;
        while (true) {
            int iMin = Math.min(i2, this.AADBufferSize);
            down(this.mode, this.state, bArr, i, iMin, i4);
            this.phase = 1;
            i += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
    }

    public static void down(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        Bytes.xorTo(i3, bArr2, i2, bArr);
        bArr[i3] = (byte) (bArr[i3] ^ 1);
        int i5 = bArr[47];
        if (i == 1) {
            i4 &= 1;
        }
        bArr[47] = (byte) (i5 ^ i4);
    }

    public static void down(XoodyakDigest.Friend friend, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        down(i, bArr, bArr2, i2, i3, i4);
    }

    /* JADX INFO: renamed from: up */
    public static void m55399up(int i, byte[] bArr, int i2) {
        if (i != 1) {
            bArr[47] = (byte) (bArr[47] ^ i2);
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int i3 = 12;
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 28);
        int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 32);
        int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 36);
        int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 40);
        int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 44);
        int i4 = 0;
        while (i4 < i3) {
            int i5 = (iLittleEndianToInt ^ iLittleEndianToInt5) ^ iLittleEndianToInt9;
            int i6 = (iLittleEndianToInt2 ^ iLittleEndianToInt6) ^ iLittleEndianToInt10;
            int i7 = (iLittleEndianToInt3 ^ iLittleEndianToInt7) ^ iLittleEndianToInt11;
            int i8 = i4;
            int i9 = (iLittleEndianToInt4 ^ iLittleEndianToInt8) ^ iLittleEndianToInt12;
            int i10 = iLittleEndianToInt12;
            int i11 = iLittleEndianToInt8;
            int iRotateLeft = Integers.rotateLeft(i9, 5) ^ Integers.rotateLeft(i9, 14);
            int iRotateLeft2 = Integers.rotateLeft(i5, 5) ^ Integers.rotateLeft(i5, 14);
            int iRotateLeft3 = Integers.rotateLeft(i6, 5) ^ Integers.rotateLeft(i6, 14);
            int iRotateLeft4 = Integers.rotateLeft(i7, 14) ^ Integers.rotateLeft(i7, 5);
            int i12 = iLittleEndianToInt5 ^ iRotateLeft;
            int i13 = iLittleEndianToInt2 ^ iRotateLeft2;
            int i14 = iLittleEndianToInt6 ^ iRotateLeft2;
            int i15 = iRotateLeft2 ^ iLittleEndianToInt10;
            int i16 = iLittleEndianToInt3 ^ iRotateLeft3;
            int i17 = iLittleEndianToInt7 ^ iRotateLeft3;
            int i18 = iLittleEndianToInt4 ^ iRotateLeft4;
            int i19 = i11 ^ iRotateLeft4;
            int iRotateLeft5 = Integers.rotateLeft(iLittleEndianToInt9 ^ iRotateLeft, 11);
            int iRotateLeft6 = Integers.rotateLeft(i15, 11);
            int iRotateLeft7 = Integers.rotateLeft(iLittleEndianToInt11 ^ iRotateLeft3, 11);
            int iRotateLeft8 = Integers.rotateLeft(i10 ^ iRotateLeft4, 11);
            int i20 = (iLittleEndianToInt ^ iRotateLeft) ^ f81095RC[i8];
            int i21 = ((~i19) & iRotateLeft5) ^ i20;
            int i22 = ((~i12) & iRotateLeft6) ^ i13;
            int i23 = ((~i14) & iRotateLeft7) ^ i16;
            int i24 = ((~i17) & iRotateLeft8) ^ i18;
            int i25 = ((~iRotateLeft5) & i20) ^ i19;
            int i26 = ((~iRotateLeft6) & i13) ^ i12;
            int i27 = ((~iRotateLeft7) & i16) ^ i14;
            int i28 = ((~iRotateLeft8) & i18) ^ i17;
            int i29 = ((~i20) & i19) ^ iRotateLeft5;
            int i30 = ((~i13) & i12) ^ iRotateLeft6;
            int i31 = ((~i16) & i14) ^ iRotateLeft7;
            int i32 = iRotateLeft8 ^ ((~i18) & i17);
            iLittleEndianToInt5 = Integers.rotateLeft(i25, 1);
            iLittleEndianToInt6 = Integers.rotateLeft(i26, 1);
            iLittleEndianToInt7 = Integers.rotateLeft(i27, 1);
            iLittleEndianToInt8 = Integers.rotateLeft(i28, 1);
            iLittleEndianToInt9 = Integers.rotateLeft(i31, 8);
            iLittleEndianToInt10 = Integers.rotateLeft(i32, 8);
            iLittleEndianToInt11 = Integers.rotateLeft(i29, 8);
            iLittleEndianToInt12 = Integers.rotateLeft(i30, 8);
            i4 = i8 + 1;
            i3 = 12;
            iLittleEndianToInt = i21;
            iLittleEndianToInt2 = i22;
            iLittleEndianToInt3 = i23;
            iLittleEndianToInt4 = i24;
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr, 0);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr, 4);
        Pack.intToLittleEndian(iLittleEndianToInt3, bArr, 8);
        Pack.intToLittleEndian(iLittleEndianToInt4, bArr, 12);
        Pack.intToLittleEndian(iLittleEndianToInt5, bArr, 16);
        Pack.intToLittleEndian(iLittleEndianToInt6, bArr, 20);
        Pack.intToLittleEndian(iLittleEndianToInt7, bArr, 24);
        Pack.intToLittleEndian(iLittleEndianToInt8, bArr, 28);
        Pack.intToLittleEndian(iLittleEndianToInt9, bArr, 32);
        Pack.intToLittleEndian(iLittleEndianToInt10, bArr, 36);
        Pack.intToLittleEndian(iLittleEndianToInt11, bArr, 40);
        Pack.intToLittleEndian(iLittleEndianToInt12, bArr, 44);
    }

    /* JADX INFO: renamed from: up */
    public static void m55400up(XoodyakDigest.Friend friend, int i, byte[] bArr, int i2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        m55399up(i, bArr, i2);
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
        this.f81096K = bArr;
        this.f81097iv = bArr2;
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
        AbsorbAny(bArr, i, this.AADBufferSize, this.aadcd);
        this.aadcd = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        m55399up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i, bArr2, i2);
        down(this.mode, this.state, bArr2, i2, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        m55399up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i, bArr2, i2);
        down(this.mode, this.state, bArr, i, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
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
        AbsorbAny(this.m_aad, 0, this.m_aadPos, this.aadcd);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        if (this.m_bufPos != 0 || !this.encrypted) {
            m55399up(this.mode, this.state, this.encrypted ? 0 : 128);
            Bytes.xor(this.m_bufPos, this.state, this.m_buf, 0, bArr, i);
            if (this.forEncryption) {
                down(this.mode, this.state, this.m_buf, 0, this.m_bufPos, 0);
            } else {
                down(this.mode, this.state, bArr, i, this.m_bufPos, 0);
            }
            this.phase = 1;
        }
        m55399up(this.mode, this.state, 64);
        System.arraycopy(this.state, 0, this.mac, 0, this.MAC_SIZE);
        this.phase = 2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        Arrays.fill(this.state, (byte) 0);
        this.encrypted = false;
        this.phase = 2;
        this.aadcd = (byte) 3;
        byte[] bArr = this.f81096K;
        int length = bArr.length;
        int length2 = this.f81097iv.length;
        byte[] bArr2 = new byte[this.AADBufferSize];
        this.mode = 0;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.f81097iv, 0, bArr2, length, length2);
        int i = length + length2;
        bArr2[i] = (byte) length2;
        AbsorbAny(bArr2, 0, i + 1, 2);
    }
}
