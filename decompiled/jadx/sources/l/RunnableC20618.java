package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20618 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f66337;

    public RunnableC20618(WeakReference weakReference) {
        this.f66337 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f66337;
        Runnable runnable = (Runnable) weakReference.get();
        if (runnable == null) {
            C9329.f28297.remove(this);
            C9329.f28298.remove(weakReference);
        } else {
            runnable.run();
        }
    }
}
