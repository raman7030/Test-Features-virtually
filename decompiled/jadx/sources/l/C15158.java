package l;

/* JADX INFO: renamed from: l.ܶۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S5UP */
/* JADX INFO: loaded from: classes5.dex */
public final class C15158 extends AbstractC7479 implements InterfaceC18171 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f46314 = EnumC3664.Format35ms;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f46315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f46316;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f46317;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f46318;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f46319;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f46320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f46321;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20772(this) + ", " + mo34743();
    }

    public C15158(EnumC0841 enumC0841, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC0841);
        C11166.m27693(i);
        this.f46316 = i;
        if (i > 0) {
            C11166.m27705(i2);
        } else {
            i2 = 0;
        }
        this.f46321 = i2;
        if (i > 1) {
            C11166.m27705(i3);
        } else {
            i3 = 0;
        }
        this.f46315 = i3;
        if (i > 2) {
            C11166.m27705(i4);
        } else {
            i4 = 0;
        }
        this.f46320 = i4;
        if (i > 3) {
            C11166.m27705(i5);
        } else {
            i5 = 0;
        }
        this.f46319 = i5;
        if (i > 4) {
            C11166.m27705(i6);
        } else {
            i6 = 0;
        }
        this.f46318 = i6;
        this.f46317 = i7;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f46316;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3614() {
        return this.f46321;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܽ */
    public final int mo3612() {
        return this.f46315;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܳ */
    public final int mo3611() {
        return this.f46320;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܿ */
    public final int mo3613() {
        return this.f46319;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ۧ */
    public final int mo3610() {
        return this.f46318;
    }

    @Override // l.InterfaceC20830
    /* JADX INFO: renamed from: ᩹ */
    public final int mo34743() {
        return this.f46317;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f46314;
    }
}
