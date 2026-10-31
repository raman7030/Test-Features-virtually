package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.֨᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes2.dex */
public final class C1342 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C1342 f4873 = new C1342();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4874;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short f4875;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short f4876;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C1342 f4877;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2754 f4878;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f4879;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short f4880;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public short f4881;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public short f4882;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f4883;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22055 f4884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19688 f4885;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1342 f4886;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public short f4887;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1342 m4680() {
        C19688 c19688 = this.f4885;
        return c19688 == null ? this : c19688.f63610;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4681(int i) {
        short s = this.f4880;
        if ((s & 128) == 0) {
            this.f4880 = (short) (s | 128);
            this.f4887 = (short) i;
            return;
        }
        if (this.f4879 == null) {
            this.f4879 = new int[4];
        }
        int[] iArr = this.f4879;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f4879 = iArr2;
        }
        this.f4879[i2] = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4683(AbstractC15452 abstractC15452, boolean z) {
        abstractC15452.mo28284(this);
        if (!z || (this.f4880 & 128) == 0) {
            return;
        }
        abstractC15452.mo28292(this.f4887 & HPKE.aead_EXPORT_ONLY, this);
        if (this.f4879 == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.f4879;
            if (i > iArr[0]) {
                return;
            }
            abstractC15452.mo28292(iArr[i], this);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4685(C18276 c18276, int i, boolean z) {
        if ((this.f4880 & 4) != 0) {
            if (z) {
                c18276.m42616(this.f4874 - i);
                return;
            } else {
                c18276.m42618(this.f4874 - i);
                return;
            }
        }
        if (z) {
            m4678(i, 536870912, c18276.f56819);
            c18276.m42616(-1);
        } else {
            m4678(i, 268435456, c18276.f56819);
            c18276.m42618(-1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4684(C18276 c18276) {
        if ((this.f4880 & 4) == 0) {
            m4678(0, 805306368, c18276.f56819);
        }
        c18276.m42618(this.f4874);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4678(int i, int i2, int i3) {
        if (this.f4883 == null) {
            this.f4883 = new int[6];
        }
        int[] iArr = this.f4883;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f4883 = iArr2;
        }
        int[] iArr3 = this.f4883;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4687(byte[] bArr, C18276 c18276, int i) {
        this.f4880 = (short) (this.f4880 | 4);
        this.f4874 = i;
        int[] iArr = this.f4883;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f4883;
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
                byte[] bArr2 = c18276.f56818;
                bArr2[i6] = (byte) (i >>> 8);
                bArr2[i6 + 1] = (byte) i;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4686(short s) {
        C1342 c1342 = f4873;
        this.f4886 = c1342;
        C1342 c1342M4679 = this;
        while (c1342M4679 != c1342) {
            C1342 c1343 = c1342M4679.f4886;
            c1342M4679.f4886 = null;
            if (c1342M4679.f4876 == 0) {
                c1342M4679.f4876 = s;
                c1342M4679 = c1342M4679.m4679(c1343);
            } else {
                c1342M4679 = c1343;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4682(C1342 c1342) {
        C1342 c1343 = f4873;
        this.f4886 = c1343;
        C1342 c1342M4679 = this;
        C1342 c1344 = c1343;
        while (c1342M4679 != c1343) {
            C1342 c1345 = c1342M4679.f4886;
            c1342M4679.f4886 = c1344;
            if ((c1342M4679.f4880 & 64) != 0 && c1342M4679.f4876 != c1342.f4876) {
                c1342M4679.f4878 = new C2754(c1342M4679.f4875, c1342.f4878.f8565, c1342M4679.f4878);
            }
            c1344 = c1342M4679;
            c1342M4679 = c1342M4679.m4679(c1345);
        }
        while (c1344 != c1343) {
            C1342 c1346 = c1344.f4886;
            c1344.f4886 = null;
            c1344 = c1346;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C1342 m4679(C1342 c1342) {
        for (C2754 c2754 = this.f4878; c2754 != null; c2754 = c2754.f8564) {
            if ((this.f4880 & 16) == 0 || c2754 != this.f4878.f8564) {
                C1342 c1343 = c2754.f8565;
                if (c1343.f4886 == null) {
                    c1343.f4886 = c1342;
                    c1342 = c1343;
                }
            }
        }
        return c1342;
    }

    public final String toString() {
        return C19370.m44628(System.identityHashCode(this), "L");
    }
}
