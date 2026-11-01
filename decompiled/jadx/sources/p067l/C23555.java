package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩹۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes.dex */
public final class C23555 {
    public static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: ֫ */
    public static final Handler m52343(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (objInvoke != null) {
                return (Handler) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    static {
        Object objM45501;
        try {
            objM45501 = new C16848(m52343(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM45501 = C20086.m45501(th);
        }
        if (objM45501 instanceof C4663) {
            objM45501 = null;
        }
    }
}
