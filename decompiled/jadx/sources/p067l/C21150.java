package p067l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.᩵᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21150 {

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f66454 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final C11996 f66455;

    public C21150(C11996 c11996) {
        this.f66455 = c11996;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47766(C13773 c13773) {
        int i = c13773.f38937;
        C11996 c11996 = this.f66455;
        c11996.writeInt(i);
        c11996.writeInt(c13773.f38938);
        m47765(c13773.f38939);
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
    /* JADX INFO: renamed from: ֫ */
    private void m47765(AbstractC21820 abstractC21820) {
        C11996 c11996 = this.f66455;
        if (abstractC21820 == null) {
            c11996.writeInt(-1);
            return;
        }
        IdentityHashMap identityHashMap = this.f66454;
        Integer num = (Integer) identityHashMap.get(abstractC21820);
        if (num != null) {
            c11996.writeInt(num.intValue());
            return;
        }
        c11996.writeInt(identityHashMap.size());
        identityHashMap.put(abstractC21820, Integer.valueOf(identityHashMap.size()));
        int i = 0;
        if (abstractC21820 instanceof C23161) {
            C23161 c23161 = (C23161) abstractC21820;
            c11996.writeByte(1);
            c11996.writeInt(c23161.f68652);
            c11996.writeByte(c23161.m51619() ? 1 : 0);
            C17124 c17124M51621 = c23161.m51621();
            while (i < c23161.f68652) {
                try {
                    char cM29372 = c17124M51621.f50590.m29372(i);
                    if (c23161.m51619()) {
                        c11996.writeByte(cM29372);
                    } else {
                        c11996.mo15109(cM29372);
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        c17124M51621.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c17124M51621.close();
            return;
        }
        AbstractC21820[] abstractC21820Arr = ((C25172) abstractC21820).f80530;
        c11996.writeByte(2);
        c11996.writeInt(abstractC21820Arr.length);
        int length = abstractC21820Arr.length;
        while (i < length) {
            m47765(abstractC21820Arr[i]);
            i++;
        }
    }
}
