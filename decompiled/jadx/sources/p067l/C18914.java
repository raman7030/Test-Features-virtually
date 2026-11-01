package p067l;

/* JADX INFO: renamed from: l.ܿܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB9P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18914 extends AbstractC3491 {
    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        return null;
    }

    public C18914(C12054 c12054) {
        super(c12054, C21442.f67643);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final int mo4465() {
        return m15870() & 1;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final void mo4463(C19705 c19705) {
        if (mo4465() != 0) {
            c19705.m44770(AbstractC13630.m30998(0, 0));
        }
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C18914(m15863());
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        if (mo4465() == 0) {
            return null;
        }
        return "nop // spacer";
    }
}
