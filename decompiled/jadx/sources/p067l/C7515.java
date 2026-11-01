package p067l;

/* JADX INFO: renamed from: l.ۚܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BA4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7515 extends AbstractC12289 {

    /* JADX INFO: renamed from: ܿ */
    public C16981 f19733;

    public C7515(C14970 c14970, C12054 c12054, C21442 c21442, C16981 c16981) {
        super(c14970, c12054, c21442);
        if (c16981 == null) {
            throw new NullPointerException("target == null");
        }
        this.f19733 = c16981;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo6235(C14970 c14970) {
        return new C7515(c14970, m15863(), m15873(), this.f19733);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C7515(m15874(), m15863(), c21442, this.f19733);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C16981 m17406() {
        return this.f19733;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m17407() {
        return this.f19733.m15870();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m17408() {
        return this.f19733.m15870() - m15870();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m17409() {
        return m15865() && this.f19733.m15865();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        C16981 c16981 = this.f19733;
        return c16981 == null ? "????" : c16981.m15864();
    }
}
