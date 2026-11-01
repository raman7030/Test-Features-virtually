package p067l;

/* JADX INFO: renamed from: l.ᩴܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20257 extends C18244 {
    @Override // p067l.C18244, p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public final void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        int iMo7247;
        if (!interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
            int iMo7249 = interfaceC3751.mo7249();
            if (iMo7249 < 16777220 || iMo7249 > 16777225 || ((iMo7247 = interfaceC3751.mo7247()) != 0 && iMo7247 != 1 && iMo7247 != 2 && iMo7247 != 3)) {
                super.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
                return;
            }
        }
        interfaceC15641.mo3702("plurals");
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        for (InterfaceC3751 interfaceC3752 : interfaceC22528.values()) {
            interfaceC15641.mo3702("item");
            interfaceC15641.mo3699("quantity", InterfaceC3751.f7973[interfaceC3752.mo7249() - 16777220]);
            C11540.m26602(interfaceC15641, C11540.m26599(c16232, interfaceC3752));
            interfaceC15641.mo3698("item");
        }
        interfaceC15641.mo3698("plurals");
    }
}
