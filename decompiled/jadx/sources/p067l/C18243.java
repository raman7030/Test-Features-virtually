package p067l;

/* JADX INFO: renamed from: l.ܽܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B9V */
/* JADX INFO: loaded from: classes5.dex */
public final class C18243 extends AbstractC10197 {

    /* JADX INFO: renamed from: ܿ */
    public final C22783 f54474;

    /* JADX INFO: renamed from: ֫ */
    public static String m41504(C22783 c22783) {
        return c22783.m50981() + ' ' + c22783.m50990().toString() + ": " + c22783.m50974().mo4819();
    }

    public C18243(C12054 c12054, C22783 c22783) {
        super(c12054);
        if (c22783 == null) {
            throw new NullPointerException("local == null");
        }
        this.f54474 = c22783;
    }

    @Override // p067l.AbstractC10197, p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6924 mo6236(int i) {
        return new C18243(m15863(), this.f54474.m50977(i));
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C18243(m15863(), this.f54474);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C22783 m41505() {
        return this.f54474;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        return this.f54474.toString();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        return "local-start " + m41504(this.f54474);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo15860(C17911 c17911) {
        return new C18243(m15863(), c17911.mo11174(this.f54474));
    }
}
