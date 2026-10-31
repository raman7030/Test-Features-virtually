package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes.dex */
public class DefaultBufferedBlockCipher extends BufferedBlockCipher {
    public byte[] buf;
    public int bufOff;
    public BlockCipher cipher;
    public boolean forEncryption;
    public MultiBlockCipher mbCipher;
    public boolean partialBlockOkay;
    public boolean pgpCFB;

    public DefaultBufferedBlockCipher() {
    }

    public DefaultBufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.pgpCFB = z2;
        if (z2 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z = true;
        }
        this.partialBlockOkay = z;
    }

    private int processBuffer(byte[] bArr, int i) {
        this.bufOff = 0;
        MultiBlockCipher multiBlockCipher = this.mbCipher;
        if (multiBlockCipher == null) {
            return this.cipher.processBlock(this.buf, 0, bArr, i);
        }
        byte[] bArr2 = this.buf;
        return multiBlockCipher.processBlocks(bArr2, 0, bArr2.length / multiBlockCipher.getBlockSize(), bArr, i);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        int iProcessBlocks;
        int blockSize;
        try {
            int i2 = this.bufOff;
            if (i + i2 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i3 = 0;
            if (i2 != 0) {
                MultiBlockCipher multiBlockCipher = this.mbCipher;
                if (multiBlockCipher != null) {
                    int blockSize2 = i2 / multiBlockCipher.getBlockSize();
                    iProcessBlocks = this.mbCipher.processBlocks(this.buf, 0, blockSize2, bArr, i);
                    blockSize = blockSize2 * this.mbCipher.getBlockSize();
                } else {
                    iProcessBlocks = 0;
                    blockSize = 0;
                }
                if (this.bufOff == blockSize) {
                    i3 = iProcessBlocks;
                } else {
                    if (!this.partialBlockOkay) {
                        throw new DataLengthException("data not block size aligned");
                    }
                    BlockCipher blockCipher = this.cipher;
                    byte[] bArr2 = this.buf;
                    blockCipher.processBlock(bArr2, blockSize, bArr2, blockSize);
                    System.arraycopy(this.buf, blockSize, bArr, i + iProcessBlocks, this.bufOff - blockSize);
                    int i4 = (this.bufOff - blockSize) + iProcessBlocks;
                    this.bufOff = 0;
                    i3 = i4;
                }
            }
            reset();
            return i3;
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        if (!this.pgpCFB || !this.forEncryption) {
            return i + this.bufOff;
        }
        return this.cipher.getBlockSize() + 2 + i + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int length;
        int i2 = i + this.bufOff;
        if (this.pgpCFB && this.forEncryption) {
            length = (i2 % this.buf.length) - (this.cipher.getBlockSize() + 2);
        } else {
            int length2 = this.buf.length;
            length = i2 % length2;
        }
        return i2 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        reset();
        this.cipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b;
        if (i3 == bArr2.length) {
            return processBuffer(bArr, i);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        if (i7 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i7);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i8 = this.bufOff;
        int i9 = length - i8;
        int iProcessBuffer = 0;
        if (i7 > i9) {
            if (i8 != 0) {
                System.arraycopy(bArr, i6, bArr4, i8, i9);
                i6 += i9;
                i7 -= i9;
            }
            i5 = i7;
            if (bArr == bArr2) {
                byte[] bArr5 = new byte[i5];
                System.arraycopy(bArr2, i6, bArr5, 0, i5);
                bArr3 = bArr5;
                i4 = 0;
            } else {
                bArr3 = bArr;
                i4 = i6;
            }
            iProcessBuffer = this.bufOff != 0 ? processBuffer(bArr2, i3) : 0;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = (this.mbCipher.getMultiBlockSize() / blockSize) * (i5 / multiBlockCipher.getMultiBlockSize());
                if (multiBlockSize > 0) {
                    iProcessBuffer += this.mbCipher.processBlocks(bArr3, i4, multiBlockSize, bArr2, i3 + iProcessBuffer);
                    int i10 = multiBlockSize * blockSize;
                    i5 -= i10;
                    i4 += i10;
                }
            } else {
                while (i5 > this.buf.length) {
                    iProcessBuffer += this.cipher.processBlock(bArr3, i4, bArr2, i3 + iProcessBuffer);
                    i5 -= blockSize;
                    i4 += blockSize;
                }
            }
        } else {
            bArr3 = bArr;
            i4 = i6;
            i5 = i7;
        }
        System.arraycopy(bArr3, i4, this.buf, this.bufOff, i5);
        int i11 = this.bufOff + i5;
        this.bufOff = i11;
        return i11 == this.buf.length ? iProcessBuffer + processBuffer(bArr2, i3 + iProcessBuffer) : iProcessBuffer;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }
}
