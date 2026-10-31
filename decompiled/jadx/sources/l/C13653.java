package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13653 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f40720 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m32805(C17714 c17714, String str, String str2, C19643 c19643) throws C9080 {
        int i;
        boolean zM38352;
        int iM38343;
        int iM38344;
        int i2;
        int i3;
        boolean z;
        boolean zM38353;
        int i4;
        int iM38345;
        boolean z2;
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int iM38339 = c16302.m38339();
        int iM38346 = c16302.m38343(3);
        if (iM38346 > 1) {
            throw C9080.m23441("Unsupported AC-4 DSI version: " + iM38346);
        }
        int iM38347 = c16302.m38343(7);
        int i5 = c16302.m38352() ? 48000 : 44100;
        c16302.m38351(4);
        int iM38348 = c16302.m38343(9);
        if (iM38347 > 1) {
            if (iM38346 == 0) {
                throw C9080.m23441("Invalid AC-4 DSI version: " + iM38346);
            }
            if (c16302.m38352()) {
                c16302.m38351(16);
                if (c16302.m38352()) {
                    c16302.m38351(128);
                }
            }
        }
        if (iM38346 == 1) {
            if (c16302.m38339() < 66) {
                throw C9080.m23441("Invalid AC-4 DSI bitrate.");
            }
            c16302.m38351(66);
            c16302.m38344();
        }
        C11538 c11538 = new C11538();
        c11538.f34452 = true;
        c11538.f34449 = -1;
        c11538.f34453 = -1;
        c11538.f34450 = true;
        c11538.f34451 = 2;
        c11538.f34455 = 1;
        int i6 = 0;
        c11538.f34454 = 0;
        while (true) {
            if (i6 < iM38348) {
                if (iM38346 == 0) {
                    zM38352 = c16302.m38352();
                    iM38343 = c16302.m38343(5);
                    iM38344 = c16302.m38343(5);
                    i2 = 0;
                    i3 = 0;
                    z = false;
                } else {
                    int iM38349 = c16302.m38343(8);
                    int iM383410 = c16302.m38343(8);
                    if (iM383410 == 255) {
                        iM383410 += c16302.m38343(16);
                    }
                    if (iM38349 > 2) {
                        c16302.m38351(iM383410 * 8);
                        i6++;
                    } else {
                        int iM383310 = (iM38339 - c16302.m38339()) / 8;
                        iM38343 = c16302.m38343(5);
                        i2 = iM383410;
                        i3 = iM383310;
                        zM38352 = false;
                        z = iM38343 == 31;
                        iM38344 = iM38349;
                    }
                }
                c11538.f34455 = iM38344;
                if (zM38352 || z || iM38343 != 6) {
                    c11538.f34454 = c16302.m38343(3);
                    if (c16302.m38352()) {
                        c16302.m38351(5);
                    }
                    c16302.m38351(2);
                    if (iM38346 == 1 && (iM38344 == 1 || iM38344 == 2)) {
                        c16302.m38351(2);
                    }
                    c16302.m38351(5);
                    c16302.m38351(10);
                    if (iM38346 == 1) {
                        if (iM38344 > 0) {
                            c11538.f34452 = c16302.m38352();
                        }
                        if (c11538.f34452) {
                            if (iM38344 != 1) {
                                i4 = 2;
                                if (iM38344 == 2) {
                                    iM38345 = c16302.m38343(5);
                                    if (iM38345 >= 0 && iM38345 <= 15) {
                                        c11538.f34449 = iM38345;
                                    }
                                    if (iM38345 >= 11 || iM38345 > 14) {
                                        i4 = 2;
                                    } else {
                                        c11538.f34450 = c16302.m38352();
                                        i4 = 2;
                                        c11538.f34451 = c16302.m38343(2);
                                    }
                                }
                            } else {
                                iM38345 = c16302.m38343(5);
                                if (iM38345 >= 0) {
                                    c11538.f34449 = iM38345;
                                }
                                if (iM38345 >= 11) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                }
                            }
                            c16302.m38351(24);
                        } else {
                            i4 = 2;
                        }
                        if (iM38344 == 1 || iM38344 == i4) {
                            if (c16302.m38352() && c16302.m38352()) {
                                c16302.m38351(i4);
                            }
                            if (c16302.m38352()) {
                                c16302.m38346();
                                int i7 = 8;
                                int iM383411 = c16302.m38343(8);
                                int i8 = 0;
                                while (i8 < iM383411) {
                                    c16302.m38351(i7);
                                    i8++;
                                    i7 = 8;
                                }
                            }
                        }
                    }
                    if (!zM38352 && !z) {
                        c16302.m38346();
                        if (iM38343 == 0 || iM38343 == 1 || iM38343 == 2) {
                            if (iM38344 == 0) {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    m32808(c16302, c11538);
                                }
                            } else {
                                for (int i10 = 0; i10 < 2; i10++) {
                                    m32810(c16302, c11538);
                                }
                            }
                        } else if (iM38343 == 3 || iM38343 == 4) {
                            if (iM38344 == 0) {
                                for (int i11 = 0; i11 < 3; i11++) {
                                    m32808(c16302, c11538);
                                }
                            } else {
                                for (int i12 = 0; i12 < 3; i12++) {
                                    m32810(c16302, c11538);
                                }
                            }
                        } else if (iM38343 != 5) {
                            int iM383412 = c16302.m38343(7);
                            for (int i13 = 0; i13 < iM383412; i13++) {
                                c16302.m38351(8);
                            }
                        } else if (iM38344 == 0) {
                            m32808(c16302, c11538);
                        } else {
                            int iM383413 = c16302.m38343(3);
                            for (int i14 = 0; i14 < iM383413 + 2; i14++) {
                                m32810(c16302, c11538);
                            }
                        }
                    } else if (iM38344 == 0) {
                        m32808(c16302, c11538);
                    } else {
                        m32810(c16302, c11538);
                    }
                    c16302.m38346();
                    zM38353 = c16302.m38352();
                } else {
                    zM38353 = true;
                }
                if (zM38353) {
                    int iM383414 = c16302.m38343(7);
                    for (int i15 = 0; i15 < iM383414; i15++) {
                        c16302.m38351(15);
                    }
                }
                if (iM38344 > 0) {
                    if (c16302.m38352()) {
                        if (c16302.m38339() < 66) {
                            z2 = false;
                        } else {
                            c16302.m38351(66);
                            z2 = true;
                        }
                        if (!z2) {
                            throw C9080.m23441("Can't parse bitrate DSI.");
                        }
                    }
                    if (c16302.m38352()) {
                        c16302.m38344();
                        c16302.m38347(c16302.m38343(16));
                        int iM383415 = c16302.m38343(5);
                        for (int i16 = 0; i16 < iM383415; i16++) {
                            c16302.m38351(3);
                            c16302.m38351(8);
                        }
                    }
                }
                c16302.m38344();
                if (iM38346 == 1) {
                    int iM383311 = ((iM38339 - c16302.m38339()) / 8) - i3;
                    if (i2 < iM383311) {
                        throw C9080.m23441("pres_bytes is smaller than presentation bytes read.");
                    }
                    c16302.m38347(i2 - iM383311);
                }
                if (c11538.f34452 && c11538.f34449 == -1) {
                    throw C9080.m23441("Can't determine channel mode of presentation " + i6);
                }
            }
            if (c11538.f34452) {
                int i17 = c11538.f34449;
                boolean z3 = c11538.f34450;
                int i18 = c11538.f34451;
                switch (i17) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i = 7;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i = 8;
                        break;
                    case 11:
                        i = 11;
                        break;
                    case 12:
                        i = 12;
                        break;
                    case 13:
                        i = 13;
                        break;
                    case 14:
                        i = 14;
                        break;
                    case 15:
                        i = 24;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i17 == 11 || i17 == 12 || i17 == 13 || i17 == 14) {
                    if (!z3) {
                        i -= 2;
                    }
                    if (i18 == 0) {
                        i -= 4;
                    } else if (i18 == 1) {
                        i -= 2;
                    }
                }
            } else {
                int i19 = c11538.f34453;
                if (i19 > 0) {
                    int i20 = i19 + 1;
                    i = (c11538.f34454 == 4 && i20 == 17) ? 21 : i20;
                } else {
                    int i21 = c11538.f34454;
                    if (i21 == 0) {
                        i = 2;
                    } else if (i21 == 1) {
                        i = 6;
                    } else if (i21 == 2) {
                        i = 8;
                    } else if (i21 == 3) {
                        i = 10;
                    } else if (i21 != 4) {
                        C19956.m46037("AC-4 level " + c11538.f34454 + " has not been defined.");
                        i = 2;
                    } else {
                        i = 12;
                    }
                }
            }
            if (i <= 0) {
                throw C9080.m23441("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iM38347), Integer.valueOf(c11538.f34455), Integer.valueOf(c11538.f34454)};
            String str3 = C3603.f11424;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            C1297 c1297 = new C1297();
            c1297.m4469(str);
            c1297.m4465("audio/ac4");
            c1297.m4472(i);
            c1297.m4456(i5);
            c1297.m4447(c19643);
            c1297.m4471(str2);
            c1297.m4445(str4);
            return c1297.m4440();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32808(C16302 c16302, C11538 c11538) throws C9080 {
        int iM38343 = c16302.m38343(5);
        c16302.m38351(2);
        if (c16302.m38352()) {
            c16302.m38351(5);
        }
        if (iM38343 >= 7 && iM38343 <= 10) {
            c16302.m38346();
        }
        if (c16302.m38352()) {
            int iM38344 = c16302.m38343(3);
            if (c11538.f34449 == -1 && iM38343 >= 0 && iM38343 <= 15 && (iM38344 == 0 || iM38344 == 1)) {
                c11538.f34449 = iM38343;
            }
            if (c16302.m38352()) {
                m32809(c16302);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32810(C16302 c16302, C11538 c11538) throws C9080 {
        c16302.m38351(2);
        boolean zM38352 = c16302.m38352();
        int iM38343 = c16302.m38343(8);
        for (int i = 0; i < iM38343; i++) {
            c16302.m38351(2);
            if (c16302.m38352()) {
                c16302.m38351(5);
            }
            if (zM38352) {
                c16302.m38351(24);
            } else {
                if (c16302.m38352()) {
                    if (!c16302.m38352()) {
                        c16302.m38351(4);
                    }
                    c11538.f34453 = c16302.m38343(6) + 1;
                }
                c16302.m38351(4);
            }
        }
        if (c16302.m38352()) {
            c16302.m38351(3);
            if (c16302.m38352()) {
                m32809(c16302);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32809(C16302 c16302) throws C9080 {
        int iM38343 = c16302.m38343(6);
        if (iM38343 < 2 || iM38343 > 42) {
            throw C9080.m23441(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM38343)));
        }
        c16302.m38351(iM38343 * 8);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22826 m32806(C16302 c16302) {
        int i;
        int i2;
        int iM38343 = c16302.m38343(16);
        int iM38344 = c16302.m38343(16);
        if (iM38344 == 65535) {
            iM38344 = c16302.m38343(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM38344 + i;
        if (iM38343 == 44097) {
            i3 += 2;
        }
        if (c16302.m38343(2) == 3) {
            do {
                c16302.m38343(2);
            } while (c16302.m38352());
        }
        int iM38345 = c16302.m38343(10);
        if (c16302.m38352() && c16302.m38343(3) > 0) {
            c16302.m38351(2);
        }
        int i4 = c16302.m38352() ? 48000 : 44100;
        int iM38346 = c16302.m38343(4);
        int[] iArr = f40720;
        if (i4 == 44100 && iM38346 == 13) {
            i2 = iArr[iM38346];
        } else if (i4 != 48000 || iM38346 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM38346];
            int i6 = iM38345 % 5;
            if (i6 == 1) {
                if (iM38346 != 3 || iM38346 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM38346 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM38346 == 3 || iM38346 == 8 || iM38346 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM38346 == 8 || iM38346 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C22826(i4, i3, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32807(int i, C17714 c17714) {
        c17714.m41481(7);
        byte[] bArrM41482 = c17714.m41482();
        bArrM41482[0] = -84;
        bArrM41482[1] = 64;
        bArrM41482[2] = -1;
        bArrM41482[3] = -1;
        bArrM41482[4] = (byte) ((i >> 16) & 255);
        bArrM41482[5] = (byte) ((i >> 8) & 255);
        bArrM41482[6] = (byte) (i & 255);
    }
}
