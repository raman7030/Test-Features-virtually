package p067l;

/* JADX INFO: renamed from: l.᩻۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24744 extends AbstractC16026 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12004 f78345;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C12004 c12004 = this.f78345;
        EnumC11353 enumC11353Mo5577 = c12004.m27499((AbstractC6462) obj).mo5577();
        EnumC11353 enumC11353Mo5578 = c12004.m27499((AbstractC6462) obj2).mo5577();
        EnumC11353 enumC11353 = EnumC11353.LONG;
        if (enumC11353Mo5577 == enumC11353 || enumC11353Mo5577 == EnumC11353.INT) {
            return enumC11353Mo5578 == enumC11353 || enumC11353Mo5578 == EnumC11353.INT;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24744(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f78345 = c12004;
    }

    @Override // p067l.AbstractC16026
    /* JADX INFO: renamed from: ֫ */
    public final C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C12004 c12004 = this.f78345;
        return m39363(new C18709(this, c12004.m27499(abstractC6462), c12004.m27499(abstractC6463)));
    }
}
