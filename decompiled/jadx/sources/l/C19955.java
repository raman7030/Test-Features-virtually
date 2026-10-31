package l;

import com.alipay.sdk.m.w.a;

/* JADX INFO: renamed from: l.᩶ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C19955 extends AbstractC4308 implements InterfaceC19753, InterfaceC8090 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2609 f64616;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2609 f64617;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f64618;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2609 f64619;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2609 f64620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64621;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f64622;

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo12908() {
        return true;
    }

    @Override // l.AbstractC4308, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 7;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܺ֫ */
    public boolean mo12936() {
        return true;
    }

    @Override // l.InterfaceC19753
    /* JADX INFO: renamed from: ۠ */
    public AbstractC19810 mo45454() {
        return this.f13890;
    }

    public C19955(AbstractC19810 abstractC19810, AbstractC4308 abstractC4308, C2609 c2609) {
        this(abstractC4308, c2609, abstractC19810, C20743.f66779);
    }

    public C19955(AbstractC4308 abstractC4308, C2609 c2609, AbstractC19810 abstractC19810, C20743 c20743) {
        super(abstractC19810, c20743);
        this.f64621 = -1;
        this.f64622 = abstractC4308;
        this.f64616 = c2609;
        this.f64617 = null;
        this.f64618 = null;
        this.f64620 = null;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public C19955 mo1357(C20743 c20743) {
        return new C21366(this, this.f64622, this.f64616, this.f13890, c20743);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public EnumC9454 mo3258() {
        return EnumC9454.CLASS;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2145(this, obj);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4308 mo3257(Object obj) {
        return new C22071(mo4958(), this.f64616, this.f13890, this.f13889, obj);
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!mo4958().m12913(EnumC9454.CLASS) || this.f13890.f17561.f17559 != EnumC1296.f4582) {
            m12911(sb, false);
            sb.append(m46029((AbstractC5698) this.f13890, true));
        } else {
            sb.append(mo4958().toString());
            sb.append(".");
            m12911(sb, false);
            sb.append(m46029((AbstractC5698) this.f13890, false));
        }
        if (mo12938().m8249()) {
            sb.append('<');
            sb.append(mo12938().m8241(","));
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m46029(AbstractC5698 abstractC5698, boolean z) {
        String strM50106;
        if (abstractC5698.f17562.isEmpty() && (abstractC5698.mo16084() & 16777216) != 0) {
            StringBuilder sb = new StringBuilder(this.f64618.toString());
            for (C2609 c2609 = this.f64620; c2609.m8249(); c2609 = c2609.f8241) {
                sb.append(a.p);
                sb.append(((AbstractC4308) c2609.f8240).toString());
            }
            return sb.toString();
        }
        if (!abstractC5698.f17562.isEmpty()) {
            return z ? abstractC5698.mo16076().toString() : abstractC5698.f17562.toString();
        }
        C19955 c19955 = (C19955) this.f13890.f17560;
        if (c19955 == null) {
            strM50106 = C22364.m50106("anonymous.class", null);
        } else {
            C2609 c26010 = c19955.f64620;
            strM50106 = (c26010 == null || !c26010.m8249()) ? C22364.m50106("anonymous.class", c19955.f64618) : C22364.m50106("anonymous.class", c19955.f64620.f8240);
        }
        if (!AbstractC4308.f13888) {
            return strM50106;
        }
        StringBuilder sbM15339 = C5368.m15339(strM50106);
        sbM15339.append(String.valueOf(abstractC5698.hashCode()));
        return sbM15339.toString();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܽ֫ */
    public C2609 mo12938() {
        if (this.f64616 == null) {
            mo12918();
            if (this.f64616 == null) {
                this.f64616 = C2609.m8239();
            }
        }
        return this.f64616;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۫ */
    public AbstractC4308 mo4958() {
        return this.f64622;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo4959(AbstractC4308 abstractC4308) {
        this.f64622 = abstractC4308;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ܶ */
    public C2609 mo12934() {
        if (this.f64617 == null) {
            this.f64617 = mo12938().m8248(mo4958().mo12934());
        }
        return this.f64617;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo12948() {
        if (mo4958().mo12948() || AbstractC4308.m12905(mo12938())) {
            return true;
        }
        AbstractC4308 abstractC4308 = this.f13890.f17560;
        return this != abstractC4308 && abstractC4308.mo12948();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean mo12917() {
        return mo12934().f8241 != null;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo12920() {
        AbstractC4308 abstractC4308 = this.f13890.f17560;
        return this != abstractC4308 && abstractC4308.mo12934().m8249() && mo12934().isEmpty();
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12912(AbstractC4308 abstractC4308) {
        if (abstractC4308.m12929(this)) {
            return true;
        }
        if (mo12917() && (mo4958().mo12912(abstractC4308) || AbstractC4308.m12904(abstractC4308, mo12938()))) {
            return true;
        }
        if (mo5146()) {
            return this.f64618.mo12912(abstractC4308) || AbstractC4308.m12904(abstractC4308, this.f64620);
        }
        return false;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ۙ */
    public final void mo12918() {
        this.f13890.mo16101();
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* JADX INFO: renamed from: ֫ */
    public EnumC0701 mo3256() {
        this.f13890.m16103();
        return this.f13890.f17559 == EnumC1296.f4582 ? EnumC0701.DECLARED : EnumC0701.ERROR;
    }
}
