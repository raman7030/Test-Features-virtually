package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10264 implements InterfaceC8840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f30908;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f30909;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC7773 f30910;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9185 f30911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18321 f30912;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21553 f30913;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10045 f30914;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3749 f30915;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2503 f30916;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f30917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30918;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC11058 f30919;

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22837() {
        return this;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC8840 mo22839(InterfaceC11058 interfaceC11058) {
        m25998(interfaceC11058);
        return this;
    }

    public C10264(InterfaceC15097 interfaceC15097) {
        this(new C15907(interfaceC15097));
    }

    public C10264(InterfaceC21553 interfaceC21553) {
        this.f30913 = interfaceC21553;
        this.f30915 = new C3749();
        this.f30911 = new C9185();
        this.f30910 = C19063.f60033;
        this.f30919 = new C23135();
        this.f30912 = new C18321();
        this.f30909 = 1;
        this.f30917 = -9223372036854775807L;
        this.f30908 = true;
        this.f30918 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25998(InterfaceC11058 interfaceC11058) {
        C22632.m50629(interfaceC11058, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f30919 = interfaceC11058;
    }

    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22838(C10045 c10045) {
        this.f30914 = c10045;
        return this;
    }

    @Override // l.InterfaceC8840
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8840 mo22840(boolean z) {
        this.f30918 = z;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25997(InterfaceC7773 interfaceC7773) {
        this.f30910 = interfaceC7773;
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
    @Override // l.InterfaceC8840
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3901 mo22836(C11197 c11197) {
        c11197.f33612.getClass();
        if (this.f30916 == null) {
            this.f30916 = new C2503();
        }
        C10045 c10045 = this.f30914;
        if (c10045 != null) {
            this.f30916.m8001(c10045);
        }
        this.f30916.m8002(this.f30918);
        this.f30916.getClass();
        C2503 c2503 = this.f30916;
        List list = c11197.f33612.f35425;
        boolean zIsEmpty = list.isEmpty();
        C9185 c9185 = this.f30911;
        InterfaceC14122 c19769 = c9185;
        if (!zIsEmpty) {
            c19769 = new C19769(c9185, list);
        }
        InterfaceC4454 interfaceC4454M11377 = this.f30915.m11377(c11197);
        InterfaceC11058 interfaceC11058 = this.f30919;
        return new C6030(c11197, this.f30913, c2503, this.f30912, interfaceC4454M11377, interfaceC11058, this.f30910.mo20802(this.f30913, interfaceC11058, c19769), this.f30917, this.f30908, this.f30909);
    }
}
