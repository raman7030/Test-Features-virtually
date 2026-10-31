package l;

/* JADX INFO: renamed from: l.۠ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8295 extends AbstractC5473 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f25477;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8295(C22406 c22406, EnumC1296 enumC1296) {
        super(c22406, enumC1296, "symbol not found error");
        this.f25477 = c22406;
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
    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        C2609 c26011;
        C2609 c2609M8239;
        boolean z;
        Object objM50298;
        Object objM50299;
        char c;
        EnumC8352 enumC8352;
        C16719 c16719M16617;
        C2609 c2609M82310;
        AbstractC10370 abstractC10371 = abstractC10370;
        if (c2609 == null) {
            c2609M82310 = C2609.m8239();
        } else {
            c26011 = c2609;
        }
        if (c26010 == null) {
            c26011 = c2609M82310;
            c2609M8239 = C2609.m8239();
        } else {
            c26011 = c2609M82310;
            c2609M8239 = c26010;
        }
        C22406 c22406 = this.f25477;
        C6136 c6136 = c22406.f72594;
        C5931 c5931 = c22406.f72607;
        C22364 c22364 = c22406.f72598;
        C6136 c6137 = c22406.f72594;
        if (abstractC10371 == c6136.f18855) {
            return null;
        }
        AbstractC5698 abstractC5699 = abstractC5698 == null ? abstractC4308.f13890 : abstractC5698;
        if (abstractC5699.f17562.isEmpty()) {
            z = false;
        } else {
            if (abstractC5699.f17559 == EnumC1296.f4579 && !abstractC4308.f13890.mo15574() && abstractC5699.f17562 != c6137.f18782) {
                return c22406.f72607.m16619(enumC12986, c22364.m7266(), interfaceC3109, "doesnt.exist", abstractC5699);
            }
            if (abstractC5699.f17562.equals(c6137.f18886) || abstractC5699.f17562.equals(c6137.f18898)) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = abstractC10371 == c6137.f18879;
        EnumC8352 enumC8352M4389 = z2 ? EnumC8352.CONSTRUCTOR : this.f17559.m4389();
        if (z2) {
            abstractC10371 = abstractC4308.f13890.f17562;
        }
        boolean zM8249 = c2609M8239.m8249();
        String string = z ? ".location" : "";
        int i = C15622.f48101[enumC8352M4389.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sbM15339 = C5368.m15339(string.concat(".args"));
            sbM15339.append(zM8249 ? ".params" : "");
            string = sbM15339.toString();
        }
        String strM46315 = C20094.m46315("cant.resolve", string);
        if (!z) {
            C5931 c5932 = c22406.f72607;
            C14397 c14397M7266 = c22364.m7266();
            if (!c26011.isEmpty()) {
                objM50298 = c26011;
                objM50298 = c22406.m50298(c26011);
            }
            objM50298 = c26011;
            return c5932.m16619(enumC12986, c14397M7266, interfaceC3109, strM46315, enumC8352M4389, abstractC10371, c2609M8239, objM50298);
        }
        C5931 c5933 = c22406.f72607;
        C14397 c14397M7267 = c22364.m7266();
        if (!c26011.isEmpty()) {
            objM50299 = c26011;
            objM50299 = c22406.m50298(c26011);
        }
        objM50299 = c26011;
        if (abstractC5699.f17559 == EnumC1296.f4567) {
            EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5699);
            AbstractC4308 abstractC4309 = abstractC5699.f17560;
            C11576 c11576 = C11886.f35440;
            c = 1;
            c16719M16617 = c5931.m16617(new C11576("compiler", "location.1", enumC8352M49076, abstractC5699, abstractC4309));
        } else {
            c = 1;
            if (abstractC4308.m12913(EnumC9454.TYPEVAR) || (abstractC4308.m12913(EnumC9454.CLASS) && (abstractC4308.f13890.mo16084() & 16777216) != 0)) {
                enumC8352 = EnumC8352.BOUND;
            } else if (abstractC4308.m12913(EnumC9454.PACKAGE)) {
                enumC8352 = EnumC8352.PACKAGE;
            } else {
                long j = abstractC4308.f13890.f17563;
                if ((j & 8192) != 0) {
                    enumC8352 = EnumC8352.ANNOTATION;
                } else {
                    enumC8352 = (j & 512) != 0 ? EnumC8352.INTERFACE : EnumC8352.CLASS;
                }
            }
            C11576 c11577 = C11886.f35440;
            c16719M16617 = c5931.m16617(new C11576("compiler", "location", enumC8352, abstractC4308, null));
        }
        Object[] objArr = new Object[5];
        objArr[0] = enumC8352M4389;
        objArr[c] = abstractC10371;
        objArr[2] = c2609M8239;
        objArr[3] = objM50299;
        objArr[4] = c16719M16617;
        return c5933.m16619(enumC12986, c14397M7267, interfaceC3109, strM46315, objArr);
    }
}
