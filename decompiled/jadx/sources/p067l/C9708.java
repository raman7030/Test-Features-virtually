package p067l;

/* JADX INFO: renamed from: l.۟᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9708 {

    /* JADX INFO: renamed from: ֡ */
    public int f26774;

    /* JADX INFO: renamed from: ֨ */
    public C12747 f26775;

    /* JADX INFO: renamed from: ֫ */
    public int f26776;

    /* JADX INFO: renamed from: ۖ */
    public final int[] f26777;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f26778;

    /* JADX INFO: renamed from: ۘ */
    public int f26779;

    /* JADX INFO: renamed from: ۙ */
    public final int f26780;

    /* JADX INFO: renamed from: ۚ */
    public final int f26781;

    /* JADX INFO: renamed from: ۜ */
    public int f26782;

    /* JADX INFO: renamed from: ۠ */
    public int f26783;

    /* JADX INFO: renamed from: ۡ */
    public final C16689[] f26784;

    /* JADX INFO: renamed from: ۢ */
    public final int[] f26785;

    /* JADX INFO: renamed from: ۧ */
    public C15742 f26786;

    /* JADX INFO: renamed from: ۫ */
    public int f26787;

    /* JADX INFO: renamed from: ۬ */
    public boolean f26788;

    /* JADX INFO: renamed from: ܳ */
    public final int f26789;

    /* JADX INFO: renamed from: ܶ */
    public int[] f26790;

    /* JADX INFO: renamed from: ܽ */
    public long[] f26792;

    /* JADX INFO: renamed from: ܿ */
    public int f26793;

    /* JADX INFO: renamed from: ᩳ */
    public int f26794;

    /* JADX INFO: renamed from: ᩵ */
    public C19452 f26796;

    /* JADX INFO: renamed from: ᩶ */
    public int f26797;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f26798;

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f26799;

    /* JADX INFO: renamed from: ᩹ */
    public int f26800;

    /* JADX INFO: renamed from: ᩻ */
    public int f26801;

    /* JADX INFO: renamed from: ܺ */
    public int f26791 = 1;

    /* JADX INFO: renamed from: ᩴ */
    public int f26795 = -1;

    public C9708(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, C16689[] c16689Arr, boolean z) {
        this.f26781 = i4;
        int i5 = i3 - i2;
        this.f26780 = i5;
        this.f26789 = i2;
        this.f26799 = iArr;
        this.f26785 = iArr2;
        this.f26777 = iArr3;
        this.f26784 = c16689Arr;
        boolean z2 = (i2 == 0 && i3 == i) ? false : true;
        this.f26778 = z2;
        if (z) {
            this.f26779 = 16;
        } else {
            if (!z2) {
                this.f26779 = 1;
                return;
            }
            iArr[0] = 0;
            iArr2[0] = i5;
            this.f26779 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02cc A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m22655() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f26779;
        int i6 = this.f26780;
        int[] iArr = this.f26777;
        int[] iArr2 = this.f26799;
        int[] iArr3 = this.f26785;
        int i7 = this.f26781;
        switch (i5) {
            case 0:
                int i8 = this.f26791;
                if (i8 < i7) {
                    int i9 = iArr2[i8];
                    int i10 = this.f26789;
                    iArr2[i8] = Math.max(i9, i10) - i10;
                    int i11 = this.f26791;
                    iArr3[i11] = Math.min(iArr3[i11], i6 + i10) - i10;
                    this.f26791++;
                } else {
                    this.f26791 = 1;
                    this.f26776 = 0;
                    this.f26801 = 0;
                    this.f26787 = 0;
                    this.f26774 = 0;
                    this.f26779 = 1;
                }
                break;
            case 1:
                int i12 = this.f26791;
                if (i12 >= i7) {
                    this.f26779 = 2;
                } else {
                    int i13 = iArr[i12];
                    int i14 = this.f26776;
                    if (i14 == i13) {
                        int i15 = iArr2[i12];
                        int i16 = this.f26801;
                        if (i15 < i16) {
                            m22654();
                        } else {
                            if (i15 > i16) {
                                this.f26774 = C19452.m44245(this.f26774);
                            }
                            int i17 = this.f26791;
                            this.f26801 = iArr2[i17];
                            this.f26791 = i17 + 1;
                            this.f26776 = i17;
                        }
                    } else if (i14 == 0 || (i = iArr3[i14]) < (i2 = this.f26801)) {
                        m22654();
                    } else {
                        if (i > i2) {
                            this.f26774 = C19452.m44245(this.f26774);
                        }
                        int i18 = this.f26776;
                        this.f26801 = iArr3[i18];
                        this.f26776 = iArr[i18];
                    }
                }
                break;
            case 2:
                int i19 = this.f26776;
                if (i19 < 0) {
                    if (this.f26801 == i6) {
                        this.f26779 = 3;
                    } else {
                        m22654();
                    }
                } else {
                    int i20 = iArr3[i19];
                    int i21 = this.f26801;
                    if (i20 < i21) {
                        m22654();
                    } else {
                        if (i20 > i21) {
                            this.f26774 = C19452.m44245(this.f26774);
                        }
                        int i22 = this.f26776;
                        this.f26801 = iArr3[i22];
                        this.f26776 = iArr[i22];
                    }
                }
                break;
            case 3:
                int i23 = this.f26774;
                if (i23 == 0) {
                    this.f26792 = C19452.f59258;
                } else if (i7 == 1 && i23 == 1) {
                    this.f26792 = C19452.f59260;
                } else {
                    this.f26792 = new long[i23];
                }
                this.f26791 = 1;
                this.f26776 = 0;
                this.f26801 = 0;
                this.f26787 = 0;
                this.f26779 = 4;
                break;
            case 4:
                int i24 = this.f26791;
                if (i24 >= i7) {
                    this.f26779 = 5;
                } else {
                    int i25 = iArr[i24];
                    int i26 = this.f26776;
                    if (i26 != i25) {
                        int i27 = iArr3[i26];
                        int i28 = this.f26801;
                        if (i27 > i28) {
                            long[] jArr = this.f26792;
                            int i29 = this.f26787;
                            this.f26787 = i29 + 1;
                            jArr[i29] = C19452.m44251(i28, i26);
                        }
                        int i30 = this.f26776;
                        this.f26801 = iArr3[i30];
                        this.f26776 = iArr[i30];
                    } else {
                        int i31 = iArr2[i24];
                        int i32 = this.f26801;
                        if (i31 > i32) {
                            long[] jArr2 = this.f26792;
                            int i33 = this.f26787;
                            this.f26787 = i33 + 1;
                            jArr2[i33] = C19452.m44251(i32, i26);
                        }
                        int i34 = this.f26791;
                        this.f26801 = iArr2[i34];
                        this.f26791 = i34 + 1;
                        this.f26776 = i34;
                    }
                }
                break;
            case 5:
                int i35 = this.f26776;
                if (i35 >= 0) {
                    int i36 = iArr3[i35];
                    int i37 = this.f26801;
                    if (i36 > i37) {
                        long[] jArr3 = this.f26792;
                        int i38 = this.f26787;
                        this.f26787 = i38 + 1;
                        jArr3[i38] = C19452.m44251(i37, i35);
                    }
                    int i39 = this.f26776;
                    this.f26801 = iArr3[i39];
                    this.f26776 = iArr[i39];
                } else {
                    if (this.f26787 != this.f26774 || this.f26801 != i6) {
                        throw new IllegalStateException("Ordered syntax context run count changed");
                    }
                    m22653();
                }
                break;
            case 6:
                this.f26790 = new int[i7];
                this.f26779 = 7;
                break;
            case 7:
                this.f26798 = new int[i7];
                this.f26791 = 0;
                this.f26779 = 8;
                break;
            case 8:
                int i40 = this.f26791;
                if (i40 >= i7) {
                    this.f26775 = new C12747(this.f26790, iArr2);
                    this.f26779 = 9;
                } else {
                    int[] iArr4 = this.f26790;
                    this.f26798[i40] = i40;
                    iArr4[i40] = i40;
                    this.f26791 = i40 + 1;
                }
                break;
            case 9:
                if (this.f26775.m29273()) {
                    this.f26775.m29272(this.f26798, iArr3);
                    this.f26779 = 10;
                }
                break;
            case 10:
                if (this.f26775.m29273()) {
                    this.f26775 = null;
                    this.f26786 = new C15742(i7);
                    this.f26782 = 0;
                    this.f26783 = 0;
                    this.f26797 = 0;
                    this.f26800 = 0;
                    this.f26795 = -1;
                    this.f26774 = 0;
                    this.f26788 = false;
                    this.f26779 = 11;
                }
                break;
            case 11:
                if (m22652()) {
                    this.f26779 = 12;
                }
                break;
            case 12:
                int i41 = this.f26774;
                this.f26792 = i41 == 0 ? C19452.f59258 : new long[i41];
                this.f26787 = this.f26774;
                this.f26774 = 0;
                this.f26793 = 0;
                this.f26794 = 0;
                this.f26779 = 13;
                break;
            case 13:
                if (this.f26794 < this.f26786.f45582.length) {
                    long[][] jArr4 = this.f26786.f45582;
                    int i42 = this.f26794;
                    long[] jArr5 = jArr4[i42];
                    int i43 = this.f26793;
                    if (i43 >= jArr5.length) {
                        this.f26794 = i42 + 1;
                        this.f26793 = 0;
                    } else {
                        this.f26793 = i43 + 1;
                        jArr5[i43] = 0;
                    }
                } else {
                    this.f26782 = 0;
                    this.f26783 = 0;
                    this.f26797 = 0;
                    this.f26800 = 0;
                    this.f26795 = -1;
                    this.f26774 = 0;
                    this.f26788 = true;
                    this.f26779 = 14;
                }
                break;
            case 14:
                if (m22652()) {
                    int i44 = this.f26774;
                    if (i44 != this.f26787 || (i44 != 0 && ((int) (this.f26792[0] >>> 32)) != 0)) {
                        throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                    }
                    m22653();
                }
                break;
            case 15:
                return true;
            case 16:
                int i45 = this.f26791;
                if (i45 >= i7) {
                    this.f26791 = 1;
                    if (this.f26778) {
                        iArr2[0] = 0;
                        iArr3[0] = i6;
                        this.f26779 = 0;
                    } else {
                        this.f26779 = 1;
                    }
                } else {
                    int i46 = iArr[i45];
                    if (i46 < 0 || i46 >= i45 || (i3 = iArr2[i45]) < iArr2[i46] || (i4 = iArr3[i45]) <= i3 || i4 > iArr3[i46]) {
                        throw new IllegalArgumentException("Invalid syntax context node: " + this.f26791);
                    }
                    this.f26791 = i45 + 1;
                }
                break;
            default:
                throw new IllegalStateException("Invalid syntax context build phase");
        }
        if (this.f26779 == 15) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19452 m22656() {
        C19452 c19452 = this.f26796;
        if (c19452 != null) {
            return c19452;
        }
        throw new IllegalStateException("Syntax context index is not complete");
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m22654() {
        this.f26798 = null;
        this.f26790 = null;
        this.f26792 = null;
        this.f26787 = 0;
        this.f26774 = 0;
        this.f26779 = 6;
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m22652() {
        int i = this.f26800;
        int[] iArr = this.f26785;
        int[] iArr2 = this.f26799;
        long j = C14849.FOREVER_NS;
        int i2 = this.f26781;
        if (i == 0) {
            int i3 = this.f26783;
            if (i3 < i2 || this.f26782 < i2) {
                long j2 = i3 < i2 ? iArr2[this.f26790[i3]] : Long.MAX_VALUE;
                int i4 = this.f26782;
                if (i4 < i2) {
                    j = iArr[this.f26798[i4]];
                }
                this.f26797 = (int) Math.min(j2, j);
                this.f26800 = 1;
                return false;
            }
        } else {
            if (i == 1) {
                int i5 = this.f26782;
                if (i5 < i2) {
                    int i6 = this.f26798[i5];
                    if (iArr[i6] == this.f26797) {
                        C15742 c15742 = this.f26786;
                        this.f26782 = i5 + 1;
                        c15742.m35789(i6);
                        return false;
                    }
                }
                this.f26800 = 2;
                return false;
            }
            if (i == 2) {
                int i7 = this.f26783;
                if (i7 < i2) {
                    int i8 = this.f26790[i7];
                    if (iArr2[i8] == this.f26797) {
                        C15742 c15743 = this.f26786;
                        this.f26783 = i7 + 1;
                        c15743.m35787(i8);
                        return false;
                    }
                }
                this.f26800 = 3;
                return false;
            }
            if (i == 3) {
                int i9 = this.f26783;
                if (i9 < i2 || this.f26782 < i2) {
                    long j3 = i9 < i2 ? iArr2[this.f26790[i9]] : Long.MAX_VALUE;
                    int i10 = this.f26782;
                    if (i10 < i2) {
                        j = iArr[this.f26798[i10]];
                    }
                    if (Math.min(j3, j) > this.f26797) {
                        int iM35788 = this.f26786.m35788();
                        if (iM35788 < 0) {
                            throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                        }
                        if (iM35788 != this.f26795) {
                            if (this.f26788) {
                                this.f26792[this.f26774] = C19452.m44251(this.f26797, iM35788);
                            }
                            this.f26774 = C19452.m44245(this.f26774);
                            this.f26795 = iM35788;
                        }
                    }
                    this.f26800 = 0;
                    return false;
                }
            } else {
                throw new IllegalStateException("Invalid syntax context sweep phase");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m22653() {
        this.f26796 = new C19452(this.f26780, this.f26781, this.f26799, this.f26785, this.f26777, this.f26784, this.f26792);
        this.f26798 = null;
        this.f26790 = null;
        this.f26775 = null;
        this.f26786 = null;
        this.f26779 = 15;
    }
}
