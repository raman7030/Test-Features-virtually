package l;

/* JADX INFO: renamed from: l.ᩴ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18999 extends AbstractC2771 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f59878;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0653 f59879;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f59880;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2065 f59881;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f59882;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C19705[] f59883;

    public C18999(C15469 c15469, int i, int i2, int i3, int i4, int i5, int i6, int i7, C4265 c4265) {
        super(c15469, AbstractC13644.m32778(i3, Math.max(i4, 4096), 4096, i5, i6, i7, c4265), i, i2, i3, i5);
        this.f59883 = new C19705[4096];
        this.f59878 = 0;
        this.f59880 = 0;
        this.f59882 = new int[4];
        this.f59879 = new C0653();
        for (int i8 = 0; i8 < 4096; i8++) {
            this.f59883[i8] = new C19705();
        }
    }

    @Override // l.AbstractC2771, l.AbstractC17587
    /* JADX INFO: renamed from: ֫ */
    public final void mo8553() {
        this.f59878 = 0;
        this.f59880 = 0;
        super.mo8553();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x038f  */
    /* JADX WARN: Code duplicated, block: B:230:0x060d  */
    @Override // l.AbstractC2771
    /* JADX INFO: renamed from: ܿ */
    public final int mo8560() {
        int[] iArr;
        int[] iArr2;
        int i;
        short[][] sArr;
        int i2;
        C9827 c9827;
        int i3;
        int i4;
        int i5;
        boolean z;
        short[] sArr2;
        C9827 c9828;
        int i6;
        int i7;
        C2065 c2065;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        C9827 c9829;
        int i12;
        int i13 = this.f59878;
        int i14 = this.f59880;
        C19705[] c19705Arr = this.f59883;
        if (i13 < i14) {
            int i15 = c19705Arr[i13].f63655;
            int i16 = i15 - i13;
            this.f59878 = i15;
            this.f8631 = c19705Arr[i15].f63649;
            return i16;
        }
        this.f59878 = 0;
        this.f59880 = 0;
        this.f8631 = -1;
        if (this.f8626 == -1) {
            this.f59881 = m8561();
        }
        AbstractC13644 abstractC13644 = this.f8630;
        int iMin = Math.min(abstractC13644.m32781(), 273);
        if (iMin >= 2) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                iArr = this.f53746;
                iArr2 = this.f59882;
                if (i17 >= 4) {
                    break;
                }
                int iM32787 = abstractC13644.m32787(iArr[i17], iMin);
                iArr2[i17] = iM32787;
                if (iM32787 < 2) {
                    iArr2[i17] = 0;
                } else if (iM32787 > iArr2[i18]) {
                    i18 = i17;
                }
                i17++;
            }
            int i19 = iArr2[i18];
            int i20 = this.f8635;
            if (i19 >= i20) {
                this.f8631 = i18;
                m8554(i19 - 1);
                return iArr2[i18];
            }
            C2065 c2066 = this.f59881;
            int i21 = c2066.f6889;
            if (i21 > 0) {
                int i22 = i21 - 1;
                i = c2066.f6891[i22];
                int i23 = c2066.f6890[i22];
                if (i >= i20) {
                    this.f8631 = i23 + 4;
                    m8554(i - 1);
                    return i;
                }
            } else {
                i = 0;
            }
            int iM32782 = abstractC13644.m32782(0);
            int iM32783 = abstractC13644.m32782(iArr[0] + 1);
            if (i >= 2 || iM32782 == iM32783 || iArr2[i18] >= 2) {
                int iM32790 = abstractC13644.m32790();
                int i24 = this.f53747;
                int i25 = iM32790 & i24;
                int iM32784 = abstractC13644.m32782(1);
                C16175 c16175 = this.f8628;
                C0653 c0653 = this.f53750;
                int i26 = iM32790;
                c19705Arr[1].m45397(c16175.m38109(iM32782, iM32783, iM32784, iM32790, c0653), 0, -1);
                int iM2666 = c0653.m2666();
                short[][] sArr3 = this.f53753;
                int iM36551 = C15469.m36551(sArr3[iM2666][i25], 1);
                int iM2667 = c0653.m2666();
                short[] sArr4 = this.f53752;
                int iM36552 = C15469.m36551(sArr4[iM2667], 1) + iM36551;
                short[][] sArr5 = this.f53755;
                int i27 = i20;
                short[] sArr6 = this.f53749;
                if (iM32783 == iM32782) {
                    sArr = sArr5;
                    int iM36553 = C15469.m36551(sArr5[c0653.m2666()][i25], 0) + C15469.m36551(sArr6[c0653.m2666()], 0) + iM36552;
                    C19705 c19705 = c19705Arr[1];
                    if (iM36553 < c19705.f63657) {
                        c19705.m45397(iM36553, 0, 0);
                    }
                } else {
                    sArr = sArr5;
                }
                int iMax = Math.max(i, iArr2[i18]);
                this.f59880 = iMax;
                if (iMax < 2) {
                    this.f8631 = c19705Arr[1].f63649;
                    return 1;
                }
                m8556();
                c19705Arr[0].f63656.m2667(c0653);
                System.arraycopy(iArr, 0, c19705Arr[0].f63650, 0, 4);
                int i28 = this.f59880;
                while (true) {
                    i2 = 2;
                    if (i28 < 2) {
                        break;
                    }
                    c19705Arr[i28].f63657 = 1073741824;
                    i28--;
                }
                int i29 = 0;
                while (true) {
                    c9827 = this.f8624;
                    if (i29 >= 4) {
                        break;
                    }
                    int i30 = iArr2[i29];
                    if (i30 < i2) {
                        i12 = iM36552;
                    } else {
                        int iM8551 = m8551(iM36552, i29, c0653, i25);
                        while (true) {
                            int iM24897 = c9827.m24897(i30, i25) + iM8551;
                            int i31 = iM8551;
                            C19705 c19706 = c19705Arr[i30];
                            i12 = iM36552;
                            if (iM24897 < c19706.f63657) {
                                c19706.m45397(iM24897, 0, i29);
                            }
                            i30--;
                            if (i30 < 2) {
                                break;
                            }
                            iM8551 = i31;
                            iM36552 = i12;
                        }
                    }
                    i29++;
                    i2 = 2;
                    iM36552 = i12;
                }
                int iMax2 = Math.max(iArr2[0] + 1, 2);
                if (iMax2 <= i) {
                    int iM36554 = C15469.m36551(sArr4[c0653.m2666()], 0) + iM36551;
                    int i32 = 0;
                    while (iMax2 > this.f59881.f6891[i32]) {
                        i32++;
                    }
                    while (true) {
                        int i33 = this.f59881.f6890[i32];
                        int iM8550 = m8550(iM36554, i33, iMax2, i25);
                        C19705 c19707 = c19705Arr[iMax2];
                        if (iM8550 < c19707.f63657) {
                            c19707.m45397(iM8550, 0, i33 + 4);
                        }
                        C2065 c2067 = this.f59881;
                        if (iMax2 == c2067.f6891[i32] && (i32 = i32 + 1) == c2067.f6889) {
                            break;
                        }
                        iMax2++;
                    }
                }
                int iMin2 = Math.min(abstractC13644.m32781(), 4095);
                while (true) {
                    int i34 = this.f59878 + 1;
                    this.f59878 = i34;
                    if (i34 >= this.f59880) {
                        break;
                    }
                    C2065 c2065M8561 = m8561();
                    this.f59881 = c2065M8561;
                    int i35 = c2065M8561.f6889;
                    if (i35 > 0) {
                        int i36 = c2065M8561.f6891[i35 - 1];
                        i3 = i27;
                        if (i36 >= i3) {
                            break;
                        }
                    } else {
                        i3 = i27;
                    }
                    int i37 = iMin2 - 1;
                    int i38 = i26 + 1;
                    int i39 = i38 & i24;
                    C19705 c19708 = c19705Arr[this.f59878];
                    int i40 = c19708.f63655;
                    C0653 c0654 = c19708.f63656;
                    if (c19708.f63652) {
                        i40--;
                        if (c19708.f63653) {
                            c0654.m2667(c19705Arr[c19708.f63654].f63656);
                            C19705 c19709 = c19705Arr[this.f59878];
                            int i41 = c19709.f63651;
                            C0653 c0655 = c19709.f63656;
                            if (i41 < 4) {
                                c0655.m2671();
                            } else {
                                c0655.m2669();
                            }
                        } else {
                            c0654.m2667(c19705Arr[i40].f63656);
                        }
                        c19705Arr[this.f59878].f63656.m2672();
                    } else {
                        c0654.m2667(c19705Arr[i40].f63656);
                    }
                    int i42 = this.f59878;
                    if (i40 == i42 - 1) {
                        C19705 c197010 = c19705Arr[i42];
                        int i43 = c197010.f63649;
                        C0653 c0656 = c197010.f63656;
                        if (i43 == 0) {
                            c0656.m2673();
                        } else {
                            c0656.m2672();
                        }
                        System.arraycopy(c19705Arr[i40].f63650, 0, c19705Arr[this.f59878].f63650, 0, 4);
                    } else {
                        C19705 c197011 = c19705Arr[i42];
                        boolean z2 = c197011.f63652;
                        C0653 c0657 = c197011.f63656;
                        if (z2 && c197011.f63653) {
                            i40 = c197011.f63654;
                            i4 = c197011.f63651;
                            c0657.m2671();
                            i5 = 4;
                        } else {
                            i4 = c197011.f63649;
                            i5 = 4;
                            if (i4 < 4) {
                                c0657.m2671();
                            } else {
                                c0657.m2669();
                            }
                        }
                        if (i4 < i5) {
                            c19705Arr[this.f59878].f63650[0] = c19705Arr[i40].f63650[i4];
                            int i44 = 1;
                            while (i44 <= i4) {
                                c19705Arr[this.f59878].f63650[i44] = c19705Arr[i40].f63650[i44 - 1];
                                i44++;
                            }
                            while (i44 < 4) {
                                c19705Arr[this.f59878].f63650[i44] = c19705Arr[i40].f63650[i44];
                                i44++;
                            }
                        } else {
                            int[] iArr4 = c19705Arr[this.f59878].f63650;
                            iArr4[0] = i4 - 4;
                            System.arraycopy(c19705Arr[i40].f63650, 0, iArr4, 1, 3);
                        }
                    }
                    C19705 c197012 = c19705Arr[this.f59878];
                    int iM36555 = C15469.m36551(sArr3[c197012.f63656.m2666()][i39], 1) + c197012.f63657;
                    int iM36556 = C15469.m36551(sArr4[c19705Arr[this.f59878].f63656.m2666()], 1) + iM36555;
                    int iM32785 = abstractC13644.m32782(0);
                    int iM32786 = abstractC13644.m32782(c19705Arr[this.f59878].f63650[0] + 1);
                    short[] sArr7 = sArr4;
                    C9827 c98210 = c9827;
                    int i45 = iM36556;
                    int iM38109 = c19705Arr[this.f59878].f63657 + this.f8628.m38109(iM32785, iM32786, abstractC13644.m32782(1), i38, c19705Arr[this.f59878].f63656);
                    int i46 = this.f59878;
                    C19705 c197013 = c19705Arr[i46 + 1];
                    if (iM38109 < c197013.f63657) {
                        c197013.m45397(iM38109, i46, -1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iM32786 == iM32785) {
                        int i47 = this.f59878;
                        C19705 c197014 = c19705Arr[i47 + 1];
                        if (c197014.f63655 == i47 || c197014.f63649 != 0) {
                            C0653 c0658 = c19705Arr[i47].f63656;
                            int iM36557 = C15469.m36551(sArr[c0658.m2666()][i39], 0) + C15469.m36551(sArr6[c0658.m2666()], 0) + i45;
                            int i48 = this.f59878;
                            C19705 c197015 = c19705Arr[i48 + 1];
                            sArr2 = sArr6;
                            if (iM36557 <= c197015.f63657) {
                                c197015.m45397(iM36557, i48, 0);
                                z = true;
                            }
                        } else {
                            sArr2 = sArr6;
                        }
                    } else {
                        sArr2 = sArr6;
                    }
                    C0653 c0659 = this.f59879;
                    if (!z && iM32786 != iM32785 && i37 > 2) {
                        int iM32788 = abstractC13644.m32784(1, c19705Arr[this.f59878].f63650[0], Math.min(i3, iMin2 - 2));
                        if (iM32788 >= 2) {
                            c0659.m2667(c19705Arr[this.f59878].f63656);
                            c0659.m2672();
                            int iM8552 = iM38109 + m8552(iM32788, c0659, (i26 + 2) & i24);
                            int i49 = this.f59878 + 1 + iM32788;
                            while (true) {
                                int i50 = this.f59880;
                                if (i50 >= i49) {
                                    break;
                                }
                                int i51 = i50 + 1;
                                this.f59880 = i51;
                                c19705Arr[i51].f63657 = 1073741824;
                            }
                            C19705 c197016 = c19705Arr[i49];
                            if (iM8552 < c197016.f63657) {
                                int i52 = this.f59878;
                                c197016.f63657 = iM8552;
                                c197016.f63655 = i52 + 1;
                                c197016.f63649 = 0;
                                c197016.f63652 = true;
                                c197016.f63653 = false;
                            }
                        }
                    }
                    int i53 = 2;
                    if (i37 >= 2) {
                        int iMin3 = Math.min(i37, i3);
                        int i54 = 2;
                        int i55 = 0;
                        while (i55 < 4) {
                            int iM32789 = abstractC13644.m32787(c19705Arr[this.f59878].f63650[i55], iMin3);
                            if (iM32789 < i53) {
                                i10 = iMin3;
                                i11 = i45;
                                c9829 = c98210;
                            } else {
                                while (true) {
                                    int i56 = this.f59880;
                                    i9 = this.f59878;
                                    if (i56 >= i9 + iM32789) {
                                        break;
                                    }
                                    int i57 = i56 + 1;
                                    this.f59880 = i57;
                                    c19705Arr[i57].f63657 = 1073741824;
                                }
                                int iM8553 = m8551(i45, i55, c19705Arr[i9].f63656, i39);
                                int i58 = iM32789;
                                while (i58 >= 2) {
                                    C9827 c98211 = c98210;
                                    int iM24898 = c98211.m24897(i58, i39) + iM8553;
                                    int i59 = iMin3;
                                    int i60 = this.f59878;
                                    int i61 = i45;
                                    C19705 c197017 = c19705Arr[i60 + i58];
                                    int i62 = i54;
                                    if (iM24898 < c197017.f63657) {
                                        c197017.m45397(iM24898, i60, i55);
                                    }
                                    i58--;
                                    iMin3 = i59;
                                    i54 = i62;
                                    i45 = i61;
                                    c98210 = c98211;
                                }
                                i10 = iMin3;
                                i11 = i45;
                                c9829 = c98210;
                                i54 = i55 == 0 ? iM32789 + 1 : i54;
                                int i63 = (i37 - iM32789) - 1;
                                if (i63 >= 2) {
                                    if (i63 > i3) {
                                        i63 = i3;
                                    }
                                    int iM327810 = abstractC13644.m32784(iM32789 + 1, c19705Arr[this.f59878].f63650[i55], i63);
                                    if (iM327810 >= 2) {
                                        int iM24899 = iM8553 + c9829.m24897(iM32789, i39);
                                        c0659.m2667(c19705Arr[this.f59878].f63656);
                                        c0659.m2671();
                                        int i64 = i38 + iM32789;
                                        int iM381010 = iM24899 + this.f8628.m38109(abstractC13644.m32783(iM32789, 0), abstractC13644.m32782(0), abstractC13644.m32783(iM32789, 1), i64, this.f59879);
                                        c0659.m2672();
                                        int iM8554 = iM381010 + m8552(iM327810, c0659, (i64 + 1) & i24);
                                        int iM44633 = C19373.m44633(this.f59878, iM32789, 1, iM327810);
                                        while (true) {
                                            int i65 = this.f59880;
                                            if (i65 >= iM44633) {
                                                break;
                                            }
                                            int i66 = i65 + 1;
                                            this.f59880 = i66;
                                            c19705Arr[i66].f63657 = 1073741824;
                                        }
                                        C19705 c197018 = c19705Arr[iM44633];
                                        if (iM8554 < c197018.f63657) {
                                            int i67 = this.f59878;
                                            c197018.f63657 = iM8554;
                                            c197018.f63655 = iM32789 + i67 + 1;
                                            c197018.f63649 = 0;
                                            c197018.f63652 = true;
                                            c197018.f63653 = true;
                                            c197018.f63654 = i67;
                                            c197018.f63651 = i55;
                                        }
                                    }
                                }
                            }
                            i55++;
                            i53 = 2;
                            c98210 = c9829;
                            iMin3 = i10;
                            i45 = i11;
                        }
                        c9828 = c98210;
                        int i68 = i54;
                        C2065 c2068 = this.f59881;
                        int i69 = c2068.f6889;
                        if (i69 > 0) {
                            if (c2068.f6891[i69 - 1] > i37) {
                                c2068.f6889 = 0;
                                while (true) {
                                    c2065 = this.f59881;
                                    iArr3 = c2065.f6891;
                                    i8 = c2065.f6889;
                                    if (iArr3[i8] >= i37) {
                                        break;
                                    }
                                    c2065.f6889 = i8 + 1;
                                }
                                c2065.f6889 = i8 + 1;
                                iArr3[i8] = i37;
                            }
                            C2065 c2069 = this.f59881;
                            int i70 = i68;
                            if (c2069.f6891[c2069.f6889 - 1] >= i70) {
                                while (true) {
                                    int i71 = this.f59880;
                                    i6 = this.f59878;
                                    C2065 c20610 = this.f59881;
                                    if (i71 >= c20610.f6891[c20610.f6889 - 1] + i6) {
                                        break;
                                    }
                                    int i72 = i71 + 1;
                                    this.f59880 = i72;
                                    c19705Arr[i72].f63657 = 1073741824;
                                }
                                short s = sArr7[c19705Arr[i6].f63656.m2666()];
                                int i73 = 0;
                                int iM36558 = C15469.m36551(s, 0) + iM36555;
                                while (i70 > this.f59881.f6891[i73]) {
                                    i73++;
                                }
                                while (true) {
                                    int i74 = this.f59881.f6890[i73];
                                    int iM8555 = m8550(iM36558, i74, i70, i39);
                                    int i75 = this.f59878;
                                    C19705 c197019 = c19705Arr[i75 + i70];
                                    if (iM8555 < c197019.f63657) {
                                        c197019.m45397(iM8555, i75, i74 + 4);
                                    }
                                    if (i70 != this.f59881.f6891[i73]) {
                                        i7 = iM36558;
                                    } else {
                                        int i76 = (i37 - i70) - 1;
                                        if (i76 < 2) {
                                            i7 = iM36558;
                                        } else {
                                            if (i76 > i3) {
                                                i76 = i3;
                                            }
                                            int iM327811 = abstractC13644.m32784(i70 + 1, i74, i76);
                                            if (iM327811 >= 2) {
                                                c0659.m2667(c19705Arr[this.f59878].f63656);
                                                c0659.m2669();
                                                int i77 = i38 + i70;
                                                i7 = iM36558;
                                                int iM381011 = iM8555 + this.f8628.m38109(abstractC13644.m32783(i70, 0), abstractC13644.m32782(0), abstractC13644.m32783(i70, 1), i77, this.f59879);
                                                c0659.m2672();
                                                int iM8556 = iM381011 + m8552(iM327811, c0659, (i77 + 1) & i24);
                                                int iM44634 = C19373.m44633(this.f59878, i70, 1, iM327811);
                                                while (true) {
                                                    int i78 = this.f59880;
                                                    if (i78 >= iM44634) {
                                                        break;
                                                    }
                                                    int i79 = i78 + 1;
                                                    this.f59880 = i79;
                                                    c19705Arr[i79].f63657 = 1073741824;
                                                }
                                                C19705 c197020 = c19705Arr[iM44634];
                                                if (iM8556 < c197020.f63657) {
                                                    int i80 = this.f59878;
                                                    c197020.f63657 = iM8556;
                                                    c197020.f63655 = i80 + i70 + 1;
                                                    c197020.f63649 = 0;
                                                    c197020.f63652 = true;
                                                    c197020.f63653 = true;
                                                    c197020.f63654 = i80;
                                                    c197020.f63651 = i74 + 4;
                                                }
                                            } else {
                                                i7 = iM36558;
                                            }
                                        }
                                        i73++;
                                        if (i73 == this.f59881.f6889) {
                                            break;
                                        }
                                    }
                                    i70++;
                                    iM36558 = i7;
                                }
                            }
                        }
                    } else {
                        c9828 = c98210;
                    }
                    iMin2 = i37;
                    i27 = i3;
                    c9827 = c9828;
                    sArr6 = sArr2;
                    sArr4 = sArr7;
                    i26 = i38;
                }
                int i81 = this.f59878;
                this.f59880 = i81;
                int i82 = c19705Arr[i81].f63655;
                while (true) {
                    int i83 = this.f59878;
                    C19705 c197021 = c19705Arr[i83];
                    if (c197021.f63652) {
                        C19705 c197022 = c19705Arr[i82];
                        c197022.f63655 = i83;
                        c197022.f63649 = -1;
                        int i84 = i82 - 1;
                        this.f59878 = i82;
                        if (c197021.f63653) {
                            C19705 c197023 = c19705Arr[i84];
                            c197023.f63655 = i82;
                            c197023.f63649 = c197021.f63651;
                            this.f59878 = i84;
                            i82 = c197021.f63654;
                        } else {
                            i82 = i84;
                        }
                    }
                    C19705 c197024 = c19705Arr[i82];
                    int i85 = c197024.f63655;
                    c197024.f63655 = this.f59878;
                    this.f59878 = i82;
                    if (i82 <= 0) {
                        int i86 = c19705Arr[0].f63655;
                        this.f59878 = i86;
                        this.f8631 = c19705Arr[i86].f63649;
                        return i86;
                    }
                    i82 = i85;
                }
            }
        }
        return 1;
    }
}
