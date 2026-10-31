package l;

/* JADX INFO: renamed from: l.ᩴܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18822 extends C16704 {
    @Override // l.C16704, l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public final void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        int iMo5004;
        if (!interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            int iMo5006 = interfaceC1454.mo5006();
            if (iMo5006 < 16777220 || iMo5006 > 16777225 || ((iMo5004 = interfaceC1454.mo5004()) != 0 && iMo5004 != 1 && iMo5004 != 2 && iMo5004 != 3)) {
                super.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
                return;
            }
        }
        interfaceC13965.mo1294("plurals");
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        for (InterfaceC1454 interfaceC1455 : interfaceC21211.values()) {
            interfaceC13965.mo1294("item");
            interfaceC13965.mo1291("quantity", InterfaceC1454.f5200[interfaceC1455.mo5006() - 16777220]);
            C9650.m24588(interfaceC13965, C9650.m24585(c14587, interfaceC1455));
            interfaceC13965.mo1290("item");
        }
        interfaceC13965.mo1290("plurals");
    }
}
