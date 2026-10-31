package l;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۤ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10631 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26668(ExecutorService executorService) {
        C17189 c17189;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = (c17189 = (C17189) executorService).isTerminated())) {
            c17189.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = c17189.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c17189.shutdownNow();
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
