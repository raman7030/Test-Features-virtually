package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12825 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f36088;

    /* JADX INFO: renamed from: ۧ */
    public char[] f36089;

    /* JADX INFO: renamed from: ܳ */
    public int[] f36090;

    /* JADX INFO: renamed from: ܽ */
    public int f36091;

    /* JADX INFO: renamed from: ܿ */
    public int f36092;

    /* JADX INFO: renamed from: ᩳ */
    public int f36093;

    /* JADX INFO: renamed from: ᩻ */
    public int f36094;

    /* JADX INFO: renamed from: ֫ */
    public static long m29369(int i, int i2, boolean z) {
        return (((((long) i) * (z ? 1L : 2L)) + 23) & (-8)) + 64 + (((((long) i2) * 4) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29383() {
        return this.f36092;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m29382() {
        return this.f36094;
    }

    public C12825(int i, char[] cArr, int i2, int i3, int i4, boolean z) {
        int i5;
        this.f36090 = new int[i4];
        int i6 = 0;
        if (z) {
            this.f36088 = new byte[i];
            i5 = 0;
            while (i6 < i3) {
                char c = cArr[i2 + i6];
                if (c > 255) {
                    throw new IllegalArgumentException("Invalid page character representation");
                }
                this.f36088[i6] = (byte) c;
                if (c == '\n') {
                    this.f36090[i5] = i6;
                    i5++;
                }
                i6++;
            }
        } else {
            char[] cArr2 = new char[i];
            this.f36089 = cArr2;
            System.arraycopy(cArr, i2, cArr2, 0, i3);
            i5 = 0;
            while (i6 < i3) {
                if (cArr[i2 + i6] == '\n') {
                    this.f36090[i5] = i6;
                    i5++;
                }
                i6++;
            }
        }
        if (i5 != i4) {
            throw new IllegalArgumentException("Invalid page newline count");
        }
        this.f36092 = i3;
        this.f36094 = i4;
        this.f36093 = i3;
        this.f36091 = i;
    }

    public C12825(int i, int i2, int i3, boolean z) {
        this.f36092 = i2;
        this.f36094 = i3;
        this.f36093 = i2;
        this.f36091 = i;
        if (z) {
            this.f36088 = new byte[i];
        } else {
            this.f36089 = new char[i];
        }
        this.f36090 = new int[i3];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29373(byte[] bArr, int i, int i2, int i3, int i4) throws IOException {
        int i5 = i + i2;
        byte[] bArr2 = this.f36088;
        if (bArr2 != null) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            while (i < i5) {
                if (bArr[i] == 10) {
                    if (i4 >= this.f36094) {
                        throw new IOException("Invalid page newline count");
                    }
                    this.f36090[i4] = i3;
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
            this.f36089[i3] = c;
            if (c == '\n') {
                if (i4 >= this.f36094) {
                    throw new IOException("Invalid page newline count");
                }
                this.f36090[i4] = i3;
                i4++;
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29376(boolean z, int i, byte[] bArr, int i2, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f36093) - i);
        m29370(z, i, bArr, iMax, i3);
        int iMax2 = Math.max(i, this.f36093);
        if (i2 > iMax2) {
            m29370(z, (this.f36091 + iMax2) - this.f36093, bArr, i2 - iMax2, (iMax * (z ? 1 : 2)) + i3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m29370(boolean z, int i, byte[] bArr, int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        int i4 = i + i2;
        if (z) {
            byte[] bArr2 = this.f36088;
            if (bArr2 != null) {
                System.arraycopy(bArr2, i, bArr, i3, i2);
                return;
            }
            while (i < i4) {
                bArr[i3] = (byte) this.f36089[i];
                i++;
                i3++;
            }
            return;
        }
        if (this.f36089 == null) {
            while (i < i4) {
                int i5 = i3 + 1;
                bArr[i3] = this.f36088[i];
                i3 += 2;
                bArr[i5] = 0;
                i++;
            }
            return;
        }
        while (i < i4) {
            char c = this.f36089[i];
            int i6 = i3 + 1;
            bArr[i3] = (byte) c;
            i3 += 2;
            bArr[i6] = (byte) (c >>> '\b');
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m29374() {
        return m29369(m29377(), this.f36094, m29381());
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29377() {
        byte[] bArr = this.f36088;
        return bArr != null ? bArr.length : this.f36089.length;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m29381() {
        return this.f36088 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m29372(int i) {
        int i2 = this.f36093;
        if (i >= i2) {
            i = (i + this.f36091) - i2;
        }
        byte[] bArr = this.f36088;
        return bArr != null ? (char) (bArr[i] & 255) : this.f36089[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29375(int i, int i2, char[] cArr, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f36093) - i);
        m29371(i, iMax, cArr, i3);
        int iMax2 = Math.max(i, this.f36093);
        int i4 = i2 - iMax2;
        if (i4 > 0) {
            m29371((iMax2 + this.f36091) - this.f36093, i4, cArr, i3 + iMax);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m29371(int i, int i2, char[] cArr, int i3) {
        if (this.f36088 == null) {
            System.arraycopy(this.f36089, i, cArr, i3, i2);
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i3 + i4] = (char) (this.f36088[i + i4] & 255);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12825 m29379(int i, int i2, char[] cArr, int i3) {
        boolean z;
        if (this.f36088 == null) {
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
        C12825 c12825 = new C12825();
        c12825.f36092 = this.f36092;
        c12825.f36093 = this.f36093;
        c12825.f36091 = this.f36091;
        if (z || this.f36089 != null) {
            char[] cArr2 = new char[m29377()];
            c12825.f36089 = cArr2;
            m29375(0, c12825.f36093, cArr2, 0);
            m29375(c12825.f36093, c12825.f36092, c12825.f36089, c12825.f36091);
        } else {
            c12825.f36088 = (byte[]) this.f36088.clone();
        }
        c12825.f36094 = this.f36094;
        c12825.f36090 = this.f36090;
        int iM29378 = c12825.m29378(i);
        int iM29379 = c12825.m29378(i2);
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (cArr[i6] == '\n') {
                i5++;
            }
        }
        int i7 = (c12825.f36094 - (iM29379 - iM29378)) + i5;
        int[] iArr = new int[i7];
        System.arraycopy(c12825.f36090, 0, iArr, 0, iM29378);
        int i8 = iM29378;
        for (int i9 = 0; i9 < i3; i9++) {
            if (cArr[i9] == '\n') {
                iArr[i8] = i + i9;
                i8++;
            }
        }
        int i10 = i2 - i;
        int i11 = i3 - i10;
        int i12 = iM29378 + i5;
        while (iM29379 < c12825.f36094) {
            iArr[i12] = c12825.f36090[iM29379] + i11;
            iM29379++;
            i12++;
        }
        char[] cArr3 = c12825.f36088;
        if (cArr3 == null) {
            cArr3 = c12825.f36089;
        }
        int i13 = c12825.f36093;
        if (i < i13) {
            int i14 = i13 - i;
            System.arraycopy(cArr3, i, cArr3, c12825.f36091 - i14, i14);
            c12825.f36091 -= i14;
        } else if (i > i13) {
            int i15 = i - i13;
            System.arraycopy(cArr3, c12825.f36091, cArr3, i13, i15);
            c12825.f36091 += i15;
        }
        c12825.f36093 = i;
        c12825.f36091 += i10;
        if (c12825.f36088 != null) {
            for (int i16 = 0; i16 < i3; i16++) {
                c12825.f36088[c12825.f36093 + i16] = (byte) cArr[i16];
            }
        } else {
            System.arraycopy(cArr, 0, c12825.f36089, i, i3);
        }
        c12825.f36093 += i3;
        c12825.f36092 += i11;
        c12825.f36090 = iArr;
        c12825.f36094 = i7;
        return c12825;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29378(int i) {
        int i2 = this.f36094;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f36090[i4] < i) {
                i3 = i4 + 1;
            } else {
                i2 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m29380(int i) {
        return this.f36090[i];
    }
}
