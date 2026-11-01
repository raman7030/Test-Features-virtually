package p067l;

/* JADX INFO: renamed from: l.ܺܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91FI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17573 extends C20928 {
    @Override // p067l.C20928, p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public final void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        boolean z;
        if (interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        InterfaceC3751 value = interfaceC22528.getValue();
        if (value.mo7252() && !value.mo7251().mo12361() && value.mo7251().getValue().isEmpty()) {
            z = true;
        } else if (value.mo7247() != 18) {
            super.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
            return;
        } else {
            if (value.getValue() != 0) {
                super.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
                return;
            }
            z = false;
        }
        interfaceC15641.mo3702("id");
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        if (z) {
            interfaceC15641.mo3699("explicit", "true");
        }
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        interfaceC15641.mo3698("id");
    }
}
