package l;

/* JADX INFO: renamed from: l.۠ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8104 extends AbstractC7479 implements InterfaceC16759 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f24979 = EnumC3664.Format35mi;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f24980;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24981;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f24982;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f24983;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f24984;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f24985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f24986;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20772(this) + ", " + mo21537();
    }

    public C8104(EnumC0841 enumC0841, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC0841);
        C11166.m27693(i);
        this.f24980 = i;
        if (i > 0) {
            C11166.m27705(i2);
        } else {
            i2 = 0;
        }
        this.f24981 = i2;
        if (i > 1) {
            C11166.m27705(i3);
        } else {
            i3 = 0;
        }
        this.f24985 = i3;
        if (i > 2) {
            C11166.m27705(i4);
        } else {
            i4 = 0;
        }
        this.f24984 = i4;
        if (i > 3) {
            C11166.m27705(i5);
        } else {
            i5 = 0;
        }
        this.f24983 = i5;
        if (i > 4) {
            C11166.m27705(i6);
        } else {
            i6 = 0;
        }
        this.f24982 = i6;
        this.f24986 = i7;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f24980;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3614() {
        return this.f24981;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܽ */
    public final int mo3612() {
        return this.f24985;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܳ */
    public final int mo3611() {
        return this.f24984;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܿ */
    public final int mo3613() {
        return this.f24983;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ۧ */
    public final int mo3610() {
        return this.f24982;
    }

    @Override // l.InterfaceC11389
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo21537() {
        return this.f24986;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f24979;
    }
}
