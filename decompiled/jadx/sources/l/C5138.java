package l;

/* JADX INFO: renamed from: l.ۚۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C5138 extends AbstractC4308 implements InterfaceC8090, InterfaceC19047 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f16077;

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo12908() {
        return true;
    }

    @Override // l.AbstractC4308, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 7;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo12936() {
        return true;
    }

    public C5138(AbstractC4308 abstractC4308, AbstractC19810 abstractC19810) {
        this(abstractC4308, abstractC19810, C20743.f66779);
    }

    public C5138(AbstractC4308 abstractC4308, AbstractC19810 abstractC19810, C20743 c20743) {
        super(abstractC19810, c20743);
        this.f16077 = abstractC4308;
    }

    public C5138(C5138 c5138) {
        this(c5138.f16077, c5138.f13890, c5138.f13889);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo1357(C20743 c20743) {
        return new C19250(this, this.f16077, this.f13890, c20743);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.ARRAY;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2141(this, obj);
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC4308 abstractC4308 = this.f16077;
        while (abstractC4308.mo3256() == EnumC0701.ARRAY) {
            abstractC4308 = ((C5138) abstractC4308).f16077;
        }
        sb.append(abstractC4308);
        AbstractC4308 abstractC4309 = this;
        do {
            abstractC4309.m12911(sb, true);
            sb.append("[]");
            abstractC4309 = ((C5138) abstractC4309).f16077;
        } while (abstractC4309.mo3256() == EnumC0701.ARRAY);
        return sb.toString();
    }

    @Override // l.AbstractC4308
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5138)) {
            return false;
        }
        C5138 c5138 = (C5138) obj;
        return this == c5138 || this.f16077.equals(c5138.f16077);
    }

    public final int hashCode() {
        return this.f16077.hashCode() + (EnumC9454.ARRAY.ordinal() << 5);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܶ */
    public final C2609 mo12934() {
        return this.f16077.mo12934();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo12948() {
        return this.f16077.mo12948();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean mo12917() {
        return this.f16077.mo12917();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo12920() {
        return this.f16077.mo12920();
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C5138 m14698() {
        return new C0198(this.f16077, this.f13890, this.f13889);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12912(AbstractC4308 abstractC4308) {
        return abstractC4308.m12929(this) || this.f16077.mo12912(abstractC4308);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۙ */
    public final void mo12918() {
        this.f16077.mo12918();
    }

    /* JADX INFO: renamed from: ܿ */
    public AbstractC4308 mo1358() {
        return this.f16077;
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public final EnumC0701 mo3256() {
        return EnumC0701.ARRAY;
    }
}
