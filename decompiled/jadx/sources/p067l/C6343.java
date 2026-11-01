package p067l;

/* JADX INFO: renamed from: l.ۘ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6343 extends AbstractC5002 {

    /* JADX INFO: renamed from: ۫ */
    public C4331 f16442;

    public C6343(C17070 c17070, int i, int i2, int i3, int i4, int i5, int i6, int i7, C6422 c6422) {
        super(c17070, AbstractC15335.m34893(i3, Math.max(i4, 1), 272, i5, i6, i7, c6422), i, i2, i3, i5);
        this.f16442 = null;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[LOOP:2: B:75:0x00ec->B:79:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0103 A[SYNTHETIC] */
    @Override // p067l.AbstractC5002
    /* JADX INFO: renamed from: ܿ */
    public final int mo10623() {
        int i;
        int i2;
        int i3;
        int iMax;
        int i4;
        if (this.f11420 == -1) {
            this.f16442 = m10624();
        }
        this.f11425 = -1;
        AbstractC15335 abstractC15335 = this.f11424;
        int iMin = Math.min(abstractC15335.m34896(), 273);
        int i5 = 1;
        if (iMin < 2) {
            return 1;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f11429;
            int[] iArr = this.f56940;
            if (i6 < 4) {
                int iM34902 = abstractC15335.m34902(iArr[i6], iMin);
                if (iM34902 >= 2) {
                    if (iM34902 >= i9) {
                        this.f11425 = i6;
                        m10617(iM34902 - 1);
                        return iM34902;
                    }
                    if (iM34902 > i7) {
                        i8 = i6;
                        i7 = iM34902;
                    }
                }
                i6++;
            } else {
                C4331 c4331 = this.f16442;
                int i10 = c4331.f9673;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    i2 = c4331.f9675[i11];
                    i = c4331.f9674[i11];
                    if (i2 >= i9) {
                        this.f11425 = i + 4;
                        m10617(i2 - 1);
                        return i2;
                    }
                    while (true) {
                        C4331 c4332 = this.f16442;
                        int i12 = c4332.f9673;
                        if (i12 <= i5) {
                            break;
                        }
                        int[] iArr2 = c4332.f9675;
                        int i13 = i12 - 2;
                        if (i2 != iArr2[i13] + 1) {
                            break;
                        }
                        int[] iArr3 = c4332.f9674;
                        if (iArr3[i13] >= (i >>> 7)) {
                            break;
                        }
                        c4332.f9673 = i12 - 1;
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
                    this.f11425 = i8;
                    m10617(i7 - 1);
                    return i7;
                }
                if (i2 >= 2 && iMin > 2) {
                    C4331 c4331M10624 = m10624();
                    this.f16442 = c4331M10624;
                    int i15 = c4331M10624.f9673;
                    if (i15 > 0) {
                        int i16 = i15 - 1;
                        int i17 = c4331M10624.f9675[i16];
                        int i18 = c4331M10624.f9674[i16];
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
                                    if (abstractC15335.m34902(iArr[i4], iMax) == iMax) {
                                    }
                                }
                                this.f11425 = i + 4;
                                m10617(i2 - 2);
                                return i2;
                            }
                        }
                    } else {
                        iMax = Math.max(i2 - 1, 2);
                        while (i4 < 4) {
                            if (abstractC15335.m34902(iArr[i4], iMax) == iMax) {
                            }
                        }
                        this.f11425 = i + 4;
                        m10617(i2 - 2);
                        return i2;
                    }
                }
                return i3;
            }
        }
    }
}
