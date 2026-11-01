package p067l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1EV */
/* JADX INFO: loaded from: classes.dex */
public final class C24359 extends C18244 {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    @Override // p067l.C18244, p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public final void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) throws IOException {
        String str;
        String strM26601;
        if (!interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        Iterator it = interfaceC22528.values().iterator();
        int i = 16777217;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (((InterfaceC3751) it.next()).mo7249() != i) {
                super.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
                return;
            }
            i = i2;
        }
        Iterator it2 = interfaceC22528.values().iterator();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                if (i3 > 0) {
                    str = "string-array";
                }
                interfaceC15641.mo3702(str);
                interfaceC15641.mo3699("name", interfaceC22528.mo31468());
                C11540.m26606(interfaceC15641, interfaceC22528, c19586);
                for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
                    if (z) {
                        strM26601 = C11540.m26601(interfaceC3751);
                    } else {
                        strM26601 = "item";
                    }
                    interfaceC15641.mo3702(strM26601);
                    C11540.m26602(interfaceC15641, C11540.m26599(c16232, interfaceC3751));
                    interfaceC15641.mo3698(strM26601);
                }
                interfaceC15641.mo3698(str);
                return;
            }
            InterfaceC3751 interfaceC3752 = (InterfaceC3751) it2.next();
            int iMo7247 = interfaceC3752.mo7247();
            if (iMo7247 != 2) {
                if (iMo7247 == 1) {
                    InterfaceC3080 interfaceC3080M36996 = c16232.m36996(interfaceC3752.getValue());
                    if (interfaceC3080M36996 == null || !interfaceC3080M36996.getTypeName().equals("string")) {
                    }
                    i3++;
                } else {
                    if (iMo7247 != 3) {
                    }
                    i3++;
                }
            }
            Iterator it3 = interfaceC22528.values().iterator();
            int i4 = 0;
            while (true) {
                if (it3.hasNext()) {
                    InterfaceC3751 interfaceC3753 = (InterfaceC3751) it3.next();
                    int iMo7248 = interfaceC3753.mo7247();
                    if (iMo7248 != 2) {
                        if (iMo7248 == 1) {
                            InterfaceC3080 interfaceC3080M36997 = c16232.m36996(interfaceC3753.getValue());
                            if (interfaceC3080M36997 == null || !interfaceC3080M36997.getTypeName().equals("integer")) {
                            }
                            i4++;
                        } else {
                            if (interfaceC3753.mo7247() != 16 && interfaceC3753.mo7247() != 17) {
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
            interfaceC15641.mo3702(str);
            interfaceC15641.mo3699("name", interfaceC22528.mo31468());
            C11540.m26606(interfaceC15641, interfaceC22528, c19586);
            while (r10.hasNext()) {
                if (z) {
                    strM26601 = C11540.m26601(interfaceC3751);
                } else {
                    strM26601 = "item";
                }
                interfaceC15641.mo3702(strM26601);
                C11540.m26602(interfaceC15641, C11540.m26599(c16232, interfaceC3751));
                interfaceC15641.mo3698(strM26601);
            }
            interfaceC15641.mo3698(str);
            return;
        }
    }
}
