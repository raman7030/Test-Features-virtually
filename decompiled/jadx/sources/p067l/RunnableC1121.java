package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚ᩹ */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1121 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f20251;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20252;

    public RunnableC1121(Object obj, Object obj2) {
        this.f20251 = obj;
        this.f20252 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C1261.f28783;
            Object obj = this.f20252;
            Object obj2 = this.f20251;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C1261.f28784.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
