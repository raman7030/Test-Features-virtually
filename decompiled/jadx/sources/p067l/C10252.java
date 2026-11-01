package p067l;

/* JADX INFO: renamed from: l.۠ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10252 extends AbstractC7570 {

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ C23663 f28387;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10252(C23663 c23663, EnumC3600 enumC3600) {
        super(c23663, enumC3600, "symbol not found error");
        this.f28387 = c23663;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C4848 c48410;
        C4848 c4848M10283;
        boolean z;
        Object objM52638;
        Object objM52639;
        char c;
        EnumC10306 enumC10306;
        C18258 c18258M18543;
        C4848 c4848M10284;
        AbstractC12224 abstractC12225 = abstractC12224;
        if (c4848 == null) {
            c4848M10284 = C4848.m10283();
        } else {
            c48410 = c4848;
        }
        if (c4849 == null) {
            c48410 = c4848M10284;
            c4848M10283 = C4848.m10283();
        } else {
            c48410 = c4848M10284;
            c4848M10283 = c4849;
        }
        C23663 c23663 = this.f28387;
        C8200 c8200 = c23663.f75320;
        C8005 c8005 = c23663.f75333;
        C23623 c23623 = c23663.f75324;
        C8200 c8201 = c23663.f75320;
        if (abstractC12225 == c8200.f21713) {
            return null;
        }
        AbstractC7783 abstractC7784 = abstractC7783 == null ? abstractC6462.f16705 : abstractC7783;
        if (abstractC7784.f20408.isEmpty()) {
            z = false;
        } else {
            if (abstractC7784.f20405 == EnumC3600.f7351 && !abstractC6462.f16705.mo17485() && abstractC7784.f20408 != c8201.f21640) {
                return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "doesnt.exist", abstractC7784);
            }
            if (abstractC7784.f20408.equals(c8201.f21744) || abstractC7784.f20408.equals(c8201.f21756)) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = abstractC12225 == c8201.f21737;
        EnumC10306 enumC10306M6621 = z2 ? EnumC10306.CONSTRUCTOR : this.f20405.m6621();
        if (z2) {
            abstractC12225 = abstractC6462.f16705.f20408;
        }
        boolean zM10293 = c4848M10283.m10293();
        String string = z ? ".location" : "";
        int i = C17215.f51240[enumC10306M6621.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sbM17248 = C7470.m17248(string.concat(".args"));
            sbM17248.append(zM10293 ? ".params" : "");
            string = sbM17248.toString();
        }
        String strM48631 = C21466.m48631("cant.resolve", string);
        if (!z) {
            C8005 c8006 = c23663.f75333;
            C16051 c16051M9345 = c23623.m9345();
            if (!c48410.isEmpty()) {
                objM52638 = c48410;
                objM52638 = c23663.m52638(c48410);
            }
            objM52638 = c48410;
            return c8006.m18545(enumC14710, c16051M9345, interfaceC5323, strM48631, enumC10306M6621, abstractC12225, c4848M10283, objM52638);
        }
        C8005 c8007 = c23663.f75333;
        C16051 c16051M9346 = c23623.m9345();
        if (!c48410.isEmpty()) {
            objM52639 = c48410;
            objM52639 = c23663.m52638(c48410);
        }
        objM52639 = c48410;
        if (abstractC7784.f20405 == EnumC3600.f7339) {
            EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7784);
            AbstractC6462 abstractC6463 = abstractC7784.f20406;
            C13370 c13370 = C13665.f38450;
            c = 1;
            c18258M18543 = c8005.m18543(new C13370("compiler", "location.1", enumC10306M51425, abstractC7784, abstractC6463));
        } else {
            c = 1;
            if (abstractC6462.m14777(EnumC11353.TYPEVAR) || (abstractC6462.m14777(EnumC11353.CLASS) && (abstractC6462.f16705.mo18003() & 16777216) != 0)) {
                enumC10306 = EnumC10306.BOUND;
            } else if (abstractC6462.m14777(EnumC11353.PACKAGE)) {
                enumC10306 = EnumC10306.PACKAGE;
            } else {
                long j = abstractC6462.f16705.f20409;
                if ((j & 8192) != 0) {
                    enumC10306 = EnumC10306.ANNOTATION;
                } else {
                    enumC10306 = (j & 512) != 0 ? EnumC10306.INTERFACE : EnumC10306.CLASS;
                }
            }
            C13370 c13371 = C13665.f38450;
            c18258M18543 = c8005.m18543(new C13370("compiler", "location", enumC10306, abstractC6462, null));
        }
        Object[] objArr = new Object[5];
        objArr[0] = enumC10306M6621;
        objArr[c] = abstractC12225;
        objArr[2] = c4848M10283;
        objArr[3] = objM52639;
        objArr[4] = c18258M18543;
        return c8007.m18545(enumC14710, c16051M9346, interfaceC5323, strM48631, objArr);
    }
}
