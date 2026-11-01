package p067l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.֨᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes2.dex */
public final class C3644 {

    /* JADX INFO: renamed from: ᩴ */
    public static final C3644 f7643 = new C3644();

    /* JADX INFO: renamed from: ֫ */
    public int f7644;

    /* JADX INFO: renamed from: ۖ */
    public short f7645;

    /* JADX INFO: renamed from: ۘ */
    public short f7646;

    /* JADX INFO: renamed from: ۜ */
    public C3644 f7647;

    /* JADX INFO: renamed from: ۡ */
    public C4986 f7648;

    /* JADX INFO: renamed from: ۢ */
    public int[] f7649;

    /* JADX INFO: renamed from: ۧ */
    public short f7650;

    /* JADX INFO: renamed from: ܳ */
    public short f7651;

    /* JADX INFO: renamed from: ܺ */
    public short f7652;

    /* JADX INFO: renamed from: ܽ */
    public int[] f7653;

    /* JADX INFO: renamed from: ܿ */
    public C23329 f7654;

    /* JADX INFO: renamed from: ᩳ */
    public C21080 f7655;

    /* JADX INFO: renamed from: ᩷ */
    public C3644 f7656;

    /* JADX INFO: renamed from: ᩻ */
    public short f7657;

    /* JADX INFO: renamed from: ֫ */
    public final C3644 m6912() {
        C21080 c21080 = this.f7655;
        return c21080 == null ? this : c21080.f66231;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6913(int i) {
        short s = this.f7650;
        if ((s & 128) == 0) {
            this.f7650 = (short) (s | 128);
            this.f7657 = (short) i;
            return;
        }
        if (this.f7649 == null) {
            this.f7649 = new int[4];
        }
        int[] iArr = this.f7649;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f7649 = iArr2;
        }
        this.f7649[i2] = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6915(AbstractC17054 abstractC17054, boolean z) {
        abstractC17054.mo30328(this);
        if (!z || (this.f7650 & 128) == 0) {
            return;
        }
        abstractC17054.mo30336(this.f7657 & HPKE.aead_EXPORT_ONLY, this);
        if (this.f7649 == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.f7649;
            if (i > iArr[0]) {
                return;
            }
            abstractC17054.mo30336(iArr[i], this);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6917(C19738 c19738, int i, boolean z) {
        if ((this.f7650 & 4) != 0) {
            if (z) {
                c19738.m44875(this.f7644 - i);
                return;
            } else {
                c19738.m44877(this.f7644 - i);
                return;
            }
        }
        if (z) {
            m6910(i, 536870912, c19738.f60036);
            c19738.m44875(-1);
        } else {
            m6910(i, 268435456, c19738.f60036);
            c19738.m44877(-1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6916(C19738 c19738) {
        if ((this.f7650 & 4) == 0) {
            m6910(0, 805306368, c19738.f60036);
        }
        c19738.m44877(this.f7644);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6910(int i, int i2, int i3) {
        if (this.f7653 == null) {
            this.f7653 = new int[6];
        }
        int[] iArr = this.f7653;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f7653 = iArr2;
        }
        int[] iArr3 = this.f7653;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6919(byte[] bArr, C19738 c19738, int i) {
        this.f7650 = (short) (this.f7650 | 4);
        this.f7644 = i;
        int[] iArr = this.f7653;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f7653;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            int i7 = i4 & (-268435456);
            if (i7 == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i8 = bArr[i3] & 255;
                    if (i8 < 198) {
                        bArr[i3] = (byte) (i8 + 49);
                    } else {
                        bArr[i3] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else if (i7 == 536870912) {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            } else {
                byte[] bArr2 = c19738.f60035;
                bArr2[i6] = (byte) (i >>> 8);
                bArr2[i6 + 1] = (byte) i;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6918(short s) {
        C3644 c3644 = f7643;
        this.f7656 = c3644;
        C3644 c3644M6911 = this;
        while (c3644M6911 != c3644) {
            C3644 c3645 = c3644M6911.f7656;
            c3644M6911.f7656 = null;
            if (c3644M6911.f7646 == 0) {
                c3644M6911.f7646 = s;
                c3644M6911 = c3644M6911.m6911(c3645);
            } else {
                c3644M6911 = c3645;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6914(C3644 c3644) {
        C3644 c3645 = f7643;
        this.f7656 = c3645;
        C3644 c3644M6911 = this;
        C3644 c3646 = c3645;
        while (c3644M6911 != c3645) {
            C3644 c3647 = c3644M6911.f7656;
            c3644M6911.f7656 = c3646;
            if ((c3644M6911.f7650 & 64) != 0 && c3644M6911.f7646 != c3644.f7646) {
                c3644M6911.f7648 = new C4986(c3644M6911.f7645, c3644.f7648.f11359, c3644M6911.f7648);
            }
            c3646 = c3644M6911;
            c3644M6911 = c3644M6911.m6911(c3647);
        }
        while (c3646 != c3645) {
            C3644 c3648 = c3646.f7656;
            c3646.f7656 = null;
            c3646 = c3648;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C3644 m6911(C3644 c3644) {
        for (C4986 c4986 = this.f7648; c4986 != null; c4986 = c4986.f11358) {
            if ((this.f7650 & 16) == 0 || c4986 != this.f7648.f11358) {
                C3644 c3645 = c4986.f11359;
                if (c3645.f7656 == null) {
                    c3645.f7656 = c3644;
                    c3644 = c3645;
                }
            }
        }
        return c3644;
    }

    public final String toString() {
        return C20778.m46922(System.identityHashCode(this), "L");
    }
}
