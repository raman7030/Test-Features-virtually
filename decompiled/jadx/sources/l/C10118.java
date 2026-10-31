package l;

/* JADX INFO: renamed from: l.ۤۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 21RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10118 extends AbstractC13644 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2065 f30457;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30458;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f30459;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f30460;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30461;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11529 f30462;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f30463;

    public C10118(int i, int i2, int i3, int i4, int i5, C4265 c4265) {
        super(i, i2, i3, i4, c4265);
        this.f30461 = -1;
        int i6 = i + 1;
        this.f30458 = i6;
        this.f30463 = i6;
        this.f30462 = new C11529(i, c4265);
        this.f30460 = c4265.mo4957(i6 * 2, false);
        this.f30457 = new C2065(i4 - 1);
        this.f30459 = i5 <= 0 ? (i4 / 2) + 16 : i5;
    }

    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ֫ */
    public final void mo16472(C4265 c4265) {
        c4265.mo4955(this.f30460);
        this.f30462.m28371(c4265);
        c4265.mo4954(this.f40691);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m25402() {
        int iM32791 = m32791(this.f40701);
        if (iM32791 != 0) {
            int i = this.f30463 + 1;
            this.f30463 = i;
            int i2 = this.f30458;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f30462.m28369(i3);
                AbstractC13644.m32779(i2 * 2, i3, this.f30460);
                this.f30463 -= i3;
            }
            int i4 = this.f30461 + 1;
            this.f30461 = i4;
            if (i4 == i2) {
                this.f30461 = 0;
            }
        }
        return iM32791;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ۧ */
    public final C2065 mo16473() {
        int iM19544;
        int i;
        int[] iArr;
        C2065 c2065 = this.f30457;
        c2065.f6889 = 0;
        int[] iArr2 = c2065.f6890;
        int[] iArr3 = c2065.f6891;
        int iM25402 = m25402();
        int i2 = this.f40696;
        int i3 = this.f40701;
        if (iM25402 >= i2) {
            iM25402 = i2;
        } else {
            if (iM25402 == 0) {
                return c2065;
            }
            if (i3 > iM25402) {
                i3 = iM25402;
            }
        }
        int i4 = this.f40694;
        C11529 c11529 = this.f30462;
        byte[] bArr = this.f40691;
        c11529.m28370(i4, bArr);
        int iM28368 = this.f30463 - c11529.m28368();
        int iM28372 = this.f30463 - c11529.m28372();
        int iM28374 = c11529.m28374();
        c11529.m28373(this.f30463);
        int i5 = this.f30458;
        if (iM28368 < i5) {
            int i6 = this.f40694;
            if (bArr[i6 - iM28368] == bArr[i6]) {
                iM19544 = 2;
                iArr3[0] = 2;
                iArr2[0] = iM28368 - 1;
                c2065.f6889 = 1;
            } else {
                iM19544 = 0;
            }
        } else {
            iM19544 = 0;
        }
        if (iM28368 == iM28372 || iM28372 >= i5) {
            i = 0;
        } else {
            int i7 = this.f40694;
            i = 0;
            if (bArr[i7 - iM28372] == bArr[i7]) {
                int i8 = c2065.f6889;
                c2065.f6889 = i8 + 1;
                iArr2[i8] = iM28372 - 1;
                iM19544 = 3;
                iM28368 = iM28372;
            }
        }
        if (c2065.f6889 > 0) {
            iM19544 = C7295.m19544(bArr, this.f40694, iM28368, iM19544, iM25402);
            iArr3[c2065.f6889 - 1] = iM19544;
            if (iM19544 >= i3) {
                m25401(i3, iM28374);
                return c2065;
            }
        }
        int i9 = iM19544 >= 3 ? iM19544 : 3;
        int i10 = this.f30461 << 1;
        int i11 = i10 + 1;
        int i12 = this.f30459;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f30463 - iM28374;
            int i16 = i12 - 1;
            int i17 = iM28374;
            iArr = this.f30460;
            if (i12 == 0 || i15 >= i5) {
                break;
            }
            int i18 = this.f30461;
            int i19 = ((i18 - i15) + (i15 > i18 ? i5 : 0)) << 1;
            int iMin = Math.min(i13, i14);
            int i20 = i5;
            int i21 = this.f40694;
            int i22 = i21 + iMin;
            int i23 = i13;
            int i24 = i14;
            if (bArr[i22 - i15] == bArr[i22]) {
                int iM19545 = C7295.m19544(bArr, i21, i15, iMin + 1, iM25402);
                if (iM19545 > i9) {
                    int i25 = c2065.f6889;
                    iArr3[i25] = iM19545;
                    iArr2[i25] = i15 - 1;
                    c2065.f6889 = i25 + 1;
                    if (iM19545 >= i3) {
                        iArr[i10] = iArr[i19];
                        iArr[i11] = iArr[i19 + 1];
                        return c2065;
                    }
                    i9 = iM19545;
                    iMin = i9;
                } else {
                    iMin = iM19545;
                }
            }
            int i26 = this.f40694 + iMin;
            if ((bArr[i26 - i15] & 255) < (bArr[i26] & 255)) {
                iArr[i10] = i17;
                int i27 = i19 + 1;
                iM28374 = iArr[i27];
                i10 = i27;
                i14 = iMin;
                i13 = i23;
            } else {
                iArr[i11] = i17;
                iM28374 = iArr[i19];
                i11 = i19;
                i13 = iMin;
                i14 = i24;
            }
            i12 = i16;
            i5 = i20;
        }
        iArr[i11] = i;
        iArr[i10] = i;
        return c2065;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m25401(int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = this.f30461;
        int i5 = (i4 << 1) + 1;
        int i6 = i4 << 1;
        int i7 = this.f30459;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f30463 - i2;
            int i11 = i7 - 1;
            iArr = this.f30460;
            if (i7 == 0 || i10 >= (i3 = this.f30458)) {
                break;
            }
            int i12 = this.f30461;
            int i13 = i12 - i10;
            if (i10 <= i12) {
                i3 = 0;
            }
            int i14 = (i13 + i3) << 1;
            int iMin = Math.min(i8, i9);
            int i15 = this.f40694;
            byte[] bArr = this.f40691;
            if (bArr[(i15 + iMin) - i10] == bArr[i15 + iMin] && (iMin = C7295.m19544(bArr, i15, i10, iMin + 1, i)) == i) {
                iArr[i6] = iArr[i14];
                iArr[i5] = iArr[i14 + 1];
                return;
            }
            int i16 = this.f40694;
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

    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ᩳ */
    public final void mo16474(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int iM25402 = m25402();
            int i3 = this.f40701;
            if (iM25402 < i3) {
                if (iM25402 == 0) {
                }
                i = i2;
            } else {
                iM25402 = i3;
            }
            byte[] bArr = this.f40691;
            int i4 = this.f40694;
            C11529 c11529 = this.f30462;
            c11529.m28370(i4, bArr);
            int iM28374 = c11529.m28374();
            c11529.m28373(this.f30463);
            m25401(iM25402, iM28374);
            i = i2;
        }
    }
}
