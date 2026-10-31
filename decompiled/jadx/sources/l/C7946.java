package l;

/* JADX INFO: renamed from: l.۠ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1VF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7946 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5082 f24569;

    public C7946(C5082 c5082) {
        super(2);
        this.f24569 = c5082;
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* JADX INFO: renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        if (this.f24569.m14631(c2966.m45794())) {
            return;
        }
        c2966.mo13103((Object) c2966.m45794());
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        if (this.f24569.m14632(c12843.m13109())) {
            return;
        }
        String strM13109 = c12843.m13109();
        InterfaceC18776 interfaceC18776M37039 = C15706.m37039(c12843);
        if (!(interfaceC18776M37039 instanceof C20647)) {
            interfaceC18776M37039.mo13103(new C20647(strM13109));
        } else {
            ((C20647) interfaceC18776M37039).mo13103(strM13109);
        }
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        if (!EnumC15657.NATIVE.m36866(c10022.m13107())) {
            if (this.f24569.m14632(c10022.m13109())) {
                return;
            }
            m21250(c10022);
        } else {
            c2966.mo13103((Object) c2966.m45794());
            m21250(c10022);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21250(AbstractC12138 abstractC12138) {
        String strM13109 = abstractC12138.m13109();
        if (C22927.m51032(strM13109)) {
            return;
        }
        InterfaceC18776 interfaceC18776M37039 = C15706.m37039(abstractC12138);
        if (!(interfaceC18776M37039 instanceof C20647)) {
            interfaceC18776M37039.mo13103(new C20647(strM13109));
        } else {
            ((C20647) interfaceC18776M37039).mo13103(strM13109);
        }
    }
}
