package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩹۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes.dex */
public final class C22292 {
    public static volatile Choreographer choreographer;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Handler m50013(Looper looper) throws IllegalAccessException, InvocationTargetException {
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
        Object objM43235;
        try {
            objM43235 = new C15235(m50013(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM43235 = C18642.m43235(th);
        }
        if (objM43235 instanceof C2414) {
            objM43235 = null;
        }
    }
}
