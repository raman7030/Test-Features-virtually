package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ۘۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAY3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3763 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC21587 f11853;

    static {
        Object next;
        String strM48481 = C21402.m48481("kotlinx.coroutines.fast.service.loader");
        if (strM48481 != null) {
            Boolean.parseBoolean(strM48481);
        }
        try {
            try {
                Iterator it = Arrays.asList(new C1125()).iterator();
                C11233.m27805(it, "<this>");
                Iterator it2 = C20656.m47242(new C7704(new C2311(it))).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        ((InterfaceC2352) next).getClass();
                        do {
                            ((InterfaceC2352) it2.next()).getClass();
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                InterfaceC2352 interfaceC2352 = (InterfaceC2352) next;
                if (interfaceC2352 != null) {
                    f11853 = interfaceC2352.mo3838();
                } else {
                    C18580.m43107(3, null);
                    throw null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            C18580.m43107(2, th2);
            throw null;
        }
    }
}
