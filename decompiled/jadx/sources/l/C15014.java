package l;

/* JADX INFO: renamed from: l.ܶۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C15014 extends C8541 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C19831 f45790;

    @Override // l.C8541
    /* JADX INFO: renamed from: ۫֫ */
    public final boolean mo22227() {
        return true;
    }

    public C15014(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C19831 c19831) {
        super(abstractC5698, abstractC4309, abstractC10370);
        this.f26106 = abstractC4309;
        mo21267(abstractC4308);
        this.f45790 = c19831;
    }

    @Override // l.C8541, l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final C15014 mo1357(C20743 c20743) {
        AbstractC19810 abstractC19810 = this.f13890;
        AbstractC4308 abstractC4308Mo12939 = mo12939();
        mo12939();
        return new C7960(this, abstractC19810, abstractC4308Mo12939, this.f26106, this.f45790, c20743);
    }

    @Override // l.C8541, l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2143(this, obj);
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m12911(sb, false);
        sb.append("capture#");
        sb.append((((long) hashCode()) & 4294967295L) % 997);
        sb.append(" of ");
        sb.append(this.f45790);
        return sb.toString();
    }
}
