package l;

/* JADX INFO: renamed from: l.ۘ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4182 extends AbstractC2771 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2065 f13629;

    public C4182(C15469 c15469, int i, int i2, int i3, int i4, int i5, int i6, int i7, C4265 c4265) {
        super(c15469, AbstractC13644.m32778(i3, Math.max(i4, 1), 272, i5, i6, i7, c4265), i, i2, i3, i5);
        this.f13629 = null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[LOOP:2: B:75:0x00ec->B:79:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[SYNTHETIC] */
    @Override // l.AbstractC2771
    /* JADX INFO: renamed from: ܿ */
    public final int mo8560() {
        int i;
        int i2;
        int i3;
        int iMax;
        int i4;
        if (this.f8626 == -1) {
            this.f13629 = m8561();
        }
        this.f8631 = -1;
        AbstractC13644 abstractC13644 = this.f8630;
        int iMin = Math.min(abstractC13644.m32781(), 273);
        int i5 = 1;
        if (iMin < 2) {
            return 1;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f8635;
            int[] iArr = this.f53746;
            if (i6 < 4) {
                int iM32787 = abstractC13644.m32787(iArr[i6], iMin);
                if (iM32787 >= 2) {
                    if (iM32787 >= i9) {
                        this.f8631 = i6;
                        m8554(iM32787 - 1);
                        return iM32787;
                    }
                    if (iM32787 > i7) {
                        i8 = i6;
                        i7 = iM32787;
                    }
                }
                i6++;
            } else {
                C2065 c2065 = this.f13629;
                int i10 = c2065.f6889;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    i2 = c2065.f6891[i11];
                    i = c2065.f6890[i11];
                    if (i2 >= i9) {
                        this.f8631 = i + 4;
                        m8554(i2 - 1);
                        return i2;
                    }
                    while (true) {
                        C2065 c2066 = this.f13629;
                        int i12 = c2066.f6889;
                        if (i12 <= i5) {
                            break;
                        }
                        int[] iArr2 = c2066.f6891;
                        int i13 = i12 - 2;
                        if (i2 != iArr2[i13] + 1) {
                            break;
                        }
                        int[] iArr3 = c2066.f6890;
                        if (iArr3[i13] >= (i >>> 7)) {
                            break;
                        }
                        c2066.f6889 = i12 - 1;
                        int i14 = i12 - 2;
                        i2 = iArr2[i14];
                        i = iArr3[i14];
                        i5 = 1;
                    }
                    i3 = 1;
                    if (i2 == 2 && i >= 128) {
                        i2 = 1;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 1;
                }
                if (i7 >= 2 && (i7 + 1 >= i2 || ((i7 + 2 >= i2 && i >= 512) || (i7 + 3 >= i2 && i >= 32768)))) {
                    this.f8631 = i8;
                    m8554(i7 - 1);
                    return i7;
                }
                if (i2 >= 2 && iMin > 2) {
                    C2065 c2065M8561 = m8561();
                    this.f13629 = c2065M8561;
                    int i15 = c2065M8561.f6889;
                    if (i15 > 0) {
                        int i16 = i15 - 1;
                        int i17 = c2065M8561.f6891[i16];
                        int i18 = c2065M8561.f6890[i16];
                        if (i17 < i2 || i18 >= i) {
                            int i19 = i2 + 1;
                            if (i17 == i19 && i >= (i18 >>> 7)) {
                                return i3;
                            }
                            if (i17 <= i19) {
                                if (i17 + 1 >= i2 && i2 >= 3 && i18 < (i >>> 7)) {
                                    return i3;
                                }
                                iMax = Math.max(i2 - 1, 2);
                                for (i4 = 0; i4 < 4; i4++) {
                                    if (abstractC13644.m32787(iArr[i4], iMax) == iMax) {
                                    }
                                }
                                this.f8631 = i + 4;
                                m8554(i2 - 2);
                                return i2;
                            }
                        }
                    } else {
                        iMax = Math.max(i2 - 1, 2);
                        while (i4 < 4) {
                            if (abstractC13644.m32787(iArr[i4], iMax) == iMax) {
                            }
                        }
                        this.f8631 = i + 4;
                        m8554(i2 - 2);
                        return i2;
                    }
                }
                return i3;
            }
        }
    }
}
