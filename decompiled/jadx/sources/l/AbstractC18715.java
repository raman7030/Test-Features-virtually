package l;

/* JADX INFO: renamed from: l.ᩴۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18715 extends AbstractC5473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f59169;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f59170;

    @Override // l.AbstractC5473, l.AbstractC5698
    /* JADX INFO: renamed from: ۗ */
    public boolean mo15574() {
        return !(this instanceof C5746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC18715(C22406 c22406, EnumC1296 enumC1296, AbstractC5698 abstractC5698, String str) {
        super(c22406, enumC1296, str);
        this.f59169 = c22406;
        this.f59170 = abstractC5698;
    }

    @Override // l.AbstractC5473, l.AbstractC5698
    public final String toString() {
        return this.f17001 + " wrongSym=" + this.f59170;
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo15573(AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC5698 abstractC5698 = this.f59170;
        if (abstractC5698.f17559.m4393() || !abstractC5698.f17559.m4391(C15406.f47189)) {
            return abstractC5698;
        }
        C6319 c6319 = this.f59169.f72597;
        AbstractC4308 abstractC4308 = abstractC5698.f17560;
        c6319.getClass();
        return C6319.m17457(abstractC10370, abstractC19810, abstractC4308).f13890;
    }
}
