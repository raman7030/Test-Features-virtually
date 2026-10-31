package l;

/* JADX INFO: renamed from: l.᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public final class C22151 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f71881;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C5218 f71882;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20035 f71883;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f71885;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f71886;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5218 f71888;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71889;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5218 f71890;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C5218 f71894;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f71895;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f71896;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15094 f71880 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f71887 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f71879 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71891 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f71893 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f71892 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f71884 = 0;

    public C22151(C20035 c20035, int i, C5218 c5218, C5218 c5219, C5218 c52110, C5218 c52111, int i2) {
        this.f71883 = c20035;
        this.f71885 = 0;
        this.f71881 = 0;
        this.f71889 = 0;
        this.f71886 = 0;
        this.f71896 = 0;
        this.f71895 = i;
        this.f71888 = c5218;
        this.f71894 = c5219;
        this.f71882 = c52110;
        this.f71890 = c52111;
        this.f71885 = c20035.m25508();
        this.f71881 = c20035.m25503();
        this.f71889 = c20035.m25512();
        this.f71886 = c20035.m25509();
        this.f71896 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49762(int i, C5218 c5218, C5218 c5219, C5218 c52110, C5218 c52111, int i2, int i3, int i4, int i5, int i6) {
        this.f71895 = i;
        this.f71888 = c5218;
        this.f71894 = c5219;
        this.f71882 = c52110;
        this.f71890 = c52111;
        this.f71885 = i2;
        this.f71881 = i3;
        this.f71889 = i4;
        this.f71886 = i5;
        this.f71896 = i6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49760() {
        this.f71887 = 0;
        this.f71880 = null;
        this.f71879 = 0;
        this.f71891 = 0;
        this.f71893 = 0;
        this.f71892 = 0;
        this.f71884 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49766(int i) {
        this.f71893 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m49767() {
        if (this.f71895 == 0) {
            return this.f71879 - this.f71883.f64927;
        }
        return this.f71879;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49765() {
        if (this.f71895 == 1) {
            return this.f71891 - this.f71883.f64920;
        }
        return this.f71891;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49764(C15094 c15094) {
        int i = this.f71895;
        C20035 c20035 = this.f71883;
        if (i == 0) {
            int iM46202 = c20035.m46202(c15094, this.f71896);
            if (c15094.f46124[0] == EnumC8040.MATCH_CONSTRAINT) {
                this.f71884++;
                iM46202 = 0;
            }
            this.f71879 = iM46202 + (c15094.m35735() != 8 ? c20035.f64927 : 0) + this.f71879;
            int iM46193 = c20035.m46193(c15094, this.f71896);
            if (this.f71880 == null || this.f71887 < iM46193) {
                this.f71880 = c15094;
                this.f71887 = iM46193;
                this.f71891 = iM46193;
            }
        } else {
            int iM46203 = c20035.m46202(c15094, this.f71896);
            int iM46194 = c20035.m46193(c15094, this.f71896);
            if (c15094.f46124[1] == EnumC8040.MATCH_CONSTRAINT) {
                this.f71884++;
                iM46194 = 0;
            }
            this.f71891 = iM46194 + (c15094.m35735() != 8 ? c20035.f64920 : 0) + this.f71891;
            if (this.f71880 == null || this.f71887 < iM46203) {
                this.f71880 = c15094;
                this.f71887 = iM46203;
                this.f71879 = iM46203;
            }
        }
        this.f71892++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49763(int i, boolean z, boolean z2) {
        C20035 c20035;
        int i2;
        C15094 c15094;
        C5218 c5218;
        int i3;
        int i4 = this.f71892;
        int i5 = 0;
        while (true) {
            c20035 = this.f71883;
            if (i5 >= i4 || this.f71893 + i5 >= c20035.f64924) {
                break;
            }
            C15094 c15095 = c20035.f64923[this.f71893 + i5];
            if (c15095 != null) {
                c15095.m35750();
            }
            i5++;
        }
        if (i4 == 0 || this.f71880 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = z ? (i4 - 1) - i8 : i8;
            if (this.f71893 + i9 >= c20035.f64924) {
                break;
            }
            if (c20035.f64923[this.f71893 + i9].m35735() == 0) {
                if (i6 == -1) {
                    i6 = i8;
                }
                i7 = i8;
            }
        }
        if (this.f71895 != 0) {
            C15094 c15096 = this.f71880;
            c15096.f46148 = c20035.f64925;
            C5218 c5219 = c15096.f46141;
            C5218 c52110 = c15096.f46159;
            int i10 = this.f71885;
            if (i > 0) {
                i10 += c20035.f64927;
            }
            if (z) {
                c52110.m14998(this.f71882, i10);
                if (z2) {
                    c5219.m14998(this.f71888, this.f71889);
                }
                if (i > 0) {
                    this.f71882.f16341.f46141.m14998(c52110, 0);
                }
            } else {
                c5219.m14998(this.f71888, i10);
                if (z2) {
                    c52110.m14998(this.f71882, this.f71889);
                }
                if (i > 0) {
                    this.f71888.f16341.f46159.m14998(c5219, 0);
                }
            }
            C15094 c15097 = null;
            int i11 = 0;
            while (i11 < i4 && this.f71893 + i11 < c20035.f64924) {
                C15094 c15098 = c20035.f64923[this.f71893 + i11];
                if (i11 == 0) {
                    c15098.m35716(c15098.f46161, this.f71894, this.f71881);
                    int i12 = c20035.f64913;
                    float f = c20035.f64928;
                    if (this.f71893 == 0) {
                        i2 = -1;
                        if (c20035.f64914 != -1) {
                            i12 = c20035.f64914;
                            f = c20035.f64905;
                        }
                        c15098.f46123 = i12;
                        c15098.f46109 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && c20035.f64918 != i2) {
                        i12 = c20035.f64918;
                        f = c20035.f64919;
                    }
                    c15098.f46123 = i12;
                    c15098.f46109 = f;
                }
                if (i11 == i4 - 1) {
                    c15098.m35716(c15098.f46133, this.f71890, this.f71886);
                }
                if (c15097 != null) {
                    C5218 c52111 = c15097.f46133;
                    C5218 c52112 = c15098.f46161;
                    c52112.m14998(c52111, c20035.f64920);
                    if (i11 == i6) {
                        int i13 = this.f71881;
                        if (c52112.m15010()) {
                            c52112.f16342 = i13;
                        }
                    }
                    c52111.m14998(c52112, 0);
                    if (i11 == i7 + 1) {
                        int i14 = this.f71886;
                        if (c52111.m15010()) {
                            c52111.f16342 = i14;
                        }
                    }
                }
                if (c15098 != c15096) {
                    if (z) {
                        int i15 = c20035.f64921;
                        if (i15 == 0) {
                            c15098.f46159.m14998(c52110, 0);
                        } else if (i15 == 1) {
                            c15098.f46141.m14998(c5219, 0);
                        } else if (i15 == 2) {
                            c15098.f46141.m14998(c5219, 0);
                            c15098.f46159.m14998(c52110, 0);
                        }
                    } else {
                        int i16 = c20035.f64921;
                        if (i16 == 0) {
                            c15098.f46141.m14998(c5219, 0);
                        } else if (i16 == 1) {
                            c15098.f46159.m14998(c52110, 0);
                        } else if (i16 == 2) {
                            if (z3) {
                                c15098.f46141.m14998(this.f71888, this.f71885);
                                c15098.f46159.m14998(this.f71882, this.f71889);
                            } else {
                                c15098.f46141.m14998(c5219, 0);
                                c15098.f46159.m14998(c52110, 0);
                            }
                        }
                    }
                }
                i11++;
                c15097 = c15098;
            }
            return;
        }
        C15094 c15099 = this.f71880;
        c15099.f46123 = c20035.f64913;
        C5218 c52113 = c15099.f46133;
        C5218 c52114 = c15099.f46161;
        int i17 = this.f71881;
        if (i > 0) {
            i17 += c20035.f64920;
        }
        c52114.m14998(this.f71894, i17);
        if (z2) {
            c52113.m14998(this.f71890, this.f71886);
        }
        if (i > 0) {
            this.f71894.f16341.f46133.m14998(c52114, 0);
        }
        if (c20035.f64917 != 3 || c15099.m35771()) {
            c15094 = c15099;
            break;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i4) {
                int i19 = z ? (i4 - 1) - i18 : i18;
                if (this.f71893 + i19 < c20035.f64924) {
                    c15094 = c20035.f64923[this.f71893 + i19];
                    if (c15094.m35771()) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            c15094 = c15099;
            break;
        }
        C15094 c150910 = null;
        int i20 = 0;
        while (i20 < i4) {
            int i21 = z ? (i4 - 1) - i20 : i20;
            if (this.f71893 + i21 >= c20035.f64924) {
                return;
            }
            C15094 c150911 = c20035.f64923[this.f71893 + i21];
            if (i20 == 0) {
                c150911.m35716(c150911.f46141, this.f71888, this.f71885);
            }
            if (i21 == 0) {
                int i22 = c20035.f64925;
                float f2 = c20035.f64926;
                if (this.f71893 == 0) {
                    i3 = -1;
                    if (c20035.f64911 != -1) {
                        i22 = c20035.f64911;
                        f2 = c20035.f64904;
                    }
                    c150911.f46148 = i22;
                    c150911.f46129 = f2;
                } else {
                    i3 = -1;
                }
                if (z2 && c20035.f64908 != i3) {
                    i22 = c20035.f64908;
                    f2 = c20035.f64910;
                }
                c150911.f46148 = i22;
                c150911.f46129 = f2;
            }
            if (i20 == i4 - 1) {
                c150911.m35716(c150911.f46159, this.f71882, this.f71889);
            }
            if (c150910 != null) {
                C5218 c52115 = c150910.f46159;
                C5218 c52116 = c150911.f46141;
                c52116.m14998(c52115, c20035.f64927);
                if (i20 == i6) {
                    int i23 = this.f71885;
                    if (c52116.m15010()) {
                        c52116.f16342 = i23;
                    }
                }
                c52115.m14998(c52116, 0);
                if (i20 == i7 + 1) {
                    int i24 = this.f71889;
                    if (c52115.m15010()) {
                        c52115.f16342 = i24;
                    }
                }
            }
            if (c150911 == c15099) {
                c5218 = c52113;
            } else {
                if (c20035.f64917 == 3 && c15094.m35771() && c150911 != c15094 && c150911.m35771()) {
                    c150911.f46126.m14998(c15094.f46126, 0);
                } else {
                    int i25 = c20035.f64917;
                    if (i25 == 0) {
                        c5218 = c52113;
                        c150911.f46161.m14998(c52114, 0);
                    } else if (i25 == 1) {
                        c5218 = c52113;
                        c150911.f46133.m14998(c5218, 0);
                    } else if (z3) {
                        c150911.f46161.m14998(this.f71894, this.f71881);
                        c150911.f46133.m14998(this.f71890, this.f71886);
                    } else {
                        c150911.f46161.m14998(c52114, 0);
                        c5218 = c52113;
                        c150911.f46133.m14998(c5218, 0);
                    }
                }
                c5218 = c52113;
            }
            i20++;
            c52113 = c5218;
            c150910 = c150911;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49761(int i) {
        C20035 c20035;
        int i2 = this.f71884;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f71892;
        int i4 = i / i2;
        int i5 = 0;
        while (true) {
            c20035 = this.f71883;
            if (i5 >= i3 || this.f71893 + i5 >= c20035.f64924) {
                break;
            }
            C15094 c15094 = c20035.f64923[this.f71893 + i5];
            if (this.f71895 == 0) {
                if (c15094 != null) {
                    EnumC8040[] enumC8040Arr = c15094.f46124;
                    if (enumC8040Arr[0] == EnumC8040.MATCH_CONSTRAINT && c15094.f46145 == 0) {
                        c20035.m25502(c15094, EnumC8040.FIXED, i4, enumC8040Arr[1], c15094.m35732());
                    }
                }
            } else if (c15094 != null) {
                EnumC8040[] enumC8040Arr2 = c15094.f46124;
                if (enumC8040Arr2[1] == EnumC8040.MATCH_CONSTRAINT && c15094.f46170 == 0) {
                    c20035.m25502(c15094, enumC8040Arr2[0], c15094.m35753(), EnumC8040.FIXED, i4);
                }
            }
            i5++;
        }
        this.f71879 = 0;
        this.f71891 = 0;
        this.f71880 = null;
        this.f71887 = 0;
        int i6 = this.f71892;
        for (int i7 = 0; i7 < i6 && this.f71893 + i7 < c20035.f64924; i7++) {
            C15094 c15095 = c20035.f64923[this.f71893 + i7];
            if (this.f71895 != 0) {
                int iM46202 = c20035.m46202(c15095, this.f71896);
                int iM46193 = c20035.m46193(c15095, this.f71896);
                int i8 = c20035.f64920;
                if (c15095.m35735() == 8) {
                    i8 = 0;
                }
                this.f71891 = iM46193 + i8 + this.f71891;
                if (this.f71880 == null || this.f71887 < iM46202) {
                    this.f71880 = c15095;
                    this.f71887 = iM46202;
                    this.f71879 = iM46202;
                }
            } else {
                int iM35753 = c15095.m35753();
                int i9 = c20035.f64927;
                if (c15095.m35735() == 8) {
                    i9 = 0;
                }
                this.f71879 = iM35753 + i9 + this.f71879;
                int iM46194 = c20035.m46193(c15095, this.f71896);
                if (this.f71880 == null || this.f71887 < iM46194) {
                    this.f71880 = c15095;
                    this.f71887 = iM46194;
                    this.f71891 = iM46194;
                }
            }
        }
    }
}
