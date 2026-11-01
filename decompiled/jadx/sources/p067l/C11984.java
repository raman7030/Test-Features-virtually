package p067l;

/* JADX INFO: renamed from: l.ۤۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11984 extends AbstractC15335 {

    /* JADX INFO: renamed from: ֡ */
    public final C4331 f33419;

    /* JADX INFO: renamed from: ۖ */
    public final int f33420;

    /* JADX INFO: renamed from: ۘ */
    public final int f33421;

    /* JADX INFO: renamed from: ۚ */
    public final int[] f33422;

    /* JADX INFO: renamed from: ܺ */
    public int f33423;

    /* JADX INFO: renamed from: ᩴ */
    public final C13325 f33424;

    /* JADX INFO: renamed from: ᩵ */
    public int f33425;

    public C11984(int i, int i2, int i3, int i4, int i5, C6422 c6422) {
        super(i, i2, i3, i4, c6422);
        this.f33423 = -1;
        int i6 = i + 1;
        this.f33420 = i6;
        this.f33425 = i6;
        this.f33424 = new C13325(i, c6422);
        this.f33422 = c6422.mo7200(i6 * 2, false);
        this.f33419 = new C4331(i4 - 1);
        this.f33421 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ֫ */
    public final void mo18398(C6422 c6422) {
        c6422.mo7198(this.f33422);
        this.f33424.m30417(c6422);
        c6422.mo7197(this.f43772);
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m27422() {
        int iM34906 = m34906(this.f43782);
        if (iM34906 != 0) {
            int i = this.f33425 + 1;
            this.f33425 = i;
            int i2 = this.f33420;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f33424.m30415(i3);
                AbstractC15335.m34894(i2 * 2, i3, this.f33422);
                this.f33425 -= i3;
            }
            int i4 = this.f33423 + 1;
            this.f33423 = i4;
            if (i4 == i2) {
                this.f33423 = 0;
            }
        }
        return iM34906;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ۧ */
    public final C4331 mo18399() {
        int iM21512;
        int i;
        int[] iArr;
        C4331 c4331 = this.f33419;
        c4331.f9673 = 0;
        int[] iArr2 = c4331.f9674;
        int[] iArr3 = c4331.f9675;
        int iM27422 = m27422();
        int i2 = this.f43777;
        int i3 = this.f43782;
        if (iM27422 >= i2) {
            iM27422 = i2;
        } else {
            if (iM27422 == 0) {
                return c4331;
            }
            if (i3 > iM27422) {
                i3 = iM27422;
            }
        }
        int i4 = this.f43775;
        C13325 c13325 = this.f33424;
        byte[] bArr = this.f43772;
        c13325.m30416(i4, bArr);
        int iM30414 = this.f33425 - c13325.m30414();
        int iM30418 = this.f33425 - c13325.m30418();
        int iM30420 = c13325.m30420();
        c13325.m30419(this.f33425);
        int i5 = this.f33420;
        if (iM30414 < i5) {
            int i6 = this.f43775;
            if (bArr[i6 - iM30414] == bArr[i6]) {
                iM21512 = 2;
                iArr3[0] = 2;
                iArr2[0] = iM30414 - 1;
                c4331.f9673 = 1;
            } else {
                iM21512 = 0;
            }
        } else {
            iM21512 = 0;
        }
        if (iM30414 == iM30418 || iM30418 >= i5) {
            i = 0;
        } else {
            int i7 = this.f43775;
            i = 0;
            if (bArr[i7 - iM30418] == bArr[i7]) {
                int i8 = c4331.f9673;
                c4331.f9673 = i8 + 1;
                iArr2[i8] = iM30418 - 1;
                iM21512 = 3;
                iM30414 = iM30418;
            }
        }
        if (c4331.f9673 > 0) {
            iM21512 = C9301.m21512(bArr, this.f43775, iM30414, iM21512, iM27422);
            iArr3[c4331.f9673 - 1] = iM21512;
            if (iM21512 >= i3) {
                m27421(i3, iM30420);
                return c4331;
            }
        }
        int i9 = iM21512 >= 3 ? iM21512 : 3;
        int i10 = this.f33423 << 1;
        int i11 = i10 + 1;
        int i12 = this.f33421;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f33425 - iM30420;
            int i16 = i12 - 1;
            int i17 = iM30420;
            iArr = this.f33422;
            if (i12 == 0 || i15 >= i5) {
                break;
            }
            int i18 = this.f33423;
            int i19 = ((i18 - i15) + (i15 > i18 ? i5 : 0)) << 1;
            int iMin = Math.min(i13, i14);
            int i20 = i5;
            int i21 = this.f43775;
            int i22 = i21 + iMin;
            int i23 = i13;
            int i24 = i14;
            if (bArr[i22 - i15] == bArr[i22]) {
                int iM21513 = C9301.m21512(bArr, i21, i15, iMin + 1, iM27422);
                if (iM21513 > i9) {
                    int i25 = c4331.f9673;
                    iArr3[i25] = iM21513;
                    iArr2[i25] = i15 - 1;
                    c4331.f9673 = i25 + 1;
                    if (iM21513 >= i3) {
                        iArr[i10] = iArr[i19];
                        iArr[i11] = iArr[i19 + 1];
                        return c4331;
                    }
                    i9 = iM21513;
                    iMin = i9;
                } else {
                    iMin = iM21513;
                }
            }
            int i26 = this.f43775 + iMin;
            if ((bArr[i26 - i15] & 255) < (bArr[i26] & 255)) {
                iArr[i10] = i17;
                int i27 = i19 + 1;
                iM30420 = iArr[i27];
                i10 = i27;
                i14 = iMin;
                i13 = i23;
            } else {
                iArr[i11] = i17;
                iM30420 = iArr[i19];
                i11 = i19;
                i13 = iMin;
                i14 = i24;
            }
            i12 = i16;
            i5 = i20;
        }
        iArr[i11] = i;
        iArr[i10] = i;
        return c4331;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m27421(int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = this.f33423;
        int i5 = (i4 << 1) + 1;
        int i6 = i4 << 1;
        int i7 = this.f33421;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f33425 - i2;
            int i11 = i7 - 1;
            iArr = this.f33422;
            if (i7 == 0 || i10 >= (i3 = this.f33420)) {
                break;
            }
            int i12 = this.f33423;
            int i13 = i12 - i10;
            if (i10 <= i12) {
                i3 = 0;
            }
            int i14 = (i13 + i3) << 1;
            int iMin = Math.min(i8, i9);
            int i15 = this.f43775;
            byte[] bArr = this.f43772;
            if (bArr[(i15 + iMin) - i10] == bArr[i15 + iMin] && (iMin = C9301.m21512(bArr, i15, i10, iMin + 1, i)) == i) {
                iArr[i6] = iArr[i14];
                iArr[i5] = iArr[i14 + 1];
                return;
            }
            int i16 = this.f43775;
            if ((bArr[(i16 + iMin) - i10] & 255) < (bArr[i16 + iMin] & 255)) {
                iArr[i6] = i2;
                int i17 = i14 + 1;
                i2 = iArr[i17];
                i6 = i17;
                i9 = iMin;
            } else {
                iArr[i5] = i2;
                i2 = iArr[i14];
                i5 = i14;
                i8 = iMin;
            }
            i7 = i11;
        }
        iArr[i5] = 0;
        iArr[i6] = 0;
    }

    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ᩳ */
    public final void mo18400(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int iM27422 = m27422();
            int i3 = this.f43782;
            if (iM27422 < i3) {
                if (iM27422 == 0) {
                }
                i = i2;
            } else {
                iM27422 = i3;
            }
            byte[] bArr = this.f43772;
            int i4 = this.f43775;
            C13325 c13325 = this.f33424;
            c13325.m30416(i4, bArr);
            int iM30420 = c13325.m30420();
            c13325.m30419(this.f33425);
            m27421(iM27422, iM30420);
            i = i2;
        }
    }
}
