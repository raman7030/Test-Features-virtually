package l;

/* JADX INFO: renamed from: l.֫۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672 extends AbstractC14371 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f5844;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj2;
        C10139 c10139 = this.f5844;
        AbstractC4308 abstractC4308M17559 = c10139.f30518.m17559((AbstractC4308) obj);
        EnumC9454 enumC9454 = EnumC9454.BOOLEAN;
        return abstractC4308M17559.m12913(enumC9454) && c10139.f30518.m17559(abstractC4308).m12913(enumC9454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f5844 = c10139;
    }

    @Override // l.AbstractC14371
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C10139 c10139 = this.f5844;
        return m37193(new C17194(this, c10139.f30514.f66469, c10139.f30514.f66469));
    }
}
