package p067l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ۘۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAY3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5945 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC22885 f14659;

    static {
        Object next;
        String strM50817 = C22709.m50817("kotlinx.coroutines.fast.service.loader");
        if (strM50817 != null) {
            Boolean.parseBoolean(strM50817);
        }
        try {
            try {
                Iterator it = Arrays.asList(new C3438()).iterator();
                C13045.m29867(it, "<this>");
                Iterator it2 = C22000.m49569(new C9691(new C4565(it))).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        ((InterfaceC4604) next).getClass();
                        do {
                            ((InterfaceC4604) it2.next()).getClass();
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                InterfaceC4604 interfaceC4604 = (InterfaceC4604) next;
                if (interfaceC4604 != null) {
                    f14659 = interfaceC4604.mo6095();
                } else {
                    C20027.m45385(3, null);
                    throw null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            C20027.m45385(2, th2);
            throw null;
        }
    }
}
