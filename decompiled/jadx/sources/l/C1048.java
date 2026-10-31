package l;

/* JADX INFO: renamed from: l.֨ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L4S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1048 extends AbstractC7479 implements InterfaceC11116, InterfaceC0804 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f3868 = EnumC3664.Format35c;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f3869;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3870;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f3871;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f3872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f3873;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f3874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f3875;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20772(this) + ", " + getReference();
    }

    public C1048(EnumC0841 enumC0841, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC8293 interfaceC8293) {
        super(enumC0841);
        C11166.m27693(i);
        this.f3869 = i;
        if (i > 0) {
            C11166.m27705(i2);
        } else {
            i2 = 0;
        }
        this.f3870 = i2;
        if (i > 1) {
            C11166.m27705(i3);
        } else {
            i3 = 0;
        }
        this.f3874 = i3;
        if (i > 2) {
            C11166.m27705(i4);
        } else {
            i4 = 0;
        }
        this.f3873 = i4;
        if (i > 3) {
            C11166.m27705(i5);
        } else {
            i5 = 0;
        }
        this.f3872 = i5;
        if (i > 4) {
            C11166.m27705(i6);
        } else {
            i6 = 0;
        }
        this.f3871 = i6;
        this.f3875 = interfaceC8293;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo3615() {
        return this.f3869;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo3614() {
        return this.f3870;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo3612() {
        return this.f3874;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo3611() {
        return this.f3873;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo3613() {
        return this.f3872;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo3610() {
        return this.f3871;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f3875;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f3875 = c19357.m44609(this.f3875);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f3868;
    }
}
