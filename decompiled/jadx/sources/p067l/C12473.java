package p067l;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12473 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28708(ExecutorService executorService) {
        C18705 c18705;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = (c18705 = (C18705) executorService).isTerminated())) {
            c18705.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = c18705.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c18705.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
