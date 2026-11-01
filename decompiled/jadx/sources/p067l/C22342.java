package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes5.dex */
public final class C22342 implements InterfaceC9281 {

    /* JADX INFO: renamed from: ֫ */
    public C10942 f70521;

    /* JADX INFO: renamed from: ۧ */
    public C14645 f70522;

    /* JADX INFO: renamed from: ܽ */
    public C23948 f70523;

    /* JADX INFO: renamed from: ܿ */
    public C12954 f70524;

    /* JADX INFO: renamed from: ᩳ */
    public BitSet f70525;

    /* JADX INFO: renamed from: ֫ */
    public final void m50158(C14645 c14645, C10942 c10942, C12954 c12954, C23948 c23948, BitSet bitSet) {
        this.f70522 = c14645;
        this.f70521 = c10942;
        this.f70524 = c12954;
        this.f70523 = c23948;
        this.f70525 = bitSet;
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
    @Override // p067l.InterfaceC9281
    /* JADX INFO: renamed from: ֫ */
    public final void mo21483(int i) throws C5276 {
        C14645 c14645 = this.f70522;
        C10942 c10942 = this.f70521;
        C12954 c12954 = this.f70524;
        C23948 c23948 = this.f70523;
        BitSet bitSet = this.f70525;
        if (bitSet == null || !bitSet.get(i)) {
            int i2 = c10942.f30321;
            c23948.m53044();
            c14645.m33471(i, c23948, false);
            c12954.m29688(c23948.m53043(), new C11613(c10942));
            if (bitSet == null || c10942.f30321 != i2) {
                return;
            }
            bitSet.set(i);
        }
    }
}
