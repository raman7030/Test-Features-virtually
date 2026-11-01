package p067l;

import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩸᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23179 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24260 f72808;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C21838 f72809;

    public /* synthetic */ C23179(C24260 c24260, C21838 c21838) {
        this.f72808 = c24260;
        this.f72809 = c21838;
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
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8759 m51629() {
        final C21838 c21838 = this.f72809;
        return this.f72808.m53588((C17142) new LongSupplier() { // from class: l.ܶ᩺ܿ
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return c21838.getPosition();
            }
        });
    }
}
