package p067l;

/* JADX INFO: renamed from: l.᩹۠ */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941 {

    /* JADX INFO: renamed from: ۖ */
    public int f74603;

    /* JADX INFO: renamed from: ۘ */
    public C1101 f74604;

    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ C1836 f74605;

    /* JADX INFO: renamed from: ۡ */
    public int f74607;

    /* JADX INFO: renamed from: ۢ */
    public int f74608;

    /* JADX INFO: renamed from: ܳ */
    public C1101 f74610;

    /* JADX INFO: renamed from: ܺ */
    public int f74611;

    /* JADX INFO: renamed from: ܽ */
    public C1101 f74612;

    /* JADX INFO: renamed from: ᩵ */
    public C1101 f74616;

    /* JADX INFO: renamed from: ᩷ */
    public int f74617;

    /* JADX INFO: renamed from: ᩻ */
    public int f74618;

    /* JADX INFO: renamed from: ֫ */
    public C1591 f74602 = null;

    /* JADX INFO: renamed from: ۧ */
    public int f74609 = 0;

    /* JADX INFO: renamed from: ֡ */
    public int f74601 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f74613 = 0;

    /* JADX INFO: renamed from: ᩴ */
    public int f74615 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f74614 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f74606 = 0;

    public C1941(C1836 c1836, int i, C1101 c1101, C1101 c1102, C1101 c1103, C1101 c1104, int i2) {
        this.f74605 = c1836;
        this.f74607 = 0;
        this.f74603 = 0;
        this.f74611 = 0;
        this.f74608 = 0;
        this.f74618 = 0;
        this.f74617 = i;
        this.f74610 = c1101;
        this.f74616 = c1102;
        this.f74604 = c1103;
        this.f74612 = c1104;
        this.f74607 = c1836.m27527();
        this.f74603 = c1836.m27522();
        this.f74611 = c1836.m27531();
        this.f74608 = c1836.m27528();
        this.f74618 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52100(int i, C1101 c1101, C1101 c1102, C1101 c1103, C1101 c1104, int i2, int i3, int i4, int i5, int i6) {
        this.f74617 = i;
        this.f74610 = c1101;
        this.f74616 = c1102;
        this.f74604 = c1103;
        this.f74612 = c1104;
        this.f74607 = i2;
        this.f74603 = i3;
        this.f74611 = i4;
        this.f74608 = i5;
        this.f74618 = i6;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52098() {
        this.f74609 = 0;
        this.f74602 = null;
        this.f74601 = 0;
        this.f74613 = 0;
        this.f74615 = 0;
        this.f74614 = 0;
        this.f74606 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52104(int i) {
        this.f74615 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m52105() {
        if (this.f74617 == 0) {
            return this.f74601 - this.f74605.f67569;
        }
        return this.f74601;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52103() {
        if (this.f74617 == 1) {
            return this.f74613 - this.f74605.f67562;
        }
        return this.f74613;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52102(C1591 c1591) {
        int i = this.f74617;
        C1836 c1836 = this.f74605;
        if (i == 0) {
            int iM48518 = c1836.m48518(c1591, this.f74618);
            if (c1591.f49244[0] == EnumC1241.MATCH_CONSTRAINT) {
                this.f74606++;
                iM48518 = 0;
            }
            this.f74601 = iM48518 + (c1591.m37893() != 8 ? c1836.f67569 : 0) + this.f74601;
            int iM48509 = c1836.m48509(c1591, this.f74618);
            if (this.f74602 == null || this.f74609 < iM48509) {
                this.f74602 = c1591;
                this.f74609 = iM48509;
                this.f74613 = iM48509;
            }
        } else {
            int iM48519 = c1836.m48518(c1591, this.f74618);
            int iM485010 = c1836.m48509(c1591, this.f74618);
            if (c1591.f49244[1] == EnumC1241.MATCH_CONSTRAINT) {
                this.f74606++;
                iM485010 = 0;
            }
            this.f74613 = iM485010 + (c1591.m37893() != 8 ? c1836.f67562 : 0) + this.f74613;
            if (this.f74602 == null || this.f74609 < iM48519) {
                this.f74602 = c1591;
                this.f74609 = iM48519;
                this.f74601 = iM48519;
            }
        }
        this.f74614++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52101(int i, boolean z, boolean z2) {
        C1836 c1836;
        int i2;
        C1591 c1591;
        C1101 c1101;
        int i3;
        int i4 = this.f74614;
        int i5 = 0;
        while (true) {
            c1836 = this.f74605;
            if (i5 >= i4 || this.f74615 + i5 >= c1836.f67566) {
                break;
            }
            C1591 c1592 = c1836.f67565[this.f74615 + i5];
            if (c1592 != null) {
                c1592.m37908();
            }
            i5++;
        }
        if (i4 == 0 || this.f74602 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = z ? (i4 - 1) - i8 : i8;
            if (this.f74615 + i9 >= c1836.f67566) {
                break;
            }
            if (c1836.f67565[this.f74615 + i9].m37893() == 0) {
                if (i6 == -1) {
                    i6 = i8;
                }
                i7 = i8;
            }
        }
        if (this.f74617 != 0) {
            C1591 c1593 = this.f74602;
            c1593.f49268 = c1836.f67567;
            C1101 c1102 = c1593.f49261;
            C1101 c1103 = c1593.f49279;
            int i10 = this.f74607;
            if (i > 0) {
                i10 += c1836.f67569;
            }
            if (z) {
                c1103.m16908(this.f74604, i10);
                if (z2) {
                    c1102.m16908(this.f74610, this.f74611);
                }
                if (i > 0) {
                    this.f74604.f19181.f49261.m16908(c1103, 0);
                }
            } else {
                c1102.m16908(this.f74610, i10);
                if (z2) {
                    c1103.m16908(this.f74604, this.f74611);
                }
                if (i > 0) {
                    this.f74610.f19181.f49279.m16908(c1102, 0);
                }
            }
            C1591 c1594 = null;
            int i11 = 0;
            while (i11 < i4 && this.f74615 + i11 < c1836.f67566) {
                C1591 c1595 = c1836.f67565[this.f74615 + i11];
                if (i11 == 0) {
                    c1595.m37874(c1595.f49281, this.f74616, this.f74603);
                    int i12 = c1836.f67555;
                    float f = c1836.f67570;
                    if (this.f74615 == 0) {
                        i2 = -1;
                        if (c1836.f67556 != -1) {
                            i12 = c1836.f67556;
                            f = c1836.f67547;
                        }
                        c1595.f49243 = i12;
                        c1595.f49229 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && c1836.f67560 != i2) {
                        i12 = c1836.f67560;
                        f = c1836.f67561;
                    }
                    c1595.f49243 = i12;
                    c1595.f49229 = f;
                }
                if (i11 == i4 - 1) {
                    c1595.m37874(c1595.f49253, this.f74612, this.f74608);
                }
                if (c1594 != null) {
                    C1101 c1104 = c1594.f49253;
                    C1101 c1105 = c1595.f49281;
                    c1105.m16908(c1104, c1836.f67562);
                    if (i11 == i6) {
                        int i13 = this.f74603;
                        if (c1105.m16920()) {
                            c1105.f19182 = i13;
                        }
                    }
                    c1104.m16908(c1105, 0);
                    if (i11 == i7 + 1) {
                        int i14 = this.f74608;
                        if (c1104.m16920()) {
                            c1104.f19182 = i14;
                        }
                    }
                }
                if (c1595 != c1593) {
                    if (z) {
                        int i15 = c1836.f67563;
                        if (i15 == 0) {
                            c1595.f49279.m16908(c1103, 0);
                        } else if (i15 == 1) {
                            c1595.f49261.m16908(c1102, 0);
                        } else if (i15 == 2) {
                            c1595.f49261.m16908(c1102, 0);
                            c1595.f49279.m16908(c1103, 0);
                        }
                    } else {
                        int i16 = c1836.f67563;
                        if (i16 == 0) {
                            c1595.f49261.m16908(c1102, 0);
                        } else if (i16 == 1) {
                            c1595.f49279.m16908(c1103, 0);
                        } else if (i16 == 2) {
                            if (z3) {
                                c1595.f49261.m16908(this.f74610, this.f74607);
                                c1595.f49279.m16908(this.f74604, this.f74611);
                            } else {
                                c1595.f49261.m16908(c1102, 0);
                                c1595.f49279.m16908(c1103, 0);
                            }
                        }
                    }
                }
                i11++;
                c1594 = c1595;
            }
            return;
        }
        C1591 c1596 = this.f74602;
        c1596.f49243 = c1836.f67555;
        C1101 c1106 = c1596.f49253;
        C1101 c1107 = c1596.f49281;
        int i17 = this.f74603;
        if (i > 0) {
            i17 += c1836.f67562;
        }
        c1107.m16908(this.f74616, i17);
        if (z2) {
            c1106.m16908(this.f74612, this.f74608);
        }
        if (i > 0) {
            this.f74616.f19181.f49253.m16908(c1107, 0);
        }
        if (c1836.f67559 != 3 || c1596.m37929()) {
            c1591 = c1596;
            break;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i4) {
                int i19 = z ? (i4 - 1) - i18 : i18;
                if (this.f74615 + i19 < c1836.f67566) {
                    c1591 = c1836.f67565[this.f74615 + i19];
                    if (c1591.m37929()) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            c1591 = c1596;
            break;
        }
        C1591 c1597 = null;
        int i20 = 0;
        while (i20 < i4) {
            int i21 = z ? (i4 - 1) - i20 : i20;
            if (this.f74615 + i21 >= c1836.f67566) {
                return;
            }
            C1591 c1598 = c1836.f67565[this.f74615 + i21];
            if (i20 == 0) {
                c1598.m37874(c1598.f49261, this.f74610, this.f74607);
            }
            if (i21 == 0) {
                int i22 = c1836.f67567;
                float f2 = c1836.f67568;
                if (this.f74615 == 0) {
                    i3 = -1;
                    if (c1836.f67553 != -1) {
                        i22 = c1836.f67553;
                        f2 = c1836.f67546;
                    }
                    c1598.f49268 = i22;
                    c1598.f49249 = f2;
                } else {
                    i3 = -1;
                }
                if (z2 && c1836.f67550 != i3) {
                    i22 = c1836.f67550;
                    f2 = c1836.f67552;
                }
                c1598.f49268 = i22;
                c1598.f49249 = f2;
            }
            if (i20 == i4 - 1) {
                c1598.m37874(c1598.f49279, this.f74604, this.f74611);
            }
            if (c1597 != null) {
                C1101 c1108 = c1597.f49279;
                C1101 c1109 = c1598.f49261;
                c1109.m16908(c1108, c1836.f67569);
                if (i20 == i6) {
                    int i23 = this.f74607;
                    if (c1109.m16920()) {
                        c1109.f19182 = i23;
                    }
                }
                c1108.m16908(c1109, 0);
                if (i20 == i7 + 1) {
                    int i24 = this.f74611;
                    if (c1108.m16920()) {
                        c1108.f19182 = i24;
                    }
                }
            }
            if (c1598 == c1596) {
                c1101 = c1106;
            } else {
                if (c1836.f67559 == 3 && c1591.m37929() && c1598 != c1591 && c1598.m37929()) {
                    c1598.f49246.m16908(c1591.f49246, 0);
                } else {
                    int i25 = c1836.f67559;
                    if (i25 == 0) {
                        c1101 = c1106;
                        c1598.f49281.m16908(c1107, 0);
                    } else if (i25 == 1) {
                        c1101 = c1106;
                        c1598.f49253.m16908(c1101, 0);
                    } else if (z3) {
                        c1598.f49281.m16908(this.f74616, this.f74603);
                        c1598.f49253.m16908(this.f74612, this.f74608);
                    } else {
                        c1598.f49281.m16908(c1107, 0);
                        c1101 = c1106;
                        c1598.f49253.m16908(c1101, 0);
                    }
                }
                c1101 = c1106;
            }
            i20++;
            c1106 = c1101;
            c1597 = c1598;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52099(int i) {
        C1836 c1836;
        int i2 = this.f74606;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f74614;
        int i4 = i / i2;
        int i5 = 0;
        while (true) {
            c1836 = this.f74605;
            if (i5 >= i3 || this.f74615 + i5 >= c1836.f67566) {
                break;
            }
            C1591 c1591 = c1836.f67565[this.f74615 + i5];
            if (this.f74617 == 0) {
                if (c1591 != null) {
                    EnumC1241[] enumC1241Arr = c1591.f49244;
                    if (enumC1241Arr[0] == EnumC1241.MATCH_CONSTRAINT && c1591.f49265 == 0) {
                        c1836.m27521(c1591, EnumC1241.FIXED, i4, enumC1241Arr[1], c1591.m37890());
                    }
                }
            } else if (c1591 != null) {
                EnumC1241[] enumC1241Arr2 = c1591.f49244;
                if (enumC1241Arr2[1] == EnumC1241.MATCH_CONSTRAINT && c1591.f49290 == 0) {
                    c1836.m27521(c1591, enumC1241Arr2[0], c1591.m37911(), EnumC1241.FIXED, i4);
                }
            }
            i5++;
        }
        this.f74601 = 0;
        this.f74613 = 0;
        this.f74602 = null;
        this.f74609 = 0;
        int i6 = this.f74614;
        for (int i7 = 0; i7 < i6 && this.f74615 + i7 < c1836.f67566; i7++) {
            C1591 c1592 = c1836.f67565[this.f74615 + i7];
            if (this.f74617 != 0) {
                int iM48518 = c1836.m48518(c1592, this.f74618);
                int iM48509 = c1836.m48509(c1592, this.f74618);
                int i8 = c1836.f67562;
                if (c1592.m37893() == 8) {
                    i8 = 0;
                }
                this.f74613 = iM48509 + i8 + this.f74613;
                if (this.f74602 == null || this.f74609 < iM48518) {
                    this.f74602 = c1592;
                    this.f74609 = iM48518;
                    this.f74601 = iM48518;
                }
            } else {
                int iM37911 = c1592.m37911();
                int i9 = c1836.f67569;
                if (c1592.m37893() == 8) {
                    i9 = 0;
                }
                this.f74601 = iM37911 + i9 + this.f74601;
                int iM485010 = c1836.m48509(c1592, this.f74618);
                if (this.f74602 == null || this.f74609 < iM485010) {
                    this.f74602 = c1592;
                    this.f74609 = iM485010;
                    this.f74613 = iM485010;
                }
            }
        }
    }
}
