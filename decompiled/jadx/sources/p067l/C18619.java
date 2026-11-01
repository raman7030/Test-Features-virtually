package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܿۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18619 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f55591 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6037 m42361(C17750 c17750) {
        return m42360(c17750, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6037 m42359(InterfaceC10375 interfaceC10375, boolean z) {
        return m42360(interfaceC10375, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6037 m42360(InterfaceC10375 interfaceC10375, boolean z, boolean z2) {
        InterfaceC6037 interfaceC6037;
        boolean z3;
        int i;
        long j;
        boolean z4;
        int[] iArr;
        long length = interfaceC10375.getLength();
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        long j3 = -1;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j2 = length;
        }
        int i2 = (int) j2;
        C19203 c19203 = new C19203(64);
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (true) {
            if (i4 < i2) {
                c19203.m43727(8);
                if (interfaceC10375.mo24038(true, i3, 8, c19203.m43728())) {
                    long jM43725 = c19203.m43725();
                    int iM43739 = c19203.m43739();
                    if (jM43725 == 1) {
                        interfaceC10375.mo24031(8, 8, c19203.m43728());
                        i = 16;
                        c19203.m43732(16);
                        jM43725 = c19203.m43733();
                    } else {
                        if (jM43725 == 0) {
                            long length2 = interfaceC10375.getLength();
                            if (length2 != j3) {
                                jM43725 = (length2 - interfaceC10375.mo24039()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j4 = jM43725;
                    long j5 = i;
                    if (j4 < j5) {
                        return new C24158();
                    }
                    i4 += i;
                    if (iM43739 == 1836019574) {
                        i2 += (int) j4;
                        if (length != -1 && i2 > length) {
                            i2 = (int) length;
                        }
                        j = length;
                    } else if (iM43739 == 1836019558 || iM43739 == 1836475768) {
                        z3 = true;
                        interfaceC6037 = null;
                    } else {
                        if (iM43739 == 1835295092) {
                            z5 = true;
                        }
                        j = length;
                        boolean z6 = z5;
                        if ((((long) i4) + j4) - j5 >= i2) {
                            z5 = z6;
                            interfaceC6037 = null;
                            z3 = false;
                        } else {
                            int i5 = (int) (j4 - j5);
                            i4 += i5;
                            if (iM43739 != 1718909296) {
                                if (i5 != 0) {
                                    interfaceC10375.mo24030(i5);
                                }
                                z5 = z6;
                            } else {
                                if (i5 < 8) {
                                    return new C24158();
                                }
                                c19203.m43727(i5);
                                interfaceC10375.mo24031(0, i5, c19203.m43728());
                                boolean z7 = m42362(c19203.m43739(), z2) ? true : z6;
                                c19203.m43724(4);
                                int iM43703 = c19203.m43703() / 4;
                                if (!z7 && iM43703 > 0) {
                                    iArr = new int[iM43703];
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= iM43703) {
                                            z4 = z7;
                                            break;
                                        }
                                        int iM437310 = c19203.m43739();
                                        iArr[i6] = iM437310;
                                        if (m42362(iM437310, z2)) {
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
                                    C8597 c8597 = new C8597();
                                    if (iArr != null) {
                                        C7083.m16302(iArr);
                                        return c8597;
                                    }
                                    int i7 = C7083.f18456;
                                    return c8597;
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
                    return C9193.f24858;
                }
                if (z != z3) {
                    return interfaceC6037;
                }
                if (z3) {
                    return C13887.f39213;
                }
                return C13887.f39214;
            }
            interfaceC6037 = null;
            z3 = false;
            if (!z5) {
                return C9193.f24858;
            }
            if (z != z3) {
                return interfaceC6037;
            }
            if (z3) {
                return C13887.f39213;
            }
            return C13887.f39214;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42362(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f55591[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
