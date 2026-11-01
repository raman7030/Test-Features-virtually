package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15344 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f43801 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX INFO: renamed from: ֫ */
    public static C10307 m34920(C19203 c19203, String str, String str2, C21037 c21037) throws C10998 {
        int i;
        boolean zM40567;
        int iM40558;
        int iM40559;
        int i2;
        int i3;
        boolean z;
        boolean zM40568;
        int i4;
        int iM405510;
        boolean z2;
        C17861 c17861 = new C17861();
        c17861.m40557(c19203);
        int iM40554 = c17861.m40554();
        int iM405511 = c17861.m40558(3);
        if (iM405511 > 1) {
            throw C10998.m25388("Unsupported AC-4 DSI version: " + iM405511);
        }
        int iM405512 = c17861.m40558(7);
        int i5 = c17861.m40567() ? 48000 : 44100;
        c17861.m40566(4);
        int iM405513 = c17861.m40558(9);
        if (iM405512 > 1) {
            if (iM405511 == 0) {
                throw C10998.m25388("Invalid AC-4 DSI version: " + iM405511);
            }
            if (c17861.m40567()) {
                c17861.m40566(16);
                if (c17861.m40567()) {
                    c17861.m40566(128);
                }
            }
        }
        if (iM405511 == 1) {
            if (c17861.m40554() < 66) {
                throw C10998.m25388("Invalid AC-4 DSI bitrate.");
            }
            c17861.m40566(66);
            c17861.m40559();
        }
        C13334 c13334 = new C13334();
        c13334.f37449 = true;
        c13334.f37446 = -1;
        c13334.f37450 = -1;
        c13334.f37447 = true;
        c13334.f37448 = 2;
        c13334.f37452 = 1;
        int i6 = 0;
        c13334.f37451 = 0;
        while (true) {
            if (i6 < iM405513) {
                if (iM405511 == 0) {
                    zM40567 = c17861.m40567();
                    iM40558 = c17861.m40558(5);
                    iM40559 = c17861.m40558(5);
                    i2 = 0;
                    i3 = 0;
                    z = false;
                } else {
                    int iM405514 = c17861.m40558(8);
                    int iM405515 = c17861.m40558(8);
                    if (iM405515 == 255) {
                        iM405515 += c17861.m40558(16);
                    }
                    if (iM405514 > 2) {
                        c17861.m40566(iM405515 * 8);
                        i6++;
                    } else {
                        int iM40555 = (iM40554 - c17861.m40554()) / 8;
                        iM40558 = c17861.m40558(5);
                        i2 = iM405515;
                        i3 = iM40555;
                        zM40567 = false;
                        z = iM40558 == 31;
                        iM40559 = iM405514;
                    }
                }
                c13334.f37452 = iM40559;
                if (zM40567 || z || iM40558 != 6) {
                    c13334.f37451 = c17861.m40558(3);
                    if (c17861.m40567()) {
                        c17861.m40566(5);
                    }
                    c17861.m40566(2);
                    if (iM405511 == 1 && (iM40559 == 1 || iM40559 == 2)) {
                        c17861.m40566(2);
                    }
                    c17861.m40566(5);
                    c17861.m40566(10);
                    if (iM405511 == 1) {
                        if (iM40559 > 0) {
                            c13334.f37449 = c17861.m40567();
                        }
                        if (c13334.f37449) {
                            if (iM40559 != 1) {
                                i4 = 2;
                                if (iM40559 == 2) {
                                    iM405510 = c17861.m40558(5);
                                    if (iM405510 >= 0 && iM405510 <= 15) {
                                        c13334.f37446 = iM405510;
                                    }
                                    if (iM405510 >= 11 || iM405510 > 14) {
                                        i4 = 2;
                                    } else {
                                        c13334.f37447 = c17861.m40567();
                                        i4 = 2;
                                        c13334.f37448 = c17861.m40558(2);
                                    }
                                }
                            } else {
                                iM405510 = c17861.m40558(5);
                                if (iM405510 >= 0) {
                                    c13334.f37446 = iM405510;
                                }
                                if (iM405510 >= 11) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                }
                            }
                            c17861.m40566(24);
                        } else {
                            i4 = 2;
                        }
                        if (iM40559 == 1 || iM40559 == i4) {
                            if (c17861.m40567() && c17861.m40567()) {
                                c17861.m40566(i4);
                            }
                            if (c17861.m40567()) {
                                c17861.m40561();
                                int i7 = 8;
                                int iM405516 = c17861.m40558(8);
                                int i8 = 0;
                                while (i8 < iM405516) {
                                    c17861.m40566(i7);
                                    i8++;
                                    i7 = 8;
                                }
                            }
                        }
                    }
                    if (!zM40567 && !z) {
                        c17861.m40561();
                        if (iM40558 == 0 || iM40558 == 1 || iM40558 == 2) {
                            if (iM40559 == 0) {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    m34923(c17861, c13334);
                                }
                            } else {
                                for (int i10 = 0; i10 < 2; i10++) {
                                    m34925(c17861, c13334);
                                }
                            }
                        } else if (iM40558 == 3 || iM40558 == 4) {
                            if (iM40559 == 0) {
                                for (int i11 = 0; i11 < 3; i11++) {
                                    m34923(c17861, c13334);
                                }
                            } else {
                                for (int i12 = 0; i12 < 3; i12++) {
                                    m34925(c17861, c13334);
                                }
                            }
                        } else if (iM40558 != 5) {
                            int iM405517 = c17861.m40558(7);
                            for (int i13 = 0; i13 < iM405517; i13++) {
                                c17861.m40566(8);
                            }
                        } else if (iM40559 == 0) {
                            m34923(c17861, c13334);
                        } else {
                            int iM405518 = c17861.m40558(3);
                            for (int i14 = 0; i14 < iM405518 + 2; i14++) {
                                m34925(c17861, c13334);
                            }
                        }
                    } else if (iM40559 == 0) {
                        m34923(c17861, c13334);
                    } else {
                        m34925(c17861, c13334);
                    }
                    c17861.m40561();
                    zM40568 = c17861.m40567();
                } else {
                    zM40568 = true;
                }
                if (zM40568) {
                    int iM405519 = c17861.m40558(7);
                    for (int i15 = 0; i15 < iM405519; i15++) {
                        c17861.m40566(15);
                    }
                }
                if (iM40559 > 0) {
                    if (c17861.m40567()) {
                        if (c17861.m40554() < 66) {
                            z2 = false;
                        } else {
                            c17861.m40566(66);
                            z2 = true;
                        }
                        if (!z2) {
                            throw C10998.m25388("Can't parse bitrate DSI.");
                        }
                    }
                    if (c17861.m40567()) {
                        c17861.m40559();
                        c17861.m40562(c17861.m40558(16));
                        int iM405520 = c17861.m40558(5);
                        for (int i16 = 0; i16 < iM405520; i16++) {
                            c17861.m40566(3);
                            c17861.m40566(8);
                        }
                    }
                }
                c17861.m40559();
                if (iM405511 == 1) {
                    int iM40556 = ((iM40554 - c17861.m40554()) / 8) - i3;
                    if (i2 < iM40556) {
                        throw C10998.m25388("pres_bytes is smaller than presentation bytes read.");
                    }
                    c17861.m40562(i2 - iM40556);
                }
                if (c13334.f37449 && c13334.f37446 == -1) {
                    throw C10998.m25388("Can't determine channel mode of presentation " + i6);
                }
            }
            if (c13334.f37449) {
                int i17 = c13334.f37446;
                boolean z3 = c13334.f37447;
                int i18 = c13334.f37448;
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
                int i19 = c13334.f37450;
                if (i19 > 0) {
                    int i20 = i19 + 1;
                    i = (c13334.f37451 == 4 && i20 == 17) ? 21 : i20;
                } else {
                    int i21 = c13334.f37451;
                    if (i21 == 0) {
                        i = 2;
                    } else if (i21 == 1) {
                        i = 6;
                    } else if (i21 == 2) {
                        i = 8;
                    } else if (i21 == 3) {
                        i = 10;
                    } else if (i21 != 4) {
                        C21334.m48351("AC-4 level " + c13334.f37451 + " has not been defined.");
                        i = 2;
                    } else {
                        i = 12;
                    }
                }
            }
            if (i <= 0) {
                throw C10998.m25388("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iM405512), Integer.valueOf(c13334.f37452), Integer.valueOf(c13334.f37451)};
            String str3 = C5792.f14228;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            C3601 c3601 = new C3601();
            c3601.m6701(str);
            c3601.m6697("audio/ac4");
            c3601.m6704(i);
            c3601.m6688(i5);
            c3601.m6679(c21037);
            c3601.m6703(str2);
            c3601.m6677(str4);
            return c3601.m6672();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34923(C17861 c17861, C13334 c13334) throws C10998 {
        int iM40558 = c17861.m40558(5);
        c17861.m40566(2);
        if (c17861.m40567()) {
            c17861.m40566(5);
        }
        if (iM40558 >= 7 && iM40558 <= 10) {
            c17861.m40561();
        }
        if (c17861.m40567()) {
            int iM40559 = c17861.m40558(3);
            if (c13334.f37446 == -1 && iM40558 >= 0 && iM40558 <= 15 && (iM40559 == 0 || iM40559 == 1)) {
                c13334.f37446 = iM40558;
            }
            if (c17861.m40567()) {
                m34924(c17861);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34925(C17861 c17861, C13334 c13334) throws C10998 {
        c17861.m40566(2);
        boolean zM40567 = c17861.m40567();
        int iM40558 = c17861.m40558(8);
        for (int i = 0; i < iM40558; i++) {
            c17861.m40566(2);
            if (c17861.m40567()) {
                c17861.m40566(5);
            }
            if (zM40567) {
                c17861.m40566(24);
            } else {
                if (c17861.m40567()) {
                    if (!c17861.m40567()) {
                        c17861.m40566(4);
                    }
                    c13334.f37450 = c17861.m40558(6) + 1;
                }
                c17861.m40566(4);
            }
        }
        if (c17861.m40567()) {
            c17861.m40566(3);
            if (c17861.m40567()) {
                m34924(c17861);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m34924(C17861 c17861) throws C10998 {
        int iM40558 = c17861.m40558(6);
        if (iM40558 < 2 || iM40558 > 42) {
            throw C10998.m25388(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM40558)));
        }
        c17861.m40566(iM40558 * 8);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX INFO: renamed from: ֫ */
    public static C24062 m34921(C17861 c17861) {
        int i;
        int i2;
        int iM40558 = c17861.m40558(16);
        int iM40559 = c17861.m40558(16);
        if (iM40559 == 65535) {
            iM40559 = c17861.m40558(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM40559 + i;
        if (iM40558 == 44097) {
            i3 += 2;
        }
        if (c17861.m40558(2) == 3) {
            do {
                c17861.m40558(2);
            } while (c17861.m40567());
        }
        int iM405510 = c17861.m40558(10);
        if (c17861.m40567() && c17861.m40558(3) > 0) {
            c17861.m40566(2);
        }
        int i4 = c17861.m40567() ? 48000 : 44100;
        int iM405511 = c17861.m40558(4);
        int[] iArr = f43801;
        if (i4 == 44100 && iM405511 == 13) {
            i2 = iArr[iM405511];
        } else if (i4 != 48000 || iM405511 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM405511];
            int i6 = iM405510 % 5;
            if (i6 == 1) {
                if (iM405511 != 3 || iM405511 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM405511 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM405511 == 3 || iM405511 == 8 || iM405511 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM405511 == 8 || iM405511 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C24062(i4, i3, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34922(int i, C19203 c19203) {
        c19203.m43727(7);
        byte[] bArrM43728 = c19203.m43728();
        bArrM43728[0] = -84;
        bArrM43728[1] = 64;
        bArrM43728[2] = -1;
        bArrM43728[3] = -1;
        bArrM43728[4] = (byte) ((i >> 16) & 255);
        bArrM43728[5] = (byte) ((i >> 8) & 255);
        bArrM43728[6] = (byte) (i & 255);
    }
}
