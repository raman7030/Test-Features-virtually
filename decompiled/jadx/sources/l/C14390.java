package l;

/* JADX INFO: renamed from: l.ܳ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M7S7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14390 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f43353 = {-1, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f43354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f43355;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43356;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m34361(int i, int i2) {
        return i | (i2 << 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int m34370(int i, int i2) {
        return (i << 8) | i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m34366(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        iArr[i] = iArr2[i2];
        iArr2[i2] = i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34371(int i, int i2, int i3) {
        byte[] bArr;
        int[] iArr = this.f43354;
        int i4 = iArr[i] + i3;
        int i5 = i3 + iArr[i2];
        int i6 = iArr[i + 1] + 2;
        int i7 = iArr[i2 + 1] + 2;
        while (true) {
            bArr = this.f43355;
            if (i4 >= i6 || i5 >= i7 || bArr[i4] != bArr[i5]) {
                break;
            }
            i4++;
            i5++;
        }
        if (i4 >= i6) {
            return i5 < i7 ? -1 : 0;
        }
        if (i5 < i7) {
            return (bArr[i4] & 255) - (bArr[i5] & 255);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34364(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f43354;
        int i6 = iArr[i3 + i4];
        int i7 = iArr[i2 + i6] + i;
        byte[] bArr = this.f43355;
        int i8 = bArr[i7] & 255;
        while (true) {
            int i9 = i4 * 2;
            int i10 = i9 + 1;
            if (i10 >= i5) {
                break;
            }
            int i11 = i9 + 2;
            int i12 = bArr[iArr[iArr[i3 + i10] + i2] + i] & 255;
            int i13 = bArr[iArr[iArr[i3 + i11] + i2] + i] & 255;
            if (i12 < i13) {
                i12 = i13;
            } else {
                i11 = i10;
            }
            if (i12 <= i8) {
                break;
            }
            iArr[i4 + i3] = iArr[i3 + i11];
            i4 = i11;
        }
        iArr[i3 + i4] = i6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34373(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f43354;
        int i6 = iArr[iArr[i3] + i2] + i;
        byte[] bArr = this.f43355;
        int i7 = bArr[i6] & 255;
        int i8 = bArr[iArr[iArr[i4] + i2] + i] & 255;
        int i9 = bArr[i + iArr[i2 + iArr[i5]]] & 255;
        if (i7 <= i8) {
            i4 = i3;
            i3 = i4;
            i8 = i7;
            i7 = i8;
        }
        if (i7 > i9) {
            return i8 > i9 ? i4 : i5;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34360(int i) {
        int i2 = 65280 & i;
        int[] iArr = f43353;
        return i2 != 0 ? iArr[(i >> 8) & 255] + 8 : iArr[i & 255];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m34362(int i, int i2, int i3, int i4) {
        int[] iArr;
        int i5;
        int i6 = i2 - 1;
        while (true) {
            i6++;
            iArr = this.f43354;
            if (i6 < i3) {
                int i7 = iArr[i6];
                if (iArr[i + i7] + i4 >= iArr[i + i7 + 1] + 1) {
                    iArr[i6] = ~i7;
                }
            }
            do {
                i3--;
                if (i6 >= i3) {
                    break;
                }
                i5 = iArr[i3];
            } while (iArr[i + i5] + i4 < iArr[i5 + i + 1] + 1);
            if (i3 <= i6) {
                break;
            }
            int i8 = ~iArr[i3];
            iArr[i3] = iArr[i6];
            iArr[i6] = i8;
        }
        if (i2 < i6) {
            iArr[i2] = ~iArr[i2];
        }
        return i6;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34376(int i, int i2, int i3) {
        int iM34371;
        byte[] bArr;
        int[] iArr;
        int i4;
        int iM34373;
        int i5;
        int i6;
        int iM34360;
        int i7;
        int i8;
        int i9;
        int i10;
        C17213[] c17213Arr = new C17213[64];
        int iM34362 = i2;
        int i11 = i3;
        int iM34361 = m34360(i3 - i2);
        C14390 c14390 = this;
        int i12 = 2;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i11 - iM34362;
            int[] iArr2 = c14390.f43354;
            if (i15 <= 8) {
                if (1 < i15) {
                    for (int i16 = i11 - 2; iM34362 <= i16; i16--) {
                        int i17 = iArr2[i16];
                        int i18 = i16 + 1;
                        do {
                            iM34371 = c14390.m34371(i + i17, iArr2[i18] + i, i12);
                            if (iM34371 <= 0) {
                                break;
                            }
                            do {
                                iArr2[i18 - 1] = iArr2[i18];
                                i18++;
                                if (i18 >= i11) {
                                    break;
                                }
                            } while (iArr2[i18] < 0);
                        } while (i11 > i18);
                        if (iM34371 == 0) {
                            iArr2[i18] = ~iArr2[i18];
                        }
                        iArr2[i18 - 1] = i17;
                    }
                }
                if (i13 == 0) {
                    return;
                }
                i13--;
                C17213 c17213 = c17213Arr[i13];
                iM34362 = c17213.f52809;
                i11 = c17213.f52810;
                i12 = c17213.f52811;
                iM34361 = c17213.f52812;
            } else {
                iM34361--;
                byte[] bArr2 = c14390.f43355;
                if (iM34361 == 0) {
                    int i19 = i15 % 2;
                    if (i19 == 0) {
                        int i20 = i15 - 1;
                        int i21 = (i20 / 2) + iM34362;
                        int i22 = iArr2[i21];
                        int i23 = bArr2[i12 + iArr2[i + i22]] & 255;
                        int i24 = iM34362 + i20;
                        int i25 = iArr2[i24];
                        if (i23 < (bArr2[i12 + iArr2[i + i25]] & 255)) {
                            iArr2[i24] = i22;
                            iArr2[i21] = i25;
                        }
                        i10 = i20;
                    } else {
                        i10 = i15;
                    }
                    int i26 = (i10 / 2) - 1;
                    while (i26 >= 0) {
                        m34364(i12, i, iM34362, i26, i10);
                        i26--;
                        bArr2 = bArr2;
                        iArr2 = iArr2;
                        iM34361 = iM34361;
                    }
                    bArr = bArr2;
                    iArr = iArr2;
                    i4 = iM34361;
                    if (i19 == 0) {
                        int i27 = iM34362 + i10;
                        int i28 = iArr[iM34362];
                        iArr[iM34362] = iArr[i27];
                        iArr[i27] = i28;
                        m34364(i12, i, iM34362, 0, i10);
                    }
                    while (true) {
                        i10--;
                        if (i10 <= 0) {
                            break;
                        }
                        int i29 = iArr[iM34362];
                        int i30 = iM34362 + i10;
                        iArr[iM34362] = iArr[i30];
                        m34364(i12, i, iM34362, 0, i10);
                        iArr[i30] = i29;
                    }
                    c14390 = this;
                } else {
                    bArr = bArr2;
                    iArr = iArr2;
                    i4 = iM34361;
                }
                if (iM34361 < 0) {
                    int i31 = bArr[iArr[iArr[iM34362] + i] + i12] & 255;
                    int i32 = iM34362;
                    iM34362++;
                    int iM34363 = i32;
                    while (iM34362 < i11) {
                        i14 = bArr[iArr[iArr[iM34362] + i] + i12] & 255;
                        if (i14 != i31) {
                            if (1 < iM34362 - iM34363) {
                                break;
                            }
                            iM34363 = iM34362;
                            i31 = i14;
                        }
                        iM34362++;
                    }
                    if ((bArr[(iArr[iArr[iM34363] + i] + i12) - 1] & 255) < i31) {
                        iM34363 = c14390.m34362(i, iM34363, iM34362, i12);
                    }
                    int i33 = iM34362 - iM34363;
                    int i34 = i11 - iM34362;
                    if (i33 <= i34) {
                        if (1 < i33) {
                            c17213Arr[i13] = new C17213(iM34362, i11, i12, -1);
                            i12++;
                            iM34361 = m34360(i33);
                            i13++;
                            i11 = iM34362;
                            iM34362 = iM34363;
                        } else {
                            iM34361 = -1;
                        }
                    } else if (1 < i34) {
                        c17213Arr[i13] = new C17213(iM34363, iM34362, i12 + 1, m34360(i33));
                        i13++;
                        iM34361 = -1;
                    } else {
                        i12++;
                        iM34361 = m34360(i33);
                        i11 = iM34362;
                        iM34362 = iM34363;
                    }
                } else {
                    int i35 = (i15 / 2) + iM34362;
                    if (i15 > 512) {
                        int i36 = i15 >> 3;
                        int i37 = i36 << 1;
                        int i38 = i12;
                        int i39 = i11 - 1;
                        iM34373 = m34373(i38, i, m34373(i38, i, iM34362, iM34362 + i36, iM34362 + i37), m34373(i38, i, i35 - i36, i35, i35 + i36), m34373(i38, i, i39 - i37, i39 - i36, i39));
                    } else if (i15 <= 32) {
                        iM34373 = c14390.m34373(i12, i, iM34362, i35, i11 - 1);
                    } else {
                        int i40 = i15 >> 2;
                        int i41 = iM34362 + i40;
                        int i42 = i11 - 1;
                        i7 = i42 - i40;
                        int i43 = bArr[iArr[iArr[iM34362] + i] + i12] & 255;
                        int i44 = bArr[iArr[iArr[i41] + i] + i12] & 255;
                        int i45 = bArr[iArr[iArr[i35] + i] + i12] & 255;
                        int i46 = bArr[iArr[iArr[i7] + i] + i12] & 255;
                        int i47 = bArr[i12 + iArr[i + iArr[i42]]] & 255;
                        if (i44 > i45) {
                            i35 = i41;
                            i41 = i35;
                            i45 = i44;
                            i44 = i45;
                        }
                        if (i46 > i47) {
                            i8 = i46;
                            i46 = i47;
                        } else {
                            i8 = i47;
                            iM34373 = i42;
                            i42 = i7;
                        }
                        if (i44 > i46) {
                            int i48 = i35;
                            i35 = iM34373;
                            iM34373 = i48;
                            int i49 = i8;
                            i8 = i45;
                            i45 = i49;
                        } else {
                            i41 = i42;
                            i44 = i46;
                        }
                        if (i43 > i45) {
                            iM34373 = i7;
                            i9 = i35;
                            i35 = iM34362;
                            int i50 = i45;
                            i45 = i43;
                            i43 = i50;
                        } else {
                            iM34373 = i7;
                            i9 = iM34362;
                        }
                        if (i43 > i44) {
                            iM34373 = i7;
                            i41 = i9;
                            i44 = i43;
                            i45 = i8;
                        } else {
                            iM34373 = i7;
                            iM34373 = i35;
                        }
                        if (i45 > i44) {
                            iM34373 = i7;
                            iM34373 = i7;
                            iM34373 = i41;
                        }
                    }
                    iM34373 = i7;
                    iM34373 = i7;
                    int i51 = iArr[iM34373];
                    int i52 = bArr[iArr[i + i51] + i12] & 255;
                    int i53 = iArr[iM34362];
                    iArr[iM34362] = i51;
                    iArr[iM34373] = i53;
                    int i54 = iM34362;
                    do {
                        i54++;
                        if (i54 >= i11) {
                            break;
                        } else {
                            i14 = bArr[iArr[iArr[i54] + i] + i12] & 255;
                        }
                    } while (i14 == i52);
                    if (i54 < i11 && i14 < i52) {
                        i5 = i54;
                        while (true) {
                            i54++;
                            if (i54 >= i11) {
                                break;
                            }
                            int i55 = iArr[i54];
                            i14 = bArr[iArr[i + i55] + i12] & 255;
                            if (i14 > i52) {
                                break;
                            }
                            if (i14 == i52) {
                                iArr[i54] = iArr[i5];
                                iArr[i5] = i55;
                                i5++;
                            }
                        }
                    } else {
                        i5 = i54;
                    }
                    int i56 = i11;
                    do {
                        i56--;
                        if (i54 >= i56) {
                            break;
                        } else {
                            i14 = bArr[iArr[iArr[i56] + i] + i12] & 255;
                        }
                    } while (i14 == i52);
                    if (i54 < i56 && i14 > i52) {
                        i6 = i56;
                        while (true) {
                            i56--;
                            if (i54 >= i56) {
                                break;
                            }
                            int i57 = iArr[i56];
                            i14 = bArr[iArr[i + i57] + i12] & 255;
                            if (i14 < i52) {
                                break;
                            }
                            if (i14 == i52) {
                                iArr[i56] = iArr[i6];
                                iArr[i6] = i57;
                                i6--;
                            }
                        }
                    } else {
                        i6 = i56;
                    }
                    while (i54 < i56) {
                        int i58 = iArr[i54];
                        iArr[i54] = iArr[i56];
                        iArr[i56] = i58;
                        while (true) {
                            i54++;
                            if (i54 >= i56) {
                                break;
                            }
                            int i59 = iArr[i54];
                            i14 = bArr[iArr[i + i59] + i12] & 255;
                            if (i14 > i52) {
                                break;
                            }
                            if (i14 == i52) {
                                iArr[i54] = iArr[i5];
                                iArr[i5] = i59;
                                i5++;
                            }
                        }
                        while (true) {
                            i56--;
                            if (i54 >= i56) {
                                break;
                            }
                            int i60 = iArr[i56];
                            i14 = bArr[iArr[i + i60] + i12] & 255;
                            if (i14 < i52) {
                                break;
                            }
                            if (i14 == i52) {
                                iArr[i56] = iArr[i6];
                                iArr[i6] = i60;
                                i6--;
                            }
                        }
                    }
                    if (i5 <= i6) {
                        int i61 = i54 - 1;
                        int i62 = i5 - iM34362;
                        int i63 = i54 - i5;
                        if (i62 > i63) {
                            i62 = i63;
                        }
                        int i64 = i54 - i62;
                        int i65 = iM34362;
                        while (i62 > 0) {
                            int i66 = iArr[i65];
                            iArr[i65] = iArr[i64];
                            iArr[i64] = i66;
                            i62--;
                            i65++;
                            i64++;
                        }
                        int i67 = i6 - i61;
                        int i68 = (i11 - i6) - 1;
                        if (i67 <= i68) {
                            i68 = i67;
                        }
                        int i69 = i11 - i68;
                        while (i68 > 0) {
                            int i70 = iArr[i54];
                            iArr[i54] = iArr[i69];
                            iArr[i69] = i70;
                            i68--;
                            i54++;
                            i69++;
                        }
                        int i71 = i63 + iM34362;
                        int i72 = i11 - i67;
                        int iM34364 = i52 <= (bArr[(iArr[iArr[i71] + i] + i12) + (-1)] & 255) ? i71 : m34362(i, i71, i72, i12);
                        int i73 = i71 - iM34362;
                        int i74 = i11 - i72;
                        if (i73 <= i74) {
                            int i75 = i72 - iM34364;
                            if (i74 <= i75) {
                                int i76 = i13 + 1;
                                c17213Arr[i13] = new C17213(iM34364, i72, i12 + 1, m34360(i75));
                                i13 += 2;
                                c17213Arr[i76] = new C17213(i72, i11, i12, iM34361);
                            } else if (i73 <= i75) {
                                int i77 = i13 + 1;
                                c17213Arr[i13] = new C17213(i72, i11, i12, iM34361);
                                i13 += 2;
                                c17213Arr[i77] = new C17213(iM34364, i72, i12 + 1, m34360(i75));
                            } else {
                                int i78 = i13 + 1;
                                c17213Arr[i13] = new C17213(i72, i11, i12, iM34361);
                                i13 += 2;
                                c17213Arr[i78] = new C17213(iM34362, i71, i12, iM34361);
                                i12++;
                                iM34360 = m34360(i75);
                                i11 = i72;
                                iM34361 = iM34360;
                                iM34362 = iM34364;
                            }
                            i11 = i71;
                        } else {
                            int i79 = i72 - iM34364;
                            if (i73 <= i79) {
                                int i80 = i13 + 1;
                                c17213Arr[i13] = new C17213(iM34364, i72, i12 + 1, m34360(i79));
                                i13 += 2;
                                c17213Arr[i80] = new C17213(iM34362, i71, i12, iM34361);
                            } else if (i74 <= i79) {
                                int i81 = i13 + 1;
                                c17213Arr[i13] = new C17213(iM34362, i71, i12, iM34361);
                                i13 += 2;
                                c17213Arr[i81] = new C17213(iM34364, i72, i12 + 1, m34360(i79));
                            } else {
                                int i82 = i13 + 1;
                                c17213Arr[i13] = new C17213(iM34362, i71, i12, iM34361);
                                i13 += 2;
                                c17213Arr[i82] = new C17213(i72, i11, i12, iM34361);
                                i12++;
                                iM34360 = m34360(i79);
                                i11 = i72;
                                iM34361 = iM34360;
                                iM34362 = iM34364;
                            }
                            iM34362 = i72;
                        }
                    } else {
                        if ((bArr[(iArr[iArr[iM34362] + i] + i12) - 1] & 255) < i52) {
                            iM34362 = m34362(i, iM34362, i11, i12);
                            iM34361 = m34360(i11 - iM34362);
                        } else {
                            iM34361 = i4;
                        }
                        i12++;
                    }
                    c14390 = this;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34367(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        while (i3 > 0) {
            m34366(i, i2, iArr, iArr2);
            i3--;
            i++;
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34375(int i, int i2) {
        int[] iArr = this.f43354;
        int i3 = iArr[i2];
        if (i3 >= 0) {
            int i4 = iArr[i2 - 1];
            if (i4 < 0) {
                i4 = ~i4;
            }
            if (m34371(i4 + i, i + i3, 2) == 0) {
                iArr[i2] = ~iArr[i2];
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34368(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int iM34371;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        i5 = i5;
        int i27 = i6;
        C17213[] c17213Arr = new C17213[64];
        int i28 = i2;
        int i29 = i3;
        int i30 = i4;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            int i33 = i30 - i29;
            int i34 = 1;
            int[] iArr2 = this.f43354;
            if (i33 <= i27) {
                if (i28 < i29 && i29 < i30) {
                    m34367(i5, i29, iArr, iArr2, i33);
                    int i35 = (i5 + i33) - 1;
                    int i36 = iArr[i35];
                    if (i36 < 0) {
                        i7 = (~i36) + i;
                    } else {
                        i7 = i36 + i;
                        i34 = 0;
                    }
                    int i37 = i29 - 1;
                    int i38 = iArr2[i37];
                    if (i38 < 0) {
                        i34 |= 2;
                        i38 = ~i38;
                    }
                    int i39 = i38 + i;
                    int i40 = i30 - 1;
                    int i41 = iArr2[i40];
                    int i42 = i40;
                    int i43 = i35;
                    int i44 = i34;
                    while (true) {
                        while (true) {
                            iM34371 = m34371(i7, i39, 2);
                            if (iM34371 > 0) {
                                if ((i44 & 1) != 0) {
                                    while (true) {
                                        i16 = i42 - 1;
                                        iArr2[i42] = iArr[i43];
                                        i17 = i43 - 1;
                                        iArr[i43] = iArr2[i16];
                                        if (iArr[i17] >= 0) {
                                            break;
                                        }
                                        i43 = i17;
                                        i42 = i16;
                                    }
                                    i44 ^= 1;
                                    i42 = i16;
                                    i15 = i17;
                                } else {
                                    i15 = i43;
                                }
                                int i45 = i42 - 1;
                                iArr2[i42] = iArr[i15];
                                if (i15 <= i5) {
                                    iArr[i15] = i41;
                                    break;
                                }
                                int i46 = i15 - 1;
                                iArr[i15] = iArr2[i45];
                                int i47 = iArr[i46];
                                if (i47 < 0) {
                                    i44 |= 1;
                                    i47 = ~i47;
                                }
                                i7 = i47 + i;
                                i42 = i45;
                                i43 = i46;
                            }
                        }
                        if (iM34371 < 0) {
                            if ((i44 & 2) != 0) {
                                while (true) {
                                    i9 = i42 - 1;
                                    iArr2[i42] = iArr2[i37];
                                    i10 = i37 - 1;
                                    iArr2[i37] = iArr2[i9];
                                    if (iArr2[i10] >= 0) {
                                        break;
                                    }
                                    i42 = i9;
                                    i37 = i10;
                                }
                                i44 ^= 2;
                                i42 = i9;
                                i37 = i10;
                            }
                            int i48 = i42 - 1;
                            iArr2[i42] = iArr2[i37];
                            int i49 = i37 - 1;
                            iArr2[i37] = iArr2[i48];
                            if (i49 < i28) {
                                while (true) {
                                    i8 = i43;
                                    if (i5 >= i8) {
                                        break;
                                    }
                                    int i50 = i48 - 1;
                                    iArr2[i48] = iArr[i8];
                                    i43 = i8 - 1;
                                    iArr[i8] = iArr2[i50];
                                    i48 = i50;
                                }
                                iArr2[i48] = iArr[i8];
                                iArr[i8] = i41;
                                break;
                            }
                            int i51 = iArr2[i49];
                            if (i51 < 0) {
                                i44 |= 2;
                                i51 = ~i51;
                            }
                            i42 = i48;
                            i39 = i51 + i;
                            i37 = i49;
                        } else {
                            if ((i44 & 1) != 0) {
                                while (true) {
                                    i14 = i42 - 1;
                                    iArr2[i42] = iArr[i43];
                                    i11 = i43 - 1;
                                    iArr[i43] = iArr2[i14];
                                    if (iArr[i11] >= 0) {
                                        break;
                                    }
                                    i42 = i14;
                                    i43 = i11;
                                }
                                i44 ^= 1;
                                i42 = i14;
                            } else {
                                i11 = i43;
                            }
                            int i52 = i42 - 1;
                            iArr2[i42] = ~iArr[i11];
                            if (i11 <= i5) {
                                iArr[i11] = i41;
                                break;
                            }
                            int i53 = i11 - 1;
                            iArr[i11] = iArr2[i52];
                            if ((i44 & 2) != 0) {
                                while (true) {
                                    i12 = i52 - 1;
                                    iArr2[i52] = iArr2[i37];
                                    i13 = i37 - 1;
                                    iArr2[i37] = iArr2[i12];
                                    if (iArr2[i13] >= 0) {
                                        break;
                                    }
                                    i37 = i13;
                                    i52 = i12;
                                }
                                i44 ^= 2;
                                i37 = i13;
                                i52 = i12;
                            }
                            int i54 = i52 - 1;
                            iArr2[i52] = iArr2[i37];
                            int i55 = i37 - 1;
                            iArr2[i37] = iArr2[i54];
                            if (i55 < i28) {
                                while (i5 < i53) {
                                    int i56 = i54 - 1;
                                    iArr2[i54] = iArr[i53];
                                    iArr[i53] = iArr2[i56];
                                    i54 = i56;
                                    i53--;
                                }
                                iArr2[i54] = iArr[i53];
                                iArr[i53] = i41;
                                break;
                            }
                            int i57 = iArr[i53];
                            if (i57 < 0) {
                                i44 |= 1;
                                i57 = ~i57;
                            }
                            int i58 = i57 + i;
                            int i59 = iArr2[i55];
                            if (i59 < 0) {
                                i44 |= 2;
                                i59 = ~i59;
                            }
                            i42 = i54;
                            i43 = i53;
                            i39 = i59 + i;
                            i37 = i55;
                            i7 = i58;
                        }
                    }
                }
                if ((i31 & 1) != 0) {
                    m34375(i, i28);
                }
                if ((i31 & 2) != 0) {
                    m34375(i, i30);
                }
                if (i32 == 0) {
                    return;
                }
                i32--;
                C17213 c17213 = c17213Arr[i32];
                int i60 = c17213.f52809;
                int i61 = c17213.f52810;
                int i62 = c17213.f52811;
                i31 = c17213.f52812;
                i28 = i60;
                i29 = i61;
                i30 = i62;
            } else {
                int i63 = i29 - i28;
                if (i63 <= i27) {
                    if (i28 < i29) {
                        int i64 = (i5 + i63) - 1;
                        m34367(i5, i28, iArr, iArr2, i63);
                        int i65 = iArr2[i28];
                        int i66 = i5;
                        int i67 = i28;
                        while (true) {
                            int i68 = i66;
                            int iM34372 = m34371(i + iArr[i66], i + iArr2[i29], 2);
                            if (iM34372 < 0) {
                                int i69 = i68;
                                while (true) {
                                    i23 = i67 + 1;
                                    iArr2[i67] = iArr[i69];
                                    if (i64 <= i69) {
                                        iArr[i69] = i65;
                                        break;
                                    }
                                    i22 = i69 + 1;
                                    iArr[i69] = iArr2[i23];
                                    if (iArr[i22] >= 0) {
                                        break;
                                    }
                                    i67 = i23;
                                    i69 = i22;
                                }
                                i66 = i22;
                                i67 = i23;
                            } else if (iM34372 > 0) {
                                while (true) {
                                    int i70 = i67 + 1;
                                    iArr2[i67] = iArr2[i29];
                                    int i71 = i29 + 1;
                                    iArr2[i29] = iArr2[i70];
                                    if (i30 <= i71) {
                                        int i72 = i68;
                                        while (i72 < i64) {
                                            int i73 = i70 + 1;
                                            iArr2[i70] = iArr[i72];
                                            iArr[i72] = iArr2[i73];
                                            i72++;
                                            i70 = i73;
                                        }
                                        iArr2[i70] = iArr[i72];
                                        iArr[i72] = i65;
                                        break;
                                    }
                                    if (iArr2[i71] >= 0) {
                                        i66 = i68;
                                        i67 = i70;
                                        i29 = i71;
                                        break;
                                    }
                                    i67 = i70;
                                    i29 = i71;
                                }
                            } else {
                                iArr2[i29] = ~iArr2[i29];
                                int i74 = i68;
                                while (true) {
                                    int i75 = i67 + 1;
                                    iArr2[i67] = iArr[i74];
                                    if (i64 <= i74) {
                                        iArr[i74] = i65;
                                        break;
                                    }
                                    i22 = i74 + 1;
                                    iArr[i74] = iArr2[i75];
                                    if (iArr[i22] >= 0) {
                                        while (true) {
                                            int i76 = i75 + 1;
                                            iArr2[i75] = iArr2[i29];
                                            int i77 = i29 + 1;
                                            iArr2[i29] = iArr2[i76];
                                            if (i30 <= i77) {
                                                while (i22 < i64) {
                                                    int i78 = i76 + 1;
                                                    iArr2[i76] = iArr[i22];
                                                    iArr[i22] = iArr2[i78];
                                                    i76 = i78;
                                                    i22++;
                                                }
                                                iArr2[i76] = iArr[i22];
                                                iArr[i22] = i65;
                                                break;
                                            }
                                            if (iArr2[i77] >= 0) {
                                                i29 = i77;
                                                i23 = i76;
                                                break;
                                            } else {
                                                i29 = i77;
                                                i75 = i76;
                                            }
                                        }
                                    } else {
                                        i67 = i75;
                                        i74 = i22;
                                    }
                                }
                                i66 = i22;
                                i67 = i23;
                            }
                            i27 = i6;
                        }
                    }
                    if ((i31 & 1) != 0) {
                        m34375(i, i28);
                    }
                    if ((i31 & 2) != 0) {
                        m34375(i, i30);
                    }
                    if (i32 == 0) {
                        return;
                    }
                    i32--;
                    C17213 c17214 = c17213Arr[i32];
                    i18 = c17214.f52809;
                    i19 = c17214.f52810;
                    i20 = c17214.f52811;
                    i21 = c17214.f52812;
                } else {
                    int iMin = Math.min(i63, i33);
                    int i79 = iMin >> 1;
                    int i80 = 0;
                    while (iMin > 0) {
                        int i81 = iArr2[i29 + i80 + i79];
                        if (i81 < 0) {
                            i81 = ~i81;
                        }
                        int i82 = i81 + i;
                        int i83 = iArr2[((i29 - i80) - i79) - i34];
                        if (i83 < 0) {
                            i83 = ~i83;
                        }
                        if (m34371(i82, i83 + i, 2) < 0) {
                            i80 += i79 + 1;
                            i79 -= (iMin & 1) ^ 1;
                        }
                        iMin = i79;
                        i79 = iMin >> 1;
                        i34 = 1;
                    }
                    if (i80 > 0) {
                        int i84 = i29 - i80;
                        m34367(i84, i29, iArr2, iArr2, i80);
                        int i85 = i29 + i80;
                        if (i85 < i30) {
                            if (iArr2[i85] < 0) {
                                i25 = i29;
                                while (iArr2[i25 - 1] < 0) {
                                    i25--;
                                }
                                iArr2[i85] = ~iArr2[i85];
                            } else {
                                i25 = i29;
                            }
                            i26 = i29;
                            while (iArr2[i26] < 0) {
                                i26++;
                            }
                            i24 = 1;
                        } else {
                            i24 = 0;
                            i25 = i29;
                            i26 = i25;
                        }
                        if (i25 - i28 <= i30 - i26) {
                            c17213Arr[i32] = new C17213(i26, i85, i30, i24 | (i31 & 2));
                            i31 &= 1;
                            i27 = i6;
                            i32++;
                            i30 = i25;
                            i29 = i84;
                            i5 = i5;
                        } else {
                            if (i25 == i29 && i29 == i26) {
                                i24 <<= 1;
                            }
                            c17213Arr[i32] = new C17213(i28, i84, i25, (i31 & 1) | (i24 & 2));
                            i31 = (i31 & 2) | (i24 & 1);
                            i32++;
                            i28 = i26;
                            i29 = i85;
                            i27 = i6;
                        }
                    } else {
                        if ((i31 & 1) != 0) {
                            m34375(i, i28);
                        }
                        m34375(i, i29);
                        if ((i31 & 2) != 0) {
                            m34375(i, i30);
                        }
                        if (i32 == 0) {
                            return;
                        }
                        i32--;
                        C17213 c17215 = c17213Arr[i32];
                        i18 = c17215.f52809;
                        i19 = c17215.f52810;
                        i20 = c17215.f52811;
                        i21 = c17215.f52812;
                    }
                }
                i31 = i21;
                i30 = i20;
                i29 = i19;
                i28 = i18;
                i27 = i6;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34372(int i, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int[] iArr = this.f43354;
        return i5 < i3 ? iArr[i5] : iArr[(((i2 - i) + i4) % (i3 - i)) + i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34365(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f43354;
        int i7 = iArr[i4 + i5];
        int iM34372 = m34372(i, i2, i3, i7);
        while (true) {
            int i8 = i5 * 2;
            int i9 = i8 + 1;
            if (i9 >= i6) {
                break;
            }
            int i10 = i8 + 2;
            int iM34373 = m34372(i, i2, i3, iArr[i4 + i9]);
            int iM34374 = m34372(i, i2, i3, iArr[i4 + i10]);
            if (iM34373 < iM34374) {
                iM34373 = iM34374;
            } else {
                i10 = i9;
            }
            if (iM34373 <= iM34372) {
                break;
            }
            iArr[i5 + i4] = iArr[i4 + i10];
            i5 = i10;
        }
        iArr[i4 + i5] = i7;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34377(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i5 % 2;
        int[] iArr = this.f43354;
        if (i7 == 0) {
            int i8 = i5 - 1;
            int i9 = (i8 / 2) + i4;
            int i10 = i4 + i8;
            if (m34372(i, i2, i3, iArr[i9]) < m34372(i, i2, i3, iArr[i10])) {
                int i11 = iArr[i10];
                iArr[i10] = iArr[i9];
                iArr[i9] = i11;
            }
            i6 = i8;
        } else {
            i6 = i5;
        }
        for (int i12 = (i6 / 2) - 1; i12 >= 0; i12--) {
            m34365(i, i2, i3, i4, i12, i6);
        }
        if (i7 == 0) {
            m34366(i4, i4 + i6, iArr, iArr);
            m34365(i, i2, i3, i4, 0, i6);
        }
        while (true) {
            i6--;
            if (i6 <= 0) {
                return;
            }
            int i13 = iArr[i4];
            int i14 = i4 + i6;
            iArr[i4] = iArr[i14];
            m34365(i, i2, i3, i4, 0, i6);
            iArr[i14] = i13;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m34380(int i, int i2, int i3, int i4, int i5) {
        int iM34372;
        for (int i6 = i4 + 1; i6 < i5; i6++) {
            int[] iArr = this.f43354;
            int i7 = iArr[i6];
            int i8 = i6 - 1;
            do {
                iM34372 = m34372(i, i2, i3, i7) - m34372(i, i2, i3, iArr[i8]);
                if (iM34372 >= 0) {
                    break;
                }
                do {
                    iArr[i8 + 1] = iArr[i8];
                    i8--;
                    if (i4 > i8) {
                        break;
                    }
                } while (iArr[i8] < 0);
            } while (i8 >= i4);
            if (iM34372 == 0) {
                iArr[i8] = ~iArr[i8];
            }
            iArr[i8 + 1] = i7;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m34369(int i) {
        int i2 = (-65536) & i;
        int[] iArr = f43353;
        if (i2 != 0) {
            return ((-16777216) & i) != 0 ? iArr[(i >> 24) & 255] + 24 : iArr[(i >> 16) & 255] + 16;
        }
        return (65280 & i) != 0 ? iArr[(i >> 8) & 255] + 8 : iArr[i & 255];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m34374(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.f43354;
        int iM34372 = m34372(i, i2, i3, iArr[i4]);
        int iM34373 = m34372(i, i2, i3, iArr[i5]);
        int iM34374 = m34372(i, i2, i3, iArr[i6]);
        if (iM34372 <= iM34373) {
            i5 = i4;
            i4 = i5;
            iM34373 = iM34372;
            iM34372 = iM34373;
        }
        if (iM34372 > iM34374) {
            return iM34373 > iM34374 ? i5 : i6;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m34378(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i5 - i4;
        int i8 = (i7 / 2) + i4;
        if (i7 > 512) {
            int i9 = i7 >> 3;
            int i10 = i9 << 1;
            int i11 = i5 - 1;
            return m34374(i, i2, i3, m34374(i, i2, i3, i4, i4 + i9, i4 + i10), m34374(i, i2, i3, i8 - i9, i8, i8 + i9), m34374(i, i2, i3, i11 - i10, i11 - i9, i11));
        }
        if (i7 > 32) {
            int i12 = i7 >> 2;
            int i13 = i4 + i12;
            int i14 = i5 - 1;
            int i15 = i14 - i12;
            int[] iArr = this.f43354;
            int iM34372 = m34372(i, i2, i3, iArr[i4]);
            int iM34373 = m34372(i, i2, i3, iArr[i13]);
            int iM34374 = m34372(i, i2, i3, iArr[i8]);
            int iM34375 = m34372(i, i2, i3, iArr[i15]);
            int iM34376 = m34372(i, i2, i3, iArr[i14]);
            if (iM34373 > iM34374) {
                i8 = i13;
                i13 = i8;
                iM34374 = iM34373;
                iM34373 = iM34374;
            }
            if (iM34375 > iM34376) {
                iM34375 = iM34376;
                iM34376 = iM34375;
            } else {
                i14 = i15;
                i15 = i14;
            }
            if (iM34373 > iM34375) {
                int i16 = i8;
                i8 = i15;
                i15 = i16;
                int i17 = iM34374;
                iM34374 = iM34376;
                iM34376 = i17;
            } else {
                i13 = i14;
                iM34373 = iM34375;
            }
            if (iM34372 > iM34374) {
                i6 = i8;
                i8 = i4;
                int i18 = iM34374;
                iM34374 = iM34372;
                iM34372 = i18;
            } else {
                i6 = i4;
            }
            if (iM34372 > iM34373) {
                i13 = i6;
                iM34373 = iM34372;
            } else {
                iM34376 = iM34374;
                i15 = i8;
            }
            return iM34376 > iM34373 ? i13 : i15;
        }
        return m34374(i, i2, i3, i4, i8, i5 - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34363(int i, int i2, int i3) {
        int i4;
        while (i2 < i3) {
            int[] iArr = this.f43354;
            if (iArr[i2] >= 0) {
                int i5 = i2;
                do {
                    iArr[iArr[i5] + i] = i5;
                    i5++;
                    if (i5 >= i3) {
                        break;
                    }
                } while (iArr[i5] >= 0);
                iArr[i2] = i2 - i5;
                if (i3 <= i5) {
                    return;
                } else {
                    i2 = i5;
                }
            }
            int i6 = i2;
            while (true) {
                iArr[i6] = ~iArr[i6];
                i4 = i6 + 1;
                if (iArr[i4] >= 0) {
                    break;
                } else {
                    i6 = i4;
                }
            }
            do {
                iArr[iArr[i2] + i] = i4;
                i2++;
            } while (i2 <= i4);
            i2 = i6 + 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:261:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:366:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:373:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:376:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:379:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:380:0x07fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:381:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:386:0x082d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0840 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:388:0x0842  */
    /* JADX WARN: Code duplicated, block: B:391:0x0848  */
    /* JADX WARN: Code duplicated, block: B:393:0x0855  */
    /* JADX WARN: Code duplicated, block: B:397:0x086c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0876  */
    /* JADX WARN: Code duplicated, block: B:406:0x088f  */
    /* JADX WARN: Code duplicated, block: B:411:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:415:0x08cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:427:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:431:0x0900 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x0929  */
    /* JADX WARN: Code duplicated, block: B:445:0x0943  */
    /* JADX WARN: Code duplicated, block: B:448:0x0951  */
    /* JADX WARN: Code duplicated, block: B:450:0x0959 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:451:0x095b  */
    /* JADX WARN: Code duplicated, block: B:458:0x0998  */
    /* JADX WARN: Code duplicated, block: B:460:0x09a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:461:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:466:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:468:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:471:0x09e0 A[LOOP:24: B:470:0x09de->B:471:0x09e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:475:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:478:0x09fd A[LOOP:25: B:477:0x09fb->B:478:0x09fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x0a14 A[LOOP:26: B:480:0x0a12->B:481:0x0a14, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:483:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a23 A[LOOP:27: B:484:0x0a21->B:485:0x0a23, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:488:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a39 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:492:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a5e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:504:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:513:0x0a8a A[LOOP:15: B:512:0x0a88->B:513:0x0a8a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:517:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a99 A[LOOP:12: B:374:0x07ef->B:518:0x0a99, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:519:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:521:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:533:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0505 A[EDGE_INSN: B:577:0x0505->B:267:0x0505 BREAK  A[LOOP:6: B:259:0x04e2->B:265:0x04fc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0a7c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x089e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x082b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x0859 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0a60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x08ca A[EDGE_INSN: B:610:0x08ca->B:414:0x08ca BREAK  A[LOOP:17: B:409:0x08bd->B:612:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x08fe A[ADDED_TO_REGION, EDGE_INSN: B:619:0x08fe->B:430:0x08fe BREAK  A[LOOP:19: B:425:0x08eb->B:429:0x08f9], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x09b5 A[EDGE_INSN: B:627:0x09b5->B:464:0x09b5 BREAK  A[LOOP:23: B:456:0x098e->B:462:0x09ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x096a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0978 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x09b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x09ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x086a A[ADDED_TO_REGION, EDGE_INSN: B:641:0x086a->B:640:0x086a BREAK  A[LOOP:29: B:398:0x0872->B:402:0x087e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x07d4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x0533 -> B:277:0x057f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:276:0x0559 -> B:277:0x057f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m34379(int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34379(int, int):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12271. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34381() {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14390.m34381():int");
    }

    public C14390(byte[] bArr, int i, int[] iArr) {
        this.f43355 = bArr;
        this.f43354 = iArr;
        this.f43356 = i;
    }
}
