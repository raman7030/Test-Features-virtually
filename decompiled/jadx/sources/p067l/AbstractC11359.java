package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11359 implements InterfaceC5994 {

    /* JADX INFO: renamed from: ᩸ */
    public final Object f31649;

    /* JADX INFO: renamed from: ֫ */
    public abstract Collection mo7943(InterfaceC10688 interfaceC10688);

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC10688[] mo7946();

    public AbstractC11359(Object obj) {
        this.f31649 = obj;
    }

    public String toString() {
        return this.f31649.toString();
    }

    @Override // p067l.InterfaceC5994
    /* JADX INFO: renamed from: ֫ */
    public final void mo13436(AbstractC20076 abstractC20076, Object obj) {
        abstractC20076.mo21095(this, obj);
        for (InterfaceC10688 interfaceC10688 : mo7946()) {
            Iterator it = new ArrayList(mo7943(interfaceC10688)).iterator();
            while (it.hasNext()) {
                abstractC20076.mo21094(interfaceC10688, this, (AbstractC11359) it.next(), obj);
            }
        }
    }
}
