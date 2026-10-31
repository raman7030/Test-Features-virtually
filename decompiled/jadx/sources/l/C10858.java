package l;

/* JADX INFO: renamed from: l.ۧ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7513 f32615;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32616;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27149() {
        C7513 c7513 = this.f32615;
        if (c7513 == null) {
            return 0;
        }
        return c7513.f23114;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27143() {
        this.f32615 = null;
        this.f32616++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27152(int i, C11747 c11747) {
        m27126(i);
        C7513 c7513 = this.f32615;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C7513 c7514 = c7513.f23123;
            int i4 = c7514 == null ? 0 : c7514.f23114;
            if (i >= i4 && i < c7513.f23106 + i4) {
                c7513.m20149(i - i4, c11747);
                c11747.f35062 += i2;
                c11747.f35063 += i2;
                c11747.f35064 += i3;
                return;
            }
            i2 += c7513.f23118;
            i3 += c7513.f23115;
            if (i < i4) {
                c7513 = c7514;
            } else {
                i -= i4 + c7513.f23106;
                c7513 = c7513.f23109;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27150(int i, int i2) {
        int i3;
        int iM20151;
        m27126(i);
        C7513 c7513 = this.f32615;
        int i4 = 0;
        while (true) {
            C7513 c7514 = c7513.f23123;
            i3 = c7514 == null ? 0 : c7514.f23114;
            if (i >= i3 && i < c7513.f23106 + i3) {
                break;
            }
            i4 += i2 == 2 ? c7513.f23115 : c7513.f23118;
            if (i < i3) {
                c7513 = c7514;
            } else {
                i -= i3 + c7513.f23106;
                c7513 = c7513.f23109;
            }
        }
        int i5 = i - i3;
        if (i2 == 2) {
            iM20151 = c7513.m20151(i5) + c7513.f23122;
        } else {
            int iM20153 = c7513.m20153(i5) + c7513.f23107;
            if (i2 == 0) {
                iM20151 = iM20153;
            } else {
                char[] cArr = c7513.f23111;
                iM20151 = (cArr != null ? cArr[i5] : c7513.f23110[i5]) + iM20153;
            }
        }
        return iM20151 + i4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27153(int i, C11747 c11747) {
        m27126(i);
        C7513 c7513 = this.f32615;
        m27135(c7513, i, c11747);
        this.f32615 = c7513;
        this.f32616++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27135(C7513 c7513, int i, C11747 c11747) {
        m27139(c7513);
        C7513 c7514 = c7513.f23123;
        int i2 = c7514 == null ? 0 : c7514.f23114;
        if (i < i2) {
            m27135(c7514, i, c11747);
            return;
        }
        int i3 = c7513.f23106;
        if (i >= i2 + i3) {
            m27135(c7513.f23109, (i - i2) - i3, c11747);
        } else {
            c7513.m20152(i - i2, c11747);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27147(int i, C11747 c11747) {
        if (i < 0 || i > m27149()) {
            throw new IndexOutOfBoundsException();
        }
        this.f32615 = m27123(this.f32615, i, c11747);
        this.f32616++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7513 m27123(C7513 c7513, int i, C11747 c11747) {
        if (c7513 == null) {
            C7513 c7514 = new C7513(8);
            c7514.m20148(c11747);
            return c7514;
        }
        m27139(c7513);
        C7513 c7515 = c7513.f23123;
        int i2 = c7515 == null ? 0 : c7515.f23114;
        if (i < i2) {
            c7513.f23123 = m27123(c7515, i, c11747);
        } else {
            int i3 = c7513.f23106;
            if (i > i2 + i3) {
                c7513.f23109 = m27123(c7513.f23109, (i - i2) - i3, c11747);
            } else if (i3 < 1024) {
                c7513.m20146(i - i2, c11747);
            } else if (i == i3 + i2) {
                c7513.f23109 = m27123(c7513.f23109, 0, c11747);
            } else {
                C7513 c7513M20143 = c7513.m20143(512, 1024);
                C7513 c7516 = c7513.f23109;
                c7513.f23106 = 512;
                c7513.m20136();
                int i4 = i - i2;
                int i5 = c7513.f23106;
                if (i4 <= i5) {
                    c7513.m20146(i4, c11747);
                } else {
                    c7513M20143 = m27123(c7513M20143, i4 - i5, c11747);
                }
                c7513.f23109 = null;
                m27142(c7513);
                return m27125(c7513.f23123, c7513, m27141(c7513M20143, c7516));
            }
        }
        return m27122(c7513);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27151(int i, int i2, C10858 c10858) {
        if (i < 0 || i2 < i || i2 > m27149()) {
            throw new IndexOutOfBoundsException();
        }
        C7513 c7513M27131 = m27131(c10858.f32615);
        C1685 c1685M27121 = m27121(this.f32615, i);
        this.f32615 = m27138(m27138(c1685M27121.f5851, c7513M27131), m27121(c1685M27121.f5852, i2 - i).f5852);
        this.f32616++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27146(int i, int i2, C10858 c10858) {
        if (i < 0 || i2 < i || i2 > c10858.m27149()) {
            throw new IndexOutOfBoundsException();
        }
        this.f32615 = m27138(this.f32615, m27132(c10858.f32615, i, i2));
        this.f32616++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27148(C10858 c10858) {
        if (c10858 == this) {
            throw new IllegalArgumentException("Cannot transfer a line table to itself");
        }
        C7513 c7513 = c10858.f32615;
        if (c7513 == null) {
            return false;
        }
        c10858.m27143();
        this.f32615 = m27138(this.f32615, c7513);
        this.f32616++;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7513 m27132(C7513 c7513, int i, int i2) {
        if (i == i2) {
            return null;
        }
        if (i == 0 && i2 == c7513.f23114) {
            return m27131(c7513);
        }
        C7513 c7514 = c7513.f23123;
        int i3 = c7514 == null ? 0 : c7514.f23114;
        int i4 = c7513.f23106 + i3;
        C7513 c7513M27132 = i < i3 ? m27132(c7514, i, Math.min(i3, i2)) : null;
        C7513 c7513M27133 = i2 > i4 ? m27132(c7513.f23109, Math.max(0, i - i4), i2 - i4) : null;
        m27140(c7513M27132, c7513.f23118, c7513.f23115);
        m27140(c7513M27133, c7513.f23118, c7513.f23115);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(c7513.f23106, i2 - i3);
        return iMax < iMin ? m27125(c7513M27132, c7513.m20143(iMax, iMin), c7513M27133) : m27141(c7513M27132, c7513M27133);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27145(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < i || i2 > m27149()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != i2) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            m27128(this.f32615, i, i2, i3, i4);
            this.f32616++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27128(C7513 c7513, int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == c7513.f23114) {
            m27140(c7513, i3, i4);
            return;
        }
        m27139(c7513);
        C7513 c7514 = c7513.f23123;
        int i5 = c7514 == null ? 0 : c7514.f23114;
        int i6 = c7513.f23106 + i5;
        if (i < i5) {
            m27128(c7514, i, Math.min(i2, i5), i3, i4);
        }
        c7513.m20145(Math.max(0, i - i5), Math.min(c7513.f23106, i2 - i5), i3, i4);
        if (i2 > i6) {
            m27128(c7513.f23109, Math.max(0, i - i6), i2 - i6, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27126(int i) {
        if (i < 0 || i >= m27149()) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Line index: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27144(int i, int i2) {
        if (i < 0 || i2 < i || i2 > m27149()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return;
        }
        m27127(this.f32615, i, i2);
        this.f32616++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27127(C7513 c7513, int i, int i2) {
        C7513 c7514 = c7513.f23123;
        int i3 = c7514 == null ? 0 : c7514.f23114;
        int i4 = c7513.f23106 + i3;
        if (i < i3) {
            m27127(c7514, i, Math.min(i2, i3));
        }
        if (i < i4 && i2 > i3) {
            c7513.m20136();
        }
        if (i2 > i4) {
            m27127(c7513.f23109, Math.max(0, i - i4), i2 - i4);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7513 m27131(C7513 c7513) {
        if (c7513 == null) {
            return null;
        }
        C7513 c7513M20143 = c7513.m20143(0, c7513.f23106);
        c7513M20143.f23123 = m27131(c7513.f23123);
        c7513M20143.f23109 = m27131(c7513.f23109);
        c7513M20143.f23118 = c7513.f23118;
        c7513M20143.f23115 = c7513.f23115;
        m27142(c7513M20143);
        return c7513M20143;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1685 m27121(C7513 c7513, int i) {
        if (c7513 == null) {
            return new C1685(null, null);
        }
        m27139(c7513);
        C7513 c7513M27125 = c7513.f23123;
        int i2 = c7513M27125 == null ? 0 : c7513M27125.f23114;
        if (i < i2) {
            C1685 c1685M27121 = m27121(c7513M27125, i);
            return new C1685(c1685M27121.f5851, m27125(c1685M27121.f5852, c7513, c7513.f23109));
        }
        int i3 = c7513.f23106;
        if (i > i2 + i3) {
            C1685 c1685M27122 = m27121(c7513.f23109, (i - i2) - i3);
            return new C1685(m27125(c7513.f23123, c7513, c1685M27122.f5851), c1685M27122.f5852);
        }
        int i4 = i - i2;
        if (i4 != 0) {
            c7513M27125 = m27125(c7513M27125, c7513.m20143(0, i4), (C7513) null);
        }
        int i5 = c7513.f23106;
        return new C1685(c7513M27125, i4 == i5 ? c7513.f23109 : m27125((C7513) null, c7513.m20143(i4, i5), c7513.f23109));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7513 m27138(C7513 c7513, C7513 c7514) {
        if (c7513 == null) {
            return c7514;
        }
        if (c7514 == null) {
            return c7513;
        }
        C7513 c7515 = c7513;
        while (true) {
            C7513 c7516 = c7515.f23109;
            if (c7516 == null) {
                break;
            }
            c7515 = c7516;
        }
        C7513 c7517 = c7514;
        while (true) {
            C7513 c7518 = c7517.f23123;
            if (c7518 == null) {
                break;
            }
            c7517 = c7518;
        }
        int i = c7515.f23106;
        int i2 = c7517.f23106;
        int i3 = i + i2;
        if (i3 > 1024 && i >= 512 && i2 >= 512) {
            return m27141(c7513, c7514);
        }
        C1685 c1685M27121 = m27121(c7513, c7513.f23114 - i);
        C1685 c1685M27122 = m27121(c7514, c7517.f23106);
        C7513 c7519 = c1685M27121.f5852;
        C7513 c75110 = c1685M27122.f5851;
        m27139(c7519);
        m27139(c75110);
        C7513 c75111 = i3 > 1024 ? new C7513((i3 + 1) / 2) : null;
        int i4 = c75111 == null ? i3 : i3 / 2;
        C7513 c75112 = new C7513(i4);
        C11747 c11747 = new C11747();
        int i5 = 0;
        while (i5 < i3) {
            int i6 = c7519.f23106;
            (i5 < i6 ? c7519 : c75110).m20149(i5 < i6 ? i5 : i5 - i6, c11747);
            (i5 < i4 ? c75112 : c75111).m20148(c11747);
            i5++;
        }
        return m27141(m27141(c1685M27121.f5851, c75112), m27141(c75111, c1685M27122.f5852));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7513 m27141(C7513 c7513, C7513 c7514) {
        if (c7513 == null) {
            return c7514;
        }
        if (c7514 == null) {
            return c7513;
        }
        m27139(c7513);
        C7513 c7515 = c7513.f23109;
        if (c7515 == null) {
            return m27125(c7513.f23123, c7513, c7514);
        }
        C7513 c7513M27141 = m27141(c7515, c7514);
        c7513.f23109 = c7513M27141;
        return m27125(c7513.f23123, c7513, c7513M27141);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7513 m27122(C7513 c7513) {
        m27142(c7513);
        C7513 c7514 = c7513.f23123;
        int i = c7514 == null ? 0 : c7514.f23119;
        C7513 c7515 = c7513.f23109;
        if (i > (c7515 == null ? 0 : c7515.f23119) + 1) {
            C7513 c7516 = c7514.f23123;
            int i2 = c7516 == null ? 0 : c7516.f23119;
            C7513 c7517 = c7514.f23109;
            if (i2 < (c7517 != null ? c7517.f23119 : 0)) {
                m27139(c7514);
                C7513 c7518 = c7514.f23109;
                m27139(c7518);
                c7514.f23109 = c7518.f23123;
                c7518.f23123 = c7514;
                m27142(c7514);
                m27142(c7518);
                c7513.f23123 = c7518;
            }
            m27139(c7513);
            C7513 c7519 = c7513.f23123;
            m27139(c7519);
            c7513.f23123 = c7519.f23109;
            c7519.f23109 = c7513;
            m27142(c7513);
            m27142(c7519);
            return c7519;
        }
        if ((c7515 == null ? 0 : c7515.f23119) <= (c7514 == null ? 0 : c7514.f23119) + 1) {
            return c7513;
        }
        C7513 c75110 = c7515.f23109;
        int i3 = c75110 == null ? 0 : c75110.f23119;
        C7513 c75111 = c7515.f23123;
        if (i3 < (c75111 != null ? c75111.f23119 : 0)) {
            m27139(c7515);
            C7513 c75112 = c7515.f23123;
            m27139(c75112);
            c7515.f23123 = c75112.f23109;
            c75112.f23109 = c7515;
            m27142(c7515);
            m27142(c75112);
            c7513.f23109 = c75112;
        }
        m27139(c7513);
        C7513 c75113 = c7513.f23109;
        m27139(c75113);
        c7513.f23109 = c75113.f23123;
        c75113.f23123 = c7513;
        m27142(c7513);
        m27142(c75113);
        return c75113;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7513 m27125(C7513 c7513, C7513 c7514, C7513 c7515) {
        if ((c7513 == null ? 0 : c7513.f23119) > (c7515 == null ? 0 : c7515.f23119) + 1) {
            m27139(c7513);
            c7513.f23109 = m27125(c7513.f23109, c7514, c7515);
            return m27122(c7513);
        }
        if ((c7515 == null ? 0 : c7515.f23119) > (c7513 != null ? c7513.f23119 : 0) + 1) {
            m27139(c7515);
            c7515.f23123 = m27125(c7513, c7514, c7515.f23123);
            return m27122(c7515);
        }
        c7514.f23123 = c7513;
        c7514.f23109 = c7515;
        m27142(c7514);
        return c7514;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m27142(C7513 c7513) {
        C7513 c7514 = c7513.f23123;
        int i = (c7514 == null ? 0 : c7514.f23114) + c7513.f23106;
        C7513 c7515 = c7513.f23109;
        c7513.f23114 = i + (c7515 == null ? 0 : c7515.f23114);
        c7513.f23119 = Math.max(c7514 == null ? 0 : c7514.f23119, c7515 != null ? c7515.f23119 : 0) + 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27140(C7513 c7513, int i, int i2) {
        if (c7513 == null) {
            return;
        }
        c7513.f23107 += i;
        c7513.f23122 += i2;
        c7513.f23118 += i;
        c7513.f23115 += i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27139(C7513 c7513) {
        int i = c7513.f23118;
        if (i == 0 && c7513.f23115 == 0) {
            return;
        }
        m27140(c7513.f23123, i, c7513.f23115);
        m27140(c7513.f23109, c7513.f23118, c7513.f23115);
        c7513.f23115 = 0;
        c7513.f23118 = 0;
    }
}
