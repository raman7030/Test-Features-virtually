package p067l;

/* JADX INFO: renamed from: l.ܳۗ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C15923 {
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
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12175 m36044(C3933 c3933, InterfaceC21152 interfaceC21152) {
        InterfaceC16436 interfaceC16436Mo15731;
        AbstractC12572 c10815;
        EnumC9219 enumC9219 = EnumC9219.DEFAULT;
        InterfaceC16436 interfaceC16436M7758 = c3933.m7758();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC16436M7758.mo15730(bool, C22631.f71402)).booleanValue();
        boolean zBooleanValue2 = bool.booleanValue();
        C25154 c25154 = C25154.f80484;
        if (zBooleanValue || zBooleanValue2) {
            C25114 c25114 = new C25114();
            c25114.f80364 = c25154;
            InterfaceC16436 interfaceC16436 = (InterfaceC16436) interfaceC16436M7758.mo15730(c25154, new C16594(c25114));
            if (zBooleanValue2) {
                c25114.f80364 = ((InterfaceC16436) c25114.f80364).mo15730(c25154, C9889.f27415);
            }
            interfaceC16436Mo15731 = interfaceC16436.mo15731((InterfaceC16436) c25114.f80364);
        } else {
            interfaceC16436Mo15731 = interfaceC16436M7758.mo15731(c25154);
        }
        if (interfaceC16436Mo15731 != C11505.m26558() && interfaceC16436Mo15731.mo11134(InterfaceC9551.f26257) == null) {
            interfaceC16436Mo15731 = interfaceC16436Mo15731.mo15731(C11505.m26558());
        }
        if (enumC9219.m21242()) {
            c10815 = new C16178(interfaceC16436Mo15731, interfaceC21152);
        } else {
            c10815 = new C10815(interfaceC16436Mo15731, true);
        }
        enumC9219.m21241(interfaceC21152, c10815, c10815);
        return c10815;
    }
}
