package l;

/* JADX INFO: renamed from: l.ۚۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C5120 implements InterfaceC4869 {
    @Override // l.InterfaceC4869
    /* JADX INFO: renamed from: ֫ */
    public final void mo1321(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        C8665 c8665 = (C8665) abstractC0197;
        InterfaceC1592 interfaceC1592Mo22000 = interfaceC3458.mo10587().m43812().mo22000(C8665.class);
        if (interfaceC1592Mo22000 == null) {
            interfaceC3458.mo10586(c8665);
            return;
        }
        int length = interfaceC3458.length();
        interfaceC3458.mo10586(c8665);
        if (length == interfaceC3458.length()) {
            interfaceC3458.builder().append((char) 65532);
        }
        C18981 c18981Mo10587 = interfaceC3458.mo10587();
        boolean z = c8665.mo1355() instanceof C2315;
        AbstractC11304 abstractC11304M43809 = c18981Mo10587.m43809();
        String strM22423 = c8665.m22423();
        abstractC11304M43809.getClass();
        InterfaceC14040 interfaceC14040Mo10583 = interfaceC3458.mo10583();
        AbstractC15203.f46435.m29086(interfaceC14040Mo10583, strM22423);
        AbstractC15203.f46437.m29086(interfaceC14040Mo10583, Boolean.valueOf(z));
        AbstractC15203.f46436.m29086(interfaceC14040Mo10583, null);
        interfaceC3458.mo10584(length, interfaceC1592Mo22000.mo5310(c18981Mo10587, interfaceC14040Mo10583));
    }
}
