package l;

import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩸᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21896 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23034 f70096;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20485 f70097;

    public /* synthetic */ C21896(C23034 c23034, C20485 c20485) {
        this.f70096 = c23034;
        this.f70097 = c20485;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܶ᩺ܿ] */
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
    public final InterfaceC6724 m49276() {
        final C20485 c20485 = this.f70097;
        return this.f70096.m51195((C15544) new LongSupplier() { // from class: l.ܶ᩺ܿ
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return c20485.getPosition();
            }
        });
    }
}
