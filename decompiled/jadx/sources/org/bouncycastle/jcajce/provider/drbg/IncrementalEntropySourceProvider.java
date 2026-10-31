package org.bouncycastle.jcajce.provider.drbg;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* JADX INFO: loaded from: classes.dex */
public class IncrementalEntropySourceProvider implements EntropySourceProvider {
    public final boolean predictionResistant;
    public final SecureRandom random;

    public IncrementalEntropySourceProvider(SecureRandom secureRandom, boolean z) {
        this.random = secureRandom;
        this.predictionResistant = z;
    }

    public static void sleep(long j) throws InterruptedException {
        if (j != 0) {
            Thread.sleep(j);
        }
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i) {
        return new IncrementalEntropySource(this, i) { // from class: org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySourceProvider.1
            public final int numBytes;
            public final /* synthetic */ IncrementalEntropySourceProvider this$0;
            public final /* synthetic */ int val$bitsRequired;

            {
                this.val$bitsRequired = i;
                this.this$0 = this;
                this.numBytes = (i + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.val$bitsRequired;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j) throws InterruptedException {
                int i2;
                int i3 = this.numBytes;
                byte[] bArr = new byte[i3];
                int i4 = 0;
                while (true) {
                    i2 = this.numBytes;
                    if (i4 >= i2 / 8) {
                        break;
                    }
                    IncrementalEntropySourceProvider.sleep(j);
                    byte[] bArrGenerateSeed = this.this$0.random.generateSeed(8);
                    System.arraycopy(bArrGenerateSeed, 0, bArr, i4 * 8, bArrGenerateSeed.length);
                    i4++;
                }
                int i5 = i2 - ((i2 / 8) * 8);
                if (i5 != 0) {
                    IncrementalEntropySourceProvider.sleep(j);
                    byte[] bArrGenerateSeed2 = this.this$0.random.generateSeed(i5);
                    System.arraycopy(bArrGenerateSeed2, 0, bArr, i3 - bArrGenerateSeed2.length, bArrGenerateSeed2.length);
                }
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return this.this$0.predictionResistant;
            }
        };
    }
}
