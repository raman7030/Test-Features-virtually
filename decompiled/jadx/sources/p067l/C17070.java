package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 01RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17070 extends AbstractC9088 {

    /* JADX INFO: renamed from: ۜ */
    public static final int[] f50471 = new int[128];

    /* JADX INFO: renamed from: ᩻ */
    public static final /* synthetic */ int f50472 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f50473;

    /* JADX INFO: renamed from: ۧ */
    public int f50474;

    /* JADX INFO: renamed from: ܳ */
    public int f50475;

    /* JADX INFO: renamed from: ܽ */
    public byte f50476;

    /* JADX INFO: renamed from: ܿ */
    public long f50477;

    /* JADX INFO: renamed from: ᩳ */
    public long f50478;

    public C17070(C6422 c6422) {
        this.f50473 = c6422.mo7199(65536);
        m38719();
    }

    static {
        for (int i = 8; i < 2048; i += 16) {
            int i2 = 0;
            int i3 = i;
            for (int i4 = 0; i4 < 4; i4++) {
                i3 *= i3;
                i2 <<= 1;
                while (((-65536) & i3) != 0) {
                    i3 >>>= 1;
                    i2++;
                }
            }
            f50471[i >> 4] = 161 - i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38714(C6422 c6422) {
        c6422.mo7197(this.f50473);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m38717() {
        return this.f50474 + ((int) this.f50478) + 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38713(OutputStream outputStream) throws IOException {
        outputStream.write(this.f50473, 0, this.f50474);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38719() {
        this.f50477 = 0L;
        this.f50475 = -1;
        this.f50476 = (byte) 0;
        this.f50478 = 1L;
        this.f50474 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38712() {
        for (int i = 0; i < 5; i++) {
            try {
                m38711();
            } catch (IOException unused) {
                throw new Error();
            }
        }
        return this.f50474;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m38711() {
        long j = this.f50477;
        int i = (int) (j >>> 32);
        if (i != 0 || j < 4278190080L) {
            byte b = this.f50476;
            while (true) {
                int i2 = this.f50474;
                this.f50474 = i2 + 1;
                this.f50473[i2] = (byte) (b + i);
                long j2 = this.f50478 - 1;
                this.f50478 = j2;
                if (j2 == 0) {
                    break;
                } else {
                    b = 255;
                }
            }
            this.f50476 = (byte) (this.f50477 >>> 24);
        }
        this.f50478++;
        this.f50477 = (this.f50477 & 16777215) << 8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38716(short[] sArr, int i, int i2) {
        short s = sArr[i];
        int i3 = this.f50475;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.f50475 = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.f50477 += ((long) i4) & 4294967295L;
            this.f50475 = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.f50475;
        if (((-16777216) & i5) == 0) {
            this.f50475 = i5 << 8;
            m38711();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m38710(int i, int i2) {
        return f50471[(i ^ ((-i2) & 2047)) >>> 4];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38715(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            m38716(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m38709(short[] sArr, int i) {
        int length = i | sArr.length;
        int iM38710 = 0;
        do {
            int i2 = length & 1;
            length >>>= 1;
            iM38710 += m38710(sArr[length], i2);
        } while (length != 1);
        return iM38710;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38718(int i, int i2) {
        do {
            int i3 = this.f50475 >>> 1;
            this.f50475 = i3;
            i2--;
            this.f50477 += (long) ((0 - ((i >>> i2) & 1)) & i3);
            if (((-16777216) & i3) == 0) {
                this.f50475 = i3 << 8;
                m38711();
            }
        } while (i2 != 0);
    }
}
