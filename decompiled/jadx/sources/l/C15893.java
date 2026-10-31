package l;

/* JADX INFO: renamed from: l.ܺۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BM3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15893 extends AbstractC2489 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C9170 f49105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2489 f49106;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49107;

    public C15893(C21040 c21040) {
        this.f49106 = c21040;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37666(AbstractC2489 abstractC2489) throws Exception {
        if (this.f49107) {
            abstractC2489.close();
            return;
        }
        AbstractC2489 abstractC24810 = this.f49106;
        if (abstractC24810 == abstractC2489) {
            return;
        }
        if (abstractC24810 != null) {
            abstractC2489.f7936 = abstractC24810.f7936;
            abstractC24810.close();
        }
        abstractC2489.mo7982(this.f49105);
        this.f49106 = abstractC2489;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7982(C9170 c9170) {
        this.f49105 = c9170;
        this.f49106.mo7982(c9170);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f49107 = true;
        this.f49106.close();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC2489 m37667() {
        return this.f49106;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        this.f49106.mo7983(c12366, charSequence);
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7980(int i, int i2, InterfaceC20834 interfaceC20834) {
        this.f49106.mo7980(i, i2, interfaceC20834);
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7979() {
        return this.f49106.mo7979();
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7981(InterfaceC6722 interfaceC6722) {
        this.f49106.mo7981(interfaceC6722);
    }
}
