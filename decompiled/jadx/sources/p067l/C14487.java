package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F6LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14487 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f41373 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f41374 = new HashMap(32);

    /* JADX INFO: renamed from: ֫ */
    public final void m33137(InterfaceC7131 interfaceC7131) {
        this.f41373.add(interfaceC7131);
        Iterator it = interfaceC7131.mo16408().iterator();
        while (it.hasNext()) {
            C15525.putIfAbsent(this.f41374, (Class) it.next(), interfaceC7131);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33139(AbstractC2555 abstractC2555) {
        InterfaceC7131 interfaceC7131 = (InterfaceC7131) this.f41374.get(abstractC2555.getClass());
        if (interfaceC7131 != null) {
            interfaceC7131.mo16407(abstractC2555);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33138(AbstractC2555 abstractC2555) {
        C21230.forEach(this.f41373, new C14478(2, abstractC2555));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33136(AbstractC2555 abstractC2555) {
        C21230.forEach(this.f41373, new C20955(1, abstractC2555));
    }
}
