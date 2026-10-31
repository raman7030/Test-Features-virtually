package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16488 extends AbstractC14371 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f50682;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Predicate f50683;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj2;
        C10139 c10139 = this.f50682;
        AbstractC4308 abstractC4308M25480 = c10139.m25480((AbstractC4308) obj);
        Predicate predicate = this.f50683;
        return predicate.test(abstractC4308M25480) && predicate.test(c10139.m25480(abstractC4308));
    }

    public C16488(C10139 c10139, EnumC18550 enumC18550) {
        this(c10139, enumC18550, new C1266(2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16488(C10139 c10139, EnumC18550 enumC18550, Predicate predicate) {
        super(c10139, enumC18550);
        this.f50682 = c10139;
        this.f50683 = predicate;
    }

    @Override // l.AbstractC14371
    /* JADX INFO: renamed from: ֫ */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        AbstractC4308 abstractC4308M25481 = this.f50682.m25481(abstractC4308, abstractC4309);
        return m37193(new C17194(this, abstractC4308M25481, abstractC4308M25481));
    }
}
