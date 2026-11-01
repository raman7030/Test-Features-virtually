package p067l;

/* JADX INFO: renamed from: l.֫ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3832 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f8209;

    /* JADX INFO: renamed from: ֨ */
    public final C23318 f8210;

    /* JADX INFO: renamed from: ֫ */
    public int f8211;

    /* JADX INFO: renamed from: ۖ */
    public int f8212 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۘ */
    public int f8213;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f8214;

    /* JADX INFO: renamed from: ۜ */
    public final int f8215;

    /* JADX INFO: renamed from: ۠ */
    public final C23318 f8216;

    /* JADX INFO: renamed from: ۡ */
    public int f8217;

    /* JADX INFO: renamed from: ۢ */
    public C21307 f8218;

    /* JADX INFO: renamed from: ۧ */
    public C5213 f8219;

    /* JADX INFO: renamed from: ܳ */
    public final C23318 f8220;

    /* JADX INFO: renamed from: ܶ */
    public int f8221;

    /* JADX INFO: renamed from: ܺ */
    public int f8222;

    /* JADX INFO: renamed from: ܽ */
    public C23318 f8223;

    /* JADX INFO: renamed from: ܿ */
    public boolean f8224;

    /* JADX INFO: renamed from: ᩳ */
    public C23318 f8225;

    /* JADX INFO: renamed from: ᩴ */
    public final C23318 f8226;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f8227;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC15602 f8228;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f8229;

    public C3832(int i, int i2, boolean z, boolean z2) {
        this.f8215 = i;
        this.f8211 = i2;
        this.f8227 = z;
        this.f8214 = z2;
        this.f8220 = new C23318(i);
        this.f8210 = z ? null : new C23318(i);
        this.f8216 = z ? null : new C23318(i);
        this.f8221 = i2;
        this.f8226 = z2 ? new C23318(i) : null;
        this.f8219 = z ? new C5213(i) : null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7505(C21307 c21307) {
        C23318 c23318 = this.f8210;
        if (c23318 == null || this.f8211 == 0) {
            return;
        }
        if (c21307 == null) {
            c23318.m51941();
        } else {
            c23318.m51937(c21307);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C21307 m7506(int i) {
        C23318 c23318 = this.f8210;
        if (c23318 == null) {
            throw new IllegalStateException("Not a window recorder");
        }
        m7501();
        c23318.m51938(this.f8220);
        c23318.m51936(0, i);
        c23318.m51935(0);
        c23318.m51935(i);
        return c23318.m51939();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m7511() {
        return this.f8221;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C21307 m7508(int i) {
        m7501();
        int i2 = this.f8221;
        C23318 c23318 = this.f8216;
        c23318.m51936(i2, i);
        c23318.m51935(this.f8221);
        c23318.m51935(i);
        C21307 c21307M51939 = c23318.m51939();
        c23318.m51940(this.f8215);
        this.f8221 = i;
        return c21307M51939;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7495(InterfaceC15602 interfaceC15602) {
        if (!this.f8214) {
            if (interfaceC15602 != null) {
                throw new IllegalStateException("End-search proofs are disabled");
            }
            return;
        }
        boolean z = this.f8229;
        if ((z || this.f8209) && interfaceC15602 != this.f8228) {
            throw new IllegalStateException("Cannot change syntax observation sink in the current state");
        }
        if (z || this.f8209 || interfaceC15602 == this.f8228) {
            return;
        }
        m7501();
        this.f8228 = interfaceC15602;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m7502() {
        return this.f8211;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7500(C21307 c21307) {
        C12826.requireNonNull(c21307, "dependency");
        if (this.f8229 || this.f8209) {
            throw new IllegalStateException("Cannot resume a syntax checkpoint in the current state");
        }
        if (c21307.m48216() != this.f8215) {
            throw new IllegalArgumentException("Checkpoint dependency length differs");
        }
        this.f8220.m51937(c21307);
        C23318 c23318 = this.f8210;
        if (c23318 != null) {
            c23318.m51941();
        }
        C23318 c23319 = this.f8216;
        if (c23319 != null) {
            c23319.m51941();
        }
        C23318 c233110 = this.f8226;
        if (c233110 != null) {
            c233110.m51937(c21307);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7509() {
        if (this.f8229 || this.f8209) {
            throw new IllegalStateException("Cannot observe EOF in the current replay state");
        }
        this.f8220.m51934();
        C23318 c23318 = this.f8216;
        if (c23318 != null) {
            c23318.m51934();
        }
        C23318 c23319 = this.f8226;
        if (c23319 == null) {
            return;
        }
        InterfaceC15602 interfaceC15602 = this.f8228;
        if (interfaceC15602 == null) {
            c23319.m51934();
        } else {
            ((C17439) interfaceC15602).m39720();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7498(int i) {
        if (this.f8229 || this.f8209 || i < 0 || i > this.f8215) {
            throw new IllegalStateException("Cannot observe syntax input boundary");
        }
        this.f8220.m51935(i);
        C23318 c23318 = this.f8216;
        if (c23318 != null) {
            c23318.m51935(i);
        }
        C23318 c23319 = this.f8226;
        if (c23319 == null) {
            return;
        }
        InterfaceC15602 interfaceC15602 = this.f8228;
        if (interfaceC15602 == null) {
            c23319.m51935(i);
        } else {
            ((C17439) interfaceC15602).m39725(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7496(C21307 c21307) {
        if (this.f8229 || this.f8209 || c21307.m48216() != this.f8215) {
            throw new IllegalStateException("Cannot commit syntax end-search dependency");
        }
        C23318 c23318 = this.f8226;
        if (c23318 == null) {
            throw new IllegalStateException("End-search proofs are disabled");
        }
        c23318.m51937(c21307);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7504(int i, int i2, C21307 c21307) {
        int i3 = this.f8211;
        if (i >= i3 || i2 > i3) {
            throw new IllegalArgumentException("Reused dependency crosses replay entry");
        }
        m7490(i, i2, c21307);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7494(int i, boolean z) {
        if (z || i - this.f8211 >= 4096) {
            if (z) {
                i = this.f8215;
            }
            m7489(i, z);
            if (z) {
                m7488();
                this.f8229 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21307 m7491(int i, int i2, C21307 c21307) {
        int i3;
        if (this.f8229 || this.f8209 || i < this.f8211 || i2 < i || i2 >= (i3 = this.f8215)) {
            throw new IllegalArgumentException("Invalid syntax checkpoint dependency");
        }
        m7501();
        C23318 c23318 = this.f8223;
        if (c23318 == null) {
            this.f8223 = new C23318(i3);
        } else {
            c23318.m51940(i3);
        }
        C23318 c23319 = this.f8223;
        C23318 c233110 = this.f8226;
        if (c233110 == null) {
            c233110 = this.f8220;
        }
        c23319.m51938(c233110);
        if (c21307 != null) {
            this.f8223.m51937(c21307);
        }
        C23318 c233111 = this.f8223;
        c233111.m51936(this.f8211, i2);
        c233111.m51935(this.f8211);
        c233111.m51935(i2);
        return c233111.m51939();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7493(int i) {
        int i2;
        if (this.f8229 || this.f8209 || i < (i2 = this.f8211) || i >= this.f8215) {
            throw new IllegalArgumentException("Invalid syntax convergence entry");
        }
        if (i != i2) {
            m7489(i, false);
        }
        this.f8209 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21307 m7503(int i) {
        int i2;
        if (this.f8229 || this.f8209 || i <= this.f8211 || i > (i2 = this.f8215)) {
            throw new IllegalArgumentException("Invalid speculative dependency range");
        }
        m7501();
        int i3 = this.f8211;
        C23318 c23318 = this.f8220;
        c23318.m51936(i3, i);
        c23318.m51935(this.f8211);
        c23318.m51935(i);
        C21307 c21307M51939 = c23318.m51939();
        c23318.m51940(i2);
        C23318 c23319 = this.f8226;
        if (c23319 != null) {
            c23319.m51940(i2);
        }
        this.f8211 = i;
        return c21307M51939;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7499(int i, int i2, C21307 c21307) {
        int i3;
        if (this.f8229 || this.f8209 || i < this.f8211 || i2 <= i || i2 > (i3 = this.f8215) || c21307.m48216() != i3) {
            throw new IllegalArgumentException("Invalid confirmed syntax fragment");
        }
        if (i != this.f8211) {
            m7489(i, false);
        }
        m7490(i, i2, c21307);
        C23318 c23318 = this.f8210;
        if (c23318 != null) {
            c23318.m51937(c21307);
        }
        C23318 c23319 = this.f8216;
        if (c23319 != null) {
            c23319.m51937(c21307);
        }
        this.f8211 = i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7510(int i, int i2, C21307 c21307) {
        if (!this.f8209 || i < this.f8211) {
            throw new IllegalArgumentException("Reused dependency precedes convergence entry");
        }
        m7490(i, i2, c21307);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m7507() {
        if (!this.f8209 || this.f8229) {
            throw new IllegalStateException("Syntax suffix is not being reused");
        }
        m7488();
        this.f8229 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m7489(int i, boolean z) {
        m7501();
        int i2 = this.f8211;
        C23318 c23318 = this.f8220;
        c23318.m51936(i2, i);
        c23318.m51935(this.f8211);
        c23318.m51935(i);
        if (z) {
            c23318.m51934();
            C23318 c23319 = this.f8216;
            if (c23319 != null) {
                c23319.m51934();
            }
        }
        C23318 c233110 = this.f8210;
        if (c233110 != null) {
            c233110.m51938(c23318);
        }
        m7490(this.f8211, i, c23318.m51939());
        this.f8211 = i;
        int i3 = this.f8215;
        c23318.m51940(i3);
        C23318 c233111 = this.f8226;
        if (c233111 != null) {
            c233111.m51940(i3);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m7490(int i, int i2, C21307 c21307) {
        int i3;
        if (i2 < i || i2 > (i3 = this.f8215)) {
            throw new IllegalArgumentException("Invalid syntax dependency block");
        }
        if (this.f8227) {
            int i4 = i2 - i;
            if (i4 == 0 || i4 >= 4096) {
                m7488();
                this.f8219.m11182(i, c21307);
                return;
            }
            if (this.f8218 != null && this.f8217 == i) {
                if (!this.f8224) {
                    C23318 c23318 = this.f8225;
                    if (c23318 == null) {
                        this.f8225 = new C23318(i3);
                    } else {
                        c23318.m51940(i3);
                    }
                    this.f8225.m51937(this.f8218);
                    this.f8224 = true;
                }
                this.f8225.m51937(c21307);
                this.f8217 = i2;
                if (i2 - this.f8213 >= 4096) {
                    m7488();
                    return;
                }
                return;
            }
            m7488();
            this.f8213 = i;
            this.f8217 = i2;
            this.f8218 = c21307;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m7488() {
        C21307 c21307M51939 = this.f8218;
        if (c21307M51939 == null) {
            return;
        }
        C5213 c5213 = this.f8219;
        int i = this.f8213;
        if (this.f8224) {
            c21307M51939 = this.f8225.m51939();
        }
        c5213.m11182(i, c21307M51939);
        this.f8218 = null;
        this.f8224 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13930 m7497() {
        if (!this.f8227) {
            throw new IllegalStateException("Replay index retention is disabled");
        }
        if (!this.f8229) {
            throw new IllegalStateException("Replay dependencies are not complete");
        }
        C13930 c13930M11181 = this.f8219.m11181(EnumC22648.COMPLETE);
        this.f8219 = null;
        return c13930M11181;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7492() {
        this.f8219 = null;
        int i = this.f8215;
        C23318 c23318 = this.f8216;
        if (c23318 != null) {
            c23318.m51940(i);
        }
        this.f8212 = Integer.MAX_VALUE;
        this.f8222 = 0;
        this.f8220.m51940(i);
        C23318 c23319 = this.f8226;
        if (c23319 != null) {
            c23319.m51940(i);
        }
        this.f8218 = null;
        C23318 c233110 = this.f8225;
        if (c233110 != null) {
            c233110.m51940(i);
        }
        C23318 c233111 = this.f8223;
        if (c233111 != null) {
            c233111.m51940(i);
        }
        this.f8224 = false;
        this.f8209 = false;
        this.f8229 = false;
        this.f8228 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7487(C3832 c3832, int i, int i2) {
        if (i == i2) {
            c3832.m7498(i);
            return;
        }
        if (i < c3832.f8212) {
            c3832.f8212 = i;
        }
        if (i2 > c3832.f8222) {
            c3832.f8222 = i2;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m7501() {
        int i = this.f8212;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = this.f8222;
        this.f8212 = Integer.MAX_VALUE;
        this.f8222 = 0;
        this.f8220.m51936(i, i2);
        C23318 c23318 = this.f8216;
        if (c23318 != null) {
            c23318.m51936(i, i2);
        }
        C23318 c23319 = this.f8226;
        if (c23319 == null) {
            return;
        }
        InterfaceC15602 interfaceC15602 = this.f8228;
        if (interfaceC15602 == null) {
            c23319.m51936(i, i2);
        } else {
            ((C17439) interfaceC15602).m39722(i, i2);
        }
    }
}
