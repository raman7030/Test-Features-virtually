package p067l;

/* JADX INFO: renamed from: l.᩸ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23018 extends AbstractC12289 {

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC15405 f72397;

    /* JADX INFO: renamed from: ܿ */
    public int f72398;

    /* JADX INFO: renamed from: ᩻ */
    public int f72399;

    public C23018(C14970 c14970, C12054 c12054, C21442 c21442, AbstractC15405 abstractC15405) {
        super(c14970, c12054, c21442);
        if (abstractC15405 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f72397 = abstractC15405;
        this.f72399 = -1;
        this.f72398 = -1;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo6235(C14970 c14970) {
        C23018 c23018 = new C23018(c14970, m15863(), m15873(), this.f72397);
        int i = this.f72399;
        if (i >= 0) {
            c23018.m51405(i);
        }
        int i2 = this.f72398;
        if (i2 >= 0) {
            c23018.m51404(i2);
        }
        return c23018;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        C23018 c23018 = new C23018(m15874(), m15863(), c21442, this.f72397);
        int i = this.f72399;
        if (i >= 0) {
            c23018.m51405(i);
        }
        int i2 = this.f72398;
        if (i2 >= 0) {
            c23018.m51404(i2);
        }
        return c23018;
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC15405 m51402() {
        return this.f72397;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m51403() {
        int i = this.f72399;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f72397);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܽ */
    public final String mo15868() {
        if (this.f72399 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f72397.mo10336());
        sb.append('@');
        int i = this.f72399;
        if (i < 65536) {
            sb.append(C16351.m37153(i));
        } else {
            sb.append(C16351.m37155(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51405(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f72399 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f72399 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51404(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f72398 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f72398 = i;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        return this.f72397.mo4819();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ᩳ */
    public final String mo15872() {
        AbstractC15405 abstractC15405 = this.f72397;
        if (abstractC15405 instanceof C14930) {
            return ((C14930) abstractC15405).m34150();
        }
        return abstractC15405.mo4819();
    }
}
