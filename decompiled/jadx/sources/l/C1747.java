package l;

/* JADX INFO: renamed from: l.֫ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6031;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f6033;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f6034;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f6035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f6036;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17975 f6038;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14986 f6039;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6040;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f6041;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6042;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f6043;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f6037 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f6032 = true;

    public C1747(C17975 c17975, C14986 c14986, int i, int i2, int i3, int i4, int[] iArr) {
        this.f6038 = c17975;
        C11003.requireNonNull(c14986, "changes");
        this.f6039 = c14986;
        C11003.requireNonNull(iArr, "activeRelativeNodes");
        this.f6036 = iArr;
        if (c14986.m35507() != c17975.f56071 || i < 1 || i > c17975.f56069 || i2 < 0 || ((long) i) + ((long) i2) > c17975.f56069 || i3 < 0 || i3 > c14986.m35507() || i4 < 0 || i4 > c14986.m35509()) {
            throw new IllegalArgumentException("Syntax context checkpoint boundaries differ");
        }
        this.f6034 = i;
        this.f6040 = i2;
        this.f6033 = i + i2;
        this.f6035 = i3;
        this.f6042 = i4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5826(C14446 c14446) {
        int iM5823;
        int iM34492;
        C11003.requireNonNull(c14446, "target");
        if (this.f6041) {
            return false;
        }
        boolean z = this.f6043;
        int[] iArr = this.f6036;
        int i = this.f6042;
        int i2 = this.f6035;
        int i3 = this.f6033;
        if (!z) {
            this.f6043 = true;
            if (c14446.m34501() != this.f6039.m35509() || c14446.m34498() != 1 || m5823(i2) != i) {
                m5824();
                return true;
            }
            if (this.f6037 >= i3) {
                if (this.f6031 != iArr.length) {
                    m5824();
                    return true;
                }
                this.f6041 = true;
                return true;
            }
        } else {
            int i4 = this.f6037;
            if (i4 < i3) {
                int i5 = this.f6034;
                int i6 = i4 - i5;
                int i7 = this.f6031;
                int i8 = i7 < iArr.length ? iArr[i7] : Integer.MAX_VALUE;
                if (i8 < i6 || i8 < 0 || i8 >= this.f6040) {
                    m5824();
                    return true;
                }
                boolean z2 = i8 == i6;
                C17975 c17975 = this.f6038;
                int i9 = c17975.f56068[i4];
                if (i4 >= i5 && i9 != 0 && i9 < i5) {
                    m5824();
                } else if (z2) {
                    int i10 = this.f6031;
                    if (i9 != (i10 != 0 ? iArr[i10 - 1] + i5 : 0)) {
                        m5824();
                    } else {
                        iM5823 = m5823(c17975.f56067[i4]);
                        if (iM5823 >= 0) {
                            m5824();
                        } else {
                            m5824();
                        }
                    }
                } else {
                    iM5823 = m5823(c17975.f56067[i4]);
                    if (iM5823 >= 0 || iM5823 > i) {
                        m5824();
                    } else {
                        try {
                            if (z2) {
                                iM34492 = c14446.m34492(i9);
                            } else {
                                int i11 = c17975.f56065[i4];
                                int iM5824 = m5823(i11);
                                if (i11 > i2 || iM5824 < 0 || iM5824 > i || iM5824 - iM5823 != i11 - c17975.f56067[i4]) {
                                    m5824();
                                } else {
                                    iM34492 = iM5824;
                                }
                            }
                            if (!c14446.m34497(i4, iM5823, iM34492, i9, c17975.f56066[i4])) {
                                m5824();
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            m5824();
                        }
                    }
                }
                if (this.f6032) {
                    if (z2) {
                        this.f6031++;
                    }
                    int i12 = this.f6037 + 1;
                    this.f6037 = i12;
                    if (i12 >= i3) {
                        if (this.f6031 != iArr.length) {
                            m5824();
                        } else {
                            this.f6041 = true;
                        }
                    }
                }
            } else {
                if (this.f6031 != iArr.length) {
                    m5824();
                    return false;
                }
                this.f6041 = true;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m5823(int i) {
        C14986 c14986 = this.f6039;
        try {
            int iM35503 = c14986.m35503(i, EnumC0875.BEFORE);
            if (iM35503 == c14986.m35503(i, EnumC0875.AFTER)) {
                return iM35503;
            }
            return -1;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m5824() {
        this.f6032 = false;
        this.f6041 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5828() {
        return this.f6034;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5825() {
        return this.f6041;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5827() {
        return this.f6032;
    }
}
