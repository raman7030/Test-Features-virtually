package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18632 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19151(InterfaceC8754 interfaceC8754, AbstractC9460 abstractC9460, AbstractC9460 abstractC9461, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19152(AbstractC9460 abstractC9460, Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m43190(Collection collection, StringBuilder sb) {
        Iterator it = new ArrayList(collection).iterator();
        while (it.hasNext()) {
            ((InterfaceC3815) it.next()).mo11500(this, sb);
        }
    }
}
