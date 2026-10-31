package l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩹ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 31IH */
/* JADX INFO: loaded from: classes.dex */
public class C22196 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C11233.m27805(activity, "activity");
        C11233.m27805(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C11233.m27805(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C11233.m27805(activity, "activity");
    }
}
