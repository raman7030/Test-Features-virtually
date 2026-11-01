package p067l;

/* JADX INFO: renamed from: l.ۛۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7960 extends AbstractC15335 {

    /* JADX INFO: renamed from: ֡ */
    public int f20922;

    /* JADX INFO: renamed from: ۖ */
    public int f20923;

    /* JADX INFO: renamed from: ۘ */
    public final int f20924;

    /* JADX INFO: renamed from: ۚ */
    public final C4331 f20925;

    /* JADX INFO: renamed from: ܺ */
    public final int[] f20926;

    /* JADX INFO: renamed from: ᩴ */
    public final int f20927;

    /* JADX INFO: renamed from: ᩵ */
    public final C13325 f20928;

    public C7960(int i, int i2, int i3, int i4, int i5, C6422 c6422) {
        super(i, i2, i3, i4, c6422);
        this.f20923 = -1;
        this.f20928 = new C13325(i, c6422);
        int i6 = i + 1;
        this.f20924 = i6;
        this.f20926 = c6422.mo7200(i6, false);
        this.f20922 = i6;
        this.f20925 = new C4331(i4 - 1);
        this.f20927 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ֫ */
    public final void mo18398(C6422 c6422) {
        c6422.mo7198(this.f20926);
        this.f20928.m30417(c6422);
        c6422.mo7197(this.f43772);
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m18397() {
        int iM34906 = m34906(4);
        if (iM34906 != 0) {
            int i = this.f20922 + 1;
            this.f20922 = i;
            int i2 = this.f20924;
            if (i == Integer.MAX_VALUE) {
                int i3 = Integer.MAX_VALUE - i2;
                this.f20928.m30415(i3);
                AbstractC15335.m34894(i2, i3, this.f20926);
                this.f20922 -= i3;
            }
            int i4 = this.f20923 + 1;
            this.f20923 = i4;
            if (i4 == i2) {
                this.f20923 = 0;
            }
        }
        return iM34906;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[DONT_INVERT, PHI: r14
      0x008c: PHI (r14v3 int) = (r14v2 int), (r14v9 int) binds: [B:22:0x007b, B:24:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ۧ */
    public final C4331 mo18399() {
        int iM21512;
        int i;
        int iM21513;
        C4331 c4331 = this.f20925;
        c4331.f9673 = 0;
        int[] iArr = c4331.f9674;
        int[] iArr2 = c4331.f9675;
        int iM18397 = m18397();
        int i2 = this.f43777;
        int i3 = this.f43782;
        if (iM18397 < i2) {
            if (iM18397 != 0) {
                if (i3 > iM18397) {
                    i3 = iM18397;
                }
            }
            return c4331;
        }
        iM18397 = i2;
        int i4 = this.f43775;
        C13325 c13325 = this.f20928;
        byte[] bArr = this.f43772;
        c13325.m30416(i4, bArr);
        int iM30414 = this.f20922 - c13325.m30414();
        int iM30418 = this.f20922 - c13325.m30418();
        int iM30420 = c13325.m30420();
        c13325.m30419(this.f20922);
        int i5 = this.f20923;
        int[] iArr3 = this.f20926;
        iArr3[i5] = iM30420;
        int i6 = this.f20924;
        if (iM30414 < i6) {
            int i7 = this.f43775;
            if (bArr[i7 - iM30414] == bArr[i7]) {
                iM21512 = 2;
                iArr2[0] = 2;
                iArr[0] = iM30414 - 1;
                c4331.f9673 = 1;
            } else {
                iM21512 = 0;
            }
        } else {
            iM21512 = 0;
        }
        if (iM30414 != iM30418 && iM30418 < i6) {
            int i8 = this.f43775;
            if (bArr[i8 - iM30418] == bArr[i8]) {
                int i9 = c4331.f9673;
                c4331.f9673 = i9 + 1;
                iArr[i9] = iM30418 - 1;
                iM21512 = 3;
                iM30414 = iM30418;
            }
        }
        if (c4331.f9673 > 0) {
            iM21512 = C9301.m21512(bArr, this.f43775, iM30414, iM21512, iM18397);
            iArr2[c4331.f9673 - 1] = iM21512;
            if (iM21512 < i3) {
                int i10 = iM21512 >= 3 ? iM21512 : 3;
                i = this.f20927;
                while (true) {
                    int i11 = this.f20922 - iM30420;
                    int i12 = i - 1;
                    if (i == 0 || i11 >= i6) {
                        break;
                    }
                    int i13 = this.f20923;
                    int i14 = iArr3[(i13 - i11) + (i11 > i13 ? i6 : 0)];
                    int i15 = this.f43775;
                    int i16 = i15 + i10;
                    if (bArr[i16 - i11] == bArr[i16] && bArr[i15 - i11] == bArr[i15] && (iM21513 = C9301.m21512(bArr, i15, i11, 1, iM18397)) > i10) {
                        int i17 = c4331.f9673;
                        iArr2[i17] = iM21513;
                        iArr[i17] = i11 - 1;
                        c4331.f9673 = i17 + 1;
                        if (iM21513 >= i3) {
                            break;
                        }
                        i10 = iM21513;
                    }
                    iM30420 = i14;
                    i = i12;
                }
            }
        } else {
            if (iM21512 >= 3) {
            }
            i = this.f20927;
            while (true) {
                int i18 = this.f20922 - iM30420;
                int i19 = i - 1;
                if (i == 0) {
                    break;
                }
                break;
                break;
                iM30420 = i14;
                i = i19;
            }
        }
        return c4331;
    }

    @Override // p067l.AbstractC15335
    /* JADX INFO: renamed from: ᩳ */
    public final void mo18400(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            if (m18397() != 0) {
                byte[] bArr = this.f43772;
                int i3 = this.f43775;
                C13325 c13325 = this.f20928;
                c13325.m30416(i3, bArr);
                this.f20926[this.f20923] = c13325.m30420();
                c13325.m30419(this.f20922);
            }
            i = i2;
        }
    }
}
