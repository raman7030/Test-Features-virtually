package l;

/* JADX INFO: renamed from: l.ܰۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13655 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13217 f40722;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
    }

    public C13655(C13217 c13217) {
        super(1, c13217.m32051() + C1080.m3668(c13217.m32054()) + 1);
        this.f40722 = c13217;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_STRING_DATA_ITEM;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        C13217 c13217 = this.f40722;
        C11186 c11186M32053 = c13217.m32053();
        int iM32054 = c13217.m32054();
        if (c18241.m42506()) {
            c18241.m42501(C1080.m3668(iM32054), "utf16_size: ".concat(C14712.m35008(iM32054)));
            c18241.m42501(c11186M32053.m27748() + 1, c13217.m32052());
        }
        c18241.m42507(iM32054);
        c18241.m42504(c11186M32053);
        c18241.m42517(0);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f40722.m32052();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫ */
    public final int mo2861(AbstractC3073 abstractC3073) {
        return this.f40722.compareTo(((C13655) abstractC3073).f40722);
    }
}
