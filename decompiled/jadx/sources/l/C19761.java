package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩵᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19761 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f63819 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10130 f63820;

    public C19761(C10130 c10130) {
        this.f63820 = c10130;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45459(C11999 c11999) {
        int i = c11999.f35927;
        C10130 c10130 = this.f63820;
        c10130.writeInt(i);
        c10130.writeInt(c11999.f35928);
        m45458(c11999.f35929);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45458(AbstractC20466 abstractC20466) {
        C10130 c10130 = this.f63820;
        if (abstractC20466 == null) {
            c10130.writeInt(-1);
            return;
        }
        IdentityHashMap identityHashMap = this.f63819;
        Integer num = (Integer) identityHashMap.get(abstractC20466);
        if (num != null) {
            c10130.writeInt(num.intValue());
            return;
        }
        c10130.writeInt(identityHashMap.size());
        identityHashMap.put(abstractC20466, Integer.valueOf(identityHashMap.size()));
        int i = 0;
        if (abstractC20466 instanceof C21877) {
            C21877 c21877 = (C21877) abstractC20466;
            c10130.writeByte(1);
            c10130.writeInt(c21877.f65976);
            c10130.writeByte(c21877.m49267() ? 1 : 0);
            C15525 c15525M49269 = c21877.m49269();
            while (i < c21877.f65976) {
                try {
                    char cM27310 = c15525M49269.f47458.m27310(i);
                    if (c21877.m49267()) {
                        c10130.writeByte(cM27310);
                    } else {
                        c10130.mo13227(cM27310);
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        c15525M49269.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c15525M49269.close();
            return;
        }
        AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
        c10130.writeByte(2);
        c10130.writeInt(abstractC20466Arr.length);
        int length = abstractC20466Arr.length;
        while (i < length) {
            m45458(abstractC20466Arr[i]);
            i++;
        }
    }
}
