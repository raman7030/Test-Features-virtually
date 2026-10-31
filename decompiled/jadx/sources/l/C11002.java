package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11002 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f33094;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char[] f33095;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f33096;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33097;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33098;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f33099;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f33100;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m27307(int i, int i2, boolean z) {
        return (((((long) i) * (z ? 1L : 2L)) + 23) & (-8)) + 64 + (((((long) i2) * 4) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27321() {
        return this.f33098;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m27320() {
        return this.f33100;
    }

    public C11002(int i, char[] cArr, int i2, int i3, int i4, boolean z) {
        int i5;
        this.f33096 = new int[i4];
        int i6 = 0;
        if (z) {
            this.f33094 = new byte[i];
            i5 = 0;
            while (i6 < i3) {
                char c = cArr[i2 + i6];
                if (c > 255) {
                    throw new IllegalArgumentException("Invalid page character representation");
                }
                this.f33094[i6] = (byte) c;
                if (c == '\n') {
                    this.f33096[i5] = i6;
                    i5++;
                }
                i6++;
            }
        } else {
            char[] cArr2 = new char[i];
            this.f33095 = cArr2;
            System.arraycopy(cArr, i2, cArr2, 0, i3);
            i5 = 0;
            while (i6 < i3) {
                if (cArr[i2 + i6] == '\n') {
                    this.f33096[i5] = i6;
                    i5++;
                }
                i6++;
            }
        }
        if (i5 != i4) {
            throw new IllegalArgumentException("Invalid page newline count");
        }
        this.f33098 = i3;
        this.f33100 = i4;
        this.f33099 = i3;
        this.f33097 = i;
    }

    public C11002(int i, int i2, int i3, boolean z) {
        this.f33098 = i2;
        this.f33100 = i3;
        this.f33099 = i2;
        this.f33097 = i;
        if (z) {
            this.f33094 = new byte[i];
        } else {
            this.f33095 = new char[i];
        }
        this.f33096 = new int[i3];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27311(byte[] bArr, int i, int i2, int i3, int i4) throws IOException {
        int i5 = i + i2;
        byte[] bArr2 = this.f33094;
        if (bArr2 != null) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            while (i < i5) {
                if (bArr[i] == 10) {
                    if (i4 >= this.f33100) {
                        throw new IOException("Invalid page newline count");
                    }
                    this.f33096[i4] = i3;
                    i4++;
                }
                i++;
                i3++;
            }
            return i4;
        }
        while (i < i5) {
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            i += 2;
            char c = (char) (((bArr[i6] & 255) << 8) | i7);
            this.f33095[i3] = c;
            if (c == '\n') {
                if (i4 >= this.f33100) {
                    throw new IOException("Invalid page newline count");
                }
                this.f33096[i4] = i3;
                i4++;
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27314(boolean z, int i, byte[] bArr, int i2, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f33099) - i);
        m27308(z, i, bArr, iMax, i3);
        int iMax2 = Math.max(i, this.f33099);
        if (i2 > iMax2) {
            m27308(z, (this.f33097 + iMax2) - this.f33099, bArr, i2 - iMax2, (iMax * (z ? 1 : 2)) + i3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m27308(boolean z, int i, byte[] bArr, int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        int i4 = i + i2;
        if (z) {
            byte[] bArr2 = this.f33094;
            if (bArr2 != null) {
                System.arraycopy(bArr2, i, bArr, i3, i2);
                return;
            }
            while (i < i4) {
                bArr[i3] = (byte) this.f33095[i];
                i++;
                i3++;
            }
            return;
        }
        if (this.f33095 == null) {
            while (i < i4) {
                int i5 = i3 + 1;
                bArr[i3] = this.f33094[i];
                i3 += 2;
                bArr[i5] = 0;
                i++;
            }
            return;
        }
        while (i < i4) {
            char c = this.f33095[i];
            int i6 = i3 + 1;
            bArr[i3] = (byte) c;
            i3 += 2;
            bArr[i6] = (byte) (c >>> '\b');
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m27312() {
        return m27307(m27315(), this.f33100, m27319());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27315() {
        byte[] bArr = this.f33094;
        return bArr != null ? bArr.length : this.f33095.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m27319() {
        return this.f33094 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m27310(int i) {
        int i2 = this.f33099;
        if (i >= i2) {
            i = (i + this.f33097) - i2;
        }
        byte[] bArr = this.f33094;
        return bArr != null ? (char) (bArr[i] & 255) : this.f33095[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27313(int i, int i2, char[] cArr, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f33099) - i);
        m27309(i, iMax, cArr, i3);
        int iMax2 = Math.max(i, this.f33099);
        int i4 = i2 - iMax2;
        if (i4 > 0) {
            m27309((iMax2 + this.f33097) - this.f33099, i4, cArr, i3 + iMax);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m27309(int i, int i2, char[] cArr, int i3) {
        if (this.f33094 == null) {
            System.arraycopy(this.f33095, i, cArr, i3, i2);
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i3 + i4] = (char) (this.f33094[i + i4] & 255);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11002 m27317(int i, int i2, char[] cArr, int i3) {
        boolean z;
        if (this.f33094 == null) {
            z = false;
            break;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                z = false;
                break;
            }
            if (cArr[i4] > 255) {
                z = true;
                break;
            }
            i4++;
        }
        C11002 c11002 = new C11002();
        c11002.f33098 = this.f33098;
        c11002.f33099 = this.f33099;
        c11002.f33097 = this.f33097;
        if (z || this.f33095 != null) {
            char[] cArr2 = new char[m27315()];
            c11002.f33095 = cArr2;
            m27313(0, c11002.f33099, cArr2, 0);
            m27313(c11002.f33099, c11002.f33098, c11002.f33095, c11002.f33097);
        } else {
            c11002.f33094 = (byte[]) this.f33094.clone();
        }
        c11002.f33100 = this.f33100;
        c11002.f33096 = this.f33096;
        int iM27316 = c11002.m27316(i);
        int iM27317 = c11002.m27316(i2);
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (cArr[i6] == '\n') {
                i5++;
            }
        }
        int i7 = (c11002.f33100 - (iM27317 - iM27316)) + i5;
        int[] iArr = new int[i7];
        System.arraycopy(c11002.f33096, 0, iArr, 0, iM27316);
        int i8 = iM27316;
        for (int i9 = 0; i9 < i3; i9++) {
            if (cArr[i9] == '\n') {
                iArr[i8] = i + i9;
                i8++;
            }
        }
        int i10 = i2 - i;
        int i11 = i3 - i10;
        int i12 = iM27316 + i5;
        while (iM27317 < c11002.f33100) {
            iArr[i12] = c11002.f33096[iM27317] + i11;
            iM27317++;
            i12++;
        }
        char[] cArr3 = c11002.f33094;
        if (cArr3 == null) {
            cArr3 = c11002.f33095;
        }
        int i13 = c11002.f33099;
        if (i < i13) {
            int i14 = i13 - i;
            System.arraycopy(cArr3, i, cArr3, c11002.f33097 - i14, i14);
            c11002.f33097 -= i14;
        } else if (i > i13) {
            int i15 = i - i13;
            System.arraycopy(cArr3, c11002.f33097, cArr3, i13, i15);
            c11002.f33097 += i15;
        }
        c11002.f33099 = i;
        c11002.f33097 += i10;
        if (c11002.f33094 != null) {
            for (int i16 = 0; i16 < i3; i16++) {
                c11002.f33094[c11002.f33099 + i16] = (byte) cArr[i16];
            }
        } else {
            System.arraycopy(cArr, 0, c11002.f33095, i, i3);
        }
        c11002.f33099 += i3;
        c11002.f33098 += i11;
        c11002.f33096 = iArr;
        c11002.f33100 = i7;
        return c11002;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27316(int i) {
        int i2 = this.f33100;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f33096[i4] < i) {
                i3 = i4 + 1;
            } else {
                i2 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27318(int i) {
        return this.f33096[i];
    }
}
