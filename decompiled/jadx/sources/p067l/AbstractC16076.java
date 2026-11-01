package p067l;

/* JADX INFO: renamed from: l.ܳۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16076 extends AbstractC17417 {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC15405 f47308;

    public AbstractC16076(C5348 c5348, C12054 c12054, C22783 c22783, C21442 c21442, AbstractC15405 abstractC15405) {
        super(c5348, c12054, c22783, c21442);
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f47308 = abstractC15405;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ᩳ */
    public String mo13526() {
        return this.f47308.mo4819();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC15405 m36587() {
        return this.f47308;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18607(AbstractC17417 abstractC17417) {
        if (super.mo18607(abstractC17417)) {
            return this.f47308.equals(((AbstractC16076) abstractC17417).f47308);
        }
        return false;
    }
}
