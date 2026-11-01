package p067l;

/* JADX INFO: renamed from: l.ᩴۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20155 extends AbstractC7570 {

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C23663 f62393;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC7783 f62394;

    @Override // p067l.AbstractC7570, p067l.AbstractC7783
    /* JADX INFO: renamed from: ۗ */
    public boolean mo17485() {
        return !(this instanceof C7829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC20155(C23663 c23663, EnumC3600 enumC3600, AbstractC7783 abstractC7783, String str) {
        super(c23663, enumC3600, str);
        this.f62393 = c23663;
        this.f62394 = abstractC7783;
    }

    @Override // p067l.AbstractC7570, p067l.AbstractC7783
    public final String toString() {
        return this.f19842 + " wrongSym=" + this.f62394;
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo17484(AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        AbstractC7783 abstractC7783 = this.f62394;
        if (abstractC7783.f20405.m6625() || !abstractC7783.f20405.m6623(C17010.f50319)) {
            return abstractC7783;
        }
        C8374 c8374 = this.f62393.f75323;
        AbstractC6462 abstractC6462 = abstractC7783.f20406;
        c8374.getClass();
        return C8374.m19397(abstractC12224, abstractC21195, abstractC6462).f16705;
    }
}
