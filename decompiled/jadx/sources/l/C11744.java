package l;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۨܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S38E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11744 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m28740(Future future) {
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
