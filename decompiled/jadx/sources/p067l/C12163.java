package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12163 implements InterfaceC6798 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24232 f34002;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC5655 f34003;

    public C12163(C24232 c24232, InterfaceC5655 interfaceC5655) {
        this.f34002 = c24232;
        this.f34003 = interfaceC5655;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28085(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC10151 interfaceC10151 = (InterfaceC10151) it.next();
            if (interfaceC10151.isClosed()) {
                String strName = interfaceC10151.name();
                AbstractC4406 abstractC4406 = this.f34002;
                AbstractC9480 abstractC9480Mo9166 = abstractC4406.mo9166(strName);
                if (abstractC9480Mo9166 != null) {
                    abstractC9480Mo9166.mo22082(this.f34003, abstractC4406, interfaceC10151);
                }
            }
        }
    }
}
