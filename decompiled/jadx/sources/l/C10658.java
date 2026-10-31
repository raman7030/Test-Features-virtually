package l;

/* JADX INFO: renamed from: l.ۧ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10658 extends AbstractC4308 implements InterfaceC8090 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f32058;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2609 f32059;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f32060;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2609 f32061;

    @Override // l.AbstractC4308, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 16;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC19810 mo12943() {
        return null;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩹ */
    public final C10658 mo12945() {
        return this;
    }

    public C10658(C2609 c2609, AbstractC4308 abstractC4308, C2609 c26010, AbstractC19810 abstractC19810) {
        super(abstractC19810, C20743.f66779);
        this.f32059 = c2609;
        this.f32060 = abstractC4308;
        this.f32061 = c26010;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo1357(C20743 c20743) {
        throw new AssertionError("Cannot add metadata to a method type");
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.METHOD;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo7394(this, obj);
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m12911(sb, false);
        sb.append('(');
        sb.append(this.f32059);
        sb.append(')');
        sb.append(this.f32060);
        return sb.toString();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܰ */
    public final C2609 mo12933() {
        return this.f32059;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC4308 mo12923() {
        return this.f32060;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۧ֫ */
    public final C2609 mo12930() {
        return this.f32061;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo12948() {
        if (AbstractC4308.m12905(this.f32059)) {
            return true;
        }
        AbstractC4308 abstractC4308 = this.f32060;
        return abstractC4308 != null && abstractC4308.mo12948();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12912(AbstractC4308 abstractC4308) {
        return abstractC4308.m12929(this) || AbstractC4308.m12904(abstractC4308, this.f32059) || this.f32060.mo12912(abstractC4308) || AbstractC4308.m12904(abstractC4308, this.f32061);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۙ */
    public final void mo12918() {
        for (C2609 c2609 = this.f32059; c2609.m8249(); c2609 = c2609.f8241) {
            ((AbstractC4308) c2609.f8240).mo12918();
        }
        this.f32060.mo12918();
        this.f32058.mo12918();
        for (C2609 c26010 = this.f32061; c26010.m8249(); c26010 = c26010.f8241) {
            ((AbstractC4308) c26010.f8240).mo12918();
        }
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public final EnumC0701 mo3256() {
        return EnumC0701.EXECUTABLE;
    }
}
