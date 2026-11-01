package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7362 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f19286;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f19287;

    public /* synthetic */ RunnableC7362(int i, Object obj) {
        this.f19286 = i;
        this.f19287 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19286) {
            case 0:
                try {
                    ((Runnable) this.f19287).run();
                } catch (RuntimeException unused) {
                    return;
                }
                break;
            default:
                Iterator it = ((List) this.f19287).iterator();
                while (it.hasNext()) {
                    ((C21089) it.next()).m47648();
                }
                break;
        }
    }
}
