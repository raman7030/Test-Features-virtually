package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.engines.SparkleEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SparkleDigest extends BufferBaseDigest {
    public static final int RATE_WORDS = 4;
    public final int SPARKLE_STEPS_BIG;
    public final int SPARKLE_STEPS_SLIM;
    public final int STATE_WORDS;
    public final int[] state;

    /* JADX INFO: loaded from: classes.dex */
    public class Friend {
        public static final Friend INSTANCE = new Friend();
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum SparkleParameters {
        ESCH256,
        ESCH384
    }

    public SparkleDigest(SparkleParameters sparkleParameters) {
        super(BufferBaseDigest.ProcessingBufferType.Buffered, 16);
        int iOrdinal = sparkleParameters.ordinal();
        if (iOrdinal == 0) {
            this.algorithmName = "ESCH-256";
            this.DigestSize = 32;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.STATE_WORDS = 12;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
            }
            this.algorithmName = "ESCH-384";
            this.DigestSize = 48;
            this.SPARKLE_STEPS_SLIM = 8;
            this.SPARKLE_STEPS_BIG = 12;
            this.STATE_WORDS = 16;
        }
        this.state = new int[this.STATE_WORDS];
    }

    public static int ELL(int i) {
        return (i & 65535) ^ Integers.rotateRight(i, 16);
    }

    private void processBlock(byte[] bArr, int i, int i2) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int iELL = ELL(iLittleEndianToInt ^ iLittleEndianToInt3);
        int iELL2 = ELL(iLittleEndianToInt2 ^ iLittleEndianToInt4);
        int[] iArr = this.state;
        iArr[0] = (iLittleEndianToInt ^ iELL2) ^ iArr[0];
        iArr[1] = (iLittleEndianToInt2 ^ iELL) ^ iArr[1];
        iArr[2] = iArr[2] ^ (iLittleEndianToInt3 ^ iELL2);
        iArr[3] = (iLittleEndianToInt4 ^ iELL) ^ iArr[3];
        iArr[4] = iArr[4] ^ iELL2;
        iArr[5] = iArr[5] ^ iELL;
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, i2);
            return;
        }
        iArr[6] = iArr[6] ^ iELL2;
        iArr[7] = iELL ^ iArr[7];
        SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, i2);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        int i2 = this.m_bufPos;
        int i3 = this.BlockSize;
        if (i2 < i3) {
            int[] iArr = this.state;
            int i4 = (this.STATE_WORDS >> 1) - 1;
            iArr[i4] = iArr[i4] ^ 16777216;
            byte[] bArr2 = this.m_buf;
            int i5 = i2 + 1;
            this.m_bufPos = i5;
            bArr2[i2] = GCMSIVBlockCipher.MASK;
            Arrays.fill(bArr2, i5, i3, (byte) 0);
        } else {
            int[] iArr2 = this.state;
            int i6 = (this.STATE_WORDS >> 1) - 1;
            iArr2[i6] = iArr2[i6] ^ 33554432;
        }
        processBlock(this.m_buf, 0, this.SPARKLE_STEPS_BIG);
        Pack.intToLittleEndian(this.state, 0, 4, bArr, i);
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 16);
        } else {
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 16);
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 32);
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        processBlock(bArr, i, this.SPARKLE_STEPS_SLIM);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, 0);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b) {
        super.update(b);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
    }
}
