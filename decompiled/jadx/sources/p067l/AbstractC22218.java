package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K56X */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22218 extends AbstractC7465 implements InterfaceC2461 {
    public String getSignature() {
        InterfaceC21909 interfaceC21909;
        InterfaceC21650 interfaceC21650;
        Iterator it = getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                interfaceC21909 = null;
                break;
            }
            interfaceC21909 = (InterfaceC21909) it.next();
        } while (!interfaceC21909.getType().equals("Ldalvik/annotation/Signature;"));
        if (interfaceC21909 != null) {
            Iterator it2 = interfaceC21909.getElements().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    interfaceC21650 = null;
                    break;
                }
                InterfaceC11180 interfaceC11180 = (InterfaceC11180) it2.next();
                if (interfaceC11180.getName().equals(C0226b.f1011d)) {
                    InterfaceC12262 value = interfaceC11180.getValue();
                    if (value.mo4670() == 28) {
                        interfaceC21650 = (InterfaceC21650) value;
                        break;
                    }
                }
            }
            if (interfaceC21650 != null) {
                StringBuilder sb = new StringBuilder();
                for (InterfaceC12262 interfaceC12262 : interfaceC21650.getValue()) {
                    if (interfaceC12262.mo4670() == 23) {
                        sb.append(((InterfaceC19007) interfaceC12262).getValue());
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }
}
