package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K56X */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20886 extends AbstractC5363 implements InterfaceC0098 {
    public String getSignature() {
        InterfaceC20561 interfaceC20561;
        InterfaceC20288 interfaceC20288;
        Iterator it = getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                interfaceC20561 = null;
                break;
            }
            interfaceC20561 = (InterfaceC20561) it.next();
        } while (!interfaceC20561.getType().equals("Ldalvik/annotation/Signature;"));
        if (interfaceC20561 != null) {
            Iterator it2 = interfaceC20561.getElements().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    interfaceC20288 = null;
                    break;
                }
                InterfaceC9272 interfaceC9272 = (InterfaceC9272) it2.next();
                if (interfaceC9272.getName().equals(b.d)) {
                    InterfaceC10410 value = interfaceC9272.getValue();
                    if (value.mo2302() == 28) {
                        interfaceC20288 = (InterfaceC20288) value;
                        break;
                    }
                }
            }
            if (interfaceC20288 != null) {
                StringBuilder sb = new StringBuilder();
                for (InterfaceC10410 interfaceC10410 : interfaceC20288.getValue()) {
                    if (interfaceC10410.mo2302() == 23) {
                        sb.append(((InterfaceC17507) interfaceC10410).getValue());
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }
}
