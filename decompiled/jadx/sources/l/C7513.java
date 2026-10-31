package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7513 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23106;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23107;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23108;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C7513 f23109;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f23110;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public char[] f23111;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f23112;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long[] f23113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23115;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f23116;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f23117;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23118;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23119;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f23120;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Object[] f23121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23122;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7513 f23123;

    public C7513(int i) {
        this(i, true);
    }

    public C7513(int i, boolean z) {
        this.f23119 = 1;
        int iMax = Math.max(8, i);
        Object[] objArr = new Object[(iMax + 63) >>> 6];
        this.f23121 = objArr;
        this.f23120 = new int[objArr.length];
        if (z) {
            this.f23111 = new char[iMax];
        } else {
            this.f23110 = new int[iMax];
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20142() {
        char[] cArr = this.f23111;
        return cArr != null ? cArr.length : this.f23110.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20144(int i) {
        int iM20142 = m20142();
        if (i <= iM20142) {
            return;
        }
        int iMin = Math.min(1024, Math.max(i, iM20142 * 2));
        int i2 = (iMin + 63) >>> 6;
        this.f23121 = Arrays.copyOf(this.f23121, i2);
        this.f23120 = Arrays.copyOf(this.f23120, i2);
        int i3 = iM20142 >>> 6;
        if ((iM20142 & 63) != 0 && this.f23121[i3] != null) {
            int iMin2 = Math.min(64, iMin - (i3 << 6));
            Object[] objArr = this.f23121;
            Object obj = objArr[i3];
            objArr[i3] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin2) : Arrays.copyOf((int[]) obj, iMin2);
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            this.f23111 = Arrays.copyOf(cArr, iMin);
        } else {
            this.f23110 = Arrays.copyOf(this.f23110, iMin);
        }
        int[] iArr = this.f23112;
        if (iArr != null) {
            this.f23112 = Arrays.copyOf(iArr, iMin);
        }
        long[] jArr = this.f23113;
        if (jArr != null) {
            this.f23113 = Arrays.copyOf(jArr, i2);
            this.f23116 = Arrays.copyOf(this.f23116, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m20153(int i) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        Object obj = this.f23121[i2];
        return this.f23120[i2] + (obj instanceof char[] ? ((char[]) obj)[i3] : ((int[]) obj)[i3]);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20139(int i, int i2) {
        int i3 = i >>> 6;
        int i4 = i & 63;
        Object[] objArr = this.f23121;
        Object obj = objArr[i3];
        if (obj == null) {
            obj = new char[Math.min(64, m20142() - (i3 << 6))];
            objArr[i3] = obj;
            this.f23120[i3] = i2;
        }
        long j = ((long) i2) - ((long) this.f23120[i3]);
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
            this.f23121[i3] = iArr;
            obj = iArr;
        }
        ((int[]) obj)[i4] = (int) j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20151(int i) {
        int[] iArr = this.f23112;
        if (iArr != null) {
            return iArr[i];
        }
        long[] jArr = this.f23113;
        if (jArr == null) {
            return i * this.f23108;
        }
        int i2 = i >>> 6;
        return Long.bitCount(((-1) >>> (63 - (i & 63))) & jArr[i2]) + this.f23116[i2];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m20150(int i) {
        long[] jArr = this.f23117;
        return (jArr == null || (jArr[i >>> 6] & (1 << i)) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20147(int i, boolean z) {
        if (z) {
            if (this.f23117 == null) {
                this.f23117 = new long[16];
            }
            long[] jArr = this.f23117;
            int i2 = i >>> 6;
            jArr[i2] = (1 << i) | jArr[i2];
            return;
        }
        long[] jArr2 = this.f23117;
        if (jArr2 != null) {
            int i3 = i >>> 6;
            jArr2[i3] = (~(1 << i)) & jArr2[i3];
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20152(int i, C11747 c11747) {
        int i2;
        int iM20151;
        m20139(i, c11747.f35062 - this.f23107);
        int i3 = c11747.f35063 - c11747.f35062;
        int i4 = 0;
        if (this.f23111 != null && ((-65536) & i3) != 0) {
            this.f23110 = new int[m20142()];
            for (int i5 = 0; i5 < this.f23106; i5++) {
                this.f23110[i5] = this.f23111[i5];
            }
            this.f23111 = null;
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            cArr[i] = (char) i3;
        } else {
            this.f23110[i] = i3;
        }
        int i6 = c11747.f35064;
        int i7 = this.f23106;
        if (i7 == 0) {
            this.f23122 = i6;
        }
        if (this.f23112 != null || ((i >= i7 && this.f23113 != null) || i6 != this.f23122 + m20151(i))) {
            if (this.f23112 == null && i == (i2 = this.f23106) && i2 > 0 && ((iM20151 = i6 - (this.f23122 + m20151(i2 - 1))) == 0 || iM20151 == 1)) {
                long[] jArr = this.f23113;
                if (jArr == null && this.f23106 == 1) {
                    this.f23108 = iM20151;
                } else {
                    if (jArr == null) {
                        Object[] objArr = this.f23121;
                        this.f23113 = new long[objArr.length];
                        this.f23116 = new char[objArr.length];
                        for (int i8 = 1; i8 < this.f23106; i8++) {
                            if (this.f23108 == 1) {
                                long[] jArr2 = this.f23113;
                                int i9 = i8 >>> 6;
                                jArr2[i9] = jArr2[i9] | (1 << i8);
                            }
                        }
                        int iBitCount = 0;
                        while (true) {
                            long[] jArr3 = this.f23113;
                            if (i4 >= jArr3.length) {
                                break;
                            }
                            this.f23116[i4] = (char) iBitCount;
                            iBitCount += Long.bitCount(jArr3[i4]);
                            i4++;
                        }
                    }
                    int i10 = i >>> 6;
                    if ((i & 63) == 0 && i10 > 0) {
                        char[] cArr2 = this.f23116;
                        int i11 = i10 - 1;
                        cArr2[i10] = (char) (Long.bitCount(this.f23113[i11]) + cArr2[i11]);
                    }
                    if (iM20151 == 1) {
                        long[] jArr4 = this.f23113;
                        jArr4[i10] = jArr4[i10] | (1 << i);
                    } else {
                        long[] jArr5 = this.f23113;
                        jArr5[i10] = jArr5[i10] & (~(1 << i));
                    }
                }
            } else {
                m20140();
                this.f23112[i] = i6 - this.f23122;
            }
        }
        m20147(i, c11747.m28755());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20149(int i, C11747 c11747) {
        int iM20153 = m20153(i) + this.f23107;
        char[] cArr = this.f23111;
        c11747.m28751(iM20153, (cArr != null ? cArr[i] : this.f23110[i]) + iM20153, m20151(i) + this.f23122);
        c11747.m28753(m20150(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20148(C11747 c11747) {
        m20144(this.f23106 + 1);
        m20152(this.f23106, c11747);
        int i = this.f23106 + 1;
        this.f23106 = i;
        this.f23114 = i;
        if (i == 1024) {
            m20136();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20146(int i, C11747 c11747) {
        int i2 = this.f23106;
        if (i == i2) {
            m20148(c11747);
            return;
        }
        m20144(i2 + 1);
        if (this.f23112 == null && (this.f23113 != null || this.f23108 != 0 || c11747.f35064 != this.f23122)) {
            m20140();
        }
        for (int i3 = this.f23106; i3 > i; i3--) {
            m20139(i3, m20153(i3 - 1));
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            System.arraycopy(cArr, i, cArr, i + 1, this.f23106 - i);
        } else {
            int[] iArr = this.f23110;
            System.arraycopy(iArr, i, iArr, i + 1, this.f23106 - i);
        }
        int[] iArr2 = this.f23112;
        if (iArr2 != null) {
            System.arraycopy(iArr2, i, iArr2, i + 1, this.f23106 - i);
        }
        for (int i4 = this.f23106; i4 > i; i4--) {
            m20147(i4, m20150(i4 - 1));
        }
        this.f23106++;
        m20152(i, c11747);
        m20141();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20145(int i, int i2, int i3, int i4) {
        if (i >= i2) {
            return;
        }
        if (i == 0 && i2 == this.f23106) {
            this.f23107 += i3;
            this.f23122 += i4;
            return;
        }
        if (i3 != 0) {
            for (int i5 = i >>> 6; i5 <= ((i2 - 1) >>> 6); i5++) {
                int i6 = i5 << 6;
                int iMin = Math.min(this.f23106, i6 + 64);
                if (i <= i6 && i2 >= iMin) {
                    int[] iArr = this.f23120;
                    iArr[i5] = iArr[i5] + i3;
                } else {
                    for (int iMax = Math.max(i, i6); iMax < Math.min(i2, iMin); iMax++) {
                        m20139(iMax, m20153(iMax) + i3);
                    }
                    m20137(i5, iMin - i6);
                }
            }
        }
        if (i4 != 0) {
            m20140();
            while (i < i2) {
                int[] iArr2 = this.f23112;
                iArr2[i] = iArr2[i] + i4;
                i++;
            }
            m20138();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20140() {
        if (this.f23112 != null) {
            return;
        }
        int[] iArr = new int[m20142()];
        for (int i = 0; i < this.f23106; i++) {
            iArr[i] = m20151(i);
        }
        this.f23112 = iArr;
        this.f23113 = null;
        this.f23116 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20138() {
        int[] iArr = this.f23112;
        if (iArr == null || this.f23106 == 0) {
            return;
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = this.f23106;
            if (i3 < i5) {
                int[] iArr2 = this.f23112;
                int i6 = iArr2[i3] - iArr2[i3 - 1];
                if (i6 != 0 && i6 != 1) {
                    return;
                }
                i4 += i6;
                i3++;
            } else {
                if (i4 != 0 && i4 != i5 - 1) {
                    Object[] objArr = this.f23121;
                    this.f23113 = new long[objArr.length];
                    this.f23116 = new char[objArr.length];
                    for (int i7 = 1; i7 < this.f23106; i7++) {
                        int[] iArr3 = this.f23112;
                        if (iArr3[i7] != iArr3[i7 - 1]) {
                            long[] jArr = this.f23113;
                            int i8 = i7 >>> 6;
                            jArr[i8] = jArr[i8] | (1 << i7);
                        }
                    }
                    int iBitCount = 0;
                    while (true) {
                        long[] jArr2 = this.f23113;
                        if (i >= jArr2.length) {
                            break;
                        }
                        this.f23116[i] = (char) iBitCount;
                        iBitCount += Long.bitCount(jArr2[i]);
                        i++;
                    }
                } else {
                    this.f23108 = i4 != 0 ? 1 : 0;
                }
                this.f23122 += i2;
                this.f23112 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20141() {
        for (int i = 0; i < this.f23121.length; i++) {
            int iMin = Math.min(64, this.f23106 - (i << 6));
            if (iMin <= 0) {
                this.f23121[i] = null;
            } else {
                m20137(i, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20137(int i, int i2) {
        Object obj = this.f23121[i];
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
            int[] iArr2 = this.f23120;
            iArr2[i] = iArr2[i] + iMin;
            this.f23121[i] = cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m20136() {
        m20141();
        m20138();
        if (this.f23110 == null) {
            return;
        }
        for (int i = 0; i < this.f23106; i++) {
            if ((this.f23110[i] & (-65536)) != 0) {
                return;
            }
        }
        this.f23111 = new char[m20142()];
        for (int i2 = 0; i2 < this.f23106; i2++) {
            this.f23111[i2] = (char) this.f23110[i2];
        }
        this.f23110 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7513 m20143(int i, int i2) {
        int i3 = i2 - i;
        C7513 c7513 = new C7513(i3, this.f23111 != null);
        c7513.f23114 = i3;
        c7513.f23106 = i3;
        c7513.f23107 = this.f23107;
        c7513.f23122 = this.f23122;
        c7513.f23108 = this.f23108;
        if (i == 0 && i2 == this.f23106) {
            int[] iArr = this.f23120;
            int[] iArr2 = c7513.f23120;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            for (int i4 = 0; i4 < c7513.f23121.length; i4++) {
                int iMin = Math.min(64, c7513.m20142() - (i4 << 6));
                Object obj = this.f23121[i4];
                c7513.f23121[i4] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin) : Arrays.copyOf((int[]) obj, iMin);
            }
        } else {
            for (int i5 = 0; i5 < c7513.f23106; i5++) {
                c7513.m20139(i5, m20153(i5 + i));
            }
        }
        char[] cArr = this.f23111;
        if (cArr != null) {
            System.arraycopy(cArr, i, c7513.f23111, 0, c7513.f23106);
        } else {
            System.arraycopy(this.f23110, i, c7513.f23110, 0, c7513.f23106);
        }
        if (this.f23112 == null && this.f23113 == null) {
            c7513.f23122 = (this.f23108 * i) + c7513.f23122;
        } else {
            long[] jArr = this.f23113;
            if (jArr != null && i == 0 && i2 == this.f23106) {
                c7513.f23113 = Arrays.copyOf(jArr, c7513.f23121.length);
                c7513.f23116 = Arrays.copyOf(this.f23116, c7513.f23121.length);
            } else {
                c7513.f23112 = new int[c7513.m20142()];
                for (int i6 = 0; i6 < c7513.f23106; i6++) {
                    c7513.f23112[i6] = m20151(i6 + i);
                }
            }
        }
        if (i != 0 || i2 != this.f23106) {
            c7513.m20136();
        }
        if (this.f23117 != null) {
            for (int i7 = i; i7 < i2; i7++) {
                c7513.m20147(i7 - i, m20150(i7));
            }
        }
        return c7513;
    }
}
