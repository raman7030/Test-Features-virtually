package l;

/* JADX INFO: renamed from: l.᩻ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C23769 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f76938;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        boolean zMo12940 = abstractC4309.mo12940();
        C6319 c6319 = this.f76938;
        if (zMo12940) {
            return Boolean.valueOf(c6319.m17504(abstractC4309, abstractC4308));
        }
        return Boolean.valueOf(c6319.m17550(abstractC4308, abstractC4309));
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.WILDCARD)) {
            return Boolean.valueOf(this.f76938.m17550(c0779, abstractC4308));
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        boolean z;
        EnumC15678 enumC15678 = c19831.f64065;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        boolean zMo12940 = abstractC4308.mo12940();
        C6319 c6319 = this.f76938;
        if (zMo12940) {
            return Boolean.valueOf(c6319.m17504(abstractC4308, c19831));
        }
        EnumC9454 enumC9454 = EnumC9454.WILDCARD;
        if (!abstractC4308.m12913(enumC9454)) {
            if (abstractC4308.m12913(EnumC9454.TYPEVAR) || !((C8541) abstractC4308).mo22227()) {
                z = false;
                if ((c19831.mo12922() || c6319.m17546(c6319.m17513(c19831), c6319.m17513(abstractC4308), false)) && (c19831.mo12924() || c6319.m17546(c6319.m17511(abstractC4308), c6319.m17511(c19831), false))) {
                    z = true;
                }
            } else {
                C19831 c19832 = ((C15014) abstractC4308).f45790;
                if (c19832.m12913(enumC9454) && c19832.f64065 == enumC15678 && c19832.f64066 == c19831.f64066) {
                    z = true;
                } else {
                    z = false;
                    if (c19831.mo12922()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            C19831 c19833 = (C19831) abstractC4308;
            if (c19833.f64065 == enumC15678 && c19833.f64066 == c19831.f64066) {
                z = true;
            } else if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
                z = false;
                if (c19831.mo12922()) {
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = false;
                if (c19831.mo12922()) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public C23769(C6319 c6319) {
        this.f76938 = c6319;
    }
}
