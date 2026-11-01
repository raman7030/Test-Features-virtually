package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴᩳ */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public final class C1780 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9381 f62825;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f62826 = new ArrayList();

    public C1780(AbstractC9381 abstractC9381) {
        this.f62825 = abstractC9381;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45921(InterfaceC18749 interfaceC18749) {
        this.f62825.mo21806(interfaceC18749);
        this.f62826.add(interfaceC18749);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45920() {
        ArrayList arrayList = this.f62826;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f62825.mo21807((InterfaceC18749) it.next());
        }
        arrayList.clear();
    }
}
