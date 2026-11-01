package p067l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7SD */
/* JADX INFO: loaded from: classes4.dex */
public class C16559 extends AbstractCallableC15888 {

    /* JADX INFO: renamed from: ֫ */
    public C5127 f48631;

    @Override // p067l.AbstractCallableC15888, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        call();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractCallableC15888 m37531(C5127 c5127) {
        AbstractCallableC15888 abstractCallableC15888 = (AbstractCallableC15888) c5127.m10904(AbstractCallableC15888.class);
        if (abstractCallableC15888 != null) {
            return abstractCallableC15888;
        }
        C16559 c16559 = new C16559();
        c16559.f48631 = c5127;
        C13565.m30871(c5127);
        c16559.f48631.m10906(AbstractCallableC15888.class, c16559);
        return c16559;
    }

    @Override // p067l.AbstractCallableC15888, java.util.concurrent.Callable
    public Boolean call() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37532(Set set) {
        InterfaceC7888 interfaceC7888 = (InterfaceC7888) this.f48631.m10904(InterfaceC7888.class);
        if (interfaceC7888 != null) {
            Iterator it = interfaceC7888.m18223().iterator();
            if (it.hasNext()) {
                InterfaceC11912 interfaceC11912 = (InterfaceC11912) it.next();
                List list = C7480.stream(interfaceC11912.m27229().entrySet()).map(new C10223(5)).toList();
                try {
                    InterfaceC24606 interfaceC24606 = (InterfaceC24606) interfaceC11912.m27230();
                    interfaceC24606.init();
                    throw null;
                } catch (RuntimeException e) {
                    throw new C18438(e);
                }
            }
        }
        LinkedHashSet<C4848> linkedHashSet = new LinkedHashSet(set);
        ServiceLoader<InterfaceC24606> serviceLoaderM6757 = C3606.m6726(this.f48631).m6757();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (InterfaceC24606 interfaceC24607 : serviceLoaderM6757) {
            interfaceC24607.getClass();
            for (C4848 c4848 : linkedHashSet) {
                if ("doclint-not-available".equals(c4848.f11034)) {
                    linkedHashSet.remove(c4848);
                    linkedHashSet2.remove(interfaceC24607);
                    try {
                        C4848 c4849 = c4848.f11035;
                        interfaceC24607.init();
                        throw null;
                    } catch (RuntimeException e2) {
                        throw new C18438(e2);
                    }
                }
            }
        }
        for (C4848 c48410 : linkedHashSet) {
            C23623 c23623M52439 = C23623.m52439(this.f48631);
            String str = (String) c48410.f11034;
            C14040 c14040 = C8300.f21997;
            c23623M52439.m9355(new C14040("compiler", "plugin.not.found", str));
        }
        Iterator it2 = linkedHashSet2.iterator();
        if (it2.hasNext()) {
            try {
                ((InterfaceC24606) it2.next()).init();
                throw null;
            } catch (RuntimeException e3) {
                throw new C18438(e3);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37533(C4848 c4848) {
        if (c4848.isEmpty()) {
            return;
        }
        try {
            AbstractC3148 abstractC3148M5381 = AbstractC3148.m5381();
            abstractC3148M5381.init();
            throw null;
        } catch (IllegalStateException unused) {
            C23623.m52439(this.f48631).m9354(C15675.f45430);
        }
    }
}
