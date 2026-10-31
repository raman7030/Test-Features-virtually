package l;

/* JADX INFO: renamed from: l.ܶ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C15563 extends AbstractC15772 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23801 f47971;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22620 f47972 = null;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        return 4;
    }

    public C15563(C23801 c23801) {
        this.f47971 = c23801;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C14628 c14628M52478 = this.f47971.m52478();
        C21915 c21915M5624 = c1662.m5624();
        C22620 c22620M49324 = c21915M5624.m49324(c14628M52478);
        if (c22620M49324 == null) {
            C4484 c4484M5614 = c1662.m5614();
            c22620M49324 = new C22620(c14628M52478);
            c4484M5614.m13220((AbstractC3073) c22620M49324);
            c21915M5624.m49325(c14628M52478, c22620M49324);
        }
        this.f47972 = c22620M49324;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        int iM9390 = this.f47972.m9390();
        if (c18241.m42506()) {
            c18241.m42501(0, m37189() + ' ' + this.f47971.toString());
            c18241.m42501(4, "call_site_off: ".concat(C14712.m35008(iM9390)));
        }
        c18241.m42514(iM9390);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f47971.compareTo(((C15563) obj).f47971);
    }
}
