package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2720 {
    /* JADX WARN: Code duplicated, block: B:296:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:300:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d5  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9466 m8460(C1476 c1476) {
        int[] iArr;
        int[] iArr2;
        int iM38037;
        ArrayList arrayList;
        int i;
        C16124 c16124;
        int i2;
        C6643[] c6643Arr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int[] iArr3;
        ArrayList arrayList3;
        int[] iArrM34426;
        int[] iArr4;
        int i5;
        int i6;
        byte b;
        C16124 c16125;
        int i7;
        C12060 c12060;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr5;
        C6436 c6436;
        int[] iArr6;
        C5855 c5855;
        int i13 = c1476.f5289;
        int i14 = i13 & 512;
        boolean z = i14 != 0;
        C5855 c5856 = c1476.f5287;
        boolean z2 = (i14 != 0) | z;
        if ((i13 & (-1024)) != 0) {
            throw new UnsupportedOperationException("Regex program does not support flags: " + c1476.f5289);
        }
        C16124 c16126 = new C16124(c1476.f5294, z2);
        int iM38038 = c16126.m38037(c1476.f5296);
        C6436 c6436M34429 = C14403.m34429(c5856);
        C6436 c6436M344210 = (c6436M34429 == null || (c5855 = c6436M34429.f19905) == null) ? null : C14403.m34429(c5855);
        if (c6436M34429 != null && c6436M34429.f19905 != null && c6436M344210 == null) {
            throw new UnsupportedOperationException("Unknown regex search fallback");
        }
        if (c6436M34429 == null) {
            iArr = null;
        } else {
            int iM38039 = c16126.m38037(c6436M34429.f19909);
            C5855 c5857 = c6436M34429.f19907;
            iArr = new int[]{iM38039, c5857 == null ? -1 : c16126.m38037(c5857)};
        }
        if (c6436M344210 == null) {
            iArr2 = null;
        } else {
            int iM380310 = c16126.m38037(c6436M344210.f19909);
            C5855 c5858 = c6436M344210.f19907;
            iArr2 = new int[]{iM380310, c5858 == null ? -1 : c16126.m38037(c5858)};
        }
        Class<?> cls = c5856.getClass();
        C12060 c12061 = (cls == C12060.class || cls == C9944.class) ? (C12060) c5856 : null;
        int iM380311 = c12061 == null ? -1 : c16126.m38037(c12061.f17958);
        if (c12061 != null) {
            iM38037 = iM38038;
        } else {
            if (c5856 instanceof C0085) {
                c5856 = c5856.f17958;
            }
            iM38037 = c16126.m38037(c5856);
        }
        int i15 = 0;
        while (true) {
            arrayList = c16126.f49678;
            if (i15 >= arrayList.size()) {
                break;
            }
            c16126.m38038((C5855) arrayList.get(i15), i15 * 8);
            i15++;
        }
        int[] iArr7 = c16126.f49676;
        ArrayList arrayList4 = c16126.f49670;
        C23576 c23576M52039 = C23576.m52039(iArr7, arrayList4, iM38038);
        int size = arrayList.size();
        int[] iArr8 = new int[size];
        c16126.f49674 = iArr8;
        Arrays.fill(iArr8, -1);
        int[] iArr9 = new int[size];
        int i16 = 0;
        while (true) {
            boolean z3 = c16126.f49672;
            if (i16 >= size) {
                C6436 c6437 = c6436M34429;
                C6436 c6438 = c6436M344210;
                int[] iArr10 = iArr;
                int[] iArr11 = iArr2;
                int i17 = 0;
                while (true) {
                    i = size * 8;
                    if (i17 >= i) {
                        break;
                    }
                    int[] iArr12 = c16126.f49676;
                    int i18 = i17 + 1;
                    int i19 = iArr12[i18];
                    if (i19 != -1) {
                        iArr12[i18] = c16126.f49674[i19 / 8];
                    }
                    int i20 = iArr12[i17];
                    if (i20 == 6) {
                        int[] iArr13 = (int[]) arrayList4.get(iArr12[i17 + 2]);
                        for (int i21 = 0; i21 < iArr13.length; i21++) {
                            iArr13[i21] = c16126.f49674[iArr13[i21] / 8];
                        }
                    } else if (i20 == 10 || i20 == 9 || i20 == 19 || i20 == 18 || i20 == 27 || i20 == 26) {
                        int i22 = i17 + 6;
                        iArr12[i22] = c16126.f49674[iArr12[i22] / 8];
                    } else if (i20 == 22 || i20 == 25) {
                        int i23 = i17 + 3;
                        iArr12[i23] = c16126.f49674[iArr12[i23] / 8];
                    }
                    i17 += 8;
                }
                int i24 = 0;
                while (i24 < i && !z3) {
                    int[] iArr14 = c16126.f49676;
                    int i25 = iArr14[i24];
                    if (i25 == 10 || i25 == 9) {
                        i7 = i;
                        c12060 = c12061;
                        i8 = iM380311;
                        int i26 = i24 + 6;
                        int i27 = iArr14[i26];
                        if (iArr14[i27] == 7 && iArr14[i27 + 2] == iArr14[i24 + 3]) {
                            iArr14[i26] = iArr14[i27 + 1];
                            iArr14[i24 + 7] = 1;
                        }
                    } else if (i25 == 7) {
                        int i28 = i24 + 1;
                        int i29 = iArr14[i28];
                        boolean z4 = iArr14[i29] == 1;
                        int i30 = z4 ? iArr14[i29 + 1] : i29;
                        i7 = i;
                        if (iArr14[i30] != 4) {
                            c12060 = c12061;
                            i8 = iM380311;
                        } else {
                            int i31 = iArr14[i30 + 1];
                            i8 = iM380311;
                            if (iArr14[i31] == 8) {
                                int i32 = i24 + 2;
                                c12060 = c12061;
                                if (iArr14[i31 + 2] == iArr14[i32] && (i11 = iArr14[i31 + 3]) > 0 && iArr14[iArr14[i31 + 1]] == 0) {
                                    int i33 = iArr14[i30 + 2];
                                    int i34 = iArr14[i30 + 3];
                                    iArr14[i24] = z4 ? 12 : 13;
                                    iArr14[i28] = -1;
                                    iArr14[i32] = z4 ? iArr14[i29 + 2] : i33;
                                    int i35 = i24 + 3;
                                    if (!z4) {
                                        i33 = i34;
                                    }
                                    iArr14[i35] = i33;
                                    iArr14[i24 + 4] = i11;
                                    int i36 = i24 + 5;
                                    if (!z4) {
                                        i34 = 0;
                                    }
                                    iArr14[i36] = i34;
                                }
                            } else {
                                c12060 = c12061;
                            }
                        }
                    } else {
                        i7 = i;
                        c12060 = c12061;
                        i8 = iM380311;
                        if (i25 == 14 && (((i10 = iArr14[(i9 = iArr14[i24 + 1])]) == 1 || i10 == 3) && iArr14[iArr14[i9 + 1]] == 0)) {
                            iArr14[i24 + 3] = 1;
                        }
                    }
                    i24 += 8;
                    i = i7;
                    iM380311 = i8;
                    c12061 = c12060;
                }
                C12060 c12062 = c12061;
                int i37 = iM380311;
                int i38 = 0;
                C6643[] c6643Arr2 = null;
                C9776 c9776 = null;
                while (i38 < arrayList.size() * 8) {
                    if (c16126.f49676[i38] != 6) {
                        c16124 = c16126;
                        i2 = iM38038;
                        i3 = iM38037;
                        arrayList3 = arrayList;
                    } else {
                        if (c6643Arr2 == null) {
                            c6643Arr2 = new C6643[arrayList4.size()];
                        }
                        int i39 = c16126.f49676[i38 + 2];
                        int[] iArr15 = (int[]) arrayList4.get(i39);
                        if (z3 || iArr15.length <= 0 || iArr15.length > 31) {
                            c16124 = c16126;
                            i2 = iM38038;
                            c6643Arr = c6643Arr2;
                            i3 = iM38037;
                            i4 = i39;
                            arrayList2 = arrayList;
                        } else {
                            if (c9776 == null) {
                                c9776 = new C9776(arrayList.size());
                            }
                            long[] jArr = c9776.f29559;
                            long[] jArr2 = c9776.f29558;
                            iArr3 = new int[128];
                            int i40 = 0;
                            while (i40 < iArr15.length) {
                                int i41 = iArr15[i40];
                                int i42 = iM38037;
                                byte[] bArr = c9776.f29560;
                                int i43 = i41 / 8;
                                C9776 c9777 = c9776;
                                int i44 = iM38038;
                                if (bArr[i43] != 2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    bArr[i43] = 1;
                                    arrayList5.add(new C9070(i41));
                                    int i45 = 1;
                                    while (!arrayList5.isEmpty()) {
                                        C9070 c9070 = (C9070) C18566.m43105(arrayList5, i45);
                                        int i46 = c9070.f27502;
                                        int i47 = i46 / 8;
                                        C6643[] c6643Arr3 = c6643Arr2;
                                        int[] iArr16 = c16126.f49676;
                                        int i48 = i39;
                                        int i49 = iArr16[i46];
                                        ArrayList arrayList6 = arrayList;
                                        if (i49 == 7 || i49 == 11) {
                                            i5 = 6;
                                        } else {
                                            i5 = 6;
                                            if (i49 != 6) {
                                                if (i49 == 3) {
                                                    int[] iArr17 = (int[]) arrayList4.get(iArr16[i46 + 2]);
                                                    if (iArr17.length == 0) {
                                                        jArr2[i47] = -1;
                                                        jArr[i47] = -1;
                                                    } else {
                                                        int i50 = iArr17[0];
                                                        if (i50 >= 0 && i50 < 128) {
                                                            if (i50 < 64) {
                                                                jArr[i47] = 1 << i50;
                                                            } else {
                                                                jArr2[i47] = 1 << i50;
                                                            }
                                                        }
                                                    }
                                                } else if (i49 == 1 || i49 == 2 || i49 == 12 || ((i49 == 4 || i49 == 5 || i49 == 13) && iArr16[i46 + 3] > 0)) {
                                                    InterfaceC10795 interfaceC10795 = (InterfaceC10795) arrayList4.get(iArr16[i46 + 2]);
                                                    for (int i51 = 0; i51 < 128; i51++) {
                                                        if (interfaceC10795.mo2465(i51)) {
                                                            if (i51 < 64) {
                                                                jArr[i47] = jArr[i47] | (1 << i51);
                                                            } else {
                                                                jArr2[i47] = jArr2[i47] | (1 << i51);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                }
                                                bArr[i47] = 2;
                                            }
                                            C18473.m42953(arrayList5, 1);
                                            c16125 = c16126;
                                            i45 = 1;
                                            c16126 = c16125;
                                            c6643Arr2 = c6643Arr3;
                                            i39 = i48;
                                            arrayList = arrayList6;
                                        }
                                        int[] iArr18 = i49 == i5 ? (int[]) arrayList4.get(iArr16[i46 + 2]) : null;
                                        int length = iArr18 == null ? 1 : iArr18.length;
                                        int i52 = c9070.f27501;
                                        if (i52 == length) {
                                            bArr[i47] = 2;
                                            C18473.m42953(arrayList5, 1);
                                            c16125 = c16126;
                                        } else {
                                            if (iArr18 == null) {
                                                b = 1;
                                                i6 = c16126.f49676[c9070.f27502 + 1];
                                            } else {
                                                i6 = iArr18[i52];
                                                b = 1;
                                            }
                                            int i53 = i6 / 8;
                                            c16125 = c16126;
                                            byte b2 = bArr[i53];
                                            if (b2 == 0) {
                                                bArr[i53] = b;
                                                arrayList5.add(new C9070(i6));
                                            } else {
                                                if (b2 == 1) {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                } else {
                                                    jArr[i47] = jArr[i47] | jArr[i53];
                                                    jArr2[i47] = jArr2[i47] | jArr2[i53];
                                                }
                                                c9070.f27501 = i52 + 1;
                                            }
                                        }
                                        i45 = 1;
                                        c16126 = c16125;
                                        c6643Arr2 = c6643Arr3;
                                        i39 = i48;
                                        arrayList = arrayList6;
                                    }
                                }
                                C16124 c16127 = c16126;
                                C6643[] c6643Arr4 = c6643Arr2;
                                int i54 = i39;
                                ArrayList arrayList7 = arrayList;
                                int i55 = iArr15[i40] / 8;
                                int i56 = 1 << i40;
                                for (long j = jArr[i55]; j != 0; j &= j - 1) {
                                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                                    iArr3[iNumberOfTrailingZeros] = iArr3[iNumberOfTrailingZeros] | i56;
                                }
                                for (long j2 = jArr2[i55]; j2 != 0; j2 &= j2 - 1) {
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2) + 64;
                                    iArr3[iNumberOfTrailingZeros2] = iArr3[iNumberOfTrailingZeros2] | i56;
                                }
                                i40++;
                                c16126 = c16127;
                                iM38037 = i42;
                                c9776 = c9777;
                                iM38038 = i44;
                                c6643Arr2 = c6643Arr4;
                                i39 = i54;
                                arrayList = arrayList7;
                            }
                            c16124 = c16126;
                            i2 = iM38038;
                            c6643Arr = c6643Arr2;
                            i3 = iM38037;
                            C9776 c9778 = c9776;
                            i4 = i39;
                            arrayList2 = arrayList;
                            int length2 = (int) ((1 << iArr15.length) - 1);
                            int i57 = 0;
                            while (true) {
                                if (i57 >= 128) {
                                    c9776 = c9778;
                                } else {
                                    if (iArr3[i57] != length2) {
                                        c9776 = c9778;
                                        break;
                                    }
                                    i57++;
                                }
                            }
                            if (z3) {
                                arrayList3 = arrayList2;
                                iArrM34426 = C14403.m34426((C11355) arrayList3.get(i38 / 8));
                            } else {
                                arrayList3 = arrayList2;
                                iArrM34426 = null;
                            }
                            if (iArrM34426 == null) {
                                iArr4 = null;
                            } else {
                                iArr4 = (int[]) iArrM34426.clone();
                            }
                            c6643Arr[i4] = new C6643(iArr15, iArr3, iArr4);
                            c6643Arr2 = c6643Arr;
                        }
                        iArr3 = null;
                        if (z3) {
                            arrayList3 = arrayList2;
                            iArrM34426 = C14403.m34426((C11355) arrayList3.get(i38 / 8));
                        } else {
                            arrayList3 = arrayList2;
                            iArrM34426 = null;
                        }
                        if (iArrM34426 == null) {
                            iArr4 = null;
                        } else {
                            iArr4 = (int[]) iArrM34426.clone();
                        }
                        c6643Arr[i4] = new C6643(iArr15, iArr3, iArr4);
                        c6643Arr2 = c6643Arr;
                    }
                    i38 += 8;
                    arrayList = arrayList3;
                    c16126 = c16124;
                    iM38037 = i3;
                    iM38038 = i2;
                }
                C16124 c16128 = c16126;
                int i58 = iM38038;
                int i59 = iM38037;
                ArrayList arrayList8 = arrayList;
                if (c6643Arr2 != null) {
                    for (int i60 = 0; i60 < c6643Arr2.length; i60++) {
                        C6643 c6643 = c6643Arr2[i60];
                        if (c6643 != null) {
                            arrayList4.set(i60, c6643);
                        }
                    }
                }
                int[] iArr19 = c16128.f49674;
                return new C9466(Arrays.copyOf(c16128.f49676, arrayList8.size() * 8), arrayList4.toArray(), iArr19[i58 / 8], iArr19[i59 / 8], c1476.f5294, c16128.f49675, c16128.f49673, c12062 == null ? null : new C12618(c12062, iArr19[i37 / 8]), z2, m8459(c6437, iArr10, c16128.f49674, m8459(c6438, iArr11, c16128.f49674, null)), c23576M52039, c1476.f5287, c1476.f5296);
            }
            int i61 = i16 * 8;
            int[] iArr20 = c16126.f49674;
            C6436 c6439 = c6436M34429;
            int i62 = 0;
            while (true) {
                i12 = i61 / 8;
                iArr5 = iArr;
                c6436 = c6436M344210;
                if (iArr20[i12] != -1) {
                    iArr6 = iArr2;
                    break;
                }
                int[] iArr21 = c16126.f49676;
                int i63 = iArr21[i61];
                iArr6 = iArr2;
                if (i63 != 11) {
                    if (!z3 && i63 == 8 && iArr21[i61 + 3] == 0) {
                        if (c16126.f49677[iArr21[i61 + 2]]) {
                        }
                    }
                    iArr20[i12] = i61;
                    break;
                }
                iArr20[i12] = -2;
                iArr9[i62] = i61;
                i61 = iArr21[i61 + 1];
                i62++;
                iArr = iArr5;
                c6436M344210 = c6436;
                iArr2 = iArr6;
            }
            int i64 = iArr20[i12];
            if (i64 == -2) {
                throw new UnsupportedOperationException("Regex program encountered an empty jump cycle");
            }
            for (int i65 = 0; i65 < i62; i65++) {
                iArr20[iArr9[i65] / 8] = i64;
            }
            i16++;
            c6436M34429 = c6439;
            iArr = iArr5;
            c6436M344210 = c6436;
            iArr2 = iArr6;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2410 m8459(C6436 c6436, int[] iArr, int[] iArr2, C2410 c2410) {
        if (c6436 == null) {
            return null;
        }
        int i = iArr2[iArr[0] / 8];
        int i2 = iArr[1];
        return new C2410(c6436, i, i2 != -1 ? iArr2[i2 / 8] : -1, c2410);
    }
}
