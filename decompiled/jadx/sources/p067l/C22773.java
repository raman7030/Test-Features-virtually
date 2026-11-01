package p067l;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: l.᩸ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C22773 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m50955(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C13045.m29867(activity, "activity");
        C13045.m29867(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
