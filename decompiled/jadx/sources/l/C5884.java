package l;

/* JADX INFO: renamed from: l.ۛۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5884 extends AbstractC13644 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18067;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f18068;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f18069;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2065 f18070;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f18071;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f18072;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11529 f18073;

    public C5884(int i, int i2, int i3, int i4, int i5, C4265 c4265) {
        super(i, i2, i3, i4, c4265);
        this.f18068 = -1;
        this.f18073 = new C11529(i, c4265);
        int i6 = i + 1;
        this.f18069 = i6;
        this.f18071 = c4265.mo4957(i6, false);
        this.f18067 = i6;
        this.f18070 = new C2065(i4 - 1);
        this.f18072 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16472(C4265 c4265) {
        c4265.mo4955(this.f18071);
        this.f18073.m28371(c4265);
        c4265.mo4954(this.f40691);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m16471() {
        int iM32791 = m32791(4);
        if (iM32791 != 0) {
            int i = this.f18067 + 1;
            this.f18067 = i;
            int i2 = this.f18069;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f18073.m28369(i3);
                AbstractC13644.m32779(i2, i3, this.f18071);
                this.f18067 -= i3;
            }
            int i4 = this.f18068 + 1;
            this.f18068 = i4;
            if (i4 == i2) {
                this.f18068 = 0;
            }
        }
        return iM32791;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[DONT_INVERT, PHI: r14
      0x008c: PHI (r14v3 int) = (r14v2 int), (r14v9 int) binds: [B:22:0x007b, B:24:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2065 mo16473() {
        int iM19544;
        int i;
        int iM19545;
        C2065 c2065 = this.f18070;
        c2065.f6889 = 0;
        int[] iArr = c2065.f6890;
        int[] iArr2 = c2065.f6891;
        int iM16471 = m16471();
        int i2 = this.f40696;
        int i3 = this.f40701;
        if (iM16471 < i2) {
            if (iM16471 != 0) {
                if (i3 > iM16471) {
                    i3 = iM16471;
                }
            }
            return c2065;
        }
        iM16471 = i2;
        int i4 = this.f40694;
        C11529 c11529 = this.f18073;
        byte[] bArr = this.f40691;
        c11529.m28370(i4, bArr);
        int iM28368 = this.f18067 - c11529.m28368();
        int iM28372 = this.f18067 - c11529.m28372();
        int iM28374 = c11529.m28374();
        c11529.m28373(this.f18067);
        int i5 = this.f18068;
        int[] iArr3 = this.f18071;
        iArr3[i5] = iM28374;
        int i6 = this.f18069;
        if (iM28368 < i6) {
            int i7 = this.f40694;
            if (bArr[i7 - iM28368] == bArr[i7]) {
                iM19544 = 2;
                iArr2[0] = 2;
                iArr[0] = iM28368 - 1;
                c2065.f6889 = 1;
            } else {
                iM19544 = 0;
            }
        } else {
            iM19544 = 0;
        }
        if (iM28368 != iM28372 && iM28372 < i6) {
            int i8 = this.f40694;
            if (bArr[i8 - iM28372] == bArr[i8]) {
                int i9 = c2065.f6889;
                c2065.f6889 = i9 + 1;
                iArr[i9] = iM28372 - 1;
                iM19544 = 3;
                iM28368 = iM28372;
            }
        }
        if (c2065.f6889 > 0) {
            iM19544 = C7295.m19544(bArr, this.f40694, iM28368, iM19544, iM16471);
            iArr2[c2065.f6889 - 1] = iM19544;
            if (iM19544 < i3) {
                int i10 = iM19544 >= 3 ? iM19544 : 3;
                i = this.f18072;
                while (true) {
                    int i11 = this.f18067 - iM28374;
                    int i12 = i - 1;
                    if (i == 0 || i11 >= i6) {
                        break;
                    }
                    int i13 = this.f18068;
                    int i14 = iArr3[(i13 - i11) + (i11 > i13 ? i6 : 0)];
                    int i15 = this.f40694;
                    int i16 = i15 + i10;
                    if (bArr[i16 - i11] == bArr[i16] && bArr[i15 - i11] == bArr[i15] && (iM19545 = C7295.m19544(bArr, i15, i11, 1, iM16471)) > i10) {
                        int i17 = c2065.f6889;
                        iArr2[i17] = iM19545;
                        iArr[i17] = i11 - 1;
                        c2065.f6889 = i17 + 1;
                        if (iM19545 >= i3) {
                            break;
                        }
                        i10 = iM19545;
                    }
                    iM28374 = i14;
                    i = i12;
                }
            }
        } else {
            if (iM19544 >= 3) {
            }
            i = this.f18072;
            while (true) {
                int i18 = this.f18067 - iM28374;
                int i19 = i - 1;
                if (i == 0) {
                    break;
                }
                break;
                break;
                iM28374 = i14;
                i = i19;
            }
        }
        return c2065;
    }

    @Override // l.AbstractC13644
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo16474(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (m16471() != 0) {
                byte[] bArr = this.f40691;
                int i3 = this.f40694;
                C11529 c11529 = this.f18073;
                c11529.m28370(i3, bArr);
                this.f18071[this.f18068] = c11529.m28374();
                c11529.m28373(this.f18067);
            }
            i = i2;
        }
    }
}
