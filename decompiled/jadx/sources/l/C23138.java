package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1EV */
/* JADX INFO: loaded from: classes.dex */
public final class C23138 extends C16704 {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    @Override // l.C16704, l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public final void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) throws IOException {
        String str;
        String strM24587;
        if (!interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        Iterator it = interfaceC21211.values().iterator();
        int i = 16777217;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (((InterfaceC1454) it.next()).mo5006() != i) {
                super.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
                return;
            }
            i = i2;
        }
        Iterator it2 = interfaceC21211.values().iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (i3 > 0) {
                    str = "string-array";
                }
                interfaceC13965.mo1294(str);
                interfaceC13965.mo1291("name", interfaceC21211.mo29406());
                C9650.m24592(interfaceC13965, interfaceC21211, c18116);
                for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                    if (z) {
                        strM24587 = C9650.m24587(interfaceC1454);
                    } else {
                        strM24587 = "item";
                    }
                    interfaceC13965.mo1294(strM24587);
                    C9650.m24588(interfaceC13965, C9650.m24585(c14587, interfaceC1454));
                    interfaceC13965.mo1290(strM24587);
                }
                interfaceC13965.mo1290(str);
                return;
            }
            InterfaceC1454 interfaceC1455 = (InterfaceC1454) it2.next();
            int iMo5004 = interfaceC1455.mo5004();
            if (iMo5004 != 2) {
                if (iMo5004 == 1) {
                    InterfaceC0748 interfaceC0748M34845 = c14587.m34845(interfaceC1455.getValue());
                    if (interfaceC0748M34845 == null || !interfaceC0748M34845.getTypeName().equals("string")) {
                    }
                    i3++;
                } else {
                    if (iMo5004 != 3) {
                    }
                    i3++;
                }
            }
            Iterator it3 = interfaceC21211.values().iterator();
            int i4 = 0;
            while (true) {
                if (it3.hasNext()) {
                    InterfaceC1454 interfaceC1456 = (InterfaceC1454) it3.next();
                    int iMo5005 = interfaceC1456.mo5004();
                    if (iMo5005 != 2) {
                        if (iMo5005 == 1) {
                            InterfaceC0748 interfaceC0748M34846 = c14587.m34845(interfaceC1456.getValue());
                            if (interfaceC0748M34846 == null || !interfaceC0748M34846.getTypeName().equals("integer")) {
                            }
                            i4++;
                        } else {
                            if (interfaceC1456.mo5004() != 16 && interfaceC1456.mo5004() != 17) {
                            }
                            i4++;
                        }
                    }
                } else if (i4 > 0) {
                    str = "integer-array";
                    break;
                }
                str = "array";
                z = true;
                break;
            }
            interfaceC13965.mo1294(str);
            interfaceC13965.mo1291("name", interfaceC21211.mo29406());
            C9650.m24592(interfaceC13965, interfaceC21211, c18116);
            while (r10.hasNext()) {
                if (z) {
                    strM24587 = C9650.m24587(interfaceC1454);
                } else {
                    strM24587 = "item";
                }
                interfaceC13965.mo1294(strM24587);
                C9650.m24588(interfaceC13965, C9650.m24585(c14587, interfaceC1454));
                interfaceC13965.mo1290(strM24587);
            }
            interfaceC13965.mo1290(str);
            return;
        }
    }
}
