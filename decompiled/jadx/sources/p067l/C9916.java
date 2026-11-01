package p067l;

/* JADX INFO: renamed from: l.۠ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C9916 implements InterfaceC6996 {
    @Override // p067l.InterfaceC6996
    /* JADX INFO: renamed from: ֫ */
    public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        C20662 c20662 = (C20662) abstractC2555;
        int length = interfaceC5655.length();
        interfaceC5655.mo12594(c20662);
        AbstractC13147 abstractC13147Mo3768 = c20662.mo3768();
        if (abstractC13147Mo3768 instanceof C16636) {
            final C16636 c16636 = (C16636) abstractC13147Mo3768;
            AbstractC6564.f16938.m31139(interfaceC5655.mo12591(), EnumC23328.ORDERED);
            AbstractC6564.f16936.m31139(interfaceC5655.mo12591(), Integer.valueOf(c16636.m37707()));
            AbstractC6564.f16940.m31139(interfaceC5655.mo12591(), new InterfaceC21317() { // from class: l.֨ۙۘ
                @Override // p067l.InterfaceC21317
                /* JADX INFO: renamed from: ֫ */
                public final int mo5550() {
                    return c16636.m37707() - 1;
                }
            });
            c16636.m37702(c16636.m37707() + 1);
        } else {
            AbstractC6564.f16938.m31139(interfaceC5655.mo12591(), EnumC23328.BULLET);
            C13702 c13702 = AbstractC6564.f16933;
            InterfaceC15712 interfaceC15712Mo12591 = interfaceC5655.mo12591();
            int i = 0;
            for (AbstractC2555 abstractC2555Mo3768 = c20662.mo3768(); abstractC2555Mo3768 != null; abstractC2555Mo3768 = abstractC2555Mo3768.mo3768()) {
                if (abstractC2555Mo3768 instanceof C20662) {
                    i++;
                }
            }
            c13702.m31139(interfaceC15712Mo12591, Integer.valueOf(i));
        }
        interfaceC5655.mo12593(c20662, length);
        if (interfaceC5655.mo12596(c20662)) {
            interfaceC5655.mo12597();
        }
    }
}
