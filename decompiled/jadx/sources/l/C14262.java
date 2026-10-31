package l;

/* JADX INFO: renamed from: l.ܳۗ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C14262 {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10318 m33911(C1646 c1646, InterfaceC19763 interfaceC19763) {
        InterfaceC14801 interfaceC14801Mo13851;
        AbstractC10736 c8887;
        EnumC7208 enumC7208 = EnumC7208.DEFAULT;
        InterfaceC14801 interfaceC14801M5528 = c1646.m5528();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC14801M5528.mo13850(bool, C21320.f68708)).booleanValue();
        boolean zBooleanValue2 = bool.booleanValue();
        C23974 c23974 = C23974.f77731;
        if (zBooleanValue || zBooleanValue2) {
            C23932 c23932 = new C23932();
            c23932.f77612 = c23974;
            InterfaceC14801 interfaceC14801 = (InterfaceC14801) interfaceC14801M5528.mo13850(c23974, new C14968(c23932));
            if (zBooleanValue2) {
                c23932.f77612 = ((InterfaceC14801) c23932.f77612).mo13850(c23974, C7913.f24500);
            }
            interfaceC14801Mo13851 = interfaceC14801.mo13851((InterfaceC14801) c23932.f77612);
        } else {
            interfaceC14801Mo13851 = interfaceC14801M5528.mo13851(c23974);
        }
        if (interfaceC14801Mo13851 != C9613.m24545() && interfaceC14801Mo13851.mo9082(InterfaceC7557.f23344) == null) {
            interfaceC14801Mo13851 = interfaceC14801Mo13851.mo13851(C9613.m24545());
        }
        if (enumC7208.m19294()) {
            c8887 = new C14530(interfaceC14801Mo13851, interfaceC19763);
        } else {
            c8887 = new C8887(interfaceC14801Mo13851, true);
        }
        enumC7208.m19293(interfaceC19763, c8887, c8887);
        return c8887;
    }
}
