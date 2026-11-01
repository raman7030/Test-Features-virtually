package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4954 {
    /* JADX WARN: Code duplicated, block: B:296:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:300:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d5  */
    /* JADX INFO: renamed from: ֫ */
    public static C11365 m10507(C3771 c3771) {
        int[] iArr;
        int[] iArr2;
        int iM40229;
        ArrayList arrayList;
        int i;
        C17693 c17693;
        int i2;
        C8682[] c8682Arr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int[] iArr3;
        ArrayList arrayList3;
        int[] iArrM36560;
        int[] iArr4;
        int i5;
        int i6;
        byte b;
        C17693 c17694;
        int i7;
        C13830 c13830;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr5;
        C8485 c8485;
        int[] iArr6;
        C7933 c7933;
        int i13 = c3771.f8062;
        int i14 = i13 & 512;
        boolean z = i14 != 0;
        C7933 c7934 = c3771.f8060;
        boolean z2 = (i14 != 0) | z;
        if ((i13 & (-1024)) != 0) {
            throw new UnsupportedOperationException("Regex program does not support flags: " + c3771.f8062);
        }
        C17693 c17695 = new C17693(c3771.f8067, z2);
        int iM402210 = c17695.m40229(c3771.f8069);
        C8485 c8485M36563 = C16057.m36563(c7934);
        C8485 c8485M36564 = (c8485M36563 == null || (c7933 = c8485M36563.f22777) == null) ? null : C16057.m36563(c7933);
        if (c8485M36563 != null && c8485M36563.f22777 != null && c8485M36564 == null) {
            throw new UnsupportedOperationException("Unknown regex search fallback");
        }
        if (c8485M36563 == null) {
            iArr = null;
        } else {
            int iM402211 = c17695.m40229(c8485M36563.f22781);
            C7933 c7935 = c8485M36563.f22779;
            iArr = new int[]{iM402211, c7935 == null ? -1 : c17695.m40229(c7935)};
        }
        if (c8485M36564 == null) {
            iArr2 = null;
        } else {
            int iM402212 = c17695.m40229(c8485M36564.f22781);
            C7933 c7936 = c8485M36564.f22779;
            iArr2 = new int[]{iM402212, c7936 == null ? -1 : c17695.m40229(c7936)};
        }
        Class<?> cls = c7934.getClass();
        C13830 c13831 = (cls == C13830.class || cls == C11819.class) ? (C13830) c7934 : null;
        int iM402213 = c13831 == null ? -1 : c17695.m40229(c13831.f20809);
        if (c13831 != null) {
            iM40229 = iM402210;
        } else {
            if (c7934 instanceof C2449) {
                c7934 = c7934.f20809;
            }
            iM40229 = c17695.m40229(c7934);
        }
        int i15 = 0;
        while (true) {
            arrayList = c17695.f52844;
            if (i15 >= arrayList.size()) {
                break;
            }
            c17695.m40230((C7933) arrayList.get(i15), i15 * 8);
            i15++;
        }
        int[] iArr7 = c17695.f52842;
        ArrayList arrayList4 = c17695.f52836;
        C24775 c24775M54441 = C24775.m54441(iArr7, arrayList4, iM402210);
        int size = arrayList.size();
        int[] iArr8 = new int[size];
        c17695.f52840 = iArr8;
        Arrays.fill(iArr8, -1);
        int[] iArr9 = new int[size];
        int i16 = 0;
        while (true) {
            boolean z3 = c17695.f52838;
            if (i16 >= size) {
                C8485 c8486 = c8485M36563;
                C8485 c8487 = c8485M36564;
                int[] iArr10 = iArr;
                int[] iArr11 = iArr2;
                int i17 = 0;
                while (true) {
                    i = size * 8;
                    if (i17 >= i) {
                        break;
                    }
                    int[] iArr12 = c17695.f52842;
                    int i18 = i17 + 1;
                    int i19 = iArr12[i18];
                    if (i19 != -1) {
                        iArr12[i18] = c17695.f52840[i19 / 8];
                    }
                    int i20 = iArr12[i17];
                    if (i20 == 6) {
                        int[] iArr13 = (int[]) arrayList4.get(iArr12[i17 + 2]);
                        for (int i21 = 0; i21 < iArr13.length; i21++) {
                            iArr13[i21] = c17695.f52840[iArr13[i21] / 8];
                        }
                    } else if (i20 == 10 || i20 == 9 || i20 == 19 || i20 == 18 || i20 == 27 || i20 == 26) {
                        int i22 = i17 + 6;
                        iArr12[i22] = c17695.f52840[iArr12[i22] / 8];
                    } else if (i20 == 22 || i20 == 25) {
                        int i23 = i17 + 3;
                        iArr12[i23] = c17695.f52840[iArr12[i23] / 8];
                    }
                    i17 += 8;
                }
                int i24 = 0;
                while (i24 < i && !z3) {
                    int[] iArr14 = c17695.f52842;
                    int i25 = iArr14[i24];
                    if (i25 == 10 || i25 == 9) {
                        i7 = i;
                        c13830 = c13831;
                        i8 = iM402213;
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
                            c13830 = c13831;
                            i8 = iM402213;
                        } else {
                            int i31 = iArr14[i30 + 1];
                            i8 = iM402213;
                            if (iArr14[i31] == 8) {
                                int i32 = i24 + 2;
                                c13830 = c13831;
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
                                c13830 = c13831;
                            }
                        }
                    } else {
                        i7 = i;
                        c13830 = c13831;
                        i8 = iM402213;
                        if (i25 == 14 && (((i10 = iArr14[(i9 = iArr14[i24 + 1])]) == 1 || i10 == 3) && iArr14[iArr14[i9 + 1]] == 0)) {
                            iArr14[i24 + 3] = 1;
                        }
                    }
                    i24 += 8;
                    i = i7;
                    iM402213 = i8;
                    c13831 = c13830;
                }
                C13830 c13832 = c13831;
                int i37 = iM402213;
                int i38 = 0;
                C8682[] c8682Arr2 = null;
                C11660 c11660 = null;
                while (i38 < arrayList.size() * 8) {
                    if (c17695.f52842[i38] != 6) {
                        c17693 = c17695;
                        i2 = iM402210;
                        i3 = iM40229;
                        arrayList3 = arrayList;
                    } else {
                        if (c8682Arr2 == null) {
                            c8682Arr2 = new C8682[arrayList4.size()];
                        }
                        int i39 = c17695.f52842[i38 + 2];
                        int[] iArr15 = (int[]) arrayList4.get(i39);
                        if (z3 || iArr15.length <= 0 || iArr15.length > 31) {
                            c17693 = c17695;
                            i2 = iM402210;
                            c8682Arr = c8682Arr2;
                            i3 = iM40229;
                            i4 = i39;
                            arrayList2 = arrayList;
                        } else {
                            if (c11660 == null) {
                                c11660 = new C11660(arrayList.size());
                            }
                            long[] jArr = c11660.f32511;
                            long[] jArr2 = c11660.f32510;
                            iArr3 = new int[128];
                            int i40 = 0;
                            while (i40 < iArr15.length) {
                                int i41 = iArr15[i40];
                                int i42 = iM40229;
                                byte[] bArr = c11660.f32512;
                                int i43 = i41 / 8;
                                C11660 c11661 = c11660;
                                int i44 = iM402210;
                                if (bArr[i43] != 2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    bArr[i43] = 1;
                                    arrayList5.add(new C10989(i41));
                                    int i45 = 1;
                                    while (!arrayList5.isEmpty()) {
                                        C10989 c10989 = (C10989) C20013.m45383(arrayList5, i45);
                                        int i46 = c10989.f30439;
                                        int i47 = i46 / 8;
                                        C8682[] c8682Arr3 = c8682Arr2;
                                        int[] iArr16 = c17695.f52842;
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
                                                    InterfaceC12628 interfaceC12628 = (InterfaceC12628) arrayList4.get(iArr16[i46 + 2]);
                                                    for (int i51 = 0; i51 < 128; i51++) {
                                                        if (interfaceC12628.mo4821(i51)) {
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
                                            C19925.m45229(arrayList5, 1);
                                            c17694 = c17695;
                                            i45 = 1;
                                            c17695 = c17694;
                                            c8682Arr2 = c8682Arr3;
                                            i39 = i48;
                                            arrayList = arrayList6;
                                        }
                                        int[] iArr18 = i49 == i5 ? (int[]) arrayList4.get(iArr16[i46 + 2]) : null;
                                        int length = iArr18 == null ? 1 : iArr18.length;
                                        int i52 = c10989.f30438;
                                        if (i52 == length) {
                                            bArr[i47] = 2;
                                            C19925.m45229(arrayList5, 1);
                                            c17694 = c17695;
                                        } else {
                                            if (iArr18 == null) {
                                                b = 1;
                                                i6 = c17695.f52842[c10989.f30439 + 1];
                                            } else {
                                                i6 = iArr18[i52];
                                                b = 1;
                                            }
                                            int i53 = i6 / 8;
                                            c17694 = c17695;
                                            byte b2 = bArr[i53];
                                            if (b2 == 0) {
                                                bArr[i53] = b;
                                                arrayList5.add(new C10989(i6));
                                            } else {
                                                if (b2 == 1) {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                } else {
                                                    jArr[i47] = jArr[i47] | jArr[i53];
                                                    jArr2[i47] = jArr2[i47] | jArr2[i53];
                                                }
                                                c10989.f30438 = i52 + 1;
                                            }
                                        }
                                        i45 = 1;
                                        c17695 = c17694;
                                        c8682Arr2 = c8682Arr3;
                                        i39 = i48;
                                        arrayList = arrayList6;
                                    }
                                }
                                C17693 c17696 = c17695;
                                C8682[] c8682Arr4 = c8682Arr2;
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
                                c17695 = c17696;
                                iM40229 = i42;
                                c11660 = c11661;
                                iM402210 = i44;
                                c8682Arr2 = c8682Arr4;
                                i39 = i54;
                                arrayList = arrayList7;
                            }
                            c17693 = c17695;
                            i2 = iM402210;
                            c8682Arr = c8682Arr2;
                            i3 = iM40229;
                            C11660 c11662 = c11660;
                            i4 = i39;
                            arrayList2 = arrayList;
                            int length2 = (int) ((1 << iArr15.length) - 1);
                            int i57 = 0;
                            while (true) {
                                if (i57 >= 128) {
                                    c11660 = c11662;
                                } else {
                                    if (iArr3[i57] != length2) {
                                        c11660 = c11662;
                                        break;
                                    }
                                    i57++;
                                }
                            }
                            if (z3) {
                                arrayList3 = arrayList2;
                                iArrM36560 = C16057.m36560((C13160) arrayList3.get(i38 / 8));
                            } else {
                                arrayList3 = arrayList2;
                                iArrM36560 = null;
                            }
                            if (iArrM36560 == null) {
                                iArr4 = null;
                            } else {
                                iArr4 = (int[]) iArrM36560.clone();
                            }
                            c8682Arr[i4] = new C8682(iArr15, iArr3, iArr4);
                            c8682Arr2 = c8682Arr;
                        }
                        iArr3 = null;
                        if (z3) {
                            arrayList3 = arrayList2;
                            iArrM36560 = C16057.m36560((C13160) arrayList3.get(i38 / 8));
                        } else {
                            arrayList3 = arrayList2;
                            iArrM36560 = null;
                        }
                        if (iArrM36560 == null) {
                            iArr4 = null;
                        } else {
                            iArr4 = (int[]) iArrM36560.clone();
                        }
                        c8682Arr[i4] = new C8682(iArr15, iArr3, iArr4);
                        c8682Arr2 = c8682Arr;
                    }
                    i38 += 8;
                    arrayList = arrayList3;
                    c17695 = c17693;
                    iM40229 = i3;
                    iM402210 = i2;
                }
                C17693 c17697 = c17695;
                int i58 = iM402210;
                int i59 = iM40229;
                ArrayList arrayList8 = arrayList;
                if (c8682Arr2 != null) {
                    for (int i60 = 0; i60 < c8682Arr2.length; i60++) {
                        C8682 c8682 = c8682Arr2[i60];
                        if (c8682 != null) {
                            arrayList4.set(i60, c8682);
                        }
                    }
                }
                int[] iArr19 = c17697.f52840;
                return new C11365(Arrays.copyOf(c17697.f52842, arrayList8.size() * 8), arrayList4.toArray(), iArr19[i58 / 8], iArr19[i59 / 8], c3771.f8067, c17697.f52841, c17697.f52839, c13832 == null ? null : new C14361(c13832, iArr19[i37 / 8]), z2, m10506(c8486, iArr10, c17697.f52840, m10506(c8487, iArr11, c17697.f52840, null)), c24775M54441, c3771.f8060, c3771.f8069);
            }
            int i61 = i16 * 8;
            int[] iArr20 = c17695.f52840;
            C8485 c8488 = c8485M36563;
            int i62 = 0;
            while (true) {
                i12 = i61 / 8;
                iArr5 = iArr;
                c8485 = c8485M36564;
                if (iArr20[i12] != -1) {
                    iArr6 = iArr2;
                    break;
                }
                int[] iArr21 = c17695.f52842;
                int i63 = iArr21[i61];
                iArr6 = iArr2;
                if (i63 != 11) {
                    if (!z3 && i63 == 8 && iArr21[i61 + 3] == 0) {
                        if (c17695.f52843[iArr21[i61 + 2]]) {
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
                c8485M36564 = c8485;
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
            c8485M36563 = c8488;
            iArr = iArr5;
            c8485M36564 = c8485;
            iArr2 = iArr6;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4659 m10506(C8485 c8485, int[] iArr, int[] iArr2, C4659 c4659) {
        if (c8485 == null) {
            return null;
        }
        int i = iArr2[iArr[0] / 8];
        int i2 = iArr[1];
        return new C4659(c8485, i, i2 != -1 ? iArr2[i2 / 8] : -1, c4659);
    }
}
