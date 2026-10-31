package l;

/* JADX INFO: renamed from: l.ۚ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5687 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0747 f17544;

    public C5687(C0747 c0747) {
        super(4, 4);
        this.f17544 = c0747;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        this.f17544 = (C0747) c1662.m5620().m13223(this.f17544);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f17544.mo2864();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        int iM9390 = this.f17544.m9390();
        if (c18241.m42506()) {
            c18241.m42501(4, "  annotations_off: ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM9390);
    }
}
