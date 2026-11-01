package p067l;

/* JADX INFO: renamed from: l.ۧ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12688 {

    /* JADX INFO: renamed from: ֫ */
    public C9509 f35591;

    /* JADX INFO: renamed from: ۧ */
    public int f35592;

    /* JADX INFO: renamed from: ۧ */
    public final int m29194() {
        C9509 c9509 = this.f35591;
        if (c9509 == null) {
            return 0;
        }
        return c9509.f26026;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29188() {
        this.f35591 = null;
        this.f35592++;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29197(int i, C13533 c13533) {
        m29171(i);
        C9509 c9509 = this.f35591;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C9509 c95010 = c9509.f26035;
            int i4 = c95010 == null ? 0 : c95010.f26026;
            if (i >= i4 && i < c9509.f26018 + i4) {
                c9509.m22125(i - i4, c13533);
                c13533.f38061 += i2;
                c13533.f38062 += i2;
                c13533.f38063 += i3;
                return;
            }
            i2 += c9509.f26030;
            i3 += c9509.f26027;
            if (i < i4) {
                c9509 = c95010;
            } else {
                i -= i4 + c9509.f26018;
                c9509 = c9509.f26021;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29195(int i, int i2) {
        int i3;
        int iM22127;
        m29171(i);
        C9509 c9509 = this.f35591;
        int i4 = 0;
        while (true) {
            C9509 c95010 = c9509.f26035;
            i3 = c95010 == null ? 0 : c95010.f26026;
            if (i >= i3 && i < c9509.f26018 + i3) {
                break;
            }
            i4 += i2 == 2 ? c9509.f26027 : c9509.f26030;
            if (i < i3) {
                c9509 = c95010;
            } else {
                i -= i3 + c9509.f26018;
                c9509 = c9509.f26021;
            }
        }
        int i5 = i - i3;
        if (i2 == 2) {
            iM22127 = c9509.m22127(i5) + c9509.f26034;
        } else {
            int iM22129 = c9509.m22129(i5) + c9509.f26019;
            if (i2 == 0) {
                iM22127 = iM22129;
            } else {
                char[] cArr = c9509.f26023;
                iM22127 = (cArr != null ? cArr[i5] : c9509.f26022[i5]) + iM22129;
            }
        }
        return iM22127 + i4;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29198(int i, C13533 c13533) {
        m29171(i);
        C9509 c9509 = this.f35591;
        m29180(c9509, i, c13533);
        this.f35591 = c9509;
        this.f35592++;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29180(C9509 c9509, int i, C13533 c13533) {
        m29184(c9509);
        C9509 c95010 = c9509.f26035;
        int i2 = c95010 == null ? 0 : c95010.f26026;
        if (i < i2) {
            m29180(c95010, i, c13533);
            return;
        }
        int i3 = c9509.f26018;
        if (i >= i2 + i3) {
            m29180(c9509.f26021, (i - i2) - i3, c13533);
        } else {
            c9509.m22128(i - i2, c13533);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29192(int i, C13533 c13533) {
        if (i < 0 || i > m29194()) {
            throw new IndexOutOfBoundsException();
        }
        this.f35591 = m29168(this.f35591, i, c13533);
        this.f35592++;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9509 m29168(C9509 c9509, int i, C13533 c13533) {
        if (c9509 == null) {
            C9509 c95010 = new C9509(8);
            c95010.m22124(c13533);
            return c95010;
        }
        m29184(c9509);
        C9509 c95011 = c9509.f26035;
        int i2 = c95011 == null ? 0 : c95011.f26026;
        if (i < i2) {
            c9509.f26035 = m29168(c95011, i, c13533);
        } else {
            int i3 = c9509.f26018;
            if (i > i2 + i3) {
                c9509.f26021 = m29168(c9509.f26021, (i - i2) - i3, c13533);
            } else if (i3 < 1024) {
                c9509.m22122(i - i2, c13533);
            } else if (i == i3 + i2) {
                c9509.f26021 = m29168(c9509.f26021, 0, c13533);
            } else {
                C9509 c9509M22119 = c9509.m22119(512, 1024);
                C9509 c95012 = c9509.f26021;
                c9509.f26018 = 512;
                c9509.m22112();
                int i4 = i - i2;
                int i5 = c9509.f26018;
                if (i4 <= i5) {
                    c9509.m22122(i4, c13533);
                } else {
                    c9509M22119 = m29168(c9509M22119, i4 - i5, c13533);
                }
                c9509.f26021 = null;
                m29187(c9509);
                return m29170(c9509.f26035, c9509, m29186(c9509M22119, c95012));
            }
        }
        return m29167(c9509);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29196(int i, int i2, C12688 c12688) {
        if (i < 0 || i2 < i || i2 > m29194()) {
            throw new IndexOutOfBoundsException();
        }
        C9509 c9509M29176 = m29176(c12688.f35591);
        C3970 c3970M29166 = m29166(this.f35591, i);
        this.f35591 = m29183(m29183(c3970M29166.f8629, c9509M29176), m29166(c3970M29166.f8630, i2 - i).f8630);
        this.f35592++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29191(int i, int i2, C12688 c12688) {
        if (i < 0 || i2 < i || i2 > c12688.m29194()) {
            throw new IndexOutOfBoundsException();
        }
        this.f35591 = m29183(this.f35591, m29177(c12688.f35591, i, i2));
        this.f35592++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29193(C12688 c12688) {
        if (c12688 == this) {
            throw new IllegalArgumentException("Cannot transfer a line table to itself");
        }
        C9509 c9509 = c12688.f35591;
        if (c9509 == null) {
            return false;
        }
        c12688.m29188();
        this.f35591 = m29183(this.f35591, c9509);
        this.f35592++;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9509 m29177(C9509 c9509, int i, int i2) {
        if (i == i2) {
            return null;
        }
        if (i == 0 && i2 == c9509.f26026) {
            return m29176(c9509);
        }
        C9509 c95010 = c9509.f26035;
        int i3 = c95010 == null ? 0 : c95010.f26026;
        int i4 = c9509.f26018 + i3;
        C9509 c9509M29177 = i < i3 ? m29177(c95010, i, Math.min(i3, i2)) : null;
        C9509 c9509M29178 = i2 > i4 ? m29177(c9509.f26021, Math.max(0, i - i4), i2 - i4) : null;
        m29185(c9509M29177, c9509.f26030, c9509.f26027);
        m29185(c9509M29178, c9509.f26030, c9509.f26027);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(c9509.f26018, i2 - i3);
        return iMax < iMin ? m29170(c9509M29177, c9509.m22119(iMax, iMin), c9509M29178) : m29186(c9509M29177, c9509M29178);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29190(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < i || i2 > m29194()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != i2) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            m29173(this.f35591, i, i2, i3, i4);
            this.f35592++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29173(C9509 c9509, int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == c9509.f26026) {
            m29185(c9509, i3, i4);
            return;
        }
        m29184(c9509);
        C9509 c95010 = c9509.f26035;
        int i5 = c95010 == null ? 0 : c95010.f26026;
        int i6 = c9509.f26018 + i5;
        if (i < i5) {
            m29173(c95010, i, Math.min(i2, i5), i3, i4);
        }
        c9509.m22121(Math.max(0, i - i5), Math.min(c9509.f26018, i2 - i5), i3, i4);
        if (i2 > i6) {
            m29173(c9509.f26021, Math.max(0, i - i6), i2 - i6, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m29171(int i) {
        if (i < 0 || i >= m29194()) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Line index: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29189(int i, int i2) {
        if (i < 0 || i2 < i || i2 > m29194()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return;
        }
        m29172(this.f35591, i, i2);
        this.f35592++;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29172(C9509 c9509, int i, int i2) {
        C9509 c95010 = c9509.f26035;
        int i3 = c95010 == null ? 0 : c95010.f26026;
        int i4 = c9509.f26018 + i3;
        if (i < i3) {
            m29172(c95010, i, Math.min(i2, i3));
        }
        if (i < i4 && i2 > i3) {
            c9509.m22112();
        }
        if (i2 > i4) {
            m29172(c9509.f26021, Math.max(0, i - i4), i2 - i4);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9509 m29176(C9509 c9509) {
        if (c9509 == null) {
            return null;
        }
        C9509 c9509M22119 = c9509.m22119(0, c9509.f26018);
        c9509M22119.f26035 = m29176(c9509.f26035);
        c9509M22119.f26021 = m29176(c9509.f26021);
        c9509M22119.f26030 = c9509.f26030;
        c9509M22119.f26027 = c9509.f26027;
        m29187(c9509M22119);
        return c9509M22119;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3970 m29166(C9509 c9509, int i) {
        if (c9509 == null) {
            return new C3970(null, null);
        }
        m29184(c9509);
        C9509 c9509M29170 = c9509.f26035;
        int i2 = c9509M29170 == null ? 0 : c9509M29170.f26026;
        if (i < i2) {
            C3970 c3970M29166 = m29166(c9509M29170, i);
            return new C3970(c3970M29166.f8629, m29170(c3970M29166.f8630, c9509, c9509.f26021));
        }
        int i3 = c9509.f26018;
        if (i > i2 + i3) {
            C3970 c3970M29167 = m29166(c9509.f26021, (i - i2) - i3);
            return new C3970(m29170(c9509.f26035, c9509, c3970M29167.f8629), c3970M29167.f8630);
        }
        int i4 = i - i2;
        if (i4 != 0) {
            c9509M29170 = m29170(c9509M29170, c9509.m22119(0, i4), (C9509) null);
        }
        int i5 = c9509.f26018;
        return new C3970(c9509M29170, i4 == i5 ? c9509.f26021 : m29170((C9509) null, c9509.m22119(i4, i5), c9509.f26021));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C9509 m29183(C9509 c9509, C9509 c95010) {
        if (c9509 == null) {
            return c95010;
        }
        if (c95010 == null) {
            return c9509;
        }
        C9509 c95011 = c9509;
        while (true) {
            C9509 c95012 = c95011.f26021;
            if (c95012 == null) {
                break;
            }
            c95011 = c95012;
        }
        C9509 c95013 = c95010;
        while (true) {
            C9509 c95014 = c95013.f26035;
            if (c95014 == null) {
                break;
            }
            c95013 = c95014;
        }
        int i = c95011.f26018;
        int i2 = c95013.f26018;
        int i3 = i + i2;
        if (i3 > 1024 && i >= 512 && i2 >= 512) {
            return m29186(c9509, c95010);
        }
        C3970 c3970M29166 = m29166(c9509, c9509.f26026 - i);
        C3970 c3970M29167 = m29166(c95010, c95013.f26018);
        C9509 c95015 = c3970M29166.f8630;
        C9509 c95016 = c3970M29167.f8629;
        m29184(c95015);
        m29184(c95016);
        C9509 c95017 = i3 > 1024 ? new C9509((i3 + 1) / 2) : null;
        int i4 = c95017 == null ? i3 : i3 / 2;
        C9509 c95018 = new C9509(i4);
        C13533 c13533 = new C13533();
        int i5 = 0;
        while (i5 < i3) {
            int i6 = c95015.f26018;
            (i5 < i6 ? c95015 : c95016).m22125(i5 < i6 ? i5 : i5 - i6, c13533);
            (i5 < i4 ? c95018 : c95017).m22124(c13533);
            i5++;
        }
        return m29186(m29186(c3970M29166.f8629, c95018), m29186(c95017, c3970M29167.f8630));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C9509 m29186(C9509 c9509, C9509 c95010) {
        if (c9509 == null) {
            return c95010;
        }
        if (c95010 == null) {
            return c9509;
        }
        m29184(c9509);
        C9509 c95011 = c9509.f26021;
        if (c95011 == null) {
            return m29170(c9509.f26035, c9509, c95010);
        }
        C9509 c9509M29186 = m29186(c95011, c95010);
        c9509.f26021 = c9509M29186;
        return m29170(c9509.f26035, c9509, c9509M29186);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9509 m29167(C9509 c9509) {
        m29187(c9509);
        C9509 c95010 = c9509.f26035;
        int i = c95010 == null ? 0 : c95010.f26031;
        C9509 c95011 = c9509.f26021;
        if (i > (c95011 == null ? 0 : c95011.f26031) + 1) {
            C9509 c95012 = c95010.f26035;
            int i2 = c95012 == null ? 0 : c95012.f26031;
            C9509 c95013 = c95010.f26021;
            if (i2 < (c95013 != null ? c95013.f26031 : 0)) {
                m29184(c95010);
                C9509 c95014 = c95010.f26021;
                m29184(c95014);
                c95010.f26021 = c95014.f26035;
                c95014.f26035 = c95010;
                m29187(c95010);
                m29187(c95014);
                c9509.f26035 = c95014;
            }
            m29184(c9509);
            C9509 c95015 = c9509.f26035;
            m29184(c95015);
            c9509.f26035 = c95015.f26021;
            c95015.f26021 = c9509;
            m29187(c9509);
            m29187(c95015);
            return c95015;
        }
        if ((c95011 == null ? 0 : c95011.f26031) <= (c95010 == null ? 0 : c95010.f26031) + 1) {
            return c9509;
        }
        C9509 c95016 = c95011.f26021;
        int i3 = c95016 == null ? 0 : c95016.f26031;
        C9509 c95017 = c95011.f26035;
        if (i3 < (c95017 != null ? c95017.f26031 : 0)) {
            m29184(c95011);
            C9509 c95018 = c95011.f26035;
            m29184(c95018);
            c95011.f26035 = c95018.f26021;
            c95018.f26021 = c95011;
            m29187(c95011);
            m29187(c95018);
            c9509.f26021 = c95018;
        }
        m29184(c9509);
        C9509 c95019 = c9509.f26021;
        m29184(c95019);
        c9509.f26021 = c95019.f26035;
        c95019.f26035 = c9509;
        m29187(c9509);
        m29187(c95019);
        return c95019;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9509 m29170(C9509 c9509, C9509 c95010, C9509 c95011) {
        if ((c9509 == null ? 0 : c9509.f26031) > (c95011 == null ? 0 : c95011.f26031) + 1) {
            m29184(c9509);
            c9509.f26021 = m29170(c9509.f26021, c95010, c95011);
            return m29167(c9509);
        }
        if ((c95011 == null ? 0 : c95011.f26031) > (c9509 != null ? c9509.f26031 : 0) + 1) {
            m29184(c95011);
            c95011.f26035 = m29170(c9509, c95010, c95011.f26035);
            return m29167(c95011);
        }
        c95010.f26035 = c9509;
        c95010.f26021 = c95011;
        m29187(c95010);
        return c95010;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m29187(C9509 c9509) {
        C9509 c95010 = c9509.f26035;
        int i = (c95010 == null ? 0 : c95010.f26026) + c9509.f26018;
        C9509 c95011 = c9509.f26021;
        c9509.f26026 = i + (c95011 == null ? 0 : c95011.f26026);
        c9509.f26031 = Math.max(c95010 == null ? 0 : c95010.f26031, c95011 != null ? c95011.f26031 : 0) + 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29185(C9509 c9509, int i, int i2) {
        if (c9509 == null) {
            return;
        }
        c9509.f26019 += i;
        c9509.f26034 += i2;
        c9509.f26030 += i;
        c9509.f26027 += i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29184(C9509 c9509) {
        int i = c9509.f26030;
        if (i == 0 && c9509.f26027 == 0) {
            return;
        }
        m29185(c9509.f26035, i, c9509.f26027);
        m29185(c9509.f26021, c9509.f26030, c9509.f26027);
        c9509.f26027 = 0;
        c9509.f26030 = 0;
    }
}
