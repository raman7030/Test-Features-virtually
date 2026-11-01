package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۫ᩴ */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes4.dex */
public final class C1466 extends AbstractC4406 {

    /* JADX INFO: renamed from: ۧ */
    public final ExecutorService f40972;

    /* JADX INFO: renamed from: ܽ */
    public final Object f40973;

    /* JADX INFO: renamed from: ᩳ */
    public volatile Handler f40974;

    public C1466() {
        super(1);
        this.f40973 = new Object();
        this.f40972 = Executors.newFixedThreadPool(4, new ThreadFactoryC1011());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32924(Runnable runnable) {
        if (this.f40974 == null) {
            synchronized (this.f40973) {
                if (this.f40974 == null) {
                    this.f40974 = m32923(Looper.getMainLooper());
                }
            }
        }
        this.f40974.post(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Handler m32923(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1501.m34351(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
