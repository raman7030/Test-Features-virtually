package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6072 implements InterfaceC4661 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23005 f18589;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3458 f18590;

    public C6072(C23005 c23005, InterfaceC3458 interfaceC3458) {
        this.f18589 = c23005;
        this.f18590 = interfaceC3458;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16927(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1133 interfaceC1133 = (InterfaceC1133) it.next();
            if (interfaceC1133.isClosed()) {
                String strName = interfaceC1133.name();
                AbstractC2143 abstractC2143 = this.f18589;
                AbstractC7483 abstractC7483Mo7071 = abstractC2143.mo7071(strName);
                if (abstractC7483Mo7071 != null) {
                    abstractC7483Mo7071.mo20106(this.f18590, abstractC2143, (InterfaceC15243) interfaceC1133);
                } else {
                    m16927(interfaceC1133.mo3872());
                }
            }
        }
    }
}
