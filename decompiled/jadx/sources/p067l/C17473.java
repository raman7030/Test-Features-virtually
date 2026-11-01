package p067l;

/* JADX INFO: renamed from: l.ܺۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17473 extends AbstractC4734 {

    /* JADX INFO: renamed from: ۗ */
    public C11084 f52245;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC4734 f52246;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f52247;

    public C17473(C22365 c22365) {
        this.f52246 = c22365;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39839(AbstractC4734 abstractC4734) throws Exception {
        if (this.f52247) {
            abstractC4734.close();
            return;
        }
        AbstractC4734 abstractC4735 = this.f52246;
        if (abstractC4735 == abstractC4734) {
            return;
        }
        if (abstractC4735 != null) {
            abstractC4734.f10724 = abstractC4735.f10724;
            abstractC4735.close();
        }
        abstractC4734.mo10030(this.f52245);
        this.f52246 = abstractC4734;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10030(C11084 c11084) {
        this.f52245 = c11084;
        this.f52246.mo10030(c11084);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f52247 = true;
        this.f52246.close();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC4734 m39840() {
        return this.f52246;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10031(C14121 c14121, CharSequence charSequence) {
        this.f52246.mo10031(c14121, charSequence);
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10028(int i, int i2, InterfaceC22169 interfaceC22169) {
        this.f52246.mo10028(i, i2, interfaceC22169);
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10027() {
        return this.f52246.mo10027();
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10029(InterfaceC8757 interfaceC8757) {
        this.f52246.mo10029(interfaceC8757);
    }
}
