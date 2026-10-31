package l;

/* JADX INFO: renamed from: l.ۖ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2792 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6319 f8708;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8621(char c);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8624(AbstractC10370 abstractC10370);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8625(C14163 c14163) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo8626(byte[] bArr);

    public AbstractC2792(C6319 c6319) {
        this.f8708 = c6319;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo8628(AbstractC4308 abstractC4308) {
        throw new C16196(abstractC4308);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo8627(AbstractC4308 abstractC4308) {
        int i = C11070.f33247[abstractC4308.mo3258().ordinal()];
        if (i == 14) {
            C19831 c19831 = (C19831) abstractC4308;
            EnumC15678 enumC15678 = c19831.f64065;
            int i2 = C11070.f33246[enumC15678.ordinal()];
            if (i2 == 1) {
                mo8621('+');
                mo8627(c19831.f64066);
                return;
            } else if (i2 == 2) {
                mo8621('-');
                mo8627(c19831.f64066);
                return;
            } else {
                if (i2 == 3) {
                    mo8621('*');
                    return;
                }
                throw new AssertionError(enumC15678);
            }
        }
        if (i == 18) {
            C10077 c10077 = (C10077) abstractC4308;
            m8622(c10077.f30362);
            mo8627(c10077.f14167);
            return;
        }
        if (i != 19) {
            switch (i) {
                case 1:
                    mo8621('[');
                    mo8627(((C5138) abstractC4308).f16077);
                    return;
                case 2:
                    if (abstractC4308.mo5146()) {
                        mo8628(abstractC4308);
                    }
                    mo8621('L');
                    m8623(abstractC4308);
                    mo8621(';');
                    return;
                case 3:
                    mo8621('B');
                    return;
                case 4:
                    mo8621('C');
                    return;
                case 5:
                    mo8621('S');
                    return;
                case 6:
                    mo8621('I');
                    return;
                case 7:
                    mo8621('J');
                    return;
                case 8:
                    mo8621('F');
                    return;
                case 9:
                    mo8621('D');
                    return;
                case 10:
                    mo8621('Z');
                    return;
                case 11:
                    mo8621('V');
                    return;
                case 12:
                    if (((C8541) abstractC4308).mo22227()) {
                        mo8628(abstractC4308);
                    }
                    mo8621('T');
                    mo8624(abstractC4308.f13890.f17562);
                    mo8621(';');
                    return;
                default:
                    throw new AssertionError("typeSig " + abstractC4308.mo3258());
            }
        }
        C10658 c10658 = (C10658) abstractC4308;
        mo8621('(');
        for (C2609 c2609 = c10658.f32059; c2609.m8249(); c2609 = c2609.f8241) {
            mo8627((AbstractC4308) c2609.f8240);
        }
        mo8621(')');
        mo8627(c10658.f32060);
        for (C2609 c26010 = c10658.f32061; c26010.m8249(); c26010 = c26010.f8241) {
            if (((AbstractC4308) c26010.f8240).m12913(EnumC9454.TYPEVAR)) {
                for (C2609 c26011 = c10658.f32061; c26011.m8249(); c26011 = c26011.f8241) {
                    mo8621('^');
                    mo8627((AbstractC4308) c26011.f8240);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8623(AbstractC4308 abstractC4308) {
        AbstractC10370 abstractC10370M26172;
        C19955 c19955 = (C19955) abstractC4308;
        C14163 c14163 = (C14163) c19955.f13890;
        mo8625(c14163);
        AbstractC4308 abstractC4308Mo4958 = c19955.mo4958();
        if (abstractC4308Mo4958.mo12934().m8249()) {
            EnumC1296 enumC1296 = c14163.f17561.f17559;
            EnumC1296 enumC1297 = EnumC1296.f4571;
            C6319 c6319 = this.f8708;
            boolean z = enumC1296 == enumC1297 || c14163.f17562 == c6319.f19600.f18867;
            if (z) {
                abstractC4308Mo4958 = c6319.m17519(abstractC4308Mo4958);
            }
            m8623(abstractC4308Mo4958);
            mo8621(z ? '$' : '.');
            C12171.m29642(c14163.f42771.m26176(c14163.f17561.m16071().f42771));
            if (z) {
                abstractC10370M26172 = c14163.f42771.m26172(c14163.f17561.m16071().f42771.mo2759() + 1, c14163.f42771.mo2759());
            } else {
                abstractC10370M26172 = c14163.f17562;
            }
            mo8624(abstractC10370M26172);
        } else {
            mo8626(C18382.m42812(c14163.f42771));
        }
        if (c19955.mo12938().m8249()) {
            mo8621('<');
            for (C2609 c2609Mo12938 = c19955.mo12938(); c2609Mo12938.m8249(); c2609Mo12938 = c2609Mo12938.f8241) {
                mo8627((AbstractC4308) c2609Mo12938.f8240);
            }
            mo8621('>');
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8622(C2609 c2609) {
        mo8621('<');
        while (c2609.m8249()) {
            C8541 c8541 = (C8541) c2609.f8240;
            mo8624(c8541.f13890.f17562);
            C2609 c2609M17484 = this.f8708.m17484(c8541);
            if ((((AbstractC4308) c2609M17484.f8240).f13890.mo16084() & 512) != 0) {
                mo8621(':');
            }
            while (c2609M17484.m8249()) {
                mo8621(':');
                mo8627((AbstractC4308) c2609M17484.f8240);
                c2609M17484 = c2609M17484.f8241;
            }
            c2609 = c2609.f8241;
        }
        mo8621('>');
    }
}
