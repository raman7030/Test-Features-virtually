package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22830 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C23500 f71910;

    /* JADX INFO: renamed from: ᩹ */
    public final C6736 f71911;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22830(C23500 c23500, C6736 c6736) {
        super("OkHttp %s", c23500.f74873);
        this.f71910 = c23500;
        this.f71911 = c6736;
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
    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() throws Throwable {
        Throwable th;
        EnumC15197 enumC15197;
        ?? r0 = this.f71910;
        C6736 c6736 = this.f71911;
        EnumC15197 enumC15198 = EnumC15197.INTERNAL_ERROR;
        ?? r3 = 1;
        try {
            try {
                try {
                    if (!c6736.m15397(true, this)) {
                        C19477.m44290("Required SETTINGS preface not received", new Object[0]);
                        throw null;
                    }
                    while (c6736.m15397(false, this)) {
                    }
                    enumC15197 = EnumC15197.NO_ERROR;
                    try {
                        enumC15198 = EnumC15197.CANCEL;
                        r0.m52261(enumC15197, enumC15198);
                        r3 = enumC15197;
                    } catch (IOException unused) {
                        enumC15198 = EnumC15197.PROTOCOL_ERROR;
                        r0.m52261(enumC15198, enumC15198);
                        r3 = enumC15197;
                    }
                    C21407.m48495(c6736);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r0.m52261(r3, enumC15198);
                    } catch (IOException unused2) {
                    }
                    C21407.m48495(c6736);
                    throw th;
                }
            } catch (IOException unused3) {
                enumC15197 = enumC15198;
            } catch (Throwable th3) {
                th = th3;
                r3 = enumC15198;
                r0.m52261(r3, enumC15198);
                C21407.m48495(c6736);
                throw th;
            }
        } catch (IOException unused4) {
        }
    }
}
