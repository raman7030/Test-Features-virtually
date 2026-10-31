package l;

/* JADX INFO: renamed from: l.ۧۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C10835 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11102 f32583;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f32584;

    public C10835(C11102 c11102) {
        super(1, -1);
        this.f32583 = c11102;
        this.f32584 = null;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ENCODED_ARRAY_ITEM;
    }

    public final int hashCode() {
        return this.f32583.hashCode();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫ */
    public final int mo2861(AbstractC3073 abstractC3073) {
        return this.f32583.compareTo(((C10835) abstractC3073).f32583);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f32583.mo2463();
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C23948.m52775(c1662, this.f32583);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        C18241 c18241 = new C18241();
        new C23948(c4484.m16521(), c18241).m52779(this.f32583, false);
        byte[] bArrM42520 = c18241.m42520();
        this.f32584 = bArrM42520;
        m9389(bArrM42520.length);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        if (c18241.m42506()) {
            c18241.m42501(0, m9391() + " encoded array");
            new C23948(c1662, c18241).m52779(this.f32583, true);
            return;
        }
        c18241.m42505(this.f32584);
    }
}
