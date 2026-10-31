package l;

/* JADX INFO: renamed from: l.ۙۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V5UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4576 extends AbstractC7479 implements InterfaceC6882, InterfaceC0804 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f14593 = EnumC3664.Format45cc;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f14594;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f14595;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f14596;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f14597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f14598;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f14599;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f14600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f14601;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20772(this) + ", " + getReference() + ", " + mo9710();
    }

    public C4576(EnumC0841 enumC0841, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC8293 interfaceC8293, InterfaceC8293 interfaceC8294) {
        super(enumC0841);
        C11166.m27693(i);
        this.f14600 = i;
        if (i > 0) {
            C11166.m27705(i2);
        } else {
            i2 = 0;
        }
        this.f14594 = i2;
        if (i > 1) {
            C11166.m27705(i3);
        } else {
            i3 = 0;
        }
        this.f14599 = i3;
        if (i > 2) {
            C11166.m27705(i4);
        } else {
            i4 = 0;
        }
        this.f14597 = i4;
        if (i > 3) {
            C11166.m27705(i5);
        } else {
            i5 = 0;
        }
        this.f14596 = i5;
        if (i > 4) {
            C11166.m27705(i6);
        } else {
            i6 = 0;
        }
        this.f14598 = i6;
        this.f14601 = interfaceC8293;
        this.f14595 = interfaceC8294;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f14600;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3614() {
        return this.f14594;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܽ */
    public final int mo3612() {
        return this.f14599;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܳ */
    public final int mo3611() {
        return this.f14597;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܿ */
    public final int mo3613() {
        return this.f14596;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ۧ */
    public final int mo3610() {
        return this.f14598;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f14601;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f14601 = c19357.m44609(this.f14601);
        this.f14595 = c19357.m44609(this.f14595);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC8293 mo9710() {
        return this.f14595;
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۠ */
    public final int mo9711() {
        return this.f23060.f3317;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f14593;
    }
}
