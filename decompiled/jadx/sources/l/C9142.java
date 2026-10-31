package l;

/* JADX INFO: renamed from: l.ۡ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C9142 extends AbstractC12669 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f27680;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f27681;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27682;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return abstractC4308;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308M17519;
        if (!this.f27682) {
            return c8541;
        }
        if (c8541.mo12939().mo12912((AbstractC4308) c8541)) {
            abstractC4308M17519 = this.f27680.m17519(c8541.mo12939());
        } else {
            abstractC4308M17519 = (AbstractC4308) c8541.mo12939().mo2962(this, (Object) null);
        }
        return m23509(abstractC4308M17519, c8541, EnumC15678.EXTENDS);
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2143(C15014 c15014, Object obj) {
        AbstractC4308 abstractC4308M17519;
        C19831 c19831 = c15014.f45790;
        AbstractC4308 abstractC4308 = c19831.f64066;
        if (abstractC4308.mo12912((AbstractC4308) c15014)) {
            abstractC4308M17519 = this.f27680.m17519(abstractC4308);
        } else {
            abstractC4308M17519 = (AbstractC4308) abstractC4308.mo2962(this, (Object) null);
        }
        return m23509((AbstractC4308) abstractC4308M17519.mo2962(this, (Object) null), c19831.f64064, c19831.f64065);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) c19831.f64066.mo2962(this, (Object) null);
        return c19831.f64066 == abstractC4308 ? c19831 : m23509(abstractC4308, c19831.f64064, c19831.f64065);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        C18837 c18837 = new C18837();
        boolean z = false;
        for (AbstractC4308 abstractC4308 : c19955.mo12934()) {
            AbstractC4308 abstractC4309 = (AbstractC4308) abstractC4308.mo2962(this, (Object) null);
            if (abstractC4308 != abstractC4309) {
                z = true;
            }
            c18837.m43511(abstractC4309);
        }
        if (!z) {
            return c19955;
        }
        AbstractC4308 abstractC43010 = c19955.f13890.f17560;
        return this.f27680.m17488(abstractC43010, abstractC43010.mo12934(), c18837.m43517());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19831 m23509(AbstractC4308 abstractC4308, C8541 c8541, EnumC15678 enumC15678) {
        C6319 c6319 = this.f27680;
        C20661 c20661 = c6319.f19609;
        int i = C11070.f33246[enumC15678.ordinal()];
        boolean z = this.f27681;
        if (i == 1) {
            if (z) {
                return C6319.m17458(c6319, m23510(abstractC4308), c8541);
            }
            return C6319.m17458(c6319, c20661.f66526, c8541);
        }
        if (i == 2) {
            if (z) {
                return C6319.m17471(c6319, c20661.f66522, c8541);
            }
            return C6319.m17471(c6319, m23510(abstractC4308), c8541);
        }
        if (i == 3) {
            return C6319.m17458(c6319, c20661.f66526, c8541);
        }
        C12171.m29640("Invalid bound kind " + enumC15678);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23510(AbstractC4308 abstractC4308) {
        C20661 c20661 = this.f27680.f19609;
        while (abstractC4308.m12913(EnumC9454.WILDCARD)) {
            C19831 c19831 = (C19831) abstractC4308;
            EnumC15678 enumC15678 = c19831.f64065;
            boolean z = this.f27681;
            if (z) {
                if (enumC15678 == EnumC15678.EXTENDS) {
                    abstractC4308 = c19831.f64066;
                } else {
                    abstractC4308 = null;
                }
            } else if (enumC15678 == EnumC15678.SUPER) {
                abstractC4308 = c19831.f64066;
            } else {
                abstractC4308 = null;
            }
            if (abstractC4308 == null) {
                abstractC4308 = z ? c20661.f66526 : c20661.f66522;
            }
        }
        return abstractC4308;
    }

    public C9142(C6319 c6319, boolean z, boolean z2) {
        this.f27680 = c6319;
        this.f27681 = z;
        this.f27682 = z2;
    }
}
