package p067l;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۨܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S38E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13530 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m30788(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
