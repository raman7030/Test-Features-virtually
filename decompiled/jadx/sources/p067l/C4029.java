package p067l;

/* JADX INFO: renamed from: l.֫ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4029 {

    /* JADX INFO: renamed from: ֫ */
    public int f8808;

    /* JADX INFO: renamed from: ۜ */
    public final int f8810;

    /* JADX INFO: renamed from: ۡ */
    public final int f8811;

    /* JADX INFO: renamed from: ۢ */
    public final int f8812;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f8813;

    /* JADX INFO: renamed from: ܺ */
    public final C19452 f8815;

    /* JADX INFO: renamed from: ܽ */
    public final C16611 f8816;

    /* JADX INFO: renamed from: ܿ */
    public final int f8817;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f8818;

    /* JADX INFO: renamed from: ᩷ */
    public final int f8819;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f8820;

    /* JADX INFO: renamed from: ܳ */
    public int f8814 = 1;

    /* JADX INFO: renamed from: ۖ */
    public boolean f8809 = true;

    public C4029(C19452 c19452, C16611 c16611, int i, int i2, int i3, int i4, int[] iArr) {
        this.f8815 = c19452;
        C12826.requireNonNull(c16611, "changes");
        this.f8816 = c16611;
        C12826.requireNonNull(iArr, "activeRelativeNodes");
        this.f8813 = iArr;
        if (c16611.m37663() != c19452.f59268 || i < 1 || i > c19452.f59266 || i2 < 0 || ((long) i) + ((long) i2) > c19452.f59266 || i3 < 0 || i3 > c16611.m37663() || i4 < 0 || i4 > c16611.m37665()) {
            throw new IllegalArgumentException("Syntax context checkpoint boundaries differ");
        }
        this.f8811 = i;
        this.f8817 = i2;
        this.f8810 = i + i2;
        this.f8812 = i3;
        this.f8819 = i4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m8036(C16098 c16098) {
        int iM8033;
        int iM36625;
        C12826.requireNonNull(c16098, "target");
        if (this.f8818) {
            return false;
        }
        boolean z = this.f8820;
        int[] iArr = this.f8813;
        int i = this.f8819;
        int i2 = this.f8812;
        int i3 = this.f8810;
        if (!z) {
            this.f8820 = true;
            if (c16098.m36634() != this.f8816.m37665() || c16098.m36631() != 1 || m8033(i2) != i) {
                m8034();
                return true;
            }
            if (this.f8814 >= i3) {
                if (this.f8808 != iArr.length) {
                    m8034();
                    return true;
                }
                this.f8818 = true;
                return true;
            }
        } else {
            int i4 = this.f8814;
            if (i4 < i3) {
                int i5 = this.f8811;
                int i6 = i4 - i5;
                int i7 = this.f8808;
                int i8 = i7 < iArr.length ? iArr[i7] : Integer.MAX_VALUE;
                if (i8 < i6 || i8 < 0 || i8 >= this.f8817) {
                    m8034();
                    return true;
                }
                boolean z2 = i8 == i6;
                C19452 c19452 = this.f8815;
                int i9 = c19452.f59265[i4];
                if (i4 >= i5 && i9 != 0 && i9 < i5) {
                    m8034();
                } else if (z2) {
                    int i10 = this.f8808;
                    if (i9 != (i10 != 0 ? iArr[i10 - 1] + i5 : 0)) {
                        m8034();
                    } else {
                        iM8033 = m8033(c19452.f59264[i4]);
                        if (iM8033 >= 0) {
                            m8034();
                        } else {
                            m8034();
                        }
                    }
                } else {
                    iM8033 = m8033(c19452.f59264[i4]);
                    if (iM8033 >= 0 || iM8033 > i) {
                        m8034();
                    } else {
                        try {
                            if (z2) {
                                iM36625 = c16098.m36625(i9);
                            } else {
                                int i11 = c19452.f59262[i4];
                                int iM8034 = m8033(i11);
                                if (i11 > i2 || iM8034 < 0 || iM8034 > i || iM8034 - iM8033 != i11 - c19452.f59264[i4]) {
                                    m8034();
                                } else {
                                    iM36625 = iM8034;
                                }
                            }
                            if (!c16098.m36630(i4, iM8033, iM36625, i9, c19452.f59263[i4])) {
                                m8034();
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            m8034();
                        }
                    }
                }
                if (this.f8809) {
                    if (z2) {
                        this.f8808++;
                    }
                    int i12 = this.f8814 + 1;
                    this.f8814 = i12;
                    if (i12 >= i3) {
                        if (this.f8808 != iArr.length) {
                            m8034();
                        } else {
                            this.f8818 = true;
                        }
                    }
                }
            } else {
                if (this.f8808 != iArr.length) {
                    m8034();
                    return false;
                }
                this.f8818 = true;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m8033(int i) {
        C16611 c16611 = this.f8816;
        try {
            int iM37659 = c16611.m37659(i, EnumC3200.BEFORE);
            if (iM37659 == c16611.m37659(i, EnumC3200.AFTER)) {
                return iM37659;
            }
            return -1;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m8034() {
        this.f8809 = false;
        this.f8818 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8038() {
        return this.f8811;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8035() {
        return this.f8818;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m8037() {
        return this.f8809;
    }
}
