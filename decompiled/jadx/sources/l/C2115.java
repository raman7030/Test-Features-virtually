package l;

/* JADX INFO: renamed from: l.֫᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2115 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f7063;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f7064;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19049[] f7065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f7066;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7062 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7067 = 0;

    public C2115(int i, int i2, int i3) {
        this.f7063 = i;
        this.f7064 = i2;
        this.f7066 = i3;
        this.f7065 = new C19049[i2];
        m7005(0, 0, i, i3, 32, C23924.f77597);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7002(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f7063;
        int i9 = -this.f7062;
        if (i2 >= i9) {
            i9 = i2;
        }
        int i10 = this.f7066;
        int i11 = i4 >= i10 ? i10 - 1 : i4;
        int i12 = i9;
        while (i12 <= i11) {
            int i13 = i12 == i9 ? i : 0;
            if (i12 != i11 || (i5 = i3 + 1) > i8) {
                i5 = i8;
            }
            C19049 c19049 = this.f7065[m7010(i12)];
            int iM43904 = c19049.m43904(i13);
            int iM43905 = i5 < this.f7063 ? c19049.m43904(i5) : c19049.m43903();
            if (iM43905 == iM43904) {
                iM43905 = c19049.m43904(i5 + 1);
            }
            char[] cArr = c19049.f59996;
            boolean z = this.f7065[m7010(i12)].f59997;
            if (z && i5 == i8) {
                i6 = iM43905 - 1;
            } else {
                int i14 = -1;
                for (int i15 = iM43904; i15 < iM43905; i15++) {
                    if (cArr[i15] != ' ') {
                        i14 = i15;
                    }
                }
                i6 = i14;
            }
            if (i6 != -1 && (i7 = (i6 - iM43904) + 1) > 0) {
                sb.append(cArr, iM43904, i7);
            }
            if (!z && i12 < i11 && i12 < this.f7066 - 1) {
                sb.append('\n');
            }
            i12++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7009() {
        return this.f7062;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m7011() {
        return m7002(0, -this.f7062, this.f7063, this.f7066).trim();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7001() {
        return this.f7062 + this.f7066;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7010(int i) {
        if (i < (-this.f7062) || i > this.f7066) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f7067 + i;
        int i3 = this.f7064;
        return i2 < 0 ? i3 + i2 : i2 % i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0204  */
    /* JADX WARN: Code duplicated, block: B:129:0x020b  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7007(int i, int i2, int i3, int[] iArr, long j, boolean z) {
        C19049[] c19049Arr;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM43903;
        boolean z3;
        int i7;
        long j2;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        int codePoint;
        int iM18920;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        if (i == this.f7063 && i2 <= this.f7064) {
            int i19 = this.f7066;
            int i20 = i19 - i2;
            if (i20 > 0 && i20 < i19) {
                for (int i21 = i19 - 1; i21 > 0 && iArr[1] < i21; i21--) {
                    C19049 c19049 = this.f7065[m7010(i21)];
                    if ((c19049 == null || c19049.m43909()) && (i20 = i20 - 1) == 0) {
                        break;
                    }
                }
            } else if (i20 < 0 && i20 != (iMax = Math.max(i20, -this.f7062))) {
                for (int i22 = 0; i22 < iMax - i20; i22++) {
                    m7003(((this.f7067 + this.f7066) + i22) % this.f7064).m43906(j);
                }
                i20 = iMax;
            }
            int i23 = this.f7067 + i20;
            this.f7067 = i23;
            int i24 = this.f7064;
            this.f7067 = i23 < 0 ? i23 + i24 : i23 % i24;
            this.f7064 = i3;
            this.f7062 = z ? 0 : Math.max(0, this.f7062 + i20);
            iArr[1] = iArr[1] - i20;
            this.f7066 = i2;
        } else {
            C19049[] c19049Arr2 = this.f7065;
            this.f7065 = new C19049[i3];
            for (int i25 = 0; i25 < i3; i25++) {
                this.f7065[i25] = new C19049(i, j);
            }
            int i26 = this.f7062;
            int i27 = this.f7067;
            int i28 = this.f7066;
            int i29 = this.f7064;
            this.f7064 = i3;
            this.f7066 = i2;
            this.f7067 = 0;
            this.f7062 = 0;
            this.f7063 = i;
            int i30 = iArr[1];
            int i31 = iArr[0];
            int i32 = -i26;
            int i33 = -1;
            int i34 = -1;
            boolean z5 = false;
            int i35 = 0;
            int i36 = 0;
            int i37 = i32;
            int i38 = 0;
            while (i37 < i28) {
                int i39 = i27 + i37;
                int i40 = i27;
                C19049 c190410 = c19049Arr2[i39 < 0 ? i29 + i39 : i39 % i29];
                boolean z6 = i37 == i30;
                if (c190410 == null || ((z5 || !z6) && c190410.m43909())) {
                    c19049Arr = c19049Arr2;
                    i4 = i29;
                    i35++;
                    z5 = z5;
                } else {
                    if (i35 > 0) {
                        int i41 = i38;
                        int i42 = 0;
                        while (i42 < i35) {
                            boolean z7 = z5;
                            int i43 = this.f7066;
                            C19049[] c19049Arr3 = c19049Arr2;
                            if (i36 == i43 - 1) {
                                m7008(0, i43, j);
                            } else {
                                i36++;
                            }
                            i42++;
                            z5 = z7;
                            c19049Arr2 = c19049Arr3;
                            i41 = 0;
                        }
                        z2 = z5;
                        c19049Arr = c19049Arr2;
                        i38 = i41;
                        i5 = 0;
                    } else {
                        z2 = z5;
                        c19049Arr = c19049Arr2;
                        i5 = i35;
                    }
                    if (z6 || c190410.f59997) {
                        i6 = i38;
                        iM43903 = c190410.m43903();
                        z3 = z6;
                        i7 = 0;
                        i38 = i6;
                        j2 = 0;
                        z4 = z2;
                        int i44 = i33;
                        i8 = i36;
                        i9 = 0;
                        while (true) {
                            if (i7 < iM43903) {
                                i10 = i5;
                                i4 = i29;
                                break;
                            }
                            int i45 = iM43903;
                            c = c190410.f59996[i7];
                            i10 = i5;
                            if (Character.isHighSurrogate(c)) {
                                codePoint = c;
                                i7++;
                                codePoint = Character.toCodePoint(c, c190410.f59996[i7]);
                            }
                            codePoint = c;
                            int i46 = i7;
                            int i47 = codePoint;
                            iM18920 = C6991.m18920(i47 == true ? 1 : 0);
                            if (iM18920 > 0) {
                                j2 = c190410.f59998[i9];
                            }
                            i12 = i38;
                            if (i38 + iM18920 > this.f7063) {
                                this.f7065[m7010(i8)].f59997 = true;
                                i18 = this.f7066;
                                if (i8 == i18 - 1) {
                                    if (z4) {
                                        i34--;
                                    }
                                    m7008(0, i18, j);
                                } else {
                                    i8++;
                                }
                                i14 = i8;
                                i15 = i34;
                                i13 = 0;
                            } else {
                                i13 = i12;
                                i14 = i8;
                                i15 = i34;
                            }
                            if (iM18920 <= 0 || i13 <= 0) {
                                i16 = 0;
                            } else {
                                i16 = 1;
                            }
                            i4 = i29;
                            i17 = i9;
                            m7006(i13 - i16, i14, i47 == true ? 1 : 0, j2);
                            if (iM18920 > 0) {
                                if (i30 == i37 || i31 != i17) {
                                    i34 = i15;
                                } else {
                                    z4 = true;
                                    i44 = i13;
                                    i34 = i14;
                                }
                                i9 = i17 + iM18920;
                                i38 = i13 + iM18920;
                                if (z3 && z4) {
                                    i8 = i14;
                                    break;
                                }
                            } else {
                                i9 = i17;
                                i38 = i13;
                                i34 = i15;
                            }
                            i7 = i46 + 1;
                            i5 = i10;
                            i8 = i14;
                            i29 = i4;
                            iM43903 = i45;
                        }
                        if (i37 != i28 - 1 && !c190410.f59997) {
                            i11 = this.f7066;
                            if (i8 == i11 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m7008(0, i11, j);
                            } else {
                                i8++;
                            }
                            i38 = 0;
                        }
                        i35 = i10;
                        i36 = i8;
                        i33 = i44;
                        z5 = z4;
                    } else {
                        iM43903 = 0;
                        i6 = i38;
                        for (int i48 = 0; i48 < c190410.m43903(); i48++) {
                            iM43903 = c190410.f59996[i48] != ' ' ? i48 + 1 : iM43903;
                        }
                    }
                    i7 = 0;
                    i38 = i6;
                    j2 = 0;
                    z4 = z2;
                    int i49 = i33;
                    i8 = i36;
                    i9 = 0;
                    while (true) {
                        if (i7 < iM43903) {
                            i10 = i5;
                            i4 = i29;
                            break;
                        }
                        int i410 = iM43903;
                        c = c190410.f59996[i7];
                        i10 = i5;
                        if (Character.isHighSurrogate(c)) {
                            codePoint = c;
                            i7++;
                            codePoint = Character.toCodePoint(c, c190410.f59996[i7]);
                        }
                        codePoint = c;
                        int i411 = i7;
                        int i412 = codePoint;
                        iM18920 = C6991.m18920(i412 == true ? 1 : 0);
                        if (iM18920 > 0) {
                            j2 = c190410.f59998[i9];
                        }
                        i12 = i38;
                        if (i38 + iM18920 > this.f7063) {
                            this.f7065[m7010(i8)].f59997 = true;
                            i18 = this.f7066;
                            if (i8 == i18 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m7008(0, i18, j);
                            } else {
                                i8++;
                            }
                            i14 = i8;
                            i15 = i34;
                            i13 = 0;
                        } else {
                            i13 = i12;
                            i14 = i8;
                            i15 = i34;
                        }
                        if (iM18920 <= 0) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        i4 = i29;
                        i17 = i9;
                        m7006(i13 - i16, i14, i412 == true ? 1 : 0, j2);
                        if (iM18920 > 0) {
                            if (i30 == i37) {
                                i34 = i15;
                            } else {
                                i34 = i15;
                            }
                            i9 = i17 + iM18920;
                            i38 = i13 + iM18920;
                            if (z3) {
                                continue;
                            }
                        } else {
                            i9 = i17;
                            i38 = i13;
                            i34 = i15;
                        }
                        i7 = i411 + 1;
                        i5 = i10;
                        i8 = i14;
                        i29 = i4;
                        iM43903 = i410;
                    }
                    if (i37 != i28 - 1) {
                        i11 = this.f7066;
                        if (i8 == i11 - 1) {
                            if (z4) {
                                i34--;
                            }
                            m7008(0, i11, j);
                        } else {
                            i8++;
                        }
                        i38 = 0;
                    }
                    i35 = i10;
                    i36 = i8;
                    i33 = i49;
                    z5 = z4;
                }
                i37++;
                i27 = i40;
                c19049Arr2 = c19049Arr;
                i29 = i4;
            }
            iArr[0] = i33;
            iArr[1] = i34;
        }
        if (iArr[0] < 0 || iArr[1] < 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7000(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f7064;
        int i4 = i2 - 1;
        C19049 c19049 = this.f7065[((i + i4) + 1) % i3];
        while (i4 >= 0) {
            C19049[] c19049Arr = this.f7065;
            int i5 = i + i4;
            c19049Arr[(i5 + 1) % i3] = c19049Arr[i5 % i3];
            i4--;
        }
        this.f7065[i % i3] = c19049;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7008(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.f7066) {
            throw new IllegalArgumentException();
        }
        m7000(this.f7067, i);
        m7000(m7010(i2), this.f7066 - i2);
        int i4 = this.f7067 + 1;
        int i5 = this.f7064;
        this.f7067 = i4 % i5;
        int i6 = this.f7062;
        if (i6 < i5 - this.f7066) {
            this.f7062 = i6 + 1;
        }
        int iM7010 = m7010(i3);
        C19049[] c19049Arr = this.f7065;
        C19049 c19049 = c19049Arr[iM7010];
        if (c19049 == null) {
            c19049Arr[iM7010] = new C19049(this.f7063, j);
        } else {
            c19049.m43906(j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7004(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == 0) {
            return;
        }
        if (i >= 0 && (i7 = i + i3) <= (i8 = this.f7063) && i2 >= 0) {
            int i9 = i2 + i4;
            int i10 = this.f7066;
            if (i9 <= i10 && i5 >= 0 && i3 + i5 <= i8 && i6 >= 0 && i6 + i4 <= i10) {
                boolean z = i2 > i6;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = z ? i11 : i4 - (i11 + 1);
                    m7003(m7010(i12 + i6)).m43907(m7003(m7010(i2 + i12)), i, i7, i5);
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7005(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.f7063 || i2 < 0 || i2 + i4 > this.f7066) {
            throw new IllegalArgumentException();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m7006(i + i7, i2 + i6, i5, j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19049 m7003(int i) {
        C19049[] c19049Arr = this.f7065;
        C19049 c19049 = c19049Arr[i];
        if (c19049 != null) {
            return c19049;
        }
        C19049 c190410 = new C19049(this.f7063, 0L);
        c19049Arr[i] = c190410;
        return c190410;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7006(int i, int i2, int i3, long j) {
        if (i2 >= this.f7066 || i >= this.f7063) {
            throw new IllegalArgumentException();
        }
        m7003(m7010(i2)).m43905(i, i3, j);
    }
}
