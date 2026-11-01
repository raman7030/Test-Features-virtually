package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB32 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4081 {

    /* JADX INFO: renamed from: ܿ */
    public static Handler f8989;

    /* JADX INFO: renamed from: ᩳ */
    public static final ExecutorService f8990 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: ۧ */
    public static final ExecutorService f8987 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ܽ */
    public static final ThreadPoolExecutor f8988 = m8185(64);

    /* JADX INFO: renamed from: ֫ */
    public static final ExecutorService f8986 = Executors.newFixedThreadPool(C19110.f57020);

    static {
        Thread thread = new Thread(new RunnableC9288(0));
        thread.setName("Custom-Looper");
        thread.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m8186() {
        Looper.prepare();
        Looper looperMyLooper = Looper.myLooper();
        C12826.requireNonNull(looperMyLooper);
        f8989 = new Handler(looperMyLooper);
        Looper.loop();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ThreadPoolExecutor m8185(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8189(ExecutorService executorService) {
        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Handler m8190() {
        while (true) {
            Handler handler = f8989;
            if (handler != null) {
                return handler;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8188(Runnable runnable, Object obj, long j) {
        Handler handlerM8190 = m8190();
        handlerM8190.removeCallbacksAndMessages(obj);
        handlerM8190.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8187(Object obj, long j, Runnable runnable) {
        Handler handlerM8190 = m8190();
        handlerM8190.removeCallbacksAndMessages(obj);
        handlerM8190.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m8184(ExecutorService executorService, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(executorService.submit((Callable) it.next()));
        }
        return arrayList2;
    }
}
