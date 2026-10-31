package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 01RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15469 extends AbstractC7070 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f47340 = new int[128];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47341 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f47342;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f47343;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f47344;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte f47345;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f47346;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f47347;

    public C15469(C4265 c4265) {
        this.f47342 = c4265.mo4956(65536);
        m36560();
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
            f47340[i >> 4] = 161 - i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36555(C4265 c4265) {
        c4265.mo4954(this.f47342);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36558() {
        return this.f47343 + ((int) this.f47347) + 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36554(OutputStream outputStream) throws IOException {
        outputStream.write(this.f47342, 0, this.f47343);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36560() {
        this.f47346 = 0L;
        this.f47344 = -1;
        this.f47345 = (byte) 0;
        this.f47347 = 1L;
        this.f47343 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36553() {
        for (int i = 0; i < 5; i++) {
            try {
                m36552();
            } catch (IOException unused) {
                throw new Error();
            }
        }
        return this.f47343;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m36552() {
        long j = this.f47346;
        int i = (int) (j >>> 32);
        if (i != 0 || j < 4278190080L) {
            byte b = this.f47345;
            while (true) {
                int i2 = this.f47343;
                this.f47343 = i2 + 1;
                this.f47342[i2] = (byte) (b + i);
                long j2 = this.f47347 - 1;
                this.f47347 = j2;
                if (j2 == 0) {
                    break;
                } else {
                    b = 255;
                }
            }
            this.f47345 = (byte) (this.f47346 >>> 24);
        }
        this.f47347++;
        this.f47346 = (this.f47346 & 16777215) << 8;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36557(short[] sArr, int i, int i2) {
        short s = sArr[i];
        int i3 = this.f47344;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.f47344 = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.f47346 += ((long) i4) & 4294967295L;
            this.f47344 = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.f47344;
        if (((-16777216) & i5) == 0) {
            this.f47344 = i5 << 8;
            m36552();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m36551(int i, int i2) {
        return f47340[(i ^ ((-i2) & 2047)) >>> 4];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36556(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            m36557(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m36550(short[] sArr, int i) {
        int length = i | sArr.length;
        int iM36551 = 0;
        do {
            int i2 = length & 1;
            length >>>= 1;
            iM36551 += m36551(sArr[length], i2);
        } while (length != 1);
        return iM36551;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36559(int i, int i2) {
        do {
            int i3 = this.f47344 >>> 1;
            this.f47344 = i3;
            i2--;
            this.f47346 += (long) ((0 - ((i >>> i2) & 1)) & i3);
            if (((-16777216) & i3) == 0) {
                this.f47344 = i3 << 8;
                m36552();
            }
        } while (i2 != 0);
    }
}
