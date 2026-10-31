package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.֡ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SF */
/* JADX INFO: loaded from: classes2.dex */
public final class C0239 extends AbstractC5179 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long[][] f1514 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 4, 256);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f1515 = -1;

    public C0239() {
        this.f16209 = 8;
        this.f16208 = "CRC64";
    }

    static {
        int i = 0;
        while (i < 4) {
            for (int i2 = 0; i2 < 256; i2++) {
                long j = i == 0 ? i2 : f1514[i - 1][i2];
                for (int i3 = 0; i3 < 8; i3++) {
                    long j2 = j & 1;
                    j >>>= 1;
                    if (j2 == 1) {
                        j ^= -3932672073523589310L;
                    }
                }
                f1514[i][i2] = j;
            }
            i++;
        }
    }

    @Override // l.AbstractC5179
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1497(byte[] bArr, int i, int i2) {
        long[][] jArr;
        int i3 = i2 + i;
        int i4 = i3 - 3;
        while (true) {
            jArr = f1514;
            if (i >= i4) {
                break;
            }
            long j = this.f1515;
            int i5 = (int) j;
            this.f1515 = (((j >>> 32) ^ (jArr[3][(i5 & 255) ^ (bArr[i] & 255)] ^ jArr[2][((i5 >>> 8) & 255) ^ (bArr[i + 1] & 255)])) ^ jArr[1][((i5 >>> 16) & 255) ^ (bArr[i + 2] & 255)]) ^ jArr[0][((i5 >>> 24) & 255) ^ (bArr[i + 3] & 255)];
            i += 4;
        }
        while (i < i3) {
            long[] jArr2 = jArr[0];
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            long j2 = this.f1515;
            this.f1515 = (j2 >>> 8) ^ jArr2[i7 ^ (((int) j2) & 255)];
            i = i6;
        }
    }

    @Override // l.AbstractC5179
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo1498() {
        long j = ~this.f1515;
        byte[] bArr = {(byte) j, (byte) (j >>> 8), (byte) (j >>> 16), (byte) (j >>> 24), (byte) (j >>> 32), (byte) (j >>> 40), (byte) (j >>> 48), (byte) (j >>> 56)};
        this.f1515 = -1L;
        return bArr;
    }
}
