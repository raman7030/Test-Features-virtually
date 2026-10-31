package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.BlockCipher;

/* JADX INFO: loaded from: classes.dex */
public class X931RNG {
    public static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    public static final long BLOCK128_RESEED_MAX = 8388608;
    public static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    public static final long BLOCK64_RESEED_MAX = 32768;
    public final byte[] DT;
    public final byte[] I;
    public final byte[] R;
    public byte[] V;
    public final BlockCipher engine;
    public final EntropySource entropySource;
    public long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.I = new byte[blockCipher.getBlockSize()];
        this.R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        byte b;
        int length = bArr.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b = (byte) (bArr[length] + 1);
            bArr[length] = b;
        } while (b == 0);
    }

    public static boolean isTooLarge(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    public int generate(byte[] bArr, boolean z) {
        int length = this.R.length;
        long j = this.reseedCounter;
        if (length == 8) {
            if (j > BLOCK64_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z || this.V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length2 = bArr.length / this.R.length;
        for (int i = 0; i < length2; i++) {
            this.engine.processBlock(this.DT, 0, this.I, 0);
            process(this.R, this.I, this.V);
            process(this.V, this.R, this.I);
            byte[] bArr2 = this.R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i, bArr2.length);
            increment(this.DT);
        }
        int length3 = bArr.length - (this.R.length * length2);
        if (length3 > 0) {
            this.engine.processBlock(this.DT, 0, this.I, 0);
            process(this.R, this.I, this.V);
            process(this.V, this.R, this.I);
            byte[] bArr3 = this.R;
            System.arraycopy(bArr3, 0, bArr, length2 * bArr3.length, length3);
            increment(this.DT);
        }
        this.reseedCounter++;
        return bArr.length * 8;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.V = entropy;
        if (entropy.length != this.engine.getBlockSize()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.reseedCounter = 1L;
    }
}
