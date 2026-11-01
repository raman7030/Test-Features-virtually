package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.util.BitSet;

/* JADX INFO: renamed from: l.۟ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9518 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f26052;

    /* JADX INFO: renamed from: ۜ */
    public final int[] f26053;

    /* JADX INFO: renamed from: ۢ */
    public final int f26054;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f26055;

    /* JADX INFO: renamed from: ܳ */
    public final int f26056;

    /* JADX INFO: renamed from: ܽ */
    public final BitSet f26057;

    /* JADX INFO: renamed from: ܿ */
    public final int f26058;

    /* JADX INFO: renamed from: ᩳ */
    public final BitSet f26059;

    /* JADX INFO: renamed from: ᩷ */
    public final int f26060;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f26061;

    public C9518(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, BitSet bitSet, BitSet bitSet2) {
        this.f26061 = iArr;
        this.f26053 = iArr2;
        this.f26060 = i;
        this.f26054 = i3;
        this.f26058 = i2;
        this.f26056 = i4;
        this.f26057 = bitSet;
        this.f26059 = bitSet2;
        bitSet.set(i, i + i2);
        bitSet2.set(i3, i3 + i4);
        int i5 = i2 + i4 + 1;
        this.f26055 = new int[i5];
        this.f26052 = new int[i5];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22139() {
        int i;
        try {
            int iSqrt = (((int) Math.sqrt(this.f26058 + this.f26056)) * 10) + C0180b.f790j0;
            int i2 = this.f26058;
            if (i2 != 0 && (i = this.f26056) != 0) {
                m22138(0, i2, 0, i, Math.min(iSqrt, i2 + i), false);
            }
        } catch (C15552 e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22140() throws C15552 {
        int i;
        int iMax = Math.max((((int) Math.sqrt(this.f26058 + this.f26056)) * 10) + C0180b.f790j0, C0180b.f790j0);
        int i2 = this.f26058;
        if (i2 == 0 || (i = this.f26056) == 0) {
            return;
        }
        m22138(0, i2, 0, i, Math.min(iMax, i2 + i), true);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0113 A[EDGE_INSN: B:113:0x0113->B:47:0x0113 BREAK  A[LOOP:5: B:42:0x00f4->B:46:0x010a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0113 A[EDGE_INSN: B:114:0x0113->B:47:0x0113 BREAK  A[LOOP:5: B:42:0x00f4->B:46:0x010a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a A[LOOP:5: B:42:0x00f4->B:46:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0143 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m22138(int i, int i2, int i3, int i4, int i5, boolean z) throws C15552 {
        int i6;
        int i7;
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
        int iMin;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = i;
        int i29 = i3;
        int i30 = i4;
        if (i28 >= i2 || i29 >= i30) {
            return;
        }
        int i31 = i2 - i28;
        int i32 = i30 - i29;
        int i33 = i32 + 1;
        int[] iArr = this.f26055;
        iArr[i33] = 0;
        int[] iArr2 = this.f26052;
        iArr2[i33] = 0;
        int i34 = 1;
        int i35 = (i5 + 1) / 2;
        int i36 = 0;
        loop0: while (true) {
            int i37 = this.f26054;
            int i38 = this.f26060;
            if (i36 > i35) {
                i6 = i37;
                i7 = i38;
                i8 = 1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                break;
            }
            int iMax = Math.max(-i36, (-i32) + ((i36 ^ i32) & 1)) + i32;
            int iMin2 = Math.min(i36, i31 - (i34 & (i36 ^ i31))) + i32;
            int i39 = iMax;
            while (i39 <= iMin2) {
                if (i39 != iMax) {
                    if (i39 != iMin2) {
                        i25 = i35;
                        i26 = i37;
                        if (iArr[i39 - 1] < iArr[i39 + 1]) {
                        }
                        int i40 = (i27 - i39) + i32;
                        iArr[i39] = i27 + m22137(i28 + i27, i29 + i40, Math.min(i31 - i27, i32 - i40));
                        i39 += 2;
                        i28 = i;
                        i29 = i3;
                        i35 = i25;
                        i38 = i38;
                        i37 = i26;
                    } else {
                        i25 = i35;
                        i26 = i37;
                    }
                    i27 = iArr[i39 - 1] + 1;
                    int i41 = (i27 - i39) + i32;
                    iArr[i39] = i27 + m22137(i28 + i27, i29 + i41, Math.min(i31 - i27, i32 - i41));
                    i39 += 2;
                    i28 = i;
                    i29 = i3;
                    i35 = i25;
                    i38 = i38;
                    i37 = i26;
                } else {
                    i25 = i35;
                    i26 = i37;
                }
                i27 = iArr[i39 + 1];
                int i42 = (i27 - i39) + i32;
                iArr[i39] = i27 + m22137(i28 + i27, i29 + i42, Math.min(i31 - i27, i32 - i42));
                i39 += 2;
                i28 = i;
                i29 = i3;
                i35 = i25;
                i38 = i38;
                i37 = i26;
            }
            int i43 = i35;
            i6 = i37;
            i7 = i38;
            int i44 = (i31 - i32) % 2;
            if (i44 != 0) {
                i16 = iMax;
                while (true) {
                    if (i16 <= iMin2) {
                        int i45 = i36 - 1;
                        if (i31 - i45 <= i16 && i16 <= i45 + i31) {
                            i9 = iArr[i16];
                            if (iArr2[(i32 + i31) - i16] + i9 >= i31) {
                                i17 = (i36 * 2) - 1;
                            }
                        }
                        i16 += 2;
                    } else {
                        i13 = iMax;
                        while (i13 <= iMin2) {
                            if (i13 != iMax || (i13 != iMin2 && iArr2[i13 - 1] < iArr2[i13 + 1])) {
                                i18 = iArr2[i13 + 1];
                            } else {
                                i18 = iArr2[i13 - 1] + 1;
                            }
                            int i46 = (i18 - i13) + i32;
                            i19 = (i2 - 1) - i18;
                            i20 = (i30 - 1) - i46;
                            int i47 = iMax;
                            iMin = Math.min(Math.min(i31 - i18, i32 - i46), Math.min(i19, i20) + 1);
                            i21 = i19;
                            while (true) {
                                i22 = i19 - i21;
                                if (i22 < iMin) {
                                    break;
                                }
                                i23 = iMin;
                                i24 = i19;
                                if (this.f26061[i7 + i21] == this.f26053[i6 + i20]) {
                                    break;
                                }
                                i21--;
                                i20--;
                                iMin = i23;
                                i19 = i24;
                            }
                            iArr2[i13] = i18 + i22;
                            i13 += 2;
                            i30 = i4;
                            iMax = i47;
                        }
                        i14 = iMax;
                        if (i44 == 0) {
                            i15 = i14;
                            while (true) {
                                if (i15 <= iMin2) {
                                    if (i31 - i36 > i15 && i15 <= i31 + i36) {
                                        i16 = (i31 + i32) - i15;
                                        int i48 = iArr[i16];
                                        int i49 = iArr2[i15];
                                        if (i48 + i49 >= i31) {
                                            i9 = i31 - i49;
                                            i17 = i36 * 2;
                                        }
                                    }
                                    i15 += 2;
                                } else {
                                    continue;
                                }
                            }
                        }
                        i36++;
                        i34 = 1;
                        i28 = i;
                        i29 = i3;
                        i30 = i4;
                        i35 = i43;
                    }
                }
            } else {
                i13 = iMax;
                while (i13 <= iMin2) {
                    if (i13 != iMax) {
                        i18 = iArr2[i13 + 1];
                    } else {
                        i18 = iArr2[i13 + 1];
                    }
                    int i410 = (i18 - i13) + i32;
                    i19 = (i2 - 1) - i18;
                    i20 = (i30 - 1) - i410;
                    int i411 = iMax;
                    iMin = Math.min(Math.min(i31 - i18, i32 - i410), Math.min(i19, i20) + 1);
                    i21 = i19;
                    while (true) {
                        i22 = i19 - i21;
                        if (i22 < iMin) {
                            break;
                            break;
                        }
                        i23 = iMin;
                        i24 = i19;
                        if (this.f26061[i7 + i21] == this.f26053[i6 + i20]) {
                            break;
                            break;
                        }
                        i21--;
                        i20--;
                        iMin = i23;
                        i19 = i24;
                    }
                    iArr2[i13] = i18 + i22;
                    i13 += 2;
                    i30 = i4;
                    iMax = i411;
                }
                i14 = iMax;
                if (i44 == 0) {
                    i15 = i14;
                    while (true) {
                        if (i15 <= iMin2) {
                            if (i31 - i36 > i15) {
                            }
                            i15 += 2;
                        } else {
                            continue;
                        }
                    }
                }
                i36++;
                i34 = 1;
                i28 = i;
                i29 = i3;
                i30 = i4;
                i35 = i43;
            }
            i8 = 1;
            i10 = i16;
            i11 = i17;
            break loop0;
        }
        if (i11 > i8) {
            int i50 = (i9 - i10) + i32;
            int i51 = (i11 + 1) / 2;
            if (i9 > 0 && i50 > 0) {
                m22138(i, i + i9, i3, i3 + i50, i51, z);
            }
            int i52 = i + i9;
            if (i52 >= i2 || (i12 = i3 + i50) >= i4) {
                return;
            }
            m22138(i52, i2, i12, i4, i11 - i51, z);
            return;
        }
        if (i11 < 0) {
            if (z) {
                throw new C15552();
            }
            return;
        }
        int i53 = i;
        int i54 = i3;
        while (i53 < i2 && i54 < i4) {
            int iM22137 = m22137(i53, i54, Math.min(i2 - i53, i4 - i54));
            if (iM22137 > 0) {
                int i55 = i7 + i53;
                this.f26057.set(i55, i55 + iM22137, false);
                int i56 = i6 + i54;
                this.f26059.set(i56, i56 + iM22137, false);
                i53 += iM22137;
                i54 += iM22137;
            } else if (i31 > i32) {
                i53++;
            } else {
                i54++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m22137(int i, int i2, int i3) {
        int i4;
        int iMin = Math.min(i3, Math.min(this.f26058 - i, this.f26056 - i2));
        int i5 = i;
        while (true) {
            i4 = i5 - i;
            if (i4 >= iMin) {
                break;
            }
            if (this.f26061[this.f26060 + i5] != this.f26053[this.f26054 + i2]) {
                break;
            }
            i5++;
            i2++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ܽ */
    public final BitSet[] m22141() {
        return new BitSet[]{this.f26057, this.f26059};
    }
}
