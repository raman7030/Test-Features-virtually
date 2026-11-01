package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class SipHash implements Mac {

    /* JADX INFO: renamed from: c */
    public final int f81150c;

    /* JADX INFO: renamed from: d */
    public final int f81151d;

    /* JADX INFO: renamed from: k0 */
    public long f81152k0;

    /* JADX INFO: renamed from: k1 */
    public long f81153k1;

    /* JADX INFO: renamed from: m */
    public long f81154m;

    /* JADX INFO: renamed from: v0 */
    public long f81155v0;

    /* JADX INFO: renamed from: v1 */
    public long f81156v1;

    /* JADX INFO: renamed from: v2 */
    public long f81157v2;

    /* JADX INFO: renamed from: v3 */
    public long f81158v3;
    public int wordCount;
    public int wordPos;

    public SipHash() {
        this.f81154m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f81150c = 2;
        this.f81151d = 4;
    }

    public SipHash(int i, int i2) {
        this.f81154m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f81150c = i;
        this.f81151d = i2;
    }

    public static long rotateLeft(long j, int i) {
        return (j >>> (-i)) | (j << i);
    }

    public void applySipRounds(int i) {
        long jRotateLeft = this.f81155v0;
        long jRotateLeft2 = this.f81156v1;
        long jRotateLeft3 = this.f81157v2;
        long jRotateLeft4 = this.f81158v3;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jRotateLeft + jRotateLeft2;
            long j2 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j2;
            long j3 = j2 + jRotateLeft5;
            jRotateLeft = rotateLeft(j, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j3;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j3, 32);
        }
        this.f81155v0 = jRotateLeft;
        this.f81156v1 = jRotateLeft2;
        this.f81157v2 = jRotateLeft3;
        this.f81158v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        Pack.longToLittleEndian(doFinal(), bArr, i);
        return 8;
    }

    public long doFinal() {
        long j = this.f81154m;
        int i = this.wordPos;
        this.f81154m = ((j >>> ((7 - i) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i)) & 255) << 56);
        processMessageWord();
        this.f81157v2 ^= 255;
        applySipRounds(this.f81151d);
        long j2 = ((this.f81155v0 ^ this.f81156v1) ^ this.f81157v2) ^ this.f81158v3;
        reset();
        return j2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f81150c + "-" + this.f81151d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f81152k0 = Pack.littleEndianToLong(key, 0);
        this.f81153k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f81158v3 ^= this.f81154m;
        applySipRounds(this.f81150c);
        this.f81155v0 ^= this.f81154m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j = this.f81152k0;
        this.f81155v0 = 8317987319222330741L ^ j;
        long j2 = this.f81153k1;
        this.f81156v1 = 7237128888997146477L ^ j2;
        this.f81157v2 = j ^ 7816392313619706465L;
        this.f81158v3 = 8387220255154660723L ^ j2;
        this.f81154m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.f81154m = (this.f81154m >>> 8) | ((((long) b) & 255) << 56);
        int i = this.wordPos + 1;
        this.wordPos = i;
        if (i == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        int i3 = i2 & (-8);
        int i4 = this.wordPos;
        if (i4 == 0) {
            int i5 = 0;
            while (i5 < i3) {
                this.f81154m = Pack.littleEndianToLong(bArr, i + i5);
                processMessageWord();
                i5 += 8;
            }
            while (i5 < i2) {
                long j = this.f81154m >>> 8;
                this.f81154m = j;
                this.f81154m = j | ((((long) bArr[i + i5]) & 255) << 56);
                i5++;
            }
            this.wordPos = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i + i7);
            this.f81154m = (jLittleEndianToLong << i6) | (this.f81154m >>> (-i6));
            processMessageWord();
            this.f81154m = jLittleEndianToLong;
            i7 += 8;
        }
        while (i7 < i2) {
            long j2 = this.f81154m >>> 8;
            this.f81154m = j2;
            this.f81154m = j2 | ((((long) bArr[i + i7]) & 255) << 56);
            int i8 = this.wordPos + 1;
            this.wordPos = i8;
            if (i8 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i7++;
        }
    }
}
