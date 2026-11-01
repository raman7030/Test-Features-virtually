package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12123 implements InterfaceC10770 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f33872;

    /* JADX INFO: renamed from: ۜ */
    public int f33873;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC9756 f33874;

    /* JADX INFO: renamed from: ۢ */
    public C11098 f33875;

    /* JADX INFO: renamed from: ۧ */
    public C19781 f33876;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC22852 f33877;

    /* JADX INFO: renamed from: ܺ */
    public C11915 f33878;

    /* JADX INFO: renamed from: ܽ */
    public C5931 f33879;

    /* JADX INFO: renamed from: ܿ */
    public C4747 f33880;

    /* JADX INFO: renamed from: ᩳ */
    public long f33881;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f33882;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC12878 f33883;

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24807() {
        return this;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC10770 mo24809(InterfaceC12878 interfaceC12878) {
        m28020(interfaceC12878);
        return this;
    }

    public C12123(InterfaceC16716 interfaceC16716) {
        this(new C17486(interfaceC16716));
    }

    public C12123(InterfaceC22852 interfaceC22852) {
        this.f33877 = interfaceC22852;
        this.f33879 = new C5931();
        this.f33875 = new C11098();
        this.f33874 = C20486.f63267;
        this.f33883 = new C24356();
        this.f33876 = new C19781();
        this.f33873 = 1;
        this.f33881 = -9223372036854775807L;
        this.f33872 = true;
        this.f33882 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28020(InterfaceC12878 interfaceC12878) {
        C23877.m52955(interfaceC12878, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f33883 = interfaceC12878;
    }

    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24808(C11915 c11915) {
        this.f33878 = c11915;
        return this;
    }

    @Override // p067l.InterfaceC10770
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 mo24810(boolean z) {
        this.f33882 = z;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28019(InterfaceC9756 interfaceC9756) {
        this.f33874 = interfaceC9756;
    }

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
    @Override // p067l.InterfaceC10770
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6076 mo24806(C13010 c13010) {
        c13010.f36611.getClass();
        if (this.f33880 == null) {
            this.f33880 = new C4747();
        }
        C11915 c11915 = this.f33878;
        if (c11915 != null) {
            this.f33880.m10049(c11915);
        }
        this.f33880.m10050(this.f33882);
        this.f33880.getClass();
        C4747 c4747 = this.f33880;
        List list = c13010.f36611.f38435;
        boolean zIsEmpty = list.isEmpty();
        C11098 c11098 = this.f33875;
        InterfaceC15790 c21157 = c11098;
        if (!zIsEmpty) {
            c21157 = new C21157(c11098, list);
        }
        InterfaceC6601 interfaceC6601M13313 = this.f33879.m13313(c13010);
        InterfaceC12878 interfaceC12878 = this.f33883;
        return new C8099(c13010, this.f33877, c4747, this.f33876, interfaceC6601M13313, interfaceC12878, this.f33874.mo22783(this.f33877, interfaceC12878, c21157), this.f33881, this.f33872, this.f33873);
    }
}
