package l;

/* JADX INFO: renamed from: l.᩵֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19113 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60217;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f60218;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f60219;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f60220;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f60221;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f60222;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f60223;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f60224;

    public C19113(InterfaceC19383 interfaceC19383) {
        this.f60219 = interfaceC19383;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44060() {
        this.f60221 = false;
        this.f60217 = false;
        this.f60223 = false;
        this.f60224 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44062(int i, long j) {
        this.f60224 = i;
        this.f60223 = false;
        this.f60221 = i == 182 || i == 179;
        this.f60217 = i == 182;
        this.f60218 = 0;
        this.f60220 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44061(int i, int i2, byte[] bArr) {
        if (this.f60217) {
            int i3 = this.f60218;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f60223 = ((bArr[i4] & 192) >> 6) == 0;
                this.f60217 = false;
            } else {
                this.f60218 = (i2 - i) + i3;
            }
        }
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
    public final void m44063(long j, int i, boolean z) {
        C22632.m50634(this.f60220 != -9223372036854775807L);
        if (this.f60224 == 182 && z && this.f60221) {
            this.f60219.mo8455(this.f60220, this.f60223 ? 1 : 0, (int) (j - this.f60222), i, null);
        }
        if (this.f60224 != 179) {
            this.f60222 = j;
        }
    }
}
