package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۗۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7I4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5265 {

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f12392 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final void m11381(String str) {
        synchronized (this.f12392) {
            while (this.f12392.contains(str)) {
                try {
                    this.f12392.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("线程被中断", e);
                }
            }
            this.f12392.add(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11382(String str) {
        synchronized (this.f12392) {
            this.f12392.remove(str);
            this.f12392.notifyAll();
        }
    }
}
