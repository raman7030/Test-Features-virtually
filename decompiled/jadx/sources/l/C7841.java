package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7841 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f24243 = new int[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f24244;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC0785 f24245;

    public C7841(C7841 c7841) {
        this(c7841.m20935().f24244, EnumC0785.m2991(c7841.f24244, false));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7841(boolean z) {
        int[] iArr = f24243;
        this(iArr, EnumC0785.m2991(iArr, z));
    }

    public C7841(int[] iArr, EnumC0785 enumC0785) {
        this.f24244 = iArr;
        this.f24245 = enumC0785;
        int iOrdinal = enumC0785.ordinal();
        if (iOrdinal == 0) {
            this.f24244 = null;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            C12171.m29642(iArr != f24243);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20942(int i) {
        int[] iArr = this.f24244;
        if (iArr.length < i) {
            this.f24244 = Arrays.copyOf(iArr, i);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20944() {
        this.f24244 = null;
        this.f24245 = EnumC0785.f2892;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m20941() {
        return this.f24245 == EnumC0785.f2892;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20940(C7841 c7841) {
        this.f24244 = c7841.m20935().f24244;
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7841 m20935() {
        int[] iArr;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        C7841 c7841 = new C7841(false);
        EnumC0785 enumC0785 = this.f24245;
        EnumC0785 enumC0786 = EnumC0785.f2895;
        if (enumC0785 != enumC0786) {
            iArr = this.f24244;
        } else {
            int[] iArr2 = this.f24244;
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr = iArr3;
        }
        c7841.f24244 = iArr;
        this.f24245 = enumC0786;
        return c7841;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20945(int i) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        C12171.m29642(i >= 0);
        int i2 = i >>> 5;
        m20942(i2 + 1);
        int[] iArr = this.f24244;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20937(int i, int i2) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        m20942((i2 >>> 5) + 1);
        while (i < i2) {
            int[] iArr = this.f24244;
            int i3 = i >>> 5;
            iArr[i3] = iArr[i3] | (1 << (i & 31));
            i++;
        }
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20939(int i) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        C7841 c7841 = new C7841(false);
        c7841.m20942(this.f24244.length);
        c7841.m20937(0, i);
        m20949(c7841);
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20936(int i) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        C12171.m29642(i >= 0);
        int i2 = i >>> 5;
        m20942(i2 + 1);
        int[] iArr = this.f24244;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m20950(int i) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        if (i >= 0) {
            int[] iArr = this.f24244;
            if (i < (iArr.length << 5)) {
                if (((1 << (i & 31)) & iArr[i >>> 5]) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20938(C7841 c7841) {
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        m20949(c7841);
        this.f24245 = EnumC0785.f2895;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20949(C7841 c7841) {
        int i = 0;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        m20942(c7841.f24244.length);
        while (true) {
            int[] iArr = c7841.f24244;
            if (i >= iArr.length) {
                return;
            }
            int[] iArr2 = this.f24244;
            iArr2[i] = iArr[i] & iArr2[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20948(C7841 c7841) {
        int i = 0;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        m20942(c7841.f24244.length);
        while (true) {
            int[] iArr = c7841.f24244;
            if (i < iArr.length) {
                int[] iArr2 = this.f24244;
                iArr2[i] = iArr[i] | iArr2[i];
                i++;
            } else {
                this.f24245 = EnumC0785.f2895;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20946(C7841 c7841) {
        int i = 0;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        while (true) {
            int[] iArr = this.f24244;
            if (i < iArr.length) {
                int[] iArr2 = c7841.f24244;
                if (i < iArr2.length) {
                    iArr[i] = (~iArr2[i]) & iArr[i];
                }
                i++;
            } else {
                this.f24245 = EnumC0785.f2895;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20943(C7841 c7841) {
        int i = 0;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        m20942(c7841.f24244.length);
        while (true) {
            int[] iArr = c7841.f24244;
            if (i < iArr.length) {
                int[] iArr2 = this.f24244;
                iArr2[i] = iArr[i] ^ iArr2[i];
                i++;
            } else {
                this.f24245 = EnumC0785.f2895;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m20947(int i) {
        int i2;
        int i3;
        C12171.m29642(this.f24245 != EnumC0785.f2892);
        int i4 = i >>> 5;
        int[] iArr = this.f24244;
        if (i4 >= iArr.length) {
            return -1;
        }
        int i5 = (~((1 << (i & 31)) - 1)) & iArr[i4];
        while (i5 == 0) {
            i4++;
            int[] iArr2 = this.f24244;
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
        int[] iArr = this.f24244;
        if (iArr == null || iArr.length <= 0) {
            return "[]";
        }
        char[] cArr = new char[iArr.length * 32];
        for (int i = 0; i < this.f24244.length * 32; i++) {
            cArr[i] = m20950(i) ? '1' : '0';
        }
        return new String(cArr);
    }
}
