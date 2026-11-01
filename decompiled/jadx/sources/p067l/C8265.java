package p067l;

/* JADX INFO: renamed from: l.ۛܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BC1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8265 extends AbstractC3491 {

    /* JADX INFO: renamed from: ܿ */
    public C20256[] f21891;

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        return null;
    }

    public C8265(C12054 c12054, C21442 c21442) {
        super(c12054, c21442);
        if (c21442.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f21891 = null;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final int mo4465() {
        m19056();
        int iMo4465 = 0;
        for (C20256 c20256 : this.f21891) {
            iMo4465 += c20256.mo4465();
        }
        return iMo4465;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final void mo4463(C19705 c19705) {
        m19056();
        for (C20256 c20256 : this.f21891) {
            c20256.mo4463(c19705);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m19056() {
        if (this.f21891 != null) {
            return;
        }
        C21442 c21442M15873 = m15873();
        int size = c21442M15873.size();
        this.f21891 = new C20256[size];
        int iM50982 = 0;
        for (int i = 0; i < size; i++) {
            C22783 c22783M56524get = c21442M15873.m56524get(i);
            this.f21891[i] = AbstractC6924.m15859(C12054.f33582, C22783.m50968(iM50982, c22783M56524get.getType()), c22783M56524get);
            iM50982 += c22783M56524get.m50982();
        }
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C8265(m15863(), c21442);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        C21442 c21442M15873 = m15873();
        int size = c21442M15873.size();
        StringBuilder sb = new StringBuilder(100);
        int iM50982 = 0;
        for (int i = 0; i < size; i++) {
            C22783 c22783M56524get = c21442M15873.m56524get(i);
            C20256 c20256M15859 = AbstractC6924.m15859(C12054.f33582, C22783.m50968(iM50982, c22783M56524get.getType()), c22783M56524get);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c20256M15859.mo4466());
            iM50982 += c22783M56524get.m50982();
        }
        return sb.toString();
    }
}
