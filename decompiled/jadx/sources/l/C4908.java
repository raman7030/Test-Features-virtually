package l;

/* JADX INFO: renamed from: l.ۙ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4908 extends C1380 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3497 f15495;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f15496;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19955 f15497;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        EnumC9848 enumC9848 = (EnumC9848) obj;
        C3497 c3497 = this.f15495;
        C6319 c6319 = c3497.f11081;
        C20661 c20661 = c6319.f19609;
        AbstractC4308 abstractC4308 = c6319.f19609.f66522;
        EnumC15678 enumC15678 = c19831.f64065;
        int i = C11070.f33246[enumC15678.ordinal()];
        if (i == 1) {
            AbstractC4308 abstractC4309 = c19831.f64066;
            abstractC4309.getClass();
            abstractC4308 = (AbstractC4308) abstractC4309.mo2962(c3497, enumC9848);
            if (abstractC4308.m12913(EnumC9454.BOT)) {
                return c20661.f66522;
            }
        } else if (i == 2) {
            AbstractC4308 abstractC43010 = c19831.f64066;
            EnumC9848 enumC9848Mo18991 = enumC9848.mo18991();
            abstractC43010.getClass();
            abstractC4308 = (AbstractC4308) abstractC43010.mo2962(c3497, enumC9848Mo18991);
            if (abstractC4308.m12913(EnumC9454.BOT)) {
                abstractC4308 = c20661.f66526;
                enumC15678 = EnumC15678.UNBOUND;
            }
        }
        return new C20431(abstractC4308, enumC15678, c3497.f11081.f19609.f66480);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2140(AbstractC4308 abstractC4308, EnumC9848 enumC9848) {
        EnumC15678 enumC15678;
        C3497 c3497 = this.f15495;
        C6319 c6319 = c3497.f11081;
        Object obj = EnumC9848.f29810;
        if (enumC9848 == obj) {
            return c6319.f19609.f66522;
        }
        Object obj2 = EnumC9848.f29808;
        abstractC4308.getClass();
        AbstractC4308 abstractC4309 = (AbstractC4308) abstractC4308.mo2962(c3497, obj2);
        AbstractC4308 abstractC43010 = (AbstractC4308) abstractC4308.mo2962(c3497, obj);
        C2609 c2609Mo12938 = this.f15497.f13890.f17560.mo12938();
        if (!c6319.m17550(abstractC4309, c6319.f19609.f66526)) {
            AbstractC4308 abstractC43011 = this.f15496;
            if (abstractC43011.m12928(c2609Mo12938) || !c6319.m17546(abstractC43011, abstractC4309, true)) {
                enumC15678 = EnumC15678.EXTENDS;
            } else if (!abstractC43010.m12913(EnumC9454.BOT)) {
                abstractC4309 = abstractC43010;
                enumC15678 = EnumC15678.SUPER;
            } else {
                abstractC4309 = c6319.f19609.f66526;
                enumC15678 = EnumC15678.UNBOUND;
            }
        } else if (!abstractC43010.m12913(EnumC9454.BOT)) {
            abstractC4309 = abstractC43010;
            enumC15678 = EnumC15678.SUPER;
        } else {
            abstractC4309 = c6319.f19609.f66526;
            enumC15678 = EnumC15678.UNBOUND;
        }
        return new C20431(abstractC4309, enumC15678, c3497.f11081.f19609.f66480);
    }

    public C4908(C3497 c3497, C19955 c19955, AbstractC4308 abstractC4308) {
        this.f15495 = c3497;
        this.f15497 = c19955;
        this.f15496 = abstractC4308;
    }
}
