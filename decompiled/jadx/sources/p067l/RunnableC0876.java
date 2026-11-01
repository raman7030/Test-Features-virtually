package p067l;

import android.app.Application;

/* JADX INFO: renamed from: l.֡᩹ */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0876 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Application f5405;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0911 f5406;

    public RunnableC0876(Application application, C0911 c0911) {
        this.f5405 = application;
        this.f5406 = c0911;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5405.unregisterActivityLifecycleCallbacks(this.f5406);
    }
}
