package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20076 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21094(InterfaceC10688 interfaceC10688, AbstractC11359 abstractC11359, AbstractC11359 abstractC113510, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21095(AbstractC11359 abstractC11359, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public void m45456(Collection collection, StringBuilder sb) {
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            ((InterfaceC5994) it.next()).mo13436(this, sb);
        }
    }
}
