package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9509 {

    /* JADX INFO: renamed from: ֡ */
    public int f26018;

    /* JADX INFO: renamed from: ֫ */
    public int f26019;

    /* JADX INFO: renamed from: ۖ */
    public int f26020;

    /* JADX INFO: renamed from: ۘ */
    public C9509 f26021;

    /* JADX INFO: renamed from: ۚ */
    public int[] f26022;

    /* JADX INFO: renamed from: ۜ */
    public char[] f26023;

    /* JADX INFO: renamed from: ۡ */
    public int[] f26024;

    /* JADX INFO: renamed from: ۢ */
    public long[] f26025;

    /* JADX INFO: renamed from: ۧ */
    public int f26026;

    /* JADX INFO: renamed from: ܳ */
    public int f26027;

    /* JADX INFO: renamed from: ܺ */
    public char[] f26028;

    /* JADX INFO: renamed from: ܽ */
    public long[] f26029;

    /* JADX INFO: renamed from: ܿ */
    public int f26030;

    /* JADX INFO: renamed from: ᩳ */
    public int f26031;

    /* JADX INFO: renamed from: ᩴ */
    public int[] f26032;

    /* JADX INFO: renamed from: ᩵ */
    public Object[] f26033;

    /* JADX INFO: renamed from: ᩷ */
    public int f26034;

    /* JADX INFO: renamed from: ᩻ */
    public C9509 f26035;

    public C9509(int i) {
        this(i, true);
    }

    public C9509(int i, boolean z) {
        this.f26031 = 1;
        int iMax = Math.max(8, i);
        Object[] objArr = new Object[(iMax + 63) >>> 6];
        this.f26033 = objArr;
        this.f26032 = new int[objArr.length];
        if (z) {
            this.f26023 = new char[iMax];
        } else {
            this.f26022 = new int[iMax];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m22118() {
        char[] cArr = this.f26023;
        return cArr != null ? cArr.length : this.f26022.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22120(int i) {
        int iM22118 = m22118();
        if (i <= iM22118) {
            return;
        }
        int iMin = Math.min(1024, Math.max(i, iM22118 * 2));
        int i2 = (iMin + 63) >>> 6;
        this.f26033 = Arrays.copyOf(this.f26033, i2);
        this.f26032 = Arrays.copyOf(this.f26032, i2);
        int i3 = iM22118 >>> 6;
        if ((iM22118 & 63) != 0 && this.f26033[i3] != null) {
            int iMin2 = Math.min(64, iMin - (i3 << 6));
            Object[] objArr = this.f26033;
            Object obj = objArr[i3];
            objArr[i3] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin2) : Arrays.copyOf((int[]) obj, iMin2);
        }
        char[] cArr = this.f26023;
        if (cArr != null) {
            this.f26023 = Arrays.copyOf(cArr, iMin);
        } else {
            this.f26022 = Arrays.copyOf(this.f26022, iMin);
        }
        int[] iArr = this.f26024;
        if (iArr != null) {
            this.f26024 = Arrays.copyOf(iArr, iMin);
        }
        long[] jArr = this.f26025;
        if (jArr != null) {
            this.f26025 = Arrays.copyOf(jArr, i2);
            this.f26028 = Arrays.copyOf(this.f26028, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m22129(int i) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        Object obj = this.f26033[i2];
        return this.f26032[i2] + (obj instanceof char[] ? ((char[]) obj)[i3] : ((int[]) obj)[i3]);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22115(int i, int i2) {
        int i3 = i >>> 6;
        int i4 = i & 63;
        Object[] objArr = this.f26033;
        Object obj = objArr[i3];
        if (obj == null) {
            obj = new char[Math.min(64, m22118() - (i3 << 6))];
            objArr[i3] = obj;
            this.f26032[i3] = i2;
        }
        long j = ((long) i2) - ((long) this.f26032[i3]);
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (j >= 0 && j <= 65535) {
                cArr[i4] = (char) j;
                return;
            }
            int[] iArr = new int[cArr.length];
            for (int i5 = 0; i5 < cArr.length; i5++) {
                iArr[i5] = cArr[i5];
            }
            this.f26033[i3] = iArr;
            obj = iArr;
        }
        ((int[]) obj)[i4] = (int) j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m22127(int i) {
        int[] iArr = this.f26024;
        if (iArr != null) {
            return iArr[i];
        }
        long[] jArr = this.f26025;
        if (jArr == null) {
            return i * this.f26020;
        }
        int i2 = i >>> 6;
        return Long.bitCount(((-1) >>> (63 - (i & 63))) & jArr[i2]) + this.f26028[i2];
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m22126(int i) {
        long[] jArr = this.f26029;
        return (jArr == null || (jArr[i >>> 6] & (1 << i)) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22123(int i, boolean z) {
        if (z) {
            if (this.f26029 == null) {
                this.f26029 = new long[16];
            }
            long[] jArr = this.f26029;
            int i2 = i >>> 6;
            jArr[i2] = (1 << i) | jArr[i2];
            return;
        }
        long[] jArr2 = this.f26029;
        if (jArr2 != null) {
            int i3 = i >>> 6;
            jArr2[i3] = (~(1 << i)) & jArr2[i3];
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22128(int i, C13533 c13533) {
        int i2;
        int iM22127;
        m22115(i, c13533.f38061 - this.f26019);
        int i3 = c13533.f38062 - c13533.f38061;
        int i4 = 0;
        if (this.f26023 != null && ((-65536) & i3) != 0) {
            this.f26022 = new int[m22118()];
            for (int i5 = 0; i5 < this.f26018; i5++) {
                this.f26022[i5] = this.f26023[i5];
            }
            this.f26023 = null;
        }
        char[] cArr = this.f26023;
        if (cArr != null) {
            cArr[i] = (char) i3;
        } else {
            this.f26022[i] = i3;
        }
        int i6 = c13533.f38063;
        int i7 = this.f26018;
        if (i7 == 0) {
            this.f26034 = i6;
        }
        if (this.f26024 != null || ((i >= i7 && this.f26025 != null) || i6 != this.f26034 + m22127(i))) {
            if (this.f26024 == null && i == (i2 = this.f26018) && i2 > 0 && ((iM22127 = i6 - (this.f26034 + m22127(i2 - 1))) == 0 || iM22127 == 1)) {
                long[] jArr = this.f26025;
                if (jArr == null && this.f26018 == 1) {
                    this.f26020 = iM22127;
                } else {
                    if (jArr == null) {
                        Object[] objArr = this.f26033;
                        this.f26025 = new long[objArr.length];
                        this.f26028 = new char[objArr.length];
                        for (int i8 = 1; i8 < this.f26018; i8++) {
                            if (this.f26020 == 1) {
                                long[] jArr2 = this.f26025;
                                int i9 = i8 >>> 6;
                                jArr2[i9] = jArr2[i9] | (1 << i8);
                            }
                        }
                        int iBitCount = 0;
                        while (true) {
                            long[] jArr3 = this.f26025;
                            if (i4 >= jArr3.length) {
                                break;
                            }
                            this.f26028[i4] = (char) iBitCount;
                            iBitCount += Long.bitCount(jArr3[i4]);
                            i4++;
                        }
                    }
                    int i10 = i >>> 6;
                    if ((i & 63) == 0 && i10 > 0) {
                        char[] cArr2 = this.f26028;
                        int i11 = i10 - 1;
                        cArr2[i10] = (char) (Long.bitCount(this.f26025[i11]) + cArr2[i11]);
                    }
                    if (iM22127 == 1) {
                        long[] jArr4 = this.f26025;
                        jArr4[i10] = jArr4[i10] | (1 << i);
                    } else {
                        long[] jArr5 = this.f26025;
                        jArr5[i10] = jArr5[i10] & (~(1 << i));
                    }
                }
            } else {
                m22116();
                this.f26024[i] = i6 - this.f26034;
            }
        }
        m22123(i, c13533.m30803());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22125(int i, C13533 c13533) {
        int iM22129 = m22129(i) + this.f26019;
        char[] cArr = this.f26023;
        c13533.m30799(iM22129, (cArr != null ? cArr[i] : this.f26022[i]) + iM22129, m22127(i) + this.f26034);
        c13533.m30801(m22126(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22124(C13533 c13533) {
        m22120(this.f26018 + 1);
        m22128(this.f26018, c13533);
        int i = this.f26018 + 1;
        this.f26018 = i;
        this.f26026 = i;
        if (i == 1024) {
            m22112();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22122(int i, C13533 c13533) {
        int i2 = this.f26018;
        if (i == i2) {
            m22124(c13533);
            return;
        }
        m22120(i2 + 1);
        if (this.f26024 == null && (this.f26025 != null || this.f26020 != 0 || c13533.f38063 != this.f26034)) {
            m22116();
        }
        for (int i3 = this.f26018; i3 > i; i3--) {
            m22115(i3, m22129(i3 - 1));
        }
        char[] cArr = this.f26023;
        if (cArr != null) {
            System.arraycopy(cArr, i, cArr, i + 1, this.f26018 - i);
        } else {
            int[] iArr = this.f26022;
            System.arraycopy(iArr, i, iArr, i + 1, this.f26018 - i);
        }
        int[] iArr2 = this.f26024;
        if (iArr2 != null) {
            System.arraycopy(iArr2, i, iArr2, i + 1, this.f26018 - i);
        }
        for (int i4 = this.f26018; i4 > i; i4--) {
            m22123(i4, m22126(i4 - 1));
        }
        this.f26018++;
        m22128(i, c13533);
        m22117();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22121(int i, int i2, int i3, int i4) {
        if (i >= i2) {
            return;
        }
        if (i == 0 && i2 == this.f26018) {
            this.f26019 += i3;
            this.f26034 += i4;
            return;
        }
        if (i3 != 0) {
            for (int i5 = i >>> 6; i5 <= ((i2 - 1) >>> 6); i5++) {
                int i6 = i5 << 6;
                int iMin = Math.min(this.f26018, i6 + 64);
                if (i <= i6 && i2 >= iMin) {
                    int[] iArr = this.f26032;
                    iArr[i5] = iArr[i5] + i3;
                } else {
                    for (int iMax = Math.max(i, i6); iMax < Math.min(i2, iMin); iMax++) {
                        m22115(iMax, m22129(iMax) + i3);
                    }
                    m22113(i5, iMin - i6);
                }
            }
        }
        if (i4 != 0) {
            m22116();
            while (i < i2) {
                int[] iArr2 = this.f26024;
                iArr2[i] = iArr2[i] + i4;
                i++;
            }
            m22114();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22116() {
        if (this.f26024 != null) {
            return;
        }
        int[] iArr = new int[m22118()];
        for (int i = 0; i < this.f26018; i++) {
            iArr[i] = m22127(i);
        }
        this.f26024 = iArr;
        this.f26025 = null;
        this.f26028 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m22114() {
        int[] iArr = this.f26024;
        if (iArr == null || this.f26018 == 0) {
            return;
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = this.f26018;
            if (i3 < i5) {
                int[] iArr2 = this.f26024;
                int i6 = iArr2[i3] - iArr2[i3 - 1];
                if (i6 != 0 && i6 != 1) {
                    return;
                }
                i4 += i6;
                i3++;
            } else {
                if (i4 != 0 && i4 != i5 - 1) {
                    Object[] objArr = this.f26033;
                    this.f26025 = new long[objArr.length];
                    this.f26028 = new char[objArr.length];
                    for (int i7 = 1; i7 < this.f26018; i7++) {
                        int[] iArr3 = this.f26024;
                        if (iArr3[i7] != iArr3[i7 - 1]) {
                            long[] jArr = this.f26025;
                            int i8 = i7 >>> 6;
                            jArr[i8] = jArr[i8] | (1 << i7);
                        }
                    }
                    int iBitCount = 0;
                    while (true) {
                        long[] jArr2 = this.f26025;
                        if (i >= jArr2.length) {
                            break;
                        }
                        this.f26028[i] = (char) iBitCount;
                        iBitCount += Long.bitCount(jArr2[i]);
                        i++;
                    }
                } else {
                    this.f26020 = i4 != 0 ? 1 : 0;
                }
                this.f26034 += i2;
                this.f26024 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m22117() {
        for (int i = 0; i < this.f26033.length; i++) {
            int iMin = Math.min(64, this.f26018 - (i << 6));
            if (iMin <= 0) {
                this.f26033[i] = null;
            } else {
                m22113(i, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22113(int i, int i2) {
        Object obj = this.f26033[i];
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int iMax = iArr[0];
            int iMin = iMax;
            for (int i3 = 1; i3 < i2; i3++) {
                iMin = Math.min(iMin, iArr[i3]);
                iMax = Math.max(iMax, iArr[i3]);
            }
            if (((long) iMax) - ((long) iMin) > 65535) {
                return;
            }
            char[] cArr = new char[iArr.length];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (iArr[i4] - iMin);
            }
            int[] iArr2 = this.f26032;
            iArr2[i] = iArr2[i] + iMin;
            this.f26033[i] = cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m22112() {
        m22117();
        m22114();
        if (this.f26022 == null) {
            return;
        }
        for (int i = 0; i < this.f26018; i++) {
            if ((this.f26022[i] & (-65536)) != 0) {
                return;
            }
        }
        this.f26023 = new char[m22118()];
        for (int i2 = 0; i2 < this.f26018; i2++) {
            this.f26023[i2] = (char) this.f26022[i2];
        }
        this.f26022 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9509 m22119(int i, int i2) {
        int i3 = i2 - i;
        C9509 c9509 = new C9509(i3, this.f26023 != null);
        c9509.f26026 = i3;
        c9509.f26018 = i3;
        c9509.f26019 = this.f26019;
        c9509.f26034 = this.f26034;
        c9509.f26020 = this.f26020;
        if (i == 0 && i2 == this.f26018) {
            int[] iArr = this.f26032;
            int[] iArr2 = c9509.f26032;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            for (int i4 = 0; i4 < c9509.f26033.length; i4++) {
                int iMin = Math.min(64, c9509.m22118() - (i4 << 6));
                Object obj = this.f26033[i4];
                c9509.f26033[i4] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin) : Arrays.copyOf((int[]) obj, iMin);
            }
        } else {
            for (int i5 = 0; i5 < c9509.f26018; i5++) {
                c9509.m22115(i5, m22129(i5 + i));
            }
        }
        char[] cArr = this.f26023;
        if (cArr != null) {
            System.arraycopy(cArr, i, c9509.f26023, 0, c9509.f26018);
        } else {
            System.arraycopy(this.f26022, i, c9509.f26022, 0, c9509.f26018);
        }
        if (this.f26024 == null && this.f26025 == null) {
            c9509.f26034 = (this.f26020 * i) + c9509.f26034;
        } else {
            long[] jArr = this.f26025;
            if (jArr != null && i == 0 && i2 == this.f26018) {
                c9509.f26025 = Arrays.copyOf(jArr, c9509.f26033.length);
                c9509.f26028 = Arrays.copyOf(this.f26028, c9509.f26033.length);
            } else {
                c9509.f26024 = new int[c9509.m22118()];
                for (int i6 = 0; i6 < c9509.f26018; i6++) {
                    c9509.f26024[i6] = m22127(i6 + i);
                }
            }
        }
        if (i != 0 || i2 != this.f26018) {
            c9509.m22112();
        }
        if (this.f26029 != null) {
            for (int i7 = i; i7 < i2; i7++) {
                c9509.m22123(i7 - i, m22126(i7));
            }
        }
        return c9509;
    }
}
