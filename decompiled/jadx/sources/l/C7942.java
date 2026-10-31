package l;

/* JADX INFO: renamed from: l.۠ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C7942 implements InterfaceC4869 {
    @Override // l.InterfaceC4869
    /* JADX INFO: renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        C19249 c19249 = (C19249) abstractC0197;
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(c19249);
        AbstractC11342 abstractC11342Mo1355 = c19249.mo1355();
        if (abstractC11342Mo1355 instanceof C15013) {
            final C15013 c15013 = (C15013) abstractC11342Mo1355;
            AbstractC4415.f14122.m29086(interfaceC3458.mo10583(), EnumC22054.ORDERED);
            AbstractC4415.f14120.m29086(interfaceC3458.mo10583(), Integer.valueOf(c15013.m35551()));
            AbstractC4415.f14124.m29086(interfaceC3458.mo10583(), new InterfaceC19938() { // from class: l.֨ۙۘ
                @Override // l.InterfaceC19938
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final int mo3236() {
                    return c15013.m35551() - 1;
                }
            });
            c15013.m35546(c15013.m35551() + 1);
        } else {
            AbstractC4415.f14122.m29086(interfaceC3458.mo10583(), EnumC22054.BULLET);
            C11925 c11925 = AbstractC4415.f14117;
            InterfaceC14040 interfaceC14040Mo10583 = interfaceC3458.mo10583();
            int i = 0;
            for (AbstractC0197 abstractC0197Mo1355 = c19249.mo1355(); abstractC0197Mo1355 != null; abstractC0197Mo1355 = abstractC0197Mo1355.mo1355()) {
                if (abstractC0197Mo1355 instanceof C19249) {
                    i++;
                }
            }
            c11925.m29086(interfaceC14040Mo10583, Integer.valueOf(i));
        }
        interfaceC3458.mo10585(c19249, length);
        if (interfaceC3458.mo10588(c19249)) {
            interfaceC3458.mo10589();
        }
    }
}
