package l;

/* JADX INFO: renamed from: l.᩸ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21727 extends AbstractC10438 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f69692;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f69694;

    public C21727(C13259 c13259, C10191 c10191, C20069 c20069, AbstractC13717 abstractC13717) {
        super(c13259, c10191, c20069);
        if (abstractC13717 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f69692 = abstractC13717;
        this.f69694 = -1;
        this.f69693 = -1;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo3993(C13259 c13259) {
        C21727 c21727 = new C21727(c13259, m13983(), m13993(), this.f69692);
        int i = this.f69694;
        if (i >= 0) {
            c21727.m49056(i);
        }
        int i2 = this.f69693;
        if (i2 >= 0) {
            c21727.m49055(i2);
        }
        return c21727;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        C21727 c21727 = new C21727(m13994(), m13983(), c20069, this.f69692);
        int i = this.f69694;
        if (i >= 0) {
            c21727.m49056(i);
        }
        int i2 = this.f69693;
        if (i2 >= 0) {
            c21727.m49055(i2);
        }
        return c21727;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m49053() {
        return this.f69692;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m49054() {
        int i = this.f69694;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f69692);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܽ */
    public final String mo13988() {
        if (this.f69694 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f69692.mo8292());
        sb.append('@');
        int i = this.f69694;
        if (i < 65536) {
            sb.append(C14712.m35006(i));
        } else {
            sb.append(C14712.m35008(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49056(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f69694 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f69694 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49055(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f69693 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f69693 = i;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        return this.f69692.mo2463();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13992() {
        AbstractC13717 abstractC13717 = this.f69692;
        if (abstractC13717 instanceof C13217) {
            return ((C13217) abstractC13717).m32052();
        }
        return abstractC13717.mo2463();
    }
}
