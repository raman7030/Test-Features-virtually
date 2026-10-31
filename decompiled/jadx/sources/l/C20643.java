package l;

/* JADX INFO: renamed from: l.᩷ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C20643 implements InterfaceC4869 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l.InterfaceC4869
    /* JADX INFO: renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        boolean zM43088;
        C21365 c21365 = (C21365) abstractC0197;
        AbstractC11342 abstractC11342Mo1355 = c21365.mo1355();
        if (abstractC11342Mo1355 != null) {
            AbstractC0197 abstractC0197Mo1355 = abstractC11342Mo1355.mo1355();
            if (abstractC0197Mo1355 instanceof AbstractC18543) {
                zM43088 = ((AbstractC18543) abstractC0197Mo1355).m43088();
            } else {
                zM43088 = false;
            }
        } else {
            zM43088 = false;
        }
        if (!zM43088) {
            interfaceC3458.mo10592(c21365);
        }
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(c21365);
        AbstractC4415.f14118.m29086(interfaceC3458.mo10583(), Boolean.valueOf(zM43088));
        interfaceC3458.mo10585(c21365, length);
        if (zM43088) {
            return;
        }
        interfaceC3458.mo10590(c21365);
    }
}
