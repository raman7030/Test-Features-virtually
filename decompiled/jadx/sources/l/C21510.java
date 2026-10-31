package l;

/* JADX INFO: renamed from: l.᩸ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21510 extends AbstractC7479 implements InterfaceC17465, InterfaceC0804 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f69170 = EnumC3664.Format3rc;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f69171;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f69172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f69173;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20773(this) + ", " + getReference();
    }

    public C21510(EnumC0841 enumC0841, int i, int i2, InterfaceC8293 interfaceC8293) {
        super(enumC0841);
        C11166.m27703(i);
        this.f69171 = i;
        C11166.m27709(i2);
        this.f69172 = i2;
        this.f69173 = interfaceC8293;
    }

    @Override // l.InterfaceC16595
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9712() {
        return this.f69171;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f69172;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f69173;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f69173 = c19357.m44609(this.f69173);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f69170;
    }
}
