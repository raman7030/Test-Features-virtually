package l;

/* JADX INFO: renamed from: l.᩹᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBE8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22620 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f73068;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14628 f73069;

    public C22620(C14628 c14628) {
        super(1, -1);
        this.f73069 = c14628;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        C18241 c18241 = new C18241();
        new C23948(c4484.m16521(), c18241).m52779((C11102) this.f73069, true);
        byte[] bArrM42520 = c18241.m42520();
        this.f73068 = bArrM42520;
        m9389(bArrM42520.length);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return this.f73069.mo2463();
    }

    public final String toString() {
        return this.f73069.toString();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        if (c18241.m42506()) {
            c18241.m42501(0, m9391() + " call site");
            new C23948(c1662, c18241).m52779((C11102) this.f73069, true);
            return;
        }
        c18241.m42505(this.f73068);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C23948.m52775(c1662, this.f73069);
    }
}
