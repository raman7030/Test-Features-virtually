package p067l;

/* JADX INFO: renamed from: l.ᩴ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20425 extends AbstractC5002 {

    /* JADX INFO: renamed from: ۛ */
    public int f63107;

    /* JADX INFO: renamed from: ۤ */
    public final C2989 f63108;

    /* JADX INFO: renamed from: ۨ */
    public int f63109;

    /* JADX INFO: renamed from: ۫ */
    public C4331 f63110;

    /* JADX INFO: renamed from: ܰ */
    public final int[] f63111;

    /* JADX INFO: renamed from: ᩺ */
    public final C21096[] f63112;

    public C20425(C17070 c17070, int i, int i2, int i3, int i4, int i5, int i6, int i7, C6422 c6422) {
        super(c17070, AbstractC15335.m34893(i3, Math.max(i4, 4096), 4096, i5, i6, i7, c6422), i, i2, i3, i5);
        this.f63112 = new C21096[4096];
        this.f63107 = 0;
        this.f63109 = 0;
        this.f63111 = new int[4];
        this.f63108 = new C2989();
        for (int i8 = 0; i8 < 4096; i8++) {
            this.f63112[i8] = new C21096();
        }
    }

    @Override // p067l.AbstractC5002, p067l.AbstractC19083
    /* JADX INFO: renamed from: ֫ */
    public final void mo10616() {
        this.f63107 = 0;
        this.f63109 = 0;
        super.mo10616();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x038f  */
    /* JADX WARN: Code duplicated, block: B:230:0x060d  */
    @Override // p067l.AbstractC5002
    /* JADX INFO: renamed from: ܿ */
    public final int mo10623() {
        int[] iArr;
        int[] iArr2;
        int i;
        short[][] sArr;
        int i2;
        C11708 c11708;
        int i3;
        int i4;
        int i5;
        boolean z;
        short[] sArr2;
        C11708 c11709;
        int i6;
        int i7;
        C4331 c4331;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        C11708 c117010;
        int i12;
        int i13 = this.f63107;
        int i14 = this.f63109;
        C21096[] c21096Arr = this.f63112;
        if (i13 < i14) {
            int i15 = c21096Arr[i13].f66286;
            int i16 = i15 - i13;
            this.f63107 = i15;
            this.f11425 = c21096Arr[i15].f66280;
            return i16;
        }
        this.f63107 = 0;
        this.f63109 = 0;
        this.f11425 = -1;
        if (this.f11420 == -1) {
            this.f63110 = m10624();
        }
        AbstractC15335 abstractC15335 = this.f11424;
        int iMin = Math.min(abstractC15335.m34896(), 273);
        if (iMin >= 2) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                iArr = this.f56940;
                iArr2 = this.f63111;
                if (i17 >= 4) {
                    break;
                }
                int iM34902 = abstractC15335.m34902(iArr[i17], iMin);
                iArr2[i17] = iM34902;
                if (iM34902 < 2) {
                    iArr2[i17] = 0;
                } else if (iM34902 > iArr2[i18]) {
                    i18 = i17;
                }
                i17++;
            }
            int i19 = iArr2[i18];
            int i20 = this.f11429;
            if (i19 >= i20) {
                this.f11425 = i18;
                m10617(i19 - 1);
                return iArr2[i18];
            }
            C4331 c4332 = this.f63110;
            int i21 = c4332.f9673;
            if (i21 > 0) {
                int i22 = i21 - 1;
                i = c4332.f9675[i22];
                int i23 = c4332.f9674[i22];
                if (i >= i20) {
                    this.f11425 = i23 + 4;
                    m10617(i - 1);
                    return i;
                }
            } else {
                i = 0;
            }
            int iM34897 = abstractC15335.m34897(0);
            int iM34898 = abstractC15335.m34897(iArr[0] + 1);
            if (i >= 2 || iM34897 == iM34898 || iArr2[i18] >= 2) {
                int iM34905 = abstractC15335.m34905();
                int i24 = this.f56941;
                int i25 = iM34905 & i24;
                int iM34899 = abstractC15335.m34897(1);
                C17741 c17741 = this.f11422;
                C2989 c2989 = this.f56944;
                int i26 = iM34905;
                c21096Arr[1].m47701(c17741.m40321(iM34897, iM34898, iM34899, iM34905, c2989), 0, -1);
                int iM5006 = c2989.m5006();
                short[][] sArr3 = this.f56947;
                int iM38710 = C17070.m38710(sArr3[iM5006][i25], 1);
                int iM5007 = c2989.m5006();
                short[] sArr4 = this.f56946;
                int iM38711 = C17070.m38710(sArr4[iM5007], 1) + iM38710;
                short[][] sArr5 = this.f56949;
                int i27 = i20;
                short[] sArr6 = this.f56943;
                if (iM34898 == iM34897) {
                    sArr = sArr5;
                    int iM38712 = C17070.m38710(sArr5[c2989.m5006()][i25], 0) + C17070.m38710(sArr6[c2989.m5006()], 0) + iM38711;
                    C21096 c21096 = c21096Arr[1];
                    if (iM38712 < c21096.f66288) {
                        c21096.m47701(iM38712, 0, 0);
                    }
                } else {
                    sArr = sArr5;
                }
                int iMax = Math.max(i, iArr2[i18]);
                this.f63109 = iMax;
                if (iMax < 2) {
                    this.f11425 = c21096Arr[1].f66280;
                    return 1;
                }
                m10619();
                c21096Arr[0].f66287.m5007(c2989);
                System.arraycopy(iArr, 0, c21096Arr[0].f66281, 0, 4);
                int i28 = this.f63109;
                while (true) {
                    i2 = 2;
                    if (i28 < 2) {
                        break;
                    }
                    c21096Arr[i28].f66288 = 1073741824;
                    i28--;
                }
                int i29 = 0;
                while (true) {
                    c11708 = this.f11418;
                    if (i29 >= 4) {
                        break;
                    }
                    int i30 = iArr2[i29];
                    if (i30 < i2) {
                        i12 = iM38711;
                    } else {
                        int iM10614 = m10614(iM38711, i29, c2989, i25);
                        while (true) {
                            int iM26912 = c11708.m26912(i30, i25) + iM10614;
                            int i31 = iM10614;
                            C21096 c21097 = c21096Arr[i30];
                            i12 = iM38711;
                            if (iM26912 < c21097.f66288) {
                                c21097.m47701(iM26912, 0, i29);
                            }
                            i30--;
                            if (i30 < 2) {
                                break;
                            }
                            iM10614 = i31;
                            iM38711 = i12;
                        }
                    }
                    i29++;
                    i2 = 2;
                    iM38711 = i12;
                }
                int iMax2 = Math.max(iArr2[0] + 1, 2);
                if (iMax2 <= i) {
                    int iM38713 = C17070.m38710(sArr4[c2989.m5006()], 0) + iM38710;
                    int i32 = 0;
                    while (iMax2 > this.f63110.f9675[i32]) {
                        i32++;
                    }
                    while (true) {
                        int i33 = this.f63110.f9674[i32];
                        int iM10613 = m10613(iM38713, i33, iMax2, i25);
                        C21096 c21098 = c21096Arr[iMax2];
                        if (iM10613 < c21098.f66288) {
                            c21098.m47701(iM10613, 0, i33 + 4);
                        }
                        C4331 c4333 = this.f63110;
                        if (iMax2 == c4333.f9675[i32] && (i32 = i32 + 1) == c4333.f9673) {
                            break;
                        }
                        iMax2++;
                    }
                }
                int iMin2 = Math.min(abstractC15335.m34896(), 4095);
                while (true) {
                    int i34 = this.f63107 + 1;
                    this.f63107 = i34;
                    if (i34 >= this.f63109) {
                        break;
                    }
                    C4331 c4331M10624 = m10624();
                    this.f63110 = c4331M10624;
                    int i35 = c4331M10624.f9673;
                    if (i35 > 0) {
                        int i36 = c4331M10624.f9675[i35 - 1];
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
                    C21096 c21099 = c21096Arr[this.f63107];
                    int i40 = c21099.f66286;
                    C2989 c29810 = c21099.f66287;
                    if (c21099.f66283) {
                        i40--;
                        if (c21099.f66284) {
                            c29810.m5007(c21096Arr[c21099.f66285].f66287);
                            C21096 c210910 = c21096Arr[this.f63107];
                            int i41 = c210910.f66282;
                            C2989 c29811 = c210910.f66287;
                            if (i41 < 4) {
                                c29811.m5011();
                            } else {
                                c29811.m5009();
                            }
                        } else {
                            c29810.m5007(c21096Arr[i40].f66287);
                        }
                        c21096Arr[this.f63107].f66287.m5012();
                    } else {
                        c29810.m5007(c21096Arr[i40].f66287);
                    }
                    int i42 = this.f63107;
                    if (i40 == i42 - 1) {
                        C21096 c210911 = c21096Arr[i42];
                        int i43 = c210911.f66280;
                        C2989 c29812 = c210911.f66287;
                        if (i43 == 0) {
                            c29812.m5013();
                        } else {
                            c29812.m5012();
                        }
                        System.arraycopy(c21096Arr[i40].f66281, 0, c21096Arr[this.f63107].f66281, 0, 4);
                    } else {
                        C21096 c210912 = c21096Arr[i42];
                        boolean z2 = c210912.f66283;
                        C2989 c29813 = c210912.f66287;
                        if (z2 && c210912.f66284) {
                            i40 = c210912.f66285;
                            i4 = c210912.f66282;
                            c29813.m5011();
                            i5 = 4;
                        } else {
                            i4 = c210912.f66280;
                            i5 = 4;
                            if (i4 < 4) {
                                c29813.m5011();
                            } else {
                                c29813.m5009();
                            }
                        }
                        if (i4 < i5) {
                            c21096Arr[this.f63107].f66281[0] = c21096Arr[i40].f66281[i4];
                            int i44 = 1;
                            while (i44 <= i4) {
                                c21096Arr[this.f63107].f66281[i44] = c21096Arr[i40].f66281[i44 - 1];
                                i44++;
                            }
                            while (i44 < 4) {
                                c21096Arr[this.f63107].f66281[i44] = c21096Arr[i40].f66281[i44];
                                i44++;
                            }
                        } else {
                            int[] iArr4 = c21096Arr[this.f63107].f66281;
                            iArr4[0] = i4 - 4;
                            System.arraycopy(c21096Arr[i40].f66281, 0, iArr4, 1, 3);
                        }
                    }
                    C21096 c210913 = c21096Arr[this.f63107];
                    int iM38714 = C17070.m38710(sArr3[c210913.f66287.m5006()][i39], 1) + c210913.f66288;
                    int iM38715 = C17070.m38710(sArr4[c21096Arr[this.f63107].f66287.m5006()], 1) + iM38714;
                    int iM348910 = abstractC15335.m34897(0);
                    int iM348911 = abstractC15335.m34897(c21096Arr[this.f63107].f66281[0] + 1);
                    short[] sArr7 = sArr4;
                    C11708 c117011 = c11708;
                    int i45 = iM38715;
                    int iM40321 = c21096Arr[this.f63107].f66288 + this.f11422.m40321(iM348910, iM348911, abstractC15335.m34897(1), i38, c21096Arr[this.f63107].f66287);
                    int i46 = this.f63107;
                    C21096 c210914 = c21096Arr[i46 + 1];
                    if (iM40321 < c210914.f66288) {
                        c210914.m47701(iM40321, i46, -1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iM348911 == iM348910) {
                        int i47 = this.f63107;
                        C21096 c210915 = c21096Arr[i47 + 1];
                        if (c210915.f66286 == i47 || c210915.f66280 != 0) {
                            C2989 c29814 = c21096Arr[i47].f66287;
                            int iM38716 = C17070.m38710(sArr[c29814.m5006()][i39], 0) + C17070.m38710(sArr6[c29814.m5006()], 0) + i45;
                            int i48 = this.f63107;
                            C21096 c210916 = c21096Arr[i48 + 1];
                            sArr2 = sArr6;
                            if (iM38716 <= c210916.f66288) {
                                c210916.m47701(iM38716, i48, 0);
                                z = true;
                            }
                        } else {
                            sArr2 = sArr6;
                        }
                    } else {
                        sArr2 = sArr6;
                    }
                    C2989 c29815 = this.f63108;
                    if (!z && iM348911 != iM348910 && i37 > 2) {
                        int iM348912 = abstractC15335.m34899(1, c21096Arr[this.f63107].f66281[0], Math.min(i3, iMin2 - 2));
                        if (iM348912 >= 2) {
                            c29815.m5007(c21096Arr[this.f63107].f66287);
                            c29815.m5012();
                            int iM10615 = iM40321 + m10615(iM348912, c29815, (i26 + 2) & i24);
                            int i49 = this.f63107 + 1 + iM348912;
                            while (true) {
                                int i50 = this.f63109;
                                if (i50 >= i49) {
                                    break;
                                }
                                int i51 = i50 + 1;
                                this.f63109 = i51;
                                c21096Arr[i51].f66288 = 1073741824;
                            }
                            C21096 c210917 = c21096Arr[i49];
                            if (iM10615 < c210917.f66288) {
                                int i52 = this.f63107;
                                c210917.f66288 = iM10615;
                                c210917.f66286 = i52 + 1;
                                c210917.f66280 = 0;
                                c210917.f66283 = true;
                                c210917.f66284 = false;
                            }
                        }
                    }
                    int i53 = 2;
                    if (i37 >= 2) {
                        int iMin3 = Math.min(i37, i3);
                        int i54 = 2;
                        int i55 = 0;
                        while (i55 < 4) {
                            int iM34903 = abstractC15335.m34902(c21096Arr[this.f63107].f66281[i55], iMin3);
                            if (iM34903 < i53) {
                                i10 = iMin3;
                                i11 = i45;
                                c117010 = c117011;
                            } else {
                                while (true) {
                                    int i56 = this.f63109;
                                    i9 = this.f63107;
                                    if (i56 >= i9 + iM34903) {
                                        break;
                                    }
                                    int i57 = i56 + 1;
                                    this.f63109 = i57;
                                    c21096Arr[i57].f66288 = 1073741824;
                                }
                                int iM10616 = m10614(i45, i55, c21096Arr[i9].f66287, i39);
                                int i58 = iM34903;
                                while (i58 >= 2) {
                                    C11708 c117012 = c117011;
                                    int iM26913 = c117012.m26912(i58, i39) + iM10616;
                                    int i59 = iMin3;
                                    int i60 = this.f63107;
                                    int i61 = i45;
                                    C21096 c210918 = c21096Arr[i60 + i58];
                                    int i62 = i54;
                                    if (iM26913 < c210918.f66288) {
                                        c210918.m47701(iM26913, i60, i55);
                                    }
                                    i58--;
                                    iMin3 = i59;
                                    i54 = i62;
                                    i45 = i61;
                                    c117011 = c117012;
                                }
                                i10 = iMin3;
                                i11 = i45;
                                c117010 = c117011;
                                i54 = i55 == 0 ? iM34903 + 1 : i54;
                                int i63 = (i37 - iM34903) - 1;
                                if (i63 >= 2) {
                                    if (i63 > i3) {
                                        i63 = i3;
                                    }
                                    int iM348913 = abstractC15335.m34899(iM34903 + 1, c21096Arr[this.f63107].f66281[i55], i63);
                                    if (iM348913 >= 2) {
                                        int iM26914 = iM10616 + c117010.m26912(iM34903, i39);
                                        c29815.m5007(c21096Arr[this.f63107].f66287);
                                        c29815.m5011();
                                        int i64 = i38 + iM34903;
                                        int iM40322 = iM26914 + this.f11422.m40321(abstractC15335.m34898(iM34903, 0), abstractC15335.m34897(0), abstractC15335.m34898(iM34903, 1), i64, this.f63108);
                                        c29815.m5012();
                                        int iM10617 = iM40322 + m10615(iM348913, c29815, (i64 + 1) & i24);
                                        int iM46927 = C20780.m46927(this.f63107, iM34903, 1, iM348913);
                                        while (true) {
                                            int i65 = this.f63109;
                                            if (i65 >= iM46927) {
                                                break;
                                            }
                                            int i66 = i65 + 1;
                                            this.f63109 = i66;
                                            c21096Arr[i66].f66288 = 1073741824;
                                        }
                                        C21096 c210919 = c21096Arr[iM46927];
                                        if (iM10617 < c210919.f66288) {
                                            int i67 = this.f63107;
                                            c210919.f66288 = iM10617;
                                            c210919.f66286 = iM34903 + i67 + 1;
                                            c210919.f66280 = 0;
                                            c210919.f66283 = true;
                                            c210919.f66284 = true;
                                            c210919.f66285 = i67;
                                            c210919.f66282 = i55;
                                        }
                                    }
                                }
                            }
                            i55++;
                            i53 = 2;
                            c117011 = c117010;
                            iMin3 = i10;
                            i45 = i11;
                        }
                        c11709 = c117011;
                        int i68 = i54;
                        C4331 c4334 = this.f63110;
                        int i69 = c4334.f9673;
                        if (i69 > 0) {
                            if (c4334.f9675[i69 - 1] > i37) {
                                c4334.f9673 = 0;
                                while (true) {
                                    c4331 = this.f63110;
                                    iArr3 = c4331.f9675;
                                    i8 = c4331.f9673;
                                    if (iArr3[i8] >= i37) {
                                        break;
                                    }
                                    c4331.f9673 = i8 + 1;
                                }
                                c4331.f9673 = i8 + 1;
                                iArr3[i8] = i37;
                            }
                            C4331 c4335 = this.f63110;
                            int i70 = i68;
                            if (c4335.f9675[c4335.f9673 - 1] >= i70) {
                                while (true) {
                                    int i71 = this.f63109;
                                    i6 = this.f63107;
                                    C4331 c4336 = this.f63110;
                                    if (i71 >= c4336.f9675[c4336.f9673 - 1] + i6) {
                                        break;
                                    }
                                    int i72 = i71 + 1;
                                    this.f63109 = i72;
                                    c21096Arr[i72].f66288 = 1073741824;
                                }
                                short s = sArr7[c21096Arr[i6].f66287.m5006()];
                                int i73 = 0;
                                int iM38717 = C17070.m38710(s, 0) + iM38714;
                                while (i70 > this.f63110.f9675[i73]) {
                                    i73++;
                                }
                                while (true) {
                                    int i74 = this.f63110.f9674[i73];
                                    int iM10618 = m10613(iM38717, i74, i70, i39);
                                    int i75 = this.f63107;
                                    C21096 c210920 = c21096Arr[i75 + i70];
                                    if (iM10618 < c210920.f66288) {
                                        c210920.m47701(iM10618, i75, i74 + 4);
                                    }
                                    if (i70 != this.f63110.f9675[i73]) {
                                        i7 = iM38717;
                                    } else {
                                        int i76 = (i37 - i70) - 1;
                                        if (i76 < 2) {
                                            i7 = iM38717;
                                        } else {
                                            if (i76 > i3) {
                                                i76 = i3;
                                            }
                                            int iM348914 = abstractC15335.m34899(i70 + 1, i74, i76);
                                            if (iM348914 >= 2) {
                                                c29815.m5007(c21096Arr[this.f63107].f66287);
                                                c29815.m5009();
                                                int i77 = i38 + i70;
                                                i7 = iM38717;
                                                int iM40323 = iM10618 + this.f11422.m40321(abstractC15335.m34898(i70, 0), abstractC15335.m34897(0), abstractC15335.m34898(i70, 1), i77, this.f63108);
                                                c29815.m5012();
                                                int iM10619 = iM40323 + m10615(iM348914, c29815, (i77 + 1) & i24);
                                                int iM46928 = C20780.m46927(this.f63107, i70, 1, iM348914);
                                                while (true) {
                                                    int i78 = this.f63109;
                                                    if (i78 >= iM46928) {
                                                        break;
                                                    }
                                                    int i79 = i78 + 1;
                                                    this.f63109 = i79;
                                                    c21096Arr[i79].f66288 = 1073741824;
                                                }
                                                C21096 c210921 = c21096Arr[iM46928];
                                                if (iM10619 < c210921.f66288) {
                                                    int i80 = this.f63107;
                                                    c210921.f66288 = iM10619;
                                                    c210921.f66286 = i80 + i70 + 1;
                                                    c210921.f66280 = 0;
                                                    c210921.f66283 = true;
                                                    c210921.f66284 = true;
                                                    c210921.f66285 = i80;
                                                    c210921.f66282 = i74 + 4;
                                                }
                                            } else {
                                                i7 = iM38717;
                                            }
                                        }
                                        i73++;
                                        if (i73 == this.f63110.f9673) {
                                            break;
                                        }
                                    }
                                    i70++;
                                    iM38717 = i7;
                                }
                            }
                        }
                    } else {
                        c11709 = c117011;
                    }
                    iMin2 = i37;
                    i27 = i3;
                    c11708 = c11709;
                    sArr6 = sArr2;
                    sArr4 = sArr7;
                    i26 = i38;
                }
                int i81 = this.f63107;
                this.f63109 = i81;
                int i82 = c21096Arr[i81].f66286;
                while (true) {
                    int i83 = this.f63107;
                    C21096 c210922 = c21096Arr[i83];
                    if (c210922.f66283) {
                        C21096 c210923 = c21096Arr[i82];
                        c210923.f66286 = i83;
                        c210923.f66280 = -1;
                        int i84 = i82 - 1;
                        this.f63107 = i82;
                        if (c210922.f66284) {
                            C21096 c210924 = c21096Arr[i84];
                            c210924.f66286 = i82;
                            c210924.f66280 = c210922.f66282;
                            this.f63107 = i84;
                            i82 = c210922.f66285;
                        } else {
                            i82 = i84;
                        }
                    }
                    C21096 c210925 = c21096Arr[i82];
                    int i85 = c210925.f66286;
                    c210925.f66286 = this.f63107;
                    this.f63107 = i82;
                    if (i82 <= 0) {
                        int i86 = c21096Arr[0].f66286;
                        this.f63107 = i86;
                        this.f11425 = c21096Arr[i86].f66280;
                        return i86;
                    }
                    i82 = i85;
                }
            }
        }
        return 1;
    }
}
