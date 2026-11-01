package p067l;

/* JADX INFO: renamed from: l.᩵ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31EV */
/* JADX INFO: loaded from: classes5.dex */
public class C20928 implements InterfaceC24950 {
    @Override // p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        if (interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        InterfaceC3751 value = interfaceC22528.getValue();
        String strMo4467 = mo4467(value);
        interfaceC15641.mo3702(strMo4467);
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        C11540.m26602(interfaceC15641, C11540.m26599(c16232, value));
        interfaceC15641.mo3698(strMo4467);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo4467(InterfaceC3751 interfaceC3751) {
        return C11540.m26601(interfaceC3751);
    }
}
