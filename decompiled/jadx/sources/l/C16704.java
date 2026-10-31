package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1EB */
/* JADX INFO: loaded from: classes4.dex */
public class C16704 implements InterfaceC23760 {
    @Override // l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        if (!interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        interfaceC13965.mo1294("complex");
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        if (interfaceC21211.getParent() != 0) {
            interfaceC13965.mo1291("parent", C9523.m24390(interfaceC21211.getParent()));
        }
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        Iterator it = interfaceC21211.values().iterator();
        while (it.hasNext()) {
            m39270(interfaceC13965, (InterfaceC1454) it.next(), c14587);
        }
        interfaceC13965.mo1290("complex");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39270(InterfaceC13965 interfaceC13965, InterfaceC1454 interfaceC1454, C14587 c14587) {
        String strM24587 = C9650.m24587(interfaceC1454);
        interfaceC13965.mo1294(strM24587);
        if (interfaceC1454.mo5006() != -1) {
            interfaceC13965.mo1291("id", C9523.m24390(interfaceC1454.mo5006()));
        }
        C9650.m24588(interfaceC13965, C9650.m24585(c14587, interfaceC1454));
        interfaceC13965.mo1290(strM24587);
    }
}
