package l;

/* JADX INFO: renamed from: l.᩸۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21448 extends AbstractC20536 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f69061;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4308 m48583(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        if (abstractC4309.f13889 == C20743.f66779) {
            return abstractC4308;
        }
        switch (C11070.f33248[abstractC4308.mo3256().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return abstractC4308;
            default:
                return abstractC4308.mo1357(abstractC4308.f13889.m47377(EnumC23564.ANNOTATIONS));
        }
    }

    @Override // l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return abstractC4308.mo12941() ? abstractC4308 : m48583(abstractC4308, abstractC4308);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        return m48583(this.f69061.m17476(c8541.mo12939(), ((Boolean) obj).booleanValue()), (AbstractC4308) c8541);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        C6319 c6319 = this.f69061;
        return m48583(c6319.m17476(c6319.m17511(c19831), ((Boolean) obj).booleanValue()), (AbstractC4308) c19831);
    }

    @Override // l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo2140(Object obj, AbstractC4308 abstractC4308) {
        return abstractC4308.mo12941() ? abstractC4308 : m48583(abstractC4308, abstractC4308);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo2144(C19831 c19831, Object obj) {
        C6319 c6319 = this.f69061;
        return m48583(c6319.m17476(c6319.m17511(c19831), ((Boolean) obj).booleanValue()), (AbstractC4308) c19831);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2145(C19955 c19955, Boolean bool) {
        AbstractC4308 abstractC4308Mo16091 = c19955.f13890.mo16091(this.f69061);
        if (bool.booleanValue()) {
            return new C3021(abstractC4308Mo16091.mo4958(), C2609.m8239(), abstractC4308Mo16091.f13890, c19955.f13889.m47377(EnumC23564.ANNOTATIONS));
        }
        return m48583(abstractC4308Mo16091, (AbstractC4308) c19955);
    }

    public C21448(C6319 c6319) {
        this.f69061 = c6319;
    }
}
