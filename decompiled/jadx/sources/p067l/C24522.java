package p067l;

/* JADX INFO: renamed from: l.᩺᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24522 extends AbstractC2630 {

    /* JADX INFO: renamed from: ۙ */
    public final C3798 f77671;

    /* JADX INFO: renamed from: ᩶ */
    public final String f77672;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8233 f77673;

    /* JADX INFO: renamed from: ᩹ */
    public final String f77674;

    public C24522(C3798 c3798, String str, String str2) {
        this.f77671 = c3798;
        this.f77672 = str;
        this.f77674 = str2;
        this.f77673 = C25037.m54976(new C13794(c3798.m7411(1), c3798));
    }

    @Override // p067l.AbstractC2630
    /* JADX INFO: renamed from: ܳ */
    public final C15545 mo4013() {
        String str = this.f77672;
        if (str == null) {
            return null;
        }
        try {
            return C15545.m35336(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC2630
    /* JADX INFO: renamed from: ᩳ */
    public final long mo4015() {
        try {
            String str = this.f77674;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1L;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p067l.AbstractC2630
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC8233 mo4016() {
        return this.f77673;
    }
}
