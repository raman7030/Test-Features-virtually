package l;

/* JADX INFO: renamed from: l.ܺܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91FI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15998 extends C19528 {
    @Override // l.C19528, l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public final void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        boolean z;
        if (interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        InterfaceC1454 value = interfaceC21211.getValue();
        if (value.mo5009() && !value.mo5008().mo10323() && value.mo5008().getValue().isEmpty()) {
            z = true;
        } else if (value.mo5004() != 18) {
            super.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
            return;
        } else {
            if (value.getValue() != 0) {
                super.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
                return;
            }
            z = false;
        }
        interfaceC13965.mo1294("id");
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        if (z) {
            interfaceC13965.mo1291("explicit", "true");
        }
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        interfaceC13965.mo1290("id");
    }
}
