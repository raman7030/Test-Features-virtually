package l;

/* JADX INFO: renamed from: l.ۜۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6693 extends AbstractC7479 implements InterfaceC4601, InterfaceC0804 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f20798 = EnumC3664.Format22c;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f20799;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f20800;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f20801;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", " + getReference();
    }

    public C6693(EnumC0841 enumC0841, int i, int i2, InterfaceC8293 interfaceC8293) {
        super(enumC0841);
        C11166.m27705(i);
        this.f20800 = i;
        C11166.m27705(i2);
        this.f20799 = i2;
        this.f20801 = interfaceC8293;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f20800;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f20799;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f20801;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f20801 = c19357.m44609(this.f20801);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f20798;
    }
}
