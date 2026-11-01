package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۨ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13804 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f39008;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13804(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f39008 = c21378;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C21378 c21378 = this.f39008;
        Object objM48597 = c21378.f67409.m48597(c21378.m48439());
        if ((abstractC7783.mo18003() & 16) == 0) {
            return;
        }
        C13818 c13818 = (C13818) abstractC7783;
        switch (C12463.f34874[c13818.f20406.mo5577().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m31457(c13818, Integer.class, objM48597);
                break;
            case 6:
                m31457(c13818, Long.class, objM48597);
                break;
            case 7:
                m31457(c13818, Float.class, objM48597);
                break;
            case 8:
                m31457(c13818, Double.class, objM48597);
                break;
            case 9:
                AbstractC6462 abstractC6462 = c13818.f20406;
                if (abstractC6462.f16705 == c21378.f67412.f69215.f16705) {
                    m31457(c13818, String.class, objM48597);
                } else {
                    throw c21378.m48431("bad.constant.value.type", abstractC6462);
                }
                break;
            default:
                return;
        }
        if ((objM48597 instanceof Integer) && !c13818.f20406.mo5577().m26306(((Integer) objM48597).intValue())) {
            throw c21378.m48431("bad.constant.range", objM48597, c13818, c13818.f20406);
        }
        c13818.m31483(objM48597);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31457(AbstractC7783 abstractC7783, Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw this.f39008.m48431("bad.constant.value", obj, abstractC7783, cls.getSimpleName());
        }
    }
}
