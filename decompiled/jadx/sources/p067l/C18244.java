package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1EB */
/* JADX INFO: loaded from: classes4.dex */
public class C18244 implements InterfaceC24950 {
    @Override // p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        if (!interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        interfaceC15641.mo3702("complex");
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        if (interfaceC22528.getParent() != 0) {
            interfaceC15641.mo3699("parent", C11419.m26400(interfaceC22528.getParent()));
        }
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        Iterator it = interfaceC22528.values().iterator();
        while (it.hasNext()) {
            m41506(interfaceC15641, (InterfaceC3751) it.next(), c16232);
        }
        interfaceC15641.mo3698("complex");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41506(InterfaceC15641 interfaceC15641, InterfaceC3751 interfaceC3751, C16232 c16232) {
        String strM26601 = C11540.m26601(interfaceC3751);
        interfaceC15641.mo3702(strM26601);
        if (interfaceC3751.mo7249() != -1) {
            interfaceC15641.mo3699("id", C11419.m26400(interfaceC3751.mo7249()));
        }
        C11540.m26602(interfaceC15641, C11540.m26599(c16232, interfaceC3751));
        interfaceC15641.mo3698(strM26601);
    }
}
