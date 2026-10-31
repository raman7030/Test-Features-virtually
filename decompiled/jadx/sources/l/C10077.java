package l;

/* JADX INFO: renamed from: l.ۤۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10077 extends AbstractC4432 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2609 f30362;

    public C10077(AbstractC4308 abstractC4308, C2609 c2609) {
        super(EnumC9454.FORALL, (C10658) abstractC4308);
        this.f30362 = c2609;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo1357(C20743 c20743) {
        throw new AssertionError("Cannot add metadata to a forall type");
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2744(this, obj);
    }

    @Override // l.AbstractC4432, l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m12911(sb, false);
        sb.append('<');
        sb.append(this.f30362);
        sb.append('>');
        sb.append(this.f14167);
        return sb.toString();
    }

    @Override // l.AbstractC4432, l.AbstractC4308
    /* JADX INFO: renamed from: ܽ֫ */
    public final C2609 mo12938() {
        return this.f30362;
    }

    @Override // l.AbstractC4432, l.AbstractC4308
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo12948() {
        return this.f14167.mo12948();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12912(AbstractC4308 abstractC4308) {
        return this.f14167.mo12912(abstractC4308);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩹ */
    public final C10658 mo12945() {
        return (C10658) this.f14167;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۙ */
    public final void mo12918() {
        for (C2609 c2609 = this.f30362; c2609.m8249(); c2609 = c2609.f8241) {
            ((C8541) c2609.f8240).mo12939().mo12918();
        }
        this.f14167.mo12918();
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public final EnumC0701 mo3256() {
        return EnumC0701.EXECUTABLE;
    }
}
