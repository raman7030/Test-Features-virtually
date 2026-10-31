package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21530 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f69210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4596 f69211;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21530(C22235 c22235, C4596 c4596) {
        super("OkHttp %s", c22235.f72148);
        this.f69210 = c22235;
        this.f69211 = c4596;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹ۧ֡] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ܰ֫֡] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
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
    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() throws Throwable {
        Throwable th;
        EnumC13499 enumC13499;
        ?? r0 = this.f69210;
        C4596 c4596 = this.f69211;
        EnumC13499 enumC134910 = EnumC13499.INTERNAL_ERROR;
        ?? r3 = 1;
        try {
            try {
                try {
                    if (!c4596.m13508(true, this)) {
                        C18002.m42040("Required SETTINGS preface not received", new Object[0]);
                        throw null;
                    }
                    while (c4596.m13508(false, this)) {
                    }
                    enumC13499 = EnumC13499.NO_ERROR;
                    try {
                        enumC134910 = EnumC13499.CANCEL;
                        r0.m49933(enumC13499, enumC134910);
                        r3 = enumC13499;
                    } catch (IOException unused) {
                        enumC134910 = EnumC13499.PROTOCOL_ERROR;
                        r0.m49933(enumC134910, enumC134910);
                        r3 = enumC13499;
                    }
                    C20032.m46179(c4596);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r0.m49933(r3, enumC134910);
                    } catch (IOException unused2) {
                    }
                    C20032.m46179(c4596);
                    throw th;
                }
            } catch (IOException unused3) {
                enumC13499 = enumC134910;
            } catch (Throwable th3) {
                th = th3;
                r3 = enumC134910;
                r0.m49933(r3, enumC134910);
                C20032.m46179(c4596);
                throw th;
            }
        } catch (IOException unused4) {
        }
    }
}
