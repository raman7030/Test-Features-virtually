package p067l;

/* JADX INFO: renamed from: l.᩵֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20533 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f63449;

    /* JADX INFO: renamed from: ۜ */
    public int f63450;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20790 f63451;

    /* JADX INFO: renamed from: ܳ */
    public long f63452;

    /* JADX INFO: renamed from: ܽ */
    public boolean f63453;

    /* JADX INFO: renamed from: ܿ */
    public long f63454;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f63455;

    /* JADX INFO: renamed from: ᩻ */
    public int f63456;

    public C20533(InterfaceC20790 interfaceC20790) {
        this.f63451 = interfaceC20790;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46354() {
        this.f63453 = false;
        this.f63449 = false;
        this.f63455 = false;
        this.f63456 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46356(int i, long j) {
        this.f63456 = i;
        this.f63455 = false;
        this.f63453 = i == 182 || i == 179;
        this.f63449 = i == 182;
        this.f63450 = 0;
        this.f63452 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46355(int i, int i2, byte[] bArr) {
        if (this.f63449) {
            int i3 = this.f63450;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f63455 = ((bArr[i4] & 192) >> 6) == 0;
                this.f63449 = false;
            } else {
                this.f63450 = (i2 - i) + i3;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m46357(long j, int i, boolean z) {
        C23877.m52960(this.f63452 != -9223372036854775807L);
        if (this.f63456 == 182 && z && this.f63453) {
            this.f63451.mo10502(this.f63452, this.f63455 ? 1 : 0, (int) (j - this.f63454), i, null);
        }
        if (this.f63456 != 179) {
            this.f63454 = j;
        }
    }
}
