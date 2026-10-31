package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes4.dex */
public final class C12583 extends AbstractC2143 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f37944;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f37945;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile Handler f37946;

    public C12583() {
        super(1);
        this.f37945 = new Object();
        this.f37944 = Executors.newFixedThreadPool(4, new ThreadFactoryC3411());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30847(Runnable runnable) {
        if (this.f37946 == null) {
            synchronized (this.f37945) {
                if (this.f37946 == null) {
                    this.f37946 = m30846(Looper.getMainLooper());
                }
            }
        }
        this.f37946.post(runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Handler m30846(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C13288.m32250(looper);
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
