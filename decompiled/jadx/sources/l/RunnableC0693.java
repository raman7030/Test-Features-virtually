package l;

import android.app.Application;

/* JADX INFO: renamed from: l.֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0693 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f2632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1399 f2633;

    public RunnableC0693(Application application, C1399 c1399) {
        this.f2632 = application;
        this.f2633 = c1399;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2632.unregisterActivityLifecycleCallbacks(this.f2633);
    }
}
