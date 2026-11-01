package p067l;

/* JADX INFO: renamed from: l.ۜ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8651 extends AbstractC16026 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12004 f23223;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        AbstractC6462 abstractC6463 = (AbstractC6462) obj2;
        C12004 c12004 = this.f23223;
        boolean z = c12004.f33480.m19490(abstractC6462, c12004.f33476.f69215) || c12004.f33480.m19490(abstractC6463, c12004.f33476.f69215);
        EnumC11353 enumC11353 = EnumC11353.VOID;
        return z && !(abstractC6462.m14777(enumC11353) || abstractC6463.m14777(enumC11353));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8651(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f23223 = c12004;
    }

    @Override // p067l.AbstractC16026
    /* JADX INFO: renamed from: ֫ */
    public final C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return m39363(new C18709(this, m20071(abstractC6462), m20071(abstractC6463)));
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC6462 m20071(AbstractC6462 abstractC6462) {
        boolean zMo14805 = abstractC6462.mo14805();
        C12004 c12004 = this.f23223;
        if (zMo14805) {
            return c12004.m27499(abstractC6462);
        }
        if (abstractC6462.m14777(EnumC11353.VOID) || abstractC6462.m14777(EnumC11353.BOT) || c12004.f33480.m19490(abstractC6462, c12004.f33476.f69215)) {
            return abstractC6462;
        }
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            return m20071(abstractC6462.mo14803());
        }
        return c12004.f33476.f69208;
    }
}
