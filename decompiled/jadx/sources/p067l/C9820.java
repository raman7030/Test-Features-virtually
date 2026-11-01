package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9820 {

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f27159 = new int[0];

    /* JADX INFO: renamed from: ֫ */
    public int[] f27160;

    /* JADX INFO: renamed from: ۧ */
    public EnumC3114 f27161;

    public C9820(C9820 c9820) {
        this(c9820.m22900().f27160, EnumC3114.m5320(c9820.f27160, false));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9820(boolean z) {
        int[] iArr = f27159;
        this(iArr, EnumC3114.m5320(iArr, z));
    }

    public C9820(int[] iArr, EnumC3114 enumC3114) {
        this.f27160 = iArr;
        this.f27161 = enumC3114;
        int iOrdinal = enumC3114.ordinal();
        if (iOrdinal == 0) {
            this.f27160 = null;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            C1446.m31704(iArr != f27159);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22907(int i) {
        int[] iArr = this.f27160;
        if (iArr.length < i) {
            this.f27160 = Arrays.copyOf(iArr, i);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22909() {
        this.f27160 = null;
        this.f27161 = EnumC3114.f5664;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m22906() {
        return this.f27161 == EnumC3114.f5664;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22905(C9820 c9820) {
        this.f27160 = c9820.m22900().f27160;
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9820 m22900() {
        int[] iArr;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        C9820 c9820 = new C9820(false);
        EnumC3114 enumC3114 = this.f27161;
        EnumC3114 enumC3115 = EnumC3114.f5667;
        if (enumC3114 != enumC3115) {
            iArr = this.f27160;
        } else {
            int[] iArr2 = this.f27160;
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr = iArr3;
        }
        c9820.f27160 = iArr;
        this.f27161 = enumC3115;
        return c9820;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22910(int i) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        C1446.m31704(i >= 0);
        int i2 = i >>> 5;
        m22907(i2 + 1);
        int[] iArr = this.f27160;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22902(int i, int i2) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        m22907((i2 >>> 5) + 1);
        while (i < i2) {
            int[] iArr = this.f27160;
            int i3 = i >>> 5;
            iArr[i3] = iArr[i3] | (1 << (i & 31));
            i++;
        }
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22904(int i) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        C9820 c9820 = new C9820(false);
        c9820.m22907(this.f27160.length);
        c9820.m22902(0, i);
        m22914(c9820);
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22901(int i) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        C1446.m31704(i >= 0);
        int i2 = i >>> 5;
        m22907(i2 + 1);
        int[] iArr = this.f27160;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m22915(int i) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        if (i >= 0) {
            int[] iArr = this.f27160;
            if (i < (iArr.length << 5)) {
                if (((1 << (i & 31)) & iArr[i >>> 5]) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22903(C9820 c9820) {
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        m22914(c9820);
        this.f27161 = EnumC3114.f5667;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22914(C9820 c9820) {
        int i = 0;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        m22907(c9820.f27160.length);
        while (true) {
            int[] iArr = c9820.f27160;
            if (i >= iArr.length) {
                return;
            }
            int[] iArr2 = this.f27160;
            iArr2[i] = iArr[i] & iArr2[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22913(C9820 c9820) {
        int i = 0;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        m22907(c9820.f27160.length);
        while (true) {
            int[] iArr = c9820.f27160;
            if (i < iArr.length) {
                int[] iArr2 = this.f27160;
                iArr2[i] = iArr[i] | iArr2[i];
                i++;
            } else {
                this.f27161 = EnumC3114.f5667;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22911(C9820 c9820) {
        int i = 0;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        while (true) {
            int[] iArr = this.f27160;
            if (i < iArr.length) {
                int[] iArr2 = c9820.f27160;
                if (i < iArr2.length) {
                    iArr[i] = (~iArr2[i]) & iArr[i];
                }
                i++;
            } else {
                this.f27161 = EnumC3114.f5667;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22908(C9820 c9820) {
        int i = 0;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        m22907(c9820.f27160.length);
        while (true) {
            int[] iArr = c9820.f27160;
            if (i < iArr.length) {
                int[] iArr2 = this.f27160;
                iArr2[i] = iArr[i] ^ iArr2[i];
                i++;
            } else {
                this.f27161 = EnumC3114.f5667;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m22912(int i) {
        int i2;
        int i3;
        C1446.m31704(this.f27161 != EnumC3114.f5664);
        int i4 = i >>> 5;
        int[] iArr = this.f27160;
        if (i4 >= iArr.length) {
            return -1;
        }
        int i5 = (~((1 << (i & 31)) - 1)) & iArr[i4];
        while (i5 == 0) {
            i4++;
            int[] iArr2 = this.f27160;
            if (i4 >= iArr2.length) {
                return -1;
            }
            i5 = iArr2[i4];
        }
        int i6 = i4 << 5;
        if (i5 == 0) {
            i3 = 32;
        } else {
            if ((65535 & i5) == 0) {
                i5 >>>= 16;
                i2 = 17;
            } else {
                i2 = 1;
            }
            if ((i5 & 255) == 0) {
                i2 += 8;
                i5 >>>= 8;
            }
            if ((i5 & 15) == 0) {
                i2 += 4;
                i5 >>>= 4;
            }
            if ((i5 & 3) == 0) {
                i2 += 2;
                i5 >>>= 2;
            }
            i3 = i2 - (i5 & 1);
        }
        return i6 + i3;
    }

    public final String toString() {
        int[] iArr = this.f27160;
        if (iArr == null || iArr.length <= 0) {
            return "[]";
        }
        char[] cArr = new char[iArr.length * 32];
        for (int i = 0; i < this.f27160.length * 32; i++) {
            cArr[i] = m22915(i) ? '1' : '0';
        }
        return new String(cArr);
    }
}
