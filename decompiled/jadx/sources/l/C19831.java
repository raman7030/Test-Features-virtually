package l;

/* JADX INFO: renamed from: l.᩶֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C19831 extends AbstractC4308 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f64063;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C8541 f64064;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC15678 f64065;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f64066;

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo12908() {
        return true;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo12936() {
        return true;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2144(this, obj);
    }

    public C19831(AbstractC4308 abstractC4308, EnumC15678 enumC15678, AbstractC19810 abstractC19810) {
        this(abstractC4308, enumC15678, abstractC19810, null, C20743.f66779);
    }

    public C19831(AbstractC4308 abstractC4308, EnumC15678 enumC15678, AbstractC19810 abstractC19810, C8541 c8541) {
        this(abstractC4308, enumC15678, abstractC19810, c8541, C20743.f66779);
    }

    public C19831(AbstractC4308 abstractC4308, EnumC15678 enumC15678, AbstractC19810 abstractC19810, C8541 c8541, C20743 c20743) {
        super(abstractC19810, c20743);
        this.f64063 = false;
        C12171.m29637(abstractC4308);
        this.f64066 = abstractC4308;
        this.f64065 = enumC15678;
        this.f64064 = c8541;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo1357(C20743 c20743) {
        return new C21947(this, this.f64066, this.f64065, this.f13890, this.f64064, c20743);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.WILDCARD;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12912(AbstractC4308 abstractC4308) {
        return this.f64065 != EnumC15678.UNBOUND && this.f64066.mo12912(abstractC4308);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo12924() {
        EnumC15678 enumC15678 = EnumC15678.SUPER;
        EnumC15678 enumC15679 = this.f64065;
        return enumC15679 == enumC15678 || enumC15679 == EnumC15678.UNBOUND;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean mo12922() {
        EnumC15678 enumC15678 = EnumC15678.EXTENDS;
        EnumC15678 enumC15679 = this.f64065;
        return enumC15679 == enumC15678 || enumC15679 == EnumC15678.UNBOUND;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo12944() {
        return this.f64065 == EnumC15678.UNBOUND;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC4308 mo12937(AbstractC4308 abstractC4308) {
        if (this.f64064 == abstractC4308) {
            return this;
        }
        this.f64064 = (C8541) abstractC4308;
        return this;
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m12911(sb, false);
        EnumC15678 enumC15678 = this.f64065;
        sb.append(enumC15678.toString());
        if (enumC15678 != EnumC15678.UNBOUND) {
            sb.append(this.f64066);
        }
        if (AbstractC4308.f13888 && this.f64064 != null && !this.f64063) {
            try {
                this.f64063 = true;
                sb.append("{:");
                sb.append(this.f64064.mo12939());
                sb.append(":}");
            } finally {
                this.f64063 = false;
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public final EnumC0701 mo3256() {
        return EnumC0701.WILDCARD;
    }
}
