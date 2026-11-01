package p067l;

/* JADX INFO: renamed from: l.ܶ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16538 extends AbstractC2630 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC8233 f48596;

    /* JADX INFO: renamed from: ᩸ */
    public final long f48597;

    /* JADX INFO: renamed from: ᩹ */
    public final String f48598;

    public C16538(String str, long j, InterfaceC8233 interfaceC8233) {
        this.f48598 = str;
        this.f48597 = j;
        this.f48596 = interfaceC8233;
    }

    @Override // p067l.AbstractC2630
    /* JADX INFO: renamed from: ܳ */
    public final C15545 mo4013() {
        String str = this.f48598;
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
        return this.f48597;
    }

    @Override // p067l.AbstractC2630
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC8233 mo4016() {
        return this.f48596;
    }
}
