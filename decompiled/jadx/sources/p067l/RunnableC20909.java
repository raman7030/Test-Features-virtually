package p067l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩵ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20909 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final C19644 f65663;

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicBoolean f65664 = new AtomicBoolean();

    public RunnableC20909(C19644 c19644) {
        this.f65663 = c19644;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f65664.compareAndSet(false, true)) {
            try {
                this.f65663.close();
            } catch (Throwable unused) {
            }
        }
    }
}
