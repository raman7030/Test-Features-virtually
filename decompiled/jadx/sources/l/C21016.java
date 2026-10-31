package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩷ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes5.dex */
public final class C21016 implements InterfaceC7274 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9021 f67836;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12918 f67837;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22706 f67838;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11138 f67839;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BitSet f67840;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47828(C12918 c12918, C9021 c9021, C11138 c11138, C22706 c22706, BitSet bitSet) {
        this.f67837 = c12918;
        this.f67836 = c9021;
        this.f67839 = c11138;
        this.f67838 = c22706;
        this.f67840 = bitSet;
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
    @Override // l.InterfaceC7274
    /* JADX INFO: renamed from: ֫ */
    public final void mo19516(int i) throws C3059 {
        C12918 c12918 = this.f67837;
        C9021 c9021 = this.f67836;
        C11138 c11138 = this.f67839;
        C22706 c22706 = this.f67838;
        BitSet bitSet = this.f67840;
        if (bitSet == null || !bitSet.get(i)) {
            int i2 = c9021.f27385;
            c22706.m50718();
            c12918.m31385(i, c22706, false);
            c11138.m27626(c22706.m50717(), new C9727(c9021));
            if (bitSet == null || c9021.f27385 != i2) {
                return;
            }
            bitSet.set(i);
        }
    }
}
