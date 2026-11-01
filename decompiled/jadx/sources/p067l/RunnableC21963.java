package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21963 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final WeakReference f69019;

    public RunnableC21963(WeakReference weakReference) {
        this.f69019 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f69019;
        Runnable runnable = (Runnable) weakReference.get();
        if (runnable == null) {
            C11234.f31247.remove(this);
            C11234.f31248.remove(weakReference);
        } else {
            runnable.run();
        }
    }
}
