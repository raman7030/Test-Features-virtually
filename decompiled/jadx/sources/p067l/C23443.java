package p067l;

import android.app.Activity;

/* JADX INFO: renamed from: l.᩹ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes.dex */
public final class C23443 extends C23463 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5338 f74666;

    public C23443(C5338 c5338) {
        this.f74666 = c5338;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C13045.m29867(activity, "activity");
        this.f74666.m11554();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C13045.m29867(activity, "activity");
        this.f74666.m11555();
    }
}
