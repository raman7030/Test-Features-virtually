package p067l;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9975 */
/* JADX INFO: loaded from: classes.dex */
public final class C24711 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m54350(Process process, long j) throws InterruptedException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (Build.VERSION.SDK_INT >= 26) {
            return process.waitFor(j, timeUnit);
        }
        long jNanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                }
                nanos = timeUnit.toNanos(j) - (System.nanoTime() - jNanoTime);
            }
        } while (nanos > 0);
        return false;
    }
}
