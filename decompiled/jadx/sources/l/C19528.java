package l;

/* JADX INFO: renamed from: l.᩵ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31EV */
/* JADX INFO: loaded from: classes5.dex */
public class C19528 implements InterfaceC23760 {
    @Override // l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        if (interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        InterfaceC1454 value = interfaceC21211.getValue();
        String strMo2086 = mo2086(value);
        interfaceC13965.mo1294(strMo2086);
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        C9650.m24588(interfaceC13965, C9650.m24585(c14587, value));
        interfaceC13965.mo1290(strMo2086);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo2086(InterfaceC1454 interfaceC1454) {
        return C9650.m24587(interfaceC1454);
    }
}
