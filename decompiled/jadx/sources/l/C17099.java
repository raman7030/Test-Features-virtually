package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܿۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17099 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f52409 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3860 m40116(C16184 c16184) {
        return m40115(c16184, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3860 m40114(InterfaceC8424 interfaceC8424, boolean z) {
        return m40115(interfaceC8424, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3860 m40115(InterfaceC8424 interfaceC8424, boolean z, boolean z2) {
        InterfaceC3860 interfaceC3860;
        boolean z3;
        int i;
        long j;
        boolean z4;
        int[] iArr;
        long length = interfaceC8424.getLength();
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        long j3 = -1;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j2 = length;
        }
        int i2 = (int) j2;
        C17714 c17714 = new C17714(64);
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (true) {
            if (i4 < i2) {
                c17714.m41481(8);
                if (interfaceC8424.mo22068(true, i3, 8, c17714.m41482())) {
                    long jM41479 = c17714.m41479();
                    int iM41493 = c17714.m41493();
                    if (jM41479 == 1) {
                        interfaceC8424.mo22061(8, 8, c17714.m41482());
                        i = 16;
                        c17714.m41486(16);
                        jM41479 = c17714.m41487();
                    } else {
                        if (jM41479 == 0) {
                            long length2 = interfaceC8424.getLength();
                            if (length2 != j3) {
                                jM41479 = (length2 - interfaceC8424.mo22069()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j4 = jM41479;
                    long j5 = i;
                    if (j4 < j5) {
                        return new C22927();
                    }
                    i4 += i;
                    if (iM41493 == 1836019574) {
                        i2 += (int) j4;
                        if (length != -1 && i2 > length) {
                            i2 = (int) length;
                        }
                        j = length;
                    } else if (iM41493 == 1836019558 || iM41493 == 1836475768) {
                        z3 = true;
                        interfaceC3860 = null;
                    } else {
                        if (iM41493 == 1835295092) {
                            z5 = true;
                        }
                        j = length;
                        boolean z6 = z5;
                        if ((((long) i4) + j4) - j5 >= i2) {
                            z5 = z6;
                            interfaceC3860 = null;
                            z3 = false;
                        } else {
                            int i5 = (int) (j4 - j5);
                            i4 += i5;
                            if (iM41493 != 1718909296) {
                                if (i5 != 0) {
                                    interfaceC8424.mo22060(i5);
                                }
                                z5 = z6;
                            } else {
                                if (i5 < 8) {
                                    return new C22927();
                                }
                                c17714.m41481(i5);
                                interfaceC8424.mo22061(0, i5, c17714.m41482());
                                boolean z7 = m40117(c17714.m41493(), z2) ? true : z6;
                                c17714.m41478(4);
                                int iM41457 = c17714.m41457() / 4;
                                if (!z7 && iM41457 > 0) {
                                    iArr = new int[iM41457];
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= iM41457) {
                                            z4 = z7;
                                            break;
                                        }
                                        int iM41494 = c17714.m41493();
                                        iArr[i6] = iM41494;
                                        if (m40117(iM41494, z2)) {
                                            z4 = true;
                                            break;
                                        }
                                        i6++;
                                    }
                                } else {
                                    z4 = z7;
                                    iArr = null;
                                }
                                if (!z4) {
                                    C6554 c6554 = new C6554();
                                    if (iArr != null) {
                                        C4960.m14399(iArr);
                                        return c6554;
                                    }
                                    int i7 = C4960.f15622;
                                    return c6554;
                                }
                                z5 = z4;
                            }
                        }
                    }
                    i3 = 0;
                    length = j;
                    j3 = -1;
                }
                if (!z5) {
                    return C7181.f21979;
                }
                if (z != z3) {
                    return interfaceC3860;
                }
                if (z3) {
                    return C12120.f36201;
                }
                return C12120.f36202;
            }
            interfaceC3860 = null;
            z3 = false;
            if (!z5) {
                return C7181.f21979;
            }
            if (z != z3) {
                return interfaceC3860;
            }
            if (z3) {
                return C12120.f36201;
            }
            return C12120.f36202;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40117(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f52409[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
