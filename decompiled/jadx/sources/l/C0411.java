package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0411 extends C6192 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f1865;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC18531 f1866;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1867;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CharSequence f1868;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18051 f1870;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f1871;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f1872;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f1873;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long[] f1874;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1869 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f1875 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1876 = -1;

    public C0411(CharSequence charSequence, C1875 c1875, EnumC18531 enumC18531, int i, C18051 c18051) {
        this.f1868 = charSequence;
        ArrayList arrayListM6210 = c1875.m6210();
        this.f1867 = arrayListM6210;
        this.f1866 = enumC18531;
        this.f1870 = c18051;
        this.f1865 = c18051 == null && enumC18531 != EnumC18531.JSON && C18051.m42105(arrayListM6210);
        this.f1871 = i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:152:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0230  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:296:0x0470  */
    /* JADX WARN: Code duplicated, block: B:299:0x0479  */
    /* JADX WARN: Code duplicated, block: B:368:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138 A[LOOP:6: B:92:0x0132->B:94:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0151  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1933(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        int iM8042;
        int i5;
        int iM8043;
        int i6;
        long[] jArr;
        boolean z;
        boolean z2;
        long[] jArr2;
        int iM1939;
        int i7;
        int i8;
        int i9;
        int type;
        int i10;
        int i11;
        ArrayList arrayList3 = this.f1867;
        int i12 = 1;
        int size = arrayList3.size() + 1;
        this.f1872 = new byte[size];
        this.f1873 = new int[size];
        this.f1874 = new long[size];
        int i13 = 0;
        while (i13 < arrayList3.size()) {
            C18757.m43430();
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList3.get(i13);
            long[] jArr3 = this.f1874;
            int i14 = i13 + 1;
            jArr3[i14] = jArr3[i13] + ((interfaceC0463.getType() == 141 || interfaceC0463.getType() == -1) ? 0L : ((long) (interfaceC0463.mo2053() - interfaceC0463.mo2054())) + 2);
            i13 = i14;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2529 c2529 = (C2529) it.next();
            C18757.m43430();
            int i15 = c2529.f8024;
            int i16 = c2529.f8029;
            int i17 = c2529.f8030;
            int i18 = c2529.f8027;
            if (i18 == 72 && i15 >= 0 && i15 < arrayList3.size()) {
                if (((InterfaceC0463) arrayList3.get(i15)).getType() == 93) {
                    m1926(i15, 8);
                } else {
                    int iM19310 = m1939(i15);
                    if (iM19310 >= 0) {
                        m1926(iM19310, 4);
                    }
                    m1930(i15);
                }
            }
            if (i15 >= 0 && i17 >= i15 && i17 < arrayList3.size()) {
                int i19 = this.f1871;
                if (i18 == -3 || i18 == -2) {
                    m1925(i15, i17, true);
                } else if (i18 == i12) {
                    m1930(i15);
                    if (i18 == 1 || !(i16 == 21 || i16 == 22)) {
                        i6 = 1;
                    } else {
                        boolean z3 = c2529.m8042(93, arrayList3) >= 0;
                        if (c2529.f8023 || z3) {
                            i6 = 1;
                            m1927(i15, z3 ? 3 : 1);
                        } else {
                            int[] iArr = this.f1873;
                            i6 = 1;
                            iArr[i15] = iArr[i15] + 1;
                            int iM1937 = m1937(i17);
                            iArr[iM1937] = iArr[iM1937] - 1;
                        }
                    }
                    if (i18 == i6 && i16 == i6) {
                        m1927(i15, i6);
                    }
                } else if (i18 == 2) {
                    m1925(i15, i17, true);
                } else if (i18 == 8) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19 || m1931(i15, i17)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 9) {
                    if (i18 != 51) {
                        jArr2 = this.f1874;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2 || m1931(i15, i17)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                    m1925(i15, i17, z2);
                } else if (i18 == 14) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 24) {
                    m1930(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m1927(i15, i6);
                    }
                } else if (i18 == 30) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 40 || i18 == 43) {
                    m1928(i15);
                    m1928(m1937(i17));
                    for (int i20 = i15 + 1; i20 <= i17; i20++) {
                        m1927(i20, 3);
                    }
                } else if (i18 == 47) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 57) {
                    iM1939 = m1939(i15);
                    if (m1932(i15) != 2) {
                        if (iM1939 >= 0 || !(((InterfaceC0463) arrayList3.get(iM1939)).getType() == 135 || ((InterfaceC0463) arrayList3.get(iM1939)).getType() == 29 || ((InterfaceC0463) arrayList3.get(iM1939)).getType() == 28)) {
                            i7 = 3;
                        } else {
                            i7 = 1;
                        }
                        m1927(i15, i7);
                    }
                    m1927(m1937(i15), 3);
                    m1927(i17, 3);
                    if (c2529.f8031) {
                        m1929(i17, m1937(i17));
                    }
                } else if (i18 == 66) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 68) {
                    for (i8 = i15; i8 <= i17; i8++) {
                        type = ((InterfaceC0463) arrayList3.get(i8)).getType();
                        if (type != 145 || type == 143) {
                            i10 = 144;
                            i11 = 64;
                        } else {
                            i10 = 144;
                            i11 = 64;
                            if (type == 144) {
                            }
                            if (type != 7 || type == 145 || type == i10) {
                                m1926(i8 + 1, i11);
                            }
                        }
                        m1926(i8, i11);
                        if (type != 7) {
                            m1926(i8 + 1, i11);
                        } else {
                            m1926(i8 + 1, i11);
                        }
                    }
                    for (i9 = 0; i9 < c2529.f8026; i9++) {
                        int iM8041 = c2529.m8041(i9);
                        m1926(iM8041, 64);
                        m1926(iM8041 + 1, 64);
                    }
                } else if (i18 == 17) {
                    m1925(i15, i17, true);
                } else if (i18 == 18) {
                    m1930(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m1927(i15, i6);
                    }
                } else if (i18 == 50) {
                    jArr = this.f1874;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m1925(i15, i17, z);
                } else if (i18 == 51) {
                    if (i18 != 51) {
                        jArr2 = this.f1874;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                    m1925(i15, i17, z2);
                } else if (i18 == 54) {
                    while (i8 <= i17) {
                        type = ((InterfaceC0463) arrayList3.get(i8)).getType();
                        if (type != 145) {
                            i10 = 144;
                            i11 = 64;
                            m1926(i8, i11);
                        } else {
                            i10 = 144;
                            i11 = 64;
                            m1926(i8, i11);
                        }
                        if (type != 7) {
                            m1926(i8 + 1, i11);
                        } else {
                            m1926(i8 + 1, i11);
                        }
                    }
                    while (i9 < c2529.f8026) {
                        int iM8044 = c2529.m8041(i9);
                        m1926(iM8044, 64);
                        m1926(iM8044 + 1, 64);
                    }
                } else if (i18 == 55) {
                    iM1939 = m1939(i15);
                    if (m1932(i15) != 2) {
                        if (iM1939 >= 0) {
                            i7 = 3;
                        } else {
                            i7 = 3;
                        }
                        m1927(i15, i7);
                    }
                    m1927(m1937(i15), 3);
                    m1927(i17, 3);
                    if (c2529.f8031) {
                        m1929(i17, m1937(i17));
                    }
                } else if (i18 == 63) {
                    m1925(i15, i17, true);
                } else if (i18 == 64) {
                    m1930(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m1927(i15, i6);
                    }
                }
                if (i18 == 41 || i18 == 58) {
                    for (int i21 = 0; i21 < c2529.f8026; i21++) {
                        m1928(c2529.m8041(i21));
                        m1928(m1937(c2529.m8041(i21)));
                    }
                }
                if (i18 == 15 || i18 == 64 || i18 == 18 || i18 == 67) {
                    for (int i22 = 0; i22 < c2529.f8026; i22++) {
                        m1927(c2529.m8041(i22), 3);
                    }
                }
                if (i18 == 34 && c2529.m8042(43, arrayList3) >= 0) {
                    int iM8045 = c2529.m8042(91, arrayList3);
                    int iM8046 = c2529.m8042(92, arrayList3);
                    if (iM8045 >= 0 && iM8046 >= 0) {
                        m1925(iM8045, iM8046, true);
                    }
                }
                if (i18 == 59 || i18 == 60) {
                    long[] jArr4 = this.f1874;
                    if (jArr4[i17 + 1] - jArr4[i15] > i19) {
                        int i23 = -1;
                        for (int i24 = 0; i24 < c2529.f8026; i24++) {
                            int iM8047 = c2529.m8041(i24);
                            if (iM8047 >= 0) {
                                m1930(iM8047);
                                if (i23 < 0) {
                                    i23 = iM8047;
                                }
                            }
                        }
                        if (i23 >= 0) {
                            int[] iArr2 = this.f1873;
                            iArr2[i23] = iArr2[i23] + 1;
                            int iM1938 = m1937(i17);
                            iArr2[iM1938] = iArr2[iM1938] - 1;
                        }
                    }
                }
                if (i18 == 21 && (iM8043 = c2529.m8042(18, arrayList3)) >= 0) {
                    m1927(iM8043, ((InterfaceC0463) arrayList3.get(m1939(iM8043))).getType() == 92 ? 1 : 2);
                }
                if (i18 == 25) {
                    int iM8048 = c2529.m8042(10, arrayList3);
                    int iM8049 = c2529.m8042(21, arrayList3);
                    if (iM8048 >= 0) {
                        m1928(iM8048);
                    }
                    if (iM8049 >= 0) {
                        m1928(iM8049);
                    }
                }
                if (i18 == 20) {
                    m1930(m1937(i17));
                }
                if (i18 == 23) {
                    int iM80410 = c2529.m8042(91, arrayList3);
                    int iM80411 = c2529.m8042(92, arrayList3);
                    if (iM80410 >= 0) {
                        if (iM80411 < 0) {
                            iM80411 = i17;
                        }
                        i4 = 1;
                        m1925(iM80410, iM80411, true);
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 1;
                }
                if (i18 == 24 && (i5 = c2529.f8025) >= 0) {
                    int[] iArr3 = this.f1873;
                    iArr3[i5] = iArr3[i5] + i4;
                    int iM19311 = m1937(i17);
                    iArr3[iM19311] = iArr3[iM19311] - i4;
                }
                if (i18 == 22 && c2529.m8042(17, arrayList3) >= 0 && (iM8042 = c2529.m8042(38, arrayList3)) >= 0) {
                    m1928(iM8042);
                }
                if (i18 == 72 || i18 == 65) {
                    m1930(m1937(i17));
                }
            }
            i12 = 1;
        }
        if (this.f1866 == EnumC18531.TYPESCRIPT) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2529 c25210 = (C2529) it2.next();
                C18757.m43430();
                if (c25210.f8027 == 58 && c25210.f8029 == 42 && (i2 = c25210.f8024) >= 0 && (i3 = c25210.f8030) >= i2 && i3 < arrayList3.size()) {
                    int iM19312 = m1937(c25210.f8030);
                    if (((InterfaceC0463) arrayList3.get(iM19312)).getType() == 115 && m1929(c25210.f8030, iM19312)) {
                        int i25 = c25210.f8030;
                        byte[] bArr = this.f1872;
                        bArr[i25] = (byte) (bArr[i25] & ((byte) (-5)));
                    }
                }
            }
        }
        int i26 = 0;
        while (true) {
            arrayList = this.f1869;
            int size2 = arrayList.size();
            arrayList2 = this.f1875;
            if (i26 >= size2) {
                break;
            }
            C8931 c8931 = (C8931) arrayList.get(i26);
            int iMax = Math.max(0, Math.max(c8931.f27156.mo2052(), ((Integer) arrayList2.get(i26)).intValue()));
            InterfaceC0463 interfaceC0464 = c8931.f27155;
            int size3 = interfaceC0464 == null ? arrayList3.size() - 1 : interfaceC0464.mo2052();
            for (int i27 = iMax; i27 <= Math.min(arrayList3.size() - 1, size3 + 1); i27++) {
                m1926(i27, 16);
            }
            for (int iMax2 = Math.max(0, iMax - 1); iMax2 <= Math.min(arrayList3.size() - 1, size3); iMax2++) {
                byte[] bArr2 = this.f1872;
                bArr2[iMax2] = (byte) (bArr2[iMax2] & ((byte) (-5)));
            }
            i26++;
        }
        for (int i28 = 0; i28 < arrayList3.size(); i28++) {
            int type2 = ((InterfaceC0463) arrayList3.get(i28)).getType();
            if (type2 == 145 || type2 == 143) {
                i = 64;
            } else {
                i = 64;
                if (type2 == 144) {
                }
                if (type2 != 145 || type2 == 7 || type2 == 144) {
                    m1926(i28 + 1, i);
                }
                if (type2 == 142) {
                    m1926(i28, 16);
                    m1926(i28 + 1, 16);
                }
            }
            m1926(i28, i);
            if (type2 != 145) {
                m1926(i28 + 1, i);
            } else {
                m1926(i28 + 1, i);
            }
            if (type2 == 142) {
                m1926(i28, 16);
                m1926(i28 + 1, 16);
            }
        }
        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
            C18757.m43430();
            if (m1936(i29, 4) || m1936(i29, 8)) {
                int iM19313 = m1937(i29);
                int type3 = ((InterfaceC0463) arrayList3.get(iM19313)).getType();
                boolean z4 = type3 == 92 || type3 == -1;
                for (int i30 = i29; z4 && i30 <= iM19313; i30++) {
                    z4 = !m1936(i30, 16);
                }
                if (!z4) {
                    byte[] bArr3 = this.f1872;
                    bArr3[i29] = (byte) (bArr3[i29] & ((byte) (-9)));
                }
                if (z4) {
                    byte[] bArr4 = this.f1872;
                    bArr4[i29] = (byte) (bArr4[i29] & ((byte) (-5)));
                }
            }
        }
        this.f1874 = null;
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // l.InterfaceC12542
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1935(AbstractC18809 abstractC18809, Object obj, int i, int i2, String str, C2581 c2581) {
        int iValueOf;
        boolean z = this.f1865;
        ArrayList arrayList = this.f1875;
        ArrayList arrayList2 = this.f1869;
        if (z && (obj instanceof InterfaceC0463)) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) obj;
            if (interfaceC0463.mo2052() > this.f1876) {
                this.f1876 = interfaceC0463.mo2052();
                arrayList2.clear();
                arrayList.clear();
            }
        }
        if (arrayList2.size() >= 64) {
            throw new C19463();
        }
        C8931 c8931M24566 = ((AbstractC3254) abstractC18809).m24566();
        C8931 c8931 = c8931M24566;
        while (true) {
            if (c8931M24566 == null) {
                c8931M24566 = c8931;
                break;
            } else {
                if ((c8931M24566 instanceof C1843) || (c8931M24566 instanceof C10728) || (c8931M24566 instanceof C2549)) {
                    break;
                }
                c8931 = c8931M24566;
                c8931M24566 = c8931M24566.f63075;
            }
        }
        if (c8931M24566 != null) {
            arrayList2.add(c8931M24566);
            if (this.f1866 == EnumC18531.JSON && (obj instanceof InterfaceC0463)) {
                InterfaceC0463 interfaceC0464 = (InterfaceC0463) obj;
                if (interfaceC0464.getType() == -1) {
                    iValueOf = Integer.valueOf(interfaceC0464.mo2052());
                } else {
                    iValueOf = -1;
                }
            } else {
                iValueOf = -1;
            }
            arrayList.add(iValueOf);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1932(int i) {
        return this.f1872[i] & 3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m1927(int i, int i2) {
        byte[] bArr = this.f1872;
        bArr[i] = (byte) (i2 | (bArr[i] & (-4)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1936(int i, int i2) {
        return (this.f1872[i] & i2) != 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m1926(int i, int i2) {
        byte[] bArr = this.f1872;
        bArr[i] = (byte) (((byte) i2) | bArr[i]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1934(C18051 c18051) {
        if (c18051 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1867;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList.get(i);
            if (interfaceC0463.getType() == 44 && c18051.m42109(interfaceC0463.mo2054())) {
                m1929(i, m1937(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m1929(int i, int i2) {
        boolean z = false;
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) this.f1867.get(i3);
            if (C8173.m21648(interfaceC0463.getText())) {
                if (interfaceC0463.getType() == 141) {
                    m1926(i3 + 1, 16);
                } else if (interfaceC0463.getType() == 4) {
                    m1926(i3, 32);
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1925(int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = this.f1867;
        int type = ((InterfaceC0463) arrayList.get(i)).getType();
        if (type == 91) {
            i3 = 92;
        } else {
            i3 = type == 89 ? 90 : 88;
        }
        int i4 = 0;
        boolean z2 = ((InterfaceC0463) arrayList.get(i2)).getType() == i3;
        int i5 = 3;
        if (z2 && m1937(i) == i2) {
            if (m1938(i, i2)) {
                InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList.get(i2 - 1);
                if (interfaceC0463.getType() == 141 && C8173.m21648(interfaceC0463.getText())) {
                    i5 = 2;
                }
                m1927(i2, i5);
                return;
            }
            if (m1931(i, i2)) {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (((InterfaceC0463) arrayList.get(i)).getType() == 141);
                int[] iArr = this.f1873;
                iArr[i] = iArr[i] + 1;
                iArr[i2] = iArr[i2] - 1;
                m1930(i2);
                return;
            }
            m1927(i2, 3);
            return;
        }
        boolean z3 = type == 91;
        if (z) {
            m1930(m1937(i));
            int[] iArr2 = this.f1873;
            int iM1937 = m1937(i);
            iArr2[iM1937] = iArr2[iM1937] + 1;
            if (z2) {
                m1930(i2);
                int[] iArr3 = this.f1873;
                iArr3[i2] = iArr3[i2] - 1;
            }
        } else {
            m1927(m1937(i), z3 ? 1 : 3);
            if (z2) {
                m1927(i2, z3 ? 1 : 3);
            }
        }
        while (true) {
            i++;
            if (i >= i2) {
                return;
            }
            int type2 = ((InterfaceC0463) arrayList.get(i)).getType();
            if (type2 == 91 || type2 == 89 || type2 == 87) {
                i4++;
            }
            if (type2 == 92 || type2 == 90 || type2 == 88) {
                i4--;
            }
            if (i4 == 0 && (type2 == 94 || type2 == 93)) {
                int iM1938 = m1937(i);
                if (z) {
                    m1930(iM1938);
                } else {
                    m1928(iM1938);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m1937(int i) {
        ArrayList arrayList;
        do {
            i++;
            arrayList = this.f1867;
            if (i >= arrayList.size()) {
                break;
            }
        } while (((InterfaceC0463) arrayList.get(i)).mo2050() != 0);
        return Math.min(i, arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m1939(int i) {
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (((InterfaceC0463) this.f1867.get(i)).mo2050() != 0);
        return i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m1930(int i) {
        if (i < 0 || i >= this.f1872.length) {
            return;
        }
        m1927(i, 2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m1928(int i) {
        if (i < 0 || i >= this.f1872.length || m1932(i) == 2) {
            return;
        }
        m1927(i, 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m1938(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) this.f1867.get(i3);
            int type = interfaceC0463.getType();
            if (type == 4 || type == 3) {
                String text = interfaceC0463.getText();
                if (text.contains("@ts-") || text.contains("#__PURE__") || text.contains("@__PURE__") || text.contains("sourceURL=") || text.contains("sourceMappingURL=") || text.contains("eslint") || text.contains("prettier") || text.contains("istanbul")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m1931(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int type = ((InterfaceC0463) this.f1867.get(i3)).getType();
            if (type == 3 || type == 4 || type == 2) {
                return true;
            }
        }
        return false;
    }
}
