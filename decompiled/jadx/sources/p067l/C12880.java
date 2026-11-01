package p067l;

/* JADX INFO: renamed from: l.ۧܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BF0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12880 extends AbstractC10197 {

    /* JADX INFO: renamed from: ܿ */
    public final C6689 f36236;

    public C12880(C12054 c12054, C6689 c6689) {
        super(c12054);
        if (c6689 == null) {
            throw new NullPointerException("locals == null");
        }
        this.f36236 = c6689;
    }

    @Override // p067l.AbstractC10197, p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6924 mo6236(int i) {
        return new C12880(m15863(), this.f36236.m15240(i));
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C12880(m15863(), this.f36236);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C6689 m29508() {
        return this.f36236;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        return this.f36236.toString();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        C6689 c6689 = this.f36236;
        int size = c6689.size();
        int iM15244 = c6689.m15244();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < iM15244; i++) {
            C22783 c22783 = c6689.get(i);
            if (c22783 != null) {
                sb.append("\n  ");
                sb.append(C18243.m41504(c22783));
            }
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo15860(C17911 c17911) {
        C12054 c12054M15863 = m15863();
        C6689 c6689 = this.f36236;
        int iM15244 = c6689.m15244();
        C6689 c66810 = new C6689(c17911.m40717());
        for (int i = 0; i < iM15244; i++) {
            C22783 c22783 = c6689.get(i);
            if (c22783 != null) {
                c66810.m15246(c17911.mo11174(c22783));
            }
        }
        c66810.mo22326();
        if (!c66810.equals(c6689)) {
            c6689 = c66810;
        }
        return new C12880(c12054M15863, c6689);
    }
}
