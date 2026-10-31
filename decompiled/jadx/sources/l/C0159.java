package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.֡ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17YO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0159 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f1341 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC5983.f18409, 65535};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte f1342;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19211 f1343;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f1344;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f1345;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f1346;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1347;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1348;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f1349;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1350;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f1351;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1352;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f1353;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1354 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C14976 f1355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f1356;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1357;

    public C0159(C14976 c14976, C19211 c19211) {
        this.f1355 = c14976;
        this.f1343 = c19211;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:208:0x0527  */
    /* JADX WARN: Code duplicated, block: B:209:0x052b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0530 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0532  */
    /* JADX WARN: Code duplicated, block: B:213:0x0534  */
    /* JADX WARN: Code duplicated, block: B:215:0x053f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0567 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x0569 A[LOOP:6: B:219:0x0565->B:221:0x0569, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:227:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:229:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:230:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:232:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:233:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:250:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x05de A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1277(int i) {
        C0159 c0159;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2;
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
        int[] iArr;
        int i19;
        int i20;
        int i21;
        C0159 c01510 = this;
        C14976 c14976 = c01510.f1355;
        int i22 = c14976.f64353;
        int i23 = c14976.f64356;
        C19211 c19211 = c01510.f1343;
        int i24 = c19211.f60503;
        int i25 = c19211.f60497;
        int i26 = c19211.f60499;
        int i27 = c19211.f60502;
        int i28 = c19211.f60501;
        int i29 = i27 < i28 ? (i28 - i27) - 1 : i24 - i27;
        int i30 = i27;
        int i31 = i26;
        int i32 = i25;
        int i33 = i23;
        int i34 = i22;
        int iM44329 = i;
        while (true) {
            int i35 = c01510.f1346;
            int[] iArr2 = f1341;
            switch (i35) {
                case 0:
                    if (i29 >= 258 && i33 >= 10) {
                        c19211.f60497 = i32;
                        c19211.f60499 = i31;
                        c14976.f64356 = i33;
                        int i36 = i33;
                        int i37 = i32;
                        c14976.f64354 += (long) (i34 - c14976.f64353);
                        c14976.f64353 = i34;
                        c19211.f60502 = i30;
                        byte b = c01510.f1349;
                        byte b2 = c01510.f1342;
                        int[] iArr3 = c01510.f1356;
                        int i38 = c01510.f1347;
                        int[] iArr4 = c01510.f1351;
                        int i39 = i36;
                        int i40 = c01510.f1353;
                        int i41 = i34;
                        int i42 = c19211.f60501;
                        int i43 = i30 < i42 ? (i42 - i30) - 1 : i24 - i30;
                        int i44 = iArr2[b];
                        int i45 = iArr2[b2];
                        int i46 = i31;
                        String str3 = "invalid distance code";
                        int i47 = i43;
                        int i48 = i30;
                        int i49 = i41;
                        int i50 = i37;
                        while (true) {
                            if (i46 < 20) {
                                i39--;
                                i50 |= (c14976.f64363[i49] & 255) << i46;
                                i46 += 8;
                                i49++;
                            } else {
                                int i51 = i50 & i44;
                                int i52 = (i38 + i51) * 3;
                                int i53 = iArr3[i52];
                                if (i53 != 0) {
                                    while (true) {
                                        int i54 = iArr3[i52 + 1];
                                        i50 >>= i54;
                                        i46 -= i54;
                                        if ((i53 & 16) == 0) {
                                            i3 = i44;
                                            str2 = str3;
                                            if ((i53 & 64) == 0) {
                                                i51 = i51 + iArr3[i52 + 2] + (i50 & iArr2[i53]);
                                                i52 = (i38 + i51) * 3;
                                                i53 = iArr3[i52];
                                                if (i53 == 0) {
                                                    int i55 = iArr3[i52 + 1];
                                                    i50 >>= i55;
                                                    i8 = i48 + 1;
                                                    c19211.f60505[i48] = (byte) iArr3[i52 + 2];
                                                    i46 -= i55;
                                                } else {
                                                    str3 = str2;
                                                    i44 = i3;
                                                }
                                            } else if ((i53 & 32) != 0) {
                                                int i56 = c14976.f64356 - i39;
                                                int i57 = i46 >> 3;
                                                if (i57 < i56) {
                                                    i56 = i57;
                                                }
                                                int i58 = i49 - i56;
                                                c19211.f60497 = i50;
                                                c19211.f60499 = i46 - (i56 << 3);
                                                c14976.f64356 = i39 + i56;
                                                c14976.f64354 += (long) (i58 - c14976.f64353);
                                                c14976.f64353 = i58;
                                                c19211.f60502 = i48;
                                                i7 = 1;
                                            } else {
                                                str = "invalid literal/length code";
                                                c14976.f64357 = str;
                                                int i59 = c14976.f64356 - i39;
                                                int i60 = i46 >> 3;
                                                if (i60 < i59) {
                                                    i59 = i60;
                                                }
                                                int i61 = i49 - i59;
                                                c19211.f60497 = i50;
                                                c19211.f60499 = i46 - (i59 << 3);
                                                c14976.f64356 = i39 + i59;
                                                c14976.f64354 += (long) (i61 - c14976.f64353);
                                                c14976.f64353 = i61;
                                                c19211.f60502 = i48;
                                            }
                                            str = "invalid literal/length code";
                                            i9 = c14976.f64353;
                                            i10 = c14976.f64356;
                                            i32 = c19211.f60497;
                                            i31 = c19211.f60499;
                                            i30 = c19211.f60502;
                                            i11 = c19211.f60501;
                                            if (i30 < i11) {
                                                i12 = 1;
                                                i29 = (i11 - i30) - 1;
                                            } else {
                                                i12 = 1;
                                                i29 = i24 - i30;
                                            }
                                            if (i7 != 0) {
                                                if (i7 == i12) {
                                                    i13 = 7;
                                                } else {
                                                    i13 = 9;
                                                }
                                                c0159 = this;
                                                c0159.f1346 = i13;
                                                i33 = i10;
                                                i34 = i9;
                                                iM44329 = i7;
                                            } else {
                                                c0159 = this;
                                                i2 = i10;
                                                i34 = i9;
                                                iM44329 = i7;
                                            }
                                            c01510 = c0159;
                                            break;
                                        } else {
                                            int i62 = i53 & 15;
                                            i3 = i44;
                                            int i63 = iArr3[i52 + 2] + (i50 & iArr2[i62]);
                                            int i64 = i50 >> i62;
                                            int i65 = i46 - i62;
                                            while (i65 < 15) {
                                                i39--;
                                                i64 |= (c14976.f64363[i49] & 255) << i65;
                                                i65 += 8;
                                                i49++;
                                            }
                                            int i66 = i64 & i45;
                                            int i67 = (i40 + i66) * 3;
                                            int i68 = iArr4[i67];
                                            while (true) {
                                                int i69 = iArr4[i67 + 1];
                                                i64 >>= i69;
                                                i65 -= i69;
                                                if ((i68 & 16) != 0) {
                                                    int i70 = i68 & 15;
                                                    int i71 = i49;
                                                    int i72 = i39;
                                                    while (i65 < i70) {
                                                        i72--;
                                                        i64 |= (c14976.f64363[i71] & 255) << i65;
                                                        i65 += 8;
                                                        i71++;
                                                    }
                                                    int i73 = iArr4[i67 + 2] + (i64 & iArr2[i70]);
                                                    int i74 = i64 >> i70;
                                                    int i75 = i65 - i70;
                                                    int i76 = i47 - i63;
                                                    if (i48 >= i73) {
                                                        int i77 = i48 - i73;
                                                        int i78 = i48 - i77;
                                                        if (i78 > 0 && 2 > i78) {
                                                            byte[] bArr = c19211.f60505;
                                                            int i79 = i48 + 1;
                                                            int i80 = i77 + 1;
                                                            bArr[i48] = bArr[i77];
                                                            i48 += 2;
                                                            i4 = i77 + 2;
                                                            bArr[i79] = bArr[i80];
                                                        } else {
                                                            byte[] bArr2 = c19211.f60505;
                                                            System.arraycopy(bArr2, i77, bArr2, i48, 2);
                                                            i48 += 2;
                                                            i4 = i77 + 2;
                                                        }
                                                        i63 -= 2;
                                                    } else {
                                                        i4 = i48 - i73;
                                                        do {
                                                            i4 += i24;
                                                        } while (i4 < 0);
                                                        int i81 = i24 - i4;
                                                        if (i63 > i81) {
                                                            i63 -= i81;
                                                            int i82 = i48 - i4;
                                                            if (i82 <= 0 || i81 <= i82) {
                                                                byte[] bArr3 = c19211.f60505;
                                                                System.arraycopy(bArr3, i4, bArr3, i48, i81);
                                                                i48 += i81;
                                                            } else {
                                                                while (true) {
                                                                    byte[] bArr4 = c19211.f60505;
                                                                    int i83 = i4 + 1;
                                                                    bArr4[i48] = bArr4[i4];
                                                                    i81--;
                                                                    i48++;
                                                                    if (i81 != 0) {
                                                                        i4 = i83;
                                                                    }
                                                                }
                                                            }
                                                            i4 = 0;
                                                        }
                                                    }
                                                    int i84 = i48 - i4;
                                                    if (i84 <= 0 || i63 <= i84) {
                                                        byte[] bArr5 = c19211.f60505;
                                                        System.arraycopy(bArr5, i4, bArr5, i48, i63);
                                                        i5 = i48 + i63;
                                                    } else {
                                                        while (true) {
                                                            byte[] bArr6 = c19211.f60505;
                                                            i5 = i48 + 1;
                                                            int i85 = i4 + 1;
                                                            bArr6[i48] = bArr6[i4];
                                                            i63--;
                                                            if (i63 != 0) {
                                                                i48 = i5;
                                                                i4 = i85;
                                                            }
                                                        }
                                                    }
                                                    i48 = i5;
                                                    i49 = i71;
                                                    i6 = i72;
                                                    i50 = i74;
                                                    i46 = i75;
                                                    i47 = i76;
                                                    if (i47 >= 258 || i6 < 10) {
                                                        i14 = c14976.f64356 - i6;
                                                        i15 = i46 >> 3;
                                                        if (i15 < i14) {
                                                            i14 = i15;
                                                        }
                                                        int i86 = i49 - i14;
                                                        c19211.f60497 = i50;
                                                        c19211.f60499 = i46 - (i14 << 3);
                                                        c14976.f64356 = i6 + i14;
                                                        c14976.f64354 += (long) (i86 - c14976.f64353);
                                                        c14976.f64353 = i86;
                                                        c19211.f60502 = i48;
                                                        i7 = 0;
                                                        str = "invalid literal/length code";
                                                        i9 = c14976.f64353;
                                                        i10 = c14976.f64356;
                                                        i32 = c19211.f60497;
                                                        i31 = c19211.f60499;
                                                        i30 = c19211.f60502;
                                                        i11 = c19211.f60501;
                                                        if (i30 < i11) {
                                                            i12 = 1;
                                                            i29 = (i11 - i30) - 1;
                                                        } else {
                                                            i12 = 1;
                                                            i29 = i24 - i30;
                                                        }
                                                        if (i7 != 0) {
                                                            if (i7 == i12) {
                                                                i13 = 7;
                                                            } else {
                                                                i13 = 9;
                                                            }
                                                            c0159 = this;
                                                            c0159.f1346 = i13;
                                                            i33 = i10;
                                                            i34 = i9;
                                                            iM44329 = i7;
                                                        } else {
                                                            c0159 = this;
                                                            i2 = i10;
                                                            i34 = i9;
                                                            iM44329 = i7;
                                                        }
                                                        c01510 = c0159;
                                                    } else {
                                                        i39 = i6;
                                                        i44 = i3;
                                                    }
                                                    break;
                                                } else if ((i68 & 64) == 0) {
                                                    i66 = i66 + iArr4[i67 + 2] + (i64 & iArr2[i68]);
                                                    i67 = (i40 + i66) * 3;
                                                    i68 = iArr4[i67];
                                                } else {
                                                    c14976.f64357 = str3;
                                                    int i87 = c14976.f64356 - i39;
                                                    int i88 = i65 >> 3;
                                                    if (i88 < i87) {
                                                        i87 = i88;
                                                    }
                                                    int i89 = i49 - i87;
                                                    c19211.f60497 = i64;
                                                    c19211.f60499 = i65 - (i87 << 3);
                                                    c14976.f64356 = i39 + i87;
                                                    c14976.f64354 += (long) (i89 - c14976.f64353);
                                                    c14976.f64353 = i89;
                                                    c19211.f60502 = i48;
                                                    str = "invalid literal/length code";
                                                }
                                            }
                                        }
                                        i7 = -3;
                                        i9 = c14976.f64353;
                                        i10 = c14976.f64356;
                                        i32 = c19211.f60497;
                                        i31 = c19211.f60499;
                                        i30 = c19211.f60502;
                                        i11 = c19211.f60501;
                                        if (i30 < i11) {
                                            i12 = 1;
                                            i29 = (i11 - i30) - 1;
                                        } else {
                                            i12 = 1;
                                            i29 = i24 - i30;
                                        }
                                        if (i7 != 0) {
                                            if (i7 == i12) {
                                                i13 = 7;
                                            } else {
                                                i13 = 9;
                                            }
                                            c0159 = this;
                                            c0159.f1346 = i13;
                                            i33 = i10;
                                            i34 = i9;
                                            iM44329 = i7;
                                        } else {
                                            c0159 = this;
                                            i2 = i10;
                                            i34 = i9;
                                            iM44329 = i7;
                                        }
                                        c01510 = c0159;
                                    }
                                } else {
                                    int i90 = iArr3[i52 + 1];
                                    i50 >>= i90;
                                    i8 = i48 + 1;
                                    c19211.f60505[i48] = (byte) iArr3[i52 + 2];
                                    i46 -= i90;
                                    i3 = i44;
                                    str2 = str3;
                                }
                                i47--;
                                str3 = str2;
                                i6 = i39;
                                i48 = i8;
                                if (i47 >= 258) {
                                }
                                i14 = c14976.f64356 - i6;
                                i15 = i46 >> 3;
                                if (i15 < i14) {
                                    i14 = i15;
                                }
                                int i810 = i49 - i14;
                                c19211.f60497 = i50;
                                c19211.f60499 = i46 - (i14 << 3);
                                c14976.f64356 = i6 + i14;
                                c14976.f64354 += (long) (i810 - c14976.f64353);
                                c14976.f64353 = i810;
                                c19211.f60502 = i48;
                                i7 = 0;
                                str = "invalid literal/length code";
                                i9 = c14976.f64353;
                                i10 = c14976.f64356;
                                i32 = c19211.f60497;
                                i31 = c19211.f60499;
                                i30 = c19211.f60502;
                                i11 = c19211.f60501;
                                if (i30 < i11) {
                                    i12 = 1;
                                    i29 = (i11 - i30) - 1;
                                } else {
                                    i12 = 1;
                                    i29 = i24 - i30;
                                }
                                if (i7 != 0) {
                                    if (i7 == i12) {
                                        i13 = 7;
                                    } else {
                                        i13 = 9;
                                    }
                                    c0159 = this;
                                    c0159.f1346 = i13;
                                    i33 = i10;
                                    i34 = i9;
                                    iM44329 = i7;
                                } else {
                                    c0159 = this;
                                    i2 = i10;
                                    i34 = i9;
                                    iM44329 = i7;
                                }
                                c01510 = c0159;
                            }
                        }
                    } else {
                        c0159 = c01510;
                        i2 = i33;
                        str = "invalid literal/length code";
                        i32 = i32;
                        i34 = i34;
                    }
                    c0159.f1350 = c0159.f1349;
                    c0159.f1344 = c0159.f1356;
                    c0159.f1354 = c0159.f1347;
                    c0159.f1346 = 1;
                    i16 = c0159.f1350;
                    i17 = i2;
                    while (i31 < i16) {
                        if (i17 != 0) {
                            c19211.f60497 = i32;
                            c19211.f60499 = i31;
                            c14976.f64356 = i17;
                            c14976.f64354 += (long) (i34 - c14976.f64353);
                            c14976.f64353 = i34;
                            c19211.f60502 = i30;
                            return c19211.m44329(iM44329);
                        }
                        i17--;
                        i32 |= (c14976.f64363[i34] & 255) << i31;
                        i31 += 8;
                        iM44329 = 0;
                        i34++;
                    }
                    i18 = (c0159.f1354 + (iArr2[i16] & i32)) * 3;
                    iArr = c0159.f1344;
                    int i91 = iArr[i18 + 1];
                    i32 >>>= i91;
                    i31 -= i91;
                    i19 = iArr[i18];
                    if (i19 == 0) {
                        c0159.f1345 = iArr[i18 + 2];
                        c0159.f1346 = 6;
                    } else if ((i19 & 16) != 0) {
                        c0159.f1352 = i19 & 15;
                        c0159.f1357 = iArr[i18 + 2];
                        c0159.f1346 = 2;
                    } else if ((i19 & 64) == 0) {
                        c0159.f1350 = i19;
                        c0159.f1354 = (i18 / 3) + iArr[i18 + 2];
                    } else if ((i19 & 32) != 0) {
                        c0159.f1346 = 7;
                    } else {
                        c0159.f1346 = 9;
                        c14976.f64357 = str;
                        c19211.f60497 = i32;
                        c19211.f60499 = i31;
                        c14976.f64356 = i17;
                        c14976.f64354 += (long) (i34 - c14976.f64353);
                        c14976.f64353 = i34;
                        c19211.f60502 = i30;
                        return c19211.m44329(-3);
                    }
                    i33 = i17;
                    c01510 = c0159;
                    break;
                case 1:
                    c0159 = c01510;
                    i2 = i33;
                    str = "invalid literal/length code";
                    i16 = c0159.f1350;
                    i17 = i2;
                    while (i31 < i16) {
                        if (i17 != 0) {
                            c19211.f60497 = i32;
                            c19211.f60499 = i31;
                            c14976.f64356 = i17;
                            c14976.f64354 += (long) (i34 - c14976.f64353);
                            c14976.f64353 = i34;
                            c19211.f60502 = i30;
                            return c19211.m44329(iM44329);
                        }
                        i17--;
                        i32 |= (c14976.f64363[i34] & 255) << i31;
                        i31 += 8;
                        iM44329 = 0;
                        i34++;
                    }
                    i18 = (c0159.f1354 + (iArr2[i16] & i32)) * 3;
                    iArr = c0159.f1344;
                    int i92 = iArr[i18 + 1];
                    i32 >>>= i92;
                    i31 -= i92;
                    i19 = iArr[i18];
                    if (i19 == 0) {
                        c0159.f1345 = iArr[i18 + 2];
                        c0159.f1346 = 6;
                    } else if ((i19 & 16) != 0) {
                        c0159.f1352 = i19 & 15;
                        c0159.f1357 = iArr[i18 + 2];
                        c0159.f1346 = 2;
                    } else if ((i19 & 64) == 0) {
                        c0159.f1350 = i19;
                        c0159.f1354 = (i18 / 3) + iArr[i18 + 2];
                    } else if ((i19 & 32) != 0) {
                        c0159.f1346 = 7;
                    } else {
                        c0159.f1346 = 9;
                        c14976.f64357 = str;
                        c19211.f60497 = i32;
                        c19211.f60499 = i31;
                        c14976.f64356 = i17;
                        c14976.f64354 += (long) (i34 - c14976.f64353);
                        c14976.f64353 = i34;
                        c19211.f60502 = i30;
                        return c19211.m44329(-3);
                    }
                    i33 = i17;
                    c01510 = c0159;
                    break;
                case 2:
                    int i93 = c01510.f1352;
                    while (i31 < i93) {
                        if (i33 == 0) {
                            c19211.f60497 = i32;
                            c19211.f60499 = i31;
                            c14976.f64356 = i33;
                            c14976.f64354 += (long) (i34 - c14976.f64353);
                            c14976.f64353 = i34;
                            c19211.f60502 = i30;
                            return c19211.m44329(iM44329);
                        }
                        i33--;
                        i32 |= (c14976.f64363[i34] & 255) << i31;
                        i31 += 8;
                        iM44329 = 0;
                        i34++;
                    }
                    c01510.f1357 += iArr2[i93] & i32;
                    i32 >>= i93;
                    i31 -= i93;
                    c01510.f1350 = c01510.f1342;
                    c01510.f1344 = c01510.f1351;
                    c01510.f1354 = c01510.f1353;
                    c01510.f1346 = 3;
                case 3:
                    int i94 = c01510.f1350;
                    while (i31 < i94) {
                        if (i33 == 0) {
                            c19211.f60497 = i32;
                            c19211.f60499 = i31;
                            c14976.f64356 = i33;
                            c14976.f64354 += (long) (i34 - c14976.f64353);
                            c14976.f64353 = i34;
                            c19211.f60502 = i30;
                            return c19211.m44329(iM44329);
                        }
                        i33--;
                        i32 |= (c14976.f64363[i34] & 255) << i31;
                        i31 += 8;
                        iM44329 = 0;
                        i34++;
                    }
                    int i95 = (c01510.f1354 + (iArr2[i94] & i32)) * 3;
                    int[] iArr5 = c01510.f1344;
                    int i96 = iArr5[i95 + 1];
                    i32 >>= i96;
                    i31 -= i96;
                    int i97 = iArr5[i95];
                    if ((i97 & 16) != 0) {
                        c01510.f1352 = i97 & 15;
                        c01510.f1348 = iArr5[i95 + 2];
                        c01510.f1346 = 4;
                    } else if ((i97 & 64) == 0) {
                        c01510.f1350 = i97;
                        c01510.f1354 = (i95 / 3) + iArr5[i95 + 2];
                    } else {
                        c01510.f1346 = 9;
                        c14976.f64357 = "invalid distance code";
                        c19211.f60497 = i32;
                        c19211.f60499 = i31;
                        c14976.f64356 = i33;
                        c14976.f64354 += (long) (i34 - c14976.f64353);
                        c14976.f64353 = i34;
                        c19211.f60502 = i30;
                        return c19211.m44329(-3);
                    }
                    c0159 = c01510;
                    c01510 = c0159;
                    break;
                case 4:
                    int i98 = c01510.f1352;
                    while (i31 < i98) {
                        if (i33 == 0) {
                            c19211.f60497 = i32;
                            c19211.f60499 = i31;
                            c14976.f64356 = i33;
                            c14976.f64354 += (long) (i34 - c14976.f64353);
                            c14976.f64353 = i34;
                            c19211.f60502 = i30;
                            return c19211.m44329(iM44329);
                        }
                        i33--;
                        i32 |= (c14976.f64363[i34] & 255) << i31;
                        i31 += 8;
                        iM44329 = 0;
                        i34++;
                    }
                    c01510.f1348 += iArr2[i98] & i32;
                    i32 >>= i98;
                    i31 -= i98;
                    c01510.f1346 = 5;
                case 5:
                    int i99 = i30 - c01510.f1348;
                    while (i99 < 0) {
                        i99 += i24;
                    }
                    while (c01510.f1357 != 0) {
                        if (i29 == 0) {
                            if (i30 == i24 && (i20 = c19211.f60501) != 0) {
                                i29 = i20 > 0 ? i20 - 1 : i24;
                                i30 = 0;
                            }
                            if (i29 == 0) {
                                c19211.f60502 = i30;
                                iM44329 = c19211.m44329(iM44329);
                                i30 = c19211.f60502;
                                int i100 = c19211.f60501;
                                int i101 = i30 < i100 ? (i100 - i30) - 1 : i24 - i30;
                                if (i30 != i24 || i100 == 0) {
                                    i29 = i101;
                                } else {
                                    i29 = i100 > 0 ? i100 - 1 : i24;
                                    i30 = 0;
                                }
                                if (i29 == 0) {
                                    c19211.f60497 = i32;
                                    c19211.f60499 = i31;
                                    c14976.f64356 = i33;
                                    c14976.f64354 += (long) (i34 - c14976.f64353);
                                    c14976.f64353 = i34;
                                    c19211.f60502 = i30;
                                    return c19211.m44329(iM44329);
                                }
                            }
                        }
                        byte[] bArr7 = c19211.f60505;
                        int i102 = i30 + 1;
                        int i103 = i99 + 1;
                        bArr7[i30] = bArr7[i99];
                        i29--;
                        i99 = i103 == i24 ? 0 : i103;
                        c01510.f1357--;
                        i30 = i102;
                    }
                    c01510.f1346 = 0;
                    c0159 = c01510;
                    c01510 = c0159;
                    break;
                case 6:
                    if (i29 == 0) {
                        if (i30 == i24 && (i21 = c19211.f60501) != 0) {
                            i29 = i21 > 0 ? i21 - 1 : i24;
                            i30 = 0;
                        }
                        if (i29 == 0) {
                            c19211.f60502 = i30;
                            int iM443210 = c19211.m44329(iM44329);
                            i30 = c19211.f60502;
                            int i104 = c19211.f60501;
                            int i105 = i30 < i104 ? (i104 - i30) - 1 : i24 - i30;
                            if (i30 != i24 || i104 == 0) {
                                i29 = i105;
                            } else {
                                i29 = i104 > 0 ? i104 - 1 : i24;
                                i30 = 0;
                            }
                            if (i29 == 0) {
                                c19211.f60497 = i32;
                                c19211.f60499 = i31;
                                c14976.f64356 = i33;
                                c14976.f64354 += (long) (i34 - c14976.f64353);
                                c14976.f64353 = i34;
                                c19211.f60502 = i30;
                                return c19211.m44329(iM443210);
                            }
                        }
                    }
                    c19211.f60505[i30] = (byte) c01510.f1345;
                    i29--;
                    c01510.f1346 = 0;
                    iM44329 = 0;
                    i30++;
                    c0159 = c01510;
                    c01510 = c0159;
                    break;
                case 7:
                    if (i31 > 7) {
                        i31 -= 8;
                        i33++;
                        i34--;
                    }
                    c19211.f60502 = i30;
                    int iM443211 = c19211.m44329(iM44329);
                    i30 = c19211.f60502;
                    if (c19211.f60501 != i30) {
                        c19211.f60497 = i32;
                        c19211.f60499 = i31;
                        c14976.f64356 = i33;
                        c14976.f64354 += (long) (i34 - c14976.f64353);
                        c14976.f64353 = i34;
                        c19211.f60502 = i30;
                        return c19211.m44329(iM443211);
                    }
                    c01510.f1346 = 8;
                    c19211.f60497 = i32;
                    c19211.f60499 = i31;
                    c14976.f64356 = i33;
                    c14976.f64354 += (long) (i34 - c14976.f64353);
                    c14976.f64353 = i34;
                    c19211.f60502 = i30;
                    return c19211.m44329(1);
                case 8:
                    c19211.f60497 = i32;
                    c19211.f60499 = i31;
                    c14976.f64356 = i33;
                    c14976.f64354 += (long) (i34 - c14976.f64353);
                    c14976.f64353 = i34;
                    c19211.f60502 = i30;
                    return c19211.m44329(1);
                case 9:
                    c19211.f60497 = i32;
                    c19211.f60499 = i31;
                    c14976.f64356 = i33;
                    c14976.f64354 += (long) (i34 - c14976.f64353);
                    c14976.f64353 = i34;
                    c19211.f60502 = i30;
                    return c19211.m44329(-3);
                default:
                    int i106 = i34;
                    c19211.f60497 = i32;
                    c19211.f60499 = i31;
                    c14976.f64356 = i33;
                    c14976.f64354 += (long) (i106 - c14976.f64353);
                    c14976.f64353 = i106;
                    c19211.f60502 = i30;
                    return c19211.m44329(-2);
            }
        }
    }
}
