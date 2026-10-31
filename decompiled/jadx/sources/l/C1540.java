package l;

/* JADX INFO: renamed from: l.֫ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes2.dex */
public final class C1540 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f5427;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22043 f5428;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5429;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f5430 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f5431;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f5432;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f5433;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C22043 f5434;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f5435;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C19927 f5436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2993 f5437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22043 f5438;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f5439;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f5440;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22043 f5441;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f5442;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22043 f5443;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22043 f5444;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f5445;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC13924 f5446;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f5447;

    public C1540(int i, int i2, boolean z, boolean z2) {
        this.f5433 = i;
        this.f5429 = i2;
        this.f5445 = z;
        this.f5432 = z2;
        this.f5438 = new C22043(i);
        this.f5428 = z ? null : new C22043(i);
        this.f5434 = z ? null : new C22043(i);
        this.f5439 = i2;
        this.f5444 = z2 ? new C22043(i) : null;
        this.f5437 = z ? new C2993(i) : null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5276(C19927 c19927) {
        C22043 c22043 = this.f5428;
        if (c22043 == null || this.f5429 == 0) {
            return;
        }
        if (c19927 == null) {
            c22043.m49605();
        } else {
            c22043.m49601(c19927);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19927 m5277(int i) {
        C22043 c22043 = this.f5428;
        if (c22043 == null) {
            throw new IllegalStateException("Not a window recorder");
        }
        m5272();
        c22043.m49602(this.f5438);
        c22043.m49600(0, i);
        c22043.m49599(0);
        c22043.m49599(i);
        return c22043.m49603();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m5282() {
        return this.f5439;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19927 m5279(int i) {
        m5272();
        int i2 = this.f5439;
        C22043 c22043 = this.f5434;
        c22043.m49600(i2, i);
        c22043.m49599(this.f5439);
        c22043.m49599(i);
        C19927 c19927M49603 = c22043.m49603();
        c22043.m49604(this.f5433);
        this.f5439 = i;
        return c19927M49603;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5266(InterfaceC13924 interfaceC13924) {
        if (!this.f5432) {
            if (interfaceC13924 != null) {
                throw new IllegalStateException("End-search proofs are disabled");
            }
            return;
        }
        boolean z = this.f5447;
        if ((z || this.f5427) && interfaceC13924 != this.f5446) {
            throw new IllegalStateException("Cannot change syntax observation sink in the current state");
        }
        if (z || this.f5427 || interfaceC13924 == this.f5446) {
            return;
        }
        m5272();
        this.f5446 = interfaceC13924;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5273() {
        return this.f5429;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5271(C19927 c19927) {
        C11003.requireNonNull(c19927, "dependency");
        if (this.f5447 || this.f5427) {
            throw new IllegalStateException("Cannot resume a syntax checkpoint in the current state");
        }
        if (c19927.m45903() != this.f5433) {
            throw new IllegalArgumentException("Checkpoint dependency length differs");
        }
        this.f5438.m49601(c19927);
        C22043 c22043 = this.f5428;
        if (c22043 != null) {
            c22043.m49605();
        }
        C22043 c22044 = this.f5434;
        if (c22044 != null) {
            c22044.m49605();
        }
        C22043 c22045 = this.f5444;
        if (c22045 != null) {
            c22045.m49601(c19927);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5280() {
        if (this.f5447 || this.f5427) {
            throw new IllegalStateException("Cannot observe EOF in the current replay state");
        }
        this.f5438.m49598();
        C22043 c22043 = this.f5434;
        if (c22043 != null) {
            c22043.m49598();
        }
        C22043 c22044 = this.f5444;
        if (c22044 == null) {
            return;
        }
        InterfaceC13924 interfaceC13924 = this.f5446;
        if (interfaceC13924 == null) {
            c22044.m49598();
        } else {
            ((C15857) interfaceC13924).m37548();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5269(int i) {
        if (this.f5447 || this.f5427 || i < 0 || i > this.f5433) {
            throw new IllegalStateException("Cannot observe syntax input boundary");
        }
        this.f5438.m49599(i);
        C22043 c22043 = this.f5434;
        if (c22043 != null) {
            c22043.m49599(i);
        }
        C22043 c22044 = this.f5444;
        if (c22044 == null) {
            return;
        }
        InterfaceC13924 interfaceC13924 = this.f5446;
        if (interfaceC13924 == null) {
            c22044.m49599(i);
        } else {
            ((C15857) interfaceC13924).m37553(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5267(C19927 c19927) {
        if (this.f5447 || this.f5427 || c19927.m45903() != this.f5433) {
            throw new IllegalStateException("Cannot commit syntax end-search dependency");
        }
        C22043 c22043 = this.f5444;
        if (c22043 == null) {
            throw new IllegalStateException("End-search proofs are disabled");
        }
        c22043.m49601(c19927);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5275(int i, int i2, C19927 c19927) {
        int i3 = this.f5429;
        if (i >= i3 || i2 > i3) {
            throw new IllegalArgumentException("Reused dependency crosses replay entry");
        }
        m5261(i, i2, c19927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5265(int i, boolean z) {
        if (z || i - this.f5429 >= 4096) {
            if (z) {
                i = this.f5433;
            }
            m5260(i, z);
            if (z) {
                m5259();
                this.f5447 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19927 m5262(int i, int i2, C19927 c19927) {
        int i3;
        if (this.f5447 || this.f5427 || i < this.f5429 || i2 < i || i2 >= (i3 = this.f5433)) {
            throw new IllegalArgumentException("Invalid syntax checkpoint dependency");
        }
        m5272();
        C22043 c22043 = this.f5441;
        if (c22043 == null) {
            this.f5441 = new C22043(i3);
        } else {
            c22043.m49604(i3);
        }
        C22043 c22044 = this.f5441;
        C22043 c22045 = this.f5444;
        if (c22045 == null) {
            c22045 = this.f5438;
        }
        c22044.m49602(c22045);
        if (c19927 != null) {
            this.f5441.m49601(c19927);
        }
        C22043 c22046 = this.f5441;
        c22046.m49600(this.f5429, i2);
        c22046.m49599(this.f5429);
        c22046.m49599(i2);
        return c22046.m49603();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5264(int i) {
        int i2;
        if (this.f5447 || this.f5427 || i < (i2 = this.f5429) || i >= this.f5433) {
            throw new IllegalArgumentException("Invalid syntax convergence entry");
        }
        if (i != i2) {
            m5260(i, false);
        }
        this.f5427 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19927 m5274(int i) {
        int i2;
        if (this.f5447 || this.f5427 || i <= this.f5429 || i > (i2 = this.f5433)) {
            throw new IllegalArgumentException("Invalid speculative dependency range");
        }
        m5272();
        int i3 = this.f5429;
        C22043 c22043 = this.f5438;
        c22043.m49600(i3, i);
        c22043.m49599(this.f5429);
        c22043.m49599(i);
        C19927 c19927M49603 = c22043.m49603();
        c22043.m49604(i2);
        C22043 c22044 = this.f5444;
        if (c22044 != null) {
            c22044.m49604(i2);
        }
        this.f5429 = i;
        return c19927M49603;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5270(int i, int i2, C19927 c19927) {
        int i3;
        if (this.f5447 || this.f5427 || i < this.f5429 || i2 <= i || i2 > (i3 = this.f5433) || c19927.m45903() != i3) {
            throw new IllegalArgumentException("Invalid confirmed syntax fragment");
        }
        if (i != this.f5429) {
            m5260(i, false);
        }
        m5261(i, i2, c19927);
        C22043 c22043 = this.f5428;
        if (c22043 != null) {
            c22043.m49601(c19927);
        }
        C22043 c22044 = this.f5434;
        if (c22044 != null) {
            c22044.m49601(c19927);
        }
        this.f5429 = i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5281(int i, int i2, C19927 c19927) {
        if (!this.f5427 || i < this.f5429) {
            throw new IllegalArgumentException("Reused dependency precedes convergence entry");
        }
        m5261(i, i2, c19927);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5278() {
        if (!this.f5427 || this.f5447) {
            throw new IllegalStateException("Syntax suffix is not being reused");
        }
        m5259();
        this.f5447 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5260(int i, boolean z) {
        m5272();
        int i2 = this.f5429;
        C22043 c22043 = this.f5438;
        c22043.m49600(i2, i);
        c22043.m49599(this.f5429);
        c22043.m49599(i);
        if (z) {
            c22043.m49598();
            C22043 c22044 = this.f5434;
            if (c22044 != null) {
                c22044.m49598();
            }
        }
        C22043 c22045 = this.f5428;
        if (c22045 != null) {
            c22045.m49602(c22043);
        }
        m5261(this.f5429, i, c22043.m49603());
        this.f5429 = i;
        int i3 = this.f5433;
        c22043.m49604(i3);
        C22043 c22046 = this.f5444;
        if (c22046 != null) {
            c22046.m49604(i3);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m5261(int i, int i2, C19927 c19927) {
        int i3;
        if (i2 < i || i2 > (i3 = this.f5433)) {
            throw new IllegalArgumentException("Invalid syntax dependency block");
        }
        if (this.f5445) {
            int i4 = i2 - i;
            if (i4 == 0 || i4 >= 4096) {
                m5259();
                this.f5437.m9131(i, c19927);
                return;
            }
            if (this.f5436 != null && this.f5435 == i) {
                if (!this.f5442) {
                    C22043 c22043 = this.f5443;
                    if (c22043 == null) {
                        this.f5443 = new C22043(i3);
                    } else {
                        c22043.m49604(i3);
                    }
                    this.f5443.m49601(this.f5436);
                    this.f5442 = true;
                }
                this.f5443.m49601(c19927);
                this.f5435 = i2;
                if (i2 - this.f5431 >= 4096) {
                    m5259();
                    return;
                }
                return;
            }
            m5259();
            this.f5431 = i;
            this.f5435 = i2;
            this.f5436 = c19927;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m5259() {
        C19927 c19927M49603 = this.f5436;
        if (c19927M49603 == null) {
            return;
        }
        C2993 c2993 = this.f5437;
        int i = this.f5431;
        if (this.f5442) {
            c19927M49603 = this.f5443.m49603();
        }
        c2993.m9131(i, c19927M49603);
        this.f5436 = null;
        this.f5442 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12165 m5268() {
        if (!this.f5445) {
            throw new IllegalStateException("Replay index retention is disabled");
        }
        if (!this.f5447) {
            throw new IllegalStateException("Replay dependencies are not complete");
        }
        C12165 c12165M9130 = this.f5437.m9130(EnumC21338.COMPLETE);
        this.f5437 = null;
        return c12165M9130;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5263() {
        this.f5437 = null;
        int i = this.f5433;
        C22043 c22043 = this.f5434;
        if (c22043 != null) {
            c22043.m49604(i);
        }
        this.f5430 = Integer.MAX_VALUE;
        this.f5440 = 0;
        this.f5438.m49604(i);
        C22043 c22044 = this.f5444;
        if (c22044 != null) {
            c22044.m49604(i);
        }
        this.f5436 = null;
        C22043 c22045 = this.f5443;
        if (c22045 != null) {
            c22045.m49604(i);
        }
        C22043 c22046 = this.f5441;
        if (c22046 != null) {
            c22046.m49604(i);
        }
        this.f5442 = false;
        this.f5427 = false;
        this.f5447 = false;
        this.f5446 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5258(C1540 c1540, int i, int i2) {
        if (i == i2) {
            c1540.m5269(i);
            return;
        }
        if (i < c1540.f5430) {
            c1540.f5430 = i;
        }
        if (i2 > c1540.f5440) {
            c1540.f5440 = i2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m5272() {
        int i = this.f5430;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = this.f5440;
        this.f5430 = Integer.MAX_VALUE;
        this.f5440 = 0;
        this.f5438.m49600(i, i2);
        C22043 c22043 = this.f5434;
        if (c22043 != null) {
            c22043.m49600(i, i2);
        }
        C22043 c22044 = this.f5444;
        if (c22044 == null) {
            return;
        }
        InterfaceC13924 interfaceC13924 = this.f5446;
        if (interfaceC13924 == null) {
            c22044.m49600(i, i2);
        } else {
            ((C15857) interfaceC13924).m37550(i, i2);
        }
    }
}
