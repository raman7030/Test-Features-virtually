package l;

/* JADX INFO: renamed from: l.ܳۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14423 extends AbstractC15834 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 f44214;

    public AbstractC14423(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069, AbstractC13717 abstractC13717) {
        super(c3135, c10191, c21480, c20069);
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f44214 = abstractC13717;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ᩳ */
    public String mo11590() {
        return this.f44214.mo2463();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m34454() {
        return this.f44214;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16681(AbstractC15834 abstractC15834) {
        if (super.mo16681(abstractC15834)) {
            return this.f44214.equals(((AbstractC14423) abstractC15834).f44214);
        }
        return false;
    }
}
