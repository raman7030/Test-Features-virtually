package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9460 implements InterfaceC3815 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f28700;

    /* JADX INFO: renamed from: ֫ */
    public abstract Collection mo5710(InterfaceC8754 interfaceC8754);

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC8754[] mo5713();

    public AbstractC9460(Object obj) {
        this.f28700 = obj;
    }

    public String toString() {
        return this.f28700.toString();
    }

    @Override // l.InterfaceC3815
    /* JADX INFO: renamed from: ֫ */
    public final void mo11500(AbstractC18632 abstractC18632, Object obj) {
        abstractC18632.mo19152(this, obj);
        for (InterfaceC8754 interfaceC8754 : mo5713()) {
            Iterator it = new ArrayList(mo5710(interfaceC8754)).iterator();
            while (it.hasNext()) {
                abstractC18632.mo19151(interfaceC8754, this, (AbstractC9460) it.next(), obj);
            }
        }
    }
}
