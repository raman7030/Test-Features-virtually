package p067l;

/* JADX INFO: renamed from: l.֫᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4379 {

    /* JADX INFO: renamed from: ۧ */
    public int f9848;

    /* JADX INFO: renamed from: ܳ */
    public int f9849;

    /* JADX INFO: renamed from: ܽ */
    public C20473[] f9850;

    /* JADX INFO: renamed from: ܿ */
    public int f9851;

    /* JADX INFO: renamed from: ֫ */
    public int f9847 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f9852 = 0;

    public C4379(int i, int i2, int i3) {
        this.f9848 = i;
        this.f9849 = i2;
        this.f9851 = i3;
        this.f9850 = new C20473[i2];
        m9116(0, 0, i, i3, 32, C25106.f80348);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m9113(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f9848;
        int i9 = -this.f9847;
        if (i2 >= i9) {
            i9 = i2;
        }
        int i10 = this.f9851;
        int i11 = i4 >= i10 ? i10 - 1 : i4;
        int i12 = i9;
        while (i12 <= i11) {
            int i13 = i12 == i9 ? i : 0;
            if (i12 != i11 || (i5 = i3 + 1) > i8) {
                i5 = i8;
            }
            C20473 c20473 = this.f9850[m9121(i12)];
            int iM46173 = c20473.m46173(i13);
            int iM46174 = i5 < this.f9848 ? c20473.m46173(i5) : c20473.m46172();
            if (iM46174 == iM46173) {
                iM46174 = c20473.m46173(i5 + 1);
            }
            char[] cArr = c20473.f63225;
            boolean z = this.f9850[m9121(i12)].f63226;
            if (z && i5 == i8) {
                i6 = iM46174 - 1;
            } else {
                int i14 = -1;
                for (int i15 = iM46173; i15 < iM46174; i15++) {
                    if (cArr[i15] != ' ') {
                        i14 = i15;
                    }
                }
                i6 = i14;
            }
            if (i6 != -1 && (i7 = (i6 - iM46173) + 1) > 0) {
                sb.append(cArr, iM46173, i7);
            }
            if (!z && i12 < i11 && i12 < this.f9851 - 1) {
                sb.append('\n');
            }
            i12++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m9120() {
        return this.f9847;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m9122() {
        return m9113(0, -this.f9847, this.f9848, this.f9851).trim();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m9112() {
        return this.f9847 + this.f9851;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m9121(int i) {
        if (i < (-this.f9847) || i > this.f9851) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f9852 + i;
        int i3 = this.f9849;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m9118(int i, int i2, int i3, int[] iArr, long j, boolean z) {
        C20473[] c20473Arr;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM46172;
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
        int iM20874;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        if (i == this.f9848 && i2 <= this.f9849) {
            int i19 = this.f9851;
            int i20 = i19 - i2;
            if (i20 > 0 && i20 < i19) {
                for (int i21 = i19 - 1; i21 > 0 && iArr[1] < i21; i21--) {
                    C20473 c20473 = this.f9850[m9121(i21)];
                    if ((c20473 == null || c20473.m46178()) && (i20 = i20 - 1) == 0) {
                        break;
                    }
                }
            } else if (i20 < 0 && i20 != (iMax = Math.max(i20, -this.f9847))) {
                for (int i22 = 0; i22 < iMax - i20; i22++) {
                    m9114(((this.f9852 + this.f9851) + i22) % this.f9849).m46175(j);
                }
                i20 = iMax;
            }
            int i23 = this.f9852 + i20;
            this.f9852 = i23;
            int i24 = this.f9849;
            this.f9852 = i23 < 0 ? i23 + i24 : i23 % i24;
            this.f9849 = i3;
            this.f9847 = z ? 0 : Math.max(0, this.f9847 + i20);
            iArr[1] = iArr[1] - i20;
            this.f9851 = i2;
        } else {
            C20473[] c20473Arr2 = this.f9850;
            this.f9850 = new C20473[i3];
            for (int i25 = 0; i25 < i3; i25++) {
                this.f9850[i25] = new C20473(i, j);
            }
            int i26 = this.f9847;
            int i27 = this.f9852;
            int i28 = this.f9851;
            int i29 = this.f9849;
            this.f9849 = i3;
            this.f9851 = i2;
            this.f9852 = 0;
            this.f9847 = 0;
            this.f9848 = i;
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
                C20473 c20474 = c20473Arr2[i39 < 0 ? i29 + i39 : i39 % i29];
                boolean z6 = i37 == i30;
                if (c20474 == null || ((z5 || !z6) && c20474.m46178())) {
                    c20473Arr = c20473Arr2;
                    i4 = i29;
                    i35++;
                    z5 = z5;
                } else {
                    if (i35 > 0) {
                        int i41 = i38;
                        int i42 = 0;
                        while (i42 < i35) {
                            boolean z7 = z5;
                            int i43 = this.f9851;
                            C20473[] c20473Arr3 = c20473Arr2;
                            if (i36 == i43 - 1) {
                                m9119(0, i43, j);
                            } else {
                                i36++;
                            }
                            i42++;
                            z5 = z7;
                            c20473Arr2 = c20473Arr3;
                            i41 = 0;
                        }
                        z2 = z5;
                        c20473Arr = c20473Arr2;
                        i38 = i41;
                        i5 = 0;
                    } else {
                        z2 = z5;
                        c20473Arr = c20473Arr2;
                        i5 = i35;
                    }
                    if (z6 || c20474.f63226) {
                        i6 = i38;
                        iM46172 = c20474.m46172();
                        z3 = z6;
                        i7 = 0;
                        i38 = i6;
                        j2 = 0;
                        z4 = z2;
                        int i44 = i33;
                        i8 = i36;
                        i9 = 0;
                        while (true) {
                            if (i7 < iM46172) {
                                i10 = i5;
                                i4 = i29;
                                break;
                            }
                            int i45 = iM46172;
                            c = c20474.f63225[i7];
                            i10 = i5;
                            if (Character.isHighSurrogate(c)) {
                                codePoint = c;
                                i7++;
                                codePoint = Character.toCodePoint(c, c20474.f63225[i7]);
                            }
                            codePoint = c;
                            int i46 = i7;
                            int i47 = codePoint;
                            iM20874 = C9013.m20874(i47 == true ? 1 : 0);
                            if (iM20874 > 0) {
                                j2 = c20474.f63227[i9];
                            }
                            i12 = i38;
                            if (i38 + iM20874 > this.f9848) {
                                this.f9850[m9121(i8)].f63226 = true;
                                i18 = this.f9851;
                                if (i8 == i18 - 1) {
                                    if (z4) {
                                        i34--;
                                    }
                                    m9119(0, i18, j);
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
                            if (iM20874 <= 0 || i13 <= 0) {
                                i16 = 0;
                            } else {
                                i16 = 1;
                            }
                            i4 = i29;
                            i17 = i9;
                            m9117(i13 - i16, i14, i47 == true ? 1 : 0, j2);
                            if (iM20874 > 0) {
                                if (i30 == i37 || i31 != i17) {
                                    i34 = i15;
                                } else {
                                    z4 = true;
                                    i44 = i13;
                                    i34 = i14;
                                }
                                i9 = i17 + iM20874;
                                i38 = i13 + iM20874;
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
                            iM46172 = i45;
                        }
                        if (i37 != i28 - 1 && !c20474.f63226) {
                            i11 = this.f9851;
                            if (i8 == i11 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m9119(0, i11, j);
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
                        iM46172 = 0;
                        i6 = i38;
                        for (int i48 = 0; i48 < c20474.m46172(); i48++) {
                            iM46172 = c20474.f63225[i48] != ' ' ? i48 + 1 : iM46172;
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
                        if (i7 < iM46172) {
                            i10 = i5;
                            i4 = i29;
                            break;
                        }
                        int i410 = iM46172;
                        c = c20474.f63225[i7];
                        i10 = i5;
                        if (Character.isHighSurrogate(c)) {
                            codePoint = c;
                            i7++;
                            codePoint = Character.toCodePoint(c, c20474.f63225[i7]);
                        }
                        codePoint = c;
                        int i411 = i7;
                        int i412 = codePoint;
                        iM20874 = C9013.m20874(i412 == true ? 1 : 0);
                        if (iM20874 > 0) {
                            j2 = c20474.f63227[i9];
                        }
                        i12 = i38;
                        if (i38 + iM20874 > this.f9848) {
                            this.f9850[m9121(i8)].f63226 = true;
                            i18 = this.f9851;
                            if (i8 == i18 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m9119(0, i18, j);
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
                        if (iM20874 <= 0) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        i4 = i29;
                        i17 = i9;
                        m9117(i13 - i16, i14, i412 == true ? 1 : 0, j2);
                        if (iM20874 > 0) {
                            if (i30 == i37) {
                                i34 = i15;
                            } else {
                                i34 = i15;
                            }
                            i9 = i17 + iM20874;
                            i38 = i13 + iM20874;
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
                        iM46172 = i410;
                    }
                    if (i37 != i28 - 1) {
                        i11 = this.f9851;
                        if (i8 == i11 - 1) {
                            if (z4) {
                                i34--;
                            }
                            m9119(0, i11, j);
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
                c20473Arr2 = c20473Arr;
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

    /* JADX INFO: renamed from: ֫ */
    private void m9111(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f9849;
        int i4 = i2 - 1;
        C20473 c20473 = this.f9850[((i + i4) + 1) % i3];
        while (i4 >= 0) {
            C20473[] c20473Arr = this.f9850;
            int i5 = i + i4;
            c20473Arr[(i5 + 1) % i3] = c20473Arr[i5 % i3];
            i4--;
        }
        this.f9850[i % i3] = c20473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9119(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.f9851) {
            throw new IllegalArgumentException();
        }
        m9111(this.f9852, i);
        m9111(m9121(i2), this.f9851 - i2);
        int i4 = this.f9852 + 1;
        int i5 = this.f9849;
        this.f9852 = i4 % i5;
        int i6 = this.f9847;
        if (i6 < i5 - this.f9851) {
            this.f9847 = i6 + 1;
        }
        int iM9121 = m9121(i3);
        C20473[] c20473Arr = this.f9850;
        C20473 c20473 = c20473Arr[iM9121];
        if (c20473 == null) {
            c20473Arr[iM9121] = new C20473(this.f9848, j);
        } else {
            c20473.m46175(j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9115(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == 0) {
            return;
        }
        if (i >= 0 && (i7 = i + i3) <= (i8 = this.f9848) && i2 >= 0) {
            int i9 = i2 + i4;
            int i10 = this.f9851;
            if (i9 <= i10 && i5 >= 0 && i3 + i5 <= i8 && i6 >= 0 && i6 + i4 <= i10) {
                boolean z = i2 > i6;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = z ? i11 : i4 - (i11 + 1);
                    m9114(m9121(i12 + i6)).m46176(m9114(m9121(i2 + i12)), i, i7, i5);
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9116(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.f9848 || i2 < 0 || i2 + i4 > this.f9851) {
            throw new IllegalArgumentException();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m9117(i + i7, i2 + i6, i5, j);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20473 m9114(int i) {
        C20473[] c20473Arr = this.f9850;
        C20473 c20473 = c20473Arr[i];
        if (c20473 != null) {
            return c20473;
        }
        C20473 c20474 = new C20473(this.f9848, 0L);
        c20473Arr[i] = c20474;
        return c20474;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9117(int i, int i2, int i3, long j) {
        if (i2 >= this.f9851 || i >= this.f9848) {
            throw new IllegalArgumentException();
        }
        m9114(m9121(i2)).m46174(i, i3, j);
    }
}
