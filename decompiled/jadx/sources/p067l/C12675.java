package p067l;

/* JADX INFO: renamed from: l.ۧ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12675 extends AbstractC16026 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12004 f35570;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return m29154((AbstractC6462) obj, (AbstractC6462) obj2) != EnumC22063.INVALID;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12675(C12004 c12004, EnumC19998 enumC19998) {
        super(c12004, enumC19998);
        this.f35570 = c12004;
    }

    @Override // p067l.AbstractC16026
    /* JADX INFO: renamed from: ֫ */
    public final C3088 mo7905(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        AbstractC6462 abstractC6462M27500;
        EnumC22063 enumC22063M29154 = m29154(abstractC6462, abstractC6463);
        EnumC22063 enumC22063 = EnumC22063.NUMERIC_OR_BOOLEAN;
        C12004 c12004 = this.f35570;
        if (enumC22063M29154 == enumC22063) {
            abstractC6462M27500 = c12004.m27500(abstractC6462, abstractC6463);
        } else {
            abstractC6462M27500 = c12004.f33476.f69208;
        }
        return m39363(new C18709(this, abstractC6462M27500, abstractC6462M27500));
    }

    /* JADX INFO: renamed from: ۧ */
    private EnumC22063 m29154(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        boolean zMo14805 = abstractC6462.mo14805();
        boolean zMo14806 = abstractC6463.mo14805();
        if (zMo14805 && zMo14806) {
            return EnumC22063.NUMERIC_OR_BOOLEAN;
        }
        C12004 c12004 = this.f35570;
        if (zMo14805) {
            return c12004.m27499(abstractC6463).mo14805() ? EnumC22063.NUMERIC_OR_BOOLEAN : EnumC22063.INVALID;
        }
        if (zMo14806) {
            return c12004.m27499(abstractC6462).mo14805() ? EnumC22063.NUMERIC_OR_BOOLEAN : EnumC22063.INVALID;
        }
        return (abstractC6462.mo14800() && abstractC6463.mo14800()) ? EnumC22063.REFERENCE : EnumC22063.INVALID;
    }
}
