package bin.mt.plugin.api.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class ThreadUtil {
    public static final Handler HANDLER = new Handler(Looper.getMainLooper());
    public static final Thread UI_THREAD = Looper.getMainLooper().getThread();

    public static boolean isInUiThread() {
        return UI_THREAD == Thread.currentThread();
    }

    public static void assertInUIThread() {
        if (!isInUiThread()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (isInUiThread()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void post(Runnable runnable) {
        HANDLER.post(runnable);
    }

    public static void postDelayed(Runnable runnable, long j) {
        HANDLER.postDelayed(runnable, j);
    }
}
