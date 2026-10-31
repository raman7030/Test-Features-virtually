package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R704 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5254 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16448;

    public /* synthetic */ RunnableC5254(int i, Object obj) {
        this.f16447 = i;
        this.f16448 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16447) {
            case 0:
                try {
                    ((Runnable) this.f16448).run();
                } catch (RuntimeException unused) {
                    return;
                }
                break;
            default:
                Iterator it = ((List) this.f16448).iterator();
                while (it.hasNext()) {
                    ((C19697) it.next()).m45351();
                }
                break;
        }
    }
}
