package p067l;

/* JADX INFO: renamed from: l.֫۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3957 extends AbstractC16026 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12004 f8623;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj2;
        C12004 c12004 = this.f8623;
        AbstractC6462 abstractC6462M19499 = c12004.f33480.m19499((AbstractC6462) obj);
        EnumC11353 enumC11353 = EnumC11353.BOOLEAN;
        return abstractC6462M19499.m14777(enumC11353) && c12004.f33480.m19499(abstractC6462).m14777(enumC11353);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3957(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f8623 = c12004;
    }

    @Override // p067l.AbstractC16026
    /* JADX INFO: renamed from: ֫ */
    public final C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C12004 c12004 = this.f8623;
        return m39363(new C18709(this, c12004.f33476.f69151, c12004.f33476.f69151));
    }
}
