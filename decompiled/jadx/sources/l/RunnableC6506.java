package l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6506 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (C9329.class) {
            for (Map.Entry entry : C9329.f28298.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == null) {
                    C9329.f28297.remove((Runnable) entry.getValue());
                    C9329.f28298.remove(entry.getKey());
                }
            }
            if (C9329.f28298.isEmpty() && C9329.f28297 != null) {
                C9329.f28297.shutdown();
                C9329.f28297.setCorePoolSize(0);
                C9329.f28297 = null;
            }
        }
    }
}
