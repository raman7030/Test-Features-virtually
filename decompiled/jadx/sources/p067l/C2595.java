package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.֡ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2595 extends AbstractC7290 {

    /* JADX INFO: renamed from: ᩳ */
    public static final long[][] f4292 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 4, 256);

    /* JADX INFO: renamed from: ܽ */
    public long f4293 = -1;

    public C2595() {
        this.f19050 = 8;
        this.f19049 = "CRC64";
    }

    static {
        int i = 0;
        while (i < 4) {
            for (int i2 = 0; i2 < 256; i2++) {
                long j = i == 0 ? i2 : f4292[i - 1][i2];
                for (int i3 = 0; i3 < 8; i3++) {
                    long j2 = j & 1;
                    j >>>= 1;
                    if (j2 == 1) {
                        j ^= -3932672073523589310L;
                    }
                }
                f4292[i][i2] = j;
            }
            i++;
        }
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final void mo3895(byte[] bArr, int i, int i2) {
        long[][] jArr;
        int i3 = i2 + i;
        int i4 = i3 - 3;
        while (true) {
            jArr = f4292;
            if (i >= i4) {
                break;
            }
            long j = this.f4293;
            int i5 = (int) j;
            this.f4293 = (((j >>> 32) ^ (jArr[3][(i5 & 255) ^ (bArr[i] & 255)] ^ jArr[2][((i5 >>> 8) & 255) ^ (bArr[i + 1] & 255)])) ^ jArr[1][((i5 >>> 16) & 255) ^ (bArr[i + 2] & 255)]) ^ jArr[0][((i5 >>> 24) & 255) ^ (bArr[i + 3] & 255)];
            i += 4;
        }
        while (i < i3) {
            long[] jArr2 = jArr[0];
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            long j2 = this.f4293;
            this.f4293 = (j2 >>> 8) ^ jArr2[i7 ^ (((int) j2) & 255)];
            i = i6;
        }
    }

    @Override // p067l.AbstractC7290
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo3896() {
        long j = ~this.f4293;
        byte[] bArr = {(byte) j, (byte) (j >>> 8), (byte) (j >>> 16), (byte) (j >>> 24), (byte) (j >>> 32), (byte) (j >>> 40), (byte) (j >>> 48), (byte) (j >>> 56)};
        this.f4293 = -1L;
        return bArr;
    }
}
