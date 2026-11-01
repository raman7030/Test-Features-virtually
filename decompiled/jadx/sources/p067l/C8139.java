package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8139 implements InterfaceC6798 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24232 f21445;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC5655 f21446;

    public C8139(C24232 c24232, InterfaceC5655 interfaceC5655) {
        this.f21445 = c24232;
        this.f21446 = interfaceC5655;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18856(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC3445 interfaceC3445 = (InterfaceC3445) it.next();
            if (interfaceC3445.isClosed()) {
                String strName = interfaceC3445.name();
                AbstractC4406 abstractC4406 = this.f21445;
                AbstractC9480 abstractC9480Mo9166 = abstractC4406.mo9166(strName);
                if (abstractC9480Mo9166 != null) {
                    abstractC9480Mo9166.mo22082(this.f21446, abstractC4406, (InterfaceC16855) interfaceC3445);
                } else {
                    m18856(interfaceC3445.mo6113());
                }
            }
        }
    }
}
