package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18038 extends AbstractC16026 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C12004 f53859;

    /* JADX INFO: renamed from: ۬ */
    public Predicate f53860;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj2;
        C12004 c12004 = this.f53859;
        AbstractC6462 abstractC6462M27499 = c12004.m27499((AbstractC6462) obj);
        Predicate predicate = this.f53860;
        return predicate.test(abstractC6462M27499) && predicate.test(c12004.m27499(abstractC6462));
    }

    public C18038(C12004 c12004, EnumC19998 enumC19998) {
        this(c12004, enumC19998, new C3572(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18038(C12004 c12004, EnumC19998 enumC19998, Predicate predicate) {
        super(c12004, enumC19998);
        this.f53859 = c12004;
        this.f53860 = predicate;
    }

    @Override // p067l.AbstractC16026
    /* JADX INFO: renamed from: ֫ */
    public final C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        AbstractC6462 abstractC6462M27500 = this.f53859.m27500(abstractC6462, abstractC6463);
        return m39363(new C18709(this, abstractC6462M27500, abstractC6462M27500));
    }
}
