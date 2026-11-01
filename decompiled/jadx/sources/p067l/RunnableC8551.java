package p067l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8551 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (C11234.class) {
            for (Map.Entry entry : C11234.f31248.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == null) {
                    C11234.f31247.remove((Runnable) entry.getValue());
                    C11234.f31248.remove(entry.getKey());
                }
            }
            if (C11234.f31248.isEmpty() && C11234.f31247 != null) {
                C11234.f31247.shutdown();
                C11234.f31247.setCorePoolSize(0);
                C11234.f31247 = null;
            }
        }
    }
}
