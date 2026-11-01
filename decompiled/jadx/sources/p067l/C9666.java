package p067l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9666 {

    /* JADX INFO: renamed from: ֫ */
    public int f26632;

    /* JADX INFO: renamed from: ܽ */
    public static final float[] f26631 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: ۧ */
    public static final float[] f26630 = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: ֫ */
    public final int m22543() {
        return this.f26632;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x008b A[EDGE_INSN: B:110:0x008b->B:40:0x008b BREAK  A[LOOP:0: B:13:0x0031->B:39:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0109 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX INFO: renamed from: ֫ */
    public final float m22542(int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        float f;
        char cCharAt;
        int i11;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int i12;
        int i13;
        int i14;
        boolean z5;
        char cCharAt3;
        boolean z6;
        char cCharAt4;
        this.f26632 = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int i15 = this.f26632;
            long j = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            z2 = false;
            i7 = 0;
            while (true) {
                i8 = this.f26632;
                c = '9';
                if (i8 >= i2) {
                    break;
                }
                cCharAt4 = str.charAt(i8);
                if (cCharAt4 != '0') {
                    if (i4 == 0) {
                        i6++;
                    } else {
                        i5++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i16 = i4 + i5;
                    while (i5 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i5--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i4 = i16 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    i7 = this.f26632 - i15;
                    z2 = true;
                }
                this.f26632++;
            }
            if (!z2 && this.f26632 - i3 == i7 + 1) {
                return Float.NaN;
            }
            if (i4 == 0) {
                if (i6 == 0) {
                    return Float.NaN;
                }
                i4 = 1;
            }
            if (z2) {
                i5 = (i7 - i6) - i4;
            }
            i9 = this.f26632;
            if (i9 < i2 && ((cCharAt = str.charAt(i9)) == 'E' || cCharAt == 'e')) {
                i11 = this.f26632 + 1;
                this.f26632 = i11;
                if (i11 == i2) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i11);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.f26632--;
                                z3 = false;
                                z4 = true;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        i12 = this.f26632;
                        i13 = 0;
                        while (true) {
                            i14 = this.f26632;
                            if (i14 >= i2 && (cCharAt3 = str.charAt(i14)) >= '0' && cCharAt3 <= c) {
                                z6 = z3;
                                if (i13 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i13 = (i13 * 10) + (cCharAt3 - '0');
                                this.f26632++;
                                z3 = z6;
                                c = '9';
                            }
                        }
                        z5 = z3;
                        if (this.f26632 == i12) {
                            return Float.NaN;
                        }
                        if (z5) {
                            i5 -= i13;
                        } else {
                            i5 += i13;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.f26632++;
                z4 = false;
                if (!z4) {
                    i12 = this.f26632;
                    i13 = 0;
                    while (true) {
                        i14 = this.f26632;
                        if (i14 >= i2) {
                        }
                        i13 = (i13 * 10) + (cCharAt3 - '0');
                        this.f26632++;
                        z3 = z6;
                        c = '9';
                    }
                    z5 = z3;
                    if (this.f26632 == i12) {
                        return Float.NaN;
                    }
                    if (z5) {
                        i5 -= i13;
                    } else {
                        i5 += i13;
                    }
                }
            }
            i10 = i4 + i5;
            if (i10 <= 39 || i10 < -44) {
                return Float.NaN;
            }
            float f2 = j;
            if (j != 0) {
                if (i5 > 0) {
                    f = f26631[i5];
                } else if (i5 < 0) {
                    if (i5 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        i5 += 20;
                    }
                    f = f26630[-i5];
                }
                f2 *= f;
            }
            return z ? -f2 : f2;
        }
        z = false;
        this.f26632++;
        int i17 = this.f26632;
        long j2 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
        z2 = false;
        i7 = 0;
        while (true) {
            i8 = this.f26632;
            c = '9';
            if (i8 >= i2) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i8);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i4 == 0) {
                i6++;
            } else {
                i5++;
            }
            this.f26632++;
        }
        if (!z2) {
        }
        if (i4 == 0) {
            if (i6 == 0) {
                return Float.NaN;
            }
            i4 = 1;
        }
        if (z2) {
            i5 = (i7 - i6) - i4;
        }
        i9 = this.f26632;
        if (i9 < i2) {
            i11 = this.f26632 + 1;
            this.f26632 = i11;
            if (i11 == i2) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i11);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        case '8':
                        case '9':
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.f26632--;
                            z3 = false;
                            z4 = true;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    i12 = this.f26632;
                    i13 = 0;
                    while (true) {
                        i14 = this.f26632;
                        if (i14 >= i2) {
                        }
                        i13 = (i13 * 10) + (cCharAt3 - '0');
                        this.f26632++;
                        z3 = z6;
                        c = '9';
                    }
                    z5 = z3;
                    if (this.f26632 == i12) {
                        return Float.NaN;
                    }
                    if (z5) {
                        i5 -= i13;
                    } else {
                        i5 += i13;
                    }
                }
            } else {
                z3 = false;
            }
            this.f26632++;
            z4 = false;
            if (!z4) {
                i12 = this.f26632;
                i13 = 0;
                while (true) {
                    i14 = this.f26632;
                    if (i14 >= i2) {
                    }
                    i13 = (i13 * 10) + (cCharAt3 - '0');
                    this.f26632++;
                    z3 = z6;
                    c = '9';
                }
                z5 = z3;
                if (this.f26632 == i12) {
                    return Float.NaN;
                }
                if (z5) {
                    i5 -= i13;
                } else {
                    i5 += i13;
                }
            }
        }
        i10 = i4 + i5;
        if (i10 <= 39) {
        }
        return Float.NaN;
    }
}
