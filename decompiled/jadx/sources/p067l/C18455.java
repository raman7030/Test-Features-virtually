package p067l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18455 {

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadPoolExecutor f55168 = new ThreadPoolExecutor(0, 3, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: ۧ */
    public static Handler f55169;

    /* JADX INFO: renamed from: ܽ */
    public static HandlerThread f55170;

    /* JADX INFO: renamed from: ֫ */
    public static void m42012(Runnable runnable) {
        if (f55169 == null) {
            synchronized (C18455.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f55170 = handlerThread;
                handlerThread.start();
                f55169 = new Handler(f55170.getLooper());
            }
        }
        f55169.post(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Executor m42011() {
        return new ExecutorC13092();
    }
}
