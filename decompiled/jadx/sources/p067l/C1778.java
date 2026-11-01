package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ᩴܽ */
/* JADX INFO: compiled from: G9LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C1778 {

    /* JADX INFO: renamed from: ֫ */
    public final Executor f62717;

    /* JADX INFO: renamed from: ۧ */
    public final Object f62718 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f62719 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public boolean f62720;

    public C1778(Executor executor, C1000 c1000) {
        this.f62717 = executor;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45844() {
        boolean z;
        synchronized (this.f62718) {
            z = this.f62720;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45843() {
        synchronized (this.f62718) {
            this.f62720 = true;
            Iterator it = this.f62719.iterator();
            while (it.hasNext()) {
                ((InterfaceC4387) it.next()).mo6293();
            }
            this.f62719.clear();
            C10027 c10027 = C10027.f27775;
        }
    }
}
