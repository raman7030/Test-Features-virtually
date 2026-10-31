package l;

/* JADX INFO: renamed from: l.۟᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7722 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23861;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10920 f23862;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23863;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f23864;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f23865;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f23866;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23867;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f23868;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23869;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f23870;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15068[] f23871;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f23872;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14071 f23873;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23874;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f23875;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f23876;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f23877;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f23879;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23880;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23881;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C17975 f23883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23884;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f23885;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f23886;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f23887;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23888;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23878 = 1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23882 = -1;

    public C7722(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, C15068[] c15068Arr, boolean z) {
        this.f23868 = i4;
        int i5 = i3 - i2;
        this.f23867 = i5;
        this.f23876 = i2;
        this.f23886 = iArr;
        this.f23872 = iArr2;
        this.f23864 = iArr3;
        this.f23871 = c15068Arr;
        boolean z2 = (i2 == 0 && i3 == i) ? false : true;
        this.f23865 = z2;
        if (z) {
            this.f23866 = 16;
        } else {
            if (!z2) {
                this.f23866 = 1;
                return;
            }
            iArr[0] = 0;
            iArr2[0] = i5;
            this.f23866 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02cc A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20675() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f23866;
        int i6 = this.f23867;
        int[] iArr = this.f23864;
        int[] iArr2 = this.f23886;
        int[] iArr3 = this.f23872;
        int i7 = this.f23868;
        switch (i5) {
            case 0:
                int i8 = this.f23878;
                if (i8 < i7) {
                    int i9 = iArr2[i8];
                    int i10 = this.f23876;
                    iArr2[i8] = Math.max(i9, i10) - i10;
                    int i11 = this.f23878;
                    iArr3[i11] = Math.min(iArr3[i11], i6 + i10) - i10;
                    this.f23878++;
                } else {
                    this.f23878 = 1;
                    this.f23863 = 0;
                    this.f23888 = 0;
                    this.f23874 = 0;
                    this.f23861 = 0;
                    this.f23866 = 1;
                }
                break;
            case 1:
                int i12 = this.f23878;
                if (i12 >= i7) {
                    this.f23866 = 2;
                } else {
                    int i13 = iArr[i12];
                    int i14 = this.f23863;
                    if (i14 == i13) {
                        int i15 = iArr2[i12];
                        int i16 = this.f23888;
                        if (i15 < i16) {
                            m20674();
                        } else {
                            if (i15 > i16) {
                                this.f23861 = C17975.m41996(this.f23861);
                            }
                            int i17 = this.f23878;
                            this.f23888 = iArr2[i17];
                            this.f23878 = i17 + 1;
                            this.f23863 = i17;
                        }
                    } else if (i14 == 0 || (i = iArr3[i14]) < (i2 = this.f23888)) {
                        m20674();
                    } else {
                        if (i > i2) {
                            this.f23861 = C17975.m41996(this.f23861);
                        }
                        int i18 = this.f23863;
                        this.f23888 = iArr3[i18];
                        this.f23863 = iArr[i18];
                    }
                }
                break;
            case 2:
                int i19 = this.f23863;
                if (i19 < 0) {
                    if (this.f23888 == i6) {
                        this.f23866 = 3;
                    } else {
                        m20674();
                    }
                } else {
                    int i20 = iArr3[i19];
                    int i21 = this.f23888;
                    if (i20 < i21) {
                        m20674();
                    } else {
                        if (i20 > i21) {
                            this.f23861 = C17975.m41996(this.f23861);
                        }
                        int i22 = this.f23863;
                        this.f23888 = iArr3[i22];
                        this.f23863 = iArr[i22];
                    }
                }
                break;
            case 3:
                int i23 = this.f23861;
                if (i23 == 0) {
                    this.f23879 = C17975.f56061;
                } else if (i7 == 1 && i23 == 1) {
                    this.f23879 = C17975.f56063;
                } else {
                    this.f23879 = new long[i23];
                }
                this.f23878 = 1;
                this.f23863 = 0;
                this.f23888 = 0;
                this.f23874 = 0;
                this.f23866 = 4;
                break;
            case 4:
                int i24 = this.f23878;
                if (i24 >= i7) {
                    this.f23866 = 5;
                } else {
                    int i25 = iArr[i24];
                    int i26 = this.f23863;
                    if (i26 != i25) {
                        int i27 = iArr3[i26];
                        int i28 = this.f23888;
                        if (i27 > i28) {
                            long[] jArr = this.f23879;
                            int i29 = this.f23874;
                            this.f23874 = i29 + 1;
                            jArr[i29] = C17975.m42002(i28, i26);
                        }
                        int i30 = this.f23863;
                        this.f23888 = iArr3[i30];
                        this.f23863 = iArr[i30];
                    } else {
                        int i31 = iArr2[i24];
                        int i32 = this.f23888;
                        if (i31 > i32) {
                            long[] jArr2 = this.f23879;
                            int i33 = this.f23874;
                            this.f23874 = i33 + 1;
                            jArr2[i33] = C17975.m42002(i32, i26);
                        }
                        int i34 = this.f23878;
                        this.f23888 = iArr2[i34];
                        this.f23878 = i34 + 1;
                        this.f23863 = i34;
                    }
                }
                break;
            case 5:
                int i35 = this.f23863;
                if (i35 >= 0) {
                    int i36 = iArr3[i35];
                    int i37 = this.f23888;
                    if (i36 > i37) {
                        long[] jArr3 = this.f23879;
                        int i38 = this.f23874;
                        this.f23874 = i38 + 1;
                        jArr3[i38] = C17975.m42002(i37, i35);
                    }
                    int i39 = this.f23863;
                    this.f23888 = iArr3[i39];
                    this.f23863 = iArr[i39];
                } else {
                    if (this.f23874 != this.f23861 || this.f23888 != i6) {
                        throw new IllegalStateException("Ordered syntax context run count changed");
                    }
                    m20673();
                }
                break;
            case 6:
                this.f23877 = new int[i7];
                this.f23866 = 7;
                break;
            case 7:
                this.f23885 = new int[i7];
                this.f23878 = 0;
                this.f23866 = 8;
                break;
            case 8:
                int i40 = this.f23878;
                if (i40 >= i7) {
                    this.f23862 = new C10920(this.f23877, iArr2);
                    this.f23866 = 9;
                } else {
                    int[] iArr4 = this.f23877;
                    this.f23885[i40] = i40;
                    iArr4[i40] = i40;
                    this.f23878 = i40 + 1;
                }
                break;
            case 9:
                if (this.f23862.m27228()) {
                    this.f23862.m27227(this.f23885, iArr3);
                    this.f23866 = 10;
                }
                break;
            case 10:
                if (this.f23862.m27228()) {
                    this.f23862 = null;
                    this.f23873 = new C14071(i7);
                    this.f23869 = 0;
                    this.f23870 = 0;
                    this.f23884 = 0;
                    this.f23887 = 0;
                    this.f23882 = -1;
                    this.f23861 = 0;
                    this.f23875 = false;
                    this.f23866 = 11;
                }
                break;
            case 11:
                if (m20672()) {
                    this.f23866 = 12;
                }
                break;
            case 12:
                int i41 = this.f23861;
                this.f23879 = i41 == 0 ? C17975.f56061 : new long[i41];
                this.f23874 = this.f23861;
                this.f23861 = 0;
                this.f23880 = 0;
                this.f23881 = 0;
                this.f23866 = 13;
                break;
            case 13:
                if (this.f23881 < this.f23873.f42496.length) {
                    long[][] jArr4 = this.f23873.f42496;
                    int i42 = this.f23881;
                    long[] jArr5 = jArr4[i42];
                    int i43 = this.f23880;
                    if (i43 >= jArr5.length) {
                        this.f23881 = i42 + 1;
                        this.f23880 = 0;
                    } else {
                        this.f23880 = i43 + 1;
                        jArr5[i43] = 0;
                    }
                } else {
                    this.f23869 = 0;
                    this.f23870 = 0;
                    this.f23884 = 0;
                    this.f23887 = 0;
                    this.f23882 = -1;
                    this.f23861 = 0;
                    this.f23875 = true;
                    this.f23866 = 14;
                }
                break;
            case 14:
                if (m20672()) {
                    int i44 = this.f23861;
                    if (i44 != this.f23874 || (i44 != 0 && ((int) (this.f23879[0] >>> 32)) != 0)) {
                        throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                    }
                    m20673();
                }
                break;
            case 15:
                return true;
            case 16:
                int i45 = this.f23878;
                if (i45 >= i7) {
                    this.f23878 = 1;
                    if (this.f23865) {
                        iArr2[0] = 0;
                        iArr3[0] = i6;
                        this.f23866 = 0;
                    } else {
                        this.f23866 = 1;
                    }
                } else {
                    int i46 = iArr[i45];
                    if (i46 < 0 || i46 >= i45 || (i3 = iArr2[i45]) < iArr2[i46] || (i4 = iArr3[i45]) <= i3 || i4 > iArr3[i46]) {
                        throw new IllegalArgumentException("Invalid syntax context node: " + this.f23878);
                    }
                    this.f23878 = i45 + 1;
                }
                break;
            default:
                throw new IllegalStateException("Invalid syntax context build phase");
        }
        if (this.f23866 == 15) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17975 m20676() {
        C17975 c17975 = this.f23883;
        if (c17975 != null) {
            return c17975;
        }
        throw new IllegalStateException("Syntax context index is not complete");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m20674() {
        this.f23885 = null;
        this.f23877 = null;
        this.f23879 = null;
        this.f23874 = 0;
        this.f23861 = 0;
        this.f23866 = 6;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20672() {
        int i = this.f23887;
        int[] iArr = this.f23872;
        int[] iArr2 = this.f23886;
        long j = C13132.FOREVER_NS;
        int i2 = this.f23868;
        if (i == 0) {
            int i3 = this.f23870;
            if (i3 < i2 || this.f23869 < i2) {
                long j2 = i3 < i2 ? iArr2[this.f23877[i3]] : Long.MAX_VALUE;
                int i4 = this.f23869;
                if (i4 < i2) {
                    j = iArr[this.f23885[i4]];
                }
                this.f23884 = (int) Math.min(j2, j);
                this.f23887 = 1;
                return false;
            }
        } else {
            if (i == 1) {
                int i5 = this.f23869;
                if (i5 < i2) {
                    int i6 = this.f23885[i5];
                    if (iArr[i6] == this.f23884) {
                        C14071 c14071 = this.f23873;
                        this.f23869 = i5 + 1;
                        c14071.m33664(i6);
                        return false;
                    }
                }
                this.f23887 = 2;
                return false;
            }
            if (i == 2) {
                int i7 = this.f23870;
                if (i7 < i2) {
                    int i8 = this.f23877[i7];
                    if (iArr2[i8] == this.f23884) {
                        C14071 c14072 = this.f23873;
                        this.f23870 = i7 + 1;
                        c14072.m33662(i8);
                        return false;
                    }
                }
                this.f23887 = 3;
                return false;
            }
            if (i == 3) {
                int i9 = this.f23870;
                if (i9 < i2 || this.f23869 < i2) {
                    long j3 = i9 < i2 ? iArr2[this.f23877[i9]] : Long.MAX_VALUE;
                    int i10 = this.f23869;
                    if (i10 < i2) {
                        j = iArr[this.f23885[i10]];
                    }
                    if (Math.min(j3, j) > this.f23884) {
                        int iM33663 = this.f23873.m33663();
                        if (iM33663 < 0) {
                            throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                        }
                        if (iM33663 != this.f23882) {
                            if (this.f23875) {
                                this.f23879[this.f23861] = C17975.m42002(this.f23884, iM33663);
                            }
                            this.f23861 = C17975.m41996(this.f23861);
                            this.f23882 = iM33663;
                        }
                    }
                    this.f23887 = 0;
                    return false;
                }
            } else {
                throw new IllegalStateException("Invalid syntax context sweep phase");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20673() {
        this.f23883 = new C17975(this.f23867, this.f23868, this.f23886, this.f23872, this.f23864, this.f23871, this.f23879);
        this.f23885 = null;
        this.f23877 = null;
        this.f23862 = null;
        this.f23873 = null;
        this.f23866 = 15;
    }
}
